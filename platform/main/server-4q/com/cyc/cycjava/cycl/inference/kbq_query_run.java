package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_cleanup;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.special_variable_state;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_thinking;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_variables;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
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
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class kbq_query_run extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "643959a39fba5e8cf36fdec4832d1d5e3030bd7713073b508e83afa764e60d6b";
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1100L)
    private static SubLSymbol $kct_set_runstate$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1300L)
    private static SubLSymbol $kct_runstate$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1400L)
    private static SubLSymbol $kbq_runstate$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1700L)
    private static SubLSymbol $kbq_old_cfasl_common_symbols$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 2200L)
    private static SubLSymbol $kbq_new_cfasl_common_symbols$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5200L)
    private static SubLSymbol $kbq_cfasl_common_symbols$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5400L)
    private static SubLSymbol $kbq_cfasl_common_symbols_simple$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5800L)
    private static SubLSymbol $kct_old_cfasl_common_symbols$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 6000L)
    private static SubLSymbol $kct_cfasl_common_symbols$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 6200L)
    public static SubLSymbol $kbq_outlier_timeout$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 6300L)
    public static SubLSymbol $kbq_internal_time_units_per_second$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31700L)
    public static SubLSymbol $kbq_run_number$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 45400L)
    private static SubLSymbol $kct_test_metric_table$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 58300L)
    public static SubLSymbol $kbq_default_outlier_timeout$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62900L)
    private static SubLSymbol $kbq_test_collection_to_query_set_query$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 70900L)
    private static SubLSymbol $last_query_set_run$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 80300L)
    private static SubLSymbol $last_test_set_run$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92100L)
    private static SubLSymbol $runstate_isg$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92300L)
    private static SubLSymbol $runstate_index$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLSymbol $dtp_kbq_runstate$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLSymbol $dtp_kct_runstate$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLSymbol $dtp_kct_set_runstate$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 115500L)
    public static SubLSymbol $query_set_run_file_extension$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 137500L)
    private static SubLSymbol $kbq_filter_query_set_run_to_queries$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 138500L)
    private static SubLSymbol $kct_filter_test_set_run_to_tests$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140100L)
    private static SubLSymbol $cached_all_instances_among_caching_state$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 159600L)
    public static SubLSymbol $kbq_summary_statistics$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 180900L)
    public static SubLSymbol $kbq_progress_stream$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 181100L)
    public static SubLSymbol $kbq_benchmark_outlier_timeout$;
    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 196600L)
    private static SubLSymbol $kbq_test_query_set$;
    private static SubLSymbol $SUCCESS;
    private static SubLSymbol $FAILURE;
    private static SubLSymbol $ERROR;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLSymbol $sym5$KBQ_CFASL_COMMON_SYMBOLS;
    private static SubLSymbol $sym6$DO_QUERY_SET_RUN;
    private static SubLSymbol $sym7$KBQ_CFASL_COMMON_SYMBOLS_SIMPLE;
    private static SubLSymbol $sym8$VECTOR;
    private static SubLList $list9;
    private static SubLInteger $int$600;
    private static SubLList $list11;
    private static SubLSymbol $sym12$CLET;
    private static SubLSymbol $sym13$_KBQ_INTERNAL_TIME_UNITS_PER_SECOND_;
    private static SubLSymbol $sym14$KBQ_QUERY_SET_RUN_INTERNAL_TIME_UNITS_PER_SECOND;
    private static SubLSymbol $RESULT;
    private static SubLSymbol $QUERY;
    private static SubLSymbol $MISSING;
    private static SubLSymbol $ANSWER_COUNT;
    private static SubLSymbol $HYPOTHESIZATION_TIME;
    private static SubLSymbol $TOTAL_TIME;
    private static SubLSymbol $COMPLETE_TOTAL_TIME;
    private static SubLSymbol $TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $TIME_TO_LAST_ANSWER;
    private static SubLSymbol $COMPLETE_TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $COMPLETE_TIME_TO_LAST_ANSWER;
    private static SubLSymbol $TOTAL_STEPS;
    private static SubLSymbol $STEPS_TO_FIRST_ANSWER;
    private static SubLSymbol $STEPS_TO_LAST_ANSWER;
    private static SubLSymbol $HALT_REASON;
    private static SubLSymbol $ORIGIN;
    private static SubLSymbol $WASTED_TIME_AFTER_LAST_ANSWER;
    private static SubLSymbol $LATENCY_IMPROVEMENT_FROM_ITERATIVITY;
    private static SubLSymbol $SETUP_TIME;
    private static SubLSymbol $TIME_PER_ANSWER;
    private static SubLSymbol $COMPLETE_TIME_PER_ANSWER;
    private static SubLSymbol $ANSWERABILITY_TIME;
    private static SubLSymbol $ANSWERABILITY_STEPS;
    private static SubLSymbol $NEW_ROOT_RELATIVE_TOTAL_TIMES;
    private static SubLSymbol $NEW_ROOT_TIMES;
    private static SubLSymbol $NEW_ROOT_RELATIVE_ANSWER_TIMES;
    private static SubLSymbol $ANSWER_TIMES;
    private static SubLSymbol $ESTIMATED_EXHAUSTIVE_PROBLEM_COUNT;
    private static SubLSymbol $ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT;
    private static SubLSymbol $NEW_ROOT_COUNT;
    private static SubLSymbol $PROBLEM_COUNT;
    private static SubLSymbol $ESTIMATED_EXHAUSTIVE_BYTE_COUNT;
    private static SubLSymbol $sym47$_MEDIAN_BYTES_PER_PROBLEM_;
    private static SubLSymbol $TOTAL_NEW_ROOT_INITIAL_REMOVAL_FANOUT;
    private static SubLSymbol $NEW_ROOT_INITIAL_REMOVAL_FANOUTS;
    private static SubLSymbol $QUERY_FUNCALL;
    private static SubLList $list51;
    private static SubLList $list52;
    private static SubLSymbol $QUERY_RUN_FUNCALL;
    private static SubLList $list54;
    private static SubLList $list55;
    private static SubLString $str56$unrecognized_KBQ_property_spec__s;
    private static SubLString $str57$Use_the__with_kbq_query_set_run_m;
    private static SubLString $str58$Use_the__with_kbq_query_set_run__;
    private static SubLList $list59;
    private static SubLSymbol $TAUTOLOGY;
    private static SubLInteger $int$1000;
    private static SubLInteger $int$100;
    private static SubLFloat $float$0_1;
    private static SubLFloat $float$0_01;
    private static SubLSymbol $INFERENCE_PROOF_SPEC;
    private static SubLObject $$sentenceTruth;
    private static SubLInteger $int$_2;
    private static SubLSymbol $sym68$FIRST;
    private static SubLSymbol $TEST;
    private static SubLSymbol $STATUS;
    private static SubLSymbol $QUERY_RUN;
    private static SubLSymbol $MACHINE;
    private static SubLSymbol $DATE;
    private static SubLSymbol $BOGOMIPS;
    private static SubLSymbol $INTERNAL_TIME_UNITS_PER_SECOND;
    private static SubLSymbol $PATCH_LEVEL;
    private static SubLSymbol $COMMENT;
    private static SubLSymbol $QUERY_RUNS;
    private static SubLSymbol $sym79$KBQ_QUERY_SET_RUN_QUERY_RUNS;
    private static SubLList $list80;
    private static SubLList $list81;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $TEST_RUNS;
    private static SubLSymbol $sym84$INVALID_FORT_;
    private static SubLSymbol $sym85$KBQ_RUNNABLE_;
    private static SubLSymbol $sym86$_;
    private static SubLSymbol $sym87$SAFE__;
    private static SubLString $str88$_s_____s__;
    private static SubLSymbol $sym89$KBQ_QUERY_RUN_QUERY;
    private static SubLSymbol $MEDIAN_HYPOTHESIZATION_TIME;
    private static SubLSymbol $MEDIAN_TOTAL_TIME;
    private static SubLSymbol $MEDIAN_TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $MEDIAN_TIME_TO_LAST_ANSWER;
    private static SubLString $str94$what_s_the_median_for__s;
    private static SubLSymbol $MEAN_HYPOTHESIZATION_TIME;
    private static SubLSymbol $MEAN_TOTAL_TIME;
    private static SubLSymbol $MEAN_TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $MEAN_TIME_TO_LAST_ANSWER;
    private static SubLString $str99$what_s_the_mean_for__s;
    private static SubLSymbol $sym100$KBQ_QUERY_RUN_HYPOTHESIZATION_TIME;
    private static SubLSymbol $sym101$KBQ_QUERY_RUN_TOTAL_TIME;
    private static SubLSymbol $sym102$KBQ_QUERY_RUN_TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $sym103$KBQ_QUERY_RUN_TIME_TO_LAST_ANSWER;
    private static SubLSymbol $sym104$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME;
    private static SubLSymbol $sym105$KBQ_QUERY_RUN_COMPLETE_TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $sym106$KBQ_QUERY_RUN_COMPLETE_TIME_TO_LAST_ANSWER;
    private static SubLSymbol $sym107$KBQ_QUERY_RUN_ANSWER_COUNT;
    private static SubLString $str108$unknown_metric__s;
    private static SubLSymbol $sym109$KCT_TEST_SET_RUN_TEST_RUNS;
    private static SubLSymbol $sym110$KCT_TEST_RUN_TEST;
    private static SubLSymbol $sym111$KBQ_QUERY_SPEC_P;
    private static SubLSymbol $sym112$NON_DOTTED_LIST_P;
    private static SubLSymbol $sym113$QUERY_METRIC_P;
    private static SubLSymbol $sym114$NUMBERP;
    private static SubLSymbol $sym115$PROPERTY_LIST_P;
    private static SubLSymbol $sym116$QUERY_PROPERTY_P;
    private static SubLSymbol $CONTINUABLE_;
    private static SubLSymbol $METRICS;
    private static SubLSymbol $BROWSABLE_;
    private static SubLString $str120$___A____;
    private static SubLSymbol $RUNNING;
    private static SubLSymbol $sym122$CATCH_ERROR_MESSAGE_HANDLER;
    private static SubLSymbol $ABORT_KBQ_RUN_QUERY;
    private static SubLString $str124$Abort_KBQ_run_query;
    private static SubLString $str125$KBQ_explicitly_aborted;
    private static SubLSymbol $NEVER_RUN;
    private static SubLSymbol $FINISHED;
    private static SubLString $str128$Outlier_____S;
    private static SubLSymbol $OUTLIER_ABORT;
    private static SubLSymbol $OUTLIER_TIMEOUT;
    private static SubLString $str131$Unable_to_compute_any_inference_m;
    private static SubLString $str132$Unable_to_compute_all_desired_inf;
    private static SubLString $str133$KBQ_harness_error_for__A____A;
    private static SubLString $str134$Error_____S___A;
    private static SubLSymbol $NOT_A_QUERY;
    private static SubLString $str136$Avoided__due_to__S______S;
    private static SubLSymbol $OVERRIDING_QUERY_PROPERTIES;
    private static SubLSymbol $SUBSTITUTIONS;
    private static SubLSymbol $ABORT;
    private static SubLSymbol $sym140$ENSURE_SKSI_MODULES_NEEDED;
    private static SubLObject $$sksiModulesNeeded;
    private static SubLObject $$testFollowupTestFormula_All;
    private static SubLObject $$testFollowupTestFormula_Some;
    private static SubLObject $$testFollowupTestFormula_None;
    private static SubLSymbol $sym145$KCT_TEST_SPEC_P;
    private static SubLSymbol $RETURN;
    private static SubLSymbol $BINDINGS_AND_HYPOTHETICAL_BINDINGS;
    private static SubLObject $$TestMetric_HaltReason;
    private static SubLString $str149$Unsupported_metric__S;
    private static SubLList $list150;
    private static SubLSymbol $PROBLEM_STORE;
    private static SubLList $list152;
    private static SubLSymbol $sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_;
    private static SubLString $str154$Expected_;
    private static SubLString $str155$__but_got_;
    private static SubLString $str156$Expected_exactly_;
    private static SubLString $str157$_binding_sets__but_got_;
    private static SubLString $str158$_;
    private static SubLString $str159$Expected_at_least_;
    private static SubLString $str160$Expected_no_more_than_;
    private static SubLString $str161$;
    private static SubLString $str162$These_expected_bindings_were_miss;
    private static SubLString $str163$These_unwanted_bindings_were_retu;
    private static SubLString $str164$____;
    private static SubLSymbol $OUTPUT;
    private static SubLSymbol $sym166$FILE_VALID_FOR_WRITING_P;
    private static SubLSymbol $ABORT_KBQ_RUN_QUERY_SET;
    private static SubLString $str168$Abort_KBQ_run_query_set;
    private static SubLString $str169$KBQ_running_query_set;
    private static SubLString $str170$cdolist;
    private static SubLString $str171$_________________________________;
    private static SubLString $str172$______A____;
    private static SubLString $str173$Running_;
    private static SubLString $str174$Unrunnable_query____S;
    private static SubLSymbol $sym175$JANUS_OPERATION_P;
    private static SubLObject $$EverythingPSC;
    private static SubLSymbol $sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED;
    private static SubLSymbol $sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED;
    private static SubLObject $$isa;
    private static SubLObject $$elementOf;
    private static SubLSymbol $sym181$_OBJ;
    private static SubLList $list182;
    private static SubLList $list183;
    private static SubLSymbol $TEST_COLLECTION;
    private static SubLSymbol $SET;
    private static SubLList $list186;
    private static SubLSymbol $PROGRESS_MESSAGE;
    private static SubLString $str188$Processing_KB_Queries;
    private static SubLSymbol $SKIP_KBQ;
    private static SubLString $str190$Skip_KBQ__S;
    private static SubLSymbol $ADDITIONAL_ARGS;
    private static SubLSymbol $sym192$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static SubLList $list193;
    private static SubLSymbol $sym194$CSETQ;
    private static SubLString $str195$_A;
    private static SubLList $list196;
    private static SubLSymbol $ABORT_KCT_RUN_TEST_SET;
    private static SubLString $str198$Abort_KCT_run_test_set;
    private static SubLString $str199$KCT_running_test_set;
    private static SubLString $str200$__Running__s__;
    private static SubLString $str201$Unrunnable_test____S;
    private static SubLList $list202;
    private static SubLList $list203;
    private static SubLSymbol $QUERY_SPEC_SET;
    private static SubLSymbol $FILENAME;
    private static SubLSymbol $ANALYSIS_FILENAME;
    private static SubLSymbol $KEEPALIVE_FILENAME;
    private static SubLList $list208;
    private static SubLSymbol $sym209$_KBQ_DEFAULT_OUTLIER_TIMEOUT_;
    private static SubLSymbol $INCREMENTAL;
    private static SubLSymbol $INCLUDE_RESULTS;
    private static SubLSymbol $RANDOMIZE;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $COUNT;
    private static SubLSymbol $IF_FILE_EXISTS;
    private static SubLSymbol $OVERWRITE;
    private static SubLSymbol $sym217$RUN_KBQ_EXPERIMENT_INTERNAL;
    private static SubLSymbol $sym218$LIST;
    private static SubLSymbol $sym219$_LAST_QUERY_SET_RUN_;
    private static SubLSymbol $sym220$RUN_KBQ_EXPERIMENT;
    private static SubLSymbol $sym221$KBQ_IF_FILE_EXISTS_HANDLING_P;
    private static SubLString $str222$__run_starting_at__A;
    private static SubLString $str223$__run_ended_at__A;
    private static SubLString $str224$__elapsed_time____A;
    private static SubLString $str225$Unable_to_open__S;
    private static SubLSymbol $sym226$KBQ_ERRORING_QUERY_RUN_;
    private static SubLList $list227;
    private static SubLSymbol $AUGMENT;
    private static SubLSymbol $APPEND;
    private static SubLSymbol $RERUN_ERRORS;
    private static SubLSymbol $AUGMENT_OR_RERUN_ERRORS;
    private static SubLString $str232$unexpected_if_file_exists__s;
    private static SubLString $str233$_rerun_errors_;
    private static SubLList $list234;
    private static SubLList $list235;
    private static SubLSymbol $TEST_SPEC_SET;
    private static SubLSymbol $OVERRIDING_METRICS;
    private static SubLSymbol $sym238$_KBQ_OUTLIER_TIMEOUT_;
    private static SubLSymbol $EXPOSE_RUNSTATE;
    private static SubLSymbol $sym240$RUN_KCT_EXPERIMENT_INTERNAL;
    private static SubLSymbol $sym241$_LAST_TEST_SET_RUN_;
    private static SubLSymbol $sym242$RUN_KCT_EXPERIMENT;
    private static SubLSymbol $sym243$KB_CONTENT_REGRESSION_TEST_;
    private static SubLString $str244$Filtered_to___KBContentRegression;
    private static SubLString $str245$All_tests___;
    private static SubLString $str246$__Just_the_regression_tests___;
    private static SubLInteger $int$212;
    private static SubLString $str248$__Failing_tests_;
    private static SubLString $str249$____Failing_regression_tests___a_;
    private static SubLString $str250$____Unrunnable_tests_;
    private static SubLString $str251$_a;
    private static SubLString $str252$___a_is_unrunnable_for_an_unknown;
    private static SubLString $str253$_csv;
    private static SubLString $str254$__Writing_csv_to___A__;
    private static SubLString $str255$Comment___A__;
    private static SubLString $str256$Date___A__;
    private static SubLString $str257$_A__A__A__A__A__A__A___;
    private static SubLSymbol $sym258$KCT_ERRORING_TEST_RUN_;
    private static SubLSymbol $sym259$KCT_TEST_RUNNABLE_;
    private static SubLSymbol $sym260$_RUNSTATE_ISG_;
    private static SubLSymbol $sym261$_RUNSTATE_INDEX_;
    private static SubLString $str262$Unknown_runstate_type___A;
    private static SubLString $str263$Runstate_has_no_status___A;
    private static SubLString $str264$Explanations_aren_t_yet_implement;
    private static SubLString $str265$No_inference_defined_for_this_run;
    private static SubLString $str266$No_start_defined_for_this_runstat;
    private static SubLString $str267$No_end_defined_for_this_runstate_;
    private static SubLSymbol $sym268$KEYWORDP;
    private static SubLSymbol $sym269$KBQ_RUNSTATE;
    private static SubLSymbol $sym270$KBQ_RUNSTATE_P;
    private static SubLList $list271;
    private static SubLList $list272;
    private static SubLList $list273;
    private static SubLList $list274;
    private static SubLSymbol $sym275$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym276$KBQ_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list277;
    private static SubLSymbol $sym278$KBQR_ID;
    private static SubLSymbol $sym279$_CSETF_KBQR_ID;
    private static SubLSymbol $sym280$KBQR_LOCK;
    private static SubLSymbol $sym281$_CSETF_KBQR_LOCK;
    private static SubLSymbol $sym282$KBQR_QUERY_SPEC;
    private static SubLSymbol $sym283$_CSETF_KBQR_QUERY_SPEC;
    private static SubLSymbol $sym284$KBQR_INFERENCE;
    private static SubLSymbol $sym285$_CSETF_KBQR_INFERENCE;
    private static SubLSymbol $sym286$KBQR_RESULT;
    private static SubLSymbol $sym287$_CSETF_KBQR_RESULT;
    private static SubLSymbol $sym288$KBQR_TEST_RUNSTATE;
    private static SubLSymbol $sym289$_CSETF_KBQR_TEST_RUNSTATE;
    private static SubLSymbol $sym290$KBQR_RUN_STATUS;
    private static SubLSymbol $sym291$_CSETF_KBQR_RUN_STATUS;
    private static SubLSymbol $ID;
    private static SubLSymbol $LOCK;
    private static SubLSymbol $QUERY_SPEC;
    private static SubLSymbol $INFERENCE;
    private static SubLSymbol $TEST_RUNSTATE;
    private static SubLSymbol $RUN_STATUS;
    private static SubLString $str298$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym300$MAKE_KBQ_RUNSTATE;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym303$VISIT_DEFSTRUCT_OBJECT_KBQ_RUNSTATE_METHOD;
    private static SubLSymbol $sym304$KCT_RUNSTATE_P;
    private static SubLString $str305$KBQ_Runstate_Lock;
    private static SubLSymbol $NONE;
    private static SubLSymbol $sym307$INFERENCE_P;
    private static SubLSymbol $sym308$KBQ_QUERY_RUN_P;
    private static SubLSymbol $sym309$KCT_RUNSTATE;
    private static SubLList $list310;
    private static SubLList $list311;
    private static SubLList $list312;
    private static SubLList $list313;
    private static SubLSymbol $sym314$KCT_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list315;
    private static SubLSymbol $sym316$KCTR_ID;
    private static SubLSymbol $sym317$_CSETF_KCTR_ID;
    private static SubLSymbol $sym318$KCTR_LOCK;
    private static SubLSymbol $sym319$_CSETF_KCTR_LOCK;
    private static SubLSymbol $sym320$KCTR_TEST_SPEC;
    private static SubLSymbol $sym321$_CSETF_KCTR_TEST_SPEC;
    private static SubLSymbol $sym322$KCTR_RESULT;
    private static SubLSymbol $sym323$_CSETF_KCTR_RESULT;
    private static SubLSymbol $sym324$KCTR_QUERY_RUNSTATE;
    private static SubLSymbol $sym325$_CSETF_KCTR_QUERY_RUNSTATE;
    private static SubLSymbol $sym326$KCTR_TEST_SET_RUNSTATE;
    private static SubLSymbol $sym327$_CSETF_KCTR_TEST_SET_RUNSTATE;
    private static SubLSymbol $sym328$KCTR_RUN_STATUS;
    private static SubLSymbol $sym329$_CSETF_KCTR_RUN_STATUS;
    private static SubLSymbol $sym330$KCTR_START;
    private static SubLSymbol $sym331$_CSETF_KCTR_START;
    private static SubLSymbol $sym332$KCTR_END;
    private static SubLSymbol $sym333$_CSETF_KCTR_END;
    private static SubLSymbol $TEST_SPEC;
    private static SubLSymbol $QUERY_RUNSTATE;
    private static SubLSymbol $TEST_SET_RUNSTATE;
    private static SubLSymbol $START;
    private static SubLSymbol $sym338$MAKE_KCT_RUNSTATE;
    private static SubLSymbol $sym339$VISIT_DEFSTRUCT_OBJECT_KCT_RUNSTATE_METHOD;
    private static SubLSymbol $sym340$KCT_SET_RUNSTATE_P;
    private static SubLString $str341$KCT_Runstate_Lock;
    private static SubLSymbol $sym342$KCT_TEST_RUN_P;
    private static SubLSymbol $sym343$KCT_SET_RUNSTATE;
    private static SubLList $list344;
    private static SubLList $list345;
    private static SubLList $list346;
    private static SubLList $list347;
    private static SubLSymbol $sym348$KCT_SET_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list349;
    private static SubLSymbol $sym350$KCTSR_ID;
    private static SubLSymbol $sym351$_CSETF_KCTSR_ID;
    private static SubLSymbol $sym352$KCTSR_LOCK;
    private static SubLSymbol $sym353$_CSETF_KCTSR_LOCK;
    private static SubLSymbol $sym354$KCTSR_TEST_SET;
    private static SubLSymbol $sym355$_CSETF_KCTSR_TEST_SET;
    private static SubLSymbol $sym356$KCTSR_RESULT;
    private static SubLSymbol $sym357$_CSETF_KCTSR_RESULT;
    private static SubLSymbol $sym358$KCTSR_TEST_RUNSTATES;
    private static SubLSymbol $sym359$_CSETF_KCTSR_TEST_RUNSTATES;
    private static SubLSymbol $sym360$KCTSR_RUN_STATUS;
    private static SubLSymbol $sym361$_CSETF_KCTSR_RUN_STATUS;
    private static SubLSymbol $sym362$KCTSR_START;
    private static SubLSymbol $sym363$_CSETF_KCTSR_START;
    private static SubLSymbol $sym364$KCTSR_END;
    private static SubLSymbol $sym365$_CSETF_KCTSR_END;
    private static SubLSymbol $TEST_SET;
    private static SubLSymbol $TEST_RUNSTATES;
    private static SubLSymbol $sym368$MAKE_KCT_SET_RUNSTATE;
    private static SubLSymbol $sym369$VISIT_DEFSTRUCT_OBJECT_KCT_SET_RUNSTATE_METHOD;
    private static SubLSymbol $sym370$KCT_TEST_COLLECTION_P;
    private static SubLString $str371$KCT_Set_Runstate_Lock;
    private static SubLSymbol $sym372$KCT_ERROR_RESULT_P;
    private static SubLSymbol $sym373$KCT_TEST_RUN_STATUS;
    private static SubLSymbol $sym374$KCT_FAILURE_RESULT_P;
    private static SubLSymbol $sym375$KCT_TEST_SET_RUN_P;
    private static SubLList $list376;
    private static SubLList $list377;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym379$STREAM;
    private static SubLSymbol $sym380$DONE_VAR;
    private static SubLSymbol $sym381$PROGN;
    private static SubLSymbol $sym382$CHECK_TYPE;
    private static SubLList $list383;
    private static SubLSymbol $sym384$WITH_PRIVATE_BINARY_FILE;
    private static SubLList $list385;
    private static SubLSymbol $sym386$WITH_CFASL_COMMON_SYMBOLS_SIMPLE;
    private static SubLList $list387;
    private static SubLSymbol $sym388$WITH_NEW_CFASL_INPUT_GUID_STRING_RESOURCE;
    private static SubLSymbol $sym389$KBQ_LOAD_QUERY_SET_RUN_INT;
    private static SubLSymbol $sym390$CSOME;
    private static SubLSymbol $sym391$WHILE;
    private static SubLSymbol $sym392$CNOT;
    private static SubLSymbol $sym393$KBQ_LOAD_QUERY_RUN_INT;
    private static SubLSymbol $sym394$PWHEN;
    private static SubLList $list395;
    private static SubLList $list396;
    private static SubLSymbol $sym397$PUNLESS;
    private static SubLSymbol $sym398$KBQ_NCLEAN_QUERY_RUN;
    private static SubLList $list399;
    private static SubLSymbol $sym400$QUERY_SET_RUN;
    private static SubLSymbol $sym401$IGNORE;
    private static SubLSymbol $sym402$STRINGP;
    private static SubLSymbol $INPUT;
    private static SubLSymbol $EOF;
    private static SubLString $str405$dwimming__s_to_NIL;
    private static SubLString $str406$_cfasl;
    private static SubLString $str407$_no_results;
    private static SubLString $str408$Expected_a__a_file__got__s;
    private static SubLString $str409$answerable_sub_run_of_____A;
    private static SubLSymbol $sym410$POSITIVE_INTEGER_P;
    private static SubLSymbol $sym411$KCT_TEST_RUN_ANSWER_COUNT;
    private static SubLString $str412$succeeding_sub_run_of_____A;
    private static SubLSymbol $sym413$KCT_SUCCESS_RESULT_P;
    private static SubLString $str414$unanswerable_sub_run_of__;
    private static SubLSymbol $sym415$ZEROP;
    private static SubLString $str416$failing_sub_run_of_____A;
    private static SubLObject $$CommonSenseTest;
    private static SubLObject $$KBContentRegressionTest;
    private static SubLString $str419$_s_sub_run_of_____A;
    private static SubLList $list420;
    private static SubLSymbol $sym421$NOT_EQL;
    private static SubLString $str422$filtered_to_queries;
    private static SubLSymbol $sym423$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_NOT_LAMBDA;
    private static SubLSymbol $sym424$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_LAMBDA;
    private static SubLString $str425$filtered_to_tests;
    private static SubLSymbol $sym426$KCT_FILTER_TEST_SET_RUN_TO_TESTS_NOT_LAMBDA;
    private static SubLSymbol $sym427$KCT_FILTER_TEST_SET_RUN_TO_TESTS_LAMBDA;
    private static SubLSymbol $sym428$CACHED_ALL_INSTANCES_AMONG;
    private static SubLSymbol $sym429$_CACHED_ALL_INSTANCES_AMONG_CACHING_STATE_;
    private static SubLSymbol $sym430$CLEAR_CACHED_ALL_INSTANCES_AMONG;
    private static SubLList $list431;
    private static SubLList $list432;
    private static SubLSymbol $sym433$KCT_SUCCEEDING_TEST_SET_RUN;
    private static SubLSymbol $sym434$_;
    private static SubLSymbol $sym435$FOURTH;
    private static SubLSymbol $sym436$SECOND;
    private static SubLList $list437;
    private static SubLList $list438;
    private static SubLSymbol $MISSING_FROM_1;
    private static SubLSymbol $MISSING_FROM_2;
    private static SubLSymbol $ANSWERABLE_2;
    private static SubLSymbol $MORE_ANSWERS_2;
    private static SubLSymbol $DIFFERENT_ANSWERS;
    private static SubLSymbol $MORE_ANSWERS_1;
    private static SubLSymbol $ANSWERABLE_1;
    private static SubLString $str446$_S_and__S_are_different_queries;
    private static SubLString $str447$_S_has_no_result;
    private static SubLString $str448$query_set_runs_contained_differen;
    private static SubLString $str449$_s__s__s__s__s__;
    private static SubLString $str450$_s__s__s__;
    private static SubLSymbol $CHANGE;
    private static SubLSymbol $BECAME_SUCCESS;
    private static SubLSymbol $BECAME_FAILURE;
    private static SubLString $str454$unexpected_change__S;
    private static SubLString $str455$_S_and__S_are_different_tests;
    private static SubLString $str456$_S_has_no_status;
    private static SubLSymbol $UNDEFINED;
    private static SubLList $list458;
    private static SubLList $list459;
    private static SubLSymbol $NEITHER;
    private static SubLSymbol $INCREASE;
    private static SubLString $str462$empty__;
    private static SubLSymbol $TOTAL;
    private static SubLSymbol $TOTAL_ANSWERABLE;
    private static SubLSymbol $TOTAL_UNANSWERABLE;
    private static SubLSymbol $TOTAL_ERROR;
    private static SubLSymbol $TOTAL_LUMPY;
    private static SubLSymbol $SUM_ANSWER_COUNT;
    private static SubLSymbol $MEAN_ANSWER_COUNT;
    private static SubLSymbol $MEDIAN_ANSWER_COUNT;
    private static SubLSymbol $SUM_HYPOTHESIZATION_TIME;
    private static SubLSymbol $STDEV_HYPOTHESIZATION_TIME;
    private static SubLSymbol $SUM_TOTAL_TIME;
    private static SubLSymbol $STDEV_TOTAL_TIME;
    private static SubLSymbol $SUM_COMPLETE_TOTAL_TIME;
    private static SubLSymbol $MEAN_COMPLETE_TOTAL_TIME;
    private static SubLSymbol $MEDIAN_COMPLETE_TOTAL_TIME;
    private static SubLSymbol $STDEV_COMPLETE_TOTAL_TIME;
    private static SubLSymbol $SUM_TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $STDEV_TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $SUM_COMPLETE_TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $MEAN_COMPLETE_TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $MEDIAN_COMPLETE_TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $STDEV_COMPLETE_TIME_TO_FIRST_ANSWER;
    private static SubLSymbol $SUM_ANSWERABILITY_TIME;
    private static SubLSymbol $MEAN_ANSWERABILITY_TIME;
    private static SubLSymbol $MEDIAN_ANSWERABILITY_TIME;
    private static SubLSymbol $STDEV_ANSWERABILITY_TIME;
    private static SubLSymbol $SUM_TIME_TO_LAST_ANSWER;
    private static SubLSymbol $STDEV_TIME_TO_LAST_ANSWER;
    private static SubLSymbol $MEDIAN_COMPLETE_TIME_PER_ANSWER;
    private static SubLString $str492$ignoring_metric__S;
    private static SubLSymbol $MEDIAN_TIME_PER_ANSWER;
    private static SubLSymbol $TOTAL_SUCCESS;
    private static SubLSymbol $TOTAL_FAILURE;
    private static SubLSymbol $PERCENT_SUCCESS;
    private static SubLSymbol $PERCENT_FAILURE;
    private static SubLSymbol $sym498$KCT_TEST_RUN_QUERY_RUN;
    private static SubLList $list499;
    private static SubLString $str500$_0;
    private static SubLSymbol $sym501$BOUND_SYMBOL_P;
    private static SubLString $str502$____Answerability_analysis____;
    private static SubLString $str503$Total_____________s__s__s__;
    private static SubLString $str504$____Basic_analysis____;
    private static SubLString $str505$____Mutually_Answerable____;
    private static SubLString $str506$____Answerable____;
    private static SubLString $str507$____Unanswerable____;
    private static SubLList $list508;
    private static SubLString $str509$Mutually_Answerable_;
    private static SubLSymbol $sym510$KBQ_LUMPY_QUERY_RUN_;
    private static SubLString $str511$Unable_to_compute_any_metrics;
    private static SubLSymbol $sym512$DOUBLE_FLOAT;
    private static SubLString $str513$_____Total_Tests____4D;
    private static SubLString $str514$______Successes_____4D___S___;
    private static SubLString $str515$______Failures______4D___S___;
    private static SubLString $str516$_______Test_Set_Metrics__;
    private static SubLString $str517$____Test____S;
    private static SubLString $str518$__Status____S;
    private static SubLString $str519$__Halt_Reason____S;
    private static SubLString $str520$___S__S;
    private static SubLSymbol $sym521$KBQ_QUERY_RUN_HALT_REASON;
    private static SubLList $list522;
    private static SubLInteger $int$3600;
    private static SubLString $str524$Running_kbq_benchmark__kbq_benchm;
    private static SubLString $str525$_;
    private static SubLSymbol $sym526$KBQ_BENCHMARK_RUN;
    private static SubLString $str527$kbq_benchmark__kbq_benchmark_repo;
    private static SubLSymbol $sym528$FORT_P;
    private static SubLSymbol $sym529$LISTP;
    private static SubLString $str530$_______A______;
    private static SubLString $str531$____overriding_query_properties__;
    private static SubLString $str532$Tests_run_in_System__A_KB__A__;
    private static SubLObject $$TheSet;
    private static SubLSymbol $sym534$KCT_QUERY_SPECIFICATION;
    private static SubLList $list535;
    private static SubLString $str536$__ANS__TTFS____TTFA__SQ____SKSI__;
    private static SubLString $str537$_________________________________;
    private static SubLSymbol $SKSI_QUERY_START_TIMES;
    private static SubLSymbol $SKSI_QUERY_TOTAL_TIME;
    private static SubLString $str540$_5D__5_1F__7_1F_4D__7_1F__7_1F__7;
    private static SubLSymbol $EXHAUST_TOTAL;
    private static SubLString $str542$___A_;
    private static SubLString $str543$_5D__5_1F__7_1F_4D__7_1F__7_1F__7;
    private static SubLList $list544;
    private static SubLInteger $int$60;
    private static SubLString $str546$_15A___5D__5_1F__7_1F_4D__7_1F__7;
    private static SubLString $str547$Running__A_queries_using__proof_s;
    private static SubLSymbol $PROOF_SPEC;
    private static SubLSymbol $COMPUTE_ANSWER_JUSTIFICATIONS_;
    private static SubLString $str550$______Test___A;
    private static SubLString $str551$__Query___A;
    private static SubLObject $$True;
    private static SubLString $str553$____Answer___A__A____A;
    private static SubLString $str554$__Justification__;
    private static SubLSymbol $sym555$UNKNOWN_SENTENCE_SUPPORT_P;
    private static SubLSymbol $sym556$SUPPORT_MT;
    private static SubLSymbol $sym557$GENERALITY_ESTIMATE_;
    private static SubLObject $$UniversalVocabularyMt;
    private static SubLString $str559$___Mt___A;
    private static SubLObject $$BaseKB;
    private static SubLObject $$unknownSentence;
    private static SubLSymbol $sym562$RELEVANT_MT_IS_EVERYTHING;
    private static SubLObject $$SKSIContentTest;
    private static SubLSymbol $BREADTH;
    private static SubLSymbol $QUEUE;
    private static SubLSymbol $STACK;
    private static SubLSymbol $sym567$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static SubLString $str568$_A_is_not_a__A;
    private static SubLSymbol $sym569$SBHL_TRUE_TV_P;
    private static SubLSymbol $CERROR;
    private static SubLString $str571$continue_anyway;
    private static SubLSymbol $WARN;
    private static SubLString $str573$_A_is_not_a_valid__sbhl_type_erro;
    private static SubLString $str574$_A_is_neither_SET_P_nor_LISTP_;
    private static SubLString $str575$attempting_to_bind_direction_link;
    private static SubLList $list576;
    private static SubLString $str577$Node__a_does_not_pass_sbhl_type_t;
    private static SubLSymbol $GAF;
    private static SubLString $str579$_a___s____;
    private static SubLString $str580$__________Overview___________All_;
    private static SubLString $str581$__All___SKSIContentTests_marked_a;
    private static SubLString $str582$____SKSIContentTests_using_source;
    private static SubLString $str583$____SKSIContentTests_marked_as___;
    private static SubLString $str584$______________________Breakdown_b;
    private static SubLString $str585$_a__;
    private static SubLString $str586$_;
    private static SubLString $str587$______SKSIContentTests_that_use__;
    private static SubLString $str588$____SKSIContentTests_marked_as___;
    private static SubLString $str589$__Failure_analysis_______;
    private static SubLList $list590;
    private static SubLSymbol $sym591$COMPUTE_NEW_ROOT_RELATIVE_ANSWER_TIMES;
    private static SubLSymbol $OWNER;
    private static SubLSymbol $CLASSES;
    private static SubLSymbol $KB;
    private static SubLSymbol $TINY;
    private static SubLSymbol $WORKING_;
    private static SubLList $list597;

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1500L)
    public static SubLObject kct_success_result_p(SubLObject v_object) {
        return Equality.eq($SUCCESS, v_object);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1600L)
    public static SubLObject kct_failure_result_p(SubLObject v_object) {
        return Equality.eq($FAILURE, v_object);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1700L)
    public static SubLObject kct_error_result_p(SubLObject v_object) {
        return Equality.eq($ERROR, v_object);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5300L)
    public static SubLObject kbq_cfasl_common_symbols() {
        return $kbq_cfasl_common_symbols$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5500L)
    public static SubLObject kbq_cfasl_common_symbols_simple() {
        if (!$kbq_cfasl_common_symbols_simple$.getGlobalValue().isVector()) {
            $kbq_cfasl_common_symbols_simple$.setGlobalValue(Functions.apply($sym8$VECTOR, kbq_cfasl_common_symbols()));
        }
        return $kbq_cfasl_common_symbols_simple$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 6500L)
    public static SubLObject with_kbq_query_set_run(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list11);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_set_run = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list11);
        query_set_run = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym12$CLET, list(list($sym13$_KBQ_INTERNAL_TIME_UNITS_PER_SECOND_, list($sym14$KBQ_QUERY_SET_RUN_INTERNAL_TIME_UNITS_PER_SECOND, query_set_run))), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list11);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 6800L)
    public static SubLObject kbq_query_run_p(SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7000L)
    public static SubLObject kbq_discard_query_run_result(SubLObject query_run) {
        return kbq_discard_query_run_properties(query_run, list($RESULT));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7100L)
    public static SubLObject kbq_discard_query_run_properties(SubLObject query_run, SubLObject v_properties) {
        SubLObject new_query_run = conses_high.copy_list(query_run);
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_query_run = conses_high.remf(new_query_run, property);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return new_query_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7400L)
    public static SubLObject kbq_query_run_query(SubLObject query_run) {
        return conses_high.getf(query_run, $QUERY, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7500L)
    public static SubLObject kbq_query_run_result(SubLObject query_run) {
        return conses_high.getf(query_run, $RESULT, $MISSING);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7600L)
    public static SubLObject kbq_extract_query_run_metric_value(SubLObject query_run, SubLObject metric, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return conses_high.getf(query_run, metric, v_default);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7700L)
    public static SubLObject kbq_query_run_answerableP(SubLObject query_run) {
        return subl_promotions.positive_integer_p(kbq_query_run_answer_count(query_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 7900L)
    public static SubLObject kbq_query_run_unanswerableP(SubLObject query_run) {
        return makeBoolean(NIL == kbq_query_run_answerableP(query_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8000L)
    public static SubLObject kbq_query_run_answer_count(SubLObject query_run) {
        return conses_high.getf(query_run, $ANSWER_COUNT, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8100L)
    public static SubLObject kbq_query_run_hypothesization_time(SubLObject query_run) {
        return conses_high.getf(query_run, $HYPOTHESIZATION_TIME, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8200L)
    public static SubLObject kbq_query_run_total_time(SubLObject query_run) {
        return conses_high.getf(query_run, $TOTAL_TIME, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8300L)
    public static SubLObject kbq_query_run_complete_total_time(SubLObject query_run) {
        return conses_high.getf(query_run, $COMPLETE_TOTAL_TIME, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8400L)
    public static SubLObject kbq_query_run_time_to_first_answer(SubLObject query_run) {
        return conses_high.getf(query_run, $TIME_TO_FIRST_ANSWER, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8500L)
    public static SubLObject kbq_query_run_time_to_last_answer(SubLObject query_run) {
        return conses_high.getf(query_run, $TIME_TO_LAST_ANSWER, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8600L)
    public static SubLObject kbq_query_run_complete_time_to_first_answer(SubLObject query_run) {
        return kbq_query_run_property_value(query_run, $COMPLETE_TIME_TO_FIRST_ANSWER, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8800L)
    public static SubLObject kbq_query_run_complete_time_to_last_answer(SubLObject query_run) {
        return conses_high.getf(query_run, $COMPLETE_TIME_TO_LAST_ANSWER, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 8900L)
    public static SubLObject kbq_query_run_total_steps(SubLObject query_run) {
        return conses_high.getf(query_run, $TOTAL_STEPS, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 9000L)
    public static SubLObject kbq_query_run_steps_to_first_answer(SubLObject query_run) {
        return conses_high.getf(query_run, $STEPS_TO_FIRST_ANSWER, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 9100L)
    public static SubLObject kbq_query_run_steps_to_last_answer(SubLObject query_run) {
        return conses_high.getf(query_run, $STEPS_TO_LAST_ANSWER, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 9200L)
    public static SubLObject kbq_extract_query_run_property_value(SubLObject query_run, SubLObject query_property) {
        SubLObject query = kbq_query_run_query(query_run);
        return kb_query.kbq_query_property_value_from_keyword(query, query_property);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 9400L)
    public static SubLObject kbq_query_run_property_value(SubLObject query_run, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if ($COMPLETE_TOTAL_TIME == property) {
            SubLObject complete_total_time = kbq_extract_query_run_metric_value(query_run, property, UNPROVIDED);
            return (NIL != complete_total_time) ? complete_total_time : kbq_extract_query_run_metric_value(query_run, $TOTAL_TIME, v_default);
        }
        if (NIL != inference_datastructures_enumerated_types.query_metric_p(property) || $HALT_REASON == property || $QUERY == property || $ORIGIN == property) {
            return kbq_extract_query_run_metric_value(query_run, property, v_default);
        }
        if (NIL != inference_datastructures_enumerated_types.query_property_p(property)) {
            return kbq_extract_query_run_property_value(query_run, property);
        }
        if (property == $WASTED_TIME_AFTER_LAST_ANSWER) {
            return list_utilities.safe_difference(kbq_query_run_property_value(query_run, $TOTAL_TIME, v_default), kbq_query_run_property_value(query_run, $TIME_TO_LAST_ANSWER, v_default));
        }
        if (property == $LATENCY_IMPROVEMENT_FROM_ITERATIVITY) {
            return list_utilities.safe_difference(kbq_query_run_property_value(query_run, $TOTAL_TIME, v_default), kbq_query_run_property_value(query_run, $TIME_TO_FIRST_ANSWER, v_default));
        }
        if (property == $SETUP_TIME) {
            return list_utilities.safe_difference(kbq_query_run_property_value(query_run, $COMPLETE_TOTAL_TIME, v_default), kbq_query_run_property_value(query_run, $TOTAL_TIME, v_default));
        }
        if (property == $COMPLETE_TIME_TO_FIRST_ANSWER) {
            return list_utilities.safe_sum(kbq_query_run_property_value(query_run, $SETUP_TIME, v_default), kbq_query_run_property_value(query_run, $TIME_TO_FIRST_ANSWER, v_default));
        }
        if (property == $COMPLETE_TIME_TO_LAST_ANSWER) {
            return list_utilities.safe_sum(kbq_query_run_property_value(query_run, $SETUP_TIME, v_default), kbq_query_run_property_value(query_run, $TIME_TO_LAST_ANSWER, v_default));
        }
        if (property == $TIME_PER_ANSWER) {
            return list_utilities.safe_quotient(kbq_query_run_total_time(query_run), kbq_query_run_answer_count(query_run));
        }
        if (property == $COMPLETE_TIME_PER_ANSWER) {
            return list_utilities.safe_quotient(kbq_query_run_property_value(query_run, $COMPLETE_TOTAL_TIME, v_default), kbq_query_run_answer_count(query_run));
        }
        if (property == $ANSWERABILITY_TIME) {
            SubLObject good_time = kbq_query_run_property_value(query_run, $COMPLETE_TIME_TO_FIRST_ANSWER, NIL);
            if (good_time.isNumber()) {
                return good_time;
            }
            return kbq_query_run_property_value(query_run, $COMPLETE_TOTAL_TIME, v_default);
        } else if (property == $ANSWERABILITY_STEPS) {
            SubLObject good_steps = kbq_query_run_property_value(query_run, $STEPS_TO_FIRST_ANSWER, NIL);
            if (good_steps.isNumber()) {
                return good_steps;
            }
            return kbq_query_run_property_value(query_run, $TOTAL_STEPS, v_default);
        } else {
            if (property == $NEW_ROOT_RELATIVE_TOTAL_TIMES) {
                SubLObject new_root_times = kbq_query_run_property_value(query_run, $NEW_ROOT_TIMES, NIL);
                SubLObject inference_end_time = kbq_seconds_to_internal_real_time(kbq_query_run_property_value(query_run, $TOTAL_TIME, UNPROVIDED));
                SubLObject new_root_deltas = number_utilities.compute_deltas(new_root_times, inference_end_time);
                return new_root_deltas;
            }
            if (property == $NEW_ROOT_RELATIVE_ANSWER_TIMES) {
                SubLObject new_root_times = kbq_query_run_property_value(query_run, $NEW_ROOT_TIMES, NIL);
                SubLObject answer_times = kbq_query_run_property_value(query_run, $ANSWER_TIMES, NIL);
                return compute_new_root_relative_answer_times(new_root_times, answer_times);
            }
            if (property == $ESTIMATED_EXHAUSTIVE_PROBLEM_COUNT) {
                SubLObject estimated_exhaustive_new_root_count = kbq_query_run_property_value(query_run, $ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT, NIL);
                SubLObject new_root_count = kbq_query_run_property_value(query_run, $NEW_ROOT_COUNT, NIL);
                SubLObject problem_count = kbq_query_run_property_value(query_run, $PROBLEM_COUNT, NIL);
                SubLObject problems_per_new_root = list_utilities.safe_quotient(problem_count, new_root_count);
                return list_utilities.safe_product(problems_per_new_root, estimated_exhaustive_new_root_count);
            }
            if (property == $ESTIMATED_EXHAUSTIVE_BYTE_COUNT) {
                SubLObject estimated_exhaustive_problem_count = kbq_query_run_property_value(query_run, $ESTIMATED_EXHAUSTIVE_PROBLEM_COUNT, NIL);
                return list_utilities.safe_product((NIL != special_variable_state.bound_symbol_p($sym47$_MEDIAN_BYTES_PER_PROBLEM_)) ? Symbols.symbol_value($sym47$_MEDIAN_BYTES_PER_PROBLEM_) : NIL, estimated_exhaustive_problem_count);
            }
            if (property == $TOTAL_NEW_ROOT_INITIAL_REMOVAL_FANOUT) {
                SubLObject fanouts = kbq_query_run_property_value(query_run, $NEW_ROOT_INITIAL_REMOVAL_FANOUTS, UNPROVIDED);
                SubLObject total_fanout = number_utilities.summation(fanouts.isList() ? fanouts : NIL);
                return total_fanout;
            }
            if (property.isCons() && $QUERY_FUNCALL == property.first()) {
                if (NIL != list_utilities.doubletonP(property)) {
                    SubLObject query_funcall = NIL;
                    SubLObject func = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(property, property, $list51);
                    query_funcall = property.first();
                    SubLObject current = property.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, $list51);
                    func = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject query = kbq_query_run_query(query_run);
                        return Functions.funcall(func, query);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(property, $list51);
                } else {
                    SubLObject query_funcall = NIL;
                    SubLObject func = NIL;
                    SubLObject arg1 = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(property, property, $list52);
                    query_funcall = property.first();
                    SubLObject current = property.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, $list52);
                    func = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, $list52);
                    arg1 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject query2 = kbq_query_run_query(query_run);
                        return Functions.funcall(func, query2, arg1);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(property, $list52);
                }
            } else {
                if (!property.isCons() || $QUERY_RUN_FUNCALL != property.first()) {
                    return Errors.error($str56$unrecognized_KBQ_property_spec__s, property);
                }
                if (NIL != list_utilities.doubletonP(property)) {
                    SubLObject query_run_funcall = NIL;
                    SubLObject func = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(property, property, $list54);
                    query_run_funcall = property.first();
                    SubLObject current = property.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, $list54);
                    func = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return Functions.funcall(func, query_run);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(property, $list54);
                } else {
                    SubLObject query_run_funcall = NIL;
                    SubLObject func = NIL;
                    SubLObject arg1 = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(property, property, $list55);
                    query_run_funcall = property.first();
                    SubLObject current = property.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, $list55);
                    func = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, property, $list55);
                    arg1 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return Functions.funcall(func, query_run, arg1);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(property, $list55);
                }
            }
            return NIL;
        }
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 14900L)
    public static SubLObject kbq_internal_real_time_to_seconds(SubLObject internal_real_time) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == $kbq_internal_time_units_per_second$.getDynamicValue(thread)) {
            Errors.error($str57$Use_the__with_kbq_query_set_run_m);
        }
        return Numbers.divide(internal_real_time, $kbq_internal_time_units_per_second$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 15200L)
    public static SubLObject kbq_seconds_to_internal_real_time(SubLObject seconds) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == $kbq_internal_time_units_per_second$.getDynamicValue(thread)) {
            Errors.error($str58$Use_the__with_kbq_query_set_run__);
        }
        return Numbers.multiply(seconds, $kbq_internal_time_units_per_second$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 15500L)
    public static SubLObject kbq_query_run_halt_reason(SubLObject query_run) {
        return kbq_extract_query_run_metric_value(query_run, $HALT_REASON, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 15600L)
    public static SubLObject kbq_query_run_timed_outP(SubLObject query_run) {
        SubLObject halt_reason = kbq_query_run_halt_reason(query_run);
        return subl_promotions.memberP(halt_reason, $list59, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 15800L)
    public static SubLObject kbq_query_run_tautologyP(SubLObject query_run) {
        SubLObject halt_reason = kbq_query_run_halt_reason(query_run);
        return Equality.eq($TAUTOLOGY, halt_reason);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16000L)
    public static SubLObject kbq_query_run_total_time_less_than_1000_secondsP(SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), $int$1000);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16100L)
    public static SubLObject kbq_query_run_total_time_less_than_100_secondsP(SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), $int$100);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16200L)
    public static SubLObject kbq_query_run_total_time_less_than_10_secondsP(SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), TEN_INTEGER);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16400L)
    public static SubLObject kbq_query_run_total_time_less_than_a_secondP(SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), ONE_INTEGER);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16500L)
    public static SubLObject kbq_query_run_total_time_less_than_a_tenth_of_a_secondP(SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), $float$0_1);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16700L)
    public static SubLObject kbq_query_run_total_time_less_than_a_hundredth_of_a_secondP(SubLObject query_run) {
        return list_utilities.safe_L(kbq_query_run_total_time(query_run), $float$0_01);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16800L)
    public static SubLObject kbq_query_run_total_time_more_than_1000_secondsP(SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), $int$1000);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 16900L)
    public static SubLObject kbq_query_run_total_time_more_than_100_secondsP(SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), $int$100);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17100L)
    public static SubLObject kbq_query_run_total_time_more_than_10_secondsP(SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), TEN_INTEGER);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17200L)
    public static SubLObject kbq_query_run_total_time_more_than_a_secondP(SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), ONE_INTEGER);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17400L)
    public static SubLObject kbq_query_run_total_time_more_than_a_tenth_of_a_secondP(SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), $float$0_1);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17500L)
    public static SubLObject kbq_query_run_total_time_more_than_a_hundredth_of_a_secondP(SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_total_time(query_run), $float$0_01);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17700L)
    public static SubLObject kbq_query_run_more_than_1000_answersP(SubLObject query_run) {
        return list_utilities.safe_G(kbq_query_run_answer_count(query_run), $int$1000);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17800L)
    public static SubLObject kbq_query_run_inference_proof_spec_cons_count(SubLObject query_run) {
        return list_utilities.cons_count(kbq_query_run_property_value(query_run, $INFERENCE_PROOF_SPEC, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 17900L)
    public static SubLObject kbq_sentence_truth_query_runP(SubLObject query_run) {
        SubLObject query = kbq_query_run_query(query_run);
        SubLObject sentence = kb_query.kbq_sentences(query).first();
        return el_utilities.el_formula_with_operator_p(sentence, $$sentenceTruth);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 18200L)
    public static SubLObject compute_new_root_relative_answer_times(SubLObject new_root_times, SubLObject answer_times) {
        SubLThread thread = SubLProcess.currentSubLThread();
        answer_times = list_utilities.sort_L(conses_high.copy_list(answer_times), UNPROVIDED);
        SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject previous_new_root_index = $int$_2;
        SubLObject previous_new_root_time = MINUS_ONE_INTEGER;
        SubLObject next_new_root_index = MINUS_ONE_INTEGER;
        SubLObject next_new_root_time = MINUS_ONE_INTEGER;
        SubLObject rest_new_root_times = new_root_times;
        SubLObject cdolist_list_var = answer_times;
        SubLObject answer_time = NIL;
        answer_time = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            while (NIL != next_new_root_time && answer_time.numG(next_new_root_time)) {
                previous_new_root_index = Numbers.add(previous_new_root_index, ONE_INTEGER);
                next_new_root_index = Numbers.add(next_new_root_index, ONE_INTEGER);
                previous_new_root_time = next_new_root_time;
                next_new_root_time = rest_new_root_times.first();
                rest_new_root_times = rest_new_root_times.rest();
            }
            SubLObject relative_answer_time = Numbers.subtract(answer_time, previous_new_root_time);
            dictionary_utilities.dictionary_push(dict, previous_new_root_index, relative_answer_time);
            cdolist_list_var = cdolist_list_var.rest();
            answer_time = cdolist_list_var.first();
        }
        SubLObject result = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            SubLObject new_root_number = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject relative_answer_times = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = cons(cons(new_root_number, Sequences.nreverse(relative_answer_times)), result);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return list_utilities.sort_L(result, Symbols.symbol_function($sym68$FIRST));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19400L)
    public static SubLObject kct_test_run_p(SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19500L)
    public static SubLObject kct_make_test_run(SubLObject test, SubLObject status, SubLObject query_run) {
        return list($TEST, test, $STATUS, status, $QUERY_RUN, query_run);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19700L)
    public static SubLObject kct_test_run_test(SubLObject test_run) {
        return conses_high.getf(test_run, $TEST, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19700L)
    public static SubLObject kct_test_run_query_run(SubLObject test_run) {
        return conses_high.getf(test_run, $QUERY_RUN, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19800L)
    public static SubLObject kct_test_run_status(SubLObject test_run) {
        return conses_high.getf(test_run, $STATUS, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 19900L)
    public static SubLObject kct_test_run_answer_count(SubLObject test_run) {
        return kbq_query_run_answer_count(kct_test_run_query_run(test_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 20100L)
    public static SubLObject kbq_query_set_run_p(SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 20300L)
    public static SubLObject kbq_make_query_set_run(SubLObject query_runs, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        return list(new SubLObject[] { $MACHINE, Environment.get_network_name(UNPROVIDED), $DATE, Time.get_universal_time(), $BOGOMIPS, misc_utilities.machine_bogomips(), $INTERNAL_TIME_UNITS_PER_SECOND, time_high.$internal_time_units_per_second$.getGlobalValue(), $PATCH_LEVEL,
                system_info.cyc_revision_numbers(), $COMMENT, comment, $QUERY_RUNS, query_runs });
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 20700L)
    public static SubLObject kbq_nmerge_query_set_runs(SubLObject query_set_runs, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        if (NIL == query_set_runs) {
            return NIL;
        }
        SubLObject first_query_set_run = query_set_runs.first();
        SubLObject all_query_runs = Mapping.mapcan(Symbols.symbol_function($sym79$KBQ_QUERY_SET_RUN_QUERY_RUNS), query_set_runs, EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject merged_query_set_run = first_query_set_run;
        merged_query_set_run = conses_high.putf(merged_query_set_run, $QUERY_RUNS, all_query_runs);
        if (NIL != comment) {
            merged_query_set_run = conses_high.putf(merged_query_set_run, $COMMENT, comment);
        }
        return merged_query_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 21500L)
    public static SubLObject kbq_discard_query_set_run_results(SubLObject query_set_run) {
        return kbq_discard_query_set_run_properties(query_set_run, list($RESULT));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 21700L)
    public static SubLObject kbq_discard_query_set_run_properties(SubLObject query_set_run, SubLObject v_properties) {
        SubLObject new_query_set_run = conses_high.copy_list(query_set_run);
        SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject new_query_runs = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_query_run = kbq_discard_query_run_properties(query_run, v_properties);
            new_query_runs = cons(new_query_run, new_query_runs);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        new_query_set_run = conses_high.putf(new_query_set_run, $QUERY_RUNS, new_query_runs);
        return new_query_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 22300L)
    public static SubLObject kbq_make_query_set_run_from_test_set_run(SubLObject test_set_run) {
        SubLObject query_runs = NIL;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = test_set_run;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, test_set_run, $list80);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, test_set_run, $list80);
            if (NIL == conses_high.member(current_$1, $list81, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(test_set_run, $list80);
        }
        SubLObject machine_tail = cdestructuring_bind.property_list_member($MACHINE, test_set_run);
        SubLObject machine = (NIL != machine_tail) ? conses_high.cadr(machine_tail) : NIL;
        SubLObject date_tail = cdestructuring_bind.property_list_member($DATE, test_set_run);
        SubLObject date = (NIL != date_tail) ? conses_high.cadr(date_tail) : NIL;
        SubLObject bogomips_tail = cdestructuring_bind.property_list_member($BOGOMIPS, test_set_run);
        SubLObject bogomips = (NIL != bogomips_tail) ? conses_high.cadr(bogomips_tail) : NIL;
        SubLObject internal_time_units_per_second_tail = cdestructuring_bind.property_list_member($INTERNAL_TIME_UNITS_PER_SECOND, test_set_run);
        SubLObject internal_time_units_per_second = (NIL != internal_time_units_per_second_tail) ? conses_high.cadr(internal_time_units_per_second_tail) : NIL;
        SubLObject patch_level_tail = cdestructuring_bind.property_list_member($PATCH_LEVEL, test_set_run);
        SubLObject patch_level = (NIL != patch_level_tail) ? conses_high.cadr(patch_level_tail) : NIL;
        SubLObject comment_tail = cdestructuring_bind.property_list_member($COMMENT, test_set_run);
        SubLObject comment = (NIL != comment_tail) ? conses_high.cadr(comment_tail) : NIL;
        SubLObject test_runs_tail = cdestructuring_bind.property_list_member($TEST_RUNS, test_set_run);
        SubLObject cdolist_list_var;
        SubLObject test_runs = cdolist_list_var = (NIL != test_runs_tail) ? conses_high.cadr(test_runs_tail) : NIL;
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query_run = kct_test_run_query_run(test_run);
            query_runs = cons(query_run, query_runs);
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        query_runs = Sequences.nreverse(query_runs);
        return list(new SubLObject[] { $MACHINE, machine, $DATE, date, $BOGOMIPS, bogomips, $INTERNAL_TIME_UNITS_PER_SECOND, internal_time_units_per_second, $PATCH_LEVEL, patch_level, $COMMENT, comment, $QUERY_RUNS, query_runs });
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23000L)
    public static SubLObject kbq_query_set_run_property_value(SubLObject query_set_run, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return conses_high.getf(query_set_run, property, v_default);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23200L)
    public static SubLObject kbq_query_set_run_comment(SubLObject query_set_run) {
        return kbq_query_set_run_property_value(query_set_run, $COMMENT, NIL);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23300L)
    public static SubLObject kbq_query_set_run_query_runs(SubLObject query_set_run) {
        return kbq_query_set_run_property_value(query_set_run, $QUERY_RUNS, NIL);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23400L)
    public static SubLObject kbq_query_set_run_patch_level(SubLObject query_set_run) {
        return kbq_query_set_run_property_value(query_set_run, $PATCH_LEVEL, NIL);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23600L)
    public static SubLObject kbq_query_set_run_internal_time_units_per_second(SubLObject query_set_run) {
        return kbq_query_set_run_property_value(query_set_run, $INTERNAL_TIME_UNITS_PER_SECOND, NIL);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 23800L)
    public static SubLObject kbq_query_set_run_put_query_run_property(SubLObject query_set_run, SubLObject property, SubLObject value) {
        SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject new_query_runs = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_query_runs = cons(conses_high.putf(conses_high.copy_list(query_run), property, value), new_query_runs);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        new_query_runs = Sequences.nreverse(new_query_runs);
        query_set_run = conses_high.putf(conses_high.copy_list(query_set_run), $QUERY_RUNS, new_query_runs);
        return query_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 24300L)
    public static SubLObject kbq_extract_query_property_values(SubLObject query_set_run, SubLObject query_property) {
        SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject property_values = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject property_value = kbq_extract_query_run_property_value(query_run, query_property);
            property_values = cons(property_value, property_values);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(property_values);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 24700L)
    public static SubLObject kbq_extract_metric_values(SubLObject query_set_run, SubLObject metric, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject metric_values = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject metric_value = kbq_extract_query_run_metric_value(query_run, metric, v_default);
            metric_values = cons(metric_value, metric_values);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(metric_values);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 25100L)
    public static SubLObject kbq_extract_property_values(SubLObject query_set_run, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject property_values = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject property_value = kbq_query_run_property_value(query_run, property, v_default);
            property_values = cons(property_value, property_values);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(property_values);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 25700L)
    public static SubLObject kbq_query_set_run_queries(SubLObject query_set_run) {
        return kbq_extract_property_values(query_set_run, $QUERY, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 25800L)
    public static SubLObject kbq_query_set_run_query_count(SubLObject query_set_run) {
        return Sequences.length(kbq_query_set_run_query_runs(query_set_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 25900L)
    public static SubLObject kbq_query_set_run_valid_queries(SubLObject query_set_run) {
        return Sequences.delete_if($sym84$INVALID_FORT_, kbq_query_set_run_queries(query_set_run), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 26100L)
    public static SubLObject kbq_query_set_run_runnable_queries(SubLObject query_set_run) {
        return list_utilities.delete_if_not($sym85$KBQ_RUNNABLE_, Sequences.delete_if($sym84$INVALID_FORT_, kbq_query_set_run_queries(query_set_run), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 26300L)
    public static SubLObject kbq_query_set_run_remove_invalid_queries(SubLObject query_set_run) {
        SubLObject valid_queries = kbq_query_set_run_valid_queries(query_set_run);
        return kbq_filter_query_set_run_to_queries(query_set_run, valid_queries, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 26500L)
    public static SubLObject kbq_query_set_run_remove_unrunnable_queries(SubLObject query_set_run) {
        SubLObject runnable_queries = kbq_query_set_run_runnable_queries(query_set_run);
        return kbq_filter_query_set_run_to_queries(query_set_run, runnable_queries, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 26700L)
    public static SubLObject kbq_compute_pad_table(SubLObject query_set_run) {
        SubLObject answerable = kbq_answerable_query_set_run(query_set_run);
        SubLObject all_answerable_times_to_first_answer = kbq_extract_metric_values(answerable, $TIME_TO_FIRST_ANSWER, UNPROVIDED);
        SubLObject sorted_times_to_first_answer = Sort.sort(all_answerable_times_to_first_answer, Symbols.symbol_function($sym86$_), UNPROVIDED);
        return sorted_times_to_first_answer;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 27100L)
    public static SubLObject kbq_queries_within_n_of_median(SubLObject query_set_run, SubLObject n, SubLObject metric) {
        if (metric == UNPROVIDED) {
            metric = $TOTAL_TIME;
        }
        SubLObject median_metric = kbq_median_metric(metric);
        SubLObject mean_metric = kbq_mean_metric(metric);
        SubLObject query_runs = Sort.sort(conses_high.copy_list(kbq_query_set_run_query_runs(query_set_run)), $sym87$SAFE__, kbq_function_for_metric(metric));
        SubLObject analysis = kbq_analyze_query_set_run(query_set_run, UNPROVIDED);
        SubLObject median = conses_high.getf(analysis, median_metric, UNPROVIDED);
        SubLObject query_run_count = Sequences.length(query_runs);
        SubLObject width = ZERO_INTEGER;
        SubLObject mean = median;
        while (mean.numLE(Numbers.multiply(n, median)) && width.numL(query_run_count)) {
            width = Numbers.add(width, ONE_INTEGER);
            SubLObject sample_query_runs = list_utilities.middle_sublist(query_runs, width);
            SubLObject sample_analysis = kbq_analyze_query_runs(sample_query_runs, list(metric));
            mean = conses_high.getf(sample_analysis, mean_metric, UNPROVIDED);
            PrintLow.format(T, $str88$_s_____s__, Numbers.add(ONE_INTEGER, Numbers.multiply(TWO_INTEGER, width)), mean);
        }
        SubLObject subset_query_runs = list_utilities.middle_sublist(query_runs, Numbers.subtract(width, ONE_INTEGER));
        SubLObject subset_queries = Mapping.mapcar($sym89$KBQ_QUERY_RUN_QUERY, subset_query_runs);
        return subset_queries;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 28100L)
    public static SubLObject kbq_median_metric(SubLObject metric) {
        if (metric.eql($HYPOTHESIZATION_TIME)) {
            return $MEDIAN_HYPOTHESIZATION_TIME;
        }
        if (metric.eql($TOTAL_TIME)) {
            return $MEDIAN_TOTAL_TIME;
        }
        if (metric.eql($TIME_TO_FIRST_ANSWER)) {
            return $MEDIAN_TIME_TO_FIRST_ANSWER;
        }
        if (metric.eql($TIME_TO_LAST_ANSWER)) {
            return $MEDIAN_TIME_TO_LAST_ANSWER;
        }
        Errors.error($str94$what_s_the_median_for__s, metric);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 28500L)
    public static SubLObject kbq_mean_metric(SubLObject metric) {
        if (metric.eql($HYPOTHESIZATION_TIME)) {
            return $MEAN_HYPOTHESIZATION_TIME;
        }
        if (metric.eql($TOTAL_TIME)) {
            return $MEAN_TOTAL_TIME;
        }
        if (metric.eql($TIME_TO_FIRST_ANSWER)) {
            return $MEAN_TIME_TO_FIRST_ANSWER;
        }
        if (metric.eql($TIME_TO_LAST_ANSWER)) {
            return $MEAN_TIME_TO_LAST_ANSWER;
        }
        Errors.error($str99$what_s_the_mean_for__s, metric);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 28900L)
    public static SubLObject kbq_function_for_metric(SubLObject metric) {
        if (metric.eql($HYPOTHESIZATION_TIME)) {
            return $sym100$KBQ_QUERY_RUN_HYPOTHESIZATION_TIME;
        }
        if (metric.eql($TOTAL_TIME)) {
            return $sym101$KBQ_QUERY_RUN_TOTAL_TIME;
        }
        if (metric.eql($TIME_TO_FIRST_ANSWER)) {
            return $sym102$KBQ_QUERY_RUN_TIME_TO_FIRST_ANSWER;
        }
        if (metric.eql($TIME_TO_LAST_ANSWER)) {
            return $sym103$KBQ_QUERY_RUN_TIME_TO_LAST_ANSWER;
        }
        if (metric.eql($COMPLETE_TOTAL_TIME)) {
            return $sym104$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME;
        }
        if (metric.eql($COMPLETE_TIME_TO_FIRST_ANSWER)) {
            return $sym105$KBQ_QUERY_RUN_COMPLETE_TIME_TO_FIRST_ANSWER;
        }
        if (metric.eql($COMPLETE_TIME_TO_LAST_ANSWER)) {
            return $sym106$KBQ_QUERY_RUN_COMPLETE_TIME_TO_LAST_ANSWER;
        }
        if (metric.eql($ANSWER_COUNT)) {
            return $sym107$KBQ_QUERY_RUN_ANSWER_COUNT;
        }
        Errors.error($str108$unknown_metric__s, metric);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 29600L)
    public static SubLObject kct_test_set_run_p(SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 29700L)
    public static SubLObject kct_make_test_set_run(SubLObject test_runs, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        return list(new SubLObject[] { $MACHINE, Environment.get_network_name(UNPROVIDED), $DATE, Time.get_universal_time(), $BOGOMIPS, misc_utilities.machine_bogomips(), $INTERNAL_TIME_UNITS_PER_SECOND, time_high.$internal_time_units_per_second$.getGlobalValue(), $PATCH_LEVEL,
                system_info.cyc_revision_numbers(), $COMMENT, comment, $TEST_RUNS, test_runs });
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 30100L)
    public static SubLObject kct_nmerge_test_set_runs(SubLObject test_set_runs, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        if (NIL == test_set_runs) {
            return NIL;
        }
        SubLObject first_test_set_run = test_set_runs.first();
        SubLObject all_test_runs = Mapping.mapcan(Symbols.symbol_function($sym109$KCT_TEST_SET_RUN_TEST_RUNS), test_set_runs, EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject merged_test_set_run = first_test_set_run;
        merged_test_set_run = conses_high.putf(merged_test_set_run, $TEST_RUNS, all_test_runs);
        if (NIL != comment) {
            merged_test_set_run = conses_high.putf(merged_test_set_run, $COMMENT, comment);
        }
        return merged_test_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 30900L)
    public static SubLObject kct_test_set_run_comment(SubLObject test_set_run) {
        return conses_high.getf(test_set_run, $COMMENT, NIL);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31000L)
    public static SubLObject kct_test_set_run_internal_time_units_per_second(SubLObject test_set_run) {
        return conses_high.getf(test_set_run, $INTERNAL_TIME_UNITS_PER_SECOND, NIL);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31100L)
    public static SubLObject kct_test_set_run_test_runs(SubLObject test_set_run) {
        return conses_high.getf(test_set_run, $TEST_RUNS, NIL);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31200L)
    public static SubLObject kct_test_set_run_tests(SubLObject test_set_run) {
        return Mapping.mapcar($sym110$KCT_TEST_RUN_TEST, kct_test_set_run_test_runs(test_set_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31400L)
    public static SubLObject kct_test_set_run_valid_tests(SubLObject test_set_run) {
        return Sequences.delete_if($sym84$INVALID_FORT_, kct_test_set_run_tests(test_set_run), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31500L)
    public static SubLObject kct_test_set_run_remove_invalid_tests(SubLObject test_set_run) {
        SubLObject valid_tests = kct_test_set_run_valid_tests(test_set_run);
        return kct_filter_test_set_run_to_tests(test_set_run, valid_tests, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 31900L)
    public static SubLObject kbq_run_query(SubLObject query_spec, SubLObject query_metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP, SubLObject substitutions) {
        if (query_metrics == UNPROVIDED) {
            query_metrics = NIL;
        }
        if (outlier_timeout == UNPROVIDED) {
            outlier_timeout = $int$600;
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (include_resultP == UNPROVIDED) {
            include_resultP = NIL;
        }
        if (substitutions == UNPROVIDED) {
            substitutions = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != kb_query.kbq_query_spec_p(query_spec) : query_spec;
        SubLObject list_var = query_metrics;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != inference_datastructures_enumerated_types.query_metric_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (NIL != outlier_timeout && !assertionsDisabledInClass && NIL == Types.numberp(outlier_timeout)) {
            throw new AssertionError(outlier_timeout);
        }
        SubLObject plist_var = overriding_query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
        }
        leviathan.clear_problem_creation_times();
        SubLObject v_inference_metrics = conses_high.intersection(query_metrics, inference_metrics.inference_metric_names(), UNPROVIDED, UNPROVIDED);
        SubLObject total_time = NIL;
        SubLObject harness_error_message = NIL;
        SubLObject inference = NIL;
        SubLObject never_runP = NIL;
        SubLObject timed_outP = NIL;
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference_metric_values = NIL;
        SubLObject query_metrics_plist = NIL;
        SubLObject kbq_runstate = NIL;
        overriding_query_properties = conses_high.copy_list(overriding_query_properties);
        if (NIL != control_vars.$kbq_run_query_non_continuable_enabledP$.getDynamicValue(thread)) {
            overriding_query_properties = conses_high.putf(overriding_query_properties, $CONTINUABLE_, NIL);
        }
        if (NIL != query_metrics) {
            overriding_query_properties = conses_high.putf(overriding_query_properties, $METRICS, v_inference_metrics);
        }
        if (NIL != kct_runstate_p($kct_runstate$.getDynamicValue(thread))) {
            kbq_runstate = new_kbq_runstate(query_spec, $kct_runstate$.getDynamicValue(thread));
            set_kctr_query_runstate($kct_runstate$.getDynamicValue(thread), kbq_runstate);
            overriding_query_properties = conses_high.putf(overriding_query_properties, $BROWSABLE_, T);
        }
        if (NIL != $kbq_progress_stream$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            SubLObject sentence = kb_query.kbq_query_arguments(query_spec, substitutions);
            SubLObject mt = thread.secondMultipleValue();
            SubLObject query_properties = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            format_nil.force_format($kbq_progress_stream$.getDynamicValue(thread), $str120$___A____, inference_datastructures_inference.inference_args_to_new_cyc_query_form_string(sentence, mt, query_properties), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject _prev_bind_0 = $kbq_runstate$.currentBinding(thread);
        try {
            $kbq_runstate$.bind(kbq_runstate, thread);
            SubLObject already_in_a_sandboxP = sksi_macros.$within_sksi_sandboxP$.getDynamicValue(thread);
            SubLObject state = (NIL != already_in_a_sandboxP) ? NIL : sksi_sks_manager.current_sks_registration_state();
            SubLObject _prev_bind_0_$2 = sksi_macros.$within_sksi_sandboxP$.currentBinding(thread);
            try {
                sksi_macros.$within_sksi_sandboxP$.bind(T, thread);
                try {
                    never_runP = T;
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
                    for (i = NIL, i = ZERO_INTEGER; i.numL($kbq_run_number$.getDynamicValue(thread)); i = Numbers.add(i, ONE_INTEGER)) {
                        possibly_set_kbqr_run_status($kbq_runstate$.getDynamicValue(thread), $RUNNING);
                        time_var = Time.get_internal_real_time();
                        if (NIL == control_vars.$inference_debugP$.getDynamicValue(thread)) {
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind($sym122$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        aborted_via_restartP = T;
                                        catch_var = NIL;
                                        try {
                                            thread.throwStack.push($ABORT_KBQ_RUN_QUERY);
                                            restart_tag = $ABORT_KBQ_RUN_QUERY;
                                            dummy = NIL;
                                            _prev_bind_0_$4 = Errors.$restarts$.currentBinding(thread);
                                            try {
                                                Errors.$restarts$.bind(cons(list(restart_tag, $str124$Abort_KBQ_run_query), Errors.$restarts$.getDynamicValue(thread)), thread);
                                                try {
                                                    thread.throwStack.push(restart_tag);
                                                    if (i.eql(ZERO_INTEGER)) {
                                                        thread.resetMultipleValues();
                                                        inference_$5 = kbq_run_query_and_maybe_destroy(query_spec, NIL, outlier_timeout, overriding_query_properties, substitutions);
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
                                                    } else {
                                                        kbq_run_query_and_maybe_destroy(query_spec, T, outlier_timeout, overriding_query_properties, substitutions);
                                                    }
                                                    aborted_via_restartP = NIL;
                                                } catch (Throwable ccatch_env_var) {
                                                    dummy = Errors.handleThrowable(ccatch_env_var, restart_tag);
                                                } finally {
                                                    thread.throwStack.pop();
                                                }
                                            } finally {
                                                Errors.$restarts$.rebind(_prev_bind_0_$4, thread);
                                            }
                                        } catch (Throwable ccatch_env_var2) {
                                            catch_var = Errors.handleThrowable(ccatch_env_var2, $ABORT_KBQ_RUN_QUERY);
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                        if (NIL != aborted_via_restartP) {
                                            Errors.error($str125$KBQ_explicitly_aborted);
                                        }
                                    } catch (Throwable catch_var2) {
                                        Errors.handleThrowable(catch_var2, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                                }
                            } catch (Throwable ccatch_env_var3) {
                                harness_error_message = Errors.handleThrowable(ccatch_env_var3, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                        } else {
                            aborted_via_restartP2 = T;
                            catch_var3 = NIL;
                            try {
                                thread.throwStack.push($ABORT_KBQ_RUN_QUERY);
                                restart_tag2 = $ABORT_KBQ_RUN_QUERY;
                                dummy2 = NIL;
                                _prev_bind_0_$5 = Errors.$restarts$.currentBinding(thread);
                                try {
                                    Errors.$restarts$.bind(cons(list(restart_tag2, $str124$Abort_KBQ_run_query), Errors.$restarts$.getDynamicValue(thread)), thread);
                                    try {
                                        thread.throwStack.push(restart_tag2);
                                        if (i.eql(ZERO_INTEGER)) {
                                            thread.resetMultipleValues();
                                            inference_$6 = kbq_run_query_and_maybe_destroy(query_spec, NIL, outlier_timeout, overriding_query_properties, substitutions);
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
                                        } else {
                                            kbq_run_query_and_maybe_destroy(query_spec, T, outlier_timeout, overriding_query_properties, substitutions);
                                        }
                                        aborted_via_restartP2 = NIL;
                                    } catch (Throwable ccatch_env_var4) {
                                        dummy2 = Errors.handleThrowable(ccatch_env_var4, restart_tag2);
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                } finally {
                                    Errors.$restarts$.rebind(_prev_bind_0_$5, thread);
                                }
                            } catch (Throwable ccatch_env_var5) {
                                catch_var3 = Errors.handleThrowable(ccatch_env_var5, $ABORT_KBQ_RUN_QUERY);
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (NIL != aborted_via_restartP2) {
                                Errors.error($str125$KBQ_explicitly_aborted);
                            }
                        }
                        total_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    if (NIL != never_runP) {
                        possibly_set_kbqr_run_status($kbq_runstate$.getDynamicValue(thread), $NEVER_RUN);
                    } else {
                        possibly_set_kbqr_run_status($kbq_runstate$.getDynamicValue(thread), $FINISHED);
                    }
                    if (NIL == harness_error_message) {
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            SubLObject _prev_bind_0_$6 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind($sym122$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    if (NIL != timed_outP) {
                                        Errors.warn($str128$Outlier_____S, query_spec);
                                        halt_reason = $OUTLIER_ABORT;
                                        possibly_set_kbqr_run_status($kbq_runstate$.getDynamicValue(thread), $OUTLIER_TIMEOUT);
                                        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                                            result = inference_kernel.inference_result_from_answers(inference, inference_datastructures_inference.inference_all_new_answers(inference));
                                            inference_metric_values = inference_datastructures_inference.inference_compute_metrics(inference);
                                        }
                                    }
                                    if (NIL == never_runP) {
                                        if (!Sequences.length(v_inference_metrics).numE(Sequences.length(inference_metric_values))) {
                                            if (NIL == inference_metric_values) {
                                                Errors.error($str131$Unable_to_compute_any_inference_m, query_spec);
                                            } else {
                                                Errors.error($str132$Unable_to_compute_all_desired_inf, query_spec);
                                            }
                                        }
                                        query_metrics_plist = list_utilities.merge_plist(list_utilities.make_plist(query_metrics, make_list(Sequences.length(query_metrics), UNPROVIDED)), list_utilities.make_plist(v_inference_metrics, inference_metric_values));
                                    }
                                    if (NIL != timed_outP) {
                                        if (NIL != subl_promotions.memberP($TOTAL_TIME, query_metrics, UNPROVIDED, UNPROVIDED)) {
                                            query_metrics_plist = conses_high.putf(query_metrics_plist, $TOTAL_TIME, outlier_timeout);
                                        }
                                        if (NIL != subl_promotions.memberP($COMPLETE_TOTAL_TIME, query_metrics, UNPROVIDED, UNPROVIDED)) {
                                            query_metrics_plist = conses_high.putf(query_metrics_plist, $COMPLETE_TOTAL_TIME, outlier_timeout);
                                        }
                                    }
                                } catch (Throwable catch_var4) {
                                    Errors.handleThrowable(catch_var4, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$6, thread);
                            }
                        } catch (Throwable ccatch_env_var6) {
                            harness_error_message = Errors.handleThrowable(ccatch_env_var6, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                    }
                    if (NIL != harness_error_message) {
                        possibly_set_kbqr_run_status($kbq_runstate$.getDynamicValue(thread), $ERROR);
                        halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status(PrintLow.format(NIL, $str133$KBQ_harness_error_for__A____A, query_spec, harness_error_message));
                    }
                    if (NIL != never_runP) {
                        query_metrics_plist = nconc(new SubLObject[] { (NIL != subl_promotions.memberP($TOTAL_TIME, query_metrics, UNPROVIDED, UNPROVIDED)) ? list($TOTAL_TIME, total_time) : NIL,
                                (NIL != subl_promotions.memberP($COMPLETE_TOTAL_TIME, query_metrics, UNPROVIDED, UNPROVIDED)) ? list($COMPLETE_TOTAL_TIME, total_time) : NIL,
                                (NIL != subl_promotions.memberP($ANSWER_COUNT, query_metrics, UNPROVIDED, UNPROVIDED)) ? (($TAUTOLOGY == halt_reason) ? list($ANSWER_COUNT, ONE_INTEGER) : list($ANSWER_COUNT, ZERO_INTEGER)) : NIL,
                                ($TAUTOLOGY == halt_reason)
                                        ? nconc((NIL != subl_promotions.memberP($TIME_TO_FIRST_ANSWER, query_metrics, UNPROVIDED, UNPROVIDED)) ? list($TIME_TO_FIRST_ANSWER, total_time) : NIL,
                                                (NIL != subl_promotions.memberP($TIME_TO_LAST_ANSWER, query_metrics, UNPROVIDED, UNPROVIDED)) ? list($TIME_TO_LAST_ANSWER, total_time) : NIL)
                                        : NIL });
                    }
                    if (NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason)) {
                        Errors.warn($str134$Error_____S___A, query_spec, inference_datastructures_enumerated_types.inference_error_suspend_status_message(halt_reason));
                    }
                    if (NIL != inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason) && $NOT_A_QUERY != halt_reason) {
                        Errors.warn($str136$Avoided__due_to__S______S, halt_reason, query_spec);
                    }
                    if (NIL == kct_runstate_p($kct_runstate$.getDynamicValue(thread)) && NIL != control_vars.$kbq_run_query_auto_destroy_enabledP$.getDynamicValue(thread) && NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                    }
                } finally {
                    SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values = Values.getValuesAsVector();
                        if (NIL == already_in_a_sandboxP) {
                            sksi_sks_manager.execute_sks_registration_state(state);
                        }
                        Values.restoreValuesFromVector(_values);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            } finally {
                sksi_macros.$within_sksi_sandboxP$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            $kbq_runstate$.rebind(_prev_bind_0, thread);
        }
        SubLObject query_run = listS($QUERY, query_spec,
                append((NIL != overriding_query_properties) ? list($OVERRIDING_QUERY_PROPERTIES, overriding_query_properties) : NIL, (NIL != include_resultP) ? list($RESULT, result) : NIL, listS($HALT_REASON, halt_reason, append(query_metrics_plist, NIL))));
        if (NIL != kbq_runstate_p(kbq_runstate)) {
            set_kbqr_result(kbq_runstate, query_run);
        }
        return query_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 38600L)
    public static SubLObject abort_kbq_run_query() {
        return Dynamic.sublisp_throw($ABORT_KBQ_RUN_QUERY, NIL);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 38700L)
    public static SubLObject kbq_run_query_and_maybe_destroy(SubLObject query_spec, SubLObject destroyP, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject substitutions) {
        if (substitutions == UNPROVIDED) {
            substitutions = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject inference_tmp = kbq_run_query_int(query_spec, outlier_timeout, overriding_query_properties, substitutions);
        SubLObject never_runP_tmp = thread.secondMultipleValue();
        SubLObject timed_outP_tmp = thread.thirdMultipleValue();
        SubLObject result_tmp = thread.fourthMultipleValue();
        SubLObject halt_reason_tmp = thread.fifthMultipleValue();
        SubLObject metric_values_tmp = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != destroyP) {
            inference_datastructures_inference.destroy_inference_and_problem_store(inference_tmp);
        }
        return Values.values(inference_tmp, never_runP_tmp, timed_outP_tmp, result_tmp, halt_reason_tmp, metric_values_tmp);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 39300L)
    public static SubLObject kbq_run_query_problem_store(SubLObject query_spec, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = v_properties;
        SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member($OUTLIER_TIMEOUT, current);
        SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : $int$600;
        SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member($OVERRIDING_QUERY_PROPERTIES, current);
        SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : NIL;
        SubLObject substitutions_tail = cdestructuring_bind.property_list_member($SUBSTITUTIONS, current);
        SubLObject substitutions = (NIL != substitutions_tail) ? conses_high.cadr(substitutions_tail) : NIL;
        thread.resetMultipleValues();
        SubLObject inference = kbq_run_query_and_maybe_destroy(query_spec, NIL, outlier_timeout, overriding_query_properties, substitutions);
        thread.resetMultipleValues();
        if (NIL != inference_datastructures_inference.inference_p(inference)) {
            return inference_datastructures_inference.inference_problem_store(inference);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 39800L)
    public static SubLObject kbq_run_query_int(SubLObject query_spec, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject substitutions) {
        if (substitutions == UNPROVIDED) {
            substitutions = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference = NIL;
        SubLObject never_runP = NIL;
        SubLObject timed_outP = NIL;
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject metric_values = NIL;
        SubLObject treat_as_multiple_choiceP = NIL;
        ensure_only_sksi_modules_needed(query_spec);
        SubLObject timer = NIL;
        try {
            timer = inference_strategist.with_query_abort_timeout_start_timer(outlier_timeout);
            thread.resetMultipleValues();
            SubLObject result_$20 = (NIL != treat_as_multiple_choiceP) ? kb_query.ask_multiple_choice_query_from_kbq(query_spec, overriding_query_properties) : kb_query.new_cyc_query_from_kbq(query_spec, overriding_query_properties, substitutions);
            SubLObject halt_reason_$21 = thread.secondMultipleValue();
            SubLObject inference_$22 = thread.thirdMultipleValue();
            SubLObject metric_values_$23 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            result = result_$20;
            halt_reason = halt_reason_$21;
            inference = inference_$22;
            metric_values = metric_values_$23;
        } finally {
            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                inference_strategist.with_query_abort_timeout_stop_timer(timer);
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        never_runP = inference_datastructures_enumerated_types.avoided_inference_reason_p(halt_reason);
        timed_outP = Equality.eq($ABORT, halt_reason);
        return Values.values(inference, never_runP, timed_outP, result, halt_reason, metric_values);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 40800L)
    public static SubLObject ensure_sksi_modules_needed(SubLObject query_spec) {
        return sksi_sks_manager.register_sksi_removal_modules_for_skses(conses_high.set_difference(sksi_modules_needed(query_spec), sksi_infrastructure_utilities.gather_all_top_level_registered_knowledge_sources(), UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 41100L)
    public static SubLObject ensure_only_sksi_modules_needed(SubLObject query_spec) {
        if (NIL == list_utilities.sets_equalP(sksi_infrastructure_utilities.gather_all_top_level_registered_knowledge_sources(), sksi_modules_needed(query_spec), UNPROVIDED)) {
            sksi_query_utilities.deregister_all_combined_sksi_removal_modules(UNPROVIDED);
            sksi_sks_manager.clear_sksi_registered_knowledge_sources();
            sksi_sks_manager.clear_sksi_content_mts_with_registered_module();
            return sksi_sks_manager.register_sksi_removal_modules_for_skses(sksi_modules_needed(query_spec));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 41800L)
    public static SubLObject sksi_modules_needed(SubLObject query_spec) {
        return (NIL != kb_indexing_datastructures.indexed_term_p(query_spec)) ? kb_mapping_utilities.pred_values_in_any_mt(query_spec, $$sksiModulesNeeded, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 41900L)
    public static SubLObject query_sksi_modules_needed(SubLObject test_spec) {
        SubLObject query = kct_utils.kct_query_specification(test_spec, UNPROVIDED);
        return (NIL != query) ? sksi_modules_needed(query) : NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 42100L)
    public static SubLObject any_kct_followup_test_formula_gafsP(SubLObject test_spec) {
        return makeBoolean(NIL != forts.fort_p(test_spec) && (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(test_spec, $$testFollowupTestFormula_All, UNPROVIDED, UNPROVIDED)
                || NIL != kb_mapping_utilities.some_pred_value_in_any_mt(test_spec, $$testFollowupTestFormula_Some, UNPROVIDED, UNPROVIDED) || NIL != kb_mapping_utilities.some_pred_value_in_any_mt(test_spec, $$testFollowupTestFormula_None, UNPROVIDED, UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 42500L)
    public static SubLObject kct_run_test(SubLObject test_spec, SubLObject overriding_metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultP, SubLObject expose_runstateP) {
        if (overriding_metrics == UNPROVIDED) {
            overriding_metrics = NIL;
        }
        if (outlier_timeout == UNPROVIDED) {
            outlier_timeout = $kbq_outlier_timeout$.getDynamicValue();
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (include_resultP == UNPROVIDED) {
            include_resultP = NIL;
        }
        if (expose_runstateP == UNPROVIDED) {
            expose_runstateP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != kct_utils.kct_test_spec_p(test_spec, UNPROVIDED) : test_spec;
        SubLObject list_var = overriding_metrics;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != inference_datastructures_enumerated_types.query_metric_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (NIL != outlier_timeout && !assertionsDisabledInClass && NIL == Types.numberp(outlier_timeout)) {
            throw new AssertionError(outlier_timeout);
        }
        SubLObject plist_var = overriding_query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : property;
        }
        SubLObject status = NIL;
        SubLObject query_run = NIL;
        SubLObject kct_runstate = NIL;
        SubLObject any_kct_followup_test_formula_gafsP = any_kct_followup_test_formula_gafsP(test_spec);
        SubLObject test_error_message = NIL;
        if (NIL != any_kct_followup_test_formula_gafsP) {
            expose_runstateP = T;
        }
        if (NIL != expose_runstateP) {
            kct_runstate = new_kct_runstate(test_spec, $kct_set_runstate$.getDynamicValue(thread));
            if (NIL != process_utilities.thinking_task() && NIL == kct_thinking.kct_thinking_runstate(process_utilities.thinking_task())) {
                kct_thinking.kct_thinking_set_runstate_id(kctr_id(kct_runstate), UNPROVIDED);
            }
            if (NIL != kct_set_runstate_p($kct_set_runstate$.getDynamicValue(thread))) {
                kctsr_test_runstate_add($kct_set_runstate$.getDynamicValue(thread), kct_runstate);
            }
        }
        SubLObject _prev_bind_0 = $kct_runstate$.currentBinding(thread);
        try {
            $kct_runstate$.bind(kct_runstate, thread);
            SubLObject query_spec = kct_utils.kct_query_specification(test_spec, UNPROVIDED);
            SubLObject test_metrics = kb_test_metrics_to_query_metrics(kct_utils.kct_test_metrics(test_spec, UNPROVIDED));
            SubLObject query_metrics = conses_high.union(test_metrics, overriding_metrics, Symbols.symbol_function(EQL), UNPROVIDED);
            SubLObject multiple_choiceP = kb_query.multiple_choice_testP(test_spec);
            try {
                SubLObject query_properties_to_use = conses_high.copy_list(overriding_query_properties);
                if (NIL == multiple_choiceP) {
                    query_properties_to_use = conses_high.putf(query_properties_to_use, $RETURN, $BINDINGS_AND_HYPOTHETICAL_BINDINGS);
                }
                query_run = kbq_run_query(query_spec, query_metrics, outlier_timeout, query_properties_to_use, T, UNPROVIDED);
                SubLObject raw_results = kbq_query_run_result(query_run);
                if (NIL != multiple_choiceP) {
                    status = kct_compute_test_status(test_spec, raw_results, NIL);
                } else {
                    SubLObject actual_results = raw_results.first();
                    SubLObject hypothetical_bindings = conses_high.second(raw_results);
                    status = kct_compute_test_status(test_spec, actual_results, hypothetical_bindings);
                }
            } finally {
                SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    if (NIL != query_run && NIL == include_resultP) {
                        query_run = kbq_discard_query_run_result(query_run);
                    }
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        } finally {
            $kct_runstate$.rebind(_prev_bind_0, thread);
        }
        if (NIL != test_error_message) {
            status = $ERROR;
        }
        SubLObject kct_test_run = kct_make_test_run(test_spec, status, query_run);
        if (NIL != kct_runstate_p(kct_runstate)) {
            set_kctr_result(kct_runstate, kct_test_run);
        }
        return kct_test_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 44900L)
    public static SubLObject kb_test_metrics_to_query_metrics(SubLObject kb_test_metrics) {
        SubLObject query_metrics = NIL;
        SubLObject cdolist_list_var = kb_test_metrics;
        SubLObject kb_test_metric = NIL;
        kb_test_metric = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query_metric = kb_test_metric_to_query_metric(kb_test_metric);
            if (NIL != query_metric) {
                query_metrics = cons(query_metric, query_metrics);
            } else if (!kb_test_metric.eql($$TestMetric_HaltReason)) {
                Errors.warn($str149$Unsupported_metric__S, kb_test_metric);
            }
            cdolist_list_var = cdolist_list_var.rest();
            kb_test_metric = cdolist_list_var.first();
        }
        return Sequences.nreverse(query_metrics);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 46100L)
    public static SubLObject kb_test_metric_to_query_metric(SubLObject kb_test_metric) {
        return list_utilities.alist_lookup_without_values($kct_test_metric_table$.getGlobalValue(), kb_test_metric, Symbols.symbol_function(EQL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 46300L)
    public static SubLObject kct_compute_test_status(SubLObject test_spec, SubLObject query_results, SubLObject hypothetical_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != janus.janus_operation_p(test_spec)) {
            return kct_compute_janus_test_status(test_spec, query_results);
        }
        if (NIL != kb_query.multiple_choice_testP(test_spec)) {
            if (NIL == kct_test_query_results_satisfy_best_multiple_choice_option(query_results, list(Functions.funcall(makeSymbol("MULTIPLE-CHOICE-TEST-DESIRED-OPTION"), test_spec)))) {
                return $FAILURE;
            }
        } else {
            SubLObject el_query_results = kct_utils.kct_transform_query_results_for_comparison(query_results, hypothetical_bindings);
            if (NIL == kct_test_query_results_satisfy_binding_sets_cardinality(query_results, kct_utils.kct_binding_sets_cardinality(test_spec, UNPROVIDED))
                    || NIL == kct_test_query_results_satisfy_binding_sets_min_cardinality(query_results, kct_utils.kct_binding_sets_min_cardinality(test_spec, UNPROVIDED))
                    || NIL == kct_test_query_results_satisfy_binding_sets_max_cardinality(query_results, kct_utils.kct_binding_sets_max_cardinality(test_spec, UNPROVIDED))) {
                return $FAILURE;
            }
            if (NIL == kct_utils.kct_bindings_unimportantP(test_spec, UNPROVIDED) && (NIL == kct_test_query_results_satisfy_exact_set_of_binding_sets(el_query_results, kct_utils.kct_exact_set_of_binding_sets(test_spec, UNPROVIDED), hypothetical_bindings)
                    || NIL == kct_test_query_results_satisfy_wanted_binding_sets(el_query_results, kct_utils.kct_wanted_binding_sets(test_spec, UNPROVIDED), hypothetical_bindings)
                    || NIL == kct_test_query_results_satisfy_unwanted_binding_sets(el_query_results, kct_utils.kct_unwanted_binding_sets(test_spec, UNPROVIDED), hypothetical_bindings))) {
                return $FAILURE;
            }
            if (NIL != any_kct_followup_test_formula_gafsP(test_spec)) {
                SubLObject kbqr = kct_runstate_query_runstate($kct_runstate$.getDynamicValue(thread));
                SubLObject inference = kbq_runstate_inference(kbqr);
                SubLObject mt = inference_datastructures_inference.inference_mt(inference);
                SubLObject v_properties = inference_datastructures_inference.inference_input_query_properties(inference);
                SubLObject el_query = inference_datastructures_inference.inference_el_query(inference);
                SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                if (NIL == kct_followup_test_formula_all_holdsP(test_spec, store, el_query, mt, v_properties, hypothetical_bindings, query_results) || NIL == kct_followup_test_formula_some_holdsP(test_spec, store, el_query, mt, v_properties, hypothetical_bindings)
                        || NIL == kct_followup_test_formula_none_holdsP(test_spec, store, el_query, mt, v_properties, hypothetical_bindings)) {
                    return $FAILURE;
                }
            }
        }
        return $SUCCESS;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 48700L)
    public static SubLObject kct_compute_janus_test_status(SubLObject test_spec, SubLObject query_results) {
        if (NIL != janus.janus_operation_successP(test_spec, query_results, UNPROVIDED)) {
            return $SUCCESS;
        }
        return $FAILURE;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 48900L)
    public static SubLObject kct_followup_test_formula_all_holdsP(SubLObject test_spec, SubLObject store, SubLObject el_query, SubLObject mt, SubLObject query_properties, SubLObject hypothetical_bindings, SubLObject query_results) {
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(test_spec, $$testFollowupTestFormula_All, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject quoted_followup_sentence = NIL;
        quoted_followup_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject followup_raw_results = kct_followup_test_formula_result(quoted_followup_sentence, store, el_query, mt, query_properties, hypothetical_bindings);
            SubLObject followup_results = followup_raw_results.first();
            if (NIL == list_utilities.sets_equal_equalP(query_results, followup_results)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            quoted_followup_sentence = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 49400L)
    public static SubLObject kct_followup_test_formula_some_holdsP(SubLObject test_spec, SubLObject store, SubLObject el_query, SubLObject mt, SubLObject query_properties, SubLObject hypothetical_bindings) {
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(test_spec, $$testFollowupTestFormula_Some, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject quoted_followup_sentence = NIL;
        quoted_followup_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject followup_raw_results = kct_followup_test_formula_result(quoted_followup_sentence, store, el_query, mt, query_properties, hypothetical_bindings);
            SubLObject followup_results = followup_raw_results.first();
            if (NIL == followup_results) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            quoted_followup_sentence = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 49900L)
    public static SubLObject kct_followup_test_formula_none_holdsP(SubLObject test_spec, SubLObject store, SubLObject el_query, SubLObject mt, SubLObject query_properties, SubLObject hypothetical_bindings) {
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(test_spec, $$testFollowupTestFormula_None, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject quoted_followup_sentence = NIL;
        quoted_followup_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject followup_raw_results = kct_followup_test_formula_result(quoted_followup_sentence, store, el_query, mt, query_properties, hypothetical_bindings);
            SubLObject followup_results = followup_raw_results.first();
            if (NIL != followup_results) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            quoted_followup_sentence = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 50400L)
    public static SubLObject kct_followup_test_formula_result(SubLObject quoted_followup_sentence, SubLObject store, SubLObject el_query, SubLObject mt, SubLObject query_properties, SubLObject hypothetical_bindings) {
        SubLObject followup_sentence = bindings.apply_bindings(hypothetical_bindings, czer_main.unquote_quoted_term(quoted_followup_sentence, UNPROVIDED));
        SubLObject followup_conjunction = simplifier.conjoin(list(followup_sentence, el_query), UNPROVIDED);
        query_properties = list_utilities.merge_plist(query_properties, listS($PROBLEM_STORE, store, $list152));
        return inference_kernel.new_cyc_query(followup_conjunction, mt, query_properties);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 50900L)
    public static SubLObject kct_test_query_results_satisfy_exact_set_of_binding_sets(SubLObject el_query_results, SubLObject kb_exact_set_of_binding_sets, SubLObject hypothetical_bindings) {
        if (NIL == kb_exact_set_of_binding_sets) {
            return Values.values(T, NIL, NIL);
        }
        SubLObject hl_exact_binding_sets = bindings.inferencify_kb_set_of_binding_sets(kb_exact_set_of_binding_sets);
        SubLObject el_exact_binding_sets = kct_utils.kct_transform_query_results_for_comparison(hl_exact_binding_sets, hypothetical_bindings);
        SubLObject missing_binding_sets = list_utilities.fast_set_difference(el_exact_binding_sets, el_query_results, $sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_);
        SubLObject extra_binding_sets = list_utilities.fast_set_difference(el_query_results, el_exact_binding_sets, $sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_);
        SubLObject satisfiedP = makeBoolean(NIL == missing_binding_sets && NIL == extra_binding_sets);
        return Values.values(satisfiedP, missing_binding_sets, extra_binding_sets);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 51800L)
    public static SubLObject kct_test_query_results_satisfy_wanted_binding_sets(SubLObject el_query_results, SubLObject kb_wanted_binding_sets, SubLObject hypothetical_bindings) {
        if (NIL == kb_wanted_binding_sets) {
            return Values.values(T, NIL);
        }
        SubLObject hl_wanted_binding_sets = bindings.inferencify_kb_set_of_binding_sets(el_utilities.make_el_set(kb_wanted_binding_sets, UNPROVIDED));
        SubLObject el_wanted_binding_sets = kct_utils.kct_transform_query_results_for_comparison(hl_wanted_binding_sets, hypothetical_bindings);
        SubLObject missing_binding_sets = list_utilities.fast_set_difference(el_wanted_binding_sets, el_query_results, $sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_);
        SubLObject satisfiedP = Types.sublisp_null(missing_binding_sets);
        return Values.values(satisfiedP, missing_binding_sets);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 52400L)
    public static SubLObject kct_test_query_results_satisfy_unwanted_binding_sets(SubLObject el_query_results, SubLObject kb_unwanted_binding_sets, SubLObject hypothetical_bindings) {
        if (NIL == kb_unwanted_binding_sets) {
            return Values.values(T, NIL);
        }
        SubLObject hl_unwanted_binding_sets = bindings.inferencify_kb_set_of_binding_sets(el_utilities.make_el_set(kb_unwanted_binding_sets, UNPROVIDED));
        SubLObject el_unwanted_binding_sets = kct_utils.kct_transform_query_results_for_comparison(hl_unwanted_binding_sets, hypothetical_bindings);
        SubLObject unwanted_found_binding_sets = keyhash_utilities.fast_intersection(el_unwanted_binding_sets, el_query_results, $sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_, UNPROVIDED, UNPROVIDED);
        SubLObject satisfiedP = Types.sublisp_null(unwanted_found_binding_sets);
        return Values.values(satisfiedP, unwanted_found_binding_sets);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 53200L)
    public static SubLObject kct_test_query_results_satisfy_binding_sets_cardinality(SubLObject query_results, SubLObject kb_binding_sets_cardinality) {
        if (NIL == kb_binding_sets_cardinality) {
            return T;
        }
        SubLObject satisfiedP = Numbers.numE(kb_binding_sets_cardinality, Sequences.length(query_results));
        SubLObject got = Sequences.length(query_results);
        return Values.values(satisfiedP, kb_binding_sets_cardinality, got);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 53500L)
    public static SubLObject kct_test_query_results_satisfy_binding_sets_min_cardinality(SubLObject query_results, SubLObject kb_binding_sets_min_cardinality) {
        if (NIL == kb_binding_sets_min_cardinality) {
            return T;
        }
        SubLObject satisfiedP = Numbers.numLE(kb_binding_sets_min_cardinality, Sequences.length(query_results));
        SubLObject got = Sequences.length(query_results);
        return Values.values(satisfiedP, kb_binding_sets_min_cardinality, got);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 54000L)
    public static SubLObject kct_test_query_results_satisfy_binding_sets_max_cardinality(SubLObject query_results, SubLObject kb_binding_sets_max_cardinality) {
        if (NIL == kb_binding_sets_max_cardinality) {
            return T;
        }
        SubLObject satisfiedP = Numbers.numGE(kb_binding_sets_max_cardinality, Sequences.length(query_results));
        SubLObject got = Sequences.length(query_results);
        return Values.values(satisfiedP, kb_binding_sets_max_cardinality, got);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 54400L)
    public static SubLObject kct_test_query_results_satisfy_best_multiple_choice_option(SubLObject chosen_option, SubLObject kb_desired_option) {
        return equals.equalsP(chosen_option, kb_desired_option, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 54500L)
    public static SubLObject why_kct_failure(SubLObject test_spec, SubLObject query_results, SubLObject hypothetical_bindings) {
        if (kct_compute_test_status(test_spec, query_results, hypothetical_bindings) != $FAILURE) {
            return NIL;
        }
        if (NIL != kb_query.multiple_choice_testP(test_spec)) {
            return why_kct_multiple_choice_option_failure(test_spec, query_results);
        }
        SubLObject cardinality_failure = why_kct_binding_cardinality_failure(test_spec, query_results);
        SubLObject binding_failure = why_kct_binding_match_failure(test_spec, query_results, hypothetical_bindings);
        return list_utilities.remove_if_not(Symbols.symbol_function(IDENTITY), list(cardinality_failure, binding_failure), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 55100L)
    public static SubLObject why_kct_multiple_choice_option_failure(SubLObject test_spec, SubLObject query_results) {
        return Sequences.cconcatenate($str154$Expected_, new SubLObject[] { format_nil.format_nil_a_no_copy(query_results), $str155$__but_got_, format_nil.format_nil_a_no_copy(Functions.funcall(makeSymbol("MULTIPLE-CHOICE-TEST-DESIRED-OPTION"), test_spec)) });
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 55300L)
    public static SubLObject why_kct_binding_cardinality_failure(SubLObject test_spec, SubLObject query_results) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject satisfiedP = kct_test_query_results_satisfy_binding_sets_cardinality(query_results, kct_utils.kct_binding_sets_cardinality(test_spec, UNPROVIDED));
        SubLObject wanted = thread.secondMultipleValue();
        SubLObject got = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == satisfiedP) {
            return Sequences.cconcatenate($str156$Expected_exactly_, new SubLObject[] { format_nil.format_nil_a_no_copy(wanted), $str157$_binding_sets__but_got_, format_nil.format_nil_a_no_copy(got), $str158$_ });
        }
        thread.resetMultipleValues();
        satisfiedP = kct_test_query_results_satisfy_binding_sets_min_cardinality(query_results, kct_utils.kct_binding_sets_min_cardinality(test_spec, UNPROVIDED));
        wanted = thread.secondMultipleValue();
        got = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == satisfiedP) {
            return Sequences.cconcatenate($str159$Expected_at_least_, new SubLObject[] { format_nil.format_nil_a_no_copy(wanted), $str157$_binding_sets__but_got_, format_nil.format_nil_a_no_copy(got), $str158$_ });
        }
        thread.resetMultipleValues();
        satisfiedP = kct_test_query_results_satisfy_binding_sets_max_cardinality(query_results, kct_utils.kct_binding_sets_max_cardinality(test_spec, UNPROVIDED));
        wanted = thread.secondMultipleValue();
        got = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == satisfiedP) {
            return Sequences.cconcatenate($str160$Expected_no_more_than_, new SubLObject[] { format_nil.format_nil_a_no_copy(wanted), $str157$_binding_sets__but_got_, format_nil.format_nil_a_no_copy(got), $str158$_ });
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 56300L)
    public static SubLObject why_kct_binding_match_failure(SubLObject test_spec, SubLObject query_results, SubLObject hypothetical_bindings) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = $str161$;
        SubLObject el_query_results = kct_utils.kct_transform_query_results_for_comparison(query_results, hypothetical_bindings);
        thread.resetMultipleValues();
        SubLObject satisfiedP = kct_test_query_results_satisfy_exact_set_of_binding_sets(el_query_results, kct_utils.kct_exact_set_of_binding_sets(test_spec, UNPROVIDED), hypothetical_bindings);
        SubLObject missing_binding_sets = thread.secondMultipleValue();
        SubLObject extra_binding_sets = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == satisfiedP) {
            if (NIL != missing_binding_sets) {
                result = Sequences.cconcatenate(result, new SubLObject[] { $str162$These_expected_bindings_were_miss, kct_format_binding_sets_list(missing_binding_sets) });
                if (NIL != extra_binding_sets) {
                    result = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(result), format_nil.$format_nil_percent$.getGlobalValue());
                }
            }
            if (NIL != extra_binding_sets) {
                result = Sequences.cconcatenate(result, new SubLObject[] { $str163$These_unwanted_bindings_were_retu, kct_format_binding_sets_list(extra_binding_sets) });
            }
        }
        if (NIL != string_utilities.non_empty_string_p(result)) {
            return result;
        }
        thread.resetMultipleValues();
        satisfiedP = kct_test_query_results_satisfy_wanted_binding_sets(el_query_results, kct_utils.kct_wanted_binding_sets(test_spec, UNPROVIDED), hypothetical_bindings);
        missing_binding_sets = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == satisfiedP) {
            result = Sequences.cconcatenate(result, new SubLObject[] { $str162$These_expected_bindings_were_miss, kct_format_binding_sets_list(missing_binding_sets) });
        }
        if (NIL != string_utilities.non_empty_string_p(result)) {
            return result;
        }
        thread.resetMultipleValues();
        satisfiedP = kct_test_query_results_satisfy_unwanted_binding_sets(el_query_results, kct_utils.kct_unwanted_binding_sets(test_spec, UNPROVIDED), hypothetical_bindings);
        SubLObject extra_binding_sets2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == satisfiedP) {
            result = Sequences.cconcatenate(result, new SubLObject[] { $str163$These_unwanted_bindings_were_retu, kct_format_binding_sets_list(extra_binding_sets2) });
        }
        if (NIL != string_utilities.non_empty_string_p(result)) {
            return result;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 58100L)
    public static SubLObject kct_format_binding_sets_list(SubLObject binding_sets) {
        SubLObject result = $str161$;
        SubLObject cdolist_list_var = binding_sets;
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = Sequences.cconcatenate(result, Sequences.cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str164$____, format_nil.format_nil_a_no_copy(binding_set) }));
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 58500L)
    public static SubLObject kbq_run_query_set(SubLObject query_spec_set, SubLObject metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultsP, SubLObject comment, SubLObject output_filename, SubLObject skip, SubLObject count, SubLObject randomize,
            SubLObject file_mode, SubLObject tail_queries, SubLObject keepalive_filename) {
        if (metrics == UNPROVIDED) {
            metrics = NIL;
        }
        if (outlier_timeout == UNPROVIDED) {
            outlier_timeout = $kbq_default_outlier_timeout$.getGlobalValue();
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (include_resultsP == UNPROVIDED) {
            include_resultsP = T;
        }
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        if (output_filename == UNPROVIDED) {
            output_filename = NIL;
        }
        if (skip == UNPROVIDED) {
            skip = ZERO_INTEGER;
        }
        if (count == UNPROVIDED) {
            count = NIL;
        }
        if (randomize == UNPROVIDED) {
            randomize = NIL;
        }
        if (file_mode == UNPROVIDED) {
            file_mode = $OUTPUT;
        }
        if (tail_queries == UNPROVIDED) {
            tail_queries = NIL;
        }
        if (keepalive_filename == UNPROVIDED) {
            keepalive_filename = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != keepalive_filename && !assertionsDisabledInClass && NIL == file_utilities.file_valid_for_writing_p(keepalive_filename)) {
            throw new AssertionError(keepalive_filename);
        }
        SubLObject query_specs = kbq_query_spec_set_elements(query_spec_set, randomize, tail_queries);
        SubLObject query_end = (NIL != count) ? Numbers.add(skip, count) : NIL;
        SubLObject query_count = ZERO_INTEGER;
        SubLObject query_runs = NIL;
        SubLObject output_stream = NIL;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($ABORT_KBQ_RUN_QUERY_SET);
            SubLObject restart_tag = $ABORT_KBQ_RUN_QUERY_SET;
            SubLObject dummy = NIL;
            SubLObject _prev_bind_0 = Errors.$restarts$.currentBinding(thread);
            try {
                Errors.$restarts$.bind(cons(list(restart_tag, $str168$Abort_KBQ_run_query_set), Errors.$restarts$.getDynamicValue(thread)), thread);
                try {
                    thread.throwStack.push(restart_tag);
                    SubLObject state = sksi_sks_manager.current_sks_registration_state();
                    SubLObject _prev_bind_0_$25 = sksi_macros.$within_sksi_sandboxP$.currentBinding(thread);
                    try {
                        sksi_macros.$within_sksi_sandboxP$.bind(T, thread);
                        try {
                            if (NIL != output_filename) {
                                output_stream = kbq_open_query_set_run_output_stream(output_filename, file_mode);
                            }
                            if (NIL != output_stream && $OUTPUT == file_mode) {
                                kbq_save_query_set_run_preamble(output_stream, comment);
                            }
                            SubLObject list_var = query_specs;
                            SubLObject _prev_bind_0_$26 = utilities_macros.$progress_note$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                            SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                            SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_note$.bind($str169$KBQ_running_query_set, thread);
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                                utilities_macros.$progress_sofar$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                                try {
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    SubLObject csome_list_var = list_var;
                                    SubLObject query_spec = NIL;
                                    query_spec = csome_list_var.first();
                                    while (NIL != csome_list_var) {
                                        if (skip.isPositive()) {
                                            skip = Numbers.subtract(skip, ONE_INTEGER);
                                        } else if (NIL != kb_query.kbq_runnableP(query_spec)) {
                                            if (NIL != $kbq_progress_stream$.getDynamicValue(thread)) {
                                                format_nil.force_format($kbq_progress_stream$.getDynamicValue(thread), $str171$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                format_nil.force_format($kbq_progress_stream$.getDynamicValue(thread), $str172$______A____, query_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            SubLObject query_run = NIL;
                                            SubLObject str = Sequences.cconcatenate($str173$Running_, format_nil.format_nil_s_no_copy(query_spec));
                                            SubLObject _prev_bind_0_$27 = utilities_macros.$progress_start_time$.currentBinding(thread);
                                            SubLObject _prev_bind_1_$28 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                                            SubLObject _prev_bind_2_$29 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                            SubLObject _prev_bind_3_$30 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                                            SubLObject _prev_bind_4_$31 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                                            SubLObject _prev_bind_5_$32 = utilities_macros.$progress_count$.currentBinding(thread);
                                            SubLObject _prev_bind_6_$33 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                                            SubLObject _prev_bind_7_$34 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                            try {
                                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                                utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                                                utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                                utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                                                utilities_macros.$is_noting_progressP$.bind(T, thread);
                                                utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                                                utilities_macros.noting_progress_preamble(str);
                                                query_run = kbq_run_query(query_spec, metrics, outlier_timeout, overriding_query_properties, include_resultsP, UNPROVIDED);
                                                utilities_macros.noting_progress_postamble();
                                            } finally {
                                                utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$34, thread);
                                                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$33, thread);
                                                utilities_macros.$progress_count$.rebind(_prev_bind_5_$32, thread);
                                                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$31, thread);
                                                utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$30, thread);
                                                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$29, thread);
                                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$28, thread);
                                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$27, thread);
                                            }
                                            query_runs = cons(query_run, query_runs);
                                            if (output_stream.isStream()) {
                                                kbq_save_query_run(query_run, output_stream);
                                            }
                                            file_utilities.possibly_update_keepalive_file(keepalive_filename);
                                        } else {
                                            Errors.warn($str174$Unrunnable_query____S, query_spec);
                                        }
                                        query_count = Numbers.add(query_count, ONE_INTEGER);
                                        if (NIL != query_end && query_count.numGE(query_end)) {
                                            abort_kbq_run_query_set();
                                        }
                                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        csome_list_var = csome_list_var.rest();
                                        query_spec = csome_list_var.first();
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values = Values.getValuesAsVector();
                                        utilities_macros.noting_percent_progress_postamble();
                                        Values.restoreValuesFromVector(_values);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                    }
                                }
                            } finally {
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
                                streams_high.close(output_stream, UNPROVIDED);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values2 = Values.getValuesAsVector();
                                sksi_sks_manager.execute_sks_registration_state(state);
                                Values.restoreValuesFromVector(_values2);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                            }
                        }
                    } finally {
                        sksi_macros.$within_sksi_sandboxP$.rebind(_prev_bind_0_$25, thread);
                    }
                } catch (Throwable ccatch_env_var) {
                    dummy = Errors.handleThrowable(ccatch_env_var, restart_tag);
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                Errors.$restarts$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var2) {
            catch_var = Errors.handleThrowable(ccatch_env_var2, $ABORT_KBQ_RUN_QUERY_SET);
        } finally {
            thread.throwStack.pop();
        }
        query_runs = Sequences.nreverse(query_runs);
        SubLObject query_set_run = kbq_make_query_set_run(query_runs, comment);
        return Values.values(query_set_run, query_count);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 60800L)
    public static SubLObject abort_kbq_run_query_set() {
        return Dynamic.sublisp_throw($ABORT_KBQ_RUN_QUERY_SET, NIL);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 60900L)
    public static SubLObject kbq_query_spec_set_elements(SubLObject query_spec_set, SubLObject randomize, SubLObject tail_queries) {
        if (randomize == UNPROVIDED) {
            randomize = NIL;
        }
        if (tail_queries == UNPROVIDED) {
            tail_queries = NIL;
        }
        if (NIL != list_utilities.list_of_type_p($sym175$JANUS_OPERATION_P, query_spec_set)) {
            return append(query_spec_set, tail_queries);
        }
        SubLObject v_answer = all_instantiations_via_inference(query_spec_set, $$EverythingPSC);
        if (NIL != randomize) {
            v_answer = list_utilities.randomize_list(v_answer);
        } else {
            v_answer = sort_queries_by_sksi_modules_needed(v_answer);
        }
        return append(v_answer, tail_queries);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 61600L)
    public static SubLObject sort_queries_by_sksi_modules_needed(SubLObject query_specs) {
        return sort_terms_by_sksi_modules_needed(query_specs, $sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 61800L)
    public static SubLObject sort_tests_by_sksi_modules_needed(SubLObject test_specs) {
        return sort_terms_by_sksi_modules_needed(test_specs, $sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 61900L)
    public static SubLObject sort_terms_by_sksi_modules_needed(SubLObject terms, SubLObject key) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = kb_utilities.sort_terms(terms, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject local_state;
        SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = kb_utilities.sort_terms(result, NIL, T, T, T, key, UNPROVIDED);
            } finally {
                SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62200L)
    public static SubLObject sksi_modules_needed_sorted_memoized_internal(SubLObject query_spec) {
        return kb_utilities.sort_terms(sksi_modules_needed(query_spec), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62200L)
    public static SubLObject sksi_modules_needed_sorted_memoized(SubLObject query_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_modules_needed_sorted_memoized_internal(query_spec);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, query_spec, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(sksi_modules_needed_sorted_memoized_internal(query_spec)));
            memoization_state.caching_state_put(caching_state, query_spec, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62400L)
    public static SubLObject query_sksi_modules_needed_sorted_memoized_internal(SubLObject test_spec) {
        return kb_utilities.sort_terms(query_sksi_modules_needed(test_spec), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62400L)
    public static SubLObject query_sksi_modules_needed_sorted_memoized(SubLObject test_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return query_sksi_modules_needed_sorted_memoized_internal(test_spec);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, test_spec, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(query_sksi_modules_needed_sorted_memoized_internal(test_spec)));
            memoization_state.caching_state_put(caching_state, test_spec, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 62500L)
    public static SubLObject all_instantiations_via_inference(SubLObject v_set, SubLObject mt) {
        SubLObject collectionP = fort_types_interface.isa_collectionP(v_set, UNPROVIDED);
        SubLObject predicate = (NIL != collectionP) ? $$isa : $$elementOf;
        return ask_utilities.query_variable($sym181$_OBJ, list(predicate, $sym181$_OBJ, v_set), mt, $list182);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 63200L)
    public static SubLObject kbq_test_collection_to_query_set(SubLObject test_collection) {
        SubLObject query = conses_high.subst(test_collection, $TEST_COLLECTION, $kbq_test_collection_to_query_set_query$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        return ask_utilities.query_variable($SET, query, $$EverythingPSC, $list186).first();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 63500L)
    public static SubLObject run_kbq_query_spec_set_and_process_inferences(SubLObject query_spec_set, SubLObject process_method, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = options;
        SubLObject progress_message_tail = cdestructuring_bind.property_list_member($PROGRESS_MESSAGE, current);
        SubLObject progress_message = (NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : $str188$Processing_KB_Queries;
        SubLObject query_specs = kbq_query_spec_set_elements(query_spec_set, UNPROVIDED, UNPROVIDED);
        SubLObject message_var = progress_message;
        SubLObject list_var = query_specs;
        SubLObject sofar = ZERO_INTEGER;
        SubLObject total = Sequences.length(list_var);
        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message_var);
                SubLObject cdolist_list_var = list_var;
                SubLObject kbq = NIL;
                kbq = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    utilities_macros.note_percent_progress(sofar, total);
                    sofar = Numbers.add(sofar, ONE_INTEGER);
                    SubLObject catch_var = NIL;
                    try {
                        thread.throwStack.push($SKIP_KBQ);
                        SubLObject restart_tag = $SKIP_KBQ;
                        SubLObject dummy = NIL;
                        SubLObject _prev_bind_0_$38 = Errors.$restarts$.currentBinding(thread);
                        try {
                            Errors.$restarts$.bind(cons(list(restart_tag, $str190$Skip_KBQ__S, kbq), Errors.$restarts$.getDynamicValue(thread)), thread);
                            try {
                                thread.throwStack.push(restart_tag);
                                run_kbq_and_process_inferences(kbq, process_method, options);
                            } catch (Throwable ccatch_env_var) {
                                dummy = Errors.handleThrowable(ccatch_env_var, restart_tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                        } finally {
                            Errors.$restarts$.rebind(_prev_bind_0_$38, thread);
                        }
                    } catch (Throwable ccatch_env_var2) {
                        catch_var = Errors.handleThrowable(ccatch_env_var2, $SKIP_KBQ);
                    } finally {
                        thread.throwStack.pop();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    kbq = cdolist_list_var.first();
                }
            } finally {
                SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                }
            }
        } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.length(query_specs);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 64500L)
    public static SubLObject run_kbq_and_process_inferences(SubLObject kbq, SubLObject process_method, SubLObject options) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject additional_args_tail = cdestructuring_bind.property_list_member($ADDITIONAL_ARGS, options);
        SubLObject additional_args = (NIL != additional_args_tail) ? conses_high.cadr(additional_args_tail) : NIL;
        SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member($OUTLIER_TIMEOUT, options);
        SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : NIL;
        SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member($OVERRIDING_QUERY_PROPERTIES, options);
        SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : NIL;
        inference_datastructures_problem_store.destroy_all_problem_stores();
        kb_cleanup.forget_ephemeral_terms(NIL);
        SubLObject message_var = NIL;
        SubLObject was_appendingP = Eval.eval($sym192$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
        Eval.eval($list193);
        try {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind($sym122$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        run_kbq_and_generate_inferences(kbq, outlier_timeout, overriding_query_properties);
                    } catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (Throwable ccatch_env_var) {
                message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                Eval.eval(list($sym194$CSETQ, $sym192$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (message_var.isString()) {
            Errors.warn($str195$_A, message_var);
        }
        SubLObject inferences = inference_datastructures_inference.all_inferences();
        return process_all_kbq_inferences(process_method, kbq, inferences, additional_args);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 65000L)
    public static SubLObject run_kbq_and_generate_inferences(SubLObject kbq, SubLObject outlier_timeout, SubLObject overriding_query_properties) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mandatory_overrides = $list196;
        overriding_query_properties = list_utilities.merge_plist(mandatory_overrides, overriding_query_properties);
        SubLObject _prev_bind_0 = control_vars.$kbq_run_query_auto_destroy_enabledP$.currentBinding(thread);
        try {
            control_vars.$kbq_run_query_auto_destroy_enabledP$.bind(NIL, thread);
            kbq_run_query(kbq, NIL, outlier_timeout, overriding_query_properties, NIL, UNPROVIDED);
        } finally {
            control_vars.$kbq_run_query_auto_destroy_enabledP$.rebind(_prev_bind_0, thread);
        }
        return Sequences.length(inference_datastructures_inference.all_inferences());
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 65600L)
    public static SubLObject process_all_kbq_inferences(SubLObject process_method, SubLObject kbq, SubLObject inferences, SubLObject additional_args) {
        return Functions.funcall(process_method, kbq, inferences, additional_args);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 65800L)
    public static SubLObject kct_run_test_set(SubLObject test_spec_set, SubLObject overriding_metrics, SubLObject outlier_timeout, SubLObject overriding_query_properties, SubLObject include_resultsP, SubLObject comment, SubLObject output_filename, SubLObject expose_runstateP, SubLObject skip,
            SubLObject count, SubLObject randomize, SubLObject file_mode, SubLObject tail_tests, SubLObject keepalive_filename) {
        if (overriding_metrics == UNPROVIDED) {
            overriding_metrics = NIL;
        }
        if (outlier_timeout == UNPROVIDED) {
            outlier_timeout = $kbq_outlier_timeout$.getDynamicValue();
        }
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (include_resultsP == UNPROVIDED) {
            include_resultsP = NIL;
        }
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        if (output_filename == UNPROVIDED) {
            output_filename = NIL;
        }
        if (expose_runstateP == UNPROVIDED) {
            expose_runstateP = NIL;
        }
        if (skip == UNPROVIDED) {
            skip = ZERO_INTEGER;
        }
        if (count == UNPROVIDED) {
            count = NIL;
        }
        if (randomize == UNPROVIDED) {
            randomize = NIL;
        }
        if (file_mode == UNPROVIDED) {
            file_mode = $OUTPUT;
        }
        if (tail_tests == UNPROVIDED) {
            tail_tests = NIL;
        }
        if (keepalive_filename == UNPROVIDED) {
            keepalive_filename = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_specs = kct_test_spec_set_elements(test_spec_set, randomize, tail_tests);
        SubLObject test_end = (NIL != count) ? Numbers.add(skip, count) : NIL;
        SubLObject test_count = ZERO_INTEGER;
        SubLObject test_runs = NIL;
        SubLObject output_stream = NIL;
        SubLObject kct_set_runstate = NIL;
        if (NIL != expose_runstateP) {
            kct_set_runstate = new_kct_set_runstate(test_spec_set);
            kct_thinking.kct_thinking_set_runstate_id(kctsr_id(kct_set_runstate), UNPROVIDED);
        }
        SubLObject _prev_bind_0 = $kct_set_runstate$.currentBinding(thread);
        try {
            $kct_set_runstate$.bind(kct_set_runstate, thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($ABORT_KCT_RUN_TEST_SET);
                SubLObject restart_tag = $ABORT_KCT_RUN_TEST_SET;
                SubLObject dummy = NIL;
                SubLObject _prev_bind_0_$40 = Errors.$restarts$.currentBinding(thread);
                try {
                    Errors.$restarts$.bind(cons(list(restart_tag, $str198$Abort_KCT_run_test_set), Errors.$restarts$.getDynamicValue(thread)), thread);
                    try {
                        thread.throwStack.push(restart_tag);
                        SubLObject state = sksi_sks_manager.current_sks_registration_state();
                        SubLObject _prev_bind_0_$41 = sksi_macros.$within_sksi_sandboxP$.currentBinding(thread);
                        try {
                            sksi_macros.$within_sksi_sandboxP$.bind(T, thread);
                            try {
                                try {
                                    if (NIL != output_filename) {
                                        output_stream = kct_open_test_set_run_output_stream(output_filename, file_mode);
                                    }
                                    if (NIL != output_stream && $OUTPUT == file_mode) {
                                        kct_save_test_set_run_preamble(output_stream, comment);
                                    }
                                    SubLObject list_var = test_specs;
                                    SubLObject _prev_bind_0_$42 = utilities_macros.$progress_note$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                                    SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                                    SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$progress_note$.bind($str199$KCT_running_test_set, thread);
                                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                                        utilities_macros.$progress_sofar$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                                        try {
                                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                            SubLObject csome_list_var = list_var;
                                            SubLObject test_spec = NIL;
                                            test_spec = csome_list_var.first();
                                            while (NIL != csome_list_var) {
                                                if (skip.isPositive()) {
                                                    skip = Numbers.subtract(skip, ONE_INTEGER);
                                                } else if (NIL != kct_utils.kct_test_runnableP(test_spec)) {
                                                    if (NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
                                                        format_nil.force_format(T, $str200$__Running__s__, test_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    SubLObject test_run = kct_run_test(test_spec, overriding_metrics, outlier_timeout, overriding_query_properties, include_resultsP, expose_runstateP);
                                                    test_runs = cons(test_run, test_runs);
                                                    if (output_stream.isStream()) {
                                                        kct_save_test_run(test_run, output_stream);
                                                    }
                                                    file_utilities.possibly_update_keepalive_file(keepalive_filename);
                                                } else {
                                                    Errors.warn($str201$Unrunnable_test____S, test_spec);
                                                }
                                                test_count = Numbers.add(test_count, ONE_INTEGER);
                                                if (NIL != test_end && test_count.numGE(test_end)) {
                                                    abort_kct_run_test_set();
                                                }
                                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                csome_list_var = csome_list_var.rest();
                                                test_spec = csome_list_var.first();
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values = Values.getValuesAsVector();
                                                utilities_macros.noting_percent_progress_postamble();
                                                Values.restoreValuesFromVector(_values);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                            }
                                        }
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                                        utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                                        utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$42, thread);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values2 = Values.getValuesAsVector();
                                        if (output_stream.isStream()) {
                                            streams_high.close(output_stream, UNPROVIDED);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                    }
                                }
                            } finally {
                                SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values3 = Values.getValuesAsVector();
                                    sksi_sks_manager.execute_sks_registration_state(state);
                                    Values.restoreValuesFromVector(_values3);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                }
                            }
                        } finally {
                            sksi_macros.$within_sksi_sandboxP$.rebind(_prev_bind_0_$41, thread);
                        }
                    } catch (Throwable ccatch_env_var) {
                        dummy = Errors.handleThrowable(ccatch_env_var, restart_tag);
                    } finally {
                        thread.throwStack.pop();
                    }
                } finally {
                    Errors.$restarts$.rebind(_prev_bind_0_$40, thread);
                }
            } catch (Throwable ccatch_env_var2) {
                catch_var = Errors.handleThrowable(ccatch_env_var2, $ABORT_KCT_RUN_TEST_SET);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            $kct_set_runstate$.rebind(_prev_bind_0, thread);
        }
        test_runs = Sequences.nreverse(test_runs);
        SubLObject test_set_run = kct_make_test_set_run(test_runs, comment);
        if (NIL != kct_set_runstate_p(kct_set_runstate)) {
            set_kctsr_result(kct_set_runstate, test_set_run);
        }
        return Values.values(test_set_run, test_count);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 68300L)
    public static SubLObject abort_kct_run_test_set() {
        return Dynamic.sublisp_throw($ABORT_KCT_RUN_TEST_SET, NIL);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 68400L)
    public static SubLObject kct_test_spec_set_elements(SubLObject test_spec_set, SubLObject randomize, SubLObject tail_tests) {
        if (randomize == UNPROVIDED) {
            randomize = NIL;
        }
        if (tail_tests == UNPROVIDED) {
            tail_tests = NIL;
        }
        if (NIL != list_utilities.list_of_type_p($sym175$JANUS_OPERATION_P, test_spec_set)) {
            return append(test_spec_set, tail_tests);
        }
        SubLObject v_answer = all_instantiations_via_inference(test_spec_set, $$EverythingPSC);
        if (NIL != randomize) {
            v_answer = list_utilities.randomize_list(v_answer);
        } else {
            v_answer = sort_tests_by_sksi_modules_needed(v_answer);
        }
        return append(v_answer, tail_tests);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 69100L)
    public static SubLObject run_kbq_experiment(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$46 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list202);
            current_$46 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list202);
            if (NIL == conses_high.member(current_$46, $list203, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$46 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list202);
        }
        SubLObject query_spec_set_tail = cdestructuring_bind.property_list_member($QUERY_SPEC_SET, current);
        SubLObject query_spec_set = (NIL != query_spec_set_tail) ? conses_high.cadr(query_spec_set_tail) : NIL;
        SubLObject filename_tail = cdestructuring_bind.property_list_member($FILENAME, current);
        SubLObject filename = (NIL != filename_tail) ? conses_high.cadr(filename_tail) : NIL;
        SubLObject analysis_filename_tail = cdestructuring_bind.property_list_member($ANALYSIS_FILENAME, current);
        SubLObject analysis_filename = (NIL != analysis_filename_tail) ? conses_high.cadr(analysis_filename_tail) : NIL;
        SubLObject keepalive_filename_tail = cdestructuring_bind.property_list_member($KEEPALIVE_FILENAME, current);
        SubLObject keepalive_filename = (NIL != keepalive_filename_tail) ? conses_high.cadr(keepalive_filename_tail) : NIL;
        SubLObject comment_tail = cdestructuring_bind.property_list_member($COMMENT, current);
        SubLObject comment = (NIL != comment_tail) ? conses_high.cadr(comment_tail) : NIL;
        SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member($OVERRIDING_QUERY_PROPERTIES, current);
        SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : NIL;
        SubLObject metrics_tail = cdestructuring_bind.property_list_member($METRICS, current);
        SubLObject metrics = (NIL != metrics_tail) ? conses_high.cadr(metrics_tail) : $list208;
        SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member($OUTLIER_TIMEOUT, current);
        SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : $sym209$_KBQ_DEFAULT_OUTLIER_TIMEOUT_;
        SubLObject incremental_tail = cdestructuring_bind.property_list_member($INCREMENTAL, current);
        SubLObject incremental = (NIL != incremental_tail) ? conses_high.cadr(incremental_tail) : NIL;
        SubLObject include_results_tail = cdestructuring_bind.property_list_member($INCLUDE_RESULTS, current);
        SubLObject include_results = (NIL != include_results_tail) ? conses_high.cadr(include_results_tail) : T;
        SubLObject randomize_tail = cdestructuring_bind.property_list_member($RANDOMIZE, current);
        SubLObject randomize = (NIL != randomize_tail) ? conses_high.cadr(randomize_tail) : NIL;
        SubLObject skip_tail = cdestructuring_bind.property_list_member($SKIP, current);
        SubLObject skip = (NIL != skip_tail) ? conses_high.cadr(skip_tail) : ZERO_INTEGER;
        SubLObject count_tail = cdestructuring_bind.property_list_member($COUNT, current);
        SubLObject count = (NIL != count_tail) ? conses_high.cadr(count_tail) : NIL;
        SubLObject if_file_exists_tail = cdestructuring_bind.property_list_member($IF_FILE_EXISTS, current);
        SubLObject if_file_exists = (NIL != if_file_exists_tail) ? conses_high.cadr(if_file_exists_tail) : $OVERWRITE;
        return list($sym217$RUN_KBQ_EXPERIMENT_INTERNAL, list(new SubLObject[] { $sym218$LIST, $QUERY_SPEC_SET, query_spec_set, $FILENAME, filename, $ANALYSIS_FILENAME, analysis_filename, $KEEPALIVE_FILENAME, keepalive_filename, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES,
                overriding_query_properties, $METRICS, metrics, $OUTLIER_TIMEOUT, outlier_timeout, $INCREMENTAL, incremental, $INCLUDE_RESULTS, include_results, $RANDOMIZE, randomize, $SKIP, skip, $COUNT, count, $IF_FILE_EXISTS, if_file_exists }));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 71000L)
    public static SubLObject last_query_set_run() {
        return $last_query_set_run$.getGlobalValue();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 71000L)
    public static SubLObject run_kbq_experiment_internal(SubLObject experiment_parameters) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_spec_set_tail = cdestructuring_bind.property_list_member($QUERY_SPEC_SET, experiment_parameters);
        SubLObject query_spec_set = (NIL != query_spec_set_tail) ? conses_high.cadr(query_spec_set_tail) : NIL;
        SubLObject filename_tail = cdestructuring_bind.property_list_member($FILENAME, experiment_parameters);
        SubLObject filename = (NIL != filename_tail) ? conses_high.cadr(filename_tail) : NIL;
        SubLObject analysis_filename_tail = cdestructuring_bind.property_list_member($ANALYSIS_FILENAME, experiment_parameters);
        SubLObject analysis_filename = (NIL != analysis_filename_tail) ? conses_high.cadr(analysis_filename_tail) : NIL;
        SubLObject keepalive_filename_tail = cdestructuring_bind.property_list_member($KEEPALIVE_FILENAME, experiment_parameters);
        SubLObject keepalive_filename = (NIL != keepalive_filename_tail) ? conses_high.cadr(keepalive_filename_tail) : NIL;
        SubLObject comment_tail = cdestructuring_bind.property_list_member($COMMENT, experiment_parameters);
        SubLObject comment = (NIL != comment_tail) ? conses_high.cadr(comment_tail) : NIL;
        SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member($OVERRIDING_QUERY_PROPERTIES, experiment_parameters);
        SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : NIL;
        SubLObject metrics_tail = cdestructuring_bind.property_list_member($METRICS, experiment_parameters);
        SubLObject metrics = (NIL != metrics_tail) ? conses_high.cadr(metrics_tail) : inference_datastructures_enumerated_types.all_query_metrics();
        SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member($OUTLIER_TIMEOUT, experiment_parameters);
        SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : $kbq_default_outlier_timeout$.getGlobalValue();
        SubLObject randomize_tail = cdestructuring_bind.property_list_member($RANDOMIZE, experiment_parameters);
        SubLObject randomize = (NIL != randomize_tail) ? conses_high.cadr(randomize_tail) : NIL;
        SubLObject skip_tail = cdestructuring_bind.property_list_member($SKIP, experiment_parameters);
        SubLObject skip = (NIL != skip_tail) ? conses_high.cadr(skip_tail) : ZERO_INTEGER;
        SubLObject count_tail = cdestructuring_bind.property_list_member($COUNT, experiment_parameters);
        SubLObject count = (NIL != count_tail) ? conses_high.cadr(count_tail) : NIL;
        SubLObject incremental_tail = cdestructuring_bind.property_list_member($INCREMENTAL, experiment_parameters);
        SubLObject incremental = (NIL != incremental_tail) ? conses_high.cadr(incremental_tail) : T;
        SubLObject include_results_tail = cdestructuring_bind.property_list_member($INCLUDE_RESULTS, experiment_parameters);
        SubLObject include_results = (NIL != include_results_tail) ? conses_high.cadr(include_results_tail) : T;
        SubLObject if_file_exists_tail = cdestructuring_bind.property_list_member($IF_FILE_EXISTS, experiment_parameters);
        SubLObject if_file_exists = (NIL != if_file_exists_tail) ? conses_high.cadr(if_file_exists_tail) : $OVERWRITE;
        assert NIL != kbq_if_file_exists_handling_p(if_file_exists) : if_file_exists;
        SubLObject query_set_run = NIL;
        SubLObject time = NIL;
        SubLObject tail_queries = NIL;
        SubLObject file_mode = $OUTPUT;
        SubLObject original_filename = filename;
        SubLObject entire_query_set_runP = makeBoolean(NIL == file_utilities.file_existsP(original_filename));
        if (NIL != filename) {
            thread.resetMultipleValues();
            SubLObject query_spec_set_$47 = kbq_setup_file_handling(query_spec_set, filename, if_file_exists);
            SubLObject filename_$48 = thread.secondMultipleValue();
            SubLObject file_mode_$49 = thread.thirdMultipleValue();
            SubLObject tail_queries_$50 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            query_spec_set = query_spec_set_$47;
            filename = filename_$48;
            file_mode = file_mode_$49;
            tail_queries = tail_queries_$50;
        }
        if (NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
            PrintLow.format(T, $str222$__run_starting_at__A, numeric_date_utilities.timestring(UNPROVIDED));
        }
        SubLObject time_var = Time.get_internal_real_time();
        query_set_run = kbq_run_query_set(query_spec_set, metrics, outlier_timeout, overriding_query_properties, include_results, comment, (NIL != incremental) ? filename : NIL, skip, count, randomize, file_mode, tail_queries, keepalive_filename);
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
            PrintLow.format(T, $str223$__run_ended_at__A, numeric_date_utilities.timestring(UNPROVIDED));
            PrintLow.format(T, $str224$__elapsed_time____A, numeric_date_utilities.elapsed_seconds_string(Numbers.truncate(time, UNPROVIDED)));
        }
        if (NIL == incremental && NIL != filename) {
            kbq_save_query_set_run(query_set_run, filename);
        }
        $last_query_set_run$.setGlobalValue(query_set_run);
        if (NIL != analysis_filename) {
            SubLObject analysis_query_set_run = (NIL != entire_query_set_runP) ? query_set_run : kbq_load_query_set_run_and_merge_reruns(original_filename);
            print_kbq_experiment_analysis_to_file(analysis_filename, analysis_query_set_run, metrics);
            print_experiment_csv_to_file(analysis_filename, analysis_query_set_run);
        }
        return time;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 73000L)
    public static SubLObject print_kbq_experiment_analysis_to_file(SubLObject analysis_filename, SubLObject query_set_run, SubLObject metrics) {
        SubLObject analysis = kbq_analyze_query_set_run(query_set_run, metrics);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(analysis_filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str225$Unable_to_open__S, analysis_filename);
            }
            SubLObject s = stream;
            list_utilities.pretty_print_plist(analysis, s);
        } finally {
            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 73300L)
    public static SubLObject kbq_erroring_queries(SubLObject query_set_run) {
        SubLObject queries = NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kbq_erroring_query_runP(query_run)) {
                queries = cons(kbq_query_run_query(query_run), queries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(queries);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 73800L)
    public static SubLObject kbq_erroring_query_count(SubLObject query_set_run) {
        return kbq_count_erroring_query_runs(kbq_query_set_run_query_runs(query_set_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 74000L)
    public static SubLObject kbq_count_erroring_query_runs(SubLObject query_runs) {
        return Sequences.count_if($sym226$KBQ_ERRORING_QUERY_RUN_, query_runs, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 74100L)
    public static SubLObject kbq_erroring_query_runP(SubLObject query_run) {
        SubLObject halt_reason = kbq_query_run_halt_reason(query_run);
        return inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 74300L)
    public static SubLObject kbq_if_file_exists_handling_p(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list227);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 74400L)
    public static SubLObject kbq_experiment_augmentability_status(SubLObject query_spec_set, SubLObject filename) {
        SubLObject old_query_set_run = kbq_load_query_set_run(filename);
        SubLObject old_query_count = kbq_query_set_run_query_count(old_query_set_run);
        SubLObject query_count = Sequences.length(kbq_query_spec_set_elements(query_spec_set, UNPROVIDED, UNPROVIDED));
        SubLObject not_yet_run_query_count = Numbers.subtract(query_count, old_query_count);
        SubLObject erroring_query_count = kbq_erroring_query_count(old_query_set_run);
        return Values.values(not_yet_run_query_count, erroring_query_count);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 75100L)
    public static SubLObject kbq_setup_file_handling(SubLObject query_spec_set, SubLObject filename, SubLObject if_file_exists) {
        assert NIL != kbq_if_file_exists_handling_p(if_file_exists) : if_file_exists;
        if (NIL == Filesys.probe_file(filename)) {
            if_file_exists = $OVERWRITE;
        }
        SubLObject pcase_var = if_file_exists;
        if (pcase_var.eql($OVERWRITE)) {
            return Values.values(query_spec_set, filename, $OUTPUT, NIL);
        }
        if (pcase_var.eql($AUGMENT)) {
            SubLObject queries_not_yet_run = kbq_queries_not_yet_run(query_spec_set, filename);
            SubLObject possible_crash_query = queries_not_yet_run.first();
            SubLObject rest_queries = queries_not_yet_run.rest();
            return Values.values(el_utilities.make_el_set(rest_queries, UNPROVIDED), filename, $APPEND, list(possible_crash_query));
        }
        if (pcase_var.eql($RERUN_ERRORS)) {
            SubLObject old_query_set_run = kbq_load_query_set_run_and_merge_reruns(filename);
            SubLObject queries_to_rerun = kbq_erroring_queries(old_query_set_run);
            SubLObject filename_without_extension = kbq_strip_suffix_from_filename(filename);
            SubLObject new_filename = kbq_compute_rerun_errors_filename(filename_without_extension);
            return Values.values(el_utilities.make_el_set(queries_to_rerun, UNPROVIDED), new_filename, $OUTPUT, NIL);
        }
        if (!pcase_var.eql($AUGMENT_OR_RERUN_ERRORS)) {
            return Errors.error($str232$unexpected_if_file_exists__s, if_file_exists);
        }
        SubLObject queries_not_yet_run = kbq_queries_not_yet_run(query_spec_set, filename);
        if (NIL != queries_not_yet_run) {
            return kbq_setup_file_handling(query_spec_set, filename, $AUGMENT);
        }
        return kbq_setup_file_handling(query_spec_set, filename, $RERUN_ERRORS);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 76600L)
    public static SubLObject kbq_queries_not_yet_run(SubLObject query_spec_set, SubLObject filename) {
        SubLObject old_query_set_run = kbq_load_query_set_run(filename);
        SubLObject old_queries = kbq_query_set_run_queries(old_query_set_run);
        SubLObject queries = kbq_query_spec_set_elements(query_spec_set, UNPROVIDED, UNPROVIDED);
        return kb_utilities.sort_terms(list_utilities.remove_if_not($sym85$KBQ_RUNNABLE_, list_utilities.fast_set_difference(queries, old_queries, Symbols.symbol_function(EQUAL)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 77000L)
    public static SubLObject kbq_compute_rerun_errors_filename(SubLObject filename_without_extension) {
        SubLObject i = ONE_INTEGER;
        SubLObject filename = NIL;
        while (NIL == filename) {
            SubLObject candidate_filename = kbq_candidate_rerun_errors_filename(filename_without_extension, i);
            if (NIL != Filesys.probe_file(candidate_filename)) {
                i = Numbers.add(i, ONE_INTEGER);
            } else {
                filename = candidate_filename;
            }
        }
        return filename;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 77300L)
    public static SubLObject kbq_candidate_rerun_errors_filename(SubLObject filename_without_extension, SubLObject i) {
        SubLObject i_str = string_utilities.str(i);
        SubLObject candidate_filename = Sequences.cconcatenate(filename_without_extension, new SubLObject[] { $str233$_rerun_errors_, i_str, $query_set_run_file_extension$.getGlobalValue() });
        return candidate_filename;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 77600L)
    public static SubLObject kbq_load_query_set_run_and_merge_reruns(SubLObject filename) {
        SubLObject query_set_run = kbq_load_query_set_run(filename);
        SubLObject filename_without_extension = kbq_strip_suffix_from_filename(filename);
        SubLObject i = ONE_INTEGER;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            SubLObject rerun_filename = kbq_candidate_rerun_errors_filename(filename_without_extension, i);
            if (NIL != Filesys.probe_file(rerun_filename)) {
                SubLObject query_set_rerun = kbq_load_query_set_run(rerun_filename);
                query_set_run = kbq_merge_query_set_run_with_rerun(query_set_run, query_set_rerun);
                i = Numbers.add(i, ONE_INTEGER);
            } else {
                doneP = T;
            }
        }
        return query_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 78200L)
    public static SubLObject kbq_merge_query_set_run_with_rerun(SubLObject query_set_run, SubLObject query_set_rerun) {
        SubLObject query_runs = conses_high.copy_list(kbq_query_set_run_query_runs(query_set_run));
        SubLObject cons;
        SubLObject query_run;
        SubLObject query;
        SubLObject query_rerun;
        for (cons = NIL, cons = query_runs; !cons.isAtom(); cons = cons.rest()) {
            query_run = cons.first();
            if (NIL != kbq_erroring_query_runP(query_run)) {
                query = kbq_query_run_query(query_run);
                query_rerun = kbq_lookup_query_run(query_set_rerun, query);
                if (NIL != query_rerun) {
                    rplaca(cons, query_rerun);
                }
            }
        }
        SubLObject new_query_set_run = conses_high.copy_list(query_set_run);
        new_query_set_run = conses_high.putf(new_query_set_run, $QUERY_RUNS, query_runs);
        return new_query_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 78900L)
    public static SubLObject run_kct_experiment(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$51 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list234);
            current_$51 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list234);
            if (NIL == conses_high.member(current_$51, $list235, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$51 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list234);
        }
        SubLObject test_spec_set_tail = cdestructuring_bind.property_list_member($TEST_SPEC_SET, current);
        SubLObject test_spec_set = (NIL != test_spec_set_tail) ? conses_high.cadr(test_spec_set_tail) : NIL;
        SubLObject filename_tail = cdestructuring_bind.property_list_member($FILENAME, current);
        SubLObject filename = (NIL != filename_tail) ? conses_high.cadr(filename_tail) : NIL;
        SubLObject analysis_filename_tail = cdestructuring_bind.property_list_member($ANALYSIS_FILENAME, current);
        SubLObject analysis_filename = (NIL != analysis_filename_tail) ? conses_high.cadr(analysis_filename_tail) : NIL;
        SubLObject keepalive_filename_tail = cdestructuring_bind.property_list_member($KEEPALIVE_FILENAME, current);
        SubLObject keepalive_filename = (NIL != keepalive_filename_tail) ? conses_high.cadr(keepalive_filename_tail) : NIL;
        SubLObject comment_tail = cdestructuring_bind.property_list_member($COMMENT, current);
        SubLObject comment = (NIL != comment_tail) ? conses_high.cadr(comment_tail) : NIL;
        SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member($OVERRIDING_QUERY_PROPERTIES, current);
        SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : NIL;
        SubLObject overriding_metrics_tail = cdestructuring_bind.property_list_member($OVERRIDING_METRICS, current);
        SubLObject overriding_metrics = (NIL != overriding_metrics_tail) ? conses_high.cadr(overriding_metrics_tail) : $list208;
        SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member($OUTLIER_TIMEOUT, current);
        SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : $sym238$_KBQ_OUTLIER_TIMEOUT_;
        SubLObject incremental_tail = cdestructuring_bind.property_list_member($INCREMENTAL, current);
        SubLObject incremental = (NIL != incremental_tail) ? conses_high.cadr(incremental_tail) : NIL;
        SubLObject include_results_tail = cdestructuring_bind.property_list_member($INCLUDE_RESULTS, current);
        SubLObject include_results = (NIL != include_results_tail) ? conses_high.cadr(include_results_tail) : T;
        SubLObject if_file_exists_tail = cdestructuring_bind.property_list_member($IF_FILE_EXISTS, current);
        SubLObject if_file_exists = (NIL != if_file_exists_tail) ? conses_high.cadr(if_file_exists_tail) : $OVERWRITE;
        SubLObject expose_runstate_tail = cdestructuring_bind.property_list_member($EXPOSE_RUNSTATE, current);
        SubLObject expose_runstate = (NIL != expose_runstate_tail) ? conses_high.cadr(expose_runstate_tail) : NIL;
        SubLObject randomize_tail = cdestructuring_bind.property_list_member($RANDOMIZE, current);
        SubLObject randomize = (NIL != randomize_tail) ? conses_high.cadr(randomize_tail) : NIL;
        SubLObject skip_tail = cdestructuring_bind.property_list_member($SKIP, current);
        SubLObject skip = (NIL != skip_tail) ? conses_high.cadr(skip_tail) : ZERO_INTEGER;
        SubLObject count_tail = cdestructuring_bind.property_list_member($COUNT, current);
        SubLObject count = (NIL != count_tail) ? conses_high.cadr(count_tail) : NIL;
        return list($sym240$RUN_KCT_EXPERIMENT_INTERNAL,
                list(new SubLObject[] { $sym218$LIST, $TEST_SPEC_SET, test_spec_set, $FILENAME, filename, $ANALYSIS_FILENAME, analysis_filename, $KEEPALIVE_FILENAME, keepalive_filename, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, overriding_query_properties,
                        $OVERRIDING_METRICS, overriding_metrics, $OUTLIER_TIMEOUT, outlier_timeout, $INCREMENTAL, incremental, $INCLUDE_RESULTS, include_results, $IF_FILE_EXISTS, if_file_exists, $EXPOSE_RUNSTATE, expose_runstate, $RANDOMIZE, randomize, $SKIP, skip, $COUNT,
                        count }));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 80400L)
    public static SubLObject run_kct_experiment_internal(SubLObject experiment_parameters) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_spec_set_tail = cdestructuring_bind.property_list_member($TEST_SPEC_SET, experiment_parameters);
        SubLObject test_spec_set = (NIL != test_spec_set_tail) ? conses_high.cadr(test_spec_set_tail) : NIL;
        SubLObject filename_tail = cdestructuring_bind.property_list_member($FILENAME, experiment_parameters);
        SubLObject filename = (NIL != filename_tail) ? conses_high.cadr(filename_tail) : NIL;
        SubLObject analysis_filename_tail = cdestructuring_bind.property_list_member($ANALYSIS_FILENAME, experiment_parameters);
        SubLObject analysis_filename = (NIL != analysis_filename_tail) ? conses_high.cadr(analysis_filename_tail) : NIL;
        SubLObject keepalive_filename_tail = cdestructuring_bind.property_list_member($KEEPALIVE_FILENAME, experiment_parameters);
        SubLObject keepalive_filename = (NIL != keepalive_filename_tail) ? conses_high.cadr(keepalive_filename_tail) : NIL;
        SubLObject comment_tail = cdestructuring_bind.property_list_member($COMMENT, experiment_parameters);
        SubLObject comment = (NIL != comment_tail) ? conses_high.cadr(comment_tail) : NIL;
        SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member($OVERRIDING_QUERY_PROPERTIES, experiment_parameters);
        SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : NIL;
        SubLObject overriding_metrics_tail = cdestructuring_bind.property_list_member($OVERRIDING_METRICS, experiment_parameters);
        SubLObject overriding_metrics = (NIL != overriding_metrics_tail) ? conses_high.cadr(overriding_metrics_tail) : inference_datastructures_enumerated_types.all_arete_query_metrics();
        SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member($OUTLIER_TIMEOUT, experiment_parameters);
        SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : $kbq_outlier_timeout$.getDynamicValue(thread);
        SubLObject randomize_tail = cdestructuring_bind.property_list_member($RANDOMIZE, experiment_parameters);
        SubLObject randomize = (NIL != randomize_tail) ? conses_high.cadr(randomize_tail) : NIL;
        SubLObject skip_tail = cdestructuring_bind.property_list_member($SKIP, experiment_parameters);
        SubLObject skip = (NIL != skip_tail) ? conses_high.cadr(skip_tail) : ZERO_INTEGER;
        SubLObject count_tail = cdestructuring_bind.property_list_member($COUNT, experiment_parameters);
        SubLObject count = (NIL != count_tail) ? conses_high.cadr(count_tail) : NIL;
        SubLObject incremental_tail = cdestructuring_bind.property_list_member($INCREMENTAL, experiment_parameters);
        SubLObject incremental = (NIL != incremental_tail) ? conses_high.cadr(incremental_tail) : T;
        SubLObject include_results_tail = cdestructuring_bind.property_list_member($INCLUDE_RESULTS, experiment_parameters);
        SubLObject include_results = (NIL != include_results_tail) ? conses_high.cadr(include_results_tail) : T;
        SubLObject if_file_exists_tail = cdestructuring_bind.property_list_member($IF_FILE_EXISTS, experiment_parameters);
        SubLObject if_file_exists = (NIL != if_file_exists_tail) ? conses_high.cadr(if_file_exists_tail) : $OVERWRITE;
        SubLObject expose_runstate_tail = cdestructuring_bind.property_list_member($EXPOSE_RUNSTATE, experiment_parameters);
        SubLObject expose_runstate = (NIL != expose_runstate_tail) ? conses_high.cadr(expose_runstate_tail) : NIL;
        assert NIL != kbq_if_file_exists_handling_p(if_file_exists) : if_file_exists;
        SubLObject test_set_run = NIL;
        SubLObject time = NIL;
        SubLObject tail_tests = NIL;
        SubLObject file_mode = $OUTPUT;
        SubLObject original_filename = filename;
        SubLObject entire_test_set_runP = makeBoolean(NIL == file_utilities.file_existsP(original_filename));
        if (NIL != filename) {
            thread.resetMultipleValues();
            SubLObject test_spec_set_$52 = kct_setup_file_handling(test_spec_set, filename, if_file_exists);
            SubLObject filename_$53 = thread.secondMultipleValue();
            SubLObject file_mode_$54 = thread.thirdMultipleValue();
            SubLObject tail_tests_$55 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            test_spec_set = test_spec_set_$52;
            filename = filename_$53;
            file_mode = file_mode_$54;
            tail_tests = tail_tests_$55;
        }
        if (NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
            PrintLow.format(T, $str222$__run_starting_at__A, numeric_date_utilities.timestring(UNPROVIDED));
        }
        SubLObject time_var = Time.get_internal_real_time();
        test_set_run = kct_run_test_set(test_spec_set, overriding_metrics, outlier_timeout, overriding_query_properties, include_results, comment, (NIL != incremental) ? filename : NIL, expose_runstate, skip, count, randomize, file_mode, tail_tests, keepalive_filename);
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
            PrintLow.format(T, $str223$__run_ended_at__A, numeric_date_utilities.timestring(UNPROVIDED));
            PrintLow.format(T, $str224$__elapsed_time____A, numeric_date_utilities.elapsed_seconds_string(Numbers.truncate(time, UNPROVIDED)));
        }
        if (NIL == incremental && NIL != filename) {
            kct_save_test_set_run(test_set_run, filename);
        }
        $last_test_set_run$.setGlobalValue(test_set_run);
        if (NIL != analysis_filename) {
            SubLObject analysis_test_set_run = (NIL != entire_test_set_runP) ? test_set_run : kct_load_test_set_run_and_merge_reruns(original_filename);
            print_kct_experiment_analysis_to_file(analysis_filename, analysis_test_set_run, overriding_metrics, test_spec_set);
            print_experiment_csv_to_file(analysis_filename, analysis_test_set_run);
        }
        return time;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 82400L)
    public static SubLObject print_kct_experiment_analysis_to_file(SubLObject analysis_filename, SubLObject test_set_run, SubLObject metrics, SubLObject test_spec_set) {
        SubLObject analysis = kct_analyze_test_set_run(test_set_run, metrics);
        SubLObject regression_tests_uninterestingP = makeBoolean(NIL != list_utilities.every_in_list($sym243$KB_CONTENT_REGRESSION_TEST_, kct_test_set_run_test_runs(test_set_run), $sym110$KCT_TEST_RUN_TEST)
                || NIL == list_utilities.any_in_list($sym243$KB_CONTENT_REGRESSION_TEST_, kct_test_set_run_test_runs(test_set_run), $sym110$KCT_TEST_RUN_TEST));
        SubLObject regression_test_set_run = (NIL != regression_tests_uninterestingP) ? NIL : kct_filter_test_set_run_by_test(test_set_run, $str244$Filtered_to___KBContentRegression, $sym243$KB_CONTENT_REGRESSION_TEST_, $sym110$KCT_TEST_RUN_TEST);
        SubLObject regression_tests_analysis = (NIL != regression_tests_uninterestingP) ? NIL : kct_analyze_test_set_run(regression_test_set_run, metrics);
        SubLObject failing_tests = kct_test_set_run_tests(kct_failing_test_set_run(test_set_run));
        SubLObject failing_regression_tests = (NIL != regression_tests_uninterestingP) ? NIL : kct_test_set_run_tests(kct_failing_test_set_run(regression_test_set_run));
        SubLObject test_specs = kct_test_spec_set_elements(test_spec_set, UNPROVIDED, UNPROVIDED);
        SubLObject unrunnable_tests = list_utilities.fast_set_difference(test_specs, kct_test_set_run_tests(test_set_run), UNPROVIDED);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(analysis_filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str225$Unable_to_open__S, analysis_filename);
            }
            SubLObject s = stream;
            PrintLow.format(s, $str245$All_tests___);
            list_utilities.pretty_print_plist(analysis, s);
            if (NIL == regression_tests_uninterestingP) {
                PrintLow.format(s, $str246$__Just_the_regression_tests___);
                list_utilities.pretty_print_plist(regression_tests_analysis, s);
            }
            if (NIL != list_utilities.lengthLE(failing_tests, $int$212, UNPROVIDED)) {
                PrintLow.format(s, $str248$__Failing_tests_);
                format_nil.print_one_per_line(failing_tests, s);
            }
            if (NIL == regression_tests_uninterestingP && NIL != list_utilities.lengthLE(failing_regression_tests, $int$212, UNPROVIDED)) {
                PrintLow.format(s, $str249$____Failing_regression_tests___a_, Sequences.length(failing_regression_tests));
                format_nil.print_one_per_line(failing_regression_tests, s);
            }
            if (NIL != unrunnable_tests) {
                PrintLow.format(s, $str250$____Unrunnable_tests_);
                SubLObject cdolist_list_var = unrunnable_tests;
                SubLObject test = NIL;
                test = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject explanation = Values.nth_value_step_2(Values.nth_value_step_1(ONE_INTEGER), kct_utils.why_not_kct_test_valid(test));
                    if (NIL != string_utilities.non_empty_string_p(explanation)) {
                        PrintLow.format(s, $str251$_a, explanation);
                    } else {
                        PrintLow.format(s, $str252$___a_is_unrunnable_for_an_unknown, test);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    test = cdolist_list_var.first();
                }
            }
            streams_high.terpri(s);
        } finally {
            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 84600L)
    public static SubLObject print_experiment_csv_to_file(SubLObject analysis_filename, SubLObject test_or_query_set_run) {
        SubLObject csv_name = Sequences.cconcatenate(analysis_filename, $str253$_csv);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(csv_name, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str225$Unable_to_open__S, csv_name);
            }
            SubLObject csv = stream;
            PrintLow.format(T, $str254$__Writing_csv_to___A__, Sequences.cconcatenate(analysis_filename, $str253$_csv));
            SubLObject tests = append(list_utilities.plist_lookup(test_or_query_set_run, $TEST_RUNS, UNPROVIDED), list_utilities.plist_lookup(test_or_query_set_run, $QUERY_RUNS, UNPROVIDED));
            PrintLow.format(csv, $str255$Comment___A__, list_utilities.plist_lookup(test_or_query_set_run, $COMMENT, UNPROVIDED));
            PrintLow.format(csv, $str256$Date___A__, list_utilities.plist_lookup(test_or_query_set_run, $DATE, UNPROVIDED));
            SubLObject cdolist_list_var = tests;
            SubLObject atest = NIL;
            atest = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject qrun = list_utilities.plist_lookup(atest, $QUERY_RUN, UNPROVIDED);
                PrintLow.format(csv, $str257$_A__A__A__A__A__A__A___, new SubLObject[] { list_utilities.plist_lookup(atest, $TEST, UNPROVIDED), list_utilities.plist_lookup(atest, $STATUS, UNPROVIDED),
                        list_utilities.plist_lookup(atest, $STATUS, UNPROVIDED).equalp($SUCCESS) ? list_utilities.plist_lookup(qrun, $HALT_REASON, UNPROVIDED) : $str161$,
                        (list_utilities.plist_lookup(atest, $STATUS, UNPROVIDED).equalp($SUCCESS) && !list_utilities.plist_lookup(qrun, $HALT_REASON, UNPROVIDED).isList()) ? list_utilities.plist_lookup(qrun, $HALT_REASON, UNPROVIDED) : $str161$,
                        list_utilities.plist_lookup(qrun, $ANSWER_COUNT, UNPROVIDED), list_utilities.plist_lookup(qrun, $TIME_TO_FIRST_ANSWER, UNPROVIDED), list_utilities.plist_lookup(qrun, $TIME_TO_LAST_ANSWER, UNPROVIDED), list_utilities.plist_lookup(qrun, $TOTAL_TIME, UNPROVIDED) });
                cdolist_list_var = cdolist_list_var.rest();
                atest = cdolist_list_var.first();
            }
        } finally {
            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 85900L)
    public static SubLObject kct_erroring_tests(SubLObject test_set_run) {
        SubLObject tests = NIL;
        SubLObject cdolist_list_var = kct_test_set_run_test_runs(test_set_run);
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kct_erroring_test_runP(test_run)) {
                tests = cons(kct_test_run_test(test_run), tests);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(tests);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 86400L)
    public static SubLObject kct_erroring_test_count(SubLObject test_set_run) {
        return kct_count_erroring_test_runs(kct_test_set_run_test_runs(test_set_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 86500L)
    public static SubLObject kct_count_erroring_test_runs(SubLObject test_runs) {
        return Sequences.count_if($sym258$KCT_ERRORING_TEST_RUN_, test_runs, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 86700L)
    public static SubLObject kct_erroring_test_runP(SubLObject test_run) {
        SubLObject halt_reason = kbq_query_run_halt_reason(kct_test_run_query_run(test_run));
        return inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 86900L)
    public static SubLObject kct_setup_file_handling(SubLObject test_spec_set, SubLObject filename, SubLObject if_file_exists) {
        assert NIL != kbq_if_file_exists_handling_p(if_file_exists) : if_file_exists;
        if (NIL == Filesys.probe_file(filename)) {
            if_file_exists = $OVERWRITE;
        }
        SubLObject pcase_var = if_file_exists;
        if (pcase_var.eql($OVERWRITE)) {
            return Values.values(test_spec_set, filename, $OUTPUT, NIL);
        }
        if (pcase_var.eql($AUGMENT)) {
            SubLObject tests_not_yet_run = kct_tests_not_yet_run(test_spec_set, filename);
            SubLObject possible_crash_test = tests_not_yet_run.first();
            SubLObject rest_tests = tests_not_yet_run.rest();
            return Values.values(el_utilities.make_el_set(rest_tests, UNPROVIDED), filename, $APPEND, list(possible_crash_test));
        }
        if (pcase_var.eql($RERUN_ERRORS)) {
            SubLObject old_test_set_run = kct_load_test_set_run_and_merge_reruns(filename);
            SubLObject tests_to_rerun = kct_erroring_tests(old_test_set_run);
            SubLObject filename_without_extension = kct_strip_suffix_from_filename(filename);
            SubLObject new_filename = kct_compute_rerun_errors_filename(filename_without_extension);
            return Values.values(el_utilities.make_el_set(tests_to_rerun, UNPROVIDED), new_filename, $OUTPUT, NIL);
        }
        if (!pcase_var.eql($AUGMENT_OR_RERUN_ERRORS)) {
            return Errors.error($str232$unexpected_if_file_exists__s, if_file_exists);
        }
        SubLObject tests_not_yet_run = kct_tests_not_yet_run(test_spec_set, filename);
        if (NIL != tests_not_yet_run) {
            return kct_setup_file_handling(test_spec_set, filename, $AUGMENT);
        }
        return kct_setup_file_handling(test_spec_set, filename, $RERUN_ERRORS);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 88300L)
    public static SubLObject kct_tests_not_yet_run(SubLObject test_spec_set, SubLObject filename) {
        SubLObject old_test_set_run = kct_load_test_set_run(filename);
        SubLObject old_tests = kct_test_set_run_tests(old_test_set_run);
        SubLObject tests = kct_test_spec_set_elements(test_spec_set, UNPROVIDED, UNPROVIDED);
        return kb_utilities.sort_terms(list_utilities.remove_if_not($sym259$KCT_TEST_RUNNABLE_, list_utilities.fast_set_difference(tests, old_tests, Symbols.symbol_function(EQUAL)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 88700L)
    public static SubLObject kct_compute_rerun_errors_filename(SubLObject filename_without_extension) {
        return kbq_compute_rerun_errors_filename(filename_without_extension);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 88900L)
    public static SubLObject kct_candidate_rerun_errors_filename(SubLObject filename_without_extension, SubLObject i) {
        return kbq_candidate_rerun_errors_filename(filename_without_extension, i);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 89100L)
    public static SubLObject kct_load_test_set_run_and_merge_reruns(SubLObject filename) {
        SubLObject test_set_run = kct_load_test_set_run(filename);
        SubLObject filename_without_extension = kct_strip_suffix_from_filename(filename);
        SubLObject i = ONE_INTEGER;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            SubLObject rerun_filename = kct_candidate_rerun_errors_filename(filename_without_extension, i);
            if (NIL != Filesys.probe_file(rerun_filename)) {
                SubLObject test_set_rerun = kct_load_test_set_run(rerun_filename);
                test_set_run = kct_merge_test_set_run_with_rerun(test_set_run, test_set_rerun);
                i = Numbers.add(i, ONE_INTEGER);
            } else {
                doneP = T;
            }
        }
        return test_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 89700L)
    public static SubLObject kct_merge_test_set_run_with_rerun(SubLObject test_set_run, SubLObject test_set_rerun) {
        SubLObject test_runs = conses_high.copy_list(kct_test_set_run_test_runs(test_set_run));
        SubLObject cons;
        SubLObject test_run;
        SubLObject test;
        SubLObject test_rerun;
        for (cons = NIL, cons = test_runs; !cons.isAtom(); cons = cons.rest()) {
            test_run = cons.first();
            if (NIL != kct_erroring_test_runP(test_run)) {
                test = kct_test_run_test(test_run);
                test_rerun = kct_lookup_test_run(test_set_rerun, test);
                if (NIL != test_rerun) {
                    rplaca(cons, test_rerun);
                }
            }
        }
        SubLObject new_test_set_run = conses_high.copy_list(test_set_run);
        new_test_set_run = conses_high.putf(new_test_set_run, $TEST_RUNS, test_runs);
        return new_test_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 90400L)
    public static SubLObject kbq_runstate_validP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return kbq_runstate_p($kbq_runstate$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 90900L)
    public static SubLObject kbq_runstate_inference_already_setP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(kbqr_inference($kbq_runstate$.getDynamicValue(thread)));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91000L)
    public static SubLObject set_kbq_runstate_inference(SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return set_kbqr_inference($kbq_runstate$.getDynamicValue(thread), inference);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91100L)
    public static SubLObject possibly_set_kbq_runstate_inference(SubLObject inference) {
        if (NIL != kbq_runstate_validP() && NIL == kbq_runstate_inference_already_setP()) {
            return set_kbq_runstate_inference(inference);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91300L)
    public static SubLObject find_kbq_runstate_by_id(SubLObject id) {
        return runstate_find_object_by_id(id);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91400L)
    public static SubLObject find_kbq_runstate_by_id_string(SubLObject id_string) {
        SubLObject id = reader.parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject kbq_runstate = find_kbq_runstate_by_id(id);
        return kbq_runstate;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91600L)
    public static SubLObject find_kct_runstate_by_id(SubLObject id) {
        return runstate_find_object_by_id(id);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91700L)
    public static SubLObject find_kct_runstate_by_id_string(SubLObject id_string) {
        SubLObject id = reader.parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject kct_runstate = find_kbq_runstate_by_id(id);
        return kct_runstate;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91900L)
    public static SubLObject find_kct_set_runstate_by_id(SubLObject id) {
        return runstate_find_object_by_id(id);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91900L)
    public static SubLObject find_kct_set_runstate_by_id_string(SubLObject id_string) {
        SubLObject id = reader.parse_integer(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject kct_set_runstate = find_kbq_runstate_by_id(id);
        return kct_set_runstate;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92400L)
    public static SubLObject next_runstate_id() {
        return integer_sequence_generator.integer_sequence_generator_next($runstate_isg$.getGlobalValue());
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92500L)
    public static SubLObject runstate_add_object(SubLObject id, SubLObject v_object) {
        return dictionary.dictionary_enter($runstate_index$.getGlobalValue(), id, v_object);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92600L)
    public static SubLObject runstate_rem_object(SubLObject id) {
        return dictionary.dictionary_remove($runstate_index$.getGlobalValue(), id);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92700L)
    public static SubLObject runstate_find_object_by_id(SubLObject id) {
        return dictionary.dictionary_lookup($runstate_index$.getGlobalValue(), id, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 92800L)
    public static SubLObject runstate_constant(SubLObject runstate) {
        if (NIL != kbq_runstate_p(runstate)) {
            return kbq_runstate_query_spec(runstate);
        }
        if (NIL != kct_runstate_p(runstate)) {
            return kct_runstate_test_spec(runstate);
        }
        if (NIL != kct_set_runstate_p(runstate)) {
            return kct_set_runstate_test_set(runstate);
        }
        Errors.error($str262$Unknown_runstate_type___A, runstate);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 93200L)
    public static SubLObject runstate_result_status(SubLObject runstate) {
        if (NIL != kct_runstate_p(runstate)) {
            return kct_runstate_result_status(runstate);
        }
        if (NIL != kct_set_runstate_p(runstate)) {
            return kct_set_runstate_result_status(runstate);
        }
        Errors.error($str263$Runstate_has_no_status___A, runstate);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 93500L)
    public static SubLObject runstate_result_text(SubLObject runstate) {
        return $str264$Explanations_aren_t_yet_implement;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 93600L)
    public static SubLObject runstate_run_status(SubLObject runstate) {
        if (NIL != kbq_runstate_p(runstate)) {
            return kbq_runstate_run_status(runstate);
        }
        if (NIL != kct_runstate_p(runstate)) {
            return kct_runstate_run_status(runstate);
        }
        if (NIL != kct_set_runstate_p(runstate)) {
            return kct_set_runstate_run_status(runstate);
        }
        Errors.error($str262$Unknown_runstate_type___A, runstate);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 93900L)
    public static SubLObject runstate_inference(SubLObject runstate) {
        if (NIL != kbq_runstate_p(runstate)) {
            return kbq_runstate_inference(runstate);
        }
        if (NIL != kct_runstate_p(runstate)) {
            return kct_runstate_inference(runstate);
        }
        Errors.error($str265$No_inference_defined_for_this_run, runstate);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 94200L)
    public static SubLObject runstate_start(SubLObject runstate) {
        if (NIL != kct_runstate_p(runstate)) {
            return kct_runstate_start(runstate);
        }
        if (NIL != kct_set_runstate_p(runstate)) {
            return kct_set_runstate_start(runstate);
        }
        Errors.error($str266$No_start_defined_for_this_runstat, runstate);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 94400L)
    public static SubLObject runstate_end(SubLObject runstate) {
        if (NIL != kct_runstate_p(runstate)) {
            return kct_runstate_end(runstate);
        }
        if (NIL != kct_set_runstate_p(runstate)) {
            return kct_set_runstate_end(runstate);
        }
        Errors.error($str267$No_end_defined_for_this_runstate_, runstate);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 94700L)
    public static SubLObject set_runstate_run_status(SubLObject runstate, SubLObject run_status) {
        assert NIL != Types.keywordp(run_status) : run_status;
        if (NIL != kbq_runstate_p(runstate)) {
            return set_kbqr_run_status(runstate, run_status);
        }
        if (NIL != kct_runstate_p(runstate)) {
            return set_kctr_run_status(runstate, run_status);
        }
        if (NIL != kct_set_runstate_p(runstate)) {
            return set_kctsr_run_status(runstate, run_status);
        }
        Errors.error($str263$Runstate_has_no_status___A, runstate);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95200L)
    public static SubLObject destroy_runstate(SubLObject runstate) {
        if (NIL != kbq_runstate_p(runstate)) {
            return destroy_kbq_runstate(runstate);
        }
        if (NIL != kct_runstate_p(runstate)) {
            return destroy_kct_runstate(runstate);
        }
        if (NIL != kct_set_runstate_p(runstate)) {
            destroy_kct_set_runstate(runstate);
        } else {
            Errors.error($str263$Runstate_has_no_status___A, runstate);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject kbq_runstate_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject kbq_runstate_p(SubLObject v_object) {
        return (v_object.getClass() == $kbq_runstate_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject kbqr_id(SubLObject v_object) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject kbqr_lock(SubLObject v_object) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject kbqr_query_spec(SubLObject v_object) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject kbqr_inference(SubLObject v_object) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject kbqr_result(SubLObject v_object) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject kbqr_test_runstate(SubLObject v_object) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject kbqr_run_status(SubLObject v_object) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject _csetf_kbqr_id(SubLObject v_object, SubLObject value) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject _csetf_kbqr_lock(SubLObject v_object, SubLObject value) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject _csetf_kbqr_query_spec(SubLObject v_object, SubLObject value) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject _csetf_kbqr_inference(SubLObject v_object, SubLObject value) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject _csetf_kbqr_result(SubLObject v_object, SubLObject value) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject _csetf_kbqr_test_runstate(SubLObject v_object, SubLObject value) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject _csetf_kbqr_run_status(SubLObject v_object, SubLObject value) {
        assert NIL != kbq_runstate_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject make_kbq_runstate(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $kbq_runstate_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_kbqr_id(v_new, current_value);
            } else if (pcase_var.eql($LOCK)) {
                _csetf_kbqr_lock(v_new, current_value);
            } else if (pcase_var.eql($QUERY_SPEC)) {
                _csetf_kbqr_query_spec(v_new, current_value);
            } else if (pcase_var.eql($INFERENCE)) {
                _csetf_kbqr_inference(v_new, current_value);
            } else if (pcase_var.eql($RESULT)) {
                _csetf_kbqr_result(v_new, current_value);
            } else if (pcase_var.eql($TEST_RUNSTATE)) {
                _csetf_kbqr_test_runstate(v_new, current_value);
            } else if (pcase_var.eql($RUN_STATUS)) {
                _csetf_kbqr_run_status(v_new, current_value);
            } else {
                Errors.error($str298$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject visit_defstruct_kbq_runstate(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym300$MAKE_KBQ_RUNSTATE, SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $ID, kbqr_id(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $LOCK, kbqr_lock(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $QUERY_SPEC, kbqr_query_spec(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INFERENCE, kbqr_inference(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RESULT, kbqr_result(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TEST_RUNSTATE, kbqr_test_runstate(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RUN_STATUS, kbqr_run_status(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym300$MAKE_KBQ_RUNSTATE, SEVEN_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 95800L)
    public static SubLObject visit_defstruct_object_kbq_runstate_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_kbq_runstate(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 96400L)
    public static SubLObject new_kbq_runstate(SubLObject query_spec, SubLObject test_runstate) {
        assert NIL != kb_query.kbq_query_spec_p(query_spec) : query_spec;
        if (NIL != test_runstate && !assertionsDisabledInClass && NIL == kct_runstate_p(test_runstate)) {
            throw new AssertionError(test_runstate);
        }
        SubLObject kbqr = make_kbq_runstate(UNPROVIDED);
        SubLObject id = next_runstate_id();
        runstate_add_object(id, kbqr);
        _csetf_kbqr_id(kbqr, id);
        _csetf_kbqr_query_spec(kbqr, query_spec);
        _csetf_kbqr_lock(kbqr, Locks.make_lock($str305$KBQ_Runstate_Lock));
        _csetf_kbqr_test_runstate(kbqr, test_runstate);
        _csetf_kbqr_run_status(kbqr, $NONE);
        return kbqr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 96900L)
    public static SubLObject destroy_kbq_runstate(SubLObject kbqr) {
        assert NIL != kbq_runstate_p(kbqr) : kbqr;
        runstate_rem_object(kbqr_id(kbqr));
        _csetf_kbqr_id(kbqr, NIL);
        if (NIL != inference_datastructures_inference.valid_inference_p(kbqr_inference(kbqr))) {
            inference_datastructures_inference.destroy_inference_and_problem_store(kbqr_inference(kbqr));
        }
        _csetf_kbqr_query_spec(kbqr, NIL);
        _csetf_kbqr_lock(kbqr, NIL);
        _csetf_kbqr_result(kbqr, NIL);
        _csetf_kbqr_run_status(kbqr, NIL);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97400L)
    public static SubLObject kbq_runstate_query_spec(SubLObject kbqr) {
        return kbqr_query_spec(kbqr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97500L)
    public static SubLObject kbq_runstate_lock(SubLObject kbqr) {
        return kbqr_lock(kbqr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97500L)
    public static SubLObject kbq_runstate_inference(SubLObject kbqr) {
        return kbqr_inference(kbqr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97600L)
    public static SubLObject kbq_runstate_result(SubLObject kbqr) {
        return kbqr_result(kbqr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97700L)
    public static SubLObject kbq_runstate_test_runstate(SubLObject kbqr) {
        return kbqr_test_runstate(kbqr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97800L)
    public static SubLObject kbq_runstate_run_status(SubLObject kbqr) {
        return kbqr_run_status(kbqr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 97900L)
    public static SubLObject set_kbqr_inference(SubLObject kbqr, SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        assert NIL != kbq_runstate_p(kbqr) : kbqr;
        SubLObject lock = kbqr_lock(kbqr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kbqr_inference(kbqr, inference);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kbqr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 98100L)
    public static SubLObject set_kbqr_result(SubLObject kbqr, SubLObject query_run) {
        assert NIL != kbq_runstate_p(kbqr) : kbqr;
        assert NIL != kbq_query_run_p(query_run) : query_run;
        SubLObject lock = kbqr_lock(kbqr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kbqr_result(kbqr, query_run);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kbqr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 98300L)
    public static SubLObject set_kbqr_run_status(SubLObject kbqr, SubLObject run_status) {
        assert NIL != kbq_runstate_p(kbqr) : kbqr;
        assert NIL != Types.keywordp(run_status) : run_status;
        SubLObject lock = kbqr_lock(kbqr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kbqr_run_status(kbqr, run_status);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kbqr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 98500L)
    public static SubLObject possibly_set_kbqr_run_status(SubLObject kbqr, SubLObject run_status) {
        if (NIL != kbq_runstate_p(kbqr)) {
            return set_kbqr_run_status(kbqr, run_status);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject kct_runstate_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject kct_runstate_p(SubLObject v_object) {
        return (v_object.getClass() == $kct_runstate_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject kctr_id(SubLObject v_object) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject kctr_lock(SubLObject v_object) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject kctr_test_spec(SubLObject v_object) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject kctr_result(SubLObject v_object) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject kctr_query_runstate(SubLObject v_object) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject kctr_test_set_runstate(SubLObject v_object) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject kctr_run_status(SubLObject v_object) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject kctr_start(SubLObject v_object) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField9();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject kctr_end(SubLObject v_object) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.getField10();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject _csetf_kctr_id(SubLObject v_object, SubLObject value) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject _csetf_kctr_lock(SubLObject v_object, SubLObject value) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject _csetf_kctr_test_spec(SubLObject v_object, SubLObject value) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject _csetf_kctr_result(SubLObject v_object, SubLObject value) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject _csetf_kctr_query_runstate(SubLObject v_object, SubLObject value) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject _csetf_kctr_test_set_runstate(SubLObject v_object, SubLObject value) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject _csetf_kctr_run_status(SubLObject v_object, SubLObject value) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject _csetf_kctr_start(SubLObject v_object, SubLObject value) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField9(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject _csetf_kctr_end(SubLObject v_object, SubLObject value) {
        assert NIL != kct_runstate_p(v_object) : v_object;
        return v_object.setField10(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject make_kct_runstate(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $kct_runstate_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_kctr_id(v_new, current_value);
            } else if (pcase_var.eql($LOCK)) {
                _csetf_kctr_lock(v_new, current_value);
            } else if (pcase_var.eql($TEST_SPEC)) {
                _csetf_kctr_test_spec(v_new, current_value);
            } else if (pcase_var.eql($RESULT)) {
                _csetf_kctr_result(v_new, current_value);
            } else if (pcase_var.eql($QUERY_RUNSTATE)) {
                _csetf_kctr_query_runstate(v_new, current_value);
            } else if (pcase_var.eql($TEST_SET_RUNSTATE)) {
                _csetf_kctr_test_set_runstate(v_new, current_value);
            } else if (pcase_var.eql($RUN_STATUS)) {
                _csetf_kctr_run_status(v_new, current_value);
            } else if (pcase_var.eql($START)) {
                _csetf_kctr_start(v_new, current_value);
            } else if (pcase_var.eql($END)) {
                _csetf_kctr_end(v_new, current_value);
            } else {
                Errors.error($str298$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject visit_defstruct_kct_runstate(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym338$MAKE_KCT_RUNSTATE, NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $ID, kctr_id(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $LOCK, kctr_lock(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TEST_SPEC, kctr_test_spec(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RESULT, kctr_result(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $QUERY_RUNSTATE, kctr_query_runstate(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TEST_SET_RUNSTATE, kctr_test_set_runstate(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RUN_STATUS, kctr_run_status(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $START, kctr_start(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $END, kctr_end(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym338$MAKE_KCT_RUNSTATE, NINE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99000L)
    public static SubLObject visit_defstruct_object_kct_runstate_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_kct_runstate(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 99400L)
    public static SubLObject new_kct_runstate(SubLObject test_spec, SubLObject test_set_runstate) {
        if (test_set_runstate == UNPROVIDED) {
            test_set_runstate = NIL;
        }
        assert NIL != kct_utils.kct_test_spec_p(test_spec, UNPROVIDED) : test_spec;
        if (NIL != test_set_runstate && !assertionsDisabledInClass && NIL == kct_set_runstate_p(test_set_runstate)) {
            throw new AssertionError(test_set_runstate);
        }
        SubLObject kctr = make_kct_runstate(UNPROVIDED);
        SubLObject id = next_runstate_id();
        runstate_add_object(id, kctr);
        _csetf_kctr_id(kctr, id);
        _csetf_kctr_test_spec(kctr, test_spec);
        _csetf_kctr_lock(kctr, Locks.make_lock($str341$KCT_Runstate_Lock));
        _csetf_kctr_query_runstate(kctr, NIL);
        _csetf_kctr_test_set_runstate(kctr, test_set_runstate);
        _csetf_kctr_run_status(kctr, $NONE);
        _csetf_kctr_start(kctr, NIL);
        _csetf_kctr_end(kctr, NIL);
        return kctr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100000L)
    public static SubLObject destroy_kct_runstate(SubLObject kctr) {
        assert NIL != kct_runstate_p(kctr) : kctr;
        runstate_rem_object(kctr_id(kctr));
        _csetf_kctr_id(kctr, NIL);
        if (NIL != kct_set_runstate_p(kctr_test_set_runstate(kctr))) {
            kctsr_test_runstate_remove(kctr_test_set_runstate(kctr), kctr);
        }
        if (NIL != kctr_query_runstate(kctr)) {
            destroy_kbq_runstate(kctr_query_runstate(kctr));
        }
        _csetf_kctr_test_spec(kctr, NIL);
        _csetf_kctr_lock(kctr, NIL);
        _csetf_kctr_result(kctr, NIL);
        _csetf_kctr_run_status(kctr, NIL);
        _csetf_kctr_start(kctr, NIL);
        _csetf_kctr_end(kctr, NIL);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100600L)
    public static SubLObject kct_runstate_test_spec(SubLObject kctr) {
        return kctr_test_spec(kctr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100700L)
    public static SubLObject kct_runstate_lock(SubLObject kctr) {
        return kctr_lock(kctr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100800L)
    public static SubLObject kct_runstate_result(SubLObject kctr) {
        return kctr_result(kctr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100800L)
    public static SubLObject kct_runstate_query_runstate(SubLObject kctr) {
        return kctr_query_runstate(kctr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 100900L)
    public static SubLObject kct_runstate_test_set_runstate(SubLObject kctr) {
        return kctr_test_set_runstate(kctr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 101000L)
    public static SubLObject kct_runstate_inference(SubLObject kctr) {
        SubLObject kbq_runstate = kct_runstate_query_runstate(kctr);
        if (NIL != kbq_runstate_p(kbq_runstate)) {
            return kbqr_inference(kbq_runstate);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 101200L)
    public static SubLObject kct_runstate_result_status(SubLObject kctr) {
        return kct_test_run_status(kct_runstate_result(kctr));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 101400L)
    public static SubLObject kct_runstate_failure_explanation(SubLObject kctr) {
        SubLObject test_run = kct_runstate_result(kctr);
        SubLObject query_run = kct_test_run_query_run(test_run);
        SubLObject raw_query_results = kbq_query_run_result(query_run);
        SubLObject actual_results = raw_query_results.first();
        SubLObject hypothetical_bindings = conses_high.second(raw_query_results);
        SubLObject test_spec = kct_runstate_test_spec(kctr);
        return why_kct_failure(test_spec, actual_results, hypothetical_bindings);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 101800L)
    public static SubLObject kct_runstate_metric_value(SubLObject kctr, SubLObject metric) {
        SubLObject test_run = kct_runstate_result(kctr);
        SubLObject query_run = kct_test_run_query_run(test_run);
        return kbq_extract_query_run_metric_value(query_run, metric, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102000L)
    public static SubLObject kct_runstate_run_status(SubLObject kctr) {
        assert NIL != kct_runstate_p(kctr) : kctr;
        SubLObject kbqr = kct_runstate_query_runstate(kctr);
        if (NIL != kbq_runstate_p(kbqr)) {
            return kbq_runstate_run_status(kbqr);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102300L)
    public static SubLObject kct_runstate_start(SubLObject kctr) {
        return kctr_start(kctr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102300L)
    public static SubLObject kct_runstate_end(SubLObject kctr) {
        return kctr_end(kctr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102400L)
    public static SubLObject set_kctr_result(SubLObject kctr, SubLObject test_run) {
        assert NIL != kct_runstate_p(kctr) : kctr;
        assert NIL != kct_test_run_p(test_run) : test_run;
        SubLObject lock = kctr_lock(kctr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_result(kctr, test_run);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102600L)
    public static SubLObject set_kctr_query_runstate(SubLObject kctr, SubLObject kbqr) {
        assert NIL != kct_runstate_p(kctr) : kctr;
        assert NIL != kbq_runstate_p(kbqr) : kbqr;
        SubLObject lock = kctr_lock(kctr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_query_runstate(kctr, kbqr);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102800L)
    public static SubLObject set_kctr_test_set_runstate(SubLObject kctr, SubLObject kctsr) {
        assert NIL != kct_runstate_p(kctr) : kctr;
        assert NIL != kct_set_runstate_p(kctsr) : kctsr;
        SubLObject lock = kctr_lock(kctr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_test_set_runstate(kctr, kctsr);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 103100L)
    public static SubLObject set_kctr_run_status(SubLObject kctr, SubLObject run_status) {
        assert NIL != kct_runstate_p(kctr) : kctr;
        assert NIL != Types.keywordp(run_status) : run_status;
        SubLObject lock = kctr_lock(kctr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_run_status(kctr, run_status);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 103300L)
    public static SubLObject set_kctr_start(SubLObject kctr, SubLObject time) {
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (NIL == time) {
            time = Time.get_universal_time();
        }
        assert NIL != kct_runstate_p(kctr) : kctr;
        SubLObject lock = kctr_lock(kctr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_start(kctr, time);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 103500L)
    public static SubLObject set_kctr_end(SubLObject kctr, SubLObject time) {
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (NIL == time) {
            time = Time.get_universal_time();
        }
        assert NIL != kct_runstate_p(kctr) : kctr;
        SubLObject lock = kctr_lock(kctr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctr_end(kctr, time);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject kct_set_runstate_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject kct_set_runstate_p(SubLObject v_object) {
        return (v_object.getClass() == $kct_set_runstate_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject kctsr_id(SubLObject v_object) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject kctsr_lock(SubLObject v_object) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject kctsr_test_set(SubLObject v_object) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject kctsr_result(SubLObject v_object) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject kctsr_test_runstates(SubLObject v_object) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject kctsr_run_status(SubLObject v_object) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject kctsr_start(SubLObject v_object) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject kctsr_end(SubLObject v_object) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.getField9();
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject _csetf_kctsr_id(SubLObject v_object, SubLObject value) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject _csetf_kctsr_lock(SubLObject v_object, SubLObject value) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject _csetf_kctsr_test_set(SubLObject v_object, SubLObject value) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject _csetf_kctsr_result(SubLObject v_object, SubLObject value) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject _csetf_kctsr_test_runstates(SubLObject v_object, SubLObject value) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject _csetf_kctsr_run_status(SubLObject v_object, SubLObject value) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject _csetf_kctsr_start(SubLObject v_object, SubLObject value) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject _csetf_kctsr_end(SubLObject v_object, SubLObject value) {
        assert NIL != kct_set_runstate_p(v_object) : v_object;
        return v_object.setField9(value);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject make_kct_set_runstate(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $kct_set_runstate_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_kctsr_id(v_new, current_value);
            } else if (pcase_var.eql($LOCK)) {
                _csetf_kctsr_lock(v_new, current_value);
            } else if (pcase_var.eql($TEST_SET)) {
                _csetf_kctsr_test_set(v_new, current_value);
            } else if (pcase_var.eql($RESULT)) {
                _csetf_kctsr_result(v_new, current_value);
            } else if (pcase_var.eql($TEST_RUNSTATES)) {
                _csetf_kctsr_test_runstates(v_new, current_value);
            } else if (pcase_var.eql($RUN_STATUS)) {
                _csetf_kctsr_run_status(v_new, current_value);
            } else if (pcase_var.eql($START)) {
                _csetf_kctsr_start(v_new, current_value);
            } else if (pcase_var.eql($END)) {
                _csetf_kctsr_end(v_new, current_value);
            } else {
                Errors.error($str298$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject visit_defstruct_kct_set_runstate(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym368$MAKE_KCT_SET_RUNSTATE, EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $ID, kctsr_id(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $LOCK, kctsr_lock(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TEST_SET, kctsr_test_set(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RESULT, kctsr_result(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TEST_RUNSTATES, kctsr_test_runstates(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RUN_STATUS, kctsr_run_status(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $START, kctsr_start(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $END, kctsr_end(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym368$MAKE_KCT_SET_RUNSTATE, EIGHT_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104200L)
    public static SubLObject visit_defstruct_object_kct_set_runstate_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_kct_set_runstate(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 104500L)
    public static SubLObject new_kct_set_runstate(SubLObject test_set) {
        assert NIL != kct_utils.kct_test_collection_p(test_set, UNPROVIDED) : test_set;
        SubLObject kctsr = make_kct_set_runstate(UNPROVIDED);
        SubLObject id = next_runstate_id();
        runstate_add_object(id, kctsr);
        _csetf_kctsr_id(kctsr, id);
        _csetf_kctsr_test_set(kctsr, test_set);
        _csetf_kctsr_lock(kctsr, Locks.make_lock($str371$KCT_Set_Runstate_Lock));
        _csetf_kctsr_result(kctsr, NIL);
        _csetf_kctsr_test_runstates(kctsr, NIL);
        _csetf_kctsr_run_status(kctsr, $NONE);
        _csetf_kctsr_start(kctsr, NIL);
        _csetf_kctsr_end(kctsr, NIL);
        return kctsr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105100L)
    public static SubLObject destroy_kct_set_runstate(SubLObject kctsr) {
        assert NIL != kct_set_runstate_p(kctsr) : kctsr;
        runstate_rem_object(kctsr_id(kctsr));
        _csetf_kctsr_id(kctsr, NIL);
        SubLObject cdolist_list_var = kctsr_test_runstates(kctsr);
        SubLObject kctr = NIL;
        kctr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            destroy_kct_runstate(kctr);
            cdolist_list_var = cdolist_list_var.rest();
            kctr = cdolist_list_var.first();
        }
        _csetf_kctsr_test_set(kctsr, NIL);
        _csetf_kctsr_lock(kctsr, NIL);
        _csetf_kctsr_result(kctsr, NIL);
        _csetf_kctsr_run_status(kctsr, NIL);
        _csetf_kctsr_start(kctsr, NIL);
        _csetf_kctsr_end(kctsr, NIL);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105500L)
    public static SubLObject kct_set_runstate_test_set(SubLObject kctsr) {
        return kctsr_test_set(kctsr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105700L)
    public static SubLObject kct_set_runstate_lock(SubLObject kctsr) {
        return kctsr_lock(kctsr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105700L)
    public static SubLObject kct_set_runstate_result(SubLObject kctsr) {
        return kctsr_result(kctsr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105800L)
    public static SubLObject kct_set_runstate_test_runstates(SubLObject kctsr) {
        return kctsr_test_runstates(kctsr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 105900L)
    public static SubLObject kct_set_runstate_result_status(SubLObject kctsr) {
        SubLObject runs = kct_test_set_run_test_runs(kct_set_runstate_result(kctsr));
        SubLObject errorP = Sequences.find_if(Symbols.symbol_function($sym372$KCT_ERROR_RESULT_P), runs, Symbols.symbol_function($sym373$KCT_TEST_RUN_STATUS), UNPROVIDED, UNPROVIDED);
        SubLObject failureP = Sequences.find_if(Symbols.symbol_function($sym374$KCT_FAILURE_RESULT_P), runs, Symbols.symbol_function($sym373$KCT_TEST_RUN_STATUS), UNPROVIDED, UNPROVIDED);
        if (NIL != errorP) {
            return $ERROR;
        }
        if (NIL != failureP) {
            return $FAILURE;
        }
        return $SUCCESS;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 106300L)
    public static SubLObject kct_set_runstate_run_status(SubLObject kctsr) {
        return kctsr_run_status(kctsr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 106400L)
    public static SubLObject kct_set_runstate_start(SubLObject kctsr) {
        return kctsr_start(kctsr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 106500L)
    public static SubLObject kct_set_runstate_end(SubLObject kctsr) {
        return kctsr_end(kctsr);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 106500L)
    public static SubLObject set_kctsr_result(SubLObject kctsr, SubLObject test_set_run) {
        assert NIL != kct_set_runstate_p(kctsr) : kctsr;
        assert NIL != kct_test_set_run_p(test_set_run) : test_set_run;
        SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctsr_result(kctsr, test_set_run);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 106800L)
    public static SubLObject kctsr_test_runstate_add(SubLObject kctsr, SubLObject kctr) {
        assert NIL != kct_set_runstate_p(kctsr) : kctsr;
        assert NIL != kct_runstate_p(kctr) : kctr;
        SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            SubLObject test_runstates = kctsr_test_runstates(kctsr);
            _csetf_kctsr_test_runstates(kctsr, list_utilities.add_to_end(kctr, test_runstates));
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 107100L)
    public static SubLObject kctsr_test_runstate_remove(SubLObject kctsr, SubLObject kctr) {
        assert NIL != kct_set_runstate_p(kctsr) : kctsr;
        assert NIL != kct_runstate_p(kctr) : kctr;
        SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            SubLObject test_runstates = kctsr_test_runstates(kctsr);
            _csetf_kctsr_test_runstates(kctsr, Sequences.remove(kctr, test_runstates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 107400L)
    public static SubLObject set_kctsr_run_status(SubLObject kctsr, SubLObject run_status) {
        assert NIL != kct_set_runstate_p(kctsr) : kctsr;
        assert NIL != Types.keywordp(run_status) : run_status;
        SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctsr_run_status(kctsr, run_status);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 107700L)
    public static SubLObject set_kctsr_start(SubLObject kctsr, SubLObject time) {
        if (time == UNPROVIDED) {
            time = NIL;
        }
        assert NIL != kct_set_runstate_p(kctsr) : kctsr;
        if (NIL == time) {
            time = Time.get_universal_time();
        }
        SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctsr_start(kctsr, time);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 107900L)
    public static SubLObject set_kctsr_end(SubLObject kctsr, SubLObject time) {
        if (time == UNPROVIDED) {
            time = NIL;
        }
        assert NIL != kct_set_runstate_p(kctsr) : kctsr;
        if (NIL == time) {
            time = Time.get_universal_time();
        }
        SubLObject lock = kctsr_lock(kctsr);
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_kctsr_end(kctsr, time);
        } finally {
            if (NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return kctsr;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 108100L)
    public static SubLObject kbq_save_query_set_run(SubLObject query_set_run, SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str225$Unable_to_open__S, filename);
            }
            SubLObject stream_$56 = stream;
            SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind(NIL, thread);
                cfasl.cfasl_set_common_symbols_simple(kbq_cfasl_common_symbols_simple());
                cfasl.cfasl_output_externalized(query_set_run, stream_$56);
            } finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        } finally {
            SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 108500L)
    public static SubLObject kct_save_test_set_run(SubLObject test_set_run, SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str225$Unable_to_open__S, filename);
            }
            SubLObject stream_$57 = stream;
            SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind(NIL, thread);
                cfasl.cfasl_set_common_symbols_simple($kct_cfasl_common_symbols$.getGlobalValue());
                cfasl.cfasl_output_externalized(test_set_run, stream_$57);
            } finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        } finally {
            SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 108800L)
    public static SubLObject kbq_save_query_set_run_without_results(SubLObject query_set_run, SubLObject filename) {
        query_set_run = kbq_discard_query_set_run_results(query_set_run);
        return kbq_save_query_set_run(query_set_run, filename);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 109000L)
    public static SubLObject kbq_open_query_set_run_output_stream(SubLObject filename, SubLObject file_mode) {
        if (file_mode == UNPROVIDED) {
            file_mode = $OUTPUT;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
        try {
            stream_macros.$stream_requires_locking$.bind(NIL, thread);
            stream = compatibility.open_binary(filename, file_mode);
        } finally {
            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 109200L)
    public static SubLObject kct_open_test_set_run_output_stream(SubLObject filename, SubLObject file_mode) {
        if (file_mode == UNPROVIDED) {
            file_mode = $OUTPUT;
        }
        return kbq_open_query_set_run_output_stream(filename, file_mode);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 109400L)
    public static SubLObject kbq_save_query_set_run_preamble(SubLObject stream, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preamble = kbq_make_query_set_run(NIL, comment);
        SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(kbq_cfasl_common_symbols_simple());
            cfasl.cfasl_output_externalized(preamble, stream);
        } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        streams_high.force_output(stream);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 109700L)
    public static SubLObject kct_save_test_set_run_preamble(SubLObject stream, SubLObject comment) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preamble = kct_make_test_set_run(NIL, comment);
        SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols_simple($kct_cfasl_common_symbols$.getGlobalValue());
            cfasl.cfasl_output_externalized(preamble, stream);
        } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        streams_high.force_output(stream);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 110000L)
    public static SubLObject kbq_save_query_run(SubLObject query_run, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(kbq_cfasl_common_symbols_simple());
            cfasl.cfasl_output_externalized(query_run, stream);
        } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        streams_high.force_output(stream);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 110200L)
    public static SubLObject kct_save_test_run(SubLObject test_run, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols_simple($kct_cfasl_common_symbols$.getGlobalValue());
            cfasl.cfasl_output_externalized(test_run, stream);
        } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        streams_high.force_output(stream);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 110400L)
    public static SubLObject do_query_set_run(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list376);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_set_run = NIL;
        SubLObject query_run = NIL;
        SubLObject filename = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list376);
        query_set_run = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list376);
        query_run = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list376);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$58 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list376);
            current_$58 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list376);
            if (NIL == conses_high.member(current_$58, $list377, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$58 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list376);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject stream = $sym379$STREAM;
        SubLObject done_var = $sym380$DONE_VAR;
        return list($sym381$PROGN, listS($sym382$CHECK_TYPE, filename, $list383),
                list($sym384$WITH_PRIVATE_BINARY_FILE, listS(stream, filename, $list385),
                        list($sym386$WITH_CFASL_COMMON_SYMBOLS_SIMPLE, $list387,
                                list($sym388$WITH_NEW_CFASL_INPUT_GUID_STRING_RESOURCE,
                                        list($sym12$CLET, list(list(query_set_run, list($sym389$KBQ_LOAD_QUERY_SET_RUN_INT, stream))), listS($sym390$CSOME, list(query_run, list($sym79$KBQ_QUERY_SET_RUN_QUERY_RUNS, query_set_run), done), append(body, NIL)),
                                                list($sym12$CLET, list(list(done_var, done)),
                                                        list($sym391$WHILE, list($sym392$CNOT, done_var), list($sym12$CLET, list(list(query_run, list($sym393$KBQ_LOAD_QUERY_RUN_INT, stream))), list($sym394$PWHEN, ConsesLow.listS(EQ, query_run, $list395), listS($sym194$CSETQ, done_var, $list396)),
                                                                listS($sym397$PUNLESS, done_var, list($sym194$CSETQ, query_run, list($sym398$KBQ_NCLEAN_QUERY_RUN, query_run)), append(body, list(list($sym194$CSETQ, done_var, done))))))))))));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 111500L)
    public static SubLObject do_query_set_run_query_runs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list399);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_run = NIL;
        SubLObject filename = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list399);
        query_run = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list399);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$59 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list399);
            current_$59 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list399);
            if (NIL == conses_high.member(current_$59, $list377, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$59 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list399);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject query_set_run = $sym400$QUERY_SET_RUN;
        return listS($sym6$DO_QUERY_SET_RUN, list(query_set_run, query_run, filename, $DONE, done), list($sym401$IGNORE, query_set_run), append(body, NIL));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 111700L)
    public static SubLObject kbq_load_query_set_run(SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(filename) : filename;
        SubLObject query_set_run = NIL;
        SubLObject additional_query_runs = NIL;
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str225$Unable_to_open__S, filename);
            }
            SubLObject stream_$60 = stream;
            SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind(NIL, thread);
                cfasl.cfasl_set_common_symbols_simple(kbq_cfasl_common_symbols_simple());
                SubLObject _prev_bind_0_$61 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    cfasl.$cfasl_input_guid_string_resource$.bind(cfasl.get_new_cfasl_input_guid_string_resource(), thread);
                    query_set_run = kbq_load_query_set_run_int(stream_$60);
                    SubLObject doneP = NIL;
                    while (NIL == doneP) {
                        SubLObject query_run = kbq_load_query_run_int(stream_$60);
                        doneP = Equality.eq(query_run, $EOF);
                        if (NIL == doneP) {
                            additional_query_runs = cons(query_run, additional_query_runs);
                        }
                    }
                } finally {
                    cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$61, thread);
                }
            } finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        } finally {
            SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        additional_query_runs = Sequences.nreverse(additional_query_runs);
        query_set_run = kbq_query_set_run_nmerge_query_runs(query_set_run, additional_query_runs);
        query_set_run = kbq_nclean_query_set_run(query_set_run);
        return query_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 112600L)
    public static SubLObject kbq_load_query_set_run_int(SubLObject stream) {
        return cfasl.cfasl_input(stream, T, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 112700L)
    public static SubLObject kbq_load_query_run_int(SubLObject stream) {
        return cfasl.cfasl_input(stream, NIL, $EOF);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 112800L)
    public static SubLObject kbq_query_set_run_nmerge_query_runs(SubLObject query_set_run, SubLObject additional_query_runs) {
        if (NIL != additional_query_runs) {
            SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
            query_runs = nconc(query_runs, additional_query_runs);
            query_set_run = conses_high.putf(query_set_run, $QUERY_RUNS, query_runs);
        }
        return query_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 113200L)
    public static SubLObject kct_load_test_set_run(SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(filename) : filename;
        SubLObject test_set_run = NIL;
        SubLObject additional_test_runs = NIL;
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str225$Unable_to_open__S, filename);
            }
            SubLObject stream_$62 = stream;
            SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind(NIL, thread);
                cfasl.cfasl_set_common_symbols_simple($kct_cfasl_common_symbols$.getGlobalValue());
                SubLObject _prev_bind_0_$63 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    cfasl.$cfasl_input_guid_string_resource$.bind(cfasl.get_new_cfasl_input_guid_string_resource(), thread);
                    test_set_run = cfasl.cfasl_input(stream_$62, T, UNPROVIDED);
                    SubLObject doneP = NIL;
                    while (NIL == doneP) {
                        SubLObject test_run = cfasl.cfasl_input(stream_$62, NIL, $EOF);
                        doneP = Equality.eq(test_run, $EOF);
                        if (NIL == doneP) {
                            additional_test_runs = cons(test_run, additional_test_runs);
                        }
                    }
                } finally {
                    cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$63, thread);
                }
            } finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        } finally {
            SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        additional_test_runs = Sequences.nreverse(additional_test_runs);
        test_set_run = kct_test_set_run_nmerge_test_runs(test_set_run, additional_test_runs);
        test_set_run = kct_nclean_test_set_run(test_set_run);
        return test_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 114000L)
    public static SubLObject kct_test_set_run_nmerge_test_runs(SubLObject test_set_run, SubLObject additional_test_runs) {
        if (NIL != additional_test_runs) {
            SubLObject test_runs = kct_test_set_run_test_runs(test_set_run);
            test_runs = nconc(test_runs, additional_test_runs);
            test_set_run = conses_high.putf(test_set_run, $TEST_RUNS, test_runs);
        }
        return test_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 114300L)
    public static SubLObject kbq_nclean_query_set_run(SubLObject query_set_run) {
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            kbq_nclean_query_run(query_run);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return query_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 114700L)
    public static SubLObject kct_nclean_test_set_run(SubLObject test_set_run) {
        SubLObject cdolist_list_var = kct_test_set_run_test_runs(test_set_run);
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query_run = kct_test_run_query_run(test_run);
            kbq_nclean_query_run(query_run);
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return test_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 115100L)
    public static SubLObject kbq_nclean_query_run(SubLObject query_run) {
        SubLObject time_to_last_answer = kbq_query_run_time_to_last_answer(query_run);
        if (NIL != time_to_last_answer && !time_to_last_answer.isNumber()) {
            Errors.warn($str405$dwimming__s_to_NIL, time_to_last_answer);
            query_run = conses_high.putf(query_run, $TIME_TO_LAST_ANSWER, NIL);
        }
        return query_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 115600L)
    public static SubLObject kbq_strip_results_from_query_set_run_file(SubLObject filename, SubLObject suffix) {
        if (suffix == UNPROVIDED) {
            suffix = $str407$_no_results;
        }
        SubLObject suffixless_filename = kbq_strip_suffix_from_filename(filename);
        SubLObject query_set_run = kbq_load_query_set_run(filename);
        SubLObject new_filename = Sequences.cconcatenate(suffixless_filename, new SubLObject[] { suffix, $query_set_run_file_extension$.getGlobalValue() });
        assert NIL != file_utilities.file_valid_for_writing_p(new_filename) : new_filename;
        return kbq_save_query_set_run_without_results(query_set_run, new_filename);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 116200L)
    public static SubLObject kbq_strip_suffix_from_filename(SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == string_utilities.ends_with(filename, $query_set_run_file_extension$.getGlobalValue(), UNPROVIDED)) {
            Errors.error($str408$Expected_a__a_file__got__s, $query_set_run_file_extension$.getGlobalValue(), filename);
        }
        return string_utilities.strip_final(filename, Sequences.length($query_set_run_file_extension$.getGlobalValue()));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 116500L)
    public static SubLObject kct_strip_suffix_from_filename(SubLObject filename) {
        return kbq_strip_suffix_from_filename(filename);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 116600L)
    public static SubLObject kbq_filter_query_set_run_by_property_value(SubLObject query_set_run, SubLObject comment, SubLObject property, SubLObject value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = Symbols.symbol_function(EQUAL);
        }
        SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject filtered_query_runs = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != Functions.funcall(test, value, kbq_query_run_property_value(query_run, property, UNPROVIDED))) {
                filtered_query_runs = cons(query_run, filtered_query_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        filtered_query_runs = Sequences.nreverse(filtered_query_runs);
        SubLObject filtered_query_set_run = conses_high.copy_list(query_set_run);
        filtered_query_set_run = conses_high.putf(filtered_query_set_run, $QUERY_RUNS, filtered_query_runs);
        if (NIL != comment) {
            filtered_query_set_run = conses_high.putf(filtered_query_set_run, $COMMENT, comment);
        }
        return filtered_query_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 117500L)
    public static SubLObject kbq_filter_query_set_run_by_test(SubLObject query_set_run, SubLObject comment, SubLObject test, SubLObject key) {
        if (key == UNPROVIDED) {
            key = Symbols.symbol_function(IDENTITY);
        }
        SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject filtered_query_runs = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != Functions.funcall(test, Functions.funcall(key, query_run))) {
                filtered_query_runs = cons(query_run, filtered_query_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        filtered_query_runs = Sequences.nreverse(filtered_query_runs);
        SubLObject filtered_query_set_run = conses_high.copy_list(query_set_run);
        filtered_query_set_run = conses_high.putf(filtered_query_set_run, $QUERY_RUNS, filtered_query_runs);
        if (NIL != comment) {
            filtered_query_set_run = conses_high.putf(filtered_query_set_run, $COMMENT, comment);
        }
        return filtered_query_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 118400L)
    public static SubLObject kct_filter_test_set_run_by_test(SubLObject test_set_run, SubLObject comment, SubLObject test, SubLObject key) {
        if (key == UNPROVIDED) {
            key = Symbols.symbol_function(IDENTITY);
        }
        SubLObject test_runs = kct_test_set_run_test_runs(test_set_run);
        SubLObject filtered_test_runs = NIL;
        SubLObject cdolist_list_var = test_runs;
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != Functions.funcall(test, Functions.funcall(key, test_run))) {
                filtered_test_runs = cons(test_run, filtered_test_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        filtered_test_runs = Sequences.nreverse(filtered_test_runs);
        SubLObject filtered_test_set_run = conses_high.copy_list(test_set_run);
        filtered_test_set_run = conses_high.putf(filtered_test_set_run, $TEST_RUNS, filtered_test_runs);
        if (NIL != comment) {
            filtered_test_set_run = conses_high.putf(filtered_test_set_run, $COMMENT, comment);
        }
        return filtered_test_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 119200L)
    public static SubLObject kbq_answerable_query_set_run(SubLObject query_set_run) {
        SubLObject comment = kbq_query_set_run_comment(query_set_run);
        SubLObject new_comment = PrintLow.format(NIL, $str409$answerable_sub_run_of_____A, comment);
        return kbq_filter_query_set_run_by_test(query_set_run, new_comment, Symbols.symbol_function($sym410$POSITIVE_INTEGER_P), Symbols.symbol_function($sym107$KBQ_QUERY_RUN_ANSWER_COUNT));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 119600L)
    public static SubLObject kct_answerable_test_set_run(SubLObject test_set_run) {
        SubLObject comment = kct_test_set_run_comment(test_set_run);
        SubLObject new_comment = PrintLow.format(NIL, $str409$answerable_sub_run_of_____A, comment);
        return kct_filter_test_set_run_by_test(test_set_run, new_comment, Symbols.symbol_function($sym410$POSITIVE_INTEGER_P), Symbols.symbol_function($sym411$KCT_TEST_RUN_ANSWER_COUNT));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 120000L)
    public static SubLObject kct_succeeding_test_set_run(SubLObject test_set_run) {
        SubLObject comment = kct_test_set_run_comment(test_set_run);
        SubLObject new_comment = PrintLow.format(NIL, $str412$succeeding_sub_run_of_____A, comment);
        return kct_filter_test_set_run_by_test(test_set_run, new_comment, $sym413$KCT_SUCCESS_RESULT_P, $sym373$KCT_TEST_RUN_STATUS);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 120400L)
    public static SubLObject kbq_unanswerable_query_set_run(SubLObject query_set_run) {
        SubLObject comment = kbq_query_set_run_comment(query_set_run);
        SubLObject new_comment = Sequences.cconcatenate($str414$unanswerable_sub_run_of__, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_a_no_copy(comment) });
        return kbq_filter_query_set_run_by_property_value(query_set_run, new_comment, $ANSWER_COUNT, ZERO_INTEGER, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 120900L)
    public static SubLObject kct_unanswerable_test_set_run(SubLObject test_set_run) {
        SubLObject comment = kct_test_set_run_comment(test_set_run);
        SubLObject new_comment = Sequences.cconcatenate($str414$unanswerable_sub_run_of__, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_a_no_copy(comment) });
        return kct_filter_test_set_run_by_test(test_set_run, new_comment, Symbols.symbol_function($sym415$ZEROP), Symbols.symbol_function($sym411$KCT_TEST_RUN_ANSWER_COUNT));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 121300L)
    public static SubLObject kct_failing_test_set_run(SubLObject test_set_run) {
        SubLObject comment = kct_test_set_run_comment(test_set_run);
        SubLObject new_comment = PrintLow.format(NIL, $str416$failing_sub_run_of_____A, comment);
        return kct_filter_test_set_run_by_test(test_set_run, new_comment, $sym374$KCT_FAILURE_RESULT_P, $sym373$KCT_TEST_RUN_STATUS);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 121700L)
    public static SubLObject kct_erroring_test_set_run(SubLObject test_set_run) {
        return kct_filter_test_set_run_to_tests(test_set_run, kct_erroring_tests(test_set_run), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 121900L)
    public static SubLObject kct_common_sense_test_set_run(SubLObject test_set_run) {
        return kct_subcollection_test_set_run(test_set_run, $$CommonSenseTest);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 122200L)
    public static SubLObject kct_regression_test_set_run(SubLObject test_set_run) {
        return kct_subcollection_test_set_run(test_set_run, $$KBContentRegressionTest);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 122400L)
    public static SubLObject kct_subcollection_test_set_run(SubLObject test_set_run, SubLObject collection) {
        SubLObject test_runs = kct_test_set_run_test_runs(test_set_run);
        SubLObject common_sense_test_runs = NIL;
        SubLObject cdolist_list_var = test_runs;
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa.isa_in_any_mtP(kct_test_run_test(test_run), collection)) {
                common_sense_test_runs = cons(test_run, common_sense_test_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        common_sense_test_runs = Sequences.nreverse(common_sense_test_runs);
        SubLObject common_sense_test_set_run = conses_high.copy_list(test_set_run);
        SubLObject comment = kct_test_set_run_comment(test_set_run);
        SubLObject new_comment = PrintLow.format(NIL, $str419$_s_sub_run_of_____A, collection, comment);
        common_sense_test_set_run = conses_high.putf(common_sense_test_set_run, $TEST_RUNS, common_sense_test_runs);
        common_sense_test_set_run = conses_high.putf(common_sense_test_set_run, $COMMENT, new_comment);
        return common_sense_test_set_run;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 123300L)
    public static SubLObject kct_failing_tests(SubLObject test_set_run) {
        return kct_test_set_run_tests(kct_failing_test_set_run(test_set_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 123400L)
    public static SubLObject kct_succeeding_tests(SubLObject test_set_run) {
        return kct_test_set_run_tests(kct_succeeding_test_set_run(test_set_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 123500L)
    public static SubLObject kct_answerable_tests(SubLObject test_set_run) {
        return kct_test_set_run_tests(kct_answerable_test_set_run(test_set_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 123600L)
    public static SubLObject kct_unanswerable_tests(SubLObject test_set_run) {
        return kct_test_set_run_tests(kct_unanswerable_test_set_run(test_set_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 123800L)
    public static SubLObject kct_newly_failing_tests(SubLObject old_test_set_run, SubLObject new_test_set_run) {
        return list_utilities.fast_set_difference(kct_failing_tests(new_test_set_run), kct_failing_tests(old_test_set_run), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 124000L)
    public static SubLObject kbq_same_property_value_queries(SubLObject query_set_run_1, SubLObject query_set_run_2, SubLObject property, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = Symbols.symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = Symbols.symbol_function(IDENTITY);
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_runs_1 = kbq_query_set_run_query_runs(query_set_run_1);
        SubLObject query_runs_2 = kbq_query_set_run_query_runs(query_set_run_2);
        SubLObject property_value_dictionary = dictionary.new_dictionary(Symbols.symbol_function(EQUAL), Sequences.length(query_runs_1));
        SubLObject same_property_value_queries = NIL;
        SubLObject cdolist_list_var = query_runs_1;
        SubLObject query_run_1 = NIL;
        query_run_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query = kbq_query_run_query(query_run_1);
            SubLObject value_1 = kbq_query_run_property_value(query_run_1, property, UNPROVIDED);
            SubLObject compare_value_1 = Functions.funcall(key, value_1);
            dictionary.dictionary_enter(property_value_dictionary, query, compare_value_1);
            cdolist_list_var = cdolist_list_var.rest();
            query_run_1 = cdolist_list_var.first();
        }
        cdolist_list_var = query_runs_2;
        SubLObject query_run_2 = NIL;
        query_run_2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query = kbq_query_run_query(query_run_2);
            SubLObject value_2 = kbq_query_run_property_value(query_run_2, property, UNPROVIDED);
            SubLObject compare_value_2 = Functions.funcall(key, value_2);
            thread.resetMultipleValues();
            SubLObject compare_value_3 = dictionary.dictionary_lookup(property_value_dictionary, query, UNPROVIDED);
            SubLObject presentP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != presentP && NIL != Functions.funcall(test, compare_value_3, compare_value_2)) {
                same_property_value_queries = cons(query, same_property_value_queries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run_2 = cdolist_list_var.first();
        }
        return Sequences.nreverse(same_property_value_queries);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 125500L)
    public static SubLObject kbq_mutually_answerable_queries(SubLObject query_set_runs) {
        SubLObject result_query_set_run = query_set_runs.first();
        SubLObject cdolist_list_var = query_set_runs.rest();
        SubLObject query_set_run = NIL;
        query_set_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_query_set_run = kbq_mutually_answerable_query_set_runs(result_query_set_run, query_set_run);
            cdolist_list_var = cdolist_list_var.rest();
            query_set_run = cdolist_list_var.first();
        }
        return kbq_query_set_run_queries(result_query_set_run);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 125800L)
    public static SubLObject kbq_mutually_unanswerable_queries(SubLObject query_set_runs) {
        SubLObject result_query_set_run = query_set_runs.first();
        SubLObject cdolist_list_var = query_set_runs.rest();
        SubLObject query_set_run = NIL;
        query_set_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_query_set_run = kbq_mutually_unanswerable_query_set_runs(result_query_set_run, query_set_run);
            cdolist_list_var = cdolist_list_var.rest();
            query_set_run = cdolist_list_var.first();
        }
        return kbq_query_set_run_queries(result_query_set_run);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 126200L)
    public static SubLObject kbq_fast_queries(SubLObject query_set_run, SubLObject fast_threshold) {
        if (fast_threshold == UNPROVIDED) {
            fast_threshold = ONE_INTEGER;
        }
        SubLObject fast_queries = NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.safe_L(kbq_query_run_total_time(query_run), fast_threshold)) {
                fast_queries = cons(kbq_query_run_query(query_run), fast_queries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(fast_queries);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 126600L)
    public static SubLObject kct_mutually_succeeding_tests(SubLObject test_set_runs) {
        SubLObject result_test_set_run = kct_succeeding_test_set_run(test_set_runs.first());
        SubLObject cdolist_list_var = test_set_runs.rest();
        SubLObject test_set_run = NIL;
        test_set_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_test_set_run = kct_mutually_succeeding_test_set_runs(result_test_set_run, test_set_run);
            cdolist_list_var = cdolist_list_var.rest();
            test_set_run = cdolist_list_var.first();
        }
        return kct_test_set_run_tests(result_test_set_run);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 127000L)
    public static SubLObject kct_mutually_failing_tests(SubLObject test_set_runs) {
        SubLObject result_test_set_run = kct_failing_test_set_run(test_set_runs.first());
        SubLObject cdolist_list_var = test_set_runs.rest();
        SubLObject test_set_run = NIL;
        test_set_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_test_set_run = kct_mutually_failing_test_set_runs(result_test_set_run, test_set_run);
            cdolist_list_var = cdolist_list_var.rest();
            test_set_run = cdolist_list_var.first();
        }
        return kct_test_set_run_tests(result_test_set_run);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 127300L)
    public static SubLObject kbq_mutually_answerable_query_set_runs(SubLObject query_set_run_1, SubLObject query_set_run_2) {
        SubLObject answerable_query_set_run_1 = kbq_answerable_query_set_run(query_set_run_1);
        SubLObject answerable_query_set_run_2 = kbq_answerable_query_set_run(query_set_run_2);
        SubLObject answerable_queries_1 = kbq_extract_property_values(answerable_query_set_run_1, $QUERY, UNPROVIDED);
        SubLObject answerable_queries_2 = kbq_extract_property_values(answerable_query_set_run_2, $QUERY, UNPROVIDED);
        SubLObject mutually_answerable_queries = keyhash_utilities.fast_intersection(answerable_queries_1, answerable_queries_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject filtered_query_set_run_1 = kbq_filter_query_set_run_to_queries(answerable_query_set_run_1, mutually_answerable_queries, UNPROVIDED);
        SubLObject filtered_query_set_run_2 = kbq_filter_query_set_run_to_queries(answerable_query_set_run_2, mutually_answerable_queries, UNPROVIDED);
        SubLObject set_difference_1 = kbq_filter_query_set_run_to_queries(answerable_query_set_run_1, mutually_answerable_queries, T);
        SubLObject set_difference_2 = kbq_filter_query_set_run_to_queries(answerable_query_set_run_2, mutually_answerable_queries, T);
        return Values.values(filtered_query_set_run_1, filtered_query_set_run_2, set_difference_1, set_difference_2);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 130300L)
    public static SubLObject kbq_mutually_unanswerable_query_set_runs(SubLObject query_set_run_1, SubLObject query_set_run_2) {
        SubLObject unanswerable_query_set_run_1 = kbq_unanswerable_query_set_run(query_set_run_1);
        SubLObject unanswerable_query_set_run_2 = kbq_unanswerable_query_set_run(query_set_run_2);
        SubLObject unanswerable_queries_1 = kbq_extract_property_values(unanswerable_query_set_run_1, $QUERY, UNPROVIDED);
        SubLObject unanswerable_queries_2 = kbq_extract_property_values(unanswerable_query_set_run_2, $QUERY, UNPROVIDED);
        SubLObject mutually_unanswerable_queries = keyhash_utilities.fast_intersection(unanswerable_queries_1, unanswerable_queries_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject filtered_query_set_run_1 = kbq_filter_query_set_run_to_queries(unanswerable_query_set_run_1, mutually_unanswerable_queries, UNPROVIDED);
        SubLObject filtered_query_set_run_2 = kbq_filter_query_set_run_to_queries(unanswerable_query_set_run_2, mutually_unanswerable_queries, UNPROVIDED);
        SubLObject set_difference_1 = kbq_filter_query_set_run_to_queries(unanswerable_query_set_run_1, mutually_unanswerable_queries, T);
        SubLObject set_difference_2 = kbq_filter_query_set_run_to_queries(unanswerable_query_set_run_2, mutually_unanswerable_queries, T);
        return Values.values(filtered_query_set_run_1, filtered_query_set_run_2, set_difference_1, set_difference_2);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 131800L)
    public static SubLObject kbq_query_set_runs_common_queries(SubLObject query_set_runs) {
        SubLObject queries_list = NIL;
        SubLObject cdolist_list_var = query_set_runs;
        SubLObject query_set_run = NIL;
        query_set_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            queries_list = cons(kbq_query_set_run_queries(query_set_run), queries_list);
            cdolist_list_var = cdolist_list_var.rest();
            query_set_run = cdolist_list_var.first();
        }
        return list_utilities.fast_intersect_all(queries_list, Symbols.symbol_function(EQ), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 132000L)
    public static SubLObject kbq_common_queries_query_set_runs(SubLObject query_set_runs) {
        SubLObject filtered_query_set_runs = NIL;
        SubLObject common_queries = kbq_query_set_runs_common_queries(query_set_runs);
        SubLObject cdolist_list_var = query_set_runs;
        SubLObject query_set_run = NIL;
        query_set_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject filtered_query_set_run = kbq_filter_query_set_run_to_queries(query_set_run, common_queries, UNPROVIDED);
            filtered_query_set_runs = cons(filtered_query_set_run, filtered_query_set_runs);
            cdolist_list_var = cdolist_list_var.rest();
            query_set_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_query_set_runs);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 132600L)
    public static SubLObject kbq_common_queries_two_query_set_runs(SubLObject query_set_run_1, SubLObject query_set_run_2) {
        SubLObject current;
        SubLObject datum = current = kbq_common_queries_query_set_runs(list(query_set_run_1, query_set_run_2));
        SubLObject filtered_query_set_run_1 = NIL;
        SubLObject filtered_query_set_run_2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list420);
        filtered_query_set_run_1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list420);
        filtered_query_set_run_2 = current.first();
        current = current.rest();
        if (NIL == current) {
            return Values.values(filtered_query_set_run_1, filtered_query_set_run_2);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list420);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 132900L)
    public static SubLObject kct_common_tests_test_set_runs(SubLObject test_set_runs) {
        SubLObject filtered_test_set_runs = NIL;
        SubLObject common_tests = kct_tests_common_to_all_test_set_runs(test_set_runs);
        SubLObject cdolist_list_var = test_set_runs;
        SubLObject test_set_run = NIL;
        test_set_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject filtered_test_set_run = kct_filter_test_set_run_to_tests(test_set_run, common_tests, UNPROVIDED);
            filtered_test_set_runs = cons(filtered_test_set_run, filtered_test_set_runs);
            cdolist_list_var = cdolist_list_var.rest();
            test_set_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_test_set_runs);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 133500L)
    public static SubLObject kct_mutually_succeeding_test_set_runs(SubLObject test_set_run_1, SubLObject test_set_run_2) {
        SubLObject succeeding_test_set_run_1 = kct_succeeding_test_set_run(test_set_run_1);
        SubLObject succeeding_test_set_run_2 = kct_succeeding_test_set_run(test_set_run_2);
        SubLObject succeeding_tests_1 = kct_test_set_run_valid_tests(succeeding_test_set_run_1);
        SubLObject succeeding_tests_2 = kct_test_set_run_valid_tests(succeeding_test_set_run_2);
        SubLObject mutually_succeeding_tests = keyhash_utilities.fast_intersection(succeeding_tests_1, succeeding_tests_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject filtered_test_set_run_1 = kct_filter_test_set_run_to_tests(succeeding_test_set_run_1, mutually_succeeding_tests, UNPROVIDED);
        SubLObject filtered_test_set_run_2 = kct_filter_test_set_run_to_tests(succeeding_test_set_run_2, mutually_succeeding_tests, UNPROVIDED);
        SubLObject set_difference_1 = kct_filter_test_set_run_to_tests(succeeding_test_set_run_1, mutually_succeeding_tests, T);
        SubLObject set_difference_2 = kct_filter_test_set_run_to_tests(succeeding_test_set_run_2, mutually_succeeding_tests, T);
        return Values.values(filtered_test_set_run_1, filtered_test_set_run_2, set_difference_1, set_difference_2);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 134700L)
    public static SubLObject kct_mutually_failing_test_set_runs(SubLObject test_set_run_1, SubLObject test_set_run_2) {
        SubLObject failing_test_set_run_1 = kct_failing_test_set_run(test_set_run_1);
        SubLObject failing_test_set_run_2 = kct_failing_test_set_run(test_set_run_2);
        SubLObject failing_tests_1 = kct_test_set_run_tests(failing_test_set_run_1);
        SubLObject failing_tests_2 = kct_test_set_run_tests(failing_test_set_run_2);
        SubLObject mutually_failing_tests = keyhash_utilities.fast_intersection(failing_tests_1, failing_tests_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject filtered_test_set_run_1 = kct_filter_test_set_run_to_tests(failing_test_set_run_1, mutually_failing_tests, UNPROVIDED);
        SubLObject filtered_test_set_run_2 = kct_filter_test_set_run_to_tests(failing_test_set_run_2, mutually_failing_tests, UNPROVIDED);
        SubLObject set_difference_1 = kct_filter_test_set_run_to_tests(failing_test_set_run_1, mutually_failing_tests, T);
        SubLObject set_difference_2 = kct_filter_test_set_run_to_tests(failing_test_set_run_2, mutually_failing_tests, T);
        return Values.values(filtered_test_set_run_1, filtered_test_set_run_2, set_difference_1, set_difference_2);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 135900L)
    public static SubLObject kbq_same_answer_count_query_set_runs(SubLObject query_set_run_1, SubLObject query_set_run_2) {
        SubLObject queries = kbq_same_property_value_queries(query_set_run_1, query_set_run_2, $ANSWER_COUNT, UNPROVIDED, UNPROVIDED);
        return kbq_filter_to_queries_int(query_set_run_1, query_set_run_2, queries);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 136400L)
    public static SubLObject kbq_different_answer_count_query_set_runs(SubLObject query_set_run_1, SubLObject query_set_run_2) {
        SubLObject queries = kbq_same_property_value_queries(query_set_run_1, query_set_run_2, $ANSWER_COUNT, Symbols.symbol_function($sym421$NOT_EQL), UNPROVIDED);
        return kbq_filter_to_queries_int(query_set_run_1, query_set_run_2, queries);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 137000L)
    public static SubLObject kbq_filter_to_queries_int(SubLObject query_set_run_1, SubLObject query_set_run_2, SubLObject queries) {
        SubLObject filtered_query_set_run_1 = kbq_filter_query_set_run_to_queries(query_set_run_1, queries, UNPROVIDED);
        SubLObject filtered_query_set_run_2 = kbq_filter_query_set_run_to_queries(query_set_run_2, queries, UNPROVIDED);
        SubLObject set_difference_1 = kbq_filter_query_set_run_to_queries(query_set_run_1, queries, T);
        SubLObject set_difference_2 = kbq_filter_query_set_run_to_queries(query_set_run_2, queries, T);
        return Values.values(filtered_query_set_run_1, filtered_query_set_run_2, set_difference_1, set_difference_2);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 137600L)
    public static SubLObject kbq_filter_query_set_run_to_queries_lambda(SubLObject query) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(query, $kbq_filter_query_set_run_to_queries$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 137700L)
    public static SubLObject kbq_filter_query_set_run_to_queries_not_lambda(SubLObject query) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == set.set_memberP(query, $kbq_filter_query_set_run_to_queries$.getDynamicValue(thread)));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 137800L)
    public static SubLObject kbq_filter_query_set_run_to_queries(SubLObject query_set_run, SubLObject queries, SubLObject complementP) {
        if (complementP == UNPROVIDED) {
            complementP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_comment = $str422$filtered_to_queries;
        SubLObject v_answer = NIL;
        SubLObject _prev_bind_0 = $kbq_filter_query_set_run_to_queries$.currentBinding(thread);
        try {
            $kbq_filter_query_set_run_to_queries$.bind(set_utilities.construct_set_from_list(queries, Symbols.symbol_function(EQUAL), UNPROVIDED), thread);
            v_answer = kbq_filter_query_set_run_by_test(query_set_run, new_comment, (NIL != complementP) ? $sym423$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_NOT_LAMBDA : $sym424$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_LAMBDA, $sym89$KBQ_QUERY_RUN_QUERY);
        } finally {
            $kbq_filter_query_set_run_to_queries$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 138500L)
    public static SubLObject kct_filter_test_set_run_to_tests_lambda(SubLObject test) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(test, $kct_filter_test_set_run_to_tests$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 138700L)
    public static SubLObject kct_filter_test_set_run_to_tests_not_lambda(SubLObject test) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == set.set_memberP(test, $kct_filter_test_set_run_to_tests$.getDynamicValue(thread)));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 138800L)
    public static SubLObject kct_filter_test_set_run_to_tests(SubLObject test_set_run, SubLObject tests, SubLObject complementP) {
        if (complementP == UNPROVIDED) {
            complementP = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_comment = $str425$filtered_to_tests;
        SubLObject v_answer = NIL;
        SubLObject _prev_bind_0 = $kct_filter_test_set_run_to_tests$.currentBinding(thread);
        try {
            $kct_filter_test_set_run_to_tests$.bind(set_utilities.construct_set_from_list(tests, Symbols.symbol_function(EQUAL), UNPROVIDED), thread);
            v_answer = kct_filter_test_set_run_by_test(test_set_run, new_comment, (NIL != complementP) ? $sym426$KCT_FILTER_TEST_SET_RUN_TO_TESTS_NOT_LAMBDA : $sym427$KCT_FILTER_TEST_SET_RUN_TO_TESTS_LAMBDA, $sym110$KCT_TEST_RUN_TEST);
        } finally {
            $kct_filter_test_set_run_to_tests$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 139400L)
    public static SubLObject kbq_filter_query_set_run_to_query_collection(SubLObject query_set_run, SubLObject collection, SubLObject complementP) {
        if (complementP == UNPROVIDED) {
            complementP = NIL;
        }
        SubLObject queries = kbq_query_set_run_queries(query_set_run);
        SubLObject filtered_queries = cached_all_instances_among(collection, queries, kct_variables.kct_mt());
        return kbq_filter_query_set_run_to_queries(query_set_run, filtered_queries, complementP);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 139700L)
    public static SubLObject kct_filter_test_set_run_to_test_collection(SubLObject test_set_run, SubLObject collection, SubLObject complementP) {
        if (complementP == UNPROVIDED) {
            complementP = NIL;
        }
        SubLObject tests = kct_test_set_run_tests(test_set_run);
        SubLObject filtered_tests = cached_all_instances_among(collection, tests, kct_variables.kct_mt());
        return kct_filter_test_set_run_to_tests(test_set_run, filtered_tests, complementP);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140100L)
    public static SubLObject clear_cached_all_instances_among() {
        SubLObject cs = $cached_all_instances_among_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140100L)
    public static SubLObject remove_cached_all_instances_among(SubLObject col, SubLObject terms, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_all_instances_among_caching_state$.getGlobalValue(), list(col, terms, mt), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140100L)
    public static SubLObject cached_all_instances_among_internal(SubLObject col, SubLObject terms, SubLObject mt) {
        return isa.all_instances_among(col, terms, mt, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140100L)
    public static SubLObject cached_all_instances_among(SubLObject col, SubLObject terms, SubLObject mt) {
        SubLObject caching_state = $cached_all_instances_among_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym428$CACHED_ALL_INSTANCES_AMONG, $sym429$_CACHED_ALL_INSTANCES_AMONG_CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym430$CLEAR_CACHED_ALL_INSTANCES_AMONG);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(col, terms, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (col.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (terms.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(cached_all_instances_among_internal(col, terms, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col, terms, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 140200L)
    public static SubLObject kbq_queries_common_to_all_query_set_runs(SubLObject query_set_runs) {
        if (NIL != list_utilities.singletonP(query_set_runs)) {
            return kbq_query_set_run_valid_queries(query_set_runs.first());
        }
        SubLObject first_query_set_run = NIL;
        SubLObject rest_query_set_runs = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(query_set_runs, query_set_runs, $list431);
        first_query_set_run = query_set_runs.first();
        SubLObject current = rest_query_set_runs = query_set_runs.rest();
        SubLObject intersection_set = set_utilities.construct_set_from_list(kbq_query_set_run_valid_queries(first_query_set_run), Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = rest_query_set_runs;
        SubLObject rest_query_set_run = NIL;
        rest_query_set_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject candidate_set = set_utilities.construct_set_from_list(kbq_query_set_run_valid_queries(rest_query_set_run), Symbols.symbol_function(EQ), UNPROVIDED);
            SubLObject missing = NIL;
            SubLObject set_contents_var = set.do_set_internal(intersection_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, item) && NIL == set.set_memberP(item, candidate_set)) {
                    missing = cons(item, missing);
                }
            }
            SubLObject cdolist_list_var_$64 = missing;
            SubLObject item2 = NIL;
            item2 = cdolist_list_var_$64.first();
            while (NIL != cdolist_list_var_$64) {
                set.set_remove(item2, intersection_set);
                cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                item2 = cdolist_list_var_$64.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rest_query_set_run = cdolist_list_var.first();
        }
        return set.set_element_list(intersection_set);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 141000L)
    public static SubLObject kct_tests_common_to_all_test_set_runs(SubLObject test_set_runs) {
        if (NIL != list_utilities.singletonP(test_set_runs)) {
            return kct_test_set_run_valid_tests(test_set_runs.first());
        }
        SubLObject first_test_set_run = NIL;
        SubLObject rest_test_set_runs = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(test_set_runs, test_set_runs, $list432);
        first_test_set_run = test_set_runs.first();
        SubLObject current = rest_test_set_runs = test_set_runs.rest();
        SubLObject intersection_set = set_utilities.construct_set_from_list(kct_test_set_run_valid_tests(first_test_set_run), Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = rest_test_set_runs;
        SubLObject rest_test_set_run = NIL;
        rest_test_set_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject candidate_set = set_utilities.construct_set_from_list(kct_test_set_run_valid_tests(rest_test_set_run), Symbols.symbol_function(EQ), UNPROVIDED);
            SubLObject missing = NIL;
            SubLObject set_contents_var = set.do_set_internal(intersection_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, item) && NIL == set.set_memberP(item, candidate_set)) {
                    missing = cons(item, missing);
                }
            }
            SubLObject cdolist_list_var_$65 = missing;
            SubLObject item2 = NIL;
            item2 = cdolist_list_var_$65.first();
            while (NIL != cdolist_list_var_$65) {
                set.set_remove(item2, intersection_set);
                cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                item2 = cdolist_list_var_$65.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            rest_test_set_run = cdolist_list_var.first();
        }
        return set.set_element_list(intersection_set);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 141800L)
    public static SubLObject kct_consistently_succeeding_tests(SubLObject test_set_runs) {
        SubLObject succeeding_test_set_runs = Mapping.mapcar($sym433$KCT_SUCCEEDING_TEST_SET_RUN, test_set_runs);
        return kct_tests_common_to_all_test_set_runs(succeeding_test_set_runs);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 142000L)
    public static SubLObject kct_consistently_succeeding_test_set_runs(SubLObject test_set_runs) {
        SubLObject consistently_succeeding_test_set_runs = NIL;
        SubLObject succeeding_test_set_runs = Mapping.mapcar($sym433$KCT_SUCCEEDING_TEST_SET_RUN, test_set_runs);
        SubLObject consistently_succeeding_tests = kct_tests_common_to_all_test_set_runs(succeeding_test_set_runs);
        SubLObject cdolist_list_var = succeeding_test_set_runs;
        SubLObject test_set_run = NIL;
        test_set_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject consistently_succeeding_test_set_run = kct_filter_test_set_run_to_tests(test_set_run, consistently_succeeding_tests, UNPROVIDED);
            consistently_succeeding_test_set_runs = cons(consistently_succeeding_test_set_run, consistently_succeeding_test_set_runs);
            cdolist_list_var = cdolist_list_var.rest();
            test_set_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(consistently_succeeding_test_set_runs);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 142700L)
    public static SubLObject queries_that_became_unanswerable(SubLObject query_set_run_1, SubLObject query_set_run_2) {
        SubLObject answerable_queries_1 = kbq_query_set_run_queries(kbq_answerable_query_set_run(query_set_run_1));
        SubLObject unanswerable_queries_2 = kbq_query_set_run_queries(kbq_unanswerable_query_set_run(query_set_run_2));
        SubLObject queries_that_became_unanswerable = keyhash_utilities.fast_intersection(answerable_queries_1, unanswerable_queries_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return queries_that_became_unanswerable;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 143200L)
    public static SubLObject queries_that_changed_answer_count(SubLObject query_set_run_1, SubLObject query_set_run_2) {
        return kbq_query_set_run_queries(kbq_different_answer_count_query_set_runs(query_set_run_1, query_set_run_2));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 143500L)
    public static SubLObject kbq_query_runs_with_worst_slowdown(SubLObject query_set_run_1, SubLObject query_set_run_2, SubLObject n, SubLObject metric) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        if (metric == UNPROVIDED) {
            metric = $COMPLETE_TOTAL_TIME;
        }
        SubLObject list = NIL;
        SubLObject query_run_1 = NIL;
        SubLObject query_run_1_$66 = NIL;
        SubLObject query_run_2 = NIL;
        SubLObject query_run_2_$67 = NIL;
        query_run_1 = kbq_query_set_run_query_runs(query_set_run_1);
        query_run_1_$66 = query_run_1.first();
        query_run_2 = kbq_query_set_run_query_runs(query_set_run_2);
        query_run_2_$67 = query_run_2.first();
        while (NIL != query_run_2 || NIL != query_run_1) {
            if (!kbq_query_run_query(query_run_1_$66).equal(kbq_query_run_query(query_run_2_$67))) {
                return kbq_query_runs_with_worst_slowdown_robust(query_set_run_1, query_set_run_2, n, metric);
            }
            SubLObject metric_1 = kbq_query_run_property_value(query_run_1_$66, metric, UNPROVIDED);
            SubLObject metric_2 = kbq_query_run_property_value(query_run_2_$67, metric, UNPROVIDED);
            if (NIL != number_utilities.positive_number_p(metric_1) && NIL != number_utilities.positive_number_p(metric_2)) {
                SubLObject slowdown = Numbers.subtract(metric_2, metric_1);
                list = cons(list(query_run_2_$67, metric_2, metric_1, slowdown), list);
            }
            query_run_1 = query_run_1.rest();
            query_run_1_$66 = query_run_1.first();
            query_run_2 = query_run_2.rest();
            query_run_2_$67 = query_run_2.first();
        }
        return list_utilities.first_n(n, Sort.sort(list, Symbols.symbol_function($sym434$_), Symbols.symbol_function($sym435$FOURTH)));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 144700L)
    public static SubLObject kbq_query_runs_with_worst_slowdown_robust(SubLObject query_set_run_1, SubLObject query_set_run_2, SubLObject n, SubLObject metric) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        if (metric == UNPROVIDED) {
            metric = $COMPLETE_TOTAL_TIME;
        }
        SubLObject list = NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run_1);
        SubLObject query_run_1 = NIL;
        query_run_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query_run_2 = kbq_lookup_query_run(query_set_run_2, kbq_query_run_query(query_run_1));
            SubLObject metric_1 = kbq_query_run_property_value(query_run_1, metric, UNPROVIDED);
            SubLObject metric_2 = kbq_query_run_property_value(query_run_2, metric, UNPROVIDED);
            if (NIL != number_utilities.positive_number_p(metric_1) && NIL != number_utilities.positive_number_p(metric_2)) {
                SubLObject slowdown = Numbers.subtract(metric_2, metric_1);
                list = cons(list(query_run_2, metric_2, metric_1, slowdown), list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run_1 = cdolist_list_var.first();
        }
        return list_utilities.first_n(n, Sort.sort(list, Symbols.symbol_function($sym434$_), Symbols.symbol_function($sym435$FOURTH)));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 145500L)
    public static SubLObject kbq_slowest_query_runs(SubLObject query_set_run, SubLObject n, SubLObject metric) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        if (metric == UNPROVIDED) {
            metric = $COMPLETE_TOTAL_TIME;
        }
        SubLObject list = NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject value = kbq_query_run_property_value(query_run, metric, UNPROVIDED);
            if (value.isNumber()) {
                list = cons(list(query_run, value), list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Mapping.mapcar(Symbols.symbol_function($sym68$FIRST), list_utilities.first_n(n, Sort.sort(list, Symbols.symbol_function($sym434$_), Symbols.symbol_function($sym436$SECOND))));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 145900L)
    public static SubLObject kct_slowest_test_runs(SubLObject test_set_run, SubLObject n, SubLObject metric) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        if (metric == UNPROVIDED) {
            metric = $COMPLETE_TOTAL_TIME;
        }
        SubLObject list = NIL;
        SubLObject cdolist_list_var = kct_test_set_run_test_runs(test_set_run);
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query_run = kct_test_run_query_run(test_run);
            SubLObject value = kbq_query_run_property_value(query_run, metric, UNPROVIDED);
            if (value.isNumber()) {
                list = cons(list(test_run, value), list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return Mapping.mapcar(Symbols.symbol_function($sym68$FIRST), list_utilities.first_n(n, Sort.sort(list, Symbols.symbol_function($sym434$_), Symbols.symbol_function($sym436$SECOND))));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 146300L)
    public static SubLObject kbq_compare_query_set_run_answers(SubLObject query_set_run_1, SubLObject query_set_run_2) {
        SubLObject differences = NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run_1);
        SubLObject query_run_1 = NIL;
        query_run_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query = kbq_query_run_query(query_run_1);
            SubLObject query_run_2 = kbq_lookup_query_run(query_set_run_2, query);
            SubLObject difference = kbq_compare_query_run_answers(query_run_1, query_run_2);
            if (NIL != difference) {
                differences = cons(listS($QUERY, query, difference), differences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run_1 = cdolist_list_var.first();
        }
        differences = Sequences.nreverse(differences);
        return differences;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 147000L)
    public static SubLObject kbq_summarize_compare_query_set_run_answers(SubLObject query_set_run_1, SubLObject query_set_run_2) {
        SubLObject answerable_2 = NIL;
        SubLObject more_answers_2 = NIL;
        SubLObject different_answers = NIL;
        SubLObject more_answers_3 = NIL;
        SubLObject answerable_3 = NIL;
        SubLObject cdolist_list_var = kbq_compare_query_set_run_answers(query_set_run_1, query_set_run_2);
        SubLObject difference = NIL;
        difference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = difference;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_$68 = NIL;
            while (NIL != rest) {
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list437);
                current_$68 = rest.first();
                rest = rest.rest();
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list437);
                if (NIL == conses_high.member(current_$68, $list438, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_$68 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if (NIL != bad && NIL == allow_other_keys_p) {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list437);
            }
            SubLObject query_tail = cdestructuring_bind.property_list_member($QUERY, current);
            SubLObject query = (NIL != query_tail) ? conses_high.cadr(query_tail) : NIL;
            SubLObject missing_from_1_tail = cdestructuring_bind.property_list_member($MISSING_FROM_1, current);
            SubLObject missing_from_1 = (NIL != missing_from_1_tail) ? conses_high.cadr(missing_from_1_tail) : NIL;
            SubLObject missing_from_2_tail = cdestructuring_bind.property_list_member($MISSING_FROM_2, current);
            SubLObject missing_from_2 = (NIL != missing_from_2_tail) ? conses_high.cadr(missing_from_2_tail) : NIL;
            SubLObject v_1_count = Sequences.length(missing_from_2);
            SubLObject v_2_count = Sequences.length(missing_from_1);
            if (v_1_count.numE(v_2_count)) {
                different_answers = cons(list(query, v_1_count), different_answers);
            } else if (v_2_count.isZero()) {
                answerable_3 = cons(list(query, v_1_count), answerable_3);
            } else if (v_1_count.isZero()) {
                answerable_2 = cons(list(query, v_2_count), answerable_2);
            } else if (v_1_count.numG(v_2_count)) {
                more_answers_3 = cons(list(query, Numbers.subtract(v_1_count, v_2_count)), more_answers_3);
            } else if (v_1_count.numL(v_2_count)) {
                more_answers_2 = cons(list(query, Numbers.subtract(v_2_count, v_1_count)), more_answers_2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            difference = cdolist_list_var.first();
        }
        return nconc(new SubLObject[] { (NIL != answerable_2) ? list($ANSWERABLE_2, Sort.sort(answerable_2, Symbols.symbol_function($sym434$_), Symbols.symbol_function($sym436$SECOND))) : NIL,
                (NIL != more_answers_2) ? list($MORE_ANSWERS_2, Sort.sort(more_answers_2, Symbols.symbol_function($sym434$_), Symbols.symbol_function($sym436$SECOND))) : NIL,
                (NIL != different_answers) ? list($DIFFERENT_ANSWERS, Sort.sort(different_answers, Symbols.symbol_function($sym434$_), Symbols.symbol_function($sym436$SECOND))) : NIL,
                (NIL != more_answers_3) ? list($MORE_ANSWERS_1, Sort.sort(more_answers_3, Symbols.symbol_function($sym434$_), Symbols.symbol_function($sym436$SECOND))) : NIL,
                (NIL != answerable_3) ? ConsesLow.list($ANSWERABLE_1, Sort.sort(answerable_3, Symbols.symbol_function($sym434$_), Symbols.symbol_function($sym436$SECOND))) : NIL });
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 148400L)
    public static SubLObject kbq_sort_query_runs(SubLObject query_set_run, SubLObject metric) {
        return Sort.sort(conses_high.copy_list(kbq_query_set_run_query_runs(query_set_run)), $sym87$SAFE__, kbq_function_for_metric(metric));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 148600L)
    public static SubLObject kbq_lookup_query_run(SubLObject query_set_run, SubLObject query) {
        SubLObject cdolist_list_var;
        SubLObject query_runs = cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kbq_query_equal(query, kbq_query_run_query(query_run))) {
                return query_run;
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 148900L)
    public static SubLObject kbq_lookup_query_run_from_query_runs(SubLObject query_runs, SubLObject query) {
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kbq_query_equal(query, kbq_query_run_query(query_run))) {
                return query_run;
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 149100L)
    public static SubLObject kbq_lookup_query_runs(SubLObject query_set_runs, SubLObject query) {
        SubLObject query_runs = NIL;
        SubLObject cdolist_list_var = query_set_runs;
        SubLObject query_set_run = NIL;
        query_set_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query_run = kbq_lookup_query_run(query_set_run, query);
            query_runs = cons(query_run, query_runs);
            cdolist_list_var = cdolist_list_var.rest();
            query_set_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(query_runs);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 149400L)
    public static SubLObject kbq_query_equal(SubLObject query_1, SubLObject query_2) {
        return Equality.equalp(query_1, query_2);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 149500L)
    public static SubLObject kbq_compare_query_run_answers(SubLObject query_run_1, SubLObject query_run_2) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_1 = kbq_query_run_query(query_run_1);
        SubLObject query_2 = kbq_query_run_query(query_run_2);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == kbq_query_equal(query_1, query_2)) {
            Errors.error($str446$_S_and__S_are_different_queries, query_1, query_2);
        }
        SubLObject result_1 = kbq_query_run_result(query_run_1);
        SubLObject result_2 = kbq_query_run_result(query_run_2);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && $MISSING == result_1) {
            Errors.error($str447$_S_has_no_result, query_1);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && $MISSING == result_2) {
            Errors.error($str447$_S_has_no_result, query_2);
        }
        thread.resetMultipleValues();
        SubLObject missing_from_2 = bindings.compare_lists_of_binding_lists(result_1, result_2);
        SubLObject missing_from_3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == missing_from_3 && NIL == missing_from_2) {
            return NIL;
        }
        if (NIL == missing_from_3) {
            return list($MISSING_FROM_2, missing_from_2);
        }
        if (NIL == missing_from_2) {
            return list($MISSING_FROM_1, missing_from_3);
        }
        return list($MISSING_FROM_1, missing_from_3, $MISSING_FROM_2, missing_from_2);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 150600L)
    public static SubLObject kbq_compare_query_set_runs_by_property(SubLObject query_set_run_1, SubLObject query_set_run_2, SubLObject property, SubLObject test) {
        if (test == UNPROVIDED) {
            test = $sym87$SAFE__;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject count_1 = ZERO_INTEGER;
        SubLObject count_2 = ZERO_INTEGER;
        SubLObject queries_1 = kbq_extract_property_values(query_set_run_1, $QUERY, UNPROVIDED);
        SubLObject queries_2 = kbq_extract_property_values(query_set_run_1, $QUERY, UNPROVIDED);
        SubLObject values_1 = kbq_extract_property_values(query_set_run_1, property, UNPROVIDED);
        SubLObject values_2 = kbq_extract_property_values(query_set_run_2, property, UNPROVIDED);
        SubLObject i = ZERO_INTEGER;
        SubLObject query_1 = NIL;
        SubLObject query_1_$69 = NIL;
        SubLObject query_2 = NIL;
        SubLObject query_2_$70 = NIL;
        SubLObject value_1 = NIL;
        SubLObject value_1_$71 = NIL;
        SubLObject value_2 = NIL;
        SubLObject value_2_$72 = NIL;
        query_1 = queries_1;
        query_1_$69 = query_1.first();
        query_2 = queries_2;
        query_2_$70 = query_2.first();
        value_1 = values_1;
        value_1_$71 = value_1.first();
        value_2 = values_2;
        value_2_$72 = value_2.first();
        while (NIL != value_2 || NIL != value_1 || NIL != query_2 || NIL != query_1) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !query_1_$69.eql(query_2_$70)) {
                Errors.error($str448$query_set_runs_contained_differen);
            }
            if (NIL != Functions.funcall(test, value_1_$71, value_2_$72)) {
                result = cons(list(query_1_$69, value_1_$71, value_2_$72, ONE_INTEGER), result);
                count_1 = Numbers.add(count_1, ONE_INTEGER);
            } else {
                result = cons(list(query_1_$69, value_1_$71, value_2_$72, TWO_INTEGER), result);
                count_2 = Numbers.add(count_2, ONE_INTEGER);
            }
            i = Numbers.add(i, ONE_INTEGER);
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

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 152200L)
    public static SubLObject show_query_runs_that_became_unanswerable(SubLObject query_set_run_1, SubLObject query_set_run_2, SubLObject key, SubLObject sort_pred, SubLObject extra_key) {
        if (key == UNPROVIDED) {
            key = $sym101$KBQ_QUERY_RUN_TOTAL_TIME;
        }
        if (sort_pred == UNPROVIDED) {
            sort_pred = Symbols.symbol_function($sym87$SAFE__);
        }
        if (extra_key == UNPROVIDED) {
            extra_key = NIL;
        }
        SubLObject queries = queries_that_became_unanswerable(query_set_run_1, query_set_run_2);
        return show_query_runs_int(query_set_run_1, query_set_run_2, queries, key, sort_pred, extra_key);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 152500L)
    public static SubLObject show_query_runs_that_changed_answer_count(SubLObject query_set_run_1, SubLObject query_set_run_2, SubLObject key, SubLObject sort_pred, SubLObject extra_key) {
        if (key == UNPROVIDED) {
            key = $sym107$KBQ_QUERY_RUN_ANSWER_COUNT;
        }
        if (sort_pred == UNPROVIDED) {
            sort_pred = Symbols.symbol_function($sym87$SAFE__);
        }
        if (extra_key == UNPROVIDED) {
            extra_key = NIL;
        }
        SubLObject queries = queries_that_changed_answer_count(query_set_run_1, query_set_run_2);
        return show_query_runs_int(query_set_run_1, query_set_run_2, queries, key, sort_pred, extra_key);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 152900L)
    public static SubLObject show_query_runs_int(SubLObject query_set_run_1, SubLObject query_set_run_2, SubLObject queries, SubLObject key, SubLObject sort_pred, SubLObject extra_key) {
        SubLObject query_runs_1 = kbq_query_set_run_query_runs(kbq_filter_query_set_run_to_queries(query_set_run_1, queries, UNPROVIDED));
        SubLObject cdolist_list_var;
        SubLObject sorted_query_runs = cdolist_list_var = Sort.sort(query_runs_1, sort_pred, key);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query = kbq_query_run_query(query_run);
            SubLObject value = Functions.funcall(key, query_run);
            SubLObject other_query_run = kbq_lookup_query_run(query_set_run_2, query);
            SubLObject other_value = Functions.funcall(key, other_query_run);
            if (NIL != extra_key) {
                SubLObject extra_value = Functions.funcall(extra_key, query_run);
                SubLObject extra_other_value = Functions.funcall(extra_key, other_query_run);
                PrintLow.format(T, $str449$_s__s__s__s__s__, new SubLObject[] { value, extra_value, other_value, extra_other_value, query });
            } else {
                PrintLow.format(T, $str450$_s__s__s__, new SubLObject[] { value, other_value, query });
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return sorted_query_runs;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 153800L)
    public static SubLObject kbq_query_set_run_answerable_counts(SubLObject query_set_run_1, SubLObject query_set_run_2) {
        SubLObject answerable_1 = kbq_query_set_run_total_answerable(query_set_run_1);
        SubLObject answerable_2 = kbq_query_set_run_total_answerable(query_set_run_2);
        SubLObject mutually_answerable = Sequences.length(kbq_mutually_answerable_queries(list(query_set_run_1, query_set_run_2)));
        SubLObject only_answerable_in_1 = Numbers.subtract(answerable_1, mutually_answerable);
        SubLObject only_answerable_in_2 = Numbers.subtract(answerable_2, mutually_answerable);
        return Values.values(only_answerable_in_1, mutually_answerable, only_answerable_in_2);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 154700L)
    public static SubLObject kct_compare_test_set_run_statuses(SubLObject test_set_run_1, SubLObject test_set_run_2) {
        if (NIL != janus.janus_experiment_p(test_set_run_1) && NIL != janus.janus_experiment_p(test_set_run_2)) {
            return janus.janus_compare_test_set_run_statuses(test_set_run_1, test_set_run_2);
        }
        SubLObject differences = NIL;
        SubLObject cdolist_list_var = kct_test_set_run_test_runs(test_set_run_1);
        SubLObject test_run_1 = NIL;
        test_run_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject test = kct_test_run_test(test_run_1);
            SubLObject test_run_2 = kct_lookup_test_run(test_set_run_2, test);
            if (NIL != test_run_2) {
                SubLObject difference = kct_compare_test_run_statuses(test_run_1, test_run_2);
                if (NIL != difference) {
                    differences = cons(list($TEST, test, $CHANGE, difference), differences);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run_1 = cdolist_list_var.first();
        }
        differences = Sequences.nreverse(differences);
        return differences;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 155600L)
    public static SubLObject kct_summarize_compare_test_set_run_statuses(SubLObject test_set_run_1, SubLObject test_set_run_2) {
        SubLObject became_success = ZERO_INTEGER;
        SubLObject became_failure = ZERO_INTEGER;
        SubLObject cdolist_list_var = kct_compare_test_set_run_statuses(test_set_run_1, test_set_run_2);
        SubLObject difference = NIL;
        difference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = difference;
            SubLObject change_tail = cdestructuring_bind.property_list_member($CHANGE, current);
            SubLObject pcase_var;
            SubLObject change = pcase_var = (NIL != change_tail) ? conses_high.cadr(change_tail) : NIL;
            if (pcase_var.eql($BECAME_SUCCESS)) {
                became_success = Numbers.add(became_success, ONE_INTEGER);
            } else if (pcase_var.eql($BECAME_FAILURE)) {
                became_failure = Numbers.add(became_failure, ONE_INTEGER);
            } else {
                Errors.error($str454$unexpected_change__S, change);
            }
            cdolist_list_var = cdolist_list_var.rest();
            difference = cdolist_list_var.first();
        }
        return nconc((NIL != became_success) ? list($BECAME_SUCCESS, became_success) : NIL, (NIL != became_failure) ? list($BECAME_FAILURE, became_failure) : NIL);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 156200L)
    public static SubLObject kct_lookup_test_run(SubLObject test_set_run, SubLObject test) {
        SubLObject cdolist_list_var;
        SubLObject test_runs = cdolist_list_var = kct_test_set_run_test_runs(test_set_run);
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kct_test_equal(test, kct_test_run_test(test_run))) {
                return test_run;
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 156500L)
    public static SubLObject kct_test_equal(SubLObject test_1, SubLObject test_2) {
        return Equality.equalp(test_1, test_2);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 156700L)
    public static SubLObject kct_compare_test_run_statuses(SubLObject test_run_1, SubLObject test_run_2) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_1 = kct_test_run_test(test_run_1);
        SubLObject test_2 = kct_test_run_test(test_run_2);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == kct_test_equal(test_1, test_2)) {
            Errors.error($str455$_S_and__S_are_different_tests, test_1, test_2);
        }
        SubLObject status_1 = kct_test_run_status(test_run_1);
        SubLObject status_2 = kct_test_run_status(test_run_2);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == status_1) {
            Errors.error($str456$_S_has_no_status, test_1);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == status_2) {
            Errors.error($str456$_S_has_no_status, test_2);
        }
        if (status_1.eql(status_2)) {
            return NIL;
        }
        if ($SUCCESS == status_1) {
            return $BECAME_FAILURE;
        }
        return $BECAME_SUCCESS;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 157400L)
    public static SubLObject kbq_analyze_query_set_runs(SubLObject query_set_run_1, SubLObject query_set_run_2, SubLObject metrics) {
        if (metrics == UNPROVIDED) {
            metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
        }
        SubLObject analysis_1 = kbq_analyze_query_set_run(query_set_run_1, metrics);
        SubLObject analysis_2 = kbq_analyze_query_set_run(query_set_run_2, metrics);
        return kbq_compare_analysis(analysis_1, analysis_2);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 157800L)
    public static SubLObject kct_analyze_test_set_runs(SubLObject test_set_run_1, SubLObject test_set_run_2, SubLObject metrics) {
        if (metrics == UNPROVIDED) {
            metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
        }
        SubLObject analysis_1 = kct_analyze_test_set_run(test_set_run_1, metrics);
        SubLObject analysis_2 = kct_analyze_test_set_run(test_set_run_2, metrics);
        return kbq_compare_analysis(analysis_1, analysis_2);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 158100L)
    public static SubLObject kbq_compare_analysis(SubLObject analysis_1, SubLObject analysis_2) {
        SubLObject analysis = NIL;
        SubLObject remainder;
        SubLObject metric;
        SubLObject metric_value_2;
        SubLObject metric_value_3;
        SubLObject difference;
        SubLObject percentage;
        SubLObject metric_comparison_values;
        for (remainder = NIL, remainder = analysis_2; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            metric = remainder.first();
            metric_value_2 = conses_high.cadr(remainder);
            metric_value_3 = conses_high.getf(analysis_1, metric, $UNDEFINED);
            if ($UNDEFINED != metric_value_3) {
                difference = list_utilities.safe_difference(metric_value_2, metric_value_3);
                percentage = (NIL == metric_value_3 || metric_value_3.isZero() || NIL == metric_value_2) ? $UNDEFINED : number_utilities.significant_digits(Numbers.multiply($int$100, Numbers.divide(difference, metric_value_3)), FOUR_INTEGER);
                metric_comparison_values = list((NIL != metric_value_3) ? significant_digits_if_float(metric_value_3, FOUR_INTEGER) : NIL, (NIL != metric_value_2) ? significant_digits_if_float(metric_value_2, FOUR_INTEGER) : NIL,
                        (NIL != difference) ? significant_digits_if_float(difference, FOUR_INTEGER) : NIL, percentage);
                if (NIL == list_utilities.member_eqP($UNDEFINED, metric_comparison_values)) {
                    analysis = conses_high.putf(analysis, metric, metric_comparison_values);
                }
            }
        }
        return analysis;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 159400L)
    public static SubLObject significant_digits_if_float(SubLObject number, SubLObject significant_digits) {
        if (number.isInteger()) {
            return number;
        }
        return number_utilities.significant_digits(number, significant_digits);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 161400L)
    public static SubLObject kbq_print_analysis(SubLObject analysis) {
        if (NIL != analysis) {
            SubLObject new_plist = NIL;
            SubLObject remainder;
            SubLObject statistic_name;
            SubLObject statistic_list;
            SubLObject baseline_value;
            SubLObject experiment_value;
            SubLObject statistic_type;
            SubLObject ratio;
            SubLObject list;
            for (remainder = NIL, remainder = analysis; NIL != remainder; remainder = conses_high.cddr(remainder)) {
                statistic_name = remainder.first();
                statistic_list = conses_high.cadr(remainder);
                baseline_value = statistic_list.first();
                experiment_value = conses_high.second(statistic_list);
                statistic_type = conses_high.getf($kbq_summary_statistics$.getGlobalValue(), statistic_name, UNPROVIDED);
                if (NIL != subl_promotions.memberP(statistic_type, $list459, UNPROVIDED, UNPROVIDED)) {
                    ratio = ($NEITHER == statistic_type) ? NIL
                            : (($INCREASE == statistic_type) ? ((NIL == baseline_value || baseline_value.isZero()) ? $UNDEFINED : number_utilities.significant_digits(Numbers.divide(experiment_value, baseline_value), FOUR_INTEGER))
                                    : ((NIL == experiment_value || experiment_value.isZero()) ? $UNDEFINED : number_utilities.significant_digits(Numbers.divide(baseline_value, experiment_value), FOUR_INTEGER)));
                    list = ($NEITHER == statistic_type) ? list(baseline_value, experiment_value) : list(baseline_value, experiment_value, ratio);
                    new_plist = conses_high.putf(new_plist, statistic_name, list);
                }
            }
            list_utilities.pretty_print_plist(new_plist, UNPROVIDED);
            return new_plist;
        }
        PrintLow.format(T, $str462$empty__);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 162600L)
    public static SubLObject kbq_analyze_query_set_run(SubLObject query_set_run, SubLObject metrics) {
        if (metrics == UNPROVIDED) {
            metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
        }
        SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        return kbq_analyze_query_runs(query_runs, metrics);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 162900L)
    public static SubLObject kct_analyze_test_set_run(SubLObject test_set_run, SubLObject metrics) {
        if (metrics == UNPROVIDED) {
            metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
        }
        SubLObject test_runs = kct_test_set_run_test_runs(test_set_run);
        return kct_analyze_test_runs(test_runs, metrics);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 163100L)
    public static SubLObject kbq_analyze_query_runs(SubLObject query_runs, SubLObject metrics) {
        SubLObject analysis = NIL;
        SubLObject total = Sequences.length(query_runs);
        SubLObject partial_analysis = list($TOTAL, total);
        analysis = list_utilities.merge_plist(analysis, partial_analysis);
        SubLObject cdolist_list_var = metrics;
        SubLObject metric = NIL;
        metric = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject pcase_var = metric;
            if (pcase_var.eql($ANSWER_COUNT)) {
                SubLObject all_answer_counts = NIL;
                SubLObject cdolist_list_var_$73 = query_runs;
                SubLObject query_run = NIL;
                query_run = cdolist_list_var_$73.first();
                while (NIL != cdolist_list_var_$73) {
                    SubLObject var = kbq_query_run_property_value(query_run, $ANSWER_COUNT, ZERO_INTEGER);
                    if (NIL != var) {
                        all_answer_counts = cons(var, all_answer_counts);
                    }
                    cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                    query_run = cdolist_list_var_$73.first();
                }
                SubLObject total2 = Sequences.length(all_answer_counts);
                SubLObject total_answerable = Sequences.count_if(Symbols.symbol_function($sym410$POSITIVE_INTEGER_P), all_answer_counts, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject total_unanswerable = Numbers.subtract(total2, total_answerable);
                SubLObject total_error = kbq_count_erroring_query_runs(query_runs);
                SubLObject total_lumpy = kbq_count_lumpy_query_runs(query_runs);
                SubLObject sum_answer_count = number_utilities.summation(all_answer_counts);
                SubLObject mean_answer_count = (NIL != all_answer_counts) ? number_utilities.mean(all_answer_counts) : NIL;
                SubLObject median_answer_count = (NIL != all_answer_counts) ? number_utilities.median(all_answer_counts, UNPROVIDED, UNPROVIDED) : NIL;
                SubLObject partial_analysis2 = list(new SubLObject[] { $TOTAL_ANSWERABLE, total_answerable, $TOTAL_UNANSWERABLE, total_unanswerable, $TOTAL_ERROR, total_error, $TOTAL_LUMPY, total_lumpy, $SUM_ANSWER_COUNT, sum_answer_count, $MEAN_ANSWER_COUNT, mean_answer_count,
                        $MEDIAN_ANSWER_COUNT, median_answer_count });
                analysis = list_utilities.merge_plist(analysis, partial_analysis2);
            } else if (pcase_var.eql($HYPOTHESIZATION_TIME)) {
                SubLObject all_hypothesization_times = NIL;
                SubLObject cdolist_list_var_$74 = query_runs;
                SubLObject query_run = NIL;
                query_run = cdolist_list_var_$74.first();
                while (NIL != cdolist_list_var_$74) {
                    SubLObject var = kbq_query_run_property_value(query_run, $HYPOTHESIZATION_TIME, ZERO_INTEGER);
                    if (NIL != var) {
                        all_hypothesization_times = cons(var, all_hypothesization_times);
                    }
                    cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                    query_run = cdolist_list_var_$74.first();
                }
                SubLObject sum_hypothesization_time = number_utilities.summation(all_hypothesization_times);
                SubLObject mean_hypothesization_time = (NIL != all_hypothesization_times) ? number_utilities.mean(all_hypothesization_times) : NIL;
                SubLObject median_hypothesization_time = (NIL != all_hypothesization_times) ? number_utilities.median(all_hypothesization_times, UNPROVIDED, UNPROVIDED) : NIL;
                SubLObject stdev_hypothesization_time = (NIL != all_hypothesization_times) ? number_utilities.standard_deviation(all_hypothesization_times) : NIL;
                SubLObject partial_analysis3 = list($SUM_HYPOTHESIZATION_TIME, sum_hypothesization_time, $MEAN_HYPOTHESIZATION_TIME, mean_hypothesization_time, $MEDIAN_HYPOTHESIZATION_TIME, median_hypothesization_time, $STDEV_HYPOTHESIZATION_TIME, stdev_hypothesization_time);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            } else if (pcase_var.eql($TOTAL_TIME)) {
                SubLObject all_total_times = NIL;
                SubLObject cdolist_list_var_$75 = query_runs;
                SubLObject query_run = NIL;
                query_run = cdolist_list_var_$75.first();
                while (NIL != cdolist_list_var_$75) {
                    SubLObject var = kbq_query_run_property_value(query_run, $TOTAL_TIME, ZERO_INTEGER);
                    if (NIL != var) {
                        all_total_times = cons(var, all_total_times);
                    }
                    cdolist_list_var_$75 = cdolist_list_var_$75.rest();
                    query_run = cdolist_list_var_$75.first();
                }
                SubLObject sum_total_time = number_utilities.summation(all_total_times);
                SubLObject mean_total_time = (NIL != all_total_times) ? number_utilities.mean(all_total_times) : NIL;
                SubLObject median_total_time = (NIL != all_total_times) ? number_utilities.median(all_total_times, UNPROVIDED, UNPROVIDED) : NIL;
                SubLObject stdev_total_time = (NIL != all_total_times) ? number_utilities.standard_deviation(all_total_times) : NIL;
                SubLObject partial_analysis3 = list($SUM_TOTAL_TIME, sum_total_time, $MEAN_TOTAL_TIME, mean_total_time, $MEDIAN_TOTAL_TIME, median_total_time, $STDEV_TOTAL_TIME, stdev_total_time);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            } else if (pcase_var.eql($COMPLETE_TOTAL_TIME)) {
                SubLObject all_total_times = NIL;
                SubLObject cdolist_list_var_$76 = query_runs;
                SubLObject query_run = NIL;
                query_run = cdolist_list_var_$76.first();
                while (NIL != cdolist_list_var_$76) {
                    SubLObject var = kbq_query_run_property_value(query_run, $COMPLETE_TOTAL_TIME, ZERO_INTEGER);
                    if (NIL != var) {
                        all_total_times = cons(var, all_total_times);
                    }
                    cdolist_list_var_$76 = cdolist_list_var_$76.rest();
                    query_run = cdolist_list_var_$76.first();
                }
                SubLObject sum_total_time = number_utilities.summation(all_total_times);
                SubLObject mean_total_time = (NIL != all_total_times) ? number_utilities.mean(all_total_times) : NIL;
                SubLObject median_total_time = (NIL != all_total_times) ? number_utilities.median(all_total_times, UNPROVIDED, UNPROVIDED) : NIL;
                SubLObject stdev_total_time = (NIL != all_total_times) ? number_utilities.standard_deviation(all_total_times) : NIL;
                SubLObject partial_analysis3 = list($SUM_COMPLETE_TOTAL_TIME, sum_total_time, $MEAN_COMPLETE_TOTAL_TIME, mean_total_time, $MEDIAN_COMPLETE_TOTAL_TIME, median_total_time, $STDEV_COMPLETE_TOTAL_TIME, stdev_total_time);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            } else if (pcase_var.eql($TIME_TO_FIRST_ANSWER)) {
                SubLObject all_time_to_first_answers = NIL;
                SubLObject cdolist_list_var_$77 = query_runs;
                SubLObject query_run = NIL;
                query_run = cdolist_list_var_$77.first();
                while (NIL != cdolist_list_var_$77) {
                    SubLObject var = kbq_query_run_property_value(query_run, $TIME_TO_FIRST_ANSWER, UNPROVIDED);
                    if (NIL != var) {
                        all_time_to_first_answers = cons(var, all_time_to_first_answers);
                    }
                    cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                    query_run = cdolist_list_var_$77.first();
                }
                SubLObject sum_time_to_first_answer = number_utilities.summation(all_time_to_first_answers);
                SubLObject mean_time_to_first_answer = (NIL != all_time_to_first_answers) ? number_utilities.mean(all_time_to_first_answers) : NIL;
                SubLObject median_time_to_first_answer = (NIL != all_time_to_first_answers) ? number_utilities.median(all_time_to_first_answers, UNPROVIDED, UNPROVIDED) : NIL;
                SubLObject stdev_time_to_first_answer = (NIL != all_time_to_first_answers) ? number_utilities.standard_deviation(all_time_to_first_answers) : NIL;
                SubLObject partial_analysis3 = list($SUM_TIME_TO_FIRST_ANSWER, sum_time_to_first_answer, $MEAN_TIME_TO_FIRST_ANSWER, mean_time_to_first_answer, $MEDIAN_TIME_TO_FIRST_ANSWER, median_time_to_first_answer, $STDEV_TIME_TO_FIRST_ANSWER, stdev_time_to_first_answer);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            } else if (pcase_var.eql($COMPLETE_TIME_TO_FIRST_ANSWER)) {
                SubLObject all_time_to_first_answers = NIL;
                SubLObject cdolist_list_var_$78 = query_runs;
                SubLObject query_run = NIL;
                query_run = cdolist_list_var_$78.first();
                while (NIL != cdolist_list_var_$78) {
                    SubLObject var = kbq_query_run_property_value(query_run, $COMPLETE_TIME_TO_FIRST_ANSWER, UNPROVIDED);
                    if (NIL != var) {
                        all_time_to_first_answers = cons(var, all_time_to_first_answers);
                    }
                    cdolist_list_var_$78 = cdolist_list_var_$78.rest();
                    query_run = cdolist_list_var_$78.first();
                }
                SubLObject sum_time_to_first_answer = number_utilities.summation(all_time_to_first_answers);
                SubLObject mean_time_to_first_answer = (NIL != all_time_to_first_answers) ? number_utilities.mean(all_time_to_first_answers) : NIL;
                SubLObject median_time_to_first_answer = (NIL != all_time_to_first_answers) ? number_utilities.median(all_time_to_first_answers, UNPROVIDED, UNPROVIDED) : NIL;
                SubLObject stdev_time_to_first_answer = (NIL != all_time_to_first_answers) ? number_utilities.standard_deviation(all_time_to_first_answers) : NIL;
                SubLObject partial_analysis3 = list($SUM_COMPLETE_TIME_TO_FIRST_ANSWER, sum_time_to_first_answer, $MEAN_COMPLETE_TIME_TO_FIRST_ANSWER, mean_time_to_first_answer, $MEDIAN_COMPLETE_TIME_TO_FIRST_ANSWER, median_time_to_first_answer, $STDEV_COMPLETE_TIME_TO_FIRST_ANSWER,
                        stdev_time_to_first_answer);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            } else if (pcase_var.eql($ANSWERABILITY_TIME)) {
                SubLObject all_answerability_times = NIL;
                SubLObject cdolist_list_var_$79 = query_runs;
                SubLObject query_run = NIL;
                query_run = cdolist_list_var_$79.first();
                while (NIL != cdolist_list_var_$79) {
                    SubLObject var = kbq_query_run_property_value(query_run, $ANSWERABILITY_TIME, UNPROVIDED);
                    if (NIL != var) {
                        all_answerability_times = cons(var, all_answerability_times);
                    }
                    cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                    query_run = cdolist_list_var_$79.first();
                }
                SubLObject sum_answerability_time = number_utilities.summation(all_answerability_times);
                SubLObject mean_answerability_time = (NIL != all_answerability_times) ? number_utilities.mean(all_answerability_times) : NIL;
                SubLObject median_answerability_time = (NIL != all_answerability_times) ? number_utilities.median(all_answerability_times, UNPROVIDED, UNPROVIDED) : NIL;
                SubLObject stdev_answerability_time = (NIL != all_answerability_times) ? number_utilities.standard_deviation(all_answerability_times) : NIL;
                SubLObject partial_analysis3 = list($SUM_ANSWERABILITY_TIME, sum_answerability_time, $MEAN_ANSWERABILITY_TIME, mean_answerability_time, $MEDIAN_ANSWERABILITY_TIME, median_answerability_time, $STDEV_ANSWERABILITY_TIME, stdev_answerability_time);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            } else if (pcase_var.eql($TIME_TO_LAST_ANSWER)) {
                SubLObject all_time_to_last_answers = NIL;
                SubLObject cdolist_list_var_$80 = query_runs;
                SubLObject query_run = NIL;
                query_run = cdolist_list_var_$80.first();
                while (NIL != cdolist_list_var_$80) {
                    SubLObject var = kbq_query_run_property_value(query_run, $TIME_TO_LAST_ANSWER, UNPROVIDED);
                    if (NIL != var) {
                        all_time_to_last_answers = cons(var, all_time_to_last_answers);
                    }
                    cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                    query_run = cdolist_list_var_$80.first();
                }
                SubLObject sum_time_to_last_answer = number_utilities.summation(all_time_to_last_answers);
                SubLObject mean_time_to_last_answer = (NIL != all_time_to_last_answers) ? number_utilities.mean(all_time_to_last_answers) : NIL;
                SubLObject median_time_to_last_answer = (NIL != all_time_to_last_answers) ? number_utilities.median(all_time_to_last_answers, UNPROVIDED, UNPROVIDED) : NIL;
                SubLObject stdev_time_to_last_answer = (NIL != all_time_to_last_answers) ? number_utilities.standard_deviation(all_time_to_last_answers) : NIL;
                SubLObject partial_analysis3 = list($SUM_TIME_TO_LAST_ANSWER, sum_time_to_last_answer, $MEAN_TIME_TO_LAST_ANSWER, mean_time_to_last_answer, $MEDIAN_TIME_TO_LAST_ANSWER, median_time_to_last_answer, $STDEV_TIME_TO_LAST_ANSWER, stdev_time_to_last_answer);
                analysis = list_utilities.merge_plist(analysis, partial_analysis3);
            } else if (pcase_var.eql($COMPLETE_TIME_PER_ANSWER)) {
                SubLObject all_time_per_answers = NIL;
                SubLObject cdolist_list_var_$81 = query_runs;
                SubLObject query_run = NIL;
                query_run = cdolist_list_var_$81.first();
                while (NIL != cdolist_list_var_$81) {
                    SubLObject var = kbq_query_run_property_value(query_run, $COMPLETE_TIME_PER_ANSWER, UNPROVIDED);
                    if (NIL != var) {
                        all_time_per_answers = cons(var, all_time_per_answers);
                    }
                    cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                    query_run = cdolist_list_var_$81.first();
                }
                SubLObject median_time_per_answer = (NIL != all_time_per_answers) ? number_utilities.median(all_time_per_answers, UNPROVIDED, UNPROVIDED) : NIL;
                SubLObject partial_analysis4 = list($MEDIAN_COMPLETE_TIME_PER_ANSWER, median_time_per_answer);
                analysis = list_utilities.merge_plist(analysis, partial_analysis4);
            } else {
                Errors.warn($str492$ignoring_metric__S, metric);
            }
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        }
        if (NIL != subl_promotions.memberP($TOTAL_TIME, metrics, UNPROVIDED, UNPROVIDED) && NIL != subl_promotions.memberP($ANSWER_COUNT, metrics, UNPROVIDED, UNPROVIDED)) {
            SubLObject all_times_per_answer = NIL;
            SubLObject cdolist_list_var2 = query_runs;
            SubLObject query_run2 = NIL;
            query_run2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject total_time = conses_high.getf(query_run2, $TOTAL_TIME, ZERO_INTEGER);
                SubLObject answer_count = conses_high.getf(query_run2, $ANSWER_COUNT, ZERO_INTEGER);
                if (NIL != subl_promotions.positive_integer_p(answer_count)) {
                    SubLObject var;
                    SubLObject time_per_answer = var = Numbers.divide(total_time, answer_count);
                    if (NIL != var) {
                        all_times_per_answer = cons(var, all_times_per_answer);
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                query_run2 = cdolist_list_var2.first();
            }
            SubLObject median_time_per_answer2 = (NIL != all_times_per_answer) ? number_utilities.median(all_times_per_answer, UNPROVIDED, UNPROVIDED) : NIL;
            SubLObject partial_analysis5 = list($MEDIAN_TIME_PER_ANSWER, median_time_per_answer2);
            analysis = list_utilities.merge_plist(analysis, partial_analysis5);
        }
        return analysis;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 172400L)
    public static SubLObject kbq_query_set_run_total_answerable(SubLObject query_set_run) {
        SubLObject query_runs = kbq_query_set_run_query_runs(query_set_run);
        SubLObject all_answer_counts = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject var = conses_high.getf(query_run, $ANSWER_COUNT, ZERO_INTEGER);
            if (NIL != var) {
                all_answer_counts = cons(var, all_answer_counts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        SubLObject total_answerable = Sequences.count_if(Symbols.symbol_function($sym410$POSITIVE_INTEGER_P), all_answer_counts, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return total_answerable;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 172700L)
    public static SubLObject kbq_query_set_run_last_query_from_file(SubLObject filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject last_query = NIL;
        assert NIL != Types.stringp(filename) : filename;
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str225$Unable_to_open__S, filename);
            }
            SubLObject stream_$82 = stream;
            SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind(NIL, thread);
                cfasl.cfasl_set_common_symbols_simple(kbq_cfasl_common_symbols_simple());
                SubLObject _prev_bind_0_$83 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
                try {
                    cfasl.$cfasl_input_guid_string_resource$.bind(cfasl.get_new_cfasl_input_guid_string_resource(), thread);
                    SubLObject query_set_run = kbq_load_query_set_run_int(stream_$82);
                    SubLObject csome_list_var = kbq_query_set_run_query_runs(query_set_run);
                    SubLObject query_run = NIL;
                    query_run = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        last_query = kbq_query_run_query(query_run);
                        csome_list_var = csome_list_var.rest();
                        query_run = csome_list_var.first();
                    }
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = NIL) {
                        query_run = kbq_load_query_run_int(stream_$82);
                        if (query_run == $EOF) {
                            done_var = T;
                        }
                        if (NIL == done_var) {
                            query_run = kbq_nclean_query_run(query_run);
                            last_query = kbq_query_run_query(query_run);
                        }
                    }
                } finally {
                    cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_0_$83, thread);
                }
            } finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            }
        } finally {
            SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return last_query;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 173000L)
    public static SubLObject kbq_query_set_run_identify_probable_segfault_from_file(SubLObject filename, SubLObject all_kbqs) {
        SubLObject last_kbq = kbq_query_set_run_last_query_from_file(filename);
        return kbq_query_set_run_identify_probable_segfault_int(last_kbq, all_kbqs);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 173200L)
    public static SubLObject kbq_query_set_run_identify_probable_segfault(SubLObject query_set_run, SubLObject all_kbqs) {
        SubLObject last_kbq = list_utilities.last_one(kbq_query_set_run_queries(query_set_run));
        return kbq_query_set_run_identify_probable_segfault_int(last_kbq, all_kbqs);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 173500L)
    public static SubLObject kbq_query_set_run_identify_probable_segfault_int(SubLObject last_kbq, SubLObject all_kbqs) {
        SubLObject last_pos = Sequences.position(last_kbq, all_kbqs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject segfault_pos = number_utilities.f_1X(last_pos);
        SubLObject segfaulting_kbq = nth(segfault_pos, all_kbqs);
        return Values.values(segfaulting_kbq, segfault_pos);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 173700L)
    public static SubLObject kct_analyze_test_runs(SubLObject test_runs, SubLObject metrics) {
        SubLObject total = Sequences.length(test_runs);
        SubLObject total_success = Sequences.count($SUCCESS, test_runs, Symbols.symbol_function(EQ), Symbols.symbol_function($sym373$KCT_TEST_RUN_STATUS), UNPROVIDED, UNPROVIDED);
        SubLObject total_failure = Sequences.count($FAILURE, test_runs, Symbols.symbol_function(EQ), Symbols.symbol_function($sym373$KCT_TEST_RUN_STATUS), UNPROVIDED, UNPROVIDED);
        SubLObject test_analysis = list($TOTAL, total, $TOTAL_SUCCESS, total_success, $TOTAL_FAILURE, total_failure);
        if (total.isPositive()) {
            SubLObject success_pct = number_utilities.percent(total_success, total, UNPROVIDED);
            SubLObject failure_pct = number_utilities.percent(total_failure, total, UNPROVIDED);
            test_analysis = append(test_analysis, list($PERCENT_SUCCESS, success_pct, $PERCENT_FAILURE, failure_pct));
        }
        SubLObject query_runs = Mapping.mapcar(Symbols.symbol_function($sym498$KCT_TEST_RUN_QUERY_RUN), test_runs);
        SubLObject query_run_analysis = conses_high.remf(kbq_analyze_query_runs(query_runs, metrics), $TOTAL);
        return list_utilities.merge_plist(test_analysis, query_run_analysis);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 174600L)
    public static SubLObject kct_test_set_run_identify_probable_segfault(SubLObject test_set_run, SubLObject all_kcts) {
        SubLObject last_kct = list_utilities.last_one(kct_test_set_run_tests(test_set_run));
        SubLObject last_pos = Sequences.position(last_kct, all_kcts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject segfault_pos = number_utilities.f_1X(last_pos);
        SubLObject segfaulting_kct = nth(segfault_pos, all_kcts);
        return Values.values(segfaulting_kct, segfault_pos);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 174900L)
    public static SubLObject analyze_kbq_experiments(SubLObject baseline_denoting_symbol, SubLObject experiment_denoting_symbol, SubLObject corpus, SubLObject graph_metrics, SubLObject metrics, SubLObject display, SubLObject stream) {
        if (corpus == UNPROVIDED) {
            corpus = $str161$;
        }
        if (graph_metrics == UNPROVIDED) {
            graph_metrics = $list499;
        }
        if (metrics == UNPROVIDED) {
            metrics = lilliput.basic_lilliput_query_metrics();
        }
        if (display == UNPROVIDED) {
            display = $str500$_0;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != special_variable_state.bound_symbol_p(baseline_denoting_symbol) : baseline_denoting_symbol;
        assert NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) : experiment_denoting_symbol;
        SubLObject baseline = Symbols.symbol_value(baseline_denoting_symbol);
        SubLObject baseline_name = Symbols.symbol_name(baseline_denoting_symbol);
        SubLObject experiment = Symbols.symbol_value(experiment_denoting_symbol);
        SubLObject experiment_name = Symbols.symbol_name(experiment_denoting_symbol);
        thread.resetMultipleValues();
        SubLObject mutual_baseline = kbq_mutually_answerable_query_set_runs(baseline, experiment);
        SubLObject mutual_experiment = thread.secondMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format(stream, $str502$____Answerability_analysis____);
        thread.resetMultipleValues();
        SubLObject only_1 = kbq_query_set_run_answerable_counts(baseline, experiment);
        SubLObject mutual = thread.secondMultipleValue();
        SubLObject only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format(T, $str503$Total_____________s__s__s__, new SubLObject[] { only_1, mutual, only_2 });
        PrintLow.format(stream, $str504$____Basic_analysis____);
        kbq_print_analysis(kbq_analyze_query_set_runs(baseline, experiment, metrics));
        PrintLow.format(stream, $str505$____Mutually_Answerable____);
        kbq_print_analysis(kbq_analyze_query_set_runs(mutual_baseline, mutual_experiment, metrics));
        PrintLow.format(stream, $str506$____Answerable____);
        kbq_print_analysis(kbq_analyze_query_set_runs(kbq_answerable_query_set_run(baseline), kbq_answerable_query_set_run(experiment), metrics));
        PrintLow.format(stream, $str507$____Unanswerable____);
        kbq_print_analysis(kbq_analyze_query_set_runs(kbq_unanswerable_query_set_run(baseline), kbq_unanswerable_query_set_run(experiment), metrics));
        SubLObject cdolist_list_var = graph_metrics;
        SubLObject metric = NIL;
        metric = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$84 = $list508;
            SubLObject sort_by = NIL;
            sort_by = cdolist_list_var_$84.first();
            while (NIL != cdolist_list_var_$84) {
                lilliput.lilliput_generate_sorted_property_comparison(baseline, experiment, baseline_name, experiment_name, metric, sort_by, corpus, display);
                cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                sort_by = cdolist_list_var_$84.first();
            }
            SubLObject cdolist_list_var_$85 = $list508;
            sort_by = NIL;
            sort_by = cdolist_list_var_$85.first();
            while (NIL != cdolist_list_var_$85) {
                lilliput.lilliput_generate_sorted_property_comparison(mutual_baseline, mutual_experiment, baseline_name, experiment_name, metric, sort_by, Sequences.cconcatenate($str509$Mutually_Answerable_, corpus), display);
                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                sort_by = cdolist_list_var_$85.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 177100L)
    public static SubLObject kbq_non_lumpy_query_set_run(SubLObject query_set_run) {
        return kbq_filter_query_set_run_to_queries(query_set_run, kbq_lumpy_queries(query_set_run), T);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 177300L)
    public static SubLObject kbq_lumpy_queries(SubLObject query_set_run) {
        SubLObject queries = NIL;
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kbq_lumpy_query_runP(query_run)) {
                queries = cons(kbq_query_run_query(query_run), queries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(queries);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 177700L)
    public static SubLObject kbq_lumpy_query_count(SubLObject query_set_run) {
        return kbq_count_lumpy_query_runs(kbq_query_set_run_query_runs(query_set_run));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 177900L)
    public static SubLObject kbq_count_lumpy_query_runs(SubLObject query_runs) {
        return Sequences.count_if($sym510$KBQ_LUMPY_QUERY_RUN_, query_runs, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 178000L)
    public static SubLObject kbq_lumpy_query_runP(SubLObject query_run) {
        SubLObject halt_reason = kbq_query_run_halt_reason(query_run);
        if (NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(halt_reason)
                && NIL != string_utilities.substringP($str511$Unable_to_compute_any_metrics, inference_datastructures_enumerated_types.inference_error_suspend_status_message(halt_reason), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 178400L)
    public static SubLObject show_kct_test_set_run_summary(SubLObject test_set_run, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_runs = kct_test_set_run_test_runs(test_set_run);
        SubLObject total = Sequences.length(test_runs);
        SubLObject successes = Sequences.count($SUCCESS, test_runs, Symbols.symbol_function(EQ), Symbols.symbol_function($sym373$KCT_TEST_RUN_STATUS), UNPROVIDED, UNPROVIDED);
        SubLObject failures = Sequences.count($FAILURE, test_runs, Symbols.symbol_function(EQ), Symbols.symbol_function($sym373$KCT_TEST_RUN_STATUS), UNPROVIDED, UNPROVIDED);
        SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
            reader.$read_default_float_format$.bind($sym512$DOUBLE_FLOAT, thread);
            PrintLow.format(stream, $str513$_____Total_Tests____4D, total);
            PrintLow.format(stream, $str514$______Successes_____4D___S___, successes, number_utilities.significant_digits(Numbers.multiply($int$100, Numbers.divide(successes, total)), THREE_INTEGER));
            PrintLow.format(stream, $str515$______Failures______4D___S___, failures, number_utilities.significant_digits(Numbers.multiply($int$100, Numbers.divide(failures, total)), THREE_INTEGER));
            SubLObject analysis = kct_analyze_test_set_run(test_set_run, UNPROVIDED);
            PrintLow.format(stream, $str516$_______Test_Set_Metrics__);
            list_utilities.pretty_print_plist(analysis, stream);
            SubLObject cdolist_list_var = test_runs;
            SubLObject test_run = NIL;
            test_run = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject test = kct_test_run_test(test_run);
                SubLObject status = kct_test_run_status(test_run);
                SubLObject query_run = kct_test_run_query_run(test_run);
                SubLObject halt_reason = kbq_query_run_property_value(query_run, $HALT_REASON, UNPROVIDED);
                PrintLow.format(stream, $str517$____Test____S, test);
                PrintLow.format(stream, $str518$__Status____S, status);
                PrintLow.format(stream, $str519$__Halt_Reason____S, halt_reason);
                SubLObject remainder;
                SubLObject property;
                SubLObject value;
                for (remainder = NIL, remainder = query_run; NIL != remainder; remainder = conses_high.cddr(remainder)) {
                    property = remainder.first();
                    value = conses_high.cadr(remainder);
                    if (NIL != inference_datastructures_enumerated_types.query_metric_p(property) && NIL != value) {
                        PrintLow.format(stream, $str520$___S__S, property, value);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            }
        } finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 179800L)
    public static SubLObject kbq_show_halt_reason_histogram(SubLObject query_set_run) {
        return list_utilities.pretty_print_histogram(list_utilities.histogram(Mapping.mapcar($sym521$KBQ_QUERY_RUN_HALT_REASON, kbq_query_set_run_query_runs(query_set_run)), Symbols.symbol_function($sym86$_), Symbols.symbol_function(EQUAL), UNPROVIDED));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 180000L)
    public static SubLObject trim_analysis_if_zero(SubLObject plist) {
        if (ZERO_INTEGER.eql(conses_high.getf(plist, $TOTAL, UNPROVIDED))) {
            return $list522;
        }
        return plist;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 180200L)
    public static SubLObject kbq_query_literal_count(SubLObject query) {
        SubLObject sentence;
        for (sentence = czer_utilities.unwrap_if_ist_permissive(kb_query.kbq_sentence(query), kb_query.kbq_mt(query)); NIL != el_utilities.el_existential_p(sentence); sentence = cycl_utilities.formula_arg2(sentence, UNPROVIDED)) {
            if (NIL != el_utilities.el_existential_p(sentence)) {
            }
        }
        if (NIL == el_utilities.el_conjunction_p(sentence)) {
            return ONE_INTEGER;
        }
        return el_utilities.formula_arity(sentence, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 180600L)
    public static SubLObject kbq_single_literal_query_p(SubLObject query) {
        SubLObject sentence;
        for (sentence = czer_utilities.unwrap_if_ist_permissive(kb_query.kbq_sentence(query), kb_query.kbq_mt(query)); NIL != el_utilities.el_existential_p(sentence); sentence = cycl_utilities.formula_arg2(sentence, UNPROVIDED)) {
            if (NIL != el_utilities.el_existential_p(sentence)) {
            }
        }
        return cycl_grammar.cycl_literal_p(sentence);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 181100L)
    public static SubLObject kbq_progress_stream() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $kbq_progress_stream$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 181200L)
    public static SubLObject kbq_benchmark_run_and_report(SubLObject filename, SubLObject title, SubLObject test_col) {
        kbq_benchmark_run(filename, title, test_col, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        kbq_benchmark_report(filename, UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 181400L)
    public static SubLObject kbq_benchmark_run_in_background(SubLObject filename, SubLObject title, SubLObject test_col) {
        subl_promotions.make_process_with_args(Sequences.cconcatenate($str524$Running_kbq_benchmark__kbq_benchm, new SubLObject[] { format_nil.format_nil_s_no_copy(filename), $str525$_ }), $sym526$KBQ_BENCHMARK_RUN, list(filename, title, test_col));
        format_nil.force_format(T, $str527$kbq_benchmark__kbq_benchmark_repo, filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 181700L)
    public static SubLObject kbq_benchmark_run(SubLObject filename, SubLObject title, SubLObject test_col, SubLObject overriding_query_properties, SubLObject skip, SubLObject count) {
        if (overriding_query_properties == UNPROVIDED) {
            overriding_query_properties = NIL;
        }
        if (skip == UNPROVIDED) {
            skip = ZERO_INTEGER;
        }
        if (count == UNPROVIDED) {
            count = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(filename) : filename;
        assert NIL != Types.stringp(title) : title;
        assert NIL != forts.fort_p(test_col) : test_col;
        if (NIL != overriding_query_properties && !assertionsDisabledInClass && NIL == Types.listp(overriding_query_properties)) {
            throw new AssertionError(overriding_query_properties);
        }
        SubLObject comment = NIL;
        SubLObject stream = NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            if (title.isString()) {
                PrintLow.format(stream, $str530$_______A______, title);
            }
            if (NIL != overriding_query_properties) {
                PrintLow.format(stream, $str531$____overriding_query_properties__, overriding_query_properties);
            }
            PrintLow.format(stream, $str532$Tests_run_in_System__A_KB__A__, system_info.cyc_revision_string(), operation_communication.kb_version_string());
            comment = streams_high.get_output_stream_string(stream);
        } finally {
            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return run_kbq_experiment_internal(list(new SubLObject[] { $QUERY_SPEC_SET, reader.bq_cons($$TheSet, append(Mapping.mapcar($sym534$KCT_QUERY_SPECIFICATION, isa.all_instances_in_all_mts(test_col)), NIL)), $FILENAME, filename, $ANALYSIS_FILENAME, NIL, $KEEPALIVE_FILENAME,
                NIL, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $METRICS, $list535, $OUTLIER_TIMEOUT, $kbq_benchmark_outlier_timeout$.getDynamicValue(thread), $INCREMENTAL, T, $INCLUDE_RESULTS, T, $RANDOMIZE, NIL, $SKIP, skip, $COUNT,
                count, $IF_FILE_EXISTS, $AUGMENT_OR_RERUN_ERRORS }));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 182800L)
    public static SubLObject kbq_benchmark_report(SubLObject filename, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject query_set_run = kbq_load_query_set_run(filename);
        SubLObject comment = kbq_query_set_run_comment(query_set_run);
        SubLObject total_num = ZERO_INTEGER;
        SubLObject total_ttfa = ZERO_INTEGER;
        SubLObject total_ttfs = ZERO_INTEGER;
        SubLObject total_sksi_call_count = ZERO_INTEGER;
        SubLObject total_sksi = ZERO_INTEGER;
        SubLObject total_total_time = ZERO_INTEGER;
        PrintLow.format(stream, comment);
        PrintLow.format(stream, $str536$__ANS__TTFS____TTFA__SQ____SKSI__);
        PrintLow.format(stream, $str537$_________________________________);
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject kbq_run = NIL;
        kbq_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query = kbq_query_run_query(kbq_run);
            SubLObject halt_reason = kbq_query_run_halt_reason(kbq_run);
            SubLObject test = (NIL != nart_handles.valid_nartP(query, UNPROVIDED)) ? cycl_utilities.nat_arg1(query, UNPROVIDED) : NIL;
            SubLObject num = kbq_extract_query_run_metric_value(kbq_run, $ANSWER_COUNT, ZERO_INTEGER);
            SubLObject sksi_start_times = kbq_extract_query_run_metric_value(kbq_run, $SKSI_QUERY_START_TIMES, ZERO_INTEGER);
            SubLObject sksi_call_count = sksi_start_times.isCons() ? Sequences.length(sksi_start_times) : NIL;
            SubLObject ttfs = sksi_start_times.isCons() ? sksi_start_times.first() : NIL;
            SubLObject ttfa = kbq_extract_query_run_metric_value(kbq_run, $TIME_TO_FIRST_ANSWER, ZERO_INTEGER);
            SubLObject sksi_query_total_time = kbq_extract_query_run_metric_value(kbq_run, $SKSI_QUERY_TOTAL_TIME, ZERO_INTEGER);
            SubLObject total_time = kbq_extract_query_run_metric_value(kbq_run, $TOTAL_TIME, ZERO_INTEGER);
            if (NIL != number_utilities.positive_number_p(num)) {
                total_num = Numbers.add(total_num, num);
            }
            if (NIL != number_utilities.positive_number_p(ttfa)) {
                total_ttfa = Numbers.add(total_ttfa, ttfa);
            }
            if (NIL != number_utilities.positive_number_p(ttfs)) {
                total_ttfs = Numbers.add(total_ttfs, ttfs);
            }
            if (NIL != number_utilities.positive_number_p(sksi_call_count)) {
                total_sksi_call_count = Numbers.add(total_sksi_call_count, sksi_call_count);
            }
            if (NIL != number_utilities.positive_number_p(sksi_query_total_time)) {
                total_sksi = Numbers.add(total_sksi, sksi_query_total_time);
            }
            if (NIL != number_utilities.positive_number_p(total_time)) {
                total_total_time = Numbers.add(total_total_time, total_time);
            }
            PrintLow.format(stream, $str540$_5D__5_1F__7_1F_4D__7_1F__7_1F__7, new SubLObject[] { num, ttfs, ttfa, sksi_call_count, sksi_query_total_time, (NIL != number_utilities.positive_number_p(sksi_query_total_time)) ? Numbers.subtract(total_time, sksi_query_total_time) : total_time,
                    total_time, (NIL != number_utilities.positive_number_p(sksi_query_total_time)) ? number_utilities.percent(sksi_query_total_time, total_time, THREE_INTEGER) : ZERO_INTEGER, test, (halt_reason == $EXHAUST_TOTAL) ? $str161$ : PrintLow.format(NIL, $str542$___A_, halt_reason) });
            cdolist_list_var = cdolist_list_var.rest();
            kbq_run = cdolist_list_var.first();
        }
        PrintLow.format(stream, $str537$_________________________________);
        PrintLow.format(stream, $str543$_5D__5_1F__7_1F_4D__7_1F__7_1F__7, new SubLObject[] { total_num, total_ttfs, total_ttfa, total_sksi_call_count, total_sksi, (NIL != number_utilities.positive_number_p(total_sksi)) ? Numbers.subtract(total_total_time, total_sksi) : total_total_time,
                total_total_time, (NIL != number_utilities.positive_number_p(total_sksi)) ? number_utilities.percent(total_sksi, total_total_time, THREE_INTEGER) : ZERO_INTEGER });
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 185500L)
    public static SubLObject kbq_benchmark_report_for_test(SubLObject filename, SubLObject test_fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject query_set_run = kbq_load_query_set_run(filename);
        SubLObject comment = kbq_query_set_run_comment(query_set_run);
        SubLObject short_filename = list_utilities.last_one(string_utilities.string_tokenize(string_utilities.post_remove(filename, $str406$_cfasl, UNPROVIDED), $list544, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject one_line_comment = string_utilities.string_first_n($int$60,
                Strings.string_trim(cons(Characters.CHAR_asterisk, string_utilities.whitespace_chars()), string_utilities.string_tokenize(comment, list(string_utilities.$new_line_string$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first()));
        SubLObject cdolist_list_var = kbq_query_set_run_query_runs(query_set_run);
        SubLObject kbq_run = NIL;
        kbq_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject query = kbq_query_run_query(kbq_run);
            SubLObject test = (NIL != nart_handles.valid_nartP(query, UNPROVIDED)) ? cycl_utilities.nat_arg1(query, UNPROVIDED) : NIL;
            SubLObject num = kbq_extract_query_run_metric_value(kbq_run, $ANSWER_COUNT, ZERO_INTEGER);
            SubLObject sksi_start_times = kbq_extract_query_run_metric_value(kbq_run, $SKSI_QUERY_START_TIMES, ZERO_INTEGER);
            SubLObject sksi_call_count = sksi_start_times.isCons() ? Sequences.length(sksi_start_times) : NIL;
            SubLObject ttfs = sksi_start_times.isCons() ? sksi_start_times.first() : NIL;
            SubLObject ttfa = kbq_extract_query_run_metric_value(kbq_run, $TIME_TO_FIRST_ANSWER, ZERO_INTEGER);
            SubLObject sksi_query_total_time = kbq_extract_query_run_metric_value(kbq_run, $SKSI_QUERY_TOTAL_TIME, ZERO_INTEGER);
            SubLObject total_time = kbq_extract_query_run_metric_value(kbq_run, $TOTAL_TIME, ZERO_INTEGER);
            if (test_fort.equal(test)) {
                PrintLow.format(stream, $str546$_15A___5D__5_1F__7_1F_4D__7_1F__7,
                        new SubLObject[] { short_filename, num, ttfs, ttfa, sksi_call_count, sksi_query_total_time, (NIL != number_utilities.positive_number_p(sksi_query_total_time)) ? Numbers.subtract(total_time, sksi_query_total_time) : total_time, total_time,
                                (NIL != number_utilities.positive_number_p(sksi_query_total_time)) ? number_utilities.percent(sksi_query_total_time, total_time, THREE_INTEGER) : ZERO_INTEGER, one_line_comment });
                streams_high.force_output(T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            kbq_run = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 187400L)
    public static SubLObject kct_run_support_set(SubLObject kct_filename) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kct_result = kct_load_test_set_run(kct_filename);
        SubLObject result_set = set.new_set(Symbols.symbol_function(EQL), UNPROVIDED);
        SubLObject list_var;
        SubLObject test_runs = list_var = conses_high.getf(kct_result, $TEST_RUNS, UNPROVIDED);
        SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((NIL != PrintLow.format(NIL, $str547$Running__A_queries_using__proof_s, Sequences.length(test_runs))) ? PrintLow.format(NIL, $str547$Running__A_queries_using__proof_s, Sequences.length(test_runs)) : $str170$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject test_run = NIL;
                test_run = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject query_run = conses_high.getf(test_run, $QUERY_RUN, UNPROVIDED);
                    SubLObject query = conses_high.getf(query_run, $QUERY, UNPROVIDED);
                    SubLObject proof_spec = conses_high.getf(query_run, $INFERENCE_PROOF_SPEC, UNPROVIDED);
                    SubLObject overriding_query_properties = NIL;
                    SubLObject _prev_bind_0_$86 = control_vars.$kbq_run_query_non_continuable_enabledP$.currentBinding(thread);
                    try {
                        control_vars.$kbq_run_query_non_continuable_enabledP$.bind(NIL, thread);
                        if (NIL != proof_spec) {
                            overriding_query_properties = conses_high.putf(overriding_query_properties, $PROOF_SPEC, proof_spec);
                        }
                        overriding_query_properties = conses_high.putf(overriding_query_properties, $COMPUTE_ANSWER_JUSTIFICATIONS_, T);
                        overriding_query_properties = conses_high.putf(overriding_query_properties, $CONTINUABLE_, T);
                        thread.resetMultipleValues();
                        SubLObject inference = kbq_run_query_and_maybe_destroy(query, NIL, $kbq_outlier_timeout$.getDynamicValue(thread), overriding_query_properties, UNPROVIDED);
                        SubLObject never_runP = thread.secondMultipleValue();
                        SubLObject timed_outP = thread.thirdMultipleValue();
                        SubLObject result = thread.fourthMultipleValue();
                        SubLObject halt_reason = thread.fifthMultipleValue();
                        SubLObject metric_values = thread.sixthMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != inference) {
                            SubLObject cdolist_list_var = inference_utilities.inference_expanded_justification(inference);
                            SubLObject support = NIL;
                            support = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                set.set_add(support, result_set);
                                cdolist_list_var = cdolist_list_var.rest();
                                support = cdolist_list_var.first();
                            }
                        }
                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                    } finally {
                        control_vars.$kbq_run_query_non_continuable_enabledP$.rebind(_prev_bind_0_$86, thread);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    test_run = csome_list_var.first();
                }
            } finally {
                SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                }
            }
        } finally {
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

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 189000L)
    public static SubLObject kct_run_supports_report(SubLObject kct_filename, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kct_result = kct_load_test_set_run(kct_filename);
        SubLObject list_var;
        SubLObject test_runs = list_var = conses_high.getf(kct_result, $TEST_RUNS, UNPROVIDED);
        SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((NIL != PrintLow.format(NIL, $str547$Running__A_queries_using__proof_s, Sequences.length(test_runs))) ? PrintLow.format(NIL, $str547$Running__A_queries_using__proof_s, Sequences.length(test_runs)) : $str170$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject test_run = NIL;
                test_run = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject test = conses_high.getf(test_run, $TEST, UNPROVIDED);
                    SubLObject query_run = conses_high.getf(test_run, $QUERY_RUN, UNPROVIDED);
                    SubLObject query = conses_high.getf(query_run, $QUERY, UNPROVIDED);
                    SubLObject proof_spec = conses_high.getf(query_run, $INFERENCE_PROOF_SPEC, UNPROVIDED);
                    SubLObject overriding_query_properties = NIL;
                    SubLObject _prev_bind_0_$88 = control_vars.$kbq_run_query_non_continuable_enabledP$.currentBinding(thread);
                    try {
                        control_vars.$kbq_run_query_non_continuable_enabledP$.bind(NIL, thread);
                        if (NIL != proof_spec) {
                            overriding_query_properties = conses_high.putf(overriding_query_properties, $PROOF_SPEC, proof_spec);
                        }
                        overriding_query_properties = conses_high.putf(overriding_query_properties, $COMPUTE_ANSWER_JUSTIFICATIONS_, T);
                        overriding_query_properties = conses_high.putf(overriding_query_properties, $CONTINUABLE_, T);
                        thread.resetMultipleValues();
                        SubLObject inference = kbq_run_query_and_maybe_destroy(query, NIL, $kbq_outlier_timeout$.getDynamicValue(thread), overriding_query_properties, UNPROVIDED);
                        SubLObject never_runP = thread.secondMultipleValue();
                        SubLObject timed_outP = thread.thirdMultipleValue();
                        SubLObject result = thread.fourthMultipleValue();
                        SubLObject halt_reason = thread.fifthMultipleValue();
                        SubLObject metric_values = thread.sixthMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == inference) {
                        }
                        if (NIL != inference && !inference_datastructures_inference.inference_answer_count(inference).isZero()) {
                            PrintLow.format(stream, $str550$______Test___A, kb_utilities.pretty_print_cycl_to_string(test, UNPROVIDED));
                            PrintLow.format(stream, $str551$__Query___A, kb_utilities.pretty_print_cycl_to_string(kb_query.kbq_sentence(query), UNPROVIDED));
                            SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
                            SubLObject answer_number = ONE_INTEGER;
                            SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                                SubLObject idx_$89 = idx;
                                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$89, $SKIP)) {
                                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$89);
                                    SubLObject backwardP_var = NIL;
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
                                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                                        v_answer = Vectors.aref(vector_var, id);
                                        if (NIL == id_index.id_index_tombstone_p(v_answer) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                            if (NIL != id_index.id_index_tombstone_p(v_answer)) {
                                                v_answer = $SKIP;
                                            }
                                            answer_values = bindings.bindings_values(inference_datastructures_inference.inference_answer_bindings(v_answer));
                                            v_answer_$90 = ((NIL != list_utilities.singletonP(answer_values)) ? answer_values.first() : ((NIL != answer_values) ? answer_values : $$True));
                                            PrintLow.format(stream, $str553$____Answer___A__A____A, new SubLObject[] { answer_number, answer_count, kb_utilities.pretty_print_cycl_to_string(v_answer_$90, UNPROVIDED) });
                                            PrintLow.format(stream, $str554$__Justification__);
                                            supports = inference_utilities.inference_answer_expanded_justification(v_answer);
                                            supports = Sequences.remove_if($sym555$UNKNOWN_SENTENCE_SUPPORT_P, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            support_mts = Sort.sort(list_utilities.fast_remove_duplicates(Mapping.mapcar($sym556$SUPPORT_MT, supports), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym557$GENERALITY_ESTIMATE_, UNPROVIDED);
                                            support_mts = (cdolist_list_var = Sequences.remove($$UniversalVocabularyMt, support_mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            support_mt = NIL;
                                            support_mt = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                PrintLow.format(stream, $str559$___Mt___A, kb_utilities.pretty_print_cycl_to_string(support_mt, UNPROVIDED));
                                                cdolist_list_var_$91 = supports;
                                                support = NIL;
                                                support = cdolist_list_var_$91.first();
                                                while (NIL != cdolist_list_var_$91) {
                                                    if (NIL != kb_utilities.kbeq(support_mt, arguments.support_mt(support)) || (NIL != kb_utilities.kbeq(arguments.support_mt(support), $$UniversalVocabularyMt) && NIL != kb_utilities.kbeq(support_mt, $$BaseKB))) {
                                                        PrintLow.format(stream, $str195$_A, kb_utilities.pretty_print_cycl_to_string(arguments.support_el_sentence(support), ONE_INTEGER));
                                                    }
                                                    cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                    support = cdolist_list_var_$91.first();
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                support_mt = cdolist_list_var.first();
                                            }
                                            answer_number = Numbers.add(answer_number, ONE_INTEGER);
                                        }
                                    }
                                }
                                SubLObject idx_$90 = idx;
                                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$90)) {
                                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$90);
                                    SubLObject id2 = NIL;
                                    SubLObject v_answer2 = NIL;
                                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                    try {
                                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                            id2 = Hashtables.getEntryKey(cdohash_entry);
                                            v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                                            SubLObject answer_values2 = bindings.bindings_values(inference_datastructures_inference.inference_answer_bindings(v_answer2));
                                            SubLObject v_answer_$91 = (NIL != list_utilities.singletonP(answer_values2)) ? answer_values2.first() : ((NIL != answer_values2) ? answer_values2 : $$True);
                                            PrintLow.format(stream, $str553$____Answer___A__A____A, new SubLObject[] { answer_number, answer_count, kb_utilities.pretty_print_cycl_to_string(v_answer_$91, UNPROVIDED) });
                                            PrintLow.format(stream, $str554$__Justification__);
                                            SubLObject supports2 = inference_utilities.inference_answer_expanded_justification(v_answer2);
                                            supports2 = Sequences.remove_if($sym555$UNKNOWN_SENTENCE_SUPPORT_P, supports2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            SubLObject support_mts2 = Sort.sort(list_utilities.fast_remove_duplicates(Mapping.mapcar($sym556$SUPPORT_MT, supports2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym557$GENERALITY_ESTIMATE_, UNPROVIDED);
                                            SubLObject cdolist_list_var2;
                                            support_mts2 = (cdolist_list_var2 = Sequences.remove($$UniversalVocabularyMt, support_mts2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            SubLObject support_mt2 = NIL;
                                            support_mt2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                PrintLow.format(stream, $str559$___Mt___A, kb_utilities.pretty_print_cycl_to_string(support_mt2, UNPROVIDED));
                                                SubLObject cdolist_list_var_$92 = supports2;
                                                SubLObject support2 = NIL;
                                                support2 = cdolist_list_var_$92.first();
                                                while (NIL != cdolist_list_var_$92) {
                                                    if (NIL != kb_utilities.kbeq(support_mt2, arguments.support_mt(support2)) || (NIL != kb_utilities.kbeq(arguments.support_mt(support2), $$UniversalVocabularyMt) && NIL != kb_utilities.kbeq(support_mt2, $$BaseKB))) {
                                                        PrintLow.format(stream, $str195$_A, kb_utilities.pretty_print_cycl_to_string(arguments.support_el_sentence(support2), ONE_INTEGER));
                                                    }
                                                    cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                                    support2 = cdolist_list_var_$92.first();
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                support_mt2 = cdolist_list_var2.first();
                                            }
                                            answer_number = Numbers.add(answer_number, ONE_INTEGER);
                                        }
                                    } finally {
                                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                            inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                        }
                    } finally {
                        control_vars.$kbq_run_query_non_continuable_enabledP$.rebind(_prev_bind_0_$88, thread);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    test_run = csome_list_var.first();
                }
            } finally {
                SubLObject _prev_bind_0_$89 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                }
            }
        } finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192100L)
    public static SubLObject unknown_sentence_support_p(SubLObject support) {
        return makeBoolean(NIL != arguments.hl_support_p(support) && NIL != el_utilities.el_formula_with_operator_p(arguments.support_el_sentence(support), $$unknownSentence));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192200L)
    public static SubLObject kcts_using_only_these_sksi_sources(SubLObject v_sources) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kcts = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym562$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject node_var = $$SKSIContentTest;
            SubLObject _prev_bind_0_$96 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            SubLObject _prev_bind_1_$97 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$98 = node_var;
                    SubLObject deck_type = $STACK;
                    SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject _prev_bind_0_$97 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            SubLObject tv_var = NIL;
                            SubLObject _prev_bind_0_$98 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            SubLObject _prev_bind_1_$98 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym567$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str568$_A_is_not_a__A, tv_var, $sym569$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str571$continue_anyway, $str568$_A_is_not_a__A, tv_var, $sym569$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else if (pcase_var.eql($WARN)) {
                                        Errors.warn($str568$_A_is_not_a__A, tv_var, $sym569$SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str573$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($str571$continue_anyway, $str568$_A_is_not_a__A, tv_var, $sym569$SBHL_TRUE_TV_P);
                                    }
                                }
                                SubLObject _prev_bind_0_$99 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                SubLObject _prev_bind_1_$99 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                        SubLObject _prev_bind_0_$100 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        SubLObject _prev_bind_1_$100 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        SubLObject _prev_bind_2_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(
                                                    sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$98, UNPROVIDED);
                                            while (NIL != node_var_$98) {
                                                SubLObject tt_node_var = node_var_$98;
                                                SubLObject cdolist_list_var;
                                                SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    SubLObject _prev_bind_0_$101 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_$101 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                                (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                            iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            SubLObject _prev_bind_0_$102 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$110;
                                                                                for (iteration_state_$110 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                        iteration_state_$110); iteration_state_$110 = dictionary_contents.do_dictionary_contents_next(iteration_state_$110)) {
                                                                                    thread.resetMultipleValues();
                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$110);
                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        SubLObject _prev_bind_0_$103 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject kct;
                                                                                                SubLObject query;
                                                                                                SubLObject required_sources;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object,
                                                                                                        set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    kct = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, kct)
                                                                                                            && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(kct, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        query = kct_utils.kct_query_specification(kct, UNPROVIDED);
                                                                                                        required_sources = (NIL != query) ? kb_mapping_utilities.pred_values(query, $$sksiModulesNeeded, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                                                                        if (NIL != conses_high.subsetp(required_sources, v_sources, UNPROVIDED, UNPROVIDED)) {
                                                                                                            kcts = ConsesLow.cons(kct, kcts);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject kct2 = NIL;
                                                                                                kct2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(kct2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        SubLObject query2 = kct_utils.kct_query_specification(kct2, UNPROVIDED);
                                                                                                        SubLObject required_sources2 = (NIL != query2) ? kb_mapping_utilities.pred_values(query2, $$sksiModulesNeeded, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                                                                        if (NIL != conses_high.subsetp(required_sources2, v_sources, UNPROVIDED, UNPROVIDED)) {
                                                                                                            kcts = ConsesLow.cons(kct2, kcts);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    kct2 = csome_list_var.first();
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str574$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$103, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$110);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$102, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str575$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list576);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list576);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list576);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            SubLObject _prev_bind_0_$104 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    SubLObject _prev_bind_0_$105 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        SubLObject sol;
                                                                                        SubLObject link_nodes2 = sol = ConsesLow.list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject kct;
                                                                                            SubLObject query;
                                                                                            SubLObject required_sources;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object,
                                                                                                    set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                kct = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, kct) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(kct, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    query = kct_utils.kct_query_specification(kct, UNPROVIDED);
                                                                                                    required_sources = (NIL != query) ? kb_mapping_utilities.pred_values(query, $$sksiModulesNeeded, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                                                                    if (NIL != conses_high.subsetp(required_sources, v_sources, UNPROVIDED, UNPROVIDED)) {
                                                                                                        kcts = ConsesLow.cons(kct, kcts);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$114 = sol;
                                                                                            SubLObject kct2 = NIL;
                                                                                            kct2 = csome_list_var_$114.first();
                                                                                            while (NIL != csome_list_var_$114) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(kct2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    SubLObject query2 = kct_utils.kct_query_specification(kct2, UNPROVIDED);
                                                                                                    SubLObject required_sources2 = (NIL != query2) ? kb_mapping_utilities.pred_values(query2, $$sksiModulesNeeded, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                                                                    if (NIL != conses_high.subsetp(required_sources2, v_sources, UNPROVIDED, UNPROVIDED)) {
                                                                                                        kcts = ConsesLow.cons(kct2, kcts);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$114 = csome_list_var_$114.rest();
                                                                                                kct2 = csome_list_var_$114.first();
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str574$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$105, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$104, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, $list576);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$115;
                                                            SubLObject new_list = cdolist_list_var_$115 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                    ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)),
                                                                            sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread),
                                                                            sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$115.first();
                                                            while (NIL != cdolist_list_var_$115) {
                                                                SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    SubLObject sol2;
                                                                    SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject kct3;
                                                                        SubLObject query3;
                                                                        SubLObject required_sources3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2,
                                                                                set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            kct3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, kct3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(kct3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                query3 = kct_utils.kct_query_specification(kct3, UNPROVIDED);
                                                                                required_sources3 = (NIL != query3) ? kb_mapping_utilities.pred_values(query3, $$sksiModulesNeeded, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                                                if (NIL != conses_high.subsetp(required_sources3, v_sources, UNPROVIDED, UNPROVIDED)) {
                                                                                    kcts = cons(kct3, kcts);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject kct4 = NIL;
                                                                        kct4 = csome_list_var3.first();
                                                                        while (NIL != csome_list_var3) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kct4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(kct4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                SubLObject query4 = kct_utils.kct_query_specification(kct4, UNPROVIDED);
                                                                                SubLObject required_sources4 = (NIL != query4) ? kb_mapping_utilities.pred_values(query4, $$sksiModulesNeeded, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                                                if (NIL != conses_high.subsetp(required_sources4, v_sources, UNPROVIDED, UNPROVIDED)) {
                                                                                    kcts = cons(kct4, kcts);
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            kct4 = csome_list_var3.first();
                                                                        }
                                                                    } else {
                                                                        Errors.error($str574$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$106, thread);
                                                                }
                                                                cdolist_list_var_$115 = cdolist_list_var_$115.rest();
                                                                generating_fn = cdolist_list_var_$115.first();
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$101, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$101, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    SubLObject _prev_bind_0_$107 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_$102 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                                (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        SubLObject node2 = function_terms.naut_to_nart(node_var_$98);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                            iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            SubLObject _prev_bind_0_$108 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$111;
                                                                                for (iteration_state_$111 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                        iteration_state_$111); iteration_state_$111 = dictionary_contents.do_dictionary_contents_next(iteration_state_$111)) {
                                                                                    thread.resetMultipleValues();
                                                                                    SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$111);
                                                                                    SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        SubLObject _prev_bind_0_$109 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3,
                                                                                                        set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else if (sol3.isList()) {
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
                                                                                                Errors.error($str574$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$109, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$111);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$108, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str575$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$116;
                                                            SubLObject new_list2 = cdolist_list_var_$116 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                    ? list_utilities.randomize_list(
                                                                            sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$116.first();
                                                            while (NIL != cdolist_list_var_$116) {
                                                                SubLObject _prev_bind_0_$110 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    SubLObject sol4;
                                                                    SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4,
                                                                                set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else if (sol4.isList()) {
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
                                                                        Errors.error($str574$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$110, thread);
                                                                }
                                                                cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                                                                generating_fn2 = cdolist_list_var_$116.first();
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$102, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$107, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$98 = deck.deck_pop(recur_deck);
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$106, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$100, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$100, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str577$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$99, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$99, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$98, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$98, thread);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$111 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$97, thread);
                    }
                } finally {
                    SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$97, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$96, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(kcts);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192200L)
    public static SubLObject kcts_for_sksi_source(SubLObject source) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kcts = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym562$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject pred_var = $$sksiModulesNeeded;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, TWO_INTEGER, pred_var)) {
                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$126 = NIL;
                            SubLObject token_var_$127 = NIL;
                            while (NIL == done_var_$126) {
                                SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$127);
                                SubLObject valid_$128 = makeBoolean(!token_var_$127.eql(gaf));
                                if (NIL != valid_$128) {
                                    SubLObject query_spec = assertions_high.gaf_arg1(gaf);
                                    SubLObject cdolist_list_var = kct_utils.query_specification_kcts(query_spec, UNPROVIDED);
                                    SubLObject kct = NIL;
                                    kct = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if (NIL != isa.isaP(kct, $$SKSIContentTest, UNPROVIDED, UNPROVIDED)) {
                                            kcts = cons(kct, kcts);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        kct = cdolist_list_var.first();
                                    }
                                }
                                done_var_$126 = makeBoolean(NIL == valid_$128);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
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
        return Sequences.nreverse(kcts);
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192200L)
    public static SubLObject succeeding_kcts_for_sksi_source(SubLObject test_set_run, SubLObject source) {
        return kct_test_set_run_tests(kct_succeeding_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192200L)
    public static SubLObject failing_kcts_for_sksi_source(SubLObject test_set_run, SubLObject source) {
        return kct_test_set_run_tests(kct_failing_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192200L)
    public static SubLObject answerable_kcts_for_sksi_source(SubLObject test_set_run, SubLObject source) {
        return kct_test_set_run_tests(kct_answerable_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192200L)
    public static SubLObject unanswerable_kcts_for_sksi_source(SubLObject test_set_run, SubLObject source) {
        return kct_test_set_run_tests(kct_unanswerable_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192200L)
    public static SubLObject erroring_kcts_for_sksi_source(SubLObject test_set_run, SubLObject source) {
        return kct_test_set_run_tests(kct_erroring_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), UNPROVIDED)));
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192200L)
    public static SubLObject show_errors_for_sksi_source(SubLObject test_set_run, SubLObject source) {
        SubLObject cdolist_list_var = kct_test_set_run_test_runs(kct_erroring_test_set_run(kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), UNPROVIDED)));
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            PrintLow.format(T, $str579$_a___s____, kct_test_run_test(test_run), kbq_query_run_halt_reason(kct_test_run_query_run(test_run)));
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 192200L)
    public static SubLObject analyze_sksi_test_set_run(SubLObject test_set_run, SubLObject sksi_sources_we_care_about) {
        PrintLow.format(T, $str580$__________Overview___________All_);
        list_utilities.pretty_print_plist(kct_analyze_test_set_run(test_set_run, UNPROVIDED), UNPROVIDED);
        PrintLow.format(T, $str581$__All___SKSIContentTests_marked_a);
        SubLObject regression_test_set_run = kct_regression_test_set_run(test_set_run);
        list_utilities.pretty_print_plist(kct_analyze_test_set_run(regression_test_set_run, UNPROVIDED), UNPROVIDED);
        SubLObject care_test_set_run = kct_filter_test_set_run_to_tests(test_set_run, kcts_using_only_these_sksi_sources(sksi_sources_we_care_about), UNPROVIDED);
        PrintLow.format(T, $str582$____SKSIContentTests_using_source, sksi_sources_we_care_about);
        list_utilities.pretty_print_plist(kct_analyze_test_set_run(care_test_set_run, UNPROVIDED), UNPROVIDED);
        SubLObject regression_care_test_set_run = kct_regression_test_set_run(care_test_set_run);
        PrintLow.format(T, $str583$____SKSIContentTests_marked_as___);
        list_utilities.pretty_print_plist(kct_analyze_test_set_run(regression_care_test_set_run, UNPROVIDED), UNPROVIDED);
        PrintLow.format(T, $str584$______________________Breakdown_b);
        SubLObject cdolist_list_var = sksi_sources_we_care_about;
        SubLObject source = NIL;
        source = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject source_test_set_run = kct_filter_test_set_run_to_tests(test_set_run, kcts_for_sksi_source(source), UNPROVIDED);
            SubLObject analysis = trim_analysis_if_zero(kct_analyze_test_set_run(source_test_set_run, inference_datastructures_enumerated_types.all_arete_query_metrics()));
            SubLObject regression_source_test_set_run = kct_filter_test_set_run_by_test(source_test_set_run, $str244$Filtered_to___KBContentRegression, $sym243$KB_CONTENT_REGRESSION_TEST_, $sym110$KCT_TEST_RUN_TEST);
            SubLObject regression_tests_analysis = trim_analysis_if_zero(kct_analyze_test_set_run(regression_source_test_set_run, inference_datastructures_enumerated_types.all_arete_query_metrics()));
            PrintLow.format(T, $str585$_a__, source);
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Sequences.length(string_utilities.str(source)), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
                PrintLow.format(T, $str586$_);
            }
            PrintLow.format(T, $str587$______SKSIContentTests_that_use__, source);
            list_utilities.pretty_print_plist(analysis, UNPROVIDED);
            PrintLow.format(T, $str588$____SKSIContentTests_marked_as___, source);
            list_utilities.pretty_print_plist(regression_tests_analysis, UNPROVIDED);
            PrintLow.format(T, $str589$__Failure_analysis_______);
            cdolist_list_var = cdolist_list_var.rest();
            source = cdolist_list_var.first();
        }
        return NIL;
    }

    public static SubLObject declare_kbq_query_run_file() {
        declareFunction("kct_success_result_p", "KCT-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction("kct_failure_result_p", "KCT-FAILURE-RESULT-P", 1, 0, false);
        declareFunction("kct_error_result_p", "KCT-ERROR-RESULT-P", 1, 0, false);
        declareFunction("kbq_cfasl_common_symbols", "KBQ-CFASL-COMMON-SYMBOLS", 0, 0, false);
        declareFunction("kbq_cfasl_common_symbols_simple", "KBQ-CFASL-COMMON-SYMBOLS-SIMPLE", 0, 0, false);
        declareMacro("with_kbq_query_set_run", "WITH-KBQ-QUERY-SET-RUN");
        declareFunction("kbq_query_run_p", "KBQ-QUERY-RUN-P", 1, 0, false);
        declareFunction("kbq_discard_query_run_result", "KBQ-DISCARD-QUERY-RUN-RESULT", 1, 0, false);
        declareFunction("kbq_discard_query_run_properties", "KBQ-DISCARD-QUERY-RUN-PROPERTIES", 2, 0, false);
        declareFunction("kbq_query_run_query", "KBQ-QUERY-RUN-QUERY", 1, 0, false);
        declareFunction("kbq_query_run_result", "KBQ-QUERY-RUN-RESULT", 1, 0, false);
        declareFunction("kbq_extract_query_run_metric_value", "KBQ-EXTRACT-QUERY-RUN-METRIC-VALUE", 2, 1, false);
        declareFunction("kbq_query_run_answerableP", "KBQ-QUERY-RUN-ANSWERABLE?", 1, 0, false);
        declareFunction("kbq_query_run_unanswerableP", "KBQ-QUERY-RUN-UNANSWERABLE?", 1, 0, false);
        declareFunction("kbq_query_run_answer_count", "KBQ-QUERY-RUN-ANSWER-COUNT", 1, 0, false);
        declareFunction("kbq_query_run_hypothesization_time", "KBQ-QUERY-RUN-HYPOTHESIZATION-TIME", 1, 0, false);
        declareFunction("kbq_query_run_total_time", "KBQ-QUERY-RUN-TOTAL-TIME", 1, 0, false);
        declareFunction("kbq_query_run_complete_total_time", "KBQ-QUERY-RUN-COMPLETE-TOTAL-TIME", 1, 0, false);
        declareFunction("kbq_query_run_time_to_first_answer", "KBQ-QUERY-RUN-TIME-TO-FIRST-ANSWER", 1, 0, false);
        declareFunction("kbq_query_run_time_to_last_answer", "KBQ-QUERY-RUN-TIME-TO-LAST-ANSWER", 1, 0, false);
        declareFunction("kbq_query_run_complete_time_to_first_answer", "KBQ-QUERY-RUN-COMPLETE-TIME-TO-FIRST-ANSWER", 1, 0, false);
        declareFunction("kbq_query_run_complete_time_to_last_answer", "KBQ-QUERY-RUN-COMPLETE-TIME-TO-LAST-ANSWER", 1, 0, false);
        declareFunction("kbq_query_run_total_steps", "KBQ-QUERY-RUN-TOTAL-STEPS", 1, 0, false);
        declareFunction("kbq_query_run_steps_to_first_answer", "KBQ-QUERY-RUN-STEPS-TO-FIRST-ANSWER", 1, 0, false);
        declareFunction("kbq_query_run_steps_to_last_answer", "KBQ-QUERY-RUN-STEPS-TO-LAST-ANSWER", 1, 0, false);
        declareFunction("kbq_extract_query_run_property_value", "KBQ-EXTRACT-QUERY-RUN-PROPERTY-VALUE", 2, 0, false);
        declareFunction("kbq_query_run_property_value", "KBQ-QUERY-RUN-PROPERTY-VALUE", 2, 1, false);
        declareFunction("kbq_internal_real_time_to_seconds", "KBQ-INTERNAL-REAL-TIME-TO-SECONDS", 1, 0, false);
        declareFunction("kbq_seconds_to_internal_real_time", "KBQ-SECONDS-TO-INTERNAL-REAL-TIME", 1, 0, false);
        declareFunction("kbq_query_run_halt_reason", "KBQ-QUERY-RUN-HALT-REASON", 1, 0, false);
        declareFunction("kbq_query_run_timed_outP", "KBQ-QUERY-RUN-TIMED-OUT?", 1, 0, false);
        declareFunction("kbq_query_run_tautologyP", "KBQ-QUERY-RUN-TAUTOLOGY?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_less_than_1000_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-1000-SECONDS?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_less_than_100_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-100-SECONDS?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_less_than_10_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-10-SECONDS?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_less_than_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-A-SECOND?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_less_than_a_tenth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-A-TENTH-OF-A-SECOND?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_less_than_a_hundredth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-A-HUNDREDTH-OF-A-SECOND?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_more_than_1000_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-1000-SECONDS?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_more_than_100_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-100-SECONDS?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_more_than_10_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-10-SECONDS?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_more_than_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-A-SECOND?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_more_than_a_tenth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-A-TENTH-OF-A-SECOND?", 1, 0, false);
        declareFunction("kbq_query_run_total_time_more_than_a_hundredth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-A-HUNDREDTH-OF-A-SECOND?", 1, 0, false);
        declareFunction("kbq_query_run_more_than_1000_answersP", "KBQ-QUERY-RUN-MORE-THAN-1000-ANSWERS?", 1, 0, false);
        declareFunction("kbq_query_run_inference_proof_spec_cons_count", "KBQ-QUERY-RUN-INFERENCE-PROOF-SPEC-CONS-COUNT", 1, 0, false);
        declareFunction("kbq_sentence_truth_query_runP", "KBQ-SENTENCE-TRUTH-QUERY-RUN?", 1, 0, false);
        declareFunction("compute_new_root_relative_answer_times", "COMPUTE-NEW-ROOT-RELATIVE-ANSWER-TIMES", 2, 0, false);
        declareFunction("kct_test_run_p", "KCT-TEST-RUN-P", 1, 0, false);
        declareFunction("kct_make_test_run", "KCT-MAKE-TEST-RUN", 3, 0, false);
        declareFunction("kct_test_run_test", "KCT-TEST-RUN-TEST", 1, 0, false);
        declareFunction("kct_test_run_query_run", "KCT-TEST-RUN-QUERY-RUN", 1, 0, false);
        declareFunction("kct_test_run_status", "KCT-TEST-RUN-STATUS", 1, 0, false);
        declareFunction("kct_test_run_answer_count", "KCT-TEST-RUN-ANSWER-COUNT", 1, 0, false);
        declareFunction("kbq_query_set_run_p", "KBQ-QUERY-SET-RUN-P", 1, 0, false);
        declareFunction("kbq_make_query_set_run", "KBQ-MAKE-QUERY-SET-RUN", 1, 1, false);
        declareFunction("kbq_nmerge_query_set_runs", "KBQ-NMERGE-QUERY-SET-RUNS", 1, 1, false);
        declareFunction("kbq_discard_query_set_run_results", "KBQ-DISCARD-QUERY-SET-RUN-RESULTS", 1, 0, false);
        declareFunction("kbq_discard_query_set_run_properties", "KBQ-DISCARD-QUERY-SET-RUN-PROPERTIES", 2, 0, false);
        declareFunction("kbq_make_query_set_run_from_test_set_run", "KBQ-MAKE-QUERY-SET-RUN-FROM-TEST-SET-RUN", 1, 0, false);
        declareFunction("kbq_query_set_run_property_value", "KBQ-QUERY-SET-RUN-PROPERTY-VALUE", 2, 1, false);
        declareFunction("kbq_query_set_run_comment", "KBQ-QUERY-SET-RUN-COMMENT", 1, 0, false);
        declareFunction("kbq_query_set_run_query_runs", "KBQ-QUERY-SET-RUN-QUERY-RUNS", 1, 0, false);
        declareFunction("kbq_query_set_run_patch_level", "KBQ-QUERY-SET-RUN-PATCH-LEVEL", 1, 0, false);
        declareFunction("kbq_query_set_run_internal_time_units_per_second", "KBQ-QUERY-SET-RUN-INTERNAL-TIME-UNITS-PER-SECOND", 1, 0, false);
        declareFunction("kbq_query_set_run_put_query_run_property", "KBQ-QUERY-SET-RUN-PUT-QUERY-RUN-PROPERTY", 3, 0, false);
        declareFunction("kbq_extract_query_property_values", "KBQ-EXTRACT-QUERY-PROPERTY-VALUES", 2, 0, false);
        declareFunction("kbq_extract_metric_values", "KBQ-EXTRACT-METRIC-VALUES", 2, 1, false);
        declareFunction("kbq_extract_property_values", "KBQ-EXTRACT-PROPERTY-VALUES", 2, 1, false);
        declareFunction("kbq_query_set_run_queries", "KBQ-QUERY-SET-RUN-QUERIES", 1, 0, false);
        declareFunction("kbq_query_set_run_query_count", "KBQ-QUERY-SET-RUN-QUERY-COUNT", 1, 0, false);
        declareFunction("kbq_query_set_run_valid_queries", "KBQ-QUERY-SET-RUN-VALID-QUERIES", 1, 0, false);
        declareFunction("kbq_query_set_run_runnable_queries", "KBQ-QUERY-SET-RUN-RUNNABLE-QUERIES", 1, 0, false);
        declareFunction("kbq_query_set_run_remove_invalid_queries", "KBQ-QUERY-SET-RUN-REMOVE-INVALID-QUERIES", 1, 0, false);
        declareFunction("kbq_query_set_run_remove_unrunnable_queries", "KBQ-QUERY-SET-RUN-REMOVE-UNRUNNABLE-QUERIES", 1, 0, false);
        declareFunction("kbq_compute_pad_table", "KBQ-COMPUTE-PAD-TABLE", 1, 0, false);
        declareFunction("kbq_queries_within_n_of_median", "KBQ-QUERIES-WITHIN-N-OF-MEDIAN", 2, 1, false);
        declareFunction("kbq_median_metric", "KBQ-MEDIAN-METRIC", 1, 0, false);
        declareFunction("kbq_mean_metric", "KBQ-MEAN-METRIC", 1, 0, false);
        declareFunction("kbq_function_for_metric", "KBQ-FUNCTION-FOR-METRIC", 1, 0, false);
        declareFunction("kct_test_set_run_p", "KCT-TEST-SET-RUN-P", 1, 0, false);
        declareFunction("kct_make_test_set_run", "KCT-MAKE-TEST-SET-RUN", 1, 1, false);
        declareFunction("kct_nmerge_test_set_runs", "KCT-NMERGE-TEST-SET-RUNS", 1, 1, false);
        declareFunction("kct_test_set_run_comment", "KCT-TEST-SET-RUN-COMMENT", 1, 0, false);
        declareFunction("kct_test_set_run_internal_time_units_per_second", "KCT-TEST-SET-RUN-INTERNAL-TIME-UNITS-PER-SECOND", 1, 0, false);
        declareFunction("kct_test_set_run_test_runs", "KCT-TEST-SET-RUN-TEST-RUNS", 1, 0, false);
        declareFunction("kct_test_set_run_tests", "KCT-TEST-SET-RUN-TESTS", 1, 0, false);
        declareFunction("kct_test_set_run_valid_tests", "KCT-TEST-SET-RUN-VALID-TESTS", 1, 0, false);
        declareFunction("kct_test_set_run_remove_invalid_tests", "KCT-TEST-SET-RUN-REMOVE-INVALID-TESTS", 1, 0, false);
        declareFunction("kbq_run_query", "KBQ-RUN-QUERY", 1, 5, false);
        declareFunction("abort_kbq_run_query", "ABORT-KBQ-RUN-QUERY", 0, 0, false);
        declareFunction("kbq_run_query_and_maybe_destroy", "KBQ-RUN-QUERY-AND-MAYBE-DESTROY", 4, 1, false);
        declareFunction("kbq_run_query_problem_store", "KBQ-RUN-QUERY-PROBLEM-STORE", 1, 1, false);
        declareFunction("kbq_run_query_int", "KBQ-RUN-QUERY-INT", 3, 1, false);
        declareFunction("ensure_sksi_modules_needed", "ENSURE-SKSI-MODULES-NEEDED", 1, 0, false);
        declareFunction("ensure_only_sksi_modules_needed", "ENSURE-ONLY-SKSI-MODULES-NEEDED", 1, 0, false);
        declareFunction("sksi_modules_needed", "SKSI-MODULES-NEEDED", 1, 0, false);
        declareFunction("query_sksi_modules_needed", "QUERY-SKSI-MODULES-NEEDED", 1, 0, false);
        declareFunction("any_kct_followup_test_formula_gafsP", "ANY-KCT-FOLLOWUP-TEST-FORMULA-GAFS?", 1, 0, false);
        declareFunction("kct_run_test", "KCT-RUN-TEST", 1, 5, false);
        declareFunction("kb_test_metrics_to_query_metrics", "KB-TEST-METRICS-TO-QUERY-METRICS", 1, 0, false);
        declareFunction("kb_test_metric_to_query_metric", "KB-TEST-METRIC-TO-QUERY-METRIC", 1, 0, false);
        declareFunction("kct_compute_test_status", "KCT-COMPUTE-TEST-STATUS", 3, 0, false);
        declareFunction("kct_compute_janus_test_status", "KCT-COMPUTE-JANUS-TEST-STATUS", 2, 0, false);
        declareFunction("kct_followup_test_formula_all_holdsP", "KCT-FOLLOWUP-TEST-FORMULA-ALL-HOLDS?", 7, 0, false);
        declareFunction("kct_followup_test_formula_some_holdsP", "KCT-FOLLOWUP-TEST-FORMULA-SOME-HOLDS?", 6, 0, false);
        declareFunction("kct_followup_test_formula_none_holdsP", "KCT-FOLLOWUP-TEST-FORMULA-NONE-HOLDS?", 6, 0, false);
        declareFunction("kct_followup_test_formula_result", "KCT-FOLLOWUP-TEST-FORMULA-RESULT", 6, 0, false);
        declareFunction("kct_test_query_results_satisfy_exact_set_of_binding_sets", "KCT-TEST-QUERY-RESULTS-SATISFY-EXACT-SET-OF-BINDING-SETS", 3, 0, false);
        declareFunction("kct_test_query_results_satisfy_wanted_binding_sets", "KCT-TEST-QUERY-RESULTS-SATISFY-WANTED-BINDING-SETS", 3, 0, false);
        declareFunction("kct_test_query_results_satisfy_unwanted_binding_sets", "KCT-TEST-QUERY-RESULTS-SATISFY-UNWANTED-BINDING-SETS", 3, 0, false);
        declareFunction("kct_test_query_results_satisfy_binding_sets_cardinality", "KCT-TEST-QUERY-RESULTS-SATISFY-BINDING-SETS-CARDINALITY", 2, 0, false);
        declareFunction("kct_test_query_results_satisfy_binding_sets_min_cardinality", "KCT-TEST-QUERY-RESULTS-SATISFY-BINDING-SETS-MIN-CARDINALITY", 2, 0, false);
        declareFunction("kct_test_query_results_satisfy_binding_sets_max_cardinality", "KCT-TEST-QUERY-RESULTS-SATISFY-BINDING-SETS-MAX-CARDINALITY", 2, 0, false);
        declareFunction("kct_test_query_results_satisfy_best_multiple_choice_option", "KCT-TEST-QUERY-RESULTS-SATISFY-BEST-MULTIPLE-CHOICE-OPTION", 2, 0, false);
        declareFunction("why_kct_failure", "WHY-KCT-FAILURE", 3, 0, false);
        declareFunction("why_kct_multiple_choice_option_failure", "WHY-KCT-MULTIPLE-CHOICE-OPTION-FAILURE", 2, 0, false);
        declareFunction("why_kct_binding_cardinality_failure", "WHY-KCT-BINDING-CARDINALITY-FAILURE", 2, 0, false);
        declareFunction("why_kct_binding_match_failure", "WHY-KCT-BINDING-MATCH-FAILURE", 3, 0, false);
        declareFunction("kct_format_binding_sets_list", "KCT-FORMAT-BINDING-SETS-LIST", 1, 0, false);
        declareFunction("kbq_run_query_set", "KBQ-RUN-QUERY-SET", 1, 12, false);
        declareFunction("abort_kbq_run_query_set", "ABORT-KBQ-RUN-QUERY-SET", 0, 0, false);
        declareFunction("kbq_query_spec_set_elements", "KBQ-QUERY-SPEC-SET-ELEMENTS", 1, 2, false);
        declareFunction("sort_queries_by_sksi_modules_needed", "SORT-QUERIES-BY-SKSI-MODULES-NEEDED", 1, 0, false);
        declareFunction("sort_tests_by_sksi_modules_needed", "SORT-TESTS-BY-SKSI-MODULES-NEEDED", 1, 0, false);
        declareFunction("sort_terms_by_sksi_modules_needed", "SORT-TERMS-BY-SKSI-MODULES-NEEDED", 2, 0, false);
        declareFunction("sksi_modules_needed_sorted_memoized_internal", "SKSI-MODULES-NEEDED-SORTED-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("sksi_modules_needed_sorted_memoized", "SKSI-MODULES-NEEDED-SORTED-MEMOIZED", 1, 0, false);
        declareFunction("query_sksi_modules_needed_sorted_memoized_internal", "QUERY-SKSI-MODULES-NEEDED-SORTED-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("query_sksi_modules_needed_sorted_memoized", "QUERY-SKSI-MODULES-NEEDED-SORTED-MEMOIZED", 1, 0, false);
        declareFunction("all_instantiations_via_inference", "ALL-INSTANTIATIONS-VIA-INFERENCE", 2, 0, false);
        declareFunction("kbq_test_collection_to_query_set", "KBQ-TEST-COLLECTION-TO-QUERY-SET", 1, 0, false);
        declareFunction("run_kbq_query_spec_set_and_process_inferences", "RUN-KBQ-QUERY-SPEC-SET-AND-PROCESS-INFERENCES", 2, 1, false);
        declareFunction("run_kbq_and_process_inferences", "RUN-KBQ-AND-PROCESS-INFERENCES", 3, 0, false);
        declareFunction("run_kbq_and_generate_inferences", "RUN-KBQ-AND-GENERATE-INFERENCES", 3, 0, false);
        declareFunction("process_all_kbq_inferences", "PROCESS-ALL-KBQ-INFERENCES", 4, 0, false);
        declareFunction("kct_run_test_set", "KCT-RUN-TEST-SET", 1, 13, false);
        declareFunction("abort_kct_run_test_set", "ABORT-KCT-RUN-TEST-SET", 0, 0, false);
        declareFunction("kct_test_spec_set_elements", "KCT-TEST-SPEC-SET-ELEMENTS", 1, 2, false);
        declareMacro("run_kbq_experiment", "RUN-KBQ-EXPERIMENT");
        declareFunction("last_query_set_run", "LAST-QUERY-SET-RUN", 0, 0, false);
        declareFunction("run_kbq_experiment_internal", "RUN-KBQ-EXPERIMENT-INTERNAL", 1, 0, false);
        declareFunction("print_kbq_experiment_analysis_to_file", "PRINT-KBQ-EXPERIMENT-ANALYSIS-TO-FILE", 3, 0, false);
        declareFunction("kbq_erroring_queries", "KBQ-ERRORING-QUERIES", 1, 0, false);
        declareFunction("kbq_erroring_query_count", "KBQ-ERRORING-QUERY-COUNT", 1, 0, false);
        declareFunction("kbq_count_erroring_query_runs", "KBQ-COUNT-ERRORING-QUERY-RUNS", 1, 0, false);
        declareFunction("kbq_erroring_query_runP", "KBQ-ERRORING-QUERY-RUN?", 1, 0, false);
        declareFunction("kbq_if_file_exists_handling_p", "KBQ-IF-FILE-EXISTS-HANDLING-P", 1, 0, false);
        declareFunction("kbq_experiment_augmentability_status", "KBQ-EXPERIMENT-AUGMENTABILITY-STATUS", 2, 0, false);
        declareFunction("kbq_setup_file_handling", "KBQ-SETUP-FILE-HANDLING", 3, 0, false);
        declareFunction("kbq_queries_not_yet_run", "KBQ-QUERIES-NOT-YET-RUN", 2, 0, false);
        declareFunction("kbq_compute_rerun_errors_filename", "KBQ-COMPUTE-RERUN-ERRORS-FILENAME", 1, 0, false);
        declareFunction("kbq_candidate_rerun_errors_filename", "KBQ-CANDIDATE-RERUN-ERRORS-FILENAME", 2, 0, false);
        declareFunction("kbq_load_query_set_run_and_merge_reruns", "KBQ-LOAD-QUERY-SET-RUN-AND-MERGE-RERUNS", 1, 0, false);
        declareFunction("kbq_merge_query_set_run_with_rerun", "KBQ-MERGE-QUERY-SET-RUN-WITH-RERUN", 2, 0, false);
        declareMacro("run_kct_experiment", "RUN-KCT-EXPERIMENT");
        declareFunction("run_kct_experiment_internal", "RUN-KCT-EXPERIMENT-INTERNAL", 1, 0, false);
        declareFunction("print_kct_experiment_analysis_to_file", "PRINT-KCT-EXPERIMENT-ANALYSIS-TO-FILE", 4, 0, false);
        declareFunction("print_experiment_csv_to_file", "PRINT-EXPERIMENT-CSV-TO-FILE", 2, 0, false);
        declareFunction("kct_erroring_tests", "KCT-ERRORING-TESTS", 1, 0, false);
        declareFunction("kct_erroring_test_count", "KCT-ERRORING-TEST-COUNT", 1, 0, false);
        declareFunction("kct_count_erroring_test_runs", "KCT-COUNT-ERRORING-TEST-RUNS", 1, 0, false);
        declareFunction("kct_erroring_test_runP", "KCT-ERRORING-TEST-RUN?", 1, 0, false);
        declareFunction("kct_setup_file_handling", "KCT-SETUP-FILE-HANDLING", 3, 0, false);
        declareFunction("kct_tests_not_yet_run", "KCT-TESTS-NOT-YET-RUN", 2, 0, false);
        declareFunction("kct_compute_rerun_errors_filename", "KCT-COMPUTE-RERUN-ERRORS-FILENAME", 1, 0, false);
        declareFunction("kct_candidate_rerun_errors_filename", "KCT-CANDIDATE-RERUN-ERRORS-FILENAME", 2, 0, false);
        declareFunction("kct_load_test_set_run_and_merge_reruns", "KCT-LOAD-TEST-SET-RUN-AND-MERGE-RERUNS", 1, 0, false);
        declareFunction("kct_merge_test_set_run_with_rerun", "KCT-MERGE-TEST-SET-RUN-WITH-RERUN", 2, 0, false);
        declareFunction("kbq_runstate_validP", "KBQ-RUNSTATE-VALID?", 0, 0, false);
        declareFunction("kbq_runstate_inference_already_setP", "KBQ-RUNSTATE-INFERENCE-ALREADY-SET?", 0, 0, false);
        declareFunction("set_kbq_runstate_inference", "SET-KBQ-RUNSTATE-INFERENCE", 1, 0, false);
        declareFunction("possibly_set_kbq_runstate_inference", "POSSIBLY-SET-KBQ-RUNSTATE-INFERENCE", 1, 0, false);
        declareFunction("find_kbq_runstate_by_id", "FIND-KBQ-RUNSTATE-BY-ID", 1, 0, false);
        declareFunction("find_kbq_runstate_by_id_string", "FIND-KBQ-RUNSTATE-BY-ID-STRING", 1, 0, false);
        declareFunction("find_kct_runstate_by_id", "FIND-KCT-RUNSTATE-BY-ID", 1, 0, false);
        declareFunction("find_kct_runstate_by_id_string", "FIND-KCT-RUNSTATE-BY-ID-STRING", 1, 0, false);
        declareFunction("find_kct_set_runstate_by_id", "FIND-KCT-SET-RUNSTATE-BY-ID", 1, 0, false);
        declareFunction("find_kct_set_runstate_by_id_string", "FIND-KCT-SET-RUNSTATE-BY-ID-STRING", 1, 0, false);
        declareFunction("next_runstate_id", "NEXT-RUNSTATE-ID", 0, 0, false);
        declareFunction("runstate_add_object", "RUNSTATE-ADD-OBJECT", 2, 0, false);
        declareFunction("runstate_rem_object", "RUNSTATE-REM-OBJECT", 1, 0, false);
        declareFunction("runstate_find_object_by_id", "RUNSTATE-FIND-OBJECT-BY-ID", 1, 0, false);
        declareFunction("runstate_constant", "RUNSTATE-CONSTANT", 1, 0, false);
        declareFunction("runstate_result_status", "RUNSTATE-RESULT-STATUS", 1, 0, false);
        declareFunction("runstate_result_text", "RUNSTATE-RESULT-TEXT", 1, 0, false);
        declareFunction("runstate_run_status", "RUNSTATE-RUN-STATUS", 1, 0, false);
        declareFunction("runstate_inference", "RUNSTATE-INFERENCE", 1, 0, false);
        declareFunction("runstate_start", "RUNSTATE-START", 1, 0, false);
        declareFunction("runstate_end", "RUNSTATE-END", 1, 0, false);
        declareFunction("set_runstate_run_status", "SET-RUNSTATE-RUN-STATUS", 2, 0, false);
        declareFunction("destroy_runstate", "DESTROY-RUNSTATE", 1, 0, false);
        declareFunction("kbq_runstate_print_function_trampoline", "KBQ-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kbq_runstate_p", "KBQ-RUNSTATE-P", 1, 0, false);
        new $kbq_runstate_p$UnaryFunction();
        declareFunction("kbqr_id", "KBQR-ID", 1, 0, false);
        declareFunction("kbqr_lock", "KBQR-LOCK", 1, 0, false);
        declareFunction("kbqr_query_spec", "KBQR-QUERY-SPEC", 1, 0, false);
        declareFunction("kbqr_inference", "KBQR-INFERENCE", 1, 0, false);
        declareFunction("kbqr_result", "KBQR-RESULT", 1, 0, false);
        declareFunction("kbqr_test_runstate", "KBQR-TEST-RUNSTATE", 1, 0, false);
        declareFunction("kbqr_run_status", "KBQR-RUN-STATUS", 1, 0, false);
        declareFunction("_csetf_kbqr_id", "_CSETF-KBQR-ID", 2, 0, false);
        declareFunction("_csetf_kbqr_lock", "_CSETF-KBQR-LOCK", 2, 0, false);
        declareFunction("_csetf_kbqr_query_spec", "_CSETF-KBQR-QUERY-SPEC", 2, 0, false);
        declareFunction("_csetf_kbqr_inference", "_CSETF-KBQR-INFERENCE", 2, 0, false);
        declareFunction("_csetf_kbqr_result", "_CSETF-KBQR-RESULT", 2, 0, false);
        declareFunction("_csetf_kbqr_test_runstate", "_CSETF-KBQR-TEST-RUNSTATE", 2, 0, false);
        declareFunction("_csetf_kbqr_run_status", "_CSETF-KBQR-RUN-STATUS", 2, 0, false);
        declareFunction("make_kbq_runstate", "MAKE-KBQ-RUNSTATE", 0, 1, false);
        declareFunction("visit_defstruct_kbq_runstate", "VISIT-DEFSTRUCT-KBQ-RUNSTATE", 2, 0, false);
        declareFunction("visit_defstruct_object_kbq_runstate_method", "VISIT-DEFSTRUCT-OBJECT-KBQ-RUNSTATE-METHOD", 2, 0, false);
        declareFunction("new_kbq_runstate", "NEW-KBQ-RUNSTATE", 2, 0, false);
        declareFunction("destroy_kbq_runstate", "DESTROY-KBQ-RUNSTATE", 1, 0, false);
        declareFunction("kbq_runstate_query_spec", "KBQ-RUNSTATE-QUERY-SPEC", 1, 0, false);
        declareFunction("kbq_runstate_lock", "KBQ-RUNSTATE-LOCK", 1, 0, false);
        declareFunction("kbq_runstate_inference", "KBQ-RUNSTATE-INFERENCE", 1, 0, false);
        declareFunction("kbq_runstate_result", "KBQ-RUNSTATE-RESULT", 1, 0, false);
        declareFunction("kbq_runstate_test_runstate", "KBQ-RUNSTATE-TEST-RUNSTATE", 1, 0, false);
        declareFunction("kbq_runstate_run_status", "KBQ-RUNSTATE-RUN-STATUS", 1, 0, false);
        declareFunction("set_kbqr_inference", "SET-KBQR-INFERENCE", 2, 0, false);
        declareFunction("set_kbqr_result", "SET-KBQR-RESULT", 2, 0, false);
        declareFunction("set_kbqr_run_status", "SET-KBQR-RUN-STATUS", 2, 0, false);
        declareFunction("possibly_set_kbqr_run_status", "POSSIBLY-SET-KBQR-RUN-STATUS", 2, 0, false);
        declareFunction("kct_runstate_print_function_trampoline", "KCT-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kct_runstate_p", "KCT-RUNSTATE-P", 1, 0, false);
        new $kct_runstate_p$UnaryFunction();
        declareFunction("kctr_id", "KCTR-ID", 1, 0, false);
        declareFunction("kctr_lock", "KCTR-LOCK", 1, 0, false);
        declareFunction("kctr_test_spec", "KCTR-TEST-SPEC", 1, 0, false);
        declareFunction("kctr_result", "KCTR-RESULT", 1, 0, false);
        declareFunction("kctr_query_runstate", "KCTR-QUERY-RUNSTATE", 1, 0, false);
        declareFunction("kctr_test_set_runstate", "KCTR-TEST-SET-RUNSTATE", 1, 0, false);
        declareFunction("kctr_run_status", "KCTR-RUN-STATUS", 1, 0, false);
        declareFunction("kctr_start", "KCTR-START", 1, 0, false);
        declareFunction("kctr_end", "KCTR-END", 1, 0, false);
        declareFunction("_csetf_kctr_id", "_CSETF-KCTR-ID", 2, 0, false);
        declareFunction("_csetf_kctr_lock", "_CSETF-KCTR-LOCK", 2, 0, false);
        declareFunction("_csetf_kctr_test_spec", "_CSETF-KCTR-TEST-SPEC", 2, 0, false);
        declareFunction("_csetf_kctr_result", "_CSETF-KCTR-RESULT", 2, 0, false);
        declareFunction("_csetf_kctr_query_runstate", "_CSETF-KCTR-QUERY-RUNSTATE", 2, 0, false);
        declareFunction("_csetf_kctr_test_set_runstate", "_CSETF-KCTR-TEST-SET-RUNSTATE", 2, 0, false);
        declareFunction("_csetf_kctr_run_status", "_CSETF-KCTR-RUN-STATUS", 2, 0, false);
        declareFunction("_csetf_kctr_start", "_CSETF-KCTR-START", 2, 0, false);
        declareFunction("_csetf_kctr_end", "_CSETF-KCTR-END", 2, 0, false);
        declareFunction("make_kct_runstate", "MAKE-KCT-RUNSTATE", 0, 1, false);
        declareFunction("visit_defstruct_kct_runstate", "VISIT-DEFSTRUCT-KCT-RUNSTATE", 2, 0, false);
        declareFunction("visit_defstruct_object_kct_runstate_method", "VISIT-DEFSTRUCT-OBJECT-KCT-RUNSTATE-METHOD", 2, 0, false);
        declareFunction("new_kct_runstate", "NEW-KCT-RUNSTATE", 1, 1, false);
        declareFunction("destroy_kct_runstate", "DESTROY-KCT-RUNSTATE", 1, 0, false);
        declareFunction("kct_runstate_test_spec", "KCT-RUNSTATE-TEST-SPEC", 1, 0, false);
        declareFunction("kct_runstate_lock", "KCT-RUNSTATE-LOCK", 1, 0, false);
        declareFunction("kct_runstate_result", "KCT-RUNSTATE-RESULT", 1, 0, false);
        declareFunction("kct_runstate_query_runstate", "KCT-RUNSTATE-QUERY-RUNSTATE", 1, 0, false);
        declareFunction("kct_runstate_test_set_runstate", "KCT-RUNSTATE-TEST-SET-RUNSTATE", 1, 0, false);
        declareFunction("kct_runstate_inference", "KCT-RUNSTATE-INFERENCE", 1, 0, false);
        declareFunction("kct_runstate_result_status", "KCT-RUNSTATE-RESULT-STATUS", 1, 0, false);
        declareFunction("kct_runstate_failure_explanation", "KCT-RUNSTATE-FAILURE-EXPLANATION", 1, 0, false);
        declareFunction("kct_runstate_metric_value", "KCT-RUNSTATE-METRIC-VALUE", 2, 0, false);
        declareFunction("kct_runstate_run_status", "KCT-RUNSTATE-RUN-STATUS", 1, 0, false);
        declareFunction("kct_runstate_start", "KCT-RUNSTATE-START", 1, 0, false);
        declareFunction("kct_runstate_end", "KCT-RUNSTATE-END", 1, 0, false);
        declareFunction("set_kctr_result", "SET-KCTR-RESULT", 2, 0, false);
        declareFunction("set_kctr_query_runstate", "SET-KCTR-QUERY-RUNSTATE", 2, 0, false);
        declareFunction("set_kctr_test_set_runstate", "SET-KCTR-TEST-SET-RUNSTATE", 2, 0, false);
        declareFunction("set_kctr_run_status", "SET-KCTR-RUN-STATUS", 2, 0, false);
        declareFunction("set_kctr_start", "SET-KCTR-START", 1, 1, false);
        declareFunction("set_kctr_end", "SET-KCTR-END", 1, 1, false);
        declareFunction("kct_set_runstate_print_function_trampoline", "KCT-SET-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kct_set_runstate_p", "KCT-SET-RUNSTATE-P", 1, 0, false);
        new $kct_set_runstate_p$UnaryFunction();
        declareFunction("kctsr_id", "KCTSR-ID", 1, 0, false);
        declareFunction("kctsr_lock", "KCTSR-LOCK", 1, 0, false);
        declareFunction("kctsr_test_set", "KCTSR-TEST-SET", 1, 0, false);
        declareFunction("kctsr_result", "KCTSR-RESULT", 1, 0, false);
        declareFunction("kctsr_test_runstates", "KCTSR-TEST-RUNSTATES", 1, 0, false);
        declareFunction("kctsr_run_status", "KCTSR-RUN-STATUS", 1, 0, false);
        declareFunction("kctsr_start", "KCTSR-START", 1, 0, false);
        declareFunction("kctsr_end", "KCTSR-END", 1, 0, false);
        declareFunction("_csetf_kctsr_id", "_CSETF-KCTSR-ID", 2, 0, false);
        declareFunction("_csetf_kctsr_lock", "_CSETF-KCTSR-LOCK", 2, 0, false);
        declareFunction("_csetf_kctsr_test_set", "_CSETF-KCTSR-TEST-SET", 2, 0, false);
        declareFunction("_csetf_kctsr_result", "_CSETF-KCTSR-RESULT", 2, 0, false);
        declareFunction("_csetf_kctsr_test_runstates", "_CSETF-KCTSR-TEST-RUNSTATES", 2, 0, false);
        declareFunction("_csetf_kctsr_run_status", "_CSETF-KCTSR-RUN-STATUS", 2, 0, false);
        declareFunction("_csetf_kctsr_start", "_CSETF-KCTSR-START", 2, 0, false);
        declareFunction("_csetf_kctsr_end", "_CSETF-KCTSR-END", 2, 0, false);
        declareFunction("make_kct_set_runstate", "MAKE-KCT-SET-RUNSTATE", 0, 1, false);
        declareFunction("visit_defstruct_kct_set_runstate", "VISIT-DEFSTRUCT-KCT-SET-RUNSTATE", 2, 0, false);
        declareFunction("visit_defstruct_object_kct_set_runstate_method", "VISIT-DEFSTRUCT-OBJECT-KCT-SET-RUNSTATE-METHOD", 2, 0, false);
        declareFunction("new_kct_set_runstate", "NEW-KCT-SET-RUNSTATE", 1, 0, false);
        declareFunction("destroy_kct_set_runstate", "DESTROY-KCT-SET-RUNSTATE", 1, 0, false);
        declareFunction("kct_set_runstate_test_set", "KCT-SET-RUNSTATE-TEST-SET", 1, 0, false);
        declareFunction("kct_set_runstate_lock", "KCT-SET-RUNSTATE-LOCK", 1, 0, false);
        declareFunction("kct_set_runstate_result", "KCT-SET-RUNSTATE-RESULT", 1, 0, false);
        declareFunction("kct_set_runstate_test_runstates", "KCT-SET-RUNSTATE-TEST-RUNSTATES", 1, 0, false);
        declareFunction("kct_set_runstate_result_status", "KCT-SET-RUNSTATE-RESULT-STATUS", 1, 0, false);
        declareFunction("kct_set_runstate_run_status", "KCT-SET-RUNSTATE-RUN-STATUS", 1, 0, false);
        declareFunction("kct_set_runstate_start", "KCT-SET-RUNSTATE-START", 1, 0, false);
        declareFunction("kct_set_runstate_end", "KCT-SET-RUNSTATE-END", 1, 0, false);
        declareFunction("set_kctsr_result", "SET-KCTSR-RESULT", 2, 0, false);
        declareFunction("kctsr_test_runstate_add", "KCTSR-TEST-RUNSTATE-ADD", 2, 0, false);
        declareFunction("kctsr_test_runstate_remove", "KCTSR-TEST-RUNSTATE-REMOVE", 2, 0, false);
        declareFunction("set_kctsr_run_status", "SET-KCTSR-RUN-STATUS", 2, 0, false);
        declareFunction("set_kctsr_start", "SET-KCTSR-START", 1, 1, false);
        declareFunction("set_kctsr_end", "SET-KCTSR-END", 1, 1, false);
        declareFunction("kbq_save_query_set_run", "KBQ-SAVE-QUERY-SET-RUN", 2, 0, false);
        declareFunction("kct_save_test_set_run", "KCT-SAVE-TEST-SET-RUN", 2, 0, false);
        declareFunction("kbq_save_query_set_run_without_results", "KBQ-SAVE-QUERY-SET-RUN-WITHOUT-RESULTS", 2, 0, false);
        declareFunction("kbq_open_query_set_run_output_stream", "KBQ-OPEN-QUERY-SET-RUN-OUTPUT-STREAM", 1, 1, false);
        declareFunction("kct_open_test_set_run_output_stream", "KCT-OPEN-TEST-SET-RUN-OUTPUT-STREAM", 1, 1, false);
        declareFunction("kbq_save_query_set_run_preamble", "KBQ-SAVE-QUERY-SET-RUN-PREAMBLE", 1, 1, false);
        declareFunction("kct_save_test_set_run_preamble", "KCT-SAVE-TEST-SET-RUN-PREAMBLE", 1, 1, false);
        declareFunction("kbq_save_query_run", "KBQ-SAVE-QUERY-RUN", 2, 0, false);
        declareFunction("kct_save_test_run", "KCT-SAVE-TEST-RUN", 2, 0, false);
        declareMacro("do_query_set_run", "DO-QUERY-SET-RUN");
        declareMacro("do_query_set_run_query_runs", "DO-QUERY-SET-RUN-QUERY-RUNS");
        declareFunction("kbq_load_query_set_run", "KBQ-LOAD-QUERY-SET-RUN", 1, 0, false);
        declareFunction("kbq_load_query_set_run_int", "KBQ-LOAD-QUERY-SET-RUN-INT", 1, 0, false);
        declareFunction("kbq_load_query_run_int", "KBQ-LOAD-QUERY-RUN-INT", 1, 0, false);
        declareFunction("kbq_query_set_run_nmerge_query_runs", "KBQ-QUERY-SET-RUN-NMERGE-QUERY-RUNS", 2, 0, false);
        declareFunction("kct_load_test_set_run", "KCT-LOAD-TEST-SET-RUN", 1, 0, false);
        declareFunction("kct_test_set_run_nmerge_test_runs", "KCT-TEST-SET-RUN-NMERGE-TEST-RUNS", 2, 0, false);
        declareFunction("kbq_nclean_query_set_run", "KBQ-NCLEAN-QUERY-SET-RUN", 1, 0, false);
        declareFunction("kct_nclean_test_set_run", "KCT-NCLEAN-TEST-SET-RUN", 1, 0, false);
        declareFunction("kbq_nclean_query_run", "KBQ-NCLEAN-QUERY-RUN", 1, 0, false);
        declareFunction("kbq_strip_results_from_query_set_run_file", "KBQ-STRIP-RESULTS-FROM-QUERY-SET-RUN-FILE", 1, 1, false);
        declareFunction("kbq_strip_suffix_from_filename", "KBQ-STRIP-SUFFIX-FROM-FILENAME", 1, 0, false);
        declareFunction("kct_strip_suffix_from_filename", "KCT-STRIP-SUFFIX-FROM-FILENAME", 1, 0, false);
        declareFunction("kbq_filter_query_set_run_by_property_value", "KBQ-FILTER-QUERY-SET-RUN-BY-PROPERTY-VALUE", 4, 1, false);
        declareFunction("kbq_filter_query_set_run_by_test", "KBQ-FILTER-QUERY-SET-RUN-BY-TEST", 3, 1, false);
        declareFunction("kct_filter_test_set_run_by_test", "KCT-FILTER-TEST-SET-RUN-BY-TEST", 3, 1, false);
        declareFunction("kbq_answerable_query_set_run", "KBQ-ANSWERABLE-QUERY-SET-RUN", 1, 0, false);
        declareFunction("kct_answerable_test_set_run", "KCT-ANSWERABLE-TEST-SET-RUN", 1, 0, false);
        declareFunction("kct_succeeding_test_set_run", "KCT-SUCCEEDING-TEST-SET-RUN", 1, 0, false);
        declareFunction("kbq_unanswerable_query_set_run", "KBQ-UNANSWERABLE-QUERY-SET-RUN", 1, 0, false);
        declareFunction("kct_unanswerable_test_set_run", "KCT-UNANSWERABLE-TEST-SET-RUN", 1, 0, false);
        declareFunction("kct_failing_test_set_run", "KCT-FAILING-TEST-SET-RUN", 1, 0, false);
        declareFunction("kct_erroring_test_set_run", "KCT-ERRORING-TEST-SET-RUN", 1, 0, false);
        declareFunction("kct_common_sense_test_set_run", "KCT-COMMON-SENSE-TEST-SET-RUN", 1, 0, false);
        declareFunction("kct_regression_test_set_run", "KCT-REGRESSION-TEST-SET-RUN", 1, 0, false);
        declareFunction("kct_subcollection_test_set_run", "KCT-SUBCOLLECTION-TEST-SET-RUN", 2, 0, false);
        declareFunction("kct_failing_tests", "KCT-FAILING-TESTS", 1, 0, false);
        declareFunction("kct_succeeding_tests", "KCT-SUCCEEDING-TESTS", 1, 0, false);
        declareFunction("kct_answerable_tests", "KCT-ANSWERABLE-TESTS", 1, 0, false);
        declareFunction("kct_unanswerable_tests", "KCT-UNANSWERABLE-TESTS", 1, 0, false);
        declareFunction("kct_newly_failing_tests", "KCT-NEWLY-FAILING-TESTS", 2, 0, false);
        declareFunction("kbq_same_property_value_queries", "KBQ-SAME-PROPERTY-VALUE-QUERIES", 3, 2, false);
        declareFunction("kbq_mutually_answerable_queries", "KBQ-MUTUALLY-ANSWERABLE-QUERIES", 1, 0, false);
        declareFunction("kbq_mutually_unanswerable_queries", "KBQ-MUTUALLY-UNANSWERABLE-QUERIES", 1, 0, false);
        declareFunction("kbq_fast_queries", "KBQ-FAST-QUERIES", 1, 1, false);
        declareFunction("kct_mutually_succeeding_tests", "KCT-MUTUALLY-SUCCEEDING-TESTS", 1, 0, false);
        declareFunction("kct_mutually_failing_tests", "KCT-MUTUALLY-FAILING-TESTS", 1, 0, false);
        declareFunction("kbq_mutually_answerable_query_set_runs", "KBQ-MUTUALLY-ANSWERABLE-QUERY-SET-RUNS", 2, 0, false);
        declareFunction("kbq_mutually_unanswerable_query_set_runs", "KBQ-MUTUALLY-UNANSWERABLE-QUERY-SET-RUNS", 2, 0, false);
        declareFunction("kbq_query_set_runs_common_queries", "KBQ-QUERY-SET-RUNS-COMMON-QUERIES", 1, 0, false);
        declareFunction("kbq_common_queries_query_set_runs", "KBQ-COMMON-QUERIES-QUERY-SET-RUNS", 1, 0, false);
        declareFunction("kbq_common_queries_two_query_set_runs", "KBQ-COMMON-QUERIES-TWO-QUERY-SET-RUNS", 2, 0, false);
        declareFunction("kct_common_tests_test_set_runs", "KCT-COMMON-TESTS-TEST-SET-RUNS", 1, 0, false);
        declareFunction("kct_mutually_succeeding_test_set_runs", "KCT-MUTUALLY-SUCCEEDING-TEST-SET-RUNS", 2, 0, false);
        declareFunction("kct_mutually_failing_test_set_runs", "KCT-MUTUALLY-FAILING-TEST-SET-RUNS", 2, 0, false);
        declareFunction("kbq_same_answer_count_query_set_runs", "KBQ-SAME-ANSWER-COUNT-QUERY-SET-RUNS", 2, 0, false);
        declareFunction("kbq_different_answer_count_query_set_runs", "KBQ-DIFFERENT-ANSWER-COUNT-QUERY-SET-RUNS", 2, 0, false);
        declareFunction("kbq_filter_to_queries_int", "KBQ-FILTER-TO-QUERIES-INT", 3, 0, false);
        declareFunction("kbq_filter_query_set_run_to_queries_lambda", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-LAMBDA", 1, 0, false);
        declareFunction("kbq_filter_query_set_run_to_queries_not_lambda", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-NOT-LAMBDA", 1, 0, false);
        declareFunction("kbq_filter_query_set_run_to_queries", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES", 2, 1, false);
        declareFunction("kct_filter_test_set_run_to_tests_lambda", "KCT-FILTER-TEST-SET-RUN-TO-TESTS-LAMBDA", 1, 0, false);
        declareFunction("kct_filter_test_set_run_to_tests_not_lambda", "KCT-FILTER-TEST-SET-RUN-TO-TESTS-NOT-LAMBDA", 1, 0, false);
        declareFunction("kct_filter_test_set_run_to_tests", "KCT-FILTER-TEST-SET-RUN-TO-TESTS", 2, 1, false);
        declareFunction("kbq_filter_query_set_run_to_query_collection", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERY-COLLECTION", 2, 1, false);
        declareFunction("kct_filter_test_set_run_to_test_collection", "KCT-FILTER-TEST-SET-RUN-TO-TEST-COLLECTION", 2, 1, false);
        declareFunction("clear_cached_all_instances_among", "CLEAR-CACHED-ALL-INSTANCES-AMONG", 0, 0, false);
        new $clear_cached_all_instances_among$ZeroArityFunction();
        declareFunction("remove_cached_all_instances_among", "REMOVE-CACHED-ALL-INSTANCES-AMONG", 3, 0, false);
        declareFunction("cached_all_instances_among_internal", "CACHED-ALL-INSTANCES-AMONG-INTERNAL", 3, 0, false);
        declareFunction("cached_all_instances_among", "CACHED-ALL-INSTANCES-AMONG", 3, 0, false);
        declareFunction("kbq_queries_common_to_all_query_set_runs", "KBQ-QUERIES-COMMON-TO-ALL-QUERY-SET-RUNS", 1, 0, false);
        declareFunction("kct_tests_common_to_all_test_set_runs", "KCT-TESTS-COMMON-TO-ALL-TEST-SET-RUNS", 1, 0, false);
        declareFunction("kct_consistently_succeeding_tests", "KCT-CONSISTENTLY-SUCCEEDING-TESTS", 1, 0, false);
        declareFunction("kct_consistently_succeeding_test_set_runs", "KCT-CONSISTENTLY-SUCCEEDING-TEST-SET-RUNS", 1, 0, false);
        declareFunction("queries_that_became_unanswerable", "QUERIES-THAT-BECAME-UNANSWERABLE", 2, 0, false);
        declareFunction("queries_that_changed_answer_count", "QUERIES-THAT-CHANGED-ANSWER-COUNT", 2, 0, false);
        declareFunction("kbq_query_runs_with_worst_slowdown", "KBQ-QUERY-RUNS-WITH-WORST-SLOWDOWN", 2, 2, false);
        declareFunction("kbq_query_runs_with_worst_slowdown_robust", "KBQ-QUERY-RUNS-WITH-WORST-SLOWDOWN-ROBUST", 2, 2, false);
        declareFunction("kbq_slowest_query_runs", "KBQ-SLOWEST-QUERY-RUNS", 1, 2, false);
        declareFunction("kct_slowest_test_runs", "KCT-SLOWEST-TEST-RUNS", 1, 2, false);
        declareFunction("kbq_compare_query_set_run_answers", "KBQ-COMPARE-QUERY-SET-RUN-ANSWERS", 2, 0, false);
        declareFunction("kbq_summarize_compare_query_set_run_answers", "KBQ-SUMMARIZE-COMPARE-QUERY-SET-RUN-ANSWERS", 2, 0, false);
        declareFunction("kbq_sort_query_runs", "KBQ-SORT-QUERY-RUNS", 2, 0, false);
        declareFunction("kbq_lookup_query_run", "KBQ-LOOKUP-QUERY-RUN", 2, 0, false);
        declareFunction("kbq_lookup_query_run_from_query_runs", "KBQ-LOOKUP-QUERY-RUN-FROM-QUERY-RUNS", 2, 0, false);
        declareFunction("kbq_lookup_query_runs", "KBQ-LOOKUP-QUERY-RUNS", 2, 0, false);
        declareFunction("kbq_query_equal", "KBQ-QUERY-EQUAL", 2, 0, false);
        declareFunction("kbq_compare_query_run_answers", "KBQ-COMPARE-QUERY-RUN-ANSWERS", 2, 0, false);
        declareFunction("kbq_compare_query_set_runs_by_property", "KBQ-COMPARE-QUERY-SET-RUNS-BY-PROPERTY", 3, 1, false);
        declareFunction("show_query_runs_that_became_unanswerable", "SHOW-QUERY-RUNS-THAT-BECAME-UNANSWERABLE", 2, 3, false);
        declareFunction("show_query_runs_that_changed_answer_count", "SHOW-QUERY-RUNS-THAT-CHANGED-ANSWER-COUNT", 2, 3, false);
        declareFunction("show_query_runs_int", "SHOW-QUERY-RUNS-INT", 6, 0, false);
        declareFunction("kbq_query_set_run_answerable_counts", "KBQ-QUERY-SET-RUN-ANSWERABLE-COUNTS", 2, 0, false);
        declareFunction("kct_compare_test_set_run_statuses", "KCT-COMPARE-TEST-SET-RUN-STATUSES", 2, 0, false);
        declareFunction("kct_summarize_compare_test_set_run_statuses", "KCT-SUMMARIZE-COMPARE-TEST-SET-RUN-STATUSES", 2, 0, false);
        declareFunction("kct_lookup_test_run", "KCT-LOOKUP-TEST-RUN", 2, 0, false);
        declareFunction("kct_test_equal", "KCT-TEST-EQUAL", 2, 0, false);
        declareFunction("kct_compare_test_run_statuses", "KCT-COMPARE-TEST-RUN-STATUSES", 2, 0, false);
        declareFunction("kbq_analyze_query_set_runs", "KBQ-ANALYZE-QUERY-SET-RUNS", 2, 1, false);
        declareFunction("kct_analyze_test_set_runs", "KCT-ANALYZE-TEST-SET-RUNS", 2, 1, false);
        declareFunction("kbq_compare_analysis", "KBQ-COMPARE-ANALYSIS", 2, 0, false);
        declareFunction("significant_digits_if_float", "SIGNIFICANT-DIGITS-IF-FLOAT", 2, 0, false);
        declareFunction("kbq_print_analysis", "KBQ-PRINT-ANALYSIS", 1, 0, false);
        declareFunction("kbq_analyze_query_set_run", "KBQ-ANALYZE-QUERY-SET-RUN", 1, 1, false);
        declareFunction("kct_analyze_test_set_run", "KCT-ANALYZE-TEST-SET-RUN", 1, 1, false);
        declareFunction("kbq_analyze_query_runs", "KBQ-ANALYZE-QUERY-RUNS", 2, 0, false);
        declareFunction("kbq_query_set_run_total_answerable", "KBQ-QUERY-SET-RUN-TOTAL-ANSWERABLE", 1, 0, false);
        declareFunction("kbq_query_set_run_last_query_from_file", "KBQ-QUERY-SET-RUN-LAST-QUERY-FROM-FILE", 1, 0, false);
        declareFunction("kbq_query_set_run_identify_probable_segfault_from_file", "KBQ-QUERY-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT-FROM-FILE", 2, 0, false);
        declareFunction("kbq_query_set_run_identify_probable_segfault", "KBQ-QUERY-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT", 2, 0, false);
        declareFunction("kbq_query_set_run_identify_probable_segfault_int", "KBQ-QUERY-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT-INT", 2, 0, false);
        declareFunction("kct_analyze_test_runs", "KCT-ANALYZE-TEST-RUNS", 2, 0, false);
        declareFunction("kct_test_set_run_identify_probable_segfault", "KCT-TEST-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT", 2, 0, false);
        declareFunction("analyze_kbq_experiments", "ANALYZE-KBQ-EXPERIMENTS", 2, 5, false);
        declareFunction("kbq_non_lumpy_query_set_run", "KBQ-NON-LUMPY-QUERY-SET-RUN", 1, 0, false);
        declareFunction("kbq_lumpy_queries", "KBQ-LUMPY-QUERIES", 1, 0, false);
        declareFunction("kbq_lumpy_query_count", "KBQ-LUMPY-QUERY-COUNT", 1, 0, false);
        declareFunction("kbq_count_lumpy_query_runs", "KBQ-COUNT-LUMPY-QUERY-RUNS", 1, 0, false);
        declareFunction("kbq_lumpy_query_runP", "KBQ-LUMPY-QUERY-RUN?", 1, 0, false);
        declareFunction("show_kct_test_set_run_summary", "SHOW-KCT-TEST-SET-RUN-SUMMARY", 1, 1, false);
        declareFunction("kbq_show_halt_reason_histogram", "KBQ-SHOW-HALT-REASON-HISTOGRAM", 1, 0, false);
        declareFunction("trim_analysis_if_zero", "TRIM-ANALYSIS-IF-ZERO", 1, 0, false);
        declareFunction("kbq_query_literal_count", "KBQ-QUERY-LITERAL-COUNT", 1, 0, false);
        declareFunction("kbq_single_literal_query_p", "KBQ-SINGLE-LITERAL-QUERY-P", 1, 0, false);
        declareFunction("kbq_progress_stream", "KBQ-PROGRESS-STREAM", 0, 0, false);
        declareFunction("kbq_benchmark_run_and_report", "KBQ-BENCHMARK-RUN-AND-REPORT", 3, 0, false);
        declareFunction("kbq_benchmark_run_in_background", "KBQ-BENCHMARK-RUN-IN-BACKGROUND", 3, 0, false);
        declareFunction("kbq_benchmark_run", "KBQ-BENCHMARK-RUN", 3, 3, false);
        declareFunction("kbq_benchmark_report", "KBQ-BENCHMARK-REPORT", 1, 1, false);
        declareFunction("kbq_benchmark_report_for_test", "KBQ-BENCHMARK-REPORT-FOR-TEST", 2, 1, false);
        declareFunction("kct_run_support_set", "KCT-RUN-SUPPORT-SET", 1, 0, false);
        declareFunction("kct_run_supports_report", "KCT-RUN-SUPPORTS-REPORT", 1, 1, false);
        declareFunction("unknown_sentence_support_p", "UNKNOWN-SENTENCE-SUPPORT-P", 1, 0, false);
        declareFunction("kcts_using_only_these_sksi_sources", "KCTS-USING-ONLY-THESE-SKSI-SOURCES", 1, 0, false);
        declareFunction("kcts_for_sksi_source", "KCTS-FOR-SKSI-SOURCE", 1, 0, false);
        declareFunction("succeeding_kcts_for_sksi_source", "SUCCEEDING-KCTS-FOR-SKSI-SOURCE", 2, 0, false);
        declareFunction("failing_kcts_for_sksi_source", "FAILING-KCTS-FOR-SKSI-SOURCE", 2, 0, false);
        declareFunction("answerable_kcts_for_sksi_source", "ANSWERABLE-KCTS-FOR-SKSI-SOURCE", 2, 0, false);
        declareFunction("unanswerable_kcts_for_sksi_source", "UNANSWERABLE-KCTS-FOR-SKSI-SOURCE", 2, 0, false);
        declareFunction("erroring_kcts_for_sksi_source", "ERRORING-KCTS-FOR-SKSI-SOURCE", 2, 0, false);
        declareFunction("show_errors_for_sksi_source", "SHOW-ERRORS-FOR-SKSI-SOURCE", 2, 0, false);
        declareFunction("analyze_sksi_test_set_run", "ANALYZE-SKSI-TEST-SET-RUN", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_kbq_query_run_file() {
        $kct_set_runstate$ = defparameter("*KCT-SET-RUNSTATE*", NIL);
        $kct_runstate$ = defparameter("*KCT-RUNSTATE*", NIL);
        $kbq_runstate$ = defparameter("*KBQ-RUNSTATE*", NIL);
        $kbq_old_cfasl_common_symbols$ = deflexical("*KBQ-OLD-CFASL-COMMON-SYMBOLS*", $list3);
        $kbq_new_cfasl_common_symbols$ = deflexical("*KBQ-NEW-CFASL-COMMON-SYMBOLS*", append($kbq_old_cfasl_common_symbols$.getGlobalValue(), $list4));
        $kbq_cfasl_common_symbols$ = deflexical("*KBQ-CFASL-COMMON-SYMBOLS*", append($kbq_old_cfasl_common_symbols$.getGlobalValue(), $kbq_new_cfasl_common_symbols$.getGlobalValue()));
        $kbq_cfasl_common_symbols_simple$ = deflexical("*KBQ-CFASL-COMMON-SYMBOLS-SIMPLE*", NIL);
        $kct_old_cfasl_common_symbols$ = deflexical("*KCT-OLD-CFASL-COMMON-SYMBOLS*", append($kbq_old_cfasl_common_symbols$.getGlobalValue(), $list9));
        $kct_cfasl_common_symbols$ = deflexical("*KCT-CFASL-COMMON-SYMBOLS*", append($kbq_old_cfasl_common_symbols$.getGlobalValue(), $list9, $kbq_new_cfasl_common_symbols$.getGlobalValue()));
        $kbq_outlier_timeout$ = defparameter("*KBQ-OUTLIER-TIMEOUT*", $int$600);
        $kbq_internal_time_units_per_second$ = defparameter("*KBQ-INTERNAL-TIME-UNITS-PER-SECOND*", NIL);
        $kbq_run_number$ = defparameter("*KBQ-RUN-NUMBER*", ONE_INTEGER);
        $kct_test_metric_table$ = deflexical("*KCT-TEST-METRIC-TABLE*", $list150);
        $kbq_default_outlier_timeout$ = deflexical("*KBQ-DEFAULT-OUTLIER-TIMEOUT*", $int$600);
        $kbq_test_collection_to_query_set_query$ = deflexical("*KBQ-TEST-COLLECTION-TO-QUERY-SET-QUERY*", $list183);
        $last_query_set_run$ = deflexical("*LAST-QUERY-SET-RUN*", (maybeDefault($sym219$_LAST_QUERY_SET_RUN_, $last_query_set_run$, NIL)));
        $last_test_set_run$ = deflexical("*LAST-TEST-SET-RUN*", (maybeDefault($sym241$_LAST_TEST_SET_RUN_, $last_test_set_run$, NIL)));
        $runstate_isg$ = deflexical("*RUNSTATE-ISG*", maybeDefault($sym260$_RUNSTATE_ISG_, $runstate_isg$, () -> (integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED))));
        $runstate_index$ = deflexical("*RUNSTATE-INDEX*", maybeDefault($sym261$_RUNSTATE_INDEX_, $runstate_index$, () -> (dictionary.new_dictionary(UNPROVIDED, UNPROVIDED))));
        $dtp_kbq_runstate$ = defconstant("*DTP-KBQ-RUNSTATE*", $sym269$KBQ_RUNSTATE);
        $dtp_kct_runstate$ = defconstant("*DTP-KCT-RUNSTATE*", $sym309$KCT_RUNSTATE);
        $dtp_kct_set_runstate$ = defconstant("*DTP-KCT-SET-RUNSTATE*", $sym343$KCT_SET_RUNSTATE);
        $query_set_run_file_extension$ = deflexical("*QUERY-SET-RUN-FILE-EXTENSION*", $str406$_cfasl);
        $kbq_filter_query_set_run_to_queries$ = defparameter("*KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES*", NIL);
        $kct_filter_test_set_run_to_tests$ = defparameter("*KCT-FILTER-TEST-SET-RUN-TO-TESTS*", NIL);
        $cached_all_instances_among_caching_state$ = deflexical("*CACHED-ALL-INSTANCES-AMONG-CACHING-STATE*", NIL);
        $kbq_summary_statistics$ = deflexical("*KBQ-SUMMARY-STATISTICS*", $list458);
        $kbq_progress_stream$ = defparameter("*KBQ-PROGRESS-STREAM*", NIL);
        $kbq_benchmark_outlier_timeout$ = defparameter("*KBQ-BENCHMARK-OUTLIER-TIMEOUT*", $int$3600);
        $kbq_test_query_set$ = deflexical("*KBQ-TEST-QUERY-SET*", $list590);
        return NIL;
    }

    public static SubLObject setup_kbq_query_run_file() {
        access_macros.register_macro_helper($sym5$KBQ_CFASL_COMMON_SYMBOLS, $sym6$DO_QUERY_SET_RUN);
        access_macros.register_macro_helper($sym7$KBQ_CFASL_COMMON_SYMBOLS_SIMPLE, $sym6$DO_QUERY_SET_RUN);
        access_macros.register_external_symbol($sym140$ENSURE_SKSI_MODULES_NEEDED);
        memoization_state.note_memoized_function($sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED);
        memoization_state.note_memoized_function($sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED);
        subl_macro_promotions.declare_defglobal($sym219$_LAST_QUERY_SET_RUN_);
        access_macros.register_macro_helper($sym217$RUN_KBQ_EXPERIMENT_INTERNAL, $sym220$RUN_KBQ_EXPERIMENT);
        subl_macro_promotions.declare_defglobal($sym241$_LAST_TEST_SET_RUN_);
        access_macros.register_macro_helper($sym240$RUN_KCT_EXPERIMENT_INTERNAL, $sym242$RUN_KCT_EXPERIMENT);
        subl_macro_promotions.declare_defglobal($sym260$_RUNSTATE_ISG_);
        subl_macro_promotions.declare_defglobal($sym261$_RUNSTATE_INDEX_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_kbq_runstate$.getGlobalValue(), Symbols.symbol_function($sym276$KBQ_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list277);
        Structures.def_csetf($sym278$KBQR_ID, $sym279$_CSETF_KBQR_ID);
        Structures.def_csetf($sym280$KBQR_LOCK, $sym281$_CSETF_KBQR_LOCK);
        Structures.def_csetf($sym282$KBQR_QUERY_SPEC, $sym283$_CSETF_KBQR_QUERY_SPEC);
        Structures.def_csetf($sym284$KBQR_INFERENCE, $sym285$_CSETF_KBQR_INFERENCE);
        Structures.def_csetf($sym286$KBQR_RESULT, $sym287$_CSETF_KBQR_RESULT);
        Structures.def_csetf($sym288$KBQR_TEST_RUNSTATE, $sym289$_CSETF_KBQR_TEST_RUNSTATE);
        Structures.def_csetf($sym290$KBQR_RUN_STATUS, $sym291$_CSETF_KBQR_RUN_STATUS);
        Equality.identity($sym269$KBQ_RUNSTATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kbq_runstate$.getGlobalValue(), Symbols.symbol_function($sym303$VISIT_DEFSTRUCT_OBJECT_KBQ_RUNSTATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_kct_runstate$.getGlobalValue(), Symbols.symbol_function($sym314$KCT_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list315);
        Structures.def_csetf($sym316$KCTR_ID, $sym317$_CSETF_KCTR_ID);
        Structures.def_csetf($sym318$KCTR_LOCK, $sym319$_CSETF_KCTR_LOCK);
        Structures.def_csetf($sym320$KCTR_TEST_SPEC, $sym321$_CSETF_KCTR_TEST_SPEC);
        Structures.def_csetf($sym322$KCTR_RESULT, $sym323$_CSETF_KCTR_RESULT);
        Structures.def_csetf($sym324$KCTR_QUERY_RUNSTATE, $sym325$_CSETF_KCTR_QUERY_RUNSTATE);
        Structures.def_csetf($sym326$KCTR_TEST_SET_RUNSTATE, $sym327$_CSETF_KCTR_TEST_SET_RUNSTATE);
        Structures.def_csetf($sym328$KCTR_RUN_STATUS, $sym329$_CSETF_KCTR_RUN_STATUS);
        Structures.def_csetf($sym330$KCTR_START, $sym331$_CSETF_KCTR_START);
        Structures.def_csetf($sym332$KCTR_END, $sym333$_CSETF_KCTR_END);
        Equality.identity($sym309$KCT_RUNSTATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kct_runstate$.getGlobalValue(), Symbols.symbol_function($sym339$VISIT_DEFSTRUCT_OBJECT_KCT_RUNSTATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_kct_set_runstate$.getGlobalValue(), Symbols.symbol_function($sym348$KCT_SET_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list349);
        Structures.def_csetf($sym350$KCTSR_ID, $sym351$_CSETF_KCTSR_ID);
        Structures.def_csetf($sym352$KCTSR_LOCK, $sym353$_CSETF_KCTSR_LOCK);
        Structures.def_csetf($sym354$KCTSR_TEST_SET, $sym355$_CSETF_KCTSR_TEST_SET);
        Structures.def_csetf($sym356$KCTSR_RESULT, $sym357$_CSETF_KCTSR_RESULT);
        Structures.def_csetf($sym358$KCTSR_TEST_RUNSTATES, $sym359$_CSETF_KCTSR_TEST_RUNSTATES);
        Structures.def_csetf($sym360$KCTSR_RUN_STATUS, $sym361$_CSETF_KCTSR_RUN_STATUS);
        Structures.def_csetf($sym362$KCTSR_START, $sym363$_CSETF_KCTSR_START);
        Structures.def_csetf($sym364$KCTSR_END, $sym365$_CSETF_KCTSR_END);
        Equality.identity($sym343$KCT_SET_RUNSTATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kct_set_runstate$.getGlobalValue(), Symbols.symbol_function($sym369$VISIT_DEFSTRUCT_OBJECT_KCT_SET_RUNSTATE_METHOD));
        access_macros.register_macro_helper($sym389$KBQ_LOAD_QUERY_SET_RUN_INT, $sym6$DO_QUERY_SET_RUN);
        access_macros.register_macro_helper($sym393$KBQ_LOAD_QUERY_RUN_INT, $sym6$DO_QUERY_SET_RUN);
        access_macros.register_macro_helper($sym398$KBQ_NCLEAN_QUERY_RUN, $sym6$DO_QUERY_SET_RUN);
        memoization_state.note_globally_cached_function($sym428$CACHED_ALL_INSTANCES_AMONG);
        generic_testing.define_test_case_table_int($sym591$COMPUTE_NEW_ROOT_RELATIVE_ANSWER_TIMES, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list597);
        return NIL;
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
        me = new kbq_query_run();
        $kct_set_runstate$ = null;
        $kct_runstate$ = null;
        $kbq_runstate$ = null;
        $kbq_old_cfasl_common_symbols$ = null;
        $kbq_new_cfasl_common_symbols$ = null;
        $kbq_cfasl_common_symbols$ = null;
        $kbq_cfasl_common_symbols_simple$ = null;
        $kct_old_cfasl_common_symbols$ = null;
        $kct_cfasl_common_symbols$ = null;
        $kbq_outlier_timeout$ = null;
        $kbq_internal_time_units_per_second$ = null;
        $kbq_run_number$ = null;
        $kct_test_metric_table$ = null;
        $kbq_default_outlier_timeout$ = null;
        $kbq_test_collection_to_query_set_query$ = null;
        $last_query_set_run$ = null;
        $last_test_set_run$ = null;
        $runstate_isg$ = null;
        $runstate_index$ = null;
        $dtp_kbq_runstate$ = null;
        $dtp_kct_runstate$ = null;
        $dtp_kct_set_runstate$ = null;
        $query_set_run_file_extension$ = null;
        $kbq_filter_query_set_run_to_queries$ = null;
        $kct_filter_test_set_run_to_tests$ = null;
        $cached_all_instances_among_caching_state$ = null;
        $kbq_summary_statistics$ = null;
        $kbq_progress_stream$ = null;
        $kbq_benchmark_outlier_timeout$ = null;
        $kbq_test_query_set$ = null;
        $SUCCESS = makeKeyword("SUCCESS");
        $FAILURE = makeKeyword("FAILURE");
        $ERROR = makeKeyword("ERROR");
        $list3 = list(new SubLObject[] { makeKeyword("ANSWER-COUNT-AT-60-SECONDS"), makeKeyword("PROBLEM-STORE-PROBLEM-COUNT"), makeKeyword("PROBLEM-STORE-PROOF-COUNT"), makeKeyword("ERROR"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("ANSWER-COUNT-AT-30-SECONDS"),
                makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("TOTAL-TIME"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("ANSWER-COUNT"), makeKeyword("EXHAUST-TOTAL"), makeKeyword("HALT-REASON"), makeKeyword("QUERY"), makeKeyword("QUERY-RUN") });
        $list4 = list(new SubLObject[] { makeKeyword("TIME-PER-ANSWER"), makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER"), makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), makeKeyword("PROBLEM-COUNT"), makeKeyword("PROOF-COUNT"), makeKeyword("LINK-COUNT"), makeKeyword("CONTENT-LINK-COUNT"),
                makeKeyword("REMOVAL-LINK-COUNT"), makeKeyword("REWRITE-LINK-COUNT"), makeKeyword("TRANSFORMATION-LINK-COUNT"), makeKeyword("STRUCTURAL-LINK-COUNT"), makeKeyword("JOIN-ORDERED-LINK-COUNT"), makeKeyword("JOIN-LINK-COUNT"), makeKeyword("SPLIT-LINK-COUNT"),
                makeKeyword("RESTRICTION-LINK-COUNT"), makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT"), makeKeyword("UNION-LINK-COUNT"), makeKeyword("GOOD-PROBLEM-COUNT"), makeKeyword("NEUTRAL-PROBLEM-COUNT"), makeKeyword("NO-GOOD-PROBLEM-COUNT"), makeKeyword("SINGLE-LITERAL-PROBLEM-COUNT"),
                makeKeyword("CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("JOIN-PROBLEM-COUNT"), makeKeyword("SPLIT-PROBLEM-COUNT"), makeKeyword("DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-PROBLEM-COUNT"), makeKeyword("EXAMINED-PROBLEM-COUNT"), makeKeyword("POSSIBLE-PROBLEM-COUNT"),
                makeKeyword("PENDING-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-GOOD-PROBLEM-COUNT"), makeKeyword("EXAMINED-GOOD-PROBLEM-COUNT"), makeKeyword("POSSIBLE-GOOD-PROBLEM-COUNT"), makeKeyword("PENDING-GOOD-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-NEUTRAL-PROBLEM-COUNT"),
                makeKeyword("EXAMINED-NEUTRAL-PROBLEM-COUNT"), makeKeyword("POSSIBLE-NEUTRAL-PROBLEM-COUNT"), makeKeyword("PENDING-NEUTRAL-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-NO-GOOD-PROBLEM-COUNT"), makeKeyword("EXAMINED-NO-GOOD-PROBLEM-COUNT"), makeKeyword("POSSIBLE-NO-GOOD-PROBLEM-COUNT"),
                makeKeyword("PENDING-NO-GOOD-PROBLEM-COUNT"), makeKeyword("GOOD-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("GOOD-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("GOOD-JOIN-PROBLEM-COUNT"), makeKeyword("GOOD-SPLIT-PROBLEM-COUNT"), makeKeyword("GOOD-DISJUNCTIVE-PROBLEM-COUNT"),
                makeKeyword("NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("NEUTRAL-JOIN-PROBLEM-COUNT"), makeKeyword("NEUTRAL-SPLIT-PROBLEM-COUNT"), makeKeyword("NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT"),
                makeKeyword("NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("NO-GOOD-JOIN-PROBLEM-COUNT"), makeKeyword("NO-GOOD-SPLIT-PROBLEM-COUNT"), makeKeyword("NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT"),
                makeKeyword("UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-JOIN-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-SPLIT-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT"),
                makeKeyword("EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("EXAMINED-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("EXAMINED-JOIN-PROBLEM-COUNT"), makeKeyword("EXAMINED-SPLIT-PROBLEM-COUNT"), makeKeyword("EXAMINED-DISJUNCTIVE-PROBLEM-COUNT"),
                makeKeyword("POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("POSSIBLE-JOIN-PROBLEM-COUNT"), makeKeyword("POSSIBLE-SPLIT-PROBLEM-COUNT"), makeKeyword("POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT"),
                makeKeyword("FINISHED-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("FINISHED-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("FINISHED-JOIN-PROBLEM-COUNT"), makeKeyword("FINISHED-SPLIT-PROBLEM-COUNT"), makeKeyword("FINISHED-DISJUNCTIVE-PROBLEM-COUNT") });
        $sym5$KBQ_CFASL_COMMON_SYMBOLS = makeSymbol("KBQ-CFASL-COMMON-SYMBOLS");
        $sym6$DO_QUERY_SET_RUN = makeSymbol("DO-QUERY-SET-RUN");
        $sym7$KBQ_CFASL_COMMON_SYMBOLS_SIMPLE = makeSymbol("KBQ-CFASL-COMMON-SYMBOLS-SIMPLE");
        $sym8$VECTOR = makeSymbol("VECTOR");
        $list9 = list(makeKeyword("SUCCESS"), makeKeyword("FAILURE"), makeKeyword("STATUS"), makeKeyword("TEST"));
        $int$600 = makeInteger(600);
        $list11 = list(list(makeSymbol("QUERY-SET-RUN")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym12$CLET = makeSymbol("CLET");
        $sym13$_KBQ_INTERNAL_TIME_UNITS_PER_SECOND_ = makeSymbol("*KBQ-INTERNAL-TIME-UNITS-PER-SECOND*");
        $sym14$KBQ_QUERY_SET_RUN_INTERNAL_TIME_UNITS_PER_SECOND = makeSymbol("KBQ-QUERY-SET-RUN-INTERNAL-TIME-UNITS-PER-SECOND");
        $RESULT = makeKeyword("RESULT");
        $QUERY = makeKeyword("QUERY");
        $MISSING = makeKeyword("MISSING");
        $ANSWER_COUNT = makeKeyword("ANSWER-COUNT");
        $HYPOTHESIZATION_TIME = makeKeyword("HYPOTHESIZATION-TIME");
        $TOTAL_TIME = makeKeyword("TOTAL-TIME");
        $COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");
        $TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");
        $TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");
        $COMPLETE_TIME_TO_FIRST_ANSWER = makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER");
        $COMPLETE_TIME_TO_LAST_ANSWER = makeKeyword("COMPLETE-TIME-TO-LAST-ANSWER");
        $TOTAL_STEPS = makeKeyword("TOTAL-STEPS");
        $STEPS_TO_FIRST_ANSWER = makeKeyword("STEPS-TO-FIRST-ANSWER");
        $STEPS_TO_LAST_ANSWER = makeKeyword("STEPS-TO-LAST-ANSWER");
        $HALT_REASON = makeKeyword("HALT-REASON");
        $ORIGIN = makeKeyword("ORIGIN");
        $WASTED_TIME_AFTER_LAST_ANSWER = makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER");
        $LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
        $SETUP_TIME = makeKeyword("SETUP-TIME");
        $TIME_PER_ANSWER = makeKeyword("TIME-PER-ANSWER");
        $COMPLETE_TIME_PER_ANSWER = makeKeyword("COMPLETE-TIME-PER-ANSWER");
        $ANSWERABILITY_TIME = makeKeyword("ANSWERABILITY-TIME");
        $ANSWERABILITY_STEPS = makeKeyword("ANSWERABILITY-STEPS");
        $NEW_ROOT_RELATIVE_TOTAL_TIMES = makeKeyword("NEW-ROOT-RELATIVE-TOTAL-TIMES");
        $NEW_ROOT_TIMES = makeKeyword("NEW-ROOT-TIMES");
        $NEW_ROOT_RELATIVE_ANSWER_TIMES = makeKeyword("NEW-ROOT-RELATIVE-ANSWER-TIMES");
        $ANSWER_TIMES = makeKeyword("ANSWER-TIMES");
        $ESTIMATED_EXHAUSTIVE_PROBLEM_COUNT = makeKeyword("ESTIMATED-EXHAUSTIVE-PROBLEM-COUNT");
        $ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT = makeKeyword("ESTIMATED-EXHAUSTIVE-NEW-ROOT-COUNT");
        $NEW_ROOT_COUNT = makeKeyword("NEW-ROOT-COUNT");
        $PROBLEM_COUNT = makeKeyword("PROBLEM-COUNT");
        $ESTIMATED_EXHAUSTIVE_BYTE_COUNT = makeKeyword("ESTIMATED-EXHAUSTIVE-BYTE-COUNT");
        $sym47$_MEDIAN_BYTES_PER_PROBLEM_ = makeSymbol("*MEDIAN-BYTES-PER-PROBLEM*");
        $TOTAL_NEW_ROOT_INITIAL_REMOVAL_FANOUT = makeKeyword("TOTAL-NEW-ROOT-INITIAL-REMOVAL-FANOUT");
        $NEW_ROOT_INITIAL_REMOVAL_FANOUTS = makeKeyword("NEW-ROOT-INITIAL-REMOVAL-FANOUTS");
        $QUERY_FUNCALL = makeKeyword("QUERY-FUNCALL");
        $list51 = list(makeSymbol("QUERY-FUNCALL"), makeSymbol("FUNC"));
        $list52 = list(makeSymbol("QUERY-FUNCALL"), makeSymbol("FUNC"), makeSymbol("ARG1"));
        $QUERY_RUN_FUNCALL = makeKeyword("QUERY-RUN-FUNCALL");
        $list54 = list(makeSymbol("QUERY-RUN-FUNCALL"), makeSymbol("FUNC"));
        $list55 = list(makeSymbol("QUERY-RUN-FUNCALL"), makeSymbol("FUNC"), makeSymbol("ARG1"));
        $str56$unrecognized_KBQ_property_spec__s = makeString("unrecognized KBQ property spec ~s");
        $str57$Use_the__with_kbq_query_set_run_m = makeString("Use the 'with-kbq-query-set-run macro to provide the scaling factor from internal real time to seconds.");
        $str58$Use_the__with_kbq_query_set_run__ = makeString("Use the 'with-kbq-query-set-run' macro to provide the scaling factor from internal real time to seconds.");
        $list59 = list(makeKeyword("MAX-TIME"), makeKeyword("OUTLIER-TIMEOUT"));
        $TAUTOLOGY = makeKeyword("TAUTOLOGY");
        $int$1000 = makeInteger(1000);
        $int$100 = makeInteger(100);
        $float$0_1 = makeDouble(0.1);
        $float$0_01 = makeDouble(0.01);
        $INFERENCE_PROOF_SPEC = makeKeyword("INFERENCE-PROOF-SPEC");
        $$sentenceTruth = makeConstSym(("sentenceTruth"));
        $int$_2 = makeInteger(-2);
        $sym68$FIRST = makeSymbol("FIRST");
        $TEST = makeKeyword("TEST");
        $STATUS = makeKeyword("STATUS");
        $QUERY_RUN = makeKeyword("QUERY-RUN");
        $MACHINE = makeKeyword("MACHINE");
        $DATE = makeKeyword("DATE");
        $BOGOMIPS = makeKeyword("BOGOMIPS");
        $INTERNAL_TIME_UNITS_PER_SECOND = makeKeyword("INTERNAL-TIME-UNITS-PER-SECOND");
        $PATCH_LEVEL = makeKeyword("PATCH-LEVEL");
        $COMMENT = makeKeyword("COMMENT");
        $QUERY_RUNS = makeKeyword("QUERY-RUNS");
        $sym79$KBQ_QUERY_SET_RUN_QUERY_RUNS = makeSymbol("KBQ-QUERY-SET-RUN-QUERY-RUNS");
        $list80 = list(makeSymbol("&KEY"), makeSymbol("MACHINE"), makeSymbol("DATE"), makeSymbol("BOGOMIPS"), makeSymbol("INTERNAL-TIME-UNITS-PER-SECOND"), makeSymbol("PATCH-LEVEL"), makeSymbol("COMMENT"), makeSymbol("TEST-RUNS"));
        $list81 = list(makeKeyword("MACHINE"), makeKeyword("DATE"), makeKeyword("BOGOMIPS"), makeKeyword("INTERNAL-TIME-UNITS-PER-SECOND"), makeKeyword("PATCH-LEVEL"), makeKeyword("COMMENT"), makeKeyword("TEST-RUNS"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $TEST_RUNS = makeKeyword("TEST-RUNS");
        $sym84$INVALID_FORT_ = makeSymbol("INVALID-FORT?");
        $sym85$KBQ_RUNNABLE_ = makeSymbol("KBQ-RUNNABLE?");
        $sym86$_ = makeSymbol("<");
        $sym87$SAFE__ = makeSymbol("SAFE-<");
        $str88$_s_____s__ = makeString("~s -> ~s~%");
        $sym89$KBQ_QUERY_RUN_QUERY = makeSymbol("KBQ-QUERY-RUN-QUERY");
        $MEDIAN_HYPOTHESIZATION_TIME = makeKeyword("MEDIAN-HYPOTHESIZATION-TIME");
        $MEDIAN_TOTAL_TIME = makeKeyword("MEDIAN-TOTAL-TIME");
        $MEDIAN_TIME_TO_FIRST_ANSWER = makeKeyword("MEDIAN-TIME-TO-FIRST-ANSWER");
        $MEDIAN_TIME_TO_LAST_ANSWER = makeKeyword("MEDIAN-TIME-TO-LAST-ANSWER");
        $str94$what_s_the_median_for__s = makeString("what's the median for ~s");
        $MEAN_HYPOTHESIZATION_TIME = makeKeyword("MEAN-HYPOTHESIZATION-TIME");
        $MEAN_TOTAL_TIME = makeKeyword("MEAN-TOTAL-TIME");
        $MEAN_TIME_TO_FIRST_ANSWER = makeKeyword("MEAN-TIME-TO-FIRST-ANSWER");
        $MEAN_TIME_TO_LAST_ANSWER = makeKeyword("MEAN-TIME-TO-LAST-ANSWER");
        $str99$what_s_the_mean_for__s = makeString("what's the mean for ~s");
        $sym100$KBQ_QUERY_RUN_HYPOTHESIZATION_TIME = makeSymbol("KBQ-QUERY-RUN-HYPOTHESIZATION-TIME");
        $sym101$KBQ_QUERY_RUN_TOTAL_TIME = makeSymbol("KBQ-QUERY-RUN-TOTAL-TIME");
        $sym102$KBQ_QUERY_RUN_TIME_TO_FIRST_ANSWER = makeSymbol("KBQ-QUERY-RUN-TIME-TO-FIRST-ANSWER");
        $sym103$KBQ_QUERY_RUN_TIME_TO_LAST_ANSWER = makeSymbol("KBQ-QUERY-RUN-TIME-TO-LAST-ANSWER");
        $sym104$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME = makeSymbol("KBQ-QUERY-RUN-COMPLETE-TOTAL-TIME");
        $sym105$KBQ_QUERY_RUN_COMPLETE_TIME_TO_FIRST_ANSWER = makeSymbol("KBQ-QUERY-RUN-COMPLETE-TIME-TO-FIRST-ANSWER");
        $sym106$KBQ_QUERY_RUN_COMPLETE_TIME_TO_LAST_ANSWER = makeSymbol("KBQ-QUERY-RUN-COMPLETE-TIME-TO-LAST-ANSWER");
        $sym107$KBQ_QUERY_RUN_ANSWER_COUNT = makeSymbol("KBQ-QUERY-RUN-ANSWER-COUNT");
        $str108$unknown_metric__s = makeString("unknown metric ~s");
        $sym109$KCT_TEST_SET_RUN_TEST_RUNS = makeSymbol("KCT-TEST-SET-RUN-TEST-RUNS");
        $sym110$KCT_TEST_RUN_TEST = makeSymbol("KCT-TEST-RUN-TEST");
        $sym111$KBQ_QUERY_SPEC_P = makeSymbol("KBQ-QUERY-SPEC-P");
        $sym112$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
        $sym113$QUERY_METRIC_P = makeSymbol("QUERY-METRIC-P");
        $sym114$NUMBERP = makeSymbol("NUMBERP");
        $sym115$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
        $sym116$QUERY_PROPERTY_P = makeSymbol("QUERY-PROPERTY-P");
        $CONTINUABLE_ = makeKeyword("CONTINUABLE?");
        $METRICS = makeKeyword("METRICS");
        $BROWSABLE_ = makeKeyword("BROWSABLE?");
        $str120$___A____ = makeString("~%~A~%~%");
        $RUNNING = makeKeyword("RUNNING");
        $sym122$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $ABORT_KBQ_RUN_QUERY = makeKeyword("ABORT-KBQ-RUN-QUERY");
        $str124$Abort_KBQ_run_query = makeString("Abort KBQ run query");
        $str125$KBQ_explicitly_aborted = makeString("KBQ explicitly aborted");
        $NEVER_RUN = makeKeyword("NEVER-RUN");
        $FINISHED = makeKeyword("FINISHED");
        $str128$Outlier_____S = makeString("Outlier :~%~S");
        $OUTLIER_ABORT = makeKeyword("OUTLIER-ABORT");
        $OUTLIER_TIMEOUT = makeKeyword("OUTLIER-TIMEOUT");
        $str131$Unable_to_compute_any_inference_m = makeString("Unable to compute any inference metrics for ~A");
        $str132$Unable_to_compute_all_desired_inf = makeString("Unable to compute all desired inference metrics for ~A");
        $str133$KBQ_harness_error_for__A____A = makeString("KBQ harness error for ~A : ~A");
        $str134$Error_____S___A = makeString("Error :~%~S~%~A");
        $NOT_A_QUERY = makeKeyword("NOT-A-QUERY");
        $str136$Avoided__due_to__S______S = makeString("Avoided (due to ~S) :~%~S");
        $OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $SUBSTITUTIONS = makeKeyword("SUBSTITUTIONS");
        $ABORT = makeKeyword("ABORT");
        $sym140$ENSURE_SKSI_MODULES_NEEDED = makeSymbol("ENSURE-SKSI-MODULES-NEEDED");
        $$sksiModulesNeeded = makeConstSym(("sksiModulesNeeded"));
        $$testFollowupTestFormula_All = makeConstSym(("testFollowupTestFormula-All"));
        $$testFollowupTestFormula_Some = makeConstSym(("testFollowupTestFormula-Some"));
        $$testFollowupTestFormula_None = makeConstSym(("testFollowupTestFormula-None"));
        $sym145$KCT_TEST_SPEC_P = makeSymbol("KCT-TEST-SPEC-P");
        $RETURN = makeKeyword("RETURN");
        $BINDINGS_AND_HYPOTHETICAL_BINDINGS = makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $$TestMetric_HaltReason = makeConstSym(("TestMetric-HaltReason"));
        $str149$Unsupported_metric__S = makeString("Unsupported metric ~S");
        $list150 = list(cons(makeConstSym(("TestMetric-TotalTime")), makeKeyword("TOTAL-TIME")), cons(makeConstSym(("TestMetric-TimeToFirstAnswer")), makeKeyword("TIME-TO-FIRST-ANSWER")), cons(makeConstSym(("TestMetric-TimeToLastAnswer")), makeKeyword("TIME-TO-LAST-ANSWER")),
                cons(makeConstSym(("TestMetric-AnswerCount")), makeKeyword("ANSWER-COUNT")), cons(makeConstSym(("TestMetric-AnswerCountAt30Seconds")), makeKeyword("ANSWER-COUNT-AT-30-SECONDS")), cons(makeConstSym(("TestMetric-AnswerCountAt60Seconds")), makeKeyword("ANSWER-COUNT-AT-60-SECONDS")),
                cons(makeConstSym(("TestMetric-ProblemStoreProofCount")), makeKeyword("PROOF-COUNT")), cons(makeConstSym(("TestMetric-ProblemStoreProblemCount")), makeKeyword("PROBLEM-COUNT")));
        $PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
        $list152 = list(makeKeyword("CONDITIONAL-SENTENCE?"), NIL);
        $sym153$BINDINGS_EQUAL_MODULO_EL_VAR_NAMES_ = makeSymbol("BINDINGS-EQUAL-MODULO-EL-VAR-NAMES?");
        $str154$Expected_ = makeString("Expected ");
        $str155$__but_got_ = makeString(", but got ");
        $str156$Expected_exactly_ = makeString("Expected exactly ");
        $str157$_binding_sets__but_got_ = makeString(" binding sets, but got ");
        $str158$_ = makeString(".");
        $str159$Expected_at_least_ = makeString("Expected at least ");
        $str160$Expected_no_more_than_ = makeString("Expected no more than ");
        $str161$ = makeString("");
        $str162$These_expected_bindings_were_miss = makeString("These expected bindings were missing: ");
        $str163$These_unwanted_bindings_were_retu = makeString("These unwanted bindings were returned: ");
        $str164$____ = makeString("    ");
        $OUTPUT = makeKeyword("OUTPUT");
        $sym166$FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");
        $ABORT_KBQ_RUN_QUERY_SET = makeKeyword("ABORT-KBQ-RUN-QUERY-SET");
        $str168$Abort_KBQ_run_query_set = makeString("Abort KBQ run query set");
        $str169$KBQ_running_query_set = makeString("KBQ running query set");
        $str170$cdolist = makeString("cdolist");
        $str171$_________________________________ = makeString("~&~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;~%");
        $str172$______A____ = makeString("~&;; ~A~%~%");
        $str173$Running_ = makeString("Running ");
        $str174$Unrunnable_query____S = makeString("Unrunnable query : ~S");
        $sym175$JANUS_OPERATION_P = makeSymbol("JANUS-OPERATION-P");
        $$EverythingPSC = makeConstSym(("EverythingPSC"));
        $sym177$SKSI_MODULES_NEEDED_SORTED_MEMOIZED = makeSymbol("SKSI-MODULES-NEEDED-SORTED-MEMOIZED");
        $sym178$QUERY_SKSI_MODULES_NEEDED_SORTED_MEMOIZED = makeSymbol("QUERY-SKSI-MODULES-NEEDED-SORTED-MEMOIZED");
        $$isa = makeConstSym(("isa"));
        $$elementOf = makeConstSym(("elementOf"));
        $sym181$_OBJ = makeSymbol("?OBJ");
        $list182 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"));
        $list183 = list(makeConstSym(("evaluate")), makeKeyword("SET"), list(makeConstSym(("SetExtentFn")), list(makeConstSym(("TheSetOf")), makeSymbol("?QUERY"), list(makeConstSym(("thereExists")), makeSymbol("?TEST"), list(makeConstSym(("and")),
                ConsesLow.list(makeConstSym(("knownSentence")), list(makeConstSym(("isa")), makeSymbol("?TEST"), makeKeyword("TEST-COLLECTION"))), list(makeConstSym(("assertedSentence")), list(makeConstSym(("testQuerySpecification")), makeSymbol("?TEST"), makeSymbol("?QUERY"))))))));
        $TEST_COLLECTION = makeKeyword("TEST-COLLECTION");
        $SET = makeKeyword("SET");
        $list186 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));
        $PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
        $str188$Processing_KB_Queries = makeString("Processing KB Queries");
        $SKIP_KBQ = makeKeyword("SKIP-KBQ");
        $str190$Skip_KBQ__S = makeString("Skip KBQ ~S");
        $ADDITIONAL_ARGS = makeKeyword("ADDITIONAL-ARGS");
        $sym192$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list193 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);
        $sym194$CSETQ = makeSymbol("CSETQ");
        $str195$_A = makeString("~A");
        $list196 = list(makeKeyword("CONTINUABLE?"), NIL, makeKeyword("BROWSABLE?"), T);
        $ABORT_KCT_RUN_TEST_SET = makeKeyword("ABORT-KCT-RUN-TEST-SET");
        $str198$Abort_KCT_run_test_set = makeString("Abort KCT run test set");
        $str199$KCT_running_test_set = makeString("KCT running test set");
        $str200$__Running__s__ = makeString("~&Running ~s~%");
        $str201$Unrunnable_test____S = makeString("Unrunnable test : ~S");
        $list202 = list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("QUERY-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("ANALYSIS-FILENAME"), makeSymbol("KEEPALIVE-FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"),
                list(makeSymbol("METRICS"), list(makeSymbol("QUOTE"), list(makeSymbol("ALL-ARETE-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*KBQ-DEFAULT-OUTLIER-TIMEOUT*"))), makeSymbol("INCREMENTAL"), list(makeSymbol("INCLUDE-RESULTS"), T),
                list(makeSymbol("RANDOMIZE"), NIL), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT"), list(makeSymbol("IF-FILE-EXISTS"), makeKeyword("OVERWRITE")) });
        $list203 = list(new SubLObject[] { makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("ANALYSIS-FILENAME"), makeKeyword("KEEPALIVE-FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"),
                makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("RANDOMIZE"), makeKeyword("SKIP"), makeKeyword("COUNT"), makeKeyword("IF-FILE-EXISTS") });
        $QUERY_SPEC_SET = makeKeyword("QUERY-SPEC-SET");
        $FILENAME = makeKeyword("FILENAME");
        $ANALYSIS_FILENAME = makeKeyword("ANALYSIS-FILENAME");
        $KEEPALIVE_FILENAME = makeKeyword("KEEPALIVE-FILENAME");
        $list208 = list(makeSymbol("ALL-ARETE-QUERY-METRICS"));
        $sym209$_KBQ_DEFAULT_OUTLIER_TIMEOUT_ = makeSymbol("*KBQ-DEFAULT-OUTLIER-TIMEOUT*");
        $INCREMENTAL = makeKeyword("INCREMENTAL");
        $INCLUDE_RESULTS = makeKeyword("INCLUDE-RESULTS");
        $RANDOMIZE = makeKeyword("RANDOMIZE");
        $SKIP = makeKeyword("SKIP");
        $COUNT = makeKeyword("COUNT");
        $IF_FILE_EXISTS = makeKeyword("IF-FILE-EXISTS");
        $OVERWRITE = makeKeyword("OVERWRITE");
        $sym217$RUN_KBQ_EXPERIMENT_INTERNAL = makeSymbol("RUN-KBQ-EXPERIMENT-INTERNAL");
        $sym218$LIST = makeSymbol("LIST");
        $sym219$_LAST_QUERY_SET_RUN_ = makeSymbol("*LAST-QUERY-SET-RUN*");
        $sym220$RUN_KBQ_EXPERIMENT = makeSymbol("RUN-KBQ-EXPERIMENT");
        $sym221$KBQ_IF_FILE_EXISTS_HANDLING_P = makeSymbol("KBQ-IF-FILE-EXISTS-HANDLING-P");
        $str222$__run_starting_at__A = makeString("~%run starting at ~A");
        $str223$__run_ended_at__A = makeString("~%run ended at ~A");
        $str224$__elapsed_time____A = makeString("~%elapsed time : ~A");
        $str225$Unable_to_open__S = makeString("Unable to open ~S");
        $sym226$KBQ_ERRORING_QUERY_RUN_ = makeSymbol("KBQ-ERRORING-QUERY-RUN?");
        $list227 = list(makeKeyword("OVERWRITE"), makeKeyword("AUGMENT"), makeKeyword("RERUN-ERRORS"), makeKeyword("AUGMENT-OR-RERUN-ERRORS"));
        $AUGMENT = makeKeyword("AUGMENT");
        $APPEND = makeKeyword("APPEND");
        $RERUN_ERRORS = makeKeyword("RERUN-ERRORS");
        $AUGMENT_OR_RERUN_ERRORS = makeKeyword("AUGMENT-OR-RERUN-ERRORS");
        $str232$unexpected_if_file_exists__s = makeString("unexpected if-file-exists ~s");
        $str233$_rerun_errors_ = makeString("-rerun-errors-");
        $list234 = list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("TEST-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("ANALYSIS-FILENAME"), makeSymbol("KEEPALIVE-FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"),
                list(makeSymbol("OVERRIDING-METRICS"), list(makeSymbol("QUOTE"), list(makeSymbol("ALL-ARETE-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*KBQ-OUTLIER-TIMEOUT*"))), makeSymbol("INCREMENTAL"), list(makeSymbol("INCLUDE-RESULTS"), T),
                list(makeSymbol("IF-FILE-EXISTS"), makeKeyword("OVERWRITE")), list(makeSymbol("EXPOSE-RUNSTATE"), NIL), list(makeSymbol("RANDOMIZE"), NIL), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT") });
        $list235 = list(new SubLObject[] { makeKeyword("TEST-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("ANALYSIS-FILENAME"), makeKeyword("KEEPALIVE-FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("OVERRIDING-METRICS"),
                makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("IF-FILE-EXISTS"), makeKeyword("EXPOSE-RUNSTATE"), makeKeyword("RANDOMIZE"), makeKeyword("SKIP"), makeKeyword("COUNT") });
        $TEST_SPEC_SET = makeKeyword("TEST-SPEC-SET");
        $OVERRIDING_METRICS = makeKeyword("OVERRIDING-METRICS");
        $sym238$_KBQ_OUTLIER_TIMEOUT_ = makeSymbol("*KBQ-OUTLIER-TIMEOUT*");
        $EXPOSE_RUNSTATE = makeKeyword("EXPOSE-RUNSTATE");
        $sym240$RUN_KCT_EXPERIMENT_INTERNAL = makeSymbol("RUN-KCT-EXPERIMENT-INTERNAL");
        $sym241$_LAST_TEST_SET_RUN_ = makeSymbol("*LAST-TEST-SET-RUN*");
        $sym242$RUN_KCT_EXPERIMENT = makeSymbol("RUN-KCT-EXPERIMENT");
        $sym243$KB_CONTENT_REGRESSION_TEST_ = makeSymbol("KB-CONTENT-REGRESSION-TEST?");
        $str244$Filtered_to___KBContentRegression = makeString("Filtered to #$KBContentRegressionTests");
        $str245$All_tests___ = makeString("All tests:~%");
        $str246$__Just_the_regression_tests___ = makeString("~%Just the regression tests:~%");
        $int$212 = makeInteger(212);
        $str248$__Failing_tests_ = makeString("~%Failing tests:");
        $str249$____Failing_regression_tests___a_ = makeString("~%~%Failing regression tests (~a):");
        $str250$____Unrunnable_tests_ = makeString("~%~%Unrunnable tests:");
        $str251$_a = makeString("~a");
        $str252$___a_is_unrunnable_for_an_unknown = makeString("~%~a is unrunnable for an unknown reason.");
        $str253$_csv = makeString(".csv");
        $str254$__Writing_csv_to___A__ = makeString("~&Writing csv to: ~A~%");
        $str255$Comment___A__ = makeString("Comment: ~A~%");
        $str256$Date___A__ = makeString("Date: ~A~%");
        $str257$_A__A__A__A__A__A__A___ = makeString("~A,~A,~A,~A,~A,~A,~A,~%");
        $sym258$KCT_ERRORING_TEST_RUN_ = makeSymbol("KCT-ERRORING-TEST-RUN?");
        $sym259$KCT_TEST_RUNNABLE_ = makeSymbol("KCT-TEST-RUNNABLE?");
        $sym260$_RUNSTATE_ISG_ = makeSymbol("*RUNSTATE-ISG*");
        $sym261$_RUNSTATE_INDEX_ = makeSymbol("*RUNSTATE-INDEX*");
        $str262$Unknown_runstate_type___A = makeString("Unknown runstate type: ~A");
        $str263$Runstate_has_no_status___A = makeString("Runstate has no status: ~A");
        $str264$Explanations_aren_t_yet_implement = makeString("Explanations aren't yet implemented.");
        $str265$No_inference_defined_for_this_run = makeString("No inference defined for this runstate: ~A");
        $str266$No_start_defined_for_this_runstat = makeString("No start defined for this runstate: ~A");
        $str267$No_end_defined_for_this_runstate_ = makeString("No end defined for this runstate: ~A");
        $sym268$KEYWORDP = makeSymbol("KEYWORDP");
        $sym269$KBQ_RUNSTATE = makeSymbol("KBQ-RUNSTATE");
        $sym270$KBQ_RUNSTATE_P = makeSymbol("KBQ-RUNSTATE-P");
        $list271 = list(makeSymbol("ID"), makeSymbol("LOCK"), makeSymbol("QUERY-SPEC"), makeSymbol("INFERENCE"), makeSymbol("RESULT"), makeSymbol("TEST-RUNSTATE"), makeSymbol("RUN-STATUS"));
        $list272 = list(makeKeyword("ID"), makeKeyword("LOCK"), makeKeyword("QUERY-SPEC"), makeKeyword("INFERENCE"), makeKeyword("RESULT"), makeKeyword("TEST-RUNSTATE"), makeKeyword("RUN-STATUS"));
        $list273 = list(makeSymbol("KBQR-ID"), makeSymbol("KBQR-LOCK"), makeSymbol("KBQR-QUERY-SPEC"), makeSymbol("KBQR-INFERENCE"), makeSymbol("KBQR-RESULT"), makeSymbol("KBQR-TEST-RUNSTATE"), makeSymbol("KBQR-RUN-STATUS"));
        $list274 = list(makeSymbol("_CSETF-KBQR-ID"), makeSymbol("_CSETF-KBQR-LOCK"), makeSymbol("_CSETF-KBQR-QUERY-SPEC"), makeSymbol("_CSETF-KBQR-INFERENCE"), makeSymbol("_CSETF-KBQR-RESULT"), makeSymbol("_CSETF-KBQR-TEST-RUNSTATE"), makeSymbol("_CSETF-KBQR-RUN-STATUS"));
        $sym275$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym276$KBQ_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KBQ-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE");
        $list277 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KBQ-RUNSTATE-P"));
        $sym278$KBQR_ID = makeSymbol("KBQR-ID");
        $sym279$_CSETF_KBQR_ID = makeSymbol("_CSETF-KBQR-ID");
        $sym280$KBQR_LOCK = makeSymbol("KBQR-LOCK");
        $sym281$_CSETF_KBQR_LOCK = makeSymbol("_CSETF-KBQR-LOCK");
        $sym282$KBQR_QUERY_SPEC = makeSymbol("KBQR-QUERY-SPEC");
        $sym283$_CSETF_KBQR_QUERY_SPEC = makeSymbol("_CSETF-KBQR-QUERY-SPEC");
        $sym284$KBQR_INFERENCE = makeSymbol("KBQR-INFERENCE");
        $sym285$_CSETF_KBQR_INFERENCE = makeSymbol("_CSETF-KBQR-INFERENCE");
        $sym286$KBQR_RESULT = makeSymbol("KBQR-RESULT");
        $sym287$_CSETF_KBQR_RESULT = makeSymbol("_CSETF-KBQR-RESULT");
        $sym288$KBQR_TEST_RUNSTATE = makeSymbol("KBQR-TEST-RUNSTATE");
        $sym289$_CSETF_KBQR_TEST_RUNSTATE = makeSymbol("_CSETF-KBQR-TEST-RUNSTATE");
        $sym290$KBQR_RUN_STATUS = makeSymbol("KBQR-RUN-STATUS");
        $sym291$_CSETF_KBQR_RUN_STATUS = makeSymbol("_CSETF-KBQR-RUN-STATUS");
        $ID = makeKeyword("ID");
        $LOCK = makeKeyword("LOCK");
        $QUERY_SPEC = makeKeyword("QUERY-SPEC");
        $INFERENCE = makeKeyword("INFERENCE");
        $TEST_RUNSTATE = makeKeyword("TEST-RUNSTATE");
        $RUN_STATUS = makeKeyword("RUN-STATUS");
        $str298$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym300$MAKE_KBQ_RUNSTATE = makeSymbol("MAKE-KBQ-RUNSTATE");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym303$VISIT_DEFSTRUCT_OBJECT_KBQ_RUNSTATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KBQ-RUNSTATE-METHOD");
        $sym304$KCT_RUNSTATE_P = makeSymbol("KCT-RUNSTATE-P");
        $str305$KBQ_Runstate_Lock = makeString("KBQ Runstate Lock");
        $NONE = makeKeyword("NONE");
        $sym307$INFERENCE_P = makeSymbol("INFERENCE-P");
        $sym308$KBQ_QUERY_RUN_P = makeSymbol("KBQ-QUERY-RUN-P");
        $sym309$KCT_RUNSTATE = makeSymbol("KCT-RUNSTATE");
        $list310 = list(new SubLObject[] { makeSymbol("ID"), makeSymbol("LOCK"), makeSymbol("TEST-SPEC"), makeSymbol("RESULT"), makeSymbol("QUERY-RUNSTATE"), makeSymbol("TEST-SET-RUNSTATE"), makeSymbol("RUN-STATUS"), makeSymbol("START"), makeSymbol("END") });
        $list311 = list(new SubLObject[] { makeKeyword("ID"), makeKeyword("LOCK"), makeKeyword("TEST-SPEC"), makeKeyword("RESULT"), makeKeyword("QUERY-RUNSTATE"), makeKeyword("TEST-SET-RUNSTATE"), makeKeyword("RUN-STATUS"), makeKeyword("START"), makeKeyword("END") });
        $list312 = list(
                new SubLObject[] { makeSymbol("KCTR-ID"), makeSymbol("KCTR-LOCK"), makeSymbol("KCTR-TEST-SPEC"), makeSymbol("KCTR-RESULT"), makeSymbol("KCTR-QUERY-RUNSTATE"), makeSymbol("KCTR-TEST-SET-RUNSTATE"), makeSymbol("KCTR-RUN-STATUS"), makeSymbol("KCTR-START"), makeSymbol("KCTR-END") });
        $list313 = list(new SubLObject[] { makeSymbol("_CSETF-KCTR-ID"), makeSymbol("_CSETF-KCTR-LOCK"), makeSymbol("_CSETF-KCTR-TEST-SPEC"), makeSymbol("_CSETF-KCTR-RESULT"), makeSymbol("_CSETF-KCTR-QUERY-RUNSTATE"), makeSymbol("_CSETF-KCTR-TEST-SET-RUNSTATE"), makeSymbol("_CSETF-KCTR-RUN-STATUS"),
                makeSymbol("_CSETF-KCTR-START"), makeSymbol("_CSETF-KCTR-END") });
        $sym314$KCT_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KCT-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE");
        $list315 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KCT-RUNSTATE-P"));
        $sym316$KCTR_ID = makeSymbol("KCTR-ID");
        $sym317$_CSETF_KCTR_ID = makeSymbol("_CSETF-KCTR-ID");
        $sym318$KCTR_LOCK = makeSymbol("KCTR-LOCK");
        $sym319$_CSETF_KCTR_LOCK = makeSymbol("_CSETF-KCTR-LOCK");
        $sym320$KCTR_TEST_SPEC = makeSymbol("KCTR-TEST-SPEC");
        $sym321$_CSETF_KCTR_TEST_SPEC = makeSymbol("_CSETF-KCTR-TEST-SPEC");
        $sym322$KCTR_RESULT = makeSymbol("KCTR-RESULT");
        $sym323$_CSETF_KCTR_RESULT = makeSymbol("_CSETF-KCTR-RESULT");
        $sym324$KCTR_QUERY_RUNSTATE = makeSymbol("KCTR-QUERY-RUNSTATE");
        $sym325$_CSETF_KCTR_QUERY_RUNSTATE = makeSymbol("_CSETF-KCTR-QUERY-RUNSTATE");
        $sym326$KCTR_TEST_SET_RUNSTATE = makeSymbol("KCTR-TEST-SET-RUNSTATE");
        $sym327$_CSETF_KCTR_TEST_SET_RUNSTATE = makeSymbol("_CSETF-KCTR-TEST-SET-RUNSTATE");
        $sym328$KCTR_RUN_STATUS = makeSymbol("KCTR-RUN-STATUS");
        $sym329$_CSETF_KCTR_RUN_STATUS = makeSymbol("_CSETF-KCTR-RUN-STATUS");
        $sym330$KCTR_START = makeSymbol("KCTR-START");
        $sym331$_CSETF_KCTR_START = makeSymbol("_CSETF-KCTR-START");
        $sym332$KCTR_END = makeSymbol("KCTR-END");
        $sym333$_CSETF_KCTR_END = makeSymbol("_CSETF-KCTR-END");
        $TEST_SPEC = makeKeyword("TEST-SPEC");
        $QUERY_RUNSTATE = makeKeyword("QUERY-RUNSTATE");
        $TEST_SET_RUNSTATE = makeKeyword("TEST-SET-RUNSTATE");
        $START = makeKeyword("START");
        $sym338$MAKE_KCT_RUNSTATE = makeSymbol("MAKE-KCT-RUNSTATE");
        $sym339$VISIT_DEFSTRUCT_OBJECT_KCT_RUNSTATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KCT-RUNSTATE-METHOD");
        $sym340$KCT_SET_RUNSTATE_P = makeSymbol("KCT-SET-RUNSTATE-P");
        $str341$KCT_Runstate_Lock = makeString("KCT Runstate Lock");
        $sym342$KCT_TEST_RUN_P = makeSymbol("KCT-TEST-RUN-P");
        $sym343$KCT_SET_RUNSTATE = makeSymbol("KCT-SET-RUNSTATE");
        $list344 = list(makeSymbol("ID"), makeSymbol("LOCK"), makeSymbol("TEST-SET"), makeSymbol("RESULT"), makeSymbol("TEST-RUNSTATES"), makeSymbol("RUN-STATUS"), makeSymbol("START"), makeSymbol("END"));
        $list345 = list(makeKeyword("ID"), makeKeyword("LOCK"), makeKeyword("TEST-SET"), makeKeyword("RESULT"), makeKeyword("TEST-RUNSTATES"), makeKeyword("RUN-STATUS"), makeKeyword("START"), makeKeyword("END"));
        $list346 = list(makeSymbol("KCTSR-ID"), makeSymbol("KCTSR-LOCK"), makeSymbol("KCTSR-TEST-SET"), makeSymbol("KCTSR-RESULT"), makeSymbol("KCTSR-TEST-RUNSTATES"), makeSymbol("KCTSR-RUN-STATUS"), makeSymbol("KCTSR-START"), makeSymbol("KCTSR-END"));
        $list347 = list(makeSymbol("_CSETF-KCTSR-ID"), makeSymbol("_CSETF-KCTSR-LOCK"), makeSymbol("_CSETF-KCTSR-TEST-SET"), makeSymbol("_CSETF-KCTSR-RESULT"), makeSymbol("_CSETF-KCTSR-TEST-RUNSTATES"), makeSymbol("_CSETF-KCTSR-RUN-STATUS"), makeSymbol("_CSETF-KCTSR-START"),
                makeSymbol("_CSETF-KCTSR-END"));
        $sym348$KCT_SET_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KCT-SET-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE");
        $list349 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KCT-SET-RUNSTATE-P"));
        $sym350$KCTSR_ID = makeSymbol("KCTSR-ID");
        $sym351$_CSETF_KCTSR_ID = makeSymbol("_CSETF-KCTSR-ID");
        $sym352$KCTSR_LOCK = makeSymbol("KCTSR-LOCK");
        $sym353$_CSETF_KCTSR_LOCK = makeSymbol("_CSETF-KCTSR-LOCK");
        $sym354$KCTSR_TEST_SET = makeSymbol("KCTSR-TEST-SET");
        $sym355$_CSETF_KCTSR_TEST_SET = makeSymbol("_CSETF-KCTSR-TEST-SET");
        $sym356$KCTSR_RESULT = makeSymbol("KCTSR-RESULT");
        $sym357$_CSETF_KCTSR_RESULT = makeSymbol("_CSETF-KCTSR-RESULT");
        $sym358$KCTSR_TEST_RUNSTATES = makeSymbol("KCTSR-TEST-RUNSTATES");
        $sym359$_CSETF_KCTSR_TEST_RUNSTATES = makeSymbol("_CSETF-KCTSR-TEST-RUNSTATES");
        $sym360$KCTSR_RUN_STATUS = makeSymbol("KCTSR-RUN-STATUS");
        $sym361$_CSETF_KCTSR_RUN_STATUS = makeSymbol("_CSETF-KCTSR-RUN-STATUS");
        $sym362$KCTSR_START = makeSymbol("KCTSR-START");
        $sym363$_CSETF_KCTSR_START = makeSymbol("_CSETF-KCTSR-START");
        $sym364$KCTSR_END = makeSymbol("KCTSR-END");
        $sym365$_CSETF_KCTSR_END = makeSymbol("_CSETF-KCTSR-END");
        $TEST_SET = makeKeyword("TEST-SET");
        $TEST_RUNSTATES = makeKeyword("TEST-RUNSTATES");
        $sym368$MAKE_KCT_SET_RUNSTATE = makeSymbol("MAKE-KCT-SET-RUNSTATE");
        $sym369$VISIT_DEFSTRUCT_OBJECT_KCT_SET_RUNSTATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KCT-SET-RUNSTATE-METHOD");
        $sym370$KCT_TEST_COLLECTION_P = makeSymbol("KCT-TEST-COLLECTION-P");
        $str371$KCT_Set_Runstate_Lock = makeString("KCT Set Runstate Lock");
        $sym372$KCT_ERROR_RESULT_P = makeSymbol("KCT-ERROR-RESULT-P");
        $sym373$KCT_TEST_RUN_STATUS = makeSymbol("KCT-TEST-RUN-STATUS");
        $sym374$KCT_FAILURE_RESULT_P = makeSymbol("KCT-FAILURE-RESULT-P");
        $sym375$KCT_TEST_SET_RUN_P = makeSymbol("KCT-TEST-SET-RUN-P");
        $list376 = list(list(makeSymbol("QUERY-SET-RUN"), makeSymbol("QUERY-RUN"), makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list377 = list(makeKeyword("DONE"));
        $DONE = makeKeyword("DONE");
        $sym379$STREAM = makeUninternedSymbol("STREAM");
        $sym380$DONE_VAR = makeUninternedSymbol("DONE-VAR");
        $sym381$PROGN = makeSymbol("PROGN");
        $sym382$CHECK_TYPE = makeSymbol("CHECK-TYPE");
        $list383 = list(makeSymbol("STRINGP"));
        $sym384$WITH_PRIVATE_BINARY_FILE = makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $list385 = list(makeKeyword("INPUT"));
        $sym386$WITH_CFASL_COMMON_SYMBOLS_SIMPLE = makeSymbol("WITH-CFASL-COMMON-SYMBOLS-SIMPLE");
        $list387 = list(makeSymbol("KBQ-CFASL-COMMON-SYMBOLS-SIMPLE"));
        $sym388$WITH_NEW_CFASL_INPUT_GUID_STRING_RESOURCE = makeSymbol("WITH-NEW-CFASL-INPUT-GUID-STRING-RESOURCE");
        $sym389$KBQ_LOAD_QUERY_SET_RUN_INT = makeSymbol("KBQ-LOAD-QUERY-SET-RUN-INT");
        $sym390$CSOME = makeSymbol("CSOME");
        $sym391$WHILE = makeSymbol("WHILE");
        $sym392$CNOT = makeSymbol("CNOT");
        $sym393$KBQ_LOAD_QUERY_RUN_INT = makeSymbol("KBQ-LOAD-QUERY-RUN-INT");
        $sym394$PWHEN = makeSymbol("PWHEN");
        $list395 = list(makeKeyword("EOF"));
        $list396 = list(T);
        $sym397$PUNLESS = makeSymbol("PUNLESS");
        $sym398$KBQ_NCLEAN_QUERY_RUN = makeSymbol("KBQ-NCLEAN-QUERY-RUN");
        $list399 = list(list(makeSymbol("QUERY-RUN"), makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym400$QUERY_SET_RUN = makeUninternedSymbol("QUERY-SET-RUN");
        $sym401$IGNORE = makeSymbol("IGNORE");
        $sym402$STRINGP = makeSymbol("STRINGP");
        $INPUT = makeKeyword("INPUT");
        $EOF = makeKeyword("EOF");
        $str405$dwimming__s_to_NIL = makeString("dwimming ~s to NIL");
        $str406$_cfasl = makeString(".cfasl");
        $str407$_no_results = makeString("-no-results");
        $str408$Expected_a__a_file__got__s = makeString("Expected a ~a file, got ~s");
        $str409$answerable_sub_run_of_____A = makeString("answerable sub-run of :~%~A");
        $sym410$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
        $sym411$KCT_TEST_RUN_ANSWER_COUNT = makeSymbol("KCT-TEST-RUN-ANSWER-COUNT");
        $str412$succeeding_sub_run_of_____A = makeString("succeeding sub-run of :~%~A");
        $sym413$KCT_SUCCESS_RESULT_P = makeSymbol("KCT-SUCCESS-RESULT-P");
        $str414$unanswerable_sub_run_of__ = makeString("unanswerable sub-run of :");
        $sym415$ZEROP = makeSymbol("ZEROP");
        $str416$failing_sub_run_of_____A = makeString("failing sub-run of :~%~A");
        $$CommonSenseTest = makeConstSym(("CommonSenseTest"));
        $$KBContentRegressionTest = makeConstSym(("KBContentRegressionTest"));
        $str419$_s_sub_run_of_____A = makeString("~s sub-run of :~%~A");
        $list420 = list(makeSymbol("FILTERED-QUERY-SET-RUN-1"), makeSymbol("FILTERED-QUERY-SET-RUN-2"));
        $sym421$NOT_EQL = makeSymbol("NOT-EQL");
        $str422$filtered_to_queries = makeString("filtered to queries");
        $sym423$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_NOT_LAMBDA = makeSymbol("KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-NOT-LAMBDA");
        $sym424$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_LAMBDA = makeSymbol("KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-LAMBDA");
        $str425$filtered_to_tests = makeString("filtered to tests");
        $sym426$KCT_FILTER_TEST_SET_RUN_TO_TESTS_NOT_LAMBDA = makeSymbol("KCT-FILTER-TEST-SET-RUN-TO-TESTS-NOT-LAMBDA");
        $sym427$KCT_FILTER_TEST_SET_RUN_TO_TESTS_LAMBDA = makeSymbol("KCT-FILTER-TEST-SET-RUN-TO-TESTS-LAMBDA");
        $sym428$CACHED_ALL_INSTANCES_AMONG = makeSymbol("CACHED-ALL-INSTANCES-AMONG");
        $sym429$_CACHED_ALL_INSTANCES_AMONG_CACHING_STATE_ = makeSymbol("*CACHED-ALL-INSTANCES-AMONG-CACHING-STATE*");
        $sym430$CLEAR_CACHED_ALL_INSTANCES_AMONG = makeSymbol("CLEAR-CACHED-ALL-INSTANCES-AMONG");
        $list431 = cons(makeSymbol("FIRST-QUERY-SET-RUN"), makeSymbol("REST-QUERY-SET-RUNS"));
        $list432 = cons(makeSymbol("FIRST-TEST-SET-RUN"), makeSymbol("REST-TEST-SET-RUNS"));
        $sym433$KCT_SUCCEEDING_TEST_SET_RUN = makeSymbol("KCT-SUCCEEDING-TEST-SET-RUN");
        $sym434$_ = makeSymbol(">");
        $sym435$FOURTH = makeSymbol("FOURTH");
        $sym436$SECOND = makeSymbol("SECOND");
        $list437 = list(makeSymbol("&KEY"), makeSymbol("QUERY"), makeSymbol("MISSING-FROM-1"), makeSymbol("MISSING-FROM-2"));
        $list438 = list(makeKeyword("QUERY"), makeKeyword("MISSING-FROM-1"), makeKeyword("MISSING-FROM-2"));
        $MISSING_FROM_1 = makeKeyword("MISSING-FROM-1");
        $MISSING_FROM_2 = makeKeyword("MISSING-FROM-2");
        $ANSWERABLE_2 = makeKeyword("ANSWERABLE-2");
        $MORE_ANSWERS_2 = makeKeyword("MORE-ANSWERS-2");
        $DIFFERENT_ANSWERS = makeKeyword("DIFFERENT-ANSWERS");
        $MORE_ANSWERS_1 = makeKeyword("MORE-ANSWERS-1");
        $ANSWERABLE_1 = makeKeyword("ANSWERABLE-1");
        $str446$_S_and__S_are_different_queries = makeString("~S and ~S are different queries");
        $str447$_S_has_no_result = makeString("~S has no result");
        $str448$query_set_runs_contained_differen = makeString("query set runs contained different queries");
        $str449$_s__s__s__s__s__ = makeString("~s ~s ~s ~s ~s~%");
        $str450$_s__s__s__ = makeString("~s ~s ~s~%");
        $CHANGE = makeKeyword("CHANGE");
        $BECAME_SUCCESS = makeKeyword("BECAME-SUCCESS");
        $BECAME_FAILURE = makeKeyword("BECAME-FAILURE");
        $str454$unexpected_change__S = makeString("unexpected change ~S");
        $str455$_S_and__S_are_different_tests = makeString("~S and ~S are different tests");
        $str456$_S_has_no_status = makeString("~S has no status");
        $UNDEFINED = makeKeyword("UNDEFINED");
        $list458 = list(new SubLObject[] { makeKeyword("TOTAL"), makeKeyword("INCREASE"), makeKeyword("TOTAL-SUCCESS"), makeKeyword("INCREASE"), makeKeyword("TOTAL-FAILURE"), makeKeyword("DECREASE"), makeKeyword("TOTAL-ERROR"), makeKeyword("DECREASE"), makeKeyword("TOTAL-LUMPY"),
                makeKeyword("DECREASE"), makeKeyword("TOTAL-ANSWERABLE"), makeKeyword("INCREASE"), makeKeyword("TOTAL-UNANSWERABLE"), makeKeyword("DECREASE"), makeKeyword("SUM-ANSWER-COUNT"), makeKeyword("INCREASE"), makeKeyword("MEAN-ANSWER-COUNT"), makeKeyword("INCREASE"),
                makeKeyword("MEDIAN-ANSWER-COUNT"), makeKeyword("INCREASE"), makeKeyword("MEAN-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("STDEV-TIME-TO-FIRST-ANSWER"), makeKeyword("NEITHER"),
                makeKeyword("MEAN-COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("STDEV-COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("NEITHER"), makeKeyword("MEAN-TIME-TO-LAST-ANSWER"),
                makeKeyword("DECREASE"), makeKeyword("MEDIAN-TIME-TO-LAST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("STDEV-TIME-TO-LAST-ANSWER"), makeKeyword("NEITHER"), makeKeyword("SUM-ANSWERABILITY-TIME"), makeKeyword("DECREASE"), makeKeyword("MEAN-ANSWERABILITY-TIME"),
                makeKeyword("DECREASE"), makeKeyword("STDEV-ANSWERABILITY-TIME"), makeKeyword("NEITHER"), makeKeyword("MEDIAN-ANSWERABILITY-TIME"), makeKeyword("DECREASE"), makeKeyword("SUM-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("MEAN-TOTAL-TIME"), makeKeyword("DECREASE"),
                makeKeyword("STDEV-TOTAL-TIME"), makeKeyword("NEITHER"), makeKeyword("MEDIAN-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("SUM-COMPLETE-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("MEAN-COMPLETE-TOTAL-TIME"), makeKeyword("DECREASE"),
                makeKeyword("STDEV-COMPLETE-TOTAL-TIME"), makeKeyword("NEITHER"), makeKeyword("MEDIAN-COMPLETE-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-TIME-PER-ANSWER"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-COMPLETE-TIME-PER-ANSWER"), makeKeyword("DECREASE") });
        $list459 = list(makeKeyword("INCREASE"), makeKeyword("DECREASE"), makeKeyword("NEITHER"));
        $NEITHER = makeKeyword("NEITHER");
        $INCREASE = makeKeyword("INCREASE");
        $str462$empty__ = makeString("empty~%");
        $TOTAL = makeKeyword("TOTAL");
        $TOTAL_ANSWERABLE = makeKeyword("TOTAL-ANSWERABLE");
        $TOTAL_UNANSWERABLE = makeKeyword("TOTAL-UNANSWERABLE");
        $TOTAL_ERROR = makeKeyword("TOTAL-ERROR");
        $TOTAL_LUMPY = makeKeyword("TOTAL-LUMPY");
        $SUM_ANSWER_COUNT = makeKeyword("SUM-ANSWER-COUNT");
        $MEAN_ANSWER_COUNT = makeKeyword("MEAN-ANSWER-COUNT");
        $MEDIAN_ANSWER_COUNT = makeKeyword("MEDIAN-ANSWER-COUNT");
        $SUM_HYPOTHESIZATION_TIME = makeKeyword("SUM-HYPOTHESIZATION-TIME");
        $STDEV_HYPOTHESIZATION_TIME = makeKeyword("STDEV-HYPOTHESIZATION-TIME");
        $SUM_TOTAL_TIME = makeKeyword("SUM-TOTAL-TIME");
        $STDEV_TOTAL_TIME = makeKeyword("STDEV-TOTAL-TIME");
        $SUM_COMPLETE_TOTAL_TIME = makeKeyword("SUM-COMPLETE-TOTAL-TIME");
        $MEAN_COMPLETE_TOTAL_TIME = makeKeyword("MEAN-COMPLETE-TOTAL-TIME");
        $MEDIAN_COMPLETE_TOTAL_TIME = makeKeyword("MEDIAN-COMPLETE-TOTAL-TIME");
        $STDEV_COMPLETE_TOTAL_TIME = makeKeyword("STDEV-COMPLETE-TOTAL-TIME");
        $SUM_TIME_TO_FIRST_ANSWER = makeKeyword("SUM-TIME-TO-FIRST-ANSWER");
        $STDEV_TIME_TO_FIRST_ANSWER = makeKeyword("STDEV-TIME-TO-FIRST-ANSWER");
        $SUM_COMPLETE_TIME_TO_FIRST_ANSWER = makeKeyword("SUM-COMPLETE-TIME-TO-FIRST-ANSWER");
        $MEAN_COMPLETE_TIME_TO_FIRST_ANSWER = makeKeyword("MEAN-COMPLETE-TIME-TO-FIRST-ANSWER");
        $MEDIAN_COMPLETE_TIME_TO_FIRST_ANSWER = makeKeyword("MEDIAN-COMPLETE-TIME-TO-FIRST-ANSWER");
        $STDEV_COMPLETE_TIME_TO_FIRST_ANSWER = makeKeyword("STDEV-COMPLETE-TIME-TO-FIRST-ANSWER");
        $SUM_ANSWERABILITY_TIME = makeKeyword("SUM-ANSWERABILITY-TIME");
        $MEAN_ANSWERABILITY_TIME = makeKeyword("MEAN-ANSWERABILITY-TIME");
        $MEDIAN_ANSWERABILITY_TIME = makeKeyword("MEDIAN-ANSWERABILITY-TIME");
        $STDEV_ANSWERABILITY_TIME = makeKeyword("STDEV-ANSWERABILITY-TIME");
        $SUM_TIME_TO_LAST_ANSWER = makeKeyword("SUM-TIME-TO-LAST-ANSWER");
        $STDEV_TIME_TO_LAST_ANSWER = makeKeyword("STDEV-TIME-TO-LAST-ANSWER");
        $MEDIAN_COMPLETE_TIME_PER_ANSWER = makeKeyword("MEDIAN-COMPLETE-TIME-PER-ANSWER");
        $str492$ignoring_metric__S = makeString("ignoring metric ~S");
        $MEDIAN_TIME_PER_ANSWER = makeKeyword("MEDIAN-TIME-PER-ANSWER");
        $TOTAL_SUCCESS = makeKeyword("TOTAL-SUCCESS");
        $TOTAL_FAILURE = makeKeyword("TOTAL-FAILURE");
        $PERCENT_SUCCESS = makeKeyword("PERCENT-SUCCESS");
        $PERCENT_FAILURE = makeKeyword("PERCENT-FAILURE");
        $sym498$KCT_TEST_RUN_QUERY_RUN = makeSymbol("KCT-TEST-RUN-QUERY-RUN");
        $list499 = list(makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("COMPLETE-TOTAL-TIME"), makeKeyword("ANSWERABILITY-TIME"), makeKeyword("ANSWER-COUNT"));
        $str500$_0 = makeString(":0");
        $sym501$BOUND_SYMBOL_P = makeSymbol("BOUND-SYMBOL-P");
        $str502$____Answerability_analysis____ = makeString("~%~%Answerability analysis: ~%");
        $str503$Total_____________s__s__s__ = makeString("Total:           ~s ~s ~s~%");
        $str504$____Basic_analysis____ = makeString("~%~%Basic analysis: ~%");
        $str505$____Mutually_Answerable____ = makeString("~%~%Mutually Answerable: ~%");
        $str506$____Answerable____ = makeString("~%~%Answerable: ~%");
        $str507$____Unanswerable____ = makeString("~%~%Unanswerable: ~%");
        $list508 = list(makeKeyword("BOTH"), makeKeyword("BASELINE"));
        $str509$Mutually_Answerable_ = makeString("Mutually Answerable ");
        $sym510$KBQ_LUMPY_QUERY_RUN_ = makeSymbol("KBQ-LUMPY-QUERY-RUN?");
        $str511$Unable_to_compute_any_metrics = makeString("Unable to compute any metrics");
        $sym512$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
        $str513$_____Total_Tests____4D = makeString("~%;; Total Tests : ~4D");
        $str514$______Successes_____4D___S___ = makeString("~%;;  Successes  : ~4D (~S %)");
        $str515$______Failures______4D___S___ = makeString("~%;;  Failures   : ~4D (~S %)");
        $str516$_______Test_Set_Metrics__ = makeString("~%~%;; Test Set Metrics~%");
        $str517$____Test____S = makeString("~%~%Test : ~S");
        $str518$__Status____S = makeString("~%Status : ~S");
        $str519$__Halt_Reason____S = makeString("~%Halt Reason : ~S");
        $str520$___S__S = makeString("~%~S ~S");
        $sym521$KBQ_QUERY_RUN_HALT_REASON = makeSymbol("KBQ-QUERY-RUN-HALT-REASON");
        $list522 = list(makeKeyword("TOTAL"), ZERO_INTEGER);
        $int$3600 = makeInteger(3600);
        $str524$Running_kbq_benchmark__kbq_benchm = makeString("Running kbq benchmark (kbq-benchmark-report ");
        $str525$_ = makeString(")");
        $sym526$KBQ_BENCHMARK_RUN = makeSymbol("KBQ-BENCHMARK-RUN");
        $str527$kbq_benchmark__kbq_benchmark_repo = makeString("kbq benchmark (kbq-benchmark-report ~S) in background");
        $sym528$FORT_P = makeSymbol("FORT-P");
        $sym529$LISTP = makeSymbol("LISTP");
        $str530$_______A______ = makeString("~&*** ~A ***~%");
        $str531$____overriding_query_properties__ = makeString("*** overriding-query-properties: ~A ***~%");
        $str532$Tests_run_in_System__A_KB__A__ = makeString("Tests run in System ~A KB ~A~%");
        $$TheSet = makeConstSym(("TheSet"));
        $sym534$KCT_QUERY_SPECIFICATION = makeSymbol("KCT-QUERY-SPECIFICATION");
        $list535 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("SKSI-QUERY-TOTAL-TIME"), makeKeyword("SKSI-QUERY-START-TIMES"), makeKeyword("TOTAL-TIME"));
        $str536$__ANS__TTFS____TTFA__SQ____SKSI__ = makeString(" #ANS  TTFS    TTFA #SQ    SKSI +  CYC =  TOTAL   (%SQ)  TEST~%");
        $str537$_________________________________ = makeString("---------------------------------------------------------------------~%");
        $SKSI_QUERY_START_TIMES = makeKeyword("SKSI-QUERY-START-TIMES");
        $SKSI_QUERY_TOTAL_TIME = makeKeyword("SKSI-QUERY-TOTAL-TIME");
        $str540$_5D__5_1F__7_1F_4D__7_1F__7_1F__7 = makeString("~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%) ~A~A~%");
        $EXHAUST_TOTAL = makeKeyword("EXHAUST-TOTAL");
        $str542$___A_ = makeString(" (~A)");
        $str543$_5D__5_1F__7_1F_4D__7_1F__7_1F__7 = makeString("~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%)~%");
        $list544 = list(makeString("/"));
        $int$60 = makeInteger(60);
        $str546$_15A___5D__5_1F__7_1F_4D__7_1F__7 = makeString("~15A: ~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%) ~30A~%");
        $str547$Running__A_queries_using__proof_s = makeString("Running ~A queries using :proof-specs");
        $PROOF_SPEC = makeKeyword("PROOF-SPEC");
        $COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $str550$______Test___A = makeString("~&~%~%Test: ~A");
        $str551$__Query___A = makeString("~&Query: ~A");
        $$True = makeConstSym(("True"));
        $str553$____Answer___A__A____A = makeString("~&~%Answer (~A/~A): ~A");
        $str554$__Justification__ = makeString("~&Justification: ");
        $sym555$UNKNOWN_SENTENCE_SUPPORT_P = makeSymbol("UNKNOWN-SENTENCE-SUPPORT-P");
        $sym556$SUPPORT_MT = makeSymbol("SUPPORT-MT");
        $sym557$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE>");
        $$UniversalVocabularyMt = makeConstSym(("UniversalVocabularyMt"));
        $str559$___Mt___A = makeString("~& Mt: ~A");
        $$BaseKB = makeConstSym(("BaseKB"));
        $$unknownSentence = makeConstSym(("unknownSentence"));
        $sym562$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $$SKSIContentTest = makeConstSym(("SKSIContentTest"));
        $BREADTH = makeKeyword("BREADTH");
        $QUEUE = makeKeyword("QUEUE");
        $STACK = makeKeyword("STACK");
        $sym567$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $str568$_A_is_not_a__A = makeString("~A is not a ~A");
        $sym569$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
        $CERROR = makeKeyword("CERROR");
        $str571$continue_anyway = makeString("continue anyway");
        $WARN = makeKeyword("WARN");
        $str573$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
        $str574$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");
        $str575$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list576 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
        $str577$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $GAF = makeKeyword("GAF");
        $str579$_a___s____ = makeString("~a~%~s~%~%");
        $str580$__________Overview___________All_ = makeString("\n========\nOverview\n========\n\nAll #$SKSIContentTests~%");
        $str581$__All___SKSIContentTests_marked_a = makeString("~%All #$SKSIContentTests marked as #$KBContentRegressionTests~%");
        $str582$____SKSIContentTests_using_source = makeString("~%#$SKSIContentTests using sources we care about ~a~%");
        $str583$____SKSIContentTests_marked_as___ = makeString("~%#$SKSIContentTests marked as #$KBContentRegressionTests using sources we care about~%");
        $str584$______________________Breakdown_b = makeString("\n\n===================\nBreakdown by source\n===================~%~%");
        $str585$_a__ = makeString("~a~%");
        $str586$_ = makeString("-");
        $str587$______SKSIContentTests_that_use__ = makeString("~%~%#$SKSIContentTests that use ~a~%");
        $str588$____SKSIContentTests_marked_as___ = makeString("~%#$SKSIContentTests marked as #$KBContentRegressionTests that use ~a~%");
        $str589$__Failure_analysis_______ = makeString("~%Failure analysis:~%~%~%");
        $list590 = list(
                new SubLObject[] { makeConstSym(("TheSet")), list(makeConstSym(("QueryFn"))), list(makeConstSym(("QueryFn")), list(makeConstSym(("Quote")), list(makeConstSym(("ist")), makeConstSym(("BaseKB")), list(makeConstSym(("isa")))))),
                        list(makeConstSym(("QueryFn")), list(makeConstSym(("Quote")), list(makeConstSym(("ist")), makeConstSym(("BaseKB")), list(makeConstSym(("and")))))), list(makeConstSym(("QueryFn")), list(makeConstSym(("Quote")), list(makeConstSym(("or"))))),
                        list(makeConstSym(("QueryFn")), list(makeConstSym(("Quote")), list(makeConstSym(("ist")), makeConstSym(("BaseKB")), list(makeConstSym(("isa")), makeInteger(212), makeConstSym(("Dog")))))),
                        list(makeConstSym(("QueryFn")), list(makeConstSym(("Quote")), list(makeConstSym(("trueSubL")), list(makeConstSym(("SubLQuoteFn")), list(makeSymbol("WITH-INFERENCE-ERROR-HANDLING"), list(makeSymbol("ERROR"), makeString("zyxwvut"))))))),
                        list(makeConstSym(("QueryFn")),
                                list(makeConstSym(("Quote")), list(makeConstSym(("and")), list(makeConstSym(("integerBetween")), ONE_INTEGER, makeSymbol("?N"), TWO_INTEGER),
                                        list(makeConstSym(("performSubL")),
                                                list(makeConstSym(("ExpandSubLFn")), list(makeSymbol("?N")), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("?N"), TWO_INTEGER), list(makeSymbol("WITH-INFERENCE-ERROR-HANDLING"), list(makeSymbol("ERROR"), makeString("zyxwvut"))))))))),
                        list(makeConstSym(("QueryFn")), list(makeConstSym(("Quote")), list(makeConstSym(("performSubL")), list(makeConstSym(("SubLQuoteFn")), list(makeSymbol("SLEEP"), FOUR_INTEGER))))), list(makeConstSym(("QueryFn")), list(makeConstSym(("Quote")),
                                list(makeConstSym(("and")), list(makeConstSym(("integerBetween")), ONE_INTEGER, makeSymbol("?N"), TWO_INTEGER), list(makeConstSym(("performSubL")), list(makeConstSym(("ExpandSubLFn")), list(makeSymbol("?N")), list(makeSymbol("SLEEP"), TWO_INTEGER)))))) });
        $sym591$COMPUTE_NEW_ROOT_RELATIVE_ANSWER_TIMES = makeSymbol("COMPUTE-NEW-ROOT-RELATIVE-ANSWER-TIMES");
        $OWNER = makeKeyword("OWNER");
        $CLASSES = makeKeyword("CLASSES");
        $KB = makeKeyword("KB");
        $TINY = makeKeyword("TINY");
        $WORKING_ = makeKeyword("WORKING?");
        $list597 = list(
                list(list(list(ZERO_INTEGER, TEN_INTEGER, TWENTY_INTEGER, makeInteger(30), makeInteger(40), makeInteger(50), makeInteger(500)), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeInteger(35), makeInteger(36), makeInteger(212))),
                        list(list(ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER), list(THREE_INTEGER, FIVE_INTEGER, SIX_INTEGER), list(FIVE_INTEGER, makeInteger(162)))),
                list(list(list(ZERO_INTEGER, TEN_INTEGER, TWENTY_INTEGER, makeInteger(30), makeInteger(40), makeInteger(50)), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeInteger(35), makeInteger(36), makeInteger(212))),
                        list(list(ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER), list(THREE_INTEGER, FIVE_INTEGER, SIX_INTEGER), list(FIVE_INTEGER, makeInteger(162)))));
    }

    public static class $kbq_runstate_native extends SubLStructNative {
        public SubLObject $id;
        public SubLObject $lock;
        public SubLObject $query_spec;
        public SubLObject $inference;
        public SubLObject $result;
        public SubLObject $test_runstate;
        public SubLObject $run_status;
        private static SubLStructDeclNative structDecl;

        public $kbq_runstate_native() {
            this.$id = CommonSymbols.NIL;
            this.$lock = CommonSymbols.NIL;
            this.$query_spec = CommonSymbols.NIL;
            this.$inference = CommonSymbols.NIL;
            this.$result = CommonSymbols.NIL;
            this.$test_runstate = CommonSymbols.NIL;
            this.$run_status = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $kbq_runstate_native.structDecl;
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
        public SubLObject setField2(SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$query_spec = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$inference = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$result = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$test_runstate = value;
        }

        @Override
        public SubLObject setField8(SubLObject value) {
            return this.$run_status = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($kbq_runstate_native.class, $sym269$KBQ_RUNSTATE, $sym270$KBQ_RUNSTATE_P, $list271, $list272, new String[] { "$id", "$lock", "$query_spec", "$inference", "$result", "$test_runstate", "$run_status" }, $list273, $list274,
                    $sym275$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $kbq_runstate_p$UnaryFunction extends UnaryFunction {
        public $kbq_runstate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KBQ-RUNSTATE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return kbq_runstate_p(arg1);
        }
    }

    public static class $kct_runstate_native extends SubLStructNative {
        public SubLObject $id;
        public SubLObject $lock;
        public SubLObject $test_spec;
        public SubLObject $result;
        public SubLObject $query_runstate;
        public SubLObject $test_set_runstate;
        public SubLObject $run_status;
        public SubLObject $start;
        public SubLObject $end;
        private static SubLStructDeclNative structDecl;

        public $kct_runstate_native() {
            this.$id = CommonSymbols.NIL;
            this.$lock = CommonSymbols.NIL;
            this.$test_spec = CommonSymbols.NIL;
            this.$result = CommonSymbols.NIL;
            this.$query_runstate = CommonSymbols.NIL;
            this.$test_set_runstate = CommonSymbols.NIL;
            this.$run_status = CommonSymbols.NIL;
            this.$start = CommonSymbols.NIL;
            this.$end = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $kct_runstate_native.structDecl;
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
        public SubLObject setField2(SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$test_spec = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$result = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$query_runstate = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$test_set_runstate = value;
        }

        @Override
        public SubLObject setField8(SubLObject value) {
            return this.$run_status = value;
        }

        @Override
        public SubLObject setField9(SubLObject value) {
            return this.$start = value;
        }

        @Override
        public SubLObject setField10(SubLObject value) {
            return this.$end = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($kct_runstate_native.class, $sym309$KCT_RUNSTATE, $sym304$KCT_RUNSTATE_P, $list310, $list311, new String[] { "$id", "$lock", "$test_spec", "$result", "$query_runstate", "$test_set_runstate", "$run_status", "$start", "$end" }, $list312,
                    $list313, $sym275$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $kct_runstate_p$UnaryFunction extends UnaryFunction {
        public $kct_runstate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KCT-RUNSTATE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return kct_runstate_p(arg1);
        }
    }

    public static class $kct_set_runstate_native extends SubLStructNative {
        public SubLObject $id;
        public SubLObject $lock;
        public SubLObject $test_set;
        public SubLObject $result;
        public SubLObject $test_runstates;
        public SubLObject $run_status;
        public SubLObject $start;
        public SubLObject $end;
        private static SubLStructDeclNative structDecl;

        public $kct_set_runstate_native() {
            this.$id = CommonSymbols.NIL;
            this.$lock = CommonSymbols.NIL;
            this.$test_set = CommonSymbols.NIL;
            this.$result = CommonSymbols.NIL;
            this.$test_runstates = CommonSymbols.NIL;
            this.$run_status = CommonSymbols.NIL;
            this.$start = CommonSymbols.NIL;
            this.$end = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $kct_set_runstate_native.structDecl;
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
        public SubLObject setField2(SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$test_set = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$result = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$test_runstates = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$run_status = value;
        }

        @Override
        public SubLObject setField8(SubLObject value) {
            return this.$start = value;
        }

        @Override
        public SubLObject setField9(SubLObject value) {
            return this.$end = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($kct_set_runstate_native.class, $sym343$KCT_SET_RUNSTATE, $sym340$KCT_SET_RUNSTATE_P, $list344, $list345, new String[] { "$id", "$lock", "$test_set", "$result", "$test_runstates", "$run_status", "$start", "$end" }, $list346, $list347,
                    $sym275$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $kct_set_runstate_p$UnaryFunction extends UnaryFunction {
        public $kct_set_runstate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KCT-SET-RUNSTATE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return kct_set_runstate_p(arg1);
        }
    }

    public static class $clear_cached_all_instances_among$ZeroArityFunction extends ZeroArityFunction {
        public $clear_cached_all_instances_among$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-CACHED-ALL-INSTANCES-AMONG"));
        }

        @Override
        public SubLObject processItem() {
            return clear_cached_all_instances_among();
        }
    }


}
/*
 *
 * Total time: 5514 ms synthetic
 */