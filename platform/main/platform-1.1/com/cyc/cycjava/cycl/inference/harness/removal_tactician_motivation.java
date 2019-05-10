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
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.inference.harness.removal_tactician;
import com.cyc.cycjava.cycl.inference.harness.removal_tactician_datastructures;
import com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class removal_tactician_motivation extends SubLTranslatedFile {

  //// Constructor

  private removal_tactician_motivation() {}
  public static final SubLFile me = new removal_tactician_motivation();
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation";

  //// Definitions

  /** @return booleanp */
  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 1462) 
  public static final SubLObject removal_strategy_possibly_propagate_motivation_to_link_head(SubLObject strategy, SubLObject link_head) {
    checkType(link_head, $sym7$MOTIVATION_STRATEGEM_P);
    {
      SubLObject already_motivatedP = removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, link_head);
      if ((NIL == already_motivatedP)) {
        removal_strategy_propagate_motivation_to_link_head(strategy, link_head);
        return T;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 1941) 
  public static final SubLObject removal_strategy_propagate_motivation_to_link_head(SubLObject strategy, SubLObject link_head) {
    checkType(strategy, $sym8$REMOVAL_STRATEGY_P);
    checkType(link_head, $sym7$MOTIVATION_STRATEGEM_P);
    removal_tactician_datastructures.removal_strategy_note_link_head_motivated(strategy, link_head);
    if ((NIL != inference_worker_transformation.transformation_link_p(link_head))) {
    } else if ((NIL != inference_tactician.motivation_strategem_link_p(link_head))) {
      {
        SubLObject link = link_head;
        SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(link);
        removal_strategy_possibly_propagate_motivation_to_problem(strategy, supporting_problem);
      }
    } else {
      {
        SubLObject tactic = link_head;
        if ((NIL != inference_worker_join.join_tactic_p(tactic))) {
          {
            SubLObject join_link = inference_worker_join.join_tactic_link(tactic);
            SubLObject first_problem = inference_worker_join.join_link_first_problem(join_link);
            SubLObject second_problem = inference_worker_join.join_link_second_problem(join_link);
            removal_strategy_possibly_propagate_motivation_to_problem(strategy, first_problem);
            removal_strategy_possibly_propagate_motivation_to_problem(strategy, second_problem);
          }
        } else {
          {
            SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
            removal_strategy_possibly_propagate_motivation_to_problem(strategy, lookahead_problem);
          }
        }
      }
    }
    return NIL;
  }

  /** @return booleanp */
  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 3251) 
  public static final SubLObject removal_strategy_link_motivates_problemP(SubLObject strategy, SubLObject link, SubLObject problem) {
    if ((problem == UNPROVIDED)) {
      problem = NIL;
    }
    if ((NIL == inference_worker_split.split_link_p(link))) {
      return removal_strategy_link_motivates_lookahead_problemP(strategy, link);
    } else {
      {
        SubLObject motivatedP = NIL;
        SubLObject problem_var = problem;
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (!(((NIL != motivatedP)
              || (NIL != set_contents.do_set_contents_doneP(basis_object, state))))); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link))) {
              {
                SubLObject link_var = dependent_link;
                SubLObject rest = NIL;
                for (rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); (!(((NIL != motivatedP)
                      || (NIL == rest)))); rest = rest.rest()) {
                  {
                    SubLObject mapped_problem = rest.first();
                    if ((NIL != inference_macros.do_problem_link_open_matchP(T, link_var, mapped_problem))) {
                      if ((problem_var == inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) {
                        {
                          SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                          SubLObject rest_1 = NIL;
                          for (rest_1 = inference_datastructures_problem.problem_tactics(supported_problem); (!(((NIL != motivatedP)
                                || (NIL == rest_1)))); rest_1 = rest_1.rest()) {
                            {
                              SubLObject tactic = rest_1.first();
                              if ((NIL != inference_worker_split.split_tactic_p(tactic))) {
                                {
                                  SubLObject supporting_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(tactic);
                                  if ((mapped_problem == supporting_mapped_problem)) {
                                    if ((NIL != removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, tactic))) {
                                      motivatedP = T;
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
        return motivatedP;
      }
    }
  }

  /** @return booleanp */
  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 4160) 
  public static final SubLObject removal_strategy_link_motivates_lookahead_problemP(SubLObject strategy, SubLObject link) {
    if ((NIL != inference_tactician.motivation_strategem_link_p(link))) {
      return removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, link);
    } else if ((NIL != inference_worker_split.split_link_p(link))) {
      return NIL;
    } else if ((NIL != inference_worker.logical_link_p(link))) {
      {
        SubLObject tactic = inference_worker.logical_link_unique_tactic(link);
        return removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, tactic);
      }
    } else {
      return NIL;
    }
  }

  /** @return booleanp */
  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 4580) 
  public static final SubLObject removal_strategy_possibly_propagate_motivation_to_problem(SubLObject strategy, SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject already_motivatedP = inference_datastructures_strategy.problem_motivatedP(problem, strategy);
        if ((NIL == already_motivatedP)) {
          removal_tactician_datastructures.removal_strategy_note_problem_motivated(strategy, problem);
          {
            SubLObject problem_var = problem;
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
              {
                SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link))) {
                  if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $kw9$JOIN_ORDERED))) {
                    {
                      SubLObject link_var = join_ordered_link;
                      SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                      SubLObject mapped_problem = NIL;
                      for (mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mapped_problem = cdolist_list_var.first()) {
                        if ((NIL != inference_macros.do_problem_link_open_matchP(T, link_var, mapped_problem))) {
                          if ((problem_var == inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) {
                            if ((NIL != removal_strategy_link_motivates_problemP(strategy, join_ordered_link, problem))) {
                              {
                                SubLObject status_var = $kw10$PROVEN;
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem));
                                while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                                  thread.resetMultipleValues();
                                  {
                                    SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject proof_list = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                      SubLObject cdolist_list_var_2 = proof_list;
                                      SubLObject proof = NIL;
                                      for (proof = cdolist_list_var_2.first(); (NIL != cdolist_list_var_2); cdolist_list_var_2 = cdolist_list_var_2.rest(), proof = cdolist_list_var_2.first()) {
                                        if ((NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var))) {
                                          {
                                            SubLObject restricted_non_focal_mapped_problem = Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36363");
                                            SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_non_focal_mapped_problem);
                                            removal_strategy_possibly_propagate_motivation_to_problem(strategy, restricted_non_focal_problem);
                                          }
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
                  }
                }
              }
            }
          }
          if ((NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy))) {
            removal_strategy_possibly_activate_problem(strategy, problem);
          }
          return T;
        }
        return NIL;
      }
    }
  }

  /** @return booleanp; whether STRATEGY chose to activate PROBLEM. */
  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 5996) 
  public static final SubLObject removal_strategy_possibly_activate_problem(SubLObject strategy, SubLObject problem) {
    if ((NIL != removal_strategy_chooses_not_to_examine_problemP(strategy, problem))) {
      return NIL;
    }
    inference_worker.determine_strategic_status_wrt(problem, strategy);
    if ((NIL != removal_strategy_chooses_not_to_activate_problemP(strategy, problem))) {
      return NIL;
    }
    if ((NIL != inference_worker_restriction.problem_is_a_simplificationP(problem))) {
      removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
    }
    if ((NIL != removal_strategy_problem_is_the_rest_of_a_removalP(problem, strategy))) {
      removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
    }
    if ((NIL != removal_strategy_motivates_problem_via_rewriteP(strategy, problem))) {
      removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
    }
    if ((NIL != removal_strategy_problem_is_the_rest_of_a_join_orderedP(problem, strategy))) {
      removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(strategy, problem);
    }
    {
      SubLObject activateP = makeBoolean(((NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy))
           && (NIL == removal_strategy_chooses_not_to_activate_problemP(strategy, problem))));
      if ((NIL != activateP)) {
        if ((NIL != removal_strategy_activate_problem(strategy, problem))) {
          return T;
        } else {
          removal_strategy_make_problem_pending(strategy, problem);
          return NIL;
        }
      }
    }
    return NIL;
  }

  /** if you are a restricted non-focal problem of some (open?) join-ordered link which has R,
   you get R.  you're the rest of a removal. */
  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 8087) 
  public static final SubLObject removal_strategy_problem_is_the_rest_of_a_removalP(SubLObject problem, SubLObject strategy) {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, restriction_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $kw11$RESTRICTION))) {
              {
                SubLObject non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                SubLObject set_contents_var_3 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                SubLObject basis_object_4 = set_contents.do_set_contents_basis_object(set_contents_var_3);
                SubLObject state_5 = NIL;
                for (state_5 = set_contents.do_set_contents_initial_state(basis_object_4, set_contents_var_3); (NIL == set_contents.do_set_contents_doneP(basis_object_4, state_5)); state_5 = set_contents.do_set_contents_update_state(state_5)) {
                  {
                    SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object_4, state_5);
                    if ((NIL != set_contents.do_set_contents_element_validP(state_5, join_ordered_link))) {
                      if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $kw9$JOIN_ORDERED))) {
                        if ((NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link))) {
                          if ((non_focal_problem == inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link))) {
                            if (((NIL != inference_datastructures_problem_link.problem_link_openP(join_ordered_link))
                                 && (NIL != removal_strategy_link_motivates_lookahead_problemP(strategy, join_ordered_link)))) {
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
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 8559) 
  public static final SubLObject removal_strategy_problem_is_the_rest_of_a_join_orderedP(SubLObject problem, SubLObject strategy) {
    {
      SubLObject part_of_join_orderedP = NIL;
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (!(((NIL != part_of_join_orderedP)
            || (NIL != set_contents.do_set_contents_doneP(basis_object, state))))); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, restriction_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $kw11$RESTRICTION))) {
              {
                SubLObject non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                SubLObject set_contents_var_6 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                SubLObject basis_object_7 = set_contents.do_set_contents_basis_object(set_contents_var_6);
                SubLObject state_8 = NIL;
                for (state_8 = set_contents.do_set_contents_initial_state(basis_object_7, set_contents_var_6); (!(((NIL != part_of_join_orderedP)
                      || (NIL != set_contents.do_set_contents_doneP(basis_object_7, state_8))))); state_8 = set_contents.do_set_contents_update_state(state_8)) {
                  {
                    SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object_7, state_8);
                    if ((NIL != set_contents.do_set_contents_element_validP(state_8, join_ordered_link))) {
                      if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $kw9$JOIN_ORDERED))) {
                        if ((NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link))) {
                          if ((non_focal_problem == inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link))) {
                            part_of_join_orderedP = T;
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
      return part_of_join_orderedP;
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 8883) 
  public static final SubLObject removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(SubLObject strategy, SubLObject problem) {
    return NIL;
  }

  /** if you are a supporting rewritten problem of a rewrite link whose supported problem has R,
   you get R. */
  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 10063) 
  public static final SubLObject removal_strategy_motivates_problem_via_rewriteP(SubLObject strategy, SubLObject problem) {
    if ((NIL != inference_datastructures_problem_store.problem_store_rewrite_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy)))) {
      {
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
              if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $kw12$REWRITE))) {
                if ((NIL != inference_datastructures_strategy.problem_motivatedP(inference_datastructures_problem_link.problem_link_supported_problem(link), strategy))) {
                  return T;
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 10562) 
  public static final SubLObject removal_strategy_chooses_not_to_examine_problemP(SubLObject strategy, SubLObject problem) {
    return inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 10799) 
  public static final SubLObject removal_strategy_chooses_not_to_activate_problemP(SubLObject strategy, SubLObject problem) {
    return makeBoolean(((NIL != removal_tactician_datastructures.removal_strategy_problem_activeP(strategy, problem))
          || (NIL != removal_tactician_datastructures.removal_strategy_problem_pendingP(strategy, problem))));
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 11011) 
  public static final SubLObject removal_strategy_activate_problem(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym8$REMOVAL_STRATEGY_P);
    checkType(problem, $sym13$PROBLEM_P);
    return Numbers.plusp(removal_strategy_possibly_activate_strategems(strategy, problem));
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 11239) 
  public static final SubLObject removal_strategy_possibly_activate_strategems(SubLObject strategy, SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject strategems_to_activate = removal_strategy_categorize_strategems(strategy, problem);
        SubLObject strategems_to_set_aside = thread.secondMultipleValue();
        SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        {
          SubLObject cdolist_list_var = strategems_to_activate;
          SubLObject strategem = NIL;
          for (strategem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), strategem = cdolist_list_var.first()) {
            removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
          }
        }
        {
          SubLObject cdolist_list_var = strategems_to_set_aside;
          SubLObject strategem = NIL;
          for (strategem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), strategem = cdolist_list_var.first()) {
            removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, strategem);
            if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
              inference_datastructures_strategy.set_tactic_set_aside_wrt(strategem, strategy, $kw14$REMOVAL);
            }
          }
        }
        {
          SubLObject cdolist_list_var = strategems_to_throw_away;
          SubLObject strategem = NIL;
          for (strategem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), strategem = cdolist_list_var.first()) {
            removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, strategem);
            if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
              inference_datastructures_strategy.set_tactic_thrown_away_wrt(strategem, strategy, $kw14$REMOVAL);
            }
          }
        }
        return Sequences.length(strategems_to_activate);
      }
    }
  }

  /** The tactic types to use the RL tactician's ordering for. */
  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 12889) 
  private static SubLSymbol $removal_strategy_rl_tactician_tactic_types$ = null;

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 15580) 
  public static final SubLObject removal_strategy_note_new_tactic(SubLObject strategy, SubLObject tactic) {
    inference_worker.default_compute_strategic_properties_of_tactic(strategy, tactic);
    if ((!((((NIL != inference_worker_split.split_tactic_p(tactic))
             && (NIL != inference_worker_split.meta_split_tactics_enabledP()))
          || (NIL != inference_worker_transformation.transformation_tactic_p(tactic))
          || (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategy, tactic)))))) {
      removal_strategy_note_new_tactic_possible(strategy, tactic);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 16126) 
  public static final SubLObject removal_strategy_note_split_tactics_strategically_possible(SubLObject strategy, SubLObject split_tactics) {
    {
      SubLObject sorted_split_tactics = inference_tactician.strategy_sort(strategy, conses_high.copy_list(split_tactics), $sym17$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
      SubLObject cdolist_list_var = Sequences.reverse(sorted_split_tactics);
      SubLObject split_tactic = NIL;
      for (split_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), split_tactic = cdolist_list_var.first()) {
        removal_strategy_note_new_tactic_possible(strategy, split_tactic);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 16516) 
  public static final SubLObject removal_strategy_note_new_tactic_possible(SubLObject strategy, SubLObject tactic) {
    {
      SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
      inference_datastructures_strategy.problem_note_tactic_strategically_possible(problem, tactic, strategy);
    }
    if ((((NIL != inference_worker_split.meta_split_tactics_enabledP())
           && (NIL != inference_worker_split.split_tactic_p(tactic)))
        || ((NIL != inference_worker_transformation.transformation_tactic_p(tactic))
           && (NIL == inference_worker_transformation.meta_transformation_tactic_p(tactic))))) {
      {
        SubLObject problem_already_consideredP = T;
        removal_tactician_datastructures.removal_strategy_note_problem_unpending(strategy, inference_datastructures_tactic.tactic_problem(tactic));
        if ((NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, NIL))) {
          removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, tactic);
        } else if ((NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, problem_already_consideredP, NIL, T))) {
          removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, tactic);
        } else {
          removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, tactic);
        }
      }
    }
    return NIL;
  }

  /** @return 0 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to activate wrt removal.
   Strategems are ordered in intended order of activation.
   @return 1 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to set aside wrt removal.
   @return 2 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to throw away wrt removal. */
  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 18015) 
  public static final SubLObject removal_strategy_categorize_strategems(SubLObject strategy, SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject strategems_to_activate = NIL;
        SubLObject strategems_to_set_aside = NIL;
        SubLObject strategems_to_throw_away = NIL;
        SubLObject problem_set_asideP = removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, problem, UNPROVIDED, UNPROVIDED);
        SubLObject problem_thrown_awayP = removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED);
        thread.resetMultipleValues();
        {
          SubLObject best_complete_removal_tactic = removal_strategy_categorize_removal_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
          SubLObject possible_non_complete_removal_tactics = thread.secondMultipleValue();
          SubLObject set_aside_removal_tactics = thread.thirdMultipleValue();
          SubLObject thrown_away_removal_tactics = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          thread.resetMultipleValues();
          {
            SubLObject possible_motivation_strategems = removal_strategy_categorize_motivation_strategems(strategy, problem, problem_set_asideP, problem_thrown_awayP);
            SubLObject set_aside_motivation_strategems = thread.secondMultipleValue();
            SubLObject thrown_away_motivation_strategems = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            strategems_to_set_aside = ConsesLow.append(set_aside_removal_tactics, set_aside_motivation_strategems);
            strategems_to_throw_away = ConsesLow.append(thrown_away_removal_tactics, thrown_away_motivation_strategems);
            possible_non_complete_removal_tactics = Sequences.nreverse(possible_non_complete_removal_tactics);
            possible_motivation_strategems = Sequences.nreverse(possible_motivation_strategems);
            {
              SubLObject cdolist_list_var = possible_motivation_strategems;
              SubLObject logical_tactic = NIL;
              for (logical_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), logical_tactic = cdolist_list_var.first()) {
                strategems_to_activate = cons(logical_tactic, strategems_to_activate);
              }
            }
            {
              SubLObject cdolist_list_var = possible_non_complete_removal_tactics;
              SubLObject removal_tactic = NIL;
              for (removal_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), removal_tactic = cdolist_list_var.first()) {
                strategems_to_activate = cons(removal_tactic, strategems_to_activate);
              }
            }
            if ((NIL != best_complete_removal_tactic)) {
              strategems_to_activate = cons(best_complete_removal_tactic, strategems_to_activate);
            }
            {
              SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
              SubLObject meta_structural_tactic = NIL;
              for (meta_structural_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), meta_structural_tactic = cdolist_list_var.first()) {
                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(meta_structural_tactic, $kw19$META_STRUCTURAL))) {
                  strategems_to_activate = cons(meta_structural_tactic, strategems_to_activate);
                }
              }
            }
            strategems_to_activate = Sequences.nreverse(strategems_to_activate);
          }
        }
        return Values.values(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 20720) 
  public static final SubLObject removal_strategy_categorize_motivation_strategems(SubLObject strategy, SubLObject problem, SubLObject problem_set_asideP, SubLObject problem_thrown_awayP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject possible_motivation_strategems = NIL;
        SubLObject set_aside_motivation_strategems = NIL;
        SubLObject thrown_away_motivation_strategems = NIL;
        if ((NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
        } else if ((NIL != inference_datastructures_problem.multi_clause_problem_p(problem))) {
          thread.resetMultipleValues();
          {
            SubLObject possible_motivation_strategems_9 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36391");
            SubLObject set_aside_motivation_strategems_10 = thread.secondMultipleValue();
            SubLObject thrown_away_motivation_strategems_11 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            possible_motivation_strategems = possible_motivation_strategems_9;
            set_aside_motivation_strategems = set_aside_motivation_strategems_10;
            thrown_away_motivation_strategems = thrown_away_motivation_strategems_11;
          }
        } else if ((NIL != inference_datastructures_problem.problem_has_split_tacticsP(problem))) {
          thread.resetMultipleValues();
          {
            SubLObject possible_motivation_strategems_12 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36392");
            SubLObject set_aside_motivation_strategems_13 = thread.secondMultipleValue();
            SubLObject thrown_away_motivation_strategems_14 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            possible_motivation_strategems = possible_motivation_strategems_12;
            set_aside_motivation_strategems = set_aside_motivation_strategems_13;
            thrown_away_motivation_strategems = thrown_away_motivation_strategems_14;
          }
        } else {
          thread.resetMultipleValues();
          {
            SubLObject possible_motivation_strategems_15 = removal_strategy_categorize_connected_conjunction_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
            SubLObject set_aside_motivation_strategems_16 = thread.secondMultipleValue();
            SubLObject thrown_away_motivation_strategems_17 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            possible_motivation_strategems = possible_motivation_strategems_15;
            set_aside_motivation_strategems = set_aside_motivation_strategems_16;
            thrown_away_motivation_strategems = thrown_away_motivation_strategems_17;
          }
        }
        return Values.values(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
      }
    }
  }

  /** Possible non-complete removal tactics should be in the reverse intended activation order */
  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 22004) 
  public static final SubLObject removal_strategy_categorize_removal_tactics(SubLObject strategy, SubLObject problem, SubLObject problem_set_asideP, SubLObject problem_thrown_awayP) {
    {
      SubLObject best_complete_removal_tactic = NIL;
      SubLObject best_complete_removal_tactic_productivity = NIL;
      SubLObject set_aside_removal_tactics = NIL;
      SubLObject possible_non_complete_removal_tactics = NIL;
      if ((NIL == problem_thrown_awayP)) {
        {
          SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
          SubLObject removal_tactic = NIL;
          for (removal_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), removal_tactic = cdolist_list_var.first()) {
            if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $kw20$GENERALIZED_REMOVAL_OR_REWRITE))
                 && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $kw21$POSSIBLE)))) {
              if ((NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, removal_tactic, T, UNPROVIDED))) {
                if (((NIL != problem_set_asideP)
                    || (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, removal_tactic, T, UNPROVIDED, UNPROVIDED)))) {
                  if ((NIL == best_complete_removal_tactic)) {
                    set_aside_removal_tactics = cons(removal_tactic, set_aside_removal_tactics);
                  }
                } else {
                  {
                    SubLObject completeness = inference_datastructures_strategy.tactic_strategic_completeness(removal_tactic, strategy);
                    SubLObject pcase_var = completeness;
                    if (pcase_var.eql($kw22$COMPLETE)) {
                      {
                        SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(removal_tactic, strategy);
                        if (((NIL == best_complete_removal_tactic)
                            || (NIL != inference_datastructures_enumerated_types.productivity_L(productivity, best_complete_removal_tactic_productivity)))) {
                          best_complete_removal_tactic = removal_tactic;
                          best_complete_removal_tactic_productivity = productivity;
                          if ((NIL == inference_worker_removal.meta_removal_tactic_p(best_complete_removal_tactic))) {
                            possible_non_complete_removal_tactics = NIL;
                            set_aside_removal_tactics = NIL;
                          }
                        }
                      }
                    } else if ((pcase_var.eql($kw23$INCOMPLETE)
                        || pcase_var.eql($kw24$GROSSLY_INCOMPLETE))) {
                      if (((NIL == best_complete_removal_tactic)
                          || (NIL != inference_worker_removal.meta_removal_tactic_p(best_complete_removal_tactic)))) {
                        possible_non_complete_removal_tactics = cons(removal_tactic, possible_non_complete_removal_tactics);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        possible_non_complete_removal_tactics = inference_tactician.strategy_sort(strategy, possible_non_complete_removal_tactics, $sym25$TACTIC_STRATEGIC_PRODUCTIVITY__);
      }
      {
        SubLObject thrown_away_removal_tactics = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject removal_tactic = NIL;
        for (removal_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), removal_tactic = cdolist_list_var.first()) {
          if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $kw20$GENERALIZED_REMOVAL_OR_REWRITE))
               && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $kw21$POSSIBLE)))) {
            if ((!(((removal_tactic == best_complete_removal_tactic)
                  || (NIL != list_utilities.member_eqP(removal_tactic, possible_non_complete_removal_tactics))
                  || (NIL != list_utilities.member_eqP(removal_tactic, set_aside_removal_tactics)))))) {
              thrown_away_removal_tactics = cons(removal_tactic, thrown_away_removal_tactics);
            }
          }
        }
        return Values.values(best_complete_removal_tactic, possible_non_complete_removal_tactics, set_aside_removal_tactics, thrown_away_removal_tactics);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 27507) 
  public static final SubLObject removal_strategy_categorize_connected_conjunction_tactics(SubLObject strategy, SubLObject problem, SubLObject problem_set_asideP, SubLObject problem_thrown_awayP) {
    {
      SubLObject possible_motivation_strategems = NIL;
      SubLObject set_aside_motivation_strategems = NIL;
      SubLObject committed_tactic = NIL;
      SubLObject committed_tactic_productivity = $kw29$POSITIVE_INFINITY;
      SubLObject committed_tactic_preference = $kw30$DISALLOWED;
      SubLObject committed_tactic_module_spec = $kw9$JOIN_ORDERED;
      SubLObject committed_tactic_literal_count = ZERO_INTEGER;
      SubLObject cheap_backtracking_tactics = NIL;
      if ((NIL == problem_thrown_awayP)) {
        {
          SubLObject problem_var = problem;
          SubLObject type_var = $kw31$CONNECTED_CONJUNCTION;
          SubLObject subsuming_join_ordered_tactics = inference_tactician.problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem_var, type_var);
          SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem_var);
          SubLObject candidate_tactic = NIL;
          for (candidate_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate_tactic = cdolist_list_var.first()) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, type_var))) {
              if ((NIL == inference_tactician.some_subsuming_join_ordered_tacticP(candidate_tactic, subsuming_join_ordered_tactics, strategy))) {
                {
                  SubLObject link = inference_worker.logical_tactic_link(candidate_tactic);
                  SubLObject candidate_tactic_module_spec = ((NIL != inference_worker_join.join_tactic_p(candidate_tactic)) ? ((SubLObject) $kw32$JOIN) : $kw9$JOIN_ORDERED);
                  if ((NIL == removal_strategy_link_motivates_problemP(strategy, link, UNPROVIDED))) {
                    if ((NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_connected_conjunction_linkP(strategy, link))) {
                      if (((NIL != problem_set_asideP)
                          || (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_connected_conjunction_linkP(strategy, link)))) {
                        set_aside_motivation_strategems = cons(candidate_tactic, set_aside_motivation_strategems);
                      } else {
                        {
                          SubLObject candidate_tactic_productivity = inference_lookahead_productivity.tactic_max_removal_productivity(candidate_tactic, strategy);
                          SubLObject candidate_tactic_preference = inference_datastructures_strategy.tactic_strategic_preference_level(candidate_tactic, strategy);
                          SubLObject candidate_tactic_literal_count = inference_worker.connected_conjunction_tactic_literal_count(candidate_tactic);
                          SubLObject magic_wandP = inference_tactician_utilities.magic_wand_tacticP(candidate_tactic, strategy);
                          if ((NIL != magic_wandP)) {
                            candidate_tactic_preference = $kw30$DISALLOWED;
                          }
                          if (((NIL == committed_tactic)
                              || (NIL != removal_strategy_deems_conjunctive_tactic_spec_betterP(strategy, candidate_tactic, candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literal_count, committed_tactic, committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literal_count)))) {
                            committed_tactic = candidate_tactic;
                            committed_tactic_productivity = candidate_tactic_productivity;
                            committed_tactic_preference = candidate_tactic_preference;
                            committed_tactic_module_spec = candidate_tactic_module_spec;
                            committed_tactic_literal_count = candidate_tactic_literal_count;
                          }
                          if (((NIL == magic_wandP)
                               && (NIL != removal_strategy_logical_tactic_removal_backtracking_cheapP(candidate_tactic, strategy)))) {
                            cheap_backtracking_tactics = cons(candidate_tactic, cheap_backtracking_tactics);
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
        if ((NIL != committed_tactic)) {
          if ((NIL != removal_strategy_commits_to_no_removal_backtrackingP(strategy, committed_tactic, committed_tactic_preference))) {
            cheap_backtracking_tactics = NIL;
          } else {
            cheap_backtracking_tactics = list_utilities.delete_first(committed_tactic, cheap_backtracking_tactics, Symbols.symbol_function(EQ));
          }
          possible_motivation_strategems = cons(committed_tactic, possible_motivation_strategems);
          {
            SubLObject cdolist_list_var = cheap_backtracking_tactics;
            SubLObject backtracking_tactic = NIL;
            for (backtracking_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), backtracking_tactic = cdolist_list_var.first()) {
              possible_motivation_strategems = cons(backtracking_tactic, possible_motivation_strategems);
            }
          }
          possible_motivation_strategems = inference_tactician.strategy_sort(strategy, possible_motivation_strategems, $sym17$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
        }
      }
      {
        SubLObject thrown_away_motivation_strategems = NIL;
        SubLObject problem_var = problem;
        SubLObject type_var = $kw31$CONNECTED_CONJUNCTION;
        SubLObject subsuming_join_ordered_tactics = inference_tactician.problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem_var, type_var);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem_var);
        SubLObject conjunctive_tactic = NIL;
        for (conjunctive_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), conjunctive_tactic = cdolist_list_var.first()) {
          if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(conjunctive_tactic, type_var))) {
            if ((NIL == inference_tactician.some_subsuming_join_ordered_tacticP(conjunctive_tactic, subsuming_join_ordered_tactics, strategy))) {
              if ((!(((NIL != list_utilities.member_eqP(conjunctive_tactic, possible_motivation_strategems))
                    || (NIL != list_utilities.member_eqP(conjunctive_tactic, set_aside_motivation_strategems)))))) {
                thrown_away_motivation_strategems = cons(conjunctive_tactic, thrown_away_motivation_strategems);
              }
            }
          }
        }
        return Values.values(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 31317) 
  public static final SubLObject removal_strategy_deems_conjunctive_tactic_spec_betterP(SubLObject strategy, SubLObject candidate_tactic, SubLObject candidate_tactic_productivity, SubLObject candidate_tactic_preference, SubLObject candidate_tactic_module_spec, SubLObject candidate_tactic_literal_count, SubLObject committed_tactic, SubLObject committed_tactic_productivity, SubLObject committed_tactic_preference, SubLObject committed_tactic_module_spec, SubLObject committed_tactic_literal_count) {
    if (((NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(committed_tactic)))
         && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36508"))
         && (candidate_tactic_preference == committed_tactic_preference))) {
      {
        SubLObject candidate_completeness = inference_worker.logical_tactic_generalized_removal_completeness(candidate_tactic, strategy);
        SubLObject committed_completeness = inference_worker.logical_tactic_generalized_removal_completeness(committed_tactic, strategy);
        if ((NIL != inference_datastructures_enumerated_types.completeness_G(candidate_completeness, committed_completeness))) {
          return T;
        }
      }
    }
    return inference_tactician_utilities.strategy_deems_conjunctive_tactic_spec_betterP(candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literal_count, committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literal_count);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 32703) 
  public static final SubLObject removal_strategy_commits_to_no_removal_backtrackingP(SubLObject strategy, SubLObject committed_tactic, SubLObject committed_tactic_preference_level) {
    if ((NIL != ((NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(committed_tactic))) ? ((SubLObject) Equality.eq($kw22$COMPLETE, inference_worker.logical_tactic_generalized_removal_completeness(committed_tactic, strategy))) : Equality.eq($kw33$PREFERRED, committed_tactic_preference_level)))) {
      if ((NIL != removal_strategy_logical_tactic_removal_backtracking_cheapP(committed_tactic, strategy))) {
        return T;
      }
    }
    if ((NIL != inference_trampolines.problem_backchain_requiredP(inference_datastructures_tactic.tactic_problem(committed_tactic)))) {
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 33667) 
  public static final SubLObject removal_strategy_logical_tactic_removal_backtracking_cheapP(SubLObject logical_tactic, SubLObject strategy) {
    if ((NIL == inference_worker_join.join_tactic_p(logical_tactic))) {
      {
        SubLObject removal_backtracking_productivity_threshold = removal_tactician_datastructures.removal_strategy_removal_backtracking_productivity_limit(strategy);
        if ((NIL != removal_backtracking_productivity_threshold)) {
          {
            SubLObject productivity = inference_lookahead_productivity.tactic_max_removal_productivity(logical_tactic, strategy);
            return inference_datastructures_enumerated_types.productivity_LE(productivity, removal_backtracking_productivity_threshold);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 36985) 
  public static final SubLObject removal_strategy_reactivate_executable_strategem(SubLObject strategy, SubLObject strategem) {
    checkType(strategy, $sym8$REMOVAL_STRATEGY_P);
    checkType(strategem, $sym35$EXECUTABLE_STRATEGEM_P);
    if ((NIL != inference_worker_removal.generalized_removal_tactic_p(strategem))) {
      return removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
    } else if ((NIL != inference_worker_transformation.transformation_tactic_p(strategem))) {
      return NIL;
    } else if ((NIL != inference_worker.meta_structural_tactic_p(strategem))) {
      removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
      return strategem;
    } else {
      return removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 37634) 
  public static final SubLObject removal_strategy_strategically_deactivate_strategem(SubLObject strategy, SubLObject strategem) {
    if ((NIL != inference_tactician.strategem_invalid_p(strategem))) {
      return NIL;
    }
    {
      SubLObject strategem_var = strategem;
      SubLObject problem = inference_tactician.strategem_problem(strategem_var);
      removal_strategy_deactivate_strategem(strategy, strategem_var);
      removal_strategy_possibly_deactivate_problem(strategy, problem);
    }
    if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
      inference_worker.consider_strategic_ramifications_of_possibly_executed_tactic(strategy, strategem);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 38122) 
  public static final SubLObject removal_strategy_deactivate_strategem(SubLObject strategy, SubLObject strategem) {
    checkType(strategy, $sym8$REMOVAL_STRATEGY_P);
    checkType(strategem, $sym36$REMOVAL_STRATEGEM_P);
    {
      SubLObject problem = inference_tactician.strategem_problem(strategem);
      SubLObject index = removal_tactician_datastructures.removal_strategy_problem_total_strategems_active(strategy);
      SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
      count = Numbers.subtract(count, ONE_INTEGER);
      if (count.isPositive()) {
        dictionary.dictionary_enter(index, problem, count);
      } else {
        dictionary.dictionary_remove(index, problem);
        removal_tactician_datastructures.removal_strategy_note_problem_pending(strategy, problem);
      }
      return count;
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 38683) 
  public static final SubLObject removal_strategy_possibly_deactivate_problem(SubLObject strategy, SubLObject problem) {
    if ((NIL == removal_tactician_datastructures.removal_strategy_problem_activeP(strategy, problem))) {
      inference_datastructures_strategy.strategy_note_problem_inactive(strategy, problem);
      if ((NIL != removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem))) {
        inference_datastructures_strategy.strategy_note_problem_set_aside(strategy, problem);
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 39035) 
  public static final SubLObject removal_strategy_consider_that_problem_could_be_strategically_pending(SubLObject strategy, SubLObject problem) {
    if ((NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED))) {
      removal_strategy_make_problem_pending(strategy, problem);
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 39348) 
  public static final SubLObject removal_strategy_make_problem_pending(SubLObject strategy, SubLObject problem) {
    removal_tactician_datastructures.removal_strategy_note_problem_pending(strategy, problem);
    removal_strategy_possibly_deactivate_problem(strategy, problem);
    return NIL;
  }

  public static final SubLObject declare_removal_tactician_motivation_file() {
    declareMacro(myName, "removal_strategy_with_strategically_active_strategem", "REMOVAL-STRATEGY-WITH-STRATEGICALLY-ACTIVE-STRATEGEM");
    declareFunction(myName, "removal_strategy_possibly_propagate_motivation_to_link_head", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
    declareFunction(myName, "removal_strategy_propagate_motivation_to_link_head", "REMOVAL-STRATEGY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
    declareFunction(myName, "removal_strategy_link_motivates_problemP", "REMOVAL-STRATEGY-LINK-MOTIVATES-PROBLEM?", 2, 1, false);
    declareFunction(myName, "removal_strategy_link_motivates_lookahead_problemP", "REMOVAL-STRATEGY-LINK-MOTIVATES-LOOKAHEAD-PROBLEM?", 2, 0, false);
    declareFunction(myName, "removal_strategy_possibly_propagate_motivation_to_problem", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
    declareFunction(myName, "removal_strategy_possibly_activate_problem", "REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
    declareFunction(myName, "removal_strategy_problem_is_the_rest_of_a_removalP", "REMOVAL-STRATEGY-PROBLEM-IS-THE-REST-OF-A-REMOVAL?", 2, 0, false);
    declareFunction(myName, "removal_strategy_problem_is_the_rest_of_a_join_orderedP", "REMOVAL-STRATEGY-PROBLEM-IS-THE-REST-OF-A-JOIN-ORDERED?", 2, 0, false);
    declareFunction(myName, "removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-PROOF-SPEC-TO-RESTRICTED-NON-FOCALS", 2, 0, false);
    declareFunction(myName, "removal_strategy_motivates_problem_via_rewriteP", "REMOVAL-STRATEGY-MOTIVATES-PROBLEM-VIA-REWRITE?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_not_to_examine_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_not_to_activate_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
    declareFunction(myName, "removal_strategy_activate_problem", "REMOVAL-STRATEGY-ACTIVATE-PROBLEM", 2, 0, false);
    declareFunction(myName, "removal_strategy_possibly_activate_strategems", "REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS", 2, 0, false);
    declareFunction(myName, "merge_removal_and_rl_tactician_strategems", "MERGE-REMOVAL-AND-RL-TACTICIAN-STRATEGEMS", 6, 0, false);
    declareFunction(myName, "removal_strategy_filter_strategems_by_rlt_tactic_types", "REMOVAL-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES", 2, 0, false);
    declareFunction(myName, "removal_strategy_filter_strategems_by_rlt_tactic_types_int", "REMOVAL-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES-INT", 2, 0, false);
    declareFunction(myName, "removal_strategy_note_new_tactic", "REMOVAL-STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
    declareFunction(myName, "removal_strategy_note_split_tactics_strategically_possible", "REMOVAL-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
    declareFunction(myName, "removal_strategy_note_new_tactic_possible", "REMOVAL-STRATEGY-NOTE-NEW-TACTIC-POSSIBLE", 2, 0, false);
    declareFunction(myName, "removal_strategy_categorize_strategems", "REMOVAL-STRATEGY-CATEGORIZE-STRATEGEMS", 2, 0, false);
    declareFunction(myName, "removal_strategy_categorize_motivation_strategems", "REMOVAL-STRATEGY-CATEGORIZE-MOTIVATION-STRATEGEMS", 4, 0, false);
    declareFunction(myName, "removal_strategy_categorize_removal_tactics", "REMOVAL-STRATEGY-CATEGORIZE-REMOVAL-TACTICS", 4, 0, false);
    declareFunction(myName, "removal_strategy_categorize_disjunctive_tactics", "REMOVAL-STRATEGY-CATEGORIZE-DISJUNCTIVE-TACTICS", 4, 0, false);
    declareFunction(myName, "removal_strategy_categorize_split_tactics", "REMOVAL-STRATEGY-CATEGORIZE-SPLIT-TACTICS", 4, 0, false);
    declareFunction(myName, "removal_strategy_categorize_connected_conjunction_tactics", "REMOVAL-STRATEGY-CATEGORIZE-CONNECTED-CONJUNCTION-TACTICS", 4, 0, false);
    declareFunction(myName, "removal_strategy_deems_conjunctive_tactic_spec_betterP", "REMOVAL-STRATEGY-DEEMS-CONJUNCTIVE-TACTIC-SPEC-BETTER?", 11, 0, false);
    declareFunction(myName, "removal_strategy_commits_to_no_removal_backtrackingP", "REMOVAL-STRATEGY-COMMITS-TO-NO-REMOVAL-BACKTRACKING?", 3, 0, false);
    declareFunction(myName, "removal_strategy_logical_tactic_removal_backtracking_cheapP", "REMOVAL-STRATEGY-LOGICAL-TACTIC-REMOVAL-BACKTRACKING-CHEAP?", 2, 0, false);
    declareFunction(myName, "removal_strategy_possibly_reconsider_split_set_asides", "REMOVAL-STRATEGY-POSSIBLY-RECONSIDER-SPLIT-SET-ASIDES", 2, 0, false);
    declareFunction(myName, "removal_strategy_reconsider_one_split_set_aside", "REMOVAL-STRATEGY-RECONSIDER-ONE-SPLIT-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "removal_strategy_possibly_clear_strategic_status", "REMOVAL-STRATEGY-POSSIBLY-CLEAR-STRATEGIC-STATUS", 2, 0, false);
    declareFunction(myName, "removal_strategy_reactivate_executable_strategem", "REMOVAL-STRATEGY-REACTIVATE-EXECUTABLE-STRATEGEM", 2, 0, false);
    declareFunction(myName, "removal_strategy_strategically_deactivate_strategem", "REMOVAL-STRATEGY-STRATEGICALLY-DEACTIVATE-STRATEGEM", 2, 0, false);
    declareFunction(myName, "removal_strategy_deactivate_strategem", "REMOVAL-STRATEGY-DEACTIVATE-STRATEGEM", 2, 0, false);
    declareFunction(myName, "removal_strategy_possibly_deactivate_problem", "REMOVAL-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM", 2, 0, false);
    declareFunction(myName, "removal_strategy_consider_that_problem_could_be_strategically_pending", "REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false);
    declareFunction(myName, "removal_strategy_make_problem_pending", "REMOVAL-STRATEGY-MAKE-PROBLEM-PENDING", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_tactician_motivation_file() {
    $removal_strategy_rl_tactician_tactic_types$ = defparameter("*REMOVAL-STRATEGY-RL-TACTICIAN-TACTIC-TYPES*", $list15);
    return NIL;
  }

  public static final SubLObject setup_removal_tactician_motivation_file() {
    // CVS_ID("Id: inference-removal-tactician-motivation.lisp 127279 2009-02-27 16:30:30Z pace ");
    utilities_macros.note_funcall_helper_function($sym16$REMOVAL_STRATEGY_NOTE_NEW_TACTIC);
    utilities_macros.note_funcall_helper_function($sym18$REMOVAL_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE);
    utilities_macros.note_funcall_helper_function($sym37$REMOVAL_STRATEGY_CONSIDER_THAT_PROBLEM_COULD_BE_STRATEGICALLY_PEN);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("STRATEGY"), makeSymbol("STRATEGEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$PROBLEM = makeUninternedSymbol("PROBLEM");
  public static final SubLSymbol $sym2$STRATEGEM_VAR = makeUninternedSymbol("STRATEGEM-VAR");
  public static final SubLSymbol $sym3$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym4$STRATEGEM_PROBLEM = makeSymbol("STRATEGEM-PROBLEM");
  public static final SubLSymbol $sym5$REMOVAL_STRATEGY_DEACTIVATE_STRATEGEM = makeSymbol("REMOVAL-STRATEGY-DEACTIVATE-STRATEGEM");
  public static final SubLSymbol $sym6$REMOVAL_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM = makeSymbol("REMOVAL-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM");
  public static final SubLSymbol $sym7$MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");
  public static final SubLSymbol $sym8$REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");
  public static final SubLSymbol $kw9$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw10$PROVEN = makeKeyword("PROVEN");
  public static final SubLSymbol $kw11$RESTRICTION = makeKeyword("RESTRICTION");
  public static final SubLSymbol $kw12$REWRITE = makeKeyword("REWRITE");
  public static final SubLSymbol $sym13$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $kw14$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLList $list15 = list(makeKeyword("GENERALIZED-REMOVAL"), makeKeyword("CONNECTED-CONJUNCTION"), makeKeyword("SPLIT"), makeKeyword("UNION"));
  public static final SubLSymbol $sym16$REMOVAL_STRATEGY_NOTE_NEW_TACTIC = makeSymbol("REMOVAL-STRATEGY-NOTE-NEW-TACTIC");
  public static final SubLSymbol $sym17$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ = makeSymbol("LOGICAL-TACTIC-BETTER-WRT-REMOVAL?");
  public static final SubLSymbol $sym18$REMOVAL_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE = makeSymbol("REMOVAL-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE");
  public static final SubLSymbol $kw19$META_STRUCTURAL = makeKeyword("META-STRUCTURAL");
  public static final SubLSymbol $kw20$GENERALIZED_REMOVAL_OR_REWRITE = makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE");
  public static final SubLSymbol $kw21$POSSIBLE = makeKeyword("POSSIBLE");
  public static final SubLSymbol $kw22$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $kw23$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $kw24$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLSymbol $sym25$TACTIC_STRATEGIC_PRODUCTIVITY__ = makeSymbol("TACTIC-STRATEGIC-PRODUCTIVITY-<");
  public static final SubLSymbol $kw26$DISJUNCTIVE = makeKeyword("DISJUNCTIVE");
  public static final SubLSymbol $kw27$SPLIT = makeKeyword("SPLIT");
  public static final SubLSymbol $kw28$NON_DISCARDED = makeKeyword("NON-DISCARDED");
  public static final SubLSymbol $kw29$POSITIVE_INFINITY = makeKeyword("POSITIVE-INFINITY");
  public static final SubLSymbol $kw30$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLSymbol $kw31$CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
  public static final SubLSymbol $kw32$JOIN = makeKeyword("JOIN");
  public static final SubLSymbol $kw33$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLSymbol $sym34$SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");
  public static final SubLSymbol $sym35$EXECUTABLE_STRATEGEM_P = makeSymbol("EXECUTABLE-STRATEGEM-P");
  public static final SubLSymbol $sym36$REMOVAL_STRATEGEM_P = makeSymbol("REMOVAL-STRATEGEM-P");
  public static final SubLSymbol $sym37$REMOVAL_STRATEGY_CONSIDER_THAT_PROBLEM_COULD_BE_STRATEGICALLY_PEN = makeSymbol("REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING");

  //// Initializers

  public void declareFunctions() {
    declare_removal_tactician_motivation_file();
  }

  public void initializeVariables() {
    init_removal_tactician_motivation_file();
  }

  public void runTopLevelForms() {
    setup_removal_tactician_motivation_file();
  }

}
