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
 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.inference.harness.balancing_tactician;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.formula_pattern_match;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_analysis;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_rewrite;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_union;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.pattern_match;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.inference.modules.transformation_modules;
//dm import com.cyc.cycjava_1.cycl.unification;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class inference_tactician_strategic_uninterestingness extends SubLTranslatedFile {

  //// Constructor

  private inference_tactician_strategic_uninterestingness() {}
  public static final SubLFile me = new inference_tactician_strategic_uninterestingness();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 3077) 
  public static final SubLObject legacy_strategy_chooses_to_throw_away_tacticP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
    if ((motivation == UNPROVIDED)) {
      motivation = NIL;
    }
    if ((NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategy))) {
      if ((NIL != motivation)) {
        return inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, motivation, UNPROVIDED, UNPROVIDED);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35581");
      }
    } else {
      return simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 7587) 
  public static final SubLObject simple_strategy_chooses_to_throw_away_problemP(SubLObject strategy, SubLObject problem) {
    return simple_strategy_chooses_to_throw_away_problem_int(strategy, problem, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 8165) 
  public static final SubLObject simple_strategy_chooses_to_throw_away_problem_int(SubLObject strategy, SubLObject problem, SubLObject justifyP) {
    if ((NIL != strategy_deems_problem_tactically_uninterestingP(strategy, problem))) {
      if ((NIL != justifyP)) {
        return $str12$problem_is_tactically_uninteresti;
      } else {
        return T;
      }
    }
    {
      SubLObject inference_chooses_to_throw_away_problem_reason = why_inference_chooses_to_throw_away_problem(inference_datastructures_strategy.strategy_inference(strategy), problem);
      if ((NIL != inference_chooses_to_throw_away_problem_reason)) {
        if ((NIL != justifyP)) {
          return inference_chooses_to_throw_away_problem_reason;
        } else {
          return T;
        }
      }
    }
    if ((NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)))) {
      {
        SubLObject set_aside_reason = why_simple_strategy_chooses_to_set_aside_problem(strategy, problem);
        if ((NIL != set_aside_reason)) {
          if ((NIL != justifyP)) {
            return Sequences.cconcatenate($str13$inference_is_not_continuable__and, set_aside_reason);
          } else {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 9199) 
  public static final SubLObject simple_strategy_chooses_to_throw_away_tacticP(SubLObject strategy, SubLObject tactic) {
    return simple_strategy_chooses_to_throw_away_tactic_int(strategy, tactic, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 9549) 
  public static final SubLObject simple_strategy_chooses_to_throw_away_tactic_int(SubLObject strategy, SubLObject tactic, SubLObject justifyP) {
    if (((NIL == inference_worker.good_problem_p(inference_datastructures_tactic.tactic_problem(tactic), strategy))
         && (NIL != problem_has_executed_a_complete_removal_tacticP(inference_datastructures_tactic.tactic_problem(tactic), strategy)))) {
      if ((NIL != justifyP)) {
        return $str14$non_good_problem_has_already_exec;
      } else {
        return T;
      }
    }
    if ((NIL != simple_strategy_deems_rewrite_tactic_redundantP(strategy, tactic))) {
      if ((NIL != justifyP)) {
        return $str15$rewrite_tactic_is_redundant;
      } else {
        return T;
      }
    }
    if (((NIL != inference_worker_transformation.transformation_tactic_p(tactic))
         && (NIL != simple_strategy_chooses_to_throw_away_transformation_tacticP(strategy, tactic)))) {
      if ((NIL != justifyP)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35546");
      } else {
        return T;
      }
    }
    if ((NIL == strategy_allows_use_of_tactic_hl_moduleP(strategy, tactic))) {
      if ((NIL != justifyP)) {
        return $str16$HL_module_is_forbidden;
      } else {
        return T;
      }
    }
    if ((NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)))) {
      {
        SubLObject strategy_chooses_to_set_aside_tactic_reason = why_simple_strategy_chooses_to_set_aside_tactic(strategy, tactic);
        if ((NIL != strategy_chooses_to_set_aside_tactic_reason)) {
          if ((NIL != justifyP)) {
            return Sequences.cconcatenate($str13$inference_is_not_continuable__and, strategy_chooses_to_set_aside_tactic_reason);
          } else {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 11186) 
  public static final SubLObject problem_has_executed_a_complete_removal_tacticP(SubLObject problem, SubLObject strategic_context) {
    return problem_has_executed_a_complete_tacticP(problem, strategic_context, $kw17$GENERALIZED_REMOVAL);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 11986) 
  public static final SubLObject strategy_allows_use_of_tactic_hl_moduleP(SubLObject strategy, SubLObject tactic) {
    return strategy_allows_use_of_hl_moduleP(strategy, inference_datastructures_tactic.tactic_hl_module(tactic));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12144) 
  public static final SubLObject strategy_allows_use_of_hl_moduleP(SubLObject strategy, SubLObject hl_module) {
    return inference_datastructures_inference.inference_allows_use_of_moduleP(inference_datastructures_strategy.strategy_inference(strategy), hl_module);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12301) 
  public static final SubLObject simple_strategy_chooses_to_set_aside_problemP(SubLObject strategy, SubLObject problem) {
    return simple_strategy_chooses_to_set_aside_problem_int(strategy, problem, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12529) 
  public static final SubLObject why_simple_strategy_chooses_to_set_aside_problem(SubLObject strategy, SubLObject problem) {
    return simple_strategy_chooses_to_set_aside_problem_int(strategy, problem, T);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 12697) 
  public static final SubLObject simple_strategy_chooses_to_set_aside_problem_int(SubLObject strategy, SubLObject problem, SubLObject justifyP) {
    if ((NIL != inference_datastructures_strategy.strategically_totally_no_good_problem_p(problem, strategy))) {
      if ((NIL != justifyP)) {
        return $str18$problem_is_strategically_no_good;
      } else {
        return T;
      }
    }
    {
      SubLObject inference_chooses_to_set_aside_problem_reason = why_inference_chooses_to_set_aside_problem(inference_datastructures_strategy.strategy_inference(strategy), problem);
      if ((NIL != inference_chooses_to_set_aside_problem_reason)) {
        if ((NIL != justifyP)) {
          return inference_chooses_to_set_aside_problem_reason;
        } else {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13394) 
  public static final SubLObject simple_strategy_chooses_to_set_aside_tacticP(SubLObject strategy, SubLObject tactic) {
    return simple_strategy_chooses_to_set_aside_tactic_int(strategy, tactic, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13577) 
  public static final SubLObject why_simple_strategy_chooses_to_set_aside_tactic(SubLObject strategy, SubLObject tactic) {
    return simple_strategy_chooses_to_set_aside_tactic_int(strategy, tactic, T);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 13739) 
  public static final SubLObject simple_strategy_chooses_to_set_aside_tactic_int(SubLObject strategy, SubLObject tactic, SubLObject justifyP) {
    if ((((NIL != inference_worker.content_tactic_p(tactic))
          || (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy))))
         && (NIL != tactic_exceeds_productivity_limitP(tactic, strategy)))) {
      if ((NIL != justifyP)) {
        return $str19$tactic_exceeds_productivity_limit;
      } else {
        return T;
      }
    }
    if ((NIL != inference_worker_transformation.transformation_tactic_p(tactic))) {
      {
        SubLObject strategy_chooses_to_set_aside_transformation_tactic_reason = why_simple_strategy_chooses_to_set_aside_transformation_tactic(strategy, tactic);
        if ((NIL != strategy_chooses_to_set_aside_transformation_tactic_reason)) {
          if ((NIL != justifyP)) {
            return strategy_chooses_to_set_aside_transformation_tactic_reason;
          } else {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 15457) 
  public static final SubLObject simple_strategy_chooses_to_ignore_tacticP(SubLObject strategy, SubLObject tactic) {
    return makeBoolean(((NIL != simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic))
          || ((NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)))
             && (NIL != simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic)))));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 16400) 
  public static final SubLObject strategy_deems_problem_tactically_uninterestingP(SubLObject strategy, SubLObject problem) {
    return makeBoolean(((NIL != tactically_uninteresting_problem_p(problem))
          || (NIL != strategy_has_enough_proofs_for_problemP(strategy, problem))));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 16611) 
  public static final SubLObject strategy_has_enough_proofs_for_problemP(SubLObject strategy, SubLObject problem) {
    return makeBoolean(((NIL != inference_datastructures_problem.tactically_good_problem_p(problem))
           && ((NIL != inference_datastructures_strategy.strategy_wants_one_answerP(strategy))
            || ((NIL != inference_datastructures_strategy.strategy_unique_wrt_bindingsP(strategy))
               && ((NIL != inference_datastructures_problem.closed_problem_p(problem))
                || ((problem == inference_datastructures_strategy.strategy_root_problem(strategy))
                   && (NIL != inference_datastructures_inference.inference_no_free_hl_varsP(inference_datastructures_strategy.strategy_inference(strategy)))))))));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 17283) 
  public static final SubLObject tactically_uninteresting_problem_p(SubLObject problem) {
    return makeBoolean(((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))
          || (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem))
          || ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem))
             && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))
             && (NIL != inference_datastructures_problem.closed_problem_p(problem)))));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 18497) 
  public static final SubLObject problem_has_relevant_supporting_problemP(SubLObject problem, SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
    checkType(strategic_context, $sym20$STRATEGIC_CONTEXT_P);
    if ((NIL != inference_datastructures_strategy.strategy_p(strategic_context))) {
      {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject argument_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, argument_link))) {
              if (((NIL != consider_transformation_tacticsP)
                  || (NIL == inference_worker_transformation.transformation_link_p(argument_link)))) {
                {
                  SubLObject link_var = argument_link;
                  SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                  SubLObject supporting_mapped_problem = NIL;
                  for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
                    if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
                      {
                        SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                        SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                        if ((NIL != inference_datastructures_problem.problem_relevant_to_strategyP(supporting_problem, strategic_context))) {
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
        return NIL;
      }
    } else {
      return inference_datastructures_problem.problem_has_argument_link_p(problem);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20041) 
  public static final SubLObject why_inference_chooses_to_set_aside_problem(SubLObject inference, SubLObject problem) {
    return inference_chooses_to_set_aside_problem_int(inference, problem, T);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20195) 
  public static final SubLObject inference_chooses_to_set_aside_problem_int(SubLObject inference, SubLObject problem, SubLObject justifyP) {
    if ((NIL == inference_worker.problem_strictly_within_max_proof_depthP(inference, problem))) {
      if ((NIL != justifyP)) {
        return $str21$problem_exceeds_max_proof_depth;
      } else {
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20597) 
  public static final SubLObject why_inference_chooses_to_throw_away_problem(SubLObject inference, SubLObject problem) {
    return inference_chooses_to_throw_away_problem_int(inference, problem, T);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 20753) 
  public static final SubLObject inference_chooses_to_throw_away_problem_int(SubLObject inference, SubLObject problem, SubLObject justifyP) {
    if (((NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference))
         && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35378"))
         && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35466")))) {
      if ((NIL != justifyP)) {
        return $str22$proof_checker_mode_is_enabled_and;
      } else {
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 21732) 
  public static final SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP_internal(SubLObject inference, SubLObject problem) {
    return inference_chooses_to_throw_away_all_transformations_on_problem_int(inference, problem, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 21732) 
  public static final SubLObject inference_chooses_to_throw_away_all_transformations_on_problemP(SubLObject inference, SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_chooses_to_throw_away_all_transformations_on_problemP_internal(inference, problem);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym23$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym23$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym23$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(inference, problem);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw24$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((inference == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (problem == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_chooses_to_throw_away_all_transformations_on_problemP_internal(inference, problem)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(inference, problem));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 22168) 
  public static final SubLObject inference_chooses_to_throw_away_all_transformations_on_problem_int(SubLObject inference, SubLObject problem, SubLObject justifyP) {
    {
      SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
      SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
      SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
      if ((NIL == allow_unbound_predicate_transformationP)) {
        if ((NIL == allow_hl_predicate_transformationP)) {
          if ((NIL != problem_uses_hl_predicateP(problem))) {
            if ((NIL == Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35468"))) {
              if ((NIL != justifyP)) {
                return $str25$problem_uses_an_HL_predicate__HL_;
              } else {
                return T;
              }
            }
          }
        }
        if ((NIL == allow_evaluatable_predicate_transformationP)) {
          if ((NIL != problem_uses_evaluatable_predicateP(problem))) {
            if ((NIL != justifyP)) {
              return $str26$problem_uses_an_evaluatable_predi;
            } else {
              return T;
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 23720) 
  public static final SubLObject problem_uses_hl_predicateP(SubLObject problem) {
    if ((NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
      {
        SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
        return hl_supports.hl_predicate_p(predicate);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 23929) 
  public static final SubLObject problem_uses_evaluatable_predicateP(SubLObject problem) {
    if ((NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
      {
        SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
        return makeBoolean(((NIL != forts.fort_p(predicate))
               && (NIL != inference_trampolines.inference_evaluatable_predicateP(predicate))));
      }
    }
    return NIL;
  }

  /** @return booleanp; Whether TACTIC is redundant for STRATEGY to execute, because
   the problem store topology indicates that such a rewrite has already been done. */
  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 24192) 
  public static final SubLObject simple_strategy_deems_rewrite_tactic_redundantP(SubLObject strategy, SubLObject tactic) {
    if ((NIL != inference_worker_rewrite.rewrite_tactic_p(tactic))) {
      {
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject new_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        if ((NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
          {
            SubLObject redundantP = NIL;
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (!(((NIL != redundantP)
                  || (NIL != set_contents.do_set_contents_doneP(basis_object, state))))); state = set_contents.do_set_contents_update_state(state)) {
              {
                SubLObject rewrite_link = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, rewrite_link))) {
                  if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(rewrite_link, $kw27$REWRITE))) {
                    {
                      SubLObject old_tactic = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32968");
                      SubLObject old_module = inference_datastructures_tactic.tactic_hl_module(old_tactic);
                      if ((old_module == new_module)) {
                        {
                          SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link);
                          if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference))) {
                            redundantP = T;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            return redundantP;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 25159) 
  public static final SubLObject tactic_exceeds_productivity_limitP(SubLObject tactic, SubLObject strategic_context) {
    if ((NIL == inference_datastructures_strategy.strategy_p(strategic_context))) {
      return NIL;
    }
    {
      SubLObject productivity_limit = inference_datastructures_strategy.strategy_productivity_limit(strategic_context);
      if ((NIL != inference_datastructures_enumerated_types.infinite_productivity_p(productivity_limit))) {
        return NIL;
      } else {
        {
          SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context);
          return inference_datastructures_enumerated_types.productivity_G(productivity, productivity_limit);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 25887) 
  public static final SubLObject why_simple_strategy_chooses_to_set_aside_transformation_tactic(SubLObject strategy, SubLObject transformation_tactic) {
    return simple_strategy_chooses_to_set_aside_transformation_tactic_int(strategy, transformation_tactic, T);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 26107) 
  public static final SubLObject simple_strategy_chooses_to_set_aside_transformation_tactic_int(SubLObject strategy, SubLObject transformation_tactic, SubLObject justifyP) {
    {
      SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
      if ((NIL != justifyP)) {
        return why_inference_chooses_to_set_aside_transformation_tactic(inference, transformation_tactic);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35475");
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 26706) 
  public static final SubLObject why_inference_chooses_to_set_aside_transformation_tactic(SubLObject inference, SubLObject transformation_tactic) {
    return inference_chooses_to_set_aside_transformation_tactic_int(inference, transformation_tactic, T);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 26916) 
  public static final SubLObject inference_chooses_to_set_aside_transformation_tactic_int(SubLObject inference, SubLObject transformation_tactic, SubLObject justifyP) {
    {
      SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
      if ((NIL == inference_worker.problem_transformation_allowed_wrt_max_transformation_depthP(inference, problem))) {
        if ((NIL != justifyP)) {
          return $str28$problem_exceeds_max_transformatio;
        } else {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 27317) 
  public static final SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(SubLObject strategy, SubLObject transformation_tactic) {
    return simple_strategy_chooses_to_throw_away_transformation_tactic_int(strategy, transformation_tactic, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 27317) 
  public static final SubLObject simple_strategy_chooses_to_throw_away_transformation_tacticP(SubLObject strategy, SubLObject transformation_tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(strategy, transformation_tactic);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym29$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym29$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym29$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(strategy, transformation_tactic);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw24$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((strategy == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (transformation_tactic == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(simple_strategy_chooses_to_throw_away_transformation_tacticP_internal(strategy, transformation_tactic)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(strategy, transformation_tactic));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 27793) 
  public static final SubLObject simple_strategy_chooses_to_throw_away_transformation_tactic_int(SubLObject strategy, SubLObject transformation_tactic, SubLObject justifyP) {
    {
      SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
      if ((NIL != justifyP)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35541");
      } else {
        return inference_chooses_to_throw_away_transformation_tacticP(inference, transformation_tactic);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28186) 
  public static final SubLObject inference_chooses_to_throw_away_transformation_tacticP(SubLObject inference, SubLObject transformation_tactic) {
    return inference_chooses_to_throw_away_transformation_tactic_int(inference, transformation_tactic, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 28609) 
  public static final SubLObject inference_chooses_to_throw_away_transformation_tactic_int(SubLObject inference, SubLObject transformation_tactic, SubLObject justifyP) {
    {
      SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
      if ((NIL != rule)) {
        if ((NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference))) {
          if ((NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule))) {
            if ((NIL != justifyP)) {
              return $str30$proof_checker_mode_is_enabled__an;
            } else {
              return T;
            }
          }
        }
        if ((NIL != inference_analysis.transformation_rule_has_insufficient_historical_utilityP(rule))) {
          if ((NIL != justifyP)) {
            return $str31$the_rule_for_this_tactic_has_an_i;
          } else {
            return T;
          }
        }
      }
    }
    if ((NIL != inference_worker_transformation.meta_transformation_tactic_p(transformation_tactic))) {
      {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
        if ((NIL != inference_chooses_to_throw_away_all_transformations_on_problemP(inference, problem))) {
          if ((NIL != justifyP)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35540");
          } else {
            return T;
          }
        }
      }
    }
    {
      SubLObject allow_hl_predicate_transformationP = inference_datastructures_inference.inference_allow_hl_predicate_transformationP(inference);
      if (((NIL == allow_hl_predicate_transformationP)
           && (NIL != tactic_requires_hl_predicate_transformationP(transformation_tactic)))) {
        if ((NIL != justifyP)) {
          return $str32$tactic_requires_HL_predicate_tran;
        } else {
          return T;
        }
      }
    }
    {
      SubLObject allow_unbound_predicate_transformationP = inference_datastructures_inference.inference_allow_unbound_predicate_transformationP(inference);
      if (((NIL == allow_unbound_predicate_transformationP)
           && (NIL != tactic_requires_unbound_predicate_transformationP(transformation_tactic)))) {
        if ((NIL != justifyP)) {
          return $str33$tactic_requires_unbound_predicate;
        } else {
          return T;
        }
      }
    }
    {
      SubLObject allow_evaluatable_predicate_transformationP = inference_datastructures_inference.inference_allow_evaluatable_predicate_transformationP(inference);
      if (((NIL == allow_evaluatable_predicate_transformationP)
           && (NIL != tactic_requires_evaluatable_predicate_transformationP(transformation_tactic)))) {
        if ((NIL != justifyP)) {
          return $str34$tactic_requires_evaluatable_predi;
        } else {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 31961) 
  public static final SubLObject tactic_requires_hl_predicate_transformationP(SubLObject tactic) {
    {
      SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
      SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
      return hl_module_requires_hl_predicate_transformationP(hl_module, problem);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 32198) 
  public static final SubLObject hl_module_requires_hl_predicate_transformationP(SubLObject hl_module, SubLObject problem) {
    if ((NIL != inference_modules.transformation_module_p(hl_module))) {
      if ((NIL != hl_module_only_applies_to_hl_predicatesP(hl_module))) {
        return makeBoolean((!(((NIL != inference_datastructures_problem.single_literal_problem_p(problem))
                 && (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35469"))))));
      } else if ((NIL != problem_uses_hl_predicateP(problem))) {
        return makeBoolean((NIL == inference_modules.meta_transformation_module_p(hl_module)));
      } else {
        return NIL;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 33982) 
  public static final SubLObject hl_module_only_applies_to_hl_predicatesP(SubLObject hl_module) {
    {
      SubLObject predicate = inference_modules.hl_module_predicate(hl_module);
      return hl_supports.hl_predicate_p(predicate);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34145) 
  public static final SubLObject tactic_requires_unbound_predicate_transformationP(SubLObject tactic) {
    if ((NIL != inference_worker_transformation.transformation_tactic_p(tactic))) {
      {
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        return hl_module_requires_unbound_predicate_transformationP(hl_module);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34393) 
  public static final SubLObject hl_module_requires_unbound_predicate_transformationP(SubLObject hl_module) {
    return transformation_modules.trans_unbound_predicate_module_p(hl_module);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34529) 
  public static final SubLObject tactic_requires_evaluatable_predicate_transformationP(SubLObject tactic) {
    if ((NIL != inference_worker_transformation.transformation_tactic_p(tactic))) {
      {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        return problem_uses_evaluatable_predicateP(problem);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 34758) 
  public static final SubLObject tactic_completeP(SubLObject tactic, SubLObject strategic_context) {
    return Equality.eq($kw38$COMPLETE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35050) 
  public static final SubLObject tactic_impossibleP(SubLObject tactic, SubLObject strategic_context) {
    return Equality.eq($kw40$IMPOSSIBLE, inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35198) 
  public static final SubLObject tactic_preferredP(SubLObject tactic, SubLObject strategic_context) {
    return Equality.eq($kw41$PREFERRED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35504) 
  public static final SubLObject tactic_disallowedP(SubLObject tactic, SubLObject strategic_context) {
    return Equality.eq($kw43$DISALLOWED, inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 35656) 
  public static final SubLObject problem_has_executed_a_complete_tacticP(SubLObject problem, SubLObject strategic_context, SubLObject type) {
    if ((type == UNPROVIDED)) {
      type = $kw44$CONTENT;
    }
    if ((NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem)))) {
      return NIL;
    }
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type))
             && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $kw45$EXECUTED)))) {
          if ((NIL != tactic_completeP(tactic, strategic_context))) {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 37598) 
  public static final SubLObject strategy_admits_tactic_wrt_proof_specP(SubLObject strategy, SubLObject tactic) {
    if ((NIL != strategy_admits_all_tactics_wrt_proof_specP(strategy))) {
      return T;
    }
    {
      SubLObject proof_spec = Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36473");
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35496");
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 37922) 
  public static final SubLObject strategy_admits_all_tactics_wrt_proof_specP(SubLObject strategy) {
    return Equality.eq($kw49$ANYTHING, inference_datastructures_strategy.strategy_proof_spec(strategy));
  }

  /** Dynamic variable for remembering the most recent explanation of strategic uninterestingness */
  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 48463) 
  private static SubLSymbol $strategy_uninterestingness_explanation$ = null;

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 48706) 
  private static SubLSymbol $the_unknown_strategy_uninterestingness_explanation$ = null;

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 48816) 
  public static final SubLObject strategy_last_uninterestingness_explanation() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ((NIL != $strategy_uninterestingness_explanation$.getDynamicValue(thread)) ? ((SubLObject) $strategy_uninterestingness_explanation$.getDynamicValue(thread)) : $the_unknown_strategy_uninterestingness_explanation$.getGlobalValue());
    }
  }

  /** Whether we are gathering explanations of strategic uninterestingness */
  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 49161) 
  public static SubLSymbol $strategy_gathering_uninterestingness_explanationsP$ = null;

  @SubL(source = "cycl/inference/harness/inference-tactician-strategic-uninterestingness.lisp", position = 50240) 
  private static SubLSymbol $strategy_uninterestingness_explanation_table$ = null;

  public static final SubLObject declare_inference_tactician_strategic_uninterestingness_file() {
    declareFunction(myName, "strategic_uninterestingness_reason_p", "STRATEGIC-UNINTERESTINGNESS-REASON-P", 1, 0, false);
    declareFunction(myName, "strategy_chooses_to_throw_away_problemP", "STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 1, false);
    declareFunction(myName, "why_strategy_chooses_to_throw_away_problem", "WHY-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
    declareFunction(myName, "strategy_chooses_to_throw_away_tacticP", "STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false);
    declareFunction(myName, "legacy_strategy_chooses_to_throw_away_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 1, false);
    declareFunction(myName, "why_strategy_chooses_to_throw_away_tactic", "WHY-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC", 2, 0, false);
    declareFunction(myName, "strategy_chooses_to_set_aside_problemP", "STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
    declareFunction(myName, "why_strategy_chooses_to_set_aside_problem", "WHY-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
    declareFunction(myName, "strategy_chooses_to_set_aside_tacticP", "STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false);
    declareFunction(myName, "legacy_strategy_chooses_to_set_aside_tacticP", "LEGACY-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 1, false);
    declareFunction(myName, "why_strategy_chooses_to_set_aside_tactic", "WHY-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC", 2, 0, false);
    declareFunction(myName, "strategy_chooses_to_ignore_tacticP", "STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 1, false);
    declareFunction(myName, "simple_strategy_chooses_to_throw_away_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
    declareFunction(myName, "why_simple_strategy_chooses_to_throw_away_problem", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_throw_away_problem_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-INT", 3, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_throw_away_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 0, false);
    declareFunction(myName, "why_simple_strategy_chooses_to_throw_away_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC", 2, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_throw_away_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-INT", 3, 0, false);
    declareFunction(myName, "problem_has_executed_a_complete_removal_tacticP", "PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "lookahead_problem_has_executed_a_complete_removal_tacticP", "LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "problem_or_lookahead_problem_has_executed_a_complete_removal_tacticP", "PROBLEM-OR-LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "problem_has_executed_a_generalized_removal_tacticP", "PROBLEM-HAS-EXECUTED-A-GENERALIZED-REMOVAL-TACTIC?", 1, 0, false);
    declareFunction(myName, "strategy_allows_use_of_tactic_hl_moduleP", "STRATEGY-ALLOWS-USE-OF-TACTIC-HL-MODULE?", 2, 0, false);
    declareFunction(myName, "strategy_allows_use_of_hl_moduleP", "STRATEGY-ALLOWS-USE-OF-HL-MODULE?", 2, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_set_aside_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
    declareFunction(myName, "why_simple_strategy_chooses_to_set_aside_problem", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_set_aside_problem_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-INT", 3, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_set_aside_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 0, false);
    declareFunction(myName, "why_simple_strategy_chooses_to_set_aside_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC", 2, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_set_aside_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-INT", 3, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_ignore_problemP", "SIMPLE-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 2, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_ignore_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 0, false);
    declareFunction(myName, "problem_strategically_pendingP", "PROBLEM-STRATEGICALLY-PENDING?", 2, 0, false);
    declareFunction(myName, "strategy_deems_problem_tactically_uninterestingP", "STRATEGY-DEEMS-PROBLEM-TACTICALLY-UNINTERESTING?", 2, 0, false);
    declareFunction(myName, "strategy_has_enough_proofs_for_problemP", "STRATEGY-HAS-ENOUGH-PROOFS-FOR-PROBLEM?", 2, 0, false);
    declareFunction(myName, "tactically_uninteresting_problem_p", "TACTICALLY-UNINTERESTING-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "strategy_deems_problem_strategically_uninterestingP", "STRATEGY-DEEMS-PROBLEM-STRATEGICALLY-UNINTERESTING?", 2, 0, false);
    declareFunction(myName, "strategically_uninteresting_problem_p", "STRATEGICALLY-UNINTERESTING-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "problem_has_relevant_supporting_problemP", "PROBLEM-HAS-RELEVANT-SUPPORTING-PROBLEM?", 3, 0, false);
    declareFunction(myName, "problem_has_interesting_transformation_tacticsP", "PROBLEM-HAS-INTERESTING-TRANSFORMATION-TACTICS?", 2, 0, false);
    declareFunction(myName, "problem_no_tactics_strategically_possibleP", "PROBLEM-NO-TACTICS-STRATEGICALLY-POSSIBLE?", 2, 0, false);
    declareFunction(myName, "inference_chooses_to_set_aside_problemP", "INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 0, false);
    declareFunction(myName, "why_inference_chooses_to_set_aside_problem", "WHY-INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM", 2, 0, false);
    declareFunction(myName, "inference_chooses_to_set_aside_problem_int", "INFERENCE-CHOOSES-TO-SET-ASIDE-PROBLEM-INT", 3, 0, false);
    declareFunction(myName, "inference_chooses_to_throw_away_problemP", "INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
    declareFunction(myName, "why_inference_chooses_to_throw_away_problem", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM", 2, 0, false);
    declareFunction(myName, "inference_chooses_to_throw_away_problem_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-PROBLEM-INT", 3, 0, false);
    declareFunction(myName, "all_dependent_links_are_forbidden_transformationsP", "ALL-DEPENDENT-LINKS-ARE-FORBIDDEN-TRANSFORMATIONS?", 2, 0, false);
    declareFunction(myName, "transformation_forbidden_by_inferenceP", "TRANSFORMATION-FORBIDDEN-BY-INFERENCE?", 2, 0, false);
    declareFunction(myName, "inference_chooses_to_throw_away_all_transformations_on_problemP_internal", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_chooses_to_throw_away_all_transformations_on_problemP", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?", 2, 0, false);
    declareFunction(myName, "why_inference_chooses_to_throw_away_all_transformations_on_problem", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM", 2, 0, false);
    declareFunction(myName, "inference_chooses_to_throw_away_all_transformations_on_problem_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM-INT", 3, 0, false);
    declareFunction(myName, "collection_backchain_encouraged_problemP", "COLLECTION-BACKCHAIN-ENCOURAGED-PROBLEM?", 1, 0, false);
    declareFunction(myName, "problem_uses_hl_predicateP", "PROBLEM-USES-HL-PREDICATE?", 1, 0, false);
    declareFunction(myName, "problem_uses_evaluatable_predicateP", "PROBLEM-USES-EVALUATABLE-PREDICATE?", 1, 0, false);
    declareFunction(myName, "simple_strategy_deems_rewrite_tactic_redundantP", "SIMPLE-STRATEGY-DEEMS-REWRITE-TACTIC-REDUNDANT?", 2, 0, false);
    declareFunction(myName, "tactic_exceeds_productivity_limitP", "TACTIC-EXCEEDS-PRODUCTIVITY-LIMIT?", 2, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_set_aside_transformation_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC?", 2, 0, false);
    declareFunction(myName, "why_simple_strategy_chooses_to_set_aside_transformation_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC", 2, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_set_aside_transformation_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC-INT", 3, 0, false);
    declareFunction(myName, "inference_chooses_to_set_aside_transformation_tacticP", "INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC?", 2, 0, false);
    declareFunction(myName, "why_inference_chooses_to_set_aside_transformation_tactic", "WHY-INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC", 2, 0, false);
    declareFunction(myName, "inference_chooses_to_set_aside_transformation_tactic_int", "INFERENCE-CHOOSES-TO-SET-ASIDE-TRANSFORMATION-TACTIC-INT", 3, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_throw_away_transformation_tacticP_internal", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?-INTERNAL", 2, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_throw_away_transformation_tacticP", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?", 2, 0, false);
    declareFunction(myName, "why_simple_strategy_chooses_to_throw_away_transformation_tactic", "WHY-SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC", 2, 0, false);
    declareFunction(myName, "simple_strategy_chooses_to_throw_away_transformation_tactic_int", "SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC-INT", 3, 0, false);
    declareFunction(myName, "inference_chooses_to_throw_away_transformation_tacticP", "INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?", 2, 0, false);
    declareFunction(myName, "why_inference_chooses_to_throw_away_transformation_tactic", "WHY-INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC", 2, 0, false);
    declareFunction(myName, "inference_chooses_to_throw_away_transformation_tactic_int", "INFERENCE-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC-INT", 3, 0, false);
    declareFunction(myName, "strategy_disallows_use_of_hl_module_on_problemP", "STRATEGY-DISALLOWS-USE-OF-HL-MODULE-ON-PROBLEM?", 3, 0, false);
    declareFunction(myName, "tactic_requires_hl_predicate_transformationP", "TACTIC-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "hl_module_requires_hl_predicate_transformationP", "HL-MODULE-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 2, 0, false);
    declareFunction(myName, "collection_backchain_encouraged_tacticP", "COLLECTION-BACKCHAIN-ENCOURAGED-TACTIC?", 1, 0, false);
    declareFunction(myName, "collection_backchain_encouraged_asentP", "COLLECTION-BACKCHAIN-ENCOURAGED-ASENT?", 2, 0, false);
    declareFunction(myName, "tactic_problem_uses_hl_predicateP", "TACTIC-PROBLEM-USES-HL-PREDICATE?", 1, 0, false);
    declareFunction(myName, "transformation_tactic_only_applies_to_hl_predicatesP", "TRANSFORMATION-TACTIC-ONLY-APPLIES-TO-HL-PREDICATES?", 1, 0, false);
    declareFunction(myName, "hl_module_only_applies_to_hl_predicatesP", "HL-MODULE-ONLY-APPLIES-TO-HL-PREDICATES?", 1, 0, false);
    declareFunction(myName, "tactic_requires_unbound_predicate_transformationP", "TACTIC-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "hl_module_requires_unbound_predicate_transformationP", "HL-MODULE-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "tactic_requires_evaluatable_predicate_transformationP", "TACTIC-REQUIRES-EVALUATABLE-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "tactic_completeP", "TACTIC-COMPLETE?", 2, 0, false);
    declareFunction(myName, "tactic_incompleteP", "TACTIC-INCOMPLETE?", 2, 0, false);
    declareFunction(myName, "tactic_impossibleP", "TACTIC-IMPOSSIBLE?", 2, 0, false);
    declareFunction(myName, "tactic_preferredP", "TACTIC-PREFERRED?", 2, 0, false);
    declareFunction(myName, "tactic_dispreferredP", "TACTIC-DISPREFERRED?", 2, 0, false);
    declareFunction(myName, "tactic_disallowedP", "TACTIC-DISALLOWED?", 2, 0, false);
    declareFunction(myName, "problem_has_executed_a_complete_tacticP", "PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
    declareFunction(myName, "lookahead_problem_has_executed_a_complete_tacticP", "LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
    declareFunction(myName, "problem_or_lookahead_problem_has_executed_a_complete_tacticP", "PROBLEM-OR-LOOKAHEAD-PROBLEM-HAS-EXECUTED-A-COMPLETE-TACTIC?", 2, 1, false);
    declareFunction(myName, "problem_has_executed_a_preferred_tacticP", "PROBLEM-HAS-EXECUTED-A-PREFERRED-TACTIC?", 2, 1, false);
    declareFunction(myName, "problem_has_executed_a_tactic_of_typeP", "PROBLEM-HAS-EXECUTED-A-TACTIC-OF-TYPE?", 2, 0, false);
    declareFunction(myName, "strategy_admits_tactic_wrt_proof_specP", "STRATEGY-ADMITS-TACTIC-WRT-PROOF-SPEC?", 2, 0, false);
    declareFunction(myName, "strategy_admits_all_tactics_wrt_proof_specP", "STRATEGY-ADMITS-ALL-TACTICS-WRT-PROOF-SPEC?", 1, 0, false);
    declareFunction(myName, "proof_spec_admits_tacticP", "PROOF-SPEC-ADMITS-TACTIC?", 2, 0, false);
    declareFunction(myName, "meta_tactic_p", "META-TACTIC-P", 1, 0, false);
    declareFunction(myName, "disjunctive_proof_spec_admits_tacticP", "DISJUNCTIVE-PROOF-SPEC-ADMITS-TACTIC?", 2, 0, false);
    declareFunction(myName, "proof_spec_admits_removal_tacticP", "PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "proof_spec_admits_join_ordered_tacticP", "PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
    declareFunction(myName, "proof_spec_admits_join_tacticP", "PROOF-SPEC-ADMITS-JOIN-TACTIC?", 2, 0, false);
    declareFunction(myName, "proof_spec_admits_split_tacticP", "PROOF-SPEC-ADMITS-SPLIT-TACTIC?", 2, 0, false);
    declareFunction(myName, "proof_spec_admits_simplification_tacticP", "PROOF-SPEC-ADMITS-SIMPLIFICATION-TACTIC?", 2, 0, false);
    declareFunction(myName, "proof_spec_admits_conjuctive_removal_tacticP", "PROOF-SPEC-ADMITS-CONJUCTIVE-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "proof_spec_admits_transformation_tacticP", "PROOF-SPEC-ADMITS-TRANSFORMATION-TACTIC?", 2, 0, false);
    declareFunction(myName, "proof_spec_admits_union_tacticP", "PROOF-SPEC-ADMITS-UNION-TACTIC?", 2, 0, false);
    declareFunction(myName, "removal_proof_spec_admits_removal_tacticP", "REMOVAL-PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "restriction_proof_spec_admits_removal_tacticP", "RESTRICTION-PROOF-SPEC-ADMITS-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "split_proof_spec_admits_split_proof_tacticP", "SPLIT-PROOF-SPEC-ADMITS-SPLIT-PROOF-TACTIC?", 2, 0, false);
    declareFunction(myName, "restriction_proof_spec_admits_simplification_tacticP", "RESTRICTION-PROOF-SPEC-ADMITS-SIMPLIFICATION-TACTIC?", 2, 0, false);
    declareFunction(myName, "conjunctive_removal_proof_spec_admits_conjunctive_removal_tacticP", "CONJUNCTIVE-REMOVAL-PROOF-SPEC-ADMITS-CONJUNCTIVE-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "join_ordered_proof_spec_admits_join_ordered_tacticP", "JOIN-ORDERED-PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
    declareFunction(myName, "union_proof_spec_admits_union_tacticP", "UNION-PROOF-SPEC-ADMITS-UNION-TACTIC?", 2, 0, false);
    declareFunction(myName, "residual_transformation_proof_spec_admits_join_ordered_tacticP", "RESIDUAL-TRANSFORMATION-PROOF-SPEC-ADMITS-JOIN-ORDERED-TACTIC?", 2, 0, false);
    declareFunction(myName, "join_proof_spec_admits_join_tacticP", "JOIN-PROOF-SPEC-ADMITS-JOIN-TACTIC?", 2, 0, false);
    declareFunction(myName, "transformation_proof_spec_admits_transformation_tacticP", "TRANSFORMATION-PROOF-SPEC-ADMITS-TRANSFORMATION-TACTIC?", 2, 0, false);
    declareFunction(myName, "ist_sentences_from_clause", "IST-SENTENCES-FROM-CLAUSE", 1, 0, false);
    declareFunction(myName, "single_literal_pattern_p", "SINGLE-LITERAL-PATTERN-P", 1, 0, false);
    declareFunction(myName, "literal_spec_admits_single_literal_problemP", "LITERAL-SPEC-ADMITS-SINGLE-LITERAL-PROBLEM?", 2, 0, false);
    declareFunction(myName, "mt_asent_sense_from_ist_literal", "MT-ASENT-SENSE-FROM-IST-LITERAL", 1, 0, false);
    declareFunction(myName, "removal_module_spec_admits_removal_module", "REMOVAL-MODULE-SPEC-ADMITS-REMOVAL-MODULE", 2, 0, false);
    declareFunction(myName, "transformation_module_spec_admits_transformation_module", "TRANSFORMATION-MODULE-SPEC-ADMITS-TRANSFORMATION-MODULE", 2, 0, false);
    declareFunction(myName, "proof_spec_mt_spec_admits_mtP", "PROOF-SPEC-MT-SPEC-ADMITS-MT?", 2, 0, false);
    declareFunction(myName, "proof_spec_asent_spec_admits_asentP", "PROOF-SPEC-ASENT-SPEC-ADMITS-ASENT?", 2, 0, false);
    declareFunction(myName, "hl_module_spec_admits_hl_module", "HL-MODULE-SPEC-ADMITS-HL-MODULE", 2, 0, false);
    declareFunction(myName, "rule_spec_admits_rule", "RULE-SPEC-ADMITS-RULE", 2, 0, false);
    declareFunction(myName, "strategy_last_uninterestingness_explanation", "STRATEGY-LAST-UNINTERESTINGNESS-EXPLANATION", 0, 0, false);
    declareMacro(myName, "with_strategy_uninterestingness_explanations", "WITH-STRATEGY-UNINTERESTINGNESS-EXPLANATIONS");
    declareFunction(myName, "strategy_note_uninterestingness_explanation", "STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION", 5, 0, false);
    declareMacro(myName, "strategy_possibly_note_uninterestingness_explanation", "STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");
    declareFunction(myName, "strategy_uninterestingness_explanation_string", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-STRING", 1, 0, false);
    declareFunction(myName, "strategy_uninterestingness_explanation_type_p", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P", 1, 0, false);
    declareFunction(myName, "strategy_uninterestingness_explanation_p", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-P", 1, 0, false);
    declareFunction(myName, "strategy_uninterestingness_subexplanation_p", "STRATEGY-UNINTERESTINGNESS-SUBEXPLANATION-P", 1, 0, false);
    declareFunction(myName, "make_strategy_uninterestingness_explanation", "MAKE-STRATEGY-UNINTERESTINGNESS-EXPLANATION", 1, 4, false);
    declareFunction(myName, "strategy_uninterestingness_explanation_type", "STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_tactician_strategic_uninterestingness_file() {
    $strategy_uninterestingness_explanation$ = defparameter("*STRATEGY-UNINTERESTINGNESS-EXPLANATION*", NIL);
    $the_unknown_strategy_uninterestingness_explanation$ = deflexical("*THE-UNKNOWN-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $list62);
    $strategy_gathering_uninterestingness_explanationsP$ = defparameter("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*", NIL);
    $strategy_uninterestingness_explanation_table$ = deflexical("*STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*", $list77);
    return NIL;
  }

  public static final SubLObject setup_inference_tactician_strategic_uninterestingness_file() {
    // CVS_ID("Id: inference-tactician-strategic-uninterestingness.lisp 128760 2009-09-15 04:40:33Z pace ");
    memoization_state.note_memoized_function($sym23$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_);
    memoization_state.note_memoized_function($sym29$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_);
    access_macros.register_macro_helper($sym65$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, $sym66$STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(NIL, makeKeyword("SET-ASIDE"), makeKeyword("THROW-AWAY"), makeKeyword("IRRELEVANT"));
  public static final SubLSymbol $kw1$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw2$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLString $str3$thrown_away_wrt_both_removal_and_ = makeString("thrown away wrt both removal and transformation");
  public static final SubLString $str4$thrown_away_wrt_removal = makeString("thrown away wrt removal");
  public static final SubLString $str5$thrown_away_wrt_transformation = makeString("thrown away wrt transformation");
  public static final SubLSymbol $kw6$THROW_AWAY_TACTIC = makeKeyword("THROW-AWAY-TACTIC");
  public static final SubLString $str7$ = makeString("");
  public static final SubLString $str8$set_aside_wrt_both_removal_and_tr = makeString("set aside wrt both removal and transformation");
  public static final SubLString $str9$set_aside_wrt_removal = makeString("set aside wrt removal");
  public static final SubLString $str10$set_aside_wrt_transformation = makeString("set aside wrt transformation");
  public static final SubLSymbol $kw11$SET_ASIDE_TACTIC = makeKeyword("SET-ASIDE-TACTIC");
  public static final SubLString $str12$problem_is_tactically_uninteresti = makeString("problem is tactically uninteresting");
  public static final SubLString $str13$inference_is_not_continuable__and = makeString("inference is not continuable, and ");
  public static final SubLString $str14$non_good_problem_has_already_exec = makeString("non-good problem has already executed a complete removal tactic");
  public static final SubLString $str15$rewrite_tactic_is_redundant = makeString("rewrite tactic is redundant");
  public static final SubLString $str16$HL_module_is_forbidden = makeString("HL module is forbidden");
  public static final SubLSymbol $kw17$GENERALIZED_REMOVAL = makeKeyword("GENERALIZED-REMOVAL");
  public static final SubLString $str18$problem_is_strategically_no_good = makeString("problem is strategically no-good");
  public static final SubLString $str19$tactic_exceeds_productivity_limit = makeString("tactic exceeds productivity limit");
  public static final SubLSymbol $sym20$STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");
  public static final SubLString $str21$problem_exceeds_max_proof_depth = makeString("problem exceeds max proof depth");
  public static final SubLString $str22$proof_checker_mode_is_enabled_and = makeString("proof checker mode is enabled and no allowed rules were used to link to this problem");
  public static final SubLSymbol $sym23$INFERENCE_CHOOSES_TO_THROW_AWAY_ALL_TRANSFORMATIONS_ON_PROBLEM_ = makeSymbol("INFERENCE-CHOOSES-TO-THROW-AWAY-ALL-TRANSFORMATIONS-ON-PROBLEM?");
  public static final SubLSymbol $kw24$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLString $str25$problem_uses_an_HL_predicate__HL_ = makeString("problem uses an HL predicate, HL and unbound predicate transformation are forbidden, and #$collectionBackchainEncouraged does not apply");
  public static final SubLString $str26$problem_uses_an_evaluatable_predi = makeString("problem uses an evaluatable predicate and evaluatable predicate transformation is forbidden");
  public static final SubLSymbol $kw27$REWRITE = makeKeyword("REWRITE");
  public static final SubLString $str28$problem_exceeds_max_transformatio = makeString("problem exceeds max transformation depth");
  public static final SubLSymbol $sym29$SIMPLE_STRATEGY_CHOOSES_TO_THROW_AWAY_TRANSFORMATION_TACTIC_ = makeSymbol("SIMPLE-STRATEGY-CHOOSES-TO-THROW-AWAY-TRANSFORMATION-TACTIC?");
  public static final SubLString $str30$proof_checker_mode_is_enabled__an = makeString("proof checker mode is enabled, and the rule for this tactic is forbidden");
  public static final SubLString $str31$the_rule_for_this_tactic_has_an_i = makeString("the rule for this tactic has an insuffiently high historical utility");
  public static final SubLString $str32$tactic_requires_HL_predicate_tran = makeString("tactic requires HL predicate transformation, which is forbidden");
  public static final SubLString $str33$tactic_requires_unbound_predicate = makeString("tactic requires unbound predicate transformation, which is forbidden");
  public static final SubLString $str34$tactic_requires_evaluatable_predi = makeString("tactic requires evaluatable predicate transformation, which is forbidden");
  public static final SubLList $list35 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")));
  public static final SubLObject $const36$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const37$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $kw38$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $kw39$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $kw40$IMPOSSIBLE = makeKeyword("IMPOSSIBLE");
  public static final SubLSymbol $kw41$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLSymbol $kw42$DISPREFERRED = makeKeyword("DISPREFERRED");
  public static final SubLSymbol $kw43$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLSymbol $kw44$CONTENT = makeKeyword("CONTENT");
  public static final SubLSymbol $kw45$EXECUTED = makeKeyword("EXECUTED");
  public static final SubLSymbol $kw46$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw47$JOIN = makeKeyword("JOIN");
  public static final SubLSymbol $kw48$LOGICAL = makeKeyword("LOGICAL");
  public static final SubLSymbol $kw49$ANYTHING = makeKeyword("ANYTHING");
  public static final SubLSymbol $kw50$NOTHING = makeKeyword("NOTHING");
  public static final SubLString $str51$Time_to_support_proof_spec_admitt = makeString("Time to support proof-spec admittance on ~S tactics");
  public static final SubLList $list52 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("SUB-SPECS"));
  public static final SubLList $list53 = list(makeSymbol("REMOVAL-TOKEN"), makeSymbol("LITERAL-SPEC"), makeSymbol("REMOVAL-MODULE-SPEC"));
  public static final SubLList $list54 = list(makeSymbol("RESTRICTION-TOKEN"), makeSymbol("SUB-SPEC"));
  public static final SubLList $list55 = list(makeSymbol("TRANSFORMATION-TOKEN"), makeSymbol("LITERAL-SPEC"), makeSymbol("TRANSFORMATION-MODULE-SPEC"), makeSymbol("RULE-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("SUB-SPEC"));
  public static final SubLList $list56 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
  public static final SubLList $list57 = list(makeSymbol("MT"), makeSymbol("SENTENCE"));
  public static final SubLObject $const58$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLObject $const59$not = constant_handles.reader_make_constant_shell(makeString("not"));
  public static final SubLSymbol $kw60$POS = makeKeyword("POS");
  public static final SubLSymbol $kw61$NEG = makeKeyword("NEG");
  public static final SubLList $list62 = list(makeKeyword("UNKNOWN-REASON"), NIL, NIL, NIL, NIL);
  public static final SubLSymbol $sym63$CLET = makeSymbol("CLET");
  public static final SubLList $list64 = list(list(makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*"), T));
  public static final SubLSymbol $sym65$STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol("STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION");
  public static final SubLSymbol $sym66$STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol("STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");
  public static final SubLSymbol $sym67$STRATEGY_UNINTERESTINGNESS_EXPLANATION_P = makeSymbol("STRATEGY-UNINTERESTINGNESS-EXPLANATION-P");
  public static final SubLList $list68 = list(makeSymbol("EXPLANATION-TYPE"), list(makeSymbol("&KEY"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION")));
  public static final SubLList $list69 = list(makeKeyword("PROBLEM"), makeKeyword("TACTIC"), makeKeyword("LINK"), makeKeyword("SUBEXPLANATION"));
  public static final SubLSymbol $kw70$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw71$PROBLEM = makeKeyword("PROBLEM");
  public static final SubLSymbol $kw72$TACTIC = makeKeyword("TACTIC");
  public static final SubLSymbol $kw73$LINK = makeKeyword("LINK");
  public static final SubLSymbol $kw74$SUBEXPLANATION = makeKeyword("SUBEXPLANATION");
  public static final SubLSymbol $sym75$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym76$_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__ = makeSymbol("*STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*");
  public static final SubLList $list77 = list(new SubLObject[] {list(makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION"), makeString(":strategy does not permit transformation at all")), list(makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION"), makeString(":strategy does not permit transformation with the current resource constraints")), list(makeKeyword("PROBLEM-ALREADY-THROWN-AWAY"), makeString(":problem was already noted to be pending")), list(makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS"), makeString(":problem has no transformation tactics")), list(makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE"), makeString(":strategy is not continuable, and :problem was set aside because :subexplanation")), list(makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-REMOVAL-STRATEGEMS"), makeString(":problem has deactivated all its active removal strategems")), list(makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-TRANSFORMATION-STRATEGEMS"), makeString(":problem has deactivated all its active transformation strategems")), list(makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS"), makeString("when determining removal strategems for :problem, :strategy found none it wished to activate")), list(makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS"), makeString("when determining transformation strategems for :problem, :strategy found none it wished to activate")), list(makeKeyword("PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK"), makeString("rules associated with tranformation links for :problem were #$NonAbducibleRule so :strategy discarded the abduction strategm")), list(makeKeyword("DONT-DO-ABDUCTION-ON-GOOD-PROBLEM"), makeString("problem :problem already deemed good so :strategy discarded the abduction strategm")), list(makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM"), makeString("problem :problem has an abduced term so :strategy discarded problem wrt transformation")), list(makeKeyword("ALL-TACTICS-THROWN-AWAY"), makeString("all of :problem's tactics are thrown away")), list(makeKeyword("NEW-ROOT-PENDING-WRT-MOTIVATION"), makeString(":problem has already propagated both R and T")), list(makeKeyword("PROBLEM-ALREADY-SET-ASIDE"), makeString(":problem was already noted to be set aside")), list(makeKeyword("ALL-TACTICS-SET-ASIDE"), makeString("all of :problem's tactics are set aside")), list(makeKeyword("TACTIC-ALREADY-THROWN-AWAY"), makeString(":tactic was already noted to be finished")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY"), makeString(":tactic is thrown away because :subexplanation")), list(makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY"), makeString(":tactic uses module :tactic-hl-module, which is always thrown away")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY"), makeString("executing :tactic would motivate a problem that is thrown away because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), list(makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE"), makeString(":strategy is not continuable, and :tactic was set aside because :subexplanation")), list(makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY"), makeString(":tactic is a meta-removal tactic, and some other tactically possible tactics on the problem are strategically disallowed")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL"), makeString(":tactic has a sibling conjunctive removal tactic that is complete")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED"), makeString(":tactic has a sibling join-ordered tactic that focuses on a backchain required problem")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION"), makeString(":tactic has a sibling tactic that is a simplification")), list(makeKeyword("TACTIC-ALREADY-SET-ASIDE"), makeString(":tactic was already noted to be set aside")), list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE"), makeString(":tactic is set aside because :subexplanation")), list(makeKeyword("TACTIC-GENERATED-ENOUGH"), makeString(":tactic has already generated enough transformation tactics")), list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE"), makeString("executing :tactic would motivate a problem that is set aside because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE"), makeString(":tactic has a sibling split tactic that is set aside wrt both removal and transformation, because :subexplanation")), list(makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":tactic leads past the :max-transformation-depth")), list(makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS"), makeString(":tactic leads to a conjunctive focal problem where all conjunctive removals are set aside")), list(makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY"), makeString(":link's supported problem is thrown away because :subexplanation")), list(makeKeyword("SIBLING-EARLY-REMOVAL-LINK"), makeString(":link has a sibling link :subexplanation")), list(makeKeyword("EARLY-REMOVAL-LINK"), makeString(":link, which is an early removal link")), list(makeKeyword("LINK-RULE-DISALLOWED"), makeString(":link uses a disallowed rule")), list(makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE"), makeString(":link's supported problem is set aside because :subexplanation")), list(makeKeyword("LINK-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":link leads past the :max-transformation-depth")), list(makeKeyword("UNKNOWN-REASON"), makeString("for an unknown reason"))});
  public static final SubLList $list78 = list(makeSymbol("TYPE"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION"));
  public static final SubLSymbol $sym79$STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P = makeSymbol("STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P");
  public static final SubLSymbol $sym80$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $sym81$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLSymbol $sym82$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");

  //// Initializers

  public void declareFunctions() {
    declare_inference_tactician_strategic_uninterestingness_file();
  }

  public void initializeVariables() {
    init_inference_tactician_strategic_uninterestingness_file();
  }

  public void runTopLevelForms() {
    setup_inference_tactician_strategic_uninterestingness_file();
  }

}
