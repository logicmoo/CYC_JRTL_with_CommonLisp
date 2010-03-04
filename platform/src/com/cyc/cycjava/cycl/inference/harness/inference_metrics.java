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

package  com.cyc.cycjava.cycl.inference.harness;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class inference_metrics extends SubLTranslatedFile {

  //// Constructor

  private inference_metrics() {}
  public static final SubLFile me = new inference_metrics();
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_metrics";

  //// Definitions

  public static final class $inference_metric_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $name; }
    public SubLObject getField3() { return $evaluation_func; }
    public SubLObject getField4() { return $evaluation_arg1; }
    public SubLObject getField5() { return $cross_productP; }
    public SubLObject setField2(SubLObject value) { return $name = value; }
    public SubLObject setField3(SubLObject value) { return $evaluation_func = value; }
    public SubLObject setField4(SubLObject value) { return $evaluation_arg1 = value; }
    public SubLObject setField5(SubLObject value) { return $cross_productP = value; }
    public SubLObject $name = NIL;
    public SubLObject $evaluation_func = NIL;
    public SubLObject $evaluation_arg1 = NIL;
    public SubLObject $cross_productP = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($inference_metric_native.class, $sym1$INFERENCE_METRIC, $sym2$INFERENCE_METRIC_P, $list3, $list4, new String[] {"$name", "$evaluation_func", "$evaluation_arg1", "$cross_productP"}, $list5, $list6, $sym7$PRINT_INFERENCE_METRIC);
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1558) 
  public static SubLSymbol $dtp_inference_metric$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1558) 
  public static final SubLObject inference_metric_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36325");
    return NIL;
  }

  public static final class $inference_metric_p$UnaryFunction extends UnaryFunction {
    public $inference_metric_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-METRIC-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36318"); }
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1558) 
  public static final SubLObject _csetf_inf_metric_name(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_METRIC_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1558) 
  public static final SubLObject _csetf_inf_metric_evaluation_func(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_METRIC_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1558) 
  public static final SubLObject _csetf_inf_metric_evaluation_arg1(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_METRIC_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1558) 
  public static final SubLObject _csetf_inf_metric_cross_productP(SubLObject object, SubLObject value) {
    checkType(object, $sym2$INFERENCE_METRIC_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1558) 
  public static final SubLObject make_inference_metric(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $inference_metric_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw17$NAME)) {
            _csetf_inf_metric_name(v_new, current_value);
          } else if (pcase_var.eql($kw18$EVALUATION_FUNC)) {
            _csetf_inf_metric_evaluation_func(v_new, current_value);
          } else if (pcase_var.eql($kw19$EVALUATION_ARG1)) {
            _csetf_inf_metric_evaluation_arg1(v_new, current_value);
          } else if (pcase_var.eql($kw20$CROSS_PRODUCT_)) {
            _csetf_inf_metric_cross_productP(v_new, current_value);
          } else {
            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 1907) 
  public static final SubLObject new_inference_metric(SubLObject name, SubLObject evaluation_func, SubLObject evaluation_arg1, SubLObject cross_productP) {
    checkType(name, $sym23$KEYWORDP);
    checkType(evaluation_func, $sym24$SYMBOLP);
    checkType(evaluation_arg1, $sym25$INFERENCE_METRIC_EVALUATION_ARG1_P);
    checkType(cross_productP, $sym26$BOOLEANP);
    {
      SubLObject metric = make_inference_metric(UNPROVIDED);
      _csetf_inf_metric_name(metric, name);
      _csetf_inf_metric_evaluation_func(metric, evaluation_func);
      _csetf_inf_metric_evaluation_arg1(metric, evaluation_arg1);
      _csetf_inf_metric_cross_productP(metric, cross_productP);
      return metric;
    }
  }

  /** The repository of inference metrics and information about them. */
  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 3605) 
  private static SubLSymbol $inference_metrics_store$ = null;

  /** The list of allowable properties for an inference metric. */
  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 3824) 
  private static SubLSymbol $inference_metric_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 4323) 
  public static final SubLObject declare_inference_metric(SubLObject name, SubLObject evaluation_func, SubLObject evaluation_arg1, SubLObject cross_productP) {
    if ((cross_productP == UNPROVIDED)) {
      cross_productP = NIL;
    }
    {
      SubLObject metric = new_inference_metric(name, evaluation_func, evaluation_arg1, cross_productP);
      dictionary.dictionary_enter($inference_metrics_store$.getGlobalValue(), name, metric);
      return metric;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 17626) 
  private static SubLSymbol $problem_store_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 17877) 
  public static final SubLObject increment_problem_store_historical_count() {
    $problem_store_historical_count$.setGlobalValue(Numbers.add($problem_store_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $problem_store_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 18074) 
  private static SubLSymbol $forward_problem_store_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 18559) 
  public static final SubLObject increment_forward_problem_store_historical_count() {
    $forward_problem_store_historical_count$.setGlobalValue(Numbers.add($forward_problem_store_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $forward_problem_store_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 18788) 
  private static SubLSymbol $maximum_problem_store_historical_problem_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 19060) 
  public static final SubLObject update_maximum_problem_store_historical_problem_count(SubLObject problem_store) {
    {
      SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count(problem_store);
      $maximum_problem_store_historical_problem_count$.setGlobalValue(Numbers.max($maximum_problem_store_historical_problem_count$.getGlobalValue(), count));
    }
    return $maximum_problem_store_historical_problem_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 19815) 
  private static SubLSymbol $maximum_forward_problem_store_historical_problem_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 20119) 
  private static SubLSymbol $expensive_forward_problem_store_threshold$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 20186) 
  public static final SubLObject update_maximum_forward_problem_store_historical_problem_count(SubLObject problem_store) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count(problem_store);
        if ((NIL != control_vars.$inference_debugP$.getDynamicValue(thread))) {
          if (count.numGE($expensive_forward_problem_store_threshold$.getDynamicValue(thread))) {
            Errors.warn($str273$Forward__S_contained__S_problems, problem_store, count);
          }
        }
        $maximum_forward_problem_store_historical_problem_count$.setGlobalValue(Numbers.max($maximum_forward_problem_store_historical_problem_count$.getGlobalValue(), count));
      }
      return $maximum_forward_problem_store_historical_problem_count$.getGlobalValue();
    }
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 21171) 
  private static SubLSymbol $problem_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 21255) 
  public static final SubLObject increment_problem_historical_count() {
    $problem_historical_count$.setGlobalValue(Numbers.add($problem_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $problem_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 21575) 
  private static SubLSymbol $good_problem_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 21778) 
  public static final SubLObject increment_good_problem_historical_count() {
    $good_problem_historical_count$.setGlobalValue(Numbers.add($good_problem_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $good_problem_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 22206) 
  private static SubLSymbol $no_good_problem_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 22421) 
  public static final SubLObject increment_no_good_problem_historical_count() {
    $no_good_problem_historical_count$.setGlobalValue(Numbers.add($no_good_problem_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $no_good_problem_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 22644) 
  private static SubLSymbol $forward_problem_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 22870) 
  public static final SubLObject update_forward_problem_historical_count(SubLObject problem_store) {
    {
      SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count(problem_store);
      $forward_problem_historical_count$.setGlobalValue(Numbers.add($forward_problem_historical_count$.getGlobalValue(), count));
      return $forward_problem_historical_count$.getGlobalValue();
    }
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 23227) 
  private static SubLSymbol $single_literal_problem_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 23665) 
  public static final SubLObject increment_single_literal_problem_historical_count() {
    $single_literal_problem_historical_count$.setGlobalValue(Numbers.add($single_literal_problem_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $single_literal_problem_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 23883) 
  private static SubLSymbol $problem_link_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24127) 
  private static SubLSymbol $structural_link_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24334) 
  private static SubLSymbol $content_link_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24529) 
  private static SubLSymbol $removal_link_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24724) 
  private static SubLSymbol $transformation_link_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 24947) 
  public static final SubLObject increment_problem_link_type_historical_counts(SubLObject link_type) {
    {
      SubLObject pcase_var = link_type;
      if (pcase_var.eql($kw284$REMOVAL)) {
        $removal_link_historical_count$.setGlobalValue(Numbers.add($removal_link_historical_count$.getGlobalValue(), ONE_INTEGER));
        $content_link_historical_count$.setGlobalValue(Numbers.add($content_link_historical_count$.getGlobalValue(), ONE_INTEGER));
      } else if (pcase_var.eql($kw285$TRANSFORMATION)) {
        $transformation_link_historical_count$.setGlobalValue(Numbers.add($transformation_link_historical_count$.getGlobalValue(), ONE_INTEGER));
        $content_link_historical_count$.setGlobalValue(Numbers.add($content_link_historical_count$.getGlobalValue(), ONE_INTEGER));
      } else if (pcase_var.eql($kw286$REWRITE)) {
        $content_link_historical_count$.setGlobalValue(Numbers.add($content_link_historical_count$.getGlobalValue(), ONE_INTEGER));
      } else {
        $structural_link_historical_count$.setGlobalValue(Numbers.add($structural_link_historical_count$.getGlobalValue(), ONE_INTEGER));
      }
    }
    $problem_link_historical_count$.setGlobalValue(Numbers.add($problem_link_historical_count$.getGlobalValue(), ONE_INTEGER));
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 25493) 
  private static SubLSymbol $dependent_link_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 25705) 
  public static final SubLObject increment_dependent_link_historical_count() {
    $dependent_link_historical_count$.setGlobalValue(Numbers.add($dependent_link_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $dependent_link_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 25914) 
  private static SubLSymbol $single_literal_problem_dependent_link_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 26490) 
  public static final SubLObject increment_single_literal_problem_dependent_link_historical_count() {
    $single_literal_problem_dependent_link_historical_count$.setGlobalValue(Numbers.add($single_literal_problem_dependent_link_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $single_literal_problem_dependent_link_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 28570) 
  private static SubLSymbol $tactic_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 28918) 
  public static final SubLObject increment_tactic_historical_count() {
    $tactic_historical_count$.setGlobalValue(Numbers.add($tactic_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $tactic_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 29087) 
  private static SubLSymbol $executed_tactic_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 29295) 
  public static final SubLObject increment_executed_tactic_historical_count() {
    $executed_tactic_historical_count$.setGlobalValue(Numbers.add($executed_tactic_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $executed_tactic_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 29501) 
  private static SubLSymbol $discarded_tactic_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 29713) 
  public static final SubLObject increment_discarded_tactic_historical_count() {
    $discarded_tactic_historical_count$.setGlobalValue(Numbers.add($discarded_tactic_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $discarded_tactic_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 29923) 
  private static SubLSymbol $unification_attempt_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 30328) 
  public static final SubLObject increment_unification_attempt_historical_count() {
    $unification_attempt_historical_count$.setGlobalValue(Numbers.add($unification_attempt_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $unification_attempt_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 30549) 
  private static SubLSymbol $unification_success_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 30768) 
  public static final SubLObject increment_unification_success_historical_count() {
    $unification_success_historical_count$.setGlobalValue(Numbers.add($unification_success_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $unification_success_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 30989) 
  private static SubLSymbol $sbhl_cache_attempt_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 31245) 
  public static final SubLObject increment_sbhl_cache_attempt_historical_count() {
    $sbhl_cache_attempt_historical_count$.setGlobalValue(Numbers.add($sbhl_cache_attempt_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $sbhl_cache_attempt_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 31472) 
  private static SubLSymbol $sbhl_cache_success_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 31687) 
  public static final SubLObject increment_sbhl_cache_success_historical_count() {
    $sbhl_cache_success_historical_count$.setGlobalValue(Numbers.add($sbhl_cache_success_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $sbhl_cache_success_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 31914) 
  private static SubLSymbol $sbhl_graph_attempt_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 32170) 
  public static final SubLObject increment_sbhl_graph_attempt_historical_count() {
    $sbhl_graph_attempt_historical_count$.setGlobalValue(Numbers.add($sbhl_graph_attempt_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $sbhl_graph_attempt_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 32394) 
  private static SubLSymbol $sbhl_graph_success_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 32609) 
  public static final SubLObject increment_sbhl_graph_success_historical_count() {
    $sbhl_graph_success_historical_count$.setGlobalValue(Numbers.add($sbhl_graph_success_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $sbhl_graph_success_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 32833) 
  private static SubLSymbol $sbhl_link_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 33246) 
  private static SubLSymbol $proof_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 33441) 
  public static final SubLObject increment_proof_historical_count() {
    $proof_historical_count$.setGlobalValue(Numbers.add($proof_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $proof_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 33606) 
  private static SubLSymbol $inference_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 34189) 
  public static final SubLObject increment_inference_historical_count() {
    $inference_historical_count$.setGlobalValue(Numbers.add($inference_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $inference_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 34370) 
  private static SubLSymbol $successful_inference_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 34598) 
  public static final SubLObject increment_successful_inference_historical_count() {
    $successful_inference_historical_count$.setGlobalValue(Numbers.add($successful_inference_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $successful_inference_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 34819) 
  private static SubLSymbol $forward_inference_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 35228) 
  public static final SubLObject increment_forward_inference_historical_count() {
    $forward_inference_historical_count$.setGlobalValue(Numbers.add($forward_inference_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $forward_inference_historical_count$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 35441) 
  private static SubLSymbol $successful_forward_inference_historical_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 35938) 
  public static final SubLObject increment_successful_forward_inference_historical_count() {
    $successful_forward_inference_historical_count$.setGlobalValue(Numbers.add($successful_forward_inference_historical_count$.getGlobalValue(), ONE_INTEGER));
    return $successful_forward_inference_historical_count$.getGlobalValue();
  }

  /** Whether we are gathering metrics on the expense of forward inference. */
  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 37066) 
  public static SubLSymbol $gathering_forward_inference_metricsP$ = null;

  /** An index of RULE -> total time spent doing forward inference using RULE. */
  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 38340) 
  private static SubLSymbol $forward_inference_metrics_time_index$ = null;

  /** An index of RULE -> total # of times forward inference was triggered using RULE. */
  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 38604) 
  private static SubLSymbol $forward_inference_metrics_count_index$ = null;

  /** An index of RULE -> a list of inferences which were triggered by RULE */
  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 38879) 
  private static SubLSymbol $forward_inference_metrics_inference_index$ = null;

  /** An index of RULE -> a list of gafs which triggered RULE */
  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 39480) 
  private static SubLSymbol $forward_inference_metrics_gaf_index$ = null;

  @SubL(source = "cycl/inference/harness/inference-metrics.lisp", position = 40036) 
  public static final SubLObject increment_forward_inference_metrics(SubLObject rule, SubLObject rule_time, SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $gathering_forward_inference_metricsP$.getDynamicValue(thread))) {
        if ((NIL != control_vars.$browse_forward_inferencesP$.getDynamicValue(thread))) {
          if ((NIL != inference)) {
            dictionary_utilities.dictionary_push(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36297"), rule, inference);
          }
        }
        {
          SubLObject gaf = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36387");
          if ((NIL != gaf)) {
            dictionary_utilities.dictionary_pushnew(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36293"), rule, gaf, UNPROVIDED, UNPROVIDED);
          }
        }
        dictionary_utilities.dictionary_increment(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36291"), rule, UNPROVIDED);
        return dictionary_utilities.dictionary_increment(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36300"), rule, rule_time);
      }
      return NIL;
    }
  }

  public static final SubLObject declare_inference_metrics_file() {
    declareFunction(myName, "inference_metric_evaluation_arg1_p", "INFERENCE-METRIC-EVALUATION-ARG1-P", 1, 0, false);
    declareFunction(myName, "inference_metric_print_function_trampoline", "INFERENCE-METRIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "inference_metric_p", "INFERENCE-METRIC-P", 1, 0, false); new $inference_metric_p$UnaryFunction();
    declareFunction(myName, "inf_metric_name", "INF-METRIC-NAME", 1, 0, false);
    declareFunction(myName, "inf_metric_evaluation_func", "INF-METRIC-EVALUATION-FUNC", 1, 0, false);
    declareFunction(myName, "inf_metric_evaluation_arg1", "INF-METRIC-EVALUATION-ARG1", 1, 0, false);
    declareFunction(myName, "inf_metric_cross_productP", "INF-METRIC-CROSS-PRODUCT?", 1, 0, false);
    declareFunction(myName, "_csetf_inf_metric_name", "_CSETF-INF-METRIC-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_inf_metric_evaluation_func", "_CSETF-INF-METRIC-EVALUATION-FUNC", 2, 0, false);
    declareFunction(myName, "_csetf_inf_metric_evaluation_arg1", "_CSETF-INF-METRIC-EVALUATION-ARG1", 2, 0, false);
    declareFunction(myName, "_csetf_inf_metric_cross_productP", "_CSETF-INF-METRIC-CROSS-PRODUCT?", 2, 0, false);
    declareFunction(myName, "make_inference_metric", "MAKE-INFERENCE-METRIC", 0, 1, false);
    declareFunction(myName, "print_inference_metric", "PRINT-INFERENCE-METRIC", 3, 0, false);
    declareFunction(myName, "new_inference_metric", "NEW-INFERENCE-METRIC", 4, 0, false);
    declareFunction(myName, "inference_metric_name", "INFERENCE-METRIC-NAME", 1, 0, false);
    declareFunction(myName, "inference_metric_evaluation_func", "INFERENCE-METRIC-EVALUATION-FUNC", 1, 0, false);
    declareFunction(myName, "inference_metric_evaluation_arg1", "INFERENCE-METRIC-EVALUATION-ARG1", 1, 0, false);
    declareFunction(myName, "inference_metric_cross_productP", "INFERENCE-METRIC-CROSS-PRODUCT?", 1, 0, false);
    declareFunction(myName, "inference_metric_evaluate", "INFERENCE-METRIC-EVALUATE", 3, 0, false);
    declareFunction(myName, "inference_metric_property_p", "INFERENCE-METRIC-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "declare_inference_metric", "DECLARE-INFERENCE-METRIC", 3, 1, false);
    declareFunction(myName, "inference_metric_lookup", "INFERENCE-METRIC-LOOKUP", 1, 0, false);
    declareFunction(myName, "inference_metric_nameP", "INFERENCE-METRIC-NAME?", 1, 0, false);
    declareFunction(myName, "inference_metric_names", "INFERENCE-METRIC-NAMES", 0, 0, false);
    declareFunction(myName, "problem_store_historical_count", "PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_problem_store_historical_count", "INCREMENT-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "forward_problem_store_historical_count", "FORWARD-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "backward_problem_store_historical_count", "BACKWARD-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_forward_problem_store_historical_count", "INCREMENT-FORWARD-PROBLEM-STORE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "maximum_problem_store_historical_problem_count", "MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false);
    declareFunction(myName, "update_maximum_problem_store_historical_problem_count", "UPDATE-MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "average_problem_store_historical_problem_count", "AVERAGE-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false);
    declareFunction(myName, "maximum_forward_problem_store_historical_problem_count", "MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false);
    declareFunction(myName, "update_maximum_forward_problem_store_historical_problem_count", "UPDATE-MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "average_forward_problem_store_historical_problem_count", "AVERAGE-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 0, 0, false);
    declareFunction(myName, "increment_problem_historical_count", "INCREMENT-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "problem_historical_count", "PROBLEM-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "good_problem_historical_count", "GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_good_problem_historical_count", "INCREMENT-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "decrement_good_problem_historical_count", "DECREMENT-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "no_good_problem_historical_count", "NO-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_no_good_problem_historical_count", "INCREMENT-NO-GOOD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "forward_problem_historical_count", "FORWARD-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "update_forward_problem_historical_count", "UPDATE-FORWARD-PROBLEM-HISTORICAL-COUNT", 1, 0, false);
    declareFunction(myName, "single_literal_problem_historical_count", "SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "multi_literal_problem_historical_count", "MULTI-LITERAL-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_single_literal_problem_historical_count", "INCREMENT-SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "problem_link_historical_count", "PROBLEM-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "structural_link_historical_count", "STRUCTURAL-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "content_link_historical_count", "CONTENT-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "removal_link_historical_count", "REMOVAL-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "transformation_link_historical_count", "TRANSFORMATION-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_problem_link_type_historical_counts", "INCREMENT-PROBLEM-LINK-TYPE-HISTORICAL-COUNTS", 1, 0, false);
    declareFunction(myName, "dependent_link_historical_count", "DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_dependent_link_historical_count", "INCREMENT-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "single_literal_problem_dependent_link_historical_count", "SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "multi_literal_problem_dependent_link_historical_count", "MULTI-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_single_literal_problem_dependent_link_historical_count", "INCREMENT-SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "problem_reuses_historical_count", "PROBLEM-REUSES-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "problem_reuse_historical_ratio", "PROBLEM-REUSE-HISTORICAL-RATIO", 0, 0, false);
    declareFunction(myName, "single_literal_problem_reuses_historical_count", "SINGLE-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "single_literal_problem_reuse_historical_ratio", "SINGLE-LITERAL-PROBLEM-REUSE-HISTORICAL-RATIO", 0, 0, false);
    declareFunction(myName, "multi_literal_problem_reuses_historical_count", "MULTI-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "multi_literal_problem_reuse_historical_ratio", "MULTI-LITERAL-PROBLEM-REUSE-HISTORICAL-RATIO", 0, 0, false);
    declareFunction(myName, "tactic_historical_count", "TACTIC-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_tactic_historical_count", "INCREMENT-TACTIC-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "executed_tactic_historical_count", "EXECUTED-TACTIC-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_executed_tactic_historical_count", "INCREMENT-EXECUTED-TACTIC-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "discarded_tactic_historical_count", "DISCARDED-TACTIC-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_discarded_tactic_historical_count", "INCREMENT-DISCARDED-TACTIC-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "unification_attempt_historical_count", "UNIFICATION-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_unification_attempt_historical_count", "INCREMENT-UNIFICATION-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "unification_success_historical_count", "UNIFICATION-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_unification_success_historical_count", "INCREMENT-UNIFICATION-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "sbhl_cache_attempt_historical_count", "SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_sbhl_cache_attempt_historical_count", "INCREMENT-SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "sbhl_cache_success_historical_count", "SBHL-CACHE-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_sbhl_cache_success_historical_count", "INCREMENT-SBHL-CACHE-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "sbhl_graph_attempt_historical_count", "SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_sbhl_graph_attempt_historical_count", "INCREMENT-SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "sbhl_graph_success_historical_count", "SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_sbhl_graph_success_historical_count", "INCREMENT-SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "sbhl_link_historical_count", "SBHL-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_sbhl_link_historical_count", "INCREMENT-SBHL-LINK-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "proof_historical_count", "PROOF-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_proof_historical_count", "INCREMENT-PROOF-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "inference_historical_count", "INFERENCE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_inference_historical_count", "INCREMENT-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "successful_inference_historical_count", "SUCCESSFUL-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_successful_inference_historical_count", "INCREMENT-SUCCESSFUL-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "forward_inference_historical_count", "FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "backward_inference_historical_count", "BACKWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_forward_inference_historical_count", "INCREMENT-FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "successful_forward_inference_historical_count", "SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "successful_backward_inference_historical_count", "SUCCESSFUL-BACKWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "increment_successful_forward_inference_historical_count", "INCREMENT-SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT", 0, 0, false);
    declareFunction(myName, "average_historical_inference_relevant_problem_count", "AVERAGE-HISTORICAL-INFERENCE-RELEVANT-PROBLEM-COUNT", 0, 0, false);
    declareFunction(myName, "sksi_query_total_time_accumulator_lookup", "SKSI-QUERY-TOTAL-TIME-ACCUMULATOR-LOOKUP", 1, 0, false);
    declareFunction(myName, "sksi_query_start_times_accumulator_lookup", "SKSI-QUERY-START-TIMES-ACCUMULATOR-LOOKUP", 1, 0, false);
    declareFunction(myName, "sparql_query_profile_accumulator_lookup", "SPARQL-QUERY-PROFILE-ACCUMULATOR-LOOKUP", 1, 0, false);
    declareMacro(myName, "gathering_forward_inference_metrics", "GATHERING-FORWARD-INFERENCE-METRICS");
    declareMacro(myName, "show_forward_inference_metrics_of", "SHOW-FORWARD-INFERENCE-METRICS-OF");
    declareMacro(myName, "show_new_forward_inference_metrics_of", "SHOW-NEW-FORWARD-INFERENCE-METRICS-OF");
    declareFunction(myName, "forward_inference_metrics_time_index", "FORWARD-INFERENCE-METRICS-TIME-INDEX", 0, 0, false);
    declareFunction(myName, "forward_inference_metrics_count_index", "FORWARD-INFERENCE-METRICS-COUNT-INDEX", 0, 0, false);
    declareFunction(myName, "forward_inference_metrics_inference_index", "FORWARD-INFERENCE-METRICS-INFERENCE-INDEX", 0, 0, false);
    declareFunction(myName, "finalize_forward_inference_metrics_inference_index", "FINALIZE-FORWARD-INFERENCE-METRICS-INFERENCE-INDEX", 0, 0, false);
    declareFunction(myName, "forward_inference_metrics_gaf_index", "FORWARD-INFERENCE-METRICS-GAF-INDEX", 0, 0, false);
    declareFunction(myName, "clear_forward_inference_metrics", "CLEAR-FORWARD-INFERENCE-METRICS", 0, 0, false);
    declareFunction(myName, "increment_forward_inference_metrics", "INCREMENT-FORWARD-INFERENCE-METRICS", 3, 0, false);
    declareFunction(myName, "forward_inference_metrics_info", "FORWARD-INFERENCE-METRICS-INFO", 0, 1, false);
    declareFunction(myName, "forward_inference_successful_rules", "FORWARD-INFERENCE-SUCCESSFUL-RULES", 0, 0, false);
    declareFunction(myName, "forward_inference_unsuccessful_rules", "FORWARD-INFERENCE-UNSUCCESSFUL-RULES", 0, 0, false);
    declareFunction(myName, "rule_forward_inference_metrics_info", "RULE-FORWARD-INFERENCE-METRICS-INFO", 1, 0, false);
    declareFunction(myName, "rule_forward_inference_metrics_info_int", "RULE-FORWARD-INFERENCE-METRICS-INFO-INT", 2, 0, false);
    declareFunction(myName, "global_statistics_from_forward_inference_metrics_info", "GLOBAL-STATISTICS-FROM-FORWARD-INFERENCE-METRICS-INFO", 1, 0, false);
    declareFunction(myName, "show_forward_inference_metrics", "SHOW-FORWARD-INFERENCE-METRICS", 0, 2, false);
    declareFunction(myName, "show_forward_inference_metrics_of_asserting", "SHOW-FORWARD-INFERENCE-METRICS-OF-ASSERTING", 2, 2, false);
    declareFunction(myName, "reset_inference_metrics", "RESET-INFERENCE-METRICS", 0, 0, false);
    declareFunction(myName, "show_inference_metrics", "SHOW-INFERENCE-METRICS", 0, 1, false);
    declareFunction(myName, "show_inference_metric_percentage", "SHOW-INFERENCE-METRIC-PERCENTAGE", 3, 1, false);
    return NIL;
  }

  public static final SubLObject init_inference_metrics_file() {
    $dtp_inference_metric$ = defconstant("*DTP-INFERENCE-METRIC*", $sym1$INFERENCE_METRIC);
    $inference_metrics_store$ = deflexical("*INFERENCE-METRICS-STORE*", ((NIL != Symbols.boundp($sym32$_INFERENCE_METRICS_STORE_)) ? ((SubLObject) $inference_metrics_store$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED)));
    $inference_metric_properties$ = deflexical("*INFERENCE-METRIC-PROPERTIES*", $list33);
    $problem_store_historical_count$ = deflexical("*PROBLEM-STORE-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym268$_PROBLEM_STORE_HISTORICAL_COUNT_)) ? ((SubLObject) $problem_store_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $forward_problem_store_historical_count$ = deflexical("*FORWARD-PROBLEM-STORE-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym269$_FORWARD_PROBLEM_STORE_HISTORICAL_COUNT_)) ? ((SubLObject) $forward_problem_store_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $maximum_problem_store_historical_problem_count$ = deflexical("*MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*", ((NIL != Symbols.boundp($sym270$_MAXIMUM_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_)) ? ((SubLObject) $maximum_problem_store_historical_problem_count$.getGlobalValue()) : ZERO_INTEGER));
    $maximum_forward_problem_store_historical_problem_count$ = deflexical("*MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*", ((NIL != Symbols.boundp($sym271$_MAXIMUM_FORWARD_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_)) ? ((SubLObject) $maximum_forward_problem_store_historical_problem_count$.getGlobalValue()) : ZERO_INTEGER));
    $expensive_forward_problem_store_threshold$ = defvar("*EXPENSIVE-FORWARD-PROBLEM-STORE-THRESHOLD*", $int272$1000);
    $problem_historical_count$ = deflexical("*PROBLEM-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym274$_PROBLEM_HISTORICAL_COUNT_)) ? ((SubLObject) $problem_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $good_problem_historical_count$ = deflexical("*GOOD-PROBLEM-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym275$_GOOD_PROBLEM_HISTORICAL_COUNT_)) ? ((SubLObject) $good_problem_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $no_good_problem_historical_count$ = deflexical("*NO-GOOD-PROBLEM-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym276$_NO_GOOD_PROBLEM_HISTORICAL_COUNT_)) ? ((SubLObject) $no_good_problem_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $forward_problem_historical_count$ = deflexical("*FORWARD-PROBLEM-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym277$_FORWARD_PROBLEM_HISTORICAL_COUNT_)) ? ((SubLObject) $forward_problem_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $single_literal_problem_historical_count$ = deflexical("*SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym278$_SINGLE_LITERAL_PROBLEM_HISTORICAL_COUNT_)) ? ((SubLObject) $single_literal_problem_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $problem_link_historical_count$ = deflexical("*PROBLEM-LINK-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym279$_PROBLEM_LINK_HISTORICAL_COUNT_)) ? ((SubLObject) $problem_link_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $structural_link_historical_count$ = deflexical("*STRUCTURAL-LINK-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym280$_STRUCTURAL_LINK_HISTORICAL_COUNT_)) ? ((SubLObject) $structural_link_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $content_link_historical_count$ = deflexical("*CONTENT-LINK-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym281$_CONTENT_LINK_HISTORICAL_COUNT_)) ? ((SubLObject) $content_link_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $removal_link_historical_count$ = deflexical("*REMOVAL-LINK-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym282$_REMOVAL_LINK_HISTORICAL_COUNT_)) ? ((SubLObject) $removal_link_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $transformation_link_historical_count$ = deflexical("*TRANSFORMATION-LINK-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym283$_TRANSFORMATION_LINK_HISTORICAL_COUNT_)) ? ((SubLObject) $transformation_link_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $dependent_link_historical_count$ = deflexical("*DEPENDENT-LINK-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym287$_DEPENDENT_LINK_HISTORICAL_COUNT_)) ? ((SubLObject) $dependent_link_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $single_literal_problem_dependent_link_historical_count$ = deflexical("*SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym288$_SINGLE_LITERAL_PROBLEM_DEPENDENT_LINK_HISTORICAL_COUNT_)) ? ((SubLObject) $single_literal_problem_dependent_link_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $tactic_historical_count$ = deflexical("*TACTIC-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym289$_TACTIC_HISTORICAL_COUNT_)) ? ((SubLObject) $tactic_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $executed_tactic_historical_count$ = deflexical("*EXECUTED-TACTIC-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym290$_EXECUTED_TACTIC_HISTORICAL_COUNT_)) ? ((SubLObject) $executed_tactic_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $discarded_tactic_historical_count$ = deflexical("*DISCARDED-TACTIC-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym291$_DISCARDED_TACTIC_HISTORICAL_COUNT_)) ? ((SubLObject) $discarded_tactic_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $unification_attempt_historical_count$ = deflexical("*UNIFICATION-ATTEMPT-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym292$_UNIFICATION_ATTEMPT_HISTORICAL_COUNT_)) ? ((SubLObject) $unification_attempt_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $unification_success_historical_count$ = deflexical("*UNIFICATION-SUCCESS-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym293$_UNIFICATION_SUCCESS_HISTORICAL_COUNT_)) ? ((SubLObject) $unification_success_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $sbhl_cache_attempt_historical_count$ = deflexical("*SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym294$_SBHL_CACHE_ATTEMPT_HISTORICAL_COUNT_)) ? ((SubLObject) $sbhl_cache_attempt_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $sbhl_cache_success_historical_count$ = deflexical("*SBHL-CACHE-SUCCESS-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym295$_SBHL_CACHE_SUCCESS_HISTORICAL_COUNT_)) ? ((SubLObject) $sbhl_cache_success_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $sbhl_graph_attempt_historical_count$ = deflexical("*SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym296$_SBHL_GRAPH_ATTEMPT_HISTORICAL_COUNT_)) ? ((SubLObject) $sbhl_graph_attempt_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $sbhl_graph_success_historical_count$ = deflexical("*SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym297$_SBHL_GRAPH_SUCCESS_HISTORICAL_COUNT_)) ? ((SubLObject) $sbhl_graph_success_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $sbhl_link_historical_count$ = deflexical("*SBHL-LINK-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym298$_SBHL_LINK_HISTORICAL_COUNT_)) ? ((SubLObject) $sbhl_link_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $proof_historical_count$ = deflexical("*PROOF-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym299$_PROOF_HISTORICAL_COUNT_)) ? ((SubLObject) $proof_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $inference_historical_count$ = deflexical("*INFERENCE-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym300$_INFERENCE_HISTORICAL_COUNT_)) ? ((SubLObject) $inference_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $successful_inference_historical_count$ = deflexical("*SUCCESSFUL-INFERENCE-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym301$_SUCCESSFUL_INFERENCE_HISTORICAL_COUNT_)) ? ((SubLObject) $successful_inference_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $forward_inference_historical_count$ = deflexical("*FORWARD-INFERENCE-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym302$_FORWARD_INFERENCE_HISTORICAL_COUNT_)) ? ((SubLObject) $forward_inference_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $successful_forward_inference_historical_count$ = deflexical("*SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT*", ((NIL != Symbols.boundp($sym303$_SUCCESSFUL_FORWARD_INFERENCE_HISTORICAL_COUNT_)) ? ((SubLObject) $successful_forward_inference_historical_count$.getGlobalValue()) : ZERO_INTEGER));
    $gathering_forward_inference_metricsP$ = defvar("*GATHERING-FORWARD-INFERENCE-METRICS?*", NIL);
    $forward_inference_metrics_time_index$ = deflexical("*FORWARD-INFERENCE-METRICS-TIME-INDEX*", ((NIL != Symbols.boundp($sym323$_FORWARD_INFERENCE_METRICS_TIME_INDEX_)) ? ((SubLObject) $forward_inference_metrics_time_index$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED)));
    $forward_inference_metrics_count_index$ = deflexical("*FORWARD-INFERENCE-METRICS-COUNT-INDEX*", ((NIL != Symbols.boundp($sym324$_FORWARD_INFERENCE_METRICS_COUNT_INDEX_)) ? ((SubLObject) $forward_inference_metrics_count_index$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED)));
    $forward_inference_metrics_inference_index$ = deflexical("*FORWARD-INFERENCE-METRICS-INFERENCE-INDEX*", ((NIL != Symbols.boundp($sym325$_FORWARD_INFERENCE_METRICS_INFERENCE_INDEX_)) ? ((SubLObject) $forward_inference_metrics_inference_index$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED)));
    $forward_inference_metrics_gaf_index$ = deflexical("*FORWARD-INFERENCE-METRICS-GAF-INDEX*", ((NIL != Symbols.boundp($sym327$_FORWARD_INFERENCE_METRICS_GAF_INDEX_)) ? ((SubLObject) $forward_inference_metrics_gaf_index$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED)));
    return NIL;
  }

  public static final SubLObject setup_inference_metrics_file() {
    // CVS_ID("Id: inference-metrics.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference_metric$.getGlobalValue(), Symbols.symbol_function($sym8$INFERENCE_METRIC_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$INF_METRIC_NAME, $sym10$_CSETF_INF_METRIC_NAME);
    Structures.def_csetf($sym11$INF_METRIC_EVALUATION_FUNC, $sym12$_CSETF_INF_METRIC_EVALUATION_FUNC);
    Structures.def_csetf($sym13$INF_METRIC_EVALUATION_ARG1, $sym14$_CSETF_INF_METRIC_EVALUATION_ARG1);
    Structures.def_csetf($sym15$INF_METRIC_CROSS_PRODUCT_, $sym16$_CSETF_INF_METRIC_CROSS_PRODUCT_);
    Equality.identity($sym1$INFERENCE_METRIC);
    utilities_macros.note_funcall_helper_function($sym7$PRINT_INFERENCE_METRIC);
    subl_macro_promotions.declare_defglobal($sym32$_INFERENCE_METRICS_STORE_);
    declare_inference_metric($kw34$ANSWER_COUNT, $sym35$INFERENCE_ANSWER_COUNT, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw36$ANSWER_COUNT_AT_30_SECONDS, $sym37$INFERENCE_ANSWER_COUNT_AT_30_SECONDS, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw38$ANSWER_COUNT_AT_60_SECONDS, $sym39$INFERENCE_ANSWER_COUNT_AT_60_SECONDS, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw40$TIME_TO_FIRST_ANSWER, $sym41$INFERENCE_FIRST_ANSWER_ELAPSED_TIME, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw42$TIME_TO_LAST_ANSWER, $sym43$INFERENCE_LAST_ANSWER_ELAPSED_TIME, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw44$TOTAL_TIME, $sym45$INFERENCE_CUMULATIVE_TIME, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw46$TIME_PER_ANSWER, $sym47$INFERENCE_TIME_PER_ANSWER, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw48$STEPS_TO_FIRST_ANSWER, $sym49$INFERENCE_FIRST_ANSWER_STEP_COUNT, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw50$STEPS_TO_LAST_ANSWER, $sym51$INFERENCE_LAST_ANSWER_STEP_COUNT, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw52$TOTAL_STEPS, $sym53$INFERENCE_CUMULATIVE_STEP_COUNT, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw54$STEPS_PER_ANSWER, $sym55$INFERENCE_STEPS_PER_ANSWER, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw56$WASTED_TIME_AFTER_LAST_ANSWER, $sym57$INFERENCE_WASTED_TIME_AFTER_LAST_ANSWER, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw58$LATENCY_IMPROVEMENT_FROM_ITERATIVITY, $sym59$INFERENCE_LATENCY_IMPROVEMENT_FROM_ITERATIVITY, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw60$PROBLEM_COUNT, $sym61$PROBLEM_STORE_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw62$PROBLEM_STORE_PROBLEM_COUNT, $sym61$PROBLEM_STORE_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw63$PROOF_COUNT, $sym64$PROBLEM_STORE_PROOF_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw65$PROBLEM_STORE_PROOF_COUNT, $sym64$PROBLEM_STORE_PROOF_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw66$LINK_COUNT, $sym67$PROBLEM_STORE_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw68$TACTIC_COUNT, $sym69$PROBLEM_STORE_TACTIC_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw70$POSSIBLE_TACTIC_COUNT, $sym71$PROBLEM_STORE_POSSIBLE_TACTIC_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw72$EXECUTED_TACTIC_COUNT, $sym73$PROBLEM_STORE_EXECUTED_TACTIC_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw74$TACTIC_EXECUTION_COUNT, $sym75$PROBLEM_STORE_TACTIC_EXECUTION_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw76$DISCARDED_TACTIC_COUNT, $sym77$PROBLEM_STORE_DISCARDED_TACTIC_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw78$CONTENT_LINK_COUNT, $sym79$PROBLEM_STORE_CONTENT_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw80$REMOVAL_LINK_COUNT, $sym81$PROBLEM_STORE_REMOVAL_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw82$REWRITE_LINK_COUNT, $sym83$PROBLEM_STORE_REWRITE_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw84$TRANSFORMATION_LINK_COUNT, $sym85$PROBLEM_STORE_TRANSFORMATION_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw86$STRUCTURAL_LINK_COUNT, $sym87$PROBLEM_STORE_STRUCTURAL_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw88$JOIN_ORDERED_LINK_COUNT, $sym89$PROBLEM_STORE_JOIN_ORDERED_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw90$JOIN_LINK_COUNT, $sym91$PROBLEM_STORE_JOIN_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw92$SPLIT_LINK_COUNT, $sym93$PROBLEM_STORE_SPLIT_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw94$RESTRICTION_LINK_COUNT, $sym95$PROBLEM_STORE_RESTRICTION_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw96$RESIDUAL_TRANSFORMATION_LINK_COUNT, $sym97$PROBLEM_STORE_RESIDUAL_TRANSFORMATION_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw98$UNION_LINK_COUNT, $sym99$PROBLEM_STORE_UNION_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw100$GOOD_PROBLEM_COUNT, $sym101$PROBLEM_STORE_GOOD_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw102$NEUTRAL_PROBLEM_COUNT, $sym103$PROBLEM_STORE_NEUTRAL_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw104$NO_GOOD_PROBLEM_COUNT, $sym105$PROBLEM_STORE_NO_GOOD_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw106$SINGLE_LITERAL_PROBLEM_COUNT, $sym107$PROBLEM_STORE_SINGLE_LITERAL_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw108$CONJUNCTIVE_PROBLEM_COUNT, $sym109$PROBLEM_STORE_CONJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw110$JOIN_PROBLEM_COUNT, $sym111$PROBLEM_STORE_JOIN_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw112$SPLIT_PROBLEM_COUNT, $sym113$PROBLEM_STORE_SPLIT_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw114$DISJUNCTIVE_PROBLEM_COUNT, $sym115$PROBLEM_STORE_DISJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw116$UNEXAMINED_PROBLEM_COUNT, $sym117$PROBLEM_STORE_UNEXAMINED_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw118$EXAMINED_PROBLEM_COUNT, $sym119$PROBLEM_STORE_EXAMINED_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw120$POSSIBLE_PROBLEM_COUNT, $sym121$PROBLEM_STORE_POSSIBLE_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw122$PENDING_PROBLEM_COUNT, $sym123$PROBLEM_STORE_PENDING_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw124$FINISHED_PROBLEM_COUNT, $sym125$PROBLEM_STORE_FINISHED_PROBLEM_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw126$UNMANIFESTED_NON_FOCAL_COUNT, $sym127$PROBLEM_STORE_UNMANIFESTED_NON_FOCAL_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw128$TRANSFORMATION_RULE_BINDINGS_TO_CLOSED, $sym129$PROBLEM_STORE_TRANSFORMATION_RULE_BINDINGS_TO_CLOSED, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw130$PROBLEM_QUERIES, $sym131$PROBLEM_STORE_ALL_PROBLEM_QUERIES, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw132$ANSWER_TIMES, $sym133$INFERENCE_ANSWER_TIMES, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw134$ANSWER_STEP_COUNTS, $sym135$INFERENCE_ANSWER_STEP_COUNTS, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw136$PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, $sym137$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw138$ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT, $sym139$INFERENCE_TRANSFORMATION_FANOUT_ESTIMATE, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw140$TOP_LEVEL_REMOVAL_FANOUT, $sym141$INFERENCE_TOP_LEVEL_REMOVAL_FANOUT, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw142$NEW_ROOT_INITIAL_REMOVAL_FANOUTS, $sym143$INFERENCE_NEW_ROOT_INITIAL_REMOVAL_FANOUTS, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw144$PROOF_QUERY_PROPERTIES, $sym145$INFERENCE_COMPUTE_PROOF_QUERY_PROPERTIES, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw146$ANSWER_PROOF_SPECS, $sym147$INFERENCE_ALL_ANSWER_PROOF_SPECS, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw148$INFERENCE_PROOF_SPEC, $sym149$INFERENCE_PROOF_SPEC, $kw30$INFERENCE, UNPROVIDED);
    declare_inference_metric($kw150$EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES, $sym151$PROBLEM_STORE_EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES, $kw29$STORE, UNPROVIDED);
    declare_inference_metric($kw152$UNEXAMINED_GOOD_PROBLEM_COUNT, $sym153$PROBLEM_STORE_UNEXAMINED_GOOD_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw154$EXAMINED_GOOD_PROBLEM_COUNT, $sym155$PROBLEM_STORE_EXAMINED_GOOD_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw156$POSSIBLE_GOOD_PROBLEM_COUNT, $sym157$PROBLEM_STORE_POSSIBLE_GOOD_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw158$PENDING_GOOD_PROBLEM_COUNT, $sym159$PROBLEM_STORE_PENDING_GOOD_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw160$FINISHED_GOOD_PROBLEM_COUNT, $sym161$PROBLEM_STORE_FINISHED_GOOD_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw162$UNEXAMINED_NEUTRAL_PROBLEM_COUNT, $sym163$PROBLEM_STORE_UNEXAMINED_NEUTRAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw164$EXAMINED_NEUTRAL_PROBLEM_COUNT, $sym165$PROBLEM_STORE_EXAMINED_NEUTRAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw166$POSSIBLE_NEUTRAL_PROBLEM_COUNT, $sym167$PROBLEM_STORE_POSSIBLE_NEUTRAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw168$PENDING_NEUTRAL_PROBLEM_COUNT, $sym169$PROBLEM_STORE_PENDING_NEUTRAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw170$FINISHED_NEUTRAL_PROBLEM_COUNT, $sym171$PROBLEM_STORE_FINISHED_NEUTRAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw172$UNEXAMINED_NO_GOOD_PROBLEM_COUNT, $sym173$PROBLEM_STORE_UNEXAMINED_NO_GOOD_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw174$EXAMINED_NO_GOOD_PROBLEM_COUNT, $sym175$PROBLEM_STORE_EXAMINED_NO_GOOD_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw176$POSSIBLE_NO_GOOD_PROBLEM_COUNT, $sym177$PROBLEM_STORE_POSSIBLE_NO_GOOD_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw178$PENDING_NO_GOOD_PROBLEM_COUNT, $sym179$PROBLEM_STORE_PENDING_NO_GOOD_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw180$FINISHED_NO_GOOD_PROBLEM_COUNT, $sym181$PROBLEM_STORE_FINISHED_NO_GOOD_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw182$GOOD_SINGLE_LITERAL_PROBLEM_COUNT, $sym183$PROBLEM_STORE_GOOD_SINGLE_LITERAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw184$GOOD_CONJUNCTIVE_PROBLEM_COUNT, $sym185$PROBLEM_STORE_GOOD_CONJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw186$GOOD_JOIN_PROBLEM_COUNT, $sym187$PROBLEM_STORE_GOOD_JOIN_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw188$GOOD_SPLIT_PROBLEM_COUNT, $sym189$PROBLEM_STORE_GOOD_SPLIT_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw190$GOOD_DISJUNCTIVE_PROBLEM_COUNT, $sym191$PROBLEM_STORE_GOOD_DISJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw192$NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT, $sym193$PROBLEM_STORE_NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw194$NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT, $sym195$PROBLEM_STORE_NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw196$NEUTRAL_JOIN_PROBLEM_COUNT, $sym197$PROBLEM_STORE_NEUTRAL_JOIN_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw198$NEUTRAL_SPLIT_PROBLEM_COUNT, $sym199$PROBLEM_STORE_NEUTRAL_SPLIT_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw200$NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT, $sym201$PROBLEM_STORE_NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw202$NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT, $sym203$PROBLEM_STORE_NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw204$NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT, $sym205$PROBLEM_STORE_NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw206$NO_GOOD_JOIN_PROBLEM_COUNT, $sym207$PROBLEM_STORE_NO_GOOD_JOIN_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw208$NO_GOOD_SPLIT_PROBLEM_COUNT, $sym209$PROBLEM_STORE_NO_GOOD_SPLIT_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw210$NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT, $sym211$PROBLEM_STORE_NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw212$UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, $sym213$PROBLEM_STORE_UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw214$UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT, $sym215$PROBLEM_STORE_UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw216$UNEXAMINED_JOIN_PROBLEM_COUNT, $sym217$PROBLEM_STORE_UNEXAMINED_JOIN_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw218$UNEXAMINED_SPLIT_PROBLEM_COUNT, $sym219$PROBLEM_STORE_UNEXAMINED_SPLIT_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw220$UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT, $sym221$PROBLEM_STORE_UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw222$EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, $sym223$PROBLEM_STORE_EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw224$EXAMINED_CONJUNCTIVE_PROBLEM_COUNT, $sym225$PROBLEM_STORE_EXAMINED_CONJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw226$EXAMINED_JOIN_PROBLEM_COUNT, $sym227$PROBLEM_STORE_EXAMINED_JOIN_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw228$EXAMINED_SPLIT_PROBLEM_COUNT, $sym229$PROBLEM_STORE_EXAMINED_SPLIT_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw230$EXAMINED_DISJUNCTIVE_PROBLEM_COUNT, $sym231$PROBLEM_STORE_EXAMINED_DISJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw232$POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT, $sym233$PROBLEM_STORE_POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw234$POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT, $sym235$PROBLEM_STORE_POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw236$POSSIBLE_JOIN_PROBLEM_COUNT, $sym237$PROBLEM_STORE_POSSIBLE_JOIN_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw238$POSSIBLE_SPLIT_PROBLEM_COUNT, $sym239$PROBLEM_STORE_POSSIBLE_SPLIT_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw240$POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT, $sym241$PROBLEM_STORE_POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw242$PENDING_SINGLE_LITERAL_PROBLEM_COUNT, $sym243$PROBLEM_STORE_PENDING_SINGLE_LITERAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw244$PENDING_CONJUNCTIVE_PROBLEM_COUNT, $sym245$PROBLEM_STORE_PENDING_CONJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw246$PENDING_JOIN_PROBLEM_COUNT, $sym247$PROBLEM_STORE_PENDING_JOIN_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw248$PENDING_SPLIT_PROBLEM_COUNT, $sym249$PROBLEM_STORE_PENDING_SPLIT_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw250$PENDING_DISJUNCTIVE_PROBLEM_COUNT, $sym251$PROBLEM_STORE_PENDING_DISJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw252$FINISHED_SINGLE_LITERAL_PROBLEM_COUNT, $sym253$PROBLEM_STORE_FINISHED_SINGLE_LITERAL_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw254$FINISHED_CONJUNCTIVE_PROBLEM_COUNT, $sym255$PROBLEM_STORE_FINISHED_CONJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw256$FINISHED_JOIN_PROBLEM_COUNT, $sym257$PROBLEM_STORE_FINISHED_JOIN_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw258$FINISHED_SPLIT_PROBLEM_COUNT, $sym259$PROBLEM_STORE_FINISHED_SPLIT_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw260$FINISHED_DISJUNCTIVE_PROBLEM_COUNT, $sym261$PROBLEM_STORE_FINISHED_DISJUNCTIVE_PROBLEM_COUNT, $kw29$STORE, T);
    declare_inference_metric($kw262$SKSI_QUERY_TOTAL_TIME, $sym263$SKSI_QUERY_TOTAL_TIME_ACCUMULATOR_LOOKUP, $kw30$INFERENCE, NIL);
    declare_inference_metric($kw264$SKSI_QUERY_START_TIMES, $sym265$SKSI_QUERY_START_TIMES_ACCUMULATOR_LOOKUP, $kw30$INFERENCE, NIL);
    declare_inference_metric($kw266$SPARQL_QUERY_PROFILE, $sym267$SPARQL_QUERY_PROFILE_ACCUMULATOR_LOOKUP, $kw30$INFERENCE, NIL);
    subl_macro_promotions.declare_defglobal($sym268$_PROBLEM_STORE_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym269$_FORWARD_PROBLEM_STORE_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym270$_MAXIMUM_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_);
    subl_macro_promotions.declare_defglobal($sym271$_MAXIMUM_FORWARD_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_);
    subl_macro_promotions.declare_defglobal($sym274$_PROBLEM_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym275$_GOOD_PROBLEM_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym276$_NO_GOOD_PROBLEM_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym277$_FORWARD_PROBLEM_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym278$_SINGLE_LITERAL_PROBLEM_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym279$_PROBLEM_LINK_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym280$_STRUCTURAL_LINK_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym281$_CONTENT_LINK_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym282$_REMOVAL_LINK_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym283$_TRANSFORMATION_LINK_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym287$_DEPENDENT_LINK_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym288$_SINGLE_LITERAL_PROBLEM_DEPENDENT_LINK_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym289$_TACTIC_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym290$_EXECUTED_TACTIC_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym291$_DISCARDED_TACTIC_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym292$_UNIFICATION_ATTEMPT_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym293$_UNIFICATION_SUCCESS_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym294$_SBHL_CACHE_ATTEMPT_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym295$_SBHL_CACHE_SUCCESS_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym296$_SBHL_GRAPH_ATTEMPT_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym297$_SBHL_GRAPH_SUCCESS_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym298$_SBHL_LINK_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym299$_PROOF_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym300$_INFERENCE_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym301$_SUCCESSFUL_INFERENCE_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym302$_FORWARD_INFERENCE_HISTORICAL_COUNT_);
    subl_macro_promotions.declare_defglobal($sym303$_SUCCESSFUL_FORWARD_INFERENCE_HISTORICAL_COUNT_);
    utilities_macros.note_funcall_helper_function($sym263$SKSI_QUERY_TOTAL_TIME_ACCUMULATOR_LOOKUP);
    utilities_macros.note_funcall_helper_function($sym265$SKSI_QUERY_START_TIMES_ACCUMULATOR_LOOKUP);
    utilities_macros.note_funcall_helper_function($sym267$SPARQL_QUERY_PROFILE_ACCUMULATOR_LOOKUP);
    subl_macro_promotions.declare_defglobal($sym323$_FORWARD_INFERENCE_METRICS_TIME_INDEX_);
    subl_macro_promotions.declare_defglobal($sym324$_FORWARD_INFERENCE_METRICS_COUNT_INDEX_);
    subl_macro_promotions.declare_defglobal($sym325$_FORWARD_INFERENCE_METRICS_INFERENCE_INDEX_);
    subl_macro_promotions.declare_defglobal($sym327$_FORWARD_INFERENCE_METRICS_GAF_INDEX_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("STORE"), makeKeyword("INFERENCE"));
  public static final SubLSymbol $sym1$INFERENCE_METRIC = makeSymbol("INFERENCE-METRIC");
  public static final SubLSymbol $sym2$INFERENCE_METRIC_P = makeSymbol("INFERENCE-METRIC-P");
  public static final SubLList $list3 = list(makeSymbol("NAME"), makeSymbol("EVALUATION-FUNC"), makeSymbol("EVALUATION-ARG1"), makeSymbol("CROSS-PRODUCT?"));
  public static final SubLList $list4 = list(makeKeyword("NAME"), makeKeyword("EVALUATION-FUNC"), makeKeyword("EVALUATION-ARG1"), makeKeyword("CROSS-PRODUCT?"));
  public static final SubLList $list5 = list(makeSymbol("INF-METRIC-NAME"), makeSymbol("INF-METRIC-EVALUATION-FUNC"), makeSymbol("INF-METRIC-EVALUATION-ARG1"), makeSymbol("INF-METRIC-CROSS-PRODUCT?"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-INF-METRIC-NAME"), makeSymbol("_CSETF-INF-METRIC-EVALUATION-FUNC"), makeSymbol("_CSETF-INF-METRIC-EVALUATION-ARG1"), makeSymbol("_CSETF-INF-METRIC-CROSS-PRODUCT?"));
  public static final SubLSymbol $sym7$PRINT_INFERENCE_METRIC = makeSymbol("PRINT-INFERENCE-METRIC");
  public static final SubLSymbol $sym8$INFERENCE_METRIC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-METRIC-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$INF_METRIC_NAME = makeSymbol("INF-METRIC-NAME");
  public static final SubLSymbol $sym10$_CSETF_INF_METRIC_NAME = makeSymbol("_CSETF-INF-METRIC-NAME");
  public static final SubLSymbol $sym11$INF_METRIC_EVALUATION_FUNC = makeSymbol("INF-METRIC-EVALUATION-FUNC");
  public static final SubLSymbol $sym12$_CSETF_INF_METRIC_EVALUATION_FUNC = makeSymbol("_CSETF-INF-METRIC-EVALUATION-FUNC");
  public static final SubLSymbol $sym13$INF_METRIC_EVALUATION_ARG1 = makeSymbol("INF-METRIC-EVALUATION-ARG1");
  public static final SubLSymbol $sym14$_CSETF_INF_METRIC_EVALUATION_ARG1 = makeSymbol("_CSETF-INF-METRIC-EVALUATION-ARG1");
  public static final SubLSymbol $sym15$INF_METRIC_CROSS_PRODUCT_ = makeSymbol("INF-METRIC-CROSS-PRODUCT?");
  public static final SubLSymbol $sym16$_CSETF_INF_METRIC_CROSS_PRODUCT_ = makeSymbol("_CSETF-INF-METRIC-CROSS-PRODUCT?");
  public static final SubLSymbol $kw17$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw18$EVALUATION_FUNC = makeKeyword("EVALUATION-FUNC");
  public static final SubLSymbol $kw19$EVALUATION_ARG1 = makeKeyword("EVALUATION-ARG1");
  public static final SubLSymbol $kw20$CROSS_PRODUCT_ = makeKeyword("CROSS-PRODUCT?");
  public static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str22$_INFERENCE_METRIC___s_ = makeString("<INFERENCE-METRIC: ~s>");
  public static final SubLSymbol $sym23$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym24$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym25$INFERENCE_METRIC_EVALUATION_ARG1_P = makeSymbol("INFERENCE-METRIC-EVALUATION-ARG1-P");
  public static final SubLSymbol $sym26$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $sym27$INFERENCE_P = makeSymbol("INFERENCE-P");
  public static final SubLSymbol $sym28$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
  public static final SubLSymbol $kw29$STORE = makeKeyword("STORE");
  public static final SubLSymbol $kw30$INFERENCE = makeKeyword("INFERENCE");
  public static final SubLString $str31$Unhandled_inference_metric_evalua = makeString("Unhandled inference metric evaluation arg1 spec ~s");
  public static final SubLSymbol $sym32$_INFERENCE_METRICS_STORE_ = makeSymbol("*INFERENCE-METRICS-STORE*");
  public static final SubLList $list33 = list(makeKeyword("EVALUATION-FUNC"), makeKeyword("EVALUATION-ARG1"), makeKeyword("CROSS-PRODUCT?"));
  public static final SubLSymbol $kw34$ANSWER_COUNT = makeKeyword("ANSWER-COUNT");
  public static final SubLSymbol $sym35$INFERENCE_ANSWER_COUNT = makeSymbol("INFERENCE-ANSWER-COUNT");
  public static final SubLSymbol $kw36$ANSWER_COUNT_AT_30_SECONDS = makeKeyword("ANSWER-COUNT-AT-30-SECONDS");
  public static final SubLSymbol $sym37$INFERENCE_ANSWER_COUNT_AT_30_SECONDS = makeSymbol("INFERENCE-ANSWER-COUNT-AT-30-SECONDS");
  public static final SubLSymbol $kw38$ANSWER_COUNT_AT_60_SECONDS = makeKeyword("ANSWER-COUNT-AT-60-SECONDS");
  public static final SubLSymbol $sym39$INFERENCE_ANSWER_COUNT_AT_60_SECONDS = makeSymbol("INFERENCE-ANSWER-COUNT-AT-60-SECONDS");
  public static final SubLSymbol $kw40$TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $sym41$INFERENCE_FIRST_ANSWER_ELAPSED_TIME = makeSymbol("INFERENCE-FIRST-ANSWER-ELAPSED-TIME");
  public static final SubLSymbol $kw42$TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");
  public static final SubLSymbol $sym43$INFERENCE_LAST_ANSWER_ELAPSED_TIME = makeSymbol("INFERENCE-LAST-ANSWER-ELAPSED-TIME");
  public static final SubLSymbol $kw44$TOTAL_TIME = makeKeyword("TOTAL-TIME");
  public static final SubLSymbol $sym45$INFERENCE_CUMULATIVE_TIME = makeSymbol("INFERENCE-CUMULATIVE-TIME");
  public static final SubLSymbol $kw46$TIME_PER_ANSWER = makeKeyword("TIME-PER-ANSWER");
  public static final SubLSymbol $sym47$INFERENCE_TIME_PER_ANSWER = makeSymbol("INFERENCE-TIME-PER-ANSWER");
  public static final SubLSymbol $kw48$STEPS_TO_FIRST_ANSWER = makeKeyword("STEPS-TO-FIRST-ANSWER");
  public static final SubLSymbol $sym49$INFERENCE_FIRST_ANSWER_STEP_COUNT = makeSymbol("INFERENCE-FIRST-ANSWER-STEP-COUNT");
  public static final SubLSymbol $kw50$STEPS_TO_LAST_ANSWER = makeKeyword("STEPS-TO-LAST-ANSWER");
  public static final SubLSymbol $sym51$INFERENCE_LAST_ANSWER_STEP_COUNT = makeSymbol("INFERENCE-LAST-ANSWER-STEP-COUNT");
  public static final SubLSymbol $kw52$TOTAL_STEPS = makeKeyword("TOTAL-STEPS");
  public static final SubLSymbol $sym53$INFERENCE_CUMULATIVE_STEP_COUNT = makeSymbol("INFERENCE-CUMULATIVE-STEP-COUNT");
  public static final SubLSymbol $kw54$STEPS_PER_ANSWER = makeKeyword("STEPS-PER-ANSWER");
  public static final SubLSymbol $sym55$INFERENCE_STEPS_PER_ANSWER = makeSymbol("INFERENCE-STEPS-PER-ANSWER");
  public static final SubLSymbol $kw56$WASTED_TIME_AFTER_LAST_ANSWER = makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER");
  public static final SubLSymbol $sym57$INFERENCE_WASTED_TIME_AFTER_LAST_ANSWER = makeSymbol("INFERENCE-WASTED-TIME-AFTER-LAST-ANSWER");
  public static final SubLSymbol $kw58$LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
  public static final SubLSymbol $sym59$INFERENCE_LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeSymbol("INFERENCE-LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
  public static final SubLSymbol $kw60$PROBLEM_COUNT = makeKeyword("PROBLEM-COUNT");
  public static final SubLSymbol $sym61$PROBLEM_STORE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PROBLEM-COUNT");
  public static final SubLSymbol $kw62$PROBLEM_STORE_PROBLEM_COUNT = makeKeyword("PROBLEM-STORE-PROBLEM-COUNT");
  public static final SubLSymbol $kw63$PROOF_COUNT = makeKeyword("PROOF-COUNT");
  public static final SubLSymbol $sym64$PROBLEM_STORE_PROOF_COUNT = makeSymbol("PROBLEM-STORE-PROOF-COUNT");
  public static final SubLSymbol $kw65$PROBLEM_STORE_PROOF_COUNT = makeKeyword("PROBLEM-STORE-PROOF-COUNT");
  public static final SubLSymbol $kw66$LINK_COUNT = makeKeyword("LINK-COUNT");
  public static final SubLSymbol $sym67$PROBLEM_STORE_LINK_COUNT = makeSymbol("PROBLEM-STORE-LINK-COUNT");
  public static final SubLSymbol $kw68$TACTIC_COUNT = makeKeyword("TACTIC-COUNT");
  public static final SubLSymbol $sym69$PROBLEM_STORE_TACTIC_COUNT = makeSymbol("PROBLEM-STORE-TACTIC-COUNT");
  public static final SubLSymbol $kw70$POSSIBLE_TACTIC_COUNT = makeKeyword("POSSIBLE-TACTIC-COUNT");
  public static final SubLSymbol $sym71$PROBLEM_STORE_POSSIBLE_TACTIC_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-TACTIC-COUNT");
  public static final SubLSymbol $kw72$EXECUTED_TACTIC_COUNT = makeKeyword("EXECUTED-TACTIC-COUNT");
  public static final SubLSymbol $sym73$PROBLEM_STORE_EXECUTED_TACTIC_COUNT = makeSymbol("PROBLEM-STORE-EXECUTED-TACTIC-COUNT");
  public static final SubLSymbol $kw74$TACTIC_EXECUTION_COUNT = makeKeyword("TACTIC-EXECUTION-COUNT");
  public static final SubLSymbol $sym75$PROBLEM_STORE_TACTIC_EXECUTION_COUNT = makeSymbol("PROBLEM-STORE-TACTIC-EXECUTION-COUNT");
  public static final SubLSymbol $kw76$DISCARDED_TACTIC_COUNT = makeKeyword("DISCARDED-TACTIC-COUNT");
  public static final SubLSymbol $sym77$PROBLEM_STORE_DISCARDED_TACTIC_COUNT = makeSymbol("PROBLEM-STORE-DISCARDED-TACTIC-COUNT");
  public static final SubLSymbol $kw78$CONTENT_LINK_COUNT = makeKeyword("CONTENT-LINK-COUNT");
  public static final SubLSymbol $sym79$PROBLEM_STORE_CONTENT_LINK_COUNT = makeSymbol("PROBLEM-STORE-CONTENT-LINK-COUNT");
  public static final SubLSymbol $kw80$REMOVAL_LINK_COUNT = makeKeyword("REMOVAL-LINK-COUNT");
  public static final SubLSymbol $sym81$PROBLEM_STORE_REMOVAL_LINK_COUNT = makeSymbol("PROBLEM-STORE-REMOVAL-LINK-COUNT");
  public static final SubLSymbol $kw82$REWRITE_LINK_COUNT = makeKeyword("REWRITE-LINK-COUNT");
  public static final SubLSymbol $sym83$PROBLEM_STORE_REWRITE_LINK_COUNT = makeSymbol("PROBLEM-STORE-REWRITE-LINK-COUNT");
  public static final SubLSymbol $kw84$TRANSFORMATION_LINK_COUNT = makeKeyword("TRANSFORMATION-LINK-COUNT");
  public static final SubLSymbol $sym85$PROBLEM_STORE_TRANSFORMATION_LINK_COUNT = makeSymbol("PROBLEM-STORE-TRANSFORMATION-LINK-COUNT");
  public static final SubLSymbol $kw86$STRUCTURAL_LINK_COUNT = makeKeyword("STRUCTURAL-LINK-COUNT");
  public static final SubLSymbol $sym87$PROBLEM_STORE_STRUCTURAL_LINK_COUNT = makeSymbol("PROBLEM-STORE-STRUCTURAL-LINK-COUNT");
  public static final SubLSymbol $kw88$JOIN_ORDERED_LINK_COUNT = makeKeyword("JOIN-ORDERED-LINK-COUNT");
  public static final SubLSymbol $sym89$PROBLEM_STORE_JOIN_ORDERED_LINK_COUNT = makeSymbol("PROBLEM-STORE-JOIN-ORDERED-LINK-COUNT");
  public static final SubLSymbol $kw90$JOIN_LINK_COUNT = makeKeyword("JOIN-LINK-COUNT");
  public static final SubLSymbol $sym91$PROBLEM_STORE_JOIN_LINK_COUNT = makeSymbol("PROBLEM-STORE-JOIN-LINK-COUNT");
  public static final SubLSymbol $kw92$SPLIT_LINK_COUNT = makeKeyword("SPLIT-LINK-COUNT");
  public static final SubLSymbol $sym93$PROBLEM_STORE_SPLIT_LINK_COUNT = makeSymbol("PROBLEM-STORE-SPLIT-LINK-COUNT");
  public static final SubLSymbol $kw94$RESTRICTION_LINK_COUNT = makeKeyword("RESTRICTION-LINK-COUNT");
  public static final SubLSymbol $sym95$PROBLEM_STORE_RESTRICTION_LINK_COUNT = makeSymbol("PROBLEM-STORE-RESTRICTION-LINK-COUNT");
  public static final SubLSymbol $kw96$RESIDUAL_TRANSFORMATION_LINK_COUNT = makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT");
  public static final SubLSymbol $sym97$PROBLEM_STORE_RESIDUAL_TRANSFORMATION_LINK_COUNT = makeSymbol("PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT");
  public static final SubLSymbol $kw98$UNION_LINK_COUNT = makeKeyword("UNION-LINK-COUNT");
  public static final SubLSymbol $sym99$PROBLEM_STORE_UNION_LINK_COUNT = makeSymbol("PROBLEM-STORE-UNION-LINK-COUNT");
  public static final SubLSymbol $kw100$GOOD_PROBLEM_COUNT = makeKeyword("GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym101$PROBLEM_STORE_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw102$NEUTRAL_PROBLEM_COUNT = makeKeyword("NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym103$PROBLEM_STORE_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw104$NO_GOOD_PROBLEM_COUNT = makeKeyword("NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym105$PROBLEM_STORE_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw106$SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym107$PROBLEM_STORE_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw108$CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym109$PROBLEM_STORE_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw110$JOIN_PROBLEM_COUNT = makeKeyword("JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $sym111$PROBLEM_STORE_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $kw112$SPLIT_PROBLEM_COUNT = makeKeyword("SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $sym113$PROBLEM_STORE_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $kw114$DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym115$PROBLEM_STORE_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw116$UNEXAMINED_PROBLEM_COUNT = makeKeyword("UNEXAMINED-PROBLEM-COUNT");
  public static final SubLSymbol $sym117$PROBLEM_STORE_UNEXAMINED_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-PROBLEM-COUNT");
  public static final SubLSymbol $kw118$EXAMINED_PROBLEM_COUNT = makeKeyword("EXAMINED-PROBLEM-COUNT");
  public static final SubLSymbol $sym119$PROBLEM_STORE_EXAMINED_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-PROBLEM-COUNT");
  public static final SubLSymbol $kw120$POSSIBLE_PROBLEM_COUNT = makeKeyword("POSSIBLE-PROBLEM-COUNT");
  public static final SubLSymbol $sym121$PROBLEM_STORE_POSSIBLE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-PROBLEM-COUNT");
  public static final SubLSymbol $kw122$PENDING_PROBLEM_COUNT = makeKeyword("PENDING-PROBLEM-COUNT");
  public static final SubLSymbol $sym123$PROBLEM_STORE_PENDING_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-PROBLEM-COUNT");
  public static final SubLSymbol $kw124$FINISHED_PROBLEM_COUNT = makeKeyword("FINISHED-PROBLEM-COUNT");
  public static final SubLSymbol $sym125$PROBLEM_STORE_FINISHED_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-PROBLEM-COUNT");
  public static final SubLSymbol $kw126$UNMANIFESTED_NON_FOCAL_COUNT = makeKeyword("UNMANIFESTED-NON-FOCAL-COUNT");
  public static final SubLSymbol $sym127$PROBLEM_STORE_UNMANIFESTED_NON_FOCAL_COUNT = makeSymbol("PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT");
  public static final SubLSymbol $kw128$TRANSFORMATION_RULE_BINDINGS_TO_CLOSED = makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED");
  public static final SubLSymbol $sym129$PROBLEM_STORE_TRANSFORMATION_RULE_BINDINGS_TO_CLOSED = makeSymbol("PROBLEM-STORE-TRANSFORMATION-RULE-BINDINGS-TO-CLOSED");
  public static final SubLSymbol $kw130$PROBLEM_QUERIES = makeKeyword("PROBLEM-QUERIES");
  public static final SubLSymbol $sym131$PROBLEM_STORE_ALL_PROBLEM_QUERIES = makeSymbol("PROBLEM-STORE-ALL-PROBLEM-QUERIES");
  public static final SubLSymbol $kw132$ANSWER_TIMES = makeKeyword("ANSWER-TIMES");
  public static final SubLSymbol $sym133$INFERENCE_ANSWER_TIMES = makeSymbol("INFERENCE-ANSWER-TIMES");
  public static final SubLSymbol $kw134$ANSWER_STEP_COUNTS = makeKeyword("ANSWER-STEP-COUNTS");
  public static final SubLSymbol $sym135$INFERENCE_ANSWER_STEP_COUNTS = makeSymbol("INFERENCE-ANSWER-STEP-COUNTS");
  public static final SubLSymbol $kw136$PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT = makeKeyword("PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT");
  public static final SubLSymbol $sym137$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT = makeSymbol("PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT");
  public static final SubLSymbol $kw138$ESTIMATED_EXHAUSTIVE_NEW_ROOT_COUNT = makeKeyword("ESTIMATED-EXHAUSTIVE-NEW-ROOT-COUNT");
  public static final SubLSymbol $sym139$INFERENCE_TRANSFORMATION_FANOUT_ESTIMATE = makeSymbol("INFERENCE-TRANSFORMATION-FANOUT-ESTIMATE");
  public static final SubLSymbol $kw140$TOP_LEVEL_REMOVAL_FANOUT = makeKeyword("TOP-LEVEL-REMOVAL-FANOUT");
  public static final SubLSymbol $sym141$INFERENCE_TOP_LEVEL_REMOVAL_FANOUT = makeSymbol("INFERENCE-TOP-LEVEL-REMOVAL-FANOUT");
  public static final SubLSymbol $kw142$NEW_ROOT_INITIAL_REMOVAL_FANOUTS = makeKeyword("NEW-ROOT-INITIAL-REMOVAL-FANOUTS");
  public static final SubLSymbol $sym143$INFERENCE_NEW_ROOT_INITIAL_REMOVAL_FANOUTS = makeSymbol("INFERENCE-NEW-ROOT-INITIAL-REMOVAL-FANOUTS");
  public static final SubLSymbol $kw144$PROOF_QUERY_PROPERTIES = makeKeyword("PROOF-QUERY-PROPERTIES");
  public static final SubLSymbol $sym145$INFERENCE_COMPUTE_PROOF_QUERY_PROPERTIES = makeSymbol("INFERENCE-COMPUTE-PROOF-QUERY-PROPERTIES");
  public static final SubLSymbol $kw146$ANSWER_PROOF_SPECS = makeKeyword("ANSWER-PROOF-SPECS");
  public static final SubLSymbol $sym147$INFERENCE_ALL_ANSWER_PROOF_SPECS = makeSymbol("INFERENCE-ALL-ANSWER-PROOF-SPECS");
  public static final SubLSymbol $kw148$INFERENCE_PROOF_SPEC = makeKeyword("INFERENCE-PROOF-SPEC");
  public static final SubLSymbol $sym149$INFERENCE_PROOF_SPEC = makeSymbol("INFERENCE-PROOF-SPEC");
  public static final SubLSymbol $kw150$EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES = makeKeyword("EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES");
  public static final SubLSymbol $sym151$PROBLEM_STORE_EXECUTED_REMOVAL_TACTIC_PRODUCTIVITIES = makeSymbol("PROBLEM-STORE-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES");
  public static final SubLSymbol $kw152$UNEXAMINED_GOOD_PROBLEM_COUNT = makeKeyword("UNEXAMINED-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym153$PROBLEM_STORE_UNEXAMINED_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw154$EXAMINED_GOOD_PROBLEM_COUNT = makeKeyword("EXAMINED-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym155$PROBLEM_STORE_EXAMINED_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw156$POSSIBLE_GOOD_PROBLEM_COUNT = makeKeyword("POSSIBLE-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym157$PROBLEM_STORE_POSSIBLE_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw158$PENDING_GOOD_PROBLEM_COUNT = makeKeyword("PENDING-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym159$PROBLEM_STORE_PENDING_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw160$FINISHED_GOOD_PROBLEM_COUNT = makeKeyword("FINISHED-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym161$PROBLEM_STORE_FINISHED_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw162$UNEXAMINED_NEUTRAL_PROBLEM_COUNT = makeKeyword("UNEXAMINED-NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym163$PROBLEM_STORE_UNEXAMINED_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw164$EXAMINED_NEUTRAL_PROBLEM_COUNT = makeKeyword("EXAMINED-NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym165$PROBLEM_STORE_EXAMINED_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw166$POSSIBLE_NEUTRAL_PROBLEM_COUNT = makeKeyword("POSSIBLE-NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym167$PROBLEM_STORE_POSSIBLE_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw168$PENDING_NEUTRAL_PROBLEM_COUNT = makeKeyword("PENDING-NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym169$PROBLEM_STORE_PENDING_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw170$FINISHED_NEUTRAL_PROBLEM_COUNT = makeKeyword("FINISHED-NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym171$PROBLEM_STORE_FINISHED_NEUTRAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-NEUTRAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw172$UNEXAMINED_NO_GOOD_PROBLEM_COUNT = makeKeyword("UNEXAMINED-NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym173$PROBLEM_STORE_UNEXAMINED_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw174$EXAMINED_NO_GOOD_PROBLEM_COUNT = makeKeyword("EXAMINED-NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym175$PROBLEM_STORE_EXAMINED_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw176$POSSIBLE_NO_GOOD_PROBLEM_COUNT = makeKeyword("POSSIBLE-NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym177$PROBLEM_STORE_POSSIBLE_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw178$PENDING_NO_GOOD_PROBLEM_COUNT = makeKeyword("PENDING-NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym179$PROBLEM_STORE_PENDING_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw180$FINISHED_NO_GOOD_PROBLEM_COUNT = makeKeyword("FINISHED-NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $sym181$PROBLEM_STORE_FINISHED_NO_GOOD_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-NO-GOOD-PROBLEM-COUNT");
  public static final SubLSymbol $kw182$GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("GOOD-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym183$PROBLEM_STORE_GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw184$GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("GOOD-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym185$PROBLEM_STORE_GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw186$GOOD_JOIN_PROBLEM_COUNT = makeKeyword("GOOD-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $sym187$PROBLEM_STORE_GOOD_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $kw188$GOOD_SPLIT_PROBLEM_COUNT = makeKeyword("GOOD-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $sym189$PROBLEM_STORE_GOOD_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $kw190$GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("GOOD-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym191$PROBLEM_STORE_GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-GOOD-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw192$NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym193$PROBLEM_STORE_NEUTRAL_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw194$NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym195$PROBLEM_STORE_NEUTRAL_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw196$NEUTRAL_JOIN_PROBLEM_COUNT = makeKeyword("NEUTRAL-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $sym197$PROBLEM_STORE_NEUTRAL_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $kw198$NEUTRAL_SPLIT_PROBLEM_COUNT = makeKeyword("NEUTRAL-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $sym199$PROBLEM_STORE_NEUTRAL_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $kw200$NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym201$PROBLEM_STORE_NEUTRAL_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw202$NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym203$PROBLEM_STORE_NO_GOOD_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw204$NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym205$PROBLEM_STORE_NO_GOOD_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw206$NO_GOOD_JOIN_PROBLEM_COUNT = makeKeyword("NO-GOOD-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $sym207$PROBLEM_STORE_NO_GOOD_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $kw208$NO_GOOD_SPLIT_PROBLEM_COUNT = makeKeyword("NO-GOOD-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $sym209$PROBLEM_STORE_NO_GOOD_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $kw210$NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym211$PROBLEM_STORE_NO_GOOD_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw212$UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym213$PROBLEM_STORE_UNEXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw214$UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym215$PROBLEM_STORE_UNEXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw216$UNEXAMINED_JOIN_PROBLEM_COUNT = makeKeyword("UNEXAMINED-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $sym217$PROBLEM_STORE_UNEXAMINED_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $kw218$UNEXAMINED_SPLIT_PROBLEM_COUNT = makeKeyword("UNEXAMINED-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $sym219$PROBLEM_STORE_UNEXAMINED_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $kw220$UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym221$PROBLEM_STORE_UNEXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw222$EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym223$PROBLEM_STORE_EXAMINED_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw224$EXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("EXAMINED-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym225$PROBLEM_STORE_EXAMINED_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw226$EXAMINED_JOIN_PROBLEM_COUNT = makeKeyword("EXAMINED-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $sym227$PROBLEM_STORE_EXAMINED_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $kw228$EXAMINED_SPLIT_PROBLEM_COUNT = makeKeyword("EXAMINED-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $sym229$PROBLEM_STORE_EXAMINED_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $kw230$EXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("EXAMINED-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym231$PROBLEM_STORE_EXAMINED_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-EXAMINED-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw232$POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym233$PROBLEM_STORE_POSSIBLE_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw234$POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym235$PROBLEM_STORE_POSSIBLE_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw236$POSSIBLE_JOIN_PROBLEM_COUNT = makeKeyword("POSSIBLE-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $sym237$PROBLEM_STORE_POSSIBLE_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $kw238$POSSIBLE_SPLIT_PROBLEM_COUNT = makeKeyword("POSSIBLE-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $sym239$PROBLEM_STORE_POSSIBLE_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $kw240$POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym241$PROBLEM_STORE_POSSIBLE_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw242$PENDING_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("PENDING-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym243$PROBLEM_STORE_PENDING_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw244$PENDING_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("PENDING-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym245$PROBLEM_STORE_PENDING_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw246$PENDING_JOIN_PROBLEM_COUNT = makeKeyword("PENDING-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $sym247$PROBLEM_STORE_PENDING_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $kw248$PENDING_SPLIT_PROBLEM_COUNT = makeKeyword("PENDING-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $sym249$PROBLEM_STORE_PENDING_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $kw250$PENDING_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("PENDING-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym251$PROBLEM_STORE_PENDING_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PENDING-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw252$FINISHED_SINGLE_LITERAL_PROBLEM_COUNT = makeKeyword("FINISHED-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $sym253$PROBLEM_STORE_FINISHED_SINGLE_LITERAL_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-SINGLE-LITERAL-PROBLEM-COUNT");
  public static final SubLSymbol $kw254$FINISHED_CONJUNCTIVE_PROBLEM_COUNT = makeKeyword("FINISHED-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym255$PROBLEM_STORE_FINISHED_CONJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-CONJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw256$FINISHED_JOIN_PROBLEM_COUNT = makeKeyword("FINISHED-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $sym257$PROBLEM_STORE_FINISHED_JOIN_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-JOIN-PROBLEM-COUNT");
  public static final SubLSymbol $kw258$FINISHED_SPLIT_PROBLEM_COUNT = makeKeyword("FINISHED-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $sym259$PROBLEM_STORE_FINISHED_SPLIT_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-SPLIT-PROBLEM-COUNT");
  public static final SubLSymbol $kw260$FINISHED_DISJUNCTIVE_PROBLEM_COUNT = makeKeyword("FINISHED-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $sym261$PROBLEM_STORE_FINISHED_DISJUNCTIVE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-FINISHED-DISJUNCTIVE-PROBLEM-COUNT");
  public static final SubLSymbol $kw262$SKSI_QUERY_TOTAL_TIME = makeKeyword("SKSI-QUERY-TOTAL-TIME");
  public static final SubLSymbol $sym263$SKSI_QUERY_TOTAL_TIME_ACCUMULATOR_LOOKUP = makeSymbol("SKSI-QUERY-TOTAL-TIME-ACCUMULATOR-LOOKUP");
  public static final SubLSymbol $kw264$SKSI_QUERY_START_TIMES = makeKeyword("SKSI-QUERY-START-TIMES");
  public static final SubLSymbol $sym265$SKSI_QUERY_START_TIMES_ACCUMULATOR_LOOKUP = makeSymbol("SKSI-QUERY-START-TIMES-ACCUMULATOR-LOOKUP");
  public static final SubLSymbol $kw266$SPARQL_QUERY_PROFILE = makeKeyword("SPARQL-QUERY-PROFILE");
  public static final SubLSymbol $sym267$SPARQL_QUERY_PROFILE_ACCUMULATOR_LOOKUP = makeSymbol("SPARQL-QUERY-PROFILE-ACCUMULATOR-LOOKUP");
  public static final SubLSymbol $sym268$_PROBLEM_STORE_HISTORICAL_COUNT_ = makeSymbol("*PROBLEM-STORE-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym269$_FORWARD_PROBLEM_STORE_HISTORICAL_COUNT_ = makeSymbol("*FORWARD-PROBLEM-STORE-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym270$_MAXIMUM_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_ = makeSymbol("*MAXIMUM-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*");
  public static final SubLSymbol $sym271$_MAXIMUM_FORWARD_PROBLEM_STORE_HISTORICAL_PROBLEM_COUNT_ = makeSymbol("*MAXIMUM-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT*");
  public static final SubLInteger $int272$1000 = makeInteger(1000);
  public static final SubLString $str273$Forward__S_contained__S_problems = makeString("Forward ~S contained ~S problems");
  public static final SubLSymbol $sym274$_PROBLEM_HISTORICAL_COUNT_ = makeSymbol("*PROBLEM-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym275$_GOOD_PROBLEM_HISTORICAL_COUNT_ = makeSymbol("*GOOD-PROBLEM-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym276$_NO_GOOD_PROBLEM_HISTORICAL_COUNT_ = makeSymbol("*NO-GOOD-PROBLEM-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym277$_FORWARD_PROBLEM_HISTORICAL_COUNT_ = makeSymbol("*FORWARD-PROBLEM-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym278$_SINGLE_LITERAL_PROBLEM_HISTORICAL_COUNT_ = makeSymbol("*SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym279$_PROBLEM_LINK_HISTORICAL_COUNT_ = makeSymbol("*PROBLEM-LINK-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym280$_STRUCTURAL_LINK_HISTORICAL_COUNT_ = makeSymbol("*STRUCTURAL-LINK-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym281$_CONTENT_LINK_HISTORICAL_COUNT_ = makeSymbol("*CONTENT-LINK-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym282$_REMOVAL_LINK_HISTORICAL_COUNT_ = makeSymbol("*REMOVAL-LINK-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym283$_TRANSFORMATION_LINK_HISTORICAL_COUNT_ = makeSymbol("*TRANSFORMATION-LINK-HISTORICAL-COUNT*");
  public static final SubLSymbol $kw284$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw285$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $kw286$REWRITE = makeKeyword("REWRITE");
  public static final SubLSymbol $sym287$_DEPENDENT_LINK_HISTORICAL_COUNT_ = makeSymbol("*DEPENDENT-LINK-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym288$_SINGLE_LITERAL_PROBLEM_DEPENDENT_LINK_HISTORICAL_COUNT_ = makeSymbol("*SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym289$_TACTIC_HISTORICAL_COUNT_ = makeSymbol("*TACTIC-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym290$_EXECUTED_TACTIC_HISTORICAL_COUNT_ = makeSymbol("*EXECUTED-TACTIC-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym291$_DISCARDED_TACTIC_HISTORICAL_COUNT_ = makeSymbol("*DISCARDED-TACTIC-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym292$_UNIFICATION_ATTEMPT_HISTORICAL_COUNT_ = makeSymbol("*UNIFICATION-ATTEMPT-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym293$_UNIFICATION_SUCCESS_HISTORICAL_COUNT_ = makeSymbol("*UNIFICATION-SUCCESS-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym294$_SBHL_CACHE_ATTEMPT_HISTORICAL_COUNT_ = makeSymbol("*SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym295$_SBHL_CACHE_SUCCESS_HISTORICAL_COUNT_ = makeSymbol("*SBHL-CACHE-SUCCESS-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym296$_SBHL_GRAPH_ATTEMPT_HISTORICAL_COUNT_ = makeSymbol("*SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym297$_SBHL_GRAPH_SUCCESS_HISTORICAL_COUNT_ = makeSymbol("*SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym298$_SBHL_LINK_HISTORICAL_COUNT_ = makeSymbol("*SBHL-LINK-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym299$_PROOF_HISTORICAL_COUNT_ = makeSymbol("*PROOF-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym300$_INFERENCE_HISTORICAL_COUNT_ = makeSymbol("*INFERENCE-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym301$_SUCCESSFUL_INFERENCE_HISTORICAL_COUNT_ = makeSymbol("*SUCCESSFUL-INFERENCE-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym302$_FORWARD_INFERENCE_HISTORICAL_COUNT_ = makeSymbol("*FORWARD-INFERENCE-HISTORICAL-COUNT*");
  public static final SubLSymbol $sym303$_SUCCESSFUL_FORWARD_INFERENCE_HISTORICAL_COUNT_ = makeSymbol("*SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT*");
  public static final SubLSymbol $kw304$SKSI_QUERY_TOTAL_TIME_ACC = makeKeyword("SKSI-QUERY-TOTAL-TIME-ACC");
  public static final SubLSymbol $kw305$SKSI_QUERY_START_TIMES_ACC = makeKeyword("SKSI-QUERY-START-TIMES-ACC");
  public static final SubLSymbol $kw306$SPARQL_QUERY_PROFILE_ACC = makeKeyword("SPARQL-QUERY-PROFILE-ACC");
  public static final SubLList $list307 = list(list(makeSymbol("&KEY"), makeSymbol("BROWSABLE?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list308 = list(makeKeyword("BROWSABLE?"));
  public static final SubLSymbol $kw309$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw310$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $sym311$CLET = makeSymbol("CLET");
  public static final SubLList $list312 = list(makeSymbol("*GATHERING-FORWARD-INFERENCE-METRICS?*"), T);
  public static final SubLSymbol $sym313$_BROWSE_FORWARD_INFERENCES__ = makeSymbol("*BROWSE-FORWARD-INFERENCES?*");
  public static final SubLList $list314 = list(list(makeSymbol("FINALIZE-FORWARD-INFERENCE-METRICS-INFERENCE-INDEX")));
  public static final SubLList $list315 = list(list(makeSymbol("&KEY"), makeSymbol("THRESHOLD"), makeSymbol("BROWSABLE?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list316 = list(makeKeyword("THRESHOLD"), makeKeyword("BROWSABLE?"));
  public static final SubLSymbol $kw317$THRESHOLD = makeKeyword("THRESHOLD");
  public static final SubLSymbol $sym318$GATHERING_FORWARD_INFERENCE_METRICS = makeSymbol("GATHERING-FORWARD-INFERENCE-METRICS");
  public static final SubLSymbol $sym319$SHOW_FORWARD_INFERENCE_METRICS = makeSymbol("SHOW-FORWARD-INFERENCE-METRICS");
  public static final SubLSymbol $sym320$PROGN = makeSymbol("PROGN");
  public static final SubLList $list321 = list(makeSymbol("CLEAR-FORWARD-INFERENCE-METRICS"));
  public static final SubLSymbol $sym322$SHOW_FORWARD_INFERENCE_METRICS_OF = makeSymbol("SHOW-FORWARD-INFERENCE-METRICS-OF");
  public static final SubLSymbol $sym323$_FORWARD_INFERENCE_METRICS_TIME_INDEX_ = makeSymbol("*FORWARD-INFERENCE-METRICS-TIME-INDEX*");
  public static final SubLSymbol $sym324$_FORWARD_INFERENCE_METRICS_COUNT_INDEX_ = makeSymbol("*FORWARD-INFERENCE-METRICS-COUNT-INDEX*");
  public static final SubLSymbol $sym325$_FORWARD_INFERENCE_METRICS_INFERENCE_INDEX_ = makeSymbol("*FORWARD-INFERENCE-METRICS-INFERENCE-INDEX*");
  public static final SubLSymbol $sym326$VALID_INFERENCE_P = makeSymbol("VALID-INFERENCE-P");
  public static final SubLSymbol $sym327$_FORWARD_INFERENCE_METRICS_GAF_INDEX_ = makeSymbol("*FORWARD-INFERENCE-METRICS-GAF-INDEX*");
  public static final SubLSymbol $sym328$_ = makeSymbol(">");
  public static final SubLSymbol $sym329$CDR = makeSymbol("CDR");
  public static final SubLList $list330 = cons(makeSymbol("RULE"), makeSymbol("TIME"));
  public static final SubLSymbol $kw331$RULE = makeKeyword("RULE");
  public static final SubLSymbol $kw332$TIME = makeKeyword("TIME");
  public static final SubLSymbol $kw333$TRIGGER_GAFS = makeKeyword("TRIGGER-GAFS");
  public static final SubLSymbol $kw334$INFERENCE_COUNT = makeKeyword("INFERENCE-COUNT");
  public static final SubLSymbol $kw335$INFERENCES = makeKeyword("INFERENCES");
  public static final SubLSymbol $kw336$TOTAL_INFERENCES = makeKeyword("TOTAL-INFERENCES");
  public static final SubLSymbol $kw337$TOTAL_RULES = makeKeyword("TOTAL-RULES");
  public static final SubLSymbol $kw338$AVERAGE_INFERENCES_PER_RULE = makeKeyword("AVERAGE-INFERENCES-PER-RULE");
  public static final SubLSymbol $kw339$STDEV_INFERENCES_PER_RULE = makeKeyword("STDEV-INFERENCES-PER-RULE");
  public static final SubLSymbol $kw340$AVERAGE_TIME_PER_RULE = makeKeyword("AVERAGE-TIME-PER-RULE");
  public static final SubLSymbol $kw341$STDEV_TIME_PER_RULE = makeKeyword("STDEV-TIME-PER-RULE");
  public static final SubLSymbol $kw342$AVERAGE_TIME_PER_INFERENCE = makeKeyword("AVERAGE-TIME-PER-INFERENCE");
  public static final SubLSymbol $kw343$STDEV_TIME_PER_INFERENCE = makeKeyword("STDEV-TIME-PER-INFERENCE");
  public static final SubLList $list344 = list(makeSymbol("&KEY"), makeSymbol("RULE"), makeSymbol("TIME"), makeSymbol("TRIGGER-GAFS"), makeSymbol("INFERENCE-COUNT"), makeSymbol("INFERENCES"));
  public static final SubLList $list345 = list(makeKeyword("RULE"), makeKeyword("TIME"), makeKeyword("TRIGGER-GAFS"), makeKeyword("INFERENCE-COUNT"), makeKeyword("INFERENCES"));
  public static final SubLString $str346$___6F____S____S__a__S = makeString("~%~6F : ~S : ~S  a ~S");
  public static final SubLString $str347$___S = makeString("~%~S");
  public static final SubLSymbol $sym348$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLString $str349$__Total_inferences_______________ = makeString("~%Total inferences                   : ~6,' D");
  public static final SubLString $str350$___total_forward__data_directed__ = makeString("~% total forward (data directed)     : ~6,' D");
  public static final SubLString $str351$____successful_forward___________ = makeString("~%  successful forward               : ~6,' D");
  public static final SubLString $str352$___total_backward__query_directed = makeString("~% total backward (query directed)   : ~6,' D");
  public static final SubLString $str353$____successful_backward__________ = makeString("~%  successful backward              : ~6,' D");
  public static final SubLString $str354$___avg_relevant_problem_count____ = makeString("~% avg relevant problem count        : ~6,' D");
  public static final SubLString $str355$__Total_problem_stores___________ = makeString("~%Total problem stores               : ~6,' D");
  public static final SubLString $str356$___total_forward___data_directed_ = makeString("~% total forward  (data directed)    : ~6,' D");
  public static final SubLString $str357$___max_problem_store_problem_coun = makeString("~% max problem store problem count   : ~6,' D");
  public static final SubLString $str358$___avg_problem_store_problem_coun = makeString("~% avg problem store problem count   : ~6,' D");
  public static final SubLString $str359$___max_forward_problem_store_prob = makeString("~% max forward problem store problem count   : ~6,' D");
  public static final SubLString $str360$___avg_forward_problem_store_prob = makeString("~% avg forward problem store problem count   : ~6,' D");
  public static final SubLString $str361$__Total_problems_____________6___ = makeString("~%Total problems          : ~6,' D");
  public static final SubLString $str362$___total_good_problems_______6___ = makeString("~% total good problems    : ~6,' D");
  public static final SubLString $str363$___total_no_good_problems____6___ = makeString("~% total no-good problems : ~6,' D");
  public static final SubLString $str364$___total_forward_problems____6___ = makeString("~% total forward problems : ~6,' D");
  public static final SubLString $str365$___total_problem_reuses______6___ = makeString("~% total problem reuses   : ~6,' D");
  public static final SubLString $str366$____problem_reuse_ratio______6___ = makeString("~%  problem reuse ratio   : ~6,' D per problem");
  public static final SubLString $str367$__Total_problem_links________6___ = makeString("~%Total problem links     : ~6,' D");
  public static final SubLString $str368$___total_structural_links____6___ = makeString("~% total structural links : ~6,' D");
  public static final SubLString $str369$___total_content_links_______6___ = makeString("~% total content links    : ~6,' D");
  public static final SubLString $str370$____removal_links____________6___ = makeString("~%  removal links         : ~6,' D");
  public static final SubLString $str371$____transformation_links_____6___ = makeString("~%  transformation links  : ~6,' D");
  public static final SubLString $str372$__Total_tactics_______6___D = makeString("~%Total tactics    : ~6,' D");
  public static final SubLString $str373$___total_executed_____6___D = makeString("~% total executed  : ~6,' D");
  public static final SubLString $str374$___total_discarded____6___D = makeString("~% total discarded : ~6,' D");
  public static final SubLString $str375$__Total_SBHL_cache_calls______9__ = makeString("~%Total SBHL cache calls   : ~9,' D");
  public static final SubLString $str376$___successful_________________9__ = makeString("~% successful              : ~9,' D");
  public static final SubLString $str377$__Total_SBHL_graph_walks______9__ = makeString("~%Total SBHL graph walks   : ~9,' D");
  public static final SubLString $str378$__Total_unification_attempts____6 = makeString("~%Total unification attempts : ~6,' D");
  public static final SubLString $str379$___successful_unifications______6 = makeString("~% successful unifications   : ~6,' D");
  public static final SubLString $str380$__Total_proofs____6___D = makeString("~%Total proofs : ~6,' D");
  public static final SubLInteger $int381$100 = makeInteger(100);
  public static final SubLString $str382$___2___D___ = makeString(" (~2,' D %)");
  public static final SubLString $str383$___3___D___ = makeString(" (~3,' D %)");
  public static final SubLString $str384$___D___ = makeString(" (~D %)");

  //// Initializers

  public void declareFunctions() {
    declare_inference_metrics_file();
  }

  public void initializeVariables() {
    init_inference_metrics_file();
  }

  public void runTopLevelForms() {
    setup_inference_metrics_file();
  }

}
