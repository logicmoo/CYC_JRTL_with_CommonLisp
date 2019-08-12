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
 import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_motivation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_balanced_tactician_execution extends SubLTranslatedFile {

  //// Constructor

  private inference_balanced_tactician_execution() {}
  public static final SubLFile me = new inference_balanced_tactician_execution();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_execution";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 937) 
  public static final SubLObject balanced_strategy_doneP(SubLObject strategy) {
    return makeBoolean(((NIL != inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_removalP(strategy))
           && (NIL != inference_balanced_tactician_datastructures.balanced_strategy_no_new_rootsP(strategy))
           && (NIL != inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_transformationP(strategy))
           && (NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy))));
  }

  public static final class $balanced_strategy_doneP$UnaryFunction extends UnaryFunction {
    public $balanced_strategy_doneP$UnaryFunction() { super(extractFunctionNamed("BALANCED-STRATEGY-DONE?")); }
    public SubLObject processItem(SubLObject arg1) { return balanced_strategy_doneP(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 1371) 
  public static final SubLObject balanced_strategy_do_one_step(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = $kw0$UNINTERESTING;
        while (($kw0$UNINTERESTING == result)) {
          result = balanced_strategy_do_one_step_int(strategy);
        }
        if ((NIL != control_vars.$inference_debugP$.getDynamicValue(thread))) {
          if (($kw1$DONE == result)) {
            if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_transformationP(strategy))) {
              Errors.cerror($str2$_s_says_it_s_done__but_its_T_box_, strategy);
            }
            if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_removalP(strategy))) {
              Errors.cerror($str3$_s_says_it_s_done__but_its_R_box_, strategy);
            }
          }
        }
        return Equality.eq($kw1$DONE, result);
      }
    }
  }

  public static final class $balanced_strategy_do_one_step$UnaryFunction extends UnaryFunction {
    public $balanced_strategy_do_one_step$UnaryFunction() { super(extractFunctionNamed("BALANCED-STRATEGY-DO-ONE-STEP")); }
    public SubLObject processItem(SubLObject arg1) { return balanced_strategy_do_one_step(arg1); }
  }

  /** @return one of (:done :interesting, :uninteresting) */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 1951) 
  public static final SubLObject balanced_strategy_do_one_step_int(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if ((NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(strategy))) {
          inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_reconsider_set_asides(strategy);
          result = $kw0$UNINTERESTING;
        } else if ((NIL != inference_tactician.strategy_doneP(strategy))) {
          result = $kw1$DONE;
        } else {
          thread.resetMultipleValues();
          {
            SubLObject strategem = balanced_strategy_select_best_strategem(strategy);
            SubLObject motivation = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != strategem)) {
              result = balanced_strategy_execute_strategem(strategy, strategem, motivation);
            } else {
              result = $kw1$DONE;
            }
          }
        }
        return result;
      }
    }
  }

  /** @return 0 strategem-p
   @return 1 nil or balanced-strategy-motivation-p
remove from boxes during selection if necessary. (quiescence)
@note don't assume you're only looking at possible tactics, because of reuse (use case #2). */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 2637) 
  public static final SubLObject balanced_strategy_select_best_strategem(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw4$SELECT_BEST_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 2997) 
  public static final SubLObject balanced_strategy_default_select_best_strategem(SubLObject strategy) {
    balanced_strategy_possibly_prune_current_new_root_wrt_removal(strategy);
    balanced_strategy_quiesce_wrt_removal(strategy);
    if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_removalP(strategy))) {
      return Values.values(inference_balanced_tactician_datastructures.balanced_strategy_pop_strategem_wrt_removal(strategy), $kw5$REMOVAL);
    }
    balanced_strategy_quiesce_new_root(strategy);
    if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_new_rootsP(strategy))) {
      {
        SubLObject new_root = inference_balanced_tactician_datastructures.balanced_strategy_pop_new_root(strategy);
        SubLObject motivation = balanced_strategy_new_root_next_motivation(strategy, new_root);
        return Values.values(new_root, motivation);
      }
    }
    balanced_strategy_quiesce_wrt_transformation(strategy);
    if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_transformationP(strategy))) {
      return Values.values(inference_balanced_tactician_datastructures.balanced_strategy_pop_strategem_wrt_transformation(strategy), $kw6$TRANSFORMATION);
    }
    if ((NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy))) {
      return Values.values(inference_datastructures_strategy.strategy_answer_link(strategy), $kw7$NEW_ROOT);
    }
    return Values.values(NIL, NIL);
  }

  public static final class $balanced_strategy_default_select_best_strategem$UnaryFunction extends UnaryFunction {
    public $balanced_strategy_default_select_best_strategem$UnaryFunction() { super(extractFunctionNamed("BALANCED-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM")); }
    public SubLObject processItem(SubLObject arg1) { return balanced_strategy_default_select_best_strategem(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 4166) 
  public static final SubLObject balanced_strategy_new_root_next_motivation(SubLObject strategy, SubLObject new_root) {
    if (((NIL != inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy)))
         && (NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, new_root)))) {
      return $kw5$REMOVAL;
    } else if ((NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy))) {
      return NIL;
    } else if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_transformationP(strategy, new_root))) {
      return $kw6$TRANSFORMATION;
    } else {
      return NIL;
    }
  }

  /** @return nil or strategem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 5096) 
  public static final SubLObject balanced_strategy_quiesce_wrt_removal(SubLObject strategy) {
    while (true) {
      {
        SubLObject candidate_strategem = inference_balanced_tactician_datastructures.balanced_strategy_peek_strategem_wrt_removal(strategy);
        if ((NIL == candidate_strategem)) {
          return NIL;
        }
        {
          SubLObject reason = inference_balanced_tactician_strategic_uninterestingness.why_balanced_strategy_chooses_to_ignore_strategem(strategy, candidate_strategem, $kw5$REMOVAL);
          if ((NIL == reason)) {
            return candidate_strategem;
          }
          {
            SubLObject pcase_var = reason;
            if (pcase_var.eql($kw9$SET_ASIDE)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36523");
            } else if (pcase_var.eql($kw10$THROW_AWAY)) {
              inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_thrown_away_wrt_removal(strategy, candidate_strategem);
            }
          }
          inference_balanced_tactician_datastructures.balanced_strategy_pop_strategem_wrt_removal(strategy);
          inference_balanced_tactician_motivation.balanced_strategy_strategically_deactivate_strategem(strategy, candidate_strategem, $kw5$REMOVAL);
          inference_worker.consider_pruning_ramifications_of_ignored_strategem(strategy, candidate_strategem);
        }
      }
    }
  }

  /** @return nil or strategem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 6235) 
  public static final SubLObject balanced_strategy_quiesce_new_root(SubLObject strategy) {
    while (true) {
      {
        SubLObject candidate_new_root = inference_balanced_tactician_datastructures.balanced_strategy_peek_new_root(strategy);
        if ((NIL == candidate_new_root)) {
          return NIL;
        }
        {
          SubLObject reason = inference_balanced_tactician_strategic_uninterestingness.why_balanced_strategy_chooses_to_ignore_new_root(strategy, candidate_new_root);
          if ((NIL == reason)) {
            return candidate_new_root;
          }
          inference_balanced_tactician_datastructures.balanced_strategy_pop_new_root(strategy);
        }
      }
    }
  }

  /** @return nil or strategem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 7004) 
  public static final SubLObject balanced_strategy_quiesce_wrt_transformation(SubLObject strategy) {
    while (true) {
      {
        SubLObject candidate_strategem = inference_balanced_tactician_datastructures.balanced_strategy_peek_strategem_wrt_transformation(strategy);
        if ((NIL == candidate_strategem)) {
          return NIL;
        }
        {
          SubLObject reason = inference_balanced_tactician_strategic_uninterestingness.why_balanced_strategy_chooses_to_ignore_strategem(strategy, candidate_strategem, $kw6$TRANSFORMATION);
          if ((NIL == reason)) {
            return candidate_strategem;
          }
          {
            SubLObject pcase_var = reason;
            if (pcase_var.eql($kw9$SET_ASIDE)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36525");
            } else if (pcase_var.eql($kw10$THROW_AWAY)) {
            }
          }
          inference_balanced_tactician_datastructures.balanced_strategy_pop_strategem_wrt_transformation(strategy);
          inference_balanced_tactician_motivation.balanced_strategy_strategically_deactivate_strategem(strategy, candidate_strategem, $kw6$TRANSFORMATION);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 8023) 
  private static SubLSymbol $balanced_strategy_does_not_activate_disallowed_tactics_wrt_removalP$ = null;

  /** @return one of (:interesting, :uninteresting) */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 8159) 
  public static final SubLObject balanced_strategy_execute_strategem(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
    if ((motivation == UNPROVIDED)) {
      motivation = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(strategy, $sym8$BALANCED_STRATEGY_P);
      checkType(strategem, $sym11$STRATEGEM_P);
      if ((NIL != motivation)) {
        checkType(motivation, $sym12$BALANCED_STRATEGY_MOTIVATION_P);
      }
      {
        SubLObject result = $kw0$UNINTERESTING;
        if ((NIL != inference_tactician.executable_strategem_p(strategem))) {
          {
            SubLObject tactic = strategem;
            SubLObject strategem_var = tactic;
            SubLObject problem = inference_tactician.strategem_problem(strategem_var);
            inference_balanced_tactician_motivation.balanced_strategy_deactivate_strategem(strategy, strategem_var, motivation);
            balanced_strategy_execute_tactic(strategy, tactic);
            inference_balanced_tactician_motivation.balanced_strategy_possibly_deactivate_problem(strategy, problem);
            result = $kw13$INTERESTING;
          }
        } else if ((NIL != inference_worker.logical_tactic_p(strategem))) {
          {
            SubLObject tactic = strategem;
            checkType(motivation, $sym12$BALANCED_STRATEGY_MOTIVATION_P);
            if ((!(((NIL != $balanced_strategy_does_not_activate_disallowed_tactics_wrt_removalP$.getDynamicValue(thread))
                   && (motivation == $kw5$REMOVAL)
                   && (NIL != inference_tactician_strategic_uninterestingness.tactic_disallowedP(strategem, strategy)))))) {
              inference_balanced_tactician_motivation.balanced_strategy_possibly_propagate_motivation_to_link_head(strategy, motivation, tactic);
              {
                SubLObject strategem_var = tactic;
                SubLObject problem = inference_tactician.strategem_problem(strategem_var);
                inference_balanced_tactician_motivation.balanced_strategy_deactivate_strategem(strategy, strategem_var, motivation);
                inference_tactician.strategy_possibly_execute_tactic(strategy, tactic);
                inference_balanced_tactician_motivation.balanced_strategy_possibly_deactivate_problem(strategy, problem);
              }
              result = $kw13$INTERESTING;
            }
          }
        } else if ((NIL != inference_worker_transformation.transformation_link_p(strategem))) {
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if (($kw6$TRANSFORMATION != motivation)) {
              Errors.error($str14$We_expect_to_only_propagate_T_to_, motivation);
            }
          }
          {
            SubLObject transformation_link = strategem;
            inference_balanced_tactician_motivation.balanced_strategy_possibly_propagate_motivation_to_link_head(strategy, motivation, transformation_link);
            inference_balanced_tactician_motivation.balanced_strategy_strategically_deactivate_strategem(strategy, transformation_link, motivation);
            result = $kw13$INTERESTING;
          }
        } else if ((NIL != inference_datastructures_problem.problem_p(strategem))) {
          {
            SubLObject problem = strategem;
            balanced_strategy_handle_new_root(strategy, problem, motivation);
            result = $kw13$INTERESTING;
          }
        } else if ((NIL != inference_worker_answer.answer_link_p(strategem))) {
          {
            SubLObject answer_link = strategem;
            SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
            inference_balanced_tactician_motivation.balanced_strategy_possibly_propagate_motivation_to_problem(strategy, $kw7$NEW_ROOT, root_problem);
            inference_worker.possibly_propagate_answer_link(answer_link);
            result = $kw13$INTERESTING;
          }
        } else {
          return Errors.error($str15$_S_was_an_unexpected_strategem, strategem);
        }
        return result;
      }
    }
  }

  /** If this is NIL, removal tactics will always be executed exhaustively before moving on to other tactics.
   Useful for experimentation, very bad for time to first answer. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 10725) 
  public static SubLSymbol $balanced_strategy_removal_tactic_iterativity_enabledP$ = null;

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 10983) 
  public static final SubLObject balanced_strategy_execute_tactic(SubLObject strategy, SubLObject tactic) {
    if ((NIL != inference_worker.content_tactic_p(tactic))) {
      return balanced_strategy_execute_content_tactic(strategy, tactic);
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36512");
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 11238) 
  public static final SubLObject balanced_strategy_execute_content_tactic(SubLObject strategy, SubLObject content_tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL == $balanced_strategy_removal_tactic_iterativity_enabledP$.getDynamicValue(thread))
           && (NIL != inference_worker_removal.removal_tactic_p(content_tactic)))) {
        inference_tactician.strategy_execute_tactic(strategy, content_tactic);
        if ((NIL != inference_datastructures_tactic.tactic_in_progressP(content_tactic))) {
          inference_balanced_tactician_motivation.balanced_strategy_reactivate_executable_strategem(strategy, content_tactic);
        }
      } else {
        balanced_strategy_execute_executable_strategem(strategy, content_tactic);
      }
      return strategy;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 11973) 
  public static final SubLObject balanced_strategy_execute_executable_strategem(SubLObject strategy, SubLObject strategem) {
    {
      SubLObject already_in_progressP = inference_datastructures_tactic.tactic_in_progressP(strategem);
      if ((NIL != already_in_progressP)) {
        inference_balanced_tactician_motivation.balanced_strategy_reactivate_executable_strategem(strategy, strategem);
      }
      inference_tactician.strategy_execute_tactic(strategy, strategem);
      if (((NIL == already_in_progressP)
           && (NIL != inference_datastructures_tactic.tactic_in_progressP(strategem)))) {
        inference_balanced_tactician_motivation.balanced_strategy_reactivate_executable_strategem(strategy, strategem);
      }
    }
    return strategem;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 12461) 
  public static final SubLObject balanced_strategy_handle_new_root(SubLObject strategy, SubLObject new_root, SubLObject motivation) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw5$REMOVAL)) {
        {
          SubLObject result = NIL;
          result = inference_balanced_tactician_motivation.balanced_strategy_possibly_propagate_motivation_to_problem(strategy, $kw5$REMOVAL, new_root);
          inference_balanced_tactician_datastructures.balanced_strategy_note_new_root_activated_wrt_removal(strategy, new_root);
          inference_balanced_tactician_datastructures.balanced_strategy_add_new_root(strategy, new_root);
          return result;
        }
      } else if (pcase_var.eql($kw6$TRANSFORMATION)) {
        {
          SubLObject result = NIL;
          result = inference_balanced_tactician_motivation.balanced_strategy_possibly_propagate_motivation_to_problem(strategy, $kw6$TRANSFORMATION, new_root);
          inference_balanced_tactician_datastructures.balanced_strategy_add_new_root(strategy, new_root);
          return result;
        }
      } else {
        return Errors.error($str16$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 13215) 
  public static SubLSymbol $balanced_strategy_prune_current_new_root_wrt_removal_timeout$ = null;

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-execution.lisp", position = 13396) 
  public static final SubLObject balanced_strategy_possibly_prune_current_new_root_wrt_removal(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if ((NIL != $balanced_strategy_prune_current_new_root_wrt_removal_timeout$.getDynamicValue(thread))) {
          if ((NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_transformationP(strategy))) {
            {
              SubLObject new_root = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36517");
              if ((NIL != new_root)) {
                if ((NIL == inference_worker.good_problem_p(new_root, strategy))) {
                  {
                    SubLObject elapsed_time = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36518");
                    if (elapsed_time.numGE($balanced_strategy_prune_current_new_root_wrt_removal_timeout$.getDynamicValue(thread))) {
                      result = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36513");
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36515");
                    }
                  }
                }
              }
            }
          }
        }
        return result;
      }
    }
  }

  public static final SubLObject declare_inference_balanced_tactician_execution_file() {
    declareFunction(myName, "balanced_strategy_doneP", "BALANCED-STRATEGY-DONE?", 1, 0, false); new $balanced_strategy_doneP$UnaryFunction();
    declareFunction(myName, "balanced_strategy_do_one_step", "BALANCED-STRATEGY-DO-ONE-STEP", 1, 0, false); new $balanced_strategy_do_one_step$UnaryFunction();
    declareFunction(myName, "balanced_strategy_do_one_step_int", "BALANCED-STRATEGY-DO-ONE-STEP-INT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_select_best_strategem", "BALANCED-STRATEGY-SELECT-BEST-STRATEGEM", 1, 0, false);
    declareFunction(myName, "balanced_strategy_default_select_best_strategem", "BALANCED-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM", 1, 0, false); new $balanced_strategy_default_select_best_strategem$UnaryFunction();
    declareFunction(myName, "balanced_strategy_new_root_next_motivation", "BALANCED-STRATEGY-NEW-ROOT-NEXT-MOTIVATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_quiesce", "BALANCED-STRATEGY-QUIESCE", 1, 0, false);
    declareFunction(myName, "balanced_strategy_quiesce_wrt_removal", "BALANCED-STRATEGY-QUIESCE-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_quiesce_new_root", "BALANCED-STRATEGY-QUIESCE-NEW-ROOT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_quiesce_wrt_transformation", "BALANCED-STRATEGY-QUIESCE-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "balanced_strategy_execute_strategem", "BALANCED-STRATEGY-EXECUTE-STRATEGEM", 2, 1, false);
    declareFunction(myName, "balanced_strategy_execute_tactic", "BALANCED-STRATEGY-EXECUTE-TACTIC", 2, 0, false);
    declareFunction(myName, "balanced_strategy_execute_content_tactic", "BALANCED-STRATEGY-EXECUTE-CONTENT-TACTIC", 2, 0, false);
    declareFunction(myName, "balanced_strategy_execute_meta_structural_tactic", "BALANCED-STRATEGY-EXECUTE-META-STRUCTURAL-TACTIC", 2, 0, false);
    declareFunction(myName, "balanced_strategy_execute_executable_strategem", "BALANCED-STRATEGY-EXECUTE-EXECUTABLE-STRATEGEM", 2, 0, false);
    declareFunction(myName, "balanced_strategy_handle_new_root", "BALANCED-STRATEGY-HANDLE-NEW-ROOT", 3, 0, false);
    declareFunction(myName, "balanced_strategy_possibly_prune_current_new_root_wrt_removal", "BALANCED-STRATEGY-POSSIBLY-PRUNE-CURRENT-NEW-ROOT-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_flush_wrt_removal", "BALANCED-STRATEGY-FLUSH-WRT-REMOVAL", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_balanced_tactician_execution_file() {
    $balanced_strategy_does_not_activate_disallowed_tactics_wrt_removalP$ = defparameter("*BALANCED-STRATEGY-DOES-NOT-ACTIVATE-DISALLOWED-TACTICS-WRT-REMOVAL?*", T);
    $balanced_strategy_removal_tactic_iterativity_enabledP$ = defparameter("*BALANCED-STRATEGY-REMOVAL-TACTIC-ITERATIVITY-ENABLED?*", T);
    $balanced_strategy_prune_current_new_root_wrt_removal_timeout$ = defvar("*BALANCED-STRATEGY-PRUNE-CURRENT-NEW-ROOT-WRT-REMOVAL-TIMEOUT*", NIL);
    return NIL;
  }

  public static final SubLObject setup_inference_balanced_tactician_execution_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$UNINTERESTING = makeKeyword("UNINTERESTING");
  public static final SubLSymbol $kw1$DONE = makeKeyword("DONE");
  public static final SubLString $str2$_s_says_it_s_done__but_its_T_box_ = makeString("~s says it's done, but its T-box is nonempty");
  public static final SubLString $str3$_s_says_it_s_done__but_its_R_box_ = makeString("~s says it's done, but its R-box is nonempty");
  public static final SubLSymbol $kw4$SELECT_BEST_STRATEGEM = makeKeyword("SELECT-BEST-STRATEGEM");
  public static final SubLSymbol $kw5$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw6$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $kw7$NEW_ROOT = makeKeyword("NEW-ROOT");
  public static final SubLSymbol $sym8$BALANCED_STRATEGY_P = makeSymbol("BALANCED-STRATEGY-P");
  public static final SubLSymbol $kw9$SET_ASIDE = makeKeyword("SET-ASIDE");
  public static final SubLSymbol $kw10$THROW_AWAY = makeKeyword("THROW-AWAY");
  public static final SubLSymbol $sym11$STRATEGEM_P = makeSymbol("STRATEGEM-P");
  public static final SubLSymbol $sym12$BALANCED_STRATEGY_MOTIVATION_P = makeSymbol("BALANCED-STRATEGY-MOTIVATION-P");
  public static final SubLSymbol $kw13$INTERESTING = makeKeyword("INTERESTING");
  public static final SubLString $str14$We_expect_to_only_propagate_T_to_ = makeString("We expect to only propagate T to transformation links, not ~S");
  public static final SubLString $str15$_S_was_an_unexpected_strategem = makeString("~S was an unexpected strategem");
  public static final SubLString $str16$unexpected_motivation__s = makeString("unexpected motivation ~s");

  //// Initializers

  public void declareFunctions() {
    declare_inference_balanced_tactician_execution_file();
  }

  public void initializeVariables() {
    init_inference_balanced_tactician_execution_file();
  }

  public void runTopLevelForms() {
    setup_inference_balanced_tactician_execution_file();
  }

}
