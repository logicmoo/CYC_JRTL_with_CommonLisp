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


import com.cyc.cycjava_1.cycl.inference.harness.abnormal;
import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.arg_type;
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.inference.harness.balancing_tactician;
import com.cyc.cycjava_1.cycl.bindings;
import com.cyc.cycjava_1.cycl.clause_utilities;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.hl_supports;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.id_index;
import com.cyc.cycjava_1.cycl.inference.harness.inference_abduction_utilities;
import com.cyc.cycjava_1.cycl.inference.harness.inference_czer;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
import com.cyc.cycjava_1.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava_1.cycl.inference.harness.inference_min_transformation_depth;
import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_utilities;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_rewrite;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_union;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
import com.cyc.cycjava_1.cycl.queues;
import com.cyc.cycjava_1.cycl.inference.harness.removal_tactician;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.set_contents;
import com.cyc.cycjava_1.cycl.set_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.inference.modules.transformation_modules;
import com.cyc.cycjava_1.cycl.unification;
import com.cyc.cycjava_1.cycl.variables;

public  final class inference_worker extends SubLTranslatedFile {

  //// Constructor

  private inference_worker() {}
  public static final SubLFile me = new inference_worker();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_worker";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 1783) 
  public static SubLSymbol $currently_executing_tactic$ = null;

  /** Return nil or tactic-p; the current tactic under execution, or NIL if none. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 1926) 
  public static final SubLObject currently_executing_tactic() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $currently_executing_tactic$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2519) 
  public static SubLSymbol $currently_active_problem$ = null;

  /** @return nil or problem-p; the problem of the current tactic under execution,
or the problem whose tactics are being determined, or NIL if none. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2578) 
  public static final SubLObject currently_active_problem() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tactic = currently_executing_tactic();
        if ((NIL != tactic)) {
          return inference_datastructures_tactic.tactic_problem(tactic);
        } else {
          return $currently_active_problem$.getDynamicValue(thread);
        }
      }
    }
  }

  /** @return nil or problem-store-p; the problem-store of the 
   currently active problem, or NIL if none. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 3815) 
  public static final SubLObject currently_active_problem_store() {
    {
      SubLObject problem = currently_active_problem();
      if ((NIL != problem)) {
        return inference_datastructures_problem.problem_store(problem);
      }
    }
    return NIL;
  }

  /** Determines the tactics for PROBLEM, adds them to
PROBLEM, and sets the status of PROBLEM to :possible. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 4401) 
  public static final SubLObject determine_new_tactics(SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(problem, $sym9$PROBLEM_P);
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem))) {
          Errors.error($str10$_a_was_not_an__unexamined_problem, problem);
        }
      }
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL != inference_datastructures_problem.problem_tactics(problem))) {
          Errors.error($str11$_a_was__unexamined_but_somehow_go, problem);
        }
      }
      {
        SubLObject _prev_bind_0 = $currently_active_problem$.currentBinding(thread);
        SubLObject _prev_bind_1 = $currently_executing_tactic$.currentBinding(thread);
        try {
          $currently_active_problem$.bind(problem, thread);
          $currently_executing_tactic$.bind(NIL, thread);
          if ((NIL != inference_datastructures_problem.single_clause_problem_p(problem))) {
            {
              SubLObject clause = inference_datastructures_problem.problem_sole_clause(problem);
              determine_new_tactics_for_dnf_clause(problem, clause);
            }
          } else {
            {
              SubLObject query = inference_datastructures_problem.problem_query(problem);
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35213");
            }
          }
          note_problem_examined(problem);
          discard_all_impossible_possible_tactics(problem);
          consider_that_problem_could_be_no_good(problem, NIL, $kw12$TACTICAL, T);
          {
            SubLObject prob = problem;
            SubLObject store = inference_datastructures_problem.problem_store(prob);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
              {
                SubLObject idx_1 = idx;
                if ((NIL == id_index.id_index_old_objects_empty_p(idx_1, $kw13$SKIP))) {
                  {
                    SubLObject vector_var = id_index.id_index_old_objects(idx_1);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = Sequences.length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                      {
                        SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                        SubLObject inference = Vectors.aref(vector_var, id);
                        if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                               && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                          if ((NIL != id_index.id_index_tombstone_p(inference))) {
                            inference = $kw13$SKIP;
                          }
                          if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                            {
                              SubLObject inference_var = inference;
                              SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                              SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                              SubLObject state = NIL;
                              for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                  SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                  if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                    consider_that_problem_could_be_no_good(problem, NIL, strategy, T);
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
              {
                SubLObject idx_2 = idx;
                if ((NIL == id_index.id_index_new_objects_empty_p(idx_2))) {
                  {
                    SubLObject cdohash_table = id_index.id_index_new_objects(idx_2);
                    SubLObject id = NIL;
                    SubLObject inference = NIL;
                    {
                      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                      try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                          final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                          id = Hashtables.getEntryKey(cdohash_entry);
                          inference = Hashtables.getEntryValue(cdohash_entry);
                          if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                            {
                              SubLObject inference_var = inference;
                              SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                              SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                              SubLObject state = NIL;
                              for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                  SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                  if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                    consider_that_problem_could_be_no_good(problem, NIL, strategy, T);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                      }
                    }
                  }
                }
              }
            }
          }
        } finally {
          $currently_executing_tactic$.rebind(_prev_bind_1, thread);
          $currently_active_problem$.rebind(_prev_bind_0, thread);
        }
      }
      return problem;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 5815) 
  public static final SubLObject determine_new_tactics_for_dnf_clause(SubLObject problem, SubLObject dnf_clause) {
    if ((NIL != clause_utilities.pos_atomic_clause_p(dnf_clause))) {
      return determine_new_tactics_for_literal(problem, clause_utilities.atomic_clause_asent(dnf_clause), $kw14$POS);
    } else if ((NIL != clause_utilities.neg_atomic_clause_p(dnf_clause))) {
      return determine_new_tactics_for_literal(problem, clause_utilities.atomic_clause_asent(dnf_clause), $kw15$NEG);
    } else {
      return determine_new_tactics_for_multiple_literals(problem, dnf_clause);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 6399) 
  public static final SubLObject determine_new_tactics_for_multiple_literals(SubLObject problem, SubLObject dnf_clause) {
    inference_worker_removal.determine_new_conjunctive_removal_tactics(problem, dnf_clause);
    if ((NIL != inference_worker_split.all_literals_connected_by_shared_varsP(dnf_clause))) {
      return determine_new_connected_conjunction_tactics(problem, dnf_clause);
    } else {
      if ((NIL != inference_worker_split.meta_split_tactics_enabledP())) {
        return inference_worker_split.determine_new_meta_split_tactics(problem, dnf_clause);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36478");
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 6893) 
  public static final SubLObject determine_new_connected_conjunction_tactics(SubLObject problem, SubLObject dnf_clause) {
    inference_worker_join_ordered.determine_new_join_ordered_tactics(problem, dnf_clause);
    inference_worker_join.determine_new_join_tactics(problem, dnf_clause);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 7149) 
  public static final SubLObject determine_new_tactics_for_literal(SubLObject problem, SubLObject contextualized_asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = contextualized_asent;
        SubLObject current = datum;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        asent = current.first();
        current = current.rest();
        if ((NIL == current)) {
          if ((NIL != hlmt.hlmt_p(mt))) {
            {
              SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
              {
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  inference_worker_removal.determine_new_literal_removal_tactics(problem, asent, sense);
                  if ((NIL != inference_datastructures_problem_store.problem_store_rewrite_allowedP(inference_datastructures_problem.problem_store(problem)))) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32957");
                  }
                  if ((NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem.problem_store(problem)))) {
                    inference_worker_transformation.add_tactic_to_determine_new_literal_transformation_tactics(problem, asent, sense, mt);
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 7859) 
  public static final SubLObject possibly_compute_strategic_properties_of_problem_tactics(SubLObject problem, SubLObject strategy) {
    checkType(strategy, $sym17$STRATEGY_P);
    if ((NIL != inference_datastructures_strategy.strategically_unexamined_problem_p(problem, strategy))) {
      strategy_compute_strategic_properties_of_problem_tactics(strategy, problem);
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 8337) 
  public static final SubLObject strategy_compute_strategic_properties_of_problem_tactics(SubLObject strategy, SubLObject problem) {
    return compute_strategic_properties_of_problem_tactics(problem, strategy, $kw18$NON_DISCARDED);
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 8602) 
  public static final SubLObject compute_strategic_properties_of_problem_tactics(SubLObject problem, SubLObject strategy, SubLObject status) {
    if ((status == UNPROVIDED)) {
      status = NIL;
    }
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        if ((NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, status))) {
          possibly_compute_strategic_properties_of_tactic(tactic, strategy);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 8843) 
  public static final SubLObject possibly_compute_strategic_properties_of_tactic(SubLObject tactic, SubLObject strategy) {
    if ((NIL == strategy_chooses_not_to_examine_tacticP(strategy, tactic))) {
      inference_tactician.strategy_note_new_tactic(strategy, tactic);
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 9056) 
  public static final SubLObject strategy_chooses_not_to_examine_tacticP(SubLObject strategy, SubLObject tactic) {
    return makeBoolean(((NIL == inference_tactician_strategic_uninterestingness.strategy_admits_tactic_wrt_proof_specP(strategy, tactic))
          || (NIL == inference_tactician_strategic_uninterestingness.strategy_allows_use_of_tactic_hl_moduleP(strategy, tactic))));
  }

  /** Depending on what type of tactic TACTIC is,
  compute its strategic properties wrt STRATEGY.
  @return booleanp; whether to note that the tactic is strategically possible */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 9402) 
  public static final SubLObject default_compute_strategic_properties_of_tactic(SubLObject strategy, SubLObject tactic) {
    if ((NIL != inference_worker_split.split_tactic_p(tactic))) {
      {
        SubLObject supporting_problem = inference_worker_split.find_split_tactic_supporting_problem(tactic);
        return inference_worker_split.compute_strategic_properties_of_split_tactic(tactic, supporting_problem, strategy);
      }
    } else if ((NIL != inference_worker_split.meta_split_tactic_p(tactic))) {
      return inference_worker_split.compute_strategic_properties_of_meta_split_tactic(tactic, strategy);
    } else if ((NIL != inference_worker_union.union_tactic_p(tactic))) {
      {
        SubLObject disjunct_index = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33019");
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33005");
      }
    } else if ((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic))) {
      return inference_worker_join_ordered.compute_strategic_properties_of_join_ordered_tactic(tactic, strategy);
    } else if ((NIL != inference_worker_join.join_tactic_p(tactic))) {
      return inference_worker_join.compute_strategic_properties_of_join_tactic(tactic, strategy);
    } else if ((NIL != inference_worker_transformation.transformation_tactic_p(tactic))) {
      return inference_worker_transformation.compute_strategic_properties_of_transformation_tactic(tactic, strategy);
    } else if ((NIL != inference_worker_transformation.meta_transformation_tactic_p(tactic))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36428");
    } else if ((NIL != inference_worker_removal.removal_tactic_p(tactic))) {
      return inference_worker_removal.compute_strategic_properties_of_removal_tactic(tactic, strategy);
    } else if ((NIL != inference_worker_removal.meta_removal_tactic_p(tactic))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36109");
    } else if ((NIL != inference_worker_rewrite.rewrite_tactic_p(tactic))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32956");
    } else if ((NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic))) {
      return Errors.handleMissingMethodError("inference_worker_removal.compute_strategic_properties_of_conjunctive_removal_tactic(tactic, strategy);");
    } else {
      Errors.error($str19$unexpected_tactic__S, tactic);
    }
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 11165) 
  public static final SubLObject execute_tactic(SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((tactic == currently_executing_tactic())) {
          Errors.error($str20$Tried_to_recursively_execute__a, tactic);
        }
      }
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == inference_datastructures_tactic.tactic_possibleP(tactic))) {
          Errors.error($str21$Tried_to_execute_a_tactic_that_wa, tactic);
        }
      }
      {
        SubLObject _prev_bind_0 = $currently_executing_tactic$.currentBinding(thread);
        try {
          $currently_executing_tactic$.bind(tactic, thread);
          inference_datastructures_tactic.note_tactic_most_recent_executed(tactic);
          if ((NIL != single_literal_tactic_p(tactic))) {
            execute_literal_level_tactic(tactic);
          } else if ((NIL != generalized_conjunctive_tactic_p(tactic))) {
            execute_multiple_literal_tactic(tactic);
          } else if ((NIL != disjunctive_tactic_p(tactic))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35226");
          } else {
            Errors.error($str22$unexpected_tactic__s, tactic);
          }
          possibly_note_tactic_finished(tactic);
        } finally {
          $currently_executing_tactic$.rebind(_prev_bind_0, thread);
        }
      }
      return tactic;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 12103) 
  public static final SubLObject possibly_note_tactic_finished(SubLObject tactic) {
    if ((NIL != inference_datastructures_tactic.tactic_in_progressP(tactic))) {
      return NIL;
    } else if ((NIL != inference_datastructures_tactic.tactic_executedP(tactic))) {
      return NIL;
    } else {
      note_tactic_finished(tactic);
      return T;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 12429) 
  public static SubLSymbol $asent_of_currently_executing_tactic$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 12524) 
  public static SubLSymbol $mt_of_currently_executing_tactic$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 13137) 
  public static final SubLObject single_literal_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL != inference_worker_removal.literal_level_removal_tactic_p(tactic))
          || (NIL != inference_worker_removal.literal_level_meta_removal_tactic_p(tactic))
          || (NIL != inference_worker_transformation.literal_level_transformation_tactic_p(tactic))
          || (NIL != inference_worker_rewrite.literal_level_rewrite_tactic_p(tactic))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 13391) 
  public static final SubLObject execute_literal_level_tactic(SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject query = inference_datastructures_problem.problem_query(problem);
        thread.resetMultipleValues();
        {
          SubLObject mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(query);
          SubLObject asent = thread.secondMultipleValue();
          SubLObject sense = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject _prev_bind_0 = $asent_of_currently_executing_tactic$.currentBinding(thread);
            SubLObject _prev_bind_1 = $mt_of_currently_executing_tactic$.currentBinding(thread);
            try {
              $asent_of_currently_executing_tactic$.bind(asent, thread);
              $mt_of_currently_executing_tactic$.bind(mt, thread);
              if ((NIL != inference_worker_removal.literal_level_removal_tactic_p(tactic))) {
                inference_worker_removal.execute_literal_level_removal_tactic(tactic, mt, asent, sense);
              } else if ((NIL != inference_worker_removal.literal_level_meta_removal_tactic_p(tactic))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36226");
              } else if ((NIL != inference_worker_transformation.literal_level_transformation_tactic_p(tactic))) {
                inference_worker_transformation.execute_literal_level_transformation_tactic(tactic, mt, asent, sense);
              } else if ((NIL != inference_worker_rewrite.literal_level_rewrite_tactic_p(tactic))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32958");
              } else {
                Errors.error($str26$Got_a_literal_level_tactic__s_tha, tactic);
              }
            } finally {
              $mt_of_currently_executing_tactic$.rebind(_prev_bind_1, thread);
              $asent_of_currently_executing_tactic$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return tactic;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14291) 
  public static final SubLObject literal_level_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL == conjunctive_tactic_p(tactic))
           && (NIL == disjunctive_tactic_p(tactic))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14692) 
  public static final SubLObject execute_multiple_literal_tactic(SubLObject tactic) {
    if ((NIL != structural_tactic_p(tactic))) {
      return execute_structural_multiple_literal_tactic(tactic);
    } else if ((NIL != meta_structural_tactic_p(tactic))) {
      return execute_meta_structural_multiple_literal_tactic(tactic);
    } else if ((NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36225");
    } else {
      Errors.error($str28$Unexpected_multiple_literal_tacti, inference_datastructures_tactic.tactic_hl_module(tactic));
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 15192) 
  public static final SubLObject execute_structural_multiple_literal_tactic(SubLObject tactic) {
    if ((NIL != inference_worker_split.split_tactic_p(tactic))) {
      return inference_worker_split.execute_split_tactic(tactic);
    } else if ((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic))) {
      return inference_worker_join_ordered.execute_join_ordered_tactic(tactic);
    } else if ((NIL != inference_worker_join.join_tactic_p(tactic))) {
      return inference_worker_join.execute_join_tactic(tactic);
    } else {
      Errors.error($str29$Unexpected_structural_multiple_li, inference_datastructures_tactic.tactic_hl_module(tactic));
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 15614) 
  public static final SubLObject execute_meta_structural_multiple_literal_tactic(SubLObject tactic) {
    if ((NIL != inference_worker_split.meta_split_tactic_p(tactic))) {
      return inference_datastructures_tactic.tactic_in_progress_next(tactic);
    } else {
      Errors.error($str30$Unexpected_meta_structural_multip, inference_datastructures_tactic.tactic_hl_module(tactic));
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 15942) 
  public static final SubLObject connected_conjunction_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_worker_join_ordered.join_ordered_link_p(object))
          || (NIL != inference_worker_join.join_link_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 16085) 
  public static final SubLObject connected_conjunction_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != inference_worker_join_ordered.join_ordered_tactic_p(object))
          || (NIL != inference_worker_join.join_tactic_p(object))));
  }

  /** @return connected-conjunction-tactic-p */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 16218) 
  public static final SubLObject connected_conjunction_link_tactic(SubLObject link) {
    if ((NIL != inference_worker_join_ordered.join_ordered_link_p(link))) {
      return inference_worker_join_ordered.join_ordered_link_tactic(link);
    } else if ((NIL != inference_worker_join.join_link_p(link))) {
      return inference_worker_join.join_link_tactic(link);
    } else {
      return Errors.error($str31$unexpected_connected_conjunction_, link);
    }
  }

  /** @return connected-conjunction-tactic-p */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 16529) 
  public static final SubLObject connected_conjunction_tactic_link(SubLObject tactic) {
    if ((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic))) {
      return inference_worker_join_ordered.join_ordered_tactic_link(tactic);
    } else if ((NIL != inference_worker_join.join_tactic_p(tactic))) {
      return inference_worker_join.join_tactic_link(tactic);
    } else {
      return Errors.error($str32$unexpected_connected_conjunction_, tactic);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 16858) 
  public static final SubLObject conjunctive_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_worker_split.split_link_p(object))
          || (NIL != connected_conjunction_link_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 16986) 
  public static final SubLObject logical_conjunctive_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != inference_worker_split.split_tactic_p(object))
          || (NIL != connected_conjunction_tactic_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17127) 
  public static final SubLObject conjunctive_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != logical_conjunctive_tactic_p(object))
          || (NIL != inference_worker_removal.conjunctive_removal_tactic_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17272) 
  public static final SubLObject meta_conjunctive_tactic_p(SubLObject object) {
    return inference_worker_split.meta_split_tactic_p(object);
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17376) 
  public static final SubLObject generalized_conjunctive_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != conjunctive_tactic_p(object))
          || (NIL != meta_conjunctive_tactic_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17522) 
  public static final SubLObject connected_conjunction_tactic_literal_count(SubLObject conjunctive_tactic) {
    if ((NIL != inference_worker_join_ordered.join_ordered_tactic_p(conjunctive_tactic))) {
      return clause_utilities.clause_literal_count(inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(conjunctive_tactic));
    } else {
      return ONE_INTEGER;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17877) 
  public static final SubLObject disjunctive_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_worker_union.union_link_p(object))
          || (NIL != inference_worker_union.disjunctive_assumption_link_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18021) 
  public static final SubLObject logical_disjunctive_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != inference_worker_union.union_tactic_p(object))
          || (NIL != inference_worker_union.disjunctive_assumption_tactic_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18163) 
  public static final SubLObject disjunctive_tactic_p(SubLObject object) {
    return logical_disjunctive_tactic_p(object);
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18530) 
  public static final SubLObject logical_link_p(SubLObject object) {
    return makeBoolean(((NIL != conjunctive_link_p(object))
          || (NIL != disjunctive_link_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18661) 
  public static final SubLObject logical_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != logical_conjunctive_tactic_p(object))
          || (NIL != logical_disjunctive_tactic_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18938) 
  public static final SubLObject logical_tactic_with_unique_lookahead_problem_p(SubLObject tactic) {
    return makeBoolean(((NIL != logical_tactic_p(tactic))
           && (NIL == inference_worker_join.join_tactic_p(tactic))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 19091) 
  public static final SubLObject logical_link_unique_tactic(SubLObject link) {
    if ((NIL != inference_worker_join_ordered.join_ordered_link_p(link))) {
      return inference_worker_join_ordered.join_ordered_link_tactic(link);
    } else if ((NIL != inference_worker_join.join_link_p(link))) {
      return inference_worker_join.join_link_tactic(link);
    } else if ((NIL != inference_worker_union.union_link_p(link))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33017");
    } else {
      return Errors.error($str34$_s_was_not_a_logical_link_with_un, link);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 19416) 
  public static final SubLObject logical_tactic_link(SubLObject logical_tactic) {
    {
      SubLObject pcase_var = inference_datastructures_tactic.tactic_hl_module_name(logical_tactic);
      if (pcase_var.eql($kw35$SPLIT)) {
        return inference_worker_split.split_tactic_link(logical_tactic);
      } else if (pcase_var.eql($kw36$JOIN_ORDERED)) {
        return inference_worker_join_ordered.join_ordered_tactic_link(logical_tactic);
      } else if (pcase_var.eql($kw37$UNION)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33022");
      } else if (pcase_var.eql($kw38$JOIN)) {
        return inference_worker_join.join_tactic_link(logical_tactic);
      } else {
        return Errors.error($str39$Unexpected_logical_tactic_module_, inference_datastructures_tactic.tactic_hl_module(logical_tactic));
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 19949) 
  public static final SubLObject logical_tactic_lookahead_problem(SubLObject logical_tactic) {
    {
      SubLObject pcase_var = inference_datastructures_tactic.tactic_hl_module_name(logical_tactic);
      if (pcase_var.eql($kw35$SPLIT)) {
        return inference_worker_split.split_tactic_lookahead_problem(logical_tactic);
      } else if (pcase_var.eql($kw36$JOIN_ORDERED)) {
        return inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(logical_tactic);
      } else if (pcase_var.eql($kw37$UNION)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33024");
      } else if (pcase_var.eql($kw38$JOIN)) {
        return Errors.error($str40$Join_tactics_like__S_do_not_have_, logical_tactic);
      } else {
        return Errors.error($str39$Unexpected_logical_tactic_module_, inference_datastructures_tactic.tactic_hl_module(logical_tactic));
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 20892) 
  public static final SubLObject structural_tactic_p(SubLObject tactic) {
    return logical_tactic_p(tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21094) 
  public static final SubLObject meta_structural_tactic_p(SubLObject tactic) {
    return meta_conjunctive_tactic_p(tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21203) 
  public static final SubLObject generalized_structural_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL != structural_tactic_p(tactic))
          || (NIL != meta_structural_tactic_p(tactic))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21610) 
  public static final SubLObject structural_proof_type(SubLObject structural_proof) {
    checkType(structural_proof, $sym41$STRUCTURAL_PROOF_P);
    return inference_datastructures_problem_link.problem_link_type(inference_datastructures_proof.proof_link(structural_proof));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21780) 
  public static final SubLObject content_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_worker_removal.removal_link_p(object))
          || (NIL != inference_worker_transformation.transformation_link_p(object))
          || (NIL != inference_worker_residual_transformation.residual_transformation_link_p(object))
          || (NIL != inference_worker_rewrite.rewrite_link_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21984) 
  public static final SubLObject content_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != inference_worker_removal.generalized_removal_tactic_p(object))
          || (NIL != inference_worker_transformation.transformation_tactic_p(object))
          || (NIL != inference_worker_rewrite.rewrite_tactic_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 22196) 
  public static final SubLObject content_proof_p(SubLObject proof) {
    return makeBoolean(((NIL != inference_datastructures_proof.proof_p(proof))
           && (NIL != content_link_p(inference_datastructures_proof.proof_link(proof)))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 22313) 
  public static final SubLObject content_link_supports(SubLObject content_link) {
    if ((NIL != inference_worker_removal.removal_link_p(content_link))) {
      return inference_worker_removal.removal_link_supports(content_link);
    } else if ((NIL != inference_worker_transformation.transformation_link_p(content_link))) {
      return inference_worker_transformation.transformation_link_supports(content_link);
    } else if ((NIL != inference_worker_residual_transformation.residual_transformation_link_p(content_link))) {
      return inference_worker_transformation.transformation_link_supports(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35073"));
    } else if ((NIL != inference_worker_rewrite.rewrite_link_p(content_link))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32967");
    } else {
      Errors.error($str42$_a_is_not_a_CONTENT_LINK_P, content_link);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 23486) 
  public static final SubLObject content_link_hl_module(SubLObject content_link) {
    if ((NIL != inference_worker_removal.removal_link_p(content_link))) {
      return inference_worker_removal.removal_link_hl_module(content_link);
    } else if ((NIL != inference_worker_transformation.transformation_link_p(content_link))) {
      return inference_worker_transformation.transformation_link_hl_module(content_link);
    } else if ((NIL != inference_worker_residual_transformation.residual_transformation_link_p(content_link))) {
      return inference_worker_transformation.transformation_link_hl_module(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35075"));
    } else if ((NIL != inference_worker_rewrite.rewrite_link_p(content_link))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32964");
    } else {
      Errors.error($str42$_a_is_not_a_CONTENT_LINK_P, content_link);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24085) 
  public static final SubLObject content_proof_hl_module(SubLObject proof) {
    {
      SubLObject link = inference_datastructures_proof.proof_link(proof);
      SubLObject hl_module = content_link_hl_module(link);
      return hl_module;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 39406) 
  public static final SubLObject logical_tactic_generalized_removal_completeness(SubLObject logical_tactic, SubLObject strategic_context) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_worker_join.join_tactic_p(logical_tactic))) {
        thread.resetMultipleValues();
        {
          SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
          SubLObject second_problem = thread.secondMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject first_completeness = problem_generalized_removal_completeness(first_problem, strategic_context);
            SubLObject second_completeness = problem_generalized_removal_completeness(second_problem, strategic_context);
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36504");
          }
        }
      } else {
        return problem_generalized_removal_completeness(logical_tactic_lookahead_problem(logical_tactic), strategic_context);
      }
    }
  }

  /** Returns the maximal completeness of PROBLEM's generalized removal tactics (wrt STRATEGIC-CONTEXT if provided),
   even the discarded ones. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 40058) 
  public static final SubLObject problem_generalized_removal_completeness(SubLObject problem, SubLObject strategic_context) {
    checkType(strategic_context, $sym55$STRATEGIC_CONTEXT_P);
    determine_strategic_status_wrt(problem, strategic_context);
    {
      SubLObject max_completeness = $kw67$IMPOSSIBLE;
      SubLObject max_possible_completeness_foundP = NIL;
      SubLObject rest = NIL;
      for (rest = inference_datastructures_problem.problem_tactics(problem); (!(((NIL != max_possible_completeness_foundP)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject tactic = rest.first();
          if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $kw58$GENERALIZED_REMOVAL))) {
            if ((!(((NIL != inference_datastructures_strategy.strategy_p(strategic_context))
                   && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategic_context, tactic)))))) {
              {
                SubLObject tactic_completeness = inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context);
                if ((NIL != inference_datastructures_enumerated_types.completeness_G(tactic_completeness, max_completeness))) {
                  max_completeness = tactic_completeness;
                  if ((max_completeness == $kw56$COMPLETE)) {
                    max_possible_completeness_foundP = T;
                  }
                }
              }
            }
          }
        }
      }
      if ((($kw56$COMPLETE != max_completeness)
           && (NIL != strategic_context)
           && (NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, strategic_context)))) {
        max_completeness = $kw56$COMPLETE;
      }
      return max_completeness;
    }
  }

  /** Discards all conjunctive tactics on TACTIC's problem, other than TACTIC.  This is used when
the conjunctive tactic TACTIC is known to be complete and has been selected by
the strategy, so we can discard all others because they will be subsumed by TACTIC. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 42929) 
  public static final SubLObject discard_all_other_possible_structural_conjunctive_tactics(SubLObject tactic) {
    if ((NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic)))) {
      {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        discard_possible_tactics_int(problem, NIL, NIL, $kw68$STRUCTURAL_CONJUNCTIVE, tactic, NIL);
      }
    }
    return NIL;
  }

  /** Whether the Worker tests all newly proofs for well-formedness as soon as they are created.
This could be turned back to t or investigated further if we find that we end up taking
large cartesian products of ill-formed proofs. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 48699) 
  public static SubLSymbol $eager_proof_validationP$ = null;

  /** @return 0 nil or proof-p
returns NIL iff the proposed proof was semantically invalid wrt the intermediate-step-validation-level
@return 1 boolean; t if the returned proof was newly created, nil if it already existed
 (or was not proven due to invalidity)
@param PROOF-BINDINGS; LINK's supported problem vars -> content */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 48985) 
  public static final SubLObject propose_new_proof_with_bindings(SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject existing_proof = NIL;
        existing_proof = find_proof(link, proof_bindings, subproofs);
        if ((NIL != existing_proof)) {
          return Values.values(existing_proof, NIL);
        } else {
          {
            SubLObject new_proof = inference_datastructures_proof.new_proof_with_bindings(link, proof_bindings, subproofs);
            proof_propagate_non_explananatory_subproofs(new_proof);
            {
              SubLObject validP = makeBoolean(((NIL == $eager_proof_validationP$.getDynamicValue(thread))
                  || (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35238"))));
              if ((NIL == validP)) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35345");
              } else {
                {
                  SubLObject circularP = proof_circularP(new_proof);
                  if ((NIL != circularP)) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35344");
                  } else {
                    {
                      SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                      if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(supported_problem))) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35346");
                      } else if ((NIL != inference_abduction_utilities.reject_proof_due_to_non_abducible_ruleP(link, supported_problem, subproofs))) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35348");
                      } else if (((NIL != transformation_modules.modus_tollens_transformation_proof_p(new_proof))
                           && (NIL != Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1297")))) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35347");
                      } else {
                        consider_that_problem_could_be_good(supported_problem);
                        consider_that_subproofs_may_be_unprocessed(new_proof);
                      }
                    }
                  }
                }
              }
              return Values.values(new_proof, validP);
            }
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 51176) 
  public static final SubLObject proof_propagate_non_explananatory_subproofs(SubLObject proof) {
    checkType(proof, $sym79$PROOF_P);
    {
      SubLObject store = inference_datastructures_proof.proof_store(proof);
      SubLObject total = ZERO_INTEGER;
      if ((NIL != inference_datastructures_problem_store.problem_store_non_explanatory_subproofs_possibleP(store))) {
        if ((NIL != inference_datastructures_proof.proof_has_subproofsP(proof))) {
          {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            for (subproof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subproof = cdolist_list_var.first()) {
              {
                SubLObject cdolist_list_var_9 = proof_non_explanatory_subproofs(subproof);
                SubLObject non_explanatory_subproof = NIL;
                for (non_explanatory_subproof = cdolist_list_var_9.first(); (NIL != cdolist_list_var_9); cdolist_list_var_9 = cdolist_list_var_9.rest(), non_explanatory_subproof = cdolist_list_var_9.first()) {
                  total = Numbers.add(total, ONE_INTEGER);
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35036");
                }
              }
            }
          }
          if ((NIL != inference_worker_transformation.generalized_transformation_proof_p(proof))) {
            {
              SubLObject non_explanatory_subproofs = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35194");
              SubLObject cdolist_list_var = non_explanatory_subproofs;
              SubLObject non_explanatory_subproof = NIL;
              for (non_explanatory_subproof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), non_explanatory_subproof = cdolist_list_var.first()) {
                total = Numbers.add(total, ONE_INTEGER);
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35037");
              }
            }
          }
        }
      }
      return total;
    }
  }

  /** The proof depth beyond which we give up trying to check for proof circularity. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 52068) 
  private static SubLSymbol $circular_proof_max_depth_cutoff$ = null;

  /** PROOF is circular when it contains a very similar proof to itself
as one of its subproofs.  'Very similar' means that it has the same
problem and the same proof-bindings.  Eventually we should extend
this to be having the same proven query, but currently we don't
have an efficient way to do that. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 52211) 
  public static final SubLObject proof_circularP(SubLObject proof) {
    {
      SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
      SubLObject subproof = NIL;
      for (subproof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subproof = cdolist_list_var.first()) {
        if ((NIL != proof_circular_wrtP(subproof, proof, ZERO_INTEGER))) {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 52681) 
  public static final SubLObject proof_circular_wrtP(SubLObject proof, SubLObject candidate_circular_proof, SubLObject depth) {
    if (depth.numG($circular_proof_max_depth_cutoff$.getGlobalValue())) {
      return NIL;
    }
    if ((NIL != proofs_share_problem_and_bindingsP(proof, candidate_circular_proof))) {
      return T;
    } else {
      {
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        for (subproof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subproof = cdolist_list_var.first()) {
          if ((NIL != proof_circular_wrtP(subproof, candidate_circular_proof, number_utilities.f_1X(depth)))) {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 53168) 
  public static final SubLObject proofs_share_problem_and_bindingsP(SubLObject proof1, SubLObject proof2) {
    return makeBoolean(((inference_datastructures_proof.proof_supported_problem(proof1) == inference_datastructures_proof.proof_supported_problem(proof2))
           && (NIL != proof_bindings_equalP(inference_datastructures_proof.proof_bindings(proof1), inference_datastructures_proof.proof_bindings(proof2)))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 55840) 
  public static final SubLObject possibly_note_proof_processed(SubLObject proof) {
    checkType(proof, $sym79$PROOF_P);
    {
      SubLObject store = inference_datastructures_proof.proof_store(proof);
      if ((NIL != inference_datastructures_problem_store.problem_store_allows_proof_processingP(store))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35256");
      }
    }
    return proof;
  }

  /** if an RT-link's proof is processed, note its motivating T-link's proofs as processed too, they're kind of like siblings */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 56088) 
  private static SubLSymbol $process_motivated_transformation_link_proofsP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57127) 
  public static final SubLObject consider_that_subproofs_may_be_unprocessed(SubLObject new_proof) {
    {
      SubLObject store = inference_datastructures_proof.proof_store(new_proof);
      if ((NIL != inference_datastructures_problem_store.problem_store_allows_proof_processingP(store))) {
        {
          SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(new_proof);
          SubLObject subproof = NIL;
          for (subproof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subproof = cdolist_list_var.first()) {
            if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35413"))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35023");
              consider_that_subproofs_may_be_unprocessed(subproof);
            }
          }
        }
      }
    }
    return new_proof;
  }

  /** Temporary control variable; should eventually stay T */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57878) 
  private static SubLSymbol $find_proof_bindings_optimization_enabledP$ = null;

  /** @return nil or proof-p
@param PROOF-BINDINGS; SUPPORTED-PROBLEM's vars -> content */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 58005) 
  public static final SubLObject find_proof(SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $find_proof_bindings_optimization_enabledP$.getDynamicValue(thread))) {
        {
          SubLObject inference = inference_macros.current_controlling_inference();
          if (((NIL != inference_datastructures_inference.inference_problem_store_privateP(inference))
               && (NIL != inference_datastructures_inference.inference_unique_wrt_bindingsP(inference)))) {
            if (((NIL == inference_worker_transformation.generalized_transformation_link_p(link))
                || (NIL != inference_worker_transformation.generalized_transformation_link_unaffected_by_exceptionsP(link)))) {
              {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                SubLObject candidate_proofs = inference_datastructures_problem.problem_proofs_lookup(supported_problem, proof_bindings);
                SubLObject cdolist_list_var = candidate_proofs;
                SubLObject candidate_proof = NIL;
                for (candidate_proof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate_proof = cdolist_list_var.first()) {
                  if ((NIL == inference_datastructures_proof.proof_rejectedP(candidate_proof))) {
                    return candidate_proof;
                  }
                }
              }
            }
          }
        }
      }
      if ((NIL != inference_worker_transformation.transformation_link_p(link))) {
        return NIL;
      }
      {
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject candidate_proofs = inference_datastructures_problem.problem_proofs_lookup(supported_problem, proof_bindings);
        if ((NIL != candidate_proofs)) {
          {
            SubLObject direct_supports = inference_datastructures_proof.proof_spec_direct_supports(link, subproofs);
            SubLObject cdolist_list_var = candidate_proofs;
            SubLObject proof = NIL;
            for (proof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), proof = cdolist_list_var.first()) {
              if (((NIL != conjunctive_proof_subsumes_conjunctive_proof_specP(proof, link, proof_bindings, subproofs))
                  || (NIL != residual_transformation_proof_subsumes_conjunctive_proof_specP(proof, link, proof_bindings, subproofs))
                  || (NIL != inference_datastructures_proof.proof_matches_specificationP(proof, supported_problem, proof_bindings, direct_supports)))) {
                return proof;
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 60046) 
  public static final SubLObject conjunctive_proof_subsumes_conjunctive_proof_specP(SubLObject proof, SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
    return makeBoolean(((NIL != connected_conjunction_proof_subsumes_connected_conjunction_proof_specP(proof, link, proof_bindings, subproofs))
          || (NIL != split_proof_subsumes_split_proof_specP(proof, link, proof_bindings, subproofs))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 60358) 
  public static final SubLObject connected_conjunction_proof_subsumes_connected_conjunction_proof_specP(SubLObject proof, SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
    return makeBoolean(((NIL != inference_worker_join_ordered.connected_conjunction_proof_p(proof))
           && (NIL != connected_conjunction_link_p(link))
           && (NIL != list_utilities.sets_equalP(inference_datastructures_proof.proof_direct_subproofs(proof), subproofs, Symbols.symbol_function(EQ)))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 60736) 
  public static final SubLObject split_proof_subsumes_split_proof_specP(SubLObject proof, SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
    return makeBoolean(((NIL != inference_worker_split.split_proof_p(proof))
           && (NIL != inference_worker_split.split_link_p(link))
           && (NIL != list_utilities.sets_equalP(inference_datastructures_proof.proof_direct_subproofs(proof), subproofs, Symbols.symbol_function(EQ)))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 61050) 
  public static final SubLObject residual_transformation_proof_subsumes_conjunctive_proof_specP(SubLObject proof, SubLObject link, SubLObject proof_bindings, SubLObject subproofs) {
    return makeBoolean(((NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof))
           && (NIL != conjunctive_link_p(link))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35349"))));
  }

  /** @return 0 proof-p
@return 1 whether the returned proof was newly created */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 63478) 
  public static final SubLObject new_goal_proof(SubLObject goal_link) {
    checkType(goal_link, $sym88$PROBLEM_LINK_TO_GOAL_P);
    if ((NIL != inference_worker_removal.removal_link_p(goal_link))) {
      return inference_worker_removal.new_removal_proof(goal_link);
    } else {
      return inference_worker_transformation.new_transformation_proof(goal_link, NIL, NIL);
    }
  }

  /** Returns bindings mapping local-vars -> old contents + new contents.
@param LOCAL-BINDINGS; local vars -> new contents (or other local unbound),
i.e. the bindings established in this exact proof that is being constructed.
@param SUB-BINDINGS; subproof-vars -> old contents,
i.e. the bindings established by the subproof (recursively).
@param VARIABLE-MAP; subproof-vars -> local-vars,
i.e. the mapping between the variables in the subproof and the local variables. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 64253) 
  public static final SubLObject proof_bindings_from_constituents(SubLObject local_bindings, SubLObject sub_bindings, SubLObject variable_map) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == sub_bindings)) {
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL != variable_map)) {
            Errors.error($str89$expected_a_variable_map_to_be_nul);
          }
        }
        return local_bindings;
      }
      {
        SubLObject localized_sub_bindings = bindings.transfer_variable_map_to_bindings(variable_map, sub_bindings);
        SubLObject grounded_local_bindings = bindings.apply_bindings_to_values(localized_sub_bindings, local_bindings);
        SubLObject complete_local_bindings = ConsesLow.nconc(localized_sub_bindings, grounded_local_bindings);
        complete_local_bindings = ncanonicalize_proof_bindings(complete_local_bindings);
        return complete_local_bindings;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 65481) 
  public static final SubLObject ncanonicalize_proof_bindings_int(SubLObject proof_bindings) {
    {
      SubLObject sorted_bindings = Sort.sort(proof_bindings, $sym90$VARIABLE__, $sym91$VARIABLE_BINDING_VARIABLE);
      return list_utilities.delete_duplicates_sorted(sorted_bindings, Symbols.symbol_function(EQUAL));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 65764) 
  public static final SubLObject ncanonicalize_proof_bindings(SubLObject proof_bindings) {
    if ((NIL != list_utilities.singletonP(proof_bindings))) {
      return proof_bindings;
    }
    return ncanonicalize_proof_bindings_int(proof_bindings);
  }

  /** @note result is not destructible */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 65971) 
  public static final SubLObject canonicalize_proof_bindings(SubLObject proof_bindings) {
    if ((NIL != proof_bindings_canonicalP(proof_bindings))) {
      return proof_bindings;
    }
    return ncanonicalize_proof_bindings(conses_high.copy_list(proof_bindings));
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 66358) 
  public static final SubLObject proof_bindings_canonicalP(SubLObject proof_bindings) {
    return proof_bindings_canonicalP_recursive(proof_bindings, MINUS_ONE_INTEGER);
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 66485) 
  public static final SubLObject proof_bindings_canonicalP_recursive(SubLObject proof_bindings, SubLObject last_id) {
    if ((NIL == proof_bindings)) {
      return T;
    }
    {
      SubLObject next_id = variables.variable_id(bindings.variable_binding_variable(proof_bindings.first()));
      if (next_id.numLE(last_id)) {
        return NIL;
      }
      return proof_bindings_canonicalP_recursive(proof_bindings.rest(), next_id);
    }
  }

  /** @note these are assumed to be canonical */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 66817) 
  public static final SubLObject proof_bindings_equalP(SubLObject proof_bindings1, SubLObject proof_bindings2) {
    return Equality.equal(proof_bindings1, proof_bindings2);
  }

  /** For each variable in BINDINGS which occurs twice, unify its first and second value
and append them to the result, unless they are ((T . T)) */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 66986) 
  public static final SubLObject unify_all_equal_bindings(SubLObject v_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject new_bindings = NIL;
        SubLObject duplicate_bindings = list_utilities.duplicates(v_bindings, Symbols.symbol_function(EQ), Symbols.symbol_function($sym91$VARIABLE_BINDING_VARIABLE));
        SubLObject duplicate_variables = list_utilities.fast_delete_duplicates(Mapping.mapcar(Symbols.symbol_function($sym91$VARIABLE_BINDING_VARIABLE), duplicate_bindings), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = duplicate_variables;
        SubLObject variable = NIL;
        for (variable = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), variable = cdolist_list_var.first()) {
          thread.resetMultipleValues();
          {
            SubLObject first_value = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35356");
            SubLObject second_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            {
              SubLObject value_unify_results = unification.unify(first_value, second_value, T, UNPROVIDED);
              SubLObject value_unify_justification = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if ((NIL == bindings.unification_success_token_p(value_unify_results))) {
                new_bindings = ConsesLow.append(value_unify_results, new_bindings);
              }
            }
          }
        }
        return new_bindings;
      }
    }
  }

  /** @return boolean; t iff all values in BINDINGS are fully bound */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 68968) 
  public static final SubLObject all_bindings_ground_outP(SubLObject v_bindings) {
    checkType(v_bindings, $sym95$BINDINGS_P);
    {
      SubLObject cdolist_list_var = v_bindings;
      SubLObject binding = NIL;
      for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
        if ((NIL == binding_ground_outP(binding))) {
          return NIL;
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69226) 
  public static final SubLObject binding_ground_outP(SubLObject binding) {
    {
      SubLObject value = bindings.variable_binding_value(binding);
      return variables.fully_bound_p(value);
    }
  }

  /** used as a failsafe to avoid infinite proof bubbling */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69360) 
  public static SubLSymbol $proof_bubbling_depth$ = null;

  /** the depth above which we forcibly halt recursive proof bubbling */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69489) 
  public static SubLSymbol $max_proof_bubbling_depth$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69610) 
  public static final SubLObject bubble_up_proof(SubLObject proof) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ($proof_bubbling_depth$.getDynamicValue(thread).numG($max_proof_bubbling_depth$.getGlobalValue())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35339");
      } else {
        {
          SubLObject _prev_bind_0 = $proof_bubbling_depth$.currentBinding(thread);
          try {
            $proof_bubbling_depth$.bind(number_utilities.f_1X($proof_bubbling_depth$.getDynamicValue(thread)), thread);
            {
              SubLObject supported_problem = inference_datastructures_proof.proof_supported_problem(proof);
              bubble_up_proof_from_problem(proof, supported_problem);
            }
          } finally {
            $proof_bubbling_depth$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 70088) 
  public static final SubLObject bubble_up_proof_from_problem(SubLObject proof, SubLObject problem) {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject dependent_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link))) {
            bubble_up_proof_to_link(proof, dependent_link);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 70272) 
  public static final SubLObject bubble_up_proof_to_link(SubLObject proof, SubLObject dependent_link) {
    if ((NIL != inference_datastructures_proof.proof_provenP(proof))) {
      {
        SubLObject pcase_var = inference_datastructures_problem_link.problem_link_type(dependent_link);
        if (pcase_var.eql($kw98$ANSWER)) {
          {
            SubLObject inference = inference_datastructures_problem_link.problem_link_supported_inference(dependent_link);
            propagate_proof_to_inference(proof, inference);
          }
        } else {
          {
            SubLObject problem = inference_datastructures_proof.proof_supported_problem(proof);
            SubLObject link_var = dependent_link;
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject supporting_mapped_problem = NIL;
            for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
              if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
                if ((problem == inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem))) {
                  bubble_up_proof_to_link_via_mapped_problem(proof, dependent_link, supporting_mapped_problem);
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 71453) 
  public static final SubLObject bubble_up_proof_to_link_via_mapped_problem(SubLObject proof, SubLObject dependent_link, SubLObject mapped_problem) {
    if ((NIL != link_permits_proof_propagationP(dependent_link, mapped_problem))) {
      {
        SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
        bubble_up_proof_to_link_via_variable_map(proof, variable_map, dependent_link);
      }
    }
    return NIL;
  }

  /** Just having PROOF and DEPENDENT-LINK is not enough, because if DEPENDENT-LINK has two or more
supporting problems which are both equal to the supported problem of PROOF, then we couldn't
distinguish them without VARIABLE-MAP. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 72097) 
  public static final SubLObject bubble_up_proof_to_link_via_variable_map(SubLObject proof, SubLObject variable_map, SubLObject dependent_link) {
    checkType(proof, $sym79$PROOF_P);
    checkType(variable_map, $sym99$VARIABLE_MAP_P);
    {
      SubLObject pcase_var = inference_datastructures_problem_link.problem_link_type(dependent_link);
      if (pcase_var.eql($kw51$TRANSFORMATION)) {
        inference_worker_transformation.bubble_up_proof_to_transformation_link(proof, variable_map, dependent_link);
      } else if (pcase_var.eql($kw53$REWRITE)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32954");
      } else if (pcase_var.eql($kw36$JOIN_ORDERED)) {
        inference_worker_join_ordered.bubble_up_proof_to_join_ordered_link(proof, variable_map, dependent_link);
      } else if (pcase_var.eql($kw38$JOIN)) {
        inference_worker_join.bubble_up_proof_to_join_link(proof, variable_map, dependent_link);
      } else if (pcase_var.eql($kw35$SPLIT)) {
        inference_worker_split.bubble_up_proof_to_split_link(proof, variable_map, dependent_link);
      } else if (pcase_var.eql($kw47$RESTRICTION)) {
        inference_worker_restriction.bubble_up_proof_to_restriction_link(proof, variable_map, dependent_link);
      } else if (pcase_var.eql($kw100$RESIDUAL_TRANSFORMATION)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35048");
      } else if (pcase_var.eql($kw37$UNION)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33004");
      } else if (pcase_var.eql($kw101$DISJUNCTIVE_ASSUMPTION)) {
        Errors.error($str102$can_t_handle_bubbling_up_proofs_p);
      } else if (pcase_var.eql($kw98$ANSWER)) {
        {
          SubLObject inference = inference_datastructures_problem_link.problem_link_supported_inference(dependent_link);
          propagate_proof_to_inference(proof, inference);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 73974) 
  public static final SubLObject perform_lazy_proof_rejection(SubLObject proof, SubLObject inference) {
    if ((NIL != inference_datastructures_inference.inference_allow_abnormality_checkingP(inference))) {
      reject_abnormal_subproofs(proof);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 74981) 
  private static SubLSymbol $within_abnormality_checkingP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 75161) 
  public static final SubLObject reject_abnormal_subproofs(SubLObject proof) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == inference_datastructures_proof.proof_provenP(proof))) {
        return NIL;
      }
      {
        SubLObject _prev_bind_0 = $within_abnormality_checkingP$.currentBinding(thread);
        try {
          $within_abnormality_checkingP$.bind(T, thread);
          {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = NIL;
            for (subproof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subproof = cdolist_list_var.first()) {
              reject_abnormal_subproofs(subproof);
            }
            if ((((NIL != inference_worker_transformation.transformation_proof_p(proof))
                   && (NIL != inference_worker_transformation.transformation_proof_abnormalP(proof)))
                || ((NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof))
                   && (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35098"))))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35343");
            }
            if ((NIL != ((NIL != abnormal.abnormality_except_support_enabledP()) ? ((SubLObject) inference_worker_transformation.proof_depends_on_excepted_assertionP(proof)) : NIL))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35340");
            }
          }
        } finally {
          $within_abnormality_checkingP$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 76347) 
  public static final SubLObject inference_proof_non_explanatory_subproofs(SubLObject inference, SubLObject proof) {
    {
      SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference);
      if ((NIL != inference_worker_answer.answer_link_supporting_problem_wholly_explanatoryP(answer_link))) {
        return proof_non_explanatory_subproofs(proof);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35190");
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 78172) 
  public static final SubLObject proof_non_explanatory_subproofs(SubLObject proof) {
    {
      SubLObject subproofs = NIL;
      if ((NIL != inference_datastructures_proof.proof_has_subproofsP(proof))) {
        {
          SubLObject store = inference_datastructures_proof.proof_store(proof);
          if ((NIL != inference_datastructures_problem_store.problem_store_non_explanatory_subproofs_possibleP(store))) {
            subproofs = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35028");
          }
        }
      }
      return subproofs;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 83634) 
  public static final SubLObject note_tactic_finished(SubLObject tactic) {
    {
      SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
      inference_datastructures_tactic.note_tactic_executed(tactic);
      inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(inference_datastructures_tactic.tactic_problem(tactic));
      if ((NIL != inference_datastructures_problem.problem_no_tactics_possibleP(problem))) {
        if ((NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
          note_problem_pending(problem, $kw12$TACTICAL);
        }
        consider_that_problem_could_be_finished(problem, NIL, $kw12$TACTICAL, T);
        if ((NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, $kw12$TACTICAL, UNPROVIDED))) {
          consider_that_problem_could_be_no_good(problem, NIL, $kw12$TACTICAL, T);
        }
      }
      {
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
          {
            SubLObject idx_21 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_21, $kw13$SKIP))) {
              {
                SubLObject vector_var = id_index.id_index_old_objects(idx_21);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                  {
                    SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                    SubLObject inference = Vectors.aref(vector_var, id);
                    if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                           && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw13$SKIP;
                      }
                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                        {
                          SubLObject inference_var = inference;
                          SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                          SubLObject state = NIL;
                          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                            {
                              SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                              if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                inference_tactician.strategy_note_tactic_finished(strategy, tactic);
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
          {
            SubLObject idx_22 = idx;
            if ((NIL == id_index.id_index_new_objects_empty_p(idx_22))) {
              {
                SubLObject cdohash_table = id_index.id_index_new_objects(idx_22);
                SubLObject id = NIL;
                SubLObject inference = NIL;
                {
                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                  try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                      final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                      id = Hashtables.getEntryKey(cdohash_entry);
                      inference = Hashtables.getEntryValue(cdohash_entry);
                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                        {
                          SubLObject inference_var = inference;
                          SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                          SubLObject state = NIL;
                          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                            {
                              SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                              if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                inference_tactician.strategy_note_tactic_finished(strategy, tactic);
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                  }
                }
              }
            }
          }
        }
      }
    }
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 84783) 
  public static final SubLObject consider_strategic_ramifications_of_possibly_executed_tactic(SubLObject strategy, SubLObject tactic) {
    if ((NIL != inference_datastructures_tactic.tactic_executedP(tactic))) {
      consider_strategic_ramifications_of_executed_tactic(strategy, tactic);
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 85075) 
  public static final SubLObject consider_strategic_ramifications_of_executed_tactic(SubLObject strategy, SubLObject tactic) {
    {
      SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
      if ((NIL != inference_tactician.strategy_no_possible_strategems_for_problemP(strategy, problem))) {
        possibly_note_problem_pending(problem, strategy);
        consider_that_problem_could_be_finished(problem, NIL, strategy, T);
        if ((NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategy, UNPROVIDED))) {
          consider_that_problem_could_be_no_good(problem, NIL, strategy, T);
        }
      }
    }
    return tactic;
  }

  /** Changes PROBLEM's status to :unexamined. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 85565) 
  public static final SubLObject note_problem_created(SubLObject problem) {
    change_and_propagate_problem_status(problem, $kw109$UNEXAMINED, NIL, $kw12$TACTICAL);
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 86092) 
  public static final SubLObject possibly_activate_problem(SubLObject strategy, SubLObject problem) {
    {
      SubLObject really_relevantP = inference_tactician.strategy_possibly_activate_problem(strategy, problem);
      if ((NIL != really_relevantP)) {
        inference_datastructures_strategy.strategy_note_problem_active(strategy, problem);
        {
          SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
          inference_datastructures_inference.add_inference_relevant_problem(inference, problem);
          {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
              {
                SubLObject argument_link = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, argument_link))) {
                  propagate_min_proof_depth_via_link_wrt_inference(argument_link, inference);
                  propagate_min_transformation_depth_via_link_wrt_inference(argument_link, inference);
                  inference_min_transformation_depth.propagate_min_transformation_depth_signature_via_link_wrt_inference(argument_link, inference);
                  propagate_proof_spec(argument_link);
                }
              }
            }
          }
        }
      }
      return really_relevantP;
    }
  }

  /** Push PROBLEM as far as it can go wrt STRATEGIC-CONTEXT trough the progression of strategic statuses. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 87358) 
  public static final SubLObject determine_strategic_status_wrt(SubLObject problem, SubLObject strategic_context) {
    if ((NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
      if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem))) {
        determine_new_tactics(problem);
      }
      if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
        possibly_compute_strategic_properties_of_problem_tactics(problem, strategic_context);
        possibly_note_problem_strategically_examined(problem, strategic_context);
        possibly_note_problem_strategically_possible(problem, strategic_context);
        consider_that_problem_could_be_strategically_pending_wrt(problem, strategic_context);
        return inference_datastructures_strategy.problem_strategic_status(problem, strategic_context);
      }
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 88341) 
  public static final SubLObject note_problem_examined(SubLObject problem) {
    {
      SubLObject old_status = inference_datastructures_problem.problem_status(problem);
      SubLObject new_status = examined_version_of_problem_status(old_status);
      change_and_propagate_problem_status(problem, new_status, NIL, $kw12$TACTICAL);
      {
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
          {
            SubLObject idx_23 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_23, $kw13$SKIP))) {
              {
                SubLObject vector_var = id_index.id_index_old_objects(idx_23);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                  {
                    SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                    SubLObject inference = Vectors.aref(vector_var, id);
                    if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                           && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw13$SKIP;
                      }
                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                        {
                          SubLObject inference_var = inference;
                          SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                          SubLObject state = NIL;
                          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                            {
                              SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                              if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                possibly_note_problem_strategically_examined(problem, strategy);
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
          {
            SubLObject idx_24 = idx;
            if ((NIL == id_index.id_index_new_objects_empty_p(idx_24))) {
              {
                SubLObject cdohash_table = id_index.id_index_new_objects(idx_24);
                SubLObject id = NIL;
                SubLObject inference = NIL;
                {
                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                  try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                      final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                      id = Hashtables.getEntryKey(cdohash_entry);
                      inference = Hashtables.getEntryValue(cdohash_entry);
                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                        {
                          SubLObject inference_var = inference;
                          SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                          SubLObject state = NIL;
                          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                            {
                              SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                              if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                possibly_note_problem_strategically_examined(problem, strategy);
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                  }
                }
              }
            }
          }
        }
      }
    }
    if ((NIL != inference_datastructures_problem.problem_no_tactics_possibleP(problem))) {
    } else {
      note_problem_possible(problem);
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 88890) 
  public static final SubLObject possibly_note_problem_strategically_examined(SubLObject problem, SubLObject strategy) {
    if (((NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem))
         && (NIL != inference_datastructures_strategy.strategically_unexamined_problem_p(problem, strategy)))) {
      {
        SubLObject old_strategic_status = inference_datastructures_strategy.problem_raw_strategic_status(problem, strategy);
        SubLObject new_strategic_status = examined_version_of_problem_status(old_strategic_status);
        change_and_propagate_problem_status(problem, new_strategic_status, NIL, strategy);
      }
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 89373) 
  public static final SubLObject note_problem_possible(SubLObject problem) {
    {
      SubLObject old_status = inference_datastructures_problem.problem_status(problem);
      SubLObject new_status = possible_version_of_problem_status(old_status);
      change_and_propagate_problem_status(problem, new_status, NIL, $kw12$TACTICAL);
      {
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
          {
            SubLObject idx_25 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_25, $kw13$SKIP))) {
              {
                SubLObject vector_var = id_index.id_index_old_objects(idx_25);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                  {
                    SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                    SubLObject inference = Vectors.aref(vector_var, id);
                    if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                           && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw13$SKIP;
                      }
                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                        {
                          SubLObject inference_var = inference;
                          SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                          SubLObject state = NIL;
                          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                            {
                              SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                              if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                possibly_note_problem_strategically_possible(problem, strategy);
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
          {
            SubLObject idx_26 = idx;
            if ((NIL == id_index.id_index_new_objects_empty_p(idx_26))) {
              {
                SubLObject cdohash_table = id_index.id_index_new_objects(idx_26);
                SubLObject id = NIL;
                SubLObject inference = NIL;
                {
                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                  try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                      final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                      id = Hashtables.getEntryKey(cdohash_entry);
                      inference = Hashtables.getEntryValue(cdohash_entry);
                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                        {
                          SubLObject inference_var = inference;
                          SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                          SubLObject state = NIL;
                          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                            {
                              SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                              if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                possibly_note_problem_strategically_possible(problem, strategy);
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                  }
                }
              }
            }
          }
        }
      }
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 89754) 
  public static final SubLObject possibly_note_problem_strategically_possible(SubLObject problem, SubLObject strategy) {
    if (((NIL != inference_datastructures_strategy.strategically_examined_problem_p(problem, strategy))
         && (NIL == inference_datastructures_strategy.strategically_no_good_problem_p(problem, strategy))
         && (NIL == inference_tactician.strategy_no_possible_strategems_for_problemP(strategy, problem)))) {
      note_problem_strategically_possible(problem, strategy);
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 90471) 
  public static final SubLObject note_problem_strategically_possible(SubLObject problem, SubLObject strategy) {
    {
      SubLObject old_strategic_status = inference_datastructures_strategy.problem_raw_strategic_status(problem, strategy);
      SubLObject new_strategic_status = possible_version_of_problem_status(old_strategic_status);
      change_and_propagate_problem_status(problem, new_strategic_status, NIL, strategy);
    }
    return problem;
  }

  /** Notes that PROBLEM is pending (wrt STRATEGIC-CONTEXT) unless it is already
known to be pending (wrt STRATEGIC-CONTEXT). */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 90811) 
  public static final SubLObject possibly_note_problem_pending(SubLObject problem, SubLObject strategic_context) {
    checkType(strategic_context, $sym55$STRATEGIC_CONTEXT_P);
    if ((NIL != possible_problem_p(problem, strategic_context))) {
      return note_problem_pending(problem, strategic_context);
    }
    return NIL;
  }

  /** Assumes that strategy activity is propagated first, since it uses
that as a criterion for considering no-goodness. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 91182) 
  public static final SubLObject note_problem_pending(SubLObject problem, SubLObject strategic_context) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == inference_datastructures_strategy.strategy_p(strategic_context))) {
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == inference_datastructures_problem.problem_no_tactics_possibleP(problem))) {
            Errors.error($str110$Tried_to_make__a_pending_but_it_s, problem);
          }
        }
      }
      {
        SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
        SubLObject new_status = pending_version_of_problem_status(old_status);
        change_and_propagate_problem_status(problem, new_status, NIL, strategic_context);
        consider_that_problem_could_be_no_good(problem, NIL, strategic_context, T);
        if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
          inference_datastructures_inference.inference_note_problem_pending(inference_datastructures_strategy.strategy_inference(strategic_context), problem);
        } else {
          {
            SubLObject prob = problem;
            SubLObject store = inference_datastructures_problem.problem_store(prob);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
              {
                SubLObject idx_27 = idx;
                if ((NIL == id_index.id_index_old_objects_empty_p(idx_27, $kw13$SKIP))) {
                  {
                    SubLObject vector_var = id_index.id_index_old_objects(idx_27);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = Sequences.length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                      {
                        SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                        SubLObject inference = Vectors.aref(vector_var, id);
                        if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                               && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                          if ((NIL != id_index.id_index_tombstone_p(inference))) {
                            inference = $kw13$SKIP;
                          }
                          if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                            {
                              SubLObject inference_var = inference;
                              SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                              SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                              SubLObject state = NIL;
                              for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                  SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                  if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                    possibly_note_problem_pending(problem, strategy);
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
              {
                SubLObject idx_28 = idx;
                if ((NIL == id_index.id_index_new_objects_empty_p(idx_28))) {
                  {
                    SubLObject cdohash_table = id_index.id_index_new_objects(idx_28);
                    SubLObject id = NIL;
                    SubLObject inference = NIL;
                    {
                      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                      try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                          final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                          id = Hashtables.getEntryKey(cdohash_entry);
                          inference = Hashtables.getEntryValue(cdohash_entry);
                          if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                            {
                              SubLObject inference_var = inference;
                              SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                              SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                              SubLObject state = NIL;
                              for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                  SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                  if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                    possibly_note_problem_pending(problem, strategy);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return new_status;
      }
    }
  }

  /** Notes that PROBLEM is finished (wrt STRATEGIC-CONTEXT) unless it is already
known to be finished (wrt STRATEGIC-CONTEXT). */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 92173) 
  public static final SubLObject possibly_note_problem_finished(SubLObject problem, SubLObject strategic_context) {
    checkType(strategic_context, $sym55$STRATEGIC_CONTEXT_P);
    if ((NIL != pending_problem_p(problem, strategic_context))) {
      return note_problem_finished(problem, strategic_context);
    }
    return NIL;
  }

  /** Assumes that strategy activity is propagated first, since it uses
that as a criterion for considering no-goodness. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 92547) 
  public static final SubLObject note_problem_finished(SubLObject problem, SubLObject strategic_context) {
    {
      SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
      SubLObject new_status = finished_version_of_problem_status(old_status);
      change_and_propagate_problem_status(problem, new_status, NIL, strategic_context);
      consider_ramifications_of_problem_finished(problem, strategic_context);
      return new_status;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 93144) 
  public static final SubLObject consider_ramifications_of_problem_finished(SubLObject problem, SubLObject strategic_context) {
    consider_that_problem_could_be_no_good(problem, NIL, strategic_context, T);
    possibly_propagate_problem_finished(problem, strategic_context);
    if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
      strategy_note_problem_finished(strategic_context, problem);
    } else {
      {
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, restriction_link))) {
              if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $kw47$RESTRICTION))) {
                {
                  SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                  SubLObject set_contents_var_29 = inference_datastructures_problem.problem_dependent_links(supported_problem);
                  SubLObject basis_object_30 = set_contents.do_set_contents_basis_object(set_contents_var_29);
                  SubLObject state_31 = NIL;
                  for (state_31 = set_contents.do_set_contents_initial_state(basis_object_30, set_contents_var_29); (NIL == set_contents.do_set_contents_doneP(basis_object_30, state_31)); state_31 = set_contents.do_set_contents_update_state(state_31)) {
                    {
                      SubLObject jo_link = set_contents.do_set_contents_next(basis_object_30, state_31);
                      if ((NIL != set_contents.do_set_contents_element_validP(state_31, jo_link))) {
                        if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $kw36$JOIN_ORDERED))) {
                          inference_worker_join_ordered.note_restricted_non_focal_finished(jo_link, restriction_link);
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
      {
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
          {
            SubLObject idx_32 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_32, $kw13$SKIP))) {
              {
                SubLObject vector_var = id_index.id_index_old_objects(idx_32);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                  {
                    SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                    SubLObject inference = Vectors.aref(vector_var, id);
                    if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                           && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw13$SKIP;
                      }
                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                        {
                          SubLObject inference_var = inference;
                          SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                          SubLObject state = NIL;
                          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                            {
                              SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                              if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                if ((NIL != finished_problem_p(problem, strategy))) {
                                  consider_ramifications_of_problem_finished(problem, strategy);
                                } else {
                                  possibly_note_problem_finished(problem, strategy);
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
          {
            SubLObject idx_33 = idx;
            if ((NIL == id_index.id_index_new_objects_empty_p(idx_33))) {
              {
                SubLObject cdohash_table = id_index.id_index_new_objects(idx_33);
                SubLObject id = NIL;
                SubLObject inference = NIL;
                {
                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                  try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                      final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                      id = Hashtables.getEntryKey(cdohash_entry);
                      inference = Hashtables.getEntryValue(cdohash_entry);
                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                        {
                          SubLObject inference_var = inference;
                          SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                          SubLObject state = NIL;
                          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                            {
                              SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                              if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                if ((NIL != finished_problem_p(problem, strategy))) {
                                  consider_ramifications_of_problem_finished(problem, strategy);
                                } else {
                                  possibly_note_problem_finished(problem, strategy);
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                  }
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 94298) 
  public static final SubLObject possibly_propagate_problem_finished(SubLObject problem, SubLObject strategic_context) {
    {
      SubLObject problem_var = problem;
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject dependent_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link))) {
            {
              SubLObject link_var = dependent_link;
              SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
              SubLObject mapped_problem = NIL;
              for (mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mapped_problem = cdolist_list_var.first()) {
                if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, mapped_problem))) {
                  if ((problem_var == inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) {
                    {
                      SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                      if ((NIL != supported_problem)) {
                        if (((NIL == inference_datastructures_strategy.strategy_p(strategic_context))
                            || (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(supported_problem, strategic_context)))) {
                          consider_that_problem_could_be_finished(supported_problem, NIL, strategic_context, T);
                          if ((NIL != inference_worker_restriction.restriction_link_p(dependent_link))) {
                            {
                              SubLObject set_contents_var_34 = inference_datastructures_problem.problem_dependent_links(supported_problem);
                              SubLObject basis_object_35 = set_contents.do_set_contents_basis_object(set_contents_var_34);
                              SubLObject state_36 = NIL;
                              for (state_36 = set_contents.do_set_contents_initial_state(basis_object_35, set_contents_var_34); (NIL == set_contents.do_set_contents_doneP(basis_object_35, state_36)); state_36 = set_contents.do_set_contents_update_state(state_36)) {
                                {
                                  SubLObject jo_link = set_contents.do_set_contents_next(basis_object_35, state_36);
                                  if ((NIL != set_contents.do_set_contents_element_validP(state_36, jo_link))) {
                                    if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $kw36$JOIN_ORDERED))) {
                                      if ((NIL != inference_datastructures_problem_link.problem_link_openP(jo_link))) {
                                        {
                                          SubLObject conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link);
                                          consider_that_problem_could_be_finished(conjunction_problem, NIL, strategic_context, T);
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
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 95508) 
  public static final SubLObject strategy_note_problem_finished(SubLObject strategic_context, SubLObject problem) {
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 95679) 
  public static final SubLObject note_argument_link_added(SubLObject link) {
    {
      SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
      SubLObject prob = supported_problem;
      SubLObject store = inference_datastructures_problem.problem_store(prob);
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
        {
          SubLObject idx_37 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_37, $kw13$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_37);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw13$SKIP;
                    }
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              inference_tactician.strategy_note_argument_link_added(strategy, link);
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
        {
          SubLObject idx_38 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_38))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_38);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              inference_tactician.strategy_note_argument_link_added(strategy, link);
                            }
                          }
                        }
                      }
                    }
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
    }
    return link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 95961) 
  public static final SubLObject note_goal_link_added(SubLObject link) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject goal_proof = new_goal_proof(link);
        SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != newP)) {
          bubble_up_proof(goal_proof);
        }
      }
      return link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 96895) 
  public static final SubLObject no_good_problem_p(SubLObject problem, SubLObject strategic_context) {
    if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
      return inference_datastructures_strategy.strategically_no_good_problem_p(problem, strategic_context);
    } else {
      return inference_datastructures_problem.tactically_no_good_problem_p(problem);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 97125) 
  public static final SubLObject neutral_problem_p(SubLObject problem, SubLObject strategic_context) {
    if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
      return inference_datastructures_strategy.strategically_neutral_problem_p(problem, strategic_context);
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35397");
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 97355) 
  public static final SubLObject good_problem_p(SubLObject problem, SubLObject strategic_context) {
    if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
      return inference_datastructures_strategy.strategically_good_problem_p(problem, strategic_context);
    } else {
      return inference_datastructures_problem.tactically_good_problem_p(problem);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 97809) 
  public static final SubLObject possible_problem_p(SubLObject problem, SubLObject strategic_context) {
    if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
      return inference_datastructures_strategy.strategically_possible_problem_p(problem, strategic_context);
    } else {
      return inference_datastructures_problem.tactically_possible_problem_p(problem);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 98042) 
  public static final SubLObject pending_problem_p(SubLObject problem, SubLObject strategic_context) {
    if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
      return inference_datastructures_strategy.strategically_pending_problem_p(problem, strategic_context);
    } else {
      return inference_datastructures_problem.tactically_pending_problem_p(problem);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 98272) 
  public static final SubLObject finished_problem_p(SubLObject problem, SubLObject strategic_context) {
    if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
      return inference_datastructures_strategy.strategically_finished_problem_p(problem, strategic_context);
    } else {
      return inference_datastructures_problem.tactically_finished_problem_p(problem);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 99055) 
  public static final SubLObject totally_finished_problem_p(SubLObject problem, SubLObject strategic_context) {
    return finished_problem_p(problem, inference_tactician.controlling_strategic_context(strategic_context));
  }

  /** When non-NIL link propagation is disabled.  This is only useful when serializing in problem stores. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 99217) 
  public static SubLSymbol $disable_link_propagationP$ = null;

  /** Does all propagation necessary to handle the addition of the newly created link LINK.
Adding a link can never cause a problem to become no-good, but removing a link could. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 100187) 
  public static final SubLObject propagate_problem_link(SubLObject link) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $disable_link_propagationP$.getDynamicValue(thread))) {
        propagate_min_proof_depth_via_link(link);
        propagate_min_transformation_depth_via_link(link);
        inference_min_transformation_depth.propagate_min_transformation_depth_signature_via_link(link);
        propagate_strategy_activity(link);
        propagate_inference_relevance(link);
        note_argument_link_added(link);
        propagate_proofs(link);
        propagate_proof_spec(link);
        return link;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 100985) 
  public static final SubLObject propagate_proofs(SubLObject link) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_datastructures_problem_link.problem_link_to_goal_p(link))) {
        note_goal_link_added(link);
      } else {
        {
          SubLObject link_var = link;
          SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
          SubLObject supporting_mapped_problem = NIL;
          for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
            if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
              if ((NIL != link_permits_proof_propagationP(link, supporting_mapped_problem))) {
                {
                  SubLObject status_var = $kw85$PROVEN;
                  SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem)));
                  while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                    thread.resetMultipleValues();
                    {
                      SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                      SubLObject proof_list = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      {
                        SubLObject cdolist_list_var_39 = proof_list;
                        SubLObject proof = NIL;
                        for (proof = cdolist_list_var_39.first(); (NIL != cdolist_list_var_39); cdolist_list_var_39 = cdolist_list_var_39.rest(), proof = cdolist_list_var_39.first()) {
                          if ((NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var))) {
                            bubble_up_proof_to_link_via_variable_map(proof, inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem), link);
                          }
                        }
                      }
                      iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                  }
                  dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
              }
            }
          }
        }
      }
      return link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 101560) 
  public static final SubLObject repropagate_newly_opened_link(SubLObject link, SubLObject mapped_supporting_problem) {
    propagate_strategy_activity(link);
    propagate_inference_relevance(link);
    propagate_proofs(link);
    propagate_proof_spec(link);
    return link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 102079) 
  public static final SubLObject problem_link_open_and_repropagate_index(SubLObject link, SubLObject index) {
    inference_datastructures_problem_link.problem_link_open_index(link, index);
    {
      SubLObject supporting_mapped_problem = inference_datastructures_problem_link.problem_link_find_supporting_mapped_problem_by_index(link, index);
      repropagate_newly_opened_link(link, supporting_mapped_problem);
    }
    return link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 102376) 
  public static final SubLObject problem_link_open_and_repropagate_supporting_mapped_problem(SubLObject link, SubLObject supporting_mapped_problem) {
    inference_datastructures_problem_link.problem_link_open_supporting_mapped_problem(link, supporting_mapped_problem);
    repropagate_newly_opened_link(link, supporting_mapped_problem);
    return link;
  }

  /** Does all propagation necessary to handle the addition of the newly created answer link LINK.
i.e. bubbles up proofs (if any) from the supported problems of LINK to LINK's strategy. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 102902) 
  public static final SubLObject propagate_answer_link(SubLObject link) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject inference = inference_datastructures_problem_link.problem_link_supported_inference(link);
        propagate_proof_spec_via_answer_link(link);
        {
          SubLObject link_var = link;
          SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
          SubLObject supporting_mapped_problem = NIL;
          for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
            if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
              {
                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                inference_datastructures_problem.set_problem_min_proof_depth(supporting_problem, inference, ZERO_INTEGER);
                if ((NIL == inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35391");
                }
                inference_datastructures_problem.set_root_problem_min_transformation_depth_signature(supporting_problem, inference);
                {
                  SubLObject status_var = $kw85$PROVEN;
                  SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(supporting_problem));
                  while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                    thread.resetMultipleValues();
                    {
                      SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                      SubLObject proof_list = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      {
                        SubLObject cdolist_list_var_40 = proof_list;
                        SubLObject proof = NIL;
                        for (proof = cdolist_list_var_40.first(); (NIL != cdolist_list_var_40); cdolist_list_var_40 = cdolist_list_var_40.rest(), proof = cdolist_list_var_40.first()) {
                          if ((NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var))) {
                            propagate_proof_to_inference(proof, inference);
                          }
                        }
                      }
                      iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                  }
                  dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                  SubLObject cdolist_list_var_41 = inference_strategist.inference_initial_relevant_strategies(inference);
                  SubLObject strategy = NIL;
                  for (strategy = cdolist_list_var_41.first(); (NIL != cdolist_list_var_41); cdolist_list_var_41 = cdolist_list_var_41.rest(), strategy = cdolist_list_var_41.first()) {
                    maybe_possibly_activate_problem(strategy, supporting_problem);
                  }
                }
                possibly_note_problem_relevant(inference, supporting_problem);
              }
            }
          }
        }
      }
      inference_worker_answer.note_answer_link_propagated(link);
      return link;
    }
  }

  /** @return booleanp; whether you just propagated LINK */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 104103) 
  public static final SubLObject possibly_propagate_answer_link(SubLObject link) {
    if ((NIL == inference_worker_answer.answer_link_propagatedP(link))) {
      propagate_answer_link(link);
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 104316) 
  public static final SubLObject propagate_proof_to_inference(SubLObject proof, SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != $eager_proof_validationP$.getDynamicValue(thread))
          || (NIL != proof_tree_validP(proof)))) {
        inference_strategist.inference_note_proof(inference, proof);
        consider_closing_answer_link(inference_datastructures_inference.inference_root_link(inference));
        return T;
      }
      return NIL;
    }
  }

  /** @return booleanp; whether ANSWER-LINK became closed due to this call. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 104763) 
  public static final SubLObject consider_closing_answer_link(SubLObject answer_link) {
    {
      SubLObject inference = inference_worker_answer.answer_link_supported_inference(answer_link);
      SubLObject should_closeP = inference_deems_answer_link_should_be_closedP(inference, answer_link);
      if ((NIL != should_closeP)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35192");
        return T;
      }
      return NIL;
    }
  }

  /** @return booleanp; whether INFERENCE deems that ANSWER-LINK ought to be closed. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 105149) 
  public static final SubLObject inference_deems_answer_link_should_be_closedP(SubLObject inference, SubLObject answer_link) {
    {
      SubLObject root_mapped_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(answer_link);
      SubLObject root_problem = inference_datastructures_problem_link.mapped_problem_problem(root_mapped_problem);
      SubLObject inference_var = inference;
      SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
            if ((NIL == inference_tactician_strategic_uninterestingness.strategy_has_enough_proofs_for_problemP(strategy, root_problem))) {
              return NIL;
            }
          }
        }
      }
      return T;
    }
  }

  /** @return boolean; t iff PROOF and all its subproofs are well-formed. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 105925) 
  public static final SubLObject proof_tree_validP(SubLObject proof) {
    if (($kw71$NONE == inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(inference_datastructures_proof.proof_store(proof)))) {
      return T;
    }
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35333");
  }

  /** @return boolean; t iff DEPTH1 is less than DEPTH2.
Any integer is deemed less than :undetermined. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 106608) 
  public static final SubLObject depth_L(SubLObject depth1, SubLObject depth2) {
    if ((NIL != subl_promotions.non_negative_integer_p(depth1))) {
      if ((NIL != subl_promotions.non_negative_integer_p(depth2))) {
        return Numbers.numL(depth1, depth2);
      } else {
        return T;
      }
    } else {
      return NIL;
    }
  }

  /** Propagates proof depth down via LINK. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 107400) 
  public static final SubLObject propagate_min_proof_depth_via_link(SubLObject link) {
    {
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(inference_datastructures_problem_link.problem_link_store(link));
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
        {
          SubLObject idx_42 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_42, $kw13$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_42);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw13$SKIP;
                    }
                    propagate_min_proof_depth_via_link_wrt_inference(link, inference);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_43 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_43))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_43);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    propagate_min_proof_depth_via_link_wrt_inference(link, inference);
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  /** Propagates proof depth wrt INFERENCE down via LINK. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 107656) 
  public static final SubLObject propagate_min_proof_depth_via_link_wrt_inference(SubLObject link, SubLObject inference) {
    {
      SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
      SubLObject parent_depth = inference_datastructures_problem.problem_min_proof_depth(supported_problem, inference);
      if ((NIL != subl_promotions.non_negative_integer_p(parent_depth))) {
        {
          SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_number_of_supporting_problems(link);
          if ((ONE_INTEGER.numE(supporting_problem_count)
               && (NIL != inference_worker_join_ordered.join_ordered_link_p(link)))) {
            supporting_problem_count = TWO_INTEGER;
          }
          if (supporting_problem_count.isPositive()) {
            {
              SubLObject content_increment = ((NIL != content_link_p(link)) ? ((SubLObject) ONE_INTEGER) : ZERO_INTEGER);
              SubLObject sibling_increment = number_utilities.f_1_(supporting_problem_count);
              SubLObject increment = Numbers.add(content_increment, sibling_increment);
              SubLObject propagated_child_depth = Numbers.add(parent_depth, increment);
              SubLObject link_var = link;
              SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
              SubLObject supporting_mapped_problem = NIL;
              for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
                if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
                  {
                    SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    SubLObject child_depth = inference_datastructures_problem.problem_min_proof_depth(supporting_problem, inference);
                    if ((NIL != proof_depth_L(propagated_child_depth, child_depth))) {
                      inference_datastructures_problem.set_problem_min_proof_depth(supporting_problem, inference, propagated_child_depth);
                      {
                        SubLObject prob = supporting_problem;
                        SubLObject store = inference_datastructures_problem.problem_store(prob);
                        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
                          {
                            SubLObject idx_44 = idx;
                            if ((NIL == id_index.id_index_old_objects_empty_p(idx_44, $kw13$SKIP))) {
                              {
                                SubLObject vector_var = id_index.id_index_old_objects(idx_44);
                                SubLObject backwardP_var = NIL;
                                SubLObject length = Sequences.length(vector_var);
                                SubLObject v_iteration = NIL;
                                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                  {
                                    SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                                    SubLObject inference_45 = Vectors.aref(vector_var, id);
                                    if ((!(((NIL != id_index.id_index_tombstone_p(inference_45))
                                           && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                                      if ((NIL != id_index.id_index_tombstone_p(inference_45))) {
                                        inference_45 = $kw13$SKIP;
                                      }
                                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference_45))) {
                                        {
                                          SubLObject inference_var = inference_45;
                                          SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                                          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                          SubLObject state = NIL;
                                          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                            {
                                              SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                              if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                                inference_datastructures_strategy.set_problem_recompute_thrown_away_wrt_all_motivations(supporting_problem, strategy);
                                                inference_datastructures_strategy.set_problem_recompute_set_aside_wrt_all_motivations(supporting_problem, strategy);
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
                          {
                            SubLObject idx_46 = idx;
                            if ((NIL == id_index.id_index_new_objects_empty_p(idx_46))) {
                              {
                                SubLObject cdohash_table = id_index.id_index_new_objects(idx_46);
                                SubLObject id = NIL;
                                SubLObject inference_47 = NIL;
                                {
                                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                  try {
                                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                      final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                      id = Hashtables.getEntryKey(cdohash_entry);
                                      inference_47 = Hashtables.getEntryValue(cdohash_entry);
                                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference_47))) {
                                        {
                                          SubLObject inference_var = inference_47;
                                          SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                                          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                          SubLObject state = NIL;
                                          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                            {
                                              SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                              if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                                inference_datastructures_strategy.set_problem_recompute_thrown_away_wrt_all_motivations(supporting_problem, strategy);
                                                inference_datastructures_strategy.set_problem_recompute_set_aside_wrt_all_motivations(supporting_problem, strategy);
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } finally {
                                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      {
                        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supporting_problem);
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject argument_link = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, argument_link))) {
                              propagate_min_proof_depth_via_link_wrt_inference(argument_link, inference);
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
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 109578) 
  public static final SubLObject proof_depth_L(SubLObject depth1, SubLObject depth2) {
    return depth_L(depth1, depth2);
  }

  /** Return T iff PROBLEM is strictly within (not at) the stated max proof depth of INFERENCE. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 109660) 
  public static final SubLObject problem_strictly_within_max_proof_depthP(SubLObject inference, SubLObject problem) {
    {
      SubLObject max_proof_depth = inference_datastructures_inference.inference_max_proof_depth(inference);
      if ((NIL != max_proof_depth)) {
        {
          SubLObject proof_depth = inference_datastructures_problem.problem_min_proof_depth(problem, inference);
          if ((proof_depth.isNumber()
               && (NIL == proof_depth_L(proof_depth, max_proof_depth)))) {
            return NIL;
          }
        }
      }
    }
    return T;
  }

  /** Propagates transformation depth down via LINK. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 110140) 
  public static final SubLObject propagate_min_transformation_depth_via_link(SubLObject link) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread))) {
        return NIL;
      }
      {
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(inference_datastructures_problem_link.problem_link_store(link));
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
          {
            SubLObject idx_48 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_48, $kw13$SKIP))) {
              {
                SubLObject vector_var = id_index.id_index_old_objects(idx_48);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                  {
                    SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                    SubLObject inference = Vectors.aref(vector_var, id);
                    if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                           && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw13$SKIP;
                      }
                      propagate_min_transformation_depth_via_link_wrt_inference(link, inference);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject idx_49 = idx;
            if ((NIL == id_index.id_index_new_objects_empty_p(idx_49))) {
              {
                SubLObject cdohash_table = id_index.id_index_new_objects(idx_49);
                SubLObject id = NIL;
                SubLObject inference = NIL;
                {
                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                  try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                      final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                      id = Hashtables.getEntryKey(cdohash_entry);
                      inference = Hashtables.getEntryValue(cdohash_entry);
                      propagate_min_transformation_depth_via_link_wrt_inference(link, inference);
                    }
                  } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
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

  /** Propagates transformation depth wrt INFERENCE down via LINK. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 110503) 
  public static final SubLObject propagate_min_transformation_depth_via_link_wrt_inference(SubLObject link, SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread))) {
        return NIL;
      }
      {
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject parent_depth = inference_datastructures_problem.problem_min_transformation_depth(supported_problem, inference);
        if ((NIL != subl_promotions.non_negative_integer_p(parent_depth))) {
          if ((NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(link))) {
            {
              SubLObject increment = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35355");
              if ((NIL != subl_promotions.non_negative_integer_p(increment))) {
                {
                  SubLObject propagated_child_depth = Numbers.add(parent_depth, increment);
                  SubLObject link_var = link;
                  SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                  SubLObject supporting_mapped_problem = NIL;
                  for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
                    if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
                      {
                        SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                        SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                        SubLObject child_depth = inference_datastructures_problem.problem_min_transformation_depth(supporting_problem, inference);
                        if ((NIL != transformation_depth_L(propagated_child_depth, child_depth))) {
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35392");
                          {
                            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supporting_problem);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                              {
                                SubLObject argument_link = set_contents.do_set_contents_next(basis_object, state);
                                if ((NIL != set_contents.do_set_contents_element_validP(state, argument_link))) {
                                  propagate_min_transformation_depth_via_link_wrt_inference(argument_link, inference);
                                }
                              }
                            }
                          }
                          if ((NIL != inference_worker_transformation.transformation_link_p(link))) {
                            {
                              SubLObject t_link_var = link;
                              SubLObject supported_problem_50 = inference_datastructures_problem_link.problem_link_supported_problem(t_link_var);
                              SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem_50);
                              SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                              SubLObject state = NIL;
                              for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                  SubLObject jo_link_var = set_contents.do_set_contents_next(basis_object, state);
                                  if ((NIL != set_contents.do_set_contents_element_validP(state, jo_link_var))) {
                                    if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $kw36$JOIN_ORDERED))) {
                                      {
                                        SubLObject jo_link_var_51 = jo_link_var;
                                        SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_51);
                                        SubLObject set_contents_var_52 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                                        SubLObject basis_object_53 = set_contents.do_set_contents_basis_object(set_contents_var_52);
                                        SubLObject state_54 = NIL;
                                        for (state_54 = set_contents.do_set_contents_initial_state(basis_object_53, set_contents_var_52); (NIL == set_contents.do_set_contents_doneP(basis_object_53, state_54)); state_54 = set_contents.do_set_contents_update_state(state_54)) {
                                          {
                                            SubLObject rt_link = set_contents.do_set_contents_next(basis_object_53, state_54);
                                            if ((NIL != set_contents.do_set_contents_element_validP(state_54, rt_link))) {
                                              if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $kw100$RESIDUAL_TRANSFORMATION))) {
                                                if ((NIL != Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35062"))) {
                                                  if ((NIL != Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35066"))) {
                                                    propagate_min_transformation_depth_via_link_wrt_inference(rt_link, inference);
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
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 113301) 
  public static final SubLObject transformation_depth_L(SubLObject depth1, SubLObject depth2) {
    return depth_L(depth1, depth2);
  }

  /** Return T iff PROBLEM is strictly within (not at) the stated max transformation depth of INFERENCE. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 113485) 
  public static final SubLObject problem_strictly_within_max_transformation_depthP(SubLObject inference, SubLObject problem) {
    {
      SubLObject max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
      if ((NIL != max_transformation_depth)) {
        {
          SubLObject transformation_depth = inference_datastructures_problem.problem_min_transformation_depth(problem, inference);
          if ((transformation_depth.isNumber()
               && (NIL == transformation_depth_L(transformation_depth, max_transformation_depth)))) {
            return NIL;
          }
        }
      }
    }
    return T;
  }

  /** Return T iff transformation on PROBLEM is allowed based on the max transformation depth of INFERENCE. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 114063) 
  public static final SubLObject problem_transformation_allowed_wrt_max_transformation_depthP(SubLObject inference, SubLObject problem) {
    return problem_strictly_within_max_transformation_depthP(inference, problem);
  }

  /** Return T iff transformation motivation on LOGICAL-TACTIC is allowed based on the max transformation depth of INFERENCE. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 114348) 
  public static final SubLObject logical_tactic_transformation_allowed_wrt_max_transformation_depthP(SubLObject inference, SubLObject logical_tactic) {
    {
      SubLObject problem = inference_datastructures_tactic.tactic_problem(logical_tactic);
      if ((NIL == problem_transformation_allowed_wrt_max_transformation_depthP(inference, problem))) {
        return NIL;
      }
      if ((NIL != inference_worker_join.join_tactic_p(logical_tactic))) {
        return NIL;
      }
      {
        SubLObject max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
        if ((NIL == max_transformation_depth)) {
          return T;
        } else if (max_transformation_depth.isZero()) {
          return NIL;
        }
        {
          SubLObject transformation_depth = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35417");
          if ((!(transformation_depth.isNumber()))) {
            return T;
          } else {
            return transformation_depth_L(transformation_depth, max_transformation_depth);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 116598) 
  public static final SubLObject problem_has_been_transformedP(SubLObject problem, SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = inference_datastructures_problem.$transformation_depth_computation$.currentBinding(thread);
          try {
            inference_datastructures_problem.$transformation_depth_computation$.bind($kw111$INTUITIVE, thread);
            result = subl_promotions.positive_integer_p(inference_datastructures_problem.problem_min_transformation_depth(problem, inference));
          } finally {
            inference_datastructures_problem.$transformation_depth_computation$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 116859) 
  public static final SubLObject propagate_strategy_activity(SubLObject link) {
    {
      SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
      SubLObject prob = supported_problem;
      SubLObject store = inference_datastructures_problem.problem_store(prob);
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
        {
          SubLObject idx_55 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_55, $kw13$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_55);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw13$SKIP;
                    }
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              {
                                SubLObject link_var = link;
                                SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                                SubLObject supporting_mapped_problem = NIL;
                                for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
                                  if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
                                    if ((NIL != link_permits_activity_propagationP(link, supporting_mapped_problem))) {
                                      {
                                        SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                        maybe_possibly_activate_problem(strategy, supporting_problem);
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
        {
          SubLObject idx_56 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_56))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_56);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              {
                                SubLObject link_var = link;
                                SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                                SubLObject supporting_mapped_problem = NIL;
                                for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
                                  if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
                                    if ((NIL != link_permits_activity_propagationP(link, supporting_mapped_problem))) {
                                      {
                                        SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                        maybe_possibly_activate_problem(strategy, supporting_problem);
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
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  /** Unless PROBLEM is already active in STRATEGY, notifies STRATEGY that PROBLEM
might be newly active in it.  If STRATEGY agrees, propagates the activity. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 117395) 
  public static final SubLObject maybe_possibly_activate_problem(SubLObject strategy, SubLObject problem) {
    if ((NIL == inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy))) {
      if ((NIL != possibly_activate_problem(strategy, problem))) {
        {
          SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
          SubLObject state = NIL;
          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            {
              SubLObject argument_link = set_contents.do_set_contents_next(basis_object, state);
              if ((NIL != set_contents.do_set_contents_element_validP(state, argument_link))) {
                propagate_strategy_activity(argument_link);
              }
            }
          }
        }
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 117893) 
  public static final SubLObject link_permits_activity_propagationP(SubLObject link, SubLObject supporting_mapped_problem) {
    return inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem);
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 118067) 
  public static final SubLObject propagate_inference_relevance(SubLObject link) {
    {
      SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
      SubLObject link_var = link;
      SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
      SubLObject supporting_mapped_problem = NIL;
      for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
        if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
          if ((NIL != link_permits_relevance_propagationP(link, supporting_mapped_problem))) {
            {
              SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
              propagate_relevance_to_supporting_problem(supported_problem, supporting_problem);
            }
          }
        }
      }
    }
    return NIL;
  }

  /** Propagates inferential relevance from PROBLEM to SUPPORTING-PROBLEM */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 118560) 
  public static final SubLObject propagate_relevance_to_supporting_problem(SubLObject problem, SubLObject supporting_problem) {
    {
      SubLObject prob = problem;
      SubLObject store = inference_datastructures_problem.problem_store(prob);
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
        {
          SubLObject idx_57 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_57, $kw13$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_57);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw13$SKIP;
                    }
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      possibly_note_problem_relevant(inference, supporting_problem);
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_58 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_58))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_58);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      possibly_note_problem_relevant(inference, supporting_problem);
                    }
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 118860) 
  public static final SubLObject possibly_note_problem_relevant(SubLObject inference, SubLObject problem) {
    if ((NIL == inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference))) {
      inference_datastructures_inference.add_inference_relevant_problem(inference, problem);
      {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject argument_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, argument_link))) {
              if ((NIL != inference_worker_rewrite.rewrite_link_p(argument_link))) {
                inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(inference_datastructures_problem_link.problem_link_sole_supporting_problem(argument_link));
              }
              propagate_inference_relevance(argument_link);
            }
          }
        }
      }
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 119403) 
  public static final SubLObject link_permits_relevance_propagationP(SubLObject link, SubLObject supporting_mapped_problem) {
    return T;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 119544) 
  private static SubLSymbol $bubble_up_proofs_through_closed_split_linksP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 119639) 
  public static final SubLObject link_permits_proof_propagationP(SubLObject link, SubLObject supporting_mapped_problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem))
            || ((NIL != inference_worker_join_ordered.join_ordered_link_p(link))
               && (NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(link))
               && (NIL != inference_datastructures_problem_link.mapped_problem_equal(supporting_mapped_problem, inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(link))))
            || ((NIL != $bubble_up_proofs_through_closed_split_linksP$.getDynamicValue(thread))
               && (NIL != inference_worker_split.split_link_p(link)))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 120233) 
  public static final SubLObject consider_that_mapped_problem_could_be_irrelevant(SubLObject mapped_problem, SubLObject dependent_link) {
    if ((NIL != link_permits_relevance_propagationP(dependent_link, mapped_problem))) {
      {
        SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
          {
            SubLObject idx_59 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_59, $kw13$SKIP))) {
              {
                SubLObject vector_var = id_index.id_index_old_objects(idx_59);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                  {
                    SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                    SubLObject inference = Vectors.aref(vector_var, id);
                    if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                           && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw13$SKIP;
                      }
                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                        consider_that_problem_could_be_irrelevant_to_inference(problem, inference);
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject idx_60 = idx;
            if ((NIL == id_index.id_index_new_objects_empty_p(idx_60))) {
              {
                SubLObject cdohash_table = id_index.id_index_new_objects(idx_60);
                SubLObject id = NIL;
                SubLObject inference = NIL;
                {
                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                  try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                      final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                      id = Hashtables.getEntryKey(cdohash_entry);
                      inference = Hashtables.getEntryValue(cdohash_entry);
                      if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                        consider_that_problem_could_be_irrelevant_to_inference(problem, inference);
                      }
                    }
                  } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                  }
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 120785) 
  public static final SubLObject consider_that_problem_could_be_irrelevant_to_inference(SubLObject problem, SubLObject inference) {
    if ((NIL != problem_irrelevant_to_inferenceP(problem, inference))) {
      maybe_make_problem_irrelevant_to_inference(inference, problem);
      return T;
    }
    return NIL;
  }

  /** @return boolean; whether PROBLEM is deemed irrelevant to INFERENCE.
It is deemed irrelevant if it cannot establish a way to rederive its relevance
via a dependent link to something that is relevant to INFERENCE, or INFERENCE itself. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 121034) 
  public static final SubLObject problem_irrelevant_to_inferenceP(SubLObject problem, SubLObject inference) {
    if ((NIL != inference_datastructures_problem_link.problem_link_closedP(inference_datastructures_inference.inference_root_link(inference)))) {
      return T;
    }
    {
      SubLObject problem_var = problem;
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject dependent_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link))) {
            {
              SubLObject link_var = dependent_link;
              SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
              SubLObject supporting_mapped_problem = NIL;
              for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
                if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
                  if ((problem_var == inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem))) {
                    if ((NIL != link_permits_relevance_propagationP(dependent_link, supporting_mapped_problem))) {
                      if ((NIL != inference_worker_answer.answer_link_p(dependent_link))) {
                        if ((inference == inference_datastructures_problem_link.problem_link_supported_inference(dependent_link))) {
                          return NIL;
                        }
                      } else {
                        {
                          SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                          if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference))) {
                            return NIL;
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
    return T;
  }

  /** Unless PROBLEM is already irrelevant to INFERENCE, notes that PROBLEM
is now irrelevant to INFERENCE.  Then propagates the irrelevance. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 122146) 
  public static final SubLObject maybe_make_problem_irrelevant_to_inference(SubLObject inference, SubLObject problem) {
    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference))) {
      make_problem_irrelevant_to_inference(inference, problem);
      {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject argument_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, argument_link))) {
              propagate_inference_irrelevance(inference, argument_link);
            }
          }
        }
      }
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 122635) 
  public static final SubLObject make_problem_irrelevant_to_inference(SubLObject inference, SubLObject problem) {
    inference_datastructures_inference.remove_inference_relevant_problem(inference, problem);
    {
      SubLObject inference_var = inference;
      SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
            if ((NIL != inference_datastructures_strategy.problem_set_aside_in_strategyP(problem, strategy))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36468");
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 123002) 
  public static final SubLObject propagate_inference_irrelevance(SubLObject inference, SubLObject link) {
    {
      SubLObject link_var = link;
      SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
      SubLObject supporting_mapped_problem = NIL;
      for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
        if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
          if ((NIL != link_permits_relevance_propagationP(link, supporting_mapped_problem))) {
            consider_that_problem_could_be_irrelevant_to_inference(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem), inference);
          }
        }
      }
    }
    return NIL;
  }

  /** If STRATEGIC-CONTEXT is :tactical, returns PROBLEM's status.
If STRATEGIC-CONTEXT is STRATEGY, returns PROBLEM's strategic status wrt STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 123368) 
  public static final SubLObject problem_raw_tactical_or_strategic_status(SubLObject problem, SubLObject strategic_context) {
    checkType(strategic_context, $sym55$STRATEGIC_CONTEXT_P);
    return ((NIL != inference_datastructures_strategy.strategy_p(strategic_context)) ? ((SubLObject) inference_datastructures_strategy.problem_raw_strategic_status(problem, strategic_context)) : inference_datastructures_problem.problem_status(problem));
  }

  /** If STRATEGIC-CONTEXT is :tactical, sets PROBLEM's status to STATUS.
If STRATEGIC-CONTEXT is STRATEGY, sets PROBLEM's raw strategic status wrt STRATEGY to STATUS. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 123818) 
  public static final SubLObject set_problem_raw_tactical_or_strategic_status(SubLObject problem, SubLObject strategic_context, SubLObject status) {
    checkType(strategic_context, $sym55$STRATEGIC_CONTEXT_P);
    if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
      inference_datastructures_strategy.set_problem_raw_strategic_status(problem, strategic_context, status);
    } else {
      inference_datastructures_problem.set_problem_status(problem, status);
    }
    return problem;
  }

  /** Whether we are currently reconsidering set-asides for some strategy.
This is used to allow or preclude certain strategic status changes. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 124310) 
  public static SubLSymbol $reconsidering_set_asidesP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 124509) 
  public static final SubLObject change_and_propagate_problem_status(SubLObject problem, SubLObject new_status, SubLObject consider_deepP, SubLObject strategic_context) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
        if ((old_status == new_status)) {
          Errors.error($str113$Uninteresting_problem_status_chan, problem, old_status, new_status);
        } else {
          {
            SubLObject pcase_var = old_status;
            if (pcase_var.eql($kw114$NEW)) {
              {
                SubLObject pcase_var_61 = new_status;
                if (pcase_var_61.eql($kw109$UNEXAMINED)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35283");
                }
              }
            } else if (pcase_var.eql($kw109$UNEXAMINED)) {
              {
                SubLObject pcase_var_62 = new_status;
                if (pcase_var_62.eql($kw115$UNEXAMINED_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    inference_metrics.increment_good_problem_historical_count();
                  }
                } else if (pcase_var_62.eql($kw116$UNEXAMINED_NO_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    inference_metrics.increment_no_good_problem_historical_count();
                  }
                  consider_that_supported_problems_could_be_no_good(problem, consider_deepP, strategic_context);
                } else if (pcase_var_62.eql($kw117$EXAMINED)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35284");
                }
              }
            } else if (pcase_var.eql($kw115$UNEXAMINED_GOOD)) {
              {
                SubLObject pcase_var_63 = new_status;
                if (pcase_var_63.eql($kw118$EXAMINED_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                } else if (pcase_var_63.eql($kw109$UNEXAMINED)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36279");
                  }
                  consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, T);
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35285");
                }
              }
            } else if (pcase_var.eql($kw116$UNEXAMINED_NO_GOOD)) {
              {
                SubLObject pcase_var_64 = new_status;
                if (pcase_var_64.eql($kw119$EXAMINED_NO_GOOD)) {
                  if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
                    set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  } else {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35286");
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35287");
                }
              }
            } else if (pcase_var.eql($kw117$EXAMINED)) {
              {
                SubLObject pcase_var_65 = new_status;
                if (pcase_var_65.eql($kw118$EXAMINED_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    inference_metrics.increment_good_problem_historical_count();
                  }
                } else if (pcase_var_65.eql($kw119$EXAMINED_NO_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    inference_metrics.increment_no_good_problem_historical_count();
                  }
                  consider_that_supported_problems_could_be_no_good(problem, consider_deepP, strategic_context);
                } else if (pcase_var_65.eql($kw59$POSSIBLE)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                } else if (pcase_var_65.eql($kw109$UNEXAMINED)) {
                  if (((NIL != $reconsidering_set_asidesP$.getDynamicValue(thread))
                       && (NIL != inference_datastructures_strategy.strategy_p(strategic_context)))) {
                    set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  } else {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35288");
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35289");
                }
              }
            } else if (pcase_var.eql($kw118$EXAMINED_GOOD)) {
              {
                SubLObject pcase_var_66 = new_status;
                if (pcase_var_66.eql($kw120$POSSIBLE_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                } else if (pcase_var_66.eql($kw117$EXAMINED)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36280");
                  }
                  consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, T);
                } else if (pcase_var_66.eql($kw115$UNEXAMINED_GOOD)) {
                  if (((NIL != $reconsidering_set_asidesP$.getDynamicValue(thread))
                       && (NIL != inference_datastructures_strategy.strategy_p(strategic_context)))) {
                    set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  } else {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35290");
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35291");
                }
              }
            } else if (pcase_var.eql($kw59$POSSIBLE)) {
              {
                SubLObject pcase_var_67 = new_status;
                if (pcase_var_67.eql($kw120$POSSIBLE_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    inference_metrics.increment_good_problem_historical_count();
                  }
                } else if (pcase_var_67.eql($kw121$PENDING)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                } else if (pcase_var_67.eql($kw109$UNEXAMINED)) {
                  if (((NIL != $reconsidering_set_asidesP$.getDynamicValue(thread))
                       && (NIL != inference_datastructures_strategy.strategy_p(strategic_context)))) {
                    set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  } else {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35292");
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35293");
                }
              }
            } else if (pcase_var.eql($kw120$POSSIBLE_GOOD)) {
              {
                SubLObject pcase_var_68 = new_status;
                if (pcase_var_68.eql($kw122$PENDING_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                } else if (pcase_var_68.eql($kw59$POSSIBLE)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36281");
                  }
                  consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, T);
                } else if (pcase_var_68.eql($kw115$UNEXAMINED_GOOD)) {
                  if (((NIL != $reconsidering_set_asidesP$.getDynamicValue(thread))
                       && (NIL != inference_datastructures_strategy.strategy_p(strategic_context)))) {
                    set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  } else {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35294");
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35295");
                }
              }
            } else if (pcase_var.eql($kw121$PENDING)) {
              {
                SubLObject pcase_var_69 = new_status;
                if (pcase_var_69.eql($kw122$PENDING_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    inference_metrics.increment_good_problem_historical_count();
                  }
                } else if (pcase_var_69.eql($kw123$PENDING_NO_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    inference_metrics.increment_no_good_problem_historical_count();
                  }
                  consider_that_supported_problems_could_be_no_good(problem, consider_deepP, strategic_context);
                } else if (pcase_var_69.eql($kw124$FINISHED)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, T);
                } else if (pcase_var_69.eql($kw109$UNEXAMINED)) {
                  if (((NIL != $reconsidering_set_asidesP$.getDynamicValue(thread))
                       && (NIL != inference_datastructures_strategy.strategy_p(strategic_context)))) {
                    set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  } else {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35296");
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35297");
                }
              }
            } else if (pcase_var.eql($kw122$PENDING_GOOD)) {
              {
                SubLObject pcase_var_70 = new_status;
                if (pcase_var_70.eql($kw121$PENDING)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36282");
                  }
                  consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, T);
                } else if (pcase_var_70.eql($kw125$FINISHED_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                } else if (pcase_var_70.eql($kw115$UNEXAMINED_GOOD)) {
                  if (((NIL != $reconsidering_set_asidesP$.getDynamicValue(thread))
                       && (NIL != inference_datastructures_strategy.strategy_p(strategic_context)))) {
                    set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  } else {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35298");
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35299");
                }
              }
            } else if (pcase_var.eql($kw123$PENDING_NO_GOOD)) {
              {
                SubLObject pcase_var_71 = new_status;
                if (pcase_var_71.eql($kw126$FINISHED_NO_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                } else if (pcase_var_71.eql($kw109$UNEXAMINED)) {
                  if (((NIL != $reconsidering_set_asidesP$.getDynamicValue(thread))
                       && (NIL != inference_datastructures_strategy.strategy_p(strategic_context)))) {
                    set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  } else {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35300");
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35301");
                }
              }
            } else if (pcase_var.eql($kw124$FINISHED)) {
              {
                SubLObject pcase_var_72 = new_status;
                if (pcase_var_72.eql($kw125$FINISHED_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    inference_metrics.increment_good_problem_historical_count();
                  }
                } else if (pcase_var_72.eql($kw126$FINISHED_NO_GOOD)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    inference_metrics.increment_no_good_problem_historical_count();
                  }
                  consider_that_supported_problems_could_be_no_good(problem, consider_deepP, strategic_context);
                } else if (pcase_var_72.eql($kw109$UNEXAMINED)) {
                  if (((NIL != $reconsidering_set_asidesP$.getDynamicValue(thread))
                       && (NIL != inference_datastructures_strategy.strategy_p(strategic_context)))) {
                    set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  } else {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35302");
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35303");
                }
              }
            } else if (pcase_var.eql($kw125$FINISHED_GOOD)) {
              {
                SubLObject pcase_var_73 = new_status;
                if (pcase_var_73.eql($kw124$FINISHED)) {
                  set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  if (($kw12$TACTICAL == strategic_context)) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36283");
                  }
                  consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, T);
                } else if (pcase_var_73.eql($kw115$UNEXAMINED_GOOD)) {
                  if (((NIL != $reconsidering_set_asidesP$.getDynamicValue(thread))
                       && (NIL != inference_datastructures_strategy.strategy_p(strategic_context)))) {
                    set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  } else {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35304");
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35305");
                }
              }
            } else if (pcase_var.eql($kw126$FINISHED_NO_GOOD)) {
              {
                SubLObject pcase_var_74 = new_status;
                if (pcase_var_74.eql($kw109$UNEXAMINED)) {
                  if (((NIL != $reconsidering_set_asidesP$.getDynamicValue(thread))
                       && (NIL != inference_datastructures_strategy.strategy_p(strategic_context)))) {
                    set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                  } else {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35306");
                  }
                } else {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35307");
                }
              }
            } else {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35308");
            }
          }
        }
        if ((NIL != inference_tactician.substrategyP(strategic_context))) {
          inference_datastructures_strategy.controlling_strategy_callback(strategic_context, $kw127$SUBSTRATEGY_PROBLEM_STATUS_CHANGE, problem, old_status, new_status, UNPROVIDED);
        }
      }
      if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
        inference_datastructures_strategy.set_problem_recompute_thrown_away_wrt_all_motivations(problem, strategic_context);
        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_motivations(problem, strategic_context);
      } else {
        inference_datastructures_strategy.set_problem_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(problem);
        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(problem);
      }
      return problem;
    }
  }

  /** Changes PROBLEM's status to a good version of its current status if it
has at least one argument link which is good.  Propagates the change if there is
actually a change. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 136972) 
  public static final SubLObject consider_that_problem_could_be_good(SubLObject problem) {
    if ((NIL == inference_datastructures_problem.tactically_good_problem_p(problem))) {
      if ((NIL != problem_goodP(problem))) {
        {
          SubLObject old_status = inference_datastructures_problem.problem_status(problem);
          SubLObject new_status = good_version_of_problem_status(old_status);
          change_and_propagate_problem_status(problem, new_status, NIL, $kw12$TACTICAL);
        }
        {
          SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
          SubLObject state = NIL;
          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            {
              SubLObject dependent_link = set_contents.do_set_contents_next(basis_object, state);
              if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link))) {
                if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(dependent_link, $kw66$LOGICAL))) {
                  {
                    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                    SubLObject logical_tactic = NIL;
                    for (logical_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), logical_tactic = cdolist_list_var.first()) {
                      if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(logical_tactic, $kw66$LOGICAL))) {
                        inference_datastructures_strategy.set_tactic_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations(logical_tactic);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject prob = problem;
          SubLObject store = inference_datastructures_problem.problem_store(prob);
          SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
          if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
            {
              SubLObject idx_75 = idx;
              if ((NIL == id_index.id_index_old_objects_empty_p(idx_75, $kw13$SKIP))) {
                {
                  SubLObject vector_var = id_index.id_index_old_objects(idx_75);
                  SubLObject backwardP_var = NIL;
                  SubLObject length = Sequences.length(vector_var);
                  SubLObject v_iteration = NIL;
                  for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    {
                      SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                      SubLObject inference = Vectors.aref(vector_var, id);
                      if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                             && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                        if ((NIL != id_index.id_index_tombstone_p(inference))) {
                          inference = $kw13$SKIP;
                        }
                        if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                          consider_that_problem_could_be_irrelevant_to_inference(problem, inference);
                        }
                      }
                    }
                  }
                }
              }
            }
            {
              SubLObject idx_76 = idx;
              if ((NIL == id_index.id_index_new_objects_empty_p(idx_76))) {
                {
                  SubLObject cdohash_table = id_index.id_index_new_objects(idx_76);
                  SubLObject id = NIL;
                  SubLObject inference = NIL;
                  {
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                      while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id = Hashtables.getEntryKey(cdohash_entry);
                        inference = Hashtables.getEntryValue(cdohash_entry);
                        if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                          consider_that_problem_could_be_irrelevant_to_inference(problem, inference);
                        }
                      }
                    } finally {
                      Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return problem;
  }

  /** PROBLEM is deemed good iff it has at least one proof. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 138552) 
  public static final SubLObject problem_goodP(SubLObject problem) {
    return inference_datastructures_problem.problem_has_some_proven_proofP(problem);
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 138703) 
  public static final SubLObject good_version_of_problem_status(SubLObject status) {
    {
      SubLObject pcase_var = status;
      if ((pcase_var.eql($kw115$UNEXAMINED_GOOD)
          || pcase_var.eql($kw118$EXAMINED_GOOD)
          || pcase_var.eql($kw120$POSSIBLE_GOOD)
          || pcase_var.eql($kw122$PENDING_GOOD)
          || pcase_var.eql($kw125$FINISHED_GOOD))) {
        return status;
      } else if (pcase_var.eql($kw109$UNEXAMINED)) {
        return $kw115$UNEXAMINED_GOOD;
      } else if (pcase_var.eql($kw117$EXAMINED)) {
        return $kw118$EXAMINED_GOOD;
      } else if (pcase_var.eql($kw59$POSSIBLE)) {
        return $kw120$POSSIBLE_GOOD;
      } else if (pcase_var.eql($kw121$PENDING)) {
        return $kw122$PENDING_GOOD;
      } else if (pcase_var.eql($kw124$FINISHED)) {
        return $kw125$FINISHED_GOOD;
      } else if (pcase_var.eql($kw114$NEW)) {
        Errors.error($str129$new_problem_cannot_become_good_ye);
      } else if ((pcase_var.eql($kw116$UNEXAMINED_NO_GOOD)
          || pcase_var.eql($kw119$EXAMINED_NO_GOOD)
          || pcase_var.eql($kw123$PENDING_NO_GOOD)
          || pcase_var.eql($kw126$FINISHED_NO_GOOD))) {
        Errors.error($str130$Once_a_problem_is_no_good__it_can);
      } else {
        Errors.error($str131$unknown_problem_status__a, status);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 139736) 
  public static final SubLObject examined_version_of_problem_status(SubLObject status) {
    {
      SubLObject pcase_var = status;
      if ((pcase_var.eql($kw117$EXAMINED)
          || pcase_var.eql($kw118$EXAMINED_GOOD)
          || pcase_var.eql($kw119$EXAMINED_NO_GOOD))) {
        return status;
      } else if (pcase_var.eql($kw109$UNEXAMINED)) {
        return $kw117$EXAMINED;
      } else if (pcase_var.eql($kw115$UNEXAMINED_GOOD)) {
        return $kw118$EXAMINED_GOOD;
      } else if (pcase_var.eql($kw116$UNEXAMINED_NO_GOOD)) {
        return $kw119$EXAMINED_NO_GOOD;
      } else {
        Errors.error($str133$problem_of_status__a_cannot_be_ex, status);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 140105) 
  public static final SubLObject possible_version_of_problem_status(SubLObject status) {
    {
      SubLObject pcase_var = status;
      if ((pcase_var.eql($kw59$POSSIBLE)
          || pcase_var.eql($kw120$POSSIBLE_GOOD)
          || pcase_var.eql($kw134$POSSIBLE_NO_GOOD))) {
        return status;
      } else if (pcase_var.eql($kw117$EXAMINED)) {
        return $kw59$POSSIBLE;
      } else if (pcase_var.eql($kw118$EXAMINED_GOOD)) {
        return $kw120$POSSIBLE_GOOD;
      } else {
        Errors.error($str135$problem_of_status__a_cannot_be_ma, status);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 140422) 
  public static final SubLObject pending_version_of_problem_status(SubLObject status) {
    {
      SubLObject pcase_var = status;
      if ((pcase_var.eql($kw121$PENDING)
          || pcase_var.eql($kw122$PENDING_GOOD)
          || pcase_var.eql($kw123$PENDING_NO_GOOD))) {
        return status;
      } else if (pcase_var.eql($kw59$POSSIBLE)) {
        return $kw121$PENDING;
      } else if (pcase_var.eql($kw120$POSSIBLE_GOOD)) {
        return $kw122$PENDING_GOOD;
      } else {
        Errors.error($str136$problem_of_status__a_cannot_be_pe, status);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 140725) 
  public static final SubLObject finished_version_of_problem_status(SubLObject status) {
    {
      SubLObject pcase_var = status;
      if ((pcase_var.eql($kw124$FINISHED)
          || pcase_var.eql($kw125$FINISHED_GOOD)
          || pcase_var.eql($kw126$FINISHED_NO_GOOD))) {
        return status;
      } else if (pcase_var.eql($kw121$PENDING)) {
        return $kw124$FINISHED;
      } else if (pcase_var.eql($kw122$PENDING_GOOD)) {
        return $kw125$FINISHED_GOOD;
      } else if (pcase_var.eql($kw123$PENDING_NO_GOOD)) {
        return $kw126$FINISHED_NO_GOOD;
      } else {
        Errors.error($str137$problem_of_status__a_cannot_be_fi, status);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 141917) 
  public static final SubLObject consider_that_problem_could_be_finished(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    checkType(strategic_context, $sym55$STRATEGIC_CONTEXT_P);
    if ((NIL != problem_could_be_finishedP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP))) {
      possibly_note_problem_finished(problem, strategic_context);
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 142321) 
  public static final SubLObject problem_could_be_finishedP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    if ((NIL == pending_problem_p(problem, strategic_context))) {
      return NIL;
    } else {
      {
        SubLObject unfinishedP = NIL;
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (!(((NIL != unfinishedP)
              || (NIL != set_contents.do_set_contents_doneP(basis_object, state))))); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
              if ((NIL != inference_datastructures_problem_link.problem_link_openP(link))) {
                unfinishedP = makeBoolean((NIL == problem_link_could_be_finishedP(link, strategic_context, consider_transformation_tacticsP)));
              }
            }
          }
        }
        return makeBoolean((NIL == unfinishedP));
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 142914) 
  public static final SubLObject problem_link_could_be_finishedP(SubLObject link, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    if ((NIL != inference_worker_restriction.simplification_link_p(link))) {
      return finished_problem_p(inference_datastructures_problem_link.problem_link_sole_supporting_problem(link), strategic_context);
    } else if ((NIL != inference_worker_restriction.restriction_link_p(link))) {
      return T;
    } else if ((NIL != inference_worker_removal.removal_link_p(link))) {
      return T;
    } else if ((NIL != inference_worker_transformation.generalized_transformation_link_p(link))) {
      if ((NIL == consider_transformation_tacticsP)) {
        return T;
      } else {
        return finished_problem_p(inference_datastructures_problem_link.problem_link_sole_supporting_problem(link), strategic_context);
      }
    } else if ((NIL != inference_worker_rewrite.rewrite_link_p(link))) {
      return finished_problem_p(inference_datastructures_problem_link.problem_link_sole_supporting_problem(link), strategic_context);
    } else if ((NIL != inference_worker_split.split_link_p(link))) {
      return split_link_could_be_finishedP(link, strategic_context);
    } else if ((NIL != inference_worker_join_ordered.join_ordered_link_p(link))) {
      return inference_worker_join_ordered.join_ordered_link_could_be_finishedP(link, strategic_context);
    } else if ((NIL != inference_worker_join.join_link_p(link))) {
      return join_link_could_be_finishedP(link, strategic_context);
    } else if ((NIL != inference_worker_union.union_link_p(link))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35357");
    } else {
      return Errors.error($str139$unexpected_link_type__S, link);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 143986) 
  public static final SubLObject split_link_could_be_finishedP(SubLObject split_link, SubLObject strategic_context) {
    {
      SubLObject link_var = split_link;
      SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
      SubLObject supporting_mapped_problem = NIL;
      for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
        if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
          {
            SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
            SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
            if ((NIL != no_good_problem_p(conjunct_problem, strategic_context))) {
              return T;
            }
          }
        }
      }
    }
    {
      SubLObject unfinishedP = NIL;
      SubLObject link_var = split_link;
      SubLObject rest = NIL;
      for (rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); (!(((NIL != unfinishedP)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject supporting_mapped_problem = rest.first();
          if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
            {
              SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
              SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
              unfinishedP = makeBoolean((NIL == finished_problem_p(conjunct_problem, strategic_context)));
            }
          }
        }
      }
      return makeBoolean((NIL == unfinishedP));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 144688) 
  public static final SubLObject join_link_could_be_finishedP(SubLObject j_link, SubLObject strategic_context) {
    {
      SubLObject first_problem = inference_worker_join.join_link_first_problem(j_link);
      SubLObject second_problem = inference_worker_join.join_link_second_problem(j_link);
      if (((NIL != no_good_problem_p(first_problem, strategic_context))
          || (NIL != no_good_problem_p(second_problem, strategic_context)))) {
        return T;
      } else if (((NIL != finished_problem_p(first_problem, strategic_context))
           && (NIL != finished_problem_p(second_problem, strategic_context)))) {
        return T;
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 145682) 
  public static final SubLObject consider_that_problem_could_be_no_good(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    if (($kw12$TACTICAL == strategic_context)) {
      return default_consider_that_problem_could_be_no_good(strategic_context, problem, consider_deepP, consider_transformation_tacticsP);
    } else {
      return inference_tactician.strategy_consider_that_problem_could_be_no_good(strategic_context, problem, consider_deepP, consider_transformation_tacticsP);
    }
  }

  /** Changes PROBLEM's status to no-good if it will never have any goal descendants.
Propagates the change if there is actually a change.
@see problem-link-no-good? */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 146156) 
  public static final SubLObject default_consider_that_problem_could_be_no_good(SubLObject strategic_context, SubLObject problem, SubLObject consider_deepP, SubLObject consider_transformation_tacticsP) {
    checkType(strategic_context, $sym55$STRATEGIC_CONTEXT_P);
    if ((!(((NIL != inference_datastructures_problem.tactically_good_problem_p(problem))
          || (NIL != no_good_problem_p(problem, strategic_context)))))) {
      if ((NIL != problem_no_goodP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP))) {
        make_problem_no_good(problem, consider_deepP, strategic_context);
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 147082) 
  public static final SubLObject make_problem_no_good(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
        possibly_note_problem_pending(problem, strategic_context);
      } else {
        discard_all_possible_tactics(problem);
      }
      if (($kw12$TACTICAL == strategic_context)) {
        {
          SubLObject prob = problem;
          SubLObject store = inference_datastructures_problem.problem_store(prob);
          SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
          if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
            {
              SubLObject idx_77 = idx;
              if ((NIL == id_index.id_index_old_objects_empty_p(idx_77, $kw13$SKIP))) {
                {
                  SubLObject vector_var = id_index.id_index_old_objects(idx_77);
                  SubLObject backwardP_var = NIL;
                  SubLObject length = Sequences.length(vector_var);
                  SubLObject v_iteration = NIL;
                  for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    {
                      SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                      SubLObject inference = Vectors.aref(vector_var, id);
                      if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                             && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                        if ((NIL != id_index.id_index_tombstone_p(inference))) {
                          inference = $kw13$SKIP;
                        }
                        if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                          maybe_make_problem_irrelevant_to_inference(inference, problem);
                        }
                      }
                    }
                  }
                }
              }
            }
            {
              SubLObject idx_78 = idx;
              if ((NIL == id_index.id_index_new_objects_empty_p(idx_78))) {
                {
                  SubLObject cdohash_table = id_index.id_index_new_objects(idx_78);
                  SubLObject id = NIL;
                  SubLObject inference = NIL;
                  {
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                      while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id = Hashtables.getEntryKey(cdohash_entry);
                        inference = Hashtables.getEntryValue(cdohash_entry);
                        if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                          maybe_make_problem_irrelevant_to_inference(inference, problem);
                        }
                      }
                    } finally {
                      Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                  }
                }
              }
            }
          }
        }
      }
      if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
        {
          SubLObject status_var = $kw85$PROVEN;
          SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem));
          while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
            thread.resetMultipleValues();
            {
              SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
              SubLObject proof_list = thread.secondMultipleValue();
              thread.resetMultipleValues();
              {
                SubLObject cdolist_list_var = proof_list;
                SubLObject proof = NIL;
                for (proof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), proof = cdolist_list_var.first()) {
                  if ((NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var))) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35342");
                  }
                }
              }
              iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
            }
          }
          dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
      }
      if ((NIL == no_good_problem_p(problem, strategic_context))) {
        {
          SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
          SubLObject new_status = no_good_version_of_problem_status(old_status);
          change_and_propagate_problem_status(problem, new_status, consider_deepP, strategic_context);
          if (($kw12$TACTICAL == strategic_context)) {
            possibly_note_eager_pruning_problem(problem);
          }
          {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
              {
                SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
                  if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $kw141$CONJUNCTIVE))) {
                    make_problem_no_good(inference_datastructures_problem_link.problem_link_supported_problem(link), consider_deepP, strategic_context);
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

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 148330) 
  public static final SubLObject discard_all_possible_tactics(SubLObject problem) {
    return discard_possible_tactics_int(problem, NIL, NIL, NIL, NIL, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 148456) 
  public static final SubLObject discard_all_impossible_possible_tactics(SubLObject problem) {
    discard_possible_tactics_int(problem, $kw67$IMPOSSIBLE, NIL, $kw142$CONTENT, NIL, NIL);
    if ((NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem.problem_store(problem)))) {
      discard_possible_tactics_int(problem, NIL, $kw62$DISALLOWED, $kw66$LOGICAL, NIL, NIL);
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 148943) 
  public static final SubLObject discard_possible_tactics_int(SubLObject problem, SubLObject completeness, SubLObject preference_level, SubLObject type, SubLObject tactic_to_not_discard, SubLObject productivity) {
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type))
             && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $kw59$POSSIBLE))
             && (NIL != inference_datastructures_problem.do_problem_tactics_completeness_match(tactic, completeness))
             && (NIL != inference_datastructures_problem.do_problem_tactics_preference_level_match(tactic, preference_level))
             && (NIL != inference_datastructures_problem.do_problem_tactics_productivity_match(tactic, productivity)))) {
          if ((tactic != tactic_to_not_discard)) {
            inference_datastructures_tactic.note_tactic_discarded(tactic);
            {
              SubLObject prob = problem;
              SubLObject store = inference_datastructures_problem.problem_store(prob);
              SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
              if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
                {
                  SubLObject idx_79 = idx;
                  if ((NIL == id_index.id_index_old_objects_empty_p(idx_79, $kw13$SKIP))) {
                    {
                      SubLObject vector_var = id_index.id_index_old_objects(idx_79);
                      SubLObject backwardP_var = NIL;
                      SubLObject length = Sequences.length(vector_var);
                      SubLObject v_iteration = NIL;
                      for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        {
                          SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                          SubLObject inference = Vectors.aref(vector_var, id);
                          if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                                 && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                            if ((NIL != id_index.id_index_tombstone_p(inference))) {
                              inference = $kw13$SKIP;
                            }
                            if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                              {
                                SubLObject inference_var = inference;
                                SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                SubLObject state = NIL;
                                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                  {
                                    SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                      inference_tactician.strategy_note_tactic_discarded(strategy, tactic);
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
                {
                  SubLObject idx_80 = idx;
                  if ((NIL == id_index.id_index_new_objects_empty_p(idx_80))) {
                    {
                      SubLObject cdohash_table = id_index.id_index_new_objects(idx_80);
                      SubLObject id = NIL;
                      SubLObject inference = NIL;
                      {
                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                          while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id = Hashtables.getEntryKey(cdohash_entry);
                            inference = Hashtables.getEntryValue(cdohash_entry);
                            if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                              {
                                SubLObject inference_var = inference;
                                SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                SubLObject state = NIL;
                                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                  {
                                    SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                                      inference_tactician.strategy_note_tactic_discarded(strategy, tactic);
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } finally {
                          Hashtables.releaseEntrySetIterator(cdohash_iterator);
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
    if (((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem))
         && (NIL == inference_datastructures_problem.problem_has_possible_tacticsP(problem)))) {
      note_problem_pending(problem, $kw12$TACTICAL);
    }
    consider_that_problem_could_be_strategically_pending(problem);
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 149661) 
  public static final SubLObject consider_that_problem_could_be_strategically_pending(SubLObject problem) {
    if ((problem == currently_active_problem())) {
      return NIL;
    }
    {
      SubLObject prob = problem;
      SubLObject store = inference_datastructures_problem.problem_store(prob);
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
        {
          SubLObject idx_81 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_81, $kw13$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_81);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw13$SKIP;
                    }
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              consider_that_problem_could_be_strategically_pending_wrt(problem, strategy);
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
        {
          SubLObject idx_82 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_82))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_82);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              consider_that_problem_could_be_strategically_pending_wrt(problem, strategy);
                            }
                          }
                        }
                      }
                    }
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 150002) 
  public static final SubLObject consider_that_problem_could_be_strategically_pending_wrt(SubLObject problem, SubLObject strategy) {
    inference_tactician.strategy_consider_that_problem_could_be_strategically_pending(strategy, problem);
    if (((NIL != inference_datastructures_strategy.strategically_possible_problem_p(problem, strategy))
         && (NIL != inference_tactician.strategy_no_possible_strategems_for_problemP(strategy, problem)))) {
      possibly_note_problem_pending(problem, strategy);
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 150391) 
  public static final SubLObject consider_that_supported_problems_could_be_no_good(SubLObject supporting_problem, SubLObject consider_deepP, SubLObject strategic_context) {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supporting_problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
            if ((NIL != inference_worker_answer.answer_link_p(link))) {
              {
                SubLObject supported_inference = inference_datastructures_problem_link.problem_link_supported_inference(link);
                inference_strategist.inference_note_no_good(supported_inference);
              }
            } else if ((NIL != inference_worker_union.union_link_p(link))) {
              {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35185"))) {
                  consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, T);
                }
              }
            } else if ((NIL != inference_worker_transformation.transformation_link_p(link))) {
              {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, T);
              }
            } else if ((NIL != inference_worker_rewrite.rewrite_link_p(link))) {
              {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, T);
              }
            } else {
              if ((($kw12$TACTICAL == strategic_context)
                   && (NIL != inference_worker_split.split_link_p(link)))) {
                inference_worker_split.close_split_link(link);
              }
              if ((NIL != link_permits_no_good_propagation_to_supported_problemsP(link))) {
                {
                  SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                  consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, T);
                }
              }
            }
          }
        }
      }
    }
    return supporting_problem;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 151835) 
  public static final SubLObject no_good_version_of_problem_status(SubLObject status) {
    {
      SubLObject pcase_var = status;
      if (pcase_var.eql($kw124$FINISHED)) {
        return $kw126$FINISHED_NO_GOOD;
      } else if (pcase_var.eql($kw121$PENDING)) {
        return $kw123$PENDING_NO_GOOD;
      } else if (pcase_var.eql($kw117$EXAMINED)) {
        return $kw119$EXAMINED_NO_GOOD;
      } else if (pcase_var.eql($kw109$UNEXAMINED)) {
        return $kw116$UNEXAMINED_NO_GOOD;
      } else {
        Errors.error($str138$Unexpected_status__s, status);
      }
    }
    return NIL;
  }

  /** A problem is considered no-good if all of its argument links are no good,
and it will never have any more.
Note that this is NOT the same thing as all of its supporting problems being no good. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 152156) 
  public static final SubLObject problem_no_goodP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    checkType(strategic_context, $sym55$STRATEGIC_CONTEXT_P);
    return unsatisfiable_problemP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP);
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 152673) 
  public static final SubLObject unsatisfiable_problemP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    if ((NIL != good_problem_p(problem, strategic_context))) {
      return NIL;
    } else if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem))) {
      return NIL;
    } else if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem))) {
      return inference_datastructures_problem.closed_problem_p(problem);
    } else if (((NIL != inference_datastructures_problem.single_literal_problem_p(problem))
         && (NIL != problem_has_some_open_obviously_neutral_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)))) {
      return NIL;
    } else if (((NIL != finished_problem_p(problem, strategic_context))
         && ((NIL != inference_datastructures_problem.closed_problem_p(problem))
          || (NIL == inference_datastructures_problem.single_literal_problem_p(problem))))) {
      return T;
    } else if (((NIL != pending_problem_p(problem, strategic_context))
         && (NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategic_context, $kw58$GENERALIZED_REMOVAL))
         && (NIL == inference_tactician_strategic_uninterestingness.problem_has_relevant_supporting_problemP(problem, strategic_context, consider_transformation_tacticsP)))) {
      return T;
    } else if (((NIL != pending_problem_p(problem, strategic_context))
         && ($kw57$PREFERRED == inference_tactician_utilities.memoized_problem_global_preference_level(problem, strategic_context, inference_datastructures_problem.problem_variables(problem)))
         && (NIL == inference_tactician_strategic_uninterestingness.problem_has_relevant_supporting_problemP(problem, strategic_context, consider_transformation_tacticsP)))) {
      return T;
    } else if (((NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $kw35$SPLIT))
         && (NIL != some_no_good_split_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)))) {
      return T;
    } else if (((NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $kw36$JOIN_ORDERED))
         && (NIL != some_no_good_join_ordered_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)))) {
      return T;
    } else if (((NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $kw38$JOIN))
         && (NIL != some_no_good_join_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)))) {
      return T;
    } else if (((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem))
         && (NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $kw37$UNION))
         && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35186")))) {
      return T;
    } else if ((NIL != inference_worker_restriction.problem_has_a_simplificationP(problem))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35184");
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 158103) 
  public static final SubLObject problem_has_some_open_obviously_neutral_argument_linkP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject argument_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, argument_link))) {
            if (((NIL != consider_transformation_tacticsP)
                || (NIL == inference_worker_transformation.generalized_transformation_link_p(argument_link)))) {
              if ((((NIL == consider_deepP)
                    || (NIL == Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35273")))
                   && (NIL != problem_link_has_some_open_obviously_neutral_supporting_mapped_problemP(argument_link, strategic_context)))) {
                return T;
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 158672) 
  public static final SubLObject some_no_good_split_argument_linkP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject split_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, split_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $kw35$SPLIT))) {
              if ((NIL != problem_link_no_goodP(split_link, consider_deepP, strategic_context, consider_transformation_tacticsP))) {
                return T;
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 159005) 
  public static final SubLObject some_no_good_join_ordered_argument_linkP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $kw36$JOIN_ORDERED))) {
              if ((NIL != problem_link_no_goodP(join_ordered_link, consider_deepP, strategic_context, consider_transformation_tacticsP))) {
                return T;
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 159366) 
  public static final SubLObject some_no_good_join_argument_linkP(SubLObject problem, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject join_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, join_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_link, $kw38$JOIN))) {
              if ((NIL != problem_link_no_goodP(join_link, consider_deepP, strategic_context, consider_transformation_tacticsP))) {
                return T;
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  /** A link is considered no-good if at least one of its supporting problems is no good.
If transformation tactics are not being considered, a problem can sometimes be deemed no-good
if it is removally and structurally no-good. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 160036) 
  public static final SubLObject problem_link_no_goodP(SubLObject link, SubLObject consider_deepP, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    checkType(strategic_context, $sym55$STRATEGIC_CONTEXT_P);
    if (((NIL != consider_transformation_tacticsP)
         && (NIL != inference_datastructures_strategy.strategy_p(strategic_context))
         && (NIL == problem_transformation_allowed_wrt_max_transformation_depthP(inference_datastructures_strategy.strategy_inference(strategic_context), inference_datastructures_problem_link.problem_link_supported_problem(link))))) {
      consider_transformation_tacticsP = NIL;
    }
    {
      SubLObject link_var = link;
      SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
      SubLObject supporting_mapped_problem = NIL;
      for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
        if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
          {
            SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
            if ((NIL != no_good_problem_p(supporting_problem, strategic_context))) {
              return T;
            }
            if (((NIL == consider_transformation_tacticsP)
                 && (NIL != problem_no_good_ignoring_transformation_tacticsP(supporting_problem, strategic_context)))) {
              return T;
            }
          }
        }
      }
    }
    if ((NIL != consider_deepP)) {
      if ((NIL != inference_worker_join_ordered.join_ordered_link_p(link))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36367");
      }
    }
    return NIL;
  }

  /** @return boolean; t iff PROBLEM is no good if you ignore its transformation tactics (if any). */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 161438) 
  public static final SubLObject problem_no_good_ignoring_transformation_tacticsP(SubLObject problem, SubLObject strategic_context) {
    return problem_no_goodP(problem, NIL, strategic_context, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 161693) 
  public static final SubLObject problem_link_has_some_open_obviously_neutral_supporting_mapped_problemP(SubLObject link, SubLObject strategic_context) {
    checkType(strategic_context, $sym55$STRATEGIC_CONTEXT_P);
    {
      SubLObject link_var = link;
      SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
      SubLObject supporting_mapped_problem = NIL;
      for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
        if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
          if ((NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem))) {
            {
              SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
              if ((NIL != neutral_problem_p(supporting_problem, strategic_context))) {
                return T;
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 163905) 
  public static final SubLObject link_permits_no_good_propagation_to_supported_problemsP(SubLObject link) {
    {
      SubLObject pcase_var = inference_datastructures_problem_link.problem_link_type(link);
      if (pcase_var.eql($kw35$SPLIT)) {
        return T;
      } else if (pcase_var.eql($kw36$JOIN_ORDERED)) {
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 164094) 
  public static final SubLObject propagate_proof_spec_via_answer_link(SubLObject answer_link) {
    {
      SubLObject inference = inference_worker_answer.answer_link_supported_inference(answer_link);
      SubLObject supporting_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
      SubLObject inference_var = inference;
      SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
            {
              SubLObject proof_spec = inference_datastructures_strategy.strategy_proof_spec(strategy);
              if (($kw144$ANYTHING != proof_spec)) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35351");
              }
            }
          }
        }
      }
    }
    return answer_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 164621) 
  public static final SubLObject propagate_proof_spec(SubLObject link) {
    if ((NIL != inference_worker_answer.answer_link_p(link))) {
      return propagate_proof_spec_via_answer_link(link);
    }
    {
      SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
      if ((NIL != problem_has_some_proof_spec_to_propagateP(supported_problem))) {
        {
          SubLObject link_var = link;
          SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
          SubLObject supporting_mapped_problem = NIL;
          for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
            if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
              if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35244"))) {
                {
                  SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35316");
                }
              }
            }
          }
        }
      }
    }
    return link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 165258) 
  public static final SubLObject problem_has_some_proof_spec_to_propagateP(SubLObject problem) {
    {
      SubLObject prob = problem;
      SubLObject store = inference_datastructures_problem.problem_store(prob);
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw13$SKIP))) {
        {
          SubLObject idx_83 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_83, $kw13$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_83);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw13$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw13$SKIP;
                    }
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              if (($kw144$ANYTHING != inference_datastructures_strategy.strategy_proof_spec(strategy))) {
                                if (($kw144$ANYTHING != Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36474"))) {
                                  return T;
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
        {
          SubLObject idx_84 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_84))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_84);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              if (($kw144$ANYTHING != inference_datastructures_strategy.strategy_proof_spec(strategy))) {
                                if (($kw144$ANYTHING != Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36475"))) {
                                  return T;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  /** @return nil or mapped-problem-p; its problem will be a canonical problem isomorphic to the one
whose identity criterion is QUERY.
If one already exists, it will be returned, otherwise a new one will be created.
   Its variable map will be of the form: returned problem vars -> QUERY's vars.
i.e. a binding list of HL variables, indicating which HL variables
in the query of the returned problem (the first elements) were bound to which HL variables
in QUERY (the second elements) to establish the isomorphism. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 177590) 
  public static final SubLObject find_or_create_problem(SubLObject store, SubLObject query, SubLObject complexP) {
    if ((complexP == UNPROVIDED)) {
      complexP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject problem = find_problem_int(store, query, complexP);
        SubLObject problem_variable_map = thread.secondMultipleValue();
        SubLObject canonical_query = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == problem)) {
          problem = inference_datastructures_problem.new_problem(store, canonical_query);
        }
        return inference_datastructures_problem_link.new_mapped_problem(problem, problem_variable_map);
      }
    }
  }

  /** @see find-problem
returns an additional value:
@return 2 the canonical query extracted from QUERY
@param COMPLEX? booleanp; whether to use the complex problem index as well */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 178508) 
  public static final SubLObject find_problem_int(SubLObject store, SubLObject query, SubLObject complexP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject method = inference_datastructures_problem_store.problem_store_equality_reasoning_method(store);
        SubLObject pcase_var = method;
        if (pcase_var.eql($kw160$EQUAL)) {
          {
            SubLObject problem = inference_datastructures_problem_store.find_problem_by_query(store, query);
            SubLObject problem_variable_map = NIL;
            return Values.values(problem, problem_variable_map, query);
          }
        } else if (pcase_var.eql($kw161$CZER_EQUAL)) {
          thread.resetMultipleValues();
          {
            SubLObject canonical_query = inference_czer.canonicalize_problem_query(query);
            SubLObject canonical_variable_map = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject problem = inference_datastructures_problem_store.find_problem_by_query(store, canonical_query);
              if ((NIL == problem)) {
                if ((NIL != complexP)) {
                  thread.resetMultipleValues();
                  {
                    SubLObject complex_problem = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33146");
                    SubLObject complex_variable_map = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != complex_problem)) {
                      {
                        SubLObject complex_query = inference_datastructures_problem.problem_query(complex_problem);
                        SubLObject final_variable_map = bindings.compose_bindings(complex_variable_map, canonical_variable_map);
                        return Values.values(complex_problem, final_variable_map, complex_query);
                      }
                    }
                  }
                }
              }
              return Values.values(problem, canonical_variable_map, canonical_query);
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Return a problem in STORE whose query is the literals from CONTEXTUALIZED-CLAUSE specified by SUBCLAUSE-SPEC. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 180696) 
  public static final SubLObject find_or_create_problem_from_subclause_spec(SubLObject store, SubLObject contextualized_clause, SubLObject subclause_spec) {
    {
      SubLObject query = inference_datastructures_problem_query.new_problem_query_from_subclause_spec(contextualized_clause, subclause_spec);
      return find_or_create_problem(store, query, UNPROVIDED);
    }
  }

  /** Return a problem in STORE whose query is CONTEXTUALIZED-CLAUSE without the literals specified by SUBCLAUSE-SPEC. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 181061) 
  public static final SubLObject find_or_create_problem_without_subclause_spec(SubLObject store, SubLObject contextualized_clause, SubLObject subclause_spec) {
    {
      SubLObject query_without = inference_datastructures_problem_query.new_problem_query_without_subclause_spec(contextualized_clause, subclause_spec);
      return find_or_create_problem(store, query_without, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 181451) 
  public static final SubLObject find_or_create_root_problem_and_link(SubLObject inference) {
    {
      SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
      SubLObject hl_query = inference_datastructures_inference.inference_hl_query(inference);
      SubLObject mapped_root_problem = find_or_create_root_problem(store, hl_query);
      new_root_answer_link(inference, mapped_root_problem);
      return mapped_root_problem;
    }
  }

  /** Hooks up the answer link between the root subproblem and the strategy, but intentionally
doesn't propagate it yet -- this is part of A-Brain behaviour, not initialization. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 181897) 
  public static final SubLObject new_root_answer_link(SubLObject inference, SubLObject mapped_root_problem) {
    {
      SubLObject link = inference_worker_answer.new_answer_link(inference);
      inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(mapped_root_problem, link);
      {
        SubLObject root_problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_root_problem);
        inference_datastructures_problem_store.add_problem_store_historical_root_problem(inference_datastructures_problem.problem_store(root_problem), root_problem);
      }
      return link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 182457) 
  public static final SubLObject find_or_create_root_problem(SubLObject store, SubLObject query) {
    return find_or_create_problem(store, query, UNPROVIDED);
  }

  /** Whether the problem store prune should be verbose.
Currently only NIL and T are supported. */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 182564) 
  public static SubLSymbol $problem_store_prune_reports$ = null;

  /** to avoid infinite recursion */
  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 186812) 
  private static SubLSymbol $possibly_propagate_problem_indestructible_stack$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 199276) 
  public static final SubLObject possibly_note_eager_pruning_problem(SubLObject problem) {
    return ZERO_INTEGER;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 202123) 
  public static final SubLObject consider_pruning_ramifications_of_ignored_strategem(SubLObject strategy, SubLObject strategem) {
    if (((NIL != inference_worker_removal.conjunctive_removal_tactic_p(strategem))
         && (NIL != inference_datastructures_tactic.tactic_executedP(strategem))
         && (NIL == inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_tactic.tactic_store(strategem))))) {
      {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(strategem);
        if (((NIL != inference_datastructures_problem.tactically_good_problem_p(problem))
             && (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem))
             && (NIL == Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35271"))
             && (NIL == Sequences.find_if($sym49$SPLIT_LINK_P, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35368"), UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35363");
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 202785) 
  private static SubLSymbol $processed_proofs_retain_one_proofP$ = null;

  public static final SubLObject declare_inference_worker_file() {
    declareFunction(myName, "currently_executing_tactic", "CURRENTLY-EXECUTING-TACTIC", 0, 0, false);
    declareMacro(myName, "within_tactic_execution", "WITHIN-TACTIC-EXECUTION");
    declareFunction(myName, "currently_executing_hl_module", "CURRENTLY-EXECUTING-HL-MODULE", 0, 0, false);
    declareFunction(myName, "currently_active_problem", "CURRENTLY-ACTIVE-PROBLEM", 0, 0, false);
    declareMacro(myName, "within_problem_consideration", "WITHIN-PROBLEM-CONSIDERATION");
    declareFunction(myName, "currently_active_problem_query", "CURRENTLY-ACTIVE-PROBLEM-QUERY", 0, 0, false);
    declareMacro(myName, "with_problem_store_tactical_evaluation_properties", "WITH-PROBLEM-STORE-TACTICAL-EVALUATION-PROPERTIES");
    declareFunction(myName, "currently_active_problem_store", "CURRENTLY-ACTIVE-PROBLEM-STORE", 0, 0, false);
    declareFunction(myName, "currently_active_problem_store_creation_time", "CURRENTLY-ACTIVE-PROBLEM-STORE-CREATION-TIME", 0, 0, false);
    declareFunction(myName, "determine_new_tactics", "DETERMINE-NEW-TACTICS", 1, 0, false);
    declareFunction(myName, "determine_new_tactics_for_dnf_clause", "DETERMINE-NEW-TACTICS-FOR-DNF-CLAUSE", 2, 0, false);
    declareFunction(myName, "determine_new_tactics_for_disjunction", "DETERMINE-NEW-TACTICS-FOR-DISJUNCTION", 2, 0, false);
    declareFunction(myName, "determine_new_tactics_for_multiple_literals", "DETERMINE-NEW-TACTICS-FOR-MULTIPLE-LITERALS", 2, 0, false);
    declareFunction(myName, "determine_new_connected_conjunction_tactics", "DETERMINE-NEW-CONNECTED-CONJUNCTION-TACTICS", 2, 0, false);
    declareFunction(myName, "determine_new_tactics_for_literal", "DETERMINE-NEW-TACTICS-FOR-LITERAL", 3, 0, false);
    declareFunction(myName, "possibly_compute_strategic_properties_of_problem_tactics", "POSSIBLY-COMPUTE-STRATEGIC-PROPERTIES-OF-PROBLEM-TACTICS", 2, 0, false);
    declareFunction(myName, "strategy_compute_strategic_properties_of_problem_tactics", "STRATEGY-COMPUTE-STRATEGIC-PROPERTIES-OF-PROBLEM-TACTICS", 2, 0, false);
    declareFunction(myName, "compute_strategic_properties_of_problem_tactics", "COMPUTE-STRATEGIC-PROPERTIES-OF-PROBLEM-TACTICS", 2, 1, false);
    declareFunction(myName, "possibly_compute_strategic_properties_of_tactic", "POSSIBLY-COMPUTE-STRATEGIC-PROPERTIES-OF-TACTIC", 2, 0, false);
    declareFunction(myName, "strategy_chooses_not_to_examine_tacticP", "STRATEGY-CHOOSES-NOT-TO-EXAMINE-TACTIC?", 2, 0, false);
    declareFunction(myName, "default_compute_strategic_properties_of_tactic", "DEFAULT-COMPUTE-STRATEGIC-PROPERTIES-OF-TACTIC", 2, 0, false);
    declareFunction(myName, "execute_tactic", "EXECUTE-TACTIC", 1, 0, false);
    declareFunction(myName, "possibly_execute_tactic", "POSSIBLY-EXECUTE-TACTIC", 1, 0, false);
    declareFunction(myName, "possibly_note_tactic_finished", "POSSIBLY-NOTE-TACTIC-FINISHED", 1, 0, false);
    declareMacro(myName, "within_single_literal_tactic_with_asent_and_mt", "WITHIN-SINGLE-LITERAL-TACTIC-WITH-ASENT-AND-MT");
    declareFunction(myName, "asent_of_currently_executing_tactic", "ASENT-OF-CURRENTLY-EXECUTING-TACTIC", 0, 0, false);
    declareFunction(myName, "mt_of_currently_executing_tactic", "MT-OF-CURRENTLY-EXECUTING-TACTIC", 0, 0, false);
    declareFunction(myName, "single_literal_tactic_p", "SINGLE-LITERAL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "execute_literal_level_tactic", "EXECUTE-LITERAL-LEVEL-TACTIC", 1, 0, false);
    declareFunction(myName, "literal_level_tactic_p", "LITERAL-LEVEL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "execute_multiple_clause_tactic", "EXECUTE-MULTIPLE-CLAUSE-TACTIC", 1, 0, false);
    declareFunction(myName, "execute_multiple_literal_tactic", "EXECUTE-MULTIPLE-LITERAL-TACTIC", 1, 0, false);
    declareFunction(myName, "execute_structural_multiple_literal_tactic", "EXECUTE-STRUCTURAL-MULTIPLE-LITERAL-TACTIC", 1, 0, false);
    declareFunction(myName, "execute_meta_structural_multiple_literal_tactic", "EXECUTE-META-STRUCTURAL-MULTIPLE-LITERAL-TACTIC", 1, 0, false);
    declareFunction(myName, "connected_conjunction_link_p", "CONNECTED-CONJUNCTION-LINK-P", 1, 0, false);
    declareFunction(myName, "connected_conjunction_tactic_p", "CONNECTED-CONJUNCTION-TACTIC-P", 1, 0, false);
    declareFunction(myName, "connected_conjunction_link_tactic", "CONNECTED-CONJUNCTION-LINK-TACTIC", 1, 0, false);
    declareFunction(myName, "connected_conjunction_tactic_link", "CONNECTED-CONJUNCTION-TACTIC-LINK", 1, 0, false);
    declareFunction(myName, "conjunctive_link_p", "CONJUNCTIVE-LINK-P", 1, 0, false);
    declareFunction(myName, "logical_conjunctive_tactic_p", "LOGICAL-CONJUNCTIVE-TACTIC-P", 1, 0, false);
    declareFunction(myName, "conjunctive_tactic_p", "CONJUNCTIVE-TACTIC-P", 1, 0, false);
    declareFunction(myName, "meta_conjunctive_tactic_p", "META-CONJUNCTIVE-TACTIC-P", 1, 0, false);
    declareFunction(myName, "generalized_conjunctive_tactic_p", "GENERALIZED-CONJUNCTIVE-TACTIC-P", 1, 0, false);
    declareFunction(myName, "connected_conjunction_tactic_literal_count", "CONNECTED-CONJUNCTION-TACTIC-LITERAL-COUNT", 1, 0, false);
    declareFunction(myName, "disjunctive_link_p", "DISJUNCTIVE-LINK-P", 1, 0, false);
    declareFunction(myName, "logical_disjunctive_tactic_p", "LOGICAL-DISJUNCTIVE-TACTIC-P", 1, 0, false);
    declareFunction(myName, "disjunctive_tactic_p", "DISJUNCTIVE-TACTIC-P", 1, 0, false);
    declareFunction(myName, "disjunctive_link_tactic", "DISJUNCTIVE-LINK-TACTIC", 1, 0, false);
    declareFunction(myName, "logical_link_p", "LOGICAL-LINK-P", 1, 0, false);
    declareFunction(myName, "logical_tactic_p", "LOGICAL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "logical_link_with_unique_tactic_p", "LOGICAL-LINK-WITH-UNIQUE-TACTIC-P", 1, 0, false);
    declareFunction(myName, "logical_tactic_with_unique_lookahead_problem_p", "LOGICAL-TACTIC-WITH-UNIQUE-LOOKAHEAD-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "logical_link_unique_tactic", "LOGICAL-LINK-UNIQUE-TACTIC", 1, 0, false);
    declareFunction(myName, "logical_tactic_link", "LOGICAL-TACTIC-LINK", 1, 0, false);
    declareFunction(myName, "logical_tactic_lookahead_problem", "LOGICAL-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
    declareFunction(myName, "logical_proof_p", "LOGICAL-PROOF-P", 1, 0, false);
    declareFunction(myName, "structural_link_p", "STRUCTURAL-LINK-P", 1, 0, false);
    declareFunction(myName, "structural_tactic_p", "STRUCTURAL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "meta_structural_tactic_p", "META-STRUCTURAL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "generalized_structural_tactic_p", "GENERALIZED-STRUCTURAL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "structural_tactic_lookahead_problem", "STRUCTURAL-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
    declareFunction(myName, "structural_proof_p", "STRUCTURAL-PROOF-P", 1, 0, false);
    declareFunction(myName, "structural_proof_type", "STRUCTURAL-PROOF-TYPE", 1, 0, false);
    declareFunction(myName, "content_link_p", "CONTENT-LINK-P", 1, 0, false);
    declareFunction(myName, "content_tactic_p", "CONTENT-TACTIC-P", 1, 0, false);
    declareFunction(myName, "content_proof_p", "CONTENT-PROOF-P", 1, 0, false);
    declareFunction(myName, "content_link_supports", "CONTENT-LINK-SUPPORTS", 1, 0, false);
    declareFunction(myName, "content_link_tactic", "CONTENT-LINK-TACTIC", 1, 0, false);
    declareFunction(myName, "content_link_hl_module", "CONTENT-LINK-HL-MODULE", 1, 0, false);
    declareFunction(myName, "content_proof_hl_module", "CONTENT-PROOF-HL-MODULE", 1, 0, false);
    declareFunction(myName, "content_tactic_actual_productivity", "CONTENT-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "removal_tactic_actual_productivity", "REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "single_literal_removal_tactic_actual_productivity", "SINGLE-LITERAL-REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "conjunctive_removal_tactic_actual_productivity", "CONJUNCTIVE-REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "conjunctive_removal_tactic_child_count_via_split_link", "CONJUNCTIVE-REMOVAL-TACTIC-CHILD-COUNT-VIA-SPLIT-LINK", 2, 0, false);
    declareFunction(myName, "transformation_tactic_actual_productivity", "TRANSFORMATION-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "rewrite_tactic_actual_productivity", "REWRITE-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "meta_removal_tactic_actual_productivity", "META-REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "simple_problem_estimated_total_global_productivity", "SIMPLE-PROBLEM-ESTIMATED-TOTAL-GLOBAL-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "estimated_global_productivity_of_problem_possible_tactics", "ESTIMATED-GLOBAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS", 2, 0, false);
    declareFunction(myName, "estimated_generalized_removal_productivity_of_problem_possible_tactics_with_completeness", "ESTIMATED-GENERALIZED-REMOVAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS-WITH-COMPLETENESS", 3, 0, false);
    declareFunction(myName, "estimated_global_structural_productivity_of_problem_possible_tactics_with_preference_level", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS-WITH-PREFERENCE-LEVEL", 3, 0, false);
    declareFunction(myName, "estimated_global_structural_productivity_of_problem_possible_preferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-PREFERRED-TACTICS", 2, 0, false);
    declareFunction(myName, "estimated_global_structural_productivity_of_problem_possible_dispreferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-DISPREFERRED-TACTICS", 2, 0, false);
    declareFunction(myName, "estimated_global_structural_productivity_of_problem_possible_grossly_dispreferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-GROSSLY-DISPREFERRED-TACTICS", 2, 0, false);
    declareFunction(myName, "estimated_global_structural_productivity_of_problem_possible_non_preferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-NON-PREFERRED-TACTICS", 3, 0, false);
    declareFunction(myName, "problem_doomed_due_to_lookahead_removal_completenessP", "PROBLEM-DOOMED-DUE-TO-LOOKAHEAD-REMOVAL-COMPLETENESS?", 2, 0, false);
    declareFunction(myName, "problem_doomed_due_to_removal_completenessP", "PROBLEM-DOOMED-DUE-TO-REMOVAL-COMPLETENESS?", 2, 0, false);
    declareFunction(myName, "problem_structural_preference_level", "PROBLEM-STRUCTURAL-PREFERENCE-LEVEL", 2, 0, false);
    declareFunction(myName, "logical_link_generalized_removal_completeness", "LOGICAL-LINK-GENERALIZED-REMOVAL-COMPLETENESS", 2, 0, false);
    declareFunction(myName, "logical_tactic_generalized_removal_completeness", "LOGICAL-TACTIC-GENERALIZED-REMOVAL-COMPLETENESS", 2, 0, false);
    declareFunction(myName, "problem_generalized_removal_completeness", "PROBLEM-GENERALIZED-REMOVAL-COMPLETENESS", 2, 0, false);
    declareFunction(myName, "problem_preference_level_int", "PROBLEM-PREFERENCE-LEVEL-INT", 3, 0, false);
    declareFunction(myName, "discard_all_other_possible_connected_conjunction_tactics", "DISCARD-ALL-OTHER-POSSIBLE-CONNECTED-CONJUNCTION-TACTICS", 1, 0, false);
    declareFunction(myName, "discard_all_other_possible_structural_conjunctive_tactics", "DISCARD-ALL-OTHER-POSSIBLE-STRUCTURAL-CONJUNCTIVE-TACTICS", 1, 0, false);
    declareFunction(myName, "problem_link_can_have_proofsP", "PROBLEM-LINK-CAN-HAVE-PROOFS?", 1, 0, false);
    declareFunction(myName, "intermediate_proof_step_valid_memoizedP_internal", "INTERMEDIATE-PROOF-STEP-VALID-MEMOIZED?-INTERNAL", 3, 0, false);
    declareFunction(myName, "intermediate_proof_step_valid_memoizedP", "INTERMEDIATE-PROOF-STEP-VALID-MEMOIZED?", 3, 0, false);
    declareFunction(myName, "intermediate_proof_step_validP", "INTERMEDIATE-PROOF-STEP-VALID?", 3, 0, false);
    declareFunction(myName, "intermediate_proof_validP", "INTERMEDIATE-PROOF-VALID?", 1, 0, false);
    declareFunction(myName, "intermediate_proof_valid_intP", "INTERMEDIATE-PROOF-VALID-INT?", 2, 0, false);
    declareFunction(myName, "intermediate_proof_asent_validP", "INTERMEDIATE-PROOF-ASENT-VALID?", 4, 0, false);
    declareFunction(myName, "intermediate_proof_valid_due_to_structureP", "INTERMEDIATE-PROOF-VALID-DUE-TO-STRUCTURE?", 1, 0, false);
    declareFunction(myName, "intermediate_proof_supports_validP", "INTERMEDIATE-PROOF-SUPPORTS-VALID?", 2, 0, false);
    declareFunction(myName, "intermediate_proof_content_link_validP", "INTERMEDIATE-PROOF-CONTENT-LINK-VALID?", 1, 0, false);
    declareFunction(myName, "propose_new_proof_with_bindings", "PROPOSE-NEW-PROOF-WITH-BINDINGS", 3, 0, false);
    declareFunction(myName, "proof_propagate_non_explananatory_subproofs", "PROOF-PROPAGATE-NON-EXPLANANATORY-SUBPROOFS", 1, 0, false);
    declareFunction(myName, "proof_circularP", "PROOF-CIRCULAR?", 1, 0, false);
    declareFunction(myName, "proof_circular_wrtP", "PROOF-CIRCULAR-WRT?", 3, 0, false);
    declareFunction(myName, "proofs_share_problem_and_bindingsP", "PROOFS-SHARE-PROBLEM-AND-BINDINGS?", 2, 0, false);
    declareFunction(myName, "proofs_share_problem_and_bindings_and_direct_supportsP", "PROOFS-SHARE-PROBLEM-AND-BINDINGS-AND-DIRECT-SUPPORTS?", 2, 0, false);
    declareFunction(myName, "reject_proof_due_to_circularity", "REJECT-PROOF-DUE-TO-CIRCULARITY", 1, 0, false);
    declareFunction(myName, "reject_proof_due_to_ill_formedness", "REJECT-PROOF-DUE-TO-ILL-FORMEDNESS", 1, 0, false);
    declareFunction(myName, "reject_proof_due_to_non_abducible_rule", "REJECT-PROOF-DUE-TO-NON-ABDUCIBLE-RULE", 1, 0, false);
    declareFunction(myName, "reject_proof_due_to_modus_tollens_with_non_wff", "REJECT-PROOF-DUE-TO-MODUS-TOLLENS-WITH-NON-WFF", 1, 0, false);
    declareFunction(myName, "reject_proof", "REJECT-PROOF", 2, 0, false);
    declareFunction(myName, "propagate_proof_rejected", "PROPAGATE-PROOF-REJECTED", 1, 0, false);
    declareFunction(myName, "proof_note_proven_query_no_good_due_to_ill_formedness", "PROOF-NOTE-PROVEN-QUERY-NO-GOOD-DUE-TO-ILL-FORMEDNESS", 1, 0, false);
    declareFunction(myName, "problem_force_no_goodness", "PROBLEM-FORCE-NO-GOODNESS", 1, 0, false);
    declareFunction(myName, "possibly_note_proof_processed", "POSSIBLY-NOTE-PROOF-PROCESSED", 1, 0, false);
    declareFunction(myName, "possibly_note_proof_processed_int", "POSSIBLY-NOTE-PROOF-PROCESSED-INT", 1, 0, false);
    declareFunction(myName, "consider_that_subproofs_may_be_unprocessed", "CONSIDER-THAT-SUBPROOFS-MAY-BE-UNPROCESSED", 1, 0, false);
    declareFunction(myName, "all_dependent_proofs_are_processedP", "ALL-DEPENDENT-PROOFS-ARE-PROCESSED?", 1, 0, false);
    declareFunction(myName, "find_proof", "FIND-PROOF", 3, 0, false);
    declareFunction(myName, "conjunctive_proof_subsumes_conjunctive_proof_specP", "CONJUNCTIVE-PROOF-SUBSUMES-CONJUNCTIVE-PROOF-SPEC?", 4, 0, false);
    declareFunction(myName, "connected_conjunction_proof_subsumes_connected_conjunction_proof_specP", "CONNECTED-CONJUNCTION-PROOF-SUBSUMES-CONNECTED-CONJUNCTION-PROOF-SPEC?", 4, 0, false);
    declareFunction(myName, "split_proof_subsumes_split_proof_specP", "SPLIT-PROOF-SUBSUMES-SPLIT-PROOF-SPEC?", 4, 0, false);
    declareFunction(myName, "residual_transformation_proof_subsumes_conjunctive_proof_specP", "RESIDUAL-TRANSFORMATION-PROOF-SUBSUMES-CONJUNCTIVE-PROOF-SPEC?", 4, 0, false);
    declareFunction(myName, "residual_transformation_proof_subsumes_conjunctive_proof_specP_int", "RESIDUAL-TRANSFORMATION-PROOF-SUBSUMES-CONJUNCTIVE-PROOF-SPEC?-INT", 4, 0, false);
    declareFunction(myName, "new_goal_proof", "NEW-GOAL-PROOF", 1, 0, false);
    declareFunction(myName, "proof_proven_query", "PROOF-PROVEN-QUERY", 1, 0, false);
    declareFunction(myName, "proof_proven_sentence", "PROOF-PROVEN-SENTENCE", 1, 0, false);
    declareFunction(myName, "proof_bindings_from_constituents", "PROOF-BINDINGS-FROM-CONSTITUENTS", 3, 0, false);
    declareFunction(myName, "ncanonicalize_proof_bindings_int", "NCANONICALIZE-PROOF-BINDINGS-INT", 1, 0, false);
    declareFunction(myName, "ncanonicalize_proof_bindings", "NCANONICALIZE-PROOF-BINDINGS", 1, 0, false);
    declareFunction(myName, "canonicalize_proof_bindings", "CANONICALIZE-PROOF-BINDINGS", 1, 0, false);
    declareFunction(myName, "proof_bindings_canonicalP", "PROOF-BINDINGS-CANONICAL?", 1, 0, false);
    declareFunction(myName, "proof_bindings_canonicalP_recursive", "PROOF-BINDINGS-CANONICAL?-RECURSIVE", 2, 0, false);
    declareFunction(myName, "proof_bindings_equalP", "PROOF-BINDINGS-EQUAL?", 2, 0, false);
    declareFunction(myName, "unify_all_equal_bindings", "UNIFY-ALL-EQUAL-BINDINGS", 1, 0, false);
    declareFunction(myName, "two_values_in_bindings_with_same_variable", "TWO-VALUES-IN-BINDINGS-WITH-SAME-VARIABLE", 2, 0, false);
    declareFunction(myName, "all_bindings_ground_outP", "ALL-BINDINGS-GROUND-OUT?", 1, 0, false);
    declareFunction(myName, "binding_ground_outP", "BINDING-GROUND-OUT?", 1, 0, false);
    declareFunction(myName, "bubble_up_proof", "BUBBLE-UP-PROOF", 1, 0, false);
    declareFunction(myName, "bubble_up_proof_from_problem", "BUBBLE-UP-PROOF-FROM-PROBLEM", 2, 0, false);
    declareFunction(myName, "bubble_up_proof_to_link", "BUBBLE-UP-PROOF-TO-LINK", 2, 0, false);
    declareFunction(myName, "bubble_up_proof_to_link_via_mapped_problem", "BUBBLE-UP-PROOF-TO-LINK-VIA-MAPPED-PROBLEM", 3, 0, false);
    declareFunction(myName, "bubble_up_proof_to_link_via_variable_map", "BUBBLE-UP-PROOF-TO-LINK-VIA-VARIABLE-MAP", 3, 0, false);
    declareFunction(myName, "perform_lazy_proof_rejection", "PERFORM-LAZY-PROOF-REJECTION", 2, 0, false);
    declareFunction(myName, "proof_consistent_with_mt_assumptionsP", "PROOF-CONSISTENT-WITH-MT-ASSUMPTIONS?", 1, 0, false);
    declareFunction(myName, "within_abnormality_checkingP", "WITHIN-ABNORMALITY-CHECKING?", 0, 0, false);
    declareFunction(myName, "reject_abnormal_subproofs", "REJECT-ABNORMAL-SUBPROOFS", 1, 0, false);
    declareFunction(myName, "reject_proof_due_to_abnormality", "REJECT-PROOF-DUE-TO-ABNORMALITY", 1, 0, false);
    declareFunction(myName, "inference_proof_non_explanatory_subproofs", "INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
    declareFunction(myName, "cached_inference_proof_non_explanatory_subproofs_internal", "CACHED-INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS-INTERNAL", 2, 0, false);
    declareFunction(myName, "cached_inference_proof_non_explanatory_subproofs", "CACHED-INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
    declareFunction(myName, "proof_non_explanatory_subproofs", "PROOF-NON-EXPLANATORY-SUBPROOFS", 1, 0, false);
    declareFunction(myName, "compute_generalized_transformation_proof_non_explanatory_subproofs", "COMPUTE-GENERALIZED-TRANSFORMATION-PROOF-NON-EXPLANATORY-SUBPROOFS", 1, 0, false);
    declareFunction(myName, "inference_proof_proven_non_explanatory_subquery", "INFERENCE-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
    declareFunction(myName, "generalized_transformation_proof_proven_non_explanatory_subquery", "GENERALIZED-TRANSFORMATION-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
    declareFunction(myName, "transformation_proof_proven_non_explanatory_subquery", "TRANSFORMATION-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
    declareFunction(myName, "residual_transformation_proof_proven_non_explanatory_subquery", "RESIDUAL-TRANSFORMATION-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
    declareFunction(myName, "compute_non_explanatory_subproofs", "COMPUTE-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
    declareFunction(myName, "non_explanatory_subproofs_recursive", "NON-EXPLANATORY-SUBPROOFS-RECURSIVE", 3, 0, false);
    declareFunction(myName, "non_explanatory_proofP", "NON-EXPLANATORY-PROOF?", 2, 0, false);
    declareFunction(myName, "non_explanatory_asentP", "NON-EXPLANATORY-ASENT?", 3, 0, false);
    declareFunction(myName, "explanatory_asentP", "EXPLANATORY-ASENT?", 3, 0, false);
    declareFunction(myName, "note_tactic_finished", "NOTE-TACTIC-FINISHED", 1, 0, false);
    declareFunction(myName, "consider_strategic_ramifications_of_possibly_executed_tactic", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-POSSIBLY-EXECUTED-TACTIC", 2, 0, false);
    declareFunction(myName, "consider_strategic_ramifications_of_executed_tactic", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-EXECUTED-TACTIC", 2, 0, false);
    declareFunction(myName, "note_problem_created", "NOTE-PROBLEM-CREATED", 1, 0, false);
    declareFunction(myName, "possibly_reactivate_problem", "POSSIBLY-REACTIVATE-PROBLEM", 2, 0, false);
    declareFunction(myName, "possibly_activate_problem", "POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
    declareFunction(myName, "determine_strategic_status_wrt", "DETERMINE-STRATEGIC-STATUS-WRT", 2, 0, false);
    declareFunction(myName, "note_problem_examined", "NOTE-PROBLEM-EXAMINED", 1, 0, false);
    declareFunction(myName, "possibly_note_problem_strategically_examined", "POSSIBLY-NOTE-PROBLEM-STRATEGICALLY-EXAMINED", 2, 0, false);
    declareFunction(myName, "note_problem_possible", "NOTE-PROBLEM-POSSIBLE", 1, 0, false);
    declareFunction(myName, "possibly_note_problem_strategically_possible", "POSSIBLY-NOTE-PROBLEM-STRATEGICALLY-POSSIBLE", 2, 0, false);
    declareFunction(myName, "note_problem_strategically_unexamined", "NOTE-PROBLEM-STRATEGICALLY-UNEXAMINED", 2, 0, false);
    declareFunction(myName, "note_problem_strategically_possible", "NOTE-PROBLEM-STRATEGICALLY-POSSIBLE", 2, 0, false);
    declareFunction(myName, "possibly_note_problem_pending", "POSSIBLY-NOTE-PROBLEM-PENDING", 2, 0, false);
    declareFunction(myName, "note_problem_pending", "NOTE-PROBLEM-PENDING", 2, 0, false);
    declareFunction(myName, "possibly_note_problem_finished", "POSSIBLY-NOTE-PROBLEM-FINISHED", 2, 0, false);
    declareFunction(myName, "note_problem_finished", "NOTE-PROBLEM-FINISHED", 2, 0, false);
    declareFunction(myName, "consider_ramifications_of_problem_finished", "CONSIDER-RAMIFICATIONS-OF-PROBLEM-FINISHED", 2, 0, false);
    declareFunction(myName, "possibly_propagate_problem_finished", "POSSIBLY-PROPAGATE-PROBLEM-FINISHED", 2, 0, false);
    declareFunction(myName, "strategy_note_problem_finished", "STRATEGY-NOTE-PROBLEM-FINISHED", 2, 0, false);
    declareFunction(myName, "note_argument_link_added", "NOTE-ARGUMENT-LINK-ADDED", 1, 0, false);
    declareFunction(myName, "note_goal_link_added", "NOTE-GOAL-LINK-ADDED", 1, 0, false);
    declareFunction(myName, "strategic_context_p", "STRATEGIC-CONTEXT-P", 1, 0, false);
    declareFunction(myName, "strategic_context_suid", "STRATEGIC-CONTEXT-SUID", 1, 0, false);
    declareFunction(myName, "find_strategic_context_by_id", "FIND-STRATEGIC-CONTEXT-BY-ID", 2, 0, false);
    declareFunction(myName, "find_strategic_context_by_ids", "FIND-STRATEGIC-CONTEXT-BY-IDS", 2, 0, false);
    declareFunction(myName, "no_good_problem_p", "NO-GOOD-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "neutral_problem_p", "NEUTRAL-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "good_problem_p", "GOOD-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "examined_problem_p", "EXAMINED-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "possible_problem_p", "POSSIBLE-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "pending_problem_p", "PENDING-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "finished_problem_p", "FINISHED-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "potentially_possible_problem_p", "POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "not_potentially_possible_problem_p", "NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "totally_finished_problem_p", "TOTALLY-FINISHED-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "propagate_problem_link", "PROPAGATE-PROBLEM-LINK", 1, 0, false);
    declareFunction(myName, "propagate_proofs", "PROPAGATE-PROOFS", 1, 0, false);
    declareFunction(myName, "repropagate_newly_opened_link", "REPROPAGATE-NEWLY-OPENED-LINK", 2, 0, false);
    declareFunction(myName, "problem_link_open_and_repropagate_sole_supporting_mapped_problem", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "problem_link_open_and_repropagate_index", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-INDEX", 2, 0, false);
    declareFunction(myName, "problem_link_open_and_repropagate_supporting_mapped_problem", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
    declareFunction(myName, "problem_link_open_and_repropagate_all", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-ALL", 1, 0, false);
    declareFunction(myName, "propagate_answer_link", "PROPAGATE-ANSWER-LINK", 1, 0, false);
    declareFunction(myName, "possibly_propagate_answer_link", "POSSIBLY-PROPAGATE-ANSWER-LINK", 1, 0, false);
    declareFunction(myName, "propagate_proof_to_inference", "PROPAGATE-PROOF-TO-INFERENCE", 2, 0, false);
    declareFunction(myName, "consider_closing_answer_link", "CONSIDER-CLOSING-ANSWER-LINK", 1, 0, false);
    declareFunction(myName, "inference_deems_answer_link_should_be_closedP", "INFERENCE-DEEMS-ANSWER-LINK-SHOULD-BE-CLOSED?", 2, 0, false);
    declareFunction(myName, "close_answer_link", "CLOSE-ANSWER-LINK", 1, 0, false);
    declareFunction(myName, "proof_tree_validP", "PROOF-TREE-VALID?", 1, 0, false);
    declareFunction(myName, "recursive_proof_tree_validP", "RECURSIVE-PROOF-TREE-VALID?", 1, 0, false);
    declareFunction(myName, "depth_L", "DEPTH-<", 2, 0, false);
    declareFunction(myName, "depth_LE", "DEPTH-<=", 2, 0, false);
    declareFunction(myName, "propagate_min_proof_depth_via_link", "PROPAGATE-MIN-PROOF-DEPTH-VIA-LINK", 1, 0, false);
    declareFunction(myName, "propagate_min_proof_depth_via_link_wrt_inference", "PROPAGATE-MIN-PROOF-DEPTH-VIA-LINK-WRT-INFERENCE", 2, 0, false);
    declareFunction(myName, "proof_depth_L", "PROOF-DEPTH-<", 2, 0, false);
    declareFunction(myName, "problem_strictly_within_max_proof_depthP", "PROBLEM-STRICTLY-WITHIN-MAX-PROOF-DEPTH?", 2, 0, false);
    declareFunction(myName, "propagate_min_transformation_depth_via_link", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-VIA-LINK", 1, 0, false);
    declareFunction(myName, "propagate_min_transformation_depth_via_link_wrt_inference", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-VIA-LINK-WRT-INFERENCE", 2, 0, false);
    declareFunction(myName, "clear_uninterestingness_cache_wrt_transformation", "CLEAR-UNINTERESTINGNESS-CACHE-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "transformation_depth_L", "TRANSFORMATION-DEPTH-<", 2, 0, false);
    declareFunction(myName, "transformation_depth_LE", "TRANSFORMATION-DEPTH-<=", 2, 0, false);
    declareFunction(myName, "problem_strictly_within_max_transformation_depthP", "PROBLEM-STRICTLY-WITHIN-MAX-TRANSFORMATION-DEPTH?", 2, 0, false);
    declareFunction(myName, "problem_transformation_allowed_wrt_max_transformation_depthP", "PROBLEM-TRANSFORMATION-ALLOWED-WRT-MAX-TRANSFORMATION-DEPTH?", 2, 0, false);
    declareFunction(myName, "logical_tactic_transformation_allowed_wrt_max_transformation_depthP", "LOGICAL-TACTIC-TRANSFORMATION-ALLOWED-WRT-MAX-TRANSFORMATION-DEPTH?", 2, 0, false);
    declareFunction(myName, "transformation_depth_increment", "TRANSFORMATION-DEPTH-INCREMENT", 2, 0, false);
    declareFunction(myName, "problem_has_been_transformedP", "PROBLEM-HAS-BEEN-TRANSFORMED?", 2, 0, false);
    declareFunction(myName, "propagate_strategy_activity", "PROPAGATE-STRATEGY-ACTIVITY", 1, 0, false);
    declareFunction(myName, "maybe_possibly_activate_problem", "MAYBE-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
    declareFunction(myName, "link_permits_activity_propagationP", "LINK-PERMITS-ACTIVITY-PROPAGATION?", 2, 0, false);
    declareFunction(myName, "propagate_inference_relevance", "PROPAGATE-INFERENCE-RELEVANCE", 1, 0, false);
    declareFunction(myName, "propagate_relevance_to_supporting_problem", "PROPAGATE-RELEVANCE-TO-SUPPORTING-PROBLEM", 2, 0, false);
    declareFunction(myName, "possibly_note_problem_relevant", "POSSIBLY-NOTE-PROBLEM-RELEVANT", 2, 0, false);
    declareFunction(myName, "link_permits_relevance_propagationP", "LINK-PERMITS-RELEVANCE-PROPAGATION?", 2, 0, false);
    declareFunction(myName, "link_permits_proof_propagationP", "LINK-PERMITS-PROOF-PROPAGATION?", 2, 0, false);
    declareFunction(myName, "consider_that_mapped_problem_could_be_irrelevant", "CONSIDER-THAT-MAPPED-PROBLEM-COULD-BE-IRRELEVANT", 2, 0, false);
    declareFunction(myName, "consider_that_problem_could_be_irrelevant_to_inference", "CONSIDER-THAT-PROBLEM-COULD-BE-IRRELEVANT-TO-INFERENCE", 2, 0, false);
    declareFunction(myName, "problem_irrelevant_to_inferenceP", "PROBLEM-IRRELEVANT-TO-INFERENCE?", 2, 0, false);
    declareFunction(myName, "maybe_make_problem_irrelevant_to_inference", "MAYBE-MAKE-PROBLEM-IRRELEVANT-TO-INFERENCE", 2, 0, false);
    declareFunction(myName, "make_problem_irrelevant_to_inference", "MAKE-PROBLEM-IRRELEVANT-TO-INFERENCE", 2, 0, false);
    declareFunction(myName, "propagate_inference_irrelevance", "PROPAGATE-INFERENCE-IRRELEVANCE", 2, 0, false);
    declareFunction(myName, "problem_raw_tactical_or_strategic_status", "PROBLEM-RAW-TACTICAL-OR-STRATEGIC-STATUS", 2, 0, false);
    declareFunction(myName, "set_problem_raw_tactical_or_strategic_status", "SET-PROBLEM-RAW-TACTICAL-OR-STRATEGIC-STATUS", 3, 0, false);
    declareFunction(myName, "change_and_propagate_problem_status", "CHANGE-AND-PROPAGATE-PROBLEM-STATUS", 4, 0, false);
    declareFunction(myName, "prohibited_problem_status_change_error", "PROHIBITED-PROBLEM-STATUS-CHANGE-ERROR", 3, 0, false);
    declareFunction(myName, "consider_that_problem_could_be_good", "CONSIDER-THAT-PROBLEM-COULD-BE-GOOD", 1, 0, false);
    declareFunction(myName, "problem_goodP", "PROBLEM-GOOD?", 1, 0, false);
    declareFunction(myName, "good_version_of_problem_status", "GOOD-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
    declareFunction(myName, "unexamined_version_of_problem_status", "UNEXAMINED-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
    declareFunction(myName, "examined_version_of_problem_status", "EXAMINED-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
    declareFunction(myName, "possible_version_of_problem_status", "POSSIBLE-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
    declareFunction(myName, "pending_version_of_problem_status", "PENDING-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
    declareFunction(myName, "finished_version_of_problem_status", "FINISHED-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
    declareFunction(myName, "consider_that_problem_could_no_longer_be_good", "CONSIDER-THAT-PROBLEM-COULD-NO-LONGER-BE-GOOD", 1, 0, false);
    declareFunction(myName, "neutral_version_of_problem_status", "NEUTRAL-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
    declareFunction(myName, "consider_that_problem_could_be_finished", "CONSIDER-THAT-PROBLEM-COULD-BE-FINISHED", 4, 0, false);
    declareFunction(myName, "problem_could_be_finishedP", "PROBLEM-COULD-BE-FINISHED?", 4, 0, false);
    declareFunction(myName, "problem_link_could_be_finishedP", "PROBLEM-LINK-COULD-BE-FINISHED?", 3, 0, false);
    declareFunction(myName, "split_link_could_be_finishedP", "SPLIT-LINK-COULD-BE-FINISHED?", 2, 0, false);
    declareFunction(myName, "join_link_could_be_finishedP", "JOIN-LINK-COULD-BE-FINISHED?", 2, 0, false);
    declareFunction(myName, "union_link_could_be_finishedP", "UNION-LINK-COULD-BE-FINISHED?", 2, 0, false);
    declareFunction(myName, "consider_that_problem_could_be_no_good", "CONSIDER-THAT-PROBLEM-COULD-BE-NO-GOOD", 4, 0, false);
    declareFunction(myName, "default_consider_that_problem_could_be_no_good", "DEFAULT-CONSIDER-THAT-PROBLEM-COULD-BE-NO-GOOD", 4, 0, false);
    declareFunction(myName, "make_problem_no_good", "MAKE-PROBLEM-NO-GOOD", 3, 0, false);
    declareFunction(myName, "discard_all_possible_tactics", "DISCARD-ALL-POSSIBLE-TACTICS", 1, 0, false);
    declareFunction(myName, "discard_all_impossible_possible_tactics", "DISCARD-ALL-IMPOSSIBLE-POSSIBLE-TACTICS", 1, 0, false);
    declareFunction(myName, "discard_possible_tactics_int", "DISCARD-POSSIBLE-TACTICS-INT", 6, 0, false);
    declareFunction(myName, "consider_that_problem_could_be_strategically_pending", "CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 1, 0, false);
    declareFunction(myName, "consider_that_problem_could_be_strategically_pending_wrt", "CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING-WRT", 2, 0, false);
    declareFunction(myName, "consider_that_supported_problems_could_be_no_good", "CONSIDER-THAT-SUPPORTED-PROBLEMS-COULD-BE-NO-GOOD", 3, 0, false);
    declareFunction(myName, "no_good_version_of_problem_status", "NO-GOOD-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
    declareFunction(myName, "problem_no_goodP", "PROBLEM-NO-GOOD?", 4, 0, false);
    declareFunction(myName, "unsatisfiable_problemP", "UNSATISFIABLE-PROBLEM?", 4, 0, false);
    declareFunction(myName, "all_no_good_simplification_linksP", "ALL-NO-GOOD-SIMPLIFICATION-LINKS?", 4, 0, false);
    declareFunction(myName, "problem_has_some_open_obviously_neutral_argument_linkP", "PROBLEM-HAS-SOME-OPEN-OBVIOUSLY-NEUTRAL-ARGUMENT-LINK?", 4, 0, false);
    declareFunction(myName, "some_no_good_split_argument_linkP", "SOME-NO-GOOD-SPLIT-ARGUMENT-LINK?", 4, 0, false);
    declareFunction(myName, "some_no_good_join_ordered_argument_linkP", "SOME-NO-GOOD-JOIN-ORDERED-ARGUMENT-LINK?", 4, 0, false);
    declareFunction(myName, "some_no_good_join_argument_linkP", "SOME-NO-GOOD-JOIN-ARGUMENT-LINK?", 4, 0, false);
    declareFunction(myName, "all_no_good_union_argument_linksP", "ALL-NO-GOOD-UNION-ARGUMENT-LINKS?", 4, 0, false);
    declareFunction(myName, "problem_link_no_goodP", "PROBLEM-LINK-NO-GOOD?", 4, 0, false);
    declareFunction(myName, "problem_no_good_ignoring_transformation_tacticsP", "PROBLEM-NO-GOOD-IGNORING-TRANSFORMATION-TACTICS?", 2, 0, false);
    declareFunction(myName, "problem_link_has_some_open_obviously_neutral_supporting_mapped_problemP", "PROBLEM-LINK-HAS-SOME-OPEN-OBVIOUSLY-NEUTRAL-SUPPORTING-MAPPED-PROBLEM?", 2, 0, false);
    declareFunction(myName, "problem_link_has_some_open_obviously_good_supporting_mapped_problemP", "PROBLEM-LINK-HAS-SOME-OPEN-OBVIOUSLY-GOOD-SUPPORTING-MAPPED-PROBLEM?", 1, 0, false);
    declareFunction(myName, "problem_link_interesting_when_considered_deepP", "PROBLEM-LINK-INTERESTING-WHEN-CONSIDERED-DEEP?", 1, 0, false);
    declareFunction(myName, "problem_link_no_good_wrt_dependent_join_ordered_linkP", "PROBLEM-LINK-NO-GOOD-WRT-DEPENDENT-JOIN-ORDERED-LINK?", 4, 0, false);
    declareFunction(myName, "restricted_focal_problem_has_a_no_good_restricted_non_focal_analogueP", "RESTRICTED-FOCAL-PROBLEM-HAS-A-NO-GOOD-RESTRICTED-NON-FOCAL-ANALOGUE?", 2, 0, false);
    declareFunction(myName, "link_permits_no_good_propagation_to_supported_problemsP", "LINK-PERMITS-NO-GOOD-PROPAGATION-TO-SUPPORTED-PROBLEMS?", 1, 0, false);
    declareFunction(myName, "propagate_proof_spec_via_answer_link", "PROPAGATE-PROOF-SPEC-VIA-ANSWER-LINK", 1, 0, false);
    declareFunction(myName, "propagate_proof_spec", "PROPAGATE-PROOF-SPEC", 1, 0, false);
    declareFunction(myName, "problem_has_some_proof_spec_to_propagateP", "PROBLEM-HAS-SOME-PROOF-SPEC-TO-PROPAGATE?", 1, 0, false);
    declareFunction(myName, "propagate_proof_spec_to_supporting_problem_via_link", "PROPAGATE-PROOF-SPEC-TO-SUPPORTING-PROBLEM-VIA-LINK", 3, 0, false);
    declareMacro(myName, "with_proof_spec_of_appropriate_type", "WITH-PROOF-SPEC-OF-APPROPRIATE-TYPE");
    declareFunction(myName, "strategy_propagate_proof_spec_to_supporting_problem_via_link", "STRATEGY-PROPAGATE-PROOF-SPEC-TO-SUPPORTING-PROBLEM-VIA-LINK", 4, 0, false);
    declareFunction(myName, "link_permits_proof_spec_propagationP", "LINK-PERMITS-PROOF-SPEC-PROPAGATION?", 2, 0, false);
    declareFunction(myName, "proof_spec_of_appropriate_typeP", "PROOF-SPEC-OF-APPROPRIATE-TYPE?", 2, 0, false);
    declareFunction(myName, "strategy_propagate_problem_proof_spec", "STRATEGY-PROPAGATE-PROBLEM-PROOF-SPEC", 3, 0, false);
    declareFunction(myName, "propagate_join_ordered_proof_spec_via_join_ordered_link", "PROPAGATE-JOIN-ORDERED-PROOF-SPEC-VIA-JOIN-ORDERED-LINK", 4, 0, false);
    declareFunction(myName, "propagate_join_ordered_proof_spec_via_join_ordered_link_int", "PROPAGATE-JOIN-ORDERED-PROOF-SPEC-VIA-JOIN-ORDERED-LINK-INT", 4, 0, false);
    declareFunction(myName, "propagate_proof_spec_via_union_link", "PROPAGATE-PROOF-SPEC-VIA-UNION-LINK", 4, 0, false);
    declareFunction(myName, "propagate_residual_transformation_proof_spec_via_join_ordered_link", "PROPAGATE-RESIDUAL-TRANSFORMATION-PROOF-SPEC-VIA-JOIN-ORDERED-LINK", 4, 0, false);
    declareFunction(myName, "propagate_residual_transformation_proof_spec_via_join_ordered_link_int", "PROPAGATE-RESIDUAL-TRANSFORMATION-PROOF-SPEC-VIA-JOIN-ORDERED-LINK-INT", 4, 0, false);
    declareFunction(myName, "propagate_proof_spec_via_restriction_link", "PROPAGATE-PROOF-SPEC-VIA-RESTRICTION-LINK", 4, 0, false);
    declareFunction(myName, "propagate_proof_spec_via_split_link", "PROPAGATE-PROOF-SPEC-VIA-SPLIT-LINK", 4, 0, false);
    declareFunction(myName, "propagate_proof_spec_via_join_link", "PROPAGATE-PROOF-SPEC-VIA-JOIN-LINK", 4, 0, false);
    declareFunction(myName, "propagate_proof_spec_via_conjunctive_link", "PROPAGATE-PROOF-SPEC-VIA-CONJUNCTIVE-LINK", 4, 0, false);
    declareFunction(myName, "propagate_proof_spec_via_simplification_link", "PROPAGATE-PROOF-SPEC-VIA-SIMPLIFICATION-LINK", 4, 0, false);
    declareFunction(myName, "propagate_proof_spec_via_transformation_link", "PROPAGATE-PROOF-SPEC-VIA-TRANSFORMATION-LINK", 4, 0, false);
    declareFunction(myName, "propagate_transformation_proof_spec_via_transformation_link", "PROPAGATE-TRANSFORMATION-PROOF-SPEC-VIA-TRANSFORMATION-LINK", 4, 0, false);
    declareFunction(myName, "propagate_proof_spec_via_residual_transformation_link", "PROPAGATE-PROOF-SPEC-VIA-RESIDUAL-TRANSFORMATION-LINK", 4, 0, false);
    declareFunction(myName, "propagate_residual_transformation_proof_spec_via_residual_transformation_link", "PROPAGATE-RESIDUAL-TRANSFORMATION-PROOF-SPEC-VIA-RESIDUAL-TRANSFORMATION-LINK", 4, 0, false);
    declareFunction(myName, "find_problem", "FIND-PROBLEM", 2, 0, false);
    declareFunction(myName, "find_or_create_problem", "FIND-OR-CREATE-PROBLEM", 2, 1, false);
    declareFunction(myName, "find_problem_int", "FIND-PROBLEM-INT", 3, 0, false);
    declareFunction(myName, "find_or_create_problem_from_contextualized_asent_sense", "FIND-OR-CREATE-PROBLEM-FROM-CONTEXTUALIZED-ASENT-SENSE", 3, 0, false);
    declareFunction(myName, "find_or_create_problem_from_contextualized_clause", "FIND-OR-CREATE-PROBLEM-FROM-CONTEXTUALIZED-CLAUSE", 2, 0, false);
    declareFunction(myName, "find_or_create_problem_from_subclause_spec", "FIND-OR-CREATE-PROBLEM-FROM-SUBCLAUSE-SPEC", 3, 0, false);
    declareFunction(myName, "find_or_create_problem_without_subclause_spec", "FIND-OR-CREATE-PROBLEM-WITHOUT-SUBCLAUSE-SPEC", 3, 0, false);
    declareFunction(myName, "find_or_create_root_problem_and_link", "FIND-OR-CREATE-ROOT-PROBLEM-AND-LINK", 1, 0, false);
    declareFunction(myName, "new_root_answer_link", "NEW-ROOT-ANSWER-LINK", 2, 0, false);
    declareFunction(myName, "find_or_create_root_problem", "FIND-OR-CREATE-ROOT-PROBLEM", 2, 0, false);
    declareFunction(myName, "prune_problem_store", "PRUNE-PROBLEM-STORE", 1, 1, false);
    declareFunction(myName, "destroy_destructible_problems", "DESTROY-DESTRUCTIBLE-PROBLEMS", 1, 0, false);
    declareFunction(myName, "recompute_destructible_problems", "RECOMPUTE-DESTRUCTIBLE-PROBLEMS", 1, 1, false);
    declareFunction(myName, "consider_deep_no_goodness", "CONSIDER-DEEP-NO-GOODNESS", 1, 0, false);
    declareFunction(myName, "compute_problem_store_min_depth_index", "COMPUTE-PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
    declareFunction(myName, "compute_indestructible_problems_from_inferences", "COMPUTE-INDESTRUCTIBLE-PROBLEMS-FROM-INFERENCES", 1, 0, false);
    declareFunction(myName, "possibly_propagate_problem_indestructible", "POSSIBLY-PROPAGATE-PROBLEM-INDESTRUCTIBLE", 1, 0, false);
    declareFunction(myName, "possibly_propagate_problem_indestructible_int", "POSSIBLY-PROPAGATE-PROBLEM-INDESTRUCTIBLE-INT", 1, 0, false);
    declareFunction(myName, "possibly_note_problem_indestructible", "POSSIBLY-NOTE-PROBLEM-INDESTRUCTIBLE", 1, 0, false);
    declareFunction(myName, "compute_problem_link_destructibleP", "COMPUTE-PROBLEM-LINK-DESTRUCTIBLE?", 1, 0, false);
    declareFunction(myName, "problem_link_closed_foreverP", "PROBLEM-LINK-CLOSED-FOREVER?", 1, 0, false);
    declareFunction(myName, "problem_link_closed_forever_wrt_supporting_mapped_problemP", "PROBLEM-LINK-CLOSED-FOREVER-WRT-SUPPORTING-MAPPED-PROBLEM?", 2, 0, false);
    declareFunction(myName, "problem_should_be_indestructibleP", "PROBLEM-SHOULD-BE-INDESTRUCTIBLE?", 1, 0, false);
    declareFunction(myName, "problem_store_janitor_destructible_problem_list", "PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEM-LIST", 1, 0, false);
    declareFunction(myName, "note_all_root_problems_indestructible", "NOTE-ALL-ROOT-PROBLEMS-INDESTRUCTIBLE", 1, 0, false);
    declareFunction(myName, "compute_indestructible_problems_due_to_proofs", "COMPUTE-INDESTRUCTIBLE-PROBLEMS-DUE-TO-PROOFS", 1, 0, false);
    declareFunction(myName, "propagate_proof_indestructibility", "PROPAGATE-PROOF-INDESTRUCTIBILITY", 1, 0, false);
    declareFunction(myName, "compute_indestructible_problems_due_to_strategic_activity", "COMPUTE-INDESTRUCTIBLE-PROBLEMS-DUE-TO-STRATEGIC-ACTIVITY", 1, 0, false);
    declareFunction(myName, "possibly_prune_processed_problems", "POSSIBLY-PRUNE-PROCESSED-PROBLEMS", 1, 0, false);
    declareFunction(myName, "possibly_prune_wrt_conjunctive_removal", "POSSIBLY-PRUNE-WRT-CONJUNCTIVE-REMOVAL", 1, 0, false);
    declareFunction(myName, "prunable_objects_wrt_conjunctive_removal", "PRUNABLE-OBJECTS-WRT-CONJUNCTIVE-REMOVAL", 1, 0, false);
    declareFunction(myName, "update_prunable_conjunctive_removal_objects", "UPDATE-PRUNABLE-CONJUNCTIVE-REMOVAL-OBJECTS", 3, 0, false);
    declareFunction(myName, "compute_conjunctive_removal_proof_tuples", "COMPUTE-CONJUNCTIVE-REMOVAL-PROOF-TUPLES", 1, 0, false);
    declareFunction(myName, "isolated_problem_subset", "ISOLATED-PROBLEM-SUBSET", 1, 0, false);
    declareFunction(myName, "problem_isolated_wrt_problemsP", "PROBLEM-ISOLATED-WRT-PROBLEMS?", 2, 0, false);
    declareFunction(myName, "finished_problem_subset", "FINISHED-PROBLEM-SUBSET", 1, 0, false);
    declareFunction(myName, "possibly_note_eager_pruning_problem", "POSSIBLY-NOTE-EAGER-PRUNING-PROBLEM", 1, 0, false);
    declareFunction(myName, "possibly_prune_processed_proofs", "POSSIBLY-PRUNE-PROCESSED-PROOFS", 1, 0, false);
    declareFunction(myName, "problem_store_all_processed_objects", "PROBLEM-STORE-ALL-PROCESSED-OBJECTS", 2, 0, false);
    declareFunction(myName, "problem_processedP", "PROBLEM-PROCESSED?", 2, 0, false);
    declareFunction(myName, "link_processedP", "LINK-PROCESSED?", 1, 0, false);
    declareFunction(myName, "possibly_prune_processed_object", "POSSIBLY-PRUNE-PROCESSED-OBJECT", 1, 0, false);
    declareFunction(myName, "problem_is_the_root_problem_of_some_inferenceP", "PROBLEM-IS-THE-ROOT-PROBLEM-OF-SOME-INFERENCE?", 1, 0, false);
    declareFunction(myName, "consider_pruning_ramifications_of_ignored_strategem", "CONSIDER-PRUNING-RAMIFICATIONS-OF-IGNORED-STRATEGEM", 2, 0, false);
    declareFunction(myName, "prunable_processed_problemP", "PRUNABLE-PROCESSED-PROBLEM?", 1, 0, false);
    declareFunction(myName, "restricted_non_focal_with_siblingP", "RESTRICTED-NON-FOCAL-WITH-SIBLING?", 2, 0, false);
    declareFunction(myName, "restricted_focal_with_siblingP", "RESTRICTED-FOCAL-WITH-SIBLING?", 2, 0, false);
    declareFunction(myName, "corresponding_restricted_non_focal_unfinishedP", "CORRESPONDING-RESTRICTED-NON-FOCAL-UNFINISHED?", 2, 0, false);
    declareFunction(myName, "prunable_processed_linkP", "PRUNABLE-PROCESSED-LINK?", 1, 0, false);
    declareFunction(myName, "problem_is_reused_interestinglyP", "PROBLEM-IS-REUSED-INTERESTINGLY?", 1, 0, false);
    declareFunction(myName, "link_has_all_the_proofsP", "LINK-HAS-ALL-THE-PROOFS?", 1, 0, false);
    declareFunction(myName, "join_ordered_link_restricted_focal_count", "JOIN-ORDERED-LINK-RESTRICTED-FOCAL-COUNT", 1, 0, false);
    declareFunction(myName, "all_problem_proofs_are_processedP", "ALL-PROBLEM-PROOFS-ARE-PROCESSED?", 1, 0, false);
    declareFunction(myName, "all_link_proofs_are_processedP", "ALL-LINK-PROOFS-ARE-PROCESSED?", 1, 0, false);
    declareFunction(myName, "problem_has_no_motivation_other_than_removalP", "PROBLEM-HAS-NO-MOTIVATION-OTHER-THAN-REMOVAL?", 1, 0, false);
    declareFunction(myName, "problem_finished_wrt_removalP", "PROBLEM-FINISHED-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "problem_store_removal_strategies", "PROBLEM-STORE-REMOVAL-STRATEGIES", 1, 0, false);
    declareFunction(myName, "problem_is_a_new_rootP", "PROBLEM-IS-A-NEW-ROOT?", 2, 0, false);
    declareFunction(myName, "problem_store_new_root_strategies", "PROBLEM-STORE-NEW-ROOT-STRATEGIES", 1, 0, false);
    declareFunction(myName, "note_problem_dirty", "NOTE-PROBLEM-DIRTY", 1, 0, false);
    declareFunction(myName, "problem_store_possibly_redundant_proof_sets", "PROBLEM-STORE-POSSIBLY-REDUNDANT-PROOF-SETS", 1, 0, false);
    declareFunction(myName, "problem_store_all_possibly_redundant_proofs", "PROBLEM-STORE-ALL-POSSIBLY-REDUNDANT-PROOFS", 1, 0, false);
    declareFunction(myName, "problem_store_possibly_redundant_proof_count", "PROBLEM-STORE-POSSIBLY-REDUNDANT-PROOF-COUNT", 1, 0, false);
    declareFunction(myName, "possibly_prune_proof_tree", "POSSIBLY-PRUNE-PROOF-TREE", 1, 0, false);
    declareFunction(myName, "compute_root_proofs", "COMPUTE-ROOT-PROOFS", 1, 0, false);
    declareFunction(myName, "direct_dependent_proofs_including_split_restrictions", "DIRECT-DEPENDENT-PROOFS-INCLUDING-SPLIT-RESTRICTIONS", 1, 0, false);
    declareFunction(myName, "all_triggered_restricted_non_focal_links", "ALL-TRIGGERED-RESTRICTED-NON-FOCAL-LINKS", 1, 0, false);
    declareFunction(myName, "proof_prunableP", "PROOF-PRUNABLE?", 1, 0, false);
    declareFunction(myName, "prune_starting_from_root_proofs", "PRUNE-STARTING-FROM-ROOT-PROOFS", 1, 0, false);
    declareFunction(myName, "prune_entire_problem_store", "PRUNE-ENTIRE-PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "prune_problem_store_below", "PRUNE-PROBLEM-STORE-BELOW", 1, 0, false);
    declareFunction(myName, "all_problem_store_objects_below", "ALL-PROBLEM-STORE-OBJECTS-BELOW", 1, 0, false);
    declareFunction(myName, "add_all_problem_store_objects_below_recursive", "ADD-ALL-PROBLEM-STORE-OBJECTS-BELOW-RECURSIVE", 2, 0, false);
    declareFunction(myName, "prune_problem_store_objects", "PRUNE-PROBLEM-STORE-OBJECTS", 2, 0, false);
    declareFunction(myName, "prunable_problem_store_objectP", "PRUNABLE-PROBLEM-STORE-OBJECT?", 2, 0, false);
    declareFunction(myName, "prunable_problemP", "PRUNABLE-PROBLEM?", 2, 0, false);
    declareFunction(myName, "prunable_problem_linkP", "PRUNABLE-PROBLEM-LINK?", 1, 0, false);
    declareFunction(myName, "problem_not_in_progress_wrt_removalP", "PROBLEM-NOT-IN-PROGRESS-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "prune_problem_store_object", "PRUNE-PROBLEM-STORE-OBJECT", 1, 0, false);
    declareFunction(myName, "problem_store_compute_proof_keeping_problems", "PROBLEM-STORE-COMPUTE-PROOF-KEEPING-PROBLEMS", 1, 0, false);
    declareFunction(myName, "inference_compute_proof_keeping_problems", "INFERENCE-COMPUTE-PROOF-KEEPING-PROBLEMS", 1, 0, false);
    declareFunction(myName, "compute_proof_keeping_problems_recursive", "COMPUTE-PROOF-KEEPING-PROBLEMS-RECURSIVE", 1, 0, false);
    declareFunction(myName, "compute_proof_keeping_links_recursive", "COMPUTE-PROOF-KEEPING-LINKS-RECURSIVE", 1, 0, false);
    declareFunction(myName, "choose_split_link_non_proof_keeping_problem", "CHOOSE-SPLIT-LINK-NON-PROOF-KEEPING-PROBLEM", 1, 0, false);
    declareFunction(myName, "note_and_propagate_proof_keeping_problem", "NOTE-AND-PROPAGATE-PROOF-KEEPING-PROBLEM", 2, 0, false);
    declareFunction(myName, "note_and_propagate_proof_keeping_problem_recursive", "NOTE-AND-PROPAGATE-PROOF-KEEPING-PROBLEM-RECURSIVE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_worker_file() {
    $currently_executing_tactic$ = defparameter("*CURRENTLY-EXECUTING-TACTIC*", NIL);
    $currently_active_problem$ = defparameter("*CURRENTLY-ACTIVE-PROBLEM*", NIL);
    $asent_of_currently_executing_tactic$ = defparameter("*ASENT-OF-CURRENTLY-EXECUTING-TACTIC*", NIL);
    $mt_of_currently_executing_tactic$ = defparameter("*MT-OF-CURRENTLY-EXECUTING-TACTIC*", NIL);
    $eager_proof_validationP$ = defparameter("*EAGER-PROOF-VALIDATION?*", NIL);
    $circular_proof_max_depth_cutoff$ = deflexical("*CIRCULAR-PROOF-MAX-DEPTH-CUTOFF*", $int80$300);
    $process_motivated_transformation_link_proofsP$ = defparameter("*PROCESS-MOTIVATED-TRANSFORMATION-LINK-PROOFS?*", T);
    $find_proof_bindings_optimization_enabledP$ = defparameter("*FIND-PROOF-BINDINGS-OPTIMIZATION-ENABLED?*", T);
    $proof_bubbling_depth$ = defparameter("*PROOF-BUBBLING-DEPTH*", ZERO_INTEGER);
    $max_proof_bubbling_depth$ = deflexical("*MAX-PROOF-BUBBLING-DEPTH*", $int96$50);
    $within_abnormality_checkingP$ = defparameter("*WITHIN-ABNORMALITY-CHECKING?*", NIL);
    $disable_link_propagationP$ = defparameter("*DISABLE-LINK-PROPAGATION?*", NIL);
    $bubble_up_proofs_through_closed_split_linksP$ = defparameter("*BUBBLE-UP-PROOFS-THROUGH-CLOSED-SPLIT-LINKS?*", T);
    $reconsidering_set_asidesP$ = defparameter("*RECONSIDERING-SET-ASIDES?*", NIL);
    $problem_store_prune_reports$ = deflexical("*PROBLEM-STORE-PRUNE-REPORTS*", ((NIL != Symbols.boundp($sym162$_PROBLEM_STORE_PRUNE_REPORTS_)) ? ((SubLObject) $problem_store_prune_reports$.getGlobalValue()) : NIL));
    $possibly_propagate_problem_indestructible_stack$ = defparameter("*POSSIBLY-PROPAGATE-PROBLEM-INDESTRUCTIBLE-STACK*", $kw166$UNINITIALIZED);
    $processed_proofs_retain_one_proofP$ = defparameter("*PROCESSED-PROOFS-RETAIN-ONE-PROOF?*", T);
    return NIL;
  }

  public static final SubLObject setup_inference_worker_file() {
    // CVS_ID("Id: inference-worker.lisp 128760 2009-09-15 04:40:33Z pace ");
    memoization_state.note_memoized_function($sym69$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_);
    memoization_state.note_memoized_function($sym105$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS);
    subl_macro_promotions.declare_defglobal($sym162$_PROBLEM_STORE_PRUNE_REPORTS_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("TACTIC"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym2$_CURRENTLY_EXECUTING_TACTIC_ = makeSymbol("*CURRENTLY-EXECUTING-TACTIC*");
  public static final SubLList $list3 = list(makeSymbol("PROBLEM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym4$_CURRENTLY_ACTIVE_PROBLEM_ = makeSymbol("*CURRENTLY-ACTIVE-PROBLEM*");
  public static final SubLList $list5 = list(list(makeSymbol("*CURRENTLY-EXECUTING-TACTIC*"), NIL));
  public static final SubLList $list6 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym7$_NEGATION_BY_FAILURE_ = makeSymbol("*NEGATION-BY-FAILURE*");
  public static final SubLSymbol $sym8$PROBLEM_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROBLEM-STORE-NEGATION-BY-FAILURE?");
  public static final SubLSymbol $sym9$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLString $str10$_a_was_not_an__unexamined_problem = makeString("~a was not an :unexamined problem, so cannot determine its tactics");
  public static final SubLString $str11$_a_was__unexamined_but_somehow_go = makeString("~a was :unexamined but somehow got some tactics already.");
  public static final SubLSymbol $kw12$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $kw13$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw14$POS = makeKeyword("POS");
  public static final SubLSymbol $kw15$NEG = makeKeyword("NEG");
  public static final SubLList $list16 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $sym17$STRATEGY_P = makeSymbol("STRATEGY-P");
  public static final SubLSymbol $kw18$NON_DISCARDED = makeKeyword("NON-DISCARDED");
  public static final SubLString $str19$unexpected_tactic__S = makeString("unexpected tactic ~S");
  public static final SubLString $str20$Tried_to_recursively_execute__a = makeString("Tried to recursively execute ~a");
  public static final SubLString $str21$Tried_to_execute_a_tactic_that_wa = makeString("Tried to execute a tactic that was not possible: ~s");
  public static final SubLString $str22$unexpected_tactic__s = makeString("unexpected tactic ~s");
  public static final SubLList $list23 = list(list(makeSymbol("ASENT"), makeSymbol("MT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym24$_ASENT_OF_CURRENTLY_EXECUTING_TACTIC_ = makeSymbol("*ASENT-OF-CURRENTLY-EXECUTING-TACTIC*");
  public static final SubLSymbol $sym25$_MT_OF_CURRENTLY_EXECUTING_TACTIC_ = makeSymbol("*MT-OF-CURRENTLY-EXECUTING-TACTIC*");
  public static final SubLString $str26$Got_a_literal_level_tactic__s_tha = makeString("Got a literal-level tactic ~s that was neither a transformation nor a removal nor a rewrite");
  public static final SubLString $str27$Unexpected_multiple_clause_tactic = makeString("Unexpected multiple clause tactic module ~a");
  public static final SubLString $str28$Unexpected_multiple_literal_tacti = makeString("Unexpected multiple literal tactic module ~a");
  public static final SubLString $str29$Unexpected_structural_multiple_li = makeString("Unexpected structural multiple literal tactic module ~a");
  public static final SubLString $str30$Unexpected_meta_structural_multip = makeString("Unexpected meta-structural multiple literal tactic module ~a");
  public static final SubLString $str31$unexpected_connected_conjunction_ = makeString("unexpected connected conjunction link ~s");
  public static final SubLString $str32$unexpected_connected_conjunction_ = makeString("unexpected connected conjunction tactic ~s");
  public static final SubLString $str33$unexpected_disjunctive_link__s = makeString("unexpected disjunctive link ~s");
  public static final SubLString $str34$_s_was_not_a_logical_link_with_un = makeString("~s was not a logical-link-with-unique-tactic-p");
  public static final SubLSymbol $kw35$SPLIT = makeKeyword("SPLIT");
  public static final SubLSymbol $kw36$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw37$UNION = makeKeyword("UNION");
  public static final SubLSymbol $kw38$JOIN = makeKeyword("JOIN");
  public static final SubLString $str39$Unexpected_logical_tactic_module_ = makeString("Unexpected logical tactic module ~S");
  public static final SubLString $str40$Join_tactics_like__S_do_not_have_ = makeString("Join tactics like ~S do not have a unique lookahead problem.");
  public static final SubLSymbol $sym41$STRUCTURAL_PROOF_P = makeSymbol("STRUCTURAL-PROOF-P");
  public static final SubLString $str42$_a_is_not_a_CONTENT_LINK_P = makeString("~a is not a CONTENT-LINK-P");
  public static final SubLSymbol $sym43$CONTENT_TACTIC_P = makeSymbol("CONTENT-TACTIC-P");
  public static final SubLString $str44$Unexpected_content_tactic__S = makeString("Unexpected content tactic ~S");
  public static final SubLString $str45$Unexpected_removal_tactic__S = makeString("Unexpected removal tactic ~S");
  public static final SubLSymbol $kw46$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw47$RESTRICTION = makeKeyword("RESTRICTION");
  public static final SubLSymbol $sym48$CONJUNCTIVE_REMOVAL_TACTIC_P = makeSymbol("CONJUNCTIVE-REMOVAL-TACTIC-P");
  public static final SubLSymbol $sym49$SPLIT_LINK_P = makeSymbol("SPLIT-LINK-P");
  public static final SubLSymbol $sym50$TRANSFORMATION_TACTIC_P = makeSymbol("TRANSFORMATION-TACTIC-P");
  public static final SubLSymbol $kw51$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $sym52$REWRITE_TACTIC_P = makeSymbol("REWRITE-TACTIC-P");
  public static final SubLSymbol $kw53$REWRITE = makeKeyword("REWRITE");
  public static final SubLSymbol $sym54$META_REMOVAL_TACTIC_P = makeSymbol("META-REMOVAL-TACTIC-P");
  public static final SubLSymbol $sym55$STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");
  public static final SubLSymbol $kw56$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $kw57$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLSymbol $kw58$GENERALIZED_REMOVAL = makeKeyword("GENERALIZED-REMOVAL");
  public static final SubLSymbol $kw59$POSSIBLE = makeKeyword("POSSIBLE");
  public static final SubLSymbol $kw60$DISPREFERRED = makeKeyword("DISPREFERRED");
  public static final SubLSymbol $kw61$GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
  public static final SubLSymbol $kw62$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLString $str63$Unexpected_preference_level__s = makeString("Unexpected preference-level ~s");
  public static final SubLSymbol $kw64$CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
  public static final SubLSymbol $kw65$STRUCTURAL = makeKeyword("STRUCTURAL");
  public static final SubLSymbol $kw66$LOGICAL = makeKeyword("LOGICAL");
  public static final SubLSymbol $kw67$IMPOSSIBLE = makeKeyword("IMPOSSIBLE");
  public static final SubLSymbol $kw68$STRUCTURAL_CONJUNCTIVE = makeKeyword("STRUCTURAL-CONJUNCTIVE");
  public static final SubLSymbol $sym69$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_ = makeSymbol("INTERMEDIATE-PROOF-STEP-VALID-MEMOIZED?");
  public static final SubLSymbol $kw70$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $kw71$NONE = makeKeyword("NONE");
  public static final SubLSymbol $kw72$MINIMAL = makeKeyword("MINIMAL");
  public static final SubLSymbol $kw73$ALL = makeKeyword("ALL");
  public static final SubLSymbol $kw74$ARG_TYPE = makeKeyword("ARG-TYPE");
  public static final SubLString $str75$Unexpected_intermediate_step_vali = makeString("Unexpected intermediate step validation level ~s");
  public static final SubLList $list76 = list(makeSymbol("PROVEN-MT"), makeSymbol("PROVEN-ASENT"));
  public static final SubLString $str77$Didn_t_expect_to_bubble_up_a_proo = makeString("Didn't expect to bubble up a proof to the answer link ~s");
  public static final SubLString $str78$Unexpected_link_type_for_link__a = makeString("Unexpected link type for link ~a");
  public static final SubLSymbol $sym79$PROOF_P = makeSymbol("PROOF-P");
  public static final SubLInteger $int80$300 = makeInteger(300);
  public static final SubLSymbol $kw81$CIRCULAR = makeKeyword("CIRCULAR");
  public static final SubLSymbol $kw82$ILL_FORMED = makeKeyword("ILL-FORMED");
  public static final SubLSymbol $kw83$NON_ABDUCIBLE_RULE = makeKeyword("NON-ABDUCIBLE-RULE");
  public static final SubLSymbol $kw84$MODUS_TOLLENS_WITH_NON_WFF = makeKeyword("MODUS-TOLLENS-WITH-NON-WFF");
  public static final SubLSymbol $kw85$PROVEN = makeKeyword("PROVEN");
  public static final SubLSymbol $kw86$REJECTED_SUBPROOF = makeKeyword("REJECTED-SUBPROOF");
  public static final SubLList $list87 = list(makeSymbol("RT-C-FIRST-SUBPROOF"), makeSymbol("RT-C-SECOND-SUBPROOF"));
  public static final SubLSymbol $sym88$PROBLEM_LINK_TO_GOAL_P = makeSymbol("PROBLEM-LINK-TO-GOAL-P");
  public static final SubLString $str89$expected_a_variable_map_to_be_nul = makeString("expected a variable map to be null because the sub-bindings were null");
  public static final SubLSymbol $sym90$VARIABLE__ = makeSymbol("VARIABLE-<");
  public static final SubLSymbol $sym91$VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");
  public static final SubLList $list92 = cons(makeSymbol("BINDING-VARIABLE"), makeSymbol("BINDING-VALUE"));
  public static final SubLString $str93$Found_a_triplicate_binding_for__s = makeString("Found a triplicate binding for ~s in ~s and expected only a duplicate");
  public static final SubLString $str94$Could_not_find_two_values_in__s_w = makeString("Could not find two values in ~s with variable ~s");
  public static final SubLSymbol $sym95$BINDINGS_P = makeSymbol("BINDINGS-P");
  public static final SubLInteger $int96$50 = makeInteger(50);
  public static final SubLSymbol $kw97$MAX_PROOF_BUBBLING_DEPTH = makeKeyword("MAX-PROOF-BUBBLING-DEPTH");
  public static final SubLSymbol $kw98$ANSWER = makeKeyword("ANSWER");
  public static final SubLSymbol $sym99$VARIABLE_MAP_P = makeSymbol("VARIABLE-MAP-P");
  public static final SubLSymbol $kw100$RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
  public static final SubLSymbol $kw101$DISJUNCTIVE_ASSUMPTION = makeKeyword("DISJUNCTIVE-ASSUMPTION");
  public static final SubLString $str102$can_t_handle_bubbling_up_proofs_p = makeString("can't handle bubbling up proofs past disjunctive assumption links yet");
  public static final SubLSymbol $kw103$EXCEPTED_ASSERTION = makeKeyword("EXCEPTED-ASSERTION");
  public static final SubLSymbol $kw104$ABNORMAL = makeKeyword("ABNORMAL");
  public static final SubLSymbol $sym105$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS = makeSymbol("CACHED-INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS");
  public static final SubLSymbol $sym106$GENERALIZED_TRANSFORMATION_PROOF_P = makeSymbol("GENERALIZED-TRANSFORMATION-PROOF-P");
  public static final SubLString $str107$generalized_transformation_proof_ = makeString("generalized transformation proof of unexpected type: ~s");
  public static final SubLString $str108$Invalid_sense__s = makeString("Invalid sense ~s");
  public static final SubLSymbol $kw109$UNEXAMINED = makeKeyword("UNEXAMINED");
  public static final SubLString $str110$Tried_to_make__a_pending_but_it_s = makeString("Tried to make ~a pending but it still had possible tactics");
  public static final SubLSymbol $kw111$INTUITIVE = makeKeyword("INTUITIVE");
  public static final SubLSymbol $kw112$UNDETERMINED = makeKeyword("UNDETERMINED");
  public static final SubLString $str113$Uninteresting_problem_status_chan = makeString("Uninteresting problem status change for ~a: ~a -> ~a");
  public static final SubLSymbol $kw114$NEW = makeKeyword("NEW");
  public static final SubLSymbol $kw115$UNEXAMINED_GOOD = makeKeyword("UNEXAMINED-GOOD");
  public static final SubLSymbol $kw116$UNEXAMINED_NO_GOOD = makeKeyword("UNEXAMINED-NO-GOOD");
  public static final SubLSymbol $kw117$EXAMINED = makeKeyword("EXAMINED");
  public static final SubLSymbol $kw118$EXAMINED_GOOD = makeKeyword("EXAMINED-GOOD");
  public static final SubLSymbol $kw119$EXAMINED_NO_GOOD = makeKeyword("EXAMINED-NO-GOOD");
  public static final SubLSymbol $kw120$POSSIBLE_GOOD = makeKeyword("POSSIBLE-GOOD");
  public static final SubLSymbol $kw121$PENDING = makeKeyword("PENDING");
  public static final SubLSymbol $kw122$PENDING_GOOD = makeKeyword("PENDING-GOOD");
  public static final SubLSymbol $kw123$PENDING_NO_GOOD = makeKeyword("PENDING-NO-GOOD");
  public static final SubLSymbol $kw124$FINISHED = makeKeyword("FINISHED");
  public static final SubLSymbol $kw125$FINISHED_GOOD = makeKeyword("FINISHED-GOOD");
  public static final SubLSymbol $kw126$FINISHED_NO_GOOD = makeKeyword("FINISHED-NO-GOOD");
  public static final SubLSymbol $kw127$SUBSTRATEGY_PROBLEM_STATUS_CHANGE = makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE");
  public static final SubLString $str128$Problem__a_attempted_to_change_st = makeString("Problem ~a attempted to change status from ~s to ~s, which is prohibited.");
  public static final SubLString $str129$new_problem_cannot_become_good_ye = makeString("new problem cannot become good yet");
  public static final SubLString $str130$Once_a_problem_is_no_good__it_can = makeString("Once a problem is no good, it can never go back.");
  public static final SubLString $str131$unknown_problem_status__a = makeString("unknown problem status ~a");
  public static final SubLString $str132$problem_status__a_cannot_become_u = makeString("problem status ~a cannot become unexamined");
  public static final SubLString $str133$problem_of_status__a_cannot_be_ex = makeString("problem of status ~a cannot be examined");
  public static final SubLSymbol $kw134$POSSIBLE_NO_GOOD = makeKeyword("POSSIBLE-NO-GOOD");
  public static final SubLString $str135$problem_of_status__a_cannot_be_ma = makeString("problem of status ~a cannot be made possible");
  public static final SubLString $str136$problem_of_status__a_cannot_be_pe = makeString("problem of status ~a cannot be pending");
  public static final SubLString $str137$problem_of_status__a_cannot_be_fi = makeString("problem of status ~a cannot be finished");
  public static final SubLString $str138$Unexpected_status__s = makeString("Unexpected status ~s");
  public static final SubLString $str139$unexpected_link_type__S = makeString("unexpected link type ~S");
  public static final SubLSymbol $kw140$PROBLEM_NO_GOOD = makeKeyword("PROBLEM-NO-GOOD");
  public static final SubLSymbol $kw141$CONJUNCTIVE = makeKeyword("CONJUNCTIVE");
  public static final SubLSymbol $kw142$CONTENT = makeKeyword("CONTENT");
  public static final SubLSymbol $kw143$SIMPLIFICATION = makeKeyword("SIMPLIFICATION");
  public static final SubLSymbol $kw144$ANYTHING = makeKeyword("ANYTHING");
  public static final SubLList $list145 = list(list(makeSymbol("TYPED-PROOF-SPEC"), makeSymbol("PROOF-SPEC"), makeSymbol("PROOF-SPEC-TYPE-P")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym146$FILTER_PROOF_SPECS_OF_TYPE = makeSymbol("FILTER-PROOF-SPECS-OF-TYPE");
  public static final SubLSymbol $sym147$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym148$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym149$JOIN_ORDERED_PROOF_SPEC_P = makeSymbol("JOIN-ORDERED-PROOF-SPEC-P");
  public static final SubLSymbol $sym150$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P = makeSymbol("RESIDUAL-TRANSFORMATION-PROOF-SPEC-P");
  public static final SubLSymbol $sym151$RESTRICTION_PROOF_SPEC_P = makeSymbol("RESTRICTION-PROOF-SPEC-P");
  public static final SubLSymbol $sym152$SPLIT_PROOF_SPEC_P = makeSymbol("SPLIT-PROOF-SPEC-P");
  public static final SubLSymbol $sym153$JOIN_PROOF_SPEC_P = makeSymbol("JOIN-PROOF-SPEC-P");
  public static final SubLSymbol $sym154$CONJUNCTIVE_REMOVAL_PROOF_SPEC_P = makeSymbol("CONJUNCTIVE-REMOVAL-PROOF-SPEC-P");
  public static final SubLSymbol $sym155$TRANSFORMATION_PROOF_SPEC_P = makeSymbol("TRANSFORMATION-PROOF-SPEC-P");
  public static final SubLSymbol $sym156$UNION_PROOF_SPEC_P = makeSymbol("UNION-PROOF-SPEC-P");
  public static final SubLString $str157$Time_to_handle__S_propagation = makeString("Time to handle ~S propagation");
  public static final SubLList $list158 = list(makeSymbol("JOIN-PART"), makeSymbol("&REST"), makeSymbol("JOINED-PARTS"));
  public static final SubLString $str159$Propagating_bogus_proof_spec__A_d = makeString("Propagating bogus proof spec ~A down join link ~A.");
  public static final SubLSymbol $kw160$EQUAL = makeKeyword("EQUAL");
  public static final SubLSymbol $kw161$CZER_EQUAL = makeKeyword("CZER-EQUAL");
  public static final SubLSymbol $sym162$_PROBLEM_STORE_PRUNE_REPORTS_ = makeSymbol("*PROBLEM-STORE-PRUNE-REPORTS*");
  public static final SubLString $str163$__pruned__a_problems____a_____a__ = makeString("~&pruned ~a problems: (~a -> ~a)~%");
  public static final SubLSymbol $sym164$_ = makeSymbol(">");
  public static final SubLSymbol $sym165$PROBLEM_MIN_DEPTH = makeSymbol("PROBLEM-MIN-DEPTH");
  public static final SubLSymbol $kw166$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str167$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLString $str168$destroying_in_progress_tactic__a = makeString("destroying in-progress tactic ~a");
  public static final SubLList $list169 = list(makeSymbol("CONJUNCTIVE-REMOVAL-PROOF"), makeSymbol("&REST"), makeSymbol("JOIN-ORDERED-PROOFS"));
  public static final SubLList $list170 = list(makeSymbol("FOCAL-PROOF"), makeSymbol("NON-FOCAL-PROOF"));
  public static final SubLSymbol $sym171$_ = makeSymbol("<");
  public static final SubLSymbol $sym172$PROBLEM_LINK_SUID = makeSymbol("PROBLEM-LINK-SUID");
  public static final SubLSymbol $sym173$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");
  public static final SubLSymbol $sym174$CONJUNCTIVE_REMOVAL_PROOF_P = makeSymbol("CONJUNCTIVE-REMOVAL-PROOF-P");
  public static final SubLSymbol $sym175$PROOF_SUID = makeSymbol("PROOF-SUID");
  public static final SubLSymbol $sym176$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_ = makeSymbol("PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?");
  public static final SubLList $list177 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));
  public static final SubLSymbol $kw178$DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");
  public static final SubLSymbol $sym179$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
  public static final SubLSymbol $sym180$SET_SIZE = makeSymbol("SET-SIZE");
  public static final SubLSymbol $sym181$PROOF_PRUNABLE_ = makeSymbol("PROOF-PRUNABLE?");
  public static final SubLString $str182$_a_was_not_a_problem_p_or_problem = makeString("~a was not a problem-p or problem-link-p");
  public static final SubLString $str183$__prunables___s__ = makeString("~%prunables: ~s~%");
  public static final SubLString $str184$Unexpected_problem_store_object__ = makeString("Unexpected problem store object ~s");
  public static final SubLList $list185 = list(makeKeyword("UNEXAMINED"), makeKeyword("EXAMINED"), makeKeyword("FINISHED"));
  public static final SubLSymbol $sym186$TACTICALLY_FINISHED_PROBLEM_P = makeSymbol("TACTICALLY-FINISHED-PROBLEM-P");

  //// Initializers

  public void declareFunctions() {
    declare_inference_worker_file();
  }

  public void initializeVariables() {
    init_inference_worker_file();
  }

  public void runTopLevelForms() {
    setup_inference_worker_file();
  }

}
