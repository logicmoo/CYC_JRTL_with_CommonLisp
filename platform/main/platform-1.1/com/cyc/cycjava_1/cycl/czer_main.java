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

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_utilities;
//dm import com.cyc.cycjava_1.cycl.at_var_types;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.canon_tl;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.clausifier;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cyc_kernel;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_graph;
//dm import com.cyc.cycjava_1.cycl.czer_meta;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.inference.harness.forward;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.hlmt_czer;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.ke;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.psc;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.rule_macros;
//dm import com.cyc.cycjava_1.cycl.simplifier;
//dm import com.cyc.cycjava_1.cycl.skolems;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_parameters;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.wff;
//dm import com.cyc.cycjava_1.cycl.wff_utilities;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class czer_main extends SubLTranslatedFile {

  //// Constructor

  private czer_main() {}
  public static final SubLFile me = new czer_main();
  public static final String myName = "com.cyc.cycjava_1.cycl.czer_main";

  //// Definitions

  /** Converts the EL term TERM to its canonical HL representation.
   @return HL term */
  @SubL(source = "cycl/czer-main.lisp", position = 3246) 
  public static final SubLObject canonicalize_term(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
          mt_relevance_macros.$mt$.bind(mt, thread);
          if ((NIL != el_utilities.el_formula_p(v_term))) {
            v_term = el_utilities.copy_formula(v_term);
          }
          {
            SubLObject _prev_bind_0_1 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
            SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
            try {
              czer_vars.$el_symbol_suffix_table$.bind(Hashtables.make_hash_table(FOUR_INTEGER, Symbols.symbol_function(EQL), UNPROVIDED), thread);
              czer_vars.$standardize_variables_memory$.bind(NIL, thread);
              v_term = simplifier.simplify_sequence_variables_1(v_term);
              if ((NIL != czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue(thread))) {
                v_term = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31060");
              }
              v_term = canonicalize_term_commutative_terms(v_term);
              v_term = reify_relation_functions(v_term, makeBoolean((NIL == czer_vars.$recanonicalizing_candidate_natP$.getDynamicValue(thread))));
            } finally {
              czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
              czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0_1, thread);
            }
          }
        } finally {
          mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
      }
      return v_term;
    }
  }

  /** Return GAF-ASENT in MT expressed as a list of CNF clauses, or a CycL truth value,
or NIL if it couldn't canonicalize. */
  @SubL(source = "cycl/czer-main.lisp", position = 4850) 
  public static final SubLObject canonicalize_gaf(SubLObject gaf_asent, SubLObject mt) {
    return canonicalize_assert_sentence(gaf_asent, mt);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 6786) 
  public static final SubLObject canonicalize_cycl_int(SubLObject sentence, SubLObject mt, SubLObject testingP, SubLObject destructiveP, SubLObject unwrap_istP, SubLObject check_wffP) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if ((testingP == UNPROVIDED)) {
      testingP = NIL;
    }
    if ((destructiveP == UNPROVIDED)) {
      destructiveP = NIL;
    }
    if ((unwrap_istP == UNPROVIDED)) {
      unwrap_istP = NIL;
    }
    if ((check_wffP == UNPROVIDED)) {
      check_wffP = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != wff_vars.$within_wffP$.getDynamicValue(thread))
            || (NIL != czer_vars.$within_canonicalizerP$.getDynamicValue(thread)))))) {
        clear_canon_caches();
      }
      {
        SubLObject result = NIL;
        SubLObject subordinate_fi_opsP = NIL;
        SubLObject variables_memory = NIL;
        SubLObject wffP = makeBoolean((NIL == check_wffP));
        SubLObject copied_formula = NIL;
        mt = hlmt_czer.canonicalize_hlmt(mt);
        if (((NIL != check_wffP)
             && (NIL == mt))) {
          wffP = NIL;
        }
        {
          SubLObject _prev_bind_0 = czer_vars.$within_canonicalizerP$.currentBinding(thread);
          SubLObject _prev_bind_1 = czer_vars.$czer_memoization_state$.currentBinding(thread);
          try {
            czer_vars.$within_canonicalizerP$.bind(T, thread);
            czer_vars.$czer_memoization_state$.bind(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            {
              SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
              {
                SubLObject _prev_bind_0_2 = memoization_state.$memoization_state$.currentBinding(thread);
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
                            Errors.error($str13$Invalid_attempt_to_reuse_memoizat);
                          }
                        }
                      }
                    }
                    try {
                      {
                        SubLObject mt_var = mt;
                        {
                          SubLObject _prev_bind_0_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                          SubLObject _prev_bind_1_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                          SubLObject _prev_bind_2 = czer_vars.$subordinate_fi_opsP$.currentBinding(thread);
                          try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            czer_vars.$subordinate_fi_opsP$.bind(NIL, thread);
                            copied_formula = ((NIL != destructiveP) ? ((SubLObject) sentence) : el_utilities.copy_formula(sentence));
                            {
                              SubLObject _prev_bind_0_5 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                              SubLObject _prev_bind_1_6 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                              try {
                                czer_vars.$el_symbol_suffix_table$.bind(Hashtables.make_hash_table(FOUR_INTEGER, Symbols.symbol_function(EQL), UNPROVIDED), thread);
                                czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                                if ((NIL != check_wffP)) {
                                  {
                                    SubLObject _prev_bind_0_7 = wff_utilities.$check_arityP$.currentBinding(thread);
                                    SubLObject _prev_bind_1_8 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                    try {
                                      wff_utilities.$check_arityP$.bind(check_wff_arityP(), thread);
                                      wff_utilities.$check_wff_semanticsP$.bind(check_wff_semanticsP(UNPROVIDED), thread);
                                      wffP = canon_wffP(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread));
                                      if ((NIL == wffP)) {
                                        thread.resetMultipleValues();
                                        {
                                          SubLObject simpler_formula = simplifier.try_to_simplify_non_wff_into_wff(copied_formula,Symbols.symbol_function($sym14$CANON_WFF_),mt_relevance_macros.$mt$.getDynamicValue(thread));
                                          SubLObject is_it_wff_nowP = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if ((NIL != is_it_wff_nowP)) {
                                            wffP = T;
                                            copied_formula = simpler_formula;
                                          }
                                        }
                                      }
                                    } finally {
                                      wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_1_8, thread);
                                      wff_utilities.$check_arityP$.rebind(_prev_bind_0_7, thread);
                                    }
                                  }
                                }
                                if ((NIL != wffP)) {
                                  result = copied_formula;
                                  {
                                    SubLObject quiescedP = NIL;
                                    SubLObject count = ZERO_INTEGER;
                                    while ((NIL == quiescedP)) {
                                      thread.resetMultipleValues();
                                      {
                                        SubLObject result_9 = clausify_eliminating_ists(result, mt, $kw15$CNF, unwrap_istP);
                                        SubLObject mt_10 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        result = result_9;
                                        mt = mt_10;
                                      }
                                      result = clausifier.cnf_operators_out(result);
                                      thread.resetMultipleValues();
                                      {
                                        SubLObject result_11 = canonicalize_clauses(result, mt);
                                        SubLObject mt_12 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        result = result_11;
                                        mt = mt_12;
                                      }
                                      if (count.numGE(czer_vars.$czer_quiescence_iteration_limit$.getDynamicValue(thread))) {
                                        quiescedP = T;
                                      } else {
                                        quiescedP = czer_result_quiescedP(result, unwrap_istP);
                                      }
                                      if ((NIL == quiescedP)) {
                                        result = Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4190");
                                      }
                                      count = Numbers.add(count, ONE_INTEGER);
                                    }
                                  }
                                  subordinate_fi_opsP = czer_vars.$subordinate_fi_opsP$.getDynamicValue(thread);
                                  if ((NIL != testingP)) {
                                    variables_memory = czer_vars.$standardize_variables_memory$.getDynamicValue(thread);
                                  }
                                }
                              } finally {
                                czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1_6, thread);
                                czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0_5, thread);
                              }
                            }
                          } finally {
                            czer_vars.$subordinate_fi_opsP$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_4, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_3, thread);
                          }
                        }
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
                  memoization_state.$memoization_state$.rebind(_prev_bind_0_2, thread);
                }
              }
            }
          } finally {
            czer_vars.$czer_memoization_state$.rebind(_prev_bind_1, thread);
            czer_vars.$within_canonicalizerP$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL == unwrap_istP)) {
          mt = NIL;
        }
        if ((NIL != czer_vars.$clothe_naked_skolemsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31070");
        }
        return Values.values(result, subordinate_fi_opsP, variables_memory, mt);
      }
    }
  }

  /** Currently the only case this handles is when the caller was supposed to unwrap #$ist but there's
   still at least one #$ist literal in the czer result and no other literals. */
  @SubL(source = "cycl/czer-main.lisp", position = 10396) 
  public static final SubLObject czer_result_quiescedP(SubLObject czer_result, SubLObject caller_was_supposed_to_unwrap_istP) {
    if ((NIL == caller_was_supposed_to_unwrap_istP)) {
      return T;
    }
    if ((NIL != cycl_grammar.cycl_truth_value_p(czer_result))) {
      return T;
    }
    if ((NIL != cycl_utilities.expression_find_if($sym21$CYCL_GENERALIZED_TENSED_LITERAL_P, czer_result, UNPROVIDED, UNPROVIDED))) {
      return NIL;
    }
    {
      SubLObject ist_count = ZERO_INTEGER;
      SubLObject non_ist_count = ZERO_INTEGER;
      SubLObject cdolist_list_var = czer_utilities.extract_hl_clauses(czer_result);
      SubLObject clause = NIL;
      for (clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), clause = cdolist_list_var.first()) {
        {
          SubLObject cdolist_list_var_15 = clauses.neg_lits(clause);
          SubLObject asent = NIL;
          for (asent = cdolist_list_var_15.first(); (NIL != cdolist_list_var_15); cdolist_list_var_15 = cdolist_list_var_15.rest(), asent = cdolist_list_var_15.first()) {
            {
              SubLObject unwrapped_asent = czer_utilities.unwrap_if_ist_permissive(asent, UNPROVIDED);
              if (((NIL != el_utilities.el_conjunction_p(unwrapped_asent))
                  || (NIL != el_utilities.el_existential_p(unwrapped_asent)))) {
                return NIL;
              }
            }
            if (((NIL != el_utilities.ist_sentence_p(asent))
                 && (NIL != hlmt.chlmt_p(Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30478"))))) {
              ist_count = Numbers.add(ist_count, ONE_INTEGER);
            } else {
              non_ist_count = Numbers.add(non_ist_count, ONE_INTEGER);
            }
          }
        }
        {
          SubLObject cdolist_list_var_16 = clauses.pos_lits(clause);
          SubLObject asent = NIL;
          for (asent = cdolist_list_var_16.first(); (NIL != cdolist_list_var_16); cdolist_list_var_16 = cdolist_list_var_16.rest(), asent = cdolist_list_var_16.first()) {
            {
              SubLObject unwrapped_asent = czer_utilities.unwrap_if_ist_permissive(asent, UNPROVIDED);
              if (((NIL != el_utilities.el_conjunction_p(unwrapped_asent))
                  || (NIL != el_utilities.el_existential_p(unwrapped_asent)))) {
                return NIL;
              }
            }
            if (((NIL != el_utilities.ist_sentence_p(asent))
                 && (NIL != hlmt.chlmt_p(Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30479"))))) {
              ist_count = Numbers.add(ist_count, ONE_INTEGER);
            } else {
              non_ist_count = Numbers.add(non_ist_count, ONE_INTEGER);
            }
          }
        }
      }
      if ((ist_count.numGE(ONE_INTEGER)
           && non_ist_count.numE(ZERO_INTEGER))) {
        return NIL;
      }
    }
    return T;
  }

  /** Converts the EL sentence SENTENCE to its canonical HL representation.
   @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;
     an unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),
     or #$True or #$False, or NIL if FORMULA was ill-formed.
   @return 1 nil or hlmt-p;
   the microtheory in which to interpret the returned sentence.
   Note that this may differ from MT, for example when SENTENCE is an #$ist sentence. */
  @SubL(source = "cycl/czer-main.lisp", position = 11396) 
  public static final SubLObject canonicalize_cycl_sentence(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject result = canonicalize_cycl_int(sentence, mt, NIL, NIL, T, UNPROVIDED);
        SubLObject dummy1 = thread.secondMultipleValue();
        SubLObject dummy2 = thread.thirdMultipleValue();
        SubLObject mt_17 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return Values.values(result, mt_17);
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 13021) 
  public static final SubLObject canonicalize_wf_cycl_sentence(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject result = canonicalize_cycl_int(sentence, mt, NIL, NIL, T, NIL);
        SubLObject dummy1 = thread.secondMultipleValue();
        SubLObject dummy2 = thread.thirdMultipleValue();
        SubLObject mt_18 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return Values.values(result, mt_18);
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 13899) 
  public static final SubLObject canonicalize_ask_mt(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = control_vars.$within_ask$.currentBinding(thread);
          try {
            control_vars.$within_ask$.bind(T, thread);
            result = canonicalize_term(mt, mt_vars.$mt_mt$.getGlobalValue());
            if ((NIL != result)) {
              result = hlmt_czer.canonicalize_hlmt(result);
            }
          } finally {
            control_vars.$within_ask$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p; actually a list of triples
   @return 1 nil or hlmt-p */
  @SubL(source = "cycl/czer-main.lisp", position = 14184) 
  public static final SubLObject canonicalize_ask_sentence(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = control_vars.$within_ask$.currentBinding(thread);
          try {
            control_vars.$within_ask$.bind(T, thread);
            thread.resetMultipleValues();
            {
              SubLObject result_19 = canonicalize_query_sentence(sentence, mt);
              SubLObject mt_20 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              result = result_19;
              mt = mt_20;
            }
            result = remove_newly_introduced_variables_from_bindings(result, sentence);
          } finally {
            control_vars.$within_ask$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(result, mt);
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 15173) 
  public static final SubLObject canonicalize_assert_mt(SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
          SubLObject _prev_bind_1 = control_vars.$within_ask$.currentBinding(thread);
          try {
            control_vars.$within_assert$.bind(T, thread);
            control_vars.$within_ask$.bind(NIL, thread);
            result = canonicalize_mt(mt);
          } finally {
            control_vars.$within_ask$.rebind(_prev_bind_1, thread);
            control_vars.$within_assert$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Like @xref canonicalize-hlmt except does more canonicalization,
   possibly including reifying new narts if *within-assert*.
   Returns NIL if MT is ill-formed. */
  @SubL(source = "cycl/czer-main.lisp", position = 15351) 
  public static final SubLObject canonicalize_mt(SubLObject mt) {
    mt = canonicalize_term(mt, mt_vars.$mt_mt$.getGlobalValue());
    if ((NIL != mt)) {
      mt = hlmt_czer.canonicalize_hlmt(mt);
    }
    return mt;
  }

  /** @note this may create 'naked' skolem functions without #$skolem assertions. */
  @SubL(source = "cycl/czer-main.lisp", position = 15660) 
  public static final SubLObject canonicalize_assert_sentence(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
          SubLObject _prev_bind_1 = control_vars.$within_ask$.currentBinding(thread);
          try {
            control_vars.$within_assert$.bind(T, thread);
            control_vars.$within_ask$.bind(NIL, thread);
            thread.resetMultipleValues();
            {
              SubLObject result_21 = canonicalize_cycl_sentence(sentence, mt);
              SubLObject mt_22 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              result = result_21;
              mt = mt_22;
            }
          } finally {
            control_vars.$within_ask$.rebind(_prev_bind_1, thread);
            control_vars.$within_assert$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(result, mt);
      }
    }
  }

  /** @note this may create 'naked' skolem functions without #$skolem assertions. */
  @SubL(source = "cycl/czer-main.lisp", position = 16294) 
  public static final SubLObject canonicalize_wf_assert_sentence(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
          SubLObject _prev_bind_1 = control_vars.$within_ask$.currentBinding(thread);
          try {
            control_vars.$within_assert$.bind(T, thread);
            control_vars.$within_ask$.bind(NIL, thread);
            thread.resetMultipleValues();
            {
              SubLObject result_25 = canonicalize_wf_cycl_sentence(sentence, mt);
              SubLObject mt_26 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              result = result_25;
              mt = mt_26;
            }
          } finally {
            control_vars.$within_ask$.rebind(_prev_bind_1, thread);
            control_vars.$within_assert$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(result, mt);
      }
    }
  }

  /** Converts the EL query FORMULA to its canonical HL representation.
   @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;
     an unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),
     or #$True or #$False, or NIL if FORMULA was ill-formed.
   @return 1 boolean; whether extra FI operations were created as a result of canonicalization.
   @return 2 nil or hlmt-p; if UNWRAP-IST?, the microtheory in which to interpret FORMULA. */
  @SubL(source = "cycl/czer-main.lisp", position = 17259) 
  public static final SubLObject canonicalize_query(SubLObject formula, SubLObject mt, SubLObject destructiveP, SubLObject unwrap_istP) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if ((destructiveP == UNPROVIDED)) {
      destructiveP = NIL;
    }
    if ((unwrap_istP == UNPROVIDED)) {
      unwrap_istP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != wff_vars.$within_wffP$.getDynamicValue(thread))
            || (NIL != czer_vars.$within_canonicalizerP$.getDynamicValue(thread)))))) {
        clear_canon_caches();
      }
      {
        SubLObject result = NIL;
        SubLObject subordinate_fi_opsP = NIL;
        SubLObject copied_formula = NIL;
        mt = canonicalize_ask_mt(mt);
        {
          SubLObject _prev_bind_0 = czer_vars.$within_canonicalizerP$.currentBinding(thread);
          SubLObject _prev_bind_1 = czer_vars.$czer_memoization_state$.currentBinding(thread);
          try {
            czer_vars.$within_canonicalizerP$.bind(T, thread);
            czer_vars.$czer_memoization_state$.bind(memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            {
              SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
              {
                SubLObject _prev_bind_0_29 = memoization_state.$memoization_state$.currentBinding(thread);
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
                            Errors.error($str13$Invalid_attempt_to_reuse_memoizat);
                          }
                        }
                      }
                    }
                    try {
                      {
                        SubLObject _prev_bind_0_30 = control_vars.$within_query$.currentBinding(thread);
                        try {
                          control_vars.$within_query$.bind(T, thread);
                          {
                            SubLObject mt_var = mt;
                            {
                              SubLObject _prev_bind_0_31 = mt_relevance_macros.$mt$.currentBinding(thread);
                              SubLObject _prev_bind_1_32 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                              SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                              SubLObject _prev_bind_3 = control_vars.$within_assert$.currentBinding(thread);
                              SubLObject _prev_bind_4 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                              SubLObject _prev_bind_5 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                              SubLObject _prev_bind_6 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                              SubLObject _prev_bind_7 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                              SubLObject _prev_bind_8 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                              SubLObject _prev_bind_9 = czer_vars.$simplify_literalP$.currentBinding(thread);
                              SubLObject _prev_bind_10 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                              SubLObject _prev_bind_11 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                              SubLObject _prev_bind_12 = wff_vars.$validate_constantsP$.currentBinding(thread);
                              SubLObject _prev_bind_13 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                              SubLObject _prev_bind_14 = czer_vars.$subordinate_fi_opsP$.currentBinding(thread);
                              SubLObject _prev_bind_15 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
                              SubLObject _prev_bind_16 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
                              try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                control_vars.$within_assert$.bind(NIL, thread);
                                wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                                at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                                wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                                wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                                wff_utilities.$check_var_typesP$.bind(NIL, thread);
                                czer_vars.$simplify_literalP$.bind(NIL, thread);
                                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                wff_vars.$validate_constantsP$.bind(NIL, thread);
                                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                czer_vars.$subordinate_fi_opsP$.bind(NIL, thread);
                                czer_vars.$el_symbol_suffix_table$.bind(Hashtables.make_hash_table(FOUR_INTEGER, Symbols.symbol_function(EQL), UNPROVIDED), thread);
                                czer_vars.$standardize_variables_memory$.bind(NIL, thread);
                                {
                                  SubLObject wffP = wff.el_wff_syntaxP(formula, UNPROVIDED);
                                  copied_formula = ((NIL != destructiveP) ? ((SubLObject) formula) : el_utilities.copy_formula(formula));
                                  if ((NIL == wffP)) {
                                    thread.resetMultipleValues();
                                    {
                                      SubLObject simpler_formula = Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10699");
                                      SubLObject is_it_wff_nowP = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if ((NIL != is_it_wff_nowP)) {
                                        wffP = T;
                                        copied_formula = simpler_formula;
                                      }
                                    }
                                  }
                                  if ((NIL != wffP)) {
                                    result = copied_formula;
                                    {
                                      SubLObject quiescedP = NIL;
                                      SubLObject count = ZERO_INTEGER;
                                      while ((NIL == quiescedP)) {
                                        thread.resetMultipleValues();
                                        {
                                          SubLObject result_33 = clausify_eliminating_ists(result, mt, $kw25$DNF, unwrap_istP);
                                          SubLObject mt_34 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          result = result_33;
                                          mt = mt_34;
                                        }
                                        result = clausifier.dnf_operators_out(result);
                                        thread.resetMultipleValues();
                                        {
                                          SubLObject result_35 = canonicalize_query_clauses(result, mt);
                                          SubLObject mt_36 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          result = result_35;
                                          mt = mt_36;
                                        }
                                        if (count.numGE(czer_vars.$czer_quiescence_iteration_limit$.getDynamicValue(thread))) {
                                          quiescedP = T;
                                        } else {
                                          quiescedP = czer_result_quiescedP(result, unwrap_istP);
                                        }
                                        if ((NIL == quiescedP)) {
                                          result = Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4194");
                                        }
                                        count = Numbers.add(count, ONE_INTEGER);
                                      }
                                    }
                                    subordinate_fi_opsP = czer_vars.$subordinate_fi_opsP$.getDynamicValue(thread);
                                  }
                                }
                              } finally {
                                czer_vars.$standardize_variables_memory$.rebind(_prev_bind_16, thread);
                                czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_15, thread);
                                czer_vars.$subordinate_fi_opsP$.rebind(_prev_bind_14, thread);
                                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_13, thread);
                                wff_vars.$validate_constantsP$.rebind(_prev_bind_12, thread);
                                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_11, thread);
                                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_10, thread);
                                czer_vars.$simplify_literalP$.rebind(_prev_bind_9, thread);
                                wff_utilities.$check_var_typesP$.rebind(_prev_bind_8, thread);
                                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_7, thread);
                                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_6, thread);
                                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_5, thread);
                                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_4, thread);
                                control_vars.$within_assert$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_32, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_31, thread);
                              }
                            }
                          }
                        } finally {
                          control_vars.$within_query$.rebind(_prev_bind_0_30, thread);
                        }
                      }
                    } finally {
                      {
                        SubLObject _prev_bind_0_37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                          Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                          if (((NIL != local_state)
                               && (NIL == original_memoization_process))) {
                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                          }
                        } finally {
                          Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_37, thread);
                        }
                      }
                    }
                  }
                } finally {
                  memoization_state.$memoization_state$.rebind(_prev_bind_0_29, thread);
                }
              }
            }
          } finally {
            czer_vars.$czer_memoization_state$.rebind(_prev_bind_1, thread);
            czer_vars.$within_canonicalizerP$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL == unwrap_istP)) {
          mt = NIL;
        }
        return Values.values(result, subordinate_fi_opsP, mt);
      }
    }
  }

  /** Converts the EL query SENTENCE to its canonical HL representation.
   @return 0 nil or cycl-truth-value-p or list-of-clause-binding-list-pairs-p;
     an unordered list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)),
     or #$True or #$False, or NIL if FORMULA was ill-formed.
   @return 1 nil or hlmt-p;
   the microtheory in which to interpret the returned sentence.
   Note that this may differ from MT, for example when SENTENCE is an #$ist sentence. */
  @SubL(source = "cycl/czer-main.lisp", position = 19630) 
  public static final SubLObject canonicalize_query_sentence(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject result = canonicalize_query(sentence, mt, NIL, T);
        SubLObject dummy1 = thread.secondMultipleValue();
        SubLObject mt_38 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(result, mt_38);
      }
    }
  }

  /** Canonicalizes sentence into an EL clausal form of CLAUSAL-FORM.
If UNWRAP-IST?, this will recursively canonicalize SENTENCE until there are no more #$ists.
Also finds the nart version of a non-atomic mt before returning it, if one exists. */
  @SubL(source = "cycl/czer-main.lisp", position = 20950) 
  public static final SubLObject clausify_eliminating_ists(SubLObject sentence, SubLObject mt, SubLObject clausal_form, SubLObject unwrap_istP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != unwrap_istP)) {
        thread.resetMultipleValues();
        {
          SubLObject sentence_39 = czer_utilities.unwrap_if_ist_permissive_canonical(sentence, mt);
          SubLObject mt_40 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          sentence = sentence_39;
          mt = mt_40;
        }
      }
      {
        SubLObject ist_quiescenceP = NIL;
        while ((NIL == ist_quiescenceP)) {
          sentence = simplifier.simplify_sequence_variables_1(sentence);
          {
            SubLObject pcase_var = clausal_form;
            if (pcase_var.eql($kw15$CNF)) {
              thread.resetMultipleValues();
              {
                SubLObject sentence_41 = clausifier.el_cnf_destructive(sentence, mt);
                SubLObject mt_42 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                sentence = sentence_41;
                mt = mt_42;
              }
            } else if (pcase_var.eql($kw25$DNF)) {
              thread.resetMultipleValues();
              {
                SubLObject sentence_43 = clausifier.el_dnf_destructive(sentence, mt);
                SubLObject mt_44 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                sentence = sentence_43;
                mt = mt_44;
              }
            } else {
              Errors.error($str26$Unknown_clausal_form__s, clausal_form);
            }
          }
          if ((NIL == unwrap_istP)) {
            ist_quiescenceP = T;
          } else {
            thread.resetMultipleValues();
            {
              SubLObject sub_sentence = czer_utilities.unwrap_if_ist_permissive_canonical(sentence, mt);
              SubLObject sub_mt = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if (((sentence == sub_sentence)
                   && (mt == sub_mt))) {
                ist_quiescenceP = T;
              } else {
                sentence = sub_sentence;
                mt = hlmt_czer.canonicalize_hlmt(sub_mt);
              }
            }
          }
        }
      }
      mt = hlmt_czer.canonicalize_hlmt(mt);
      return Values.values(sentence, mt);
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 22319) 
  public static final SubLObject remove_newly_introduced_variables_from_bindings(SubLObject clauses_and_more, SubLObject original_formula) {
    if ((clauses_and_more.isCons()
         && (NIL != el_utilities.el_formula_p(original_formula)))) {
      {
        SubLObject cdolist_list_var = clauses_and_more;
        SubLObject clause_and_more = NIL;
        for (clause_and_more = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), clause_and_more = cdolist_list_var.first()) {
          {
            SubLObject canon_free_vars = conses_high.third(clause_and_more);
            SubLObject original_vars = el_utilities.referenced_variables(original_formula, UNPROVIDED);
            SubLObject spurious_free_vars = list_utilities.fast_set_difference(canon_free_vars, original_vars, UNPROVIDED);
            if ((NIL != spurious_free_vars)) {
              {
                SubLObject corrected_free_vars = list_utilities.fast_set_difference(canon_free_vars, spurious_free_vars, UNPROVIDED);
                list_utilities.nreplace_nth(TWO_INTEGER, corrected_free_vars, clause_and_more);
              }
            }
          }
        }
      }
    }
    return clauses_and_more;
  }

  @SubL(source = "cycl/czer-main.lisp", position = 22952) 
  public static final SubLObject clear_canon_caches() {
    clausifier.clear_cached_cnf_clausal_form();
    czer_meta.clear_cached_find_assertions_cycl();
    return NIL;
  }

  @SubL(source = "cycl/czer-main.lisp", position = 23134) 
  public static final SubLObject canon_wffP(SubLObject formula, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject wffP = NIL;
        {
          SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
          try {
            wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
            if ((NIL != czer_vars.$recanonicalizingP$.getDynamicValue(thread))) {
              wffP = wff.el_wff_syntaxP(formula, UNPROVIDED);
            } else {
              wffP = wff.el_wffP(formula, mt, UNPROVIDED);
            }
          } finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_0, thread);
          }
        }
        return wffP;
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 23408) 
  public static final SubLObject check_wff_arityP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return wff_utilities.$check_arityP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 23488) 
  public static final SubLObject check_wff_semanticsP(SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ((NIL != psc_queryP(mt)) ? ((SubLObject) NIL) : makeBoolean(((NIL != czer_vars.$must_enforce_semanticsP$.getDynamicValue(thread))
              || ((NIL != wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread))
                 && (NIL != control_vars.$within_assert$.getDynamicValue(thread))))));
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 23675) 
  public static final SubLObject canonicalize_clauses_terms(SubLObject v_clauses) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != czer_vars.$canonicalize_termsP$.getDynamicValue(thread))) {
        v_clauses = canonicalize_clauses_quoted_terms(v_clauses);
        v_clauses = canonicalize_clauses_sentence_terms(v_clauses);
        v_clauses = canonicalize_clauses_commutative_terms_destructive(v_clauses);
        v_clauses = canonicalize_functions(v_clauses);
        v_clauses = canonicalize_clauses_tou_terms(v_clauses);
        v_clauses = canonicalize_clauses_commutative_terms_destructive(v_clauses);
      }
      return v_clauses;
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 24696) 
  public static final SubLObject canonicalize_clauses_quoted_terms(SubLObject v_clauses) {
    return list_utilities.nmapcar(Symbols.symbol_function($sym27$CANONICALIZE_CLAUSE_QUOTED_TERMS), v_clauses);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 24868) 
  public static final SubLObject canonicalize_clause_quoted_terms(SubLObject clause) {
    return clauses.make_cnf(canonicalize_literals_quoted_terms(clauses.neg_lits(clause)), canonicalize_literals_quoted_terms(clauses.pos_lits(clause)));
  }

  public static final class $canonicalize_clause_quoted_terms$UnaryFunction extends UnaryFunction {
    public $canonicalize_clause_quoted_terms$UnaryFunction() { super(extractFunctionNamed("CANONICALIZE-CLAUSE-QUOTED-TERMS")); }
    public SubLObject processItem(SubLObject arg1) { return canonicalize_clause_quoted_terms(arg1); }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 25060) 
  public static final SubLObject canonicalize_literals_quoted_terms(SubLObject literals) {
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = Sequences.reverse(literals);
      SubLObject literal = NIL;
      for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
        result = cons(canonicalize_literal_quoted_terms_recursive(literal), result);
      }
      return result;
    }
  }

  /** Replaces all the escape quoted terms (non variables) with just the term, since
  (#$EscapeQuote <term>) = <term>.  Also converts quasi quoted terms to (#$Quote  Assumes that the literal is well-formed - 
  #$EscapeQuote should be nested within #$Quote */
  @SubL(source = "cycl/czer-main.lisp", position = 25277) 
  public static final SubLObject canonicalize_literal_quoted_terms_recursive(SubLObject literal) {
    {
      SubLObject result = literal;
      SubLObject escapequote = list_utilities.tree_find_if(Symbols.symbol_function($sym28$ESCAPE_QUOTE_SYNTAX_P), result, UNPROVIDED);
      SubLObject escaped_form = NIL;
      if (((NIL != escapequote)
           && (NIL == list_utilities.tree_find_if(Symbols.symbol_function($sym29$CYC_VAR_), escapequote, UNPROVIDED)))) {
        escaped_form = cycl_utilities.formula_arg1(escapequote, UNPROVIDED);
        result = canonicalize_literal_quoted_terms_recursive(conses_high.subst(escaped_form, escapequote, result, UNPROVIDED, UNPROVIDED));
      }
      {
        SubLObject quasiquote = list_utilities.tree_find_if(Symbols.symbol_function($sym30$QUASI_QUOTE_SYNTAX_P), result, UNPROVIDED);
        SubLObject quote_form = NIL;
        if ((NIL != quasiquote)) {
          quote_form = list($const31$Quote, list($const32$EscapeQuote, cycl_utilities.formula_arg1(quasiquote, UNPROVIDED)));
          result = canonicalize_literal_quoted_terms_recursive(conses_high.subst(quote_form, quasiquote, result, UNPROVIDED, UNPROVIDED));
        }
      }
      return result;
    }
  }

  /** Destructively canonicalizes formula args (of any literals or denotational functions in CLAUSES) into their EL formulas.
   A 'formula arg' is, roughly, an argument that is constrained to be a Cyc formula.
   Replaces literals with NIL if they are not a @xref relation-expression?
   @see sentence-arg? */
  @SubL(source = "cycl/czer-main.lisp", position = 27184) 
  public static final SubLObject canonicalize_clauses_sentence_terms(SubLObject v_clauses) {
    if ((NIL != canonicalize_no_sentence_argsP())) {
      return v_clauses;
    } else {
      return list_utilities.nmapcar(Symbols.symbol_function($sym35$CANONICALIZE_CLAUSE_SENTENCE_TERMS), v_clauses);
    }
  }

  /** fast-fail */
  @SubL(source = "cycl/czer-main.lisp", position = 27692) 
  public static final SubLObject canonicalize_no_sentence_argsP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((!(((NIL != czer_vars.$canonicalize_tensed_literalsP$.getDynamicValue(thread))
              || (NIL != czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue(thread))))));
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 27849) 
  private static SubLSymbol $canonicalize_clause_sentence_terms_sense_lambda$ = null;

  /** Destructively canonicalizes formula args (of any literals or denotational functions in CLAUSE) into their EL formulas.
   A 'formula arg' is an argument that is constrained to be a collection whose instances are Cyc formulas.
   Replaces literals with NIL if they are not a @xref relation-expression?
   @see sentence-arg? */
  @SubL(source = "cycl/czer-main.lisp", position = 27929) 
  public static final SubLObject canonicalize_clause_sentence_terms(SubLObject clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        {
          SubLObject _prev_bind_0 = $canonicalize_clause_sentence_terms_sense_lambda$.currentBinding(thread);
          try {
            $canonicalize_clause_sentence_terms_sense_lambda$.bind($kw36$NEG, thread);
            neg_lits = list_utilities.nmapcar(Symbols.symbol_function($sym37$CANONICALIZE_LITERAL_SENTENCE_TERMS), clauses.neg_lits(clause));
          } finally {
            $canonicalize_clause_sentence_terms_sense_lambda$.rebind(_prev_bind_0, thread);
          }
        }
        {
          SubLObject _prev_bind_0 = $canonicalize_clause_sentence_terms_sense_lambda$.currentBinding(thread);
          try {
            $canonicalize_clause_sentence_terms_sense_lambda$.bind($kw38$POS, thread);
            pos_lits = list_utilities.nmapcar(Symbols.symbol_function($sym37$CANONICALIZE_LITERAL_SENTENCE_TERMS), clauses.pos_lits(clause));
          } finally {
            $canonicalize_clause_sentence_terms_sense_lambda$.rebind(_prev_bind_0, thread);
          }
        }
        thread.resetMultipleValues();
        {
          SubLObject neg_lits_45 = unnegate_and_flip_negated_lits(neg_lits, pos_lits);
          SubLObject pos_lits_46 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          neg_lits = neg_lits_45;
          pos_lits = pos_lits_46;
        }
        return clauses.make_clause(neg_lits, pos_lits);
      }
    }
  }

  public static final class $canonicalize_clause_sentence_terms$UnaryFunction extends UnaryFunction {
    public $canonicalize_clause_sentence_terms$UnaryFunction() { super(extractFunctionNamed("CANONICALIZE-CLAUSE-SENTENCE-TERMS")); }
    public SubLObject processItem(SubLObject arg1) { return canonicalize_clause_sentence_terms(arg1); }
  }

  /** Turn pos-lits to neg-lits or vice versa if lit is an el-negation-p */
  @SubL(source = "cycl/czer-main.lisp", position = 28814) 
  public static final SubLObject unnegate_and_flip_negated_lits(SubLObject neg_lits, SubLObject pos_lits) {
    if (((NIL != list_utilities.any_in_list($sym39$EL_NEGATION_P, neg_lits, UNPROVIDED))
        || (NIL != list_utilities.any_in_list($sym39$EL_NEGATION_P, pos_lits, UNPROVIDED)))) {
      {
        SubLObject new_neg_lits = NIL;
        SubLObject new_pos_lits = NIL;
        {
          SubLObject cdolist_list_var = pos_lits;
          SubLObject pos_lit = NIL;
          for (pos_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pos_lit = cdolist_list_var.first()) {
            if ((NIL != el_utilities.el_negation_p(pos_lit))) {
              new_neg_lits = cons(cycl_utilities.negate(pos_lit), new_neg_lits);
            } else {
              new_pos_lits = cons(pos_lit, new_pos_lits);
            }
          }
        }
        {
          SubLObject cdolist_list_var = neg_lits;
          SubLObject neg_lit = NIL;
          for (neg_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), neg_lit = cdolist_list_var.first()) {
            if ((NIL != el_utilities.el_negation_p(neg_lit))) {
              new_pos_lits = cons(cycl_utilities.negate(neg_lit), new_pos_lits);
            } else {
              new_neg_lits = cons(neg_lit, new_neg_lits);
            }
          }
        }
        neg_lits = Sequences.nreverse(new_neg_lits);
        pos_lits = Sequences.nreverse(new_pos_lits);
      }
    }
    return Values.values(neg_lits, pos_lits);
  }

  /** Canonicalizes formula args of LITERAL into their EL formulas.
   A 'formula arg' is an argument that is constrained to be a collection whose instances are Cyc formulas.
   Returns NIL if LITERAL is not a @xref relation-expression?
   @see sentence-arg? */
  @SubL(source = "cycl/czer-main.lisp", position = 29516) 
  public static final SubLObject canonicalize_literal_sentence_terms(SubLObject literal, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue(thread))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31061");
      } else {
        return literal;
      }
    }
  }

  public static final class $canonicalize_literal_sentence_terms$UnaryFunction extends UnaryFunction {
    public $canonicalize_literal_sentence_terms$UnaryFunction() { super(extractFunctionNamed("CANONICALIZE-LITERAL-SENTENCE-TERMS")); }
    public SubLObject processItem(SubLObject arg1) { return canonicalize_literal_sentence_terms(arg1, UNPROVIDED); }
  }

  public static final class $canonicalize_literal_sentence_terms$BinaryFunction extends BinaryFunction {
    public $canonicalize_literal_sentence_terms$BinaryFunction() { super(extractFunctionNamed("CANONICALIZE-LITERAL-SENTENCE-TERMS")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return canonicalize_literal_sentence_terms(arg1, arg2); }
  }

  /** For each literal in CLAUSES, recursively sorts the arguments of all relations with commutative predicates
   and the arguments of all nats with commutative functors.
   Assumes that every clause in CLAUSES is an EL formula. */
  @SubL(source = "cycl/czer-main.lisp", position = 32593) 
  public static final SubLObject canonicalize_clauses_commutative_terms_destructive(SubLObject v_clauses) {
    return list_utilities.nmapcar(Symbols.symbol_function($sym41$CANONICALIZE_CLAUSE_COMMUTATIVE_TERMS_DESTRUCTIVE), v_clauses);
  }

  /** A destructive version of @xref canonicalize-clause-commutative-terms. */
  @SubL(source = "cycl/czer-main.lisp", position = 33600) 
  public static final SubLObject canonicalize_clause_commutative_terms_destructive(SubLObject clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((((NIL == czer_vars.$canonicalize_gaf_commutative_termsP$.getDynamicValue(thread))
             && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30254")))
          || (NIL != never_commutative_gaf_clauseP(clause)))) {
        return clause;
      } else {
        return clauses.make_cnf(canonicalize_literals_commutative_terms(clauses.neg_lits(clause)), canonicalize_literals_commutative_terms(clauses.pos_lits(clause)));
      }
    }
  }

  public static final class $canonicalize_clause_commutative_terms_destructive$UnaryFunction extends UnaryFunction {
    public $canonicalize_clause_commutative_terms_destructive$UnaryFunction() { super(extractFunctionNamed("CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE")); }
    public SubLObject processItem(SubLObject arg1) { return canonicalize_clause_commutative_terms_destructive(arg1); }
  }

  /** A list of predicates that are guaranteed to never be commutative.  Checked for speed before calling on SBHL. */
  @SubL(source = "cycl/czer-main.lisp", position = 34058) 
  private static SubLSymbol $never_commutative_predicates$ = null;

  @SubL(source = "cycl/czer-main.lisp", position = 34327) 
  public static final SubLObject never_commutative_gaf_clauseP(SubLObject clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != clause_utilities.pos_atomic_cnf_p(clause))
             && (NIL != conses_high.member(cycl_utilities.formula_operator(clause_utilities.gaf_cnf_literal(clause)), $never_commutative_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))
             && (NIL == el_utilities.contains_subformula_p(clause_utilities.gaf_cnf_literal(clause)))));
    }
  }

  /** For each literal in LITERALS, recursively sorts the arguments of all relations with commutative predicates
   and the arguments of all nats with commutative functors. */
  @SubL(source = "cycl/czer-main.lisp", position = 34577) 
  public static final SubLObject canonicalize_literals_commutative_terms(SubLObject literals) {
    return list_utilities.nmapcar(Symbols.symbol_function($sym43$CANONICALIZE_LITERAL_COMMUTATIVE_TERMS_DESTRUCTIVE), literals);
  }

  /** Recursively sorts the arguments of all relations with commutative predicates
   and the arguments of all nats with commutative functors. */
  @SubL(source = "cycl/czer-main.lisp", position = 34899) 
  public static final SubLObject canonicalize_literal_commutative_terms(SubLObject literal) {
    return canonicalize_literal_commutative_terms_destructive(el_utilities.copy_formula(literal));
  }

  /** A destructive version of @xref canonicalize-literal-commutative-terms. */
  @SubL(source = "cycl/czer-main.lisp", position = 35220) 
  public static final SubLObject canonicalize_literal_commutative_terms_destructive(SubLObject literal) {
    {
      SubLObject seqvar = el_utilities.sequence_var(literal, UNPROVIDED);
      SubLObject tempformula = literal;
      SubLObject literal_48 = ((NIL != seqvar) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30659")) : tempformula);
      SubLObject result = NIL;
      SubLObject pred = el_utilities.literal_predicate(literal_48, UNPROVIDED);
      SubLObject dont_reorder_argnums = czer_utilities.dont_reorder_commutative_terms_for_args(pred, UNPROVIDED);
      SubLObject args = canonicalize_terms_commutative_terms_without_reordering(el_utilities.literal_args(literal_48, UNPROVIDED), dont_reorder_argnums);
      if ((NIL != fort_types_interface.commutative_relationP(pred))) {
        result = el_utilities.make_el_literal(pred, order_commutative_terms(args), UNPROVIDED);
      } else if ((NIL != fort_types_interface.partially_commutative_relation_p(pred))) {
        result = el_utilities.make_el_literal(pred, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31101"), UNPROVIDED);
      } else {
        result = el_utilities.make_el_literal(pred, args, UNPROVIDED);
      }
      if ((NIL != seqvar)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30608");
      } else {
        return result;
      }
    }
  }

  public static final class $canonicalize_literal_commutative_terms_destructive$UnaryFunction extends UnaryFunction {
    public $canonicalize_literal_commutative_terms_destructive$UnaryFunction() { super(extractFunctionNamed("CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE")); }
    public SubLObject processItem(SubLObject arg1) { return canonicalize_literal_commutative_terms_destructive(arg1); }
  }

  /**  */
  @SubL(source = "cycl/czer-main.lisp", position = 36049) 
  public static final SubLObject canonicalize_literal_commutative_args(SubLObject lit) {
    {
      SubLObject literal = el_utilities.copy_formula(lit);
      {
        SubLObject seqvar = el_utilities.sequence_var(literal, UNPROVIDED);
        SubLObject tempformula = literal;
        SubLObject literal_49 = ((NIL != seqvar) ? ((SubLObject) Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30660")) : tempformula);
        SubLObject result = NIL;
        SubLObject pred = el_utilities.literal_predicate(literal_49, UNPROVIDED);
        SubLObject args = el_utilities.literal_args(literal_49, UNPROVIDED);
        if ((NIL != fort_types_interface.commutative_relationP(pred))) {
          result = el_utilities.make_el_literal(pred, order_commutative_terms(args), UNPROVIDED);
        } else if ((NIL != fort_types_interface.partially_commutative_relation_p(pred))) {
          result = el_utilities.make_el_literal(pred, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31102"), UNPROVIDED);
        } else {
          result = el_utilities.make_el_literal(pred, args, UNPROVIDED);
        }
        if ((NIL != seqvar)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30609");
        } else {
          return result;
        }
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 36670) 
  public static final SubLObject order_commutative_terms(SubLObject terms) {
    return Sort.sort(terms, Symbols.symbol_function($sym44$COMMUTATIVE_TERMS_IN_ORDER_), UNPROVIDED);
  }

  /** Puts each term in the list TERMS in canonical form wrt commutativity except the ones at argnum 
   in dont-reorder-argnums, but does not change the order of the list TERMS. */
  @SubL(source = "cycl/czer-main.lisp", position = 36802) 
  public static final SubLObject canonicalize_terms_commutative_terms_without_reordering(SubLObject terms, SubLObject dont_reorder_argnums) {
    {
      SubLObject canonicalized_terms = NIL;
      SubLObject list_var = NIL;
      SubLObject v_term = NIL;
      SubLObject argnum = NIL;
      for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), v_term = list_var.first(), argnum = Numbers.add(ONE_INTEGER, argnum)) {
        if ((NIL != subl_promotions.memberP(Numbers.add(argnum, ONE_INTEGER), dont_reorder_argnums, UNPROVIDED, UNPROVIDED))) {
          canonicalized_terms = cons(v_term, canonicalized_terms);
        } else {
          canonicalized_terms = cons(canonicalize_term_commutative_terms(v_term), canonicalized_terms);
        }
      }
      return Sequences.nreverse(canonicalized_terms);
    }
  }

  /** Basically just calls @xref canonicalize-relation-commutative-terms,
   if TERM is either a nat or an EL formula with a predicate, variable, or logical operator as its arg0. */
  @SubL(source = "cycl/czer-main.lisp", position = 37369) 
  public static final SubLObject canonicalize_term_commutative_terms(SubLObject v_term) {
    if ((NIL != el_utilities.subl_escape_p(v_term))) {
      return v_term;
    } else if ((NIL != term.nautP(v_term, UNPROVIDED))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31057");
    } else if ((NIL != el_utilities.el_relation_expressionP(v_term))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31059");
    } else {
      return v_term;
    }
  }

  /** Returns the argument positions in RELATION which commute with each other. */
  @SubL(source = "cycl/czer-main.lisp", position = 42513) 
  public static final SubLObject commutative_argnums(SubLObject relation_expression) {
    {
      SubLObject relation = cycl_utilities.formula_operator(relation_expression);
      SubLObject args = cycl_utilities.formula_args(relation_expression, $kw46$IGNORE);
      if ((NIL != fort_types_interface.commutative_relationP(relation))) {
        return list(list_utilities.numlist(Sequences.length(args), ONE_INTEGER));
      } else if ((NIL != fort_types_interface.partially_commutative_relation_p(relation))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31090");
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-main.lisp", position = 48041) 
  public static final SubLObject commutative_terms_in_orderP(SubLObject term1, SubLObject term2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != czer_vars.$new_canonicalizerP$.getDynamicValue(thread))) {
        if ((NIL != cycl_utilities.hl_term_with_el_counterpart_p(term1))) {
          return commutative_terms_in_orderP(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29776"), term2);
        } else if ((NIL != cycl_utilities.hl_term_with_el_counterpart_p(term2))) {
          return commutative_terms_in_orderP(term1, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29777"));
        } else {
          if (term1.isAtom()) {
            if (term2.isAtom()) {
              return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31071");
            } else {
              return T;
            }
          } else {
            if (term2.isAtom()) {
              return NIL;
            } else {
              return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31072");
            }
          }
        }
      } else {
        return old_commutative_terms_in_orderP(term1, term2);
      }
    }
  }

  public static final class $commutative_terms_in_orderP$BinaryFunction extends BinaryFunction {
    public $commutative_terms_in_orderP$BinaryFunction() { super(extractFunctionNamed("COMMUTATIVE-TERMS-IN-ORDER?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return commutative_terms_in_orderP(arg1, arg2); }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 49521) 
  public static final SubLObject canonicalizer_constant_L(SubLObject constant1, SubLObject constant2) {
    return constants_high.constant_external_id_L(constant1, constant2);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 52169) 
  public static final SubLObject canon_term_L(SubLObject term1, SubLObject term2) {
    return commutative_terms_in_orderP(term1, term2);
  }

  /** A binding list to remember existential variables, to remember the original EL variable as it was asserted. */
  @SubL(source = "cycl/czer-main.lisp", position = 52704) 
  public static SubLSymbol $tou_skolem_blist$ = null;

  /** Puts all functions in CLAUSES in canonical form,
   by destructively reifying all reifiable functions and adding termOfUnit literals.
   Every function that has a reifiable functor should be reified.
   Every reifiable function that is quantified into should have a termOfUnit assertion. */
  @SubL(source = "cycl/czer-main.lisp", position = 52875) 
  public static final SubLObject canonicalize_functions(SubLObject v_clauses) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL == czer_vars.$canonicalize_functionsP$.getDynamicValue(thread))
          || ((NIL != list_utilities.singletonP(v_clauses))
             && (NIL != clause_utilities.pos_atomic_cnf_p(v_clauses.first()))
             && (NIL == el_utilities.contains_subformula_p(clause_utilities.gaf_cnf_literal(v_clauses.first())))))) {
        return v_clauses;
      }
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $tou_skolem_blist$.currentBinding(thread);
          try {
            $tou_skolem_blist$.bind(NIL, thread);
            result = add_term_of_unit_lits(reify_functions(v_clauses, T));
          } finally {
            $tou_skolem_blist$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @note this is destructive */
  @SubL(source = "cycl/czer-main.lisp", position = 53603) 
  public static final SubLObject add_term_of_unit_lits(SubLObject v_clauses) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = czer_vars.$clause_el_var_names$.currentBinding(thread);
          try {
            czer_vars.$clause_el_var_names$.bind(clauses_free_variables(v_clauses), thread);
            result = ((NIL != czer_vars.$add_term_of_unit_litsP$.getDynamicValue(thread)) ? ((SubLObject) list_utilities.nmapcar(Symbols.symbol_function($sym59$ADD_TERM_OF_UNIT_LITS_1), v_clauses)) : v_clauses);
          } finally {
            czer_vars.$clause_el_var_names$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @return a list of the free variable in all the clauses. */
  @SubL(source = "cycl/czer-main.lisp", position = 53927) 
  public static final SubLObject clauses_free_variables(SubLObject v_clauses) {
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = v_clauses;
      SubLObject clause = NIL;
      for (clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), clause = cdolist_list_var.first()) {
        {
          SubLObject cdolist_list_var_54 = list_utilities.nmapcar(Symbols.symbol_function($sym60$STR), clause_utilities.clause_free_variables(clause, Symbols.symbol_function($sym54$EL_VAR_), UNPROVIDED));
          SubLObject var_name = NIL;
          for (var_name = cdolist_list_var_54.first(); (NIL != cdolist_list_var_54); cdolist_list_var_54 = cdolist_list_var_54.rest(), var_name = cdolist_list_var_54.first()) {
            {
              SubLObject item_var = var_name;
              if ((NIL == conses_high.member(item_var, result, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                result = cons(item_var, result);
              }
            }
          }
        }
      }
      return result;
    }
  }

  /** inference requires 
   . one termOfUnit neg-lit whenever an axiom quantifies into a reifiable function
   . one evaluate neg-lit whenever an axiom quantifies into an evaluatable function
  @note this is destructive */
  @SubL(source = "cycl/czer-main.lisp", position = 54216) 
  public static final SubLObject add_term_of_unit_lits_1(SubLObject clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != el_utilities.groundP(clause, Symbols.symbol_function($sym54$EL_VAR_)))) {
        return clause;
      }
      {
        SubLObject quantified_fn_terms = clause_quantified_fn_terms(clause);
        if ((NIL != quantified_fn_terms)) {
          thread.resetMultipleValues();
          {
            SubLObject neg_lits = clause_utilities.unmake_clause(clause);
            SubLObject pos_lits = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject target_lits = ((NIL != control_vars.within_queryP()) ? ((SubLObject) pos_lits) : neg_lits);
              SubLObject cdolist_list_var = quantified_fn_terms;
              SubLObject fn_term = NIL;
              for (fn_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), fn_term = cdolist_list_var.first()) {
                if ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31091"))) {
                  if ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8821"))) {
                    target_lits = list_utilities.nadd_to_end(Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8841"), target_lits);
                  }
                } else if ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31084"))) {
                  if ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8819"))) {
                    if ((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8820"))) {
                      target_lits = list_utilities.nadd_to_end(Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8839"), target_lits);
                    }
                  }
                }
              }
              if ((NIL != control_vars.within_queryP())) {
                pos_lits = target_lits;
              } else {
                neg_lits = target_lits;
              }
            }
            return list(neg_lits, pos_lits);
          }
        } else {
          return clause;
        }
      }
    }
  }

  /** Reifies functions contained within RELATION.
   Like @xref reify-functions, except it takes a relation instead of clauses.  Also it doesn't reify skolems.
   @param REIFY-RELATION?; whether RELATION itself should be reified if possible. */
  @SubL(source = "cycl/czer-main.lisp", position = 57818) 
  public static final SubLObject reify_relation_functions(SubLObject relation, SubLObject reify_relationP) {
    if ((reify_relationP == UNPROVIDED)) {
      reify_relationP = T;
    }
    if ((NIL != el_utilities.relation_expressionP(relation))) {
      {
        SubLObject functions = NIL;
        SubLObject cdolist_list_var = cons(relation, relation_terms_to_reify(relation, UNPROVIDED));
        SubLObject v_term = NIL;
        for (v_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
          if ((NIL != el_utilities.subl_escape_p(relation))) {
          } else if (v_term.isAtom()) {
          } else if ((NIL != czer_utilities.reifiable_function_termP(v_term, UNPROVIDED))) {
            functions = cons(v_term, functions);
          }
        }
        if ((NIL != functions)) {
          functions = Sequences.delete_duplicates(functions, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
          relation = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31100");
        }
        return relation;
      }
    } else {
      el_utilities.el_error(FOUR_INTEGER, $str66$Tried_to_reify_functions_within__, relation, UNPROVIDED, UNPROVIDED);
    }
    return relation;
  }

  /** Destructively reifies all reifiable functions in CLAUSES.
   Assumes that each clause in CLAUSES is an EL formula. (huh?) */
  @SubL(source = "cycl/czer-main.lisp", position = 60062) 
  public static final SubLObject reify_functions(SubLObject v_clauses, SubLObject reify_skolemsP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_skolems = NIL;
        SubLObject functions = NIL;
        SubLObject cdolist_list_var = list_utilities.mapnunion(Symbols.symbol_function($sym68$CLAUSE_TERMS_TO_REIFY), v_clauses, Symbols.symbol_function(EQUAL));
        SubLObject v_term = NIL;
        for (v_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
          if ((NIL != el_utilities.subl_escape_p(v_term))) {
          } else if (v_term.isAtom()) {
          } else if (((NIL != reify_skolemsP)
               && (NIL != term.skolem_fn_functionP(cycl_utilities.nat_functor(v_term))))) {
            v_skolems = cons(v_term, v_skolems);
          } else if ((NIL != czer_utilities.reifiable_function_termP(v_term, UNPROVIDED))) {
            functions = cons(v_term, functions);
          }
        }
        if ((NIL != functions)) {
          v_clauses = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31098");
        }
        if ((NIL != v_skolems)) {
          {
            SubLObject error = NIL;
            try {
              v_clauses = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 13058");
            } catch (Throwable ccatch_env_var) {
              error = Errors.handleThrowable(ccatch_env_var, $kw69$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE);
            }
            if ((NIL != error)) {
              if ((NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8069");
              }
              return NIL;
            }
          }
        }
        return v_clauses;
      }
    }
  }

  /** @return list; the terms to reify in CLAUSE that are quantified into;
   i.e. have free variables within them. */
  @SubL(source = "cycl/czer-main.lisp", position = 69122) 
  public static final SubLObject clause_quantified_fn_terms(SubLObject clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = czer_vars.$gathering_quantified_fn_termsP$.currentBinding(thread);
          try {
            czer_vars.$gathering_quantified_fn_termsP$.bind(T, thread);
            result = conses_high.union(literals_quantified_fn_terms(clauses.neg_lits(clause)), literals_quantified_fn_terms(clauses.pos_lits(clause)), Symbols.symbol_function(EQUAL), UNPROVIDED);
          } finally {
            czer_vars.$gathering_quantified_fn_termsP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @return list; the terms to reify in LITERAL that are quantified into;
   i.e. have free variables within them. */
  @SubL(source = "cycl/czer-main.lisp", position = 69562) 
  public static final SubLObject literals_quantified_fn_terms(SubLObject literals) {
    return list_utilities.mapappend(Symbols.symbol_function($sym79$LITERAL_QUANTIFIED_FN_TERMS), literals);
  }

  /** @return list; the terms to reify in LITERAL that are quantified into;
   i.e. have free variables within them. */
  @SubL(source = "cycl/czer-main.lisp", position = 69824) 
  public static final SubLObject literal_quantified_fn_terms(SubLObject literal) {
    return Sequences.delete_if(Symbols.symbol_function($sym80$NO_FREE_VARIABLES_), literal_terms_to_reify(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  public static final class $literal_quantified_fn_terms$UnaryFunction extends UnaryFunction {
    public $literal_quantified_fn_terms$UnaryFunction() { super(extractFunctionNamed("LITERAL-QUANTIFIED-FN-TERMS")); }
    public SubLObject processItem(SubLObject arg1) { return literal_quantified_fn_terms(arg1); }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 70069) 
  public static final SubLObject clause_terms_to_reify(SubLObject clause) {
    return conses_high.nunion(list_utilities.mapunion(Symbols.symbol_function($sym81$LITERAL_TERMS_TO_REIFY), clauses.neg_lits(clause), Symbols.symbol_function(EQUAL)), list_utilities.mapunion(Symbols.symbol_function($sym81$LITERAL_TERMS_TO_REIFY), clauses.pos_lits(clause), Symbols.symbol_function(EQUAL)), Symbols.symbol_function(EQUAL), UNPROVIDED);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 70315) 
  public static final SubLObject literal_terms_to_reify(SubLObject literal, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      SubLObject result = relation_terms_to_reify(literal, mt);
      if ((NIL != reify_termP(literal, mt))) {
        {
          SubLObject item_var = literal;
          if ((NIL == conses_high.member(item_var, result, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
            result = cons(item_var, result);
          }
        }
      }
      return result;
    }
  }

  public static final class $literal_terms_to_reify$UnaryFunction extends UnaryFunction {
    public $literal_terms_to_reify$UnaryFunction() { super(extractFunctionNamed("LITERAL-TERMS-TO-REIFY")); }
    public SubLObject processItem(SubLObject arg1) { return literal_terms_to_reify(arg1, UNPROVIDED); }
  }

  public static final class $literal_terms_to_reify$BinaryFunction extends BinaryFunction {
    public $literal_terms_to_reify$BinaryFunction() { super(extractFunctionNamed("LITERAL-TERMS-TO-REIFY")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return literal_terms_to_reify(arg1, arg2); }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 70727) 
  public static final SubLObject relation_terms_to_reify(SubLObject relation, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != el_utilities.el_formula_p(relation))
           && (NIL == guaranteed_nothing_to_reifyP(relation))
           && (NIL != el_utilities.el_relation_expressionP(relation)))) {
        {
          SubLObject result = NIL;
          SubLObject pos = ZERO_INTEGER;
          SubLObject reln = cycl_utilities.formula_arg0(relation);
          if ((!(((NIL != czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread))
                 && reln.eql($const82$evaluate))))) {
            {
              SubLObject cdolist_list_var = cycl_utilities.formula_terms(relation, UNPROVIDED);
              SubLObject v_term = NIL;
              for (v_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
                {
                  SubLObject arg_isa_pred = ((NIL != forts.fort_p(reln)) ? ((SubLObject) kb_accessors.arg_isa_pred(pos, reln, mt)) : NIL);
                  {
                    SubLObject _prev_bind_0 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
                    try {
                      wff_vars.$permit_generic_arg_variablesP$.bind(makeBoolean(((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread))
                            || (NIL != Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7228")))), thread);
                      wff_vars.$permit_keyword_variablesP$.bind(makeBoolean(((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread))
                            || (NIL != Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7229")))), thread);
                      if ((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31092"))) {
                        result = cons(v_term, result);
                      }
                      if (((NIL != czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread))
                           && (NIL != el_utilities.scoping_relation_expressionP(v_term)))) {
                      } else if (((NIL != czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread))
                           && (NIL != czer_utilities.evaluatable_function_termP(v_term, mt)))) {
                      } else if ((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31079"))) {
                      } else if ((NIL != term.nautP(v_term, UNPROVIDED))) {
                        result = list_utilities.ordered_union(result, relation_terms_to_reify(v_term, mt), Symbols.symbol_function(EQUAL), UNPROVIDED);
                      } else if ((NIL != term.sentenceP(v_term, UNPROVIDED))) {
                        result = list_utilities.ordered_union(result, relation_terms_to_reify(v_term, mt), Symbols.symbol_function(EQUAL), UNPROVIDED);
                      } else if ((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30577"))) {
                        result = list_utilities.ordered_union(result, literal_terms_to_reify(v_term, mt), Symbols.symbol_function(EQUAL), UNPROVIDED);
                      }
                    } finally {
                      wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_1, thread);
                      wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_0, thread);
                    }
                  }
                }
                pos = Numbers.add(pos, ONE_INTEGER);
              }
            }
          }
          return result;
        }
      }
      return NIL;
    }
  }

  /** @return boolean; t iff FORMULA is guaranteed to contain nothing reifiable.
   A quick necessary test to avoid unnecessary work. */
  @SubL(source = "cycl/czer-main.lisp", position = 72612) 
  public static final SubLObject guaranteed_nothing_to_reifyP(SubLObject formula) {
    return makeBoolean((NIL == el_utilities.contains_subformula_p(formula)));
  }

  @SubL(source = "cycl/czer-main.lisp", position = 73789) 
  public static final SubLObject reify_termP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (v_term.isAtom()) {
        return NIL;
      } else if ((NIL != term.unreified_skolem_termP(v_term))) {
        return czer_vars.$reify_skolemsP$.getDynamicValue(thread);
      } else if (((NIL != term.hl_ground_nautP(v_term))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10334")))) {
        return T;
      } else if ((NIL != czer_utilities.reifiable_function_termP(v_term, mt))) {
        if ((NIL != kb_control_vars.within_forward_inferenceP())) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31085");
        } else {
          return T;
        }
      } else if ((NIL != czer_utilities.evaluatable_function_termP(v_term, mt))) {
        return T;
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 74652) 
  public static final SubLObject forward_inference_reifiable_functionP(SubLObject function, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject rule = forward.current_forward_inference_rule();
        return makeBoolean(((NIL != control_vars.$prefer_forward_skolemization$.getDynamicValue(thread))
              || (NIL != kb_accessors.skolemize_forwardP(function, mt))
              || ((NIL != rule)
                 && (NIL != kb_accessors.forward_reification_ruleP(function, rule, UNPROVIDED)))));
      }
    }
  }

  /** @note this is destructive */
  @SubL(source = "cycl/czer-main.lisp", position = 77591) 
  public static final SubLObject canonicalize_clauses_tou_terms(SubLObject v_clauses) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != czer_vars.$canonicalize_functionsP$.getDynamicValue(thread))) {
        return list_utilities.nmapcar(Symbols.symbol_function($sym85$CANONICALIZE_CLAUSE_TOU_TERMS), v_clauses);
      } else {
        return v_clauses;
      }
    }
  }

  /** replace references in <clause> 
   . to reifiable nats with their reifications
   . to evaluatable nats with their evaluations */
  @SubL(source = "cycl/czer-main.lisp", position = 77903) 
  public static final SubLObject canonicalize_clause_tou_terms(SubLObject clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject termXnats = nat_atoms(clause);
        if ((NIL != termXnats)) {
          {
            SubLObject neg_lits = clauses.neg_lits(clause);
            SubLObject pos_lits = clauses.pos_lits(clause);
            SubLObject result = NIL;
            {
              SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding(thread);
              SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
              try {
                at_vars.$appraising_disjunctP$.bind(makeBoolean(((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread))
                      || ((NIL != neg_lits)
                         && (NIL != pos_lits)))), thread);
                czer_vars.$standardize_variables_memory$.bind(Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31081"), thread);
                result = clauses.make_cnf(Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31055"), Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31056"));
              } finally {
                czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
                at_vars.$appraising_disjunctP$.rebind(_prev_bind_0, thread);
              }
            }
            return result;
          }
        } else {
          return clause;
        }
      }
    }
  }

  public static final class $canonicalize_clause_tou_terms$UnaryFunction extends UnaryFunction {
    public $canonicalize_clause_tou_terms$UnaryFunction() { super(extractFunctionNamed("CANONICALIZE-CLAUSE-TOU-TERMS")); }
    public SubLObject processItem(SubLObject arg1) { return canonicalize_clause_tou_terms(arg1); }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 78613) 
  public static final SubLObject nat_atoms(SubLObject clause) {
    {
      SubLObject termXnats = NIL;
      SubLObject cdolist_list_var = ((NIL != control_vars.within_queryP()) ? ((SubLObject) clauses.pos_lits(clause)) : clauses.neg_lits(clause));
      SubLObject lit = NIL;
      for (lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), lit = cdolist_list_var.first()) {
        if ((NIL != el_utilities.tou_litP(lit))) {
          termXnats = cons(el_utilities.literal_args(lit, UNPROVIDED), termXnats);
        } else if ((NIL != el_utilities.evaluate_litP(lit, UNPROVIDED))) {
          termXnats = cons(el_utilities.literal_args(lit, UNPROVIDED), termXnats);
        }
      }
      return Sequences.nreverse(termXnats);
    }
  }

  /** lambda for var-is-scoped-in-formula? */
  @SubL(source = "cycl/czer-main.lisp", position = 81079) 
  private static SubLSymbol $var_is_scoped_in_formula_var$ = null;

  /** For each clause in CLAUSES, sorts its literals into a canonical order.
   Also canonicalizes disjunctions as enumerations.
   (Does not change the order of the clauses, because that would be pointless.
   It's not like the canonicalizer is going to impose a canonical order on the assertions in the KB.) */
  @SubL(source = "cycl/czer-main.lisp", position = 82043) 
  public static final SubLObject canonicalize_clauses_literals(SubLObject v_clauses) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != czer_vars.$canonicalize_literalsP$.getDynamicValue(thread))) {
        {
          SubLObject sorted_clauses = sort_clauses_literals(v_clauses);
          if ((NIL != czer_vars.$canonicalize_disjunction_as_enumerationP$.getDynamicValue(thread))) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31041");
          } else {
            return sorted_clauses;
          }
        }
      } else {
        return v_clauses;
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 83203) 
  public static final SubLObject sort_clauses_literals(SubLObject v_clauses) {
    return list_utilities.nmapcar(Symbols.symbol_function($sym91$SORT_CLAUSE_LITERALS), v_clauses);
  }

  /** Sorts the literals in CLAUSE into a canonical order. */
  @SubL(source = "cycl/czer-main.lisp", position = 83302) 
  public static final SubLObject sort_clause_literals(SubLObject clause, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    return sort_clause_literals_destructive(el_utilities.copy_clause(clause), varP);
  }

  public static final class $sort_clause_literals$UnaryFunction extends UnaryFunction {
    public $sort_clause_literals$UnaryFunction() { super(extractFunctionNamed("SORT-CLAUSE-LITERALS")); }
    public SubLObject processItem(SubLObject arg1) { return sort_clause_literals(arg1, UNPROVIDED); }
  }

  public static final class $sort_clause_literals$BinaryFunction extends BinaryFunction {
    public $sort_clause_literals$BinaryFunction() { super(extractFunctionNamed("SORT-CLAUSE-LITERALS")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return sort_clause_literals(arg1, arg2); }
  }

  /** A destructive version of @xref sort-clause-literals. */
  @SubL(source = "cycl/czer-main.lisp", position = 83947) 
  public static final SubLObject sort_clause_literals_destructive(SubLObject clause, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = czer_vars.$varP$.currentBinding(thread);
          try {
            czer_vars.$varP$.bind(varP, thread);
            thread.resetMultipleValues();
            {
              SubLObject neg_lits = clause_utilities.unmake_clause(clause);
              SubLObject pos_lits = thread.secondMultipleValue();
              thread.resetMultipleValues();
              result = Sequences.cconcatenate(list_utilities.nmapcar(Symbols.symbol_function($sym92$NEGATE_ATOMIC), neg_lits), pos_lits);
              result = sort_literals(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              result = evaluate_lits_at_rear(result);
              result = tou_lits_at_rear(result);
              result = clausifier.npackage_cnf_clause(result);
            }
          } finally {
            czer_vars.$varP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** puts termOfUnit literals at rear (for cosmetic sake; otherwise, order is unchanged) */
  @SubL(source = "cycl/czer-main.lisp", position = 84561) 
  public static final SubLObject tou_lits_at_rear(SubLObject literals) {
    {
      SubLObject front = NIL;
      SubLObject back = NIL;
      SubLObject cdolist_list_var = literals;
      SubLObject lit = NIL;
      for (lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), lit = cdolist_list_var.first()) {
        if (((NIL != el_utilities.el_negation_p(lit))
             && (NIL != el_utilities.tou_litP(conses_high.second(lit))))) {
          back = cons(lit, back);
        } else {
          front = cons(lit, front);
        }
      }
      return ConsesLow.nconc(Sequences.nreverse(front), Sequences.nreverse(back));
    }
  }

  /** puts evaluate literals at rear (for cosmetic sake; otherwise, order is unchanged) */
  @SubL(source = "cycl/czer-main.lisp", position = 84904) 
  public static final SubLObject evaluate_lits_at_rear(SubLObject literals) {
    {
      SubLObject front = NIL;
      SubLObject back = NIL;
      SubLObject cdolist_list_var = literals;
      SubLObject lit = NIL;
      for (lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), lit = cdolist_list_var.first()) {
        if (((NIL != el_utilities.el_negation_p(lit))
             && (NIL != el_utilities.evaluate_litP(conses_high.second(lit), UNPROVIDED)))) {
          back = cons(lit, back);
        } else {
          front = cons(lit, front);
        }
      }
      return ConsesLow.nconc(Sequences.nreverse(front), Sequences.nreverse(back));
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 85254) 
  public static final SubLObject sort_literals(SubLObject literals, SubLObject bound_vars, SubLObject connected_vars, SubLObject already_sorted_literals, SubLObject originals) {
    if ((bound_vars == UNPROVIDED)) {
      bound_vars = NIL;
    }
    if ((connected_vars == UNPROVIDED)) {
      connected_vars = NIL;
    }
    if ((already_sorted_literals == UNPROVIDED)) {
      already_sorted_literals = NIL;
    }
    if ((originals == UNPROVIDED)) {
      originals = literals;
    }
    if ((NIL == literals)) {
    } else if ((NIL != list_utilities.singletonP(literals))) {
      return literals;
    } else {
      {
        SubLObject next_literal = pick_a_lit(literals, bound_vars, connected_vars, already_sorted_literals, originals);
        return cons(next_literal, sort_literals(Sequences.remove(next_literal, literals, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), new_bound_vars(next_literal, bound_vars), new_connected_vars(next_literal, bound_vars), cons(next_literal, already_sorted_literals), originals));
      }
    }
    return NIL;
  }

  /** Returns the first literal in LITERALS with respect to the canonical ordering. */
  @SubL(source = "cycl/czer-main.lisp", position = 85823) 
  public static final SubLObject pick_a_lit(SubLObject literals, SubLObject bound_vars, SubLObject connected_vars, SubLObject already_sorted_literals, SubLObject originals) {
    if ((bound_vars == UNPROVIDED)) {
      bound_vars = NIL;
    }
    if ((connected_vars == UNPROVIDED)) {
      connected_vars = NIL;
    }
    if ((already_sorted_literals == UNPROVIDED)) {
      already_sorted_literals = NIL;
    }
    if ((originals == UNPROVIDED)) {
      originals = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject results = NIL;
        SubLObject verboseP = NIL;
        results = most_constrained_literals(literals, bound_vars, UNPROVIDED);
        if ((NIL != list_utilities.singletonP(results))) {
          if ((NIL != verboseP)) {
            Errors.warn($str93$most_constrained_literals_succeed);
          }
          return results.first();
        }
        results = fewest_arg_literals(results);
        if ((NIL != list_utilities.singletonP(results))) {
          if ((NIL != verboseP)) {
            Errors.warn($str94$fewest_arg_literals_succeeded_);
          }
          return results.first();
        }
        results = left_weighted_literals(results);
        if ((NIL != list_utilities.singletonP(results))) {
          if ((NIL != verboseP)) {
            Errors.warn($str95$left_weighted_literals_succeeded_);
          }
          return results.first();
        }
        results = left_connected_literals(results, connected_vars);
        if ((NIL != list_utilities.singletonP(results))) {
          if ((NIL != verboseP)) {
            Errors.warn($str96$left_connected_literals_succeeded);
          }
          return results.first();
        }
        results = left_rooted_literals(results, originals);
        if ((NIL != list_utilities.singletonP(results))) {
          if ((NIL != verboseP)) {
            Errors.warn($str97$left_rooted_literals_succeeded_);
          }
          return results.first();
        }
        results = least_complex_literals(results, UNPROVIDED);
        if ((NIL != list_utilities.singletonP(results))) {
          if ((NIL != verboseP)) {
            Errors.warn($str98$least_complex_literals_succeeded_);
          }
          return results.first();
        }
        if ((NIL != czer_vars.$new_canonicalizerP$.getDynamicValue(thread))) {
          results = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29109");
          if ((NIL != list_utilities.singletonP(results))) {
            if ((NIL != verboseP)) {
              Errors.warn($str99$penultimate_resort_literals_1_suc);
            }
            return results.first();
          }
          results = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29110");
          if ((NIL != list_utilities.singletonP(results))) {
            if ((NIL != verboseP)) {
              Errors.warn($str100$penultimate_resort_literals_2_suc);
            }
            return results.first();
          }
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29104");
        } else {
          return old_last_resort_literal(results, literals, UNPROVIDED);
        }
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 87691) 
  public static final SubLObject new_bound_vars(SubLObject literal, SubLObject bound_vars) {
    if ((bound_vars == UNPROVIDED)) {
      bound_vars = NIL;
    }
    {
      SubLObject vars = list_utilities.ordered_set_difference(el_utilities.literal_variables(literal, UNPROVIDED, UNPROVIDED), bound_vars, Symbols.symbol_function(EQUAL), UNPROVIDED);
      if ((NIL != list_utilities.singletonP(vars))) {
        return ConsesLow.append(bound_vars, vars);
      } else {
        return bound_vars;
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 87925) 
  public static final SubLObject new_connected_vars(SubLObject literal, SubLObject connected_vars) {
    if ((connected_vars == UNPROVIDED)) {
      connected_vars = NIL;
    }
    return ConsesLow.nconc(list_utilities.ordered_set_difference(el_utilities.literal_variables(literal, UNPROVIDED, UNPROVIDED), connected_vars, Symbols.symbol_function(EQUAL), UNPROVIDED), connected_vars);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 88104) 
  public static final SubLObject unbound_vars(SubLObject vars, SubLObject bound_vars) {
    {
      SubLObject unbound = list_utilities.ordered_set_difference(vars, bound_vars, Symbols.symbol_function(EQUAL), UNPROVIDED);
      SubLObject cdolist_list_var = vars;
      SubLObject var = NIL;
      for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
        if ((NIL != term.unreified_skolem_termP(var))) {
          {
            SubLObject unboundP = NIL;
            if ((NIL == unboundP)) {
              {
                SubLObject csome_list_var = conses_high.second(var);
                SubLObject free_var = NIL;
                for (free_var = csome_list_var.first(); (!(((NIL != unboundP)
                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), free_var = csome_list_var.first()) {
                  if ((NIL == subl_promotions.memberP(free_var, bound_vars, UNPROVIDED, UNPROVIDED))) {
                    unboundP = T;
                  }
                }
              }
            }
            if ((NIL == unboundP)) {
              unbound = Sequences.remove(var, unbound, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
          }
        }
      }
      return unbound;
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 88503) 
  public static final SubLObject most_constrained_literals(SubLObject literals, SubLObject bound_vars, SubLObject varP) {
    if ((bound_vars == UNPROVIDED)) {
      bound_vars = NIL;
    }
    if ((varP == UNPROVIDED)) {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    {
      SubLObject ans = list(literals.first());
      SubLObject min = unbound_vars_score(el_utilities.literal_variables(ans.first(), varP, UNPROVIDED), bound_vars);
      SubLObject score = NIL;
      SubLObject cdolist_list_var = literals.rest();
      SubLObject literal = NIL;
      for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
        score = unbound_vars_score(el_utilities.literal_variables(literal, varP, UNPROVIDED), bound_vars);
        if (score.numE(min)) {
          ans = cons(literal, ans);
        } else if (score.numL(min)) {
          min = score;
          ans = list(literal);
        }
      }
      return Sequences.reverse(ans);
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 88984) 
  public static final SubLObject unbound_vars_score(SubLObject vars, SubLObject bound_vars) {
    return Sequences.length(unbound_vars(vars, bound_vars));
  }

  @SubL(source = "cycl/czer-main.lisp", position = 89250) 
  public static final SubLObject fewest_arg_literals(SubLObject literals) {
    if ((NIL != list_utilities.singletonP(literals))) {
      return literals;
    } else {
      {
        SubLObject ans = list(literals.first());
        SubLObject min = el_utilities.literal_arity(ans.first(), UNPROVIDED);
        SubLObject score = NIL;
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
          score = el_utilities.literal_arity(literal, UNPROVIDED);
          if (score.numE(min)) {
            ans = cons(literal, ans);
          } else if (score.numL(min)) {
            min = score;
            ans = list(literal);
          }
        }
        return Sequences.reverse(ans);
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 89654) 
  public static final SubLObject left_weighted_literals(SubLObject literals) {
    if ((NIL != list_utilities.singletonP(literals))) {
      return literals;
    } else {
      {
        SubLObject ans = list(literals.first());
        SubLObject max = left_weighted_score(el_utilities.literal_args(literals.first(), UNPROVIDED), UNPROVIDED);
        SubLObject score = NIL;
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
          score = left_weighted_score(el_utilities.literal_args(literal, UNPROVIDED), UNPROVIDED);
          if (score.numE(max)) {
            ans = cons(literal, ans);
          } else if (score.numG(max)) {
            max = score;
            ans = list(literal);
          }
        }
        return Sequences.reverse(ans);
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 90108) 
  public static final SubLObject left_weighted_score(SubLObject symbols, SubLObject symbol) {
    if ((symbol == UNPROVIDED)) {
      symbol = symbols.first();
    }
    {
      SubLObject score = ZERO_INTEGER;
      SubLObject length = Sequences.length(symbols);
      SubLObject weights = list_utilities.first_n(length, n_left_weighted_score_weights(length, TEN_INTEGER));
      SubLObject n = NIL;
      for (n = ZERO_INTEGER; n.numL(length); n = Numbers.add(n, ONE_INTEGER)) {
        if (symbol.equal(ConsesLow.nth(n, symbols))) {
          score = Numbers.add(score, ConsesLow.nth(Numbers.subtract(length, n, ONE_INTEGER), weights));
        }
      }
      return score;
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 90451) 
  public static final SubLObject n_left_weighted_score_weights(SubLObject n, SubLObject multiplier) {
    if ((multiplier == UNPROVIDED)) {
      multiplier = TEN_INTEGER;
    }
    {
      SubLObject weights = NIL;
      SubLObject weight = ONE_INTEGER;
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(n); i = Numbers.add(i, ONE_INTEGER)) {
        weights = cons(weight, weights);
        weight = Numbers.multiply(weight, multiplier);
      }
      return Sequences.nreverse(weights);
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 90681) 
  public static final SubLObject left_connected_literals(SubLObject literals, SubLObject connected_vars) {
    if ((connected_vars == UNPROVIDED)) {
      connected_vars = NIL;
    }
    if ((NIL != list_utilities.singletonP(literals))) {
      return literals;
    } else {
      {
        SubLObject ans = list(literals.first());
        SubLObject max = left_connected_score(el_utilities.literal_args(literals.first(), UNPROVIDED), connected_vars);
        SubLObject score = NIL;
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
          score = left_connected_score(el_utilities.literal_args(literal, UNPROVIDED), connected_vars);
          if (score.numE(max)) {
            ans = cons(literal, ans);
          } else if (score.numG(max)) {
            max = score;
            ans = list(literal);
          }
        }
        return Sequences.reverse(ans);
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 91195) 
  public static final SubLObject left_connected_score(SubLObject vars, SubLObject connected_vars) {
    {
      SubLObject score = ZERO_INTEGER;
      SubLObject psn = ZERO_INTEGER;
      SubLObject cdolist_list_var = Sequences.reverse(vars);
      SubLObject var = NIL;
      for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
        psn = Numbers.add(psn, ONE_INTEGER);
        score = Numbers.add(score, Numbers.multiply(Sequences.length(conses_high.member(var, connected_vars, Symbols.symbol_function(EQUAL), UNPROVIDED)), psn));
      }
      return score;
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 91425) 
  public static final SubLObject left_rooted_literals(SubLObject literals, SubLObject original) {
    if ((original == UNPROVIDED)) {
      original = literals;
    }
    return left_rooted_literals_int(default_lit_sort(literals), default_lit_sort(original));
  }

  @SubL(source = "cycl/czer-main.lisp", position = 91596) 
  public static final SubLObject default_lit_sort(SubLObject literals) {
    return Sort.stable_sort(conses_high.copy_list(literals), Symbols.symbol_function($sym102$LIT__), UNPROVIDED);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 91693) 
  public static final SubLObject lit_L(SubLObject lit_1, SubLObject lit_2) {
    if (((NIL != el_utilities.el_negation_p(lit_1))
         && (NIL == el_utilities.el_negation_p(lit_2)))) {
      return T;
    } else if (((NIL == el_utilities.el_negation_p(lit_1))
         && (NIL != el_utilities.el_negation_p(lit_2)))) {
      return NIL;
    } else if ((!(el_utilities.literal_arg0(lit_1, UNPROVIDED).equal(el_utilities.literal_arg0(lit_2, UNPROVIDED))))) {
      return pred_L(el_utilities.literal_arg0(lit_1, UNPROVIDED), el_utilities.literal_arg0(lit_2, UNPROVIDED));
    } else {
      return canon_term_L(el_utilities.literal_args(lit_1, UNPROVIDED), el_utilities.literal_args(lit_2, UNPROVIDED));
    }
  }

  public static final class $lit_L$BinaryFunction extends BinaryFunction {
    public $lit_L$BinaryFunction() { super(extractFunctionNamed("LIT-<")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return lit_L(arg1, arg2); }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 92071) 
  public static final SubLObject pred_L(SubLObject pred_1, SubLObject pred_2) {
    if (((NIL != forts.fort_p(pred_1))
         && (NIL != forts.fort_p(pred_2)))) {
      {
        SubLObject pred_1_psn = Sequences.position(pred_1, czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pred_2_psn = Sequences.position(pred_2, czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (((NIL != pred_1_psn)
             && (NIL != pred_2_psn))) {
          return Numbers.numG(pred_2_psn, pred_1_psn);
        } else if ((NIL != pred_1_psn)) {
          return T;
        } else if ((NIL != pred_2_psn)) {
          return NIL;
        }
        {
          SubLObject arity_1 = arity.arity(pred_1);
          SubLObject arity_2 = arity.arity(pred_2);
          if ((arity_1 != arity_2)) {
            if (((NIL != arity_1)
                 && (NIL != arity_2))) {
              return Numbers.numG(arity_2, arity_1);
            } else if ((NIL != arity_1)) {
              return T;
            } else if ((NIL != arity_2)) {
              return NIL;
            }
          }
          if (((NIL != constant_handles.constant_p(pred_1))
               && (NIL != nart_handles.nart_p(pred_2)))) {
            return T;
          } else if (((NIL != nart_handles.nart_p(pred_1))
               && (NIL != constant_handles.constant_p(pred_2)))) {
            return T;
          } else if (((NIL != constant_handles.constant_p(pred_1))
               && (NIL != constant_handles.constant_p(pred_2)))) {
            return canonicalizer_constant_L(pred_1, pred_2);
          } else if (((NIL != nart_handles.nart_p(pred_1))
               && (NIL != nart_handles.nart_p(pred_2)))) {
            return canon_term_L(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10401"), Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10402"));
          } else {
            el_utilities.el_error(ONE_INTEGER, $str103$Got_a_fort_that_was_neither_a_nar, pred_1, pred_2, UNPROVIDED);
          }
        }
      }
    } else {
      return canon_term_L(pred_1, pred_2);
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-main.lisp", position = 93205) 
  public static final SubLObject left_rooted_literals_int(SubLObject literals, SubLObject original) {
    if ((original == UNPROVIDED)) {
      original = literals;
    }
    if ((NIL != list_utilities.singletonP(literals))) {
      return literals;
    } else {
      {
        SubLObject ans = list(literals.first());
        SubLObject max = left_rooted_score(literals.first(), original, UNPROVIDED);
        SubLObject score = NIL;
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
          score = left_rooted_score(literal, original, UNPROVIDED);
          if (score.numE(max)) {
            ans = cons(literal, ans);
          } else if (score.numG(max)) {
            max = score;
            ans = list(literal);
          }
        }
        return Sequences.reverse(ans);
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 93675) 
  public static final SubLObject left_rooted_score(SubLObject literal, SubLObject literals, SubLObject depth) {
    if ((depth == UNPROVIDED)) {
      depth = ONE_INTEGER;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == subl_promotions.memberP(literal, literals, Symbols.symbol_function(EQUAL), UNPROVIDED))) {
          Errors.error($str104$_s_is_not_an_element_of__s, literal, literals);
        }
      }
      {
        SubLObject symbols = el_utilities.literal_args(literal, UNPROVIDED);
        SubLObject score = left_weighted_score(symbols, UNPROVIDED);
        SubLObject rest = Sequences.remove(literal, literals, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject psn = ZERO_INTEGER;
        SubLObject out_scores = NIL;
        SubLObject out = NIL;
        SubLObject out_score = NIL;
        SubLObject lit_score = NIL;
        SubLObject connectedP = NIL;
        SubLObject unconnected = NIL;
        {
          SubLObject cdolist_list_var = Sequences.remove_duplicates(symbols, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
          SubLObject symbol = NIL;
          for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
            psn = Numbers.add(psn, ONE_INTEGER);
            {
              SubLObject cdolist_list_var_60 = rest;
              SubLObject lit = NIL;
              for (lit = cdolist_list_var_60.first(); (NIL != cdolist_list_var_60); cdolist_list_var_60 = cdolist_list_var_60.rest(), lit = cdolist_list_var_60.first()) {
                connectedP = NIL;
                out = NIL;
                {
                  SubLObject cdolist_list_var_61 = el_utilities.literal_args(lit, UNPROVIDED);
                  SubLObject v_term = NIL;
                  for (v_term = cdolist_list_var_61.first(); (NIL != cdolist_list_var_61); cdolist_list_var_61 = cdolist_list_var_61.rest(), v_term = cdolist_list_var_61.first()) {
                    if ((NIL != subl_promotions.memberP(v_term, symbols, Symbols.symbol_function(EQUAL), UNPROVIDED))) {
                      connectedP = T;
                    } else {
                      {
                        SubLObject item_var = v_term;
                        if ((NIL == conses_high.member(item_var, out, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                          out = cons(item_var, out);
                        }
                      }
                    }
                  }
                }
                if ((NIL != connectedP)) {
                  lit_score = left_weighted_score(el_utilities.literal_args(lit, UNPROVIDED), symbol);
                  score = Numbers.add(score, Numbers.divide(lit_score, psn));
                  if ((NIL != out)) {
                    unconnected = cons(lit, unconnected);
                    {
                      SubLObject cdolist_list_var_62 = out;
                      SubLObject v_term = NIL;
                      for (v_term = cdolist_list_var_62.first(); (NIL != cdolist_list_var_62); cdolist_list_var_62 = cdolist_list_var_62.rest(), v_term = cdolist_list_var_62.first()) {
                        out_score = conses_high.assoc(v_term, out_scores, Symbols.symbol_function(EQUAL), UNPROVIDED).rest();
                        if ((NIL != out_score)) {
                          ConsesLow.rplacd(conses_high.assoc(v_term, out_scores, Symbols.symbol_function(EQUAL), UNPROVIDED), Numbers.add(out_score, lit_score));
                        } else {
                          out_scores = cons(cons(v_term, lit_score), out_scores);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject root_term = max_scored_item(out_scores, Symbols.symbol_function($sym105$CDR), Symbols.symbol_function($sym87$CAR));
          SubLObject root_lit = NIL;
          SubLObject max = ZERO_INTEGER;
          SubLObject cdolist_list_var = unconnected;
          SubLObject lit = NIL;
          for (lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), lit = cdolist_list_var.first()) {
            lit_score = left_weighted_score(cycl_utilities.formula_terms(lit, UNPROVIDED), root_term);
            if (lit_score.numG(max)) {
              max = lit_score;
              root_lit = lit;
            }
          }
          if ((NIL != root_lit)) {
            score = Numbers.divide(Numbers.add(score, left_rooted_score(root_lit, rest, Numbers.multiply(depth, TEN_INTEGER))), depth);
          }
        }
        return score;
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 95092) 
  public static final SubLObject max_scored_item(SubLObject items, SubLObject score_key, SubLObject result_key) {
    if ((score_key == UNPROVIDED)) {
      score_key = Symbols.symbol_function(IDENTITY);
    }
    if ((result_key == UNPROVIDED)) {
      result_key = Symbols.symbol_function(IDENTITY);
    }
    {
      SubLObject max = Numbers.$most_negative_fixnum$.getGlobalValue();
      SubLObject score = NIL;
      SubLObject result = NIL;
      SubLObject cdolist_list_var = items;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        score = Functions.funcall(score_key, item);
        if (score.numG(max)) {
          max = score;
          result = Functions.funcall(result_key, item);
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 95413) 
  public static final SubLObject least_complex_literals(SubLObject literals, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    if ((NIL != list_utilities.singletonP(literals))) {
      return literals;
    } else {
      {
        SubLObject first = literals.first();
        SubLObject ans = list(first);
        SubLObject min = el_complexity_score(first, varP, UNPROVIDED);
        SubLObject cdolist_list_var = literals.rest();
        SubLObject literal = NIL;
        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
          {
            SubLObject score = el_complexity_score(literal, varP, UNPROVIDED);
            if (score.numE(min)) {
              ans = cons(literal, ans);
            } else if (score.numL(min)) {
              min = score;
              ans = list(literal);
            }
          }
        }
        return Sequences.reverse(ans);
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 95879) 
  public static final SubLObject el_complexity_score(SubLObject object, SubLObject varP, SubLObject factor) {
    if ((varP == UNPROVIDED)) {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    if ((factor == UNPROVIDED)) {
      factor = ONE_INTEGER;
    }
    if ((NIL == object)) {
      return ZERO_INTEGER;
    } else if ((NIL != constant_handles.constant_p(object))) {
      return ONE_INTEGER;
    } else if ((NIL != Functions.funcall(varP, object))) {
      return THREE_INTEGER;
    } else if ((NIL != nart_handles.nart_p(object))) {
      return Numbers.add(FIVE_INTEGER, Numbers.divide(el_complexity_score(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10403"), varP, factor), TWO_INTEGER));
    } else if (object.isString()) {
      return Numbers.add(FOUR_INTEGER, Numbers.divide(Sequences.length(object), TWO_INTEGER));
    } else if ((NIL != assertion_handles.assertion_p(object))) {
      return Numbers.add($int106$1000, el_complexity_score(fi.assertion_fi_formula(object, UNPROVIDED), varP, factor));
    } else if (object.isAtom()) {
      return TWO_INTEGER;
    } else if (object.isCons()) {
      return Numbers.add($int107$100, el_complexity_score(object.first(), varP, factor), Numbers.multiply(factor, el_complexity_score(object.rest(), varP, Numbers.multiply(factor, $float108$0_9))));
    } else {
      return $int109$10000;
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 96581) 
  public static final SubLObject default_preference_lit(SubLObject literals) {
    {
      SubLObject ans = NIL;
      SubLObject min = Numbers.$most_positive_fixnum$.getGlobalValue();
      SubLObject cdolist_list_var = literals;
      SubLObject lit = NIL;
      for (lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), lit = cdolist_list_var.first()) {
        {
          SubLObject score = Sequences.position(el_utilities.literal_arg0(lit, UNPROVIDED), czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          if ((NIL != score)) {
            if (min.numG(score)) {
              min = score;
              ans = list(lit);
            } else if (min.numE(score)) {
              ans = cons(lit, ans);
            }
          }
        }
      }
      if ((NIL != list_utilities.singletonP(ans))) {
        return ans.first();
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-main.lisp", position = 97070) 
  public static final SubLObject canonicalize_clauses_variables(SubLObject v_clauses) {
    return rename_clauses_vars(v_clauses);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 97272) 
  public static final SubLObject rename_clauses_vars(SubLObject v_clauses) {
    return list_utilities.nmapcar($sym110$RENAME_CLAUSE_VARS_INT, v_clauses);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 97796) 
  public static final SubLObject el_nununiquifying_blist_wrt(SubLObject expression, SubLObject updateP, SubLObject forceP) {
    if ((updateP == UNPROVIDED)) {
      updateP = NIL;
    }
    if ((forceP == UNPROVIDED)) {
      forceP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject blist = NIL;
        SubLObject cdolist_list_var = list_utilities.fast_delete_duplicates(Mapping.mapcar(Symbols.symbol_function($sym87$CAR), czer_vars.$standardize_variables_memory$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
          thread.resetMultipleValues();
          {
            SubLObject referenced_as_list = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31104");
            SubLObject ambiguousP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (((NIL != forceP)
                || (NIL == ambiguousP))) {
              if ((NIL != referenced_as_list)) {
                {
                  SubLObject cdolist_list_var_63 = referenced_as_list;
                  SubLObject referenced_as = NIL;
                  for (referenced_as = cdolist_list_var_63.first(); (NIL != cdolist_list_var_63); cdolist_list_var_63 = cdolist_list_var_63.rest(), referenced_as = cdolist_list_var_63.first()) {
                    blist = cons(cons(referenced_as, var), blist);
                    if ((NIL != updateP)) {
                      czer_vars.$standardize_variables_memory$.setDynamicValue(conses_high.nsubst(var, referenced_as, czer_vars.$standardize_variables_memory$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                    }
                  }
                }
              }
            }
          }
        }
        return blist;
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 98410) 
  public static final SubLObject el_nununiquify_vars_wrt_int(SubLObject expression_1, SubLObject expression_2, SubLObject updateP, SubLObject forceP) {
    if ((updateP == UNPROVIDED)) {
      updateP = NIL;
    }
    if ((forceP == UNPROVIDED)) {
      forceP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject blist = el_nununiquifying_blist_wrt(expression_2, updateP, forceP);
        if ((NIL != blist)) {
          {
            SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
            try {
              czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
              cycl_utilities.expression_nsublis_free_vars(blist, expression_1, UNPROVIDED);
            } finally {
              czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return expression_1;
    }
  }

  /** replace uniquified vars with origs when not ambiguous */
  @SubL(source = "cycl/czer-main.lisp", position = 99050) 
  public static final SubLObject el_nununiquify_vars_int(SubLObject expression, SubLObject updateP, SubLObject forceP) {
    if ((updateP == UNPROVIDED)) {
      updateP = NIL;
    }
    if ((forceP == UNPROVIDED)) {
      forceP = NIL;
    }
    return el_nununiquify_vars_wrt_int(expression, expression, updateP, forceP);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 99559) 
  public static final SubLObject el_nununiquify_vars(SubLObject expression) {
    return el_nununiquify_vars_int(expression, NIL, UNPROVIDED);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 100558) 
  public static final SubLObject rename_clause_vars_int(SubLObject clause, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject blist = NIL;
        SubLObject free_vars = NIL;
        SubLObject closed_vars = NIL;
        clause = el_nununiquify_vars_int(clause, T, UNPROVIDED);
        if ((NIL != czer_vars.$canonicalize_variablesP$.getDynamicValue(thread))) {
          {
            SubLObject meta_blist = NIL;
            SubLObject old = NIL;
            SubLObject v_new = NIL;
            SubLObject count = ZERO_INTEGER;
            SubLObject v_variables = ((NIL != varP) ? ((SubLObject) clause_el_variables(clause, varP)) : clause_el_variables(clause, Symbols.symbol_function($sym111$CANON_VAR_)));
            if ((NIL != v_variables)) {
              closed_vars = Mapping.mapcar(Symbols.symbol_function($sym105$CDR), czer_vars.$standardize_variables_memory$.getDynamicValue(thread));
              free_vars = list_utilities.fast_set_difference(v_variables, closed_vars, UNPROVIDED);
              {
                SubLObject cdolist_list_var = cycl_utilities.formula_gather(clause, Symbols.symbol_function($sym112$ASSERTION_P), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
                  {
                    SubLObject cdolist_list_var_64 = assertions_high.assertion_el_variables(assertion);
                    SubLObject var = NIL;
                    for (var = cdolist_list_var_64.first(); (NIL != cdolist_list_var_64); cdolist_list_var_64 = cdolist_list_var_64.rest(), var = cdolist_list_var_64.first()) {
                      if ((NIL != subl_promotions.memberP(var, v_variables, UNPROVIDED, UNPROVIDED))) {
                        blist = cons(cons(var, czer_utilities.get_nth_canonical_variable(count, UNPROVIDED)), blist);
                        count = Numbers.add(count, ONE_INTEGER);
                      }
                    }
                  }
                }
              }
              {
                SubLObject cdolist_list_var = v_variables;
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
                  if ((NIL != conses_high.assoc(var, blist, UNPROVIDED, UNPROVIDED))) {
                  } else if ((NIL != term.unreified_skolem_termP(var))) {
                    el_utilities.el_error(TWO_INTEGER, $str113$_s_treated_as_variable_in_rename_, var, UNPROVIDED, UNPROVIDED);
                    v_new = conses_high.last(var, UNPROVIDED).first();
                    old = conses_high.rassoc(v_new, czer_vars.$standardize_variables_memory$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).first();
                    if ((NIL != old)) {
                      blist = cons(cons(v_new, czer_utilities.get_nth_canonical_variable(count, UNPROVIDED)), blist);
                      meta_blist = cons(cons(v_new, old), meta_blist);
                      count = Numbers.add(count, ONE_INTEGER);
                    }
                  } else {
                    blist = cons(cons(var, czer_utilities.get_nth_canonical_variable(count, UNPROVIDED)), blist);
                    count = Numbers.add(count, ONE_INTEGER);
                  }
                }
              }
              clause = cycl_utilities.expression_nsublis_free_vars(blist, clause, UNPROVIDED);
              blist = Sequences.nreverse(conses_high.sublis(meta_blist, blist, UNPROVIDED, UNPROVIDED));
            }
          }
        }
        if ((NIL != control_vars.$within_ask$.getDynamicValue(thread))) {
          return list(clause, blist, blist_vars_among(blist, blist_vars_among(blist, free_vars)));
        } else {
          return list(clause, blist);
        }
      }
    }
  }

  public static final class $rename_clause_vars_int$UnaryFunction extends UnaryFunction {
    public $rename_clause_vars_int$UnaryFunction() { super(extractFunctionNamed("RENAME-CLAUSE-VARS-INT")); }
    public SubLObject processItem(SubLObject arg1) { return rename_clause_vars_int(arg1, UNPROVIDED); }
  }

  public static final class $rename_clause_vars_int$BinaryFunction extends BinaryFunction {
    public $rename_clause_vars_int$BinaryFunction() { super(extractFunctionNamed("RENAME-CLAUSE-VARS-INT")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return rename_clause_vars_int(arg1, arg2); }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 102281) 
  public static final SubLObject blist_vars_among(SubLObject blist, SubLObject vars) {
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = blist;
      SubLObject binding = NIL;
      for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
        if ((NIL != subl_promotions.memberP(binding.first(), vars, UNPROVIDED, UNPROVIDED))) {
          result = cons(binding.first(), result);
        }
      }
      return Sequences.nreverse(result);
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 102880) 
  public static final SubLObject clause_el_variables(SubLObject clause, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym54$EL_VAR_);
    }
    if ((NIL == list_utilities.tree_find_if(varP, clause, UNPROVIDED))) {
      return NIL;
    }
    return clause_utilities.clause_free_variables(clause, varP, UNPROVIDED);
  }

  /** Assumes the EL variable namespace is bound. */
  @SubL(source = "cycl/czer-main.lisp", position = 103075) 
  public static final SubLObject initialize_symbol_suffix_table(SubLObject formula) {
    list_utilities.tree_funcall_if(Symbols.symbol_function($sym54$EL_VAR_), Symbols.symbol_function($sym114$INITIALIZE_SUFFIX_TABLE_FOR_VAR), formula, UNPROVIDED);
    return NIL;
  }

  @SubL(source = "cycl/czer-main.lisp", position = 103440) 
  public static final SubLObject initialize_suffix_table_for_var(SubLObject el_var) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject integer = extract_name_uniquifying_post_hyphen_integer(el_var);
        SubLObject symbol = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((integer.isInteger()
             && symbol.isSymbol())) {
          if (integer.numGE(ZERO_INTEGER)) {
            {
              SubLObject n = Hashtables.gethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), UNPROVIDED);
              if (((!(n.isInteger()))
                  || integer.numG(n))) {
                Hashtables.sethash(symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread), integer);
                return integer;
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final class $initialize_suffix_table_for_var$UnaryFunction extends UnaryFunction {
    public $initialize_suffix_table_for_var$UnaryFunction() { super(extractFunctionNamed("INITIALIZE-SUFFIX-TABLE-FOR-VAR")); }
    public SubLObject processItem(SubLObject arg1) { return initialize_suffix_table_for_var(arg1); }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 103867) 
  public static final SubLObject extract_name_uniquifying_post_hyphen_integer(SubLObject symbol) {
    if (symbol.isSymbol()) {
      {
        SubLObject string = Symbols.symbol_name(symbol);
        SubLObject hyphen = NIL;
        SubLObject next = NIL;
        SubLObject end = NIL;
        for (hyphen = string_utilities.char_position(Characters.CHAR_hyphen, string, UNPROVIDED), next = (hyphen.isInteger() ? ((SubLObject) Numbers.add(ONE_INTEGER, hyphen)) : NIL), end = (next.isInteger() ? ((SubLObject) string_utilities.char_type_position(Symbols.symbol_function($sym115$NOT_DIGIT_CHAR_P), string, next, UNPROVIDED)) : NIL); (!(((NIL == next)
              || ((NIL != list_utilities.lengthG(string, next, UNPROVIDED))
                 && (NIL != Characters.digit_char_p(Vectors.aref(string, next), UNPROVIDED))
                 && (NIL == end))))); hyphen = string_utilities.char_position(Characters.CHAR_hyphen, string, next), next = (hyphen.isInteger() ? ((SubLObject) Numbers.add(ONE_INTEGER, hyphen)) : NIL), end = (next.isInteger() ? ((SubLObject) string_utilities.char_type_position(Symbols.symbol_function($sym115$NOT_DIGIT_CHAR_P), string, next, UNPROVIDED)) : NIL)) {
        }
        if (next.isInteger()) {
          {
            SubLObject integer = reader.read_from_string(string_utilities.substring(string, next, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (integer.isInteger()) {
              return Values.values(integer, Packages.intern(string_utilities.substring(string, ZERO_INTEGER, hyphen), UNPROVIDED));
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-main.lisp", position = 104697) 
  public static final SubLObject canonicalize_clauses(SubLObject v_clauses, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if ((NIL == cycl_grammar.cycl_truth_value_p(v_clauses))) {
              if ((NIL != canon_fast_clausesP(v_clauses))) {
                v_clauses = list(v_clauses);
              } else {
                v_clauses = rule_macros.canonicalize_clauses_wrt_rule_macros(v_clauses);
                v_clauses = czer_meta.canonicalize_meta_clauses(v_clauses);
                v_clauses = canonicalize_clauses_terms(v_clauses);
                v_clauses = canonicalize_clauses_literals(v_clauses);
                v_clauses = canonicalize_clauses_variables(v_clauses);
              }
            }
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
      }
      thread.resetMultipleValues();
      {
        SubLObject v_clauses_65 = unwrap_clauses_if_ist_permissive(v_clauses, mt);
        SubLObject mt_66 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_clauses = v_clauses_65;
        mt = mt_66;
      }
      thread.resetMultipleValues();
      {
        SubLObject v_clauses_67 = lift_clauses_if_decontextualized(v_clauses, mt);
        SubLObject mt_68 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_clauses = v_clauses_67;
        mt = mt_68;
      }
      return Values.values(v_clauses, mt);
    }
  }

  /** Where possible, unwraps #$ist literals in CLAUSES */
  @SubL(source = "cycl/czer-main.lisp", position = 105476) 
  public static final SubLObject unwrap_clauses_if_ist_permissive(SubLObject v_clauses, SubLObject input_mt) {
    return Values.values(v_clauses, input_mt);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 106104) 
  public static final SubLObject canonicalize_query_clauses(SubLObject v_clauses, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL == cycl_grammar.cycl_truth_value_p(v_clauses))) {
              v_clauses = czer_meta.canonicalize_meta_clauses(v_clauses);
              v_clauses = canonicalize_clauses_terms(v_clauses);
              v_clauses = canonicalize_clauses_literals(v_clauses);
              v_clauses = canonicalize_clauses_variables(v_clauses);
            }
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
      }
      thread.resetMultipleValues();
      {
        SubLObject v_clauses_69 = unwrap_clauses_if_ist_permissive(v_clauses, mt);
        SubLObject mt_70 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_clauses = v_clauses_69;
        mt = mt_70;
      }
      thread.resetMultipleValues();
      {
        SubLObject v_clauses_71 = lift_clauses_if_decontextualized(v_clauses, mt);
        SubLObject mt_72 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_clauses = v_clauses_71;
        mt = mt_72;
      }
      return Values.values(v_clauses, mt);
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 107014) 
  public static final SubLObject canon_fast_clausesP(SubLObject v_clauses) {
    if ((NIL != list_utilities.singletonP(v_clauses))) {
      {
        SubLObject clause = v_clauses.first();
        if ((NIL != clause_utilities.pos_atomic_cnf_p(clause))) {
          {
            SubLObject lit = clauses.pos_lits(clause).first();
            return makeBoolean(((NIL != subl_promotions.memberP(cycl_utilities.formula_operator(lit), $list42, UNPROVIDED, UNPROVIDED))
                   && (NIL != el_utilities.groundP(lit, Symbols.symbol_function($sym54$EL_VAR_)))
                   && (NIL == el_utilities.contains_subformula_p(lit))));
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-main.lisp", position = 107352) 
  public static final SubLObject lift_clauses_if_decontextualized(SubLObject czer_clauses, SubLObject mt) {
    {
      SubLObject v_clauses = czer_utilities.extract_hl_clauses(czer_clauses);
      if ((NIL == clause_utilities.atomic_clauses_p(v_clauses))) {
        if ((NIL != czer_utilities.generalized_ist_clauses_p(v_clauses))) {
          mt = $const19$UniversalVocabularyMt;
        }
      }
    }
    return Values.values(czer_clauses, mt);
  }

  @SubL(source = "cycl/czer-main.lisp", position = 107870) 
  public static final SubLObject psc_queryP(SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return makeBoolean(((NIL != control_vars.within_queryP())
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32154"))));
  }

  @SubL(source = "cycl/czer-main.lisp", position = 111786) 
  public static final SubLObject old_last_resort_literal(SubLObject literals, SubLObject candidates, SubLObject varP) {
    if ((candidates == UNPROVIDED)) {
      candidates = NIL;
    }
    if ((varP == UNPROVIDED)) {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    {
      SubLObject literal = default_preference_lit(literals);
      if ((NIL != literal)) {
        return literal;
      } else {
        return alphabetically_minimal_literal(literals, candidates, varP);
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 112127) 
  public static final SubLObject alphabetically_minimal_literal(SubLObject literals, SubLObject candidates, SubLObject varP) {
    if ((candidates == UNPROVIDED)) {
      candidates = NIL;
    }
    if ((varP == UNPROVIDED)) {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    if ((NIL != list_utilities.singletonP(literals))) {
      return literals.first();
    } else {
      return new_alphabetically_minimal_literal_int(literals, candidates, varP);
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 112359) 
  public static final SubLObject new_alphabetically_minimal_literal_int(SubLObject literals, SubLObject candidates, SubLObject varP) {
    if ((candidates == UNPROVIDED)) {
      candidates = literals;
    }
    if ((varP == UNPROVIDED)) {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    {
      SubLObject ans = list(literals.first());
      SubLObject ans_string = string_utilities.str(el_utilities.formula_non_var_symbols(ans.first(), varP));
      SubLObject cdolist_list_var = literals.rest();
      SubLObject literal = NIL;
      for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
        {
          SubLObject lit_string = string_utilities.str(el_utilities.formula_non_var_symbols(literal, varP));
          if ((NIL != Strings.stringL(lit_string, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            ans_string = lit_string;
            ans = list(literal);
          } else if ((NIL != Strings.stringE(lit_string, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            ans = cons(literal, ans);
          }
        }
      }
      if ((NIL != list_utilities.singletonP(ans))) {
        return ans.first();
      }
      {
        SubLObject candidates_1 = last_resort_min_literals(list_utilities.ordered_set_difference(literals, ans, Symbols.symbol_function(EQUAL), UNPROVIDED));
        if ((NIL != list_utilities.singletonP(candidates_1))) {
          return candidates_1.first();
        }
        {
          SubLObject candidates_2 = last_resort_min_literals(list_utilities.ordered_set_difference(candidates, literals, Symbols.symbol_function(EQUAL), UNPROVIDED));
          if ((NIL != list_utilities.singletonP(candidates_2))) {
            return candidates_2.first();
          }
          {
            SubLObject candidates_3 = last_resort_min_literals(candidates);
            if ((NIL != list_utilities.singletonP(candidates_3))) {
              return candidates_3.first();
            }
            {
              SubLObject length_0 = ((NIL != ans) ? ((SubLObject) Sequences.length(ans)) : Numbers.$most_positive_fixnum$.getGlobalValue());
              SubLObject length_1 = ((NIL != candidates_1) ? ((SubLObject) Sequences.length(candidates_1)) : Numbers.$most_positive_fixnum$.getGlobalValue());
              SubLObject length_2 = ((NIL != candidates_2) ? ((SubLObject) Sequences.length(candidates_2)) : Numbers.$most_positive_fixnum$.getGlobalValue());
              SubLObject length_3 = ((NIL != candidates_3) ? ((SubLObject) Sequences.length(candidates_3)) : Numbers.$most_positive_fixnum$.getGlobalValue());
              SubLObject min = Numbers.min(length_0, new SubLObject[] {length_1, length_2, length_3});
              if (min.numE(length_0)) {
                return new_alphabetically_minimal_literal_int_2(default_lit_sort(ans), varP);
              } else if (min.numE(length_1)) {
                return new_alphabetically_minimal_literal_int_2(default_lit_sort(candidates_1), varP);
              } else if (min.numE(length_2)) {
                return new_alphabetically_minimal_literal_int_2(default_lit_sort(candidates_2), varP);
              } else if (min.numE(length_3)) {
                return new_alphabetically_minimal_literal_int_2(default_lit_sort(candidates_3), varP);
              } else {
                return new_alphabetically_minimal_literal_int_2(default_lit_sort(literals), varP);
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 114301) 
  public static final SubLObject new_alphabetically_minimal_literal_int_2(SubLObject literals, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    if ((NIL != list_utilities.tree_find_if(varP, literals, UNPROVIDED))) {
      return new_alphabetically_minimal_literal_int(literals, literals, Symbols.symbol_function($sym119$FALSE));
    } else {
      return literals.first();
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 114542) 
  public static final SubLObject old_commutative_terms_in_orderP(SubLObject term1, SubLObject term2) {
    if (term1.isAtom()) {
      if (term2.isAtom()) {
        return old_commutative_atoms_in_orderP(term1, term2);
      } else {
        return T;
      }
    } else {
      if (term2.isAtom()) {
        return NIL;
      } else {
        return old_commutative_conses_in_orderP(term1, term2);
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 114897) 
  public static final SubLObject old_commutative_atoms_in_orderP(SubLObject atom1, SubLObject atom2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL == czer_vars.$control_3$.getDynamicValue(thread))
           && atom1.equal(atom2))) {
        return T;
      }
      if ((NIL != constant_handles.constant_p(atom1))) {
        if ((NIL != constant_handles.constant_p(atom2))) {
          return canonicalizer_constant_L(atom1, atom2);
        } else {
          return T;
        }
      } else {
        if ((NIL != constant_handles.constant_p(atom2))) {
          return NIL;
        } else {
          if ((NIL != nart_handles.nart_p(atom1))) {
            if ((NIL != nart_handles.nart_p(atom2))) {
              return Numbers.numL(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30867"), Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30868"));
            } else {
              return T;
            }
          } else {
            if ((NIL != nart_handles.nart_p(atom2))) {
              return NIL;
            } else {
              if ((NIL != cycl_variables.el_varP(atom1))) {
                if ((NIL != cycl_variables.el_varP(atom2))) {
                  return Strings.string_lessp(Symbols.symbol_name(atom1), Symbols.symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                  return T;
                }
              } else {
                if ((NIL != cycl_variables.el_varP(atom2))) {
                  return NIL;
                } else {
                  if ((NIL != cycl_variables.kb_varP(atom1))) {
                    if ((NIL != cycl_variables.kb_varP(atom2))) {
                      return Numbers.numL(variables.variable_id(atom1), variables.variable_id(atom2));
                    } else {
                      return T;
                    }
                  } else {
                    if ((NIL != cycl_variables.kb_varP(atom1))) {
                      return NIL;
                    } else {
                      if (atom1.isSymbol()) {
                        if (atom2.isSymbol()) {
                          return Strings.string_lessp(Symbols.symbol_name(atom1), Symbols.symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                          return T;
                        }
                      } else {
                        if (atom2.isSymbol()) {
                          return NIL;
                        } else {
                          if (atom1.isNumber()) {
                            if (atom2.isNumber()) {
                              return Numbers.numL(atom1, atom2);
                            } else {
                              return T;
                            }
                          } else {
                            if (atom2.isNumber()) {
                              return NIL;
                            } else {
                              if (atom1.isChar()) {
                                if (atom2.isChar()) {
                                  return Characters.char_lessp(atom1, atom2);
                                } else {
                                  return T;
                                }
                              } else {
                                if (atom2.isChar()) {
                                  return NIL;
                                } else {
                                  if (atom1.isString()) {
                                    if (atom2.isString()) {
                                      return Strings.string_lessp(atom1, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                      return T;
                                    }
                                  } else {
                                    if (atom2.isString()) {
                                      return NIL;
                                    } else {
                                      return Strings.string_lessp(string_utilities.str(atom1), string_utilities.str(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 117359) 
  public static final SubLObject old_commutative_conses_in_orderP(SubLObject cons1, SubLObject cons2) {
    {
      SubLObject var_num1 = list_utilities.tree_count_if(Symbols.symbol_function($sym54$EL_VAR_), cons1, UNPROVIDED);
      SubLObject var_num2 = list_utilities.tree_count_if(Symbols.symbol_function($sym54$EL_VAR_), cons2, UNPROVIDED);
      if (var_num1.numL(var_num2)) {
        return T;
      } else {
        if (var_num1.numG(var_num2)) {
          return NIL;
        } else {
          {
            SubLObject atom_num1 = list_utilities.tree_count_if(Symbols.symbol_function($sym55$ATOM), cons1, UNPROVIDED);
            SubLObject atom_num2 = list_utilities.tree_count_if(Symbols.symbol_function($sym55$ATOM), cons2, UNPROVIDED);
            if (atom_num1.numL(atom_num2)) {
              return T;
            } else {
              if (atom_num1.numG(atom_num2)) {
                return NIL;
              } else {
                if (((!(cons1.first().equal(cons2.first())))
                     && (NIL != commutative_terms_in_orderP(cons1.first(), cons2.first())))) {
                  return T;
                } else {
                  if (((!(cons1.first().equal(cons2.first())))
                       && (NIL != commutative_terms_in_orderP(cons2.first(), cons1.first())))) {
                    return NIL;
                  } else {
                    return commutative_terms_in_orderP(cons1.rest(), cons2.rest());
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 118871) 
  public static final SubLObject last_resort_min_literals(SubLObject literals) {
    {
      SubLObject selected = NIL;
      SubLObject remaining = NIL;
      for (selected = last_resort_min_literals_int(literals), remaining = list_utilities.ordered_set_difference(literals, selected, Symbols.symbol_function(EQUAL), UNPROVIDED); (!(((NIL != list_utilities.singletonP(selected))
            || (NIL == remaining)))); selected = last_resort_min_literals_int(remaining), remaining = list_utilities.ordered_set_difference(remaining, selected, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
      }
      if ((NIL != selected)) {
        return selected;
      } else if ((NIL != remaining)) {
        return remaining;
      } else if ((NIL != literals)) {
        return literals;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-main.lisp", position = 119302) 
  public static final SubLObject last_resort_min_literals_int(SubLObject literals) {
    if ((NIL != literals)) {
      if ((NIL != list_utilities.singletonP(literals))) {
        return literals;
      }
      {
        SubLObject min_candidates = last_resort_min_literals_min(literals);
        if ((NIL != list_utilities.singletonP(min_candidates))) {
          return min_candidates;
        }
        {
          SubLObject max_candidates = last_resort_min_literals_max(literals);
          if ((NIL != list_utilities.singletonP(max_candidates))) {
            return max_candidates;
          }
          if (Sequences.length(min_candidates).numLE(Sequences.length(max_candidates))) {
            return min_candidates;
          } else {
            return max_candidates;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-main.lisp", position = 119822) 
  public static final SubLObject last_resort_min_literals_min(SubLObject literals) {
    {
      SubLObject result = list(literals.first());
      SubLObject value = last_resort_min_literals_fn(result.first());
      SubLObject cdolist_list_var = literals.rest();
      SubLObject literal = NIL;
      for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
        {
          SubLObject lit_value = last_resort_min_literals_fn(literal);
          if (lit_value.numL(value)) {
            value = lit_value;
            result = list(literal);
          } else if (lit_value.numE(value)) {
            result = cons(literal, result);
          }
        }
      }
      return result;
    }
  }

  /** @hack this function must die as soon as the recanonicalizer works -eca */
  @SubL(source = "cycl/czer-main.lisp", position = 120239) 
  public static final SubLObject constant_median(SubLObject constants) {
    return list_utilities.parametrized_median(constants, Symbols.symbol_function($sym120$CONSTANT_EXTERNAL_ID__));
  }

  /** @hack this function must die as soon as the recanonicalizer works -eca */
  @SubL(source = "cycl/czer-main.lisp", position = 120425) 
  public static final SubLObject ugly_thing_L(SubLObject ugly1, SubLObject ugly2) {
    if (ugly1.eql(Numbers.$most_positive_fixnum$.getGlobalValue())) {
      return NIL;
    } else if (ugly2.eql(Numbers.$most_positive_fixnum$.getGlobalValue())) {
      return T;
    } else {
      return constants_high.constant_external_id_L(ugly1, ugly2);
    }
  }

  /** @hack this function must die as soon as the recanonicalizer works -eca */
  @SubL(source = "cycl/czer-main.lisp", position = 120756) 
  public static final SubLObject ugly_thing_G(SubLObject ugly1, SubLObject ugly2) {
    return makeBoolean(((NIL == ugly_thing_L(ugly1, ugly2))
           && (!(ugly1.equal(ugly2)))));
  }

  @SubL(source = "cycl/czer-main.lisp", position = 120958) 
  public static final SubLObject last_resort_min_literals_max(SubLObject literals) {
    {
      SubLObject result = list(literals.first());
      SubLObject value = last_resort_min_literals_fn(result.first());
      SubLObject cdolist_list_var = literals.rest();
      SubLObject literal = NIL;
      for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
        {
          SubLObject lit_value = last_resort_min_literals_fn(literal);
          if ((NIL != ugly_thing_G(lit_value, value))) {
            value = lit_value;
            result = list(literal);
          } else if (lit_value.equal(value)) {
            result = cons(literal, result);
          }
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/czer-main.lisp", position = 121388) 
  public static final SubLObject last_resort_min_literals_fn(SubLObject lit) {
    {
      SubLObject constants = cycl_utilities.expression_gather(lit, Symbols.symbol_function($sym121$CONSTANT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      SubLObject value = constant_median(constants);
      if ((NIL != constants_high.constant_external_id_p(value))) {
        return value;
      } else {
        return Numbers.$most_positive_fixnum$.getGlobalValue();
      }
    }
  }

  public static final SubLObject declare_czer_main_file() {
    declareFunction(myName, "el_to_hl", "EL-TO-HL", 1, 1, false);
    declareFunction(myName, "el_to_hl_query", "EL-TO-HL-QUERY", 1, 1, false);
    declareFunction(myName, "el_to_hl_fast", "EL-TO-HL-FAST", 1, 1, false);
    declareFunction(myName, "el_to_hl_really_fast", "EL-TO-HL-REALLY-FAST", 1, 1, false);
    declareFunction(myName, "canonicalize_term", "CANONICALIZE-TERM", 1, 1, false);
    declareFunction(myName, "canonicalize_term_memoized", "CANONICALIZE-TERM-MEMOIZED", 1, 1, false);
    declareFunction(myName, "canonicalize_term_memoized_int_internal", "CANONICALIZE-TERM-MEMOIZED-INT-INTERNAL", 2, 0, false);
    declareFunction(myName, "canonicalize_term_memoized_int", "CANONICALIZE-TERM-MEMOIZED-INT", 2, 0, false);
    declareFunction(myName, "canonicalize_term_assert", "CANONICALIZE-TERM-ASSERT", 1, 1, false);
    declareFunction(myName, "coerce_to_fort", "COERCE-TO-FORT", 1, 0, false);
    declareFunction(myName, "canonicalize_gaf", "CANONICALIZE-GAF", 2, 0, false);
    declareFunction(myName, "canonicalize_wf_gaf", "CANONICALIZE-WF-GAF", 2, 0, false);
    declareFunction(myName, "ncanonicalize_cycl", "NCANONICALIZE-CYCL", 1, 1, false);
    declareFunction(myName, "canonicalize_cycl", "CANONICALIZE-CYCL", 1, 1, false);
    declareFunction(myName, "canonicalize_cycl_int", "CANONICALIZE-CYCL-INT", 1, 5, false);
    declareFunction(myName, "clothe_naked_skolems", "CLOTHE-NAKED-SKOLEMS", 1, 0, false);
    declareFunction(myName, "czer_result_quiescedP", "CZER-RESULT-QUIESCED?", 2, 0, false);
    declareFunction(myName, "canonicalize_cycl_sentence", "CANONICALIZE-CYCL-SENTENCE", 1, 1, false);
    declareFunction(myName, "canonicalize_cycl_test", "CANONICALIZE-CYCL-TEST", 1, 1, false);
    declareFunction(myName, "canonicalize_wf_cycl", "CANONICALIZE-WF-CYCL", 1, 1, false);
    declareFunction(myName, "canonicalize_wf_cycl_memoized", "CANONICALIZE-WF-CYCL-MEMOIZED", 1, 1, false);
    declareFunction(myName, "canonicalize_wf_cycl_int_memoized_internal", "CANONICALIZE-WF-CYCL-INT-MEMOIZED-INTERNAL", 2, 0, false);
    declareFunction(myName, "canonicalize_wf_cycl_int_memoized", "CANONICALIZE-WF-CYCL-INT-MEMOIZED", 2, 0, false);
    declareFunction(myName, "canonicalize_wf_cycl_sentence", "CANONICALIZE-WF-CYCL-SENTENCE", 1, 1, false);
    declareFunction(myName, "canonicalize_ask_memoized", "CANONICALIZE-ASK-MEMOIZED", 1, 1, false);
    declareFunction(myName, "canonicalize_ask_int_memoized_internal", "CANONICALIZE-ASK-INT-MEMOIZED-INTERNAL", 2, 0, false);
    declareFunction(myName, "canonicalize_ask_int_memoized", "CANONICALIZE-ASK-INT-MEMOIZED", 2, 0, false);
    declareFunction(myName, "canonicalize_ask", "CANONICALIZE-ASK", 1, 1, false);
    declareFunction(myName, "canonicalize_ask_mt", "CANONICALIZE-ASK-MT", 1, 0, false);
    declareFunction(myName, "canonicalize_ask_sentence", "CANONICALIZE-ASK-SENTENCE", 1, 1, false);
    declareFunction(myName, "canonicalize_assert", "CANONICALIZE-ASSERT", 1, 1, false);
    declareFunction(myName, "test_canonicalize_assert", "TEST-CANONICALIZE-ASSERT", 1, 1, false);
    declareFunction(myName, "canonicalize_assert_mt", "CANONICALIZE-ASSERT-MT", 1, 0, false);
    declareFunction(myName, "canonicalize_mt", "CANONICALIZE-MT", 1, 0, false);
    declareFunction(myName, "canonicalize_assert_sentence", "CANONICALIZE-ASSERT-SENTENCE", 1, 1, false);
    declareFunction(myName, "test_canonicalize_assert_sentence", "TEST-CANONICALIZE-ASSERT-SENTENCE", 1, 1, false);
    declareFunction(myName, "canonicalize_wf_assert_sentence", "CANONICALIZE-WF-ASSERT-SENTENCE", 1, 1, false);
    declareFunction(myName, "canonicalize_unassert", "CANONICALIZE-UNASSERT", 1, 1, false);
    declareFunction(myName, "canonicalize_unassert_sentence", "CANONICALIZE-UNASSERT-SENTENCE", 1, 1, false);
    declareFunction(myName, "ncanonicalize_query", "NCANONICALIZE-QUERY", 1, 1, false);
    declareFunction(myName, "canonicalize_query", "CANONICALIZE-QUERY", 1, 3, false);
    declareFunction(myName, "canonicalize_query_sentence", "CANONICALIZE-QUERY-SENTENCE", 1, 1, false);
    declareFunction(myName, "canonicalize_expression", "CANONICALIZE-EXPRESSION", 1, 2, false);
    declareFunction(myName, "clausify_eliminating_ists", "CLAUSIFY-ELIMINATING-ISTS", 4, 0, false);
    declareFunction(myName, "remove_newly_introduced_variables_from_bindings", "REMOVE-NEWLY-INTRODUCED-VARIABLES-FROM-BINDINGS", 2, 0, false);
    declareFunction(myName, "clear_canon_caches", "CLEAR-CANON-CACHES", 0, 0, false);
    declareFunction(myName, "canon_wffP", "CANON-WFF?", 1, 1, false);
    declareFunction(myName, "check_wff_arityP", "CHECK-WFF-ARITY?", 0, 0, false);
    declareFunction(myName, "check_wff_semanticsP", "CHECK-WFF-SEMANTICS?", 0, 1, false);
    declareFunction(myName, "canonicalize_clauses_terms", "CANONICALIZE-CLAUSES-TERMS", 1, 0, false);
    declareFunction(myName, "canonicalize_clauses_quoted_terms", "CANONICALIZE-CLAUSES-QUOTED-TERMS", 1, 0, false);
    declareFunction(myName, "canonicalize_clause_quoted_terms", "CANONICALIZE-CLAUSE-QUOTED-TERMS", 1, 0, false); new $canonicalize_clause_quoted_terms$UnaryFunction();
    declareFunction(myName, "canonicalize_literals_quoted_terms", "CANONICALIZE-LITERALS-QUOTED-TERMS", 1, 0, false);
    declareFunction(myName, "canonicalize_literal_quoted_terms_recursive", "CANONICALIZE-LITERAL-QUOTED-TERMS-RECURSIVE", 1, 0, false);
    declareFunction(myName, "canonicalize_quoted_term", "CANONICALIZE-QUOTED-TERM", 1, 1, false);
    declareFunction(myName, "unquote_quoted_term", "UNQUOTE-QUOTED-TERM", 1, 1, false);
    declareFunction(myName, "canonicalize_clauses_sentence_terms", "CANONICALIZE-CLAUSES-SENTENCE-TERMS", 1, 0, false);
    declareFunction(myName, "canonicalize_no_sentence_argsP", "CANONICALIZE-NO-SENTENCE-ARGS?", 0, 0, false);
    declareFunction(myName, "canonicalize_clause_sentence_terms", "CANONICALIZE-CLAUSE-SENTENCE-TERMS", 1, 0, false); new $canonicalize_clause_sentence_terms$UnaryFunction();
    declareFunction(myName, "unnegate_and_flip_negated_lits", "UNNEGATE-AND-FLIP-NEGATED-LITS", 2, 0, false);
    declareFunction(myName, "canonicalize_literal_sentence_terms", "CANONICALIZE-LITERAL-SENTENCE-TERMS", 1, 1, false); new $canonicalize_literal_sentence_terms$UnaryFunction(); new $canonicalize_literal_sentence_terms$BinaryFunction();
    declareFunction(myName, "canonicalize_function_sentence_terms", "CANONICALIZE-FUNCTION-SENTENCE-TERMS", 1, 1, false);
    declareFunction(myName, "canonicalize_relation_sentence_terms", "CANONICALIZE-RELATION-SENTENCE-TERMS", 1, 1, false);
    declareFunction(myName, "canonicalize_clauses_commutative_terms_destructive", "CANONICALIZE-CLAUSES-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
    declareFunction(myName, "canonicalize_clause_commutative_terms", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS", 1, 0, false);
    declareFunction(myName, "canonicalize_clause_commutative_terms_destructive", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false); new $canonicalize_clause_commutative_terms_destructive$UnaryFunction();
    declareFunction(myName, "never_commutative_gaf_clauseP", "NEVER-COMMUTATIVE-GAF-CLAUSE?", 1, 0, false);
    declareFunction(myName, "canonicalize_literals_commutative_terms", "CANONICALIZE-LITERALS-COMMUTATIVE-TERMS", 1, 0, false);
    declareFunction(myName, "canonicalize_literal_commutative_terms", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS", 1, 0, false);
    declareFunction(myName, "canonicalize_literal_commutative_terms_destructive", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false); new $canonicalize_literal_commutative_terms_destructive$UnaryFunction();
    declareFunction(myName, "canonicalize_literal_commutative_args", "CANONICALIZE-LITERAL-COMMUTATIVE-ARGS", 1, 0, false);
    declareFunction(myName, "order_commutative_terms", "ORDER-COMMUTATIVE-TERMS", 1, 0, false);
    declareFunction(myName, "canonicalize_terms_commutative_terms_without_reordering", "CANONICALIZE-TERMS-COMMUTATIVE-TERMS-WITHOUT-REORDERING", 2, 0, false);
    declareFunction(myName, "canonicalize_term_commutative_terms", "CANONICALIZE-TERM-COMMUTATIVE-TERMS", 1, 0, false);
    declareFunction(myName, "unary_function_commutes_with_its_argumentP", "UNARY-FUNCTION-COMMUTES-WITH-ITS-ARGUMENT?", 1, 0, false);
    declareFunction(myName, "canonicalize_commuting_function", "CANONICALIZE-COMMUTING-FUNCTION", 1, 0, false);
    declareFunction(myName, "canonicalize_nat_commutative_terms", "CANONICALIZE-NAT-COMMUTATIVE-TERMS", 1, 0, false);
    declareFunction(myName, "canonicalize_relation_commutative_terms", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS", 1, 0, false);
    declareFunction(myName, "canonicalize_relation_commutative_terms_destructive", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false);
    declareFunction(myName, "sort_relation_commutative_terms", "SORT-RELATION-COMMUTATIVE-TERMS", 1, 0, false);
    declareFunction(myName, "sort_partially_commutative_terms", "SORT-PARTIALLY-COMMUTATIVE-TERMS", 3, 0, false);
    declareFunction(myName, "commutative_argnums", "COMMUTATIVE-ARGNUMS", 1, 0, false);
    declareFunction(myName, "ok_wrt_partial_commutativityP", "OK-WRT-PARTIAL-COMMUTATIVITY?", 3, 0, false);
    declareFunction(myName, "partially_commutative_argnums", "PARTIALLY-COMMUTATIVE-ARGNUMS", 2, 0, false);
    declareFunction(myName, "partially_commutative_argnums_int", "PARTIALLY-COMMUTATIVE-ARGNUMS-INT", 2, 1, false);
    declareFunction(myName, "cia_formulas", "CIA-FORMULAS", 1, 1, false);
    declareFunction(myName, "commutative_terms_in_orderP", "COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false); new $commutative_terms_in_orderP$BinaryFunction();
    declareFunction(myName, "commutative_formulas_in_orderP", "COMMUTATIVE-FORMULAS-IN-ORDER?", 2, 0, false);
    declareFunction(myName, "canonicalizer_constant_L", "CANONICALIZER-CONSTANT-<", 2, 0, false);
    declareFunction(myName, "commutative_atoms_in_orderP", "COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false);
    declareFunction(myName, "canon_term_L", "CANON-TERM-<", 2, 0, false);
    declareFunction(myName, "canonicalize_functions_in_clause", "CANONICALIZE-FUNCTIONS-IN-CLAUSE", 1, 0, false);
    declareFunction(myName, "canonicalize_functions", "CANONICALIZE-FUNCTIONS", 1, 0, false);
    declareFunction(myName, "add_term_of_unit_lits", "ADD-TERM-OF-UNIT-LITS", 1, 0, false);
    declareFunction(myName, "clauses_free_variables", "CLAUSES-FREE-VARIABLES", 1, 0, false);
    declareFunction(myName, "add_term_of_unit_lits_1", "ADD-TERM-OF-UNIT-LITS-1", 1, 0, false);
    declareFunction(myName, "equal_wrt_svm", "EQUAL-WRT-SVM", 2, 0, false);
    declareFunction(myName, "reifiable_function_term_in_clauseP", "REIFIABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false);
    declareFunction(myName, "evaluatable_function_term_in_clauseP", "EVALUATABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false);
    declareFunction(myName, "czer_create_nartsP", "CZER-CREATE-NARTS?", 0, 0, false);
    declareFunction(myName, "reify_relation_functions_in_mt_list", "REIFY-RELATION-FUNCTIONS-IN-MT-LIST", 2, 1, false);
    declareFunction(myName, "reify_relation_functions", "REIFY-RELATION-FUNCTIONS", 1, 1, false);
    declareFunction(myName, "reify_relation_functions_in", "REIFY-RELATION-FUNCTIONS-IN", 3, 0, false);
    declareFunction(myName, "reify_relation_function_in", "REIFY-RELATION-FUNCTION-IN", 3, 0, false);
    declareFunction(myName, "reify_functions_in_mt", "REIFY-FUNCTIONS-IN-MT", 2, 0, false);
    declareFunction(myName, "reify_functions", "REIFY-FUNCTIONS", 2, 0, false);
    declareFunction(myName, "reify_functions_in", "REIFY-FUNCTIONS-IN", 2, 0, false);
    declareFunction(myName, "reify_function_in_fns", "REIFY-FUNCTION-IN-FNS", 2, 0, false);
    declareFunction(myName, "reify_function_in", "REIFY-FUNCTION-IN", 2, 0, false);
    declareFunction(myName, "reify_function_in_destructive", "REIFY-FUNCTION-IN-DESTRUCTIVE", 2, 0, false);
    declareFunction(myName, "canonicalize_fn_term_if_reified", "CANONICALIZE-FN-TERM-IF-REIFIED", 1, 0, false);
    declareFunction(myName, "canonicalize_fn_term_if_reified_destructive", "CANONICALIZE-FN-TERM-IF-REIFIED-DESTRUCTIVE", 1, 0, false);
    declareFunction(myName, "canonicalize_fn_term", "CANONICALIZE-FN-TERM", 1, 0, false);
    declareFunction(myName, "cyc_find_or_create_nart", "CYC-FIND-OR-CREATE-NART", 1, 1, false);
    declareFunction(myName, "low_find_or_create_nart", "LOW-FIND-OR-CREATE-NART", 1, 0, false);
    declareFunction(myName, "canonicalize_fn_term_int", "CANONICALIZE-FN-TERM-INT", 3, 1, false);
    declareFunction(myName, "canonicalize_naut", "CANONICALIZE-NAUT", 1, 0, false);
    declareFunction(myName, "cyc_find_or_create_canonical_nart", "CYC-FIND-OR-CREATE-CANONICAL-NART", 1, 0, false);
    declareFunction(myName, "cyc_create_nart", "CYC-CREATE-NART", 1, 0, false);
    declareFunction(myName, "new_canonicalize_fn_term", "NEW-CANONICALIZE-FN-TERM", 1, 0, false);
    declareFunction(myName, "new_nested_fn_terms", "NEW-NESTED-FN-TERMS", 1, 0, false);
    declareFunction(myName, "nested_fn_terms", "NESTED-FN-TERMS", 1, 0, false);
    declareFunction(myName, "all_nested_fn_terms", "ALL-NESTED-FN-TERMS", 1, 0, false);
    declareFunction(myName, "fort_sort_by_type_and_id", "FORT-SORT-BY-TYPE-AND-ID", 1, 0, false);
    declareFunction(myName, "fort_type_and_id_L", "FORT-TYPE-AND-ID-<", 2, 0, false);
    declareFunction(myName, "clause_quantified_fn_terms", "CLAUSE-QUANTIFIED-FN-TERMS", 1, 0, false);
    declareFunction(myName, "literals_quantified_fn_terms", "LITERALS-QUANTIFIED-FN-TERMS", 1, 0, false);
    declareFunction(myName, "literal_quantified_fn_terms", "LITERAL-QUANTIFIED-FN-TERMS", 1, 0, false); new $literal_quantified_fn_terms$UnaryFunction();
    declareFunction(myName, "clause_terms_to_reify", "CLAUSE-TERMS-TO-REIFY", 1, 0, false);
    declareFunction(myName, "literal_terms_to_reify", "LITERAL-TERMS-TO-REIFY", 1, 1, false); new $literal_terms_to_reify$UnaryFunction(); new $literal_terms_to_reify$BinaryFunction();
    declareFunction(myName, "function_terms_to_reify", "FUNCTION-TERMS-TO-REIFY", 1, 1, false);
    declareFunction(myName, "relation_terms_to_reify", "RELATION-TERMS-TO-REIFY", 1, 1, false);
    declareFunction(myName, "guaranteed_nothing_to_reifyP", "GUARANTEED-NOTHING-TO-REIFY?", 1, 0, false);
    declareFunction(myName, "reify_argP", "REIFY-ARG?", 3, 1, false);
    declareFunction(myName, "dont_reify_arg_or_subtermsP", "DONT-REIFY-ARG-OR-SUBTERMS?", 4, 0, false);
    declareFunction(myName, "reify_termP", "REIFY-TERM?", 1, 1, false);
    declareFunction(myName, "forward_inference_reifiable_function_termP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION-TERM?", 1, 1, false);
    declareFunction(myName, "forward_inference_reifiable_functionP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION?", 1, 1, false);
    declareFunction(myName, "subst_canon_fn_in_clauses", "SUBST-CANON-FN-IN-CLAUSES", 3, 0, false);
    declareFunction(myName, "subst_canon_fn_in_clause", "SUBST-CANON-FN-IN-CLAUSE", 3, 0, false);
    declareFunction(myName, "subst_canon_fn_in_relation", "SUBST-CANON-FN-IN-RELATION", 3, 1, false);
    declareFunction(myName, "subst_canon_fn_in_literal", "SUBST-CANON-FN-IN-LITERAL", 3, 0, false);
    declareFunction(myName, "subst_canon_fn_in_nat", "SUBST-CANON-FN-IN-NAT", 3, 0, false);
    declareFunction(myName, "canonicalize_clauses_tou_terms", "CANONICALIZE-CLAUSES-TOU-TERMS", 1, 0, false);
    declareFunction(myName, "canonicalize_clause_tou_terms", "CANONICALIZE-CLAUSE-TOU-TERMS", 1, 0, false); new $canonicalize_clause_tou_terms$UnaryFunction();
    declareFunction(myName, "nat_atoms", "NAT-ATOMS", 1, 0, false);
    declareFunction(myName, "canonicalize_literals_tou_terms", "CANONICALIZE-LITERALS-TOU-TERMS", 2, 0, false);
    declareFunction(myName, "dwim_svm_wrt_scoping", "DWIM-SVM-WRT-SCOPING", 3, 0, false);
    declareFunction(myName, "var_is_scoped_in_literalP", "VAR-IS-SCOPED-IN-LITERAL?", 2, 0, false);
    declareFunction(myName, "var_is_scoped_in_formulaP", "VAR-IS-SCOPED-IN-FORMULA?", 1, 0, false);
    declareFunction(myName, "canonicalize_clauses_literals", "CANONICALIZE-CLAUSES-LITERALS", 1, 0, false);
    declareFunction(myName, "sort_clauses", "SORT-CLAUSES", 1, 0, false);
    declareFunction(myName, "clauses_in_orderP", "CLAUSES-IN-ORDER?", 2, 0, false);
    declareFunction(myName, "sort_clauses_literals", "SORT-CLAUSES-LITERALS", 1, 0, false);
    declareFunction(myName, "sort_clause_literals", "SORT-CLAUSE-LITERALS", 1, 1, false); new $sort_clause_literals$UnaryFunction(); new $sort_clause_literals$BinaryFunction();
    declareFunction(myName, "canonicalize_skolem_clause", "CANONICALIZE-SKOLEM-CLAUSE", 1, 1, false);
    declareFunction(myName, "sort_clause_literals_destructive", "SORT-CLAUSE-LITERALS-DESTRUCTIVE", 1, 1, false);
    declareFunction(myName, "tou_lits_at_rear", "TOU-LITS-AT-REAR", 1, 0, false);
    declareFunction(myName, "evaluate_lits_at_rear", "EVALUATE-LITS-AT-REAR", 1, 0, false);
    declareFunction(myName, "sort_literals", "SORT-LITERALS", 1, 4, false);
    declareFunction(myName, "pick_a_lit", "PICK-A-LIT", 1, 4, false);
    declareFunction(myName, "new_bound_vars", "NEW-BOUND-VARS", 1, 1, false);
    declareFunction(myName, "new_connected_vars", "NEW-CONNECTED-VARS", 1, 1, false);
    declareFunction(myName, "unbound_vars", "UNBOUND-VARS", 2, 0, false);
    declareFunction(myName, "most_constrained_literals", "MOST-CONSTRAINED-LITERALS", 1, 2, false);
    declareFunction(myName, "unbound_vars_score", "UNBOUND-VARS-SCORE", 2, 0, false);
    declareFunction(myName, "temp_unbound_vars_score", "TEMP-UNBOUND-VARS-SCORE", 2, 0, false);
    declareFunction(myName, "fewest_arg_literals", "FEWEST-ARG-LITERALS", 1, 0, false);
    declareFunction(myName, "left_weighted_literals", "LEFT-WEIGHTED-LITERALS", 1, 0, false);
    declareFunction(myName, "left_weighted_score", "LEFT-WEIGHTED-SCORE", 1, 1, false);
    declareFunction(myName, "n_left_weighted_score_weights", "N-LEFT-WEIGHTED-SCORE-WEIGHTS", 1, 1, false);
    declareFunction(myName, "left_connected_literals", "LEFT-CONNECTED-LITERALS", 1, 1, false);
    declareFunction(myName, "left_connected_score", "LEFT-CONNECTED-SCORE", 2, 0, false);
    declareFunction(myName, "left_rooted_literals", "LEFT-ROOTED-LITERALS", 1, 1, false);
    declareFunction(myName, "default_lit_sort", "DEFAULT-LIT-SORT", 1, 0, false);
    declareFunction(myName, "lit_L", "LIT-<", 2, 0, false); new $lit_L$BinaryFunction();
    declareFunction(myName, "pred_L", "PRED-<", 2, 0, false);
    declareFunction(myName, "left_rooted_literals_int", "LEFT-ROOTED-LITERALS-INT", 1, 1, false);
    declareFunction(myName, "left_rooted_score", "LEFT-ROOTED-SCORE", 2, 1, false);
    declareFunction(myName, "max_scored_item", "MAX-SCORED-ITEM", 1, 2, false);
    declareFunction(myName, "least_complex_literals", "LEAST-COMPLEX-LITERALS", 1, 1, false);
    declareFunction(myName, "el_complexity_score", "EL-COMPLEXITY-SCORE", 1, 2, false);
    declareFunction(myName, "default_preference_lit", "DEFAULT-PREFERENCE-LIT", 1, 0, false);
    declareFunction(myName, "canonicalize_disjunctions_as_enumerations", "CANONICALIZE-DISJUNCTIONS-AS-ENUMERATIONS", 1, 0, false);
    declareFunction(myName, "canonicalize_clauses_variables", "CANONICALIZE-CLAUSES-VARIABLES", 1, 0, false);
    declareFunction(myName, "rename_clauses_vars", "RENAME-CLAUSES-VARS", 1, 0, false);
    declareFunction(myName, "standardize_variable_memory_binding", "STANDARDIZE-VARIABLE-MEMORY-BINDING", 2, 0, false);
    declareFunction(myName, "el_nununiquifying_blist_wrt", "EL-NUNUNIQUIFYING-BLIST-WRT", 1, 2, false);
    declareFunction(myName, "el_nununiquify_vars_wrt_int", "EL-NUNUNIQUIFY-VARS-WRT-INT", 2, 2, false);
    declareFunction(myName, "el_nununiquify_vars_wrt", "EL-NUNUNIQUIFY-VARS-WRT", 2, 0, false);
    declareFunction(myName, "el_nununiquify_vars_int", "EL-NUNUNIQUIFY-VARS-INT", 1, 2, false);
    declareFunction(myName, "el_ununiquify_vars_int", "EL-UNUNIQUIFY-VARS-INT", 1, 2, false);
    declareFunction(myName, "el_nununiquify_vars", "EL-NUNUNIQUIFY-VARS", 1, 0, false);
    declareFunction(myName, "uniquify", "UNIQUIFY", 1, 0, false);
    declareFunction(myName, "rename_clauses_vars_safe", "RENAME-CLAUSES-VARS-SAFE", 1, 0, false);
    declareFunction(myName, "rename_clause_vars", "RENAME-CLAUSE-VARS", 1, 1, false);
    declareFunction(myName, "rename_clause_vars_int", "RENAME-CLAUSE-VARS-INT", 1, 1, false); new $rename_clause_vars_int$UnaryFunction(); new $rename_clause_vars_int$BinaryFunction();
    declareFunction(myName, "blist_vars_among", "BLIST-VARS-AMONG", 2, 0, false);
    declareFunction(myName, "blist_vars_not_among", "BLIST-VARS-NOT-AMONG", 2, 0, false);
    declareFunction(myName, "all_bindings", "ALL-BINDINGS", 2, 0, false);
    declareFunction(myName, "clause_el_variables", "CLAUSE-EL-VARIABLES", 1, 1, false);
    declareFunction(myName, "initialize_symbol_suffix_table", "INITIALIZE-SYMBOL-SUFFIX-TABLE", 1, 0, false);
    declareFunction(myName, "initialize_suffix_table_for_var", "INITIALIZE-SUFFIX-TABLE-FOR-VAR", 1, 0, false); new $initialize_suffix_table_for_var$UnaryFunction();
    declareFunction(myName, "extract_name_uniquifying_post_hyphen_integer", "EXTRACT-NAME-UNIQUIFYING-POST-HYPHEN-INTEGER", 1, 0, false);
    declareFunction(myName, "canonicalize_clauses", "CANONICALIZE-CLAUSES", 2, 0, false);
    declareFunction(myName, "unwrap_clauses_if_ist_permissive", "UNWRAP-CLAUSES-IF-IST-PERMISSIVE", 2, 0, false);
    declareFunction(myName, "canonicalize_query_clauses", "CANONICALIZE-QUERY-CLAUSES", 2, 0, false);
    declareFunction(myName, "canon_fast_clausesP", "CANON-FAST-CLAUSES?", 1, 0, false);
    declareFunction(myName, "lift_clauses_if_decontextualized", "LIFT-CLAUSES-IF-DECONTEXTUALIZED", 2, 0, false);
    declareFunction(myName, "psc_queryP", "PSC-QUERY?", 0, 1, false);
    declareFunction(myName, "canonicalizer_problemP", "CANONICALIZER-PROBLEM?", 1, 0, false);
    declareFunction(myName, "tl_canonicalizer_problemP", "TL-CANONICALIZER-PROBLEM?", 1, 0, false);
    declareFunction(myName, "terms_reorder_equalP", "TERMS-REORDER-EQUAL?", 2, 0, false);
    declareFunction(myName, "cnfs_reorder_tou_equalP", "CNFS-REORDER-TOU-EQUAL?", 2, 1, false);
    declareFunction(myName, "unique_arity_literal", "UNIQUE-ARITY-LITERAL", 1, 0, false);
    declareFunction(myName, "unique_list_structure_literal", "UNIQUE-LIST-STRUCTURE-LITERAL", 1, 0, false);
    declareFunction(myName, "old_last_resort_literal", "OLD-LAST-RESORT-LITERAL", 1, 2, false);
    declareFunction(myName, "alphabetically_minimal_literal", "ALPHABETICALLY-MINIMAL-LITERAL", 1, 2, false);
    declareFunction(myName, "new_alphabetically_minimal_literal_int", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT", 1, 2, false);
    declareFunction(myName, "new_alphabetically_minimal_literal_int_2", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT-2", 1, 1, false);
    declareFunction(myName, "old_commutative_terms_in_orderP", "OLD-COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false);
    declareFunction(myName, "old_commutative_atoms_in_orderP", "OLD-COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false);
    declareFunction(myName, "old_commutative_conses_in_orderP", "OLD-COMMUTATIVE-CONSES-IN-ORDER?", 2, 0, false);
    declareFunction(myName, "last_resort_min_literals", "LAST-RESORT-MIN-LITERALS", 1, 0, false);
    declareFunction(myName, "last_resort_min_literals_int", "LAST-RESORT-MIN-LITERALS-INT", 1, 0, false);
    declareFunction(myName, "last_resort_min_literals_min", "LAST-RESORT-MIN-LITERALS-MIN", 1, 0, false);
    declareFunction(myName, "constant_median", "CONSTANT-MEDIAN", 1, 0, false);
    declareFunction(myName, "ugly_thing_L", "UGLY-THING-<", 2, 0, false);
    declareFunction(myName, "ugly_thing_G", "UGLY-THING->", 2, 0, false);
    declareFunction(myName, "last_resort_min_literals_max", "LAST-RESORT-MIN-LITERALS-MAX", 1, 0, false);
    declareFunction(myName, "last_resort_min_literals_fn", "LAST-RESORT-MIN-LITERALS-FN", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_czer_main_file() {
    $canonicalize_clause_sentence_terms_sense_lambda$ = defparameter("*CANONICALIZE-CLAUSE-SENTENCE-TERMS-SENSE-LAMBDA*", NIL);
    $never_commutative_predicates$ = defparameter("*NEVER-COMMUTATIVE-PREDICATES*", $list42);
    $tou_skolem_blist$ = defparameter("*TOU-SKOLEM-BLIST*", $kw58$UNINITIALIZED);
    $var_is_scoped_in_formula_var$ = defparameter("*VAR-IS-SCOPED-IN-FORMULA-VAR*", $kw58$UNINITIALIZED);
    return NIL;
  }

  public static final SubLObject setup_czer_main_file() {
        utilities_macros.register_cyc_api_function($sym1$EL_TO_HL, $list2, $str3$Translate_el_expression_FORMULA_i, $list4, NIL);
    utilities_macros.register_cyc_api_function($sym5$EL_TO_HL_QUERY, $list2, $str6$Translate_el_query_FORMULA_into_i, $list4, NIL);
    utilities_macros.register_cyc_api_function($sym7$CANONICALIZE_TERM, $list8, $str9$Converts_the_EL_term_TERM_to_its_, NIL, NIL);
    memoization_state.note_memoized_function($sym10$CANONICALIZE_TERM_MEMOIZED_INT);
    memoization_state.note_memoized_function($sym22$CANONICALIZE_WF_CYCL_INT_MEMOIZED);
    memoization_state.note_memoized_function($sym23$CANONICALIZE_ASK_INT_MEMOIZED);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLSymbol $sym1$EL_TO_HL = makeSymbol("EL-TO-HL");
  public static final SubLList $list2 = list(makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str3$Translate_el_expression_FORMULA_i = makeString("Translate el expression FORMULA into its equivalent canonical hl expressions");
  public static final SubLList $list4 = list(list(makeSymbol("FORMULA"), makeSymbol("EL-FORMULA-P")));
  public static final SubLSymbol $sym5$EL_TO_HL_QUERY = makeSymbol("EL-TO-HL-QUERY");
  public static final SubLString $str6$Translate_el_query_FORMULA_into_i = makeString("Translate el query FORMULA into its equivalent hl expressions");
  public static final SubLSymbol $sym7$CANONICALIZE_TERM = makeSymbol("CANONICALIZE-TERM");
  public static final SubLList $list8 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*MT*")));
  public static final SubLString $str9$Converts_the_EL_term_TERM_to_its_ = makeString("Converts the EL term TERM to its canonical HL representation.\n   @return HL term");
  public static final SubLSymbol $sym10$CANONICALIZE_TERM_MEMOIZED_INT = makeSymbol("CANONICALIZE-TERM-MEMOIZED-INT");
  public static final SubLSymbol $kw11$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym12$FORT_P = makeSymbol("FORT-P");
  public static final SubLString $str13$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLSymbol $sym14$CANON_WFF_ = makeSymbol("CANON-WFF?");
  public static final SubLSymbol $kw15$CNF = makeKeyword("CNF");
  public static final SubLSymbol $sym16$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");
  public static final SubLObject $const17$skolem = constant_handles.reader_make_constant_shell(makeString("skolem"));
  public static final SubLObject $const18$termDependsOn = constant_handles.reader_make_constant_shell(makeString("termDependsOn"));
  public static final SubLObject $const19$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
  public static final SubLSymbol $sym20$SKOLEM_FUNCTION_P = makeSymbol("SKOLEM-FUNCTION-P");
  public static final SubLSymbol $sym21$CYCL_GENERALIZED_TENSED_LITERAL_P = makeSymbol("CYCL-GENERALIZED-TENSED-LITERAL-P");
  public static final SubLSymbol $sym22$CANONICALIZE_WF_CYCL_INT_MEMOIZED = makeSymbol("CANONICALIZE-WF-CYCL-INT-MEMOIZED");
  public static final SubLSymbol $sym23$CANONICALIZE_ASK_INT_MEMOIZED = makeSymbol("CANONICALIZE-ASK-INT-MEMOIZED");
  public static final SubLSymbol $sym24$EL_WFF_SYNTAX_ = makeSymbol("EL-WFF-SYNTAX?");
  public static final SubLSymbol $kw25$DNF = makeKeyword("DNF");
  public static final SubLString $str26$Unknown_clausal_form__s = makeString("Unknown clausal form ~s");
  public static final SubLSymbol $sym27$CANONICALIZE_CLAUSE_QUOTED_TERMS = makeSymbol("CANONICALIZE-CLAUSE-QUOTED-TERMS");
  public static final SubLSymbol $sym28$ESCAPE_QUOTE_SYNTAX_P = makeSymbol("ESCAPE-QUOTE-SYNTAX-P");
  public static final SubLSymbol $sym29$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $sym30$QUASI_QUOTE_SYNTAX_P = makeSymbol("QUASI-QUOTE-SYNTAX-P");
  public static final SubLObject $const31$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));
  public static final SubLObject $const32$EscapeQuote = constant_handles.reader_make_constant_shell(makeString("EscapeQuote"));
  public static final SubLSymbol $sym33$FAST_ESCAPE_QUOTE_TERM_P = makeSymbol("FAST-ESCAPE-QUOTE-TERM-P");
  public static final SubLSymbol $sym34$FORMULA_ARG1 = makeSymbol("FORMULA-ARG1");
  public static final SubLSymbol $sym35$CANONICALIZE_CLAUSE_SENTENCE_TERMS = makeSymbol("CANONICALIZE-CLAUSE-SENTENCE-TERMS");
  public static final SubLSymbol $kw36$NEG = makeKeyword("NEG");
  public static final SubLSymbol $sym37$CANONICALIZE_LITERAL_SENTENCE_TERMS = makeSymbol("CANONICALIZE-LITERAL-SENTENCE-TERMS");
  public static final SubLSymbol $kw38$POS = makeKeyword("POS");
  public static final SubLSymbol $sym39$EL_NEGATION_P = makeSymbol("EL-NEGATION-P");
  public static final SubLString $str40$Tried_to_canonicalize_the_formula = makeString("Tried to canonicalize the formula terms of ~A, but it did not have the syntax of an EL relation.");
  public static final SubLSymbol $sym41$CANONICALIZE_CLAUSE_COMMUTATIVE_TERMS_DESTRUCTIVE = makeSymbol("CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE");
  public static final SubLList $list42 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")));
  public static final SubLSymbol $sym43$CANONICALIZE_LITERAL_COMMUTATIVE_TERMS_DESTRUCTIVE = makeSymbol("CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE");
  public static final SubLSymbol $sym44$COMMUTATIVE_TERMS_IN_ORDER_ = makeSymbol("COMMUTATIVE-TERMS-IN-ORDER?");
  public static final SubLSymbol $kw45$HELLO_YOU_SILLY_COMPILER = makeKeyword("HELLO-YOU-SILLY-COMPILER");
  public static final SubLSymbol $kw46$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $kw47$DUMMY = makeKeyword("DUMMY");
  public static final SubLObject $const48$commutativeInArgsAndRest = constant_handles.reader_make_constant_shell(makeString("commutativeInArgsAndRest"));
  public static final SubLSymbol $kw49$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST = makeKeyword("TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST");
  public static final SubLSymbol $kw50$CYCLIC_COMMUTATIVE_IN_ARGS = makeKeyword("CYCLIC-COMMUTATIVE-IN-ARGS");
  public static final SubLSymbol $sym51$_ = makeSymbol("<");
  public static final SubLObject $const52$commutativeInArgs = constant_handles.reader_make_constant_shell(makeString("commutativeInArgs"));
  public static final SubLSymbol $sym53$GAF_FORMULA = makeSymbol("GAF-FORMULA");
  public static final SubLSymbol $sym54$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym55$ATOM = makeSymbol("ATOM");
  public static final SubLString $str56$warning__trying_to_sort_the_varia = makeString("warning: trying to sort the variables ~A and ~A~%");
  public static final SubLString $str57$warning__trying_to_string_sort_th = makeString("warning: trying to string-sort the atoms ~A and ~A~%");
  public static final SubLSymbol $kw58$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $sym59$ADD_TERM_OF_UNIT_LITS_1 = makeSymbol("ADD-TERM-OF-UNIT-LITS-1");
  public static final SubLSymbol $sym60$STR = makeSymbol("STR");
  public static final SubLSymbol $sym61$EQUAL_WRT_SVM = makeSymbol("EQUAL-WRT-SVM");
  public static final SubLObject $const62$ReifiableFunction = constant_handles.reader_make_constant_shell(makeString("ReifiableFunction"));
  public static final SubLObject $const63$CycLReifiableDenotationalTerm = constant_handles.reader_make_constant_shell(makeString("CycLReifiableDenotationalTerm"));
  public static final SubLObject $const64$EvaluatableFunction = constant_handles.reader_make_constant_shell(makeString("EvaluatableFunction"));
  public static final SubLSymbol $sym65$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
  public static final SubLString $str66$Tried_to_reify_functions_within__ = makeString("Tried to reify functions within ~A, but it was not a relation expression.");
  public static final SubLSymbol $sym67$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym68$CLAUSE_TERMS_TO_REIFY = makeSymbol("CLAUSE-TERMS-TO-REIFY");
  public static final SubLSymbol $kw69$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");
  public static final SubLSymbol $kw70$TOO_MANY_SEQUENCE_VARS_IN_SCOPE_OF_SKOLEM = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SCOPE-OF-SKOLEM");
  public static final SubLSymbol $sym71$_ = makeSymbol(">");
  public static final SubLSymbol $sym72$TERM_FUNCTIONAL_COMPLEXITY = makeSymbol("TERM-FUNCTIONAL-COMPLEXITY");
  public static final SubLSymbol $sym73$TL_FIND_OR_CREATE_NART = makeSymbol("TL-FIND-OR-CREATE-NART");
  public static final SubLSymbol $sym74$QUEUE_P = makeSymbol("QUEUE-P");
  public static final SubLObject $const75$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLList $list76 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DIRECTION"), makeKeyword("FORWARD"));
  public static final SubLString $str77$SORT_BY_ID_called_on_list_contain = makeString("SORT-BY-ID called on list containing non-forts");
  public static final SubLSymbol $sym78$FORT_TYPE_AND_ID__ = makeSymbol("FORT-TYPE-AND-ID-<");
  public static final SubLSymbol $sym79$LITERAL_QUANTIFIED_FN_TERMS = makeSymbol("LITERAL-QUANTIFIED-FN-TERMS");
  public static final SubLSymbol $sym80$NO_FREE_VARIABLES_ = makeSymbol("NO-FREE-VARIABLES?");
  public static final SubLSymbol $sym81$LITERAL_TERMS_TO_REIFY = makeSymbol("LITERAL-TERMS-TO-REIFY");
  public static final SubLObject $const82$evaluate = constant_handles.reader_make_constant_shell(makeString("evaluate"));
  public static final SubLObject $const83$ExpandSubLFn = constant_handles.reader_make_constant_shell(makeString("ExpandSubLFn"));
  public static final SubLObject $const84$SubLQuoteFn = constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn"));
  public static final SubLSymbol $sym85$CANONICALIZE_CLAUSE_TOU_TERMS = makeSymbol("CANONICALIZE-CLAUSE-TOU-TERMS");
  public static final SubLList $list86 = list(makeSymbol("TERM"), makeSymbol("NAT"));
  public static final SubLSymbol $sym87$CAR = makeSymbol("CAR");
  public static final SubLList $list88 = cons(makeSymbol("OLD-VAR"), makeSymbol("NEW-VAR"));
  public static final SubLSymbol $sym89$VAR_IS_SCOPED_IN_FORMULA_ = makeSymbol("VAR-IS-SCOPED-IN-FORMULA?");
  public static final SubLSymbol $sym90$CLAUSES_IN_ORDER_ = makeSymbol("CLAUSES-IN-ORDER?");
  public static final SubLSymbol $sym91$SORT_CLAUSE_LITERALS = makeSymbol("SORT-CLAUSE-LITERALS");
  public static final SubLSymbol $sym92$NEGATE_ATOMIC = makeSymbol("NEGATE-ATOMIC");
  public static final SubLString $str93$most_constrained_literals_succeed = makeString("most-constrained-literals succeeded!");
  public static final SubLString $str94$fewest_arg_literals_succeeded_ = makeString("fewest-arg-literals succeeded!");
  public static final SubLString $str95$left_weighted_literals_succeeded_ = makeString("left-weighted-literals succeeded!");
  public static final SubLString $str96$left_connected_literals_succeeded = makeString("left-connected-literals succeeded!");
  public static final SubLString $str97$left_rooted_literals_succeeded_ = makeString("left-rooted-literals succeeded!");
  public static final SubLString $str98$least_complex_literals_succeeded_ = makeString("least-complex-literals succeeded!");
  public static final SubLString $str99$penultimate_resort_literals_1_suc = makeString("penultimate-resort-literals-1 succeeded!");
  public static final SubLString $str100$penultimate_resort_literals_2_suc = makeString("penultimate-resort-literals-2 succeeded!");
  public static final SubLFloat $float101$0_1 = makeDouble(0.1);
  public static final SubLSymbol $sym102$LIT__ = makeSymbol("LIT-<");
  public static final SubLString $str103$Got_a_fort_that_was_neither_a_nar = makeString("Got a fort that was neither a nart nor a constant.  It was one of these: ~a or ~a");
  public static final SubLString $str104$_s_is_not_an_element_of__s = makeString("~s is not an element of ~s");
  public static final SubLSymbol $sym105$CDR = makeSymbol("CDR");
  public static final SubLInteger $int106$1000 = makeInteger(1000);
  public static final SubLInteger $int107$100 = makeInteger(100);
  public static final SubLFloat $float108$0_9 = makeDouble(0.9);
  public static final SubLInteger $int109$10000 = makeInteger(10000);
  public static final SubLSymbol $sym110$RENAME_CLAUSE_VARS_INT = makeSymbol("RENAME-CLAUSE-VARS-INT");
  public static final SubLSymbol $sym111$CANON_VAR_ = makeSymbol("CANON-VAR?");
  public static final SubLSymbol $sym112$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLString $str113$_s_treated_as_variable_in_rename_ = makeString("~s treated as variable in rename-clause-vars");
  public static final SubLSymbol $sym114$INITIALIZE_SUFFIX_TABLE_FOR_VAR = makeSymbol("INITIALIZE-SUFFIX-TABLE-FOR-VAR");
  public static final SubLSymbol $sym115$NOT_DIGIT_CHAR_P = makeSymbol("NOT-DIGIT-CHAR-P");
  public static final SubLSymbol $sym116$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $sym117$MIN = makeSymbol("MIN");
  public static final SubLSymbol $sym118$LIST_STRUCTURE = makeSymbol("LIST-STRUCTURE");
  public static final SubLSymbol $sym119$FALSE = makeSymbol("FALSE");
  public static final SubLSymbol $sym120$CONSTANT_EXTERNAL_ID__ = makeSymbol("CONSTANT-EXTERNAL-ID-<");
  public static final SubLSymbol $sym121$CONSTANT_P = makeSymbol("CONSTANT-P");

  //// Initializers

  public void declareFunctions() {
    declare_czer_main_file();
  }

  public void initializeVariables() {
    init_czer_main_file();
  }

  public void runTopLevelForms() {
    setup_czer_main_file();
  }

}
