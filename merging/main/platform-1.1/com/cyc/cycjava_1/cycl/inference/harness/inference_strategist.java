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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.clausifier;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.el_grammar;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.hl_storage_modules;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.hlmt_czer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_abduction_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_analysis;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_czer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_forward_propagate;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_parameters;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.simplifier;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_strategist extends SubLTranslatedFile {

  //// Constructor

  private inference_strategist() {}
  public static final SubLFile me = new inference_strategist();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_strategist";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 1992) 
  public static SubLSymbol $within_inference_control_processP$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 3531) 
  public static final SubLObject inference_error_handler() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Dynamic.sublisp_throw($kw17$INFERENCE_ERROR, Errors.$error_message$.getDynamicValue(thread));
    }
  }

  /** Temporary control variable; whether or not :MAX-TIME is enforced via timeouts. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 4200) 
  private static SubLSymbol $inference_max_time_timeout_enabledP$ = null;

  /** Aborting might leave the inference and its problem store in an inconsistent state.
   Hence, if the inference is continuable or if its problem store might be shared,
   we avoid triggering a hard abort when it runs out of time. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 4636) 
  public static final SubLObject inference_abort_max_time(SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $inference_max_time_timeout_enabledP$.getDynamicValue(thread))) {
        return NIL;
      }
      if ((NIL != inference_datastructures_inference.inference_continuableP(inference))) {
        return NIL;
      }
      if ((NIL == inference_datastructures_inference.inference_problem_store_privateP(inference))) {
        return NIL;
      }
      return inference_datastructures_inference.inference_max_time(inference);
    }
  }

  /** Uses the :inference-mode property in QUERY-PROPERTIES to fill in values for other
   query properties, but only if they were not already explicitly specified. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 5270) 
  public static final SubLObject explicify_inference_mode_defaults(SubLObject query_properties) {
    {
      SubLObject inference_mode = inference_datastructures_enumerated_types.inference_properties_mode(query_properties);
      return list_utilities.merge_plist(inference_parameters.query_properties_for_inference_mode(inference_mode), query_properties);
    }
  }

  /** Strengthens the properties of INFERENCE.
   @note The inference should be in the preparation stage.
   But as it requires the dynamic properties to be set beforehand (to access it through the inference), 
   this check has to be made before calling this function. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 7198) 
  public static final SubLObject strengthen_query_properties_using_inference(SubLObject inference) {
    checkType(inference, $sym30$INFERENCE_P);
    {
      SubLObject problem_store = inference_datastructures_inference.inference_problem_store(inference);
      SubLObject problem_store_privateP = inference_datastructures_inference.inference_problem_store_privateP(inference);
      SubLObject max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
      SubLObject transformation_allowedP = inference_datastructures_problem_store.problem_store_transformation_allowedP(problem_store);
      SubLObject continuableP = inference_datastructures_inference.inference_continuableP(inference);
      SubLObject return_type = inference_datastructures_inference.inference_return_type(inference);
      if ((NIL == transformation_allowedP)) {
        inference_datastructures_inference.set_inference_max_transformation_depth(inference, ZERO_INTEGER);
      }
      if ((NIL != inference_datastructures_problem_store.problem_store_newP(problem_store))) {
        if (((NIL != inference_datastructures_inference.inference_problem_store_private_wrt_dynamic_propertiesP(inference))
             && max_transformation_depth.eql(ZERO_INTEGER))) {
          inference_datastructures_problem_store.set_problem_store_transformation_allowedP(problem_store, NIL);
        }
      }
      {
        SubLObject pcase_var = return_type;
        if ((pcase_var.eql($kw31$SUPPORTS)
            || pcase_var.eql($kw32$BINDINGS_AND_SUPPORTS))) {
          inference_datastructures_inference.set_inference_answer_language(inference, $kw33$HL);
        }
        if (((NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type))
             && (NIL != list_utilities.simple_tree_findP($kw31$SUPPORTS, return_type)))) {
          inference_datastructures_inference.set_inference_answer_language(inference, $kw33$HL);
        }
      }
      if ((NIL != inference_datastructures_problem_store.problem_store_newP(problem_store))) {
        if ((NIL == problem_store_privateP)) {
          inference_datastructures_problem_store.set_problem_store_add_restriction_layer_of_indirectionP(problem_store, T);
        }
        if ((NIL != inference_datastructures_problem_store.problem_store_forwardP(problem_store))) {
        }
        {
          SubLObject hl_query = inference_datastructures_inference.inference_hl_query(inference);
          if (((NIL != problem_store_privateP)
               && (NIL != inference_datastructures_problem_query.single_literal_problem_query_p(hl_query)))) {
            if ((max_transformation_depth.eql(ZERO_INTEGER)
                 && (NIL == continuableP))) {
              inference_datastructures_problem_store.set_problem_store_add_restriction_layer_of_indirectionP(problem_store, NIL);
            }
          }
        }
      }
      if ((NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(problem_store))) {
        inference_datastructures_inference.set_inference_result_uniqueness_criterion(inference, $kw34$PROOF);
      }
    }
    return NIL;
  }

  /** Turns a :new inference into a :prepared inference.
   Canonicalizes the input MT, EL-QUERY, and NON-EXPLANATORY-QUERY (if any) of inference into
   HL-QUERY and EXPLANATORY-HL-QUERY and additional resulting bookkeeping.
   Returns a :prepared INFERENCE if all goes well during canonicalization,
   otherwise returns #$True, #$False, or NIL. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 10902) 
  public static final SubLObject inference_prepare(SubLObject inference, SubLObject disjunction_free_el_vars_policy, SubLObject hypothesizeP) {
    checkType(inference, $sym35$NEW_INFERENCE_P);
    prepare_inference_hl_query(inference, disjunction_free_el_vars_policy, hypothesizeP);
    return inference_prepare_int(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 11508) 
  public static final SubLObject inference_prepare_from_dnf(SubLObject inference, SubLObject dnf, SubLObject scoped_vars) {
    checkType(inference, $sym35$NEW_INFERENCE_P);
    prepare_inference_hl_query_from_dnf(inference, dnf, scoped_vars);
    return inference_prepare_int(inference);
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 11732) 
  public static final SubLObject inference_prepare_int(SubLObject inference) {
    if ((NIL != inference_datastructures_inference.new_inference_p(inference))) {
      if ((NIL != inference_datastructures_inference.simplest_inference_p(inference))) {
        simplest_inference_prepare(inference);
      } else {
        Errors.error($str36$can_t_handle_non_simplest_inferen, inference);
      }
      inference_datastructures_inference.set_inference_status(inference, $kw37$PREPARED);
    }
    return inference;
  }

  /** Virtual subclass constructor for simplest-inference-p */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 12183) 
  public static final SubLObject simplest_inference_prepare(SubLObject inference) {
    checkType(inference, $sym38$SIMPLEST_INFERENCE_P);
    inference_worker.find_or_create_root_problem_and_link(inference);
    return NIL;
  }

  /** Creates a new inference object and gets it into the :prepared state. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 12407) 
  public static final SubLObject simplest_inference_prepare_new(SubLObject problem_store, SubLObject el_query, SubLObject mt, SubLObject strategy_type, SubLObject disjunction_free_el_vars_policy, SubLObject hypothesizeP, SubLObject non_explanatory_el_query, SubLObject problem_store_privateP) {
    {
      SubLObject inference = inference_datastructures_inference.new_simplest_inference_of_type(problem_store, strategy_type);
      inference_datastructures_inference.set_inference_input_el_query(inference, el_query);
      inference_datastructures_inference.set_inference_input_mt(inference, mt);
      inference_datastructures_inference.set_inference_input_non_explanatory_el_query(inference, non_explanatory_el_query);
      inference_datastructures_inference.set_inference_problem_store_private(inference, problem_store_privateP);
      return inference_prepare(inference, disjunction_free_el_vars_policy, hypothesizeP);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 13264) 
  public static final SubLObject simplest_inference_prepare_new_from_dnf(SubLObject problem_store, SubLObject dnf, SubLObject mt, SubLObject strategy_type, SubLObject scoped_vars, SubLObject non_explanatory_el_query, SubLObject problem_store_privateP) {
    {
      SubLObject inference = inference_datastructures_inference.new_simplest_inference_of_type(problem_store, strategy_type);
      inference_datastructures_inference.set_inference_input_mt(inference, mt);
      inference_datastructures_inference.set_inference_input_non_explanatory_el_query(inference, non_explanatory_el_query);
      inference_datastructures_inference.set_inference_problem_store_private(inference, problem_store_privateP);
      return inference_prepare_from_dnf(inference, dnf, scoped_vars);
    }
  }

  /** The problem query that expresses a tautology. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 13774) 
  private static SubLSymbol $tautology_problem_query$ = null;

  /** The problem query that expresses a contradiction. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 14041) 
  private static SubLSymbol $contradiction_problem_query$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 14471) 
  private static SubLSymbol $preparing_inferenceP$ = null;

  /** Modifies and returns INFERENCE.
If all goes well, sets INFERENCE's hl-query to a canonicalized version of
its EL query.  If there is a problem during canonicalization, it does not
set the hl-query, but instead changes the status of INFERENCE
from :new to either :tautology, :contradiction, or :ill-formed. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 14596) 
  public static final SubLObject prepare_inference_hl_query(SubLObject inference, SubLObject disjunction_free_el_vars_policy, SubLObject hypothesizeP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        SubLObject store_var = store;
        SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
        {
          SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
          try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            {
              SubLObject original_memoization_process = NIL;
              if (((NIL != local_state)
                   && (NIL == memoization_state.memoization_state_lock(local_state)))) {
                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                {
                  SubLObject current_proc = Threads.current_process();
                  if ((NIL == original_memoization_process)) {
                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                  } else {
                    if ((original_memoization_process != current_proc)) {
                      Errors.error($str40$Invalid_attempt_to_reuse_memoizat);
                    }
                  }
                }
              }
              try {
                {
                  SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                  {
                    SubLObject _prev_bind_0_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    try {
                      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                      {
                        SubLObject _prev_bind_0_2 = $preparing_inferenceP$.currentBinding(thread);
                        try {
                          $preparing_inferenceP$.bind(T, thread);
                          {
                            SubLObject input_mt = inference_datastructures_inference.inference_input_mt(inference);
                            SubLObject input_el_query = inference_datastructures_inference.inference_input_el_query(inference);
                            SubLObject input_non_explanatory_el_query = inference_datastructures_inference.inference_input_non_explanatory_el_query(inference);
                            thread.resetMultipleValues();
                            {
                              SubLObject mt = prepare_inference_hl_query_int(input_mt, input_el_query, input_non_explanatory_el_query, hypothesizeP);
                              SubLObject el_query = thread.secondMultipleValue();
                              SubLObject explanatory_el_query = thread.thirdMultipleValue();
                              SubLObject hypothetical_bindings = thread.fourthMultipleValue();
                              SubLObject tautology_justifications = thread.fifthMultipleValue();
                              thread.resetMultipleValues();
                              if (((NIL != mt)
                                   && (NIL == hlmt.hlmt_p(mt)))) {
                                inference_datastructures_inference.set_inference_status(inference, $kw41$ILL_FORMED);
                              } else if (($kw42$NOT_AN_IMPLICATION == el_query)) {
                                inference_datastructures_inference.set_inference_status(inference, $kw41$ILL_FORMED);
                              } else if (($kw43$TAUTOLOGY == el_query)) {
                                inference_datastructures_inference.set_inference_status(inference, $kw43$TAUTOLOGY);
                                inference_datastructures_inference.set_inference_hl_query(inference, $tautology_problem_query$.getGlobalValue());
                                Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35561");
                              } else {
                                inference_datastructures_inference.set_inference_mt(inference, mt);
                                inference_datastructures_inference.set_inference_el_query(inference, el_query);
                                inference_datastructures_inference.set_inference_hypothetical_bindings(inference, hypothetical_bindings);
                              }
                              if ((NIL != inference_datastructures_inference.new_inference_p(inference))) {
                                thread.resetMultipleValues();
                                {
                                  SubLObject czer_result = inference_czer.inference_canonicalize_ask_memoized(el_query, mt, disjunction_free_el_vars_policy);
                                  SubLObject el_bindings = thread.secondMultipleValue();
                                  SubLObject free_el_vars = thread.thirdMultipleValue();
                                  thread.resetMultipleValues();
                                  if ((NIL != inference_datastructures_problem_query.problem_query_p(czer_result))) {
                                    {
                                      SubLObject hl_query = czer_result;
                                      inference_datastructures_inference.set_inference_hl_query(inference, hl_query);
                                      inference_datastructures_inference.set_inference_el_bindings(inference, el_bindings);
                                      {
                                        SubLObject free_hl_vars = bindings.apply_bindings(el_bindings, free_el_vars);
                                        inference_datastructures_inference.set_inference_free_hl_vars(inference, free_hl_vars);
                                      }
                                      if ((NIL == input_non_explanatory_el_query)) {
                                        inference_datastructures_inference.set_inference_explanatory_subquery(inference, $kw44$ALL);
                                        inference_datastructures_inference.set_inference_non_explanatory_subquery(inference, NIL);
                                      } else {
                                        thread.resetMultipleValues();
                                        {
                                          SubLObject explanatory_czer_result = inference_czer.inference_canonicalize_ask_memoized(explanatory_el_query, mt, disjunction_free_el_vars_policy);
                                          SubLObject explanatory_el_bindings = thread.secondMultipleValue();
                                          SubLObject explanatory_free_el_vars = thread.thirdMultipleValue();
                                          thread.resetMultipleValues();
                                          {
                                            SubLObject explanatory_subquery = explanatory_czer_result;
                                            inference_datastructures_inference.set_inference_explanatory_subquery(inference, explanatory_subquery);
                                          }
                                        }
                                        thread.resetMultipleValues();
                                        {
                                          SubLObject non_explanatory_czer_result = inference_czer.inference_canonicalize_ask_memoized(input_non_explanatory_el_query, mt, disjunction_free_el_vars_policy);
                                          SubLObject non_explanatory_el_bindings = thread.secondMultipleValue();
                                          SubLObject non_explanatory_free_el_vars = thread.thirdMultipleValue();
                                          thread.resetMultipleValues();
                                          {
                                            SubLObject non_explanatory_subquery = non_explanatory_czer_result;
                                            SubLObject non_explanatory_hl_bindings = bindings.apply_bindings(non_explanatory_el_bindings, el_bindings);
                                            inference_datastructures_inference.set_inference_non_explanatory_subquery(inference, bindings.apply_bindings(non_explanatory_hl_bindings, non_explanatory_subquery));
                                          }
                                        }
                                      }
                                    }
                                  } else if (($const45$True == czer_result)) {
                                    inference_datastructures_inference.set_inference_hl_query(inference, $tautology_problem_query$.getGlobalValue());
                                    inference_datastructures_inference.set_inference_status(inference, $kw43$TAUTOLOGY);
                                  } else if (($const46$False == czer_result)) {
                                    inference_datastructures_inference.set_inference_hl_query(inference, $contradiction_problem_query$.getGlobalValue());
                                    inference_datastructures_inference.set_inference_status(inference, $kw47$CONTRADICTION);
                                  } else if (($kw41$ILL_FORMED == czer_result)) {
                                    inference_datastructures_inference.set_inference_hl_query(inference, $contradiction_problem_query$.getGlobalValue());
                                    inference_datastructures_inference.set_inference_status(inference, $kw41$ILL_FORMED);
                                  }
                                }
                              }
                            }
                          }
                        } finally {
                          $preparing_inferenceP$.rebind(_prev_bind_0_2, thread);
                        }
                      }
                      space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    } finally {
                      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_1, thread);
                    }
                  }
                  inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                }
              } finally {
                {
                  SubLObject _prev_bind_0_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                  try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    if (((NIL != local_state)
                         && (NIL == original_memoization_process))) {
                      memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                    }
                  } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                  }
                }
              }
            }
          } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return inference;
    }
  }

  /** Given INPUT-MT, INPUT-EL-QUERY, INPUT-NON-EXPLANATORY-EL-QUERY and HYPOTHESIZE? for some inference,
   determine the MT, EL-QUERY, EXPLANATORY-EL-QUERY and HYPOTHETICAL-BINDINGS to use.
   @return 1 the mt (nil or possibly-mt-p)
   @return 2 the el-query (:TAUTOLOGY or possibly-inference-sentence-p)
   @return 3 the explanatory-el-query (nil or possibly-inference-sentence-p)
   @return 4 the hypothetical-bindings (nil or bindings-p) */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 18625) 
  public static final SubLObject prepare_inference_hl_query_int(SubLObject input_mt, SubLObject input_el_query, SubLObject input_non_explanatory_el_query, SubLObject hypothesizeP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject input_el_query_4 = czer_utilities.unwrap_if_ist_permissive(input_el_query, input_mt);
        SubLObject input_mt_5 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        input_el_query = input_el_query_4;
        input_mt = input_mt_5;
      }
      {
        SubLObject mt = NIL;
        SubLObject el_query = NIL;
        SubLObject explanatory_el_query = NIL;
        SubLObject hypothetical_bindings = NIL;
        SubLObject tautology_justifications = NIL;
        if ((NIL == hypothesizeP)) {
          if ((NIL == input_non_explanatory_el_query)) {
            mt = ((NIL != input_mt) ? ((SubLObject) hlmt_czer.canonicalize_hlmt(input_mt)) : NIL);
            el_query = input_el_query;
            explanatory_el_query = input_el_query;
            hypothetical_bindings = NIL;
            tautology_justifications = NIL;
          } else {
            mt = ((NIL != input_mt) ? ((SubLObject) hlmt_czer.canonicalize_hlmt(input_mt)) : NIL);
            el_query = el_utilities.make_conjunction(list(input_el_query, input_non_explanatory_el_query));
            explanatory_el_query = input_el_query;
            hypothetical_bindings = NIL;
            tautology_justifications = NIL;
          }
        } else {
          thread.resetMultipleValues();
          {
            SubLObject consequent = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35554");
            SubLObject hypothetical_context = thread.secondMultipleValue();
            SubLObject v_bindings = thread.thirdMultipleValue();
            SubLObject failure_reasons = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == hypothetical_context)) {
              mt = ((NIL != input_mt) ? ((SubLObject) hlmt_czer.canonicalize_hlmt(input_mt)) : NIL);
              el_query = $kw43$TAUTOLOGY;
              explanatory_el_query = NIL;
              hypothetical_bindings = NIL;
              tautology_justifications = failure_reasons;
            } else if ((NIL == input_non_explanatory_el_query)) {
              mt = hypothetical_context;
              el_query = consequent;
              explanatory_el_query = consequent;
              hypothetical_bindings = v_bindings;
              tautology_justifications = NIL;
            } else {
              mt = hypothetical_context;
              el_query = el_utilities.make_conjunction(list(consequent, input_non_explanatory_el_query));
              explanatory_el_query = consequent;
              hypothetical_bindings = v_bindings;
              tautology_justifications = NIL;
            }
          }
        }
        return Values.values(mt, el_query, explanatory_el_query, hypothetical_bindings, tautology_justifications);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 22658) 
  public static final SubLObject prepare_inference_hl_query_from_dnf(SubLObject inference, SubLObject input_dnf, SubLObject scoped_vars) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(input_dnf, $sym48$DNF_P);
      checkType(scoped_vars, $sym49$LISTP);
      {
        SubLObject input_mt = inference_datastructures_inference.inference_input_mt(inference);
        SubLObject input_non_explanatory_el_query = inference_datastructures_inference.inference_input_non_explanatory_el_query(inference);
        SubLObject explanatory_dnf = input_dnf;
        SubLObject full_dnf = explanatory_dnf;
        inference_datastructures_inference.set_inference_mt(inference, input_mt);
        inference_datastructures_inference.set_inference_hypothetical_bindings(inference, NIL);
        if ((NIL != input_non_explanatory_el_query)) {
          {
            SubLObject non_explanatory_clauses = clausifier.dnf_operators_out(input_non_explanatory_el_query);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
              if ((NIL == list_utilities.singletonP(non_explanatory_clauses))) {
                Errors.error($str50$Time_to_support_disjunctive___pra);
              }
            }
            {
              SubLObject non_explanatory_dnf = non_explanatory_clauses.first();
              inference_datastructures_inference.set_inference_non_explanatory_subquery(inference, inference_czer.dnf_and_mt_to_hl_query(non_explanatory_dnf, input_mt));
              full_dnf = inference_worker_transformation.nmerge_dnf(el_utilities.copy_clause(explanatory_dnf), non_explanatory_dnf);
            }
          }
        }
        inference_datastructures_inference.set_inference_el_query(inference, NIL);
        inference_datastructures_inference.set_inference_el_bindings(inference, NIL);
        if ((NIL != clauses.empty_clauseP(full_dnf))) {
          inference_datastructures_inference.set_inference_hl_query(inference, $tautology_problem_query$.getGlobalValue());
          inference_datastructures_inference.set_inference_status(inference, $kw43$TAUTOLOGY);
        } else {
          {
            SubLObject hl_query = inference_czer.dnf_and_mt_to_hl_query(full_dnf, input_mt);
            inference_datastructures_inference.set_inference_hl_query(inference, hl_query);
            {
              SubLObject all_free_hl_vars = list_utilities.tree_gather(full_dnf, $sym51$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              SubLObject free_hl_vars = list_utilities.fast_set_difference(all_free_hl_vars, scoped_vars, UNPROVIDED);
              inference_datastructures_inference.set_inference_free_hl_vars(inference, free_hl_vars);
            }
            if ((NIL == input_non_explanatory_el_query)) {
              inference_datastructures_inference.set_inference_explanatory_subquery(inference, $kw44$ALL);
            } else {
              {
                SubLObject explanatory_subquery = inference_czer.dnf_and_mt_to_hl_query(explanatory_dnf, input_mt);
                inference_datastructures_inference.set_inference_explanatory_subquery(inference, explanatory_subquery);
              }
            }
          }
        }
      }
      return inference;
    }
  }

  /** @return listp; a list of strategies in which the root problem of INFERENCE should be
initially active. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 24609) 
  public static final SubLObject inference_initial_relevant_strategies(SubLObject inference) {
    if ((NIL != inference_datastructures_inference.simplest_inference_p(inference))) {
      return inference_tactician.strategy_initial_relevant_strategies(inference_datastructures_inference.simplest_inference_strategy(inference));
    } else {
      Errors.error($str52$can_t_handle_non_simple_inference);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 25073) 
  public static final SubLObject inference_update_dynamic_properties(SubLObject inference, SubLObject new_query_dynamic_properties) {
    checkType(inference, $sym53$CONTINUABLE_INFERENCE_P);
    checkType(new_query_dynamic_properties, $sym54$QUERY_DYNAMIC_PROPERTIES_P);
    if ((NIL != query_dynamic_properties_have_strategically_interesting_extensionP(inference, new_query_dynamic_properties))) {
      checkType(inference, $sym38$SIMPLEST_INFERENCE_P);
      {
        SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        inference_tactician.strategy_note_inference_dynamic_properties_updated(strategy);
      }
    }
    {
      SubLObject new_inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(new_query_dynamic_properties);
      inference_set_dynamic_properties(inference, new_inference_dynamic_properties);
    }
    {
      SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_relevant_problems(inference));
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject problem = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, problem))) {
            if ((NIL != inference_datastructures_problem.valid_problem_p(problem))) {
              inference_datastructures_strategy.set_problem_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(problem);
              inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(problem);
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36451");
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36456");
            }
          }
        }
      }
    }
    inference_datastructures_inference.set_inference_status(inference, $kw55$READY);
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 26566) 
  public static final SubLObject query_dynamic_properties_have_strategically_interesting_extensionP(SubLObject inference, SubLObject new_query_dynamic_properties) {
    {
      SubLObject new_inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(new_query_dynamic_properties);
      SubLObject old_max_proof_depth = inference_datastructures_inference.inference_max_proof_depth(inference);
      SubLObject new_max_proof_depth = inference_datastructures_enumerated_types.inference_properties_max_proof_depth(new_inference_dynamic_properties);
      if ((NIL != depth_cutoff_L(old_max_proof_depth, new_max_proof_depth))) {
        return T;
      }
      {
        SubLObject old_max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
        SubLObject new_max_transformation_depth = inference_datastructures_enumerated_types.inference_properties_max_transformation_depth(new_inference_dynamic_properties);
        if ((NIL != depth_cutoff_L(old_max_transformation_depth, new_max_transformation_depth))) {
          return T;
        }
      }
    }
    {
      SubLObject new_strategy_dynamic_properties = inference_datastructures_enumerated_types.extract_strategy_dynamic_properties(new_query_dynamic_properties);
      SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
      SubLObject old_productivity_limit = inference_datastructures_strategy.strategy_productivity_limit(strategy);
      SubLObject new_productivity_limit = inference_datastructures_enumerated_types.strategy_dynamic_properties_productivity_limit(new_strategy_dynamic_properties);
      if ((NIL != inference_datastructures_enumerated_types.productivity_L(old_productivity_limit, new_productivity_limit))) {
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 28060) 
  public static final SubLObject depth_cutoff_L(SubLObject depth_cutoff_1, SubLObject depth_cutoff_2) {
    if (depth_cutoff_1.isInteger()) {
      if (depth_cutoff_2.isInteger()) {
        return Numbers.numL(depth_cutoff_1, depth_cutoff_2);
      } else {
        return T;
      }
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 28273) 
  public static final SubLObject inference_set_dynamic_properties(SubLObject inference, SubLObject dynamic_properties) {
    checkType(dynamic_properties, $sym56$INFERENCE_DYNAMIC_PROPERTIES_P);
    {
      SubLObject return_type = inference_datastructures_enumerated_types.inference_properties_return_type(dynamic_properties);
      SubLObject answer_language = inference_datastructures_enumerated_types.inference_properties_answer_language(dynamic_properties);
      SubLObject cache_resultsP = inference_datastructures_enumerated_types.inference_properties_cache_inference_resultsP(dynamic_properties);
      SubLObject browsableP = inference_datastructures_enumerated_types.inference_properties_browsableP(dynamic_properties);
      SubLObject continuableP = inference_datastructures_enumerated_types.inference_properties_continuableP(dynamic_properties);
      SubLObject blockP = inference_datastructures_enumerated_types.inference_properties_blockP(dynamic_properties);
      SubLObject max_number = inference_datastructures_enumerated_types.inference_properties_max_number(dynamic_properties);
      SubLObject max_time = inference_datastructures_enumerated_types.inference_properties_max_time(dynamic_properties);
      SubLObject max_step = inference_datastructures_enumerated_types.inference_properties_max_step(dynamic_properties);
      SubLObject inference_mode = inference_datastructures_enumerated_types.inference_properties_mode(dynamic_properties);
      SubLObject forward_max_time = inference_datastructures_enumerated_types.inference_properties_forward_max_time(dynamic_properties);
      SubLObject max_proof_depth = inference_datastructures_enumerated_types.inference_properties_max_proof_depth(dynamic_properties);
      SubLObject max_trans_depth = inference_datastructures_enumerated_types.inference_properties_max_transformation_depth(dynamic_properties);
      SubLObject pad = inference_datastructures_enumerated_types.inference_properties_probably_approximately_done(dynamic_properties);
      SubLObject metrics_template = inference_datastructures_enumerated_types.inference_properties_metrics(dynamic_properties);
      inference_datastructures_inference.set_inference_continuable(inference, continuableP);
      inference_datastructures_inference.set_inference_browsable(inference, browsableP);
      inference_datastructures_inference.set_inference_return_type(inference, return_type);
      inference_datastructures_inference.set_inference_answer_language(inference, answer_language);
      inference_datastructures_inference.set_inference_cache_results(inference, cache_resultsP);
      if ((NIL != blockP)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35783");
      }
      inference_datastructures_inference.set_inference_max_number(inference, max_number);
      inference_datastructures_inference.set_inference_max_time(inference, max_time);
      inference_datastructures_inference.set_inference_max_step(inference, max_step);
      inference_datastructures_inference.set_inference_mode(inference, inference_mode);
      inference_datastructures_inference.set_inference_forward_max_time(inference, forward_max_time);
      inference_datastructures_inference.set_inference_max_proof_depth(inference, max_proof_depth);
      inference_datastructures_inference.set_inference_max_transformation_depth(inference, max_trans_depth);
      inference_datastructures_inference.set_inference_probably_approximately_done(inference, pad);
      inference_datastructures_inference.set_inference_metrics_template(inference, metrics_template);
    }
    return inference;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 30654) 
  public static final SubLObject inference_run(SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(inference, $sym57$READY_INFERENCE_P);
      checkType(inference, $sym38$SIMPLEST_INFERENCE_P);
      inference_analysis.possibly_enqueue_asked_query_from_inference(inference);
      inference_datastructures_inference.set_inference_control_process_to_me(inference);
      inference_datastructures_inference.initialize_inference_time_properties(inference);
      {
        SubLObject suspend_status = $kw58$UNINITIALIZED;
        SubLObject aborted_p = NIL;
        try {
          {
            SubLObject _prev_bind_0 = $within_inference_control_processP$.currentBinding(thread);
            try {
              $within_inference_control_processP$.bind(T, thread);
              {
                SubLObject error_message = NIL;
                if ((NIL != control_vars.$inference_debugP$.getDynamicValue(thread))) {
                  inference_datastructures_inference.set_inference_status(inference, $kw59$RUNNING);
                  suspend_status = simplest_inference_run_handler(inference);
                } else {
                  try {
                    {
                      SubLObject _prev_bind_0_6 = Errors.$error_handler$.currentBinding(thread);
                      try {
                        Errors.$error_handler$.bind(Symbols.symbol_function($sym60$INFERENCE_ERROR_HANDLER), thread);
                        try {
                          inference_datastructures_inference.set_inference_status(inference, $kw59$RUNNING);
                          suspend_status = simplest_inference_run_handler(inference);
                        } catch (Throwable catch_var) {
                          Errors.handleThrowable(catch_var, NIL);
                        }
                      } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_6, thread);
                      }
                    }
                  } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $kw17$INFERENCE_ERROR);
                  }
                }
                if ((NIL != error_message)) {
                  suspend_status = inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message);
                }
              }
            } finally {
              $within_inference_control_processP$.rebind(_prev_bind_0, thread);
            }
          }
        } catch (Throwable ccatch_env_var) {
          aborted_p = Errors.handleThrowable(ccatch_env_var, $kw4$INFERENCE_ABORT_TARGET);
        }
        if ((NIL != aborted_p)) {
          suspend_status = $kw61$ABORT;
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35564");
        }
        if ((NIL != inference_datastructures_inference.valid_inference_p(inference))) {
          inference_suspend(inference, suspend_status);
        }
        return inference;
      }
    }
  }

  /** Notes that INFERENCE is suspended. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 31429) 
  public static final SubLObject inference_suspend(SubLObject inference, SubLObject suspend_status) {
    inference_datastructures_inference.finalize_inference_time_properties(inference);
    inference_datastructures_inference.set_inference_suspend_status(inference, suspend_status);
    inference_datastructures_inference.set_inference_status(inference, $kw62$SUSPENDED);
    inference_datastructures_inference.clear_inference_control_process(inference);
    return inference;
  }

  /** @param PATIENCE nil or non-negative-number-p.
nil means infinite patience, 0 means no patience.
Tries to gracefully interrupt INFERENCE.  Gives up after PATIENCE
seconds and forcefully aborts it instead. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 32372) 
  public static final SubLObject inference_interrupt(SubLObject inference, SubLObject patience) {
    if ((patience == UNPROVIDED)) {
      patience = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      enforceType(inference, $sym68$RUNNING_INFERENCE_P);
      if ((NIL == Threads.valid_process_p(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35753")))) {
        {
          SubLObject error_message = $str69$Inference_control_process_was_kil;
          inference_suspend(inference, inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message));
          return inference;
        }
      }
      if ((NIL == patience)) {
        return inference_interrupt_int(inference);
      } else if (patience.isZero()) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35556");
      } else {
        checkType(patience, $sym70$POSITIVE_NUMBER_P);
        {
          SubLObject my_patience_ran_out_p = NIL;
          SubLObject tag = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11357");
          try {
            {
              SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
              try {
                subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                {
                  SubLObject timer = NIL;
                  try {
                    {
                      SubLObject _prev_bind_0_7 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                      try {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11366");
                        inference_interrupt_int(inference);
                      } finally {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_7, thread);
                      }
                    }
                  } finally {
                    {
                      SubLObject _prev_bind_0_8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                      try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11374");
                      } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                      }
                    }
                  }
                }
              } finally {
                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
              }
            }
          } catch (Throwable ccatch_env_var) {
            my_patience_ran_out_p = Errors.handleThrowable(ccatch_env_var, tag);
          }
          if ((NIL != my_patience_ran_out_p)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35557");
          }
        }
        return inference;
      }
    }
  }

  /** Wait forever for INFERENCE to interrupt itself gracefully. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 33382) 
  public static final SubLObject inference_interrupt_int(SubLObject inference) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35778");
    Threads.process_block();
    return inference;
  }

  /** Immediately forcefully aborts INFERENCE. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 33626) 
  public static final SubLObject inference_abort(SubLObject inference) {
    return inference_interrupt(inference, ZERO_INTEGER);
  }

  /** Immediately forcefully aborts INFERENCE if it is currently running. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 33983) 
  public static final SubLObject inference_abort_if_running(SubLObject inference) {
    if ((NIL != inference_datastructures_inference.running_inference_p(inference))) {
      return inference_abort(inference);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 35508) 
  public static final SubLObject inference_max_number_reachedP(SubLObject inference) {
    {
      SubLObject max_number = inference_datastructures_inference.inference_max_number(inference);
      if ((NIL != max_number)) {
        {
          SubLObject number = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35772");
          if (number.numGE(max_number)) {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 35886) 
  public static final SubLObject inference_max_time_reachedP(SubLObject inference) {
    {
      SubLObject end_time = inference_datastructures_inference.inference_end_internal_real_time(inference);
      if ((NIL != end_time)) {
        return Time.internal_real_time_has_arrivedP(end_time);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 36626) 
  public static final SubLObject inference_max_step_reachedP(SubLObject inference) {
    {
      SubLObject max_step = inference_datastructures_inference.inference_max_step(inference);
      if ((NIL != max_step)) {
        {
          SubLObject step_count = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35779");
          return Numbers.numGE(step_count, max_step);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 36851) 
  public static final SubLObject inference_max_problem_count_reachedP(SubLObject inference) {
    return inference_datastructures_problem_store.problem_store_max_problem_count_reachedP(inference_datastructures_inference.inference_problem_store(inference));
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 37005) 
  public static final SubLObject inference_max_proof_count_reachedP(SubLObject inference) {
    return inference_datastructures_problem_store.problem_store_max_proof_count_reachedP(inference_datastructures_inference.inference_problem_store(inference));
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 37321) 
  public static final SubLObject inference_probably_approximately_doneP(SubLObject inference) {
    if (inference_datastructures_inference.inference_answer_count(inference).isZero()) {
      {
        SubLObject end_time = inference_datastructures_inference.inference_pad_internal_real_time(inference);
        if ((NIL != numeric_date_utilities.internal_real_time_p(end_time))) {
          return Time.internal_real_time_has_arrivedP(end_time);
        }
      }
    }
    return NIL;
  }

  /** Halt conditions are noted by overloading the suspend-status while the inference is still running. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 37778) 
  public static final SubLObject inference_halt_condition_reachedP(SubLObject inference) {
    return inference_datastructures_enumerated_types.inference_halt_condition_p(inference_datastructures_inference.inference_suspend_status(inference));
  }

  /** @return nil or inference-suspend-status-p
Handles the inference-type-independent results; those that can be
determined without knowing the type of INFERENCE.
a NIL return value means that a type-independent result
cannot be determined. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 38018) 
  public static final SubLObject inference_determine_type_independent_result(SubLObject inference) {
    if ((NIL != inference_datastructures_inference.inference_interrupt_signaledP(inference))) {
      return $kw72$INTERRUPT;
    } else if ((NIL != inference_max_number_reachedP(inference))) {
      return $kw64$MAX_NUMBER;
    } else if ((NIL != inference_max_time_reachedP(inference))) {
      return $kw65$MAX_TIME;
    } else if ((NIL != inference_max_step_reachedP(inference))) {
      return $kw66$MAX_STEP;
    } else if ((NIL != inference_max_problem_count_reachedP(inference))) {
      return $kw63$MAX_PROBLEM_COUNT;
    } else if ((NIL != inference_max_proof_count_reachedP(inference))) {
      return $kw73$MAX_PROOF_COUNT;
    } else if ((NIL != inference_probably_approximately_doneP(inference))) {
      return $kw67$PROBABLY_APPROXIMATELY_DONE;
    } else if ((NIL != inference_halt_condition_reachedP(inference))) {
      return inference_datastructures_inference.inference_suspend_status(inference);
    } else {
      return NIL;
    }
  }

  /** The strategy type to use unless there is a better one for a
particular type of inference. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 38985) 
  private static SubLSymbol $default_strategy_type$ = null;

  /** The strategy type that is best suited for removal-only zero-backchain asks
with no number or time cutoffs. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 39188) 
  private static SubLSymbol $exhaustive_removal_strategy_type$ = null;

  /** The strategy type that is best suited for forward inference. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 39361) 
  private static SubLSymbol $forward_strategy_type$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 39477) 
  public static final SubLObject strategy_type_from_sentence_and_static_properties(SubLObject sentence, SubLObject mt, SubLObject static_properties) {
    return strategy_type_from_static_properties(static_properties);
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 39699) 
  public static final SubLObject strategy_type_from_dnf_and_static_properties(SubLObject dnf, SubLObject mt, SubLObject static_properties) {
    return strategy_type_from_static_properties(static_properties);
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 39921) 
  public static final SubLObject strategy_type_from_static_properties(SubLObject static_properties) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != properties_indicate_forward_inferenceP(static_properties))) {
        return $forward_strategy_type$.getDynamicValue(thread);
      } else if ((NIL != inference_datastructures_enumerated_types.balancing_tactician_enabledP())) {
        return ((NIL != inference_datastructures_enumerated_types.problem_store_properties_abduction_allowedP(static_properties)) ? ((SubLObject) inference_abduction_utilities.$abductive_strategy_type$.getDynamicValue(thread)) : $kw76$BALANCING);
      } else if ((NIL != inference_datastructures_enumerated_types.problem_store_properties_abduction_allowedP(static_properties))) {
        return inference_abduction_utilities.$abductive_strategy_type$.getDynamicValue(thread);
      } else if ((NIL != inference_datastructures_enumerated_types.transformation_allowed_by_propertiesP(static_properties))) {
        return $default_strategy_type$.getDynamicValue(thread);
      } else {
        return $exhaustive_removal_strategy_type$.getDynamicValue(thread);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 40628) 
  public static final SubLObject properties_indicate_forward_inferenceP(SubLObject static_properties) {
    {
      SubLObject store = inference_datastructures_enumerated_types.inference_properties_problem_store(static_properties);
      if (((NIL != store)
           && (NIL != inference_datastructures_problem_store.problem_store_forwardP(store)))) {
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 40943) 
  public static final SubLObject inference_permits_transformationP(SubLObject inference) {
    {
      SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
      return makeBoolean(((NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(store))
             && (!(ZERO_INTEGER.eql(inference_datastructures_inference.inference_max_transformation_depth(inference))))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 41197) 
  public static final SubLObject determine_best_strategy_type_for_inference(SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_datastructures_enumerated_types.balancing_tactician_enabledP())) {
        return ((NIL != inference_datastructures_inference.abductive_inference_p(inference)) ? ((SubLObject) inference_abduction_utilities.$abductive_strategy_type$.getDynamicValue(thread)) : $kw76$BALANCING);
      }
      if ((NIL != inference_datastructures_inference.forward_inference_p(inference))) {
        return $forward_strategy_type$.getDynamicValue(thread);
      } else if ((NIL != inference_datastructures_inference.abductive_inference_p(inference))) {
        return inference_abduction_utilities.$abductive_strategy_type$.getDynamicValue(thread);
      } else if (((NIL == inference_permits_transformationP(inference))
           && (NIL == inference_datastructures_inference.inference_max_number(inference))
           && (NIL == inference_datastructures_inference.inference_max_time(inference))
           && (NIL == inference_datastructures_inference.inference_max_step(inference)))) {
        return $exhaustive_removal_strategy_type$.getDynamicValue(thread);
      } else {
        return $default_strategy_type$.getDynamicValue(thread);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 41835) 
  public static final SubLObject consider_switching_strategies(SubLObject inference) {
    checkType(inference, $sym38$SIMPLEST_INFERENCE_P);
    {
      SubLObject best_strategy_type = determine_best_strategy_type_for_inference(inference);
      if ((best_strategy_type != inference_datastructures_strategy.strategy_type(inference_datastructures_inference.simplest_inference_strategy(inference)))) {
        inference_switch_strategies(inference, best_strategy_type);
      }
    }
    return inference;
  }

  /** Causes INFERENCE to switch from its existing strategy to a new strategy of
NEW-STRATEGY-TYPE.  Destroys the old strategy after the switch. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 42214) 
  public static final SubLObject inference_switch_strategies(SubLObject inference, SubLObject new_strategy_type) {
    checkType(inference, $sym38$SIMPLEST_INFERENCE_P);
    return inference;
  }

  /** A meta-strategy which just tells the strategy to
do a bunch of steps in this thread, i.e. handle lots of :do-one-step events,
optionally block, possibly perform a problem store prune,
and halt when done (e.g. resource constraints exhausted)
@return inference-suspend-status-p; the halt-reason. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 43982) 
  public static final SubLObject simplest_inference_run_handler(SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(inference, $sym38$SIMPLEST_INFERENCE_P);
      {
        SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        SubLObject timeout = inference_abort_max_time(inference);
        SubLObject result = NIL;
        SubLObject abort_max_time = timeout;
        if ((NIL != abort_max_time)) {
          {
            SubLObject timed_out = NIL;
            SubLObject tag = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11358");
            try {
              {
                SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                try {
                  subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                  {
                    SubLObject timer = NIL;
                    try {
                      {
                        SubLObject _prev_bind_0_9 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                          subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                          timer = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11367");
                          {
                            SubLObject store_var = store;
                            SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
                            {
                              SubLObject _prev_bind_0_10 = memoization_state.$memoization_state$.currentBinding(thread);
                              try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                {
                                  SubLObject original_memoization_process = NIL;
                                  if (((NIL != local_state)
                                       && (NIL == memoization_state.memoization_state_lock(local_state)))) {
                                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                    {
                                      SubLObject current_proc = Threads.current_process();
                                      if ((NIL == original_memoization_process)) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                      } else {
                                        if ((original_memoization_process != current_proc)) {
                                          Errors.error($str40$Invalid_attempt_to_reuse_memoizat);
                                        }
                                      }
                                    }
                                  }
                                  try {
                                    {
                                      SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                                      {
                                        SubLObject _prev_bind_0_11 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                        try {
                                          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                          {
                                            SubLObject _prev_bind_0_12 = inference_datastructures_problem_store.$problem_store_modification_permittedP$.currentBinding(thread);
                                            try {
                                              inference_datastructures_problem_store.$problem_store_modification_permittedP$.bind(T, thread);
                                              inference_do_forward_propagation(inference);
                                              {
                                                SubLObject padP = NIL;
                                                SubLObject doneP = padP;
                                                while ((NIL == doneP)) {
                                                  possibly_wait_for_inference_to_unblock(inference);
                                                  inference_tactician.strategy_do_one_step(strategy);
                                                  simplest_inference_possibly_prune(inference);
                                                  doneP = makeBoolean(((NIL != padP)
                                                        || (NIL != simplest_inference_doneP(inference))));
                                                }
                                                inference_tactician.strategy_throw_away_uninteresting_set_asides(strategy);
                                                result = simplest_inference_determine_result(inference, padP);
                                                if (($kw72$INTERRUPT == result)) {
                                                  Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35762");
                                                }
                                              }
                                            } finally {
                                              inference_datastructures_problem_store.$problem_store_modification_permittedP$.rebind(_prev_bind_0_12, thread);
                                            }
                                          }
                                          space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                        } finally {
                                          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                                          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_11, thread);
                                        }
                                      }
                                      inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                                    }
                                  } finally {
                                    {
                                      SubLObject _prev_bind_0_13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                      try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        if (((NIL != local_state)
                                             && (NIL == original_memoization_process))) {
                                          memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                      } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                                      }
                                    }
                                  }
                                }
                              } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_10, thread);
                              }
                            }
                          }
                        } finally {
                          subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_9, thread);
                        }
                      }
                    } finally {
                      {
                        SubLObject _prev_bind_0_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                          Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11375");
                        } finally {
                          Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
                        }
                      }
                    }
                  }
                } finally {
                  subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
                }
              }
            } catch (Throwable ccatch_env_var) {
              timed_out = Errors.handleThrowable(ccatch_env_var, tag);
            }
            if ((NIL != timed_out)) {
              result = $kw65$MAX_TIME;
            }
          }
        } else {
          {
            SubLObject store_var = store;
            SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
            {
              SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
              try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                {
                  SubLObject original_memoization_process = NIL;
                  if (((NIL != local_state)
                       && (NIL == memoization_state.memoization_state_lock(local_state)))) {
                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                    {
                      SubLObject current_proc = Threads.current_process();
                      if ((NIL == original_memoization_process)) {
                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                      } else {
                        if ((original_memoization_process != current_proc)) {
                          Errors.error($str40$Invalid_attempt_to_reuse_memoizat);
                        }
                      }
                    }
                  }
                  try {
                    {
                      SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                      {
                        SubLObject _prev_bind_0_15 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        try {
                          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                          {
                            SubLObject _prev_bind_0_16 = inference_datastructures_problem_store.$problem_store_modification_permittedP$.currentBinding(thread);
                            try {
                              inference_datastructures_problem_store.$problem_store_modification_permittedP$.bind(T, thread);
                              inference_do_forward_propagation(inference);
                              {
                                SubLObject padP = NIL;
                                SubLObject doneP = padP;
                                while ((NIL == doneP)) {
                                  possibly_wait_for_inference_to_unblock(inference);
                                  inference_tactician.strategy_do_one_step(strategy);
                                  simplest_inference_possibly_prune(inference);
                                  doneP = makeBoolean(((NIL != padP)
                                        || (NIL != simplest_inference_doneP(inference))));
                                }
                                inference_tactician.strategy_throw_away_uninteresting_set_asides(strategy);
                                result = simplest_inference_determine_result(inference, padP);
                                if (($kw72$INTERRUPT == result)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35763");
                                }
                              }
                            } finally {
                              inference_datastructures_problem_store.$problem_store_modification_permittedP$.rebind(_prev_bind_0_16, thread);
                            }
                          }
                          space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                        } finally {
                          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_15, thread);
                        }
                      }
                      inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                    }
                  } finally {
                    {
                      SubLObject _prev_bind_0_17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                      try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        if (((NIL != local_state)
                             && (NIL == original_memoization_process))) {
                          memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                        }
                      } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                      }
                    }
                  }
                }
              } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((!((($kw77$EXHAUST != result)
                || (NIL != inference_datastructures_inference.inference_continuableP(inference)))))) {
            Errors.error($str78$Non_continuable_inference_should_);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 46047) 
  public static final SubLObject inference_do_forward_propagation(SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject forward_max_time = inference_datastructures_inference.inference_forward_max_time(inference);
        SubLObject mt = inference_datastructures_inference.inference_mt(inference);
        if ((forward_max_time.isInteger()
             && forward_max_time.numG(ZERO_INTEGER))) {
          if ((NIL == inference_datastructures_forward_propagate.forward_propagate_p(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35761")))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35789");
          }
          {
            SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            SubLObject store_var = store;
            SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
            {
              SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
              try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                {
                  SubLObject original_memoization_process = NIL;
                  if (((NIL != local_state)
                       && (NIL == memoization_state.memoization_state_lock(local_state)))) {
                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                    {
                      SubLObject current_proc = Threads.current_process();
                      if ((NIL == original_memoization_process)) {
                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                      } else {
                        if ((original_memoization_process != current_proc)) {
                          Errors.error($str40$Invalid_attempt_to_reuse_memoizat);
                        }
                      }
                    }
                  }
                  try {
                    {
                      SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                      {
                        SubLObject _prev_bind_0_18 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        try {
                          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 80");
                          space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                        } finally {
                          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_18, thread);
                        }
                      }
                      inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                    }
                  } finally {
                    {
                      SubLObject _prev_bind_0_19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                      try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        if (((NIL != local_state)
                             && (NIL == original_memoization_process))) {
                          memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                        }
                      } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                      }
                    }
                  }
                }
              } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 46675) 
  public static final SubLObject simplest_inference_doneP(SubLObject inference) {
    if ((NIL != simplest_inference_exhaustedP(inference))) {
      return T;
    } else {
      return list_utilities.sublisp_boolean(inference_determine_type_independent_result(inference));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 46874) 
  public static final SubLObject possibly_wait_for_inference_to_unblock(SubLObject inference) {
    if ((NIL != inference_datastructures_inference.inference_blockingP(inference))) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35568");
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 47033) 
  public static final SubLObject simplest_inference_possibly_prune(SubLObject inference) {
    if (((NIL != inference_max_problem_count_reachedP(inference))
        || (NIL != inference_max_proof_count_reachedP(inference))
        || (NIL != inference_prune_frequency_reachedP(inference)))) {
      if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35558"))) {
        {
          SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
          Errors.error($str79$Crazy_amount_of_problems___a__in_, inference_datastructures_problem_store.problem_store_problem_count(store), store);
        }
      }
      {
        SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35461");
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 47689) 
  public static final SubLObject inference_prune_frequency_reachedP(SubLObject inference) {
    return NIL;
  }

  /** @return nil or inference-suspend-status-p,
nil indicates it's not time to suspend yet (still more work to do) */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 47859) 
  public static final SubLObject simplest_inference_determine_result(SubLObject inference, SubLObject padP) {
    if ((NIL != padP)) {
      return $kw67$PROBABLY_APPROXIMATELY_DONE;
    }
    {
      SubLObject result = inference_determine_type_independent_result(inference);
      if ((NIL != result)) {
        return result;
      }
    }
    if ((NIL == simplest_inference_exhaustedP(inference))) {
      return NIL;
    }
    if ((NIL != simplest_inference_continuation_possibleP(inference))) {
      return $kw77$EXHAUST;
    } else {
      return $kw80$EXHAUST_TOTAL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 48392) 
  public static final SubLObject simplest_inference_continuation_possibleP(SubLObject inference) {
    {
      SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
      return inference_tactician.strategy_continuation_possibleP(strategy);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 48579) 
  public static final SubLObject simplest_inference_exhaustedP(SubLObject inference) {
    {
      SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
      return inference_tactician.strategy_doneP(strategy);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 48929) 
  public static final SubLObject inference_note_proof(SubLObject inference, SubLObject proof) {
    if ((NIL == new_inference_answer_from_proof(inference, proof))) {
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 49821) 
  public static final SubLObject inference_note_no_good(SubLObject inference) {
    return NIL;
  }

  /** @return inference-answer-p or NIL */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 50037) 
  public static final SubLObject new_inference_answer_from_proof(SubLObject inference, SubLObject proof) {
    checkType(inference, $sym30$INFERENCE_P);
    checkType(proof, $sym81$PROOF_P);
    inference_worker.perform_lazy_proof_rejection(proof, inference);
    if ((NIL != inference_datastructures_proof.proof_provenP(proof))) {
      {
        SubLObject answer_bindings = inference_answer_bindings_from_proof(proof, inference);
        if ((NIL == inference_disallows_answer_from_bindingsP(inference, answer_bindings))) {
          {
            SubLObject answer = NIL;
            if ((NIL != inference_datastructures_inference.inference_compute_answer_justificationsP(inference))) {
              {
                SubLObject hl_justification = inference_all_explanatory_proof_supports(inference, proof);
                SubLObject answer_justification = inference_datastructures_inference.find_or_create_inference_answer_justification(inference, answer_bindings, hl_justification);
                answer = inference_datastructures_inference.inference_answer_justification_answer(answer_justification);
                inference_datastructures_inference.add_inference_answer_justification_proof(answer_justification, proof);
              }
            } else {
              answer = inference_datastructures_inference.find_or_create_inference_answer(inference, answer_bindings);
            }
            perform_inference_answer_proof_analysis(answer, proof);
            inference_worker.possibly_note_proof_processed(proof);
            return answer;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 51267) 
  public static final SubLObject inference_disallows_answer_from_bindingsP(SubLObject inference, SubLObject answer_bindings) {
    if ((NIL == inference_datastructures_inference.inference_allow_indeterminate_resultsP(inference))) {
      if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35567"))) {
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 52452) 
  public static final SubLObject inference_all_explanatory_proof_supports(SubLObject inference, SubLObject proof) {
    {
      SubLObject all_subproofs = inference_datastructures_proof.all_proof_subproofs(proof);
      SubLObject non_explanatory_subproofs = inference_worker.inference_proof_non_explanatory_subproofs(inference, proof);
      SubLObject all_supports = NIL;
      SubLObject cdolist_list_var = all_subproofs;
      SubLObject subproof = NIL;
      for (subproof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subproof = cdolist_list_var.first()) {
        if ((NIL == subl_promotions.memberP(subproof, non_explanatory_subproofs, UNPROVIDED, UNPROVIDED))) {
          {
            SubLObject supports = inference_datastructures_proof.proof_supports(subproof);
            SubLObject cdolist_list_var_20 = supports;
            SubLObject support = NIL;
            for (support = cdolist_list_var_20.first(); (NIL != cdolist_list_var_20); cdolist_list_var_20 = cdolist_list_var_20.rest(), support = cdolist_list_var_20.first()) {
              {
                SubLObject item_var = support;
                if ((NIL == conses_high.member(item_var, all_supports, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                  all_supports = cons(item_var, all_supports);
                }
              }
            }
          }
        }
      }
      all_supports = arguments.canonicalize_hl_justification(all_supports);
      return all_supports;
    }
  }

  /** @return bindings which map INFERENCE's EL variables -> answers */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 53217) 
  public static final SubLObject inference_answer_bindings_from_proof(SubLObject proof, SubLObject inference) {
    {
      SubLObject all_hl_bindings = inference_hl_bindings_from_proof(proof, inference);
      SubLObject hl_bindings = filter_out_uninteresting_bindings(all_hl_bindings, inference_datastructures_inference.inference_free_hl_vars(inference));
      SubLObject all_el_bindings = inference_datastructures_inference.inference_el_bindings(inference);
      SubLObject free_el_vars = inference_datastructures_inference.inference_free_el_vars(inference);
      SubLObject el_bindings = filter_out_uninteresting_bindings(all_el_bindings, free_el_vars);
      SubLObject disjunction_free_el_vars_policy = inference_datastructures_inference.inference_disjunction_free_el_vars_policy(inference);
      SubLObject answer_bindings = ((NIL != el_bindings) ? ((SubLObject) compose_el_answer_bindings(el_bindings, hl_bindings, free_el_vars, disjunction_free_el_vars_policy)) : hl_bindings);
      return answer_bindings;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 54404) 
  public static final SubLObject filter_out_uninteresting_bindings(SubLObject v_bindings, SubLObject interesting_variables) {
    if ((NIL != all_variables_in_bindings_interestingP(v_bindings, interesting_variables))) {
      return v_bindings;
    } else {
      {
        SubLObject interesting_bindings = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
          {
            SubLObject datum = binding;
            SubLObject current = datum;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list82);
            variable = current.first();
            current = current.rest();
            value = current;
            if ((NIL != subl_promotions.memberP(variable, interesting_variables, UNPROVIDED, UNPROVIDED))) {
              interesting_bindings = cons(binding, interesting_bindings);
            }
          }
        }
        interesting_bindings = Sequences.nreverse(interesting_bindings);
        return interesting_bindings;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 54930) 
  public static final SubLObject all_variables_in_bindings_interestingP(SubLObject v_bindings, SubLObject interesting_variables) {
    {
      SubLObject cdolist_list_var = v_bindings;
      SubLObject binding = NIL;
      for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
        {
          SubLObject datum = binding;
          SubLObject current = datum;
          SubLObject variable = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list82);
          variable = current.first();
          current = current.rest();
          value = current;
          if ((NIL == subl_promotions.memberP(variable, interesting_variables, UNPROVIDED, UNPROVIDED))) {
            return NIL;
          }
        }
      }
    }
    return T;
  }

  /** @param EL-BINDINGS; EL variables -> HL variables
   @param HL-BINDINGS; HL variables -> answers
   @param FREE-EL-VARS; free EL variables in display preference order
   @param FREE-EL-VARS-POLICY; the policy for handling free el variables in disjunctions
   @return bindings-p; EL variables -> answers.
   Signals an error if the range of EL-BINDINGS and the domain of HL-BINDINGS are not
   consistent under FREE-EL-VARS-POLICY. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 55201) 
  public static final SubLObject compose_el_answer_bindings(SubLObject el_bindings, SubLObject hl_bindings, SubLObject free_el_vars, SubLObject free_el_vars_policy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (($kw84$COMPUTE_UNION != free_el_vars_policy)) {
        {
          SubLObject hl_vars1 = Mapping.mapcar(Symbols.symbol_function($sym85$VARIABLE_BINDING_VALUE), el_bindings);
          SubLObject hl_vars2 = Mapping.mapcar(Symbols.symbol_function($sym86$VARIABLE_BINDING_VARIABLE), hl_bindings);
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((NIL == list_utilities.sets_equalP(hl_vars1, hl_vars2, UNPROVIDED))) {
              Errors.error($str87$Expected_a_one_to_one_match_betwe, el_bindings, hl_bindings);
            }
          }
        }
      }
      {
        SubLObject el_answer_bindings = bindings.compose_bindings(el_bindings, hl_bindings);
        el_answer_bindings = bindings.stable_sort_bindings(el_answer_bindings, free_el_vars);
        return el_answer_bindings;
      }
    }
  }

  /** @return bindings which map INFERENCE's variables -> answers */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 56261) 
  public static final SubLObject inference_hl_bindings_from_proof(SubLObject proof, SubLObject inference) {
    {
      SubLObject proof_hl_bindings = inference_datastructures_proof.proof_bindings(proof);
      SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference);
      SubLObject mapped_root_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(answer_link);
      SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_root_problem);
      SubLObject hl_bindings = bindings.transfer_variable_map_to_bindings(variable_map, proof_hl_bindings);
      return hl_bindings;
    }
  }

  /** Once an inference has achieved this many proofs, we consider pruning processed proofs. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 56866) 
  public static SubLSymbol $processed_proof_pruning_initial_threshold$ = null;

  /** After the initial pruning threshold is met, we prune processed proofs again every time we get this many new proofs. */
  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 57207) 
  public static SubLSymbol $processed_proof_pruning_frequency$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 57971) 
  public static final SubLObject inference_possibly_prune_processed_proofs(SubLObject inference) {
    {
      SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
      SubLObject total_pruned = ZERO_INTEGER;
      if ((NIL != inference_datastructures_problem_store.problem_store_allows_proof_processingP(store))) {
        if (((NIL != cyc_testing.testing_real_time_pruningP())
            || ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35559"))
               && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35560"))))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35790");
          if ((NIL != inference_datastructures_enumerated_types.balancing_tactician_enabledP())) {
            {
              SubLObject prune_count = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35263");
              total_pruned = Numbers.add(total_pruned, prune_count);
              if (prune_count.isPositive()) {
                total_pruned = Numbers.add(total_pruned, Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35329"));
              }
            }
          } else {
            total_pruned = Numbers.add(total_pruned, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35262"));
          }
        }
      }
      return total_pruned;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategist.lisp", position = 58975) 
  public static final SubLObject perform_inference_answer_proof_analysis(SubLObject answer, SubLObject proof) {
    {
      SubLObject subproofs = inference_datastructures_proof.all_proof_subproofs(proof);
      SubLObject rules = NIL;
      SubLObject cdolist_list_var = subproofs;
      SubLObject subproof = NIL;
      for (subproof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subproof = cdolist_list_var.first()) {
        if ((NIL != inference_worker_transformation.generalized_transformation_proof_p(subproof))) {
          {
            SubLObject store = inference_datastructures_proof.proof_store(proof);
            SubLObject rule = inference_worker_transformation.generalized_transformation_proof_rule_assertion(subproof);
            SubLObject item_var = rule;
            if ((NIL == conses_high.member(item_var, rules, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
              rules = cons(item_var, rules);
            }
            inference_datastructures_problem_store.problem_store_note_transformation_rule_success(store, rule);
          }
        }
      }
      inference_analysis.note_inference_answer_proof_rules(rules);
    }
    return NIL;
  }

  public static final SubLObject declare_inference_strategist_file() {
    declareMacro(myName, "catch_inference_abort", "CATCH-INFERENCE-ABORT");
    declareFunction(myName, "signal_inference_control_process_abort", "SIGNAL-INFERENCE-CONTROL-PROCESS-ABORT", 0, 0, false);
    declareFunction(myName, "query_abort", "QUERY-ABORT", 0, 0, false);
    declareFunction(myName, "query_interrupt", "QUERY-INTERRUPT", 0, 1, false);
    declareFunction(myName, "query_interrupt_int", "QUERY-INTERRUPT-INT", 3, 0, false);
    declareMacro(myName, "catch_inference_error", "CATCH-INFERENCE-ERROR");
    declareMacro(myName, "with_inference_error_handling", "WITH-INFERENCE-ERROR-HANDLING");
    declareFunction(myName, "inference_error_handler", "INFERENCE-ERROR-HANDLER", 0, 0, false);
    declareMacro(myName, "with_inference_max_time_timeout", "WITH-INFERENCE-MAX-TIME-TIMEOUT");
    declareFunction(myName, "inference_abort_max_time", "INFERENCE-ABORT-MAX-TIME", 1, 0, false);
    declareFunction(myName, "explicify_inference_mode_defaults", "EXPLICIFY-INFERENCE-MODE-DEFAULTS", 1, 0, false);
    declareFunction(myName, "implicify_inference_mode_defaults", "IMPLICIFY-INFERENCE-MODE-DEFAULTS", 1, 0, false);
    declareFunction(myName, "query_property_value", "QUERY-PROPERTY-VALUE", 2, 0, false);
    declareFunction(myName, "strengthen_query_properties_using_inference", "STRENGTHEN-QUERY-PROPERTIES-USING-INFERENCE", 1, 0, false);
    declareFunction(myName, "inference_prepare", "INFERENCE-PREPARE", 3, 0, false);
    declareFunction(myName, "inference_prepare_from_dnf", "INFERENCE-PREPARE-FROM-DNF", 3, 0, false);
    declareFunction(myName, "inference_prepare_int", "INFERENCE-PREPARE-INT", 1, 0, false);
    declareFunction(myName, "simplest_inference_prepare", "SIMPLEST-INFERENCE-PREPARE", 1, 0, false);
    declareFunction(myName, "simplest_inference_prepare_new", "SIMPLEST-INFERENCE-PREPARE-NEW", 8, 0, false);
    declareFunction(myName, "simplest_inference_prepare_new_from_dnf", "SIMPLEST-INFERENCE-PREPARE-NEW-FROM-DNF", 7, 0, false);
    declareFunction(myName, "note_inference_tautology_justification", "NOTE-INFERENCE-TAUTOLOGY-JUSTIFICATION", 2, 0, false);
    declareFunction(myName, "preparing_inferenceP", "PREPARING-INFERENCE?", 0, 0, false);
    declareFunction(myName, "prepare_inference_hl_query", "PREPARE-INFERENCE-HL-QUERY", 3, 0, false);
    declareFunction(myName, "prepare_inference_hl_query_int", "PREPARE-INFERENCE-HL-QUERY-INT", 4, 0, false);
    declareFunction(myName, "hypothesize_antecedent", "HYPOTHESIZE-ANTECEDENT", 2, 0, false);
    declareFunction(myName, "inference_conditional_sentence_p", "INFERENCE-CONDITIONAL-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "inference_possibly_simplify_conditional_sentence", "INFERENCE-POSSIBLY-SIMPLIFY-CONDITIONAL-SENTENCE", 1, 0, false);
    declareFunction(myName, "prepare_inference_hl_query_from_dnf", "PREPARE-INFERENCE-HL-QUERY-FROM-DNF", 3, 0, false);
    declareFunction(myName, "inference_initial_relevant_strategies", "INFERENCE-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
    declareFunction(myName, "inference_update_dynamic_properties", "INFERENCE-UPDATE-DYNAMIC-PROPERTIES", 2, 0, false);
    declareFunction(myName, "query_dynamic_properties_have_strategically_interesting_extensionP", "QUERY-DYNAMIC-PROPERTIES-HAVE-STRATEGICALLY-INTERESTING-EXTENSION?", 2, 0, false);
    declareFunction(myName, "depth_cutoff_L", "DEPTH-CUTOFF-<", 2, 0, false);
    declareFunction(myName, "inference_set_dynamic_properties", "INFERENCE-SET-DYNAMIC-PROPERTIES", 2, 0, false);
    declareFunction(myName, "inference_run", "INFERENCE-RUN", 1, 0, false);
    declareFunction(myName, "inference_suspend", "INFERENCE-SUSPEND", 2, 0, false);
    declareFunction(myName, "inference_suspend_due_to_max_problem_count", "INFERENCE-SUSPEND-DUE-TO-MAX-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "inference_suspend_due_to_max_number", "INFERENCE-SUSPEND-DUE-TO-MAX-NUMBER", 1, 0, false);
    declareFunction(myName, "inference_suspend_due_to_max_time", "INFERENCE-SUSPEND-DUE-TO-MAX-TIME", 1, 0, false);
    declareFunction(myName, "inference_suspend_due_to_max_step", "INFERENCE-SUSPEND-DUE-TO-MAX-STEP", 1, 0, false);
    declareFunction(myName, "inference_suspend_due_to_pad", "INFERENCE-SUSPEND-DUE-TO-PAD", 1, 0, false);
    declareFunction(myName, "inference_interrupt", "INFERENCE-INTERRUPT", 1, 1, false);
    declareFunction(myName, "inference_interrupt_int", "INFERENCE-INTERRUPT-INT", 1, 0, false);
    declareFunction(myName, "inference_abort", "INFERENCE-ABORT", 1, 0, false);
    declareFunction(myName, "inference_abort_after_delay", "INFERENCE-ABORT-AFTER-DELAY", 1, 1, false);
    declareFunction(myName, "inference_abort_if_running", "INFERENCE-ABORT-IF-RUNNING", 1, 0, false);
    declareFunction(myName, "abort_current_controlling_inference", "ABORT-CURRENT-CONTROLLING-INFERENCE", 0, 0, false);
    declareFunction(myName, "inference_abort_int", "INFERENCE-ABORT-INT", 1, 0, false);
    declareFunction(myName, "wait_for_inference_to_unblock", "WAIT-FOR-INFERENCE-TO-UNBLOCK", 0, 0, false);
    declareFunction(myName, "signal_inference_to_unblock", "SIGNAL-INFERENCE-TO-UNBLOCK", 1, 0, false);
    declareFunction(myName, "signal_inference_to_finish", "SIGNAL-INFERENCE-TO-FINISH", 1, 0, false);
    declareFunction(myName, "inference_max_number_reachedP", "INFERENCE-MAX-NUMBER-REACHED?", 1, 0, false);
    declareFunction(myName, "inference_max_time_reachedP", "INFERENCE-MAX-TIME-REACHED?", 1, 0, false);
    declareFunction(myName, "current_controlling_inference_max_time_reachedP", "CURRENT-CONTROLLING-INFERENCE-MAX-TIME-REACHED?", 0, 0, false);
    declareFunction(myName, "current_controlling_inference_time_remaining", "CURRENT-CONTROLLING-INFERENCE-TIME-REMAINING", 0, 0, false);
    declareFunction(myName, "inference_max_step_reachedP", "INFERENCE-MAX-STEP-REACHED?", 1, 0, false);
    declareFunction(myName, "inference_max_problem_count_reachedP", "INFERENCE-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
    declareFunction(myName, "inference_max_proof_count_reachedP", "INFERENCE-MAX-PROOF-COUNT-REACHED?", 1, 0, false);
    declareFunction(myName, "inference_crazy_max_problem_count_reachedP", "INFERENCE-CRAZY-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
    declareFunction(myName, "inference_probably_approximately_doneP", "INFERENCE-PROBABLY-APPROXIMATELY-DONE?", 1, 0, false);
    declareFunction(myName, "inference_halt_condition_reachedP", "INFERENCE-HALT-CONDITION-REACHED?", 1, 0, false);
    declareFunction(myName, "inference_determine_type_independent_result", "INFERENCE-DETERMINE-TYPE-INDEPENDENT-RESULT", 1, 0, false);
    declareFunction(myName, "strategy_type_from_sentence_and_static_properties", "STRATEGY-TYPE-FROM-SENTENCE-AND-STATIC-PROPERTIES", 3, 0, false);
    declareFunction(myName, "strategy_type_from_dnf_and_static_properties", "STRATEGY-TYPE-FROM-DNF-AND-STATIC-PROPERTIES", 3, 0, false);
    declareFunction(myName, "strategy_type_from_static_properties", "STRATEGY-TYPE-FROM-STATIC-PROPERTIES", 1, 0, false);
    declareFunction(myName, "properties_indicate_forward_inferenceP", "PROPERTIES-INDICATE-FORWARD-INFERENCE?", 1, 0, false);
    declareFunction(myName, "inference_permits_transformationP", "INFERENCE-PERMITS-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "determine_best_strategy_type_for_inference", "DETERMINE-BEST-STRATEGY-TYPE-FOR-INFERENCE", 1, 0, false);
    declareFunction(myName, "consider_switching_strategies", "CONSIDER-SWITCHING-STRATEGIES", 1, 0, false);
    declareFunction(myName, "inference_switch_strategies", "INFERENCE-SWITCH-STRATEGIES", 2, 0, false);
    declareFunction(myName, "simplest_inference_run_handler", "SIMPLEST-INFERENCE-RUN-HANDLER", 1, 0, false);
    declareFunction(myName, "inference_do_forward_propagation", "INFERENCE-DO-FORWARD-PROPAGATION", 1, 0, false);
    declareFunction(myName, "simplest_inference_doneP", "SIMPLEST-INFERENCE-DONE?", 1, 0, false);
    declareFunction(myName, "possibly_wait_for_inference_to_unblock", "POSSIBLY-WAIT-FOR-INFERENCE-TO-UNBLOCK", 1, 0, false);
    declareFunction(myName, "simplest_inference_possibly_prune", "SIMPLEST-INFERENCE-POSSIBLY-PRUNE", 1, 0, false);
    declareFunction(myName, "inference_prune_frequency_reachedP", "INFERENCE-PRUNE-FREQUENCY-REACHED?", 1, 0, false);
    declareFunction(myName, "simplest_inference_determine_result", "SIMPLEST-INFERENCE-DETERMINE-RESULT", 2, 0, false);
    declareFunction(myName, "simplest_inference_continuation_possibleP", "SIMPLEST-INFERENCE-CONTINUATION-POSSIBLE?", 1, 0, false);
    declareFunction(myName, "simplest_inference_exhaustedP", "SIMPLEST-INFERENCE-EXHAUSTED?", 1, 0, false);
    declareFunction(myName, "simplest_inference_totally_exhaustedP", "SIMPLEST-INFERENCE-TOTALLY-EXHAUSTED?", 1, 0, false);
    declareFunction(myName, "inference_note_proof", "INFERENCE-NOTE-PROOF", 2, 0, false);
    declareFunction(myName, "inference_note_no_good", "INFERENCE-NOTE-NO-GOOD", 1, 0, false);
    declareFunction(myName, "new_inference_answer_from_proof", "NEW-INFERENCE-ANSWER-FROM-PROOF", 2, 0, false);
    declareFunction(myName, "inference_disallows_answer_from_bindingsP", "INFERENCE-DISALLOWS-ANSWER-FROM-BINDINGS?", 2, 0, false);
    declareFunction(myName, "inference_disallows_answer_from_proofP", "INFERENCE-DISALLOWS-ANSWER-FROM-PROOF?", 2, 0, false);
    declareFunction(myName, "some_answer_bindings_are_indeterminateP", "SOME-ANSWER-BINDINGS-ARE-INDETERMINATE?", 1, 0, false);
    declareFunction(myName, "some_answer_bindings_are_hlP", "SOME-ANSWER-BINDINGS-ARE-HL?", 1, 0, false);
    declareFunction(myName, "term_requires_hl_language", "TERM-REQUIRES-HL-LANGUAGE", 1, 0, false);
    declareFunction(myName, "inference_all_explanatory_proof_supports", "INFERENCE-ALL-EXPLANATORY-PROOF-SUPPORTS", 2, 0, false);
    declareFunction(myName, "inference_answer_bindings_from_proof", "INFERENCE-ANSWER-BINDINGS-FROM-PROOF", 2, 0, false);
    declareFunction(myName, "filter_out_uninteresting_bindings", "FILTER-OUT-UNINTERESTING-BINDINGS", 2, 0, false);
    declareFunction(myName, "all_variables_in_bindings_interestingP", "ALL-VARIABLES-IN-BINDINGS-INTERESTING?", 2, 0, false);
    declareFunction(myName, "compose_el_answer_bindings", "COMPOSE-EL-ANSWER-BINDINGS", 4, 0, false);
    declareFunction(myName, "inference_hl_bindings_from_proof", "INFERENCE-HL-BINDINGS-FROM-PROOF", 2, 0, false);
    declareFunction(myName, "inference_processed_proof_pruning_initial_threshold_metP", "INFERENCE-PROCESSED-PROOF-PRUNING-INITIAL-THRESHOLD-MET?", 1, 0, false);
    declareFunction(myName, "inference_processed_proof_pruning_variable_threshold_metP", "INFERENCE-PROCESSED-PROOF-PRUNING-VARIABLE-THRESHOLD-MET?", 1, 0, false);
    declareFunction(myName, "inference_possibly_prune_processed_proofs", "INFERENCE-POSSIBLY-PRUNE-PROCESSED-PROOFS", 1, 0, false);
    declareFunction(myName, "perform_inference_answer_proof_analysis", "PERFORM-INFERENCE-ANSWER-PROOF-ANALYSIS", 2, 0, false);
    declareFunction(myName, "cache_inference_answer", "CACHE-INFERENCE-ANSWER", 1, 0, false);
    declareFunction(myName, "cache_proof", "CACHE-PROOF", 1, 0, false);
    declareFunction(myName, "cache_proof_supports", "CACHE-PROOF-SUPPORTS", 1, 0, false);
    declareFunction(myName, "add_deduction_for_proof", "ADD-DEDUCTION-FOR-PROOF", 2, 0, false);
    declareMacro(myName, "with_query_abort_timeout", "WITH-QUERY-ABORT-TIMEOUT");
    declareFunction(myName, "with_query_abort_timeout_start_timer", "WITH-QUERY-ABORT-TIMEOUT-START-TIMER", 1, 0, false);
    declareFunction(myName, "with_query_abort_timeout_stop_timer", "WITH-QUERY-ABORT-TIMEOUT-STOP-TIMER", 1, 0, false);
    declareFunction(myName, "with_query_abort_timeout_timer_thread", "WITH-QUERY-ABORT-TIMEOUT-TIMER-THREAD", 4, 0, false);
    declareFunction(myName, "with_query_abort_timeout_signal_query_abort_timeout", "WITH-QUERY-ABORT-TIMEOUT-SIGNAL-QUERY-ABORT-TIMEOUT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_strategist_file() {
    $within_inference_control_processP$ = defparameter("*WITHIN-INFERENCE-CONTROL-PROCESS?*", NIL);
    $inference_max_time_timeout_enabledP$ = defparameter("*INFERENCE-MAX-TIME-TIMEOUT-ENABLED?*", T);
    $tautology_problem_query$ = deflexical("*TAUTOLOGY-PROBLEM-QUERY*", $list39);
    $contradiction_problem_query$ = deflexical("*CONTRADICTION-PROBLEM-QUERY*", NIL);
    $preparing_inferenceP$ = defparameter("*PREPARING-INFERENCE?*", NIL);
    $default_strategy_type$ = defvar("*DEFAULT-STRATEGY-TYPE*", $kw74$HEURISTIC_BALANCED);
    $exhaustive_removal_strategy_type$ = defvar("*EXHAUSTIVE-REMOVAL-STRATEGY-TYPE*", $kw75$REMOVAL);
    $forward_strategy_type$ = defvar("*FORWARD-STRATEGY-TYPE*", $kw75$REMOVAL);
    $processed_proof_pruning_initial_threshold$ = defparameter("*PROCESSED-PROOF-PRUNING-INITIAL-THRESHOLD*", $int88$200);
    $processed_proof_pruning_frequency$ = defparameter("*PROCESSED-PROOF-PRUNING-FREQUENCY*", $int89$50);
    return NIL;
  }

  public static final SubLObject setup_inference_strategist_file() {
        utilities_macros.note_funcall_helper_function($sym12$QUERY_INTERRUPT_INT);
    access_macros.register_macro_helper($sym98$WITH_QUERY_ABORT_TIMEOUT_START_TIMER, $sym100$WITH_QUERY_ABORT_TIMEOUT);
    access_macros.register_macro_helper($sym99$WITH_QUERY_ABORT_TIMEOUT_STOP_TIMER, $sym100$WITH_QUERY_ABORT_TIMEOUT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("SUSPEND-STATUS-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$ABORTED_P = makeUninternedSymbol("ABORTED-P");
  public static final SubLSymbol $sym2$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym3$CCATCH = makeSymbol("CCATCH");
  public static final SubLSymbol $kw4$INFERENCE_ABORT_TARGET = makeKeyword("INFERENCE-ABORT-TARGET");
  public static final SubLList $list5 = list(list(makeSymbol("*WITHIN-INFERENCE-CONTROL-PROCESS?*"), T));
  public static final SubLSymbol $sym6$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym7$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list8 = list(makeKeyword("ABORT"));
  public static final SubLList $list9 = list(list(makeSymbol("QUERY-ABORT")));
  public static final SubLSymbol $kw10$NOT_ABORTED = makeKeyword("NOT-ABORTED");
  public static final SubLString $str11$Interruptor = makeString("Interruptor");
  public static final SubLSymbol $sym12$QUERY_INTERRUPT_INT = makeSymbol("QUERY-INTERRUPT-INT");
  public static final SubLSymbol $sym13$ERROR_MESSAGE = makeUninternedSymbol("ERROR-MESSAGE");
  public static final SubLSymbol $sym14$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym15$_INFERENCE_DEBUG__ = makeSymbol("*INFERENCE-DEBUG?*");
  public static final SubLSymbol $sym16$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $kw17$INFERENCE_ERROR = makeKeyword("INFERENCE-ERROR");
  public static final SubLSymbol $sym18$WITH_INFERENCE_ERROR_HANDLING = makeSymbol("WITH-INFERENCE-ERROR-HANDLING");
  public static final SubLSymbol $sym19$NEW_INFERENCE_ERROR_SUSPEND_STATUS = makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS");
  public static final SubLSymbol $sym20$WITH_ERROR_HANDLER = makeSymbol("WITH-ERROR-HANDLER");
  public static final SubLList $list21 = list(makeSymbol("FUNCTION"), makeSymbol("INFERENCE-ERROR-HANDLER"));
  public static final SubLList $list22 = list(list(makeSymbol("HALT-REASON-VAR"), makeSymbol("TIMEOUT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym23$ABORT_MAX_TIME = makeUninternedSymbol("ABORT-MAX-TIME");
  public static final SubLSymbol $sym24$TIMED_OUT = makeUninternedSymbol("TIMED-OUT");
  public static final SubLSymbol $sym25$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym26$WITH_TIMEOUT = makeSymbol("WITH-TIMEOUT");
  public static final SubLList $list27 = list(makeKeyword("MAX-TIME"));
  public static final SubLSymbol $kw28$CUSTOM = makeKeyword("CUSTOM");
  public static final SubLSymbol $kw29$UNSPECIFIED = makeKeyword("UNSPECIFIED");
  public static final SubLSymbol $sym30$INFERENCE_P = makeSymbol("INFERENCE-P");
  public static final SubLSymbol $kw31$SUPPORTS = makeKeyword("SUPPORTS");
  public static final SubLSymbol $kw32$BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
  public static final SubLSymbol $kw33$HL = makeKeyword("HL");
  public static final SubLSymbol $kw34$PROOF = makeKeyword("PROOF");
  public static final SubLSymbol $sym35$NEW_INFERENCE_P = makeSymbol("NEW-INFERENCE-P");
  public static final SubLString $str36$can_t_handle_non_simplest_inferen = makeString("can't handle non-simplest inferences like ~a");
  public static final SubLSymbol $kw37$PREPARED = makeKeyword("PREPARED");
  public static final SubLSymbol $sym38$SIMPLEST_INFERENCE_P = makeSymbol("SIMPLEST-INFERENCE-P");
  public static final SubLList $list39 = list(list(NIL, NIL));
  public static final SubLString $str40$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLSymbol $kw41$ILL_FORMED = makeKeyword("ILL-FORMED");
  public static final SubLSymbol $kw42$NOT_AN_IMPLICATION = makeKeyword("NOT-AN-IMPLICATION");
  public static final SubLSymbol $kw43$TAUTOLOGY = makeKeyword("TAUTOLOGY");
  public static final SubLSymbol $kw44$ALL = makeKeyword("ALL");
  public static final SubLObject $const45$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLObject $const46$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLSymbol $kw47$CONTRADICTION = makeKeyword("CONTRADICTION");
  public static final SubLSymbol $sym48$DNF_P = makeSymbol("DNF-P");
  public static final SubLSymbol $sym49$LISTP = makeSymbol("LISTP");
  public static final SubLString $str50$Time_to_support_disjunctive___pra = makeString("Time to support disjunctive #$pragmaticRequirements");
  public static final SubLSymbol $sym51$HL_VARIABLE_P = makeSymbol("HL-VARIABLE-P");
  public static final SubLString $str52$can_t_handle_non_simple_inference = makeString("can't handle non-simple inference seeding of strategies");
  public static final SubLSymbol $sym53$CONTINUABLE_INFERENCE_P = makeSymbol("CONTINUABLE-INFERENCE-P");
  public static final SubLSymbol $sym54$QUERY_DYNAMIC_PROPERTIES_P = makeSymbol("QUERY-DYNAMIC-PROPERTIES-P");
  public static final SubLSymbol $kw55$READY = makeKeyword("READY");
  public static final SubLSymbol $sym56$INFERENCE_DYNAMIC_PROPERTIES_P = makeSymbol("INFERENCE-DYNAMIC-PROPERTIES-P");
  public static final SubLSymbol $sym57$READY_INFERENCE_P = makeSymbol("READY-INFERENCE-P");
  public static final SubLSymbol $kw58$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $kw59$RUNNING = makeKeyword("RUNNING");
  public static final SubLSymbol $sym60$INFERENCE_ERROR_HANDLER = makeSymbol("INFERENCE-ERROR-HANDLER");
  public static final SubLSymbol $kw61$ABORT = makeKeyword("ABORT");
  public static final SubLSymbol $kw62$SUSPENDED = makeKeyword("SUSPENDED");
  public static final SubLSymbol $kw63$MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");
  public static final SubLSymbol $kw64$MAX_NUMBER = makeKeyword("MAX-NUMBER");
  public static final SubLSymbol $kw65$MAX_TIME = makeKeyword("MAX-TIME");
  public static final SubLSymbol $kw66$MAX_STEP = makeKeyword("MAX-STEP");
  public static final SubLSymbol $kw67$PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
  public static final SubLSymbol $sym68$RUNNING_INFERENCE_P = makeSymbol("RUNNING-INFERENCE-P");
  public static final SubLString $str69$Inference_control_process_was_kil = makeString("Inference control process was killed while running.");
  public static final SubLSymbol $sym70$POSITIVE_NUMBER_P = makeSymbol("POSITIVE-NUMBER-P");
  public static final SubLSymbol $sym71$SIGNAL_INFERENCE_CONTROL_PROCESS_ABORT = makeSymbol("SIGNAL-INFERENCE-CONTROL-PROCESS-ABORT");
  public static final SubLSymbol $kw72$INTERRUPT = makeKeyword("INTERRUPT");
  public static final SubLSymbol $kw73$MAX_PROOF_COUNT = makeKeyword("MAX-PROOF-COUNT");
  public static final SubLSymbol $kw74$HEURISTIC_BALANCED = makeKeyword("HEURISTIC-BALANCED");
  public static final SubLSymbol $kw75$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw76$BALANCING = makeKeyword("BALANCING");
  public static final SubLSymbol $kw77$EXHAUST = makeKeyword("EXHAUST");
  public static final SubLString $str78$Non_continuable_inference_should_ = makeString("Non-continuable inference should have been :exhaust-total instead of :exhaust");
  public static final SubLString $str79$Crazy_amount_of_problems___a__in_ = makeString("Crazy amount of problems (~a) in store ~a");
  public static final SubLSymbol $kw80$EXHAUST_TOTAL = makeKeyword("EXHAUST-TOTAL");
  public static final SubLSymbol $sym81$PROOF_P = makeSymbol("PROOF-P");
  public static final SubLList $list82 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym83$TERM_REQUIRES_HL_LANGUAGE = makeSymbol("TERM-REQUIRES-HL-LANGUAGE");
  public static final SubLSymbol $kw84$COMPUTE_UNION = makeKeyword("COMPUTE-UNION");
  public static final SubLSymbol $sym85$VARIABLE_BINDING_VALUE = makeSymbol("VARIABLE-BINDING-VALUE");
  public static final SubLSymbol $sym86$VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");
  public static final SubLString $str87$Expected_a_one_to_one_match_betwe = makeString("Expected a one-to-one match between EL and HL bindings, got ~a and ~a");
  public static final SubLInteger $int88$200 = makeInteger(200);
  public static final SubLInteger $int89$50 = makeInteger(50);
  public static final SubLSymbol $sym90$ATOMIC_CLAUSES_P = makeSymbol("ATOMIC-CLAUSES-P");
  public static final SubLSymbol $sym91$ATOMIC_CLAUSE_P = makeSymbol("ATOMIC-CLAUSE-P");
  public static final SubLSymbol $kw92$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw93$FALSE = makeKeyword("FALSE");
  public static final SubLList $list94 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLList $list95 = list(makeSymbol("TIME"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym96$TIMER = makeUninternedSymbol("TIMER");
  public static final SubLSymbol $sym97$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym98$WITH_QUERY_ABORT_TIMEOUT_START_TIMER = makeSymbol("WITH-QUERY-ABORT-TIMEOUT-START-TIMER");
  public static final SubLSymbol $sym99$WITH_QUERY_ABORT_TIMEOUT_STOP_TIMER = makeSymbol("WITH-QUERY-ABORT-TIMEOUT-STOP-TIMER");
  public static final SubLSymbol $sym100$WITH_QUERY_ABORT_TIMEOUT = makeSymbol("WITH-QUERY-ABORT-TIMEOUT");
  public static final SubLString $str101$WITH_QUERY_ABORT_TIMEOUT_client = makeString("WITH-QUERY-ABORT-TIMEOUT client");
  public static final SubLString $str102$WITH_QUERY_ABORT_TIMEOUT_timer = makeString("WITH-QUERY-ABORT-TIMEOUT timer");
  public static final SubLSymbol $sym103$WITH_QUERY_ABORT_TIMEOUT_TIMER_THREAD = makeSymbol("WITH-QUERY-ABORT-TIMEOUT-TIMER-THREAD");
  public static final SubLSymbol $sym104$QUERY_ABORT = makeSymbol("QUERY-ABORT");

  //// Initializers

  public void declareFunctions() {
    declare_inference_strategist_file();
  }

  public void initializeVariables() {
    init_inference_strategist_file();
  }

  public void runTopLevelForms() {
    setup_inference_strategist_file();
  }

}
