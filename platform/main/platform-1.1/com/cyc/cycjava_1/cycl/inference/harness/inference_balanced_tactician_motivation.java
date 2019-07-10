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
//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_lookahead_productivity;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_rewrite;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_union;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.inference.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;

public  final class inference_balanced_tactician_motivation extends SubLTranslatedFile {

  //// Constructor

  private inference_balanced_tactician_motivation() {}
  public static final SubLFile me = new inference_balanced_tactician_motivation();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_motivation";

  //// Definitions

  /** @return booleanp */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 1490)
  public static final SubLObject balanced_strategy_possibly_propagate_motivation_to_link_head(SubLObject strategy, SubLObject motivation, SubLObject link_head) {
    checkType(link_head, $sym7$MOTIVATION_STRATEGEM_P);
    {
      SubLObject already_motivatedP = inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivatedP(strategy, motivation, link_head);
      if ((NIL == already_motivatedP)) {
        balanced_strategy_propagate_motivation_to_link_head(strategy, motivation, link_head);
        return T;
      }
      return NIL;
    }
  }

  /** There ought to be two triggers for new root creation via an RT link:
the motivation transformation link getting T, or the motivating join-ordered link
getting T.  Leviathan experiments indicated that we actually gain
more completeness by refraining from triggering via join-ordered T,
but more recent work requires this to be T for correctness. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 2005)
  public static SubLSymbol $balanced_strategy_new_roots_triggered_by_t_on_jo_linkP$ = null;

  /** It seems correct to ensure that the motivating join-ordered link has T before using it
to motivate the creation of a new root.  However, turning this to NIL causes 13 haystacks
to become answerable.  Leviathan @todo investigate why, and try to come up with a more
principled fix. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 2439)
  public static SubLSymbol $balanced_strategy_new_roots_check_for_t_on_jo_linkP$ = null;

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 2799)
  public static final SubLObject balanced_strategy_propagate_motivation_to_link_head(SubLObject strategy, SubLObject motivation, SubLObject link_head) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(strategy, $sym8$BALANCED_STRATEGY_P);
      checkType(link_head, $sym7$MOTIVATION_STRATEGEM_P);
      inference_balanced_tactician_datastructures.balanced_strategy_note_link_head_motivated(strategy, motivation, link_head);
      if ((NIL != inference_worker_transformation.transformation_link_p(link_head))) {
      } else if ((NIL != inference_tactician.motivation_strategem_link_p(link_head))) {
        {
          SubLObject link = link_head;
          SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(link);
          balanced_strategy_possibly_propagate_motivation_to_problem(strategy, motivation, supporting_problem);
        }
      } else {
        {
          SubLObject tactic = link_head;
          if ((NIL != inference_worker_join.join_tactic_p(tactic))) {
            {
              SubLObject join_link = inference_worker_join.join_tactic_link(tactic);
              SubLObject first_problem = inference_worker_join.join_link_first_problem(join_link);
              SubLObject second_problem = inference_worker_join.join_link_second_problem(join_link);
              balanced_strategy_possibly_propagate_motivation_to_problem(strategy, motivation, first_problem);
              balanced_strategy_possibly_propagate_motivation_to_problem(strategy, motivation, second_problem);
            }
          } else {
            {
              SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
              balanced_strategy_possibly_propagate_motivation_to_problem(strategy, motivation, lookahead_problem);
            }
          }
        }
      }
      if ((NIL != inference_worker.connected_conjunction_tactic_p(link_head))) {
        {
          SubLObject tactic = link_head;
          SubLObject link = inference_worker.connected_conjunction_tactic_link(tactic);
          if ((NIL != balanced_strategy_early_removal_linkP(strategy, link))) {
            {
              SubLObject link_var = link;
              SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
              SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
              SubLObject state = NIL;
              for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                {
                  SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
                  if ((NIL != set_contents.do_set_contents_element_validP(state, restriction_link))) {
                    if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $kw9$RESTRICTION))) {
                      if ((NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var))) {
                        {
                          SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                          balanced_strategy_possibly_make_new_root(strategy, restricted_non_focal_problem);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (($kw10$TRANSFORMATION == motivation)) {
            if ((NIL != $balanced_strategy_new_roots_triggered_by_t_on_jo_linkP$.getDynamicValue(thread))) {
              if ((NIL != inference_worker_join_ordered.join_ordered_link_p(link))) {
                {
                  SubLObject jo_link_var = link;
                  SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var);
                  SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                  SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                  SubLObject state = NIL;
                  for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                    {
                      SubLObject rt_link = set_contents.do_set_contents_next(basis_object, state);
                      if ((NIL != set_contents.do_set_contents_element_validP(state, rt_link))) {
                        if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $kw11$RESIDUAL_TRANSFORMATION))) {
                          if ((NIL != Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35059"))) {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35706");
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
      if (($kw10$TRANSFORMATION == motivation)) {
        if ((NIL != inference_worker_transformation.transformation_link_p(link_head))) {
          balanced_strategy_propagate_transformation_motivation_to_transformation_link(strategy, link_head);
        }
        if ((NIL != inference_worker_split.split_tactic_p(link_head))) {
          {
            SubLObject split_tactic = link_head;
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35707");
            if ((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, inference_datastructures_tactic.tactic_problem(split_tactic)))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35711");
            }
          }
        }
        if ((NIL != inference_worker_union.union_tactic_p(link_head))) {
          {
            SubLObject union_tactic = link_head;
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35709");
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 7830)
  public static final SubLObject balanced_strategy_propagate_transformation_motivation_to_transformation_link(SubLObject strategy, SubLObject t_link) {
    if ((NIL != balanced_strategy_chooses_to_make_d_a_new_rootP(strategy, t_link))) {
      {
        SubLObject residual_problem = inference_worker_transformation.transformation_link_supporting_problem(t_link);
        return balanced_strategy_possibly_make_new_root(strategy, residual_problem);
      }
    } else {
      {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35713");
        SubLObject new_root = NIL;
        for (new_root = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), new_root = cdolist_list_var.first()) {
          if ((NIL != balanced_strategy_possibly_make_new_root(strategy, new_root))) {
            count = Numbers.add(count, ONE_INTEGER);
          }
        }
        return count;
      }
    }
  }

  /** @return booleanp; whether STRATEGY chooses that 'D', rather than '(^ A D), should
be a new root.  'D' is the supporting transformed problem of T-LINK, and '(^ A D) is
a residual conjunction problem of some residual transformation argument link of D. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 8969)
  public static final SubLObject balanced_strategy_chooses_to_make_d_a_new_rootP(SubLObject strategy, SubLObject t_link) {
    return Types.sublisp_null(balanced_strategy_residual_conjunction_new_root_candidates(strategy, t_link));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 9399)
  public static final SubLObject balanced_strategy_residual_conjunction_new_root_candidates(SubLObject strategy, SubLObject t_link) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject new_roots = NIL;
        if (((NIL == $balanced_strategy_self_expanding_rule_fix_enabledP$.getDynamicValue(thread))
            || (NIL == assertion_utilities.self_expanding_ruleP(inference_worker_transformation.transformation_link_rule_assertion(t_link))))) {
          {
            SubLObject t_link_var = t_link;
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link_var);
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
              {
                SubLObject jo_link_var = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, jo_link_var))) {
                  if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $kw12$JOIN_ORDERED))) {
                    {
                      SubLObject jo_link_var_1 = jo_link_var;
                      SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_1);
                      SubLObject set_contents_var_2 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                      SubLObject basis_object_3 = set_contents.do_set_contents_basis_object(set_contents_var_2);
                      SubLObject state_4 = NIL;
                      for (state_4 = set_contents.do_set_contents_initial_state(basis_object_3, set_contents_var_2); (NIL == set_contents.do_set_contents_doneP(basis_object_3, state_4)); state_4 = set_contents.do_set_contents_update_state(state_4)) {
                        {
                          SubLObject rt_link = set_contents.do_set_contents_next(basis_object_3, state_4);
                          if ((NIL != set_contents.do_set_contents_element_validP(state_4, rt_link))) {
                            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $kw11$RESIDUAL_TRANSFORMATION))) {
                              if ((NIL != Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35060"))) {
                                if ((NIL != Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35064"))) {
                                  {
                                    SubLObject candidate_new_root = Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35095");
                                    if ((NIL != inference_datastructures_problem.problem_relevant_to_strategyP(candidate_new_root, strategy))) {
                                      {
                                        SubLObject jo_link = Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35067");
                                        SubLObject jo_tactic = inference_worker_join_ordered.join_ordered_link_tactic(jo_link);
                                        if (((NIL == $balanced_strategy_new_roots_check_for_t_on_jo_linkP$.getDynamicValue(thread))
                                            || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, jo_tactic)))) {
                                          new_roots = cons(candidate_new_root, new_roots);
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
        return Sequences.nreverse(new_roots);
      }
    }
  }

  /** @return booleanp */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 13413)
  public static final SubLObject balanced_strategy_link_motivates_problemP(SubLObject strategy, SubLObject link, SubLObject motivation, SubLObject problem) {
    if ((problem == UNPROVIDED)) {
      problem = NIL;
    }
    if ((NIL == inference_worker_split.split_link_p(link))) {
      return balanced_strategy_link_motivates_lookahead_problemP(strategy, link, motivation);
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
                          SubLObject rest_5 = NIL;
                          for (rest_5 = inference_datastructures_problem.problem_tactics(supported_problem); (!(((NIL != motivatedP)
                                || (NIL == rest_5)))); rest_5 = rest_5.rest()) {
                            {
                              SubLObject tactic = rest_5.first();
                              if ((NIL != inference_worker_split.split_tactic_p(tactic))) {
                                {
                                  SubLObject supporting_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(tactic);
                                  if ((mapped_problem == supporting_mapped_problem)) {
                                    if ((NIL != inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivatedP(strategy, motivation, tactic))) {
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
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 14358)
  public static final SubLObject balanced_strategy_link_motivates_lookahead_problemP(SubLObject strategy, SubLObject link, SubLObject motivation) {
    if ((NIL != inference_tactician.motivation_strategem_link_p(link))) {
      return inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivatedP(strategy, motivation, link);
    } else if ((NIL != inference_worker_split.split_link_p(link))) {
      return NIL;
    } else if ((NIL != inference_worker.logical_link_p(link))) {
      {
        SubLObject tactic = inference_worker.logical_link_unique_tactic(link);
        return inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivatedP(strategy, motivation, tactic);
      }
    } else {
      return NIL;
    }
  }

  /** @return booleanp */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 14814)
  public static final SubLObject balanced_strategy_possibly_propagate_motivation_to_problem(SubLObject strategy, SubLObject motivation, SubLObject problem) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw15$NEW_ROOT)) {
        return balanced_strategy_possibly_propagate_new_root_motivation_to_problem(strategy, problem);
      } else if (pcase_var.eql($kw14$REMOVAL)) {
        return balanced_strategy_possibly_propagate_removal_motivation_to_problem(strategy, problem);
      } else if (pcase_var.eql($kw10$TRANSFORMATION)) {
        return balanced_strategy_possibly_propagate_transformation_motivation_to_problem(strategy, problem);
      } else {
        return Errors.error($str16$unexpected_motivation__s, motivation);
      }
    }
  }

  /** @return booleanp */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 15390)
  public static final SubLObject balanced_strategy_possibly_make_new_root(SubLObject strategy, SubLObject problem) {
    return balanced_strategy_possibly_propagate_new_root_motivation_to_problem(strategy, problem);
  }

  /** @return booleanp */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 15584)
  public static final SubLObject balanced_strategy_possibly_propagate_new_root_motivation_to_problem(SubLObject strategy, SubLObject problem) {
    {
      SubLObject already_motivatedP = inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_new_rootP(strategy, problem);
      if ((NIL == already_motivatedP)) {
        balanced_strategy_propagate_new_root_motivation_to_problem(strategy, problem);
        return T;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 15976)
  public static final SubLObject balanced_strategy_propagate_new_root_motivation_to_problem(SubLObject strategy, SubLObject problem) {
    inference_balanced_tactician_datastructures.balanced_strategy_note_problem_motivated_wrt_new_root(strategy, problem);
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject split_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, split_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $kw17$SPLIT))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35708");
            }
          }
        }
      }
    }
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject union_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, union_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, $kw18$UNION))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35710");
            }
          }
        }
      }
    }
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $kw12$JOIN_ORDERED))) {
              if ((NIL != balanced_strategy_early_removal_linkP(strategy, link))) {
                {
                  SubLObject link_var = link;
                  SubLObject set_contents_var_6 = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                  SubLObject basis_object_7 = set_contents.do_set_contents_basis_object(set_contents_var_6);
                  SubLObject state_8 = NIL;
                  for (state_8 = set_contents.do_set_contents_initial_state(basis_object_7, set_contents_var_6); (NIL == set_contents.do_set_contents_doneP(basis_object_7, state_8)); state_8 = set_contents.do_set_contents_update_state(state_8)) {
                    {
                      SubLObject restriction_link = set_contents.do_set_contents_next(basis_object_7, state_8);
                      if ((NIL != set_contents.do_set_contents_element_validP(state_8, restriction_link))) {
                        if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $kw9$RESTRICTION))) {
                          if ((NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var))) {
                            {
                              SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                              balanced_strategy_possibly_make_new_root(strategy, restricted_non_focal_problem);
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
    if ((NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy))) {
      balanced_strategy_possibly_activate_problem_wrt_new_root(strategy, problem);
    }
    return NIL;
  }

  /** @return booleanp */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 17199)
  public static final SubLObject balanced_strategy_possibly_propagate_removal_motivation_to_problem(SubLObject strategy, SubLObject problem) {
    {
      SubLObject already_motivatedP = inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, problem);
      if ((NIL == already_motivatedP)) {
        balanced_strategy_propagate_removal_motivation_to_problem(strategy, problem);
        return T;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 17588)
  public static final SubLObject balanced_strategy_propagate_removal_motivation_to_problem(SubLObject strategy, SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      inference_balanced_tactician_datastructures.balanced_strategy_note_problem_motivated_wrt_removal(strategy, problem);
      {
        SubLObject problem_var = problem;
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link))) {
              if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $kw12$JOIN_ORDERED))) {
                {
                  SubLObject link_var = join_ordered_link;
                  SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                  SubLObject mapped_problem = NIL;
                  for (mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mapped_problem = cdolist_list_var.first()) {
                    if ((NIL != inference_macros.do_problem_link_open_matchP(T, link_var, mapped_problem))) {
                      if ((problem_var == inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) {
                        if ((NIL != Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35704"))) {
                          {
                            SubLObject status_var = $kw19$PROVEN;
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem));
                            while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                              thread.resetMultipleValues();
                              {
                                SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject proof_list = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                  SubLObject cdolist_list_var_9 = proof_list;
                                  SubLObject proof = NIL;
                                  for (proof = cdolist_list_var_9.first(); (NIL != cdolist_list_var_9); cdolist_list_var_9 = cdolist_list_var_9.rest(), proof = cdolist_list_var_9.first()) {
                                    if ((NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var))) {
                                      {
                                        SubLObject restricted_non_focal_mapped_problem = Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36362");
                                        SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_non_focal_mapped_problem);
                                        balanced_strategy_possibly_propagate_removal_motivation_to_problem(strategy, restricted_non_focal_problem);
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
      {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, transformation_link))) {
              if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $kw10$TRANSFORMATION))) {
                if ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35698"))) {
                  {
                    SubLObject supporting_transformed_problem = inference_worker_transformation.transformation_link_supporting_problem(transformation_link);
                    balanced_strategy_possibly_make_new_root(strategy, supporting_transformed_problem);
                  }
                }
              }
            }
          }
        }
      }
      if ((NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy))) {
        balanced_strategy_possibly_activate_problem_wrt_removal(strategy, problem);
      }
      return NIL;
    }
  }

  /** @return booleanp */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 19412)
  public static final SubLObject balanced_strategy_possibly_propagate_transformation_motivation_to_problem(SubLObject strategy, SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy))) {
          Errors.error($str20$_s_tried_to_propagate_T_to__s_but, strategy, problem);
        }
      }
      {
        SubLObject already_motivatedP = inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_transformationP(strategy, problem);
        if ((NIL == already_motivatedP)) {
          balanced_strategy_propagate_transformation_motivation_to_problem(strategy, problem);
          return T;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 19979)
  public static final SubLObject balanced_strategy_propagate_transformation_motivation_to_problem(SubLObject strategy, SubLObject problem) {
    inference_balanced_tactician_datastructures.balanced_strategy_note_problem_motivated_wrt_transformation(strategy, problem);
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $kw12$JOIN_ORDERED))) {
              if ((NIL != balanced_strategy_early_removal_linkP(strategy, link))) {
                {
                  SubLObject link_var = link;
                  SubLObject set_contents_var_10 = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                  SubLObject basis_object_11 = set_contents.do_set_contents_basis_object(set_contents_var_10);
                  SubLObject state_12 = NIL;
                  for (state_12 = set_contents.do_set_contents_initial_state(basis_object_11, set_contents_var_10); (NIL == set_contents.do_set_contents_doneP(basis_object_11, state_12)); state_12 = set_contents.do_set_contents_update_state(state_12)) {
                    {
                      SubLObject restriction_link = set_contents.do_set_contents_next(basis_object_11, state_12);
                      if ((NIL != set_contents.do_set_contents_element_validP(state_12, restriction_link))) {
                        if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $kw9$RESTRICTION))) {
                          if ((NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var))) {
                            {
                              SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                              balanced_strategy_possibly_make_new_root(strategy, restricted_non_focal_problem);
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
    if ((NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy))) {
      balanced_strategy_possibly_activate_problem_wrt_transformation(strategy, problem);
    }
    return NIL;
  }

  /** @return booleanp; whether STRATEGY chose to activate PROBLEM. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 20777)
  public static final SubLObject balanced_strategy_possibly_activate_problem(SubLObject strategy, SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != balanced_strategy_chooses_not_to_examine_problemP(strategy, problem))) {
        return NIL;
      }
      inference_worker.determine_strategic_status_wrt(problem, strategy);
      if ((NIL != balanced_strategy_chooses_not_to_activate_problemP(strategy, problem))) {
        return NIL;
      }
      if ((NIL != inference_worker_restriction.problem_is_a_simplificationP(problem))) {
        balanced_strategy_possibly_propagate_removal_motivation_to_problem(strategy, problem);
        if ((NIL == inference_tactician.strategy_throws_away_all_transformationP(strategy))) {
          if ((NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread))) {
            balanced_strategy_possibly_propagate_transformation_motivation_to_problem(strategy, problem);
          }
        }
      }
      if ((NIL != balanced_strategy_problem_is_the_rest_of_a_removalP(problem, strategy))) {
        balanced_strategy_possibly_propagate_removal_motivation_to_problem(strategy, problem);
      }
      if ((NIL != balanced_strategy_motivates_problem_via_rewriteP(strategy, problem))) {
        balanced_strategy_possibly_propagate_removal_motivation_to_problem(strategy, problem);
      }
      if ((NIL != balanced_strategy_problem_is_the_rest_of_a_join_orderedP(problem, strategy))) {
        balanced_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(strategy, problem);
      }
      if ((NIL == inference_tactician.strategy_throws_away_all_transformationP(strategy))) {
        if ((NIL != balanced_strategy_problem_is_the_rest_of_an_early_removalP(problem, strategy))) {
          balanced_strategy_possibly_propagate_new_root_motivation_to_problem(strategy, problem);
        }
      }
      {
        SubLObject activatedP = NIL;
        if ((NIL != balanced_strategy_possibly_activate_problem_wrt_new_root(strategy, problem))) {
          activatedP = T;
        }
        if ((NIL != balanced_strategy_possibly_activate_problem_wrt_removal(strategy, problem))) {
          activatedP = T;
        }
        if ((NIL != balanced_strategy_possibly_activate_problem_wrt_transformation(strategy, problem))) {
          activatedP = T;
        }
        return activatedP;
      }
    }
  }

  public static final class $balanced_strategy_possibly_activate_problem$BinaryFunction extends BinaryFunction {
    public $balanced_strategy_possibly_activate_problem$BinaryFunction() { super(extractFunctionNamed("BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM")); }
    @Override
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return balanced_strategy_possibly_activate_problem(arg1, arg2); }
  }

  /** if you are a restricted non-focal problem of some (open?) join-ordered link which has R,
   you get R.  you're the rest of a removal. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 23525)
  public static final SubLObject balanced_strategy_problem_is_the_rest_of_a_removalP(SubLObject problem, SubLObject strategy) {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, restriction_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $kw9$RESTRICTION))) {
              {
                SubLObject non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                SubLObject set_contents_var_13 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                SubLObject basis_object_14 = set_contents.do_set_contents_basis_object(set_contents_var_13);
                SubLObject state_15 = NIL;
                for (state_15 = set_contents.do_set_contents_initial_state(basis_object_14, set_contents_var_13); (NIL == set_contents.do_set_contents_doneP(basis_object_14, state_15)); state_15 = set_contents.do_set_contents_update_state(state_15)) {
                  {
                    SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object_14, state_15);
                    if ((NIL != set_contents.do_set_contents_element_validP(state_15, join_ordered_link))) {
                      if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $kw12$JOIN_ORDERED))) {
                        if ((NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link))) {
                          if ((non_focal_problem == inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link))) {
                            if (((NIL != inference_datastructures_problem_link.problem_link_openP(join_ordered_link))
                                 && (NIL != balanced_strategy_link_motivates_lookahead_problemP(strategy, join_ordered_link, $kw14$REMOVAL)))) {
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

  /** if you are a restricted non-focal problem of some early removal link,
   you get N.  you're the rest of an early removal. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 24008)
  public static final SubLObject balanced_strategy_problem_is_the_rest_of_an_early_removalP(SubLObject problem, SubLObject strategy) {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, restriction_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $kw9$RESTRICTION))) {
              {
                SubLObject non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                SubLObject set_contents_var_16 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                SubLObject basis_object_17 = set_contents.do_set_contents_basis_object(set_contents_var_16);
                SubLObject state_18 = NIL;
                for (state_18 = set_contents.do_set_contents_initial_state(basis_object_17, set_contents_var_16); (NIL == set_contents.do_set_contents_doneP(basis_object_17, state_18)); state_18 = set_contents.do_set_contents_update_state(state_18)) {
                  {
                    SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object_17, state_18);
                    if ((NIL != set_contents.do_set_contents_element_validP(state_18, join_ordered_link))) {
                      if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $kw12$JOIN_ORDERED))) {
                        if ((NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link))) {
                          if ((non_focal_problem == inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link))) {
                            if ((NIL != balanced_strategy_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(strategy, problem, join_ordered_link))) {
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

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 24462)
  public static final SubLObject balanced_strategy_problem_is_the_rest_of_a_join_orderedP(SubLObject problem, SubLObject strategy) {
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
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $kw9$RESTRICTION))) {
              {
                SubLObject non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                SubLObject set_contents_var_19 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                SubLObject basis_object_20 = set_contents.do_set_contents_basis_object(set_contents_var_19);
                SubLObject state_21 = NIL;
                for (state_21 = set_contents.do_set_contents_initial_state(basis_object_20, set_contents_var_19); (!(((NIL != part_of_join_orderedP)
                      || (NIL != set_contents.do_set_contents_doneP(basis_object_20, state_21))))); state_21 = set_contents.do_set_contents_update_state(state_21)) {
                  {
                    SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object_20, state_21);
                    if ((NIL != set_contents.do_set_contents_element_validP(state_21, join_ordered_link))) {
                      if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $kw12$JOIN_ORDERED))) {
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

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 24787)
  public static final SubLObject balanced_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(SubLObject strategy, SubLObject problem) {
    return NIL;
  }

  /** When deciding whether a problem is motivated via residual transformation, if
the rule used on the transformation link is a self expanding rule and this fix is
enabled, prevents the motivation from flowing. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 27234)
  private static SubLSymbol $balanced_strategy_self_expanding_rule_fix_enabledP$ = null;

  /** if you are a supporting rewritten problem of a rewrite link whose supported problem has R,
   you get R. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 27523)
  public static final SubLObject balanced_strategy_motivates_problem_via_rewriteP(SubLObject strategy, SubLObject problem) {
    if ((NIL != inference_datastructures_problem_store.problem_store_rewrite_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy)))) {
      {
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
              if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $kw21$REWRITE))) {
                if ((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link)))) {
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

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 28053)
  public static final SubLObject balanced_strategy_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(SubLObject strategy, SubLObject problem, SubLObject join_ordered_link) {
    if ((NIL != balanced_strategy_treats_restricted_non_focal_as_new_rootP(strategy, join_ordered_link))) {
      return T;
    } else if ((NIL != balanced_strategy_early_removal_linkP(strategy, join_ordered_link))) {
      return T;
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 28483)
  public static final SubLObject balanced_strategy_treats_restricted_non_focal_as_new_rootP(SubLObject strategy, SubLObject join_ordered_link) {
    return makeBoolean(((NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_unbound_predicateP(join_ordered_link))
          || (NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP(join_ordered_link))));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 28799)
  public static final SubLObject balanced_strategy_chooses_not_to_examine_problemP(SubLObject strategy, SubLObject problem) {
    return inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 29282)
  public static final SubLObject balanced_strategy_chooses_not_to_activate_problemP(SubLObject strategy, SubLObject problem) {
    return makeBoolean(((NIL != balanced_strategy_chooses_not_to_activate_problem_wrt_new_rootP(strategy, problem))
           && (NIL != balanced_strategy_chooses_not_to_activate_problem_wrt_removalP(strategy, problem))
           && (NIL != balanced_strategy_chooses_not_to_activate_problem_wrt_transformationP(strategy, problem))));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 29651)
  public static final SubLObject balanced_strategy_chooses_not_to_activate_problem_wrt_new_rootP(SubLObject strategy, SubLObject problem) {
    return makeBoolean(((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $kw15$NEW_ROOT))
          || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_pendingP(strategy, problem, $kw15$NEW_ROOT))));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 29899)
  public static final SubLObject balanced_strategy_chooses_not_to_activate_problem_wrt_removalP(SubLObject strategy, SubLObject problem) {
    return makeBoolean(((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $kw14$REMOVAL))
          || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_pendingP(strategy, problem, $kw14$REMOVAL))));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 30144)
  public static final SubLObject balanced_strategy_chooses_not_to_activate_problem_wrt_transformationP(SubLObject strategy, SubLObject problem) {
    return makeBoolean(((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $kw10$TRANSFORMATION))
          || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_pendingP(strategy, problem, $kw10$TRANSFORMATION))));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 30410)
  public static final SubLObject balanced_strategy_possibly_activate_problem_wrt_new_root(SubLObject strategy, SubLObject problem) {
    {
      SubLObject activateP = makeBoolean(((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_new_rootP(strategy, problem))
           && (NIL == balanced_strategy_chooses_not_to_activate_problem_wrt_new_rootP(strategy, problem))));
      if ((NIL != activateP)) {
        if ((NIL != balanced_strategy_activate_problem_wrt_new_root(strategy, problem))) {
          return T;
        } else {
          balanced_strategy_make_problem_pending(strategy, problem, $kw15$NEW_ROOT);
          return NIL;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 30913)
  public static final SubLObject balanced_strategy_possibly_activate_problem_wrt_removal(SubLObject strategy, SubLObject problem) {
    {
      SubLObject activateP = makeBoolean(((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, problem))
           && (NIL == balanced_strategy_chooses_not_to_activate_problem_wrt_removalP(strategy, problem))));
      if ((NIL != activateP)) {
        if ((NIL != balanced_strategy_activate_problem_wrt_removal(strategy, problem))) {
          return T;
        } else {
          balanced_strategy_make_problem_pending(strategy, problem, $kw14$REMOVAL);
          return NIL;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 31411)
  public static final SubLObject balanced_strategy_possibly_activate_problem_wrt_transformation(SubLObject strategy, SubLObject problem) {
    {
      SubLObject activateP = makeBoolean(((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_transformationP(strategy, problem))
           && (NIL == balanced_strategy_chooses_not_to_activate_problem_wrt_transformationP(strategy, problem))));
      if ((NIL != activateP)) {
        if ((NIL != balanced_strategy_activate_problem_wrt_transformation(strategy, problem))) {
          return T;
        } else {
          balanced_strategy_make_problem_pending(strategy, problem, $kw10$TRANSFORMATION);
          return NIL;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 31944)
  public static final SubLObject balanced_strategy_activate_problem_wrt_new_root(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym8$BALANCED_STRATEGY_P);
    checkType(problem, $sym22$PROBLEM_P);
    return Numbers.plusp(balanced_strategy_possibly_activate_strategems_wrt_new_root(strategy, problem));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 32201)
  public static final SubLObject balanced_strategy_activate_problem_wrt_removal(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym8$BALANCED_STRATEGY_P);
    checkType(problem, $sym22$PROBLEM_P);
    return Numbers.plusp(balanced_strategy_possibly_activate_strategems_wrt_removal(strategy, problem));
  }

  /** add all transformation strategems to the R-box or set-asides.
@return booleanp; T unless STRATEGY chooses to throw away PROBLEM. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 32456)
  public static final SubLObject balanced_strategy_activate_problem_wrt_transformation(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym8$BALANCED_STRATEGY_P);
    checkType(problem, $sym22$PROBLEM_P);
    return Numbers.plusp(balanced_strategy_possibly_activate_strategems_wrt_transformation(strategy, problem));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 32858)
  public static final SubLObject balanced_strategy_possibly_activate_strategems_wrt_new_root(SubLObject strategy, SubLObject problem) {
    inference_balanced_tactician_datastructures.balanced_strategy_add_new_root(strategy, problem);
    return TWO_INTEGER;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 33075)
  public static final SubLObject balanced_strategy_possibly_activate_strategems_wrt_removal(SubLObject strategy, SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject strategems_to_activate = balanced_strategy_categorize_strategems_wrt_removal(strategy, problem);
        SubLObject strategems_to_set_aside = thread.secondMultipleValue();
        SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        {
          SubLObject cdolist_list_var = strategems_to_activate;
          SubLObject strategem = NIL;
          for (strategem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), strategem = cdolist_list_var.first()) {
            inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_removal(strategy, strategem);
          }
        }
        {
          SubLObject cdolist_list_var = strategems_to_set_aside;
          SubLObject strategem = NIL;
          for (strategem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), strategem = cdolist_list_var.first()) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36524");
            if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
              inference_datastructures_strategy.set_tactic_set_aside_wrt(strategem, strategy, $kw14$REMOVAL);
            }
          }
        }
        {
          SubLObject cdolist_list_var = strategems_to_throw_away;
          SubLObject strategem = NIL;
          for (strategem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), strategem = cdolist_list_var.first()) {
            inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_thrown_away_wrt_removal(strategy, strategem);
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
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 34791)
  private static SubLSymbol $balanced_strategy_rl_tactician_tactic_types$ = null;

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 37496)
  public static final SubLObject balanced_strategy_possibly_activate_strategems_wrt_transformation(SubLObject strategy, SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject strategems_to_activate = balanced_strategy_categorize_strategems_wrt_transformation(strategy, problem);
        SubLObject strategems_to_set_aside = thread.secondMultipleValue();
        SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        {
          SubLObject cdolist_list_var = strategems_to_activate;
          SubLObject strategem = NIL;
          for (strategem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), strategem = cdolist_list_var.first()) {
            inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_transformation(strategy, strategem);
          }
        }
        {
          SubLObject cdolist_list_var = strategems_to_set_aside;
          SubLObject strategem = NIL;
          for (strategem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), strategem = cdolist_list_var.first()) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36526");
            if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
              inference_datastructures_strategy.set_tactic_set_aside_wrt(strategem, strategy, $kw10$TRANSFORMATION);
            }
          }
        }
        {
          SubLObject cdolist_list_var = strategems_to_throw_away;
          SubLObject strategem = NIL;
          for (strategem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), strategem = cdolist_list_var.first()) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36529");
            if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
              inference_datastructures_strategy.set_tactic_thrown_away_wrt(strategem, strategy, $kw10$TRANSFORMATION);
            }
          }
        }
        return Sequences.length(strategems_to_activate);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 39517)
  public static final SubLObject balanced_strategy_note_argument_link_added(SubLObject strategy, SubLObject link) {
    if ((NIL != inference_worker_transformation.transformation_link_p(link))) {
      balanced_strategy_possibly_activate_transformation_link(strategy, link);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 39836)
  public static final SubLObject balanced_strategy_possibly_activate_transformation_link(SubLObject strategy, SubLObject transformation_link) {
    if ((NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link))) {
      if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, transformation_link))) {
        balanced_strategy_activate_transformation_link(strategy, transformation_link);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 40284)
  public static final SubLObject balanced_strategy_activate_transformation_link(SubLObject strategy, SubLObject transformation_link) {
    inference_balanced_tactician_datastructures.balanced_strategy_note_problem_unpending_wrt_transformation(strategy, inference_datastructures_problem_link.problem_link_supported_problem(transformation_link));
    {
      SubLObject transformation_tactic = inference_worker_transformation.transformation_link_tactic(transformation_link);
      if ((NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic, $kw10$TRANSFORMATION, UNPROVIDED, UNPROVIDED))) {
        if ((NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic, $kw10$TRANSFORMATION, NIL, NIL, T))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36527");
        } else {
          inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_transformation(strategy, transformation_link);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 41078)
  public static final SubLObject balanced_strategy_note_new_tactic(SubLObject strategy, SubLObject tactic) {
    inference_worker.default_compute_strategic_properties_of_tactic(strategy, tactic);
    if ((!((((NIL != inference_worker_split.split_tactic_p(tactic))
             && (NIL != inference_worker_split.meta_split_tactics_enabledP()))
          || (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategy, tactic)))))) {
      balanced_strategy_note_new_tactic_possible(strategy, tactic);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 41983)
  public static final SubLObject balanced_strategy_note_new_tactic_possible(SubLObject strategy, SubLObject tactic) {
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
        SubLObject cdolist_list_var = ((NIL != inference_worker_split.split_tactic_p(tactic)) ? ((SubLObject) $list27) : $list28);
        SubLObject motivation = NIL;
        for (motivation = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), motivation = cdolist_list_var.first()) {
          inference_balanced_tactician_datastructures.balanced_strategy_note_problem_unpending(strategy, inference_datastructures_tactic.tactic_problem(tactic), motivation);
          if ((NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, motivation, problem_already_consideredP, NIL))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36528");
          } else if ((NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, motivation, problem_already_consideredP, NIL, T))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36522");
          } else {
            inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem(strategy, tactic, motivation);
          }
        }
      }
    }
    return NIL;
  }

  /** @return 0 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to activate wrt removal.
   Strategems are ordered in intended order of activation.
   @return 1 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to set aside wrt removal.
   @return 2 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to throw away wrt removal. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 44498)
  public static final SubLObject balanced_strategy_categorize_strategems_wrt_removal(SubLObject strategy, SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject strategems_to_activate = NIL;
        SubLObject strategems_to_set_aside = NIL;
        SubLObject strategems_to_throw_away = NIL;
        SubLObject problem_set_aside_wrt_removalP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, $kw14$REMOVAL, UNPROVIDED, UNPROVIDED);
        SubLObject problem_thrown_away_wrt_removalP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, $kw14$REMOVAL, UNPROVIDED);
        thread.resetMultipleValues();
        {
          SubLObject best_complete_removal_tactic = balanced_strategy_categorize_removal_tactics_wrt_removal(strategy, problem, problem_set_aside_wrt_removalP, problem_thrown_away_wrt_removalP);
          SubLObject possible_non_complete_removal_tactics = thread.secondMultipleValue();
          SubLObject set_aside_removal_tactics = thread.thirdMultipleValue();
          SubLObject thrown_away_removal_tactics = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          thread.resetMultipleValues();
          {
            SubLObject possible_motivation_strategems = balanced_strategy_categorize_motivation_strategems_wrt_removal(strategy, problem, problem_set_aside_wrt_removalP, problem_thrown_away_wrt_removalP);
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
                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(meta_structural_tactic, $kw31$META_STRUCTURAL))) {
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

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 47252)
  public static final SubLObject balanced_strategy_categorize_motivation_strategems_wrt_removal(SubLObject strategy, SubLObject problem, SubLObject problem_set_aside_wrt_removalP, SubLObject problem_thrown_away_wrt_removalP) {
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
            SubLObject possible_motivation_strategems_22 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35699");
            SubLObject set_aside_motivation_strategems_23 = thread.secondMultipleValue();
            SubLObject thrown_away_motivation_strategems_24 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            possible_motivation_strategems = possible_motivation_strategems_22;
            set_aside_motivation_strategems = set_aside_motivation_strategems_23;
            thrown_away_motivation_strategems = thrown_away_motivation_strategems_24;
          }
        } else if ((NIL != inference_datastructures_problem.problem_has_split_tacticsP(problem))) {
          thread.resetMultipleValues();
          {
            SubLObject possible_motivation_strategems_25 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35700");
            SubLObject set_aside_motivation_strategems_26 = thread.secondMultipleValue();
            SubLObject thrown_away_motivation_strategems_27 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            possible_motivation_strategems = possible_motivation_strategems_25;
            set_aside_motivation_strategems = set_aside_motivation_strategems_26;
            thrown_away_motivation_strategems = thrown_away_motivation_strategems_27;
          }
        } else {
          thread.resetMultipleValues();
          {
            SubLObject possible_motivation_strategems_28 = balanced_strategy_categorize_connected_conjunction_tactics_wrt_removal(strategy, problem, problem_set_aside_wrt_removalP, problem_thrown_away_wrt_removalP);
            SubLObject set_aside_motivation_strategems_29 = thread.secondMultipleValue();
            SubLObject thrown_away_motivation_strategems_30 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            possible_motivation_strategems = possible_motivation_strategems_28;
            set_aside_motivation_strategems = set_aside_motivation_strategems_29;
            thrown_away_motivation_strategems = thrown_away_motivation_strategems_30;
          }
        }
        return Values.values(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
      }
    }
  }

  /** Possible non-complete removal tactics should be in the reverse intended activation order */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 48684)
  public static final SubLObject balanced_strategy_categorize_removal_tactics_wrt_removal(SubLObject strategy, SubLObject problem, SubLObject problem_set_aside_wrt_removalP, SubLObject problem_thrown_away_wrt_removalP) {
    {
      SubLObject best_complete_removal_tactic = NIL;
      SubLObject best_complete_removal_tactic_productivity = NIL;
      SubLObject set_aside_removal_tactics = NIL;
      SubLObject possible_non_complete_removal_tactics = NIL;
      if ((NIL == problem_thrown_away_wrt_removalP)) {
        {
          SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
          SubLObject removal_tactic = NIL;
          for (removal_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), removal_tactic = cdolist_list_var.first()) {
            if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $kw32$GENERALIZED_REMOVAL_OR_REWRITE))
                 && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $kw33$POSSIBLE)))) {
              if ((NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, removal_tactic, $kw14$REMOVAL, T, UNPROVIDED))) {
                if (((NIL != problem_set_aside_wrt_removalP)
                    || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, removal_tactic, $kw14$REMOVAL, T, UNPROVIDED, UNPROVIDED)))) {
                  if ((NIL == best_complete_removal_tactic)) {
                    set_aside_removal_tactics = cons(removal_tactic, set_aside_removal_tactics);
                  }
                } else {
                  {
                    SubLObject completeness = inference_datastructures_strategy.tactic_strategic_completeness(removal_tactic, strategy);
                    SubLObject pcase_var = completeness;
                    if (pcase_var.eql($kw34$COMPLETE)) {
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
                    } else if ((pcase_var.eql($kw35$INCOMPLETE)
                        || pcase_var.eql($kw36$GROSSLY_INCOMPLETE))) {
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
        possible_non_complete_removal_tactics = inference_tactician.strategy_sort(strategy, possible_non_complete_removal_tactics, $sym37$TACTIC_STRATEGIC_PRODUCTIVITY__);
      }
      {
        SubLObject thrown_away_removal_tactics = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject removal_tactic = NIL;
        for (removal_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), removal_tactic = cdolist_list_var.first()) {
          if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $kw32$GENERALIZED_REMOVAL_OR_REWRITE))
               && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $kw33$POSSIBLE)))) {
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

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 54456)
  public static final SubLObject balanced_strategy_categorize_connected_conjunction_tactics_wrt_removal(SubLObject strategy, SubLObject problem, SubLObject problem_set_aside_wrt_removalP, SubLObject problem_thrown_away_wrt_removalP) {
    {
      SubLObject possible_motivation_strategems = NIL;
      SubLObject set_aside_motivation_strategems = NIL;
      SubLObject committed_tactic = NIL;
      SubLObject committed_tactic_productivity = $kw40$POSITIVE_INFINITY;
      SubLObject committed_tactic_preference = $kw41$DISALLOWED;
      SubLObject committed_tactic_module_spec = $kw12$JOIN_ORDERED;
      SubLObject committed_tactic_literal_count = ZERO_INTEGER;
      SubLObject cheap_backtracking_tactics = NIL;
      if ((NIL == problem_thrown_away_wrt_removalP)) {
        {
          SubLObject problem_var = problem;
          SubLObject type_var = $kw42$CONNECTED_CONJUNCTION;
          SubLObject subsuming_join_ordered_tactics = inference_tactician.problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem_var, type_var);
          SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem_var);
          SubLObject candidate_tactic = NIL;
          for (candidate_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate_tactic = cdolist_list_var.first()) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, type_var))) {
              if ((NIL == inference_tactician.some_subsuming_join_ordered_tacticP(candidate_tactic, subsuming_join_ordered_tactics, strategy))) {
                {
                  SubLObject link = inference_worker.logical_tactic_link(candidate_tactic);
                  SubLObject candidate_tactic_module_spec = ((NIL != inference_worker_join.join_tactic_p(candidate_tactic)) ? ((SubLObject) $kw43$JOIN) : $kw12$JOIN_ORDERED);
                  if ((NIL == balanced_strategy_link_motivates_problemP(strategy, link, $kw14$REMOVAL, UNPROVIDED))) {
                    if ((NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_connected_conjunction_link_wrt_removalP(strategy, link))) {
                      if (((NIL != problem_set_aside_wrt_removalP)
                          || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_connected_conjunction_link_wrt_removalP(strategy, link)))) {
                        set_aside_motivation_strategems = cons(candidate_tactic, set_aside_motivation_strategems);
                      } else {
                        {
                          SubLObject candidate_tactic_productivity = inference_lookahead_productivity.tactic_max_removal_productivity(candidate_tactic, strategy);
                          SubLObject candidate_tactic_preference = inference_datastructures_strategy.tactic_strategic_preference_level(candidate_tactic, strategy);
                          SubLObject candidate_tactic_literal_count = inference_worker.connected_conjunction_tactic_literal_count(candidate_tactic);
                          SubLObject magic_wandP = inference_tactician_utilities.magic_wand_tacticP(candidate_tactic, strategy);
                          if ((NIL != magic_wandP)) {
                            candidate_tactic_preference = $kw41$DISALLOWED;
                          }
                          if (((NIL == committed_tactic)
                              || (NIL != inference_tactician_utilities.strategy_deems_conjunctive_tactic_spec_betterP(candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literal_count, committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literal_count)))) {
                            committed_tactic = candidate_tactic;
                            committed_tactic_productivity = candidate_tactic_productivity;
                            committed_tactic_preference = candidate_tactic_preference;
                            committed_tactic_module_spec = candidate_tactic_module_spec;
                            committed_tactic_literal_count = candidate_tactic_literal_count;
                          }
                          if (((NIL == magic_wandP)
                               && (NIL != balanced_strategy_logical_tactic_removal_backtracking_cheapP(candidate_tactic, strategy)))) {
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
          if ((NIL != balanced_strategy_commits_to_no_removal_backtrackingP(strategy, committed_tactic, committed_tactic_preference))) {
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
          possible_motivation_strategems = inference_tactician.strategy_sort(strategy, possible_motivation_strategems, $sym25$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
        }
      }
      {
        SubLObject thrown_away_motivation_strategems = NIL;
        SubLObject problem_var = problem;
        SubLObject type_var = $kw42$CONNECTED_CONJUNCTION;
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

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 58306)
  public static final SubLObject balanced_strategy_commits_to_no_removal_backtrackingP(SubLObject strategy, SubLObject committed_tactic, SubLObject committed_tactic_preference_level) {
    if ((NIL != ((NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(committed_tactic))) ? ((SubLObject) Equality.eq($kw34$COMPLETE, inference_worker.logical_tactic_generalized_removal_completeness(committed_tactic, strategy))) : Equality.eq($kw44$PREFERRED, committed_tactic_preference_level)))) {
      if ((NIL != balanced_strategy_logical_tactic_removal_backtracking_cheapP(committed_tactic, strategy))) {
        return T;
      }
    }
    if ((NIL != inference_trampolines.problem_backchain_requiredP(inference_datastructures_tactic.tactic_problem(committed_tactic)))) {
      return T;
    }
    return NIL;
  }

  /** @return 0 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to activate wrt transformation.
   Strategems are ordered in intended order of activation.
   @return 1 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to set aside wrt transformation.
   @return 2 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to throw away wrt transformation. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 59272)
  public static final SubLObject balanced_strategy_categorize_strategems_wrt_transformation(SubLObject strategy, SubLObject problem) {
    {
      SubLObject strategems_to_activate = NIL;
      SubLObject strategems_to_set_aside = NIL;
      if ((NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, $kw10$TRANSFORMATION, UNPROVIDED))) {
        {
          SubLObject problem_set_aside_wrt_transformationP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, $kw10$TRANSFORMATION, UNPROVIDED, UNPROVIDED);
          {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject transformation_tactic = NIL;
            for (transformation_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), transformation_tactic = cdolist_list_var.first()) {
              if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, $kw10$TRANSFORMATION))
                   && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(transformation_tactic, $kw33$POSSIBLE)))) {
                if ((NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic, $kw10$TRANSFORMATION, T, UNPROVIDED))) {
                  if (((NIL != problem_set_aside_wrt_transformationP)
                      || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic, $kw10$TRANSFORMATION, T, UNPROVIDED, UNPROVIDED)))) {
                    strategems_to_set_aside = cons(transformation_tactic, strategems_to_set_aside);
                  } else {
                    strategems_to_activate = cons(transformation_tactic, strategems_to_activate);
                  }
                }
              }
            }
          }
          {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
              {
                SubLObject transformation_link = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, transformation_link))) {
                  if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $kw10$TRANSFORMATION))) {
                    if ((NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link))) {
                      if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, transformation_link))) {
                        {
                          SubLObject transformation_tactic = inference_worker_transformation.transformation_link_tactic(transformation_link);
                          if ((NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic, $kw10$TRANSFORMATION, T, UNPROVIDED))) {
                            if (((NIL != problem_set_aside_wrt_transformationP)
                                || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic, $kw10$TRANSFORMATION, T, UNPROVIDED, UNPROVIDED)))) {
                              strategems_to_set_aside = cons(transformation_tactic, strategems_to_set_aside);
                            } else {
                              strategems_to_activate = cons(transformation_tactic, strategems_to_activate);
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
          if ((NIL == inference_datastructures_problem.single_literal_problem_p(problem))) {
            {
              SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
              SubLObject logical_tactic = NIL;
              for (logical_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), logical_tactic = cdolist_list_var.first()) {
                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(logical_tactic, $kw13$LOGICAL))) {
                  if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, logical_tactic))) {
                    if ((NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, logical_tactic, $kw10$TRANSFORMATION, T, UNPROVIDED))) {
                      if (((NIL != problem_set_aside_wrt_transformationP)
                          || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, logical_tactic, $kw10$TRANSFORMATION, T, UNPROVIDED, UNPROVIDED)))) {
                        strategems_to_set_aside = cons(logical_tactic, strategems_to_set_aside);
                      } else {
                        strategems_to_activate = cons(logical_tactic, strategems_to_activate);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      strategems_to_activate = Sequences.nreverse(strategems_to_activate);
      strategems_to_set_aside = Sequences.nreverse(strategems_to_set_aside);
      {
        SubLObject strategems_to_throw_away = NIL;
        {
          SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
          SubLObject transformation_tactic = NIL;
          for (transformation_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), transformation_tactic = cdolist_list_var.first()) {
            if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, $kw10$TRANSFORMATION))
                 && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(transformation_tactic, $kw33$POSSIBLE)))) {
              if ((!(((NIL != list_utilities.member_eqP(transformation_tactic, strategems_to_activate))
                    || (NIL != list_utilities.member_eqP(transformation_tactic, strategems_to_set_aside)))))) {
                strategems_to_throw_away = cons(transformation_tactic, strategems_to_throw_away);
              }
            }
          }
        }
        {
          SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
          SubLObject state = NIL;
          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            {
              SubLObject transformation_link = set_contents.do_set_contents_next(basis_object, state);
              if ((NIL != set_contents.do_set_contents_element_validP(state, transformation_link))) {
                if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $kw10$TRANSFORMATION))) {
                  if ((!(((NIL != list_utilities.member_eqP(transformation_link, strategems_to_activate))
                        || (NIL != list_utilities.member_eqP(transformation_link, strategems_to_set_aside)))))) {
                    strategems_to_throw_away = cons(transformation_link, strategems_to_throw_away);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
          SubLObject logical_tactic = NIL;
          for (logical_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), logical_tactic = cdolist_list_var.first()) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(logical_tactic, $kw13$LOGICAL))) {
              if ((!(((NIL != list_utilities.member_eqP(logical_tactic, strategems_to_activate))
                    || (NIL != list_utilities.member_eqP(logical_tactic, strategems_to_set_aside)))))) {
                strategems_to_throw_away = cons(logical_tactic, strategems_to_throw_away);
              }
            }
          }
        }
        return Values.values(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 63183)
  public static final SubLObject balanced_strategy_logical_tactic_removal_backtracking_cheapP(SubLObject logical_tactic, SubLObject strategy) {
    if ((NIL == inference_worker_join.join_tactic_p(logical_tactic))) {
      {
        SubLObject removal_backtracking_productivity_threshold = inference_balanced_tactician_datastructures.balanced_strategy_removal_backtracking_productivity_limit(strategy);
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

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 68324)
  public static final SubLObject balanced_strategy_reactivate_executable_strategem(SubLObject strategy, SubLObject strategem) {
    checkType(strategy, $sym8$BALANCED_STRATEGY_P);
    checkType(strategem, $sym46$EXECUTABLE_STRATEGEM_P);
    if ((NIL != inference_worker_removal.generalized_removal_tactic_p(strategem))) {
      return inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_removal(strategy, strategem);
    } else if ((NIL != inference_worker_transformation.transformation_tactic_p(strategem))) {
      return inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_transformation(strategy, strategem);
    } else if ((NIL != inference_worker.meta_structural_tactic_p(strategem))) {
      inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_removal(strategy, strategem);
      return strategem;
    } else {
      return inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_removal(strategy, strategem);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 69186)
  public static final SubLObject balanced_strategy_strategically_deactivate_strategem(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
    if ((NIL != inference_tactician.strategem_invalid_p(strategem))) {
      return NIL;
    }
    {
      SubLObject strategem_var = strategem;
      SubLObject problem = inference_tactician.strategem_problem(strategem_var);
      balanced_strategy_deactivate_strategem(strategy, strategem_var, motivation);
      balanced_strategy_possibly_deactivate_problem(strategy, problem);
    }
    if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
      inference_worker.consider_strategic_ramifications_of_possibly_executed_tactic(strategy, strategem);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 69698)
  public static final SubLObject balanced_strategy_deactivate_strategem(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw14$REMOVAL)) {
        return balanced_strategy_deactivate_strategem_wrt_removal(strategy, strategem);
      } else if (pcase_var.eql($kw10$TRANSFORMATION)) {
        return balanced_strategy_deactivate_strategem_wrt_transformation(strategy, strategem);
      } else {
        return Errors.error($str16$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 70101)
  public static final SubLObject balanced_strategy_deactivate_strategem_wrt_removal(SubLObject strategy, SubLObject removal_strategem) {
    checkType(strategy, $sym8$BALANCED_STRATEGY_P);
    checkType(removal_strategem, $sym47$REMOVAL_STRATEGEM_P);
    {
      SubLObject problem = inference_tactician.strategem_problem(removal_strategem);
      SubLObject index = inference_balanced_tactician_datastructures.balanced_strategy_problem_total_strategems_active_wrt_removal(strategy);
      SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
      count = Numbers.subtract(count, ONE_INTEGER);
      if (count.isPositive()) {
        dictionary.dictionary_enter(index, problem, count);
      } else {
        dictionary.dictionary_remove(index, problem);
        inference_balanced_tactician_datastructures.balanced_strategy_note_problem_pending(strategy, problem, $kw14$REMOVAL);
      }
      return count;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 70721)
  public static final SubLObject balanced_strategy_deactivate_strategem_wrt_transformation(SubLObject strategy, SubLObject transformation_strategem) {
    checkType(strategy, $sym8$BALANCED_STRATEGY_P);
    checkType(transformation_strategem, $sym48$TRANSFORMATION_STRATEGEM_P);
    {
      SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
      SubLObject index = inference_balanced_tactician_datastructures.balanced_strategy_problem_total_strategems_active_wrt_transformation(strategy);
      SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
      count = Numbers.subtract(count, ONE_INTEGER);
      if (count.isPositive()) {
        dictionary.dictionary_enter(index, problem, count);
      } else {
        dictionary.dictionary_remove(index, problem);
        inference_balanced_tactician_datastructures.balanced_strategy_note_problem_pending(strategy, problem, $kw10$TRANSFORMATION);
      }
      return count;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 71389)
  public static final SubLObject balanced_strategy_possibly_deactivate_problem(SubLObject strategy, SubLObject problem) {
    if (((NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $kw15$NEW_ROOT))
         && (NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $kw14$REMOVAL))
         && (NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $kw10$TRANSFORMATION)))) {
      inference_datastructures_strategy.strategy_note_problem_inactive(strategy, problem);
      if (((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_set_asideP(strategy, problem, $kw15$NEW_ROOT))
          || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_set_asideP(strategy, problem, $kw14$REMOVAL))
          || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_set_asideP(strategy, problem, $kw10$TRANSFORMATION)))) {
        inference_datastructures_strategy.strategy_note_problem_set_aside(strategy, problem);
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 72084)
  public static final SubLObject balanced_strategy_consider_that_problem_could_be_strategically_totally_pending(SubLObject strategy, SubLObject problem) {
    {
      SubLObject pending_wrt_new_rootP = balanced_strategy_consider_that_problem_could_be_strategically_pending(strategy, problem, $kw15$NEW_ROOT);
      SubLObject pending_wrt_removalP = balanced_strategy_consider_that_problem_could_be_strategically_pending(strategy, problem, $kw14$REMOVAL);
      SubLObject pending_wrt_transformationP = balanced_strategy_consider_that_problem_could_be_strategically_pending(strategy, problem, $kw10$TRANSFORMATION);
      return makeBoolean(((NIL != pending_wrt_new_rootP)
            || (NIL != pending_wrt_removalP)
            || (NIL != pending_wrt_transformationP)));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 73492)
  public static final SubLObject balanced_strategy_consider_that_problem_could_be_strategically_pending(SubLObject strategy, SubLObject problem, SubLObject motivation) {
    if ((NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation, UNPROVIDED))) {
      balanced_strategy_make_problem_pending(strategy, problem, motivation);
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 73797)
  public static final SubLObject balanced_strategy_make_problem_pending(SubLObject strategy, SubLObject problem, SubLObject motivation) {
    inference_balanced_tactician_datastructures.balanced_strategy_note_problem_pending(strategy, problem, motivation);
    balanced_strategy_possibly_deactivate_problem(strategy, problem);
    return NIL;
  }

  /** you're join-ordered, you have R, your supported problem has N, your lookahead problem is complete, you're cheap, and you're open. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-motivation.lisp", position = 74034)
  public static final SubLObject balanced_strategy_early_removal_linkP(SubLObject strategy, SubLObject link) {
    checkType(strategy, $sym8$BALANCED_STRATEGY_P);
    checkType(link, $sym49$PROBLEM_LINK_P);
    return makeBoolean(((NIL != inference_worker_join_ordered.join_ordered_link_p(link))
           && (NIL != inference_datastructures_problem_link.problem_link_openP(link))
           && (NIL != inference_balanced_tactician_datastructures.balanced_strategy_connected_conjunction_link_motivated_wrt_removalP(strategy, link))
           && (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_new_rootP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link)))
           && ($kw34$COMPLETE == inference_worker.problem_generalized_removal_completeness(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(inference_worker_join_ordered.join_ordered_link_tactic(link)), strategy))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35448"))));
  }

  public static final SubLObject declare_inference_balanced_tactician_motivation_file() {
    declareMacro(myName, "balanced_strategy_with_strategically_active_strategem", "BALANCED-STRATEGY-WITH-STRATEGICALLY-ACTIVE-STRATEGEM");
    declareFunction(myName, "balanced_strategy_possibly_propagate_motivation_to_link_head", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 3, 0, false);
    declareFunction(myName, "balanced_strategy_propagate_motivation_to_link_head", "BALANCED-STRATEGY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 3, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_propagate_new_root_motivation_down_split_link", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-SPLIT-LINK", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_propagate_new_root_motivation_down_union_link", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-UNION-LINK", 2, 0, false);
    declareFunction(myName, "balanced_strategy_propagate_transformation_motivation_to_transformation_link", "BALANCED-STRATEGY-PROPAGATE-TRANSFORMATION-MOTIVATION-TO-TRANSFORMATION-LINK", 2, 0, false);
    declareFunction(myName, "balanced_strategy_transformation_new_root_candidates", "BALANCED-STRATEGY-TRANSFORMATION-NEW-ROOT-CANDIDATES", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_make_d_a_new_rootP", "BALANCED-STRATEGY-CHOOSES-TO-MAKE-D-A-NEW-ROOT?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_residual_conjunction_new_root_candidates", "BALANCED-STRATEGY-RESIDUAL-CONJUNCTION-NEW-ROOT-CANDIDATES", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_motivate_new_root_via_residual_transformation_link", "BALANCED-STRATEGY-POSSIBLY-MOTIVATE-NEW-ROOT-VIA-RESIDUAL-TRANSFORMATION-LINK", 2, 1, false);
    declareFunction(myName, "balanced_strategy_allows_transformation_link_to_propagate_new_root_motivationP", "BALANCED-STRATEGY-ALLOWS-TRANSFORMATION-LINK-TO-PROPAGATE-NEW-ROOT-MOTIVATION?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_allows_problem_to_propagate_new_root_motivationP", "BALANCED-STRATEGY-ALLOWS-PROBLEM-TO-PROPAGATE-NEW-ROOT-MOTIVATION?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_link_motivates_problem_wrt_removalP", "BALANCED-STRATEGY-LINK-MOTIVATES-PROBLEM-WRT-REMOVAL?", 2, 1, false);
    declareFunction(myName, "balanced_strategy_link_motivates_problem_wrt_transformationP", "BALANCED-STRATEGY-LINK-MOTIVATES-PROBLEM-WRT-TRANSFORMATION?", 2, 1, false);
    declareFunction(myName, "balanced_strategy_link_motivates_problemP", "BALANCED-STRATEGY-LINK-MOTIVATES-PROBLEM?", 3, 1, false);
    declareFunction(myName, "balanced_strategy_link_motivates_lookahead_problemP", "BALANCED-STRATEGY-LINK-MOTIVATES-LOOKAHEAD-PROBLEM?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_propagate_motivation_to_problem", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 3, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_make_new_root", "BALANCED-STRATEGY-POSSIBLY-MAKE-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_propagate_new_root_motivation_to_problem", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-TO-PROBLEM", 2, 0, false);
    declareFunction(myName, "balanced_strategy_propagate_new_root_motivation_to_problem", "BALANCED-STRATEGY-PROPAGATE-NEW-ROOT-MOTIVATION-TO-PROBLEM", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_propagate_removal_motivation_to_problem", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-REMOVAL-MOTIVATION-TO-PROBLEM", 2, 0, false);
    declareFunction(myName, "balanced_strategy_propagate_removal_motivation_to_problem", "BALANCED-STRATEGY-PROPAGATE-REMOVAL-MOTIVATION-TO-PROBLEM", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_propagate_transformation_motivation_to_problem", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-TRANSFORMATION-MOTIVATION-TO-PROBLEM", 2, 0, false);
    declareFunction(myName, "balanced_strategy_propagate_transformation_motivation_to_problem", "BALANCED-STRATEGY-PROPAGATE-TRANSFORMATION-MOTIVATION-TO-PROBLEM", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_activate_problem", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false); new $balanced_strategy_possibly_activate_problem$BinaryFunction();
    declareFunction(myName, "balanced_strategy_problem_is_the_rest_of_a_removalP", "BALANCED-STRATEGY-PROBLEM-IS-THE-REST-OF-A-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_is_the_rest_of_an_early_removalP", "BALANCED-STRATEGY-PROBLEM-IS-THE-REST-OF-AN-EARLY-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_is_the_rest_of_a_join_orderedP", "BALANCED-STRATEGY-PROBLEM-IS-THE-REST-OF-A-JOIN-ORDERED?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_propagate_proof_spec_to_restricted_non_focals", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-PROOF-SPEC-TO-RESTRICTED-NON-FOCALS", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_motivated_without_join_ordered_wrt_removalP", "BALANCED-STRATEGY-PROBLEM-MOTIVATED-WITHOUT-JOIN-ORDERED-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_motivates_problem_via_rewriteP", "BALANCED-STRATEGY-MOTIVATES-PROBLEM-VIA-REWRITE?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP", "BALANCED-STRATEGY-CHOOSES-TO-PROPAGATE-NEW-ROOT-MOTIVATION-TO-RESTRICTED-NON-FOCAL-PROBLEM?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_treats_restricted_non_focal_as_new_rootP", "BALANCED-STRATEGY-TREATS-RESTRICTED-NON-FOCAL-AS-NEW-ROOT?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_not_to_examine_problemP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_not_to_activate_problemP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_not_to_activate_problem_wrt_new_rootP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM-WRT-NEW-ROOT?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_not_to_activate_problem_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_not_to_activate_problem_wrt_transformationP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM-WRT-TRANSFORMATION?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_activate_problem_wrt_new_root", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_activate_problem_wrt_removal", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_activate_problem_wrt_transformation", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_activate_problem_wrt_new_root", "BALANCED-STRATEGY-ACTIVATE-PROBLEM-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "balanced_strategy_activate_problem_wrt_removal", "BALANCED-STRATEGY-ACTIVATE-PROBLEM-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_activate_problem_wrt_transformation", "BALANCED-STRATEGY-ACTIVATE-PROBLEM-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_activate_strategems_wrt_new_root", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_activate_strategems_wrt_removal", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "merge_balanced_and_rl_tactician_strategems", "MERGE-BALANCED-AND-RL-TACTICIAN-STRATEGEMS", 6, 0, false);
    declareFunction(myName, "balanced_strategy_filter_strategems_by_rlt_tactic_types", "BALANCED-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES", 2, 0, false);
    declareFunction(myName, "balanced_strategy_filter_strategems_by_rlt_tactic_types_int", "BALANCED-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES-INT", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_activate_strategems_wrt_transformation", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_activate_transformation_argument_links_wrt_transformation", "BALANCED-STRATEGY-ACTIVATE-TRANSFORMATION-ARGUMENT-LINKS-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_argument_link_added", "BALANCED-STRATEGY-NOTE-ARGUMENT-LINK-ADDED", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_activate_transformation_link", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-TRANSFORMATION-LINK", 2, 0, false);
    declareFunction(myName, "balanced_strategy_activate_transformation_link", "BALANCED-STRATEGY-ACTIVATE-TRANSFORMATION-LINK", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_new_tactic", "BALANCED-STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_split_tactics_strategically_possible", "BALANCED-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_new_tactic_possible", "BALANCED-STRATEGY-NOTE-NEW-TACTIC-POSSIBLE", 2, 0, false);
    declareFunction(myName, "balanced_strategy_categorize_strategems", "BALANCED-STRATEGY-CATEGORIZE-STRATEGEMS", 3, 0, false);
    declareFunction(myName, "balanced_strategy_categorize_strategems_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-STRATEGEMS-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_categorize_motivation_strategems_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-MOTIVATION-STRATEGEMS-WRT-REMOVAL", 4, 0, false);
    declareFunction(myName, "balanced_strategy_categorize_removal_tactics_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-REMOVAL-TACTICS-WRT-REMOVAL", 4, 0, false);
    declareFunction(myName, "balanced_strategy_categorize_disjunctive_tactics_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-DISJUNCTIVE-TACTICS-WRT-REMOVAL", 4, 0, false);
    declareFunction(myName, "balanced_strategy_categorize_split_tactics_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-SPLIT-TACTICS-WRT-REMOVAL", 4, 0, false);
    declareFunction(myName, "balanced_strategy_categorize_connected_conjunction_tactics_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-CONNECTED-CONJUNCTION-TACTICS-WRT-REMOVAL", 4, 0, false);
    declareFunction(myName, "balanced_strategy_commits_to_no_removal_backtrackingP", "BALANCED-STRATEGY-COMMITS-TO-NO-REMOVAL-BACKTRACKING?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_categorize_strategems_wrt_transformation", "BALANCED-STRATEGY-CATEGORIZE-STRATEGEMS-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_logical_tactic_removal_backtracking_cheapP", "BALANCED-STRATEGY-LOGICAL-TACTIC-REMOVAL-BACKTRACKING-CHEAP?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_estimated_global_productivity_wrt_removal_strategems", "BALANCED-STRATEGY-PROBLEM-ESTIMATED-GLOBAL-PRODUCTIVITY-WRT-REMOVAL-STRATEGEMS", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_estimated_global_removal_productivity", "BALANCED-STRATEGY-PROBLEM-ESTIMATED-GLOBAL-REMOVAL-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_reconsider_split_set_asides_wrt_removal", "BALANCED-STRATEGY-POSSIBLY-RECONSIDER-SPLIT-SET-ASIDES-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_reconsider_one_split_set_aside_wrt_removal", "BALANCED-STRATEGY-RECONSIDER-ONE-SPLIT-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_clear_strategic_status_wrt_removal", "BALANCED-STRATEGY-POSSIBLY-CLEAR-STRATEGIC-STATUS-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_reactivate_executable_strategem", "BALANCED-STRATEGY-REACTIVATE-EXECUTABLE-STRATEGEM", 2, 0, false);
    declareFunction(myName, "balanced_strategy_strategically_deactivate_strategem", "BALANCED-STRATEGY-STRATEGICALLY-DEACTIVATE-STRATEGEM", 3, 0, false);
    declareFunction(myName, "balanced_strategy_deactivate_strategem", "BALANCED-STRATEGY-DEACTIVATE-STRATEGEM", 3, 0, false);
    declareFunction(myName, "balanced_strategy_deactivate_strategem_wrt_removal", "BALANCED-STRATEGY-DEACTIVATE-STRATEGEM-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_deactivate_strategem_wrt_transformation", "BALANCED-STRATEGY-DEACTIVATE-STRATEGEM-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_deactivate_problem", "BALANCED-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM", 2, 0, false);
    declareFunction(myName, "balanced_strategy_consider_that_problem_could_be_strategically_totally_pending", "BALANCED-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-TOTALLY-PENDING", 2, 0, false);
    declareFunction(myName, "balanced_strategy_consider_that_problem_could_be_strategically_pending", "BALANCED-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 3, 0, false);
    declareFunction(myName, "balanced_strategy_make_problem_pending", "BALANCED-STRATEGY-MAKE-PROBLEM-PENDING", 3, 0, false);
    declareFunction(myName, "balanced_strategy_early_removal_linkP", "BALANCED-STRATEGY-EARLY-REMOVAL-LINK?", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_balanced_tactician_motivation_file() {
    $balanced_strategy_new_roots_triggered_by_t_on_jo_linkP$ = defparameter("*BALANCED-STRATEGY-NEW-ROOTS-TRIGGERED-BY-T-ON-JO-LINK?*", T);
    $balanced_strategy_new_roots_check_for_t_on_jo_linkP$ = defvar("*BALANCED-STRATEGY-NEW-ROOTS-CHECK-FOR-T-ON-JO-LINK?*", T);
    $balanced_strategy_self_expanding_rule_fix_enabledP$ = defparameter("*BALANCED-STRATEGY-SELF-EXPANDING-RULE-FIX-ENABLED?*", T);
    $balanced_strategy_rl_tactician_tactic_types$ = defparameter("*BALANCED-STRATEGY-RL-TACTICIAN-TACTIC-TYPES*", $list23);
    return NIL;
  }

  public static final SubLObject setup_inference_balanced_tactician_motivation_file() {
    // CVS_ID("Id: inference-balanced-tactician-motivation.lisp 128006 2009-06-16 15:51:35Z pace ");
    utilities_macros.note_funcall_helper_function($sym24$BALANCED_STRATEGY_NOTE_NEW_TACTIC);
    utilities_macros.note_funcall_helper_function($sym26$BALANCED_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("STRATEGY"), makeSymbol("STRATEGEM"), makeSymbol("MOTIVATION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$PROBLEM = makeUninternedSymbol("PROBLEM");
  public static final SubLSymbol $sym2$STRATEGEM_VAR = makeUninternedSymbol("STRATEGEM-VAR");
  public static final SubLSymbol $sym3$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym4$STRATEGEM_PROBLEM = makeSymbol("STRATEGEM-PROBLEM");
  public static final SubLSymbol $sym5$BALANCED_STRATEGY_DEACTIVATE_STRATEGEM = makeSymbol("BALANCED-STRATEGY-DEACTIVATE-STRATEGEM");
  public static final SubLSymbol $sym6$BALANCED_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM = makeSymbol("BALANCED-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM");
  public static final SubLSymbol $sym7$MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");
  public static final SubLSymbol $sym8$BALANCED_STRATEGY_P = makeSymbol("BALANCED-STRATEGY-P");
  public static final SubLSymbol $kw9$RESTRICTION = makeKeyword("RESTRICTION");
  public static final SubLSymbol $kw10$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $kw11$RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
  public static final SubLSymbol $kw12$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw13$LOGICAL = makeKeyword("LOGICAL");
  public static final SubLSymbol $kw14$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw15$NEW_ROOT = makeKeyword("NEW-ROOT");
  public static final SubLString $str16$unexpected_motivation__s = makeString("unexpected motivation ~s");
  public static final SubLSymbol $kw17$SPLIT = makeKeyword("SPLIT");
  public static final SubLSymbol $kw18$UNION = makeKeyword("UNION");
  public static final SubLSymbol $kw19$PROVEN = makeKeyword("PROVEN");
  public static final SubLString $str20$_s_tried_to_propagate_T_to__s_but = makeString("~s tried to propagate T to ~s but it throws away all transformation");
  public static final SubLSymbol $kw21$REWRITE = makeKeyword("REWRITE");
  public static final SubLSymbol $sym22$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLList $list23 = list(makeKeyword("GENERALIZED-REMOVAL"), makeKeyword("CONNECTED-CONJUNCTION"), makeKeyword("SPLIT"), makeKeyword("UNION"));
  public static final SubLSymbol $sym24$BALANCED_STRATEGY_NOTE_NEW_TACTIC = makeSymbol("BALANCED-STRATEGY-NOTE-NEW-TACTIC");
  public static final SubLSymbol $sym25$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ = makeSymbol("LOGICAL-TACTIC-BETTER-WRT-REMOVAL?");
  public static final SubLSymbol $sym26$BALANCED_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE = makeSymbol("BALANCED-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE");
  public static final SubLList $list27 = list(makeKeyword("REMOVAL"), makeKeyword("TRANSFORMATION"));
  public static final SubLList $list28 = list(makeKeyword("TRANSFORMATION"));
  public static final SubLSymbol $sym29$BALANCED_STRATEGY_MOTIVATION_P = makeSymbol("BALANCED-STRATEGY-MOTIVATION-P");
  public static final SubLString $str30$time_to_categorize_strategems_wrt = makeString("time to categorize strategems wrt :new-root");
  public static final SubLSymbol $kw31$META_STRUCTURAL = makeKeyword("META-STRUCTURAL");
  public static final SubLSymbol $kw32$GENERALIZED_REMOVAL_OR_REWRITE = makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE");
  public static final SubLSymbol $kw33$POSSIBLE = makeKeyword("POSSIBLE");
  public static final SubLSymbol $kw34$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $kw35$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $kw36$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLSymbol $sym37$TACTIC_STRATEGIC_PRODUCTIVITY__ = makeSymbol("TACTIC-STRATEGIC-PRODUCTIVITY-<");
  public static final SubLSymbol $kw38$DISJUNCTIVE = makeKeyword("DISJUNCTIVE");
  public static final SubLSymbol $kw39$NON_DISCARDED = makeKeyword("NON-DISCARDED");
  public static final SubLSymbol $kw40$POSITIVE_INFINITY = makeKeyword("POSITIVE-INFINITY");
  public static final SubLSymbol $kw41$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLSymbol $kw42$CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
  public static final SubLSymbol $kw43$JOIN = makeKeyword("JOIN");
  public static final SubLSymbol $kw44$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLSymbol $sym45$SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");
  public static final SubLSymbol $sym46$EXECUTABLE_STRATEGEM_P = makeSymbol("EXECUTABLE-STRATEGEM-P");
  public static final SubLSymbol $sym47$REMOVAL_STRATEGEM_P = makeSymbol("REMOVAL-STRATEGEM-P");
  public static final SubLSymbol $sym48$TRANSFORMATION_STRATEGEM_P = makeSymbol("TRANSFORMATION-STRATEGEM-P");
  public static final SubLSymbol $sym49$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_inference_balanced_tactician_motivation_file();
  }

  @Override
  public void initializeVariables() {
    init_inference_balanced_tactician_motivation_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_inference_balanced_tactician_motivation_file();
  }

}
