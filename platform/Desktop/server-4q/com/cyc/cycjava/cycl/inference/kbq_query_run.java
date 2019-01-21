package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
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
import com.cyc.cycjava.cycl.mt_relevance_macros;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_variables;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.kb_cleanup;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.special_variable_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kbq_query_run extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.kbq_query_run";
    public static final String myFingerPrint = "643959a39fba5e8cf36fdec4832d1d5e3030bd7713073b508e83afa764e60d6b";
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1121L)
    private static SubLSymbol $kct_set_runstate$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1300L)
    private static SubLSymbol $kct_runstate$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1406L)
    private static SubLSymbol $kbq_runstate$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1798L)
    private static SubLSymbol $kbq_old_cfasl_common_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 2278L)
    private static SubLSymbol $kbq_new_cfasl_common_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5247L)
    private static SubLSymbol $kbq_cfasl_common_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5485L)
    private static SubLSymbol $kbq_cfasl_common_symbols_simple$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5880L)
    private static SubLSymbol $kct_old_cfasl_common_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 6070L)
    private static SubLSymbol $kct_cfasl_common_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 6262L)
    public static SubLSymbol $kbq_outlier_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 6345L)
    public static SubLSymbol $kbq_internal_time_units_per_second$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31780L)
    public static SubLSymbol $kbq_run_number$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 45460L)
    private static SubLSymbol $kct_test_metric_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 58379L)
    public static SubLSymbol $kbq_default_outlier_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62968L)
    private static SubLSymbol $kbq_test_collection_to_query_set_query$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 70948L)
    private static SubLSymbol $last_query_set_run$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 80343L)
    private static SubLSymbol $last_test_set_run$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92182L)
    private static SubLSymbol $runstate_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92319L)
    private static SubLSymbol $runstate_index$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLSymbol $dtp_kbq_runstate$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLSymbol $dtp_kct_runstate$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLSymbol $dtp_kct_set_runstate$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 115587L)
    public static SubLSymbol $query_set_run_file_extension$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 137553L)
    private static SubLSymbol $kbq_filter_query_set_run_to_queries$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 138518L)
    private static SubLSymbol $kct_filter_test_set_run_to_tests$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140106L)
    private static SubLSymbol $cached_all_instances_among_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 159645L)
    public static SubLSymbol $kbq_summary_statistics$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 180960L)
    public static SubLSymbol $kbq_progress_stream$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 181173L)
    public static SubLSymbol $kbq_benchmark_outlier_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 196676L)
    private static SubLSymbol $kbq_test_query_set$;
    private static final SubLSymbol $kw0$SUCCESS;
    private static final SubLSymbol $kw1$FAILURE;
    private static final SubLSymbol $kw2$ERROR;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$KBQ_CFASL_COMMON_SYMBOLS;
    private static final SubLSymbol $sym6$DO_QUERY_SET_RUN;
    private static final SubLSymbol $sym7$KBQ_CFASL_COMMON_SYMBOLS_SIMPLE;
    private static final SubLSymbol $sym8$VECTOR;
    private static final SubLList $list9;
    private static final SubLInteger $int10$600;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$CLET;
    private static final SubLSymbol $sym13$_KBQ_INTERNAL_TIME_UNITS_PER_SECOND_;
    private static final SubLSymbol $sym14$KBQ_QUERY_SET_RUN_INTERNAL_TIME_UNITS_PER_SECOND;
    private static final SubLSymbol $kw15$RESULT;
    private static final SubLSymbol $kw16$QUERY;
    private static final SubLSymbol $kw17$MISSING;
    private static final SubLSymbol $kw18$ANSWER_COUNT;
    private static final SubLSymbol $kw19$HYPOTHESIZATION_TIME;
    private static final SubLSymbol $kw20$TOTAL_TIME;
    private static final SubLSymbol $kw21$COMPLETE_TOTAL_TIME;
    private static final SubLSymbol $kw22$TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw23$TIME_TO_LAST_ANSWER;
    private static final SubLSymbol $kw24$COMPLETE_TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw25$COMPLETE_TIME_TO_LAST_ANSWER;
    private static final SubLSymbol $kw26$TOTAL_STEPS;
    private static final SubLSymbol $kw27$STEPS_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw28$STEPS_TO_LAST_ANSWER;
    private static final SubLSymbol $kw29$HALT_REASON;
    private static final SubLSymbol $kw30$ORIGIN;
    private static final SubLSymbol $kw31$WASTED_TIME_AFTER_LAST_ANSWER;
    private static final SubLSymbol $kw32$LATENCY_IMPROVEMENT_FROM_ITERATIVITY;
    private static final SubLSymbol $kw33$SETUP_TIME;
    private static final SubLSymbol $kw34$TIME_PER_ANSWER;
    private static final SubLSymbol $kw35$COMPLETE_TIME_PER_ANSWER;
    private static final SubLSymbol $kw36$ANSWERABILITY_TIME;
    private static final SubLSymbol $kw37$ANSWERABILITY_STEPS;
    private static final SubLSymbol $kw38$NEW_ROOT_RELATIVE_TOTAL_TIMES;
    private static final SubLSymbol $kw39$NEW_ROOT_TIMES;
    private static final SubLSymbol $kw40$NEW_ROOT_RELATIVE_ANSWER_TIMES;
    private static final SubLSymbol $kw41$ANSWER_TIMES;
    private static final SubLSymbol $kw42$ESTIMATED_EXHAUSTIVE_PROBLEM_COUNT;
    private static final SubLSymbol $kw43$ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT;
    private static final SubLSymbol $kw44$NEW_ROOT_COUNT;
    private static final SubLSymbol $kw45$PROBLEM_COUNT;
    private static final SubLSymbol $kw46$ESTIMATED_EXHAUSTIVE_BYTE_COUNT;
    private static final SubLSymbol $sym47$_MEDIAN_BYTES_PER_PROBLEM_;
    private static final SubLSymbol $kw48$TOTAL_NEW_ROOT_INITIAL_REMOVAL_FANOUT;
    private static final SubLSymbol $kw49$NEW_ROOT_INITIAL_REMOVAL_FANOUTS;
    private static final SubLSymbol $kw50$QUERY_FUNCALL;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$QUERY_RUN_FUNCALL;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLString $str56$unrecognized_KBQ_property_spec__s;
    private static final SubLString $str57$Use_the__with_kbq_query_set_run_m;
    private static final SubLString $str58$Use_the__with_kbq_query_set_run__;
    private static final SubLList $list59;
    private static final SubLSymbol $kw60$TAUTOLOGY;
    private static final SubLInteger $int61$1000;
    private static final SubLInteger $int62$100;
    private static final SubLFloat $float63$0_1;
    private static final SubLFloat $float64$0_01;
    private static final SubLSymbol $kw65$INFERENCE_PROOF_SPEC;
    private static final SubLObject $const66$sentenceTruth;
    private static final SubLInteger $int67$_2;
    private static final SubLSymbol $sym68$FIRST;
    private static final SubLSymbol $kw69$TEST;
    private static final SubLSymbol $kw70$STATUS;
    private static final SubLSymbol $kw71$QUERY_RUN;
    private static final SubLSymbol $kw72$MACHINE;
    private static final SubLSymbol $kw73$DATE;
    private static final SubLSymbol $kw74$BOGOMIPS;
    private static final SubLSymbol $kw75$INTERNAL_TIME_UNITS_PER_SECOND;
    private static final SubLSymbol $kw76$PATCH_LEVEL;
    private static final SubLSymbol $kw77$COMMENT;
    private static final SubLSymbol $kw78$QUERY_RUNS;
    private static final SubLSymbol $sym79$KBQ_QUERY_SET_RUN_QUERY_RUNS;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $kw82$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw83$TEST_RUNS;
    private static final SubLSymbol $sym84$INVALID_FORT_;
    private static final SubLSymbol $sym85$KBQ_RUNNABLE_;
    private static final SubLSymbol $sym86$_;
    private static final SubLSymbol $sym87$SAFE__;
    private static final SubLString $str88$_s_____s__;
    private static final SubLSymbol $sym89$KBQ_QUERY_RUN_QUERY;
    private static final SubLSymbol $kw90$MEDIAN_HYPOTHESIZATION_TIME;
    private static final SubLSymbol $kw91$MEDIAN_TOTAL_TIME;
    private static final SubLSymbol $kw92$MEDIAN_TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw93$MEDIAN_TIME_TO_LAST_ANSWER;
    private static final SubLString $str94$what_s_the_median_for__s;
    private static final SubLSymbol $kw95$MEAN_HYPOTHESIZATION_TIME;
    private static final SubLSymbol $kw96$MEAN_TOTAL_TIME;
    private static final SubLSymbol $kw97$MEAN_TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw98$MEAN_TIME_TO_LAST_ANSWER;
    private static final SubLString $str99$what_s_the_mean_for__s;
    private static final SubLSymbol $sym100$KBQ_QUERY_RUN_HYPOTHESIZATION_TIME;
    private static final SubLSymbol $sym101$KBQ_QUERY_RUN_TOTAL_TIME;
    private static final SubLSymbol $sym102$KBQ_QUERY_RUN_TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $sym103$KBQ_QUERY_RUN_TIME_TO_LAST_ANSWER;
    private static final SubLSymbol $sym104$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME;
    private static final SubLSymbol $sym105$KBQ_QUERY_RUN_COMPLETE_TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $sym106$KBQ_QUERY_RUN_COMPLETE_TIME_TO_LAST_ANSWER;
    private static final SubLSymbol $sym107$KBQ_QUERY_RUN_ANSWER_COUNT;
    private static final SubLString $str108$unknown_metric__s;
    private static final SubLSymbol $sym109$KCT_TEST_SET_RUN_TEST_RUNS;
    private static final SubLSymbol $sym110$KCT_TEST_RUN_TEST;
    private static final SubLSymbol $sym111$KBQ_QUERY_SPEC_P;
    private static final SubLSymbol $sym112$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym113$QUERY_METRIC_P;
    private static final SubLSymbol $sym114$NUMBERP;
    private static final SubLSymbol $sym115$PROPERTY_LIST_P;
    private static final SubLSymbol $sym116$QUERY_PROPERTY_P;
    private static final SubLSymbol $kw117$CONTINUABLE_;
    private static final SubLSymbol $kw118$METRICS;
    private static final SubLSymbol $kw119$BROWSABLE_;
    private static final SubLString $str120$___A____;
    private static final SubLSymbol $kw121$RUNNING;
    private static final SubLSymbol $sym122$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw123$ABORT_KBQ_RUN_QUERY;
    private static final SubLString $str124$Abort_KBQ_run_query;
    private static final SubLString $str125$KBQ_explicitly_aborted;
    private static final SubLSymbol $kw126$NEVER_RUN;
    private static final SubLSymbol $kw127$FINISHED;
    private static final SubLString $str128$Outlier_____S;
    private static final SubLSymbol $kw129$OUTLIER_ABORT;
    private static final SubLSymbol $kw130$OUTLIER_TIMEOUT;
    private static final SubLString $str131$Unable_to_compute_any_inference_m;
    private static final SubLString $str132$Unable_to_compute_all_desired_inf;
    private static final SubLString $str133$KBQ_harness_error_for__A____A;
    private static final SubLString $str134$Error_____S___A;
    private static final SubLSymbol $kw135$NOT_A_QUERY;
    private static final SubLString $str136$Avoided__due_to__S______S;
    private static final SubLSymbol $kw137$OVERRIDING_QUERY_PROPERTIES;
    private static final SubLSymbol $kw138$SUBSTITUTIONS;
    private static final SubLSymbol $kw139$ABORT;
    private static final SubLSymbol $sym140$ENSURE_SKSI_MODULES_NEEDED;
    private static final SubLObject $const141$sksiModulesNeeded;
    private static final SubLObject $const142$testFollowupTestFormula_All;
    private static final SubLObject $const143$testFollowupTestFormula_Some;
    private static final SubLObject $const144$testFollowupTestFormula_None;
    private static final SubLSymbol $sym145$KCT_TEST_SPEC_P;
    private static final SubLSymbol $kw146$RETURN;
    private static final SubLSymbol $kw147$BINDINGS_AND_HYPOTHETICAL_BINDINGS;
    private static final SubLObject $const148$TestMetric_HaltReason;
    private static final SubLString $str149$Unsupported_metric__S;
    private static final SubLList $list150;
    private static final SubLSymbol $kw151$PROBLEM_STORE;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_;
    private static final SubLString $str154$Expected_;
    private static final SubLString $str155$__but_got_;
    private static final SubLString $str156$Expected_exactly_;
    private static final SubLString $str157$_binding_sets__but_got_;
    private static final SubLString $str158$_;
    private static final SubLString $str159$Expected_at_least_;
    private static final SubLString $str160$Expected_no_more_than_;
    private static final SubLString $str161$;
    private static final SubLString $str162$These_expected_bindings_were_miss;
    private static final SubLString $str163$These_unwanted_bindings_were_retu;
    private static final SubLString $str164$____;
    private static final SubLSymbol $kw165$OUTPUT;
    private static final SubLSymbol $sym166$FILE_VALID_FOR_WRITING_P;
    private static final SubLSymbol $kw167$ABORT_KBQ_RUN_QUERY_SET;
    private static final SubLString $str168$Abort_KBQ_run_query_set;
    private static final SubLString $str169$KBQ_running_query_set;
    private static final SubLString $str170$cdolist;
    private static final SubLString $str171$_________________________________;
    private static final SubLString $str172$______A____;
    private static final SubLString $str173$Running_;
    private static final SubLString $str174$Unrunnable_query____S;
    private static final SubLSymbol $sym175$JANUS_OPERATION_P;
    private static final SubLObject $const176$EverythingPSC;
    private static final SubLSymbol $sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED;
    private static final SubLSymbol $sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED;
    private static final SubLObject $const179$isa;
    private static final SubLObject $const180$elementOf;
    private static final SubLSymbol $sym181$_OBJ;
    private static final SubLList $list182;
    private static final SubLList $list183;
    private static final SubLSymbol $kw184$TEST_COLLECTION;
    private static final SubLSymbol $kw185$SET;
    private static final SubLList $list186;
    private static final SubLSymbol $kw187$PROGRESS_MESSAGE;
    private static final SubLString $str188$Processing_KB_Queries;
    private static final SubLSymbol $kw189$SKIP_KBQ;
    private static final SubLString $str190$Skip_KBQ__S;
    private static final SubLSymbol $kw191$ADDITIONAL_ARGS;
    private static final SubLSymbol $sym192$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list193;
    private static final SubLSymbol $sym194$CSETQ;
    private static final SubLString $str195$_A;
    private static final SubLList $list196;
    private static final SubLSymbol $kw197$ABORT_KCT_RUN_TEST_SET;
    private static final SubLString $str198$Abort_KCT_run_test_set;
    private static final SubLString $str199$KCT_running_test_set;
    private static final SubLString $str200$__Running__s__;
    private static final SubLString $str201$Unrunnable_test____S;
    private static final SubLList $list202;
    private static final SubLList $list203;
    private static final SubLSymbol $kw204$QUERY_SPEC_SET;
    private static final SubLSymbol $kw205$FILENAME;
    private static final SubLSymbol $kw206$ANALYSIS_FILENAME;
    private static final SubLSymbol $kw207$KEEPALIVE_FILENAME;
    private static final SubLList $list208;
    private static final SubLSymbol $sym209$_KBQ_DEFAULT_OUTLIER_TIMEOUT_;
    private static final SubLSymbol $kw210$INCREMENTAL;
    private static final SubLSymbol $kw211$INCLUDE_RESULTS;
    private static final SubLSymbol $kw212$RANDOMIZE;
    private static final SubLSymbol $kw213$SKIP;
    private static final SubLSymbol $kw214$COUNT;
    private static final SubLSymbol $kw215$IF_FILE_EXISTS;
    private static final SubLSymbol $kw216$OVERWRITE;
    private static final SubLSymbol $sym217$RUN_KBQ_EXPERIMENT_INTERNAL;
    private static final SubLSymbol $sym218$LIST;
    private static final SubLSymbol $sym219$_LAST_QUERY_SET_RUN_;
    private static final SubLSymbol $sym220$RUN_KBQ_EXPERIMENT;
    private static final SubLSymbol $sym221$KBQ_IF_FILE_EXISTS_HANDLING_P;
    private static final SubLString $str222$__run_starting_at__A;
    private static final SubLString $str223$__run_ended_at__A;
    private static final SubLString $str224$__elapsed_time____A;
    private static final SubLString $str225$Unable_to_open__S;
    private static final SubLSymbol $sym226$KBQ_ERRORING_QUERY_RUN_;
    private static final SubLList $list227;
    private static final SubLSymbol $kw228$AUGMENT;
    private static final SubLSymbol $kw229$APPEND;
    private static final SubLSymbol $kw230$RERUN_ERRORS;
    private static final SubLSymbol $kw231$AUGMENT_OR_RERUN_ERRORS;
    private static final SubLString $str232$unexpected_if_file_exists__s;
    private static final SubLString $str233$_rerun_errors_;
    private static final SubLList $list234;
    private static final SubLList $list235;
    private static final SubLSymbol $kw236$TEST_SPEC_SET;
    private static final SubLSymbol $kw237$OVERRIDING_METRICS;
    private static final SubLSymbol $sym238$_KBQ_OUTLIER_TIMEOUT_;
    private static final SubLSymbol $kw239$EXPOSE_RUNSTATE;
    private static final SubLSymbol $sym240$RUN_KCT_EXPERIMENT_INTERNAL;
    private static final SubLSymbol $sym241$_LAST_TEST_SET_RUN_;
    private static final SubLSymbol $sym242$RUN_KCT_EXPERIMENT;
    private static final SubLSymbol $sym243$KB_CONTENT_REGRESSION_TEST_;
    private static final SubLString $str244$Filtered_to___KBContentRegression;
    private static final SubLString $str245$All_tests___;
    private static final SubLString $str246$__Just_the_regression_tests___;
    private static final SubLInteger $int247$212;
    private static final SubLString $str248$__Failing_tests_;
    private static final SubLString $str249$____Failing_regression_tests___a_;
    private static final SubLString $str250$____Unrunnable_tests_;
    private static final SubLString $str251$_a;
    private static final SubLString $str252$___a_is_unrunnable_for_an_unknown;
    private static final SubLString $str253$_csv;
    private static final SubLString $str254$__Writing_csv_to___A__;
    private static final SubLString $str255$Comment___A__;
    private static final SubLString $str256$Date___A__;
    private static final SubLString $str257$_A__A__A__A__A__A__A___;
    private static final SubLSymbol $sym258$KCT_ERRORING_TEST_RUN_;
    private static final SubLSymbol $sym259$KCT_TEST_RUNNABLE_;
    private static final SubLSymbol $sym260$_RUNSTATE_ISG_;
    private static final SubLSymbol $sym261$_RUNSTATE_INDEX_;
    private static final SubLString $str262$Unknown_runstate_type___A;
    private static final SubLString $str263$Runstate_has_no_status___A;
    private static final SubLString $str264$Explanations_aren_t_yet_implement;
    private static final SubLString $str265$No_inference_defined_for_this_run;
    private static final SubLString $str266$No_start_defined_for_this_runstat;
    private static final SubLString $str267$No_end_defined_for_this_runstate_;
    private static final SubLSymbol $sym268$KEYWORDP;
    private static final SubLSymbol $sym269$KBQ_RUNSTATE;
    private static final SubLSymbol $sym270$KBQ_RUNSTATE_P;
    private static final SubLList $list271;
    private static final SubLList $list272;
    private static final SubLList $list273;
    private static final SubLList $list274;
    private static final SubLSymbol $sym275$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym276$KBQ_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list277;
    private static final SubLSymbol $sym278$KBQR_ID;
    private static final SubLSymbol $sym279$_CSETF_KBQR_ID;
    private static final SubLSymbol $sym280$KBQR_LOCK;
    private static final SubLSymbol $sym281$_CSETF_KBQR_LOCK;
    private static final SubLSymbol $sym282$KBQR_QUERY_SPEC;
    private static final SubLSymbol $sym283$_CSETF_KBQR_QUERY_SPEC;
    private static final SubLSymbol $sym284$KBQR_INFERENCE;
    private static final SubLSymbol $sym285$_CSETF_KBQR_INFERENCE;
    private static final SubLSymbol $sym286$KBQR_RESULT;
    private static final SubLSymbol $sym287$_CSETF_KBQR_RESULT;
    private static final SubLSymbol $sym288$KBQR_TEST_RUNSTATE;
    private static final SubLSymbol $sym289$_CSETF_KBQR_TEST_RUNSTATE;
    private static final SubLSymbol $sym290$KBQR_RUN_STATUS;
    private static final SubLSymbol $sym291$_CSETF_KBQR_RUN_STATUS;
    private static final SubLSymbol $kw292$ID;
    private static final SubLSymbol $kw293$LOCK;
    private static final SubLSymbol $kw294$QUERY_SPEC;
    private static final SubLSymbol $kw295$INFERENCE;
    private static final SubLSymbol $kw296$TEST_RUNSTATE;
    private static final SubLSymbol $kw297$RUN_STATUS;
    private static final SubLString $str298$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw299$BEGIN;
    private static final SubLSymbol $sym300$MAKE_KBQ_RUNSTATE;
    private static final SubLSymbol $kw301$SLOT;
    private static final SubLSymbol $kw302$END;
    private static final SubLSymbol $sym303$VISIT_DEFSTRUCT_OBJECT_KBQ_RUNSTATE_METHOD;
    private static final SubLSymbol $sym304$KCT_RUNSTATE_P;
    private static final SubLString $str305$KBQ_Runstate_Lock;
    private static final SubLSymbol $kw306$NONE;
    private static final SubLSymbol $sym307$INFERENCE_P;
    private static final SubLSymbol $sym308$KBQ_QUERY_RUN_P;
    private static final SubLSymbol $sym309$KCT_RUNSTATE;
    private static final SubLList $list310;
    private static final SubLList $list311;
    private static final SubLList $list312;
    private static final SubLList $list313;
    private static final SubLSymbol $sym314$KCT_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list315;
    private static final SubLSymbol $sym316$KCTR_ID;
    private static final SubLSymbol $sym317$_CSETF_KCTR_ID;
    private static final SubLSymbol $sym318$KCTR_LOCK;
    private static final SubLSymbol $sym319$_CSETF_KCTR_LOCK;
    private static final SubLSymbol $sym320$KCTR_TEST_SPEC;
    private static final SubLSymbol $sym321$_CSETF_KCTR_TEST_SPEC;
    private static final SubLSymbol $sym322$KCTR_RESULT;
    private static final SubLSymbol $sym323$_CSETF_KCTR_RESULT;
    private static final SubLSymbol $sym324$KCTR_QUERY_RUNSTATE;
    private static final SubLSymbol $sym325$_CSETF_KCTR_QUERY_RUNSTATE;
    private static final SubLSymbol $sym326$KCTR_TEST_SET_RUNSTATE;
    private static final SubLSymbol $sym327$_CSETF_KCTR_TEST_SET_RUNSTATE;
    private static final SubLSymbol $sym328$KCTR_RUN_STATUS;
    private static final SubLSymbol $sym329$_CSETF_KCTR_RUN_STATUS;
    private static final SubLSymbol $sym330$KCTR_START;
    private static final SubLSymbol $sym331$_CSETF_KCTR_START;
    private static final SubLSymbol $sym332$KCTR_END;
    private static final SubLSymbol $sym333$_CSETF_KCTR_END;
    private static final SubLSymbol $kw334$TEST_SPEC;
    private static final SubLSymbol $kw335$QUERY_RUNSTATE;
    private static final SubLSymbol $kw336$TEST_SET_RUNSTATE;
    private static final SubLSymbol $kw337$START;
    private static final SubLSymbol $sym338$MAKE_KCT_RUNSTATE;
    private static final SubLSymbol $sym339$VISIT_DEFSTRUCT_OBJECT_KCT_RUNSTATE_METHOD;
    private static final SubLSymbol $sym340$KCT_SET_RUNSTATE_P;
    private static final SubLString $str341$KCT_Runstate_Lock;
    private static final SubLSymbol $sym342$KCT_TEST_RUN_P;
    private static final SubLSymbol $sym343$KCT_SET_RUNSTATE;
    private static final SubLList $list344;
    private static final SubLList $list345;
    private static final SubLList $list346;
    private static final SubLList $list347;
    private static final SubLSymbol $sym348$KCT_SET_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list349;
    private static final SubLSymbol $sym350$KCTSR_ID;
    private static final SubLSymbol $sym351$_CSETF_KCTSR_ID;
    private static final SubLSymbol $sym352$KCTSR_LOCK;
    private static final SubLSymbol $sym353$_CSETF_KCTSR_LOCK;
    private static final SubLSymbol $sym354$KCTSR_TEST_SET;
    private static final SubLSymbol $sym355$_CSETF_KCTSR_TEST_SET;
    private static final SubLSymbol $sym356$KCTSR_RESULT;
    private static final SubLSymbol $sym357$_CSETF_KCTSR_RESULT;
    private static final SubLSymbol $sym358$KCTSR_TEST_RUNSTATES;
    private static final SubLSymbol $sym359$_CSETF_KCTSR_TEST_RUNSTATES;
    private static final SubLSymbol $sym360$KCTSR_RUN_STATUS;
    private static final SubLSymbol $sym361$_CSETF_KCTSR_RUN_STATUS;
    private static final SubLSymbol $sym362$KCTSR_START;
    private static final SubLSymbol $sym363$_CSETF_KCTSR_START;
    private static final SubLSymbol $sym364$KCTSR_END;
    private static final SubLSymbol $sym365$_CSETF_KCTSR_END;
    private static final SubLSymbol $kw366$TEST_SET;
    private static final SubLSymbol $kw367$TEST_RUNSTATES;
    private static final SubLSymbol $sym368$MAKE_KCT_SET_RUNSTATE;
    private static final SubLSymbol $sym369$VISIT_DEFSTRUCT_OBJECT_KCT_SET_RUNSTATE_METHOD;
    private static final SubLSymbol $sym370$KCT_TEST_COLLECTION_P;
    private static final SubLString $str371$KCT_Set_Runstate_Lock;
    private static final SubLSymbol $sym372$KCT_ERROR_RESULT_P;
    private static final SubLSymbol $sym373$KCT_TEST_RUN_STATUS;
    private static final SubLSymbol $sym374$KCT_FAILURE_RESULT_P;
    private static final SubLSymbol $sym375$KCT_TEST_SET_RUN_P;
    private static final SubLList $list376;
    private static final SubLList $list377;
    private static final SubLSymbol $kw378$DONE;
    private static final SubLSymbol $sym379$STREAM;
    private static final SubLSymbol $sym380$DONE_VAR;
    private static final SubLSymbol $sym381$PROGN;
    private static final SubLSymbol $sym382$CHECK_TYPE;
    private static final SubLList $list383;
    private static final SubLSymbol $sym384$WITH_PRIVATE_BINARY_FILE;
    private static final SubLList $list385;
    private static final SubLSymbol $sym386$WITH_CFASL_COMMON_SYMBOLS_SIMPLE;
    private static final SubLList $list387;
    private static final SubLSymbol $sym388$WITH_NEW_CFASL_INPUT_GUID_STRING_RESOURCE;
    private static final SubLSymbol $sym389$KBQ_LOAD_QUERY_SET_RUN_INT;
    private static final SubLSymbol $sym390$CSOME;
    private static final SubLSymbol $sym391$WHILE;
    private static final SubLSymbol $sym392$CNOT;
    private static final SubLSymbol $sym393$KBQ_LOAD_QUERY_RUN_INT;
    private static final SubLSymbol $sym394$PWHEN;
    private static final SubLList $list395;
    private static final SubLList $list396;
    private static final SubLSymbol $sym397$PUNLESS;
    private static final SubLSymbol $sym398$KBQ_NCLEAN_QUERY_RUN;
    private static final SubLList $list399;
    private static final SubLSymbol $sym400$QUERY_SET_RUN;
    private static final SubLSymbol $sym401$IGNORE;
    private static final SubLSymbol $sym402$STRINGP;
    private static final SubLSymbol $kw403$INPUT;
    private static final SubLSymbol $kw404$EOF;
    private static final SubLString $str405$dwimming__s_to_NIL;
    private static final SubLString $str406$_cfasl;
    private static final SubLString $str407$_no_results;
    private static final SubLString $str408$Expected_a__a_file__got__s;
    private static final SubLString $str409$answerable_sub_run_of_____A;
    private static final SubLSymbol $sym410$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym411$KCT_TEST_RUN_ANSWER_COUNT;
    private static final SubLString $str412$succeeding_sub_run_of_____A;
    private static final SubLSymbol $sym413$KCT_SUCCESS_RESULT_P;
    private static final SubLString $str414$unanswerable_sub_run_of__;
    private static final SubLSymbol $sym415$ZEROP;
    private static final SubLString $str416$failing_sub_run_of_____A;
    private static final SubLObject $const417$CommonSenseTest;
    private static final SubLObject $const418$KBContentRegressionTest;
    private static final SubLString $str419$_s_sub_run_of_____A;
    private static final SubLList $list420;
    private static final SubLSymbol $sym421$NOT_EQL;
    private static final SubLString $str422$filtered_to_queries;
    private static final SubLSymbol $sym423$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_NOT_LAMBDA;
    private static final SubLSymbol $sym424$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_LAMBDA;
    private static final SubLString $str425$filtered_to_tests;
    private static final SubLSymbol $sym426$KCT_FILTER_TEST_SET_RUN_TO_TESTS_NOT_LAMBDA;
    private static final SubLSymbol $sym427$KCT_FILTER_TEST_SET_RUN_TO_TESTS_LAMBDA;
    private static final SubLSymbol $sym428$CACHED_ALL_INSTANCES_AMONG;
    private static final SubLSymbol $sym429$_CACHED_ALL_INSTANCES_AMONG_CACHING_STATE_;
    private static final SubLSymbol $sym430$CLEAR_CACHED_ALL_INSTANCES_AMONG;
    private static final SubLList $list431;
    private static final SubLList $list432;
    private static final SubLSymbol $sym433$KCT_SUCCEEDING_TEST_SET_RUN;
    private static final SubLSymbol $sym434$_;
    private static final SubLSymbol $sym435$FOURTH;
    private static final SubLSymbol $sym436$SECOND;
    private static final SubLList $list437;
    private static final SubLList $list438;
    private static final SubLSymbol $kw439$MISSING_FROM_1;
    private static final SubLSymbol $kw440$MISSING_FROM_2;
    private static final SubLSymbol $kw441$ANSWERABLE_2;
    private static final SubLSymbol $kw442$MORE_ANSWERS_2;
    private static final SubLSymbol $kw443$DIFFERENT_ANSWERS;
    private static final SubLSymbol $kw444$MORE_ANSWERS_1;
    private static final SubLSymbol $kw445$ANSWERABLE_1;
    private static final SubLString $str446$_S_and__S_are_different_queries;
    private static final SubLString $str447$_S_has_no_result;
    private static final SubLString $str448$query_set_runs_contained_differen;
    private static final SubLString $str449$_s__s__s__s__s__;
    private static final SubLString $str450$_s__s__s__;
    private static final SubLSymbol $kw451$CHANGE;
    private static final SubLSymbol $kw452$BECAME_SUCCESS;
    private static final SubLSymbol $kw453$BECAME_FAILURE;
    private static final SubLString $str454$unexpected_change__S;
    private static final SubLString $str455$_S_and__S_are_different_tests;
    private static final SubLString $str456$_S_has_no_status;
    private static final SubLSymbol $kw457$UNDEFINED;
    private static final SubLList $list458;
    private static final SubLList $list459;
    private static final SubLSymbol $kw460$NEITHER;
    private static final SubLSymbol $kw461$INCREASE;
    private static final SubLString $str462$empty__;
    private static final SubLSymbol $kw463$TOTAL;
    private static final SubLSymbol $kw464$TOTAL_ANSWERABLE;
    private static final SubLSymbol $kw465$TOTAL_UNANSWERABLE;
    private static final SubLSymbol $kw466$TOTAL_ERROR;
    private static final SubLSymbol $kw467$TOTAL_LUMPY;
    private static final SubLSymbol $kw468$SUM_ANSWER_COUNT;
    private static final SubLSymbol $kw469$MEAN_ANSWER_COUNT;
    private static final SubLSymbol $kw470$MEDIAN_ANSWER_COUNT;
    private static final SubLSymbol $kw471$SUM_HYPOTHESIZATION_TIME;
    private static final SubLSymbol $kw472$STDEV_HYPOTHESIZATION_TIME;
    private static final SubLSymbol $kw473$SUM_TOTAL_TIME;
    private static final SubLSymbol $kw474$STDEV_TOTAL_TIME;
    private static final SubLSymbol $kw475$SUM_COMPLETE_TOTAL_TIME;
    private static final SubLSymbol $kw476$MEAN_COMPLETE_TOTAL_TIME;
    private static final SubLSymbol $kw477$MEDIAN_COMPLETE_TOTAL_TIME;
    private static final SubLSymbol $kw478$STDEV_COMPLETE_TOTAL_TIME;
    private static final SubLSymbol $kw479$SUM_TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw480$STDEV_TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw481$SUM_COMPLETE_TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw482$MEAN_COMPLETE_TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw483$MEDIAN_COMPLETE_TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw484$STDEV_COMPLETE_TIME_TO_FIRST_ANSWER;
    private static final SubLSymbol $kw485$SUM_ANSWERABILITY_TIME;
    private static final SubLSymbol $kw486$MEAN_ANSWERABILITY_TIME;
    private static final SubLSymbol $kw487$MEDIAN_ANSWERABILITY_TIME;
    private static final SubLSymbol $kw488$STDEV_ANSWERABILITY_TIME;
    private static final SubLSymbol $kw489$SUM_TIME_TO_LAST_ANSWER;
    private static final SubLSymbol $kw490$STDEV_TIME_TO_LAST_ANSWER;
    private static final SubLSymbol $kw491$MEDIAN_COMPLETE_TIME_PER_ANSWER;
    private static final SubLString $str492$ignoring_metric__S;
    private static final SubLSymbol $kw493$MEDIAN_TIME_PER_ANSWER;
    private static final SubLSymbol $kw494$TOTAL_SUCCESS;
    private static final SubLSymbol $kw495$TOTAL_FAILURE;
    private static final SubLSymbol $kw496$PERCENT_SUCCESS;
    private static final SubLSymbol $kw497$PERCENT_FAILURE;
    private static final SubLSymbol $sym498$KCT_TEST_RUN_QUERY_RUN;
    private static final SubLList $list499;
    private static final SubLString $str500$_0;
    private static final SubLSymbol $sym501$BOUND_SYMBOL_P;
    private static final SubLString $str502$____Answerability_analysis____;
    private static final SubLString $str503$Total_____________s__s__s__;
    private static final SubLString $str504$____Basic_analysis____;
    private static final SubLString $str505$____Mutually_Answerable____;
    private static final SubLString $str506$____Answerable____;
    private static final SubLString $str507$____Unanswerable____;
    private static final SubLList $list508;
    private static final SubLString $str509$Mutually_Answerable_;
    private static final SubLSymbol $sym510$KBQ_LUMPY_QUERY_RUN_;
    private static final SubLString $str511$Unable_to_compute_any_metrics;
    private static final SubLSymbol $sym512$DOUBLE_FLOAT;
    private static final SubLString $str513$_____Total_Tests____4D;
    private static final SubLString $str514$______Successes_____4D___S___;
    private static final SubLString $str515$______Failures______4D___S___;
    private static final SubLString $str516$_______Test_Set_Metrics__;
    private static final SubLString $str517$____Test____S;
    private static final SubLString $str518$__Status____S;
    private static final SubLString $str519$__Halt_Reason____S;
    private static final SubLString $str520$___S__S;
    private static final SubLSymbol $sym521$KBQ_QUERY_RUN_HALT_REASON;
    private static final SubLList $list522;
    private static final SubLInteger $int523$3600;
    private static final SubLString $str524$Running_kbq_benchmark__kbq_benchm;
    private static final SubLString $str525$_;
    private static final SubLSymbol $sym526$KBQ_BENCHMARK_RUN;
    private static final SubLString $str527$kbq_benchmark__kbq_benchmark_repo;
    private static final SubLSymbol $sym528$FORT_P;
    private static final SubLSymbol $sym529$LISTP;
    private static final SubLString $str530$_______A______;
    private static final SubLString $str531$____overriding_query_properties__;
    private static final SubLString $str532$Tests_run_in_System__A_KB__A__;
    private static final SubLObject $const533$TheSet;
    private static final SubLSymbol $sym534$KCT_QUERY_SPECIFICATION;
    private static final SubLList $list535;
    private static final SubLString $str536$__ANS__TTFS____TTFA__SQ____SKSI__;
    private static final SubLString $str537$_________________________________;
    private static final SubLSymbol $kw538$SKSI_QUERY_START_TIMES;
    private static final SubLSymbol $kw539$SKSI_QUERY_TOTAL_TIME;
    private static final SubLString $str540$_5D__5_1F__7_1F_4D__7_1F__7_1F__7;
    private static final SubLSymbol $kw541$EXHAUST_TOTAL;
    private static final SubLString $str542$___A_;
    private static final SubLString $str543$_5D__5_1F__7_1F_4D__7_1F__7_1F__7;
    private static final SubLList $list544;
    private static final SubLInteger $int545$60;
    private static final SubLString $str546$_15A___5D__5_1F__7_1F_4D__7_1F__7;
    private static final SubLString $str547$Running__A_queries_using__proof_s;
    private static final SubLSymbol $kw548$PROOF_SPEC;
    private static final SubLSymbol $kw549$COMPUTE_ANSWER_JUSTIFICATIONS_;
    private static final SubLString $str550$______Test___A;
    private static final SubLString $str551$__Query___A;
    private static final SubLObject $const552$True;
    private static final SubLString $str553$____Answer___A__A____A;
    private static final SubLString $str554$__Justification__;
    private static final SubLSymbol $sym555$UNKNOWN_SENTENCE_SUPPORT_P;
    private static final SubLSymbol $sym556$SUPPORT_MT;
    private static final SubLSymbol $sym557$GENERALITY_ESTIMATE_;
    private static final SubLObject $const558$UniversalVocabularyMt;
    private static final SubLString $str559$___Mt___A;
    private static final SubLObject $const560$BaseKB;
    private static final SubLObject $const561$unknownSentence;
    private static final SubLSymbol $sym562$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const563$SKSIContentTest;
    private static final SubLSymbol $kw564$BREADTH;
    private static final SubLSymbol $kw565$QUEUE;
    private static final SubLSymbol $kw566$STACK;
    private static final SubLSymbol $sym567$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLString $str568$_A_is_not_a__A;
    private static final SubLSymbol $sym569$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw570$CERROR;
    private static final SubLString $str571$continue_anyway;
    private static final SubLSymbol $kw572$WARN;
    private static final SubLString $str573$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str574$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str575$attempting_to_bind_direction_link;
    private static final SubLList $list576;
    private static final SubLString $str577$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $kw578$GAF;
    private static final SubLString $str579$_a___s____;
    private static final SubLString $str580$__________Overview___________All_;
    private static final SubLString $str581$__All___SKSIContentTests_marked_a;
    private static final SubLString $str582$____SKSIContentTests_using_source;
    private static final SubLString $str583$____SKSIContentTests_marked_as___;
    private static final SubLString $str584$______________________Breakdown_b;
    private static final SubLString $str585$_a__;
    private static final SubLString $str586$_;
    private static final SubLString $str587$______SKSIContentTests_that_use__;
    private static final SubLString $str588$____SKSIContentTests_marked_as___;
    private static final SubLString $str589$__Failure_analysis_______;
    private static final SubLList $list590;
    private static final SubLSymbol $sym591$COMPUTE_NEW_ROOT_RELATIVE_ANSWER_TIMES;
    private static final SubLSymbol $kw592$OWNER;
    private static final SubLSymbol $kw593$CLASSES;
    private static final SubLSymbol $kw594$KB;
    private static final SubLSymbol $kw595$TINY;
    private static final SubLSymbol $kw596$WORKING_;
    private static final SubLList $list597;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1513L)
    public static SubLObject kct_success_result_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)kbq_query_run.$kw0$SUCCESS, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1650L)
    public static SubLObject kct_failure_result_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)kbq_query_run.$kw1$FAILURE, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1726L)
    public static SubLObject kct_error_result_p(final SubLObject v_object) {
        return Equality.eq((SubLObject)kbq_query_run.$kw2$ERROR, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5371L)
    public static SubLObject kbq_cfasl_common_symbols() {
        return kbq_query_run.$kbq_cfasl_common_symbols$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5596L)
    public static SubLObject kbq_cfasl_common_symbols_simple() {
        if (!kbq_query_run.$kbq_cfasl_common_symbols_simple$.getGlobalValue().isVector()) {
            kbq_query_run.$kbq_cfasl_common_symbols_simple$.setGlobalValue(Functions.apply((SubLObject)kbq_query_run.$sym8$VECTOR, kbq_cfasl_common_symbols()));
        }
        return kbq_query_run.$kbq_cfasl_common_symbols_simple$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 6573L)
    public static SubLObject with_kbq_query_set_run(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_set_run = (SubLObject)kbq_query_run.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list11);
        query_set_run = current.first();
        current = current.rest();
        if (kbq_query_run.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)kbq_query_run.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym13$_KBQ_INTERNAL_TIME_UNITS_PER_SECOND_, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym14$KBQ_QUERY_SET_RUN_INTERNAL_TIME_UNITS_PER_SECOND, query_set_run))), ConsesLow.append(body, (SubLObject)kbq_query_run.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbq_query_run.$list11);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 6887L)
    public static SubLObject kbq_query_run_p(final SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7026L)
    public static SubLObject kbq_discard_query_run_result(final SubLObject query_run) {
        return kbq_discard_query_run_properties(query_run, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw15$RESULT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7169L)
    public static SubLObject kbq_discard_query_run_properties(final SubLObject query_run, final SubLObject v_properties) {
        SubLObject new_query_run = conses_high.copy_list(query_run);
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = (SubLObject)kbq_query_run.NIL;
        property = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            new_query_run = conses_high.remf(new_query_run, property);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return new_query_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7470L)
    public static SubLObject kbq_query_run_query(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw16$QUERY, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7566L)
    public static SubLObject kbq_query_run_result(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw15$RESULT, (SubLObject)kbq_query_run.$kw17$MISSING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7661L)
    public static SubLObject kbq_extract_query_run_metric_value(final SubLObject query_run, final SubLObject metric, SubLObject v_default) {
        if (v_default == kbq_query_run.UNPROVIDED) {
            v_default = (SubLObject)kbq_query_run.NIL;
        }
        return conses_high.getf(query_run, metric, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7790L)
    public static SubLObject kbq_query_run_answerableP(final SubLObject query_run) {
        return subl_promotions.positive_integer_p(kbq_query_run_answer_count(query_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7916L)
    public static SubLObject kbq_query_run_unanswerableP(final SubLObject query_run) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbq_query_run.NIL == kbq_query_run_answerableP(query_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8029L)
    public static SubLObject kbq_query_run_answer_count(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8127L)
    public static SubLObject kbq_query_run_hypothesization_time(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw19$HYPOTHESIZATION_TIME, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8241L)
    public static SubLObject kbq_query_run_total_time(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8335L)
    public static SubLObject kbq_query_run_complete_total_time(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8447L)
    public static SubLObject kbq_query_run_time_to_first_answer(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8561L)
    public static SubLObject kbq_query_run_time_to_last_answer(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8671L)
    public static SubLObject kbq_query_run_complete_time_to_first_answer(final SubLObject query_run) {
        return kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw24$COMPLETE_TIME_TO_FIRST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8827L)
    public static SubLObject kbq_query_run_complete_time_to_last_answer(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw25$COMPLETE_TIME_TO_LAST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8955L)
    public static SubLObject kbq_query_run_total_steps(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw26$TOTAL_STEPS, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 9051L)
    public static SubLObject kbq_query_run_steps_to_first_answer(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw27$STEPS_TO_FIRST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 9167L)
    public static SubLObject kbq_query_run_steps_to_last_answer(final SubLObject query_run) {
        return conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw28$STEPS_TO_LAST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 9281L)
    public static SubLObject kbq_extract_query_run_property_value(final SubLObject query_run, final SubLObject query_property) {
        final SubLObject query = kbq_query_run_query(query_run);
        return kb_query.kbq_query_property_value_from_keyword(query, query_property);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 9498L)
    public static SubLObject kbq_query_run_property_value(final SubLObject query_run, final SubLObject property, SubLObject v_default) {
        if (v_default == kbq_query_run.UNPROVIDED) {
            v_default = (SubLObject)kbq_query_run.NIL;
        }
        if (kbq_query_run.$kw21$COMPLETE_TOTAL_TIME == property) {
            final SubLObject complete_total_time = kbq_extract_query_run_metric_value(query_run, property, (SubLObject)kbq_query_run.UNPROVIDED);
            return (kbq_query_run.NIL != complete_total_time) ? complete_total_time : kbq_extract_query_run_metric_value(query_run, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, v_default);
        }
        if (kbq_query_run.NIL != inference_datastructures_enumerated_types.query_metric_p(property) || kbq_query_run.$kw29$HALT_REASON == property || kbq_query_run.$kw16$QUERY == property || kbq_query_run.$kw30$ORIGIN == property) {
            return kbq_extract_query_run_metric_value(query_run, property, v_default);
        }
        if (kbq_query_run.NIL != inference_datastructures_enumerated_types.query_property_p(property)) {
            return kbq_extract_query_run_property_value(query_run, property);
        }
        if (property == kbq_query_run.$kw31$WASTED_TIME_AFTER_LAST_ANSWER) {
            return list_utilities.safe_difference(kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, v_default), kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER, v_default));
        }
        if (property == kbq_query_run.$kw32$LATENCY_IMPROVEMENT_FROM_ITERATIVITY) {
            return list_utilities.safe_difference(kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, v_default), kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER, v_default));
        }
        if (property == kbq_query_run.$kw33$SETUP_TIME) {
            return list_utilities.safe_difference(kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME, v_default), kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, v_default));
        }
        if (property == kbq_query_run.$kw24$COMPLETE_TIME_TO_FIRST_ANSWER) {
            return list_utilities.safe_sum(kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw33$SETUP_TIME, v_default), kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER, v_default));
        }
        if (property == kbq_query_run.$kw25$COMPLETE_TIME_TO_LAST_ANSWER) {
            return list_utilities.safe_sum(kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw33$SETUP_TIME, v_default), kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER, v_default));
        }
        if (property == kbq_query_run.$kw34$TIME_PER_ANSWER) {
            return list_utilities.safe_quotient(kbq_query_run_total_time(query_run), kbq_query_run_answer_count(query_run));
        }
        if (property == kbq_query_run.$kw35$COMPLETE_TIME_PER_ANSWER) {
            return list_utilities.safe_quotient(kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME, v_default), kbq_query_run_answer_count(query_run));
        }
        if (property == kbq_query_run.$kw36$ANSWERABILITY_TIME) {
            final SubLObject good_time = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw24$COMPLETE_TIME_TO_FIRST_ANSWER, (SubLObject)kbq_query_run.NIL);
            if (good_time.isNumber()) {
                return good_time;
            }
            return kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME, v_default);
        }
        else if (property == kbq_query_run.$kw37$ANSWERABILITY_STEPS) {
            final SubLObject good_steps = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw27$STEPS_TO_FIRST_ANSWER, (SubLObject)kbq_query_run.NIL);
            if (good_steps.isNumber()) {
                return good_steps;
            }
            return kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw26$TOTAL_STEPS, v_default);
        }
        else {
            if (property == kbq_query_run.$kw38$NEW_ROOT_RELATIVE_TOTAL_TIMES) {
                final SubLObject new_root_times = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw39$NEW_ROOT_TIMES, (SubLObject)kbq_query_run.NIL);
                final SubLObject inference_end_time = kbq_seconds_to_internal_real_time(kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, (SubLObject)kbq_query_run.UNPROVIDED));
                final SubLObject new_root_deltas = number_utilities.compute_deltas(new_root_times, inference_end_time);
                return new_root_deltas;
            }
            if (property == kbq_query_run.$kw40$NEW_ROOT_RELATIVE_ANSWER_TIMES) {
                final SubLObject new_root_times = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw39$NEW_ROOT_TIMES, (SubLObject)kbq_query_run.NIL);
                final SubLObject answer_times = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw41$ANSWER_TIMES, (SubLObject)kbq_query_run.NIL);
                return compute_new_root_relative_answer_times(new_root_times, answer_times);
            }
            if (property == kbq_query_run.$kw42$ESTIMATED_EXHAUSTIVE_PROBLEM_COUNT) {
                final SubLObject estimated_exhaustive_new_root_count = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw43$ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT, (SubLObject)kbq_query_run.NIL);
                final SubLObject new_root_count = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw44$NEW_ROOT_COUNT, (SubLObject)kbq_query_run.NIL);
                final SubLObject problem_count = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw45$PROBLEM_COUNT, (SubLObject)kbq_query_run.NIL);
                final SubLObject problems_per_new_root = list_utilities.safe_quotient(problem_count, new_root_count);
                return list_utilities.safe_product(problems_per_new_root, estimated_exhaustive_new_root_count);
            }
            if (property == kbq_query_run.$kw46$ESTIMATED_EXHAUSTIVE_BYTE_COUNT) {
                final SubLObject estimated_exhaustive_problem_count = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw42$ESTIMATED_EXHAUSTIVE_PROBLEM_COUNT, (SubLObject)kbq_query_run.NIL);
                return list_utilities.safe_product((SubLObject)((kbq_query_run.NIL != special_variable_state.bound_symbol_p((SubLObject)kbq_query_run.$sym47$_MEDIAN_BYTES_PER_PROBLEM_)) ? Symbols.symbol_value((SubLObject)kbq_query_run.$sym47$_MEDIAN_BYTES_PER_PROBLEM_) : kbq_query_run.NIL), estimated_exhaustive_problem_count);
            }
            if (property == kbq_query_run.$kw48$TOTAL_NEW_ROOT_INITIAL_REMOVAL_FANOUT) {
                final SubLObject fanouts = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw49$NEW_ROOT_INITIAL_REMOVAL_FANOUTS, (SubLObject)kbq_query_run.UNPROVIDED);
                final SubLObject total_fanout = number_utilities.summation((SubLObject)(fanouts.isList() ? fanouts : kbq_query_run.NIL));
                return total_fanout;
            }
            if (property.isCons() && kbq_query_run.$kw50$QUERY_FUNCALL == property.first()) {
                if (kbq_query_run.NIL != list_utilities.doubletonP(property)) {
                    SubLObject query_funcall = (SubLObject)kbq_query_run.NIL;
                    SubLObject func = (SubLObject)kbq_query_run.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(property, property, (SubLObject)kbq_query_run.$list51);
                    query_funcall = property.first();
                    SubLObject current = property.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, (SubLObject)kbq_query_run.$list51);
                    func = current.first();
                    current = current.rest();
                    if (kbq_query_run.NIL == current) {
                        final SubLObject query = kbq_query_run_query(query_run);
                        return Functions.funcall(func, query);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(property, (SubLObject)kbq_query_run.$list51);
                }
                else {
                    SubLObject query_funcall = (SubLObject)kbq_query_run.NIL;
                    SubLObject func = (SubLObject)kbq_query_run.NIL;
                    SubLObject arg1 = (SubLObject)kbq_query_run.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(property, property, (SubLObject)kbq_query_run.$list52);
                    query_funcall = property.first();
                    SubLObject current = property.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, (SubLObject)kbq_query_run.$list52);
                    func = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, (SubLObject)kbq_query_run.$list52);
                    arg1 = current.first();
                    current = current.rest();
                    if (kbq_query_run.NIL == current) {
                        final SubLObject query2 = kbq_query_run_query(query_run);
                        return Functions.funcall(func, query2, arg1);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(property, (SubLObject)kbq_query_run.$list52);
                }
            }
            else {
                if (!property.isCons() || kbq_query_run.$kw53$QUERY_RUN_FUNCALL != property.first()) {
                    return Errors.error((SubLObject)kbq_query_run.$str56$unrecognized_KBQ_property_spec__s, property);
                }
                if (kbq_query_run.NIL != list_utilities.doubletonP(property)) {
                    SubLObject query_run_funcall = (SubLObject)kbq_query_run.NIL;
                    SubLObject func = (SubLObject)kbq_query_run.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(property, property, (SubLObject)kbq_query_run.$list54);
                    query_run_funcall = property.first();
                    SubLObject current = property.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, (SubLObject)kbq_query_run.$list54);
                    func = current.first();
                    current = current.rest();
                    if (kbq_query_run.NIL == current) {
                        return Functions.funcall(func, query_run);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(property, (SubLObject)kbq_query_run.$list54);
                }
                else {
                    SubLObject query_run_funcall = (SubLObject)kbq_query_run.NIL;
                    SubLObject func = (SubLObject)kbq_query_run.NIL;
                    SubLObject arg1 = (SubLObject)kbq_query_run.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(property, property, (SubLObject)kbq_query_run.$list55);
                    query_run_funcall = property.first();
                    SubLObject current = property.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, (SubLObject)kbq_query_run.$list55);
                    func = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, (SubLObject)kbq_query_run.$list55);
                    arg1 = current.first();
                    current = current.rest();
                    if (kbq_query_run.NIL == current) {
                        return Functions.funcall(func, query_run, arg1);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(property, (SubLObject)kbq_query_run.$list55);
                }
            }
            return (SubLObject)kbq_query_run.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 14979L)
    public static SubLObject kbq_internal_real_time_to_seconds(final SubLObject internal_real_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbq_query_run.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kbq_query_run.NIL == kbq_query_run.$kbq_internal_time_units_per_second$.getDynamicValue(thread)) {
            Errors.error((SubLObject)kbq_query_run.$str57$Use_the__with_kbq_query_set_run_m);
        }
        return Numbers.divide(internal_real_time, kbq_query_run.$kbq_internal_time_units_per_second$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 15274L)
    public static SubLObject kbq_seconds_to_internal_real_time(final SubLObject seconds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbq_query_run.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kbq_query_run.NIL == kbq_query_run.$kbq_internal_time_units_per_second$.getDynamicValue(thread)) {
            Errors.error((SubLObject)kbq_query_run.$str58$Use_the__with_kbq_query_set_run__);
        }
        return Numbers.multiply(seconds, kbq_query_run.$kbq_internal_time_units_per_second$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 15548L)
    public static SubLObject kbq_query_run_halt_reason(final SubLObject query_run) {
        return kbq_extract_query_run_metric_value(query_run, (SubLObject)kbq_query_run.$kw29$HALT_REASON, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 15674L)
    public static SubLObject kbq_query_run_timed_outP(final SubLObject query_run) {
        final SubLObject halt_reason = kbq_query_run_halt_reason(query_run);
        return subl_promotions.memberP(halt_reason, (SubLObject)kbq_query_run.$list59, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 15856L)
    public static SubLObject kbq_query_run_tautologyP(final SubLObject query_run) {
        final SubLObject halt_reason = kbq_query_run_halt_reason(query_run);
        return Equality.eq((SubLObject)kbq_query_run.$kw60$TAUTOLOGY, halt_reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16014L)
    public static SubLObject kbq_query_run_total_time_less_than_1000_secondsP(final SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.$int61$1000);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16156L)
    public static SubLObject kbq_query_run_total_time_less_than_100_secondsP(final SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.$int62$100);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16294L)
    public static SubLObject kbq_query_run_total_time_less_than_10_secondsP(final SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.TEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16430L)
    public static SubLObject kbq_query_run_total_time_less_than_a_secondP(final SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16563L)
    public static SubLObject kbq_query_run_total_time_less_than_a_tenth_of_a_secondP(final SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.$float63$0_1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16708L)
    public static SubLObject kbq_query_run_total_time_less_than_a_hundredth_of_a_secondP(final SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.$float64$0_01);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16858L)
    public static SubLObject kbq_query_run_total_time_more_than_1000_secondsP(final SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.$int61$1000);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16998L)
    public static SubLObject kbq_query_run_total_time_more_than_100_secondsP(final SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.$int62$100);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17136L)
    public static SubLObject kbq_query_run_total_time_more_than_10_secondsP(final SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.TEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17272L)
    public static SubLObject kbq_query_run_total_time_more_than_a_secondP(final SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17405L)
    public static SubLObject kbq_query_run_total_time_more_than_a_tenth_of_a_secondP(final SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.$float63$0_1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17550L)
    public static SubLObject kbq_query_run_total_time_more_than_a_hundredth_of_a_secondP(final SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), (SubLObject)kbq_query_run.$float64$0_01);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17700L)
    public static SubLObject kbq_query_run_more_than_1000_answersP(final SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_answer_count(query_run), (SubLObject)kbq_query_run.$int61$1000);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17831L)
    public static SubLObject kbq_query_run_inference_proof_spec_cons_count(final SubLObject query_run) {
        return list_utilities.cons_count(kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw65$INFERENCE_PROOF_SPEC, (SubLObject)kbq_query_run.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17993L)
    public static SubLObject kbq_sentence_truth_query_runP(final SubLObject query_run) {
        final SubLObject query = kbq_query_run_query(query_run);
        final SubLObject sentence = kb_query.kbq_sentences(query).first();
        return el_utilities.el_formula_with_operator_p(sentence, kbq_query_run.$const66$sentenceTruth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 18213L)
    public static SubLObject compute_new_root_relative_answer_times(final SubLObject new_root_times, SubLObject answer_times) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        answer_times = list_utilities.sort_L(conses_high.copy_list(answer_times), (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kbq_query_run.EQ), (SubLObject)kbq_query_run.UNPROVIDED);
        SubLObject previous_new_root_index = (SubLObject)kbq_query_run.$int67$_2;
        SubLObject previous_new_root_time = (SubLObject)kbq_query_run.MINUS_ONE_INTEGER;
        SubLObject next_new_root_index = (SubLObject)kbq_query_run.MINUS_ONE_INTEGER;
        SubLObject next_new_root_time = (SubLObject)kbq_query_run.MINUS_ONE_INTEGER;
        SubLObject rest_new_root_times = new_root_times;
        SubLObject cdolist_list_var = answer_times;
        SubLObject answer_time = (SubLObject)kbq_query_run.NIL;
        answer_time = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            while (kbq_query_run.NIL != next_new_root_time && answer_time.numG(next_new_root_time)) {
                previous_new_root_index = Numbers.add(previous_new_root_index, (SubLObject)kbq_query_run.ONE_INTEGER);
                next_new_root_index = Numbers.add(next_new_root_index, (SubLObject)kbq_query_run.ONE_INTEGER);
                previous_new_root_time = next_new_root_time;
                next_new_root_time = rest_new_root_times.first();
                rest_new_root_times = rest_new_root_times.rest();
            }
            final SubLObject relative_answer_time = Numbers.subtract(answer_time, previous_new_root_time);
            dictionary_utilities.dictionary_push(dict, previous_new_root_index, relative_answer_time);
            cdolist_list_var = cdolist_list_var.rest();
            answer_time = cdolist_list_var.first();
        }
        SubLObject result = (SubLObject)kbq_query_run.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); kbq_query_run.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject new_root_number = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject relative_answer_times = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(new_root_number, Sequences.nreverse(relative_answer_times)), result);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return list_utilities.sort_L(result, Symbols.symbol_function((SubLObject)kbq_query_run.$sym68$FIRST));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19402L)
    public static SubLObject kct_test_run_p(final SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19537L)
    public static SubLObject kct_make_test_run(final SubLObject test, final SubLObject status, final SubLObject query_run) {
        return (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw69$TEST, test, (SubLObject)kbq_query_run.$kw70$STATUS, status, (SubLObject)kbq_query_run.$kw71$QUERY_RUN, query_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19702L)
    public static SubLObject kct_test_run_test(final SubLObject test_run) {
        return conses_high.getf(test_run, (SubLObject)kbq_query_run.$kw69$TEST, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19793L)
    public static SubLObject kct_test_run_query_run(final SubLObject test_run) {
        return conses_high.getf(test_run, (SubLObject)kbq_query_run.$kw71$QUERY_RUN, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19882L)
    public static SubLObject kct_test_run_status(final SubLObject test_run) {
        return conses_high.getf(test_run, (SubLObject)kbq_query_run.$kw70$STATUS, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19965L)
    public static SubLObject kct_test_run_answer_count(final SubLObject test_run) {
        return kbq_query_run_answer_count(kct_test_run_query_run(test_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 20107L)
    public static SubLObject kbq_query_set_run_p(final SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 20321L)
    public static SubLObject kbq_make_query_set_run(final SubLObject query_runs, SubLObject comment) {
        if (comment == kbq_query_run.UNPROVIDED) {
            comment = (SubLObject)kbq_query_run.NIL;
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { kbq_query_run.$kw72$MACHINE, Environment.get_network_name((SubLObject)kbq_query_run.UNPROVIDED), kbq_query_run.$kw73$DATE, Time.get_universal_time(), kbq_query_run.$kw74$BOGOMIPS, misc_utilities.machine_bogomips(), kbq_query_run.$kw75$INTERNAL_TIME_UNITS_PER_SECOND, time_high.$internal_time_units_per_second$.getGlobalValue(), kbq_query_run.$kw76$PATCH_LEVEL, system_info.cyc_revision_numbers(), kbq_query_run.$kw77$COMMENT, comment, kbq_query_run.$kw78$QUERY_RUNS, query_runs });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 20707L)
    public static SubLObject kbq_nmerge_query_set_runs(final SubLObject query_set_runs, SubLObject comment) {
        if (comment == kbq_query_run.UNPROVIDED) {
            comment = (SubLObject)kbq_query_run.NIL;
        }
        if (kbq_query_run.NIL == query_set_runs) {
            return (SubLObject)kbq_query_run.NIL;
        }
        final SubLObject first_query_set_run = query_set_runs.first();
        final SubLObject all_query_runs = Mapping.mapcan(Symbols.symbol_function((SubLObject)kbq_query_run.$sym79$KBQ_QUERY_SET_RUN_QUERY_RUNS), query_set_runs, kbq_query_run.EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject merged_query_set_run = first_query_set_run;
        merged_query_set_run = conses_high.putf(merged_query_set_run, (SubLObject)kbq_query_run.$kw78$QUERY_RUNS, all_query_runs);
        if (kbq_query_run.NIL != comment) {
            merged_query_set_run = conses_high.putf(merged_query_set_run, (SubLObject)kbq_query_run.$kw77$COMMENT, comment);
        }
        return merged_query_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 21519L)
    public static SubLObject kbq_discard_query_set_run_results(final SubLObject query_set_run) {
        return kbq_discard_query_set_run_properties(query_set_run, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw15$RESULT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 21745L)
    public static SubLObject kbq_discard_query_set_run_properties(final SubLObject query_set_run, final SubLObject v_properties) {
        SubLObject new_query_set_run = conses_high.copy_list(query_set_run);
        final SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject new_query_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject new_query_run = kbq_discard_query_run_properties(query_run, v_properties);
            new_query_runs = (SubLObject)ConsesLow.cons(new_query_run, new_query_runs);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        new_query_set_run = conses_high.putf(new_query_set_run, (SubLObject)kbq_query_run.$kw78$QUERY_RUNS, new_query_runs);
        return new_query_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 22335L)
    public static SubLObject kbq_make_query_set_run_from_test_set_run(final SubLObject test_set_run) {
        SubLObject query_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject allow_other_keys_p = (SubLObject)kbq_query_run.NIL;
        SubLObject rest = test_set_run;
        SubLObject bad = (SubLObject)kbq_query_run.NIL;
        SubLObject current_$1 = (SubLObject)kbq_query_run.NIL;
        while (kbq_query_run.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, test_set_run, (SubLObject)kbq_query_run.$list80);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, test_set_run, (SubLObject)kbq_query_run.$list80);
            if (kbq_query_run.NIL == conses_high.member(current_$1, (SubLObject)kbq_query_run.$list81, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                bad = (SubLObject)kbq_query_run.T;
            }
            if (current_$1 == kbq_query_run.$kw82$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kbq_query_run.NIL != bad && kbq_query_run.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(test_set_run, (SubLObject)kbq_query_run.$list80);
        }
        final SubLObject machine_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw72$MACHINE, test_set_run);
        final SubLObject machine = (SubLObject)((kbq_query_run.NIL != machine_tail) ? conses_high.cadr(machine_tail) : kbq_query_run.NIL);
        final SubLObject date_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw73$DATE, test_set_run);
        final SubLObject date = (SubLObject)((kbq_query_run.NIL != date_tail) ? conses_high.cadr(date_tail) : kbq_query_run.NIL);
        final SubLObject bogomips_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw74$BOGOMIPS, test_set_run);
        final SubLObject bogomips = (SubLObject)((kbq_query_run.NIL != bogomips_tail) ? conses_high.cadr(bogomips_tail) : kbq_query_run.NIL);
        final SubLObject internal_time_units_per_second_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw75$INTERNAL_TIME_UNITS_PER_SECOND, test_set_run);
        final SubLObject internal_time_units_per_second = (SubLObject)((kbq_query_run.NIL != internal_time_units_per_second_tail) ? conses_high.cadr(internal_time_units_per_second_tail) : kbq_query_run.NIL);
        final SubLObject patch_level_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw76$PATCH_LEVEL, test_set_run);
        final SubLObject patch_level = (SubLObject)((kbq_query_run.NIL != patch_level_tail) ? conses_high.cadr(patch_level_tail) : kbq_query_run.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw77$COMMENT, test_set_run);
        final SubLObject comment = (SubLObject)((kbq_query_run.NIL != comment_tail) ? conses_high.cadr(comment_tail) : kbq_query_run.NIL);
        final SubLObject test_runs_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw83$TEST_RUNS, test_set_run);
        SubLObject cdolist_list_var;
        final SubLObject test_runs = cdolist_list_var = (SubLObject)((kbq_query_run.NIL != test_runs_tail) ? conses_high.cadr(test_runs_tail) : kbq_query_run.NIL);
        SubLObject test_run = (SubLObject)kbq_query_run.NIL;
        test_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query_run = kct_test_run_query_run(test_run);
            query_runs = (SubLObject)ConsesLow.cons(query_run, query_runs);
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        query_runs = Sequences.nreverse(query_runs);
        return (SubLObject)ConsesLow.list(new SubLObject[] { kbq_query_run.$kw72$MACHINE, machine, kbq_query_run.$kw73$DATE, date, kbq_query_run.$kw74$BOGOMIPS, bogomips, kbq_query_run.$kw75$INTERNAL_TIME_UNITS_PER_SECOND, internal_time_units_per_second, kbq_query_run.$kw76$PATCH_LEVEL, patch_level, kbq_query_run.$kw77$COMMENT, comment, kbq_query_run.$kw78$QUERY_RUNS, query_runs });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23084L)
    public static SubLObject kbq_query_set_run_property_value(final SubLObject query_set_run, final SubLObject property, SubLObject v_default) {
        if (v_default == kbq_query_run.UNPROVIDED) {
            v_default = (SubLObject)kbq_query_run.NIL;
        }
        return conses_high.getf(query_set_run, property, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23235L)
    public static SubLObject kbq_query_set_run_comment(final SubLObject query_set_run) {
        return kbq_query_set_run_property_value(query_set_run, (SubLObject)kbq_query_run.$kw77$COMMENT, (SubLObject)kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23364L)
    public static SubLObject kbq_query_set_run_query_runs(final SubLObject query_set_run) {
        return kbq_query_set_run_property_value(query_set_run, (SubLObject)kbq_query_run.$kw78$QUERY_RUNS, (SubLObject)kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23499L)
    public static SubLObject kbq_query_set_run_patch_level(final SubLObject query_set_run) {
        return kbq_query_set_run_property_value(query_set_run, (SubLObject)kbq_query_run.$kw76$PATCH_LEVEL, (SubLObject)kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23636L)
    public static SubLObject kbq_query_set_run_internal_time_units_per_second(final SubLObject query_set_run) {
        return kbq_query_set_run_property_value(query_set_run, (SubLObject)kbq_query_run.$kw75$INTERNAL_TIME_UNITS_PER_SECOND, (SubLObject)kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23811L)
    public static SubLObject kbq_query_set_run_put_query_run_property(SubLObject query_set_run, final SubLObject property, final SubLObject value) {
        final SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject new_query_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            new_query_runs = (SubLObject)ConsesLow.cons(conses_high.putf(conses_high.copy_list(query_run), property, value), new_query_runs);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        new_query_runs = Sequences.nreverse(new_query_runs);
        query_set_run = conses_high.putf(conses_high.copy_list(query_set_run), (SubLObject)kbq_query_run.$kw78$QUERY_RUNS, new_query_runs);
        return query_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 24342L)
    public static SubLObject kbq_extract_query_property_values(final SubLObject query_set_run, final SubLObject query_property) {
        final SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject property_values = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject property_value = kbq_extract_query_run_property_value(query_run, query_property);
            property_values = (SubLObject)ConsesLow.cons(property_value, property_values);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(property_values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 24740L)
    public static SubLObject kbq_extract_metric_values(final SubLObject query_set_run, final SubLObject metric, SubLObject v_default) {
        if (v_default == kbq_query_run.UNPROVIDED) {
            v_default = (SubLObject)kbq_query_run.NIL;
        }
        final SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject metric_values = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject metric_value = kbq_extract_query_run_metric_value(query_run, metric, v_default);
            metric_values = (SubLObject)ConsesLow.cons(metric_value, metric_values);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(metric_values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 25114L)
    public static SubLObject kbq_extract_property_values(final SubLObject query_set_run, final SubLObject property, SubLObject v_default) {
        if (v_default == kbq_query_run.UNPROVIDED) {
            v_default = (SubLObject)kbq_query_run.NIL;
        }
        final SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject property_values = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject property_value = kbq_query_run_property_value(query_run, property, v_default);
            property_values = (SubLObject)ConsesLow.cons(property_value, property_values);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(property_values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 25731L)
    public static SubLObject kbq_query_set_run_queries(final SubLObject query_set_run) {
        return kbq_extract_property_values(query_set_run, (SubLObject)kbq_query_run.$kw16$QUERY, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 25851L)
    public static SubLObject kbq_query_set_run_query_count(final SubLObject query_set_run) {
        return Sequences.length(kbq_query_set_run_query_runs(query_set_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 25979L)
    public static SubLObject kbq_query_set_run_valid_queries(final SubLObject query_set_run) {
        return Sequences.delete_if((SubLObject)kbq_query_run.$sym84$INVALID_FORT_, kbq_query_set_run_queries(query_set_run), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 26124L)
    public static SubLObject kbq_query_set_run_runnable_queries(final SubLObject query_set_run) {
        return list_utilities.delete_if_not((SubLObject)kbq_query_run.$sym85$KBQ_RUNNABLE_, Sequences.delete_if((SubLObject)kbq_query_run.$sym84$INVALID_FORT_, kbq_query_set_run_queries(query_set_run), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 26300L)
    public static SubLObject kbq_query_set_run_remove_invalid_queries(final SubLObject query_set_run) {
        final SubLObject valid_queries = kbq_query_set_run_valid_queries(query_set_run);
        return kbq_filter_query_set_run_to_queries(query_set_run, valid_queries, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 26525L)
    public static SubLObject kbq_query_set_run_remove_unrunnable_queries(final SubLObject query_set_run) {
        final SubLObject runnable_queries = kbq_query_set_run_runnable_queries(query_set_run);
        return kbq_filter_query_set_run_to_queries(query_set_run, runnable_queries, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 26762L)
    public static SubLObject kbq_compute_pad_table(final SubLObject query_set_run) {
        final SubLObject answerable = kbq_answerable_query_set_run(query_set_run);
        final SubLObject all_answerable_times_to_first_answer = kbq_extract_metric_values(answerable, (SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject sorted_times_to_first_answer = Sort.sort(all_answerable_times_to_first_answer, Symbols.symbol_function((SubLObject)kbq_query_run.$sym86$_), (SubLObject)kbq_query_run.UNPROVIDED);
        return sorted_times_to_first_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 27109L)
    public static SubLObject kbq_queries_within_n_of_median(final SubLObject query_set_run, final SubLObject n, SubLObject metric) {
        if (metric == kbq_query_run.UNPROVIDED) {
            metric = (SubLObject)kbq_query_run.$kw20$TOTAL_TIME;
        }
        final SubLObject median_metric = kbq_median_metric(metric);
        final SubLObject mean_metric = kbq_mean_metric(metric);
        final SubLObject query_runs = Sort.sort(conses_high.copy_list(kbq_query_set_run_query_runs(query_set_run)), (SubLObject)kbq_query_run.$sym87$SAFE__, kbq_function_for_metric(metric));
        final SubLObject analysis = kbq_analyze_query_set_run(query_set_run, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject median = conses_high.getf(analysis, median_metric, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject query_run_count = Sequences.length(query_runs);
        SubLObject width = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject mean = median;
        while (mean.numLE(Numbers.multiply(n, median)) && width.numL(query_run_count)) {
            width = Numbers.add(width, (SubLObject)kbq_query_run.ONE_INTEGER);
            final SubLObject sample_query_runs = list_utilities.middle_sublist(query_runs, width);
            final SubLObject sample_analysis = kbq_analyze_query_runs(sample_query_runs, (SubLObject)ConsesLow.list(metric));
            mean = conses_high.getf(sample_analysis, mean_metric, (SubLObject)kbq_query_run.UNPROVIDED);
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str88$_s_____s__, Numbers.add((SubLObject)kbq_query_run.ONE_INTEGER, Numbers.multiply((SubLObject)kbq_query_run.TWO_INTEGER, width)), mean);
        }
        final SubLObject subset_query_runs = list_utilities.middle_sublist(query_runs, Numbers.subtract(width, (SubLObject)kbq_query_run.ONE_INTEGER));
        final SubLObject subset_queries = Mapping.mapcar((SubLObject)kbq_query_run.$sym89$KBQ_QUERY_RUN_QUERY, subset_query_runs);
        return subset_queries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 28198L)
    public static SubLObject kbq_median_metric(final SubLObject metric) {
        if (metric.eql((SubLObject)kbq_query_run.$kw19$HYPOTHESIZATION_TIME)) {
            return (SubLObject)kbq_query_run.$kw90$MEDIAN_HYPOTHESIZATION_TIME;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw20$TOTAL_TIME)) {
            return (SubLObject)kbq_query_run.$kw91$MEDIAN_TOTAL_TIME;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER)) {
            return (SubLObject)kbq_query_run.$kw92$MEDIAN_TIME_TO_FIRST_ANSWER;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER)) {
            return (SubLObject)kbq_query_run.$kw93$MEDIAN_TIME_TO_LAST_ANSWER;
        }
        Errors.error((SubLObject)kbq_query_run.$str94$what_s_the_median_for__s, metric);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 28559L)
    public static SubLObject kbq_mean_metric(final SubLObject metric) {
        if (metric.eql((SubLObject)kbq_query_run.$kw19$HYPOTHESIZATION_TIME)) {
            return (SubLObject)kbq_query_run.$kw95$MEAN_HYPOTHESIZATION_TIME;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw20$TOTAL_TIME)) {
            return (SubLObject)kbq_query_run.$kw96$MEAN_TOTAL_TIME;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER)) {
            return (SubLObject)kbq_query_run.$kw97$MEAN_TIME_TO_FIRST_ANSWER;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER)) {
            return (SubLObject)kbq_query_run.$kw98$MEAN_TIME_TO_LAST_ANSWER;
        }
        Errors.error((SubLObject)kbq_query_run.$str99$what_s_the_mean_for__s, metric);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 28908L)
    public static SubLObject kbq_function_for_metric(final SubLObject metric) {
        if (metric.eql((SubLObject)kbq_query_run.$kw19$HYPOTHESIZATION_TIME)) {
            return (SubLObject)kbq_query_run.$sym100$KBQ_QUERY_RUN_HYPOTHESIZATION_TIME;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw20$TOTAL_TIME)) {
            return (SubLObject)kbq_query_run.$sym101$KBQ_QUERY_RUN_TOTAL_TIME;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER)) {
            return (SubLObject)kbq_query_run.$sym102$KBQ_QUERY_RUN_TIME_TO_FIRST_ANSWER;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER)) {
            return (SubLObject)kbq_query_run.$sym103$KBQ_QUERY_RUN_TIME_TO_LAST_ANSWER;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME)) {
            return (SubLObject)kbq_query_run.$sym104$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw24$COMPLETE_TIME_TO_FIRST_ANSWER)) {
            return (SubLObject)kbq_query_run.$sym105$KBQ_QUERY_RUN_COMPLETE_TIME_TO_FIRST_ANSWER;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw25$COMPLETE_TIME_TO_LAST_ANSWER)) {
            return (SubLObject)kbq_query_run.$sym106$KBQ_QUERY_RUN_COMPLETE_TIME_TO_LAST_ANSWER;
        }
        if (metric.eql((SubLObject)kbq_query_run.$kw18$ANSWER_COUNT)) {
            return (SubLObject)kbq_query_run.$sym107$KBQ_QUERY_RUN_ANSWER_COUNT;
        }
        Errors.error((SubLObject)kbq_query_run.$str108$unknown_metric__s, metric);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 29613L)
    public static SubLObject kct_test_set_run_p(final SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 29764L)
    public static SubLObject kct_make_test_set_run(final SubLObject test_runs, SubLObject comment) {
        if (comment == kbq_query_run.UNPROVIDED) {
            comment = (SubLObject)kbq_query_run.NIL;
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { kbq_query_run.$kw72$MACHINE, Environment.get_network_name((SubLObject)kbq_query_run.UNPROVIDED), kbq_query_run.$kw73$DATE, Time.get_universal_time(), kbq_query_run.$kw74$BOGOMIPS, misc_utilities.machine_bogomips(), kbq_query_run.$kw75$INTERNAL_TIME_UNITS_PER_SECOND, time_high.$internal_time_units_per_second$.getGlobalValue(), kbq_query_run.$kw76$PATCH_LEVEL, system_info.cyc_revision_numbers(), kbq_query_run.$kw77$COMMENT, comment, kbq_query_run.$kw83$TEST_RUNS, test_runs });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 30145L)
    public static SubLObject kct_nmerge_test_set_runs(final SubLObject test_set_runs, SubLObject comment) {
        if (comment == kbq_query_run.UNPROVIDED) {
            comment = (SubLObject)kbq_query_run.NIL;
        }
        if (kbq_query_run.NIL == test_set_runs) {
            return (SubLObject)kbq_query_run.NIL;
        }
        final SubLObject first_test_set_run = test_set_runs.first();
        final SubLObject all_test_runs = Mapping.mapcan(Symbols.symbol_function((SubLObject)kbq_query_run.$sym109$KCT_TEST_SET_RUN_TEST_RUNS), test_set_runs, kbq_query_run.EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject merged_test_set_run = first_test_set_run;
        merged_test_set_run = conses_high.putf(merged_test_set_run, (SubLObject)kbq_query_run.$kw83$TEST_RUNS, all_test_runs);
        if (kbq_query_run.NIL != comment) {
            merged_test_set_run = conses_high.putf(merged_test_set_run, (SubLObject)kbq_query_run.$kw77$COMMENT, comment);
        }
        return merged_test_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 30934L)
    public static SubLObject kct_test_set_run_comment(final SubLObject test_set_run) {
        return conses_high.getf(test_set_run, (SubLObject)kbq_query_run.$kw77$COMMENT, (SubLObject)kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31044L)
    public static SubLObject kct_test_set_run_internal_time_units_per_second(final SubLObject test_set_run) {
        return conses_high.getf(test_set_run, (SubLObject)kbq_query_run.$kw75$INTERNAL_TIME_UNITS_PER_SECOND, (SubLObject)kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31188L)
    public static SubLObject kct_test_set_run_test_runs(final SubLObject test_set_run) {
        return conses_high.getf(test_set_run, (SubLObject)kbq_query_run.$kw83$TEST_RUNS, (SubLObject)kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31290L)
    public static SubLObject kct_test_set_run_tests(final SubLObject test_set_run) {
        return Mapping.mapcar((SubLObject)kbq_query_run.$sym110$KCT_TEST_RUN_TEST, kct_test_set_run_test_runs(test_set_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31437L)
    public static SubLObject kct_test_set_run_valid_tests(final SubLObject test_set_run) {
        return Sequences.delete_if((SubLObject)kbq_query_run.$sym84$INVALID_FORT_, kct_test_set_run_tests(test_set_run), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31571L)
    public static SubLObject kct_test_set_run_remove_invalid_tests(final SubLObject test_set_run) {
        final SubLObject valid_tests = kct_test_set_run_valid_tests(test_set_run);
        return kct_filter_test_set_run_to_tests(test_set_run, valid_tests, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31962L)
    public static SubLObject kbq_run_query(final SubLObject query_spec, SubLObject query_metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP, SubLObject substitutions) {
        if (query_metrics == kbq_query_run.UNPROVIDED) {
            query_metrics = (SubLObject)kbq_query_run.NIL;
        }
        if (outlier_timeout == kbq_query_run.UNPROVIDED) {
            outlier_timeout = (SubLObject)kbq_query_run.$int10$600;
        }
        if (overriding_query_properties == kbq_query_run.UNPROVIDED) {
            overriding_query_properties = (SubLObject)kbq_query_run.NIL;
        }
        if (include_resultP == kbq_query_run.UNPROVIDED) {
            include_resultP = (SubLObject)kbq_query_run.NIL;
        }
        if (substitutions == kbq_query_run.UNPROVIDED) {
            substitutions = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kbq_query_run.NIL != kb_query.kbq_query_spec_p(query_spec) : query_spec;
        final SubLObject list_var = query_metrics;
        assert kbq_query_run.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)kbq_query_run.NIL;
        elem = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            assert kbq_query_run.NIL != inference_datastructures_enumerated_types.query_metric_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (kbq_query_run.NIL != outlier_timeout && !kbq_query_run.assertionsDisabledInClass && kbq_query_run.NIL == Types.numberp(outlier_timeout)) {
            throw new AssertionError(outlier_timeout);
        }
        final SubLObject plist_var = overriding_query_properties;
        assert kbq_query_run.NIL != list_utilities.property_list_p(plist_var) : plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)kbq_query_run.NIL, remainder = plist_var; kbq_query_run.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert kbq_query_run.NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
        }
        leviathan.clear_problem_creation_times();
        final SubLObject v_inference_metrics = conses_high.intersection(query_metrics, inference_metrics.inference_metric_names(), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        SubLObject total_time = (SubLObject)kbq_query_run.NIL;
        SubLObject harness_error_message = (SubLObject)kbq_query_run.NIL;
        SubLObject inference = (SubLObject)kbq_query_run.NIL;
        SubLObject never_runP = (SubLObject)kbq_query_run.NIL;
        SubLObject timed_outP = (SubLObject)kbq_query_run.NIL;
        SubLObject result = (SubLObject)kbq_query_run.NIL;
        SubLObject halt_reason = (SubLObject)kbq_query_run.NIL;
        SubLObject inference_metric_values = (SubLObject)kbq_query_run.NIL;
        SubLObject query_metrics_plist = (SubLObject)kbq_query_run.NIL;
        SubLObject kbq_runstate = (SubLObject)kbq_query_run.NIL;
        overriding_query_properties = conses_high.copy_list(overriding_query_properties);
        if (kbq_query_run.NIL != control_vars.$kbq_run_query_non_continuable_enabledP$.getDynamicValue(thread)) {
            overriding_query_properties = conses_high.putf(overriding_query_properties, (SubLObject)kbq_query_run.$kw117$CONTINUABLE_, (SubLObject)kbq_query_run.NIL);
        }
        if (kbq_query_run.NIL != query_metrics) {
            overriding_query_properties = conses_high.putf(overriding_query_properties, (SubLObject)kbq_query_run.$kw118$METRICS, v_inference_metrics);
        }
        if (kbq_query_run.NIL != kct_runstate_p(kbq_query_run.$kct_runstate$.getDynamicValue(thread))) {
            kbq_runstate = new_kbq_runstate(query_spec, kbq_query_run.$kct_runstate$.getDynamicValue(thread));
            set_kctr_query_runstate(kbq_query_run.$kct_runstate$.getDynamicValue(thread), kbq_runstate);
            overriding_query_properties = conses_high.putf(overriding_query_properties, (SubLObject)kbq_query_run.$kw119$BROWSABLE_, (SubLObject)kbq_query_run.T);
        }
        if (kbq_query_run.NIL != kbq_query_run.$kbq_progress_stream$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            final SubLObject sentence = kb_query.kbq_query_arguments(query_spec, substitutions);
            final SubLObject mt = thread.secondMultipleValue();
            final SubLObject query_properties = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            format_nil.force_format(kbq_query_run.$kbq_progress_stream$.getDynamicValue(thread), (SubLObject)kbq_query_run.$str120$___A____, inference_datastructures_inference.inference_args_to_new_cyc_query_form_string(sentence, mt, query_properties), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = kbq_query_run.$kbq_runstate$.currentBinding(thread);
        try {
            kbq_query_run.$kbq_runstate$.bind(kbq_runstate, thread);
            final SubLObject already_in_a_sandboxP = sksi_macros.$within_sksi_sandboxP$.getDynamicValue(thread);
            final SubLObject state = (SubLObject)((kbq_query_run.NIL != already_in_a_sandboxP) ? kbq_query_run.NIL : sksi_sks_manager.current_sks_registration_state());
            final SubLObject _prev_bind_0_$2 = sksi_macros.$within_sksi_sandboxP$.currentBinding(thread);
            try {
                sksi_macros.$within_sksi_sandboxP$.bind((SubLObject)kbq_query_run.T, thread);
                try {
                    never_runP = (SubLObject)kbq_query_run.T;
                    SubLObject i;
                    SubLObject time_var;
                    SubLObject _prev_bind_0_$3;
                    SubLObject aborted_via_restartP;
                    SubLObject catch_var;
                    SubLObject restart_tag;
                    SubLObject dummy;
                    SubLObject _prev_bind_0_$4;
                    SubLObject inference_$5;
                    SubLObject never_runP_$6;
                    SubLObject timed_outP_$7;
                    SubLObject result_$8;
                    SubLObject halt_reason_$9;
                    SubLObject inference_metric_values_$10;
                    SubLObject aborted_via_restartP2;
                    SubLObject catch_var3;
                    SubLObject restart_tag2;
                    SubLObject dummy2;
                    SubLObject _prev_bind_0_$5;
                    SubLObject inference_$6;
                    SubLObject never_runP_$7;
                    SubLObject timed_outP_$8;
                    SubLObject result_$9;
                    SubLObject halt_reason_$10;
                    SubLObject inference_metric_values_$11;
                    for (i = (SubLObject)kbq_query_run.NIL, i = (SubLObject)kbq_query_run.ZERO_INTEGER; i.numL(kbq_query_run.$kbq_run_number$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)kbq_query_run.ONE_INTEGER)) {
                        possibly_set_kbqr_run_status(kbq_query_run.$kbq_runstate$.getDynamicValue(thread), (SubLObject)kbq_query_run.$kw121$RUNNING);
                        time_var = Time.get_internal_real_time();
                        if (kbq_query_run.NIL == control_vars.$inference_debugP$.getDynamicValue(thread)) {
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)kbq_query_run.$sym122$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        aborted_via_restartP = (SubLObject)kbq_query_run.T;
                                        catch_var = (SubLObject)kbq_query_run.NIL;
                                        try {
                                            thread.throwStack.push(kbq_query_run.$kw123$ABORT_KBQ_RUN_QUERY);
                                            restart_tag = (SubLObject)kbq_query_run.$kw123$ABORT_KBQ_RUN_QUERY;
                                            dummy = (SubLObject)kbq_query_run.NIL;
                                            _prev_bind_0_$4 = Errors.$restarts$.currentBinding(thread);
                                            try {
                                                Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(restart_tag, (SubLObject)kbq_query_run.$str124$Abort_KBQ_run_query), Errors.$restarts$.getDynamicValue(thread)), thread);
                                                try {
                                                    thread.throwStack.push(restart_tag);
                                                    if (i.eql((SubLObject)kbq_query_run.ZERO_INTEGER)) {
                                                        thread.resetMultipleValues();
                                                        inference_$5 = kbq_run_query_and_maybe_destroy(query_spec, (SubLObject)kbq_query_run.NIL, outlier_timeout, overriding_query_properties, substitutions);
                                                        never_runP_$6 = thread.secondMultipleValue();
                                                        timed_outP_$7 = thread.thirdMultipleValue();
                                                        result_$8 = thread.fourthMultipleValue();
                                                        halt_reason_$9 = thread.fifthMultipleValue();
                                                        inference_metric_values_$10 = thread.sixthMultipleValue();
                                                        thread.resetMultipleValues();
                                                        inference = inference_$5;
                                                        never_runP = never_runP_$6;
                                                        timed_outP = timed_outP_$7;
                                                        result = result_$8;
                                                        halt_reason = halt_reason_$9;
                                                        inference_metric_values = inference_metric_values_$10;
                                                    }
                                                    else {
                                                        kbq_run_query_and_maybe_destroy(query_spec, (SubLObject)kbq_query_run.T, outlier_timeout, overriding_query_properties, substitutions);
                                                    }
                                                    aborted_via_restartP = (SubLObject)kbq_query_run.NIL;
                                                }
                                                catch (Throwable ccatch_env_var) {
                                                    dummy = Errors.handleThrowable(ccatch_env_var, restart_tag);
                                                }
                                                finally {
                                                    thread.throwStack.pop();
                                                }
                                            }
                                            finally {
                                                Errors.$restarts$.rebind(_prev_bind_0_$4, thread);
                                            }
                                        }
                                        catch (Throwable ccatch_env_var2) {
                                            catch_var = Errors.handleThrowable(ccatch_env_var2, (SubLObject)kbq_query_run.$kw123$ABORT_KBQ_RUN_QUERY);
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                        if (kbq_query_run.NIL != aborted_via_restartP) {
                                            Errors.error((SubLObject)kbq_query_run.$str125$KBQ_explicitly_aborted);
                                        }
                                    }
                                    catch (Throwable catch_var2) {
                                        Errors.handleThrowable(catch_var2, (SubLObject)kbq_query_run.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var3) {
                                harness_error_message = Errors.handleThrowable(ccatch_env_var3, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                        }
                        else {
                            aborted_via_restartP2 = (SubLObject)kbq_query_run.T;
                            catch_var3 = (SubLObject)kbq_query_run.NIL;
                            try {
                                thread.throwStack.push(kbq_query_run.$kw123$ABORT_KBQ_RUN_QUERY);
                                restart_tag2 = (SubLObject)kbq_query_run.$kw123$ABORT_KBQ_RUN_QUERY;
                                dummy2 = (SubLObject)kbq_query_run.NIL;
                                _prev_bind_0_$5 = Errors.$restarts$.currentBinding(thread);
                                try {
                                    Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(restart_tag2, (SubLObject)kbq_query_run.$str124$Abort_KBQ_run_query), Errors.$restarts$.getDynamicValue(thread)), thread);
                                    try {
                                        thread.throwStack.push(restart_tag2);
                                        if (i.eql((SubLObject)kbq_query_run.ZERO_INTEGER)) {
                                            thread.resetMultipleValues();
                                            inference_$6 = kbq_run_query_and_maybe_destroy(query_spec, (SubLObject)kbq_query_run.NIL, outlier_timeout, overriding_query_properties, substitutions);
                                            never_runP_$7 = thread.secondMultipleValue();
                                            timed_outP_$8 = thread.thirdMultipleValue();
                                            result_$9 = thread.fourthMultipleValue();
                                            halt_reason_$10 = thread.fifthMultipleValue();
                                            inference_metric_values_$11 = thread.sixthMultipleValue();
                                            thread.resetMultipleValues();
                                            inference = inference_$6;
                                            never_runP = never_runP_$7;
                                            timed_outP = timed_outP_$8;
                                            result = result_$9;
                                            halt_reason = halt_reason_$10;
                                            inference_metric_values = inference_metric_values_$11;
                                        }
                                        else {
                                            kbq_run_query_and_maybe_destroy(query_spec, (SubLObject)kbq_query_run.T, outlier_timeout, overriding_query_properties, substitutions);
                                        }
                                        aborted_via_restartP2 = (SubLObject)kbq_query_run.NIL;
                                    }
                                    catch (Throwable ccatch_env_var4) {
                                        dummy2 = Errors.handleThrowable(ccatch_env_var4, restart_tag2);
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                }
                                finally {
                                    Errors.$restarts$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var5) {
                                catch_var3 = Errors.handleThrowable(ccatch_env_var5, (SubLObject)kbq_query_run.$kw123$ABORT_KBQ_RUN_QUERY);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (kbq_query_run.NIL != aborted_via_restartP2) {
                                Errors.error((SubLObject)kbq_query_run.$str125$KBQ_explicitly_aborted);
                            }
                        }
                        total_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    if (kbq_query_run.NIL != never_runP) {
                        possibly_set_kbqr_run_status(kbq_query_run.$kbq_runstate$.getDynamicValue(thread), (SubLObject)kbq_query_run.$kw126$NEVER_RUN);
                    }
                    else {
                        possibly_set_kbqr_run_status(kbq_query_run.$kbq_runstate$.getDynamicValue(thread), (SubLObject)kbq_query_run.$kw127$FINISHED);
                    }
                    if (kbq_query_run.NIL == harness_error_message) {
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0_$6 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)kbq_query_run.$sym122$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    if (kbq_query_run.NIL != timed_outP) {
                                        Errors.warn((SubLObject)kbq_query_run.$str128$Outlier_____S, query_spec);
                                        halt_reason = (SubLObject)kbq_query_run.$kw129$OUTLIER_ABORT;
                                        possibly_set_kbqr_run_status(kbq_query_run.$kbq_runstate$.getDynamicValue(thread), (SubLObject)kbq_query_run.$kw130$OUTLIER_TIMEOUT);
                                        if (kbq_query_run.NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                                            result = inference_kernel.inference_result_from_answers(inference, inference_datastructures_inference.inference_all_new_answers(inference));
                                            inference_metric_values = inference_datastructures_inference.inference_compute_metrics(inference);
                                        }
                                    }
                                    if (kbq_query_run.NIL == never_runP) {
                                        if (!Sequences.length(v_inference_metrics).numE(Sequences.length(inference_metric_values))) {
                                            if (kbq_query_run.NIL == inference_metric_values) {
                                                Errors.error((SubLObject)kbq_query_run.$str131$Unable_to_compute_any_inference_m, query_spec);
                                            }
                                            else {
                                                Errors.error((SubLObject)kbq_query_run.$str132$Unable_to_compute_all_desired_inf, query_spec);
                                            }
                                        }
                                        query_metrics_plist = list_utilities.merge_plist(list_utilities.make_plist(query_metrics, (SubLObject)ConsesLow.make_list(Sequences.length(query_metrics), (SubLObject)kbq_query_run.UNPROVIDED)), list_utilities.make_plist(v_inference_metrics, inference_metric_values));
                                    }
                                    if (kbq_query_run.NIL != timed_outP) {
                                        if (kbq_query_run.NIL != subl_promotions.memberP((SubLObject)kbq_query_run.$kw20$TOTAL_TIME, query_metrics, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                            query_metrics_plist = conses_high.putf(query_metrics_plist, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, outlier_timeout);
                                        }
                                        if (kbq_query_run.NIL != subl_promotions.memberP((SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME, query_metrics, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                            query_metrics_plist = conses_high.putf(query_metrics_plist, (SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME, outlier_timeout);
                                        }
                                    }
                                }
                                catch (Throwable catch_var4) {
                                    Errors.handleThrowable(catch_var4, (SubLObject)kbq_query_run.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var6) {
                            harness_error_message = Errors.handleThrowable(ccatch_env_var6, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                    }
                    if (kbq_query_run.NIL != harness_error_message) {
                        possibly_set_kbqr_run_status(kbq_query_run.$kbq_runstate$.getDynamicValue(thread), (SubLObject)kbq_query_run.$kw2$ERROR);
                        halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status(PrintLow.format((SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$str133$KBQ_harness_error_for__A____A, query_spec, harness_error_message));
                    }
                    if (kbq_query_run.NIL != never_runP) {
                        query_metrics_plist = ConsesLow.nconc(new SubLObject[] { (kbq_query_run.NIL != subl_promotions.memberP((SubLObject)kbq_query_run.$kw20$TOTAL_TIME, query_metrics, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) ? ConsesLow.list((SubLObject)kbq_query_run.$kw20$TOTAL_TIME, total_time) : kbq_query_run.NIL, (kbq_query_run.NIL != subl_promotions.memberP((SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME, query_metrics, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) ? ConsesLow.list((SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME, total_time) : kbq_query_run.NIL, (kbq_query_run.NIL != subl_promotions.memberP((SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, query_metrics, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) ? ((kbq_query_run.$kw60$TAUTOLOGY == halt_reason) ? ConsesLow.list((SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, (SubLObject)kbq_query_run.ONE_INTEGER) : ConsesLow.list((SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, (SubLObject)kbq_query_run.ZERO_INTEGER)) : kbq_query_run.NIL, (kbq_query_run.$kw60$TAUTOLOGY == halt_reason) ? ConsesLow.nconc((SubLObject)((kbq_query_run.NIL != subl_promotions.memberP((SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER, query_metrics, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) ? ConsesLow.list((SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER, total_time) : kbq_query_run.NIL), (SubLObject)((kbq_query_run.NIL != subl_promotions.memberP((SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER, query_metrics, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) ? ConsesLow.list((SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER, total_time) : kbq_query_run.NIL)) : kbq_query_run.NIL });
                    }
                    if (kbq_query_run.NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason)) {
                        Errors.warn((SubLObject)kbq_query_run.$str134$Error_____S___A, query_spec, inference_datastructures_enumerated_types.inference_error_suspend_status_message(halt_reason));
                    }
                    if (kbq_query_run.NIL != inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason) && kbq_query_run.$kw135$NOT_A_QUERY != halt_reason) {
                        Errors.warn((SubLObject)kbq_query_run.$str136$Avoided__due_to__S______S, halt_reason, query_spec);
                    }
                    if (kbq_query_run.NIL == kct_runstate_p(kbq_query_run.$kct_runstate$.getDynamicValue(thread)) && kbq_query_run.NIL != control_vars.$kbq_run_query_auto_destroy_enabledP$.getDynamicValue(thread) && kbq_query_run.NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (kbq_query_run.NIL == already_in_a_sandboxP) {
                            sksi_sks_manager.execute_sks_registration_state(state);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            }
            finally {
                sksi_macros.$within_sksi_sandboxP$.rebind(_prev_bind_0_$2, thread);
            }
        }
        finally {
            kbq_query_run.$kbq_runstate$.rebind(_prev_bind_0, thread);
        }
        final SubLObject query_run = (SubLObject)ConsesLow.listS((SubLObject)kbq_query_run.$kw16$QUERY, query_spec, ConsesLow.append((SubLObject)((kbq_query_run.NIL != overriding_query_properties) ? ConsesLow.list((SubLObject)kbq_query_run.$kw137$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties) : kbq_query_run.NIL), (SubLObject)((kbq_query_run.NIL != include_resultP) ? ConsesLow.list((SubLObject)kbq_query_run.$kw15$RESULT, result) : kbq_query_run.NIL), (SubLObject)ConsesLow.listS((SubLObject)kbq_query_run.$kw29$HALT_REASON, halt_reason, ConsesLow.append(query_metrics_plist, (SubLObject)kbq_query_run.NIL))));
        if (kbq_query_run.NIL != kbq_runstate_p(kbq_runstate)) {
            set_kbqr_result(kbq_runstate, query_run);
        }
        return query_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 38682L)
    public static SubLObject abort_kbq_run_query() {
        return Dynamic.sublisp_throw((SubLObject)kbq_query_run.$kw123$ABORT_KBQ_RUN_QUERY, (SubLObject)kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 38766L)
    public static SubLObject kbq_run_query_and_maybe_destroy(final SubLObject query_spec, final SubLObject destroyP, final SubLObject outlier_timeout, final SubLObject overriding_query_properties, SubLObject substitutions) {
        if (substitutions == kbq_query_run.UNPROVIDED) {
            substitutions = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject inference_tmp = kbq_run_query_int(query_spec, outlier_timeout, overriding_query_properties, substitutions);
        final SubLObject never_runP_tmp = thread.secondMultipleValue();
        final SubLObject timed_outP_tmp = thread.thirdMultipleValue();
        final SubLObject result_tmp = thread.fourthMultipleValue();
        final SubLObject halt_reason_tmp = thread.fifthMultipleValue();
        final SubLObject metric_values_tmp = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        if (kbq_query_run.NIL != destroyP) {
            inference_datastructures_inference.destroy_inference_and_problem_store(inference_tmp);
        }
        return Values.values(inference_tmp, never_runP_tmp, timed_outP_tmp, result_tmp, halt_reason_tmp, metric_values_tmp);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 39307L)
    public static SubLObject kbq_run_query_problem_store(final SubLObject query_spec, SubLObject v_properties) {
        if (v_properties == kbq_query_run.UNPROVIDED) {
            v_properties = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw130$OUTLIER_TIMEOUT, current);
        final SubLObject outlier_timeout = (SubLObject)((kbq_query_run.NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : kbq_query_run.$int10$600);
        final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw137$OVERRIDING_QUERY_PROPERTIES, current);
        final SubLObject overriding_query_properties = (SubLObject)((kbq_query_run.NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : kbq_query_run.NIL);
        final SubLObject substitutions_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw138$SUBSTITUTIONS, current);
        final SubLObject substitutions = (SubLObject)((kbq_query_run.NIL != substitutions_tail) ? conses_high.cadr(substitutions_tail) : kbq_query_run.NIL);
        thread.resetMultipleValues();
        final SubLObject inference = kbq_run_query_and_maybe_destroy(query_spec, (SubLObject)kbq_query_run.NIL, outlier_timeout, overriding_query_properties, substitutions);
        thread.resetMultipleValues();
        if (kbq_query_run.NIL != inference_datastructures_inference.inference_p(inference)) {
            return inference_datastructures_inference.inference_problem_store(inference);
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 39852L)
    public static SubLObject kbq_run_query_int(final SubLObject query_spec, final SubLObject outlier_timeout, final SubLObject overriding_query_properties, SubLObject substitutions) {
        if (substitutions == kbq_query_run.UNPROVIDED) {
            substitutions = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference = (SubLObject)kbq_query_run.NIL;
        SubLObject never_runP = (SubLObject)kbq_query_run.NIL;
        SubLObject timed_outP = (SubLObject)kbq_query_run.NIL;
        SubLObject result = (SubLObject)kbq_query_run.NIL;
        SubLObject halt_reason = (SubLObject)kbq_query_run.NIL;
        SubLObject metric_values = (SubLObject)kbq_query_run.NIL;
        final SubLObject treat_as_multiple_choiceP = (SubLObject)kbq_query_run.NIL;
        ensure_only_sksi_modules_needed(query_spec);
        SubLObject timer = (SubLObject)kbq_query_run.NIL;
        try {
            timer = inference_strategist.with_query_abort_timeout_start_timer(outlier_timeout);
            thread.resetMultipleValues();
            final SubLObject result_$20 = (kbq_query_run.NIL != treat_as_multiple_choiceP) ? kb_query.ask_multiple_choice_query_from_kbq(query_spec, overriding_query_properties) : kb_query.new_cyc_query_from_kbq(query_spec, overriding_query_properties, substitutions);
            final SubLObject halt_reason_$21 = thread.secondMultipleValue();
            final SubLObject inference_$22 = thread.thirdMultipleValue();
            final SubLObject metric_values_$23 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            result = result_$20;
            halt_reason = halt_reason_$21;
            inference = inference_$22;
            metric_values = metric_values_$23;
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                inference_strategist.with_query_abort_timeout_stop_timer(timer);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        never_runP = inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason);
        timed_outP = Equality.eq((SubLObject)kbq_query_run.$kw139$ABORT, halt_reason);
        return Values.values(inference, never_runP, timed_outP, result, halt_reason, metric_values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 40819L)
    public static SubLObject ensure_sksi_modules_needed(final SubLObject query_spec) {
        return sksi_sks_manager.register_sksi_removal_modules_for_skses(conses_high.set_difference(sksi_modules_needed(query_spec), sksi_infrastructure_utilities.gather_all_top_level_registered_knowledge_sources(), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 41153L)
    public static SubLObject ensure_only_sksi_modules_needed(final SubLObject query_spec) {
        if (kbq_query_run.NIL == list_utilities.sets_equalP(sksi_infrastructure_utilities.gather_all_top_level_registered_knowledge_sources(), sksi_modules_needed(query_spec), (SubLObject)kbq_query_run.UNPROVIDED)) {
            sksi_query_utilities.deregister_all_combined_sksi_removal_modules((SubLObject)kbq_query_run.UNPROVIDED);
            sksi_sks_manager.clear_sksi_registered_knowledge_sources();
            sksi_sks_manager.clear_sksi_content_mts_with_registered_module();
            return sksi_sks_manager.register_sksi_removal_modules_for_skses(sksi_modules_needed(query_spec));
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 41820L)
    public static SubLObject sksi_modules_needed(final SubLObject query_spec) {
        return (SubLObject)((kbq_query_run.NIL != kb_indexing_datastructures.indexed_term_p(query_spec)) ? kb_mapping_utilities.pred_values_in_any_mt(query_spec, kbq_query_run.$const141$sksiModulesNeeded, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 41970L)
    public static SubLObject query_sksi_modules_needed(final SubLObject test_spec) {
        final SubLObject query = kct_utils.kct_query_specification(test_spec, (SubLObject)kbq_query_run.UNPROVIDED);
        return (SubLObject)((kbq_query_run.NIL != query) ? sksi_modules_needed(query) : kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 42133L)
    public static SubLObject any_kct_followup_test_formula_gafsP(final SubLObject test_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbq_query_run.NIL != forts.fort_p(test_spec) && (kbq_query_run.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(test_spec, kbq_query_run.$const142$testFollowupTestFormula_All, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) || kbq_query_run.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(test_spec, kbq_query_run.$const143$testFollowupTestFormula_Some, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) || kbq_query_run.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(test_spec, kbq_query_run.$const144$testFollowupTestFormula_None, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 42514L)
    public static SubLObject kct_run_test(final SubLObject test_spec, SubLObject overriding_metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP, SubLObject expose_runstateP) {
        if (overriding_metrics == kbq_query_run.UNPROVIDED) {
            overriding_metrics = (SubLObject)kbq_query_run.NIL;
        }
        if (outlier_timeout == kbq_query_run.UNPROVIDED) {
            outlier_timeout = kbq_query_run.$kbq_outlier_timeout$.getDynamicValue();
        }
        if (overriding_query_properties == kbq_query_run.UNPROVIDED) {
            overriding_query_properties = (SubLObject)kbq_query_run.NIL;
        }
        if (include_resultP == kbq_query_run.UNPROVIDED) {
            include_resultP = (SubLObject)kbq_query_run.NIL;
        }
        if (expose_runstateP == kbq_query_run.UNPROVIDED) {
            expose_runstateP = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kbq_query_run.NIL != kct_utils.kct_test_spec_p(test_spec, (SubLObject)kbq_query_run.UNPROVIDED) : test_spec;
        final SubLObject list_var = overriding_metrics;
        assert kbq_query_run.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)kbq_query_run.NIL;
        elem = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            assert kbq_query_run.NIL != inference_datastructures_enumerated_types.query_metric_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (kbq_query_run.NIL != outlier_timeout && !kbq_query_run.assertionsDisabledInClass && kbq_query_run.NIL == Types.numberp(outlier_timeout)) {
            throw new AssertionError(outlier_timeout);
        }
        final SubLObject plist_var = overriding_query_properties;
        assert kbq_query_run.NIL != list_utilities.property_list_p(plist_var) : plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)kbq_query_run.NIL, remainder = plist_var; kbq_query_run.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert kbq_query_run.NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
        }
        SubLObject status = (SubLObject)kbq_query_run.NIL;
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        SubLObject kct_runstate = (SubLObject)kbq_query_run.NIL;
        final SubLObject any_kct_followup_test_formula_gafsP = any_kct_followup_test_formula_gafsP(test_spec);
        final SubLObject test_error_message = (SubLObject)kbq_query_run.NIL;
        if (kbq_query_run.NIL != any_kct_followup_test_formula_gafsP) {
            expose_runstateP = (SubLObject)kbq_query_run.T;
        }
        if (kbq_query_run.NIL != expose_runstateP) {
            kct_runstate = new_kct_runstate(test_spec, kbq_query_run.$kct_set_runstate$.getDynamicValue(thread));
            if (kbq_query_run.NIL != process_utilities.thinking_task() && kbq_query_run.NIL == kct_thinking.kct_thinking_runstate(process_utilities.thinking_task())) {
                kct_thinking.kct_thinking_set_runstate_id(kctr_id(kct_runstate), (SubLObject)kbq_query_run.UNPROVIDED);
            }
            if (kbq_query_run.NIL != kct_set_runstate_p(kbq_query_run.$kct_set_runstate$.getDynamicValue(thread))) {
                kctsr_test_runstate_add(kbq_query_run.$kct_set_runstate$.getDynamicValue(thread), kct_runstate);
            }
        }
        final SubLObject _prev_bind_0 = kbq_query_run.$kct_runstate$.currentBinding(thread);
        try {
            kbq_query_run.$kct_runstate$.bind(kct_runstate, thread);
            final SubLObject query_spec = kct_utils.kct_query_specification(test_spec, (SubLObject)kbq_query_run.UNPROVIDED);
            final SubLObject test_metrics = kb_test_metrics_to_query_metrics(kct_utils.kct_test_metrics(test_spec, (SubLObject)kbq_query_run.UNPROVIDED));
            final SubLObject query_metrics = conses_high.union(test_metrics, overriding_metrics, Symbols.symbol_function((SubLObject)kbq_query_run.EQL), (SubLObject)kbq_query_run.UNPROVIDED);
            final SubLObject multiple_choiceP = kb_query.multiple_choice_testP(test_spec);
            try {
                SubLObject query_properties_to_use = conses_high.copy_list(overriding_query_properties);
                if (kbq_query_run.NIL == multiple_choiceP) {
                    query_properties_to_use = conses_high.putf(query_properties_to_use, (SubLObject)kbq_query_run.$kw146$RETURN, (SubLObject)kbq_query_run.$kw147$BINDINGS_AND_HYPOTHETICAL_BINDINGS);
                }
                query_run = kbq_run_query(query_spec, query_metrics, outlier_timeout, query_properties_to_use, (SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.UNPROVIDED);
                final SubLObject raw_results = kbq_query_run_result(query_run);
                if (kbq_query_run.NIL != multiple_choiceP) {
                    status = kct_compute_test_status(test_spec, raw_results, (SubLObject)kbq_query_run.NIL);
                }
                else {
                    final SubLObject actual_results = raw_results.first();
                    final SubLObject hypothetical_bindings = conses_high.second(raw_results);
                    status = kct_compute_test_status(test_spec, actual_results, hypothetical_bindings);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (kbq_query_run.NIL != query_run && kbq_query_run.NIL == include_resultP) {
                        query_run = kbq_discard_query_run_result(query_run);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        }
        finally {
            kbq_query_run.$kct_runstate$.rebind(_prev_bind_0, thread);
        }
        if (kbq_query_run.NIL != test_error_message) {
            status = (SubLObject)kbq_query_run.$kw2$ERROR;
        }
        final SubLObject kct_test_run = kct_make_test_run(test_spec, status, query_run);
        if (kbq_query_run.NIL != kct_runstate_p(kct_runstate)) {
            set_kctr_result(kct_runstate, kct_test_run);
        }
        return kct_test_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 44985L)
    public static SubLObject kb_test_metrics_to_query_metrics(final SubLObject kb_test_metrics) {
        SubLObject query_metrics = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = kb_test_metrics;
        SubLObject kb_test_metric = (SubLObject)kbq_query_run.NIL;
        kb_test_metric = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query_metric = kb_test_metric_to_query_metric(kb_test_metric);
            if (kbq_query_run.NIL != query_metric) {
                query_metrics = (SubLObject)ConsesLow.cons(query_metric, query_metrics);
            }
            else if (!kb_test_metric.eql(kbq_query_run.$const148$TestMetric_HaltReason)) {
                Errors.warn((SubLObject)kbq_query_run.$str149$Unsupported_metric__S, kb_test_metric);
            }
            cdolist_list_var = cdolist_list_var.rest();
            kb_test_metric = cdolist_list_var.first();
        }
        return Sequences.nreverse(query_metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 46157L)
    public static SubLObject kb_test_metric_to_query_metric(final SubLObject kb_test_metric) {
        return list_utilities.alist_lookup_without_values(kbq_query_run.$kct_test_metric_table$.getGlobalValue(), kb_test_metric, Symbols.symbol_function((SubLObject)kbq_query_run.EQL), (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 46306L)
    public static SubLObject kct_compute_test_status(final SubLObject test_spec, final SubLObject query_results, final SubLObject hypothetical_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbq_query_run.NIL != janus.janus_operation_p(test_spec)) {
            return kct_compute_janus_test_status(test_spec, query_results);
        }
        if (kbq_query_run.NIL != kb_query.multiple_choice_testP(test_spec)) {
            if (kbq_query_run.NIL == kct_test_query_results_satisfy_best_multiple_choice_option(query_results, (SubLObject)ConsesLow.list(Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("MULTIPLE-CHOICE-TEST-DESIRED-OPTION"), test_spec)))) {
                return (SubLObject)kbq_query_run.$kw1$FAILURE;
            }
        }
        else {
            final SubLObject el_query_results = kct_utils.kct_transform_query_results_for_comparison(query_results, hypothetical_bindings);
            if (kbq_query_run.NIL == kct_test_query_results_satisfy_binding_sets_cardinality(query_results, kct_utils.kct_binding_sets_cardinality(test_spec, (SubLObject)kbq_query_run.UNPROVIDED)) || kbq_query_run.NIL == kct_test_query_results_satisfy_binding_sets_min_cardinality(query_results, kct_utils.kct_binding_sets_min_cardinality(test_spec, (SubLObject)kbq_query_run.UNPROVIDED)) || kbq_query_run.NIL == kct_test_query_results_satisfy_binding_sets_max_cardinality(query_results, kct_utils.kct_binding_sets_max_cardinality(test_spec, (SubLObject)kbq_query_run.UNPROVIDED))) {
                return (SubLObject)kbq_query_run.$kw1$FAILURE;
            }
            if (kbq_query_run.NIL == kct_utils.kct_bindings_unimportantP(test_spec, (SubLObject)kbq_query_run.UNPROVIDED) && (kbq_query_run.NIL == kct_test_query_results_satisfy_exact_set_of_binding_sets(el_query_results, kct_utils.kct_exact_set_of_binding_sets(test_spec, (SubLObject)kbq_query_run.UNPROVIDED), hypothetical_bindings) || kbq_query_run.NIL == kct_test_query_results_satisfy_wanted_binding_sets(el_query_results, kct_utils.kct_wanted_binding_sets(test_spec, (SubLObject)kbq_query_run.UNPROVIDED), hypothetical_bindings) || kbq_query_run.NIL == kct_test_query_results_satisfy_unwanted_binding_sets(el_query_results, kct_utils.kct_unwanted_binding_sets(test_spec, (SubLObject)kbq_query_run.UNPROVIDED), hypothetical_bindings))) {
                return (SubLObject)kbq_query_run.$kw1$FAILURE;
            }
            if (kbq_query_run.NIL != any_kct_followup_test_formula_gafsP(test_spec)) {
                final SubLObject kbqr = kct_runstate_query_runstate(kbq_query_run.$kct_runstate$.getDynamicValue(thread));
                final SubLObject inference = kbq_runstate_inference(kbqr);
                final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
                final SubLObject v_properties = inference_datastructures_inference.inference_input_query_properties(inference);
                final SubLObject el_query = inference_datastructures_inference.inference_el_query(inference);
                final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                if (kbq_query_run.NIL == kct_followup_test_formula_all_holdsP(test_spec, store, el_query, mt, v_properties, hypothetical_bindings, query_results) || kbq_query_run.NIL == kct_followup_test_formula_some_holdsP(test_spec, store, el_query, mt, v_properties, hypothetical_bindings) || kbq_query_run.NIL == kct_followup_test_formula_none_holdsP(test_spec, store, el_query, mt, v_properties, hypothetical_bindings)) {
                    return (SubLObject)kbq_query_run.$kw1$FAILURE;
                }
            }
        }
        return (SubLObject)kbq_query_run.$kw0$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 48769L)
    public static SubLObject kct_compute_janus_test_status(final SubLObject test_spec, final SubLObject query_results) {
        if (kbq_query_run.NIL != janus.janus_operation_successP(test_spec, query_results, (SubLObject)kbq_query_run.UNPROVIDED)) {
            return (SubLObject)kbq_query_run.$kw0$SUCCESS;
        }
        return (SubLObject)kbq_query_run.$kw1$FAILURE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 48946L)
    public static SubLObject kct_followup_test_formula_all_holdsP(final SubLObject test_spec, final SubLObject store, final SubLObject el_query, final SubLObject mt, final SubLObject query_properties, final SubLObject hypothetical_bindings, final SubLObject query_results) {
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(test_spec, kbq_query_run.$const142$testFollowupTestFormula_All, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        SubLObject quoted_followup_sentence = (SubLObject)kbq_query_run.NIL;
        quoted_followup_sentence = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject followup_raw_results = kct_followup_test_formula_result(quoted_followup_sentence, store, el_query, mt, query_properties, hypothetical_bindings);
            final SubLObject followup_results = followup_raw_results.first();
            if (kbq_query_run.NIL == list_utilities.sets_equal_equalP(query_results, followup_results)) {
                return (SubLObject)kbq_query_run.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            quoted_followup_sentence = cdolist_list_var.first();
        }
        return (SubLObject)kbq_query_run.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 49480L)
    public static SubLObject kct_followup_test_formula_some_holdsP(final SubLObject test_spec, final SubLObject store, final SubLObject el_query, final SubLObject mt, final SubLObject query_properties, final SubLObject hypothetical_bindings) {
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(test_spec, kbq_query_run.$const143$testFollowupTestFormula_Some, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        SubLObject quoted_followup_sentence = (SubLObject)kbq_query_run.NIL;
        quoted_followup_sentence = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject followup_raw_results = kct_followup_test_formula_result(quoted_followup_sentence, store, el_query, mt, query_properties, hypothetical_bindings);
            final SubLObject followup_results = followup_raw_results.first();
            if (kbq_query_run.NIL == followup_results) {
                return (SubLObject)kbq_query_run.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            quoted_followup_sentence = cdolist_list_var.first();
        }
        return (SubLObject)kbq_query_run.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 49968L)
    public static SubLObject kct_followup_test_formula_none_holdsP(final SubLObject test_spec, final SubLObject store, final SubLObject el_query, final SubLObject mt, final SubLObject query_properties, final SubLObject hypothetical_bindings) {
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(test_spec, kbq_query_run.$const144$testFollowupTestFormula_None, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        SubLObject quoted_followup_sentence = (SubLObject)kbq_query_run.NIL;
        quoted_followup_sentence = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject followup_raw_results = kct_followup_test_formula_result(quoted_followup_sentence, store, el_query, mt, query_properties, hypothetical_bindings);
            final SubLObject followup_results = followup_raw_results.first();
            if (kbq_query_run.NIL != followup_results) {
                return (SubLObject)kbq_query_run.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            quoted_followup_sentence = cdolist_list_var.first();
        }
        return (SubLObject)kbq_query_run.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 50463L)
    public static SubLObject kct_followup_test_formula_result(final SubLObject quoted_followup_sentence, final SubLObject store, final SubLObject el_query, final SubLObject mt, SubLObject query_properties, final SubLObject hypothetical_bindings) {
        final SubLObject followup_sentence = bindings.apply_bindings(hypothetical_bindings, czer_main.unquote_quoted_term(quoted_followup_sentence, (SubLObject)kbq_query_run.UNPROVIDED));
        final SubLObject followup_conjunction = simplifier.conjoin((SubLObject)ConsesLow.list(followup_sentence, el_query), (SubLObject)kbq_query_run.UNPROVIDED);
        query_properties = list_utilities.merge_plist(query_properties, (SubLObject)ConsesLow.listS((SubLObject)kbq_query_run.$kw151$PROBLEM_STORE, store, (SubLObject)kbq_query_run.$list152));
        return inference_kernel.new_cyc_query(followup_conjunction, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 50963L)
    public static SubLObject kct_test_query_results_satisfy_exact_set_of_binding_sets(final SubLObject el_query_results, final SubLObject kb_exact_set_of_binding_sets, final SubLObject hypothetical_bindings) {
        if (kbq_query_run.NIL == kb_exact_set_of_binding_sets) {
            return Values.values((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.NIL);
        }
        final SubLObject hl_exact_binding_sets = bindings.inferencify_kb_set_of_binding_sets(kb_exact_set_of_binding_sets);
        final SubLObject el_exact_binding_sets = kct_utils.kct_transform_query_results_for_comparison(hl_exact_binding_sets, hypothetical_bindings);
        final SubLObject missing_binding_sets = list_utilities.fast_set_difference(el_exact_binding_sets, el_query_results, (SubLObject)kbq_query_run.$sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_);
        final SubLObject extra_binding_sets = list_utilities.fast_set_difference(el_query_results, el_exact_binding_sets, (SubLObject)kbq_query_run.$sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_);
        final SubLObject satisfiedP = (SubLObject)SubLObjectFactory.makeBoolean(kbq_query_run.NIL == missing_binding_sets && kbq_query_run.NIL == extra_binding_sets);
        return Values.values(satisfiedP, missing_binding_sets, extra_binding_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 51813L)
    public static SubLObject kct_test_query_results_satisfy_wanted_binding_sets(final SubLObject el_query_results, final SubLObject kb_wanted_binding_sets, final SubLObject hypothetical_bindings) {
        if (kbq_query_run.NIL == kb_wanted_binding_sets) {
            return Values.values((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.NIL);
        }
        final SubLObject hl_wanted_binding_sets = bindings.inferencify_kb_set_of_binding_sets(el_utilities.make_el_set(kb_wanted_binding_sets, (SubLObject)kbq_query_run.UNPROVIDED));
        final SubLObject el_wanted_binding_sets = kct_utils.kct_transform_query_results_for_comparison(hl_wanted_binding_sets, hypothetical_bindings);
        final SubLObject missing_binding_sets = list_utilities.fast_set_difference(el_wanted_binding_sets, el_query_results, (SubLObject)kbq_query_run.$sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_);
        final SubLObject satisfiedP = Types.sublisp_null(missing_binding_sets);
        return Values.values(satisfiedP, missing_binding_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 52487L)
    public static SubLObject kct_test_query_results_satisfy_unwanted_binding_sets(final SubLObject el_query_results, final SubLObject kb_unwanted_binding_sets, final SubLObject hypothetical_bindings) {
        if (kbq_query_run.NIL == kb_unwanted_binding_sets) {
            return Values.values((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.NIL);
        }
        final SubLObject hl_unwanted_binding_sets = bindings.inferencify_kb_set_of_binding_sets(el_utilities.make_el_set(kb_unwanted_binding_sets, (SubLObject)kbq_query_run.UNPROVIDED));
        final SubLObject el_unwanted_binding_sets = kct_utils.kct_transform_query_results_for_comparison(hl_unwanted_binding_sets, hypothetical_bindings);
        final SubLObject unwanted_found_binding_sets = keyhash_utilities.fast_intersection(el_unwanted_binding_sets, el_query_results, (SubLObject)kbq_query_run.$sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject satisfiedP = Types.sublisp_null(unwanted_found_binding_sets);
        return Values.values(satisfiedP, unwanted_found_binding_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 53205L)
    public static SubLObject kct_test_query_results_satisfy_binding_sets_cardinality(final SubLObject query_results, final SubLObject kb_binding_sets_cardinality) {
        if (kbq_query_run.NIL == kb_binding_sets_cardinality) {
            return (SubLObject)kbq_query_run.T;
        }
        final SubLObject satisfiedP = Numbers.numE(kb_binding_sets_cardinality, Sequences.length(query_results));
        final SubLObject got = Sequences.length(query_results);
        return Values.values(satisfiedP, kb_binding_sets_cardinality, got);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 53598L)
    public static SubLObject kct_test_query_results_satisfy_binding_sets_min_cardinality(final SubLObject query_results, final SubLObject kb_binding_sets_min_cardinality) {
        if (kbq_query_run.NIL == kb_binding_sets_min_cardinality) {
            return (SubLObject)kbq_query_run.T;
        }
        final SubLObject satisfiedP = Numbers.numLE(kb_binding_sets_min_cardinality, Sequences.length(query_results));
        final SubLObject got = Sequences.length(query_results);
        return Values.values(satisfiedP, kb_binding_sets_min_cardinality, got);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 54012L)
    public static SubLObject kct_test_query_results_satisfy_binding_sets_max_cardinality(final SubLObject query_results, final SubLObject kb_binding_sets_max_cardinality) {
        if (kbq_query_run.NIL == kb_binding_sets_max_cardinality) {
            return (SubLObject)kbq_query_run.T;
        }
        final SubLObject satisfiedP = Numbers.numGE(kb_binding_sets_max_cardinality, Sequences.length(query_results));
        final SubLObject got = Sequences.length(query_results);
        return Values.values(satisfiedP, kb_binding_sets_max_cardinality, got);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 54426L)
    public static SubLObject kct_test_query_results_satisfy_best_multiple_choice_option(final SubLObject chosen_option, final SubLObject kb_desired_option) {
        return equals.equalsP(chosen_option, kb_desired_option, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 54589L)
    public static SubLObject why_kct_failure(final SubLObject test_spec, final SubLObject query_results, final SubLObject hypothetical_bindings) {
        if (kct_compute_test_status(test_spec, query_results, hypothetical_bindings) != kbq_query_run.$kw1$FAILURE) {
            return (SubLObject)kbq_query_run.NIL;
        }
        if (kbq_query_run.NIL != kb_query.multiple_choice_testP(test_spec)) {
            return why_kct_multiple_choice_option_failure(test_spec, query_results);
        }
        final SubLObject cardinality_failure = why_kct_binding_cardinality_failure(test_spec, query_results);
        final SubLObject binding_failure = why_kct_binding_match_failure(test_spec, query_results, hypothetical_bindings);
        return list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)kbq_query_run.IDENTITY), (SubLObject)ConsesLow.list(cardinality_failure, binding_failure), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 55186L)
    public static SubLObject why_kct_multiple_choice_option_failure(final SubLObject test_spec, final SubLObject query_results) {
        return Sequences.cconcatenate((SubLObject)kbq_query_run.$str154$Expected_, new SubLObject[] { format_nil.format_nil_a_no_copy(query_results), kbq_query_run.$str155$__but_got_, format_nil.format_nil_a_no_copy(Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("MULTIPLE-CHOICE-TEST-DESIRED-OPTION"), test_spec)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 55378L)
    public static SubLObject why_kct_binding_cardinality_failure(final SubLObject test_spec, final SubLObject query_results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject satisfiedP = kct_test_query_results_satisfy_binding_sets_cardinality(query_results, kct_utils.kct_binding_sets_cardinality(test_spec, (SubLObject)kbq_query_run.UNPROVIDED));
        SubLObject wanted = thread.secondMultipleValue();
        SubLObject got = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (kbq_query_run.NIL == satisfiedP) {
            return Sequences.cconcatenate((SubLObject)kbq_query_run.$str156$Expected_exactly_, new SubLObject[] { format_nil.format_nil_a_no_copy(wanted), kbq_query_run.$str157$_binding_sets__but_got_, format_nil.format_nil_a_no_copy(got), kbq_query_run.$str158$_ });
        }
        thread.resetMultipleValues();
        satisfiedP = kct_test_query_results_satisfy_binding_sets_min_cardinality(query_results, kct_utils.kct_binding_sets_min_cardinality(test_spec, (SubLObject)kbq_query_run.UNPROVIDED));
        wanted = thread.secondMultipleValue();
        got = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (kbq_query_run.NIL == satisfiedP) {
            return Sequences.cconcatenate((SubLObject)kbq_query_run.$str159$Expected_at_least_, new SubLObject[] { format_nil.format_nil_a_no_copy(wanted), kbq_query_run.$str157$_binding_sets__but_got_, format_nil.format_nil_a_no_copy(got), kbq_query_run.$str158$_ });
        }
        thread.resetMultipleValues();
        satisfiedP = kct_test_query_results_satisfy_binding_sets_max_cardinality(query_results, kct_utils.kct_binding_sets_max_cardinality(test_spec, (SubLObject)kbq_query_run.UNPROVIDED));
        wanted = thread.secondMultipleValue();
        got = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (kbq_query_run.NIL == satisfiedP) {
            return Sequences.cconcatenate((SubLObject)kbq_query_run.$str160$Expected_no_more_than_, new SubLObject[] { format_nil.format_nil_a_no_copy(wanted), kbq_query_run.$str157$_binding_sets__but_got_, format_nil.format_nil_a_no_copy(got), kbq_query_run.$str158$_ });
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 56326L)
    public static SubLObject why_kct_binding_match_failure(final SubLObject test_spec, final SubLObject query_results, final SubLObject hypothetical_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kbq_query_run.$str161$;
        final SubLObject el_query_results = kct_utils.kct_transform_query_results_for_comparison(query_results, hypothetical_bindings);
        thread.resetMultipleValues();
        SubLObject satisfiedP = kct_test_query_results_satisfy_exact_set_of_binding_sets(el_query_results, kct_utils.kct_exact_set_of_binding_sets(test_spec, (SubLObject)kbq_query_run.UNPROVIDED), hypothetical_bindings);
        SubLObject missing_binding_sets = thread.secondMultipleValue();
        final SubLObject extra_binding_sets = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (kbq_query_run.NIL == satisfiedP) {
            if (kbq_query_run.NIL != missing_binding_sets) {
                result = Sequences.cconcatenate(result, new SubLObject[] { kbq_query_run.$str162$These_expected_bindings_were_miss, kct_format_binding_sets_list(missing_binding_sets) });
                if (kbq_query_run.NIL != extra_binding_sets) {
                    result = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(result), format_nil.$format_nil_percent$.getGlobalValue());
                }
            }
            if (kbq_query_run.NIL != extra_binding_sets) {
                result = Sequences.cconcatenate(result, new SubLObject[] { kbq_query_run.$str163$These_unwanted_bindings_were_retu, kct_format_binding_sets_list(extra_binding_sets) });
            }
        }
        if (kbq_query_run.NIL != string_utilities.non_empty_string_p(result)) {
            return result;
        }
        thread.resetMultipleValues();
        satisfiedP = kct_test_query_results_satisfy_wanted_binding_sets(el_query_results, kct_utils.kct_wanted_binding_sets(test_spec, (SubLObject)kbq_query_run.UNPROVIDED), hypothetical_bindings);
        missing_binding_sets = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (kbq_query_run.NIL == satisfiedP) {
            result = Sequences.cconcatenate(result, new SubLObject[] { kbq_query_run.$str162$These_expected_bindings_were_miss, kct_format_binding_sets_list(missing_binding_sets) });
        }
        if (kbq_query_run.NIL != string_utilities.non_empty_string_p(result)) {
            return result;
        }
        thread.resetMultipleValues();
        satisfiedP = kct_test_query_results_satisfy_unwanted_binding_sets(el_query_results, kct_utils.kct_unwanted_binding_sets(test_spec, (SubLObject)kbq_query_run.UNPROVIDED), hypothetical_bindings);
        final SubLObject extra_binding_sets2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (kbq_query_run.NIL == satisfiedP) {
            result = Sequences.cconcatenate(result, new SubLObject[] { kbq_query_run.$str163$These_unwanted_bindings_were_retu, kct_format_binding_sets_list(extra_binding_sets2) });
        }
        if (kbq_query_run.NIL != string_utilities.non_empty_string_p(result)) {
            return result;
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 58157L)
    public static SubLObject kct_format_binding_sets_list(final SubLObject binding_sets) {
        SubLObject result = (SubLObject)kbq_query_run.$str161$;
        SubLObject cdolist_list_var = binding_sets;
        SubLObject binding_set = (SubLObject)kbq_query_run.NIL;
        binding_set = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            result = Sequences.cconcatenate(result, Sequences.cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { kbq_query_run.$str164$____, format_nil.format_nil_a_no_copy(binding_set) }));
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 58507L)
    public static SubLObject kbq_run_query_set(final SubLObject query_spec_set, SubLObject metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultsP, SubLObject comment, SubLObject output_filename, SubLObject skip, SubLObject count, SubLObject randomize, SubLObject file_mode, SubLObject tail_queries, SubLObject keepalive_filename) {
        if (metrics == kbq_query_run.UNPROVIDED) {
            metrics = (SubLObject)kbq_query_run.NIL;
        }
        if (outlier_timeout == kbq_query_run.UNPROVIDED) {
            outlier_timeout = kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue();
        }
        if (overriding_query_properties == kbq_query_run.UNPROVIDED) {
            overriding_query_properties = (SubLObject)kbq_query_run.NIL;
        }
        if (include_resultsP == kbq_query_run.UNPROVIDED) {
            include_resultsP = (SubLObject)kbq_query_run.T;
        }
        if (comment == kbq_query_run.UNPROVIDED) {
            comment = (SubLObject)kbq_query_run.NIL;
        }
        if (output_filename == kbq_query_run.UNPROVIDED) {
            output_filename = (SubLObject)kbq_query_run.NIL;
        }
        if (skip == kbq_query_run.UNPROVIDED) {
            skip = (SubLObject)kbq_query_run.ZERO_INTEGER;
        }
        if (count == kbq_query_run.UNPROVIDED) {
            count = (SubLObject)kbq_query_run.NIL;
        }
        if (randomize == kbq_query_run.UNPROVIDED) {
            randomize = (SubLObject)kbq_query_run.NIL;
        }
        if (file_mode == kbq_query_run.UNPROVIDED) {
            file_mode = (SubLObject)kbq_query_run.$kw165$OUTPUT;
        }
        if (tail_queries == kbq_query_run.UNPROVIDED) {
            tail_queries = (SubLObject)kbq_query_run.NIL;
        }
        if (keepalive_filename == kbq_query_run.UNPROVIDED) {
            keepalive_filename = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbq_query_run.NIL != keepalive_filename && !kbq_query_run.assertionsDisabledInClass && kbq_query_run.NIL == file_utilities.file_valid_for_writing_p(keepalive_filename)) {
            throw new AssertionError(keepalive_filename);
        }
        final SubLObject query_specs = kbq_query_spec_set_elements(query_spec_set, randomize, tail_queries);
        final SubLObject query_end = (SubLObject)((kbq_query_run.NIL != count) ? Numbers.add(skip, count) : kbq_query_run.NIL);
        SubLObject query_count = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject query_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject output_stream = (SubLObject)kbq_query_run.NIL;
        SubLObject catch_var = (SubLObject)kbq_query_run.NIL;
        try {
            thread.throwStack.push(kbq_query_run.$kw167$ABORT_KBQ_RUN_QUERY_SET);
            final SubLObject restart_tag = (SubLObject)kbq_query_run.$kw167$ABORT_KBQ_RUN_QUERY_SET;
            SubLObject dummy = (SubLObject)kbq_query_run.NIL;
            final SubLObject _prev_bind_0 = Errors.$restarts$.currentBinding(thread);
            try {
                Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(restart_tag, (SubLObject)kbq_query_run.$str168$Abort_KBQ_run_query_set), Errors.$restarts$.getDynamicValue(thread)), thread);
                try {
                    thread.throwStack.push(restart_tag);
                    final SubLObject state = sksi_sks_manager.current_sks_registration_state();
                    final SubLObject _prev_bind_0_$25 = sksi_macros.$within_sksi_sandboxP$.currentBinding(thread);
                    try {
                        sksi_macros.$within_sksi_sandboxP$.bind((SubLObject)kbq_query_run.T, thread);
                        try {
                            if (kbq_query_run.NIL != output_filename) {
                                output_stream = kbq_open_query_set_run_output_stream(output_filename, file_mode);
                            }
                            if (kbq_query_run.NIL != output_stream && kbq_query_run.$kw165$OUTPUT == file_mode) {
                                kbq_save_query_set_run_preamble(output_stream, comment);
                            }
                            final SubLObject list_var = query_specs;
                            final SubLObject _prev_bind_0_$26 = utilities_macros.$progress_note$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_note$.bind((SubLObject)kbq_query_run.$str169$KBQ_running_query_set, thread);
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                                utilities_macros.$progress_sofar$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbq_query_run.NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbq_query_run.T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                                try {
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    SubLObject csome_list_var = list_var;
                                    SubLObject query_spec = (SubLObject)kbq_query_run.NIL;
                                    query_spec = csome_list_var.first();
                                    while (kbq_query_run.NIL != csome_list_var) {
                                        if (skip.isPositive()) {
                                            skip = Numbers.subtract(skip, (SubLObject)kbq_query_run.ONE_INTEGER);
                                        }
                                        else if (kbq_query_run.NIL != kb_query.kbq_runnableP(query_spec)) {
                                            if (kbq_query_run.NIL != kbq_query_run.$kbq_progress_stream$.getDynamicValue(thread)) {
                                                format_nil.force_format(kbq_query_run.$kbq_progress_stream$.getDynamicValue(thread), (SubLObject)kbq_query_run.$str171$_________________________________, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
                                                format_nil.force_format(kbq_query_run.$kbq_progress_stream$.getDynamicValue(thread), (SubLObject)kbq_query_run.$str172$______A____, query_spec, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
                                            }
                                            SubLObject query_run = (SubLObject)kbq_query_run.NIL;
                                            final SubLObject str = Sequences.cconcatenate((SubLObject)kbq_query_run.$str173$Running_, format_nil.format_nil_s_no_copy(query_spec));
                                            final SubLObject _prev_bind_0_$27 = utilities_macros.$progress_start_time$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$28 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$29 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                            final SubLObject _prev_bind_3_$30 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                                            final SubLObject _prev_bind_4_$31 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                                            final SubLObject _prev_bind_5_$32 = utilities_macros.$progress_count$.currentBinding(thread);
                                            final SubLObject _prev_bind_6_$33 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                                            final SubLObject _prev_bind_7_$34 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                            try {
                                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                                utilities_macros.$progress_notification_count$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
                                                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
                                                utilities_macros.$progress_count$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
                                                utilities_macros.$is_noting_progressP$.bind((SubLObject)kbq_query_run.T, thread);
                                                utilities_macros.$silent_progressP$.bind((SubLObject)((kbq_query_run.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kbq_query_run.T), thread);
                                                utilities_macros.noting_progress_preamble(str);
                                                query_run = kbq_run_query(query_spec, metrics, outlier_timeout, overriding_query_properties, include_resultsP, (SubLObject)kbq_query_run.UNPROVIDED);
                                                utilities_macros.noting_progress_postamble();
                                            }
                                            finally {
                                                utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$34, thread);
                                                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$33, thread);
                                                utilities_macros.$progress_count$.rebind(_prev_bind_5_$32, thread);
                                                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$31, thread);
                                                utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$30, thread);
                                                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$29, thread);
                                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$28, thread);
                                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$27, thread);
                                            }
                                            query_runs = (SubLObject)ConsesLow.cons(query_run, query_runs);
                                            if (output_stream.isStream()) {
                                                kbq_save_query_run(query_run, output_stream);
                                            }
                                            file_utilities.possibly_update_keepalive_file(keepalive_filename);
                                        }
                                        else {
                                            Errors.warn((SubLObject)kbq_query_run.$str174$Unrunnable_query____S, query_spec);
                                        }
                                        query_count = Numbers.add(query_count, (SubLObject)kbq_query_run.ONE_INTEGER);
                                        if (kbq_query_run.NIL != query_end && query_count.numGE(query_end)) {
                                            abort_kbq_run_query_set();
                                        }
                                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kbq_query_run.ONE_INTEGER), thread);
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        csome_list_var = csome_list_var.rest();
                                        query_spec = csome_list_var.first();
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        utilities_macros.noting_percent_progress_postamble();
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
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
                                utilities_macros.$progress_note$.rebind(_prev_bind_0_$26, thread);
                            }
                            if (output_stream.isStream()) {
                                streams_high.close(output_stream, (SubLObject)kbq_query_run.UNPROVIDED);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                sksi_sks_manager.execute_sks_registration_state(state);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                            }
                        }
                    }
                    finally {
                        sksi_macros.$within_sksi_sandboxP$.rebind(_prev_bind_0_$25, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    dummy = Errors.handleThrowable(ccatch_env_var, restart_tag);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                Errors.$restarts$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            catch_var = Errors.handleThrowable(ccatch_env_var2, (SubLObject)kbq_query_run.$kw167$ABORT_KBQ_RUN_QUERY_SET);
        }
        finally {
            thread.throwStack.pop();
        }
        query_runs = Sequences.nreverse(query_runs);
        final SubLObject query_set_run = kbq_make_query_set_run(query_runs, comment);
        return Values.values(query_set_run, query_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 60840L)
    public static SubLObject abort_kbq_run_query_set() {
        return Dynamic.sublisp_throw((SubLObject)kbq_query_run.$kw167$ABORT_KBQ_RUN_QUERY_SET, (SubLObject)kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 60932L)
    public static SubLObject kbq_query_spec_set_elements(final SubLObject query_spec_set, SubLObject randomize, SubLObject tail_queries) {
        if (randomize == kbq_query_run.UNPROVIDED) {
            randomize = (SubLObject)kbq_query_run.NIL;
        }
        if (tail_queries == kbq_query_run.UNPROVIDED) {
            tail_queries = (SubLObject)kbq_query_run.NIL;
        }
        if (kbq_query_run.NIL != list_utilities.list_of_type_p((SubLObject)kbq_query_run.$sym175$JANUS_OPERATION_P, query_spec_set)) {
            return ConsesLow.append(query_spec_set, tail_queries);
        }
        SubLObject v_answer = all_instantiations_via_inference(query_spec_set, kbq_query_run.$const176$EverythingPSC);
        if (kbq_query_run.NIL != randomize) {
            v_answer = list_utilities.randomize_list(v_answer);
        }
        else {
            v_answer = sort_queries_by_sksi_modules_needed(v_answer);
        }
        return ConsesLow.append(v_answer, tail_queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 61641L)
    public static SubLObject sort_queries_by_sksi_modules_needed(final SubLObject query_specs) {
        return sort_terms_by_sksi_modules_needed(query_specs, (SubLObject)kbq_query_run.$sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 61802L)
    public static SubLObject sort_tests_by_sksi_modules_needed(final SubLObject test_specs) {
        return sort_terms_by_sksi_modules_needed(test_specs, (SubLObject)kbq_query_run.$sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 61965L)
    public static SubLObject sort_terms_by_sksi_modules_needed(final SubLObject terms, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = kb_utilities.sort_terms(terms, (SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = kb_utilities.sort_terms(result, (SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.T, key, (SubLObject)kbq_query_run.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62271L)
    public static SubLObject sksi_modules_needed_sorted_memoized_internal(final SubLObject query_spec) {
        return kb_utilities.sort_terms(sksi_modules_needed(query_spec), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62271L)
    public static SubLObject sksi_modules_needed_sorted_memoized(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)kbq_query_run.NIL;
        if (kbq_query_run.NIL == v_memoization_state) {
            return sksi_modules_needed_sorted_memoized_internal(query_spec);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)kbq_query_run.$sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED, (SubLObject)kbq_query_run.UNPROVIDED);
        if (kbq_query_run.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)kbq_query_run.$sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED, (SubLObject)kbq_query_run.ONE_INTEGER, (SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.EQL, (SubLObject)kbq_query_run.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)kbq_query_run.$sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, query_spec, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_modules_needed_sorted_memoized_internal(query_spec)));
            memoization_state.caching_state_put(caching_state, query_spec, results, (SubLObject)kbq_query_run.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62409L)
    public static SubLObject query_sksi_modules_needed_sorted_memoized_internal(final SubLObject test_spec) {
        return kb_utilities.sort_terms(query_sksi_modules_needed(test_spec), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62409L)
    public static SubLObject query_sksi_modules_needed_sorted_memoized(final SubLObject test_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)kbq_query_run.NIL;
        if (kbq_query_run.NIL == v_memoization_state) {
            return query_sksi_modules_needed_sorted_memoized_internal(test_spec);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)kbq_query_run.$sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED, (SubLObject)kbq_query_run.UNPROVIDED);
        if (kbq_query_run.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)kbq_query_run.$sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED, (SubLObject)kbq_query_run.ONE_INTEGER, (SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.EQL, (SubLObject)kbq_query_run.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)kbq_query_run.$sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, test_spec, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_sksi_modules_needed_sorted_memoized_internal(test_spec)));
            memoization_state.caching_state_put(caching_state, test_spec, results, (SubLObject)kbq_query_run.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62557L)
    public static SubLObject all_instantiations_via_inference(final SubLObject v_set, final SubLObject mt) {
        final SubLObject collectionP = fort_types_interface.isa_collectionP(v_set, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject predicate = (kbq_query_run.NIL != collectionP) ? kbq_query_run.$const179$isa : kbq_query_run.$const180$elementOf;
        return ask_utilities.query_variable((SubLObject)kbq_query_run.$sym181$_OBJ, (SubLObject)ConsesLow.list(predicate, (SubLObject)kbq_query_run.$sym181$_OBJ, v_set), mt, (SubLObject)kbq_query_run.$list182);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 63266L)
    public static SubLObject kbq_test_collection_to_query_set(final SubLObject test_collection) {
        final SubLObject query = conses_high.subst(test_collection, (SubLObject)kbq_query_run.$kw184$TEST_COLLECTION, kbq_query_run.$kbq_test_collection_to_query_set_query$.getGlobalValue(), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        return ask_utilities.query_variable((SubLObject)kbq_query_run.$kw185$SET, query, kbq_query_run.$const176$EverythingPSC, (SubLObject)kbq_query_run.$list186).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 63522L)
    public static SubLObject run_kbq_query_spec_set_and_process_inferences(final SubLObject query_spec_set, final SubLObject process_method, SubLObject options) {
        if (options == kbq_query_run.UNPROVIDED) {
            options = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = options;
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw187$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kbq_query_run.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kbq_query_run.$str188$Processing_KB_Queries);
        final SubLObject query_specs = kbq_query_spec_set_elements(query_spec_set, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject message_var = progress_message;
        final SubLObject list_var = query_specs;
        SubLObject sofar = (SubLObject)kbq_query_run.ZERO_INTEGER;
        final SubLObject total = Sequences.length(list_var);
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbq_query_run.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbq_query_run.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message_var);
                SubLObject cdolist_list_var = list_var;
                SubLObject kbq = (SubLObject)kbq_query_run.NIL;
                kbq = cdolist_list_var.first();
                while (kbq_query_run.NIL != cdolist_list_var) {
                    utilities_macros.note_percent_progress(sofar, total);
                    sofar = Numbers.add(sofar, (SubLObject)kbq_query_run.ONE_INTEGER);
                    SubLObject catch_var = (SubLObject)kbq_query_run.NIL;
                    try {
                        thread.throwStack.push(kbq_query_run.$kw189$SKIP_KBQ);
                        final SubLObject restart_tag = (SubLObject)kbq_query_run.$kw189$SKIP_KBQ;
                        SubLObject dummy = (SubLObject)kbq_query_run.NIL;
                        final SubLObject _prev_bind_0_$38 = Errors.$restarts$.currentBinding(thread);
                        try {
                            Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(restart_tag, (SubLObject)kbq_query_run.$str190$Skip_KBQ__S, kbq), Errors.$restarts$.getDynamicValue(thread)), thread);
                            try {
                                thread.throwStack.push(restart_tag);
                                run_kbq_and_process_inferences(kbq, process_method, options);
                            }
                            catch (Throwable ccatch_env_var) {
                                dummy = Errors.handleThrowable(ccatch_env_var, restart_tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                        }
                        finally {
                            Errors.$restarts$.rebind(_prev_bind_0_$38, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var2) {
                        catch_var = Errors.handleThrowable(ccatch_env_var2, (SubLObject)kbq_query_run.$kw189$SKIP_KBQ);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    kbq = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.length(query_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 64564L)
    public static SubLObject run_kbq_and_process_inferences(final SubLObject kbq, final SubLObject process_method, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject additional_args_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw191$ADDITIONAL_ARGS, options);
        final SubLObject additional_args = (SubLObject)((kbq_query_run.NIL != additional_args_tail) ? conses_high.cadr(additional_args_tail) : kbq_query_run.NIL);
        final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw130$OUTLIER_TIMEOUT, options);
        final SubLObject outlier_timeout = (SubLObject)((kbq_query_run.NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : kbq_query_run.NIL);
        final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw137$OVERRIDING_QUERY_PROPERTIES, options);
        final SubLObject overriding_query_properties = (SubLObject)((kbq_query_run.NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : kbq_query_run.NIL);
        inference_datastructures_problem_store.destroy_all_problem_stores();
        kb_cleanup.forget_ephemeral_terms((SubLObject)kbq_query_run.NIL);
        SubLObject message_var = (SubLObject)kbq_query_run.NIL;
        final SubLObject was_appendingP = Eval.eval((SubLObject)kbq_query_run.$sym192$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
        Eval.eval((SubLObject)kbq_query_run.$list193);
        try {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)kbq_query_run.$sym122$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        run_kbq_and_generate_inferences(kbq, outlier_timeout, overriding_query_properties);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)kbq_query_run.NIL);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                Eval.eval((SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym194$CSETQ, (SubLObject)kbq_query_run.$sym192$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn((SubLObject)kbq_query_run.$str195$_A, message_var);
        }
        final SubLObject inferences = inference_datastructures_inference.all_inferences();
        return process_all_kbq_inferences(process_method, kbq, inferences, additional_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 65080L)
    public static SubLObject run_kbq_and_generate_inferences(final SubLObject kbq, final SubLObject outlier_timeout, SubLObject overriding_query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mandatory_overrides = (SubLObject)kbq_query_run.$list196;
        overriding_query_properties = list_utilities.merge_plist(mandatory_overrides, overriding_query_properties);
        final SubLObject _prev_bind_0 = control_vars.$kbq_run_query_auto_destroy_enabledP$.currentBinding(thread);
        try {
            control_vars.$kbq_run_query_auto_destroy_enabledP$.bind((SubLObject)kbq_query_run.NIL, thread);
            kbq_run_query(kbq, (SubLObject)kbq_query_run.NIL, outlier_timeout, overriding_query_properties, (SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.UNPROVIDED);
        }
        finally {
            control_vars.$kbq_run_query_auto_destroy_enabledP$.rebind(_prev_bind_0, thread);
        }
        return Sequences.length(inference_datastructures_inference.all_inferences());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 65625L)
    public static SubLObject process_all_kbq_inferences(final SubLObject process_method, final SubLObject kbq, final SubLObject inferences, final SubLObject additional_args) {
        return Functions.funcall(process_method, kbq, inferences, additional_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 65882L)
    public static SubLObject kct_run_test_set(final SubLObject test_spec_set, SubLObject overriding_metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultsP, SubLObject comment, SubLObject output_filename, SubLObject expose_runstateP, SubLObject skip, SubLObject count, SubLObject randomize, SubLObject file_mode, SubLObject tail_tests, SubLObject keepalive_filename) {
        if (overriding_metrics == kbq_query_run.UNPROVIDED) {
            overriding_metrics = (SubLObject)kbq_query_run.NIL;
        }
        if (outlier_timeout == kbq_query_run.UNPROVIDED) {
            outlier_timeout = kbq_query_run.$kbq_outlier_timeout$.getDynamicValue();
        }
        if (overriding_query_properties == kbq_query_run.UNPROVIDED) {
            overriding_query_properties = (SubLObject)kbq_query_run.NIL;
        }
        if (include_resultsP == kbq_query_run.UNPROVIDED) {
            include_resultsP = (SubLObject)kbq_query_run.NIL;
        }
        if (comment == kbq_query_run.UNPROVIDED) {
            comment = (SubLObject)kbq_query_run.NIL;
        }
        if (output_filename == kbq_query_run.UNPROVIDED) {
            output_filename = (SubLObject)kbq_query_run.NIL;
        }
        if (expose_runstateP == kbq_query_run.UNPROVIDED) {
            expose_runstateP = (SubLObject)kbq_query_run.NIL;
        }
        if (skip == kbq_query_run.UNPROVIDED) {
            skip = (SubLObject)kbq_query_run.ZERO_INTEGER;
        }
        if (count == kbq_query_run.UNPROVIDED) {
            count = (SubLObject)kbq_query_run.NIL;
        }
        if (randomize == kbq_query_run.UNPROVIDED) {
            randomize = (SubLObject)kbq_query_run.NIL;
        }
        if (file_mode == kbq_query_run.UNPROVIDED) {
            file_mode = (SubLObject)kbq_query_run.$kw165$OUTPUT;
        }
        if (tail_tests == kbq_query_run.UNPROVIDED) {
            tail_tests = (SubLObject)kbq_query_run.NIL;
        }
        if (keepalive_filename == kbq_query_run.UNPROVIDED) {
            keepalive_filename = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_specs = kct_test_spec_set_elements(test_spec_set, randomize, tail_tests);
        final SubLObject test_end = (SubLObject)((kbq_query_run.NIL != count) ? Numbers.add(skip, count) : kbq_query_run.NIL);
        SubLObject test_count = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject test_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject output_stream = (SubLObject)kbq_query_run.NIL;
        SubLObject kct_set_runstate = (SubLObject)kbq_query_run.NIL;
        if (kbq_query_run.NIL != expose_runstateP) {
            kct_set_runstate = new_kct_set_runstate(test_spec_set);
            kct_thinking.kct_thinking_set_runstate_id(kctsr_id(kct_set_runstate), (SubLObject)kbq_query_run.UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = kbq_query_run.$kct_set_runstate$.currentBinding(thread);
        try {
            kbq_query_run.$kct_set_runstate$.bind(kct_set_runstate, thread);
            SubLObject catch_var = (SubLObject)kbq_query_run.NIL;
            try {
                thread.throwStack.push(kbq_query_run.$kw197$ABORT_KCT_RUN_TEST_SET);
                final SubLObject restart_tag = (SubLObject)kbq_query_run.$kw197$ABORT_KCT_RUN_TEST_SET;
                SubLObject dummy = (SubLObject)kbq_query_run.NIL;
                final SubLObject _prev_bind_0_$40 = Errors.$restarts$.currentBinding(thread);
                try {
                    Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(restart_tag, (SubLObject)kbq_query_run.$str198$Abort_KCT_run_test_set), Errors.$restarts$.getDynamicValue(thread)), thread);
                    try {
                        thread.throwStack.push(restart_tag);
                        final SubLObject state = sksi_sks_manager.current_sks_registration_state();
                        final SubLObject _prev_bind_0_$41 = sksi_macros.$within_sksi_sandboxP$.currentBinding(thread);
                        try {
                            sksi_macros.$within_sksi_sandboxP$.bind((SubLObject)kbq_query_run.T, thread);
                            try {
                                try {
                                    if (kbq_query_run.NIL != output_filename) {
                                        output_stream = kct_open_test_set_run_output_stream(output_filename, file_mode);
                                    }
                                    if (kbq_query_run.NIL != output_stream && kbq_query_run.$kw165$OUTPUT == file_mode) {
                                        kct_save_test_set_run_preamble(output_stream, comment);
                                    }
                                    final SubLObject list_var = test_specs;
                                    final SubLObject _prev_bind_0_$42 = utilities_macros.$progress_note$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$progress_note$.bind((SubLObject)kbq_query_run.$str199$KCT_running_test_set, thread);
                                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                                        utilities_macros.$progress_sofar$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbq_query_run.NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbq_query_run.T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                                        try {
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            SubLObject csome_list_var = list_var;
                                            SubLObject test_spec = (SubLObject)kbq_query_run.NIL;
                                            test_spec = csome_list_var.first();
                                            while (kbq_query_run.NIL != csome_list_var) {
                                                if (skip.isPositive()) {
                                                    skip = Numbers.subtract(skip, (SubLObject)kbq_query_run.ONE_INTEGER);
                                                }
                                                else if (kbq_query_run.NIL != kct_utils.kct_test_runnableP(test_spec)) {
                                                    if (kbq_query_run.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
                                                        format_nil.force_format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str200$__Running__s__, test_spec, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
                                                    }
                                                    final SubLObject test_run = kct_run_test(test_spec, overriding_metrics, outlier_timeout, overriding_query_properties, include_resultsP, expose_runstateP);
                                                    test_runs = (SubLObject)ConsesLow.cons(test_run, test_runs);
                                                    if (output_stream.isStream()) {
                                                        kct_save_test_run(test_run, output_stream);
                                                    }
                                                    file_utilities.possibly_update_keepalive_file(keepalive_filename);
                                                }
                                                else {
                                                    Errors.warn((SubLObject)kbq_query_run.$str201$Unrunnable_test____S, test_spec);
                                                }
                                                test_count = Numbers.add(test_count, (SubLObject)kbq_query_run.ONE_INTEGER);
                                                if (kbq_query_run.NIL != test_end && test_count.numGE(test_end)) {
                                                    abort_kct_run_test_set();
                                                }
                                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kbq_query_run.ONE_INTEGER), thread);
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                csome_list_var = csome_list_var.rest();
                                                test_spec = csome_list_var.first();
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                utilities_macros.noting_percent_progress_postamble();
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
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
                                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$42, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (output_stream.isStream()) {
                                            streams_high.close(output_stream, (SubLObject)kbq_query_run.UNPROVIDED);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                    }
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    sksi_sks_manager.execute_sks_registration_state(state);
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                }
                            }
                        }
                        finally {
                            sksi_macros.$within_sksi_sandboxP$.rebind(_prev_bind_0_$41, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        dummy = Errors.handleThrowable(ccatch_env_var, restart_tag);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                finally {
                    Errors.$restarts$.rebind(_prev_bind_0_$40, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                catch_var = Errors.handleThrowable(ccatch_env_var2, (SubLObject)kbq_query_run.$kw197$ABORT_KCT_RUN_TEST_SET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            kbq_query_run.$kct_set_runstate$.rebind(_prev_bind_0, thread);
        }
        test_runs = Sequences.nreverse(test_runs);
        final SubLObject test_set_run = kct_make_test_set_run(test_runs, comment);
        if (kbq_query_run.NIL != kct_set_runstate_p(kct_set_runstate)) {
            set_kctsr_result(kct_set_runstate, test_set_run);
        }
        return Values.values(test_set_run, test_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 68353L)
    public static SubLObject abort_kct_run_test_set() {
        return Dynamic.sublisp_throw((SubLObject)kbq_query_run.$kw197$ABORT_KCT_RUN_TEST_SET, (SubLObject)kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 68443L)
    public static SubLObject kct_test_spec_set_elements(final SubLObject test_spec_set, SubLObject randomize, SubLObject tail_tests) {
        if (randomize == kbq_query_run.UNPROVIDED) {
            randomize = (SubLObject)kbq_query_run.NIL;
        }
        if (tail_tests == kbq_query_run.UNPROVIDED) {
            tail_tests = (SubLObject)kbq_query_run.NIL;
        }
        if (kbq_query_run.NIL != list_utilities.list_of_type_p((SubLObject)kbq_query_run.$sym175$JANUS_OPERATION_P, test_spec_set)) {
            return ConsesLow.append(test_spec_set, tail_tests);
        }
        SubLObject v_answer = all_instantiations_via_inference(test_spec_set, kbq_query_run.$const176$EverythingPSC);
        if (kbq_query_run.NIL != randomize) {
            v_answer = list_utilities.randomize_list(v_answer);
        }
        else {
            v_answer = sort_tests_by_sksi_modules_needed(v_answer);
        }
        return ConsesLow.append(v_answer, tail_tests);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 69135L)
    public static SubLObject run_kbq_experiment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = (SubLObject)kbq_query_run.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kbq_query_run.NIL;
        SubLObject current_$46 = (SubLObject)kbq_query_run.NIL;
        while (kbq_query_run.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbq_query_run.$list202);
            current_$46 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbq_query_run.$list202);
            if (kbq_query_run.NIL == conses_high.member(current_$46, (SubLObject)kbq_query_run.$list203, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                bad = (SubLObject)kbq_query_run.T;
            }
            if (current_$46 == kbq_query_run.$kw82$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kbq_query_run.NIL != bad && kbq_query_run.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbq_query_run.$list202);
        }
        final SubLObject query_spec_set_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw204$QUERY_SPEC_SET, current);
        final SubLObject query_spec_set = (SubLObject)((kbq_query_run.NIL != query_spec_set_tail) ? conses_high.cadr(query_spec_set_tail) : kbq_query_run.NIL);
        final SubLObject filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw205$FILENAME, current);
        final SubLObject filename = (SubLObject)((kbq_query_run.NIL != filename_tail) ? conses_high.cadr(filename_tail) : kbq_query_run.NIL);
        final SubLObject analysis_filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw206$ANALYSIS_FILENAME, current);
        final SubLObject analysis_filename = (SubLObject)((kbq_query_run.NIL != analysis_filename_tail) ? conses_high.cadr(analysis_filename_tail) : kbq_query_run.NIL);
        final SubLObject keepalive_filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw207$KEEPALIVE_FILENAME, current);
        final SubLObject keepalive_filename = (SubLObject)((kbq_query_run.NIL != keepalive_filename_tail) ? conses_high.cadr(keepalive_filename_tail) : kbq_query_run.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw77$COMMENT, current);
        final SubLObject comment = (SubLObject)((kbq_query_run.NIL != comment_tail) ? conses_high.cadr(comment_tail) : kbq_query_run.NIL);
        final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw137$OVERRIDING_QUERY_PROPERTIES, current);
        final SubLObject overriding_query_properties = (SubLObject)((kbq_query_run.NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : kbq_query_run.NIL);
        final SubLObject metrics_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw118$METRICS, current);
        final SubLObject metrics = (SubLObject)((kbq_query_run.NIL != metrics_tail) ? conses_high.cadr(metrics_tail) : kbq_query_run.$list208);
        final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw130$OUTLIER_TIMEOUT, current);
        final SubLObject outlier_timeout = (SubLObject)((kbq_query_run.NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : kbq_query_run.$sym209$_KBQ_DEFAULT_OUTLIER_TIMEOUT_);
        final SubLObject incremental_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw210$INCREMENTAL, current);
        final SubLObject incremental = (SubLObject)((kbq_query_run.NIL != incremental_tail) ? conses_high.cadr(incremental_tail) : kbq_query_run.NIL);
        final SubLObject include_results_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw211$INCLUDE_RESULTS, current);
        final SubLObject include_results = (SubLObject)((kbq_query_run.NIL != include_results_tail) ? conses_high.cadr(include_results_tail) : kbq_query_run.T);
        final SubLObject randomize_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw212$RANDOMIZE, current);
        final SubLObject randomize = (SubLObject)((kbq_query_run.NIL != randomize_tail) ? conses_high.cadr(randomize_tail) : kbq_query_run.NIL);
        final SubLObject skip_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw213$SKIP, current);
        final SubLObject skip = (SubLObject)((kbq_query_run.NIL != skip_tail) ? conses_high.cadr(skip_tail) : kbq_query_run.ZERO_INTEGER);
        final SubLObject count_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw214$COUNT, current);
        final SubLObject count = (SubLObject)((kbq_query_run.NIL != count_tail) ? conses_high.cadr(count_tail) : kbq_query_run.NIL);
        final SubLObject if_file_exists_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw215$IF_FILE_EXISTS, current);
        final SubLObject if_file_exists = (SubLObject)((kbq_query_run.NIL != if_file_exists_tail) ? conses_high.cadr(if_file_exists_tail) : kbq_query_run.$kw216$OVERWRITE);
        return (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym217$RUN_KBQ_EXPERIMENT_INTERNAL, (SubLObject)ConsesLow.list(new SubLObject[] { kbq_query_run.$sym218$LIST, kbq_query_run.$kw204$QUERY_SPEC_SET, query_spec_set, kbq_query_run.$kw205$FILENAME, filename, kbq_query_run.$kw206$ANALYSIS_FILENAME, analysis_filename, kbq_query_run.$kw207$KEEPALIVE_FILENAME, keepalive_filename, kbq_query_run.$kw77$COMMENT, comment, kbq_query_run.$kw137$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, kbq_query_run.$kw118$METRICS, metrics, kbq_query_run.$kw130$OUTLIER_TIMEOUT, outlier_timeout, kbq_query_run.$kw210$INCREMENTAL, incremental, kbq_query_run.$kw211$INCLUDE_RESULTS, include_results, kbq_query_run.$kw212$RANDOMIZE, randomize, kbq_query_run.$kw213$SKIP, skip, kbq_query_run.$kw214$COUNT, count, kbq_query_run.$kw215$IF_FILE_EXISTS, if_file_exists }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 71006L)
    public static SubLObject last_query_set_run() {
        return kbq_query_run.$last_query_set_run$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 71077L)
    public static SubLObject run_kbq_experiment_internal(final SubLObject experiment_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_spec_set_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw204$QUERY_SPEC_SET, experiment_parameters);
        SubLObject query_spec_set = (SubLObject)((kbq_query_run.NIL != query_spec_set_tail) ? conses_high.cadr(query_spec_set_tail) : kbq_query_run.NIL);
        final SubLObject filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw205$FILENAME, experiment_parameters);
        SubLObject filename = (SubLObject)((kbq_query_run.NIL != filename_tail) ? conses_high.cadr(filename_tail) : kbq_query_run.NIL);
        final SubLObject analysis_filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw206$ANALYSIS_FILENAME, experiment_parameters);
        final SubLObject analysis_filename = (SubLObject)((kbq_query_run.NIL != analysis_filename_tail) ? conses_high.cadr(analysis_filename_tail) : kbq_query_run.NIL);
        final SubLObject keepalive_filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw207$KEEPALIVE_FILENAME, experiment_parameters);
        final SubLObject keepalive_filename = (SubLObject)((kbq_query_run.NIL != keepalive_filename_tail) ? conses_high.cadr(keepalive_filename_tail) : kbq_query_run.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw77$COMMENT, experiment_parameters);
        final SubLObject comment = (SubLObject)((kbq_query_run.NIL != comment_tail) ? conses_high.cadr(comment_tail) : kbq_query_run.NIL);
        final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw137$OVERRIDING_QUERY_PROPERTIES, experiment_parameters);
        final SubLObject overriding_query_properties = (SubLObject)((kbq_query_run.NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : kbq_query_run.NIL);
        final SubLObject metrics_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw118$METRICS, experiment_parameters);
        final SubLObject metrics = (kbq_query_run.NIL != metrics_tail) ? conses_high.cadr(metrics_tail) : inference_datastructures_enumerated_types.all_query_metrics();
        final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw130$OUTLIER_TIMEOUT, experiment_parameters);
        final SubLObject outlier_timeout = (kbq_query_run.NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue();
        final SubLObject randomize_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw212$RANDOMIZE, experiment_parameters);
        final SubLObject randomize = (SubLObject)((kbq_query_run.NIL != randomize_tail) ? conses_high.cadr(randomize_tail) : kbq_query_run.NIL);
        final SubLObject skip_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw213$SKIP, experiment_parameters);
        final SubLObject skip = (SubLObject)((kbq_query_run.NIL != skip_tail) ? conses_high.cadr(skip_tail) : kbq_query_run.ZERO_INTEGER);
        final SubLObject count_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw214$COUNT, experiment_parameters);
        final SubLObject count = (SubLObject)((kbq_query_run.NIL != count_tail) ? conses_high.cadr(count_tail) : kbq_query_run.NIL);
        final SubLObject incremental_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw210$INCREMENTAL, experiment_parameters);
        final SubLObject incremental = (SubLObject)((kbq_query_run.NIL != incremental_tail) ? conses_high.cadr(incremental_tail) : kbq_query_run.T);
        final SubLObject include_results_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw211$INCLUDE_RESULTS, experiment_parameters);
        final SubLObject include_results = (SubLObject)((kbq_query_run.NIL != include_results_tail) ? conses_high.cadr(include_results_tail) : kbq_query_run.T);
        final SubLObject if_file_exists_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw215$IF_FILE_EXISTS, experiment_parameters);
        final SubLObject if_file_exists = (SubLObject)((kbq_query_run.NIL != if_file_exists_tail) ? conses_high.cadr(if_file_exists_tail) : kbq_query_run.$kw216$OVERWRITE);
        assert kbq_query_run.NIL != kbq_if_file_exists_handling_p(if_file_exists) : if_file_exists;
        SubLObject query_set_run = (SubLObject)kbq_query_run.NIL;
        SubLObject time = (SubLObject)kbq_query_run.NIL;
        SubLObject tail_queries = (SubLObject)kbq_query_run.NIL;
        SubLObject file_mode = (SubLObject)kbq_query_run.$kw165$OUTPUT;
        final SubLObject original_filename = filename;
        final SubLObject entire_query_set_runP = (SubLObject)SubLObjectFactory.makeBoolean(kbq_query_run.NIL == file_utilities.file_existsP(original_filename));
        if (kbq_query_run.NIL != filename) {
            thread.resetMultipleValues();
            final SubLObject query_spec_set_$47 = kbq_setup_file_handling(query_spec_set, filename, if_file_exists);
            final SubLObject filename_$48 = thread.secondMultipleValue();
            final SubLObject file_mode_$49 = thread.thirdMultipleValue();
            final SubLObject tail_queries_$50 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            query_spec_set = query_spec_set_$47;
            filename = filename_$48;
            file_mode = file_mode_$49;
            tail_queries = tail_queries_$50;
        }
        if (kbq_query_run.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str222$__run_starting_at__A, numeric_date_utilities.timestring((SubLObject)kbq_query_run.UNPROVIDED));
        }
        final SubLObject time_var = Time.get_internal_real_time();
        query_set_run = kbq_run_query_set(query_spec_set, metrics, outlier_timeout, overriding_query_properties, include_results, comment, (SubLObject)((kbq_query_run.NIL != incremental) ? filename : kbq_query_run.NIL), skip, count, randomize, file_mode, tail_queries, keepalive_filename);
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (kbq_query_run.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str223$__run_ended_at__A, numeric_date_utilities.timestring((SubLObject)kbq_query_run.UNPROVIDED));
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str224$__elapsed_time____A, numeric_date_utilities.elapsed_seconds_string(Numbers.truncate(time, (SubLObject)kbq_query_run.UNPROVIDED)));
        }
        if (kbq_query_run.NIL == incremental && kbq_query_run.NIL != filename) {
            kbq_save_query_set_run(query_set_run, filename);
        }
        kbq_query_run.$last_query_set_run$.setGlobalValue(query_set_run);
        if (kbq_query_run.NIL != analysis_filename) {
            final SubLObject analysis_query_set_run = (kbq_query_run.NIL != entire_query_set_runP) ? query_set_run : kbq_load_query_set_run_and_merge_reruns(original_filename);
            print_kbq_experiment_analysis_to_file(analysis_filename, analysis_query_set_run, metrics);
            print_experiment_csv_to_file(analysis_filename, analysis_query_set_run);
        }
        return time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 73042L)
    public static SubLObject print_kbq_experiment_analysis_to_file(final SubLObject analysis_filename, final SubLObject query_set_run, final SubLObject metrics) {
        final SubLObject analysis = kbq_analyze_query_set_run(query_set_run, metrics);
        SubLObject stream = (SubLObject)kbq_query_run.NIL;
        try {
            stream = compatibility.open_text(analysis_filename, (SubLObject)kbq_query_run.$kw165$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)kbq_query_run.$str225$Unable_to_open__S, analysis_filename);
            }
            final SubLObject s = stream;
            list_utilities.pretty_print_plist(analysis, s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)kbq_query_run.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kbq_query_run.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 73313L)
    public static SubLObject kbq_erroring_queries(final SubLObject query_set_run) {
        SubLObject queries = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            if (kbq_query_run.NIL != kbq_erroring_query_runP(query_run)) {
                queries = (SubLObject)ConsesLow.cons(kbq_query_run_query(query_run), queries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 73895L)
    public static SubLObject kbq_erroring_query_count(final SubLObject query_set_run) {
        return kbq_count_erroring_query_runs(kbq_query_set_run_query_runs(query_set_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 74041L)
    public static SubLObject kbq_count_erroring_query_runs(final SubLObject query_runs) {
        return Sequences.count_if((SubLObject)kbq_query_run.$sym226$KBQ_ERRORING_QUERY_RUN_, query_runs, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 74159L)
    public static SubLObject kbq_erroring_query_runP(final SubLObject query_run) {
        final SubLObject halt_reason = kbq_query_run_halt_reason(query_run);
        return inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 74335L)
    public static SubLObject kbq_if_file_exists_handling_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, (SubLObject)kbq_query_run.$list227);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 74482L)
    public static SubLObject kbq_experiment_augmentability_status(final SubLObject query_spec_set, final SubLObject filename) {
        final SubLObject old_query_set_run = kbq_load_query_set_run(filename);
        final SubLObject old_query_count = kbq_query_set_run_query_count(old_query_set_run);
        final SubLObject query_count = Sequences.length(kbq_query_spec_set_elements(query_spec_set, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED));
        final SubLObject not_yet_run_query_count = Numbers.subtract(query_count, old_query_count);
        final SubLObject erroring_query_count = kbq_erroring_query_count(old_query_set_run);
        return Values.values(not_yet_run_query_count, erroring_query_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 75123L)
    public static SubLObject kbq_setup_file_handling(final SubLObject query_spec_set, final SubLObject filename, SubLObject if_file_exists) {
        assert kbq_query_run.NIL != kbq_if_file_exists_handling_p(if_file_exists) : if_file_exists;
        if (kbq_query_run.NIL == Filesys.probe_file(filename)) {
            if_file_exists = (SubLObject)kbq_query_run.$kw216$OVERWRITE;
        }
        final SubLObject pcase_var = if_file_exists;
        if (pcase_var.eql((SubLObject)kbq_query_run.$kw216$OVERWRITE)) {
            return Values.values(query_spec_set, filename, (SubLObject)kbq_query_run.$kw165$OUTPUT, (SubLObject)kbq_query_run.NIL);
        }
        if (pcase_var.eql((SubLObject)kbq_query_run.$kw228$AUGMENT)) {
            final SubLObject queries_not_yet_run = kbq_queries_not_yet_run(query_spec_set, filename);
            final SubLObject possible_crash_query = queries_not_yet_run.first();
            final SubLObject rest_queries = queries_not_yet_run.rest();
            return Values.values(el_utilities.make_el_set(rest_queries, (SubLObject)kbq_query_run.UNPROVIDED), filename, (SubLObject)kbq_query_run.$kw229$APPEND, (SubLObject)ConsesLow.list(possible_crash_query));
        }
        if (pcase_var.eql((SubLObject)kbq_query_run.$kw230$RERUN_ERRORS)) {
            final SubLObject old_query_set_run = kbq_load_query_set_run_and_merge_reruns(filename);
            final SubLObject queries_to_rerun = kbq_erroring_queries(old_query_set_run);
            final SubLObject filename_without_extension = kbq_strip_suffix_from_filename(filename);
            final SubLObject new_filename = kbq_compute_rerun_errors_filename(filename_without_extension);
            return Values.values(el_utilities.make_el_set(queries_to_rerun, (SubLObject)kbq_query_run.UNPROVIDED), new_filename, (SubLObject)kbq_query_run.$kw165$OUTPUT, (SubLObject)kbq_query_run.NIL);
        }
        if (!pcase_var.eql((SubLObject)kbq_query_run.$kw231$AUGMENT_OR_RERUN_ERRORS)) {
            return Errors.error((SubLObject)kbq_query_run.$str232$unexpected_if_file_exists__s, if_file_exists);
        }
        final SubLObject queries_not_yet_run = kbq_queries_not_yet_run(query_spec_set, filename);
        if (kbq_query_run.NIL != queries_not_yet_run) {
            return kbq_setup_file_handling(query_spec_set, filename, (SubLObject)kbq_query_run.$kw228$AUGMENT);
        }
        return kbq_setup_file_handling(query_spec_set, filename, (SubLObject)kbq_query_run.$kw230$RERUN_ERRORS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 76638L)
    public static SubLObject kbq_queries_not_yet_run(final SubLObject query_spec_set, final SubLObject filename) {
        final SubLObject old_query_set_run = kbq_load_query_set_run(filename);
        final SubLObject old_queries = kbq_query_set_run_queries(old_query_set_run);
        final SubLObject queries = kbq_query_spec_set_elements(query_spec_set, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        return kb_utilities.sort_terms(list_utilities.remove_if_not((SubLObject)kbq_query_run.$sym85$KBQ_RUNNABLE_, list_utilities.fast_set_difference(queries, old_queries, Symbols.symbol_function((SubLObject)kbq_query_run.EQUAL)), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 77010L)
    public static SubLObject kbq_compute_rerun_errors_filename(final SubLObject filename_without_extension) {
        SubLObject i = (SubLObject)kbq_query_run.ONE_INTEGER;
        SubLObject filename = (SubLObject)kbq_query_run.NIL;
        while (kbq_query_run.NIL == filename) {
            final SubLObject candidate_filename = kbq_candidate_rerun_errors_filename(filename_without_extension, i);
            if (kbq_query_run.NIL != Filesys.probe_file(candidate_filename)) {
                i = Numbers.add(i, (SubLObject)kbq_query_run.ONE_INTEGER);
            }
            else {
                filename = candidate_filename;
            }
        }
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 77368L)
    public static SubLObject kbq_candidate_rerun_errors_filename(final SubLObject filename_without_extension, final SubLObject i) {
        final SubLObject i_str = string_utilities.str(i);
        final SubLObject candidate_filename = Sequences.cconcatenate(filename_without_extension, new SubLObject[] { kbq_query_run.$str233$_rerun_errors_, i_str, kbq_query_run.$query_set_run_file_extension$.getGlobalValue() });
        return candidate_filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 77628L)
    public static SubLObject kbq_load_query_set_run_and_merge_reruns(final SubLObject filename) {
        SubLObject query_set_run = kbq_load_query_set_run(filename);
        final SubLObject filename_without_extension = kbq_strip_suffix_from_filename(filename);
        SubLObject i = (SubLObject)kbq_query_run.ONE_INTEGER;
        SubLObject doneP = (SubLObject)kbq_query_run.NIL;
        while (kbq_query_run.NIL == doneP) {
            final SubLObject rerun_filename = kbq_candidate_rerun_errors_filename(filename_without_extension, i);
            if (kbq_query_run.NIL != Filesys.probe_file(rerun_filename)) {
                final SubLObject query_set_rerun = kbq_load_query_set_run(rerun_filename);
                query_set_run = kbq_merge_query_set_run_with_rerun(query_set_run, query_set_rerun);
                i = Numbers.add(i, (SubLObject)kbq_query_run.ONE_INTEGER);
            }
            else {
                doneP = (SubLObject)kbq_query_run.T;
            }
        }
        return query_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 78240L)
    public static SubLObject kbq_merge_query_set_run_with_rerun(final SubLObject query_set_run, final SubLObject query_set_rerun) {
        final SubLObject query_runs = conses_high.copy_list(kbq_query_set_run_query_runs(query_set_run));
        SubLObject cons;
        SubLObject query_run;
        SubLObject query;
        SubLObject query_rerun;
        for (cons = (SubLObject)kbq_query_run.NIL, cons = query_runs; !cons.isAtom(); cons = cons.rest()) {
            query_run = cons.first();
            if (kbq_query_run.NIL != kbq_erroring_query_runP(query_run)) {
                query = kbq_query_run_query(query_run);
                query_rerun = kbq_lookup_query_run(query_set_rerun, query);
                if (kbq_query_run.NIL != query_rerun) {
                    ConsesLow.rplaca(cons, query_rerun);
                }
            }
        }
        SubLObject new_query_set_run = conses_high.copy_list(query_set_run);
        new_query_set_run = conses_high.putf(new_query_set_run, (SubLObject)kbq_query_run.$kw78$QUERY_RUNS, query_runs);
        return new_query_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 78969L)
    public static SubLObject run_kct_experiment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = (SubLObject)kbq_query_run.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kbq_query_run.NIL;
        SubLObject current_$51 = (SubLObject)kbq_query_run.NIL;
        while (kbq_query_run.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbq_query_run.$list234);
            current_$51 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbq_query_run.$list234);
            if (kbq_query_run.NIL == conses_high.member(current_$51, (SubLObject)kbq_query_run.$list235, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                bad = (SubLObject)kbq_query_run.T;
            }
            if (current_$51 == kbq_query_run.$kw82$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kbq_query_run.NIL != bad && kbq_query_run.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbq_query_run.$list234);
        }
        final SubLObject test_spec_set_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw236$TEST_SPEC_SET, current);
        final SubLObject test_spec_set = (SubLObject)((kbq_query_run.NIL != test_spec_set_tail) ? conses_high.cadr(test_spec_set_tail) : kbq_query_run.NIL);
        final SubLObject filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw205$FILENAME, current);
        final SubLObject filename = (SubLObject)((kbq_query_run.NIL != filename_tail) ? conses_high.cadr(filename_tail) : kbq_query_run.NIL);
        final SubLObject analysis_filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw206$ANALYSIS_FILENAME, current);
        final SubLObject analysis_filename = (SubLObject)((kbq_query_run.NIL != analysis_filename_tail) ? conses_high.cadr(analysis_filename_tail) : kbq_query_run.NIL);
        final SubLObject keepalive_filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw207$KEEPALIVE_FILENAME, current);
        final SubLObject keepalive_filename = (SubLObject)((kbq_query_run.NIL != keepalive_filename_tail) ? conses_high.cadr(keepalive_filename_tail) : kbq_query_run.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw77$COMMENT, current);
        final SubLObject comment = (SubLObject)((kbq_query_run.NIL != comment_tail) ? conses_high.cadr(comment_tail) : kbq_query_run.NIL);
        final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw137$OVERRIDING_QUERY_PROPERTIES, current);
        final SubLObject overriding_query_properties = (SubLObject)((kbq_query_run.NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : kbq_query_run.NIL);
        final SubLObject overriding_metrics_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw237$OVERRIDING_METRICS, current);
        final SubLObject overriding_metrics = (SubLObject)((kbq_query_run.NIL != overriding_metrics_tail) ? conses_high.cadr(overriding_metrics_tail) : kbq_query_run.$list208);
        final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw130$OUTLIER_TIMEOUT, current);
        final SubLObject outlier_timeout = (SubLObject)((kbq_query_run.NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : kbq_query_run.$sym238$_KBQ_OUTLIER_TIMEOUT_);
        final SubLObject incremental_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw210$INCREMENTAL, current);
        final SubLObject incremental = (SubLObject)((kbq_query_run.NIL != incremental_tail) ? conses_high.cadr(incremental_tail) : kbq_query_run.NIL);
        final SubLObject include_results_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw211$INCLUDE_RESULTS, current);
        final SubLObject include_results = (SubLObject)((kbq_query_run.NIL != include_results_tail) ? conses_high.cadr(include_results_tail) : kbq_query_run.T);
        final SubLObject if_file_exists_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw215$IF_FILE_EXISTS, current);
        final SubLObject if_file_exists = (SubLObject)((kbq_query_run.NIL != if_file_exists_tail) ? conses_high.cadr(if_file_exists_tail) : kbq_query_run.$kw216$OVERWRITE);
        final SubLObject expose_runstate_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw239$EXPOSE_RUNSTATE, current);
        final SubLObject expose_runstate = (SubLObject)((kbq_query_run.NIL != expose_runstate_tail) ? conses_high.cadr(expose_runstate_tail) : kbq_query_run.NIL);
        final SubLObject randomize_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw212$RANDOMIZE, current);
        final SubLObject randomize = (SubLObject)((kbq_query_run.NIL != randomize_tail) ? conses_high.cadr(randomize_tail) : kbq_query_run.NIL);
        final SubLObject skip_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw213$SKIP, current);
        final SubLObject skip = (SubLObject)((kbq_query_run.NIL != skip_tail) ? conses_high.cadr(skip_tail) : kbq_query_run.ZERO_INTEGER);
        final SubLObject count_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw214$COUNT, current);
        final SubLObject count = (SubLObject)((kbq_query_run.NIL != count_tail) ? conses_high.cadr(count_tail) : kbq_query_run.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym240$RUN_KCT_EXPERIMENT_INTERNAL, (SubLObject)ConsesLow.list(new SubLObject[] { kbq_query_run.$sym218$LIST, kbq_query_run.$kw236$TEST_SPEC_SET, test_spec_set, kbq_query_run.$kw205$FILENAME, filename, kbq_query_run.$kw206$ANALYSIS_FILENAME, analysis_filename, kbq_query_run.$kw207$KEEPALIVE_FILENAME, keepalive_filename, kbq_query_run.$kw77$COMMENT, comment, kbq_query_run.$kw137$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, kbq_query_run.$kw237$OVERRIDING_METRICS, overriding_metrics, kbq_query_run.$kw130$OUTLIER_TIMEOUT, outlier_timeout, kbq_query_run.$kw210$INCREMENTAL, incremental, kbq_query_run.$kw211$INCLUDE_RESULTS, include_results, kbq_query_run.$kw215$IF_FILE_EXISTS, if_file_exists, kbq_query_run.$kw239$EXPOSE_RUNSTATE, expose_runstate, kbq_query_run.$kw212$RANDOMIZE, randomize, kbq_query_run.$kw213$SKIP, skip, kbq_query_run.$kw214$COUNT, count }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 80400L)
    public static SubLObject run_kct_experiment_internal(final SubLObject experiment_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_spec_set_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw236$TEST_SPEC_SET, experiment_parameters);
        SubLObject test_spec_set = (SubLObject)((kbq_query_run.NIL != test_spec_set_tail) ? conses_high.cadr(test_spec_set_tail) : kbq_query_run.NIL);
        final SubLObject filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw205$FILENAME, experiment_parameters);
        SubLObject filename = (SubLObject)((kbq_query_run.NIL != filename_tail) ? conses_high.cadr(filename_tail) : kbq_query_run.NIL);
        final SubLObject analysis_filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw206$ANALYSIS_FILENAME, experiment_parameters);
        final SubLObject analysis_filename = (SubLObject)((kbq_query_run.NIL != analysis_filename_tail) ? conses_high.cadr(analysis_filename_tail) : kbq_query_run.NIL);
        final SubLObject keepalive_filename_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw207$KEEPALIVE_FILENAME, experiment_parameters);
        final SubLObject keepalive_filename = (SubLObject)((kbq_query_run.NIL != keepalive_filename_tail) ? conses_high.cadr(keepalive_filename_tail) : kbq_query_run.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw77$COMMENT, experiment_parameters);
        final SubLObject comment = (SubLObject)((kbq_query_run.NIL != comment_tail) ? conses_high.cadr(comment_tail) : kbq_query_run.NIL);
        final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw137$OVERRIDING_QUERY_PROPERTIES, experiment_parameters);
        final SubLObject overriding_query_properties = (SubLObject)((kbq_query_run.NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : kbq_query_run.NIL);
        final SubLObject overriding_metrics_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw237$OVERRIDING_METRICS, experiment_parameters);
        final SubLObject overriding_metrics = (kbq_query_run.NIL != overriding_metrics_tail) ? conses_high.cadr(overriding_metrics_tail) : inference_datastructures_enumerated_types.all_arete_query_metrics();
        final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw130$OUTLIER_TIMEOUT, experiment_parameters);
        final SubLObject outlier_timeout = (kbq_query_run.NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : kbq_query_run.$kbq_outlier_timeout$.getDynamicValue(thread);
        final SubLObject randomize_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw212$RANDOMIZE, experiment_parameters);
        final SubLObject randomize = (SubLObject)((kbq_query_run.NIL != randomize_tail) ? conses_high.cadr(randomize_tail) : kbq_query_run.NIL);
        final SubLObject skip_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw213$SKIP, experiment_parameters);
        final SubLObject skip = (SubLObject)((kbq_query_run.NIL != skip_tail) ? conses_high.cadr(skip_tail) : kbq_query_run.ZERO_INTEGER);
        final SubLObject count_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw214$COUNT, experiment_parameters);
        final SubLObject count = (SubLObject)((kbq_query_run.NIL != count_tail) ? conses_high.cadr(count_tail) : kbq_query_run.NIL);
        final SubLObject incremental_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw210$INCREMENTAL, experiment_parameters);
        final SubLObject incremental = (SubLObject)((kbq_query_run.NIL != incremental_tail) ? conses_high.cadr(incremental_tail) : kbq_query_run.T);
        final SubLObject include_results_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw211$INCLUDE_RESULTS, experiment_parameters);
        final SubLObject include_results = (SubLObject)((kbq_query_run.NIL != include_results_tail) ? conses_high.cadr(include_results_tail) : kbq_query_run.T);
        final SubLObject if_file_exists_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw215$IF_FILE_EXISTS, experiment_parameters);
        final SubLObject if_file_exists = (SubLObject)((kbq_query_run.NIL != if_file_exists_tail) ? conses_high.cadr(if_file_exists_tail) : kbq_query_run.$kw216$OVERWRITE);
        final SubLObject expose_runstate_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw239$EXPOSE_RUNSTATE, experiment_parameters);
        final SubLObject expose_runstate = (SubLObject)((kbq_query_run.NIL != expose_runstate_tail) ? conses_high.cadr(expose_runstate_tail) : kbq_query_run.NIL);
        assert kbq_query_run.NIL != kbq_if_file_exists_handling_p(if_file_exists) : if_file_exists;
        SubLObject test_set_run = (SubLObject)kbq_query_run.NIL;
        SubLObject time = (SubLObject)kbq_query_run.NIL;
        SubLObject tail_tests = (SubLObject)kbq_query_run.NIL;
        SubLObject file_mode = (SubLObject)kbq_query_run.$kw165$OUTPUT;
        final SubLObject original_filename = filename;
        final SubLObject entire_test_set_runP = (SubLObject)SubLObjectFactory.makeBoolean(kbq_query_run.NIL == file_utilities.file_existsP(original_filename));
        if (kbq_query_run.NIL != filename) {
            thread.resetMultipleValues();
            final SubLObject test_spec_set_$52 = kct_setup_file_handling(test_spec_set, filename, if_file_exists);
            final SubLObject filename_$53 = thread.secondMultipleValue();
            final SubLObject file_mode_$54 = thread.thirdMultipleValue();
            final SubLObject tail_tests_$55 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            test_spec_set = test_spec_set_$52;
            filename = filename_$53;
            file_mode = file_mode_$54;
            tail_tests = tail_tests_$55;
        }
        if (kbq_query_run.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str222$__run_starting_at__A, numeric_date_utilities.timestring((SubLObject)kbq_query_run.UNPROVIDED));
        }
        final SubLObject time_var = Time.get_internal_real_time();
        test_set_run = kct_run_test_set(test_spec_set, overriding_metrics, outlier_timeout, overriding_query_properties, include_results, comment, (SubLObject)((kbq_query_run.NIL != incremental) ? filename : kbq_query_run.NIL), expose_runstate, skip, count, randomize, file_mode, tail_tests, keepalive_filename);
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (kbq_query_run.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str223$__run_ended_at__A, numeric_date_utilities.timestring((SubLObject)kbq_query_run.UNPROVIDED));
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str224$__elapsed_time____A, numeric_date_utilities.elapsed_seconds_string(Numbers.truncate(time, (SubLObject)kbq_query_run.UNPROVIDED)));
        }
        if (kbq_query_run.NIL == incremental && kbq_query_run.NIL != filename) {
            kct_save_test_set_run(test_set_run, filename);
        }
        kbq_query_run.$last_test_set_run$.setGlobalValue(test_set_run);
        if (kbq_query_run.NIL != analysis_filename) {
            final SubLObject analysis_test_set_run = (kbq_query_run.NIL != entire_test_set_runP) ? test_set_run : kct_load_test_set_run_and_merge_reruns(original_filename);
            print_kct_experiment_analysis_to_file(analysis_filename, analysis_test_set_run, overriding_metrics, test_spec_set);
            print_experiment_csv_to_file(analysis_filename, analysis_test_set_run);
        }
        return time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 82429L)
    public static SubLObject print_kct_experiment_analysis_to_file(final SubLObject analysis_filename, final SubLObject test_set_run, final SubLObject metrics, final SubLObject test_spec_set) {
        final SubLObject analysis = kct_analyze_test_set_run(test_set_run, metrics);
        final SubLObject regression_tests_uninterestingP = (SubLObject)SubLObjectFactory.makeBoolean(kbq_query_run.NIL != list_utilities.every_in_list((SubLObject)kbq_query_run.$sym243$KB_CONTENT_REGRESSION_TEST_, kct_test_set_run_test_runs(test_set_run), (SubLObject)kbq_query_run.$sym110$KCT_TEST_RUN_TEST) || kbq_query_run.NIL == list_utilities.any_in_list((SubLObject)kbq_query_run.$sym243$KB_CONTENT_REGRESSION_TEST_, kct_test_set_run_test_runs(test_set_run), (SubLObject)kbq_query_run.$sym110$KCT_TEST_RUN_TEST));
        final SubLObject regression_test_set_run = (SubLObject)((kbq_query_run.NIL != regression_tests_uninterestingP) ? kbq_query_run.NIL : kct_filter_test_set_run_by_test(test_set_run, (SubLObject)kbq_query_run.$str244$Filtered_to___KBContentRegression, (SubLObject)kbq_query_run.$sym243$KB_CONTENT_REGRESSION_TEST_, (SubLObject)kbq_query_run.$sym110$KCT_TEST_RUN_TEST));
        final SubLObject regression_tests_analysis = (SubLObject)((kbq_query_run.NIL != regression_tests_uninterestingP) ? kbq_query_run.NIL : kct_analyze_test_set_run(regression_test_set_run, metrics));
        final SubLObject failing_tests = kct_test_set_run_tests(kct_failing_test_set_run(test_set_run));
        final SubLObject failing_regression_tests = (SubLObject)((kbq_query_run.NIL != regression_tests_uninterestingP) ? kbq_query_run.NIL : kct_test_set_run_tests(kct_failing_test_set_run(regression_test_set_run)));
        final SubLObject test_specs = kct_test_spec_set_elements(test_spec_set, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject unrunnable_tests = list_utilities.fast_set_difference(test_specs, kct_test_set_run_tests(test_set_run), (SubLObject)kbq_query_run.UNPROVIDED);
        SubLObject stream = (SubLObject)kbq_query_run.NIL;
        try {
            stream = compatibility.open_text(analysis_filename, (SubLObject)kbq_query_run.$kw165$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)kbq_query_run.$str225$Unable_to_open__S, analysis_filename);
            }
            final SubLObject s = stream;
            PrintLow.format(s, (SubLObject)kbq_query_run.$str245$All_tests___);
            list_utilities.pretty_print_plist(analysis, s);
            if (kbq_query_run.NIL == regression_tests_uninterestingP) {
                PrintLow.format(s, (SubLObject)kbq_query_run.$str246$__Just_the_regression_tests___);
                list_utilities.pretty_print_plist(regression_tests_analysis, s);
            }
            if (kbq_query_run.NIL != list_utilities.lengthLE(failing_tests, (SubLObject)kbq_query_run.$int247$212, (SubLObject)kbq_query_run.UNPROVIDED)) {
                PrintLow.format(s, (SubLObject)kbq_query_run.$str248$__Failing_tests_);
                format_nil.print_one_per_line(failing_tests, s);
            }
            if (kbq_query_run.NIL == regression_tests_uninterestingP && kbq_query_run.NIL != list_utilities.lengthLE(failing_regression_tests, (SubLObject)kbq_query_run.$int247$212, (SubLObject)kbq_query_run.UNPROVIDED)) {
                PrintLow.format(s, (SubLObject)kbq_query_run.$str249$____Failing_regression_tests___a_, Sequences.length(failing_regression_tests));
                format_nil.print_one_per_line(failing_regression_tests, s);
            }
            if (kbq_query_run.NIL != unrunnable_tests) {
                PrintLow.format(s, (SubLObject)kbq_query_run.$str250$____Unrunnable_tests_);
                SubLObject cdolist_list_var = unrunnable_tests;
                SubLObject test = (SubLObject)kbq_query_run.NIL;
                test = cdolist_list_var.first();
                while (kbq_query_run.NIL != cdolist_list_var) {
                    final SubLObject explanation = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)kbq_query_run.ONE_INTEGER), kct_utils.why_not_kct_test_valid(test));
                    if (kbq_query_run.NIL != string_utilities.non_empty_string_p(explanation)) {
                        PrintLow.format(s, (SubLObject)kbq_query_run.$str251$_a, explanation);
                    }
                    else {
                        PrintLow.format(s, (SubLObject)kbq_query_run.$str252$___a_is_unrunnable_for_an_unknown, test);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    test = cdolist_list_var.first();
                }
            }
            streams_high.terpri(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)kbq_query_run.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kbq_query_run.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 84609L)
    public static SubLObject print_experiment_csv_to_file(final SubLObject analysis_filename, final SubLObject test_or_query_set_run) {
        final SubLObject csv_name = Sequences.cconcatenate(analysis_filename, (SubLObject)kbq_query_run.$str253$_csv);
        SubLObject stream = (SubLObject)kbq_query_run.NIL;
        try {
            stream = compatibility.open_text(csv_name, (SubLObject)kbq_query_run.$kw165$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)kbq_query_run.$str225$Unable_to_open__S, csv_name);
            }
            final SubLObject csv = stream;
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str254$__Writing_csv_to___A__, Sequences.cconcatenate(analysis_filename, (SubLObject)kbq_query_run.$str253$_csv));
            final SubLObject tests = ConsesLow.append(list_utilities.plist_lookup(test_or_query_set_run, (SubLObject)kbq_query_run.$kw83$TEST_RUNS, (SubLObject)kbq_query_run.UNPROVIDED), list_utilities.plist_lookup(test_or_query_set_run, (SubLObject)kbq_query_run.$kw78$QUERY_RUNS, (SubLObject)kbq_query_run.UNPROVIDED));
            PrintLow.format(csv, (SubLObject)kbq_query_run.$str255$Comment___A__, list_utilities.plist_lookup(test_or_query_set_run, (SubLObject)kbq_query_run.$kw77$COMMENT, (SubLObject)kbq_query_run.UNPROVIDED));
            PrintLow.format(csv, (SubLObject)kbq_query_run.$str256$Date___A__, list_utilities.plist_lookup(test_or_query_set_run, (SubLObject)kbq_query_run.$kw73$DATE, (SubLObject)kbq_query_run.UNPROVIDED));
            SubLObject cdolist_list_var = tests;
            SubLObject atest = (SubLObject)kbq_query_run.NIL;
            atest = cdolist_list_var.first();
            while (kbq_query_run.NIL != cdolist_list_var) {
                final SubLObject qrun = list_utilities.plist_lookup(atest, (SubLObject)kbq_query_run.$kw71$QUERY_RUN, (SubLObject)kbq_query_run.UNPROVIDED);
                PrintLow.format(csv, (SubLObject)kbq_query_run.$str257$_A__A__A__A__A__A__A___, new SubLObject[] { list_utilities.plist_lookup(atest, (SubLObject)kbq_query_run.$kw69$TEST, (SubLObject)kbq_query_run.UNPROVIDED), list_utilities.plist_lookup(atest, (SubLObject)kbq_query_run.$kw70$STATUS, (SubLObject)kbq_query_run.UNPROVIDED), list_utilities.plist_lookup(atest, (SubLObject)kbq_query_run.$kw70$STATUS, (SubLObject)kbq_query_run.UNPROVIDED).equalp((SubLObject)kbq_query_run.$kw0$SUCCESS) ? list_utilities.plist_lookup(qrun, (SubLObject)kbq_query_run.$kw29$HALT_REASON, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.$str161$, (list_utilities.plist_lookup(atest, (SubLObject)kbq_query_run.$kw70$STATUS, (SubLObject)kbq_query_run.UNPROVIDED).equalp((SubLObject)kbq_query_run.$kw0$SUCCESS) && !list_utilities.plist_lookup(qrun, (SubLObject)kbq_query_run.$kw29$HALT_REASON, (SubLObject)kbq_query_run.UNPROVIDED).isList()) ? list_utilities.plist_lookup(qrun, (SubLObject)kbq_query_run.$kw29$HALT_REASON, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.$str161$, list_utilities.plist_lookup(qrun, (SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, (SubLObject)kbq_query_run.UNPROVIDED), list_utilities.plist_lookup(qrun, (SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED), list_utilities.plist_lookup(qrun, (SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED), list_utilities.plist_lookup(qrun, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, (SubLObject)kbq_query_run.UNPROVIDED) });
                cdolist_list_var = cdolist_list_var.rest();
                atest = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)kbq_query_run.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kbq_query_run.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 85946L)
    public static SubLObject kct_erroring_tests(final SubLObject test_set_run) {
        SubLObject tests = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = kct_test_set_run_test_runs(test_set_run);
        SubLObject test_run = (SubLObject)kbq_query_run.NIL;
        test_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            if (kbq_query_run.NIL != kct_erroring_test_runP(test_run)) {
                tests = (SubLObject)ConsesLow.cons(kct_test_run_test(test_run), tests);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(tests);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 86451L)
    public static SubLObject kct_erroring_test_count(final SubLObject test_set_run) {
        return kct_count_erroring_test_runs(kct_test_set_run_test_runs(test_set_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 86591L)
    public static SubLObject kct_count_erroring_test_runs(final SubLObject test_runs) {
        return Sequences.count_if((SubLObject)kbq_query_run.$sym258$KCT_ERRORING_TEST_RUN_, test_runs, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 86705L)
    public static SubLObject kct_erroring_test_runP(final SubLObject test_run) {
        final SubLObject halt_reason = kbq_query_run_halt_reason(kct_test_run_query_run(test_run));
        return inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 86903L)
    public static SubLObject kct_setup_file_handling(final SubLObject test_spec_set, final SubLObject filename, SubLObject if_file_exists) {
        assert kbq_query_run.NIL != kbq_if_file_exists_handling_p(if_file_exists) : if_file_exists;
        if (kbq_query_run.NIL == Filesys.probe_file(filename)) {
            if_file_exists = (SubLObject)kbq_query_run.$kw216$OVERWRITE;
        }
        final SubLObject pcase_var = if_file_exists;
        if (pcase_var.eql((SubLObject)kbq_query_run.$kw216$OVERWRITE)) {
            return Values.values(test_spec_set, filename, (SubLObject)kbq_query_run.$kw165$OUTPUT, (SubLObject)kbq_query_run.NIL);
        }
        if (pcase_var.eql((SubLObject)kbq_query_run.$kw228$AUGMENT)) {
            final SubLObject tests_not_yet_run = kct_tests_not_yet_run(test_spec_set, filename);
            final SubLObject possible_crash_test = tests_not_yet_run.first();
            final SubLObject rest_tests = tests_not_yet_run.rest();
            return Values.values(el_utilities.make_el_set(rest_tests, (SubLObject)kbq_query_run.UNPROVIDED), filename, (SubLObject)kbq_query_run.$kw229$APPEND, (SubLObject)ConsesLow.list(possible_crash_test));
        }
        if (pcase_var.eql((SubLObject)kbq_query_run.$kw230$RERUN_ERRORS)) {
            final SubLObject old_test_set_run = kct_load_test_set_run_and_merge_reruns(filename);
            final SubLObject tests_to_rerun = kct_erroring_tests(old_test_set_run);
            final SubLObject filename_without_extension = kct_strip_suffix_from_filename(filename);
            final SubLObject new_filename = kct_compute_rerun_errors_filename(filename_without_extension);
            return Values.values(el_utilities.make_el_set(tests_to_rerun, (SubLObject)kbq_query_run.UNPROVIDED), new_filename, (SubLObject)kbq_query_run.$kw165$OUTPUT, (SubLObject)kbq_query_run.NIL);
        }
        if (!pcase_var.eql((SubLObject)kbq_query_run.$kw231$AUGMENT_OR_RERUN_ERRORS)) {
            return Errors.error((SubLObject)kbq_query_run.$str232$unexpected_if_file_exists__s, if_file_exists);
        }
        final SubLObject tests_not_yet_run = kct_tests_not_yet_run(test_spec_set, filename);
        if (kbq_query_run.NIL != tests_not_yet_run) {
            return kct_setup_file_handling(test_spec_set, filename, (SubLObject)kbq_query_run.$kw228$AUGMENT);
        }
        return kct_setup_file_handling(test_spec_set, filename, (SubLObject)kbq_query_run.$kw230$RERUN_ERRORS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 88388L)
    public static SubLObject kct_tests_not_yet_run(final SubLObject test_spec_set, final SubLObject filename) {
        final SubLObject old_test_set_run = kct_load_test_set_run(filename);
        final SubLObject old_tests = kct_test_set_run_tests(old_test_set_run);
        final SubLObject tests = kct_test_spec_set_elements(test_spec_set, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        return kb_utilities.sort_terms(list_utilities.remove_if_not((SubLObject)kbq_query_run.$sym259$KCT_TEST_RUNNABLE_, list_utilities.fast_set_difference(tests, old_tests, Symbols.symbol_function((SubLObject)kbq_query_run.EQUAL)), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 88797L)
    public static SubLObject kct_compute_rerun_errors_filename(final SubLObject filename_without_extension) {
        return kbq_compute_rerun_errors_filename(filename_without_extension);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 88949L)
    public static SubLObject kct_candidate_rerun_errors_filename(final SubLObject filename_without_extension, final SubLObject i) {
        return kbq_candidate_rerun_errors_filename(filename_without_extension, i);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 89109L)
    public static SubLObject kct_load_test_set_run_and_merge_reruns(final SubLObject filename) {
        SubLObject test_set_run = kct_load_test_set_run(filename);
        final SubLObject filename_without_extension = kct_strip_suffix_from_filename(filename);
        SubLObject i = (SubLObject)kbq_query_run.ONE_INTEGER;
        SubLObject doneP = (SubLObject)kbq_query_run.NIL;
        while (kbq_query_run.NIL == doneP) {
            final SubLObject rerun_filename = kct_candidate_rerun_errors_filename(filename_without_extension, i);
            if (kbq_query_run.NIL != Filesys.probe_file(rerun_filename)) {
                final SubLObject test_set_rerun = kct_load_test_set_run(rerun_filename);
                test_set_run = kct_merge_test_set_run_with_rerun(test_set_run, test_set_rerun);
                i = Numbers.add(i, (SubLObject)kbq_query_run.ONE_INTEGER);
            }
            else {
                doneP = (SubLObject)kbq_query_run.T;
            }
        }
        return test_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 89711L)
    public static SubLObject kct_merge_test_set_run_with_rerun(final SubLObject test_set_run, final SubLObject test_set_rerun) {
        final SubLObject test_runs = conses_high.copy_list(kct_test_set_run_test_runs(test_set_run));
        SubLObject cons;
        SubLObject test_run;
        SubLObject test;
        SubLObject test_rerun;
        for (cons = (SubLObject)kbq_query_run.NIL, cons = test_runs; !cons.isAtom(); cons = cons.rest()) {
            test_run = cons.first();
            if (kbq_query_run.NIL != kct_erroring_test_runP(test_run)) {
                test = kct_test_run_test(test_run);
                test_rerun = kct_lookup_test_run(test_set_rerun, test);
                if (kbq_query_run.NIL != test_rerun) {
                    ConsesLow.rplaca(cons, test_rerun);
                }
            }
        }
        SubLObject new_test_set_run = conses_high.copy_list(test_set_run);
        new_test_set_run = conses_high.putf(new_test_set_run, (SubLObject)kbq_query_run.$kw83$TEST_RUNS, test_runs);
        return new_test_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 90408L)
    public static SubLObject kbq_runstate_validP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbq_runstate_p(kbq_query_run.$kbq_runstate$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 90957L)
    public static SubLObject kbq_runstate_inference_already_setP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(kbqr_inference(kbq_query_run.$kbq_runstate$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91064L)
    public static SubLObject set_kbq_runstate_inference(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set_kbqr_inference(kbq_query_run.$kbq_runstate$.getDynamicValue(thread), inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91175L)
    public static SubLObject possibly_set_kbq_runstate_inference(final SubLObject inference) {
        if (kbq_query_run.NIL != kbq_runstate_validP() && kbq_query_run.NIL == kbq_runstate_inference_already_setP()) {
            return set_kbq_runstate_inference(inference);
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91378L)
    public static SubLObject find_kbq_runstate_by_id(final SubLObject id) {
        return runstate_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91481L)
    public static SubLObject find_kbq_runstate_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject kbq_runstate = find_kbq_runstate_by_id(id);
        return kbq_runstate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91652L)
    public static SubLObject find_kct_runstate_by_id(final SubLObject id) {
        return runstate_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91738L)
    public static SubLObject find_kct_runstate_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject kct_runstate = find_kbq_runstate_by_id(id);
        return kct_runstate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91909L)
    public static SubLObject find_kct_set_runstate_by_id(final SubLObject id) {
        return runstate_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91999L)
    public static SubLObject find_kct_set_runstate_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject kct_set_runstate = find_kbq_runstate_by_id(id);
        return kct_set_runstate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92431L)
    public static SubLObject next_runstate_id() {
        return integer_sequence_generator.integer_sequence_generator_next(kbq_query_run.$runstate_isg$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92550L)
    public static SubLObject runstate_add_object(final SubLObject id, final SubLObject v_object) {
        return dictionary.dictionary_enter(kbq_query_run.$runstate_index$.getGlobalValue(), id, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92654L)
    public static SubLObject runstate_rem_object(final SubLObject id) {
        return dictionary.dictionary_remove(kbq_query_run.$runstate_index$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92745L)
    public static SubLObject runstate_find_object_by_id(final SubLObject id) {
        return dictionary.dictionary_lookup(kbq_query_run.$runstate_index$.getGlobalValue(), id, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92845L)
    public static SubLObject runstate_constant(final SubLObject runstate) {
        if (kbq_query_run.NIL != kbq_runstate_p(runstate)) {
            return kbq_runstate_query_spec(runstate);
        }
        if (kbq_query_run.NIL != kct_runstate_p(runstate)) {
            return kct_runstate_test_spec(runstate);
        }
        if (kbq_query_run.NIL != kct_set_runstate_p(runstate)) {
            return kct_set_runstate_test_set(runstate);
        }
        Errors.error((SubLObject)kbq_query_run.$str262$Unknown_runstate_type___A, runstate);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 93237L)
    public static SubLObject runstate_result_status(final SubLObject runstate) {
        if (kbq_query_run.NIL != kct_runstate_p(runstate)) {
            return kct_runstate_result_status(runstate);
        }
        if (kbq_query_run.NIL != kct_set_runstate_p(runstate)) {
            return kct_set_runstate_result_status(runstate);
        }
        Errors.error((SubLObject)kbq_query_run.$str263$Runstate_has_no_status___A, runstate);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 93510L)
    public static SubLObject runstate_result_text(final SubLObject runstate) {
        return (SubLObject)kbq_query_run.$str264$Explanations_aren_t_yet_implement;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 93626L)
    public static SubLObject runstate_run_status(final SubLObject runstate) {
        if (kbq_query_run.NIL != kbq_runstate_p(runstate)) {
            return kbq_runstate_run_status(runstate);
        }
        if (kbq_query_run.NIL != kct_runstate_p(runstate)) {
            return kct_runstate_run_status(runstate);
        }
        if (kbq_query_run.NIL != kct_set_runstate_p(runstate)) {
            return kct_set_runstate_run_status(runstate);
        }
        Errors.error((SubLObject)kbq_query_run.$str262$Unknown_runstate_type___A, runstate);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 93963L)
    public static SubLObject runstate_inference(final SubLObject runstate) {
        if (kbq_query_run.NIL != kbq_runstate_p(runstate)) {
            return kbq_runstate_inference(runstate);
        }
        if (kbq_query_run.NIL != kct_runstate_p(runstate)) {
            return kct_runstate_inference(runstate);
        }
        Errors.error((SubLObject)kbq_query_run.$str265$No_inference_defined_for_this_run, runstate);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 94232L)
    public static SubLObject runstate_start(final SubLObject runstate) {
        if (kbq_query_run.NIL != kct_runstate_p(runstate)) {
            return kct_runstate_start(runstate);
        }
        if (kbq_query_run.NIL != kct_set_runstate_p(runstate)) {
            return kct_set_runstate_start(runstate);
        }
        Errors.error((SubLObject)kbq_query_run.$str266$No_start_defined_for_this_runstat, runstate);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 94493L)
    public static SubLObject runstate_end(final SubLObject runstate) {
        if (kbq_query_run.NIL != kct_runstate_p(runstate)) {
            return kct_runstate_end(runstate);
        }
        if (kbq_query_run.NIL != kct_set_runstate_p(runstate)) {
            return kct_set_runstate_end(runstate);
        }
        Errors.error((SubLObject)kbq_query_run.$str267$No_end_defined_for_this_runstate_, runstate);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 94746L)
    public static SubLObject set_runstate_run_status(final SubLObject runstate, final SubLObject run_status) {
        assert kbq_query_run.NIL != Types.keywordp(run_status) : run_status;
        if (kbq_query_run.NIL != kbq_runstate_p(runstate)) {
            return set_kbqr_run_status(runstate, run_status);
        }
        if (kbq_query_run.NIL != kct_runstate_p(runstate)) {
            return set_kctr_run_status(runstate, run_status);
        }
        if (kbq_query_run.NIL != kct_set_runstate_p(runstate)) {
            return set_kctsr_run_status(runstate, run_status);
        }
        Errors.error((SubLObject)kbq_query_run.$str263$Runstate_has_no_status___A, runstate);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95211L)
    public static SubLObject destroy_runstate(final SubLObject runstate) {
        if (kbq_query_run.NIL != kbq_runstate_p(runstate)) {
            return destroy_kbq_runstate(runstate);
        }
        if (kbq_query_run.NIL != kct_runstate_p(runstate)) {
            return destroy_kct_runstate(runstate);
        }
        if (kbq_query_run.NIL != kct_set_runstate_p(runstate)) {
            destroy_kct_set_runstate(runstate);
        }
        else {
            Errors.error((SubLObject)kbq_query_run.$str263$Runstate_has_no_status___A, runstate);
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject kbq_runstate_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)kbq_query_run.ZERO_INTEGER);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject kbq_runstate_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $kbq_runstate_native.class) ? kbq_query_run.T : kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject kbqr_id(final SubLObject v_object) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject kbqr_lock(final SubLObject v_object) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject kbqr_query_spec(final SubLObject v_object) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject kbqr_inference(final SubLObject v_object) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject kbqr_result(final SubLObject v_object) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject kbqr_test_runstate(final SubLObject v_object) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject kbqr_run_status(final SubLObject v_object) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject _csetf_kbqr_id(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject _csetf_kbqr_lock(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject _csetf_kbqr_query_spec(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject _csetf_kbqr_inference(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject _csetf_kbqr_result(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject _csetf_kbqr_test_runstate(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject _csetf_kbqr_run_status(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject make_kbq_runstate(SubLObject arglist) {
        if (arglist == kbq_query_run.UNPROVIDED) {
            arglist = (SubLObject)kbq_query_run.NIL;
        }
        final SubLObject v_new = (SubLObject)new $kbq_runstate_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)kbq_query_run.NIL, next = arglist; kbq_query_run.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)kbq_query_run.$kw292$ID)) {
                _csetf_kbqr_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw293$LOCK)) {
                _csetf_kbqr_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw294$QUERY_SPEC)) {
                _csetf_kbqr_query_spec(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw295$INFERENCE)) {
                _csetf_kbqr_inference(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw15$RESULT)) {
                _csetf_kbqr_result(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw296$TEST_RUNSTATE)) {
                _csetf_kbqr_test_runstate(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw297$RUN_STATUS)) {
                _csetf_kbqr_run_status(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)kbq_query_run.$str298$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject visit_defstruct_kbq_runstate(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw299$BEGIN, (SubLObject)kbq_query_run.$sym300$MAKE_KBQ_RUNSTATE, (SubLObject)kbq_query_run.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw292$ID, kbqr_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw293$LOCK, kbqr_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw294$QUERY_SPEC, kbqr_query_spec(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw295$INFERENCE, kbqr_inference(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw15$RESULT, kbqr_result(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw296$TEST_RUNSTATE, kbqr_test_runstate(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw297$RUN_STATUS, kbqr_run_status(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw302$END, (SubLObject)kbq_query_run.$sym300$MAKE_KBQ_RUNSTATE, (SubLObject)kbq_query_run.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95868L)
    public static SubLObject visit_defstruct_object_kbq_runstate_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kbq_runstate(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 96480L)
    public static SubLObject new_kbq_runstate(final SubLObject query_spec, final SubLObject test_runstate) {
        assert kbq_query_run.NIL != kb_query.kbq_query_spec_p(query_spec) : query_spec;
        if (kbq_query_run.NIL != test_runstate && !kbq_query_run.assertionsDisabledInClass && kbq_query_run.NIL == kct_runstate_p(test_runstate)) {
            throw new AssertionError(test_runstate);
        }
        final SubLObject kbqr = make_kbq_runstate((SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject id = next_runstate_id();
        runstate_add_object(id, kbqr);
        _csetf_kbqr_id(kbqr, id);
        _csetf_kbqr_query_spec(kbqr, query_spec);
        _csetf_kbqr_lock(kbqr, Locks.make_lock((SubLObject)kbq_query_run.$str305$KBQ_Runstate_Lock));
        _csetf_kbqr_test_runstate(kbqr, test_runstate);
        _csetf_kbqr_run_status(kbqr, (SubLObject)kbq_query_run.$kw306$NONE);
        return kbqr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 96999L)
    public static SubLObject destroy_kbq_runstate(final SubLObject kbqr) {
        assert kbq_query_run.NIL != kbq_runstate_p(kbqr) : kbqr;
        runstate_rem_object(kbqr_id(kbqr));
        _csetf_kbqr_id(kbqr, (SubLObject)kbq_query_run.NIL);
        if (kbq_query_run.NIL != inference_datastructures_inference.valid_inference_p(kbqr_inference(kbqr))) {
            inference_datastructures_inference.destroy_inference_and_problem_store(kbqr_inference(kbqr));
        }
        _csetf_kbqr_query_spec(kbqr, (SubLObject)kbq_query_run.NIL);
        _csetf_kbqr_lock(kbqr, (SubLObject)kbq_query_run.NIL);
        _csetf_kbqr_result(kbqr, (SubLObject)kbq_query_run.NIL);
        _csetf_kbqr_run_status(kbqr, (SubLObject)kbq_query_run.NIL);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97429L)
    public static SubLObject kbq_runstate_query_spec(final SubLObject kbqr) {
        return kbqr_query_spec(kbqr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97529L)
    public static SubLObject kbq_runstate_lock(final SubLObject kbqr) {
        return kbqr_lock(kbqr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97596L)
    public static SubLObject kbq_runstate_inference(final SubLObject kbqr) {
        return kbqr_inference(kbqr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97673L)
    public static SubLObject kbq_runstate_result(final SubLObject kbqr) {
        return kbqr_result(kbqr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97744L)
    public static SubLObject kbq_runstate_test_runstate(final SubLObject kbqr) {
        return kbqr_test_runstate(kbqr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97829L)
    public static SubLObject kbq_runstate_run_status(final SubLObject kbqr) {
        return kbqr_run_status(kbqr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97908L)
    public static SubLObject set_kbqr_inference(final SubLObject kbqr, final SubLObject inference) {
        assert kbq_query_run.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        assert kbq_query_run.NIL != kbq_runstate_p(kbqr) : kbqr;
        final SubLObject lock = kbqr_lock(kbqr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kbqr_inference(kbqr, inference);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kbqr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 98141L)
    public static SubLObject set_kbqr_result(final SubLObject kbqr, final SubLObject query_run) {
        assert kbq_query_run.NIL != kbq_runstate_p(kbqr) : kbqr;
        assert kbq_query_run.NIL != kbq_query_run_p(query_run) : query_run;
        final SubLObject lock = kbqr_lock(kbqr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kbqr_result(kbqr, query_run);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kbqr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 98360L)
    public static SubLObject set_kbqr_run_status(final SubLObject kbqr, final SubLObject run_status) {
        assert kbq_query_run.NIL != kbq_runstate_p(kbqr) : kbqr;
        assert kbq_query_run.NIL != Types.keywordp(run_status) : run_status;
        final SubLObject lock = kbqr_lock(kbqr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kbqr_run_status(kbqr, run_status);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kbqr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 98583L)
    public static SubLObject possibly_set_kbqr_run_status(final SubLObject kbqr, final SubLObject run_status) {
        if (kbq_query_run.NIL != kbq_runstate_p(kbqr)) {
            return set_kbqr_run_status(kbqr, run_status);
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject kct_runstate_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)kbq_query_run.ZERO_INTEGER);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject kct_runstate_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $kct_runstate_native.class) ? kbq_query_run.T : kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject kctr_id(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject kctr_lock(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject kctr_test_spec(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject kctr_result(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject kctr_query_runstate(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject kctr_test_set_runstate(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject kctr_run_status(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject kctr_start(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject kctr_end(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject _csetf_kctr_id(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject _csetf_kctr_lock(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject _csetf_kctr_test_spec(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject _csetf_kctr_result(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject _csetf_kctr_query_runstate(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject _csetf_kctr_test_set_runstate(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject _csetf_kctr_run_status(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject _csetf_kctr_start(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject _csetf_kctr_end(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject make_kct_runstate(SubLObject arglist) {
        if (arglist == kbq_query_run.UNPROVIDED) {
            arglist = (SubLObject)kbq_query_run.NIL;
        }
        final SubLObject v_new = (SubLObject)new $kct_runstate_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)kbq_query_run.NIL, next = arglist; kbq_query_run.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)kbq_query_run.$kw292$ID)) {
                _csetf_kctr_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw293$LOCK)) {
                _csetf_kctr_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw334$TEST_SPEC)) {
                _csetf_kctr_test_spec(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw15$RESULT)) {
                _csetf_kctr_result(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw335$QUERY_RUNSTATE)) {
                _csetf_kctr_query_runstate(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw336$TEST_SET_RUNSTATE)) {
                _csetf_kctr_test_set_runstate(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw297$RUN_STATUS)) {
                _csetf_kctr_run_status(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw337$START)) {
                _csetf_kctr_start(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw302$END)) {
                _csetf_kctr_end(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)kbq_query_run.$str298$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject visit_defstruct_kct_runstate(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw299$BEGIN, (SubLObject)kbq_query_run.$sym338$MAKE_KCT_RUNSTATE, (SubLObject)kbq_query_run.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw292$ID, kctr_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw293$LOCK, kctr_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw334$TEST_SPEC, kctr_test_spec(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw15$RESULT, kctr_result(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw335$QUERY_RUNSTATE, kctr_query_runstate(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw336$TEST_SET_RUNSTATE, kctr_test_set_runstate(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw297$RUN_STATUS, kctr_run_status(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw337$START, kctr_start(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw302$END, kctr_end(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw302$END, (SubLObject)kbq_query_run.$sym338$MAKE_KCT_RUNSTATE, (SubLObject)kbq_query_run.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99036L)
    public static SubLObject visit_defstruct_object_kct_runstate_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kct_runstate(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99400L)
    public static SubLObject new_kct_runstate(final SubLObject test_spec, SubLObject test_set_runstate) {
        if (test_set_runstate == kbq_query_run.UNPROVIDED) {
            test_set_runstate = (SubLObject)kbq_query_run.NIL;
        }
        assert kbq_query_run.NIL != kct_utils.kct_test_spec_p(test_spec, (SubLObject)kbq_query_run.UNPROVIDED) : test_spec;
        if (kbq_query_run.NIL != test_set_runstate && !kbq_query_run.assertionsDisabledInClass && kbq_query_run.NIL == kct_set_runstate_p(test_set_runstate)) {
            throw new AssertionError(test_set_runstate);
        }
        final SubLObject kctr = make_kct_runstate((SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject id = next_runstate_id();
        runstate_add_object(id, kctr);
        _csetf_kctr_id(kctr, id);
        _csetf_kctr_test_spec(kctr, test_spec);
        _csetf_kctr_lock(kctr, Locks.make_lock((SubLObject)kbq_query_run.$str341$KCT_Runstate_Lock));
        _csetf_kctr_query_runstate(kctr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctr_test_set_runstate(kctr, test_set_runstate);
        _csetf_kctr_run_status(kctr, (SubLObject)kbq_query_run.$kw306$NONE);
        _csetf_kctr_start(kctr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctr_end(kctr, (SubLObject)kbq_query_run.NIL);
        return kctr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100054L)
    public static SubLObject destroy_kct_runstate(final SubLObject kctr) {
        assert kbq_query_run.NIL != kct_runstate_p(kctr) : kctr;
        runstate_rem_object(kctr_id(kctr));
        _csetf_kctr_id(kctr, (SubLObject)kbq_query_run.NIL);
        if (kbq_query_run.NIL != kct_set_runstate_p(kctr_test_set_runstate(kctr))) {
            kctsr_test_runstate_remove(kctr_test_set_runstate(kctr), kctr);
        }
        if (kbq_query_run.NIL != kctr_query_runstate(kctr)) {
            destroy_kbq_runstate(kctr_query_runstate(kctr));
        }
        _csetf_kctr_test_spec(kctr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctr_lock(kctr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctr_result(kctr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctr_run_status(kctr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctr_start(kctr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctr_end(kctr, (SubLObject)kbq_query_run.NIL);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100654L)
    public static SubLObject kct_runstate_test_spec(final SubLObject kctr) {
        return kctr_test_spec(kctr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100752L)
    public static SubLObject kct_runstate_lock(final SubLObject kctr) {
        return kctr_lock(kctr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100819L)
    public static SubLObject kct_runstate_result(final SubLObject kctr) {
        return kctr_result(kctr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100890L)
    public static SubLObject kct_runstate_query_runstate(final SubLObject kctr) {
        return kctr_query_runstate(kctr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100977L)
    public static SubLObject kct_runstate_test_set_runstate(final SubLObject kctr) {
        return kctr_test_set_runstate(kctr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 101070L)
    public static SubLObject kct_runstate_inference(final SubLObject kctr) {
        final SubLObject kbq_runstate = kct_runstate_query_runstate(kctr);
        if (kbq_query_run.NIL != kbq_runstate_p(kbq_runstate)) {
            return kbqr_inference(kbq_runstate);
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 101262L)
    public static SubLObject kct_runstate_result_status(final SubLObject kctr) {
        return kct_test_run_status(kct_runstate_result(kctr));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 101451L)
    public static SubLObject kct_runstate_failure_explanation(final SubLObject kctr) {
        final SubLObject test_run = kct_runstate_result(kctr);
        final SubLObject query_run = kct_test_run_query_run(test_run);
        final SubLObject raw_query_results = kbq_query_run_result(query_run);
        final SubLObject actual_results = raw_query_results.first();
        final SubLObject hypothetical_bindings = conses_high.second(raw_query_results);
        final SubLObject test_spec = kct_runstate_test_spec(kctr);
        return why_kct_failure(test_spec, actual_results, hypothetical_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 101877L)
    public static SubLObject kct_runstate_metric_value(final SubLObject kctr, final SubLObject metric) {
        final SubLObject test_run = kct_runstate_result(kctr);
        final SubLObject query_run = kct_test_run_query_run(test_run);
        return kbq_extract_query_run_metric_value(query_run, metric, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102095L)
    public static SubLObject kct_runstate_run_status(final SubLObject kctr) {
        assert kbq_query_run.NIL != kct_runstate_p(kctr) : kctr;
        final SubLObject kbqr = kct_runstate_query_runstate(kctr);
        if (kbq_query_run.NIL != kbq_runstate_p(kbqr)) {
            return kbq_runstate_run_status(kbqr);
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102308L)
    public static SubLObject kct_runstate_start(final SubLObject kctr) {
        return kctr_start(kctr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102377L)
    public static SubLObject kct_runstate_end(final SubLObject kctr) {
        return kctr_end(kctr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102442L)
    public static SubLObject set_kctr_result(final SubLObject kctr, final SubLObject test_run) {
        assert kbq_query_run.NIL != kct_runstate_p(kctr) : kctr;
        assert kbq_query_run.NIL != kct_test_run_p(test_run) : test_run;
        final SubLObject lock = kctr_lock(kctr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_result(kctr, test_run);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102670L)
    public static SubLObject set_kctr_query_runstate(final SubLObject kctr, final SubLObject kbqr) {
        assert kbq_query_run.NIL != kct_runstate_p(kctr) : kctr;
        assert kbq_query_run.NIL != kbq_runstate_p(kbqr) : kbqr;
        final SubLObject lock = kctr_lock(kctr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_query_runstate(kctr, kbqr);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102889L)
    public static SubLObject set_kctr_test_set_runstate(final SubLObject kctr, final SubLObject kctsr) {
        assert kbq_query_run.NIL != kct_runstate_p(kctr) : kctr;
        assert kbq_query_run.NIL != kct_set_runstate_p(kctsr) : kctsr;
        final SubLObject lock = kctr_lock(kctr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_test_set_runstate(kctr, kctsr);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 103121L)
    public static SubLObject set_kctr_run_status(final SubLObject kctr, final SubLObject run_status) {
        assert kbq_query_run.NIL != kct_runstate_p(kctr) : kctr;
        assert kbq_query_run.NIL != Types.keywordp(run_status) : run_status;
        final SubLObject lock = kctr_lock(kctr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_run_status(kctr, run_status);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 103343L)
    public static SubLObject set_kctr_start(final SubLObject kctr, SubLObject time) {
        if (time == kbq_query_run.UNPROVIDED) {
            time = (SubLObject)kbq_query_run.NIL;
        }
        if (kbq_query_run.NIL == time) {
            time = Time.get_universal_time();
        }
        assert kbq_query_run.NIL != kct_runstate_p(kctr) : kctr;
        final SubLObject lock = kctr_lock(kctr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_start(kctr, time);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 103573L)
    public static SubLObject set_kctr_end(final SubLObject kctr, SubLObject time) {
        if (time == kbq_query_run.UNPROVIDED) {
            time = (SubLObject)kbq_query_run.NIL;
        }
        if (kbq_query_run.NIL == time) {
            time = Time.get_universal_time();
        }
        assert kbq_query_run.NIL != kct_runstate_p(kctr) : kctr;
        final SubLObject lock = kctr_lock(kctr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_end(kctr, time);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject kct_set_runstate_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)kbq_query_run.ZERO_INTEGER);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject kct_set_runstate_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $kct_set_runstate_native.class) ? kbq_query_run.T : kbq_query_run.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject kctsr_id(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject kctsr_lock(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject kctsr_test_set(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject kctsr_result(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject kctsr_test_runstates(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject kctsr_run_status(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject kctsr_start(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject kctsr_end(final SubLObject v_object) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject _csetf_kctsr_id(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject _csetf_kctsr_lock(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject _csetf_kctsr_test_set(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject _csetf_kctsr_result(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject _csetf_kctsr_test_runstates(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject _csetf_kctsr_run_status(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject _csetf_kctsr_start(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject _csetf_kctsr_end(final SubLObject v_object, final SubLObject value) {
        assert kbq_query_run.NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject make_kct_set_runstate(SubLObject arglist) {
        if (arglist == kbq_query_run.UNPROVIDED) {
            arglist = (SubLObject)kbq_query_run.NIL;
        }
        final SubLObject v_new = (SubLObject)new $kct_set_runstate_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)kbq_query_run.NIL, next = arglist; kbq_query_run.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)kbq_query_run.$kw292$ID)) {
                _csetf_kctsr_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw293$LOCK)) {
                _csetf_kctsr_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw366$TEST_SET)) {
                _csetf_kctsr_test_set(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw15$RESULT)) {
                _csetf_kctsr_result(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw367$TEST_RUNSTATES)) {
                _csetf_kctsr_test_runstates(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw297$RUN_STATUS)) {
                _csetf_kctsr_run_status(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw337$START)) {
                _csetf_kctsr_start(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw302$END)) {
                _csetf_kctsr_end(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)kbq_query_run.$str298$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject visit_defstruct_kct_set_runstate(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw299$BEGIN, (SubLObject)kbq_query_run.$sym368$MAKE_KCT_SET_RUNSTATE, (SubLObject)kbq_query_run.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw292$ID, kctsr_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw293$LOCK, kctsr_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw366$TEST_SET, kctsr_test_set(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw15$RESULT, kctsr_result(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw367$TEST_RUNSTATES, kctsr_test_runstates(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw297$RUN_STATUS, kctsr_run_status(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw337$START, kctsr_start(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw301$SLOT, (SubLObject)kbq_query_run.$kw302$END, kctsr_end(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kbq_query_run.$kw302$END, (SubLObject)kbq_query_run.$sym368$MAKE_KCT_SET_RUNSTATE, (SubLObject)kbq_query_run.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104214L)
    public static SubLObject visit_defstruct_object_kct_set_runstate_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kct_set_runstate(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104548L)
    public static SubLObject new_kct_set_runstate(final SubLObject test_set) {
        assert kbq_query_run.NIL != kct_utils.kct_test_collection_p(test_set, (SubLObject)kbq_query_run.UNPROVIDED) : test_set;
        final SubLObject kctsr = make_kct_set_runstate((SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject id = next_runstate_id();
        runstate_add_object(id, kctsr);
        _csetf_kctsr_id(kctsr, id);
        _csetf_kctsr_test_set(kctsr, test_set);
        _csetf_kctsr_lock(kctsr, Locks.make_lock((SubLObject)kbq_query_run.$str371$KCT_Set_Runstate_Lock));
        _csetf_kctsr_result(kctsr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctsr_test_runstates(kctsr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctsr_run_status(kctsr, (SubLObject)kbq_query_run.$kw306$NONE);
        _csetf_kctsr_start(kctsr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctsr_end(kctsr, (SubLObject)kbq_query_run.NIL);
        return kctsr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105118L)
    public static SubLObject destroy_kct_set_runstate(final SubLObject kctsr) {
        assert kbq_query_run.NIL != kct_set_runstate_p(kctsr) : kctsr;
        runstate_rem_object(kctsr_id(kctsr));
        _csetf_kctsr_id(kctsr, (SubLObject)kbq_query_run.NIL);
        SubLObject cdolist_list_var = kctsr_test_runstates(kctsr);
        SubLObject kctr = (SubLObject)kbq_query_run.NIL;
        kctr = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            destroy_kct_runstate(kctr);
            cdolist_list_var = cdolist_list_var.rest();
            kctr = cdolist_list_var.first();
        }
        _csetf_kctsr_test_set(kctsr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctsr_lock(kctsr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctsr_result(kctsr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctsr_run_status(kctsr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctsr_start(kctsr, (SubLObject)kbq_query_run.NIL);
        _csetf_kctsr_end(kctsr, (SubLObject)kbq_query_run.NIL);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105598L)
    public static SubLObject kct_set_runstate_test_set(final SubLObject kctsr) {
        return kctsr_test_set(kctsr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105701L)
    public static SubLObject kct_set_runstate_lock(final SubLObject kctsr) {
        return kctsr_lock(kctsr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105775L)
    public static SubLObject kct_set_runstate_result(final SubLObject kctsr) {
        return kctsr_result(kctsr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105853L)
    public static SubLObject kct_set_runstate_test_runstates(final SubLObject kctsr) {
        return kctsr_test_runstates(kctsr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105947L)
    public static SubLObject kct_set_runstate_result_status(final SubLObject kctsr) {
        final SubLObject runs = kct_test_set_run_test_runs(kct_set_runstate_result(kctsr));
        final SubLObject errorP = Sequences.find_if(Symbols.symbol_function((SubLObject)kbq_query_run.$sym372$KCT_ERROR_RESULT_P), runs, Symbols.symbol_function((SubLObject)kbq_query_run.$sym373$KCT_TEST_RUN_STATUS), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject failureP = Sequences.find_if(Symbols.symbol_function((SubLObject)kbq_query_run.$sym374$KCT_FAILURE_RESULT_P), runs, Symbols.symbol_function((SubLObject)kbq_query_run.$sym373$KCT_TEST_RUN_STATUS), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        if (kbq_query_run.NIL != errorP) {
            return (SubLObject)kbq_query_run.$kw2$ERROR;
        }
        if (kbq_query_run.NIL != failureP) {
            return (SubLObject)kbq_query_run.$kw1$FAILURE;
        }
        return (SubLObject)kbq_query_run.$kw0$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 106334L)
    public static SubLObject kct_set_runstate_run_status(final SubLObject kctsr) {
        return kctsr_run_status(kctsr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 106438L)
    public static SubLObject kct_set_runstate_start(final SubLObject kctsr) {
        return kctsr_start(kctsr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 106514L)
    public static SubLObject kct_set_runstate_end(final SubLObject kctsr) {
        return kctsr_end(kctsr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 106587L)
    public static SubLObject set_kctsr_result(final SubLObject kctsr, final SubLObject test_set_run) {
        assert kbq_query_run.NIL != kct_set_runstate_p(kctsr) : kctsr;
        assert kbq_query_run.NIL != kct_test_set_run_p(test_set_run) : test_set_run;
        final SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctsr_result(kctsr, test_set_run);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 106842L)
    public static SubLObject kctsr_test_runstate_add(final SubLObject kctsr, final SubLObject kctr) {
        assert kbq_query_run.NIL != kct_set_runstate_p(kctsr) : kctsr;
        assert kbq_query_run.NIL != kct_runstate_p(kctr) : kctr;
        final SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject test_runstates = kctsr_test_runstates(kctsr);
            _csetf_kctsr_test_runstates(kctsr, list_utilities.add_to_end(kctr, test_runstates));
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 107161L)
    public static SubLObject kctsr_test_runstate_remove(final SubLObject kctsr, final SubLObject kctr) {
        assert kbq_query_run.NIL != kct_set_runstate_p(kctsr) : kctsr;
        assert kbq_query_run.NIL != kct_runstate_p(kctr) : kctr;
        final SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject test_runstates = kctsr_test_runstates(kctsr);
            _csetf_kctsr_test_runstates(kctsr, Sequences.remove(kctr, test_runstates, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED));
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 107479L)
    public static SubLObject set_kctsr_run_status(final SubLObject kctsr, final SubLObject run_status) {
        assert kbq_query_run.NIL != kct_set_runstate_p(kctsr) : kctsr;
        assert kbq_query_run.NIL != Types.keywordp(run_status) : run_status;
        final SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctsr_run_status(kctsr, run_status);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 107713L)
    public static SubLObject set_kctsr_start(final SubLObject kctsr, SubLObject time) {
        if (time == kbq_query_run.UNPROVIDED) {
            time = (SubLObject)kbq_query_run.NIL;
        }
        assert kbq_query_run.NIL != kct_set_runstate_p(kctsr) : kctsr;
        if (kbq_query_run.NIL == time) {
            time = Time.get_universal_time();
        }
        final SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctsr_start(kctsr, time);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 107956L)
    public static SubLObject set_kctsr_end(final SubLObject kctsr, SubLObject time) {
        if (time == kbq_query_run.UNPROVIDED) {
            time = (SubLObject)kbq_query_run.NIL;
        }
        assert kbq_query_run.NIL != kct_set_runstate_p(kctsr) : kctsr;
        if (kbq_query_run.NIL == time) {
            time = Time.get_universal_time();
        }
        final SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = (SubLObject)kbq_query_run.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctsr_end(kctsr, time);
        }
        finally {
            if (kbq_query_run.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 108195L)
    public static SubLObject kbq_save_query_set_run(final SubLObject query_set_run, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)kbq_query_run.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kbq_query_run.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)kbq_query_run.$kw165$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kbq_query_run.$str225$Unable_to_open__S, filename);
            }
            final SubLObject stream_$56 = stream;
            final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind((SubLObject)kbq_query_run.NIL, thread);
                cfasl.cfasl_set_common_symbols_simple(kbq_cfasl_common_symbols_simple());
                cfasl.cfasl_output_externalized(query_set_run, stream_$56);
            }
            finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kbq_query_run.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 108575L)
    public static SubLObject kct_save_test_set_run(final SubLObject test_set_run, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)kbq_query_run.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kbq_query_run.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)kbq_query_run.$kw165$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kbq_query_run.$str225$Unable_to_open__S, filename);
            }
            final SubLObject stream_$57 = stream;
            final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind((SubLObject)kbq_query_run.NIL, thread);
                cfasl.cfasl_set_common_symbols_simple(kbq_query_run.$kct_cfasl_common_symbols$.getGlobalValue());
                cfasl.cfasl_output_externalized(test_set_run, stream_$57);
            }
            finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kbq_query_run.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 108825L)
    public static SubLObject kbq_save_query_set_run_without_results(SubLObject query_set_run, final SubLObject filename) {
        query_set_run = kbq_discard_query_set_run_results(query_set_run);
        return kbq_save_query_set_run(query_set_run, filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 109036L)
    public static SubLObject kbq_open_query_set_run_output_stream(final SubLObject filename, SubLObject file_mode) {
        if (file_mode == kbq_query_run.UNPROVIDED) {
            file_mode = (SubLObject)kbq_query_run.$kw165$OUTPUT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)kbq_query_run.NIL;
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
        try {
            stream_macros.$stream_requires_locking$.bind((SubLObject)kbq_query_run.NIL, thread);
            stream = compatibility.open_binary(filename, file_mode);
        }
        finally {
            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 109276L)
    public static SubLObject kct_open_test_set_run_output_stream(final SubLObject filename, SubLObject file_mode) {
        if (file_mode == kbq_query_run.UNPROVIDED) {
            file_mode = (SubLObject)kbq_query_run.$kw165$OUTPUT;
        }
        return kbq_open_query_set_run_output_stream(filename, file_mode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 109437L)
    public static SubLObject kbq_save_query_set_run_preamble(final SubLObject stream, SubLObject comment) {
        if (comment == kbq_query_run.UNPROVIDED) {
            comment = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preamble = kbq_make_query_set_run((SubLObject)kbq_query_run.NIL, comment);
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)kbq_query_run.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(kbq_cfasl_common_symbols_simple());
            cfasl.cfasl_output_externalized(preamble, stream);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        streams_high.force_output(stream);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 109738L)
    public static SubLObject kct_save_test_set_run_preamble(final SubLObject stream, SubLObject comment) {
        if (comment == kbq_query_run.UNPROVIDED) {
            comment = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preamble = kct_make_test_set_run((SubLObject)kbq_query_run.NIL, comment);
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)kbq_query_run.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(kbq_query_run.$kct_cfasl_common_symbols$.getGlobalValue());
            cfasl.cfasl_output_externalized(preamble, stream);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        streams_high.force_output(stream);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 110028L)
    public static SubLObject kbq_save_query_run(final SubLObject query_run, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)kbq_query_run.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(kbq_cfasl_common_symbols_simple());
            cfasl.cfasl_output_externalized(query_run, stream);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        streams_high.force_output(stream);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 110242L)
    public static SubLObject kct_save_test_run(final SubLObject test_run, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)kbq_query_run.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(kbq_query_run.$kct_cfasl_common_symbols$.getGlobalValue());
            cfasl.cfasl_output_externalized(test_run, stream);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        streams_high.force_output(stream);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 110444L)
    public static SubLObject do_query_set_run(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list376);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_set_run = (SubLObject)kbq_query_run.NIL;
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        SubLObject filename = (SubLObject)kbq_query_run.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list376);
        query_set_run = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list376);
        query_run = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list376);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kbq_query_run.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kbq_query_run.NIL;
        SubLObject current_$58 = (SubLObject)kbq_query_run.NIL;
        while (kbq_query_run.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbq_query_run.$list376);
            current_$58 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbq_query_run.$list376);
            if (kbq_query_run.NIL == conses_high.member(current_$58, (SubLObject)kbq_query_run.$list377, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                bad = (SubLObject)kbq_query_run.T;
            }
            if (current_$58 == kbq_query_run.$kw82$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kbq_query_run.NIL != bad && kbq_query_run.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbq_query_run.$list376);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw378$DONE, current);
        final SubLObject done = (SubLObject)((kbq_query_run.NIL != done_tail) ? conses_high.cadr(done_tail) : kbq_query_run.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject stream = (SubLObject)kbq_query_run.$sym379$STREAM;
        final SubLObject done_var = (SubLObject)kbq_query_run.$sym380$DONE_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym381$PROGN, (SubLObject)ConsesLow.listS((SubLObject)kbq_query_run.$sym382$CHECK_TYPE, filename, (SubLObject)kbq_query_run.$list383), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym384$WITH_PRIVATE_BINARY_FILE, (SubLObject)ConsesLow.listS(stream, filename, (SubLObject)kbq_query_run.$list385), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym386$WITH_CFASL_COMMON_SYMBOLS_SIMPLE, (SubLObject)kbq_query_run.$list387, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym388$WITH_NEW_CFASL_INPUT_GUID_STRING_RESOURCE, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(query_set_run, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym389$KBQ_LOAD_QUERY_SET_RUN_INT, stream))), (SubLObject)ConsesLow.listS((SubLObject)kbq_query_run.$sym390$CSOME, (SubLObject)ConsesLow.list(query_run, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym79$KBQ_QUERY_SET_RUN_QUERY_RUNS, query_set_run), done), ConsesLow.append(body, (SubLObject)kbq_query_run.NIL)), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(done_var, done)), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym391$WHILE, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym392$CNOT, done_var), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(query_run, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym393$KBQ_LOAD_QUERY_RUN_INT, stream))), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym394$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)kbq_query_run.EQ, query_run, (SubLObject)kbq_query_run.$list395), (SubLObject)ConsesLow.listS((SubLObject)kbq_query_run.$sym194$CSETQ, done_var, (SubLObject)kbq_query_run.$list396)), (SubLObject)ConsesLow.listS((SubLObject)kbq_query_run.$sym397$PUNLESS, done_var, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym194$CSETQ, query_run, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym398$KBQ_NCLEAN_QUERY_RUN, query_run)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym194$CSETQ, done_var, done))))))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 111511L)
    public static SubLObject do_query_set_run_query_runs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list399);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        SubLObject filename = (SubLObject)kbq_query_run.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list399);
        query_run = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list399);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kbq_query_run.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kbq_query_run.NIL;
        SubLObject current_$59 = (SubLObject)kbq_query_run.NIL;
        while (kbq_query_run.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbq_query_run.$list399);
            current_$59 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbq_query_run.$list399);
            if (kbq_query_run.NIL == conses_high.member(current_$59, (SubLObject)kbq_query_run.$list377, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                bad = (SubLObject)kbq_query_run.T;
            }
            if (current_$59 == kbq_query_run.$kw82$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kbq_query_run.NIL != bad && kbq_query_run.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbq_query_run.$list399);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw378$DONE, current);
        final SubLObject done = (SubLObject)((kbq_query_run.NIL != done_tail) ? conses_high.cadr(done_tail) : kbq_query_run.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject query_set_run = (SubLObject)kbq_query_run.$sym400$QUERY_SET_RUN;
        return (SubLObject)ConsesLow.listS((SubLObject)kbq_query_run.$sym6$DO_QUERY_SET_RUN, (SubLObject)ConsesLow.list(query_set_run, query_run, filename, (SubLObject)kbq_query_run.$kw378$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$sym401$IGNORE, query_set_run), ConsesLow.append(body, (SubLObject)kbq_query_run.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 111758L)
    public static SubLObject kbq_load_query_set_run(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kbq_query_run.NIL != Types.stringp(filename) : filename;
        SubLObject query_set_run = (SubLObject)kbq_query_run.NIL;
        SubLObject additional_query_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject stream = (SubLObject)kbq_query_run.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kbq_query_run.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)kbq_query_run.$kw403$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kbq_query_run.$str225$Unable_to_open__S, filename);
            }
            final SubLObject stream_$60 = stream;
            final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind((SubLObject)kbq_query_run.NIL, thread);
                cfasl.cfasl_set_common_symbols_simple(kbq_cfasl_common_symbols_simple());
                final SubLObject _prev_bind_0_$61 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    cfasl.$cfasl_input_guid_string_resource$.bind(cfasl.get_new_cfasl_input_guid_string_resource(), thread);
                    query_set_run = kbq_load_query_set_run_int(stream_$60);
                    SubLObject doneP = (SubLObject)kbq_query_run.NIL;
                    while (kbq_query_run.NIL == doneP) {
                        final SubLObject query_run = kbq_load_query_run_int(stream_$60);
                        doneP = Equality.eq(query_run, (SubLObject)kbq_query_run.$kw404$EOF);
                        if (kbq_query_run.NIL == doneP) {
                            additional_query_runs = (SubLObject)ConsesLow.cons(query_run, additional_query_runs);
                        }
                    }
                }
                finally {
                    cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$61, thread);
                }
            }
            finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kbq_query_run.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        additional_query_runs = Sequences.nreverse(additional_query_runs);
        query_set_run = kbq_query_set_run_nmerge_query_runs(query_set_run, additional_query_runs);
        query_set_run = kbq_nclean_query_set_run(query_set_run);
        return query_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 112605L)
    public static SubLObject kbq_load_query_set_run_int(final SubLObject stream) {
        return cfasl.cfasl_input(stream, (SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 112723L)
    public static SubLObject kbq_load_query_run_int(final SubLObject stream) {
        return cfasl.cfasl_input(stream, (SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$kw404$EOF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 112844L)
    public static SubLObject kbq_query_set_run_nmerge_query_runs(SubLObject query_set_run, final SubLObject additional_query_runs) {
        if (kbq_query_run.NIL != additional_query_runs) {
            SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
            query_runs = ConsesLow.nconc(query_runs, additional_query_runs);
            query_set_run = conses_high.putf(query_set_run, (SubLObject)kbq_query_run.$kw78$QUERY_RUNS, query_runs);
        }
        return query_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 113202L)
    public static SubLObject kct_load_test_set_run(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kbq_query_run.NIL != Types.stringp(filename) : filename;
        SubLObject test_set_run = (SubLObject)kbq_query_run.NIL;
        SubLObject additional_test_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject stream = (SubLObject)kbq_query_run.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kbq_query_run.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)kbq_query_run.$kw403$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kbq_query_run.$str225$Unable_to_open__S, filename);
            }
            final SubLObject stream_$62 = stream;
            final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind((SubLObject)kbq_query_run.NIL, thread);
                cfasl.cfasl_set_common_symbols_simple(kbq_query_run.$kct_cfasl_common_symbols$.getGlobalValue());
                final SubLObject _prev_bind_0_$63 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    cfasl.$cfasl_input_guid_string_resource$.bind(cfasl.get_new_cfasl_input_guid_string_resource(), thread);
                    test_set_run = cfasl.cfasl_input(stream_$62, (SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.UNPROVIDED);
                    SubLObject doneP = (SubLObject)kbq_query_run.NIL;
                    while (kbq_query_run.NIL == doneP) {
                        final SubLObject test_run = cfasl.cfasl_input(stream_$62, (SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$kw404$EOF);
                        doneP = Equality.eq(test_run, (SubLObject)kbq_query_run.$kw404$EOF);
                        if (kbq_query_run.NIL == doneP) {
                            additional_test_runs = (SubLObject)ConsesLow.cons(test_run, additional_test_runs);
                        }
                    }
                }
                finally {
                    cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$63, thread);
                }
            }
            finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kbq_query_run.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        additional_test_runs = Sequences.nreverse(additional_test_runs);
        test_set_run = kct_test_set_run_nmerge_test_runs(test_set_run, additional_test_runs);
        test_set_run = kct_nclean_test_set_run(test_set_run);
        return test_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 114008L)
    public static SubLObject kct_test_set_run_nmerge_test_runs(SubLObject test_set_run, final SubLObject additional_test_runs) {
        if (kbq_query_run.NIL != additional_test_runs) {
            SubLObject test_runs = kct_test_set_run_test_runs(test_set_run);
            test_runs = ConsesLow.nconc(test_runs, additional_test_runs);
            test_set_run = conses_high.putf(test_set_run, (SubLObject)kbq_query_run.$kw83$TEST_RUNS, test_runs);
        }
        return test_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 114349L)
    public static SubLObject kbq_nclean_query_set_run(final SubLObject query_set_run) {
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            kbq_nclean_query_run(query_run);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return query_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 114743L)
    public static SubLObject kct_nclean_test_set_run(final SubLObject test_set_run) {
        SubLObject cdolist_list_var = kct_test_set_run_test_runs(test_set_run);
        SubLObject test_run = (SubLObject)kbq_query_run.NIL;
        test_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query_run = kct_test_run_query_run(test_run);
            kbq_nclean_query_run(query_run);
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return test_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 115176L)
    public static SubLObject kbq_nclean_query_run(SubLObject query_run) {
        final SubLObject time_to_last_answer = kbq_query_run_time_to_last_answer(query_run);
        if (kbq_query_run.NIL != time_to_last_answer && !time_to_last_answer.isNumber()) {
            Errors.warn((SubLObject)kbq_query_run.$str405$dwimming__s_to_NIL, time_to_last_answer);
            query_run = conses_high.putf(query_run, (SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER, (SubLObject)kbq_query_run.NIL);
        }
        return query_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 115670L)
    public static SubLObject kbq_strip_results_from_query_set_run_file(final SubLObject filename, SubLObject suffix) {
        if (suffix == kbq_query_run.UNPROVIDED) {
            suffix = (SubLObject)kbq_query_run.$str407$_no_results;
        }
        final SubLObject suffixless_filename = kbq_strip_suffix_from_filename(filename);
        final SubLObject query_set_run = kbq_load_query_set_run(filename);
        final SubLObject new_filename = Sequences.cconcatenate(suffixless_filename, new SubLObject[] { suffix, kbq_query_run.$query_set_run_file_extension$.getGlobalValue() });
        assert kbq_query_run.NIL != file_utilities.file_valid_for_writing_p(new_filename) : new_filename;
        return kbq_save_query_set_run_without_results(query_set_run, new_filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 116285L)
    public static SubLObject kbq_strip_suffix_from_filename(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbq_query_run.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kbq_query_run.NIL == string_utilities.ends_with(filename, kbq_query_run.$query_set_run_file_extension$.getGlobalValue(), (SubLObject)kbq_query_run.UNPROVIDED)) {
            Errors.error((SubLObject)kbq_query_run.$str408$Expected_a__a_file__got__s, kbq_query_run.$query_set_run_file_extension$.getGlobalValue(), filename);
        }
        return string_utilities.strip_final(filename, Sequences.length(kbq_query_run.$query_set_run_file_extension$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 116546L)
    public static SubLObject kct_strip_suffix_from_filename(final SubLObject filename) {
        return kbq_strip_suffix_from_filename(filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 116656L)
    public static SubLObject kbq_filter_query_set_run_by_property_value(final SubLObject query_set_run, final SubLObject comment, final SubLObject property, final SubLObject value, SubLObject test) {
        if (test == kbq_query_run.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kbq_query_run.EQUAL);
        }
        final SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject filtered_query_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            if (kbq_query_run.NIL != Functions.funcall(test, value, kbq_query_run_property_value(query_run, property, (SubLObject)kbq_query_run.UNPROVIDED))) {
                filtered_query_runs = (SubLObject)ConsesLow.cons(query_run, filtered_query_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        filtered_query_runs = Sequences.nreverse(filtered_query_runs);
        SubLObject filtered_query_set_run = conses_high.copy_list(query_set_run);
        filtered_query_set_run = conses_high.putf(filtered_query_set_run, (SubLObject)kbq_query_run.$kw78$QUERY_RUNS, filtered_query_runs);
        if (kbq_query_run.NIL != comment) {
            filtered_query_set_run = conses_high.putf(filtered_query_set_run, (SubLObject)kbq_query_run.$kw77$COMMENT, comment);
        }
        return filtered_query_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 117595L)
    public static SubLObject kbq_filter_query_set_run_by_test(final SubLObject query_set_run, final SubLObject comment, final SubLObject test, SubLObject key) {
        if (key == kbq_query_run.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)kbq_query_run.IDENTITY);
        }
        final SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject filtered_query_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            if (kbq_query_run.NIL != Functions.funcall(test, Functions.funcall(key, query_run))) {
                filtered_query_runs = (SubLObject)ConsesLow.cons(query_run, filtered_query_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        filtered_query_runs = Sequences.nreverse(filtered_query_runs);
        SubLObject filtered_query_set_run = conses_high.copy_list(query_set_run);
        filtered_query_set_run = conses_high.putf(filtered_query_set_run, (SubLObject)kbq_query_run.$kw78$QUERY_RUNS, filtered_query_runs);
        if (kbq_query_run.NIL != comment) {
            filtered_query_set_run = conses_high.putf(filtered_query_set_run, (SubLObject)kbq_query_run.$kw77$COMMENT, comment);
        }
        return filtered_query_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 118412L)
    public static SubLObject kct_filter_test_set_run_by_test(final SubLObject test_set_run, final SubLObject comment, final SubLObject test, SubLObject key) {
        if (key == kbq_query_run.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)kbq_query_run.IDENTITY);
        }
        final SubLObject test_runs = kct_test_set_run_test_runs(test_set_run);
        SubLObject filtered_test_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = test_runs;
        SubLObject test_run = (SubLObject)kbq_query_run.NIL;
        test_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            if (kbq_query_run.NIL != Functions.funcall(test, Functions.funcall(key, test_run))) {
                filtered_test_runs = (SubLObject)ConsesLow.cons(test_run, filtered_test_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        filtered_test_runs = Sequences.nreverse(filtered_test_runs);
        SubLObject filtered_test_set_run = conses_high.copy_list(test_set_run);
        filtered_test_set_run = conses_high.putf(filtered_test_set_run, (SubLObject)kbq_query_run.$kw83$TEST_RUNS, filtered_test_runs);
        if (kbq_query_run.NIL != comment) {
            filtered_test_set_run = conses_high.putf(filtered_test_set_run, (SubLObject)kbq_query_run.$kw77$COMMENT, comment);
        }
        return filtered_test_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 119203L)
    public static SubLObject kbq_answerable_query_set_run(final SubLObject query_set_run) {
        final SubLObject comment = kbq_query_set_run_comment(query_set_run);
        final SubLObject new_comment = PrintLow.format((SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$str409$answerable_sub_run_of_____A, comment);
        return kbq_filter_query_set_run_by_test(query_set_run, new_comment, Symbols.symbol_function((SubLObject)kbq_query_run.$sym410$POSITIVE_INTEGER_P), Symbols.symbol_function((SubLObject)kbq_query_run.$sym107$KBQ_QUERY_RUN_ANSWER_COUNT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 119653L)
    public static SubLObject kct_answerable_test_set_run(final SubLObject test_set_run) {
        final SubLObject comment = kct_test_set_run_comment(test_set_run);
        final SubLObject new_comment = PrintLow.format((SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$str409$answerable_sub_run_of_____A, comment);
        return kct_filter_test_set_run_by_test(test_set_run, new_comment, Symbols.symbol_function((SubLObject)kbq_query_run.$sym410$POSITIVE_INTEGER_P), Symbols.symbol_function((SubLObject)kbq_query_run.$sym411$KCT_TEST_RUN_ANSWER_COUNT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 120076L)
    public static SubLObject kct_succeeding_test_set_run(final SubLObject test_set_run) {
        final SubLObject comment = kct_test_set_run_comment(test_set_run);
        final SubLObject new_comment = PrintLow.format((SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$str412$succeeding_sub_run_of_____A, comment);
        return kct_filter_test_set_run_by_test(test_set_run, new_comment, (SubLObject)kbq_query_run.$sym413$KCT_SUCCESS_RESULT_P, (SubLObject)kbq_query_run.$sym373$KCT_TEST_RUN_STATUS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 120487L)
    public static SubLObject kbq_unanswerable_query_set_run(final SubLObject query_set_run) {
        final SubLObject comment = kbq_query_set_run_comment(query_set_run);
        final SubLObject new_comment = Sequences.cconcatenate((SubLObject)kbq_query_run.$str414$unanswerable_sub_run_of__, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_a_no_copy(comment) });
        return kbq_filter_query_set_run_by_property_value(query_set_run, new_comment, (SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, (SubLObject)kbq_query_run.ZERO_INTEGER, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 120902L)
    public static SubLObject kct_unanswerable_test_set_run(final SubLObject test_set_run) {
        final SubLObject comment = kct_test_set_run_comment(test_set_run);
        final SubLObject new_comment = Sequences.cconcatenate((SubLObject)kbq_query_run.$str414$unanswerable_sub_run_of__, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_a_no_copy(comment) });
        return kct_filter_test_set_run_by_test(test_set_run, new_comment, Symbols.symbol_function((SubLObject)kbq_query_run.$sym415$ZEROP), Symbols.symbol_function((SubLObject)kbq_query_run.$sym411$KCT_TEST_RUN_ANSWER_COUNT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 121318L)
    public static SubLObject kct_failing_test_set_run(final SubLObject test_set_run) {
        final SubLObject comment = kct_test_set_run_comment(test_set_run);
        final SubLObject new_comment = PrintLow.format((SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$str416$failing_sub_run_of_____A, comment);
        return kct_filter_test_set_run_by_test(test_set_run, new_comment, (SubLObject)kbq_query_run.$sym374$KCT_FAILURE_RESULT_P, (SubLObject)kbq_query_run.$sym373$KCT_TEST_RUN_STATUS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 121719L)
    public static SubLObject kct_erroring_test_set_run(final SubLObject test_set_run) {
        return kct_filter_test_set_run_to_tests(test_set_run, kct_erroring_tests(test_set_run), (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 121959L)
    public static SubLObject kct_common_sense_test_set_run(final SubLObject test_set_run) {
        return kct_subcollection_test_set_run(test_set_run, kbq_query_run.$const417$CommonSenseTest);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 122219L)
    public static SubLObject kct_regression_test_set_run(final SubLObject test_set_run) {
        return kct_subcollection_test_set_run(test_set_run, kbq_query_run.$const418$KBContentRegressionTest);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 122493L)
    public static SubLObject kct_subcollection_test_set_run(final SubLObject test_set_run, final SubLObject collection) {
        final SubLObject test_runs = kct_test_set_run_test_runs(test_set_run);
        SubLObject common_sense_test_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = test_runs;
        SubLObject test_run = (SubLObject)kbq_query_run.NIL;
        test_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            if (kbq_query_run.NIL != isa.isa_in_any_mtP(kct_test_run_test(test_run), collection)) {
                common_sense_test_runs = (SubLObject)ConsesLow.cons(test_run, common_sense_test_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        common_sense_test_runs = Sequences.nreverse(common_sense_test_runs);
        SubLObject common_sense_test_set_run = conses_high.copy_list(test_set_run);
        final SubLObject comment = kct_test_set_run_comment(test_set_run);
        final SubLObject new_comment = PrintLow.format((SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$str419$_s_sub_run_of_____A, collection, comment);
        common_sense_test_set_run = conses_high.putf(common_sense_test_set_run, (SubLObject)kbq_query_run.$kw83$TEST_RUNS, common_sense_test_runs);
        common_sense_test_set_run = conses_high.putf(common_sense_test_set_run, (SubLObject)kbq_query_run.$kw77$COMMENT, new_comment);
        return common_sense_test_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 123314L)
    public static SubLObject kct_failing_tests(final SubLObject test_set_run) {
        return kct_test_set_run_tests(kct_failing_test_set_run(test_set_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 123437L)
    public static SubLObject kct_succeeding_tests(final SubLObject test_set_run) {
        return kct_test_set_run_tests(kct_succeeding_test_set_run(test_set_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 123566L)
    public static SubLObject kct_answerable_tests(final SubLObject test_set_run) {
        return kct_test_set_run_tests(kct_answerable_test_set_run(test_set_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 123695L)
    public static SubLObject kct_unanswerable_tests(final SubLObject test_set_run) {
        return kct_test_set_run_tests(kct_unanswerable_test_set_run(test_set_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 123828L)
    public static SubLObject kct_newly_failing_tests(final SubLObject old_test_set_run, final SubLObject new_test_set_run) {
        return list_utilities.fast_set_difference(kct_failing_tests(new_test_set_run), kct_failing_tests(old_test_set_run), (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 124098L)
    public static SubLObject kbq_same_property_value_queries(final SubLObject query_set_run_1, final SubLObject query_set_run_2, final SubLObject property, SubLObject test, SubLObject key) {
        if (test == kbq_query_run.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kbq_query_run.EQL);
        }
        if (key == kbq_query_run.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)kbq_query_run.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_runs_1 = kbq_query_set_run_query_runs(query_set_run_1);
        final SubLObject query_runs_2 = kbq_query_set_run_query_runs(query_set_run_2);
        final SubLObject property_value_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kbq_query_run.EQUAL), Sequences.length(query_runs_1));
        SubLObject same_property_value_queries = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = query_runs_1;
        SubLObject query_run_1 = (SubLObject)kbq_query_run.NIL;
        query_run_1 = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query = kbq_query_run_query(query_run_1);
            final SubLObject value_1 = kbq_query_run_property_value(query_run_1, property, (SubLObject)kbq_query_run.UNPROVIDED);
            final SubLObject compare_value_1 = Functions.funcall(key, value_1);
            dictionary.dictionary_enter(property_value_dictionary, query, compare_value_1);
            cdolist_list_var = cdolist_list_var.rest();
            query_run_1 = cdolist_list_var.first();
        }
        cdolist_list_var = query_runs_2;
        SubLObject query_run_2 = (SubLObject)kbq_query_run.NIL;
        query_run_2 = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query = kbq_query_run_query(query_run_2);
            final SubLObject value_2 = kbq_query_run_property_value(query_run_2, property, (SubLObject)kbq_query_run.UNPROVIDED);
            final SubLObject compare_value_2 = Functions.funcall(key, value_2);
            thread.resetMultipleValues();
            final SubLObject compare_value_3 = dictionary.dictionary_lookup(property_value_dictionary, query, (SubLObject)kbq_query_run.UNPROVIDED);
            final SubLObject presentP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (kbq_query_run.NIL != presentP && kbq_query_run.NIL != Functions.funcall(test, compare_value_3, compare_value_2)) {
                same_property_value_queries = (SubLObject)ConsesLow.cons(query, same_property_value_queries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run_2 = cdolist_list_var.first();
        }
        return Sequences.nreverse(same_property_value_queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 125527L)
    public static SubLObject kbq_mutually_answerable_queries(final SubLObject query_set_runs) {
        SubLObject result_query_set_run = query_set_runs.first();
        SubLObject cdolist_list_var = query_set_runs.rest();
        SubLObject query_set_run = (SubLObject)kbq_query_run.NIL;
        query_set_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            result_query_set_run = kbq_mutually_answerable_query_set_runs(result_query_set_run, query_set_run);
            cdolist_list_var = cdolist_list_var.rest();
            query_set_run = cdolist_list_var.first();
        }
        return kbq_query_set_run_queries(result_query_set_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 125872L)
    public static SubLObject kbq_mutually_unanswerable_queries(final SubLObject query_set_runs) {
        SubLObject result_query_set_run = query_set_runs.first();
        SubLObject cdolist_list_var = query_set_runs.rest();
        SubLObject query_set_run = (SubLObject)kbq_query_run.NIL;
        query_set_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            result_query_set_run = kbq_mutually_unanswerable_query_set_runs(result_query_set_run, query_set_run);
            cdolist_list_var = cdolist_list_var.rest();
            query_set_run = cdolist_list_var.first();
        }
        return kbq_query_set_run_queries(result_query_set_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 126221L)
    public static SubLObject kbq_fast_queries(final SubLObject query_set_run, SubLObject fast_threshold) {
        if (fast_threshold == kbq_query_run.UNPROVIDED) {
            fast_threshold = (SubLObject)kbq_query_run.ONE_INTEGER;
        }
        SubLObject fast_queries = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            if (kbq_query_run.NIL != list_utilities.safe_L(kbq_query_run_total_time(query_run), fast_threshold)) {
                fast_queries = (SubLObject)ConsesLow.cons(kbq_query_run_query(query_run), fast_queries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(fast_queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 126653L)
    public static SubLObject kct_mutually_succeeding_tests(final SubLObject test_set_runs) {
        SubLObject result_test_set_run = kct_succeeding_test_set_run(test_set_runs.first());
        SubLObject cdolist_list_var = test_set_runs.rest();
        SubLObject test_set_run = (SubLObject)kbq_query_run.NIL;
        test_set_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            result_test_set_run = kct_mutually_succeeding_test_set_runs(result_test_set_run, test_set_run);
            cdolist_list_var = cdolist_list_var.rest();
            test_set_run = cdolist_list_var.first();
        }
        return kct_test_set_run_tests(result_test_set_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 127013L)
    public static SubLObject kct_mutually_failing_tests(final SubLObject test_set_runs) {
        SubLObject result_test_set_run = kct_failing_test_set_run(test_set_runs.first());
        SubLObject cdolist_list_var = test_set_runs.rest();
        SubLObject test_set_run = (SubLObject)kbq_query_run.NIL;
        test_set_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            result_test_set_run = kct_mutually_failing_test_set_runs(result_test_set_run, test_set_run);
            cdolist_list_var = cdolist_list_var.rest();
            test_set_run = cdolist_list_var.first();
        }
        return kct_test_set_run_tests(result_test_set_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 127364L)
    public static SubLObject kbq_mutually_answerable_query_set_runs(final SubLObject query_set_run_1, final SubLObject query_set_run_2) {
        final SubLObject answerable_query_set_run_1 = kbq_answerable_query_set_run(query_set_run_1);
        final SubLObject answerable_query_set_run_2 = kbq_answerable_query_set_run(query_set_run_2);
        final SubLObject answerable_queries_1 = kbq_extract_property_values(answerable_query_set_run_1, (SubLObject)kbq_query_run.$kw16$QUERY, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject answerable_queries_2 = kbq_extract_property_values(answerable_query_set_run_2, (SubLObject)kbq_query_run.$kw16$QUERY, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject mutually_answerable_queries = keyhash_utilities.fast_intersection(answerable_queries_1, answerable_queries_2, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject filtered_query_set_run_1 = kbq_filter_query_set_run_to_queries(answerable_query_set_run_1, mutually_answerable_queries, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject filtered_query_set_run_2 = kbq_filter_query_set_run_to_queries(answerable_query_set_run_2, mutually_answerable_queries, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject set_difference_1 = kbq_filter_query_set_run_to_queries(answerable_query_set_run_1, mutually_answerable_queries, (SubLObject)kbq_query_run.T);
        final SubLObject set_difference_2 = kbq_filter_query_set_run_to_queries(answerable_query_set_run_2, mutually_answerable_queries, (SubLObject)kbq_query_run.T);
        return Values.values(filtered_query_set_run_1, filtered_query_set_run_2, set_difference_1, set_difference_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 130305L)
    public static SubLObject kbq_mutually_unanswerable_query_set_runs(final SubLObject query_set_run_1, final SubLObject query_set_run_2) {
        final SubLObject unanswerable_query_set_run_1 = kbq_unanswerable_query_set_run(query_set_run_1);
        final SubLObject unanswerable_query_set_run_2 = kbq_unanswerable_query_set_run(query_set_run_2);
        final SubLObject unanswerable_queries_1 = kbq_extract_property_values(unanswerable_query_set_run_1, (SubLObject)kbq_query_run.$kw16$QUERY, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject unanswerable_queries_2 = kbq_extract_property_values(unanswerable_query_set_run_2, (SubLObject)kbq_query_run.$kw16$QUERY, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject mutually_unanswerable_queries = keyhash_utilities.fast_intersection(unanswerable_queries_1, unanswerable_queries_2, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject filtered_query_set_run_1 = kbq_filter_query_set_run_to_queries(unanswerable_query_set_run_1, mutually_unanswerable_queries, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject filtered_query_set_run_2 = kbq_filter_query_set_run_to_queries(unanswerable_query_set_run_2, mutually_unanswerable_queries, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject set_difference_1 = kbq_filter_query_set_run_to_queries(unanswerable_query_set_run_1, mutually_unanswerable_queries, (SubLObject)kbq_query_run.T);
        final SubLObject set_difference_2 = kbq_filter_query_set_run_to_queries(unanswerable_query_set_run_2, mutually_unanswerable_queries, (SubLObject)kbq_query_run.T);
        return Values.values(filtered_query_set_run_1, filtered_query_set_run_2, set_difference_1, set_difference_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 131811L)
    public static SubLObject kbq_query_set_runs_common_queries(final SubLObject query_set_runs) {
        SubLObject queries_list = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = query_set_runs;
        SubLObject query_set_run = (SubLObject)kbq_query_run.NIL;
        query_set_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            queries_list = (SubLObject)ConsesLow.cons(kbq_query_set_run_queries(query_set_run), queries_list);
            cdolist_list_var = cdolist_list_var.rest();
            query_set_run = cdolist_list_var.first();
        }
        return list_utilities.fast_intersect_all(queries_list, Symbols.symbol_function((SubLObject)kbq_query_run.EQ), (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 132071L)
    public static SubLObject kbq_common_queries_query_set_runs(final SubLObject query_set_runs) {
        SubLObject filtered_query_set_runs = (SubLObject)kbq_query_run.NIL;
        final SubLObject common_queries = kbq_query_set_runs_common_queries(query_set_runs);
        SubLObject cdolist_list_var = query_set_runs;
        SubLObject query_set_run = (SubLObject)kbq_query_run.NIL;
        query_set_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject filtered_query_set_run = kbq_filter_query_set_run_to_queries(query_set_run, common_queries, (SubLObject)kbq_query_run.UNPROVIDED);
            filtered_query_set_runs = (SubLObject)ConsesLow.cons(filtered_query_set_run, filtered_query_set_runs);
            cdolist_list_var = cdolist_list_var.rest();
            query_set_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_query_set_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 132654L)
    public static SubLObject kbq_common_queries_two_query_set_runs(final SubLObject query_set_run_1, final SubLObject query_set_run_2) {
        SubLObject current;
        final SubLObject datum = current = kbq_common_queries_query_set_runs((SubLObject)ConsesLow.list(query_set_run_1, query_set_run_2));
        SubLObject filtered_query_set_run_1 = (SubLObject)kbq_query_run.NIL;
        SubLObject filtered_query_set_run_2 = (SubLObject)kbq_query_run.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list420);
        filtered_query_set_run_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list420);
        filtered_query_set_run_2 = current.first();
        current = current.rest();
        if (kbq_query_run.NIL == current) {
            return Values.values(filtered_query_set_run_1, filtered_query_set_run_2);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbq_query_run.$list420);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 132969L)
    public static SubLObject kct_common_tests_test_set_runs(final SubLObject test_set_runs) {
        SubLObject filtered_test_set_runs = (SubLObject)kbq_query_run.NIL;
        final SubLObject common_tests = kct_tests_common_to_all_test_set_runs(test_set_runs);
        SubLObject cdolist_list_var = test_set_runs;
        SubLObject test_set_run = (SubLObject)kbq_query_run.NIL;
        test_set_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject filtered_test_set_run = kct_filter_test_set_run_to_tests(test_set_run, common_tests, (SubLObject)kbq_query_run.UNPROVIDED);
            filtered_test_set_runs = (SubLObject)ConsesLow.cons(filtered_test_set_run, filtered_test_set_runs);
            cdolist_list_var = cdolist_list_var.rest();
            test_set_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_test_set_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 133531L)
    public static SubLObject kct_mutually_succeeding_test_set_runs(final SubLObject test_set_run_1, final SubLObject test_set_run_2) {
        final SubLObject succeeding_test_set_run_1 = kct_succeeding_test_set_run(test_set_run_1);
        final SubLObject succeeding_test_set_run_2 = kct_succeeding_test_set_run(test_set_run_2);
        final SubLObject succeeding_tests_1 = kct_test_set_run_valid_tests(succeeding_test_set_run_1);
        final SubLObject succeeding_tests_2 = kct_test_set_run_valid_tests(succeeding_test_set_run_2);
        final SubLObject mutually_succeeding_tests = keyhash_utilities.fast_intersection(succeeding_tests_1, succeeding_tests_2, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject filtered_test_set_run_1 = kct_filter_test_set_run_to_tests(succeeding_test_set_run_1, mutually_succeeding_tests, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject filtered_test_set_run_2 = kct_filter_test_set_run_to_tests(succeeding_test_set_run_2, mutually_succeeding_tests, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject set_difference_1 = kct_filter_test_set_run_to_tests(succeeding_test_set_run_1, mutually_succeeding_tests, (SubLObject)kbq_query_run.T);
        final SubLObject set_difference_2 = kct_filter_test_set_run_to_tests(succeeding_test_set_run_2, mutually_succeeding_tests, (SubLObject)kbq_query_run.T);
        return Values.values(filtered_test_set_run_1, filtered_test_set_run_2, set_difference_1, set_difference_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 134784L)
    public static SubLObject kct_mutually_failing_test_set_runs(final SubLObject test_set_run_1, final SubLObject test_set_run_2) {
        final SubLObject failing_test_set_run_1 = kct_failing_test_set_run(test_set_run_1);
        final SubLObject failing_test_set_run_2 = kct_failing_test_set_run(test_set_run_2);
        final SubLObject failing_tests_1 = kct_test_set_run_tests(failing_test_set_run_1);
        final SubLObject failing_tests_2 = kct_test_set_run_tests(failing_test_set_run_2);
        final SubLObject mutually_failing_tests = keyhash_utilities.fast_intersection(failing_tests_1, failing_tests_2, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject filtered_test_set_run_1 = kct_filter_test_set_run_to_tests(failing_test_set_run_1, mutually_failing_tests, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject filtered_test_set_run_2 = kct_filter_test_set_run_to_tests(failing_test_set_run_2, mutually_failing_tests, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject set_difference_1 = kct_filter_test_set_run_to_tests(failing_test_set_run_1, mutually_failing_tests, (SubLObject)kbq_query_run.T);
        final SubLObject set_difference_2 = kct_filter_test_set_run_to_tests(failing_test_set_run_2, mutually_failing_tests, (SubLObject)kbq_query_run.T);
        return Values.values(filtered_test_set_run_1, filtered_test_set_run_2, set_difference_1, set_difference_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 135965L)
    public static SubLObject kbq_same_answer_count_query_set_runs(final SubLObject query_set_run_1, final SubLObject query_set_run_2) {
        final SubLObject queries = kbq_same_property_value_queries(query_set_run_1, query_set_run_2, (SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        return kbq_filter_to_queries_int(query_set_run_1, query_set_run_2, queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 136473L)
    public static SubLObject kbq_different_answer_count_query_set_runs(final SubLObject query_set_run_1, final SubLObject query_set_run_2) {
        final SubLObject queries = kbq_same_property_value_queries(query_set_run_1, query_set_run_2, (SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, Symbols.symbol_function((SubLObject)kbq_query_run.$sym421$NOT_EQL), (SubLObject)kbq_query_run.UNPROVIDED);
        return kbq_filter_to_queries_int(query_set_run_1, query_set_run_2, queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 137000L)
    public static SubLObject kbq_filter_to_queries_int(final SubLObject query_set_run_1, final SubLObject query_set_run_2, final SubLObject queries) {
        final SubLObject filtered_query_set_run_1 = kbq_filter_query_set_run_to_queries(query_set_run_1, queries, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject filtered_query_set_run_2 = kbq_filter_query_set_run_to_queries(query_set_run_2, queries, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject set_difference_1 = kbq_filter_query_set_run_to_queries(query_set_run_1, queries, (SubLObject)kbq_query_run.T);
        final SubLObject set_difference_2 = kbq_filter_query_set_run_to_queries(query_set_run_2, queries, (SubLObject)kbq_query_run.T);
        return Values.values(filtered_query_set_run_1, filtered_query_set_run_2, set_difference_1, set_difference_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 137619L)
    public static SubLObject kbq_filter_query_set_run_to_queries_lambda(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(query, kbq_query_run.$kbq_filter_query_set_run_to_queries$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 137753L)
    public static SubLObject kbq_filter_query_set_run_to_queries_not_lambda(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(kbq_query_run.NIL == set.set_memberP(query, kbq_query_run.$kbq_filter_query_set_run_to_queries$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 137898L)
    public static SubLObject kbq_filter_query_set_run_to_queries(final SubLObject query_set_run, final SubLObject queries, SubLObject complementP) {
        if (complementP == kbq_query_run.UNPROVIDED) {
            complementP = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_comment = (SubLObject)kbq_query_run.$str422$filtered_to_queries;
        SubLObject v_answer = (SubLObject)kbq_query_run.NIL;
        final SubLObject _prev_bind_0 = kbq_query_run.$kbq_filter_query_set_run_to_queries$.currentBinding(thread);
        try {
            kbq_query_run.$kbq_filter_query_set_run_to_queries$.bind(set_utilities.construct_set_from_list(queries, Symbols.symbol_function((SubLObject)kbq_query_run.EQUAL), (SubLObject)kbq_query_run.UNPROVIDED), thread);
            v_answer = kbq_filter_query_set_run_by_test(query_set_run, new_comment, (SubLObject)((kbq_query_run.NIL != complementP) ? kbq_query_run.$sym423$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_NOT_LAMBDA : kbq_query_run.$sym424$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_LAMBDA), (SubLObject)kbq_query_run.$sym89$KBQ_QUERY_RUN_QUERY);
        }
        finally {
            kbq_query_run.$kbq_filter_query_set_run_to_queries$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 138581L)
    public static SubLObject kct_filter_test_set_run_to_tests_lambda(final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(test, kbq_query_run.$kct_filter_test_set_run_to_tests$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 138707L)
    public static SubLObject kct_filter_test_set_run_to_tests_not_lambda(final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(kbq_query_run.NIL == set.set_memberP(test, kbq_query_run.$kct_filter_test_set_run_to_tests$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 138844L)
    public static SubLObject kct_filter_test_set_run_to_tests(final SubLObject test_set_run, final SubLObject tests, SubLObject complementP) {
        if (complementP == kbq_query_run.UNPROVIDED) {
            complementP = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_comment = (SubLObject)kbq_query_run.$str425$filtered_to_tests;
        SubLObject v_answer = (SubLObject)kbq_query_run.NIL;
        final SubLObject _prev_bind_0 = kbq_query_run.$kct_filter_test_set_run_to_tests$.currentBinding(thread);
        try {
            kbq_query_run.$kct_filter_test_set_run_to_tests$.bind(set_utilities.construct_set_from_list(tests, Symbols.symbol_function((SubLObject)kbq_query_run.EQUAL), (SubLObject)kbq_query_run.UNPROVIDED), thread);
            v_answer = kct_filter_test_set_run_by_test(test_set_run, new_comment, (SubLObject)((kbq_query_run.NIL != complementP) ? kbq_query_run.$sym426$KCT_FILTER_TEST_SET_RUN_TO_TESTS_NOT_LAMBDA : kbq_query_run.$sym427$KCT_FILTER_TEST_SET_RUN_TO_TESTS_LAMBDA), (SubLObject)kbq_query_run.$sym110$KCT_TEST_RUN_TEST);
        }
        finally {
            kbq_query_run.$kct_filter_test_set_run_to_tests$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 139439L)
    public static SubLObject kbq_filter_query_set_run_to_query_collection(final SubLObject query_set_run, final SubLObject collection, SubLObject complementP) {
        if (complementP == kbq_query_run.UNPROVIDED) {
            complementP = (SubLObject)kbq_query_run.NIL;
        }
        final SubLObject queries = kbq_query_set_run_queries(query_set_run);
        final SubLObject filtered_queries = cached_all_instances_among(collection, queries, kct_variables.kct_mt());
        return kbq_filter_query_set_run_to_queries(query_set_run, filtered_queries, complementP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 139782L)
    public static SubLObject kct_filter_test_set_run_to_test_collection(final SubLObject test_set_run, final SubLObject collection, SubLObject complementP) {
        if (complementP == kbq_query_run.UNPROVIDED) {
            complementP = (SubLObject)kbq_query_run.NIL;
        }
        final SubLObject tests = kct_test_set_run_tests(test_set_run);
        final SubLObject filtered_tests = cached_all_instances_among(collection, tests, kct_variables.kct_mt());
        return kct_filter_test_set_run_to_tests(test_set_run, filtered_tests, complementP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140106L)
    public static SubLObject clear_cached_all_instances_among() {
        final SubLObject cs = kbq_query_run.$cached_all_instances_among_caching_state$.getGlobalValue();
        if (kbq_query_run.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140106L)
    public static SubLObject remove_cached_all_instances_among(final SubLObject col, final SubLObject terms, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(kbq_query_run.$cached_all_instances_among_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(col, terms, mt), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140106L)
    public static SubLObject cached_all_instances_among_internal(final SubLObject col, final SubLObject terms, final SubLObject mt) {
        return isa.all_instances_among(col, terms, mt, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140106L)
    public static SubLObject cached_all_instances_among(final SubLObject col, final SubLObject terms, final SubLObject mt) {
        SubLObject caching_state = kbq_query_run.$cached_all_instances_among_caching_state$.getGlobalValue();
        if (kbq_query_run.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kbq_query_run.$sym428$CACHED_ALL_INSTANCES_AMONG, (SubLObject)kbq_query_run.$sym429$_CACHED_ALL_INSTANCES_AMONG_CACHING_STATE_, (SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.EQUAL, (SubLObject)kbq_query_run.THREE_INTEGER, (SubLObject)kbq_query_run.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)kbq_query_run.$sym430$CLEAR_CACHED_ALL_INSTANCES_AMONG);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(col, terms, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)kbq_query_run.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)kbq_query_run.NIL;
            collision = cdolist_list_var.first();
            while (kbq_query_run.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (col.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (terms.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (kbq_query_run.NIL != cached_args && kbq_query_run.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_all_instances_among_internal(col, terms, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(col, terms, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140261L)
    public static SubLObject kbq_queries_common_to_all_query_set_runs(final SubLObject query_set_runs) {
        if (kbq_query_run.NIL != list_utilities.singletonP(query_set_runs)) {
            return kbq_query_set_run_valid_queries(query_set_runs.first());
        }
        SubLObject first_query_set_run = (SubLObject)kbq_query_run.NIL;
        SubLObject rest_query_set_runs = (SubLObject)kbq_query_run.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(query_set_runs, query_set_runs, (SubLObject)kbq_query_run.$list431);
        first_query_set_run = query_set_runs.first();
        final SubLObject current = rest_query_set_runs = query_set_runs.rest();
        final SubLObject intersection_set = set_utilities.construct_set_from_list(kbq_query_set_run_valid_queries(first_query_set_run), Symbols.symbol_function((SubLObject)kbq_query_run.EQ), (SubLObject)kbq_query_run.UNPROVIDED);
        SubLObject cdolist_list_var = rest_query_set_runs;
        SubLObject rest_query_set_run = (SubLObject)kbq_query_run.NIL;
        rest_query_set_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject candidate_set = set_utilities.construct_set_from_list(kbq_query_set_run_valid_queries(rest_query_set_run), Symbols.symbol_function((SubLObject)kbq_query_run.EQ), (SubLObject)kbq_query_run.UNPROVIDED);
            SubLObject missing = (SubLObject)kbq_query_run.NIL;
            final SubLObject set_contents_var = set.do_set_internal(intersection_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbq_query_run.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbq_query_run.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (kbq_query_run.NIL != set_contents.do_set_contents_element_validP(state, item) && kbq_query_run.NIL == set.set_memberP(item, candidate_set)) {
                    missing = (SubLObject)ConsesLow.cons(item, missing);
                }
            }
            SubLObject cdolist_list_var_$64 = missing;
            SubLObject item2 = (SubLObject)kbq_query_run.NIL;
            item2 = cdolist_list_var_$64.first();
            while (kbq_query_run.NIL != cdolist_list_var_$64) {
                set.set_remove(item2, intersection_set);
                cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                item2 = cdolist_list_var_$64.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rest_query_set_run = cdolist_list_var.first();
        }
        return set.set_element_list(intersection_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 141067L)
    public static SubLObject kct_tests_common_to_all_test_set_runs(final SubLObject test_set_runs) {
        if (kbq_query_run.NIL != list_utilities.singletonP(test_set_runs)) {
            return kct_test_set_run_valid_tests(test_set_runs.first());
        }
        SubLObject first_test_set_run = (SubLObject)kbq_query_run.NIL;
        SubLObject rest_test_set_runs = (SubLObject)kbq_query_run.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(test_set_runs, test_set_runs, (SubLObject)kbq_query_run.$list432);
        first_test_set_run = test_set_runs.first();
        final SubLObject current = rest_test_set_runs = test_set_runs.rest();
        final SubLObject intersection_set = set_utilities.construct_set_from_list(kct_test_set_run_valid_tests(first_test_set_run), Symbols.symbol_function((SubLObject)kbq_query_run.EQ), (SubLObject)kbq_query_run.UNPROVIDED);
        SubLObject cdolist_list_var = rest_test_set_runs;
        SubLObject rest_test_set_run = (SubLObject)kbq_query_run.NIL;
        rest_test_set_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject candidate_set = set_utilities.construct_set_from_list(kct_test_set_run_valid_tests(rest_test_set_run), Symbols.symbol_function((SubLObject)kbq_query_run.EQ), (SubLObject)kbq_query_run.UNPROVIDED);
            SubLObject missing = (SubLObject)kbq_query_run.NIL;
            final SubLObject set_contents_var = set.do_set_internal(intersection_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbq_query_run.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbq_query_run.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (kbq_query_run.NIL != set_contents.do_set_contents_element_validP(state, item) && kbq_query_run.NIL == set.set_memberP(item, candidate_set)) {
                    missing = (SubLObject)ConsesLow.cons(item, missing);
                }
            }
            SubLObject cdolist_list_var_$65 = missing;
            SubLObject item2 = (SubLObject)kbq_query_run.NIL;
            item2 = cdolist_list_var_$65.first();
            while (kbq_query_run.NIL != cdolist_list_var_$65) {
                set.set_remove(item2, intersection_set);
                cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                item2 = cdolist_list_var_$65.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rest_test_set_run = cdolist_list_var.first();
        }
        return set.set_element_list(intersection_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 141851L)
    public static SubLObject kct_consistently_succeeding_tests(final SubLObject test_set_runs) {
        final SubLObject succeeding_test_set_runs = Mapping.mapcar((SubLObject)kbq_query_run.$sym433$KCT_SUCCEEDING_TEST_SET_RUN, test_set_runs);
        return kct_tests_common_to_all_test_set_runs(succeeding_test_set_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 142083L)
    public static SubLObject kct_consistently_succeeding_test_set_runs(final SubLObject test_set_runs) {
        SubLObject consistently_succeeding_test_set_runs = (SubLObject)kbq_query_run.NIL;
        final SubLObject succeeding_test_set_runs = Mapping.mapcar((SubLObject)kbq_query_run.$sym433$KCT_SUCCEEDING_TEST_SET_RUN, test_set_runs);
        final SubLObject consistently_succeeding_tests = kct_tests_common_to_all_test_set_runs(succeeding_test_set_runs);
        SubLObject cdolist_list_var = succeeding_test_set_runs;
        SubLObject test_set_run = (SubLObject)kbq_query_run.NIL;
        test_set_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject consistently_succeeding_test_set_run = kct_filter_test_set_run_to_tests(test_set_run, consistently_succeeding_tests, (SubLObject)kbq_query_run.UNPROVIDED);
            consistently_succeeding_test_set_runs = (SubLObject)ConsesLow.cons(consistently_succeeding_test_set_run, consistently_succeeding_test_set_runs);
            cdolist_list_var = cdolist_list_var.rest();
            test_set_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(consistently_succeeding_test_set_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 142733L)
    public static SubLObject queries_that_became_unanswerable(final SubLObject query_set_run_1, final SubLObject query_set_run_2) {
        final SubLObject answerable_queries_1 = kbq_query_set_run_queries(kbq_answerable_query_set_run(query_set_run_1));
        final SubLObject unanswerable_queries_2 = kbq_query_set_run_queries(kbq_unanswerable_query_set_run(query_set_run_2));
        final SubLObject queries_that_became_unanswerable = keyhash_utilities.fast_intersection(answerable_queries_1, unanswerable_queries_2, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        return queries_that_became_unanswerable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 143266L)
    public static SubLObject queries_that_changed_answer_count(final SubLObject query_set_run_1, final SubLObject query_set_run_2) {
        return kbq_query_set_run_queries(kbq_different_answer_count_query_set_runs(query_set_run_1, query_set_run_2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 143555L)
    public static SubLObject kbq_query_runs_with_worst_slowdown(final SubLObject query_set_run_1, final SubLObject query_set_run_2, SubLObject n, SubLObject metric) {
        if (n == kbq_query_run.UNPROVIDED) {
            n = (SubLObject)kbq_query_run.TEN_INTEGER;
        }
        if (metric == kbq_query_run.UNPROVIDED) {
            metric = (SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME;
        }
        SubLObject list = (SubLObject)kbq_query_run.NIL;
        SubLObject query_run_1 = (SubLObject)kbq_query_run.NIL;
        SubLObject query_run_1_$66 = (SubLObject)kbq_query_run.NIL;
        SubLObject query_run_2 = (SubLObject)kbq_query_run.NIL;
        SubLObject query_run_2_$67 = (SubLObject)kbq_query_run.NIL;
        query_run_1 = kbq_query_set_run_query_runs(query_set_run_1);
        query_run_1_$66 = query_run_1.first();
        query_run_2 = kbq_query_set_run_query_runs(query_set_run_2);
        query_run_2_$67 = query_run_2.first();
        while (kbq_query_run.NIL != query_run_2 || kbq_query_run.NIL != query_run_1) {
            if (!kbq_query_run_query(query_run_1_$66).equal(kbq_query_run_query(query_run_2_$67))) {
                return kbq_query_runs_with_worst_slowdown_robust(query_set_run_1, query_set_run_2, n, metric);
            }
            final SubLObject metric_1 = kbq_query_run_property_value(query_run_1_$66, metric, (SubLObject)kbq_query_run.UNPROVIDED);
            final SubLObject metric_2 = kbq_query_run_property_value(query_run_2_$67, metric, (SubLObject)kbq_query_run.UNPROVIDED);
            if (kbq_query_run.NIL != number_utilities.positive_number_p(metric_1) && kbq_query_run.NIL != number_utilities.positive_number_p(metric_2)) {
                final SubLObject slowdown = Numbers.subtract(metric_2, metric_1);
                list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query_run_2_$67, metric_2, metric_1, slowdown), list);
            }
            query_run_1 = query_run_1.rest();
            query_run_1_$66 = query_run_1.first();
            query_run_2 = query_run_2.rest();
            query_run_2_$67 = query_run_2.first();
        }
        return list_utilities.first_n(n, Sort.sort(list, Symbols.symbol_function((SubLObject)kbq_query_run.$sym434$_), Symbols.symbol_function((SubLObject)kbq_query_run.$sym435$FOURTH)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 144749L)
    public static SubLObject kbq_query_runs_with_worst_slowdown_robust(final SubLObject query_set_run_1, final SubLObject query_set_run_2, SubLObject n, SubLObject metric) {
        if (n == kbq_query_run.UNPROVIDED) {
            n = (SubLObject)kbq_query_run.TEN_INTEGER;
        }
        if (metric == kbq_query_run.UNPROVIDED) {
            metric = (SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME;
        }
        SubLObject list = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run_1);
        SubLObject query_run_1 = (SubLObject)kbq_query_run.NIL;
        query_run_1 = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query_run_2 = kbq_lookup_query_run(query_set_run_2, kbq_query_run_query(query_run_1));
            final SubLObject metric_1 = kbq_query_run_property_value(query_run_1, metric, (SubLObject)kbq_query_run.UNPROVIDED);
            final SubLObject metric_2 = kbq_query_run_property_value(query_run_2, metric, (SubLObject)kbq_query_run.UNPROVIDED);
            if (kbq_query_run.NIL != number_utilities.positive_number_p(metric_1) && kbq_query_run.NIL != number_utilities.positive_number_p(metric_2)) {
                final SubLObject slowdown = Numbers.subtract(metric_2, metric_1);
                list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query_run_2, metric_2, metric_1, slowdown), list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run_1 = cdolist_list_var.first();
        }
        return list_utilities.first_n(n, Sort.sort(list, Symbols.symbol_function((SubLObject)kbq_query_run.$sym434$_), Symbols.symbol_function((SubLObject)kbq_query_run.$sym435$FOURTH)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 145554L)
    public static SubLObject kbq_slowest_query_runs(final SubLObject query_set_run, SubLObject n, SubLObject metric) {
        if (n == kbq_query_run.UNPROVIDED) {
            n = (SubLObject)kbq_query_run.TEN_INTEGER;
        }
        if (metric == kbq_query_run.UNPROVIDED) {
            metric = (SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME;
        }
        SubLObject list = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject value = kbq_query_run_property_value(query_run, metric, (SubLObject)kbq_query_run.UNPROVIDED);
            if (value.isNumber()) {
                list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query_run, value), list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)kbq_query_run.$sym68$FIRST), list_utilities.first_n(n, Sort.sort(list, Symbols.symbol_function((SubLObject)kbq_query_run.$sym434$_), Symbols.symbol_function((SubLObject)kbq_query_run.$sym436$SECOND))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 145946L)
    public static SubLObject kct_slowest_test_runs(final SubLObject test_set_run, SubLObject n, SubLObject metric) {
        if (n == kbq_query_run.UNPROVIDED) {
            n = (SubLObject)kbq_query_run.TEN_INTEGER;
        }
        if (metric == kbq_query_run.UNPROVIDED) {
            metric = (SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME;
        }
        SubLObject list = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = kct_test_set_run_test_runs(test_set_run);
        SubLObject test_run = (SubLObject)kbq_query_run.NIL;
        test_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query_run = kct_test_run_query_run(test_run);
            final SubLObject value = kbq_query_run_property_value(query_run, metric, (SubLObject)kbq_query_run.UNPROVIDED);
            if (value.isNumber()) {
                list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(test_run, value), list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)kbq_query_run.$sym68$FIRST), list_utilities.first_n(n, Sort.sort(list, Symbols.symbol_function((SubLObject)kbq_query_run.$sym434$_), Symbols.symbol_function((SubLObject)kbq_query_run.$sym436$SECOND))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 146387L)
    public static SubLObject kbq_compare_query_set_run_answers(final SubLObject query_set_run_1, final SubLObject query_set_run_2) {
        SubLObject differences = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run_1);
        SubLObject query_run_1 = (SubLObject)kbq_query_run.NIL;
        query_run_1 = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query = kbq_query_run_query(query_run_1);
            final SubLObject query_run_2 = kbq_lookup_query_run(query_set_run_2, query);
            final SubLObject difference = kbq_compare_query_run_answers(query_run_1, query_run_2);
            if (kbq_query_run.NIL != difference) {
                differences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)kbq_query_run.$kw16$QUERY, query, difference), differences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run_1 = cdolist_list_var.first();
        }
        differences = Sequences.nreverse(differences);
        return differences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 147099L)
    public static SubLObject kbq_summarize_compare_query_set_run_answers(final SubLObject query_set_run_1, final SubLObject query_set_run_2) {
        SubLObject answerable_2 = (SubLObject)kbq_query_run.NIL;
        SubLObject more_answers_2 = (SubLObject)kbq_query_run.NIL;
        SubLObject different_answers = (SubLObject)kbq_query_run.NIL;
        SubLObject more_answers_3 = (SubLObject)kbq_query_run.NIL;
        SubLObject answerable_3 = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = kbq_compare_query_set_run_answers(query_set_run_1, query_set_run_2);
        SubLObject difference = (SubLObject)kbq_query_run.NIL;
        difference = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject current;
            final SubLObject datum = current = difference;
            SubLObject allow_other_keys_p = (SubLObject)kbq_query_run.NIL;
            SubLObject rest = current;
            SubLObject bad = (SubLObject)kbq_query_run.NIL;
            SubLObject current_$68 = (SubLObject)kbq_query_run.NIL;
            while (kbq_query_run.NIL != rest) {
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbq_query_run.$list437);
                current_$68 = rest.first();
                rest = rest.rest();
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbq_query_run.$list437);
                if (kbq_query_run.NIL == conses_high.member(current_$68, (SubLObject)kbq_query_run.$list438, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                    bad = (SubLObject)kbq_query_run.T;
                }
                if (current_$68 == kbq_query_run.$kw82$ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if (kbq_query_run.NIL != bad && kbq_query_run.NIL == allow_other_keys_p) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbq_query_run.$list437);
            }
            final SubLObject query_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw16$QUERY, current);
            final SubLObject query = (SubLObject)((kbq_query_run.NIL != query_tail) ? conses_high.cadr(query_tail) : kbq_query_run.NIL);
            final SubLObject missing_from_1_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw439$MISSING_FROM_1, current);
            final SubLObject missing_from_1 = (SubLObject)((kbq_query_run.NIL != missing_from_1_tail) ? conses_high.cadr(missing_from_1_tail) : kbq_query_run.NIL);
            final SubLObject missing_from_2_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw440$MISSING_FROM_2, current);
            final SubLObject missing_from_2 = (SubLObject)((kbq_query_run.NIL != missing_from_2_tail) ? conses_high.cadr(missing_from_2_tail) : kbq_query_run.NIL);
            final SubLObject v_1_count = Sequences.length(missing_from_2);
            final SubLObject v_2_count = Sequences.length(missing_from_1);
            if (v_1_count.numE(v_2_count)) {
                different_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query, v_1_count), different_answers);
            }
            else if (v_2_count.isZero()) {
                answerable_3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query, v_1_count), answerable_3);
            }
            else if (v_1_count.isZero()) {
                answerable_2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query, v_2_count), answerable_2);
            }
            else if (v_1_count.numG(v_2_count)) {
                more_answers_3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query, Numbers.subtract(v_1_count, v_2_count)), more_answers_3);
            }
            else if (v_1_count.numL(v_2_count)) {
                more_answers_2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query, Numbers.subtract(v_2_count, v_1_count)), more_answers_2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            difference = cdolist_list_var.first();
        }
        return ConsesLow.nconc(new SubLObject[] { (kbq_query_run.NIL != answerable_2) ? ConsesLow.list((SubLObject)kbq_query_run.$kw441$ANSWERABLE_2, Sort.sort(answerable_2, Symbols.symbol_function((SubLObject)kbq_query_run.$sym434$_), Symbols.symbol_function((SubLObject)kbq_query_run.$sym436$SECOND))) : kbq_query_run.NIL, (kbq_query_run.NIL != more_answers_2) ? ConsesLow.list((SubLObject)kbq_query_run.$kw442$MORE_ANSWERS_2, Sort.sort(more_answers_2, Symbols.symbol_function((SubLObject)kbq_query_run.$sym434$_), Symbols.symbol_function((SubLObject)kbq_query_run.$sym436$SECOND))) : kbq_query_run.NIL, (kbq_query_run.NIL != different_answers) ? ConsesLow.list((SubLObject)kbq_query_run.$kw443$DIFFERENT_ANSWERS, Sort.sort(different_answers, Symbols.symbol_function((SubLObject)kbq_query_run.$sym434$_), Symbols.symbol_function((SubLObject)kbq_query_run.$sym436$SECOND))) : kbq_query_run.NIL, (kbq_query_run.NIL != more_answers_3) ? ConsesLow.list((SubLObject)kbq_query_run.$kw444$MORE_ANSWERS_1, Sort.sort(more_answers_3, Symbols.symbol_function((SubLObject)kbq_query_run.$sym434$_), Symbols.symbol_function((SubLObject)kbq_query_run.$sym436$SECOND))) : kbq_query_run.NIL, (kbq_query_run.NIL != answerable_3) ? ConsesLow.list((SubLObject)kbq_query_run.$kw445$ANSWERABLE_1, Sort.sort(answerable_3, Symbols.symbol_function((SubLObject)kbq_query_run.$sym434$_), Symbols.symbol_function((SubLObject)kbq_query_run.$sym436$SECOND))) : kbq_query_run.NIL });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 148488L)
    public static SubLObject kbq_sort_query_runs(final SubLObject query_set_run, final SubLObject metric) {
        return Sort.sort(conses_high.copy_list(kbq_query_set_run_query_runs(query_set_run)), (SubLObject)kbq_query_run.$sym87$SAFE__, kbq_function_for_metric(metric));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 148684L)
    public static SubLObject kbq_lookup_query_run(final SubLObject query_set_run, final SubLObject query) {
        SubLObject cdolist_list_var;
        final SubLObject query_runs = cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            if (kbq_query_run.NIL != kbq_query_equal(query, kbq_query_run_query(query_run))) {
                return query_run;
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 148940L)
    public static SubLObject kbq_lookup_query_run_from_query_runs(final SubLObject query_runs, final SubLObject query) {
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            if (kbq_query_run.NIL != kbq_query_equal(query, kbq_query_run_query(query_run))) {
                return query_run;
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 149141L)
    public static SubLObject kbq_lookup_query_runs(final SubLObject query_set_runs, final SubLObject query) {
        SubLObject query_runs = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = query_set_runs;
        SubLObject query_set_run = (SubLObject)kbq_query_run.NIL;
        query_set_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query_run = kbq_lookup_query_run(query_set_run, query);
            query_runs = (SubLObject)ConsesLow.cons(query_run, query_runs);
            cdolist_list_var = cdolist_list_var.rest();
            query_set_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(query_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 149410L)
    public static SubLObject kbq_query_equal(final SubLObject query_1, final SubLObject query_2) {
        return Equality.equalp(query_1, query_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 149590L)
    public static SubLObject kbq_compare_query_run_answers(final SubLObject query_run_1, final SubLObject query_run_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_1 = kbq_query_run_query(query_run_1);
        final SubLObject query_2 = kbq_query_run_query(query_run_2);
        if (kbq_query_run.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kbq_query_run.NIL == kbq_query_equal(query_1, query_2)) {
            Errors.error((SubLObject)kbq_query_run.$str446$_S_and__S_are_different_queries, query_1, query_2);
        }
        final SubLObject result_1 = kbq_query_run_result(query_run_1);
        final SubLObject result_2 = kbq_query_run_result(query_run_2);
        if (kbq_query_run.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kbq_query_run.$kw17$MISSING == result_1) {
            Errors.error((SubLObject)kbq_query_run.$str447$_S_has_no_result, query_1);
        }
        if (kbq_query_run.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kbq_query_run.$kw17$MISSING == result_2) {
            Errors.error((SubLObject)kbq_query_run.$str447$_S_has_no_result, query_2);
        }
        thread.resetMultipleValues();
        final SubLObject missing_from_2 = bindings.compare_lists_of_binding_lists(result_1, result_2);
        final SubLObject missing_from_3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (kbq_query_run.NIL == missing_from_3 && kbq_query_run.NIL == missing_from_2) {
            return (SubLObject)kbq_query_run.NIL;
        }
        if (kbq_query_run.NIL == missing_from_3) {
            return (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw440$MISSING_FROM_2, missing_from_2);
        }
        if (kbq_query_run.NIL == missing_from_2) {
            return (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw439$MISSING_FROM_1, missing_from_3);
        }
        return (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw439$MISSING_FROM_1, missing_from_3, (SubLObject)kbq_query_run.$kw440$MISSING_FROM_2, missing_from_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 150671L)
    public static SubLObject kbq_compare_query_set_runs_by_property(final SubLObject query_set_run_1, final SubLObject query_set_run_2, final SubLObject property, SubLObject test) {
        if (test == kbq_query_run.UNPROVIDED) {
            test = (SubLObject)kbq_query_run.$sym87$SAFE__;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kbq_query_run.NIL;
        SubLObject count_1 = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject count_2 = (SubLObject)kbq_query_run.ZERO_INTEGER;
        final SubLObject queries_1 = kbq_extract_property_values(query_set_run_1, (SubLObject)kbq_query_run.$kw16$QUERY, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject queries_2 = kbq_extract_property_values(query_set_run_1, (SubLObject)kbq_query_run.$kw16$QUERY, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject values_1 = kbq_extract_property_values(query_set_run_1, property, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject values_2 = kbq_extract_property_values(query_set_run_2, property, (SubLObject)kbq_query_run.UNPROVIDED);
        SubLObject i = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject query_1 = (SubLObject)kbq_query_run.NIL;
        SubLObject query_1_$69 = (SubLObject)kbq_query_run.NIL;
        SubLObject query_2 = (SubLObject)kbq_query_run.NIL;
        SubLObject query_2_$70 = (SubLObject)kbq_query_run.NIL;
        SubLObject value_1 = (SubLObject)kbq_query_run.NIL;
        SubLObject value_1_$71 = (SubLObject)kbq_query_run.NIL;
        SubLObject value_2 = (SubLObject)kbq_query_run.NIL;
        SubLObject value_2_$72 = (SubLObject)kbq_query_run.NIL;
        query_1 = queries_1;
        query_1_$69 = query_1.first();
        query_2 = queries_2;
        query_2_$70 = query_2.first();
        value_1 = values_1;
        value_1_$71 = value_1.first();
        value_2 = values_2;
        value_2_$72 = value_2.first();
        while (kbq_query_run.NIL != value_2 || kbq_query_run.NIL != value_1 || kbq_query_run.NIL != query_2 || kbq_query_run.NIL != query_1) {
            if (kbq_query_run.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !query_1_$69.eql(query_2_$70)) {
                Errors.error((SubLObject)kbq_query_run.$str448$query_set_runs_contained_differen);
            }
            if (kbq_query_run.NIL != Functions.funcall(test, value_1_$71, value_2_$72)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query_1_$69, value_1_$71, value_2_$72, (SubLObject)kbq_query_run.ONE_INTEGER), result);
                count_1 = Numbers.add(count_1, (SubLObject)kbq_query_run.ONE_INTEGER);
            }
            else {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query_1_$69, value_1_$71, value_2_$72, (SubLObject)kbq_query_run.TWO_INTEGER), result);
                count_2 = Numbers.add(count_2, (SubLObject)kbq_query_run.ONE_INTEGER);
            }
            i = Numbers.add(i, (SubLObject)kbq_query_run.ONE_INTEGER);
            query_1 = query_1.rest();
            query_1_$69 = query_1.first();
            query_2 = query_2.rest();
            query_2_$70 = query_2.first();
            value_1 = value_1.rest();
            value_1_$71 = value_1.first();
            value_2 = value_2.rest();
            value_2_$72 = value_2.first();
        }
        return Values.values(Sequences.nreverse(result), count_1, count_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 152204L)
    public static SubLObject show_query_runs_that_became_unanswerable(final SubLObject query_set_run_1, final SubLObject query_set_run_2, SubLObject key, SubLObject sort_pred, SubLObject extra_key) {
        if (key == kbq_query_run.UNPROVIDED) {
            key = (SubLObject)kbq_query_run.$sym101$KBQ_QUERY_RUN_TOTAL_TIME;
        }
        if (sort_pred == kbq_query_run.UNPROVIDED) {
            sort_pred = Symbols.symbol_function((SubLObject)kbq_query_run.$sym87$SAFE__);
        }
        if (extra_key == kbq_query_run.UNPROVIDED) {
            extra_key = (SubLObject)kbq_query_run.NIL;
        }
        final SubLObject queries = queries_that_became_unanswerable(query_set_run_1, query_set_run_2);
        return show_query_runs_int(query_set_run_1, query_set_run_2, queries, key, sort_pred, extra_key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 152553L)
    public static SubLObject show_query_runs_that_changed_answer_count(final SubLObject query_set_run_1, final SubLObject query_set_run_2, SubLObject key, SubLObject sort_pred, SubLObject extra_key) {
        if (key == kbq_query_run.UNPROVIDED) {
            key = (SubLObject)kbq_query_run.$sym107$KBQ_QUERY_RUN_ANSWER_COUNT;
        }
        if (sort_pred == kbq_query_run.UNPROVIDED) {
            sort_pred = Symbols.symbol_function((SubLObject)kbq_query_run.$sym87$SAFE__);
        }
        if (extra_key == kbq_query_run.UNPROVIDED) {
            extra_key = (SubLObject)kbq_query_run.NIL;
        }
        final SubLObject queries = queries_that_changed_answer_count(query_set_run_1, query_set_run_2);
        return show_query_runs_int(query_set_run_1, query_set_run_2, queries, key, sort_pred, extra_key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 152906L)
    public static SubLObject show_query_runs_int(final SubLObject query_set_run_1, final SubLObject query_set_run_2, final SubLObject queries, final SubLObject key, final SubLObject sort_pred, final SubLObject extra_key) {
        final SubLObject query_runs_1 = kbq_query_set_run_query_runs(kbq_filter_query_set_run_to_queries(query_set_run_1, queries, (SubLObject)kbq_query_run.UNPROVIDED));
        SubLObject cdolist_list_var;
        final SubLObject sorted_query_runs = cdolist_list_var = Sort.sort(query_runs_1, sort_pred, key);
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query = kbq_query_run_query(query_run);
            final SubLObject value = Functions.funcall(key, query_run);
            final SubLObject other_query_run = kbq_lookup_query_run(query_set_run_2, query);
            final SubLObject other_value = Functions.funcall(key, other_query_run);
            if (kbq_query_run.NIL != extra_key) {
                final SubLObject extra_value = Functions.funcall(extra_key, query_run);
                final SubLObject extra_other_value = Functions.funcall(extra_key, other_query_run);
                PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str449$_s__s__s__s__s__, new SubLObject[] { value, extra_value, other_value, extra_other_value, query });
            }
            else {
                PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str450$_s__s__s__, new SubLObject[] { value, other_value, query });
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return sorted_query_runs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 153866L)
    public static SubLObject kbq_query_set_run_answerable_counts(final SubLObject query_set_run_1, final SubLObject query_set_run_2) {
        final SubLObject answerable_1 = kbq_query_set_run_total_answerable(query_set_run_1);
        final SubLObject answerable_2 = kbq_query_set_run_total_answerable(query_set_run_2);
        final SubLObject mutually_answerable = Sequences.length(kbq_mutually_answerable_queries((SubLObject)ConsesLow.list(query_set_run_1, query_set_run_2)));
        final SubLObject only_answerable_in_1 = Numbers.subtract(answerable_1, mutually_answerable);
        final SubLObject only_answerable_in_2 = Numbers.subtract(answerable_2, mutually_answerable);
        return Values.values(only_answerable_in_1, mutually_answerable, only_answerable_in_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 154748L)
    public static SubLObject kct_compare_test_set_run_statuses(final SubLObject test_set_run_1, final SubLObject test_set_run_2) {
        if (kbq_query_run.NIL != janus.janus_experiment_p(test_set_run_1) && kbq_query_run.NIL != janus.janus_experiment_p(test_set_run_2)) {
            return janus.janus_compare_test_set_run_statuses(test_set_run_1, test_set_run_2);
        }
        SubLObject differences = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = kct_test_set_run_test_runs(test_set_run_1);
        SubLObject test_run_1 = (SubLObject)kbq_query_run.NIL;
        test_run_1 = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject test = kct_test_run_test(test_run_1);
            final SubLObject test_run_2 = kct_lookup_test_run(test_set_run_2, test);
            if (kbq_query_run.NIL != test_run_2) {
                final SubLObject difference = kct_compare_test_run_statuses(test_run_1, test_run_2);
                if (kbq_query_run.NIL != difference) {
                    differences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw69$TEST, test, (SubLObject)kbq_query_run.$kw451$CHANGE, difference), differences);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run_1 = cdolist_list_var.first();
        }
        differences = Sequences.nreverse(differences);
        return differences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 155657L)
    public static SubLObject kct_summarize_compare_test_set_run_statuses(final SubLObject test_set_run_1, final SubLObject test_set_run_2) {
        SubLObject became_success = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject became_failure = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject cdolist_list_var = kct_compare_test_set_run_statuses(test_set_run_1, test_set_run_2);
        SubLObject difference = (SubLObject)kbq_query_run.NIL;
        difference = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject current;
            final SubLObject datum = current = difference;
            final SubLObject change_tail = cdestructuring_bind.property_list_member((SubLObject)kbq_query_run.$kw451$CHANGE, current);
            final SubLObject pcase_var;
            final SubLObject change = pcase_var = (SubLObject)((kbq_query_run.NIL != change_tail) ? conses_high.cadr(change_tail) : kbq_query_run.NIL);
            if (pcase_var.eql((SubLObject)kbq_query_run.$kw452$BECAME_SUCCESS)) {
                became_success = Numbers.add(became_success, (SubLObject)kbq_query_run.ONE_INTEGER);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw453$BECAME_FAILURE)) {
                became_failure = Numbers.add(became_failure, (SubLObject)kbq_query_run.ONE_INTEGER);
            }
            else {
                Errors.error((SubLObject)kbq_query_run.$str454$unexpected_change__S, change);
            }
            cdolist_list_var = cdolist_list_var.rest();
            difference = cdolist_list_var.first();
        }
        return ConsesLow.nconc((SubLObject)((kbq_query_run.NIL != became_success) ? ConsesLow.list((SubLObject)kbq_query_run.$kw452$BECAME_SUCCESS, became_success) : kbq_query_run.NIL), (SubLObject)((kbq_query_run.NIL != became_failure) ? ConsesLow.list((SubLObject)kbq_query_run.$kw453$BECAME_FAILURE, became_failure) : kbq_query_run.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 156276L)
    public static SubLObject kct_lookup_test_run(final SubLObject test_set_run, final SubLObject test) {
        SubLObject cdolist_list_var;
        final SubLObject test_runs = cdolist_list_var = kct_test_set_run_test_runs(test_set_run);
        SubLObject test_run = (SubLObject)kbq_query_run.NIL;
        test_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            if (kbq_query_run.NIL != kct_test_equal(test, kct_test_run_test(test_run))) {
                return test_run;
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 156531L)
    public static SubLObject kct_test_equal(final SubLObject test_1, final SubLObject test_2) {
        return Equality.equalp(test_1, test_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 156706L)
    public static SubLObject kct_compare_test_run_statuses(final SubLObject test_run_1, final SubLObject test_run_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_1 = kct_test_run_test(test_run_1);
        final SubLObject test_2 = kct_test_run_test(test_run_2);
        if (kbq_query_run.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kbq_query_run.NIL == kct_test_equal(test_1, test_2)) {
            Errors.error((SubLObject)kbq_query_run.$str455$_S_and__S_are_different_tests, test_1, test_2);
        }
        final SubLObject status_1 = kct_test_run_status(test_run_1);
        final SubLObject status_2 = kct_test_run_status(test_run_2);
        if (kbq_query_run.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kbq_query_run.NIL == status_1) {
            Errors.error((SubLObject)kbq_query_run.$str456$_S_has_no_status, test_1);
        }
        if (kbq_query_run.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kbq_query_run.NIL == status_2) {
            Errors.error((SubLObject)kbq_query_run.$str456$_S_has_no_status, test_2);
        }
        if (status_1.eql(status_2)) {
            return (SubLObject)kbq_query_run.NIL;
        }
        if (kbq_query_run.$kw0$SUCCESS == status_1) {
            return (SubLObject)kbq_query_run.$kw453$BECAME_FAILURE;
        }
        return (SubLObject)kbq_query_run.$kw452$BECAME_SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 157491L)
    public static SubLObject kbq_analyze_query_set_runs(final SubLObject query_set_run_1, final SubLObject query_set_run_2, SubLObject metrics) {
        if (metrics == kbq_query_run.UNPROVIDED) {
            metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
        }
        final SubLObject analysis_1 = kbq_analyze_query_set_run(query_set_run_1, metrics);
        final SubLObject analysis_2 = kbq_analyze_query_set_run(query_set_run_2, metrics);
        return kbq_compare_analysis(analysis_1, analysis_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 157850L)
    public static SubLObject kct_analyze_test_set_runs(final SubLObject test_set_run_1, final SubLObject test_set_run_2, SubLObject metrics) {
        if (metrics == kbq_query_run.UNPROVIDED) {
            metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
        }
        final SubLObject analysis_1 = kct_analyze_test_set_run(test_set_run_1, metrics);
        final SubLObject analysis_2 = kct_analyze_test_set_run(test_set_run_2, metrics);
        return kbq_compare_analysis(analysis_1, analysis_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 158165L)
    public static SubLObject kbq_compare_analysis(final SubLObject analysis_1, final SubLObject analysis_2) {
        SubLObject analysis = (SubLObject)kbq_query_run.NIL;
        SubLObject remainder;
        SubLObject metric;
        SubLObject metric_value_2;
        SubLObject metric_value_3;
        SubLObject difference;
        SubLObject percentage;
        SubLObject metric_comparison_values;
        for (remainder = (SubLObject)kbq_query_run.NIL, remainder = analysis_2; kbq_query_run.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            metric = remainder.first();
            metric_value_2 = conses_high.cadr(remainder);
            metric_value_3 = conses_high.getf(analysis_1, metric, (SubLObject)kbq_query_run.$kw457$UNDEFINED);
            if (kbq_query_run.$kw457$UNDEFINED != metric_value_3) {
                difference = list_utilities.safe_difference(metric_value_2, metric_value_3);
                percentage = (SubLObject)((kbq_query_run.NIL == metric_value_3 || metric_value_3.isZero() || kbq_query_run.NIL == metric_value_2) ? kbq_query_run.$kw457$UNDEFINED : number_utilities.significant_digits(Numbers.multiply((SubLObject)kbq_query_run.$int62$100, Numbers.divide(difference, metric_value_3)), (SubLObject)kbq_query_run.FOUR_INTEGER));
                metric_comparison_values = (SubLObject)ConsesLow.list((SubLObject)((kbq_query_run.NIL != metric_value_3) ? significant_digits_if_float(metric_value_3, (SubLObject)kbq_query_run.FOUR_INTEGER) : kbq_query_run.NIL), (SubLObject)((kbq_query_run.NIL != metric_value_2) ? significant_digits_if_float(metric_value_2, (SubLObject)kbq_query_run.FOUR_INTEGER) : kbq_query_run.NIL), (SubLObject)((kbq_query_run.NIL != difference) ? significant_digits_if_float(difference, (SubLObject)kbq_query_run.FOUR_INTEGER) : kbq_query_run.NIL), percentage);
                if (kbq_query_run.NIL == list_utilities.member_eqP((SubLObject)kbq_query_run.$kw457$UNDEFINED, metric_comparison_values)) {
                    analysis = conses_high.putf(analysis, metric, metric_comparison_values);
                }
            }
        }
        return analysis;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 159426L)
    public static SubLObject significant_digits_if_float(final SubLObject number, final SubLObject significant_digits) {
        if (number.isInteger()) {
            return number;
        }
        return number_utilities.significant_digits(number, significant_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 161441L)
    public static SubLObject kbq_print_analysis(final SubLObject analysis) {
        if (kbq_query_run.NIL != analysis) {
            SubLObject new_plist = (SubLObject)kbq_query_run.NIL;
            SubLObject remainder;
            SubLObject statistic_name;
            SubLObject statistic_list;
            SubLObject baseline_value;
            SubLObject experiment_value;
            SubLObject statistic_type;
            SubLObject ratio;
            SubLObject list;
            for (remainder = (SubLObject)kbq_query_run.NIL, remainder = analysis; kbq_query_run.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                statistic_name = remainder.first();
                statistic_list = conses_high.cadr(remainder);
                baseline_value = statistic_list.first();
                experiment_value = conses_high.second(statistic_list);
                statistic_type = conses_high.getf(kbq_query_run.$kbq_summary_statistics$.getGlobalValue(), statistic_name, (SubLObject)kbq_query_run.UNPROVIDED);
                if (kbq_query_run.NIL != subl_promotions.memberP(statistic_type, (SubLObject)kbq_query_run.$list459, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                    ratio = (SubLObject)((kbq_query_run.$kw460$NEITHER == statistic_type) ? kbq_query_run.NIL : ((kbq_query_run.$kw461$INCREASE == statistic_type) ? ((kbq_query_run.NIL == baseline_value || baseline_value.isZero()) ? kbq_query_run.$kw457$UNDEFINED : number_utilities.significant_digits(Numbers.divide(experiment_value, baseline_value), (SubLObject)kbq_query_run.FOUR_INTEGER)) : ((kbq_query_run.NIL == experiment_value || experiment_value.isZero()) ? kbq_query_run.$kw457$UNDEFINED : number_utilities.significant_digits(Numbers.divide(baseline_value, experiment_value), (SubLObject)kbq_query_run.FOUR_INTEGER))));
                    list = (SubLObject)((kbq_query_run.$kw460$NEITHER == statistic_type) ? ConsesLow.list(baseline_value, experiment_value) : ConsesLow.list(baseline_value, experiment_value, ratio));
                    new_plist = conses_high.putf(new_plist, statistic_name, list);
                }
            }
            list_utilities.pretty_print_plist(new_plist, (SubLObject)kbq_query_run.UNPROVIDED);
            return new_plist;
        }
        PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str462$empty__);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 162670L)
    public static SubLObject kbq_analyze_query_set_run(final SubLObject query_set_run, SubLObject metrics) {
        if (metrics == kbq_query_run.UNPROVIDED) {
            metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
        }
        final SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        return kbq_analyze_query_runs(query_runs, metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 162901L)
    public static SubLObject kct_analyze_test_set_run(final SubLObject test_set_run, SubLObject metrics) {
        if (metrics == kbq_query_run.UNPROVIDED) {
            metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
        }
        final SubLObject test_runs = kct_test_set_run_test_runs(test_set_run);
        return kct_analyze_test_runs(test_runs, metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 163124L)
    public static SubLObject kbq_analyze_query_runs(final SubLObject query_runs, final SubLObject metrics) {
        SubLObject analysis = (SubLObject)kbq_query_run.NIL;
        final SubLObject total = Sequences.length(query_runs);
        final SubLObject partial_analysis = (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw463$TOTAL, total);
        analysis = list_utilities.merge_plist(analysis, partial_analysis);
        SubLObject cdolist_list_var = metrics;
        SubLObject metric = (SubLObject)kbq_query_run.NIL;
        metric = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject pcase_var = metric;
            if (pcase_var.eql((SubLObject)kbq_query_run.$kw18$ANSWER_COUNT)) {
                SubLObject all_answer_counts = (SubLObject)kbq_query_run.NIL;
                SubLObject cdolist_list_var_$73 = query_runs;
                SubLObject query_run = (SubLObject)kbq_query_run.NIL;
                query_run = cdolist_list_var_$73.first();
                while (kbq_query_run.NIL != cdolist_list_var_$73) {
                    final SubLObject var = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, (SubLObject)kbq_query_run.ZERO_INTEGER);
                    if (kbq_query_run.NIL != var) {
                        all_answer_counts = (SubLObject)ConsesLow.cons(var, all_answer_counts);
                    }
                    cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                    query_run = cdolist_list_var_$73.first();
                }
                final SubLObject total2 = Sequences.length(all_answer_counts);
                final SubLObject total_answerable = Sequences.count_if(Symbols.symbol_function((SubLObject)kbq_query_run.$sym410$POSITIVE_INTEGER_P), all_answer_counts, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
                final SubLObject total_unanswerable = Numbers.subtract(total2, total_answerable);
                final SubLObject total_error = kbq_count_erroring_query_runs(query_runs);
                final SubLObject total_lumpy = kbq_count_lumpy_query_runs(query_runs);
                final SubLObject sum_answer_count = number_utilities.summation(all_answer_counts);
                final SubLObject mean_answer_count = (SubLObject)((kbq_query_run.NIL != all_answer_counts) ? number_utilities.mean(all_answer_counts) : kbq_query_run.NIL);
                final SubLObject median_answer_count = (SubLObject)((kbq_query_run.NIL != all_answer_counts) ? number_utilities.median(all_answer_counts, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                final SubLObject partial_analysis2 = (SubLObject)ConsesLow.list(new SubLObject[] { kbq_query_run.$kw464$TOTAL_ANSWERABLE, total_answerable, kbq_query_run.$kw465$TOTAL_UNANSWERABLE, total_unanswerable, kbq_query_run.$kw466$TOTAL_ERROR, total_error, kbq_query_run.$kw467$TOTAL_LUMPY, total_lumpy, kbq_query_run.$kw468$SUM_ANSWER_COUNT, sum_answer_count, kbq_query_run.$kw469$MEAN_ANSWER_COUNT, mean_answer_count, kbq_query_run.$kw470$MEDIAN_ANSWER_COUNT, median_answer_count });
                analysis = list_utilities.merge_plist(analysis, partial_analysis2);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw19$HYPOTHESIZATION_TIME)) {
                SubLObject all_hypothesization_times = (SubLObject)kbq_query_run.NIL;
                SubLObject cdolist_list_var_$74 = query_runs;
                SubLObject query_run = (SubLObject)kbq_query_run.NIL;
                query_run = cdolist_list_var_$74.first();
                while (kbq_query_run.NIL != cdolist_list_var_$74) {
                    final SubLObject var = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw19$HYPOTHESIZATION_TIME, (SubLObject)kbq_query_run.ZERO_INTEGER);
                    if (kbq_query_run.NIL != var) {
                        all_hypothesization_times = (SubLObject)ConsesLow.cons(var, all_hypothesization_times);
                    }
                    cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                    query_run = cdolist_list_var_$74.first();
                }
                final SubLObject sum_hypothesization_time = number_utilities.summation(all_hypothesization_times);
                final SubLObject mean_hypothesization_time = (SubLObject)((kbq_query_run.NIL != all_hypothesization_times) ? number_utilities.mean(all_hypothesization_times) : kbq_query_run.NIL);
                final SubLObject median_hypothesization_time = (SubLObject)((kbq_query_run.NIL != all_hypothesization_times) ? number_utilities.median(all_hypothesization_times, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                final SubLObject stdev_hypothesization_time = (SubLObject)((kbq_query_run.NIL != all_hypothesization_times) ? number_utilities.standard_deviation(all_hypothesization_times) : kbq_query_run.NIL);
                final SubLObject partial_analysis3 = (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw471$SUM_HYPOTHESIZATION_TIME, sum_hypothesization_time, (SubLObject)kbq_query_run.$kw95$MEAN_HYPOTHESIZATION_TIME, mean_hypothesization_time, (SubLObject)kbq_query_run.$kw90$MEDIAN_HYPOTHESIZATION_TIME, median_hypothesization_time, (SubLObject)kbq_query_run.$kw472$STDEV_HYPOTHESIZATION_TIME, stdev_hypothesization_time);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw20$TOTAL_TIME)) {
                SubLObject all_total_times = (SubLObject)kbq_query_run.NIL;
                SubLObject cdolist_list_var_$75 = query_runs;
                SubLObject query_run = (SubLObject)kbq_query_run.NIL;
                query_run = cdolist_list_var_$75.first();
                while (kbq_query_run.NIL != cdolist_list_var_$75) {
                    final SubLObject var = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, (SubLObject)kbq_query_run.ZERO_INTEGER);
                    if (kbq_query_run.NIL != var) {
                        all_total_times = (SubLObject)ConsesLow.cons(var, all_total_times);
                    }
                    cdolist_list_var_$75 = cdolist_list_var_$75.rest();
                    query_run = cdolist_list_var_$75.first();
                }
                final SubLObject sum_total_time = number_utilities.summation(all_total_times);
                final SubLObject mean_total_time = (SubLObject)((kbq_query_run.NIL != all_total_times) ? number_utilities.mean(all_total_times) : kbq_query_run.NIL);
                final SubLObject median_total_time = (SubLObject)((kbq_query_run.NIL != all_total_times) ? number_utilities.median(all_total_times, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                final SubLObject stdev_total_time = (SubLObject)((kbq_query_run.NIL != all_total_times) ? number_utilities.standard_deviation(all_total_times) : kbq_query_run.NIL);
                final SubLObject partial_analysis3 = (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw473$SUM_TOTAL_TIME, sum_total_time, (SubLObject)kbq_query_run.$kw96$MEAN_TOTAL_TIME, mean_total_time, (SubLObject)kbq_query_run.$kw91$MEDIAN_TOTAL_TIME, median_total_time, (SubLObject)kbq_query_run.$kw474$STDEV_TOTAL_TIME, stdev_total_time);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME)) {
                SubLObject all_total_times = (SubLObject)kbq_query_run.NIL;
                SubLObject cdolist_list_var_$76 = query_runs;
                SubLObject query_run = (SubLObject)kbq_query_run.NIL;
                query_run = cdolist_list_var_$76.first();
                while (kbq_query_run.NIL != cdolist_list_var_$76) {
                    final SubLObject var = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw21$COMPLETE_TOTAL_TIME, (SubLObject)kbq_query_run.ZERO_INTEGER);
                    if (kbq_query_run.NIL != var) {
                        all_total_times = (SubLObject)ConsesLow.cons(var, all_total_times);
                    }
                    cdolist_list_var_$76 = cdolist_list_var_$76.rest();
                    query_run = cdolist_list_var_$76.first();
                }
                final SubLObject sum_total_time = number_utilities.summation(all_total_times);
                final SubLObject mean_total_time = (SubLObject)((kbq_query_run.NIL != all_total_times) ? number_utilities.mean(all_total_times) : kbq_query_run.NIL);
                final SubLObject median_total_time = (SubLObject)((kbq_query_run.NIL != all_total_times) ? number_utilities.median(all_total_times, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                final SubLObject stdev_total_time = (SubLObject)((kbq_query_run.NIL != all_total_times) ? number_utilities.standard_deviation(all_total_times) : kbq_query_run.NIL);
                final SubLObject partial_analysis3 = (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw475$SUM_COMPLETE_TOTAL_TIME, sum_total_time, (SubLObject)kbq_query_run.$kw476$MEAN_COMPLETE_TOTAL_TIME, mean_total_time, (SubLObject)kbq_query_run.$kw477$MEDIAN_COMPLETE_TOTAL_TIME, median_total_time, (SubLObject)kbq_query_run.$kw478$STDEV_COMPLETE_TOTAL_TIME, stdev_total_time);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER)) {
                SubLObject all_time_to_first_answers = (SubLObject)kbq_query_run.NIL;
                SubLObject cdolist_list_var_$77 = query_runs;
                SubLObject query_run = (SubLObject)kbq_query_run.NIL;
                query_run = cdolist_list_var_$77.first();
                while (kbq_query_run.NIL != cdolist_list_var_$77) {
                    final SubLObject var = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED);
                    if (kbq_query_run.NIL != var) {
                        all_time_to_first_answers = (SubLObject)ConsesLow.cons(var, all_time_to_first_answers);
                    }
                    cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                    query_run = cdolist_list_var_$77.first();
                }
                final SubLObject sum_time_to_first_answer = number_utilities.summation(all_time_to_first_answers);
                final SubLObject mean_time_to_first_answer = (SubLObject)((kbq_query_run.NIL != all_time_to_first_answers) ? number_utilities.mean(all_time_to_first_answers) : kbq_query_run.NIL);
                final SubLObject median_time_to_first_answer = (SubLObject)((kbq_query_run.NIL != all_time_to_first_answers) ? number_utilities.median(all_time_to_first_answers, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                final SubLObject stdev_time_to_first_answer = (SubLObject)((kbq_query_run.NIL != all_time_to_first_answers) ? number_utilities.standard_deviation(all_time_to_first_answers) : kbq_query_run.NIL);
                final SubLObject partial_analysis3 = (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw479$SUM_TIME_TO_FIRST_ANSWER, sum_time_to_first_answer, (SubLObject)kbq_query_run.$kw97$MEAN_TIME_TO_FIRST_ANSWER, mean_time_to_first_answer, (SubLObject)kbq_query_run.$kw92$MEDIAN_TIME_TO_FIRST_ANSWER, median_time_to_first_answer, (SubLObject)kbq_query_run.$kw480$STDEV_TIME_TO_FIRST_ANSWER, stdev_time_to_first_answer);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw24$COMPLETE_TIME_TO_FIRST_ANSWER)) {
                SubLObject all_time_to_first_answers = (SubLObject)kbq_query_run.NIL;
                SubLObject cdolist_list_var_$78 = query_runs;
                SubLObject query_run = (SubLObject)kbq_query_run.NIL;
                query_run = cdolist_list_var_$78.first();
                while (kbq_query_run.NIL != cdolist_list_var_$78) {
                    final SubLObject var = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw24$COMPLETE_TIME_TO_FIRST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED);
                    if (kbq_query_run.NIL != var) {
                        all_time_to_first_answers = (SubLObject)ConsesLow.cons(var, all_time_to_first_answers);
                    }
                    cdolist_list_var_$78 = cdolist_list_var_$78.rest();
                    query_run = cdolist_list_var_$78.first();
                }
                final SubLObject sum_time_to_first_answer = number_utilities.summation(all_time_to_first_answers);
                final SubLObject mean_time_to_first_answer = (SubLObject)((kbq_query_run.NIL != all_time_to_first_answers) ? number_utilities.mean(all_time_to_first_answers) : kbq_query_run.NIL);
                final SubLObject median_time_to_first_answer = (SubLObject)((kbq_query_run.NIL != all_time_to_first_answers) ? number_utilities.median(all_time_to_first_answers, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                final SubLObject stdev_time_to_first_answer = (SubLObject)((kbq_query_run.NIL != all_time_to_first_answers) ? number_utilities.standard_deviation(all_time_to_first_answers) : kbq_query_run.NIL);
                final SubLObject partial_analysis3 = (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw481$SUM_COMPLETE_TIME_TO_FIRST_ANSWER, sum_time_to_first_answer, (SubLObject)kbq_query_run.$kw482$MEAN_COMPLETE_TIME_TO_FIRST_ANSWER, mean_time_to_first_answer, (SubLObject)kbq_query_run.$kw483$MEDIAN_COMPLETE_TIME_TO_FIRST_ANSWER, median_time_to_first_answer, (SubLObject)kbq_query_run.$kw484$STDEV_COMPLETE_TIME_TO_FIRST_ANSWER, stdev_time_to_first_answer);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw36$ANSWERABILITY_TIME)) {
                SubLObject all_answerability_times = (SubLObject)kbq_query_run.NIL;
                SubLObject cdolist_list_var_$79 = query_runs;
                SubLObject query_run = (SubLObject)kbq_query_run.NIL;
                query_run = cdolist_list_var_$79.first();
                while (kbq_query_run.NIL != cdolist_list_var_$79) {
                    final SubLObject var = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw36$ANSWERABILITY_TIME, (SubLObject)kbq_query_run.UNPROVIDED);
                    if (kbq_query_run.NIL != var) {
                        all_answerability_times = (SubLObject)ConsesLow.cons(var, all_answerability_times);
                    }
                    cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                    query_run = cdolist_list_var_$79.first();
                }
                final SubLObject sum_answerability_time = number_utilities.summation(all_answerability_times);
                final SubLObject mean_answerability_time = (SubLObject)((kbq_query_run.NIL != all_answerability_times) ? number_utilities.mean(all_answerability_times) : kbq_query_run.NIL);
                final SubLObject median_answerability_time = (SubLObject)((kbq_query_run.NIL != all_answerability_times) ? number_utilities.median(all_answerability_times, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                final SubLObject stdev_answerability_time = (SubLObject)((kbq_query_run.NIL != all_answerability_times) ? number_utilities.standard_deviation(all_answerability_times) : kbq_query_run.NIL);
                final SubLObject partial_analysis3 = (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw485$SUM_ANSWERABILITY_TIME, sum_answerability_time, (SubLObject)kbq_query_run.$kw486$MEAN_ANSWERABILITY_TIME, mean_answerability_time, (SubLObject)kbq_query_run.$kw487$MEDIAN_ANSWERABILITY_TIME, median_answerability_time, (SubLObject)kbq_query_run.$kw488$STDEV_ANSWERABILITY_TIME, stdev_answerability_time);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER)) {
                SubLObject all_time_to_last_answers = (SubLObject)kbq_query_run.NIL;
                SubLObject cdolist_list_var_$80 = query_runs;
                SubLObject query_run = (SubLObject)kbq_query_run.NIL;
                query_run = cdolist_list_var_$80.first();
                while (kbq_query_run.NIL != cdolist_list_var_$80) {
                    final SubLObject var = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw23$TIME_TO_LAST_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED);
                    if (kbq_query_run.NIL != var) {
                        all_time_to_last_answers = (SubLObject)ConsesLow.cons(var, all_time_to_last_answers);
                    }
                    cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                    query_run = cdolist_list_var_$80.first();
                }
                final SubLObject sum_time_to_last_answer = number_utilities.summation(all_time_to_last_answers);
                final SubLObject mean_time_to_last_answer = (SubLObject)((kbq_query_run.NIL != all_time_to_last_answers) ? number_utilities.mean(all_time_to_last_answers) : kbq_query_run.NIL);
                final SubLObject median_time_to_last_answer = (SubLObject)((kbq_query_run.NIL != all_time_to_last_answers) ? number_utilities.median(all_time_to_last_answers, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                final SubLObject stdev_time_to_last_answer = (SubLObject)((kbq_query_run.NIL != all_time_to_last_answers) ? number_utilities.standard_deviation(all_time_to_last_answers) : kbq_query_run.NIL);
                final SubLObject partial_analysis3 = (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw489$SUM_TIME_TO_LAST_ANSWER, sum_time_to_last_answer, (SubLObject)kbq_query_run.$kw98$MEAN_TIME_TO_LAST_ANSWER, mean_time_to_last_answer, (SubLObject)kbq_query_run.$kw93$MEDIAN_TIME_TO_LAST_ANSWER, median_time_to_last_answer, (SubLObject)kbq_query_run.$kw490$STDEV_TIME_TO_LAST_ANSWER, stdev_time_to_last_answer);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            }
            else if (pcase_var.eql((SubLObject)kbq_query_run.$kw35$COMPLETE_TIME_PER_ANSWER)) {
                SubLObject all_time_per_answers = (SubLObject)kbq_query_run.NIL;
                SubLObject cdolist_list_var_$81 = query_runs;
                SubLObject query_run = (SubLObject)kbq_query_run.NIL;
                query_run = cdolist_list_var_$81.first();
                while (kbq_query_run.NIL != cdolist_list_var_$81) {
                    final SubLObject var = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw35$COMPLETE_TIME_PER_ANSWER, (SubLObject)kbq_query_run.UNPROVIDED);
                    if (kbq_query_run.NIL != var) {
                        all_time_per_answers = (SubLObject)ConsesLow.cons(var, all_time_per_answers);
                    }
                    cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                    query_run = cdolist_list_var_$81.first();
                }
                final SubLObject median_time_per_answer = (SubLObject)((kbq_query_run.NIL != all_time_per_answers) ? number_utilities.median(all_time_per_answers, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                final SubLObject partial_analysis4 = (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw491$MEDIAN_COMPLETE_TIME_PER_ANSWER, median_time_per_answer);
                analysis = list_utilities.merge_plist(analysis, partial_analysis4);
            }
            else {
                Errors.warn((SubLObject)kbq_query_run.$str492$ignoring_metric__S, metric);
            }
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        }
        if (kbq_query_run.NIL != subl_promotions.memberP((SubLObject)kbq_query_run.$kw20$TOTAL_TIME, metrics, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) && kbq_query_run.NIL != subl_promotions.memberP((SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, metrics, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
            SubLObject all_times_per_answer = (SubLObject)kbq_query_run.NIL;
            SubLObject cdolist_list_var2 = query_runs;
            SubLObject query_run2 = (SubLObject)kbq_query_run.NIL;
            query_run2 = cdolist_list_var2.first();
            while (kbq_query_run.NIL != cdolist_list_var2) {
                final SubLObject total_time = conses_high.getf(query_run2, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, (SubLObject)kbq_query_run.ZERO_INTEGER);
                final SubLObject answer_count = conses_high.getf(query_run2, (SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, (SubLObject)kbq_query_run.ZERO_INTEGER);
                if (kbq_query_run.NIL != subl_promotions.positive_integer_p(answer_count)) {
                    final SubLObject var;
                    final SubLObject time_per_answer = var = Numbers.divide(total_time, answer_count);
                    if (kbq_query_run.NIL != var) {
                        all_times_per_answer = (SubLObject)ConsesLow.cons(var, all_times_per_answer);
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                query_run2 = cdolist_list_var2.first();
            }
            final SubLObject median_time_per_answer2 = (SubLObject)((kbq_query_run.NIL != all_times_per_answer) ? number_utilities.median(all_times_per_answer, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
            final SubLObject partial_analysis5 = (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw493$MEDIAN_TIME_PER_ANSWER, median_time_per_answer2);
            analysis = list_utilities.merge_plist(analysis, partial_analysis5);
        }
        return analysis;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 172413L)
    public static SubLObject kbq_query_set_run_total_answerable(final SubLObject query_set_run) {
        final SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject all_answer_counts = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject var = conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, (SubLObject)kbq_query_run.ZERO_INTEGER);
            if (kbq_query_run.NIL != var) {
                all_answer_counts = (SubLObject)ConsesLow.cons(var, all_answer_counts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        final SubLObject total_answerable = Sequences.count_if(Symbols.symbol_function((SubLObject)kbq_query_run.$sym410$POSITIVE_INTEGER_P), all_answer_counts, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        return total_answerable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 172794L)
    public static SubLObject kbq_query_set_run_last_query_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject last_query = (SubLObject)kbq_query_run.NIL;
        assert kbq_query_run.NIL != Types.stringp(filename) : filename;
        SubLObject stream = (SubLObject)kbq_query_run.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kbq_query_run.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)kbq_query_run.$kw403$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kbq_query_run.$str225$Unable_to_open__S, filename);
            }
            final SubLObject stream_$82 = stream;
            final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind((SubLObject)kbq_query_run.NIL, thread);
                cfasl.cfasl_set_common_symbols_simple(kbq_cfasl_common_symbols_simple());
                final SubLObject _prev_bind_0_$83 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    cfasl.$cfasl_input_guid_string_resource$.bind(cfasl.get_new_cfasl_input_guid_string_resource(), thread);
                    final SubLObject query_set_run = kbq_load_query_set_run_int(stream_$82);
                    SubLObject csome_list_var = kbq_query_set_run_query_runs(query_set_run);
                    SubLObject query_run = (SubLObject)kbq_query_run.NIL;
                    query_run = csome_list_var.first();
                    while (kbq_query_run.NIL != csome_list_var) {
                        last_query = kbq_query_run_query(query_run);
                        csome_list_var = csome_list_var.rest();
                        query_run = csome_list_var.first();
                    }
                    for (SubLObject done_var = (SubLObject)kbq_query_run.NIL; kbq_query_run.NIL == done_var; done_var = (SubLObject)kbq_query_run.NIL) {
                        query_run = kbq_load_query_run_int(stream_$82);
                        if (query_run == kbq_query_run.$kw404$EOF) {
                            done_var = (SubLObject)kbq_query_run.T;
                        }
                        if (kbq_query_run.NIL == done_var) {
                            query_run = kbq_nclean_query_run(query_run);
                            last_query = kbq_query_run_query(query_run);
                        }
                    }
                }
                finally {
                    cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$83, thread);
                }
            }
            finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kbq_query_run.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return last_query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 173019L)
    public static SubLObject kbq_query_set_run_identify_probable_segfault_from_file(final SubLObject filename, final SubLObject all_kbqs) {
        final SubLObject last_kbq = kbq_query_set_run_last_query_from_file(filename);
        return kbq_query_set_run_identify_probable_segfault_int(last_kbq, all_kbqs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 173265L)
    public static SubLObject kbq_query_set_run_identify_probable_segfault(final SubLObject query_set_run, final SubLObject all_kbqs) {
        final SubLObject last_kbq = list_utilities.last_one(kbq_query_set_run_queries(query_set_run));
        return kbq_query_set_run_identify_probable_segfault_int(last_kbq, all_kbqs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 173509L)
    public static SubLObject kbq_query_set_run_identify_probable_segfault_int(final SubLObject last_kbq, final SubLObject all_kbqs) {
        final SubLObject last_pos = Sequences.position(last_kbq, all_kbqs, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject segfault_pos = number_utilities.f_1X(last_pos);
        final SubLObject segfaulting_kbq = ConsesLow.nth(segfault_pos, all_kbqs);
        return Values.values(segfaulting_kbq, segfault_pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 173784L)
    public static SubLObject kct_analyze_test_runs(final SubLObject test_runs, final SubLObject metrics) {
        final SubLObject total = Sequences.length(test_runs);
        final SubLObject total_success = Sequences.count((SubLObject)kbq_query_run.$kw0$SUCCESS, test_runs, Symbols.symbol_function((SubLObject)kbq_query_run.EQ), Symbols.symbol_function((SubLObject)kbq_query_run.$sym373$KCT_TEST_RUN_STATUS), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject total_failure = Sequences.count((SubLObject)kbq_query_run.$kw1$FAILURE, test_runs, Symbols.symbol_function((SubLObject)kbq_query_run.EQ), Symbols.symbol_function((SubLObject)kbq_query_run.$sym373$KCT_TEST_RUN_STATUS), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        SubLObject test_analysis = (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw463$TOTAL, total, (SubLObject)kbq_query_run.$kw494$TOTAL_SUCCESS, total_success, (SubLObject)kbq_query_run.$kw495$TOTAL_FAILURE, total_failure);
        if (total.isPositive()) {
            final SubLObject success_pct = number_utilities.percent(total_success, total, (SubLObject)kbq_query_run.UNPROVIDED);
            final SubLObject failure_pct = number_utilities.percent(total_failure, total, (SubLObject)kbq_query_run.UNPROVIDED);
            test_analysis = ConsesLow.append(test_analysis, (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.$kw496$PERCENT_SUCCESS, success_pct, (SubLObject)kbq_query_run.$kw497$PERCENT_FAILURE, failure_pct));
        }
        final SubLObject query_runs = Mapping.mapcar(Symbols.symbol_function((SubLObject)kbq_query_run.$sym498$KCT_TEST_RUN_QUERY_RUN), test_runs);
        final SubLObject query_run_analysis = conses_high.remf(kbq_analyze_query_runs(query_runs, metrics), (SubLObject)kbq_query_run.$kw463$TOTAL);
        return list_utilities.merge_plist(test_analysis, query_run_analysis);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 174633L)
    public static SubLObject kct_test_set_run_identify_probable_segfault(final SubLObject test_set_run, final SubLObject all_kcts) {
        final SubLObject last_kct = list_utilities.last_one(kct_test_set_run_tests(test_set_run));
        final SubLObject last_pos = Sequences.position(last_kct, all_kcts, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject segfault_pos = number_utilities.f_1X(last_pos);
        final SubLObject segfaulting_kct = ConsesLow.nth(segfault_pos, all_kcts);
        return Values.values(segfaulting_kct, segfault_pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 174978L)
    public static SubLObject analyze_kbq_experiments(final SubLObject baseline_denoting_symbol, final SubLObject experiment_denoting_symbol, SubLObject corpus, SubLObject graph_metrics, SubLObject metrics, SubLObject display, SubLObject stream) {
        if (corpus == kbq_query_run.UNPROVIDED) {
            corpus = (SubLObject)kbq_query_run.$str161$;
        }
        if (graph_metrics == kbq_query_run.UNPROVIDED) {
            graph_metrics = (SubLObject)kbq_query_run.$list499;
        }
        if (metrics == kbq_query_run.UNPROVIDED) {
            metrics = lilliput.basic_lilliput_query_metrics();
        }
        if (display == kbq_query_run.UNPROVIDED) {
            display = (SubLObject)kbq_query_run.$str500$_0;
        }
        if (stream == kbq_query_run.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kbq_query_run.NIL != special_variable_state.bound_symbol_p(baseline_denoting_symbol) : baseline_denoting_symbol;
        assert kbq_query_run.NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) : experiment_denoting_symbol;
        final SubLObject baseline = Symbols.symbol_value(baseline_denoting_symbol);
        final SubLObject baseline_name = Symbols.symbol_name(baseline_denoting_symbol);
        final SubLObject experiment = Symbols.symbol_value(experiment_denoting_symbol);
        final SubLObject experiment_name = Symbols.symbol_name(experiment_denoting_symbol);
        thread.resetMultipleValues();
        final SubLObject mutual_baseline = kbq_mutually_answerable_query_set_runs(baseline, experiment);
        final SubLObject mutual_experiment = thread.secondMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format(stream, (SubLObject)kbq_query_run.$str502$____Answerability_analysis____);
        thread.resetMultipleValues();
        final SubLObject only_1 = kbq_query_set_run_answerable_counts(baseline, experiment);
        final SubLObject mutual = thread.secondMultipleValue();
        final SubLObject only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str503$Total_____________s__s__s__, new SubLObject[] { only_1, mutual, only_2 });
        PrintLow.format(stream, (SubLObject)kbq_query_run.$str504$____Basic_analysis____);
        kbq_print_analysis(kbq_analyze_query_set_runs(baseline, experiment, metrics));
        PrintLow.format(stream, (SubLObject)kbq_query_run.$str505$____Mutually_Answerable____);
        kbq_print_analysis(kbq_analyze_query_set_runs(mutual_baseline, mutual_experiment, metrics));
        PrintLow.format(stream, (SubLObject)kbq_query_run.$str506$____Answerable____);
        kbq_print_analysis(kbq_analyze_query_set_runs(kbq_answerable_query_set_run(baseline), kbq_answerable_query_set_run(experiment), metrics));
        PrintLow.format(stream, (SubLObject)kbq_query_run.$str507$____Unanswerable____);
        kbq_print_analysis(kbq_analyze_query_set_runs(kbq_unanswerable_query_set_run(baseline), kbq_unanswerable_query_set_run(experiment), metrics));
        SubLObject cdolist_list_var = graph_metrics;
        SubLObject metric = (SubLObject)kbq_query_run.NIL;
        metric = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$84 = (SubLObject)kbq_query_run.$list508;
            SubLObject sort_by = (SubLObject)kbq_query_run.NIL;
            sort_by = cdolist_list_var_$84.first();
            while (kbq_query_run.NIL != cdolist_list_var_$84) {
                lilliput.lilliput_generate_sorted_property_comparison(baseline, experiment, baseline_name, experiment_name, metric, sort_by, corpus, display);
                cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                sort_by = cdolist_list_var_$84.first();
            }
            SubLObject cdolist_list_var_$85 = (SubLObject)kbq_query_run.$list508;
            sort_by = (SubLObject)kbq_query_run.NIL;
            sort_by = cdolist_list_var_$85.first();
            while (kbq_query_run.NIL != cdolist_list_var_$85) {
                lilliput.lilliput_generate_sorted_property_comparison(mutual_baseline, mutual_experiment, baseline_name, experiment_name, metric, sort_by, Sequences.cconcatenate((SubLObject)kbq_query_run.$str509$Mutually_Answerable_, corpus), display);
                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                sort_by = cdolist_list_var_$85.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 177192L)
    public static SubLObject kbq_non_lumpy_query_set_run(final SubLObject query_set_run) {
        return kbq_filter_query_set_run_to_queries(query_set_run, kbq_lumpy_queries(query_set_run), (SubLObject)kbq_query_run.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 177372L)
    public static SubLObject kbq_lumpy_queries(final SubLObject query_set_run) {
        SubLObject queries = (SubLObject)kbq_query_run.NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = (SubLObject)kbq_query_run.NIL;
        query_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            if (kbq_query_run.NIL != kbq_lumpy_query_runP(query_run)) {
                queries = (SubLObject)ConsesLow.cons(kbq_query_run_query(query_run), queries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 177729L)
    public static SubLObject kbq_lumpy_query_count(final SubLObject query_set_run) {
        return kbq_count_lumpy_query_runs(kbq_query_set_run_query_runs(query_set_run));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 177985L)
    public static SubLObject kbq_count_lumpy_query_runs(final SubLObject query_runs) {
        return Sequences.count_if((SubLObject)kbq_query_run.$sym510$KBQ_LUMPY_QUERY_RUN_, query_runs, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 178097L)
    public static SubLObject kbq_lumpy_query_runP(final SubLObject query_run) {
        final SubLObject halt_reason = kbq_query_run_halt_reason(query_run);
        if (kbq_query_run.NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason) && kbq_query_run.NIL != string_utilities.substringP((SubLObject)kbq_query_run.$str511$Unable_to_compute_any_metrics, inference_datastructures_enumerated_types.inference_error_suspend_status_message(halt_reason), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
            return (SubLObject)kbq_query_run.T;
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 178405L)
    public static SubLObject show_kct_test_set_run_summary(final SubLObject test_set_run, SubLObject stream) {
        if (stream == kbq_query_run.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_runs = kct_test_set_run_test_runs(test_set_run);
        final SubLObject total = Sequences.length(test_runs);
        final SubLObject successes = Sequences.count((SubLObject)kbq_query_run.$kw0$SUCCESS, test_runs, Symbols.symbol_function((SubLObject)kbq_query_run.EQ), Symbols.symbol_function((SubLObject)kbq_query_run.$sym373$KCT_TEST_RUN_STATUS), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject failures = Sequences.count((SubLObject)kbq_query_run.$kw1$FAILURE, test_runs, Symbols.symbol_function((SubLObject)kbq_query_run.EQ), Symbols.symbol_function((SubLObject)kbq_query_run.$sym373$KCT_TEST_RUN_STATUS), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
            reader.$read_default_float_format$.bind((SubLObject)kbq_query_run.$sym512$DOUBLE_FLOAT, thread);
            PrintLow.format(stream, (SubLObject)kbq_query_run.$str513$_____Total_Tests____4D, total);
            PrintLow.format(stream, (SubLObject)kbq_query_run.$str514$______Successes_____4D___S___, successes, number_utilities.significant_digits(Numbers.multiply((SubLObject)kbq_query_run.$int62$100, Numbers.divide(successes, total)), (SubLObject)kbq_query_run.THREE_INTEGER));
            PrintLow.format(stream, (SubLObject)kbq_query_run.$str515$______Failures______4D___S___, failures, number_utilities.significant_digits(Numbers.multiply((SubLObject)kbq_query_run.$int62$100, Numbers.divide(failures, total)), (SubLObject)kbq_query_run.THREE_INTEGER));
            final SubLObject analysis = kct_analyze_test_set_run(test_set_run, (SubLObject)kbq_query_run.UNPROVIDED);
            PrintLow.format(stream, (SubLObject)kbq_query_run.$str516$_______Test_Set_Metrics__);
            list_utilities.pretty_print_plist(analysis, stream);
            SubLObject cdolist_list_var = test_runs;
            SubLObject test_run = (SubLObject)kbq_query_run.NIL;
            test_run = cdolist_list_var.first();
            while (kbq_query_run.NIL != cdolist_list_var) {
                final SubLObject test = kct_test_run_test(test_run);
                final SubLObject status = kct_test_run_status(test_run);
                final SubLObject query_run = kct_test_run_query_run(test_run);
                final SubLObject halt_reason = kbq_query_run_property_value(query_run, (SubLObject)kbq_query_run.$kw29$HALT_REASON, (SubLObject)kbq_query_run.UNPROVIDED);
                PrintLow.format(stream, (SubLObject)kbq_query_run.$str517$____Test____S, test);
                PrintLow.format(stream, (SubLObject)kbq_query_run.$str518$__Status____S, status);
                PrintLow.format(stream, (SubLObject)kbq_query_run.$str519$__Halt_Reason____S, halt_reason);
                SubLObject remainder;
                SubLObject property;
                SubLObject value;
                for (remainder = (SubLObject)kbq_query_run.NIL, remainder = query_run; kbq_query_run.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                    property = remainder.first();
                    value = conses_high.cadr(remainder);
                    if (kbq_query_run.NIL != inference_datastructures_enumerated_types.query_metric_p(property) && kbq_query_run.NIL != value) {
                        PrintLow.format(stream, (SubLObject)kbq_query_run.$str520$___S__S, property, value);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            }
        }
        finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 179887L)
    public static SubLObject kbq_show_halt_reason_histogram(final SubLObject query_set_run) {
        return list_utilities.pretty_print_histogram(list_utilities.histogram(Mapping.mapcar((SubLObject)kbq_query_run.$sym521$KBQ_QUERY_RUN_HALT_REASON, kbq_query_set_run_query_runs(query_set_run)), Symbols.symbol_function((SubLObject)kbq_query_run.$sym86$_), Symbols.symbol_function((SubLObject)kbq_query_run.EQUAL), (SubLObject)kbq_query_run.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 180089L)
    public static SubLObject trim_analysis_if_zero(final SubLObject plist) {
        if (kbq_query_run.ZERO_INTEGER.eql(conses_high.getf(plist, (SubLObject)kbq_query_run.$kw463$TOTAL, (SubLObject)kbq_query_run.UNPROVIDED))) {
            return (SubLObject)kbq_query_run.$list522;
        }
        return plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 180218L)
    public static SubLObject kbq_query_literal_count(final SubLObject query) {
        SubLObject sentence;
        for (sentence = czer_utilities.unwrap_if_ist_permissive(kb_query.kbq_sentence(query), kb_query.kbq_mt(query)); kbq_query_run.NIL != el_utilities.el_existential_p(sentence); sentence = cycl_utilities.formula_arg2(sentence, (SubLObject)kbq_query_run.UNPROVIDED)) {
            if (kbq_query_run.NIL != el_utilities.el_existential_p(sentence)) {}
        }
        if (kbq_query_run.NIL == el_utilities.el_conjunction_p(sentence)) {
            return (SubLObject)kbq_query_run.ONE_INTEGER;
        }
        return el_utilities.formula_arity(sentence, (SubLObject)kbq_query_run.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 180656L)
    public static SubLObject kbq_single_literal_query_p(final SubLObject query) {
        SubLObject sentence;
        for (sentence = czer_utilities.unwrap_if_ist_permissive(kb_query.kbq_sentence(query), kb_query.kbq_mt(query)); kbq_query_run.NIL != el_utilities.el_existential_p(sentence); sentence = cycl_utilities.formula_arg2(sentence, (SubLObject)kbq_query_run.UNPROVIDED)) {
            if (kbq_query_run.NIL != el_utilities.el_existential_p(sentence)) {}
        }
        return cycl_grammar.cycl_literal_p(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 181101L)
    public static SubLObject kbq_progress_stream() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbq_query_run.$kbq_progress_stream$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 181236L)
    public static SubLObject kbq_benchmark_run_and_report(final SubLObject filename, final SubLObject title, final SubLObject test_col) {
        kbq_benchmark_run(filename, title, test_col, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        kbq_benchmark_report(filename, (SubLObject)kbq_query_run.UNPROVIDED);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 181401L)
    public static SubLObject kbq_benchmark_run_in_background(final SubLObject filename, final SubLObject title, final SubLObject test_col) {
        subl_promotions.make_process_with_args(Sequences.cconcatenate((SubLObject)kbq_query_run.$str524$Running_kbq_benchmark__kbq_benchm, new SubLObject[] { format_nil.format_nil_s_no_copy(filename), kbq_query_run.$str525$_ }), (SubLObject)kbq_query_run.$sym526$KBQ_BENCHMARK_RUN, (SubLObject)ConsesLow.list(filename, title, test_col));
        format_nil.force_format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str527$kbq_benchmark__kbq_benchmark_repo, filename, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 181727L)
    public static SubLObject kbq_benchmark_run(final SubLObject filename, final SubLObject title, final SubLObject test_col, SubLObject overriding_query_properties, SubLObject skip, SubLObject count) {
        if (overriding_query_properties == kbq_query_run.UNPROVIDED) {
            overriding_query_properties = (SubLObject)kbq_query_run.NIL;
        }
        if (skip == kbq_query_run.UNPROVIDED) {
            skip = (SubLObject)kbq_query_run.ZERO_INTEGER;
        }
        if (count == kbq_query_run.UNPROVIDED) {
            count = (SubLObject)kbq_query_run.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kbq_query_run.NIL != Types.stringp(filename) : filename;
        assert kbq_query_run.NIL != Types.stringp(title) : title;
        assert kbq_query_run.NIL != forts.fort_p(test_col) : test_col;
        if (kbq_query_run.NIL != overriding_query_properties && !kbq_query_run.assertionsDisabledInClass && kbq_query_run.NIL == Types.listp(overriding_query_properties)) {
            throw new AssertionError(overriding_query_properties);
        }
        SubLObject comment = (SubLObject)kbq_query_run.NIL;
        SubLObject stream = (SubLObject)kbq_query_run.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            if (title.isString()) {
                PrintLow.format(stream, (SubLObject)kbq_query_run.$str530$_______A______, title);
            }
            if (kbq_query_run.NIL != overriding_query_properties) {
                PrintLow.format(stream, (SubLObject)kbq_query_run.$str531$____overriding_query_properties__, overriding_query_properties);
            }
            PrintLow.format(stream, (SubLObject)kbq_query_run.$str532$Tests_run_in_System__A_KB__A__, system_info.cyc_revision_string(), operation_communication.kb_version_string());
            comment = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)kbq_query_run.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return run_kbq_experiment_internal((SubLObject)ConsesLow.list(new SubLObject[] { kbq_query_run.$kw204$QUERY_SPEC_SET, reader.bq_cons(kbq_query_run.$const533$TheSet, ConsesLow.append(Mapping.mapcar((SubLObject)kbq_query_run.$sym534$KCT_QUERY_SPECIFICATION, isa.all_instances_in_all_mts(test_col)), (SubLObject)kbq_query_run.NIL)), kbq_query_run.$kw205$FILENAME, filename, kbq_query_run.$kw206$ANALYSIS_FILENAME, kbq_query_run.NIL, kbq_query_run.$kw207$KEEPALIVE_FILENAME, kbq_query_run.NIL, kbq_query_run.$kw77$COMMENT, comment, kbq_query_run.$kw137$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, kbq_query_run.$kw118$METRICS, kbq_query_run.$list535, kbq_query_run.$kw130$OUTLIER_TIMEOUT, kbq_query_run.$kbq_benchmark_outlier_timeout$.getDynamicValue(thread), kbq_query_run.$kw210$INCREMENTAL, kbq_query_run.T, kbq_query_run.$kw211$INCLUDE_RESULTS, kbq_query_run.T, kbq_query_run.$kw212$RANDOMIZE, kbq_query_run.NIL, kbq_query_run.$kw213$SKIP, skip, kbq_query_run.$kw214$COUNT, count, kbq_query_run.$kw215$IF_FILE_EXISTS, kbq_query_run.$kw231$AUGMENT_OR_RERUN_ERRORS }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 182889L)
    public static SubLObject kbq_benchmark_report(final SubLObject filename, SubLObject stream) {
        if (stream == kbq_query_run.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject query_set_run = kbq_load_query_set_run(filename);
        final SubLObject comment = kbq_query_set_run_comment(query_set_run);
        SubLObject total_num = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject total_ttfa = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject total_ttfs = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject total_sksi_call_count = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject total_sksi = (SubLObject)kbq_query_run.ZERO_INTEGER;
        SubLObject total_total_time = (SubLObject)kbq_query_run.ZERO_INTEGER;
        PrintLow.format(stream, comment);
        PrintLow.format(stream, (SubLObject)kbq_query_run.$str536$__ANS__TTFS____TTFA__SQ____SKSI__);
        PrintLow.format(stream, (SubLObject)kbq_query_run.$str537$_________________________________);
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject kbq_run = (SubLObject)kbq_query_run.NIL;
        kbq_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query = kbq_query_run_query(kbq_run);
            final SubLObject halt_reason = kbq_query_run_halt_reason(kbq_run);
            final SubLObject test = (SubLObject)((kbq_query_run.NIL != nart_handles.valid_nartP(query, (SubLObject)kbq_query_run.UNPROVIDED)) ? cycl_utilities.nat_arg1(query, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
            final SubLObject num = kbq_extract_query_run_metric_value(kbq_run, (SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, (SubLObject)kbq_query_run.ZERO_INTEGER);
            final SubLObject sksi_start_times = kbq_extract_query_run_metric_value(kbq_run, (SubLObject)kbq_query_run.$kw538$SKSI_QUERY_START_TIMES, (SubLObject)kbq_query_run.ZERO_INTEGER);
            final SubLObject sksi_call_count = (SubLObject)(sksi_start_times.isCons() ? Sequences.length(sksi_start_times) : kbq_query_run.NIL);
            final SubLObject ttfs = (SubLObject)(sksi_start_times.isCons() ? sksi_start_times.first() : kbq_query_run.NIL);
            final SubLObject ttfa = kbq_extract_query_run_metric_value(kbq_run, (SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER, (SubLObject)kbq_query_run.ZERO_INTEGER);
            final SubLObject sksi_query_total_time = kbq_extract_query_run_metric_value(kbq_run, (SubLObject)kbq_query_run.$kw539$SKSI_QUERY_TOTAL_TIME, (SubLObject)kbq_query_run.ZERO_INTEGER);
            final SubLObject total_time = kbq_extract_query_run_metric_value(kbq_run, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, (SubLObject)kbq_query_run.ZERO_INTEGER);
            if (kbq_query_run.NIL != number_utilities.positive_number_p(num)) {
                total_num = Numbers.add(total_num, num);
            }
            if (kbq_query_run.NIL != number_utilities.positive_number_p(ttfa)) {
                total_ttfa = Numbers.add(total_ttfa, ttfa);
            }
            if (kbq_query_run.NIL != number_utilities.positive_number_p(ttfs)) {
                total_ttfs = Numbers.add(total_ttfs, ttfs);
            }
            if (kbq_query_run.NIL != number_utilities.positive_number_p(sksi_call_count)) {
                total_sksi_call_count = Numbers.add(total_sksi_call_count, sksi_call_count);
            }
            if (kbq_query_run.NIL != number_utilities.positive_number_p(sksi_query_total_time)) {
                total_sksi = Numbers.add(total_sksi, sksi_query_total_time);
            }
            if (kbq_query_run.NIL != number_utilities.positive_number_p(total_time)) {
                total_total_time = Numbers.add(total_total_time, total_time);
            }
            PrintLow.format(stream, (SubLObject)kbq_query_run.$str540$_5D__5_1F__7_1F_4D__7_1F__7_1F__7, new SubLObject[] { num, ttfs, ttfa, sksi_call_count, sksi_query_total_time, (kbq_query_run.NIL != number_utilities.positive_number_p(sksi_query_total_time)) ? Numbers.subtract(total_time, sksi_query_total_time) : total_time, total_time, (kbq_query_run.NIL != number_utilities.positive_number_p(sksi_query_total_time)) ? number_utilities.percent(sksi_query_total_time, total_time, (SubLObject)kbq_query_run.THREE_INTEGER) : kbq_query_run.ZERO_INTEGER, test, (halt_reason == kbq_query_run.$kw541$EXHAUST_TOTAL) ? kbq_query_run.$str161$ : PrintLow.format((SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$str542$___A_, halt_reason) });
            cdolist_list_var = cdolist_list_var.rest();
            kbq_run = cdolist_list_var.first();
        }
        PrintLow.format(stream, (SubLObject)kbq_query_run.$str537$_________________________________);
        PrintLow.format(stream, (SubLObject)kbq_query_run.$str543$_5D__5_1F__7_1F_4D__7_1F__7_1F__7, new SubLObject[] { total_num, total_ttfs, total_ttfa, total_sksi_call_count, total_sksi, (kbq_query_run.NIL != number_utilities.positive_number_p(total_sksi)) ? Numbers.subtract(total_total_time, total_sksi) : total_total_time, total_total_time, (kbq_query_run.NIL != number_utilities.positive_number_p(total_sksi)) ? number_utilities.percent(total_sksi, total_total_time, (SubLObject)kbq_query_run.THREE_INTEGER) : kbq_query_run.ZERO_INTEGER });
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 185580L)
    public static SubLObject kbq_benchmark_report_for_test(final SubLObject filename, final SubLObject test_fort, SubLObject stream) {
        if (stream == kbq_query_run.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject query_set_run = kbq_load_query_set_run(filename);
        final SubLObject comment = kbq_query_set_run_comment(query_set_run);
        final SubLObject short_filename = list_utilities.last_one(string_utilities.string_tokenize(string_utilities.post_remove(filename, (SubLObject)kbq_query_run.$str406$_cfasl, (SubLObject)kbq_query_run.UNPROVIDED), (SubLObject)kbq_query_run.$list544, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED));
        final SubLObject one_line_comment = string_utilities.string_first_n((SubLObject)kbq_query_run.$int545$60, Strings.string_trim((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_asterisk, string_utilities.whitespace_chars()), string_utilities.string_tokenize(comment, (SubLObject)ConsesLow.list(string_utilities.$new_line_string$.getGlobalValue()), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED).first()));
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject kbq_run = (SubLObject)kbq_query_run.NIL;
        kbq_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject query = kbq_query_run_query(kbq_run);
            final SubLObject test = (SubLObject)((kbq_query_run.NIL != nart_handles.valid_nartP(query, (SubLObject)kbq_query_run.UNPROVIDED)) ? cycl_utilities.nat_arg1(query, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
            final SubLObject num = kbq_extract_query_run_metric_value(kbq_run, (SubLObject)kbq_query_run.$kw18$ANSWER_COUNT, (SubLObject)kbq_query_run.ZERO_INTEGER);
            final SubLObject sksi_start_times = kbq_extract_query_run_metric_value(kbq_run, (SubLObject)kbq_query_run.$kw538$SKSI_QUERY_START_TIMES, (SubLObject)kbq_query_run.ZERO_INTEGER);
            final SubLObject sksi_call_count = (SubLObject)(sksi_start_times.isCons() ? Sequences.length(sksi_start_times) : kbq_query_run.NIL);
            final SubLObject ttfs = (SubLObject)(sksi_start_times.isCons() ? sksi_start_times.first() : kbq_query_run.NIL);
            final SubLObject ttfa = kbq_extract_query_run_metric_value(kbq_run, (SubLObject)kbq_query_run.$kw22$TIME_TO_FIRST_ANSWER, (SubLObject)kbq_query_run.ZERO_INTEGER);
            final SubLObject sksi_query_total_time = kbq_extract_query_run_metric_value(kbq_run, (SubLObject)kbq_query_run.$kw539$SKSI_QUERY_TOTAL_TIME, (SubLObject)kbq_query_run.ZERO_INTEGER);
            final SubLObject total_time = kbq_extract_query_run_metric_value(kbq_run, (SubLObject)kbq_query_run.$kw20$TOTAL_TIME, (SubLObject)kbq_query_run.ZERO_INTEGER);
            if (test_fort.equal(test)) {
                PrintLow.format(stream, (SubLObject)kbq_query_run.$str546$_15A___5D__5_1F__7_1F_4D__7_1F__7, new SubLObject[] { short_filename, num, ttfs, ttfa, sksi_call_count, sksi_query_total_time, (kbq_query_run.NIL != number_utilities.positive_number_p(sksi_query_total_time)) ? Numbers.subtract(total_time, sksi_query_total_time) : total_time, total_time, (kbq_query_run.NIL != number_utilities.positive_number_p(sksi_query_total_time)) ? number_utilities.percent(sksi_query_total_time, total_time, (SubLObject)kbq_query_run.THREE_INTEGER) : kbq_query_run.ZERO_INTEGER, one_line_comment });
                streams_high.force_output((SubLObject)kbq_query_run.T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            kbq_run = cdolist_list_var.first();
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 187492L)
    public static SubLObject kct_run_support_set(final SubLObject kct_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kct_result = kct_load_test_set_run(kct_filename);
        final SubLObject result_set = set.new_set(Symbols.symbol_function((SubLObject)kbq_query_run.EQL), (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject list_var;
        final SubLObject test_runs = list_var = conses_high.getf(kct_result, (SubLObject)kbq_query_run.$kw83$TEST_RUNS, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((kbq_query_run.NIL != PrintLow.format((SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$str547$Running__A_queries_using__proof_s, Sequences.length(test_runs))) ? PrintLow.format((SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$str547$Running__A_queries_using__proof_s, Sequences.length(test_runs)) : kbq_query_run.$str170$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbq_query_run.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbq_query_run.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject test_run = (SubLObject)kbq_query_run.NIL;
                test_run = csome_list_var.first();
                while (kbq_query_run.NIL != csome_list_var) {
                    final SubLObject query_run = conses_high.getf(test_run, (SubLObject)kbq_query_run.$kw71$QUERY_RUN, (SubLObject)kbq_query_run.UNPROVIDED);
                    final SubLObject query = conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw16$QUERY, (SubLObject)kbq_query_run.UNPROVIDED);
                    final SubLObject proof_spec = conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw65$INFERENCE_PROOF_SPEC, (SubLObject)kbq_query_run.UNPROVIDED);
                    SubLObject overriding_query_properties = (SubLObject)kbq_query_run.NIL;
                    final SubLObject _prev_bind_0_$86 = control_vars.$kbq_run_query_non_continuable_enabledP$.currentBinding(thread);
                    try {
                        control_vars.$kbq_run_query_non_continuable_enabledP$.bind((SubLObject)kbq_query_run.NIL, thread);
                        if (kbq_query_run.NIL != proof_spec) {
                            overriding_query_properties = conses_high.putf(overriding_query_properties, (SubLObject)kbq_query_run.$kw548$PROOF_SPEC, proof_spec);
                        }
                        overriding_query_properties = conses_high.putf(overriding_query_properties, (SubLObject)kbq_query_run.$kw549$COMPUTE_ANSWER_JUSTIFICATIONS_, (SubLObject)kbq_query_run.T);
                        overriding_query_properties = conses_high.putf(overriding_query_properties, (SubLObject)kbq_query_run.$kw117$CONTINUABLE_, (SubLObject)kbq_query_run.T);
                        thread.resetMultipleValues();
                        final SubLObject inference = kbq_run_query_and_maybe_destroy(query, (SubLObject)kbq_query_run.NIL, kbq_query_run.$kbq_outlier_timeout$.getDynamicValue(thread), overriding_query_properties, (SubLObject)kbq_query_run.UNPROVIDED);
                        final SubLObject never_runP = thread.secondMultipleValue();
                        final SubLObject timed_outP = thread.thirdMultipleValue();
                        final SubLObject result = thread.fourthMultipleValue();
                        final SubLObject halt_reason = thread.fifthMultipleValue();
                        final SubLObject metric_values = thread.sixthMultipleValue();
                        thread.resetMultipleValues();
                        if (kbq_query_run.NIL != inference) {
                            SubLObject cdolist_list_var = inference_utilities.inference_expanded_justification(inference);
                            SubLObject support = (SubLObject)kbq_query_run.NIL;
                            support = cdolist_list_var.first();
                            while (kbq_query_run.NIL != cdolist_list_var) {
                                set.set_add(support, result_set);
                                cdolist_list_var = cdolist_list_var.rest();
                                support = cdolist_list_var.first();
                            }
                        }
                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                    }
                    finally {
                        control_vars.$kbq_run_query_non_continuable_enabledP$.rebind(_prev_bind_0_$86, thread);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kbq_query_run.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    test_run = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
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
        return result_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 189078L)
    public static SubLObject kct_run_supports_report(final SubLObject kct_filename, SubLObject stream) {
        if (stream == kbq_query_run.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kct_result = kct_load_test_set_run(kct_filename);
        final SubLObject list_var;
        final SubLObject test_runs = list_var = conses_high.getf(kct_result, (SubLObject)kbq_query_run.$kw83$TEST_RUNS, (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((kbq_query_run.NIL != PrintLow.format((SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$str547$Running__A_queries_using__proof_s, Sequences.length(test_runs))) ? PrintLow.format((SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.$str547$Running__A_queries_using__proof_s, Sequences.length(test_runs)) : kbq_query_run.$str170$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbq_query_run.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbq_query_run.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbq_query_run.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject test_run = (SubLObject)kbq_query_run.NIL;
                test_run = csome_list_var.first();
                while (kbq_query_run.NIL != csome_list_var) {
                    final SubLObject test = conses_high.getf(test_run, (SubLObject)kbq_query_run.$kw69$TEST, (SubLObject)kbq_query_run.UNPROVIDED);
                    final SubLObject query_run = conses_high.getf(test_run, (SubLObject)kbq_query_run.$kw71$QUERY_RUN, (SubLObject)kbq_query_run.UNPROVIDED);
                    final SubLObject query = conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw16$QUERY, (SubLObject)kbq_query_run.UNPROVIDED);
                    final SubLObject proof_spec = conses_high.getf(query_run, (SubLObject)kbq_query_run.$kw65$INFERENCE_PROOF_SPEC, (SubLObject)kbq_query_run.UNPROVIDED);
                    SubLObject overriding_query_properties = (SubLObject)kbq_query_run.NIL;
                    final SubLObject _prev_bind_0_$88 = control_vars.$kbq_run_query_non_continuable_enabledP$.currentBinding(thread);
                    try {
                        control_vars.$kbq_run_query_non_continuable_enabledP$.bind((SubLObject)kbq_query_run.NIL, thread);
                        if (kbq_query_run.NIL != proof_spec) {
                            overriding_query_properties = conses_high.putf(overriding_query_properties, (SubLObject)kbq_query_run.$kw548$PROOF_SPEC, proof_spec);
                        }
                        overriding_query_properties = conses_high.putf(overriding_query_properties, (SubLObject)kbq_query_run.$kw549$COMPUTE_ANSWER_JUSTIFICATIONS_, (SubLObject)kbq_query_run.T);
                        overriding_query_properties = conses_high.putf(overriding_query_properties, (SubLObject)kbq_query_run.$kw117$CONTINUABLE_, (SubLObject)kbq_query_run.T);
                        thread.resetMultipleValues();
                        final SubLObject inference = kbq_run_query_and_maybe_destroy(query, (SubLObject)kbq_query_run.NIL, kbq_query_run.$kbq_outlier_timeout$.getDynamicValue(thread), overriding_query_properties, (SubLObject)kbq_query_run.UNPROVIDED);
                        final SubLObject never_runP = thread.secondMultipleValue();
                        final SubLObject timed_outP = thread.thirdMultipleValue();
                        final SubLObject result = thread.fourthMultipleValue();
                        final SubLObject halt_reason = thread.fifthMultipleValue();
                        final SubLObject metric_values = thread.sixthMultipleValue();
                        thread.resetMultipleValues();
                        if (kbq_query_run.NIL == inference) {}
                        if (kbq_query_run.NIL != inference && !inference_datastructures_inference.inference_answer_count(inference).isZero()) {
                            PrintLow.format(stream, (SubLObject)kbq_query_run.$str550$______Test___A, kb_utilities.pretty_print_cycl_to_string(test, (SubLObject)kbq_query_run.UNPROVIDED));
                            PrintLow.format(stream, (SubLObject)kbq_query_run.$str551$__Query___A, kb_utilities.pretty_print_cycl_to_string(kb_query.kbq_sentence(query), (SubLObject)kbq_query_run.UNPROVIDED));
                            final SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
                            SubLObject answer_number = (SubLObject)kbq_query_run.ONE_INTEGER;
                            final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                            if (kbq_query_run.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)kbq_query_run.$kw213$SKIP)) {
                                final SubLObject idx_$89 = idx;
                                if (kbq_query_run.NIL == id_index.id_index_dense_objects_empty_p(idx_$89, (SubLObject)kbq_query_run.$kw213$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$89);
                                    final SubLObject backwardP_var = (SubLObject)kbq_query_run.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject v_answer;
                                    SubLObject answer_values;
                                    SubLObject v_answer_$90;
                                    SubLObject supports;
                                    SubLObject support_mts;
                                    SubLObject cdolist_list_var;
                                    SubLObject support_mt;
                                    SubLObject cdolist_list_var_$91;
                                    SubLObject support;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbq_query_run.NIL, v_iteration = (SubLObject)kbq_query_run.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbq_query_run.ONE_INTEGER)) {
                                        id = ((kbq_query_run.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbq_query_run.ONE_INTEGER) : v_iteration);
                                        v_answer = Vectors.aref(vector_var, id);
                                        if (kbq_query_run.NIL == id_index.id_index_tombstone_p(v_answer) || kbq_query_run.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbq_query_run.$kw213$SKIP)) {
                                            if (kbq_query_run.NIL != id_index.id_index_tombstone_p(v_answer)) {
                                                v_answer = (SubLObject)kbq_query_run.$kw213$SKIP;
                                            }
                                            answer_values = bindings.bindings_values(inference_datastructures_inference.inference_answer_bindings(v_answer));
                                            v_answer_$90 = ((kbq_query_run.NIL != list_utilities.singletonP(answer_values)) ? answer_values.first() : ((kbq_query_run.NIL != answer_values) ? answer_values : kbq_query_run.$const552$True));
                                            PrintLow.format(stream, (SubLObject)kbq_query_run.$str553$____Answer___A__A____A, new SubLObject[] { answer_number, answer_count, kb_utilities.pretty_print_cycl_to_string(v_answer_$90, (SubLObject)kbq_query_run.UNPROVIDED) });
                                            PrintLow.format(stream, (SubLObject)kbq_query_run.$str554$__Justification__);
                                            supports = inference_utilities.inference_answer_expanded_justification(v_answer);
                                            supports = Sequences.remove_if((SubLObject)kbq_query_run.$sym555$UNKNOWN_SENTENCE_SUPPORT_P, supports, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
                                            support_mts = Sort.sort(list_utilities.fast_remove_duplicates(Mapping.mapcar((SubLObject)kbq_query_run.$sym556$SUPPORT_MT, supports), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED), (SubLObject)kbq_query_run.$sym557$GENERALITY_ESTIMATE_, (SubLObject)kbq_query_run.UNPROVIDED);
                                            support_mts = (cdolist_list_var = Sequences.remove(kbq_query_run.$const558$UniversalVocabularyMt, support_mts, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED));
                                            support_mt = (SubLObject)kbq_query_run.NIL;
                                            support_mt = cdolist_list_var.first();
                                            while (kbq_query_run.NIL != cdolist_list_var) {
                                                PrintLow.format(stream, (SubLObject)kbq_query_run.$str559$___Mt___A, kb_utilities.pretty_print_cycl_to_string(support_mt, (SubLObject)kbq_query_run.UNPROVIDED));
                                                cdolist_list_var_$91 = supports;
                                                support = (SubLObject)kbq_query_run.NIL;
                                                support = cdolist_list_var_$91.first();
                                                while (kbq_query_run.NIL != cdolist_list_var_$91) {
                                                    if (kbq_query_run.NIL != kb_utilities.kbeq(support_mt, arguments.support_mt(support)) || (kbq_query_run.NIL != kb_utilities.kbeq(arguments.support_mt(support), kbq_query_run.$const558$UniversalVocabularyMt) && kbq_query_run.NIL != kb_utilities.kbeq(support_mt, kbq_query_run.$const560$BaseKB))) {
                                                        PrintLow.format(stream, (SubLObject)kbq_query_run.$str195$_A, kb_utilities.pretty_print_cycl_to_string(arguments.support_el_sentence(support), (SubLObject)kbq_query_run.ONE_INTEGER));
                                                    }
                                                    cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                    support = cdolist_list_var_$91.first();
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                support_mt = cdolist_list_var.first();
                                            }
                                            answer_number = Numbers.add(answer_number, (SubLObject)kbq_query_run.ONE_INTEGER);
                                        }
                                    }
                                }
                                final SubLObject idx_$90 = idx;
                                if (kbq_query_run.NIL == id_index.id_index_sparse_objects_empty_p(idx_$90)) {
                                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$90);
                                    SubLObject id2 = (SubLObject)kbq_query_run.NIL;
                                    SubLObject v_answer2 = (SubLObject)kbq_query_run.NIL;
                                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                    try {
                                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                            id2 = Hashtables.getEntryKey(cdohash_entry);
                                            v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                                            final SubLObject answer_values2 = bindings.bindings_values(inference_datastructures_inference.inference_answer_bindings(v_answer2));
                                            final SubLObject v_answer_$91 = (kbq_query_run.NIL != list_utilities.singletonP(answer_values2)) ? answer_values2.first() : ((kbq_query_run.NIL != answer_values2) ? answer_values2 : kbq_query_run.$const552$True);
                                            PrintLow.format(stream, (SubLObject)kbq_query_run.$str553$____Answer___A__A____A, new SubLObject[] { answer_number, answer_count, kb_utilities.pretty_print_cycl_to_string(v_answer_$91, (SubLObject)kbq_query_run.UNPROVIDED) });
                                            PrintLow.format(stream, (SubLObject)kbq_query_run.$str554$__Justification__);
                                            SubLObject supports2 = inference_utilities.inference_answer_expanded_justification(v_answer2);
                                            supports2 = Sequences.remove_if((SubLObject)kbq_query_run.$sym555$UNKNOWN_SENTENCE_SUPPORT_P, supports2, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
                                            SubLObject support_mts2 = Sort.sort(list_utilities.fast_remove_duplicates(Mapping.mapcar((SubLObject)kbq_query_run.$sym556$SUPPORT_MT, supports2), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED), (SubLObject)kbq_query_run.$sym557$GENERALITY_ESTIMATE_, (SubLObject)kbq_query_run.UNPROVIDED);
                                            SubLObject cdolist_list_var2;
                                            support_mts2 = (cdolist_list_var2 = Sequences.remove(kbq_query_run.$const558$UniversalVocabularyMt, support_mts2, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED));
                                            SubLObject support_mt2 = (SubLObject)kbq_query_run.NIL;
                                            support_mt2 = cdolist_list_var2.first();
                                            while (kbq_query_run.NIL != cdolist_list_var2) {
                                                PrintLow.format(stream, (SubLObject)kbq_query_run.$str559$___Mt___A, kb_utilities.pretty_print_cycl_to_string(support_mt2, (SubLObject)kbq_query_run.UNPROVIDED));
                                                SubLObject cdolist_list_var_$92 = supports2;
                                                SubLObject support2 = (SubLObject)kbq_query_run.NIL;
                                                support2 = cdolist_list_var_$92.first();
                                                while (kbq_query_run.NIL != cdolist_list_var_$92) {
                                                    if (kbq_query_run.NIL != kb_utilities.kbeq(support_mt2, arguments.support_mt(support2)) || (kbq_query_run.NIL != kb_utilities.kbeq(arguments.support_mt(support2), kbq_query_run.$const558$UniversalVocabularyMt) && kbq_query_run.NIL != kb_utilities.kbeq(support_mt2, kbq_query_run.$const560$BaseKB))) {
                                                        PrintLow.format(stream, (SubLObject)kbq_query_run.$str195$_A, kb_utilities.pretty_print_cycl_to_string(arguments.support_el_sentence(support2), (SubLObject)kbq_query_run.ONE_INTEGER));
                                                    }
                                                    cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                                    support2 = cdolist_list_var_$92.first();
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                support_mt2 = cdolist_list_var2.first();
                                            }
                                            answer_number = Numbers.add(answer_number, (SubLObject)kbq_query_run.ONE_INTEGER);
                                        }
                                    }
                                    finally {
                                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                            inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                        }
                    }
                    finally {
                        control_vars.$kbq_run_query_non_continuable_enabledP$.rebind(_prev_bind_0_$88, thread);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kbq_query_run.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    test_run = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$89 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
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
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192115L)
    public static SubLObject unknown_sentence_support_p(final SubLObject support) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbq_query_run.NIL != arguments.hl_support_p(support) && kbq_query_run.NIL != el_utilities.el_formula_with_operator_p(arguments.support_el_sentence(support), kbq_query_run.$const561$unknownSentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192293L)
    public static SubLObject kcts_using_only_these_sksi_sources(final SubLObject v_sources) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kcts = (SubLObject)kbq_query_run.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbq_query_run.$sym562$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbq_query_run.$const176$EverythingPSC, thread);
            final SubLObject node_var = kbq_query_run.$const563$SKSIContentTest;
            final SubLObject _prev_bind_0_$96 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$97 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kbq_query_run.$const179$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$98 = node_var;
                    final SubLObject deck_type = (SubLObject)kbq_query_run.$kw566$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$97 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)kbq_query_run.NIL;
                            final SubLObject _prev_bind_0_$98 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$98 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((kbq_query_run.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kbq_query_run.NIL != tv_var) ? kbq_query_run.$sym567$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (kbq_query_run.NIL != tv_var && kbq_query_run.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kbq_query_run.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)kbq_query_run.$kw2$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)kbq_query_run.ONE_INTEGER, (SubLObject)kbq_query_run.$str568$_A_is_not_a__A, tv_var, (SubLObject)kbq_query_run.$sym569$SBHL_TRUE_TV_P, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kbq_query_run.$kw570$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)kbq_query_run.ONE_INTEGER, (SubLObject)kbq_query_run.$str571$continue_anyway, (SubLObject)kbq_query_run.$str568$_A_is_not_a__A, tv_var, (SubLObject)kbq_query_run.$sym569$SBHL_TRUE_TV_P, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kbq_query_run.$kw572$WARN)) {
                                        Errors.warn((SubLObject)kbq_query_run.$str568$_A_is_not_a__A, tv_var, (SubLObject)kbq_query_run.$sym569$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)kbq_query_run.$str573$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)kbq_query_run.$str571$continue_anyway, (SubLObject)kbq_query_run.$str568$_A_is_not_a__A, tv_var, (SubLObject)kbq_query_run.$sym569$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$99 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$99 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbq_query_run.$const179$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbq_query_run.$const179$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbq_query_run.$const179$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbq_query_run.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbq_query_run.$const179$isa)), thread);
                                    if (kbq_query_run.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kbq_query_run.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)kbq_query_run.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$100 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$100 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbq_query_run.$const179$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbq_query_run.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$98, (SubLObject)kbq_query_run.UNPROVIDED);
                                            while (kbq_query_run.NIL != node_var_$98) {
                                                final SubLObject tt_node_var = node_var_$98;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kbq_query_run.$const179$isa));
                                                SubLObject module_var = (SubLObject)kbq_query_run.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (kbq_query_run.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$101 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$101 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbq_query_run.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbq_query_run.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (kbq_query_run.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbq_query_run.UNPROVIDED));
                                                            if (kbq_query_run.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbq_query_run.$const179$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)kbq_query_run.UNPROVIDED));
                                                                if (kbq_query_run.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbq_query_run.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kbq_query_run.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$102 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$110;
                                                                                for (iteration_state_$110 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbq_query_run.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$110); iteration_state_$110 = dictionary_contents.do_dictionary_contents_next(iteration_state_$110)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$110);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbq_query_run.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$103 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (kbq_query_run.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject kct;
                                                                                                SubLObject query;
                                                                                                SubLObject required_sources;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbq_query_run.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbq_query_run.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    kct = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (kbq_query_run.NIL != set_contents.do_set_contents_element_validP(state, kct) && kbq_query_run.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(kct, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        query = kct_utils.kct_query_specification(kct, (SubLObject)kbq_query_run.UNPROVIDED);
                                                                                                        required_sources = (SubLObject)((kbq_query_run.NIL != query) ? kb_mapping_utilities.pred_values(query, kbq_query_run.$const141$sksiModulesNeeded, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                                                                                                        if (kbq_query_run.NIL != conses_high.subsetp(required_sources, v_sources, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                                                                            kcts = (SubLObject)ConsesLow.cons(kct, kcts);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject kct2 = (SubLObject)kbq_query_run.NIL;
                                                                                                kct2 = csome_list_var.first();
                                                                                                while (kbq_query_run.NIL != csome_list_var) {
                                                                                                    if (kbq_query_run.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(kct2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        final SubLObject query2 = kct_utils.kct_query_specification(kct2, (SubLObject)kbq_query_run.UNPROVIDED);
                                                                                                        final SubLObject required_sources2 = (SubLObject)((kbq_query_run.NIL != query2) ? kb_mapping_utilities.pred_values(query2, kbq_query_run.$const141$sksiModulesNeeded, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                                                                                                        if (kbq_query_run.NIL != conses_high.subsetp(required_sources2, v_sources, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                                                                            kcts = (SubLObject)ConsesLow.cons(kct2, kcts);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    kct2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kbq_query_run.$str574$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$103, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$110);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$102, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kbq_query_run.FIVE_INTEGER, (SubLObject)kbq_query_run.$str575$attempting_to_bind_direction_link, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
                                                            }
                                                            if (kbq_query_run.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbq_query_run.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)kbq_query_run.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (kbq_query_run.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)kbq_query_run.NIL;
                                                                    SubLObject mt2 = (SubLObject)kbq_query_run.NIL;
                                                                    SubLObject tv2 = (SubLObject)kbq_query_run.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list576);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list576);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbq_query_run.$list576);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (kbq_query_run.NIL == current) {
                                                                        if (kbq_query_run.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$104 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (kbq_query_run.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$105 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (kbq_query_run.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject kct;
                                                                                            SubLObject query;
                                                                                            SubLObject required_sources;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbq_query_run.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbq_query_run.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                kct = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (kbq_query_run.NIL != set_contents.do_set_contents_element_validP(state, kct) && kbq_query_run.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(kct, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    query = kct_utils.kct_query_specification(kct, (SubLObject)kbq_query_run.UNPROVIDED);
                                                                                                    required_sources = (SubLObject)((kbq_query_run.NIL != query) ? kb_mapping_utilities.pred_values(query, kbq_query_run.$const141$sksiModulesNeeded, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                                                                                                    if (kbq_query_run.NIL != conses_high.subsetp(required_sources, v_sources, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                                                                        kcts = (SubLObject)ConsesLow.cons(kct, kcts);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$114 = sol;
                                                                                            SubLObject kct2 = (SubLObject)kbq_query_run.NIL;
                                                                                            kct2 = csome_list_var_$114.first();
                                                                                            while (kbq_query_run.NIL != csome_list_var_$114) {
                                                                                                if (kbq_query_run.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(kct2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    final SubLObject query2 = kct_utils.kct_query_specification(kct2, (SubLObject)kbq_query_run.UNPROVIDED);
                                                                                                    final SubLObject required_sources2 = (SubLObject)((kbq_query_run.NIL != query2) ? kb_mapping_utilities.pred_values(query2, kbq_query_run.$const141$sksiModulesNeeded, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                                                                                                    if (kbq_query_run.NIL != conses_high.subsetp(required_sources2, v_sources, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                                                                        kcts = (SubLObject)ConsesLow.cons(kct2, kcts);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$114 = csome_list_var_$114.rest();
                                                                                                kct2 = csome_list_var_$114.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kbq_query_run.$str574$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$105, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$104, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbq_query_run.$list576);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (kbq_query_run.NIL != obsolete.cnat_p(node, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$115;
                                                            final SubLObject new_list = cdolist_list_var_$115 = ((kbq_query_run.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbq_query_run.$const179$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbq_query_run.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbq_query_run.$const179$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbq_query_run.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)kbq_query_run.NIL;
                                                            generating_fn = cdolist_list_var_$115.first();
                                                            while (kbq_query_run.NIL != cdolist_list_var_$115) {
                                                                final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (kbq_query_run.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject kct3;
                                                                        SubLObject query3;
                                                                        SubLObject required_sources3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kbq_query_run.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kbq_query_run.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            kct3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (kbq_query_run.NIL != set_contents.do_set_contents_element_validP(state2, kct3) && kbq_query_run.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(kct3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                query3 = kct_utils.kct_query_specification(kct3, (SubLObject)kbq_query_run.UNPROVIDED);
                                                                                required_sources3 = (SubLObject)((kbq_query_run.NIL != query3) ? kb_mapping_utilities.pred_values(query3, kbq_query_run.$const141$sksiModulesNeeded, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                                                                                if (kbq_query_run.NIL != conses_high.subsetp(required_sources3, v_sources, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                                                    kcts = (SubLObject)ConsesLow.cons(kct3, kcts);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject kct4 = (SubLObject)kbq_query_run.NIL;
                                                                        kct4 = csome_list_var3.first();
                                                                        while (kbq_query_run.NIL != csome_list_var3) {
                                                                            if (kbq_query_run.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(kct4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                final SubLObject query4 = kct_utils.kct_query_specification(kct4, (SubLObject)kbq_query_run.UNPROVIDED);
                                                                                final SubLObject required_sources4 = (SubLObject)((kbq_query_run.NIL != query4) ? kb_mapping_utilities.pred_values(query4, kbq_query_run.$const141$sksiModulesNeeded, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED) : kbq_query_run.NIL);
                                                                                if (kbq_query_run.NIL != conses_high.subsetp(required_sources4, v_sources, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                                                    kcts = (SubLObject)ConsesLow.cons(kct4, kcts);
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            kct4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kbq_query_run.$str574$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$106, thread);
                                                                }
                                                                cdolist_list_var_$115 = cdolist_list_var_$115.rest();
                                                                generating_fn = cdolist_list_var_$115.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$101, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$101, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbq_query_run.$const179$isa)));
                                                SubLObject module_var2 = (SubLObject)kbq_query_run.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (kbq_query_run.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$107 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$102 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbq_query_run.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbq_query_run.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$98);
                                                        if (kbq_query_run.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)kbq_query_run.UNPROVIDED));
                                                            if (kbq_query_run.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kbq_query_run.UNPROVIDED));
                                                                if (kbq_query_run.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kbq_query_run.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kbq_query_run.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$108 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$111;
                                                                                for (iteration_state_$111 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kbq_query_run.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$111); iteration_state_$111 = dictionary_contents.do_dictionary_contents_next(iteration_state_$111)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$111);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbq_query_run.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$109 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (kbq_query_run.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)kbq_query_run.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); kbq_query_run.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (kbq_query_run.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && kbq_query_run.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kbq_query_run.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)kbq_query_run.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (kbq_query_run.NIL != csome_list_var4) {
                                                                                                    if (kbq_query_run.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kbq_query_run.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kbq_query_run.$str574$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$109, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$111);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$108, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kbq_query_run.FIVE_INTEGER, (SubLObject)kbq_query_run.$str575$attempting_to_bind_direction_link, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (kbq_query_run.NIL != obsolete.cnat_p(node2, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$116;
                                                            final SubLObject new_list2 = cdolist_list_var_$116 = ((kbq_query_run.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbq_query_run.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbq_query_run.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)kbq_query_run.NIL;
                                                            generating_fn2 = cdolist_list_var_$116.first();
                                                            while (kbq_query_run.NIL != cdolist_list_var_$116) {
                                                                final SubLObject _prev_bind_0_$110 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (kbq_query_run.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)kbq_query_run.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); kbq_query_run.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (kbq_query_run.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && kbq_query_run.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kbq_query_run.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)kbq_query_run.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (kbq_query_run.NIL != csome_list_var5) {
                                                                            if (kbq_query_run.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kbq_query_run.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kbq_query_run.$str574$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$110, thread);
                                                                }
                                                                cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                                                                generating_fn2 = cdolist_list_var_$116.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$102, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$107, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$98 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$106, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$100, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$100, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)kbq_query_run.TWO_INTEGER, (SubLObject)kbq_query_run.$str577$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kbq_query_run.UNPROVIDED)), (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$99, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$99, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$98, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$98, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$111 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$97, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$97, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$96, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(kcts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192293L)
    public static SubLObject kcts_for_sksi_source(SubLObject source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kcts = (SubLObject)kbq_query_run.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbq_query_run.$sym562$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbq_query_run.$const176$EverythingPSC, thread);
            final SubLObject pred_var = kbq_query_run.$const141$sksiModulesNeeded;
            if (kbq_query_run.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, (SubLObject)kbq_query_run.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, (SubLObject)kbq_query_run.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)kbq_query_run.NIL;
                final SubLObject token_var = (SubLObject)kbq_query_run.NIL;
                while (kbq_query_run.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (kbq_query_run.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)kbq_query_run.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kbq_query_run.$kw578$GAF, (SubLObject)kbq_query_run.NIL, (SubLObject)kbq_query_run.NIL);
                            SubLObject done_var_$126 = (SubLObject)kbq_query_run.NIL;
                            final SubLObject token_var_$127 = (SubLObject)kbq_query_run.NIL;
                            while (kbq_query_run.NIL == done_var_$126) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$127);
                                final SubLObject valid_$128 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$127.eql(gaf));
                                if (kbq_query_run.NIL != valid_$128) {
                                    final SubLObject query_spec = assertions_high.gaf_arg1(gaf);
                                    SubLObject cdolist_list_var = kct_utils.query_specification_kcts(query_spec, (SubLObject)kbq_query_run.UNPROVIDED);
                                    SubLObject kct = (SubLObject)kbq_query_run.NIL;
                                    kct = cdolist_list_var.first();
                                    while (kbq_query_run.NIL != cdolist_list_var) {
                                        if (kbq_query_run.NIL != isa.isaP(kct, kbq_query_run.$const563$SKSIContentTest, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED)) {
                                            kcts = (SubLObject)ConsesLow.cons(kct, kcts);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        kct = cdolist_list_var.first();
                                    }
                                }
                                done_var_$126 = (SubLObject)SubLObjectFactory.makeBoolean(kbq_query_run.NIL == valid_$128);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbq_query_run.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (kbq_query_run.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbq_query_run.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(kcts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192293L)
    public static SubLObject succeeding_kcts_for_sksi_source(final SubLObject test_set_run, SubLObject source) {
        return kct_test_set_run_tests(kct_succeeding_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), (SubLObject)kbq_query_run.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192293L)
    public static SubLObject failing_kcts_for_sksi_source(final SubLObject test_set_run, SubLObject source) {
        return kct_test_set_run_tests(kct_failing_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), (SubLObject)kbq_query_run.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192293L)
    public static SubLObject answerable_kcts_for_sksi_source(final SubLObject test_set_run, SubLObject source) {
        return kct_test_set_run_tests(kct_answerable_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), (SubLObject)kbq_query_run.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192293L)
    public static SubLObject unanswerable_kcts_for_sksi_source(final SubLObject test_set_run, SubLObject source) {
        return kct_test_set_run_tests(kct_unanswerable_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), (SubLObject)kbq_query_run.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192293L)
    public static SubLObject erroring_kcts_for_sksi_source(final SubLObject test_set_run, SubLObject source) {
        return kct_test_set_run_tests(kct_erroring_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), (SubLObject)kbq_query_run.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192293L)
    public static SubLObject show_errors_for_sksi_source(final SubLObject test_set_run, SubLObject source) {
        SubLObject cdolist_list_var = kct_test_set_run_test_runs(kct_erroring_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), (SubLObject)kbq_query_run.UNPROVIDED)));
        SubLObject test_run = (SubLObject)kbq_query_run.NIL;
        test_run = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str579$_a___s____, kct_test_run_test(test_run), kbq_query_run_halt_reason(kct_test_run_query_run(test_run)));
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192293L)
    public static SubLObject analyze_sksi_test_set_run(final SubLObject test_set_run, final SubLObject sksi_sources_we_care_about) {
        PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str580$__________Overview___________All_);
        list_utilities.pretty_print_plist(kct_analyze_test_set_run(test_set_run, (SubLObject)kbq_query_run.UNPROVIDED), (SubLObject)kbq_query_run.UNPROVIDED);
        PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str581$__All___SKSIContentTests_marked_a);
        final SubLObject regression_test_set_run = kct_regression_test_set_run(test_set_run);
        list_utilities.pretty_print_plist(kct_analyze_test_set_run(regression_test_set_run, (SubLObject)kbq_query_run.UNPROVIDED), (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject care_test_set_run = kct_filter_test_set_run_to_tests(test_set_run, kcts_using_only_these_sksi_sources(sksi_sources_we_care_about), (SubLObject)kbq_query_run.UNPROVIDED);
        PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str582$____SKSIContentTests_using_source, sksi_sources_we_care_about);
        list_utilities.pretty_print_plist(kct_analyze_test_set_run(care_test_set_run, (SubLObject)kbq_query_run.UNPROVIDED), (SubLObject)kbq_query_run.UNPROVIDED);
        final SubLObject regression_care_test_set_run = kct_regression_test_set_run(care_test_set_run);
        PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str583$____SKSIContentTests_marked_as___);
        list_utilities.pretty_print_plist(kct_analyze_test_set_run(regression_care_test_set_run, (SubLObject)kbq_query_run.UNPROVIDED), (SubLObject)kbq_query_run.UNPROVIDED);
        PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str584$______________________Breakdown_b);
        SubLObject cdolist_list_var = sksi_sources_we_care_about;
        SubLObject source = (SubLObject)kbq_query_run.NIL;
        source = cdolist_list_var.first();
        while (kbq_query_run.NIL != cdolist_list_var) {
            final SubLObject source_test_set_run = kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), (SubLObject)kbq_query_run.UNPROVIDED);
            final SubLObject analysis = trim_analysis_if_zero(kct_analyze_test_set_run(source_test_set_run, inference_datastructures_enumerated_types.all_arete_query_metrics()));
            final SubLObject regression_source_test_set_run = kct_filter_test_set_run_by_test(source_test_set_run, (SubLObject)kbq_query_run.$str244$Filtered_to___KBContentRegression, (SubLObject)kbq_query_run.$sym243$KB_CONTENT_REGRESSION_TEST_, (SubLObject)kbq_query_run.$sym110$KCT_TEST_RUN_TEST);
            final SubLObject regression_tests_analysis = trim_analysis_if_zero(kct_analyze_test_set_run(regression_source_test_set_run, inference_datastructures_enumerated_types.all_arete_query_metrics()));
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str585$_a__, source);
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Sequences.length(string_utilities.str(source)), i = (SubLObject)kbq_query_run.NIL, i = (SubLObject)kbq_query_run.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)kbq_query_run.ONE_INTEGER)) {
                PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str586$_);
            }
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str587$______SKSIContentTests_that_use__, source);
            list_utilities.pretty_print_plist(analysis, (SubLObject)kbq_query_run.UNPROVIDED);
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str588$____SKSIContentTests_marked_as___, source);
            list_utilities.pretty_print_plist(regression_tests_analysis, (SubLObject)kbq_query_run.UNPROVIDED);
            PrintLow.format((SubLObject)kbq_query_run.T, (SubLObject)kbq_query_run.$str589$__Failure_analysis_______);
            cdolist_list_var = cdolist_list_var.rest();
            source = cdolist_list_var.first();
        }
        return (SubLObject)kbq_query_run.NIL;
    }
    
    public static SubLObject declare_kbq_query_run_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_success_result_p", "KCT-SUCCESS-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_failure_result_p", "KCT-FAILURE-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_error_result_p", "KCT-ERROR-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_cfasl_common_symbols", "KBQ-CFASL-COMMON-SYMBOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_cfasl_common_symbols_simple", "KBQ-CFASL-COMMON-SYMBOLS-SIMPLE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.kbq_query_run", "with_kbq_query_set_run", "WITH-KBQ-QUERY-SET-RUN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_p", "KBQ-QUERY-RUN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_discard_query_run_result", "KBQ-DISCARD-QUERY-RUN-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_discard_query_run_properties", "KBQ-DISCARD-QUERY-RUN-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_query", "KBQ-QUERY-RUN-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_result", "KBQ-QUERY-RUN-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_extract_query_run_metric_value", "KBQ-EXTRACT-QUERY-RUN-METRIC-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_answerableP", "KBQ-QUERY-RUN-ANSWERABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_unanswerableP", "KBQ-QUERY-RUN-UNANSWERABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_answer_count", "KBQ-QUERY-RUN-ANSWER-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_hypothesization_time", "KBQ-QUERY-RUN-HYPOTHESIZATION-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time", "KBQ-QUERY-RUN-TOTAL-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_complete_total_time", "KBQ-QUERY-RUN-COMPLETE-TOTAL-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_time_to_first_answer", "KBQ-QUERY-RUN-TIME-TO-FIRST-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_time_to_last_answer", "KBQ-QUERY-RUN-TIME-TO-LAST-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_complete_time_to_first_answer", "KBQ-QUERY-RUN-COMPLETE-TIME-TO-FIRST-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_complete_time_to_last_answer", "KBQ-QUERY-RUN-COMPLETE-TIME-TO-LAST-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_steps", "KBQ-QUERY-RUN-TOTAL-STEPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_steps_to_first_answer", "KBQ-QUERY-RUN-STEPS-TO-FIRST-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_steps_to_last_answer", "KBQ-QUERY-RUN-STEPS-TO-LAST-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_extract_query_run_property_value", "KBQ-EXTRACT-QUERY-RUN-PROPERTY-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_property_value", "KBQ-QUERY-RUN-PROPERTY-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_internal_real_time_to_seconds", "KBQ-INTERNAL-REAL-TIME-TO-SECONDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_seconds_to_internal_real_time", "KBQ-SECONDS-TO-INTERNAL-REAL-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_halt_reason", "KBQ-QUERY-RUN-HALT-REASON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_timed_outP", "KBQ-QUERY-RUN-TIMED-OUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_tautologyP", "KBQ-QUERY-RUN-TAUTOLOGY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_less_than_1000_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-1000-SECONDS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_less_than_100_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-100-SECONDS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_less_than_10_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-10-SECONDS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_less_than_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-A-SECOND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_less_than_a_tenth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-A-TENTH-OF-A-SECOND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_less_than_a_hundredth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-A-HUNDREDTH-OF-A-SECOND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_more_than_1000_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-1000-SECONDS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_more_than_100_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-100-SECONDS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_more_than_10_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-10-SECONDS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_more_than_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-A-SECOND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_more_than_a_tenth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-A-TENTH-OF-A-SECOND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_total_time_more_than_a_hundredth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-A-HUNDREDTH-OF-A-SECOND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_more_than_1000_answersP", "KBQ-QUERY-RUN-MORE-THAN-1000-ANSWERS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_run_inference_proof_spec_cons_count", "KBQ-QUERY-RUN-INFERENCE-PROOF-SPEC-CONS-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_sentence_truth_query_runP", "KBQ-SENTENCE-TRUTH-QUERY-RUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "compute_new_root_relative_answer_times", "COMPUTE-NEW-ROOT-RELATIVE-ANSWER-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_run_p", "KCT-TEST-RUN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_make_test_run", "KCT-MAKE-TEST-RUN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_run_test", "KCT-TEST-RUN-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_run_query_run", "KCT-TEST-RUN-QUERY-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_run_status", "KCT-TEST-RUN-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_run_answer_count", "KCT-TEST-RUN-ANSWER-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_p", "KBQ-QUERY-SET-RUN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_make_query_set_run", "KBQ-MAKE-QUERY-SET-RUN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_nmerge_query_set_runs", "KBQ-NMERGE-QUERY-SET-RUNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_discard_query_set_run_results", "KBQ-DISCARD-QUERY-SET-RUN-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_discard_query_set_run_properties", "KBQ-DISCARD-QUERY-SET-RUN-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_make_query_set_run_from_test_set_run", "KBQ-MAKE-QUERY-SET-RUN-FROM-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_property_value", "KBQ-QUERY-SET-RUN-PROPERTY-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_comment", "KBQ-QUERY-SET-RUN-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_query_runs", "KBQ-QUERY-SET-RUN-QUERY-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_patch_level", "KBQ-QUERY-SET-RUN-PATCH-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_internal_time_units_per_second", "KBQ-QUERY-SET-RUN-INTERNAL-TIME-UNITS-PER-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_put_query_run_property", "KBQ-QUERY-SET-RUN-PUT-QUERY-RUN-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_extract_query_property_values", "KBQ-EXTRACT-QUERY-PROPERTY-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_extract_metric_values", "KBQ-EXTRACT-METRIC-VALUES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_extract_property_values", "KBQ-EXTRACT-PROPERTY-VALUES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_queries", "KBQ-QUERY-SET-RUN-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_query_count", "KBQ-QUERY-SET-RUN-QUERY-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_valid_queries", "KBQ-QUERY-SET-RUN-VALID-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_runnable_queries", "KBQ-QUERY-SET-RUN-RUNNABLE-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_remove_invalid_queries", "KBQ-QUERY-SET-RUN-REMOVE-INVALID-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_remove_unrunnable_queries", "KBQ-QUERY-SET-RUN-REMOVE-UNRUNNABLE-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_compute_pad_table", "KBQ-COMPUTE-PAD-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_queries_within_n_of_median", "KBQ-QUERIES-WITHIN-N-OF-MEDIAN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_median_metric", "KBQ-MEDIAN-METRIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_mean_metric", "KBQ-MEAN-METRIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_function_for_metric", "KBQ-FUNCTION-FOR-METRIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_set_run_p", "KCT-TEST-SET-RUN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_make_test_set_run", "KCT-MAKE-TEST-SET-RUN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_nmerge_test_set_runs", "KCT-NMERGE-TEST-SET-RUNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_set_run_comment", "KCT-TEST-SET-RUN-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_set_run_internal_time_units_per_second", "KCT-TEST-SET-RUN-INTERNAL-TIME-UNITS-PER-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_set_run_test_runs", "KCT-TEST-SET-RUN-TEST-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_set_run_tests", "KCT-TEST-SET-RUN-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_set_run_valid_tests", "KCT-TEST-SET-RUN-VALID-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_set_run_remove_invalid_tests", "KCT-TEST-SET-RUN-REMOVE-INVALID-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_run_query", "KBQ-RUN-QUERY", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "abort_kbq_run_query", "ABORT-KBQ-RUN-QUERY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_run_query_and_maybe_destroy", "KBQ-RUN-QUERY-AND-MAYBE-DESTROY", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_run_query_problem_store", "KBQ-RUN-QUERY-PROBLEM-STORE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_run_query_int", "KBQ-RUN-QUERY-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "ensure_sksi_modules_needed", "ENSURE-SKSI-MODULES-NEEDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "ensure_only_sksi_modules_needed", "ENSURE-ONLY-SKSI-MODULES-NEEDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "sksi_modules_needed", "SKSI-MODULES-NEEDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "query_sksi_modules_needed", "QUERY-SKSI-MODULES-NEEDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "any_kct_followup_test_formula_gafsP", "ANY-KCT-FOLLOWUP-TEST-FORMULA-GAFS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_run_test", "KCT-RUN-TEST", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kb_test_metrics_to_query_metrics", "KB-TEST-METRICS-TO-QUERY-METRICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kb_test_metric_to_query_metric", "KB-TEST-METRIC-TO-QUERY-METRIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_compute_test_status", "KCT-COMPUTE-TEST-STATUS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_compute_janus_test_status", "KCT-COMPUTE-JANUS-TEST-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_followup_test_formula_all_holdsP", "KCT-FOLLOWUP-TEST-FORMULA-ALL-HOLDS?", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_followup_test_formula_some_holdsP", "KCT-FOLLOWUP-TEST-FORMULA-SOME-HOLDS?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_followup_test_formula_none_holdsP", "KCT-FOLLOWUP-TEST-FORMULA-NONE-HOLDS?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_followup_test_formula_result", "KCT-FOLLOWUP-TEST-FORMULA-RESULT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_query_results_satisfy_exact_set_of_binding_sets", "KCT-TEST-QUERY-RESULTS-SATISFY-EXACT-SET-OF-BINDING-SETS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_query_results_satisfy_wanted_binding_sets", "KCT-TEST-QUERY-RESULTS-SATISFY-WANTED-BINDING-SETS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_query_results_satisfy_unwanted_binding_sets", "KCT-TEST-QUERY-RESULTS-SATISFY-UNWANTED-BINDING-SETS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_query_results_satisfy_binding_sets_cardinality", "KCT-TEST-QUERY-RESULTS-SATISFY-BINDING-SETS-CARDINALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_query_results_satisfy_binding_sets_min_cardinality", "KCT-TEST-QUERY-RESULTS-SATISFY-BINDING-SETS-MIN-CARDINALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_query_results_satisfy_binding_sets_max_cardinality", "KCT-TEST-QUERY-RESULTS-SATISFY-BINDING-SETS-MAX-CARDINALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_query_results_satisfy_best_multiple_choice_option", "KCT-TEST-QUERY-RESULTS-SATISFY-BEST-MULTIPLE-CHOICE-OPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "why_kct_failure", "WHY-KCT-FAILURE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "why_kct_multiple_choice_option_failure", "WHY-KCT-MULTIPLE-CHOICE-OPTION-FAILURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "why_kct_binding_cardinality_failure", "WHY-KCT-BINDING-CARDINALITY-FAILURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "why_kct_binding_match_failure", "WHY-KCT-BINDING-MATCH-FAILURE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_format_binding_sets_list", "KCT-FORMAT-BINDING-SETS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_run_query_set", "KBQ-RUN-QUERY-SET", 1, 12, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "abort_kbq_run_query_set", "ABORT-KBQ-RUN-QUERY-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_spec_set_elements", "KBQ-QUERY-SPEC-SET-ELEMENTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "sort_queries_by_sksi_modules_needed", "SORT-QUERIES-BY-SKSI-MODULES-NEEDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "sort_tests_by_sksi_modules_needed", "SORT-TESTS-BY-SKSI-MODULES-NEEDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "sort_terms_by_sksi_modules_needed", "SORT-TERMS-BY-SKSI-MODULES-NEEDED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "sksi_modules_needed_sorted_memoized_internal", "SKSI-MODULES-NEEDED-SORTED-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "sksi_modules_needed_sorted_memoized", "SKSI-MODULES-NEEDED-SORTED-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "query_sksi_modules_needed_sorted_memoized_internal", "QUERY-SKSI-MODULES-NEEDED-SORTED-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "query_sksi_modules_needed_sorted_memoized", "QUERY-SKSI-MODULES-NEEDED-SORTED-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "all_instantiations_via_inference", "ALL-INSTANTIATIONS-VIA-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_test_collection_to_query_set", "KBQ-TEST-COLLECTION-TO-QUERY-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "run_kbq_query_spec_set_and_process_inferences", "RUN-KBQ-QUERY-SPEC-SET-AND-PROCESS-INFERENCES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "run_kbq_and_process_inferences", "RUN-KBQ-AND-PROCESS-INFERENCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "run_kbq_and_generate_inferences", "RUN-KBQ-AND-GENERATE-INFERENCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "process_all_kbq_inferences", "PROCESS-ALL-KBQ-INFERENCES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_run_test_set", "KCT-RUN-TEST-SET", 1, 13, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "abort_kct_run_test_set", "ABORT-KCT-RUN-TEST-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_spec_set_elements", "KCT-TEST-SPEC-SET-ELEMENTS", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.kbq_query_run", "run_kbq_experiment", "RUN-KBQ-EXPERIMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "last_query_set_run", "LAST-QUERY-SET-RUN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "run_kbq_experiment_internal", "RUN-KBQ-EXPERIMENT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "print_kbq_experiment_analysis_to_file", "PRINT-KBQ-EXPERIMENT-ANALYSIS-TO-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_erroring_queries", "KBQ-ERRORING-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_erroring_query_count", "KBQ-ERRORING-QUERY-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_count_erroring_query_runs", "KBQ-COUNT-ERRORING-QUERY-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_erroring_query_runP", "KBQ-ERRORING-QUERY-RUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_if_file_exists_handling_p", "KBQ-IF-FILE-EXISTS-HANDLING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_experiment_augmentability_status", "KBQ-EXPERIMENT-AUGMENTABILITY-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_setup_file_handling", "KBQ-SETUP-FILE-HANDLING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_queries_not_yet_run", "KBQ-QUERIES-NOT-YET-RUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_compute_rerun_errors_filename", "KBQ-COMPUTE-RERUN-ERRORS-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_candidate_rerun_errors_filename", "KBQ-CANDIDATE-RERUN-ERRORS-FILENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_load_query_set_run_and_merge_reruns", "KBQ-LOAD-QUERY-SET-RUN-AND-MERGE-RERUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_merge_query_set_run_with_rerun", "KBQ-MERGE-QUERY-SET-RUN-WITH-RERUN", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.kbq_query_run", "run_kct_experiment", "RUN-KCT-EXPERIMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "run_kct_experiment_internal", "RUN-KCT-EXPERIMENT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "print_kct_experiment_analysis_to_file", "PRINT-KCT-EXPERIMENT-ANALYSIS-TO-FILE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "print_experiment_csv_to_file", "PRINT-EXPERIMENT-CSV-TO-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_erroring_tests", "KCT-ERRORING-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_erroring_test_count", "KCT-ERRORING-TEST-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_count_erroring_test_runs", "KCT-COUNT-ERRORING-TEST-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_erroring_test_runP", "KCT-ERRORING-TEST-RUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_setup_file_handling", "KCT-SETUP-FILE-HANDLING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_tests_not_yet_run", "KCT-TESTS-NOT-YET-RUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_compute_rerun_errors_filename", "KCT-COMPUTE-RERUN-ERRORS-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_candidate_rerun_errors_filename", "KCT-CANDIDATE-RERUN-ERRORS-FILENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_load_test_set_run_and_merge_reruns", "KCT-LOAD-TEST-SET-RUN-AND-MERGE-RERUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_merge_test_set_run_with_rerun", "KCT-MERGE-TEST-SET-RUN-WITH-RERUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_runstate_validP", "KBQ-RUNSTATE-VALID?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_runstate_inference_already_setP", "KBQ-RUNSTATE-INFERENCE-ALREADY-SET?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kbq_runstate_inference", "SET-KBQ-RUNSTATE-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "possibly_set_kbq_runstate_inference", "POSSIBLY-SET-KBQ-RUNSTATE-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "find_kbq_runstate_by_id", "FIND-KBQ-RUNSTATE-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "find_kbq_runstate_by_id_string", "FIND-KBQ-RUNSTATE-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "find_kct_runstate_by_id", "FIND-KCT-RUNSTATE-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "find_kct_runstate_by_id_string", "FIND-KCT-RUNSTATE-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "find_kct_set_runstate_by_id", "FIND-KCT-SET-RUNSTATE-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "find_kct_set_runstate_by_id_string", "FIND-KCT-SET-RUNSTATE-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "next_runstate_id", "NEXT-RUNSTATE-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "runstate_add_object", "RUNSTATE-ADD-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "runstate_rem_object", "RUNSTATE-REM-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "runstate_find_object_by_id", "RUNSTATE-FIND-OBJECT-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "runstate_constant", "RUNSTATE-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "runstate_result_status", "RUNSTATE-RESULT-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "runstate_result_text", "RUNSTATE-RESULT-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "runstate_run_status", "RUNSTATE-RUN-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "runstate_inference", "RUNSTATE-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "runstate_start", "RUNSTATE-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "runstate_end", "RUNSTATE-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_runstate_run_status", "SET-RUNSTATE-RUN-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "destroy_runstate", "DESTROY-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_runstate_print_function_trampoline", "KBQ-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_runstate_p", "KBQ-RUNSTATE-P", 1, 0, false);
        new $kbq_runstate_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbqr_id", "KBQR-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbqr_lock", "KBQR-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbqr_query_spec", "KBQR-QUERY-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbqr_inference", "KBQR-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbqr_result", "KBQR-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbqr_test_runstate", "KBQR-TEST-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbqr_run_status", "KBQR-RUN-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kbqr_id", "_CSETF-KBQR-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kbqr_lock", "_CSETF-KBQR-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kbqr_query_spec", "_CSETF-KBQR-QUERY-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kbqr_inference", "_CSETF-KBQR-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kbqr_result", "_CSETF-KBQR-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kbqr_test_runstate", "_CSETF-KBQR-TEST-RUNSTATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kbqr_run_status", "_CSETF-KBQR-RUN-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "make_kbq_runstate", "MAKE-KBQ-RUNSTATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "visit_defstruct_kbq_runstate", "VISIT-DEFSTRUCT-KBQ-RUNSTATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "visit_defstruct_object_kbq_runstate_method", "VISIT-DEFSTRUCT-OBJECT-KBQ-RUNSTATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "new_kbq_runstate", "NEW-KBQ-RUNSTATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "destroy_kbq_runstate", "DESTROY-KBQ-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_runstate_query_spec", "KBQ-RUNSTATE-QUERY-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_runstate_lock", "KBQ-RUNSTATE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_runstate_inference", "KBQ-RUNSTATE-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_runstate_result", "KBQ-RUNSTATE-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_runstate_test_runstate", "KBQ-RUNSTATE-TEST-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_runstate_run_status", "KBQ-RUNSTATE-RUN-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kbqr_inference", "SET-KBQR-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kbqr_result", "SET-KBQR-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kbqr_run_status", "SET-KBQR-RUN-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "possibly_set_kbqr_run_status", "POSSIBLY-SET-KBQR-RUN-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_print_function_trampoline", "KCT-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_p", "KCT-RUNSTATE-P", 1, 0, false);
        new $kct_runstate_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctr_id", "KCTR-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctr_lock", "KCTR-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctr_test_spec", "KCTR-TEST-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctr_result", "KCTR-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctr_query_runstate", "KCTR-QUERY-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctr_test_set_runstate", "KCTR-TEST-SET-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctr_run_status", "KCTR-RUN-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctr_start", "KCTR-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctr_end", "KCTR-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctr_id", "_CSETF-KCTR-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctr_lock", "_CSETF-KCTR-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctr_test_spec", "_CSETF-KCTR-TEST-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctr_result", "_CSETF-KCTR-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctr_query_runstate", "_CSETF-KCTR-QUERY-RUNSTATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctr_test_set_runstate", "_CSETF-KCTR-TEST-SET-RUNSTATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctr_run_status", "_CSETF-KCTR-RUN-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctr_start", "_CSETF-KCTR-START", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctr_end", "_CSETF-KCTR-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "make_kct_runstate", "MAKE-KCT-RUNSTATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "visit_defstruct_kct_runstate", "VISIT-DEFSTRUCT-KCT-RUNSTATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "visit_defstruct_object_kct_runstate_method", "VISIT-DEFSTRUCT-OBJECT-KCT-RUNSTATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "new_kct_runstate", "NEW-KCT-RUNSTATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "destroy_kct_runstate", "DESTROY-KCT-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_test_spec", "KCT-RUNSTATE-TEST-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_lock", "KCT-RUNSTATE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_result", "KCT-RUNSTATE-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_query_runstate", "KCT-RUNSTATE-QUERY-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_test_set_runstate", "KCT-RUNSTATE-TEST-SET-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_inference", "KCT-RUNSTATE-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_result_status", "KCT-RUNSTATE-RESULT-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_failure_explanation", "KCT-RUNSTATE-FAILURE-EXPLANATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_metric_value", "KCT-RUNSTATE-METRIC-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_run_status", "KCT-RUNSTATE-RUN-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_start", "KCT-RUNSTATE-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_runstate_end", "KCT-RUNSTATE-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kctr_result", "SET-KCTR-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kctr_query_runstate", "SET-KCTR-QUERY-RUNSTATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kctr_test_set_runstate", "SET-KCTR-TEST-SET-RUNSTATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kctr_run_status", "SET-KCTR-RUN-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kctr_start", "SET-KCTR-START", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kctr_end", "SET-KCTR-END", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_set_runstate_print_function_trampoline", "KCT-SET-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_set_runstate_p", "KCT-SET-RUNSTATE-P", 1, 0, false);
        new $kct_set_runstate_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctsr_id", "KCTSR-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctsr_lock", "KCTSR-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctsr_test_set", "KCTSR-TEST-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctsr_result", "KCTSR-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctsr_test_runstates", "KCTSR-TEST-RUNSTATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctsr_run_status", "KCTSR-RUN-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctsr_start", "KCTSR-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctsr_end", "KCTSR-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctsr_id", "_CSETF-KCTSR-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctsr_lock", "_CSETF-KCTSR-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctsr_test_set", "_CSETF-KCTSR-TEST-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctsr_result", "_CSETF-KCTSR-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctsr_test_runstates", "_CSETF-KCTSR-TEST-RUNSTATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctsr_run_status", "_CSETF-KCTSR-RUN-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctsr_start", "_CSETF-KCTSR-START", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "_csetf_kctsr_end", "_CSETF-KCTSR-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "make_kct_set_runstate", "MAKE-KCT-SET-RUNSTATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "visit_defstruct_kct_set_runstate", "VISIT-DEFSTRUCT-KCT-SET-RUNSTATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "visit_defstruct_object_kct_set_runstate_method", "VISIT-DEFSTRUCT-OBJECT-KCT-SET-RUNSTATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "new_kct_set_runstate", "NEW-KCT-SET-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "destroy_kct_set_runstate", "DESTROY-KCT-SET-RUNSTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_set_runstate_test_set", "KCT-SET-RUNSTATE-TEST-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_set_runstate_lock", "KCT-SET-RUNSTATE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_set_runstate_result", "KCT-SET-RUNSTATE-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_set_runstate_test_runstates", "KCT-SET-RUNSTATE-TEST-RUNSTATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_set_runstate_result_status", "KCT-SET-RUNSTATE-RESULT-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_set_runstate_run_status", "KCT-SET-RUNSTATE-RUN-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_set_runstate_start", "KCT-SET-RUNSTATE-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_set_runstate_end", "KCT-SET-RUNSTATE-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kctsr_result", "SET-KCTSR-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctsr_test_runstate_add", "KCTSR-TEST-RUNSTATE-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kctsr_test_runstate_remove", "KCTSR-TEST-RUNSTATE-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kctsr_run_status", "SET-KCTSR-RUN-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kctsr_start", "SET-KCTSR-START", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "set_kctsr_end", "SET-KCTSR-END", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_save_query_set_run", "KBQ-SAVE-QUERY-SET-RUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_save_test_set_run", "KCT-SAVE-TEST-SET-RUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_save_query_set_run_without_results", "KBQ-SAVE-QUERY-SET-RUN-WITHOUT-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_open_query_set_run_output_stream", "KBQ-OPEN-QUERY-SET-RUN-OUTPUT-STREAM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_open_test_set_run_output_stream", "KCT-OPEN-TEST-SET-RUN-OUTPUT-STREAM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_save_query_set_run_preamble", "KBQ-SAVE-QUERY-SET-RUN-PREAMBLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_save_test_set_run_preamble", "KCT-SAVE-TEST-SET-RUN-PREAMBLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_save_query_run", "KBQ-SAVE-QUERY-RUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_save_test_run", "KCT-SAVE-TEST-RUN", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.kbq_query_run", "do_query_set_run", "DO-QUERY-SET-RUN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.kbq_query_run", "do_query_set_run_query_runs", "DO-QUERY-SET-RUN-QUERY-RUNS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_load_query_set_run", "KBQ-LOAD-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_load_query_set_run_int", "KBQ-LOAD-QUERY-SET-RUN-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_load_query_run_int", "KBQ-LOAD-QUERY-RUN-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_nmerge_query_runs", "KBQ-QUERY-SET-RUN-NMERGE-QUERY-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_load_test_set_run", "KCT-LOAD-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_set_run_nmerge_test_runs", "KCT-TEST-SET-RUN-NMERGE-TEST-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_nclean_query_set_run", "KBQ-NCLEAN-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_nclean_test_set_run", "KCT-NCLEAN-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_nclean_query_run", "KBQ-NCLEAN-QUERY-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_strip_results_from_query_set_run_file", "KBQ-STRIP-RESULTS-FROM-QUERY-SET-RUN-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_strip_suffix_from_filename", "KBQ-STRIP-SUFFIX-FROM-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_strip_suffix_from_filename", "KCT-STRIP-SUFFIX-FROM-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_filter_query_set_run_by_property_value", "KBQ-FILTER-QUERY-SET-RUN-BY-PROPERTY-VALUE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_filter_query_set_run_by_test", "KBQ-FILTER-QUERY-SET-RUN-BY-TEST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_filter_test_set_run_by_test", "KCT-FILTER-TEST-SET-RUN-BY-TEST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_answerable_query_set_run", "KBQ-ANSWERABLE-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_answerable_test_set_run", "KCT-ANSWERABLE-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_succeeding_test_set_run", "KCT-SUCCEEDING-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_unanswerable_query_set_run", "KBQ-UNANSWERABLE-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_unanswerable_test_set_run", "KCT-UNANSWERABLE-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_failing_test_set_run", "KCT-FAILING-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_erroring_test_set_run", "KCT-ERRORING-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_common_sense_test_set_run", "KCT-COMMON-SENSE-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_regression_test_set_run", "KCT-REGRESSION-TEST-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_subcollection_test_set_run", "KCT-SUBCOLLECTION-TEST-SET-RUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_failing_tests", "KCT-FAILING-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_succeeding_tests", "KCT-SUCCEEDING-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_answerable_tests", "KCT-ANSWERABLE-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_unanswerable_tests", "KCT-UNANSWERABLE-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_newly_failing_tests", "KCT-NEWLY-FAILING-TESTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_same_property_value_queries", "KBQ-SAME-PROPERTY-VALUE-QUERIES", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_mutually_answerable_queries", "KBQ-MUTUALLY-ANSWERABLE-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_mutually_unanswerable_queries", "KBQ-MUTUALLY-UNANSWERABLE-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_fast_queries", "KBQ-FAST-QUERIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_mutually_succeeding_tests", "KCT-MUTUALLY-SUCCEEDING-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_mutually_failing_tests", "KCT-MUTUALLY-FAILING-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_mutually_answerable_query_set_runs", "KBQ-MUTUALLY-ANSWERABLE-QUERY-SET-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_mutually_unanswerable_query_set_runs", "KBQ-MUTUALLY-UNANSWERABLE-QUERY-SET-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_runs_common_queries", "KBQ-QUERY-SET-RUNS-COMMON-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_common_queries_query_set_runs", "KBQ-COMMON-QUERIES-QUERY-SET-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_common_queries_two_query_set_runs", "KBQ-COMMON-QUERIES-TWO-QUERY-SET-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_common_tests_test_set_runs", "KCT-COMMON-TESTS-TEST-SET-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_mutually_succeeding_test_set_runs", "KCT-MUTUALLY-SUCCEEDING-TEST-SET-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_mutually_failing_test_set_runs", "KCT-MUTUALLY-FAILING-TEST-SET-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_same_answer_count_query_set_runs", "KBQ-SAME-ANSWER-COUNT-QUERY-SET-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_different_answer_count_query_set_runs", "KBQ-DIFFERENT-ANSWER-COUNT-QUERY-SET-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_filter_to_queries_int", "KBQ-FILTER-TO-QUERIES-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_filter_query_set_run_to_queries_lambda", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-LAMBDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_filter_query_set_run_to_queries_not_lambda", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-NOT-LAMBDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_filter_query_set_run_to_queries", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_filter_test_set_run_to_tests_lambda", "KCT-FILTER-TEST-SET-RUN-TO-TESTS-LAMBDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_filter_test_set_run_to_tests_not_lambda", "KCT-FILTER-TEST-SET-RUN-TO-TESTS-NOT-LAMBDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_filter_test_set_run_to_tests", "KCT-FILTER-TEST-SET-RUN-TO-TESTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_filter_query_set_run_to_query_collection", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERY-COLLECTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_filter_test_set_run_to_test_collection", "KCT-FILTER-TEST-SET-RUN-TO-TEST-COLLECTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "clear_cached_all_instances_among", "CLEAR-CACHED-ALL-INSTANCES-AMONG", 0, 0, false);
        new $clear_cached_all_instances_among$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "remove_cached_all_instances_among", "REMOVE-CACHED-ALL-INSTANCES-AMONG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "cached_all_instances_among_internal", "CACHED-ALL-INSTANCES-AMONG-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "cached_all_instances_among", "CACHED-ALL-INSTANCES-AMONG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_queries_common_to_all_query_set_runs", "KBQ-QUERIES-COMMON-TO-ALL-QUERY-SET-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_tests_common_to_all_test_set_runs", "KCT-TESTS-COMMON-TO-ALL-TEST-SET-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_consistently_succeeding_tests", "KCT-CONSISTENTLY-SUCCEEDING-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_consistently_succeeding_test_set_runs", "KCT-CONSISTENTLY-SUCCEEDING-TEST-SET-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "queries_that_became_unanswerable", "QUERIES-THAT-BECAME-UNANSWERABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "queries_that_changed_answer_count", "QUERIES-THAT-CHANGED-ANSWER-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_runs_with_worst_slowdown", "KBQ-QUERY-RUNS-WITH-WORST-SLOWDOWN", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_runs_with_worst_slowdown_robust", "KBQ-QUERY-RUNS-WITH-WORST-SLOWDOWN-ROBUST", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_slowest_query_runs", "KBQ-SLOWEST-QUERY-RUNS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_slowest_test_runs", "KCT-SLOWEST-TEST-RUNS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_compare_query_set_run_answers", "KBQ-COMPARE-QUERY-SET-RUN-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_summarize_compare_query_set_run_answers", "KBQ-SUMMARIZE-COMPARE-QUERY-SET-RUN-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_sort_query_runs", "KBQ-SORT-QUERY-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_lookup_query_run", "KBQ-LOOKUP-QUERY-RUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_lookup_query_run_from_query_runs", "KBQ-LOOKUP-QUERY-RUN-FROM-QUERY-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_lookup_query_runs", "KBQ-LOOKUP-QUERY-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_equal", "KBQ-QUERY-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_compare_query_run_answers", "KBQ-COMPARE-QUERY-RUN-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_compare_query_set_runs_by_property", "KBQ-COMPARE-QUERY-SET-RUNS-BY-PROPERTY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "show_query_runs_that_became_unanswerable", "SHOW-QUERY-RUNS-THAT-BECAME-UNANSWERABLE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "show_query_runs_that_changed_answer_count", "SHOW-QUERY-RUNS-THAT-CHANGED-ANSWER-COUNT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "show_query_runs_int", "SHOW-QUERY-RUNS-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_answerable_counts", "KBQ-QUERY-SET-RUN-ANSWERABLE-COUNTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_compare_test_set_run_statuses", "KCT-COMPARE-TEST-SET-RUN-STATUSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_summarize_compare_test_set_run_statuses", "KCT-SUMMARIZE-COMPARE-TEST-SET-RUN-STATUSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_lookup_test_run", "KCT-LOOKUP-TEST-RUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_equal", "KCT-TEST-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_compare_test_run_statuses", "KCT-COMPARE-TEST-RUN-STATUSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_analyze_query_set_runs", "KBQ-ANALYZE-QUERY-SET-RUNS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_analyze_test_set_runs", "KCT-ANALYZE-TEST-SET-RUNS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_compare_analysis", "KBQ-COMPARE-ANALYSIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "significant_digits_if_float", "SIGNIFICANT-DIGITS-IF-FLOAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_print_analysis", "KBQ-PRINT-ANALYSIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_analyze_query_set_run", "KBQ-ANALYZE-QUERY-SET-RUN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_analyze_test_set_run", "KCT-ANALYZE-TEST-SET-RUN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_analyze_query_runs", "KBQ-ANALYZE-QUERY-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_total_answerable", "KBQ-QUERY-SET-RUN-TOTAL-ANSWERABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_last_query_from_file", "KBQ-QUERY-SET-RUN-LAST-QUERY-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_identify_probable_segfault_from_file", "KBQ-QUERY-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT-FROM-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_identify_probable_segfault", "KBQ-QUERY-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_set_run_identify_probable_segfault_int", "KBQ-QUERY-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_analyze_test_runs", "KCT-ANALYZE-TEST-RUNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_test_set_run_identify_probable_segfault", "KCT-TEST-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "analyze_kbq_experiments", "ANALYZE-KBQ-EXPERIMENTS", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_non_lumpy_query_set_run", "KBQ-NON-LUMPY-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_lumpy_queries", "KBQ-LUMPY-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_lumpy_query_count", "KBQ-LUMPY-QUERY-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_count_lumpy_query_runs", "KBQ-COUNT-LUMPY-QUERY-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_lumpy_query_runP", "KBQ-LUMPY-QUERY-RUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "show_kct_test_set_run_summary", "SHOW-KCT-TEST-SET-RUN-SUMMARY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_show_halt_reason_histogram", "KBQ-SHOW-HALT-REASON-HISTOGRAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "trim_analysis_if_zero", "TRIM-ANALYSIS-IF-ZERO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_query_literal_count", "KBQ-QUERY-LITERAL-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_single_literal_query_p", "KBQ-SINGLE-LITERAL-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_progress_stream", "KBQ-PROGRESS-STREAM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_benchmark_run_and_report", "KBQ-BENCHMARK-RUN-AND-REPORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_benchmark_run_in_background", "KBQ-BENCHMARK-RUN-IN-BACKGROUND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_benchmark_run", "KBQ-BENCHMARK-RUN", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_benchmark_report", "KBQ-BENCHMARK-REPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kbq_benchmark_report_for_test", "KBQ-BENCHMARK-REPORT-FOR-TEST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_run_support_set", "KCT-RUN-SUPPORT-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kct_run_supports_report", "KCT-RUN-SUPPORTS-REPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "unknown_sentence_support_p", "UNKNOWN-SENTENCE-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kcts_using_only_these_sksi_sources", "KCTS-USING-ONLY-THESE-SKSI-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "kcts_for_sksi_source", "KCTS-FOR-SKSI-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "succeeding_kcts_for_sksi_source", "SUCCEEDING-KCTS-FOR-SKSI-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "failing_kcts_for_sksi_source", "FAILING-KCTS-FOR-SKSI-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "answerable_kcts_for_sksi_source", "ANSWERABLE-KCTS-FOR-SKSI-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "unanswerable_kcts_for_sksi_source", "UNANSWERABLE-KCTS-FOR-SKSI-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "erroring_kcts_for_sksi_source", "ERRORING-KCTS-FOR-SKSI-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "show_errors_for_sksi_source", "SHOW-ERRORS-FOR-SKSI-SOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.kbq_query_run", "analyze_sksi_test_set_run", "ANALYZE-SKSI-TEST-SET-RUN", 2, 0, false);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    public static SubLObject init_kbq_query_run_file() {
        kbq_query_run.$kct_set_runstate$ = SubLFiles.defparameter("*KCT-SET-RUNSTATE*", (SubLObject)kbq_query_run.NIL);
        kbq_query_run.$kct_runstate$ = SubLFiles.defparameter("*KCT-RUNSTATE*", (SubLObject)kbq_query_run.NIL);
        kbq_query_run.$kbq_runstate$ = SubLFiles.defparameter("*KBQ-RUNSTATE*", (SubLObject)kbq_query_run.NIL);
        kbq_query_run.$kbq_old_cfasl_common_symbols$ = SubLFiles.deflexical("*KBQ-OLD-CFASL-COMMON-SYMBOLS*", (SubLObject)kbq_query_run.$list3);
        kbq_query_run.$kbq_new_cfasl_common_symbols$ = SubLFiles.deflexical("*KBQ-NEW-CFASL-COMMON-SYMBOLS*", ConsesLow.append(kbq_query_run.$kbq_old_cfasl_common_symbols$.getGlobalValue(), (SubLObject)kbq_query_run.$list4));
        kbq_query_run.$kbq_cfasl_common_symbols$ = SubLFiles.deflexical("*KBQ-CFASL-COMMON-SYMBOLS*", ConsesLow.append(kbq_query_run.$kbq_old_cfasl_common_symbols$.getGlobalValue(), kbq_query_run.$kbq_new_cfasl_common_symbols$.getGlobalValue()));
        kbq_query_run.$kbq_cfasl_common_symbols_simple$ = SubLFiles.deflexical("*KBQ-CFASL-COMMON-SYMBOLS-SIMPLE*", (SubLObject)kbq_query_run.NIL);
        kbq_query_run.$kct_old_cfasl_common_symbols$ = SubLFiles.deflexical("*KCT-OLD-CFASL-COMMON-SYMBOLS*", ConsesLow.append(kbq_query_run.$kbq_old_cfasl_common_symbols$.getGlobalValue(), (SubLObject)kbq_query_run.$list9));
        kbq_query_run.$kct_cfasl_common_symbols$ = SubLFiles.deflexical("*KCT-CFASL-COMMON-SYMBOLS*", ConsesLow.append(kbq_query_run.$kbq_old_cfasl_common_symbols$.getGlobalValue(), (SubLObject)kbq_query_run.$list9, kbq_query_run.$kbq_new_cfasl_common_symbols$.getGlobalValue()));
        kbq_query_run.$kbq_outlier_timeout$ = SubLFiles.defparameter("*KBQ-OUTLIER-TIMEOUT*", (SubLObject)kbq_query_run.$int10$600);
        kbq_query_run.$kbq_internal_time_units_per_second$ = SubLFiles.defparameter("*KBQ-INTERNAL-TIME-UNITS-PER-SECOND*", (SubLObject)kbq_query_run.NIL);
        kbq_query_run.$kbq_run_number$ = SubLFiles.defparameter("*KBQ-RUN-NUMBER*", (SubLObject)kbq_query_run.ONE_INTEGER);
        kbq_query_run.$kct_test_metric_table$ = SubLFiles.deflexical("*KCT-TEST-METRIC-TABLE*", (SubLObject)kbq_query_run.$list150);
        kbq_query_run.$kbq_default_outlier_timeout$ = SubLFiles.deflexical("*KBQ-DEFAULT-OUTLIER-TIMEOUT*", (SubLObject)kbq_query_run.$int10$600);
        kbq_query_run.$kbq_test_collection_to_query_set_query$ = SubLFiles.deflexical("*KBQ-TEST-COLLECTION-TO-QUERY-SET-QUERY*", (SubLObject)kbq_query_run.$list183);
        kbq_query_run.$last_query_set_run$ = SubLFiles.deflexical("*LAST-QUERY-SET-RUN*", (SubLObject)((kbq_query_run.NIL != Symbols.boundp((SubLObject)kbq_query_run.$sym219$_LAST_QUERY_SET_RUN_)) ? kbq_query_run.$last_query_set_run$.getGlobalValue() : kbq_query_run.NIL));
        kbq_query_run.$last_test_set_run$ = SubLFiles.deflexical("*LAST-TEST-SET-RUN*", (SubLObject)((kbq_query_run.NIL != Symbols.boundp((SubLObject)kbq_query_run.$sym241$_LAST_TEST_SET_RUN_)) ? kbq_query_run.$last_test_set_run$.getGlobalValue() : kbq_query_run.NIL));
        kbq_query_run.$runstate_isg$ = SubLFiles.deflexical("*RUNSTATE-ISG*", (kbq_query_run.NIL != Symbols.boundp((SubLObject)kbq_query_run.$sym260$_RUNSTATE_ISG_)) ? kbq_query_run.$runstate_isg$.getGlobalValue() : integer_sequence_generator.new_integer_sequence_generator((SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED));
        kbq_query_run.$runstate_index$ = SubLFiles.deflexical("*RUNSTATE-INDEX*", (kbq_query_run.NIL != Symbols.boundp((SubLObject)kbq_query_run.$sym261$_RUNSTATE_INDEX_)) ? kbq_query_run.$runstate_index$.getGlobalValue() : dictionary.new_dictionary((SubLObject)kbq_query_run.UNPROVIDED, (SubLObject)kbq_query_run.UNPROVIDED));
        kbq_query_run.$dtp_kbq_runstate$ = SubLFiles.defconstant("*DTP-KBQ-RUNSTATE*", (SubLObject)kbq_query_run.$sym269$KBQ_RUNSTATE);
        kbq_query_run.$dtp_kct_runstate$ = SubLFiles.defconstant("*DTP-KCT-RUNSTATE*", (SubLObject)kbq_query_run.$sym309$KCT_RUNSTATE);
        kbq_query_run.$dtp_kct_set_runstate$ = SubLFiles.defconstant("*DTP-KCT-SET-RUNSTATE*", (SubLObject)kbq_query_run.$sym343$KCT_SET_RUNSTATE);
        kbq_query_run.$query_set_run_file_extension$ = SubLFiles.deflexical("*QUERY-SET-RUN-FILE-EXTENSION*", (SubLObject)kbq_query_run.$str406$_cfasl);
        kbq_query_run.$kbq_filter_query_set_run_to_queries$ = SubLFiles.defparameter("*KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES*", (SubLObject)kbq_query_run.NIL);
        kbq_query_run.$kct_filter_test_set_run_to_tests$ = SubLFiles.defparameter("*KCT-FILTER-TEST-SET-RUN-TO-TESTS*", (SubLObject)kbq_query_run.NIL);
        kbq_query_run.$cached_all_instances_among_caching_state$ = SubLFiles.deflexical("*CACHED-ALL-INSTANCES-AMONG-CACHING-STATE*", (SubLObject)kbq_query_run.NIL);
        kbq_query_run.$kbq_summary_statistics$ = SubLFiles.deflexical("*KBQ-SUMMARY-STATISTICS*", (SubLObject)kbq_query_run.$list458);
        kbq_query_run.$kbq_progress_stream$ = SubLFiles.defparameter("*KBQ-PROGRESS-STREAM*", (SubLObject)kbq_query_run.NIL);
        kbq_query_run.$kbq_benchmark_outlier_timeout$ = SubLFiles.defparameter("*KBQ-BENCHMARK-OUTLIER-TIMEOUT*", (SubLObject)kbq_query_run.$int523$3600);
        kbq_query_run.$kbq_test_query_set$ = SubLFiles.deflexical("*KBQ-TEST-QUERY-SET*", (SubLObject)kbq_query_run.$list590);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    public static SubLObject setup_kbq_query_run_file() {
        access_macros.register_macro_helper((SubLObject)kbq_query_run.$sym5$KBQ_CFASL_COMMON_SYMBOLS, (SubLObject)kbq_query_run.$sym6$DO_QUERY_SET_RUN);
        access_macros.register_macro_helper((SubLObject)kbq_query_run.$sym7$KBQ_CFASL_COMMON_SYMBOLS_SIMPLE, (SubLObject)kbq_query_run.$sym6$DO_QUERY_SET_RUN);
        access_macros.register_external_symbol((SubLObject)kbq_query_run.$sym140$ENSURE_SKSI_MODULES_NEEDED);
        memoization_state.note_memoized_function((SubLObject)kbq_query_run.$sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)kbq_query_run.$sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED);
        subl_macro_promotions.declare_defglobal((SubLObject)kbq_query_run.$sym219$_LAST_QUERY_SET_RUN_);
        access_macros.register_macro_helper((SubLObject)kbq_query_run.$sym217$RUN_KBQ_EXPERIMENT_INTERNAL, (SubLObject)kbq_query_run.$sym220$RUN_KBQ_EXPERIMENT);
        subl_macro_promotions.declare_defglobal((SubLObject)kbq_query_run.$sym241$_LAST_TEST_SET_RUN_);
        access_macros.register_macro_helper((SubLObject)kbq_query_run.$sym240$RUN_KCT_EXPERIMENT_INTERNAL, (SubLObject)kbq_query_run.$sym242$RUN_KCT_EXPERIMENT);
        subl_macro_promotions.declare_defglobal((SubLObject)kbq_query_run.$sym260$_RUNSTATE_ISG_);
        subl_macro_promotions.declare_defglobal((SubLObject)kbq_query_run.$sym261$_RUNSTATE_INDEX_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), kbq_query_run.$dtp_kbq_runstate$.getGlobalValue(), Symbols.symbol_function((SubLObject)kbq_query_run.$sym276$KBQ_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)kbq_query_run.$list277);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym278$KBQR_ID, (SubLObject)kbq_query_run.$sym279$_CSETF_KBQR_ID);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym280$KBQR_LOCK, (SubLObject)kbq_query_run.$sym281$_CSETF_KBQR_LOCK);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym282$KBQR_QUERY_SPEC, (SubLObject)kbq_query_run.$sym283$_CSETF_KBQR_QUERY_SPEC);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym284$KBQR_INFERENCE, (SubLObject)kbq_query_run.$sym285$_CSETF_KBQR_INFERENCE);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym286$KBQR_RESULT, (SubLObject)kbq_query_run.$sym287$_CSETF_KBQR_RESULT);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym288$KBQR_TEST_RUNSTATE, (SubLObject)kbq_query_run.$sym289$_CSETF_KBQR_TEST_RUNSTATE);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym290$KBQR_RUN_STATUS, (SubLObject)kbq_query_run.$sym291$_CSETF_KBQR_RUN_STATUS);
        Equality.identity((SubLObject)kbq_query_run.$sym269$KBQ_RUNSTATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), kbq_query_run.$dtp_kbq_runstate$.getGlobalValue(), Symbols.symbol_function((SubLObject)kbq_query_run.$sym303$VISIT_DEFSTRUCT_OBJECT_KBQ_RUNSTATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), kbq_query_run.$dtp_kct_runstate$.getGlobalValue(), Symbols.symbol_function((SubLObject)kbq_query_run.$sym314$KCT_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)kbq_query_run.$list315);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym316$KCTR_ID, (SubLObject)kbq_query_run.$sym317$_CSETF_KCTR_ID);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym318$KCTR_LOCK, (SubLObject)kbq_query_run.$sym319$_CSETF_KCTR_LOCK);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym320$KCTR_TEST_SPEC, (SubLObject)kbq_query_run.$sym321$_CSETF_KCTR_TEST_SPEC);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym322$KCTR_RESULT, (SubLObject)kbq_query_run.$sym323$_CSETF_KCTR_RESULT);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym324$KCTR_QUERY_RUNSTATE, (SubLObject)kbq_query_run.$sym325$_CSETF_KCTR_QUERY_RUNSTATE);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym326$KCTR_TEST_SET_RUNSTATE, (SubLObject)kbq_query_run.$sym327$_CSETF_KCTR_TEST_SET_RUNSTATE);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym328$KCTR_RUN_STATUS, (SubLObject)kbq_query_run.$sym329$_CSETF_KCTR_RUN_STATUS);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym330$KCTR_START, (SubLObject)kbq_query_run.$sym331$_CSETF_KCTR_START);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym332$KCTR_END, (SubLObject)kbq_query_run.$sym333$_CSETF_KCTR_END);
        Equality.identity((SubLObject)kbq_query_run.$sym309$KCT_RUNSTATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), kbq_query_run.$dtp_kct_runstate$.getGlobalValue(), Symbols.symbol_function((SubLObject)kbq_query_run.$sym339$VISIT_DEFSTRUCT_OBJECT_KCT_RUNSTATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), kbq_query_run.$dtp_kct_set_runstate$.getGlobalValue(), Symbols.symbol_function((SubLObject)kbq_query_run.$sym348$KCT_SET_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)kbq_query_run.$list349);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym350$KCTSR_ID, (SubLObject)kbq_query_run.$sym351$_CSETF_KCTSR_ID);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym352$KCTSR_LOCK, (SubLObject)kbq_query_run.$sym353$_CSETF_KCTSR_LOCK);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym354$KCTSR_TEST_SET, (SubLObject)kbq_query_run.$sym355$_CSETF_KCTSR_TEST_SET);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym356$KCTSR_RESULT, (SubLObject)kbq_query_run.$sym357$_CSETF_KCTSR_RESULT);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym358$KCTSR_TEST_RUNSTATES, (SubLObject)kbq_query_run.$sym359$_CSETF_KCTSR_TEST_RUNSTATES);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym360$KCTSR_RUN_STATUS, (SubLObject)kbq_query_run.$sym361$_CSETF_KCTSR_RUN_STATUS);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym362$KCTSR_START, (SubLObject)kbq_query_run.$sym363$_CSETF_KCTSR_START);
        Structures.def_csetf((SubLObject)kbq_query_run.$sym364$KCTSR_END, (SubLObject)kbq_query_run.$sym365$_CSETF_KCTSR_END);
        Equality.identity((SubLObject)kbq_query_run.$sym343$KCT_SET_RUNSTATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), kbq_query_run.$dtp_kct_set_runstate$.getGlobalValue(), Symbols.symbol_function((SubLObject)kbq_query_run.$sym369$VISIT_DEFSTRUCT_OBJECT_KCT_SET_RUNSTATE_METHOD));
        access_macros.register_macro_helper((SubLObject)kbq_query_run.$sym389$KBQ_LOAD_QUERY_SET_RUN_INT, (SubLObject)kbq_query_run.$sym6$DO_QUERY_SET_RUN);
        access_macros.register_macro_helper((SubLObject)kbq_query_run.$sym393$KBQ_LOAD_QUERY_RUN_INT, (SubLObject)kbq_query_run.$sym6$DO_QUERY_SET_RUN);
        access_macros.register_macro_helper((SubLObject)kbq_query_run.$sym398$KBQ_NCLEAN_QUERY_RUN, (SubLObject)kbq_query_run.$sym6$DO_QUERY_SET_RUN);
        memoization_state.note_globally_cached_function((SubLObject)kbq_query_run.$sym428$CACHED_ALL_INSTANCES_AMONG);
        generic_testing.define_test_case_table_int((SubLObject)kbq_query_run.$sym591$COMPUTE_NEW_ROOT_RELATIVE_ANSWER_TIMES, (SubLObject)ConsesLow.list(new SubLObject[] { kbq_query_run.$kw69$TEST, kbq_query_run.NIL, kbq_query_run.$kw592$OWNER, kbq_query_run.NIL, kbq_query_run.$kw593$CLASSES, kbq_query_run.NIL, kbq_query_run.$kw594$KB, kbq_query_run.$kw595$TINY, kbq_query_run.$kw596$WORKING_, kbq_query_run.T }), (SubLObject)kbq_query_run.$list597);
        return (SubLObject)kbq_query_run.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kbq_query_run_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kbq_query_run_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kbq_query_run_file();
    }
    
    static {
        me = (SubLFile)new kbq_query_run();
        kbq_query_run.$kct_set_runstate$ = null;
        kbq_query_run.$kct_runstate$ = null;
        kbq_query_run.$kbq_runstate$ = null;
        kbq_query_run.$kbq_old_cfasl_common_symbols$ = null;
        kbq_query_run.$kbq_new_cfasl_common_symbols$ = null;
        kbq_query_run.$kbq_cfasl_common_symbols$ = null;
        kbq_query_run.$kbq_cfasl_common_symbols_simple$ = null;
        kbq_query_run.$kct_old_cfasl_common_symbols$ = null;
        kbq_query_run.$kct_cfasl_common_symbols$ = null;
        kbq_query_run.$kbq_outlier_timeout$ = null;
        kbq_query_run.$kbq_internal_time_units_per_second$ = null;
        kbq_query_run.$kbq_run_number$ = null;
        kbq_query_run.$kct_test_metric_table$ = null;
        kbq_query_run.$kbq_default_outlier_timeout$ = null;
        kbq_query_run.$kbq_test_collection_to_query_set_query$ = null;
        kbq_query_run.$last_query_set_run$ = null;
        kbq_query_run.$last_test_set_run$ = null;
        kbq_query_run.$runstate_isg$ = null;
        kbq_query_run.$runstate_index$ = null;
        kbq_query_run.$dtp_kbq_runstate$ = null;
        kbq_query_run.$dtp_kct_runstate$ = null;
        kbq_query_run.$dtp_kct_set_runstate$ = null;
        kbq_query_run.$query_set_run_file_extension$ = null;
        kbq_query_run.$kbq_filter_query_set_run_to_queries$ = null;
        kbq_query_run.$kct_filter_test_set_run_to_tests$ = null;
        kbq_query_run.$cached_all_instances_among_caching_state$ = null;
        kbq_query_run.$kbq_summary_statistics$ = null;
        kbq_query_run.$kbq_progress_stream$ = null;
        kbq_query_run.$kbq_benchmark_outlier_timeout$ = null;
        kbq_query_run.$kbq_test_query_set$ = null;
        $kw0$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $kw1$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $kw2$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ANSWER-COUNT-AT-60-SECONDS"), SubLObjectFactory.makeKeyword("PROBLEM-STORE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("PROBLEM-STORE-PROOF-COUNT"), SubLObjectFactory.makeKeyword("ERROR"), SubLObjectFactory.makeKeyword("MAX-NUMBER"), SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeKeyword("ANSWER-COUNT-AT-30-SECONDS"), SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeKeyword("TOTAL-TIME"), SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER"), SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("ANSWER-COUNT"), SubLObjectFactory.makeKeyword("EXHAUST-TOTAL"), SubLObjectFactory.makeKeyword("HALT-REASON"), SubLObjectFactory.makeKeyword("QUERY"), SubLObjectFactory.makeKeyword("QUERY-RUN") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TIME-PER-ANSWER"), SubLObjectFactory.makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER"), SubLObjectFactory.makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), SubLObjectFactory.makeKeyword("PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("PROOF-COUNT"), SubLObjectFactory.makeKeyword("LINK-COUNT"), SubLObjectFactory.makeKeyword("CONTENT-LINK-COUNT"), SubLObjectFactory.makeKeyword("REMOVAL-LINK-COUNT"), SubLObjectFactory.makeKeyword("REWRITE-LINK-COUNT"), SubLObjectFactory.makeKeyword("TRANSFORMATION-LINK-COUNT"), SubLObjectFactory.makeKeyword("STRUCTURAL-LINK-COUNT"), SubLObjectFactory.makeKeyword("JOIN-ORDERED-LINK-COUNT"), SubLObjectFactory.makeKeyword("JOIN-LINK-COUNT"), SubLObjectFactory.makeKeyword("SPLIT-LINK-COUNT"), SubLObjectFactory.makeKeyword("RESTRICTION-LINK-COUNT"), SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT"), SubLObjectFactory.makeKeyword("UNION-LINK-COUNT"), SubLObjectFactory.makeKeyword("GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NEUTRAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NO-GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("SINGLE-LITERAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("JOIN-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("SPLIT-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("DISJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("UNEXAMINED-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("EXAMINED-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("POSSIBLE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("PENDING-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("UNEXAMINED-GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("EXAMINED-GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("POSSIBLE-GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("PENDING-GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("UNEXAMINED-NEUTRAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("EXAMINED-NEUTRAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("POSSIBLE-NEUTRAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("PENDING-NEUTRAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("UNEXAMINED-NO-GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("EXAMINED-NO-GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("POSSIBLE-NO-GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("PENDING-NO-GOOD-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("GOOD-SINGLE-LITERAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("GOOD-CONJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("GOOD-JOIN-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("GOOD-SPLIT-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("GOOD-DISJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NEUTRAL-JOIN-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NEUTRAL-SPLIT-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NO-GOOD-JOIN-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NO-GOOD-SPLIT-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("UNEXAMINED-JOIN-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("UNEXAMINED-SPLIT-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("EXAMINED-CONJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("EXAMINED-JOIN-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("EXAMINED-SPLIT-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("EXAMINED-DISJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("POSSIBLE-JOIN-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("POSSIBLE-SPLIT-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("FINISHED-SINGLE-LITERAL-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("FINISHED-CONJUNCTIVE-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("FINISHED-JOIN-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("FINISHED-SPLIT-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("FINISHED-DISJUNCTIVE-PROBLEM-COUNT") });
        $sym5$KBQ_CFASL_COMMON_SYMBOLS = SubLObjectFactory.makeSymbol("KBQ-CFASL-COMMON-SYMBOLS");
        $sym6$DO_QUERY_SET_RUN = SubLObjectFactory.makeSymbol("DO-QUERY-SET-RUN");
        $sym7$KBQ_CFASL_COMMON_SYMBOLS_SIMPLE = SubLObjectFactory.makeSymbol("KBQ-CFASL-COMMON-SYMBOLS-SIMPLE");
        $sym8$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUCCESS"), (SubLObject)SubLObjectFactory.makeKeyword("FAILURE"), (SubLObject)SubLObjectFactory.makeKeyword("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"));
        $int10$600 = SubLObjectFactory.makeInteger(600);
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-SET-RUN")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym12$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym13$_KBQ_INTERNAL_TIME_UNITS_PER_SECOND_ = SubLObjectFactory.makeSymbol("*KBQ-INTERNAL-TIME-UNITS-PER-SECOND*");
        $sym14$KBQ_QUERY_SET_RUN_INTERNAL_TIME_UNITS_PER_SECOND = SubLObjectFactory.makeSymbol("KBQ-QUERY-SET-RUN-INTERNAL-TIME-UNITS-PER-SECOND");
        $kw15$RESULT = SubLObjectFactory.makeKeyword("RESULT");
        $kw16$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw17$MISSING = SubLObjectFactory.makeKeyword("MISSING");
        $kw18$ANSWER_COUNT = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $kw19$HYPOTHESIZATION_TIME = SubLObjectFactory.makeKeyword("HYPOTHESIZATION-TIME");
        $kw20$TOTAL_TIME = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $kw21$COMPLETE_TOTAL_TIME = SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME");
        $kw22$TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER");
        $kw23$TIME_TO_LAST_ANSWER = SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER");
        $kw24$COMPLETE_TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER");
        $kw25$COMPLETE_TIME_TO_LAST_ANSWER = SubLObjectFactory.makeKeyword("COMPLETE-TIME-TO-LAST-ANSWER");
        $kw26$TOTAL_STEPS = SubLObjectFactory.makeKeyword("TOTAL-STEPS");
        $kw27$STEPS_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("STEPS-TO-FIRST-ANSWER");
        $kw28$STEPS_TO_LAST_ANSWER = SubLObjectFactory.makeKeyword("STEPS-TO-LAST-ANSWER");
        $kw29$HALT_REASON = SubLObjectFactory.makeKeyword("HALT-REASON");
        $kw30$ORIGIN = SubLObjectFactory.makeKeyword("ORIGIN");
        $kw31$WASTED_TIME_AFTER_LAST_ANSWER = SubLObjectFactory.makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER");
        $kw32$LATENCY_IMPROVEMENT_FROM_ITERATIVITY = SubLObjectFactory.makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
        $kw33$SETUP_TIME = SubLObjectFactory.makeKeyword("SETUP-TIME");
        $kw34$TIME_PER_ANSWER = SubLObjectFactory.makeKeyword("TIME-PER-ANSWER");
        $kw35$COMPLETE_TIME_PER_ANSWER = SubLObjectFactory.makeKeyword("COMPLETE-TIME-PER-ANSWER");
        $kw36$ANSWERABILITY_TIME = SubLObjectFactory.makeKeyword("ANSWERABILITY-TIME");
        $kw37$ANSWERABILITY_STEPS = SubLObjectFactory.makeKeyword("ANSWERABILITY-STEPS");
        $kw38$NEW_ROOT_RELATIVE_TOTAL_TIMES = SubLObjectFactory.makeKeyword("NEW-ROOT-RELATIVE-TOTAL-TIMES");
        $kw39$NEW_ROOT_TIMES = SubLObjectFactory.makeKeyword("NEW-ROOT-TIMES");
        $kw40$NEW_ROOT_RELATIVE_ANSWER_TIMES = SubLObjectFactory.makeKeyword("NEW-ROOT-RELATIVE-ANSWER-TIMES");
        $kw41$ANSWER_TIMES = SubLObjectFactory.makeKeyword("ANSWER-TIMES");
        $kw42$ESTIMATED_EXHAUSTIVE_PROBLEM_COUNT = SubLObjectFactory.makeKeyword("ESTIMATED-EXHAUSTIVE-PROBLEM-COUNT");
        $kw43$ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT = SubLObjectFactory.makeKeyword("ESTIMATED-EXHAUSTIVE-NEW-ROOT-COUNT");
        $kw44$NEW_ROOT_COUNT = SubLObjectFactory.makeKeyword("NEW-ROOT-COUNT");
        $kw45$PROBLEM_COUNT = SubLObjectFactory.makeKeyword("PROBLEM-COUNT");
        $kw46$ESTIMATED_EXHAUSTIVE_BYTE_COUNT = SubLObjectFactory.makeKeyword("ESTIMATED-EXHAUSTIVE-BYTE-COUNT");
        $sym47$_MEDIAN_BYTES_PER_PROBLEM_ = SubLObjectFactory.makeSymbol("*MEDIAN-BYTES-PER-PROBLEM*");
        $kw48$TOTAL_NEW_ROOT_INITIAL_REMOVAL_FANOUT = SubLObjectFactory.makeKeyword("TOTAL-NEW-ROOT-INITIAL-REMOVAL-FANOUT");
        $kw49$NEW_ROOT_INITIAL_REMOVAL_FANOUTS = SubLObjectFactory.makeKeyword("NEW-ROOT-INITIAL-REMOVAL-FANOUTS");
        $kw50$QUERY_FUNCALL = SubLObjectFactory.makeKeyword("QUERY-FUNCALL");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FUNC"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"));
        $kw53$QUERY_RUN_FUNCALL = SubLObjectFactory.makeKeyword("QUERY-RUN-FUNCALL");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-RUN-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FUNC"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-RUN-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"));
        $str56$unrecognized_KBQ_property_spec__s = SubLObjectFactory.makeString("unrecognized KBQ property spec ~s");
        $str57$Use_the__with_kbq_query_set_run_m = SubLObjectFactory.makeString("Use the 'with-kbq-query-set-run macro to provide the scaling factor from internal real time to seconds.");
        $str58$Use_the__with_kbq_query_set_run__ = SubLObjectFactory.makeString("Use the 'with-kbq-query-set-run' macro to provide the scaling factor from internal real time to seconds.");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT"));
        $kw60$TAUTOLOGY = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $int61$1000 = SubLObjectFactory.makeInteger(1000);
        $int62$100 = SubLObjectFactory.makeInteger(100);
        $float63$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $float64$0_01 = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $kw65$INFERENCE_PROOF_SPEC = SubLObjectFactory.makeKeyword("INFERENCE-PROOF-SPEC");
        $const66$sentenceTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceTruth"));
        $int67$_2 = SubLObjectFactory.makeInteger(-2);
        $sym68$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $kw69$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw70$STATUS = SubLObjectFactory.makeKeyword("STATUS");
        $kw71$QUERY_RUN = SubLObjectFactory.makeKeyword("QUERY-RUN");
        $kw72$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw73$DATE = SubLObjectFactory.makeKeyword("DATE");
        $kw74$BOGOMIPS = SubLObjectFactory.makeKeyword("BOGOMIPS");
        $kw75$INTERNAL_TIME_UNITS_PER_SECOND = SubLObjectFactory.makeKeyword("INTERNAL-TIME-UNITS-PER-SECOND");
        $kw76$PATCH_LEVEL = SubLObjectFactory.makeKeyword("PATCH-LEVEL");
        $kw77$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $kw78$QUERY_RUNS = SubLObjectFactory.makeKeyword("QUERY-RUNS");
        $sym79$KBQ_QUERY_SET_RUN_QUERY_RUNS = SubLObjectFactory.makeSymbol("KBQ-QUERY-SET-RUN-QUERY-RUNS");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"), (SubLObject)SubLObjectFactory.makeSymbol("BOGOMIPS"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-TIME-UNITS-PER-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("PATCH-LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-RUNS"));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MACHINE"), (SubLObject)SubLObjectFactory.makeKeyword("DATE"), (SubLObject)SubLObjectFactory.makeKeyword("BOGOMIPS"), (SubLObject)SubLObjectFactory.makeKeyword("INTERNAL-TIME-UNITS-PER-SECOND"), (SubLObject)SubLObjectFactory.makeKeyword("PATCH-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-RUNS"));
        $kw82$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw83$TEST_RUNS = SubLObjectFactory.makeKeyword("TEST-RUNS");
        $sym84$INVALID_FORT_ = SubLObjectFactory.makeSymbol("INVALID-FORT?");
        $sym85$KBQ_RUNNABLE_ = SubLObjectFactory.makeSymbol("KBQ-RUNNABLE?");
        $sym86$_ = SubLObjectFactory.makeSymbol("<");
        $sym87$SAFE__ = SubLObjectFactory.makeSymbol("SAFE-<");
        $str88$_s_____s__ = SubLObjectFactory.makeString("~s -> ~s~%");
        $sym89$KBQ_QUERY_RUN_QUERY = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-QUERY");
        $kw90$MEDIAN_HYPOTHESIZATION_TIME = SubLObjectFactory.makeKeyword("MEDIAN-HYPOTHESIZATION-TIME");
        $kw91$MEDIAN_TOTAL_TIME = SubLObjectFactory.makeKeyword("MEDIAN-TOTAL-TIME");
        $kw92$MEDIAN_TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("MEDIAN-TIME-TO-FIRST-ANSWER");
        $kw93$MEDIAN_TIME_TO_LAST_ANSWER = SubLObjectFactory.makeKeyword("MEDIAN-TIME-TO-LAST-ANSWER");
        $str94$what_s_the_median_for__s = SubLObjectFactory.makeString("what's the median for ~s");
        $kw95$MEAN_HYPOTHESIZATION_TIME = SubLObjectFactory.makeKeyword("MEAN-HYPOTHESIZATION-TIME");
        $kw96$MEAN_TOTAL_TIME = SubLObjectFactory.makeKeyword("MEAN-TOTAL-TIME");
        $kw97$MEAN_TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("MEAN-TIME-TO-FIRST-ANSWER");
        $kw98$MEAN_TIME_TO_LAST_ANSWER = SubLObjectFactory.makeKeyword("MEAN-TIME-TO-LAST-ANSWER");
        $str99$what_s_the_mean_for__s = SubLObjectFactory.makeString("what's the mean for ~s");
        $sym100$KBQ_QUERY_RUN_HYPOTHESIZATION_TIME = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-HYPOTHESIZATION-TIME");
        $sym101$KBQ_QUERY_RUN_TOTAL_TIME = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-TOTAL-TIME");
        $sym102$KBQ_QUERY_RUN_TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-TIME-TO-FIRST-ANSWER");
        $sym103$KBQ_QUERY_RUN_TIME_TO_LAST_ANSWER = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-TIME-TO-LAST-ANSWER");
        $sym104$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-COMPLETE-TOTAL-TIME");
        $sym105$KBQ_QUERY_RUN_COMPLETE_TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-COMPLETE-TIME-TO-FIRST-ANSWER");
        $sym106$KBQ_QUERY_RUN_COMPLETE_TIME_TO_LAST_ANSWER = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-COMPLETE-TIME-TO-LAST-ANSWER");
        $sym107$KBQ_QUERY_RUN_ANSWER_COUNT = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-ANSWER-COUNT");
        $str108$unknown_metric__s = SubLObjectFactory.makeString("unknown metric ~s");
        $sym109$KCT_TEST_SET_RUN_TEST_RUNS = SubLObjectFactory.makeSymbol("KCT-TEST-SET-RUN-TEST-RUNS");
        $sym110$KCT_TEST_RUN_TEST = SubLObjectFactory.makeSymbol("KCT-TEST-RUN-TEST");
        $sym111$KBQ_QUERY_SPEC_P = SubLObjectFactory.makeSymbol("KBQ-QUERY-SPEC-P");
        $sym112$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym113$QUERY_METRIC_P = SubLObjectFactory.makeSymbol("QUERY-METRIC-P");
        $sym114$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $sym115$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $sym116$QUERY_PROPERTY_P = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
        $kw117$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw118$METRICS = SubLObjectFactory.makeKeyword("METRICS");
        $kw119$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $str120$___A____ = SubLObjectFactory.makeString("~%~A~%~%");
        $kw121$RUNNING = SubLObjectFactory.makeKeyword("RUNNING");
        $sym122$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw123$ABORT_KBQ_RUN_QUERY = SubLObjectFactory.makeKeyword("ABORT-KBQ-RUN-QUERY");
        $str124$Abort_KBQ_run_query = SubLObjectFactory.makeString("Abort KBQ run query");
        $str125$KBQ_explicitly_aborted = SubLObjectFactory.makeString("KBQ explicitly aborted");
        $kw126$NEVER_RUN = SubLObjectFactory.makeKeyword("NEVER-RUN");
        $kw127$FINISHED = SubLObjectFactory.makeKeyword("FINISHED");
        $str128$Outlier_____S = SubLObjectFactory.makeString("Outlier :~%~S");
        $kw129$OUTLIER_ABORT = SubLObjectFactory.makeKeyword("OUTLIER-ABORT");
        $kw130$OUTLIER_TIMEOUT = SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT");
        $str131$Unable_to_compute_any_inference_m = SubLObjectFactory.makeString("Unable to compute any inference metrics for ~A");
        $str132$Unable_to_compute_all_desired_inf = SubLObjectFactory.makeString("Unable to compute all desired inference metrics for ~A");
        $str133$KBQ_harness_error_for__A____A = SubLObjectFactory.makeString("KBQ harness error for ~A : ~A");
        $str134$Error_____S___A = SubLObjectFactory.makeString("Error :~%~S~%~A");
        $kw135$NOT_A_QUERY = SubLObjectFactory.makeKeyword("NOT-A-QUERY");
        $str136$Avoided__due_to__S______S = SubLObjectFactory.makeString("Avoided (due to ~S) :~%~S");
        $kw137$OVERRIDING_QUERY_PROPERTIES = SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $kw138$SUBSTITUTIONS = SubLObjectFactory.makeKeyword("SUBSTITUTIONS");
        $kw139$ABORT = SubLObjectFactory.makeKeyword("ABORT");
        $sym140$ENSURE_SKSI_MODULES_NEEDED = SubLObjectFactory.makeSymbol("ENSURE-SKSI-MODULES-NEEDED");
        $const141$sksiModulesNeeded = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiModulesNeeded"));
        $const142$testFollowupTestFormula_All = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("testFollowupTestFormula-All"));
        $const143$testFollowupTestFormula_Some = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("testFollowupTestFormula-Some"));
        $const144$testFollowupTestFormula_None = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("testFollowupTestFormula-None"));
        $sym145$KCT_TEST_SPEC_P = SubLObjectFactory.makeSymbol("KCT-TEST-SPEC-P");
        $kw146$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw147$BINDINGS_AND_HYPOTHETICAL_BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $const148$TestMetric_HaltReason = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestMetric-HaltReason"));
        $str149$Unsupported_metric__S = SubLObjectFactory.makeString("Unsupported metric ~S");
        $list150 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestMetric-TotalTime")), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestMetric-TimeToFirstAnswer")), (SubLObject)SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestMetric-TimeToLastAnswer")), (SubLObject)SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestMetric-AnswerCount")), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestMetric-AnswerCountAt30Seconds")), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT-AT-30-SECONDS")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestMetric-AnswerCountAt60Seconds")), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT-AT-60-SECONDS")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestMetric-ProblemStoreProofCount")), (SubLObject)SubLObjectFactory.makeKeyword("PROOF-COUNT")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestMetric-ProblemStoreProblemCount")), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEM-COUNT")));
        $kw151$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?"), (SubLObject)kbq_query_run.NIL);
        $sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_ = SubLObjectFactory.makeSymbol("BINDINGS-EQUAL-MODULO-EL-VAR-NAMES?");
        $str154$Expected_ = SubLObjectFactory.makeString("Expected ");
        $str155$__but_got_ = SubLObjectFactory.makeString(", but got ");
        $str156$Expected_exactly_ = SubLObjectFactory.makeString("Expected exactly ");
        $str157$_binding_sets__but_got_ = SubLObjectFactory.makeString(" binding sets, but got ");
        $str158$_ = SubLObjectFactory.makeString(".");
        $str159$Expected_at_least_ = SubLObjectFactory.makeString("Expected at least ");
        $str160$Expected_no_more_than_ = SubLObjectFactory.makeString("Expected no more than ");
        $str161$ = SubLObjectFactory.makeString("");
        $str162$These_expected_bindings_were_miss = SubLObjectFactory.makeString("These expected bindings were missing: ");
        $str163$These_unwanted_bindings_were_retu = SubLObjectFactory.makeString("These unwanted bindings were returned: ");
        $str164$____ = SubLObjectFactory.makeString("    ");
        $kw165$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $sym166$FILE_VALID_FOR_WRITING_P = SubLObjectFactory.makeSymbol("FILE-VALID-FOR-WRITING-P");
        $kw167$ABORT_KBQ_RUN_QUERY_SET = SubLObjectFactory.makeKeyword("ABORT-KBQ-RUN-QUERY-SET");
        $str168$Abort_KBQ_run_query_set = SubLObjectFactory.makeString("Abort KBQ run query set");
        $str169$KBQ_running_query_set = SubLObjectFactory.makeString("KBQ running query set");
        $str170$cdolist = SubLObjectFactory.makeString("cdolist");
        $str171$_________________________________ = SubLObjectFactory.makeString("~&~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;~%");
        $str172$______A____ = SubLObjectFactory.makeString("~&;; ~A~%~%");
        $str173$Running_ = SubLObjectFactory.makeString("Running ");
        $str174$Unrunnable_query____S = SubLObjectFactory.makeString("Unrunnable query : ~S");
        $sym175$JANUS_OPERATION_P = SubLObjectFactory.makeSymbol("JANUS-OPERATION-P");
        $const176$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED = SubLObjectFactory.makeSymbol("SKSI-MODULES-NEEDED-SORTED-MEMOIZED");
        $sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED = SubLObjectFactory.makeSymbol("QUERY-SKSI-MODULES-NEEDED-SORTED-MEMOIZED");
        $const179$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const180$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $sym181$_OBJ = SubLObjectFactory.makeSymbol("?OBJ");
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"));
        $list183 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeKeyword("SET"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SetExtentFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?QUERY"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?TEST"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("knownSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TEST"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-COLLECTION"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("testQuerySpecification")), (SubLObject)SubLObjectFactory.makeSymbol("?TEST"), (SubLObject)SubLObjectFactory.makeSymbol("?QUERY"))))))));
        $kw184$TEST_COLLECTION = SubLObjectFactory.makeKeyword("TEST-COLLECTION");
        $kw185$SET = SubLObjectFactory.makeKeyword("SET");
        $list186 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $kw187$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $str188$Processing_KB_Queries = SubLObjectFactory.makeString("Processing KB Queries");
        $kw189$SKIP_KBQ = SubLObjectFactory.makeKeyword("SKIP-KBQ");
        $str190$Skip_KBQ__S = SubLObjectFactory.makeString("Skip KBQ ~S");
        $kw191$ADDITIONAL_ARGS = SubLObjectFactory.makeKeyword("ADDITIONAL-ARGS");
        $sym192$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list193 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)kbq_query_run.NIL);
        $sym194$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str195$_A = SubLObjectFactory.makeString("~A");
        $list196 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTINUABLE?"), (SubLObject)kbq_query_run.NIL, (SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)kbq_query_run.T);
        $kw197$ABORT_KCT_RUN_TEST_SET = SubLObjectFactory.makeKeyword("ABORT-KCT-RUN-TEST-SET");
        $str198$Abort_KCT_run_test_set = SubLObjectFactory.makeString("Abort KCT run test set");
        $str199$KCT_running_test_set = SubLObjectFactory.makeString("KCT running test set");
        $str200$__Running__s__ = SubLObjectFactory.makeString("~&Running ~s~%");
        $str201$Unrunnable_test____S = SubLObjectFactory.makeString("Unrunnable test : ~S");
        $list202 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("QUERY-SPEC-SET"), SubLObjectFactory.makeSymbol("FILENAME"), SubLObjectFactory.makeSymbol("ANALYSIS-FILENAME"), SubLObjectFactory.makeSymbol("KEEPALIVE-FILENAME"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("OVERRIDING-QUERY-PROPERTIES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METRICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-ARETE-QUERY-METRICS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTLIER-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*KBQ-DEFAULT-OUTLIER-TIMEOUT*"))), SubLObjectFactory.makeSymbol("INCREMENTAL"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCLUDE-RESULTS"), (SubLObject)kbq_query_run.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANDOMIZE"), (SubLObject)kbq_query_run.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKIP"), (SubLObject)kbq_query_run.ZERO_INTEGER), SubLObjectFactory.makeSymbol("COUNT"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IF-FILE-EXISTS"), (SubLObject)SubLObjectFactory.makeKeyword("OVERWRITE")) });
        $list203 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("QUERY-SPEC-SET"), SubLObjectFactory.makeKeyword("FILENAME"), SubLObjectFactory.makeKeyword("ANALYSIS-FILENAME"), SubLObjectFactory.makeKeyword("KEEPALIVE-FILENAME"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES"), SubLObjectFactory.makeKeyword("METRICS"), SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT"), SubLObjectFactory.makeKeyword("INCREMENTAL"), SubLObjectFactory.makeKeyword("INCLUDE-RESULTS"), SubLObjectFactory.makeKeyword("RANDOMIZE"), SubLObjectFactory.makeKeyword("SKIP"), SubLObjectFactory.makeKeyword("COUNT"), SubLObjectFactory.makeKeyword("IF-FILE-EXISTS") });
        $kw204$QUERY_SPEC_SET = SubLObjectFactory.makeKeyword("QUERY-SPEC-SET");
        $kw205$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");
        $kw206$ANALYSIS_FILENAME = SubLObjectFactory.makeKeyword("ANALYSIS-FILENAME");
        $kw207$KEEPALIVE_FILENAME = SubLObjectFactory.makeKeyword("KEEPALIVE-FILENAME");
        $list208 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-ARETE-QUERY-METRICS"));
        $sym209$_KBQ_DEFAULT_OUTLIER_TIMEOUT_ = SubLObjectFactory.makeSymbol("*KBQ-DEFAULT-OUTLIER-TIMEOUT*");
        $kw210$INCREMENTAL = SubLObjectFactory.makeKeyword("INCREMENTAL");
        $kw211$INCLUDE_RESULTS = SubLObjectFactory.makeKeyword("INCLUDE-RESULTS");
        $kw212$RANDOMIZE = SubLObjectFactory.makeKeyword("RANDOMIZE");
        $kw213$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw214$COUNT = SubLObjectFactory.makeKeyword("COUNT");
        $kw215$IF_FILE_EXISTS = SubLObjectFactory.makeKeyword("IF-FILE-EXISTS");
        $kw216$OVERWRITE = SubLObjectFactory.makeKeyword("OVERWRITE");
        $sym217$RUN_KBQ_EXPERIMENT_INTERNAL = SubLObjectFactory.makeSymbol("RUN-KBQ-EXPERIMENT-INTERNAL");
        $sym218$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym219$_LAST_QUERY_SET_RUN_ = SubLObjectFactory.makeSymbol("*LAST-QUERY-SET-RUN*");
        $sym220$RUN_KBQ_EXPERIMENT = SubLObjectFactory.makeSymbol("RUN-KBQ-EXPERIMENT");
        $sym221$KBQ_IF_FILE_EXISTS_HANDLING_P = SubLObjectFactory.makeSymbol("KBQ-IF-FILE-EXISTS-HANDLING-P");
        $str222$__run_starting_at__A = SubLObjectFactory.makeString("~%run starting at ~A");
        $str223$__run_ended_at__A = SubLObjectFactory.makeString("~%run ended at ~A");
        $str224$__elapsed_time____A = SubLObjectFactory.makeString("~%elapsed time : ~A");
        $str225$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym226$KBQ_ERRORING_QUERY_RUN_ = SubLObjectFactory.makeSymbol("KBQ-ERRORING-QUERY-RUN?");
        $list227 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OVERWRITE"), (SubLObject)SubLObjectFactory.makeKeyword("AUGMENT"), (SubLObject)SubLObjectFactory.makeKeyword("RERUN-ERRORS"), (SubLObject)SubLObjectFactory.makeKeyword("AUGMENT-OR-RERUN-ERRORS"));
        $kw228$AUGMENT = SubLObjectFactory.makeKeyword("AUGMENT");
        $kw229$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $kw230$RERUN_ERRORS = SubLObjectFactory.makeKeyword("RERUN-ERRORS");
        $kw231$AUGMENT_OR_RERUN_ERRORS = SubLObjectFactory.makeKeyword("AUGMENT-OR-RERUN-ERRORS");
        $str232$unexpected_if_file_exists__s = SubLObjectFactory.makeString("unexpected if-file-exists ~s");
        $str233$_rerun_errors_ = SubLObjectFactory.makeString("-rerun-errors-");
        $list234 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("TEST-SPEC-SET"), SubLObjectFactory.makeSymbol("FILENAME"), SubLObjectFactory.makeSymbol("ANALYSIS-FILENAME"), SubLObjectFactory.makeSymbol("KEEPALIVE-FILENAME"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("OVERRIDING-QUERY-PROPERTIES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OVERRIDING-METRICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-ARETE-QUERY-METRICS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTLIER-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*KBQ-OUTLIER-TIMEOUT*"))), SubLObjectFactory.makeSymbol("INCREMENTAL"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCLUDE-RESULTS"), (SubLObject)kbq_query_run.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IF-FILE-EXISTS"), (SubLObject)SubLObjectFactory.makeKeyword("OVERWRITE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPOSE-RUNSTATE"), (SubLObject)kbq_query_run.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANDOMIZE"), (SubLObject)kbq_query_run.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKIP"), (SubLObject)kbq_query_run.ZERO_INTEGER), SubLObjectFactory.makeSymbol("COUNT") });
        $list235 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TEST-SPEC-SET"), SubLObjectFactory.makeKeyword("FILENAME"), SubLObjectFactory.makeKeyword("ANALYSIS-FILENAME"), SubLObjectFactory.makeKeyword("KEEPALIVE-FILENAME"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES"), SubLObjectFactory.makeKeyword("OVERRIDING-METRICS"), SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT"), SubLObjectFactory.makeKeyword("INCREMENTAL"), SubLObjectFactory.makeKeyword("INCLUDE-RESULTS"), SubLObjectFactory.makeKeyword("IF-FILE-EXISTS"), SubLObjectFactory.makeKeyword("EXPOSE-RUNSTATE"), SubLObjectFactory.makeKeyword("RANDOMIZE"), SubLObjectFactory.makeKeyword("SKIP"), SubLObjectFactory.makeKeyword("COUNT") });
        $kw236$TEST_SPEC_SET = SubLObjectFactory.makeKeyword("TEST-SPEC-SET");
        $kw237$OVERRIDING_METRICS = SubLObjectFactory.makeKeyword("OVERRIDING-METRICS");
        $sym238$_KBQ_OUTLIER_TIMEOUT_ = SubLObjectFactory.makeSymbol("*KBQ-OUTLIER-TIMEOUT*");
        $kw239$EXPOSE_RUNSTATE = SubLObjectFactory.makeKeyword("EXPOSE-RUNSTATE");
        $sym240$RUN_KCT_EXPERIMENT_INTERNAL = SubLObjectFactory.makeSymbol("RUN-KCT-EXPERIMENT-INTERNAL");
        $sym241$_LAST_TEST_SET_RUN_ = SubLObjectFactory.makeSymbol("*LAST-TEST-SET-RUN*");
        $sym242$RUN_KCT_EXPERIMENT = SubLObjectFactory.makeSymbol("RUN-KCT-EXPERIMENT");
        $sym243$KB_CONTENT_REGRESSION_TEST_ = SubLObjectFactory.makeSymbol("KB-CONTENT-REGRESSION-TEST?");
        $str244$Filtered_to___KBContentRegression = SubLObjectFactory.makeString("Filtered to #$KBContentRegressionTests");
        $str245$All_tests___ = SubLObjectFactory.makeString("All tests:~%");
        $str246$__Just_the_regression_tests___ = SubLObjectFactory.makeString("~%Just the regression tests:~%");
        $int247$212 = SubLObjectFactory.makeInteger(212);
        $str248$__Failing_tests_ = SubLObjectFactory.makeString("~%Failing tests:");
        $str249$____Failing_regression_tests___a_ = SubLObjectFactory.makeString("~%~%Failing regression tests (~a):");
        $str250$____Unrunnable_tests_ = SubLObjectFactory.makeString("~%~%Unrunnable tests:");
        $str251$_a = SubLObjectFactory.makeString("~a");
        $str252$___a_is_unrunnable_for_an_unknown = SubLObjectFactory.makeString("~%~a is unrunnable for an unknown reason.");
        $str253$_csv = SubLObjectFactory.makeString(".csv");
        $str254$__Writing_csv_to___A__ = SubLObjectFactory.makeString("~&Writing csv to: ~A~%");
        $str255$Comment___A__ = SubLObjectFactory.makeString("Comment: ~A~%");
        $str256$Date___A__ = SubLObjectFactory.makeString("Date: ~A~%");
        $str257$_A__A__A__A__A__A__A___ = SubLObjectFactory.makeString("~A,~A,~A,~A,~A,~A,~A,~%");
        $sym258$KCT_ERRORING_TEST_RUN_ = SubLObjectFactory.makeSymbol("KCT-ERRORING-TEST-RUN?");
        $sym259$KCT_TEST_RUNNABLE_ = SubLObjectFactory.makeSymbol("KCT-TEST-RUNNABLE?");
        $sym260$_RUNSTATE_ISG_ = SubLObjectFactory.makeSymbol("*RUNSTATE-ISG*");
        $sym261$_RUNSTATE_INDEX_ = SubLObjectFactory.makeSymbol("*RUNSTATE-INDEX*");
        $str262$Unknown_runstate_type___A = SubLObjectFactory.makeString("Unknown runstate type: ~A");
        $str263$Runstate_has_no_status___A = SubLObjectFactory.makeString("Runstate has no status: ~A");
        $str264$Explanations_aren_t_yet_implement = SubLObjectFactory.makeString("Explanations aren't yet implemented.");
        $str265$No_inference_defined_for_this_run = SubLObjectFactory.makeString("No inference defined for this runstate: ~A");
        $str266$No_start_defined_for_this_runstat = SubLObjectFactory.makeString("No start defined for this runstate: ~A");
        $str267$No_end_defined_for_this_runstate_ = SubLObjectFactory.makeString("No end defined for this runstate: ~A");
        $sym268$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym269$KBQ_RUNSTATE = SubLObjectFactory.makeSymbol("KBQ-RUNSTATE");
        $sym270$KBQ_RUNSTATE_P = SubLObjectFactory.makeSymbol("KBQ-RUNSTATE-P");
        $list271 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-RUNSTATE"), (SubLObject)SubLObjectFactory.makeSymbol("RUN-STATUS"));
        $list272 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("QUERY-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"), (SubLObject)SubLObjectFactory.makeKeyword("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-RUNSTATE"), (SubLObject)SubLObjectFactory.makeKeyword("RUN-STATUS"));
        $list273 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KBQR-ID"), (SubLObject)SubLObjectFactory.makeSymbol("KBQR-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("KBQR-QUERY-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("KBQR-INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("KBQR-RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("KBQR-TEST-RUNSTATE"), (SubLObject)SubLObjectFactory.makeSymbol("KBQR-RUN-STATUS"));
        $list274 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KBQR-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KBQR-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KBQR-QUERY-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KBQR-INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KBQR-RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KBQR-TEST-RUNSTATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KBQR-RUN-STATUS"));
        $sym275$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym276$KBQ_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("KBQ-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE");
        $list277 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KBQ-RUNSTATE-P"));
        $sym278$KBQR_ID = SubLObjectFactory.makeSymbol("KBQR-ID");
        $sym279$_CSETF_KBQR_ID = SubLObjectFactory.makeSymbol("_CSETF-KBQR-ID");
        $sym280$KBQR_LOCK = SubLObjectFactory.makeSymbol("KBQR-LOCK");
        $sym281$_CSETF_KBQR_LOCK = SubLObjectFactory.makeSymbol("_CSETF-KBQR-LOCK");
        $sym282$KBQR_QUERY_SPEC = SubLObjectFactory.makeSymbol("KBQR-QUERY-SPEC");
        $sym283$_CSETF_KBQR_QUERY_SPEC = SubLObjectFactory.makeSymbol("_CSETF-KBQR-QUERY-SPEC");
        $sym284$KBQR_INFERENCE = SubLObjectFactory.makeSymbol("KBQR-INFERENCE");
        $sym285$_CSETF_KBQR_INFERENCE = SubLObjectFactory.makeSymbol("_CSETF-KBQR-INFERENCE");
        $sym286$KBQR_RESULT = SubLObjectFactory.makeSymbol("KBQR-RESULT");
        $sym287$_CSETF_KBQR_RESULT = SubLObjectFactory.makeSymbol("_CSETF-KBQR-RESULT");
        $sym288$KBQR_TEST_RUNSTATE = SubLObjectFactory.makeSymbol("KBQR-TEST-RUNSTATE");
        $sym289$_CSETF_KBQR_TEST_RUNSTATE = SubLObjectFactory.makeSymbol("_CSETF-KBQR-TEST-RUNSTATE");
        $sym290$KBQR_RUN_STATUS = SubLObjectFactory.makeSymbol("KBQR-RUN-STATUS");
        $sym291$_CSETF_KBQR_RUN_STATUS = SubLObjectFactory.makeSymbol("_CSETF-KBQR-RUN-STATUS");
        $kw292$ID = SubLObjectFactory.makeKeyword("ID");
        $kw293$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw294$QUERY_SPEC = SubLObjectFactory.makeKeyword("QUERY-SPEC");
        $kw295$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $kw296$TEST_RUNSTATE = SubLObjectFactory.makeKeyword("TEST-RUNSTATE");
        $kw297$RUN_STATUS = SubLObjectFactory.makeKeyword("RUN-STATUS");
        $str298$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw299$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym300$MAKE_KBQ_RUNSTATE = SubLObjectFactory.makeSymbol("MAKE-KBQ-RUNSTATE");
        $kw301$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw302$END = SubLObjectFactory.makeKeyword("END");
        $sym303$VISIT_DEFSTRUCT_OBJECT_KBQ_RUNSTATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-KBQ-RUNSTATE-METHOD");
        $sym304$KCT_RUNSTATE_P = SubLObjectFactory.makeSymbol("KCT-RUNSTATE-P");
        $str305$KBQ_Runstate_Lock = SubLObjectFactory.makeString("KBQ Runstate Lock");
        $kw306$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym307$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $sym308$KBQ_QUERY_RUN_P = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-P");
        $sym309$KCT_RUNSTATE = SubLObjectFactory.makeSymbol("KCT-RUNSTATE");
        $list310 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("LOCK"), SubLObjectFactory.makeSymbol("TEST-SPEC"), SubLObjectFactory.makeSymbol("RESULT"), SubLObjectFactory.makeSymbol("QUERY-RUNSTATE"), SubLObjectFactory.makeSymbol("TEST-SET-RUNSTATE"), SubLObjectFactory.makeSymbol("RUN-STATUS"), SubLObjectFactory.makeSymbol("START"), SubLObjectFactory.makeSymbol("END") });
        $list311 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("LOCK"), SubLObjectFactory.makeKeyword("TEST-SPEC"), SubLObjectFactory.makeKeyword("RESULT"), SubLObjectFactory.makeKeyword("QUERY-RUNSTATE"), SubLObjectFactory.makeKeyword("TEST-SET-RUNSTATE"), SubLObjectFactory.makeKeyword("RUN-STATUS"), SubLObjectFactory.makeKeyword("START"), SubLObjectFactory.makeKeyword("END") });
        $list312 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("KCTR-ID"), SubLObjectFactory.makeSymbol("KCTR-LOCK"), SubLObjectFactory.makeSymbol("KCTR-TEST-SPEC"), SubLObjectFactory.makeSymbol("KCTR-RESULT"), SubLObjectFactory.makeSymbol("KCTR-QUERY-RUNSTATE"), SubLObjectFactory.makeSymbol("KCTR-TEST-SET-RUNSTATE"), SubLObjectFactory.makeSymbol("KCTR-RUN-STATUS"), SubLObjectFactory.makeSymbol("KCTR-START"), SubLObjectFactory.makeSymbol("KCTR-END") });
        $list313 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-KCTR-ID"), SubLObjectFactory.makeSymbol("_CSETF-KCTR-LOCK"), SubLObjectFactory.makeSymbol("_CSETF-KCTR-TEST-SPEC"), SubLObjectFactory.makeSymbol("_CSETF-KCTR-RESULT"), SubLObjectFactory.makeSymbol("_CSETF-KCTR-QUERY-RUNSTATE"), SubLObjectFactory.makeSymbol("_CSETF-KCTR-TEST-SET-RUNSTATE"), SubLObjectFactory.makeSymbol("_CSETF-KCTR-RUN-STATUS"), SubLObjectFactory.makeSymbol("_CSETF-KCTR-START"), SubLObjectFactory.makeSymbol("_CSETF-KCTR-END") });
        $sym314$KCT_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("KCT-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE");
        $list315 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KCT-RUNSTATE-P"));
        $sym316$KCTR_ID = SubLObjectFactory.makeSymbol("KCTR-ID");
        $sym317$_CSETF_KCTR_ID = SubLObjectFactory.makeSymbol("_CSETF-KCTR-ID");
        $sym318$KCTR_LOCK = SubLObjectFactory.makeSymbol("KCTR-LOCK");
        $sym319$_CSETF_KCTR_LOCK = SubLObjectFactory.makeSymbol("_CSETF-KCTR-LOCK");
        $sym320$KCTR_TEST_SPEC = SubLObjectFactory.makeSymbol("KCTR-TEST-SPEC");
        $sym321$_CSETF_KCTR_TEST_SPEC = SubLObjectFactory.makeSymbol("_CSETF-KCTR-TEST-SPEC");
        $sym322$KCTR_RESULT = SubLObjectFactory.makeSymbol("KCTR-RESULT");
        $sym323$_CSETF_KCTR_RESULT = SubLObjectFactory.makeSymbol("_CSETF-KCTR-RESULT");
        $sym324$KCTR_QUERY_RUNSTATE = SubLObjectFactory.makeSymbol("KCTR-QUERY-RUNSTATE");
        $sym325$_CSETF_KCTR_QUERY_RUNSTATE = SubLObjectFactory.makeSymbol("_CSETF-KCTR-QUERY-RUNSTATE");
        $sym326$KCTR_TEST_SET_RUNSTATE = SubLObjectFactory.makeSymbol("KCTR-TEST-SET-RUNSTATE");
        $sym327$_CSETF_KCTR_TEST_SET_RUNSTATE = SubLObjectFactory.makeSymbol("_CSETF-KCTR-TEST-SET-RUNSTATE");
        $sym328$KCTR_RUN_STATUS = SubLObjectFactory.makeSymbol("KCTR-RUN-STATUS");
        $sym329$_CSETF_KCTR_RUN_STATUS = SubLObjectFactory.makeSymbol("_CSETF-KCTR-RUN-STATUS");
        $sym330$KCTR_START = SubLObjectFactory.makeSymbol("KCTR-START");
        $sym331$_CSETF_KCTR_START = SubLObjectFactory.makeSymbol("_CSETF-KCTR-START");
        $sym332$KCTR_END = SubLObjectFactory.makeSymbol("KCTR-END");
        $sym333$_CSETF_KCTR_END = SubLObjectFactory.makeSymbol("_CSETF-KCTR-END");
        $kw334$TEST_SPEC = SubLObjectFactory.makeKeyword("TEST-SPEC");
        $kw335$QUERY_RUNSTATE = SubLObjectFactory.makeKeyword("QUERY-RUNSTATE");
        $kw336$TEST_SET_RUNSTATE = SubLObjectFactory.makeKeyword("TEST-SET-RUNSTATE");
        $kw337$START = SubLObjectFactory.makeKeyword("START");
        $sym338$MAKE_KCT_RUNSTATE = SubLObjectFactory.makeSymbol("MAKE-KCT-RUNSTATE");
        $sym339$VISIT_DEFSTRUCT_OBJECT_KCT_RUNSTATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-KCT-RUNSTATE-METHOD");
        $sym340$KCT_SET_RUNSTATE_P = SubLObjectFactory.makeSymbol("KCT-SET-RUNSTATE-P");
        $str341$KCT_Runstate_Lock = SubLObjectFactory.makeString("KCT Runstate Lock");
        $sym342$KCT_TEST_RUN_P = SubLObjectFactory.makeSymbol("KCT-TEST-RUN-P");
        $sym343$KCT_SET_RUNSTATE = SubLObjectFactory.makeSymbol("KCT-SET-RUNSTATE");
        $list344 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-SET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-RUNSTATES"), (SubLObject)SubLObjectFactory.makeSymbol("RUN-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $list345 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-SET"), (SubLObject)SubLObjectFactory.makeKeyword("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-RUNSTATES"), (SubLObject)SubLObjectFactory.makeKeyword("RUN-STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"));
        $list346 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KCTSR-ID"), (SubLObject)SubLObjectFactory.makeSymbol("KCTSR-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("KCTSR-TEST-SET"), (SubLObject)SubLObjectFactory.makeSymbol("KCTSR-RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("KCTSR-TEST-RUNSTATES"), (SubLObject)SubLObjectFactory.makeSymbol("KCTSR-RUN-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("KCTSR-START"), (SubLObject)SubLObjectFactory.makeSymbol("KCTSR-END"));
        $list347 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KCTSR-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KCTSR-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KCTSR-TEST-SET"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KCTSR-RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KCTSR-TEST-RUNSTATES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KCTSR-RUN-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KCTSR-START"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KCTSR-END"));
        $sym348$KCT_SET_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("KCT-SET-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE");
        $list349 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KCT-SET-RUNSTATE-P"));
        $sym350$KCTSR_ID = SubLObjectFactory.makeSymbol("KCTSR-ID");
        $sym351$_CSETF_KCTSR_ID = SubLObjectFactory.makeSymbol("_CSETF-KCTSR-ID");
        $sym352$KCTSR_LOCK = SubLObjectFactory.makeSymbol("KCTSR-LOCK");
        $sym353$_CSETF_KCTSR_LOCK = SubLObjectFactory.makeSymbol("_CSETF-KCTSR-LOCK");
        $sym354$KCTSR_TEST_SET = SubLObjectFactory.makeSymbol("KCTSR-TEST-SET");
        $sym355$_CSETF_KCTSR_TEST_SET = SubLObjectFactory.makeSymbol("_CSETF-KCTSR-TEST-SET");
        $sym356$KCTSR_RESULT = SubLObjectFactory.makeSymbol("KCTSR-RESULT");
        $sym357$_CSETF_KCTSR_RESULT = SubLObjectFactory.makeSymbol("_CSETF-KCTSR-RESULT");
        $sym358$KCTSR_TEST_RUNSTATES = SubLObjectFactory.makeSymbol("KCTSR-TEST-RUNSTATES");
        $sym359$_CSETF_KCTSR_TEST_RUNSTATES = SubLObjectFactory.makeSymbol("_CSETF-KCTSR-TEST-RUNSTATES");
        $sym360$KCTSR_RUN_STATUS = SubLObjectFactory.makeSymbol("KCTSR-RUN-STATUS");
        $sym361$_CSETF_KCTSR_RUN_STATUS = SubLObjectFactory.makeSymbol("_CSETF-KCTSR-RUN-STATUS");
        $sym362$KCTSR_START = SubLObjectFactory.makeSymbol("KCTSR-START");
        $sym363$_CSETF_KCTSR_START = SubLObjectFactory.makeSymbol("_CSETF-KCTSR-START");
        $sym364$KCTSR_END = SubLObjectFactory.makeSymbol("KCTSR-END");
        $sym365$_CSETF_KCTSR_END = SubLObjectFactory.makeSymbol("_CSETF-KCTSR-END");
        $kw366$TEST_SET = SubLObjectFactory.makeKeyword("TEST-SET");
        $kw367$TEST_RUNSTATES = SubLObjectFactory.makeKeyword("TEST-RUNSTATES");
        $sym368$MAKE_KCT_SET_RUNSTATE = SubLObjectFactory.makeSymbol("MAKE-KCT-SET-RUNSTATE");
        $sym369$VISIT_DEFSTRUCT_OBJECT_KCT_SET_RUNSTATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-KCT-SET-RUNSTATE-METHOD");
        $sym370$KCT_TEST_COLLECTION_P = SubLObjectFactory.makeSymbol("KCT-TEST-COLLECTION-P");
        $str371$KCT_Set_Runstate_Lock = SubLObjectFactory.makeString("KCT Set Runstate Lock");
        $sym372$KCT_ERROR_RESULT_P = SubLObjectFactory.makeSymbol("KCT-ERROR-RESULT-P");
        $sym373$KCT_TEST_RUN_STATUS = SubLObjectFactory.makeSymbol("KCT-TEST-RUN-STATUS");
        $sym374$KCT_FAILURE_RESULT_P = SubLObjectFactory.makeSymbol("KCT-FAILURE-RESULT-P");
        $sym375$KCT_TEST_SET_RUN_P = SubLObjectFactory.makeSymbol("KCT-TEST-SET-RUN-P");
        $list376 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-SET-RUN"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-RUN"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list377 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw378$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym379$STREAM = SubLObjectFactory.makeUninternedSymbol("STREAM");
        $sym380$DONE_VAR = SubLObjectFactory.makeUninternedSymbol("DONE-VAR");
        $sym381$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym382$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list383 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $sym384$WITH_PRIVATE_BINARY_FILE = SubLObjectFactory.makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $list385 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT"));
        $sym386$WITH_CFASL_COMMON_SYMBOLS_SIMPLE = SubLObjectFactory.makeSymbol("WITH-CFASL-COMMON-SYMBOLS-SIMPLE");
        $list387 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KBQ-CFASL-COMMON-SYMBOLS-SIMPLE"));
        $sym388$WITH_NEW_CFASL_INPUT_GUID_STRING_RESOURCE = SubLObjectFactory.makeSymbol("WITH-NEW-CFASL-INPUT-GUID-STRING-RESOURCE");
        $sym389$KBQ_LOAD_QUERY_SET_RUN_INT = SubLObjectFactory.makeSymbol("KBQ-LOAD-QUERY-SET-RUN-INT");
        $sym390$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym391$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym392$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym393$KBQ_LOAD_QUERY_RUN_INT = SubLObjectFactory.makeSymbol("KBQ-LOAD-QUERY-RUN-INT");
        $sym394$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list395 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EOF"));
        $list396 = ConsesLow.list((SubLObject)kbq_query_run.T);
        $sym397$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym398$KBQ_NCLEAN_QUERY_RUN = SubLObjectFactory.makeSymbol("KBQ-NCLEAN-QUERY-RUN");
        $list399 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-RUN"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym400$QUERY_SET_RUN = SubLObjectFactory.makeUninternedSymbol("QUERY-SET-RUN");
        $sym401$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym402$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw403$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw404$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str405$dwimming__s_to_NIL = SubLObjectFactory.makeString("dwimming ~s to NIL");
        $str406$_cfasl = SubLObjectFactory.makeString(".cfasl");
        $str407$_no_results = SubLObjectFactory.makeString("-no-results");
        $str408$Expected_a__a_file__got__s = SubLObjectFactory.makeString("Expected a ~a file, got ~s");
        $str409$answerable_sub_run_of_____A = SubLObjectFactory.makeString("answerable sub-run of :~%~A");
        $sym410$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym411$KCT_TEST_RUN_ANSWER_COUNT = SubLObjectFactory.makeSymbol("KCT-TEST-RUN-ANSWER-COUNT");
        $str412$succeeding_sub_run_of_____A = SubLObjectFactory.makeString("succeeding sub-run of :~%~A");
        $sym413$KCT_SUCCESS_RESULT_P = SubLObjectFactory.makeSymbol("KCT-SUCCESS-RESULT-P");
        $str414$unanswerable_sub_run_of__ = SubLObjectFactory.makeString("unanswerable sub-run of :");
        $sym415$ZEROP = SubLObjectFactory.makeSymbol("ZEROP");
        $str416$failing_sub_run_of_____A = SubLObjectFactory.makeString("failing sub-run of :~%~A");
        $const417$CommonSenseTest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonSenseTest"));
        $const418$KBContentRegressionTest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KBContentRegressionTest"));
        $str419$_s_sub_run_of_____A = SubLObjectFactory.makeString("~s sub-run of :~%~A");
        $list420 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERED-QUERY-SET-RUN-1"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED-QUERY-SET-RUN-2"));
        $sym421$NOT_EQL = SubLObjectFactory.makeSymbol("NOT-EQL");
        $str422$filtered_to_queries = SubLObjectFactory.makeString("filtered to queries");
        $sym423$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_NOT_LAMBDA = SubLObjectFactory.makeSymbol("KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-NOT-LAMBDA");
        $sym424$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_LAMBDA = SubLObjectFactory.makeSymbol("KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-LAMBDA");
        $str425$filtered_to_tests = SubLObjectFactory.makeString("filtered to tests");
        $sym426$KCT_FILTER_TEST_SET_RUN_TO_TESTS_NOT_LAMBDA = SubLObjectFactory.makeSymbol("KCT-FILTER-TEST-SET-RUN-TO-TESTS-NOT-LAMBDA");
        $sym427$KCT_FILTER_TEST_SET_RUN_TO_TESTS_LAMBDA = SubLObjectFactory.makeSymbol("KCT-FILTER-TEST-SET-RUN-TO-TESTS-LAMBDA");
        $sym428$CACHED_ALL_INSTANCES_AMONG = SubLObjectFactory.makeSymbol("CACHED-ALL-INSTANCES-AMONG");
        $sym429$_CACHED_ALL_INSTANCES_AMONG_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-ALL-INSTANCES-AMONG-CACHING-STATE*");
        $sym430$CLEAR_CACHED_ALL_INSTANCES_AMONG = SubLObjectFactory.makeSymbol("CLEAR-CACHED-ALL-INSTANCES-AMONG");
        $list431 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIRST-QUERY-SET-RUN"), (SubLObject)SubLObjectFactory.makeSymbol("REST-QUERY-SET-RUNS"));
        $list432 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIRST-TEST-SET-RUN"), (SubLObject)SubLObjectFactory.makeSymbol("REST-TEST-SET-RUNS"));
        $sym433$KCT_SUCCEEDING_TEST_SET_RUN = SubLObjectFactory.makeSymbol("KCT-SUCCEEDING-TEST-SET-RUN");
        $sym434$_ = SubLObjectFactory.makeSymbol(">");
        $sym435$FOURTH = SubLObjectFactory.makeSymbol("FOURTH");
        $sym436$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list437 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("MISSING-FROM-1"), (SubLObject)SubLObjectFactory.makeSymbol("MISSING-FROM-2"));
        $list438 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("MISSING-FROM-1"), (SubLObject)SubLObjectFactory.makeKeyword("MISSING-FROM-2"));
        $kw439$MISSING_FROM_1 = SubLObjectFactory.makeKeyword("MISSING-FROM-1");
        $kw440$MISSING_FROM_2 = SubLObjectFactory.makeKeyword("MISSING-FROM-2");
        $kw441$ANSWERABLE_2 = SubLObjectFactory.makeKeyword("ANSWERABLE-2");
        $kw442$MORE_ANSWERS_2 = SubLObjectFactory.makeKeyword("MORE-ANSWERS-2");
        $kw443$DIFFERENT_ANSWERS = SubLObjectFactory.makeKeyword("DIFFERENT-ANSWERS");
        $kw444$MORE_ANSWERS_1 = SubLObjectFactory.makeKeyword("MORE-ANSWERS-1");
        $kw445$ANSWERABLE_1 = SubLObjectFactory.makeKeyword("ANSWERABLE-1");
        $str446$_S_and__S_are_different_queries = SubLObjectFactory.makeString("~S and ~S are different queries");
        $str447$_S_has_no_result = SubLObjectFactory.makeString("~S has no result");
        $str448$query_set_runs_contained_differen = SubLObjectFactory.makeString("query set runs contained different queries");
        $str449$_s__s__s__s__s__ = SubLObjectFactory.makeString("~s ~s ~s ~s ~s~%");
        $str450$_s__s__s__ = SubLObjectFactory.makeString("~s ~s ~s~%");
        $kw451$CHANGE = SubLObjectFactory.makeKeyword("CHANGE");
        $kw452$BECAME_SUCCESS = SubLObjectFactory.makeKeyword("BECAME-SUCCESS");
        $kw453$BECAME_FAILURE = SubLObjectFactory.makeKeyword("BECAME-FAILURE");
        $str454$unexpected_change__S = SubLObjectFactory.makeString("unexpected change ~S");
        $str455$_S_and__S_are_different_tests = SubLObjectFactory.makeString("~S and ~S are different tests");
        $str456$_S_has_no_status = SubLObjectFactory.makeString("~S has no status");
        $kw457$UNDEFINED = SubLObjectFactory.makeKeyword("UNDEFINED");
        $list458 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TOTAL"), SubLObjectFactory.makeKeyword("INCREASE"), SubLObjectFactory.makeKeyword("TOTAL-SUCCESS"), SubLObjectFactory.makeKeyword("INCREASE"), SubLObjectFactory.makeKeyword("TOTAL-FAILURE"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("TOTAL-ERROR"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("TOTAL-LUMPY"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("TOTAL-ANSWERABLE"), SubLObjectFactory.makeKeyword("INCREASE"), SubLObjectFactory.makeKeyword("TOTAL-UNANSWERABLE"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("SUM-ANSWER-COUNT"), SubLObjectFactory.makeKeyword("INCREASE"), SubLObjectFactory.makeKeyword("MEAN-ANSWER-COUNT"), SubLObjectFactory.makeKeyword("INCREASE"), SubLObjectFactory.makeKeyword("MEDIAN-ANSWER-COUNT"), SubLObjectFactory.makeKeyword("INCREASE"), SubLObjectFactory.makeKeyword("MEAN-TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("MEDIAN-TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("STDEV-TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("NEITHER"), SubLObjectFactory.makeKeyword("MEAN-COMPLETE-TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("MEDIAN-COMPLETE-TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("STDEV-COMPLETE-TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("NEITHER"), SubLObjectFactory.makeKeyword("MEAN-TIME-TO-LAST-ANSWER"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("MEDIAN-TIME-TO-LAST-ANSWER"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("STDEV-TIME-TO-LAST-ANSWER"), SubLObjectFactory.makeKeyword("NEITHER"), SubLObjectFactory.makeKeyword("SUM-ANSWERABILITY-TIME"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("MEAN-ANSWERABILITY-TIME"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("STDEV-ANSWERABILITY-TIME"), SubLObjectFactory.makeKeyword("NEITHER"), SubLObjectFactory.makeKeyword("MEDIAN-ANSWERABILITY-TIME"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("SUM-TOTAL-TIME"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("MEAN-TOTAL-TIME"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("STDEV-TOTAL-TIME"), SubLObjectFactory.makeKeyword("NEITHER"), SubLObjectFactory.makeKeyword("MEDIAN-TOTAL-TIME"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("SUM-COMPLETE-TOTAL-TIME"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("MEAN-COMPLETE-TOTAL-TIME"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("STDEV-COMPLETE-TOTAL-TIME"), SubLObjectFactory.makeKeyword("NEITHER"), SubLObjectFactory.makeKeyword("MEDIAN-COMPLETE-TOTAL-TIME"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("MEDIAN-TIME-PER-ANSWER"), SubLObjectFactory.makeKeyword("DECREASE"), SubLObjectFactory.makeKeyword("MEDIAN-COMPLETE-TIME-PER-ANSWER"), SubLObjectFactory.makeKeyword("DECREASE") });
        $list459 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INCREASE"), (SubLObject)SubLObjectFactory.makeKeyword("DECREASE"), (SubLObject)SubLObjectFactory.makeKeyword("NEITHER"));
        $kw460$NEITHER = SubLObjectFactory.makeKeyword("NEITHER");
        $kw461$INCREASE = SubLObjectFactory.makeKeyword("INCREASE");
        $str462$empty__ = SubLObjectFactory.makeString("empty~%");
        $kw463$TOTAL = SubLObjectFactory.makeKeyword("TOTAL");
        $kw464$TOTAL_ANSWERABLE = SubLObjectFactory.makeKeyword("TOTAL-ANSWERABLE");
        $kw465$TOTAL_UNANSWERABLE = SubLObjectFactory.makeKeyword("TOTAL-UNANSWERABLE");
        $kw466$TOTAL_ERROR = SubLObjectFactory.makeKeyword("TOTAL-ERROR");
        $kw467$TOTAL_LUMPY = SubLObjectFactory.makeKeyword("TOTAL-LUMPY");
        $kw468$SUM_ANSWER_COUNT = SubLObjectFactory.makeKeyword("SUM-ANSWER-COUNT");
        $kw469$MEAN_ANSWER_COUNT = SubLObjectFactory.makeKeyword("MEAN-ANSWER-COUNT");
        $kw470$MEDIAN_ANSWER_COUNT = SubLObjectFactory.makeKeyword("MEDIAN-ANSWER-COUNT");
        $kw471$SUM_HYPOTHESIZATION_TIME = SubLObjectFactory.makeKeyword("SUM-HYPOTHESIZATION-TIME");
        $kw472$STDEV_HYPOTHESIZATION_TIME = SubLObjectFactory.makeKeyword("STDEV-HYPOTHESIZATION-TIME");
        $kw473$SUM_TOTAL_TIME = SubLObjectFactory.makeKeyword("SUM-TOTAL-TIME");
        $kw474$STDEV_TOTAL_TIME = SubLObjectFactory.makeKeyword("STDEV-TOTAL-TIME");
        $kw475$SUM_COMPLETE_TOTAL_TIME = SubLObjectFactory.makeKeyword("SUM-COMPLETE-TOTAL-TIME");
        $kw476$MEAN_COMPLETE_TOTAL_TIME = SubLObjectFactory.makeKeyword("MEAN-COMPLETE-TOTAL-TIME");
        $kw477$MEDIAN_COMPLETE_TOTAL_TIME = SubLObjectFactory.makeKeyword("MEDIAN-COMPLETE-TOTAL-TIME");
        $kw478$STDEV_COMPLETE_TOTAL_TIME = SubLObjectFactory.makeKeyword("STDEV-COMPLETE-TOTAL-TIME");
        $kw479$SUM_TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("SUM-TIME-TO-FIRST-ANSWER");
        $kw480$STDEV_TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("STDEV-TIME-TO-FIRST-ANSWER");
        $kw481$SUM_COMPLETE_TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("SUM-COMPLETE-TIME-TO-FIRST-ANSWER");
        $kw482$MEAN_COMPLETE_TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("MEAN-COMPLETE-TIME-TO-FIRST-ANSWER");
        $kw483$MEDIAN_COMPLETE_TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("MEDIAN-COMPLETE-TIME-TO-FIRST-ANSWER");
        $kw484$STDEV_COMPLETE_TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("STDEV-COMPLETE-TIME-TO-FIRST-ANSWER");
        $kw485$SUM_ANSWERABILITY_TIME = SubLObjectFactory.makeKeyword("SUM-ANSWERABILITY-TIME");
        $kw486$MEAN_ANSWERABILITY_TIME = SubLObjectFactory.makeKeyword("MEAN-ANSWERABILITY-TIME");
        $kw487$MEDIAN_ANSWERABILITY_TIME = SubLObjectFactory.makeKeyword("MEDIAN-ANSWERABILITY-TIME");
        $kw488$STDEV_ANSWERABILITY_TIME = SubLObjectFactory.makeKeyword("STDEV-ANSWERABILITY-TIME");
        $kw489$SUM_TIME_TO_LAST_ANSWER = SubLObjectFactory.makeKeyword("SUM-TIME-TO-LAST-ANSWER");
        $kw490$STDEV_TIME_TO_LAST_ANSWER = SubLObjectFactory.makeKeyword("STDEV-TIME-TO-LAST-ANSWER");
        $kw491$MEDIAN_COMPLETE_TIME_PER_ANSWER = SubLObjectFactory.makeKeyword("MEDIAN-COMPLETE-TIME-PER-ANSWER");
        $str492$ignoring_metric__S = SubLObjectFactory.makeString("ignoring metric ~S");
        $kw493$MEDIAN_TIME_PER_ANSWER = SubLObjectFactory.makeKeyword("MEDIAN-TIME-PER-ANSWER");
        $kw494$TOTAL_SUCCESS = SubLObjectFactory.makeKeyword("TOTAL-SUCCESS");
        $kw495$TOTAL_FAILURE = SubLObjectFactory.makeKeyword("TOTAL-FAILURE");
        $kw496$PERCENT_SUCCESS = SubLObjectFactory.makeKeyword("PERCENT-SUCCESS");
        $kw497$PERCENT_FAILURE = SubLObjectFactory.makeKeyword("PERCENT-FAILURE");
        $sym498$KCT_TEST_RUN_QUERY_RUN = SubLObjectFactory.makeSymbol("KCT-TEST-RUN-QUERY-RUN");
        $list499 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWERABILITY-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT"));
        $str500$_0 = SubLObjectFactory.makeString(":0");
        $sym501$BOUND_SYMBOL_P = SubLObjectFactory.makeSymbol("BOUND-SYMBOL-P");
        $str502$____Answerability_analysis____ = SubLObjectFactory.makeString("~%~%Answerability analysis: ~%");
        $str503$Total_____________s__s__s__ = SubLObjectFactory.makeString("Total:           ~s ~s ~s~%");
        $str504$____Basic_analysis____ = SubLObjectFactory.makeString("~%~%Basic analysis: ~%");
        $str505$____Mutually_Answerable____ = SubLObjectFactory.makeString("~%~%Mutually Answerable: ~%");
        $str506$____Answerable____ = SubLObjectFactory.makeString("~%~%Answerable: ~%");
        $str507$____Unanswerable____ = SubLObjectFactory.makeString("~%~%Unanswerable: ~%");
        $list508 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOTH"), (SubLObject)SubLObjectFactory.makeKeyword("BASELINE"));
        $str509$Mutually_Answerable_ = SubLObjectFactory.makeString("Mutually Answerable ");
        $sym510$KBQ_LUMPY_QUERY_RUN_ = SubLObjectFactory.makeSymbol("KBQ-LUMPY-QUERY-RUN?");
        $str511$Unable_to_compute_any_metrics = SubLObjectFactory.makeString("Unable to compute any metrics");
        $sym512$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $str513$_____Total_Tests____4D = SubLObjectFactory.makeString("~%;; Total Tests : ~4D");
        $str514$______Successes_____4D___S___ = SubLObjectFactory.makeString("~%;;  Successes  : ~4D (~S %)");
        $str515$______Failures______4D___S___ = SubLObjectFactory.makeString("~%;;  Failures   : ~4D (~S %)");
        $str516$_______Test_Set_Metrics__ = SubLObjectFactory.makeString("~%~%;; Test Set Metrics~%");
        $str517$____Test____S = SubLObjectFactory.makeString("~%~%Test : ~S");
        $str518$__Status____S = SubLObjectFactory.makeString("~%Status : ~S");
        $str519$__Halt_Reason____S = SubLObjectFactory.makeString("~%Halt Reason : ~S");
        $str520$___S__S = SubLObjectFactory.makeString("~%~S ~S");
        $sym521$KBQ_QUERY_RUN_HALT_REASON = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-HALT-REASON");
        $list522 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOTAL"), (SubLObject)kbq_query_run.ZERO_INTEGER);
        $int523$3600 = SubLObjectFactory.makeInteger(3600);
        $str524$Running_kbq_benchmark__kbq_benchm = SubLObjectFactory.makeString("Running kbq benchmark (kbq-benchmark-report ");
        $str525$_ = SubLObjectFactory.makeString(")");
        $sym526$KBQ_BENCHMARK_RUN = SubLObjectFactory.makeSymbol("KBQ-BENCHMARK-RUN");
        $str527$kbq_benchmark__kbq_benchmark_repo = SubLObjectFactory.makeString("kbq benchmark (kbq-benchmark-report ~S) in background");
        $sym528$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym529$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str530$_______A______ = SubLObjectFactory.makeString("~&*** ~A ***~%");
        $str531$____overriding_query_properties__ = SubLObjectFactory.makeString("*** overriding-query-properties: ~A ***~%");
        $str532$Tests_run_in_System__A_KB__A__ = SubLObjectFactory.makeString("Tests run in System ~A KB ~A~%");
        $const533$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $sym534$KCT_QUERY_SPECIFICATION = SubLObjectFactory.makeSymbol("KCT-QUERY-SPECIFICATION");
        $list535 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI-QUERY-TOTAL-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI-QUERY-START-TIMES"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME"));
        $str536$__ANS__TTFS____TTFA__SQ____SKSI__ = SubLObjectFactory.makeString(" #ANS  TTFS    TTFA #SQ    SKSI +  CYC =  TOTAL   (%SQ)  TEST~%");
        $str537$_________________________________ = SubLObjectFactory.makeString("---------------------------------------------------------------------~%");
        $kw538$SKSI_QUERY_START_TIMES = SubLObjectFactory.makeKeyword("SKSI-QUERY-START-TIMES");
        $kw539$SKSI_QUERY_TOTAL_TIME = SubLObjectFactory.makeKeyword("SKSI-QUERY-TOTAL-TIME");
        $str540$_5D__5_1F__7_1F_4D__7_1F__7_1F__7 = SubLObjectFactory.makeString("~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%) ~A~A~%");
        $kw541$EXHAUST_TOTAL = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $str542$___A_ = SubLObjectFactory.makeString(" (~A)");
        $str543$_5D__5_1F__7_1F_4D__7_1F__7_1F__7 = SubLObjectFactory.makeString("~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%)~%");
        $list544 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("/"));
        $int545$60 = SubLObjectFactory.makeInteger(60);
        $str546$_15A___5D__5_1F__7_1F_4D__7_1F__7 = SubLObjectFactory.makeString("~15A: ~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%) ~30A~%");
        $str547$Running__A_queries_using__proof_s = SubLObjectFactory.makeString("Running ~A queries using :proof-specs");
        $kw548$PROOF_SPEC = SubLObjectFactory.makeKeyword("PROOF-SPEC");
        $kw549$COMPUTE_ANSWER_JUSTIFICATIONS_ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $str550$______Test___A = SubLObjectFactory.makeString("~&~%~%Test: ~A");
        $str551$__Query___A = SubLObjectFactory.makeString("~&Query: ~A");
        $const552$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $str553$____Answer___A__A____A = SubLObjectFactory.makeString("~&~%Answer (~A/~A): ~A");
        $str554$__Justification__ = SubLObjectFactory.makeString("~&Justification: ");
        $sym555$UNKNOWN_SENTENCE_SUPPORT_P = SubLObjectFactory.makeSymbol("UNKNOWN-SENTENCE-SUPPORT-P");
        $sym556$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $sym557$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE>");
        $const558$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $str559$___Mt___A = SubLObjectFactory.makeString("~& Mt: ~A");
        $const560$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const561$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $sym562$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const563$SKSIContentTest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIContentTest"));
        $kw564$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw565$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw566$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym567$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $str568$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym569$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw570$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str571$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw572$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str573$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str574$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str575$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list576 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str577$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $kw578$GAF = SubLObjectFactory.makeKeyword("GAF");
        $str579$_a___s____ = SubLObjectFactory.makeString("~a~%~s~%~%");
        $str580$__________Overview___________All_ = SubLObjectFactory.makeString("\n========\nOverview\n========\n\nAll #$SKSIContentTests~%");
        $str581$__All___SKSIContentTests_marked_a = SubLObjectFactory.makeString("~%All #$SKSIContentTests marked as #$KBContentRegressionTests~%");
        $str582$____SKSIContentTests_using_source = SubLObjectFactory.makeString("~%#$SKSIContentTests using sources we care about ~a~%");
        $str583$____SKSIContentTests_marked_as___ = SubLObjectFactory.makeString("~%#$SKSIContentTests marked as #$KBContentRegressionTests using sources we care about~%");
        $str584$______________________Breakdown_b = SubLObjectFactory.makeString("\n\n===================\nBreakdown by source\n===================~%~%");
        $str585$_a__ = SubLObjectFactory.makeString("~a~%");
        $str586$_ = SubLObjectFactory.makeString("-");
        $str587$______SKSIContentTests_that_use__ = SubLObjectFactory.makeString("~%~%#$SKSIContentTests that use ~a~%");
        $str588$____SKSIContentTests_marked_as___ = SubLObjectFactory.makeString("~%#$SKSIContentTests marked as #$KBContentRegressionTests that use ~a~%");
        $str589$__Failure_analysis_______ = SubLObjectFactory.makeString("~%Failure analysis:~%~%~%");
        $list590 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryFn"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeInteger(212), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-INFERENCE-ERROR-HANDLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("zyxwvut"))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("integerBetween")), (SubLObject)kbq_query_run.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?N"), (SubLObject)kbq_query_run.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?N")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("?N"), (SubLObject)kbq_query_run.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-INFERENCE-ERROR-HANDLING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("zyxwvut"))))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLEEP"), (SubLObject)kbq_query_run.FOUR_INTEGER))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("integerBetween")), (SubLObject)kbq_query_run.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?N"), (SubLObject)kbq_query_run.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performSubL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?N")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLEEP"), (SubLObject)kbq_query_run.TWO_INTEGER)))))) });
        $sym591$COMPUTE_NEW_ROOT_RELATIVE_ANSWER_TIMES = SubLObjectFactory.makeSymbol("COMPUTE-NEW-ROOT-RELATIVE-ANSWER-TIMES");
        $kw592$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw593$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw594$KB = SubLObjectFactory.makeKeyword("KB");
        $kw595$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw596$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list597 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kbq_query_run.ZERO_INTEGER, (SubLObject)kbq_query_run.TEN_INTEGER, (SubLObject)kbq_query_run.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)SubLObjectFactory.makeInteger(40), (SubLObject)SubLObjectFactory.makeInteger(50), (SubLObject)SubLObjectFactory.makeInteger(500)), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.ONE_INTEGER, (SubLObject)kbq_query_run.TWO_INTEGER, (SubLObject)kbq_query_run.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(35), (SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)SubLObjectFactory.makeInteger(212))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kbq_query_run.ZERO_INTEGER, (SubLObject)kbq_query_run.ONE_INTEGER, (SubLObject)kbq_query_run.TWO_INTEGER, (SubLObject)kbq_query_run.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.THREE_INTEGER, (SubLObject)kbq_query_run.FIVE_INTEGER, (SubLObject)kbq_query_run.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(162)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kbq_query_run.ZERO_INTEGER, (SubLObject)kbq_query_run.TEN_INTEGER, (SubLObject)kbq_query_run.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)SubLObjectFactory.makeInteger(40), (SubLObject)SubLObjectFactory.makeInteger(50)), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.ONE_INTEGER, (SubLObject)kbq_query_run.TWO_INTEGER, (SubLObject)kbq_query_run.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(35), (SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)SubLObjectFactory.makeInteger(212))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kbq_query_run.ZERO_INTEGER, (SubLObject)kbq_query_run.ONE_INTEGER, (SubLObject)kbq_query_run.TWO_INTEGER, (SubLObject)kbq_query_run.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.THREE_INTEGER, (SubLObject)kbq_query_run.FIVE_INTEGER, (SubLObject)kbq_query_run.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)kbq_query_run.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(162)))));
    }
    
    public static final class $kbq_runstate_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $lock;
        public SubLObject $query_spec;
        public SubLObject $inference;
        public SubLObject $result;
        public SubLObject $test_runstate;
        public SubLObject $run_status;
        private static final SubLStructDeclNative structDecl;
        
        public $kbq_runstate_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$query_spec = (SubLObject)CommonSymbols.NIL;
            this.$inference = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$test_runstate = (SubLObject)CommonSymbols.NIL;
            this.$run_status = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$kbq_runstate_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$lock;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$query_spec;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$inference;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$result;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$test_runstate;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$run_status;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$lock = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$query_spec = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$inference = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$result = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$test_runstate = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$run_status = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$kbq_runstate_native.class, kbq_query_run.$sym269$KBQ_RUNSTATE, kbq_query_run.$sym270$KBQ_RUNSTATE_P, kbq_query_run.$list271, kbq_query_run.$list272, new String[] { "$id", "$lock", "$query_spec", "$inference", "$result", "$test_runstate", "$run_status" }, kbq_query_run.$list273, kbq_query_run.$list274, kbq_query_run.$sym275$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $kbq_runstate_p$UnaryFunction extends UnaryFunction
    {
        public $kbq_runstate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KBQ-RUNSTATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return kbq_query_run.kbq_runstate_p(arg1);
        }
    }
    
    public static final class $kct_runstate_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $lock;
        public SubLObject $test_spec;
        public SubLObject $result;
        public SubLObject $query_runstate;
        public SubLObject $test_set_runstate;
        public SubLObject $run_status;
        public SubLObject $start;
        public SubLObject $end;
        private static final SubLStructDeclNative structDecl;
        
        public $kct_runstate_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$test_spec = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$query_runstate = (SubLObject)CommonSymbols.NIL;
            this.$test_set_runstate = (SubLObject)CommonSymbols.NIL;
            this.$run_status = (SubLObject)CommonSymbols.NIL;
            this.$start = (SubLObject)CommonSymbols.NIL;
            this.$end = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$kct_runstate_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$lock;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$test_spec;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$result;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$query_runstate;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$test_set_runstate;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$run_status;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$start;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$end;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$lock = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$test_spec = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$result = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$query_runstate = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$test_set_runstate = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$run_status = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$start = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$end = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$kct_runstate_native.class, kbq_query_run.$sym309$KCT_RUNSTATE, kbq_query_run.$sym304$KCT_RUNSTATE_P, kbq_query_run.$list310, kbq_query_run.$list311, new String[] { "$id", "$lock", "$test_spec", "$result", "$query_runstate", "$test_set_runstate", "$run_status", "$start", "$end" }, kbq_query_run.$list312, kbq_query_run.$list313, kbq_query_run.$sym275$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $kct_runstate_p$UnaryFunction extends UnaryFunction
    {
        public $kct_runstate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KCT-RUNSTATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return kbq_query_run.kct_runstate_p(arg1);
        }
    }
    
    public static final class $kct_set_runstate_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $lock;
        public SubLObject $test_set;
        public SubLObject $result;
        public SubLObject $test_runstates;
        public SubLObject $run_status;
        public SubLObject $start;
        public SubLObject $end;
        private static final SubLStructDeclNative structDecl;
        
        public $kct_set_runstate_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$test_set = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$test_runstates = (SubLObject)CommonSymbols.NIL;
            this.$run_status = (SubLObject)CommonSymbols.NIL;
            this.$start = (SubLObject)CommonSymbols.NIL;
            this.$end = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$kct_set_runstate_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$lock;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$test_set;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$result;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$test_runstates;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$run_status;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$start;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$end;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$lock = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$test_set = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$result = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$test_runstates = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$run_status = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$start = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$end = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$kct_set_runstate_native.class, kbq_query_run.$sym343$KCT_SET_RUNSTATE, kbq_query_run.$sym340$KCT_SET_RUNSTATE_P, kbq_query_run.$list344, kbq_query_run.$list345, new String[] { "$id", "$lock", "$test_set", "$result", "$test_runstates", "$run_status", "$start", "$end" }, kbq_query_run.$list346, kbq_query_run.$list347, kbq_query_run.$sym275$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $kct_set_runstate_p$UnaryFunction extends UnaryFunction
    {
        public $kct_set_runstate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KCT-SET-RUNSTATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return kbq_query_run.kct_set_runstate_p(arg1);
        }
    }
    
    public static final class $clear_cached_all_instances_among$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_cached_all_instances_among$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-CACHED-ALL-INSTANCES-AMONG"));
        }
        
        @Override
		public SubLObject processItem() {
            return kbq_query_run.clear_cached_all_instances_among();
        }
    }
}

/*

	Total time: 5514 ms
	 synthetic 
*/