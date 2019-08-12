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
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.auxiliary_indexing;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.*;
import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.sbhl.*;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.cardinality_estimates;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.inference.modules.forward_modules;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.hl_storage_modules;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
import com.cyc.cycjava.cycl.*;
//dm import com.cyc.cycjava_1.cycl.inference.harness.abnormal;
//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.inference.ask_utilities;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.auxiliary_indexing;
import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_metrics;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_trivial;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.tms;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;

public  final class forward extends SubLTranslatedFile {

  //// Constructor

  private forward() {}
  public static final SubLFile me = new forward();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.forward";

  //// Definitions

  /** Whether forward inference requires that a computed placement mt for
   a forward deduction be the mt of one of its supports. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 598)
  public static SubLSymbol $require_cached_gaf_mt_from_supports$ = null;

  /** A function-spec-p to call on each browsable forward inference.
It will be passed an inference-p as its arg1 (the forward inference object)
and a rule-assertion? as its arg2 (the forward rule being used). */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 863)
  public static SubLSymbol $forward_inference_browsing_callback$ = null;

  /** Optionally, store more info about each forward inference by passing it to the callback.  Additions are stored in a plist and are: target-asent target-truth trigger-bindings trigger-supports forward-results.  @see forward-propagate-dnf. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 1137)
  public static SubLSymbol $forward_inference_browsing_callback_more_infoP$ = null;

  /** Variable for debugging */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 1456)
  private static SubLSymbol $block_forward_inferencesP$ = null;

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 1537)
  public static SubLSymbol $tracing_forward_inference$ = null;

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 1585)
  public static final SubLObject current_forward_inference_environment() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return kb_control_vars.$forward_inference_environment$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 1779)
  public static final SubLObject get_forward_inference_environment() {
    return new_forward_inference_environment();
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 1985)
  public static final SubLObject clear_forward_inference_environment(SubLObject environment) {
    return queues.clear_queue(environment);
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 2087)
  public static final SubLObject new_forward_inference_environment() {
    return queues.create_queue();
  }

  /** Initialize global forward inference environment. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 2179)
  public static final SubLObject initialize_forward_inference_environment() {
    kb_control_vars.$forward_inference_environment$.setDynamicValue(get_forward_inference_environment());
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 2430)
  private static SubLSymbol $forward_inference_gaf$ = null;

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 2612)
  private static SubLSymbol $forward_inference_rule$ = null;

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 2999)
  public static final SubLObject current_forward_inference_rule() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $forward_inference_rule$.getDynamicValue(thread);
    }
  }

  /** Problem store properties assumed by forward inference. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 3213)
  private static SubLSymbol $forward_problem_store_properties$ = null;

  /** @return problem-store-p ; a new problem-store suitable for forward inference. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 3794)
  public static final SubLObject new_forward_problem_store() {
    inference_metrics.increment_forward_problem_store_historical_count();
    return inference_datastructures_problem_store.new_problem_store($forward_problem_store_properties$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 4039)
  public static final SubLObject destroy_forward_problem_store(SubLObject store) {
    inference_metrics.update_forward_problem_historical_count(store);
    inference_metrics.update_maximum_forward_problem_store_historical_problem_count(store);
    return inference_datastructures_problem_store.destroy_problem_store(store);
  }

  /** temp control variable */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 4255)
  private static SubLSymbol $forward_inference_shares_same_problem_storeP$ = null;

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 4394)
  public static final SubLObject forward_inference_shares_same_problem_storeP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $forward_inference_shares_same_problem_storeP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 4515)
  public static final SubLObject get_forward_problem_store() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject store = ((NIL != forward_inference_shares_same_problem_storeP()) ? ((SubLObject) utilities_macros.$current_forward_problem_store$.getDynamicValue(thread)) : NIL);
        if ((NIL == store)) {
          store = new_forward_problem_store();
          if ((NIL != forward_inference_shares_same_problem_storeP())) {
            utilities_macros.$current_forward_problem_store$.setDynamicValue(store, thread);
          }
        }
        return store;
      }
    }
  }

  /** Clear and destroy the current forward problem store (if any) */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 4866)
  public static final SubLObject clear_current_forward_problem_store() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != utilities_macros.$current_forward_problem_store$.getDynamicValue(thread))) {
        try {
          if ((NIL == control_vars.browse_forward_inferencesP())) {
            destroy_forward_problem_store(utilities_macros.$current_forward_problem_store$.getDynamicValue(thread));
          }
        } finally {
          {
            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
              utilities_macros.$current_forward_problem_store$.setDynamicValue(NIL, thread);
            } finally {
              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 5223)
  public static final SubLObject clear_current_forward_inference_environment() {
    return clear_forward_inference_environment(current_forward_inference_environment());
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 5436)
  public static final SubLObject queue_forward_assertion(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym6$ASSERTION_P);
      if ((NIL != kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread))) {
        {
          SubLObject environment = current_forward_inference_environment();
          queues.enqueue(assertion, environment);
        }
        if ((NIL != $tracing_forward_inference$.getDynamicValue(thread))) {
          PrintLow.format(T, $str7$___S, assertion);
        }
      }
      return assertion;
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 5762)
  public static final SubLObject remqueue_forward_assertion(SubLObject assertion) {
    checkType(assertion, $sym6$ASSERTION_P);
    {
      SubLObject environment = current_forward_inference_environment();
      if ((NIL != environment)) {
        return queues.remqueue(assertion, environment, UNPROVIDED);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 5989)
  private static SubLSymbol $forward_inference_recursion_depth$ = null;

  /** Exhaustively complete all pending forward inference */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 6051)
  public static final SubLObject perform_forward_inference() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if ((NIL != kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread))) {
          {
            SubLObject environment = current_forward_inference_environment();
            {
              SubLObject _prev_bind_0 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
              try {
                utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
                try {
                  {
                    SubLObject _prev_bind_0_1 = $forward_inference_recursion_depth$.currentBinding(thread);
                    try {
                      $forward_inference_recursion_depth$.bind(number_utilities.f_1X($forward_inference_recursion_depth$.getDynamicValue(thread)), thread);
                      if (((NIL != control_vars.$inference_debugP$.getDynamicValue(thread))
                           && $forward_inference_recursion_depth$.getDynamicValue(thread).numGE(TWENTY_INTEGER))) {
                        Errors.sublisp_break($str8$Forward_inference_recursion_probl, new SubLObject[] {$forward_inference_recursion_depth$.getDynamicValue(thread)});
                      }
                      while ((NIL == queues.queue_empty_p(environment))) {
                        {
                          SubLObject assertion = queues.dequeue(environment);
                          SubLObject some_results = forward_propagate_assertion(assertion, UNPROVIDED);
                          result = ConsesLow.nconc(Sequences.nreverse(some_results), result);
                        }
                      }
                    } finally {
                      $forward_inference_recursion_depth$.rebind(_prev_bind_0_1, thread);
                    }
                  }
                } finally {
                  {
                    SubLObject _prev_bind_0_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                      clear_current_forward_problem_store();
                    } finally {
                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                    }
                  }
                }
              } finally {
                utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return Sequences.nreverse(result);
      }
    }
  }

  /** The queue of new assertibles (hl-assertible-p) computed during one forward theory revision cycle. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 7171)
  private static SubLSymbol $forward_inference_assertibles_queue$ = null;

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 7444)
  public static final SubLObject forward_inference_assertibles_queue() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $forward_inference_assertibles_queue$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 7547)
  public static final SubLObject note_new_forward_assertible(SubLObject hl_assertible) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      queues.enqueue(hl_assertible, $forward_inference_assertibles_queue$.getDynamicValue(thread));
      return NIL;
    }
  }

  /** @note When *current-forward-problem-store* is NIL, this function will set it as a side-effect (to support forward problem store reuse.)  This can be very bad if it's not dynamically bound as a global forward problem store will exist, quickly become stale, and cause incorrectness.  Be safe and wrap rogue calls to forward-propagate-assertion with the with-normal-forward-inference macro (or at least with-clean-forward-problem-store-environment if you're tweaking forward inference behavior.) */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 7731)
  public static final SubLObject forward_propagate_assertion(SubLObject assertion, SubLObject propagation_mt) {
    if ((propagation_mt == UNPROVIDED)) {
      propagation_mt = $const9$InferencePSC;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject assertibles = NIL;
        if (((NIL != kb_control_vars.$forward_inference_enabledP$.getDynamicValue(thread))
             && (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)))) {
          if ((!(($const9$InferencePSC.equal(propagation_mt)
                 && (NIL == assertions_high.forward_assertionP(assertion)))))) {
            {
              SubLObject store_var = get_forward_problem_store();
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
                            Errors.error($str10$Invalid_attempt_to_reuse_memoizat);
                          }
                        }
                      }
                    }
                    try {
                      {
                        SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                        {
                          SubLObject _prev_bind_0_3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                          SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                          SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                          try {
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                            {
                              SubLObject _prev_bind_0_4 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
                              SubLObject _prev_bind_1_5 = kb_control_vars.$recursive_ist_justificationsP$.currentBinding(thread);
                              SubLObject _prev_bind_2_6 = $forward_inference_assertibles_queue$.currentBinding(thread);
                              try {
                                kb_control_vars.$within_forward_inferenceP$.bind(T, thread);
                                kb_control_vars.$recursive_ist_justificationsP$.bind(NIL, thread);
                                $forward_inference_assertibles_queue$.bind(queues.create_queue(), thread);
                                if ((NIL != assertions_high.gaf_assertionP(assertion))) {
                                  forward_propagate_gaf(assertion, propagation_mt);
                                } else {
                                  forward_propagate_rule(assertion, propagation_mt);
                                }
                                if ((NIL == queues.queue_empty_p(forward_inference_assertibles_queue()))) {
                                  if ((!(((NIL != kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread))
                                        || (NIL != control_vars.$prefer_forward_skolemization$.getDynamicValue(thread)))))) {
                                    clear_current_forward_problem_store();
                                  }
                                  {
                                    SubLObject _prev_bind_0_7 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
                                    try {
                                      utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
                                      try {
                                        {
                                          SubLObject _prev_bind_0_8 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                                          SubLObject _prev_bind_1_9 = control_vars.$prefer_forward_skolemization$.currentBinding(thread);
                                          try {
                                            kb_control_vars.$within_assertion_forward_propagationP$.bind(NIL, thread);
                                            control_vars.$prefer_forward_skolemization$.bind(NIL, thread);
                                            {
                                              SubLObject doneP = NIL;
                                              SubLObject rest = NIL;
                                              for (rest = queues.do_queue_elements_queue_elements(forward_inference_assertibles_queue()); (!(((NIL != doneP)
                                                    || (NIL == rest)))); rest = rest.rest()) {
                                                {
                                                  SubLObject hl_assertible = rest.first();
                                                  if ((NIL != assertions_high.invalid_assertionP(assertion, UNPROVIDED))) {
                                                    Errors.warn($str11$_s_was_removed_by_its_own_forward, assertion);
                                                    doneP = T;
                                                  } else {
                                                    {
                                                      SubLObject hl_assertible_var = hl_assertible;
                                                      SubLObject argument_spec = hl_storage_modules.hl_assertible_argument_spec(hl_assertible_var);
                                                      SubLObject hl_assertion_spec_var = hl_storage_modules.hl_assertible_hl_assertion_spec(hl_assertible_var);
                                                      SubLObject hl_assertion_spec_var_10 = hl_assertion_spec_var;
                                                      SubLObject cnf = hl_storage_modules.hl_assertion_spec_cnf(hl_assertion_spec_var_10);
                                                      SubLObject mt = hl_storage_modules.hl_assertion_spec_mt(hl_assertion_spec_var_10);
                                                      SubLObject direction = hl_storage_modules.hl_assertion_spec_direction(hl_assertion_spec_var_10);
                                                      SubLObject variable_map = hl_storage_modules.hl_assertion_spec_variable_map(hl_assertion_spec_var_10);
                                                      if ((NIL != list_utilities.tree_find_if($sym12$INVALID_ASSERTION_, argument_spec, UNPROVIDED))) {
                                                        Errors.warn($str13$invalid_hl_assertible__s_encounte);
                                                      } else {
                                                        {
                                                          SubLObject _prev_bind_0_11 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
                                                          try {
                                                            kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
                                                            {
                                                              SubLObject var = hl_storage_modules.hl_add_assertible(hl_assertible);
                                                              if ((NIL != var)) {
                                                                assertibles = cons(var, assertibles);
                                                              }
                                                            }
                                                          } finally {
                                                            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0_11, thread);
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } finally {
                                            control_vars.$prefer_forward_skolemization$.rebind(_prev_bind_1_9, thread);
                                            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0_8, thread);
                                          }
                                        }
                                      } finally {
                                        {
                                          SubLObject _prev_bind_0_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                          try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            clear_current_forward_problem_store();
                                          } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                          }
                                        }
                                      }
                                    } finally {
                                      utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_0_7, thread);
                                    }
                                  }
                                }
                              } finally {
                                $forward_inference_assertibles_queue$.rebind(_prev_bind_2_6, thread);
                                kb_control_vars.$recursive_ist_justificationsP$.rebind(_prev_bind_1_5, thread);
                                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0_4, thread);
                              }
                            }
                            space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                          } finally {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_3, thread);
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
                  memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        }
        return Sequences.nreverse(assertibles);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 10584)
  public static final SubLObject forward_propagate_rule(SubLObject rule, SubLObject propagation_mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = $forward_inference_rule$.currentBinding(thread);
        try {
          $forward_inference_rule$.bind(rule, thread);
          {
            SubLObject rule_cnf = assertions_high.assertion_cnf(rule);
            SubLObject pragmatic_dnf = inference_worker_transformation.forward_rule_pragmatic_dnf(rule, propagation_mt);
            handle_forward_propagation(rule_cnf, pragmatic_dnf, propagation_mt, NIL, rule, NIL);
          }
        } finally {
          $forward_inference_rule$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 10994)
  public static final SubLObject forward_propagate_gaf(SubLObject source_gaf_assertion, SubLObject propagation_mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = $forward_inference_gaf$.currentBinding(thread);
        try {
          $forward_inference_gaf$.bind(source_gaf_assertion, thread);
          {
            SubLObject source_sense = enumeration_types.truth_sense(assertions_high.assertion_truth(source_gaf_assertion));
            if ((($kw14$POS == source_sense)
                || (NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread)))) {
              {
                SubLObject source_asent = conses_high.copy_tree(assertions_high.gaf_formula(source_gaf_assertion));
                {
                  SubLObject _prev_bind_0_14 = kb_control_vars.$relax_type_restrictions_for_nats$.currentBinding(thread);
                  try {
                    kb_control_vars.$relax_type_restrictions_for_nats$.bind(makeBoolean(((NIL != kb_control_vars.$relax_type_restrictions_for_nats$.getDynamicValue(thread))
                          || (NIL != el_utilities.tou_asentP(source_asent)))), thread);
                    forward_propagate_gaf_expansions(source_asent, source_sense, propagation_mt, source_gaf_assertion);
                  } finally {
                    kb_control_vars.$relax_type_restrictions_for_nats$.rebind(_prev_bind_0_14, thread);
                  }
                }
              }
            }
          }
        } finally {
          $forward_inference_gaf$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 11684)
  public static final SubLObject forward_propagate_gaf_expansions(SubLObject source_asent, SubLObject source_sense, SubLObject propagation_mt, SubLObject source_gaf_assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cdolist_list_var = forward_modules.forward_tactic_specs(source_asent, source_sense, propagation_mt);
        SubLObject forward_tactic_spec = NIL;
        for (forward_tactic_spec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), forward_tactic_spec = cdolist_list_var.first()) {
          {
            SubLObject datum = forward_tactic_spec;
            SubLObject current = datum;
            SubLObject trigger_asent = NIL;
            SubLObject trigger_sense = NIL;
            SubLObject examine_asent = NIL;
            SubLObject examine_sense = NIL;
            SubLObject rule = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
            trigger_asent = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
            trigger_sense = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
            examine_asent = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
            examine_sense = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
            rule = current.first();
            current = current.rest();
            {
              SubLObject additional_supports = (current.isCons() ? ((SubLObject) current.first()) : NIL);
              cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list15);
              current = current.rest();
              if ((NIL == current)) {
                if ((($kw16$NEG == examine_sense)
                    || (NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread)))) {
                  {
                    SubLObject trigger_supports = make_forward_trigger_supports(source_gaf_assertion, additional_supports);
                    forward_propagate_gaf_internal(trigger_asent, examine_asent, examine_sense, propagation_mt, rule, trigger_supports);
                  }
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list15);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 12490)
  public static final SubLObject make_forward_trigger_supports(SubLObject source_gaf_assertion, SubLObject additional_supports) {
    {
      SubLObject trigger_supports = conses_high.copy_list(additional_supports);
      if ((NIL != source_gaf_assertion)) {
        trigger_supports = cons(source_gaf_assertion, trigger_supports);
      }
      return trigger_supports;
    }
  }

  /** Should we bother to type-filter a prospective forward DNF. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 12755)
  public static SubLSymbol $type_filter_forward_dnf$ = null;

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 12872)
  public static final SubLObject forward_inference_allowed_rules() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 12983)
  public static final SubLObject forward_inference_all_rules_allowedP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq(kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread), $kw17$ALL);
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 13095)
  public static final SubLObject forward_inference_rule_allowedP(SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != forward_inference_all_rules_allowedP())
            || (NIL != list_utilities.member_eqP(rule, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread)))));
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 13264)
  public static final SubLObject forward_propagate_gaf_internal(SubLObject trigger_asent, SubLObject examine_asent, SubLObject examine_sense, SubLObject propagation_mt, SubLObject rule, SubLObject trigger_supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == forward_inference_rule_allowedP(rule))) {
        return NIL;
      }
      {
        SubLObject _prev_bind_0 = $forward_inference_rule$.currentBinding(thread);
        try {
          $forward_inference_rule$.bind(rule, thread);
          {
            SubLObject cnf = assertions_high.assertion_cnf(rule);
            SubLObject pos_lits = clauses.pos_lits(cnf);
            SubLObject neg_lits = clauses.neg_lits(cnf);
            SubLObject examine_lits = (($kw14$POS == examine_sense) ? ((SubLObject) pos_lits) : neg_lits);
            SubLObject other_lits = (($kw14$POS == examine_sense) ? ((SubLObject) neg_lits) : pos_lits);
            SubLObject pragmatic_dnf = inference_worker_transformation.forward_rule_pragmatic_dnf(rule, propagation_mt);
            if ((cycl_utilities.atomic_sentence_predicate(trigger_asent).equal(cycl_utilities.atomic_sentence_predicate(examine_asent))
                || ((NIL != auxiliary_indexing.unbound_predicate_literal(examine_asent))
                   && (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30637"))))) {
              thread.resetMultipleValues();
              {
                SubLObject trigger_bindings = unification_utilities.gaf_asent_unify(trigger_asent, examine_asent, T, T);
                SubLObject gaf_asent = thread.secondMultipleValue();
                SubLObject unify_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != trigger_bindings)) {
                  {
                    SubLObject remainder_neg_lits = NIL;
                    SubLObject remainder_pos_lits = NIL;
                    if (($kw14$POS == examine_sense)) {
                      remainder_neg_lits = other_lits;
                      remainder_pos_lits = Sequences.remove(examine_asent, examine_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                      remainder_neg_lits = Sequences.remove(examine_asent, examine_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                      remainder_pos_lits = other_lits;
                    }
                    handle_forward_propagation_from_gaf(examine_asent, remainder_neg_lits, remainder_pos_lits, pragmatic_dnf, propagation_mt, trigger_bindings, rule, ConsesLow.append(trigger_supports, unify_justification));
                  }
                }
              }
            }
          }
        } finally {
          $forward_inference_rule$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 14919)
  private static SubLSymbol $forward_non_trigger_literal_restricted_examine_asent$ = null;

  /** Assume TRIGGER-ASENT is the sentence that triggered this forward propagation.
   @param EXAMINE-ASENT; the literal of RULE that unified with TRIGGER-ASENT
   @param REMAINDER-NEG-LITS; the other neg-lits of RULE, minus EXAMINE-ASENT (if TRIGGER-ASENT is a neg-lit).
   @param REMAINDER-POS-LITS; the other pos-lits of RULE, minus EXAMINE-ASENT (if TRIGGER-ASENT is a pos-lit).
   @param PRAGMATIC-DNF; a DNF of additional pragmatic constraints on RULE in PROPAGATION-MT.
   @param PROPAGATION-MT; the microtheory of the forward inference propagation.
   @param TRIGGER-BINDINGS; bindings resulting from unifying the TRIGGER-ASENT with EXAMINE-ASENT from RULE.
   @param RULE; the rule assertion that being triggerd by the TRIGGER-ASENT.
   @param TRIGGER-SUPPORTS; the supports that justify TRIGGER-ASENT. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 15010)
  public static final SubLObject handle_forward_propagation_from_gaf(SubLObject examine_asent, SubLObject remainder_neg_lits, SubLObject remainder_pos_lits, SubLObject pragmatic_dnf, SubLObject propagation_mt, SubLObject trigger_bindings, SubLObject rule, SubLObject trigger_supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject restricted_remainder_neg_lits = bindings.apply_bindings(trigger_bindings, remainder_neg_lits);
        SubLObject restricted_remainder_pos_lits = bindings.apply_bindings(trigger_bindings, remainder_pos_lits);
        SubLObject restricted_rule_remainder_cnf = clauses.make_cnf(restricted_remainder_neg_lits, restricted_remainder_pos_lits);
        SubLObject restricted_pragmatic_dnf = bindings.apply_bindings(trigger_bindings, pragmatic_dnf);
        {
          SubLObject _prev_bind_0 = $forward_non_trigger_literal_restricted_examine_asent$.currentBinding(thread);
          try {
            $forward_non_trigger_literal_restricted_examine_asent$.bind(bindings.apply_bindings(trigger_bindings, examine_asent), thread);
            handle_forward_propagation(restricted_rule_remainder_cnf, restricted_pragmatic_dnf, propagation_mt, trigger_bindings, rule, trigger_supports);
          } finally {
            $forward_non_trigger_literal_restricted_examine_asent$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 18292)
  public static final SubLObject handle_forward_propagation(SubLObject rule_remainder_cnf, SubLObject pragmatic_dnf, SubLObject propagation_mt, SubLObject trigger_bindings, SubLObject rule, SubLObject trigger_supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != forward_propagation_supports_doomedP(rule, trigger_supports))) {
        return NIL;
      }
      {
        SubLObject rule_remainder_neg_lits = clauses.neg_lits(rule_remainder_cnf);
        SubLObject rule_remainder_pos_lits = clauses.pos_lits(rule_remainder_cnf);
        {
          SubLObject cdolist_list_var = rule_remainder_pos_lits;
          SubLObject target_asent = NIL;
          for (target_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), target_asent = cdolist_list_var.first()) {
            {
              SubLObject other_pos_lits = Sequences.remove(target_asent, rule_remainder_pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              SubLObject query_dnf = clauses.make_dnf(other_pos_lits, rule_remainder_neg_lits);
              handle_one_forward_propagation(query_dnf, pragmatic_dnf, propagation_mt, target_asent, $kw19$TRUE, trigger_bindings, rule, trigger_supports);
            }
          }
        }
        if ((NIL != kb_control_vars.$forward_propagate_to_negations$.getDynamicValue(thread))) {
          {
            SubLObject cdolist_list_var = rule_remainder_neg_lits;
            SubLObject target_asent = NIL;
            for (target_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), target_asent = cdolist_list_var.first()) {
              {
                SubLObject other_neg_lits = Sequences.remove(target_asent, rule_remainder_neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject query_dnf = clauses.make_dnf(rule_remainder_pos_lits, other_neg_lits);
                handle_one_forward_propagation(query_dnf, pragmatic_dnf, propagation_mt, target_asent, $kw32$FALSE, trigger_bindings, rule, trigger_supports);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 19902)
  public static final SubLObject handle_one_forward_propagation(SubLObject query_dnf, SubLObject pragmatic_dnf, SubLObject propagation_mt, SubLObject target_asent, SubLObject target_truth, SubLObject trigger_bindings, SubLObject rule, SubLObject trigger_supports) {
    {
      SubLObject catch_var = NIL;
      try {
        if (((NIL != clauses.empty_clauseP(query_dnf))
             && (NIL != clauses.empty_clauseP(pragmatic_dnf)))) {
          add_empty_forward_propagation_result(target_asent, target_truth, propagation_mt, trigger_bindings, rule, trigger_supports);
        } else if (((NIL == semantically_valid_forward_dnf(query_dnf, propagation_mt))
            || (NIL == semantically_valid_forward_dnf(pragmatic_dnf, propagation_mt)))) {
        } else {
          {
            SubLObject filtered_pragmatic_dnf = filter_forward_pragmatic_dnf(pragmatic_dnf);
            forward_propagate_dnf(query_dnf, filtered_pragmatic_dnf, propagation_mt, target_asent, target_truth, trigger_bindings, rule, trigger_supports);
          }
        }
      } catch (Throwable ccatch_env_var) {
        catch_var = Errors.handleThrowable(ccatch_env_var, $kw33$INFERENCE_REJECTED);
      }
    }
    return NIL;
  }

  /** Removes #$forwardNonTriggerLiteral pos-lits from PRAGMATIC-DNF. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 20904)
  public static final SubLObject filter_forward_pragmatic_dnf(SubLObject pragmatic_dnf) {
    {
      SubLObject pos_lits = clauses.pos_lits(pragmatic_dnf);
      if ((NIL == Sequences.find_if($sym34$FORWARD_NON_TRIGGER_LITERAL_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
        return pragmatic_dnf;
      } else {
        {
          SubLObject new_pos_lits = Sequences.remove_if($sym34$FORWARD_NON_TRIGGER_LITERAL_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          return clauses.make_dnf(clauses.neg_lits(pragmatic_dnf), new_pos_lits);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 21316)
  public static final SubLObject forward_propagate_dnf(SubLObject query_dnf, SubLObject pragmatic_dnf, SubLObject propagation_mt, SubLObject target_asent, SubLObject target_truth, SubLObject trigger_bindings, SubLObject rule, SubLObject trigger_supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject forward_results = new_forward_query_from_dnf(query_dnf, pragmatic_dnf, propagation_mt, UNPROVIDED);
        SubLObject inference = thread.secondMultipleValue();
        SubLObject query_time = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $forward_inference_browsing_callback$.getDynamicValue(thread))) {
          if ((NIL != $forward_inference_browsing_callback_more_infoP$.getDynamicValue(thread))) {
            Functions.funcall($forward_inference_browsing_callback$.getDynamicValue(thread), inference, rule, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9148"));
          } else {
            Functions.funcall($forward_inference_browsing_callback$.getDynamicValue(thread), inference, rule);
          }
        }
        inference_metrics.increment_forward_inference_historical_count();
        inference_metrics.increment_forward_inference_metrics(rule, query_time, inference);
        if ((NIL != forward_results)) {
          inference_metrics.increment_successful_forward_inference_historical_count();
        }
        {
          SubLObject cdolist_list_var = forward_results;
          SubLObject forward_result = NIL;
          for (forward_result = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), forward_result = cdolist_list_var.first()) {
            add_forward_propagation_result(target_asent, target_truth, propagation_mt, trigger_bindings, rule, trigger_supports, forward_result);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 22638)
  public static final SubLObject new_forward_query_from_dnf(SubLObject query_dnf, SubLObject pragmatic_dnf, SubLObject propagation_mt, SubLObject overriding_query_properties) {
    if ((overriding_query_properties == UNPROVIDED)) {
      overriding_query_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject query_properties = forward_inference_query_properties(pragmatic_dnf, overriding_query_properties);
        SubLObject forward_results = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject query_time = NIL;
        SubLObject time_var = Time.get_internal_real_time();
        thread.resetMultipleValues();
        {
          SubLObject forward_results_18 = inference_kernel.new_cyc_query_from_dnf(query_dnf, propagation_mt, NIL, query_properties);
          SubLObject halt_reason_19 = thread.secondMultipleValue();
          SubLObject inference_20 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          forward_results = forward_results_18;
          halt_reason = halt_reason_19;
          inference = inference_20;
        }
        query_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(forward_results, inference, query_time);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 24301)
  public static final SubLObject forward_inference_query_properties(SubLObject pragmatic_dnf, SubLObject overriding_query_properties) {
    if ((overriding_query_properties == UNPROVIDED)) {
      overriding_query_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject store = get_forward_problem_store();
        SubLObject non_explanatory_sentence = ((NIL != clauses.empty_clauseP(pragmatic_dnf)) ? ((SubLObject) NIL) : clauses.dnf_formula(pragmatic_dnf));
        SubLObject browsableP = list_utilities.sublisp_boolean(control_vars.browse_forward_inferencesP());
        SubLObject blockP = list_utilities.sublisp_boolean($block_forward_inferencesP$.getDynamicValue(thread));
        SubLObject max_time = kb_control_vars.$forward_inference_time_cutoff$.getDynamicValue(thread);
        SubLObject productivity_limit = ask_utilities.productivity_limit_from_removal_cost_cutoff(control_vars.$forward_inference_removal_cost_cutoff$.getDynamicValue(thread));
        SubLObject new_terms_allowed = control_vars.$prefer_forward_skolemization$.getDynamicValue(thread);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == inference_datastructures_problem_store.problem_store_p(store))) {
            Errors.error($str40$Tried_to_do_forward_inference_out);
          }
        }
        {
          SubLObject query_properties = list(new SubLObject[] {$kw41$PROBLEM_STORE, store, $kw42$NON_EXPLANATORY_SENTENCE, non_explanatory_sentence, $kw43$ALLOW_INDETERMINATE_RESULTS_, T, $kw44$BROWSABLE_, browsableP, $kw45$BLOCK_, blockP, $kw46$PRODUCTIVITY_LIMIT, productivity_limit, $kw47$PROBABLY_APPROXIMATELY_DONE, ONE_INTEGER, $kw48$MAX_TIME, max_time, $kw49$RESULT_UNIQUENESS, $kw50$PROOF, $kw51$RETURN, $kw52$BINDINGS_AND_SUPPORTS, $kw53$NEW_TERMS_ALLOWED_, new_terms_allowed});
          if ((NIL != overriding_query_properties)) {
            query_properties = list_utilities.merge_plist(query_properties, overriding_query_properties);
          }
          return query_properties;
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 26188)
  public static final SubLObject add_forward_propagation_result(SubLObject target_asent, SubLObject target_truth, SubLObject propagation_mt, SubLObject trigger_bindings, SubLObject rule, SubLObject trigger_supports, SubLObject forward_result) {
    {
      SubLObject datum = forward_result;
      SubLObject current = datum;
      SubLObject inference_bindings = NIL;
      SubLObject inference_supports = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list54);
      inference_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list54);
      inference_supports = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject concluded_asent = bindings.apply_bindings(inference_bindings, target_asent);
          if ((NIL != el_utilities.hl_ground_tree_p(concluded_asent))) {
            if ((NIL == abnormal.forward_bindings_abnormalP(propagation_mt, rule, trigger_bindings, inference_bindings))) {
              {
                SubLObject concluded_supports = new_forward_concluded_supports(rule, trigger_supports, inference_supports);
                add_forward_deductions_from_supports(propagation_mt, concluded_asent, target_truth, concluded_supports);
              }
            }
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list54);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 27324)
  public static final SubLObject add_empty_forward_propagation_result(SubLObject target_asent, SubLObject target_truth, SubLObject propagation_mt, SubLObject trigger_bindings, SubLObject rule, SubLObject trigger_supports) {
    return add_forward_propagation_result(target_asent, target_truth, propagation_mt, trigger_bindings, rule, trigger_supports, $list55);
  }

  /** Combine RULE, TRIGGER-SUPPORTS and INFERENCE-SUPPORTS (if any)
   into a single list of support-p that represents one complete justification for
   a new forward conclusion. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 27596)
  public static final SubLObject new_forward_concluded_supports(SubLObject rule, SubLObject trigger_supports, SubLObject inference_supports) {
    if ((inference_supports == UNPROVIDED)) {
      inference_supports = NIL;
    }
    return reader.bq_cons(rule, ConsesLow.append(((NIL != trigger_supports) ? ((SubLObject) conses_high.copy_list(trigger_supports)) : NIL), ((NIL != inference_supports) ? ((SubLObject) conses_high.copy_list(inference_supports)) : NIL), NIL));
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 28029)
  public static final SubLObject add_forward_deductions_from_supports(SubLObject propagation_mt, SubLObject concluded_asent, SubLObject concluded_truth, SubLObject concluded_supports) {
    if ((NIL != kb_accessors.decontextualized_literalP(concluded_asent))) {
      {
        SubLObject convention_mt = kb_accessors.decontextualized_literal_convention_mt(concluded_asent);
        if ($const9$InferencePSC.equal(propagation_mt)) {
          {
            SubLObject support_combinations = compute_decontextualized_support_combinations(concluded_supports);
            SubLObject cdolist_list_var = support_combinations;
            SubLObject support_combination = NIL;
            for (support_combination = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), support_combination = cdolist_list_var.first()) {
              handle_forward_deduction_in_mt(concluded_asent, concluded_truth, convention_mt, support_combination);
            }
          }
        } else {
          handle_forward_deduction_in_mt(concluded_asent, concluded_truth, convention_mt, concluded_supports);
        }
      }
    } else {
      if ($const9$InferencePSC.equal(propagation_mt)) {
        {
          SubLObject mt_support_combinations = compute_all_mt_and_support_combinations(concluded_supports);
          SubLObject cdolist_list_var = mt_support_combinations;
          SubLObject mt_support_combination = NIL;
          for (mt_support_combination = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mt_support_combination = cdolist_list_var.first()) {
            {
              SubLObject datum = mt_support_combination;
              SubLObject current = datum;
              SubLObject concluded_mts = NIL;
              SubLObject support_combination = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
              concluded_mts = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list56);
              support_combination = current.first();
              current = current.rest();
              if ((NIL == current)) {
                {
                  SubLObject cdolist_list_var_24 = concluded_mts;
                  SubLObject concluded_mt = NIL;
                  for (concluded_mt = cdolist_list_var_24.first(); (NIL != cdolist_list_var_24); cdolist_list_var_24 = cdolist_list_var_24.rest(), concluded_mt = cdolist_list_var_24.first()) {
                    handle_forward_deduction_in_mt(concluded_asent, concluded_truth, concluded_mt, support_combination);
                  }
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list56);
              }
            }
          }
        }
      } else {
        handle_forward_deduction_in_mt(concluded_asent, concluded_truth, propagation_mt, concluded_supports);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 30047)
  public static final SubLObject handle_forward_deduction_in_mt(SubLObject asent, SubLObject truth, SubLObject mt, SubLObject supports) {
    if ((NIL == ((NIL != abnormal.abnormality_except_support_enabledP()) ? ((SubLObject) inference_worker_transformation.supports_contain_excepted_assertion_in_mtP(supports, mt)) : NIL))) {
      {
        SubLObject datum = supports;
        SubLObject current = datum;
        SubLObject rule = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list57);
        rule = current.first();
        current = current.rest();
        {
          SubLObject other_supports = current;
          if ((NIL != constraint_ruleP(rule, mt))) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36390");
          } else {
            return handle_forward_deduction_in_mt_as_assertible(asent, truth, mt, supports);
          }
        }
      }
    }
    return NIL;
  }

  /** When non-NIL, the deductions that result from forward inference are assumed to be WFF. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 30537)
  public static SubLSymbol $assume_forward_deduction_is_wfP$ = null;

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 30711)
  public static final SubLObject handle_forward_deduction_in_mt_as_assertible(SubLObject asent, SubLObject truth, SubLObject mt, SubLObject supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject gaf_formula = cycl_utilities.possibly_negate(asent, truth);
        SubLObject canon_cnfs = NIL;
        if ((NIL != $assume_forward_deduction_is_wfP$.getDynamicValue(thread))) {
          thread.resetMultipleValues();
          {
            SubLObject canon_cnfs_25 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31067");
            SubLObject mt_26 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_cnfs = canon_cnfs_25;
            mt = mt_26;
          }
        } else {
          thread.resetMultipleValues();
          {
            SubLObject canon_cnfs_27 = czer_main.canonicalize_gaf(gaf_formula, mt);
            SubLObject mt_28 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_cnfs = canon_cnfs_27;
            mt = mt_28;
          }
        }
        if ((NIL == cycl_grammar.cycl_truth_value_p(canon_cnfs))) {
          if ((NIL != Sequences.find_if($sym12$INVALID_ASSERTION_, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.warn($str58$Canonicalization_of__s_in__s_inva, gaf_formula, mt, supports);
            canon_cnfs = NIL;
          } else {
            if ((NIL == canon_cnfs)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 780");
              return NIL;
            }
          }
          {
            SubLObject cdolist_list_var = canon_cnfs;
            SubLObject canon_cnf_bind_list_pair = NIL;
            for (canon_cnf_bind_list_pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), canon_cnf_bind_list_pair = cdolist_list_var.first()) {
              {
                SubLObject datum = canon_cnf_bind_list_pair;
                SubLObject current = datum;
                SubLObject canon_cnf = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
                canon_cnf = current.first();
                current = current.rest();
                {
                  SubLObject binding_list = (current.isCons() ? ((SubLObject) current.first()) : NIL);
                  cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list59);
                  current = current.rest();
                  if ((NIL == current)) {
                    checkType(canon_cnf, $sym60$CNF_P);
                    if ((!(((NIL != control_vars.$filter_deductions_for_trivially_derivable_gafs$.getDynamicValue(thread))
                           && (NIL != clauses.atomic_clause_p(canon_cnf))
                           && (NIL != Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12453")))))) {
                      handle_forward_deduction_in_mt_as_assertible_int(canon_cnf, mt, supports, binding_list);
                    }
                  } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list59);
                  }
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 32061)
  public static final SubLObject handle_forward_deduction_in_mt_as_assertible_int(SubLObject cnf, SubLObject mt, SubLObject supports, SubLObject variable_map) {
    if ((variable_map == UNPROVIDED)) {
      variable_map = NIL;
    }
    {
      SubLObject deduction_spec = com.cyc.cycjava_1.cycl.deductions_high.create_deduction_spec(supports);
      SubLObject hl_assertion_spec = hl_storage_modules.new_hl_assertion_spec(cnf, mt, $kw61$FORWARD, variable_map);
      SubLObject hl_assertible = hl_storage_modules.new_hl_assertible(hl_assertion_spec, deduction_spec);
      note_new_forward_assertible(hl_assertible);
    }
    return NIL;
  }

  /** Temporary control variable;  When non-nil, forward rules labelled with #$constraint are treated
   as constraints that must be already true rather than mechanisms to add deductions to the KB. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 32443)
  private static SubLSymbol $forward_constraint_inference_enabledP$ = null;

  /** Return T iff RULE is a rule assertion labelled as a #$constraint in MT */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 32737)
  public static final SubLObject constraint_ruleP(SubLObject rule, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean(((NIL != assertions_high.rule_assertionP(rule))
           && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(rule, $const62$constraint, mt, ONE_INTEGER, $kw19$TRUE))));
  }

  /** temporary control parameter; @todo eliminate */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 34411)
  private static SubLSymbol $forward_non_trigger_literal_pruning_enabledP$ = null;

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 34726)
  public static final SubLObject syntactically_valid_forward_non_trigger_asents(SubLObject dnf) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject invalidP = NIL;
        if ((NIL != $forward_non_trigger_literal_pruning_enabledP$.getDynamicValue(thread))) {
          {
            SubLObject pos_lits = clauses.pos_lits(dnf);
            if ((NIL != Sequences.find_if($sym34$FORWARD_NON_TRIGGER_LITERAL_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
              if ((NIL == invalidP)) {
                {
                  SubLObject csome_list_var = pos_lits;
                  SubLObject asent = NIL;
                  for (asent = csome_list_var.first(); (!(((NIL != invalidP)
                        || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), asent = csome_list_var.first()) {
                    if (($const65$forwardNonTriggerLiteral == cycl_utilities.atomic_sentence_predicate(asent))) {
                      if (((NIL != variables.fully_bound_p(asent))
                           && cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED).equal($forward_non_trigger_literal_restricted_examine_asent$.getDynamicValue(thread)))) {
                        invalidP = T;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return makeBoolean((NIL == invalidP));
      }
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 35485)
  public static final SubLObject semantically_valid_forward_dnf(SubLObject dnf, SubLObject propagation_mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == syntactically_valid_forward_non_trigger_asents(dnf))) {
        return NIL;
      }
      if ((NIL == $type_filter_forward_dnf$.getDynamicValue(thread))) {
        return T;
      }
      return backward.inference_semantically_valid_dnf(dnf, propagation_mt);
    }
  }

  /** integerp; Reified microtheories whose spec-cardinality is at or below this
   threshold are considered to be sufficiently close to being a leaf microtheory
   as to warrant eager forward inference mt-pruning analysis.
   A negative value therefore disables this feature. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 36190)
  private static SubLSymbol $forward_leafy_mt_threshold$ = null;

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 36863)
  public static final SubLObject forward_propagation_supports_doomedP(SubLObject rule, SubLObject trigger_supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ($forward_leafy_mt_threshold$.getDynamicValue(thread).isNegative()) {
        return NIL;
      }
      {
        SubLObject mts = cons(assertions_high.assertion_mt(rule), Mapping.mapcar(Symbols.symbol_function($sym66$SUPPORT_MT), trigger_supports));
        mts = Sequences.delete($const9$InferencePSC, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        mts = Sequences.delete_duplicates(mts, Symbols.symbol_function($sym67$HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != list_utilities.lengthGE(mts, TWO_INTEGER, UNPROVIDED))) {
          mts = genl_mts.min_mts(mts, UNPROVIDED);
          if ((NIL != list_utilities.lengthGE(mts, TWO_INTEGER, UNPROVIDED))) {
            {
              SubLObject result = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36389");
              return result;
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 38676)
  public static final SubLObject compute_all_mt_and_support_combinations(SubLObject supports) {
    if ((NIL != some_support_combinations_extensionally_possible(supports))) {
      {
        SubLObject support_combinations = all_forward_support_mt_combinations(supports);
        SubLObject answer = NIL;
        SubLObject cdolist_list_var = support_combinations;
        SubLObject support_combination = NIL;
        for (support_combination = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), support_combination = cdolist_list_var.first()) {
          support_combination = Sequences.delete_duplicates(support_combination, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
          {
            SubLObject mts = compute_mts_from_supports(support_combination, UNPROVIDED);
            answer = cons(list(mts, support_combination), answer);
          }
        }
        return Sequences.nreverse(answer);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 39443)
  public static final SubLObject compute_decontextualized_support_combinations(SubLObject supports) {
    if ((NIL != some_support_combinations_theoretically_possible(supports))) {
      {
        SubLObject support_combinations = all_forward_support_mt_combinations(supports);
        SubLObject answer = NIL;
        SubLObject cdolist_list_var = support_combinations;
        SubLObject support_combination = NIL;
        for (support_combination = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), support_combination = cdolist_list_var.first()) {
          support_combination = Sequences.delete_duplicates(support_combination, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
          answer = cons(support_combination, answer);
        }
        return Sequences.nreverse(answer);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 39998)
  public static SubLSymbol $verify_some_support_combinations_possible$ = null;

  /** We don't care whether there exists an mt that can see all the SUPPORTS,
but could there possibly exist one?  This should return t most of the time,
unless two of the supports are in negationMts of each other or something. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 40060)
  public static final SubLObject some_support_combinations_theoretically_possible(SubLObject supports) {
    return T;
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 40445)
  public static final SubLObject some_support_combinations_extensionally_possible(SubLObject supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $verify_some_support_combinations_possible$.getDynamicValue(thread))) {
        return T;
      }
      supports = list_utilities.remove_if_not(Symbols.symbol_function($sym6$ASSERTION_P), supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if ((NIL == supports)) {
        return T;
      } else {
        {
          SubLObject mts = Mapping.mapcar(Symbols.symbol_function($sym72$ASSERTION_MT), supports);
          return inference_trampolines.inference_some_max_floor_mts(mts);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 40786)
  public static final SubLObject all_forward_support_mt_combinations(SubLObject supports) {
    if ((NIL == supports)) {
      return list(NIL);
    } else {
      {
        SubLObject datum = supports;
        SubLObject current = datum;
        SubLObject first = NIL;
        SubLObject rest = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list73);
        first = current.first();
        current = current.rest();
        rest = current;
        {
          SubLObject first_combos = forward_support_mt_combinations(first);
          if ((NIL != first_combos)) {
            {
              SubLObject rest_combos = all_forward_support_mt_combinations(rest);
              return list_utilities.mapcar_product(Symbols.symbol_function($sym74$CONS), first_combos, rest_combos);
            }
          } else {
            return NIL;
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 41180)
  public static final SubLObject forward_support_mt_combinations(SubLObject support) {
    if ((NIL != assertion_handles.assertion_p(support))) {
      return list(support);
    } else {
      return hl_supports.hl_forward_mt_combos(support);
    }
  }

  /** From SUPPORTS, compute the microtheories in which such an argument should be placed. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 41342)
  public static final SubLObject compute_mts_from_supports(SubLObject supports, SubLObject require_from_listP) {
    if ((require_from_listP == UNPROVIDED)) {
      require_from_listP = $require_cached_gaf_mt_from_supports$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject assume_wff_supports = separate_supports_for_mt_placement(supports);
        SubLObject compute_where_wff_supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        {
          SubLObject mts_from_assumed_wff_supports = Mapping.mapcar(Symbols.symbol_function($sym66$SUPPORT_MT), assume_wff_supports);
          if ((NIL == compute_where_wff_supports)) {
            return forward_mt_placements_from_support_mts(mts_from_assumed_wff_supports, require_from_listP);
          } else {
            {
              SubLObject additional_mt_combinations = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36383");
              SubLObject answer_mts = NIL;
              SubLObject cdolist_list_var = additional_mt_combinations;
              SubLObject additional_mts = NIL;
              for (additional_mts = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), additional_mts = cdolist_list_var.first()) {
                answer_mts = conses_high.union(answer_mts, forward_mt_placements_from_support_mts(ConsesLow.append(additional_mts, mts_from_assumed_wff_supports), require_from_listP), UNPROVIDED, UNPROVIDED);
              }
              if ((NIL != answer_mts)) {
                answer_mts = list_utilities.delete_subsumed_items(answer_mts, Symbols.symbol_function($sym75$SPEC_MT_), UNPROVIDED);
                return answer_mts;
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Separate SUPPORTS into two lists, which are returned as multiple values:
   @return 0 ; supports where we can safely assume the support is WFF.
   @return 1 ; supports where can must compute the mts where the support is WFF. */
  @SubL(source = "cycl/inference/harness/forward.lisp", position = 42422)
  public static final SubLObject separate_supports_for_mt_placement(SubLObject supports) {
    {
      SubLObject assume_wff_supports = NIL;
      SubLObject compute_where_wff_supports = NIL;
      SubLObject cdolist_list_var = supports;
      SubLObject support = NIL;
      for (support = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), support = cdolist_list_var.first()) {
        if ((NIL != assertion_handles.assertion_p(support))) {
          if ((NIL != function_terms.term_of_unit_assertion_p(support))) {
            compute_where_wff_supports = cons(support, compute_where_wff_supports);
          } else {
            assume_wff_supports = cons(support, assume_wff_supports);
          }
        } else {
          if ((NIL != el_utilities.tou_litP(arguments.support_formula(support)))) {
            compute_where_wff_supports = cons(support, compute_where_wff_supports);
          } else {
            assume_wff_supports = cons(support, assume_wff_supports);
          }
        }
      }
      return Values.values(Sequences.nreverse(assume_wff_supports), Sequences.nreverse(compute_where_wff_supports));
    }
  }

  @SubL(source = "cycl/inference/harness/forward.lisp", position = 43287)
  public static final SubLObject forward_mt_placements_from_support_mts(SubLObject mts, SubLObject require_from_listP) {
    if ((require_from_listP == UNPROVIDED)) {
      require_from_listP = NIL;
    }
    if ((NIL != kb_control_vars.within_forward_inferenceP())) {
      mts = Sequences.remove($const9$InferencePSC, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
    return inference_trampolines.inference_max_floor_mts_with_cycles_pruned(mts, ((NIL != require_from_listP) ? ((SubLObject) mts) : NIL));
  }

  public static final SubLObject declare_forward_file() {
    declareFunction(myName, "current_forward_inference_environment", "CURRENT-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
    declareFunction(myName, "get_forward_inference_environment", "GET-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
    declareFunction(myName, "free_forward_inference_enviornment", "FREE-FORWARD-INFERENCE-ENVIORNMENT", 1, 0, false);
    declareFunction(myName, "clear_forward_inference_environment", "CLEAR-FORWARD-INFERENCE-ENVIRONMENT", 1, 0, false);
    declareFunction(myName, "new_forward_inference_environment", "NEW-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
    declareFunction(myName, "initialize_forward_inference_environment", "INITIALIZE-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
    declareMacro(myName, "with_forward_inference_gaf", "WITH-FORWARD-INFERENCE-GAF");
    declareMacro(myName, "with_forward_inference_rule", "WITH-FORWARD-INFERENCE-RULE");
    declareFunction(myName, "current_forward_inference_gaf", "CURRENT-FORWARD-INFERENCE-GAF", 0, 0, false);
    declareFunction(myName, "current_forward_inference_rule", "CURRENT-FORWARD-INFERENCE-RULE", 0, 0, false);
    declareFunction(myName, "current_forward_inference_assertion", "CURRENT-FORWARD-INFERENCE-ASSERTION", 0, 0, false);
    declareFunction(myName, "new_forward_problem_store", "NEW-FORWARD-PROBLEM-STORE", 0, 0, false);
    declareFunction(myName, "destroy_forward_problem_store", "DESTROY-FORWARD-PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "forward_inference_shares_same_problem_storeP", "FORWARD-INFERENCE-SHARES-SAME-PROBLEM-STORE?", 0, 0, false);
    declareFunction(myName, "get_forward_problem_store", "GET-FORWARD-PROBLEM-STORE", 0, 0, false);
    declareFunction(myName, "clear_current_forward_problem_store", "CLEAR-CURRENT-FORWARD-PROBLEM-STORE", 0, 0, false);
    declareFunction(myName, "clear_current_forward_inference_environment", "CLEAR-CURRENT-FORWARD-INFERENCE-ENVIRONMENT", 0, 0, false);
    declareFunction(myName, "queue_forward_assertion", "QUEUE-FORWARD-ASSERTION", 1, 0, false);
    declareFunction(myName, "remqueue_forward_assertion", "REMQUEUE-FORWARD-ASSERTION", 1, 0, false);
    declareFunction(myName, "perform_forward_inference", "PERFORM-FORWARD-INFERENCE", 0, 0, false);
    declareFunction(myName, "repropagate_forward_assertion", "REPROPAGATE-FORWARD-ASSERTION", 1, 0, false);
    declareFunction(myName, "forward_inference_assertibles_queue", "FORWARD-INFERENCE-ASSERTIBLES-QUEUE", 0, 0, false);
    declareFunction(myName, "note_new_forward_assertible", "NOTE-NEW-FORWARD-ASSERTIBLE", 1, 0, false);
    declareFunction(myName, "forward_propagate_assertion", "FORWARD-PROPAGATE-ASSERTION", 1, 1, false);
    declareFunction(myName, "forward_propagate_rule", "FORWARD-PROPAGATE-RULE", 2, 0, false);
    declareFunction(myName, "forward_propagate_gaf", "FORWARD-PROPAGATE-GAF", 2, 0, false);
    declareFunction(myName, "forward_propagate_gaf_expansions", "FORWARD-PROPAGATE-GAF-EXPANSIONS", 4, 0, false);
    declareFunction(myName, "make_forward_trigger_supports", "MAKE-FORWARD-TRIGGER-SUPPORTS", 2, 0, false);
    declareFunction(myName, "forward_inference_allowed_rules", "FORWARD-INFERENCE-ALLOWED-RULES", 0, 0, false);
    declareFunction(myName, "forward_inference_all_rules_allowedP", "FORWARD-INFERENCE-ALL-RULES-ALLOWED?", 0, 0, false);
    declareFunction(myName, "forward_inference_rule_allowedP", "FORWARD-INFERENCE-RULE-ALLOWED?", 1, 0, false);
    declareFunction(myName, "forward_propagate_gaf_internal", "FORWARD-PROPAGATE-GAF-INTERNAL", 6, 0, false);
    declareFunction(myName, "handle_forward_propagation_from_gaf", "HANDLE-FORWARD-PROPAGATION-FROM-GAF", 8, 0, false);
    declareFunction(myName, "creation_template_forward_rules_via_exemplars", "CREATION-TEMPLATE-FORWARD-RULES-VIA-EXEMPLARS", 1, 0, false);
    declareFunction(myName, "creation_template_exemplars", "CREATION-TEMPLATE-EXEMPLARS", 1, 0, false);
    declareFunction(myName, "creation_template_allowable_rules", "CREATION-TEMPLATE-ALLOWABLE-RULES", 1, 0, false);
    declareFunction(myName, "all_genl_creation_templates", "ALL-GENL-CREATION-TEMPLATES", 1, 0, false);
    declareFunction(myName, "creation_template_allowable_rules_internal", "CREATION-TEMPLATE-ALLOWABLE-RULES-INTERNAL", 1, 0, false);
    declareFunction(myName, "handle_forward_propagation", "HANDLE-FORWARD-PROPAGATION", 6, 0, false);
    declareFunction(myName, "handle_one_forward_propagation", "HANDLE-ONE-FORWARD-PROPAGATION", 8, 0, false);
    declareFunction(myName, "filter_forward_pragmatic_dnf", "FILTER-FORWARD-PRAGMATIC-DNF", 1, 0, false);
    declareFunction(myName, "forward_propagate_dnf", "FORWARD-PROPAGATE-DNF", 8, 0, false);
    declareFunction(myName, "new_forward_query_from_dnf", "NEW-FORWARD-QUERY-FROM-DNF", 3, 1, false);
    declareFunction(myName, "new_cyc_trivial_forward_query_from_dnf", "NEW-CYC-TRIVIAL-FORWARD-QUERY-FROM-DNF", 2, 2, false);
    declareFunction(myName, "new_forward_query", "NEW-FORWARD-QUERY", 1, 2, false);
    declareFunction(myName, "forward_inference_query_properties", "FORWARD-INFERENCE-QUERY-PROPERTIES", 1, 1, false);
    declareFunction(myName, "trivial_forward_inference_query_properties", "TRIVIAL-FORWARD-INFERENCE-QUERY-PROPERTIES", 1, 1, false);
    declareFunction(myName, "add_forward_propagation_result", "ADD-FORWARD-PROPAGATION-RESULT", 7, 0, false);
    declareFunction(myName, "add_empty_forward_propagation_result", "ADD-EMPTY-FORWARD-PROPAGATION-RESULT", 6, 0, false);
    declareFunction(myName, "new_forward_concluded_supports", "NEW-FORWARD-CONCLUDED-SUPPORTS", 2, 1, false);
    declareFunction(myName, "add_forward_deductions_from_supports", "ADD-FORWARD-DEDUCTIONS-FROM-SUPPORTS", 4, 0, false);
    declareFunction(myName, "handle_forward_deduction_in_mt", "HANDLE-FORWARD-DEDUCTION-IN-MT", 4, 0, false);
    declareFunction(myName, "handle_forward_deduction_in_mt_as_assertible", "HANDLE-FORWARD-DEDUCTION-IN-MT-AS-ASSERTIBLE", 4, 0, false);
    declareFunction(myName, "handle_forward_deduction_in_mt_as_assertible_int", "HANDLE-FORWARD-DEDUCTION-IN-MT-AS-ASSERTIBLE-INT", 3, 1, false);
    declareFunction(myName, "constraint_ruleP", "CONSTRAINT-RULE?", 1, 1, false);
    declareFunction(myName, "handle_forward_deduction_in_mt_as_constraint", "HANDLE-FORWARD-DEDUCTION-IN-MT-AS-CONSTRAINT", 4, 0, false);
    declareFunction(myName, "verify_forward_deduction_constraint", "VERIFY-FORWARD-DEDUCTION-CONSTRAINT", 2, 0, false);
    declareFunction(myName, "syntactically_valid_forward_non_trigger_asents", "SYNTACTICALLY-VALID-FORWARD-NON-TRIGGER-ASENTS", 1, 0, false);
    declareFunction(myName, "semantically_valid_forward_dnf", "SEMANTICALLY-VALID-FORWARD-DNF", 2, 0, false);
    declareFunction(myName, "forward_leafy_mt_p", "FORWARD-LEAFY-MT-P", 1, 0, false);
    declareFunction(myName, "forward_propagation_supports_doomedP", "FORWARD-PROPAGATION-SUPPORTS-DOOMED?", 2, 0, false);
    declareFunction(myName, "forward_propagation_mts_doomedP", "FORWARD-PROPAGATION-MTS-DOOMED?", 1, 0, false);
    declareFunction(myName, "forward_possibly_some_common_spec_mtP_internal", "FORWARD-POSSIBLY-SOME-COMMON-SPEC-MT?-INTERNAL", 1, 0, false);
    declareFunction(myName, "forward_possibly_some_common_spec_mtP", "FORWARD-POSSIBLY-SOME-COMMON-SPEC-MT?", 1, 0, false);
    declareFunction(myName, "leafy_mt_p", "LEAFY-MT-P", 1, 1, false);
    declareFunction(myName, "compute_all_mt_and_support_combinations", "COMPUTE-ALL-MT-AND-SUPPORT-COMBINATIONS", 1, 0, false);
    declareFunction(myName, "compute_decontextualized_support_combinations", "COMPUTE-DECONTEXTUALIZED-SUPPORT-COMBINATIONS", 1, 0, false);
    declareFunction(myName, "some_support_combinations_theoretically_possible", "SOME-SUPPORT-COMBINATIONS-THEORETICALLY-POSSIBLE", 1, 0, false);
    declareFunction(myName, "some_support_combinations_extensionally_possible", "SOME-SUPPORT-COMBINATIONS-EXTENSIONALLY-POSSIBLE", 1, 0, false);
    declareFunction(myName, "all_forward_support_mt_combinations", "ALL-FORWARD-SUPPORT-MT-COMBINATIONS", 1, 0, false);
    declareFunction(myName, "forward_support_mt_combinations", "FORWARD-SUPPORT-MT-COMBINATIONS", 1, 0, false);
    declareFunction(myName, "compute_mts_from_supports", "COMPUTE-MTS-FROM-SUPPORTS", 1, 1, false);
    declareFunction(myName, "separate_supports_for_mt_placement", "SEPARATE-SUPPORTS-FOR-MT-PLACEMENT", 1, 0, false);
    declareFunction(myName, "forward_mt_placements_from_support_mts", "FORWARD-MT-PLACEMENTS-FROM-SUPPORT-MTS", 1, 1, false);
    declareFunction(myName, "all_computed_wff_mt_combinations", "ALL-COMPUTED-WFF-MT-COMBINATIONS", 1, 0, false);
    declareFunction(myName, "computed_wff_mt_combinations", "COMPUTED-WFF-MT-COMBINATIONS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_forward_file() {
    $require_cached_gaf_mt_from_supports$ = defparameter("*REQUIRE-CACHED-GAF-MT-FROM-SUPPORTS*", NIL);
    $forward_inference_browsing_callback$ = defvar("*FORWARD-INFERENCE-BROWSING-CALLBACK*", NIL);
    $forward_inference_browsing_callback_more_infoP$ = defparameter("*FORWARD-INFERENCE-BROWSING-CALLBACK-MORE-INFO?*", NIL);
    $block_forward_inferencesP$ = defvar("*BLOCK-FORWARD-INFERENCES?*", NIL);
    $tracing_forward_inference$ = defparameter("*TRACING-FORWARD-INFERENCE*", NIL);
    $forward_inference_gaf$ = defparameter("*FORWARD-INFERENCE-GAF*", NIL);
    $forward_inference_rule$ = defparameter("*FORWARD-INFERENCE-RULE*", NIL);
    $forward_problem_store_properties$ = deflexical("*FORWARD-PROBLEM-STORE-PROPERTIES*", $list5);
    $forward_inference_shares_same_problem_storeP$ = defparameter("*FORWARD-INFERENCE-SHARES-SAME-PROBLEM-STORE?*", T);
    $forward_inference_recursion_depth$ = defparameter("*FORWARD-INFERENCE-RECURSION-DEPTH*", ZERO_INTEGER);
    $forward_inference_assertibles_queue$ = defparameter("*FORWARD-INFERENCE-ASSERTIBLES-QUEUE*", NIL);
    $type_filter_forward_dnf$ = defparameter("*TYPE-FILTER-FORWARD-DNF*", T);
    $forward_non_trigger_literal_restricted_examine_asent$ = defparameter("*FORWARD-NON-TRIGGER-LITERAL-RESTRICTED-EXAMINE-ASENT*", NIL);
    $assume_forward_deduction_is_wfP$ = defvar("*ASSUME-FORWARD-DEDUCTION-IS-WF?*", NIL);
    $forward_constraint_inference_enabledP$ = defvar("*FORWARD-CONSTRAINT-INFERENCE-ENABLED?*", NIL);
    $forward_non_trigger_literal_pruning_enabledP$ = defvar("*FORWARD-NON-TRIGGER-LITERAL-PRUNING-ENABLED?*", T);
    $forward_leafy_mt_threshold$ = defparameter("*FORWARD-LEAFY-MT-THRESHOLD*", MINUS_ONE_INTEGER);
    $verify_some_support_combinations_possible$ = defparameter("*VERIFY-SOME-SUPPORT-COMBINATIONS-POSSIBLE*", T);
    return NIL;
  }

  public static final SubLObject setup_forward_file() {
        initialize_forward_inference_environment();
    memoization_state.note_memoized_function($sym69$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("GAF"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym2$_FORWARD_INFERENCE_GAF_ = makeSymbol("*FORWARD-INFERENCE-GAF*");
  public static final SubLList $list3 = list(makeSymbol("RULE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym4$_FORWARD_INFERENCE_RULE_ = makeSymbol("*FORWARD-INFERENCE-RULE*");
  public static final SubLList $list5 = list(new SubLObject[] {makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("NONE"), makeKeyword("NEGATION-BY-FAILURE?"), NIL, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("DIRECTION"), makeKeyword("FORWARD")});
  public static final SubLSymbol $sym6$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLString $str7$___S = makeString("~%~S");
  public static final SubLString $str8$Forward_inference_recursion_probl = makeString("Forward inference recursion problem? depth = ~S");
  public static final SubLObject $const9$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLString $str10$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLString $str11$_s_was_removed_by_its_own_forward = makeString("~s was removed by its own forward propagation");
  public static final SubLSymbol $sym12$INVALID_ASSERTION_ = makeSymbol("INVALID-ASSERTION?");
  public static final SubLString $str13$invalid_hl_assertible__s_encounte = makeString("invalid hl-assertible ~s encountered during forward inference");
  public static final SubLSymbol $kw14$POS = makeKeyword("POS");
  public static final SubLList $list15 = list(makeSymbol("TRIGGER-ASENT"), makeSymbol("TRIGGER-SENSE"), makeSymbol("EXAMINE-ASENT"), makeSymbol("EXAMINE-SENSE"), makeSymbol("RULE"), makeSymbol("&OPTIONAL"), makeSymbol("ADDITIONAL-SUPPORTS"));
  public static final SubLSymbol $kw16$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw17$ALL = makeKeyword("ALL");
  public static final SubLObject $const18$creationTemplateFORTs = constant_handles.reader_make_constant_shell(makeString("creationTemplateFORTs"));
  public static final SubLSymbol $kw19$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym20$_TEMPLATE = makeSymbol("?TEMPLATE");
  public static final SubLObject $const21$genlCreationTemplate = constant_handles.reader_make_constant_shell(makeString("genlCreationTemplate"));
  public static final SubLList $list22 = list(makeSymbol("?TEMPLATE"));
  public static final SubLObject $const23$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const24$creationTemplateAllowableRules = constant_handles.reader_make_constant_shell(makeString("creationTemplateAllowableRules"));
  public static final SubLObject $const25$creationTemplateAllowsAllRulesFro = constant_handles.reader_make_constant_shell(makeString("creationTemplateAllowsAllRulesFromMt"));
  public static final SubLSymbol $kw26$MT = makeKeyword("MT");
  public static final SubLSymbol $kw27$RULE = makeKeyword("RULE");
  public static final SubLSymbol $kw28$BROAD_MT = makeKeyword("BROAD-MT");
  public static final SubLString $str29$do_broad_mt_index = makeString("do-broad-mt-index");
  public static final SubLSymbol $sym30$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw31$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw32$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $kw33$INFERENCE_REJECTED = makeKeyword("INFERENCE-REJECTED");
  public static final SubLSymbol $sym34$FORWARD_NON_TRIGGER_LITERAL_LIT_ = makeSymbol("FORWARD-NON-TRIGGER-LITERAL-LIT?");
  public static final SubLSymbol $kw35$TARGET_ASENT = makeKeyword("TARGET-ASENT");
  public static final SubLSymbol $kw36$TARGET_TRUTH = makeKeyword("TARGET-TRUTH");
  public static final SubLSymbol $kw37$TRIGGER_BINDINGS = makeKeyword("TRIGGER-BINDINGS");
  public static final SubLSymbol $kw38$TRIGGER_SUPPORTS = makeKeyword("TRIGGER-SUPPORTS");
  public static final SubLSymbol $kw39$FORWARD_RESULTS = makeKeyword("FORWARD-RESULTS");
  public static final SubLString $str40$Tried_to_do_forward_inference_out = makeString("Tried to do forward inference outside of a problem store");
  public static final SubLSymbol $kw41$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
  public static final SubLSymbol $kw42$NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");
  public static final SubLSymbol $kw43$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
  public static final SubLSymbol $kw44$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $kw45$BLOCK_ = makeKeyword("BLOCK?");
  public static final SubLSymbol $kw46$PRODUCTIVITY_LIMIT = makeKeyword("PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $kw47$PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
  public static final SubLSymbol $kw48$MAX_TIME = makeKeyword("MAX-TIME");
  public static final SubLSymbol $kw49$RESULT_UNIQUENESS = makeKeyword("RESULT-UNIQUENESS");
  public static final SubLSymbol $kw50$PROOF = makeKeyword("PROOF");
  public static final SubLSymbol $kw51$RETURN = makeKeyword("RETURN");
  public static final SubLSymbol $kw52$BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
  public static final SubLSymbol $kw53$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");
  public static final SubLList $list54 = list(makeSymbol("INFERENCE-BINDINGS"), makeSymbol("INFERENCE-SUPPORTS"));
  public static final SubLList $list55 = list(NIL, NIL);
  public static final SubLList $list56 = list(makeSymbol("CONCLUDED-MTS"), makeSymbol("SUPPORT-COMBINATION"));
  public static final SubLList $list57 = list(makeSymbol("RULE"), makeSymbol("&REST"), makeSymbol("OTHER-SUPPORTS"));
  public static final SubLString $str58$Canonicalization_of__s_in__s_inva = makeString("Canonicalization of ~s in ~s invalidated the forward supports ~s");
  public static final SubLList $list59 = list(makeSymbol("CANON-CNF"), makeSymbol("&OPTIONAL"), makeSymbol("BINDING-LIST"));
  public static final SubLSymbol $sym60$CNF_P = makeSymbol("CNF-P");
  public static final SubLSymbol $kw61$FORWARD = makeKeyword("FORWARD");
  public static final SubLObject $const62$constraint = constant_handles.reader_make_constant_shell(makeString("constraint"));
  public static final SubLObject $const63$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLObject $const64$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLObject $const65$forwardNonTriggerLiteral = constant_handles.reader_make_constant_shell(makeString("forwardNonTriggerLiteral"));
  public static final SubLSymbol $sym66$SUPPORT_MT = makeSymbol("SUPPORT-MT");
  public static final SubLSymbol $sym67$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
  public static final SubLSymbol $sym68$FORWARD_LEAFY_MT_P = makeSymbol("FORWARD-LEAFY-MT-P");
  public static final SubLSymbol $sym69$FORWARD_POSSIBLY_SOME_COMMON_SPEC_MT_ = makeSymbol("FORWARD-POSSIBLY-SOME-COMMON-SPEC-MT?");
  public static final SubLList $list70 = list(makeSymbol("LEAFY-MT"), makeSymbol("&REST"), makeSymbol("OTHER-LEAFY-MTS"));
  public static final SubLSymbol $kw71$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym72$ASSERTION_MT = makeSymbol("ASSERTION-MT");
  public static final SubLList $list73 = cons(makeSymbol("FIRST"), makeSymbol("REST"));
  public static final SubLSymbol $sym74$CONS = makeSymbol("CONS");
  public static final SubLSymbol $sym75$SPEC_MT_ = makeSymbol("SPEC-MT?");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_forward_file();
  }

  @Override
  public void initializeVariables() {
    init_forward_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_forward_file();
  }

}
