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
import com.cyc.cycjava.cycl.inference.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.inference.harness.balancing_tactician;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_analysis;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.transformation_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_strategic_heuristics extends SubLTranslatedFile {

  //// Constructor

  private inference_strategic_heuristics() {}
  public static final SubLFile me = new inference_strategic_heuristics();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_strategic_heuristics";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 1296) 
  private static SubLSymbol $strategic_heuristic_index$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 1405) 
  public static final SubLObject strategic_heuristic_index() {
    return $strategic_heuristic_index$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 2147) 
  public static final SubLObject do_strategic_heuristics_tactic_match_p(SubLObject tactic, SubLObject tactic_type) {
    return makeBoolean(((NIL == tactic)
          || (NIL != inference_datastructures_problem.tactic_matches_type_specP(tactic, tactic_type))));
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 2345) 
  public static final SubLObject new_strategic_heuristic_data(SubLObject function, SubLObject scaling_factor, SubLObject pretty_name, SubLObject comment, SubLObject tactic_type) {
    return list(function, scaling_factor, pretty_name, comment, tactic_type);
  }

  /** @param HEURISTIC keywordp; a token for the heuristic being declared.
   @param FUNCTION symbolp; a function with the arglist (strategy tactic) which returns a happiness-p.
   @param SCALING-FACTOR potentially-infinite-integer-p; how important this heuristic is
     relative to the other heuristics.  A relative weight.
   @param TACTIC-TYPE tactic-type-spec-p; the type of tactics HEURISTIC applies to.
   The happiness returned by FUNCTION should be between -100 and 100.  (although some extant heuristics disobey this.)
   -100 = strongly disfavor (estimated 0% chance of success)
      0 = agnostic          (estimated A% chance of success, i.e. random chance)
    100 = strongly favor    (estimated 100% chance of success)
   'A%' in the above guidelines is the probability that executing an arbitrary tactic will lead to success.
   The happiness should be proportional to the estimated likelihood, according to this heuristic,
   that executing TACTIC will lead toward success (i.e. proofs).  For example, if A were 10%, and a tactic that
   is guessed to be 20% likely to succeed yields a happiness of 25, then a tactic that is guessed to be 30% likely
   to succeed should have a happiness of 50.  It's okay for it to scale off more steeply at 100% because success is relatively rare. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 2521) 
  public static final SubLObject declare_strategic_heuristic(SubLObject heuristic, SubLObject plist) {
    checkType(heuristic, $sym17$KEYWORDP);
    {
      SubLObject datum = plist;
      SubLObject current = datum;
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current;
      SubLObject bad = NIL;
      SubLObject current_2 = NIL;
      for (; (NIL != rest); ) {
        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list18);
        current_2 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list18);
        if ((NIL == conses_high.member(current_2, $list19, UNPROVIDED, UNPROVIDED))) {
          bad = T;
        }
        if ((current_2 == $kw5$ALLOW_OTHER_KEYS)) {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if (((NIL != bad)
           && (NIL == allow_other_keys_p))) {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list18);
      }
      {
        SubLObject function_tail = cdestructuring_bind.property_list_member($kw20$FUNCTION, current);
        SubLObject function = ((NIL != function_tail) ? ((SubLObject) conses_high.cadr(function_tail)) : NIL);
        SubLObject scaling_factor_tail = cdestructuring_bind.property_list_member($kw21$SCALING_FACTOR, current);
        SubLObject scaling_factor = ((NIL != scaling_factor_tail) ? ((SubLObject) conses_high.cadr(scaling_factor_tail)) : NIL);
        SubLObject pretty_name_tail = cdestructuring_bind.property_list_member($kw22$PRETTY_NAME, current);
        SubLObject pretty_name = ((NIL != pretty_name_tail) ? ((SubLObject) conses_high.cadr(pretty_name_tail)) : NIL);
        SubLObject comment_tail = cdestructuring_bind.property_list_member($kw23$COMMENT, current);
        SubLObject comment = ((NIL != comment_tail) ? ((SubLObject) conses_high.cadr(comment_tail)) : NIL);
        SubLObject tactic_type_tail = cdestructuring_bind.property_list_member($kw24$TACTIC_TYPE, current);
        SubLObject tactic_type = ((NIL != tactic_type_tail) ? ((SubLObject) conses_high.cadr(tactic_type_tail)) : NIL);
        SubLObject data = new_strategic_heuristic_data(function, scaling_factor, pretty_name, comment, tactic_type);
        dictionary.dictionary_enter($strategic_heuristic_index$.getGlobalValue(), heuristic, data);
      }
    }
    return heuristic;
  }

  /** @return nil or symbolp */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 4345) 
  public static final SubLObject strategic_heuristic_function(SubLObject heuristic) {
    {
      SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
      if ((NIL != data)) {
        return data.first();
      }
    }
    return NIL;
  }

  /** property-list-p; a plist of overriding scaling factors for heuristics.
   If any of these are specified, they override the declared scaling factors.
   The indicators are the heuristics, e.g. :occams-razor, and the values are integers. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 4566) 
  private static SubLSymbol $overriding_strategic_heuristic_scaling_factors$ = null;

  /** @return nil or potentially-infinite-integer-p */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 4877) 
  public static final SubLObject strategic_heuristic_scaling_factor(SubLObject heuristic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject overriding_scaling_factor = conses_high.getf($overriding_strategic_heuristic_scaling_factors$.getDynamicValue(thread), heuristic, NIL);
        if ((NIL != overriding_scaling_factor)) {
          return overriding_scaling_factor;
        } else {
          {
            SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
            if ((NIL != data)) {
              return conses_high.second(data);
            }
          }
        }
      }
      return NIL;
    }
  }

  /** @return nil or tactic-type-spec-p; the type of tactic that HEURISTIC applies to */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 6027) 
  public static final SubLObject strategic_heuristic_tactic_type(SubLObject heuristic) {
    {
      SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
      if ((NIL != data)) {
        return conses_high.fifth(data);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 6880) 
  public static final SubLObject strategic_heuristic_shallow_and_cheap(SubLObject strategy, SubLObject content_tactic) {
    {
      SubLObject productivity = productivity_for_shallow_and_cheap_heuristic(content_tactic, strategy);
      SubLObject uselessness = tactic_strategic_uselessness_based_on_proof_depth(content_tactic, strategy);
      SubLObject unhappiness = ((ZERO_INTEGER.eql(productivity)
           && (NIL != number_utilities.positive_infinity_p(uselessness))) ? ((SubLObject) number_utilities.positive_infinity()) : inference_datastructures_enumerated_types.productivity_times_number(productivity, uselessness));
      SubLObject happiness = inference_datastructures_enumerated_types.productivity_times_number(unhappiness, MINUS_ONE_INTEGER);
      return happiness;
    }
  }

  public static final class $strategic_heuristic_shallow_and_cheap$BinaryFunction extends BinaryFunction {
    public $strategic_heuristic_shallow_and_cheap$BinaryFunction() { super(extractFunctionNamed("STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return strategic_heuristic_shallow_and_cheap(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 7554) 
  public static final SubLObject productivity_for_shallow_and_cheap_heuristic(SubLObject content_tactic, SubLObject strategy) {
    if ((NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy))) {
      strategy = Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33101");
    }
    return inference_datastructures_strategy.tactic_strategic_productivity(content_tactic, strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 8039) 
  public static final SubLObject tactic_strategic_uselessness_based_on_proof_depth(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
      SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
      SubLObject min_proof_depth = inference_datastructures_problem.problem_min_proof_depth(problem, inference);
      if (($kw28$UNDETERMINED == min_proof_depth)) {
        return number_utilities.positive_infinity();
      }
      return tactic_strategic_uselessness_based_on_proof_depth_math_memoized(min_proof_depth);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 8607) 
  private static SubLSymbol $tactic_strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 8607) 
  public static final SubLObject tactic_strategic_uselessness_based_on_proof_depth_math_memoized_internal(SubLObject min_proof_depth) {
    return Numbers.max(ONE_INTEGER, Numbers.round(Numbers.log(number_utilities.f_1X(min_proof_depth), TWO_INTEGER), UNPROVIDED));
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 8607) 
  public static final SubLObject tactic_strategic_uselessness_based_on_proof_depth_math_memoized(SubLObject min_proof_depth) {
    {
      SubLObject caching_state = $tactic_strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym29$TACTIC_STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED, $sym30$_TACTIC_STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
      }
      {
        SubLObject results = memoization_state.caching_state_lookup(caching_state, min_proof_depth, $kw31$_MEMOIZED_ITEM_NOT_FOUND_);
        if ((results == $kw31$_MEMOIZED_ITEM_NOT_FOUND_)) {
          results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(tactic_strategic_uselessness_based_on_proof_depth_math_memoized_internal(min_proof_depth)));
          memoization_state.caching_state_put(caching_state, min_proof_depth, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 9313) 
  public static final SubLObject strategic_heuristic_completeness(SubLObject strategy, SubLObject content_tactic) {
    if (((NIL != inference_worker.content_tactic_p(content_tactic))
         && ($kw34$COMPLETE == inference_datastructures_strategy.tactic_strategic_completeness(content_tactic, strategy)))) {
      return ONE_INTEGER;
    } else {
      return ZERO_INTEGER;
    }
  }

  public static final class $strategic_heuristic_completeness$BinaryFunction extends BinaryFunction {
    public $strategic_heuristic_completeness$BinaryFunction() { super(extractFunctionNamed("STRATEGIC-HEURISTIC-COMPLETENESS")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return strategic_heuristic_completeness(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 9901) 
  private static SubLSymbol $strategic_heuristic_occams_razor_table$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 10229) 
  private static SubLSymbol $strategic_heuristic_occams_razor_table_default$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 10312) 
  public static final SubLObject strategic_heuristic_occams_razor(SubLObject strategy, SubLObject content_tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        SubLObject happiness = ZERO_INTEGER;
        if ((NIL != inference_strategist.inference_permits_transformationP(inference))) {
          {
            SubLObject _prev_bind_0 = inference_datastructures_problem.$transformation_depth_computation$.currentBinding(thread);
            try {
              inference_datastructures_problem.$transformation_depth_computation$.bind($kw40$INTUITIVE, thread);
              {
                SubLObject problem = inference_datastructures_tactic.tactic_problem(content_tactic);
                SubLObject min_depth = inference_datastructures_problem.problem_min_transformation_depth(problem, inference);
                if ((($kw28$UNDETERMINED == min_depth)
                    || (NIL == min_depth))) {
                  if ((NIL != inference_worker_transformation.transformation_tactic_p(content_tactic))) {
                    happiness = $strategic_heuristic_occams_razor_table_default$.getGlobalValue();
                  }
                } else {
                  if ((NIL != inference_worker_transformation.transformation_tactic_p(content_tactic))) {
                    min_depth = Numbers.add(min_depth, ONE_INTEGER);
                  }
                  happiness = numeric_table_lookup(min_depth, $strategic_heuristic_occams_razor_table$.getGlobalValue(), UNPROVIDED);
                }
              }
            } finally {
              inference_datastructures_problem.$transformation_depth_computation$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return happiness;
      }
    }
  }

  public static final class $strategic_heuristic_occams_razor$BinaryFunction extends BinaryFunction {
    public $strategic_heuristic_occams_razor$BinaryFunction() { super(extractFunctionNamed("STRATEGIC-HEURISTIC-OCCAMS-RAZOR")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return strategic_heuristic_occams_razor(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 11782) 
  public static final SubLObject strategic_heuristic_magic_wand(SubLObject strategy, SubLObject generalized_removal_tactic) {
    if (((NIL != inference_worker_removal.generalized_removal_tactic_p(generalized_removal_tactic))
         && ($kw44$INCOMPLETE == inference_datastructures_strategy.tactic_strategic_completeness(generalized_removal_tactic, strategy))
         && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36507")))) {
      return $int39$_100;
    } else {
      return ZERO_INTEGER;
    }
  }

  public static final class $strategic_heuristic_magic_wand$BinaryFunction extends BinaryFunction {
    public $strategic_heuristic_magic_wand$BinaryFunction() { super(extractFunctionNamed("STRATEGIC-HEURISTIC-MAGIC-WAND")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return strategic_heuristic_magic_wand(arg1, arg2); }
  }

  /** Temporary control parameter */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 12170) 
  private static SubLSymbol $backtracking_considered_harmfulP$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 12886) 
  private static SubLSymbol $strategic_heuristic_backtracking_table$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 13045) 
  private static SubLSymbol $strategic_heuristic_backtracking_table_default$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 13709) 
  private static SubLSymbol $early_removal_productivity_threshold$ = null;

  /** @return happiness-p; return 100 iff TRANSFORMATION-TACTIC transforms a 
   single literal problem with a #$backchainRequired predicate.  
   Otherwise, return 0. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 14937) 
  public static final SubLObject strategic_heuristic_backchain_required(SubLObject strategy, SubLObject transformation_tactic) {
    {
      SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
      if ((NIL != inference_strategist.inference_permits_transformationP(inference))) {
        {
          SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
          if ((NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
            {
              SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
              SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(problem);
              if ((NIL != inference_trampolines.inference_backchain_required_asentP(asent, mt))) {
                return $int55$100;
              }
            }
          }
        }
      }
    }
    return ZERO_INTEGER;
  }

  public static final class $strategic_heuristic_backchain_required$BinaryFunction extends BinaryFunction {
    public $strategic_heuristic_backchain_required$BinaryFunction() { super(extractFunctionNamed("STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return strategic_heuristic_backchain_required(arg1, arg2); }
  }

  /** A set of problems that are currently being evaluated for relevance,
to avoid infinite recursion. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 16058) 
  private static SubLSymbol $heuristic_rule_a_priori_utility_problem_recursion_stack$ = null;

  /** @return happiness-p; between -100 and 100.
positive if CONTENT-TACTIC's problem has any supported* problem with a dependent transformation link
   which used a highlyRelevantAssertion.
negative if CONTENT-TACTIC's problem has any supported* problem with a dependent transformation link
   which used an irrelevantAssertion.
If there is a mix, it will take a percentage, with -100/+100 being 100% irrelevant/relevant.
 0 indicates agnostic.
A special case is that zero dependent* transformation links yield a value of 100 instead
of 0, otherwise the Tactician will prefer highly relevant transformations over removals. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 16245) 
  public static final SubLObject strategic_heuristic_rule_a_priori_utility(SubLObject strategy, SubLObject content_tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject happiness = $int55$100;
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if ((NIL != inference_strategist.inference_permits_transformationP(inference))) {
          {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(content_tactic);
            if (((!(ZERO_INTEGER.eql(inference_datastructures_problem.problem_min_transformation_depth(problem, inference))))
                || (NIL != inference_worker_transformation.transformation_tactic_p(content_tactic)))) {
              {
                SubLObject _prev_bind_0 = $heuristic_rule_a_priori_utility_problem_recursion_stack$.currentBinding(thread);
                try {
                  $heuristic_rule_a_priori_utility_problem_recursion_stack$.bind(set.new_set(Symbols.symbol_function(EQ), UNPROVIDED), thread);
                  thread.resetMultipleValues();
                  {
                    SubLObject relevance_count = count_a_priori_utility_recursive(problem, inference);
                    SubLObject total_count = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (($kw59$LOOP != total_count)) {
                      thread.resetMultipleValues();
                      {
                        SubLObject relevance_count_delta = determine_tactic_heuristic_relevance_delta(content_tactic);
                        SubLObject total_count_delta = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        relevance_count = Numbers.add(relevance_count, relevance_count_delta);
                        total_count = Numbers.add(total_count, total_count_delta);
                      }
                      if ((!(total_count.isZero()))) {
                        happiness = Numbers.truncate(Numbers.multiply($int55$100, relevance_count), total_count);
                      }
                    }
                  }
                } finally {
                  $heuristic_rule_a_priori_utility_problem_recursion_stack$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        }
        return happiness;
      }
    }
  }

  public static final class $strategic_heuristic_rule_a_priori_utility$BinaryFunction extends BinaryFunction {
    public $strategic_heuristic_rule_a_priori_utility$BinaryFunction() { super(extractFunctionNamed("STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return strategic_heuristic_rule_a_priori_utility(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 18040) 
  public static final SubLObject push_problem_onto_heuristic_rule_a_priori_utility_stack(SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return set.set_add(problem, $heuristic_rule_a_priori_utility_problem_recursion_stack$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 18208) 
  public static final SubLObject problem_on_heuristic_rule_a_priori_utility_stackP(SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return set.set_memberP(problem, $heuristic_rule_a_priori_utility_problem_recursion_stack$.getDynamicValue(thread));
    }
  }

  /** @return 0; the number of PROBLEM's dependent* highly relevant assertions
minus the number of PROBLEM's dependent* irrelevant assertions (wrt INFERENCE).
   @return 1; the total number of PROBLEM's dependent* assertions (for now, only rules).
This is equal to the total number of PROBLEM's dependent* transformation links. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 18374) 
  public static final SubLObject count_a_priori_utility_recursive_internal(SubLObject problem, SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject best_relevance_count = ZERO_INTEGER;
        SubLObject best_total_count = ZERO_INTEGER;
        SubLObject best_ratio = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject found_a_loopP = NIL;
        SubLObject found_a_non_loopP = NIL;
        if ((NIL != problem_on_heuristic_rule_a_priori_utility_stackP(problem))) {
          return Values.values($kw59$LOOP, $kw59$LOOP);
        }
        push_problem_onto_heuristic_rule_a_priori_utility_stack(problem);
        {
          SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
          SubLObject state = NIL;
          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            {
              SubLObject dependent_link = set_contents.do_set_contents_next(basis_object, state);
              if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link))) {
                {
                  SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                  SubLObject relevance_count = ZERO_INTEGER;
                  SubLObject total_count = ZERO_INTEGER;
                  SubLObject loopP = NIL;
                  if ((NIL != inference_worker_transformation.transformation_link_p(dependent_link))) {
                    total_count = Numbers.add(total_count, ONE_INTEGER);
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference))) {
                      if ((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36263"))) {
                        relevance_count = Numbers.add(relevance_count, ONE_INTEGER);
                      } else if ((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36262"))) {
                        relevance_count = Numbers.subtract(relevance_count, ONE_INTEGER);
                      } else if ((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36261"))) {
                        relevance_count = Numbers.add(relevance_count, Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36264"));
                      }
                    }
                  }
                  if ((NIL == inference_worker_answer.answer_link_p(dependent_link))) {
                    thread.resetMultipleValues();
                    {
                      SubLObject best_sub_relevance_count = count_a_priori_utility_recursive(supported_problem, inference);
                      SubLObject best_sub_total_count = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      if (($kw59$LOOP == best_sub_total_count)) {
                        loopP = T;
                        found_a_loopP = T;
                      } else {
                        found_a_non_loopP = T;
                        relevance_count = Numbers.add(relevance_count, best_sub_relevance_count);
                        total_count = Numbers.add(total_count, best_sub_total_count);
                      }
                    }
                  }
                  if ((NIL == loopP)) {
                    {
                      SubLObject ratio = (total_count.isZero() ? ((SubLObject) ZERO_INTEGER) : Numbers.divide(relevance_count, total_count));
                      if ((ratio.numG(best_ratio)
                          || (ratio.numE(best_ratio)
                             && total_count.numL(best_total_count)))) {
                        best_relevance_count = relevance_count;
                        best_total_count = total_count;
                        best_ratio = ratio;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (((NIL != found_a_loopP)
             && (NIL == found_a_non_loopP))) {
          return Values.values($kw59$LOOP, $kw59$LOOP);
        } else {
          return Values.values(best_relevance_count, best_total_count);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 18374) 
  public static final SubLObject count_a_priori_utility_recursive(SubLObject problem, SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return count_a_priori_utility_recursive_internal(problem, inference);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym61$COUNT_A_PRIORI_UTILITY_RECURSIVE, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym61$COUNT_A_PRIORI_UTILITY_RECURSIVE, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym61$COUNT_A_PRIORI_UTILITY_RECURSIVE, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(problem, inference);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw31$_MEMOIZED_ITEM_NOT_FOUND_)) {
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
                         && (inference == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(count_a_priori_utility_recursive_internal(problem, inference)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(problem, inference));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 21101) 
  public static final SubLObject determine_tactic_heuristic_relevance_delta(SubLObject tactic) {
    {
      SubLObject relevance_count = ZERO_INTEGER;
      SubLObject total_count = ZERO_INTEGER;
      if ((NIL == inference_worker_transformation.transformation_tactic_p(tactic))) {
      } else if ((NIL != transformation_tactic_relevantP(tactic))) {
        relevance_count = Numbers.add(relevance_count, ONE_INTEGER);
        total_count = Numbers.add(total_count, ONE_INTEGER);
      } else if ((NIL != transformation_tactic_irrelevantP(tactic))) {
        relevance_count = Numbers.subtract(relevance_count, ONE_INTEGER);
        total_count = Numbers.add(total_count, ONE_INTEGER);
      } else if ((NIL != transformation_tactic_has_utilityP(tactic))) {
        relevance_count = Numbers.add(relevance_count, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36271"));
        total_count = Numbers.add(total_count, ONE_INTEGER);
      } else if ((NIL != inference_worker_transformation.transformation_tactic_lookahead_rule(tactic))) {
        total_count = Numbers.add(total_count, ONE_INTEGER);
      }
      return Values.values(relevance_count, total_count);
    }
  }

  /** @return boolean; TRANSFORMATION-TACTIC's rule has a #$highlyRelevantAssertion
meta-assertion on it, and the mt of the meta-assertion is visible from the mt of
TRANSFORMATION-TACTIC's problem. If there is no rule, be conservative and return NIL. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 23650) 
  public static final SubLObject transformation_tactic_relevantP(SubLObject transformation_tactic) {
    {
      SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
      if ((NIL != rule)) {
        {
          SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
          return rule_relevant_to_problemP(rule, problem);
        }
      }
    }
    return NIL;
  }

  /** @return boolean; TRANSFORMATION-TACTIC's rule has an #$irrelevantAssertion
meta-assertion on it, and the mt of the meta-assertion is visible from the mt of
TRANSFORMATION-TACTIC's problem. If there is no rule, be conservative and return NIL. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 24186) 
  public static final SubLObject transformation_tactic_irrelevantP(SubLObject transformation_tactic) {
    {
      SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
      if ((NIL != rule)) {
        {
          SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
          return rule_irrelevant_to_problemP(rule, problem);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 24718) 
  public static final SubLObject transformation_tactic_has_utilityP(SubLObject transformation_tactic) {
    {
      SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
      if ((NIL != rule)) {
        {
          SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
          return rule_has_utility_wrt_problemP(rule, problem);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 25348) 
  public static final SubLObject rule_relevant_to_problemP(SubLObject rule, SubLObject problem) {
    {
      SubLObject problem_mt = inference_datastructures_problem.single_literal_problem_mt(problem);
      SubLObject rule_mt = assertions_high.assertion_mt(rule);
      if ((NIL != inference_trampolines.inference_relevant_mtP(rule_mt, problem_mt))) {
        return T;
      } else if ((NIL == assertion_utilities.assertion_has_meta_assertionsP(rule))) {
        return NIL;
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3438"))) {
        return T;
      } else {
        {
          SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3440");
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 25917) 
  public static final SubLObject rule_irrelevant_to_problemP(SubLObject rule, SubLObject problem) {
    {
      SubLObject problem_mt = inference_datastructures_problem.single_literal_problem_mt(problem);
      SubLObject rule_mt = assertions_high.assertion_mt(rule);
      if ((NIL != inference_trampolines.inference_irrelevant_mtP(rule_mt, problem_mt))) {
        return T;
      } else if ((NIL == assertion_utilities.assertion_has_meta_assertionsP(rule))) {
        return NIL;
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3426"))) {
        return T;
      } else {
        {
          SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3428");
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 26495) 
  public static final SubLObject rule_has_utility_wrt_problemP(SubLObject rule, SubLObject problem) {
    {
      SubLObject problem_mt = inference_datastructures_problem.single_literal_problem_mt(problem);
      if ((NIL == assertion_utilities.assertion_has_meta_assertionsP(rule))) {
        return NIL;
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3442"))) {
        return T;
      }
    }
    return NIL;
  }

  /** When t, the Heuristic tactician will prefer problems which
mention highlyRelevantTerms. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 27566) 
  public static SubLSymbol $highly_relevant_term_enabledP$ = null;

  /** @return happiness-p; between -100 and 100.  Gets +20 for each
#$highlyRelevantTerm in CONTENT-TACTIC's problem (relevance determined
from the context of the appropriate contextualized literal)
and -20 for each #$irrelevantTerm.  Maxes/mins out at -100/100. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 28042) 
  public static final SubLObject strategic_heuristic_relevant_term(SubLObject strategy, SubLObject content_tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $highly_relevant_term_enabledP$.getDynamicValue(thread))) {
        return ZERO_INTEGER;
      }
      {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(content_tactic);
        SubLObject relevance_count = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36258");
        SubLObject heuristic = Numbers.multiply(relevance_count, TWENTY_INTEGER);
        heuristic = Numbers.min(heuristic, $int55$100);
        heuristic = Numbers.max(heuristic, $int39$_100);
        return heuristic;
      }
    }
  }

  public static final class $strategic_heuristic_relevant_term$BinaryFunction extends BinaryFunction {
    public $strategic_heuristic_relevant_term$BinaryFunction() { super(extractFunctionNamed("STRATEGIC-HEURISTIC-RELEVANT-TERM")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return strategic_heuristic_relevant_term(arg1, arg2); }
  }

  /** lambda */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 29340) 
  private static SubLSymbol $relevant_or_irrelevant_term_count$ = null;

  /** When non-nil, the Heuristic tactician will use rule historical utility as
one of its heuristics. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 30088) 
  private static SubLSymbol $strategic_heuristic_rule_historical_utility_enabledP$ = null;

  /** A set of problems that are currently being evaluated for rule-historical-utility,
to avoid infinite recursion. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 31527) 
  private static SubLSymbol $heuristic_rule_historical_utility_problem_recursion_stack$ = null;

  /** @return happiness-p; between -100 and 100.
positive if CONTENT-TACTIC's problem has any supported* problem with a dependent transformation link
   which uses a historically useful rule.
negative if CONTENT-TACTIC's problem has any supported* problem with a dependent transformation link
   which uses a historically useless rule.
If there is a mix, it will take a percentage, with -100/+100 being 100% irrelevant/relevant.
 0 indicates agnostic.
A special case is that zero dependent* transformation links yield a value of 100 instead
of 0, otherwise the Tactician will prefer relevant transformations over removals. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 31730) 
  public static final SubLObject strategic_heuristic_rule_historical_utility(SubLObject strategy, SubLObject content_tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $strategic_heuristic_rule_historical_utility_enabledP$.getDynamicValue(thread))) {
        return ZERO_INTEGER;
      }
      {
        SubLObject happiness = $int55$100;
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if ((NIL != inference_strategist.inference_permits_transformationP(inference))) {
          {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(content_tactic);
            if (((NIL != inference_worker.problem_has_been_transformedP(problem, inference))
                || (NIL != inference_worker_transformation.transformation_tactic_p(content_tactic)))) {
              {
                SubLObject _prev_bind_0 = $heuristic_rule_historical_utility_problem_recursion_stack$.currentBinding(thread);
                try {
                  $heuristic_rule_historical_utility_problem_recursion_stack$.bind(set.new_set(Symbols.symbol_function(EQ), UNPROVIDED), thread);
                  thread.resetMultipleValues();
                  {
                    SubLObject total_utility = compute_problem_rule_historical_utility_recursive(problem, inference);
                    SubLObject total_count = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (($kw59$LOOP != total_count)) {
                      thread.resetMultipleValues();
                      {
                        SubLObject delta_utility = compute_tactic_rule_historical_utility(content_tactic);
                        SubLObject delta_count = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        total_utility = Numbers.add(total_utility, delta_utility);
                        total_count = Numbers.add(total_count, delta_count);
                      }
                      if ((!(total_count.isZero()))) {
                        happiness = Numbers.integerDivide(total_utility, total_count);
                      }
                    }
                  }
                } finally {
                  $heuristic_rule_historical_utility_problem_recursion_stack$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        }
        return happiness;
      }
    }
  }

  public static final class $strategic_heuristic_rule_historical_utility$BinaryFunction extends BinaryFunction {
    public $strategic_heuristic_rule_historical_utility$BinaryFunction() { super(extractFunctionNamed("STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return strategic_heuristic_rule_historical_utility(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 33554) 
  public static final SubLObject push_problem_onto_rule_historical_utility_stack(SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return set.set_add(problem, $heuristic_rule_historical_utility_problem_recursion_stack$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 33716) 
  public static final SubLObject problem_on_rule_historical_utility_stackP(SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return set.set_memberP(problem, $heuristic_rule_historical_utility_problem_recursion_stack$.getDynamicValue(thread));
    }
  }

  /** @return 0; the number of PROBLEM's dependent* highly relevant assertions
minus the number of PROBLEM's dependent* irrelevant assertions (wrt INFERENCE).
   @return 1; the total number of PROBLEM's dependent* assertions (for now, only rules).
This is equal to the total number of PROBLEM's dependent* transformation links. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 33876) 
  public static final SubLObject compute_problem_rule_historical_utility_recursive_internal(SubLObject problem, SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject best_utility = ZERO_INTEGER;
        SubLObject best_total_count = ZERO_INTEGER;
        SubLObject best_ratio = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject found_a_loopP = NIL;
        SubLObject found_a_non_loopP = NIL;
        if ((NIL != problem_on_rule_historical_utility_stackP(problem))) {
          return Values.values($kw59$LOOP, $kw59$LOOP);
        }
        push_problem_onto_rule_historical_utility_stack(problem);
        {
          SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
          SubLObject state = NIL;
          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            {
              SubLObject dependent_link = set_contents.do_set_contents_next(basis_object, state);
              if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link))) {
                {
                  SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                  SubLObject utility = ZERO_INTEGER;
                  SubLObject total_count = ZERO_INTEGER;
                  SubLObject loopP = NIL;
                  if ((NIL != inference_worker_transformation.generalized_transformation_link_p(dependent_link))) {
                    total_count = Numbers.add(total_count, ONE_INTEGER);
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference))) {
                      {
                        SubLObject rule_assertion = inference_worker_transformation.generalized_transformation_link_rule_assertion(dependent_link);
                        SubLObject local_utility = inference_analysis.transformation_rule_historical_utility(rule_assertion);
                        utility = Numbers.add(utility, local_utility);
                      }
                    }
                  }
                  if ((NIL == inference_worker_answer.answer_link_p(dependent_link))) {
                    thread.resetMultipleValues();
                    {
                      SubLObject best_sub_utility = compute_problem_rule_historical_utility_recursive(supported_problem, inference);
                      SubLObject best_sub_total_count = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      if (($kw59$LOOP == best_sub_total_count)) {
                        loopP = T;
                        found_a_loopP = T;
                      } else {
                        found_a_non_loopP = T;
                        utility = Numbers.add(utility, best_sub_utility);
                        total_count = Numbers.add(total_count, best_sub_total_count);
                      }
                    }
                  }
                  if ((NIL == loopP)) {
                    {
                      SubLObject ratio = (total_count.isZero() ? ((SubLObject) ZERO_INTEGER) : Numbers.divide(utility, total_count));
                      if ((ratio.numG(best_ratio)
                          || (ratio.numE(best_ratio)
                             && total_count.numL(best_total_count)))) {
                        best_utility = utility;
                        best_total_count = total_count;
                        best_ratio = ratio;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (((NIL != found_a_loopP)
             && (NIL == found_a_non_loopP))) {
          return Values.values($kw59$LOOP, $kw59$LOOP);
        } else {
          return Values.values(best_utility, best_total_count);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 33876) 
  public static final SubLObject compute_problem_rule_historical_utility_recursive(SubLObject problem, SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return compute_problem_rule_historical_utility_recursive_internal(problem, inference);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym73$COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym73$COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym73$COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(problem, inference);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw31$_MEMOIZED_ITEM_NOT_FOUND_)) {
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
                         && (inference == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(compute_problem_rule_historical_utility_recursive_internal(problem, inference)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(problem, inference));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 36462) 
  public static final SubLObject compute_tactic_rule_historical_utility(SubLObject tactic) {
    {
      SubLObject delta_utility = ZERO_INTEGER;
      SubLObject delta_count = ZERO_INTEGER;
      if ((NIL != inference_worker_transformation.transformation_tactic_p(tactic))) {
        {
          SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(tactic);
          if ((NIL != rule)) {
            delta_utility = Numbers.add(delta_utility, inference_analysis.transformation_rule_historical_utility(rule));
            delta_count = Numbers.add(delta_count, ONE_INTEGER);
          }
        }
      }
      return Values.values(delta_utility, delta_count);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 38308) 
  private static SubLSymbol $strategic_heuristic_rule_historical_connectedness_enabledP$ = null;

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 44699) 
  public static final SubLObject strategic_heuristic_rule_literal_count(SubLObject strategy, SubLObject transformation_tactic) {
    if ((NIL == inference_worker_transformation.transformation_tactic_p(transformation_tactic))) {
      return ZERO_INTEGER;
    }
    {
      SubLObject rule_assertion = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
      if ((NIL != rule_assertion)) {
        {
          SubLObject literal_count = assertion_utilities.rule_literal_count(rule_assertion);
          SubLObject happiness = strategic_heuristic_happiness_due_to_literal_count(literal_count);
          return happiness;
        }
      }
    }
    return ZERO_INTEGER;
  }

  public static final class $strategic_heuristic_rule_literal_count$BinaryFunction extends BinaryFunction {
    public $strategic_heuristic_rule_literal_count$BinaryFunction() { super(extractFunctionNamed("STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return strategic_heuristic_rule_literal_count(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 45240) 
  public static final SubLObject strategic_heuristic_happiness_due_to_literal_count(SubLObject literal_count) {
    return numeric_table_lookup(literal_count, $strategic_heuristic_literal_count_lookup_table$.getGlobalValue(), UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 45440) 
  private static SubLSymbol $strategic_heuristic_literal_count_lookup_table$ = null;

  /** Return a value associated with the numeric argument N via a table lookup.
LOOKUP-TABLE is a list of (input, output) pairs.
The symbol :positive-infinity represents infinity as the input value of the last pair.
All numeric lookup tables should end with :positive-infinity. */
  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 45853) 
  public static final SubLObject numeric_table_lookup(SubLObject n, SubLObject lookup_table, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLObject cdolist_list_var = lookup_table;
      SubLObject cons = NIL;
      for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
        {
          SubLObject datum = cons;
          SubLObject current = datum;
          SubLObject input = NIL;
          SubLObject output = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list93);
          input = current.first();
          current = current.rest();
          output = current;
          if ((NIL != number_utilities.potentially_infinite_number_LE(n, input))) {
            return output;
          }
        }
      }
    }
    return v_default;
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 46683) 
  public static final SubLObject strategic_heuristic_skolem_count(SubLObject strategy, SubLObject logical_tactic) {
    {
      SubLObject problem = inference_datastructures_tactic.tactic_problem(logical_tactic);
      SubLObject skolem_count = problem_skolem_count(problem);
      SubLObject happiness = strategic_heuristic_happiness_due_to_skolem_count(skolem_count);
      return happiness;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 46988) 
  public static final SubLObject problem_skolem_count(SubLObject problem) {
    {
      SubLObject query = inference_datastructures_problem.problem_query(problem);
      return list_utilities.tree_count_if($sym97$SKOLEM_FUNCTION_P, query, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 47131) 
  public static final SubLObject strategic_heuristic_happiness_due_to_skolem_count(SubLObject skolem_count) {
    return numeric_table_lookup(skolem_count, $strategic_heuristic_skolem_count_lookup_table$.getGlobalValue(), UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-strategic-heuristics.lisp", position = 47306) 
  private static SubLSymbol $strategic_heuristic_skolem_count_lookup_table$ = null;

  public static final SubLObject declare_inference_strategic_heuristics_file() {
    declareFunction(myName, "strategic_heuristic_index", "STRATEGIC-HEURISTIC-INDEX", 0, 0, false);
    declareMacro(myName, "do_strategic_heuristics", "DO-STRATEGIC-HEURISTICS");
    declareFunction(myName, "do_strategic_heuristics_tactic_match_p", "DO-STRATEGIC-HEURISTICS-TACTIC-MATCH-P", 2, 0, false);
    declareFunction(myName, "new_strategic_heuristic_data", "NEW-STRATEGIC-HEURISTIC-DATA", 5, 0, false);
    declareFunction(myName, "declare_strategic_heuristic", "DECLARE-STRATEGIC-HEURISTIC", 2, 0, false);
    declareFunction(myName, "undeclare_strategic_heuristic", "UNDECLARE-STRATEGIC-HEURISTIC", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_function", "STRATEGIC-HEURISTIC-FUNCTION", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_scaling_factor", "STRATEGIC-HEURISTIC-SCALING-FACTOR", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_name", "STRATEGIC-HEURISTIC-NAME", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_pretty_name", "STRATEGIC-HEURISTIC-PRETTY-NAME", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_comment", "STRATEGIC-HEURISTIC-COMMENT", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_tactic_type", "STRATEGIC-HEURISTIC-TACTIC-TYPE", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_shallow_and_cheap", "STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP", 2, 0, false); new $strategic_heuristic_shallow_and_cheap$BinaryFunction();
    declareFunction(myName, "productivity_for_shallow_and_cheap_heuristic", "PRODUCTIVITY-FOR-SHALLOW-AND-CHEAP-HEURISTIC", 2, 0, false);
    declareFunction(myName, "tactic_strategic_uselessness_based_on_proof_depth", "TACTIC-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH", 2, 0, false);
    declareFunction(myName, "clear_tactic_strategic_uselessness_based_on_proof_depth_math_memoized", "CLEAR-TACTIC-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED", 0, 0, false);
    declareFunction(myName, "remove_tactic_strategic_uselessness_based_on_proof_depth_math_memoized", "REMOVE-TACTIC-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED", 1, 0, false);
    declareFunction(myName, "tactic_strategic_uselessness_based_on_proof_depth_math_memoized_internal", "TACTIC-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED-INTERNAL", 1, 0, false);
    declareFunction(myName, "tactic_strategic_uselessness_based_on_proof_depth_math_memoized", "TACTIC-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_completeness", "STRATEGIC-HEURISTIC-COMPLETENESS", 2, 0, false); new $strategic_heuristic_completeness$BinaryFunction();
    declareFunction(myName, "strategic_heuristic_occams_razor", "STRATEGIC-HEURISTIC-OCCAMS-RAZOR", 2, 0, false); new $strategic_heuristic_occams_razor$BinaryFunction();
    declareFunction(myName, "strategic_heuristic_magic_wand", "STRATEGIC-HEURISTIC-MAGIC-WAND", 2, 0, false); new $strategic_heuristic_magic_wand$BinaryFunction();
    declareFunction(myName, "strategic_heuristic_backtracking", "STRATEGIC-HEURISTIC-BACKTRACKING", 2, 0, false);
    declareFunction(myName, "executed_connected_conjunction_tactics_that_matter_count", "EXECUTED-CONNECTED-CONJUNCTION-TACTICS-THAT-MATTER-COUNT", 2, 0, false);
    declareFunction(myName, "strategic_heuristic_backchain_required", "STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED", 2, 0, false); new $strategic_heuristic_backchain_required$BinaryFunction();
    declareFunction(myName, "strategic_heuristic_rule_a_priori_utility", "STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY", 2, 0, false); new $strategic_heuristic_rule_a_priori_utility$BinaryFunction();
    declareFunction(myName, "push_problem_onto_heuristic_rule_a_priori_utility_stack", "PUSH-PROBLEM-ONTO-HEURISTIC-RULE-A-PRIORI-UTILITY-STACK", 1, 0, false);
    declareFunction(myName, "problem_on_heuristic_rule_a_priori_utility_stackP", "PROBLEM-ON-HEURISTIC-RULE-A-PRIORI-UTILITY-STACK?", 1, 0, false);
    declareFunction(myName, "count_a_priori_utility_recursive_internal", "COUNT-A-PRIORI-UTILITY-RECURSIVE-INTERNAL", 2, 0, false);
    declareFunction(myName, "count_a_priori_utility_recursive", "COUNT-A-PRIORI-UTILITY-RECURSIVE", 2, 0, false);
    declareFunction(myName, "determine_tactic_heuristic_relevance_delta", "DETERMINE-TACTIC-HEURISTIC-RELEVANCE-DELTA", 1, 0, false);
    declareFunction(myName, "transformation_link_relevantP", "TRANSFORMATION-LINK-RELEVANT?", 1, 0, false);
    declareFunction(myName, "transformation_link_irrelevantP", "TRANSFORMATION-LINK-IRRELEVANT?", 1, 0, false);
    declareFunction(myName, "transformation_link_has_rule_utilityP", "TRANSFORMATION-LINK-HAS-RULE-UTILITY?", 1, 0, false);
    declareFunction(myName, "transformation_link_rule_utility", "TRANSFORMATION-LINK-RULE-UTILITY", 1, 0, false);
    declareFunction(myName, "transformation_tactic_relevantP", "TRANSFORMATION-TACTIC-RELEVANT?", 1, 0, false);
    declareFunction(myName, "transformation_tactic_irrelevantP", "TRANSFORMATION-TACTIC-IRRELEVANT?", 1, 0, false);
    declareFunction(myName, "transformation_tactic_has_utilityP", "TRANSFORMATION-TACTIC-HAS-UTILITY?", 1, 0, false);
    declareFunction(myName, "transformation_tactic_utility", "TRANSFORMATION-TACTIC-UTILITY", 1, 0, false);
    declareFunction(myName, "rule_relevant_to_problemP", "RULE-RELEVANT-TO-PROBLEM?", 2, 0, false);
    declareFunction(myName, "rule_irrelevant_to_problemP", "RULE-IRRELEVANT-TO-PROBLEM?", 2, 0, false);
    declareFunction(myName, "rule_has_utility_wrt_problemP", "RULE-HAS-UTILITY-WRT-PROBLEM?", 2, 0, false);
    declareFunction(myName, "transformation_rule_a_priori_utility", "TRANSFORMATION-RULE-A-PRIORI-UTILITY", 1, 0, false);
    declareFunction(myName, "transformation_rule_a_priori_utility_happiness_internal", "TRANSFORMATION-RULE-A-PRIORI-UTILITY-HAPPINESS-INTERNAL", 1, 0, false);
    declareFunction(myName, "transformation_rule_a_priori_utility_happiness", "TRANSFORMATION-RULE-A-PRIORI-UTILITY-HAPPINESS", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_relevant_term", "STRATEGIC-HEURISTIC-RELEVANT-TERM", 2, 0, false); new $strategic_heuristic_relevant_term$BinaryFunction();
    declareFunction(myName, "problem_relevant_or_irrelevant_term_count", "PROBLEM-RELEVANT-OR-IRRELEVANT-TERM-COUNT", 1, 0, false);
    declareFunction(myName, "expression_relevant_or_irrelevant_term_count", "EXPRESSION-RELEVANT-OR-IRRELEVANT-TERM-COUNT", 1, 0, false);
    declareFunction(myName, "accumulate_relevant_or_irrelevant_term_count", "ACCUMULATE-RELEVANT-OR-IRRELEVANT-TERM-COUNT", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_rule_historical_utility_enabledP", "STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-ENABLED?", 0, 0, false);
    declareFunction(myName, "enable_strategic_heuristic_rule_historical_utility", "ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 0, false);
    declareFunction(myName, "disable_strategic_heuristic_rule_historical_utility", "DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 0, false);
    declareFunction(myName, "strategic_heuristic_rule_historical_utility", "STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 2, 0, false); new $strategic_heuristic_rule_historical_utility$BinaryFunction();
    declareFunction(myName, "push_problem_onto_rule_historical_utility_stack", "PUSH-PROBLEM-ONTO-RULE-HISTORICAL-UTILITY-STACK", 1, 0, false);
    declareFunction(myName, "problem_on_rule_historical_utility_stackP", "PROBLEM-ON-RULE-HISTORICAL-UTILITY-STACK?", 1, 0, false);
    declareFunction(myName, "compute_problem_rule_historical_utility_recursive_internal", "COMPUTE-PROBLEM-RULE-HISTORICAL-UTILITY-RECURSIVE-INTERNAL", 2, 0, false);
    declareFunction(myName, "compute_problem_rule_historical_utility_recursive", "COMPUTE-PROBLEM-RULE-HISTORICAL-UTILITY-RECURSIVE", 2, 0, false);
    declareFunction(myName, "compute_tactic_rule_historical_utility", "COMPUTE-TACTIC-RULE-HISTORICAL-UTILITY", 1, 0, false);
    declareFunction(myName, "inference_rule_preference_G", "INFERENCE-RULE-PREFERENCE->", 3, 0, false);
    declareFunction(myName, "transformation_rule_utility_G", "TRANSFORMATION-RULE-UTILITY->", 2, 0, false);
    declareFunction(myName, "transformation_rule_utility_G_with_tiebreaker", "TRANSFORMATION-RULE-UTILITY->-WITH-TIEBREAKER", 2, 0, false);
    declareFunction(myName, "transformation_rule_utility_internal", "TRANSFORMATION-RULE-UTILITY-INTERNAL", 1, 0, false);
    declareFunction(myName, "transformation_rule_utility", "TRANSFORMATION-RULE-UTILITY", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_rule_historical_connectedness", "STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS", 2, 0, false);
    declareFunction(myName, "problem_link_paths_relevant_to_inference", "PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE", 2, 0, false);
    declareFunction(myName, "cached_problem_link_paths_relevant_to_inference_internal", "CACHED-PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE-INTERNAL", 2, 0, false);
    declareFunction(myName, "cached_problem_link_paths_relevant_to_inference", "CACHED-PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE", 2, 0, false);
    declareFunction(myName, "problem_link_paths_relevant_to_inference_recursive", "PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE-RECURSIVE", 3, 0, false);
    declareFunction(myName, "problem_rule_sets_relevant_to_inference", "PROBLEM-RULE-SETS-RELEVANT-TO-INFERENCE", 2, 0, false);
    declareFunction(myName, "tactic_lookahead_rule_sets_relevant_to_inference", "TACTIC-LOOKAHEAD-RULE-SETS-RELEVANT-TO-INFERENCE", 2, 0, false);
    declareFunction(myName, "problem_link_path_rule_set", "PROBLEM-LINK-PATH-RULE-SET", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_literal_count", "STRATEGIC-HEURISTIC-LITERAL-COUNT", 2, 0, false);
    declareFunction(myName, "strategic_heuristic_rule_literal_count", "STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT", 2, 0, false); new $strategic_heuristic_rule_literal_count$BinaryFunction();
    declareFunction(myName, "strategic_heuristic_happiness_due_to_literal_count", "STRATEGIC-HEURISTIC-HAPPINESS-DUE-TO-LITERAL-COUNT", 1, 0, false);
    declareFunction(myName, "numeric_table_lookup", "NUMERIC-TABLE-LOOKUP", 2, 1, false);
    declareFunction(myName, "strategic_heuristic_skolem_count", "STRATEGIC-HEURISTIC-SKOLEM-COUNT", 2, 0, false);
    declareFunction(myName, "problem_skolem_count", "PROBLEM-SKOLEM-COUNT", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_happiness_due_to_skolem_count", "STRATEGIC-HEURISTIC-HAPPINESS-DUE-TO-SKOLEM-COUNT", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_happiness_table", "STRATEGIC-HEURISTIC-HAPPINESS-TABLE", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_strategic_heuristics_file() {
    $strategic_heuristic_index$ = deflexical("*STRATEGIC-HEURISTIC-INDEX*", maybeDefault( $sym0$_STRATEGIC_HEURISTIC_INDEX_, $strategic_heuristic_index$, ()-> (dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED))));
    $overriding_strategic_heuristic_scaling_factors$ = defvar("*OVERRIDING-STRATEGIC-HEURISTIC-SCALING-FACTORS*", NIL);
    $tactic_strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$ = deflexical("*TACTIC-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED-CACHING-STATE*", NIL);
    $strategic_heuristic_occams_razor_table$ = deflexical("*STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TABLE*", $list38);
    $strategic_heuristic_occams_razor_table_default$ = deflexical("*STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TABLE-DEFAULT*", $int39$_100);
    $backtracking_considered_harmfulP$ = defvar("*BACKTRACKING-CONSIDERED-HARMFUL?*", T);
    $strategic_heuristic_backtracking_table$ = deflexical("*STRATEGIC-HEURISTIC-BACKTRACKING-TABLE*", $list48);
    $strategic_heuristic_backtracking_table_default$ = deflexical("*STRATEGIC-HEURISTIC-BACKTRACKING-TABLE-DEFAULT*", $int39$_100);
    $early_removal_productivity_threshold$ = defvar("*EARLY-REMOVAL-PRODUCTIVITY-THRESHOLD*", $int50$400);
    $heuristic_rule_a_priori_utility_problem_recursion_stack$ = defparameter("*HEURISTIC-RULE-A-PRIORI-UTILITY-PROBLEM-RECURSION-STACK*", NIL);
    $highly_relevant_term_enabledP$ = defvar("*HIGHLY-RELEVANT-TERM-ENABLED?*", NIL);
    $relevant_or_irrelevant_term_count$ = defparameter("*RELEVANT-OR-IRRELEVANT-TERM-COUNT*", ZERO_INTEGER);
    $strategic_heuristic_rule_historical_utility_enabledP$ = defvar("*STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-ENABLED?*", T);
    $heuristic_rule_historical_utility_problem_recursion_stack$ = defparameter("*HEURISTIC-RULE-HISTORICAL-UTILITY-PROBLEM-RECURSION-STACK*", NIL);
    $strategic_heuristic_rule_historical_connectedness_enabledP$ = defparameter("*STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS-ENABLED?*", NIL);
    $strategic_heuristic_literal_count_lookup_table$ = deflexical("*STRATEGIC-HEURISTIC-LITERAL-COUNT-LOOKUP-TABLE*", $list92);
    $strategic_heuristic_skolem_count_lookup_table$ = deflexical("*STRATEGIC-HEURISTIC-SKOLEM-COUNT-LOOKUP-TABLE*", $list98);
    return NIL;
  }

  public static final SubLObject setup_inference_strategic_heuristics_file() {
    // CVS_ID("Id: inference-strategic-heuristics.lisp 128456 2009-07-31 16:45:00Z pace ");
    subl_macro_promotions.declare_defglobal($sym0$_STRATEGIC_HEURISTIC_INDEX_);
    access_macros.register_macro_helper($sym1$STRATEGIC_HEURISTIC_INDEX, $sym2$DO_STRATEGIC_HEURISTICS);
    access_macros.register_macro_helper($sym16$DO_STRATEGIC_HEURISTICS_TACTIC_MATCH_P, $sym2$DO_STRATEGIC_HEURISTICS);
    declare_strategic_heuristic($kw25$SHALLOW_AND_CHEAP, $list26);
    utilities_macros.note_funcall_helper_function($sym27$STRATEGIC_HEURISTIC_SHALLOW_AND_CHEAP);
    memoization_state.note_globally_cached_function($sym29$TACTIC_STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED);
    declare_strategic_heuristic($kw32$COMPLETENESS, $list33);
    utilities_macros.note_funcall_helper_function($sym35$STRATEGIC_HEURISTIC_COMPLETENESS);
    declare_strategic_heuristic($kw36$OCCAMS_RAZOR, $list37);
    utilities_macros.note_funcall_helper_function($sym41$STRATEGIC_HEURISTIC_OCCAMS_RAZOR);
    declare_strategic_heuristic($kw42$MAGIC_WAND, $list43);
    utilities_macros.note_funcall_helper_function($sym45$STRATEGIC_HEURISTIC_MAGIC_WAND);
    declare_strategic_heuristic($kw46$BACKTRACKING_CONSIDERED_HARMFUL, $list47);
    utilities_macros.note_funcall_helper_function($sym49$STRATEGIC_HEURISTIC_BACKTRACKING);
    declare_strategic_heuristic($kw53$BACKCHAIN_REQUIRED, $list54);
    utilities_macros.note_funcall_helper_function($sym56$STRATEGIC_HEURISTIC_BACKCHAIN_REQUIRED);
    declare_strategic_heuristic($kw57$RULE_A_PRIORI_UTILITY, $list58);
    utilities_macros.note_funcall_helper_function($sym60$STRATEGIC_HEURISTIC_RULE_A_PRIORI_UTILITY);
    memoization_state.note_memoized_function($sym61$COUNT_A_PRIORI_UTILITY_RECURSIVE);
    memoization_state.note_memoized_function($sym62$TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS);
    declare_strategic_heuristic($kw63$RELEVANT_TERM, $list64);
    utilities_macros.note_funcall_helper_function($sym65$STRATEGIC_HEURISTIC_RELEVANT_TERM);
    utilities_macros.note_funcall_helper_function($sym69$ACCUMULATE_RELEVANT_OR_IRRELEVANT_TERM_COUNT);
    declare_strategic_heuristic($kw70$RULE_HISTORICAL_UTILITY, $list71);
    utilities_macros.note_funcall_helper_function($sym72$STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY);
    memoization_state.note_memoized_function($sym73$COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE);
    memoization_state.note_memoized_function($sym74$TRANSFORMATION_RULE_UTILITY);
    declare_strategic_heuristic($kw76$RULE_HISTORICAL_CONNECTEDNESS, $list77);
    utilities_macros.note_funcall_helper_function($sym78$STRATEGIC_HEURISTIC_RULE_HISTORICAL_CONNECTEDNESS);
    memoization_state.note_memoized_function($sym79$CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE);
    declare_strategic_heuristic($kw86$LITERAL_COUNT, $list87);
    utilities_macros.note_funcall_helper_function($sym88$STRATEGIC_HEURISTIC_LITERAL_COUNT);
    declare_strategic_heuristic($kw89$RULE_LITERAL_COUNT, $list90);
    utilities_macros.note_funcall_helper_function($sym91$STRATEGIC_HEURISTIC_RULE_LITERAL_COUNT);
    declare_strategic_heuristic($kw94$SKOLEM_COUNT, $list95);
    utilities_macros.note_funcall_helper_function($sym96$STRATEGIC_HEURISTIC_SKOLEM_COUNT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_STRATEGIC_HEURISTIC_INDEX_ = makeSymbol("*STRATEGIC-HEURISTIC-INDEX*");
  public static final SubLSymbol $sym1$STRATEGIC_HEURISTIC_INDEX = makeSymbol("STRATEGIC-HEURISTIC-INDEX");
  public static final SubLSymbol $sym2$DO_STRATEGIC_HEURISTICS = makeSymbol("DO-STRATEGIC-HEURISTICS");
  public static final SubLList $list3 = list(list(makeSymbol("HEURISTIC"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("&KEY"), makeSymbol("TACTIC"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list4 = list(makeKeyword("TACTIC"), makeKeyword("DONE"));
  public static final SubLSymbol $kw5$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw6$TACTIC = makeKeyword("TACTIC");
  public static final SubLSymbol $kw7$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym8$TACTIC_TYPE = makeUninternedSymbol("TACTIC-TYPE");
  public static final SubLSymbol $sym9$DO_DICTIONARY_KEYS = makeSymbol("DO-DICTIONARY-KEYS");
  public static final SubLList $list10 = list(makeSymbol("STRATEGIC-HEURISTIC-INDEX"));
  public static final SubLSymbol $sym11$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym12$STRATEGIC_HEURISTIC_FUNCTION = makeSymbol("STRATEGIC-HEURISTIC-FUNCTION");
  public static final SubLSymbol $sym13$STRATEGIC_HEURISTIC_SCALING_FACTOR = makeSymbol("STRATEGIC-HEURISTIC-SCALING-FACTOR");
  public static final SubLSymbol $sym14$STRATEGIC_HEURISTIC_TACTIC_TYPE = makeSymbol("STRATEGIC-HEURISTIC-TACTIC-TYPE");
  public static final SubLSymbol $sym15$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym16$DO_STRATEGIC_HEURISTICS_TACTIC_MATCH_P = makeSymbol("DO-STRATEGIC-HEURISTICS-TACTIC-MATCH-P");
  public static final SubLSymbol $sym17$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLList $list18 = list(makeSymbol("&KEY"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("PRETTY-NAME"), makeSymbol("COMMENT"), makeSymbol("TACTIC-TYPE"));
  public static final SubLList $list19 = list(makeKeyword("FUNCTION"), makeKeyword("SCALING-FACTOR"), makeKeyword("PRETTY-NAME"), makeKeyword("COMMENT"), makeKeyword("TACTIC-TYPE"));
  public static final SubLSymbol $kw20$FUNCTION = makeKeyword("FUNCTION");
  public static final SubLSymbol $kw21$SCALING_FACTOR = makeKeyword("SCALING-FACTOR");
  public static final SubLSymbol $kw22$PRETTY_NAME = makeKeyword("PRETTY-NAME");
  public static final SubLSymbol $kw23$COMMENT = makeKeyword("COMMENT");
  public static final SubLSymbol $kw24$TACTIC_TYPE = makeKeyword("TACTIC-TYPE");
  public static final SubLSymbol $kw25$SHALLOW_AND_CHEAP = makeKeyword("SHALLOW-AND-CHEAP");
  public static final SubLList $list26 = list(makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP"), makeKeyword("SCALING-FACTOR"), ONE_INTEGER, makeKeyword("PRETTY-NAME"), makeString("Shallow And Cheap"), makeKeyword("COMMENT"), makeString("Prefer tactics which are shallower,\ni.e. have a lower min-proof-depth, and which are cheap,\ni.e. have a lower productivity."));
  public static final SubLSymbol $sym27$STRATEGIC_HEURISTIC_SHALLOW_AND_CHEAP = makeSymbol("STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP");
  public static final SubLSymbol $kw28$UNDETERMINED = makeKeyword("UNDETERMINED");
  public static final SubLSymbol $sym29$TACTIC_STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED = makeSymbol("TACTIC-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED");
  public static final SubLSymbol $sym30$_TACTIC_STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED_ = makeSymbol("*TACTIC-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED-CACHING-STATE*");
  public static final SubLSymbol $kw31$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $kw32$COMPLETENESS = makeKeyword("COMPLETENESS");
  public static final SubLList $list33 = list(makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-COMPLETENESS"), makeKeyword("SCALING-FACTOR"), ONE_INTEGER, makeKeyword("PRETTY-NAME"), makeString("Completeness"), makeKeyword("COMMENT"), makeString("Prefer tactics which are complete."));
  public static final SubLSymbol $kw34$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $sym35$STRATEGIC_HEURISTIC_COMPLETENESS = makeSymbol("STRATEGIC-HEURISTIC-COMPLETENESS");
  public static final SubLSymbol $kw36$OCCAMS_RAZOR = makeKeyword("OCCAMS-RAZOR");
  public static final SubLList $list37 = list(makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-OCCAMS-RAZOR"), makeKeyword("SCALING-FACTOR"), makeInteger(250), makeKeyword("PRETTY-NAME"), makeString("Occam's Razor"), makeKeyword("COMMENT"), makeString("The simplest explanation is best.  Our measure\nof simplicity is the shallowest transformation depth."));
  public static final SubLList $list38 = list(new SubLObject[] {cons(ZERO_INTEGER, ZERO_INTEGER), cons(ONE_INTEGER, makeInteger(-10)), cons(TWO_INTEGER, makeInteger(-20)), cons(THREE_INTEGER, makeInteger(-30)), cons(FOUR_INTEGER, makeInteger(-40)), cons(FIVE_INTEGER, makeInteger(-50)), cons(SIX_INTEGER, makeInteger(-60)), cons(SEVEN_INTEGER, makeInteger(-70)), cons(EIGHT_INTEGER, makeInteger(-75)), cons(NINE_INTEGER, makeInteger(-80)), cons(TEN_INTEGER, makeInteger(-85)), cons(FIFTEEN_INTEGER, makeInteger(-90)), cons(TWENTY_INTEGER, makeInteger(-95)), cons(makeInteger(30), makeInteger(-99)), cons(makeKeyword("POSITIVE-INFINITY"), makeInteger(-100))});
  public static final SubLInteger $int39$_100 = makeInteger(-100);
  public static final SubLSymbol $kw40$INTUITIVE = makeKeyword("INTUITIVE");
  public static final SubLSymbol $sym41$STRATEGIC_HEURISTIC_OCCAMS_RAZOR = makeSymbol("STRATEGIC-HEURISTIC-OCCAMS-RAZOR");
  public static final SubLSymbol $kw42$MAGIC_WAND = makeKeyword("MAGIC-WAND");
  public static final SubLList $list43 = list(makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-MAGIC-WAND"), makeKeyword("SCALING-FACTOR"), makeInteger(1000), makeKeyword("PRETTY-NAME"), makeString("Magic Wand"), makeKeyword("COMMENT"), makeString("Disprefer 'magic wand' tactics, which are\nincomplete (conjunctive) removal tactics which are expected\nto yield no answers, i.e. they have a productivity of 0.\nSince they are incomplete, they can't even yield the benefit\nof pruning, so unless the estimate of 0 is wrong, it's\na waste of time to execute them."));
  public static final SubLSymbol $kw44$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $sym45$STRATEGIC_HEURISTIC_MAGIC_WAND = makeSymbol("STRATEGIC-HEURISTIC-MAGIC-WAND");
  public static final SubLSymbol $kw46$BACKTRACKING_CONSIDERED_HARMFUL = makeKeyword("BACKTRACKING-CONSIDERED-HARMFUL");
  public static final SubLList $list47 = list(new SubLObject[] {makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-BACKTRACKING"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("TACTIC-TYPE"), makeKeyword("CONNECTED-CONJUNCTION"), makeKeyword("PRETTY-NAME"), makeString("Backtracking Considered Harmful"), makeKeyword("COMMENT"), makeString("If we've already executed some non-trivial\nconnected conjunction tactics on this problem, then disprefer\nexecuting any more connected conjunction tactics on it.\nA connected conjunction tactic is deemed trivial if\nit's expected to generate 4 or fewer subproblems.")});
  public static final SubLList $list48 = list(cons(ZERO_INTEGER, ZERO_INTEGER), cons(ONE_INTEGER, makeInteger(-20)), cons(TWO_INTEGER, makeInteger(-40)), cons(THREE_INTEGER, makeInteger(-60)), cons(FOUR_INTEGER, makeInteger(-80)));
  public static final SubLSymbol $sym49$STRATEGIC_HEURISTIC_BACKTRACKING = makeSymbol("STRATEGIC-HEURISTIC-BACKTRACKING");
  public static final SubLInteger $int50$400 = makeInteger(400);
  public static final SubLSymbol $kw51$CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
  public static final SubLSymbol $kw52$EXECUTED = makeKeyword("EXECUTED");
  public static final SubLSymbol $kw53$BACKCHAIN_REQUIRED = makeKeyword("BACKCHAIN-REQUIRED");
  public static final SubLList $list54 = list(new SubLObject[] {makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("TACTIC-TYPE"), makeKeyword("TRANSFORMATION"), makeKeyword("PRETTY-NAME"), makeString("backchainRequired"), makeKeyword("COMMENT"), makeString("Prefer transformation tactics on backchainRequired predicates.")});
  public static final SubLInteger $int55$100 = makeInteger(100);
  public static final SubLSymbol $sym56$STRATEGIC_HEURISTIC_BACKCHAIN_REQUIRED = makeSymbol("STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED");
  public static final SubLSymbol $kw57$RULE_A_PRIORI_UTILITY = makeKeyword("RULE-A-PRIORI-UTILITY");
  public static final SubLList $list58 = list(makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("PRETTY-NAME"), makeString("highlyRelevantAssertion"), makeKeyword("COMMENT"), makeString("Prefer proof paths using higher proportions of\nhighlyRelevantAssertions.  Assume that proof paths using no rules\nare 100% relevant."));
  public static final SubLSymbol $kw59$LOOP = makeKeyword("LOOP");
  public static final SubLSymbol $sym60$STRATEGIC_HEURISTIC_RULE_A_PRIORI_UTILITY = makeSymbol("STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY");
  public static final SubLSymbol $sym61$COUNT_A_PRIORI_UTILITY_RECURSIVE = makeSymbol("COUNT-A-PRIORI-UTILITY-RECURSIVE");
  public static final SubLSymbol $sym62$TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS = makeSymbol("TRANSFORMATION-RULE-A-PRIORI-UTILITY-HAPPINESS");
  public static final SubLSymbol $kw63$RELEVANT_TERM = makeKeyword("RELEVANT-TERM");
  public static final SubLList $list64 = list(makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RELEVANT-TERM"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("PRETTY-NAME"), makeString("highlyRelevantTerm"), makeKeyword("COMMENT"), makeString("Prefer working on problems that contain more\nhighlyRelevantTerms."));
  public static final SubLSymbol $sym65$STRATEGIC_HEURISTIC_RELEVANT_TERM = makeSymbol("STRATEGIC-HEURISTIC-RELEVANT-TERM");
  public static final SubLSymbol $kw66$NEG = makeKeyword("NEG");
  public static final SubLList $list67 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $kw68$POS = makeKeyword("POS");
  public static final SubLSymbol $sym69$ACCUMULATE_RELEVANT_OR_IRRELEVANT_TERM_COUNT = makeSymbol("ACCUMULATE-RELEVANT-OR-IRRELEVANT-TERM-COUNT");
  public static final SubLSymbol $kw70$RULE_HISTORICAL_UTILITY = makeKeyword("RULE-HISTORICAL-UTILITY");
  public static final SubLList $list71 = list(makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(20000), makeKeyword("PRETTY-NAME"), makeString("Historical Utility"), makeKeyword("COMMENT"), makeString("Prefer proof paths using rules that have worked well in the past,\nwithout considering the situations in which they were used, i.e.\nprior probability.  Consider proof paths using no rules to be at 100%."));
  public static final SubLSymbol $sym72$STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY = makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");
  public static final SubLSymbol $sym73$COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE = makeSymbol("COMPUTE-PROBLEM-RULE-HISTORICAL-UTILITY-RECURSIVE");
  public static final SubLSymbol $sym74$TRANSFORMATION_RULE_UTILITY = makeSymbol("TRANSFORMATION-RULE-UTILITY");
  public static final SubLSymbol $sym75$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
  public static final SubLSymbol $kw76$RULE_HISTORICAL_CONNECTEDNESS = makeKeyword("RULE-HISTORICAL-CONNECTEDNESS");
  public static final SubLList $list77 = list(makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS"), makeKeyword("SCALING-FACTOR"), makeInteger(20000), makeKeyword("PRETTY-NAME"), makeString("Rule Connectedness"), makeKeyword("COMMENT"), makeString("Prefer proof paths using sets of rules that have a larger fraction that have pairwise worked together in the past.\nConsider proof paths using fewer than 2 rules to be at 100%."));
  public static final SubLSymbol $sym78$STRATEGIC_HEURISTIC_RULE_HISTORICAL_CONNECTEDNESS = makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS");
  public static final SubLSymbol $sym79$CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE = makeSymbol("CACHED-PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE");
  public static final SubLSymbol $sym80$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $sym81$INFERENCE_P = makeSymbol("INFERENCE-P");
  public static final SubLSymbol $sym82$PROBLEM_LINK_PATH_RULE_SET = makeSymbol("PROBLEM-LINK-PATH-RULE-SET");
  public static final SubLSymbol $sym83$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLSymbol $sym84$_ = makeSymbol("<");
  public static final SubLSymbol $sym85$ASSERTION_ID = makeSymbol("ASSERTION-ID");
  public static final SubLSymbol $kw86$LITERAL_COUNT = makeKeyword("LITERAL-COUNT");
  public static final SubLList $list87 = list(new SubLObject[] {makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-LITERAL-COUNT"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("TACTIC-TYPE"), makeKeyword("LOGICAL"), makeKeyword("PRETTY-NAME"), makeString("# of Literals"), makeKeyword("COMMENT"), makeString("Prefer working on problems with a smaller number of literals.")});
  public static final SubLSymbol $sym88$STRATEGIC_HEURISTIC_LITERAL_COUNT = makeSymbol("STRATEGIC-HEURISTIC-LITERAL-COUNT");
  public static final SubLSymbol $kw89$RULE_LITERAL_COUNT = makeKeyword("RULE-LITERAL-COUNT");
  public static final SubLList $list90 = list(new SubLObject[] {makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("TACTIC-TYPE"), makeKeyword("TRANSFORMATION"), makeKeyword("PRETTY-NAME"), makeString("# of Rule Literals"), makeKeyword("COMMENT"), makeString("Prefer using rules with a smaller number of literals.")});
  public static final SubLSymbol $sym91$STRATEGIC_HEURISTIC_RULE_LITERAL_COUNT = makeSymbol("STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT");
  public static final SubLList $list92 = list(new SubLObject[] {cons(ONE_INTEGER, ZERO_INTEGER), cons(TWO_INTEGER, makeInteger(-15)), cons(THREE_INTEGER, makeInteger(-25)), cons(FOUR_INTEGER, makeInteger(-30)), cons(FIVE_INTEGER, makeInteger(-35)), cons(SIX_INTEGER, makeInteger(-40)), cons(SEVEN_INTEGER, makeInteger(-45)), cons(EIGHT_INTEGER, makeInteger(-50)), cons(NINE_INTEGER, makeInteger(-55)), cons(TEN_INTEGER, makeInteger(-60)), cons(THIRTEEN_INTEGER, makeInteger(-70)), cons(SEVENTEEN_INTEGER, makeInteger(-80)), cons(makeInteger(23), makeInteger(-85)), cons(makeInteger(30), makeInteger(-90)), cons(makeInteger(50), makeInteger(-95)), cons(makeInteger(70), makeInteger(-97)), cons(makeInteger(100), makeInteger(-99)), cons(makeKeyword("POSITIVE-INFINITY"), makeInteger(-100))});
  public static final SubLList $list93 = cons(makeSymbol("INPUT"), makeSymbol("OUTPUT"));
  public static final SubLSymbol $kw94$SKOLEM_COUNT = makeKeyword("SKOLEM-COUNT");
  public static final SubLList $list95 = list(makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-SKOLEM-COUNT"), makeKeyword("SCALING-FACTOR"), makeInteger(300000), makeKeyword("PRETTY-NAME"), makeString("# of Skolems"), makeKeyword("COMMENT"), makeString("Prefer working on problems with a smaller number of skolem functions."));
  public static final SubLSymbol $sym96$STRATEGIC_HEURISTIC_SKOLEM_COUNT = makeSymbol("STRATEGIC-HEURISTIC-SKOLEM-COUNT");
  public static final SubLSymbol $sym97$SKOLEM_FUNCTION_P = makeSymbol("SKOLEM-FUNCTION-P");
  public static final SubLList $list98 = list(new SubLObject[] {cons(ZERO_INTEGER, ZERO_INTEGER), cons(ONE_INTEGER, MINUS_ONE_INTEGER), cons(TWO_INTEGER, makeInteger(-2)), cons(THREE_INTEGER, makeInteger(-4)), cons(FOUR_INTEGER, makeInteger(-8)), cons(FIVE_INTEGER, makeInteger(-16)), cons(SIX_INTEGER, makeInteger(-32)), cons(SEVEN_INTEGER, makeInteger(-64)), cons(EIGHT_INTEGER, makeInteger(-99)), cons(makeKeyword("POSITIVE-INFINITY"), makeInteger(-100))});
  public static final SubLSymbol $sym99$HAPPINESS__ = makeSymbol("HAPPINESS->");
  public static final SubLSymbol $sym100$THIRD = makeSymbol("THIRD");
  public static final SubLSymbol $sym101$FOURTH = makeSymbol("FOURTH");

  //// Initializers

  public void declareFunctions() {
    declare_inference_strategic_heuristics_file();
  }

  public void initializeVariables() {
    init_inference_strategic_heuristics_file();
  }

  public void runTopLevelForms() {
    setup_inference_strategic_heuristics_file();
  }

}
