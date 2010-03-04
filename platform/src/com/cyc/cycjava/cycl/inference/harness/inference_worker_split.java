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
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.graph_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;

public  final class inference_worker_split extends SubLTranslatedFile {

  //// Constructor

  private inference_worker_split() {}
  public static final SubLFile me = new inference_worker_split();
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_split";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 862) 
  public static final SubLObject split_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_p(object))
           && ($kw0$SPLIT == inference_datastructures_problem_link.problem_link_type(object))));
  }

  /** @return split-link-p, either the already existing one or a new one. */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 1214) 
  public static final SubLObject maybe_new_split_link(SubLObject supported_problem, SubLObject dnf_clause) {
    {
      SubLObject split_link = problem_first_split_argument_link(supported_problem);
      if ((NIL == split_link)) {
        {
          SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
          SubLObject supporting_mapped_problems = find_or_create_split_link_supporting_problems(store, dnf_clause);
          split_link = new_split_link(supported_problem, supporting_mapped_problems);
        }
      }
      return split_link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 1737) 
  public static final SubLObject new_split_link(SubLObject supported_problem, SubLObject supporting_mapped_problems) {
    {
      SubLObject split_link = inference_datastructures_problem_link.new_problem_link($kw0$SPLIT, supported_problem);
      SubLObject cdolist_list_var = supporting_mapped_problems;
      SubLObject supporting_mapped_problem = NIL;
      for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, split_link);
      }
      inference_worker.propagate_problem_link(split_link);
      return split_link;
    }
  }

  /** Closes all open supporting mapped problems of SPLIT-LINK and considers that they could be irrelevant. */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 4018) 
  public static final SubLObject close_split_link(SubLObject split_link) {
    {
      SubLObject split_link_var = split_link;
      SubLObject index = ZERO_INTEGER;
      SubLObject link_var = split_link_var;
      SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
      SubLObject supporting_mapped_problem = NIL;
      for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
        if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
          if ((NIL != inference_datastructures_problem_link.problem_link_index_openP(split_link_var, index))) {
            inference_datastructures_problem_link.problem_link_close_index(split_link, index);
            inference_worker.consider_that_mapped_problem_could_be_irrelevant(supporting_mapped_problem, split_link);
          }
          index = Numbers.add(index, ONE_INTEGER);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 4449) 
  public static final SubLObject find_or_create_split_link_supporting_problems(SubLObject store, SubLObject dnf_clause) {
    {
      SubLObject split_clauses = determine_shared_variable_islands(dnf_clause);
      SubLObject supporting_mapped_problems = NIL;
      SubLObject cdolist_list_var = split_clauses;
      SubLObject subquery = NIL;
      for (subquery = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subquery = cdolist_list_var.first()) {
        {
          SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, subquery, UNPROVIDED);
          supporting_mapped_problems = cons(supporting_mapped_problem, supporting_mapped_problems);
        }
      }
      return Sequences.nreverse(supporting_mapped_problems);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 4886) 
  private static SubLSymbol $split_module$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5011) 
  public static final SubLObject split_tactic_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(object))
             && ($split_module$.getDynamicValue(thread) == inference_datastructures_tactic.tactic_hl_module(object))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5151) 
  public static final SubLObject new_split_tactic(SubLObject supported_problem, SubLObject index) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tactic = inference_datastructures_tactic.new_tactic(supported_problem, $split_module$.getDynamicValue(thread), index);
        SubLObject prob = supported_problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw9$SKIP))) {
          {
            SubLObject idx_1 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_1, $kw9$SKIP))) {
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
                           && (NIL != id_index.id_index_skip_tombstones_p($kw9$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw9$SKIP;
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
                                inference_tactician.strategy_note_new_tactic(strategy, tactic);
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
                                inference_tactician.strategy_note_new_tactic(strategy, tactic);
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
        return tactic;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5432) 
  public static final SubLObject split_tactic_supporting_mapped_problem_index(SubLObject tactic) {
    return inference_datastructures_tactic.tactic_data(tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5545) 
  public static final SubLObject split_tactic_link(SubLObject split_tactic) {
    {
      SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
      SubLObject split_link = problem_sole_split_argument_link(problem);
      if ((NIL != split_link)) {
        return split_link;
      } else {
        return Errors.error($str10$Could_not_find_the_link_for__a, split_tactic);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5826) 
  public static final SubLObject find_split_tactic_supporting_mapped_problem(SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(tactic, $sym11$SPLIT_TACTIC_P);
      {
        SubLObject index = split_tactic_supporting_mapped_problem_index(tactic);
        SubLObject link = split_tactic_link(tactic);
        SubLObject supporting_mapped_problem = inference_datastructures_problem_link.find_supporting_mapped_problem_by_index(link, index);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == supporting_mapped_problem)) {
            Errors.error($str12$Generalized_tactic__a_did_not_ind, tactic);
          }
        }
        return Values.values(supporting_mapped_problem, link);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 6297) 
  public static final SubLObject find_split_tactic_supporting_problem(SubLObject tactic) {
    return inference_datastructures_problem_link.mapped_problem_problem(find_split_tactic_supporting_mapped_problem(tactic));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 7502) 
  public static final SubLObject compute_strategic_properties_of_split_tactic(SubLObject tactic, SubLObject supporting_problem, SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        if ((NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic)))) {
          thread.resetMultipleValues();
          {
            SubLObject preference_level = compute_split_tactic_preference_level(problem, supporting_problem, $kw14$TACTICAL);
            SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_datastructures_tactic.set_tactic_preference_level(tactic, preference_level, justification);
          }
        }
        thread.resetMultipleValues();
        {
          SubLObject strategic_preference_level = compute_split_tactic_preference_level(problem, supporting_problem, strategy);
          SubLObject justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, strategic_preference_level, justification);
        }
        {
          SubLObject strategic_productivity = compute_split_tactic_productivity(problem, supporting_problem, strategy);
          inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, strategic_productivity);
        }
      }
      return tactic;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 8427) 
  public static final SubLObject compute_split_tactic_productivity(SubLObject supported_problem, SubLObject supporting_problem, SubLObject strategy) {
    return inference_lookahead_productivity.memoized_problem_max_removal_productivity(supporting_problem, strategy);
  }

  /** The default preference level used for split tactics.
Splits are independent of each other, so no bindings from one half
could possibly make the other half any more solvable.
Hence, all splits should be preferred by default.
However, if any split is disallowed, the entire problem should be deemed no-good. */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 8636) 
  public static SubLSymbol $split_tactic_default_preference_level$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 9018) 
  public static SubLSymbol $split_tactic_default_preference_level_justification$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 9125) 
  public static final SubLObject compute_split_tactic_preference_level(SubLObject supported_problem, SubLObject supporting_problem, SubLObject strategic_context) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject supporting_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(supporting_problem, strategic_context, NIL);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((supporting_preference_level != $kw17$DISALLOWED)) {
          supporting_preference_level = $split_tactic_default_preference_level$.getGlobalValue();
          justification = $split_tactic_default_preference_level_justification$.getGlobalValue();
        }
        return Values.values(supporting_preference_level, justification);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 9904) 
  public static final SubLObject execute_split_tactic(SubLObject tactic) {
    {
      SubLObject split_link = split_tactic_link(tactic);
      SubLObject index = split_tactic_supporting_mapped_problem_index(tactic);
      inference_worker.problem_link_open_and_repropagate_index(split_link, index);
    }
    return tactic;
  }

  /** PROBLEM should have exactly one argument link which is a split link.
Signals an error if this is not the case. */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 10243) 
  public static final SubLObject problem_sole_split_argument_link(SubLObject problem) {
    return inference_datastructures_problem.problem_sole_argument_link_of_type(problem, $kw0$SPLIT);
  }

  /** @return nil or split-link-p */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 10495) 
  public static final SubLObject problem_first_split_argument_link(SubLObject problem) {
    return inference_datastructures_problem.problem_first_argument_link_of_type(problem, $kw0$SPLIT);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 10775) 
  public static final SubLObject split_tactic_lookahead_problem(SubLObject split_tactic) {
    {
      SubLObject supporting_mapped_problem = find_split_tactic_supporting_mapped_problem(split_tactic);
      return inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
    }
  }

  /** @return 0 proof-p
@return 1 whether the returned proof was newly created */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 11395) 
  public static final SubLObject new_split_proof(SubLObject link, SubLObject subproofs_with_sub_bindings) {
    return inference_worker_join_ordered.new_conjunctive_proof(link, subproofs_with_sub_bindings);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 11668) 
  public static final SubLObject split_proof_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_proof.proof_p(object))
           && ($kw0$SPLIT == inference_datastructures_proof.proof_type(object))));
  }

  /** First we translate the subproofs' bindings into terms of SPLIT-LINK's
supported problem, then we cartesian-product them and make new proofs. */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 11795) 
  public static final SubLObject bubble_up_proof_to_split_link(SubLObject supporting_proof, SubLObject my_variable_map, SubLObject split_link) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject proofs = NIL;
        SubLObject supporting_mapped_proof_lists_by_supporting_problem = NIL;
        SubLObject my_supporting_problem = inference_datastructures_proof.proof_supported_problem(supporting_proof);
        {
          SubLObject link_var = split_link;
          SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
          SubLObject supporting_mapped_problem = NIL;
          for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
            if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
              {
                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (((supporting_problem == my_supporting_problem)
                     && (NIL != bindings.bindings_equalP(variable_map, my_variable_map)))) {
                  {
                    SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(supporting_proof);
                    SubLObject sub_proof_bindings = bindings.transfer_variable_map_to_bindings(my_variable_map, proof_bindings);
                    supporting_mapped_proof_lists_by_supporting_problem = cons(list(cons(supporting_proof, sub_proof_bindings)), supporting_mapped_proof_lists_by_supporting_problem);
                  }
                } else {
                  {
                    SubLObject proofs_with_bindings = NIL;
                    SubLObject status_var = $kw18$PROVEN;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(supporting_problem));
                    while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                      thread.resetMultipleValues();
                      {
                        SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject proof_list = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                          SubLObject cdolist_list_var_3 = proof_list;
                          SubLObject proof = NIL;
                          for (proof = cdolist_list_var_3.first(); (NIL != cdolist_list_var_3); cdolist_list_var_3 = cdolist_list_var_3.rest(), proof = cdolist_list_var_3.first()) {
                            if ((NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var))) {
                              {
                                SubLObject sub_proof_bindings = bindings.transfer_variable_map_to_bindings(variable_map, inference_datastructures_proof.proof_bindings(proof));
                                proofs_with_bindings = cons(cons(proof, sub_proof_bindings), proofs_with_bindings);
                              }
                            }
                          }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                      }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    supporting_mapped_proof_lists_by_supporting_problem = cons(proofs_with_bindings, supporting_mapped_proof_lists_by_supporting_problem);
                  }
                }
              }
            }
          }
        }
        supporting_mapped_proof_lists_by_supporting_problem = Sequences.nreverse(supporting_mapped_proof_lists_by_supporting_problem);
        {
          SubLObject mapped_subproof_lists = list_utilities.cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          SubLObject cdolist_list_var = mapped_subproof_lists;
          SubLObject mapped_subproof_list = NIL;
          for (mapped_subproof_list = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mapped_subproof_list = cdolist_list_var.first()) {
            thread.resetMultipleValues();
            {
              SubLObject proof = new_split_proof(split_link, mapped_subproof_list);
              SubLObject newP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if ((NIL != newP)) {
                proofs = cons(proof, proofs);
              } else {
                inference_worker.possibly_note_proof_processed(supporting_proof);
              }
            }
          }
        }
        proofs = Sequences.nreverse(proofs);
        {
          SubLObject cdolist_list_var = proofs;
          SubLObject proof = NIL;
          for (proof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), proof = cdolist_list_var.first()) {
            inference_worker.bubble_up_proof(proof);
          }
        }
        return proofs;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 14169) 
  public static final SubLObject all_literals_connected_by_shared_varsP(SubLObject dnf_clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
        SubLObject contextualized_asent = NIL;
        for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
          if ((NIL != el_utilities.hl_ground_tree_p(contextualized_asent))) {
            return NIL;
          }
        }
      }
      {
        SubLObject cdolist_list_var = clauses.pos_lits(dnf_clause);
        SubLObject contextualized_asent = NIL;
        for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
          if ((NIL != el_utilities.hl_ground_tree_p(contextualized_asent))) {
            return NIL;
          }
        }
      }
      thread.resetMultipleValues();
      {
        SubLObject connected_groups = categorize_clause_variables_via_literals(dnf_clause);
        SubLObject isolated_groups = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(((NIL == isolated_groups)
               && (NIL != list_utilities.singletonP(connected_groups))));
      }
    }
  }

  /** @return list of problem-query-p */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 15022) 
  public static final SubLObject determine_shared_variable_islands(SubLObject dnf_clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject islands = NIL;
        if ((NIL != el_utilities.hl_ground_tree_p(dnf_clause))) {
          {
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
            SubLObject contextualized_asent = NIL;
            for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
              {
                SubLObject sense = $kw19$NEG;
                SubLObject island = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
                islands = cons(island, islands);
              }
              index = Numbers.add(index, ONE_INTEGER);
            }
          }
          {
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.pos_lits(dnf_clause);
            SubLObject contextualized_asent = NIL;
            for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
              {
                SubLObject sense = $kw20$POS;
                SubLObject island = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
                islands = cons(island, islands);
              }
              index = Numbers.add(index, ONE_INTEGER);
            }
          }
        } else {
          {
            SubLObject sensified_clause = sensify_contextualized_clause(dnf_clause);
            thread.resetMultipleValues();
            {
              SubLObject connected_groups = categorize_sensified_clause_variables_via_literals(sensified_clause);
              SubLObject isolated_groups = thread.secondMultipleValue();
              thread.resetMultipleValues();
              {
                SubLObject cdolist_list_var = connected_groups;
                SubLObject group = NIL;
                for (group = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), group = cdolist_list_var.first()) {
                  {
                    SubLObject island = categorized_group_to_problem_query(group);
                    islands = cons(island, islands);
                  }
                }
              }
              {
                SubLObject cdolist_list_var = isolated_groups;
                SubLObject group = NIL;
                for (group = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), group = cdolist_list_var.first()) {
                  {
                    SubLObject island = categorized_group_to_problem_query(group);
                    islands = cons(island, islands);
                  }
                }
              }
            }
          }
        }
        return list_utilities.fast_delete_duplicates(islands, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 16196) 
  public static final SubLObject categorize_clause_variables_via_literals(SubLObject clause) {
    {
      SubLObject all_hl_vars = list_utilities.tree_gather(clause, $sym21$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      SubLObject all_literals = clause_utilities.all_literals_as_asents(clause);
      return graph_utilities.categorize_nodes_via_links(all_hl_vars, all_literals, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 16477) 
  public static final SubLObject categorize_sensified_clause_variables_via_literals(SubLObject sensified_clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ground_groups = NIL;
        SubLObject cdolist_list_var = sensified_clause;
        SubLObject sensified_literal = NIL;
        for (sensified_literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sensified_literal = cdolist_list_var.first()) {
          if ((NIL != el_utilities.hl_ground_tree_p(sensified_literal))) {
            {
              SubLObject group = ground_sensified_literal_to_categorized_group(sensified_literal);
              ground_groups = cons(group, ground_groups);
            }
          }
        }
        {
          SubLObject all_hl_vars = list_utilities.tree_gather(sensified_clause, $sym21$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          SubLObject all_literals = sensified_clause;
          thread.resetMultipleValues();
          {
            SubLObject connected_groups = graph_utilities.categorize_nodes_via_links(all_hl_vars, all_literals, UNPROVIDED);
            SubLObject isolated_groups = thread.secondMultipleValue();
            SubLObject naked_groups = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return Values.values(connected_groups, ConsesLow.nconc(ground_groups, isolated_groups));
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 17181) 
  public static final SubLObject sensify_contextualized_clause(SubLObject clause) {
    {
      SubLObject literals = NIL;
      {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject contextualized_asent = NIL;
        for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
          literals = cons(cycl_utilities.negate(contextualized_asent), literals);
          index = Numbers.add(index, ONE_INTEGER);
        }
      }
      {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(clause);
        SubLObject contextualized_asent = NIL;
        for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
          literals = cons(contextualized_asent, literals);
          index = Numbers.add(index, ONE_INTEGER);
        }
      }
      return Sequences.nreverse(literals);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 17776) 
  public static final SubLObject ground_sensified_literal_to_categorized_group(SubLObject sensified_literal) {
    return list(NIL, list(sensified_literal));
  }

  /** Takes the return value of @xref categorize-variables-via-literals and turns it
into a problem query.
@return problem-query-p */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 17904) 
  public static final SubLObject categorized_group_to_problem_query(SubLObject group) {
    {
      SubLObject neg_lits = NIL;
      SubLObject pos_lits = NIL;
      SubLObject group_lits = conses_high.second(group);
      SubLObject cdolist_list_var = group_lits;
      SubLObject literal = NIL;
      for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
        if ((NIL != el_utilities.el_negation_p(literal))) {
          neg_lits = cons(el_utilities.literal_atomic_sentence(literal), neg_lits);
        } else {
          pos_lits = cons(literal, pos_lits);
        }
      }
      neg_lits = Sequences.nreverse(neg_lits);
      pos_lits = Sequences.nreverse(pos_lits);
      return inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.make_clause(neg_lits, pos_lits));
    }
  }

  /** Temporary control variable, @todo hard-code to T */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 18494) 
  public static SubLSymbol $meta_split_tactics_enabledP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 18648) 
  public static final SubLObject meta_split_tactics_enabledP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $meta_split_tactics_enabledP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 18737) 
  private static SubLSymbol $determine_new_split_tactics_module$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 18863) 
  public static SubLSymbol $meta_split_tactic_default_preference_level$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 18940) 
  public static SubLSymbol $meta_split_tactic_default_preference_level_justification$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19056) 
  public static final SubLObject meta_split_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(object))
           && ($determine_new_split_tactics_module$.getGlobalValue() == inference_datastructures_tactic.tactic_hl_module(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19334) 
  public static final SubLObject meta_split_tactic_link(SubLObject meta_split_tactic) {
    return split_tactic_link(meta_split_tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19441) 
  public static final SubLObject meta_split_tactic_todo_indices(SubLObject meta_split_tactic) {
    return inference_datastructures_tactic.tactic_data(meta_split_tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19550) 
  public static final SubLObject meta_split_tactic_index_doneP(SubLObject meta_split_tactic, SubLObject index) {
    {
      SubLObject todo_indices = meta_split_tactic_todo_indices(meta_split_tactic);
      return makeBoolean((NIL == list_utilities.member_eqP(index, todo_indices)));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 20039) 
  public static final SubLObject determine_new_meta_split_tactics(SubLObject supported_problem, SubLObject dnf_clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject split_link = maybe_new_split_link(supported_problem, dnf_clause);
        SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(split_link);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((!(supporting_problem_count.numG(ONE_INTEGER)))) {
            Errors.error($str13$Tried_to_make_a_split_link_with_l, split_link);
          }
        }
        inference_worker.consider_that_problem_could_be_no_good(supported_problem, NIL, $kw14$TACTICAL, T);
        if ((NIL == inference_worker.no_good_problem_p(supported_problem, $kw14$TACTICAL))) {
          new_meta_split_tactic(supported_problem);
          return T;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 20669) 
  public static final SubLObject new_meta_split_tactic(SubLObject problem) {
    {
      SubLObject split_link = problem_sole_split_argument_link(problem);
      SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(split_link);
      SubLObject todo_indices = conses_high.copy_list(list_utilities.num_list(supporting_problem_count, UNPROVIDED));
      SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, $determine_new_split_tactics_module$.getGlobalValue(), todo_indices);
      inference_datastructures_tactic.note_tactic_progress_iterator(tactic, new_meta_split_progress_iterator(tactic));
      {
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw9$SKIP))) {
          {
            SubLObject idx_4 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_4, $kw9$SKIP))) {
              {
                SubLObject vector_var = id_index.id_index_old_objects(idx_4);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                  {
                    SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                    SubLObject inference = Vectors.aref(vector_var, id);
                    if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                           && (NIL != id_index.id_index_skip_tombstones_p($kw9$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw9$SKIP;
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
                                inference_tactician.strategy_note_new_tactic(strategy, tactic);
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
            SubLObject idx_5 = idx;
            if ((NIL == id_index.id_index_new_objects_empty_p(idx_5))) {
              {
                SubLObject cdohash_table = id_index.id_index_new_objects(idx_5);
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
                                inference_tactician.strategy_note_new_tactic(strategy, tactic);
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
      return tactic;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 21227) 
  public static final SubLObject compute_strategic_properties_of_meta_split_tactic(SubLObject tactic, SubLObject strategy) {
    if ((NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic)))) {
      inference_datastructures_tactic.set_tactic_preference_level(tactic, $meta_split_tactic_default_preference_level$.getGlobalValue(), $meta_split_tactic_default_preference_level_justification$.getGlobalValue());
    }
    inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, $meta_split_tactic_default_preference_level$.getGlobalValue(), $meta_split_tactic_default_preference_level_justification$.getGlobalValue());
    inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, ZERO_INTEGER);
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 21812) 
  public static final SubLObject new_meta_split_progress_iterator(SubLObject tactic) {
    return inference_datastructures_tactic.new_tactic_progress_iterator($kw25$META_STRUCTURAL, tactic, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 21961) 
  public static final SubLObject meta_structural_progress_iterator_doneP(SubLObject tactic) {
    if ((NIL != meta_split_tactic_p(tactic))) {
      return meta_split_progress_iterator_doneP(tactic);
    } else {
      return Errors.error($str26$unexpected_meta_structural_tactic, tactic);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22193) 
  public static final SubLObject meta_split_progress_iterator_doneP(SubLObject tactic) {
    {
      SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
      SubLObject todo_indices = meta_split_tactic_todo_indices(tactic);
      return makeBoolean(((NIL == todo_indices)
            || (NIL != inference_worker.no_good_problem_p(supported_problem, $kw14$TACTICAL))));
    }
  }

  /** If you set this to non-nil, it will trump the following variables. */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22463) 
  private static SubLSymbol $meta_split_criteria$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22613) 
  private static SubLSymbol $meta_split_tactics_do_single_literals_firstP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22685) 
  private static SubLSymbol $meta_split_favors_problem_reuseP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22745) 
  public static final SubLObject meta_split_criteria() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $meta_split_criteria$.getDynamicValue(thread))) {
        return $meta_split_criteria$.getDynamicValue(thread);
      } else if ((NIL != $meta_split_tactics_do_single_literals_firstP$.getDynamicValue(thread))) {
        return $list27;
      } else if ((NIL != $meta_split_favors_problem_reuseP$.getDynamicValue(thread))) {
        return $list28;
      } else {
        return $list29;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 23168) 
  public static final SubLObject execute_meta_split_tactic(SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        if ((NIL == inference_datastructures_problem.tactically_no_good_problem_p(supported_problem))) {
          {
            SubLObject split_link = meta_split_tactic_link(tactic);
            SubLObject problem_index_pairs = NIL;
            SubLObject doneP = NIL;
            if ((NIL == doneP)) {
              {
                SubLObject csome_list_var = meta_split_criteria();
                SubLObject meta_split_criterion = NIL;
                for (meta_split_criterion = csome_list_var.first(); (!(((NIL != doneP)
                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), meta_split_criterion = csome_list_var.first()) {
                  {
                    SubLObject index = ZERO_INTEGER;
                    SubLObject link_var = split_link;
                    SubLObject rest = NIL;
                    for (rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); (!(((NIL != doneP)
                          || (NIL == rest)))); rest = rest.rest()) {
                      {
                        SubLObject supporting_mapped_problem = rest.first();
                        if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
                          if ((NIL == meta_split_tactic_index_doneP(tactic, index))) {
                            {
                              SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                              thread.resetMultipleValues();
                              {
                                SubLObject applicableP = meta_split_criterion_applicableP(meta_split_criterion, supporting_problem);
                                SubLObject stop_after_each_oneP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if ((NIL != applicableP)) {
                                  problem_index_pairs = cons(list(index, supporting_problem), problem_index_pairs);
                                  if ((NIL != stop_after_each_oneP)) {
                                    doneP = T;
                                  }
                                }
                              }
                            }
                          }
                          index = Numbers.add(index, ONE_INTEGER);
                        }
                      }
                    }
                  }
                  if ((NIL != problem_index_pairs)) {
                    doneP = T;
                  }
                }
              }
            }
            meta_split_tactic_create_and_activate_split_tactics(tactic, supported_problem, problem_index_pairs);
          }
        }
      }
      return NIL;
    }
  }

  /** @return 0 booleanp; whether META-SPLIT-CRITERION applies to CONJUNCT-PROBLEM
   @return 1 booleanp; If NIL, all tactics leading to conjunct problems that pass the applicability
   test will be activated as a group.  If T, the first problem passing the applicability test
   will be activated by itself. */
  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 24279) 
  public static final SubLObject meta_split_criterion_applicableP(SubLObject meta_split_criterion, SubLObject conjunct_problem) {
    {
      SubLObject pcase_var = meta_split_criterion;
      if (pcase_var.eql($kw30$ONE_NO_GOOD)) {
        return Values.values(inference_datastructures_problem.tactically_no_good_problem_p(conjunct_problem), T);
      } else if (pcase_var.eql($kw31$ALL_SINGLE_LITERAL)) {
        return Values.values(inference_datastructures_problem.single_literal_problem_p(conjunct_problem), NIL);
      } else if (pcase_var.eql($kw32$ALL_PROBLEM_REUSE)) {
        return Values.values(Numbers.numG(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35370"), ONE_INTEGER), NIL);
      } else if (pcase_var.eql($kw33$ONE_CLOSED)) {
        return Values.values(inference_datastructures_problem.closed_problem_p(conjunct_problem), T);
      } else if (pcase_var.eql($kw34$ONE_CLOSED_PROBLEM_REUSE)) {
        return Values.values(makeBoolean(((NIL != inference_datastructures_problem.closed_problem_p(conjunct_problem))
                 && Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35371").numG(ONE_INTEGER))), T);
      } else if (pcase_var.eql($kw35$ALL_SINGLE_LITERAL_PROBLEM_REUSE)) {
        return Values.values(makeBoolean(((NIL != inference_datastructures_problem.single_literal_problem_p(conjunct_problem))
                 && Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35372").numG(ONE_INTEGER))), NIL);
      } else if (pcase_var.eql($kw36$ALL_THE_REST)) {
        return Values.values(T, NIL);
      } else {
        return Errors.error($str37$Unknown_meta_split_criterion__s, meta_split_criterion);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 25706) 
  public static final SubLObject meta_split_tactic_create_and_activate_split_tactics(SubLObject meta_split_tactic, SubLObject supported_problem, SubLObject problem_index_pairs) {
    {
      SubLObject split_tactics = NIL;
      SubLObject cdolist_list_var = problem_index_pairs;
      SubLObject pair = NIL;
      for (pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
        {
          SubLObject datum = pair;
          SubLObject current = datum;
          SubLObject index = NIL;
          SubLObject supporting_problem = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list38);
          index = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list38);
          supporting_problem = current.first();
          current = current.rest();
          if ((NIL == current)) {
            {
              SubLObject split_tactic = meta_split_tactic_create_one_split_tactic(meta_split_tactic, supported_problem, index);
              split_tactics = cons(split_tactic, split_tactics);
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list38);
          }
        }
      }
      note_split_tactics_strategically_possible(split_tactics);
      return split_tactics;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 26229) 
  public static final SubLObject meta_split_tactic_create_one_split_tactic(SubLObject meta_split_tactic, SubLObject supported_problem, SubLObject index) {
    meta_split_tactic_note_split_tactic_done(meta_split_tactic, index);
    return new_split_tactic(supported_problem, index);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 26453) 
  public static final SubLObject meta_split_tactic_note_split_tactic_done(SubLObject tactic, SubLObject index) {
    {
      SubLObject todo_indices = meta_split_tactic_todo_indices(tactic);
      todo_indices = Sequences.delete(index, todo_indices, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      inference_datastructures_tactic.set_meta_split_tactic_data(tactic, todo_indices);
    }
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 26714) 
  public static final SubLObject note_split_tactics_strategically_possible(SubLObject split_tactics) {
    if ((NIL != split_tactics)) {
      {
        SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(split_tactics.first());
        SubLObject prob = supported_problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw9$SKIP))) {
          {
            SubLObject idx_6 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_6, $kw9$SKIP))) {
              {
                SubLObject vector_var = id_index.id_index_old_objects(idx_6);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                  {
                    SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                    SubLObject inference = Vectors.aref(vector_var, id);
                    if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                           && (NIL != id_index.id_index_skip_tombstones_p($kw9$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw9$SKIP;
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
                                inference_tactician.strategy_note_split_tactics_strategically_possible(strategy, split_tactics);
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
            SubLObject idx_7 = idx;
            if ((NIL == id_index.id_index_new_objects_empty_p(idx_7))) {
              {
                SubLObject cdohash_table = id_index.id_index_new_objects(idx_7);
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
                                inference_tactician.strategy_note_split_tactics_strategically_possible(strategy, split_tactics);
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

  public static final SubLObject declare_inference_worker_split_file() {
    declareFunction(myName, "split_link_p", "SPLIT-LINK-P", 1, 0, false);
    declareFunction(myName, "maybe_new_split_link", "MAYBE-NEW-SPLIT-LINK", 2, 0, false);
    declareFunction(myName, "new_split_link", "NEW-SPLIT-LINK", 2, 0, false);
    declareFunction(myName, "destroy_split_link", "DESTROY-SPLIT-LINK", 1, 0, false);
    declareMacro(myName, "do_split_link_open_supporting_mapped_problems_numbered", "DO-SPLIT-LINK-OPEN-SUPPORTING-MAPPED-PROBLEMS-NUMBERED");
    declareFunction(myName, "split_link_tactic", "SPLIT-LINK-TACTIC", 2, 0, false);
    declareFunction(myName, "split_link_tactics", "SPLIT-LINK-TACTICS", 1, 0, false);
    declareFunction(myName, "close_split_link", "CLOSE-SPLIT-LINK", 1, 0, false);
    declareFunction(myName, "find_or_create_split_link_supporting_problems", "FIND-OR-CREATE-SPLIT-LINK-SUPPORTING-PROBLEMS", 2, 0, false);
    declareFunction(myName, "split_tactic_p", "SPLIT-TACTIC-P", 1, 0, false);
    declareFunction(myName, "new_split_tactic", "NEW-SPLIT-TACTIC", 2, 0, false);
    declareFunction(myName, "split_tactic_supporting_mapped_problem_index", "SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM-INDEX", 1, 0, false);
    declareFunction(myName, "split_tactic_link", "SPLIT-TACTIC-LINK", 1, 0, false);
    declareFunction(myName, "find_split_tactic_supporting_mapped_problem", "FIND-SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "find_split_tactic_supporting_problem", "FIND-SPLIT-TACTIC-SUPPORTING-PROBLEM", 1, 0, false);
    declareFunction(myName, "discard_all_other_possible_split_tactics", "DISCARD-ALL-OTHER-POSSIBLE-SPLIT-TACTICS", 1, 0, false);
    declareFunction(myName, "determine_new_split_tactics", "DETERMINE-NEW-SPLIT-TACTICS", 2, 0, false);
    declareFunction(myName, "compute_strategic_properties_of_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-SPLIT-TACTIC", 3, 0, false);
    declareFunction(myName, "compute_split_tactic_productivity", "COMPUTE-SPLIT-TACTIC-PRODUCTIVITY", 3, 0, false);
    declareFunction(myName, "compute_split_tactic_preference_level", "COMPUTE-SPLIT-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
    declareFunction(myName, "execute_split_tactic", "EXECUTE-SPLIT-TACTIC", 1, 0, false);
    declareFunction(myName, "problem_sole_split_argument_link", "PROBLEM-SOLE-SPLIT-ARGUMENT-LINK", 1, 0, false);
    declareFunction(myName, "problem_first_split_argument_link", "PROBLEM-FIRST-SPLIT-ARGUMENT-LINK", 1, 0, false);
    declareFunction(myName, "problem_has_split_argument_linkP", "PROBLEM-HAS-SPLIT-ARGUMENT-LINK?", 1, 0, false);
    declareFunction(myName, "split_tactic_lookahead_problem", "SPLIT-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
    declareFunction(myName, "split_link_supporting_problems_with_variables", "SPLIT-LINK-SUPPORTING-PROBLEMS-WITH-VARIABLES", 1, 0, false);
    declareFunction(myName, "new_split_proof", "NEW-SPLIT-PROOF", 2, 0, false);
    declareFunction(myName, "split_proof_p", "SPLIT-PROOF-P", 1, 0, false);
    declareFunction(myName, "bubble_up_proof_to_split_link", "BUBBLE-UP-PROOF-TO-SPLIT-LINK", 3, 0, false);
    declareFunction(myName, "all_literals_connected_by_shared_varsP", "ALL-LITERALS-CONNECTED-BY-SHARED-VARS?", 1, 0, false);
    declareFunction(myName, "determine_shared_variable_islands", "DETERMINE-SHARED-VARIABLE-ISLANDS", 1, 0, false);
    declareFunction(myName, "categorize_clause_variables_via_literals", "CATEGORIZE-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false);
    declareFunction(myName, "categorize_sensified_clause_variables_via_literals", "CATEGORIZE-SENSIFIED-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false);
    declareFunction(myName, "sensify_contextualized_clause", "SENSIFY-CONTEXTUALIZED-CLAUSE", 1, 0, false);
    declareFunction(myName, "unmake_sensified_literal", "UNMAKE-SENSIFIED-LITERAL", 1, 0, false);
    declareFunction(myName, "ground_sensified_literal_to_categorized_group", "GROUND-SENSIFIED-LITERAL-TO-CATEGORIZED-GROUP", 1, 0, false);
    declareFunction(myName, "categorized_group_to_problem_query", "CATEGORIZED-GROUP-TO-PROBLEM-QUERY", 1, 0, false);
    declareFunction(myName, "meta_split_tactics_enabledP", "META-SPLIT-TACTICS-ENABLED?", 0, 0, false);
    declareFunction(myName, "meta_split_tactic_p", "META-SPLIT-TACTIC-P", 1, 0, false);
    declareFunction(myName, "generalized_split_tactic_p", "GENERALIZED-SPLIT-TACTIC-P", 1, 0, false);
    declareFunction(myName, "meta_split_tactic_link", "META-SPLIT-TACTIC-LINK", 1, 0, false);
    declareFunction(myName, "meta_split_tactic_todo_indices", "META-SPLIT-TACTIC-TODO-INDICES", 1, 0, false);
    declareFunction(myName, "meta_split_tactic_index_doneP", "META-SPLIT-TACTIC-INDEX-DONE?", 2, 0, false);
    declareFunction(myName, "meta_split_tactic_productivity", "META-SPLIT-TACTIC-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "determine_new_meta_split_tactics", "DETERMINE-NEW-META-SPLIT-TACTICS", 2, 0, false);
    declareFunction(myName, "new_meta_split_tactic", "NEW-META-SPLIT-TACTIC", 1, 0, false);
    declareFunction(myName, "compute_strategic_properties_of_meta_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-SPLIT-TACTIC", 2, 0, false);
    declareFunction(myName, "new_meta_split_progress_iterator", "NEW-META-SPLIT-PROGRESS-ITERATOR", 1, 0, false);
    declareFunction(myName, "meta_structural_progress_iterator_doneP", "META-STRUCTURAL-PROGRESS-ITERATOR-DONE?", 1, 0, false);
    declareFunction(myName, "meta_split_progress_iterator_doneP", "META-SPLIT-PROGRESS-ITERATOR-DONE?", 1, 0, false);
    declareFunction(myName, "meta_split_criteria", "META-SPLIT-CRITERIA", 0, 0, false);
    declareFunction(myName, "execute_meta_split_tactic", "EXECUTE-META-SPLIT-TACTIC", 1, 0, false);
    declareFunction(myName, "meta_split_criterion_applicableP", "META-SPLIT-CRITERION-APPLICABLE?", 2, 0, false);
    declareFunction(myName, "meta_split_tactic_create_and_activate_split_tactics", "META-SPLIT-TACTIC-CREATE-AND-ACTIVATE-SPLIT-TACTICS", 3, 0, false);
    declareFunction(myName, "meta_split_tactic_create_one_split_tactic", "META-SPLIT-TACTIC-CREATE-ONE-SPLIT-TACTIC", 3, 0, false);
    declareFunction(myName, "meta_split_tactic_note_split_tactic_done", "META-SPLIT-TACTIC-NOTE-SPLIT-TACTIC-DONE", 2, 0, false);
    declareFunction(myName, "note_split_tactics_strategically_possible", "NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_worker_split_file() {
    $split_module$ = defparameter("*SPLIT-MODULE*", inference_modules.inference_structural_module($kw0$SPLIT, UNPROVIDED));
    $split_tactic_default_preference_level$ = deflexical("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $kw15$PREFERRED);
    $split_tactic_default_preference_level_justification$ = deflexical("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $str16$the_default_for_split_tactics);
    $meta_split_tactics_enabledP$ = defparameter("*META-SPLIT-TACTICS-ENABLED?*", T);
    $determine_new_split_tactics_module$ = deflexical("*DETERMINE-NEW-SPLIT-TACTICS-MODULE*", ((NIL != Symbols.boundp($sym22$_DETERMINE_NEW_SPLIT_TACTICS_MODULE_)) ? ((SubLObject) $determine_new_split_tactics_module$.getGlobalValue()) : inference_modules.inference_meta_structural_module($kw23$DETERMINE_NEW_SPLIT_TACTICS, UNPROVIDED)));
    $meta_split_tactic_default_preference_level$ = deflexical("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $kw15$PREFERRED);
    $meta_split_tactic_default_preference_level_justification$ = deflexical("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $str24$the_default_for_meta_split_tactic);
    $meta_split_criteria$ = defparameter("*META-SPLIT-CRITERIA*", NIL);
    $meta_split_tactics_do_single_literals_firstP$ = defparameter("*META-SPLIT-TACTICS-DO-SINGLE-LITERALS-FIRST?*", T);
    $meta_split_favors_problem_reuseP$ = defparameter("*META-SPLIT-FAVORS-PROBLEM-REUSE?*", T);
    return NIL;
  }

  public static final SubLObject setup_inference_worker_split_file() {
    // CVS_ID("Id: inference-worker-split.lisp 128648 2009-08-27 17:23:55Z pace ");
    subl_macro_promotions.declare_defglobal($sym22$_DETERMINE_NEW_SPLIT_TACTICS_MODULE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$SPLIT = makeKeyword("SPLIT");
  public static final SubLList $list1 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("INDEX-VAR"), makeSymbol("SPLIT-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym2$SPLIT_LINK_VAR = makeUninternedSymbol("SPLIT-LINK-VAR");
  public static final SubLSymbol $sym3$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym4$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS_NUMBERED = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS-NUMBERED");
  public static final SubLSymbol $sym5$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym6$PROBLEM_LINK_INDEX_OPEN_ = makeSymbol("PROBLEM-LINK-INDEX-OPEN?");
  public static final SubLString $str7$_s_is_not_a_supporting_mapped_pro = makeString("~s is not a supporting mapped problem of ~s.");
  public static final SubLString $str8$couldn_t_find_any_split_tactics_f = makeString("couldn't find any split tactics for ~s");
  public static final SubLSymbol $kw9$SKIP = makeKeyword("SKIP");
  public static final SubLString $str10$Could_not_find_the_link_for__a = makeString("Could not find the link for ~a");
  public static final SubLSymbol $sym11$SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");
  public static final SubLString $str12$Generalized_tactic__a_did_not_ind = makeString("Generalized tactic ~a did not indicate a valid supporting mapped problem");
  public static final SubLString $str13$Tried_to_make_a_split_link_with_l = makeString("Tried to make a split link with less than two supporting problems: ~a");
  public static final SubLSymbol $kw14$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $kw15$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLString $str16$the_default_for_split_tactics = makeString("the default for split tactics");
  public static final SubLSymbol $kw17$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLSymbol $kw18$PROVEN = makeKeyword("PROVEN");
  public static final SubLSymbol $kw19$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw20$POS = makeKeyword("POS");
  public static final SubLSymbol $sym21$HL_VARIABLE_P = makeSymbol("HL-VARIABLE-P");
  public static final SubLSymbol $sym22$_DETERMINE_NEW_SPLIT_TACTICS_MODULE_ = makeSymbol("*DETERMINE-NEW-SPLIT-TACTICS-MODULE*");
  public static final SubLSymbol $kw23$DETERMINE_NEW_SPLIT_TACTICS = makeKeyword("DETERMINE-NEW-SPLIT-TACTICS");
  public static final SubLString $str24$the_default_for_meta_split_tactic = makeString("the default for meta-split tactics");
  public static final SubLSymbol $kw25$META_STRUCTURAL = makeKeyword("META-STRUCTURAL");
  public static final SubLString $str26$unexpected_meta_structural_tactic = makeString("unexpected meta-structural tactic ~s");
  public static final SubLList $list27 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ALL-SINGLE-LITERAL"), makeKeyword("ALL-THE-REST"));
  public static final SubLList $list28 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ONE-CLOSED-PROBLEM-REUSE"), makeKeyword("ALL-SINGLE-LITERAL-PROBLEM-REUSE"), makeKeyword("ONE-CLOSED"), makeKeyword("ALL-THE-REST"));
  public static final SubLList $list29 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ONE-CLOSED"), makeKeyword("ALL-THE-REST"));
  public static final SubLSymbol $kw30$ONE_NO_GOOD = makeKeyword("ONE-NO-GOOD");
  public static final SubLSymbol $kw31$ALL_SINGLE_LITERAL = makeKeyword("ALL-SINGLE-LITERAL");
  public static final SubLSymbol $kw32$ALL_PROBLEM_REUSE = makeKeyword("ALL-PROBLEM-REUSE");
  public static final SubLSymbol $kw33$ONE_CLOSED = makeKeyword("ONE-CLOSED");
  public static final SubLSymbol $kw34$ONE_CLOSED_PROBLEM_REUSE = makeKeyword("ONE-CLOSED-PROBLEM-REUSE");
  public static final SubLSymbol $kw35$ALL_SINGLE_LITERAL_PROBLEM_REUSE = makeKeyword("ALL-SINGLE-LITERAL-PROBLEM-REUSE");
  public static final SubLSymbol $kw36$ALL_THE_REST = makeKeyword("ALL-THE-REST");
  public static final SubLString $str37$Unknown_meta_split_criterion__s = makeString("Unknown meta-split criterion ~s");
  public static final SubLList $list38 = list(makeSymbol("INDEX"), makeSymbol("SUPPORTING-PROBLEM"));

  //// Initializers

  public void declareFunctions() {
    declare_inference_worker_split_file();
  }

  public void initializeVariables() {
    init_inference_worker_split_file();
  }

  public void runTopLevelForms() {
    setup_inference_worker_split_file();
  }

}
