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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategic_heuristics;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.stacks;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_heuristic_balanced_tactician extends SubLTranslatedFile {

  //// Constructor

  private inference_heuristic_balanced_tactician() {}
  public static final SubLFile me = new inference_heuristic_balanced_tactician();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_heuristic_balanced_tactician";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 3573) 
  public static final SubLObject heuristic_balanced_strategy_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(object))
           && ($kw0$HEURISTIC_BALANCED == inference_datastructures_strategy.strategy_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 3850) 
  public static final SubLObject heuristic_balanced_strategy_initialize(SubLObject strategy) {
    {
      SubLObject removal_index = stacks.create_stack();
      SubLObject new_root_index = queues.create_queue();
      SubLObject transformation_index = inference_tactician.new_problem_happiness_index();
      SubLObject data = inference_balanced_tactician_datastructures.new_balanced_strategy_data(removal_index, new_root_index, transformation_index);
      inference_datastructures_strategy.set_strategy_data(strategy, data);
    }
    return strategy;
  }

  public static final class $heuristic_balanced_strategy_initialize$UnaryFunction extends UnaryFunction {
    public $heuristic_balanced_strategy_initialize$UnaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-INITIALIZE")); }
    public SubLObject processItem(SubLObject arg1) { return heuristic_balanced_strategy_initialize(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 4229) 
  public static final SubLObject heuristic_balanced_strategy_no_strategems_active_wrt_removalP(SubLObject strategy) {
    return stacks.stack_empty_p(inference_balanced_tactician_datastructures.balanced_strategy_removal_strategem_index(strategy));
  }

  public static final class $heuristic_balanced_strategy_no_strategems_active_wrt_removalP$UnaryFunction extends UnaryFunction {
    public $heuristic_balanced_strategy_no_strategems_active_wrt_removalP$UnaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?")); }
    public SubLObject processItem(SubLObject arg1) { return heuristic_balanced_strategy_no_strategems_active_wrt_removalP(arg1); }
  }

  /** @return nil or removal-strategem-p */
  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 4419) 
  public static final SubLObject heuristic_balanced_strategy_peek_strategem_wrt_removal(SubLObject strategy) {
    {
      SubLObject removal_index = inference_balanced_tactician_datastructures.balanced_strategy_removal_strategem_index(strategy);
      if ((NIL == stacks.stack_empty_p(removal_index))) {
        return stacks.stack_peek(removal_index);
      }
    }
    return NIL;
  }

  public static final class $heuristic_balanced_strategy_peek_strategem_wrt_removal$UnaryFunction extends UnaryFunction {
    public $heuristic_balanced_strategy_peek_strategem_wrt_removal$UnaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL")); }
    public SubLObject processItem(SubLObject arg1) { return heuristic_balanced_strategy_peek_strategem_wrt_removal(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 4713) 
  public static final SubLObject heuristic_balanced_strategy_no_new_rootsP(SubLObject strategy) {
    return queues.queue_empty_p(inference_balanced_tactician_datastructures.balanced_strategy_new_root_index(strategy));
  }

  public static final class $heuristic_balanced_strategy_no_new_rootsP$UnaryFunction extends UnaryFunction {
    public $heuristic_balanced_strategy_no_new_rootsP$UnaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-NO-NEW-ROOTS?")); }
    public SubLObject processItem(SubLObject arg1) { return heuristic_balanced_strategy_no_new_rootsP(arg1); }
  }

  /** @return nil or problem-p */
  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 4861) 
  public static final SubLObject heuristic_balanced_strategy_peek_new_root(SubLObject strategy) {
    {
      SubLObject new_root_index = inference_balanced_tactician_datastructures.balanced_strategy_new_root_index(strategy);
      if ((NIL == queues.queue_empty_p(new_root_index))) {
        return queues.queue_peek(new_root_index);
      }
    }
    return NIL;
  }

  public static final class $heuristic_balanced_strategy_peek_new_root$UnaryFunction extends UnaryFunction {
    public $heuristic_balanced_strategy_peek_new_root$UnaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-PEEK-NEW-ROOT")); }
    public SubLObject processItem(SubLObject arg1) { return heuristic_balanced_strategy_peek_new_root(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 5127) 
  public static final SubLObject heuristic_balanced_strategy_chooses_to_throw_away_new_rootP(SubLObject strategy, SubLObject problem) {
    return inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_default_chooses_to_throw_away_new_rootP(strategy, problem);
  }

  public static final class $heuristic_balanced_strategy_chooses_to_throw_away_new_rootP$BinaryFunction extends BinaryFunction {
    public $heuristic_balanced_strategy_chooses_to_throw_away_new_rootP$BinaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return heuristic_balanced_strategy_chooses_to_throw_away_new_rootP(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 5317) 
  public static final SubLObject heuristic_balanced_strategy_no_strategems_active_wrt_transformationP(SubLObject strategy) {
    {
      SubLObject transformation_index = inference_balanced_tactician_datastructures.balanced_strategy_transformation_strategem_index(strategy);
      return inference_tactician.problem_happiness_index_empty_p(transformation_index);
    }
  }

  public static final class $heuristic_balanced_strategy_no_strategems_active_wrt_transformationP$UnaryFunction extends UnaryFunction {
    public $heuristic_balanced_strategy_no_strategems_active_wrt_transformationP$UnaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?")); }
    public SubLObject processItem(SubLObject arg1) { return heuristic_balanced_strategy_no_strategems_active_wrt_transformationP(arg1); }
  }

  /** @return nil or transformation-strategem-p */
  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 5582) 
  public static final SubLObject heuristic_balanced_strategy_peek_strategem_wrt_transformation(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject transformation_index = inference_balanced_tactician_datastructures.balanced_strategy_transformation_strategem_index(strategy);
        SubLObject best_strategem = NIL;
        while ((NIL == best_strategem)) {
          if ((NIL != inference_tactician.problem_happiness_index_empty_p(transformation_index))) {
            return NIL;
          }
          thread.resetMultipleValues();
          {
            SubLObject candidate_strategem = inference_tactician.problem_happiness_index_peek(transformation_index);
            SubLObject expected_happiness = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != inference_tactician.strategem_invalid_p(candidate_strategem))) {
              inference_tactician.problem_happiness_index_next(transformation_index);
            } else {
              {
                SubLObject current_happiness = heuristic_balanced_strategy_transformation_strategem_happiness(strategy, candidate_strategem);
                if ((NIL != inference_tactician.happiness_L(current_happiness, expected_happiness))) {
                  inference_tactician.problem_happiness_index_next(transformation_index);
                  inference_tactician.problem_happiness_index_add(transformation_index, current_happiness, candidate_strategem);
                } else {
                  best_strategem = candidate_strategem;
                }
              }
            }
          }
        }
        return best_strategem;
      }
    }
  }

  public static final class $heuristic_balanced_strategy_peek_strategem_wrt_transformation$UnaryFunction extends UnaryFunction {
    public $heuristic_balanced_strategy_peek_strategem_wrt_transformation$UnaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION")); }
    public SubLObject processItem(SubLObject arg1) { return heuristic_balanced_strategy_peek_strategem_wrt_transformation(arg1); }
  }

  /** @return booleanp; whether REMOVAL-STRATEGEM was successfully added to STRATEGY's removal index */
  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 7332) 
  public static final SubLObject heuristic_balanced_strategy_activate_strategem_wrt_removal(SubLObject strategy, SubLObject removal_strategem) {
    {
      SubLObject removal_index = inference_balanced_tactician_datastructures.balanced_strategy_removal_strategem_index(strategy);
      stacks.stack_push(removal_strategem, removal_index);
      return T;
    }
  }

  public static final class $heuristic_balanced_strategy_activate_strategem_wrt_removal$BinaryFunction extends BinaryFunction {
    public $heuristic_balanced_strategy_activate_strategem_wrt_removal$BinaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return heuristic_balanced_strategy_activate_strategem_wrt_removal(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 7700) 
  public static final SubLObject heuristic_balanced_strategy_pop_strategem_wrt_removal(SubLObject strategy) {
    {
      SubLObject removal_index = inference_balanced_tactician_datastructures.balanced_strategy_removal_strategem_index(strategy);
      return stacks.stack_pop(removal_index);
    }
  }

  public static final class $heuristic_balanced_strategy_pop_strategem_wrt_removal$UnaryFunction extends UnaryFunction {
    public $heuristic_balanced_strategy_pop_strategem_wrt_removal$UnaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-POP-STRATEGEM-WRT-REMOVAL")); }
    public SubLObject processItem(SubLObject arg1) { return heuristic_balanced_strategy_pop_strategem_wrt_removal(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 7907) 
  public static final SubLObject heuristic_balanced_strategy_add_new_root(SubLObject strategy, SubLObject problem) {
    {
      SubLObject new_root_index = inference_balanced_tactician_datastructures.balanced_strategy_new_root_index(strategy);
      queues.enqueue(problem, new_root_index);
      return T;
    }
  }

  public static final class $heuristic_balanced_strategy_add_new_root$BinaryFunction extends BinaryFunction {
    public $heuristic_balanced_strategy_add_new_root$BinaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-ADD-NEW-ROOT")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return heuristic_balanced_strategy_add_new_root(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 8115) 
  public static final SubLObject heuristic_balanced_strategy_pop_new_root(SubLObject strategy) {
    {
      SubLObject new_root_index = inference_balanced_tactician_datastructures.balanced_strategy_new_root_index(strategy);
      return queues.dequeue(new_root_index);
    }
  }

  public static final class $heuristic_balanced_strategy_pop_new_root$UnaryFunction extends UnaryFunction {
    public $heuristic_balanced_strategy_pop_new_root$UnaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-POP-NEW-ROOT")); }
    public SubLObject processItem(SubLObject arg1) { return heuristic_balanced_strategy_pop_new_root(arg1); }
  }

  /** @return booleanp; whether TRANSFORMATION-STRATEGEM was successfully added to STRATEGY's transformation index */
  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 8302) 
  public static final SubLObject heuristic_balanced_strategy_activate_strategem_wrt_transformation(SubLObject strategy, SubLObject transformation_strategem) {
    {
      SubLObject transformation_index = inference_balanced_tactician_datastructures.balanced_strategy_transformation_strategem_index(strategy);
      SubLObject happiness = heuristic_balanced_strategy_transformation_strategem_happiness(strategy, transformation_strategem);
      inference_tactician.problem_happiness_index_add(transformation_index, happiness, transformation_strategem);
      return T;
    }
  }

  public static final class $heuristic_balanced_strategy_activate_strategem_wrt_transformation$BinaryFunction extends BinaryFunction {
    public $heuristic_balanced_strategy_activate_strategem_wrt_transformation$BinaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return heuristic_balanced_strategy_activate_strategem_wrt_transformation(arg1, arg2); }
  }

  /** @return nil or transformation-strategem-p */
  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 8853) 
  public static final SubLObject heuristic_balanced_strategy_pop_strategem_wrt_transformation(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject transformation_index = inference_balanced_tactician_datastructures.balanced_strategy_transformation_strategem_index(strategy);
        thread.resetMultipleValues();
        {
          SubLObject best_strategem = inference_tactician.problem_happiness_index_next(transformation_index);
          SubLObject expected_happiness = thread.secondMultipleValue();
          thread.resetMultipleValues();
          return best_strategem;
        }
      }
    }
  }

  public static final class $heuristic_balanced_strategy_pop_strategem_wrt_transformation$UnaryFunction extends UnaryFunction {
    public $heuristic_balanced_strategy_pop_strategem_wrt_transformation$UnaryFunction() { super(extractFunctionNamed("HEURISTIC-BALANCED-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION")); }
    public SubLObject processItem(SubLObject arg1) { return heuristic_balanced_strategy_pop_strategem_wrt_transformation(arg1); }
  }

  /** The set of heuristics used by the Heuristic Balanced Tactician. */
  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 9301) 
  private static SubLSymbol $heuristic_balanced_tactician_heuristics$ = null;

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 10220) 
  public static final SubLObject heuristic_balanced_tactician_strategic_heuristicP(SubLObject heuristic) {
    return set.set_memberP(heuristic, $heuristic_balanced_tactician_heuristics$.getGlobalValue());
  }

  /** The happiness of doing one specific transformation. */
  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 10443) 
  public static final SubLObject heuristic_balanced_strategy_transformation_tactic_happiness(SubLObject transformation_tactic, SubLObject strategy) {
    checkType(transformation_tactic, $sym27$TRANSFORMATION_TACTIC_P);
    checkType(strategy, $sym10$HEURISTIC_BALANCED_STRATEGY_P);
    return heuristic_balanced_strategy_generic_tactic_happiness(transformation_tactic, strategy);
  }

  /** The happiness of introducing a new root problem. */
  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 10833) 
  public static final SubLObject heuristic_balanced_strategy_transformation_link_happiness(SubLObject transformation_link, SubLObject strategy) {
    checkType(transformation_link, $sym28$TRANSFORMATION_LINK_P);
    checkType(strategy, $sym10$HEURISTIC_BALANCED_STRATEGY_P);
    {
      SubLObject transformation_tactic = inference_worker_transformation.transformation_link_tactic(transformation_link);
      return heuristic_balanced_strategy_transformation_tactic_happiness(transformation_tactic, strategy);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 11803) 
  public static final SubLObject heuristic_balanced_strategy_generic_tactic_happiness(SubLObject tactic, SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(tactic, $sym30$TACTIC_P);
      checkType(strategy, $sym10$HEURISTIC_BALANCED_STRATEGY_P);
      {
        SubLObject aggregate_happiness = ZERO_INTEGER;
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(inference_strategic_heuristics.strategic_heuristic_index()));
        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
          thread.resetMultipleValues();
          {
            SubLObject heuristic = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject function = inference_strategic_heuristics.strategic_heuristic_function(heuristic);
              SubLObject scaling_factor = inference_strategic_heuristics.strategic_heuristic_scaling_factor(heuristic);
              SubLObject tactic_type = inference_strategic_heuristics.strategic_heuristic_tactic_type(heuristic);
              if ((NIL != inference_strategic_heuristics.do_strategic_heuristics_tactic_match_p(tactic, tactic_type))) {
                if ((NIL != heuristic_balanced_tactician_strategic_heuristicP(heuristic))) {
                  {
                    SubLObject raw_happiness = happiness_funcall(function, strategy, tactic);
                    SubLObject scaled_happiness = number_utilities.potentially_infinite_integer_times(raw_happiness, scaling_factor);
                    aggregate_happiness = number_utilities.potentially_infinite_integer_plus(aggregate_happiness, scaled_happiness);
                  }
                }
              }
            }
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return aggregate_happiness;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 12446) 
  public static final SubLObject happiness_funcall(SubLObject function, SubLObject strategy, SubLObject tactic) {
    return Functions.funcall(function, strategy, tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-heuristic-balanced-tactician.lisp", position = 12552) 
  public static final SubLObject heuristic_balanced_strategy_transformation_strategem_happiness(SubLObject strategy, SubLObject strategem) {
    checkType(strategy, $sym10$HEURISTIC_BALANCED_STRATEGY_P);
    checkType(strategem, $sym31$STRATEGEM_P);
    if ((NIL != inference_worker_transformation.transformation_tactic_p(strategem))) {
      {
        SubLObject transformation_tactic = strategem;
        return heuristic_balanced_strategy_transformation_tactic_happiness(transformation_tactic, strategy);
      }
    } else if ((NIL != inference_worker.logical_tactic_p(strategem))) {
      {
        SubLObject logical_tactic = strategem;
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36531");
      }
    } else if ((NIL != inference_worker_transformation.transformation_link_p(strategem))) {
      {
        SubLObject transformation_link = strategem;
        return heuristic_balanced_strategy_transformation_link_happiness(transformation_link, strategy);
      }
    } else {
      return Errors.error($str32$_S_is_not_a_transformation_strate, strategem);
    }
  }

  public static final SubLObject declare_inference_heuristic_balanced_tactician_file() {
    declareFunction(myName, "heuristic_balanced_strategy_p", "HEURISTIC-BALANCED-STRATEGY-P", 1, 0, false);
    declareFunction(myName, "heuristic_balanced_strategy_initialize", "HEURISTIC-BALANCED-STRATEGY-INITIALIZE", 1, 0, false); new $heuristic_balanced_strategy_initialize$UnaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_no_strategems_active_wrt_removalP", "HEURISTIC-BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?", 1, 0, false); new $heuristic_balanced_strategy_no_strategems_active_wrt_removalP$UnaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_peek_strategem_wrt_removal", "HEURISTIC-BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL", 1, 0, false); new $heuristic_balanced_strategy_peek_strategem_wrt_removal$UnaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_no_new_rootsP", "HEURISTIC-BALANCED-STRATEGY-NO-NEW-ROOTS?", 1, 0, false); new $heuristic_balanced_strategy_no_new_rootsP$UnaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_peek_new_root", "HEURISTIC-BALANCED-STRATEGY-PEEK-NEW-ROOT", 1, 0, false); new $heuristic_balanced_strategy_peek_new_root$UnaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_chooses_to_throw_away_new_rootP", "HEURISTIC-BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?", 2, 0, false); new $heuristic_balanced_strategy_chooses_to_throw_away_new_rootP$BinaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_no_strategems_active_wrt_transformationP", "HEURISTIC-BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?", 1, 0, false); new $heuristic_balanced_strategy_no_strategems_active_wrt_transformationP$UnaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_peek_strategem_wrt_transformation", "HEURISTIC-BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false); new $heuristic_balanced_strategy_peek_strategem_wrt_transformation$UnaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_current_contents", "HEURISTIC-BALANCED-STRATEGY-CURRENT-CONTENTS", 1, 0, false);
    declareFunction(myName, "heuristic_balanced_strategy_activate_strategem_wrt_removal", "HEURISTIC-BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL", 2, 0, false); new $heuristic_balanced_strategy_activate_strategem_wrt_removal$BinaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_pop_strategem_wrt_removal", "HEURISTIC-BALANCED-STRATEGY-POP-STRATEGEM-WRT-REMOVAL", 1, 0, false); new $heuristic_balanced_strategy_pop_strategem_wrt_removal$UnaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_add_new_root", "HEURISTIC-BALANCED-STRATEGY-ADD-NEW-ROOT", 2, 0, false); new $heuristic_balanced_strategy_add_new_root$BinaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_pop_new_root", "HEURISTIC-BALANCED-STRATEGY-POP-NEW-ROOT", 1, 0, false); new $heuristic_balanced_strategy_pop_new_root$UnaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_activate_strategem_wrt_transformation", "HEURISTIC-BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION", 2, 0, false); new $heuristic_balanced_strategy_activate_strategem_wrt_transformation$BinaryFunction();
    declareFunction(myName, "heuristic_balanced_strategy_pop_strategem_wrt_transformation", "HEURISTIC-BALANCED-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false); new $heuristic_balanced_strategy_pop_strategem_wrt_transformation$UnaryFunction();
    declareMacro(myName, "do_heuristic_balanced_tactician_strategic_heuristics", "DO-HEURISTIC-BALANCED-TACTICIAN-STRATEGIC-HEURISTICS");
    declareFunction(myName, "heuristic_balanced_tactician_strategic_heuristicP", "HEURISTIC-BALANCED-TACTICIAN-STRATEGIC-HEURISTIC?", 1, 0, false);
    declareFunction(myName, "heuristic_balanced_strategy_transformation_tactic_happiness", "HEURISTIC-BALANCED-STRATEGY-TRANSFORMATION-TACTIC-HAPPINESS", 2, 0, false);
    declareFunction(myName, "heuristic_balanced_strategy_transformation_link_happiness", "HEURISTIC-BALANCED-STRATEGY-TRANSFORMATION-LINK-HAPPINESS", 2, 0, false);
    declareFunction(myName, "heuristic_balanced_strategy_logical_tactic_transformation_happiness", "HEURISTIC-BALANCED-STRATEGY-LOGICAL-TACTIC-TRANSFORMATION-HAPPINESS", 2, 0, false);
    declareFunction(myName, "heuristic_balanced_strategy_generic_tactic_happiness", "HEURISTIC-BALANCED-STRATEGY-GENERIC-TACTIC-HAPPINESS", 2, 0, false);
    declareFunction(myName, "happiness_funcall", "HAPPINESS-FUNCALL", 3, 0, false);
    declareFunction(myName, "heuristic_balanced_strategy_transformation_strategem_happiness", "HEURISTIC-BALANCED-STRATEGY-TRANSFORMATION-STRATEGEM-HAPPINESS", 2, 0, false);
    declareFunction(myName, "heuristic_balanced_strategy_happiness_table", "HEURISTIC-BALANCED-STRATEGY-HAPPINESS-TABLE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_heuristic_balanced_tactician_file() {
    $heuristic_balanced_tactician_heuristics$ = deflexical("*HEURISTIC-BALANCED-TACTICIAN-HEURISTICS*", set_utilities.construct_set_from_list($list17, Symbols.symbol_function(EQ), UNPROVIDED));
    return NIL;
  }

  public static final SubLObject setup_inference_heuristic_balanced_tactician_file() {
    // CVS_ID("Id: inference-heuristic-balanced-tactician.lisp 128006 2009-06-16 15:51:35Z pace ");
    inference_tactician.inference_strategy_type($kw0$HEURISTIC_BALANCED, $list1);
    utilities_macros.note_funcall_helper_function($sym2$HEURISTIC_BALANCED_STRATEGY_INITIALIZE);
    utilities_macros.note_funcall_helper_function($sym3$HEURISTIC_BALANCED_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_REMOVAL_);
    utilities_macros.note_funcall_helper_function($sym4$HEURISTIC_BALANCED_STRATEGY_PEEK_STRATEGEM_WRT_REMOVAL);
    utilities_macros.note_funcall_helper_function($sym5$HEURISTIC_BALANCED_STRATEGY_NO_NEW_ROOTS_);
    utilities_macros.note_funcall_helper_function($sym6$HEURISTIC_BALANCED_STRATEGY_PEEK_NEW_ROOT);
    utilities_macros.note_funcall_helper_function($sym7$HEURISTIC_BALANCED_STRATEGY_CHOOSES_TO_THROW_AWAY_NEW_ROOT_);
    utilities_macros.note_funcall_helper_function($sym8$HEURISTIC_BALANCED_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_TRANSFORMATI);
    utilities_macros.note_funcall_helper_function($sym9$HEURISTIC_BALANCED_STRATEGY_PEEK_STRATEGEM_WRT_TRANSFORMATION);
    utilities_macros.note_funcall_helper_function($sym11$HEURISTIC_BALANCED_STRATEGY_ACTIVATE_STRATEGEM_WRT_REMOVAL);
    utilities_macros.note_funcall_helper_function($sym12$HEURISTIC_BALANCED_STRATEGY_POP_STRATEGEM_WRT_REMOVAL);
    utilities_macros.note_funcall_helper_function($sym13$HEURISTIC_BALANCED_STRATEGY_ADD_NEW_ROOT);
    utilities_macros.note_funcall_helper_function($sym14$HEURISTIC_BALANCED_STRATEGY_POP_NEW_ROOT);
    utilities_macros.note_funcall_helper_function($sym15$HEURISTIC_BALANCED_STRATEGY_ACTIVATE_STRATEGEM_WRT_TRANSFORMATION);
    utilities_macros.note_funcall_helper_function($sym16$HEURISTIC_BALANCED_STRATEGY_POP_STRATEGEM_WRT_TRANSFORMATION);
    access_macros.register_macro_helper($sym25$HEURISTIC_BALANCED_TACTICIAN_STRATEGIC_HEURISTIC_, $sym26$DO_HEURISTIC_BALANCED_TACTICIAN_STRATEGIC_HEURISTICS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$HEURISTIC_BALANCED = makeKeyword("HEURISTIC-BALANCED");
  public static final SubLList $list1 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Heuristic Balanced Search"), makeKeyword("COMMENT"), makeString("A balanced Tactician type which uses a depth-first stack for removal problems\nand a linear combination of heuristics to choose which transformation-motivated tactics to execute."), makeKeyword("CONSTRUCTOR"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("BALANCED-STRATEGY-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("BALANCED-STRATEGY-DO-ONE-STEP"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("SELECT-BEST-STRATEGEM"), makeSymbol("BALANCED-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("BALANCED-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("QUIESCE"), makeSymbol("BALANCED-STRATEGY-QUIESCE"), makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeSymbol("BALANCED-STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("BALANCED-STRATEGY-NOTE-ARGUMENT-LINK-ADDED"), makeKeyword("NEW-TACTIC"), makeSymbol("BALANCED-STRATEGY-NOTE-NEW-TACTIC"), makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeSymbol("BALANCED-STRATEGY-CATEGORIZE-STRATEGEMS-WRT-REMOVAL"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("BALANCED-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("BALANCED-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-TOTALLY-PENDING"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("BALANCED-STRATEGY-PROBLEM-TOTALLY-PENDING?"), makeKeyword("PEEK-REMOVAL-STRATEGEM"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL"), makeKeyword("ACTIVATE-REMOVAL-STRATEGEM"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL"), makeKeyword("POP-REMOVAL-STRATEGEM"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-POP-STRATEGEM-WRT-REMOVAL"), makeKeyword("NO-ACTIVE-REMOVAL-STRATEGEMS"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?"), makeKeyword("PEEK-NEW-ROOT"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-PEEK-NEW-ROOT"), makeKeyword("ACTIVATE-NEW-ROOT"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-ADD-NEW-ROOT"), makeKeyword("POP-NEW-ROOT"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-POP-NEW-ROOT"), makeKeyword("NO-NEW-ROOTS"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-NO-NEW-ROOTS?"), makeKeyword("THROW-AWAY-NEW-ROOT"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?"), makeKeyword("PEEK-TRANSFORMATION-STRATEGEM"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION"), makeKeyword("ACTIVATE-TRANSFORMATION-STRATEGEM"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION"), makeKeyword("POP-TRANSFORMATION-STRATEGEM"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION"), makeKeyword("NO-ACTIVE-TRANSFORMATION-STRATEGEMS"), makeSymbol("HEURISTIC-BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?")});
  public static final SubLSymbol $sym2$HEURISTIC_BALANCED_STRATEGY_INITIALIZE = makeSymbol("HEURISTIC-BALANCED-STRATEGY-INITIALIZE");
  public static final SubLSymbol $sym3$HEURISTIC_BALANCED_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_REMOVAL_ = makeSymbol("HEURISTIC-BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?");
  public static final SubLSymbol $sym4$HEURISTIC_BALANCED_STRATEGY_PEEK_STRATEGEM_WRT_REMOVAL = makeSymbol("HEURISTIC-BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL");
  public static final SubLSymbol $sym5$HEURISTIC_BALANCED_STRATEGY_NO_NEW_ROOTS_ = makeSymbol("HEURISTIC-BALANCED-STRATEGY-NO-NEW-ROOTS?");
  public static final SubLSymbol $sym6$HEURISTIC_BALANCED_STRATEGY_PEEK_NEW_ROOT = makeSymbol("HEURISTIC-BALANCED-STRATEGY-PEEK-NEW-ROOT");
  public static final SubLSymbol $sym7$HEURISTIC_BALANCED_STRATEGY_CHOOSES_TO_THROW_AWAY_NEW_ROOT_ = makeSymbol("HEURISTIC-BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?");
  public static final SubLSymbol $sym8$HEURISTIC_BALANCED_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_TRANSFORMATI = makeSymbol("HEURISTIC-BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?");
  public static final SubLSymbol $sym9$HEURISTIC_BALANCED_STRATEGY_PEEK_STRATEGEM_WRT_TRANSFORMATION = makeSymbol("HEURISTIC-BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym10$HEURISTIC_BALANCED_STRATEGY_P = makeSymbol("HEURISTIC-BALANCED-STRATEGY-P");
  public static final SubLSymbol $sym11$HEURISTIC_BALANCED_STRATEGY_ACTIVATE_STRATEGEM_WRT_REMOVAL = makeSymbol("HEURISTIC-BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL");
  public static final SubLSymbol $sym12$HEURISTIC_BALANCED_STRATEGY_POP_STRATEGEM_WRT_REMOVAL = makeSymbol("HEURISTIC-BALANCED-STRATEGY-POP-STRATEGEM-WRT-REMOVAL");
  public static final SubLSymbol $sym13$HEURISTIC_BALANCED_STRATEGY_ADD_NEW_ROOT = makeSymbol("HEURISTIC-BALANCED-STRATEGY-ADD-NEW-ROOT");
  public static final SubLSymbol $sym14$HEURISTIC_BALANCED_STRATEGY_POP_NEW_ROOT = makeSymbol("HEURISTIC-BALANCED-STRATEGY-POP-NEW-ROOT");
  public static final SubLSymbol $sym15$HEURISTIC_BALANCED_STRATEGY_ACTIVATE_STRATEGEM_WRT_TRANSFORMATION = makeSymbol("HEURISTIC-BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym16$HEURISTIC_BALANCED_STRATEGY_POP_STRATEGEM_WRT_TRANSFORMATION = makeSymbol("HEURISTIC-BALANCED-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION");
  public static final SubLList $list17 = list(new SubLObject[] {makeKeyword("SHALLOW-AND-CHEAP"), makeKeyword("COMPLETENESS"), makeKeyword("OCCAMS-RAZOR"), makeKeyword("MAGIC-WAND"), makeKeyword("BACKTRACKING-CONSIDERED-HARMFUL"), makeKeyword("BACKCHAIN-REQUIRED"), makeKeyword("RULE-A-PRIORI-UTILITY"), makeKeyword("RELEVANT-TERM"), makeKeyword("RULE-HISTORICAL-UTILITY"), makeKeyword("LITERAL-COUNT"), makeKeyword("RULE-LITERAL-COUNT"), makeKeyword("SKOLEM-COUNT")});
  public static final SubLList $list18 = list(list(makeSymbol("HEURISTIC"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("&KEY"), makeSymbol("TACTIC"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list19 = list(makeKeyword("TACTIC"), makeKeyword("DONE"));
  public static final SubLSymbol $kw20$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw21$TACTIC = makeKeyword("TACTIC");
  public static final SubLSymbol $kw22$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym23$DO_STRATEGIC_HEURISTICS = makeSymbol("DO-STRATEGIC-HEURISTICS");
  public static final SubLSymbol $sym24$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym25$HEURISTIC_BALANCED_TACTICIAN_STRATEGIC_HEURISTIC_ = makeSymbol("HEURISTIC-BALANCED-TACTICIAN-STRATEGIC-HEURISTIC?");
  public static final SubLSymbol $sym26$DO_HEURISTIC_BALANCED_TACTICIAN_STRATEGIC_HEURISTICS = makeSymbol("DO-HEURISTIC-BALANCED-TACTICIAN-STRATEGIC-HEURISTICS");
  public static final SubLSymbol $sym27$TRANSFORMATION_TACTIC_P = makeSymbol("TRANSFORMATION-TACTIC-P");
  public static final SubLSymbol $sym28$TRANSFORMATION_LINK_P = makeSymbol("TRANSFORMATION-LINK-P");
  public static final SubLSymbol $sym29$LOGICAL_TACTIC_P = makeSymbol("LOGICAL-TACTIC-P");
  public static final SubLSymbol $sym30$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLSymbol $sym31$STRATEGEM_P = makeSymbol("STRATEGEM-P");
  public static final SubLString $str32$_S_is_not_a_transformation_strate = makeString("~S is not a transformation strategem");

  //// Initializers

  public void declareFunctions() {
    declare_inference_heuristic_balanced_tactician_file();
  }

  public void initializeVariables() {
    init_inference_heuristic_balanced_tactician_file();
  }

  public void runTopLevelForms() {
    setup_inference_heuristic_balanced_tactician_file();
  }

}
