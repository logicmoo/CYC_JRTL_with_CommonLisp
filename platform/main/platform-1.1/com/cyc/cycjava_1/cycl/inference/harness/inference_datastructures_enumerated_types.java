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

package  com.cyc.cycjava_1.cycl.inference.harness;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava_1.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_datastructures_enumerated_types extends SubLTranslatedFile {

  //// Constructor

  private inference_datastructures_enumerated_types() {}
  public static final SubLFile me = new inference_datastructures_enumerated_types();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 1743) 
  public static final SubLObject query_property_p(SubLObject object) {
    return makeBoolean(((NIL != query_static_property_p(object))
          || (NIL != query_dynamic_property_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 2797) 
  public static final SubLObject query_static_property_p(SubLObject object) {
    return makeBoolean(((NIL != inference_static_property_p(object))
          || (NIL != problem_store_static_property_p(object))
          || (NIL != strategy_static_property_p(object))));
  }

  public static final class $query_static_property_p$UnaryFunction extends UnaryFunction {
    public $query_static_property_p$UnaryFunction() { super(extractFunctionNamed("QUERY-STATIC-PROPERTY-P")); }
    public SubLObject processItem(SubLObject arg1) { return query_static_property_p(arg1); }
  }

  /** WARNING! This will filter out the :inference-mode property!
   If you're passing the result of this to new-continuable-inference,
   call @xref extract-query-static-or-meta-properties instead! */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 3117) 
  public static final SubLObject extract_query_static_properties(SubLObject v_properties) {
    return list_utilities.filter_plist(v_properties, $sym4$QUERY_STATIC_PROPERTY_P);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4108) 
  public static final SubLObject query_dynamic_property_p(SubLObject object) {
    return makeBoolean(((NIL != inference_dynamic_property_p(object))
          || (NIL != problem_store_dynamic_property_p(object))
          || (NIL != strategy_dynamic_property_p(object))));
  }

  public static final class $query_dynamic_property_p$UnaryFunction extends UnaryFunction {
    public $query_dynamic_property_p$UnaryFunction() { super(extractFunctionNamed("QUERY-DYNAMIC-PROPERTY-P")); }
    public SubLObject processItem(SubLObject arg1) { return query_dynamic_property_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4436) 
  public static final SubLObject extract_query_dynamic_properties(SubLObject v_properties) {
    return list_utilities.filter_plist(v_properties, $sym6$QUERY_DYNAMIC_PROPERTY_P);
  }

  /** The set of metrics that have special code support in @xref inference-compute-metrics
instead of being declared via @xref declare-inference-metric. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 4826) 
  private static SubLSymbol $specially_handled_inference_metrics$ = null;

  /** The set of metrics that are not to be gathered from the inference object.
These are also not declared via @xref declare-inference-metric. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5271) 
  private static SubLSymbol $non_inference_query_metrics$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5554) 
  public static final SubLObject query_metric_p(SubLObject object) {
    return makeBoolean((object.isKeyword()
           && ((NIL != list_utilities.member_eqP(object, $specially_handled_inference_metrics$.getGlobalValue()))
            || (NIL != list_utilities.member_eqP(object, $non_inference_query_metrics$.getGlobalValue()))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36316")))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 5794) 
  public static final SubLObject inference_query_metric_p(SubLObject object) {
    return makeBoolean(((NIL != query_metric_p(object))
           && (NIL == subl_promotions.memberP(object, $non_inference_query_metrics$.getGlobalValue(), UNPROVIDED, UNPROVIDED))));
  }

  public static final class $inference_query_metric_p$UnaryFunction extends UnaryFunction {
    public $inference_query_metric_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-QUERY-METRIC-P")); }
    public SubLObject processItem(SubLObject arg1) { return inference_query_metric_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6158) 
  private static SubLSymbol $arete_query_metrics$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 6595) 
  private static SubLSymbol $removal_ask_query_metrics$ = null;

  /** Necessarily essential properties of an inference that are needed at creation time
and cannot change while an inference is suspended. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 7296) 
  private static SubLSymbol $inference_static_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 11620) 
  public static final SubLObject inference_static_property_p(SubLObject object) {
    return list_utilities.member_eqP(object, $inference_static_properties$.getGlobalValue());
  }

  public static final class $inference_static_property_p$UnaryFunction extends UnaryFunction {
    public $inference_static_property_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-STATIC-PROPERTY-P")); }
    public SubLObject processItem(SubLObject arg1) { return inference_static_property_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 11850) 
  public static final SubLObject extract_inference_static_properties(SubLObject v_properties) {
    return list_utilities.filter_plist(v_properties, $sym13$INFERENCE_STATIC_PROPERTY_P);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12599) 
  public static final SubLObject inference_properties_problem_store(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw15$PROBLEM_STORE, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12713) 
  private static SubLSymbol $inference_allows_hl_predicate_transformation_by_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 12799) 
  public static final SubLObject inference_properties_allow_hl_predicate_transformationP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_, $inference_allows_hl_predicate_transformation_by_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13009) 
  private static SubLSymbol $inference_allows_unbound_predicate_transformation_by_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13100) 
  public static final SubLObject inference_properties_allow_unbound_predicate_transformationP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, $inference_allows_unbound_predicate_transformation_by_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13325) 
  private static SubLSymbol $inference_allows_evaluatable_predicate_transformation_by_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13420) 
  public static final SubLObject inference_properties_allow_evaluatable_predicate_transformationP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, $inference_allows_evaluatable_predicate_transformation_by_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13657) 
  private static SubLSymbol $inference_allows_indeterminate_results_by_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 13819) 
  public static final SubLObject inference_properties_allow_indeterminate_resultsP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw19$ALLOW_INDETERMINATE_RESULTS_, $inference_allows_indeterminate_results_by_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14011) 
  private static SubLSymbol $default_allowed_rules$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14063) 
  public static final SubLObject inference_properties_allowed_rules(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw21$ALLOWED_RULES, $default_allowed_rules$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14196) 
  private static SubLSymbol $default_forbidden_rules$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14250) 
  public static final SubLObject inference_properties_forbidden_rules(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw23$FORBIDDEN_RULES, $default_forbidden_rules$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14389) 
  private static SubLSymbol $default_allowed_modules$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14444) 
  public static final SubLObject inference_properties_allowed_modules(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw24$ALLOWED_MODULES, $default_allowed_modules$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14583) 
  private static SubLSymbol $inference_allows_abnormality_checking_by_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14664) 
  public static final SubLObject inference_properties_allow_abnormality_checkingP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw25$ALLOW_ABNORMALITY_CHECKING_, $inference_allows_abnormality_checking_by_defaultP$.getGlobalValue());
  }

  /** Constraints on how the inference is to be run.  These can change while an inference is suspended, and will be honoured upon its continuation. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 14853) 
  private static SubLSymbol $inference_resource_constraints$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 15884) 
  public static final SubLObject inference_resource_constraint_p(SubLObject object) {
    return list_utilities.member_eqP(object, $inference_resource_constraints$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16269) 
  public static SubLSymbol $default_max_number$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16318) 
  public static final SubLObject inference_properties_max_number(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw28$MAX_NUMBER, $default_max_number$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16442) 
  public static SubLSymbol $default_max_time$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16489) 
  public static final SubLObject inference_properties_max_time(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw29$MAX_TIME, $default_max_time$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16607) 
  public static SubLSymbol $default_max_step$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16654) 
  public static final SubLObject inference_properties_max_step(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw30$MAX_STEP, $default_max_step$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16772) 
  public static final SubLObject inference_properties_mode(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw31$INFERENCE_MODE, $default_inference_mode$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16898) 
  public static SubLSymbol $default_forward_max_time$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 16951) 
  public static final SubLObject inference_properties_forward_max_time(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw32$FORWARD_MAX_TIME, $default_forward_max_time$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17093) 
  public static SubLSymbol $default_max_proof_depth$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17147) 
  public static final SubLObject inference_properties_max_proof_depth(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw33$MAX_PROOF_DEPTH, $default_max_proof_depth$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17286) 
  public static SubLSymbol $default_max_transformation_depth$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17347) 
  public static final SubLObject inference_properties_max_transformation_depth(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw34$MAX_TRANSFORMATION_DEPTH, $default_max_transformation_depth$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17513) 
  public static SubLSymbol $default_probably_approximately_done$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17577) 
  public static final SubLObject inference_properties_probably_approximately_done(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw35$PROBABLY_APPROXIMATELY_DONE, $default_probably_approximately_done$.getGlobalValue());
  }

  /** Other properties that can change during suspension, but are not resource constraints. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 17752) 
  private static SubLSymbol $inference_other_dynamic_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 21256) 
  public static final SubLObject inference_dynamic_property_p(SubLObject object) {
    return makeBoolean(((NIL != inference_resource_constraint_p(object))
          || (NIL != list_utilities.member_eqP(object, $inference_other_dynamic_properties$.getGlobalValue()))));
  }

  public static final class $inference_dynamic_property_p$UnaryFunction extends UnaryFunction {
    public $inference_dynamic_property_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-DYNAMIC-PROPERTY-P")); }
    public SubLObject processItem(SubLObject arg1) { return inference_dynamic_property_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 21548) 
  public static final SubLObject extract_inference_dynamic_properties(SubLObject v_properties) {
    return list_utilities.filter_plist(v_properties, $sym37$INFERENCE_DYNAMIC_PROPERTY_P);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 21933) 
  public static SubLSymbol $default_inference_metrics_template$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 21998) 
  public static final SubLObject inference_properties_metrics(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw38$METRICS, $default_inference_metrics_template$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 22424) 
  private static SubLSymbol $strategy_static_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23019) 
  public static final SubLObject strategy_static_property_p(SubLObject object) {
    return list_utilities.member_eqP(object, $strategy_static_properties$.getGlobalValue());
  }

  public static final class $strategy_static_property_p$UnaryFunction extends UnaryFunction {
    public $strategy_static_property_p$UnaryFunction() { super(extractFunctionNamed("STRATEGY-STATIC-PROPERTY-P")); }
    public SubLObject processItem(SubLObject arg1) { return strategy_static_property_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23245) 
  public static final SubLObject extract_strategy_static_properties(SubLObject v_properties) {
    return list_utilities.filter_plist(v_properties, $sym41$STRATEGY_STATIC_PROPERTY_P);
  }

  /** The default productivity above which tactics will not be considered for removal backtracking.
   The original value is set to 200. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 23554) 
  public static SubLSymbol $default_removal_backtracking_productivity_limit$ = null;

  /** The default proof spec that will be used in inference. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24040) 
  public static SubLSymbol $default_proof_spec$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24285) 
  private static SubLSymbol $strategy_dynamic_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24631) 
  public static final SubLObject strategy_dynamic_property_p(SubLObject object) {
    return list_utilities.member_eqP(object, $strategy_dynamic_properties$.getGlobalValue());
  }

  public static final class $strategy_dynamic_property_p$UnaryFunction extends UnaryFunction {
    public $strategy_dynamic_property_p$UnaryFunction() { super(extractFunctionNamed("STRATEGY-DYNAMIC-PROPERTY-P")); }
    public SubLObject processItem(SubLObject arg1) { return strategy_dynamic_property_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 24861) 
  public static final SubLObject extract_strategy_dynamic_properties(SubLObject v_properties) {
    return list_utilities.filter_plist(v_properties, $sym47$STRATEGY_DYNAMIC_PROPERTY_P);
  }

  /** The default productivity above which tactics will be ignored instead of
executed.  The original value was set to 2 * 100 * *default-removal-cost-cutoff*.
The 100 is for the productivity to number of children multiplier, and the 2 is for
the join-ordered productivity multiplier, because everything in the old harness is
basically a join-ordered. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25175) 
  public static SubLSymbol $default_productivity_limit$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 25623) 
  public static final SubLObject strategy_dynamic_properties_productivity_limit(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw49$PRODUCTIVITY_LIMIT, $default_productivity_limit$.getGlobalValue());
  }

  public static final class $problem_store_property_p$UnaryFunction extends UnaryFunction {
    public $problem_store_property_p$UnaryFunction() { super(extractFunctionNamed("PROBLEM-STORE-PROPERTY-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36505"); }
  }

  /** The list of valid properties that you can pass in when creating a new problem store */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 26464) 
  private static SubLSymbol $problem_store_static_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31085) 
  public static final SubLObject problem_store_static_property_p(SubLObject object) {
    return list_utilities.member_eqP(object, $problem_store_static_properties$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31703) 
  private static SubLSymbol $problem_store_dynamic_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 31816) 
  public static final SubLObject problem_store_dynamic_property_p(SubLObject object) {
    return list_utilities.member_eqP(object, $problem_store_dynamic_properties$.getGlobalValue());
  }

  /** A list of meta-properties that can affect all types of other problem store, strategy, and inference properties. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 32262) 
  private static SubLSymbol $inference_meta_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 33647) 
  private static SubLSymbol $inference_statuses$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 34561) 
  private static SubLSymbol $continuable_inference_statuses$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 34649) 
  public static final SubLObject continuable_inference_status_p(SubLObject object) {
    return list_utilities.member_eqP(object, $continuable_inference_statuses$.getGlobalValue());
  }

  /** :not-a-query is used by janus-modification-operation-p which overloads the notion of 'inference'. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 34767) 
  private static SubLSymbol $avoided_inference_reasons$ = null;

  /** These are the proper suspend statuses, but there are also the inference-halt-conditions. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 35104) 
  private static SubLSymbol $inference_suspend_statuses$ = null;

  /** @return booleanp ; whether STATUS makes sense to have a suspend status. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 36464) 
  public static final SubLObject inference_suspend_status_applicableP(SubLObject status) {
    checkType(status, $sym60$INFERENCE_STATUS_P);
    return makeBoolean(((status == $kw61$SUSPENDED)
          || (status == $kw62$TAUTOLOGY)));
  }

  /** The suspend statuses for which the inference is still continuable. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 36712) 
  private static SubLSymbol $continuable_inference_suspend_statuses$ = null;

  /** The suspend statuses that indicate an exhausted inference. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37267) 
  private static SubLSymbol $exhausted_inference_suspend_statuses$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 37842) 
  public static final SubLObject new_inference_error_suspend_status(SubLObject message) {
    checkType(message, $sym66$STRINGP);
    return list($kw65$ERROR, message);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 38764) 
  private static SubLSymbol $tactical_statuses$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39235) 
  private static SubLSymbol $provability_statuses$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 39523) 
  private static SubLSymbol $problem_status_table$ = null;

  /** An ordered list, from weakest to strongest, of the tactical statuses */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 41536) 
  private static SubLSymbol $ordered_tactical_statuses$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42603) 
  public static final SubLObject tactical_status_from_problem_status(SubLObject status) {
    {
      SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
      SubLObject triple = NIL;
      for (triple = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), triple = cdolist_list_var.first()) {
        if ((status == triple.first())) {
          return conses_high.second(triple);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 42891) 
  public static final SubLObject provability_status_from_problem_status(SubLObject status) {
    {
      SubLObject cdolist_list_var = $problem_status_table$.getGlobalValue();
      SubLObject triple = NIL;
      for (triple = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), triple = cdolist_list_var.first()) {
        if ((status == triple.first())) {
          return conses_high.third(triple);
        }
      }
    }
    return NIL;
  }

  /** statuses which indicate a goal descendant */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43192) 
  public static final SubLObject good_problem_status_p(SubLObject status) {
    return Equality.eq($kw74$GOOD, provability_status_from_problem_status(status));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43356) 
  public static final SubLObject no_good_problem_status_p(SubLObject status) {
    return Equality.eq($kw75$NO_GOOD, provability_status_from_problem_status(status));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43604) 
  public static final SubLObject unexamined_problem_status_p(SubLObject status) {
    return Equality.eq($kw77$UNEXAMINED, tactical_status_from_problem_status(status));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43732) 
  public static final SubLObject examined_problem_status_p(SubLObject status) {
    return Equality.eq($kw78$EXAMINED, tactical_status_from_problem_status(status));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43855) 
  public static final SubLObject possible_problem_status_p(SubLObject status) {
    return Equality.eq($kw79$POSSIBLE, tactical_status_from_problem_status(status));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 43978) 
  public static final SubLObject pending_problem_status_p(SubLObject status) {
    return Equality.eq($kw80$PENDING, tactical_status_from_problem_status(status));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44099) 
  public static final SubLObject finished_problem_status_p(SubLObject status) {
    return Equality.eq($kw81$FINISHED, tactical_status_from_problem_status(status));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44222) 
  private static SubLSymbol $add_restriction_layer_of_indirection_by_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44430) 
  public static final SubLObject problem_store_properties_add_restriction_layer_of_indirectionP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw82$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $add_restriction_layer_of_indirection_by_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44642) 
  private static SubLSymbol $negation_by_failure_by_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44782) 
  public static final SubLObject problem_store_properties_negation_by_failureP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw83$NEGATION_BY_FAILURE_, $negation_by_failure_by_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 44943) 
  public static final SubLObject problem_store_properties_completeness_minimization_allowedP(SubLObject v_properties) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return conses_high.getf(v_properties, $kw84$COMPLETENESS_MINIMIZATION_ALLOWED_, control_vars.$complete_extent_minimization$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45393) 
  private static SubLSymbol $evaluate_subl_allowed_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45536) 
  public static final SubLObject problem_store_properties_evaluate_subl_allowedP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw85$EVALUATE_SUBL_ALLOWED_, $evaluate_subl_allowed_defaultP$.getGlobalValue());
  }

  /** This is a parameter so it can be bound for tests. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45700) 
  private static SubLSymbol $rewrite_allowed_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 45874) 
  public static final SubLObject problem_store_properties_rewrite_allowedP(SubLObject v_properties) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return conses_high.getf(v_properties, $kw86$REWRITE_ALLOWED_, $rewrite_allowed_defaultP$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46020) 
  private static SubLSymbol $abduction_allowed_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46146) 
  public static final SubLObject problem_store_properties_abduction_allowedP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw87$ABDUCTION_ALLOWED_, $abduction_allowed_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46298) 
  public static SubLSymbol $new_terms_allowed_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46424) 
  public static final SubLObject problem_store_properties_new_terms_allowedP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw88$NEW_TERMS_ALLOWED_, $new_terms_allowed_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46576) 
  public static SubLSymbol $compute_answer_justifications_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46751) 
  public static final SubLObject problem_store_properties_compute_answer_justificationsP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw89$COMPUTE_ANSWER_JUSTIFICATIONS_, $compute_answer_justifications_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 46939) 
  public static SubLSymbol $default_inference_mode$ = null;

  /** The list of inference modes (inference parameter clusters) known to the Strategist.
   :custom is the special inference mode meaning 'no inference mode, just use the
   values of the parameters' */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47051) 
  private static SubLSymbol $inference_modes$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47508) 
  private static SubLSymbol $problem_link_types$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 47976) 
  private static SubLSymbol $default_problem_store_name$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48173) 
  public static final SubLObject problem_store_properties_name(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw93$PROBLEM_STORE_NAME, $default_problem_store_name$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48311) 
  public static SubLSymbol $default_equality_reasoning_method$ = null;

  /** The methods of equality reasoning the problem store could use to determine
whether a new problem is equal to an existing problem. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48513) 
  private static SubLSymbol $problem_store_equality_reasoning_methods$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 48925) 
  public static final SubLObject problem_store_properties_equality_reasoning_method(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw96$EQUALITY_REASONING_METHOD, $default_equality_reasoning_method$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49098) 
  public static SubLSymbol $default_equality_reasoning_domain$ = null;

  /** The domain of the equality reasoning the problem store performs.  Does it try to
do equality reasoning on all problems, or just a certain subclass of problems? */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49293) 
  private static SubLSymbol $problem_store_equality_reasoning_domains$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49749) 
  public static final SubLObject problem_store_properties_equality_reasoning_domain(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw98$EQUALITY_REASONING_DOMAIN, $default_equality_reasoning_domain$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 49922) 
  private static SubLSymbol $default_intermediate_step_validation_level$ = null;

  /** The levels of intermediate step (proof) validation that can be handled by problem stores. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50197) 
  private static SubLSymbol $intermediate_step_validation_levels$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50733) 
  public static final SubLObject problem_store_properties_intermediate_step_validation_level(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw100$INTERMEDIATE_STEP_VALIDATION_LEVEL, $default_intermediate_step_validation_level$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 50933) 
  public static SubLSymbol $default_max_problem_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51140) 
  public static final SubLObject problem_store_properties_max_problem_count(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw102$MAX_PROBLEM_COUNT, $default_max_problem_count$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51289) 
  private static SubLSymbol $removal_allowed_by_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51364) 
  public static final SubLObject removal_allowed_by_propertiesP(SubLObject problem_store_properties) {
    return conses_high.getf(problem_store_properties, $kw103$REMOVAL_ALLOWED_, $removal_allowed_by_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51530) 
  private static SubLSymbol $transformation_allowed_by_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51619) 
  public static final SubLObject transformation_allowed_by_propertiesP(SubLObject problem_store_properties) {
    return conses_high.getf(problem_store_properties, $kw104$TRANSFORMATION_ALLOWED_, $transformation_allowed_by_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51806) 
  public static SubLSymbol $default_problem_store_inference_direction$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 51954) 
  private static SubLSymbol $inference_directions$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52264) 
  public static final SubLObject problem_store_properties_direction(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw107$DIRECTION, $default_problem_store_inference_direction$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52413) 
  private static SubLSymbol $tactic_statuses$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 52689) 
  private static SubLSymbol $tactic_types$ = null;

  /** @return tactic-type-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53103) 
  public static final SubLObject tactic_type_from_hl_module(SubLObject hl_module) {
    if ((NIL != inference_modules.removal_module_p(hl_module))) {
      return $kw110$REMOVAL;
    } else if ((NIL != inference_modules.transformation_module_p(hl_module))) {
      return $kw111$TRANSFORMATION;
    } else if ((NIL != inference_modules.structural_module_p(hl_module))) {
      return $kw112$STRUCTURAL;
    } else if ((NIL != inference_modules.meta_structural_module_p(hl_module))) {
      return $kw112$STRUCTURAL;
    } else if ((NIL != inference_modules.conjunctive_removal_module_p(hl_module))) {
      return $kw113$REMOVAL_CONJUNCTIVE;
    } else if ((NIL != inference_modules.rewrite_module_p(hl_module))) {
      return $kw114$REWRITE;
    } else if ((NIL != inference_modules.meta_removal_module_p(hl_module))) {
      return $kw115$META_REMOVAL;
    } else if ((NIL != inference_modules.meta_transformation_module_p(hl_module))) {
      return $kw111$TRANSFORMATION;
    } else {
      Errors.error($str116$HL_Module_of_unknown_type___s, hl_module);
    }
    return NIL;
  }

  /** These are sorted from least complete to most complete. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 53838) 
  private static SubLSymbol $ordered_completenesses$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 54500) 
  public static final SubLObject completeness_p(SubLObject object) {
    return list_utilities.member_eqP(object, $ordered_completenesses$.getGlobalValue());
  }

  /** @return boolean; t iff COMPLETENESS1 is _less_ complete than COMPLETENESS2. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 54678) 
  public static final SubLObject completeness_L(SubLObject completeness1, SubLObject completeness2) {
    checkType(completeness1, $sym118$COMPLETENESS_P);
    checkType(completeness2, $sym118$COMPLETENESS_P);
    return list_utilities.position_L(completeness1, completeness2, $ordered_completenesses$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
  }

  /** @return boolean; t iff COMPLETENESS1 is _more_ complete than COMPLETENESS2. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 54983) 
  public static final SubLObject completeness_G(SubLObject completeness1, SubLObject completeness2) {
    return completeness_L(completeness2, completeness1);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 55837) 
  public static final SubLObject productivity_p(SubLObject object) {
    return makeBoolean(((NIL != number_utilities.positive_infinity_p(object))
          || (NIL != subl_promotions.non_negative_integer_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56007) 
  public static final SubLObject infinite_productivity_p(SubLObject object) {
    return number_utilities.positive_infinity_p(object);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56094) 
  private static SubLSymbol $productivity_to_number_table$ = null;

  /** Converts an expected number of children to a tactic-productivity. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56214) 
  public static final SubLObject productivity_for_number_of_children(SubLObject number_of_children) {
    if (number_of_children.isInteger()) {
      return Numbers.multiply($int48$100, number_of_children);
    }
    {
      SubLObject productivity = list_utilities.alist_lookup_without_values($productivity_to_number_table$.getGlobalValue(), number_of_children, UNPROVIDED, UNPROVIDED);
      if ((NIL == productivity)) {
        productivity = Numbers.truncate(Numbers.multiply($int48$100, number_of_children), UNPROVIDED);
      }
      return productivity;
    }
  }

  /** Converts a productivity to an expected number of children. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56727) 
  public static final SubLObject number_of_children_for_productivity(SubLObject productivity) {
    return Numbers.integerDivide(productivity, $int48$100);
  }

  /** Converts a productivity to cost, which is like an expected number
   of children, but it can be fractional. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 56947) 
  public static final SubLObject cost_for_productivity(SubLObject productivity) {
    return Numbers.divide(productivity, $int48$100);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57142) 
  public static final SubLObject removal_cost_cutoff_for_productivity(SubLObject productivity) {
    checkType(productivity, $sym131$PRODUCTIVITY_P);
    if ((NIL != number_utilities.positive_infinity_p(productivity))) {
      return NIL;
    } else {
      return cost_for_productivity(productivity);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57499) 
  public static final SubLObject productivity_L(SubLObject productivity1, SubLObject productivity2) {
    checkType(productivity1, $sym131$PRODUCTIVITY_P);
    checkType(productivity2, $sym131$PRODUCTIVITY_P);
    return number_utilities.potentially_infinite_integer_L(productivity1, productivity2);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57718) 
  public static final SubLObject productivity_LE(SubLObject productivity1, SubLObject productivity2) {
    return number_utilities.potentially_infinite_integer_LE(productivity1, productivity2);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 57851) 
  public static final SubLObject productivity_G(SubLObject productivity1, SubLObject productivity2) {
    return number_utilities.potentially_infinite_integer_G(productivity1, productivity2);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58249) 
  public static final SubLObject productivity_max(SubLObject productivity1, SubLObject productivity2) {
    return ((NIL != productivity_L(productivity1, productivity2)) ? ((SubLObject) productivity2) : productivity1);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58640) 
  public static final SubLObject productivity_times_number(SubLObject productivity, SubLObject number) {
    return number_utilities.potentially_infinite_integer_times_number_rounded(productivity, number);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58785) 
  public static final SubLObject productivity_divide_number(SubLObject productivity, SubLObject number) {
    return number_utilities.potentially_infinite_integer_divided_by_number_rounded(productivity, number);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 58936) 
  public static final SubLObject decrement_productivity_for_number_of_children(SubLObject productivity, SubLObject number) {
    if ((number == UNPROVIDED)) {
      number = ONE_INTEGER;
    }
    return productivity_for_number_of_children(Numbers.subtract(number_of_children_for_productivity(productivity), number));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59144) 
  private static SubLSymbol $proof_statuses$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59395) 
  private static SubLSymbol $proof_reject_reasons$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 59881) 
  private static SubLSymbol $destructibility_statuses$ = null;

  /** Obsolete.  Use *balancing-tactician?* instead. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61166) 
  public static SubLSymbol $wallendaP$ = null;

  /** Whether to use the balancing tactician, except for abduction. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61426) 
  public static SubLSymbol $balancing_tacticianP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61542) 
  public static final SubLObject balancing_tactician_enabledP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != $wallendaP$.getDynamicValue(thread))
            || (NIL != $balancing_tacticianP$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 61640) 
  private static SubLSymbol $balancing_tactician_strategy_type_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 65218) 
  private static SubLSymbol $legacy_strategy_type_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 66637) 
  private static SubLSymbol $strategy_type_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 67050) 
  public static final SubLObject strategy_default_method_handler(SubLObject method) {
    checkType(method, $sym148$STRATEGY_TYPE_PROPERTY_P);
    {
      SubLObject handler = list_utilities.alist_lookup($strategy_type_properties$.getGlobalValue(), method, UNPROVIDED, UNPROVIDED);
      if (($kw149$MUST_OVERRIDE == handler)) {
        return Errors.error($str150$Strategy_must_implement_method__s, method);
      } else {
        return handler;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 67341) 
  private static SubLSymbol $inference_return_types$ = null;

  /** The default :return type for inference. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 67721) 
  public static SubLSymbol $inference_default_return_type$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 68121) 
  public static final SubLObject inference_template_return_type_p(SubLObject object) {
    return makeBoolean((object.isCons()
           && ($kw153$TEMPLATE == object.first())));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 68639) 
  public static final SubLObject inference_properties_return_type(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw155$RETURN, $inference_default_return_type$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 68771) 
  private static SubLSymbol $inference_answer_languages$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 68947) 
  public static SubLSymbol $inference_default_answer_language$ = null;

  /** @return inference-answer-language-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69122) 
  public static final SubLObject inference_properties_answer_language(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw158$ANSWER_LANGUAGE, $inference_default_answer_language$.getGlobalValue());
  }

  /** Ways in which results can be unique in a strategy */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69311) 
  private static SubLSymbol $result_uniqueness_criteria$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69586) 
  public static SubLSymbol $default_result_uniqueness_criterion$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69771) 
  public static final SubLObject inference_properties_uniqueness_criterion(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw160$RESULT_UNIQUENESS, $default_result_uniqueness_criterion$.getGlobalValue());
  }

  /** Possible policies for handling the free EL vars in disjunctions */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 69929) 
  private static SubLSymbol $inference_disjunction_free_el_vars_policies$ = null;

  /** The policy with respect to the handling of free el variables in disjunctive queries.
  Must be one of :REQUIRE-EQUAL , :COMPUTE-INTERSECTION , or :COMPUTE-UNION . */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70288) 
  public static SubLSymbol $default_inference_disjunction_free_el_vars_policy$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70698) 
  public static final SubLObject inference_properties_disjunction_free_el_vars_policy(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw163$DISJUNCTION_FREE_EL_VARS_POLICY, $default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
  }

  /** Possible modes for generating transitive closures in modules such as TVA.
   :none    - no transitive closures
   :focused - only focused transitive closures (i.e., not in the fan out direction)
   :all     - full transitive closure generation */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 70895) 
  private static SubLSymbol $inference_transitive_closure_modes$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71344) 
  private static SubLSymbol $inference_transitive_closure_mode_default$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71546) 
  public static final SubLObject inference_properties_transitive_closure_mode(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw165$TRANSITIVE_CLOSURE_MODE, $inference_transitive_closure_mode_default$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71719) 
  public static SubLSymbol $maintain_term_working_set_defaultP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 71875) 
  public static final SubLObject inference_properties_maintain_term_working_setP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw166$MAINTAIN_TERM_WORKING_SET_, $maintain_term_working_set_defaultP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72047) 
  public static SubLSymbol $inference_events_default$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72133) 
  public static final SubLObject inference_properties_events(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw167$EVENTS, $inference_events_default$.getGlobalValue());
  }

  /** :new-answer tells the inference to signal an :inference-new-answer event
     when a new inference answer is created.
   :status-change tells the inference to signal an :inference-status-change event
     when the inference-status changes.
   :new-transformation-depth-reached tells the inference to signal an :inference-new-transformation-depth-reached event
     when it reaches a problem deeper than it has reached before.
   To be extended. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 72255) 
  private static SubLSymbol $inference_event_types$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73009) 
  private static SubLSymbol $inference_halt_conditions_default$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73129) 
  public static final SubLObject inference_properties_halt_conditions(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw169$HALT_CONDITIONS, $inference_halt_conditions_default$.getGlobalValue());
  }

  /** :look-no-deeper-for-additional-answers tells the inference to halt if it's gotten some answers at
     a transformation depth N and is considering going to depth N+1.
   To be extended. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73278) 
  private static SubLSymbol $inference_halt_conditions$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73560) 
  public static final SubLObject inference_halt_condition_p(SubLObject object) {
    return list_utilities.member_eqP(object, $inference_halt_conditions$.getGlobalValue());
  }

  /** An alist mapping inference accumulator names to their initializers. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 73669) 
  private static SubLSymbol $inference_accumulator_types$ = null;

  /** Whether the default is to discard the results that exceed the :max-number cutoff */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74506) 
  private static SubLSymbol $inference_default_forget_extra_resultsP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 74854) 
  public static final SubLObject inference_properties_forget_extra_resultsP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw172$FORGET_EXTRA_RESULTS_, $inference_default_forget_extra_resultsP$.getGlobalValue());
  }

  /** Whether the default behaviour is to cache the results of inference in the KB */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75021) 
  private static SubLSymbol $inference_default_cache_inference_resultsP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75202) 
  public static final SubLObject inference_properties_cache_inference_resultsP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw173$CACHE_INFERENCE_RESULTS_, $inference_default_cache_inference_resultsP$.getGlobalValue());
  }

  /** Whether inferences are browsable by default.  This is NIL to avoid memory issues. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75378) 
  public static SubLSymbol $inference_default_browsableP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75538) 
  public static final SubLObject inference_properties_browsableP(SubLObject v_properties) {
    return makeBoolean(((NIL != conses_high.getf(v_properties, $kw174$BROWSABLE_, $inference_default_browsableP$.getGlobalValue()))
          || (NIL != inference_properties_continuableP(v_properties))));
  }

  /** Whether inferences are continuable by default.  This is NIL to avoid memory issues. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75767) 
  public static SubLSymbol $inference_default_continuableP$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 75933) 
  public static final SubLObject inference_properties_continuableP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw175$CONTINUABLE_, $inference_default_continuableP$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76073) 
  public static final SubLObject inference_properties_blockP(SubLObject v_properties) {
    return conses_high.getf(v_properties, $kw176$BLOCK_, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76183) 
  public static final SubLObject inference_query_property_lookup(SubLObject query_properties, SubLObject property) {
    {
      SubLObject value = conses_high.getf(query_properties, property, $kw177$UNSPECIFIED);
      if (($kw177$UNSPECIFIED == value)) {
        return inference_engine_default_for_property(property);
      } else {
        return value;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-enumerated-types.lisp", position = 76618) 
  public static final SubLObject inference_engine_default_for_property(SubLObject query_property) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(query_property, $sym0$QUERY_PROPERTY_P);
      {
        SubLObject value = NIL;
        SubLObject specified = NIL;
        SubLObject pcase_var = query_property;
        if (pcase_var.eql($kw163$DISJUNCTION_FREE_EL_VARS_POLICY)) {
          value = $default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw160$RESULT_UNIQUENESS)) {
          value = $default_result_uniqueness_criterion$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw15$PROBLEM_STORE)) {
          value = NIL;
          specified = NIL;
        } else if (pcase_var.eql($kw178$CONDITIONAL_SENTENCE_)) {
          value = NIL;
          specified = T;
        } else if (pcase_var.eql($kw179$NON_EXPLANATORY_SENTENCE)) {
          value = NIL;
          specified = T;
        } else if (pcase_var.eql($kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_)) {
          value = $inference_allows_hl_predicate_transformation_by_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_)) {
          value = $inference_allows_unbound_predicate_transformation_by_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_)) {
          value = $inference_allows_evaluatable_predicate_transformation_by_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw19$ALLOW_INDETERMINATE_RESULTS_)) {
          value = $inference_allows_indeterminate_results_by_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw21$ALLOWED_RULES)) {
          value = $default_allowed_rules$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw24$ALLOWED_MODULES)) {
          value = $default_allowed_modules$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw23$FORBIDDEN_RULES)) {
          value = $default_forbidden_rules$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw25$ALLOW_ABNORMALITY_CHECKING_)) {
          value = $inference_allows_abnormality_checking_by_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw165$TRANSITIVE_CLOSURE_MODE)) {
          value = $inference_transitive_closure_mode_default$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw28$MAX_NUMBER)) {
          value = $default_max_number$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw29$MAX_TIME)) {
          value = $default_max_time$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw30$MAX_STEP)) {
          value = $default_max_step$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw32$FORWARD_MAX_TIME)) {
          value = $default_forward_max_time$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw33$MAX_PROOF_DEPTH)) {
          value = $default_max_proof_depth$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw34$MAX_TRANSFORMATION_DEPTH)) {
          value = $default_max_transformation_depth$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw35$PROBABLY_APPROXIMATELY_DONE)) {
          value = $default_probably_approximately_done$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw155$RETURN)) {
          value = $inference_default_return_type$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw38$METRICS)) {
          value = $default_inference_metrics_template$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw158$ANSWER_LANGUAGE)) {
          value = $inference_default_answer_language$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw173$CACHE_INFERENCE_RESULTS_)) {
          value = $inference_default_cache_inference_resultsP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw172$FORGET_EXTRA_RESULTS_)) {
          value = $inference_default_forget_extra_resultsP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw174$BROWSABLE_)) {
          value = $inference_default_browsableP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw175$CONTINUABLE_)) {
          value = $inference_default_continuableP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw176$BLOCK_)) {
          value = NIL;
          specified = T;
        } else if (pcase_var.eql($kw96$EQUALITY_REASONING_METHOD)) {
          value = $default_equality_reasoning_method$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw98$EQUALITY_REASONING_DOMAIN)) {
          value = $default_equality_reasoning_domain$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw100$INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
          value = $default_intermediate_step_validation_level$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw102$MAX_PROBLEM_COUNT)) {
          value = $default_max_problem_count$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw103$REMOVAL_ALLOWED_)) {
          value = $removal_allowed_by_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw104$TRANSFORMATION_ALLOWED_)) {
          value = $transformation_allowed_by_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw82$ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
          value = $add_restriction_layer_of_indirection_by_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw83$NEGATION_BY_FAILURE_)) {
          value = $negation_by_failure_by_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw84$COMPLETENESS_MINIMIZATION_ALLOWED_)) {
          value = control_vars.$complete_extent_minimization$.getDynamicValue(thread);
          specified = T;
        } else if (pcase_var.eql($kw107$DIRECTION)) {
          value = $default_problem_store_inference_direction$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw85$EVALUATE_SUBL_ALLOWED_)) {
          value = $evaluate_subl_allowed_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw86$REWRITE_ALLOWED_)) {
          value = $rewrite_allowed_defaultP$.getDynamicValue(thread);
          specified = T;
        } else if (pcase_var.eql($kw87$ABDUCTION_ALLOWED_)) {
          value = $abduction_allowed_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw88$NEW_TERMS_ALLOWED_)) {
          value = $new_terms_allowed_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw31$INFERENCE_MODE)) {
          value = $default_inference_mode$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw166$MAINTAIN_TERM_WORKING_SET_)) {
          value = $maintain_term_working_set_defaultP$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw167$EVENTS)) {
          value = $inference_events_default$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw169$HALT_CONDITIONS)) {
          value = $inference_halt_conditions_default$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw93$PROBLEM_STORE_NAME)) {
          value = $default_problem_store_name$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw49$PRODUCTIVITY_LIMIT)) {
          value = $default_productivity_limit$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw43$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
          value = $default_removal_backtracking_productivity_limit$.getGlobalValue();
          specified = T;
        } else if (pcase_var.eql($kw45$PROOF_SPEC)) {
          value = $default_proof_spec$.getGlobalValue();
          specified = T;
        } else {
          value = $kw140$UNKNOWN;
          specified = NIL;
        }
        return Values.values(value, specified);
      }
    }
  }

  public static final SubLObject declare_inference_datastructures_enumerated_types_file() {
    declareFunction(myName, "query_property_p", "QUERY-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "query_properties_p", "QUERY-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "all_query_properties", "ALL-QUERY-PROPERTIES", 0, 0, false);
    declareFunction(myName, "merge_query_properties", "MERGE-QUERY-PROPERTIES", 2, 0, false);
    declareFunction(myName, "query_static_property_p", "QUERY-STATIC-PROPERTY-P", 1, 0, false); new $query_static_property_p$UnaryFunction();
    declareFunction(myName, "query_static_properties_p", "QUERY-STATIC-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "extract_query_static_properties", "EXTRACT-QUERY-STATIC-PROPERTIES", 1, 0, false);
    declareFunction(myName, "all_query_static_properties", "ALL-QUERY-STATIC-PROPERTIES", 0, 0, false);
    declareFunction(myName, "query_static_or_meta_property_p", "QUERY-STATIC-OR-META-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "query_static_or_meta_properties_p", "QUERY-STATIC-OR-META-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "extract_query_static_or_meta_properties", "EXTRACT-QUERY-STATIC-OR-META-PROPERTIES", 1, 0, false);
    declareFunction(myName, "query_dynamic_property_p", "QUERY-DYNAMIC-PROPERTY-P", 1, 0, false); new $query_dynamic_property_p$UnaryFunction();
    declareFunction(myName, "query_dynamic_properties_p", "QUERY-DYNAMIC-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "extract_query_dynamic_properties", "EXTRACT-QUERY-DYNAMIC-PROPERTIES", 1, 0, false);
    declareFunction(myName, "all_query_dynamic_properties", "ALL-QUERY-DYNAMIC-PROPERTIES", 0, 0, false);
    declareFunction(myName, "query_metric_p", "QUERY-METRIC-P", 1, 0, false);
    declareFunction(myName, "inference_query_metric_p", "INFERENCE-QUERY-METRIC-P", 1, 0, false); new $inference_query_metric_p$UnaryFunction();
    declareFunction(myName, "all_query_metrics", "ALL-QUERY-METRICS", 0, 0, false);
    declareFunction(myName, "arete_query_metric_p", "ARETE-QUERY-METRIC-P", 1, 0, false);
    declareFunction(myName, "all_arete_query_metrics", "ALL-ARETE-QUERY-METRICS", 0, 0, false);
    declareFunction(myName, "removal_ask_query_metric_p", "REMOVAL-ASK-QUERY-METRIC-P", 1, 0, false);
    declareFunction(myName, "inference_property_p", "INFERENCE-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "inference_properties_p", "INFERENCE-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "inference_static_property_p", "INFERENCE-STATIC-PROPERTY-P", 1, 0, false); new $inference_static_property_p$UnaryFunction();
    declareFunction(myName, "inference_static_properties_p", "INFERENCE-STATIC-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "extract_inference_static_properties", "EXTRACT-INFERENCE-STATIC-PROPERTIES", 1, 0, false);
    declareFunction(myName, "all_inference_static_properties", "ALL-INFERENCE-STATIC-PROPERTIES", 0, 0, false);
    declareFunction(myName, "inference_static_or_meta_property_p", "INFERENCE-STATIC-OR-META-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "inference_static_or_meta_properties_p", "INFERENCE-STATIC-OR-META-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "extract_inference_static_or_meta_properties", "EXTRACT-INFERENCE-STATIC-OR-META-PROPERTIES", 1, 0, false);
    declareFunction(myName, "inference_properties_problem_store", "INFERENCE-PROPERTIES-PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "inference_properties_allow_hl_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "inference_properties_allow_unbound_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "inference_properties_allow_evaluatable_predicate_transformationP", "INFERENCE-PROPERTIES-ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "inference_properties_allow_indeterminate_resultsP", "INFERENCE-PROPERTIES-ALLOW-INDETERMINATE-RESULTS?", 1, 0, false);
    declareFunction(myName, "inference_properties_allowed_rules", "INFERENCE-PROPERTIES-ALLOWED-RULES", 1, 0, false);
    declareFunction(myName, "inference_properties_forbidden_rules", "INFERENCE-PROPERTIES-FORBIDDEN-RULES", 1, 0, false);
    declareFunction(myName, "inference_properties_allowed_modules", "INFERENCE-PROPERTIES-ALLOWED-MODULES", 1, 0, false);
    declareFunction(myName, "inference_properties_allow_abnormality_checkingP", "INFERENCE-PROPERTIES-ALLOW-ABNORMALITY-CHECKING?", 1, 0, false);
    declareFunction(myName, "inference_resource_constraint_p", "INFERENCE-RESOURCE-CONSTRAINT-P", 1, 0, false);
    declareFunction(myName, "inference_resource_constraints_p", "INFERENCE-RESOURCE-CONSTRAINTS-P", 1, 0, false);
    declareFunction(myName, "extract_inference_resource_constraints", "EXTRACT-INFERENCE-RESOURCE-CONSTRAINTS", 1, 0, false);
    declareFunction(myName, "inference_properties_max_number", "INFERENCE-PROPERTIES-MAX-NUMBER", 1, 0, false);
    declareFunction(myName, "inference_properties_max_time", "INFERENCE-PROPERTIES-MAX-TIME", 1, 0, false);
    declareFunction(myName, "inference_properties_max_step", "INFERENCE-PROPERTIES-MAX-STEP", 1, 0, false);
    declareFunction(myName, "inference_properties_mode", "INFERENCE-PROPERTIES-MODE", 1, 0, false);
    declareFunction(myName, "inference_properties_forward_max_time", "INFERENCE-PROPERTIES-FORWARD-MAX-TIME", 1, 0, false);
    declareFunction(myName, "inference_properties_max_proof_depth", "INFERENCE-PROPERTIES-MAX-PROOF-DEPTH", 1, 0, false);
    declareFunction(myName, "inference_properties_max_transformation_depth", "INFERENCE-PROPERTIES-MAX-TRANSFORMATION-DEPTH", 1, 0, false);
    declareFunction(myName, "inference_properties_probably_approximately_done", "INFERENCE-PROPERTIES-PROBABLY-APPROXIMATELY-DONE", 1, 0, false);
    declareFunction(myName, "inference_dynamic_property_p", "INFERENCE-DYNAMIC-PROPERTY-P", 1, 0, false); new $inference_dynamic_property_p$UnaryFunction();
    declareFunction(myName, "inference_dynamic_properties_p", "INFERENCE-DYNAMIC-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "extract_inference_dynamic_properties", "EXTRACT-INFERENCE-DYNAMIC-PROPERTIES", 1, 0, false);
    declareFunction(myName, "all_inference_dynamic_properties", "ALL-INFERENCE-DYNAMIC-PROPERTIES", 0, 0, false);
    declareFunction(myName, "inference_properties_metrics", "INFERENCE-PROPERTIES-METRICS", 1, 0, false);
    declareFunction(myName, "strategy_property_p", "STRATEGY-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "strategy_properties_p", "STRATEGY-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "strategy_static_property_p", "STRATEGY-STATIC-PROPERTY-P", 1, 0, false); new $strategy_static_property_p$UnaryFunction();
    declareFunction(myName, "strategy_static_properties_p", "STRATEGY-STATIC-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "extract_strategy_static_properties", "EXTRACT-STRATEGY-STATIC-PROPERTIES", 1, 0, false);
    declareFunction(myName, "all_strategy_static_properties", "ALL-STRATEGY-STATIC-PROPERTIES", 0, 0, false);
    declareFunction(myName, "strategy_static_properties_removal_backtracking_productivity_limit", "STRATEGY-STATIC-PROPERTIES-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "strategy_static_properties_proof_spec", "STRATEGY-STATIC-PROPERTIES-PROOF-SPEC", 1, 0, false);
    declareFunction(myName, "strategy_dynamic_property_p", "STRATEGY-DYNAMIC-PROPERTY-P", 1, 0, false); new $strategy_dynamic_property_p$UnaryFunction();
    declareFunction(myName, "strategy_dynamic_properties_p", "STRATEGY-DYNAMIC-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "extract_strategy_dynamic_properties", "EXTRACT-STRATEGY-DYNAMIC-PROPERTIES", 1, 0, false);
    declareFunction(myName, "all_strategy_dynamic_properties", "ALL-STRATEGY-DYNAMIC-PROPERTIES", 0, 0, false);
    declareFunction(myName, "strategy_dynamic_properties_productivity_limit", "STRATEGY-DYNAMIC-PROPERTIES-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "problem_store_property_p", "PROBLEM-STORE-PROPERTY-P", 1, 0, false); new $problem_store_property_p$UnaryFunction();
    declareFunction(myName, "problem_store_properties_p", "PROBLEM-STORE-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "all_problem_store_properties", "ALL-PROBLEM-STORE-PROPERTIES", 0, 0, false);
    declareFunction(myName, "extract_problem_store_properties", "EXTRACT-PROBLEM-STORE-PROPERTIES", 1, 0, false);
    declareFunction(myName, "problem_store_static_property_p", "PROBLEM-STORE-STATIC-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "problem_store_static_properties_p", "PROBLEM-STORE-STATIC-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "extract_problem_store_static_properties", "EXTRACT-PROBLEM-STORE-STATIC-PROPERTIES", 1, 0, false);
    declareFunction(myName, "all_problem_store_static_properties", "ALL-PROBLEM-STORE-STATIC-PROPERTIES", 0, 0, false);
    declareFunction(myName, "problem_store_dynamic_property_p", "PROBLEM-STORE-DYNAMIC-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "problem_store_dynamic_properties_p", "PROBLEM-STORE-DYNAMIC-PROPERTIES-P", 1, 0, false);
    declareFunction(myName, "all_problem_store_dynamic_properties", "ALL-PROBLEM-STORE-DYNAMIC-PROPERTIES", 0, 0, false);
    declareFunction(myName, "inference_meta_property_p", "INFERENCE-META-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "all_inference_meta_properties", "ALL-INFERENCE-META-PROPERTIES", 0, 0, false);
    declareFunction(myName, "extract_inference_meta_properties", "EXTRACT-INFERENCE-META-PROPERTIES", 1, 0, false);
    declareFunction(myName, "query_halt_reason_p", "QUERY-HALT-REASON-P", 1, 0, false);
    declareFunction(myName, "exhausted_query_halt_reason_p", "EXHAUSTED-QUERY-HALT-REASON-P", 1, 0, false);
    declareFunction(myName, "inference_status_p", "INFERENCE-STATUS-P", 1, 0, false);
    declareFunction(myName, "continuable_inference_status_p", "CONTINUABLE-INFERENCE-STATUS-P", 1, 0, false);
    declareFunction(myName, "avoided_inference_reason_p", "AVOIDED-INFERENCE-REASON-P", 1, 0, false);
    declareFunction(myName, "inference_suspend_status_p", "INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
    declareFunction(myName, "inference_suspend_status_applicableP", "INFERENCE-SUSPEND-STATUS-APPLICABLE?", 1, 0, false);
    declareFunction(myName, "continuable_inference_suspend_status_p", "CONTINUABLE-INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
    declareFunction(myName, "exhausted_inference_suspend_status_p", "EXHAUSTED-INFERENCE-SUSPEND-STATUS-P", 1, 0, false);
    declareFunction(myName, "inference_error_suspend_status_p", "INFERENCE-ERROR-SUSPEND-STATUS-P", 1, 0, false);
    declareFunction(myName, "new_inference_error_suspend_status", "NEW-INFERENCE-ERROR-SUSPEND-STATUS", 1, 0, false);
    declareFunction(myName, "inference_error_suspend_status_message", "INFERENCE-ERROR-SUSPEND-STATUS-MESSAGE", 1, 0, false);
    declareFunction(myName, "inference_justification_status_p", "INFERENCE-JUSTIFICATION-STATUS-P", 1, 0, false);
    declareFunction(myName, "new_inference_justification_status", "NEW-INFERENCE-JUSTIFICATION-STATUS", 1, 0, false);
    declareFunction(myName, "inference_justification_status_message", "INFERENCE-JUSTIFICATION-STATUS-MESSAGE", 1, 0, false);
    declareFunction(myName, "tactical_status_p", "TACTICAL-STATUS-P", 1, 0, false);
    declareFunction(myName, "provability_status_p", "PROVABILITY-STATUS-P", 1, 0, false);
    declareFunction(myName, "tactical_status_weakerP", "TACTICAL-STATUS-WEAKER?", 2, 0, false);
    declareFunction(myName, "tactical_status_strongerP", "TACTICAL-STATUS-STRONGER?", 2, 0, false);
    declareFunction(myName, "problem_status_p", "PROBLEM-STATUS-P", 1, 0, false);
    declareFunction(myName, "problem_status_from_tactical_status_and_provability_status", "PROBLEM-STATUS-FROM-TACTICAL-STATUS-AND-PROVABILITY-STATUS", 2, 0, false);
    declareFunction(myName, "tactical_status_from_problem_status", "TACTICAL-STATUS-FROM-PROBLEM-STATUS", 1, 0, false);
    declareFunction(myName, "provability_status_from_problem_status", "PROVABILITY-STATUS-FROM-PROBLEM-STATUS", 1, 0, false);
    declareFunction(myName, "good_problem_status_p", "GOOD-PROBLEM-STATUS-P", 1, 0, false);
    declareFunction(myName, "no_good_problem_status_p", "NO-GOOD-PROBLEM-STATUS-P", 1, 0, false);
    declareFunction(myName, "neutral_problem_status_p", "NEUTRAL-PROBLEM-STATUS-P", 1, 0, false);
    declareFunction(myName, "unexamined_problem_status_p", "UNEXAMINED-PROBLEM-STATUS-P", 1, 0, false);
    declareFunction(myName, "examined_problem_status_p", "EXAMINED-PROBLEM-STATUS-P", 1, 0, false);
    declareFunction(myName, "possible_problem_status_p", "POSSIBLE-PROBLEM-STATUS-P", 1, 0, false);
    declareFunction(myName, "pending_problem_status_p", "PENDING-PROBLEM-STATUS-P", 1, 0, false);
    declareFunction(myName, "finished_problem_status_p", "FINISHED-PROBLEM-STATUS-P", 1, 0, false);
    declareFunction(myName, "problem_store_properties_add_restriction_layer_of_indirectionP", "PROBLEM-STORE-PROPERTIES-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
    declareFunction(myName, "problem_store_properties_negation_by_failureP", "PROBLEM-STORE-PROPERTIES-NEGATION-BY-FAILURE?", 1, 0, false);
    declareFunction(myName, "problem_store_properties_completeness_minimization_allowedP", "PROBLEM-STORE-PROPERTIES-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_properties_evaluate_subl_allowedP", "PROBLEM-STORE-PROPERTIES-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_properties_rewrite_allowedP", "PROBLEM-STORE-PROPERTIES-REWRITE-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_properties_abduction_allowedP", "PROBLEM-STORE-PROPERTIES-ABDUCTION-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_properties_new_terms_allowedP", "PROBLEM-STORE-PROPERTIES-NEW-TERMS-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_properties_compute_answer_justificationsP", "PROBLEM-STORE-PROPERTIES-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
    declareFunction(myName, "all_inference_modes", "ALL-INFERENCE-MODES", 0, 0, false);
    declareFunction(myName, "inference_mode_p", "INFERENCE-MODE-P", 1, 0, false);
    declareFunction(myName, "problem_link_type_p", "PROBLEM-LINK-TYPE-P", 1, 0, false);
    declareFunction(myName, "problem_store_name_p", "PROBLEM-STORE-NAME-P", 1, 0, false);
    declareFunction(myName, "problem_store_properties_name", "PROBLEM-STORE-PROPERTIES-NAME", 1, 0, false);
    declareFunction(myName, "problem_store_equality_reasoning_method_p", "PROBLEM-STORE-EQUALITY-REASONING-METHOD-P", 1, 0, false);
    declareFunction(myName, "problem_store_properties_equality_reasoning_method", "PROBLEM-STORE-PROPERTIES-EQUALITY-REASONING-METHOD", 1, 0, false);
    declareFunction(myName, "problem_store_equality_reasoning_domain_p", "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN-P", 1, 0, false);
    declareFunction(myName, "problem_store_properties_equality_reasoning_domain", "PROBLEM-STORE-PROPERTIES-EQUALITY-REASONING-DOMAIN", 1, 0, false);
    declareFunction(myName, "intermediate_step_validation_level_p", "INTERMEDIATE-STEP-VALIDATION-LEVEL-P", 1, 0, false);
    declareFunction(myName, "problem_store_properties_intermediate_step_validation_level", "PROBLEM-STORE-PROPERTIES-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
    declareFunction(myName, "max_problem_count_p", "MAX-PROBLEM-COUNT-P", 1, 0, false);
    declareFunction(myName, "problem_store_properties_max_problem_count", "PROBLEM-STORE-PROPERTIES-MAX-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "removal_allowed_by_propertiesP", "REMOVAL-ALLOWED-BY-PROPERTIES?", 1, 0, false);
    declareFunction(myName, "transformation_allowed_by_propertiesP", "TRANSFORMATION-ALLOWED-BY-PROPERTIES?", 1, 0, false);
    declareFunction(myName, "inference_direction_p", "INFERENCE-DIRECTION-P", 1, 0, false);
    declareFunction(myName, "problem_store_properties_direction", "PROBLEM-STORE-PROPERTIES-DIRECTION", 1, 0, false);
    declareFunction(myName, "tactic_status_p", "TACTIC-STATUS-P", 1, 0, false);
    declareFunction(myName, "tactic_type_p", "TACTIC-TYPE-P", 1, 0, false);
    declareFunction(myName, "tactic_type_from_hl_module", "TACTIC-TYPE-FROM-HL-MODULE", 1, 0, false);
    declareFunction(myName, "completeness_string", "COMPLETENESS-STRING", 1, 0, false);
    declareFunction(myName, "completeness_p", "COMPLETENESS-P", 1, 0, false);
    declareFunction(myName, "impossible_completeness_p", "IMPOSSIBLE-COMPLETENESS-P", 1, 0, false);
    declareFunction(myName, "completeness_L", "COMPLETENESS-<", 2, 0, false);
    declareFunction(myName, "completeness_G", "COMPLETENESS->", 2, 0, false);
    declareFunction(myName, "min_completeness", "MIN-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "min2_completeness", "MIN2-COMPLETENESS", 2, 0, false);
    declareFunction(myName, "max_completeness", "MAX-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "max2_completeness", "MAX2-COMPLETENESS", 2, 0, false);
    declareFunction(myName, "productivity_p", "PRODUCTIVITY-P", 1, 0, false);
    declareFunction(myName, "infinite_productivity_p", "INFINITE-PRODUCTIVITY-P", 1, 0, false);
    declareFunction(myName, "productivity_for_number_of_children", "PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 0, false);
    declareFunction(myName, "number_of_children_for_productivity", "NUMBER-OF-CHILDREN-FOR-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "cost_for_productivity", "COST-FOR-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "removal_cost_cutoff_for_productivity", "REMOVAL-COST-CUTOFF-FOR-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "productivity_E", "PRODUCTIVITY-=", 2, 0, false);
    declareFunction(myName, "productivity_L", "PRODUCTIVITY-<", 2, 0, false);
    declareFunction(myName, "productivity_LE", "PRODUCTIVITY-<=", 2, 0, false);
    declareFunction(myName, "productivity_G", "PRODUCTIVITY->", 2, 0, false);
    declareFunction(myName, "productivity_GE", "PRODUCTIVITY->=", 2, 0, false);
    declareFunction(myName, "productivity_X", "PRODUCTIVITY-+", 2, 0, false);
    declareFunction(myName, "productivity_max", "PRODUCTIVITY-MAX", 2, 0, false);
    declareFunction(myName, "productivity_sum", "PRODUCTIVITY-SUM", 1, 0, false);
    declareFunction(myName, "productivity_times_number", "PRODUCTIVITY-TIMES-NUMBER", 2, 0, false);
    declareFunction(myName, "productivity_divide_number", "PRODUCTIVITY-DIVIDE-NUMBER", 2, 0, false);
    declareFunction(myName, "decrement_productivity_for_number_of_children", "DECREMENT-PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 1, false);
    declareFunction(myName, "proof_status_p", "PROOF-STATUS-P", 1, 0, false);
    declareFunction(myName, "proof_reject_reason_p", "PROOF-REJECT-REASON-P", 1, 0, false);
    declareFunction(myName, "destructibility_status_string", "DESTRUCTIBILITY-STATUS-STRING", 1, 0, false);
    declareFunction(myName, "destructibility_status_hint", "DESTRUCTIBILITY-STATUS-HINT", 1, 0, false);
    declareFunction(myName, "destructibility_status_p", "DESTRUCTIBILITY-STATUS-P", 1, 0, false);
    declareFunction(myName, "destructibility_status_destructibleP", "DESTRUCTIBILITY-STATUS-DESTRUCTIBLE?", 1, 0, false);
    declareFunction(myName, "balancing_tactician_enabledP", "BALANCING-TACTICIAN-ENABLED?", 0, 0, false);
    declareFunction(myName, "strategy_type_property_p", "STRATEGY-TYPE-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "strategy_default_method_handler", "STRATEGY-DEFAULT-METHOD-HANDLER", 1, 0, false);
    declareFunction(myName, "inference_simple_return_type_p", "INFERENCE-SIMPLE-RETURN-TYPE-P", 1, 0, false);
    declareFunction(myName, "inference_properties_has_simple_return_typeP", "INFERENCE-PROPERTIES-HAS-SIMPLE-RETURN-TYPE?", 1, 0, false);
    declareFunction(myName, "inference_template_return_type_p", "INFERENCE-TEMPLATE-RETURN-TYPE-P", 1, 0, false);
    declareFunction(myName, "inference_format_return_type_p", "INFERENCE-FORMAT-RETURN-TYPE-P", 1, 0, false);
    declareFunction(myName, "inference_return_type_p", "INFERENCE-RETURN-TYPE-P", 1, 0, false);
    declareFunction(myName, "inference_properties_return_type", "INFERENCE-PROPERTIES-RETURN-TYPE", 1, 0, false);
    declareFunction(myName, "inference_answer_language_p", "INFERENCE-ANSWER-LANGUAGE-P", 1, 0, false);
    declareFunction(myName, "inference_properties_answer_language", "INFERENCE-PROPERTIES-ANSWER-LANGUAGE", 1, 0, false);
    declareFunction(myName, "result_uniqueness_criterion_p", "RESULT-UNIQUENESS-CRITERION-P", 1, 0, false);
    declareFunction(myName, "inference_properties_uniqueness_criterion", "INFERENCE-PROPERTIES-UNIQUENESS-CRITERION", 1, 0, false);
    declareFunction(myName, "inference_disjunction_free_el_vars_policy_p", "INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY-P", 1, 0, false);
    declareFunction(myName, "inference_properties_disjunction_free_el_vars_policy", "INFERENCE-PROPERTIES-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
    declareFunction(myName, "inference_transitive_closure_mode_p", "INFERENCE-TRANSITIVE-CLOSURE-MODE-P", 1, 0, false);
    declareFunction(myName, "inference_properties_transitive_closure_mode", "INFERENCE-PROPERTIES-TRANSITIVE-CLOSURE-MODE", 1, 0, false);
    declareFunction(myName, "inference_properties_maintain_term_working_setP", "INFERENCE-PROPERTIES-MAINTAIN-TERM-WORKING-SET?", 1, 0, false);
    declareFunction(myName, "inference_properties_events", "INFERENCE-PROPERTIES-EVENTS", 1, 0, false);
    declareFunction(myName, "inference_event_type_p", "INFERENCE-EVENT-TYPE-P", 1, 0, false);
    declareFunction(myName, "inference_properties_halt_conditions", "INFERENCE-PROPERTIES-HALT-CONDITIONS", 1, 0, false);
    declareFunction(myName, "inference_halt_condition_p", "INFERENCE-HALT-CONDITION-P", 1, 0, false);
    declareFunction(myName, "inference_accumulator_type_p", "INFERENCE-ACCUMULATOR-TYPE-P", 1, 0, false);
    declareFunction(myName, "initialize_inference_accumulator", "INITIALIZE-INFERENCE-ACCUMULATOR", 1, 0, false);
    declareFunction(myName, "inference_properties_forget_extra_resultsP", "INFERENCE-PROPERTIES-FORGET-EXTRA-RESULTS?", 1, 0, false);
    declareFunction(myName, "inference_properties_cache_inference_resultsP", "INFERENCE-PROPERTIES-CACHE-INFERENCE-RESULTS?", 1, 0, false);
    declareFunction(myName, "inference_properties_browsableP", "INFERENCE-PROPERTIES-BROWSABLE?", 1, 0, false);
    declareFunction(myName, "inference_properties_continuableP", "INFERENCE-PROPERTIES-CONTINUABLE?", 1, 0, false);
    declareFunction(myName, "inference_properties_blockP", "INFERENCE-PROPERTIES-BLOCK?", 1, 0, false);
    declareFunction(myName, "inference_query_property_lookup", "INFERENCE-QUERY-PROPERTY-LOOKUP", 2, 0, false);
    declareFunction(myName, "inference_engine_default_for_property", "INFERENCE-ENGINE-DEFAULT-FOR-PROPERTY", 1, 0, false);
    declareFunction(myName, "query_property_is_defaultP", "QUERY-PROPERTY-IS-DEFAULT?", 2, 0, false);
    declareFunction(myName, "inference_input_non_default_query_properties", "INFERENCE-INPUT-NON-DEFAULT-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "all_default_query_properties", "ALL-DEFAULT-QUERY-PROPERTIES", 0, 0, false);
    declareFunction(myName, "explicify_default_query_properties", "EXPLICIFY-DEFAULT-QUERY-PROPERTIES", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_datastructures_enumerated_types_file() {
    $specially_handled_inference_metrics$ = deflexical("*SPECIALLY-HANDLED-INFERENCE-METRICS*", $list7);
    $non_inference_query_metrics$ = deflexical("*NON-INFERENCE-QUERY-METRICS*", $list8);
    $arete_query_metrics$ = deflexical("*ARETE-QUERY-METRICS*", $list9);
    $removal_ask_query_metrics$ = deflexical("*REMOVAL-ASK-QUERY-METRICS*", $list10);
    $inference_static_properties$ = deflexical("*INFERENCE-STATIC-PROPERTIES*", $list12);
    $inference_allows_hl_predicate_transformation_by_defaultP$ = deflexical("*INFERENCE-ALLOWS-HL-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL);
    $inference_allows_unbound_predicate_transformation_by_defaultP$ = deflexical("*INFERENCE-ALLOWS-UNBOUND-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL);
    $inference_allows_evaluatable_predicate_transformation_by_defaultP$ = deflexical("*INFERENCE-ALLOWS-EVALUATABLE-PREDICATE-TRANSFORMATION-BY-DEFAULT?*", NIL);
    $inference_allows_indeterminate_results_by_defaultP$ = deflexical("*INFERENCE-ALLOWS-INDETERMINATE-RESULTS-BY-DEFAULT?*", T);
    $default_allowed_rules$ = deflexical("*DEFAULT-ALLOWED-RULES*", $kw20$ALL);
    $default_forbidden_rules$ = deflexical("*DEFAULT-FORBIDDEN-RULES*", $kw22$NONE);
    $default_allowed_modules$ = deflexical("*DEFAULT-ALLOWED-MODULES*", $kw20$ALL);
    $inference_allows_abnormality_checking_by_defaultP$ = deflexical("*INFERENCE-ALLOWS-ABNORMALITY-CHECKING-BY-DEFAULT?*", T);
    $inference_resource_constraints$ = deflexical("*INFERENCE-RESOURCE-CONSTRAINTS*", $list26);
    $default_max_number$ = deflexical("*DEFAULT-MAX-NUMBER*", NIL);
    $default_max_time$ = deflexical("*DEFAULT-MAX-TIME*", NIL);
    $default_max_step$ = deflexical("*DEFAULT-MAX-STEP*", NIL);
    $default_forward_max_time$ = deflexical("*DEFAULT-FORWARD-MAX-TIME*", ZERO_INTEGER);
    $default_max_proof_depth$ = deflexical("*DEFAULT-MAX-PROOF-DEPTH*", NIL);
    $default_max_transformation_depth$ = deflexical("*DEFAULT-MAX-TRANSFORMATION-DEPTH*", ZERO_INTEGER);
    $default_probably_approximately_done$ = deflexical("*DEFAULT-PROBABLY-APPROXIMATELY-DONE*", ONE_INTEGER);
    $inference_other_dynamic_properties$ = deflexical("*INFERENCE-OTHER-DYNAMIC-PROPERTIES*", $list36);
    $default_inference_metrics_template$ = deflexical("*DEFAULT-INFERENCE-METRICS-TEMPLATE*", NIL);
    $strategy_static_properties$ = deflexical("*STRATEGY-STATIC-PROPERTIES*", $list40);
    $default_removal_backtracking_productivity_limit$ = deflexical("*DEFAULT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT*", $int42$200);
    $default_proof_spec$ = deflexical("*DEFAULT-PROOF-SPEC*", $kw44$ANYTHING);
    $strategy_dynamic_properties$ = deflexical("*STRATEGY-DYNAMIC-PROPERTIES*", $list46);
    $default_productivity_limit$ = deflexical("*DEFAULT-PRODUCTIVITY-LIMIT*", Numbers.multiply(TWO_INTEGER, $int48$100, control_vars.$default_removal_cost_cutoff$.getGlobalValue()));
    $problem_store_static_properties$ = deflexical("*PROBLEM-STORE-STATIC-PROPERTIES*", $list51);
    $problem_store_dynamic_properties$ = deflexical("*PROBLEM-STORE-DYNAMIC-PROPERTIES*", NIL);
    $inference_meta_properties$ = deflexical("*INFERENCE-META-PROPERTIES*", $list54);
    $inference_statuses$ = deflexical("*INFERENCE-STATUSES*", $list56);
    $continuable_inference_statuses$ = deflexical("*CONTINUABLE-INFERENCE-STATUSES*", $list57);
    $avoided_inference_reasons$ = deflexical("*AVOIDED-INFERENCE-REASONS*", $list58);
    $inference_suspend_statuses$ = deflexical("*INFERENCE-SUSPEND-STATUSES*", $list59);
    $continuable_inference_suspend_statuses$ = deflexical("*CONTINUABLE-INFERENCE-SUSPEND-STATUSES*", $list63);
    $exhausted_inference_suspend_statuses$ = deflexical("*EXHAUSTED-INFERENCE-SUSPEND-STATUSES*", $list64);
    $tactical_statuses$ = deflexical("*TACTICAL-STATUSES*", $list69);
    $provability_statuses$ = deflexical("*PROVABILITY-STATUSES*", $list70);
    $problem_status_table$ = deflexical("*PROBLEM-STATUS-TABLE*", $list71);
    $ordered_tactical_statuses$ = deflexical("*ORDERED-TACTICAL-STATUSES*", list_utilities.delete_duplicates_sorted(Mapping.mapcar($sym72$SECOND, $problem_status_table$.getGlobalValue()), UNPROVIDED));
    $add_restriction_layer_of_indirection_by_defaultP$ = deflexical("*ADD-RESTRICTION-LAYER-OF-INDIRECTION-BY-DEFAULT?*", NIL);
    $negation_by_failure_by_defaultP$ = deflexical("*NEGATION-BY-FAILURE-BY-DEFAULT?*", NIL);
    $evaluate_subl_allowed_defaultP$ = deflexical("*EVALUATE-SUBL-ALLOWED-DEFAULT?*", T);
    $rewrite_allowed_defaultP$ = defparameter("*REWRITE-ALLOWED-DEFAULT?*", NIL);
    $abduction_allowed_defaultP$ = deflexical("*ABDUCTION-ALLOWED-DEFAULT?*", NIL);
    $new_terms_allowed_defaultP$ = deflexical("*NEW-TERMS-ALLOWED-DEFAULT?*", T);
    $compute_answer_justifications_defaultP$ = deflexical("*COMPUTE-ANSWER-JUSTIFICATIONS-DEFAULT?*", T);
    $default_inference_mode$ = deflexical("*DEFAULT-INFERENCE-MODE*", $kw90$CUSTOM);
    $inference_modes$ = deflexical("*INFERENCE-MODES*", $list91);
    $problem_link_types$ = deflexical("*PROBLEM-LINK-TYPES*", $list92);
    $default_problem_store_name$ = deflexical("*DEFAULT-PROBLEM-STORE-NAME*", NIL);
    $default_equality_reasoning_method$ = deflexical("*DEFAULT-EQUALITY-REASONING-METHOD*", $kw94$CZER_EQUAL);
    $problem_store_equality_reasoning_methods$ = deflexical("*PROBLEM-STORE-EQUALITY-REASONING-METHODS*", $list95);
    $default_equality_reasoning_domain$ = deflexical("*DEFAULT-EQUALITY-REASONING-DOMAIN*", $kw20$ALL);
    $problem_store_equality_reasoning_domains$ = deflexical("*PROBLEM-STORE-EQUALITY-REASONING-DOMAINS*", $list97);
    $default_intermediate_step_validation_level$ = deflexical("*DEFAULT-INTERMEDIATE-STEP-VALIDATION-LEVEL*", $kw22$NONE);
    $intermediate_step_validation_levels$ = deflexical("*INTERMEDIATE-STEP-VALIDATION-LEVELS*", $list99);
    $default_max_problem_count$ = deflexical("*DEFAULT-MAX-PROBLEM-COUNT*", $int101$100000);
    $removal_allowed_by_defaultP$ = deflexical("*REMOVAL-ALLOWED-BY-DEFAULT?*", T);
    $transformation_allowed_by_defaultP$ = deflexical("*TRANSFORMATION-ALLOWED-BY-DEFAULT?*", T);
    $default_problem_store_inference_direction$ = deflexical("*DEFAULT-PROBLEM-STORE-INFERENCE-DIRECTION*", $kw105$BACKWARD);
    $inference_directions$ = deflexical("*INFERENCE-DIRECTIONS*", $list106);
    $tactic_statuses$ = deflexical("*TACTIC-STATUSES*", $list108);
    $tactic_types$ = deflexical("*TACTIC-TYPES*", $list109);
    $ordered_completenesses$ = deflexical("*ORDERED-COMPLETENESSES*", $list117);
    $productivity_to_number_table$ = deflexical("*PRODUCTIVITY-TO-NUMBER-TABLE*", $list130);
    $proof_statuses$ = deflexical("*PROOF-STATUSES*", $list132);
    $proof_reject_reasons$ = deflexical("*PROOF-REJECT-REASONS*", $list133);
    $destructibility_statuses$ = deflexical("*DESTRUCTIBILITY-STATUSES*", $list134);
    $wallendaP$ = defparameter("*WALLENDA?*", NIL);
    $balancing_tacticianP$ = defparameter("*BALANCING-TACTICIAN?*", NIL);
    $balancing_tactician_strategy_type_properties$ = deflexical("*BALANCING-TACTICIAN-STRATEGY-TYPE-PROPERTIES*", $list146);
    $legacy_strategy_type_properties$ = deflexical("*LEGACY-STRATEGY-TYPE-PROPERTIES*", $list147);
    $strategy_type_properties$ = deflexical("*STRATEGY-TYPE-PROPERTIES*", ConsesLow.append($balancing_tactician_strategy_type_properties$.getGlobalValue(), $legacy_strategy_type_properties$.getGlobalValue()));
    $inference_return_types$ = deflexical("*INFERENCE-RETURN-TYPES*", $list151);
    $inference_default_return_type$ = deflexical("*INFERENCE-DEFAULT-RETURN-TYPE*", $kw152$BINDINGS);
    $inference_answer_languages$ = deflexical("*INFERENCE-ANSWER-LANGUAGES*", $list156);
    $inference_default_answer_language$ = deflexical("*INFERENCE-DEFAULT-ANSWER-LANGUAGE*", $kw157$EL);
    $result_uniqueness_criteria$ = deflexical("*RESULT-UNIQUENESS-CRITERIA*", $list159);
    $default_result_uniqueness_criterion$ = deflexical("*DEFAULT-RESULT-UNIQUENESS-CRITERION*", $kw152$BINDINGS);
    $inference_disjunction_free_el_vars_policies$ = deflexical("*INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICIES*", $list161);
    $default_inference_disjunction_free_el_vars_policy$ = deflexical("*DEFAULT-INFERENCE-DISJUNCTION-FREE-EL-VARS-POLICY*", $kw162$REQUIRE_EQUAL);
    $inference_transitive_closure_modes$ = deflexical("*INFERENCE-TRANSITIVE-CLOSURE-MODES*", $list164);
    $inference_transitive_closure_mode_default$ = deflexical("*INFERENCE-TRANSITIVE-CLOSURE-MODE-DEFAULT*", $kw22$NONE);
    $maintain_term_working_set_defaultP$ = deflexical("*MAINTAIN-TERM-WORKING-SET-DEFAULT?*", NIL);
    $inference_events_default$ = deflexical("*INFERENCE-EVENTS-DEFAULT*", NIL);
    $inference_event_types$ = deflexical("*INFERENCE-EVENT-TYPES*", $list168);
    $inference_halt_conditions_default$ = deflexical("*INFERENCE-HALT-CONDITIONS-DEFAULT*", NIL);
    $inference_halt_conditions$ = deflexical("*INFERENCE-HALT-CONDITIONS*", $list170);
    $inference_accumulator_types$ = deflexical("*INFERENCE-ACCUMULATOR-TYPES*", NIL);
    $inference_default_forget_extra_resultsP$ = deflexical("*INFERENCE-DEFAULT-FORGET-EXTRA-RESULTS?*", NIL);
    $inference_default_cache_inference_resultsP$ = deflexical("*INFERENCE-DEFAULT-CACHE-INFERENCE-RESULTS?*", NIL);
    $inference_default_browsableP$ = deflexical("*INFERENCE-DEFAULT-BROWSABLE?*", NIL);
    $inference_default_continuableP$ = deflexical("*INFERENCE-DEFAULT-CONTINUABLE?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_inference_datastructures_enumerated_types_file() {
    // CVS_ID("Id: inference-datastructures-enumerated-types.lisp 128687 2009-09-02 17:35:51Z pace ");
    access_macros.register_external_symbol($sym0$QUERY_PROPERTY_P);
    utilities_macros.register_cyc_api_function($sym1$ALL_QUERY_PROPERTIES, NIL, $str2$Return_a_list_of_all_the_query_pr, NIL, $list3);
    access_macros.register_external_symbol($sym50$PROBLEM_STORE_PROPERTY_P);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$QUERY_PROPERTY_P = makeSymbol("QUERY-PROPERTY-P");
  public static final SubLSymbol $sym1$ALL_QUERY_PROPERTIES = makeSymbol("ALL-QUERY-PROPERTIES");
  public static final SubLString $str2$Return_a_list_of_all_the_query_pr = makeString("Return a list of all the query properties.\n   @note destructible");
  public static final SubLList $list3 = list(list(makeSymbol("LIST"), makeSymbol("KEYWORDP")));
  public static final SubLSymbol $sym4$QUERY_STATIC_PROPERTY_P = makeSymbol("QUERY-STATIC-PROPERTY-P");
  public static final SubLSymbol $sym5$QUERY_STATIC_OR_META_PROPERTY_P = makeSymbol("QUERY-STATIC-OR-META-PROPERTY-P");
  public static final SubLSymbol $sym6$QUERY_DYNAMIC_PROPERTY_P = makeSymbol("QUERY-DYNAMIC-PROPERTY-P");
  public static final SubLList $list7 = list(makeKeyword("NEW-ROOT-TIMES"), makeKeyword("NEW-ROOT-COUNT"), makeKeyword("PROBLEM-CREATION-TIMES"), makeKeyword("INFERENCE-ANSWER-QUERY-PROPERTIES"), makeKeyword("INFERENCE-STRONGEST-QUERY-PROPERTIES"), makeKeyword("INFERENCE-MOST-EFFICIENT-QUERY-PROPERTIES"));
  public static final SubLList $list8 = list(makeKeyword("COMPLETE-USER-TIME"), makeKeyword("COMPLETE-SYSTEM-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"));
  public static final SubLList $list9 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("TOTAL-TIME"));
  public static final SubLList $list10 = list(new SubLObject[] {makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("TIME-PER-ANSWER"), makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-USER-TIME"), makeKeyword("COMPLETE-SYSTEM-TIME"), makeKeyword("COMPLETE-TOTAL-TIME")});
  public static final SubLSymbol $sym11$INFERENCE_PROPERTY_P = makeSymbol("INFERENCE-PROPERTY-P");
  public static final SubLList $list12 = list(new SubLObject[] {makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("PROBLEM-STORE"), makeKeyword("CONDITIONAL-SENTENCE?"), makeKeyword("NON-EXPLANATORY-SENTENCE"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOWED-RULES"), makeKeyword("FORBIDDEN-RULES"), makeKeyword("ALLOWED-MODULES"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("MAINTAIN-TERM-WORKING-SET?"), makeKeyword("EVENTS"), makeKeyword("HALT-CONDITIONS")});
  public static final SubLSymbol $sym13$INFERENCE_STATIC_PROPERTY_P = makeSymbol("INFERENCE-STATIC-PROPERTY-P");
  public static final SubLSymbol $sym14$INFERENCE_STATIC_OR_META_PROPERTY_P = makeSymbol("INFERENCE-STATIC-OR-META-PROPERTY-P");
  public static final SubLSymbol $kw15$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
  public static final SubLSymbol $kw16$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw17$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw18$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw19$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
  public static final SubLSymbol $kw20$ALL = makeKeyword("ALL");
  public static final SubLSymbol $kw21$ALLOWED_RULES = makeKeyword("ALLOWED-RULES");
  public static final SubLSymbol $kw22$NONE = makeKeyword("NONE");
  public static final SubLSymbol $kw23$FORBIDDEN_RULES = makeKeyword("FORBIDDEN-RULES");
  public static final SubLSymbol $kw24$ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
  public static final SubLSymbol $kw25$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
  public static final SubLList $list26 = list(makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("INFERENCE-MODE"));
  public static final SubLSymbol $sym27$INFERENCE_RESOURCE_CONSTRAINT_P = makeSymbol("INFERENCE-RESOURCE-CONSTRAINT-P");
  public static final SubLSymbol $kw28$MAX_NUMBER = makeKeyword("MAX-NUMBER");
  public static final SubLSymbol $kw29$MAX_TIME = makeKeyword("MAX-TIME");
  public static final SubLSymbol $kw30$MAX_STEP = makeKeyword("MAX-STEP");
  public static final SubLSymbol $kw31$INFERENCE_MODE = makeKeyword("INFERENCE-MODE");
  public static final SubLSymbol $kw32$FORWARD_MAX_TIME = makeKeyword("FORWARD-MAX-TIME");
  public static final SubLSymbol $kw33$MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");
  public static final SubLSymbol $kw34$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw35$PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
  public static final SubLList $list36 = list(new SubLObject[] {makeKeyword("FORWARD-MAX-TIME"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("RETURN"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("CACHE-INFERENCE-RESULTS?"), makeKeyword("FORGET-EXTRA-RESULTS?"), makeKeyword("BROWSABLE?"), makeKeyword("CONTINUABLE?"), makeKeyword("BLOCK?"), makeKeyword("METRICS")});
  public static final SubLSymbol $sym37$INFERENCE_DYNAMIC_PROPERTY_P = makeSymbol("INFERENCE-DYNAMIC-PROPERTY-P");
  public static final SubLSymbol $kw38$METRICS = makeKeyword("METRICS");
  public static final SubLSymbol $sym39$STRATEGY_PROPERTY_P = makeSymbol("STRATEGY-PROPERTY-P");
  public static final SubLList $list40 = list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PROOF-SPEC"));
  public static final SubLSymbol $sym41$STRATEGY_STATIC_PROPERTY_P = makeSymbol("STRATEGY-STATIC-PROPERTY-P");
  public static final SubLInteger $int42$200 = makeInteger(200);
  public static final SubLSymbol $kw43$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $kw44$ANYTHING = makeKeyword("ANYTHING");
  public static final SubLSymbol $kw45$PROOF_SPEC = makeKeyword("PROOF-SPEC");
  public static final SubLList $list46 = list(makeKeyword("PRODUCTIVITY-LIMIT"));
  public static final SubLSymbol $sym47$STRATEGY_DYNAMIC_PROPERTY_P = makeSymbol("STRATEGY-DYNAMIC-PROPERTY-P");
  public static final SubLInteger $int48$100 = makeInteger(100);
  public static final SubLSymbol $kw49$PRODUCTIVITY_LIMIT = makeKeyword("PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $sym50$PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");
  public static final SubLList $list51 = list(new SubLObject[] {makeKeyword("PROBLEM-STORE-NAME"), makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("REMOVAL-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("DIRECTION"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?")});
  public static final SubLSymbol $sym52$PROBLEM_STORE_STATIC_PROPERTY_P = makeSymbol("PROBLEM-STORE-STATIC-PROPERTY-P");
  public static final SubLSymbol $sym53$PROBLEM_STORE_DYNAMIC_PROPERTY_P = makeSymbol("PROBLEM-STORE-DYNAMIC-PROPERTY-P");
  public static final SubLList $list54 = list(makeKeyword("INFERENCE-MODE"));
  public static final SubLSymbol $sym55$INFERENCE_META_PROPERTY_P = makeSymbol("INFERENCE-META-PROPERTY-P");
  public static final SubLList $list56 = list(new SubLObject[] {makeKeyword("NEW"), makeKeyword("PREPARED"), makeKeyword("READY"), makeKeyword("RUNNING"), makeKeyword("SUSPENDED"), makeKeyword("DEAD"), makeKeyword("TAUTOLOGY"), makeKeyword("CONTRADICTION"), makeKeyword("ILL-FORMED")});
  public static final SubLList $list57 = list(makeKeyword("PREPARED"), makeKeyword("SUSPENDED"));
  public static final SubLList $list58 = list(makeKeyword("TAUTOLOGY"), makeKeyword("CONTRADICTION"), makeKeyword("ILL-FORMED"), makeKeyword("NON-TRIVIAL"), makeKeyword("NOT-A-QUERY"));
  public static final SubLList $list59 = list(new SubLObject[] {makeKeyword("ABORT"), makeKeyword("INTERRUPT"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("MAX-PROOF-COUNT"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("EXHAUST"), makeKeyword("EXHAUST-TOTAL")});
  public static final SubLSymbol $sym60$INFERENCE_STATUS_P = makeSymbol("INFERENCE-STATUS-P");
  public static final SubLSymbol $kw61$SUSPENDED = makeKeyword("SUSPENDED");
  public static final SubLSymbol $kw62$TAUTOLOGY = makeKeyword("TAUTOLOGY");
  public static final SubLList $list63 = list(makeKeyword("INTERRUPT"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("EXHAUST"));
  public static final SubLList $list64 = list(makeKeyword("EXHAUST"), makeKeyword("EXHAUST-TOTAL"));
  public static final SubLSymbol $kw65$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $sym66$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw67$JUSTIFICATION = makeKeyword("JUSTIFICATION");
  public static final SubLSymbol $sym68$HL_JUSTIFICATION_LIST_P = makeSymbol("HL-JUSTIFICATION-LIST-P");
  public static final SubLList $list69 = list(makeKeyword("NEW"), makeKeyword("UNEXAMINED"), makeKeyword("EXAMINED"), makeKeyword("POSSIBLE"), makeKeyword("PENDING"), makeKeyword("FINISHED"));
  public static final SubLList $list70 = list(makeKeyword("GOOD"), makeKeyword("NEUTRAL"), makeKeyword("NO-GOOD"));
  public static final SubLList $list71 = list(new SubLObject[] {list(makeKeyword("NEW"), makeKeyword("NEW"), makeKeyword("NEUTRAL")), list(makeKeyword("UNEXAMINED"), makeKeyword("UNEXAMINED"), makeKeyword("NEUTRAL")), list(makeKeyword("UNEXAMINED-GOOD"), makeKeyword("UNEXAMINED"), makeKeyword("GOOD")), list(makeKeyword("UNEXAMINED-NO-GOOD"), makeKeyword("UNEXAMINED"), makeKeyword("NO-GOOD")), list(makeKeyword("EXAMINED"), makeKeyword("EXAMINED"), makeKeyword("NEUTRAL")), list(makeKeyword("EXAMINED-GOOD"), makeKeyword("EXAMINED"), makeKeyword("GOOD")), list(makeKeyword("EXAMINED-NO-GOOD"), makeKeyword("EXAMINED"), makeKeyword("NO-GOOD")), list(makeKeyword("POSSIBLE"), makeKeyword("POSSIBLE"), makeKeyword("NEUTRAL")), list(makeKeyword("POSSIBLE-GOOD"), makeKeyword("POSSIBLE"), makeKeyword("GOOD")), list(makeKeyword("POSSIBLE-NO-GOOD"), makeKeyword("POSSIBLE"), makeKeyword("NO-GOOD")), list(makeKeyword("PENDING"), makeKeyword("PENDING"), makeKeyword("NEUTRAL")), list(makeKeyword("PENDING-GOOD"), makeKeyword("PENDING"), makeKeyword("GOOD")), list(makeKeyword("PENDING-NO-GOOD"), makeKeyword("PENDING"), makeKeyword("NO-GOOD")), list(makeKeyword("FINISHED"), makeKeyword("FINISHED"), makeKeyword("NEUTRAL")), list(makeKeyword("FINISHED-GOOD"), makeKeyword("FINISHED"), makeKeyword("GOOD")), list(makeKeyword("FINISHED-NO-GOOD"), makeKeyword("FINISHED"), makeKeyword("NO-GOOD"))});
  public static final SubLSymbol $sym72$SECOND = makeSymbol("SECOND");
  public static final SubLString $str73$No_match_to_combine__s_and__s = makeString("No match to combine ~s and ~s");
  public static final SubLSymbol $kw74$GOOD = makeKeyword("GOOD");
  public static final SubLSymbol $kw75$NO_GOOD = makeKeyword("NO-GOOD");
  public static final SubLSymbol $kw76$NEUTRAL = makeKeyword("NEUTRAL");
  public static final SubLSymbol $kw77$UNEXAMINED = makeKeyword("UNEXAMINED");
  public static final SubLSymbol $kw78$EXAMINED = makeKeyword("EXAMINED");
  public static final SubLSymbol $kw79$POSSIBLE = makeKeyword("POSSIBLE");
  public static final SubLSymbol $kw80$PENDING = makeKeyword("PENDING");
  public static final SubLSymbol $kw81$FINISHED = makeKeyword("FINISHED");
  public static final SubLSymbol $kw82$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
  public static final SubLSymbol $kw83$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");
  public static final SubLSymbol $kw84$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
  public static final SubLSymbol $kw85$EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");
  public static final SubLSymbol $kw86$REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");
  public static final SubLSymbol $kw87$ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");
  public static final SubLSymbol $kw88$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");
  public static final SubLSymbol $kw89$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
  public static final SubLSymbol $kw90$CUSTOM = makeKeyword("CUSTOM");
  public static final SubLList $list91 = list(makeKeyword("MINIMAL"), makeKeyword("SHALLOW"), makeKeyword("EXTENDED"), makeKeyword("MAXIMAL"), makeKeyword("CUSTOM"));
  public static final SubLList $list92 = list(new SubLObject[] {makeKeyword("REMOVAL"), makeKeyword("TRANSFORMATION"), makeKeyword("RESIDUAL-TRANSFORMATION"), makeKeyword("REWRITE"), makeKeyword("JOIN-ORDERED"), makeKeyword("JOIN"), makeKeyword("SPLIT"), makeKeyword("RESTRICTION"), makeKeyword("UNION"), makeKeyword("DISJUNCTIVE-ASSUMPTION"), makeKeyword("ANSWER"), makeKeyword("INDIRECTION")});
  public static final SubLSymbol $kw93$PROBLEM_STORE_NAME = makeKeyword("PROBLEM-STORE-NAME");
  public static final SubLSymbol $kw94$CZER_EQUAL = makeKeyword("CZER-EQUAL");
  public static final SubLList $list95 = list(makeKeyword("EQUAL"), makeKeyword("CZER-EQUAL"));
  public static final SubLSymbol $kw96$EQUALITY_REASONING_METHOD = makeKeyword("EQUALITY-REASONING-METHOD");
  public static final SubLList $list97 = list(makeKeyword("ALL"), makeKeyword("SINGLE-LITERAL"), makeKeyword("NONE"));
  public static final SubLSymbol $kw98$EQUALITY_REASONING_DOMAIN = makeKeyword("EQUALITY-REASONING-DOMAIN");
  public static final SubLList $list99 = list(makeKeyword("ALL"), makeKeyword("ARG-TYPE"), makeKeyword("MINIMAL"), makeKeyword("NONE"));
  public static final SubLSymbol $kw100$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
  public static final SubLInteger $int101$100000 = makeInteger(100000);
  public static final SubLSymbol $kw102$MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");
  public static final SubLSymbol $kw103$REMOVAL_ALLOWED_ = makeKeyword("REMOVAL-ALLOWED?");
  public static final SubLSymbol $kw104$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
  public static final SubLSymbol $kw105$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLList $list106 = list(makeKeyword("BACKWARD"), makeKeyword("FORWARD"));
  public static final SubLSymbol $kw107$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLList $list108 = list(makeKeyword("POSSIBLE"), makeKeyword("EXECUTED"), makeKeyword("DISCARDED"));
  public static final SubLList $list109 = list(makeKeyword("REMOVAL"), makeKeyword("META-REMOVAL"), makeKeyword("TRANSFORMATION"), makeKeyword("REWRITE"), makeKeyword("STRUCTURAL"), makeKeyword("REMOVAL-CONJUNCTIVE"));
  public static final SubLSymbol $kw110$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw111$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $kw112$STRUCTURAL = makeKeyword("STRUCTURAL");
  public static final SubLSymbol $kw113$REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
  public static final SubLSymbol $kw114$REWRITE = makeKeyword("REWRITE");
  public static final SubLSymbol $kw115$META_REMOVAL = makeKeyword("META-REMOVAL");
  public static final SubLString $str116$HL_Module_of_unknown_type___s = makeString("HL-Module of unknown type: ~s");
  public static final SubLList $list117 = list(makeKeyword("IMPOSSIBLE"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INCOMPLETE"), makeKeyword("COMPLETE"));
  public static final SubLSymbol $sym118$COMPLETENESS_P = makeSymbol("COMPLETENESS-P");
  public static final SubLSymbol $kw119$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLString $str120$Complete = makeString("Complete");
  public static final SubLSymbol $kw121$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLString $str122$Incomplete = makeString("Incomplete");
  public static final SubLSymbol $kw123$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLString $str124$Grossly_Incomplete = makeString("Grossly Incomplete");
  public static final SubLSymbol $kw125$IMPOSSIBLE = makeKeyword("IMPOSSIBLE");
  public static final SubLString $str126$Impossible = makeString("Impossible");
  public static final SubLString $str127$Unexpected_completeness__a = makeString("Unexpected completeness ~a");
  public static final SubLSymbol $sym128$COMPLETENESS__ = makeSymbol("COMPLETENESS-<");
  public static final SubLSymbol $sym129$COMPLETENESS__ = makeSymbol("COMPLETENESS->");
  public static final SubLList $list130 = list(cons(makeDouble(0.5), makeInteger(50)), cons(makeDouble(1.5), makeInteger(150)));
  public static final SubLSymbol $sym131$PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");
  public static final SubLList $list132 = list(makeKeyword("PROVEN"), makeKeyword("REJECTED"));
  public static final SubLList $list133 = list(new SubLObject[] {makeKeyword("CIRCULAR"), makeKeyword("ILL-FORMED"), makeKeyword("NON-ABDUCIBLE-RULE"), makeKeyword("REJECTED-SUBPROOF"), makeKeyword("MAX-PROOF-BUBBLING-DEPTH"), makeKeyword("INCONSISTENT-MT-ASSUMPTIONS"), makeKeyword("EXCEPTED-ASSERTION"), makeKeyword("ABNORMAL"), makeKeyword("PROBLEM-NO-GOOD"), makeKeyword("MODUS-TOLLENS-WITH-NON-WFF")});
  public static final SubLList $list134 = list(makeKeyword("INDESTRUCTIBLE"), makeKeyword("DESTRUCTIBLE"), makeKeyword("UNKNOWN"));
  public static final SubLSymbol $sym135$DESTRUCTIBILITY_STATUS_P = makeSymbol("DESTRUCTIBILITY-STATUS-P");
  public static final SubLSymbol $kw136$INDESTRUCTIBLE = makeKeyword("INDESTRUCTIBLE");
  public static final SubLString $str137$Indestructible = makeString("Indestructible");
  public static final SubLSymbol $kw138$DESTRUCTIBLE = makeKeyword("DESTRUCTIBLE");
  public static final SubLString $str139$Destructible = makeString("Destructible");
  public static final SubLSymbol $kw140$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLString $str141$Unknown = makeString("Unknown");
  public static final SubLString $str142$Unexpected_destructibility_status = makeString("Unexpected destructibility status ~s");
  public static final SubLString $str143$I = makeString("I");
  public static final SubLString $str144$ = makeString("");
  public static final SubLString $str145$_ = makeString("?");
  public static final SubLList $list146 = list(new SubLObject[] {cons(makeKeyword("NAME"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("COMMENT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("CONSTRUCTOR"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("DO-ONE-STEP"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("DONE?"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SELECT-BEST-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("INITIAL-RELEVANT-STRATEGIES"), makeSymbol("DEFAULT-STRATEGY-INITIAL-RELEVANT-STRATEGIES")), cons(makeKeyword("NEW-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("INITIALIZE-PROPERTIES"), makeSymbol("DEFAULT-STRATEGY-INITIALIZE-PROPERTIES")), cons(makeKeyword("UPDATE-PROPERTIES"), makeSymbol("DEFAULT-STRATEGY-UPDATE-PROPERTIES")), cons(makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeSymbol("DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED")), cons(makeKeyword("RECONSIDER-SET-ASIDES"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("CONTINUATION-POSSIBLE?"), makeSymbol("STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?")), cons(makeKeyword("QUIESCE"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("NEW-ARGUMENT-LINK"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PROBLEM-COULD-BE-PENDING"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("PROBLEM-NO-TACTICS-STRATEGICALLY-POSSIBLE?")), cons(makeKeyword("THROW-AWAY-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SET-ASIDE-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PEEK-NEXT-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("MOTIVATE-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("ACTIVATE-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("LINK-HEAD-MOTIVATED?"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("RECONSIDER-SPLIT-SET-ASIDES"), makeSymbol("ZERO")), cons(makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), makeKeyword("MUST-OVERRIDE"))});
  public static final SubLList $list147 = list(new SubLObject[] {cons(makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PEEK-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("ACTIVATE-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("POP-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("NO-NEW-ROOTS"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("THROW-AWAY-NEW-ROOT"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PEEK-REMOVAL-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("ACTIVATE-REMOVAL-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("POP-REMOVAL-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("NO-ACTIVE-REMOVAL-STRATEGEMS"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("PEEK-TRANSFORMATION-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("ACTIVATE-TRANSFORMATION-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("POP-TRANSFORMATION-STRATEGEM"), makeKeyword("MUST-OVERRIDE")), cons(makeKeyword("NO-ACTIVE-TRANSFORMATION-STRATEGEMS"), makeKeyword("MUST-OVERRIDE"))});
  public static final SubLSymbol $sym148$STRATEGY_TYPE_PROPERTY_P = makeSymbol("STRATEGY-TYPE-PROPERTY-P");
  public static final SubLSymbol $kw149$MUST_OVERRIDE = makeKeyword("MUST-OVERRIDE");
  public static final SubLString $str150$Strategy_must_implement_method__s = makeString("Strategy must implement method ~s");
  public static final SubLList $list151 = list(makeKeyword("ANSWER"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"), makeKeyword("BINDINGS-AND-SUPPORTS"), makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS"));
  public static final SubLSymbol $kw152$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw153$TEMPLATE = makeKeyword("TEMPLATE");
  public static final SubLSymbol $kw154$FORMAT = makeKeyword("FORMAT");
  public static final SubLSymbol $kw155$RETURN = makeKeyword("RETURN");
  public static final SubLList $list156 = list(makeKeyword("EL"), makeKeyword("HL"));
  public static final SubLSymbol $kw157$EL = makeKeyword("EL");
  public static final SubLSymbol $kw158$ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
  public static final SubLList $list159 = list(makeKeyword("PROOF"), makeKeyword("BINDINGS"));
  public static final SubLSymbol $kw160$RESULT_UNIQUENESS = makeKeyword("RESULT-UNIQUENESS");
  public static final SubLList $list161 = list(makeKeyword("REQUIRE-EQUAL"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("COMPUTE-UNION"));
  public static final SubLSymbol $kw162$REQUIRE_EQUAL = makeKeyword("REQUIRE-EQUAL");
  public static final SubLSymbol $kw163$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
  public static final SubLList $list164 = list(makeKeyword("NONE"), makeKeyword("FOCUSED"), makeKeyword("ALL"));
  public static final SubLSymbol $kw165$TRANSITIVE_CLOSURE_MODE = makeKeyword("TRANSITIVE-CLOSURE-MODE");
  public static final SubLSymbol $kw166$MAINTAIN_TERM_WORKING_SET_ = makeKeyword("MAINTAIN-TERM-WORKING-SET?");
  public static final SubLSymbol $kw167$EVENTS = makeKeyword("EVENTS");
  public static final SubLList $list168 = list(makeKeyword("NEW-ANSWER"), makeKeyword("STATUS-CHANGE"), makeKeyword("NEW-TRANSFORMATION-DEPTH-REACHED"));
  public static final SubLSymbol $kw169$HALT_CONDITIONS = makeKeyword("HALT-CONDITIONS");
  public static final SubLList $list170 = list(makeKeyword("LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS"));
  public static final SubLSymbol $sym171$INFERENCE_ACCUMULATOR_TYPE_P = makeSymbol("INFERENCE-ACCUMULATOR-TYPE-P");
  public static final SubLSymbol $kw172$FORGET_EXTRA_RESULTS_ = makeKeyword("FORGET-EXTRA-RESULTS?");
  public static final SubLSymbol $kw173$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");
  public static final SubLSymbol $kw174$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $kw175$CONTINUABLE_ = makeKeyword("CONTINUABLE?");
  public static final SubLSymbol $kw176$BLOCK_ = makeKeyword("BLOCK?");
  public static final SubLSymbol $kw177$UNSPECIFIED = makeKeyword("UNSPECIFIED");
  public static final SubLSymbol $kw178$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLSymbol $kw179$NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");
  public static final SubLSymbol $sym180$INFERENCE_P = makeSymbol("INFERENCE-P");

  //// Initializers

  public void declareFunctions() {
    declare_inference_datastructures_enumerated_types_file();
  }

  public void initializeVariables() {
    init_inference_datastructures_enumerated_types_file();
  }

  public void runTopLevelForms() {
    setup_inference_datastructures_enumerated_types_file();
  }

}
