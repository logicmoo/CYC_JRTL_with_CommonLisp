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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.inference.harness.balancing_tactician;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_rewrite;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.subl_macros;

public  final class inference_lookahead_productivity extends SubLTranslatedFile {

  //// Constructor

  private inference_lookahead_productivity() {}
  public static final SubLFile me = new inference_lookahead_productivity();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_lookahead_productivity";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 1020) 
  public static final SubLObject memoized_problem_max_removal_productivity_internal(SubLObject problem, SubLObject strategic_context) {
    return problem_max_removal_productivity(problem, strategic_context);
  }

  @SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 1020) 
  public static final SubLObject memoized_problem_max_removal_productivity(SubLObject problem, SubLObject strategic_context) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return memoized_problem_max_removal_productivity_internal(problem, strategic_context);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym0$MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym0$MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym0$MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(problem, strategic_context);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((problem == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (strategic_context == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_problem_max_removal_productivity_internal(problem, strategic_context)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(problem, strategic_context));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 1332) 
  public static final SubLObject problem_max_removal_productivity(SubLObject problem, SubLObject strategic_context) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != balancing_tactician.balancing_tactician_p(strategic_context))) {
        strategic_context = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33093");
      }
      {
        SubLObject existing_proof_count = inference_datastructures_problem.problem_proof_count(problem, UNPROVIDED);
        SubLObject productivity_from_existing_proofs = inference_datastructures_enumerated_types.productivity_for_number_of_children(existing_proof_count);
        SubLObject max_productivity = productivity_from_existing_proofs;
        SubLObject max_justification = problem;
        SubLObject tactics = problem_relevant_tactics_wrt_removal(problem, strategic_context);
        SubLObject cdolist_list_var = tactics;
        SubLObject tactic = NIL;
        for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
          thread.resetMultipleValues();
          {
            SubLObject max_lookahead_productivity = tactic_max_removal_productivity(tactic, strategic_context);
            SubLObject max_lookahead_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != inference_datastructures_enumerated_types.productivity_G(max_lookahead_productivity, max_productivity))) {
              max_productivity = max_lookahead_productivity;
              max_justification = max_lookahead_justification;
            }
          }
        }
        return Values.values(max_productivity, max_justification);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 2371) 
  public static final SubLObject tactic_max_removal_productivity(SubLObject tactic, SubLObject strategic_context) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != inference_worker_removal.generalized_removal_tactic_p(tactic))
          || (NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)))) {
        return Values.values(inference_datastructures_tactic.tactic_original_productivity(tactic), tactic);
      } else if ((NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic))) {
        {
          SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
          return problem_max_removal_productivity(lookahead_problem, strategic_context);
        }
      } else if ((NIL != inference_worker_join.join_tactic_p(tactic))) {
        thread.resetMultipleValues();
        {
          SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(tactic);
          SubLObject second_problem = thread.secondMultipleValue();
          thread.resetMultipleValues();
          thread.resetMultipleValues();
          {
            SubLObject first_productivity = problem_max_removal_productivity(first_problem, strategic_context);
            SubLObject first_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            {
              SubLObject second_productivity = problem_max_removal_productivity(second_problem, strategic_context);
              SubLObject second_justification = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if ((NIL != inference_datastructures_enumerated_types.productivity_G(second_productivity, first_productivity))) {
                return Values.values(second_productivity, second_justification);
              } else {
                return Values.values(first_productivity, first_justification);
              }
            }
          }
        }
      } else if ((NIL != inference_worker_split.meta_split_tactic_p(tactic))) {
        return Values.values(ZERO_INTEGER, tactic);
      } else {
        return Errors.error($str2$Unexpected_removal_relevant_tacti, tactic);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 3622) 
  public static final SubLObject problem_relevant_tactics_wrt_removal(SubLObject problem, SubLObject strategic_context) {
    inference_worker.determine_strategic_status_wrt(problem, strategic_context);
    if (($kw3$TACTICAL == strategic_context)) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36532");
    } else {
      return strategy_relevant_tactics_wrt_removal(strategic_context, problem);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 3957) 
  public static final SubLObject strategy_relevant_tactics_wrt_removal(SubLObject strategy, SubLObject problem) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw4$RELEVANT_TACTICS_WRT_REMOVAL, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  public static final SubLObject declare_inference_lookahead_productivity_file() {
    declareFunction(myName, "memoized_problem_max_removal_productivity_internal", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY-INTERNAL", 2, 0, false);
    declareFunction(myName, "memoized_problem_max_removal_productivity", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "problem_max_removal_productivity", "PROBLEM-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "tactic_max_removal_productivity", "TACTIC-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "problem_relevant_tactics_wrt_removal", "PROBLEM-RELEVANT-TACTICS-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "strategy_relevant_tactics_wrt_removal", "STRATEGY-RELEVANT-TACTICS-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "problem_tactically_relevant_tactics_wrt_removal", "PROBLEM-TACTICALLY-RELEVANT-TACTICS-WRT-REMOVAL", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_lookahead_productivity_file() {
    return NIL;
  }

  public static final SubLObject setup_inference_lookahead_productivity_file() {
    // CVS_ID("Id: inference-lookahead-productivity.lisp 128499 2009-08-06 15:49:24Z pace ");
    memoization_state.note_memoized_function($sym0$MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY = makeSymbol("MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY");
  public static final SubLSymbol $kw1$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLString $str2$Unexpected_removal_relevant_tacti = makeString("Unexpected removal-relevant tactic ~S");
  public static final SubLSymbol $kw3$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $kw4$RELEVANT_TACTICS_WRT_REMOVAL = makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL");
  public static final SubLSymbol $kw5$REMOVAL = makeKeyword("REMOVAL");

  //// Initializers

  public void declareFunctions() {
    declare_inference_lookahead_productivity_file();
  }

  public void initializeVariables() {
    init_inference_lookahead_productivity_file();
  }

  public void runTopLevelForms() {
    setup_inference_lookahead_productivity_file();
  }

}
