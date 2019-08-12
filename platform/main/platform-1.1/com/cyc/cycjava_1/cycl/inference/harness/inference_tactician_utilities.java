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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_abduction_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_motivation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_lookahead_productivity;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_union;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.inference.modules.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;

public  final class inference_tactician_utilities extends SubLTranslatedFile {

  //// Constructor

  private inference_tactician_utilities() {}
  public static final SubLFile me = new inference_tactician_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_utilities";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 876)
  public static final SubLObject memoized_problem_global_preference_level_internal(SubLObject problem, SubLObject strategic_context, SubLObject shared_variables) {
    return problem_global_preference_level(problem, strategic_context, shared_variables);
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 876)
  public static final SubLObject memoized_problem_global_preference_level(SubLObject problem, SubLObject strategic_context, SubLObject shared_variables) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return memoized_problem_global_preference_level_internal(problem, strategic_context, shared_variables);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_3(problem, strategic_context, shared_variables);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (problem.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (strategic_context.equal(cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (((NIL != cached_args)
                           && (NIL == cached_args.rest())
                           && shared_variables.equal(cached_args.first()))) {
                        return memoization_state.caching_results(results2);
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_problem_global_preference_level_internal(problem, strategic_context, shared_variables)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(problem, strategic_context, shared_variables));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 1157)
  public static final SubLObject problem_global_preference_level(SubLObject problem, SubLObject strategic_context, SubLObject shared_variables) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(strategic_context, $sym2$STRATEGIC_CONTEXT_P);
      {
        SubLObject preference_level = NIL;
        SubLObject justification = NIL;
        if ((NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem)))) {
          preference_level = $kw3$GROSSLY_DISPREFERRED;
          justification = $str4$removal_is_not_allowed_in_the_pro;
        } else if ((NIL != inference_datastructures_problem.closed_problem_p(problem))) {
          preference_level = $kw5$PREFERRED;
          justification = $str6$problem_is_closed;
        } else if ((NIL == shared_variables)) {
          preference_level = $kw5$PREFERRED;
          justification = $str7$no_variables_have_any_hope_of_get;
        } else {
          inference_worker.determine_strategic_status_wrt(problem, strategic_context);
          if ((NIL != problem_has_no_allowed_or_executed_tactics_wrt_removalP(problem, strategic_context))) {
            preference_level = $kw8$DISALLOWED;
            justification = $str9$problem_has_no_removal_allowed_or;
          } else if ((NIL != single_negative_literal_problem_p(problem))) {
            preference_level = ((NIL != shared_variables) ? ((SubLObject) $kw8$DISALLOWED) : $kw3$GROSSLY_DISPREFERRED);
            justification = $str10$single_negative_literal;
          } else if ((NIL != problem_has_some_complete_non_thrown_away_removal_tacticP(problem, strategic_context))) {
            preference_level = $kw5$PREFERRED;
            justification = $str11$problem_has_a_complete_non_ignore;
          } else if ((NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, strategic_context))) {
            preference_level = $kw5$PREFERRED;
            justification = $str12$problem_has_executed_a_complete_r;
          } else if ((NIL != inference_datastructures_problem.multi_literal_problem_p(problem))) {
            thread.resetMultipleValues();
            {
              SubLObject preference_level_1 = multi_literal_problem_global_preference_level(problem, $kw13$TACTICAL);
              SubLObject justification_2 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              preference_level = preference_level_1;
              justification = justification_2;
            }
          } else if ((NIL != inference_datastructures_problem.multi_clause_problem_p(problem))) {
            return inference_worker_union.$union_tactic_preference_level$.getGlobalValue();
          } else {
            thread.resetMultipleValues();
            {
              SubLObject preference_level_3 = preference_modules.problem_preference_level_wrt_modules(problem, strategic_context, shared_variables);
              SubLObject justification_4 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              preference_level = preference_level_3;
              justification = justification_4;
            }
          }
        }
        return Values.values(preference_level, justification);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 3436)
  public static final SubLObject single_negative_literal_problem_p(SubLObject problem) {
    return makeBoolean(((NIL != inference_datastructures_problem.single_literal_problem_p(problem))
           && ($kw14$NEG == inference_datastructures_problem.single_literal_problem_sense(problem))));
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 3603)
  public static final SubLObject multi_literal_problem_global_preference_level(SubLObject problem, SubLObject strategic_context) {
    {
      SubLObject max_preference_level = $kw8$DISALLOWED;
      SubLObject reason = $str15$unknown;
      SubLObject tactics = multi_literal_problem_tactics_to_activate(problem, strategic_context);
      SubLObject cdolist_list_var = tactics;
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        {
          SubLObject preference_level = inference_datastructures_strategy.conjunctive_tactic_strategic_preference_level(tactic, strategic_context);
          if ((NIL != preference_level)) {
            if ((NIL != preference_modules.preference_level_G(preference_level, max_preference_level))) {
              max_preference_level = preference_level;
              reason = inference_datastructures_strategy.conjunctive_tactic_strategic_preference_level_justification(tactic, strategic_context);
            }
          }
        }
      }
      return Values.values(max_preference_level, reason);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 4386)
  public static final SubLObject multi_literal_problem_tactics_to_activate(SubLObject problem, SubLObject strategic_context) {
    if (($kw13$TACTICAL == strategic_context)) {
      return Sequences.remove_if(Symbols.symbol_function($sym16$TRANSFORMATION_TACTIC_P), inference_datastructures_problem.problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    } else if ((NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategic_context))) {
      return list_utilities.remove_if_not(Symbols.symbol_function($sym17$TACTIC_P), inference_balanced_tactician_motivation.balanced_strategy_categorize_strategems_wrt_removal(strategic_context, problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    } else {
      return Errors.error($str18$Unexpected_strategy_type__s, strategic_context);
    }
  }

  /** Return T iff PROBLEM has some :complete non-thrown-away removal tactic. */
  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 4868)
  public static final SubLObject problem_has_some_complete_non_thrown_away_removal_tacticP(SubLObject problem, SubLObject strategic_context) {
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $kw19$GENERALIZED_REMOVAL))) {
          if ((NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context))) {
            if (((NIL == inference_datastructures_strategy.strategy_p(strategic_context))
                || (NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, $kw20$REMOVAL)))) {
              return T;
            }
          }
        }
      }
    }
    return NIL;
  }

  /** Return T iff PROBLEM has no removal-relevant tactic with a completeness of anything other than :impossible
or a preference of anything other than :disallowed. */
  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 5363)
  public static final SubLObject problem_has_no_allowed_or_executed_tactics_wrt_removalP(SubLObject problem, SubLObject strategic_context) {
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        if (((NIL != inference_datastructures_strategy.strategy_p(strategic_context))
             && (NIL != inference_datastructures_tactic.tactic_possibleP(tactic))
             && (NIL != inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, $kw20$REMOVAL)))) {
        } else if ((NIL != inference_datastructures_tactic.tactic_executedP(tactic))) {
          return NIL;
        } else {
          if ((NIL != inference_worker.content_tactic_p(tactic))) {
            if ((NIL == inference_tactician_strategic_uninterestingness.tactic_impossibleP(tactic, strategic_context))) {
              return NIL;
            }
          } else {
            if ((NIL == inference_tactician_strategic_uninterestingness.tactic_disallowedP(tactic, strategic_context))) {
              return NIL;
            }
          }
        }
      }
    }
    return T;
  }

  /**                            m      b */
  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 6185)
  private static SubLSymbol $preference_scaling_values$ = null;

  /** Assumes zero b-values */
  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 6726)
  public static final SubLObject removal_unhappiness(SubLObject productivity, SubLObject module_spec, SubLObject preference_level, SubLObject literal_count) {
    {
      SubLObject unhappiness = productivity;
      unhappiness = scale_unhappiness(unhappiness, module_scaling_factor(module_spec));
      unhappiness = scale_unhappiness(unhappiness, preference_scaling_factor(preference_level));
      unhappiness = scale_unhappiness(unhappiness, literal_count_scaling_factor(literal_count));
      return unhappiness;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 7241)
  public static final SubLObject scale_unhappiness(SubLObject unhappiness, SubLObject scaling_factor) {
    return number_utilities.potentially_infinite_integer_times_number_rounded(unhappiness, scaling_factor);
  }

  /** Assumes zero b-values */
  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 7393)
  public static final SubLObject module_scaling_factor(SubLObject module_spec) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject sf_data = list_utilities.alist_lookup_without_values($preference_scaling_values$.getDynamicValue(thread), module_spec, UNPROVIDED, UNPROVIDED);
        if ((NIL != sf_data)) {
          {
            SubLObject datum = sf_data;
            SubLObject current = datum;
            SubLObject m = NIL;
            SubLObject b = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
            m = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
            b = current.first();
            current = current.rest();
            if ((NIL == current)) {
              return m;
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list22);
            }
          }
        }
      }
      return ONE_INTEGER;
    }
  }

  /** Assumes zero b-values */
  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 7686)
  public static final SubLObject preference_scaling_factor(SubLObject preference_level) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject sf_data = list_utilities.alist_lookup_without_values($preference_scaling_values$.getDynamicValue(thread), preference_level, UNPROVIDED, UNPROVIDED);
        if ((NIL != sf_data)) {
          {
            SubLObject datum = sf_data;
            SubLObject current = datum;
            SubLObject m = NIL;
            SubLObject b = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
            m = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
            b = current.first();
            current = current.rest();
            if ((NIL == current)) {
              return m;
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list22);
            }
          }
        }
      }
      return ONE_INTEGER;
    }
  }

  /** Temporary control variable; when non-NIL we factor the number of focal literals
   in a connected conjunction tactic into account when computed the committed tactic.
   Should eventually stay T. */
  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 7993)
  private static SubLSymbol $literal_count_scaling_enabledP$ = null;

  /** Assumes zero b-values */
  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 8259)
  public static final SubLObject literal_count_scaling_factor(SubLObject literal_count) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $literal_count_scaling_enabledP$.getDynamicValue(thread))) {
        if (literal_count.numG(ONE_INTEGER)) {
          return Numbers.invert(literal_count);
        }
      }
      return ONE_INTEGER;
    }
  }

  /** @return booleanp; whether it prefers a CANDIDATE-TACTIC's
   PRODUCTIVITY, PREFERENCE, MODULE-SPEC and LITERAL-COUNT values over
   those of a COMMITTED-TACTIC. */
  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 8493)
  public static final SubLObject strategy_deems_conjunctive_tactic_spec_betterP(SubLObject candidate_tactic_productivity, SubLObject candidate_tactic_preference, SubLObject candidate_tactic_module_spec, SubLObject candidate_tactic_literal_count, SubLObject committed_tactic_productivity, SubLObject committed_tactic_preference, SubLObject committed_tactic_module_spec, SubLObject committed_tactic_literal_count) {
    if (($kw8$DISALLOWED == candidate_tactic_preference)) {
      return NIL;
    } else if (($kw8$DISALLOWED == committed_tactic_preference)) {
      return T;
    } else {
      {
        SubLObject candidate_unhappiness = removal_unhappiness(candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literal_count);
        SubLObject committed_unhappiness = removal_unhappiness(committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literal_count);
        return number_utilities.potentially_infinite_integer_L(candidate_unhappiness, committed_unhappiness);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 9604)
  public static final SubLObject magic_wand_tacticP(SubLObject tactic, SubLObject strategic_context) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != inference_abduction_utilities.abductive_strategy_p(strategic_context))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36530")))) {
        return T;
      }
      if ((NIL != inference_worker.logical_tactic_p(tactic))) {
        if ((NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic))) {
          if (ZERO_INTEGER.eql(inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context))) {
            {
              SubLObject tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
              if ((NIL != under_magic_wand_max_preference_levelP(tactic_preference_level))) {
                if ((NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context))) {
                  return T;
                }
              }
            }
          }
        } else if ((NIL != inference_worker_join.join_tactic_p(tactic))) {
          if ((NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context))) {
            thread.resetMultipleValues();
            {
              SubLObject first_mapped_problem = inference_worker_join.find_or_create_join_tactic_supporting_mapped_problems(tactic);
              SubLObject second_mapped_problem = thread.secondMultipleValue();
              thread.resetMultipleValues();
              {
                SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
                SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
                SubLObject first_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(first_problem, strategic_context);
                SubLObject second_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(second_problem, strategic_context);
                SubLObject first_problem_shared_vars = inference_worker_join.first_problem_shared_vars(first_mapped_problem, second_mapped_problem);
                SubLObject second_problem_shared_vars = inference_worker_join.second_problem_shared_vars(first_mapped_problem, second_mapped_problem);
                if (((ZERO_INTEGER.eql(first_productivity)
                       && (NIL != under_magic_wand_max_preference_levelP(memoized_problem_global_preference_level(first_problem, strategic_context, first_problem_shared_vars))))
                    || (ZERO_INTEGER.eql(second_productivity)
                       && (NIL != under_magic_wand_max_preference_levelP(memoized_problem_global_preference_level(second_problem, strategic_context, second_problem_shared_vars)))))) {
                  return T;
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Tactics with a preference level strictly higher than this will not be deemed magic wand tactics. */
  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 11657)
  private static SubLSymbol $magic_wand_max_preference_level$ = null;

  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 11830)
  public static final SubLObject under_magic_wand_max_preference_levelP(SubLObject preference_level) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return preference_modules.preference_level_LE(preference_level, $magic_wand_max_preference_level$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 11989)
  public static final SubLObject tactic_strictly_less_preferred_than_some_siblingP(SubLObject tactic, SubLObject strategic_context) {
    {
      SubLObject tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic));
      SubLObject sibling_tactic = NIL;
      for (sibling_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sibling_tactic = cdolist_list_var.first()) {
        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $kw24$LOGICAL))) {
          if ((tactic != sibling_tactic)) {
            {
              SubLObject sibling_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(sibling_tactic, strategic_context);
              if ((NIL != preference_modules.preference_level_L(tactic_preference_level, sibling_preference_level))) {
                return T;
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  public static final SubLObject declare_inference_tactician_utilities_file() {
    declareFunction(myName, "memoized_problem_global_preference_level_internal", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INTERNAL", 3, 0, false);
    declareFunction(myName, "memoized_problem_global_preference_level", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
    declareFunction(myName, "problem_global_preference_level", "PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
    declareFunction(myName, "single_negative_literal_problem_p", "SINGLE-NEGATIVE-LITERAL-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "multi_literal_problem_global_preference_level", "MULTI-LITERAL-PROBLEM-GLOBAL-PREFERENCE-LEVEL", 2, 0, false);
    declareFunction(myName, "multi_literal_problem_tactics_to_activate", "MULTI-LITERAL-PROBLEM-TACTICS-TO-ACTIVATE", 2, 0, false);
    declareFunction(myName, "problem_has_some_complete_non_thrown_away_removal_tacticP", "PROBLEM-HAS-SOME-COMPLETE-NON-THROWN-AWAY-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "problem_has_no_allowed_or_executed_tactics_wrt_removalP", "PROBLEM-HAS-NO-ALLOWED-OR-EXECUTED-TACTICS-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "removal_unhappiness", "REMOVAL-UNHAPPINESS", 4, 0, false);
    declareFunction(myName, "scale_unhappiness", "SCALE-UNHAPPINESS", 2, 0, false);
    declareFunction(myName, "module_scaling_factor", "MODULE-SCALING-FACTOR", 1, 0, false);
    declareFunction(myName, "preference_scaling_factor", "PREFERENCE-SCALING-FACTOR", 1, 0, false);
    declareFunction(myName, "literal_count_scaling_factor", "LITERAL-COUNT-SCALING-FACTOR", 1, 0, false);
    declareFunction(myName, "strategy_deems_conjunctive_tactic_spec_betterP", "STRATEGY-DEEMS-CONJUNCTIVE-TACTIC-SPEC-BETTER?", 8, 0, false);
    declareFunction(myName, "magic_wand_tacticP", "MAGIC-WAND-TACTIC?", 2, 0, false);
    declareFunction(myName, "under_magic_wand_max_preference_levelP", "UNDER-MAGIC-WAND-MAX-PREFERENCE-LEVEL?", 1, 0, false);
    declareFunction(myName, "tactic_strictly_less_preferred_than_some_siblingP", "TACTIC-STRICTLY-LESS-PREFERRED-THAN-SOME-SIBLING?", 2, 0, false);
    declareFunction(myName, "abductive_magic_wand_tacticP", "ABDUCTIVE-MAGIC-WAND-TACTIC?", 2, 0, false);
    declareFunction(myName, "abductive_strategy_chooses_only_abductive_tacticP", "ABDUCTIVE-STRATEGY-CHOOSES-ONLY-ABDUCTIVE-TACTIC?", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_tactician_utilities_file() {
    $preference_scaling_values$ = defparameter("*PREFERENCE-SCALING-VALUES*", $list21);
    $literal_count_scaling_enabledP$ = defparameter("*LITERAL-COUNT-SCALING-ENABLED?*", T);
    $magic_wand_max_preference_level$ = defparameter("*MAGIC-WAND-MAX-PREFERENCE-LEVEL*", $kw23$DISPREFERRED);
    return NIL;
  }

  public static final SubLObject setup_inference_tactician_utilities_file() {
        memoization_state.note_memoized_function($sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL = makeSymbol("MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL");
  public static final SubLSymbol $kw1$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym2$STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");
  public static final SubLSymbol $kw3$GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
  public static final SubLString $str4$removal_is_not_allowed_in_the_pro = makeString("removal is not allowed in the problem store");
  public static final SubLSymbol $kw5$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLString $str6$problem_is_closed = makeString("problem is closed");
  public static final SubLString $str7$no_variables_have_any_hope_of_get = makeString("no variables have any hope of getting bound");
  public static final SubLSymbol $kw8$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLString $str9$problem_has_no_removal_allowed_or = makeString("problem has no removal-allowed or executed tactics");
  public static final SubLString $str10$single_negative_literal = makeString("single negative literal");
  public static final SubLString $str11$problem_has_a_complete_non_ignore = makeString("problem has a complete non-ignored removal tactic");
  public static final SubLString $str12$problem_has_executed_a_complete_r = makeString("problem has executed a complete removal tactic");
  public static final SubLSymbol $kw13$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $kw14$NEG = makeKeyword("NEG");
  public static final SubLString $str15$unknown = makeString("unknown");
  public static final SubLSymbol $sym16$TRANSFORMATION_TACTIC_P = makeSymbol("TRANSFORMATION-TACTIC-P");
  public static final SubLSymbol $sym17$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLString $str18$Unexpected_strategy_type__s = makeString("Unexpected strategy type ~s");
  public static final SubLSymbol $kw19$GENERALIZED_REMOVAL = makeKeyword("GENERALIZED-REMOVAL");
  public static final SubLSymbol $kw20$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLList $list21 = list(list(makeKeyword("DISPREFERRED"), TWO_INTEGER, ZERO_INTEGER), list(makeKeyword("GROSSLY-DISPREFERRED"), TWENTY_INTEGER, ZERO_INTEGER), list(makeKeyword("JOIN-ORDERED"), FIVE_INTEGER, ZERO_INTEGER));
  public static final SubLList $list22 = list(makeSymbol("M"), makeSymbol("B"));
  public static final SubLSymbol $kw23$DISPREFERRED = makeKeyword("DISPREFERRED");
  public static final SubLSymbol $kw24$LOGICAL = makeKeyword("LOGICAL");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_inference_tactician_utilities_file();
  }

  @Override
  public void initializeVariables() {
    init_inference_tactician_utilities_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_inference_tactician_utilities_file();
  }

}
