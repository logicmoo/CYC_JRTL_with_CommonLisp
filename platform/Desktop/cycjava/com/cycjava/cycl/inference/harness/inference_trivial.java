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
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class inference_trivial extends SubLTranslatedFile {

  //// Constructor

  private inference_trivial() {}
  public static final SubLFile me = new inference_trivial();
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_trivial";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 3639) 
  public static final SubLObject new_cyc_trivial_query_int(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      query_properties = trivial_strategist_strengthen_query_properties(query_properties);
      if ((NIL != trivial_strategist_can_handle_query_propertiesP(query_properties))) {
        {
          SubLObject trivial_query_properties = list_utilities.filter_plist(query_properties, $sym8$TRIVIAL_STRATEGIST_AT_LEAST_PARTIALLY_HANDLED_QUERY_PROPERTY_P);
          thread.resetMultipleValues();
          {
            SubLObject sentence_clauses = inference_czer.inference_canonicalize_ask_int(sentence, mt, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
            SubLObject v_bindings = thread.secondMultipleValue();
            SubLObject free_el_vars = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != clause_utilities.atomic_clauses_p(sentence_clauses))) {
              {
                SubLObject sentence_clause = sentence_clauses.first();
                SubLObject free_hl_vars = bindings.apply_bindings(v_bindings, free_el_vars);
                inference_analysis.possibly_enqueue_asked_query(sentence, mt, query_properties);
                return new_cyc_trivial_query_via_removal_ask(sentence_clause, v_bindings, free_hl_vars, trivial_query_properties);
              }
            }
          }
        }
      }
      return Values.values(NIL, $kw9$NON_TRIVIAL, NIL);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 4717) 
  public static final SubLObject new_cyc_trivial_query_from_dnf_int(SubLObject dnf, SubLObject mt, SubLObject scoped_vars, SubLObject query_properties) {
    query_properties = trivial_strategist_strengthen_query_properties(query_properties);
    if ((NIL != trivial_strategist_can_handle_query_propertiesP(query_properties))) {
      {
        SubLObject trivial_query_properties = list_utilities.filter_plist(query_properties, $sym8$TRIVIAL_STRATEGIST_AT_LEAST_PARTIALLY_HANDLED_QUERY_PROPERTY_P);
        SubLObject sentence_clauses = inference_czer.dnf_and_mt_to_hl_query(dnf, mt);
        if ((NIL != clause_utilities.atomic_clauses_p(sentence_clauses))) {
          {
            SubLObject sentence_clause = sentence_clauses.first();
            SubLObject free_hl_vars = conses_high.set_difference(list_utilities.tree_gather(sentence_clause, $sym10$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED), scoped_vars, UNPROVIDED, UNPROVIDED);
            inference_analysis.possibly_enqueue_asked_query(dnf, mt, query_properties);
            return new_cyc_trivial_query_via_removal_ask(sentence_clause, NIL, free_hl_vars, trivial_query_properties);
          }
        }
      }
    }
    return Values.values(NIL, $kw9$NON_TRIVIAL, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 5658) 
  private static SubLSymbol $current_query_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 5744) 
  public static final SubLObject current_query_property_lookup(SubLObject property) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return inference_datastructures_enumerated_types.inference_query_property_lookup($current_query_properties$.getDynamicValue(thread), property);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 6093) 
  public static final SubLObject new_cyc_trivial_query_via_removal_ask(SubLObject sentence_clause, SubLObject v_bindings, SubLObject free_hl_vars, SubLObject trivial_query_properties) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject truth = ((NIL != clause_utilities.pos_atomic_clause_p(sentence_clause)) ? ((SubLObject) $kw11$TRUE) : $kw12$FALSE);
        SubLObject datum = clause_utilities.atomic_clause_asent(sentence_clause);
        SubLObject current = datum;
        SubLObject hl_mt = NIL;
        SubLObject hl_sentence = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list13);
        hl_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list13);
        hl_sentence = current.first();
        current = current.rest();
        if ((NIL == current)) {
          {
            SubLObject max_time = inference_datastructures_enumerated_types.inference_properties_max_time(trivial_query_properties);
            SubLObject return_type = inference_datastructures_enumerated_types.inference_properties_return_type(trivial_query_properties);
            SubLObject answer_language = inference_datastructures_enumerated_types.inference_properties_answer_language(trivial_query_properties);
            SubLObject productivity_limit = inference_datastructures_enumerated_types.strategy_dynamic_properties_productivity_limit(trivial_query_properties);
            SubLObject removal_ask_query_properties = list_utilities.filter_plist(trivial_query_properties, $sym14$REMOVAL_ASK_QUERY_PROPERTY_P);
            SubLObject result = NIL;
            SubLObject halt_reason = NIL;
            SubLObject metrics = NIL;
            {
              SubLObject _prev_bind_0 = $current_query_properties$.currentBinding(thread);
              SubLObject _prev_bind_1 = inference_worker.$currently_active_problem$.currentBinding(thread);
              SubLObject _prev_bind_2 = inference_worker.$currently_executing_tactic$.currentBinding(thread);
              try {
                $current_query_properties$.bind(trivial_query_properties, thread);
                inference_worker.$currently_active_problem$.bind(NIL, thread);
                inference_worker.$currently_executing_tactic$.bind(NIL, thread);
                {
                  SubLObject aborted_p = NIL;
                  try {
                    {
                      SubLObject _prev_bind_0_9 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
                      try {
                        inference_strategist.$within_inference_control_processP$.bind(T, thread);
                        {
                          SubLObject error_message = NIL;
                          if ((NIL != control_vars.$inference_debugP$.getDynamicValue(thread))) {
                            {
                              SubLObject abort_max_time = max_time;
                              if ((NIL != abort_max_time)) {
                                {
                                  SubLObject timed_out = NIL;
                                  SubLObject tag = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11359");
                                  try {
                                    {
                                      SubLObject _prev_bind_0_10 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                      try {
                                        subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                        {
                                          SubLObject timer = NIL;
                                          try {
                                            {
                                              SubLObject _prev_bind_0_11 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                              try {
                                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                timer = Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11368");
                                                {
                                                  SubLObject state = memoization_state.possibly_new_memoization_state();
                                                  SubLObject local_state = state;
                                                  {
                                                    SubLObject _prev_bind_0_12 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                Errors.error($str15$Invalid_attempt_to_reuse_memoizat);
                                                              }
                                                            }
                                                          }
                                                        }
                                                        try {
                                                          {
                                                            SubLObject _prev_bind_0_13 = control_vars.$removal_cost_cutoff$.currentBinding(thread);
                                                            try {
                                                              control_vars.$removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                                              thread.resetMultipleValues();
                                                              {
                                                                SubLObject result_14 = backward.removal_ask(hl_sentence, hl_mt, truth, removal_ask_query_properties);
                                                                SubLObject halt_reason_15 = thread.secondMultipleValue();
                                                                SubLObject metrics_16 = thread.thirdMultipleValue();
                                                                thread.resetMultipleValues();
                                                                result = result_14;
                                                                halt_reason = halt_reason_15;
                                                                metrics = metrics_16;
                                                              }
                                                            } finally {
                                                              control_vars.$removal_cost_cutoff$.rebind(_prev_bind_0_13, thread);
                                                            }
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
                                                      memoization_state.$memoization_state$.rebind(_prev_bind_0_12, thread);
                                                    }
                                                  }
                                                }
                                              } finally {
                                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_11, thread);
                                              }
                                            }
                                          } finally {
                                            {
                                              SubLObject _prev_bind_0_18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                              try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11376");
                                              } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_18, thread);
                                              }
                                            }
                                          }
                                        }
                                      } finally {
                                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_10, thread);
                                      }
                                    }
                                  } catch (Throwable ccatch_env_var) {
                                    timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                                  }
                                  if ((NIL != timed_out)) {
                                    halt_reason = $kw16$MAX_TIME;
                                  }
                                }
                              } else {
                                {
                                  SubLObject state = memoization_state.possibly_new_memoization_state();
                                  SubLObject local_state = state;
                                  {
                                    SubLObject _prev_bind_0_19 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                Errors.error($str15$Invalid_attempt_to_reuse_memoizat);
                                              }
                                            }
                                          }
                                        }
                                        try {
                                          {
                                            SubLObject _prev_bind_0_20 = control_vars.$removal_cost_cutoff$.currentBinding(thread);
                                            try {
                                              control_vars.$removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                              thread.resetMultipleValues();
                                              {
                                                SubLObject result_21 = backward.removal_ask(hl_sentence, hl_mt, truth, removal_ask_query_properties);
                                                SubLObject halt_reason_22 = thread.secondMultipleValue();
                                                SubLObject metrics_23 = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                result = result_21;
                                                halt_reason = halt_reason_22;
                                                metrics = metrics_23;
                                              }
                                            } finally {
                                              control_vars.$removal_cost_cutoff$.rebind(_prev_bind_0_20, thread);
                                            }
                                          }
                                        } finally {
                                          {
                                            SubLObject _prev_bind_0_24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                              if (((NIL != local_state)
                                                   && (NIL == original_memoization_process))) {
                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                              }
                                            } finally {
                                              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
                                            }
                                          }
                                        }
                                      }
                                    } finally {
                                      memoization_state.$memoization_state$.rebind(_prev_bind_0_19, thread);
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            try {
                              {
                                SubLObject _prev_bind_0_25 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                  Errors.$error_handler$.bind(Symbols.symbol_function($sym18$INFERENCE_ERROR_HANDLER), thread);
                                  try {
                                    {
                                      SubLObject abort_max_time = max_time;
                                      if ((NIL != abort_max_time)) {
                                        {
                                          SubLObject timed_out = NIL;
                                          SubLObject tag = Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11360");
                                          try {
                                            {
                                              SubLObject _prev_bind_0_26 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                              try {
                                                subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                                {
                                                  SubLObject timer = NIL;
                                                  try {
                                                    {
                                                      SubLObject _prev_bind_0_27 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                      try {
                                                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                        timer = Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11369");
                                                        {
                                                          SubLObject state = memoization_state.possibly_new_memoization_state();
                                                          SubLObject local_state = state;
                                                          {
                                                            SubLObject _prev_bind_0_28 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                        Errors.error($str15$Invalid_attempt_to_reuse_memoizat);
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                try {
                                                                  {
                                                                    SubLObject _prev_bind_0_29 = control_vars.$removal_cost_cutoff$.currentBinding(thread);
                                                                    try {
                                                                      control_vars.$removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                                                      thread.resetMultipleValues();
                                                                      {
                                                                        SubLObject result_30 = backward.removal_ask(hl_sentence, hl_mt, truth, removal_ask_query_properties);
                                                                        SubLObject halt_reason_31 = thread.secondMultipleValue();
                                                                        SubLObject metrics_32 = thread.thirdMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        result = result_30;
                                                                        halt_reason = halt_reason_31;
                                                                        metrics = metrics_32;
                                                                      }
                                                                    } finally {
                                                                      control_vars.$removal_cost_cutoff$.rebind(_prev_bind_0_29, thread);
                                                                    }
                                                                  }
                                                                } finally {
                                                                  {
                                                                    SubLObject _prev_bind_0_33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                                      if (((NIL != local_state)
                                                                           && (NIL == original_memoization_process))) {
                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                      }
                                                                    } finally {
                                                                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_33, thread);
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } finally {
                                                              memoization_state.$memoization_state$.rebind(_prev_bind_0_28, thread);
                                                            }
                                                          }
                                                        }
                                                      } finally {
                                                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_27, thread);
                                                      }
                                                    }
                                                  } finally {
                                                    {
                                                      SubLObject _prev_bind_0_34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                      try {
                                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                        Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11377");
                                                      } finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_34, thread);
                                                      }
                                                    }
                                                  }
                                                }
                                              } finally {
                                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_26, thread);
                                              }
                                            }
                                          } catch (Throwable ccatch_env_var) {
                                            timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                                          }
                                          if ((NIL != timed_out)) {
                                            halt_reason = $kw16$MAX_TIME;
                                          }
                                        }
                                      } else {
                                        {
                                          SubLObject state = memoization_state.possibly_new_memoization_state();
                                          SubLObject local_state = state;
                                          {
                                            SubLObject _prev_bind_0_35 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                        Errors.error($str15$Invalid_attempt_to_reuse_memoizat);
                                                      }
                                                    }
                                                  }
                                                }
                                                try {
                                                  {
                                                    SubLObject _prev_bind_0_36 = control_vars.$removal_cost_cutoff$.currentBinding(thread);
                                                    try {
                                                      control_vars.$removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                                      thread.resetMultipleValues();
                                                      {
                                                        SubLObject result_37 = backward.removal_ask(hl_sentence, hl_mt, truth, removal_ask_query_properties);
                                                        SubLObject halt_reason_38 = thread.secondMultipleValue();
                                                        SubLObject metrics_39 = thread.thirdMultipleValue();
                                                        thread.resetMultipleValues();
                                                        result = result_37;
                                                        halt_reason = halt_reason_38;
                                                        metrics = metrics_39;
                                                      }
                                                    } finally {
                                                      control_vars.$removal_cost_cutoff$.rebind(_prev_bind_0_36, thread);
                                                    }
                                                  }
                                                } finally {
                                                  {
                                                    SubLObject _prev_bind_0_40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                      if (((NIL != local_state)
                                                           && (NIL == original_memoization_process))) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                      }
                                                    } finally {
                                                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_40, thread);
                                                    }
                                                  }
                                                }
                                              }
                                            } finally {
                                              memoization_state.$memoization_state$.rebind(_prev_bind_0_35, thread);
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                  }
                                } finally {
                                  Errors.$error_handler$.rebind(_prev_bind_0_25, thread);
                                }
                              }
                            } catch (Throwable ccatch_env_var) {
                              error_message = Errors.handleThrowable(ccatch_env_var, $kw17$INFERENCE_ERROR);
                            }
                          }
                          if ((NIL != error_message)) {
                            halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message);
                          }
                        }
                      } finally {
                        inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0_9, thread);
                      }
                    }
                  } catch (Throwable ccatch_env_var) {
                    aborted_p = Errors.handleThrowable(ccatch_env_var, $kw4$INFERENCE_ABORT_TARGET);
                  }
                  if ((NIL != aborted_p)) {
                    halt_reason = $kw5$ABORT;
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35565");
                  }
                }
              } finally {
                inference_worker.$currently_executing_tactic$.rebind(_prev_bind_2, thread);
                inference_worker.$currently_active_problem$.rebind(_prev_bind_1, thread);
                $current_query_properties$.rebind(_prev_bind_0, thread);
              }
            }
            if ((NIL != result)) {
              result = removal_ask_filter_out_uninteresting_bindings(result, free_hl_vars);
              result = removal_ask_result_closed_query_success_ntransform(result);
              result = removal_ask_result_return_type_ntransform(result, v_bindings, return_type, answer_language);
            }
            return Values.values(result, halt_reason, metrics);
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list13);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 8273) 
  public static final SubLObject removal_ask_filter_out_uninteresting_bindings(SubLObject result, SubLObject free_vars) {
    {
      SubLObject filtered_result = NIL;
      SubLObject cdolist_list_var = result;
      SubLObject one_result = NIL;
      for (one_result = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), one_result = cdolist_list_var.first()) {
        {
          SubLObject datum = one_result;
          SubLObject current = datum;
          SubLObject one_bindings = NIL;
          SubLObject one_supports = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list19);
          one_bindings = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list19);
          one_supports = current.first();
          current = current.rest();
          if ((NIL == current)) {
            {
              SubLObject filtered_bindings = inference_strategist.filter_out_uninteresting_bindings(one_bindings, free_vars);
              filtered_result = cons(list(filtered_bindings, one_supports), filtered_result);
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list19);
          }
        }
      }
      return Sequences.nreverse(filtered_result);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 8680) 
  public static final SubLObject removal_ask_result_closed_query_success_ntransform(SubLObject result) {
    {
      SubLObject first_result = result.first();
      SubLObject datum = first_result;
      SubLObject current = datum;
      SubLObject first_bindings = NIL;
      SubLObject first_supports = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
      first_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
      first_supports = current.first();
      current = current.rest();
      if ((NIL == current)) {
        if ((NIL != bindings.unification_success_token_p(first_bindings))) {
          {
            SubLObject cdolist_list_var = result;
            SubLObject result_tuple = NIL;
            for (result_tuple = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), result_tuple = cdolist_list_var.first()) {
              ConsesLow.rplaca(result_tuple, NIL);
            }
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list20);
      }
    }
    return result;
  }

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 9107) 
  public static final SubLObject removal_ask_result_return_type_ntransform(SubLObject result, SubLObject v_bindings, SubLObject return_type, SubLObject answer_language) {
    {
      SubLObject pcase_var = return_type;
      if (pcase_var.eql($kw21$BINDINGS)) {
        result = list_utilities.nmapcar(Symbols.symbol_function($sym22$FIRST), result);
        result = bindings.napply_bindings_backwards_to_list(v_bindings, result);
        if (($kw23$EL == answer_language)) {
          result = list_utilities.nmapcar(Symbols.symbol_function($sym24$INFERENCE_BINDINGS_HL_TO_EL), result);
        }
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      } else if (pcase_var.eql($kw25$SUPPORTS)) {
        result = list_utilities.nmapcar(Symbols.symbol_function($sym26$SECOND), result);
      } else if (pcase_var.eql($kw27$BINDINGS_AND_SUPPORTS)) {
        result = bindings.napply_bindings_backwards_to_list(v_bindings, result);
        if (($kw23$EL == answer_language)) {
          {
            SubLObject cdolist_list_var = result;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tuple = cdolist_list_var.first()) {
              {
                SubLObject v_bindings_41 = tuple.first();
                ConsesLow.rplaca(tuple, inference_kernel.inference_bindings_hl_to_el(v_bindings_41));
              }
            }
          }
        }
      } else {
        if ((NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type))) {
          {
            SubLObject template = conses_high.second(return_type);
            result = removal_ask_result_return_type_ntransform(result, v_bindings, $kw21$BINDINGS, answer_language);
            result = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36250");
          }
        } else {
          Errors.error($str28$unexpected_return_type__S, return_type);
        }
      }
    }
    return result;
  }

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 10295) 
  public static final SubLObject trivial_strategist_can_handle_query_propertiesP(SubLObject query_properties) {
    {
      SubLObject remainder = NIL;
      for (remainder = query_properties; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
        {
          SubLObject property = remainder.first();
          SubLObject value = conses_high.cadr(remainder);
          if ((NIL == trivial_strategist_can_handle_query_propertyP(property, value))) {
            return NIL;
          }
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 10597) 
  public static final SubLObject trivial_strategist_strengthen_query_properties(SubLObject query_properties) {
    if ((NIL == inference_datastructures_enumerated_types.transformation_allowed_by_propertiesP(query_properties))) {
      query_properties = conses_high.remf(conses_high.copy_list(query_properties), $kw29$MAX_TRANSFORMATION_DEPTH);
    }
    {
      SubLObject pcase_var = inference_datastructures_enumerated_types.inference_properties_return_type(query_properties);
      if ((pcase_var.eql($kw25$SUPPORTS)
          || pcase_var.eql($kw27$BINDINGS_AND_SUPPORTS))) {
        query_properties = conses_high.putf(conses_high.copy_list(query_properties), $kw30$ANSWER_LANGUAGE, $kw31$HL);
      }
    }
    return query_properties;
  }

  /** Query properties whose value we don't care about for trivial-strategist. */
  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 11123) 
  private static SubLSymbol $trivial_strategist_dont_care_properties$ = null;

  /** Query properties that are forbidden to be non-nil if we're going to use trivial-strategist. */
  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 12077) 
  private static SubLSymbol $trivial_strategist_forbidden_properties$ = null;

  /** Query properties that are forbidden to be anything other than the default if we're going to use trivial-strategist. */
  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 12570) 
  private static SubLSymbol $trivial_strategist_forbid_non_default_properties$ = null;

  /** A list of query properties for which the trivial strategist can handle some
values but not others.  The handled and unhandled values are specified in
@xref trivial-strategist-query-property-unhandled-reason. */
  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 13016) 
  private static SubLSymbol $trivial_strategist_partially_handled_query_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 13456) 
  private static SubLSymbol $trivial_strategist_handled_query_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 13830) 
  public static final SubLObject trivial_strategist_handled_query_property_p(SubLObject object) {
    return list_utilities.member_eqP(object, $trivial_strategist_handled_query_properties$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 13975) 
  public static final SubLObject trivial_strategist_at_least_partially_handled_query_property_p(SubLObject object) {
    return makeBoolean(((NIL != trivial_strategist_handled_query_property_p(object))
          || (NIL != list_utilities.member_eqP(object, $trivial_strategist_partially_handled_query_properties$.getGlobalValue()))));
  }

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 14213) 
  public static final SubLObject trivial_strategist_can_handle_query_propertyP(SubLObject property, SubLObject value) {
    if ((NIL != list_utilities.member_eqP(property, $trivial_strategist_dont_care_properties$.getGlobalValue()))) {
      return T;
    } else if ((NIL != trivial_strategist_handled_query_property_p(property))) {
      return T;
    } else {
      return makeBoolean((NIL == trivial_strategist_query_property_unhandled_reason(property, value)));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-trivial.lisp", position = 14543) 
  public static final SubLObject trivial_strategist_query_property_unhandled_reason(SubLObject property, SubLObject value) {
    if ((NIL != list_utilities.member_eqP(property, $trivial_strategist_forbidden_properties$.getGlobalValue()))) {
      if ((NIL != value)) {
        return property;
      } else {
        return NIL;
      }
    }
    if ((NIL != list_utilities.member_eqP(property, $trivial_strategist_forbid_non_default_properties$.getGlobalValue()))) {
      if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36511"))) {
        return NIL;
      } else {
        return property;
      }
    }
    {
      SubLObject pcase_var = property;
      if (pcase_var.eql($kw29$MAX_TRANSFORMATION_DEPTH)) {
        return (ZERO_INTEGER.eql(value) ? ((SubLObject) NIL) : $kw37$NONZERO_MAX_TRANSFORMATION_DEPTH);
      } else if (pcase_var.eql($kw38$PROBLEM_STORE)) {
        return ((NIL == value) ? ((SubLObject) NIL) : $kw39$PROBLEM_STORE_PASSED_IN);
      } else if (pcase_var.eql($kw40$FORWARD_MAX_TIME)) {
        return (ZERO_INTEGER.eql(value) ? ((SubLObject) NIL) : $kw41$NONZERO_FORWARD_MAX_TIME);
      } else if (pcase_var.eql($kw42$RETURN)) {
        return ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35359")) ? ((SubLObject) NIL) : $kw43$UNHANDLED_RETURN_VALUE);
      } else if (pcase_var.eql($kw44$INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
        return (($kw45$NONE == value) ? ((SubLObject) NIL) : $kw44$INTERMEDIATE_STEP_VALIDATION_LEVEL);
      } else if (pcase_var.eql($kw46$INFERENCE_MODE)) {
        return ((NIL != list_utilities.member_eqP(value, $list47)) ? ((SubLObject) NIL) : $kw48$NON_TRIVIAL_INFERENCE_MODE);
      } else if (pcase_var.eql($kw49$METRICS)) {
        return (((NIL != list_utilities.member_eqP($kw50$INFERENCE_PROOF_SPEC, value))
              || (NIL != list_utilities.member_eqP($kw51$ANSWER_PROOF_SPECS, value))
              || (NIL != list_utilities.member_eqP($kw52$TOTAL_STEPS, value))) ? ((SubLObject) $kw53$UNHANDLED_METRIC) : NIL);
      } else {
        return $kw54$UNEXPECTED;
      }
    }
  }

  public static final SubLObject declare_inference_trivial_file() {
    declareFunction(myName, "new_cyc_trivial_query", "NEW-CYC-TRIVIAL-QUERY", 2, 1, false);
    declareFunction(myName, "new_cyc_trivial_query_from_dnf", "NEW-CYC-TRIVIAL-QUERY-FROM-DNF", 2, 2, false);
    declareFunction(myName, "new_cyc_trivial_query_int", "NEW-CYC-TRIVIAL-QUERY-INT", 3, 0, false);
    declareFunction(myName, "new_cyc_trivial_query_from_dnf_int", "NEW-CYC-TRIVIAL-QUERY-FROM-DNF-INT", 4, 0, false);
    declareFunction(myName, "current_query_property_lookup", "CURRENT-QUERY-PROPERTY-LOOKUP", 1, 0, false);
    declareFunction(myName, "current_trivial_query_properties", "CURRENT-TRIVIAL-QUERY-PROPERTIES", 0, 0, false);
    declareFunction(myName, "new_cyc_trivial_query_via_removal_ask", "NEW-CYC-TRIVIAL-QUERY-VIA-REMOVAL-ASK", 4, 0, false);
    declareFunction(myName, "removal_ask_filter_out_uninteresting_bindings", "REMOVAL-ASK-FILTER-OUT-UNINTERESTING-BINDINGS", 2, 0, false);
    declareFunction(myName, "removal_ask_result_closed_query_success_ntransform", "REMOVAL-ASK-RESULT-CLOSED-QUERY-SUCCESS-NTRANSFORM", 1, 0, false);
    declareFunction(myName, "removal_ask_result_return_type_ntransform", "REMOVAL-ASK-RESULT-RETURN-TYPE-NTRANSFORM", 4, 0, false);
    declareFunction(myName, "trivial_strategist_can_handle_query_propertiesP", "TRIVIAL-STRATEGIST-CAN-HANDLE-QUERY-PROPERTIES?", 1, 0, false);
    declareFunction(myName, "trivial_strategist_strengthen_query_properties", "TRIVIAL-STRATEGIST-STRENGTHEN-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "trivial_strategist_handled_query_property_p", "TRIVIAL-STRATEGIST-HANDLED-QUERY-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "trivial_strategist_at_least_partially_handled_query_property_p", "TRIVIAL-STRATEGIST-AT-LEAST-PARTIALLY-HANDLED-QUERY-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "trivial_strategist_can_handle_query_propertyP", "TRIVIAL-STRATEGIST-CAN-HANDLE-QUERY-PROPERTY?", 2, 0, false);
    declareFunction(myName, "trivial_strategist_query_property_unhandled_reason", "TRIVIAL-STRATEGIST-QUERY-PROPERTY-UNHANDLED-REASON", 2, 0, false);
    declareFunction(myName, "trivial_strategist_handled_return_valueP", "TRIVIAL-STRATEGIST-HANDLED-RETURN-VALUE?", 1, 0, false);
    declareFunction(myName, "trivial_strategist_unhandled_template_return_keyword_p", "TRIVIAL-STRATEGIST-UNHANDLED-TEMPLATE-RETURN-KEYWORD-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_trivial_file() {
    $current_query_properties$ = defparameter("*CURRENT-QUERY-PROPERTIES*", NIL);
    $trivial_strategist_dont_care_properties$ = deflexical("*TRIVIAL-STRATEGIST-DONT-CARE-PROPERTIES*", $list32);
    $trivial_strategist_forbidden_properties$ = deflexical("*TRIVIAL-STRATEGIST-FORBIDDEN-PROPERTIES*", $list33);
    $trivial_strategist_forbid_non_default_properties$ = deflexical("*TRIVIAL-STRATEGIST-FORBID-NON-DEFAULT-PROPERTIES*", $list34);
    $trivial_strategist_partially_handled_query_properties$ = deflexical("*TRIVIAL-STRATEGIST-PARTIALLY-HANDLED-QUERY-PROPERTIES*", $list35);
    $trivial_strategist_handled_query_properties$ = deflexical("*TRIVIAL-STRATEGIST-HANDLED-QUERY-PROPERTIES*", $list36);
    return NIL;
  }

  public static final SubLObject setup_inference_trivial_file() {
    // CVS_ID("Id: inference-trivial.lisp 128472 2009-08-03 20:27:37Z pace ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P");
  public static final SubLSymbol $sym1$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $sym2$QUERY_PROPERTY_P = makeSymbol("QUERY-PROPERTY-P");
  public static final SubLSymbol $sym3$POSSIBLY_MT_P = makeSymbol("POSSIBLY-MT-P");
  public static final SubLSymbol $kw4$INFERENCE_ABORT_TARGET = makeKeyword("INFERENCE-ABORT-TARGET");
  public static final SubLSymbol $kw5$ABORT = makeKeyword("ABORT");
  public static final SubLSymbol $sym6$CLAUSE_P = makeSymbol("CLAUSE-P");
  public static final SubLSymbol $sym7$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym8$TRIVIAL_STRATEGIST_AT_LEAST_PARTIALLY_HANDLED_QUERY_PROPERTY_P = makeSymbol("TRIVIAL-STRATEGIST-AT-LEAST-PARTIALLY-HANDLED-QUERY-PROPERTY-P");
  public static final SubLSymbol $kw9$NON_TRIVIAL = makeKeyword("NON-TRIVIAL");
  public static final SubLSymbol $sym10$HL_VARIABLE_P = makeSymbol("HL-VARIABLE-P");
  public static final SubLSymbol $kw11$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw12$FALSE = makeKeyword("FALSE");
  public static final SubLList $list13 = list(makeSymbol("HL-MT"), makeSymbol("HL-SENTENCE"));
  public static final SubLSymbol $sym14$REMOVAL_ASK_QUERY_PROPERTY_P = makeSymbol("REMOVAL-ASK-QUERY-PROPERTY-P");
  public static final SubLString $str15$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLSymbol $kw16$MAX_TIME = makeKeyword("MAX-TIME");
  public static final SubLSymbol $kw17$INFERENCE_ERROR = makeKeyword("INFERENCE-ERROR");
  public static final SubLSymbol $sym18$INFERENCE_ERROR_HANDLER = makeSymbol("INFERENCE-ERROR-HANDLER");
  public static final SubLList $list19 = list(makeSymbol("ONE-BINDINGS"), makeSymbol("ONE-SUPPORTS"));
  public static final SubLList $list20 = list(makeSymbol("FIRST-BINDINGS"), makeSymbol("FIRST-SUPPORTS"));
  public static final SubLSymbol $kw21$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $sym22$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $kw23$EL = makeKeyword("EL");
  public static final SubLSymbol $sym24$INFERENCE_BINDINGS_HL_TO_EL = makeSymbol("INFERENCE-BINDINGS-HL-TO-EL");
  public static final SubLSymbol $kw25$SUPPORTS = makeKeyword("SUPPORTS");
  public static final SubLSymbol $sym26$SECOND = makeSymbol("SECOND");
  public static final SubLSymbol $kw27$BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
  public static final SubLString $str28$unexpected_return_type__S = makeString("unexpected return type ~S");
  public static final SubLSymbol $kw29$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw30$ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
  public static final SubLSymbol $kw31$HL = makeKeyword("HL");
  public static final SubLList $list32 = list(new SubLObject[] {makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOWED-RULES"), makeKeyword("FORBIDDEN-RULES"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("RESULT-UNIQUENESS")});
  public static final SubLList $list33 = list(new SubLObject[] {makeKeyword("CONDITIONAL-SENTENCE?"), makeKeyword("NON-EXPLANATORY-SENTENCE"), makeKeyword("MAINTAIN-TERM-WORKING-SET?"), makeKeyword("CACHE-INFERENCE-RESULTS?"), makeKeyword("BROWSABLE?"), makeKeyword("CONTINUABLE?"), makeKeyword("BLOCK?"), makeKeyword("PROBLEM-STORE-NAME"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("FORGET-EXTRA-RESULTS?")});
  public static final SubLList $list34 = list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("DIRECTION"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REMOVAL-ALLOWED?"));
  public static final SubLList $list35 = list(makeKeyword("RETURN"), makeKeyword("INFERENCE-MODE"), makeKeyword("METRICS"));
  public static final SubLList $list36 = list(makeKeyword("MAX-TIME"), makeKeyword("MAX-NUMBER"), makeKeyword("ALLOWED-MODULES"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"));
  public static final SubLSymbol $kw37$NONZERO_MAX_TRANSFORMATION_DEPTH = makeKeyword("NONZERO-MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw38$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
  public static final SubLSymbol $kw39$PROBLEM_STORE_PASSED_IN = makeKeyword("PROBLEM-STORE-PASSED-IN");
  public static final SubLSymbol $kw40$FORWARD_MAX_TIME = makeKeyword("FORWARD-MAX-TIME");
  public static final SubLSymbol $kw41$NONZERO_FORWARD_MAX_TIME = makeKeyword("NONZERO-FORWARD-MAX-TIME");
  public static final SubLSymbol $kw42$RETURN = makeKeyword("RETURN");
  public static final SubLSymbol $kw43$UNHANDLED_RETURN_VALUE = makeKeyword("UNHANDLED-RETURN-VALUE");
  public static final SubLSymbol $kw44$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
  public static final SubLSymbol $kw45$NONE = makeKeyword("NONE");
  public static final SubLSymbol $kw46$INFERENCE_MODE = makeKeyword("INFERENCE-MODE");
  public static final SubLList $list47 = list(makeKeyword("MINIMAL"), makeKeyword("CUSTOM"));
  public static final SubLSymbol $kw48$NON_TRIVIAL_INFERENCE_MODE = makeKeyword("NON-TRIVIAL-INFERENCE-MODE");
  public static final SubLSymbol $kw49$METRICS = makeKeyword("METRICS");
  public static final SubLSymbol $kw50$INFERENCE_PROOF_SPEC = makeKeyword("INFERENCE-PROOF-SPEC");
  public static final SubLSymbol $kw51$ANSWER_PROOF_SPECS = makeKeyword("ANSWER-PROOF-SPECS");
  public static final SubLSymbol $kw52$TOTAL_STEPS = makeKeyword("TOTAL-STEPS");
  public static final SubLSymbol $kw53$UNHANDLED_METRIC = makeKeyword("UNHANDLED-METRIC");
  public static final SubLSymbol $kw54$UNEXPECTED = makeKeyword("UNEXPECTED");
  public static final SubLList $list55 = list(makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"), makeKeyword("BINDINGS-AND-SUPPORTS"));
  public static final SubLSymbol $sym56$TRIVIAL_STRATEGIST_UNHANDLED_TEMPLATE_RETURN_KEYWORD_P = makeSymbol("TRIVIAL-STRATEGIST-UNHANDLED-TEMPLATE-RETURN-KEYWORD-P");
  public static final SubLList $list57 = list(makeKeyword("SUPPORTS"));

  //// Initializers

  public void declareFunctions() {
    declare_inference_trivial_file();
  }

  public void initializeVariables() {
    init_inference_trivial_file();
  }

  public void runTopLevelForms() {
    setup_inference_trivial_file();
  }

}
