/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.cycjava_1.cycl.inference;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.inference.ask_utilities;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
//dm import com.cyc.cycjava_1.cycl.integer_sequence_generator;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.inference.janus;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.kb_content_test.kct_utils;
//dm import com.cyc.cycjava_1.cycl.keyhash_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.leviathan;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.operation_communication;
//dm import com.cyc.cycjava_1.cycl.process_utilities;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.simplifier;
//dm import com.cyc.cycjava_1.cycl.special_variable_state;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_info;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class kbq_query_run extends SubLTranslatedFile {

  //// Constructor

  private kbq_query_run() {}
  public static final SubLFile me = new kbq_query_run();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.kbq_query_run";

  //// Definitions

  /** If non-nil, the runstate of the outer call to kct-run-test-set. */
  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1116) 
  private static SubLSymbol $kct_set_runstate$ = null;

  /** If non-nil, the runstate of the outer call to kct-run-test. */
  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1295) 
  private static SubLSymbol $kct_runstate$ = null;

  /** If non-nil, the runstate of the outer call to kbq-run-query. */
  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1401) 
  private static SubLSymbol $kbq_runstate$ = null;

  /** for backward compatibility */
  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 1793) 
  private static SubLSymbol $kbq_old_cfasl_common_symbols$ = null;

  /** See *query-metrics* */
  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 2273) 
  private static SubLSymbol $kbq_new_cfasl_common_symbols$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5242) 
  private static SubLSymbol $kbq_cfasl_common_symbols$ = null;

  /** for backward compatibility */
  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5480) 
  private static SubLSymbol $kct_old_cfasl_common_symbols$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5669) 
  private static SubLSymbol $kct_cfasl_common_symbols$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5861) 
  public static SubLSymbol $kbq_outlier_timeout$ = null;

  /** bound to the internal time units per second of the encompassing query set run */
  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 5944) 
  public static SubLSymbol $kbq_internal_time_units_per_second$ = null;

  /** The number of times the kbq harness runs the query.  Useful for profiling. */
  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 30927) 
  public static SubLSymbol $kbq_run_number$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 40859) 
  private static SubLSymbol $kct_test_metric_table$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 52273) 
  public static SubLSymbol $kbq_default_outlier_timeout$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 55917) 
  private static SubLSymbol $kbq_test_collection_to_query_set_query$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 61482) 
  private static SubLSymbol $last_query_set_run$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 70730) 
  private static SubLSymbol $last_test_set_run$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 77827) 
  public static final SubLObject kbq_runstate_validP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return kbq_runstate_p($kbq_runstate$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 78594) 
  public static final SubLObject possibly_set_kbq_runstate_inference(SubLObject inference) {
    if ((NIL != kbq_runstate_validP())) {
      if ((NIL == Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3195"))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3351");
      }
    }
    return NIL;
  }

  /** A sequence generator for IDs for runstate objects */
  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 79601) 
  private static SubLSymbol $runstate_isg$ = null;

  /** An index to support lookup of runstate objects by ID */
  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 79738) 
  private static SubLSymbol $runstate_index$ = null;

  public static final class $kbq_runstate_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $lock; }
    public SubLObject getField4() { return $query_spec; }
    public SubLObject getField5() { return $inference; }
    public SubLObject getField6() { return $result; }
    public SubLObject getField7() { return $test_runstate; }
    public SubLObject getField8() { return $run_status; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $lock = value; }
    public SubLObject setField4(SubLObject value) { return $query_spec = value; }
    public SubLObject setField5(SubLObject value) { return $inference = value; }
    public SubLObject setField6(SubLObject value) { return $result = value; }
    public SubLObject setField7(SubLObject value) { return $test_runstate = value; }
    public SubLObject setField8(SubLObject value) { return $run_status = value; }
    public SubLObject $id = NIL;
    public SubLObject $lock = NIL;
    public SubLObject $query_spec = NIL;
    public SubLObject $inference = NIL;
    public SubLObject $result = NIL;
    public SubLObject $test_runstate = NIL;
    public SubLObject $run_status = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($kbq_runstate_native.class, $sym228$KBQ_RUNSTATE, $sym229$KBQ_RUNSTATE_P, $list230, $list231, new String[] {"$id", "$lock", "$query_spec", "$inference", "$result", "$test_runstate", "$run_status"}, $list232, $list233, $sym234$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 83287) 
  public static SubLSymbol $dtp_kbq_runstate$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 83287) 
  public static final SubLObject kbq_runstate_p(SubLObject object) {
    return ((object.getClass() == $kbq_runstate_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $kbq_runstate_p$UnaryFunction extends UnaryFunction {
    public $kbq_runstate_p$UnaryFunction() { super(extractFunctionNamed("KBQ-RUNSTATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return kbq_runstate_p(arg1); }
  }

  public static final class $kct_runstate_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $lock; }
    public SubLObject getField4() { return $test_spec; }
    public SubLObject getField5() { return $result; }
    public SubLObject getField6() { return $query_runstate; }
    public SubLObject getField7() { return $test_set_runstate; }
    public SubLObject getField8() { return $run_status; }
    public SubLObject getField9() { return $start; }
    public SubLObject getField10() { return $end; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $lock = value; }
    public SubLObject setField4(SubLObject value) { return $test_spec = value; }
    public SubLObject setField5(SubLObject value) { return $result = value; }
    public SubLObject setField6(SubLObject value) { return $query_runstate = value; }
    public SubLObject setField7(SubLObject value) { return $test_set_runstate = value; }
    public SubLObject setField8(SubLObject value) { return $run_status = value; }
    public SubLObject setField9(SubLObject value) { return $start = value; }
    public SubLObject setField10(SubLObject value) { return $end = value; }
    public SubLObject $id = NIL;
    public SubLObject $lock = NIL;
    public SubLObject $test_spec = NIL;
    public SubLObject $result = NIL;
    public SubLObject $query_runstate = NIL;
    public SubLObject $test_set_runstate = NIL;
    public SubLObject $run_status = NIL;
    public SubLObject $start = NIL;
    public SubLObject $end = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($kct_runstate_native.class, $sym262$KCT_RUNSTATE, $sym257$KCT_RUNSTATE_P, $list263, $list264, new String[] {"$id", "$lock", "$test_spec", "$result", "$query_runstate", "$test_set_runstate", "$run_status", "$start", "$end"}, $list265, $list266, $sym234$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 86455) 
  public static SubLSymbol $dtp_kct_runstate$ = null;

  public static final class $kct_runstate_p$UnaryFunction extends UnaryFunction {
    public $kct_runstate_p$UnaryFunction() { super(extractFunctionNamed("KCT-RUNSTATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3279"); }
  }

  public static final class $kct_set_runstate_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $lock; }
    public SubLObject getField4() { return $test_set; }
    public SubLObject getField5() { return $result; }
    public SubLObject getField6() { return $test_runstates; }
    public SubLObject getField7() { return $run_status; }
    public SubLObject getField8() { return $start; }
    public SubLObject getField9() { return $end; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $lock = value; }
    public SubLObject setField4(SubLObject value) { return $test_set = value; }
    public SubLObject setField5(SubLObject value) { return $result = value; }
    public SubLObject setField6(SubLObject value) { return $test_runstates = value; }
    public SubLObject setField7(SubLObject value) { return $run_status = value; }
    public SubLObject setField8(SubLObject value) { return $start = value; }
    public SubLObject setField9(SubLObject value) { return $end = value; }
    public SubLObject $id = NIL;
    public SubLObject $lock = NIL;
    public SubLObject $test_set = NIL;
    public SubLObject $result = NIL;
    public SubLObject $test_runstates = NIL;
    public SubLObject $run_status = NIL;
    public SubLObject $start = NIL;
    public SubLObject $end = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($kct_set_runstate_native.class, $sym294$KCT_SET_RUNSTATE, $sym291$KCT_SET_RUNSTATE_P, $list295, $list296, new String[] {"$id", "$lock", "$test_set", "$result", "$test_runstates", "$run_status", "$start", "$end"}, $list297, $list298, $sym234$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 91508) 
  public static SubLSymbol $dtp_kct_set_runstate$ = null;

  public static final class $kct_set_runstate_p$UnaryFunction extends UnaryFunction {
    public $kct_set_runstate_p$UnaryFunction() { super(extractFunctionNamed("KCT-SET-RUNSTATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3294"); }
  }

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 102783) 
  public static SubLSymbol $query_set_run_file_extension$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 122476) 
  private static SubLSymbol $kbq_filter_query_set_run_to_queries$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 123438) 
  private static SubLSymbol $kct_filter_test_set_run_to_tests$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 125023) 
  private static SubLSymbol $cached_all_instances_among_caching_state$ = null;

  public static final class $clear_cached_all_instances_among$ZeroArityFunction extends ZeroArityFunction {
    public $clear_cached_all_instances_among$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-CACHED-ALL-INSTANCES-AMONG")); }
    public SubLObject processItem() { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3001"); }
  }

  /** The statistics we want to see in the summary, and whether it's good for them to increase or decrease. */
  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 144562) 
  public static SubLSymbol $kbq_summary_statistics$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 164764) 
  public static SubLSymbol $kbq_progress_stream$ = null;

  @SubL(source = "cycl/inference/kbq-query-run.lisp", position = 164977) 
  public static SubLSymbol $kbq_benchmark_outlier_timeout$ = null;

  public static final SubLObject declare_kbq_query_run_file() {
    //declareFunction(myName, "kct_success_result_p", "KCT-SUCCESS-RESULT-P", 1, 0, false);
    //declareFunction(myName, "kct_failure_result_p", "KCT-FAILURE-RESULT-P", 1, 0, false);
    //declareFunction(myName, "kct_error_result_p", "KCT-ERROR-RESULT-P", 1, 0, false);
    //declareFunction(myName, "kbq_cfasl_common_symbols", "KBQ-CFASL-COMMON-SYMBOLS", 0, 0, false);
    //declareMacro(myName, "with_kbq_query_set_run", "WITH-KBQ-QUERY-SET-RUN");
    //declareFunction(myName, "kbq_query_run_p", "KBQ-QUERY-RUN-P", 1, 0, false);
    //declareFunction(myName, "kbq_discard_query_run_result", "KBQ-DISCARD-QUERY-RUN-RESULT", 1, 0, false);
    //declareFunction(myName, "kbq_discard_query_run_properties", "KBQ-DISCARD-QUERY-RUN-PROPERTIES", 2, 0, false);
    //declareFunction(myName, "kbq_query_run_query", "KBQ-QUERY-RUN-QUERY", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_result", "KBQ-QUERY-RUN-RESULT", 1, 0, false);
    //declareFunction(myName, "kbq_extract_query_run_metric_value", "KBQ-EXTRACT-QUERY-RUN-METRIC-VALUE", 2, 1, false);
    //declareFunction(myName, "kbq_query_run_answerableP", "KBQ-QUERY-RUN-ANSWERABLE?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_unanswerableP", "KBQ-QUERY-RUN-UNANSWERABLE?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_answer_count", "KBQ-QUERY-RUN-ANSWER-COUNT", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time", "KBQ-QUERY-RUN-TOTAL-TIME", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_complete_total_time", "KBQ-QUERY-RUN-COMPLETE-TOTAL-TIME", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_time_to_first_answer", "KBQ-QUERY-RUN-TIME-TO-FIRST-ANSWER", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_time_to_last_answer", "KBQ-QUERY-RUN-TIME-TO-LAST-ANSWER", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_complete_time_to_first_answer", "KBQ-QUERY-RUN-COMPLETE-TIME-TO-FIRST-ANSWER", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_complete_time_to_last_answer", "KBQ-QUERY-RUN-COMPLETE-TIME-TO-LAST-ANSWER", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_steps", "KBQ-QUERY-RUN-TOTAL-STEPS", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_steps_to_first_answer", "KBQ-QUERY-RUN-STEPS-TO-FIRST-ANSWER", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_steps_to_last_answer", "KBQ-QUERY-RUN-STEPS-TO-LAST-ANSWER", 1, 0, false);
    //declareFunction(myName, "kbq_extract_query_run_property_value", "KBQ-EXTRACT-QUERY-RUN-PROPERTY-VALUE", 2, 0, false);
    //declareFunction(myName, "kbq_query_run_property_value", "KBQ-QUERY-RUN-PROPERTY-VALUE", 2, 1, false);
    //declareFunction(myName, "kbq_internal_real_time_to_seconds", "KBQ-INTERNAL-REAL-TIME-TO-SECONDS", 1, 0, false);
    //declareFunction(myName, "kbq_seconds_to_internal_real_time", "KBQ-SECONDS-TO-INTERNAL-REAL-TIME", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_halt_reason", "KBQ-QUERY-RUN-HALT-REASON", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_timed_outP", "KBQ-QUERY-RUN-TIMED-OUT?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_tautologyP", "KBQ-QUERY-RUN-TAUTOLOGY?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_less_than_1000_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-1000-SECONDS?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_less_than_100_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-100-SECONDS?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_less_than_10_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-10-SECONDS?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_less_than_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-A-SECOND?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_less_than_a_tenth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-A-TENTH-OF-A-SECOND?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_less_than_a_hundredth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-LESS-THAN-A-HUNDREDTH-OF-A-SECOND?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_more_than_1000_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-1000-SECONDS?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_more_than_100_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-100-SECONDS?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_more_than_10_secondsP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-10-SECONDS?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_more_than_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-A-SECOND?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_more_than_a_tenth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-A-TENTH-OF-A-SECOND?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_total_time_more_than_a_hundredth_of_a_secondP", "KBQ-QUERY-RUN-TOTAL-TIME-MORE-THAN-A-HUNDREDTH-OF-A-SECOND?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_more_than_1000_answersP", "KBQ-QUERY-RUN-MORE-THAN-1000-ANSWERS?", 1, 0, false);
    //declareFunction(myName, "kbq_query_run_inference_proof_spec_cons_count", "KBQ-QUERY-RUN-INFERENCE-PROOF-SPEC-CONS-COUNT", 1, 0, false);
    //declareFunction(myName, "kbq_sentence_truth_query_runP", "KBQ-SENTENCE-TRUTH-QUERY-RUN?", 1, 0, false);
    //declareFunction(myName, "compute_new_root_relative_answer_times", "COMPUTE-NEW-ROOT-RELATIVE-ANSWER-TIMES", 2, 0, false);
    //declareFunction(myName, "kct_test_run_p", "KCT-TEST-RUN-P", 1, 0, false);
    //declareFunction(myName, "kct_make_test_run", "KCT-MAKE-TEST-RUN", 3, 0, false);
    //declareFunction(myName, "kct_test_run_test", "KCT-TEST-RUN-TEST", 1, 0, false);
    //declareFunction(myName, "kct_test_run_query_run", "KCT-TEST-RUN-QUERY-RUN", 1, 0, false);
    //declareFunction(myName, "kct_test_run_status", "KCT-TEST-RUN-STATUS", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_p", "KBQ-QUERY-SET-RUN-P", 1, 0, false);
    //declareFunction(myName, "kbq_make_query_set_run", "KBQ-MAKE-QUERY-SET-RUN", 1, 1, false);
    //declareFunction(myName, "kbq_nmerge_query_set_runs", "KBQ-NMERGE-QUERY-SET-RUNS", 1, 1, false);
    //declareFunction(myName, "kbq_discard_query_set_run_results", "KBQ-DISCARD-QUERY-SET-RUN-RESULTS", 1, 0, false);
    //declareFunction(myName, "kbq_discard_query_set_run_properties", "KBQ-DISCARD-QUERY-SET-RUN-PROPERTIES", 2, 0, false);
    //declareFunction(myName, "kbq_make_query_set_run_from_test_set_run", "KBQ-MAKE-QUERY-SET-RUN-FROM-TEST-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_property_value", "KBQ-QUERY-SET-RUN-PROPERTY-VALUE", 2, 1, false);
    //declareFunction(myName, "kbq_query_set_run_comment", "KBQ-QUERY-SET-RUN-COMMENT", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_query_runs", "KBQ-QUERY-SET-RUN-QUERY-RUNS", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_patch_level", "KBQ-QUERY-SET-RUN-PATCH-LEVEL", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_internal_time_units_per_second", "KBQ-QUERY-SET-RUN-INTERNAL-TIME-UNITS-PER-SECOND", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_put_query_run_property", "KBQ-QUERY-SET-RUN-PUT-QUERY-RUN-PROPERTY", 3, 0, false);
    //declareFunction(myName, "kbq_extract_query_property_values", "KBQ-EXTRACT-QUERY-PROPERTY-VALUES", 2, 0, false);
    //declareFunction(myName, "kbq_extract_metric_values", "KBQ-EXTRACT-METRIC-VALUES", 2, 1, false);
    //declareFunction(myName, "kbq_extract_property_values", "KBQ-EXTRACT-PROPERTY-VALUES", 2, 1, false);
    //declareFunction(myName, "kbq_query_set_run_queries", "KBQ-QUERY-SET-RUN-QUERIES", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_query_count", "KBQ-QUERY-SET-RUN-QUERY-COUNT", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_valid_queries", "KBQ-QUERY-SET-RUN-VALID-QUERIES", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_runnable_queries", "KBQ-QUERY-SET-RUN-RUNNABLE-QUERIES", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_remove_invalid_queries", "KBQ-QUERY-SET-RUN-REMOVE-INVALID-QUERIES", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_remove_unrunnable_queries", "KBQ-QUERY-SET-RUN-REMOVE-UNRUNNABLE-QUERIES", 1, 0, false);
    //declareFunction(myName, "kbq_compute_pad_table", "KBQ-COMPUTE-PAD-TABLE", 1, 0, false);
    //declareFunction(myName, "kbq_queries_within_n_of_median", "KBQ-QUERIES-WITHIN-N-OF-MEDIAN", 2, 1, false);
    //declareFunction(myName, "kbq_median_metric", "KBQ-MEDIAN-METRIC", 1, 0, false);
    //declareFunction(myName, "kbq_mean_metric", "KBQ-MEAN-METRIC", 1, 0, false);
    //declareFunction(myName, "kbq_function_for_metric", "KBQ-FUNCTION-FOR-METRIC", 1, 0, false);
    //declareFunction(myName, "kct_test_set_run_p", "KCT-TEST-SET-RUN-P", 1, 0, false);
    //declareFunction(myName, "kct_make_test_set_run", "KCT-MAKE-TEST-SET-RUN", 1, 1, false);
    //declareFunction(myName, "kct_nmerge_test_set_runs", "KCT-NMERGE-TEST-SET-RUNS", 1, 1, false);
    //declareFunction(myName, "kct_test_set_run_comment", "KCT-TEST-SET-RUN-COMMENT", 1, 0, false);
    //declareFunction(myName, "kct_test_set_run_internal_time_units_per_second", "KCT-TEST-SET-RUN-INTERNAL-TIME-UNITS-PER-SECOND", 1, 0, false);
    //declareFunction(myName, "kct_test_set_run_test_runs", "KCT-TEST-SET-RUN-TEST-RUNS", 1, 0, false);
    //declareFunction(myName, "kct_test_set_run_tests", "KCT-TEST-SET-RUN-TESTS", 1, 0, false);
    //declareFunction(myName, "kct_test_set_run_valid_tests", "KCT-TEST-SET-RUN-VALID-TESTS", 1, 0, false);
    //declareFunction(myName, "kct_test_set_run_remove_invalid_tests", "KCT-TEST-SET-RUN-REMOVE-INVALID-TESTS", 1, 0, false);
    //declareFunction(myName, "kbq_run_query", "KBQ-RUN-QUERY", 1, 4, false);
    //declareFunction(myName, "kbq_run_query_and_maybe_destroy", "KBQ-RUN-QUERY-AND-MAYBE-DESTROY", 4, 0, false);
    //declareFunction(myName, "kbq_run_query_int", "KBQ-RUN-QUERY-INT", 3, 0, false);
    //declareFunction(myName, "any_kct_followup_test_formula_gafsP", "ANY-KCT-FOLLOWUP-TEST-FORMULA-GAFS?", 1, 0, false);
    //declareFunction(myName, "kct_run_test", "KCT-RUN-TEST", 1, 5, false);
    //declareFunction(myName, "kb_test_metrics_to_query_metrics", "KB-TEST-METRICS-TO-QUERY-METRICS", 1, 0, false);
    //declareFunction(myName, "kb_test_metric_to_query_metric", "KB-TEST-METRIC-TO-QUERY-METRIC", 1, 0, false);
    //declareFunction(myName, "kct_compute_test_status", "KCT-COMPUTE-TEST-STATUS", 2, 0, false);
    //declareFunction(myName, "kct_compute_janus_test_status", "KCT-COMPUTE-JANUS-TEST-STATUS", 2, 0, false);
    //declareFunction(myName, "kct_followup_test_formula_all_holdsP", "KCT-FOLLOWUP-TEST-FORMULA-ALL-HOLDS?", 7, 0, false);
    //declareFunction(myName, "kct_followup_test_formula_some_holdsP", "KCT-FOLLOWUP-TEST-FORMULA-SOME-HOLDS?", 6, 0, false);
    //declareFunction(myName, "kct_followup_test_formula_none_holdsP", "KCT-FOLLOWUP-TEST-FORMULA-NONE-HOLDS?", 6, 0, false);
    //declareFunction(myName, "kct_followup_test_formula_result", "KCT-FOLLOWUP-TEST-FORMULA-RESULT", 6, 0, false);
    //declareFunction(myName, "kct_test_query_results_satisfy_exact_set_of_binding_sets", "KCT-TEST-QUERY-RESULTS-SATISFY-EXACT-SET-OF-BINDING-SETS", 2, 0, false);
    //declareFunction(myName, "kct_test_query_results_satisfy_wanted_binding_sets", "KCT-TEST-QUERY-RESULTS-SATISFY-WANTED-BINDING-SETS", 2, 0, false);
    //declareFunction(myName, "kct_test_query_results_satisfy_unwanted_binding_sets", "KCT-TEST-QUERY-RESULTS-SATISFY-UNWANTED-BINDING-SETS", 2, 0, false);
    //declareFunction(myName, "kct_test_query_results_satisfy_binding_sets_cardinality", "KCT-TEST-QUERY-RESULTS-SATISFY-BINDING-SETS-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "kct_test_query_results_satisfy_binding_sets_min_cardinality", "KCT-TEST-QUERY-RESULTS-SATISFY-BINDING-SETS-MIN-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "kct_test_query_results_satisfy_binding_sets_max_cardinality", "KCT-TEST-QUERY-RESULTS-SATISFY-BINDING-SETS-MAX-CARDINALITY", 2, 0, false);
    //declareFunction(myName, "why_kct_failure", "WHY-KCT-FAILURE", 2, 0, false);
    //declareFunction(myName, "why_kct_binding_cardinality_failure", "WHY-KCT-BINDING-CARDINALITY-FAILURE", 2, 0, false);
    //declareFunction(myName, "why_kct_binding_match_failure", "WHY-KCT-BINDING-MATCH-FAILURE", 2, 0, false);
    //declareFunction(myName, "kct_format_binding_sets_list", "KCT-FORMAT-BINDING-SETS-LIST", 1, 0, false);
    //declareFunction(myName, "kbq_run_query_set", "KBQ-RUN-QUERY-SET", 1, 12, false);
    //declareFunction(myName, "abort_kbq_run_query_set", "ABORT-KBQ-RUN-QUERY-SET", 0, 0, false);
    //declareFunction(myName, "kbq_query_spec_set_elements", "KBQ-QUERY-SPEC-SET-ELEMENTS", 1, 2, false);
    //declareFunction(myName, "all_instantiations_via_inference", "ALL-INSTANTIATIONS-VIA-INFERENCE", 2, 0, false);
    //declareFunction(myName, "kbq_test_collection_to_query_set", "KBQ-TEST-COLLECTION-TO-QUERY-SET", 1, 0, false);
    //declareFunction(myName, "kct_run_test_set", "KCT-RUN-TEST-SET", 1, 13, false);
    //declareFunction(myName, "abort_kct_run_test_set", "ABORT-KCT-RUN-TEST-SET", 0, 0, false);
    //declareFunction(myName, "kct_test_spec_set_elements", "KCT-TEST-SPEC-SET-ELEMENTS", 1, 2, false);
    //declareMacro(myName, "run_kbq_experiment", "RUN-KBQ-EXPERIMENT");
    //declareFunction(myName, "run_kbq_experiment_internal", "RUN-KBQ-EXPERIMENT-INTERNAL", 1, 0, false);
    //declareFunction(myName, "print_kbq_experiment_analysis_to_file", "PRINT-KBQ-EXPERIMENT-ANALYSIS-TO-FILE", 3, 0, false);
    //declareFunction(myName, "kbq_erroring_queries", "KBQ-ERRORING-QUERIES", 1, 0, false);
    //declareFunction(myName, "kbq_erroring_query_count", "KBQ-ERRORING-QUERY-COUNT", 1, 0, false);
    //declareFunction(myName, "kbq_count_erroring_query_runs", "KBQ-COUNT-ERRORING-QUERY-RUNS", 1, 0, false);
    //declareFunction(myName, "kbq_erroring_query_runP", "KBQ-ERRORING-QUERY-RUN?", 1, 0, false);
    //declareFunction(myName, "kbq_if_file_exists_handling_p", "KBQ-IF-FILE-EXISTS-HANDLING-P", 1, 0, false);
    //declareFunction(myName, "kbq_experiment_augmentability_status", "KBQ-EXPERIMENT-AUGMENTABILITY-STATUS", 2, 0, false);
    //declareFunction(myName, "kbq_setup_file_handling", "KBQ-SETUP-FILE-HANDLING", 3, 0, false);
    //declareFunction(myName, "kbq_queries_not_yet_run", "KBQ-QUERIES-NOT-YET-RUN", 2, 0, false);
    //declareFunction(myName, "kbq_compute_rerun_errors_filename", "KBQ-COMPUTE-RERUN-ERRORS-FILENAME", 1, 0, false);
    //declareFunction(myName, "kbq_candidate_rerun_errors_filename", "KBQ-CANDIDATE-RERUN-ERRORS-FILENAME", 2, 0, false);
    //declareFunction(myName, "kbq_load_query_set_run_and_merge_reruns", "KBQ-LOAD-QUERY-SET-RUN-AND-MERGE-RERUNS", 1, 0, false);
    //declareFunction(myName, "kbq_merge_query_set_run_with_rerun", "KBQ-MERGE-QUERY-SET-RUN-WITH-RERUN", 2, 0, false);
    //declareMacro(myName, "run_kct_experiment", "RUN-KCT-EXPERIMENT");
    //declareFunction(myName, "run_kct_experiment_internal", "RUN-KCT-EXPERIMENT-INTERNAL", 1, 0, false);
    //declareFunction(myName, "print_kct_experiment_analysis_to_file", "PRINT-KCT-EXPERIMENT-ANALYSIS-TO-FILE", 3, 0, false);
    //declareFunction(myName, "kct_erroring_tests", "KCT-ERRORING-TESTS", 1, 0, false);
    //declareFunction(myName, "kct_erroring_test_count", "KCT-ERRORING-TEST-COUNT", 1, 0, false);
    //declareFunction(myName, "kct_count_erroring_test_runs", "KCT-COUNT-ERRORING-TEST-RUNS", 1, 0, false);
    //declareFunction(myName, "kct_erroring_test_runP", "KCT-ERRORING-TEST-RUN?", 1, 0, false);
    //declareFunction(myName, "kct_setup_file_handling", "KCT-SETUP-FILE-HANDLING", 3, 0, false);
    //declareFunction(myName, "kct_tests_not_yet_run", "KCT-TESTS-NOT-YET-RUN", 2, 0, false);
    //declareFunction(myName, "kct_compute_rerun_errors_filename", "KCT-COMPUTE-RERUN-ERRORS-FILENAME", 1, 0, false);
    //declareFunction(myName, "kct_candidate_rerun_errors_filename", "KCT-CANDIDATE-RERUN-ERRORS-FILENAME", 2, 0, false);
    //declareFunction(myName, "kct_load_test_set_run_and_merge_reruns", "KCT-LOAD-TEST-SET-RUN-AND-MERGE-RERUNS", 1, 0, false);
    //declareFunction(myName, "kct_merge_test_set_run_with_rerun", "KCT-MERGE-TEST-SET-RUN-WITH-RERUN", 2, 0, false);
    declareFunction(myName, "kbq_runstate_validP", "KBQ-RUNSTATE-VALID?", 0, 0, false);
    //declareFunction(myName, "kbq_runstate_inference_already_setP", "KBQ-RUNSTATE-INFERENCE-ALREADY-SET?", 0, 0, false);
    //declareFunction(myName, "set_kbq_runstate_inference", "SET-KBQ-RUNSTATE-INFERENCE", 1, 0, false);
    declareFunction(myName, "possibly_set_kbq_runstate_inference", "POSSIBLY-SET-KBQ-RUNSTATE-INFERENCE", 1, 0, false);
    //declareFunction(myName, "find_kbq_runstate_by_id", "FIND-KBQ-RUNSTATE-BY-ID", 1, 0, false);
    //declareFunction(myName, "find_kbq_runstate_by_id_string", "FIND-KBQ-RUNSTATE-BY-ID-STRING", 1, 0, false);
    //declareFunction(myName, "find_kct_runstate_by_id", "FIND-KCT-RUNSTATE-BY-ID", 1, 0, false);
    //declareFunction(myName, "find_kct_runstate_by_id_string", "FIND-KCT-RUNSTATE-BY-ID-STRING", 1, 0, false);
    //declareFunction(myName, "find_kct_set_runstate_by_id", "FIND-KCT-SET-RUNSTATE-BY-ID", 1, 0, false);
    //declareFunction(myName, "find_kct_set_runstate_by_id_string", "FIND-KCT-SET-RUNSTATE-BY-ID-STRING", 1, 0, false);
    //declareFunction(myName, "next_runstate_id", "NEXT-RUNSTATE-ID", 0, 0, false);
    //declareFunction(myName, "runstate_add_object", "RUNSTATE-ADD-OBJECT", 2, 0, false);
    //declareFunction(myName, "runstate_rem_object", "RUNSTATE-REM-OBJECT", 1, 0, false);
    //declareFunction(myName, "runstate_find_object_by_id", "RUNSTATE-FIND-OBJECT-BY-ID", 1, 0, false);
    //declareFunction(myName, "runstate_constant", "RUNSTATE-CONSTANT", 1, 0, false);
    //declareFunction(myName, "runstate_result_status", "RUNSTATE-RESULT-STATUS", 1, 0, false);
    //declareFunction(myName, "runstate_result_text", "RUNSTATE-RESULT-TEXT", 1, 0, false);
    //declareFunction(myName, "runstate_run_status", "RUNSTATE-RUN-STATUS", 1, 0, false);
    //declareFunction(myName, "runstate_inference", "RUNSTATE-INFERENCE", 1, 0, false);
    //declareFunction(myName, "runstate_start", "RUNSTATE-START", 1, 0, false);
    //declareFunction(myName, "runstate_end", "RUNSTATE-END", 1, 0, false);
    //declareFunction(myName, "set_runstate_run_status", "SET-RUNSTATE-RUN-STATUS", 2, 0, false);
    //declareFunction(myName, "destroy_runstate", "DESTROY-RUNSTATE", 1, 0, false);
    declareFunction(myName, "kbq_runstate_print_function_trampoline", "KBQ-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "kbq_runstate_p", "KBQ-RUNSTATE-P", 1, 0, false); new $kbq_runstate_p$UnaryFunction();
    //declareFunction(myName, "kbqr_id", "KBQR-ID", 1, 0, false);
    //declareFunction(myName, "kbqr_lock", "KBQR-LOCK", 1, 0, false);
    //declareFunction(myName, "kbqr_query_spec", "KBQR-QUERY-SPEC", 1, 0, false);
    //declareFunction(myName, "kbqr_inference", "KBQR-INFERENCE", 1, 0, false);
    //declareFunction(myName, "kbqr_result", "KBQR-RESULT", 1, 0, false);
    //declareFunction(myName, "kbqr_test_runstate", "KBQR-TEST-RUNSTATE", 1, 0, false);
    //declareFunction(myName, "kbqr_run_status", "KBQR-RUN-STATUS", 1, 0, false);
    //declareFunction(myName, "_csetf_kbqr_id", "_CSETF-KBQR-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_kbqr_lock", "_CSETF-KBQR-LOCK", 2, 0, false);
    //declareFunction(myName, "_csetf_kbqr_query_spec", "_CSETF-KBQR-QUERY-SPEC", 2, 0, false);
    //declareFunction(myName, "_csetf_kbqr_inference", "_CSETF-KBQR-INFERENCE", 2, 0, false);
    //declareFunction(myName, "_csetf_kbqr_result", "_CSETF-KBQR-RESULT", 2, 0, false);
    //declareFunction(myName, "_csetf_kbqr_test_runstate", "_CSETF-KBQR-TEST-RUNSTATE", 2, 0, false);
    //declareFunction(myName, "_csetf_kbqr_run_status", "_CSETF-KBQR-RUN-STATUS", 2, 0, false);
    //declareFunction(myName, "make_kbq_runstate", "MAKE-KBQ-RUNSTATE", 0, 1, false);
    //declareFunction(myName, "new_kbq_runstate", "NEW-KBQ-RUNSTATE", 2, 0, false);
    //declareFunction(myName, "destroy_kbq_runstate", "DESTROY-KBQ-RUNSTATE", 1, 0, false);
    //declareFunction(myName, "kbq_runstate_query_spec", "KBQ-RUNSTATE-QUERY-SPEC", 1, 0, false);
    //declareFunction(myName, "kbq_runstate_lock", "KBQ-RUNSTATE-LOCK", 1, 0, false);
    //declareFunction(myName, "kbq_runstate_inference", "KBQ-RUNSTATE-INFERENCE", 1, 0, false);
    //declareFunction(myName, "kbq_runstate_result", "KBQ-RUNSTATE-RESULT", 1, 0, false);
    //declareFunction(myName, "kbq_runstate_test_runstate", "KBQ-RUNSTATE-TEST-RUNSTATE", 1, 0, false);
    //declareFunction(myName, "kbq_runstate_run_status", "KBQ-RUNSTATE-RUN-STATUS", 1, 0, false);
    //declareFunction(myName, "set_kbqr_inference", "SET-KBQR-INFERENCE", 2, 0, false);
    //declareFunction(myName, "set_kbqr_result", "SET-KBQR-RESULT", 2, 0, false);
    //declareFunction(myName, "set_kbqr_run_status", "SET-KBQR-RUN-STATUS", 2, 0, false);
    //declareFunction(myName, "possibly_set_kbqr_run_status", "POSSIBLY-SET-KBQR-RUN-STATUS", 2, 0, false);
    declareFunction(myName, "kct_runstate_print_function_trampoline", "KCT-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "kct_runstate_p", "KCT-RUNSTATE-P", 1, 0, false); new $kct_runstate_p$UnaryFunction();
    //declareFunction(myName, "kctr_id", "KCTR-ID", 1, 0, false);
    //declareFunction(myName, "kctr_lock", "KCTR-LOCK", 1, 0, false);
    //declareFunction(myName, "kctr_test_spec", "KCTR-TEST-SPEC", 1, 0, false);
    //declareFunction(myName, "kctr_result", "KCTR-RESULT", 1, 0, false);
    //declareFunction(myName, "kctr_query_runstate", "KCTR-QUERY-RUNSTATE", 1, 0, false);
    //declareFunction(myName, "kctr_test_set_runstate", "KCTR-TEST-SET-RUNSTATE", 1, 0, false);
    //declareFunction(myName, "kctr_run_status", "KCTR-RUN-STATUS", 1, 0, false);
    //declareFunction(myName, "kctr_start", "KCTR-START", 1, 0, false);
    //declareFunction(myName, "kctr_end", "KCTR-END", 1, 0, false);
    //declareFunction(myName, "_csetf_kctr_id", "_CSETF-KCTR-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_kctr_lock", "_CSETF-KCTR-LOCK", 2, 0, false);
    //declareFunction(myName, "_csetf_kctr_test_spec", "_CSETF-KCTR-TEST-SPEC", 2, 0, false);
    //declareFunction(myName, "_csetf_kctr_result", "_CSETF-KCTR-RESULT", 2, 0, false);
    //declareFunction(myName, "_csetf_kctr_query_runstate", "_CSETF-KCTR-QUERY-RUNSTATE", 2, 0, false);
    //declareFunction(myName, "_csetf_kctr_test_set_runstate", "_CSETF-KCTR-TEST-SET-RUNSTATE", 2, 0, false);
    //declareFunction(myName, "_csetf_kctr_run_status", "_CSETF-KCTR-RUN-STATUS", 2, 0, false);
    //declareFunction(myName, "_csetf_kctr_start", "_CSETF-KCTR-START", 2, 0, false);
    //declareFunction(myName, "_csetf_kctr_end", "_CSETF-KCTR-END", 2, 0, false);
    //declareFunction(myName, "make_kct_runstate", "MAKE-KCT-RUNSTATE", 0, 1, false);
    //declareFunction(myName, "new_kct_runstate", "NEW-KCT-RUNSTATE", 1, 1, false);
    //declareFunction(myName, "destroy_kct_runstate", "DESTROY-KCT-RUNSTATE", 1, 0, false);
    //declareFunction(myName, "kct_runstate_test_spec", "KCT-RUNSTATE-TEST-SPEC", 1, 0, false);
    //declareFunction(myName, "kct_runstate_lock", "KCT-RUNSTATE-LOCK", 1, 0, false);
    //declareFunction(myName, "kct_runstate_result", "KCT-RUNSTATE-RESULT", 1, 0, false);
    //declareFunction(myName, "kct_runstate_query_runstate", "KCT-RUNSTATE-QUERY-RUNSTATE", 1, 0, false);
    //declareFunction(myName, "kct_runstate_test_set_runstate", "KCT-RUNSTATE-TEST-SET-RUNSTATE", 1, 0, false);
    //declareFunction(myName, "kct_runstate_inference", "KCT-RUNSTATE-INFERENCE", 1, 0, false);
    //declareFunction(myName, "kct_runstate_result_status", "KCT-RUNSTATE-RESULT-STATUS", 1, 0, false);
    //declareFunction(myName, "kct_runstate_failure_explanation", "KCT-RUNSTATE-FAILURE-EXPLANATION", 1, 0, false);
    //declareFunction(myName, "kct_runstate_metric_value", "KCT-RUNSTATE-METRIC-VALUE", 2, 0, false);
    //declareFunction(myName, "kct_runstate_run_status", "KCT-RUNSTATE-RUN-STATUS", 1, 0, false);
    //declareFunction(myName, "kct_runstate_start", "KCT-RUNSTATE-START", 1, 0, false);
    //declareFunction(myName, "kct_runstate_end", "KCT-RUNSTATE-END", 1, 0, false);
    //declareFunction(myName, "set_kctr_result", "SET-KCTR-RESULT", 2, 0, false);
    //declareFunction(myName, "set_kctr_query_runstate", "SET-KCTR-QUERY-RUNSTATE", 2, 0, false);
    //declareFunction(myName, "set_kctr_test_set_runstate", "SET-KCTR-TEST-SET-RUNSTATE", 2, 0, false);
    //declareFunction(myName, "set_kctr_run_status", "SET-KCTR-RUN-STATUS", 2, 0, false);
    //declareFunction(myName, "set_kctr_start", "SET-KCTR-START", 1, 1, false);
    //declareFunction(myName, "set_kctr_end", "SET-KCTR-END", 1, 1, false);
    declareFunction(myName, "kct_set_runstate_print_function_trampoline", "KCT-SET-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "kct_set_runstate_p", "KCT-SET-RUNSTATE-P", 1, 0, false); new $kct_set_runstate_p$UnaryFunction();
    //declareFunction(myName, "kctsr_id", "KCTSR-ID", 1, 0, false);
    //declareFunction(myName, "kctsr_lock", "KCTSR-LOCK", 1, 0, false);
    //declareFunction(myName, "kctsr_test_set", "KCTSR-TEST-SET", 1, 0, false);
    //declareFunction(myName, "kctsr_result", "KCTSR-RESULT", 1, 0, false);
    //declareFunction(myName, "kctsr_test_runstates", "KCTSR-TEST-RUNSTATES", 1, 0, false);
    //declareFunction(myName, "kctsr_run_status", "KCTSR-RUN-STATUS", 1, 0, false);
    //declareFunction(myName, "kctsr_start", "KCTSR-START", 1, 0, false);
    //declareFunction(myName, "kctsr_end", "KCTSR-END", 1, 0, false);
    //declareFunction(myName, "_csetf_kctsr_id", "_CSETF-KCTSR-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_kctsr_lock", "_CSETF-KCTSR-LOCK", 2, 0, false);
    //declareFunction(myName, "_csetf_kctsr_test_set", "_CSETF-KCTSR-TEST-SET", 2, 0, false);
    //declareFunction(myName, "_csetf_kctsr_result", "_CSETF-KCTSR-RESULT", 2, 0, false);
    //declareFunction(myName, "_csetf_kctsr_test_runstates", "_CSETF-KCTSR-TEST-RUNSTATES", 2, 0, false);
    //declareFunction(myName, "_csetf_kctsr_run_status", "_CSETF-KCTSR-RUN-STATUS", 2, 0, false);
    //declareFunction(myName, "_csetf_kctsr_start", "_CSETF-KCTSR-START", 2, 0, false);
    //declareFunction(myName, "_csetf_kctsr_end", "_CSETF-KCTSR-END", 2, 0, false);
    //declareFunction(myName, "make_kct_set_runstate", "MAKE-KCT-SET-RUNSTATE", 0, 1, false);
    //declareFunction(myName, "new_kct_set_runstate", "NEW-KCT-SET-RUNSTATE", 1, 0, false);
    //declareFunction(myName, "destroy_kct_set_runstate", "DESTROY-KCT-SET-RUNSTATE", 1, 0, false);
    //declareFunction(myName, "kct_set_runstate_test_set", "KCT-SET-RUNSTATE-TEST-SET", 1, 0, false);
    //declareFunction(myName, "kct_set_runstate_lock", "KCT-SET-RUNSTATE-LOCK", 1, 0, false);
    //declareFunction(myName, "kct_set_runstate_result", "KCT-SET-RUNSTATE-RESULT", 1, 0, false);
    //declareFunction(myName, "kct_set_runstate_test_runstates", "KCT-SET-RUNSTATE-TEST-RUNSTATES", 1, 0, false);
    //declareFunction(myName, "kct_set_runstate_result_status", "KCT-SET-RUNSTATE-RESULT-STATUS", 1, 0, false);
    //declareFunction(myName, "kct_set_runstate_run_status", "KCT-SET-RUNSTATE-RUN-STATUS", 1, 0, false);
    //declareFunction(myName, "kct_set_runstate_start", "KCT-SET-RUNSTATE-START", 1, 0, false);
    //declareFunction(myName, "kct_set_runstate_end", "KCT-SET-RUNSTATE-END", 1, 0, false);
    //declareFunction(myName, "set_kctsr_result", "SET-KCTSR-RESULT", 2, 0, false);
    //declareFunction(myName, "kctsr_test_runstate_add", "KCTSR-TEST-RUNSTATE-ADD", 2, 0, false);
    //declareFunction(myName, "kctsr_test_runstate_remove", "KCTSR-TEST-RUNSTATE-REMOVE", 2, 0, false);
    //declareFunction(myName, "set_kctsr_run_status", "SET-KCTSR-RUN-STATUS", 2, 0, false);
    //declareFunction(myName, "set_kctsr_start", "SET-KCTSR-START", 1, 1, false);
    //declareFunction(myName, "set_kctsr_end", "SET-KCTSR-END", 1, 1, false);
    //declareFunction(myName, "kbq_save_query_set_run", "KBQ-SAVE-QUERY-SET-RUN", 2, 0, false);
    //declareFunction(myName, "kct_save_test_set_run", "KCT-SAVE-TEST-SET-RUN", 2, 0, false);
    //declareFunction(myName, "kbq_save_query_set_run_without_results", "KBQ-SAVE-QUERY-SET-RUN-WITHOUT-RESULTS", 2, 0, false);
    //declareFunction(myName, "kbq_open_query_set_run_output_stream", "KBQ-OPEN-QUERY-SET-RUN-OUTPUT-STREAM", 1, 1, false);
    //declareFunction(myName, "kct_open_test_set_run_output_stream", "KCT-OPEN-TEST-SET-RUN-OUTPUT-STREAM", 1, 1, false);
    //declareFunction(myName, "kbq_save_query_set_run_preamble", "KBQ-SAVE-QUERY-SET-RUN-PREAMBLE", 1, 1, false);
    //declareFunction(myName, "kct_save_test_set_run_preamble", "KCT-SAVE-TEST-SET-RUN-PREAMBLE", 1, 1, false);
    //declareFunction(myName, "kbq_save_query_run", "KBQ-SAVE-QUERY-RUN", 2, 0, false);
    //declareFunction(myName, "kct_save_test_run", "KCT-SAVE-TEST-RUN", 2, 0, false);
    //declareMacro(myName, "do_query_set_run", "DO-QUERY-SET-RUN");
    //declareMacro(myName, "do_query_set_run_query_runs", "DO-QUERY-SET-RUN-QUERY-RUNS");
    //declareFunction(myName, "kbq_load_query_set_run", "KBQ-LOAD-QUERY-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kbq_load_query_set_run_int", "KBQ-LOAD-QUERY-SET-RUN-INT", 1, 0, false);
    //declareFunction(myName, "kbq_load_query_run_int", "KBQ-LOAD-QUERY-RUN-INT", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_nmerge_query_runs", "KBQ-QUERY-SET-RUN-NMERGE-QUERY-RUNS", 2, 0, false);
    //declareFunction(myName, "kct_load_test_set_run", "KCT-LOAD-TEST-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kct_test_set_run_nmerge_test_runs", "KCT-TEST-SET-RUN-NMERGE-TEST-RUNS", 2, 0, false);
    //declareFunction(myName, "kbq_nclean_query_set_run", "KBQ-NCLEAN-QUERY-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kct_nclean_test_set_run", "KCT-NCLEAN-TEST-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kbq_nclean_query_run", "KBQ-NCLEAN-QUERY-RUN", 1, 0, false);
    //declareFunction(myName, "kbq_strip_results_from_query_set_run_file", "KBQ-STRIP-RESULTS-FROM-QUERY-SET-RUN-FILE", 1, 1, false);
    //declareFunction(myName, "kbq_strip_suffix_from_filename", "KBQ-STRIP-SUFFIX-FROM-FILENAME", 1, 0, false);
    //declareFunction(myName, "kct_strip_suffix_from_filename", "KCT-STRIP-SUFFIX-FROM-FILENAME", 1, 0, false);
    //declareFunction(myName, "kbq_filter_query_set_run_by_property_value", "KBQ-FILTER-QUERY-SET-RUN-BY-PROPERTY-VALUE", 4, 1, false);
    //declareFunction(myName, "kbq_filter_query_set_run_by_test", "KBQ-FILTER-QUERY-SET-RUN-BY-TEST", 3, 1, false);
    //declareFunction(myName, "kct_filter_test_set_run_by_test", "KCT-FILTER-TEST-SET-RUN-BY-TEST", 3, 1, false);
    //declareFunction(myName, "kbq_answerable_query_set_run", "KBQ-ANSWERABLE-QUERY-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kct_succeeding_test_set_run", "KCT-SUCCEEDING-TEST-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kbq_unanswerable_query_set_run", "KBQ-UNANSWERABLE-QUERY-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kct_failing_test_set_run", "KCT-FAILING-TEST-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kct_common_sense_test_set_run", "KCT-COMMON-SENSE-TEST-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kbq_same_property_value_queries", "KBQ-SAME-PROPERTY-VALUE-QUERIES", 3, 2, false);
    //declareFunction(myName, "kbq_mutually_answerable_queries", "KBQ-MUTUALLY-ANSWERABLE-QUERIES", 1, 0, false);
    //declareFunction(myName, "kbq_mutually_unanswerable_queries", "KBQ-MUTUALLY-UNANSWERABLE-QUERIES", 1, 0, false);
    //declareFunction(myName, "kbq_fast_queries", "KBQ-FAST-QUERIES", 1, 1, false);
    //declareFunction(myName, "kct_mutually_succeeding_tests", "KCT-MUTUALLY-SUCCEEDING-TESTS", 1, 0, false);
    //declareFunction(myName, "kct_mutually_failing_tests", "KCT-MUTUALLY-FAILING-TESTS", 1, 0, false);
    //declareFunction(myName, "kbq_mutually_answerable_query_set_runs", "KBQ-MUTUALLY-ANSWERABLE-QUERY-SET-RUNS", 2, 0, false);
    //declareFunction(myName, "kbq_mutually_unanswerable_query_set_runs", "KBQ-MUTUALLY-UNANSWERABLE-QUERY-SET-RUNS", 2, 0, false);
    //declareFunction(myName, "kbq_query_set_runs_common_queries", "KBQ-QUERY-SET-RUNS-COMMON-QUERIES", 1, 0, false);
    //declareFunction(myName, "kbq_common_queries_query_set_runs", "KBQ-COMMON-QUERIES-QUERY-SET-RUNS", 1, 0, false);
    //declareFunction(myName, "kbq_common_queries_two_query_set_runs", "KBQ-COMMON-QUERIES-TWO-QUERY-SET-RUNS", 2, 0, false);
    //declareFunction(myName, "kct_common_tests_test_set_runs", "KCT-COMMON-TESTS-TEST-SET-RUNS", 1, 0, false);
    //declareFunction(myName, "kct_mutually_succeeding_test_set_runs", "KCT-MUTUALLY-SUCCEEDING-TEST-SET-RUNS", 2, 0, false);
    //declareFunction(myName, "kct_mutually_failing_test_set_runs", "KCT-MUTUALLY-FAILING-TEST-SET-RUNS", 2, 0, false);
    //declareFunction(myName, "kbq_same_answer_count_query_set_runs", "KBQ-SAME-ANSWER-COUNT-QUERY-SET-RUNS", 2, 0, false);
    //declareFunction(myName, "kbq_different_answer_count_query_set_runs", "KBQ-DIFFERENT-ANSWER-COUNT-QUERY-SET-RUNS", 2, 0, false);
    //declareFunction(myName, "kbq_filter_to_queries_int", "KBQ-FILTER-TO-QUERIES-INT", 3, 0, false);
    //declareFunction(myName, "kbq_filter_query_set_run_to_queries_lambda", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-LAMBDA", 1, 0, false);
    //declareFunction(myName, "kbq_filter_query_set_run_to_queries_not_lambda", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-NOT-LAMBDA", 1, 0, false);
    //declareFunction(myName, "kbq_filter_query_set_run_to_queries", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES", 2, 1, false);
    //declareFunction(myName, "kct_filter_test_set_run_to_tests_lambda", "KCT-FILTER-TEST-SET-RUN-TO-TESTS-LAMBDA", 1, 0, false);
    //declareFunction(myName, "kct_filter_test_set_run_to_tests_not_lambda", "KCT-FILTER-TEST-SET-RUN-TO-TESTS-NOT-LAMBDA", 1, 0, false);
    //declareFunction(myName, "kct_filter_test_set_run_to_tests", "KCT-FILTER-TEST-SET-RUN-TO-TESTS", 2, 1, false);
    //declareFunction(myName, "kbq_filter_query_set_run_to_query_collection", "KBQ-FILTER-QUERY-SET-RUN-TO-QUERY-COLLECTION", 2, 1, false);
    //declareFunction(myName, "kct_filter_test_set_run_to_test_collection", "KCT-FILTER-TEST-SET-RUN-TO-TEST-COLLECTION", 2, 1, false);
    //declareFunction(myName, "clear_cached_all_instances_among", "CLEAR-CACHED-ALL-INSTANCES-AMONG", 0, 0, false); new $clear_cached_all_instances_among$ZeroArityFunction();
    //declareFunction(myName, "remove_cached_all_instances_among", "REMOVE-CACHED-ALL-INSTANCES-AMONG", 3, 0, false);
    //declareFunction(myName, "cached_all_instances_among_internal", "CACHED-ALL-INSTANCES-AMONG-INTERNAL", 3, 0, false);
    //declareFunction(myName, "cached_all_instances_among", "CACHED-ALL-INSTANCES-AMONG", 3, 0, false);
    //declareFunction(myName, "kbq_queries_common_to_all_query_set_runs", "KBQ-QUERIES-COMMON-TO-ALL-QUERY-SET-RUNS", 1, 0, false);
    //declareFunction(myName, "kct_tests_common_to_all_test_set_runs", "KCT-TESTS-COMMON-TO-ALL-TEST-SET-RUNS", 1, 0, false);
    //declareFunction(myName, "kct_consistently_succeeding_tests", "KCT-CONSISTENTLY-SUCCEEDING-TESTS", 1, 0, false);
    //declareFunction(myName, "kct_consistently_succeeding_test_set_runs", "KCT-CONSISTENTLY-SUCCEEDING-TEST-SET-RUNS", 1, 0, false);
    //declareFunction(myName, "queries_that_became_unanswerable", "QUERIES-THAT-BECAME-UNANSWERABLE", 2, 0, false);
    //declareFunction(myName, "queries_that_changed_answer_count", "QUERIES-THAT-CHANGED-ANSWER-COUNT", 2, 0, false);
    //declareFunction(myName, "kbq_query_runs_with_worst_slowdown", "KBQ-QUERY-RUNS-WITH-WORST-SLOWDOWN", 2, 2, false);
    //declareFunction(myName, "kbq_query_runs_with_worst_slowdown_robust", "KBQ-QUERY-RUNS-WITH-WORST-SLOWDOWN-ROBUST", 2, 2, false);
    //declareFunction(myName, "kbq_slowest_query_runs", "KBQ-SLOWEST-QUERY-RUNS", 1, 2, false);
    //declareFunction(myName, "kct_slowest_test_runs", "KCT-SLOWEST-TEST-RUNS", 1, 2, false);
    //declareFunction(myName, "kbq_compare_query_set_run_answers", "KBQ-COMPARE-QUERY-SET-RUN-ANSWERS", 2, 0, false);
    //declareFunction(myName, "kbq_summarize_compare_query_set_run_answers", "KBQ-SUMMARIZE-COMPARE-QUERY-SET-RUN-ANSWERS", 2, 0, false);
    //declareFunction(myName, "kbq_sort_query_runs", "KBQ-SORT-QUERY-RUNS", 2, 0, false);
    //declareFunction(myName, "kbq_lookup_query_run", "KBQ-LOOKUP-QUERY-RUN", 2, 0, false);
    //declareFunction(myName, "kbq_lookup_query_run_from_query_runs", "KBQ-LOOKUP-QUERY-RUN-FROM-QUERY-RUNS", 2, 0, false);
    //declareFunction(myName, "kbq_lookup_query_runs", "KBQ-LOOKUP-QUERY-RUNS", 2, 0, false);
    //declareFunction(myName, "kbq_query_equal", "KBQ-QUERY-EQUAL", 2, 0, false);
    //declareFunction(myName, "kbq_compare_query_run_answers", "KBQ-COMPARE-QUERY-RUN-ANSWERS", 2, 0, false);
    //declareFunction(myName, "kbq_compare_query_set_runs_by_property", "KBQ-COMPARE-QUERY-SET-RUNS-BY-PROPERTY", 3, 1, false);
    //declareFunction(myName, "show_query_runs_that_became_unanswerable", "SHOW-QUERY-RUNS-THAT-BECAME-UNANSWERABLE", 2, 3, false);
    //declareFunction(myName, "show_query_runs_that_changed_answer_count", "SHOW-QUERY-RUNS-THAT-CHANGED-ANSWER-COUNT", 2, 3, false);
    //declareFunction(myName, "show_query_runs_int", "SHOW-QUERY-RUNS-INT", 6, 0, false);
    //declareFunction(myName, "kbq_query_set_run_answerable_counts", "KBQ-QUERY-SET-RUN-ANSWERABLE-COUNTS", 2, 0, false);
    //declareFunction(myName, "kct_compare_test_set_run_statuses", "KCT-COMPARE-TEST-SET-RUN-STATUSES", 2, 0, false);
    //declareFunction(myName, "kct_summarize_compare_test_set_run_statuses", "KCT-SUMMARIZE-COMPARE-TEST-SET-RUN-STATUSES", 2, 0, false);
    //declareFunction(myName, "kct_lookup_test_run", "KCT-LOOKUP-TEST-RUN", 2, 0, false);
    //declareFunction(myName, "kct_test_equal", "KCT-TEST-EQUAL", 2, 0, false);
    //declareFunction(myName, "kct_compare_test_run_statuses", "KCT-COMPARE-TEST-RUN-STATUSES", 2, 0, false);
    //declareFunction(myName, "kbq_analyze_query_set_runs", "KBQ-ANALYZE-QUERY-SET-RUNS", 2, 1, false);
    //declareFunction(myName, "kct_analyze_test_set_runs", "KCT-ANALYZE-TEST-SET-RUNS", 2, 1, false);
    //declareFunction(myName, "kbq_compare_analysis", "KBQ-COMPARE-ANALYSIS", 2, 0, false);
    //declareFunction(myName, "significant_digits_if_float", "SIGNIFICANT-DIGITS-IF-FLOAT", 2, 0, false);
    //declareFunction(myName, "kbq_print_analysis", "KBQ-PRINT-ANALYSIS", 1, 0, false);
    //declareFunction(myName, "kbq_analyze_query_set_run", "KBQ-ANALYZE-QUERY-SET-RUN", 1, 1, false);
    //declareFunction(myName, "kct_analyze_test_set_run", "KCT-ANALYZE-TEST-SET-RUN", 1, 1, false);
    //declareFunction(myName, "kbq_analyze_query_runs", "KBQ-ANALYZE-QUERY-RUNS", 2, 0, false);
    //declareFunction(myName, "kbq_query_set_run_total_answerable", "KBQ-QUERY-SET-RUN-TOTAL-ANSWERABLE", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_last_query_from_file", "KBQ-QUERY-SET-RUN-LAST-QUERY-FROM-FILE", 1, 0, false);
    //declareFunction(myName, "kbq_query_set_run_identify_probable_segfault_from_file", "KBQ-QUERY-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT-FROM-FILE", 2, 0, false);
    //declareFunction(myName, "kbq_query_set_run_identify_probable_segfault", "KBQ-QUERY-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT", 2, 0, false);
    //declareFunction(myName, "kbq_query_set_run_identify_probable_segfault_int", "KBQ-QUERY-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT-INT", 2, 0, false);
    //declareFunction(myName, "kct_analyze_test_runs", "KCT-ANALYZE-TEST-RUNS", 2, 0, false);
    //declareFunction(myName, "kct_test_set_run_identify_probable_segfault", "KCT-TEST-SET-RUN-IDENTIFY-PROBABLE-SEGFAULT", 2, 0, false);
    //declareFunction(myName, "analyze_kbq_experiments", "ANALYZE-KBQ-EXPERIMENTS", 2, 5, false);
    //declareFunction(myName, "kbq_non_lumpy_query_set_run", "KBQ-NON-LUMPY-QUERY-SET-RUN", 1, 0, false);
    //declareFunction(myName, "kbq_lumpy_queries", "KBQ-LUMPY-QUERIES", 1, 0, false);
    //declareFunction(myName, "kbq_lumpy_query_count", "KBQ-LUMPY-QUERY-COUNT", 1, 0, false);
    //declareFunction(myName, "kbq_count_lumpy_query_runs", "KBQ-COUNT-LUMPY-QUERY-RUNS", 1, 0, false);
    //declareFunction(myName, "kbq_lumpy_query_runP", "KBQ-LUMPY-QUERY-RUN?", 1, 0, false);
    //declareFunction(myName, "show_kct_test_set_run_summary", "SHOW-KCT-TEST-SET-RUN-SUMMARY", 1, 1, false);
    //declareFunction(myName, "kbq_show_halt_reason_histogram", "KBQ-SHOW-HALT-REASON-HISTOGRAM", 1, 0, false);
    //declareFunction(myName, "kbq_query_literal_count", "KBQ-QUERY-LITERAL-COUNT", 1, 0, false);
    //declareFunction(myName, "kbq_single_literal_query_p", "KBQ-SINGLE-LITERAL-QUERY-P", 1, 0, false);
    //declareFunction(myName, "kbq_progress_stream", "KBQ-PROGRESS-STREAM", 0, 0, false);
    //declareFunction(myName, "kbq_benchmark_run_and_report", "KBQ-BENCHMARK-RUN-AND-REPORT", 3, 0, false);
    //declareFunction(myName, "kbq_benchmark_run_in_background", "KBQ-BENCHMARK-RUN-IN-BACKGROUND", 3, 0, false);
    //declareFunction(myName, "kbq_benchmark_run", "KBQ-BENCHMARK-RUN", 3, 3, false);
    //declareFunction(myName, "kbq_benchmark_report", "KBQ-BENCHMARK-REPORT", 1, 1, false);
    //declareFunction(myName, "kbq_benchmark_report_for_test", "KBQ-BENCHMARK-REPORT-FOR-TEST", 2, 1, false);
    return NIL;
  }

  public static final SubLObject init_kbq_query_run_file() {
    $kct_set_runstate$ = defparameter("*KCT-SET-RUNSTATE*", NIL);
    $kct_runstate$ = defparameter("*KCT-RUNSTATE*", NIL);
    $kbq_runstate$ = defparameter("*KBQ-RUNSTATE*", NIL);
    $kbq_old_cfasl_common_symbols$ = deflexical("*KBQ-OLD-CFASL-COMMON-SYMBOLS*", $list3);
    $kbq_new_cfasl_common_symbols$ = deflexical("*KBQ-NEW-CFASL-COMMON-SYMBOLS*", ConsesLow.append($kbq_old_cfasl_common_symbols$.getGlobalValue(), $list4));
    $kbq_cfasl_common_symbols$ = deflexical("*KBQ-CFASL-COMMON-SYMBOLS*", ConsesLow.append($kbq_old_cfasl_common_symbols$.getGlobalValue(), $kbq_new_cfasl_common_symbols$.getGlobalValue()));
    $kct_old_cfasl_common_symbols$ = deflexical("*KCT-OLD-CFASL-COMMON-SYMBOLS*", ConsesLow.append($kbq_old_cfasl_common_symbols$.getGlobalValue(), $list7));
    $kct_cfasl_common_symbols$ = deflexical("*KCT-CFASL-COMMON-SYMBOLS*", ConsesLow.append($kbq_old_cfasl_common_symbols$.getGlobalValue(), $list7, $kbq_new_cfasl_common_symbols$.getGlobalValue()));
    $kbq_outlier_timeout$ = defparameter("*KBQ-OUTLIER-TIMEOUT*", $int8$600);
    $kbq_internal_time_units_per_second$ = defparameter("*KBQ-INTERNAL-TIME-UNITS-PER-SECOND*", NIL);
    $kbq_run_number$ = defparameter("*KBQ-RUN-NUMBER*", ONE_INTEGER);
    $kct_test_metric_table$ = deflexical("*KCT-TEST-METRIC-TABLE*", $list136);
    $kbq_default_outlier_timeout$ = deflexical("*KBQ-DEFAULT-OUTLIER-TIMEOUT*", $int8$600);
    $kbq_test_collection_to_query_set_query$ = deflexical("*KBQ-TEST-COLLECTION-TO-QUERY-SET-QUERY*", $list163);
    $last_query_set_run$ = deflexical("*LAST-QUERY-SET-RUN*", maybeDefault( $sym189$_LAST_QUERY_SET_RUN_, $last_query_set_run$, NIL));
    $last_test_set_run$ = deflexical("*LAST-TEST-SET-RUN*", maybeDefault( $sym211$_LAST_TEST_SET_RUN_, $last_test_set_run$, NIL));
    $runstate_isg$ = deflexical("*RUNSTATE-ISG*", maybeDefault( $sym219$_RUNSTATE_ISG_, $runstate_isg$, ()-> (integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    $runstate_index$ = deflexical("*RUNSTATE-INDEX*", maybeDefault( $sym220$_RUNSTATE_INDEX_, $runstate_index$, ()-> (dictionary.new_dictionary(UNPROVIDED, UNPROVIDED))));
    $dtp_kbq_runstate$ = defconstant("*DTP-KBQ-RUNSTATE*", $sym228$KBQ_RUNSTATE);
    $dtp_kct_runstate$ = defconstant("*DTP-KCT-RUNSTATE*", $sym262$KCT_RUNSTATE);
    $dtp_kct_set_runstate$ = defconstant("*DTP-KCT-SET-RUNSTATE*", $sym294$KCT_SET_RUNSTATE);
    $query_set_run_file_extension$ = deflexical("*QUERY-SET-RUN-FILE-EXTENSION*", $str355$_cfasl);
    $kbq_filter_query_set_run_to_queries$ = defparameter("*KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES*", NIL);
    $kct_filter_test_set_run_to_tests$ = defparameter("*KCT-FILTER-TEST-SET-RUN-TO-TESTS*", NIL);
    $cached_all_instances_among_caching_state$ = deflexical("*CACHED-ALL-INSTANCES-AMONG-CACHING-STATE*", NIL);
    $kbq_summary_statistics$ = deflexical("*KBQ-SUMMARY-STATISTICS*", $list405);
    $kbq_progress_stream$ = defparameter("*KBQ-PROGRESS-STREAM*", NIL);
    $kbq_benchmark_outlier_timeout$ = defparameter("*KBQ-BENCHMARK-OUTLIER-TIMEOUT*", $int467$3600);
    return NIL;
  }

  public static final SubLObject setup_kbq_query_run_file() {
    // CVS_ID("Id: kbq-query-run.lisp 128945 2009-10-13 22:05:33Z rck ");
    access_macros.register_macro_helper($sym5$KBQ_CFASL_COMMON_SYMBOLS, $sym6$DO_QUERY_SET_RUN);
    subl_macro_promotions.declare_defglobal($sym189$_LAST_QUERY_SET_RUN_);
    access_macros.register_macro_helper($sym187$RUN_KBQ_EXPERIMENT_INTERNAL, $sym190$RUN_KBQ_EXPERIMENT);
    subl_macro_promotions.declare_defglobal($sym211$_LAST_TEST_SET_RUN_);
    access_macros.register_macro_helper($sym210$RUN_KCT_EXPERIMENT_INTERNAL, $sym212$RUN_KCT_EXPERIMENT);
    subl_macro_promotions.declare_defglobal($sym219$_RUNSTATE_ISG_);
    subl_macro_promotions.declare_defglobal($sym220$_RUNSTATE_INDEX_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_kbq_runstate$.getGlobalValue(), Symbols.symbol_function($sym235$KBQ_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym236$KBQR_ID, $sym237$_CSETF_KBQR_ID);
    Structures.def_csetf($sym238$KBQR_LOCK, $sym239$_CSETF_KBQR_LOCK);
    Structures.def_csetf($sym240$KBQR_QUERY_SPEC, $sym241$_CSETF_KBQR_QUERY_SPEC);
    Structures.def_csetf($sym242$KBQR_INFERENCE, $sym243$_CSETF_KBQR_INFERENCE);
    Structures.def_csetf($sym244$KBQR_RESULT, $sym245$_CSETF_KBQR_RESULT);
    Structures.def_csetf($sym246$KBQR_TEST_RUNSTATE, $sym247$_CSETF_KBQR_TEST_RUNSTATE);
    Structures.def_csetf($sym248$KBQR_RUN_STATUS, $sym249$_CSETF_KBQR_RUN_STATUS);
    Equality.identity($sym228$KBQ_RUNSTATE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_kct_runstate$.getGlobalValue(), Symbols.symbol_function($sym267$KCT_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym268$KCTR_ID, $sym269$_CSETF_KCTR_ID);
    Structures.def_csetf($sym270$KCTR_LOCK, $sym271$_CSETF_KCTR_LOCK);
    Structures.def_csetf($sym272$KCTR_TEST_SPEC, $sym273$_CSETF_KCTR_TEST_SPEC);
    Structures.def_csetf($sym274$KCTR_RESULT, $sym275$_CSETF_KCTR_RESULT);
    Structures.def_csetf($sym276$KCTR_QUERY_RUNSTATE, $sym277$_CSETF_KCTR_QUERY_RUNSTATE);
    Structures.def_csetf($sym278$KCTR_TEST_SET_RUNSTATE, $sym279$_CSETF_KCTR_TEST_SET_RUNSTATE);
    Structures.def_csetf($sym280$KCTR_RUN_STATUS, $sym281$_CSETF_KCTR_RUN_STATUS);
    Structures.def_csetf($sym282$KCTR_START, $sym283$_CSETF_KCTR_START);
    Structures.def_csetf($sym284$KCTR_END, $sym285$_CSETF_KCTR_END);
    Equality.identity($sym262$KCT_RUNSTATE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_kct_set_runstate$.getGlobalValue(), Symbols.symbol_function($sym299$KCT_SET_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym300$KCTSR_ID, $sym301$_CSETF_KCTSR_ID);
    Structures.def_csetf($sym302$KCTSR_LOCK, $sym303$_CSETF_KCTSR_LOCK);
    Structures.def_csetf($sym304$KCTSR_TEST_SET, $sym305$_CSETF_KCTSR_TEST_SET);
    Structures.def_csetf($sym306$KCTSR_RESULT, $sym307$_CSETF_KCTSR_RESULT);
    Structures.def_csetf($sym308$KCTSR_TEST_RUNSTATES, $sym309$_CSETF_KCTSR_TEST_RUNSTATES);
    Structures.def_csetf($sym310$KCTSR_RUN_STATUS, $sym311$_CSETF_KCTSR_RUN_STATUS);
    Structures.def_csetf($sym312$KCTSR_START, $sym313$_CSETF_KCTSR_START);
    Structures.def_csetf($sym314$KCTSR_END, $sym315$_CSETF_KCTSR_END);
    Equality.identity($sym294$KCT_SET_RUNSTATE);
    access_macros.register_macro_helper($sym337$KBQ_LOAD_QUERY_SET_RUN_INT, $sym6$DO_QUERY_SET_RUN);
    access_macros.register_macro_helper($sym341$KBQ_LOAD_QUERY_RUN_INT, $sym6$DO_QUERY_SET_RUN);
    access_macros.register_macro_helper($sym347$KBQ_NCLEAN_QUERY_RUN, $sym6$DO_QUERY_SET_RUN);
    memoization_state.note_globally_cached_function($sym374$CACHED_ALL_INSTANCES_AMONG);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $kw1$FAILURE = makeKeyword("FAILURE");
  public static final SubLSymbol $kw2$ERROR = makeKeyword("ERROR");
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("ANSWER-COUNT-AT-60-SECONDS"), makeKeyword("PROBLEM-STORE-PROBLEM-COUNT"), makeKeyword("PROBLEM-STORE-PROOF-COUNT"), makeKeyword("ERROR"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("ANSWER-COUNT-AT-30-SECONDS"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("TOTAL-TIME"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("ANSWER-COUNT"), makeKeyword("EXHAUST-TOTAL"), makeKeyword("HALT-REASON"), makeKeyword("QUERY"), makeKeyword("QUERY-RUN")});
  public static final SubLList $list4 = list(new SubLObject[] {makeKeyword("TIME-PER-ANSWER"), makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER"), makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), makeKeyword("PROBLEM-COUNT"), makeKeyword("PROOF-COUNT"), makeKeyword("LINK-COUNT"), makeKeyword("CONTENT-LINK-COUNT"), makeKeyword("REMOVAL-LINK-COUNT"), makeKeyword("REWRITE-LINK-COUNT"), makeKeyword("TRANSFORMATION-LINK-COUNT"), makeKeyword("STRUCTURAL-LINK-COUNT"), makeKeyword("JOIN-ORDERED-LINK-COUNT"), makeKeyword("JOIN-LINK-COUNT"), makeKeyword("SPLIT-LINK-COUNT"), makeKeyword("RESTRICTION-LINK-COUNT"), makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT"), makeKeyword("UNION-LINK-COUNT"), makeKeyword("GOOD-PROBLEM-COUNT"), makeKeyword("NEUTRAL-PROBLEM-COUNT"), makeKeyword("NO-GOOD-PROBLEM-COUNT"), makeKeyword("SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("JOIN-PROBLEM-COUNT"), makeKeyword("SPLIT-PROBLEM-COUNT"), makeKeyword("DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-PROBLEM-COUNT"), makeKeyword("EXAMINED-PROBLEM-COUNT"), makeKeyword("POSSIBLE-PROBLEM-COUNT"), makeKeyword("PENDING-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-GOOD-PROBLEM-COUNT"), makeKeyword("EXAMINED-GOOD-PROBLEM-COUNT"), makeKeyword("POSSIBLE-GOOD-PROBLEM-COUNT"), makeKeyword("PENDING-GOOD-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-NEUTRAL-PROBLEM-COUNT"), makeKeyword("EXAMINED-NEUTRAL-PROBLEM-COUNT"), makeKeyword("POSSIBLE-NEUTRAL-PROBLEM-COUNT"), makeKeyword("PENDING-NEUTRAL-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-NO-GOOD-PROBLEM-COUNT"), makeKeyword("EXAMINED-NO-GOOD-PROBLEM-COUNT"), makeKeyword("POSSIBLE-NO-GOOD-PROBLEM-COUNT"), makeKeyword("PENDING-NO-GOOD-PROBLEM-COUNT"), makeKeyword("GOOD-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("GOOD-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("GOOD-JOIN-PROBLEM-COUNT"), makeKeyword("GOOD-SPLIT-PROBLEM-COUNT"), makeKeyword("GOOD-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("NEUTRAL-JOIN-PROBLEM-COUNT"), makeKeyword("NEUTRAL-SPLIT-PROBLEM-COUNT"), makeKeyword("NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("NO-GOOD-JOIN-PROBLEM-COUNT"), makeKeyword("NO-GOOD-SPLIT-PROBLEM-COUNT"), makeKeyword("NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-JOIN-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-SPLIT-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("EXAMINED-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("EXAMINED-JOIN-PROBLEM-COUNT"), makeKeyword("EXAMINED-SPLIT-PROBLEM-COUNT"), makeKeyword("EXAMINED-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("POSSIBLE-JOIN-PROBLEM-COUNT"), makeKeyword("POSSIBLE-SPLIT-PROBLEM-COUNT"), makeKeyword("POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("FINISHED-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("FINISHED-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("FINISHED-JOIN-PROBLEM-COUNT"), makeKeyword("FINISHED-SPLIT-PROBLEM-COUNT"), makeKeyword("FINISHED-DISJUNCTIVE-PROBLEM-COUNT")});
  public static final SubLSymbol $sym5$KBQ_CFASL_COMMON_SYMBOLS = makeSymbol("KBQ-CFASL-COMMON-SYMBOLS");
  public static final SubLSymbol $sym6$DO_QUERY_SET_RUN = makeSymbol("DO-QUERY-SET-RUN");
  public static final SubLList $list7 = list(makeKeyword("SUCCESS"), makeKeyword("FAILURE"), makeKeyword("STATUS"), makeKeyword("TEST"));
  public static final SubLInteger $int8$600 = makeInteger(600);
  public static final SubLList $list9 = list(list(makeSymbol("QUERY-SET-RUN")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym10$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym11$_KBQ_INTERNAL_TIME_UNITS_PER_SECOND_ = makeSymbol("*KBQ-INTERNAL-TIME-UNITS-PER-SECOND*");
  public static final SubLSymbol $sym12$KBQ_QUERY_SET_RUN_INTERNAL_TIME_UNITS_PER_SECOND = makeSymbol("KBQ-QUERY-SET-RUN-INTERNAL-TIME-UNITS-PER-SECOND");
  public static final SubLSymbol $kw13$RESULT = makeKeyword("RESULT");
  public static final SubLSymbol $kw14$QUERY = makeKeyword("QUERY");
  public static final SubLSymbol $kw15$MISSING = makeKeyword("MISSING");
  public static final SubLSymbol $kw16$ANSWER_COUNT = makeKeyword("ANSWER-COUNT");
  public static final SubLSymbol $kw17$TOTAL_TIME = makeKeyword("TOTAL-TIME");
  public static final SubLSymbol $kw18$COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");
  public static final SubLSymbol $kw19$TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw20$TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");
  public static final SubLSymbol $kw21$COMPLETE_TIME_TO_FIRST_ANSWER = makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw22$COMPLETE_TIME_TO_LAST_ANSWER = makeKeyword("COMPLETE-TIME-TO-LAST-ANSWER");
  public static final SubLSymbol $kw23$TOTAL_STEPS = makeKeyword("TOTAL-STEPS");
  public static final SubLSymbol $kw24$STEPS_TO_FIRST_ANSWER = makeKeyword("STEPS-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw25$STEPS_TO_LAST_ANSWER = makeKeyword("STEPS-TO-LAST-ANSWER");
  public static final SubLSymbol $kw26$HALT_REASON = makeKeyword("HALT-REASON");
  public static final SubLSymbol $kw27$ORIGIN = makeKeyword("ORIGIN");
  public static final SubLSymbol $kw28$WASTED_TIME_AFTER_LAST_ANSWER = makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER");
  public static final SubLSymbol $kw29$LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
  public static final SubLSymbol $kw30$SETUP_TIME = makeKeyword("SETUP-TIME");
  public static final SubLSymbol $kw31$TIME_PER_ANSWER = makeKeyword("TIME-PER-ANSWER");
  public static final SubLSymbol $kw32$COMPLETE_TIME_PER_ANSWER = makeKeyword("COMPLETE-TIME-PER-ANSWER");
  public static final SubLSymbol $kw33$ANSWERABILITY_TIME = makeKeyword("ANSWERABILITY-TIME");
  public static final SubLSymbol $kw34$ANSWERABILITY_STEPS = makeKeyword("ANSWERABILITY-STEPS");
  public static final SubLSymbol $kw35$NEW_ROOT_RELATIVE_TOTAL_TIMES = makeKeyword("NEW-ROOT-RELATIVE-TOTAL-TIMES");
  public static final SubLSymbol $kw36$NEW_ROOT_TIMES = makeKeyword("NEW-ROOT-TIMES");
  public static final SubLSymbol $kw37$NEW_ROOT_RELATIVE_ANSWER_TIMES = makeKeyword("NEW-ROOT-RELATIVE-ANSWER-TIMES");
  public static final SubLSymbol $kw38$ANSWER_TIMES = makeKeyword("ANSWER-TIMES");
  public static final SubLSymbol $kw39$ESTIMATED_EXHAUSTIVE_PROBLEM_COUNT = makeKeyword("ESTIMATED-EXHAUSTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw40$ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT = makeKeyword("ESTIMATED-EXHAUSTIVE-NEW-ROOT-COUNT");
  public static final SubLSymbol $kw41$NEW_ROOT_COUNT = makeKeyword("NEW-ROOT-COUNT");
  public static final SubLSymbol $kw42$PROBLEM_COUNT = makeKeyword("PROBLEM-COUNT");
  public static final SubLSymbol $kw43$ESTIMATED_EXHAUSTIVE_BYTE_COUNT = makeKeyword("ESTIMATED-EXHAUSTIVE-BYTE-COUNT");
  public static final SubLSymbol $sym44$_MEDIAN_BYTES_PER_PROBLEM_ = makeSymbol("*MEDIAN-BYTES-PER-PROBLEM*");
  public static final SubLSymbol $kw45$TOTAL_NEW_ROOT_INITIAL_REMOVAL_FANOUT = makeKeyword("TOTAL-NEW-ROOT-INITIAL-REMOVAL-FANOUT");
  public static final SubLSymbol $kw46$NEW_ROOT_INITIAL_REMOVAL_FANOUTS = makeKeyword("NEW-ROOT-INITIAL-REMOVAL-FANOUTS");
  public static final SubLSymbol $kw47$QUERY_FUNCALL = makeKeyword("QUERY-FUNCALL");
  public static final SubLList $list48 = list(makeSymbol("QUERY-FUNCALL"), makeSymbol("FUNC"));
  public static final SubLList $list49 = list(makeSymbol("QUERY-FUNCALL"), makeSymbol("FUNC"), makeSymbol("ARG1"));
  public static final SubLSymbol $kw50$QUERY_RUN_FUNCALL = makeKeyword("QUERY-RUN-FUNCALL");
  public static final SubLList $list51 = list(makeSymbol("QUERY-RUN-FUNCALL"), makeSymbol("FUNC"));
  public static final SubLList $list52 = list(makeSymbol("QUERY-RUN-FUNCALL"), makeSymbol("FUNC"), makeSymbol("ARG1"));
  public static final SubLString $str53$unrecognized_KBQ_property_spec__s = makeString("unrecognized KBQ property spec ~s");
  public static final SubLString $str54$Use_the__with_kbq_query_set_run_m = makeString("Use the 'with-kbq-query-set-run macro to provide the scaling factor from internal real time to seconds.");
  public static final SubLString $str55$Use_the__with_kbq_query_set_run__ = makeString("Use the 'with-kbq-query-set-run' macro to provide the scaling factor from internal real time to seconds.");
  public static final SubLList $list56 = list(makeKeyword("MAX-TIME"), makeKeyword("OUTLIER-TIMEOUT"));
  public static final SubLSymbol $kw57$TAUTOLOGY = makeKeyword("TAUTOLOGY");
  public static final SubLInteger $int58$1000 = makeInteger(1000);
  public static final SubLInteger $int59$100 = makeInteger(100);
  public static final SubLFloat $float60$0_1 = makeDouble(0.1);
  public static final SubLFloat $float61$0_01 = makeDouble(0.01);
  public static final SubLSymbol $kw62$INFERENCE_PROOF_SPEC = makeKeyword("INFERENCE-PROOF-SPEC");
  public static final SubLObject $const63$sentenceTruth = constant_handles.reader_make_constant_shell(makeString("sentenceTruth"));
  public static final SubLInteger $int64$_2 = makeInteger(-2);
  public static final SubLSymbol $sym65$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $kw66$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw67$STATUS = makeKeyword("STATUS");
  public static final SubLSymbol $kw68$QUERY_RUN = makeKeyword("QUERY-RUN");
  public static final SubLSymbol $kw69$MACHINE = makeKeyword("MACHINE");
  public static final SubLSymbol $kw70$DATE = makeKeyword("DATE");
  public static final SubLSymbol $kw71$BOGOMIPS = makeKeyword("BOGOMIPS");
  public static final SubLSymbol $kw72$INTERNAL_TIME_UNITS_PER_SECOND = makeKeyword("INTERNAL-TIME-UNITS-PER-SECOND");
  public static final SubLSymbol $kw73$PATCH_LEVEL = makeKeyword("PATCH-LEVEL");
  public static final SubLSymbol $kw74$COMMENT = makeKeyword("COMMENT");
  public static final SubLSymbol $kw75$QUERY_RUNS = makeKeyword("QUERY-RUNS");
  public static final SubLSymbol $sym76$KBQ_QUERY_SET_RUN_QUERY_RUNS = makeSymbol("KBQ-QUERY-SET-RUN-QUERY-RUNS");
  public static final SubLList $list77 = list(makeSymbol("&KEY"), makeSymbol("MACHINE"), makeSymbol("DATE"), makeSymbol("BOGOMIPS"), makeSymbol("INTERNAL-TIME-UNITS-PER-SECOND"), makeSymbol("PATCH-LEVEL"), makeSymbol("COMMENT"), makeSymbol("TEST-RUNS"));
  public static final SubLList $list78 = list(makeKeyword("MACHINE"), makeKeyword("DATE"), makeKeyword("BOGOMIPS"), makeKeyword("INTERNAL-TIME-UNITS-PER-SECOND"), makeKeyword("PATCH-LEVEL"), makeKeyword("COMMENT"), makeKeyword("TEST-RUNS"));
  public static final SubLSymbol $kw79$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw80$TEST_RUNS = makeKeyword("TEST-RUNS");
  public static final SubLSymbol $sym81$INVALID_FORT_ = makeSymbol("INVALID-FORT?");
  public static final SubLSymbol $sym82$KBQ_RUNNABLE_ = makeSymbol("KBQ-RUNNABLE?");
  public static final SubLSymbol $sym83$_ = makeSymbol("<");
  public static final SubLSymbol $sym84$SAFE__ = makeSymbol("SAFE-<");
  public static final SubLString $str85$_s_____s__ = makeString("~s -> ~s~%");
  public static final SubLSymbol $sym86$KBQ_QUERY_RUN_QUERY = makeSymbol("KBQ-QUERY-RUN-QUERY");
  public static final SubLSymbol $kw87$MEDIAN_TOTAL_TIME = makeKeyword("MEDIAN-TOTAL-TIME");
  public static final SubLSymbol $kw88$MEDIAN_TIME_TO_FIRST_ANSWER = makeKeyword("MEDIAN-TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw89$MEDIAN_TIME_TO_LAST_ANSWER = makeKeyword("MEDIAN-TIME-TO-LAST-ANSWER");
  public static final SubLString $str90$what_s_the_median_for__s = makeString("what's the median for ~s");
  public static final SubLSymbol $kw91$MEAN_TOTAL_TIME = makeKeyword("MEAN-TOTAL-TIME");
  public static final SubLSymbol $kw92$MEAN_TIME_TO_FIRST_ANSWER = makeKeyword("MEAN-TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw93$MEAN_TIME_TO_LAST_ANSWER = makeKeyword("MEAN-TIME-TO-LAST-ANSWER");
  public static final SubLString $str94$what_s_the_mean_for__s = makeString("what's the mean for ~s");
  public static final SubLSymbol $sym95$KBQ_QUERY_RUN_TOTAL_TIME = makeSymbol("KBQ-QUERY-RUN-TOTAL-TIME");
  public static final SubLSymbol $sym96$KBQ_QUERY_RUN_TIME_TO_FIRST_ANSWER = makeSymbol("KBQ-QUERY-RUN-TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $sym97$KBQ_QUERY_RUN_TIME_TO_LAST_ANSWER = makeSymbol("KBQ-QUERY-RUN-TIME-TO-LAST-ANSWER");
  public static final SubLSymbol $sym98$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME = makeSymbol("KBQ-QUERY-RUN-COMPLETE-TOTAL-TIME");
  public static final SubLSymbol $sym99$KBQ_QUERY_RUN_COMPLETE_TIME_TO_FIRST_ANSWER = makeSymbol("KBQ-QUERY-RUN-COMPLETE-TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $sym100$KBQ_QUERY_RUN_COMPLETE_TIME_TO_LAST_ANSWER = makeSymbol("KBQ-QUERY-RUN-COMPLETE-TIME-TO-LAST-ANSWER");
  public static final SubLSymbol $sym101$KBQ_QUERY_RUN_ANSWER_COUNT = makeSymbol("KBQ-QUERY-RUN-ANSWER-COUNT");
  public static final SubLString $str102$unknown_metric__s = makeString("unknown metric ~s");
  public static final SubLSymbol $sym103$KCT_TEST_SET_RUN_TEST_RUNS = makeSymbol("KCT-TEST-SET-RUN-TEST-RUNS");
  public static final SubLSymbol $sym104$KCT_TEST_RUN_TEST = makeSymbol("KCT-TEST-RUN-TEST");
  public static final SubLSymbol $sym105$KBQ_QUERY_SPEC_P = makeSymbol("KBQ-QUERY-SPEC-P");
  public static final SubLSymbol $sym106$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym107$QUERY_METRIC_P = makeSymbol("QUERY-METRIC-P");
  public static final SubLSymbol $sym108$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLSymbol $sym109$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $sym110$QUERY_PROPERTY_P = makeSymbol("QUERY-PROPERTY-P");
  public static final SubLSymbol $kw111$CONTINUABLE_ = makeKeyword("CONTINUABLE?");
  public static final SubLSymbol $kw112$METRICS = makeKeyword("METRICS");
  public static final SubLSymbol $kw113$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLString $str114$___A____ = makeString("~%~A~%~%");
  public static final SubLSymbol $kw115$RUNNING = makeKeyword("RUNNING");
  public static final SubLSymbol $sym116$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $kw117$NEVER_RUN = makeKeyword("NEVER-RUN");
  public static final SubLSymbol $kw118$FINISHED = makeKeyword("FINISHED");
  public static final SubLString $str119$Outlier_____S = makeString("Outlier :~%~S");
  public static final SubLSymbol $kw120$OUTLIER_ABORT = makeKeyword("OUTLIER-ABORT");
  public static final SubLSymbol $kw121$OUTLIER_TIMEOUT = makeKeyword("OUTLIER-TIMEOUT");
  public static final SubLString $str122$Unable_to_compute_any_metrics_for = makeString("Unable to compute any metrics for ~A");
  public static final SubLString $str123$Unable_to_compute_all_desired_met = makeString("Unable to compute all desired metrics for ~A");
  public static final SubLString $str124$KBQ_harness_error_for__A____A = makeString("KBQ harness error for ~A : ~A");
  public static final SubLString $str125$Error_____S___A = makeString("Error :~%~S~%~A");
  public static final SubLSymbol $kw126$NOT_A_QUERY = makeKeyword("NOT-A-QUERY");
  public static final SubLString $str127$Avoided__due_to__S______S = makeString("Avoided (due to ~S) :~%~S");
  public static final SubLSymbol $kw128$OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");
  public static final SubLSymbol $kw129$ABORT = makeKeyword("ABORT");
  public static final SubLObject $const130$testFollowupTestFormula_All = constant_handles.reader_make_constant_shell(makeString("testFollowupTestFormula-All"));
  public static final SubLObject $const131$testFollowupTestFormula_Some = constant_handles.reader_make_constant_shell(makeString("testFollowupTestFormula-Some"));
  public static final SubLObject $const132$testFollowupTestFormula_None = constant_handles.reader_make_constant_shell(makeString("testFollowupTestFormula-None"));
  public static final SubLSymbol $sym133$KCT_TEST_SPEC_P = makeSymbol("KCT-TEST-SPEC-P");
  public static final SubLObject $const134$TestMetric_HaltReason = constant_handles.reader_make_constant_shell(makeString("TestMetric-HaltReason"));
  public static final SubLString $str135$Unsupported_metric__S = makeString("Unsupported metric ~S");
  public static final SubLList $list136 = list(cons(constant_handles.reader_make_constant_shell(makeString("TestMetric-TotalTime")), makeKeyword("TOTAL-TIME")), cons(constant_handles.reader_make_constant_shell(makeString("TestMetric-TimeToFirstAnswer")), makeKeyword("TIME-TO-FIRST-ANSWER")), cons(constant_handles.reader_make_constant_shell(makeString("TestMetric-TimeToLastAnswer")), makeKeyword("TIME-TO-LAST-ANSWER")), cons(constant_handles.reader_make_constant_shell(makeString("TestMetric-AnswerCount")), makeKeyword("ANSWER-COUNT")), cons(constant_handles.reader_make_constant_shell(makeString("TestMetric-AnswerCountAt30Seconds")), makeKeyword("ANSWER-COUNT-AT-30-SECONDS")), cons(constant_handles.reader_make_constant_shell(makeString("TestMetric-AnswerCountAt60Seconds")), makeKeyword("ANSWER-COUNT-AT-60-SECONDS")), cons(constant_handles.reader_make_constant_shell(makeString("TestMetric-ProblemStoreProofCount")), makeKeyword("PROOF-COUNT")), cons(constant_handles.reader_make_constant_shell(makeString("TestMetric-ProblemStoreProblemCount")), makeKeyword("PROBLEM-COUNT")));
  public static final SubLSymbol $kw137$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
  public static final SubLList $list138 = list(makeKeyword("CONDITIONAL-SENTENCE?"), NIL);
  public static final SubLString $str139$Expected_exactly_ = makeString("Expected exactly ");
  public static final SubLString $str140$_binding_sets__but_got_ = makeString(" binding sets, but got ");
  public static final SubLString $str141$_ = makeString(".");
  public static final SubLString $str142$Expected_at_least_ = makeString("Expected at least ");
  public static final SubLString $str143$Expected_no_more_than_ = makeString("Expected no more than ");
  public static final SubLString $str144$ = makeString("");
  public static final SubLString $str145$These_expected_bindings_were_miss = makeString("These expected bindings were missing: ");
  public static final SubLString $str146$These_unwanted_bindings_were_retu = makeString("These unwanted bindings were returned: ");
  public static final SubLString $str147$____ = makeString("    ");
  public static final SubLSymbol $kw148$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLSymbol $sym149$FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");
  public static final SubLSymbol $kw150$ABORT_KBQ_RUN_QUERY_SET = makeKeyword("ABORT-KBQ-RUN-QUERY-SET");
  public static final SubLString $str151$Abort_KBQ_run_query_set = makeString("Abort KBQ run query set");
  public static final SubLString $str152$KBQ_running_query_set = makeString("KBQ running query set");
  public static final SubLString $str153$__Running__s = makeString("~&Running ~s");
  public static final SubLString $str154$_________________________________ = makeString("~&~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;~%");
  public static final SubLString $str155$______A____ = makeString("~&;; ~A~%~%");
  public static final SubLString $str156$Unrunnable_query____S = makeString("Unrunnable query : ~S");
  public static final SubLSymbol $sym157$JANUS_OPERATION_P = makeSymbol("JANUS-OPERATION-P");
  public static final SubLObject $const158$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const159$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const160$elementOf = constant_handles.reader_make_constant_shell(makeString("elementOf"));
  public static final SubLSymbol $sym161$_OBJ = makeSymbol("?OBJ");
  public static final SubLList $list162 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"));
  public static final SubLList $list163 = list(constant_handles.reader_make_constant_shell(makeString("evaluate")), makeKeyword("SET"), list(constant_handles.reader_make_constant_shell(makeString("SetExtentFn")), list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?QUERY"), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TEST"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("knownSentence")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?TEST"), makeKeyword("TEST-COLLECTION"))), list(constant_handles.reader_make_constant_shell(makeString("assertedSentence")), list(constant_handles.reader_make_constant_shell(makeString("testQuerySpecification")), makeSymbol("?TEST"), makeSymbol("?QUERY"))))))));
  public static final SubLSymbol $kw164$TEST_COLLECTION = makeKeyword("TEST-COLLECTION");
  public static final SubLSymbol $kw165$SET = makeKeyword("SET");
  public static final SubLList $list166 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));
  public static final SubLSymbol $kw167$ABORT_KCT_RUN_TEST_SET = makeKeyword("ABORT-KCT-RUN-TEST-SET");
  public static final SubLString $str168$Abort_KCT_run_test_set = makeString("Abort KCT run test set");
  public static final SubLString $str169$KCT_running_test_set = makeString("KCT running test set");
  public static final SubLString $str170$__Running__s__ = makeString("~&Running ~s~%");
  public static final SubLString $str171$Unrunnable_test____S = makeString("Unrunnable test : ~S");
  public static final SubLList $list172 = list(new SubLObject[] {makeSymbol("&KEY"), makeSymbol("QUERY-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("ANALYSIS-FILENAME"), makeSymbol("KEEPALIVE-FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(makeSymbol("QUOTE"), list(makeSymbol("ALL-ARETE-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*KBQ-DEFAULT-OUTLIER-TIMEOUT*"))), makeSymbol("INCREMENTAL"), list(makeSymbol("INCLUDE-RESULTS"), T), list(makeSymbol("RANDOMIZE"), NIL), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT"), list(makeSymbol("IF-FILE-EXISTS"), makeKeyword("OVERWRITE"))});
  public static final SubLList $list173 = list(new SubLObject[] {makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("ANALYSIS-FILENAME"), makeKeyword("KEEPALIVE-FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("RANDOMIZE"), makeKeyword("SKIP"), makeKeyword("COUNT"), makeKeyword("IF-FILE-EXISTS")});
  public static final SubLSymbol $kw174$QUERY_SPEC_SET = makeKeyword("QUERY-SPEC-SET");
  public static final SubLSymbol $kw175$FILENAME = makeKeyword("FILENAME");
  public static final SubLSymbol $kw176$ANALYSIS_FILENAME = makeKeyword("ANALYSIS-FILENAME");
  public static final SubLSymbol $kw177$KEEPALIVE_FILENAME = makeKeyword("KEEPALIVE-FILENAME");
  public static final SubLList $list178 = list(makeSymbol("ALL-ARETE-QUERY-METRICS"));
  public static final SubLSymbol $sym179$_KBQ_DEFAULT_OUTLIER_TIMEOUT_ = makeSymbol("*KBQ-DEFAULT-OUTLIER-TIMEOUT*");
  public static final SubLSymbol $kw180$INCREMENTAL = makeKeyword("INCREMENTAL");
  public static final SubLSymbol $kw181$INCLUDE_RESULTS = makeKeyword("INCLUDE-RESULTS");
  public static final SubLSymbol $kw182$RANDOMIZE = makeKeyword("RANDOMIZE");
  public static final SubLSymbol $kw183$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw184$COUNT = makeKeyword("COUNT");
  public static final SubLSymbol $kw185$IF_FILE_EXISTS = makeKeyword("IF-FILE-EXISTS");
  public static final SubLSymbol $kw186$OVERWRITE = makeKeyword("OVERWRITE");
  public static final SubLSymbol $sym187$RUN_KBQ_EXPERIMENT_INTERNAL = makeSymbol("RUN-KBQ-EXPERIMENT-INTERNAL");
  public static final SubLSymbol $sym188$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym189$_LAST_QUERY_SET_RUN_ = makeSymbol("*LAST-QUERY-SET-RUN*");
  public static final SubLSymbol $sym190$RUN_KBQ_EXPERIMENT = makeSymbol("RUN-KBQ-EXPERIMENT");
  public static final SubLSymbol $sym191$KBQ_IF_FILE_EXISTS_HANDLING_P = makeSymbol("KBQ-IF-FILE-EXISTS-HANDLING-P");
  public static final SubLString $str192$__run_starting_at__A = makeString("~%run starting at ~A");
  public static final SubLString $str193$__run_ended_at__A = makeString("~%run ended at ~A");
  public static final SubLString $str194$__elapsed_time____A = makeString("~%elapsed time : ~A");
  public static final SubLString $str195$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $sym196$KBQ_ERRORING_QUERY_RUN_ = makeSymbol("KBQ-ERRORING-QUERY-RUN?");
  public static final SubLList $list197 = list(makeKeyword("OVERWRITE"), makeKeyword("AUGMENT"), makeKeyword("RERUN-ERRORS"), makeKeyword("AUGMENT-OR-RERUN-ERRORS"));
  public static final SubLSymbol $kw198$AUGMENT = makeKeyword("AUGMENT");
  public static final SubLSymbol $kw199$APPEND = makeKeyword("APPEND");
  public static final SubLSymbol $kw200$RERUN_ERRORS = makeKeyword("RERUN-ERRORS");
  public static final SubLSymbol $kw201$AUGMENT_OR_RERUN_ERRORS = makeKeyword("AUGMENT-OR-RERUN-ERRORS");
  public static final SubLString $str202$unexpected_if_file_exists__s = makeString("unexpected if-file-exists ~s");
  public static final SubLString $str203$_rerun_errors_ = makeString("-rerun-errors-");
  public static final SubLList $list204 = list(new SubLObject[] {makeSymbol("&KEY"), makeSymbol("TEST-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("ANALYSIS-FILENAME"), makeSymbol("KEEPALIVE-FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("OVERRIDING-METRICS"), list(makeSymbol("QUOTE"), list(makeSymbol("ALL-ARETE-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*KBQ-OUTLIER-TIMEOUT*"))), makeSymbol("INCREMENTAL"), list(makeSymbol("INCLUDE-RESULTS"), T), list(makeSymbol("IF-FILE-EXISTS"), makeKeyword("OVERWRITE")), list(makeSymbol("EXPOSE-RUNSTATE"), NIL), list(makeSymbol("RANDOMIZE"), NIL), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT")});
  public static final SubLList $list205 = list(new SubLObject[] {makeKeyword("TEST-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("ANALYSIS-FILENAME"), makeKeyword("KEEPALIVE-FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("OVERRIDING-METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("IF-FILE-EXISTS"), makeKeyword("EXPOSE-RUNSTATE"), makeKeyword("RANDOMIZE"), makeKeyword("SKIP"), makeKeyword("COUNT")});
  public static final SubLSymbol $kw206$TEST_SPEC_SET = makeKeyword("TEST-SPEC-SET");
  public static final SubLSymbol $kw207$OVERRIDING_METRICS = makeKeyword("OVERRIDING-METRICS");
  public static final SubLSymbol $sym208$_KBQ_OUTLIER_TIMEOUT_ = makeSymbol("*KBQ-OUTLIER-TIMEOUT*");
  public static final SubLSymbol $kw209$EXPOSE_RUNSTATE = makeKeyword("EXPOSE-RUNSTATE");
  public static final SubLSymbol $sym210$RUN_KCT_EXPERIMENT_INTERNAL = makeSymbol("RUN-KCT-EXPERIMENT-INTERNAL");
  public static final SubLSymbol $sym211$_LAST_TEST_SET_RUN_ = makeSymbol("*LAST-TEST-SET-RUN*");
  public static final SubLSymbol $sym212$RUN_KCT_EXPERIMENT = makeSymbol("RUN-KCT-EXPERIMENT");
  public static final SubLString $str213$Filtered_to___KBContentRegression = makeString("Filtered to #$KBContentRegressionTests");
  public static final SubLSymbol $sym214$KB_CONTENT_REGRESSION_TEST_ = makeSymbol("KB-CONTENT-REGRESSION-TEST?");
  public static final SubLString $str215$All_tests___ = makeString("All tests:~%");
  public static final SubLString $str216$__Just_the_regression_tests___ = makeString("~%Just the regression tests:~%");
  public static final SubLSymbol $sym217$KCT_ERRORING_TEST_RUN_ = makeSymbol("KCT-ERRORING-TEST-RUN?");
  public static final SubLSymbol $sym218$KCT_TEST_RUNNABLE_ = makeSymbol("KCT-TEST-RUNNABLE?");
  public static final SubLSymbol $sym219$_RUNSTATE_ISG_ = makeSymbol("*RUNSTATE-ISG*");
  public static final SubLSymbol $sym220$_RUNSTATE_INDEX_ = makeSymbol("*RUNSTATE-INDEX*");
  public static final SubLString $str221$Unknown_runstate_type___A = makeString("Unknown runstate type: ~A");
  public static final SubLString $str222$Runstate_has_no_status___A = makeString("Runstate has no status: ~A");
  public static final SubLString $str223$Explanations_aren_t_yet_implement = makeString("Explanations aren't yet implemented.");
  public static final SubLString $str224$No_inference_defined_for_this_run = makeString("No inference defined for this runstate: ~A");
  public static final SubLString $str225$No_start_defined_for_this_runstat = makeString("No start defined for this runstate: ~A");
  public static final SubLString $str226$No_end_defined_for_this_runstate_ = makeString("No end defined for this runstate: ~A");
  public static final SubLSymbol $sym227$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym228$KBQ_RUNSTATE = makeSymbol("KBQ-RUNSTATE");
  public static final SubLSymbol $sym229$KBQ_RUNSTATE_P = makeSymbol("KBQ-RUNSTATE-P");
  public static final SubLList $list230 = list(makeSymbol("ID"), makeSymbol("LOCK"), makeSymbol("QUERY-SPEC"), makeSymbol("INFERENCE"), makeSymbol("RESULT"), makeSymbol("TEST-RUNSTATE"), makeSymbol("RUN-STATUS"));
  public static final SubLList $list231 = list(makeKeyword("ID"), makeKeyword("LOCK"), makeKeyword("QUERY-SPEC"), makeKeyword("INFERENCE"), makeKeyword("RESULT"), makeKeyword("TEST-RUNSTATE"), makeKeyword("RUN-STATUS"));
  public static final SubLList $list232 = list(makeSymbol("KBQR-ID"), makeSymbol("KBQR-LOCK"), makeSymbol("KBQR-QUERY-SPEC"), makeSymbol("KBQR-INFERENCE"), makeSymbol("KBQR-RESULT"), makeSymbol("KBQR-TEST-RUNSTATE"), makeSymbol("KBQR-RUN-STATUS"));
  public static final SubLList $list233 = list(makeSymbol("_CSETF-KBQR-ID"), makeSymbol("_CSETF-KBQR-LOCK"), makeSymbol("_CSETF-KBQR-QUERY-SPEC"), makeSymbol("_CSETF-KBQR-INFERENCE"), makeSymbol("_CSETF-KBQR-RESULT"), makeSymbol("_CSETF-KBQR-TEST-RUNSTATE"), makeSymbol("_CSETF-KBQR-RUN-STATUS"));
  public static final SubLSymbol $sym234$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym235$KBQ_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KBQ-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym236$KBQR_ID = makeSymbol("KBQR-ID");
  public static final SubLSymbol $sym237$_CSETF_KBQR_ID = makeSymbol("_CSETF-KBQR-ID");
  public static final SubLSymbol $sym238$KBQR_LOCK = makeSymbol("KBQR-LOCK");
  public static final SubLSymbol $sym239$_CSETF_KBQR_LOCK = makeSymbol("_CSETF-KBQR-LOCK");
  public static final SubLSymbol $sym240$KBQR_QUERY_SPEC = makeSymbol("KBQR-QUERY-SPEC");
  public static final SubLSymbol $sym241$_CSETF_KBQR_QUERY_SPEC = makeSymbol("_CSETF-KBQR-QUERY-SPEC");
  public static final SubLSymbol $sym242$KBQR_INFERENCE = makeSymbol("KBQR-INFERENCE");
  public static final SubLSymbol $sym243$_CSETF_KBQR_INFERENCE = makeSymbol("_CSETF-KBQR-INFERENCE");
  public static final SubLSymbol $sym244$KBQR_RESULT = makeSymbol("KBQR-RESULT");
  public static final SubLSymbol $sym245$_CSETF_KBQR_RESULT = makeSymbol("_CSETF-KBQR-RESULT");
  public static final SubLSymbol $sym246$KBQR_TEST_RUNSTATE = makeSymbol("KBQR-TEST-RUNSTATE");
  public static final SubLSymbol $sym247$_CSETF_KBQR_TEST_RUNSTATE = makeSymbol("_CSETF-KBQR-TEST-RUNSTATE");
  public static final SubLSymbol $sym248$KBQR_RUN_STATUS = makeSymbol("KBQR-RUN-STATUS");
  public static final SubLSymbol $sym249$_CSETF_KBQR_RUN_STATUS = makeSymbol("_CSETF-KBQR-RUN-STATUS");
  public static final SubLSymbol $kw250$ID = makeKeyword("ID");
  public static final SubLSymbol $kw251$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw252$QUERY_SPEC = makeKeyword("QUERY-SPEC");
  public static final SubLSymbol $kw253$INFERENCE = makeKeyword("INFERENCE");
  public static final SubLSymbol $kw254$TEST_RUNSTATE = makeKeyword("TEST-RUNSTATE");
  public static final SubLSymbol $kw255$RUN_STATUS = makeKeyword("RUN-STATUS");
  public static final SubLString $str256$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym257$KCT_RUNSTATE_P = makeSymbol("KCT-RUNSTATE-P");
  public static final SubLString $str258$KBQ_Runstate_Lock = makeString("KBQ Runstate Lock");
  public static final SubLSymbol $kw259$NONE = makeKeyword("NONE");
  public static final SubLSymbol $sym260$INFERENCE_P = makeSymbol("INFERENCE-P");
  public static final SubLSymbol $sym261$KBQ_QUERY_RUN_P = makeSymbol("KBQ-QUERY-RUN-P");
  public static final SubLSymbol $sym262$KCT_RUNSTATE = makeSymbol("KCT-RUNSTATE");
  public static final SubLList $list263 = list(new SubLObject[] {makeSymbol("ID"), makeSymbol("LOCK"), makeSymbol("TEST-SPEC"), makeSymbol("RESULT"), makeSymbol("QUERY-RUNSTATE"), makeSymbol("TEST-SET-RUNSTATE"), makeSymbol("RUN-STATUS"), makeSymbol("START"), makeSymbol("END")});
  public static final SubLList $list264 = list(new SubLObject[] {makeKeyword("ID"), makeKeyword("LOCK"), makeKeyword("TEST-SPEC"), makeKeyword("RESULT"), makeKeyword("QUERY-RUNSTATE"), makeKeyword("TEST-SET-RUNSTATE"), makeKeyword("RUN-STATUS"), makeKeyword("START"), makeKeyword("END")});
  public static final SubLList $list265 = list(new SubLObject[] {makeSymbol("KCTR-ID"), makeSymbol("KCTR-LOCK"), makeSymbol("KCTR-TEST-SPEC"), makeSymbol("KCTR-RESULT"), makeSymbol("KCTR-QUERY-RUNSTATE"), makeSymbol("KCTR-TEST-SET-RUNSTATE"), makeSymbol("KCTR-RUN-STATUS"), makeSymbol("KCTR-START"), makeSymbol("KCTR-END")});
  public static final SubLList $list266 = list(new SubLObject[] {makeSymbol("_CSETF-KCTR-ID"), makeSymbol("_CSETF-KCTR-LOCK"), makeSymbol("_CSETF-KCTR-TEST-SPEC"), makeSymbol("_CSETF-KCTR-RESULT"), makeSymbol("_CSETF-KCTR-QUERY-RUNSTATE"), makeSymbol("_CSETF-KCTR-TEST-SET-RUNSTATE"), makeSymbol("_CSETF-KCTR-RUN-STATUS"), makeSymbol("_CSETF-KCTR-START"), makeSymbol("_CSETF-KCTR-END")});
  public static final SubLSymbol $sym267$KCT_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KCT-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym268$KCTR_ID = makeSymbol("KCTR-ID");
  public static final SubLSymbol $sym269$_CSETF_KCTR_ID = makeSymbol("_CSETF-KCTR-ID");
  public static final SubLSymbol $sym270$KCTR_LOCK = makeSymbol("KCTR-LOCK");
  public static final SubLSymbol $sym271$_CSETF_KCTR_LOCK = makeSymbol("_CSETF-KCTR-LOCK");
  public static final SubLSymbol $sym272$KCTR_TEST_SPEC = makeSymbol("KCTR-TEST-SPEC");
  public static final SubLSymbol $sym273$_CSETF_KCTR_TEST_SPEC = makeSymbol("_CSETF-KCTR-TEST-SPEC");
  public static final SubLSymbol $sym274$KCTR_RESULT = makeSymbol("KCTR-RESULT");
  public static final SubLSymbol $sym275$_CSETF_KCTR_RESULT = makeSymbol("_CSETF-KCTR-RESULT");
  public static final SubLSymbol $sym276$KCTR_QUERY_RUNSTATE = makeSymbol("KCTR-QUERY-RUNSTATE");
  public static final SubLSymbol $sym277$_CSETF_KCTR_QUERY_RUNSTATE = makeSymbol("_CSETF-KCTR-QUERY-RUNSTATE");
  public static final SubLSymbol $sym278$KCTR_TEST_SET_RUNSTATE = makeSymbol("KCTR-TEST-SET-RUNSTATE");
  public static final SubLSymbol $sym279$_CSETF_KCTR_TEST_SET_RUNSTATE = makeSymbol("_CSETF-KCTR-TEST-SET-RUNSTATE");
  public static final SubLSymbol $sym280$KCTR_RUN_STATUS = makeSymbol("KCTR-RUN-STATUS");
  public static final SubLSymbol $sym281$_CSETF_KCTR_RUN_STATUS = makeSymbol("_CSETF-KCTR-RUN-STATUS");
  public static final SubLSymbol $sym282$KCTR_START = makeSymbol("KCTR-START");
  public static final SubLSymbol $sym283$_CSETF_KCTR_START = makeSymbol("_CSETF-KCTR-START");
  public static final SubLSymbol $sym284$KCTR_END = makeSymbol("KCTR-END");
  public static final SubLSymbol $sym285$_CSETF_KCTR_END = makeSymbol("_CSETF-KCTR-END");
  public static final SubLSymbol $kw286$TEST_SPEC = makeKeyword("TEST-SPEC");
  public static final SubLSymbol $kw287$QUERY_RUNSTATE = makeKeyword("QUERY-RUNSTATE");
  public static final SubLSymbol $kw288$TEST_SET_RUNSTATE = makeKeyword("TEST-SET-RUNSTATE");
  public static final SubLSymbol $kw289$START = makeKeyword("START");
  public static final SubLSymbol $kw290$END = makeKeyword("END");
  public static final SubLSymbol $sym291$KCT_SET_RUNSTATE_P = makeSymbol("KCT-SET-RUNSTATE-P");
  public static final SubLString $str292$KCT_Runstate_Lock = makeString("KCT Runstate Lock");
  public static final SubLSymbol $sym293$KCT_TEST_RUN_P = makeSymbol("KCT-TEST-RUN-P");
  public static final SubLSymbol $sym294$KCT_SET_RUNSTATE = makeSymbol("KCT-SET-RUNSTATE");
  public static final SubLList $list295 = list(makeSymbol("ID"), makeSymbol("LOCK"), makeSymbol("TEST-SET"), makeSymbol("RESULT"), makeSymbol("TEST-RUNSTATES"), makeSymbol("RUN-STATUS"), makeSymbol("START"), makeSymbol("END"));
  public static final SubLList $list296 = list(makeKeyword("ID"), makeKeyword("LOCK"), makeKeyword("TEST-SET"), makeKeyword("RESULT"), makeKeyword("TEST-RUNSTATES"), makeKeyword("RUN-STATUS"), makeKeyword("START"), makeKeyword("END"));
  public static final SubLList $list297 = list(makeSymbol("KCTSR-ID"), makeSymbol("KCTSR-LOCK"), makeSymbol("KCTSR-TEST-SET"), makeSymbol("KCTSR-RESULT"), makeSymbol("KCTSR-TEST-RUNSTATES"), makeSymbol("KCTSR-RUN-STATUS"), makeSymbol("KCTSR-START"), makeSymbol("KCTSR-END"));
  public static final SubLList $list298 = list(makeSymbol("_CSETF-KCTSR-ID"), makeSymbol("_CSETF-KCTSR-LOCK"), makeSymbol("_CSETF-KCTSR-TEST-SET"), makeSymbol("_CSETF-KCTSR-RESULT"), makeSymbol("_CSETF-KCTSR-TEST-RUNSTATES"), makeSymbol("_CSETF-KCTSR-RUN-STATUS"), makeSymbol("_CSETF-KCTSR-START"), makeSymbol("_CSETF-KCTSR-END"));
  public static final SubLSymbol $sym299$KCT_SET_RUNSTATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KCT-SET-RUNSTATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym300$KCTSR_ID = makeSymbol("KCTSR-ID");
  public static final SubLSymbol $sym301$_CSETF_KCTSR_ID = makeSymbol("_CSETF-KCTSR-ID");
  public static final SubLSymbol $sym302$KCTSR_LOCK = makeSymbol("KCTSR-LOCK");
  public static final SubLSymbol $sym303$_CSETF_KCTSR_LOCK = makeSymbol("_CSETF-KCTSR-LOCK");
  public static final SubLSymbol $sym304$KCTSR_TEST_SET = makeSymbol("KCTSR-TEST-SET");
  public static final SubLSymbol $sym305$_CSETF_KCTSR_TEST_SET = makeSymbol("_CSETF-KCTSR-TEST-SET");
  public static final SubLSymbol $sym306$KCTSR_RESULT = makeSymbol("KCTSR-RESULT");
  public static final SubLSymbol $sym307$_CSETF_KCTSR_RESULT = makeSymbol("_CSETF-KCTSR-RESULT");
  public static final SubLSymbol $sym308$KCTSR_TEST_RUNSTATES = makeSymbol("KCTSR-TEST-RUNSTATES");
  public static final SubLSymbol $sym309$_CSETF_KCTSR_TEST_RUNSTATES = makeSymbol("_CSETF-KCTSR-TEST-RUNSTATES");
  public static final SubLSymbol $sym310$KCTSR_RUN_STATUS = makeSymbol("KCTSR-RUN-STATUS");
  public static final SubLSymbol $sym311$_CSETF_KCTSR_RUN_STATUS = makeSymbol("_CSETF-KCTSR-RUN-STATUS");
  public static final SubLSymbol $sym312$KCTSR_START = makeSymbol("KCTSR-START");
  public static final SubLSymbol $sym313$_CSETF_KCTSR_START = makeSymbol("_CSETF-KCTSR-START");
  public static final SubLSymbol $sym314$KCTSR_END = makeSymbol("KCTSR-END");
  public static final SubLSymbol $sym315$_CSETF_KCTSR_END = makeSymbol("_CSETF-KCTSR-END");
  public static final SubLSymbol $kw316$TEST_SET = makeKeyword("TEST-SET");
  public static final SubLSymbol $kw317$TEST_RUNSTATES = makeKeyword("TEST-RUNSTATES");
  public static final SubLSymbol $sym318$KCT_TEST_COLLECTION_P = makeSymbol("KCT-TEST-COLLECTION-P");
  public static final SubLString $str319$KCT_Set_Runstate_Lock = makeString("KCT Set Runstate Lock");
  public static final SubLSymbol $sym320$KCT_ERROR_RESULT_P = makeSymbol("KCT-ERROR-RESULT-P");
  public static final SubLSymbol $sym321$KCT_TEST_RUN_STATUS = makeSymbol("KCT-TEST-RUN-STATUS");
  public static final SubLSymbol $sym322$KCT_FAILURE_RESULT_P = makeSymbol("KCT-FAILURE-RESULT-P");
  public static final SubLSymbol $sym323$KCT_TEST_SET_RUN_P = makeSymbol("KCT-TEST-SET-RUN-P");
  public static final SubLList $list324 = list(list(makeSymbol("QUERY-SET-RUN"), makeSymbol("QUERY-RUN"), makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list325 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw326$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym327$STREAM = makeUninternedSymbol("STREAM");
  public static final SubLSymbol $sym328$DONE_VAR = makeUninternedSymbol("DONE-VAR");
  public static final SubLSymbol $sym329$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym330$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list331 = list(makeSymbol("STRINGP"));
  public static final SubLSymbol $sym332$WITH_PRIVATE_BINARY_FILE = makeSymbol("WITH-PRIVATE-BINARY-FILE");
  public static final SubLList $list333 = list(makeKeyword("INPUT"));
  public static final SubLSymbol $sym334$WITH_CFASL_COMMON_SYMBOLS = makeSymbol("WITH-CFASL-COMMON-SYMBOLS");
  public static final SubLList $list335 = list(makeSymbol("KBQ-CFASL-COMMON-SYMBOLS"));
  public static final SubLSymbol $sym336$WITH_NEW_CFASL_INPUT_GUID_STRING_RESOURCE = makeSymbol("WITH-NEW-CFASL-INPUT-GUID-STRING-RESOURCE");
  public static final SubLSymbol $sym337$KBQ_LOAD_QUERY_SET_RUN_INT = makeSymbol("KBQ-LOAD-QUERY-SET-RUN-INT");
  public static final SubLSymbol $sym338$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym339$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym340$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym341$KBQ_LOAD_QUERY_RUN_INT = makeSymbol("KBQ-LOAD-QUERY-RUN-INT");
  public static final SubLSymbol $sym342$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list343 = list(makeKeyword("EOF"));
  public static final SubLSymbol $sym344$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list345 = list(T);
  public static final SubLSymbol $sym346$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym347$KBQ_NCLEAN_QUERY_RUN = makeSymbol("KBQ-NCLEAN-QUERY-RUN");
  public static final SubLList $list348 = list(list(makeSymbol("QUERY-RUN"), makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym349$QUERY_SET_RUN = makeUninternedSymbol("QUERY-SET-RUN");
  public static final SubLSymbol $sym350$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym351$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw352$INPUT = makeKeyword("INPUT");
  public static final SubLSymbol $kw353$EOF = makeKeyword("EOF");
  public static final SubLString $str354$dwimming__s_to_NIL = makeString("dwimming ~s to NIL");
  public static final SubLString $str355$_cfasl = makeString(".cfasl");
  public static final SubLString $str356$_no_results = makeString("-no-results");
  public static final SubLString $str357$Expected_a__a_file__got__s = makeString("Expected a ~a file, got ~s");
  public static final SubLString $str358$answerable_sub_run_of_____A = makeString("answerable sub-run of :~%~A");
  public static final SubLSymbol $sym359$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLString $str360$succeeding_sub_run_of_____A = makeString("succeeding sub-run of :~%~A");
  public static final SubLSymbol $sym361$KCT_SUCCESS_RESULT_P = makeSymbol("KCT-SUCCESS-RESULT-P");
  public static final SubLString $str362$unanswerable_sub_run_of_____A = makeString("unanswerable sub-run of :~%~A");
  public static final SubLString $str363$failing_sub_run_of_____A = makeString("failing sub-run of :~%~A");
  public static final SubLObject $const364$CommonSenseTest = constant_handles.reader_make_constant_shell(makeString("CommonSenseTest"));
  public static final SubLString $str365$__CommonSenseTest_sub_run_of_____ = makeString("#$CommonSenseTest sub-run of :~%~A");
  public static final SubLList $list366 = list(makeSymbol("FILTERED-QUERY-SET-RUN-1"), makeSymbol("FILTERED-QUERY-SET-RUN-2"));
  public static final SubLSymbol $sym367$NOT_EQL = makeSymbol("NOT-EQL");
  public static final SubLString $str368$filtered_to_queries = makeString("filtered to queries");
  public static final SubLSymbol $sym369$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_NOT_LAMBDA = makeSymbol("KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-NOT-LAMBDA");
  public static final SubLSymbol $sym370$KBQ_FILTER_QUERY_SET_RUN_TO_QUERIES_LAMBDA = makeSymbol("KBQ-FILTER-QUERY-SET-RUN-TO-QUERIES-LAMBDA");
  public static final SubLString $str371$filtered_to_tests = makeString("filtered to tests");
  public static final SubLSymbol $sym372$KCT_FILTER_TEST_SET_RUN_TO_TESTS_NOT_LAMBDA = makeSymbol("KCT-FILTER-TEST-SET-RUN-TO-TESTS-NOT-LAMBDA");
  public static final SubLSymbol $sym373$KCT_FILTER_TEST_SET_RUN_TO_TESTS_LAMBDA = makeSymbol("KCT-FILTER-TEST-SET-RUN-TO-TESTS-LAMBDA");
  public static final SubLSymbol $sym374$CACHED_ALL_INSTANCES_AMONG = makeSymbol("CACHED-ALL-INSTANCES-AMONG");
  public static final SubLSymbol $sym375$_CACHED_ALL_INSTANCES_AMONG_CACHING_STATE_ = makeSymbol("*CACHED-ALL-INSTANCES-AMONG-CACHING-STATE*");
  public static final SubLSymbol $sym376$CLEAR_CACHED_ALL_INSTANCES_AMONG = makeSymbol("CLEAR-CACHED-ALL-INSTANCES-AMONG");
  public static final SubLSymbol $kw377$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list378 = cons(makeSymbol("FIRST-QUERY-SET-RUN"), makeSymbol("REST-QUERY-SET-RUNS"));
  public static final SubLList $list379 = cons(makeSymbol("FIRST-TEST-SET-RUN"), makeSymbol("REST-TEST-SET-RUNS"));
  public static final SubLSymbol $sym380$KCT_SUCCEEDING_TEST_SET_RUN = makeSymbol("KCT-SUCCEEDING-TEST-SET-RUN");
  public static final SubLSymbol $sym381$_ = makeSymbol(">");
  public static final SubLSymbol $sym382$FOURTH = makeSymbol("FOURTH");
  public static final SubLSymbol $sym383$SECOND = makeSymbol("SECOND");
  public static final SubLList $list384 = list(makeSymbol("&KEY"), makeSymbol("QUERY"), makeSymbol("MISSING-FROM-1"), makeSymbol("MISSING-FROM-2"));
  public static final SubLList $list385 = list(makeKeyword("QUERY"), makeKeyword("MISSING-FROM-1"), makeKeyword("MISSING-FROM-2"));
  public static final SubLSymbol $kw386$MISSING_FROM_1 = makeKeyword("MISSING-FROM-1");
  public static final SubLSymbol $kw387$MISSING_FROM_2 = makeKeyword("MISSING-FROM-2");
  public static final SubLSymbol $kw388$ANSWERABLE_2 = makeKeyword("ANSWERABLE-2");
  public static final SubLSymbol $kw389$MORE_ANSWERS_2 = makeKeyword("MORE-ANSWERS-2");
  public static final SubLSymbol $kw390$DIFFERENT_ANSWERS = makeKeyword("DIFFERENT-ANSWERS");
  public static final SubLSymbol $kw391$MORE_ANSWERS_1 = makeKeyword("MORE-ANSWERS-1");
  public static final SubLSymbol $kw392$ANSWERABLE_1 = makeKeyword("ANSWERABLE-1");
  public static final SubLString $str393$_S_and__S_are_different_queries = makeString("~S and ~S are different queries");
  public static final SubLString $str394$_S_has_no_result = makeString("~S has no result");
  public static final SubLString $str395$query_set_runs_contained_differen = makeString("query set runs contained different queries");
  public static final SubLString $str396$_s__s__s__s__s__ = makeString("~s ~s ~s ~s ~s~%");
  public static final SubLString $str397$_s__s__s__ = makeString("~s ~s ~s~%");
  public static final SubLSymbol $kw398$CHANGE = makeKeyword("CHANGE");
  public static final SubLSymbol $kw399$BECAME_SUCCESS = makeKeyword("BECAME-SUCCESS");
  public static final SubLSymbol $kw400$BECAME_FAILURE = makeKeyword("BECAME-FAILURE");
  public static final SubLString $str401$unexpected_change__S = makeString("unexpected change ~S");
  public static final SubLString $str402$_S_and__S_are_different_tests = makeString("~S and ~S are different tests");
  public static final SubLString $str403$_S_has_no_status = makeString("~S has no status");
  public static final SubLSymbol $kw404$UNDEFINED = makeKeyword("UNDEFINED");
  public static final SubLList $list405 = list(new SubLObject[] {makeKeyword("TOTAL"), makeKeyword("INCREASE"), makeKeyword("TOTAL-SUCCESS"), makeKeyword("INCREASE"), makeKeyword("TOTAL-FAILURE"), makeKeyword("DECREASE"), makeKeyword("TOTAL-ERROR"), makeKeyword("DECREASE"), makeKeyword("TOTAL-LUMPY"), makeKeyword("DECREASE"), makeKeyword("TOTAL-ANSWERABLE"), makeKeyword("INCREASE"), makeKeyword("TOTAL-UNANSWERABLE"), makeKeyword("DECREASE"), makeKeyword("SUM-ANSWER-COUNT"), makeKeyword("INCREASE"), makeKeyword("MEAN-ANSWER-COUNT"), makeKeyword("INCREASE"), makeKeyword("MEDIAN-ANSWER-COUNT"), makeKeyword("INCREASE"), makeKeyword("MEAN-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("STDEV-TIME-TO-FIRST-ANSWER"), makeKeyword("NEITHER"), makeKeyword("MEAN-COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("STDEV-COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("NEITHER"), makeKeyword("MEAN-TIME-TO-LAST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-TIME-TO-LAST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("STDEV-TIME-TO-LAST-ANSWER"), makeKeyword("NEITHER"), makeKeyword("SUM-ANSWERABILITY-TIME"), makeKeyword("DECREASE"), makeKeyword("MEAN-ANSWERABILITY-TIME"), makeKeyword("DECREASE"), makeKeyword("STDEV-ANSWERABILITY-TIME"), makeKeyword("NEITHER"), makeKeyword("MEDIAN-ANSWERABILITY-TIME"), makeKeyword("DECREASE"), makeKeyword("SUM-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("MEAN-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("STDEV-TOTAL-TIME"), makeKeyword("NEITHER"), makeKeyword("MEDIAN-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("SUM-COMPLETE-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("MEAN-COMPLETE-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("STDEV-COMPLETE-TOTAL-TIME"), makeKeyword("NEITHER"), makeKeyword("MEDIAN-COMPLETE-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-TIME-PER-ANSWER"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-COMPLETE-TIME-PER-ANSWER"), makeKeyword("DECREASE")});
  public static final SubLList $list406 = list(makeKeyword("INCREASE"), makeKeyword("DECREASE"), makeKeyword("NEITHER"));
  public static final SubLSymbol $kw407$NEITHER = makeKeyword("NEITHER");
  public static final SubLSymbol $kw408$INCREASE = makeKeyword("INCREASE");
  public static final SubLString $str409$empty__ = makeString("empty~%");
  public static final SubLSymbol $kw410$TOTAL = makeKeyword("TOTAL");
  public static final SubLSymbol $kw411$TOTAL_ANSWERABLE = makeKeyword("TOTAL-ANSWERABLE");
  public static final SubLSymbol $kw412$TOTAL_UNANSWERABLE = makeKeyword("TOTAL-UNANSWERABLE");
  public static final SubLSymbol $kw413$TOTAL_ERROR = makeKeyword("TOTAL-ERROR");
  public static final SubLSymbol $kw414$TOTAL_LUMPY = makeKeyword("TOTAL-LUMPY");
  public static final SubLSymbol $kw415$SUM_ANSWER_COUNT = makeKeyword("SUM-ANSWER-COUNT");
  public static final SubLSymbol $kw416$MEAN_ANSWER_COUNT = makeKeyword("MEAN-ANSWER-COUNT");
  public static final SubLSymbol $kw417$MEDIAN_ANSWER_COUNT = makeKeyword("MEDIAN-ANSWER-COUNT");
  public static final SubLSymbol $kw418$SUM_TOTAL_TIME = makeKeyword("SUM-TOTAL-TIME");
  public static final SubLSymbol $kw419$STDEV_TOTAL_TIME = makeKeyword("STDEV-TOTAL-TIME");
  public static final SubLSymbol $kw420$SUM_COMPLETE_TOTAL_TIME = makeKeyword("SUM-COMPLETE-TOTAL-TIME");
  public static final SubLSymbol $kw421$MEAN_COMPLETE_TOTAL_TIME = makeKeyword("MEAN-COMPLETE-TOTAL-TIME");
  public static final SubLSymbol $kw422$MEDIAN_COMPLETE_TOTAL_TIME = makeKeyword("MEDIAN-COMPLETE-TOTAL-TIME");
  public static final SubLSymbol $kw423$STDEV_COMPLETE_TOTAL_TIME = makeKeyword("STDEV-COMPLETE-TOTAL-TIME");
  public static final SubLSymbol $kw424$SUM_TIME_TO_FIRST_ANSWER = makeKeyword("SUM-TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw425$STDEV_TIME_TO_FIRST_ANSWER = makeKeyword("STDEV-TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw426$SUM_COMPLETE_TIME_TO_FIRST_ANSWER = makeKeyword("SUM-COMPLETE-TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw427$MEAN_COMPLETE_TIME_TO_FIRST_ANSWER = makeKeyword("MEAN-COMPLETE-TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw428$MEDIAN_COMPLETE_TIME_TO_FIRST_ANSWER = makeKeyword("MEDIAN-COMPLETE-TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw429$STDEV_COMPLETE_TIME_TO_FIRST_ANSWER = makeKeyword("STDEV-COMPLETE-TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw430$SUM_ANSWERABILITY_TIME = makeKeyword("SUM-ANSWERABILITY-TIME");
  public static final SubLSymbol $kw431$MEAN_ANSWERABILITY_TIME = makeKeyword("MEAN-ANSWERABILITY-TIME");
  public static final SubLSymbol $kw432$MEDIAN_ANSWERABILITY_TIME = makeKeyword("MEDIAN-ANSWERABILITY-TIME");
  public static final SubLSymbol $kw433$STDEV_ANSWERABILITY_TIME = makeKeyword("STDEV-ANSWERABILITY-TIME");
  public static final SubLSymbol $kw434$SUM_TIME_TO_LAST_ANSWER = makeKeyword("SUM-TIME-TO-LAST-ANSWER");
  public static final SubLSymbol $kw435$STDEV_TIME_TO_LAST_ANSWER = makeKeyword("STDEV-TIME-TO-LAST-ANSWER");
  public static final SubLSymbol $kw436$MEDIAN_COMPLETE_TIME_PER_ANSWER = makeKeyword("MEDIAN-COMPLETE-TIME-PER-ANSWER");
  public static final SubLString $str437$ignoring_metric__S = makeString("ignoring metric ~S");
  public static final SubLSymbol $kw438$MEDIAN_TIME_PER_ANSWER = makeKeyword("MEDIAN-TIME-PER-ANSWER");
  public static final SubLSymbol $kw439$TOTAL_SUCCESS = makeKeyword("TOTAL-SUCCESS");
  public static final SubLSymbol $kw440$TOTAL_FAILURE = makeKeyword("TOTAL-FAILURE");
  public static final SubLSymbol $kw441$PERCENT_SUCCESS = makeKeyword("PERCENT-SUCCESS");
  public static final SubLSymbol $kw442$PERCENT_FAILURE = makeKeyword("PERCENT-FAILURE");
  public static final SubLSymbol $sym443$KCT_TEST_RUN_QUERY_RUN = makeSymbol("KCT-TEST-RUN-QUERY-RUN");
  public static final SubLList $list444 = list(makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("COMPLETE-TOTAL-TIME"), makeKeyword("ANSWERABILITY-TIME"), makeKeyword("ANSWER-COUNT"));
  public static final SubLString $str445$_0 = makeString(":0");
  public static final SubLSymbol $sym446$BOUND_SYMBOL_P = makeSymbol("BOUND-SYMBOL-P");
  public static final SubLString $str447$____Answerability_analysis____ = makeString("~%~%Answerability analysis: ~%");
  public static final SubLString $str448$Total_____________s__s__s__ = makeString("Total:           ~s ~s ~s~%");
  public static final SubLString $str449$____Basic_analysis____ = makeString("~%~%Basic analysis: ~%");
  public static final SubLString $str450$____Mutually_Answerable____ = makeString("~%~%Mutually Answerable: ~%");
  public static final SubLString $str451$____Answerable____ = makeString("~%~%Answerable: ~%");
  public static final SubLString $str452$____Unanswerable____ = makeString("~%~%Unanswerable: ~%");
  public static final SubLList $list453 = list(makeKeyword("BOTH"), makeKeyword("BASELINE"));
  public static final SubLString $str454$Mutually_Answerable_ = makeString("Mutually Answerable ");
  public static final SubLSymbol $sym455$KBQ_LUMPY_QUERY_RUN_ = makeSymbol("KBQ-LUMPY-QUERY-RUN?");
  public static final SubLString $str456$Unable_to_compute_any_metrics = makeString("Unable to compute any metrics");
  public static final SubLSymbol $sym457$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLString $str458$_____Total_Tests____4D = makeString("~%;; Total Tests : ~4D");
  public static final SubLString $str459$______Successes_____4D___S___ = makeString("~%;;  Successes  : ~4D (~S %)");
  public static final SubLString $str460$______Failures______4D___S___ = makeString("~%;;  Failures   : ~4D (~S %)");
  public static final SubLString $str461$_______Test_Set_Metrics__ = makeString("~%~%;; Test Set Metrics~%");
  public static final SubLString $str462$____Test____S = makeString("~%~%Test : ~S");
  public static final SubLString $str463$__Status____S = makeString("~%Status : ~S");
  public static final SubLString $str464$__Halt_Reason____S = makeString("~%Halt Reason : ~S");
  public static final SubLString $str465$___S__S = makeString("~%~S ~S");
  public static final SubLSymbol $sym466$KBQ_QUERY_RUN_HALT_REASON = makeSymbol("KBQ-QUERY-RUN-HALT-REASON");
  public static final SubLInteger $int467$3600 = makeInteger(3600);
  public static final SubLString $str468$Running_kbq_benchmark__kbq_benchm = makeString("Running kbq benchmark (kbq-benchmark-report ");
  public static final SubLString $str469$_ = makeString(")");
  public static final SubLSymbol $sym470$KBQ_BENCHMARK_RUN = makeSymbol("KBQ-BENCHMARK-RUN");
  public static final SubLString $str471$kbq_benchmark__kbq_benchmark_repo = makeString("kbq benchmark (kbq-benchmark-report ~S) in background");
  public static final SubLSymbol $sym472$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym473$LISTP = makeSymbol("LISTP");
  public static final SubLString $str474$_______A______ = makeString("~&*** ~A ***~%");
  public static final SubLString $str475$____overriding_query_properties__ = makeString("*** overriding-query-properties: ~A ***~%");
  public static final SubLString $str476$Tests_run_in_System__A_KB__A__ = makeString("Tests run in System ~A KB ~A~%");
  public static final SubLObject $const477$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));
  public static final SubLSymbol $sym478$KCT_QUERY_SPECIFICATION = makeSymbol("KCT-QUERY-SPECIFICATION");
  public static final SubLList $list479 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("SKSI-QUERY-TOTAL-TIME"), makeKeyword("SKSI-QUERY-START-TIMES"), makeKeyword("TOTAL-TIME"));
  public static final SubLString $str480$__ANS__TTFS____TTFA__SQ____SKSI__ = makeString(" #ANS  TTFS    TTFA #SQ    SKSI +  CYC =  TOTAL   (%SQ)  TEST~%");
  public static final SubLString $str481$_________________________________ = makeString("---------------------------------------------------------------------~%");
  public static final SubLSymbol $kw482$SKSI_QUERY_START_TIMES = makeKeyword("SKSI-QUERY-START-TIMES");
  public static final SubLSymbol $kw483$SKSI_QUERY_TOTAL_TIME = makeKeyword("SKSI-QUERY-TOTAL-TIME");
  public static final SubLString $str484$_5D__5_1F__7_1F_4D__7_1F__7_1F__7 = makeString("~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%) ~A~A~%");
  public static final SubLSymbol $kw485$EXHAUST_TOTAL = makeKeyword("EXHAUST-TOTAL");
  public static final SubLString $str486$___A_ = makeString(" (~A)");
  public static final SubLString $str487$_5D__5_1F__7_1F_4D__7_1F__7_1F__7 = makeString("~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%)~%");
  public static final SubLList $list488 = list(makeString("/"));
  public static final SubLInteger $int489$60 = makeInteger(60);
  public static final SubLString $str490$_15A___5D__5_1F__7_1F_4D__7_1F__7 = makeString("~15A: ~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%) ~30A~%");

  //// Initializers

  public void declareFunctions() {
    declare_kbq_query_run_file();
  }

  public void initializeVariables() {
    init_kbq_query_run_file();
  }

  public void runTopLevelForms() {
    setup_kbq_query_run_file();
  }

}
