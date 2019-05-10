package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.dumper;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.unification;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.defns;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.browser.problem_store_visualization;
import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_metrics
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_metrics";
  public static final String myFingerPrint = "5eb7b787818f976a2a46d47d8fabeb46a3b6272be975f5d01b3a72a01a7d7f12";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLSymbol $dtp_inference_metric$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 3604L)
  private static SubLSymbol $inference_metrics_store$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 3823L)
  private static SubLSymbol $inference_metric_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 18150L)
  private static SubLSymbol $problem_store_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 18598L)
  private static SubLSymbol $forward_problem_store_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 19312L)
  private static SubLSymbol $maximum_problem_store_historical_problem_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 20339L)
  private static SubLSymbol $maximum_forward_problem_store_historical_problem_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 20643L)
  private static SubLSymbol $expensive_forward_problem_store_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 21695L)
  private static SubLSymbol $problem_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 22099L)
  private static SubLSymbol $good_problem_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 22730L)
  private static SubLSymbol $no_good_problem_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 23168L)
  private static SubLSymbol $forward_problem_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 23751L)
  private static SubLSymbol $single_literal_problem_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24407L)
  private static SubLSymbol $problem_link_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24651L)
  private static SubLSymbol $structural_link_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24858L)
  private static SubLSymbol $content_link_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 25053L)
  private static SubLSymbol $removal_link_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 25248L)
  private static SubLSymbol $transformation_link_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 26017L)
  private static SubLSymbol $dependent_link_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 26438L)
  private static SubLSymbol $single_literal_problem_dependent_link_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 29094L)
  private static SubLSymbol $tactic_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 29611L)
  private static SubLSymbol $executed_tactic_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 30025L)
  private static SubLSymbol $discarded_tactic_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 30447L)
  private static SubLSymbol $unification_attempt_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 31073L)
  private static SubLSymbol $unification_success_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 31513L)
  private static SubLSymbol $sbhl_cache_attempt_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 31996L)
  private static SubLSymbol $sbhl_cache_success_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 32438L)
  private static SubLSymbol $sbhl_graph_attempt_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 32918L)
  private static SubLSymbol $sbhl_graph_success_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 33357L)
  private static SubLSymbol $sbhl_link_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 33770L)
  private static SubLSymbol $proof_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 34130L)
  private static SubLSymbol $inference_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 34894L)
  private static SubLSymbol $successful_inference_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 35343L)
  private static SubLSymbol $forward_inference_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 35965L)
  private static SubLSymbol $successful_forward_inference_historical_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 37590L)
  public static SubLSymbol $force_inference_tick_indexed_progress_data_collectionP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 41231L)
  public static SubLSymbol $force_inference_hl_module_times_data_collectionP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 48080L)
  public static SubLSymbol $gathering_forward_inference_metricsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 48305L)
  public static SubLSymbol $forward_inference_last_metric_time$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 49395L)
  private static SubLSymbol $forward_inference_metrics_time_index$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 49838L)
  private static SubLSymbol $forward_inference_metrics_count_index$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 50113L)
  private static SubLSymbol $forward_inference_metrics_inference_index$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 50714L)
  private static SubLSymbol $forward_inference_metrics_gaf_index$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 50958L)
  private static SubLSymbol $forward_inference_metrics_successful_rule_index$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 54111L)
  private static SubLSymbol $get_forward_inference_metric_type_and_metric_list_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 54272L)
  public static SubLSymbol $forward_inference_metrics_lock$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$INFERENCE_METRIC;
  private static final SubLSymbol $sym2$INFERENCE_METRIC_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_INFERENCE_METRIC;
  private static final SubLSymbol $sym8$INFERENCE_METRIC_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$INF_METRIC_NAME;
  private static final SubLSymbol $sym11$_CSETF_INF_METRIC_NAME;
  private static final SubLSymbol $sym12$INF_METRIC_EVALUATION_FUNC;
  private static final SubLSymbol $sym13$_CSETF_INF_METRIC_EVALUATION_FUNC;
  private static final SubLSymbol $sym14$INF_METRIC_EVALUATION_ARG1;
  private static final SubLSymbol $sym15$_CSETF_INF_METRIC_EVALUATION_ARG1;
  private static final SubLSymbol $sym16$INF_METRIC_CROSS_PRODUCT_;
  private static final SubLSymbol $sym17$_CSETF_INF_METRIC_CROSS_PRODUCT_;
  private static final SubLSymbol $kw18$NAME;
  private static final SubLSymbol $kw19$EVALUATION_FUNC;
  private static final SubLSymbol $kw20$EVALUATION_ARG1;
  private static final SubLSymbol $kw21$CROSS_PRODUCT_;
  private static final SubLString $str22$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw23$BEGIN;
  private static final SubLSymbol $sym24$MAKE_INFERENCE_METRIC;
  private static final SubLSymbol $kw25$SLOT;
  private static final SubLSymbol $kw26$END;
  private static final SubLSymbol $sym27$VISIT_DEFSTRUCT_OBJECT_INFERENCE_METRIC_METHOD;
  private static final SubLString $str28$_INFERENCE_METRIC___s_;
  private static final SubLSymbol $sym29$KEYWORDP;
  private static final SubLSymbol $sym30$SYMBOLP;
  private static final SubLSymbol $sym31$INFERENCE_METRIC_EVALUATION_ARG1_P;
  private static final SubLSymbol $sym32$BOOLEANP;
  private static final SubLSymbol $sym33$INFERENCE_P;
  private static final SubLSymbol $sym34$PROBLEM_STORE_P;
  private static final SubLSymbol $kw35$STORE;
  private static final SubLSymbol $kw36$INFERENCE;
  private static final SubLString $str37$Unhandled_inference_metric_evalua;
  private static final SubLSymbol $sym38$_INFERENCE_METRICS_STORE_;
  private static final SubLList $list39;
  private static final SubLSymbol $kw40$ANSWER_COUNT;
  private static final SubLSymbol $sym41$INFERENCE_ANSWER_COUNT;
  private static final SubLSymbol $kw42$ANSWER_COUNT_AT_30_SECONDS;
  private static final SubLSymbol $sym43$INFERENCE_ANSWER_COUNT_AT_30_SECONDS;
  private static final SubLSymbol $kw44$ANSWER_COUNT_AT_60_SECONDS;
  private static final SubLSymbol $sym45$INFERENCE_ANSWER_COUNT_AT_60_SECONDS;
  private static final SubLSymbol $kw46$TIME_TO_FIRST_ANSWER;
  private static final SubLSymbol $sym47$INFERENCE_FIRST_ANSWER_ELAPSED_TIME;
  private static final SubLSymbol $kw48$TIME_TO_LAST_ANSWER;
  private static final SubLSymbol $sym49$INFERENCE_LAST_ANSWER_ELAPSED_TIME;
  private static final SubLSymbol $kw50$HYPOTHESIZATION_TIME;
  private static final SubLSymbol $sym51$INFERENCE_HYPOTHESIZATION_TIME;
  private static final SubLSymbol $kw52$TOTAL_TIME;
  private static final SubLSymbol $sym53$INFERENCE_CUMULATIVE_TIME;
  private static final SubLSymbol $kw54$TIME_PER_ANSWER;
  private static final SubLSymbol $sym55$INFERENCE_TIME_PER_ANSWER;
  private static final SubLSymbol $kw56$STEPS_TO_FIRST_ANSWER;
  private static final SubLSymbol $sym57$INFERENCE_FIRST_ANSWER_STEP_COUNT;
  private static final SubLSymbol $kw58$STEPS_TO_LAST_ANSWER;
  private static final SubLSymbol $sym59$INFERENCE_LAST_ANSWER_STEP_COUNT;
  private static final SubLSymbol $kw60$TOTAL_STEPS;
  private static final SubLSymbol $sym61$INFERENCE_CUMULATIVE_STEP_COUNT;
  private static final SubLSymbol $kw62$STEPS_PER_ANSWER;
  private static final SubLSymbol $sym63$INFERENCE_STEPS_PER_ANSWER;
  private static final SubLSymbol $kw64$WASTED_TIME_AFTER_LAST_ANSWER;
  private static final SubLSymbol $sym65$INFERENCE_WASTED_TIME_AFTER_LAST_ANSWER;
  private static final SubLSymbol $kw66$LATENCY_IMPROVEMENT_FROM_ITERATIVITY;
  private static final SubLSymbol $sym67$INFERENCE_LATENCY_IMPROVEMENT_FROM_ITERATIVITY;
  private static final SubLSymbol $kw68$PROBLEM_COUNT;
  private static final SubLSymbol $sym69$PROBLEM_STORE_PROBLEM_COUNT;
  private static final SubLSymbol $kw70$PROBLEM_STORE_PROBLEM_COUNT;
  private static final SubLSymbol $kw71$PROOF_COUNT;
  private static final SubLSymbol $sym72$PROBLEM_STORE_PROOF_COUNT;
  private static final SubLSymbol $kw73$PROBLEM_STORE_PROOF_COUNT;
  private static final SubLSymbol $kw74$LINK_COUNT;
  private static final SubLSymbol $sym75$PROBLEM_STORE_LINK_COUNT;
  private static final SubLSymbol $kw76$TACTIC_COUNT;
  private static final SubLSymbol $sym77$PROBLEM_STORE_TACTIC_COUNT;
  private static final SubLSymbol $kw78$POSSIBLE_TACTIC_COUNT;
  private static final SubLSymbol $sym79$PROBLEM_STORE_POSSIBLE_TACTIC_COUNT;
  private static final SubLSymbol $kw80$EXECUTED_TACTIC_COUNT;
  private static final SubLSymbol $sym81$PROBLEM_STORE_EXECUTED_TACTIC_COUNT;
  private static final SubLSymbol $kw82$TACTIC_EXECUTION_COUNT;
  private static final SubLSymbol $sym83$PROBLEM_STORE_TACTIC_EXECUTION_COUNT;
  private static final SubLSymbol $kw84$DISCARDED_TACTIC_COUNT;
  private static final SubLSymbol $sym85$PROBLEM_STORE_DISCARDED_TACTIC_COUNT;
  private static final SubLSymbol $kw86$CONTENT_LINK_COUNT;
  private static final SubLSymbol $sym87$PROBLEM_STORE_CONTENT_LINK_COUNT;
  private static final SubLSymbol $kw88$REMOVAL_LINK_COUNT;
  private static final SubLSymbol $sym89$PROBLEM_STORE_REMOVAL_LINK_COUNT;
  private static final SubLSymbol $kw90$REWRITE_LINK_COUNT;
  private static final SubLSymbol $sym91$PROBLEM_STORE_REWRITE_LINK_COUNT;
  private static final SubLSymbol $kw92$TRANSFORMATION_LINK_COUNT;
  private static final SubLSymbol $sym93$PROBLEM_STORE_TRANSFORMATION_LINK_COUNT;
  private static final SubLSymbol $kw94$STRUCTURAL_LINK_COUNT;
  private static final SubLSymbol $sym95$PROBLEM_STORE_STRUCTURAL_LINK_COUNT;
  private static final SubLSymbol $kw96$JOIN_ORDERED_LINK_COUNT;
  private static final SubLSymbol $sym97$PROBLEM_STORE_JOIN_ORDERED_LINK_COUNT;
  private static final SubLSymbol $kw98$JOIN_LINK_COUNT;
  private static final SubLSymbol $sym99$PROBLEM_STORE_JOIN_LINK_COUNT;
  private static final SubLSymbol $kw100$SPLIT_LINK_COUNT;
  private static final SubLSymbol $sym101$PROBLEM_STORE_SPLIT_LINK_COUNT;
  private static final SubLSymbol $kw102$RESTRICTION_LINK_COUNT;
  private static final SubLSymbol $sym103$PROBLEM_STORE_RESTRICTION_LINK_COUNT;
  private static final SubLSymbol $kw104$RESIDUAL_TRANSFORMATION_LINK_COUNT;
  private static final SubLSymbol $sym105$PROBLEM_STORE_RESIDUAL_TRANSFORMATION_LINK_COUNT;
  private static final SubLSymbol $kw106$UNION_LINK_COUNT;
  private static final SubLSymbol $sym107$PROBLEM_STORE_UNION_LINK_COUNT;
  private static final SubLSymbol $kw108$GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym109$PROBLEM_STORE_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw110$NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym111$PROBLEM_STORE_NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw112$NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym113$PROBLEM_STORE_NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw114$SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym115$PROBLEM_STORE_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw116$CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym117$PROBLEM_STORE_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw118$JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $sym119$PROBLEM_STORE_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $kw120$SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $sym121$PROBLEM_STORE_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $kw122$DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym123$PROBLEM_STORE_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw124$UNEXAMINED_PROBLEM_COUNT;
  private static final SubLSymbol $sym125$PROBLEM_STORE_UNEXAMINED_PROBLEM_COUNT;
  private static final SubLSymbol $kw126$EXAMINED_PROBLEM_COUNT;
  private static final SubLSymbol $sym127$PROBLEM_STORE_EXAMINED_PROBLEM_COUNT;
  private static final SubLSymbol $kw128$POSSIBLE_PROBLEM_COUNT;
  private static final SubLSymbol $sym129$PROBLEM_STORE_POSSIBLE_PROBLEM_COUNT;
  private static final SubLSymbol $kw130$PENDING_PROBLEM_COUNT;
  private static final SubLSymbol $sym131$PROBLEM_STORE_PENDING_PROBLEM_COUNT;
  private static final SubLSymbol $kw132$FINISHED_PROBLEM_COUNT;
  private static final SubLSymbol $sym133$PROBLEM_STORE_FINISHED_PROBLEM_COUNT;
  private static final SubLSymbol $kw134$UNMANIFESTED_NON_FOCAL_COUNT;
  private static final SubLSymbol $sym135$PROBLEM_STORE_UNMANIFESTED_NON_FOCAL_COUNT;
  private static final SubLSymbol $kw136$TRANSFORMATION_RULE_BINDINGS_TO_CLOSED;
  private static final SubLSymbol $sym137$PROBLEM_STORE_TRANSFORMATION_RULE_BINDINGS_TO_CLOSED;
  private static final SubLSymbol $kw138$PROBLEM_QUERIES;
  private static final SubLSymbol $sym139$PROBLEM_STORE_ALL_PROBLEM_QUERIES;
  private static final SubLSymbol $kw140$ANSWER_TIMES;
  private static final SubLSymbol $sym141$INFERENCE_ANSWER_TIMES;
  private static final SubLSymbol $kw142$ANSWER_STEP_COUNTS;
  private static final SubLSymbol $sym143$INFERENCE_ANSWER_STEP_COUNTS;
  private static final SubLSymbol $kw144$PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT;
  private static final SubLSymbol $sym145$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT;
  private static final SubLSymbol $kw146$ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT;
  private static final SubLSymbol $sym147$INFERENCE_TRANSFORMATION_FANOUT_ESTIMATE;
  private static final SubLSymbol $kw148$TOP_LEVEL_REMOVAL_FANOUT;
  private static final SubLSymbol $sym149$INFERENCE_TOP_LEVEL_REMOVAL_FANOUT;
  private static final SubLSymbol $kw150$NEW_ROOT_INITIAL_REMOVAL_FANOUTS;
  private static final SubLSymbol $sym151$INFERENCE_NEW_ROOT_INITIAL_REMOVAL_FANOUTS;
  private static final SubLSymbol $kw152$PROOF_QUERY_PROPERTIES;
  private static final SubLSymbol $sym153$INFERENCE_COMPUTE_PROOF_QUERY_PROPERTIES;
  private static final SubLSymbol $kw154$ANSWER_PROOF_SPECS;
  private static final SubLSymbol $sym155$INFERENCE_ALL_ANSWER_PROOF_SPECS;
  private static final SubLSymbol $kw156$INFERENCE_PROOF_SPEC;
  private static final SubLSymbol $sym157$INFERENCE_PROOF_SPEC;
  private static final SubLSymbol $kw158$EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES;
  private static final SubLSymbol $sym159$PROBLEM_STORE_EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES;
  private static final SubLSymbol $kw160$NEW_ROOT_METRICS;
  private static final SubLSymbol $sym161$INFERENCE_NEW_ROOT_METRICS;
  private static final SubLSymbol $kw162$UNEXAMINED_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym163$PROBLEM_STORE_UNEXAMINED_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw164$EXAMINED_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym165$PROBLEM_STORE_EXAMINED_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw166$POSSIBLE_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym167$PROBLEM_STORE_POSSIBLE_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw168$PENDING_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym169$PROBLEM_STORE_PENDING_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw170$FINISHED_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym171$PROBLEM_STORE_FINISHED_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw172$UNEXAMINED_NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym173$PROBLEM_STORE_UNEXAMINED_NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw174$EXAMINED_NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym175$PROBLEM_STORE_EXAMINED_NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw176$POSSIBLE_NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym177$PROBLEM_STORE_POSSIBLE_NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw178$PENDING_NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym179$PROBLEM_STORE_PENDING_NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw180$FINISHED_NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym181$PROBLEM_STORE_FINISHED_NEUTRAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw182$UNEXAMINED_NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym183$PROBLEM_STORE_UNEXAMINED_NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw184$EXAMINED_NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym185$PROBLEM_STORE_EXAMINED_NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw186$POSSIBLE_NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym187$PROBLEM_STORE_POSSIBLE_NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw188$PENDING_NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym189$PROBLEM_STORE_PENDING_NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw190$FINISHED_NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $sym191$PROBLEM_STORE_FINISHED_NO_GOOD_PROBLEM_COUNT;
  private static final SubLSymbol $kw192$GOOD_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym193$PROBLEM_STORE_GOOD_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw194$GOOD_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym195$PROBLEM_STORE_GOOD_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw196$GOOD_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $sym197$PROBLEM_STORE_GOOD_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $kw198$GOOD_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $sym199$PROBLEM_STORE_GOOD_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $kw200$GOOD_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym201$PROBLEM_STORE_GOOD_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw202$NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym203$PROBLEM_STORE_NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw204$NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym205$PROBLEM_STORE_NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw206$NEUTRAL_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $sym207$PROBLEM_STORE_NEUTRAL_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $kw208$NEUTRAL_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $sym209$PROBLEM_STORE_NEUTRAL_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $kw210$NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym211$PROBLEM_STORE_NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw212$NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym213$PROBLEM_STORE_NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw214$NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym215$PROBLEM_STORE_NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw216$NO_GOOD_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $sym217$PROBLEM_STORE_NO_GOOD_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $kw218$NO_GOOD_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $sym219$PROBLEM_STORE_NO_GOOD_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $kw220$NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym221$PROBLEM_STORE_NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw222$UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym223$PROBLEM_STORE_UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw224$UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym225$PROBLEM_STORE_UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw226$UNEXAMINED_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $sym227$PROBLEM_STORE_UNEXAMINED_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $kw228$UNEXAMINED_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $sym229$PROBLEM_STORE_UNEXAMINED_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $kw230$UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym231$PROBLEM_STORE_UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw232$EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym233$PROBLEM_STORE_EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw234$EXAMINED_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym235$PROBLEM_STORE_EXAMINED_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw236$EXAMINED_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $sym237$PROBLEM_STORE_EXAMINED_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $kw238$EXAMINED_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $sym239$PROBLEM_STORE_EXAMINED_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $kw240$EXAMINED_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym241$PROBLEM_STORE_EXAMINED_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw242$POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym243$PROBLEM_STORE_POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw244$POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym245$PROBLEM_STORE_POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw246$POSSIBLE_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $sym247$PROBLEM_STORE_POSSIBLE_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $kw248$POSSIBLE_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $sym249$PROBLEM_STORE_POSSIBLE_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $kw250$POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym251$PROBLEM_STORE_POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw252$PENDING_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym253$PROBLEM_STORE_PENDING_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw254$PENDING_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym255$PROBLEM_STORE_PENDING_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw256$PENDING_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $sym257$PROBLEM_STORE_PENDING_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $kw258$PENDING_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $sym259$PROBLEM_STORE_PENDING_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $kw260$PENDING_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym261$PROBLEM_STORE_PENDING_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw262$FINISHED_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $sym263$PROBLEM_STORE_FINISHED_SINGLE_LITERAL_PROBLEM_COUNT;
  private static final SubLSymbol $kw264$FINISHED_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym265$PROBLEM_STORE_FINISHED_CONJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw266$FINISHED_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $sym267$PROBLEM_STORE_FINISHED_JOIN_PROBLEM_COUNT;
  private static final SubLSymbol $kw268$FINISHED_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $sym269$PROBLEM_STORE_FINISHED_SPLIT_PROBLEM_COUNT;
  private static final SubLSymbol $kw270$FINISHED_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $sym271$PROBLEM_STORE_FINISHED_DISJUNCTIVE_PROBLEM_COUNT;
  private static final SubLSymbol $kw272$SKSI_QUERY_TOTAL_TIME;
  private static final SubLSymbol $sym273$SKSI_QUERY_TOTAL_TIME_ACCUMULATOR_LOOKUP;
  private static final SubLSymbol $kw274$SKSI_QUERY_START_TIMES;
  private static final SubLSymbol $sym275$SKSI_QUERY_START_TIMES_ACCUMULATOR_LOOKUP;
  private static final SubLSymbol $kw276$SPARQL_QUERY_PROFILE;
  private static final SubLSymbol $sym277$SPARQL_QUERY_PROFILE_ACCUMULATOR_LOOKUP;
  private static final SubLSymbol $kw278$TICK_INDEXED_PROGRESS_DATA;
  private static final SubLSymbol $sym279$INFERENCE_TICK_INDEXED_PROGRESS_DATA;
  private static final SubLSymbol $kw280$INFERENCE_HL_MODULE_TIMES;
  private static final SubLSymbol $sym281$INFERENCE_HL_MODULE_TIMES;
  private static final SubLSymbol $kw282$RULE_BINDING_VALUE_MAP;
  private static final SubLSymbol $sym283$PROBLEM_STORE_RULE_BINDING_VALUE_MAP;
  private static final SubLSymbol $sym284$_PROBLEM_STORE_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym285$_FORWARD_PROBLEM_STORE_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym286$_MAXIMUM_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_;
  private static final SubLSymbol $sym287$_MAXIMUM_FORWARD_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_;
  private static final SubLInteger $int288$1000;
  private static final SubLString $str289$Forward__S_contained__S_problems;
  private static final SubLSymbol $sym290$_PROBLEM_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym291$_GOOD_PROBLEM_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym292$_NO_GOOD_PROBLEM_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym293$_FORWARD_PROBLEM_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym294$_SINGLE_LITERAL_PROBLEM_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym295$_PROBLEM_LINK_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym296$_STRUCTURAL_LINK_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym297$_CONTENT_LINK_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym298$_REMOVAL_LINK_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym299$_TRANSFORMATION_LINK_HISTORICAL_COUNT_;
  private static final SubLSymbol $kw300$REMOVAL;
  private static final SubLSymbol $kw301$TRANSFORMATION;
  private static final SubLSymbol $kw302$REWRITE;
  private static final SubLSymbol $sym303$_DEPENDENT_LINK_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym304$_SINGLE_LITERAL_PROBLEM_DEPENDENT_LINK_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym305$_TACTIC_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym306$_EXECUTED_TACTIC_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym307$_DISCARDED_TACTIC_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym308$_UNIFICATION_ATTEMPT_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym309$_UNIFICATION_SUCCESS_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym310$_SBHL_CACHE_ATTEMPT_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym311$_SBHL_CACHE_SUCCESS_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym312$_SBHL_GRAPH_ATTEMPT_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym313$_SBHL_GRAPH_SUCCESS_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym314$_SBHL_LINK_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym315$_PROOF_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym316$_INFERENCE_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym317$_SUCCESSFUL_INFERENCE_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym318$_FORWARD_INFERENCE_HISTORICAL_COUNT_;
  private static final SubLSymbol $sym319$_SUCCESSFUL_FORWARD_INFERENCE_HISTORICAL_COUNT_;
  private static final SubLSymbol $kw320$SKSI_QUERY_TOTAL_TIME_ACC;
  private static final SubLSymbol $kw321$SKSI_QUERY_START_TIMES_ACC;
  private static final SubLSymbol $kw322$SPARQL_QUERY_PROFILE_ACC;
  private static final SubLSymbol $sym323$INFERENCE_TICK_INDEXED_PROGRESS_DATA_MEMOIZED;
  private static final SubLInteger $int324$128;
  private static final SubLSymbol $kw325$TICK_COUNT;
  private static final SubLSymbol $kw326$STEP_COUNT;
  private static final SubLSymbol $kw327$ASSERTION_TOUCH_COUNT;
  private static final SubLSymbol $kw328$TERM_TOUCH_COUNT;
  private static final SubLSymbol $kw329$LAST_ASSERTION_TOUCHED;
  private static final SubLSymbol $kw330$LAST_TERM_TOUCHED;
  private static final SubLSymbol $kw331$PROBLEM;
  private static final SubLSymbol $sym332$INFERENCE_HL_MODULE_TIMES_MEMOIZED;
  private static final SubLList $list333;
  private static final SubLSymbol $sym334$POSSIBLY_GENERICIZE_INDETERMINATE_TERM;
  private static final SubLObject $const335$EverythingPSC;
  private static final SubLSymbol $kw336$SKIP;
  private static final SubLSymbol $sym337$MAP_P;
  private static final SubLList $list338;
  private static final SubLString $str339$____Rule_;
  private static final SubLSymbol $sym340$_;
  private static final SubLSymbol $sym341$VARIABLE_ID;
  private static final SubLString $str342$___S__;
  private static final SubLSymbol $kw343$ASCENDING;
  private static final SubLString $str344$_____S;
  private static final SubLList $list345;
  private static final SubLList $list346;
  private static final SubLSymbol $kw347$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw348$BROWSABLE_;
  private static final SubLSymbol $sym349$CLET;
  private static final SubLList $list350;
  private static final SubLSymbol $sym351$_BROWSE_FORWARD_INFERENCES__;
  private static final SubLList $list352;
  private static final SubLList $list353;
  private static final SubLList $list354;
  private static final SubLSymbol $kw355$THRESHOLD;
  private static final SubLSymbol $sym356$GATHERING_FORWARD_INFERENCE_METRICS;
  private static final SubLSymbol $sym357$SHOW_FORWARD_INFERENCE_METRICS;
  private static final SubLSymbol $sym358$PROGN;
  private static final SubLList $list359;
  private static final SubLSymbol $sym360$SHOW_FORWARD_INFERENCE_METRICS_OF;
  private static final SubLSymbol $sym361$_FORWARD_INFERENCE_METRICS_TIME_INDEX_;
  private static final SubLSymbol $sym362$_FORWARD_INFERENCE_METRICS_COUNT_INDEX_;
  private static final SubLSymbol $sym363$_FORWARD_INFERENCE_METRICS_INFERENCE_INDEX_;
  private static final SubLSymbol $sym364$VALID_INFERENCE_P;
  private static final SubLSymbol $sym365$_FORWARD_INFERENCE_METRICS_GAF_INDEX_;
  private static final SubLSymbol $sym366$_FORWARD_INFERENCE_METRICS_SUCCESSFUL_RULE_INDEX_;
  private static final SubLSymbol $sym367$_;
  private static final SubLSymbol $kw368$OUTPUT;
  private static final SubLString $str369$Unable_to_open__S;
  private static final SubLSymbol $kw370$INPUT;
  private static final SubLSymbol $kw371$EOF;
  private static final SubLSymbol $sym372$GET_FORWARD_INFERENCE_METRIC_TYPE_AND_METRIC_LIST;
  private static final SubLSymbol $sym373$_GET_FORWARD_INFERENCE_METRIC_TYPE_AND_METRIC_LIST_CACHING_STATE_;
  private static final SubLString $str374$Forward_Inference_Metrics_Lock;
  private static final SubLString $str375$Negative_time___A_for___A__A___;
  private static final SubLSymbol $kw376$UNKNOWN_GAF;
  private static final SubLSymbol $sym377$CDR;
  private static final SubLSymbol $sym378$_;
  private static final SubLSymbol $sym379$FORWARD_INFERENCE_TIME_METRIC_TOTAL_TIME_FROM_CDR;
  private static final SubLList $list380;
  private static final SubLSymbol $sym381$FORWARD_TMS_RULE_;
  private static final SubLSymbol $kw382$RULE;
  private static final SubLSymbol $kw383$TIME;
  private static final SubLSymbol $kw384$INFERENCE_TIME;
  private static final SubLSymbol $kw385$INFERENCE_COUNT;
  private static final SubLSymbol $kw386$TRIGGER_GAFS;
  private static final SubLSymbol $kw387$SUCCESS_RULE_COUNT;
  private static final SubLSymbol $kw388$SUCCESS_TRIGGER_COUNT;
  private static final SubLSymbol $kw389$SUCCESS_TIME_ESTIMATE;
  private static final SubLSymbol $kw390$TOTAL_RULE_COUNT;
  private static final SubLSymbol $kw391$TOTAL_TRIGGER_COUNT;
  private static final SubLSymbol $kw392$TOTAL_INFERENCE_TIME;
  private static final SubLSymbol $kw393$SUCCESS_RULE_RATIO;
  private static final SubLSymbol $kw394$SUCCESS_TRIGGER_RATIO;
  private static final SubLSymbol $kw395$SUCCESS_TIME_RATIO;
  private static final SubLSymbol $kw396$SUCCESS_INFERENCE_TIME_RATIO;
  private static final SubLList $list397;
  private static final SubLSymbol $sym398$DEDUCTION_ID;
  private static final SubLSymbol $kw399$TIME_PLIST;
  private static final SubLSymbol $kw400$COUNT_PLIST;
  private static final SubLSymbol $kw401$OVERHEAD;
  private static final SubLSymbol $kw402$INFERENCES;
  private static final SubLSymbol $kw403$TOTAL_INFERENCES;
  private static final SubLSymbol $kw404$TOTAL_RULES;
  private static final SubLSymbol $kw405$TOTAL_TRIGGERS;
  private static final SubLSymbol $kw406$AVERAGE_INFERENCES_PER_RULE;
  private static final SubLSymbol $kw407$STDEV_INFERENCES_PER_RULE;
  private static final SubLSymbol $kw408$AVERAGE_TRIGGER_PER_RULE;
  private static final SubLSymbol $kw409$STDEV_TRIGGER_PER_RULE;
  private static final SubLSymbol $kw410$AVERAGE_TIME_PER_RULE;
  private static final SubLSymbol $kw411$STDEV_TIME_PER_RULE;
  private static final SubLSymbol $kw412$AVERAGE_TIME_PER_INFERENCE;
  private static final SubLSymbol $kw413$STDEV_TIME_PER_INFERENCE;
  private static final SubLSymbol $kw414$AVERAGE_TIME_PER_TRIGGER;
  private static final SubLSymbol $kw415$STDEV_TIME_PER_TRIGGER;
  private static final SubLList $list416;
  private static final SubLList $list417;
  private static final SubLString $str418$___6F____S____S__a__S;
  private static final SubLString $str419$___S;
  private static final SubLSymbol $kw420$INFO;
  private static final SubLSymbol $kw421$ALL;
  private static final SubLSymbol $kw422$FORMAT;
  private static final SubLSymbol $kw423$CSV;
  private static final SubLSymbol $kw424$HEADINGS_;
  private static final SubLSymbol $kw425$COLUMNS;
  private static final SubLList $list426;
  private static final SubLSymbol $kw427$SUCCESSFUL;
  private static final SubLList $list428;
  private static final SubLSymbol $sym429$DOUBLE_FLOAT;
  private static final SubLString $str430$__;
  private static final SubLString $str431$_;
  private static final SubLString $str432$_;
  private static final SubLSymbol $kw433$TRIGGER_COUNT;
  private static final SubLSymbol $kw434$SUCCESS_COUNT;
  private static final SubLSymbol $kw435$SUCCESS_TIME;
  private static final SubLSymbol $kw436$ID;
  private static final SubLSymbol $kw437$CHLID;
  private static final SubLSymbol $kw438$EL_IST_FORMULA;
  private static final SubLString $str439$__Total_inferences_______________;
  private static final SubLString $str440$___total_forward__data_directed__;
  private static final SubLString $str441$____successful_forward___________;
  private static final SubLString $str442$___total_backward__query_directed;
  private static final SubLString $str443$____successful_backward__________;
  private static final SubLString $str444$___avg_relevant_problem_count____;
  private static final SubLString $str445$__Total_problem_stores___________;
  private static final SubLString $str446$___total_forward___data_directed_;
  private static final SubLString $str447$___max_problem_store_problem_coun;
  private static final SubLString $str448$___avg_problem_store_problem_coun;
  private static final SubLString $str449$___max_forward_problem_store_prob;
  private static final SubLString $str450$___avg_forward_problem_store_prob;
  private static final SubLString $str451$__Total_problems_____________6___;
  private static final SubLString $str452$___total_good_problems_______6___;
  private static final SubLString $str453$___total_no_good_problems____6___;
  private static final SubLString $str454$___total_forward_problems____6___;
  private static final SubLString $str455$___total_problem_reuses______6___;
  private static final SubLString $str456$____problem_reuse_ratio______6___;
  private static final SubLString $str457$__Total_problem_links________6___;
  private static final SubLString $str458$___total_structural_links____6___;
  private static final SubLString $str459$___total_content_links_______6___;
  private static final SubLString $str460$____removal_links____________6___;
  private static final SubLString $str461$____transformation_links_____6___;
  private static final SubLString $str462$__Total_tactics_______6___D;
  private static final SubLString $str463$___total_executed_____6___D;
  private static final SubLString $str464$___total_discarded____6___D;
  private static final SubLString $str465$__Total_SBHL_cache_calls______9__;
  private static final SubLString $str466$___successful_________________9__;
  private static final SubLString $str467$__Total_SBHL_graph_walks______9__;
  private static final SubLString $str468$__Total_unification_attempts____6;
  private static final SubLString $str469$___successful_unifications______6;
  private static final SubLString $str470$__Total_proofs____6___D;
  private static final SubLInteger $int471$100;
  private static final SubLString $str472$___2___D___;
  private static final SubLString $str473$___3___D___;
  private static final SubLString $str474$___D___;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 854L)
  public static SubLObject inference_metric_evaluation_arg1_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $list0 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject inference_metric_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_inference_metric( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject inference_metric_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $inference_metric_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject inf_metric_name(final SubLObject v_object)
  {
    assert NIL != inference_metric_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject inf_metric_evaluation_func(final SubLObject v_object)
  {
    assert NIL != inference_metric_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject inf_metric_evaluation_arg1(final SubLObject v_object)
  {
    assert NIL != inference_metric_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject inf_metric_cross_productP(final SubLObject v_object)
  {
    assert NIL != inference_metric_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject _csetf_inf_metric_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_metric_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject _csetf_inf_metric_evaluation_func(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_metric_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject _csetf_inf_metric_evaluation_arg1(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_metric_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject _csetf_inf_metric_cross_productP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != inference_metric_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject make_inference_metric(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $inference_metric_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw18$NAME ) )
      {
        _csetf_inf_metric_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$EVALUATION_FUNC ) )
      {
        _csetf_inf_metric_evaluation_func( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$EVALUATION_ARG1 ) )
      {
        _csetf_inf_metric_evaluation_arg1( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$CROSS_PRODUCT_ ) )
      {
        _csetf_inf_metric_cross_productP( v_new, current_value );
      }
      else
      {
        Errors.error( $str22$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject visit_defstruct_inference_metric(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw23$BEGIN, $sym24$MAKE_INFERENCE_METRIC, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw18$NAME, inf_metric_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw19$EVALUATION_FUNC, inf_metric_evaluation_func( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw20$EVALUATION_ARG1, inf_metric_evaluation_arg1( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw21$CROSS_PRODUCT_, inf_metric_cross_productP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw26$END, $sym24$MAKE_INFERENCE_METRIC, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1557L)
  public static SubLObject visit_defstruct_object_inference_metric_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_inference_metric( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1735L)
  public static SubLObject print_inference_metric(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str28$_INFERENCE_METRIC___s_, inf_metric_name( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1906L)
  public static SubLObject new_inference_metric(final SubLObject name, final SubLObject evaluation_func, final SubLObject evaluation_arg1, final SubLObject cross_productP)
  {
    assert NIL != Types.keywordp( name ) : name;
    assert NIL != Types.symbolp( evaluation_func ) : evaluation_func;
    assert NIL != inference_metric_evaluation_arg1_p( evaluation_arg1 ) : evaluation_arg1;
    assert NIL != Types.booleanp( cross_productP ) : cross_productP;
    final SubLObject metric = make_inference_metric( UNPROVIDED );
    _csetf_inf_metric_name( metric, name );
    _csetf_inf_metric_evaluation_func( metric, evaluation_func );
    _csetf_inf_metric_evaluation_arg1( metric, evaluation_arg1 );
    _csetf_inf_metric_cross_productP( metric, cross_productP );
    return metric;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 2482L)
  public static SubLObject inference_metric_name(final SubLObject metric)
  {
    assert NIL != inference_metric_p( metric ) : metric;
    return inf_metric_name( metric );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 2617L)
  public static SubLObject inference_metric_evaluation_func(final SubLObject metric)
  {
    assert NIL != inference_metric_p( metric ) : metric;
    return inf_metric_evaluation_func( metric );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 2762L)
  public static SubLObject inference_metric_evaluation_arg1(final SubLObject metric)
  {
    assert NIL != inference_metric_p( metric ) : metric;
    return inf_metric_evaluation_arg1( metric );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 2907L)
  public static SubLObject inference_metric_cross_productP(final SubLObject metric)
  {
    assert NIL != inference_metric_p( metric ) : metric;
    return inf_metric_cross_productP( metric );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 3050L)
  public static SubLObject inference_metric_evaluate(final SubLObject metric, final SubLObject inference, final SubLObject store)
  {
    assert NIL != inference_metric_p( metric ) : metric;
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    final SubLObject func = inference_metric_evaluation_func( metric );
    final SubLObject pcase_var = inference_metric_evaluation_arg1( metric );
    if( pcase_var.eql( $kw35$STORE ) )
    {
      return Functions.funcall( func, store );
    }
    if( pcase_var.eql( $kw36$INFERENCE ) )
    {
      return Functions.funcall( func, inference );
    }
    return Errors.error( $str37$Unhandled_inference_metric_evalua, inference_metric_evaluation_arg1( metric ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 4209L)
  public static SubLObject inference_metric_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $inference_metric_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 4322L)
  public static SubLObject declare_inference_metric(final SubLObject name, final SubLObject evaluation_func, final SubLObject evaluation_arg1, SubLObject cross_productP)
  {
    if( cross_productP == UNPROVIDED )
    {
      cross_productP = NIL;
    }
    final SubLObject metric = new_inference_metric( name, evaluation_func, evaluation_arg1, cross_productP );
    dictionary.dictionary_enter( $inference_metrics_store$.getGlobalValue(), name, metric );
    return metric;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 4602L)
  public static SubLObject inference_metric_lookup(final SubLObject name)
  {
    return dictionary.dictionary_lookup_without_values( $inference_metrics_store$.getGlobalValue(), name, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 4727L)
  public static SubLObject inference_metric_nameP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isKeyword() && NIL != list_utilities.sublisp_boolean( inference_metric_lookup( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 4861L)
  public static SubLObject inference_metric_names()
  {
    return dictionary.dictionary_keys( $inference_metrics_store$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 18258L)
  public static SubLObject problem_store_historical_count()
  {
    return $problem_store_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 18401L)
  public static SubLObject increment_problem_store_historical_count()
  {
    $problem_store_historical_count$.setGlobalValue( Numbers.add( $problem_store_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $problem_store_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 18663L)
  public static SubLObject forward_problem_store_historical_count()
  {
    return $forward_problem_store_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 18852L)
  public static SubLObject backward_problem_store_historical_count()
  {
    return Numbers.subtract( problem_store_historical_count(), forward_problem_store_historical_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 19083L)
  public static SubLObject increment_forward_problem_store_historical_count()
  {
    $forward_problem_store_historical_count$.setGlobalValue( Numbers.add( $forward_problem_store_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $forward_problem_store_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 19385L)
  public static SubLObject maximum_problem_store_historical_problem_count()
  {
    return $maximum_problem_store_historical_problem_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 19584L)
  public static SubLObject update_maximum_problem_store_historical_problem_count(final SubLObject problem_store)
  {
    final SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count( problem_store );
    $maximum_problem_store_historical_problem_count$.setGlobalValue( Numbers.max( $maximum_problem_store_historical_problem_count$.getGlobalValue(), count ) );
    return $maximum_problem_store_historical_problem_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 20035L)
  public static SubLObject average_problem_store_historical_problem_count()
  {
    final SubLObject store_count = problem_store_historical_count();
    return store_count.isZero() ? ZERO_INTEGER : Numbers.divide( problem_historical_count(), store_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 20420L)
  public static SubLObject maximum_forward_problem_store_historical_problem_count()
  {
    return $maximum_forward_problem_store_historical_problem_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 20710L)
  public static SubLObject update_maximum_forward_problem_store_historical_problem_count(final SubLObject problem_store)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count( problem_store );
    if( NIL != control_vars.$inference_debugP$.getDynamicValue( thread ) && count.numGE( $expensive_forward_problem_store_threshold$.getDynamicValue( thread ) ) )
    {
      Errors.warn( $str289$Forward__S_contained__S_problems, problem_store, count );
    }
    $maximum_forward_problem_store_historical_problem_count$.setGlobalValue( Numbers.max( $maximum_forward_problem_store_historical_problem_count$.getGlobalValue(), count ) );
    return $maximum_forward_problem_store_historical_problem_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 21360L)
  public static SubLObject average_forward_problem_store_historical_problem_count()
  {
    final SubLObject store_count = forward_problem_store_historical_count();
    return store_count.isZero() ? ZERO_INTEGER : Numbers.divide( forward_problem_historical_count(), store_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 21779L)
  public static SubLObject increment_problem_historical_count()
  {
    $problem_historical_count$.setGlobalValue( Numbers.add( $problem_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $problem_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 21952L)
  public static SubLObject problem_historical_count()
  {
    return $problem_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 22155L)
  public static SubLObject good_problem_historical_count()
  {
    return $good_problem_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 22302L)
  public static SubLObject increment_good_problem_historical_count()
  {
    $good_problem_historical_count$.setGlobalValue( Numbers.add( $good_problem_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $good_problem_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 22516L)
  public static SubLObject decrement_good_problem_historical_count()
  {
    $good_problem_historical_count$.setGlobalValue( Numbers.subtract( $good_problem_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $good_problem_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 22789L)
  public static SubLObject no_good_problem_historical_count()
  {
    return $no_good_problem_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 22945L)
  public static SubLObject increment_no_good_problem_historical_count()
  {
    $no_good_problem_historical_count$.setGlobalValue( Numbers.add( $no_good_problem_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $no_good_problem_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 23227L)
  public static SubLObject forward_problem_historical_count()
  {
    return $forward_problem_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 23394L)
  public static SubLObject update_forward_problem_historical_count(final SubLObject problem_store)
  {
    final SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count( problem_store );
    $forward_problem_historical_count$.setGlobalValue( Numbers.add( $forward_problem_historical_count$.getGlobalValue(), count ) );
    return $forward_problem_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 23817L)
  public static SubLObject single_literal_problem_historical_count()
  {
    return $single_literal_problem_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 23987L)
  public static SubLObject multi_literal_problem_historical_count()
  {
    return Numbers.subtract( problem_historical_count(), single_literal_problem_historical_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24189L)
  public static SubLObject increment_single_literal_problem_historical_count()
  {
    $single_literal_problem_historical_count$.setGlobalValue( Numbers.add( $single_literal_problem_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $single_literal_problem_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24511L)
  public static SubLObject problem_link_historical_count()
  {
    return $problem_link_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24709L)
  public static SubLObject structural_link_historical_count()
  {
    return $structural_link_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24913L)
  public static SubLObject content_link_historical_count()
  {
    return $content_link_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 25108L)
  public static SubLObject removal_link_historical_count()
  {
    return $removal_link_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 25310L)
  public static SubLObject transformation_link_historical_count()
  {
    return $transformation_link_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 25471L)
  public static SubLObject increment_problem_link_type_historical_counts(final SubLObject link_type)
  {
    if( link_type.eql( $kw300$REMOVAL ) )
    {
      $removal_link_historical_count$.setGlobalValue( Numbers.add( $removal_link_historical_count$.getGlobalValue(), ONE_INTEGER ) );
      $content_link_historical_count$.setGlobalValue( Numbers.add( $content_link_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    }
    else if( link_type.eql( $kw301$TRANSFORMATION ) )
    {
      $transformation_link_historical_count$.setGlobalValue( Numbers.add( $transformation_link_historical_count$.getGlobalValue(), ONE_INTEGER ) );
      $content_link_historical_count$.setGlobalValue( Numbers.add( $content_link_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    }
    else if( link_type.eql( $kw302$REWRITE ) )
    {
      $content_link_historical_count$.setGlobalValue( Numbers.add( $content_link_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    }
    else
    {
      $structural_link_historical_count$.setGlobalValue( Numbers.add( $structural_link_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    }
    $problem_link_historical_count$.setGlobalValue( Numbers.add( $problem_link_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 26075L)
  public static SubLObject dependent_link_historical_count()
  {
    return $dependent_link_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 26229L)
  public static SubLObject increment_dependent_link_historical_count()
  {
    $dependent_link_historical_count$.setGlobalValue( Numbers.add( $dependent_link_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $dependent_link_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 26519L)
  public static SubLObject single_literal_problem_dependent_link_historical_count()
  {
    return $single_literal_problem_dependent_link_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 26747L)
  public static SubLObject multi_literal_problem_dependent_link_historical_count()
  {
    return Numbers.subtract( dependent_link_historical_count(), single_literal_problem_dependent_link_historical_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 27014L)
  public static SubLObject increment_single_literal_problem_dependent_link_historical_count()
  {
    $single_literal_problem_dependent_link_historical_count$.setGlobalValue( Numbers.add( $single_literal_problem_dependent_link_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $single_literal_problem_dependent_link_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 27292L)
  public static SubLObject problem_reuses_historical_count()
  {
    return Numbers.subtract( dependent_link_historical_count(), problem_historical_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 27472L)
  public static SubLObject problem_reuse_historical_ratio()
  {
    final SubLObject problem_count = problem_historical_count();
    return problem_count.isZero() ? ZERO_INTEGER : Numbers.divide( problem_reuses_historical_count(), problem_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 27810L)
  public static SubLObject single_literal_problem_reuses_historical_count()
  {
    return Numbers.subtract( single_literal_problem_dependent_link_historical_count(), single_literal_problem_historical_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 28058L)
  public static SubLObject single_literal_problem_reuse_historical_ratio()
  {
    final SubLObject problem_count = single_literal_problem_historical_count();
    return problem_count.isZero() ? ZERO_INTEGER : Numbers.divide( single_literal_problem_reuses_historical_count(), problem_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 28456L)
  public static SubLObject multi_literal_problem_reuses_historical_count()
  {
    return Numbers.subtract( multi_literal_problem_dependent_link_historical_count(), multi_literal_problem_historical_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 28700L)
  public static SubLObject multi_literal_problem_reuse_historical_ratio()
  {
    final SubLObject problem_count = multi_literal_problem_historical_count();
    return problem_count.isZero() ? ZERO_INTEGER : Numbers.divide( multi_literal_problem_reuses_historical_count(), problem_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 29320L)
  public static SubLObject tactic_historical_count()
  {
    return $tactic_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 29442L)
  public static SubLObject increment_tactic_historical_count()
  {
    $tactic_historical_count$.setGlobalValue( Numbers.add( $tactic_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $tactic_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 29670L)
  public static SubLObject executed_tactic_historical_count()
  {
    return $executed_tactic_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 29819L)
  public static SubLObject increment_executed_tactic_historical_count()
  {
    $executed_tactic_historical_count$.setGlobalValue( Numbers.add( $executed_tactic_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $executed_tactic_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 30085L)
  public static SubLObject discarded_tactic_historical_count()
  {
    return $discarded_tactic_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 30237L)
  public static SubLObject increment_discarded_tactic_historical_count()
  {
    $discarded_tactic_historical_count$.setGlobalValue( Numbers.add( $discarded_tactic_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $discarded_tactic_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 30697L)
  public static SubLObject unification_attempt_historical_count()
  {
    return $unification_attempt_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 30852L)
  public static SubLObject increment_unification_attempt_historical_count()
  {
    $unification_attempt_historical_count$.setGlobalValue( Numbers.add( $unification_attempt_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $unification_attempt_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 31136L)
  public static SubLObject unification_success_historical_count()
  {
    return $unification_success_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 31292L)
  public static SubLObject increment_unification_success_historical_count()
  {
    $unification_success_historical_count$.setGlobalValue( Numbers.add( $unification_success_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $unification_success_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 31617L)
  public static SubLObject sbhl_cache_attempt_historical_count()
  {
    return $sbhl_cache_attempt_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 31769L)
  public static SubLObject increment_sbhl_cache_attempt_historical_count()
  {
    $sbhl_cache_attempt_historical_count$.setGlobalValue( Numbers.add( $sbhl_cache_attempt_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $sbhl_cache_attempt_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 32058L)
  public static SubLObject sbhl_cache_success_historical_count()
  {
    return $sbhl_cache_success_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 32211L)
  public static SubLObject increment_sbhl_cache_success_historical_count()
  {
    $sbhl_cache_success_historical_count$.setGlobalValue( Numbers.add( $sbhl_cache_success_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $sbhl_cache_success_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 32542L)
  public static SubLObject sbhl_graph_attempt_historical_count()
  {
    return $sbhl_graph_attempt_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 32694L)
  public static SubLObject increment_sbhl_graph_attempt_historical_count()
  {
    $sbhl_graph_attempt_historical_count$.setGlobalValue( Numbers.add( $sbhl_graph_attempt_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $sbhl_graph_attempt_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 32980L)
  public static SubLObject sbhl_graph_success_historical_count()
  {
    return $sbhl_graph_success_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 33133L)
  public static SubLObject increment_sbhl_graph_success_historical_count()
  {
    $sbhl_graph_success_historical_count$.setGlobalValue( Numbers.add( $sbhl_graph_success_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $sbhl_graph_success_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 33451L)
  public static SubLObject sbhl_link_historical_count()
  {
    return $sbhl_link_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 33583L)
  public static SubLObject increment_sbhl_link_historical_count()
  {
    $sbhl_link_historical_count$.setGlobalValue( Numbers.add( $sbhl_link_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $sbhl_link_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 33846L)
  public static SubLObject proof_historical_count()
  {
    return $proof_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 33965L)
  public static SubLObject increment_proof_historical_count()
  {
    $proof_historical_count$.setGlobalValue( Numbers.add( $proof_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $proof_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 34582L)
  public static SubLObject inference_historical_count()
  {
    return $inference_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 34713L)
  public static SubLObject increment_inference_historical_count()
  {
    $inference_historical_count$.setGlobalValue( Numbers.add( $inference_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $inference_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 34958L)
  public static SubLObject successful_inference_historical_count()
  {
    return $successful_inference_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 35122L)
  public static SubLObject increment_successful_inference_historical_count()
  {
    $successful_inference_historical_count$.setGlobalValue( Numbers.add( $successful_inference_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $successful_inference_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 35404L)
  public static SubLObject forward_inference_historical_count()
  {
    return $forward_inference_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 35559L)
  public static SubLObject backward_inference_historical_count()
  {
    return Numbers.subtract( inference_historical_count(), forward_inference_historical_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 35752L)
  public static SubLObject increment_forward_inference_historical_count()
  {
    $forward_inference_historical_count$.setGlobalValue( Numbers.add( $forward_inference_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $forward_inference_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 36037L)
  public static SubLObject successful_forward_inference_historical_count()
  {
    return $successful_forward_inference_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 36225L)
  public static SubLObject successful_backward_inference_historical_count()
  {
    return Numbers.subtract( successful_inference_historical_count(), successful_forward_inference_historical_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 36462L)
  public static SubLObject increment_successful_forward_inference_historical_count()
  {
    $successful_forward_inference_historical_count$.setGlobalValue( Numbers.add( $successful_forward_inference_historical_count$.getGlobalValue(), ONE_INTEGER ) );
    return $successful_forward_inference_historical_count$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 36708L)
  public static SubLObject average_historical_inference_relevant_problem_count()
  {
    final SubLObject inference_count = inference_historical_count();
    return inference_count.isZero() ? ZERO_INTEGER : Numbers.divide( problem_historical_count(), inference_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 37031L)
  public static SubLObject sksi_query_total_time_accumulator_lookup(final SubLObject inference)
  {
    return inference_datastructures_inference.inference_accumulator_contents( inference, $kw320$SKSI_QUERY_TOTAL_TIME_ACC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 37276L)
  public static SubLObject sksi_query_start_times_accumulator_lookup(final SubLObject inference)
  {
    return inference_datastructures_inference.inference_accumulator_contents( inference, $kw321$SKSI_QUERY_START_TIMES_ACC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 37435L)
  public static SubLObject sparql_query_profile_accumulator_lookup(final SubLObject inference)
  {
    return inference_datastructures_inference.inference_accumulator_contents( inference, $kw322$SPARQL_QUERY_PROFILE_ACC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 37959L)
  public static SubLObject inference_tick_indexed_progress_data_memoized_internal(final SubLObject inference)
  {
    return Hashtables.make_hash_table( $int324$128, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 37959L)
  public static SubLObject inference_tick_indexed_progress_data_memoized(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_tick_indexed_progress_data_memoized_internal( inference );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym323$INFERENCE_TICK_INDEXED_PROGRESS_DATA_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym323$INFERENCE_TICK_INDEXED_PROGRESS_DATA_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym323$INFERENCE_TICK_INDEXED_PROGRESS_DATA_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, inference, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_tick_indexed_progress_data_memoized_internal( inference ) ) );
      memoization_state.caching_state_put( caching_state, inference, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 38110L)
  public static SubLObject inference_possibly_update_tick_indexed_progress_data(final SubLObject inference)
  {
    if( NIL != inference_should_gather_tick_indexed_progress_dataP( inference ) )
    {
      final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
      final SubLObject tick_indexed_progress_data = inference_tick_indexed_progress_data( inference );
      final SubLObject step_count = inference_datastructures_inference.inference_cumulative_step_count( inference );
      final SubLObject problem_count = inference_datastructures_problem_store.problem_store_historical_problem_count( inference_datastructures_inference.inference_problem_store( inference ) );
      final SubLObject tick_count = Numbers.add( MINUS_ONE_INTEGER, step_count, problem_count );
      final SubLObject data_list = ConsesLow.list( new SubLObject[] { $kw325$TICK_COUNT, tick_count, $kw68$PROBLEM_COUNT, problem_count, $kw326$STEP_COUNT, step_count, $kw327$ASSERTION_TOUCH_COUNT, arete
          .arete_assertions_touched_count(), $kw328$TERM_TOUCH_COUNT, arete.arete_terms_touched_count(), $kw329$LAST_ASSERTION_TOUCHED, arete.arete_last_assertion_touched(), $kw330$LAST_TERM_TOUCHED, arete
              .arete_last_term_touched(), $kw331$PROBLEM, problem_store_visualization.problem_store_most_recent_problem( store )
      } );
      Hashtables.sethash( tick_count, tick_indexed_progress_data, data_list );
      if( NIL == Hashtables.gethash( ONE_INTEGER, tick_indexed_progress_data, UNPROVIDED ) )
      {
        final SubLObject initial_tick_data_list = ConsesLow.list( new SubLObject[] { $kw325$TICK_COUNT, ONE_INTEGER, $kw68$PROBLEM_COUNT, ONE_INTEGER, $kw326$STEP_COUNT, ONE_INTEGER, $kw327$ASSERTION_TOUCH_COUNT,
          ZERO_INTEGER, $kw328$TERM_TOUCH_COUNT, ZERO_INTEGER, $kw329$LAST_ASSERTION_TOUCHED, NIL, $kw330$LAST_TERM_TOUCHED, NIL, $kw331$PROBLEM, inference_datastructures_inference.inference_root_problem( inference )
        } );
        Hashtables.sethash( ONE_INTEGER, tick_indexed_progress_data, initial_tick_data_list );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 39732L)
  public static SubLObject inference_has_tick_indexed_progress_dataP(final SubLObject inference)
  {
    return makeBoolean( NIL != inference_datastructures_inference.valid_inference_p( inference ) && Hashtables.hash_table_count( inference_tick_indexed_progress_data( inference ) ).isPositive() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 39933L)
  public static SubLObject inference_should_gather_tick_indexed_progress_dataP(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != inference_datastructures_inference.valid_inference_p( inference ) && ( NIL != $force_inference_tick_indexed_progress_data_collectionP$.getDynamicValue( thread )
        || NIL != inference_datastructures_inference.inference_computes_metricP( inference, $kw278$TICK_INDEXED_PROGRESS_DATA ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 40265L)
  public static SubLObject inference_tick_indexed_progress_data(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state( inference_datastructures_inference.inference_problem_store( inference ) );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        result = inference_tick_indexed_progress_data_memoized( inference );
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 40529L)
  public static SubLObject inference_tick_indexed_progress_data_one_step(final SubLObject inference, final SubLObject tick_number, final SubLObject step_number, final SubLObject problem_number)
  {
    final SubLObject progress_data = inference_tick_indexed_progress_data( inference );
    if( NIL != tick_number )
    {
      return Hashtables.gethash( tick_number, progress_data, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 40947L)
  public static SubLObject inference_tick_count(final SubLObject inference)
  {
    final SubLObject step_count = inference_datastructures_inference.inference_cumulative_step_count( inference );
    final SubLObject problem_count = inference_datastructures_problem_store.problem_store_historical_problem_count( inference_datastructures_inference.inference_problem_store( inference ) );
    final SubLObject tick_count = Numbers.add( MINUS_ONE_INTEGER, step_count, problem_count );
    return tick_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 41738L)
  public static SubLObject inference_hl_module_times(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state( inference_datastructures_inference.inference_problem_store( inference ) );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        result = inference_hl_module_times_memoized( inference );
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 41980L)
  public static SubLObject inference_hl_module_times_memoized_internal(final SubLObject inference)
  {
    return Hashtables.make_hash_table( $int324$128, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 41980L)
  public static SubLObject inference_hl_module_times_memoized(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_hl_module_times_memoized_internal( inference );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym332$INFERENCE_HL_MODULE_TIMES_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym332$INFERENCE_HL_MODULE_TIMES_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym332$INFERENCE_HL_MODULE_TIMES_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, inference, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_hl_module_times_memoized_internal( inference ) ) );
      memoization_state.caching_state_put( caching_state, inference, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 42120L)
  public static SubLObject inference_update_hl_module_time(final SubLObject inference, final SubLObject hl_module, final SubLObject time)
  {
    return hash_table_utilities.push_hash( hl_module, time, inference_hl_module_times( inference ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 42270L)
  public static SubLObject possibly_update_hl_module_times(final SubLObject time)
  {
    if( NIL != any_inference_gathers_hl_module_timesP( UNPROVIDED ) )
    {
      hash_table_utilities.push_hash( inference_worker.currently_executing_hl_module(), time, inference_hl_module_times( inference_macros.current_controlling_inference() ) );
      SubLObject cdolist_list_var = inference_macros.current_controlling_inferences().rest();
      SubLObject inference = NIL;
      inference = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        hash_table_utilities.push_hash( inference_datastructures_tactic.tactic_hl_module( inference_worker.currently_executing_tactic() ), time, inference_hl_module_times( inference ) );
        cdolist_list_var = cdolist_list_var.rest();
        inference = cdolist_list_var.first();
      }
      if( NIL != list_utilities.same_length_p( inference_macros.current_controlling_inferences(), inference_worker.currently_executing_tactics() ) )
      {
        SubLObject inference2 = NIL;
        SubLObject inference_$3 = NIL;
        SubLObject tactic = NIL;
        SubLObject tactic_$4 = NIL;
        inference2 = inference_macros.current_controlling_inferences().rest();
        inference_$3 = inference2.first();
        tactic = inference_worker.currently_executing_tactics().rest();
        tactic_$4 = tactic.first();
        while ( NIL != tactic || NIL != inference2)
        {
          hash_table_utilities.push_hash( inference_datastructures_tactic.tactic_hl_module( tactic_$4 ), Numbers.subtract( ZERO_INTEGER, time ), inference_hl_module_times( inference_$3 ) );
          inference2 = inference2.rest();
          inference_$3 = inference2.first();
          tactic = tactic.rest();
          tactic_$4 = tactic.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 43742L)
  public static SubLObject inference_gathers_hl_module_timesP(SubLObject inference)
  {
    if( inference == UNPROVIDED )
    {
      inference = inference_macros.current_controlling_inference();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != inference_datastructures_inference.valid_inference_p( inference ) && ( NIL != $force_inference_hl_module_times_data_collectionP$.getDynamicValue( thread )
        || NIL != inference_datastructures_inference.inference_computes_metricP( inference, $kw280$INFERENCE_HL_MODULE_TIMES ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 44031L)
  public static SubLObject any_inference_gathers_hl_module_timesP(SubLObject inferences)
  {
    if( inferences == UNPROVIDED )
    {
      inferences = inference_macros.current_controlling_inferences();
    }
    SubLObject result = NIL;
    if( NIL == result )
    {
      SubLObject csome_list_var;
      SubLObject inference;
      for( csome_list_var = inferences, inference = NIL, inference = csome_list_var.first(); NIL == result && NIL != csome_list_var; result = inference_gathers_hl_module_timesP(
          inference ), csome_list_var = csome_list_var.rest(), inference = csome_list_var.first() )
      {
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 44293L)
  public static SubLObject problem_store_rule_binding_value_map(final SubLObject store)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    final SubLObject tuples = problem_store_rule_bindings_tuples( store );
    final SubLObject value_map = rule_binding_value_map_from_rule_binding_tuples( tuples );
    return value_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 44878L)
  public static SubLObject rule_binding_value_map_from_rule_binding_tuples(final SubLObject tuples)
  {
    final SubLObject rule_map = dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject cdolist_list_var = tuples;
    SubLObject binding_tuple = NIL;
    binding_tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding_tuple;
      SubLObject rule = NIL;
      SubLObject v_bindings = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list333 );
      rule = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list333 );
      v_bindings = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject hl_variables = kb_utilities.sort_terms( assertions_high.assertion_hl_variables( rule ), T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject value_tuple = bindings.napply_bindings( v_bindings, hl_variables );
        value_tuple = list_utilities.nmapcar( Symbols.symbol_function( $sym334$POSSIBLY_GENERICIZE_INDETERMINATE_TERM ), value_tuple );
        dictionary_utilities.dictionary_push( rule_map, rule, value_tuple );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list333 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding_tuple = cdolist_list_var.first();
    }
    return rule_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 45391L)
  public static SubLObject possibly_genericize_indeterminate_term(SubLObject v_term)
  {
    if( NIL != kb_accessors.indeterminate_termP( v_term ) )
    {
      v_term = defns.genericize_term_wrt_types( v_term, $const335$EverythingPSC );
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 45571L)
  public static SubLObject problem_store_rule_binding_type_map(final SubLObject store)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    final SubLObject tuples = problem_store_rule_bindings_tuples( store );
    final SubLObject type_map = rule_binding_type_map_from_rule_binding_tuples( tuples );
    return type_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 46143L)
  public static SubLObject problem_store_rule_bindings_tuples(final SubLObject store)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    SubLObject rule_bindings_tuples = NIL;
    final SubLObject idx = inference_datastructures_problem_store.problem_store_proof_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw336$SKIP ) )
    {
      final SubLObject idx_$5 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$5, $kw336$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$5 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject proof;
        SubLObject rule;
        SubLObject v_bindings;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          proof = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( proof ) || NIL == id_index.id_index_skip_tombstones_p( $kw336$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( proof ) )
            {
              proof = $kw336$SKIP;
            }
            if( NIL != inference_worker_transformation.generalized_transformation_proof_p( proof ) )
            {
              rule = inference_worker_transformation.generalized_transformation_proof_rule_assertion( proof );
              v_bindings = inference_worker_transformation.generalized_transformation_proof_rule_bindings( proof );
              v_bindings = unification.base_variable_transform( v_bindings );
              rule_bindings_tuples = ConsesLow.cons( ConsesLow.list( rule, v_bindings ), rule_bindings_tuples );
            }
          }
        }
      }
      final SubLObject idx_$6 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$6 ) || NIL == id_index.id_index_skip_tombstones_p( $kw336$SKIP ) )
      {
        final SubLObject sparse = id_index.id_index_sparse_objects( idx_$6 );
        SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$6 );
        final SubLObject end_id = id_index.id_index_next_id( idx_$6 );
        final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw336$SKIP ) ) ? NIL : $kw336$SKIP;
        while ( id2.numL( end_id ))
        {
          final SubLObject proof2 = Hashtables.gethash_without_values( id2, sparse, v_default );
          if( ( NIL == id_index.id_index_skip_tombstones_p( $kw336$SKIP ) || NIL == id_index.id_index_tombstone_p( proof2 ) ) && NIL != inference_worker_transformation.generalized_transformation_proof_p( proof2 ) )
          {
            final SubLObject rule2 = inference_worker_transformation.generalized_transformation_proof_rule_assertion( proof2 );
            SubLObject v_bindings2 = inference_worker_transformation.generalized_transformation_proof_rule_bindings( proof2 );
            v_bindings2 = unification.base_variable_transform( v_bindings2 );
            rule_bindings_tuples = ConsesLow.cons( ConsesLow.list( rule2, v_bindings2 ), rule_bindings_tuples );
          }
          id2 = Numbers.add( id2, ONE_INTEGER );
        }
      }
    }
    return Sequences.nreverse( rule_bindings_tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 46706L)
  public static SubLObject rule_binding_type_map_from_rule_binding_tuples(final SubLObject tuples)
  {
    final SubLObject rule_map = dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject cdolist_list_var = tuples;
    SubLObject binding_tuple = NIL;
    binding_tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding_tuple;
      SubLObject rule = NIL;
      SubLObject v_bindings = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list333 );
      rule = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list333 );
      v_bindings = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject var_map = map_utilities.map_get( rule_map, rule, NIL );
        if( NIL == var_map )
        {
          var_map = dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED );
          map_utilities.map_put( rule_map, rule, var_map );
        }
        SubLObject cdolist_list_var_$7 = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var_$7.first();
        while ( NIL != cdolist_list_var_$7)
        {
          final SubLObject var = bindings.variable_binding_variable( binding );
          final SubLObject value = bindings.variable_binding_value( binding );
          SubLObject cdolist_list_var_$8;
          final SubLObject types = cdolist_list_var_$8 = defns.min_generalizations( value, $const335$EverythingPSC );
          SubLObject type = NIL;
          type = cdolist_list_var_$8.first();
          while ( NIL != cdolist_list_var_$8)
          {
            map_utilities.map_push( var_map, var, type );
            cdolist_list_var_$8 = cdolist_list_var_$8.rest();
            type = cdolist_list_var_$8.first();
          }
          cdolist_list_var_$7 = cdolist_list_var_$7.rest();
          binding = cdolist_list_var_$7.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list333 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding_tuple = cdolist_list_var.first();
    }
    return rule_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 47376L)
  public static SubLObject show_rule_binding_type_map(final SubLObject type_map, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != map_utilities.map_p( type_map ) : type_map;
    final SubLObject iterator = map_utilities.new_map_iterator( type_map );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        SubLObject current;
        final SubLObject datum = current = var;
        SubLObject rule = NIL;
        SubLObject variable_map = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list338 );
        rule = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list338 );
        variable_map = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject _prev_bind_0 = control_vars.$variable_names$.currentBinding( thread );
          try
          {
            control_vars.$variable_names$.bind( assertions_high.assertion_variable_names( rule ), thread );
            PrintLow.format( stream, $str339$____Rule_ );
            format_cycl_expression.format_cycl_expression( uncanonicalizer.assertion_el_ist_formula( rule ), UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var;
            final SubLObject v_variables = cdolist_list_var = Sort.sort( conses_high.copy_list( map_utilities.map_keys( variable_map ) ), Symbols.symbol_function( $sym340$_ ), Symbols.symbol_function(
                $sym341$VARIABLE_ID ) );
            SubLObject var_$9 = NIL;
            var_$9 = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              PrintLow.format( stream, $str342$___S__, var_$9 );
              SubLObject types = map_utilities.map_get( variable_map, var_$9, UNPROVIDED );
              SubLObject cdolist_list_var_$10;
              types = ( cdolist_list_var_$10 = cardinality_estimates.sort_by_generality_estimate( conses_high.copy_list( types ), $kw343$ASCENDING ) );
              SubLObject type = NIL;
              type = cdolist_list_var_$10.first();
              while ( NIL != cdolist_list_var_$10)
              {
                PrintLow.format( stream, $str344$_____S, type );
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                type = cdolist_list_var_$10.first();
              }
              cdolist_list_var = cdolist_list_var.rest();
              var_$9 = cdolist_list_var.first();
            }
          }
          finally
          {
            control_vars.$variable_names$.rebind( _prev_bind_0, thread );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list338 );
        }
      }
    }
    streams_high.force_output( stream );
    return type_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 48445L)
  public static SubLObject gathering_forward_inference_metrics(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$11 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list345 );
      current_$11 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list345 );
      if( NIL == conses_high.member( current_$11, $list346, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$11 == $kw347$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list345 );
    }
    final SubLObject browsableP_tail = cdestructuring_bind.property_list_member( $kw348$BROWSABLE_, current );
    final SubLObject browsableP = ( NIL != browsableP_tail ) ? conses_high.cadr( browsableP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym349$CLET, ConsesLow.list( $list350, ConsesLow.list( $sym351$_BROWSE_FORWARD_INFERENCES__, browsableP ) ), ConsesLow.append( body, $list352 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 48830L)
  public static SubLObject show_forward_inference_metrics_of(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list353 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list353 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list353 );
      if( NIL == conses_high.member( current_$12, $list354, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw347$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list353 );
    }
    final SubLObject threshold_tail = cdestructuring_bind.property_list_member( $kw355$THRESHOLD, current );
    final SubLObject threshold = ( NIL != threshold_tail ) ? conses_high.cadr( threshold_tail ) : NIL;
    final SubLObject browsableP_tail = cdestructuring_bind.property_list_member( $kw348$BROWSABLE_, current );
    final SubLObject browsableP = ( NIL != browsableP_tail ) ? conses_high.cadr( browsableP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym356$GATHERING_FORWARD_INFERENCE_METRICS, ConsesLow.list( $kw348$BROWSABLE_, browsableP ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym357$SHOW_FORWARD_INFERENCE_METRICS,
        threshold ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 49141L)
  public static SubLObject show_new_forward_inference_metrics_of(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list353 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$13 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list353 );
      current_$13 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list353 );
      if( NIL == conses_high.member( current_$13, $list354, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$13 == $kw347$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list353 );
    }
    final SubLObject threshold_tail = cdestructuring_bind.property_list_member( $kw355$THRESHOLD, current );
    final SubLObject threshold = ( NIL != threshold_tail ) ? conses_high.cadr( threshold_tail ) : NIL;
    final SubLObject browsableP_tail = cdestructuring_bind.property_list_member( $kw348$BROWSABLE_, current );
    final SubLObject browsableP = ( NIL != browsableP_tail ) ? conses_high.cadr( browsableP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym358$PROGN, $list359, ConsesLow.listS( $sym360$SHOW_FORWARD_INFERENCE_METRICS_OF, ConsesLow.list( $kw355$THRESHOLD, threshold, $kw348$BROWSABLE_, browsableP ), ConsesLow.append( body,
        NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 49733L)
  public static SubLObject forward_inference_metrics_time_index()
  {
    return $forward_inference_metrics_time_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 50006L)
  public static SubLObject forward_inference_metrics_count_index()
  {
    return $forward_inference_metrics_count_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 50274L)
  public static SubLObject forward_inference_metrics_inference_index()
  {
    return $forward_inference_metrics_inference_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 50389L)
  public static SubLObject finalize_forward_inference_metrics_inference_index()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject index = forward_inference_metrics_inference_index();
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( index ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject inferences = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject valid_inferences = list_utilities.remove_if_not( $sym364$VALID_INFERENCE_P, inferences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      dictionary.dictionary_enter( index, rule, valid_inferences );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 50855L)
  public static SubLObject forward_inference_metrics_gaf_index()
  {
    return $forward_inference_metrics_gaf_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 51124L)
  public static SubLObject forward_inference_time_metric_total_time(final SubLObject time_plist)
  {
    return Functions.apply( $sym367$_, list_utilities.plist_values( time_plist ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 51243L)
  public static SubLObject forward_inference_metrics_successful_rule_index()
  {
    return $forward_inference_metrics_successful_rule_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 51370L)
  public static SubLObject clear_forward_inference_metrics()
  {
    dictionary.clear_dictionary( forward_inference_metrics_time_index() );
    dictionary.clear_dictionary( forward_inference_metrics_count_index() );
    dictionary.clear_dictionary( forward_inference_metrics_inference_index() );
    dictionary.clear_dictionary( forward_inference_metrics_gaf_index() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 51682L)
  public static SubLObject save_forward_inference_metrics(final SubLObject filename, SubLObject externalizedP)
  {
    if( externalizedP == UNPROVIDED )
    {
      externalizedP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw368$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str369$Unable_to_open__S, filename );
      }
      final SubLObject stream_$14 = stream;
      dumper.dump_copyright( stream_$14 );
      cfasl.cfasl_output_maybe_externalized( $forward_inference_metrics_time_index$.getGlobalValue(), stream_$14, externalizedP );
      cfasl.cfasl_output_maybe_externalized( $forward_inference_metrics_count_index$.getGlobalValue(), stream_$14, externalizedP );
      cfasl.cfasl_output_maybe_externalized( $forward_inference_metrics_inference_index$.getGlobalValue(), stream_$14, externalizedP );
      cfasl.cfasl_output_maybe_externalized( $forward_inference_metrics_gaf_index$.getGlobalValue(), stream_$14, externalizedP );
      cfasl.cfasl_output_maybe_externalized( $forward_inference_metrics_successful_rule_index$.getGlobalValue(), stream_$14, externalizedP );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 52373L)
  public static SubLObject load_forward_inference_metrics(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw370$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str369$Unable_to_open__S, filename );
      }
      final SubLObject stream_$15 = stream;
      dumper.load_copyright( stream_$15 );
      $forward_inference_metrics_time_index$.setGlobalValue( cfasl.cfasl_input( stream_$15, UNPROVIDED, UNPROVIDED ) );
      $forward_inference_metrics_count_index$.setGlobalValue( cfasl.cfasl_input( stream_$15, UNPROVIDED, UNPROVIDED ) );
      $forward_inference_metrics_inference_index$.setGlobalValue( cfasl.cfasl_input( stream_$15, UNPROVIDED, UNPROVIDED ) );
      $forward_inference_metrics_gaf_index$.setGlobalValue( cfasl.cfasl_input( stream_$15, UNPROVIDED, UNPROVIDED ) );
      if( $kw371$EOF != cfasl.cfasl_opcode_peek( stream_$15, NIL, $kw371$EOF ) )
      {
        $forward_inference_metrics_successful_rule_index$.setGlobalValue( cfasl.cfasl_input( stream_$15, UNPROVIDED, UNPROVIDED ) );
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $forward_inference_metrics_time_index$.getGlobalValue() ) ); NIL == dictionary_contents
        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject time_data = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( time_data.isNumber() )
      {
        dictionary.dictionary_enter( $forward_inference_metrics_time_index$.getGlobalValue(), rule, ConsesLow.list( $kw36$INFERENCE, Numbers.multiply( time_data, numeric_date_utilities.$milliseconds_in_a_second$
            .getGlobalValue() ) ) );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $forward_inference_metrics_count_index$.getGlobalValue() ) ); NIL == dictionary_contents
        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject count_data = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( count_data.isNumber() )
      {
        dictionary.dictionary_enter( $forward_inference_metrics_count_index$.getGlobalValue(), rule, ConsesLow.list( $kw36$INFERENCE, count_data ) );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 53566L)
  public static SubLObject elapsed_forward_inference_metric_time()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $gathering_forward_inference_metricsP$.getDynamicValue( thread ) && NIL != $forward_inference_last_metric_time$.getDynamicValue( thread ) )
    {
      final SubLObject prev_time = $forward_inference_last_metric_time$.getDynamicValue( thread );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $forward_inference_metrics_lock$.getGlobalValue() );
        $forward_inference_last_metric_time$.setDynamicValue( numeric_date_utilities.get_internal_real_time_ms(), thread );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $forward_inference_metrics_lock$.getGlobalValue() );
        }
      }
      if( NIL != prev_time )
      {
        return Numbers.subtract( $forward_inference_last_metric_time$.getDynamicValue( thread ), prev_time );
      }
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 54014L)
  public static SubLObject initial_forward_inference_metric_time()
  {
    return numeric_date_utilities.get_internal_real_time_ms();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 54111L)
  public static SubLObject clear_get_forward_inference_metric_type_and_metric_list()
  {
    final SubLObject cs = $get_forward_inference_metric_type_and_metric_list_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 54111L)
  public static SubLObject remove_get_forward_inference_metric_type_and_metric_list(final SubLObject metric_type, final SubLObject metric)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_forward_inference_metric_type_and_metric_list_caching_state$.getGlobalValue(), ConsesLow.list( metric_type, metric ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 54111L)
  public static SubLObject get_forward_inference_metric_type_and_metric_list_internal(final SubLObject metric_type, final SubLObject metric)
  {
    return ConsesLow.list( metric_type, metric );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 54111L)
  public static SubLObject get_forward_inference_metric_type_and_metric_list(final SubLObject metric_type, final SubLObject metric)
  {
    SubLObject caching_state = $get_forward_inference_metric_type_and_metric_list_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym372$GET_FORWARD_INFERENCE_METRIC_TYPE_AND_METRIC_LIST, $sym373$_GET_FORWARD_INFERENCE_METRIC_TYPE_AND_METRIC_LIST_CACHING_STATE_, NIL,
          EQL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( metric_type, metric );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( metric_type.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && metric.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_forward_inference_metric_type_and_metric_list_internal( metric_type, metric ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( metric_type, metric ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 54378L)
  public static SubLObject increment_forward_inference_metrics(final SubLObject metric_type, final SubLObject metric, SubLObject gaf, SubLObject rule, SubLObject count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $gathering_forward_inference_metricsP$.getDynamicValue( thread ) && NIL != $forward_inference_last_metric_time$.getDynamicValue( thread ) )
    {
      if( NIL == count )
      {
        count = ONE_INTEGER;
      }
      if( NIL == gaf )
      {
        gaf = forward.current_forward_inference_gaf();
      }
      if( NIL == assertion_handles.assertion_p( gaf ) )
      {
        gaf = NIL;
      }
      if( NIL == rule )
      {
        rule = forward.current_forward_inference_rule();
      }
      if( NIL == assertion_handles.assertion_p( rule ) )
      {
        rule = NIL;
      }
      final SubLObject metric_id = get_forward_inference_metric_type_and_metric_list( metric_type, metric );
      final SubLObject elapsed_time = elapsed_forward_inference_metric_time();
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $forward_inference_metrics_lock$.getGlobalValue() );
        if( NIL != gaf && NIL != rule )
        {
          dictionary_utilities.dictionary_pushnew( forward_inference_metrics_gaf_index(), rule, gaf, UNPROVIDED, UNPROVIDED );
        }
        if( elapsed_time.isNumber() )
        {
          if( NIL != number_utilities.negative_number_p( elapsed_time ) )
          {
            format_nil.force_format( T, $str375$Negative_time___A_for___A__A___, elapsed_time, metric_type, metric, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          SubLObject time_plist = dictionary.dictionary_lookup_without_values( forward_inference_metrics_time_index(), rule, UNPROVIDED );
          time_plist = conses_high.putf( time_plist, metric_id, Numbers.add( list_utilities.plist_lookup( time_plist, metric_id, ZERO_INTEGER ), elapsed_time ) );
          dictionary.dictionary_enter( forward_inference_metrics_time_index(), rule, time_plist );
        }
        SubLObject count_plist = dictionary.dictionary_lookup_without_values( forward_inference_metrics_count_index(), rule, UNPROVIDED );
        count_plist = conses_high.putf( count_plist, metric_id, Numbers.add( list_utilities.plist_lookup( count_plist, metric_id, ZERO_INTEGER ), count ) );
        dictionary.dictionary_enter( forward_inference_metrics_count_index(), rule, count_plist );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $forward_inference_metrics_lock$.getGlobalValue() );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 55839L)
  public static SubLObject note_forward_inference_for_rule(final SubLObject rule, final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$browse_forward_inferencesP$.getDynamicValue( thread ) && NIL != inference_datastructures_inference.inference_p( inference ) )
    {
      dictionary_utilities.dictionary_push( forward_inference_metrics_inference_index(), rule, inference );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 56078L)
  public static SubLObject note_forward_inference_successful_rule(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $gathering_forward_inference_metricsP$.getDynamicValue( thread ) )
    {
      final SubLObject gaf = forward.current_forward_inference_gaf();
      if( NIL != gaf )
      {
        dictionary_utilities.dictionary_pushnew( forward_inference_metrics_successful_rule_index(), rule, gaf, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        dictionary_utilities.dictionary_pushnew( forward_inference_metrics_successful_rule_index(), rule, $kw376$UNKNOWN_GAF, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 56449L)
  public static SubLObject forward_inference_metrics_info(SubLObject threshold)
  {
    if( threshold == UNPROVIDED )
    {
      threshold = NIL;
    }
    return forward_inference_metrics_info_for_rules( all_forward_inference_metrics_rules(), threshold );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 56622L)
  public static SubLObject forward_inference_metrics_info_for_rules(SubLObject rules, SubLObject threshold)
  {
    if( rules == UNPROVIDED )
    {
      rules = all_forward_inference_metrics_rules();
    }
    if( threshold == UNPROVIDED )
    {
      threshold = NIL;
    }
    finalize_forward_inference_metrics_inference_index();
    SubLObject entries = dictionary_utilities.dictionary_to_alist( $forward_inference_metrics_time_index$.getGlobalValue() );
    entries = Sequences.delete( NIL, entries, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym377$CDR ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    entries = Sort.sort( entries, Symbols.symbol_function( $sym378$_ ), Symbols.symbol_function( $sym379$FORWARD_INFERENCE_TIME_METRIC_TOTAL_TIME_FROM_CDR ) );
    SubLObject info = NIL;
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = entries;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject rule = NIL;
      SubLObject time_plist = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list380 );
      rule = current.first();
      current = ( time_plist = current.rest() );
      if( ( NIL == rule || NIL != list_utilities.member_kbeqP( rule, rules ) ) && ( NIL == threshold || index.numL( threshold ) ) )
      {
        final SubLObject total_time = forward_inference_time_metric_total_time( time_plist );
        info = ConsesLow.cons( rule_forward_inference_metrics_info_int( rule, total_time ), info );
      }
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return Sequences.nreverse( info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 57451L)
  public static SubLObject forward_inference_time_metric_total_time_from_cdr(final SubLObject alist_entry)
  {
    return forward_inference_time_metric_total_time( alist_entry.rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 57604L)
  public static SubLObject forward_inference_successful_rules()
  {
    return dictionary.dictionary_keys( forward_inference_metrics_successful_rule_index() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 58256L)
  public static SubLObject forward_inference_unsuccessful_rules()
  {
    return conses_high.set_difference( dictionary.dictionary_keys( forward_inference_metrics_gaf_index() ), dictionary.dictionary_keys( forward_inference_metrics_successful_rule_index() ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 59023L)
  public static SubLObject all_forward_inference_metrics_rules()
  {
    return dictionary.dictionary_keys( forward_inference_metrics_gaf_index() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 59228L)
  public static SubLObject forward_inference_triggered_tms_rules()
  {
    return list_utilities.remove_if_not( $sym381$FORWARD_TMS_RULE_, all_forward_inference_metrics_rules(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 59460L)
  public static SubLObject forward_inference_success_metrics_from_info(final SubLObject full_info)
  {
    SubLObject success_rule_count = ZERO_INTEGER;
    SubLObject success_trigger_count = ZERO_INTEGER;
    SubLObject success_time_estimate = ZERO_INTEGER;
    final SubLObject success_inference_time_estimate = ZERO_INTEGER;
    SubLObject total_rule_count = ZERO_INTEGER;
    SubLObject total_trigger_count = ZERO_INTEGER;
    SubLObject total_time = ZERO_INTEGER;
    SubLObject total_inference_time = ZERO_INTEGER;
    SubLObject cdolist_list_var = full_info;
    SubLObject info = NIL;
    info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current;
      final SubLObject datum = current = info;
      final SubLObject rule_tail = cdestructuring_bind.property_list_member( $kw382$RULE, current );
      final SubLObject rule = ( NIL != rule_tail ) ? conses_high.cadr( rule_tail ) : NIL;
      final SubLObject time_tail = cdestructuring_bind.property_list_member( $kw383$TIME, current );
      final SubLObject time = ( NIL != time_tail ) ? conses_high.cadr( time_tail ) : NIL;
      final SubLObject inference_time_tail = cdestructuring_bind.property_list_member( $kw384$INFERENCE_TIME, current );
      final SubLObject inference_time = ( NIL != inference_time_tail ) ? conses_high.cadr( inference_time_tail ) : NIL;
      final SubLObject inference_count_tail = cdestructuring_bind.property_list_member( $kw385$INFERENCE_COUNT, current );
      final SubLObject inference_count = ( NIL != inference_count_tail ) ? conses_high.cadr( inference_count_tail ) : NIL;
      final SubLObject trigger_gafs_tail = cdestructuring_bind.property_list_member( $kw386$TRIGGER_GAFS, current );
      final SubLObject trigger_gafs = ( NIL != trigger_gafs_tail ) ? conses_high.cadr( trigger_gafs_tail ) : NIL;
      if( NIL != rule )
      {
        final SubLObject trigger_count = Sequences.length( trigger_gafs );
        SubLObject rule_success_count = ZERO_INTEGER;
        total_rule_count = Numbers.add( total_rule_count, ONE_INTEGER );
        SubLObject cdolist_list_var_$16 = trigger_gafs;
        SubLObject trigger_gaf = NIL;
        trigger_gaf = cdolist_list_var_$16.first();
        while ( NIL != cdolist_list_var_$16)
        {
          total_trigger_count = Numbers.add( total_trigger_count, ONE_INTEGER );
          if( NIL != assertion_handles.assertion_p( rule ) && NIL != assertion_handles.valid_assertionP( trigger_gaf, UNPROVIDED ) && NIL != assertion_utilities
              .assertion_has_dependent_with_supportP_kb_hl_support_aware_version( trigger_gaf, rule ) )
          {
            success_trigger_count = Numbers.add( success_trigger_count, ONE_INTEGER );
            rule_success_count = Numbers.add( rule_success_count, ONE_INTEGER );
          }
          cdolist_list_var_$16 = cdolist_list_var_$16.rest();
          trigger_gaf = cdolist_list_var_$16.first();
        }
        if( rule_success_count.isPositive() )
        {
          success_rule_count = Numbers.add( success_rule_count, ONE_INTEGER );
        }
        total_time = Numbers.add( total_time, time );
        if( NIL != inference_time )
        {
          total_inference_time = Numbers.add( total_inference_time, inference_time );
          final SubLObject rule_success_trigger_ratio = number_utilities.safe_X( rule_success_count, trigger_count );
          final SubLObject rule_success_estimate = Numbers.multiply( rule_success_trigger_ratio, inference_time );
          success_time_estimate = Numbers.add( success_time_estimate, rule_success_estimate );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      info = cdolist_list_var.first();
    }
    return ConsesLow.listS( $kw387$SUCCESS_RULE_COUNT, new SubLObject[] { success_rule_count, $kw388$SUCCESS_TRIGGER_COUNT, success_trigger_count, $kw389$SUCCESS_TIME_ESTIMATE, success_time_estimate,
      $kw390$TOTAL_RULE_COUNT, total_rule_count, $kw391$TOTAL_TRIGGER_COUNT, total_trigger_count, $kw52$TOTAL_TIME, total_time, $kw392$TOTAL_INFERENCE_TIME, total_inference_time, total_time.isPositive() ? ConsesLow.list(
          $kw393$SUCCESS_RULE_RATIO, number_utilities.safe_X( success_rule_count, total_rule_count ), $kw394$SUCCESS_TRIGGER_RATIO, number_utilities.safe_X( success_trigger_count, total_trigger_count ),
          $kw395$SUCCESS_TIME_RATIO, number_utilities.safe_X( success_time_estimate, total_inference_time ), $kw396$SUCCESS_INFERENCE_TIME_RATIO, number_utilities.safe_X( success_inference_time_estimate,
              total_inference_time ) ) : NIL
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 61545L)
  public static SubLObject forward_inference_success_metrics(SubLObject rules)
  {
    if( rules == UNPROVIDED )
    {
      rules = all_forward_inference_metrics_rules();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject trigger_gaf_index = forward_inference_metrics_gaf_index();
    SubLObject success_rule_count = ZERO_INTEGER;
    SubLObject success_trigger_count = ZERO_INTEGER;
    SubLObject success_time_estimate = ZERO_INTEGER;
    SubLObject total_rule_count = ZERO_INTEGER;
    SubLObject total_trigger_count = ZERO_INTEGER;
    SubLObject total_time = ZERO_INTEGER;
    SubLObject cdolist_list_var = rules;
    SubLObject rule = NIL;
    rule = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject trigger_gafs = dictionary.dictionary_lookup_without_values( trigger_gaf_index, rule, UNPROVIDED );
      final SubLObject info = rule_forward_inference_metrics_info( rule );
      if( NIL != trigger_gafs )
      {
        final SubLObject current;
        final SubLObject datum = current = info;
        final SubLObject time_tail = cdestructuring_bind.property_list_member( $kw383$TIME, current );
        final SubLObject time = ( NIL != time_tail ) ? conses_high.cadr( time_tail ) : NIL;
        final SubLObject inference_time_tail = cdestructuring_bind.property_list_member( $kw384$INFERENCE_TIME, current );
        final SubLObject inference_time = ( NIL != inference_time_tail ) ? conses_high.cadr( inference_time_tail ) : NIL;
        final SubLObject inference_count_tail = cdestructuring_bind.property_list_member( $kw385$INFERENCE_COUNT, current );
        final SubLObject inference_count = ( NIL != inference_count_tail ) ? conses_high.cadr( inference_count_tail ) : NIL;
        thread.resetMultipleValues();
        final SubLObject trigger_gaf_count = forward_inference_metrics_rule_success_info( rule, time, trigger_gafs );
        final SubLObject rule_success_count = thread.secondMultipleValue();
        final SubLObject rule_success_time_estimate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        total_rule_count = Numbers.add( total_rule_count, ONE_INTEGER );
        if( rule_success_count.isPositive() )
        {
          success_rule_count = Numbers.add( success_rule_count, ONE_INTEGER );
        }
        total_trigger_count = Numbers.add( total_trigger_count, trigger_gaf_count );
        success_trigger_count = Numbers.add( success_trigger_count, rule_success_count );
        total_time = Numbers.add( total_time, time );
        success_time_estimate = Numbers.add( success_time_estimate, rule_success_time_estimate );
      }
      cdolist_list_var = cdolist_list_var.rest();
      rule = cdolist_list_var.first();
    }
    return ConsesLow.listS( $kw387$SUCCESS_RULE_COUNT, new SubLObject[] { success_rule_count, $kw388$SUCCESS_TRIGGER_COUNT, success_trigger_count, $kw389$SUCCESS_TIME_ESTIMATE, success_time_estimate,
      $kw390$TOTAL_RULE_COUNT, total_rule_count, $kw391$TOTAL_TRIGGER_COUNT, total_trigger_count, $kw52$TOTAL_TIME, total_time, total_time.isPositive() ? ConsesLow.list( $kw393$SUCCESS_RULE_RATIO, number_utilities
          .safe_X( success_rule_count, total_rule_count ), $kw394$SUCCESS_TRIGGER_RATIO, number_utilities.safe_X( success_trigger_count, total_trigger_count ), $kw395$SUCCESS_TIME_RATIO, number_utilities.safe_X(
              success_time_estimate, total_time ) ) : NIL
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 63287L)
  public static SubLObject forward_inference_metrics_time_totals()
  {
    finalize_forward_inference_metrics_inference_index();
    SubLObject result_plist = NIL;
    final SubLObject entries = dictionary_utilities.dictionary_to_alist( $forward_inference_metrics_time_index$.getGlobalValue() );
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = entries;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject rule = NIL;
      SubLObject time_plist = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list380 );
      rule = current.first();
      current = ( time_plist = current.rest() );
      SubLObject remainder;
      SubLObject metric;
      SubLObject time;
      for( remainder = NIL, remainder = time_plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
      {
        metric = remainder.first();
        time = conses_high.cadr( remainder );
        result_plist = conses_high.putf( result_plist, metric, Numbers.add( list_utilities.plist_lookup( result_plist, metric, ZERO_INTEGER ), time ) );
      }
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return result_plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 63739L)
  public static SubLObject forward_inference_metrics_count_totals()
  {
    finalize_forward_inference_metrics_inference_index();
    SubLObject result_plist = NIL;
    final SubLObject entries = dictionary_utilities.dictionary_to_alist( $forward_inference_metrics_count_index$.getGlobalValue() );
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = entries;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject rule = NIL;
      SubLObject count_plist = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list397 );
      rule = current.first();
      current = ( count_plist = current.rest() );
      SubLObject remainder;
      SubLObject metric;
      SubLObject count;
      for( remainder = NIL, remainder = count_plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
      {
        metric = remainder.first();
        count = conses_high.cadr( remainder );
        result_plist = conses_high.putf( result_plist, metric, Numbers.add( list_utilities.plist_lookup( result_plist, metric, ZERO_INTEGER ), count ) );
      }
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return result_plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 64157L)
  public static SubLObject rule_forward_inference_metrics_deductions_from_trigger_gafs(final SubLObject rule)
  {
    final SubLObject trigger_gaf_index = forward_inference_metrics_gaf_index();
    final SubLObject trigger_gafs = dictionary.dictionary_lookup_without_values( trigger_gaf_index, rule, UNPROVIDED );
    final SubLObject deductions = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject cdolist_list_var = trigger_gafs;
    SubLObject trigger_gaf = NIL;
    trigger_gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject set_contents_var = assertions_high.assertion_dependents( trigger_gaf );
      SubLObject basis_object;
      SubLObject state;
      SubLObject deduction;
      SubLObject cdolist_list_var_$17;
      SubLObject deduction_support;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        deduction = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) )
        {
          cdolist_list_var_$17 = deductions_high.deduction_supports( deduction );
          deduction_support = NIL;
          deduction_support = cdolist_list_var_$17.first();
          while ( NIL != cdolist_list_var_$17)
          {
            if( NIL != arguments.support_equal( deduction_support, rule ) )
            {
              set.set_add( deduction, deductions );
            }
            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
            deduction_support = cdolist_list_var_$17.first();
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      trigger_gaf = cdolist_list_var.first();
    }
    return Sort.sort( set.set_element_list( deductions ), Symbols.symbol_function( $sym340$_ ), Symbols.symbol_function( $sym398$DEDUCTION_ID ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 64840L)
  public static SubLObject rule_forward_inference_metrics_info(final SubLObject rule)
  {
    final SubLObject time_plist = dictionary.dictionary_lookup_without_values( $forward_inference_metrics_time_index$.getGlobalValue(), rule, UNPROVIDED );
    final SubLObject total_time = forward_inference_time_metric_total_time( time_plist );
    return rule_forward_inference_metrics_info_int( rule, total_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 65146L)
  public static SubLObject rule_forward_inference_metrics_info_int(final SubLObject rule, final SubLObject time)
  {
    final SubLObject gafs = dictionary.dictionary_lookup( forward_inference_metrics_gaf_index(), rule, NIL );
    final SubLObject inferences = dictionary.dictionary_lookup( forward_inference_metrics_inference_index(), rule, NIL );
    final SubLObject time_plist = conses_high.copy_list( dictionary.dictionary_lookup( forward_inference_metrics_time_index(), rule, NIL ) );
    final SubLObject count_plist = conses_high.copy_list( dictionary.dictionary_lookup( forward_inference_metrics_count_index(), rule, NIL ) );
    SubLObject inference_time = ZERO_INTEGER;
    SubLObject remainder;
    SubLObject metric;
    SubLObject time_$18;
    for( remainder = NIL, remainder = time_plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      metric = remainder.first();
      time_$18 = conses_high.cadr( remainder );
      if( $kw36$INFERENCE == ( metric.isCons() ? metric.first() : metric ) )
      {
        inference_time = Numbers.add( inference_time, time_$18 );
      }
    }
    return ConsesLow.listS( $kw382$RULE, new SubLObject[] { rule, $kw383$TIME, time, $kw384$INFERENCE_TIME, inference_time, $kw399$TIME_PLIST, time_plist, $kw400$COUNT_PLIST, count_plist, $kw386$TRIGGER_GAFS, conses_high
        .copy_list( gafs ), $kw385$INFERENCE_COUNT, conses_high.getf( count_plist, get_forward_inference_metric_type_and_metric_list( $kw36$INFERENCE, $kw401$OVERHEAD ), ZERO_INTEGER ), ( NIL != inferences ) ? ConsesLow
            .list( $kw402$INFERENCES, conses_high.copy_list( inferences ) ) : NIL
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 66385L)
  public static SubLObject global_statistics_from_forward_inference_metrics_info(final SubLObject info)
  {
    SubLObject total_rules = ZERO_INTEGER;
    SubLObject total_time = ZERO_INTEGER;
    SubLObject total_inference_time = ZERO_INTEGER;
    SubLObject total_inferences = ZERO_INTEGER;
    SubLObject total_triggers = ZERO_INTEGER;
    SubLObject rule_times = NIL;
    SubLObject rule_inference_counts = NIL;
    SubLObject trigger_counts = NIL;
    SubLObject rule_average_times = NIL;
    SubLObject trigger_average_times = NIL;
    if( NIL == info )
    {
      return ConsesLow.list( $kw52$TOTAL_TIME, total_time, $kw392$TOTAL_INFERENCE_TIME, total_inference_time, $kw403$TOTAL_INFERENCES, total_inferences, $kw404$TOTAL_RULES, total_rules );
    }
    SubLObject cdolist_list_var = info;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current;
      final SubLObject datum = current = item;
      final SubLObject rule_tail = cdestructuring_bind.property_list_member( $kw382$RULE, current );
      final SubLObject rule = ( NIL != rule_tail ) ? conses_high.cadr( rule_tail ) : NIL;
      final SubLObject time_tail = cdestructuring_bind.property_list_member( $kw383$TIME, current );
      final SubLObject time = ( NIL != time_tail ) ? conses_high.cadr( time_tail ) : NIL;
      final SubLObject inference_time_tail = cdestructuring_bind.property_list_member( $kw384$INFERENCE_TIME, current );
      final SubLObject inference_time = ( NIL != inference_time_tail ) ? conses_high.cadr( inference_time_tail ) : NIL;
      final SubLObject inference_count_tail = cdestructuring_bind.property_list_member( $kw385$INFERENCE_COUNT, current );
      final SubLObject inference_count = ( NIL != inference_count_tail ) ? conses_high.cadr( inference_count_tail ) : NIL;
      final SubLObject trigger_gafs_tail = cdestructuring_bind.property_list_member( $kw386$TRIGGER_GAFS, current );
      final SubLObject trigger_gafs = ( NIL != trigger_gafs_tail ) ? conses_high.cadr( trigger_gafs_tail ) : NIL;
      final SubLObject trigger_count = Sequences.length( trigger_gafs );
      if( NIL != rule )
      {
        total_rules = Numbers.add( total_rules, ONE_INTEGER );
      }
      if( time.isNumber() )
      {
        total_time = Numbers.add( total_time, time );
        rule_times = ConsesLow.cons( time, rule_times );
      }
      if( inference_time.isNumber() )
      {
        total_inference_time = Numbers.add( total_inference_time, inference_time );
      }
      if( inference_count.isPositive() )
      {
        total_inferences = Numbers.add( total_inferences, inference_count );
        rule_inference_counts = ConsesLow.cons( inference_count, rule_inference_counts );
        rule_average_times = ConsesLow.cons( number_utilities.safe_X( inference_time, inference_count ), rule_average_times );
      }
      if( trigger_count.isPositive() )
      {
        total_triggers = Numbers.add( total_triggers, trigger_count );
        trigger_counts = ConsesLow.cons( trigger_count, trigger_counts );
        trigger_average_times = ConsesLow.cons( number_utilities.safe_X( time, trigger_count ), trigger_average_times );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    final SubLObject average_inferences_per_rule = number_utilities.safe_X( total_inferences, total_rules );
    final SubLObject stdev_inferences_per_rule = number_utilities.safe_standard_deviation_from_sample( rule_inference_counts );
    final SubLObject average_trigger_per_rule = number_utilities.safe_X( total_triggers, total_rules );
    final SubLObject stdev_trigger_per_rule = number_utilities.safe_standard_deviation_from_sample( trigger_counts );
    final SubLObject average_time_per_rule = number_utilities.safe_X( total_time, total_rules );
    final SubLObject stdev_time_per_rule = number_utilities.safe_standard_deviation_from_sample( rule_times );
    final SubLObject average_time_per_inference = number_utilities.safe_X( total_inference_time, total_inferences );
    final SubLObject stdev_time_per_inference = number_utilities.safe_standard_deviation_from_sample( rule_average_times );
    final SubLObject average_time_per_trigger = number_utilities.safe_X( total_time, total_triggers );
    final SubLObject stdev_time_per_trigger = number_utilities.safe_standard_deviation_from_sample( trigger_average_times );
    final SubLObject global_statistics = ConsesLow.list( new SubLObject[] { $kw52$TOTAL_TIME, total_time, $kw392$TOTAL_INFERENCE_TIME, total_inference_time, $kw403$TOTAL_INFERENCES, total_inferences,
      $kw405$TOTAL_TRIGGERS, total_triggers, $kw404$TOTAL_RULES, total_rules, $kw406$AVERAGE_INFERENCES_PER_RULE, average_inferences_per_rule, $kw407$STDEV_INFERENCES_PER_RULE, stdev_inferences_per_rule,
      $kw408$AVERAGE_TRIGGER_PER_RULE, average_trigger_per_rule, $kw409$STDEV_TRIGGER_PER_RULE, stdev_trigger_per_rule, $kw410$AVERAGE_TIME_PER_RULE, average_time_per_rule, $kw411$STDEV_TIME_PER_RULE,
      stdev_time_per_rule, $kw412$AVERAGE_TIME_PER_INFERENCE, average_time_per_inference, $kw413$STDEV_TIME_PER_INFERENCE, stdev_time_per_inference, $kw414$AVERAGE_TIME_PER_TRIGGER, average_time_per_trigger,
      $kw415$STDEV_TIME_PER_TRIGGER, stdev_time_per_trigger
    } );
    return global_statistics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 69512L)
  public static SubLObject show_forward_inference_metrics(SubLObject threshold, SubLObject stream)
  {
    if( threshold == UNPROVIDED )
    {
      threshold = NIL;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLObject info = forward_inference_metrics_info( threshold );
    SubLObject total_time = ZERO_INTEGER;
    SubLObject cdolist_list_var = info;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current;
      final SubLObject datum = current = item;
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current;
      SubLObject bad = NIL;
      SubLObject current_$19 = NIL;
      while ( NIL != rest)
      {
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list416 );
        current_$19 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list416 );
        if( NIL == conses_high.member( current_$19, $list417, UNPROVIDED, UNPROVIDED ) )
        {
          bad = T;
        }
        if( current_$19 == $kw347$ALLOW_OTHER_KEYS )
        {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if( NIL != bad && NIL == allow_other_keys_p )
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list416 );
      }
      final SubLObject rule_tail = cdestructuring_bind.property_list_member( $kw382$RULE, current );
      final SubLObject rule = ( NIL != rule_tail ) ? conses_high.cadr( rule_tail ) : NIL;
      final SubLObject time_tail = cdestructuring_bind.property_list_member( $kw383$TIME, current );
      final SubLObject time = ( NIL != time_tail ) ? conses_high.cadr( time_tail ) : NIL;
      final SubLObject trigger_gafs_tail = cdestructuring_bind.property_list_member( $kw386$TRIGGER_GAFS, current );
      final SubLObject trigger_gafs = ( NIL != trigger_gafs_tail ) ? conses_high.cadr( trigger_gafs_tail ) : NIL;
      final SubLObject inference_count_tail = cdestructuring_bind.property_list_member( $kw385$INFERENCE_COUNT, current );
      final SubLObject inference_count = ( NIL != inference_count_tail ) ? conses_high.cadr( inference_count_tail ) : NIL;
      final SubLObject inferences_tail = cdestructuring_bind.property_list_member( $kw402$INFERENCES, current );
      final SubLObject inferences = ( NIL != inferences_tail ) ? conses_high.cadr( inferences_tail ) : NIL;
      total_time = Numbers.add( total_time, time );
      PrintLow.format( stream, $str418$___6F____S____S__a__S, new SubLObject[] { time, inference_count, rule, assertion_handles.assertion_id( rule )
      } );
      if( NIL != trigger_gafs )
      {
        PrintLow.format( stream, $str419$___S, trigger_gafs );
      }
      if( NIL != inferences )
      {
        PrintLow.format( stream, $str419$___S, inferences );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return total_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 70241L)
  public static SubLObject show_forward_inference_metrics_of_asserting(final SubLObject sentence, final SubLObject mt, SubLObject threshold, SubLObject browsableP)
  {
    if( threshold == UNPROVIDED )
    {
      threshold = NIL;
    }
    if( browsableP == UNPROVIDED )
    {
      browsableP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_forward_inference_metrics();
    final SubLObject _prev_bind_0 = $gathering_forward_inference_metricsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$browse_forward_inferencesP$.currentBinding( thread );
    try
    {
      $gathering_forward_inference_metricsP$.bind( T, thread );
      control_vars.$browse_forward_inferencesP$.bind( browsableP, thread );
      cyc_kernel.cyc_unassert( sentence, mt );
      cyc_kernel.cyc_assert( sentence, mt, UNPROVIDED );
      show_forward_inference_metrics( threshold, UNPROVIDED );
      finalize_forward_inference_metrics_inference_index();
    }
    finally
    {
      control_vars.$browse_forward_inferencesP$.rebind( _prev_bind_2, thread );
      $gathering_forward_inference_metricsP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 70509L)
  public static SubLObject write_forward_inference_metrics_data(final SubLObject stream, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = v_properties;
    final SubLObject info_tail = cdestructuring_bind.property_list_member( $kw420$INFO, current );
    SubLObject info = ( NIL != info_tail ) ? conses_high.cadr( info_tail ) : $kw421$ALL;
    final SubLObject threshold_tail = cdestructuring_bind.property_list_member( $kw355$THRESHOLD, current );
    final SubLObject threshold = ( NIL != threshold_tail ) ? conses_high.cadr( threshold_tail ) : NIL;
    final SubLObject format_tail = cdestructuring_bind.property_list_member( $kw422$FORMAT, current );
    final SubLObject format = ( NIL != format_tail ) ? conses_high.cadr( format_tail ) : $kw423$CSV;
    final SubLObject headingsP_tail = cdestructuring_bind.property_list_member( $kw424$HEADINGS_, current );
    final SubLObject headingsP = ( NIL != headingsP_tail ) ? conses_high.cadr( headingsP_tail ) : T;
    final SubLObject columns_tail = cdestructuring_bind.property_list_member( $kw425$COLUMNS, current );
    final SubLObject columns = ( NIL != columns_tail ) ? conses_high.cadr( columns_tail ) : $list426;
    final SubLObject pcase_var = info;
    if( pcase_var.eql( $kw421$ALL ) )
    {
      info = forward_inference_metrics_info( threshold );
    }
    else if( pcase_var.eql( $kw427$SUCCESSFUL ) )
    {
      final SubLObject rules = forward_inference_successful_rules();
      info = forward_inference_metrics_info_for_rules( rules, threshold );
    }
    final SubLObject separator_map = $list428;
    final SubLObject separator = list_utilities.alist_lookup_without_values( separator_map, format, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
    final SubLObject _prev_bind_2 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      reader.$read_default_float_format$.bind( $sym429$DOUBLE_FLOAT, thread );
      print_high.$print_pretty$.bind( NIL, thread );
      if( NIL != headingsP )
      {
        PrintLow.format( stream, $str430$__ );
        SubLObject list_var = NIL;
        SubLObject column = NIL;
        SubLObject index = NIL;
        list_var = columns;
        column = list_var.first();
        for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), column = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
        {
          if( !index.isZero() )
          {
            print_high.princ( separator, stream );
          }
          print_high.princ( Strings.string_capitalize( string_utilities.string_substitute( $str431$_, $str432$_, Symbols.symbol_name( column ), UNPROVIDED ), UNPROVIDED, UNPROVIDED ), stream );
        }
        streams_high.terpri( stream );
      }
      SubLObject cdolist_list_var = info;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject current_$21;
        final SubLObject datum_$20 = current_$21 = item;
        final SubLObject rule_tail = cdestructuring_bind.property_list_member( $kw382$RULE, current_$21 );
        final SubLObject rule = ( NIL != rule_tail ) ? conses_high.cadr( rule_tail ) : NIL;
        final SubLObject time_tail = cdestructuring_bind.property_list_member( $kw383$TIME, current_$21 );
        final SubLObject time = ( NIL != time_tail ) ? conses_high.cadr( time_tail ) : NIL;
        final SubLObject trigger_gafs_tail = cdestructuring_bind.property_list_member( $kw386$TRIGGER_GAFS, current_$21 );
        final SubLObject trigger_gafs = ( NIL != trigger_gafs_tail ) ? conses_high.cadr( trigger_gafs_tail ) : NIL;
        thread.resetMultipleValues();
        final SubLObject trigger_count = forward_inference_metrics_rule_success_info( rule, time, trigger_gafs );
        final SubLObject success_count = thread.secondMultipleValue();
        final SubLObject success_time = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject list_var2 = NIL;
        SubLObject column2 = NIL;
        SubLObject index2 = NIL;
        list_var2 = columns;
        column2 = list_var2.first();
        for( index2 = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest(), column2 = list_var2.first(), index2 = Numbers.add( ONE_INTEGER, index2 ) )
        {
          if( !index2.isZero() )
          {
            print_high.princ( separator, stream );
          }
          final SubLObject pcase_var2 = column2;
          if( pcase_var2.eql( $kw433$TRIGGER_COUNT ) )
          {
            print_high.princ( trigger_count, stream );
          }
          else if( pcase_var2.eql( $kw434$SUCCESS_COUNT ) )
          {
            print_high.princ( success_count, stream );
          }
          else if( pcase_var2.eql( $kw383$TIME ) )
          {
            print_high.princ( number_utilities.four_significant_digits( time ), stream );
          }
          else if( pcase_var2.eql( $kw435$SUCCESS_TIME ) )
          {
            print_high.princ( number_utilities.four_significant_digits( success_time ), stream );
          }
          else if( pcase_var2.eql( $kw436$ID ) )
          {
            print_high.princ( assertion_handles.assertion_id( rule ), stream );
          }
          else if( pcase_var2.eql( $kw437$CHLID ) )
          {
            print_high.princ( kb_utilities.compact_hl_external_id_string( rule ), stream );
          }
          else if( pcase_var2.eql( $kw438$EL_IST_FORMULA ) )
          {
            print_high.princ( uncanonicalizer.assertion_el_ist_formula( rule ), stream );
          }
        }
        streams_high.terpri( stream );
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_2, thread );
      reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 72480L)
  public static SubLObject forward_inference_metrics_rule_success_info(final SubLObject rule, final SubLObject time, final SubLObject trigger_gafs)
  {
    final SubLObject trigger_count = Sequences.length( trigger_gafs );
    SubLObject success_count = ZERO_INTEGER;
    SubLObject cdolist_list_var = trigger_gafs;
    SubLObject trigger_gaf = NIL;
    trigger_gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.valid_assertionP( trigger_gaf, UNPROVIDED ) && NIL != assertion_utilities.assertion_has_dependent_with_supportP_kb_hl_support_aware_version( trigger_gaf, rule ) )
      {
        success_count = Numbers.add( success_count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      trigger_gaf = cdolist_list_var.first();
    }
    final SubLObject success_trigger_ratio = number_utilities.safe_X( success_count, trigger_count );
    final SubLObject estimated_success_time = Numbers.multiply( success_trigger_ratio, time );
    return Values.values( trigger_count, success_count, estimated_success_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 73048L)
  public static SubLObject reset_inference_metrics()
  {
    $problem_store_historical_count$.setGlobalValue( ZERO_INTEGER );
    $forward_problem_store_historical_count$.setGlobalValue( ZERO_INTEGER );
    $maximum_problem_store_historical_problem_count$.setGlobalValue( ZERO_INTEGER );
    $maximum_forward_problem_store_historical_problem_count$.setGlobalValue( ZERO_INTEGER );
    $problem_historical_count$.setGlobalValue( ZERO_INTEGER );
    $good_problem_historical_count$.setGlobalValue( ZERO_INTEGER );
    $no_good_problem_historical_count$.setGlobalValue( ZERO_INTEGER );
    $forward_problem_historical_count$.setGlobalValue( ZERO_INTEGER );
    $single_literal_problem_historical_count$.setGlobalValue( ZERO_INTEGER );
    $problem_link_historical_count$.setGlobalValue( ZERO_INTEGER );
    $structural_link_historical_count$.setGlobalValue( ZERO_INTEGER );
    $content_link_historical_count$.setGlobalValue( ZERO_INTEGER );
    $removal_link_historical_count$.setGlobalValue( ZERO_INTEGER );
    $transformation_link_historical_count$.setGlobalValue( ZERO_INTEGER );
    $dependent_link_historical_count$.setGlobalValue( ZERO_INTEGER );
    $single_literal_problem_dependent_link_historical_count$.setGlobalValue( ZERO_INTEGER );
    $tactic_historical_count$.setGlobalValue( ZERO_INTEGER );
    $executed_tactic_historical_count$.setGlobalValue( ZERO_INTEGER );
    $discarded_tactic_historical_count$.setGlobalValue( ZERO_INTEGER );
    $sbhl_cache_attempt_historical_count$.setGlobalValue( ZERO_INTEGER );
    $sbhl_cache_success_historical_count$.setGlobalValue( ZERO_INTEGER );
    $sbhl_graph_attempt_historical_count$.setGlobalValue( ZERO_INTEGER );
    $sbhl_graph_success_historical_count$.setGlobalValue( ZERO_INTEGER );
    $sbhl_link_historical_count$.setGlobalValue( ZERO_INTEGER );
    $unification_attempt_historical_count$.setGlobalValue( ZERO_INTEGER );
    $unification_success_historical_count$.setGlobalValue( ZERO_INTEGER );
    $proof_historical_count$.setGlobalValue( ZERO_INTEGER );
    $inference_historical_count$.setGlobalValue( ZERO_INTEGER );
    $successful_inference_historical_count$.setGlobalValue( ZERO_INTEGER );
    $forward_inference_historical_count$.setGlobalValue( ZERO_INTEGER );
    $successful_forward_inference_historical_count$.setGlobalValue( ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 74889L)
  public static SubLObject show_inference_metrics(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
    try
    {
      reader.$read_default_float_format$.bind( $sym429$DOUBLE_FLOAT, thread );
      SubLObject total_count = inference_historical_count();
      streams_high.terpri( stream );
      PrintLow.format( stream, $str439$__Total_inferences_______________, total_count );
      SubLObject forward_count = forward_inference_historical_count();
      PrintLow.format( stream, $str440$___total_forward__data_directed__, forward_count );
      show_inference_metric_percentage( forward_count, total_count, THREE_INTEGER, UNPROVIDED );
      SubLObject success_count = successful_forward_inference_historical_count();
      PrintLow.format( stream, $str441$____successful_forward___________, success_count );
      show_inference_metric_percentage( success_count, total_count, THREE_INTEGER, UNPROVIDED );
      SubLObject backward_count = backward_inference_historical_count();
      PrintLow.format( stream, $str442$___total_backward__query_directed, backward_count );
      show_inference_metric_percentage( backward_count, total_count, THREE_INTEGER, UNPROVIDED );
      success_count = successful_backward_inference_historical_count();
      PrintLow.format( stream, $str443$____successful_backward__________, success_count );
      show_inference_metric_percentage( success_count, total_count, THREE_INTEGER, UNPROVIDED );
      PrintLow.format( stream, $str444$___avg_relevant_problem_count____, number_utilities.significant_digits( average_historical_inference_relevant_problem_count(), FOUR_INTEGER ) );
      total_count = problem_store_historical_count();
      streams_high.terpri( stream );
      PrintLow.format( stream, $str445$__Total_problem_stores___________, total_count );
      forward_count = forward_problem_store_historical_count();
      PrintLow.format( stream, $str446$___total_forward___data_directed_, forward_count );
      show_inference_metric_percentage( forward_count, total_count, TWO_INTEGER, UNPROVIDED );
      backward_count = backward_problem_store_historical_count();
      PrintLow.format( stream, $str442$___total_backward__query_directed, backward_count );
      show_inference_metric_percentage( backward_count, total_count, TWO_INTEGER, UNPROVIDED );
      PrintLow.format( stream, $str447$___max_problem_store_problem_coun, maximum_problem_store_historical_problem_count() );
      PrintLow.format( stream, $str448$___avg_problem_store_problem_coun, number_utilities.significant_digits( average_problem_store_historical_problem_count(), THREE_INTEGER ) );
      PrintLow.format( stream, $str449$___max_forward_problem_store_prob, maximum_forward_problem_store_historical_problem_count() );
      PrintLow.format( stream, $str450$___avg_forward_problem_store_prob, number_utilities.significant_digits( average_forward_problem_store_historical_problem_count(), THREE_INTEGER ) );
      total_count = problem_historical_count();
      streams_high.terpri( stream );
      PrintLow.format( stream, $str451$__Total_problems_____________6___, total_count );
      final SubLObject good_count = good_problem_historical_count();
      PrintLow.format( stream, $str452$___total_good_problems_______6___, good_count );
      show_inference_metric_percentage( good_count, total_count, TWO_INTEGER, UNPROVIDED );
      final SubLObject no_good_count = no_good_problem_historical_count();
      PrintLow.format( stream, $str453$___total_no_good_problems____6___, no_good_count );
      show_inference_metric_percentage( no_good_count, total_count, TWO_INTEGER, UNPROVIDED );
      forward_count = forward_problem_historical_count();
      PrintLow.format( stream, $str454$___total_forward_problems____6___, forward_count );
      show_inference_metric_percentage( forward_count, total_count, TWO_INTEGER, UNPROVIDED );
      PrintLow.format( stream, $str455$___total_problem_reuses______6___, problem_reuses_historical_count() );
      PrintLow.format( stream, $str456$____problem_reuse_ratio______6___, number_utilities.significant_digits( problem_reuse_historical_ratio(), THREE_INTEGER ) );
      total_count = problem_link_historical_count();
      streams_high.terpri( stream );
      PrintLow.format( stream, $str457$__Total_problem_links________6___, total_count );
      final SubLObject structural_count = structural_link_historical_count();
      PrintLow.format( stream, $str458$___total_structural_links____6___, structural_count );
      show_inference_metric_percentage( structural_count, total_count, THREE_INTEGER, UNPROVIDED );
      final SubLObject content_count = content_link_historical_count();
      PrintLow.format( stream, $str459$___total_content_links_______6___, content_count );
      show_inference_metric_percentage( content_count, total_count, THREE_INTEGER, UNPROVIDED );
      final SubLObject removal_count = removal_link_historical_count();
      PrintLow.format( stream, $str460$____removal_links____________6___, removal_count );
      show_inference_metric_percentage( removal_count, total_count, THREE_INTEGER, UNPROVIDED );
      final SubLObject transformation_count = transformation_link_historical_count();
      PrintLow.format( stream, $str461$____transformation_links_____6___, transformation_count );
      show_inference_metric_percentage( transformation_count, total_count, THREE_INTEGER, UNPROVIDED );
      total_count = tactic_historical_count();
      streams_high.terpri( stream );
      PrintLow.format( stream, $str462$__Total_tactics_______6___D, total_count );
      final SubLObject executed_count = executed_tactic_historical_count();
      PrintLow.format( stream, $str463$___total_executed_____6___D, executed_count );
      show_inference_metric_percentage( executed_count, total_count, TWO_INTEGER, UNPROVIDED );
      final SubLObject discarded_count = discarded_tactic_historical_count();
      PrintLow.format( stream, $str464$___total_discarded____6___D, discarded_count );
      show_inference_metric_percentage( discarded_count, total_count, TWO_INTEGER, UNPROVIDED );
      total_count = sbhl_cache_attempt_historical_count();
      streams_high.terpri( stream );
      PrintLow.format( stream, $str465$__Total_SBHL_cache_calls______9__, total_count );
      SubLObject success_count2 = sbhl_cache_success_historical_count();
      PrintLow.format( stream, $str466$___successful_________________9__, success_count2 );
      show_inference_metric_percentage( success_count2, total_count, THREE_INTEGER, UNPROVIDED );
      total_count = sbhl_graph_attempt_historical_count();
      streams_high.terpri( stream );
      PrintLow.format( stream, $str467$__Total_SBHL_graph_walks______9__, total_count );
      success_count2 = sbhl_graph_success_historical_count();
      PrintLow.format( stream, $str466$___successful_________________9__, success_count2 );
      show_inference_metric_percentage( success_count2, total_count, THREE_INTEGER, UNPROVIDED );
      total_count = unification_attempt_historical_count();
      streams_high.terpri( stream );
      PrintLow.format( stream, $str468$__Total_unification_attempts____6, total_count );
      success_count2 = unification_success_historical_count();
      PrintLow.format( stream, $str469$___successful_unifications______6, success_count2 );
      show_inference_metric_percentage( success_count2, total_count, TWO_INTEGER, UNPROVIDED );
      streams_high.terpri( stream );
      PrintLow.format( stream, $str470$__Total_proofs____6___D, proof_historical_count() );
      streams_high.terpri( stream );
    }
    finally
    {
      reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 81791L)
  public static SubLObject show_inference_metric_percentage(final SubLObject numerator, final SubLObject denominator, final SubLObject digits, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( !denominator.isZero() )
    {
      final SubLObject percentage = number_utilities.significant_digits( Numbers.multiply( $int471$100, Numbers.divide( numerator, denominator ) ), digits );
      if( digits.eql( TWO_INTEGER ) )
      {
        PrintLow.format( stream, $str472$___2___D___, percentage );
      }
      else if( digits.eql( THREE_INTEGER ) )
      {
        PrintLow.format( stream, $str473$___3___D___, percentage );
      }
      else
      {
        PrintLow.format( stream, $str474$___D___, percentage );
      }
    }
    return NIL;
  }

  public static SubLObject declare_inference_metrics_file()
  {
    SubLFiles.declareFunction( me, "inference_metric_evaluation_arg1_p", "INFERENCE-METRIC-EVALUATION-ARG1-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_metric_print_function_trampoline", "INFERENCE-METRIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_metric_p", "INFERENCE-METRIC-P", 1, 0, false );
    new $inference_metric_p$UnaryFunction();
    SubLFiles.declareFunction( me, "inf_metric_name", "INF-METRIC-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "inf_metric_evaluation_func", "INF-METRIC-EVALUATION-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "inf_metric_evaluation_arg1", "INF-METRIC-EVALUATION-ARG1", 1, 0, false );
    SubLFiles.declareFunction( me, "inf_metric_cross_productP", "INF-METRIC-CROSS-PRODUCT?", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_metric_name", "_CSETF-INF-METRIC-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_metric_evaluation_func", "_CSETF-INF-METRIC-EVALUATION-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_metric_evaluation_arg1", "_CSETF-INF-METRIC-EVALUATION-ARG1", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_inf_metric_cross_productP", "_CSETF-INF-METRIC-CROSS-PRODUCT?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_inference_metric", "MAKE-INFERENCE-METRIC", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_inference_metric", "VISIT-DEFSTRUCT-INFERENCE-METRIC", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_inference_metric_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-METRIC-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_inference_metric", "PRINT-INFERENCE-METRIC", 3, 0, false );
    SubLFiles.declareFunction( me, "new_inference_metric", "NEW-INFERENCE-METRIC", 4, 0, false );
    SubLFiles.declareFunction( me, "inference_metric_name", "INFERENCE-METRIC-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_metric_evaluation_func", "INFERENCE-METRIC-EVALUATION-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_metric_evaluation_arg1", "INFERENCE-METRIC-EVALUATION-ARG1", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_metric_cross_productP", "INFERENCE-METRIC-CROSS-PRODUCT?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_metric_evaluate", "INFERENCE-METRIC-EVALUATE", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_metric_property_p", "INFERENCE-METRIC-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "declare_inference_metric", "DECLARE-INFERENCE-METRIC", 3, 1, false );
    SubLFiles.declareFunction( me, "inference_metric_lookup", "INFERENCE-METRIC-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_metric_nameP", "INFERENCE-METRIC-NAME?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_metric_names", "INFERENCE-METRIC-NAMES", 0, 0, false );
    SubLFiles.declareFunction( me, "problem_store_historical_count", "PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_problem_store_historical_count", "INCREMENT-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_problem_store_historical_count", "FORWARD-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "backward_problem_store_historical_count", "BACKWARD-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_forward_problem_store_historical_count", "INCREMENT-FORWARD-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "maximum_problem_store_historical_problem_count", "MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "update_maximum_problem_store_historical_problem_count", "UPDATE-MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "average_problem_store_historical_problem_count", "AVERAGE-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "maximum_forward_problem_store_historical_problem_count", "MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "update_maximum_forward_problem_store_historical_problem_count", "UPDATE-MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "average_forward_problem_store_historical_problem_count", "AVERAGE-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_problem_historical_count", "INCREMENT-PROBLEM-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "problem_historical_count", "PROBLEM-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "good_problem_historical_count", "GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_good_problem_historical_count", "INCREMENT-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "decrement_good_problem_historical_count", "DECREMENT-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "no_good_problem_historical_count", "NO-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_no_good_problem_historical_count", "INCREMENT-NO-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_problem_historical_count", "FORWARD-PROBLEM-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "update_forward_problem_historical_count", "UPDATE-FORWARD-PROBLEM-HISTORICAL-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "single_literal_problem_historical_count", "SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "multi_literal_problem_historical_count", "MULTI-LITERAL-PROBLEM-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_single_literal_problem_historical_count", "INCREMENT-SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "problem_link_historical_count", "PROBLEM-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "structural_link_historical_count", "STRUCTURAL-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "content_link_historical_count", "CONTENT-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_link_historical_count", "REMOVAL-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "transformation_link_historical_count", "TRANSFORMATION-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_problem_link_type_historical_counts", "INCREMENT-PROBLEM-LINK-TYPE-HISTORICAL-COUNTS", 1, 0, false );
    SubLFiles.declareFunction( me, "dependent_link_historical_count", "DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_dependent_link_historical_count", "INCREMENT-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "single_literal_problem_dependent_link_historical_count", "SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "multi_literal_problem_dependent_link_historical_count", "MULTI-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_single_literal_problem_dependent_link_historical_count", "INCREMENT-SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "problem_reuses_historical_count", "PROBLEM-REUSES-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "problem_reuse_historical_ratio", "PROBLEM-REUSE-HISTORICAL-RATIO", 0, 0, false );
    SubLFiles.declareFunction( me, "single_literal_problem_reuses_historical_count", "SINGLE-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "single_literal_problem_reuse_historical_ratio", "SINGLE-LITERAL-PROBLEM-REUSE-HISTORICAL-RATIO", 0, 0, false );
    SubLFiles.declareFunction( me, "multi_literal_problem_reuses_historical_count", "MULTI-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "multi_literal_problem_reuse_historical_ratio", "MULTI-LITERAL-PROBLEM-REUSE-HISTORICAL-RATIO", 0, 0, false );
    SubLFiles.declareFunction( me, "tactic_historical_count", "TACTIC-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_tactic_historical_count", "INCREMENT-TACTIC-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "executed_tactic_historical_count", "EXECUTED-TACTIC-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_executed_tactic_historical_count", "INCREMENT-EXECUTED-TACTIC-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "discarded_tactic_historical_count", "DISCARDED-TACTIC-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_discarded_tactic_historical_count", "INCREMENT-DISCARDED-TACTIC-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "unification_attempt_historical_count", "UNIFICATION-ATTEMPT-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_unification_attempt_historical_count", "INCREMENT-UNIFICATION-ATTEMPT-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "unification_success_historical_count", "UNIFICATION-SUCCESS-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_unification_success_historical_count", "INCREMENT-UNIFICATION-SUCCESS-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_cache_attempt_historical_count", "SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_sbhl_cache_attempt_historical_count", "INCREMENT-SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_cache_success_historical_count", "SBHL-CACHE-SUCCESS-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_sbhl_cache_success_historical_count", "INCREMENT-SBHL-CACHE-SUCCESS-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_graph_attempt_historical_count", "SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_sbhl_graph_attempt_historical_count", "INCREMENT-SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_graph_success_historical_count", "SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_sbhl_graph_success_historical_count", "INCREMENT-SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_link_historical_count", "SBHL-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_sbhl_link_historical_count", "INCREMENT-SBHL-LINK-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "proof_historical_count", "PROOF-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_proof_historical_count", "INCREMENT-PROOF-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_historical_count", "INFERENCE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_inference_historical_count", "INCREMENT-INFERENCE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "successful_inference_historical_count", "SUCCESSFUL-INFERENCE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_successful_inference_historical_count", "INCREMENT-SUCCESSFUL-INFERENCE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_historical_count", "FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "backward_inference_historical_count", "BACKWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_forward_inference_historical_count", "INCREMENT-FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "successful_forward_inference_historical_count", "SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "successful_backward_inference_historical_count", "SUCCESSFUL-BACKWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "increment_successful_forward_inference_historical_count", "INCREMENT-SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "average_historical_inference_relevant_problem_count", "AVERAGE-HISTORICAL-INFERENCE-RELEVANT-PROBLEM-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_query_total_time_accumulator_lookup", "SKSI-QUERY-TOTAL-TIME-ACCUMULATOR-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_query_start_times_accumulator_lookup", "SKSI-QUERY-START-TIMES-ACCUMULATOR-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_query_profile_accumulator_lookup", "SPARQL-QUERY-PROFILE-ACCUMULATOR-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_tick_indexed_progress_data_memoized_internal", "INFERENCE-TICK-INDEXED-PROGRESS-DATA-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_tick_indexed_progress_data_memoized", "INFERENCE-TICK-INDEXED-PROGRESS-DATA-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_possibly_update_tick_indexed_progress_data", "INFERENCE-POSSIBLY-UPDATE-TICK-INDEXED-PROGRESS-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_has_tick_indexed_progress_dataP", "INFERENCE-HAS-TICK-INDEXED-PROGRESS-DATA?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_should_gather_tick_indexed_progress_dataP", "INFERENCE-SHOULD-GATHER-TICK-INDEXED-PROGRESS-DATA?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_tick_indexed_progress_data", "INFERENCE-TICK-INDEXED-PROGRESS-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_tick_indexed_progress_data_one_step", "INFERENCE-TICK-INDEXED-PROGRESS-DATA-ONE-STEP", 4, 0, false );
    SubLFiles.declareFunction( me, "inference_tick_count", "INFERENCE-TICK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_hl_module_times", "INFERENCE-HL-MODULE-TIMES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_hl_module_times_memoized_internal", "INFERENCE-HL-MODULE-TIMES-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_hl_module_times_memoized", "INFERENCE-HL-MODULE-TIMES-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_update_hl_module_time", "INFERENCE-UPDATE-HL-MODULE-TIME", 3, 0, false );
    SubLFiles.declareFunction( me, "possibly_update_hl_module_times", "POSSIBLY-UPDATE-HL-MODULE-TIMES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_gathers_hl_module_timesP", "INFERENCE-GATHERS-HL-MODULE-TIMES?", 0, 1, false );
    SubLFiles.declareFunction( me, "any_inference_gathers_hl_module_timesP", "ANY-INFERENCE-GATHERS-HL-MODULE-TIMES?", 0, 1, false );
    SubLFiles.declareFunction( me, "problem_store_rule_binding_value_map", "PROBLEM-STORE-RULE-BINDING-VALUE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "rule_binding_value_map_from_rule_binding_tuples", "RULE-BINDING-VALUE-MAP-FROM-RULE-BINDING-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_genericize_indeterminate_term", "POSSIBLY-GENERICIZE-INDETERMINATE-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_rule_binding_type_map", "PROBLEM-STORE-RULE-BINDING-TYPE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_rule_bindings_tuples", "PROBLEM-STORE-RULE-BINDINGS-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "rule_binding_type_map_from_rule_binding_tuples", "RULE-BINDING-TYPE-MAP-FROM-RULE-BINDING-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "show_rule_binding_type_map", "SHOW-RULE-BINDING-TYPE-MAP", 1, 1, false );
    SubLFiles.declareMacro( me, "gathering_forward_inference_metrics", "GATHERING-FORWARD-INFERENCE-METRICS" );
    SubLFiles.declareMacro( me, "show_forward_inference_metrics_of", "SHOW-FORWARD-INFERENCE-METRICS-OF" );
    SubLFiles.declareMacro( me, "show_new_forward_inference_metrics_of", "SHOW-NEW-FORWARD-INFERENCE-METRICS-OF" );
    SubLFiles.declareFunction( me, "forward_inference_metrics_time_index", "FORWARD-INFERENCE-METRICS-TIME-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_metrics_count_index", "FORWARD-INFERENCE-METRICS-COUNT-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_metrics_inference_index", "FORWARD-INFERENCE-METRICS-INFERENCE-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "finalize_forward_inference_metrics_inference_index", "FINALIZE-FORWARD-INFERENCE-METRICS-INFERENCE-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_metrics_gaf_index", "FORWARD-INFERENCE-METRICS-GAF-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_time_metric_total_time", "FORWARD-INFERENCE-TIME-METRIC-TOTAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_metrics_successful_rule_index", "FORWARD-INFERENCE-METRICS-SUCCESSFUL-RULE-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_forward_inference_metrics", "CLEAR-FORWARD-INFERENCE-METRICS", 0, 0, false );
    SubLFiles.declareFunction( me, "save_forward_inference_metrics", "SAVE-FORWARD-INFERENCE-METRICS", 1, 1, false );
    SubLFiles.declareFunction( me, "load_forward_inference_metrics", "LOAD-FORWARD-INFERENCE-METRICS", 1, 0, false );
    SubLFiles.declareFunction( me, "elapsed_forward_inference_metric_time", "ELAPSED-FORWARD-INFERENCE-METRIC-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "initial_forward_inference_metric_time", "INITIAL-FORWARD-INFERENCE-METRIC-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_get_forward_inference_metric_type_and_metric_list", "CLEAR-GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_forward_inference_metric_type_and_metric_list", "REMOVE-GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_forward_inference_metric_type_and_metric_list_internal", "GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_forward_inference_metric_type_and_metric_list", "GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "increment_forward_inference_metrics", "INCREMENT-FORWARD-INFERENCE-METRICS", 5, 0, false );
    SubLFiles.declareFunction( me, "note_forward_inference_for_rule", "NOTE-FORWARD-INFERENCE-FOR-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "note_forward_inference_successful_rule", "NOTE-FORWARD-INFERENCE-SUCCESSFUL-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_metrics_info", "FORWARD-INFERENCE-METRICS-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "forward_inference_metrics_info_for_rules", "FORWARD-INFERENCE-METRICS-INFO-FOR-RULES", 0, 2, false );
    SubLFiles.declareFunction( me, "forward_inference_time_metric_total_time_from_cdr", "FORWARD-INFERENCE-TIME-METRIC-TOTAL-TIME-FROM-CDR", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_successful_rules", "FORWARD-INFERENCE-SUCCESSFUL-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_unsuccessful_rules", "FORWARD-INFERENCE-UNSUCCESSFUL-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "all_forward_inference_metrics_rules", "ALL-FORWARD-INFERENCE-METRICS-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_triggered_tms_rules", "FORWARD-INFERENCE-TRIGGERED-TMS-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_success_metrics_from_info", "FORWARD-INFERENCE-SUCCESS-METRICS-FROM-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_success_metrics", "FORWARD-INFERENCE-SUCCESS-METRICS", 0, 1, false );
    SubLFiles.declareFunction( me, "forward_inference_metrics_time_totals", "FORWARD-INFERENCE-METRICS-TIME-TOTALS", 0, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_metrics_count_totals", "FORWARD-INFERENCE-METRICS-COUNT-TOTALS", 0, 0, false );
    SubLFiles.declareFunction( me, "rule_forward_inference_metrics_deductions_from_trigger_gafs", "RULE-FORWARD-INFERENCE-METRICS-DEDUCTIONS-FROM-TRIGGER-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "rule_forward_inference_metrics_info", "RULE-FORWARD-INFERENCE-METRICS-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "rule_forward_inference_metrics_info_int", "RULE-FORWARD-INFERENCE-METRICS-INFO-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "global_statistics_from_forward_inference_metrics_info", "GLOBAL-STATISTICS-FROM-FORWARD-INFERENCE-METRICS-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "show_forward_inference_metrics", "SHOW-FORWARD-INFERENCE-METRICS", 0, 2, false );
    SubLFiles.declareFunction( me, "show_forward_inference_metrics_of_asserting", "SHOW-FORWARD-INFERENCE-METRICS-OF-ASSERTING", 2, 2, false );
    SubLFiles.declareFunction( me, "write_forward_inference_metrics_data", "WRITE-FORWARD-INFERENCE-METRICS-DATA", 1, 1, false );
    SubLFiles.declareFunction( me, "forward_inference_metrics_rule_success_info", "FORWARD-INFERENCE-METRICS-RULE-SUCCESS-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "reset_inference_metrics", "RESET-INFERENCE-METRICS", 0, 0, false );
    SubLFiles.declareFunction( me, "show_inference_metrics", "SHOW-INFERENCE-METRICS", 0, 1, false );
    SubLFiles.declareFunction( me, "show_inference_metric_percentage", "SHOW-INFERENCE-METRIC-PERCENTAGE", 3, 1, false );
    return NIL;
  }

  public static SubLObject init_inference_metrics_file()
  {
    $dtp_inference_metric$ = SubLFiles.defconstant( "*DTP-INFERENCE-METRIC*", $sym1$INFERENCE_METRIC );
    $inference_metrics_store$ = SubLFiles.deflexical( "*INFERENCE-METRICS-STORE*", maybeDefault( $sym38$_INFERENCE_METRICS_STORE_, $inference_metrics_store$, () -> ( dictionary.new_dictionary( Symbols.symbol_function(
        EQ ), UNPROVIDED ) ) ) );
    $inference_metric_properties$ = SubLFiles.deflexical( "*INFERENCE-METRIC-PROPERTIES*", $list39 );
    $problem_store_historical_count$ = SubLFiles.deflexical( "*PROBLEM-STORE-HISTORICAL-COUNT*", ( maybeDefault( $sym284$_PROBLEM_STORE_HISTORICAL_COUNT_, $problem_store_historical_count$, ZERO_INTEGER ) ) );
    $forward_problem_store_historical_count$ = SubLFiles.deflexical( "*FORWARD-PROBLEM-STORE-HISTORICAL-COUNT*", ( maybeDefault( $sym285$_FORWARD_PROBLEM_STORE_HISTORICAL_COUNT_, $forward_problem_store_historical_count$,
        ZERO_INTEGER ) ) );
    $maximum_problem_store_historical_problem_count$ = SubLFiles.deflexical( "*MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*", ( maybeDefault( $sym286$_MAXIMUM_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_,
        $maximum_problem_store_historical_problem_count$, ZERO_INTEGER ) ) );
    $maximum_forward_problem_store_historical_problem_count$ = SubLFiles.deflexical( "*MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*", ( maybeDefault(
        $sym287$_MAXIMUM_FORWARD_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_, $maximum_forward_problem_store_historical_problem_count$, ZERO_INTEGER ) ) );
    $expensive_forward_problem_store_threshold$ = SubLFiles.defvar( "*EXPENSIVE-FORWARD-PROBLEM-STORE-THRESHOLD*", $int288$1000 );
    $problem_historical_count$ = SubLFiles.deflexical( "*PROBLEM-HISTORICAL-COUNT*", ( maybeDefault( $sym290$_PROBLEM_HISTORICAL_COUNT_, $problem_historical_count$, ZERO_INTEGER ) ) );
    $good_problem_historical_count$ = SubLFiles.deflexical( "*GOOD-PROBLEM-HISTORICAL-COUNT*", ( maybeDefault( $sym291$_GOOD_PROBLEM_HISTORICAL_COUNT_, $good_problem_historical_count$, ZERO_INTEGER ) ) );
    $no_good_problem_historical_count$ = SubLFiles.deflexical( "*NO-GOOD-PROBLEM-HISTORICAL-COUNT*", ( maybeDefault( $sym292$_NO_GOOD_PROBLEM_HISTORICAL_COUNT_, $no_good_problem_historical_count$, ZERO_INTEGER ) ) );
    $forward_problem_historical_count$ = SubLFiles.deflexical( "*FORWARD-PROBLEM-HISTORICAL-COUNT*", ( maybeDefault( $sym293$_FORWARD_PROBLEM_HISTORICAL_COUNT_, $forward_problem_historical_count$, ZERO_INTEGER ) ) );
    $single_literal_problem_historical_count$ = SubLFiles.deflexical( "*SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT*", ( maybeDefault( $sym294$_SINGLE_LITERAL_PROBLEM_HISTORICAL_COUNT_,
        $single_literal_problem_historical_count$, ZERO_INTEGER ) ) );
    $problem_link_historical_count$ = SubLFiles.deflexical( "*PROBLEM-LINK-HISTORICAL-COUNT*", ( maybeDefault( $sym295$_PROBLEM_LINK_HISTORICAL_COUNT_, $problem_link_historical_count$, ZERO_INTEGER ) ) );
    $structural_link_historical_count$ = SubLFiles.deflexical( "*STRUCTURAL-LINK-HISTORICAL-COUNT*", ( maybeDefault( $sym296$_STRUCTURAL_LINK_HISTORICAL_COUNT_, $structural_link_historical_count$, ZERO_INTEGER ) ) );
    $content_link_historical_count$ = SubLFiles.deflexical( "*CONTENT-LINK-HISTORICAL-COUNT*", ( maybeDefault( $sym297$_CONTENT_LINK_HISTORICAL_COUNT_, $content_link_historical_count$, ZERO_INTEGER ) ) );
    $removal_link_historical_count$ = SubLFiles.deflexical( "*REMOVAL-LINK-HISTORICAL-COUNT*", ( maybeDefault( $sym298$_REMOVAL_LINK_HISTORICAL_COUNT_, $removal_link_historical_count$, ZERO_INTEGER ) ) );
    $transformation_link_historical_count$ = SubLFiles.deflexical( "*TRANSFORMATION-LINK-HISTORICAL-COUNT*", ( maybeDefault( $sym299$_TRANSFORMATION_LINK_HISTORICAL_COUNT_, $transformation_link_historical_count$,
        ZERO_INTEGER ) ) );
    $dependent_link_historical_count$ = SubLFiles.deflexical( "*DEPENDENT-LINK-HISTORICAL-COUNT*", ( maybeDefault( $sym303$_DEPENDENT_LINK_HISTORICAL_COUNT_, $dependent_link_historical_count$, ZERO_INTEGER ) ) );
    $single_literal_problem_dependent_link_historical_count$ = SubLFiles.deflexical( "*SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT*", ( maybeDefault(
        $sym304$_SINGLE_LITERAL_PROBLEM_DEPENDENT_LINK_HISTORICAL_COUNT_, $single_literal_problem_dependent_link_historical_count$, ZERO_INTEGER ) ) );
    $tactic_historical_count$ = SubLFiles.deflexical( "*TACTIC-HISTORICAL-COUNT*", ( maybeDefault( $sym305$_TACTIC_HISTORICAL_COUNT_, $tactic_historical_count$, ZERO_INTEGER ) ) );
    $executed_tactic_historical_count$ = SubLFiles.deflexical( "*EXECUTED-TACTIC-HISTORICAL-COUNT*", ( maybeDefault( $sym306$_EXECUTED_TACTIC_HISTORICAL_COUNT_, $executed_tactic_historical_count$, ZERO_INTEGER ) ) );
    $discarded_tactic_historical_count$ = SubLFiles.deflexical( "*DISCARDED-TACTIC-HISTORICAL-COUNT*", ( maybeDefault( $sym307$_DISCARDED_TACTIC_HISTORICAL_COUNT_, $discarded_tactic_historical_count$, ZERO_INTEGER ) ) );
    $unification_attempt_historical_count$ = SubLFiles.deflexical( "*UNIFICATION-ATTEMPT-HISTORICAL-COUNT*", ( maybeDefault( $sym308$_UNIFICATION_ATTEMPT_HISTORICAL_COUNT_, $unification_attempt_historical_count$,
        ZERO_INTEGER ) ) );
    $unification_success_historical_count$ = SubLFiles.deflexical( "*UNIFICATION-SUCCESS-HISTORICAL-COUNT*", ( maybeDefault( $sym309$_UNIFICATION_SUCCESS_HISTORICAL_COUNT_, $unification_success_historical_count$,
        ZERO_INTEGER ) ) );
    $sbhl_cache_attempt_historical_count$ = SubLFiles.deflexical( "*SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT*", ( maybeDefault( $sym310$_SBHL_CACHE_ATTEMPT_HISTORICAL_COUNT_, $sbhl_cache_attempt_historical_count$,
        ZERO_INTEGER ) ) );
    $sbhl_cache_success_historical_count$ = SubLFiles.deflexical( "*SBHL-CACHE-SUCCESS-HISTORICAL-COUNT*", ( maybeDefault( $sym311$_SBHL_CACHE_SUCCESS_HISTORICAL_COUNT_, $sbhl_cache_success_historical_count$,
        ZERO_INTEGER ) ) );
    $sbhl_graph_attempt_historical_count$ = SubLFiles.deflexical( "*SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT*", ( maybeDefault( $sym312$_SBHL_GRAPH_ATTEMPT_HISTORICAL_COUNT_, $sbhl_graph_attempt_historical_count$,
        ZERO_INTEGER ) ) );
    $sbhl_graph_success_historical_count$ = SubLFiles.deflexical( "*SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT*", ( maybeDefault( $sym313$_SBHL_GRAPH_SUCCESS_HISTORICAL_COUNT_, $sbhl_graph_success_historical_count$,
        ZERO_INTEGER ) ) );
    $sbhl_link_historical_count$ = SubLFiles.deflexical( "*SBHL-LINK-HISTORICAL-COUNT*", ( maybeDefault( $sym314$_SBHL_LINK_HISTORICAL_COUNT_, $sbhl_link_historical_count$, ZERO_INTEGER ) ) );
    $proof_historical_count$ = SubLFiles.deflexical( "*PROOF-HISTORICAL-COUNT*", ( maybeDefault( $sym315$_PROOF_HISTORICAL_COUNT_, $proof_historical_count$, ZERO_INTEGER ) ) );
    $inference_historical_count$ = SubLFiles.deflexical( "*INFERENCE-HISTORICAL-COUNT*", ( maybeDefault( $sym316$_INFERENCE_HISTORICAL_COUNT_, $inference_historical_count$, ZERO_INTEGER ) ) );
    $successful_inference_historical_count$ = SubLFiles.deflexical( "*SUCCESSFUL-INFERENCE-HISTORICAL-COUNT*", ( maybeDefault( $sym317$_SUCCESSFUL_INFERENCE_HISTORICAL_COUNT_, $successful_inference_historical_count$,
        ZERO_INTEGER ) ) );
    $forward_inference_historical_count$ = SubLFiles.deflexical( "*FORWARD-INFERENCE-HISTORICAL-COUNT*", ( maybeDefault( $sym318$_FORWARD_INFERENCE_HISTORICAL_COUNT_, $forward_inference_historical_count$,
        ZERO_INTEGER ) ) );
    $successful_forward_inference_historical_count$ = SubLFiles.deflexical( "*SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT*", ( maybeDefault( $sym319$_SUCCESSFUL_FORWARD_INFERENCE_HISTORICAL_COUNT_,
        $successful_forward_inference_historical_count$, ZERO_INTEGER ) ) );
    $force_inference_tick_indexed_progress_data_collectionP$ = SubLFiles.defparameter( "*FORCE-INFERENCE-TICK-INDEXED-PROGRESS-DATA-COLLECTION?*", NIL );
    $force_inference_hl_module_times_data_collectionP$ = SubLFiles.defparameter( "*FORCE-INFERENCE-HL-MODULE-TIMES-DATA-COLLECTION?*", NIL );
    $gathering_forward_inference_metricsP$ = SubLFiles.defvar( "*GATHERING-FORWARD-INFERENCE-METRICS?*", NIL );
    $forward_inference_last_metric_time$ = SubLFiles.defparameter( "*FORWARD-INFERENCE-LAST-METRIC-TIME*", NIL );
    $forward_inference_metrics_time_index$ = SubLFiles.deflexical( "*FORWARD-INFERENCE-METRICS-TIME-INDEX*", maybeDefault( $sym361$_FORWARD_INFERENCE_METRICS_TIME_INDEX_, $forward_inference_metrics_time_index$,
        () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $forward_inference_metrics_count_index$ = SubLFiles.deflexical( "*FORWARD-INFERENCE-METRICS-COUNT-INDEX*", maybeDefault( $sym362$_FORWARD_INFERENCE_METRICS_COUNT_INDEX_, $forward_inference_metrics_count_index$,
        () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $forward_inference_metrics_inference_index$ = SubLFiles.deflexical( "*FORWARD-INFERENCE-METRICS-INFERENCE-INDEX*", maybeDefault( $sym363$_FORWARD_INFERENCE_METRICS_INFERENCE_INDEX_,
        $forward_inference_metrics_inference_index$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $forward_inference_metrics_gaf_index$ = SubLFiles.deflexical( "*FORWARD-INFERENCE-METRICS-GAF-INDEX*", maybeDefault( $sym365$_FORWARD_INFERENCE_METRICS_GAF_INDEX_, $forward_inference_metrics_gaf_index$,
        () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $forward_inference_metrics_successful_rule_index$ = SubLFiles.deflexical( "*FORWARD-INFERENCE-METRICS-SUCCESSFUL-RULE-INDEX*", maybeDefault( $sym366$_FORWARD_INFERENCE_METRICS_SUCCESSFUL_RULE_INDEX_,
        $forward_inference_metrics_successful_rule_index$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $get_forward_inference_metric_type_and_metric_list_caching_state$ = SubLFiles.deflexical( "*GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST-CACHING-STATE*", NIL );
    $forward_inference_metrics_lock$ = SubLFiles.deflexical( "*FORWARD-INFERENCE-METRICS-LOCK*", Locks.make_lock( $str374$Forward_Inference_Metrics_Lock ) );
    return NIL;
  }

  public static SubLObject setup_inference_metrics_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference_metric$.getGlobalValue(), Symbols.symbol_function( $sym8$INFERENCE_METRIC_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$INF_METRIC_NAME, $sym11$_CSETF_INF_METRIC_NAME );
    Structures.def_csetf( $sym12$INF_METRIC_EVALUATION_FUNC, $sym13$_CSETF_INF_METRIC_EVALUATION_FUNC );
    Structures.def_csetf( $sym14$INF_METRIC_EVALUATION_ARG1, $sym15$_CSETF_INF_METRIC_EVALUATION_ARG1 );
    Structures.def_csetf( $sym16$INF_METRIC_CROSS_PRODUCT_, $sym17$_CSETF_INF_METRIC_CROSS_PRODUCT_ );
    Equality.identity( $sym1$INFERENCE_METRIC );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_inference_metric$.getGlobalValue(), Symbols.symbol_function(
        $sym27$VISIT_DEFSTRUCT_OBJECT_INFERENCE_METRIC_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym7$PRINT_INFERENCE_METRIC );
    subl_macro_promotions.declare_defglobal( $sym38$_INFERENCE_METRICS_STORE_ );
    declare_inference_metric( $kw40$ANSWER_COUNT, $sym41$INFERENCE_ANSWER_COUNT, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw42$ANSWER_COUNT_AT_30_SECONDS, $sym43$INFERENCE_ANSWER_COUNT_AT_30_SECONDS, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw44$ANSWER_COUNT_AT_60_SECONDS, $sym45$INFERENCE_ANSWER_COUNT_AT_60_SECONDS, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw46$TIME_TO_FIRST_ANSWER, $sym47$INFERENCE_FIRST_ANSWER_ELAPSED_TIME, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw48$TIME_TO_LAST_ANSWER, $sym49$INFERENCE_LAST_ANSWER_ELAPSED_TIME, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw50$HYPOTHESIZATION_TIME, $sym51$INFERENCE_HYPOTHESIZATION_TIME, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw52$TOTAL_TIME, $sym53$INFERENCE_CUMULATIVE_TIME, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw54$TIME_PER_ANSWER, $sym55$INFERENCE_TIME_PER_ANSWER, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw56$STEPS_TO_FIRST_ANSWER, $sym57$INFERENCE_FIRST_ANSWER_STEP_COUNT, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw58$STEPS_TO_LAST_ANSWER, $sym59$INFERENCE_LAST_ANSWER_STEP_COUNT, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw60$TOTAL_STEPS, $sym61$INFERENCE_CUMULATIVE_STEP_COUNT, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw62$STEPS_PER_ANSWER, $sym63$INFERENCE_STEPS_PER_ANSWER, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw64$WASTED_TIME_AFTER_LAST_ANSWER, $sym65$INFERENCE_WASTED_TIME_AFTER_LAST_ANSWER, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw66$LATENCY_IMPROVEMENT_FROM_ITERATIVITY, $sym67$INFERENCE_LATENCY_IMPROVEMENT_FROM_ITERATIVITY, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw68$PROBLEM_COUNT, $sym69$PROBLEM_STORE_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw70$PROBLEM_STORE_PROBLEM_COUNT, $sym69$PROBLEM_STORE_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw71$PROOF_COUNT, $sym72$PROBLEM_STORE_PROOF_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw73$PROBLEM_STORE_PROOF_COUNT, $sym72$PROBLEM_STORE_PROOF_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw74$LINK_COUNT, $sym75$PROBLEM_STORE_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw76$TACTIC_COUNT, $sym77$PROBLEM_STORE_TACTIC_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw78$POSSIBLE_TACTIC_COUNT, $sym79$PROBLEM_STORE_POSSIBLE_TACTIC_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw80$EXECUTED_TACTIC_COUNT, $sym81$PROBLEM_STORE_EXECUTED_TACTIC_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw82$TACTIC_EXECUTION_COUNT, $sym83$PROBLEM_STORE_TACTIC_EXECUTION_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw84$DISCARDED_TACTIC_COUNT, $sym85$PROBLEM_STORE_DISCARDED_TACTIC_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw86$CONTENT_LINK_COUNT, $sym87$PROBLEM_STORE_CONTENT_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw88$REMOVAL_LINK_COUNT, $sym89$PROBLEM_STORE_REMOVAL_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw90$REWRITE_LINK_COUNT, $sym91$PROBLEM_STORE_REWRITE_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw92$TRANSFORMATION_LINK_COUNT, $sym93$PROBLEM_STORE_TRANSFORMATION_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw94$STRUCTURAL_LINK_COUNT, $sym95$PROBLEM_STORE_STRUCTURAL_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw96$JOIN_ORDERED_LINK_COUNT, $sym97$PROBLEM_STORE_JOIN_ORDERED_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw98$JOIN_LINK_COUNT, $sym99$PROBLEM_STORE_JOIN_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw100$SPLIT_LINK_COUNT, $sym101$PROBLEM_STORE_SPLIT_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw102$RESTRICTION_LINK_COUNT, $sym103$PROBLEM_STORE_RESTRICTION_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw104$RESIDUAL_TRANSFORMATION_LINK_COUNT, $sym105$PROBLEM_STORE_RESIDUAL_TRANSFORMATION_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw106$UNION_LINK_COUNT, $sym107$PROBLEM_STORE_UNION_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw108$GOOD_PROBLEM_COUNT, $sym109$PROBLEM_STORE_GOOD_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw110$NEUTRAL_PROBLEM_COUNT, $sym111$PROBLEM_STORE_NEUTRAL_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw112$NO_GOOD_PROBLEM_COUNT, $sym113$PROBLEM_STORE_NO_GOOD_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw114$SINGLE_LITERAL_PROBLEM_COUNT, $sym115$PROBLEM_STORE_SINGLE_LITERAL_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw116$CONJUNCTIVE_PROBLEM_COUNT, $sym117$PROBLEM_STORE_CONJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw118$JOIN_PROBLEM_COUNT, $sym119$PROBLEM_STORE_JOIN_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw120$SPLIT_PROBLEM_COUNT, $sym121$PROBLEM_STORE_SPLIT_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw122$DISJUNCTIVE_PROBLEM_COUNT, $sym123$PROBLEM_STORE_DISJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw124$UNEXAMINED_PROBLEM_COUNT, $sym125$PROBLEM_STORE_UNEXAMINED_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw126$EXAMINED_PROBLEM_COUNT, $sym127$PROBLEM_STORE_EXAMINED_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw128$POSSIBLE_PROBLEM_COUNT, $sym129$PROBLEM_STORE_POSSIBLE_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw130$PENDING_PROBLEM_COUNT, $sym131$PROBLEM_STORE_PENDING_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw132$FINISHED_PROBLEM_COUNT, $sym133$PROBLEM_STORE_FINISHED_PROBLEM_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw134$UNMANIFESTED_NON_FOCAL_COUNT, $sym135$PROBLEM_STORE_UNMANIFESTED_NON_FOCAL_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw136$TRANSFORMATION_RULE_BINDINGS_TO_CLOSED, $sym137$PROBLEM_STORE_TRANSFORMATION_RULE_BINDINGS_TO_CLOSED, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw138$PROBLEM_QUERIES, $sym139$PROBLEM_STORE_ALL_PROBLEM_QUERIES, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw140$ANSWER_TIMES, $sym141$INFERENCE_ANSWER_TIMES, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw142$ANSWER_STEP_COUNTS, $sym143$INFERENCE_ANSWER_STEP_COUNTS, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw144$PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, $sym145$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw146$ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT, $sym147$INFERENCE_TRANSFORMATION_FANOUT_ESTIMATE, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw148$TOP_LEVEL_REMOVAL_FANOUT, $sym149$INFERENCE_TOP_LEVEL_REMOVAL_FANOUT, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw150$NEW_ROOT_INITIAL_REMOVAL_FANOUTS, $sym151$INFERENCE_NEW_ROOT_INITIAL_REMOVAL_FANOUTS, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw152$PROOF_QUERY_PROPERTIES, $sym153$INFERENCE_COMPUTE_PROOF_QUERY_PROPERTIES, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw154$ANSWER_PROOF_SPECS, $sym155$INFERENCE_ALL_ANSWER_PROOF_SPECS, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw156$INFERENCE_PROOF_SPEC, $sym157$INFERENCE_PROOF_SPEC, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw158$EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES, $sym159$PROBLEM_STORE_EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES, $kw35$STORE, UNPROVIDED );
    declare_inference_metric( $kw160$NEW_ROOT_METRICS, $sym161$INFERENCE_NEW_ROOT_METRICS, $kw36$INFERENCE, UNPROVIDED );
    declare_inference_metric( $kw162$UNEXAMINED_GOOD_PROBLEM_COUNT, $sym163$PROBLEM_STORE_UNEXAMINED_GOOD_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw164$EXAMINED_GOOD_PROBLEM_COUNT, $sym165$PROBLEM_STORE_EXAMINED_GOOD_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw166$POSSIBLE_GOOD_PROBLEM_COUNT, $sym167$PROBLEM_STORE_POSSIBLE_GOOD_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw168$PENDING_GOOD_PROBLEM_COUNT, $sym169$PROBLEM_STORE_PENDING_GOOD_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw170$FINISHED_GOOD_PROBLEM_COUNT, $sym171$PROBLEM_STORE_FINISHED_GOOD_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw172$UNEXAMINED_NEUTRAL_PROBLEM_COUNT, $sym173$PROBLEM_STORE_UNEXAMINED_NEUTRAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw174$EXAMINED_NEUTRAL_PROBLEM_COUNT, $sym175$PROBLEM_STORE_EXAMINED_NEUTRAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw176$POSSIBLE_NEUTRAL_PROBLEM_COUNT, $sym177$PROBLEM_STORE_POSSIBLE_NEUTRAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw178$PENDING_NEUTRAL_PROBLEM_COUNT, $sym179$PROBLEM_STORE_PENDING_NEUTRAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw180$FINISHED_NEUTRAL_PROBLEM_COUNT, $sym181$PROBLEM_STORE_FINISHED_NEUTRAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw182$UNEXAMINED_NO_GOOD_PROBLEM_COUNT, $sym183$PROBLEM_STORE_UNEXAMINED_NO_GOOD_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw184$EXAMINED_NO_GOOD_PROBLEM_COUNT, $sym185$PROBLEM_STORE_EXAMINED_NO_GOOD_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw186$POSSIBLE_NO_GOOD_PROBLEM_COUNT, $sym187$PROBLEM_STORE_POSSIBLE_NO_GOOD_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw188$PENDING_NO_GOOD_PROBLEM_COUNT, $sym189$PROBLEM_STORE_PENDING_NO_GOOD_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw190$FINISHED_NO_GOOD_PROBLEM_COUNT, $sym191$PROBLEM_STORE_FINISHED_NO_GOOD_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw192$GOOD_SINGLE_LITERAL_PROBLEM_COUNT, $sym193$PROBLEM_STORE_GOOD_SINGLE_LITERAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw194$GOOD_CONJUNCTIVE_PROBLEM_COUNT, $sym195$PROBLEM_STORE_GOOD_CONJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw196$GOOD_JOIN_PROBLEM_COUNT, $sym197$PROBLEM_STORE_GOOD_JOIN_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw198$GOOD_SPLIT_PROBLEM_COUNT, $sym199$PROBLEM_STORE_GOOD_SPLIT_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw200$GOOD_DISJUNCTIVE_PROBLEM_COUNT, $sym201$PROBLEM_STORE_GOOD_DISJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw202$NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT, $sym203$PROBLEM_STORE_NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw204$NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT, $sym205$PROBLEM_STORE_NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw206$NEUTRAL_JOIN_PROBLEM_COUNT, $sym207$PROBLEM_STORE_NEUTRAL_JOIN_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw208$NEUTRAL_SPLIT_PROBLEM_COUNT, $sym209$PROBLEM_STORE_NEUTRAL_SPLIT_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw210$NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT, $sym211$PROBLEM_STORE_NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw212$NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT, $sym213$PROBLEM_STORE_NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw214$NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT, $sym215$PROBLEM_STORE_NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw216$NO_GOOD_JOIN_PROBLEM_COUNT, $sym217$PROBLEM_STORE_NO_GOOD_JOIN_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw218$NO_GOOD_SPLIT_PROBLEM_COUNT, $sym219$PROBLEM_STORE_NO_GOOD_SPLIT_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw220$NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT, $sym221$PROBLEM_STORE_NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw222$UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, $sym223$PROBLEM_STORE_UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw224$UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT, $sym225$PROBLEM_STORE_UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw226$UNEXAMINED_JOIN_PROBLEM_COUNT, $sym227$PROBLEM_STORE_UNEXAMINED_JOIN_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw228$UNEXAMINED_SPLIT_PROBLEM_COUNT, $sym229$PROBLEM_STORE_UNEXAMINED_SPLIT_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw230$UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT, $sym231$PROBLEM_STORE_UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw232$EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, $sym233$PROBLEM_STORE_EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw234$EXAMINED_CONJUNCTIVE_PROBLEM_COUNT, $sym235$PROBLEM_STORE_EXAMINED_CONJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw236$EXAMINED_JOIN_PROBLEM_COUNT, $sym237$PROBLEM_STORE_EXAMINED_JOIN_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw238$EXAMINED_SPLIT_PROBLEM_COUNT, $sym239$PROBLEM_STORE_EXAMINED_SPLIT_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw240$EXAMINED_DISJUNCTIVE_PROBLEM_COUNT, $sym241$PROBLEM_STORE_EXAMINED_DISJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw242$POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT, $sym243$PROBLEM_STORE_POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw244$POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT, $sym245$PROBLEM_STORE_POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw246$POSSIBLE_JOIN_PROBLEM_COUNT, $sym247$PROBLEM_STORE_POSSIBLE_JOIN_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw248$POSSIBLE_SPLIT_PROBLEM_COUNT, $sym249$PROBLEM_STORE_POSSIBLE_SPLIT_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw250$POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT, $sym251$PROBLEM_STORE_POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw252$PENDING_SINGLE_LITERAL_PROBLEM_COUNT, $sym253$PROBLEM_STORE_PENDING_SINGLE_LITERAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw254$PENDING_CONJUNCTIVE_PROBLEM_COUNT, $sym255$PROBLEM_STORE_PENDING_CONJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw256$PENDING_JOIN_PROBLEM_COUNT, $sym257$PROBLEM_STORE_PENDING_JOIN_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw258$PENDING_SPLIT_PROBLEM_COUNT, $sym259$PROBLEM_STORE_PENDING_SPLIT_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw260$PENDING_DISJUNCTIVE_PROBLEM_COUNT, $sym261$PROBLEM_STORE_PENDING_DISJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw262$FINISHED_SINGLE_LITERAL_PROBLEM_COUNT, $sym263$PROBLEM_STORE_FINISHED_SINGLE_LITERAL_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw264$FINISHED_CONJUNCTIVE_PROBLEM_COUNT, $sym265$PROBLEM_STORE_FINISHED_CONJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw266$FINISHED_JOIN_PROBLEM_COUNT, $sym267$PROBLEM_STORE_FINISHED_JOIN_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw268$FINISHED_SPLIT_PROBLEM_COUNT, $sym269$PROBLEM_STORE_FINISHED_SPLIT_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw270$FINISHED_DISJUNCTIVE_PROBLEM_COUNT, $sym271$PROBLEM_STORE_FINISHED_DISJUNCTIVE_PROBLEM_COUNT, $kw35$STORE, T );
    declare_inference_metric( $kw272$SKSI_QUERY_TOTAL_TIME, $sym273$SKSI_QUERY_TOTAL_TIME_ACCUMULATOR_LOOKUP, $kw36$INFERENCE, NIL );
    declare_inference_metric( $kw274$SKSI_QUERY_START_TIMES, $sym275$SKSI_QUERY_START_TIMES_ACCUMULATOR_LOOKUP, $kw36$INFERENCE, NIL );
    declare_inference_metric( $kw276$SPARQL_QUERY_PROFILE, $sym277$SPARQL_QUERY_PROFILE_ACCUMULATOR_LOOKUP, $kw36$INFERENCE, NIL );
    declare_inference_metric( $kw278$TICK_INDEXED_PROGRESS_DATA, $sym279$INFERENCE_TICK_INDEXED_PROGRESS_DATA, $kw36$INFERENCE, NIL );
    declare_inference_metric( $kw280$INFERENCE_HL_MODULE_TIMES, $sym281$INFERENCE_HL_MODULE_TIMES, $kw36$INFERENCE, NIL );
    declare_inference_metric( $kw282$RULE_BINDING_VALUE_MAP, $sym283$PROBLEM_STORE_RULE_BINDING_VALUE_MAP, $kw35$STORE, NIL );
    subl_macro_promotions.declare_defglobal( $sym284$_PROBLEM_STORE_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym285$_FORWARD_PROBLEM_STORE_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym286$_MAXIMUM_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym287$_MAXIMUM_FORWARD_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym290$_PROBLEM_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym291$_GOOD_PROBLEM_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym292$_NO_GOOD_PROBLEM_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym293$_FORWARD_PROBLEM_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym294$_SINGLE_LITERAL_PROBLEM_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym295$_PROBLEM_LINK_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym296$_STRUCTURAL_LINK_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym297$_CONTENT_LINK_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym298$_REMOVAL_LINK_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym299$_TRANSFORMATION_LINK_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym303$_DEPENDENT_LINK_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym304$_SINGLE_LITERAL_PROBLEM_DEPENDENT_LINK_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym305$_TACTIC_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym306$_EXECUTED_TACTIC_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym307$_DISCARDED_TACTIC_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym308$_UNIFICATION_ATTEMPT_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym309$_UNIFICATION_SUCCESS_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym310$_SBHL_CACHE_ATTEMPT_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym311$_SBHL_CACHE_SUCCESS_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym312$_SBHL_GRAPH_ATTEMPT_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym313$_SBHL_GRAPH_SUCCESS_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym314$_SBHL_LINK_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym315$_PROOF_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym316$_INFERENCE_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym317$_SUCCESSFUL_INFERENCE_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym318$_FORWARD_INFERENCE_HISTORICAL_COUNT_ );
    subl_macro_promotions.declare_defglobal( $sym319$_SUCCESSFUL_FORWARD_INFERENCE_HISTORICAL_COUNT_ );
    utilities_macros.note_funcall_helper_function( $sym273$SKSI_QUERY_TOTAL_TIME_ACCUMULATOR_LOOKUP );
    utilities_macros.note_funcall_helper_function( $sym275$SKSI_QUERY_START_TIMES_ACCUMULATOR_LOOKUP );
    utilities_macros.note_funcall_helper_function( $sym277$SPARQL_QUERY_PROFILE_ACCUMULATOR_LOOKUP );
    memoization_state.note_memoized_function( $sym323$INFERENCE_TICK_INDEXED_PROGRESS_DATA_MEMOIZED );
    memoization_state.note_memoized_function( $sym332$INFERENCE_HL_MODULE_TIMES_MEMOIZED );
    subl_macro_promotions.declare_defglobal( $sym361$_FORWARD_INFERENCE_METRICS_TIME_INDEX_ );
    subl_macro_promotions.declare_defglobal( $sym362$_FORWARD_INFERENCE_METRICS_COUNT_INDEX_ );
    subl_macro_promotions.declare_defglobal( $sym363$_FORWARD_INFERENCE_METRICS_INFERENCE_INDEX_ );
    subl_macro_promotions.declare_defglobal( $sym365$_FORWARD_INFERENCE_METRICS_GAF_INDEX_ );
    subl_macro_promotions.declare_defglobal( $sym366$_FORWARD_INFERENCE_METRICS_SUCCESSFUL_RULE_INDEX_ );
    memoization_state.note_globally_cached_function( $sym372$GET_FORWARD_INFERENCE_METRIC_TYPE_AND_METRIC_LIST );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_metrics_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_metrics_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_metrics_file();
  }
  static
  {
    me = new inference_metrics();
    $dtp_inference_metric$ = null;
    $inference_metrics_store$ = null;
    $inference_metric_properties$ = null;
    $problem_store_historical_count$ = null;
    $forward_problem_store_historical_count$ = null;
    $maximum_problem_store_historical_problem_count$ = null;
    $maximum_forward_problem_store_historical_problem_count$ = null;
    $expensive_forward_problem_store_threshold$ = null;
    $problem_historical_count$ = null;
    $good_problem_historical_count$ = null;
    $no_good_problem_historical_count$ = null;
    $forward_problem_historical_count$ = null;
    $single_literal_problem_historical_count$ = null;
    $problem_link_historical_count$ = null;
    $structural_link_historical_count$ = null;
    $content_link_historical_count$ = null;
    $removal_link_historical_count$ = null;
    $transformation_link_historical_count$ = null;
    $dependent_link_historical_count$ = null;
    $single_literal_problem_dependent_link_historical_count$ = null;
    $tactic_historical_count$ = null;
    $executed_tactic_historical_count$ = null;
    $discarded_tactic_historical_count$ = null;
    $unification_attempt_historical_count$ = null;
    $unification_success_historical_count$ = null;
    $sbhl_cache_attempt_historical_count$ = null;
    $sbhl_cache_success_historical_count$ = null;
    $sbhl_graph_attempt_historical_count$ = null;
    $sbhl_graph_success_historical_count$ = null;
    $sbhl_link_historical_count$ = null;
    $proof_historical_count$ = null;
    $inference_historical_count$ = null;
    $successful_inference_historical_count$ = null;
    $forward_inference_historical_count$ = null;
    $successful_forward_inference_historical_count$ = null;
    $force_inference_tick_indexed_progress_data_collectionP$ = null;
    $force_inference_hl_module_times_data_collectionP$ = null;
    $gathering_forward_inference_metricsP$ = null;
    $forward_inference_last_metric_time$ = null;
    $forward_inference_metrics_time_index$ = null;
    $forward_inference_metrics_count_index$ = null;
    $forward_inference_metrics_inference_index$ = null;
    $forward_inference_metrics_gaf_index$ = null;
    $forward_inference_metrics_successful_rule_index$ = null;
    $get_forward_inference_metric_type_and_metric_list_caching_state$ = null;
    $forward_inference_metrics_lock$ = null;
    $list0 = ConsesLow.list( makeKeyword( "STORE" ), makeKeyword( "INFERENCE" ) );
    $sym1$INFERENCE_METRIC = makeSymbol( "INFERENCE-METRIC" );
    $sym2$INFERENCE_METRIC_P = makeSymbol( "INFERENCE-METRIC-P" );
    $list3 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "EVALUATION-FUNC" ), makeSymbol( "EVALUATION-ARG1" ), makeSymbol( "CROSS-PRODUCT?" ) );
    $list4 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "EVALUATION-FUNC" ), makeKeyword( "EVALUATION-ARG1" ), makeKeyword( "CROSS-PRODUCT?" ) );
    $list5 = ConsesLow.list( makeSymbol( "INF-METRIC-NAME" ), makeSymbol( "INF-METRIC-EVALUATION-FUNC" ), makeSymbol( "INF-METRIC-EVALUATION-ARG1" ), makeSymbol( "INF-METRIC-CROSS-PRODUCT?" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-INF-METRIC-NAME" ), makeSymbol( "_CSETF-INF-METRIC-EVALUATION-FUNC" ), makeSymbol( "_CSETF-INF-METRIC-EVALUATION-ARG1" ), makeSymbol(
        "_CSETF-INF-METRIC-CROSS-PRODUCT?" ) );
    $sym7$PRINT_INFERENCE_METRIC = makeSymbol( "PRINT-INFERENCE-METRIC" );
    $sym8$INFERENCE_METRIC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "INFERENCE-METRIC-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "INFERENCE-METRIC-P" ) );
    $sym10$INF_METRIC_NAME = makeSymbol( "INF-METRIC-NAME" );
    $sym11$_CSETF_INF_METRIC_NAME = makeSymbol( "_CSETF-INF-METRIC-NAME" );
    $sym12$INF_METRIC_EVALUATION_FUNC = makeSymbol( "INF-METRIC-EVALUATION-FUNC" );
    $sym13$_CSETF_INF_METRIC_EVALUATION_FUNC = makeSymbol( "_CSETF-INF-METRIC-EVALUATION-FUNC" );
    $sym14$INF_METRIC_EVALUATION_ARG1 = makeSymbol( "INF-METRIC-EVALUATION-ARG1" );
    $sym15$_CSETF_INF_METRIC_EVALUATION_ARG1 = makeSymbol( "_CSETF-INF-METRIC-EVALUATION-ARG1" );
    $sym16$INF_METRIC_CROSS_PRODUCT_ = makeSymbol( "INF-METRIC-CROSS-PRODUCT?" );
    $sym17$_CSETF_INF_METRIC_CROSS_PRODUCT_ = makeSymbol( "_CSETF-INF-METRIC-CROSS-PRODUCT?" );
    $kw18$NAME = makeKeyword( "NAME" );
    $kw19$EVALUATION_FUNC = makeKeyword( "EVALUATION-FUNC" );
    $kw20$EVALUATION_ARG1 = makeKeyword( "EVALUATION-ARG1" );
    $kw21$CROSS_PRODUCT_ = makeKeyword( "CROSS-PRODUCT?" );
    $str22$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw23$BEGIN = makeKeyword( "BEGIN" );
    $sym24$MAKE_INFERENCE_METRIC = makeSymbol( "MAKE-INFERENCE-METRIC" );
    $kw25$SLOT = makeKeyword( "SLOT" );
    $kw26$END = makeKeyword( "END" );
    $sym27$VISIT_DEFSTRUCT_OBJECT_INFERENCE_METRIC_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-INFERENCE-METRIC-METHOD" );
    $str28$_INFERENCE_METRIC___s_ = makeString( "<INFERENCE-METRIC: ~s>" );
    $sym29$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym30$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym31$INFERENCE_METRIC_EVALUATION_ARG1_P = makeSymbol( "INFERENCE-METRIC-EVALUATION-ARG1-P" );
    $sym32$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym33$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $sym34$PROBLEM_STORE_P = makeSymbol( "PROBLEM-STORE-P" );
    $kw35$STORE = makeKeyword( "STORE" );
    $kw36$INFERENCE = makeKeyword( "INFERENCE" );
    $str37$Unhandled_inference_metric_evalua = makeString( "Unhandled inference metric evaluation arg1 spec ~s" );
    $sym38$_INFERENCE_METRICS_STORE_ = makeSymbol( "*INFERENCE-METRICS-STORE*" );
    $list39 = ConsesLow.list( makeKeyword( "EVALUATION-FUNC" ), makeKeyword( "EVALUATION-ARG1" ), makeKeyword( "CROSS-PRODUCT?" ) );
    $kw40$ANSWER_COUNT = makeKeyword( "ANSWER-COUNT" );
    $sym41$INFERENCE_ANSWER_COUNT = makeSymbol( "INFERENCE-ANSWER-COUNT" );
    $kw42$ANSWER_COUNT_AT_30_SECONDS = makeKeyword( "ANSWER-COUNT-AT-30-SECONDS" );
    $sym43$INFERENCE_ANSWER_COUNT_AT_30_SECONDS = makeSymbol( "INFERENCE-ANSWER-COUNT-AT-30-SECONDS" );
    $kw44$ANSWER_COUNT_AT_60_SECONDS = makeKeyword( "ANSWER-COUNT-AT-60-SECONDS" );
    $sym45$INFERENCE_ANSWER_COUNT_AT_60_SECONDS = makeSymbol( "INFERENCE-ANSWER-COUNT-AT-60-SECONDS" );
    $kw46$TIME_TO_FIRST_ANSWER = makeKeyword( "TIME-TO-FIRST-ANSWER" );
    $sym47$INFERENCE_FIRST_ANSWER_ELAPSED_TIME = makeSymbol( "INFERENCE-FIRST-ANSWER-ELAPSED-TIME" );
    $kw48$TIME_TO_LAST_ANSWER = makeKeyword( "TIME-TO-LAST-ANSWER" );
    $sym49$INFERENCE_LAST_ANSWER_ELAPSED_TIME = makeSymbol( "INFERENCE-LAST-ANSWER-ELAPSED-TIME" );
    $kw50$HYPOTHESIZATION_TIME = makeKeyword( "HYPOTHESIZATION-TIME" );
    $sym51$INFERENCE_HYPOTHESIZATION_TIME = makeSymbol( "INFERENCE-HYPOTHESIZATION-TIME" );
    $kw52$TOTAL_TIME = makeKeyword( "TOTAL-TIME" );
    $sym53$INFERENCE_CUMULATIVE_TIME = makeSymbol( "INFERENCE-CUMULATIVE-TIME" );
    $kw54$TIME_PER_ANSWER = makeKeyword( "TIME-PER-ANSWER" );
    $sym55$INFERENCE_TIME_PER_ANSWER = makeSymbol( "INFERENCE-TIME-PER-ANSWER" );
    $kw56$STEPS_TO_FIRST_ANSWER = makeKeyword( "STEPS-TO-FIRST-ANSWER" );
    $sym57$INFERENCE_FIRST_ANSWER_STEP_COUNT = makeSymbol( "INFERENCE-FIRST-ANSWER-STEP-COUNT" );
    $kw58$STEPS_TO_LAST_ANSWER = makeKeyword( "STEPS-TO-LAST-ANSWER" );
    $sym59$INFERENCE_LAST_ANSWER_STEP_COUNT = makeSymbol( "INFERENCE-LAST-ANSWER-STEP-COUNT" );
    $kw60$TOTAL_STEPS = makeKeyword( "TOTAL-STEPS" );
    $sym61$INFERENCE_CUMULATIVE_STEP_COUNT = makeSymbol( "INFERENCE-CUMULATIVE-STEP-COUNT" );
    $kw62$STEPS_PER_ANSWER = makeKeyword( "STEPS-PER-ANSWER" );
    $sym63$INFERENCE_STEPS_PER_ANSWER = makeSymbol( "INFERENCE-STEPS-PER-ANSWER" );
    $kw64$WASTED_TIME_AFTER_LAST_ANSWER = makeKeyword( "WASTED-TIME-AFTER-LAST-ANSWER" );
    $sym65$INFERENCE_WASTED_TIME_AFTER_LAST_ANSWER = makeSymbol( "INFERENCE-WASTED-TIME-AFTER-LAST-ANSWER" );
    $kw66$LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeKeyword( "LATENCY-IMPROVEMENT-FROM-ITERATIVITY" );
    $sym67$INFERENCE_LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeSymbol( "INFERENCE-LATENCY-IMPROVEMENT-FROM-ITERATIVITY" );
    $kw68$PROBLEM_COUNT = makeKeyword( "PROBLEM-COUNT" );
    $sym69$PROBLEM_STORE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-PROBLEM-COUNT" );
    $kw70$PROBLEM_STORE_PROBLEM_COUNT = makeKeyword( "PROBLEM-STORE-PROBLEM-COUNT" );
    $kw71$PROOF_COUNT = makeKeyword( "PROOF-COUNT" );
    $sym72$PROBLEM_STORE_PROOF_COUNT = makeSymbol( "PROBLEM-STORE-PROOF-COUNT" );
    $kw73$PROBLEM_STORE_PROOF_COUNT = makeKeyword( "PROBLEM-STORE-PROOF-COUNT" );
    $kw74$LINK_COUNT = makeKeyword( "LINK-COUNT" );
    $sym75$PROBLEM_STORE_LINK_COUNT = makeSymbol( "PROBLEM-STORE-LINK-COUNT" );
    $kw76$TACTIC_COUNT = makeKeyword( "TACTIC-COUNT" );
    $sym77$PROBLEM_STORE_TACTIC_COUNT = makeSymbol( "PROBLEM-STORE-TACTIC-COUNT" );
    $kw78$POSSIBLE_TACTIC_COUNT = makeKeyword( "POSSIBLE-TACTIC-COUNT" );
    $sym79$PROBLEM_STORE_POSSIBLE_TACTIC_COUNT = makeSymbol( "PROBLEM-STORE-POSSIBLE-TACTIC-COUNT" );
    $kw80$EXECUTED_TACTIC_COUNT = makeKeyword( "EXECUTED-TACTIC-COUNT" );
    $sym81$PROBLEM_STORE_EXECUTED_TACTIC_COUNT = makeSymbol( "PROBLEM-STORE-EXECUTED-TACTIC-COUNT" );
    $kw82$TACTIC_EXECUTION_COUNT = makeKeyword( "TACTIC-EXECUTION-COUNT" );
    $sym83$PROBLEM_STORE_TACTIC_EXECUTION_COUNT = makeSymbol( "PROBLEM-STORE-TACTIC-EXECUTION-COUNT" );
    $kw84$DISCARDED_TACTIC_COUNT = makeKeyword( "DISCARDED-TACTIC-COUNT" );
    $sym85$PROBLEM_STORE_DISCARDED_TACTIC_COUNT = makeSymbol( "PROBLEM-STORE-DISCARDED-TACTIC-COUNT" );
    $kw86$CONTENT_LINK_COUNT = makeKeyword( "CONTENT-LINK-COUNT" );
    $sym87$PROBLEM_STORE_CONTENT_LINK_COUNT = makeSymbol( "PROBLEM-STORE-CONTENT-LINK-COUNT" );
    $kw88$REMOVAL_LINK_COUNT = makeKeyword( "REMOVAL-LINK-COUNT" );
    $sym89$PROBLEM_STORE_REMOVAL_LINK_COUNT = makeSymbol( "PROBLEM-STORE-REMOVAL-LINK-COUNT" );
    $kw90$REWRITE_LINK_COUNT = makeKeyword( "REWRITE-LINK-COUNT" );
    $sym91$PROBLEM_STORE_REWRITE_LINK_COUNT = makeSymbol( "PROBLEM-STORE-REWRITE-LINK-COUNT" );
    $kw92$TRANSFORMATION_LINK_COUNT = makeKeyword( "TRANSFORMATION-LINK-COUNT" );
    $sym93$PROBLEM_STORE_TRANSFORMATION_LINK_COUNT = makeSymbol( "PROBLEM-STORE-TRANSFORMATION-LINK-COUNT" );
    $kw94$STRUCTURAL_LINK_COUNT = makeKeyword( "STRUCTURAL-LINK-COUNT" );
    $sym95$PROBLEM_STORE_STRUCTURAL_LINK_COUNT = makeSymbol( "PROBLEM-STORE-STRUCTURAL-LINK-COUNT" );
    $kw96$JOIN_ORDERED_LINK_COUNT = makeKeyword( "JOIN-ORDERED-LINK-COUNT" );
    $sym97$PROBLEM_STORE_JOIN_ORDERED_LINK_COUNT = makeSymbol( "PROBLEM-STORE-JOIN-ORDERED-LINK-COUNT" );
    $kw98$JOIN_LINK_COUNT = makeKeyword( "JOIN-LINK-COUNT" );
    $sym99$PROBLEM_STORE_JOIN_LINK_COUNT = makeSymbol( "PROBLEM-STORE-JOIN-LINK-COUNT" );
    $kw100$SPLIT_LINK_COUNT = makeKeyword( "SPLIT-LINK-COUNT" );
    $sym101$PROBLEM_STORE_SPLIT_LINK_COUNT = makeSymbol( "PROBLEM-STORE-SPLIT-LINK-COUNT" );
    $kw102$RESTRICTION_LINK_COUNT = makeKeyword( "RESTRICTION-LINK-COUNT" );
    $sym103$PROBLEM_STORE_RESTRICTION_LINK_COUNT = makeSymbol( "PROBLEM-STORE-RESTRICTION-LINK-COUNT" );
    $kw104$RESIDUAL_TRANSFORMATION_LINK_COUNT = makeKeyword( "RESIDUAL-TRANSFORMATION-LINK-COUNT" );
    $sym105$PROBLEM_STORE_RESIDUAL_TRANSFORMATION_LINK_COUNT = makeSymbol( "PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT" );
    $kw106$UNION_LINK_COUNT = makeKeyword( "UNION-LINK-COUNT" );
    $sym107$PROBLEM_STORE_UNION_LINK_COUNT = makeSymbol( "PROBLEM-STORE-UNION-LINK-COUNT" );
    $kw108$GOOD_PROBLEM_COUNT = makeKeyword( "GOOD-PROBLEM-COUNT" );
    $sym109$PROBLEM_STORE_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-GOOD-PROBLEM-COUNT" );
    $kw110$NEUTRAL_PROBLEM_COUNT = makeKeyword( "NEUTRAL-PROBLEM-COUNT" );
    $sym111$PROBLEM_STORE_NEUTRAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NEUTRAL-PROBLEM-COUNT" );
    $kw112$NO_GOOD_PROBLEM_COUNT = makeKeyword( "NO-GOOD-PROBLEM-COUNT" );
    $sym113$PROBLEM_STORE_NO_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NO-GOOD-PROBLEM-COUNT" );
    $kw114$SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword( "SINGLE-LITERAL-PROBLEM-COUNT" );
    $sym115$PROBLEM_STORE_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-SINGLE-LITERAL-PROBLEM-COUNT" );
    $kw116$CONJUNCTIVE_PROBLEM_COUNT = makeKeyword( "CONJUNCTIVE-PROBLEM-COUNT" );
    $sym117$PROBLEM_STORE_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-CONJUNCTIVE-PROBLEM-COUNT" );
    $kw118$JOIN_PROBLEM_COUNT = makeKeyword( "JOIN-PROBLEM-COUNT" );
    $sym119$PROBLEM_STORE_JOIN_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-JOIN-PROBLEM-COUNT" );
    $kw120$SPLIT_PROBLEM_COUNT = makeKeyword( "SPLIT-PROBLEM-COUNT" );
    $sym121$PROBLEM_STORE_SPLIT_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-SPLIT-PROBLEM-COUNT" );
    $kw122$DISJUNCTIVE_PROBLEM_COUNT = makeKeyword( "DISJUNCTIVE-PROBLEM-COUNT" );
    $sym123$PROBLEM_STORE_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-DISJUNCTIVE-PROBLEM-COUNT" );
    $kw124$UNEXAMINED_PROBLEM_COUNT = makeKeyword( "UNEXAMINED-PROBLEM-COUNT" );
    $sym125$PROBLEM_STORE_UNEXAMINED_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-UNEXAMINED-PROBLEM-COUNT" );
    $kw126$EXAMINED_PROBLEM_COUNT = makeKeyword( "EXAMINED-PROBLEM-COUNT" );
    $sym127$PROBLEM_STORE_EXAMINED_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-EXAMINED-PROBLEM-COUNT" );
    $kw128$POSSIBLE_PROBLEM_COUNT = makeKeyword( "POSSIBLE-PROBLEM-COUNT" );
    $sym129$PROBLEM_STORE_POSSIBLE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-POSSIBLE-PROBLEM-COUNT" );
    $kw130$PENDING_PROBLEM_COUNT = makeKeyword( "PENDING-PROBLEM-COUNT" );
    $sym131$PROBLEM_STORE_PENDING_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-PENDING-PROBLEM-COUNT" );
    $kw132$FINISHED_PROBLEM_COUNT = makeKeyword( "FINISHED-PROBLEM-COUNT" );
    $sym133$PROBLEM_STORE_FINISHED_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-FINISHED-PROBLEM-COUNT" );
    $kw134$UNMANIFESTED_NON_FOCAL_COUNT = makeKeyword( "UNMANIFESTED-NON-FOCAL-COUNT" );
    $sym135$PROBLEM_STORE_UNMANIFESTED_NON_FOCAL_COUNT = makeSymbol( "PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT" );
    $kw136$TRANSFORMATION_RULE_BINDINGS_TO_CLOSED = makeKeyword( "TRANSFORMATION-RULE-BINDINGS-TO-CLOSED" );
    $sym137$PROBLEM_STORE_TRANSFORMATION_RULE_BINDINGS_TO_CLOSED = makeSymbol( "PROBLEM-STORE-TRANSFORMATION-RULE-BINDINGS-TO-CLOSED" );
    $kw138$PROBLEM_QUERIES = makeKeyword( "PROBLEM-QUERIES" );
    $sym139$PROBLEM_STORE_ALL_PROBLEM_QUERIES = makeSymbol( "PROBLEM-STORE-ALL-PROBLEM-QUERIES" );
    $kw140$ANSWER_TIMES = makeKeyword( "ANSWER-TIMES" );
    $sym141$INFERENCE_ANSWER_TIMES = makeSymbol( "INFERENCE-ANSWER-TIMES" );
    $kw142$ANSWER_STEP_COUNTS = makeKeyword( "ANSWER-STEP-COUNTS" );
    $sym143$INFERENCE_ANSWER_STEP_COUNTS = makeSymbol( "INFERENCE-ANSWER-STEP-COUNTS" );
    $kw144$PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT = makeKeyword( "PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT" );
    $sym145$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT = makeSymbol( "PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT" );
    $kw146$ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT = makeKeyword( "ESTIMATED-EXHAUSTIVE-NEW-ROOT-COUNT" );
    $sym147$INFERENCE_TRANSFORMATION_FANOUT_ESTIMATE = makeSymbol( "INFERENCE-TRANSFORMATION-FANOUT-ESTIMATE" );
    $kw148$TOP_LEVEL_REMOVAL_FANOUT = makeKeyword( "TOP-LEVEL-REMOVAL-FANOUT" );
    $sym149$INFERENCE_TOP_LEVEL_REMOVAL_FANOUT = makeSymbol( "INFERENCE-TOP-LEVEL-REMOVAL-FANOUT" );
    $kw150$NEW_ROOT_INITIAL_REMOVAL_FANOUTS = makeKeyword( "NEW-ROOT-INITIAL-REMOVAL-FANOUTS" );
    $sym151$INFERENCE_NEW_ROOT_INITIAL_REMOVAL_FANOUTS = makeSymbol( "INFERENCE-NEW-ROOT-INITIAL-REMOVAL-FANOUTS" );
    $kw152$PROOF_QUERY_PROPERTIES = makeKeyword( "PROOF-QUERY-PROPERTIES" );
    $sym153$INFERENCE_COMPUTE_PROOF_QUERY_PROPERTIES = makeSymbol( "INFERENCE-COMPUTE-PROOF-QUERY-PROPERTIES" );
    $kw154$ANSWER_PROOF_SPECS = makeKeyword( "ANSWER-PROOF-SPECS" );
    $sym155$INFERENCE_ALL_ANSWER_PROOF_SPECS = makeSymbol( "INFERENCE-ALL-ANSWER-PROOF-SPECS" );
    $kw156$INFERENCE_PROOF_SPEC = makeKeyword( "INFERENCE-PROOF-SPEC" );
    $sym157$INFERENCE_PROOF_SPEC = makeSymbol( "INFERENCE-PROOF-SPEC" );
    $kw158$EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES = makeKeyword( "EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES" );
    $sym159$PROBLEM_STORE_EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES = makeSymbol( "PROBLEM-STORE-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES" );
    $kw160$NEW_ROOT_METRICS = makeKeyword( "NEW-ROOT-METRICS" );
    $sym161$INFERENCE_NEW_ROOT_METRICS = makeSymbol( "INFERENCE-NEW-ROOT-METRICS" );
    $kw162$UNEXAMINED_GOOD_PROBLEM_COUNT = makeKeyword( "UNEXAMINED-GOOD-PROBLEM-COUNT" );
    $sym163$PROBLEM_STORE_UNEXAMINED_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-UNEXAMINED-GOOD-PROBLEM-COUNT" );
    $kw164$EXAMINED_GOOD_PROBLEM_COUNT = makeKeyword( "EXAMINED-GOOD-PROBLEM-COUNT" );
    $sym165$PROBLEM_STORE_EXAMINED_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-EXAMINED-GOOD-PROBLEM-COUNT" );
    $kw166$POSSIBLE_GOOD_PROBLEM_COUNT = makeKeyword( "POSSIBLE-GOOD-PROBLEM-COUNT" );
    $sym167$PROBLEM_STORE_POSSIBLE_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-POSSIBLE-GOOD-PROBLEM-COUNT" );
    $kw168$PENDING_GOOD_PROBLEM_COUNT = makeKeyword( "PENDING-GOOD-PROBLEM-COUNT" );
    $sym169$PROBLEM_STORE_PENDING_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-PENDING-GOOD-PROBLEM-COUNT" );
    $kw170$FINISHED_GOOD_PROBLEM_COUNT = makeKeyword( "FINISHED-GOOD-PROBLEM-COUNT" );
    $sym171$PROBLEM_STORE_FINISHED_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-FINISHED-GOOD-PROBLEM-COUNT" );
    $kw172$UNEXAMINED_NEUTRAL_PROBLEM_COUNT = makeKeyword( "UNEXAMINED-NEUTRAL-PROBLEM-COUNT" );
    $sym173$PROBLEM_STORE_UNEXAMINED_NEUTRAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-UNEXAMINED-NEUTRAL-PROBLEM-COUNT" );
    $kw174$EXAMINED_NEUTRAL_PROBLEM_COUNT = makeKeyword( "EXAMINED-NEUTRAL-PROBLEM-COUNT" );
    $sym175$PROBLEM_STORE_EXAMINED_NEUTRAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-EXAMINED-NEUTRAL-PROBLEM-COUNT" );
    $kw176$POSSIBLE_NEUTRAL_PROBLEM_COUNT = makeKeyword( "POSSIBLE-NEUTRAL-PROBLEM-COUNT" );
    $sym177$PROBLEM_STORE_POSSIBLE_NEUTRAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-POSSIBLE-NEUTRAL-PROBLEM-COUNT" );
    $kw178$PENDING_NEUTRAL_PROBLEM_COUNT = makeKeyword( "PENDING-NEUTRAL-PROBLEM-COUNT" );
    $sym179$PROBLEM_STORE_PENDING_NEUTRAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-PENDING-NEUTRAL-PROBLEM-COUNT" );
    $kw180$FINISHED_NEUTRAL_PROBLEM_COUNT = makeKeyword( "FINISHED-NEUTRAL-PROBLEM-COUNT" );
    $sym181$PROBLEM_STORE_FINISHED_NEUTRAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-FINISHED-NEUTRAL-PROBLEM-COUNT" );
    $kw182$UNEXAMINED_NO_GOOD_PROBLEM_COUNT = makeKeyword( "UNEXAMINED-NO-GOOD-PROBLEM-COUNT" );
    $sym183$PROBLEM_STORE_UNEXAMINED_NO_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-UNEXAMINED-NO-GOOD-PROBLEM-COUNT" );
    $kw184$EXAMINED_NO_GOOD_PROBLEM_COUNT = makeKeyword( "EXAMINED-NO-GOOD-PROBLEM-COUNT" );
    $sym185$PROBLEM_STORE_EXAMINED_NO_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-EXAMINED-NO-GOOD-PROBLEM-COUNT" );
    $kw186$POSSIBLE_NO_GOOD_PROBLEM_COUNT = makeKeyword( "POSSIBLE-NO-GOOD-PROBLEM-COUNT" );
    $sym187$PROBLEM_STORE_POSSIBLE_NO_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-POSSIBLE-NO-GOOD-PROBLEM-COUNT" );
    $kw188$PENDING_NO_GOOD_PROBLEM_COUNT = makeKeyword( "PENDING-NO-GOOD-PROBLEM-COUNT" );
    $sym189$PROBLEM_STORE_PENDING_NO_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-PENDING-NO-GOOD-PROBLEM-COUNT" );
    $kw190$FINISHED_NO_GOOD_PROBLEM_COUNT = makeKeyword( "FINISHED-NO-GOOD-PROBLEM-COUNT" );
    $sym191$PROBLEM_STORE_FINISHED_NO_GOOD_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-FINISHED-NO-GOOD-PROBLEM-COUNT" );
    $kw192$GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword( "GOOD-SINGLE-LITERAL-PROBLEM-COUNT" );
    $sym193$PROBLEM_STORE_GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-GOOD-SINGLE-LITERAL-PROBLEM-COUNT" );
    $kw194$GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword( "GOOD-CONJUNCTIVE-PROBLEM-COUNT" );
    $sym195$PROBLEM_STORE_GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-GOOD-CONJUNCTIVE-PROBLEM-COUNT" );
    $kw196$GOOD_JOIN_PROBLEM_COUNT = makeKeyword( "GOOD-JOIN-PROBLEM-COUNT" );
    $sym197$PROBLEM_STORE_GOOD_JOIN_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-GOOD-JOIN-PROBLEM-COUNT" );
    $kw198$GOOD_SPLIT_PROBLEM_COUNT = makeKeyword( "GOOD-SPLIT-PROBLEM-COUNT" );
    $sym199$PROBLEM_STORE_GOOD_SPLIT_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-GOOD-SPLIT-PROBLEM-COUNT" );
    $kw200$GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword( "GOOD-DISJUNCTIVE-PROBLEM-COUNT" );
    $sym201$PROBLEM_STORE_GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-GOOD-DISJUNCTIVE-PROBLEM-COUNT" );
    $kw202$NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword( "NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT" );
    $sym203$PROBLEM_STORE_NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT" );
    $kw204$NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword( "NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT" );
    $sym205$PROBLEM_STORE_NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT" );
    $kw206$NEUTRAL_JOIN_PROBLEM_COUNT = makeKeyword( "NEUTRAL-JOIN-PROBLEM-COUNT" );
    $sym207$PROBLEM_STORE_NEUTRAL_JOIN_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NEUTRAL-JOIN-PROBLEM-COUNT" );
    $kw208$NEUTRAL_SPLIT_PROBLEM_COUNT = makeKeyword( "NEUTRAL-SPLIT-PROBLEM-COUNT" );
    $sym209$PROBLEM_STORE_NEUTRAL_SPLIT_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NEUTRAL-SPLIT-PROBLEM-COUNT" );
    $kw210$NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword( "NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT" );
    $sym211$PROBLEM_STORE_NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT" );
    $kw212$NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword( "NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT" );
    $sym213$PROBLEM_STORE_NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT" );
    $kw214$NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword( "NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT" );
    $sym215$PROBLEM_STORE_NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT" );
    $kw216$NO_GOOD_JOIN_PROBLEM_COUNT = makeKeyword( "NO-GOOD-JOIN-PROBLEM-COUNT" );
    $sym217$PROBLEM_STORE_NO_GOOD_JOIN_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NO-GOOD-JOIN-PROBLEM-COUNT" );
    $kw218$NO_GOOD_SPLIT_PROBLEM_COUNT = makeKeyword( "NO-GOOD-SPLIT-PROBLEM-COUNT" );
    $sym219$PROBLEM_STORE_NO_GOOD_SPLIT_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NO-GOOD-SPLIT-PROBLEM-COUNT" );
    $kw220$NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword( "NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT" );
    $sym221$PROBLEM_STORE_NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT" );
    $kw222$UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword( "UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT" );
    $sym223$PROBLEM_STORE_UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT" );
    $kw224$UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword( "UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT" );
    $sym225$PROBLEM_STORE_UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT" );
    $kw226$UNEXAMINED_JOIN_PROBLEM_COUNT = makeKeyword( "UNEXAMINED-JOIN-PROBLEM-COUNT" );
    $sym227$PROBLEM_STORE_UNEXAMINED_JOIN_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-UNEXAMINED-JOIN-PROBLEM-COUNT" );
    $kw228$UNEXAMINED_SPLIT_PROBLEM_COUNT = makeKeyword( "UNEXAMINED-SPLIT-PROBLEM-COUNT" );
    $sym229$PROBLEM_STORE_UNEXAMINED_SPLIT_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-UNEXAMINED-SPLIT-PROBLEM-COUNT" );
    $kw230$UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword( "UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT" );
    $sym231$PROBLEM_STORE_UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT" );
    $kw232$EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword( "EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT" );
    $sym233$PROBLEM_STORE_EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT" );
    $kw234$EXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword( "EXAMINED-CONJUNCTIVE-PROBLEM-COUNT" );
    $sym235$PROBLEM_STORE_EXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-EXAMINED-CONJUNCTIVE-PROBLEM-COUNT" );
    $kw236$EXAMINED_JOIN_PROBLEM_COUNT = makeKeyword( "EXAMINED-JOIN-PROBLEM-COUNT" );
    $sym237$PROBLEM_STORE_EXAMINED_JOIN_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-EXAMINED-JOIN-PROBLEM-COUNT" );
    $kw238$EXAMINED_SPLIT_PROBLEM_COUNT = makeKeyword( "EXAMINED-SPLIT-PROBLEM-COUNT" );
    $sym239$PROBLEM_STORE_EXAMINED_SPLIT_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-EXAMINED-SPLIT-PROBLEM-COUNT" );
    $kw240$EXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword( "EXAMINED-DISJUNCTIVE-PROBLEM-COUNT" );
    $sym241$PROBLEM_STORE_EXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-EXAMINED-DISJUNCTIVE-PROBLEM-COUNT" );
    $kw242$POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword( "POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT" );
    $sym243$PROBLEM_STORE_POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT" );
    $kw244$POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword( "POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT" );
    $sym245$PROBLEM_STORE_POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT" );
    $kw246$POSSIBLE_JOIN_PROBLEM_COUNT = makeKeyword( "POSSIBLE-JOIN-PROBLEM-COUNT" );
    $sym247$PROBLEM_STORE_POSSIBLE_JOIN_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-POSSIBLE-JOIN-PROBLEM-COUNT" );
    $kw248$POSSIBLE_SPLIT_PROBLEM_COUNT = makeKeyword( "POSSIBLE-SPLIT-PROBLEM-COUNT" );
    $sym249$PROBLEM_STORE_POSSIBLE_SPLIT_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-POSSIBLE-SPLIT-PROBLEM-COUNT" );
    $kw250$POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword( "POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT" );
    $sym251$PROBLEM_STORE_POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT" );
    $kw252$PENDING_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword( "PENDING-SINGLE-LITERAL-PROBLEM-COUNT" );
    $sym253$PROBLEM_STORE_PENDING_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-PENDING-SINGLE-LITERAL-PROBLEM-COUNT" );
    $kw254$PENDING_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword( "PENDING-CONJUNCTIVE-PROBLEM-COUNT" );
    $sym255$PROBLEM_STORE_PENDING_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-PENDING-CONJUNCTIVE-PROBLEM-COUNT" );
    $kw256$PENDING_JOIN_PROBLEM_COUNT = makeKeyword( "PENDING-JOIN-PROBLEM-COUNT" );
    $sym257$PROBLEM_STORE_PENDING_JOIN_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-PENDING-JOIN-PROBLEM-COUNT" );
    $kw258$PENDING_SPLIT_PROBLEM_COUNT = makeKeyword( "PENDING-SPLIT-PROBLEM-COUNT" );
    $sym259$PROBLEM_STORE_PENDING_SPLIT_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-PENDING-SPLIT-PROBLEM-COUNT" );
    $kw260$PENDING_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword( "PENDING-DISJUNCTIVE-PROBLEM-COUNT" );
    $sym261$PROBLEM_STORE_PENDING_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-PENDING-DISJUNCTIVE-PROBLEM-COUNT" );
    $kw262$FINISHED_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword( "FINISHED-SINGLE-LITERAL-PROBLEM-COUNT" );
    $sym263$PROBLEM_STORE_FINISHED_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-FINISHED-SINGLE-LITERAL-PROBLEM-COUNT" );
    $kw264$FINISHED_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword( "FINISHED-CONJUNCTIVE-PROBLEM-COUNT" );
    $sym265$PROBLEM_STORE_FINISHED_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-FINISHED-CONJUNCTIVE-PROBLEM-COUNT" );
    $kw266$FINISHED_JOIN_PROBLEM_COUNT = makeKeyword( "FINISHED-JOIN-PROBLEM-COUNT" );
    $sym267$PROBLEM_STORE_FINISHED_JOIN_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-FINISHED-JOIN-PROBLEM-COUNT" );
    $kw268$FINISHED_SPLIT_PROBLEM_COUNT = makeKeyword( "FINISHED-SPLIT-PROBLEM-COUNT" );
    $sym269$PROBLEM_STORE_FINISHED_SPLIT_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-FINISHED-SPLIT-PROBLEM-COUNT" );
    $kw270$FINISHED_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword( "FINISHED-DISJUNCTIVE-PROBLEM-COUNT" );
    $sym271$PROBLEM_STORE_FINISHED_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol( "PROBLEM-STORE-FINISHED-DISJUNCTIVE-PROBLEM-COUNT" );
    $kw272$SKSI_QUERY_TOTAL_TIME = makeKeyword( "SKSI-QUERY-TOTAL-TIME" );
    $sym273$SKSI_QUERY_TOTAL_TIME_ACCUMULATOR_LOOKUP = makeSymbol( "SKSI-QUERY-TOTAL-TIME-ACCUMULATOR-LOOKUP" );
    $kw274$SKSI_QUERY_START_TIMES = makeKeyword( "SKSI-QUERY-START-TIMES" );
    $sym275$SKSI_QUERY_START_TIMES_ACCUMULATOR_LOOKUP = makeSymbol( "SKSI-QUERY-START-TIMES-ACCUMULATOR-LOOKUP" );
    $kw276$SPARQL_QUERY_PROFILE = makeKeyword( "SPARQL-QUERY-PROFILE" );
    $sym277$SPARQL_QUERY_PROFILE_ACCUMULATOR_LOOKUP = makeSymbol( "SPARQL-QUERY-PROFILE-ACCUMULATOR-LOOKUP" );
    $kw278$TICK_INDEXED_PROGRESS_DATA = makeKeyword( "TICK-INDEXED-PROGRESS-DATA" );
    $sym279$INFERENCE_TICK_INDEXED_PROGRESS_DATA = makeSymbol( "INFERENCE-TICK-INDEXED-PROGRESS-DATA" );
    $kw280$INFERENCE_HL_MODULE_TIMES = makeKeyword( "INFERENCE-HL-MODULE-TIMES" );
    $sym281$INFERENCE_HL_MODULE_TIMES = makeSymbol( "INFERENCE-HL-MODULE-TIMES" );
    $kw282$RULE_BINDING_VALUE_MAP = makeKeyword( "RULE-BINDING-VALUE-MAP" );
    $sym283$PROBLEM_STORE_RULE_BINDING_VALUE_MAP = makeSymbol( "PROBLEM-STORE-RULE-BINDING-VALUE-MAP" );
    $sym284$_PROBLEM_STORE_HISTORICAL_COUNT_ = makeSymbol( "*PROBLEM-STORE-HISTORICAL-COUNT*" );
    $sym285$_FORWARD_PROBLEM_STORE_HISTORICAL_COUNT_ = makeSymbol( "*FORWARD-PROBLEM-STORE-HISTORICAL-COUNT*" );
    $sym286$_MAXIMUM_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_ = makeSymbol( "*MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*" );
    $sym287$_MAXIMUM_FORWARD_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_ = makeSymbol( "*MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*" );
    $int288$1000 = makeInteger( 1000 );
    $str289$Forward__S_contained__S_problems = makeString( "Forward ~S contained ~S problems" );
    $sym290$_PROBLEM_HISTORICAL_COUNT_ = makeSymbol( "*PROBLEM-HISTORICAL-COUNT*" );
    $sym291$_GOOD_PROBLEM_HISTORICAL_COUNT_ = makeSymbol( "*GOOD-PROBLEM-HISTORICAL-COUNT*" );
    $sym292$_NO_GOOD_PROBLEM_HISTORICAL_COUNT_ = makeSymbol( "*NO-GOOD-PROBLEM-HISTORICAL-COUNT*" );
    $sym293$_FORWARD_PROBLEM_HISTORICAL_COUNT_ = makeSymbol( "*FORWARD-PROBLEM-HISTORICAL-COUNT*" );
    $sym294$_SINGLE_LITERAL_PROBLEM_HISTORICAL_COUNT_ = makeSymbol( "*SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT*" );
    $sym295$_PROBLEM_LINK_HISTORICAL_COUNT_ = makeSymbol( "*PROBLEM-LINK-HISTORICAL-COUNT*" );
    $sym296$_STRUCTURAL_LINK_HISTORICAL_COUNT_ = makeSymbol( "*STRUCTURAL-LINK-HISTORICAL-COUNT*" );
    $sym297$_CONTENT_LINK_HISTORICAL_COUNT_ = makeSymbol( "*CONTENT-LINK-HISTORICAL-COUNT*" );
    $sym298$_REMOVAL_LINK_HISTORICAL_COUNT_ = makeSymbol( "*REMOVAL-LINK-HISTORICAL-COUNT*" );
    $sym299$_TRANSFORMATION_LINK_HISTORICAL_COUNT_ = makeSymbol( "*TRANSFORMATION-LINK-HISTORICAL-COUNT*" );
    $kw300$REMOVAL = makeKeyword( "REMOVAL" );
    $kw301$TRANSFORMATION = makeKeyword( "TRANSFORMATION" );
    $kw302$REWRITE = makeKeyword( "REWRITE" );
    $sym303$_DEPENDENT_LINK_HISTORICAL_COUNT_ = makeSymbol( "*DEPENDENT-LINK-HISTORICAL-COUNT*" );
    $sym304$_SINGLE_LITERAL_PROBLEM_DEPENDENT_LINK_HISTORICAL_COUNT_ = makeSymbol( "*SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT*" );
    $sym305$_TACTIC_HISTORICAL_COUNT_ = makeSymbol( "*TACTIC-HISTORICAL-COUNT*" );
    $sym306$_EXECUTED_TACTIC_HISTORICAL_COUNT_ = makeSymbol( "*EXECUTED-TACTIC-HISTORICAL-COUNT*" );
    $sym307$_DISCARDED_TACTIC_HISTORICAL_COUNT_ = makeSymbol( "*DISCARDED-TACTIC-HISTORICAL-COUNT*" );
    $sym308$_UNIFICATION_ATTEMPT_HISTORICAL_COUNT_ = makeSymbol( "*UNIFICATION-ATTEMPT-HISTORICAL-COUNT*" );
    $sym309$_UNIFICATION_SUCCESS_HISTORICAL_COUNT_ = makeSymbol( "*UNIFICATION-SUCCESS-HISTORICAL-COUNT*" );
    $sym310$_SBHL_CACHE_ATTEMPT_HISTORICAL_COUNT_ = makeSymbol( "*SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT*" );
    $sym311$_SBHL_CACHE_SUCCESS_HISTORICAL_COUNT_ = makeSymbol( "*SBHL-CACHE-SUCCESS-HISTORICAL-COUNT*" );
    $sym312$_SBHL_GRAPH_ATTEMPT_HISTORICAL_COUNT_ = makeSymbol( "*SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT*" );
    $sym313$_SBHL_GRAPH_SUCCESS_HISTORICAL_COUNT_ = makeSymbol( "*SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT*" );
    $sym314$_SBHL_LINK_HISTORICAL_COUNT_ = makeSymbol( "*SBHL-LINK-HISTORICAL-COUNT*" );
    $sym315$_PROOF_HISTORICAL_COUNT_ = makeSymbol( "*PROOF-HISTORICAL-COUNT*" );
    $sym316$_INFERENCE_HISTORICAL_COUNT_ = makeSymbol( "*INFERENCE-HISTORICAL-COUNT*" );
    $sym317$_SUCCESSFUL_INFERENCE_HISTORICAL_COUNT_ = makeSymbol( "*SUCCESSFUL-INFERENCE-HISTORICAL-COUNT*" );
    $sym318$_FORWARD_INFERENCE_HISTORICAL_COUNT_ = makeSymbol( "*FORWARD-INFERENCE-HISTORICAL-COUNT*" );
    $sym319$_SUCCESSFUL_FORWARD_INFERENCE_HISTORICAL_COUNT_ = makeSymbol( "*SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT*" );
    $kw320$SKSI_QUERY_TOTAL_TIME_ACC = makeKeyword( "SKSI-QUERY-TOTAL-TIME-ACC" );
    $kw321$SKSI_QUERY_START_TIMES_ACC = makeKeyword( "SKSI-QUERY-START-TIMES-ACC" );
    $kw322$SPARQL_QUERY_PROFILE_ACC = makeKeyword( "SPARQL-QUERY-PROFILE-ACC" );
    $sym323$INFERENCE_TICK_INDEXED_PROGRESS_DATA_MEMOIZED = makeSymbol( "INFERENCE-TICK-INDEXED-PROGRESS-DATA-MEMOIZED" );
    $int324$128 = makeInteger( 128 );
    $kw325$TICK_COUNT = makeKeyword( "TICK-COUNT" );
    $kw326$STEP_COUNT = makeKeyword( "STEP-COUNT" );
    $kw327$ASSERTION_TOUCH_COUNT = makeKeyword( "ASSERTION-TOUCH-COUNT" );
    $kw328$TERM_TOUCH_COUNT = makeKeyword( "TERM-TOUCH-COUNT" );
    $kw329$LAST_ASSERTION_TOUCHED = makeKeyword( "LAST-ASSERTION-TOUCHED" );
    $kw330$LAST_TERM_TOUCHED = makeKeyword( "LAST-TERM-TOUCHED" );
    $kw331$PROBLEM = makeKeyword( "PROBLEM" );
    $sym332$INFERENCE_HL_MODULE_TIMES_MEMOIZED = makeSymbol( "INFERENCE-HL-MODULE-TIMES-MEMOIZED" );
    $list333 = ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "BINDINGS" ) );
    $sym334$POSSIBLY_GENERICIZE_INDETERMINATE_TERM = makeSymbol( "POSSIBLY-GENERICIZE-INDETERMINATE-TERM" );
    $const335$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw336$SKIP = makeKeyword( "SKIP" );
    $sym337$MAP_P = makeSymbol( "MAP-P" );
    $list338 = ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "VARIABLE-MAP" ) );
    $str339$____Rule_ = makeString( "~%~%Rule:" );
    $sym340$_ = makeSymbol( "<" );
    $sym341$VARIABLE_ID = makeSymbol( "VARIABLE-ID" );
    $str342$___S__ = makeString( "~%~S =" );
    $kw343$ASCENDING = makeKeyword( "ASCENDING" );
    $str344$_____S = makeString( "~%  ~S" );
    $list345 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "BROWSABLE?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list346 = ConsesLow.list( makeKeyword( "BROWSABLE?" ) );
    $kw347$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw348$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $sym349$CLET = makeSymbol( "CLET" );
    $list350 = ConsesLow.list( makeSymbol( "*GATHERING-FORWARD-INFERENCE-METRICS?*" ), T );
    $sym351$_BROWSE_FORWARD_INFERENCES__ = makeSymbol( "*BROWSE-FORWARD-INFERENCES?*" );
    $list352 = ConsesLow.list( ConsesLow.list( makeSymbol( "FINALIZE-FORWARD-INFERENCE-METRICS-INFERENCE-INDEX" ) ) );
    $list353 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "THRESHOLD" ), makeSymbol( "BROWSABLE?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list354 = ConsesLow.list( makeKeyword( "THRESHOLD" ), makeKeyword( "BROWSABLE?" ) );
    $kw355$THRESHOLD = makeKeyword( "THRESHOLD" );
    $sym356$GATHERING_FORWARD_INFERENCE_METRICS = makeSymbol( "GATHERING-FORWARD-INFERENCE-METRICS" );
    $sym357$SHOW_FORWARD_INFERENCE_METRICS = makeSymbol( "SHOW-FORWARD-INFERENCE-METRICS" );
    $sym358$PROGN = makeSymbol( "PROGN" );
    $list359 = ConsesLow.list( makeSymbol( "CLEAR-FORWARD-INFERENCE-METRICS" ) );
    $sym360$SHOW_FORWARD_INFERENCE_METRICS_OF = makeSymbol( "SHOW-FORWARD-INFERENCE-METRICS-OF" );
    $sym361$_FORWARD_INFERENCE_METRICS_TIME_INDEX_ = makeSymbol( "*FORWARD-INFERENCE-METRICS-TIME-INDEX*" );
    $sym362$_FORWARD_INFERENCE_METRICS_COUNT_INDEX_ = makeSymbol( "*FORWARD-INFERENCE-METRICS-COUNT-INDEX*" );
    $sym363$_FORWARD_INFERENCE_METRICS_INFERENCE_INDEX_ = makeSymbol( "*FORWARD-INFERENCE-METRICS-INFERENCE-INDEX*" );
    $sym364$VALID_INFERENCE_P = makeSymbol( "VALID-INFERENCE-P" );
    $sym365$_FORWARD_INFERENCE_METRICS_GAF_INDEX_ = makeSymbol( "*FORWARD-INFERENCE-METRICS-GAF-INDEX*" );
    $sym366$_FORWARD_INFERENCE_METRICS_SUCCESSFUL_RULE_INDEX_ = makeSymbol( "*FORWARD-INFERENCE-METRICS-SUCCESSFUL-RULE-INDEX*" );
    $sym367$_ = makeSymbol( "+" );
    $kw368$OUTPUT = makeKeyword( "OUTPUT" );
    $str369$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw370$INPUT = makeKeyword( "INPUT" );
    $kw371$EOF = makeKeyword( "EOF" );
    $sym372$GET_FORWARD_INFERENCE_METRIC_TYPE_AND_METRIC_LIST = makeSymbol( "GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST" );
    $sym373$_GET_FORWARD_INFERENCE_METRIC_TYPE_AND_METRIC_LIST_CACHING_STATE_ = makeSymbol( "*GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST-CACHING-STATE*" );
    $str374$Forward_Inference_Metrics_Lock = makeString( "Forward Inference Metrics Lock" );
    $str375$Negative_time___A_for___A__A___ = makeString( "Negative time: ~A for (~A ~A)~%" );
    $kw376$UNKNOWN_GAF = makeKeyword( "UNKNOWN-GAF" );
    $sym377$CDR = makeSymbol( "CDR" );
    $sym378$_ = makeSymbol( ">" );
    $sym379$FORWARD_INFERENCE_TIME_METRIC_TOTAL_TIME_FROM_CDR = makeSymbol( "FORWARD-INFERENCE-TIME-METRIC-TOTAL-TIME-FROM-CDR" );
    $list380 = ConsesLow.cons( makeSymbol( "RULE" ), makeSymbol( "TIME-PLIST" ) );
    $sym381$FORWARD_TMS_RULE_ = makeSymbol( "FORWARD-TMS-RULE?" );
    $kw382$RULE = makeKeyword( "RULE" );
    $kw383$TIME = makeKeyword( "TIME" );
    $kw384$INFERENCE_TIME = makeKeyword( "INFERENCE-TIME" );
    $kw385$INFERENCE_COUNT = makeKeyword( "INFERENCE-COUNT" );
    $kw386$TRIGGER_GAFS = makeKeyword( "TRIGGER-GAFS" );
    $kw387$SUCCESS_RULE_COUNT = makeKeyword( "SUCCESS-RULE-COUNT" );
    $kw388$SUCCESS_TRIGGER_COUNT = makeKeyword( "SUCCESS-TRIGGER-COUNT" );
    $kw389$SUCCESS_TIME_ESTIMATE = makeKeyword( "SUCCESS-TIME-ESTIMATE" );
    $kw390$TOTAL_RULE_COUNT = makeKeyword( "TOTAL-RULE-COUNT" );
    $kw391$TOTAL_TRIGGER_COUNT = makeKeyword( "TOTAL-TRIGGER-COUNT" );
    $kw392$TOTAL_INFERENCE_TIME = makeKeyword( "TOTAL-INFERENCE-TIME" );
    $kw393$SUCCESS_RULE_RATIO = makeKeyword( "SUCCESS-RULE-RATIO" );
    $kw394$SUCCESS_TRIGGER_RATIO = makeKeyword( "SUCCESS-TRIGGER-RATIO" );
    $kw395$SUCCESS_TIME_RATIO = makeKeyword( "SUCCESS-TIME-RATIO" );
    $kw396$SUCCESS_INFERENCE_TIME_RATIO = makeKeyword( "SUCCESS-INFERENCE-TIME-RATIO" );
    $list397 = ConsesLow.cons( makeSymbol( "RULE" ), makeSymbol( "COUNT-PLIST" ) );
    $sym398$DEDUCTION_ID = makeSymbol( "DEDUCTION-ID" );
    $kw399$TIME_PLIST = makeKeyword( "TIME-PLIST" );
    $kw400$COUNT_PLIST = makeKeyword( "COUNT-PLIST" );
    $kw401$OVERHEAD = makeKeyword( "OVERHEAD" );
    $kw402$INFERENCES = makeKeyword( "INFERENCES" );
    $kw403$TOTAL_INFERENCES = makeKeyword( "TOTAL-INFERENCES" );
    $kw404$TOTAL_RULES = makeKeyword( "TOTAL-RULES" );
    $kw405$TOTAL_TRIGGERS = makeKeyword( "TOTAL-TRIGGERS" );
    $kw406$AVERAGE_INFERENCES_PER_RULE = makeKeyword( "AVERAGE-INFERENCES-PER-RULE" );
    $kw407$STDEV_INFERENCES_PER_RULE = makeKeyword( "STDEV-INFERENCES-PER-RULE" );
    $kw408$AVERAGE_TRIGGER_PER_RULE = makeKeyword( "AVERAGE-TRIGGER-PER-RULE" );
    $kw409$STDEV_TRIGGER_PER_RULE = makeKeyword( "STDEV-TRIGGER-PER-RULE" );
    $kw410$AVERAGE_TIME_PER_RULE = makeKeyword( "AVERAGE-TIME-PER-RULE" );
    $kw411$STDEV_TIME_PER_RULE = makeKeyword( "STDEV-TIME-PER-RULE" );
    $kw412$AVERAGE_TIME_PER_INFERENCE = makeKeyword( "AVERAGE-TIME-PER-INFERENCE" );
    $kw413$STDEV_TIME_PER_INFERENCE = makeKeyword( "STDEV-TIME-PER-INFERENCE" );
    $kw414$AVERAGE_TIME_PER_TRIGGER = makeKeyword( "AVERAGE-TIME-PER-TRIGGER" );
    $kw415$STDEV_TIME_PER_TRIGGER = makeKeyword( "STDEV-TIME-PER-TRIGGER" );
    $list416 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "RULE" ), makeSymbol( "TIME" ), makeSymbol( "TRIGGER-GAFS" ), makeSymbol( "INFERENCE-COUNT" ), makeSymbol( "INFERENCES" ) );
    $list417 = ConsesLow.list( makeKeyword( "RULE" ), makeKeyword( "TIME" ), makeKeyword( "TRIGGER-GAFS" ), makeKeyword( "INFERENCE-COUNT" ), makeKeyword( "INFERENCES" ) );
    $str418$___6F____S____S__a__S = makeString( "~%~6F : ~S : ~S  a ~S" );
    $str419$___S = makeString( "~%~S" );
    $kw420$INFO = makeKeyword( "INFO" );
    $kw421$ALL = makeKeyword( "ALL" );
    $kw422$FORMAT = makeKeyword( "FORMAT" );
    $kw423$CSV = makeKeyword( "CSV" );
    $kw424$HEADINGS_ = makeKeyword( "HEADINGS?" );
    $kw425$COLUMNS = makeKeyword( "COLUMNS" );
    $list426 = ConsesLow.list( makeKeyword( "SUCCESS-COUNT" ), makeKeyword( "TRIGGER-COUNT" ), makeKeyword( "SUCCESS-TIME" ), makeKeyword( "TIME" ), makeKeyword( "ID" ) );
    $kw427$SUCCESSFUL = makeKeyword( "SUCCESSFUL" );
    $list428 = ConsesLow.list( ConsesLow.cons( makeKeyword( "CSV" ), makeString( ", " ) ), ConsesLow.cons( makeKeyword( "TSV" ), makeString( "\t" ) ) );
    $sym429$DOUBLE_FLOAT = makeSymbol( "DOUBLE-FLOAT" );
    $str430$__ = makeString( "~&" );
    $str431$_ = makeString( " " );
    $str432$_ = makeString( "-" );
    $kw433$TRIGGER_COUNT = makeKeyword( "TRIGGER-COUNT" );
    $kw434$SUCCESS_COUNT = makeKeyword( "SUCCESS-COUNT" );
    $kw435$SUCCESS_TIME = makeKeyword( "SUCCESS-TIME" );
    $kw436$ID = makeKeyword( "ID" );
    $kw437$CHLID = makeKeyword( "CHLID" );
    $kw438$EL_IST_FORMULA = makeKeyword( "EL-IST-FORMULA" );
    $str439$__Total_inferences_______________ = makeString( "~%Total inferences                   : ~6,' D" );
    $str440$___total_forward__data_directed__ = makeString( "~% total forward (data directed)     : ~6,' D" );
    $str441$____successful_forward___________ = makeString( "~%  successful forward               : ~6,' D" );
    $str442$___total_backward__query_directed = makeString( "~% total backward (query directed)   : ~6,' D" );
    $str443$____successful_backward__________ = makeString( "~%  successful backward              : ~6,' D" );
    $str444$___avg_relevant_problem_count____ = makeString( "~% avg relevant problem count        : ~6,' D" );
    $str445$__Total_problem_stores___________ = makeString( "~%Total problem stores               : ~6,' D" );
    $str446$___total_forward___data_directed_ = makeString( "~% total forward  (data directed)    : ~6,' D" );
    $str447$___max_problem_store_problem_coun = makeString( "~% max problem store problem count   : ~6,' D" );
    $str448$___avg_problem_store_problem_coun = makeString( "~% avg problem store problem count   : ~6,' D" );
    $str449$___max_forward_problem_store_prob = makeString( "~% max forward problem store problem count   : ~6,' D" );
    $str450$___avg_forward_problem_store_prob = makeString( "~% avg forward problem store problem count   : ~6,' D" );
    $str451$__Total_problems_____________6___ = makeString( "~%Total problems          : ~6,' D" );
    $str452$___total_good_problems_______6___ = makeString( "~% total good problems    : ~6,' D" );
    $str453$___total_no_good_problems____6___ = makeString( "~% total no-good problems : ~6,' D" );
    $str454$___total_forward_problems____6___ = makeString( "~% total forward problems : ~6,' D" );
    $str455$___total_problem_reuses______6___ = makeString( "~% total problem reuses   : ~6,' D" );
    $str456$____problem_reuse_ratio______6___ = makeString( "~%  problem reuse ratio   : ~6,' D per problem" );
    $str457$__Total_problem_links________6___ = makeString( "~%Total problem links     : ~6,' D" );
    $str458$___total_structural_links____6___ = makeString( "~% total structural links : ~6,' D" );
    $str459$___total_content_links_______6___ = makeString( "~% total content links    : ~6,' D" );
    $str460$____removal_links____________6___ = makeString( "~%  removal links         : ~6,' D" );
    $str461$____transformation_links_____6___ = makeString( "~%  transformation links  : ~6,' D" );
    $str462$__Total_tactics_______6___D = makeString( "~%Total tactics    : ~6,' D" );
    $str463$___total_executed_____6___D = makeString( "~% total executed  : ~6,' D" );
    $str464$___total_discarded____6___D = makeString( "~% total discarded : ~6,' D" );
    $str465$__Total_SBHL_cache_calls______9__ = makeString( "~%Total SBHL cache calls   : ~9,' D" );
    $str466$___successful_________________9__ = makeString( "~% successful              : ~9,' D" );
    $str467$__Total_SBHL_graph_walks______9__ = makeString( "~%Total SBHL graph walks   : ~9,' D" );
    $str468$__Total_unification_attempts____6 = makeString( "~%Total unification attempts : ~6,' D" );
    $str469$___successful_unifications______6 = makeString( "~% successful unifications   : ~6,' D" );
    $str470$__Total_proofs____6___D = makeString( "~%Total proofs : ~6,' D" );
    $int471$100 = makeInteger( 100 );
    $str472$___2___D___ = makeString( " (~2,' D %)" );
    $str473$___3___D___ = makeString( " (~3,' D %)" );
    $str474$___D___ = makeString( " (~D %)" );
  }

  public static final class $inference_metric_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $evaluation_func;
    public SubLObject $evaluation_arg1;
    public SubLObject $cross_productP;
    private static final SubLStructDeclNative structDecl;

    public $inference_metric_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$evaluation_func = CommonSymbols.NIL;
      this.$evaluation_arg1 = CommonSymbols.NIL;
      this.$cross_productP = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $inference_metric_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$evaluation_func;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$evaluation_arg1;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$cross_productP;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$evaluation_func = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$evaluation_arg1 = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$cross_productP = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $inference_metric_native.class, $sym1$INFERENCE_METRIC, $sym2$INFERENCE_METRIC_P, $list3, $list4, new String[] { "$name", "$evaluation_func", "$evaluation_arg1",
        "$cross_productP"
      }, $list5, $list6, $sym7$PRINT_INFERENCE_METRIC );
    }
  }

  public static final class $inference_metric_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_metric_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-METRIC-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_metric_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1195 ms
 * 
 */