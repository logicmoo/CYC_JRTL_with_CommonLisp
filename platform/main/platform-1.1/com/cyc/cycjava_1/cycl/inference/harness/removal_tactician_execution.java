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
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_tactician_motivation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_tactician_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class removal_tactician_execution extends SubLTranslatedFile {

  //// Constructor

  private removal_tactician_execution() {}
  public static final SubLFile me = new removal_tactician_execution();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.removal_tactician_execution";

  //// Definitions

  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 918) 
  public static final SubLObject removal_strategy_doneP(SubLObject strategy) {
    return makeBoolean(((NIL != removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy))
           && (NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy))));
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 1195) 
  public static final SubLObject removal_strategy_do_one_step(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = $kw1$UNINTERESTING;
        while (($kw1$UNINTERESTING == result)) {
          result = removal_strategy_do_one_step_int(strategy);
        }
        if ((NIL != control_vars.$inference_debugP$.getDynamicValue(thread))) {
          if (($kw2$DONE == result)) {
            if ((NIL == removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy))) {
              Errors.cerror($str3$_s_says_it_s_done__but_its_R_box_, strategy);
            }
          }
        }
        return Equality.eq($kw2$DONE, result);
      }
    }
  }

  /** @return one of (:done :interesting, :uninteresting) */
  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 1620) 
  public static final SubLObject removal_strategy_do_one_step_int(SubLObject strategy) {
    {
      SubLObject result = NIL;
      if ((NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(strategy))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35464");
        result = $kw1$UNINTERESTING;
      } else if ((NIL != inference_tactician.strategy_doneP(strategy))) {
        result = $kw2$DONE;
      } else {
        {
          SubLObject strategem = removal_strategy_select_best_strategem(strategy);
          if ((NIL != strategem)) {
            result = removal_strategy_execute_strategem(strategy, strategem);
          } else {
            result = $kw2$DONE;
          }
        }
      }
      return result;
    }
  }

  /** @return strategem-p
remove from boxes during selection if necessary. (quiescence)
@note don't assume you're only looking at possible tactics, because of reuse (use case #2). */
  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 2256) 
  public static final SubLObject removal_strategy_select_best_strategem(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw5$SELECT_BEST_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 2562) 
  public static final SubLObject removal_strategy_default_select_best_strategem(SubLObject strategy) {
    removal_strategy_quiesce(strategy);
    if ((NIL == removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy))) {
      return removal_tactician_datastructures.removal_strategy_pop_strategem(strategy);
    }
    if ((NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy))) {
      return inference_datastructures_strategy.strategy_answer_link(strategy);
    }
    return NIL;
  }

  /** @return nil or strategem-p */
  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 2993) 
  public static final SubLObject removal_strategy_quiesce(SubLObject strategy) {
    checkType(strategy, $sym6$REMOVAL_STRATEGY_P);
    while (true) {
      {
        SubLObject candidate_strategem = removal_tactician_datastructures.removal_strategy_peek_strategem(strategy);
        if ((NIL == candidate_strategem)) {
          return NIL;
        }
        {
          SubLObject reason = removal_tactician_uninterestingness.why_removal_strategy_chooses_to_ignore_strategem(strategy, candidate_strategem);
          if ((NIL == reason)) {
            return candidate_strategem;
          }
          {
            SubLObject pcase_var = reason;
            if (pcase_var.eql($kw7$SET_ASIDE)) {
              removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, candidate_strategem);
            } else if (pcase_var.eql($kw8$THROW_AWAY)) {
              removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, candidate_strategem);
            }
          }
          removal_tactician_datastructures.removal_strategy_pop_strategem(strategy);
          removal_tactician_motivation.removal_strategy_strategically_deactivate_strategem(strategy, candidate_strategem);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 4108) 
  private static SubLSymbol $removal_strategy_does_not_activate_disallowed_tacticsP$ = null;

  /** @return one of (:interesting, :uninteresting) */
  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 4231) 
  public static final SubLObject removal_strategy_execute_strategem(SubLObject strategy, SubLObject strategem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(strategy, $sym6$REMOVAL_STRATEGY_P);
      checkType(strategem, $sym9$STRATEGEM_P);
      {
        SubLObject result = $kw1$UNINTERESTING;
        if ((NIL != inference_tactician.executable_strategem_p(strategem))) {
          {
            SubLObject tactic = strategem;
            SubLObject strategem_var = tactic;
            SubLObject problem = inference_tactician.strategem_problem(strategem_var);
            removal_tactician_motivation.removal_strategy_deactivate_strategem(strategy, strategem_var);
            removal_strategy_execute_tactic(strategy, tactic);
            removal_tactician_motivation.removal_strategy_possibly_deactivate_problem(strategy, problem);
            result = $kw10$INTERESTING;
          }
        } else if ((NIL != inference_worker.logical_tactic_p(strategem))) {
          {
            SubLObject tactic = strategem;
            if ((!(((NIL != $removal_strategy_does_not_activate_disallowed_tacticsP$.getDynamicValue(thread))
                   && (NIL != inference_tactician_strategic_uninterestingness.tactic_disallowedP(strategem, strategy)))))) {
              removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_link_head(strategy, tactic);
              {
                SubLObject strategem_var = tactic;
                SubLObject problem = inference_tactician.strategem_problem(strategem_var);
                removal_tactician_motivation.removal_strategy_deactivate_strategem(strategy, strategem_var);
                inference_tactician.strategy_possibly_execute_tactic(strategy, tactic);
                removal_tactician_motivation.removal_strategy_possibly_deactivate_problem(strategy, problem);
              }
              result = $kw10$INTERESTING;
            }
          }
        } else if ((NIL != inference_worker_transformation.transformation_link_p(strategem))) {
          return Errors.error($str11$removal_tactician_does_not_handle, strategem);
        } else if ((NIL != inference_worker_answer.answer_link_p(strategem))) {
          {
            SubLObject answer_link = strategem;
            SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
            removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, root_problem);
            inference_worker.possibly_propagate_answer_link(answer_link);
            result = $kw10$INTERESTING;
          }
        } else {
          return Errors.error($str12$_S_was_an_unexpected_strategem, strategem);
        }
        return result;
      }
    }
  }

  /** If this is NIL, removal tactics will always be executed exhaustively before moving on to other tactics.
   Useful for experimentation, very bad for time to first answer. */
  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 6061) 
  public static SubLSymbol $removal_strategy_removal_tactic_iterativity_enabledP$ = null;

  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 6318) 
  public static final SubLObject removal_strategy_execute_tactic(SubLObject strategy, SubLObject tactic) {
    if ((NIL != inference_worker.content_tactic_p(tactic))) {
      return removal_strategy_execute_content_tactic(strategy, tactic);
    } else {
      return removal_strategy_execute_meta_structural_tactic(strategy, tactic);
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 6570) 
  public static final SubLObject removal_strategy_execute_content_tactic(SubLObject strategy, SubLObject content_tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL == $removal_strategy_removal_tactic_iterativity_enabledP$.getDynamicValue(thread))
           && (NIL != inference_worker_removal.removal_tactic_p(content_tactic)))) {
        inference_tactician.strategy_execute_tactic(strategy, content_tactic);
        if ((NIL != inference_datastructures_tactic.tactic_in_progressP(content_tactic))) {
          removal_tactician_motivation.removal_strategy_reactivate_executable_strategem(strategy, content_tactic);
        }
      } else {
        removal_strategy_execute_executable_strategem(strategy, content_tactic);
      }
      return strategy;
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 7111) 
  public static final SubLObject removal_strategy_execute_meta_structural_tactic(SubLObject strategy, SubLObject meta_structural_tactic) {
    return removal_strategy_execute_executable_strategem(strategy, meta_structural_tactic);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 7299) 
  public static final SubLObject removal_strategy_execute_executable_strategem(SubLObject strategy, SubLObject strategem) {
    {
      SubLObject already_in_progressP = inference_datastructures_tactic.tactic_in_progressP(strategem);
      if ((NIL != already_in_progressP)) {
        removal_tactician_motivation.removal_strategy_reactivate_executable_strategem(strategy, strategem);
      }
      inference_tactician.strategy_execute_tactic(strategy, strategem);
      if (((NIL == already_in_progressP)
           && (NIL != inference_datastructures_tactic.tactic_in_progressP(strategem)))) {
        removal_tactician_motivation.removal_strategy_reactivate_executable_strategem(strategy, strategem);
      }
    }
    return strategem;
  }

  public static final SubLObject declare_removal_tactician_execution_file() {
    declareFunction(myName, "removal_strategy_doneP", "REMOVAL-STRATEGY-DONE?", 1, 0, false);
    declareFunction(myName, "removal_strategy_do_one_step", "REMOVAL-STRATEGY-DO-ONE-STEP", 1, 0, false);
    declareFunction(myName, "removal_strategy_do_one_step_int", "REMOVAL-STRATEGY-DO-ONE-STEP-INT", 1, 0, false);
    declareFunction(myName, "removal_strategy_select_best_strategem", "REMOVAL-STRATEGY-SELECT-BEST-STRATEGEM", 1, 0, false);
    declareFunction(myName, "removal_strategy_default_select_best_strategem", "REMOVAL-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM", 1, 0, false);
    declareFunction(myName, "removal_strategy_quiesce", "REMOVAL-STRATEGY-QUIESCE", 1, 0, false);
    declareFunction(myName, "removal_strategy_execute_strategem", "REMOVAL-STRATEGY-EXECUTE-STRATEGEM", 2, 0, false);
    declareFunction(myName, "removal_strategy_execute_tactic", "REMOVAL-STRATEGY-EXECUTE-TACTIC", 2, 0, false);
    declareFunction(myName, "removal_strategy_execute_content_tactic", "REMOVAL-STRATEGY-EXECUTE-CONTENT-TACTIC", 2, 0, false);
    declareFunction(myName, "removal_strategy_execute_meta_structural_tactic", "REMOVAL-STRATEGY-EXECUTE-META-STRUCTURAL-TACTIC", 2, 0, false);
    declareFunction(myName, "removal_strategy_execute_executable_strategem", "REMOVAL-STRATEGY-EXECUTE-EXECUTABLE-STRATEGEM", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_tactician_execution_file() {
    $removal_strategy_does_not_activate_disallowed_tacticsP$ = defparameter("*REMOVAL-STRATEGY-DOES-NOT-ACTIVATE-DISALLOWED-TACTICS?*", T);
    $removal_strategy_removal_tactic_iterativity_enabledP$ = defparameter("*REMOVAL-STRATEGY-REMOVAL-TACTIC-ITERATIVITY-ENABLED?*", T);
    return NIL;
  }

  public static final SubLObject setup_removal_tactician_execution_file() {
        utilities_macros.note_funcall_helper_function($sym0$REMOVAL_STRATEGY_DONE_);
    utilities_macros.note_funcall_helper_function($sym4$REMOVAL_STRATEGY_DO_ONE_STEP);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$REMOVAL_STRATEGY_DONE_ = makeSymbol("REMOVAL-STRATEGY-DONE?");
  public static final SubLSymbol $kw1$UNINTERESTING = makeKeyword("UNINTERESTING");
  public static final SubLSymbol $kw2$DONE = makeKeyword("DONE");
  public static final SubLString $str3$_s_says_it_s_done__but_its_R_box_ = makeString("~s says it's done, but its R-box is nonempty");
  public static final SubLSymbol $sym4$REMOVAL_STRATEGY_DO_ONE_STEP = makeSymbol("REMOVAL-STRATEGY-DO-ONE-STEP");
  public static final SubLSymbol $kw5$SELECT_BEST_STRATEGEM = makeKeyword("SELECT-BEST-STRATEGEM");
  public static final SubLSymbol $sym6$REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");
  public static final SubLSymbol $kw7$SET_ASIDE = makeKeyword("SET-ASIDE");
  public static final SubLSymbol $kw8$THROW_AWAY = makeKeyword("THROW-AWAY");
  public static final SubLSymbol $sym9$STRATEGEM_P = makeSymbol("STRATEGEM-P");
  public static final SubLSymbol $kw10$INTERESTING = makeKeyword("INTERESTING");
  public static final SubLString $str11$removal_tactician_does_not_handle = makeString("removal tactician does not handle transformation link ~a");
  public static final SubLString $str12$_S_was_an_unexpected_strategem = makeString("~S was an unexpected strategem");

  //// Initializers

  public void declareFunctions() {
    declare_removal_tactician_execution_file();
  }

  public void initializeVariables() {
    init_removal_tactician_execution_file();
  }

  public void runTopLevelForms() {
    setup_removal_tactician_execution_file();
  }

}
