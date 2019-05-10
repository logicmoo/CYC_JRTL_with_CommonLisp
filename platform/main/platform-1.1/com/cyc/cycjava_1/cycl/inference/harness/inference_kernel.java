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
import com.cyc.cycjava_1.cycl.bindings;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cyc_kernel;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.fi;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.id_index;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
import com.cyc.cycjava_1.cycl.inference.harness.inference_trivial;
import com.cyc.cycjava_1.cycl.inference.janus;
import com.cyc.cycjava_1.cycl.inference.kbq_query_run;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_kernel extends SubLTranslatedFile {

  //// Constructor

  private inference_kernel() {}
  public static final SubLFile me = new inference_kernel();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_kernel";

  //// Definitions

  /** Temporary control variable. When non-nil, new-cyc-query uses
   new-cyc-trivial-query-int for trivial queries. Eventually should stay T. */
  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 1142) 
  public static SubLSymbol $new_cyc_trivial_query_enabledP$ = null;

  /** Creates, runs, and destroys an inference.  Returns the results,
whose format is specified by the :return property of QUERY-PROPERTIES.
If :problem-store is specified in QUERY-PROPERTIES, uses that store,
otherwise creates a new one and destroys it afterwards.
@param QUERY-PROPERTIES query-properties-p; see the definition of
  query-properties-p for explanations of all query properties.
@return 0 results, format specified by :return property
@return 1 query-halt-reason-p, why the query halted
@return 2 nil or inference-p; the inference object used to carry out
this inference, if the inference was specified to be :continuable?
or :browsable?.  This inference object can be examined or continued.
One example use of the inference object is for sharing a problem store;
one can extract the problem store from the inference
 (@see inference-problem-store), and then start a new cyc query passing
in the :problem-store property with the value you got from the first
inference.  Don't forget to @xref destroy-problem-store when you're done.
@return 3 metrics, format specified by :metrics property */
  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 2059) 
  public static final SubLObject new_cyc_query(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((query_properties == UNPROVIDED)) {
      query_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject plist_var = query_properties;
        checkType(plist_var, $sym1$PROPERTY_LIST_P);
        {
          SubLObject remainder = NIL;
          for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
            {
              SubLObject property = remainder.first();
              SubLObject value = conses_high.cadr(remainder);
              checkType(property, $sym2$QUERY_PROPERTY_P);
            }
          }
        }
      }
      if ((NIL != mt)) {
        checkType(mt, $sym3$POSSIBLY_MT_P);
      }
      {
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject metrics = NIL;
        SubLObject timing_info = NIL;
        SubLObject timing_info_1 = NIL;
        SubLObject clock_time = NIL;
        SubLObject time_var = Time.get_internal_real_time();
        {
          SubLObject resource_tracking_env_var = Time.get_internal_real_time();
          {
            SubLObject _prev_bind_0 = control_vars.$janus_within_somethingP$.currentBinding(thread);
            try {
              control_vars.$janus_within_somethingP$.bind(T, thread);
              {
                SubLObject aborted_p = NIL;
                try {
                  {
                    SubLObject _prev_bind_0_2 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
                    try {
                      inference_strategist.$within_inference_control_processP$.bind(T, thread);
                      if ((NIL != $new_cyc_trivial_query_enabledP$.getDynamicValue(thread))) {
                        thread.resetMultipleValues();
                        {
                          SubLObject result_3 = inference_trivial.new_cyc_trivial_query_int(sentence, mt, query_properties);
                          SubLObject halt_reason_4 = thread.secondMultipleValue();
                          SubLObject metrics_5 = thread.thirdMultipleValue();
                          thread.resetMultipleValues();
                          result = result_3;
                          halt_reason = halt_reason_4;
                          metrics = metrics_5;
                        }
                      }
                      if (((NIL == $new_cyc_trivial_query_enabledP$.getDynamicValue(thread))
                          || ($kw5$NON_TRIVIAL == halt_reason))) {
                        {
                          SubLObject input_query_properties = conses_high.copy_list(query_properties);
                          SubLObject input_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(input_query_properties);
                          SubLObject input_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(input_query_properties);
                          SubLObject overridden_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
                          SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(overridden_query_properties);
                          SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(overridden_query_properties);
                          SubLObject problem_store_privateP = Types.sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
                          inference = new_continuable_inference_int(sentence, mt, input_static_properties, query_static_properties);
                          inference_datastructures_inference.set_inference_input_query_properties(inference, input_query_properties);
                          kbq_query_run.possibly_set_kbq_runstate_inference(inference);
                          thread.resetMultipleValues();
                          {
                            SubLObject result_6 = new_cyc_query_int(inference, input_dynamic_properties, query_dynamic_properties, problem_store_privateP);
                            SubLObject halt_reason_7 = thread.secondMultipleValue();
                            SubLObject inference_8 = thread.thirdMultipleValue();
                            SubLObject metrics_9 = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            result = result_6;
                            halt_reason = halt_reason_7;
                            inference = inference_8;
                            metrics = metrics_9;
                          }
                        }
                      }
                    } finally {
                      inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0_2, thread);
                    }
                  }
                } catch (Throwable ccatch_env_var) {
                  aborted_p = Errors.handleThrowable(ccatch_env_var, $kw4$INFERENCE_ABORT_TARGET);
                }
                if ((NIL != aborted_p)) {
                  halt_reason = $kw6$ABORT;
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35562");
                }
              }
            } finally {
              control_vars.$janus_within_somethingP$.rebind(_prev_bind_0, thread);
            }
          }
          janus.janus_note_query_finished(sentence, mt, query_properties, result, halt_reason);
          timing_info_1 = Time.compute_with_process_resource_tracking_results(resource_tracking_env_var);
        }
        clock_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        timing_info = utilities_macros.convert_process_resource_tracking_timing_info_to_seconds(utilities_macros.nadd_clock_time_to_process_resource_timing_info(clock_time, timing_info_1));
        metrics = update_query_metrics_wrt_timing_info(metrics, timing_info);
        return Values.values(result, halt_reason, inference, metrics);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 5115) 
  public static final SubLObject update_query_metrics_wrt_timing_info(SubLObject metrics, SubLObject timing_info) {
    if ((NIL != metrics)) {
      {
        SubLObject complete_user_time = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10258");
        SubLObject complete_system_time = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10257");
        SubLObject complete_total_time = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10259");
        metrics = Sequences.nsubstitute(complete_user_time, $kw7$COMPLETE_USER_TIME, metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        metrics = Sequences.nsubstitute(complete_system_time, $kw8$COMPLETE_SYSTEM_TIME, metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        metrics = Sequences.nsubstitute(complete_total_time, $kw9$COMPLETE_TOTAL_TIME, metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
    return metrics;
  }

  /** Like @xref new-cyc-query except skips the canonicalization step by taking a
canonicalized DNF as input.
@param SCOPED-VARS; the variables assumed to be scoped (i.e. not free) in DNF.
@param QUERY-PROPERTIES query-properties-p; see the definition of
  query-properties-p for explanations of all query properties. */
  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 5821) 
  public static final SubLObject new_cyc_query_from_dnf(SubLObject dnf, SubLObject mt, SubLObject scoped_vars, SubLObject query_properties) {
    if ((scoped_vars == UNPROVIDED)) {
      scoped_vars = NIL;
    }
    if ((query_properties == UNPROVIDED)) {
      query_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != mt)) {
        checkType(mt, $sym3$POSSIBLY_MT_P);
      }
      checkType(scoped_vars, $sym10$LISTP);
      {
        SubLObject plist_var = query_properties;
        checkType(plist_var, $sym1$PROPERTY_LIST_P);
        {
          SubLObject remainder = NIL;
          for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
            {
              SubLObject property = remainder.first();
              SubLObject value = conses_high.cadr(remainder);
              checkType(property, $sym2$QUERY_PROPERTY_P);
            }
          }
        }
      }
      {
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject metrics = NIL;
        SubLObject timing_info = NIL;
        SubLObject timing_info_10 = NIL;
        SubLObject clock_time = NIL;
        SubLObject time_var = Time.get_internal_real_time();
        {
          SubLObject resource_tracking_env_var = Time.get_internal_real_time();
          {
            SubLObject aborted_p = NIL;
            try {
              {
                SubLObject _prev_bind_0 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
                try {
                  inference_strategist.$within_inference_control_processP$.bind(T, thread);
                  if ((NIL != $new_cyc_trivial_query_enabledP$.getDynamicValue(thread))) {
                    thread.resetMultipleValues();
                    {
                      SubLObject result_11 = inference_trivial.new_cyc_trivial_query_from_dnf_int(dnf, mt, scoped_vars, query_properties);
                      SubLObject halt_reason_12 = thread.secondMultipleValue();
                      SubLObject metrics_13 = thread.thirdMultipleValue();
                      thread.resetMultipleValues();
                      result = result_11;
                      halt_reason = halt_reason_12;
                      metrics = metrics_13;
                    }
                  }
                  if (((NIL == $new_cyc_trivial_query_enabledP$.getDynamicValue(thread))
                      || ($kw5$NON_TRIVIAL == halt_reason))) {
                    {
                      SubLObject input_query_properties = conses_high.copy_list(query_properties);
                      SubLObject input_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(input_query_properties);
                      SubLObject input_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(input_query_properties);
                      SubLObject overridden_query_properties = inference_strategist.explicify_inference_mode_defaults(query_properties);
                      SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_properties(overridden_query_properties);
                      SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(overridden_query_properties);
                      SubLObject problem_store_privateP = Types.sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
                      inference = new_continuable_inference_from_dnf_int(dnf, mt, scoped_vars, input_static_properties, query_static_properties);
                      inference_datastructures_inference.set_inference_input_query_properties(inference, input_query_properties);
                      thread.resetMultipleValues();
                      {
                        SubLObject result_14 = new_cyc_query_int(inference, input_dynamic_properties, query_dynamic_properties, problem_store_privateP);
                        SubLObject halt_reason_15 = thread.secondMultipleValue();
                        SubLObject inference_16 = thread.thirdMultipleValue();
                        SubLObject metrics_17 = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        result = result_14;
                        halt_reason = halt_reason_15;
                        inference = inference_16;
                        metrics = metrics_17;
                      }
                    }
                  }
                } finally {
                  inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0, thread);
                }
              }
            } catch (Throwable ccatch_env_var) {
              aborted_p = Errors.handleThrowable(ccatch_env_var, $kw4$INFERENCE_ABORT_TARGET);
            }
            if ((NIL != aborted_p)) {
              halt_reason = $kw6$ABORT;
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35563");
            }
          }
          timing_info_10 = Time.compute_with_process_resource_tracking_results(resource_tracking_env_var);
        }
        clock_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        timing_info = utilities_macros.convert_process_resource_tracking_timing_info_to_seconds(utilities_macros.nadd_clock_time_to_process_resource_timing_info(clock_time, timing_info_10));
        metrics = update_query_metrics_wrt_timing_info(metrics, timing_info);
        return Values.values(result, halt_reason, inference, metrics);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 7931) 
  public static final SubLObject new_cyc_query_int(SubLObject inference, SubLObject input_dynamic_properties, SubLObject query_dynamic_properties, SubLObject problem_store_privateP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(query_dynamic_properties);
        SubLObject destroy_storeP = makeBoolean(((NIL != problem_store_privateP)
             && (NIL == inference_datastructures_enumerated_types.inference_properties_browsableP(inference_dynamic_properties))));
        SubLObject browsableP = inference_datastructures_enumerated_types.inference_properties_browsableP(inference_dynamic_properties);
        if ((NIL != destroy_storeP)) {
          {
            SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            inference_datastructures_problem_store.note_problem_store_destruction_imminent(store);
          }
        }
        {
          SubLObject results = NIL;
          SubLObject halt_reason = NIL;
          SubLObject continued_inference = NIL;
          SubLObject metrics = NIL;
          if ((NIL != inference_datastructures_inference.continuable_inference_p(inference))) {
            thread.resetMultipleValues();
            {
              SubLObject results_18 = continue_inference_int(inference, input_dynamic_properties, query_dynamic_properties);
              SubLObject halt_reason_19 = thread.secondMultipleValue();
              SubLObject continued_inference_20 = thread.thirdMultipleValue();
              SubLObject metrics_21 = thread.fourthMultipleValue();
              thread.resetMultipleValues();
              results = results_18;
              halt_reason = halt_reason_19;
              continued_inference = continued_inference_20;
              metrics = metrics_21;
            }
          } else {
            thread.resetMultipleValues();
            {
              SubLObject results_22 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36247");
              SubLObject halt_reason_23 = thread.secondMultipleValue();
              SubLObject metrics_24 = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              results = results_22;
              halt_reason = halt_reason_23;
              metrics = metrics_24;
            }
          }
          {
            SubLObject inference_problem_store = inference_datastructures_inference.inference_problem_store(inference);
            SubLObject destroy_inferenceP = makeBoolean((NIL == browsableP));
            if ((NIL != destroy_inferenceP)) {
              inference_datastructures_inference.destroy_inference(inference);
            }
            if ((NIL != destroy_storeP)) {
              inference_datastructures_problem_store.destroy_problem_store(inference_problem_store);
            }
          }
          if ((NIL != browsableP)) {
            return Values.values(results, halt_reason, inference, metrics);
          } else {
            return Values.values(results, halt_reason, NIL, metrics);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 10891) 
  public static final SubLObject new_continuable_inference_int(SubLObject sentence, SubLObject mt, SubLObject input_static_properties, SubLObject query_static_properties) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((input_static_properties == UNPROVIDED)) {
      input_static_properties = NIL;
    }
    if ((query_static_properties == UNPROVIDED)) {
      query_static_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject inference_static_properties = extract_some_inference_properties(query_static_properties);
        SubLObject non_explanatory_sentence = thread.secondMultipleValue();
        SubLObject problem_store_privateP = thread.thirdMultipleValue();
        SubLObject store = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        {
          SubLObject hypothesizeP = conses_high.getf(inference_static_properties, $kw13$CONDITIONAL_SENTENCE_, UNPROVIDED);
          SubLObject disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.inference_properties_disjunction_free_el_vars_policy(inference_static_properties);
          SubLObject strategy_type = inference_strategist.strategy_type_from_sentence_and_static_properties(sentence, mt, query_static_properties);
          SubLObject inference = inference_strategist.simplest_inference_prepare_new(store, sentence, mt, strategy_type, disjunction_free_el_vars_policy, hypothesizeP, non_explanatory_sentence, problem_store_privateP);
          initialize_inference_properties(inference, input_static_properties, inference_static_properties, query_static_properties);
          return inference;
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 12488) 
  public static final SubLObject new_continuable_inference_from_dnf_int(SubLObject dnf, SubLObject mt, SubLObject scoped_vars, SubLObject input_static_properties, SubLObject query_static_properties) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject inference_static_properties = extract_some_inference_properties(query_static_properties);
        SubLObject non_explanatory_sentence = thread.secondMultipleValue();
        SubLObject problem_store_privateP = thread.thirdMultipleValue();
        SubLObject store = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        {
          SubLObject strategy_type = inference_strategist.strategy_type_from_dnf_and_static_properties(dnf, mt, query_static_properties);
          SubLObject inference = inference_strategist.simplest_inference_prepare_new_from_dnf(store, dnf, mt, strategy_type, scoped_vars, non_explanatory_sentence, problem_store_privateP);
          initialize_inference_properties(inference, input_static_properties, inference_static_properties, query_static_properties);
          return inference;
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 13252) 
  public static final SubLObject extract_some_inference_properties(SubLObject query_static_properties) {
    {
      SubLObject inference_static_properties = inference_datastructures_enumerated_types.extract_inference_static_properties(query_static_properties);
      SubLObject non_explanatory_sentence = conses_high.getf(inference_static_properties, $kw15$NON_EXPLANATORY_SENTENCE, UNPROVIDED);
      SubLObject problem_store_privateP = Types.sublisp_null(inference_datastructures_enumerated_types.inference_properties_problem_store(query_static_properties));
      SubLObject store = problem_store_from_properties(query_static_properties);
      return Values.values(inference_static_properties, non_explanatory_sentence, problem_store_privateP, store);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 13909) 
  public static final SubLObject initialize_inference_properties(SubLObject inference, SubLObject input_static_properties, SubLObject inference_static_properties, SubLObject query_static_properties) {
    inference_datastructures_inference.set_inference_input_query_properties(inference, input_static_properties);
    inference_datastructures_inference.inference_set_static_properties(inference, inference_static_properties);
    {
      SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
      SubLObject strategy_static_properties = inference_datastructures_enumerated_types.extract_strategy_static_properties(query_static_properties);
      inference_tactician.strategy_initialize_properties(strategy, strategy_static_properties);
    }
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 14441) 
  public static final SubLObject problem_store_from_properties(SubLObject static_properties) {
    {
      SubLObject problem_store = inference_datastructures_enumerated_types.inference_properties_problem_store(static_properties);
      if ((NIL != problem_store)) {
        return problem_store;
      } else {
        {
          SubLObject problem_store_properties = extract_problem_store_properties_from_query_static_properties(static_properties);
          return inference_datastructures_problem_store.new_problem_store(problem_store_properties);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 14814) 
  public static final SubLObject extract_problem_store_properties_from_query_static_properties(SubLObject query_static_properties) {
    return list_utilities.filter_plist(query_static_properties, $sym16$PROBLEM_STORE_PROPERTY_P);
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 15911) 
  public static final SubLObject continue_inference_int(SubLObject inference, SubLObject input_dynamic_properties, SubLObject overridden_dynamic_properties) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      inference_update_properties(inference, input_dynamic_properties, overridden_dynamic_properties);
      inference_strategist.consider_switching_strategies(inference);
      inference_datastructures_inference.reset_inference_new_answers(inference);
      {
        SubLObject _prev_bind_0 = inference_macros.$controlling_inferences$.currentBinding(thread);
        try {
          inference_macros.$controlling_inferences$.bind(cons(inference, inference_macros.$controlling_inferences$.getDynamicValue(thread)), thread);
          inference_strategist.inference_run(inference);
        } finally {
          inference_macros.$controlling_inferences$.rebind(_prev_bind_0, thread);
        }
      }
      return inference_postprocess(inference);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 16319) 
  public static final SubLObject inference_update_properties(SubLObject inference, SubLObject input_dynamic_properties, SubLObject query_dynamic_properties) {
    {
      SubLObject inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(query_dynamic_properties);
      if ((NIL != inference_datastructures_inference.prepared_inference_p(inference))) {
        inference_strategist.inference_update_dynamic_properties(inference, inference_dynamic_properties);
        inference_strategist.strengthen_query_properties_using_inference(inference);
      } else {
        inference_strategist.inference_update_dynamic_properties(inference, inference_dynamic_properties);
      }
    }
    inference_datastructures_inference.update_inference_input_query_properties(inference, input_dynamic_properties);
    {
      SubLObject strategy_dynamic_properties = inference_datastructures_enumerated_types.extract_strategy_dynamic_properties(query_dynamic_properties);
      SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
      inference_tactician.strategy_update_properties(strategy, strategy_dynamic_properties);
    }
    inference_datastructures_problem_store.finalize_problem_store_properties(inference_datastructures_inference.inference_problem_store(inference));
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 17287) 
  public static final SubLObject inference_postprocess(SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(inference, $sym19$INFERENCE_P);
      {
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject return_inference = NIL;
        SubLObject metrics = NIL;
        SubLObject error_message = NIL;
        if ((NIL != control_vars.$inference_debugP$.getDynamicValue(thread))) {
          if ((NIL == inference_datastructures_inference.valid_inference_p(inference))) {
            Errors.error($str20$Inference_was_destroyed_while_run);
          }
          {
            SubLObject answers = inference_datastructures_inference.inference_all_new_answers(inference);
            halt_reason = inference_datastructures_inference.inference_suspend_status(inference);
            if ((NIL != inference_datastructures_inference.inference_browsableP(inference))) {
              return_inference = inference;
            }
            metrics = inference_datastructures_inference.inference_compute_metrics(inference);
            result = inference_result_from_answers(inference, answers);
            if ((NIL != inference_datastructures_inference.inference_forget_extra_resultsP(inference))) {
              result = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36245");
            }
            if ((NIL != inference_datastructures_inference.inference_cache_resultsP(inference))) {
              {
                SubLObject cdolist_list_var = answers;
                SubLObject answer = NIL;
                for (answer = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), answer = cdolist_list_var.first()) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35551");
                }
              }
            }
          }
        } else {
          try {
            {
              SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
              try {
                Errors.$error_handler$.bind(Symbols.symbol_function($sym22$INFERENCE_ERROR_HANDLER), thread);
                try {
                  if ((NIL == inference_datastructures_inference.valid_inference_p(inference))) {
                    Errors.error($str20$Inference_was_destroyed_while_run);
                  }
                  {
                    SubLObject answers = inference_datastructures_inference.inference_all_new_answers(inference);
                    halt_reason = inference_datastructures_inference.inference_suspend_status(inference);
                    if ((NIL != inference_datastructures_inference.inference_browsableP(inference))) {
                      return_inference = inference;
                    }
                    metrics = inference_datastructures_inference.inference_compute_metrics(inference);
                    result = inference_result_from_answers(inference, answers);
                    if ((NIL != inference_datastructures_inference.inference_forget_extra_resultsP(inference))) {
                      result = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36246");
                    }
                    if ((NIL != inference_datastructures_inference.inference_cache_resultsP(inference))) {
                      {
                        SubLObject cdolist_list_var = answers;
                        SubLObject answer = NIL;
                        for (answer = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), answer = cdolist_list_var.first()) {
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35552");
                        }
                      }
                    }
                  }
                } catch (Throwable catch_var) {
                  Errors.handleThrowable(catch_var, NIL);
                }
              } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
              }
            }
          } catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $kw21$INFERENCE_ERROR);
          }
        }
        if ((NIL != error_message)) {
          halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message);
        }
        return Values.values(result, halt_reason, return_inference, metrics);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 18190) 
  public static final SubLObject inference_result_from_answers(SubLObject inference, SubLObject answers) {
    {
      SubLObject answer_language = inference_datastructures_inference.inference_answer_language(inference);
      SubLObject return_type = inference_datastructures_inference.inference_return_type(inference);
      SubLObject result = NIL;
      SubLObject pcase_var = return_type;
      if (pcase_var.eql($kw23$ANSWER)) {
        result = answers;
      } else if (pcase_var.eql($kw24$BINDINGS)) {
        result = inference_result_from_answers_via_template(answers, $kw24$BINDINGS);
      } else if (pcase_var.eql($kw25$SUPPORTS)) {
        result = inference_result_from_answers_via_template(answers, $kw25$SUPPORTS);
      } else if (pcase_var.eql($kw26$BINDINGS_AND_SUPPORTS)) {
        result = inference_result_from_answers_via_template(answers, $list27);
      } else if (pcase_var.eql($kw28$BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
        {
          SubLObject hypothetical_bindings = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35766");
          result = list(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36248"), hypothetical_bindings);
        }
      } else {
        if ((NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type))) {
          {
            SubLObject template = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36251");
            result = inference_result_from_answers_via_template(answers, template);
          }
        } else if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36499"))) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36249");
        } else {
          Errors.error($str29$Unexpected_return_type_specified_, return_type);
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 19958) 
  public static final SubLObject inference_result_from_answers_via_template(SubLObject answers, SubLObject template) {
    {
      SubLObject process_supportsP = list_utilities.simple_tree_findP($kw25$SUPPORTS, template);
      SubLObject results = NIL;
      SubLObject cdolist_list_var = answers;
      SubLObject answer = NIL;
      for (answer = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), answer = cdolist_list_var.first()) {
        {
          SubLObject v_bindings = inference_datastructures_inference.inference_answer_result_bindings(answer);
          SubLObject result = inference_one_result_from_bindings_via_template(v_bindings, template);
          if ((NIL != process_supportsP)) {
            {
              SubLObject cdolist_list_var_25 = inference_datastructures_inference.inference_answer_justifications(answer);
              SubLObject justification = NIL;
              for (justification = cdolist_list_var_25.first(); (NIL != cdolist_list_var_25); cdolist_list_var_25 = cdolist_list_var_25.rest(), justification = cdolist_list_var_25.first()) {
                {
                  SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports(justification);
                  SubLObject support_result = result;
                  support_result = conses_high.subst(supports, $kw25$SUPPORTS, support_result, UNPROVIDED, UNPROVIDED);
                  results = cons(support_result, results);
                }
              }
            }
          } else {
            results = cons(result, results);
          }
        }
      }
      return Sequences.nreverse(results);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 21017) 
  public static final SubLObject inference_one_result_from_bindings_via_template(SubLObject v_bindings, SubLObject template) {
    {
      SubLObject result = template;
      result = bindings.apply_bindings(v_bindings, result);
      if ((NIL != list_utilities.simple_tree_findP($kw24$BINDINGS, result))) {
        result = conses_high.subst(v_bindings, $kw24$BINDINGS, result, UNPROVIDED, UNPROVIDED);
      }
      return result;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 24135) 
  public static final SubLObject inference_answer_el_bindings(SubLObject answer) {
    {
      SubLObject answer_bindings = inference_datastructures_inference.inference_answer_bindings(answer);
      return inference_bindings_hl_to_el(answer_bindings);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 24313) 
  public static final SubLObject inference_bindings_hl_to_el(SubLObject hl_bindings) {
    {
      SubLObject el_bindings = NIL;
      SubLObject cdolist_list_var = hl_bindings;
      SubLObject binding = NIL;
      for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
        {
          SubLObject datum = binding;
          SubLObject current = datum;
          SubLObject variable = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list42);
          variable = current.first();
          current = current.rest();
          value = current;
          {
            SubLObject el_value = inference_answer_hl_to_el(value);
            el_bindings = cons(bindings.make_variable_binding(variable, el_value), el_bindings);
          }
        }
      }
      el_bindings = Sequences.nreverse(el_bindings);
      return el_bindings;
    }
  }

  public static final class $inference_bindings_hl_to_el$UnaryFunction extends UnaryFunction {
    public $inference_bindings_hl_to_el$UnaryFunction() { super(extractFunctionNamed("INFERENCE-BINDINGS-HL-TO-EL")); }
    public SubLObject processItem(SubLObject arg1) { return inference_bindings_hl_to_el(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-kernel.lisp", position = 24681) 
  public static final SubLObject inference_answer_hl_to_el(SubLObject expression) {
    expression = fi.assertion_expand(expression);
    expression = narts_high.nart_expand(expression);
    return expression;
  }

  public static final SubLObject declare_inference_kernel_file() {
    declareFunction(myName, "new_browsable_cyc_query", "NEW-BROWSABLE-CYC-QUERY", 1, 2, false);
    declareFunction(myName, "new_browsable_cyc_query_from_dnf", "NEW-BROWSABLE-CYC-QUERY-FROM-DNF", 2, 2, false);
    declareFunction(myName, "new_cyc_query", "NEW-CYC-QUERY", 1, 2, false);
    declareFunction(myName, "update_query_metrics_wrt_timing_info", "UPDATE-QUERY-METRICS-WRT-TIMING-INFO", 2, 0, false);
    declareFunction(myName, "new_cyc_query_from_dnf", "NEW-CYC-QUERY-FROM-DNF", 2, 2, false);
    declareFunction(myName, "new_cyc_query_int", "NEW-CYC-QUERY-INT", 4, 0, false);
    declareFunction(myName, "new_continuable_inference", "NEW-CONTINUABLE-INFERENCE", 1, 2, false);
    declareFunction(myName, "new_continuable_inference_int", "NEW-CONTINUABLE-INFERENCE-INT", 1, 3, false);
    declareFunction(myName, "new_continuable_inference_from_dnf", "NEW-CONTINUABLE-INFERENCE-FROM-DNF", 2, 2, false);
    declareFunction(myName, "new_continuable_inference_from_dnf_int", "NEW-CONTINUABLE-INFERENCE-FROM-DNF-INT", 5, 0, false);
    declareFunction(myName, "extract_some_inference_properties", "EXTRACT-SOME-INFERENCE-PROPERTIES", 1, 0, false);
    declareFunction(myName, "initialize_inference_properties", "INITIALIZE-INFERENCE-PROPERTIES", 4, 0, false);
    declareFunction(myName, "problem_store_from_properties", "PROBLEM-STORE-FROM-PROPERTIES", 1, 0, false);
    declareFunction(myName, "extract_problem_store_properties_from_query_static_properties", "EXTRACT-PROBLEM-STORE-PROPERTIES-FROM-QUERY-STATIC-PROPERTIES", 1, 0, false);
    declareFunction(myName, "continue_inference", "CONTINUE-INFERENCE", 1, 1, false);
    declareFunction(myName, "continue_inference_int", "CONTINUE-INFERENCE-INT", 3, 0, false);
    declareFunction(myName, "inference_update_properties", "INFERENCE-UPDATE-PROPERTIES", 3, 0, false);
    declareFunction(myName, "inference_postprocess", "INFERENCE-POSTPROCESS", 1, 0, false);
    declareFunction(myName, "inference_result_from_answers", "INFERENCE-RESULT-FROM-ANSWERS", 2, 0, false);
    declareFunction(myName, "inference_result_from_all_answers", "INFERENCE-RESULT-FROM-ALL-ANSWERS", 1, 0, false);
    declareFunction(myName, "inference_template_return_type_template", "INFERENCE-TEMPLATE-RETURN-TYPE-TEMPLATE", 1, 0, false);
    declareFunction(myName, "inference_result_from_answers_via_template", "INFERENCE-RESULT-FROM-ANSWERS-VIA-TEMPLATE", 2, 0, false);
    declareFunction(myName, "inference_result_from_binding_lists_via_template", "INFERENCE-RESULT-FROM-BINDING-LISTS-VIA-TEMPLATE", 2, 0, false);
    declareFunction(myName, "inference_one_result_from_bindings_via_template", "INFERENCE-ONE-RESULT-FROM-BINDINGS-VIA-TEMPLATE", 2, 0, false);
    declareFunction(myName, "inference_answers_via_format", "INFERENCE-ANSWERS-VIA-FORMAT", 2, 0, false);
    declareFunction(myName, "inference_all_answer_result_bindings", "INFERENCE-ALL-ANSWER-RESULT-BINDINGS", 1, 0, false);
    declareFunction(myName, "filter_out_extra_inference_results", "FILTER-OUT-EXTRA-INFERENCE-RESULTS", 2, 0, false);
    declareFunction(myName, "handle_non_continuable_inference_status", "HANDLE-NON-CONTINUABLE-INFERENCE-STATUS", 1, 0, false);
    declareFunction(myName, "inference_answers_to_bindings", "INFERENCE-ANSWERS-TO-BINDINGS", 2, 0, false);
    declareFunction(myName, "inference_answer_to_bindings", "INFERENCE-ANSWER-TO-BINDINGS", 2, 0, false);
    declareFunction(myName, "inference_answer_el_bindings", "INFERENCE-ANSWER-EL-BINDINGS", 1, 0, false);
    declareFunction(myName, "inference_bindings_hl_to_el", "INFERENCE-BINDINGS-HL-TO-EL", 1, 0, false); new $inference_bindings_hl_to_el$UnaryFunction();
    declareFunction(myName, "inference_answer_hl_to_el", "INFERENCE-ANSWER-HL-TO-EL", 1, 0, false);
    declareFunction(myName, "inference_answer_supports", "INFERENCE-ANSWER-SUPPORTS", 1, 0, false);
    declareFunction(myName, "inference_answer_bindings_and_supports", "INFERENCE-ANSWER-BINDINGS-AND-SUPPORTS", 1, 0, false);
    declareFunction(myName, "inference_answer_el_bindings_and_supports", "INFERENCE-ANSWER-EL-BINDINGS-AND-SUPPORTS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_kernel_file() {
    $new_cyc_trivial_query_enabledP$ = defvar("*NEW-CYC-TRIVIAL-QUERY-ENABLED?*", T);
    return NIL;
  }

  public static final SubLObject setup_inference_kernel_file() {
    // CVS_ID("Id: inference-kernel.lisp 128924 2009-10-07 17:48:12Z pace ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $sym1$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $sym2$QUERY_PROPERTY_P = makeSymbol("QUERY-PROPERTY-P");
  public static final SubLSymbol $sym3$POSSIBLY_MT_P = makeSymbol("POSSIBLY-MT-P");
  public static final SubLSymbol $kw4$INFERENCE_ABORT_TARGET = makeKeyword("INFERENCE-ABORT-TARGET");
  public static final SubLSymbol $kw5$NON_TRIVIAL = makeKeyword("NON-TRIVIAL");
  public static final SubLSymbol $kw6$ABORT = makeKeyword("ABORT");
  public static final SubLSymbol $kw7$COMPLETE_USER_TIME = makeKeyword("COMPLETE-USER-TIME");
  public static final SubLSymbol $kw8$COMPLETE_SYSTEM_TIME = makeKeyword("COMPLETE-SYSTEM-TIME");
  public static final SubLSymbol $kw9$COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");
  public static final SubLSymbol $sym10$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym11$POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P");
  public static final SubLSymbol $sym12$QUERY_STATIC_OR_META_PROPERTIES_P = makeSymbol("QUERY-STATIC-OR-META-PROPERTIES-P");
  public static final SubLSymbol $kw13$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLSymbol $sym14$DNF_P = makeSymbol("DNF-P");
  public static final SubLSymbol $kw15$NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");
  public static final SubLSymbol $sym16$PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");
  public static final SubLSymbol $sym17$CONTINUABLE_INFERENCE_P = makeSymbol("CONTINUABLE-INFERENCE-P");
  public static final SubLSymbol $sym18$QUERY_DYNAMIC_PROPERTIES_P = makeSymbol("QUERY-DYNAMIC-PROPERTIES-P");
  public static final SubLSymbol $sym19$INFERENCE_P = makeSymbol("INFERENCE-P");
  public static final SubLString $str20$Inference_was_destroyed_while_run = makeString("Inference was destroyed while running.");
  public static final SubLSymbol $kw21$INFERENCE_ERROR = makeKeyword("INFERENCE-ERROR");
  public static final SubLSymbol $sym22$INFERENCE_ERROR_HANDLER = makeSymbol("INFERENCE-ERROR-HANDLER");
  public static final SubLSymbol $kw23$ANSWER = makeKeyword("ANSWER");
  public static final SubLSymbol $kw24$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw25$SUPPORTS = makeKeyword("SUPPORTS");
  public static final SubLSymbol $kw26$BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
  public static final SubLList $list27 = list(makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));
  public static final SubLSymbol $kw28$BINDINGS_AND_HYPOTHETICAL_BINDINGS = makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
  public static final SubLString $str29$Unexpected_return_type_specified_ = makeString("Unexpected return type specified: ~a");
  public static final SubLString $str30$Ill_formed__template_return_type_ = makeString("Ill-formed :template return type ~a");
  public static final SubLList $list31 = list(makeSymbol("FORMAT"), makeSymbol("CONTROL-STRING"), makeSymbol("&REST"), makeSymbol("VARIABLES"));
  public static final SubLSymbol $sym32$FORMAT = makeSymbol("FORMAT");
  public static final SubLSymbol $kw33$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw34$ILL_FORMED = makeKeyword("ILL-FORMED");
  public static final SubLSymbol $kw35$TAUTOLOGY = makeKeyword("TAUTOLOGY");
  public static final SubLSymbol $kw36$CONTRADICTION = makeKeyword("CONTRADICTION");
  public static final SubLString $str37$Unexpected_inference_status__s = makeString("Unexpected inference status ~s");
  public static final SubLSymbol $sym38$INFERENCE_ANSWER_LANGUAGE_P = makeSymbol("INFERENCE-ANSWER-LANGUAGE-P");
  public static final SubLSymbol $kw39$HL = makeKeyword("HL");
  public static final SubLSymbol $sym40$INFERENCE_ANSWER_BINDINGS = makeSymbol("INFERENCE-ANSWER-BINDINGS");
  public static final SubLSymbol $sym41$INFERENCE_ANSWER_EL_BINDINGS = makeSymbol("INFERENCE-ANSWER-EL-BINDINGS");
  public static final SubLList $list42 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym43$CONVERT_HL_SUPPORT_TO_EL_SUPPORT = makeSymbol("CONVERT-HL-SUPPORT-TO-EL-SUPPORT");

  //// Initializers

  public void declareFunctions() {
    declare_inference_kernel_file();
  }

  public void initializeVariables() {
    init_inference_kernel_file();
  }

  public void runTopLevelForms() {
    setup_inference_kernel_file();
  }

}
