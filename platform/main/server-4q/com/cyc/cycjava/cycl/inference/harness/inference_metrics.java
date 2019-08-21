package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
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

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.cycjava.cycl.inference.browser.problem_store_visualization;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics.$inference_metric_native;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inference_metrics extends SubLTranslatedFile {
    public static final SubLFile me = new inference_metrics();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_metrics";

    public static final String myFingerPrint = "5eb7b787818f976a2a46d47d8fabeb46a3b6272be975f5d01b3a72a01a7d7f12";

    // defconstant
    public static final SubLSymbol $dtp_inference_metric$ = makeSymbol("*DTP-INFERENCE-METRIC*");



    // deflexical
    // The list of allowable properties for an inference metric.
    private static final SubLSymbol $inference_metric_properties$ = makeSymbol("*INFERENCE-METRIC-PROPERTIES*");









    // defvar
    private static final SubLSymbol $expensive_forward_problem_store_threshold$ = makeSymbol("*EXPENSIVE-FORWARD-PROBLEM-STORE-THRESHOLD*");























































    // defparameter
    public static final SubLSymbol $force_inference_tick_indexed_progress_data_collectionP$ = makeSymbol("*FORCE-INFERENCE-TICK-INDEXED-PROGRESS-DATA-COLLECTION?*");

    // defparameter
    public static final SubLSymbol $force_inference_hl_module_times_data_collectionP$ = makeSymbol("*FORCE-INFERENCE-HL-MODULE-TIMES-DATA-COLLECTION?*");

    // defvar
    // Whether we are gathering metrics on the expense of forward inference.
    public static final SubLSymbol $gathering_forward_inference_metricsP$ = makeSymbol("*GATHERING-FORWARD-INFERENCE-METRICS?*");

    // defparameter
    public static final SubLSymbol $forward_inference_last_metric_time$ = makeSymbol("*FORWARD-INFERENCE-LAST-METRIC-TIME*");













    // deflexical
    public static final SubLSymbol $forward_inference_metrics_lock$ = makeSymbol("*FORWARD-INFERENCE-METRICS-LOCK*");

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("STORE"), makeKeyword("INFERENCE"));

    public static final SubLSymbol INFERENCE_METRIC = makeSymbol("INFERENCE-METRIC");

    public static final SubLSymbol INFERENCE_METRIC_P = makeSymbol("INFERENCE-METRIC-P");

    public static final SubLList $list3 = list(makeSymbol("NAME"), makeSymbol("EVALUATION-FUNC"), makeSymbol("EVALUATION-ARG1"), makeSymbol("CROSS-PRODUCT?"));

    public static final SubLList $list4 = list(makeKeyword("NAME"), makeKeyword("EVALUATION-FUNC"), makeKeyword("EVALUATION-ARG1"), makeKeyword("CROSS-PRODUCT?"));

    public static final SubLList $list5 = list(makeSymbol("INF-METRIC-NAME"), makeSymbol("INF-METRIC-EVALUATION-FUNC"), makeSymbol("INF-METRIC-EVALUATION-ARG1"), makeSymbol("INF-METRIC-CROSS-PRODUCT?"));

    public static final SubLList $list6 = list(makeSymbol("_CSETF-INF-METRIC-NAME"), makeSymbol("_CSETF-INF-METRIC-EVALUATION-FUNC"), makeSymbol("_CSETF-INF-METRIC-EVALUATION-ARG1"), makeSymbol("_CSETF-INF-METRIC-CROSS-PRODUCT?"));

    public static final SubLSymbol PRINT_INFERENCE_METRIC = makeSymbol("PRINT-INFERENCE-METRIC");

    public static final SubLSymbol INFERENCE_METRIC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-METRIC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INFERENCE-METRIC-P"));

    private static final SubLSymbol INF_METRIC_NAME = makeSymbol("INF-METRIC-NAME");

    private static final SubLSymbol _CSETF_INF_METRIC_NAME = makeSymbol("_CSETF-INF-METRIC-NAME");

    private static final SubLSymbol INF_METRIC_EVALUATION_FUNC = makeSymbol("INF-METRIC-EVALUATION-FUNC");

    private static final SubLSymbol _CSETF_INF_METRIC_EVALUATION_FUNC = makeSymbol("_CSETF-INF-METRIC-EVALUATION-FUNC");

    private static final SubLSymbol INF_METRIC_EVALUATION_ARG1 = makeSymbol("INF-METRIC-EVALUATION-ARG1");

    private static final SubLSymbol _CSETF_INF_METRIC_EVALUATION_ARG1 = makeSymbol("_CSETF-INF-METRIC-EVALUATION-ARG1");

    private static final SubLSymbol $sym16$INF_METRIC_CROSS_PRODUCT_ = makeSymbol("INF-METRIC-CROSS-PRODUCT?");

    private static final SubLSymbol $sym17$_CSETF_INF_METRIC_CROSS_PRODUCT_ = makeSymbol("_CSETF-INF-METRIC-CROSS-PRODUCT?");







    private static final SubLSymbol $kw21$CROSS_PRODUCT_ = makeKeyword("CROSS-PRODUCT?");

    private static final SubLString $str22$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_INFERENCE_METRIC = makeSymbol("MAKE-INFERENCE-METRIC");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_INFERENCE_METRIC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INFERENCE-METRIC-METHOD");

    private static final SubLString $str28$_INFERENCE_METRIC___s_ = makeString("<INFERENCE-METRIC: ~s>");





    private static final SubLSymbol INFERENCE_METRIC_EVALUATION_ARG1_P = makeSymbol("INFERENCE-METRIC-EVALUATION-ARG1-P");











    private static final SubLString $str37$Unhandled_inference_metric_evalua = makeString("Unhandled inference metric evaluation arg1 spec ~s");

    private static final SubLSymbol $inference_metrics_store$ = makeSymbol("*INFERENCE-METRICS-STORE*");

    private static final SubLList $list39 = list(makeKeyword("EVALUATION-FUNC"), makeKeyword("EVALUATION-ARG1"), makeKeyword("CROSS-PRODUCT?"));



    private static final SubLSymbol INFERENCE_ANSWER_COUNT = makeSymbol("INFERENCE-ANSWER-COUNT");

    private static final SubLSymbol $ANSWER_COUNT_AT_30_SECONDS = makeKeyword("ANSWER-COUNT-AT-30-SECONDS");

    private static final SubLSymbol INFERENCE_ANSWER_COUNT_AT_30_SECONDS = makeSymbol("INFERENCE-ANSWER-COUNT-AT-30-SECONDS");

    private static final SubLSymbol $ANSWER_COUNT_AT_60_SECONDS = makeKeyword("ANSWER-COUNT-AT-60-SECONDS");

    private static final SubLSymbol INFERENCE_ANSWER_COUNT_AT_60_SECONDS = makeSymbol("INFERENCE-ANSWER-COUNT-AT-60-SECONDS");

    private static final SubLSymbol $TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");

    private static final SubLSymbol INFERENCE_FIRST_ANSWER_ELAPSED_TIME = makeSymbol("INFERENCE-FIRST-ANSWER-ELAPSED-TIME");

    private static final SubLSymbol $TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");

    private static final SubLSymbol INFERENCE_LAST_ANSWER_ELAPSED_TIME = makeSymbol("INFERENCE-LAST-ANSWER-ELAPSED-TIME");



    private static final SubLSymbol INFERENCE_HYPOTHESIZATION_TIME = makeSymbol("INFERENCE-HYPOTHESIZATION-TIME");



    private static final SubLSymbol INFERENCE_CUMULATIVE_TIME = makeSymbol("INFERENCE-CUMULATIVE-TIME");

    private static final SubLSymbol $TIME_PER_ANSWER = makeKeyword("TIME-PER-ANSWER");

    private static final SubLSymbol INFERENCE_TIME_PER_ANSWER = makeSymbol("INFERENCE-TIME-PER-ANSWER");

    private static final SubLSymbol $STEPS_TO_FIRST_ANSWER = makeKeyword("STEPS-TO-FIRST-ANSWER");

    private static final SubLSymbol INFERENCE_FIRST_ANSWER_STEP_COUNT = makeSymbol("INFERENCE-FIRST-ANSWER-STEP-COUNT");

    private static final SubLSymbol $STEPS_TO_LAST_ANSWER = makeKeyword("STEPS-TO-LAST-ANSWER");

    private static final SubLSymbol INFERENCE_LAST_ANSWER_STEP_COUNT = makeSymbol("INFERENCE-LAST-ANSWER-STEP-COUNT");



    private static final SubLSymbol INFERENCE_CUMULATIVE_STEP_COUNT = makeSymbol("INFERENCE-CUMULATIVE-STEP-COUNT");

    private static final SubLSymbol $STEPS_PER_ANSWER = makeKeyword("STEPS-PER-ANSWER");

    private static final SubLSymbol INFERENCE_STEPS_PER_ANSWER = makeSymbol("INFERENCE-STEPS-PER-ANSWER");

    private static final SubLSymbol $WASTED_TIME_AFTER_LAST_ANSWER = makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER");

    private static final SubLSymbol INFERENCE_WASTED_TIME_AFTER_LAST_ANSWER = makeSymbol("INFERENCE-WASTED-TIME-AFTER-LAST-ANSWER");

    private static final SubLSymbol $LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");

    private static final SubLSymbol INFERENCE_LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeSymbol("INFERENCE-LATENCY-IMPROVEMENT-FROM-ITERATIVITY");



    private static final SubLSymbol PROBLEM_STORE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PROBLEM-COUNT");

    private static final SubLSymbol $PROBLEM_STORE_PROBLEM_COUNT = makeKeyword("PROBLEM-STORE-PROBLEM-COUNT");



    private static final SubLSymbol PROBLEM_STORE_PROOF_COUNT = makeSymbol("PROBLEM-STORE-PROOF-COUNT");

    private static final SubLSymbol $PROBLEM_STORE_PROOF_COUNT = makeKeyword("PROBLEM-STORE-PROOF-COUNT");



    private static final SubLSymbol PROBLEM_STORE_LINK_COUNT = makeSymbol("PROBLEM-STORE-LINK-COUNT");



    private static final SubLSymbol PROBLEM_STORE_TACTIC_COUNT = makeSymbol("PROBLEM-STORE-TACTIC-COUNT");

    private static final SubLSymbol $POSSIBLE_TACTIC_COUNT = makeKeyword("POSSIBLE-TACTIC-COUNT");

    private static final SubLSymbol PROBLEM_STORE_POSSIBLE_TACTIC_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-TACTIC-COUNT");

    private static final SubLSymbol $EXECUTED_TACTIC_COUNT = makeKeyword("EXECUTED-TACTIC-COUNT");

    private static final SubLSymbol PROBLEM_STORE_EXECUTED_TACTIC_COUNT = makeSymbol("PROBLEM-STORE-EXECUTED-TACTIC-COUNT");

    private static final SubLSymbol $TACTIC_EXECUTION_COUNT = makeKeyword("TACTIC-EXECUTION-COUNT");

    private static final SubLSymbol PROBLEM_STORE_TACTIC_EXECUTION_COUNT = makeSymbol("PROBLEM-STORE-TACTIC-EXECUTION-COUNT");

    private static final SubLSymbol $DISCARDED_TACTIC_COUNT = makeKeyword("DISCARDED-TACTIC-COUNT");

    private static final SubLSymbol PROBLEM_STORE_DISCARDED_TACTIC_COUNT = makeSymbol("PROBLEM-STORE-DISCARDED-TACTIC-COUNT");

    private static final SubLSymbol $CONTENT_LINK_COUNT = makeKeyword("CONTENT-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_CONTENT_LINK_COUNT = makeSymbol("PROBLEM-STORE-CONTENT-LINK-COUNT");

    private static final SubLSymbol $REMOVAL_LINK_COUNT = makeKeyword("REMOVAL-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_REMOVAL_LINK_COUNT = makeSymbol("PROBLEM-STORE-REMOVAL-LINK-COUNT");

    private static final SubLSymbol $REWRITE_LINK_COUNT = makeKeyword("REWRITE-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_REWRITE_LINK_COUNT = makeSymbol("PROBLEM-STORE-REWRITE-LINK-COUNT");

    private static final SubLSymbol $TRANSFORMATION_LINK_COUNT = makeKeyword("TRANSFORMATION-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_TRANSFORMATION_LINK_COUNT = makeSymbol("PROBLEM-STORE-TRANSFORMATION-LINK-COUNT");

    private static final SubLSymbol $STRUCTURAL_LINK_COUNT = makeKeyword("STRUCTURAL-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_STRUCTURAL_LINK_COUNT = makeSymbol("PROBLEM-STORE-STRUCTURAL-LINK-COUNT");

    private static final SubLSymbol $JOIN_ORDERED_LINK_COUNT = makeKeyword("JOIN-ORDERED-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_JOIN_ORDERED_LINK_COUNT = makeSymbol("PROBLEM-STORE-JOIN-ORDERED-LINK-COUNT");

    private static final SubLSymbol $JOIN_LINK_COUNT = makeKeyword("JOIN-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_JOIN_LINK_COUNT = makeSymbol("PROBLEM-STORE-JOIN-LINK-COUNT");

    private static final SubLSymbol $SPLIT_LINK_COUNT = makeKeyword("SPLIT-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_SPLIT_LINK_COUNT = makeSymbol("PROBLEM-STORE-SPLIT-LINK-COUNT");

    private static final SubLSymbol $RESTRICTION_LINK_COUNT = makeKeyword("RESTRICTION-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_RESTRICTION_LINK_COUNT = makeSymbol("PROBLEM-STORE-RESTRICTION-LINK-COUNT");

    private static final SubLSymbol $RESIDUAL_TRANSFORMATION_LINK_COUNT = makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_RESIDUAL_TRANSFORMATION_LINK_COUNT = makeSymbol("PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT");

    private static final SubLSymbol $UNION_LINK_COUNT = makeKeyword("UNION-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_UNION_LINK_COUNT = makeSymbol("PROBLEM-STORE-UNION-LINK-COUNT");

    private static final SubLSymbol $GOOD_PROBLEM_COUNT = makeKeyword("GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $NEUTRAL_PROBLEM_COUNT = makeKeyword("NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol $NO_GOOD_PROBLEM_COUNT = makeKeyword("NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol $CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $JOIN_PROBLEM_COUNT = makeKeyword("JOIN-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol $SPLIT_PROBLEM_COUNT = makeKeyword("SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol $DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $UNEXAMINED_PROBLEM_COUNT = makeKeyword("UNEXAMINED-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_UNEXAMINED_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-PROBLEM-COUNT");

    private static final SubLSymbol $EXAMINED_PROBLEM_COUNT = makeKeyword("EXAMINED-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_EXAMINED_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-PROBLEM-COUNT");

    private static final SubLSymbol $POSSIBLE_PROBLEM_COUNT = makeKeyword("POSSIBLE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_POSSIBLE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-PROBLEM-COUNT");

    private static final SubLSymbol $PENDING_PROBLEM_COUNT = makeKeyword("PENDING-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_PENDING_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-PROBLEM-COUNT");

    private static final SubLSymbol $FINISHED_PROBLEM_COUNT = makeKeyword("FINISHED-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_FINISHED_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-PROBLEM-COUNT");

    private static final SubLSymbol $UNMANIFESTED_NON_FOCAL_COUNT = makeKeyword("UNMANIFESTED-NON-FOCAL-COUNT");

    private static final SubLSymbol PROBLEM_STORE_UNMANIFESTED_NON_FOCAL_COUNT = makeSymbol("PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT");

    private static final SubLSymbol $TRANSFORMATION_RULE_BINDINGS_TO_CLOSED = makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED");

    private static final SubLSymbol PROBLEM_STORE_TRANSFORMATION_RULE_BINDINGS_TO_CLOSED = makeSymbol("PROBLEM-STORE-TRANSFORMATION-RULE-BINDINGS-TO-CLOSED");



    private static final SubLSymbol PROBLEM_STORE_ALL_PROBLEM_QUERIES = makeSymbol("PROBLEM-STORE-ALL-PROBLEM-QUERIES");



    private static final SubLSymbol INFERENCE_ANSWER_TIMES = makeSymbol("INFERENCE-ANSWER-TIMES");

    private static final SubLSymbol $ANSWER_STEP_COUNTS = makeKeyword("ANSWER-STEP-COUNTS");

    private static final SubLSymbol INFERENCE_ANSWER_STEP_COUNTS = makeSymbol("INFERENCE-ANSWER-STEP-COUNTS");

    private static final SubLSymbol $PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT = makeKeyword("PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT");

    private static final SubLSymbol PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT = makeSymbol("PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT");

    private static final SubLSymbol $ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT = makeKeyword("ESTIMATED-EXHAUSTIVE-NEW-ROOT-COUNT");

    private static final SubLSymbol INFERENCE_TRANSFORMATION_FANOUT_ESTIMATE = makeSymbol("INFERENCE-TRANSFORMATION-FANOUT-ESTIMATE");

    private static final SubLSymbol $TOP_LEVEL_REMOVAL_FANOUT = makeKeyword("TOP-LEVEL-REMOVAL-FANOUT");

    private static final SubLSymbol INFERENCE_TOP_LEVEL_REMOVAL_FANOUT = makeSymbol("INFERENCE-TOP-LEVEL-REMOVAL-FANOUT");

    private static final SubLSymbol $NEW_ROOT_INITIAL_REMOVAL_FANOUTS = makeKeyword("NEW-ROOT-INITIAL-REMOVAL-FANOUTS");

    private static final SubLSymbol INFERENCE_NEW_ROOT_INITIAL_REMOVAL_FANOUTS = makeSymbol("INFERENCE-NEW-ROOT-INITIAL-REMOVAL-FANOUTS");

    private static final SubLSymbol $PROOF_QUERY_PROPERTIES = makeKeyword("PROOF-QUERY-PROPERTIES");

    private static final SubLSymbol INFERENCE_COMPUTE_PROOF_QUERY_PROPERTIES = makeSymbol("INFERENCE-COMPUTE-PROOF-QUERY-PROPERTIES");

    private static final SubLSymbol $ANSWER_PROOF_SPECS = makeKeyword("ANSWER-PROOF-SPECS");

    private static final SubLSymbol INFERENCE_ALL_ANSWER_PROOF_SPECS = makeSymbol("INFERENCE-ALL-ANSWER-PROOF-SPECS");

    private static final SubLSymbol $INFERENCE_PROOF_SPEC = makeKeyword("INFERENCE-PROOF-SPEC");

    private static final SubLSymbol INFERENCE_PROOF_SPEC = makeSymbol("INFERENCE-PROOF-SPEC");

    private static final SubLSymbol $EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES = makeKeyword("EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES");

    private static final SubLSymbol PROBLEM_STORE_EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES = makeSymbol("PROBLEM-STORE-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES");

    private static final SubLSymbol $NEW_ROOT_METRICS = makeKeyword("NEW-ROOT-METRICS");

    private static final SubLSymbol INFERENCE_NEW_ROOT_METRICS = makeSymbol("INFERENCE-NEW-ROOT-METRICS");

    private static final SubLSymbol $UNEXAMINED_GOOD_PROBLEM_COUNT = makeKeyword("UNEXAMINED-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_UNEXAMINED_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $EXAMINED_GOOD_PROBLEM_COUNT = makeKeyword("EXAMINED-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_EXAMINED_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $POSSIBLE_GOOD_PROBLEM_COUNT = makeKeyword("POSSIBLE-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_POSSIBLE_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $PENDING_GOOD_PROBLEM_COUNT = makeKeyword("PENDING-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_PENDING_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $FINISHED_GOOD_PROBLEM_COUNT = makeKeyword("FINISHED-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_FINISHED_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $UNEXAMINED_NEUTRAL_PROBLEM_COUNT = makeKeyword("UNEXAMINED-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_UNEXAMINED_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol $EXAMINED_NEUTRAL_PROBLEM_COUNT = makeKeyword("EXAMINED-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_EXAMINED_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol $POSSIBLE_NEUTRAL_PROBLEM_COUNT = makeKeyword("POSSIBLE-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_POSSIBLE_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol $PENDING_NEUTRAL_PROBLEM_COUNT = makeKeyword("PENDING-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_PENDING_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol $FINISHED_NEUTRAL_PROBLEM_COUNT = makeKeyword("FINISHED-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_FINISHED_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-NEUTRAL-PROBLEM-COUNT");

    private static final SubLSymbol $UNEXAMINED_NO_GOOD_PROBLEM_COUNT = makeKeyword("UNEXAMINED-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_UNEXAMINED_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $EXAMINED_NO_GOOD_PROBLEM_COUNT = makeKeyword("EXAMINED-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_EXAMINED_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $POSSIBLE_NO_GOOD_PROBLEM_COUNT = makeKeyword("POSSIBLE-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_POSSIBLE_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $PENDING_NO_GOOD_PROBLEM_COUNT = makeKeyword("PENDING-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_PENDING_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $FINISHED_NO_GOOD_PROBLEM_COUNT = makeKeyword("FINISHED-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_FINISHED_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-NO-GOOD-PROBLEM-COUNT");

    private static final SubLSymbol $GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("GOOD-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol $GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("GOOD-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $GOOD_JOIN_PROBLEM_COUNT = makeKeyword("GOOD-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_GOOD_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol $GOOD_SPLIT_PROBLEM_COUNT = makeKeyword("GOOD-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_GOOD_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol $GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("GOOD-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol $NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $NEUTRAL_JOIN_PROBLEM_COUNT = makeKeyword("NEUTRAL-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NEUTRAL_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol $NEUTRAL_SPLIT_PROBLEM_COUNT = makeKeyword("NEUTRAL-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NEUTRAL_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol $NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol $NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $NO_GOOD_JOIN_PROBLEM_COUNT = makeKeyword("NO-GOOD-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NO_GOOD_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol $NO_GOOD_SPLIT_PROBLEM_COUNT = makeKeyword("NO-GOOD-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NO_GOOD_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol $NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol $UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $UNEXAMINED_JOIN_PROBLEM_COUNT = makeKeyword("UNEXAMINED-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_UNEXAMINED_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol $UNEXAMINED_SPLIT_PROBLEM_COUNT = makeKeyword("UNEXAMINED-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_UNEXAMINED_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol $UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol $EXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("EXAMINED-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_EXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $EXAMINED_JOIN_PROBLEM_COUNT = makeKeyword("EXAMINED-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_EXAMINED_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol $EXAMINED_SPLIT_PROBLEM_COUNT = makeKeyword("EXAMINED-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_EXAMINED_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol $EXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("EXAMINED-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_EXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol $POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $POSSIBLE_JOIN_PROBLEM_COUNT = makeKeyword("POSSIBLE-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_POSSIBLE_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol $POSSIBLE_SPLIT_PROBLEM_COUNT = makeKeyword("POSSIBLE-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_POSSIBLE_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol $POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $PENDING_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("PENDING-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_PENDING_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol $PENDING_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("PENDING-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_PENDING_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $PENDING_JOIN_PROBLEM_COUNT = makeKeyword("PENDING-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_PENDING_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol $PENDING_SPLIT_PROBLEM_COUNT = makeKeyword("PENDING-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_PENDING_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol $PENDING_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("PENDING-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_PENDING_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $FINISHED_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("FINISHED-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_FINISHED_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-SINGLE-LITERAL-PROBLEM-COUNT");

    private static final SubLSymbol $FINISHED_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("FINISHED-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_FINISHED_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-CONJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $FINISHED_JOIN_PROBLEM_COUNT = makeKeyword("FINISHED-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_FINISHED_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-JOIN-PROBLEM-COUNT");

    private static final SubLSymbol $FINISHED_SPLIT_PROBLEM_COUNT = makeKeyword("FINISHED-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_FINISHED_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-SPLIT-PROBLEM-COUNT");

    private static final SubLSymbol $FINISHED_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("FINISHED-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_FINISHED_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-DISJUNCTIVE-PROBLEM-COUNT");

    private static final SubLSymbol $SKSI_QUERY_TOTAL_TIME = makeKeyword("SKSI-QUERY-TOTAL-TIME");

    private static final SubLSymbol SKSI_QUERY_TOTAL_TIME_ACCUMULATOR_LOOKUP = makeSymbol("SKSI-QUERY-TOTAL-TIME-ACCUMULATOR-LOOKUP");

    private static final SubLSymbol $SKSI_QUERY_START_TIMES = makeKeyword("SKSI-QUERY-START-TIMES");

    private static final SubLSymbol SKSI_QUERY_START_TIMES_ACCUMULATOR_LOOKUP = makeSymbol("SKSI-QUERY-START-TIMES-ACCUMULATOR-LOOKUP");

    private static final SubLSymbol $SPARQL_QUERY_PROFILE = makeKeyword("SPARQL-QUERY-PROFILE");

    private static final SubLSymbol SPARQL_QUERY_PROFILE_ACCUMULATOR_LOOKUP = makeSymbol("SPARQL-QUERY-PROFILE-ACCUMULATOR-LOOKUP");

    private static final SubLSymbol $TICK_INDEXED_PROGRESS_DATA = makeKeyword("TICK-INDEXED-PROGRESS-DATA");

    private static final SubLSymbol INFERENCE_TICK_INDEXED_PROGRESS_DATA = makeSymbol("INFERENCE-TICK-INDEXED-PROGRESS-DATA");

    private static final SubLSymbol $INFERENCE_HL_MODULE_TIMES = makeKeyword("INFERENCE-HL-MODULE-TIMES");

    private static final SubLSymbol INFERENCE_HL_MODULE_TIMES = makeSymbol("INFERENCE-HL-MODULE-TIMES");

    private static final SubLSymbol $RULE_BINDING_VALUE_MAP = makeKeyword("RULE-BINDING-VALUE-MAP");

    private static final SubLSymbol PROBLEM_STORE_RULE_BINDING_VALUE_MAP = makeSymbol("PROBLEM-STORE-RULE-BINDING-VALUE-MAP");

    private static final SubLSymbol $problem_store_historical_count$ = makeSymbol("*PROBLEM-STORE-HISTORICAL-COUNT*");

    private static final SubLSymbol $forward_problem_store_historical_count$ = makeSymbol("*FORWARD-PROBLEM-STORE-HISTORICAL-COUNT*");

    private static final SubLSymbol $maximum_problem_store_historical_problem_count$ = makeSymbol("*MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*");

    private static final SubLSymbol $maximum_forward_problem_store_historical_problem_count$ = makeSymbol("*MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*");



    private static final SubLString $str289$Forward__S_contained__S_problems = makeString("Forward ~S contained ~S problems");

    private static final SubLSymbol $problem_historical_count$ = makeSymbol("*PROBLEM-HISTORICAL-COUNT*");

    private static final SubLSymbol $good_problem_historical_count$ = makeSymbol("*GOOD-PROBLEM-HISTORICAL-COUNT*");

    private static final SubLSymbol $no_good_problem_historical_count$ = makeSymbol("*NO-GOOD-PROBLEM-HISTORICAL-COUNT*");

    private static final SubLSymbol $forward_problem_historical_count$ = makeSymbol("*FORWARD-PROBLEM-HISTORICAL-COUNT*");

    private static final SubLSymbol $single_literal_problem_historical_count$ = makeSymbol("*SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT*");

    private static final SubLSymbol $problem_link_historical_count$ = makeSymbol("*PROBLEM-LINK-HISTORICAL-COUNT*");

    private static final SubLSymbol $structural_link_historical_count$ = makeSymbol("*STRUCTURAL-LINK-HISTORICAL-COUNT*");

    private static final SubLSymbol $content_link_historical_count$ = makeSymbol("*CONTENT-LINK-HISTORICAL-COUNT*");

    private static final SubLSymbol $removal_link_historical_count$ = makeSymbol("*REMOVAL-LINK-HISTORICAL-COUNT*");

    private static final SubLSymbol $transformation_link_historical_count$ = makeSymbol("*TRANSFORMATION-LINK-HISTORICAL-COUNT*");







    private static final SubLSymbol $dependent_link_historical_count$ = makeSymbol("*DEPENDENT-LINK-HISTORICAL-COUNT*");

    private static final SubLSymbol $single_literal_problem_dependent_link_historical_count$ = makeSymbol("*SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT*");

    private static final SubLSymbol $tactic_historical_count$ = makeSymbol("*TACTIC-HISTORICAL-COUNT*");

    private static final SubLSymbol $executed_tactic_historical_count$ = makeSymbol("*EXECUTED-TACTIC-HISTORICAL-COUNT*");

    private static final SubLSymbol $discarded_tactic_historical_count$ = makeSymbol("*DISCARDED-TACTIC-HISTORICAL-COUNT*");

    private static final SubLSymbol $unification_attempt_historical_count$ = makeSymbol("*UNIFICATION-ATTEMPT-HISTORICAL-COUNT*");

    private static final SubLSymbol $unification_success_historical_count$ = makeSymbol("*UNIFICATION-SUCCESS-HISTORICAL-COUNT*");

    private static final SubLSymbol $sbhl_cache_attempt_historical_count$ = makeSymbol("*SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT*");

    private static final SubLSymbol $sbhl_cache_success_historical_count$ = makeSymbol("*SBHL-CACHE-SUCCESS-HISTORICAL-COUNT*");

    private static final SubLSymbol $sbhl_graph_attempt_historical_count$ = makeSymbol("*SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT*");

    private static final SubLSymbol $sbhl_graph_success_historical_count$ = makeSymbol("*SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT*");

    private static final SubLSymbol $sbhl_link_historical_count$ = makeSymbol("*SBHL-LINK-HISTORICAL-COUNT*");

    private static final SubLSymbol $proof_historical_count$ = makeSymbol("*PROOF-HISTORICAL-COUNT*");

    private static final SubLSymbol $inference_historical_count$ = makeSymbol("*INFERENCE-HISTORICAL-COUNT*");

    private static final SubLSymbol $successful_inference_historical_count$ = makeSymbol("*SUCCESSFUL-INFERENCE-HISTORICAL-COUNT*");

    private static final SubLSymbol $forward_inference_historical_count$ = makeSymbol("*FORWARD-INFERENCE-HISTORICAL-COUNT*");

    private static final SubLSymbol $successful_forward_inference_historical_count$ = makeSymbol("*SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT*");

    private static final SubLSymbol $SKSI_QUERY_TOTAL_TIME_ACC = makeKeyword("SKSI-QUERY-TOTAL-TIME-ACC");

    private static final SubLSymbol $SKSI_QUERY_START_TIMES_ACC = makeKeyword("SKSI-QUERY-START-TIMES-ACC");

    private static final SubLSymbol $SPARQL_QUERY_PROFILE_ACC = makeKeyword("SPARQL-QUERY-PROFILE-ACC");

    private static final SubLSymbol INFERENCE_TICK_INDEXED_PROGRESS_DATA_MEMOIZED = makeSymbol("INFERENCE-TICK-INDEXED-PROGRESS-DATA-MEMOIZED");

    private static final SubLInteger $int$128 = makeInteger(128);





    private static final SubLSymbol $ASSERTION_TOUCH_COUNT = makeKeyword("ASSERTION-TOUCH-COUNT");

    private static final SubLSymbol $TERM_TOUCH_COUNT = makeKeyword("TERM-TOUCH-COUNT");

    private static final SubLSymbol $LAST_ASSERTION_TOUCHED = makeKeyword("LAST-ASSERTION-TOUCHED");

    private static final SubLSymbol $LAST_TERM_TOUCHED = makeKeyword("LAST-TERM-TOUCHED");



    private static final SubLSymbol INFERENCE_HL_MODULE_TIMES_MEMOIZED = makeSymbol("INFERENCE-HL-MODULE-TIMES-MEMOIZED");

    private static final SubLList $list333 = list(makeSymbol("RULE"), makeSymbol("BINDINGS"));

    private static final SubLSymbol POSSIBLY_GENERICIZE_INDETERMINATE_TERM = makeSymbol("POSSIBLY-GENERICIZE-INDETERMINATE-TERM");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLSymbol MAP_P = makeSymbol("MAP-P");

    private static final SubLList $list338 = list(makeSymbol("RULE"), makeSymbol("VARIABLE-MAP"));

    private static final SubLString $str339$____Rule_ = makeString("~%~%Rule:");

    private static final SubLSymbol $sym340$_ = makeSymbol("<");

    private static final SubLSymbol VARIABLE_ID = makeSymbol("VARIABLE-ID");

    private static final SubLString $str342$___S__ = makeString("~%~S =");



    private static final SubLString $str344$_____S = makeString("~%  ~S");

    public static final SubLList $list345 = list(list(makeSymbol("&KEY"), makeSymbol("BROWSABLE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list346 = list(makeKeyword("BROWSABLE?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLList $list350 = list(makeSymbol("*GATHERING-FORWARD-INFERENCE-METRICS?*"), T);

    private static final SubLSymbol $sym351$_BROWSE_FORWARD_INFERENCES__ = makeSymbol("*BROWSE-FORWARD-INFERENCES?*");

    private static final SubLList $list352 = list(list(makeSymbol("FINALIZE-FORWARD-INFERENCE-METRICS-INFERENCE-INDEX")));

    private static final SubLList $list353 = list(list(makeSymbol("&KEY"), makeSymbol("THRESHOLD"), makeSymbol("BROWSABLE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list354 = list(makeKeyword("THRESHOLD"), makeKeyword("BROWSABLE?"));



    private static final SubLSymbol GATHERING_FORWARD_INFERENCE_METRICS = makeSymbol("GATHERING-FORWARD-INFERENCE-METRICS");

    private static final SubLSymbol SHOW_FORWARD_INFERENCE_METRICS = makeSymbol("SHOW-FORWARD-INFERENCE-METRICS");



    private static final SubLList $list359 = list(makeSymbol("CLEAR-FORWARD-INFERENCE-METRICS"));

    private static final SubLSymbol SHOW_FORWARD_INFERENCE_METRICS_OF = makeSymbol("SHOW-FORWARD-INFERENCE-METRICS-OF");

    private static final SubLSymbol $forward_inference_metrics_time_index$ = makeSymbol("*FORWARD-INFERENCE-METRICS-TIME-INDEX*");

    private static final SubLSymbol $forward_inference_metrics_count_index$ = makeSymbol("*FORWARD-INFERENCE-METRICS-COUNT-INDEX*");

    private static final SubLSymbol $forward_inference_metrics_inference_index$ = makeSymbol("*FORWARD-INFERENCE-METRICS-INFERENCE-INDEX*");

    private static final SubLSymbol VALID_INFERENCE_P = makeSymbol("VALID-INFERENCE-P");

    private static final SubLSymbol $forward_inference_metrics_gaf_index$ = makeSymbol("*FORWARD-INFERENCE-METRICS-GAF-INDEX*");

    private static final SubLSymbol $forward_inference_metrics_successful_rule_index$ = makeSymbol("*FORWARD-INFERENCE-METRICS-SUCCESSFUL-RULE-INDEX*");

    private static final SubLSymbol $sym367$_ = makeSymbol("+");



    private static final SubLString $str369$Unable_to_open__S = makeString("Unable to open ~S");





    private static final SubLSymbol GET_FORWARD_INFERENCE_METRIC_TYPE_AND_METRIC_LIST = makeSymbol("GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST");

    private static final SubLSymbol $get_forward_inference_metric_type_and_metric_list_caching_state$ = makeSymbol("*GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST-CACHING-STATE*");

    private static final SubLString $$$Forward_Inference_Metrics_Lock = makeString("Forward Inference Metrics Lock");

    private static final SubLString $str375$Negative_time___A_for___A__A___ = makeString("Negative time: ~A for (~A ~A)~%");





    private static final SubLSymbol $sym378$_ = makeSymbol(">");

    private static final SubLSymbol FORWARD_INFERENCE_TIME_METRIC_TOTAL_TIME_FROM_CDR = makeSymbol("FORWARD-INFERENCE-TIME-METRIC-TOTAL-TIME-FROM-CDR");

    private static final SubLList $list380 = cons(makeSymbol("RULE"), makeSymbol("TIME-PLIST"));

    private static final SubLSymbol $sym381$FORWARD_TMS_RULE_ = makeSymbol("FORWARD-TMS-RULE?");











    private static final SubLSymbol $SUCCESS_RULE_COUNT = makeKeyword("SUCCESS-RULE-COUNT");

    private static final SubLSymbol $SUCCESS_TRIGGER_COUNT = makeKeyword("SUCCESS-TRIGGER-COUNT");

    private static final SubLSymbol $SUCCESS_TIME_ESTIMATE = makeKeyword("SUCCESS-TIME-ESTIMATE");

    private static final SubLSymbol $TOTAL_RULE_COUNT = makeKeyword("TOTAL-RULE-COUNT");

    private static final SubLSymbol $TOTAL_TRIGGER_COUNT = makeKeyword("TOTAL-TRIGGER-COUNT");

    private static final SubLSymbol $TOTAL_INFERENCE_TIME = makeKeyword("TOTAL-INFERENCE-TIME");

    private static final SubLSymbol $SUCCESS_RULE_RATIO = makeKeyword("SUCCESS-RULE-RATIO");

    private static final SubLSymbol $SUCCESS_TRIGGER_RATIO = makeKeyword("SUCCESS-TRIGGER-RATIO");

    private static final SubLSymbol $SUCCESS_TIME_RATIO = makeKeyword("SUCCESS-TIME-RATIO");

    private static final SubLSymbol $SUCCESS_INFERENCE_TIME_RATIO = makeKeyword("SUCCESS-INFERENCE-TIME-RATIO");

    private static final SubLList $list397 = cons(makeSymbol("RULE"), makeSymbol("COUNT-PLIST"));

    private static final SubLSymbol DEDUCTION_ID = makeSymbol("DEDUCTION-ID");















    private static final SubLSymbol $AVERAGE_INFERENCES_PER_RULE = makeKeyword("AVERAGE-INFERENCES-PER-RULE");

    private static final SubLSymbol $STDEV_INFERENCES_PER_RULE = makeKeyword("STDEV-INFERENCES-PER-RULE");

    private static final SubLSymbol $AVERAGE_TRIGGER_PER_RULE = makeKeyword("AVERAGE-TRIGGER-PER-RULE");

    private static final SubLSymbol $STDEV_TRIGGER_PER_RULE = makeKeyword("STDEV-TRIGGER-PER-RULE");

    private static final SubLSymbol $AVERAGE_TIME_PER_RULE = makeKeyword("AVERAGE-TIME-PER-RULE");

    private static final SubLSymbol $STDEV_TIME_PER_RULE = makeKeyword("STDEV-TIME-PER-RULE");

    private static final SubLSymbol $AVERAGE_TIME_PER_INFERENCE = makeKeyword("AVERAGE-TIME-PER-INFERENCE");

    private static final SubLSymbol $STDEV_TIME_PER_INFERENCE = makeKeyword("STDEV-TIME-PER-INFERENCE");

    private static final SubLSymbol $AVERAGE_TIME_PER_TRIGGER = makeKeyword("AVERAGE-TIME-PER-TRIGGER");

    private static final SubLSymbol $STDEV_TIME_PER_TRIGGER = makeKeyword("STDEV-TIME-PER-TRIGGER");

    private static final SubLList $list416 = list(makeSymbol("&KEY"), makeSymbol("RULE"), makeSymbol("TIME"), makeSymbol("TRIGGER-GAFS"), makeSymbol("INFERENCE-COUNT"), makeSymbol("INFERENCES"));

    private static final SubLList $list417 = list(makeKeyword("RULE"), makeKeyword("TIME"), makeKeyword("TRIGGER-GAFS"), makeKeyword("INFERENCE-COUNT"), makeKeyword("INFERENCES"));

    private static final SubLString $str418$___6F____S____S__a__S = makeString("~%~6F : ~S : ~S  a ~S");

    private static final SubLString $str419$___S = makeString("~%~S");













    private static final SubLList $list426 = list(makeKeyword("SUCCESS-COUNT"), makeKeyword("TRIGGER-COUNT"), makeKeyword("SUCCESS-TIME"), makeKeyword("TIME"), makeKeyword("ID"));



    private static final SubLList $list428 = list(cons(makeKeyword("CSV"), makeString(", ")), cons(makeKeyword("TSV"), makeString("\t")));



    private static final SubLString $str430$__ = makeString("~&");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str432$_ = makeString("-");











    private static final SubLSymbol $EL_IST_FORMULA = makeKeyword("EL-IST-FORMULA");

    private static final SubLString $str439$__Total_inferences_______________ = makeString("~%Total inferences                   : ~6,' D");

    private static final SubLString $str440$___total_forward__data_directed__ = makeString("~% total forward (data directed)     : ~6,' D");

    private static final SubLString $str441$____successful_forward___________ = makeString("~%  successful forward               : ~6,' D");

    private static final SubLString $str442$___total_backward__query_directed = makeString("~% total backward (query directed)   : ~6,' D");

    private static final SubLString $str443$____successful_backward__________ = makeString("~%  successful backward              : ~6,' D");

    private static final SubLString $str444$___avg_relevant_problem_count____ = makeString("~% avg relevant problem count        : ~6,' D");

    private static final SubLString $str445$__Total_problem_stores___________ = makeString("~%Total problem stores               : ~6,' D");

    private static final SubLString $str446$___total_forward___data_directed_ = makeString("~% total forward  (data directed)    : ~6,' D");

    private static final SubLString $str447$___max_problem_store_problem_coun = makeString("~% max problem store problem count   : ~6,' D");

    private static final SubLString $str448$___avg_problem_store_problem_coun = makeString("~% avg problem store problem count   : ~6,' D");

    private static final SubLString $str449$___max_forward_problem_store_prob = makeString("~% max forward problem store problem count   : ~6,' D");

    private static final SubLString $str450$___avg_forward_problem_store_prob = makeString("~% avg forward problem store problem count   : ~6,' D");

    private static final SubLString $str451$__Total_problems_____________6___ = makeString("~%Total problems          : ~6,' D");

    private static final SubLString $str452$___total_good_problems_______6___ = makeString("~% total good problems    : ~6,' D");

    private static final SubLString $str453$___total_no_good_problems____6___ = makeString("~% total no-good problems : ~6,' D");

    private static final SubLString $str454$___total_forward_problems____6___ = makeString("~% total forward problems : ~6,' D");

    private static final SubLString $str455$___total_problem_reuses______6___ = makeString("~% total problem reuses   : ~6,' D");

    private static final SubLString $str456$____problem_reuse_ratio______6___ = makeString("~%  problem reuse ratio   : ~6,' D per problem");

    private static final SubLString $str457$__Total_problem_links________6___ = makeString("~%Total problem links     : ~6,' D");

    private static final SubLString $str458$___total_structural_links____6___ = makeString("~% total structural links : ~6,' D");

    private static final SubLString $str459$___total_content_links_______6___ = makeString("~% total content links    : ~6,' D");

    private static final SubLString $str460$____removal_links____________6___ = makeString("~%  removal links         : ~6,' D");

    private static final SubLString $str461$____transformation_links_____6___ = makeString("~%  transformation links  : ~6,' D");

    private static final SubLString $str462$__Total_tactics_______6___D = makeString("~%Total tactics    : ~6,' D");

    private static final SubLString $str463$___total_executed_____6___D = makeString("~% total executed  : ~6,' D");

    private static final SubLString $str464$___total_discarded____6___D = makeString("~% total discarded : ~6,' D");

    private static final SubLString $str465$__Total_SBHL_cache_calls______9__ = makeString("~%Total SBHL cache calls   : ~9,' D");

    private static final SubLString $str466$___successful_________________9__ = makeString("~% successful              : ~9,' D");

    private static final SubLString $str467$__Total_SBHL_graph_walks______9__ = makeString("~%Total SBHL graph walks   : ~9,' D");

    private static final SubLString $str468$__Total_unification_attempts____6 = makeString("~%Total unification attempts : ~6,' D");

    private static final SubLString $str469$___successful_unifications______6 = makeString("~% successful unifications   : ~6,' D");

    private static final SubLString $str470$__Total_proofs____6___D = makeString("~%Total proofs : ~6,' D");



    private static final SubLString $str472$___2___D___ = makeString(" (~2,' D %)");

    private static final SubLString $str473$___3___D___ = makeString(" (~3,' D %)");

    private static final SubLString $str474$___D___ = makeString(" (~D %)");

    public static SubLObject inference_metric_evaluation_arg1_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list0);
    }

    public static SubLObject inference_metric_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_inference_metric(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject inference_metric_p(final SubLObject v_object) {
        return v_object.getClass() == $inference_metric_native.class ? T : NIL;
    }

    public static SubLObject inf_metric_name(final SubLObject v_object) {
        assert NIL != inference_metric_p(v_object) : "inference_metrics.inference_metric_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject inf_metric_evaluation_func(final SubLObject v_object) {
        assert NIL != inference_metric_p(v_object) : "inference_metrics.inference_metric_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject inf_metric_evaluation_arg1(final SubLObject v_object) {
        assert NIL != inference_metric_p(v_object) : "inference_metrics.inference_metric_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject inf_metric_cross_productP(final SubLObject v_object) {
        assert NIL != inference_metric_p(v_object) : "inference_metrics.inference_metric_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_inf_metric_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_metric_p(v_object) : "inference_metrics.inference_metric_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_inf_metric_evaluation_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_metric_p(v_object) : "inference_metrics.inference_metric_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_inf_metric_evaluation_arg1(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_metric_p(v_object) : "inference_metrics.inference_metric_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_inf_metric_cross_productP(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_metric_p(v_object) : "inference_metrics.inference_metric_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_inference_metric(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $inference_metric_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_inf_metric_name(v_new, current_value);
            } else
                if (pcase_var.eql($EVALUATION_FUNC)) {
                    _csetf_inf_metric_evaluation_func(v_new, current_value);
                } else
                    if (pcase_var.eql($EVALUATION_ARG1)) {
                        _csetf_inf_metric_evaluation_arg1(v_new, current_value);
                    } else
                        if (pcase_var.eql($kw21$CROSS_PRODUCT_)) {
                            _csetf_inf_metric_cross_productP(v_new, current_value);
                        } else {
                            Errors.error($str22$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_inference_metric(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_INFERENCE_METRIC, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, inf_metric_name(obj));
        funcall(visitor_fn, obj, $SLOT, $EVALUATION_FUNC, inf_metric_evaluation_func(obj));
        funcall(visitor_fn, obj, $SLOT, $EVALUATION_ARG1, inf_metric_evaluation_arg1(obj));
        funcall(visitor_fn, obj, $SLOT, $kw21$CROSS_PRODUCT_, inf_metric_cross_productP(obj));
        funcall(visitor_fn, obj, $END, MAKE_INFERENCE_METRIC, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_inference_metric_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_inference_metric(obj, visitor_fn);
    }

    public static SubLObject print_inference_metric(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str28$_INFERENCE_METRIC___s_, inf_metric_name(v_object));
        return v_object;
    }

    public static SubLObject new_inference_metric(final SubLObject name, final SubLObject evaluation_func, final SubLObject evaluation_arg1, final SubLObject cross_productP) {
        assert NIL != keywordp(name) : "Types.keywordp(name) " + "CommonSymbols.NIL != Types.keywordp(name) " + name;
        assert NIL != symbolp(evaluation_func) : "Types.symbolp(evaluation_func) " + "CommonSymbols.NIL != Types.symbolp(evaluation_func) " + evaluation_func;
        assert NIL != inference_metric_evaluation_arg1_p(evaluation_arg1) : "inference_metrics.inference_metric_evaluation_arg1_p(evaluation_arg1) " + "CommonSymbols.NIL != inference_metrics.inference_metric_evaluation_arg1_p(evaluation_arg1) " + evaluation_arg1;
        assert NIL != booleanp(cross_productP) : "Types.booleanp(cross_productP) " + "CommonSymbols.NIL != Types.booleanp(cross_productP) " + cross_productP;
        final SubLObject metric = make_inference_metric(UNPROVIDED);
        _csetf_inf_metric_name(metric, name);
        _csetf_inf_metric_evaluation_func(metric, evaluation_func);
        _csetf_inf_metric_evaluation_arg1(metric, evaluation_arg1);
        _csetf_inf_metric_cross_productP(metric, cross_productP);
        return metric;
    }

    public static SubLObject inference_metric_name(final SubLObject metric) {
        assert NIL != inference_metric_p(metric) : "inference_metrics.inference_metric_p(metric) " + "CommonSymbols.NIL != inference_metrics.inference_metric_p(metric) " + metric;
        return inf_metric_name(metric);
    }

    public static SubLObject inference_metric_evaluation_func(final SubLObject metric) {
        assert NIL != inference_metric_p(metric) : "inference_metrics.inference_metric_p(metric) " + "CommonSymbols.NIL != inference_metrics.inference_metric_p(metric) " + metric;
        return inf_metric_evaluation_func(metric);
    }

    public static SubLObject inference_metric_evaluation_arg1(final SubLObject metric) {
        assert NIL != inference_metric_p(metric) : "inference_metrics.inference_metric_p(metric) " + "CommonSymbols.NIL != inference_metrics.inference_metric_p(metric) " + metric;
        return inf_metric_evaluation_arg1(metric);
    }

    public static SubLObject inference_metric_cross_productP(final SubLObject metric) {
        assert NIL != inference_metric_p(metric) : "inference_metrics.inference_metric_p(metric) " + "CommonSymbols.NIL != inference_metrics.inference_metric_p(metric) " + metric;
        return inf_metric_cross_productP(metric);
    }

    public static SubLObject inference_metric_evaluate(final SubLObject metric, final SubLObject inference, final SubLObject store) {
        assert NIL != inference_metric_p(metric) : "inference_metrics.inference_metric_p(metric) " + "CommonSymbols.NIL != inference_metrics.inference_metric_p(metric) " + metric;
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) " + store;
        final SubLObject func = inference_metric_evaluation_func(metric);
        final SubLObject pcase_var = inference_metric_evaluation_arg1(metric);
        if (pcase_var.eql($STORE)) {
            return funcall(func, store);
        }
        if (pcase_var.eql($INFERENCE)) {
            return funcall(func, inference);
        }
        return Errors.error($str37$Unhandled_inference_metric_evalua, inference_metric_evaluation_arg1(metric));
    }

    public static SubLObject inference_metric_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_metric_properties$.getGlobalValue());
    }

    public static SubLObject declare_inference_metric(final SubLObject name, final SubLObject evaluation_func, final SubLObject evaluation_arg1, SubLObject cross_productP) {
        if (cross_productP == UNPROVIDED) {
            cross_productP = NIL;
        }
        final SubLObject metric = new_inference_metric(name, evaluation_func, evaluation_arg1, cross_productP);
        dictionary.dictionary_enter($inference_metrics_store$.getGlobalValue(), name, metric);
        return metric;
    }

    public static SubLObject inference_metric_lookup(final SubLObject name) {
        return dictionary.dictionary_lookup_without_values($inference_metrics_store$.getGlobalValue(), name, UNPROVIDED);
    }

    public static SubLObject inference_metric_nameP(final SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (NIL != list_utilities.sublisp_boolean(inference_metric_lookup(v_object))));
    }

    public static SubLObject inference_metric_names() {
        return dictionary.dictionary_keys($inference_metrics_store$.getGlobalValue());
    }

    public static SubLObject problem_store_historical_count() {
        return $problem_store_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_problem_store_historical_count() {
        $problem_store_historical_count$.setGlobalValue(add($problem_store_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $problem_store_historical_count$.getGlobalValue();
    }

    public static SubLObject forward_problem_store_historical_count() {
        return $forward_problem_store_historical_count$.getGlobalValue();
    }

    public static SubLObject backward_problem_store_historical_count() {
        return subtract(problem_store_historical_count(), forward_problem_store_historical_count());
    }

    public static SubLObject increment_forward_problem_store_historical_count() {
        $forward_problem_store_historical_count$.setGlobalValue(add($forward_problem_store_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $forward_problem_store_historical_count$.getGlobalValue();
    }

    public static SubLObject maximum_problem_store_historical_problem_count() {
        return $maximum_problem_store_historical_problem_count$.getGlobalValue();
    }

    public static SubLObject update_maximum_problem_store_historical_problem_count(final SubLObject problem_store) {
        final SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count(problem_store);
        $maximum_problem_store_historical_problem_count$.setGlobalValue(max($maximum_problem_store_historical_problem_count$.getGlobalValue(), count));
        return $maximum_problem_store_historical_problem_count$.getGlobalValue();
    }

    public static SubLObject average_problem_store_historical_problem_count() {
        final SubLObject store_count = problem_store_historical_count();
        return store_count.isZero() ? ZERO_INTEGER : divide(problem_historical_count(), store_count);
    }

    public static SubLObject maximum_forward_problem_store_historical_problem_count() {
        return $maximum_forward_problem_store_historical_problem_count$.getGlobalValue();
    }

    public static SubLObject update_maximum_forward_problem_store_historical_problem_count(final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count(problem_store);
        if ((NIL != $inference_debugP$.getDynamicValue(thread)) && count.numGE($expensive_forward_problem_store_threshold$.getDynamicValue(thread))) {
            Errors.warn($str289$Forward__S_contained__S_problems, problem_store, count);
        }
        $maximum_forward_problem_store_historical_problem_count$.setGlobalValue(max($maximum_forward_problem_store_historical_problem_count$.getGlobalValue(), count));
        return $maximum_forward_problem_store_historical_problem_count$.getGlobalValue();
    }

    public static SubLObject average_forward_problem_store_historical_problem_count() {
        final SubLObject store_count = forward_problem_store_historical_count();
        return store_count.isZero() ? ZERO_INTEGER : divide(forward_problem_historical_count(), store_count);
    }

    public static SubLObject increment_problem_historical_count() {
        $problem_historical_count$.setGlobalValue(add($problem_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $problem_historical_count$.getGlobalValue();
    }

    public static SubLObject problem_historical_count() {
        return $problem_historical_count$.getGlobalValue();
    }

    public static SubLObject good_problem_historical_count() {
        return $good_problem_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_good_problem_historical_count() {
        $good_problem_historical_count$.setGlobalValue(add($good_problem_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $good_problem_historical_count$.getGlobalValue();
    }

    public static SubLObject decrement_good_problem_historical_count() {
        $good_problem_historical_count$.setGlobalValue(subtract($good_problem_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $good_problem_historical_count$.getGlobalValue();
    }

    public static SubLObject no_good_problem_historical_count() {
        return $no_good_problem_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_no_good_problem_historical_count() {
        $no_good_problem_historical_count$.setGlobalValue(add($no_good_problem_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $no_good_problem_historical_count$.getGlobalValue();
    }

    public static SubLObject forward_problem_historical_count() {
        return $forward_problem_historical_count$.getGlobalValue();
    }

    public static SubLObject update_forward_problem_historical_count(final SubLObject problem_store) {
        final SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count(problem_store);
        $forward_problem_historical_count$.setGlobalValue(add($forward_problem_historical_count$.getGlobalValue(), count));
        return $forward_problem_historical_count$.getGlobalValue();
    }

    public static SubLObject single_literal_problem_historical_count() {
        return $single_literal_problem_historical_count$.getGlobalValue();
    }

    public static SubLObject multi_literal_problem_historical_count() {
        return subtract(problem_historical_count(), single_literal_problem_historical_count());
    }

    public static SubLObject increment_single_literal_problem_historical_count() {
        $single_literal_problem_historical_count$.setGlobalValue(add($single_literal_problem_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $single_literal_problem_historical_count$.getGlobalValue();
    }

    public static SubLObject problem_link_historical_count() {
        return $problem_link_historical_count$.getGlobalValue();
    }

    public static SubLObject structural_link_historical_count() {
        return $structural_link_historical_count$.getGlobalValue();
    }

    public static SubLObject content_link_historical_count() {
        return $content_link_historical_count$.getGlobalValue();
    }

    public static SubLObject removal_link_historical_count() {
        return $removal_link_historical_count$.getGlobalValue();
    }

    public static SubLObject transformation_link_historical_count() {
        return $transformation_link_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_problem_link_type_historical_counts(final SubLObject link_type) {
        if (link_type.eql($REMOVAL)) {
            $removal_link_historical_count$.setGlobalValue(add($removal_link_historical_count$.getGlobalValue(), ONE_INTEGER));
            $content_link_historical_count$.setGlobalValue(add($content_link_historical_count$.getGlobalValue(), ONE_INTEGER));
        } else
            if (link_type.eql($TRANSFORMATION)) {
                $transformation_link_historical_count$.setGlobalValue(add($transformation_link_historical_count$.getGlobalValue(), ONE_INTEGER));
                $content_link_historical_count$.setGlobalValue(add($content_link_historical_count$.getGlobalValue(), ONE_INTEGER));
            } else
                if (link_type.eql($REWRITE)) {
                    $content_link_historical_count$.setGlobalValue(add($content_link_historical_count$.getGlobalValue(), ONE_INTEGER));
                } else {
                    $structural_link_historical_count$.setGlobalValue(add($structural_link_historical_count$.getGlobalValue(), ONE_INTEGER));
                }


        $problem_link_historical_count$.setGlobalValue(add($problem_link_historical_count$.getGlobalValue(), ONE_INTEGER));
        return NIL;
    }

    public static SubLObject dependent_link_historical_count() {
        return $dependent_link_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_dependent_link_historical_count() {
        $dependent_link_historical_count$.setGlobalValue(add($dependent_link_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $dependent_link_historical_count$.getGlobalValue();
    }

    public static SubLObject single_literal_problem_dependent_link_historical_count() {
        return $single_literal_problem_dependent_link_historical_count$.getGlobalValue();
    }

    public static SubLObject multi_literal_problem_dependent_link_historical_count() {
        return subtract(dependent_link_historical_count(), single_literal_problem_dependent_link_historical_count());
    }

    public static SubLObject increment_single_literal_problem_dependent_link_historical_count() {
        $single_literal_problem_dependent_link_historical_count$.setGlobalValue(add($single_literal_problem_dependent_link_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $single_literal_problem_dependent_link_historical_count$.getGlobalValue();
    }

    public static SubLObject problem_reuses_historical_count() {
        return subtract(dependent_link_historical_count(), problem_historical_count());
    }

    public static SubLObject problem_reuse_historical_ratio() {
        final SubLObject problem_count = problem_historical_count();
        return problem_count.isZero() ? ZERO_INTEGER : divide(problem_reuses_historical_count(), problem_count);
    }

    public static SubLObject single_literal_problem_reuses_historical_count() {
        return subtract(single_literal_problem_dependent_link_historical_count(), single_literal_problem_historical_count());
    }

    public static SubLObject single_literal_problem_reuse_historical_ratio() {
        final SubLObject problem_count = single_literal_problem_historical_count();
        return problem_count.isZero() ? ZERO_INTEGER : divide(single_literal_problem_reuses_historical_count(), problem_count);
    }

    public static SubLObject multi_literal_problem_reuses_historical_count() {
        return subtract(multi_literal_problem_dependent_link_historical_count(), multi_literal_problem_historical_count());
    }

    public static SubLObject multi_literal_problem_reuse_historical_ratio() {
        final SubLObject problem_count = multi_literal_problem_historical_count();
        return problem_count.isZero() ? ZERO_INTEGER : divide(multi_literal_problem_reuses_historical_count(), problem_count);
    }

    public static SubLObject tactic_historical_count() {
        return $tactic_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_tactic_historical_count() {
        $tactic_historical_count$.setGlobalValue(add($tactic_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $tactic_historical_count$.getGlobalValue();
    }

    public static SubLObject executed_tactic_historical_count() {
        return $executed_tactic_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_executed_tactic_historical_count() {
        $executed_tactic_historical_count$.setGlobalValue(add($executed_tactic_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $executed_tactic_historical_count$.getGlobalValue();
    }

    public static SubLObject discarded_tactic_historical_count() {
        return $discarded_tactic_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_discarded_tactic_historical_count() {
        $discarded_tactic_historical_count$.setGlobalValue(add($discarded_tactic_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $discarded_tactic_historical_count$.getGlobalValue();
    }

    public static SubLObject unification_attempt_historical_count() {
        return $unification_attempt_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_unification_attempt_historical_count() {
        $unification_attempt_historical_count$.setGlobalValue(add($unification_attempt_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $unification_attempt_historical_count$.getGlobalValue();
    }

    public static SubLObject unification_success_historical_count() {
        return $unification_success_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_unification_success_historical_count() {
        $unification_success_historical_count$.setGlobalValue(add($unification_success_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $unification_success_historical_count$.getGlobalValue();
    }

    public static SubLObject sbhl_cache_attempt_historical_count() {
        return $sbhl_cache_attempt_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_sbhl_cache_attempt_historical_count() {
        $sbhl_cache_attempt_historical_count$.setGlobalValue(add($sbhl_cache_attempt_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $sbhl_cache_attempt_historical_count$.getGlobalValue();
    }

    public static SubLObject sbhl_cache_success_historical_count() {
        return $sbhl_cache_success_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_sbhl_cache_success_historical_count() {
        $sbhl_cache_success_historical_count$.setGlobalValue(add($sbhl_cache_success_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $sbhl_cache_success_historical_count$.getGlobalValue();
    }

    public static SubLObject sbhl_graph_attempt_historical_count() {
        return $sbhl_graph_attempt_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_sbhl_graph_attempt_historical_count() {
        $sbhl_graph_attempt_historical_count$.setGlobalValue(add($sbhl_graph_attempt_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $sbhl_graph_attempt_historical_count$.getGlobalValue();
    }

    public static SubLObject sbhl_graph_success_historical_count() {
        return $sbhl_graph_success_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_sbhl_graph_success_historical_count() {
        $sbhl_graph_success_historical_count$.setGlobalValue(add($sbhl_graph_success_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $sbhl_graph_success_historical_count$.getGlobalValue();
    }

    public static SubLObject sbhl_link_historical_count() {
        return $sbhl_link_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_sbhl_link_historical_count() {
        $sbhl_link_historical_count$.setGlobalValue(add($sbhl_link_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $sbhl_link_historical_count$.getGlobalValue();
    }

    public static SubLObject proof_historical_count() {
        return $proof_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_proof_historical_count() {
        $proof_historical_count$.setGlobalValue(add($proof_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $proof_historical_count$.getGlobalValue();
    }

    public static SubLObject inference_historical_count() {
        return $inference_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_inference_historical_count() {
        $inference_historical_count$.setGlobalValue(add($inference_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $inference_historical_count$.getGlobalValue();
    }

    public static SubLObject successful_inference_historical_count() {
        return $successful_inference_historical_count$.getGlobalValue();
    }

    public static SubLObject increment_successful_inference_historical_count() {
        $successful_inference_historical_count$.setGlobalValue(add($successful_inference_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $successful_inference_historical_count$.getGlobalValue();
    }

    public static SubLObject forward_inference_historical_count() {
        return $forward_inference_historical_count$.getGlobalValue();
    }

    public static SubLObject backward_inference_historical_count() {
        return subtract(inference_historical_count(), forward_inference_historical_count());
    }

    public static SubLObject increment_forward_inference_historical_count() {
        $forward_inference_historical_count$.setGlobalValue(add($forward_inference_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $forward_inference_historical_count$.getGlobalValue();
    }

    public static SubLObject successful_forward_inference_historical_count() {
        return $successful_forward_inference_historical_count$.getGlobalValue();
    }

    public static SubLObject successful_backward_inference_historical_count() {
        return subtract(successful_inference_historical_count(), successful_forward_inference_historical_count());
    }

    public static SubLObject increment_successful_forward_inference_historical_count() {
        $successful_forward_inference_historical_count$.setGlobalValue(add($successful_forward_inference_historical_count$.getGlobalValue(), ONE_INTEGER));
        return $successful_forward_inference_historical_count$.getGlobalValue();
    }

    public static SubLObject average_historical_inference_relevant_problem_count() {
        final SubLObject inference_count = inference_historical_count();
        return inference_count.isZero() ? ZERO_INTEGER : divide(problem_historical_count(), inference_count);
    }

    public static SubLObject sksi_query_total_time_accumulator_lookup(final SubLObject inference) {
        return inference_datastructures_inference.inference_accumulator_contents(inference, $SKSI_QUERY_TOTAL_TIME_ACC);
    }

    public static SubLObject sksi_query_start_times_accumulator_lookup(final SubLObject inference) {
        return inference_datastructures_inference.inference_accumulator_contents(inference, $SKSI_QUERY_START_TIMES_ACC);
    }

    public static SubLObject sparql_query_profile_accumulator_lookup(final SubLObject inference) {
        return inference_datastructures_inference.inference_accumulator_contents(inference, $SPARQL_QUERY_PROFILE_ACC);
    }

    public static SubLObject inference_tick_indexed_progress_data_memoized_internal(final SubLObject inference) {
        return make_hash_table($int$128, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_tick_indexed_progress_data_memoized(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_tick_indexed_progress_data_memoized_internal(inference);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_TICK_INDEXED_PROGRESS_DATA_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_TICK_INDEXED_PROGRESS_DATA_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_TICK_INDEXED_PROGRESS_DATA_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, inference, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_tick_indexed_progress_data_memoized_internal(inference)));
            memoization_state.caching_state_put(caching_state, inference, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject inference_possibly_update_tick_indexed_progress_data(final SubLObject inference) {
        if (NIL != inference_should_gather_tick_indexed_progress_dataP(inference)) {
            final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            final SubLObject tick_indexed_progress_data = inference_tick_indexed_progress_data(inference);
            final SubLObject step_count = inference_datastructures_inference.inference_cumulative_step_count(inference);
            final SubLObject problem_count = inference_datastructures_problem_store.problem_store_historical_problem_count(inference_datastructures_inference.inference_problem_store(inference));
            final SubLObject tick_count = add(MINUS_ONE_INTEGER, step_count, problem_count);
            final SubLObject data_list = list(new SubLObject[]{ $TICK_COUNT, tick_count, $PROBLEM_COUNT, problem_count, $STEP_COUNT, step_count, $ASSERTION_TOUCH_COUNT, arete.arete_assertions_touched_count(), $TERM_TOUCH_COUNT, arete.arete_terms_touched_count(), $LAST_ASSERTION_TOUCHED, arete.arete_last_assertion_touched(), $LAST_TERM_TOUCHED, arete.arete_last_term_touched(), $PROBLEM, problem_store_visualization.problem_store_most_recent_problem(store) });
            sethash(tick_count, tick_indexed_progress_data, data_list);
            if (NIL == gethash(ONE_INTEGER, tick_indexed_progress_data, UNPROVIDED)) {
                final SubLObject initial_tick_data_list = list(new SubLObject[]{ $TICK_COUNT, ONE_INTEGER, $PROBLEM_COUNT, ONE_INTEGER, $STEP_COUNT, ONE_INTEGER, $ASSERTION_TOUCH_COUNT, ZERO_INTEGER, $TERM_TOUCH_COUNT, ZERO_INTEGER, $LAST_ASSERTION_TOUCHED, NIL, $LAST_TERM_TOUCHED, NIL, $PROBLEM, inference_datastructures_inference.inference_root_problem(inference) });
                sethash(ONE_INTEGER, tick_indexed_progress_data, initial_tick_data_list);
            }
        }
        return NIL;
    }

    public static SubLObject inference_has_tick_indexed_progress_dataP(final SubLObject inference) {
        return makeBoolean((NIL != inference_datastructures_inference.valid_inference_p(inference)) && hash_table_count(inference_tick_indexed_progress_data(inference)).isPositive());
    }

    public static SubLObject inference_should_gather_tick_indexed_progress_dataP(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != inference_datastructures_inference.valid_inference_p(inference)) && ((NIL != $force_inference_tick_indexed_progress_data_collectionP$.getDynamicValue(thread)) || (NIL != inference_datastructures_inference.inference_computes_metricP(inference, $TICK_INDEXED_PROGRESS_DATA))));
    }

    public static SubLObject inference_tick_indexed_progress_data(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_inference.inference_problem_store(inference));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = inference_tick_indexed_progress_data_memoized(inference);
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject inference_tick_indexed_progress_data_one_step(final SubLObject inference, final SubLObject tick_number, final SubLObject step_number, final SubLObject problem_number) {
        final SubLObject progress_data = inference_tick_indexed_progress_data(inference);
        if (NIL != tick_number) {
            return gethash(tick_number, progress_data, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inference_tick_count(final SubLObject inference) {
        final SubLObject step_count = inference_datastructures_inference.inference_cumulative_step_count(inference);
        final SubLObject problem_count = inference_datastructures_problem_store.problem_store_historical_problem_count(inference_datastructures_inference.inference_problem_store(inference));
        final SubLObject tick_count = add(MINUS_ONE_INTEGER, step_count, problem_count);
        return tick_count;
    }

    public static SubLObject inference_hl_module_times(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_inference.inference_problem_store(inference));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = inference_hl_module_times_memoized(inference);
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject inference_hl_module_times_memoized_internal(final SubLObject inference) {
        return make_hash_table($int$128, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_hl_module_times_memoized(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_hl_module_times_memoized_internal(inference);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_HL_MODULE_TIMES_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_HL_MODULE_TIMES_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_HL_MODULE_TIMES_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, inference, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_hl_module_times_memoized_internal(inference)));
            memoization_state.caching_state_put(caching_state, inference, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject inference_update_hl_module_time(final SubLObject inference, final SubLObject hl_module, final SubLObject time) {
        return hash_table_utilities.push_hash(hl_module, time, inference_hl_module_times(inference));
    }

    public static SubLObject possibly_update_hl_module_times(final SubLObject time) {
        if (NIL != any_inference_gathers_hl_module_timesP(UNPROVIDED)) {
            hash_table_utilities.push_hash(inference_worker.currently_executing_hl_module(), time, inference_hl_module_times(inference_macros.current_controlling_inference()));
            SubLObject cdolist_list_var = inference_macros.current_controlling_inferences().rest();
            SubLObject inference = NIL;
            inference = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                hash_table_utilities.push_hash(inference_datastructures_tactic.tactic_hl_module(inference_worker.currently_executing_tactic()), time, inference_hl_module_times(inference));
                cdolist_list_var = cdolist_list_var.rest();
                inference = cdolist_list_var.first();
            } 
            if (NIL != list_utilities.same_length_p(inference_macros.current_controlling_inferences(), inference_worker.currently_executing_tactics())) {
                SubLObject inference2 = NIL;
                SubLObject inference_$3 = NIL;
                SubLObject tactic = NIL;
                SubLObject tactic_$4 = NIL;
                inference2 = inference_macros.current_controlling_inferences().rest();
                inference_$3 = inference2.first();
                tactic = inference_worker.currently_executing_tactics().rest();
                tactic_$4 = tactic.first();
                while ((NIL != tactic) || (NIL != inference2)) {
                    hash_table_utilities.push_hash(inference_datastructures_tactic.tactic_hl_module(tactic_$4), subtract(ZERO_INTEGER, time), inference_hl_module_times(inference_$3));
                    inference2 = inference2.rest();
                    inference_$3 = inference2.first();
                    tactic = tactic.rest();
                    tactic_$4 = tactic.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject inference_gathers_hl_module_timesP(SubLObject inference) {
        if (inference == UNPROVIDED) {
            inference = inference_macros.current_controlling_inference();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != inference_datastructures_inference.valid_inference_p(inference)) && ((NIL != $force_inference_hl_module_times_data_collectionP$.getDynamicValue(thread)) || (NIL != inference_datastructures_inference.inference_computes_metricP(inference, $INFERENCE_HL_MODULE_TIMES))));
    }

    public static SubLObject any_inference_gathers_hl_module_timesP(SubLObject inferences) {
        if (inferences == UNPROVIDED) {
            inferences = inference_macros.current_controlling_inferences();
        }
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var;
            SubLObject inference;
            for (csome_list_var = inferences, inference = NIL, inference = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = inference_gathers_hl_module_timesP(inference) , csome_list_var = csome_list_var.rest() , inference = csome_list_var.first()) {
            }
        }
        return result;
    }

    public static SubLObject problem_store_rule_binding_value_map(final SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) " + store;
        final SubLObject tuples = problem_store_rule_bindings_tuples(store);
        final SubLObject value_map = rule_binding_value_map_from_rule_binding_tuples(tuples);
        return value_map;
    }

    public static SubLObject rule_binding_value_map_from_rule_binding_tuples(final SubLObject tuples) {
        final SubLObject rule_map = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = tuples;
        SubLObject binding_tuple = NIL;
        binding_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding_tuple;
            SubLObject rule = NIL;
            SubLObject v_bindings = NIL;
            destructuring_bind_must_consp(current, datum, $list333);
            rule = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list333);
            v_bindings = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject hl_variables = kb_utilities.sort_terms(assertions_high.assertion_hl_variables(rule), T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject value_tuple = bindings.napply_bindings(v_bindings, hl_variables);
                value_tuple = list_utilities.nmapcar(symbol_function(POSSIBLY_GENERICIZE_INDETERMINATE_TERM), value_tuple);
                dictionary_utilities.dictionary_push(rule_map, rule, value_tuple);
            } else {
                cdestructuring_bind_error(datum, $list333);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding_tuple = cdolist_list_var.first();
        } 
        return rule_map;
    }

    public static SubLObject possibly_genericize_indeterminate_term(SubLObject v_term) {
        if (NIL != kb_accessors.indeterminate_termP(v_term)) {
            v_term = defns.genericize_term_wrt_types(v_term, $$EverythingPSC);
        }
        return v_term;
    }

    public static SubLObject problem_store_rule_binding_type_map(final SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) " + store;
        final SubLObject tuples = problem_store_rule_bindings_tuples(store);
        final SubLObject type_map = rule_binding_type_map_from_rule_binding_tuples(tuples);
        return type_map;
    }

    public static SubLObject problem_store_rule_bindings_tuples(final SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) " + store;
        SubLObject rule_bindings_tuples = NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_proof_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$5 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$5, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$5);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject proof;
                SubLObject rule;
                SubLObject v_bindings;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    proof = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(proof)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(proof)) {
                            proof = $SKIP;
                        }
                        if (NIL != inference_worker_transformation.generalized_transformation_proof_p(proof)) {
                            rule = inference_worker_transformation.generalized_transformation_proof_rule_assertion(proof);
                            v_bindings = inference_worker_transformation.generalized_transformation_proof_rule_bindings(proof);
                            v_bindings = unification.base_variable_transform(v_bindings);
                            rule_bindings_tuples = cons(list(rule, v_bindings), rule_bindings_tuples);
                        }
                    }
                }
            }
            final SubLObject idx_$6 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$6)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$6);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$6);
                final SubLObject end_id = id_index_next_id(idx_$6);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    final SubLObject proof2 = gethash_without_values(id2, sparse, v_default);
                    if (((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(proof2))) && (NIL != inference_worker_transformation.generalized_transformation_proof_p(proof2))) {
                        final SubLObject rule2 = inference_worker_transformation.generalized_transformation_proof_rule_assertion(proof2);
                        SubLObject v_bindings2 = inference_worker_transformation.generalized_transformation_proof_rule_bindings(proof2);
                        v_bindings2 = unification.base_variable_transform(v_bindings2);
                        rule_bindings_tuples = cons(list(rule2, v_bindings2), rule_bindings_tuples);
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        return nreverse(rule_bindings_tuples);
    }

    public static SubLObject rule_binding_type_map_from_rule_binding_tuples(final SubLObject tuples) {
        final SubLObject rule_map = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = tuples;
        SubLObject binding_tuple = NIL;
        binding_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding_tuple;
            SubLObject rule = NIL;
            SubLObject v_bindings = NIL;
            destructuring_bind_must_consp(current, datum, $list333);
            rule = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list333);
            v_bindings = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject var_map = map_utilities.map_get(rule_map, rule, NIL);
                if (NIL == var_map) {
                    var_map = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                    map_utilities.map_put(rule_map, rule, var_map);
                }
                SubLObject cdolist_list_var_$7 = v_bindings;
                SubLObject binding = NIL;
                binding = cdolist_list_var_$7.first();
                while (NIL != cdolist_list_var_$7) {
                    final SubLObject var = bindings.variable_binding_variable(binding);
                    final SubLObject value = bindings.variable_binding_value(binding);
                    SubLObject cdolist_list_var_$8;
                    final SubLObject types = cdolist_list_var_$8 = defns.min_generalizations(value, $$EverythingPSC);
                    SubLObject type = NIL;
                    type = cdolist_list_var_$8.first();
                    while (NIL != cdolist_list_var_$8) {
                        map_utilities.map_push(var_map, var, type);
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        type = cdolist_list_var_$8.first();
                    } 
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    binding = cdolist_list_var_$7.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list333);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding_tuple = cdolist_list_var.first();
        } 
        return rule_map;
    }

    public static SubLObject show_rule_binding_type_map(final SubLObject type_map, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != map_utilities.map_p(type_map) : "map_utilities.map_p(type_map) " + "CommonSymbols.NIL != map_utilities.map_p(type_map) " + type_map;
        final SubLObject iterator = map_utilities.new_map_iterator(type_map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject rule = NIL;
                SubLObject variable_map = NIL;
                destructuring_bind_must_consp(current, datum, $list338);
                rule = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list338);
                variable_map = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject _prev_bind_0 = $variable_names$.currentBinding(thread);
                    try {
                        $variable_names$.bind(assertions_high.assertion_variable_names(rule), thread);
                        format(stream, $str339$____Rule_);
                        format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_ist_formula(rule), UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var;
                        final SubLObject v_variables = cdolist_list_var = Sort.sort(copy_list(map_utilities.map_keys(variable_map)), symbol_function($sym340$_), symbol_function(VARIABLE_ID));
                        SubLObject var_$9 = NIL;
                        var_$9 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            format(stream, $str342$___S__, var_$9);
                            SubLObject types = map_utilities.map_get(variable_map, var_$9, UNPROVIDED);
                            SubLObject cdolist_list_var_$10;
                            types = cdolist_list_var_$10 = cardinality_estimates.sort_by_generality_estimate(copy_list(types), $ASCENDING);
                            SubLObject type = NIL;
                            type = cdolist_list_var_$10.first();
                            while (NIL != cdolist_list_var_$10) {
                                format(stream, $str344$_____S, type);
                                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                                type = cdolist_list_var_$10.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            var_$9 = cdolist_list_var.first();
                        } 
                    } finally {
                        $variable_names$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list338);
                }
            }
        }
        force_output(stream);
        return type_map;
    }

    public static SubLObject gathering_forward_inference_metrics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list345);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list345);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list345);
            if (NIL == member(current_$11, $list346, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list345);
        }
        final SubLObject browsableP_tail = property_list_member($BROWSABLE_, current);
        final SubLObject browsableP = (NIL != browsableP_tail) ? cadr(browsableP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CLET, list($list350, list($sym351$_BROWSE_FORWARD_INFERENCES__, browsableP)), append(body, $list352));
    }

    public static SubLObject show_forward_inference_metrics_of(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list353);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list353);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list353);
            if (NIL == member(current_$12, $list354, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list353);
        }
        final SubLObject threshold_tail = property_list_member($THRESHOLD, current);
        final SubLObject threshold = (NIL != threshold_tail) ? cadr(threshold_tail) : NIL;
        final SubLObject browsableP_tail = property_list_member($BROWSABLE_, current);
        final SubLObject browsableP = (NIL != browsableP_tail) ? cadr(browsableP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(GATHERING_FORWARD_INFERENCE_METRICS, list($BROWSABLE_, browsableP), append(body, list(list(SHOW_FORWARD_INFERENCE_METRICS, threshold))));
    }

    public static SubLObject show_new_forward_inference_metrics_of(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list353);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$13 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list353);
            current_$13 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list353);
            if (NIL == member(current_$13, $list354, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$13 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list353);
        }
        final SubLObject threshold_tail = property_list_member($THRESHOLD, current);
        final SubLObject threshold = (NIL != threshold_tail) ? cadr(threshold_tail) : NIL;
        final SubLObject browsableP_tail = property_list_member($BROWSABLE_, current);
        final SubLObject browsableP = (NIL != browsableP_tail) ? cadr(browsableP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PROGN, $list359, listS(SHOW_FORWARD_INFERENCE_METRICS_OF, list($THRESHOLD, threshold, $BROWSABLE_, browsableP), append(body, NIL)));
    }

    public static SubLObject forward_inference_metrics_time_index() {
        return $forward_inference_metrics_time_index$.getGlobalValue();
    }

    public static SubLObject forward_inference_metrics_count_index() {
        return $forward_inference_metrics_count_index$.getGlobalValue();
    }

    public static SubLObject forward_inference_metrics_inference_index() {
        return $forward_inference_metrics_inference_index$.getGlobalValue();
    }

    public static SubLObject finalize_forward_inference_metrics_inference_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index = forward_inference_metrics_inference_index();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject inferences = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject valid_inferences = list_utilities.remove_if_not(VALID_INFERENCE_P, inferences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            dictionary.dictionary_enter(index, rule, valid_inferences);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return index;
    }

    public static SubLObject forward_inference_metrics_gaf_index() {
        return $forward_inference_metrics_gaf_index$.getGlobalValue();
    }

    public static SubLObject forward_inference_time_metric_total_time(final SubLObject time_plist) {
        return apply($sym367$_, list_utilities.plist_values(time_plist));
    }

    public static SubLObject forward_inference_metrics_successful_rule_index() {
        return $forward_inference_metrics_successful_rule_index$.getGlobalValue();
    }

    public static SubLObject clear_forward_inference_metrics() {
        dictionary.clear_dictionary(forward_inference_metrics_time_index());
        dictionary.clear_dictionary(forward_inference_metrics_count_index());
        dictionary.clear_dictionary(forward_inference_metrics_inference_index());
        dictionary.clear_dictionary(forward_inference_metrics_gaf_index());
        return NIL;
    }

    public static SubLObject save_forward_inference_metrics(final SubLObject filename, SubLObject externalizedP) {
        if (externalizedP == UNPROVIDED) {
            externalizedP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str369$Unable_to_open__S, filename);
            }
            final SubLObject stream_$14 = stream;
            dumper.dump_copyright(stream_$14);
            cfasl_output_maybe_externalized($forward_inference_metrics_time_index$.getGlobalValue(), stream_$14, externalizedP);
            cfasl_output_maybe_externalized($forward_inference_metrics_count_index$.getGlobalValue(), stream_$14, externalizedP);
            cfasl_output_maybe_externalized($forward_inference_metrics_inference_index$.getGlobalValue(), stream_$14, externalizedP);
            cfasl_output_maybe_externalized($forward_inference_metrics_gaf_index$.getGlobalValue(), stream_$14, externalizedP);
            cfasl_output_maybe_externalized($forward_inference_metrics_successful_rule_index$.getGlobalValue(), stream_$14, externalizedP);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    public static SubLObject load_forward_inference_metrics(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str369$Unable_to_open__S, filename);
            }
            final SubLObject stream_$15 = stream;
            dumper.load_copyright(stream_$15);
            $forward_inference_metrics_time_index$.setGlobalValue(cfasl_input(stream_$15, UNPROVIDED, UNPROVIDED));
            $forward_inference_metrics_count_index$.setGlobalValue(cfasl_input(stream_$15, UNPROVIDED, UNPROVIDED));
            $forward_inference_metrics_inference_index$.setGlobalValue(cfasl_input(stream_$15, UNPROVIDED, UNPROVIDED));
            $forward_inference_metrics_gaf_index$.setGlobalValue(cfasl_input(stream_$15, UNPROVIDED, UNPROVIDED));
            if ($EOF != cfasl_opcode_peek(stream_$15, NIL, $EOF)) {
                $forward_inference_metrics_successful_rule_index$.setGlobalValue(cfasl_input(stream_$15, UNPROVIDED, UNPROVIDED));
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($forward_inference_metrics_time_index$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject time_data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (time_data.isNumber()) {
                dictionary.dictionary_enter($forward_inference_metrics_time_index$.getGlobalValue(), rule, list($INFERENCE, multiply(time_data, numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue())));
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($forward_inference_metrics_count_index$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject rule = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count_data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (count_data.isNumber()) {
                dictionary.dictionary_enter($forward_inference_metrics_count_index$.getGlobalValue(), rule, list($INFERENCE, count_data));
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    public static SubLObject elapsed_forward_inference_metric_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $gathering_forward_inference_metricsP$.getDynamicValue(thread)) && (NIL != $forward_inference_last_metric_time$.getDynamicValue(thread))) {
            final SubLObject prev_time = $forward_inference_last_metric_time$.getDynamicValue(thread);
            SubLObject release = NIL;
            try {
                release = seize_lock($forward_inference_metrics_lock$.getGlobalValue());
                $forward_inference_last_metric_time$.setDynamicValue(numeric_date_utilities.get_internal_real_time_ms(), thread);
            } finally {
                if (NIL != release) {
                    release_lock($forward_inference_metrics_lock$.getGlobalValue());
                }
            }
            if (NIL != prev_time) {
                return subtract($forward_inference_last_metric_time$.getDynamicValue(thread), prev_time);
            }
        }
        return ZERO_INTEGER;
    }

    public static SubLObject initial_forward_inference_metric_time() {
        return numeric_date_utilities.get_internal_real_time_ms();
    }

    public static SubLObject clear_get_forward_inference_metric_type_and_metric_list() {
        final SubLObject cs = $get_forward_inference_metric_type_and_metric_list_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_forward_inference_metric_type_and_metric_list(final SubLObject metric_type, final SubLObject metric) {
        return memoization_state.caching_state_remove_function_results_with_args($get_forward_inference_metric_type_and_metric_list_caching_state$.getGlobalValue(), list(metric_type, metric), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_forward_inference_metric_type_and_metric_list_internal(final SubLObject metric_type, final SubLObject metric) {
        return list(metric_type, metric);
    }

    public static SubLObject get_forward_inference_metric_type_and_metric_list(final SubLObject metric_type, final SubLObject metric) {
        SubLObject caching_state = $get_forward_inference_metric_type_and_metric_list_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_FORWARD_INFERENCE_METRIC_TYPE_AND_METRIC_LIST, $get_forward_inference_metric_type_and_metric_list_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(metric_type, metric);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (metric_type.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && metric.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_forward_inference_metric_type_and_metric_list_internal(metric_type, metric)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(metric_type, metric));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject increment_forward_inference_metrics(final SubLObject metric_type, final SubLObject metric, SubLObject gaf, SubLObject rule, SubLObject count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $gathering_forward_inference_metricsP$.getDynamicValue(thread)) && (NIL != $forward_inference_last_metric_time$.getDynamicValue(thread))) {
            if (NIL == count) {
                count = ONE_INTEGER;
            }
            if (NIL == gaf) {
                gaf = forward.current_forward_inference_gaf();
            }
            if (NIL == assertion_handles.assertion_p(gaf)) {
                gaf = NIL;
            }
            if (NIL == rule) {
                rule = forward.current_forward_inference_rule();
            }
            if (NIL == assertion_handles.assertion_p(rule)) {
                rule = NIL;
            }
            final SubLObject metric_id = get_forward_inference_metric_type_and_metric_list(metric_type, metric);
            final SubLObject elapsed_time = elapsed_forward_inference_metric_time();
            SubLObject release = NIL;
            try {
                release = seize_lock($forward_inference_metrics_lock$.getGlobalValue());
                if ((NIL != gaf) && (NIL != rule)) {
                    dictionary_utilities.dictionary_pushnew(forward_inference_metrics_gaf_index(), rule, gaf, UNPROVIDED, UNPROVIDED);
                }
                if (elapsed_time.isNumber()) {
                    if (NIL != number_utilities.negative_number_p(elapsed_time)) {
                        format_nil.force_format(T, $str375$Negative_time___A_for___A__A___, elapsed_time, metric_type, metric, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    SubLObject time_plist = dictionary.dictionary_lookup_without_values(forward_inference_metrics_time_index(), rule, UNPROVIDED);
                    time_plist = putf(time_plist, metric_id, add(list_utilities.plist_lookup(time_plist, metric_id, ZERO_INTEGER), elapsed_time));
                    dictionary.dictionary_enter(forward_inference_metrics_time_index(), rule, time_plist);
                }
                SubLObject count_plist = dictionary.dictionary_lookup_without_values(forward_inference_metrics_count_index(), rule, UNPROVIDED);
                count_plist = putf(count_plist, metric_id, add(list_utilities.plist_lookup(count_plist, metric_id, ZERO_INTEGER), count));
                dictionary.dictionary_enter(forward_inference_metrics_count_index(), rule, count_plist);
            } finally {
                if (NIL != release) {
                    release_lock($forward_inference_metrics_lock$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static SubLObject note_forward_inference_for_rule(final SubLObject rule, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $browse_forward_inferencesP$.getDynamicValue(thread)) && (NIL != inference_datastructures_inference.inference_p(inference))) {
            dictionary_utilities.dictionary_push(forward_inference_metrics_inference_index(), rule, inference);
        }
        return NIL;
    }

    public static SubLObject note_forward_inference_successful_rule(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $gathering_forward_inference_metricsP$.getDynamicValue(thread)) {
            final SubLObject gaf = forward.current_forward_inference_gaf();
            if (NIL != gaf) {
                dictionary_utilities.dictionary_pushnew(forward_inference_metrics_successful_rule_index(), rule, gaf, UNPROVIDED, UNPROVIDED);
            } else {
                dictionary_utilities.dictionary_pushnew(forward_inference_metrics_successful_rule_index(), rule, $UNKNOWN_GAF, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject forward_inference_metrics_info(SubLObject threshold) {
        if (threshold == UNPROVIDED) {
            threshold = NIL;
        }
        return forward_inference_metrics_info_for_rules(all_forward_inference_metrics_rules(), threshold);
    }

    public static SubLObject forward_inference_metrics_info_for_rules(SubLObject rules, SubLObject threshold) {
        if (rules == UNPROVIDED) {
            rules = all_forward_inference_metrics_rules();
        }
        if (threshold == UNPROVIDED) {
            threshold = NIL;
        }
        finalize_forward_inference_metrics_inference_index();
        SubLObject entries = dictionary_utilities.dictionary_to_alist($forward_inference_metrics_time_index$.getGlobalValue());
        entries = delete(NIL, entries, symbol_function(EQ), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        entries = Sort.sort(entries, symbol_function($sym378$_), symbol_function(FORWARD_INFERENCE_TIME_METRIC_TOTAL_TIME_FROM_CDR));
        SubLObject info = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = entries;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject rule = NIL;
            SubLObject time_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list380);
            rule = current.first();
            current = time_plist = current.rest();
            if (((NIL == rule) || (NIL != list_utilities.member_kbeqP(rule, rules))) && ((NIL == threshold) || index.numL(threshold))) {
                final SubLObject total_time = forward_inference_time_metric_total_time(time_plist);
                info = cons(rule_forward_inference_metrics_info_int(rule, total_time), info);
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return nreverse(info);
    }

    public static SubLObject forward_inference_time_metric_total_time_from_cdr(final SubLObject alist_entry) {
        return forward_inference_time_metric_total_time(alist_entry.rest());
    }

    public static SubLObject forward_inference_successful_rules() {
        return dictionary.dictionary_keys(forward_inference_metrics_successful_rule_index());
    }

    public static SubLObject forward_inference_unsuccessful_rules() {
        return set_difference(dictionary.dictionary_keys(forward_inference_metrics_gaf_index()), dictionary.dictionary_keys(forward_inference_metrics_successful_rule_index()), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_forward_inference_metrics_rules() {
        return dictionary.dictionary_keys(forward_inference_metrics_gaf_index());
    }

    public static SubLObject forward_inference_triggered_tms_rules() {
        return list_utilities.remove_if_not($sym381$FORWARD_TMS_RULE_, all_forward_inference_metrics_rules(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject forward_inference_success_metrics_from_info(final SubLObject full_info) {
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
        while (NIL != cdolist_list_var) {
            final SubLObject current;
            final SubLObject datum = current = info;
            final SubLObject rule_tail = property_list_member($RULE, current);
            final SubLObject rule = (NIL != rule_tail) ? cadr(rule_tail) : NIL;
            final SubLObject time_tail = property_list_member($TIME, current);
            final SubLObject time = (NIL != time_tail) ? cadr(time_tail) : NIL;
            final SubLObject inference_time_tail = property_list_member($INFERENCE_TIME, current);
            final SubLObject inference_time = (NIL != inference_time_tail) ? cadr(inference_time_tail) : NIL;
            final SubLObject inference_count_tail = property_list_member($INFERENCE_COUNT, current);
            final SubLObject inference_count = (NIL != inference_count_tail) ? cadr(inference_count_tail) : NIL;
            final SubLObject trigger_gafs_tail = property_list_member($TRIGGER_GAFS, current);
            final SubLObject trigger_gafs = (NIL != trigger_gafs_tail) ? cadr(trigger_gafs_tail) : NIL;
            if (NIL != rule) {
                final SubLObject trigger_count = length(trigger_gafs);
                SubLObject rule_success_count = ZERO_INTEGER;
                total_rule_count = add(total_rule_count, ONE_INTEGER);
                SubLObject cdolist_list_var_$16 = trigger_gafs;
                SubLObject trigger_gaf = NIL;
                trigger_gaf = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    total_trigger_count = add(total_trigger_count, ONE_INTEGER);
                    if (((NIL != assertion_handles.assertion_p(rule)) && (NIL != assertion_handles.valid_assertionP(trigger_gaf, UNPROVIDED))) && (NIL != assertion_utilities.assertion_has_dependent_with_supportP_kb_hl_support_aware_version(trigger_gaf, rule))) {
                        success_trigger_count = add(success_trigger_count, ONE_INTEGER);
                        rule_success_count = add(rule_success_count, ONE_INTEGER);
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    trigger_gaf = cdolist_list_var_$16.first();
                } 
                if (rule_success_count.isPositive()) {
                    success_rule_count = add(success_rule_count, ONE_INTEGER);
                }
                total_time = add(total_time, time);
                if (NIL != inference_time) {
                    total_inference_time = add(total_inference_time, inference_time);
                    final SubLObject rule_success_trigger_ratio = number_utilities.safe_X(rule_success_count, trigger_count);
                    final SubLObject rule_success_estimate = multiply(rule_success_trigger_ratio, inference_time);
                    success_time_estimate = add(success_time_estimate, rule_success_estimate);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return listS($SUCCESS_RULE_COUNT, new SubLObject[]{ success_rule_count, $SUCCESS_TRIGGER_COUNT, success_trigger_count, $SUCCESS_TIME_ESTIMATE, success_time_estimate, $TOTAL_RULE_COUNT, total_rule_count, $TOTAL_TRIGGER_COUNT, total_trigger_count, $TOTAL_TIME, total_time, $TOTAL_INFERENCE_TIME, total_inference_time, total_time.isPositive() ? list($SUCCESS_RULE_RATIO, number_utilities.safe_X(success_rule_count, total_rule_count), $SUCCESS_TRIGGER_RATIO, number_utilities.safe_X(success_trigger_count, total_trigger_count), $SUCCESS_TIME_RATIO, number_utilities.safe_X(success_time_estimate, total_inference_time), $SUCCESS_INFERENCE_TIME_RATIO, number_utilities.safe_X(success_inference_time_estimate, total_inference_time)) : NIL });
    }

    public static SubLObject forward_inference_success_metrics(SubLObject rules) {
        if (rules == UNPROVIDED) {
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
        while (NIL != cdolist_list_var) {
            final SubLObject trigger_gafs = dictionary.dictionary_lookup_without_values(trigger_gaf_index, rule, UNPROVIDED);
            final SubLObject info = rule_forward_inference_metrics_info(rule);
            if (NIL != trigger_gafs) {
                final SubLObject current;
                final SubLObject datum = current = info;
                final SubLObject time_tail = property_list_member($TIME, current);
                final SubLObject time = (NIL != time_tail) ? cadr(time_tail) : NIL;
                final SubLObject inference_time_tail = property_list_member($INFERENCE_TIME, current);
                final SubLObject inference_time = (NIL != inference_time_tail) ? cadr(inference_time_tail) : NIL;
                final SubLObject inference_count_tail = property_list_member($INFERENCE_COUNT, current);
                final SubLObject inference_count = (NIL != inference_count_tail) ? cadr(inference_count_tail) : NIL;
                thread.resetMultipleValues();
                final SubLObject trigger_gaf_count = forward_inference_metrics_rule_success_info(rule, time, trigger_gafs);
                final SubLObject rule_success_count = thread.secondMultipleValue();
                final SubLObject rule_success_time_estimate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                total_rule_count = add(total_rule_count, ONE_INTEGER);
                if (rule_success_count.isPositive()) {
                    success_rule_count = add(success_rule_count, ONE_INTEGER);
                }
                total_trigger_count = add(total_trigger_count, trigger_gaf_count);
                success_trigger_count = add(success_trigger_count, rule_success_count);
                total_time = add(total_time, time);
                success_time_estimate = add(success_time_estimate, rule_success_time_estimate);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return listS($SUCCESS_RULE_COUNT, new SubLObject[]{ success_rule_count, $SUCCESS_TRIGGER_COUNT, success_trigger_count, $SUCCESS_TIME_ESTIMATE, success_time_estimate, $TOTAL_RULE_COUNT, total_rule_count, $TOTAL_TRIGGER_COUNT, total_trigger_count, $TOTAL_TIME, total_time, total_time.isPositive() ? list($SUCCESS_RULE_RATIO, number_utilities.safe_X(success_rule_count, total_rule_count), $SUCCESS_TRIGGER_RATIO, number_utilities.safe_X(success_trigger_count, total_trigger_count), $SUCCESS_TIME_RATIO, number_utilities.safe_X(success_time_estimate, total_time)) : NIL });
    }

    public static SubLObject forward_inference_metrics_time_totals() {
        finalize_forward_inference_metrics_inference_index();
        SubLObject result_plist = NIL;
        final SubLObject entries = dictionary_utilities.dictionary_to_alist($forward_inference_metrics_time_index$.getGlobalValue());
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = entries;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject rule = NIL;
            SubLObject time_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list380);
            rule = current.first();
            current = time_plist = current.rest();
            SubLObject remainder;
            SubLObject metric;
            SubLObject time;
            for (remainder = NIL, remainder = time_plist; NIL != remainder; remainder = cddr(remainder)) {
                metric = remainder.first();
                time = cadr(remainder);
                result_plist = putf(result_plist, metric, add(list_utilities.plist_lookup(result_plist, metric, ZERO_INTEGER), time));
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return result_plist;
    }

    public static SubLObject forward_inference_metrics_count_totals() {
        finalize_forward_inference_metrics_inference_index();
        SubLObject result_plist = NIL;
        final SubLObject entries = dictionary_utilities.dictionary_to_alist($forward_inference_metrics_count_index$.getGlobalValue());
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = entries;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject rule = NIL;
            SubLObject count_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list397);
            rule = current.first();
            current = count_plist = current.rest();
            SubLObject remainder;
            SubLObject metric;
            SubLObject count;
            for (remainder = NIL, remainder = count_plist; NIL != remainder; remainder = cddr(remainder)) {
                metric = remainder.first();
                count = cadr(remainder);
                result_plist = putf(result_plist, metric, add(list_utilities.plist_lookup(result_plist, metric, ZERO_INTEGER), count));
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return result_plist;
    }

    public static SubLObject rule_forward_inference_metrics_deductions_from_trigger_gafs(final SubLObject rule) {
        final SubLObject trigger_gaf_index = forward_inference_metrics_gaf_index();
        final SubLObject trigger_gafs = dictionary.dictionary_lookup_without_values(trigger_gaf_index, rule, UNPROVIDED);
        final SubLObject deductions = set.new_set(symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = trigger_gafs;
        SubLObject trigger_gaf = NIL;
        trigger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject set_contents_var = assertions_high.assertion_dependents(trigger_gaf);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deduction;
            SubLObject cdolist_list_var_$17;
            SubLObject deduction_support;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deduction = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                    cdolist_list_var_$17 = deductions_high.deduction_supports(deduction);
                    deduction_support = NIL;
                    deduction_support = cdolist_list_var_$17.first();
                    while (NIL != cdolist_list_var_$17) {
                        if (NIL != arguments.support_equal(deduction_support, rule)) {
                            set.set_add(deduction, deductions);
                        }
                        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                        deduction_support = cdolist_list_var_$17.first();
                    } 
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            trigger_gaf = cdolist_list_var.first();
        } 
        return Sort.sort(set.set_element_list(deductions), symbol_function($sym340$_), symbol_function(DEDUCTION_ID));
    }

    public static SubLObject rule_forward_inference_metrics_info(final SubLObject rule) {
        final SubLObject time_plist = dictionary.dictionary_lookup_without_values($forward_inference_metrics_time_index$.getGlobalValue(), rule, UNPROVIDED);
        final SubLObject total_time = forward_inference_time_metric_total_time(time_plist);
        return rule_forward_inference_metrics_info_int(rule, total_time);
    }

    public static SubLObject rule_forward_inference_metrics_info_int(final SubLObject rule, final SubLObject time) {
        final SubLObject gafs = dictionary.dictionary_lookup(forward_inference_metrics_gaf_index(), rule, NIL);
        final SubLObject inferences = dictionary.dictionary_lookup(forward_inference_metrics_inference_index(), rule, NIL);
        final SubLObject time_plist = copy_list(dictionary.dictionary_lookup(forward_inference_metrics_time_index(), rule, NIL));
        final SubLObject count_plist = copy_list(dictionary.dictionary_lookup(forward_inference_metrics_count_index(), rule, NIL));
        SubLObject inference_time = ZERO_INTEGER;
        SubLObject remainder;
        SubLObject metric;
        SubLObject time_$18;
        for (remainder = NIL, remainder = time_plist; NIL != remainder; remainder = cddr(remainder)) {
            metric = remainder.first();
            time_$18 = cadr(remainder);
            if ($INFERENCE == (metric.isCons() ? metric.first() : metric)) {
                inference_time = add(inference_time, time_$18);
            }
        }
        return listS($RULE, new SubLObject[]{ rule, $TIME, time, $INFERENCE_TIME, inference_time, $TIME_PLIST, time_plist, $COUNT_PLIST, count_plist, $TRIGGER_GAFS, copy_list(gafs), $INFERENCE_COUNT, getf(count_plist, get_forward_inference_metric_type_and_metric_list($INFERENCE, $OVERHEAD), ZERO_INTEGER), NIL != inferences ? list($INFERENCES, copy_list(inferences)) : NIL });
    }

    public static SubLObject global_statistics_from_forward_inference_metrics_info(final SubLObject info) {
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
        if (NIL == info) {
            return list($TOTAL_TIME, total_time, $TOTAL_INFERENCE_TIME, total_inference_time, $TOTAL_INFERENCES, total_inferences, $TOTAL_RULES, total_rules);
        }
        SubLObject cdolist_list_var = info;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current;
            final SubLObject datum = current = item;
            final SubLObject rule_tail = property_list_member($RULE, current);
            final SubLObject rule = (NIL != rule_tail) ? cadr(rule_tail) : NIL;
            final SubLObject time_tail = property_list_member($TIME, current);
            final SubLObject time = (NIL != time_tail) ? cadr(time_tail) : NIL;
            final SubLObject inference_time_tail = property_list_member($INFERENCE_TIME, current);
            final SubLObject inference_time = (NIL != inference_time_tail) ? cadr(inference_time_tail) : NIL;
            final SubLObject inference_count_tail = property_list_member($INFERENCE_COUNT, current);
            final SubLObject inference_count = (NIL != inference_count_tail) ? cadr(inference_count_tail) : NIL;
            final SubLObject trigger_gafs_tail = property_list_member($TRIGGER_GAFS, current);
            final SubLObject trigger_gafs = (NIL != trigger_gafs_tail) ? cadr(trigger_gafs_tail) : NIL;
            final SubLObject trigger_count = length(trigger_gafs);
            if (NIL != rule) {
                total_rules = add(total_rules, ONE_INTEGER);
            }
            if (time.isNumber()) {
                total_time = add(total_time, time);
                rule_times = cons(time, rule_times);
            }
            if (inference_time.isNumber()) {
                total_inference_time = add(total_inference_time, inference_time);
            }
            if (inference_count.isPositive()) {
                total_inferences = add(total_inferences, inference_count);
                rule_inference_counts = cons(inference_count, rule_inference_counts);
                rule_average_times = cons(number_utilities.safe_X(inference_time, inference_count), rule_average_times);
            }
            if (trigger_count.isPositive()) {
                total_triggers = add(total_triggers, trigger_count);
                trigger_counts = cons(trigger_count, trigger_counts);
                trigger_average_times = cons(number_utilities.safe_X(time, trigger_count), trigger_average_times);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        final SubLObject average_inferences_per_rule = number_utilities.safe_X(total_inferences, total_rules);
        final SubLObject stdev_inferences_per_rule = number_utilities.safe_standard_deviation_from_sample(rule_inference_counts);
        final SubLObject average_trigger_per_rule = number_utilities.safe_X(total_triggers, total_rules);
        final SubLObject stdev_trigger_per_rule = number_utilities.safe_standard_deviation_from_sample(trigger_counts);
        final SubLObject average_time_per_rule = number_utilities.safe_X(total_time, total_rules);
        final SubLObject stdev_time_per_rule = number_utilities.safe_standard_deviation_from_sample(rule_times);
        final SubLObject average_time_per_inference = number_utilities.safe_X(total_inference_time, total_inferences);
        final SubLObject stdev_time_per_inference = number_utilities.safe_standard_deviation_from_sample(rule_average_times);
        final SubLObject average_time_per_trigger = number_utilities.safe_X(total_time, total_triggers);
        final SubLObject stdev_time_per_trigger = number_utilities.safe_standard_deviation_from_sample(trigger_average_times);
        final SubLObject global_statistics = list(new SubLObject[]{ $TOTAL_TIME, total_time, $TOTAL_INFERENCE_TIME, total_inference_time, $TOTAL_INFERENCES, total_inferences, $TOTAL_TRIGGERS, total_triggers, $TOTAL_RULES, total_rules, $AVERAGE_INFERENCES_PER_RULE, average_inferences_per_rule, $STDEV_INFERENCES_PER_RULE, stdev_inferences_per_rule, $AVERAGE_TRIGGER_PER_RULE, average_trigger_per_rule, $STDEV_TRIGGER_PER_RULE, stdev_trigger_per_rule, $AVERAGE_TIME_PER_RULE, average_time_per_rule, $STDEV_TIME_PER_RULE, stdev_time_per_rule, $AVERAGE_TIME_PER_INFERENCE, average_time_per_inference, $STDEV_TIME_PER_INFERENCE, stdev_time_per_inference, $AVERAGE_TIME_PER_TRIGGER, average_time_per_trigger, $STDEV_TIME_PER_TRIGGER, stdev_time_per_trigger });
        return global_statistics;
    }

    public static SubLObject show_forward_inference_metrics(SubLObject threshold, SubLObject stream) {
        if (threshold == UNPROVIDED) {
            threshold = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject info = forward_inference_metrics_info(threshold);
        SubLObject total_time = ZERO_INTEGER;
        SubLObject cdolist_list_var = info;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject current;
            final SubLObject datum = current = item;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_$19 = NIL;
            while (NIL != rest) {
                destructuring_bind_must_consp(rest, datum, $list416);
                current_$19 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list416);
                if (NIL == member(current_$19, $list417, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_$19 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            } 
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list416);
            }
            final SubLObject rule_tail = property_list_member($RULE, current);
            final SubLObject rule = (NIL != rule_tail) ? cadr(rule_tail) : NIL;
            final SubLObject time_tail = property_list_member($TIME, current);
            final SubLObject time = (NIL != time_tail) ? cadr(time_tail) : NIL;
            final SubLObject trigger_gafs_tail = property_list_member($TRIGGER_GAFS, current);
            final SubLObject trigger_gafs = (NIL != trigger_gafs_tail) ? cadr(trigger_gafs_tail) : NIL;
            final SubLObject inference_count_tail = property_list_member($INFERENCE_COUNT, current);
            final SubLObject inference_count = (NIL != inference_count_tail) ? cadr(inference_count_tail) : NIL;
            final SubLObject inferences_tail = property_list_member($INFERENCES, current);
            final SubLObject inferences = (NIL != inferences_tail) ? cadr(inferences_tail) : NIL;
            total_time = add(total_time, time);
            format(stream, $str418$___6F____S____S__a__S, new SubLObject[]{ time, inference_count, rule, assertion_handles.assertion_id(rule) });
            if (NIL != trigger_gafs) {
                format(stream, $str419$___S, trigger_gafs);
            }
            if (NIL != inferences) {
                format(stream, $str419$___S, inferences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return total_time;
    }

    public static SubLObject show_forward_inference_metrics_of_asserting(final SubLObject sentence, final SubLObject mt, SubLObject threshold, SubLObject browsableP) {
        if (threshold == UNPROVIDED) {
            threshold = NIL;
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_forward_inference_metrics();
        final SubLObject _prev_bind_0 = $gathering_forward_inference_metricsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $browse_forward_inferencesP$.currentBinding(thread);
        try {
            $gathering_forward_inference_metricsP$.bind(T, thread);
            $browse_forward_inferencesP$.bind(browsableP, thread);
            cyc_kernel.cyc_unassert(sentence, mt);
            cyc_kernel.cyc_assert(sentence, mt, UNPROVIDED);
            show_forward_inference_metrics(threshold, UNPROVIDED);
            finalize_forward_inference_metrics_inference_index();
        } finally {
            $browse_forward_inferencesP$.rebind(_prev_bind_2, thread);
            $gathering_forward_inference_metricsP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject write_forward_inference_metrics_data(final SubLObject stream, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        final SubLObject info_tail = property_list_member($INFO, current);
        SubLObject info = (NIL != info_tail) ? cadr(info_tail) : $ALL;
        final SubLObject threshold_tail = property_list_member($THRESHOLD, current);
        final SubLObject threshold = (NIL != threshold_tail) ? cadr(threshold_tail) : NIL;
        final SubLObject format_tail = property_list_member($FORMAT, current);
        final SubLObject format = (NIL != format_tail) ? cadr(format_tail) : $CSV;
        final SubLObject headingsP_tail = property_list_member($HEADINGS_, current);
        final SubLObject headingsP = (NIL != headingsP_tail) ? cadr(headingsP_tail) : T;
        final SubLObject columns_tail = property_list_member($COLUMNS, current);
        final SubLObject columns = (NIL != columns_tail) ? cadr(columns_tail) : $list426;
        final SubLObject pcase_var = info;
        if (pcase_var.eql($ALL)) {
            info = forward_inference_metrics_info(threshold);
        } else
            if (pcase_var.eql($SUCCESSFUL)) {
                final SubLObject rules = forward_inference_successful_rules();
                info = forward_inference_metrics_info_for_rules(rules, threshold);
            }

        final SubLObject separator_map = $list428;
        final SubLObject separator = list_utilities.alist_lookup_without_values(separator_map, format, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_pretty$.currentBinding(thread);
        try {
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            $print_pretty$.bind(NIL, thread);
            if (NIL != headingsP) {
                format(stream, $str430$__);
                SubLObject list_var = NIL;
                SubLObject column = NIL;
                SubLObject index = NIL;
                list_var = columns;
                column = list_var.first();
                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , column = list_var.first() , index = add(ONE_INTEGER, index)) {
                    if (!index.isZero()) {
                        princ(separator, stream);
                    }
                    princ(Strings.string_capitalize(string_utilities.string_substitute($$$_, $str432$_, symbol_name(column), UNPROVIDED), UNPROVIDED, UNPROVIDED), stream);
                }
                terpri(stream);
            }
            SubLObject cdolist_list_var = info;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject current_$21;
                final SubLObject datum_$20 = current_$21 = item;
                final SubLObject rule_tail = property_list_member($RULE, current_$21);
                final SubLObject rule = (NIL != rule_tail) ? cadr(rule_tail) : NIL;
                final SubLObject time_tail = property_list_member($TIME, current_$21);
                final SubLObject time = (NIL != time_tail) ? cadr(time_tail) : NIL;
                final SubLObject trigger_gafs_tail = property_list_member($TRIGGER_GAFS, current_$21);
                final SubLObject trigger_gafs = (NIL != trigger_gafs_tail) ? cadr(trigger_gafs_tail) : NIL;
                thread.resetMultipleValues();
                final SubLObject trigger_count = forward_inference_metrics_rule_success_info(rule, time, trigger_gafs);
                final SubLObject success_count = thread.secondMultipleValue();
                final SubLObject success_time = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                SubLObject list_var2 = NIL;
                SubLObject column2 = NIL;
                SubLObject index2 = NIL;
                list_var2 = columns;
                column2 = list_var2.first();
                for (index2 = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest() , column2 = list_var2.first() , index2 = add(ONE_INTEGER, index2)) {
                    if (!index2.isZero()) {
                        princ(separator, stream);
                    }
                    final SubLObject pcase_var2 = column2;
                    if (pcase_var2.eql($TRIGGER_COUNT)) {
                        princ(trigger_count, stream);
                    } else
                        if (pcase_var2.eql($SUCCESS_COUNT)) {
                            princ(success_count, stream);
                        } else
                            if (pcase_var2.eql($TIME)) {
                                princ(number_utilities.four_significant_digits(time), stream);
                            } else
                                if (pcase_var2.eql($SUCCESS_TIME)) {
                                    princ(number_utilities.four_significant_digits(success_time), stream);
                                } else
                                    if (pcase_var2.eql($ID)) {
                                        princ(assertion_handles.assertion_id(rule), stream);
                                    } else
                                        if (pcase_var2.eql($CHLID)) {
                                            princ(kb_utilities.compact_hl_external_id_string(rule), stream);
                                        } else
                                            if (pcase_var2.eql($EL_IST_FORMULA)) {
                                                princ(uncanonicalizer.assertion_el_ist_formula(rule), stream);
                                            }






                }
                terpri(stream);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        } finally {
            $print_pretty$.rebind(_prev_bind_2, thread);
            $read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject forward_inference_metrics_rule_success_info(final SubLObject rule, final SubLObject time, final SubLObject trigger_gafs) {
        final SubLObject trigger_count = length(trigger_gafs);
        SubLObject success_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = trigger_gafs;
        SubLObject trigger_gaf = NIL;
        trigger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertion_handles.valid_assertionP(trigger_gaf, UNPROVIDED)) && (NIL != assertion_utilities.assertion_has_dependent_with_supportP_kb_hl_support_aware_version(trigger_gaf, rule))) {
                success_count = add(success_count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            trigger_gaf = cdolist_list_var.first();
        } 
        final SubLObject success_trigger_ratio = number_utilities.safe_X(success_count, trigger_count);
        final SubLObject estimated_success_time = multiply(success_trigger_ratio, time);
        return values(trigger_count, success_count, estimated_success_time);
    }

    public static SubLObject reset_inference_metrics() {
        $problem_store_historical_count$.setGlobalValue(ZERO_INTEGER);
        $forward_problem_store_historical_count$.setGlobalValue(ZERO_INTEGER);
        $maximum_problem_store_historical_problem_count$.setGlobalValue(ZERO_INTEGER);
        $maximum_forward_problem_store_historical_problem_count$.setGlobalValue(ZERO_INTEGER);
        $problem_historical_count$.setGlobalValue(ZERO_INTEGER);
        $good_problem_historical_count$.setGlobalValue(ZERO_INTEGER);
        $no_good_problem_historical_count$.setGlobalValue(ZERO_INTEGER);
        $forward_problem_historical_count$.setGlobalValue(ZERO_INTEGER);
        $single_literal_problem_historical_count$.setGlobalValue(ZERO_INTEGER);
        $problem_link_historical_count$.setGlobalValue(ZERO_INTEGER);
        $structural_link_historical_count$.setGlobalValue(ZERO_INTEGER);
        $content_link_historical_count$.setGlobalValue(ZERO_INTEGER);
        $removal_link_historical_count$.setGlobalValue(ZERO_INTEGER);
        $transformation_link_historical_count$.setGlobalValue(ZERO_INTEGER);
        $dependent_link_historical_count$.setGlobalValue(ZERO_INTEGER);
        $single_literal_problem_dependent_link_historical_count$.setGlobalValue(ZERO_INTEGER);
        $tactic_historical_count$.setGlobalValue(ZERO_INTEGER);
        $executed_tactic_historical_count$.setGlobalValue(ZERO_INTEGER);
        $discarded_tactic_historical_count$.setGlobalValue(ZERO_INTEGER);
        $sbhl_cache_attempt_historical_count$.setGlobalValue(ZERO_INTEGER);
        $sbhl_cache_success_historical_count$.setGlobalValue(ZERO_INTEGER);
        $sbhl_graph_attempt_historical_count$.setGlobalValue(ZERO_INTEGER);
        $sbhl_graph_success_historical_count$.setGlobalValue(ZERO_INTEGER);
        $sbhl_link_historical_count$.setGlobalValue(ZERO_INTEGER);
        $unification_attempt_historical_count$.setGlobalValue(ZERO_INTEGER);
        $unification_success_historical_count$.setGlobalValue(ZERO_INTEGER);
        $proof_historical_count$.setGlobalValue(ZERO_INTEGER);
        $inference_historical_count$.setGlobalValue(ZERO_INTEGER);
        $successful_inference_historical_count$.setGlobalValue(ZERO_INTEGER);
        $forward_inference_historical_count$.setGlobalValue(ZERO_INTEGER);
        $successful_forward_inference_historical_count$.setGlobalValue(ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject show_inference_metrics(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
        try {
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            SubLObject total_count = inference_historical_count();
            terpri(stream);
            format(stream, $str439$__Total_inferences_______________, total_count);
            SubLObject forward_count = forward_inference_historical_count();
            format(stream, $str440$___total_forward__data_directed__, forward_count);
            show_inference_metric_percentage(forward_count, total_count, THREE_INTEGER, UNPROVIDED);
            SubLObject success_count = successful_forward_inference_historical_count();
            format(stream, $str441$____successful_forward___________, success_count);
            show_inference_metric_percentage(success_count, total_count, THREE_INTEGER, UNPROVIDED);
            SubLObject backward_count = backward_inference_historical_count();
            format(stream, $str442$___total_backward__query_directed, backward_count);
            show_inference_metric_percentage(backward_count, total_count, THREE_INTEGER, UNPROVIDED);
            success_count = successful_backward_inference_historical_count();
            format(stream, $str443$____successful_backward__________, success_count);
            show_inference_metric_percentage(success_count, total_count, THREE_INTEGER, UNPROVIDED);
            format(stream, $str444$___avg_relevant_problem_count____, number_utilities.significant_digits(average_historical_inference_relevant_problem_count(), FOUR_INTEGER));
            total_count = problem_store_historical_count();
            terpri(stream);
            format(stream, $str445$__Total_problem_stores___________, total_count);
            forward_count = forward_problem_store_historical_count();
            format(stream, $str446$___total_forward___data_directed_, forward_count);
            show_inference_metric_percentage(forward_count, total_count, TWO_INTEGER, UNPROVIDED);
            backward_count = backward_problem_store_historical_count();
            format(stream, $str442$___total_backward__query_directed, backward_count);
            show_inference_metric_percentage(backward_count, total_count, TWO_INTEGER, UNPROVIDED);
            format(stream, $str447$___max_problem_store_problem_coun, maximum_problem_store_historical_problem_count());
            format(stream, $str448$___avg_problem_store_problem_coun, number_utilities.significant_digits(average_problem_store_historical_problem_count(), THREE_INTEGER));
            format(stream, $str449$___max_forward_problem_store_prob, maximum_forward_problem_store_historical_problem_count());
            format(stream, $str450$___avg_forward_problem_store_prob, number_utilities.significant_digits(average_forward_problem_store_historical_problem_count(), THREE_INTEGER));
            total_count = problem_historical_count();
            terpri(stream);
            format(stream, $str451$__Total_problems_____________6___, total_count);
            final SubLObject good_count = good_problem_historical_count();
            format(stream, $str452$___total_good_problems_______6___, good_count);
            show_inference_metric_percentage(good_count, total_count, TWO_INTEGER, UNPROVIDED);
            final SubLObject no_good_count = no_good_problem_historical_count();
            format(stream, $str453$___total_no_good_problems____6___, no_good_count);
            show_inference_metric_percentage(no_good_count, total_count, TWO_INTEGER, UNPROVIDED);
            forward_count = forward_problem_historical_count();
            format(stream, $str454$___total_forward_problems____6___, forward_count);
            show_inference_metric_percentage(forward_count, total_count, TWO_INTEGER, UNPROVIDED);
            format(stream, $str455$___total_problem_reuses______6___, problem_reuses_historical_count());
            format(stream, $str456$____problem_reuse_ratio______6___, number_utilities.significant_digits(problem_reuse_historical_ratio(), THREE_INTEGER));
            total_count = problem_link_historical_count();
            terpri(stream);
            format(stream, $str457$__Total_problem_links________6___, total_count);
            final SubLObject structural_count = structural_link_historical_count();
            format(stream, $str458$___total_structural_links____6___, structural_count);
            show_inference_metric_percentage(structural_count, total_count, THREE_INTEGER, UNPROVIDED);
            final SubLObject content_count = content_link_historical_count();
            format(stream, $str459$___total_content_links_______6___, content_count);
            show_inference_metric_percentage(content_count, total_count, THREE_INTEGER, UNPROVIDED);
            final SubLObject removal_count = removal_link_historical_count();
            format(stream, $str460$____removal_links____________6___, removal_count);
            show_inference_metric_percentage(removal_count, total_count, THREE_INTEGER, UNPROVIDED);
            final SubLObject transformation_count = transformation_link_historical_count();
            format(stream, $str461$____transformation_links_____6___, transformation_count);
            show_inference_metric_percentage(transformation_count, total_count, THREE_INTEGER, UNPROVIDED);
            total_count = tactic_historical_count();
            terpri(stream);
            format(stream, $str462$__Total_tactics_______6___D, total_count);
            final SubLObject executed_count = executed_tactic_historical_count();
            format(stream, $str463$___total_executed_____6___D, executed_count);
            show_inference_metric_percentage(executed_count, total_count, TWO_INTEGER, UNPROVIDED);
            final SubLObject discarded_count = discarded_tactic_historical_count();
            format(stream, $str464$___total_discarded____6___D, discarded_count);
            show_inference_metric_percentage(discarded_count, total_count, TWO_INTEGER, UNPROVIDED);
            total_count = sbhl_cache_attempt_historical_count();
            terpri(stream);
            format(stream, $str465$__Total_SBHL_cache_calls______9__, total_count);
            SubLObject success_count2 = sbhl_cache_success_historical_count();
            format(stream, $str466$___successful_________________9__, success_count2);
            show_inference_metric_percentage(success_count2, total_count, THREE_INTEGER, UNPROVIDED);
            total_count = sbhl_graph_attempt_historical_count();
            terpri(stream);
            format(stream, $str467$__Total_SBHL_graph_walks______9__, total_count);
            success_count2 = sbhl_graph_success_historical_count();
            format(stream, $str466$___successful_________________9__, success_count2);
            show_inference_metric_percentage(success_count2, total_count, THREE_INTEGER, UNPROVIDED);
            total_count = unification_attempt_historical_count();
            terpri(stream);
            format(stream, $str468$__Total_unification_attempts____6, total_count);
            success_count2 = unification_success_historical_count();
            format(stream, $str469$___successful_unifications______6, success_count2);
            show_inference_metric_percentage(success_count2, total_count, TWO_INTEGER, UNPROVIDED);
            terpri(stream);
            format(stream, $str470$__Total_proofs____6___D, proof_historical_count());
            terpri(stream);
        } finally {
            $read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject show_inference_metric_percentage(final SubLObject numerator, final SubLObject denominator, final SubLObject digits, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (!denominator.isZero()) {
            final SubLObject percentage = number_utilities.significant_digits(multiply($int$100, divide(numerator, denominator)), digits);
            if (digits.eql(TWO_INTEGER)) {
                format(stream, $str472$___2___D___, percentage);
            } else
                if (digits.eql(THREE_INTEGER)) {
                    format(stream, $str473$___3___D___, percentage);
                } else {
                    format(stream, $str474$___D___, percentage);
                }

        }
        return NIL;
    }

    public static SubLObject declare_inference_metrics_file() {
        declareFunction(me, "inference_metric_evaluation_arg1_p", "INFERENCE-METRIC-EVALUATION-ARG1-P", 1, 0, false);
        declareFunction(me, "inference_metric_print_function_trampoline", "INFERENCE-METRIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "inference_metric_p", "INFERENCE-METRIC-P", 1, 0, false);
        new inference_metrics.$inference_metric_p$UnaryFunction();
        declareFunction(me, "inf_metric_name", "INF-METRIC-NAME", 1, 0, false);
        declareFunction(me, "inf_metric_evaluation_func", "INF-METRIC-EVALUATION-FUNC", 1, 0, false);
        declareFunction(me, "inf_metric_evaluation_arg1", "INF-METRIC-EVALUATION-ARG1", 1, 0, false);
        declareFunction(me, "inf_metric_cross_productP", "INF-METRIC-CROSS-PRODUCT?", 1, 0, false);
        declareFunction(me, "_csetf_inf_metric_name", "_CSETF-INF-METRIC-NAME", 2, 0, false);
        declareFunction(me, "_csetf_inf_metric_evaluation_func", "_CSETF-INF-METRIC-EVALUATION-FUNC", 2, 0, false);
        declareFunction(me, "_csetf_inf_metric_evaluation_arg1", "_CSETF-INF-METRIC-EVALUATION-ARG1", 2, 0, false);
        declareFunction(me, "_csetf_inf_metric_cross_productP", "_CSETF-INF-METRIC-CROSS-PRODUCT?", 2, 0, false);
        declareFunction(me, "make_inference_metric", "MAKE-INFERENCE-METRIC", 0, 1, false);
        declareFunction(me, "visit_defstruct_inference_metric", "VISIT-DEFSTRUCT-INFERENCE-METRIC", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_inference_metric_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-METRIC-METHOD", 2, 0, false);
        declareFunction(me, "print_inference_metric", "PRINT-INFERENCE-METRIC", 3, 0, false);
        declareFunction(me, "new_inference_metric", "NEW-INFERENCE-METRIC", 4, 0, false);
        declareFunction(me, "inference_metric_name", "INFERENCE-METRIC-NAME", 1, 0, false);
        declareFunction(me, "inference_metric_evaluation_func", "INFERENCE-METRIC-EVALUATION-FUNC", 1, 0, false);
        declareFunction(me, "inference_metric_evaluation_arg1", "INFERENCE-METRIC-EVALUATION-ARG1", 1, 0, false);
        declareFunction(me, "inference_metric_cross_productP", "INFERENCE-METRIC-CROSS-PRODUCT?", 1, 0, false);
        declareFunction(me, "inference_metric_evaluate", "INFERENCE-METRIC-EVALUATE", 3, 0, false);
        declareFunction(me, "inference_metric_property_p", "INFERENCE-METRIC-PROPERTY-P", 1, 0, false);
        declareFunction(me, "declare_inference_metric", "DECLARE-INFERENCE-METRIC", 3, 1, false);
        declareFunction(me, "inference_metric_lookup", "INFERENCE-METRIC-LOOKUP", 1, 0, false);
        declareFunction(me, "inference_metric_nameP", "INFERENCE-METRIC-NAME?", 1, 0, false);
        declareFunction(me, "inference_metric_names", "INFERENCE-METRIC-NAMES", 0, 0, false);
        declareFunction(me, "problem_store_historical_count", "PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_problem_store_historical_count", "INCREMENT-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "forward_problem_store_historical_count", "FORWARD-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "backward_problem_store_historical_count", "BACKWARD-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_forward_problem_store_historical_count", "INCREMENT-FORWARD-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "maximum_problem_store_historical_problem_count", "MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false);
        declareFunction(me, "update_maximum_problem_store_historical_problem_count", "UPDATE-MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction(me, "average_problem_store_historical_problem_count", "AVERAGE-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false);
        declareFunction(me, "maximum_forward_problem_store_historical_problem_count", "MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false);
        declareFunction(me, "update_maximum_forward_problem_store_historical_problem_count", "UPDATE-MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false);
        declareFunction(me, "average_forward_problem_store_historical_problem_count", "AVERAGE-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false);
        declareFunction(me, "increment_problem_historical_count", "INCREMENT-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "problem_historical_count", "PROBLEM-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "good_problem_historical_count", "GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_good_problem_historical_count", "INCREMENT-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "decrement_good_problem_historical_count", "DECREMENT-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "no_good_problem_historical_count", "NO-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_no_good_problem_historical_count", "INCREMENT-NO-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "forward_problem_historical_count", "FORWARD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "update_forward_problem_historical_count", "UPDATE-FORWARD-PROBLEM-HISTORICAL-COUNT", 1, 0, false);
        declareFunction(me, "single_literal_problem_historical_count", "SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "multi_literal_problem_historical_count", "MULTI-LITERAL-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_single_literal_problem_historical_count", "INCREMENT-SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "problem_link_historical_count", "PROBLEM-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "structural_link_historical_count", "STRUCTURAL-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "content_link_historical_count", "CONTENT-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "removal_link_historical_count", "REMOVAL-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "transformation_link_historical_count", "TRANSFORMATION-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_problem_link_type_historical_counts", "INCREMENT-PROBLEM-LINK-TYPE-HISTORICAL-COUNTS", 1, 0, false);
        declareFunction(me, "dependent_link_historical_count", "DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_dependent_link_historical_count", "INCREMENT-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "single_literal_problem_dependent_link_historical_count", "SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "multi_literal_problem_dependent_link_historical_count", "MULTI-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_single_literal_problem_dependent_link_historical_count", "INCREMENT-SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "problem_reuses_historical_count", "PROBLEM-REUSES-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "problem_reuse_historical_ratio", "PROBLEM-REUSE-HISTORICAL-RATIO", 0, 0, false);
        declareFunction(me, "single_literal_problem_reuses_historical_count", "SINGLE-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "single_literal_problem_reuse_historical_ratio", "SINGLE-LITERAL-PROBLEM-REUSE-HISTORICAL-RATIO", 0, 0, false);
        declareFunction(me, "multi_literal_problem_reuses_historical_count", "MULTI-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "multi_literal_problem_reuse_historical_ratio", "MULTI-LITERAL-PROBLEM-REUSE-HISTORICAL-RATIO", 0, 0, false);
        declareFunction(me, "tactic_historical_count", "TACTIC-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_tactic_historical_count", "INCREMENT-TACTIC-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "executed_tactic_historical_count", "EXECUTED-TACTIC-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_executed_tactic_historical_count", "INCREMENT-EXECUTED-TACTIC-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "discarded_tactic_historical_count", "DISCARDED-TACTIC-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_discarded_tactic_historical_count", "INCREMENT-DISCARDED-TACTIC-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "unification_attempt_historical_count", "UNIFICATION-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_unification_attempt_historical_count", "INCREMENT-UNIFICATION-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "unification_success_historical_count", "UNIFICATION-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_unification_success_historical_count", "INCREMENT-UNIFICATION-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "sbhl_cache_attempt_historical_count", "SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_sbhl_cache_attempt_historical_count", "INCREMENT-SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "sbhl_cache_success_historical_count", "SBHL-CACHE-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_sbhl_cache_success_historical_count", "INCREMENT-SBHL-CACHE-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "sbhl_graph_attempt_historical_count", "SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_sbhl_graph_attempt_historical_count", "INCREMENT-SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "sbhl_graph_success_historical_count", "SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_sbhl_graph_success_historical_count", "INCREMENT-SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "sbhl_link_historical_count", "SBHL-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_sbhl_link_historical_count", "INCREMENT-SBHL-LINK-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "proof_historical_count", "PROOF-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_proof_historical_count", "INCREMENT-PROOF-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "inference_historical_count", "INFERENCE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_inference_historical_count", "INCREMENT-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "successful_inference_historical_count", "SUCCESSFUL-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_successful_inference_historical_count", "INCREMENT-SUCCESSFUL-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "forward_inference_historical_count", "FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "backward_inference_historical_count", "BACKWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_forward_inference_historical_count", "INCREMENT-FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "successful_forward_inference_historical_count", "SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "successful_backward_inference_historical_count", "SUCCESSFUL-BACKWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "increment_successful_forward_inference_historical_count", "INCREMENT-SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
        declareFunction(me, "average_historical_inference_relevant_problem_count", "AVERAGE-HISTORICAL-INFERENCE-RELEVANT-PROBLEM-COUNT", 0, 0, false);
        declareFunction(me, "sksi_query_total_time_accumulator_lookup", "SKSI-QUERY-TOTAL-TIME-ACCUMULATOR-LOOKUP", 1, 0, false);
        declareFunction(me, "sksi_query_start_times_accumulator_lookup", "SKSI-QUERY-START-TIMES-ACCUMULATOR-LOOKUP", 1, 0, false);
        declareFunction(me, "sparql_query_profile_accumulator_lookup", "SPARQL-QUERY-PROFILE-ACCUMULATOR-LOOKUP", 1, 0, false);
        declareFunction(me, "inference_tick_indexed_progress_data_memoized_internal", "INFERENCE-TICK-INDEXED-PROGRESS-DATA-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(me, "inference_tick_indexed_progress_data_memoized", "INFERENCE-TICK-INDEXED-PROGRESS-DATA-MEMOIZED", 1, 0, false);
        declareFunction(me, "inference_possibly_update_tick_indexed_progress_data", "INFERENCE-POSSIBLY-UPDATE-TICK-INDEXED-PROGRESS-DATA", 1, 0, false);
        declareFunction(me, "inference_has_tick_indexed_progress_dataP", "INFERENCE-HAS-TICK-INDEXED-PROGRESS-DATA?", 1, 0, false);
        declareFunction(me, "inference_should_gather_tick_indexed_progress_dataP", "INFERENCE-SHOULD-GATHER-TICK-INDEXED-PROGRESS-DATA?", 1, 0, false);
        declareFunction(me, "inference_tick_indexed_progress_data", "INFERENCE-TICK-INDEXED-PROGRESS-DATA", 1, 0, false);
        declareFunction(me, "inference_tick_indexed_progress_data_one_step", "INFERENCE-TICK-INDEXED-PROGRESS-DATA-ONE-STEP", 4, 0, false);
        declareFunction(me, "inference_tick_count", "INFERENCE-TICK-COUNT", 1, 0, false);
        declareFunction(me, "inference_hl_module_times", "INFERENCE-HL-MODULE-TIMES", 1, 0, false);
        declareFunction(me, "inference_hl_module_times_memoized_internal", "INFERENCE-HL-MODULE-TIMES-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction(me, "inference_hl_module_times_memoized", "INFERENCE-HL-MODULE-TIMES-MEMOIZED", 1, 0, false);
        declareFunction(me, "inference_update_hl_module_time", "INFERENCE-UPDATE-HL-MODULE-TIME", 3, 0, false);
        declareFunction(me, "possibly_update_hl_module_times", "POSSIBLY-UPDATE-HL-MODULE-TIMES", 1, 0, false);
        declareFunction(me, "inference_gathers_hl_module_timesP", "INFERENCE-GATHERS-HL-MODULE-TIMES?", 0, 1, false);
        declareFunction(me, "any_inference_gathers_hl_module_timesP", "ANY-INFERENCE-GATHERS-HL-MODULE-TIMES?", 0, 1, false);
        declareFunction(me, "problem_store_rule_binding_value_map", "PROBLEM-STORE-RULE-BINDING-VALUE-MAP", 1, 0, false);
        declareFunction(me, "rule_binding_value_map_from_rule_binding_tuples", "RULE-BINDING-VALUE-MAP-FROM-RULE-BINDING-TUPLES", 1, 0, false);
        declareFunction(me, "possibly_genericize_indeterminate_term", "POSSIBLY-GENERICIZE-INDETERMINATE-TERM", 1, 0, false);
        declareFunction(me, "problem_store_rule_binding_type_map", "PROBLEM-STORE-RULE-BINDING-TYPE-MAP", 1, 0, false);
        declareFunction(me, "problem_store_rule_bindings_tuples", "PROBLEM-STORE-RULE-BINDINGS-TUPLES", 1, 0, false);
        declareFunction(me, "rule_binding_type_map_from_rule_binding_tuples", "RULE-BINDING-TYPE-MAP-FROM-RULE-BINDING-TUPLES", 1, 0, false);
        declareFunction(me, "show_rule_binding_type_map", "SHOW-RULE-BINDING-TYPE-MAP", 1, 1, false);
        declareMacro(me, "gathering_forward_inference_metrics", "GATHERING-FORWARD-INFERENCE-METRICS");
        declareMacro(me, "show_forward_inference_metrics_of", "SHOW-FORWARD-INFERENCE-METRICS-OF");
        declareMacro(me, "show_new_forward_inference_metrics_of", "SHOW-NEW-FORWARD-INFERENCE-METRICS-OF");
        declareFunction(me, "forward_inference_metrics_time_index", "FORWARD-INFERENCE-METRICS-TIME-INDEX", 0, 0, false);
        declareFunction(me, "forward_inference_metrics_count_index", "FORWARD-INFERENCE-METRICS-COUNT-INDEX", 0, 0, false);
        declareFunction(me, "forward_inference_metrics_inference_index", "FORWARD-INFERENCE-METRICS-INFERENCE-INDEX", 0, 0, false);
        declareFunction(me, "finalize_forward_inference_metrics_inference_index", "FINALIZE-FORWARD-INFERENCE-METRICS-INFERENCE-INDEX", 0, 0, false);
        declareFunction(me, "forward_inference_metrics_gaf_index", "FORWARD-INFERENCE-METRICS-GAF-INDEX", 0, 0, false);
        declareFunction(me, "forward_inference_time_metric_total_time", "FORWARD-INFERENCE-TIME-METRIC-TOTAL-TIME", 1, 0, false);
        declareFunction(me, "forward_inference_metrics_successful_rule_index", "FORWARD-INFERENCE-METRICS-SUCCESSFUL-RULE-INDEX", 0, 0, false);
        declareFunction(me, "clear_forward_inference_metrics", "CLEAR-FORWARD-INFERENCE-METRICS", 0, 0, false);
        declareFunction(me, "save_forward_inference_metrics", "SAVE-FORWARD-INFERENCE-METRICS", 1, 1, false);
        declareFunction(me, "load_forward_inference_metrics", "LOAD-FORWARD-INFERENCE-METRICS", 1, 0, false);
        declareFunction(me, "elapsed_forward_inference_metric_time", "ELAPSED-FORWARD-INFERENCE-METRIC-TIME", 0, 0, false);
        declareFunction(me, "initial_forward_inference_metric_time", "INITIAL-FORWARD-INFERENCE-METRIC-TIME", 0, 0, false);
        declareFunction(me, "clear_get_forward_inference_metric_type_and_metric_list", "CLEAR-GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST", 0, 0, false);
        declareFunction(me, "remove_get_forward_inference_metric_type_and_metric_list", "REMOVE-GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST", 2, 0, false);
        declareFunction(me, "get_forward_inference_metric_type_and_metric_list_internal", "GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST-INTERNAL", 2, 0, false);
        declareFunction(me, "get_forward_inference_metric_type_and_metric_list", "GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST", 2, 0, false);
        declareFunction(me, "increment_forward_inference_metrics", "INCREMENT-FORWARD-INFERENCE-METRICS", 5, 0, false);
        declareFunction(me, "note_forward_inference_for_rule", "NOTE-FORWARD-INFERENCE-FOR-RULE", 2, 0, false);
        declareFunction(me, "note_forward_inference_successful_rule", "NOTE-FORWARD-INFERENCE-SUCCESSFUL-RULE", 1, 0, false);
        declareFunction(me, "forward_inference_metrics_info", "FORWARD-INFERENCE-METRICS-INFO", 0, 1, false);
        declareFunction(me, "forward_inference_metrics_info_for_rules", "FORWARD-INFERENCE-METRICS-INFO-FOR-RULES", 0, 2, false);
        declareFunction(me, "forward_inference_time_metric_total_time_from_cdr", "FORWARD-INFERENCE-TIME-METRIC-TOTAL-TIME-FROM-CDR", 1, 0, false);
        declareFunction(me, "forward_inference_successful_rules", "FORWARD-INFERENCE-SUCCESSFUL-RULES", 0, 0, false);
        declareFunction(me, "forward_inference_unsuccessful_rules", "FORWARD-INFERENCE-UNSUCCESSFUL-RULES", 0, 0, false);
        declareFunction(me, "all_forward_inference_metrics_rules", "ALL-FORWARD-INFERENCE-METRICS-RULES", 0, 0, false);
        declareFunction(me, "forward_inference_triggered_tms_rules", "FORWARD-INFERENCE-TRIGGERED-TMS-RULES", 0, 0, false);
        declareFunction(me, "forward_inference_success_metrics_from_info", "FORWARD-INFERENCE-SUCCESS-METRICS-FROM-INFO", 1, 0, false);
        declareFunction(me, "forward_inference_success_metrics", "FORWARD-INFERENCE-SUCCESS-METRICS", 0, 1, false);
        declareFunction(me, "forward_inference_metrics_time_totals", "FORWARD-INFERENCE-METRICS-TIME-TOTALS", 0, 0, false);
        declareFunction(me, "forward_inference_metrics_count_totals", "FORWARD-INFERENCE-METRICS-COUNT-TOTALS", 0, 0, false);
        declareFunction(me, "rule_forward_inference_metrics_deductions_from_trigger_gafs", "RULE-FORWARD-INFERENCE-METRICS-DEDUCTIONS-FROM-TRIGGER-GAFS", 1, 0, false);
        declareFunction(me, "rule_forward_inference_metrics_info", "RULE-FORWARD-INFERENCE-METRICS-INFO", 1, 0, false);
        declareFunction(me, "rule_forward_inference_metrics_info_int", "RULE-FORWARD-INFERENCE-METRICS-INFO-INT", 2, 0, false);
        declareFunction(me, "global_statistics_from_forward_inference_metrics_info", "GLOBAL-STATISTICS-FROM-FORWARD-INFERENCE-METRICS-INFO", 1, 0, false);
        declareFunction(me, "show_forward_inference_metrics", "SHOW-FORWARD-INFERENCE-METRICS", 0, 2, false);
        declareFunction(me, "show_forward_inference_metrics_of_asserting", "SHOW-FORWARD-INFERENCE-METRICS-OF-ASSERTING", 2, 2, false);
        declareFunction(me, "write_forward_inference_metrics_data", "WRITE-FORWARD-INFERENCE-METRICS-DATA", 1, 1, false);
        declareFunction(me, "forward_inference_metrics_rule_success_info", "FORWARD-INFERENCE-METRICS-RULE-SUCCESS-INFO", 3, 0, false);
        declareFunction(me, "reset_inference_metrics", "RESET-INFERENCE-METRICS", 0, 0, false);
        declareFunction(me, "show_inference_metrics", "SHOW-INFERENCE-METRICS", 0, 1, false);
        declareFunction(me, "show_inference_metric_percentage", "SHOW-INFERENCE-METRIC-PERCENTAGE", 3, 1, false);
        return NIL;
    }

    public static SubLObject init_inference_metrics_file() {
        defconstant("*DTP-INFERENCE-METRIC*", INFERENCE_METRIC);
        deflexical("*INFERENCE-METRICS-STORE*", SubLTrampolineFile.maybeDefault($inference_metrics_store$, $inference_metrics_store$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*INFERENCE-METRIC-PROPERTIES*", $list39);
        deflexical("*PROBLEM-STORE-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($problem_store_historical_count$, $problem_store_historical_count$, ZERO_INTEGER));
        deflexical("*FORWARD-PROBLEM-STORE-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($forward_problem_store_historical_count$, $forward_problem_store_historical_count$, ZERO_INTEGER));
        deflexical("*MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*", SubLTrampolineFile.maybeDefault($maximum_problem_store_historical_problem_count$, $maximum_problem_store_historical_problem_count$, ZERO_INTEGER));
        deflexical("*MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*", SubLTrampolineFile.maybeDefault($maximum_forward_problem_store_historical_problem_count$, $maximum_forward_problem_store_historical_problem_count$, ZERO_INTEGER));
        defvar("*EXPENSIVE-FORWARD-PROBLEM-STORE-THRESHOLD*", $int$1000);
        deflexical("*PROBLEM-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($problem_historical_count$, $problem_historical_count$, ZERO_INTEGER));
        deflexical("*GOOD-PROBLEM-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($good_problem_historical_count$, $good_problem_historical_count$, ZERO_INTEGER));
        deflexical("*NO-GOOD-PROBLEM-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($no_good_problem_historical_count$, $no_good_problem_historical_count$, ZERO_INTEGER));
        deflexical("*FORWARD-PROBLEM-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($forward_problem_historical_count$, $forward_problem_historical_count$, ZERO_INTEGER));
        deflexical("*SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($single_literal_problem_historical_count$, $single_literal_problem_historical_count$, ZERO_INTEGER));
        deflexical("*PROBLEM-LINK-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($problem_link_historical_count$, $problem_link_historical_count$, ZERO_INTEGER));
        deflexical("*STRUCTURAL-LINK-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($structural_link_historical_count$, $structural_link_historical_count$, ZERO_INTEGER));
        deflexical("*CONTENT-LINK-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($content_link_historical_count$, $content_link_historical_count$, ZERO_INTEGER));
        deflexical("*REMOVAL-LINK-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($removal_link_historical_count$, $removal_link_historical_count$, ZERO_INTEGER));
        deflexical("*TRANSFORMATION-LINK-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($transformation_link_historical_count$, $transformation_link_historical_count$, ZERO_INTEGER));
        deflexical("*DEPENDENT-LINK-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($dependent_link_historical_count$, $dependent_link_historical_count$, ZERO_INTEGER));
        deflexical("*SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($single_literal_problem_dependent_link_historical_count$, $single_literal_problem_dependent_link_historical_count$, ZERO_INTEGER));
        deflexical("*TACTIC-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($tactic_historical_count$, $tactic_historical_count$, ZERO_INTEGER));
        deflexical("*EXECUTED-TACTIC-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($executed_tactic_historical_count$, $executed_tactic_historical_count$, ZERO_INTEGER));
        deflexical("*DISCARDED-TACTIC-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($discarded_tactic_historical_count$, $discarded_tactic_historical_count$, ZERO_INTEGER));
        deflexical("*UNIFICATION-ATTEMPT-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($unification_attempt_historical_count$, $unification_attempt_historical_count$, ZERO_INTEGER));
        deflexical("*UNIFICATION-SUCCESS-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($unification_success_historical_count$, $unification_success_historical_count$, ZERO_INTEGER));
        deflexical("*SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($sbhl_cache_attempt_historical_count$, $sbhl_cache_attempt_historical_count$, ZERO_INTEGER));
        deflexical("*SBHL-CACHE-SUCCESS-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($sbhl_cache_success_historical_count$, $sbhl_cache_success_historical_count$, ZERO_INTEGER));
        deflexical("*SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($sbhl_graph_attempt_historical_count$, $sbhl_graph_attempt_historical_count$, ZERO_INTEGER));
        deflexical("*SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($sbhl_graph_success_historical_count$, $sbhl_graph_success_historical_count$, ZERO_INTEGER));
        deflexical("*SBHL-LINK-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($sbhl_link_historical_count$, $sbhl_link_historical_count$, ZERO_INTEGER));
        deflexical("*PROOF-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($proof_historical_count$, $proof_historical_count$, ZERO_INTEGER));
        deflexical("*INFERENCE-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($inference_historical_count$, $inference_historical_count$, ZERO_INTEGER));
        deflexical("*SUCCESSFUL-INFERENCE-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($successful_inference_historical_count$, $successful_inference_historical_count$, ZERO_INTEGER));
        deflexical("*FORWARD-INFERENCE-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($forward_inference_historical_count$, $forward_inference_historical_count$, ZERO_INTEGER));
        deflexical("*SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT*", SubLTrampolineFile.maybeDefault($successful_forward_inference_historical_count$, $successful_forward_inference_historical_count$, ZERO_INTEGER));
        defparameter("*FORCE-INFERENCE-TICK-INDEXED-PROGRESS-DATA-COLLECTION?*", NIL);
        defparameter("*FORCE-INFERENCE-HL-MODULE-TIMES-DATA-COLLECTION?*", NIL);
        defvar("*GATHERING-FORWARD-INFERENCE-METRICS?*", NIL);
        defparameter("*FORWARD-INFERENCE-LAST-METRIC-TIME*", NIL);
        deflexical("*FORWARD-INFERENCE-METRICS-TIME-INDEX*", SubLTrampolineFile.maybeDefault($forward_inference_metrics_time_index$, $forward_inference_metrics_time_index$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*FORWARD-INFERENCE-METRICS-COUNT-INDEX*", SubLTrampolineFile.maybeDefault($forward_inference_metrics_count_index$, $forward_inference_metrics_count_index$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*FORWARD-INFERENCE-METRICS-INFERENCE-INDEX*", SubLTrampolineFile.maybeDefault($forward_inference_metrics_inference_index$, $forward_inference_metrics_inference_index$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*FORWARD-INFERENCE-METRICS-GAF-INDEX*", SubLTrampolineFile.maybeDefault($forward_inference_metrics_gaf_index$, $forward_inference_metrics_gaf_index$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*FORWARD-INFERENCE-METRICS-SUCCESSFUL-RULE-INDEX*", SubLTrampolineFile.maybeDefault($forward_inference_metrics_successful_rule_index$, $forward_inference_metrics_successful_rule_index$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*GET-FORWARD-INFERENCE-METRIC-TYPE-AND-METRIC-LIST-CACHING-STATE*", NIL);
        deflexical("*FORWARD-INFERENCE-METRICS-LOCK*", make_lock($$$Forward_Inference_Metrics_Lock));
        return NIL;
    }

    public static SubLObject setup_inference_metrics_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_inference_metric$.getGlobalValue(), symbol_function(INFERENCE_METRIC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(INF_METRIC_NAME, _CSETF_INF_METRIC_NAME);
        def_csetf(INF_METRIC_EVALUATION_FUNC, _CSETF_INF_METRIC_EVALUATION_FUNC);
        def_csetf(INF_METRIC_EVALUATION_ARG1, _CSETF_INF_METRIC_EVALUATION_ARG1);
        def_csetf($sym16$INF_METRIC_CROSS_PRODUCT_, $sym17$_CSETF_INF_METRIC_CROSS_PRODUCT_);
        identity(INFERENCE_METRIC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_inference_metric$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_INFERENCE_METRIC_METHOD));
        note_funcall_helper_function(PRINT_INFERENCE_METRIC);
        declare_defglobal($inference_metrics_store$);
        declare_inference_metric($ANSWER_COUNT, INFERENCE_ANSWER_COUNT, $INFERENCE, UNPROVIDED);
        declare_inference_metric($ANSWER_COUNT_AT_30_SECONDS, INFERENCE_ANSWER_COUNT_AT_30_SECONDS, $INFERENCE, UNPROVIDED);
        declare_inference_metric($ANSWER_COUNT_AT_60_SECONDS, INFERENCE_ANSWER_COUNT_AT_60_SECONDS, $INFERENCE, UNPROVIDED);
        declare_inference_metric($TIME_TO_FIRST_ANSWER, INFERENCE_FIRST_ANSWER_ELAPSED_TIME, $INFERENCE, UNPROVIDED);
        declare_inference_metric($TIME_TO_LAST_ANSWER, INFERENCE_LAST_ANSWER_ELAPSED_TIME, $INFERENCE, UNPROVIDED);
        declare_inference_metric($HYPOTHESIZATION_TIME, INFERENCE_HYPOTHESIZATION_TIME, $INFERENCE, UNPROVIDED);
        declare_inference_metric($TOTAL_TIME, INFERENCE_CUMULATIVE_TIME, $INFERENCE, UNPROVIDED);
        declare_inference_metric($TIME_PER_ANSWER, INFERENCE_TIME_PER_ANSWER, $INFERENCE, UNPROVIDED);
        declare_inference_metric($STEPS_TO_FIRST_ANSWER, INFERENCE_FIRST_ANSWER_STEP_COUNT, $INFERENCE, UNPROVIDED);
        declare_inference_metric($STEPS_TO_LAST_ANSWER, INFERENCE_LAST_ANSWER_STEP_COUNT, $INFERENCE, UNPROVIDED);
        declare_inference_metric($TOTAL_STEPS, INFERENCE_CUMULATIVE_STEP_COUNT, $INFERENCE, UNPROVIDED);
        declare_inference_metric($STEPS_PER_ANSWER, INFERENCE_STEPS_PER_ANSWER, $INFERENCE, UNPROVIDED);
        declare_inference_metric($WASTED_TIME_AFTER_LAST_ANSWER, INFERENCE_WASTED_TIME_AFTER_LAST_ANSWER, $INFERENCE, UNPROVIDED);
        declare_inference_metric($LATENCY_IMPROVEMENT_FROM_ITERATIVITY, INFERENCE_LATENCY_IMPROVEMENT_FROM_ITERATIVITY, $INFERENCE, UNPROVIDED);
        declare_inference_metric($PROBLEM_COUNT, PROBLEM_STORE_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($PROBLEM_STORE_PROBLEM_COUNT, PROBLEM_STORE_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($PROOF_COUNT, PROBLEM_STORE_PROOF_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($PROBLEM_STORE_PROOF_COUNT, PROBLEM_STORE_PROOF_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($LINK_COUNT, PROBLEM_STORE_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($TACTIC_COUNT, PROBLEM_STORE_TACTIC_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($POSSIBLE_TACTIC_COUNT, PROBLEM_STORE_POSSIBLE_TACTIC_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($EXECUTED_TACTIC_COUNT, PROBLEM_STORE_EXECUTED_TACTIC_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($TACTIC_EXECUTION_COUNT, PROBLEM_STORE_TACTIC_EXECUTION_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($DISCARDED_TACTIC_COUNT, PROBLEM_STORE_DISCARDED_TACTIC_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($CONTENT_LINK_COUNT, PROBLEM_STORE_CONTENT_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($REMOVAL_LINK_COUNT, PROBLEM_STORE_REMOVAL_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($REWRITE_LINK_COUNT, PROBLEM_STORE_REWRITE_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($TRANSFORMATION_LINK_COUNT, PROBLEM_STORE_TRANSFORMATION_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($STRUCTURAL_LINK_COUNT, PROBLEM_STORE_STRUCTURAL_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($JOIN_ORDERED_LINK_COUNT, PROBLEM_STORE_JOIN_ORDERED_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($JOIN_LINK_COUNT, PROBLEM_STORE_JOIN_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($SPLIT_LINK_COUNT, PROBLEM_STORE_SPLIT_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($RESTRICTION_LINK_COUNT, PROBLEM_STORE_RESTRICTION_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($RESIDUAL_TRANSFORMATION_LINK_COUNT, PROBLEM_STORE_RESIDUAL_TRANSFORMATION_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($UNION_LINK_COUNT, PROBLEM_STORE_UNION_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($GOOD_PROBLEM_COUNT, PROBLEM_STORE_GOOD_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($NEUTRAL_PROBLEM_COUNT, PROBLEM_STORE_NEUTRAL_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($NO_GOOD_PROBLEM_COUNT, PROBLEM_STORE_NO_GOOD_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($SINGLE_LITERAL_PROBLEM_COUNT, PROBLEM_STORE_SINGLE_LITERAL_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($CONJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_CONJUNCTIVE_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($JOIN_PROBLEM_COUNT, PROBLEM_STORE_JOIN_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($SPLIT_PROBLEM_COUNT, PROBLEM_STORE_SPLIT_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($DISJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_DISJUNCTIVE_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($UNEXAMINED_PROBLEM_COUNT, PROBLEM_STORE_UNEXAMINED_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($EXAMINED_PROBLEM_COUNT, PROBLEM_STORE_EXAMINED_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($POSSIBLE_PROBLEM_COUNT, PROBLEM_STORE_POSSIBLE_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($PENDING_PROBLEM_COUNT, PROBLEM_STORE_PENDING_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($FINISHED_PROBLEM_COUNT, PROBLEM_STORE_FINISHED_PROBLEM_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($UNMANIFESTED_NON_FOCAL_COUNT, PROBLEM_STORE_UNMANIFESTED_NON_FOCAL_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($TRANSFORMATION_RULE_BINDINGS_TO_CLOSED, PROBLEM_STORE_TRANSFORMATION_RULE_BINDINGS_TO_CLOSED, $STORE, UNPROVIDED);
        declare_inference_metric($PROBLEM_QUERIES, PROBLEM_STORE_ALL_PROBLEM_QUERIES, $STORE, UNPROVIDED);
        declare_inference_metric($ANSWER_TIMES, INFERENCE_ANSWER_TIMES, $INFERENCE, UNPROVIDED);
        declare_inference_metric($ANSWER_STEP_COUNTS, INFERENCE_ANSWER_STEP_COUNTS, $INFERENCE, UNPROVIDED);
        declare_inference_metric($PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, $STORE, UNPROVIDED);
        declare_inference_metric($ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT, INFERENCE_TRANSFORMATION_FANOUT_ESTIMATE, $INFERENCE, UNPROVIDED);
        declare_inference_metric($TOP_LEVEL_REMOVAL_FANOUT, INFERENCE_TOP_LEVEL_REMOVAL_FANOUT, $INFERENCE, UNPROVIDED);
        declare_inference_metric($NEW_ROOT_INITIAL_REMOVAL_FANOUTS, INFERENCE_NEW_ROOT_INITIAL_REMOVAL_FANOUTS, $INFERENCE, UNPROVIDED);
        declare_inference_metric($PROOF_QUERY_PROPERTIES, INFERENCE_COMPUTE_PROOF_QUERY_PROPERTIES, $INFERENCE, UNPROVIDED);
        declare_inference_metric($ANSWER_PROOF_SPECS, INFERENCE_ALL_ANSWER_PROOF_SPECS, $INFERENCE, UNPROVIDED);
        declare_inference_metric($INFERENCE_PROOF_SPEC, INFERENCE_PROOF_SPEC, $INFERENCE, UNPROVIDED);
        declare_inference_metric($EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES, PROBLEM_STORE_EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES, $STORE, UNPROVIDED);
        declare_inference_metric($NEW_ROOT_METRICS, INFERENCE_NEW_ROOT_METRICS, $INFERENCE, UNPROVIDED);
        declare_inference_metric($UNEXAMINED_GOOD_PROBLEM_COUNT, PROBLEM_STORE_UNEXAMINED_GOOD_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($EXAMINED_GOOD_PROBLEM_COUNT, PROBLEM_STORE_EXAMINED_GOOD_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($POSSIBLE_GOOD_PROBLEM_COUNT, PROBLEM_STORE_POSSIBLE_GOOD_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($PENDING_GOOD_PROBLEM_COUNT, PROBLEM_STORE_PENDING_GOOD_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($FINISHED_GOOD_PROBLEM_COUNT, PROBLEM_STORE_FINISHED_GOOD_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($UNEXAMINED_NEUTRAL_PROBLEM_COUNT, PROBLEM_STORE_UNEXAMINED_NEUTRAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($EXAMINED_NEUTRAL_PROBLEM_COUNT, PROBLEM_STORE_EXAMINED_NEUTRAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($POSSIBLE_NEUTRAL_PROBLEM_COUNT, PROBLEM_STORE_POSSIBLE_NEUTRAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($PENDING_NEUTRAL_PROBLEM_COUNT, PROBLEM_STORE_PENDING_NEUTRAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($FINISHED_NEUTRAL_PROBLEM_COUNT, PROBLEM_STORE_FINISHED_NEUTRAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($UNEXAMINED_NO_GOOD_PROBLEM_COUNT, PROBLEM_STORE_UNEXAMINED_NO_GOOD_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($EXAMINED_NO_GOOD_PROBLEM_COUNT, PROBLEM_STORE_EXAMINED_NO_GOOD_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($POSSIBLE_NO_GOOD_PROBLEM_COUNT, PROBLEM_STORE_POSSIBLE_NO_GOOD_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($PENDING_NO_GOOD_PROBLEM_COUNT, PROBLEM_STORE_PENDING_NO_GOOD_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($FINISHED_NO_GOOD_PROBLEM_COUNT, PROBLEM_STORE_FINISHED_NO_GOOD_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($GOOD_SINGLE_LITERAL_PROBLEM_COUNT, PROBLEM_STORE_GOOD_SINGLE_LITERAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($GOOD_CONJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_GOOD_CONJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($GOOD_JOIN_PROBLEM_COUNT, PROBLEM_STORE_GOOD_JOIN_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($GOOD_SPLIT_PROBLEM_COUNT, PROBLEM_STORE_GOOD_SPLIT_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($GOOD_DISJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_GOOD_DISJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT, PROBLEM_STORE_NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($NEUTRAL_JOIN_PROBLEM_COUNT, PROBLEM_STORE_NEUTRAL_JOIN_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($NEUTRAL_SPLIT_PROBLEM_COUNT, PROBLEM_STORE_NEUTRAL_SPLIT_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT, PROBLEM_STORE_NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($NO_GOOD_JOIN_PROBLEM_COUNT, PROBLEM_STORE_NO_GOOD_JOIN_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($NO_GOOD_SPLIT_PROBLEM_COUNT, PROBLEM_STORE_NO_GOOD_SPLIT_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, PROBLEM_STORE_UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($UNEXAMINED_JOIN_PROBLEM_COUNT, PROBLEM_STORE_UNEXAMINED_JOIN_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($UNEXAMINED_SPLIT_PROBLEM_COUNT, PROBLEM_STORE_UNEXAMINED_SPLIT_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, PROBLEM_STORE_EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($EXAMINED_CONJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_EXAMINED_CONJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($EXAMINED_JOIN_PROBLEM_COUNT, PROBLEM_STORE_EXAMINED_JOIN_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($EXAMINED_SPLIT_PROBLEM_COUNT, PROBLEM_STORE_EXAMINED_SPLIT_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($EXAMINED_DISJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_EXAMINED_DISJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT, PROBLEM_STORE_POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($POSSIBLE_JOIN_PROBLEM_COUNT, PROBLEM_STORE_POSSIBLE_JOIN_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($POSSIBLE_SPLIT_PROBLEM_COUNT, PROBLEM_STORE_POSSIBLE_SPLIT_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($PENDING_SINGLE_LITERAL_PROBLEM_COUNT, PROBLEM_STORE_PENDING_SINGLE_LITERAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($PENDING_CONJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_PENDING_CONJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($PENDING_JOIN_PROBLEM_COUNT, PROBLEM_STORE_PENDING_JOIN_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($PENDING_SPLIT_PROBLEM_COUNT, PROBLEM_STORE_PENDING_SPLIT_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($PENDING_DISJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_PENDING_DISJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($FINISHED_SINGLE_LITERAL_PROBLEM_COUNT, PROBLEM_STORE_FINISHED_SINGLE_LITERAL_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($FINISHED_CONJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_FINISHED_CONJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($FINISHED_JOIN_PROBLEM_COUNT, PROBLEM_STORE_FINISHED_JOIN_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($FINISHED_SPLIT_PROBLEM_COUNT, PROBLEM_STORE_FINISHED_SPLIT_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($FINISHED_DISJUNCTIVE_PROBLEM_COUNT, PROBLEM_STORE_FINISHED_DISJUNCTIVE_PROBLEM_COUNT, $STORE, T);
        declare_inference_metric($SKSI_QUERY_TOTAL_TIME, SKSI_QUERY_TOTAL_TIME_ACCUMULATOR_LOOKUP, $INFERENCE, NIL);
        declare_inference_metric($SKSI_QUERY_START_TIMES, SKSI_QUERY_START_TIMES_ACCUMULATOR_LOOKUP, $INFERENCE, NIL);
        declare_inference_metric($SPARQL_QUERY_PROFILE, SPARQL_QUERY_PROFILE_ACCUMULATOR_LOOKUP, $INFERENCE, NIL);
        declare_inference_metric($TICK_INDEXED_PROGRESS_DATA, INFERENCE_TICK_INDEXED_PROGRESS_DATA, $INFERENCE, NIL);
        declare_inference_metric($INFERENCE_HL_MODULE_TIMES, INFERENCE_HL_MODULE_TIMES, $INFERENCE, NIL);
        declare_inference_metric($RULE_BINDING_VALUE_MAP, PROBLEM_STORE_RULE_BINDING_VALUE_MAP, $STORE, NIL);
        declare_defglobal($problem_store_historical_count$);
        declare_defglobal($forward_problem_store_historical_count$);
        declare_defglobal($maximum_problem_store_historical_problem_count$);
        declare_defglobal($maximum_forward_problem_store_historical_problem_count$);
        declare_defglobal($problem_historical_count$);
        declare_defglobal($good_problem_historical_count$);
        declare_defglobal($no_good_problem_historical_count$);
        declare_defglobal($forward_problem_historical_count$);
        declare_defglobal($single_literal_problem_historical_count$);
        declare_defglobal($problem_link_historical_count$);
        declare_defglobal($structural_link_historical_count$);
        declare_defglobal($content_link_historical_count$);
        declare_defglobal($removal_link_historical_count$);
        declare_defglobal($transformation_link_historical_count$);
        declare_defglobal($dependent_link_historical_count$);
        declare_defglobal($single_literal_problem_dependent_link_historical_count$);
        declare_defglobal($tactic_historical_count$);
        declare_defglobal($executed_tactic_historical_count$);
        declare_defglobal($discarded_tactic_historical_count$);
        declare_defglobal($unification_attempt_historical_count$);
        declare_defglobal($unification_success_historical_count$);
        declare_defglobal($sbhl_cache_attempt_historical_count$);
        declare_defglobal($sbhl_cache_success_historical_count$);
        declare_defglobal($sbhl_graph_attempt_historical_count$);
        declare_defglobal($sbhl_graph_success_historical_count$);
        declare_defglobal($sbhl_link_historical_count$);
        declare_defglobal($proof_historical_count$);
        declare_defglobal($inference_historical_count$);
        declare_defglobal($successful_inference_historical_count$);
        declare_defglobal($forward_inference_historical_count$);
        declare_defglobal($successful_forward_inference_historical_count$);
        note_funcall_helper_function(SKSI_QUERY_TOTAL_TIME_ACCUMULATOR_LOOKUP);
        note_funcall_helper_function(SKSI_QUERY_START_TIMES_ACCUMULATOR_LOOKUP);
        note_funcall_helper_function(SPARQL_QUERY_PROFILE_ACCUMULATOR_LOOKUP);
        memoization_state.note_memoized_function(INFERENCE_TICK_INDEXED_PROGRESS_DATA_MEMOIZED);
        memoization_state.note_memoized_function(INFERENCE_HL_MODULE_TIMES_MEMOIZED);
        declare_defglobal($forward_inference_metrics_time_index$);
        declare_defglobal($forward_inference_metrics_count_index$);
        declare_defglobal($forward_inference_metrics_inference_index$);
        declare_defglobal($forward_inference_metrics_gaf_index$);
        declare_defglobal($forward_inference_metrics_successful_rule_index$);
        memoization_state.note_globally_cached_function(GET_FORWARD_INFERENCE_METRIC_TYPE_AND_METRIC_LIST);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_metrics_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_metrics_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_metrics_file();
    }

    static {










































































































































































































































































































































































































































































































































    }

    public static final class $inference_metric_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $evaluation_func;

        public SubLObject $evaluation_arg1;

        public SubLObject $cross_productP;

        private static final SubLStructDeclNative structDecl;

        private $inference_metric_native() {
            this.$name = Lisp.NIL;
            this.$evaluation_func = Lisp.NIL;
            this.$evaluation_arg1 = Lisp.NIL;
            this.$cross_productP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$evaluation_func;
        }

        @Override
        public SubLObject getField4() {
            return this.$evaluation_arg1;
        }

        @Override
        public SubLObject getField5() {
            return this.$cross_productP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$evaluation_func = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$evaluation_arg1 = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$cross_productP = value;
        }

        static {
            structDecl = makeStructDeclNative($inference_metric_native.class, INFERENCE_METRIC, INFERENCE_METRIC_P, $list3, $list4, new String[]{ "$name", "$evaluation_func", "$evaluation_arg1", "$cross_productP" }, $list5, $list6, PRINT_INFERENCE_METRIC);
        }
    }

    public static final class $inference_metric_p$UnaryFunction extends UnaryFunction {
        public $inference_metric_p$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-METRIC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_metric_p(arg1);
        }
    }
}

/**
 * Total time: 1195 ms
 */
