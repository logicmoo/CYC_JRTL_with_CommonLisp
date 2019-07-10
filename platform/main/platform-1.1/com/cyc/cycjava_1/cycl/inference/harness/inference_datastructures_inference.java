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

package com.cyc.cycjava_1.cycl.inference.harness;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.*;
import java.util.Map.*;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.*;
//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.accumulation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.argumentation;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_czer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_forward_propagate;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_metrics;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.inference_pad_data;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_parameters;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.keyhash_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.leviathan;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;

public  final class inference_datastructures_inference extends SubLTranslatedFile {

  //// Constructor

  private inference_datastructures_inference() {}
  public static final SubLFile me = new inference_datastructures_inference();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 1234)
  private static SubLSymbol $inference_types$ = null;

  public static final class $inference_native extends SubLStructNative {
    @Override
    public SubLStructDecl getStructDecl() { return structDecl; }
    @Override
    public SubLObject getField2() { return $suid; }
    @Override
    public SubLObject getField3() { return $problem_store; }
    @Override
    public SubLObject getField4() { return $forward_propagate; }
    @Override
    public SubLObject getField5() { return $input_mt; }
    @Override
    public SubLObject getField6() { return $input_el_query; }
    @Override
    public SubLObject getField7() { return $input_non_explanatory_el_query; }
    @Override
    public SubLObject getField8() { return $input_query_properties; }
    @Override
    public SubLObject getField9() { return $mt; }
    @Override
    public SubLObject getField10() { return $el_query; }
    @Override
    public SubLObject getField11() { return $el_bindings; }
    @Override
    public SubLObject getField12() { return $hl_query; }
    @Override
    public SubLObject getField13() { return $explanatory_subquery; }
    @Override
    public SubLObject getField14() { return $non_explanatory_subquery; }
    @Override
    public SubLObject getField15() { return $free_hl_vars; }
    @Override
    public SubLObject getField16() { return $hypothetical_bindings; }
    @Override
    public SubLObject getField17() { return $answer_id_index; }
    @Override
    public SubLObject getField18() { return $answer_bindings_index; }
    @Override
    public SubLObject getField19() { return $new_answer_id_start; }
    @Override
    public SubLObject getField20() { return $new_answer_justifications; }
    public SubLObject getField21() { return $status; }
    public SubLObject getField22() { return $suspend_status; }
    public SubLObject getField23() { return $root_link; }
    public SubLObject getField24() { return $relevant_problems; }
    public SubLObject getField25() { return $strategy_set; }
    public SubLObject getField26() { return $control_process; }
    public SubLObject getField27() { return $interrupting_processes; }
    public SubLObject getField28() { return $max_transformation_depth_reached; }
    public SubLObject getField29() { return $disjunction_free_el_vars_policy; }
    public SubLObject getField30() { return $result_uniqueness_criterion; }
    public SubLObject getField31() { return $allow_hl_predicate_transformationP; }
    public SubLObject getField32() { return $allow_unbound_predicate_transformationP; }
    public SubLObject getField33() { return $allow_evaluatable_predicate_transformationP; }
    public SubLObject getField34() { return $allow_indeterminate_resultsP; }
    public SubLObject getField35() { return $allowed_rules; }
    public SubLObject getField36() { return $forbidden_rules; }
    public SubLObject getField37() { return $allowed_modules; }
    public SubLObject getField38() { return $allow_abnormality_checkingP; }
    public SubLObject getField39() { return $transitive_closure_mode; }
    public SubLObject getField40() { return $problem_store_privateP; }
    public SubLObject getField41() { return $continuableP; }
    public SubLObject getField42() { return $browsableP; }
    public SubLObject getField43() { return $return_type; }
    public SubLObject getField44() { return $answer_language; }
    public SubLObject getField45() { return $cache_resultsP; }
    public SubLObject getField46() { return $blockingP; }
    public SubLObject getField47() { return $max_number; }
    public SubLObject getField48() { return $max_time; }
    public SubLObject getField49() { return $max_step; }
    public SubLObject getField50() { return $mode; }
    public SubLObject getField51() { return $forward_max_time; }
    public SubLObject getField52() { return $max_proof_depth; }
    public SubLObject getField53() { return $max_transformation_depth; }
    public SubLObject getField54() { return $probably_approximately_done; }
    public SubLObject getField55() { return $metrics_template; }
    public SubLObject getField56() { return $start_universal_time; }
    public SubLObject getField57() { return $start_internal_real_time; }
    public SubLObject getField58() { return $end_internal_real_time; }
    public SubLObject getField59() { return $pad_internal_real_time; }
    public SubLObject getField60() { return $cumulative_time; }
    public SubLObject getField61() { return $step_count; }
    public SubLObject getField62() { return $cumulative_step_count; }
    public SubLObject getField63() { return $events; }
    public SubLObject getField64() { return $halt_conditions; }
    public SubLObject getField65() { return $accumulators; }
    public SubLObject getField66() { return $proof_watermark; }
    public SubLObject getField67() { return $problem_working_time_data; }
    public SubLObject getField68() { return $type; }
    public SubLObject getField69() { return $data; }
    @Override
    public SubLObject setField2(SubLObject value) { return $suid = value; }
    @Override
    public SubLObject setField3(SubLObject value) { return $problem_store = value; }
    @Override
    public SubLObject setField4(SubLObject value) { return $forward_propagate = value; }
    @Override
    public SubLObject setField5(SubLObject value) { return $input_mt = value; }
    @Override
    public SubLObject setField6(SubLObject value) { return $input_el_query = value; }
    @Override
    public SubLObject setField7(SubLObject value) { return $input_non_explanatory_el_query = value; }
    @Override
    public SubLObject setField8(SubLObject value) { return $input_query_properties = value; }
    @Override
    public SubLObject setField9(SubLObject value) { return $mt = value; }
    @Override
    public SubLObject setField10(SubLObject value) { return $el_query = value; }
    @Override
    public SubLObject setField11(SubLObject value) { return $el_bindings = value; }
    @Override
    public SubLObject setField12(SubLObject value) { return $hl_query = value; }
    @Override
    public SubLObject setField13(SubLObject value) { return $explanatory_subquery = value; }
    @Override
    public SubLObject setField14(SubLObject value) { return $non_explanatory_subquery = value; }
    @Override
    public SubLObject setField15(SubLObject value) { return $free_hl_vars = value; }
    @Override
    public SubLObject setField16(SubLObject value) { return $hypothetical_bindings = value; }
    @Override
    public SubLObject setField17(SubLObject value) { return $answer_id_index = value; }
    @Override
    public SubLObject setField18(SubLObject value) { return $answer_bindings_index = value; }
    @Override
    public SubLObject setField19(SubLObject value) { return $new_answer_id_start = value; }
    @Override
    public SubLObject setField20(SubLObject value) { return $new_answer_justifications = value; }
    public SubLObject setField21(SubLObject value) { return $status = value; }
    public SubLObject setField22(SubLObject value) { return $suspend_status = value; }
    public SubLObject setField23(SubLObject value) { return $root_link = value; }
    public SubLObject setField24(SubLObject value) { return $relevant_problems = value; }
    public SubLObject setField25(SubLObject value) { return $strategy_set = value; }
    public SubLObject setField26(SubLObject value) { return $control_process = value; }
    public SubLObject setField27(SubLObject value) { return $interrupting_processes = value; }
    public SubLObject setField28(SubLObject value) { return $max_transformation_depth_reached = value; }
    public SubLObject setField29(SubLObject value) { return $disjunction_free_el_vars_policy = value; }
    public SubLObject setField30(SubLObject value) { return $result_uniqueness_criterion = value; }
    public SubLObject setField31(SubLObject value) { return $allow_hl_predicate_transformationP = value; }
    public SubLObject setField32(SubLObject value) { return $allow_unbound_predicate_transformationP = value; }
    public SubLObject setField33(SubLObject value) { return $allow_evaluatable_predicate_transformationP = value; }
    public SubLObject setField34(SubLObject value) { return $allow_indeterminate_resultsP = value; }
    public SubLObject setField35(SubLObject value) { return $allowed_rules = value; }
    public SubLObject setField36(SubLObject value) { return $forbidden_rules = value; }
    public SubLObject setField37(SubLObject value) { return $allowed_modules = value; }
    public SubLObject setField38(SubLObject value) { return $allow_abnormality_checkingP = value; }
    public SubLObject setField39(SubLObject value) { return $transitive_closure_mode = value; }
    public SubLObject setField40(SubLObject value) { return $problem_store_privateP = value; }
    public SubLObject setField41(SubLObject value) { return $continuableP = value; }
    public SubLObject setField42(SubLObject value) { return $browsableP = value; }
    public SubLObject setField43(SubLObject value) { return $return_type = value; }
    public SubLObject setField44(SubLObject value) { return $answer_language = value; }
    public SubLObject setField45(SubLObject value) { return $cache_resultsP = value; }
    public SubLObject setField46(SubLObject value) { return $blockingP = value; }
    public SubLObject setField47(SubLObject value) { return $max_number = value; }
    public SubLObject setField48(SubLObject value) { return $max_time = value; }
    public SubLObject setField49(SubLObject value) { return $max_step = value; }
    public SubLObject setField50(SubLObject value) { return $mode = value; }
    public SubLObject setField51(SubLObject value) { return $forward_max_time = value; }
    public SubLObject setField52(SubLObject value) { return $max_proof_depth = value; }
    public SubLObject setField53(SubLObject value) { return $max_transformation_depth = value; }
    public SubLObject setField54(SubLObject value) { return $probably_approximately_done = value; }
    public SubLObject setField55(SubLObject value) { return $metrics_template = value; }
    public SubLObject setField56(SubLObject value) { return $start_universal_time = value; }
    public SubLObject setField57(SubLObject value) { return $start_internal_real_time = value; }
    public SubLObject setField58(SubLObject value) { return $end_internal_real_time = value; }
    public SubLObject setField59(SubLObject value) { return $pad_internal_real_time = value; }
    public SubLObject setField60(SubLObject value) { return $cumulative_time = value; }
    public SubLObject setField61(SubLObject value) { return $step_count = value; }
    public SubLObject setField62(SubLObject value) { return $cumulative_step_count = value; }
    public SubLObject setField63(SubLObject value) { return $events = value; }
    public SubLObject setField64(SubLObject value) { return $halt_conditions = value; }
    public SubLObject setField65(SubLObject value) { return $accumulators = value; }
    public SubLObject setField66(SubLObject value) { return $proof_watermark = value; }
    public SubLObject setField67(SubLObject value) { return $problem_working_time_data = value; }
    public SubLObject setField68(SubLObject value) { return $type = value; }
    public SubLObject setField69(SubLObject value) { return $data = value; }
    public SubLObject $suid = NIL;
    public SubLObject $problem_store = NIL;
    public SubLObject $forward_propagate = NIL;
    public SubLObject $input_mt = NIL;
    public SubLObject $input_el_query = NIL;
    public SubLObject $input_non_explanatory_el_query = NIL;
    public SubLObject $input_query_properties = NIL;
    public SubLObject $mt = NIL;
    public SubLObject $el_query = NIL;
    public SubLObject $el_bindings = NIL;
    public SubLObject $hl_query = NIL;
    public SubLObject $explanatory_subquery = NIL;
    public SubLObject $non_explanatory_subquery = NIL;
    public SubLObject $free_hl_vars = NIL;
    public SubLObject $hypothetical_bindings = NIL;
    public SubLObject $answer_id_index = NIL;
    public SubLObject $answer_bindings_index = NIL;
    public SubLObject $new_answer_id_start = NIL;
    public SubLObject $new_answer_justifications = NIL;
    public SubLObject $status = NIL;
    public SubLObject $suspend_status = NIL;
    public SubLObject $root_link = NIL;
    public SubLObject $relevant_problems = NIL;
    public SubLObject $strategy_set = NIL;
    public SubLObject $control_process = NIL;
    public SubLObject $interrupting_processes = NIL;
    public SubLObject $max_transformation_depth_reached = NIL;
    public SubLObject $disjunction_free_el_vars_policy = NIL;
    public SubLObject $result_uniqueness_criterion = NIL;
    public SubLObject $allow_hl_predicate_transformationP = NIL;
    public SubLObject $allow_unbound_predicate_transformationP = NIL;
    public SubLObject $allow_evaluatable_predicate_transformationP = NIL;
    public SubLObject $allow_indeterminate_resultsP = NIL;
    public SubLObject $allowed_rules = NIL;
    public SubLObject $forbidden_rules = NIL;
    public SubLObject $allowed_modules = NIL;
    public SubLObject $allow_abnormality_checkingP = NIL;
    public SubLObject $transitive_closure_mode = NIL;
    public SubLObject $problem_store_privateP = NIL;
    public SubLObject $continuableP = NIL;
    public SubLObject $browsableP = NIL;
    public SubLObject $return_type = NIL;
    public SubLObject $answer_language = NIL;
    public SubLObject $cache_resultsP = NIL;
    public SubLObject $blockingP = NIL;
    public SubLObject $max_number = NIL;
    public SubLObject $max_time = NIL;
    public SubLObject $max_step = NIL;
    public SubLObject $mode = NIL;
    public SubLObject $forward_max_time = NIL;
    public SubLObject $max_proof_depth = NIL;
    public SubLObject $max_transformation_depth = NIL;
    public SubLObject $probably_approximately_done = NIL;
    public SubLObject $metrics_template = NIL;
    public SubLObject $start_universal_time = NIL;
    public SubLObject $start_internal_real_time = NIL;
    public SubLObject $end_internal_real_time = NIL;
    public SubLObject $pad_internal_real_time = NIL;
    public SubLObject $cumulative_time = NIL;
    public SubLObject $step_count = NIL;
    public SubLObject $cumulative_step_count = NIL;
    public SubLObject $events = NIL;
    public SubLObject $halt_conditions = NIL;
    public SubLObject $accumulators = NIL;
    public SubLObject $proof_watermark = NIL;
    public SubLObject $problem_working_time_data = NIL;
    public SubLObject $type = NIL;
    public SubLObject $data = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($inference_native.class, $sym1$INFERENCE, $sym2$INFERENCE_P, $list3, $list4, new String[] {"$suid", "$problem_store", "$forward_propagate", "$input_mt", "$input_el_query", "$input_non_explanatory_el_query", "$input_query_properties", "$mt", "$el_query", "$el_bindings", "$hl_query", "$explanatory_subquery", "$non_explanatory_subquery", "$free_hl_vars", "$hypothetical_bindings", "$answer_id_index", "$answer_bindings_index", "$new_answer_id_start", "$new_answer_justifications", "$status", "$suspend_status", "$root_link", "$relevant_problems", "$strategy_set", "$control_process", "$interrupting_processes", "$max_transformation_depth_reached", "$disjunction_free_el_vars_policy", "$result_uniqueness_criterion", "$allow_hl_predicate_transformationP", "$allow_unbound_predicate_transformationP", "$allow_evaluatable_predicate_transformationP", "$allow_indeterminate_resultsP", "$allowed_rules", "$forbidden_rules", "$allowed_modules", "$allow_abnormality_checkingP", "$transitive_closure_mode", "$problem_store_privateP", "$continuableP", "$browsableP", "$return_type", "$answer_language", "$cache_resultsP", "$blockingP", "$max_number", "$max_time", "$max_step", "$mode", "$forward_max_time", "$max_proof_depth", "$max_transformation_depth", "$probably_approximately_done", "$metrics_template", "$start_universal_time", "$start_internal_real_time", "$end_internal_real_time", "$pad_internal_real_time", "$cumulative_time", "$step_count", "$cumulative_step_count", "$events", "$halt_conditions", "$accumulators", "$proof_watermark", "$problem_working_time_data", "$type", "$data"}, $list5, $list6, $sym7$PRINT_INFERENCE);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static SubLSymbol $dtp_inference$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject inference_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35787");
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject inference_p(SubLObject object) {
    return ((object.getClass() == $inference_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $inference_p$UnaryFunction extends UnaryFunction {
    public $inference_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return inference_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_suid(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_problem_store(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_forward_propagate(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_input_mt(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_input_el_query(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField6();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_input_non_explanatory_el_query(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField7();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_input_query_properties(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField8();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_mt(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField9();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_el_bindings(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField11();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_hl_query(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField12();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_explanatory_subquery(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField13();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_free_hl_vars(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField15();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_answer_id_index(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField17();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_answer_bindings_index(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField18();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_new_answer_id_start(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField19();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_new_answer_justifications(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return object.getField20();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_status(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$status;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_suspend_status(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$suspend_status;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_root_link(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$root_link;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_relevant_problems(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$relevant_problems;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_strategy_set(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$strategy_set;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_interrupting_processes(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$interrupting_processes;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_max_transformation_depth_reached(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_transformation_depth_reached;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_disjunction_free_el_vars_policy(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$disjunction_free_el_vars_policy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_result_uniqueness_criterion(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$result_uniqueness_criterion;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_allow_hl_predicate_transformationP(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allow_hl_predicate_transformationP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_allow_unbound_predicate_transformationP(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allow_unbound_predicate_transformationP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_allow_evaluatable_predicate_transformationP(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allow_evaluatable_predicate_transformationP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_allow_indeterminate_resultsP(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allow_indeterminate_resultsP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_allowed_rules(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allowed_rules;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_forbidden_rules(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$forbidden_rules;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_allowed_modules(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allowed_modules;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_allow_abnormality_checkingP(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allow_abnormality_checkingP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_transitive_closure_mode(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$transitive_closure_mode;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_problem_store_privateP(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$problem_store_privateP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_continuableP(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$continuableP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_browsableP(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$browsableP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_return_type(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$return_type;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_answer_language(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$answer_language;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_cache_resultsP(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$cache_resultsP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_blockingP(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$blockingP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_max_number(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_number;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_max_time(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_time;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_max_step(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_step;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_forward_max_time(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$forward_max_time;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_max_proof_depth(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_proof_depth;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_max_transformation_depth(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_transformation_depth;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_probably_approximately_done(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$probably_approximately_done;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_metrics_template(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$metrics_template;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_start_internal_real_time(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$start_internal_real_time;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_end_internal_real_time(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$end_internal_real_time;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_pad_internal_real_time(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$pad_internal_real_time;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_cumulative_time(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$cumulative_time;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_step_count(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$step_count;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_cumulative_step_count(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$cumulative_step_count;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_halt_conditions(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$halt_conditions;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_problem_working_time_data(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$problem_working_time_data;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_type(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$type;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject infrnc_data(SubLObject object) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$data;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_suid(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_problem_store(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_forward_propagate(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_input_mt(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_input_el_query(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_input_non_explanatory_el_query(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_input_query_properties(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_mt(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_el_query(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField10(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_el_bindings(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField11(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_hl_query(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField12(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_explanatory_subquery(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField13(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_non_explanatory_subquery(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField14(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_free_hl_vars(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField15(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_hypothetical_bindings(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField16(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_answer_id_index(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField17(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_answer_bindings_index(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField18(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_new_answer_id_start(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField19(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_new_answer_justifications(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return object.setField20(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_status(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$status = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_suspend_status(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$suspend_status = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_root_link(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$root_link = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_relevant_problems(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$relevant_problems = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_strategy_set(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$strategy_set = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_control_process(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$control_process = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_interrupting_processes(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$interrupting_processes = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_max_transformation_depth_reached(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_transformation_depth_reached = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_disjunction_free_el_vars_policy(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$disjunction_free_el_vars_policy = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_result_uniqueness_criterion(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$result_uniqueness_criterion = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_allow_hl_predicate_transformationP(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allow_hl_predicate_transformationP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_allow_unbound_predicate_transformationP(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allow_unbound_predicate_transformationP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_allow_evaluatable_predicate_transformationP(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allow_evaluatable_predicate_transformationP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_allow_indeterminate_resultsP(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allow_indeterminate_resultsP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_allowed_rules(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allowed_rules = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_forbidden_rules(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$forbidden_rules = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_allowed_modules(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allowed_modules = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_allow_abnormality_checkingP(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$allow_abnormality_checkingP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_transitive_closure_mode(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$transitive_closure_mode = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_problem_store_privateP(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$problem_store_privateP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_continuableP(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$continuableP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_browsableP(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$browsableP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_return_type(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$return_type = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_answer_language(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$answer_language = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_cache_resultsP(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$cache_resultsP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_blockingP(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$blockingP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_max_number(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_number = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_max_time(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_time = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_max_step(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_step = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_mode(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$mode = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_forward_max_time(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$forward_max_time = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_max_proof_depth(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_proof_depth = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_max_transformation_depth(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$max_transformation_depth = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_probably_approximately_done(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$probably_approximately_done = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_metrics_template(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$metrics_template = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_start_universal_time(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$start_universal_time = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_start_internal_real_time(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$start_internal_real_time = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_end_internal_real_time(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$end_internal_real_time = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_pad_internal_real_time(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$pad_internal_real_time = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_cumulative_time(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$cumulative_time = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_step_count(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$step_count = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_cumulative_step_count(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$cumulative_step_count = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_events(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$events = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_halt_conditions(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$halt_conditions = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_accumulators(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$accumulators = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_proof_watermark(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$proof_watermark = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_problem_working_time_data(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$problem_working_time_data = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_type(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$type = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject _csetf_infrnc_data(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_P);
    return (($inference_native) object).$data = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 3460)
  public static final SubLObject make_inference(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $inference_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw194$SUID)) {
            _csetf_infrnc_suid(v_new, current_value);
          } else if (pcase_var.eql($kw195$PROBLEM_STORE)) {
            _csetf_infrnc_problem_store(v_new, current_value);
          } else if (pcase_var.eql($kw196$FORWARD_PROPAGATE)) {
            _csetf_infrnc_forward_propagate(v_new, current_value);
          } else if (pcase_var.eql($kw197$INPUT_MT)) {
            _csetf_infrnc_input_mt(v_new, current_value);
          } else if (pcase_var.eql($kw198$INPUT_EL_QUERY)) {
            _csetf_infrnc_input_el_query(v_new, current_value);
          } else if (pcase_var.eql($kw199$INPUT_NON_EXPLANATORY_EL_QUERY)) {
            _csetf_infrnc_input_non_explanatory_el_query(v_new, current_value);
          } else if (pcase_var.eql($kw200$INPUT_QUERY_PROPERTIES)) {
            _csetf_infrnc_input_query_properties(v_new, current_value);
          } else if (pcase_var.eql($kw201$MT)) {
            _csetf_infrnc_mt(v_new, current_value);
          } else if (pcase_var.eql($kw202$EL_QUERY)) {
            _csetf_infrnc_el_query(v_new, current_value);
          } else if (pcase_var.eql($kw203$EL_BINDINGS)) {
            _csetf_infrnc_el_bindings(v_new, current_value);
          } else if (pcase_var.eql($kw204$HL_QUERY)) {
            _csetf_infrnc_hl_query(v_new, current_value);
          } else if (pcase_var.eql($kw205$EXPLANATORY_SUBQUERY)) {
            _csetf_infrnc_explanatory_subquery(v_new, current_value);
          } else if (pcase_var.eql($kw206$NON_EXPLANATORY_SUBQUERY)) {
            _csetf_infrnc_non_explanatory_subquery(v_new, current_value);
          } else if (pcase_var.eql($kw207$FREE_HL_VARS)) {
            _csetf_infrnc_free_hl_vars(v_new, current_value);
          } else if (pcase_var.eql($kw208$HYPOTHETICAL_BINDINGS)) {
            _csetf_infrnc_hypothetical_bindings(v_new, current_value);
          } else if (pcase_var.eql($kw209$ANSWER_ID_INDEX)) {
            _csetf_infrnc_answer_id_index(v_new, current_value);
          } else if (pcase_var.eql($kw210$ANSWER_BINDINGS_INDEX)) {
            _csetf_infrnc_answer_bindings_index(v_new, current_value);
          } else if (pcase_var.eql($kw211$NEW_ANSWER_ID_START)) {
            _csetf_infrnc_new_answer_id_start(v_new, current_value);
          } else if (pcase_var.eql($kw212$NEW_ANSWER_JUSTIFICATIONS)) {
            _csetf_infrnc_new_answer_justifications(v_new, current_value);
          } else if (pcase_var.eql($kw213$STATUS)) {
            _csetf_infrnc_status(v_new, current_value);
          } else if (pcase_var.eql($kw214$SUSPEND_STATUS)) {
            _csetf_infrnc_suspend_status(v_new, current_value);
          } else if (pcase_var.eql($kw215$ROOT_LINK)) {
            _csetf_infrnc_root_link(v_new, current_value);
          } else if (pcase_var.eql($kw216$RELEVANT_PROBLEMS)) {
            _csetf_infrnc_relevant_problems(v_new, current_value);
          } else if (pcase_var.eql($kw217$STRATEGY_SET)) {
            _csetf_infrnc_strategy_set(v_new, current_value);
          } else if (pcase_var.eql($kw218$CONTROL_PROCESS)) {
            _csetf_infrnc_control_process(v_new, current_value);
          } else if (pcase_var.eql($kw219$INTERRUPTING_PROCESSES)) {
            _csetf_infrnc_interrupting_processes(v_new, current_value);
          } else if (pcase_var.eql($kw220$MAX_TRANSFORMATION_DEPTH_REACHED)) {
            _csetf_infrnc_max_transformation_depth_reached(v_new, current_value);
          } else if (pcase_var.eql($kw221$DISJUNCTION_FREE_EL_VARS_POLICY)) {
            _csetf_infrnc_disjunction_free_el_vars_policy(v_new, current_value);
          } else if (pcase_var.eql($kw222$RESULT_UNIQUENESS_CRITERION)) {
            _csetf_infrnc_result_uniqueness_criterion(v_new, current_value);
          } else if (pcase_var.eql($kw223$ALLOW_HL_PREDICATE_TRANSFORMATION_)) {
            _csetf_infrnc_allow_hl_predicate_transformationP(v_new, current_value);
          } else if (pcase_var.eql($kw224$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_)) {
            _csetf_infrnc_allow_unbound_predicate_transformationP(v_new, current_value);
          } else if (pcase_var.eql($kw225$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_)) {
            _csetf_infrnc_allow_evaluatable_predicate_transformationP(v_new, current_value);
          } else if (pcase_var.eql($kw226$ALLOW_INDETERMINATE_RESULTS_)) {
            _csetf_infrnc_allow_indeterminate_resultsP(v_new, current_value);
          } else if (pcase_var.eql($kw227$ALLOWED_RULES)) {
            _csetf_infrnc_allowed_rules(v_new, current_value);
          } else if (pcase_var.eql($kw228$FORBIDDEN_RULES)) {
            _csetf_infrnc_forbidden_rules(v_new, current_value);
          } else if (pcase_var.eql($kw229$ALLOWED_MODULES)) {
            _csetf_infrnc_allowed_modules(v_new, current_value);
          } else if (pcase_var.eql($kw230$ALLOW_ABNORMALITY_CHECKING_)) {
            _csetf_infrnc_allow_abnormality_checkingP(v_new, current_value);
          } else if (pcase_var.eql($kw231$TRANSITIVE_CLOSURE_MODE)) {
            _csetf_infrnc_transitive_closure_mode(v_new, current_value);
          } else if (pcase_var.eql($kw232$PROBLEM_STORE_PRIVATE_)) {
            _csetf_infrnc_problem_store_privateP(v_new, current_value);
          } else if (pcase_var.eql($kw233$CONTINUABLE_)) {
            _csetf_infrnc_continuableP(v_new, current_value);
          } else if (pcase_var.eql($kw234$BROWSABLE_)) {
            _csetf_infrnc_browsableP(v_new, current_value);
          } else if (pcase_var.eql($kw235$RETURN_TYPE)) {
            _csetf_infrnc_return_type(v_new, current_value);
          } else if (pcase_var.eql($kw236$ANSWER_LANGUAGE)) {
            _csetf_infrnc_answer_language(v_new, current_value);
          } else if (pcase_var.eql($kw237$CACHE_RESULTS_)) {
            _csetf_infrnc_cache_resultsP(v_new, current_value);
          } else if (pcase_var.eql($kw238$BLOCKING_)) {
            _csetf_infrnc_blockingP(v_new, current_value);
          } else if (pcase_var.eql($kw239$MAX_NUMBER)) {
            _csetf_infrnc_max_number(v_new, current_value);
          } else if (pcase_var.eql($kw240$MAX_TIME)) {
            _csetf_infrnc_max_time(v_new, current_value);
          } else if (pcase_var.eql($kw241$MAX_STEP)) {
            _csetf_infrnc_max_step(v_new, current_value);
          } else if (pcase_var.eql($kw242$MODE)) {
            _csetf_infrnc_mode(v_new, current_value);
          } else if (pcase_var.eql($kw243$FORWARD_MAX_TIME)) {
            _csetf_infrnc_forward_max_time(v_new, current_value);
          } else if (pcase_var.eql($kw244$MAX_PROOF_DEPTH)) {
            _csetf_infrnc_max_proof_depth(v_new, current_value);
          } else if (pcase_var.eql($kw245$MAX_TRANSFORMATION_DEPTH)) {
            _csetf_infrnc_max_transformation_depth(v_new, current_value);
          } else if (pcase_var.eql($kw246$PROBABLY_APPROXIMATELY_DONE)) {
            _csetf_infrnc_probably_approximately_done(v_new, current_value);
          } else if (pcase_var.eql($kw247$METRICS_TEMPLATE)) {
            _csetf_infrnc_metrics_template(v_new, current_value);
          } else if (pcase_var.eql($kw248$START_UNIVERSAL_TIME)) {
            _csetf_infrnc_start_universal_time(v_new, current_value);
          } else if (pcase_var.eql($kw249$START_INTERNAL_REAL_TIME)) {
            _csetf_infrnc_start_internal_real_time(v_new, current_value);
          } else if (pcase_var.eql($kw250$END_INTERNAL_REAL_TIME)) {
            _csetf_infrnc_end_internal_real_time(v_new, current_value);
          } else if (pcase_var.eql($kw251$PAD_INTERNAL_REAL_TIME)) {
            _csetf_infrnc_pad_internal_real_time(v_new, current_value);
          } else if (pcase_var.eql($kw252$CUMULATIVE_TIME)) {
            _csetf_infrnc_cumulative_time(v_new, current_value);
          } else if (pcase_var.eql($kw253$STEP_COUNT)) {
            _csetf_infrnc_step_count(v_new, current_value);
          } else if (pcase_var.eql($kw254$CUMULATIVE_STEP_COUNT)) {
            _csetf_infrnc_cumulative_step_count(v_new, current_value);
          } else if (pcase_var.eql($kw255$EVENTS)) {
            _csetf_infrnc_events(v_new, current_value);
          } else if (pcase_var.eql($kw256$HALT_CONDITIONS)) {
            _csetf_infrnc_halt_conditions(v_new, current_value);
          } else if (pcase_var.eql($kw257$ACCUMULATORS)) {
            _csetf_infrnc_accumulators(v_new, current_value);
          } else if (pcase_var.eql($kw258$PROOF_WATERMARK)) {
            _csetf_infrnc_proof_watermark(v_new, current_value);
          } else if (pcase_var.eql($kw259$PROBLEM_WORKING_TIME_DATA)) {
            _csetf_infrnc_problem_working_time_data(v_new, current_value);
          } else if (pcase_var.eql($kw260$TYPE)) {
            _csetf_infrnc_type(v_new, current_value);
          } else if (pcase_var.eql($kw261$DATA)) {
            _csetf_infrnc_data(v_new, current_value);
          } else {
            Errors.error($str262$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 14623)
  public static final SubLObject valid_inference_p(SubLObject object) {
    return makeBoolean(((NIL != inference_p(object))
           && (NIL == inference_invalid_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 14868)
  public static final SubLObject inference_invalid_p(SubLObject inference) {
    return Equality.eq($kw263$DEAD, inference_status(inference));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15466)
  public static final SubLObject sxhash_inference_method(SubLObject object) {
    return infrnc_suid(object);
  }

  public static final class $sxhash_inference_method$UnaryFunction extends UnaryFunction {
    public $sxhash_inference_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-INFERENCE-METHOD")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return sxhash_inference_method(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15540)
  public static final SubLObject new_inference_p(SubLObject object) {
    return makeBoolean(((NIL != inference_p(object))
           && ($kw267$NEW == inference_status(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15684)
  public static final SubLObject prepared_inference_p(SubLObject object) {
    return makeBoolean(((NIL != inference_p(object))
           && ($kw268$PREPARED == inference_status(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 15944)
  public static final SubLObject running_inference_p(SubLObject object) {
    return makeBoolean(((NIL != inference_p(object))
           && ($kw270$RUNNING == inference_status(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 16210)
  public static final SubLObject continuable_inference_p(SubLObject object) {
    if ((NIL != inference_p(object))) {
      {
        SubLObject status = inference_status(object);
        if ((NIL != inference_datastructures_enumerated_types.continuable_inference_status_p(status))) {
          if (($kw271$SUSPENDED == status)) {
            if ((NIL != inference_continuableP(object))) {
              {
                SubLObject suspend_status = inference_suspend_status(object);
                return Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36495");
              }
            }
          } else {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  /** Allocates a new inference object and sets up its internal datastructures. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 19695)
  public static final SubLObject new_inference(SubLObject store) {
    checkType(store, $sym324$PROBLEM_STORE_P);
    {
      SubLObject inf = make_inference(UNPROVIDED);
      SubLObject suid = inference_datastructures_problem_store.problem_store_new_inference_id(store);
      inference_metrics.increment_inference_historical_count();
      _csetf_infrnc_suid(inf, suid);
      _csetf_infrnc_problem_store(inf, store);
      _csetf_infrnc_forward_propagate(inf, NIL);
      _csetf_infrnc_hypothetical_bindings(inf, NIL);
      _csetf_infrnc_answer_id_index(inf, id_index.new_id_index(TEN_INTEGER, ZERO_INTEGER));
      _csetf_infrnc_answer_bindings_index(inf, dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED));
      _csetf_infrnc_new_answer_justifications(inf, queues.create_queue());
      reset_inference_new_answers(inf);
      set_inference_status(inf, $kw267$NEW);
      _csetf_infrnc_relevant_problems(inf, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_infrnc_strategy_set(inf, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      clear_inference_control_process(inf);
      _csetf_infrnc_interrupting_processes(inf, queues.create_queue());
      _csetf_infrnc_max_transformation_depth_reached(inf, ZERO_INTEGER);
      set_inference_answer_language(inf, inference_datastructures_enumerated_types.$inference_default_answer_language$.getGlobalValue());
      set_inference_disjunction_free_el_vars_policy(inf, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
      set_inference_cache_results(inf, NIL);
      set_inference_continuable(inf, inference_datastructures_enumerated_types.$inference_default_continuableP$.getGlobalValue());
      set_inference_browsable(inf, inference_datastructures_enumerated_types.$inference_default_browsableP$.getGlobalValue());
      set_inference_max_number(inf, inference_datastructures_enumerated_types.$default_max_number$.getGlobalValue());
      set_inference_max_time(inf, inference_datastructures_enumerated_types.$default_max_time$.getGlobalValue());
      set_inference_max_step(inf, inference_datastructures_enumerated_types.$default_max_step$.getGlobalValue());
      set_inference_mode(inf, inference_datastructures_enumerated_types.$default_inference_mode$.getGlobalValue());
      set_inference_forward_max_time(inf, inference_datastructures_enumerated_types.$default_forward_max_time$.getGlobalValue());
      set_inference_cumulative_time(inf, ZERO_INTEGER);
      set_inference_step_count(inf, ZERO_INTEGER);
      set_inference_cumulative_step_count(inf, ZERO_INTEGER);
      set_inference_max_proof_depth(inf, inference_datastructures_enumerated_types.$default_max_proof_depth$.getGlobalValue());
      set_inference_max_transformation_depth(inf, inference_datastructures_enumerated_types.$default_max_transformation_depth$.getGlobalValue());
      set_inference_probably_approximately_done(inf, inference_datastructures_enumerated_types.$default_probably_approximately_done$.getGlobalValue());
      set_inference_metrics_template(inf, inference_datastructures_enumerated_types.$default_inference_metrics_template$.getGlobalValue());
      _csetf_infrnc_accumulators(inf, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_infrnc_proof_watermark(inf, ZERO_INTEGER);
      clear_inference_blocking(inf);
      inference_datastructures_problem_store.add_problem_store_inference(store, inf);
      return inf;
    }
  }

  /** Disposes of the INFERENCE datastructure.  This gets
rid of all pointers to its referenced substructures so
that the GC can collect them all. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 23337)
  public static final SubLObject destroy_inference(SubLObject inference) {
    if ((NIL != valid_inference_p(inference))) {
      try {
        inference_strategist.inference_abort_if_running(inference);
      } finally {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
          try {
            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
            note_inference_invalid(inference);
            {
              SubLObject inference_var = inference;
              SubLObject set_contents_var = set.do_set_internal(inference_strategy_set(inference_var));
              SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
              SubLObject state = NIL;
              for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                {
                  SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                  if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                    inference_datastructures_strategy.destroy_inference_strategy(strategy);
                  }
                }
              }
            }
            {
              SubLObject root_link = inference_root_link(inference);
              inference_datastructures_problem_link.destroy_problem_link(root_link);
            }
            {
              SubLObject store = inference_problem_store(inference);
              inference_datastructures_problem_store.remove_problem_store_inference(store, inference);
            }
            destroy_inference_int(inference);
          } finally {
            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 24608)
  public static final SubLObject destroy_problem_store_inference(SubLObject inference) {
    if ((NIL != valid_inference_p(inference))) {
      inference_strategist.inference_abort_if_running(inference);
      note_inference_invalid(inference);
      return destroy_inference_int(inference);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 24871)
  public static final SubLObject destroy_inference_int(SubLObject inf) {
    inference_datastructures_forward_propagate.destroy_forward_propagate(infrnc_forward_propagate(inf));
    _csetf_infrnc_problem_store(inf, $kw328$FREE);
    _csetf_infrnc_forward_propagate(inf, $kw328$FREE);
    _csetf_infrnc_input_mt(inf, $kw328$FREE);
    _csetf_infrnc_input_el_query(inf, $kw328$FREE);
    _csetf_infrnc_input_non_explanatory_el_query(inf, $kw328$FREE);
    _csetf_infrnc_input_query_properties(inf, $kw328$FREE);
    _csetf_infrnc_mt(inf, $kw328$FREE);
    _csetf_infrnc_el_query(inf, $kw328$FREE);
    _csetf_infrnc_el_bindings(inf, $kw328$FREE);
    _csetf_infrnc_hl_query(inf, $kw328$FREE);
    _csetf_infrnc_explanatory_subquery(inf, $kw328$FREE);
    _csetf_infrnc_non_explanatory_subquery(inf, $kw328$FREE);
    _csetf_infrnc_free_hl_vars(inf, $kw328$FREE);
    _csetf_infrnc_hypothetical_bindings(inf, $kw328$FREE);
    id_index.clear_id_index(infrnc_answer_id_index(inf));
    _csetf_infrnc_answer_id_index(inf, $kw328$FREE);
    dictionary.clear_dictionary(infrnc_answer_bindings_index(inf));
    _csetf_infrnc_answer_bindings_index(inf, $kw328$FREE);
    _csetf_infrnc_new_answer_id_start(inf, $kw328$FREE);
    queues.clear_queue(infrnc_new_answer_justifications(inf));
    _csetf_infrnc_new_answer_justifications(inf, $kw328$FREE);
    _csetf_infrnc_suspend_status(inf, $kw328$FREE);
    _csetf_infrnc_root_link(inf, $kw328$FREE);
    clear_inference_relevant_problems(inf);
    _csetf_infrnc_relevant_problems(inf, $kw328$FREE);
    clear_inference_strategy_set(inf);
    _csetf_infrnc_strategy_set(inf, $kw328$FREE);
    clear_inference_control_process(inf);
    _csetf_infrnc_control_process(inf, $kw328$FREE);
    queues.clear_queue(infrnc_interrupting_processes(inf));
    _csetf_infrnc_interrupting_processes(inf, $kw328$FREE);
    _csetf_infrnc_max_transformation_depth_reached(inf, $kw328$FREE);
    clear_inference_blocking(inf);
    _csetf_infrnc_blockingP(inf, $kw328$FREE);
    _csetf_infrnc_disjunction_free_el_vars_policy(inf, $kw328$FREE);
    _csetf_infrnc_result_uniqueness_criterion(inf, $kw328$FREE);
    _csetf_infrnc_allow_hl_predicate_transformationP(inf, $kw328$FREE);
    _csetf_infrnc_allow_unbound_predicate_transformationP(inf, $kw328$FREE);
    _csetf_infrnc_allow_evaluatable_predicate_transformationP(inf, $kw328$FREE);
    _csetf_infrnc_allow_indeterminate_resultsP(inf, $kw328$FREE);
    _csetf_infrnc_allowed_rules(inf, $kw328$FREE);
    _csetf_infrnc_forbidden_rules(inf, $kw328$FREE);
    _csetf_infrnc_allowed_modules(inf, $kw328$FREE);
    _csetf_infrnc_allow_abnormality_checkingP(inf, $kw328$FREE);
    _csetf_infrnc_transitive_closure_mode(inf, $kw328$FREE);
    _csetf_infrnc_problem_store_privateP(inf, $kw328$FREE);
    _csetf_infrnc_continuableP(inf, $kw328$FREE);
    _csetf_infrnc_browsableP(inf, $kw328$FREE);
    _csetf_infrnc_return_type(inf, $kw328$FREE);
    _csetf_infrnc_answer_language(inf, $kw328$FREE);
    _csetf_infrnc_cache_resultsP(inf, $kw328$FREE);
    _csetf_infrnc_max_number(inf, $kw328$FREE);
    _csetf_infrnc_max_time(inf, $kw328$FREE);
    _csetf_infrnc_max_step(inf, $kw328$FREE);
    _csetf_infrnc_mode(inf, $kw328$FREE);
    _csetf_infrnc_forward_max_time(inf, $kw328$FREE);
    _csetf_infrnc_max_proof_depth(inf, $kw328$FREE);
    _csetf_infrnc_max_transformation_depth(inf, $kw328$FREE);
    _csetf_infrnc_probably_approximately_done(inf, $kw328$FREE);
    _csetf_infrnc_metrics_template(inf, $kw328$FREE);
    _csetf_infrnc_start_universal_time(inf, $kw328$FREE);
    _csetf_infrnc_start_internal_real_time(inf, $kw328$FREE);
    _csetf_infrnc_end_internal_real_time(inf, $kw328$FREE);
    _csetf_infrnc_pad_internal_real_time(inf, $kw328$FREE);
    _csetf_infrnc_cumulative_time(inf, $kw328$FREE);
    _csetf_infrnc_step_count(inf, $kw328$FREE);
    _csetf_infrnc_cumulative_step_count(inf, $kw328$FREE);
    _csetf_infrnc_events(inf, $kw328$FREE);
    _csetf_infrnc_halt_conditions(inf, $kw328$FREE);
    _csetf_infrnc_accumulators(inf, $kw328$FREE);
    _csetf_infrnc_proof_watermark(inf, $kw328$FREE);
    {
      SubLObject lock = inference_problem_working_time_lock(inf);
      if ((!(lock.isLock()))) {
        lock = NIL;
      }
      if ((NIL != lock)) {
        {
          SubLObject lock_4 = lock;
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock_4);
            _csetf_infrnc_problem_working_time_data(inf, $kw328$FREE);
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock_4);
            }
          }
        }
      } else {
        _csetf_infrnc_problem_working_time_data(inf, $kw328$FREE);
      }
    }
    _csetf_infrnc_type(inf, $kw328$FREE);
    _csetf_infrnc_data(inf, $kw328$FREE);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 29509)
  public static final SubLObject note_inference_invalid(SubLObject inference) {
    set_inference_status(inference, $kw263$DEAD);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 29621)
  public static final SubLObject inference_suid(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_suid(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 29749)
  public static final SubLObject inference_problem_store(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_problem_store(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30025)
  public static final SubLObject inference_input_mt(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_input_mt(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30149)
  public static final SubLObject inference_input_el_query(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_input_el_query(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30285)
  public static final SubLObject inference_input_non_explanatory_el_query(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_input_non_explanatory_el_query(inference);
  }

  /** Return query-properties-p; the input query properties for INFERENCE. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30453)
  public static final SubLObject inference_input_query_properties(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_input_query_properties(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30678)
  public static final SubLObject inference_mt(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_mt(inference);
  }

  /** Returns bindings which map HL proven query wrt INFERENCE ->
EL proven query wrt INFERENCE */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 30914)
  public static final SubLObject inference_el_bindings(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_el_bindings(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31138)
  public static final SubLObject inference_hl_query(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_hl_query(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31263)
  public static final SubLObject inference_explanatory_subquery(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_explanatory_subquery(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31567)
  public static final SubLObject inference_free_hl_vars(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_free_hl_vars(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 31850)
  public static final SubLObject inference_answer_id_index(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_answer_id_index(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32023)
  public static final SubLObject inference_answer_bindings_index(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_answer_bindings_index(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32171)
  public static final SubLObject inference_new_answer_id_start(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_new_answer_id_start(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32356)
  public static final SubLObject inference_new_answer_justifications(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_new_answer_justifications(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32567)
  public static final SubLObject inference_status(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_status(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32688)
  public static final SubLObject inference_suspend_status(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_suspend_status(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 32848)
  public static final SubLObject inference_root_link(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_root_link(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33024)
  public static final SubLObject inference_relevant_problems(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_relevant_problems(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33166)
  public static final SubLObject inference_strategy_set(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_strategy_set(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33436)
  public static final SubLObject inference_interrupting_processes(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_interrupting_processes(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33586)
  public static final SubLObject inference_max_transformation_depth_reached(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_max_transformation_depth_reached(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33756)
  public static final SubLObject inference_answer_language(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_answer_language(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 33894)
  public static final SubLObject inference_cache_resultsP(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_cache_resultsP(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34030)
  public static final SubLObject inference_blockingP(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_blockingP(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34156)
  public static final SubLObject inference_disjunction_free_el_vars_policy(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_disjunction_free_el_vars_policy(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34326)
  public static final SubLObject inference_result_uniqueness_criterion(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_result_uniqueness_criterion(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34488)
  public static final SubLObject inference_allow_hl_predicate_transformationP(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_allow_hl_predicate_transformationP(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34664)
  public static final SubLObject inference_allow_unbound_predicate_transformationP(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_allow_unbound_predicate_transformationP(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 34850)
  public static final SubLObject inference_allow_evaluatable_predicate_transformationP(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_allow_evaluatable_predicate_transformationP(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35044)
  public static final SubLObject inference_allow_indeterminate_resultsP(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_allow_indeterminate_resultsP(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35208)
  public static final SubLObject inference_allowed_rules(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_allowed_rules(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35342)
  public static final SubLObject inference_forbidden_rules(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_forbidden_rules(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35480)
  public static final SubLObject inference_allowed_modules(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_allowed_modules(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35618)
  public static final SubLObject inference_allow_abnormality_checkingP(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_allow_abnormality_checkingP(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35780)
  public static final SubLObject inference_transitive_closure_mode(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_transitive_closure_mode(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 35934)
  public static final SubLObject inference_problem_store_privateP(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_problem_store_privateP(inference);
  }

  /** @return booleanp, whether INFERENCE was specified to be continuable. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36086)
  public static final SubLObject inference_continuableP(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_continuableP(inference);
  }

  /** @return booleanp, whether INFERENCE was specified to be browsable. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36291)
  public static final SubLObject inference_browsableP(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_browsableP(inference);
  }

  /** @return inference-return-type-p, the return type of inference stored in :return. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36490)
  public static final SubLObject inference_return_type(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_return_type(inference);
  }

  /** @return nil or universal-time-p
   NIL indicates there is no time cutoff */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36705)
  public static final SubLObject inference_max_time(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_max_time(inference);
  }

  /** @return nil or non-negative-integer-p
   NIL indicates there is no step cutoff */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 36906)
  public static final SubLObject inference_max_step(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_max_step(inference);
  }

  /** @return nil or universal-time-p
   NIL indicates there is no time cutoff */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37258)
  public static final SubLObject inference_forward_max_time(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_forward_max_time(inference);
  }

  /** @return nil or non-negative-integer-p
   NIL indicates there is no number limit */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37475)
  public static final SubLObject inference_max_number(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_max_number(inference);
  }

  /** @return nil or non-negative-integer-p
   NIL indicates there is no limit on proof depth */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37687)
  public static final SubLObject inference_max_proof_depth(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_max_proof_depth(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 37917)
  public static final SubLObject inference_max_transformation_depth(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_max_transformation_depth(inference);
  }

  /** @return probability-p
   1 means we must be 100% sure we are done before halting */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38073)
  public static final SubLObject inference_probably_approximately_done(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_probably_approximately_done(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38320)
  public static final SubLObject inference_metrics_template(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_metrics_template(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38608)
  public static final SubLObject inference_start_internal_real_time(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_start_internal_real_time(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38762)
  public static final SubLObject inference_end_internal_real_time(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_end_internal_real_time(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 38914)
  public static final SubLObject inference_pad_internal_real_time(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_pad_internal_real_time(inference);
  }

  /** This is the total time spent in all of INFERENCE's previous continuations.  Use @xref inference-cumulative-time-so-far
if you want to include the time spent so far in the current continuation. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39066)
  public static final SubLObject inference_cumulative_time(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_cumulative_time(inference);
  }

  /** The number of inference steps performed so far for this inference, summed over all continuations */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39619)
  public static final SubLObject inference_cumulative_step_count(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_cumulative_step_count(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 39870)
  public static final SubLObject inference_problem_working_time_data(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_problem_working_time_data(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 40414)
  public static final SubLObject inference_type(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_type(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 40530)
  public static final SubLObject inference_data(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return infrnc_data(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 40922)
  public static final SubLObject set_inference_input_mt(SubLObject inference, SubLObject mt) {
    checkType(inference, $sym2$INFERENCE_P);
    if ((NIL != mt)) {
      checkType(mt, $sym332$POSSIBLY_MT_P);
    }
    _csetf_infrnc_input_mt(inference, mt);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41119)
  public static final SubLObject set_inference_input_el_query(SubLObject inference, SubLObject el_query) {
    checkType(inference, $sym2$INFERENCE_P);
    if ((NIL != el_query)) {
      checkType(el_query, $sym333$POSSIBLY_INFERENCE_SENTENCE_P);
    }
    _csetf_infrnc_input_el_query(inference, el_query);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41362)
  public static final SubLObject set_inference_input_non_explanatory_el_query(SubLObject inference, SubLObject el_query) {
    checkType(inference, $sym2$INFERENCE_P);
    if ((NIL != el_query)) {
      checkType(el_query, $sym333$POSSIBLY_INFERENCE_SENTENCE_P);
    }
    _csetf_infrnc_input_non_explanatory_el_query(inference, el_query);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41637)
  public static final SubLObject set_inference_input_query_properties(SubLObject inference, SubLObject query_properties) {
    checkType(inference, $sym2$INFERENCE_P);
    if ((NIL != query_properties)) {
      checkType(query_properties, $sym334$QUERY_PROPERTIES_P);
    }
    _csetf_infrnc_input_query_properties(inference, query_properties);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 41909)
  public static final SubLObject set_inference_mt(SubLObject inference, SubLObject mt) {
    checkType(inference, $sym2$INFERENCE_P);
    if ((NIL != mt)) {
      checkType(mt, $sym335$HLMT_P);
    }
    _csetf_infrnc_mt(inference, mt);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42087)
  public static final SubLObject set_inference_el_query(SubLObject inference, SubLObject el_query) {
    checkType(inference, $sym2$INFERENCE_P);
    if ((NIL != el_query)) {
      checkType(el_query, $sym333$POSSIBLY_INFERENCE_SENTENCE_P);
    }
    _csetf_infrnc_el_query(inference, el_query);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42318)
  public static final SubLObject set_inference_el_bindings(SubLObject inference, SubLObject el_bindings) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(el_bindings, $sym336$BINDING_LIST_P);
    _csetf_infrnc_el_bindings(inference, el_bindings);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42538)
  public static final SubLObject set_inference_hl_query(SubLObject inference, SubLObject hl_query) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(hl_query, $sym337$PROBLEM_QUERY_P);
    _csetf_infrnc_hl_query(inference, hl_query);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 42745)
  public static final SubLObject set_inference_explanatory_subquery(SubLObject inference, SubLObject explanatory_subquery) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(explanatory_subquery, $sym338$EXPLANATORY_SUBQUERY_SPEC_P);
    _csetf_infrnc_explanatory_subquery(inference, explanatory_subquery);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43023)
  public static final SubLObject set_inference_non_explanatory_subquery(SubLObject inference, SubLObject non_explanatory_subquery) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(non_explanatory_subquery, $sym339$NON_EXPLANATORY_SUBQUERY_SPEC_P);
    _csetf_infrnc_non_explanatory_subquery(inference, non_explanatory_subquery);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43325)
  public static final SubLObject set_inference_free_hl_vars(SubLObject inference, SubLObject free_hl_vars) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(free_hl_vars, $sym340$LISTP);
    _csetf_infrnc_free_hl_vars(inference, free_hl_vars);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43541)
  public static final SubLObject set_inference_hypothetical_bindings(SubLObject inference, SubLObject hypothetical_bindings) {
    checkType(inference, $sym2$INFERENCE_P);
    if ((NIL != hypothetical_bindings)) {
      checkType(hypothetical_bindings, $sym336$BINDING_LIST_P);
    }
    _csetf_infrnc_hypothetical_bindings(inference, hypothetical_bindings);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 43823)
  public static final SubLObject set_inference_status(SubLObject inference, SubLObject status) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(status, $sym341$INFERENCE_STATUS_P);
    _csetf_infrnc_status(inference, status);
    if ((NIL == inference_datastructures_enumerated_types.inference_suspend_status_applicableP(status))) {
      _csetf_infrnc_suspend_status(inference, NIL);
    }
    possibly_signal_inference_status_change(inference);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44269)
  public static final SubLObject set_inference_suspend_status(SubLObject inference, SubLObject suspend_status) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(suspend_status, $sym342$INFERENCE_SUSPEND_STATUS_P);
    _csetf_infrnc_suspend_status(inference, suspend_status);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44516)
  public static final SubLObject set_inference_root_link(SubLObject inference, SubLObject root_link) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(root_link, $sym343$ANSWER_LINK_P);
    _csetf_infrnc_root_link(inference, root_link);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44725)
  public static final SubLObject set_inference_control_process(SubLObject inference, SubLObject process) {
    checkType(inference, $sym2$INFERENCE_P);
    if ((NIL != process)) {
      checkType(process, $sym344$PROCESSP);
    }
    _csetf_infrnc_control_process(inference, process);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 44944)
  public static final SubLObject set_inference_max_transformation_depth_reached(SubLObject inference, SubLObject depth) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(depth, $sym345$NON_NEGATIVE_INTEGER_P);
    _csetf_infrnc_max_transformation_depth_reached(inference, depth);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 45194)
  public static final SubLObject set_inference_disjunction_free_el_vars_policy(SubLObject inference, SubLObject disjunction_free_el_vars_policy) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(disjunction_free_el_vars_policy, $sym346$INFERENCE_DISJUNCTION_FREE_EL_VARS_POLICY_P);
    _csetf_infrnc_disjunction_free_el_vars_policy(inference, disjunction_free_el_vars_policy);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 45541)
  public static final SubLObject set_inference_result_uniqueness_criterion(SubLObject inference, SubLObject criterion) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(criterion, $sym347$RESULT_UNIQUENESS_CRITERION_P);
    _csetf_infrnc_result_uniqueness_criterion(inference, criterion);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 45802)
  public static final SubLObject set_inference_allow_hl_predicate_transformation(SubLObject inference, SubLObject allowP) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(allowP, $sym348$BOOLEANP);
    _csetf_infrnc_allow_hl_predicate_transformationP(inference, allowP);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46044)
  public static final SubLObject set_inference_allow_unbound_predicate_transformation(SubLObject inference, SubLObject allowP) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(allowP, $sym348$BOOLEANP);
    _csetf_infrnc_allow_unbound_predicate_transformationP(inference, allowP);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46296)
  public static final SubLObject set_inference_allow_evaluatable_predicate_transformation(SubLObject inference, SubLObject allowP) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(allowP, $sym348$BOOLEANP);
    _csetf_infrnc_allow_evaluatable_predicate_transformationP(inference, allowP);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46556)
  public static final SubLObject set_inference_allow_indeterminate_results(SubLObject inference, SubLObject allowP) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(allowP, $sym348$BOOLEANP);
    _csetf_infrnc_allow_indeterminate_resultsP(inference, allowP);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 46786)
  public static final SubLObject set_inference_allowed_rules(SubLObject inference, SubLObject allowed_rules) {
    checkType(inference, $sym2$INFERENCE_P);
    _csetf_infrnc_allowed_rules(inference, allowed_rules);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 47097)
  public static final SubLObject set_inference_forbidden_rules(SubLObject inference, SubLObject forbidden_rules) {
    checkType(inference, $sym2$INFERENCE_P);
    _csetf_infrnc_forbidden_rules(inference, forbidden_rules);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 47425)
  public static final SubLObject set_inference_allowed_modules(SubLObject inference, SubLObject allowed_modules) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(allowed_modules, $sym349$ALLOWED_MODULES_SPEC_P);
    _csetf_infrnc_allowed_modules(inference, allowed_modules);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 47671)
  public static final SubLObject set_inference_allow_abnormality_checking(SubLObject inference, SubLObject allowP) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(allowP, $sym348$BOOLEANP);
    _csetf_infrnc_allow_abnormality_checkingP(inference, allowP);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 47899)
  public static final SubLObject set_inference_transitive_closure_mode(SubLObject inference, SubLObject transitive_closure_mode) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(transitive_closure_mode, $sym350$INFERENCE_TRANSITIVE_CLOSURE_MODE_P);
    _csetf_infrnc_transitive_closure_mode(inference, transitive_closure_mode);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48198)
  public static final SubLObject set_inference_problem_store_private(SubLObject inference, SubLObject privateP) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(privateP, $sym348$BOOLEANP);
    _csetf_infrnc_problem_store_privateP(inference, privateP);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48424)
  public static final SubLObject set_inference_continuable(SubLObject inference, SubLObject continuableP) {
    checkType(continuableP, $sym348$BOOLEANP);
    _csetf_infrnc_continuableP(inference, continuableP);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48643)
  public static final SubLObject set_inference_browsable(SubLObject inference, SubLObject browsableP) {
    checkType(browsableP, $sym348$BOOLEANP);
    _csetf_infrnc_browsableP(inference, browsableP);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 48852)
  public static final SubLObject set_inference_return_type(SubLObject inference, SubLObject return_type) {
    checkType(return_type, $sym351$INFERENCE_RETURN_TYPE_P);
    _csetf_infrnc_return_type(inference, return_type);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49082)
  public static final SubLObject set_inference_answer_language(SubLObject inference, SubLObject answer_language) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(answer_language, $sym352$INFERENCE_ANSWER_LANGUAGE_P);
    _csetf_infrnc_answer_language(inference, answer_language);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49335)
  public static final SubLObject set_inference_cache_results(SubLObject inference, SubLObject cache_resultsP) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(cache_resultsP, $sym348$BOOLEANP);
    _csetf_infrnc_cache_resultsP(inference, cache_resultsP);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49715)
  public static final SubLObject clear_inference_blocking(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    _csetf_infrnc_blockingP(inference, NIL);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 49870)
  public static final SubLObject set_inference_max_number(SubLObject inference, SubLObject max_number) {
    if ((NIL != max_number)) {
      checkType(max_number, $sym345$NON_NEGATIVE_INTEGER_P);
    }
    _csetf_infrnc_max_number(inference, max_number);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50105)
  public static final SubLObject set_inference_max_time(SubLObject inference, SubLObject max_time) {
    if ((NIL != max_time)) {
      checkType(max_time, $sym353$NON_NEGATIVE_NUMBER_P);
    }
    _csetf_infrnc_max_time(inference, max_time);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50329)
  public static final SubLObject set_inference_max_step(SubLObject inference, SubLObject max_step) {
    if ((NIL != max_step)) {
      checkType(max_step, $sym345$NON_NEGATIVE_INTEGER_P);
    }
    _csetf_infrnc_max_step(inference, max_step);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50554)
  public static final SubLObject set_inference_mode(SubLObject inference, SubLObject mode) {
    checkType(mode, $sym354$INFERENCE_MODE_P);
    _csetf_infrnc_mode(inference, mode);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 50742)
  public static final SubLObject set_inference_forward_max_time(SubLObject inference, SubLObject forward_max_time) {
    if ((NIL != forward_max_time)) {
      checkType(forward_max_time, $sym353$NON_NEGATIVE_NUMBER_P);
    }
    {
      SubLObject max_time = inference_max_time(inference);
      if ((max_time.isInteger()
           && forward_max_time.isInteger()
           && max_time.numL(forward_max_time))) {
        Errors.error($str355$Forward_max_time__s_cannot_be_gre, forward_max_time, max_time);
      }
    }
    _csetf_infrnc_forward_max_time(inference, forward_max_time);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51254)
  public static final SubLObject set_inference_max_proof_depth(SubLObject inference, SubLObject max_proof_depth) {
    if ((NIL != max_proof_depth)) {
      checkType(max_proof_depth, $sym345$NON_NEGATIVE_INTEGER_P);
    }
    _csetf_infrnc_max_proof_depth(inference, max_proof_depth);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51514)
  public static final SubLObject set_inference_max_transformation_depth(SubLObject inference, SubLObject max_transformation_depth) {
    if ((NIL != max_transformation_depth)) {
      checkType(max_transformation_depth, $sym345$NON_NEGATIVE_INTEGER_P);
    }
    _csetf_infrnc_max_transformation_depth(inference, max_transformation_depth);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 51819)
  public static final SubLObject set_inference_probably_approximately_done(SubLObject inference, SubLObject probability) {
    checkType(probability, $sym356$PROBABILITY_P);
    _csetf_infrnc_probably_approximately_done(inference, probability);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 52071)
  public static final SubLObject set_inference_metrics_template(SubLObject inference, SubLObject metrics_template) {
    {
      SubLObject list_var = metrics_template;
      checkType(list_var, $sym357$NON_DOTTED_LIST_P);
      {
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          checkType(elem, $sym358$QUERY_METRIC_P);
        }
      }
    }
    _csetf_infrnc_metrics_template(inference, metrics_template);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 52322)
  public static final SubLObject set_inference_start_universal_time(SubLObject inference, SubLObject universal_time) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(universal_time, $sym359$UNIVERSAL_TIME_P);
    _csetf_infrnc_start_universal_time(inference, universal_time);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 52569)
  public static final SubLObject set_inference_start_internal_real_time(SubLObject inference, SubLObject internal_real_time) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(internal_real_time, $sym345$NON_NEGATIVE_INTEGER_P);
    _csetf_infrnc_start_internal_real_time(inference, internal_real_time);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 52842)
  public static final SubLObject set_inference_end_internal_real_time(SubLObject inference, SubLObject end_internal_real_time) {
    checkType(inference, $sym2$INFERENCE_P);
    if ((NIL != end_internal_real_time)) {
      checkType(end_internal_real_time, $sym345$NON_NEGATIVE_INTEGER_P);
    }
    _csetf_infrnc_end_internal_real_time(inference, end_internal_real_time);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53135)
  public static final SubLObject set_inference_pad_internal_real_time(SubLObject inference, SubLObject pad_internal_real_time) {
    checkType(inference, $sym2$INFERENCE_P);
    if ((NIL != pad_internal_real_time)) {
      checkType(pad_internal_real_time, $sym360$POTENTIALLY_INFINITE_INTEGER_P);
    }
    _csetf_infrnc_pad_internal_real_time(inference, pad_internal_real_time);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53435)
  public static final SubLObject set_inference_cumulative_time(SubLObject inference, SubLObject cumulative_time) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(cumulative_time, $sym361$NUMBERP);
    _csetf_infrnc_cumulative_time(inference, cumulative_time);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53666)
  public static final SubLObject set_inference_step_count(SubLObject inference, SubLObject step_count) {
    checkType(step_count, $sym345$NON_NEGATIVE_INTEGER_P);
    _csetf_infrnc_step_count(inference, step_count);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 53888)
  public static final SubLObject increment_inference_step_count(SubLObject inference) {
    _csetf_infrnc_step_count(inference, Numbers.add(infrnc_step_count(inference), ONE_INTEGER));
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54046)
  public static final SubLObject set_inference_cumulative_step_count(SubLObject inference, SubLObject cumulative_step_count) {
    checkType(cumulative_step_count, $sym345$NON_NEGATIVE_INTEGER_P);
    _csetf_infrnc_cumulative_step_count(inference, cumulative_step_count);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54323)
  public static final SubLObject increment_inference_cumulative_step_count(SubLObject inference) {
    _csetf_infrnc_cumulative_step_count(inference, Numbers.add(infrnc_cumulative_step_count(inference), ONE_INTEGER));
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54719)
  public static final SubLObject set_inference_events(SubLObject inference, SubLObject event_types) {
    checkType(inference, $sym2$INFERENCE_P);
    {
      SubLObject list_var = event_types;
      checkType(list_var, $sym357$NON_DOTTED_LIST_P);
      {
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          checkType(elem, $sym362$INFERENCE_EVENT_TYPE_P);
        }
      }
    }
    _csetf_infrnc_events(inference, event_types);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 54940)
  public static final SubLObject set_inference_halt_conditions(SubLObject inference, SubLObject halt_conditions) {
    checkType(inference, $sym2$INFERENCE_P);
    {
      SubLObject list_var = halt_conditions;
      checkType(list_var, $sym357$NON_DOTTED_LIST_P);
      {
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          checkType(elem, $sym363$INFERENCE_HALT_CONDITION_P);
        }
      }
    }
    _csetf_infrnc_halt_conditions(inference, halt_conditions);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 55195)
  public static final SubLObject set_inference_type(SubLObject inference, SubLObject type) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(type, $sym364$INFERENCE_TYPE_P);
    _csetf_infrnc_type(inference, type);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 55528)
  public static final SubLObject inference_ids(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return list(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35773"), inference_suid(inference));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57477)
  public static final SubLObject inference_no_free_hl_varsP(SubLObject inference) {
    return Types.sublisp_null(inference_free_hl_vars(inference));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 57587)
  public static final SubLObject inference_free_el_vars(SubLObject inference) {
    {
      SubLObject el_bindings = inference_el_bindings(inference);
      SubLObject free_hl_vars = inference_free_hl_vars(inference);
      return bindings.apply_bindings_backwards(el_bindings, free_hl_vars);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 60966)
  public static final SubLObject inference_root_mapped_problem(SubLObject inference) {
    {
      SubLObject root_link = inference_root_link(inference);
      if ((NIL != root_link)) {
        return inference_worker_answer.answer_link_supporting_mapped_problem(root_link);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 61167)
  public static final SubLObject inference_root_problem(SubLObject inference) {
    {
      SubLObject root_mapped_problem = inference_root_mapped_problem(inference);
      if ((NIL != root_mapped_problem)) {
        return inference_datastructures_problem_link.mapped_problem_problem(root_mapped_problem);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 61517)
  public static final SubLObject inference_unique_wrt_bindingsP(SubLObject inference) {
    return Equality.eq($kw390$BINDINGS, inference_result_uniqueness_criterion(inference));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 61653)
  public static final SubLObject inference_compute_answer_justificationsP(SubLObject inference) {
    return inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_problem_store(inference));
  }

  /** Return T iff INFERENCE not only has a private problem store, but the current set
   of dynamic properties will never be extended. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 62065)
  public static final SubLObject inference_problem_store_private_wrt_dynamic_propertiesP(SubLObject inference) {
    return makeBoolean(((NIL != inference_problem_store_privateP(inference))
           && (NIL == inference_continuableP(inference))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 62970)
  public static final SubLObject inference_allows_use_of_all_rulesP(SubLObject inference) {
    return makeBoolean((($kw383$ALL == inference_allowed_rules(inference))
           && ($kw391$NONE == inference_forbidden_rules(inference))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 63154)
  public static final SubLObject inference_allows_use_of_ruleP(SubLObject inference, SubLObject rule) {
    if ((NIL != inference_allows_use_of_all_rulesP(inference))) {
      return T;
    } else if (($kw391$NONE == inference_forbidden_rules(inference))) {
      return set.set_memberP(rule, inference_allowed_rules(inference));
    } else if (($kw383$ALL == inference_allowed_rules(inference))) {
      return makeBoolean((NIL == set.set_memberP(rule, inference_forbidden_rules(inference))));
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64501)
  public static final SubLObject inference_allows_use_of_all_modulesP(SubLObject inference) {
    return Equality.eq($kw383$ALL, inference_allowed_modules(inference));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64626)
  public static final SubLObject inference_allows_use_of_moduleP(SubLObject inference, SubLObject hl_module) {
    return makeBoolean(((NIL != inference_allows_use_of_all_modulesP(inference))
          || (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36412"))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 64837)
  public static final SubLObject inference_forget_extra_resultsP(SubLObject inference) {
    return inference_datastructures_enumerated_types.inference_properties_forget_extra_resultsP(inference_input_query_properties(inference));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 65163)
  public static final SubLObject find_inference_answer_by_id(SubLObject inference, SubLObject id) {
    checkType(id, $sym345$NON_NEGATIVE_INTEGER_P);
    {
      SubLObject v_id_index = inference_answer_id_index(inference);
      return id_index.id_index_lookup(v_id_index, id, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 69024)
  public static final SubLObject inference_maintain_term_working_setP(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    return list_utilities.sublisp_boolean(inference_problem_working_time_data(inference));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 69196)
  public static final SubLObject inference_halt_condition_presentP(SubLObject inference, SubLObject halt_condition) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(halt_condition, $sym363$INFERENCE_HALT_CONDITION_P);
    return list_utilities.member_eqP(halt_condition, infrnc_halt_conditions(inference));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 71135)
  public static final SubLObject compute_inference_pad_internal_real_time(SubLObject inference) {
    {
      SubLObject pad_probability = inference_probably_approximately_done(inference);
      SubLObject pad_seconds = probably_approximately_done_cutoff_time(pad_probability);
      if ((NIL != number_utilities.positive_infinity_p(pad_seconds))) {
        return number_utilities.positive_infinity();
      } else {
        {
          SubLObject pad_seconds_remaining = Numbers.subtract(pad_seconds, inference_cumulative_time(inference));
          SubLObject start_time = inference_start_internal_real_time(inference);
          SubLObject pad_time = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23122");
          return pad_time;
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 71725)
  private static SubLSymbol $pad_times_to_first_answer$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 71789)
  public static final SubLObject initialize_pad_table(SubLObject filename) {
    {
      SubLObject scaled_times_to_first_answer = misc_utilities.scale_by_bogomips(inference_pad_data.$non_tkb_final_times_to_first_answer$.getGlobalValue(), inference_pad_data.$non_tkb_final_bogomips$.getGlobalValue());
      $pad_times_to_first_answer$.setGlobalValue(scaled_times_to_first_answer);
    }
    return Sequences.length($pad_times_to_first_answer$.getGlobalValue());
  }

  /** @return positive-potentially-infinite-number-p (seconds or :positive-infinity) */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72258)
  public static final SubLObject probably_approximately_done_cutoff_time(SubLObject probability) {
    if (((NIL != list_utilities.safe_E(ONE_INTEGER, probability))
        || (NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35784")))) {
      return $kw396$POSITIVE_INFINITY;
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31738");
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 72938)
  public static final SubLObject inference_note_transformation_depth(SubLObject inference, SubLObject depth) {
    {
      SubLObject max_transformation_depth_reached = inference_max_transformation_depth_reached(inference);
      if (depth.numG(max_transformation_depth_reached)) {
        return inference_note_new_transformation_depth_reached(inference, depth);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 73329)
  public static final SubLObject inference_note_new_transformation_depth_reached(SubLObject inference, SubLObject depth) {
    set_inference_max_transformation_depth_reached(inference, depth);
    possibly_signal_inference_new_transformation_depth_reached(inference, depth);
    if ((NIL != inference_halt_condition_presentP(inference, $kw398$LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS))) {
      if ((NIL != subl_promotions.positive_integer_p(inference_answer_count(inference)))) {
        set_inference_suspend_status(inference, $kw398$LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS);
        return $kw398$LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 73859)
  public static final SubLObject find_inference_answer_by_bindings(SubLObject inference, SubLObject v_bindings) {
    checkType(v_bindings, $sym336$BINDING_LIST_P);
    {
      SubLObject dict = inference_answer_bindings_index(inference);
      return dictionary.dictionary_lookup(dict, v_bindings, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 74079)
  public static final SubLObject new_inference_answer_id(SubLObject inference) {
    {
      SubLObject v_id_index = inference_answer_id_index(inference);
      return id_index.id_index_reserve(v_id_index);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 74231)
  public static final SubLObject inference_all_answers(SubLObject inference) {
    {
      SubLObject answers = NIL;
      SubLObject idx = inference_answer_id_index(inference);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw369$SKIP))) {
        {
          SubLObject idx_32 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_32, $kw369$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_32);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject answer = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(answer))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw369$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(answer))) {
                      answer = $kw369$SKIP;
                    }
                    answers = cons(answer, answers);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_33 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_33))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_33);
              SubLObject id = NIL;
              SubLObject answer = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    answer = Hashtables.getEntryValue(cdohash_entry);
                    answers = cons(answer, answers);
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
      return Sequences.nreverse(answers);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 74413)
  public static final SubLObject inference_all_new_answers(SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answers = NIL;
        SubLObject inf = inference;
        SubLObject start_id = inference_new_answer_id_start(inference);
        SubLObject end_id = inference_next_new_answer_id(inference);
        SubLObject id = NIL;
        for (id = start_id; (!(id.numGE(end_id))); id = number_utilities.f_1X(id)) {
          {
            SubLObject answer = find_inference_answer_by_id(inf, id);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
              if ((NIL == answer)) {
                Errors.error($str399$got_a_null_answer_for__s, inference);
              }
            }
            answers = cons(answer, answers);
          }
        }
        return Sequences.nreverse(answers);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 75820)
  public static final SubLObject inference_interrupt_signaledP(SubLObject inference) {
    return makeBoolean((NIL == queues.queue_empty_p(inference_interrupting_processes(inference))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 76263)
  public static final SubLObject inference_answer_count(SubLObject inference) {
    return id_index.id_index_count(inference_answer_id_index(inference));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 76924)
  public static final SubLObject forward_inference_p(SubLObject inference) {
    return makeBoolean(((NIL != inference_p(inference))
           && (NIL != inference_datastructures_problem_store.problem_store_forwardP(inference_problem_store(inference)))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 77221)
  public static final SubLObject abductive_inference_p(SubLObject inference) {
    return makeBoolean(((NIL != inference_p(inference))
           && (NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_problem_store(inference)))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 78666)
  public static final SubLObject inference_set_static_properties(SubLObject inference, SubLObject static_properties) {
    checkType(static_properties, $sym404$INFERENCE_STATIC_PROPERTIES_P);
    {
      SubLObject disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.inference_properties_disjunction_free_el_vars_policy(static_properties);
      set_inference_disjunction_free_el_vars_policy(inference, disjunction_free_el_vars_policy);
    }
    {
      SubLObject uniqueness_criterion = inference_datastructures_enumerated_types.inference_properties_uniqueness_criterion(static_properties);
      set_inference_result_uniqueness_criterion(inference, uniqueness_criterion);
    }
    {
      SubLObject allow_hl_predicate_transformationP = inference_datastructures_enumerated_types.inference_properties_allow_hl_predicate_transformationP(static_properties);
      set_inference_allow_hl_predicate_transformation(inference, allow_hl_predicate_transformationP);
    }
    {
      SubLObject allow_unbound_predicate_transformationP = inference_datastructures_enumerated_types.inference_properties_allow_unbound_predicate_transformationP(static_properties);
      set_inference_allow_unbound_predicate_transformation(inference, allow_unbound_predicate_transformationP);
    }
    {
      SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_enumerated_types.inference_properties_allow_evaluatable_predicate_transformationP(static_properties);
      set_inference_allow_evaluatable_predicate_transformation(inference, allow_evaluatable_predicate_transformationP);
    }
    {
      SubLObject allow_indeterminate_resultsP = inference_datastructures_enumerated_types.inference_properties_allow_indeterminate_resultsP(static_properties);
      set_inference_allow_indeterminate_results(inference, allow_indeterminate_resultsP);
    }
    {
      SubLObject allowed_rules = inference_datastructures_enumerated_types.inference_properties_allowed_rules(static_properties);
      checkType(allowed_rules, $sym405$ALLOWED_RULES_SPEC_P);
      if (($kw383$ALL == allowed_rules)) {
        set_inference_allowed_rules(inference, $kw383$ALL);
      } else {
        set_inference_allowed_rules(inference, set_utilities.construct_set_from_list(allowed_rules, Symbols.symbol_function(EQ), UNPROVIDED));
      }
    }
    {
      SubLObject forbidden_rules = inference_datastructures_enumerated_types.inference_properties_forbidden_rules(static_properties);
      checkType(forbidden_rules, $sym406$FORBIDDEN_RULES_SPEC_P);
      if (($kw391$NONE == forbidden_rules)) {
        set_inference_forbidden_rules(inference, $kw391$NONE);
      } else {
        set_inference_forbidden_rules(inference, set_utilities.construct_set_from_list(forbidden_rules, Symbols.symbol_function(EQ), UNPROVIDED));
      }
    }
    {
      SubLObject allowed_modules = inference_datastructures_enumerated_types.inference_properties_allowed_modules(static_properties);
      set_inference_allowed_modules(inference, allowed_modules);
    }
    {
      SubLObject allow_abnormality_checkingP = inference_datastructures_enumerated_types.inference_properties_allow_abnormality_checkingP(static_properties);
      set_inference_allow_abnormality_checking(inference, allow_abnormality_checkingP);
    }
    {
      SubLObject transitive_closure_mode = inference_datastructures_enumerated_types.inference_properties_transitive_closure_mode(static_properties);
      set_inference_transitive_closure_mode(inference, transitive_closure_mode);
    }
    {
      SubLObject maintain_term_working_setP = inference_datastructures_enumerated_types.inference_properties_maintain_term_working_setP(static_properties);
      if ((NIL != maintain_term_working_setP)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35782");
      }
    }
    {
      SubLObject events = inference_datastructures_enumerated_types.inference_properties_events(static_properties);
      set_inference_events(inference, events);
    }
    {
      SubLObject halt_conditions = inference_datastructures_enumerated_types.inference_properties_halt_conditions(static_properties);
      set_inference_halt_conditions(inference, halt_conditions);
    }
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 81782)
  public static final SubLObject update_inference_input_query_properties(SubLObject inference, SubLObject input_dynamic_properties) {
    checkType(input_dynamic_properties, $sym407$QUERY_DYNAMIC_PROPERTIES_P);
    {
      SubLObject input_query_properties = infrnc_input_query_properties(inference);
      SubLObject static_mode = inference_datastructures_enumerated_types.inference_properties_mode(input_query_properties);
      SubLObject dynamic_mode = inference_datastructures_enumerated_types.inference_properties_mode(input_dynamic_properties);
      SubLObject mode_mismatchP = makeBoolean((static_mode != dynamic_mode));
      if ((NIL != mode_mismatchP)) {
        input_query_properties = inference_datastructures_enumerated_types.extract_query_static_properties(inference_strategist.explicify_inference_mode_defaults(input_query_properties));
        input_query_properties = conses_high.putf(input_query_properties, $kw408$INFERENCE_MODE, dynamic_mode);
        input_query_properties = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35555");
      }
      {
        SubLObject remainder = NIL;
        for (remainder = input_dynamic_properties; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
          {
            SubLObject property = remainder.first();
            SubLObject value = conses_high.cadr(remainder);
            input_query_properties = conses_high.putf(input_query_properties, property, value);
          }
        }
      }
      set_inference_input_query_properties(inference, input_query_properties);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 82921)
  public static final SubLObject add_inference_relevant_problem(SubLObject inference, SubLObject problem) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(problem, $sym409$PROBLEM_P);
    set.set_add(problem, infrnc_relevant_problems(inference));
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83137)
  public static final SubLObject remove_inference_relevant_problem(SubLObject inference, SubLObject problem) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(problem, $sym409$PROBLEM_P);
    set.set_remove(problem, infrnc_relevant_problems(inference));
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83359)
  public static final SubLObject clear_inference_relevant_problems(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    set.clear_set(infrnc_relevant_problems(inference));
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83531)
  public static final SubLObject add_inference_strategy(SubLObject inference, SubLObject strategy) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(strategy, $sym410$STRATEGY_P);
    set.set_add(strategy, infrnc_strategy_set(inference));
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 83951)
  public static final SubLObject clear_inference_strategy_set(SubLObject inference) {
    checkType(inference, $sym2$INFERENCE_P);
    set.clear_set(infrnc_strategy_set(inference));
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 84113)
  public static final SubLObject reset_inference_new_answer_id(SubLObject inference) {
    {
      SubLObject next_id = inference_next_new_answer_id(inference);
      _csetf_infrnc_new_answer_id_start(inference, next_id);
    }
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 84312)
  public static final SubLObject inference_next_new_answer_id(SubLObject inference) {
    {
      SubLObject v_id_index = inference_answer_id_index(inference);
      return id_index.id_index_next_id(v_id_index);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 84510)
  public static final SubLObject add_inference_new_answer_by_id(SubLObject inference, SubLObject answer) {
    checkType(answer, $sym411$INFERENCE_ANSWER_P);
    {
      SubLObject id = inference_answer_suid(answer);
      SubLObject v_id_index = inference_answer_id_index(inference);
      id_index.id_index_enter_autoextend(v_id_index, id, answer);
    }
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 85048)
  public static final SubLObject add_inference_new_answer_by_bindings(SubLObject inference, SubLObject answer) {
    checkType(answer, $sym411$INFERENCE_ANSWER_P);
    {
      SubLObject v_bindings = inference_answer_bindings(answer);
      SubLObject index = inference_answer_bindings_index(inference);
      dictionary.dictionary_enter(index, v_bindings, answer);
    }
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 85718)
  public static final SubLObject reset_inference_new_answer_justifications(SubLObject inference) {
    queues.clear_queue(inference_new_answer_justifications(inference));
    return inference;
  }

  /** Does not check for duplication with existing new justifications */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 85872)
  public static final SubLObject add_inference_new_answer_justification(SubLObject inference, SubLObject answer_justification) {
    checkType(answer_justification, $sym412$INFERENCE_ANSWER_JUSTIFICATION_P);
    queues.enqueue(answer_justification, inference_new_answer_justifications(inference));
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 86532)
  public static final SubLObject clear_inference_control_process(SubLObject inference) {
    return set_inference_control_process(inference, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 86651)
  public static final SubLObject set_inference_control_process_to_me(SubLObject inference) {
    return set_inference_control_process(inference, Threads.current_process());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 86974)
  public static final SubLObject increment_inference_cumulative_time(SubLObject inference, SubLObject time_delta) {
    {
      SubLObject cumulative_time = inference_cumulative_time(inference);
      cumulative_time = Numbers.add(cumulative_time, time_delta);
      set_inference_cumulative_time(inference, cumulative_time);
    }
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 88236)
  public static final SubLObject reset_inference_new_answers(SubLObject inference) {
    reset_inference_new_answer_id(inference);
    reset_inference_new_answer_justifications(inference);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 88429)
  public static final SubLObject add_inference_new_answer(SubLObject inference, SubLObject answer) {
    checkType(answer, $sym411$INFERENCE_ANSWER_P);
    add_inference_new_answer_by_id(inference, answer);
    add_inference_new_answer_by_bindings(inference, answer);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 88900)
  public static final SubLObject initialize_inference_time_properties(SubLObject inference) {
    {
      SubLObject real_time_now = Time.get_internal_real_time();
      SubLObject now = Time.get_universal_time();
      set_inference_start_internal_real_time(inference, real_time_now);
      set_inference_start_universal_time(inference, now);
      {
        SubLObject max_time = inference_max_time(inference);
        SubLObject end_time = ((NIL != max_time) ? ((SubLObject) Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23123")) : NIL);
        set_inference_end_internal_real_time(inference, end_time);
      }
      {
        SubLObject pad_time = compute_inference_pad_internal_real_time(inference);
        set_inference_pad_internal_real_time(inference, pad_time);
      }
    }
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89568)
  public static final SubLObject finalize_inference_time_properties(SubLObject inference) {
    {
      SubLObject delta_time = inference_time_so_far(inference, NIL);
      increment_inference_cumulative_time(inference, delta_time);
    }
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 89778)
  public static final SubLObject inference_elapsed_internal_real_time_since_start(SubLObject inference) {
    {
      SubLObject start = inference_start_internal_real_time(inference);
      SubLObject elapsed = numeric_date_utilities.elapsed_internal_real_time(start, UNPROVIDED);
      return elapsed;
    }
  }

  /** @return the time spent so far on the current continuation of this INFERENCE. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 90194)
  public static final SubLObject inference_time_so_far(SubLObject inference, SubLObject seconds_granularityP) {
    if ((seconds_granularityP == UNPROVIDED)) {
      seconds_granularityP = T;
    }
    {
      SubLObject seconds = ZERO_INTEGER;
      if ((NIL != running_inference_p(inference))) {
        if ((NIL != seconds_granularityP)) {
          seconds = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35755");
        } else {
          {
            SubLObject elapsed = inference_elapsed_internal_real_time_since_start(inference);
            seconds = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(elapsed);
          }
        }
      }
      return seconds;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 92472)
  public static final SubLObject simplest_inference_p(SubLObject object) {
    return makeBoolean(((NIL != inference_p(object))
           && ($kw416$SIMPLEST == inference_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 92681)
  public static final SubLObject new_simplest_inference(SubLObject store) {
    checkType(store, $sym324$PROBLEM_STORE_P);
    {
      SubLObject inference = new_inference(store);
      set_inference_type(inference, $kw416$SIMPLEST);
      return inference;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 92896)
  public static final SubLObject simplest_inference_strategy(SubLObject inference) {
    checkType(inference, $sym417$SIMPLEST_INFERENCE_P);
    return inference_data(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 93049)
  public static final SubLObject set_simplest_inference_strategy(SubLObject inference, SubLObject strategy) {
    checkType(inference, $sym417$SIMPLEST_INFERENCE_P);
    checkType(strategy, $sym410$STRATEGY_P);
    _csetf_infrnc_data(inference, strategy);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 93276)
  public static final SubLObject new_simplest_inference_of_type(SubLObject store, SubLObject strategy_type) {
    checkType(store, $sym324$PROBLEM_STORE_P);
    checkType(strategy_type, $sym418$STRATEGY_TYPE_P);
    {
      SubLObject inference = new_simplest_inference(store);
      SubLObject strategy = inference_datastructures_strategy.new_strategy(strategy_type, inference);
      set_simplest_inference_strategy(inference, strategy);
      inference_tactician.clear_strategy_step_count();
      return inference;
    }
  }

  public static final class $inference_answer_native extends SubLStructNative {
    @Override
    public SubLStructDecl getStructDecl() { return structDecl; }
    @Override
    public SubLObject getField2() { return $suid; }
    @Override
    public SubLObject getField3() { return $inference; }
    @Override
    public SubLObject getField4() { return $bindings; }
    @Override
    public SubLObject getField5() { return $justifications; }
    @Override
    public SubLObject getField6() { return $elapsed_creation_time; }
    @Override
    public SubLObject getField7() { return $step_count; }
    @Override
    public SubLObject setField2(SubLObject value) { return $suid = value; }
    @Override
    public SubLObject setField3(SubLObject value) { return $inference = value; }
    @Override
    public SubLObject setField4(SubLObject value) { return $bindings = value; }
    @Override
    public SubLObject setField5(SubLObject value) { return $justifications = value; }
    @Override
    public SubLObject setField6(SubLObject value) { return $elapsed_creation_time = value; }
    @Override
    public SubLObject setField7(SubLObject value) { return $step_count = value; }
    public SubLObject $suid = NIL;
    public SubLObject $inference = NIL;
    public SubLObject $bindings = NIL;
    public SubLObject $justifications = NIL;
    public SubLObject $elapsed_creation_time = NIL;
    public SubLObject $step_count = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($inference_answer_native.class, $sym419$INFERENCE_ANSWER, $sym411$INFERENCE_ANSWER_P, $list420, $list421, new String[] {"$suid", "$inference", "$bindings", "$justifications", "$elapsed_creation_time", "$step_count"}, $list422, $list423, $sym424$PRINT_INFERENCE_ANSWER);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static SubLSymbol $dtp_inference_answer$ = null;

  public static final class $inference_answer_p$UnaryFunction extends UnaryFunction {
    public $inference_answer_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-ANSWER-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35743"); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static final SubLObject inf_answer_suid(SubLObject object) {
    checkType(object, $sym411$INFERENCE_ANSWER_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static final SubLObject inf_answer_inference(SubLObject object) {
    checkType(object, $sym411$INFERENCE_ANSWER_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static final SubLObject inf_answer_bindings(SubLObject object) {
    checkType(object, $sym411$INFERENCE_ANSWER_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static final SubLObject inf_answer_justifications(SubLObject object) {
    checkType(object, $sym411$INFERENCE_ANSWER_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static final SubLObject _csetf_inf_answer_suid(SubLObject object, SubLObject value) {
    checkType(object, $sym411$INFERENCE_ANSWER_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static final SubLObject _csetf_inf_answer_inference(SubLObject object, SubLObject value) {
    checkType(object, $sym411$INFERENCE_ANSWER_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static final SubLObject _csetf_inf_answer_bindings(SubLObject object, SubLObject value) {
    checkType(object, $sym411$INFERENCE_ANSWER_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static final SubLObject _csetf_inf_answer_justifications(SubLObject object, SubLObject value) {
    checkType(object, $sym411$INFERENCE_ANSWER_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static final SubLObject _csetf_inf_answer_elapsed_creation_time(SubLObject object, SubLObject value) {
    checkType(object, $sym411$INFERENCE_ANSWER_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static final SubLObject _csetf_inf_answer_step_count(SubLObject object, SubLObject value) {
    checkType(object, $sym411$INFERENCE_ANSWER_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 94251)
  public static final SubLObject make_inference_answer(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $inference_answer_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw194$SUID)) {
            _csetf_inf_answer_suid(v_new, current_value);
          } else if (pcase_var.eql($kw438$INFERENCE)) {
            _csetf_inf_answer_inference(v_new, current_value);
          } else if (pcase_var.eql($kw390$BINDINGS)) {
            _csetf_inf_answer_bindings(v_new, current_value);
          } else if (pcase_var.eql($kw439$JUSTIFICATIONS)) {
            _csetf_inf_answer_justifications(v_new, current_value);
          } else if (pcase_var.eql($kw440$ELAPSED_CREATION_TIME)) {
            _csetf_inf_answer_elapsed_creation_time(v_new, current_value);
          } else if (pcase_var.eql($kw253$STEP_COUNT)) {
            _csetf_inf_answer_step_count(v_new, current_value);
          } else {
            Errors.error($str262$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 96238)
  public static final SubLObject new_inference_answer(SubLObject inference, SubLObject v_bindings) {
    checkType(inference, $sym2$INFERENCE_P);
    checkType(v_bindings, $sym444$BINDINGS_P);
    {
      SubLObject answer = make_inference_answer(UNPROVIDED);
      SubLObject suid = new_inference_answer_id(inference);
      if (suid.isZero()) {
        inference_metrics.increment_successful_inference_historical_count();
      }
      _csetf_inf_answer_suid(answer, suid);
      _csetf_inf_answer_inference(answer, inference);
      set_inference_answer_bindings(answer, v_bindings);
      _csetf_inf_answer_justifications(answer, NIL);
      initialize_inference_answer_elapsed_creation_time(answer);
      {
        SubLObject step_count = inference_cumulative_step_count(inference);
        set_inference_answer_step_count(answer, step_count);
      }
      add_inference_new_answer(inference, answer);
      possibly_signal_new_inference_answer(inference, answer);
      return answer;
    }
  }

  /** @return 0 inference-answer-p
@return 1 booleanp; whether a new answer was created */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 97180)
  public static final SubLObject find_or_create_inference_answer(SubLObject inference, SubLObject v_bindings) {
    checkType(inference, $sym2$INFERENCE_P);
    {
      SubLObject answer = find_inference_answer_by_bindings(inference, v_bindings);
      SubLObject newP = NIL;
      if ((NIL == answer)) {
        answer = new_inference_answer(inference, v_bindings);
        newP = T;
      }
      return Values.values(answer, newP);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 98873)
  public static final SubLObject inference_answer_suid(SubLObject inference_answer) {
    checkType(inference_answer, $sym411$INFERENCE_ANSWER_P);
    return inf_answer_suid(inference_answer);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99040)
  public static final SubLObject inference_answer_inference(SubLObject inference_answer) {
    checkType(inference_answer, $sym411$INFERENCE_ANSWER_P);
    return inf_answer_inference(inference_answer);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99205)
  public static final SubLObject inference_answer_bindings(SubLObject inference_answer) {
    checkType(inference_answer, $sym411$INFERENCE_ANSWER_P);
    return inf_answer_bindings(inference_answer);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99368)
  public static final SubLObject inference_answer_justifications(SubLObject inference_answer) {
    checkType(inference_answer, $sym411$INFERENCE_ANSWER_P);
    return inf_answer_justifications(inference_answer);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 99945)
  public static final SubLObject set_inference_answer_bindings(SubLObject inference_answer, SubLObject v_bindings) {
    checkType(v_bindings, $sym444$BINDINGS_P);
    _csetf_inf_answer_bindings(inference_answer, v_bindings);
    return inference_answer;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100151)
  public static final SubLObject set_inference_answer_elapsed_creation_time(SubLObject inference_answer, SubLObject elapsed_creation_time) {
    _csetf_inf_answer_elapsed_creation_time(inference_answer, elapsed_creation_time);
    return inference_answer;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 100475)
  public static final SubLObject set_inference_answer_step_count(SubLObject inference_answer, SubLObject step_count) {
    _csetf_inf_answer_step_count(inference_answer, step_count);
    return inference_answer;
  }

  /** @return nil or inference-answer-justification-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 101917)
  public static final SubLObject find_inference_answer_justification(SubLObject inference_answer, SubLObject hl_justification) {
    {
      SubLObject existing_justifications = inference_answer_justifications(inference_answer);
      return Sequences.find(hl_justification, existing_justifications, $sym450$JUSTIFICATION_EQUAL, $sym451$INFERENCE_ANSWER_JUSTIFICATION_SUPPORTS, UNPROVIDED, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 102291)
  public static final SubLObject inference_answer_result_bindings(SubLObject answer) {
    {
      SubLObject inference = inference_answer_inference(answer);
      SubLObject answer_language = inference_answer_language(inference);
      SubLObject pcase_var = answer_language;
      if (pcase_var.eql($kw452$HL)) {
        return inference_answer_bindings(answer);
      } else if (pcase_var.eql($kw453$EL)) {
        return inference_kernel.inference_answer_el_bindings(answer);
      } else {
        Errors.error($str454$_S_was_not_an_inference_answer_la, answer_language);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 103989)
  public static final SubLObject add_inference_answer_justification(SubLObject inference_answer, SubLObject justification) {
    checkType(justification, $sym412$INFERENCE_ANSWER_JUSTIFICATION_P);
    _csetf_inf_answer_justifications(inference_answer, cons(justification, inf_answer_justifications(inference_answer)));
    return inference_answer;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 104507)
  public static final SubLObject initialize_inference_answer_elapsed_creation_time(SubLObject inference_answer) {
    {
      SubLObject inference = inference_answer_inference(inference_answer);
      SubLObject start = inference_start_internal_real_time(inference);
      SubLObject elapsed = numeric_date_utilities.elapsed_internal_real_time(start, UNPROVIDED);
      set_inference_answer_elapsed_creation_time(inference_answer, elapsed);
      return inference_answer;
    }
  }

  public static final class $inference_answer_justification_native extends SubLStructNative {
    @Override
    public SubLStructDecl getStructDecl() { return structDecl; }
    @Override
    public SubLObject getField2() { return $answer; }
    @Override
    public SubLObject getField3() { return $supports; }
    @Override
    public SubLObject getField4() { return $proofs; }
    @Override
    public SubLObject setField2(SubLObject value) { return $answer = value; }
    @Override
    public SubLObject setField3(SubLObject value) { return $supports = value; }
    @Override
    public SubLObject setField4(SubLObject value) { return $proofs = value; }
    public SubLObject $answer = NIL;
    public SubLObject $supports = NIL;
    public SubLObject $proofs = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($inference_answer_justification_native.class, $sym456$INFERENCE_ANSWER_JUSTIFICATION, $sym412$INFERENCE_ANSWER_JUSTIFICATION_P, $list457, $list458, new String[] {"$answer", "$supports", "$proofs"}, $list459, $list460, $sym461$PRINT_INFERENCE_ANSWER_JUSTIFICATION);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105124)
  public static SubLSymbol $dtp_inference_answer_justification$ = null;

  public static final class $inference_answer_justification_p$UnaryFunction extends UnaryFunction {
    public $inference_answer_justification_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-ANSWER-JUSTIFICATION-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35739"); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105124)
  public static final SubLObject inf_ans_just_answer(SubLObject object) {
    checkType(object, $sym412$INFERENCE_ANSWER_JUSTIFICATION_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105124)
  public static final SubLObject inf_ans_just_supports(SubLObject object) {
    checkType(object, $sym412$INFERENCE_ANSWER_JUSTIFICATION_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105124)
  public static final SubLObject inf_ans_just_proofs(SubLObject object) {
    checkType(object, $sym412$INFERENCE_ANSWER_JUSTIFICATION_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105124)
  public static final SubLObject _csetf_inf_ans_just_answer(SubLObject object, SubLObject value) {
    checkType(object, $sym412$INFERENCE_ANSWER_JUSTIFICATION_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105124)
  public static final SubLObject _csetf_inf_ans_just_supports(SubLObject object, SubLObject value) {
    checkType(object, $sym412$INFERENCE_ANSWER_JUSTIFICATION_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105124)
  public static final SubLObject _csetf_inf_ans_just_proofs(SubLObject object, SubLObject value) {
    checkType(object, $sym412$INFERENCE_ANSWER_JUSTIFICATION_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 105124)
  public static final SubLObject make_inference_answer_justification(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $inference_answer_justification_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw469$ANSWER)) {
            _csetf_inf_ans_just_answer(v_new, current_value);
          } else if (pcase_var.eql($kw470$SUPPORTS)) {
            _csetf_inf_ans_just_supports(v_new, current_value);
          } else if (pcase_var.eql($kw471$PROOFS)) {
            _csetf_inf_ans_just_proofs(v_new, current_value);
          } else {
            Errors.error($str262$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 106894)
  public static final SubLObject new_inference_answer_justification(SubLObject answer, SubLObject supports) {
    checkType(answer, $sym411$INFERENCE_ANSWER_P);
    checkType(supports, $sym477$HL_JUSTIFICATION_P);
    {
      SubLObject just = make_inference_answer_justification(UNPROVIDED);
      _csetf_inf_ans_just_answer(just, answer);
      _csetf_inf_ans_just_supports(just, supports);
      add_inference_answer_justification(answer, just);
      return just;
    }
  }

  /** @return 0 inference-answer-justification-p
@return 1 booleanp; whether a new justification was created */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 107309)
  public static final SubLObject find_or_create_inference_answer_justification(SubLObject inference, SubLObject v_bindings, SubLObject supports) {
    checkType(inference, $sym2$INFERENCE_P);
    {
      SubLObject answer = find_or_create_inference_answer(inference, v_bindings);
      SubLObject justification = find_inference_answer_justification(answer, supports);
      SubLObject newP = NIL;
      if ((NIL == justification)) {
        justification = new_inference_answer_justification(answer, supports);
        add_inference_new_answer_justification(inference, justification);
        newP = T;
      }
      return Values.values(justification, newP);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 108950)
  public static final SubLObject inference_answer_justification_answer(SubLObject justification) {
    checkType(justification, $sym412$INFERENCE_ANSWER_JUSTIFICATION_P);
    return inf_ans_just_answer(justification);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 109142)
  public static final SubLObject inference_answer_justification_supports(SubLObject justification) {
    checkType(justification, $sym412$INFERENCE_ANSWER_JUSTIFICATION_P);
    return inf_ans_just_supports(justification);
  }

  public static final class $inference_answer_justification_supports$UnaryFunction extends UnaryFunction {
    public $inference_answer_justification_supports$UnaryFunction() { super(extractFunctionNamed("INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return inference_answer_justification_supports(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 111968)
  public static final SubLObject add_inference_answer_justification_proof(SubLObject justification, SubLObject proof) {
    checkType(proof, $sym496$PROOF_P);
    _csetf_inf_ans_just_proofs(justification, cons(proof, inf_ans_just_proofs(justification)));
    return justification;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 114910)
  public static final SubLObject inference_compute_metrics(SubLObject inference) {
    {
      SubLObject template = inference_metrics_template(inference);
      SubLObject metrics = list_utilities.tree_gather(template, Symbols.symbol_function($sym500$INFERENCE_QUERY_METRIC_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
      SubLObject answer = conses_high.copy_tree(template);
      SubLObject metrics_bindings = inference_compute_metrics_alist(inference, metrics);
      answer = conses_high.nsublis(metrics_bindings, answer, Symbols.symbol_function(EQ), UNPROVIDED);
      return answer;
    }
  }

  /** Return an alist of the form (METRIC . VALUE) where
   METRIC is a metric in METRICS and
   VALUE is the result of that metric when computed on INFERENCE. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 115757)
  public static final SubLObject inference_compute_metrics_alist(SubLObject inference, SubLObject metrics) {
    {
      SubLObject store = inference_problem_store(inference);
      SubLObject metrics_bindings = NIL;
      SubLObject answer_query_properties = NIL;
      SubLObject cdolist_list_var = metrics;
      SubLObject metric = NIL;
      for (metric = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), metric = cdolist_list_var.first()) {
        {
          SubLObject metric_object = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36314");
          if ((NIL != metric_object)) {
            {
              SubLObject result = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36313");
              metrics_bindings = cons(cons(metric, result), metrics_bindings);
            }
          } else {
            {
              SubLObject pcase_var = metric;
              if (pcase_var.eql($kw503$NEW_ROOT_TIMES)) {
                {
                  SubLObject strategy = simplest_inference_strategy(inference);
                  if ((NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy))) {
                    {
                      SubLObject new_root_times = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36521");
                      metrics_bindings = cons(cons($kw503$NEW_ROOT_TIMES, new_root_times), metrics_bindings);
                    }
                  }
                }
              } else if (pcase_var.eql($kw504$NEW_ROOT_COUNT)) {
                {
                  SubLObject strategy = simplest_inference_strategy(inference);
                  if ((NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy))) {
                    {
                      SubLObject new_root_count = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36520");
                      metrics_bindings = cons(cons($kw504$NEW_ROOT_COUNT, new_root_count), metrics_bindings);
                    }
                  }
                }
              } else if (pcase_var.eql($kw505$PROBLEM_CREATION_TIMES)) {
                {
                  SubLObject problem_creation_times = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2781");
                  metrics_bindings = cons(cons($kw505$PROBLEM_CREATION_TIMES, problem_creation_times), metrics_bindings);
                }
              } else if (pcase_var.eql($kw506$INFERENCE_ANSWER_QUERY_PROPERTIES)) {
                if ((NIL == answer_query_properties)) {
                  answer_query_properties = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35138");
                }
                metrics_bindings = cons(cons($kw506$INFERENCE_ANSWER_QUERY_PROPERTIES, answer_query_properties), metrics_bindings);
              } else if (pcase_var.eql($kw507$INFERENCE_STRONGEST_QUERY_PROPERTIES)) {
                if ((NIL == answer_query_properties)) {
                  answer_query_properties = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35139");
                }
                if ((NIL != answer_query_properties)) {
                  metrics_bindings = cons(cons($kw507$INFERENCE_STRONGEST_QUERY_PROPERTIES, Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35129")), metrics_bindings);
                }
              } else if (pcase_var.eql($kw508$INFERENCE_MOST_EFFICIENT_QUERY_PROPERTIES)) {
                {
                  SubLObject proof_query_properties = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35141");
                  SubLObject strengthened_properties = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35130");
                  metrics_bindings = cons(cons($kw508$INFERENCE_MOST_EFFICIENT_QUERY_PROPERTIES, strengthened_properties), metrics_bindings);
                }
              } else {
                Errors.sublisp_break($str509$time_to_implement_metric__S, new SubLObject[] {metric});
              }
            }
          }
        }
      }
      return metrics_bindings;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 121408)
  public static final SubLObject inference_problem_working_time_lock(SubLObject inference) {
    {
      SubLObject data = inference_problem_working_time_data(inference);
      return data.first();
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 122108)
  public static final SubLObject inference_note_tactic_executed(SubLObject inference, SubLObject tactic) {
    {
      SubLObject result = NIL;
      if ((NIL != inference_maintain_term_working_setP(inference))) {
        {
          SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
          SubLObject now = Time.get_internal_real_time();
          SubLObject inference_var = inference;
          SubLObject lock = inference_problem_working_time_lock(inference_var);
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            {
              SubLObject table = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35774");
              SubLObject already_being_worked_on = Hashtables.gethash_without_values(problem, table, UNPROVIDED);
              if ((NIL == already_being_worked_on)) {
                Hashtables.sethash(problem, table, now);
                result = T;
              }
            }
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 122598)
  public static final SubLObject inference_note_problem_pending(SubLObject inference, SubLObject problem) {
    {
      SubLObject result = NIL;
      if ((NIL != inference_maintain_term_working_setP(inference))) {
        {
          SubLObject inference_var = inference;
          SubLObject lock = inference_problem_working_time_lock(inference_var);
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            {
              SubLObject table = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35775");
              Hashtables.remhash(problem, table);
              result = T;
            }
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
      }
      return result;
    }
  }

  /** Called immediately after the creation of NEW-ANSWER */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 123149)
  public static final SubLObject possibly_signal_new_inference_answer(SubLObject inference, SubLObject new_answer) {
    return NIL;
  }

  /** Called immediately after the status change */
  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 123819)
  public static final SubLObject possibly_signal_inference_status_change(SubLObject inference) {
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-inference.lisp", position = 124447)
  public static final SubLObject possibly_signal_inference_new_transformation_depth_reached(SubLObject inference, SubLObject new_depth) {
    return NIL;
  }

  public static final SubLObject declare_inference_datastructures_inference_file() {
    declareFunction(myName, "inference_type_p", "INFERENCE-TYPE-P", 1, 0, false);
    declareFunction(myName, "inference_print_function_trampoline", "INFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "inference_p", "INFERENCE-P", 1, 0, false); new $inference_p$UnaryFunction();
    declareFunction(myName, "infrnc_suid", "INFRNC-SUID", 1, 0, false);
    declareFunction(myName, "infrnc_problem_store", "INFRNC-PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "infrnc_forward_propagate", "INFRNC-FORWARD-PROPAGATE", 1, 0, false);
    declareFunction(myName, "infrnc_input_mt", "INFRNC-INPUT-MT", 1, 0, false);
    declareFunction(myName, "infrnc_input_el_query", "INFRNC-INPUT-EL-QUERY", 1, 0, false);
    declareFunction(myName, "infrnc_input_non_explanatory_el_query", "INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY", 1, 0, false);
    declareFunction(myName, "infrnc_input_query_properties", "INFRNC-INPUT-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "infrnc_mt", "INFRNC-MT", 1, 0, false);
    declareFunction(myName, "infrnc_el_query", "INFRNC-EL-QUERY", 1, 0, false);
    declareFunction(myName, "infrnc_el_bindings", "INFRNC-EL-BINDINGS", 1, 0, false);
    declareFunction(myName, "infrnc_hl_query", "INFRNC-HL-QUERY", 1, 0, false);
    declareFunction(myName, "infrnc_explanatory_subquery", "INFRNC-EXPLANATORY-SUBQUERY", 1, 0, false);
    declareFunction(myName, "infrnc_non_explanatory_subquery", "INFRNC-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
    declareFunction(myName, "infrnc_free_hl_vars", "INFRNC-FREE-HL-VARS", 1, 0, false);
    declareFunction(myName, "infrnc_hypothetical_bindings", "INFRNC-HYPOTHETICAL-BINDINGS", 1, 0, false);
    declareFunction(myName, "infrnc_answer_id_index", "INFRNC-ANSWER-ID-INDEX", 1, 0, false);
    declareFunction(myName, "infrnc_answer_bindings_index", "INFRNC-ANSWER-BINDINGS-INDEX", 1, 0, false);
    declareFunction(myName, "infrnc_new_answer_id_start", "INFRNC-NEW-ANSWER-ID-START", 1, 0, false);
    declareFunction(myName, "infrnc_new_answer_justifications", "INFRNC-NEW-ANSWER-JUSTIFICATIONS", 1, 0, false);
    declareFunction(myName, "infrnc_status", "INFRNC-STATUS", 1, 0, false);
    declareFunction(myName, "infrnc_suspend_status", "INFRNC-SUSPEND-STATUS", 1, 0, false);
    declareFunction(myName, "infrnc_root_link", "INFRNC-ROOT-LINK", 1, 0, false);
    declareFunction(myName, "infrnc_relevant_problems", "INFRNC-RELEVANT-PROBLEMS", 1, 0, false);
    declareFunction(myName, "infrnc_strategy_set", "INFRNC-STRATEGY-SET", 1, 0, false);
    declareFunction(myName, "infrnc_control_process", "INFRNC-CONTROL-PROCESS", 1, 0, false);
    declareFunction(myName, "infrnc_interrupting_processes", "INFRNC-INTERRUPTING-PROCESSES", 1, 0, false);
    declareFunction(myName, "infrnc_max_transformation_depth_reached", "INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED", 1, 0, false);
    declareFunction(myName, "infrnc_disjunction_free_el_vars_policy", "INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
    declareFunction(myName, "infrnc_result_uniqueness_criterion", "INFRNC-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
    declareFunction(myName, "infrnc_allow_hl_predicate_transformationP", "INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "infrnc_allow_unbound_predicate_transformationP", "INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "infrnc_allow_evaluatable_predicate_transformationP", "INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "infrnc_allow_indeterminate_resultsP", "INFRNC-ALLOW-INDETERMINATE-RESULTS?", 1, 0, false);
    declareFunction(myName, "infrnc_allowed_rules", "INFRNC-ALLOWED-RULES", 1, 0, false);
    declareFunction(myName, "infrnc_forbidden_rules", "INFRNC-FORBIDDEN-RULES", 1, 0, false);
    declareFunction(myName, "infrnc_allowed_modules", "INFRNC-ALLOWED-MODULES", 1, 0, false);
    declareFunction(myName, "infrnc_allow_abnormality_checkingP", "INFRNC-ALLOW-ABNORMALITY-CHECKING?", 1, 0, false);
    declareFunction(myName, "infrnc_transitive_closure_mode", "INFRNC-TRANSITIVE-CLOSURE-MODE", 1, 0, false);
    declareFunction(myName, "infrnc_problem_store_privateP", "INFRNC-PROBLEM-STORE-PRIVATE?", 1, 0, false);
    declareFunction(myName, "infrnc_continuableP", "INFRNC-CONTINUABLE?", 1, 0, false);
    declareFunction(myName, "infrnc_browsableP", "INFRNC-BROWSABLE?", 1, 0, false);
    declareFunction(myName, "infrnc_return_type", "INFRNC-RETURN-TYPE", 1, 0, false);
    declareFunction(myName, "infrnc_answer_language", "INFRNC-ANSWER-LANGUAGE", 1, 0, false);
    declareFunction(myName, "infrnc_cache_resultsP", "INFRNC-CACHE-RESULTS?", 1, 0, false);
    declareFunction(myName, "infrnc_blockingP", "INFRNC-BLOCKING?", 1, 0, false);
    declareFunction(myName, "infrnc_max_number", "INFRNC-MAX-NUMBER", 1, 0, false);
    declareFunction(myName, "infrnc_max_time", "INFRNC-MAX-TIME", 1, 0, false);
    declareFunction(myName, "infrnc_max_step", "INFRNC-MAX-STEP", 1, 0, false);
    declareFunction(myName, "infrnc_mode", "INFRNC-MODE", 1, 0, false);
    declareFunction(myName, "infrnc_forward_max_time", "INFRNC-FORWARD-MAX-TIME", 1, 0, false);
    declareFunction(myName, "infrnc_max_proof_depth", "INFRNC-MAX-PROOF-DEPTH", 1, 0, false);
    declareFunction(myName, "infrnc_max_transformation_depth", "INFRNC-MAX-TRANSFORMATION-DEPTH", 1, 0, false);
    declareFunction(myName, "infrnc_probably_approximately_done", "INFRNC-PROBABLY-APPROXIMATELY-DONE", 1, 0, false);
    declareFunction(myName, "infrnc_metrics_template", "INFRNC-METRICS-TEMPLATE", 1, 0, false);
    declareFunction(myName, "infrnc_start_universal_time", "INFRNC-START-UNIVERSAL-TIME", 1, 0, false);
    declareFunction(myName, "infrnc_start_internal_real_time", "INFRNC-START-INTERNAL-REAL-TIME", 1, 0, false);
    declareFunction(myName, "infrnc_end_internal_real_time", "INFRNC-END-INTERNAL-REAL-TIME", 1, 0, false);
    declareFunction(myName, "infrnc_pad_internal_real_time", "INFRNC-PAD-INTERNAL-REAL-TIME", 1, 0, false);
    declareFunction(myName, "infrnc_cumulative_time", "INFRNC-CUMULATIVE-TIME", 1, 0, false);
    declareFunction(myName, "infrnc_step_count", "INFRNC-STEP-COUNT", 1, 0, false);
    declareFunction(myName, "infrnc_cumulative_step_count", "INFRNC-CUMULATIVE-STEP-COUNT", 1, 0, false);
    declareFunction(myName, "infrnc_events", "INFRNC-EVENTS", 1, 0, false);
    declareFunction(myName, "infrnc_halt_conditions", "INFRNC-HALT-CONDITIONS", 1, 0, false);
    declareFunction(myName, "infrnc_accumulators", "INFRNC-ACCUMULATORS", 1, 0, false);
    declareFunction(myName, "infrnc_proof_watermark", "INFRNC-PROOF-WATERMARK", 1, 0, false);
    declareFunction(myName, "infrnc_problem_working_time_data", "INFRNC-PROBLEM-WORKING-TIME-DATA", 1, 0, false);
    declareFunction(myName, "infrnc_type", "INFRNC-TYPE", 1, 0, false);
    declareFunction(myName, "infrnc_data", "INFRNC-DATA", 1, 0, false);
    declareFunction(myName, "_csetf_infrnc_suid", "_CSETF-INFRNC-SUID", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_problem_store", "_CSETF-INFRNC-PROBLEM-STORE", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_forward_propagate", "_CSETF-INFRNC-FORWARD-PROPAGATE", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_input_mt", "_CSETF-INFRNC-INPUT-MT", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_input_el_query", "_CSETF-INFRNC-INPUT-EL-QUERY", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_input_non_explanatory_el_query", "_CSETF-INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_input_query_properties", "_CSETF-INFRNC-INPUT-QUERY-PROPERTIES", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_mt", "_CSETF-INFRNC-MT", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_el_query", "_CSETF-INFRNC-EL-QUERY", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_el_bindings", "_CSETF-INFRNC-EL-BINDINGS", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_hl_query", "_CSETF-INFRNC-HL-QUERY", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_explanatory_subquery", "_CSETF-INFRNC-EXPLANATORY-SUBQUERY", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_non_explanatory_subquery", "_CSETF-INFRNC-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_free_hl_vars", "_CSETF-INFRNC-FREE-HL-VARS", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_hypothetical_bindings", "_CSETF-INFRNC-HYPOTHETICAL-BINDINGS", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_answer_id_index", "_CSETF-INFRNC-ANSWER-ID-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_answer_bindings_index", "_CSETF-INFRNC-ANSWER-BINDINGS-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_new_answer_id_start", "_CSETF-INFRNC-NEW-ANSWER-ID-START", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_new_answer_justifications", "_CSETF-INFRNC-NEW-ANSWER-JUSTIFICATIONS", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_status", "_CSETF-INFRNC-STATUS", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_suspend_status", "_CSETF-INFRNC-SUSPEND-STATUS", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_root_link", "_CSETF-INFRNC-ROOT-LINK", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_relevant_problems", "_CSETF-INFRNC-RELEVANT-PROBLEMS", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_strategy_set", "_CSETF-INFRNC-STRATEGY-SET", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_control_process", "_CSETF-INFRNC-CONTROL-PROCESS", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_interrupting_processes", "_CSETF-INFRNC-INTERRUPTING-PROCESSES", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_max_transformation_depth_reached", "_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_disjunction_free_el_vars_policy", "_CSETF-INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_result_uniqueness_criterion", "_CSETF-INFRNC-RESULT-UNIQUENESS-CRITERION", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_allow_hl_predicate_transformationP", "_CSETF-INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_allow_unbound_predicate_transformationP", "_CSETF-INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_allow_evaluatable_predicate_transformationP", "_CSETF-INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_allow_indeterminate_resultsP", "_CSETF-INFRNC-ALLOW-INDETERMINATE-RESULTS?", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_allowed_rules", "_CSETF-INFRNC-ALLOWED-RULES", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_forbidden_rules", "_CSETF-INFRNC-FORBIDDEN-RULES", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_allowed_modules", "_CSETF-INFRNC-ALLOWED-MODULES", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_allow_abnormality_checkingP", "_CSETF-INFRNC-ALLOW-ABNORMALITY-CHECKING?", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_transitive_closure_mode", "_CSETF-INFRNC-TRANSITIVE-CLOSURE-MODE", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_problem_store_privateP", "_CSETF-INFRNC-PROBLEM-STORE-PRIVATE?", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_continuableP", "_CSETF-INFRNC-CONTINUABLE?", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_browsableP", "_CSETF-INFRNC-BROWSABLE?", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_return_type", "_CSETF-INFRNC-RETURN-TYPE", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_answer_language", "_CSETF-INFRNC-ANSWER-LANGUAGE", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_cache_resultsP", "_CSETF-INFRNC-CACHE-RESULTS?", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_blockingP", "_CSETF-INFRNC-BLOCKING?", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_max_number", "_CSETF-INFRNC-MAX-NUMBER", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_max_time", "_CSETF-INFRNC-MAX-TIME", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_max_step", "_CSETF-INFRNC-MAX-STEP", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_mode", "_CSETF-INFRNC-MODE", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_forward_max_time", "_CSETF-INFRNC-FORWARD-MAX-TIME", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_max_proof_depth", "_CSETF-INFRNC-MAX-PROOF-DEPTH", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_max_transformation_depth", "_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_probably_approximately_done", "_CSETF-INFRNC-PROBABLY-APPROXIMATELY-DONE", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_metrics_template", "_CSETF-INFRNC-METRICS-TEMPLATE", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_start_universal_time", "_CSETF-INFRNC-START-UNIVERSAL-TIME", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_start_internal_real_time", "_CSETF-INFRNC-START-INTERNAL-REAL-TIME", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_end_internal_real_time", "_CSETF-INFRNC-END-INTERNAL-REAL-TIME", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_pad_internal_real_time", "_CSETF-INFRNC-PAD-INTERNAL-REAL-TIME", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_cumulative_time", "_CSETF-INFRNC-CUMULATIVE-TIME", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_step_count", "_CSETF-INFRNC-STEP-COUNT", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_cumulative_step_count", "_CSETF-INFRNC-CUMULATIVE-STEP-COUNT", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_events", "_CSETF-INFRNC-EVENTS", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_halt_conditions", "_CSETF-INFRNC-HALT-CONDITIONS", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_accumulators", "_CSETF-INFRNC-ACCUMULATORS", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_proof_watermark", "_CSETF-INFRNC-PROOF-WATERMARK", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_problem_working_time_data", "_CSETF-INFRNC-PROBLEM-WORKING-TIME-DATA", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_type", "_CSETF-INFRNC-TYPE", 2, 0, false);
    declareFunction(myName, "_csetf_infrnc_data", "_CSETF-INFRNC-DATA", 2, 0, false);
    declareFunction(myName, "make_inference", "MAKE-INFERENCE", 0, 1, false);
    declareFunction(myName, "valid_inference_p", "VALID-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "invalid_inference_p", "INVALID-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "inference_invalid_p", "INFERENCE-INVALID-P", 1, 0, false);
    declareFunction(myName, "print_inference", "PRINT-INFERENCE", 3, 0, false);
    declareFunction(myName, "sxhash_inference_method", "SXHASH-INFERENCE-METHOD", 1, 0, false); new $sxhash_inference_method$UnaryFunction();
    declareFunction(myName, "new_inference_p", "NEW-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "prepared_inference_p", "PREPARED-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "ready_inference_p", "READY-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "running_inference_p", "RUNNING-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "suspended_inference_p", "SUSPENDED-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "continuable_inference_p", "CONTINUABLE-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "exhausted_inference_p", "EXHAUSTED-INFERENCE-P", 1, 0, false);
    declareMacro(myName, "do_inference_relevant_problems", "DO-INFERENCE-RELEVANT-PROBLEMS");
    declareMacro(myName, "do_inference_new_answer_justifications", "DO-INFERENCE-NEW-ANSWER-JUSTIFICATIONS");
    declareMacro(myName, "do_inference_new_answers", "DO-INFERENCE-NEW-ANSWERS");
    declareMacro(myName, "do_inference_answers", "DO-INFERENCE-ANSWERS");
    declareMacro(myName, "do_inference_answers_from_index", "DO-INFERENCE-ANSWERS-FROM-INDEX");
    declareMacro(myName, "do_inference_justifications", "DO-INFERENCE-JUSTIFICATIONS");
    declareMacro(myName, "do_inference_interrupting_processes", "DO-INFERENCE-INTERRUPTING-PROCESSES");
    declareMacro(myName, "do_inference_root_proofs", "DO-INFERENCE-ROOT-PROOFS");
    declareMacro(myName, "do_inference_allowed_rules", "DO-INFERENCE-ALLOWED-RULES");
    declareMacro(myName, "with_inference_problem_working_time_lock", "WITH-INFERENCE-PROBLEM-WORKING-TIME-LOCK");
    declareFunction(myName, "new_inference", "NEW-INFERENCE", 1, 0, false);
    declareFunction(myName, "new_tautological_inference", "NEW-TAUTOLOGICAL-INFERENCE", 1, 0, false);
    declareFunction(myName, "destroy_all_inferences", "DESTROY-ALL-INFERENCES", 0, 0, false);
    declareFunction(myName, "destroy_inference", "DESTROY-INFERENCE", 1, 0, false);
    declareFunction(myName, "destroy_inference_and_problem_store", "DESTROY-INFERENCE-AND-PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "destroy_problem_store_inference", "DESTROY-PROBLEM-STORE-INFERENCE", 1, 0, false);
    declareFunction(myName, "destroy_inference_int", "DESTROY-INFERENCE-INT", 1, 0, false);
    declareFunction(myName, "note_inference_invalid", "NOTE-INFERENCE-INVALID", 1, 0, false);
    declareFunction(myName, "inference_suid", "INFERENCE-SUID", 1, 0, false);
    declareFunction(myName, "inference_problem_store", "INFERENCE-PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "inference_forward_propagate", "INFERENCE-FORWARD-PROPAGATE", 1, 0, false);
    declareFunction(myName, "inference_input_mt", "INFERENCE-INPUT-MT", 1, 0, false);
    declareFunction(myName, "inference_input_el_query", "INFERENCE-INPUT-EL-QUERY", 1, 0, false);
    declareFunction(myName, "inference_input_non_explanatory_el_query", "INFERENCE-INPUT-NON-EXPLANATORY-EL-QUERY", 1, 0, false);
    declareFunction(myName, "inference_input_query_properties", "INFERENCE-INPUT-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "inference_mt", "INFERENCE-MT", 1, 0, false);
    declareFunction(myName, "inference_el_query", "INFERENCE-EL-QUERY", 1, 0, false);
    declareFunction(myName, "inference_el_bindings", "INFERENCE-EL-BINDINGS", 1, 0, false);
    declareFunction(myName, "inference_hl_query", "INFERENCE-HL-QUERY", 1, 0, false);
    declareFunction(myName, "inference_explanatory_subquery", "INFERENCE-EXPLANATORY-SUBQUERY", 1, 0, false);
    declareFunction(myName, "inference_non_explanatory_subquery", "INFERENCE-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
    declareFunction(myName, "inference_free_hl_vars", "INFERENCE-FREE-HL-VARS", 1, 0, false);
    declareFunction(myName, "inference_hypothetical_bindings", "INFERENCE-HYPOTHETICAL-BINDINGS", 1, 0, false);
    declareFunction(myName, "inference_answer_id_index", "INFERENCE-ANSWER-ID-INDEX", 1, 0, false);
    declareFunction(myName, "inference_answer_bindings_index", "INFERENCE-ANSWER-BINDINGS-INDEX", 1, 0, false);
    declareFunction(myName, "inference_new_answer_id_start", "INFERENCE-NEW-ANSWER-ID-START", 1, 0, false);
    declareFunction(myName, "inference_new_answer_justifications", "INFERENCE-NEW-ANSWER-JUSTIFICATIONS", 1, 0, false);
    declareFunction(myName, "inference_status", "INFERENCE-STATUS", 1, 0, false);
    declareFunction(myName, "inference_suspend_status", "INFERENCE-SUSPEND-STATUS", 1, 0, false);
    declareFunction(myName, "inference_root_link", "INFERENCE-ROOT-LINK", 1, 0, false);
    declareFunction(myName, "inference_relevant_problems", "INFERENCE-RELEVANT-PROBLEMS", 1, 0, false);
    declareFunction(myName, "inference_strategy_set", "INFERENCE-STRATEGY-SET", 1, 0, false);
    declareFunction(myName, "inference_control_process", "INFERENCE-CONTROL-PROCESS", 1, 0, false);
    declareFunction(myName, "inference_interrupting_processes", "INFERENCE-INTERRUPTING-PROCESSES", 1, 0, false);
    declareFunction(myName, "inference_max_transformation_depth_reached", "INFERENCE-MAX-TRANSFORMATION-DEPTH-REACHED", 1, 0, false);
    declareFunction(myName, "inference_answer_language", "INFERENCE-ANSWER-LANGUAGE", 1, 0, false);
    declareFunction(myName, "inference_cache_resultsP", "INFERENCE-CACHE-RESULTS?", 1, 0, false);
    declareFunction(myName, "inference_blockingP", "INFERENCE-BLOCKING?", 1, 0, false);
    declareFunction(myName, "inference_disjunction_free_el_vars_policy", "INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
    declareFunction(myName, "inference_result_uniqueness_criterion", "INFERENCE-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
    declareFunction(myName, "inference_allow_hl_predicate_transformationP", "INFERENCE-ALLOW-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "inference_allow_unbound_predicate_transformationP", "INFERENCE-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "inference_allow_evaluatable_predicate_transformationP", "INFERENCE-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "inference_allow_indeterminate_resultsP", "INFERENCE-ALLOW-INDETERMINATE-RESULTS?", 1, 0, false);
    declareFunction(myName, "inference_allowed_rules", "INFERENCE-ALLOWED-RULES", 1, 0, false);
    declareFunction(myName, "inference_forbidden_rules", "INFERENCE-FORBIDDEN-RULES", 1, 0, false);
    declareFunction(myName, "inference_allowed_modules", "INFERENCE-ALLOWED-MODULES", 1, 0, false);
    declareFunction(myName, "inference_allow_abnormality_checkingP", "INFERENCE-ALLOW-ABNORMALITY-CHECKING?", 1, 0, false);
    declareFunction(myName, "inference_transitive_closure_mode", "INFERENCE-TRANSITIVE-CLOSURE-MODE", 1, 0, false);
    declareFunction(myName, "inference_problem_store_privateP", "INFERENCE-PROBLEM-STORE-PRIVATE?", 1, 0, false);
    declareFunction(myName, "inference_continuableP", "INFERENCE-CONTINUABLE?", 1, 0, false);
    declareFunction(myName, "inference_browsableP", "INFERENCE-BROWSABLE?", 1, 0, false);
    declareFunction(myName, "inference_return_type", "INFERENCE-RETURN-TYPE", 1, 0, false);
    declareFunction(myName, "inference_max_time", "INFERENCE-MAX-TIME", 1, 0, false);
    declareFunction(myName, "inference_max_step", "INFERENCE-MAX-STEP", 1, 0, false);
    declareFunction(myName, "inference_mode", "INFERENCE-MODE", 1, 0, false);
    declareFunction(myName, "inference_forward_max_time", "INFERENCE-FORWARD-MAX-TIME", 1, 0, false);
    declareFunction(myName, "inference_max_number", "INFERENCE-MAX-NUMBER", 1, 0, false);
    declareFunction(myName, "inference_max_proof_depth", "INFERENCE-MAX-PROOF-DEPTH", 1, 0, false);
    declareFunction(myName, "inference_max_transformation_depth", "INFERENCE-MAX-TRANSFORMATION-DEPTH", 1, 0, false);
    declareFunction(myName, "inference_probably_approximately_done", "INFERENCE-PROBABLY-APPROXIMATELY-DONE", 1, 0, false);
    declareFunction(myName, "inference_metrics_template", "INFERENCE-METRICS-TEMPLATE", 1, 0, false);
    declareFunction(myName, "inference_start_universal_time", "INFERENCE-START-UNIVERSAL-TIME", 1, 0, false);
    declareFunction(myName, "inference_start_internal_real_time", "INFERENCE-START-INTERNAL-REAL-TIME", 1, 0, false);
    declareFunction(myName, "inference_end_internal_real_time", "INFERENCE-END-INTERNAL-REAL-TIME", 1, 0, false);
    declareFunction(myName, "inference_pad_internal_real_time", "INFERENCE-PAD-INTERNAL-REAL-TIME", 1, 0, false);
    declareFunction(myName, "inference_cumulative_time", "INFERENCE-CUMULATIVE-TIME", 1, 0, false);
    declareFunction(myName, "inference_step_count", "INFERENCE-STEP-COUNT", 1, 0, false);
    declareFunction(myName, "inference_cumulative_step_count", "INFERENCE-CUMULATIVE-STEP-COUNT", 1, 0, false);
    declareFunction(myName, "inference_problem_working_time_data", "INFERENCE-PROBLEM-WORKING-TIME-DATA", 1, 0, false);
    declareFunction(myName, "inference_events", "INFERENCE-EVENTS", 1, 0, false);
    declareFunction(myName, "inference_accumulators", "INFERENCE-ACCUMULATORS", 1, 0, false);
    declareFunction(myName, "inference_proof_watermark", "INFERENCE-PROOF-WATERMARK", 1, 0, false);
    declareFunction(myName, "inference_type", "INFERENCE-TYPE", 1, 0, false);
    declareFunction(myName, "inference_data", "INFERENCE-DATA", 1, 0, false);
    declareFunction(myName, "set_inference_forward_propagate", "SET-INFERENCE-FORWARD-PROPAGATE", 2, 0, false);
    declareFunction(myName, "set_inference_input_mt", "SET-INFERENCE-INPUT-MT", 2, 0, false);
    declareFunction(myName, "set_inference_input_el_query", "SET-INFERENCE-INPUT-EL-QUERY", 2, 0, false);
    declareFunction(myName, "set_inference_input_non_explanatory_el_query", "SET-INFERENCE-INPUT-NON-EXPLANATORY-EL-QUERY", 2, 0, false);
    declareFunction(myName, "set_inference_input_query_properties", "SET-INFERENCE-INPUT-QUERY-PROPERTIES", 2, 0, false);
    declareFunction(myName, "set_inference_mt", "SET-INFERENCE-MT", 2, 0, false);
    declareFunction(myName, "set_inference_el_query", "SET-INFERENCE-EL-QUERY", 2, 0, false);
    declareFunction(myName, "set_inference_el_bindings", "SET-INFERENCE-EL-BINDINGS", 2, 0, false);
    declareFunction(myName, "set_inference_hl_query", "SET-INFERENCE-HL-QUERY", 2, 0, false);
    declareFunction(myName, "set_inference_explanatory_subquery", "SET-INFERENCE-EXPLANATORY-SUBQUERY", 2, 0, false);
    declareFunction(myName, "set_inference_non_explanatory_subquery", "SET-INFERENCE-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
    declareFunction(myName, "set_inference_free_hl_vars", "SET-INFERENCE-FREE-HL-VARS", 2, 0, false);
    declareFunction(myName, "set_inference_hypothetical_bindings", "SET-INFERENCE-HYPOTHETICAL-BINDINGS", 2, 0, false);
    declareFunction(myName, "set_inference_status", "SET-INFERENCE-STATUS", 2, 0, false);
    declareFunction(myName, "set_inference_suspend_status", "SET-INFERENCE-SUSPEND-STATUS", 2, 0, false);
    declareFunction(myName, "set_inference_root_link", "SET-INFERENCE-ROOT-LINK", 2, 0, false);
    declareFunction(myName, "set_inference_control_process", "SET-INFERENCE-CONTROL-PROCESS", 2, 0, false);
    declareFunction(myName, "set_inference_max_transformation_depth_reached", "SET-INFERENCE-MAX-TRANSFORMATION-DEPTH-REACHED", 2, 0, false);
    declareFunction(myName, "set_inference_disjunction_free_el_vars_policy", "SET-INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY", 2, 0, false);
    declareFunction(myName, "set_inference_result_uniqueness_criterion", "SET-INFERENCE-RESULT-UNIQUENESS-CRITERION", 2, 0, false);
    declareFunction(myName, "set_inference_allow_hl_predicate_transformation", "SET-INFERENCE-ALLOW-HL-PREDICATE-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_inference_allow_unbound_predicate_transformation", "SET-INFERENCE-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_inference_allow_evaluatable_predicate_transformation", "SET-INFERENCE-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_inference_allow_indeterminate_results", "SET-INFERENCE-ALLOW-INDETERMINATE-RESULTS", 2, 0, false);
    declareFunction(myName, "set_inference_allowed_rules", "SET-INFERENCE-ALLOWED-RULES", 2, 0, false);
    declareFunction(myName, "set_inference_forbidden_rules", "SET-INFERENCE-FORBIDDEN-RULES", 2, 0, false);
    declareFunction(myName, "set_inference_allowed_modules", "SET-INFERENCE-ALLOWED-MODULES", 2, 0, false);
    declareFunction(myName, "set_inference_allow_abnormality_checking", "SET-INFERENCE-ALLOW-ABNORMALITY-CHECKING", 2, 0, false);
    declareFunction(myName, "set_inference_transitive_closure_mode", "SET-INFERENCE-TRANSITIVE-CLOSURE-MODE", 2, 0, false);
    declareFunction(myName, "set_inference_problem_store_private", "SET-INFERENCE-PROBLEM-STORE-PRIVATE", 2, 0, false);
    declareFunction(myName, "set_inference_continuable", "SET-INFERENCE-CONTINUABLE", 2, 0, false);
    declareFunction(myName, "set_inference_browsable", "SET-INFERENCE-BROWSABLE", 2, 0, false);
    declareFunction(myName, "set_inference_return_type", "SET-INFERENCE-RETURN-TYPE", 2, 0, false);
    declareFunction(myName, "set_inference_answer_language", "SET-INFERENCE-ANSWER-LANGUAGE", 2, 0, false);
    declareFunction(myName, "set_inference_cache_results", "SET-INFERENCE-CACHE-RESULTS", 2, 0, false);
    declareFunction(myName, "note_inference_blocking", "NOTE-INFERENCE-BLOCKING", 1, 0, false);
    declareFunction(myName, "clear_inference_blocking", "CLEAR-INFERENCE-BLOCKING", 1, 0, false);
    declareFunction(myName, "set_inference_max_number", "SET-INFERENCE-MAX-NUMBER", 2, 0, false);
    declareFunction(myName, "set_inference_max_time", "SET-INFERENCE-MAX-TIME", 2, 0, false);
    declareFunction(myName, "set_inference_max_step", "SET-INFERENCE-MAX-STEP", 2, 0, false);
    declareFunction(myName, "set_inference_mode", "SET-INFERENCE-MODE", 2, 0, false);
    declareFunction(myName, "set_inference_forward_max_time", "SET-INFERENCE-FORWARD-MAX-TIME", 2, 0, false);
    declareFunction(myName, "set_inference_max_proof_depth", "SET-INFERENCE-MAX-PROOF-DEPTH", 2, 0, false);
    declareFunction(myName, "set_inference_max_transformation_depth", "SET-INFERENCE-MAX-TRANSFORMATION-DEPTH", 2, 0, false);
    declareFunction(myName, "set_inference_probably_approximately_done", "SET-INFERENCE-PROBABLY-APPROXIMATELY-DONE", 2, 0, false);
    declareFunction(myName, "set_inference_metrics_template", "SET-INFERENCE-METRICS-TEMPLATE", 2, 0, false);
    declareFunction(myName, "set_inference_start_universal_time", "SET-INFERENCE-START-UNIVERSAL-TIME", 2, 0, false);
    declareFunction(myName, "set_inference_start_internal_real_time", "SET-INFERENCE-START-INTERNAL-REAL-TIME", 2, 0, false);
    declareFunction(myName, "set_inference_end_internal_real_time", "SET-INFERENCE-END-INTERNAL-REAL-TIME", 2, 0, false);
    declareFunction(myName, "set_inference_pad_internal_real_time", "SET-INFERENCE-PAD-INTERNAL-REAL-TIME", 2, 0, false);
    declareFunction(myName, "set_inference_cumulative_time", "SET-INFERENCE-CUMULATIVE-TIME", 2, 0, false);
    declareFunction(myName, "set_inference_step_count", "SET-INFERENCE-STEP-COUNT", 2, 0, false);
    declareFunction(myName, "increment_inference_step_count", "INCREMENT-INFERENCE-STEP-COUNT", 1, 0, false);
    declareFunction(myName, "set_inference_cumulative_step_count", "SET-INFERENCE-CUMULATIVE-STEP-COUNT", 2, 0, false);
    declareFunction(myName, "increment_inference_cumulative_step_count", "INCREMENT-INFERENCE-CUMULATIVE-STEP-COUNT", 1, 0, false);
    declareFunction(myName, "set_inference_problem_working_time_data", "SET-INFERENCE-PROBLEM-WORKING-TIME-DATA", 2, 0, false);
    declareFunction(myName, "set_inference_events", "SET-INFERENCE-EVENTS", 2, 0, false);
    declareFunction(myName, "set_inference_halt_conditions", "SET-INFERENCE-HALT-CONDITIONS", 2, 0, false);
    declareFunction(myName, "set_inference_type", "SET-INFERENCE-TYPE", 2, 0, false);
    declareFunction(myName, "set_inference_data", "SET-INFERENCE-DATA", 2, 0, false);
    declareFunction(myName, "inference_ids", "INFERENCE-IDS", 1, 0, false);
    declareMacro(myName, "with_inference_ids", "WITH-INFERENCE-IDS");
    declareFunction(myName, "inference_problem_store_suid", "INFERENCE-PROBLEM-STORE-SUID", 1, 0, false);
    declareFunction(myName, "all_inferences", "ALL-INFERENCES", 0, 0, false);
    declareFunction(myName, "inference_strategies", "INFERENCE-STRATEGIES", 1, 0, false);
    declareFunction(myName, "inference_hl_mts", "INFERENCE-HL-MTS", 1, 0, false);
    declareFunction(myName, "inference_first_hl_query_mt", "INFERENCE-FIRST-HL-QUERY-MT", 1, 0, false);
    declareFunction(myName, "inference_no_free_hl_varsP", "INFERENCE-NO-FREE-HL-VARS?", 1, 0, false);
    declareFunction(myName, "inference_free_el_vars", "INFERENCE-FREE-EL-VARS", 1, 0, false);
    declareFunction(myName, "inference_input_query_property", "INFERENCE-INPUT-QUERY-PROPERTY", 2, 1, false);
    declareFunction(myName, "inference_to_new_cyc_query_arguments", "INFERENCE-TO-NEW-CYC-QUERY-ARGUMENTS", 1, 0, false);
    declareFunction(myName, "inference_to_new_cyc_query_form", "INFERENCE-TO-NEW-CYC-QUERY-FORM", 1, 0, false);
    declareFunction(myName, "inference_to_new_cyc_query_form_string", "INFERENCE-TO-NEW-CYC-QUERY-FORM-STRING", 1, 0, false);
    declareFunction(myName, "inference_args_to_new_cyc_query_form_string", "INFERENCE-ARGS-TO-NEW-CYC-QUERY-FORM-STRING", 3, 0, false);
    declareFunction(myName, "inference_root_mapped_problem", "INFERENCE-ROOT-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "inference_root_problem", "INFERENCE-ROOT-PROBLEM", 1, 0, false);
    declareFunction(myName, "inference_unique_wrt_proofsP", "INFERENCE-UNIQUE-WRT-PROOFS?", 1, 0, false);
    declareFunction(myName, "inference_unique_wrt_bindingsP", "INFERENCE-UNIQUE-WRT-BINDINGS?", 1, 0, false);
    declareFunction(myName, "inference_compute_answer_justificationsP", "INFERENCE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
    declareFunction(myName, "inference_computes_metricsP", "INFERENCE-COMPUTES-METRICS?", 1, 0, false);
    declareFunction(myName, "inference_computes_metricP", "INFERENCE-COMPUTES-METRIC?", 2, 0, false);
    declareFunction(myName, "inference_problem_store_private_wrt_dynamic_propertiesP", "INFERENCE-PROBLEM-STORE-PRIVATE-WRT-DYNAMIC-PROPERTIES?", 1, 0, false);
    declareFunction(myName, "inference_dynamic_properties_exhaustiveP", "INFERENCE-DYNAMIC-PROPERTIES-EXHAUSTIVE?", 1, 0, false);
    declareFunction(myName, "inference_allows_use_of_all_rulesP", "INFERENCE-ALLOWS-USE-OF-ALL-RULES?", 1, 0, false);
    declareFunction(myName, "inference_allows_use_of_ruleP", "INFERENCE-ALLOWS-USE-OF-RULE?", 2, 0, false);
    declareFunction(myName, "inference_filter_rules", "INFERENCE-FILTER-RULES", 2, 0, false);
    declareFunction(myName, "inference_allows_use_of_all_modulesP", "INFERENCE-ALLOWS-USE-OF-ALL-MODULES?", 1, 0, false);
    declareFunction(myName, "inference_allows_use_of_moduleP", "INFERENCE-ALLOWS-USE-OF-MODULE?", 2, 0, false);
    declareFunction(myName, "inference_forget_extra_resultsP", "INFERENCE-FORGET-EXTRA-RESULTS?", 1, 0, false);
    declareFunction(myName, "inference_has_some_answerP", "INFERENCE-HAS-SOME-ANSWER?", 1, 0, false);
    declareFunction(myName, "find_inference_answer_by_id", "FIND-INFERENCE-ANSWER-BY-ID", 2, 0, false);
    declareFunction(myName, "find_inference_answer_by_ids", "FIND-INFERENCE-ANSWER-BY-IDS", 3, 0, false);
    declareFunction(myName, "inference_first_answer", "INFERENCE-FIRST-ANSWER", 1, 0, false);
    declareFunction(myName, "inference_last_answer", "INFERENCE-LAST-ANSWER", 1, 0, false);
    declareFunction(myName, "inference_first_answer_elapsed_time", "INFERENCE-FIRST-ANSWER-ELAPSED-TIME", 1, 0, false);
    declareFunction(myName, "inference_first_answer_step_count", "INFERENCE-FIRST-ANSWER-STEP-COUNT", 1, 0, false);
    declareFunction(myName, "inference_last_answer_elapsed_time", "INFERENCE-LAST-ANSWER-ELAPSED-TIME", 1, 0, false);
    declareFunction(myName, "inference_last_answer_step_count", "INFERENCE-LAST-ANSWER-STEP-COUNT", 1, 0, false);
    declareFunction(myName, "inference_answer_count_at_elapsed_time", "INFERENCE-ANSWER-COUNT-AT-ELAPSED-TIME", 2, 0, false);
    declareFunction(myName, "inference_answer_count_at_30_seconds", "INFERENCE-ANSWER-COUNT-AT-30-SECONDS", 1, 0, false);
    declareFunction(myName, "inference_answer_count_at_60_seconds", "INFERENCE-ANSWER-COUNT-AT-60-SECONDS", 1, 0, false);
    declareFunction(myName, "inference_answer_times", "INFERENCE-ANSWER-TIMES", 1, 0, false);
    declareFunction(myName, "inference_answer_step_counts", "INFERENCE-ANSWER-STEP-COUNTS", 1, 0, false);
    declareFunction(myName, "inference_end_universal_time", "INFERENCE-END-UNIVERSAL-TIME", 1, 0, false);
    declareFunction(myName, "inference_maintain_term_working_setP", "INFERENCE-MAINTAIN-TERM-WORKING-SET?", 1, 0, false);
    declareFunction(myName, "inference_halt_condition_presentP", "INFERENCE-HALT-CONDITION-PRESENT?", 2, 0, false);
    declareFunction(myName, "add_inference_accumulator", "ADD-INFERENCE-ACCUMULATOR", 3, 0, false);
    declareFunction(myName, "inference_accumulator", "INFERENCE-ACCUMULATOR", 2, 0, false);
    declareFunction(myName, "inference_accumulator_contents", "INFERENCE-ACCUMULATOR-CONTENTS", 2, 0, false);
    declareFunction(myName, "inference_accumulate", "INFERENCE-ACCUMULATE", 3, 0, false);
    declareFunction(myName, "set_inference_proof_watermark", "SET-INFERENCE-PROOF-WATERMARK", 2, 0, false);
    declareFunction(myName, "compute_inference_pad_internal_real_time", "COMPUTE-INFERENCE-PAD-INTERNAL-REAL-TIME", 1, 0, false);
    declareFunction(myName, "initialize_pad_table", "INITIALIZE-PAD-TABLE", 1, 0, false);
    declareFunction(myName, "pad_table_initializedP", "PAD-TABLE-INITIALIZED?", 0, 0, false);
    declareFunction(myName, "probably_approximately_done_cutoff_time", "PROBABLY-APPROXIMATELY-DONE-CUTOFF-TIME", 1, 0, false);
    declareFunction(myName, "compute_pad_from_time", "COMPUTE-PAD-FROM-TIME", 1, 0, false);
    declareFunction(myName, "inference_note_transformation_depth", "INFERENCE-NOTE-TRANSFORMATION-DEPTH", 2, 0, false);
    declareFunction(myName, "inference_note_new_transformation_depth_reached", "INFERENCE-NOTE-NEW-TRANSFORMATION-DEPTH-REACHED", 2, 0, false);
    declareFunction(myName, "find_inference_answer_by_bindings", "FIND-INFERENCE-ANSWER-BY-BINDINGS", 2, 0, false);
    declareFunction(myName, "new_inference_answer_id", "NEW-INFERENCE-ANSWER-ID", 1, 0, false);
    declareFunction(myName, "inference_all_answers", "INFERENCE-ALL-ANSWERS", 1, 0, false);
    declareFunction(myName, "inference_all_new_answers", "INFERENCE-ALL-NEW-ANSWERS", 1, 0, false);
    declareFunction(myName, "inference_allowed_rules_list", "INFERENCE-ALLOWED-RULES-LIST", 1, 0, false);
    declareFunction(myName, "inference_allowed_rule_count", "INFERENCE-ALLOWED-RULE-COUNT", 1, 0, false);
    declareFunction(myName, "inference_forbidden_rules_list", "INFERENCE-FORBIDDEN-RULES-LIST", 1, 0, false);
    declareFunction(myName, "inference_forbidden_rule_count", "INFERENCE-FORBIDDEN-RULE-COUNT", 1, 0, false);
    declareFunction(myName, "inference_interrupt_signaledP", "INFERENCE-INTERRUPT-SIGNALED?", 1, 0, false);
    declareFunction(myName, "inference_no_interrupt_signaledP", "INFERENCE-NO-INTERRUPT-SIGNALED?", 1, 0, false);
    declareFunction(myName, "inference_interrupt_handledP", "INFERENCE-INTERRUPT-HANDLED?", 1, 0, false);
    declareFunction(myName, "inference_answer_count", "INFERENCE-ANSWER-COUNT", 1, 0, false);
    declareFunction(myName, "inference_new_answer_count", "INFERENCE-NEW-ANSWER-COUNT", 1, 0, false);
    declareFunction(myName, "inference_new_justification_count", "INFERENCE-NEW-JUSTIFICATION-COUNT", 1, 0, false);
    declareFunction(myName, "inference_new_result_count", "INFERENCE-NEW-RESULT-COUNT", 1, 0, false);
    declareFunction(myName, "forward_inference_p", "FORWARD-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "backward_inference_p", "BACKWARD-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "abductive_inference_p", "ABDUCTIVE-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "inference_provability_status", "INFERENCE-PROVABILITY-STATUS", 1, 0, false);
    declareFunction(myName, "good_inference_p", "GOOD-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "neutral_inference_p", "NEUTRAL-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "no_good_inference_p", "NO-GOOD-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "closed_inference_p", "CLOSED-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "inference_set_static_properties", "INFERENCE-SET-STATIC-PROPERTIES", 2, 0, false);
    declareFunction(myName, "update_inference_input_query_properties", "UPDATE-INFERENCE-INPUT-QUERY-PROPERTIES", 2, 0, false);
    declareFunction(myName, "add_inference_relevant_problem", "ADD-INFERENCE-RELEVANT-PROBLEM", 2, 0, false);
    declareFunction(myName, "remove_inference_relevant_problem", "REMOVE-INFERENCE-RELEVANT-PROBLEM", 2, 0, false);
    declareFunction(myName, "clear_inference_relevant_problems", "CLEAR-INFERENCE-RELEVANT-PROBLEMS", 1, 0, false);
    declareFunction(myName, "add_inference_strategy", "ADD-INFERENCE-STRATEGY", 2, 0, false);
    declareFunction(myName, "remove_inference_strategy", "REMOVE-INFERENCE-STRATEGY", 2, 0, false);
    declareFunction(myName, "clear_inference_strategy_set", "CLEAR-INFERENCE-STRATEGY-SET", 1, 0, false);
    declareFunction(myName, "reset_inference_new_answer_id", "RESET-INFERENCE-NEW-ANSWER-ID", 1, 0, false);
    declareFunction(myName, "inference_next_new_answer_id", "INFERENCE-NEXT-NEW-ANSWER-ID", 1, 0, false);
    declareFunction(myName, "add_inference_new_answer_by_id", "ADD-INFERENCE-NEW-ANSWER-BY-ID", 2, 0, false);
    declareFunction(myName, "remove_inference_new_answer_by_id", "REMOVE-INFERENCE-NEW-ANSWER-BY-ID", 2, 0, false);
    declareFunction(myName, "add_inference_new_answer_by_bindings", "ADD-INFERENCE-NEW-ANSWER-BY-BINDINGS", 2, 0, false);
    declareFunction(myName, "remove_inference_new_answer_by_bindings", "REMOVE-INFERENCE-NEW-ANSWER-BY-BINDINGS", 2, 0, false);
    declareFunction(myName, "reset_inference_new_answer_justifications", "RESET-INFERENCE-NEW-ANSWER-JUSTIFICATIONS", 1, 0, false);
    declareFunction(myName, "add_inference_new_answer_justification", "ADD-INFERENCE-NEW-ANSWER-JUSTIFICATION", 2, 0, false);
    declareFunction(myName, "remove_inference_new_answer_justification", "REMOVE-INFERENCE-NEW-ANSWER-JUSTIFICATION", 2, 0, false);
    declareFunction(myName, "clear_inference_control_process", "CLEAR-INFERENCE-CONTROL-PROCESS", 1, 0, false);
    declareFunction(myName, "set_inference_control_process_to_me", "SET-INFERENCE-CONTROL-PROCESS-TO-ME", 1, 0, false);
    declareFunction(myName, "note_inference_interrupt_signaled", "NOTE-INFERENCE-INTERRUPT-SIGNALED", 2, 0, false);
    declareFunction(myName, "increment_inference_cumulative_time", "INCREMENT-INFERENCE-CUMULATIVE-TIME", 2, 0, false);
    declareFunction(myName, "reorder_inference_free_hl_vars", "REORDER-INFERENCE-FREE-HL-VARS", 2, 0, false);
    declareFunction(myName, "reorder_inference_free_el_vars", "REORDER-INFERENCE-FREE-EL-VARS", 2, 0, false);
    declareFunction(myName, "reset_inference_new_answers", "RESET-INFERENCE-NEW-ANSWERS", 1, 0, false);
    declareFunction(myName, "add_inference_new_answer", "ADD-INFERENCE-NEW-ANSWER", 2, 0, false);
    declareFunction(myName, "remove_inference_new_answer", "REMOVE-INFERENCE-NEW-ANSWER", 2, 0, false);
    declareFunction(myName, "initialize_inference_time_properties", "INITIALIZE-INFERENCE-TIME-PROPERTIES", 1, 0, false);
    declareFunction(myName, "finalize_inference_time_properties", "FINALIZE-INFERENCE-TIME-PROPERTIES", 1, 0, false);
    declareFunction(myName, "inference_elapsed_internal_real_time_since_start", "INFERENCE-ELAPSED-INTERNAL-REAL-TIME-SINCE-START", 1, 0, false);
    declareFunction(myName, "inference_elapsed_universal_time_since_start", "INFERENCE-ELAPSED-UNIVERSAL-TIME-SINCE-START", 1, 0, false);
    declareFunction(myName, "inference_time_so_far", "INFERENCE-TIME-SO-FAR", 1, 1, false);
    declareFunction(myName, "inference_remaining_time", "INFERENCE-REMAINING-TIME", 1, 1, false);
    declareFunction(myName, "inference_cumulative_time_so_far", "INFERENCE-CUMULATIVE-TIME-SO-FAR", 1, 1, false);
    declareFunction(myName, "inference_signal_interrupt", "INFERENCE-SIGNAL-INTERRUPT", 1, 0, false);
    declareFunction(myName, "inference_handle_interrupts", "INFERENCE-HANDLE-INTERRUPTS", 1, 0, false);
    declareFunction(myName, "simplest_inference_p", "SIMPLEST-INFERENCE-P", 1, 0, false);
    declareFunction(myName, "new_simplest_inference", "NEW-SIMPLEST-INFERENCE", 1, 0, false);
    declareFunction(myName, "simplest_inference_strategy", "SIMPLEST-INFERENCE-STRATEGY", 1, 0, false);
    declareFunction(myName, "set_simplest_inference_strategy", "SET-SIMPLEST-INFERENCE-STRATEGY", 2, 0, false);
    declareFunction(myName, "new_simplest_inference_of_type", "NEW-SIMPLEST-INFERENCE-OF-TYPE", 2, 0, false);
    declareFunction(myName, "new_simplest_inference_with_new_store", "NEW-SIMPLEST-INFERENCE-WITH-NEW-STORE", 1, 0, false);
    declareFunction(myName, "inference_answer_print_function_trampoline", "INFERENCE-ANSWER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "inference_answer_p", "INFERENCE-ANSWER-P", 1, 0, false); new $inference_answer_p$UnaryFunction();
    declareFunction(myName, "inf_answer_suid", "INF-ANSWER-SUID", 1, 0, false);
    declareFunction(myName, "inf_answer_inference", "INF-ANSWER-INFERENCE", 1, 0, false);
    declareFunction(myName, "inf_answer_bindings", "INF-ANSWER-BINDINGS", 1, 0, false);
    declareFunction(myName, "inf_answer_justifications", "INF-ANSWER-JUSTIFICATIONS", 1, 0, false);
    declareFunction(myName, "inf_answer_elapsed_creation_time", "INF-ANSWER-ELAPSED-CREATION-TIME", 1, 0, false);
    declareFunction(myName, "inf_answer_step_count", "INF-ANSWER-STEP-COUNT", 1, 0, false);
    declareFunction(myName, "_csetf_inf_answer_suid", "_CSETF-INF-ANSWER-SUID", 2, 0, false);
    declareFunction(myName, "_csetf_inf_answer_inference", "_CSETF-INF-ANSWER-INFERENCE", 2, 0, false);
    declareFunction(myName, "_csetf_inf_answer_bindings", "_CSETF-INF-ANSWER-BINDINGS", 2, 0, false);
    declareFunction(myName, "_csetf_inf_answer_justifications", "_CSETF-INF-ANSWER-JUSTIFICATIONS", 2, 0, false);
    declareFunction(myName, "_csetf_inf_answer_elapsed_creation_time", "_CSETF-INF-ANSWER-ELAPSED-CREATION-TIME", 2, 0, false);
    declareFunction(myName, "_csetf_inf_answer_step_count", "_CSETF-INF-ANSWER-STEP-COUNT", 2, 0, false);
    declareFunction(myName, "make_inference_answer", "MAKE-INFERENCE-ANSWER", 0, 1, false);
    declareFunction(myName, "valid_inference_answer_p", "VALID-INFERENCE-ANSWER-P", 1, 0, false);
    declareFunction(myName, "inference_answer_invalid_p", "INFERENCE-ANSWER-INVALID-P", 1, 0, false);
    declareFunction(myName, "print_inference_answer", "PRINT-INFERENCE-ANSWER", 3, 0, false);
    declareFunction(myName, "sxhash_inference_answer_method", "SXHASH-INFERENCE-ANSWER-METHOD", 1, 0, false);
    declareFunction(myName, "new_inference_answer", "NEW-INFERENCE-ANSWER", 2, 0, false);
    declareFunction(myName, "find_or_create_inference_answer", "FIND-OR-CREATE-INFERENCE-ANSWER", 2, 0, false);
    declareMacro(myName, "do_inference_answer_justifications", "DO-INFERENCE-ANSWER-JUSTIFICATIONS");
    declareMacro(myName, "do_inference_answer_justifications_numbered", "DO-INFERENCE-ANSWER-JUSTIFICATIONS-NUMBERED");
    declareFunction(myName, "destroy_inference_answer", "DESTROY-INFERENCE-ANSWER", 1, 0, false);
    declareFunction(myName, "destroy_inference_answer_int", "DESTROY-INFERENCE-ANSWER-INT", 1, 0, false);
    declareFunction(myName, "note_inference_answer_invalid", "NOTE-INFERENCE-ANSWER-INVALID", 1, 0, false);
    declareFunction(myName, "inference_answer_suid", "INFERENCE-ANSWER-SUID", 1, 0, false);
    declareFunction(myName, "inference_answer_inference", "INFERENCE-ANSWER-INFERENCE", 1, 0, false);
    declareFunction(myName, "inference_answer_bindings", "INFERENCE-ANSWER-BINDINGS", 1, 0, false);
    declareFunction(myName, "inference_answer_justifications", "INFERENCE-ANSWER-JUSTIFICATIONS", 1, 0, false);
    declareFunction(myName, "inference_answer_elapsed_creation_time", "INFERENCE-ANSWER-ELAPSED-CREATION-TIME", 1, 0, false);
    declareFunction(myName, "inference_answer_step_count", "INFERENCE-ANSWER-STEP-COUNT", 1, 0, false);
    declareFunction(myName, "set_inference_answer_bindings", "SET-INFERENCE-ANSWER-BINDINGS", 2, 0, false);
    declareFunction(myName, "set_inference_answer_elapsed_creation_time", "SET-INFERENCE-ANSWER-ELAPSED-CREATION-TIME", 2, 0, false);
    declareFunction(myName, "set_inference_answer_step_count", "SET-INFERENCE-ANSWER-STEP-COUNT", 2, 0, false);
    declareFunction(myName, "inference_answer_problem_store", "INFERENCE-ANSWER-PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "inference_answer_free_el_vars", "INFERENCE-ANSWER-FREE-EL-VARS", 1, 0, false);
    declareFunction(myName, "inference_answer_elapsed_time", "INFERENCE-ANSWER-ELAPSED-TIME", 1, 1, false);
    declareFunction(myName, "inference_answer_creation_time", "INFERENCE-ANSWER-CREATION-TIME", 1, 0, false);
    declareFunction(myName, "find_inference_answer_justification", "FIND-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false);
    declareFunction(myName, "inference_answer_result_bindings", "INFERENCE-ANSWER-RESULT-BINDINGS", 1, 0, false);
    declareFunction(myName, "inference_answer_bindings_equalP", "INFERENCE-ANSWER-BINDINGS-EQUAL?", 2, 0, false);
    declareFunction(myName, "inference_answer_newP", "INFERENCE-ANSWER-NEW?", 1, 0, false);
    declareFunction(myName, "inference_answer_L", "INFERENCE-ANSWER-<", 2, 0, false);
    declareFunction(myName, "inference_answer_el_sentence", "INFERENCE-ANSWER-EL-SENTENCE", 1, 0, false);
    declareFunction(myName, "add_inference_answer_justification", "ADD-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false);
    declareFunction(myName, "remove_inference_answer_justification", "REMOVE-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false);
    declareFunction(myName, "initialize_inference_answer_elapsed_creation_time", "INITIALIZE-INFERENCE-ANSWER-ELAPSED-CREATION-TIME", 1, 0, false);
    declareFunction(myName, "inference_answer_justification_print_function_trampoline", "INFERENCE-ANSWER-JUSTIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "inference_answer_justification_p", "INFERENCE-ANSWER-JUSTIFICATION-P", 1, 0, false); new $inference_answer_justification_p$UnaryFunction();
    declareFunction(myName, "inf_ans_just_answer", "INF-ANS-JUST-ANSWER", 1, 0, false);
    declareFunction(myName, "inf_ans_just_supports", "INF-ANS-JUST-SUPPORTS", 1, 0, false);
    declareFunction(myName, "inf_ans_just_proofs", "INF-ANS-JUST-PROOFS", 1, 0, false);
    declareFunction(myName, "_csetf_inf_ans_just_answer", "_CSETF-INF-ANS-JUST-ANSWER", 2, 0, false);
    declareFunction(myName, "_csetf_inf_ans_just_supports", "_CSETF-INF-ANS-JUST-SUPPORTS", 2, 0, false);
    declareFunction(myName, "_csetf_inf_ans_just_proofs", "_CSETF-INF-ANS-JUST-PROOFS", 2, 0, false);
    declareFunction(myName, "make_inference_answer_justification", "MAKE-INFERENCE-ANSWER-JUSTIFICATION", 0, 1, false);
    declareFunction(myName, "valid_inference_answer_justification_p", "VALID-INFERENCE-ANSWER-JUSTIFICATION-P", 1, 0, false);
    declareFunction(myName, "inference_answer_justification_invalid_p", "INFERENCE-ANSWER-JUSTIFICATION-INVALID-P", 1, 0, false);
    declareFunction(myName, "print_inference_answer_justification", "PRINT-INFERENCE-ANSWER-JUSTIFICATION", 3, 0, false);
    declareFunction(myName, "sxhash_inference_answer_justification_method", "SXHASH-INFERENCE-ANSWER-JUSTIFICATION-METHOD", 1, 0, false);
    declareFunction(myName, "list_of_inference_answer_justification_p", "LIST-OF-INFERENCE-ANSWER-JUSTIFICATION-P", 1, 0, false);
    declareFunction(myName, "new_inference_answer_justification", "NEW-INFERENCE-ANSWER-JUSTIFICATION", 2, 0, false);
    declareFunction(myName, "find_or_create_inference_answer_justification", "FIND-OR-CREATE-INFERENCE-ANSWER-JUSTIFICATION", 3, 0, false);
    declareFunction(myName, "destroy_inference_answer_justification", "DESTROY-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false);
    declareFunction(myName, "destroy_inference_answer_justification_int", "DESTROY-INFERENCE-ANSWER-JUSTIFICATION-INT", 1, 0, false);
    declareFunction(myName, "note_inference_answer_justification_invalid", "NOTE-INFERENCE-ANSWER-JUSTIFICATION-INVALID", 1, 0, false);
    declareFunction(myName, "inference_answer_justification_answer", "INFERENCE-ANSWER-JUSTIFICATION-ANSWER", 1, 0, false);
    declareFunction(myName, "inference_answer_justification_supports", "INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS", 1, 0, false); new $inference_answer_justification_supports$UnaryFunction();
    declareFunction(myName, "inference_answer_justification_proofs", "INFERENCE-ANSWER-JUSTIFICATION-PROOFS", 1, 0, false);
    declareMacro(myName, "do_inference_answer_justification_proofs", "DO-INFERENCE-ANSWER-JUSTIFICATION-PROOFS");
    declareMacro(myName, "do_proof_dependent_inference_answer_justifications", "DO-PROOF-DEPENDENT-INFERENCE-ANSWER-JUSTIFICATIONS");
    declareMacro(myName, "do_inference_all_subproofs", "DO-INFERENCE-ALL-SUBPROOFS");
    declareFunction(myName, "inference_answer_first_justification", "INFERENCE-ANSWER-FIRST-JUSTIFICATION", 1, 0, false);
    declareFunction(myName, "inference_answer_justification_first_proof", "INFERENCE-ANSWER-JUSTIFICATION-FIRST-PROOF", 1, 0, false);
    declareFunction(myName, "inference_first_proof", "INFERENCE-FIRST-PROOF", 1, 0, false);
    declareFunction(myName, "inference_answer_justification_inference", "INFERENCE-ANSWER-JUSTIFICATION-INFERENCE", 1, 0, false);
    declareFunction(myName, "inference_answer_justification_store", "INFERENCE-ANSWER-JUSTIFICATION-STORE", 1, 0, false);
    declareFunction(myName, "inference_answer_justification_rules", "INFERENCE-ANSWER-JUSTIFICATION-RULES", 1, 0, false);
    declareFunction(myName, "add_inference_answer_justification_proof", "ADD-INFERENCE-ANSWER-JUSTIFICATION-PROOF", 2, 0, false);
    declareFunction(myName, "new_inference_answer_justification_from_proof", "NEW-INFERENCE-ANSWER-JUSTIFICATION-FROM-PROOF", 3, 0, false);
    declareFunction(myName, "inference_answer_justification_to_tms_deduction_spec", "INFERENCE-ANSWER-JUSTIFICATION-TO-TMS-DEDUCTION-SPEC", 2, 0, false);
    declareFunction(myName, "inference_answer_justification_to_true_tms_deduction_spec", "INFERENCE-ANSWER-JUSTIFICATION-TO-TRUE-TMS-DEDUCTION-SPEC", 1, 0, false);
    declareFunction(myName, "inference_answer_justification_to_false_tms_deduction_spec", "INFERENCE-ANSWER-JUSTIFICATION-TO-FALSE-TMS-DEDUCTION-SPEC", 1, 0, false);
    declareFunction(myName, "destroy_proof_inference_answer_justifications", "DESTROY-PROOF-INFERENCE-ANSWER-JUSTIFICATIONS", 1, 0, false);
    declareFunction(myName, "inference_time_per_answer", "INFERENCE-TIME-PER-ANSWER", 1, 0, false);
    declareFunction(myName, "inference_steps_per_answer", "INFERENCE-STEPS-PER-ANSWER", 1, 0, false);
    declareFunction(myName, "inference_wasted_time_after_last_answer", "INFERENCE-WASTED-TIME-AFTER-LAST-ANSWER", 1, 0, false);
    declareFunction(myName, "inference_latency_improvement_from_iterativity", "INFERENCE-LATENCY-IMPROVEMENT-FROM-ITERATIVITY", 1, 0, false);
    declareFunction(myName, "inference_compute_metrics", "INFERENCE-COMPUTE-METRICS", 1, 0, false);
    declareFunction(myName, "inference_compute_metrics_plist", "INFERENCE-COMPUTE-METRICS-PLIST", 2, 0, false);
    declareFunction(myName, "inference_compute_metrics_alist", "INFERENCE-COMPUTE-METRICS-ALIST", 2, 0, false);
    declareFunction(myName, "inference_transformation_rules_in_answers", "INFERENCE-TRANSFORMATION-RULES-IN-ANSWERS", 1, 0, false);
    declareFunction(myName, "inference_all_answer_proofs", "INFERENCE-ALL-ANSWER-PROOFS", 1, 0, false);
    declareFunction(myName, "inference_all_answer_subproofs", "INFERENCE-ALL-ANSWER-SUBPROOFS", 1, 0, false);
    declareFunction(myName, "inference_all_answer_modules", "INFERENCE-ALL-ANSWER-MODULES", 1, 0, false);
    declareFunction(myName, "problem_relevant_to_some_strategyP", "PROBLEM-RELEVANT-TO-SOME-STRATEGY?", 1, 0, false);
    declareFunction(myName, "first_problem_relevant_strategy", "FIRST-PROBLEM-RELEVANT-STRATEGY", 1, 0, false);
    declareFunction(myName, "problem_or_inference_p", "PROBLEM-OR-INFERENCE-P", 1, 0, false);
    declareMacro(myName, "with_inference_problem_working_time_table", "WITH-INFERENCE-PROBLEM-WORKING-TIME-TABLE");
    declareFunction(myName, "inference_problem_working_time_lock", "INFERENCE-PROBLEM-WORKING-TIME-LOCK", 1, 0, false);
    declareFunction(myName, "inference_problem_working_time_table", "INFERENCE-PROBLEM-WORKING-TIME-TABLE", 1, 0, false);
    declareFunction(myName, "initialize_inference_problem_working_time_data", "INITIALIZE-INFERENCE-PROBLEM-WORKING-TIME-DATA", 1, 0, false);
    declareFunction(myName, "inference_note_tactic_executed", "INFERENCE-NOTE-TACTIC-EXECUTED", 2, 0, false);
    declareFunction(myName, "inference_note_problem_pending", "INFERENCE-NOTE-PROBLEM-PENDING", 2, 0, false);
    declareFunction(myName, "signal_inference_eventP", "SIGNAL-INFERENCE-EVENT?", 2, 0, false);
    declareFunction(myName, "possibly_signal_new_inference_answer", "POSSIBLY-SIGNAL-NEW-INFERENCE-ANSWER", 2, 0, false);
    declareFunction(myName, "possibly_signal_inference_status_change", "POSSIBLY-SIGNAL-INFERENCE-STATUS-CHANGE", 1, 0, false);
    declareFunction(myName, "possibly_signal_inference_new_transformation_depth_reached", "POSSIBLY-SIGNAL-INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED", 2, 0, false);
    declareMacro(myName, "inference_within_sksi_query_execution", "INFERENCE-WITHIN-SKSI-QUERY-EXECUTION");
    declareFunction(myName, "possibly_signal_sksi_query_start", "POSSIBLY-SIGNAL-SKSI-QUERY-START", 2, 0, false);
    declareFunction(myName, "possibly_signal_sksi_query_end", "POSSIBLY-SIGNAL-SKSI-QUERY-END", 2, 0, false);
    declareFunction(myName, "possibly_increment_inference_sksi_query_total_time", "POSSIBLY-INCREMENT-INFERENCE-SKSI-QUERY-TOTAL-TIME", 2, 0, false);
    declareFunction(myName, "possibly_add_inference_sksi_query_start_time", "POSSIBLY-ADD-INFERENCE-SKSI-QUERY-START-TIME", 2, 0, false);
    declareFunction(myName, "possibly_signal_sksi_query", "POSSIBLY-SIGNAL-SKSI-QUERY", 3, 1, false);
    declareMacro(myName, "inference_within_sparql_query_execution", "INFERENCE-WITHIN-SPARQL-QUERY-EXECUTION");
    declareFunction(myName, "possibly_add_inference_sparql_query_profile", "POSSIBLY-ADD-INFERENCE-SPARQL-QUERY-PROFILE", 4, 0, false);
    declareFunction(myName, "increment_inference_sksi_query_total_time", "INCREMENT-INFERENCE-SKSI-QUERY-TOTAL-TIME", 2, 0, false);
    declareFunction(myName, "add_inference_sksi_query_start_time", "ADD-INFERENCE-SKSI-QUERY-START-TIME", 2, 0, false);
    declareFunction(myName, "add_inference_sparql_query_profile", "ADD-INFERENCE-SPARQL-QUERY-PROFILE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_datastructures_inference_file() {
    $inference_types$ = deflexical("*INFERENCE-TYPES*", $list0);
    $dtp_inference$ = defconstant("*DTP-INFERENCE*", $sym1$INFERENCE);
    $pad_times_to_first_answer$ = deflexical("*PAD-TIMES-TO-FIRST-ANSWER*", maybeDefault( $sym394$_PAD_TIMES_TO_FIRST_ANSWER_, $pad_times_to_first_answer$, ()-> ($kw395$UNINITIALIZED)));
    $dtp_inference_answer$ = defconstant("*DTP-INFERENCE-ANSWER*", $sym419$INFERENCE_ANSWER);
    $dtp_inference_answer_justification$ = defconstant("*DTP-INFERENCE-ANSWER-JUSTIFICATION*", $sym456$INFERENCE_ANSWER_JUSTIFICATION);
    return NIL;
  }

  public static final SubLObject setup_inference_datastructures_inference_file() {
    // CVS_ID("Id: inference-datastructures-inference.lisp 128951 2009-10-15 01:53:53Z goolsbey ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference$.getGlobalValue(), Symbols.symbol_function($sym57$INFERENCE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym58$INFRNC_SUID, $sym59$_CSETF_INFRNC_SUID);
    Structures.def_csetf($sym60$INFRNC_PROBLEM_STORE, $sym61$_CSETF_INFRNC_PROBLEM_STORE);
    Structures.def_csetf($sym62$INFRNC_FORWARD_PROPAGATE, $sym63$_CSETF_INFRNC_FORWARD_PROPAGATE);
    Structures.def_csetf($sym64$INFRNC_INPUT_MT, $sym65$_CSETF_INFRNC_INPUT_MT);
    Structures.def_csetf($sym66$INFRNC_INPUT_EL_QUERY, $sym67$_CSETF_INFRNC_INPUT_EL_QUERY);
    Structures.def_csetf($sym68$INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY, $sym69$_CSETF_INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY);
    Structures.def_csetf($sym70$INFRNC_INPUT_QUERY_PROPERTIES, $sym71$_CSETF_INFRNC_INPUT_QUERY_PROPERTIES);
    Structures.def_csetf($sym72$INFRNC_MT, $sym73$_CSETF_INFRNC_MT);
    Structures.def_csetf($sym74$INFRNC_EL_QUERY, $sym75$_CSETF_INFRNC_EL_QUERY);
    Structures.def_csetf($sym76$INFRNC_EL_BINDINGS, $sym77$_CSETF_INFRNC_EL_BINDINGS);
    Structures.def_csetf($sym78$INFRNC_HL_QUERY, $sym79$_CSETF_INFRNC_HL_QUERY);
    Structures.def_csetf($sym80$INFRNC_EXPLANATORY_SUBQUERY, $sym81$_CSETF_INFRNC_EXPLANATORY_SUBQUERY);
    Structures.def_csetf($sym82$INFRNC_NON_EXPLANATORY_SUBQUERY, $sym83$_CSETF_INFRNC_NON_EXPLANATORY_SUBQUERY);
    Structures.def_csetf($sym84$INFRNC_FREE_HL_VARS, $sym85$_CSETF_INFRNC_FREE_HL_VARS);
    Structures.def_csetf($sym86$INFRNC_HYPOTHETICAL_BINDINGS, $sym87$_CSETF_INFRNC_HYPOTHETICAL_BINDINGS);
    Structures.def_csetf($sym88$INFRNC_ANSWER_ID_INDEX, $sym89$_CSETF_INFRNC_ANSWER_ID_INDEX);
    Structures.def_csetf($sym90$INFRNC_ANSWER_BINDINGS_INDEX, $sym91$_CSETF_INFRNC_ANSWER_BINDINGS_INDEX);
    Structures.def_csetf($sym92$INFRNC_NEW_ANSWER_ID_START, $sym93$_CSETF_INFRNC_NEW_ANSWER_ID_START);
    Structures.def_csetf($sym94$INFRNC_NEW_ANSWER_JUSTIFICATIONS, $sym95$_CSETF_INFRNC_NEW_ANSWER_JUSTIFICATIONS);
    Structures.def_csetf($sym96$INFRNC_STATUS, $sym97$_CSETF_INFRNC_STATUS);
    Structures.def_csetf($sym98$INFRNC_SUSPEND_STATUS, $sym99$_CSETF_INFRNC_SUSPEND_STATUS);
    Structures.def_csetf($sym100$INFRNC_ROOT_LINK, $sym101$_CSETF_INFRNC_ROOT_LINK);
    Structures.def_csetf($sym102$INFRNC_RELEVANT_PROBLEMS, $sym103$_CSETF_INFRNC_RELEVANT_PROBLEMS);
    Structures.def_csetf($sym104$INFRNC_STRATEGY_SET, $sym105$_CSETF_INFRNC_STRATEGY_SET);
    Structures.def_csetf($sym106$INFRNC_CONTROL_PROCESS, $sym107$_CSETF_INFRNC_CONTROL_PROCESS);
    Structures.def_csetf($sym108$INFRNC_INTERRUPTING_PROCESSES, $sym109$_CSETF_INFRNC_INTERRUPTING_PROCESSES);
    Structures.def_csetf($sym110$INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED, $sym111$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED);
    Structures.def_csetf($sym112$INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY, $sym113$_CSETF_INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY);
    Structures.def_csetf($sym114$INFRNC_RESULT_UNIQUENESS_CRITERION, $sym115$_CSETF_INFRNC_RESULT_UNIQUENESS_CRITERION);
    Structures.def_csetf($sym116$INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_, $sym117$_CSETF_INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_);
    Structures.def_csetf($sym118$INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, $sym119$_CSETF_INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_);
    Structures.def_csetf($sym120$INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, $sym121$_CSETF_INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_);
    Structures.def_csetf($sym122$INFRNC_ALLOW_INDETERMINATE_RESULTS_, $sym123$_CSETF_INFRNC_ALLOW_INDETERMINATE_RESULTS_);
    Structures.def_csetf($sym124$INFRNC_ALLOWED_RULES, $sym125$_CSETF_INFRNC_ALLOWED_RULES);
    Structures.def_csetf($sym126$INFRNC_FORBIDDEN_RULES, $sym127$_CSETF_INFRNC_FORBIDDEN_RULES);
    Structures.def_csetf($sym128$INFRNC_ALLOWED_MODULES, $sym129$_CSETF_INFRNC_ALLOWED_MODULES);
    Structures.def_csetf($sym130$INFRNC_ALLOW_ABNORMALITY_CHECKING_, $sym131$_CSETF_INFRNC_ALLOW_ABNORMALITY_CHECKING_);
    Structures.def_csetf($sym132$INFRNC_TRANSITIVE_CLOSURE_MODE, $sym133$_CSETF_INFRNC_TRANSITIVE_CLOSURE_MODE);
    Structures.def_csetf($sym134$INFRNC_PROBLEM_STORE_PRIVATE_, $sym135$_CSETF_INFRNC_PROBLEM_STORE_PRIVATE_);
    Structures.def_csetf($sym136$INFRNC_CONTINUABLE_, $sym137$_CSETF_INFRNC_CONTINUABLE_);
    Structures.def_csetf($sym138$INFRNC_BROWSABLE_, $sym139$_CSETF_INFRNC_BROWSABLE_);
    Structures.def_csetf($sym140$INFRNC_RETURN_TYPE, $sym141$_CSETF_INFRNC_RETURN_TYPE);
    Structures.def_csetf($sym142$INFRNC_ANSWER_LANGUAGE, $sym143$_CSETF_INFRNC_ANSWER_LANGUAGE);
    Structures.def_csetf($sym144$INFRNC_CACHE_RESULTS_, $sym145$_CSETF_INFRNC_CACHE_RESULTS_);
    Structures.def_csetf($sym146$INFRNC_BLOCKING_, $sym147$_CSETF_INFRNC_BLOCKING_);
    Structures.def_csetf($sym148$INFRNC_MAX_NUMBER, $sym149$_CSETF_INFRNC_MAX_NUMBER);
    Structures.def_csetf($sym150$INFRNC_MAX_TIME, $sym151$_CSETF_INFRNC_MAX_TIME);
    Structures.def_csetf($sym152$INFRNC_MAX_STEP, $sym153$_CSETF_INFRNC_MAX_STEP);
    Structures.def_csetf($sym154$INFRNC_MODE, $sym155$_CSETF_INFRNC_MODE);
    Structures.def_csetf($sym156$INFRNC_FORWARD_MAX_TIME, $sym157$_CSETF_INFRNC_FORWARD_MAX_TIME);
    Structures.def_csetf($sym158$INFRNC_MAX_PROOF_DEPTH, $sym159$_CSETF_INFRNC_MAX_PROOF_DEPTH);
    Structures.def_csetf($sym160$INFRNC_MAX_TRANSFORMATION_DEPTH, $sym161$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH);
    Structures.def_csetf($sym162$INFRNC_PROBABLY_APPROXIMATELY_DONE, $sym163$_CSETF_INFRNC_PROBABLY_APPROXIMATELY_DONE);
    Structures.def_csetf($sym164$INFRNC_METRICS_TEMPLATE, $sym165$_CSETF_INFRNC_METRICS_TEMPLATE);
    Structures.def_csetf($sym166$INFRNC_START_UNIVERSAL_TIME, $sym167$_CSETF_INFRNC_START_UNIVERSAL_TIME);
    Structures.def_csetf($sym168$INFRNC_START_INTERNAL_REAL_TIME, $sym169$_CSETF_INFRNC_START_INTERNAL_REAL_TIME);
    Structures.def_csetf($sym170$INFRNC_END_INTERNAL_REAL_TIME, $sym171$_CSETF_INFRNC_END_INTERNAL_REAL_TIME);
    Structures.def_csetf($sym172$INFRNC_PAD_INTERNAL_REAL_TIME, $sym173$_CSETF_INFRNC_PAD_INTERNAL_REAL_TIME);
    Structures.def_csetf($sym174$INFRNC_CUMULATIVE_TIME, $sym175$_CSETF_INFRNC_CUMULATIVE_TIME);
    Structures.def_csetf($sym176$INFRNC_STEP_COUNT, $sym177$_CSETF_INFRNC_STEP_COUNT);
    Structures.def_csetf($sym178$INFRNC_CUMULATIVE_STEP_COUNT, $sym179$_CSETF_INFRNC_CUMULATIVE_STEP_COUNT);
    Structures.def_csetf($sym180$INFRNC_EVENTS, $sym181$_CSETF_INFRNC_EVENTS);
    Structures.def_csetf($sym182$INFRNC_HALT_CONDITIONS, $sym183$_CSETF_INFRNC_HALT_CONDITIONS);
    Structures.def_csetf($sym184$INFRNC_ACCUMULATORS, $sym185$_CSETF_INFRNC_ACCUMULATORS);
    Structures.def_csetf($sym186$INFRNC_PROOF_WATERMARK, $sym187$_CSETF_INFRNC_PROOF_WATERMARK);
    Structures.def_csetf($sym188$INFRNC_PROBLEM_WORKING_TIME_DATA, $sym189$_CSETF_INFRNC_PROBLEM_WORKING_TIME_DATA);
    Structures.def_csetf($sym190$INFRNC_TYPE, $sym191$_CSETF_INFRNC_TYPE);
    Structures.def_csetf($sym192$INFRNC_DATA, $sym193$_CSETF_INFRNC_DATA);
    Equality.identity($sym1$INFERENCE);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_inference$.getGlobalValue(), Symbols.symbol_function($sym266$SXHASH_INFERENCE_METHOD));
    access_macros.register_macro_helper($sym296$INFERENCE_ANSWER_ID_INDEX, $sym305$DO_INFERENCE_ANSWERS);
    access_macros.register_macro_helper($sym284$INFERENCE_NEW_ANSWER_ID_START, $sym329$DO_INFERENCE_NEW_ANSWERS);
    access_macros.register_macro_helper($sym277$INFERENCE_NEW_ANSWER_JUSTIFICATIONS, $sym330$DO_INFERENCE_NEW_ANSWER_JUSTIFICATIONS);
    subl_macro_promotions.declare_defglobal($sym394$_PAD_TIMES_TO_FIRST_ANSWER_);
    access_macros.register_macro_helper($sym285$INFERENCE_NEXT_NEW_ANSWER_ID, $sym329$DO_INFERENCE_NEW_ANSWERS);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function($sym425$INFERENCE_ANSWER_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym426$INF_ANSWER_SUID, $sym427$_CSETF_INF_ANSWER_SUID);
    Structures.def_csetf($sym428$INF_ANSWER_INFERENCE, $sym429$_CSETF_INF_ANSWER_INFERENCE);
    Structures.def_csetf($sym430$INF_ANSWER_BINDINGS, $sym431$_CSETF_INF_ANSWER_BINDINGS);
    Structures.def_csetf($sym432$INF_ANSWER_JUSTIFICATIONS, $sym433$_CSETF_INF_ANSWER_JUSTIFICATIONS);
    Structures.def_csetf($sym434$INF_ANSWER_ELAPSED_CREATION_TIME, $sym435$_CSETF_INF_ANSWER_ELAPSED_CREATION_TIME);
    Structures.def_csetf($sym436$INF_ANSWER_STEP_COUNT, $sym437$_CSETF_INF_ANSWER_STEP_COUNT);
    Equality.identity($sym419$INFERENCE_ANSWER);
    //Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function($sym443$SXHASH_INFERENCE_ANSWER_METHOD));
    access_macros.register_macro_helper($sym447$INFERENCE_ANSWER_JUSTIFICATIONS, $sym306$DO_INFERENCE_ANSWER_JUSTIFICATIONS);
    access_macros.register_external_symbol($sym455$INFERENCE_ANSWER_EL_SENTENCE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference_answer_justification$.getGlobalValue(), Symbols.symbol_function($sym462$INFERENCE_ANSWER_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym463$INF_ANS_JUST_ANSWER, $sym464$_CSETF_INF_ANS_JUST_ANSWER);
    Structures.def_csetf($sym465$INF_ANS_JUST_SUPPORTS, $sym466$_CSETF_INF_ANS_JUST_SUPPORTS);
    Structures.def_csetf($sym467$INF_ANS_JUST_PROOFS, $sym468$_CSETF_INF_ANS_JUST_PROOFS);
    Equality.identity($sym456$INFERENCE_ANSWER_JUSTIFICATION);
    //Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_inference_answer_justification$.getGlobalValue(), Symbols.symbol_function($sym476$SXHASH_INFERENCE_ANSWER_JUSTIFICATION_METHOD));
    access_macros.register_macro_helper($sym323$INFERENCE_PROBLEM_WORKING_TIME_LOCK, $sym515$WITH_INFERENCE_PROBLEM_WORKING_TIME_LOCK);
    access_macros.register_macro_helper($sym527$POSSIBLY_SIGNAL_SKSI_QUERY_START, $sym534$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION);
    access_macros.register_macro_helper($sym531$POSSIBLY_SIGNAL_SKSI_QUERY_END, $sym534$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION);
    access_macros.register_macro_helper($sym532$POSSIBLY_INCREMENT_INFERENCE_SKSI_QUERY_TOTAL_TIME, $sym534$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION);
    access_macros.register_macro_helper($sym530$POSSIBLY_ADD_INFERENCE_SKSI_QUERY_START_TIME, $sym534$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION);
    access_macros.register_macro_helper($sym554$POSSIBLY_ADD_INFERENCE_SPARQL_QUERY_PROFILE, $sym555$INFERENCE_WITHIN_SPARQL_QUERY_EXECUTION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("SIMPLEST"));
  public static final SubLSymbol $sym1$INFERENCE = makeSymbol("INFERENCE");
  public static final SubLSymbol $sym2$INFERENCE_P = makeSymbol("INFERENCE-P");
  public static final SubLList $list3 = list(new SubLObject[] {makeSymbol("SUID"), makeSymbol("PROBLEM-STORE"), makeSymbol("FORWARD-PROPAGATE"), makeSymbol("INPUT-MT"), makeSymbol("INPUT-EL-QUERY"), makeSymbol("INPUT-NON-EXPLANATORY-EL-QUERY"), makeSymbol("INPUT-QUERY-PROPERTIES"), makeSymbol("MT"), makeSymbol("EL-QUERY"), makeSymbol("EL-BINDINGS"), makeSymbol("HL-QUERY"), makeSymbol("EXPLANATORY-SUBQUERY"), makeSymbol("NON-EXPLANATORY-SUBQUERY"), makeSymbol("FREE-HL-VARS"), makeSymbol("HYPOTHETICAL-BINDINGS"), makeSymbol("ANSWER-ID-INDEX"), makeSymbol("ANSWER-BINDINGS-INDEX"), makeSymbol("NEW-ANSWER-ID-START"), makeSymbol("NEW-ANSWER-JUSTIFICATIONS"), makeSymbol("STATUS"), makeSymbol("SUSPEND-STATUS"), makeSymbol("ROOT-LINK"), makeSymbol("RELEVANT-PROBLEMS"), makeSymbol("STRATEGY-SET"), makeSymbol("CONTROL-PROCESS"), makeSymbol("INTERRUPTING-PROCESSES"), makeSymbol("MAX-TRANSFORMATION-DEPTH-REACHED"), makeSymbol("DISJUNCTION-FREE-EL-VARS-POLICY"), makeSymbol("RESULT-UNIQUENESS-CRITERION"), makeSymbol("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeSymbol("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeSymbol("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeSymbol("ALLOW-INDETERMINATE-RESULTS?"), makeSymbol("ALLOWED-RULES"), makeSymbol("FORBIDDEN-RULES"), makeSymbol("ALLOWED-MODULES"), makeSymbol("ALLOW-ABNORMALITY-CHECKING?"), makeSymbol("TRANSITIVE-CLOSURE-MODE"), makeSymbol("PROBLEM-STORE-PRIVATE?"), makeSymbol("CONTINUABLE?"), makeSymbol("BROWSABLE?"), makeSymbol("RETURN-TYPE"), makeSymbol("ANSWER-LANGUAGE"), makeSymbol("CACHE-RESULTS?"), makeSymbol("BLOCKING?"), makeSymbol("MAX-NUMBER"), makeSymbol("MAX-TIME"), makeSymbol("MAX-STEP"), makeSymbol("MODE"), makeSymbol("FORWARD-MAX-TIME"), makeSymbol("MAX-PROOF-DEPTH"), makeSymbol("MAX-TRANSFORMATION-DEPTH"), makeSymbol("PROBABLY-APPROXIMATELY-DONE"), makeSymbol("METRICS-TEMPLATE"), makeSymbol("START-UNIVERSAL-TIME"), makeSymbol("START-INTERNAL-REAL-TIME"), makeSymbol("END-INTERNAL-REAL-TIME"), makeSymbol("PAD-INTERNAL-REAL-TIME"), makeSymbol("CUMULATIVE-TIME"), makeSymbol("STEP-COUNT"), makeSymbol("CUMULATIVE-STEP-COUNT"), makeSymbol("EVENTS"), makeSymbol("HALT-CONDITIONS"), makeSymbol("ACCUMULATORS"), makeSymbol("PROOF-WATERMARK"), makeSymbol("PROBLEM-WORKING-TIME-DATA"), makeSymbol("TYPE"), makeSymbol("DATA")});
  public static final SubLList $list4 = list(new SubLObject[] {makeKeyword("SUID"), makeKeyword("PROBLEM-STORE"), makeKeyword("FORWARD-PROPAGATE"), makeKeyword("INPUT-MT"), makeKeyword("INPUT-EL-QUERY"), makeKeyword("INPUT-NON-EXPLANATORY-EL-QUERY"), makeKeyword("INPUT-QUERY-PROPERTIES"), makeKeyword("MT"), makeKeyword("EL-QUERY"), makeKeyword("EL-BINDINGS"), makeKeyword("HL-QUERY"), makeKeyword("EXPLANATORY-SUBQUERY"), makeKeyword("NON-EXPLANATORY-SUBQUERY"), makeKeyword("FREE-HL-VARS"), makeKeyword("HYPOTHETICAL-BINDINGS"), makeKeyword("ANSWER-ID-INDEX"), makeKeyword("ANSWER-BINDINGS-INDEX"), makeKeyword("NEW-ANSWER-ID-START"), makeKeyword("NEW-ANSWER-JUSTIFICATIONS"), makeKeyword("STATUS"), makeKeyword("SUSPEND-STATUS"), makeKeyword("ROOT-LINK"), makeKeyword("RELEVANT-PROBLEMS"), makeKeyword("STRATEGY-SET"), makeKeyword("CONTROL-PROCESS"), makeKeyword("INTERRUPTING-PROCESSES"), makeKeyword("MAX-TRANSFORMATION-DEPTH-REACHED"), makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("RESULT-UNIQUENESS-CRITERION"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOWED-RULES"), makeKeyword("FORBIDDEN-RULES"), makeKeyword("ALLOWED-MODULES"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("PROBLEM-STORE-PRIVATE?"), makeKeyword("CONTINUABLE?"), makeKeyword("BROWSABLE?"), makeKeyword("RETURN-TYPE"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("CACHE-RESULTS?"), makeKeyword("BLOCKING?"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("MODE"), makeKeyword("FORWARD-MAX-TIME"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("METRICS-TEMPLATE"), makeKeyword("START-UNIVERSAL-TIME"), makeKeyword("START-INTERNAL-REAL-TIME"), makeKeyword("END-INTERNAL-REAL-TIME"), makeKeyword("PAD-INTERNAL-REAL-TIME"), makeKeyword("CUMULATIVE-TIME"), makeKeyword("STEP-COUNT"), makeKeyword("CUMULATIVE-STEP-COUNT"), makeKeyword("EVENTS"), makeKeyword("HALT-CONDITIONS"), makeKeyword("ACCUMULATORS"), makeKeyword("PROOF-WATERMARK"), makeKeyword("PROBLEM-WORKING-TIME-DATA"), makeKeyword("TYPE"), makeKeyword("DATA")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("INFRNC-SUID"), makeSymbol("INFRNC-PROBLEM-STORE"), makeSymbol("INFRNC-FORWARD-PROPAGATE"), makeSymbol("INFRNC-INPUT-MT"), makeSymbol("INFRNC-INPUT-EL-QUERY"), makeSymbol("INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY"), makeSymbol("INFRNC-INPUT-QUERY-PROPERTIES"), makeSymbol("INFRNC-MT"), makeSymbol("INFRNC-EL-QUERY"), makeSymbol("INFRNC-EL-BINDINGS"), makeSymbol("INFRNC-HL-QUERY"), makeSymbol("INFRNC-EXPLANATORY-SUBQUERY"), makeSymbol("INFRNC-NON-EXPLANATORY-SUBQUERY"), makeSymbol("INFRNC-FREE-HL-VARS"), makeSymbol("INFRNC-HYPOTHETICAL-BINDINGS"), makeSymbol("INFRNC-ANSWER-ID-INDEX"), makeSymbol("INFRNC-ANSWER-BINDINGS-INDEX"), makeSymbol("INFRNC-NEW-ANSWER-ID-START"), makeSymbol("INFRNC-NEW-ANSWER-JUSTIFICATIONS"), makeSymbol("INFRNC-STATUS"), makeSymbol("INFRNC-SUSPEND-STATUS"), makeSymbol("INFRNC-ROOT-LINK"), makeSymbol("INFRNC-RELEVANT-PROBLEMS"), makeSymbol("INFRNC-STRATEGY-SET"), makeSymbol("INFRNC-CONTROL-PROCESS"), makeSymbol("INFRNC-INTERRUPTING-PROCESSES"), makeSymbol("INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED"), makeSymbol("INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY"), makeSymbol("INFRNC-RESULT-UNIQUENESS-CRITERION"), makeSymbol("INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeSymbol("INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeSymbol("INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeSymbol("INFRNC-ALLOW-INDETERMINATE-RESULTS?"), makeSymbol("INFRNC-ALLOWED-RULES"), makeSymbol("INFRNC-FORBIDDEN-RULES"), makeSymbol("INFRNC-ALLOWED-MODULES"), makeSymbol("INFRNC-ALLOW-ABNORMALITY-CHECKING?"), makeSymbol("INFRNC-TRANSITIVE-CLOSURE-MODE"), makeSymbol("INFRNC-PROBLEM-STORE-PRIVATE?"), makeSymbol("INFRNC-CONTINUABLE?"), makeSymbol("INFRNC-BROWSABLE?"), makeSymbol("INFRNC-RETURN-TYPE"), makeSymbol("INFRNC-ANSWER-LANGUAGE"), makeSymbol("INFRNC-CACHE-RESULTS?"), makeSymbol("INFRNC-BLOCKING?"), makeSymbol("INFRNC-MAX-NUMBER"), makeSymbol("INFRNC-MAX-TIME"), makeSymbol("INFRNC-MAX-STEP"), makeSymbol("INFRNC-MODE"), makeSymbol("INFRNC-FORWARD-MAX-TIME"), makeSymbol("INFRNC-MAX-PROOF-DEPTH"), makeSymbol("INFRNC-MAX-TRANSFORMATION-DEPTH"), makeSymbol("INFRNC-PROBABLY-APPROXIMATELY-DONE"), makeSymbol("INFRNC-METRICS-TEMPLATE"), makeSymbol("INFRNC-START-UNIVERSAL-TIME"), makeSymbol("INFRNC-START-INTERNAL-REAL-TIME"), makeSymbol("INFRNC-END-INTERNAL-REAL-TIME"), makeSymbol("INFRNC-PAD-INTERNAL-REAL-TIME"), makeSymbol("INFRNC-CUMULATIVE-TIME"), makeSymbol("INFRNC-STEP-COUNT"), makeSymbol("INFRNC-CUMULATIVE-STEP-COUNT"), makeSymbol("INFRNC-EVENTS"), makeSymbol("INFRNC-HALT-CONDITIONS"), makeSymbol("INFRNC-ACCUMULATORS"), makeSymbol("INFRNC-PROOF-WATERMARK"), makeSymbol("INFRNC-PROBLEM-WORKING-TIME-DATA"), makeSymbol("INFRNC-TYPE"), makeSymbol("INFRNC-DATA")});
  public static final SubLList $list6 = list(new SubLObject[] {makeSymbol("_CSETF-INFRNC-SUID"), makeSymbol("_CSETF-INFRNC-PROBLEM-STORE"), makeSymbol("_CSETF-INFRNC-FORWARD-PROPAGATE"), makeSymbol("_CSETF-INFRNC-INPUT-MT"), makeSymbol("_CSETF-INFRNC-INPUT-EL-QUERY"), makeSymbol("_CSETF-INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY"), makeSymbol("_CSETF-INFRNC-INPUT-QUERY-PROPERTIES"), makeSymbol("_CSETF-INFRNC-MT"), makeSymbol("_CSETF-INFRNC-EL-QUERY"), makeSymbol("_CSETF-INFRNC-EL-BINDINGS"), makeSymbol("_CSETF-INFRNC-HL-QUERY"), makeSymbol("_CSETF-INFRNC-EXPLANATORY-SUBQUERY"), makeSymbol("_CSETF-INFRNC-NON-EXPLANATORY-SUBQUERY"), makeSymbol("_CSETF-INFRNC-FREE-HL-VARS"), makeSymbol("_CSETF-INFRNC-HYPOTHETICAL-BINDINGS"), makeSymbol("_CSETF-INFRNC-ANSWER-ID-INDEX"), makeSymbol("_CSETF-INFRNC-ANSWER-BINDINGS-INDEX"), makeSymbol("_CSETF-INFRNC-NEW-ANSWER-ID-START"), makeSymbol("_CSETF-INFRNC-NEW-ANSWER-JUSTIFICATIONS"), makeSymbol("_CSETF-INFRNC-STATUS"), makeSymbol("_CSETF-INFRNC-SUSPEND-STATUS"), makeSymbol("_CSETF-INFRNC-ROOT-LINK"), makeSymbol("_CSETF-INFRNC-RELEVANT-PROBLEMS"), makeSymbol("_CSETF-INFRNC-STRATEGY-SET"), makeSymbol("_CSETF-INFRNC-CONTROL-PROCESS"), makeSymbol("_CSETF-INFRNC-INTERRUPTING-PROCESSES"), makeSymbol("_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED"), makeSymbol("_CSETF-INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY"), makeSymbol("_CSETF-INFRNC-RESULT-UNIQUENESS-CRITERION"), makeSymbol("_CSETF-INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeSymbol("_CSETF-INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeSymbol("_CSETF-INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeSymbol("_CSETF-INFRNC-ALLOW-INDETERMINATE-RESULTS?"), makeSymbol("_CSETF-INFRNC-ALLOWED-RULES"), makeSymbol("_CSETF-INFRNC-FORBIDDEN-RULES"), makeSymbol("_CSETF-INFRNC-ALLOWED-MODULES"), makeSymbol("_CSETF-INFRNC-ALLOW-ABNORMALITY-CHECKING?"), makeSymbol("_CSETF-INFRNC-TRANSITIVE-CLOSURE-MODE"), makeSymbol("_CSETF-INFRNC-PROBLEM-STORE-PRIVATE?"), makeSymbol("_CSETF-INFRNC-CONTINUABLE?"), makeSymbol("_CSETF-INFRNC-BROWSABLE?"), makeSymbol("_CSETF-INFRNC-RETURN-TYPE"), makeSymbol("_CSETF-INFRNC-ANSWER-LANGUAGE"), makeSymbol("_CSETF-INFRNC-CACHE-RESULTS?"), makeSymbol("_CSETF-INFRNC-BLOCKING?"), makeSymbol("_CSETF-INFRNC-MAX-NUMBER"), makeSymbol("_CSETF-INFRNC-MAX-TIME"), makeSymbol("_CSETF-INFRNC-MAX-STEP"), makeSymbol("_CSETF-INFRNC-MODE"), makeSymbol("_CSETF-INFRNC-FORWARD-MAX-TIME"), makeSymbol("_CSETF-INFRNC-MAX-PROOF-DEPTH"), makeSymbol("_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH"), makeSymbol("_CSETF-INFRNC-PROBABLY-APPROXIMATELY-DONE"), makeSymbol("_CSETF-INFRNC-METRICS-TEMPLATE"), makeSymbol("_CSETF-INFRNC-START-UNIVERSAL-TIME"), makeSymbol("_CSETF-INFRNC-START-INTERNAL-REAL-TIME"), makeSymbol("_CSETF-INFRNC-END-INTERNAL-REAL-TIME"), makeSymbol("_CSETF-INFRNC-PAD-INTERNAL-REAL-TIME"), makeSymbol("_CSETF-INFRNC-CUMULATIVE-TIME"), makeSymbol("_CSETF-INFRNC-STEP-COUNT"), makeSymbol("_CSETF-INFRNC-CUMULATIVE-STEP-COUNT"), makeSymbol("_CSETF-INFRNC-EVENTS"), makeSymbol("_CSETF-INFRNC-HALT-CONDITIONS"), makeSymbol("_CSETF-INFRNC-ACCUMULATORS"), makeSymbol("_CSETF-INFRNC-PROOF-WATERMARK"), makeSymbol("_CSETF-INFRNC-PROBLEM-WORKING-TIME-DATA"), makeSymbol("_CSETF-INFRNC-TYPE"), makeSymbol("_CSETF-INFRNC-DATA")});
  public static final SubLSymbol $sym7$PRINT_INFERENCE = makeSymbol("PRINT-INFERENCE");
  public static final SubLInteger $int8$21 = makeInteger(21);
  public static final SubLInteger $int9$22 = makeInteger(22);
  public static final SubLInteger $int10$23 = makeInteger(23);
  public static final SubLInteger $int11$24 = makeInteger(24);
  public static final SubLInteger $int12$25 = makeInteger(25);
  public static final SubLInteger $int13$26 = makeInteger(26);
  public static final SubLInteger $int14$27 = makeInteger(27);
  public static final SubLInteger $int15$28 = makeInteger(28);
  public static final SubLInteger $int16$29 = makeInteger(29);
  public static final SubLInteger $int17$30 = makeInteger(30);
  public static final SubLInteger $int18$31 = makeInteger(31);
  public static final SubLInteger $int19$32 = makeInteger(32);
  public static final SubLInteger $int20$33 = makeInteger(33);
  public static final SubLInteger $int21$34 = makeInteger(34);
  public static final SubLInteger $int22$35 = makeInteger(35);
  public static final SubLInteger $int23$36 = makeInteger(36);
  public static final SubLInteger $int24$37 = makeInteger(37);
  public static final SubLInteger $int25$38 = makeInteger(38);
  public static final SubLInteger $int26$39 = makeInteger(39);
  public static final SubLInteger $int27$40 = makeInteger(40);
  public static final SubLInteger $int28$41 = makeInteger(41);
  public static final SubLInteger $int29$42 = makeInteger(42);
  public static final SubLInteger $int30$43 = makeInteger(43);
  public static final SubLInteger $int31$44 = makeInteger(44);
  public static final SubLInteger $int32$45 = makeInteger(45);
  public static final SubLInteger $int33$46 = makeInteger(46);
  public static final SubLInteger $int34$47 = makeInteger(47);
  public static final SubLInteger $int35$48 = makeInteger(48);
  public static final SubLInteger $int36$49 = makeInteger(49);
  public static final SubLInteger $int37$50 = makeInteger(50);
  public static final SubLInteger $int38$51 = makeInteger(51);
  public static final SubLInteger $int39$52 = makeInteger(52);
  public static final SubLInteger $int40$53 = makeInteger(53);
  public static final SubLInteger $int41$54 = makeInteger(54);
  public static final SubLInteger $int42$55 = makeInteger(55);
  public static final SubLInteger $int43$56 = makeInteger(56);
  public static final SubLInteger $int44$57 = makeInteger(57);
  public static final SubLInteger $int45$58 = makeInteger(58);
  public static final SubLInteger $int46$59 = makeInteger(59);
  public static final SubLInteger $int47$60 = makeInteger(60);
  public static final SubLInteger $int48$61 = makeInteger(61);
  public static final SubLInteger $int49$62 = makeInteger(62);
  public static final SubLInteger $int50$63 = makeInteger(63);
  public static final SubLInteger $int51$64 = makeInteger(64);
  public static final SubLInteger $int52$65 = makeInteger(65);
  public static final SubLInteger $int53$66 = makeInteger(66);
  public static final SubLInteger $int54$67 = makeInteger(67);
  public static final SubLInteger $int55$68 = makeInteger(68);
  public static final SubLInteger $int56$69 = makeInteger(69);
  public static final SubLSymbol $sym57$INFERENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym58$INFRNC_SUID = makeSymbol("INFRNC-SUID");
  public static final SubLSymbol $sym59$_CSETF_INFRNC_SUID = makeSymbol("_CSETF-INFRNC-SUID");
  public static final SubLSymbol $sym60$INFRNC_PROBLEM_STORE = makeSymbol("INFRNC-PROBLEM-STORE");
  public static final SubLSymbol $sym61$_CSETF_INFRNC_PROBLEM_STORE = makeSymbol("_CSETF-INFRNC-PROBLEM-STORE");
  public static final SubLSymbol $sym62$INFRNC_FORWARD_PROPAGATE = makeSymbol("INFRNC-FORWARD-PROPAGATE");
  public static final SubLSymbol $sym63$_CSETF_INFRNC_FORWARD_PROPAGATE = makeSymbol("_CSETF-INFRNC-FORWARD-PROPAGATE");
  public static final SubLSymbol $sym64$INFRNC_INPUT_MT = makeSymbol("INFRNC-INPUT-MT");
  public static final SubLSymbol $sym65$_CSETF_INFRNC_INPUT_MT = makeSymbol("_CSETF-INFRNC-INPUT-MT");
  public static final SubLSymbol $sym66$INFRNC_INPUT_EL_QUERY = makeSymbol("INFRNC-INPUT-EL-QUERY");
  public static final SubLSymbol $sym67$_CSETF_INFRNC_INPUT_EL_QUERY = makeSymbol("_CSETF-INFRNC-INPUT-EL-QUERY");
  public static final SubLSymbol $sym68$INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY = makeSymbol("INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY");
  public static final SubLSymbol $sym69$_CSETF_INFRNC_INPUT_NON_EXPLANATORY_EL_QUERY = makeSymbol("_CSETF-INFRNC-INPUT-NON-EXPLANATORY-EL-QUERY");
  public static final SubLSymbol $sym70$INFRNC_INPUT_QUERY_PROPERTIES = makeSymbol("INFRNC-INPUT-QUERY-PROPERTIES");
  public static final SubLSymbol $sym71$_CSETF_INFRNC_INPUT_QUERY_PROPERTIES = makeSymbol("_CSETF-INFRNC-INPUT-QUERY-PROPERTIES");
  public static final SubLSymbol $sym72$INFRNC_MT = makeSymbol("INFRNC-MT");
  public static final SubLSymbol $sym73$_CSETF_INFRNC_MT = makeSymbol("_CSETF-INFRNC-MT");
  public static final SubLSymbol $sym74$INFRNC_EL_QUERY = makeSymbol("INFRNC-EL-QUERY");
  public static final SubLSymbol $sym75$_CSETF_INFRNC_EL_QUERY = makeSymbol("_CSETF-INFRNC-EL-QUERY");
  public static final SubLSymbol $sym76$INFRNC_EL_BINDINGS = makeSymbol("INFRNC-EL-BINDINGS");
  public static final SubLSymbol $sym77$_CSETF_INFRNC_EL_BINDINGS = makeSymbol("_CSETF-INFRNC-EL-BINDINGS");
  public static final SubLSymbol $sym78$INFRNC_HL_QUERY = makeSymbol("INFRNC-HL-QUERY");
  public static final SubLSymbol $sym79$_CSETF_INFRNC_HL_QUERY = makeSymbol("_CSETF-INFRNC-HL-QUERY");
  public static final SubLSymbol $sym80$INFRNC_EXPLANATORY_SUBQUERY = makeSymbol("INFRNC-EXPLANATORY-SUBQUERY");
  public static final SubLSymbol $sym81$_CSETF_INFRNC_EXPLANATORY_SUBQUERY = makeSymbol("_CSETF-INFRNC-EXPLANATORY-SUBQUERY");
  public static final SubLSymbol $sym82$INFRNC_NON_EXPLANATORY_SUBQUERY = makeSymbol("INFRNC-NON-EXPLANATORY-SUBQUERY");
  public static final SubLSymbol $sym83$_CSETF_INFRNC_NON_EXPLANATORY_SUBQUERY = makeSymbol("_CSETF-INFRNC-NON-EXPLANATORY-SUBQUERY");
  public static final SubLSymbol $sym84$INFRNC_FREE_HL_VARS = makeSymbol("INFRNC-FREE-HL-VARS");
  public static final SubLSymbol $sym85$_CSETF_INFRNC_FREE_HL_VARS = makeSymbol("_CSETF-INFRNC-FREE-HL-VARS");
  public static final SubLSymbol $sym86$INFRNC_HYPOTHETICAL_BINDINGS = makeSymbol("INFRNC-HYPOTHETICAL-BINDINGS");
  public static final SubLSymbol $sym87$_CSETF_INFRNC_HYPOTHETICAL_BINDINGS = makeSymbol("_CSETF-INFRNC-HYPOTHETICAL-BINDINGS");
  public static final SubLSymbol $sym88$INFRNC_ANSWER_ID_INDEX = makeSymbol("INFRNC-ANSWER-ID-INDEX");
  public static final SubLSymbol $sym89$_CSETF_INFRNC_ANSWER_ID_INDEX = makeSymbol("_CSETF-INFRNC-ANSWER-ID-INDEX");
  public static final SubLSymbol $sym90$INFRNC_ANSWER_BINDINGS_INDEX = makeSymbol("INFRNC-ANSWER-BINDINGS-INDEX");
  public static final SubLSymbol $sym91$_CSETF_INFRNC_ANSWER_BINDINGS_INDEX = makeSymbol("_CSETF-INFRNC-ANSWER-BINDINGS-INDEX");
  public static final SubLSymbol $sym92$INFRNC_NEW_ANSWER_ID_START = makeSymbol("INFRNC-NEW-ANSWER-ID-START");
  public static final SubLSymbol $sym93$_CSETF_INFRNC_NEW_ANSWER_ID_START = makeSymbol("_CSETF-INFRNC-NEW-ANSWER-ID-START");
  public static final SubLSymbol $sym94$INFRNC_NEW_ANSWER_JUSTIFICATIONS = makeSymbol("INFRNC-NEW-ANSWER-JUSTIFICATIONS");
  public static final SubLSymbol $sym95$_CSETF_INFRNC_NEW_ANSWER_JUSTIFICATIONS = makeSymbol("_CSETF-INFRNC-NEW-ANSWER-JUSTIFICATIONS");
  public static final SubLSymbol $sym96$INFRNC_STATUS = makeSymbol("INFRNC-STATUS");
  public static final SubLSymbol $sym97$_CSETF_INFRNC_STATUS = makeSymbol("_CSETF-INFRNC-STATUS");
  public static final SubLSymbol $sym98$INFRNC_SUSPEND_STATUS = makeSymbol("INFRNC-SUSPEND-STATUS");
  public static final SubLSymbol $sym99$_CSETF_INFRNC_SUSPEND_STATUS = makeSymbol("_CSETF-INFRNC-SUSPEND-STATUS");
  public static final SubLSymbol $sym100$INFRNC_ROOT_LINK = makeSymbol("INFRNC-ROOT-LINK");
  public static final SubLSymbol $sym101$_CSETF_INFRNC_ROOT_LINK = makeSymbol("_CSETF-INFRNC-ROOT-LINK");
  public static final SubLSymbol $sym102$INFRNC_RELEVANT_PROBLEMS = makeSymbol("INFRNC-RELEVANT-PROBLEMS");
  public static final SubLSymbol $sym103$_CSETF_INFRNC_RELEVANT_PROBLEMS = makeSymbol("_CSETF-INFRNC-RELEVANT-PROBLEMS");
  public static final SubLSymbol $sym104$INFRNC_STRATEGY_SET = makeSymbol("INFRNC-STRATEGY-SET");
  public static final SubLSymbol $sym105$_CSETF_INFRNC_STRATEGY_SET = makeSymbol("_CSETF-INFRNC-STRATEGY-SET");
  public static final SubLSymbol $sym106$INFRNC_CONTROL_PROCESS = makeSymbol("INFRNC-CONTROL-PROCESS");
  public static final SubLSymbol $sym107$_CSETF_INFRNC_CONTROL_PROCESS = makeSymbol("_CSETF-INFRNC-CONTROL-PROCESS");
  public static final SubLSymbol $sym108$INFRNC_INTERRUPTING_PROCESSES = makeSymbol("INFRNC-INTERRUPTING-PROCESSES");
  public static final SubLSymbol $sym109$_CSETF_INFRNC_INTERRUPTING_PROCESSES = makeSymbol("_CSETF-INFRNC-INTERRUPTING-PROCESSES");
  public static final SubLSymbol $sym110$INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED = makeSymbol("INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED");
  public static final SubLSymbol $sym111$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH_REACHED = makeSymbol("_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH-REACHED");
  public static final SubLSymbol $sym112$INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY = makeSymbol("INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY");
  public static final SubLSymbol $sym113$_CSETF_INFRNC_DISJUNCTION_FREE_EL_VARS_POLICY = makeSymbol("_CSETF-INFRNC-DISJUNCTION-FREE-EL-VARS-POLICY");
  public static final SubLSymbol $sym114$INFRNC_RESULT_UNIQUENESS_CRITERION = makeSymbol("INFRNC-RESULT-UNIQUENESS-CRITERION");
  public static final SubLSymbol $sym115$_CSETF_INFRNC_RESULT_UNIQUENESS_CRITERION = makeSymbol("_CSETF-INFRNC-RESULT-UNIQUENESS-CRITERION");
  public static final SubLSymbol $sym116$INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeSymbol("INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $sym117$_CSETF_INFRNC_ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeSymbol("_CSETF-INFRNC-ALLOW-HL-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $sym118$INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeSymbol("INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $sym119$_CSETF_INFRNC_ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeSymbol("_CSETF-INFRNC-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $sym120$INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeSymbol("INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $sym121$_CSETF_INFRNC_ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeSymbol("_CSETF-INFRNC-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $sym122$INFRNC_ALLOW_INDETERMINATE_RESULTS_ = makeSymbol("INFRNC-ALLOW-INDETERMINATE-RESULTS?");
  public static final SubLSymbol $sym123$_CSETF_INFRNC_ALLOW_INDETERMINATE_RESULTS_ = makeSymbol("_CSETF-INFRNC-ALLOW-INDETERMINATE-RESULTS?");
  public static final SubLSymbol $sym124$INFRNC_ALLOWED_RULES = makeSymbol("INFRNC-ALLOWED-RULES");
  public static final SubLSymbol $sym125$_CSETF_INFRNC_ALLOWED_RULES = makeSymbol("_CSETF-INFRNC-ALLOWED-RULES");
  public static final SubLSymbol $sym126$INFRNC_FORBIDDEN_RULES = makeSymbol("INFRNC-FORBIDDEN-RULES");
  public static final SubLSymbol $sym127$_CSETF_INFRNC_FORBIDDEN_RULES = makeSymbol("_CSETF-INFRNC-FORBIDDEN-RULES");
  public static final SubLSymbol $sym128$INFRNC_ALLOWED_MODULES = makeSymbol("INFRNC-ALLOWED-MODULES");
  public static final SubLSymbol $sym129$_CSETF_INFRNC_ALLOWED_MODULES = makeSymbol("_CSETF-INFRNC-ALLOWED-MODULES");
  public static final SubLSymbol $sym130$INFRNC_ALLOW_ABNORMALITY_CHECKING_ = makeSymbol("INFRNC-ALLOW-ABNORMALITY-CHECKING?");
  public static final SubLSymbol $sym131$_CSETF_INFRNC_ALLOW_ABNORMALITY_CHECKING_ = makeSymbol("_CSETF-INFRNC-ALLOW-ABNORMALITY-CHECKING?");
  public static final SubLSymbol $sym132$INFRNC_TRANSITIVE_CLOSURE_MODE = makeSymbol("INFRNC-TRANSITIVE-CLOSURE-MODE");
  public static final SubLSymbol $sym133$_CSETF_INFRNC_TRANSITIVE_CLOSURE_MODE = makeSymbol("_CSETF-INFRNC-TRANSITIVE-CLOSURE-MODE");
  public static final SubLSymbol $sym134$INFRNC_PROBLEM_STORE_PRIVATE_ = makeSymbol("INFRNC-PROBLEM-STORE-PRIVATE?");
  public static final SubLSymbol $sym135$_CSETF_INFRNC_PROBLEM_STORE_PRIVATE_ = makeSymbol("_CSETF-INFRNC-PROBLEM-STORE-PRIVATE?");
  public static final SubLSymbol $sym136$INFRNC_CONTINUABLE_ = makeSymbol("INFRNC-CONTINUABLE?");
  public static final SubLSymbol $sym137$_CSETF_INFRNC_CONTINUABLE_ = makeSymbol("_CSETF-INFRNC-CONTINUABLE?");
  public static final SubLSymbol $sym138$INFRNC_BROWSABLE_ = makeSymbol("INFRNC-BROWSABLE?");
  public static final SubLSymbol $sym139$_CSETF_INFRNC_BROWSABLE_ = makeSymbol("_CSETF-INFRNC-BROWSABLE?");
  public static final SubLSymbol $sym140$INFRNC_RETURN_TYPE = makeSymbol("INFRNC-RETURN-TYPE");
  public static final SubLSymbol $sym141$_CSETF_INFRNC_RETURN_TYPE = makeSymbol("_CSETF-INFRNC-RETURN-TYPE");
  public static final SubLSymbol $sym142$INFRNC_ANSWER_LANGUAGE = makeSymbol("INFRNC-ANSWER-LANGUAGE");
  public static final SubLSymbol $sym143$_CSETF_INFRNC_ANSWER_LANGUAGE = makeSymbol("_CSETF-INFRNC-ANSWER-LANGUAGE");
  public static final SubLSymbol $sym144$INFRNC_CACHE_RESULTS_ = makeSymbol("INFRNC-CACHE-RESULTS?");
  public static final SubLSymbol $sym145$_CSETF_INFRNC_CACHE_RESULTS_ = makeSymbol("_CSETF-INFRNC-CACHE-RESULTS?");
  public static final SubLSymbol $sym146$INFRNC_BLOCKING_ = makeSymbol("INFRNC-BLOCKING?");
  public static final SubLSymbol $sym147$_CSETF_INFRNC_BLOCKING_ = makeSymbol("_CSETF-INFRNC-BLOCKING?");
  public static final SubLSymbol $sym148$INFRNC_MAX_NUMBER = makeSymbol("INFRNC-MAX-NUMBER");
  public static final SubLSymbol $sym149$_CSETF_INFRNC_MAX_NUMBER = makeSymbol("_CSETF-INFRNC-MAX-NUMBER");
  public static final SubLSymbol $sym150$INFRNC_MAX_TIME = makeSymbol("INFRNC-MAX-TIME");
  public static final SubLSymbol $sym151$_CSETF_INFRNC_MAX_TIME = makeSymbol("_CSETF-INFRNC-MAX-TIME");
  public static final SubLSymbol $sym152$INFRNC_MAX_STEP = makeSymbol("INFRNC-MAX-STEP");
  public static final SubLSymbol $sym153$_CSETF_INFRNC_MAX_STEP = makeSymbol("_CSETF-INFRNC-MAX-STEP");
  public static final SubLSymbol $sym154$INFRNC_MODE = makeSymbol("INFRNC-MODE");
  public static final SubLSymbol $sym155$_CSETF_INFRNC_MODE = makeSymbol("_CSETF-INFRNC-MODE");
  public static final SubLSymbol $sym156$INFRNC_FORWARD_MAX_TIME = makeSymbol("INFRNC-FORWARD-MAX-TIME");
  public static final SubLSymbol $sym157$_CSETF_INFRNC_FORWARD_MAX_TIME = makeSymbol("_CSETF-INFRNC-FORWARD-MAX-TIME");
  public static final SubLSymbol $sym158$INFRNC_MAX_PROOF_DEPTH = makeSymbol("INFRNC-MAX-PROOF-DEPTH");
  public static final SubLSymbol $sym159$_CSETF_INFRNC_MAX_PROOF_DEPTH = makeSymbol("_CSETF-INFRNC-MAX-PROOF-DEPTH");
  public static final SubLSymbol $sym160$INFRNC_MAX_TRANSFORMATION_DEPTH = makeSymbol("INFRNC-MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $sym161$_CSETF_INFRNC_MAX_TRANSFORMATION_DEPTH = makeSymbol("_CSETF-INFRNC-MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $sym162$INFRNC_PROBABLY_APPROXIMATELY_DONE = makeSymbol("INFRNC-PROBABLY-APPROXIMATELY-DONE");
  public static final SubLSymbol $sym163$_CSETF_INFRNC_PROBABLY_APPROXIMATELY_DONE = makeSymbol("_CSETF-INFRNC-PROBABLY-APPROXIMATELY-DONE");
  public static final SubLSymbol $sym164$INFRNC_METRICS_TEMPLATE = makeSymbol("INFRNC-METRICS-TEMPLATE");
  public static final SubLSymbol $sym165$_CSETF_INFRNC_METRICS_TEMPLATE = makeSymbol("_CSETF-INFRNC-METRICS-TEMPLATE");
  public static final SubLSymbol $sym166$INFRNC_START_UNIVERSAL_TIME = makeSymbol("INFRNC-START-UNIVERSAL-TIME");
  public static final SubLSymbol $sym167$_CSETF_INFRNC_START_UNIVERSAL_TIME = makeSymbol("_CSETF-INFRNC-START-UNIVERSAL-TIME");
  public static final SubLSymbol $sym168$INFRNC_START_INTERNAL_REAL_TIME = makeSymbol("INFRNC-START-INTERNAL-REAL-TIME");
  public static final SubLSymbol $sym169$_CSETF_INFRNC_START_INTERNAL_REAL_TIME = makeSymbol("_CSETF-INFRNC-START-INTERNAL-REAL-TIME");
  public static final SubLSymbol $sym170$INFRNC_END_INTERNAL_REAL_TIME = makeSymbol("INFRNC-END-INTERNAL-REAL-TIME");
  public static final SubLSymbol $sym171$_CSETF_INFRNC_END_INTERNAL_REAL_TIME = makeSymbol("_CSETF-INFRNC-END-INTERNAL-REAL-TIME");
  public static final SubLSymbol $sym172$INFRNC_PAD_INTERNAL_REAL_TIME = makeSymbol("INFRNC-PAD-INTERNAL-REAL-TIME");
  public static final SubLSymbol $sym173$_CSETF_INFRNC_PAD_INTERNAL_REAL_TIME = makeSymbol("_CSETF-INFRNC-PAD-INTERNAL-REAL-TIME");
  public static final SubLSymbol $sym174$INFRNC_CUMULATIVE_TIME = makeSymbol("INFRNC-CUMULATIVE-TIME");
  public static final SubLSymbol $sym175$_CSETF_INFRNC_CUMULATIVE_TIME = makeSymbol("_CSETF-INFRNC-CUMULATIVE-TIME");
  public static final SubLSymbol $sym176$INFRNC_STEP_COUNT = makeSymbol("INFRNC-STEP-COUNT");
  public static final SubLSymbol $sym177$_CSETF_INFRNC_STEP_COUNT = makeSymbol("_CSETF-INFRNC-STEP-COUNT");
  public static final SubLSymbol $sym178$INFRNC_CUMULATIVE_STEP_COUNT = makeSymbol("INFRNC-CUMULATIVE-STEP-COUNT");
  public static final SubLSymbol $sym179$_CSETF_INFRNC_CUMULATIVE_STEP_COUNT = makeSymbol("_CSETF-INFRNC-CUMULATIVE-STEP-COUNT");
  public static final SubLSymbol $sym180$INFRNC_EVENTS = makeSymbol("INFRNC-EVENTS");
  public static final SubLSymbol $sym181$_CSETF_INFRNC_EVENTS = makeSymbol("_CSETF-INFRNC-EVENTS");
  public static final SubLSymbol $sym182$INFRNC_HALT_CONDITIONS = makeSymbol("INFRNC-HALT-CONDITIONS");
  public static final SubLSymbol $sym183$_CSETF_INFRNC_HALT_CONDITIONS = makeSymbol("_CSETF-INFRNC-HALT-CONDITIONS");
  public static final SubLSymbol $sym184$INFRNC_ACCUMULATORS = makeSymbol("INFRNC-ACCUMULATORS");
  public static final SubLSymbol $sym185$_CSETF_INFRNC_ACCUMULATORS = makeSymbol("_CSETF-INFRNC-ACCUMULATORS");
  public static final SubLSymbol $sym186$INFRNC_PROOF_WATERMARK = makeSymbol("INFRNC-PROOF-WATERMARK");
  public static final SubLSymbol $sym187$_CSETF_INFRNC_PROOF_WATERMARK = makeSymbol("_CSETF-INFRNC-PROOF-WATERMARK");
  public static final SubLSymbol $sym188$INFRNC_PROBLEM_WORKING_TIME_DATA = makeSymbol("INFRNC-PROBLEM-WORKING-TIME-DATA");
  public static final SubLSymbol $sym189$_CSETF_INFRNC_PROBLEM_WORKING_TIME_DATA = makeSymbol("_CSETF-INFRNC-PROBLEM-WORKING-TIME-DATA");
  public static final SubLSymbol $sym190$INFRNC_TYPE = makeSymbol("INFRNC-TYPE");
  public static final SubLSymbol $sym191$_CSETF_INFRNC_TYPE = makeSymbol("_CSETF-INFRNC-TYPE");
  public static final SubLSymbol $sym192$INFRNC_DATA = makeSymbol("INFRNC-DATA");
  public static final SubLSymbol $sym193$_CSETF_INFRNC_DATA = makeSymbol("_CSETF-INFRNC-DATA");
  public static final SubLSymbol $kw194$SUID = makeKeyword("SUID");
  public static final SubLSymbol $kw195$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
  public static final SubLSymbol $kw196$FORWARD_PROPAGATE = makeKeyword("FORWARD-PROPAGATE");
  public static final SubLSymbol $kw197$INPUT_MT = makeKeyword("INPUT-MT");
  public static final SubLSymbol $kw198$INPUT_EL_QUERY = makeKeyword("INPUT-EL-QUERY");
  public static final SubLSymbol $kw199$INPUT_NON_EXPLANATORY_EL_QUERY = makeKeyword("INPUT-NON-EXPLANATORY-EL-QUERY");
  public static final SubLSymbol $kw200$INPUT_QUERY_PROPERTIES = makeKeyword("INPUT-QUERY-PROPERTIES");
  public static final SubLSymbol $kw201$MT = makeKeyword("MT");
  public static final SubLSymbol $kw202$EL_QUERY = makeKeyword("EL-QUERY");
  public static final SubLSymbol $kw203$EL_BINDINGS = makeKeyword("EL-BINDINGS");
  public static final SubLSymbol $kw204$HL_QUERY = makeKeyword("HL-QUERY");
  public static final SubLSymbol $kw205$EXPLANATORY_SUBQUERY = makeKeyword("EXPLANATORY-SUBQUERY");
  public static final SubLSymbol $kw206$NON_EXPLANATORY_SUBQUERY = makeKeyword("NON-EXPLANATORY-SUBQUERY");
  public static final SubLSymbol $kw207$FREE_HL_VARS = makeKeyword("FREE-HL-VARS");
  public static final SubLSymbol $kw208$HYPOTHETICAL_BINDINGS = makeKeyword("HYPOTHETICAL-BINDINGS");
  public static final SubLSymbol $kw209$ANSWER_ID_INDEX = makeKeyword("ANSWER-ID-INDEX");
  public static final SubLSymbol $kw210$ANSWER_BINDINGS_INDEX = makeKeyword("ANSWER-BINDINGS-INDEX");
  public static final SubLSymbol $kw211$NEW_ANSWER_ID_START = makeKeyword("NEW-ANSWER-ID-START");
  public static final SubLSymbol $kw212$NEW_ANSWER_JUSTIFICATIONS = makeKeyword("NEW-ANSWER-JUSTIFICATIONS");
  public static final SubLSymbol $kw213$STATUS = makeKeyword("STATUS");
  public static final SubLSymbol $kw214$SUSPEND_STATUS = makeKeyword("SUSPEND-STATUS");
  public static final SubLSymbol $kw215$ROOT_LINK = makeKeyword("ROOT-LINK");
  public static final SubLSymbol $kw216$RELEVANT_PROBLEMS = makeKeyword("RELEVANT-PROBLEMS");
  public static final SubLSymbol $kw217$STRATEGY_SET = makeKeyword("STRATEGY-SET");
  public static final SubLSymbol $kw218$CONTROL_PROCESS = makeKeyword("CONTROL-PROCESS");
  public static final SubLSymbol $kw219$INTERRUPTING_PROCESSES = makeKeyword("INTERRUPTING-PROCESSES");
  public static final SubLSymbol $kw220$MAX_TRANSFORMATION_DEPTH_REACHED = makeKeyword("MAX-TRANSFORMATION-DEPTH-REACHED");
  public static final SubLSymbol $kw221$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
  public static final SubLSymbol $kw222$RESULT_UNIQUENESS_CRITERION = makeKeyword("RESULT-UNIQUENESS-CRITERION");
  public static final SubLSymbol $kw223$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw224$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw225$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw226$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
  public static final SubLSymbol $kw227$ALLOWED_RULES = makeKeyword("ALLOWED-RULES");
  public static final SubLSymbol $kw228$FORBIDDEN_RULES = makeKeyword("FORBIDDEN-RULES");
  public static final SubLSymbol $kw229$ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
  public static final SubLSymbol $kw230$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
  public static final SubLSymbol $kw231$TRANSITIVE_CLOSURE_MODE = makeKeyword("TRANSITIVE-CLOSURE-MODE");
  public static final SubLSymbol $kw232$PROBLEM_STORE_PRIVATE_ = makeKeyword("PROBLEM-STORE-PRIVATE?");
  public static final SubLSymbol $kw233$CONTINUABLE_ = makeKeyword("CONTINUABLE?");
  public static final SubLSymbol $kw234$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $kw235$RETURN_TYPE = makeKeyword("RETURN-TYPE");
  public static final SubLSymbol $kw236$ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
  public static final SubLSymbol $kw237$CACHE_RESULTS_ = makeKeyword("CACHE-RESULTS?");
  public static final SubLSymbol $kw238$BLOCKING_ = makeKeyword("BLOCKING?");
  public static final SubLSymbol $kw239$MAX_NUMBER = makeKeyword("MAX-NUMBER");
  public static final SubLSymbol $kw240$MAX_TIME = makeKeyword("MAX-TIME");
  public static final SubLSymbol $kw241$MAX_STEP = makeKeyword("MAX-STEP");
  public static final SubLSymbol $kw242$MODE = makeKeyword("MODE");
  public static final SubLSymbol $kw243$FORWARD_MAX_TIME = makeKeyword("FORWARD-MAX-TIME");
  public static final SubLSymbol $kw244$MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");
  public static final SubLSymbol $kw245$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw246$PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
  public static final SubLSymbol $kw247$METRICS_TEMPLATE = makeKeyword("METRICS-TEMPLATE");
  public static final SubLSymbol $kw248$START_UNIVERSAL_TIME = makeKeyword("START-UNIVERSAL-TIME");
  public static final SubLSymbol $kw249$START_INTERNAL_REAL_TIME = makeKeyword("START-INTERNAL-REAL-TIME");
  public static final SubLSymbol $kw250$END_INTERNAL_REAL_TIME = makeKeyword("END-INTERNAL-REAL-TIME");
  public static final SubLSymbol $kw251$PAD_INTERNAL_REAL_TIME = makeKeyword("PAD-INTERNAL-REAL-TIME");
  public static final SubLSymbol $kw252$CUMULATIVE_TIME = makeKeyword("CUMULATIVE-TIME");
  public static final SubLSymbol $kw253$STEP_COUNT = makeKeyword("STEP-COUNT");
  public static final SubLSymbol $kw254$CUMULATIVE_STEP_COUNT = makeKeyword("CUMULATIVE-STEP-COUNT");
  public static final SubLSymbol $kw255$EVENTS = makeKeyword("EVENTS");
  public static final SubLSymbol $kw256$HALT_CONDITIONS = makeKeyword("HALT-CONDITIONS");
  public static final SubLSymbol $kw257$ACCUMULATORS = makeKeyword("ACCUMULATORS");
  public static final SubLSymbol $kw258$PROOF_WATERMARK = makeKeyword("PROOF-WATERMARK");
  public static final SubLSymbol $kw259$PROBLEM_WORKING_TIME_DATA = makeKeyword("PROBLEM-WORKING-TIME-DATA");
  public static final SubLSymbol $kw260$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw261$DATA = makeKeyword("DATA");
  public static final SubLString $str262$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw263$DEAD = makeKeyword("DEAD");
  public static final SubLString $str264$_Invalid_INFERENCE__s_ = makeString("<Invalid INFERENCE ~s>");
  public static final SubLString $str265$_INFERENCE__a__a__a__a_in__a_ = makeString("<INFERENCE ~a.~a:~a:~a in ~a>");
  public static final SubLSymbol $sym266$SXHASH_INFERENCE_METHOD = makeSymbol("SXHASH-INFERENCE-METHOD");
  public static final SubLSymbol $kw267$NEW = makeKeyword("NEW");
  public static final SubLSymbol $kw268$PREPARED = makeKeyword("PREPARED");
  public static final SubLSymbol $kw269$READY = makeKeyword("READY");
  public static final SubLSymbol $kw270$RUNNING = makeKeyword("RUNNING");
  public static final SubLSymbol $kw271$SUSPENDED = makeKeyword("SUSPENDED");
  public static final SubLList $list272 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym273$DO_SET = makeSymbol("DO-SET");
  public static final SubLSymbol $sym274$INFERENCE_RELEVANT_PROBLEMS = makeSymbol("INFERENCE-RELEVANT-PROBLEMS");
  public static final SubLList $list275 = list(list(makeSymbol("JUST-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym276$DO_QUEUE_ELEMENTS = makeSymbol("DO-QUEUE-ELEMENTS");
  public static final SubLSymbol $sym277$INFERENCE_NEW_ANSWER_JUSTIFICATIONS = makeSymbol("INFERENCE-NEW-ANSWER-JUSTIFICATIONS");
  public static final SubLList $list278 = list(list(makeSymbol("ANSWER-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym279$START_ID = makeUninternedSymbol("START-ID");
  public static final SubLSymbol $sym280$END_ID = makeUninternedSymbol("END-ID");
  public static final SubLSymbol $sym281$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym282$INF = makeUninternedSymbol("INF");
  public static final SubLSymbol $sym283$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym284$INFERENCE_NEW_ANSWER_ID_START = makeSymbol("INFERENCE-NEW-ANSWER-ID-START");
  public static final SubLSymbol $sym285$INFERENCE_NEXT_NEW_ANSWER_ID = makeSymbol("INFERENCE-NEXT-NEW-ANSWER-ID");
  public static final SubLSymbol $sym286$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym287$1_ = makeSymbol("1+");
  public static final SubLSymbol $sym288$__ = makeSymbol(">=");
  public static final SubLSymbol $sym289$FIND_INFERENCE_ANSWER_BY_ID = makeSymbol("FIND-INFERENCE-ANSWER-BY-ID");
  public static final SubLList $list290 = list(list(makeSymbol("ANSWER-VAR"), makeSymbol("INFERENCE"), makeSymbol("&KEY"), makeSymbol("ORDERED")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list291 = list(makeKeyword("ORDERED"));
  public static final SubLSymbol $kw292$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw293$ORDERED = makeKeyword("ORDERED");
  public static final SubLSymbol $sym294$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym295$DO_ID_INDEX = makeSymbol("DO-ID-INDEX");
  public static final SubLSymbol $sym296$INFERENCE_ANSWER_ID_INDEX = makeSymbol("INFERENCE-ANSWER-ID-INDEX");
  public static final SubLSymbol $sym297$IGNORE = makeSymbol("IGNORE");
  public static final SubLList $list298 = list(list(makeSymbol("ANSWER-VAR"), makeSymbol("INFERENCE"), makeSymbol("START-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym299$START_ID = makeUninternedSymbol("START-ID");
  public static final SubLSymbol $sym300$END_ID = makeUninternedSymbol("END-ID");
  public static final SubLSymbol $sym301$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym302$INF = makeUninternedSymbol("INF");
  public static final SubLSymbol $sym303$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym304$ANSWER = makeUninternedSymbol("ANSWER");
  public static final SubLSymbol $sym305$DO_INFERENCE_ANSWERS = makeSymbol("DO-INFERENCE-ANSWERS");
  public static final SubLSymbol $sym306$DO_INFERENCE_ANSWER_JUSTIFICATIONS = makeSymbol("DO-INFERENCE-ANSWER-JUSTIFICATIONS");
  public static final SubLList $list307 = list(list(makeSymbol("PROCESS-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym308$DO_QUEUE_DEQUEUE = makeSymbol("DO-QUEUE-DEQUEUE");
  public static final SubLSymbol $sym309$INFERENCE_INTERRUPTING_PROCESSES = makeSymbol("INFERENCE-INTERRUPTING-PROCESSES");
  public static final SubLList $list310 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("INFERENCE"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list311 = list(makeKeyword("PROOF-STATUS"));
  public static final SubLSymbol $kw312$PROOF_STATUS = makeKeyword("PROOF-STATUS");
  public static final SubLSymbol $sym313$ROOT_PROBLEM = makeUninternedSymbol("ROOT-PROBLEM");
  public static final SubLSymbol $sym314$INFERENCE_ROOT_PROBLEM = makeSymbol("INFERENCE-ROOT-PROBLEM");
  public static final SubLSymbol $sym315$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym316$DO_PROBLEM_PROOFS = makeSymbol("DO-PROBLEM-PROOFS");
  public static final SubLList $list317 = list(list(makeSymbol("RULE-VAR"), makeSymbol("INFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list318 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw319$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym320$INFERENCE_ALLOWED_RULES = makeSymbol("INFERENCE-ALLOWED-RULES");
  public static final SubLList $list321 = list(list(makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym322$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLSymbol $sym323$INFERENCE_PROBLEM_WORKING_TIME_LOCK = makeSymbol("INFERENCE-PROBLEM-WORKING-TIME-LOCK");
  public static final SubLSymbol $sym324$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
  public static final SubLSymbol $kw325$TAUTOLOGY = makeKeyword("TAUTOLOGY");
  public static final SubLSymbol $kw326$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym327$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $kw328$FREE = makeKeyword("FREE");
  public static final SubLSymbol $sym329$DO_INFERENCE_NEW_ANSWERS = makeSymbol("DO-INFERENCE-NEW-ANSWERS");
  public static final SubLSymbol $sym330$DO_INFERENCE_NEW_ANSWER_JUSTIFICATIONS = makeSymbol("DO-INFERENCE-NEW-ANSWER-JUSTIFICATIONS");
  public static final SubLSymbol $sym331$FORWARD_PROPAGATE_P = makeSymbol("FORWARD-PROPAGATE-P");
  public static final SubLSymbol $sym332$POSSIBLY_MT_P = makeSymbol("POSSIBLY-MT-P");
  public static final SubLSymbol $sym333$POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P");
  public static final SubLSymbol $sym334$QUERY_PROPERTIES_P = makeSymbol("QUERY-PROPERTIES-P");
  public static final SubLSymbol $sym335$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym336$BINDING_LIST_P = makeSymbol("BINDING-LIST-P");
  public static final SubLSymbol $sym337$PROBLEM_QUERY_P = makeSymbol("PROBLEM-QUERY-P");
  public static final SubLSymbol $sym338$EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol("EXPLANATORY-SUBQUERY-SPEC-P");
  public static final SubLSymbol $sym339$NON_EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol("NON-EXPLANATORY-SUBQUERY-SPEC-P");
  public static final SubLSymbol $sym340$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym341$INFERENCE_STATUS_P = makeSymbol("INFERENCE-STATUS-P");
  public static final SubLSymbol $sym342$INFERENCE_SUSPEND_STATUS_P = makeSymbol("INFERENCE-SUSPEND-STATUS-P");
  public static final SubLSymbol $sym343$ANSWER_LINK_P = makeSymbol("ANSWER-LINK-P");
  public static final SubLSymbol $sym344$PROCESSP = makeSymbol("PROCESSP");
  public static final SubLSymbol $sym345$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym346$INFERENCE_DISJUNCTION_FREE_EL_VARS_POLICY_P = makeSymbol("INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY-P");
  public static final SubLSymbol $sym347$RESULT_UNIQUENESS_CRITERION_P = makeSymbol("RESULT-UNIQUENESS-CRITERION-P");
  public static final SubLSymbol $sym348$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $sym349$ALLOWED_MODULES_SPEC_P = makeSymbol("ALLOWED-MODULES-SPEC-P");
  public static final SubLSymbol $sym350$INFERENCE_TRANSITIVE_CLOSURE_MODE_P = makeSymbol("INFERENCE-TRANSITIVE-CLOSURE-MODE-P");
  public static final SubLSymbol $sym351$INFERENCE_RETURN_TYPE_P = makeSymbol("INFERENCE-RETURN-TYPE-P");
  public static final SubLSymbol $sym352$INFERENCE_ANSWER_LANGUAGE_P = makeSymbol("INFERENCE-ANSWER-LANGUAGE-P");
  public static final SubLSymbol $sym353$NON_NEGATIVE_NUMBER_P = makeSymbol("NON-NEGATIVE-NUMBER-P");
  public static final SubLSymbol $sym354$INFERENCE_MODE_P = makeSymbol("INFERENCE-MODE-P");
  public static final SubLString $str355$Forward_max_time__s_cannot_be_gre = makeString("Forward max time ~s cannot be greater than max time ~s");
  public static final SubLSymbol $sym356$PROBABILITY_P = makeSymbol("PROBABILITY-P");
  public static final SubLSymbol $sym357$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym358$QUERY_METRIC_P = makeSymbol("QUERY-METRIC-P");
  public static final SubLSymbol $sym359$UNIVERSAL_TIME_P = makeSymbol("UNIVERSAL-TIME-P");
  public static final SubLSymbol $sym360$POTENTIALLY_INFINITE_INTEGER_P = makeSymbol("POTENTIALLY-INFINITE-INTEGER-P");
  public static final SubLSymbol $sym361$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLSymbol $sym362$INFERENCE_EVENT_TYPE_P = makeSymbol("INFERENCE-EVENT-TYPE-P");
  public static final SubLSymbol $sym363$INFERENCE_HALT_CONDITION_P = makeSymbol("INFERENCE-HALT-CONDITION-P");
  public static final SubLSymbol $sym364$INFERENCE_TYPE_P = makeSymbol("INFERENCE-TYPE-P");
  public static final SubLList $list365 = list(list(makeSymbol("STORE-ID-VAR"), makeSymbol("INFERENCE-ID-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym366$INFERENCE_VAR = makeUninternedSymbol("INFERENCE-VAR");
  public static final SubLSymbol $sym367$INFERENCE_PROBLEM_STORE_SUID = makeSymbol("INFERENCE-PROBLEM-STORE-SUID");
  public static final SubLSymbol $sym368$INFERENCE_SUID = makeSymbol("INFERENCE-SUID");
  public static final SubLSymbol $kw369$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw370$NEG = makeKeyword("NEG");
  public static final SubLList $list371 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $sym372$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
  public static final SubLSymbol $kw373$POS = makeKeyword("POS");
  public static final SubLList $list374 = list(makeSymbol("HL-MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $sym375$QUERY_PROPERTY_P = makeSymbol("QUERY-PROPERTY-P");
  public static final SubLSymbol $sym376$NEW_CYC_QUERY = makeSymbol("NEW-CYC-QUERY");
  public static final SubLString $str377$_new_cyc_query_A = makeString("(new-cyc-query~A");
  public static final SubLString $str378$_____A = makeString("~%  ~A");
  public static final SubLString $str379$_A = makeString("~A");
  public static final SubLString $str380$______ = makeString("~%  `(");
  public static final SubLSymbol $kw381$DOWNCASE = makeKeyword("DOWNCASE");
  public static final SubLString $str382$_S___find_problem_store_by_id__S_ = makeString("~S ,(find-problem-store-by-id ~S)~%    ");
  public static final SubLSymbol $kw383$ALL = makeKeyword("ALL");
  public static final SubLString $str384$_S___list__ = makeString("~S ,(list~%");
  public static final SubLString $str385$_______find_object_by_hl_external = makeString("      (find-object-by-hl-external-id-string ~S)");
  public static final SubLString $str386$_______ = makeString(")~%    ");
  public static final SubLString $str387$_S__S______ = makeString("~S ~S~%    ");
  public static final SubLString $str388$_ = makeString(")");
  public static final SubLSymbol $kw389$PROOF = makeKeyword("PROOF");
  public static final SubLSymbol $kw390$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw391$NONE = makeKeyword("NONE");
  public static final SubLSymbol $sym392$INFERENCE_ACCUMULATOR_TYPE_P = makeSymbol("INFERENCE-ACCUMULATOR-TYPE-P");
  public static final SubLSymbol $sym393$ACCUMULATOR_P = makeSymbol("ACCUMULATOR-P");
  public static final SubLSymbol $sym394$_PAD_TIMES_TO_FIRST_ANSWER_ = makeSymbol("*PAD-TIMES-TO-FIRST-ANSWER*");
  public static final SubLSymbol $kw395$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $kw396$POSITIVE_INFINITY = makeKeyword("POSITIVE-INFINITY");
  public static final SubLSymbol $sym397$_ = makeSymbol("<");
  public static final SubLSymbol $kw398$LOOK_NO_DEEPER_FOR_ADDITIONAL_ANSWERS = makeKeyword("LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS");
  public static final SubLString $str399$got_a_null_answer_for__s = makeString("got a null answer for ~s");
  public static final SubLSymbol $kw400$GOOD = makeKeyword("GOOD");
  public static final SubLSymbol $kw401$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $kw402$NO_GOOD = makeKeyword("NO-GOOD");
  public static final SubLSymbol $kw403$NEUTRAL = makeKeyword("NEUTRAL");
  public static final SubLSymbol $sym404$INFERENCE_STATIC_PROPERTIES_P = makeSymbol("INFERENCE-STATIC-PROPERTIES-P");
  public static final SubLSymbol $sym405$ALLOWED_RULES_SPEC_P = makeSymbol("ALLOWED-RULES-SPEC-P");
  public static final SubLSymbol $sym406$FORBIDDEN_RULES_SPEC_P = makeSymbol("FORBIDDEN-RULES-SPEC-P");
  public static final SubLSymbol $sym407$QUERY_DYNAMIC_PROPERTIES_P = makeSymbol("QUERY-DYNAMIC-PROPERTIES-P");
  public static final SubLSymbol $kw408$INFERENCE_MODE = makeKeyword("INFERENCE-MODE");
  public static final SubLSymbol $sym409$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $sym410$STRATEGY_P = makeSymbol("STRATEGY-P");
  public static final SubLSymbol $sym411$INFERENCE_ANSWER_P = makeSymbol("INFERENCE-ANSWER-P");
  public static final SubLSymbol $sym412$INFERENCE_ANSWER_JUSTIFICATION_P = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-P");
  public static final SubLString $str413$variables__S_were_removed = makeString("variables ~S were removed");
  public static final SubLString $str414$variables__S_were_added = makeString("variables ~S were added");
  public static final SubLString $str415$variables__S_contain_duplications = makeString("variables ~S contain duplications");
  public static final SubLSymbol $kw416$SIMPLEST = makeKeyword("SIMPLEST");
  public static final SubLSymbol $sym417$SIMPLEST_INFERENCE_P = makeSymbol("SIMPLEST-INFERENCE-P");
  public static final SubLSymbol $sym418$STRATEGY_TYPE_P = makeSymbol("STRATEGY-TYPE-P");
  public static final SubLSymbol $sym419$INFERENCE_ANSWER = makeSymbol("INFERENCE-ANSWER");
  public static final SubLList $list420 = list(makeSymbol("SUID"), makeSymbol("INFERENCE"), makeSymbol("BINDINGS"), makeSymbol("JUSTIFICATIONS"), makeSymbol("ELAPSED-CREATION-TIME"), makeSymbol("STEP-COUNT"));
  public static final SubLList $list421 = list(makeKeyword("SUID"), makeKeyword("INFERENCE"), makeKeyword("BINDINGS"), makeKeyword("JUSTIFICATIONS"), makeKeyword("ELAPSED-CREATION-TIME"), makeKeyword("STEP-COUNT"));
  public static final SubLList $list422 = list(makeSymbol("INF-ANSWER-SUID"), makeSymbol("INF-ANSWER-INFERENCE"), makeSymbol("INF-ANSWER-BINDINGS"), makeSymbol("INF-ANSWER-JUSTIFICATIONS"), makeSymbol("INF-ANSWER-ELAPSED-CREATION-TIME"), makeSymbol("INF-ANSWER-STEP-COUNT"));
  public static final SubLList $list423 = list(makeSymbol("_CSETF-INF-ANSWER-SUID"), makeSymbol("_CSETF-INF-ANSWER-INFERENCE"), makeSymbol("_CSETF-INF-ANSWER-BINDINGS"), makeSymbol("_CSETF-INF-ANSWER-JUSTIFICATIONS"), makeSymbol("_CSETF-INF-ANSWER-ELAPSED-CREATION-TIME"), makeSymbol("_CSETF-INF-ANSWER-STEP-COUNT"));
  public static final SubLSymbol $sym424$PRINT_INFERENCE_ANSWER = makeSymbol("PRINT-INFERENCE-ANSWER");
  public static final SubLSymbol $sym425$INFERENCE_ANSWER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-ANSWER-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym426$INF_ANSWER_SUID = makeSymbol("INF-ANSWER-SUID");
  public static final SubLSymbol $sym427$_CSETF_INF_ANSWER_SUID = makeSymbol("_CSETF-INF-ANSWER-SUID");
  public static final SubLSymbol $sym428$INF_ANSWER_INFERENCE = makeSymbol("INF-ANSWER-INFERENCE");
  public static final SubLSymbol $sym429$_CSETF_INF_ANSWER_INFERENCE = makeSymbol("_CSETF-INF-ANSWER-INFERENCE");
  public static final SubLSymbol $sym430$INF_ANSWER_BINDINGS = makeSymbol("INF-ANSWER-BINDINGS");
  public static final SubLSymbol $sym431$_CSETF_INF_ANSWER_BINDINGS = makeSymbol("_CSETF-INF-ANSWER-BINDINGS");
  public static final SubLSymbol $sym432$INF_ANSWER_JUSTIFICATIONS = makeSymbol("INF-ANSWER-JUSTIFICATIONS");
  public static final SubLSymbol $sym433$_CSETF_INF_ANSWER_JUSTIFICATIONS = makeSymbol("_CSETF-INF-ANSWER-JUSTIFICATIONS");
  public static final SubLSymbol $sym434$INF_ANSWER_ELAPSED_CREATION_TIME = makeSymbol("INF-ANSWER-ELAPSED-CREATION-TIME");
  public static final SubLSymbol $sym435$_CSETF_INF_ANSWER_ELAPSED_CREATION_TIME = makeSymbol("_CSETF-INF-ANSWER-ELAPSED-CREATION-TIME");
  public static final SubLSymbol $sym436$INF_ANSWER_STEP_COUNT = makeSymbol("INF-ANSWER-STEP-COUNT");
  public static final SubLSymbol $sym437$_CSETF_INF_ANSWER_STEP_COUNT = makeSymbol("_CSETF-INF-ANSWER-STEP-COUNT");
  public static final SubLSymbol $kw438$INFERENCE = makeKeyword("INFERENCE");
  public static final SubLSymbol $kw439$JUSTIFICATIONS = makeKeyword("JUSTIFICATIONS");
  public static final SubLSymbol $kw440$ELAPSED_CREATION_TIME = makeKeyword("ELAPSED-CREATION-TIME");
  public static final SubLString $str441$_Invalid_INFERENCE_ANSWER__s_ = makeString("<Invalid INFERENCE-ANSWER ~s>");
  public static final SubLString $str442$_INFERENCE_ANSWER__a_for_INFERENC = makeString("<INFERENCE-ANSWER ~a for INFERENCE ~a.~a:~a>");
  public static final SubLSymbol $sym443$SXHASH_INFERENCE_ANSWER_METHOD = makeSymbol("SXHASH-INFERENCE-ANSWER-METHOD");
  public static final SubLSymbol $sym444$BINDINGS_P = makeSymbol("BINDINGS-P");
  public static final SubLList $list445 = list(list(makeSymbol("JUST-VAR"), makeSymbol("INFERENCE-ANSWER")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym446$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym447$INFERENCE_ANSWER_JUSTIFICATIONS = makeSymbol("INFERENCE-ANSWER-JUSTIFICATIONS");
  public static final SubLList $list448 = list(list(makeSymbol("JUST-VAR"), makeSymbol("INDEX-VAR"), makeSymbol("INFERENCE-ANSWER")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym449$CDOLIST_NUMBERED = makeSymbol("CDOLIST-NUMBERED");
  public static final SubLSymbol $sym450$JUSTIFICATION_EQUAL = makeSymbol("JUSTIFICATION-EQUAL");
  public static final SubLSymbol $sym451$INFERENCE_ANSWER_JUSTIFICATION_SUPPORTS = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS");
  public static final SubLSymbol $kw452$HL = makeKeyword("HL");
  public static final SubLSymbol $kw453$EL = makeKeyword("EL");
  public static final SubLString $str454$_S_was_not_an_inference_answer_la = makeString("~S was not an inference-answer-language-p");
  public static final SubLSymbol $sym455$INFERENCE_ANSWER_EL_SENTENCE = makeSymbol("INFERENCE-ANSWER-EL-SENTENCE");
  public static final SubLSymbol $sym456$INFERENCE_ANSWER_JUSTIFICATION = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION");
  public static final SubLList $list457 = list(makeSymbol("ANSWER"), makeSymbol("SUPPORTS"), makeSymbol("PROOFS"));
  public static final SubLList $list458 = list(makeKeyword("ANSWER"), makeKeyword("SUPPORTS"), makeKeyword("PROOFS"));
  public static final SubLList $list459 = list(makeSymbol("INF-ANS-JUST-ANSWER"), makeSymbol("INF-ANS-JUST-SUPPORTS"), makeSymbol("INF-ANS-JUST-PROOFS"));
  public static final SubLList $list460 = list(makeSymbol("_CSETF-INF-ANS-JUST-ANSWER"), makeSymbol("_CSETF-INF-ANS-JUST-SUPPORTS"), makeSymbol("_CSETF-INF-ANS-JUST-PROOFS"));
  public static final SubLSymbol $sym461$PRINT_INFERENCE_ANSWER_JUSTIFICATION = makeSymbol("PRINT-INFERENCE-ANSWER-JUSTIFICATION");
  public static final SubLSymbol $sym462$INFERENCE_ANSWER_JUSTIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym463$INF_ANS_JUST_ANSWER = makeSymbol("INF-ANS-JUST-ANSWER");
  public static final SubLSymbol $sym464$_CSETF_INF_ANS_JUST_ANSWER = makeSymbol("_CSETF-INF-ANS-JUST-ANSWER");
  public static final SubLSymbol $sym465$INF_ANS_JUST_SUPPORTS = makeSymbol("INF-ANS-JUST-SUPPORTS");
  public static final SubLSymbol $sym466$_CSETF_INF_ANS_JUST_SUPPORTS = makeSymbol("_CSETF-INF-ANS-JUST-SUPPORTS");
  public static final SubLSymbol $sym467$INF_ANS_JUST_PROOFS = makeSymbol("INF-ANS-JUST-PROOFS");
  public static final SubLSymbol $sym468$_CSETF_INF_ANS_JUST_PROOFS = makeSymbol("_CSETF-INF-ANS-JUST-PROOFS");
  public static final SubLSymbol $kw469$ANSWER = makeKeyword("ANSWER");
  public static final SubLSymbol $kw470$SUPPORTS = makeKeyword("SUPPORTS");
  public static final SubLSymbol $kw471$PROOFS = makeKeyword("PROOFS");
  public static final SubLString $str472$__ = makeString("#<");
  public static final SubLSymbol $kw473$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw474$BASE = makeKeyword("BASE");
  public static final SubLString $str475$_INF_ANS_JUST__s_ = makeString("<INF-ANS-JUST:~s>");
  public static final SubLSymbol $sym476$SXHASH_INFERENCE_ANSWER_JUSTIFICATION_METHOD = makeSymbol("SXHASH-INFERENCE-ANSWER-JUSTIFICATION-METHOD");
  public static final SubLSymbol $sym477$HL_JUSTIFICATION_P = makeSymbol("HL-JUSTIFICATION-P");
  public static final SubLList $list478 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("JUSTIFICATION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym479$INFERENCE_ANSWER_JUSTIFICATION_PROOFS = makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-PROOFS");
  public static final SubLList $list480 = list(list(makeSymbol("JUSTIFICATION-VAR"), makeSymbol("PROOF")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym481$INFERENCE = makeUninternedSymbol("INFERENCE");
  public static final SubLSymbol $sym482$ANSWER = makeUninternedSymbol("ANSWER");
  public static final SubLSymbol $sym483$PROOF_VAR = makeUninternedSymbol("PROOF-VAR");
  public static final SubLSymbol $sym484$DO_PROBLEM_SUPPORTED_INFERENCES = makeSymbol("DO-PROBLEM-SUPPORTED-INFERENCES");
  public static final SubLSymbol $sym485$PROOF_SUPPORTED_PROBLEM = makeSymbol("PROOF-SUPPORTED-PROBLEM");
  public static final SubLSymbol $sym486$MEMBER_ = makeSymbol("MEMBER?");
  public static final SubLList $list487 = list(list(makeSymbol("FUNCTION"), EQ));
  public static final SubLList $list488 = list(list(makeSymbol("SUBPROOF-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym489$ANSWER = makeUninternedSymbol("ANSWER");
  public static final SubLSymbol $sym490$JUSTIFICATION = makeUninternedSymbol("JUSTIFICATION");
  public static final SubLSymbol $sym491$PROOF = makeUninternedSymbol("PROOF");
  public static final SubLSymbol $sym492$DO_INFERENCE_ANSWER_JUSTIFICATION_PROOFS = makeSymbol("DO-INFERENCE-ANSWER-JUSTIFICATION-PROOFS");
  public static final SubLSymbol $sym493$DO_PROOF_ALL_SUBPROOFS = makeSymbol("DO-PROOF-ALL-SUBPROOFS");
  public static final SubLSymbol $sym494$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
  public static final SubLSymbol $sym495$ASSERTION_ID = makeSymbol("ASSERTION-ID");
  public static final SubLSymbol $sym496$PROOF_P = makeSymbol("PROOF-P");
  public static final SubLSymbol $kw497$TV = makeKeyword("TV");
  public static final SubLSymbol $kw498$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw499$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $sym500$INFERENCE_QUERY_METRIC_P = makeSymbol("INFERENCE-QUERY-METRIC-P");
  public static final SubLSymbol $sym501$TERM__ = makeSymbol("TERM-<");
  public static final SubLSymbol $sym502$CAR = makeSymbol("CAR");
  public static final SubLSymbol $kw503$NEW_ROOT_TIMES = makeKeyword("NEW-ROOT-TIMES");
  public static final SubLSymbol $kw504$NEW_ROOT_COUNT = makeKeyword("NEW-ROOT-COUNT");
  public static final SubLSymbol $kw505$PROBLEM_CREATION_TIMES = makeKeyword("PROBLEM-CREATION-TIMES");
  public static final SubLSymbol $kw506$INFERENCE_ANSWER_QUERY_PROPERTIES = makeKeyword("INFERENCE-ANSWER-QUERY-PROPERTIES");
  public static final SubLSymbol $kw507$INFERENCE_STRONGEST_QUERY_PROPERTIES = makeKeyword("INFERENCE-STRONGEST-QUERY-PROPERTIES");
  public static final SubLSymbol $kw508$INFERENCE_MOST_EFFICIENT_QUERY_PROPERTIES = makeKeyword("INFERENCE-MOST-EFFICIENT-QUERY-PROPERTIES");
  public static final SubLString $str509$time_to_implement_metric__S = makeString("time to implement metric ~S");
  public static final SubLSymbol $sym510$PROOF_SUID = makeSymbol("PROOF-SUID");
  public static final SubLSymbol $sym511$_ = makeSymbol(">");
  public static final SubLSymbol $sym512$CDR = makeSymbol("CDR");
  public static final SubLList $list513 = list(list(makeSymbol("TABLE-VAR"), makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym514$INFERENCE_VAR = makeUninternedSymbol("INFERENCE-VAR");
  public static final SubLSymbol $sym515$WITH_INFERENCE_PROBLEM_WORKING_TIME_LOCK = makeSymbol("WITH-INFERENCE-PROBLEM-WORKING-TIME-LOCK");
  public static final SubLSymbol $sym516$INFERENCE_PROBLEM_WORKING_TIME_TABLE = makeSymbol("INFERENCE-PROBLEM-WORKING-TIME-TABLE");
  public static final SubLString $str517$Inference_problem_working_time_lo = makeString("Inference problem working time lock");
  public static final SubLSymbol $sym518$INFERENCES_VAR = makeUninternedSymbol("INFERENCES-VAR");
  public static final SubLSymbol $sym519$INFERENCE_VAR = makeUninternedSymbol("INFERENCE-VAR");
  public static final SubLSymbol $sym520$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");
  public static final SubLSymbol $sym521$START_TIME = makeUninternedSymbol("START-TIME");
  public static final SubLList $list522 = list(list(makeSymbol("CURRENT-CONTROLLING-INFERENCES")));
  public static final SubLList $list523 = list(list(makeSymbol("CURRENT-CONTROLLING-INFERENCE")));
  public static final SubLList $list524 = list(list(makeSymbol("CURRENTLY-EXECUTING-TACTIC")));
  public static final SubLSymbol $sym525$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym526$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym527$POSSIBLY_SIGNAL_SKSI_QUERY_START = makeSymbol("POSSIBLY-SIGNAL-SKSI-QUERY-START");
  public static final SubLSymbol $sym528$INFERENCE_TIME_SO_FAR = makeSymbol("INFERENCE-TIME-SO-FAR");
  public static final SubLList $list529 = list(NIL);
  public static final SubLSymbol $sym530$POSSIBLY_ADD_INFERENCE_SKSI_QUERY_START_TIME = makeSymbol("POSSIBLY-ADD-INFERENCE-SKSI-QUERY-START-TIME");
  public static final SubLSymbol $sym531$POSSIBLY_SIGNAL_SKSI_QUERY_END = makeSymbol("POSSIBLY-SIGNAL-SKSI-QUERY-END");
  public static final SubLSymbol $sym532$POSSIBLY_INCREMENT_INFERENCE_SKSI_QUERY_TOTAL_TIME = makeSymbol("POSSIBLY-INCREMENT-INFERENCE-SKSI-QUERY-TOTAL-TIME");
  public static final SubLSymbol $sym533$_ = makeSymbol("-");
  public static final SubLSymbol $sym534$INFERENCE_WITHIN_SKSI_QUERY_EXECUTION = makeSymbol("INFERENCE-WITHIN-SKSI-QUERY-EXECUTION");
  public static final SubLSymbol $kw535$START_TIME = makeKeyword("START-TIME");
  public static final SubLSymbol $kw536$START = makeKeyword("START");
  public static final SubLSymbol $kw537$END_TIME = makeKeyword("END-TIME");
  public static final SubLSymbol $kw538$END = makeKeyword("END");
  public static final SubLSymbol $kw539$SKSI_QUERY_TOTAL_TIME = makeKeyword("SKSI-QUERY-TOTAL-TIME");
  public static final SubLSymbol $kw540$SKSI_QUERY_START_TIMES = makeKeyword("SKSI-QUERY-START-TIMES");
  public static final SubLList $list541 = list(list(makeSymbol("&KEY"), makeSymbol("SPARQL"), makeSymbol("RESULT-SET")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list542 = list(makeKeyword("SPARQL"), makeKeyword("RESULT-SET"));
  public static final SubLSymbol $kw543$SPARQL = makeKeyword("SPARQL");
  public static final SubLSymbol $kw544$RESULT_SET = makeKeyword("RESULT-SET");
  public static final SubLSymbol $sym545$INFERENCES = makeUninternedSymbol("INFERENCES");
  public static final SubLSymbol $sym546$INFERENCE = makeUninternedSymbol("INFERENCE");
  public static final SubLSymbol $sym547$START = makeUninternedSymbol("START");
  public static final SubLSymbol $sym548$END = makeUninternedSymbol("END");
  public static final SubLSymbol $sym549$COUNT = makeUninternedSymbol("COUNT");
  public static final SubLSymbol $sym550$LAST_ONE = makeSymbol("LAST-ONE");
  public static final SubLSymbol $sym551$FWHEN = makeSymbol("FWHEN");
  public static final SubLSymbol $sym552$INFERENCE_CUMULATIVE_TIME_SO_FAR = makeSymbol("INFERENCE-CUMULATIVE-TIME-SO-FAR");
  public static final SubLSymbol $sym553$LENGTH = makeSymbol("LENGTH");
  public static final SubLSymbol $sym554$POSSIBLY_ADD_INFERENCE_SPARQL_QUERY_PROFILE = makeSymbol("POSSIBLY-ADD-INFERENCE-SPARQL-QUERY-PROFILE");
  public static final SubLSymbol $sym555$INFERENCE_WITHIN_SPARQL_QUERY_EXECUTION = makeSymbol("INFERENCE-WITHIN-SPARQL-QUERY-EXECUTION");
  public static final SubLSymbol $kw556$SPARQL_QUERY_PROFILE = makeKeyword("SPARQL-QUERY-PROFILE");
  public static final SubLSymbol $kw557$SKSI_QUERY_TOTAL_TIME_ACC = makeKeyword("SKSI-QUERY-TOTAL-TIME-ACC");
  public static final SubLSymbol $kw558$SKSI_QUERY_START_TIMES_ACC = makeKeyword("SKSI-QUERY-START-TIMES-ACC");
  public static final SubLSymbol $kw559$SPARQL_QUERY_PROFILE_ACC = makeKeyword("SPARQL-QUERY-PROFILE-ACC");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_inference_datastructures_inference_file();
  }

  @Override
  public void initializeVariables() {
    init_inference_datastructures_inference_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_inference_datastructures_inference_file();
  }

}
