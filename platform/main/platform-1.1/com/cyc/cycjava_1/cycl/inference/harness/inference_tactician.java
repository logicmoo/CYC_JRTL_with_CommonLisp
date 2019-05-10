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
import com.cyc.cycjava_1.cycl.backward;
import com.cyc.cycjava_1.cycl.bindings;
import com.cyc.cycjava_1.cycl.clause_utilities;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava_1.cycl.inference.harness.inference_lookahead_productivity;
import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_rewrite;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.queues;
import com.cyc.cycjava_1.cycl.set_contents;
import com.cyc.cycjava_1.cycl.stacks;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.variables;

public  final class inference_tactician extends SubLTranslatedFile {

  //// Constructor

  private inference_tactician() {}
  public static final SubLFile me = new inference_tactician();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_tactician";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 1125) 
  public static final SubLObject strategy_do_one_step(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      strategy_possibly_auto_prune(strategy);
      {
        SubLObject _prev_bind_0 = inference_macros.$controlling_strategy$.currentBinding(thread);
        try {
          inference_macros.$controlling_strategy$.bind(strategy, thread);
          inference_datastructures_inference.increment_inference_step_count(inference_datastructures_strategy.strategy_inference(strategy));
          inference_datastructures_inference.increment_inference_cumulative_step_count(inference_datastructures_strategy.strategy_inference(strategy));
          inference_datastructures_strategy.strategy_dispatch(strategy, $kw0$DO_ONE_STEP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
          inference_macros.$controlling_strategy$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 1629) 
  public static final SubLObject strategy_doneP(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw1$DONE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** Called after all A-Brain consequences of a tactic have been followed through. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 1719) 
  public static final SubLObject strategy_note_tactic_finished(SubLObject strategy, SubLObject tactic) {
    inference_datastructures_strategy.problem_note_tactic_not_strategically_possible(inference_datastructures_tactic.tactic_problem(tactic), tactic, strategy);
    inference_worker.consider_strategic_ramifications_of_executed_tactic(strategy, tactic);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 2072) 
  public static final SubLObject strategy_possibly_activate_problem(SubLObject strategy, SubLObject problem) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw2$POSSIBLY_ACTIVATE_PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** Gets called actually before stuff starts propagating from LINK */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 2247) 
  public static final SubLObject strategy_note_argument_link_added(SubLObject strategy, SubLObject link) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw3$NEW_ARGUMENT_LINK, link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** Useful for testing problem-store-pruning. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 2807) 
  private static SubLSymbol $strategy_auto_prune_threshold$ = null;

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 2960) 
  private static SubLSymbol $strategy_auto_prune_step_count$ = null;

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 3012) 
  public static final SubLObject clear_strategy_step_count() {
    $strategy_auto_prune_step_count$.setDynamicValue(ZERO_INTEGER);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 3118) 
  public static final SubLObject strategy_possibly_auto_prune(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      inference_strategist.inference_possibly_prune_processed_proofs(inference_datastructures_strategy.strategy_inference(strategy));
      if ((NIL != $strategy_auto_prune_threshold$.getDynamicValue(thread))) {
        if ($strategy_auto_prune_step_count$.getDynamicValue(thread).numGE($strategy_auto_prune_threshold$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35331");
          clear_strategy_step_count();
        }
        $strategy_auto_prune_step_count$.setDynamicValue(Numbers.add($strategy_auto_prune_step_count$.getDynamicValue(thread), ONE_INTEGER), thread);
        return $strategy_auto_prune_step_count$.getDynamicValue(thread);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 3559) 
  private static SubLSymbol $strategy_sort_strategy$ = null;

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 3635) 
  private static SubLSymbol $strategy_sort_predicate$ = null;

  /** Stable-sort SEQUENCE wrt STRATEGY using PREDICATE as the comparison function.
   PREDICATE must have an arg-signature of (OBJ1 OBJ2 STRATEGY). */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 3688) 
  public static final SubLObject strategy_sort(SubLObject strategy, SubLObject sequence, SubLObject predicate) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(strategy, $sym4$STRATEGY_P);
      {
        SubLObject _prev_bind_0 = $strategy_sort_strategy$.currentBinding(thread);
        SubLObject _prev_bind_1 = $strategy_sort_predicate$.currentBinding(thread);
        try {
          $strategy_sort_strategy$.bind(strategy, thread);
          $strategy_sort_predicate$.bind(predicate, thread);
          sequence = Sort.stable_sort(sequence, $sym5$STRATEGY_SORT_PREDICATE_, UNPROVIDED);
        } finally {
          $strategy_sort_predicate$.rebind(_prev_bind_1, thread);
          $strategy_sort_strategy$.rebind(_prev_bind_0, thread);
        }
      }
      return sequence;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 4108) 
  public static final SubLObject strategy_sort_predicateP(SubLObject object1, SubLObject object2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Functions.funcall($strategy_sort_predicate$.getDynamicValue(thread), object1, object2, $strategy_sort_strategy$.getDynamicValue(thread));
    }
  }

  public static final class $strategy_sort_predicateP$BinaryFunction extends BinaryFunction {
    public $strategy_sort_predicateP$BinaryFunction() { super(extractFunctionNamed("STRATEGY-SORT-PREDICATE?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return strategy_sort_predicateP(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 4263) 
  public static final SubLObject tactic_strategic_productivity_L(SubLObject tactic1, SubLObject tactic2, SubLObject strategy) {
    return inference_datastructures_enumerated_types.productivity_L(inference_datastructures_strategy.tactic_strategic_productivity(tactic1, strategy), inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 4480) 
  public static final SubLObject logical_tactic_better_wrt_removalP(SubLObject logical_tactic1, SubLObject logical_tactic2, SubLObject strategy) {
    {
      SubLObject lookahead_problem1 = logical_tactic_lookahead_problem_wrt_removal(logical_tactic1, strategy);
      SubLObject lookahead_problem2 = logical_tactic_lookahead_problem_wrt_removal(logical_tactic2, strategy);
      return inference_datastructures_enumerated_types.productivity_L(inference_lookahead_productivity.memoized_problem_max_removal_productivity(lookahead_problem1, strategy), inference_lookahead_productivity.memoized_problem_max_removal_productivity(lookahead_problem2, strategy));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 4978) 
  public static final SubLObject logical_tactic_lookahead_problem_wrt_removal(SubLObject logical_tactic, SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_worker_join.join_tactic_p(logical_tactic))) {
        thread.resetMultipleValues();
        {
          SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
          SubLObject second_problem = thread.secondMultipleValue();
          thread.resetMultipleValues();
          return ((NIL != inference_datastructures_enumerated_types.productivity_L(inference_lookahead_productivity.memoized_problem_max_removal_productivity(first_problem, strategy), inference_lookahead_productivity.memoized_problem_max_removal_productivity(second_problem, strategy))) ? ((SubLObject) second_problem) : first_problem);
        }
      } else {
        return inference_worker.logical_tactic_lookahead_problem(logical_tactic);
      }
    }
  }

  /** @return strategy-p or :tactical
   @see controlling-strategy */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 5490) 
  public static final SubLObject controlling_strategic_context(SubLObject strategic_context) {
    if (($kw8$TACTICAL == strategic_context)) {
      return $kw8$TACTICAL;
    } else {
      return controlling_strategy(strategic_context);
    }
  }

  /** @return strategy-p; the controlling strategy of STRATEGY.  May be STRATEGY itself
   if STRATEGY is not a substrategy of some other strategy. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 5743) 
  public static final SubLObject controlling_strategy(SubLObject strategy) {
    return inference_datastructures_inference.simplest_inference_strategy(inference_datastructures_strategy.strategy_inference(strategy));
  }

  /** @return booleanp; whether STRATEGY is a substrategy of some other strategy. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 6009) 
  public static final SubLObject controlling_strategyP(SubLObject strategy) {
    return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(strategy))
           && (strategy == controlling_strategy(strategy))));
  }

  /** @return booleanp; whether STRATEGY is a substrategy of some other strategy. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 6231) 
  public static final SubLObject substrategyP(SubLObject strategy) {
    return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(strategy))
           && (strategy != controlling_strategy(strategy))));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 6451) 
  public static final SubLObject strategy_controls_problem_storeP(SubLObject strategy) {
    return makeBoolean(((NIL != controlling_strategyP(strategy))
           && (NIL != inference_datastructures_inference.inference_problem_store_privateP(inference_datastructures_strategy.strategy_inference(strategy)))));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 7722) 
  public static final SubLObject problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(SubLObject problem, SubLObject relevant_tactic_type) {
    {
      SubLObject result = NIL;
      if (((NIL == relevant_tactic_type)
          || (relevant_tactic_type == $kw29$JOIN_ORDERED)
          || (relevant_tactic_type == $kw30$CONNECTED_CONJUNCTION))) {
        {
          SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
          SubLObject join_ordered_tactic = NIL;
          for (join_ordered_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), join_ordered_tactic = cdolist_list_var.first()) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(join_ordered_tactic, $kw29$JOIN_ORDERED))) {
              if ((NIL == inference_worker_join_ordered.single_focal_literal_join_ordered_tactic_p(join_ordered_tactic))) {
                result = cons(join_ordered_tactic, result);
              }
            }
          }
        }
        result = list_utilities.delete_subsumed_items(result, $sym31$JOIN_ORDERED_TACTIC_SUBSUMES_, UNPROVIDED);
        result = Sequences.nreverse(result);
      }
      return result;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 8429) 
  public static final SubLObject some_subsuming_join_ordered_tacticP(SubLObject join_ordered_tactic, SubLObject subsuming_join_ordered_tactics, SubLObject strategic_context) {
    {
      SubLObject subsumedP = NIL;
      if ((NIL != subsuming_join_ordered_tactics)) {
        if ((NIL != inference_worker_join_ordered.join_ordered_tactic_p(join_ordered_tactic))) {
          if ((NIL == subsumedP)) {
            {
              SubLObject csome_list_var = subsuming_join_ordered_tactics;
              SubLObject candidate_subsuming_tactic = NIL;
              for (candidate_subsuming_tactic = csome_list_var.first(); (!(((NIL != subsumedP)
                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), candidate_subsuming_tactic = csome_list_var.first()) {
                if ((join_ordered_tactic != candidate_subsuming_tactic)) {
                  if ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36368"))) {
                    if ((NIL == Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35446"))) {
                      subsumedP = T;
                    }
                  }
                }
              }
            }
          }
        }
      }
      return subsumedP;
    }
  }

  /** The total productivity threshold below or equal to which we don't bother
looking for anything better, and quit early. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 16569) 
  private static SubLSymbol $sufficiently_good_tactic_productivity_threshold$ = null;

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 18749) 
  private static SubLSymbol $default_early_removal_productivity_limit$ = null;

  /** Execute TACTIC under the control of STRATEGY.
   Return TACTIC. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 21086) 
  public static final SubLObject strategy_execute_tactic(SubLObject strategy, SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(strategy, $sym4$STRATEGY_P);
      checkType(tactic, $sym32$TACTIC_P);
      if ((NIL != inference_datastructures_tactic.tactic_possibleP(tactic))) {
        inference_datastructures_inference.inference_note_tactic_executed(inference_datastructures_strategy.strategy_inference(strategy), tactic);
        {
          SubLObject _prev_bind_0 = inference_macros.$controlling_strategy$.currentBinding(thread);
          try {
            inference_macros.$controlling_strategy$.bind(strategy, thread);
            inference_worker.execute_tactic(tactic);
          } finally {
            inference_macros.$controlling_strategy$.rebind(_prev_bind_0, thread);
          }
        }
        return tactic;
      }
      return NIL;
    }
  }

  /** @return booleanp; whether STRATEGY actually just executed TACTIC. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 21658) 
  public static final SubLObject strategy_possibly_execute_tactic(SubLObject strategy, SubLObject tactic) {
    return list_utilities.sublisp_boolean(strategy_execute_tactic(strategy, tactic));
  }

  /** Whether :set-aside plus non-continuable should be strengthened to :throw-away */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 22842) 
  public static SubLSymbol $set_aside_non_continuable_implies_throw_awayP$ = null;

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 23029) 
  public static final SubLObject strategy_throw_away_uninteresting_set_asides(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw42$THROW_AWAY_UNINTERESTING_SET_ASIDES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** Return T iff STRATEGY would throw away all transformation. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 23179) 
  public static final SubLObject strategy_throws_away_all_transformationP(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy)))
            || ((NIL != $set_aside_non_continuable_implies_throw_awayP$.getDynamicValue(thread))
               && (NIL == inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)))
               && (NIL != strategy_sets_aside_all_transformationP(strategy)))));
    }
  }

  /** Return T iff STRATEGY would set aside all transformation. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 23702) 
  public static final SubLObject strategy_sets_aside_all_transformationP(SubLObject strategy) {
    return makeBoolean((NIL == inference_worker.problem_transformation_allowed_wrt_max_transformation_depthP(inference_datastructures_strategy.strategy_inference(strategy), inference_datastructures_strategy.strategy_root_problem(strategy))));
  }

  /** @return booleanp; Whether STRATEGY deems continuation possible.
This is usually true whenn STRATEGY has some set-aside problems to continue work on. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 23993) 
  public static final SubLObject strategy_continuation_possibleP(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw43$CONTINUATION_POSSIBLE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 24302) 
  private static SubLSymbol $better_term_chosen_handlingP$ = null;

  /** Temporary control parameter, not ready yet, should stay NIL for now */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 24368) 
  private static SubLSymbol $better_backchain_forbidden_when_unbound_in_arg_handlingP$ = null;

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 24520) 
  public static final SubLObject better_term_chosen_handlingP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $better_term_chosen_handlingP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 29218) 
  public static final SubLObject executable_strategem_p(SubLObject object) {
    return makeBoolean(((NIL != inference_worker.content_tactic_p(object))
          || (NIL != inference_worker.meta_structural_tactic_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 29346) 
  public static final SubLObject strategem_invalid_p(SubLObject strategem) {
    if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
      return inference_datastructures_tactic.tactic_invalid_p(strategem);
    } else if ((NIL != inference_datastructures_problem_link.problem_link_p(strategem))) {
      return inference_datastructures_problem_link.problem_link_invalid_p(strategem);
    } else if ((NIL != inference_datastructures_problem.problem_p(strategem))) {
      return inference_datastructures_problem.problem_invalid_p(strategem);
    } else {
      return Errors.error($str51$Unexpected_strategem_type__s, strategem);
    }
  }

  /** @return nil or problem-p.  It will be NIL for an answer link */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 29708) 
  public static final SubLObject strategem_problem(SubLObject strategem) {
    if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
      return inference_datastructures_tactic.tactic_problem(strategem);
    } else if ((NIL != inference_datastructures_problem_link.problem_link_p(strategem))) {
      return inference_datastructures_problem_link.problem_link_supported_problem(strategem);
    } else if ((NIL != inference_datastructures_problem.problem_p(strategem))) {
      return strategem;
    } else {
      return Errors.error($str51$Unexpected_strategem_type__s, strategem);
    }
  }

  /** Strategems that make a new root.
   The answer link is a special case of a new root, because the root problem 
   doesn't necessarily have T. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 30429) 
  public static final SubLObject motivation_strategem_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_worker_transformation.transformation_link_p(object))
          || (NIL != inference_worker_answer.answer_link_p(object))));
  }

  /** Declares a strategy type to the inference engine. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 31252) 
  public static final SubLObject inference_strategy_type(SubLObject strategy_type, SubLObject plist) {
    return inference_datastructures_strategy.new_strategy_type(strategy_type, plist);
  }

  /** @return function-spec-p */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 31441) 
  public static final SubLObject strategy_type_dispatch_handler(SubLObject strategy_type, SubLObject method_type) {
    return inference_datastructures_strategy.strategy_type_property(strategy_type, method_type);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 31960) 
  public static final SubLObject happiness_E(SubLObject happiness1, SubLObject happiness2) {
    return number_utilities.potentially_infinite_integer_E(happiness1, happiness2);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 32079) 
  public static final SubLObject happiness_L(SubLObject happiness1, SubLObject happiness2) {
    return number_utilities.potentially_infinite_integer_L(happiness1, happiness2);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 32198) 
  public static final SubLObject happiness_G(SubLObject happiness1, SubLObject happiness2) {
    return number_utilities.potentially_infinite_integer_G(happiness1, happiness2);
  }

  public static final class $happiness_G$BinaryFunction extends BinaryFunction {
    public $happiness_G$BinaryFunction() { super(extractFunctionNamed("HAPPINESS->")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return happiness_G(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 32938) 
  public static final SubLObject new_problem_happiness_index() {
    {
      SubLObject happiness_to_objects = Hashtables.make_hash_table(ZERO_INTEGER, Symbols.symbol_function(EQL), UNPROVIDED);
      SubLObject greatest_happiness_index = queues.create_p_queue(NIL, Symbols.symbol_function(IDENTITY), $sym53$HAPPINESS__);
      return Vectors.vector(new SubLObject[] {happiness_to_objects, greatest_happiness_index});
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 33270) 
  public static final SubLObject problem_happiness_index_empty_p(SubLObject happiness_index) {
    {
      SubLObject greatest_happiness_index = Vectors.aref(happiness_index, ONE_INTEGER);
      return queues.p_queue_empty_p(greatest_happiness_index);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 33456) 
  public static final SubLObject problem_happiness_index_add(SubLObject happiness_index, SubLObject happiness, SubLObject object) {
    checkType(happiness, $sym54$HAPPINESS_P);
    {
      SubLObject happiness_to_objects = Vectors.aref(happiness_index, ZERO_INTEGER);
      SubLObject object_stack = Hashtables.gethash_without_values(happiness, happiness_to_objects, NIL);
      if ((NIL == object_stack)) {
        object_stack = stacks.create_stack();
        Hashtables.sethash(happiness, happiness_to_objects, object_stack);
      }
      if ((NIL != stacks.stack_empty_p(object_stack))) {
        {
          SubLObject greatest_happiness_index = Vectors.aref(happiness_index, ONE_INTEGER);
          queues.p_enqueue(happiness, greatest_happiness_index);
        }
      }
      stacks.stack_push(object, object_stack);
    }
    return happiness_index;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 34081) 
  public static final SubLObject problem_happiness_index_peek(SubLObject happiness_index) {
    {
      SubLObject object = NIL;
      SubLObject expected_happiness = NIL;
      SubLObject happiness_to_objects = Vectors.aref(happiness_index, ZERO_INTEGER);
      SubLObject greatest_happiness_index = Vectors.aref(happiness_index, ONE_INTEGER);
      SubLObject greatest_happiness = queues.p_queue_best(greatest_happiness_index);
      SubLObject object_stack = Hashtables.gethash_without_values(greatest_happiness, happiness_to_objects, $kw55$ERROR);
      if (($kw55$ERROR == object_stack)) {
        Errors.error($str56$No_object_stack_for_happiness__S, greatest_happiness);
      } else if ((NIL != stacks.stack_empty_p(object_stack))) {
        Errors.error($str57$No_objects_for_happiness__S, greatest_happiness);
      } else {
        object = stacks.stack_peek(object_stack);
        expected_happiness = greatest_happiness;
      }
      return Values.values(object, expected_happiness);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 34816) 
  public static final SubLObject problem_happiness_index_next(SubLObject happiness_index) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject object = NIL;
        SubLObject expected_happiness = NIL;
        SubLObject happiness_to_objects = Vectors.aref(happiness_index, ZERO_INTEGER);
        SubLObject greatest_happiness_index = Vectors.aref(happiness_index, ONE_INTEGER);
        SubLObject greatest_happiness = queues.p_queue_best(greatest_happiness_index);
        SubLObject object_stack = Hashtables.gethash_without_values(greatest_happiness, happiness_to_objects, $kw55$ERROR);
        if (($kw55$ERROR == object_stack)) {
          Errors.error($str56$No_object_stack_for_happiness__S, greatest_happiness);
        } else if ((NIL != stacks.stack_empty_p(object_stack))) {
          Errors.error($str57$No_objects_for_happiness__S, greatest_happiness);
        } else {
          object = stacks.stack_pop(object_stack);
          expected_happiness = greatest_happiness;
          if ((NIL != stacks.stack_empty_p(object_stack))) {
            {
              SubLObject removed_happiness = queues.p_dequeue(greatest_happiness_index, UNPROVIDED);
              if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                if ((NIL == happiness_E(removed_happiness, greatest_happiness))) {
                  Errors.error($str58$Removed__S_but__S_was_lowest_happ, removed_happiness, greatest_happiness);
                }
              }
            }
          }
        }
        return Values.values(object, expected_happiness);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 36513) 
  public static final SubLObject strategy_initialize_properties(SubLObject strategy, SubLObject strategy_static_properties) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw60$INITIALIZE_PROPERTIES, strategy_static_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 36711) 
  public static final SubLObject default_strategy_initialize_properties(SubLObject strategy, SubLObject strategy_static_properties) {
    inference_datastructures_strategy.set_strategy_properties(strategy, strategy_static_properties);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 36890) 
  public static final SubLObject strategy_update_properties(SubLObject strategy, SubLObject strategy_dynamic_properties) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw62$UPDATE_PROPERTIES, strategy_dynamic_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 37060) 
  public static final SubLObject default_strategy_update_properties(SubLObject strategy, SubLObject strategy_dynamic_properties) {
    inference_datastructures_strategy.set_strategy_properties(strategy, strategy_dynamic_properties);
    return NIL;
  }

  /** Callback for STRATEGY to note that its inference's dynamic properties have been updated. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 37237) 
  public static final SubLObject strategy_note_inference_dynamic_properties_updated(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw64$INFERENCE_DYNAMIC_PROPERTIES_UPDATED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 37487) 
  public static final SubLObject default_strategy_note_inference_dynamic_properties_updated(SubLObject strategy) {
    inference_datastructures_strategy.note_strategy_should_reconsider_set_asides(strategy);
    return NIL;
  }

  /** By default, this is simply the list (STRATEGY), but can be overridden */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 37651) 
  public static final SubLObject strategy_initial_relevant_strategies(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw66$INITIAL_RELEVANT_STRATEGIES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 37859) 
  public static final SubLObject default_strategy_initial_relevant_strategies(SubLObject strategy) {
    return list(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 37959) 
  public static final SubLObject strategy_note_split_tactics_strategically_possible(SubLObject strategy, SubLObject split_tactics) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw67$SPLIT_TACTICS_POSSIBLE, split_tactics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 38130) 
  public static final SubLObject strategy_note_tactic_discarded(SubLObject strategy, SubLObject tactic) {
    if ((NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategy, tactic))) {
      inference_datastructures_strategy.problem_note_tactic_not_strategically_possible(inference_datastructures_tactic.tactic_problem(tactic), tactic, strategy);
    }
    return NIL;
  }

  /** Depending on what type of tactic TACTIC is,
  compute its strategic properties wrt STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 38376) 
  public static final SubLObject strategy_note_new_tactic(SubLObject strategy, SubLObject tactic) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw68$NEW_TACTIC, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 38592) 
  public static final SubLObject strategy_no_possible_strategems_for_problemP(SubLObject strategy, SubLObject problem) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw69$PROBLEM_NOTHING_TO_DO_, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 38745) 
  public static final SubLObject strategy_consider_that_problem_could_be_strategically_pending(SubLObject strategy, SubLObject problem) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw70$PROBLEM_COULD_BE_PENDING, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician.lisp", position = 38917) 
  public static final SubLObject strategy_consider_that_problem_could_be_no_good(SubLObject strategy, SubLObject problem, SubLObject consider_deepP, SubLObject consider_transformation_tacticsP) {
    return inference_worker.default_consider_that_problem_could_be_no_good(strategy, problem, consider_deepP, consider_transformation_tacticsP);
  }

  public static final SubLObject declare_inference_tactician_file() {
    declareFunction(myName, "strategy_do_one_step", "STRATEGY-DO-ONE-STEP", 1, 0, false);
    declareFunction(myName, "strategy_doneP", "STRATEGY-DONE?", 1, 0, false);
    declareFunction(myName, "strategy_note_tactic_finished", "STRATEGY-NOTE-TACTIC-FINISHED", 2, 0, false);
    declareFunction(myName, "strategy_possibly_activate_problem", "STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
    declareFunction(myName, "strategy_note_argument_link_added", "STRATEGY-NOTE-ARGUMENT-LINK-ADDED", 2, 0, false);
    declareFunction(myName, "strategy_do_problem_store_prune", "STRATEGY-DO-PROBLEM-STORE-PRUNE", 1, 0, false);
    declareFunction(myName, "clear_strategy_step_count", "CLEAR-STRATEGY-STEP-COUNT", 0, 0, false);
    declareFunction(myName, "strategy_possibly_auto_prune", "STRATEGY-POSSIBLY-AUTO-PRUNE", 1, 0, false);
    declareFunction(myName, "strategy_sort", "STRATEGY-SORT", 3, 0, false);
    declareFunction(myName, "strategy_sort_predicateP", "STRATEGY-SORT-PREDICATE?", 2, 0, false); new $strategy_sort_predicateP$BinaryFunction();
    declareFunction(myName, "tactic_strategic_productivity_L", "TACTIC-STRATEGIC-PRODUCTIVITY-<", 3, 0, false);
    declareFunction(myName, "logical_tactic_better_wrt_removalP", "LOGICAL-TACTIC-BETTER-WRT-REMOVAL?", 3, 0, false);
    declareFunction(myName, "logical_tactic_lookahead_problem_wrt_removal", "LOGICAL-TACTIC-LOOKAHEAD-PROBLEM-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "controlling_strategic_context", "CONTROLLING-STRATEGIC-CONTEXT", 1, 0, false);
    declareFunction(myName, "controlling_strategy", "CONTROLLING-STRATEGY", 1, 0, false);
    declareFunction(myName, "controlling_strategyP", "CONTROLLING-STRATEGY?", 1, 0, false);
    declareFunction(myName, "substrategyP", "SUBSTRATEGY?", 1, 0, false);
    declareFunction(myName, "strategy_controls_problem_storeP", "STRATEGY-CONTROLS-PROBLEM-STORE?", 1, 0, false);
    declareMacro(myName, "do_problem_unsubsumed_tactics", "DO-PROBLEM-UNSUBSUMED-TACTICS");
    declareFunction(myName, "problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics", "PROBLEM-MAXIMAL-SUBSUMING-MULTI-FOCAL-LITERAL-JOIN-ORDERED-TACTICS", 2, 0, false);
    declareFunction(myName, "some_subsuming_join_ordered_tacticP", "SOME-SUBSUMING-JOIN-ORDERED-TACTIC?", 3, 0, false);
    declareFunction(myName, "consider_subsumed_join_ordered_tacticP", "CONSIDER-SUBSUMED-JOIN-ORDERED-TACTIC?", 3, 0, false);
    declareFunction(myName, "select_problem_tactic", "SELECT-PROBLEM-TACTIC", 5, 4, false);
    declareFunction(myName, "choose_between_tactics", "CHOOSE-BETWEEN-TACTICS", 4, 0, false);
    declareFunction(myName, "select_best_tactic_for_problem", "SELECT-BEST-TACTIC-FOR-PROBLEM", 2, 4, false);
    declareFunction(myName, "productivity_and_completeness_worseP", "PRODUCTIVITY-AND-COMPLETENESS-WORSE?", 4, 0, false);
    declareFunction(myName, "productivity_and_completeness_betterP", "PRODUCTIVITY-AND-COMPLETENESS-BETTER?", 4, 0, false);
    declareFunction(myName, "tactic_productivity_and_completeness_worseP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-WORSE?", 3, 0, false);
    declareFunction(myName, "tactic_productivity_and_completeness_betterP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-BETTER?", 3, 0, false);
    declareFunction(myName, "tactic_productivity_and_completeness_sufficiently_goodP", "TACTIC-PRODUCTIVITY-AND-COMPLETENESS-SUFFICIENTLY-GOOD?", 2, 0, false);
    declareFunction(myName, "choose_less_productive_tactic", "CHOOSE-LESS-PRODUCTIVE-TACTIC", 3, 0, false);
    declareFunction(myName, "tactic_productivity_higherP", "TACTIC-PRODUCTIVITY-HIGHER?", 3, 0, false);
    declareFunction(myName, "tactic_productivity_lowerP", "TACTIC-PRODUCTIVITY-LOWER?", 3, 0, false);
    declareFunction(myName, "tactic_productivity_sufficiently_goodP", "TACTIC-PRODUCTIVITY-SUFFICIENTLY-GOOD?", 2, 0, false);
    declareFunction(myName, "early_removal_productivity_limit", "EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "strategy_early_removal_productivity_limit", "STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "candidate_early_removal_tacticP", "CANDIDATE-EARLY-REMOVAL-TACTIC?", 1, 0, false);
    declareFunction(myName, "join_ordered_tactic_early_removal_cheapP", "JOIN-ORDERED-TACTIC-EARLY-REMOVAL-CHEAP?", 1, 0, false);
    declareFunction(myName, "join_ordered_link_early_removal_cheapP", "JOIN-ORDERED-LINK-EARLY-REMOVAL-CHEAP?", 2, 0, false);
    declareFunction(myName, "problem_has_a_non_sksi_tacticP", "PROBLEM-HAS-A-NON-SKSI-TACTIC?", 1, 0, false);
    declareFunction(myName, "strategy_quiesce", "STRATEGY-QUIESCE", 1, 0, false);
    declareFunction(myName, "strategy_execute_tactic", "STRATEGY-EXECUTE-TACTIC", 2, 0, false);
    declareFunction(myName, "strategy_possibly_execute_tactic", "STRATEGY-POSSIBLY-EXECUTE-TACTIC", 2, 0, false);
    declareFunction(myName, "strategy_make_problem_set_aside", "STRATEGY-MAKE-PROBLEM-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "possibly_clear_strategic_status_wrt", "POSSIBLY-CLEAR-STRATEGIC-STATUS-WRT", 2, 0, false);
    declareFunction(myName, "clear_strategic_status_wrt", "CLEAR-STRATEGIC-STATUS-WRT", 2, 0, false);
    declareFunction(myName, "strategy_throw_away_uninteresting_set_asides", "STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
    declareFunction(myName, "strategy_throws_away_all_transformationP", "STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "strategy_sets_aside_all_transformationP", "STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "strategy_continuation_possibleP", "STRATEGY-CONTINUATION-POSSIBLE?", 1, 0, false);
    declareFunction(myName, "better_term_chosen_handlingP", "BETTER-TERM-CHOSEN-HANDLING?", 0, 0, false);
    declareFunction(myName, "transformation_link_leads_to_term_chosen_dead_endP", "TRANSFORMATION-LINK-LEADS-TO-TERM-CHOSEN-DEAD-END?", 1, 0, false);
    declareFunction(myName, "transformation_link_term_chosen_dead_end_vars", "TRANSFORMATION-LINK-TERM-CHOSEN-DEAD-END-VARS", 1, 0, false);
    declareFunction(myName, "problem_term_chosen_dead_end_vars", "PROBLEM-TERM-CHOSEN-DEAD-END-VARS", 1, 0, false);
    declareFunction(myName, "all_restricted_non_focals_around_transformation_link", "ALL-RESTRICTED-NON-FOCALS-AROUND-TRANSFORMATION-LINK", 1, 0, false);
    declareFunction(myName, "supported_problem_needed_term_chosen_vars", "SUPPORTED-PROBLEM-NEEDED-TERM-CHOSEN-VARS", 1, 0, false);
    declareFunction(myName, "focal_problem_binds_all_varsP", "FOCAL-PROBLEM-BINDS-ALL-VARS?", 2, 0, false);
    declareFunction(myName, "strategem_p", "STRATEGEM-P", 1, 0, false);
    declareFunction(myName, "executable_strategem_p", "EXECUTABLE-STRATEGEM-P", 1, 0, false);
    declareFunction(myName, "strategem_invalid_p", "STRATEGEM-INVALID-P", 1, 0, false);
    declareFunction(myName, "strategem_problem", "STRATEGEM-PROBLEM", 1, 0, false);
    declareFunction(myName, "motivation_strategem_p", "MOTIVATION-STRATEGEM-P", 1, 0, false);
    declareFunction(myName, "motivation_strategem_link_p", "MOTIVATION-STRATEGEM-LINK-P", 1, 0, false);
    declareFunction(myName, "removal_strategem_p", "REMOVAL-STRATEGEM-P", 1, 0, false);
    declareFunction(myName, "transformation_strategem_p", "TRANSFORMATION-STRATEGEM-P", 1, 0, false);
    declareFunction(myName, "inference_strategy_type", "INFERENCE-STRATEGY-TYPE", 2, 0, false);
    declareFunction(myName, "strategy_type_dispatch_handler", "STRATEGY-TYPE-DISPATCH-HANDLER", 2, 0, false);
    declareFunction(myName, "happiness_p", "HAPPINESS-P", 1, 0, false);
    declareFunction(myName, "happiness_E", "HAPPINESS-=", 2, 0, false);
    declareFunction(myName, "happiness_L", "HAPPINESS-<", 2, 0, false);
    declareFunction(myName, "happiness_G", "HAPPINESS->", 2, 0, false); new $happiness_G$BinaryFunction();
    declareFunction(myName, "happiness_min", "HAPPINESS-MIN", 2, 0, false);
    declareFunction(myName, "happiness_max", "HAPPINESS-MAX", 2, 0, false);
    declareFunction(myName, "minimal_happiness", "MINIMAL-HAPPINESS", 0, 0, false);
    declareFunction(myName, "problem_happiness_index_p", "PROBLEM-HAPPINESS-INDEX-P", 1, 0, false);
    declareFunction(myName, "new_problem_happiness_index", "NEW-PROBLEM-HAPPINESS-INDEX", 0, 0, false);
    declareFunction(myName, "problem_happiness_index_empty_p", "PROBLEM-HAPPINESS-INDEX-EMPTY-P", 1, 0, false);
    declareFunction(myName, "problem_happiness_index_add", "PROBLEM-HAPPINESS-INDEX-ADD", 3, 0, false);
    declareFunction(myName, "problem_happiness_index_peek", "PROBLEM-HAPPINESS-INDEX-PEEK", 1, 0, false);
    declareFunction(myName, "problem_happiness_index_next", "PROBLEM-HAPPINESS-INDEX-NEXT", 1, 0, false);
    declareFunction(myName, "problem_happiness_index_contents", "PROBLEM-HAPPINESS-INDEX-CONTENTS", 1, 0, false);
    declareFunction(myName, "strategy_initialize_properties", "STRATEGY-INITIALIZE-PROPERTIES", 2, 0, false);
    declareFunction(myName, "default_strategy_initialize_properties", "DEFAULT-STRATEGY-INITIALIZE-PROPERTIES", 2, 0, false);
    declareFunction(myName, "strategy_update_properties", "STRATEGY-UPDATE-PROPERTIES", 2, 0, false);
    declareFunction(myName, "default_strategy_update_properties", "DEFAULT-STRATEGY-UPDATE-PROPERTIES", 2, 0, false);
    declareFunction(myName, "strategy_note_inference_dynamic_properties_updated", "STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
    declareFunction(myName, "default_strategy_note_inference_dynamic_properties_updated", "DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
    declareFunction(myName, "strategy_initial_relevant_strategies", "STRATEGY-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
    declareFunction(myName, "default_strategy_initial_relevant_strategies", "DEFAULT-STRATEGY-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
    declareFunction(myName, "strategy_note_split_tactics_strategically_possible", "STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
    declareFunction(myName, "strategy_note_tactic_discarded", "STRATEGY-NOTE-TACTIC-DISCARDED", 2, 0, false);
    declareFunction(myName, "strategy_note_new_tactic", "STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
    declareFunction(myName, "strategy_no_possible_strategems_for_problemP", "STRATEGY-NO-POSSIBLE-STRATEGEMS-FOR-PROBLEM?", 2, 0, false);
    declareFunction(myName, "strategy_consider_that_problem_could_be_strategically_pending", "STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false);
    declareFunction(myName, "strategy_consider_that_problem_could_be_no_good", "STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-NO-GOOD", 4, 0, false);
    declareFunction(myName, "strategy_reconsider_set_asides", "STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
    declareFunction(myName, "substrategy_do_one_step", "SUBSTRATEGY-DO-ONE-STEP", 1, 0, false);
    declareFunction(myName, "substrategy_peek_next_strategem", "SUBSTRATEGY-PEEK-NEXT-STRATEGEM", 1, 0, false);
    declareFunction(myName, "substrategy_motivate_strategem", "SUBSTRATEGY-MOTIVATE-STRATEGEM", 2, 0, false);
    declareFunction(myName, "substrategy_activate_strategem", "SUBSTRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
    declareFunction(myName, "substrategy_link_head_motivatedP", "SUBSTRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
    declareFunction(myName, "substrategy_reconsider_split_set_asides", "SUBSTRATEGY-RECONSIDER-SPLIT-SET-ASIDES", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_tactician_file() {
    $strategy_auto_prune_threshold$ = defparameter("*STRATEGY-AUTO-PRUNE-THRESHOLD*", NIL);
    $strategy_auto_prune_step_count$ = defvar("*STRATEGY-AUTO-PRUNE-STEP-COUNT*", ZERO_INTEGER);
    $strategy_sort_strategy$ = defparameter("*STRATEGY-SORT-STRATEGY*", NIL);
    $strategy_sort_predicate$ = defparameter("*STRATEGY-SORT-PREDICATE*", NIL);
    $sufficiently_good_tactic_productivity_threshold$ = deflexical("*SUFFICIENTLY-GOOD-TACTIC-PRODUCTIVITY-THRESHOLD*", TEN_INTEGER);
    $default_early_removal_productivity_limit$ = defvar("*DEFAULT-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(backward.$transformation_early_removal_threshold$.getDynamicValue()));
    $set_aside_non_continuable_implies_throw_awayP$ = defparameter("*SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY?*", T);
    $better_term_chosen_handlingP$ = defvar("*BETTER-TERM-CHOSEN-HANDLING?*", T);
    $better_backchain_forbidden_when_unbound_in_arg_handlingP$ = defvar("*BETTER-BACKCHAIN-FORBIDDEN-WHEN-UNBOUND-IN-ARG-HANDLING?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_inference_tactician_file() {
    // CVS_ID("Id: inference-tactician.lisp 128924 2009-10-07 17:48:12Z pace ");
    utilities_macros.note_funcall_helper_function($sym5$STRATEGY_SORT_PREDICATE_);
    utilities_macros.note_funcall_helper_function($sym6$TACTIC_STRATEGIC_PRODUCTIVITY__);
    utilities_macros.note_funcall_helper_function($sym7$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
    access_macros.register_macro_helper($sym25$PROBLEM_MAXIMAL_SUBSUMING_MULTI_FOCAL_LITERAL_JOIN_ORDERED_TACTIC, $sym28$DO_PROBLEM_UNSUBSUMED_CONNECTED_CONJUNCTION_TACTICS);
    access_macros.register_macro_helper($sym27$SOME_SUBSUMING_JOIN_ORDERED_TACTIC_, $sym28$DO_PROBLEM_UNSUBSUMED_CONNECTED_CONJUNCTION_TACTICS);
    utilities_macros.note_funcall_helper_function($sym33$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_WORSE_);
    utilities_macros.note_funcall_helper_function($sym37$TACTIC_PRODUCTIVITY_HIGHER_);
    utilities_macros.note_funcall_helper_function($sym36$TACTIC_PRODUCTIVITY_LOWER_);
    utilities_macros.note_funcall_helper_function($sym38$TACTIC_PRODUCTIVITY_SUFFICIENTLY_GOOD_);
    utilities_macros.note_funcall_helper_function($sym61$DEFAULT_STRATEGY_INITIALIZE_PROPERTIES);
    utilities_macros.note_funcall_helper_function($sym63$DEFAULT_STRATEGY_UPDATE_PROPERTIES);
    utilities_macros.note_funcall_helper_function($sym65$DEFAULT_STRATEGY_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$DO_ONE_STEP = makeKeyword("DO-ONE-STEP");
  public static final SubLSymbol $kw1$DONE_ = makeKeyword("DONE?");
  public static final SubLSymbol $kw2$POSSIBLY_ACTIVATE_PROBLEM = makeKeyword("POSSIBLY-ACTIVATE-PROBLEM");
  public static final SubLSymbol $kw3$NEW_ARGUMENT_LINK = makeKeyword("NEW-ARGUMENT-LINK");
  public static final SubLSymbol $sym4$STRATEGY_P = makeSymbol("STRATEGY-P");
  public static final SubLSymbol $sym5$STRATEGY_SORT_PREDICATE_ = makeSymbol("STRATEGY-SORT-PREDICATE?");
  public static final SubLSymbol $sym6$TACTIC_STRATEGIC_PRODUCTIVITY__ = makeSymbol("TACTIC-STRATEGIC-PRODUCTIVITY-<");
  public static final SubLSymbol $sym7$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ = makeSymbol("LOGICAL-TACTIC-BETTER-WRT-REMOVAL?");
  public static final SubLSymbol $kw8$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLList $list9 = list(list(makeSymbol("TACTIC-VAR"), makeSymbol("PROBLEM"), makeSymbol("STRATEGIC-CONTEXT"), makeSymbol("&KEY"), makeSymbol("STATUS"), makeSymbol("HL-MODULE"), makeSymbol("TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list10 = list(makeKeyword("STATUS"), makeKeyword("HL-MODULE"), makeKeyword("TYPE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw11$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw12$STATUS = makeKeyword("STATUS");
  public static final SubLSymbol $kw13$HL_MODULE = makeKeyword("HL-MODULE");
  public static final SubLSymbol $kw14$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw15$DONE = makeKeyword("DONE");
  public static final SubLSymbol $kw16$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw17$GENERALIZED_REMOVAL = makeKeyword("GENERALIZED-REMOVAL");
  public static final SubLSymbol $kw18$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $sym19$DO_PROBLEM_TACTICS = makeSymbol("DO-PROBLEM-TACTICS");
  public static final SubLSymbol $sym20$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym21$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");
  public static final SubLSymbol $sym22$TYPE_VAR = makeUninternedSymbol("TYPE-VAR");
  public static final SubLSymbol $sym23$SUBSUMING_JOIN_ORDERED_TACTICS = makeUninternedSymbol("SUBSUMING-JOIN-ORDERED-TACTICS");
  public static final SubLSymbol $sym24$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym25$PROBLEM_MAXIMAL_SUBSUMING_MULTI_FOCAL_LITERAL_JOIN_ORDERED_TACTIC = makeSymbol("PROBLEM-MAXIMAL-SUBSUMING-MULTI-FOCAL-LITERAL-JOIN-ORDERED-TACTICS");
  public static final SubLSymbol $sym26$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym27$SOME_SUBSUMING_JOIN_ORDERED_TACTIC_ = makeSymbol("SOME-SUBSUMING-JOIN-ORDERED-TACTIC?");
  public static final SubLSymbol $sym28$DO_PROBLEM_UNSUBSUMED_CONNECTED_CONJUNCTION_TACTICS = makeSymbol("DO-PROBLEM-UNSUBSUMED-CONNECTED-CONJUNCTION-TACTICS");
  public static final SubLSymbol $kw29$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw30$CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
  public static final SubLSymbol $sym31$JOIN_ORDERED_TACTIC_SUBSUMES_ = makeSymbol("JOIN-ORDERED-TACTIC-SUBSUMES?");
  public static final SubLSymbol $sym32$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLSymbol $sym33$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_WORSE_ = makeSymbol("TACTIC-PRODUCTIVITY-AND-COMPLETENESS-WORSE?");
  public static final SubLSymbol $sym34$TACTIC_PRODUCTIVITY_AND_COMPLETENESS_SUFFICIENTLY_GOOD_ = makeSymbol("TACTIC-PRODUCTIVITY-AND-COMPLETENESS-SUFFICIENTLY-GOOD?");
  public static final SubLSymbol $kw35$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $sym36$TACTIC_PRODUCTIVITY_LOWER_ = makeSymbol("TACTIC-PRODUCTIVITY-LOWER?");
  public static final SubLSymbol $sym37$TACTIC_PRODUCTIVITY_HIGHER_ = makeSymbol("TACTIC-PRODUCTIVITY-HIGHER?");
  public static final SubLSymbol $sym38$TACTIC_PRODUCTIVITY_SUFFICIENTLY_GOOD_ = makeSymbol("TACTIC-PRODUCTIVITY-SUFFICIENTLY-GOOD?");
  public static final SubLSymbol $kw39$EARLY_REMOVAL_PRODUCTIVITY_LIMIT = makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $kw40$SKSI = makeKeyword("SKSI");
  public static final SubLSymbol $kw41$QUIESCE = makeKeyword("QUIESCE");
  public static final SubLSymbol $kw42$THROW_AWAY_UNINTERESTING_SET_ASIDES = makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES");
  public static final SubLSymbol $kw43$CONTINUATION_POSSIBLE_ = makeKeyword("CONTINUATION-POSSIBLE?");
  public static final SubLSymbol $kw44$NEG = makeKeyword("NEG");
  public static final SubLList $list45 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $kw46$POS = makeKeyword("POS");
  public static final SubLObject $const47$termChosen = constant_handles.reader_make_constant_shell(makeString("termChosen"));
  public static final SubLSymbol $sym48$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $kw49$RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
  public static final SubLSymbol $kw50$RESTRICTION = makeKeyword("RESTRICTION");
  public static final SubLString $str51$Unexpected_strategem_type__s = makeString("Unexpected strategem type ~s");
  public static final SubLSymbol $kw52$NEGATIVE_INFINITY = makeKeyword("NEGATIVE-INFINITY");
  public static final SubLSymbol $sym53$HAPPINESS__ = makeSymbol("HAPPINESS->");
  public static final SubLSymbol $sym54$HAPPINESS_P = makeSymbol("HAPPINESS-P");
  public static final SubLSymbol $kw55$ERROR = makeKeyword("ERROR");
  public static final SubLString $str56$No_object_stack_for_happiness__S = makeString("No object-stack for happiness ~S");
  public static final SubLString $str57$No_objects_for_happiness__S = makeString("No objects for happiness ~S");
  public static final SubLString $str58$Removed__S_but__S_was_lowest_happ = makeString("Removed ~S but ~S was lowest happiness");
  public static final SubLSymbol $sym59$PROBLEM_HAPPINESS_INDEX_P = makeSymbol("PROBLEM-HAPPINESS-INDEX-P");
  public static final SubLSymbol $kw60$INITIALIZE_PROPERTIES = makeKeyword("INITIALIZE-PROPERTIES");
  public static final SubLSymbol $sym61$DEFAULT_STRATEGY_INITIALIZE_PROPERTIES = makeSymbol("DEFAULT-STRATEGY-INITIALIZE-PROPERTIES");
  public static final SubLSymbol $kw62$UPDATE_PROPERTIES = makeKeyword("UPDATE-PROPERTIES");
  public static final SubLSymbol $sym63$DEFAULT_STRATEGY_UPDATE_PROPERTIES = makeSymbol("DEFAULT-STRATEGY-UPDATE-PROPERTIES");
  public static final SubLSymbol $kw64$INFERENCE_DYNAMIC_PROPERTIES_UPDATED = makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED");
  public static final SubLSymbol $sym65$DEFAULT_STRATEGY_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED = makeSymbol("DEFAULT-STRATEGY-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED");
  public static final SubLSymbol $kw66$INITIAL_RELEVANT_STRATEGIES = makeKeyword("INITIAL-RELEVANT-STRATEGIES");
  public static final SubLSymbol $kw67$SPLIT_TACTICS_POSSIBLE = makeKeyword("SPLIT-TACTICS-POSSIBLE");
  public static final SubLSymbol $kw68$NEW_TACTIC = makeKeyword("NEW-TACTIC");
  public static final SubLSymbol $kw69$PROBLEM_NOTHING_TO_DO_ = makeKeyword("PROBLEM-NOTHING-TO-DO?");
  public static final SubLSymbol $kw70$PROBLEM_COULD_BE_PENDING = makeKeyword("PROBLEM-COULD-BE-PENDING");
  public static final SubLSymbol $kw71$RECONSIDER_SET_ASIDES = makeKeyword("RECONSIDER-SET-ASIDES");
  public static final SubLSymbol $kw72$PEEK_NEXT_STRATEGEM = makeKeyword("PEEK-NEXT-STRATEGEM");
  public static final SubLSymbol $sym73$STRATEGEM_P = makeSymbol("STRATEGEM-P");
  public static final SubLSymbol $kw74$MOTIVATE_STRATEGEM = makeKeyword("MOTIVATE-STRATEGEM");
  public static final SubLSymbol $kw75$ACTIVATE_STRATEGEM = makeKeyword("ACTIVATE-STRATEGEM");
  public static final SubLSymbol $kw76$LINK_HEAD_MOTIVATED_ = makeKeyword("LINK-HEAD-MOTIVATED?");
  public static final SubLSymbol $sym77$SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");
  public static final SubLSymbol $kw78$RECONSIDER_SPLIT_SET_ASIDES = makeKeyword("RECONSIDER-SPLIT-SET-ASIDES");

  //// Initializers

  public void declareFunctions() {
    declare_inference_tactician_file();
  }

  public void initializeVariables() {
    init_inference_tactician_file();
  }

  public void runTopLevelForms() {
    setup_inference_tactician_file();
  }

}
