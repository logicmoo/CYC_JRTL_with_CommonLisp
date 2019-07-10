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
import com.cyc.cycjava_1.cycl.inference.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;

//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_abduction_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_execution;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_motivation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_balanced_tactician_strategic_uninterestingness extends SubLTranslatedFile {

  //// Constructor

  private inference_balanced_tactician_strategic_uninterestingness() {}
  public static final SubLFile me = new inference_balanced_tactician_strategic_uninterestingness();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_strategic_uninterestingness";

  //// Definitions

  /** Dynamic variable for remembering the most recent explanation of strategic uninterestingness */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 1130)
  private static SubLSymbol $balanced_strategy_uninterestingness_explanation$ = null;

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 1382)
  private static SubLSymbol $the_unknown_balanced_strategy_uninterestingness_explanation$ = null;

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 1501)
  public static final SubLObject balanced_strategy_last_uninterestingness_explanation() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ((NIL != $balanced_strategy_uninterestingness_explanation$.getDynamicValue(thread)) ? ((SubLObject) $balanced_strategy_uninterestingness_explanation$.getDynamicValue(thread)) : $the_unknown_balanced_strategy_uninterestingness_explanation$.getGlobalValue());
    }
  }

  /** Whether we are gathering explanations of strategic uninterestingness */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 1891)
  public static SubLSymbol $balanced_strategy_gathering_uninterestingness_explanationsP$ = null;

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 3058)
  private static SubLSymbol $balanced_strategy_uninterestingness_explanation_table$ = null;

  /** Bound to NIL when trying to rederive the reason that something was put in the cache. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 11043)
  private static SubLSymbol $balanced_strategy_uses_already_thrown_away_cacheP$ = null;

  /** Whether :set-aside plus non-continuable should be strengthened to :throw-away for TACTIC.
   This is usually T except for special circumstances, e.g. split tactic removal lookahead when transformation is allowed. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 11295)
  public static final SubLObject balanced_strategy_set_aside_non_continuable_implies_throw_away_tacticP(SubLObject tactic, SubLObject motivation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((($kw21$REMOVAL == motivation)
           && (NIL != inference_worker_split.split_tactic_p(tactic))
           && (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))))) {
        return NIL;
      }
      return inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.getDynamicValue(thread);
    }
  }

  /** Whether :set-aside plus non-continuable should be strengthened to :throw-away for PROBLEM.
   This is usually T except for special circumstances, e.g. if PROBLEM is a split problem and transformation is allowed. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 11835)
  public static final SubLObject balanced_strategy_set_aside_non_continuable_implies_throw_away_problemP(SubLObject problem, SubLObject motivation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 14495)
  private static SubLSymbol $balanced_strategy_throw_away_problem_with_abduced_term_wrt_transformationP$ = null;

  /** @return booleanp; whether STRATEGY, after careful deliberation, chooses to throw away PROBLEM wrt MOTIVATION. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 14592)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_problemP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP) {
    if ((consider_all_tacticsP == UNPROVIDED)) {
      consider_all_tacticsP = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(motivation, $sym22$BALANCED_STRATEGY_MOTIVATION_P);
      if ((NIL != balanced_strategy_chooses_to_throw_away_problem_uncacheableP(strategy, problem, motivation, consider_all_tacticsP))) {
        return T;
      } else {
        {
          SubLObject throw_away = inference_datastructures_strategy.problem_thrown_away_cache_status_wrt_motivation(problem, strategy, motivation);
          if ((NIL != Types.booleanp(throw_away))) {
            return throw_away;
          } else {
            {
              SubLObject throw_awayP = balanced_strategy_chooses_to_throw_away_problem_cacheableP(strategy, problem, motivation, consider_all_tacticsP);
              if ((NIL != throw_awayP)) {
                if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35583");
                }
                inference_datastructures_strategy.set_problem_thrown_away_wrt(problem, strategy, motivation);
              } else {
                inference_datastructures_strategy.set_problem_not_thrown_away_wrt(problem, strategy, motivation);
              }
              return throw_awayP;
            }
          }
        }
      }
    }
  }

  /** The parts of throw-away reasoning that must always be recomputed and cannot be cached
   because it's too hard to figure out when the cache needs to be cleared.
   Or perhaps because they're really cheap to recompute. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 15805)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_problem_uncacheableP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((motivation == $kw24$TRANSFORMATION)
           && (NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35584");
        }
        return T;
      } else if (((NIL != $balanced_strategy_uses_already_thrown_away_cacheP$.getDynamicValue(thread))
           && (NIL != balanced_strategy_problem_thrown_awayP(strategy, problem, motivation)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35585");
        }
        return T;
      } else if (((NIL != consider_all_tacticsP)
           && (NIL != balanced_strategy_chooses_to_throw_away_all_tacticsP(strategy, problem, motivation, T)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35586");
        }
        return T;
      } else if (((NIL != balanced_strategy_set_aside_non_continuable_implies_throw_away_problemP(problem, motivation))
           && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))
           && (NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, motivation, T, T)))) {
        {
          SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
          if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35587");
          }
        }
        return T;
      } else {
        return NIL;
      }
    }
  }

  /** The parts of throw-away reasoning that can be cached.
   The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 17436)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_problem_cacheableP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_problemP(strategy, problem))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35588");
        }
        return T;
      } else if (((motivation == $kw24$TRANSFORMATION)
           && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))
           && (NIL == inference_datastructures_problem.problem_has_transformation_tacticsP(problem)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35589");
        }
        return T;
      } else if (((NIL != $balanced_strategy_throw_away_problem_with_abduced_term_wrt_transformationP$.getDynamicValue(thread))
           && (motivation == $kw24$TRANSFORMATION)
           && (NIL != inference_abduction_utilities.abductive_strategy_p(strategy))
           && (NIL != cycl_utilities.expression_find_if(Symbols.symbol_function($sym31$ABDUCED_TERM_P), inference_datastructures_problem.problem_query(problem), UNPROVIDED, UNPROVIDED)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35590");
        }
        return T;
      } else {
        return NIL;
      }
    }
  }

  /** @param PROBLEM-ALREADY-CONSIDERED?; whether the caller has already considered that the problem of STRATEGEM
   might be thrown away wrt MOTIVATION.  If T, the analysis will not be redone. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 18872)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_strategemP(SubLObject strategy, SubLObject strategem, SubLObject motivation, SubLObject problem_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
      {
        SubLObject tactic = strategem;
        return balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, motivation, problem_already_consideredP, UNPROVIDED);
      }
    } else {
      {
        SubLObject link = strategem;
        return balanced_strategy_chooses_to_throw_away_linkP(strategy, link, motivation, problem_already_consideredP);
      }
    }
  }

  /** @param PROBLEM-ALREADY-CONSIDERED?; whether the caller has already considered that the problem of TACTIC
   might be thrown away wrt MOTIVATION.  If T, the analysis will not be redone. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 19542)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_tacticP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((siblings_already_consideredP == UNPROVIDED)) {
      siblings_already_consideredP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(motivation, $sym22$BALANCED_STRATEGY_MOTIVATION_P);
      if (((motivation == $kw21$REMOVAL)
           && (NIL != balanced_strategy_deems_tactic_harmless_wrt_removal_motivationP(strategy, tactic)))) {
        return NIL;
      } else if ((NIL != balanced_strategy_chooses_to_throw_away_tactic_uncacheableP(strategy, tactic, motivation, problem_already_consideredP, siblings_already_consideredP))) {
        return T;
      } else {
        {
          SubLObject throw_away = inference_datastructures_strategy.tactic_thrown_away_cache_status_wrt_motivation(tactic, strategy, motivation);
          if ((NIL != Types.booleanp(throw_away))) {
            return throw_away;
          } else {
            {
              SubLObject throw_awayP = balanced_strategy_chooses_to_throw_away_tactic_cacheableP(strategy, tactic, motivation, problem_already_consideredP, siblings_already_consideredP);
              if ((NIL != throw_awayP)) {
                if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35591");
                }
                inference_datastructures_strategy.set_tactic_thrown_away_wrt(tactic, strategy, motivation);
              } else {
                inference_datastructures_strategy.set_tactic_not_thrown_away_wrt(tactic, strategy, motivation);
              }
              return throw_awayP;
            }
          }
        }
      }
    }
  }

  /** The parts of throw-away reasoning that must always be recomputed and cannot be cached
   because it's too hard to figure out when the cache needs to be cleared.
   Or perhaps because they're really cheap to recompute. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 20994)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_tactic_uncacheableP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != $balanced_strategy_uses_already_thrown_away_cacheP$.getDynamicValue(thread))
           && (NIL != balanced_strategy_tactic_thrown_awayP(strategy, tactic, motivation)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35592");
        }
        return T;
      } else if (((motivation == $kw24$TRANSFORMATION)
           && (NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35593");
        }
        return T;
      } else if ((NIL != balanced_strategy_chooses_to_throw_away_tactic_hl_module_wrt_motivationP(strategy, tactic, motivation))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35594");
        }
        return T;
      } else if ((NIL == inference_tactician_strategic_uninterestingness.strategy_admits_tactic_wrt_proof_specP(strategy, tactic))) {
        return T;
      } else if (((motivation == $kw21$REMOVAL)
           && (NIL != balanced_strategy_chooses_to_throw_away_meta_removal_tactic_wrt_removalP(strategy, tactic)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35595");
        }
        return T;
      }
      if ((NIL == problem_already_consideredP)) {
        {
          SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
          if ((NIL != balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation, NIL))) {
            {
              SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
              if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35596");
              }
            }
            return T;
          }
        }
      }
      if ((($kw21$REMOVAL == motivation)
           && (NIL != inference_worker.content_tactic_p(tactic))
           && (NIL != inference_tactician_strategic_uninterestingness.tactic_impossibleP(tactic, strategy)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35597");
        }
        return T;
      } else if (((NIL != inference_worker.logical_tactic_p(tactic))
           && (NIL != balanced_strategy_chooses_to_throw_away_tactic_lookahead_problemP(strategy, tactic, motivation)))) {
        {
          SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
          if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35598");
          }
        }
        return T;
      } else if (((motivation == $kw21$REMOVAL)
           && (NIL == siblings_already_consideredP)
           && (NIL != inference_worker_split.split_tactic_p(tactic))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35580")))) {
        return T;
      } else if (((motivation == $kw24$TRANSFORMATION)
           && (NIL != balanced_strategy_transformation_tactic_generated_enoughP(strategy, tactic)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35599");
        }
        return T;
      } else if (((NIL != balanced_strategy_set_aside_non_continuable_implies_throw_away_tacticP(tactic, motivation))
           && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))
           && (NIL != balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, motivation, T, Equality.eq(motivation, $kw21$REMOVAL), T)))) {
        {
          SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
          if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35600");
          }
        }
        return T;
      }
      return NIL;
    }
  }

  /** The parts of throw-away reasoning that can be cached.
   The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 25178)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_tactic_cacheableP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((motivation == $kw21$REMOVAL)
           && (NIL != inference_abduction_utilities.abductive_strategy_p(strategy))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36439")))) {
        if ((NIL != inference_worker.good_problem_p(inference_datastructures_tactic.tactic_problem(tactic), strategy))) {
          if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35601");
          }
          return T;
        }
        if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35379"))) {
          if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35602");
          }
          return T;
        }
      } else if ((NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35603");
        }
        return T;
      } else if (((motivation == $kw21$REMOVAL)
           && (NIL != inference_worker.connected_conjunction_tactic_p(tactic))
           && (NIL != inference_tactician_utilities.problem_has_some_complete_non_thrown_away_removal_tacticP(inference_datastructures_tactic.tactic_problem(tactic), strategy)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35604");
        }
        return T;
      } else if ((($kw21$REMOVAL == motivation)
           && (NIL != inference_worker.structural_tactic_p(tactic))
           && (NIL != inference_tactician_strategic_uninterestingness.tactic_disallowedP(tactic, strategy)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35605");
        }
        return T;
      } else if (((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic))
           && (NIL != inference_trampolines.problem_backchain_requiredP(inference_datastructures_tactic.tactic_problem(tactic)))
           && (tactic != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35628")))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35606");
        }
        return T;
      } else if (((NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread))
           && (NIL != inference_worker.connected_conjunction_tactic_p(tactic))
           && (NIL != balanced_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP(tactic)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35607");
        }
        return T;
      } else {
        return NIL;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 28289)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP(SubLObject tactic) {
    {
      SubLObject result = NIL;
      SubLObject tactic_var = tactic;
      SubLObject rest = NIL;
      for (rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic_var)); (!(((NIL != result)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject sibling_tactic = rest.first();
          if ((sibling_tactic != tactic_var)) {
            if ((NIL != inference_worker_restriction.simplification_tactic_p(sibling_tactic))) {
              result = T;
            }
          }
        }
      }
      return result;
    }
  }

  /** @param PROBLEM-ALREADY-CONSIDERED?; whether the caller has already considered that the supported problem of LINK
   might be thrown away wrt MOTIVATION.  If T, the analysis will not be redone. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 28576)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_linkP(SubLObject strategy, SubLObject link, SubLObject motivation, SubLObject problem_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(motivation, $sym22$BALANCED_STRATEGY_MOTIVATION_P);
      if ((NIL == problem_already_consideredP)) {
        {
          SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
          if ((NIL != balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation, UNPROVIDED))) {
            {
              SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
              if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35608");
              }
            }
            return T;
          }
        }
      }
      if (((motivation == $kw24$TRANSFORMATION)
           && (NIL != inference_worker.connected_conjunction_link_p(link))
           && (NIL != balanced_strategy_link_has_sibling_early_removal_linkP(strategy, link)))) {
        {
          SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
          if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35609");
          }
        }
        return T;
      } else if (((motivation == $kw24$TRANSFORMATION)
           && (NIL != inference_worker_transformation.transformation_link_p(link))
           && (NIL == inference_datastructures_inference.inference_allows_use_of_ruleP(inference_datastructures_strategy.strategy_inference(strategy), inference_worker_transformation.transformation_link_rule_assertion(link))))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35610");
        }
      } else {
        return NIL;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 30145)
  public static final SubLObject why_balanced_strategy_chooses_to_ignore_new_root(SubLObject strategy, SubLObject problem) {
    if ((NIL != inference_datastructures_problem.problem_invalid_p(problem))) {
      return $kw50$INVALID;
    } else if ((NIL != balanced_strategy_chooses_to_throw_away_new_rootP(strategy, problem))) {
      return $kw51$THROW_AWAY;
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 30417)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_new_rootP(SubLObject strategy, SubLObject problem) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw52$THROW_AWAY_NEW_ROOT, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 30572)
  public static final SubLObject balanced_strategy_default_chooses_to_throw_away_new_rootP(SubLObject strategy, SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == inference_balanced_tactician_execution.balanced_strategy_new_root_next_motivation(strategy, problem))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35611");
        }
        return T;
      } else {
        return NIL;
      }
    }
  }

  /** @return booleanp; whether STRATEGY, after careful deliberation, chooses to set aside PROBLEM wrt MOTIVATION. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 30907)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_problemP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
    if ((consider_all_tacticsP == UNPROVIDED)) {
      consider_all_tacticsP = T;
    }
    if ((thrown_away_already_consideredP == UNPROVIDED)) {
      thrown_away_already_consideredP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(motivation, $sym22$BALANCED_STRATEGY_MOTIVATION_P);
      if ((NIL != balanced_strategy_chooses_to_set_aside_problem_uncacheableP(strategy, problem, motivation, consider_all_tacticsP, thrown_away_already_consideredP))) {
        return T;
      } else {
        {
          SubLObject set_aside = inference_datastructures_strategy.problem_set_aside_cache_status_wrt_motivation(problem, strategy, motivation);
          if ((NIL != Types.booleanp(set_aside))) {
            return set_aside;
          } else {
            {
              SubLObject set_asideP = balanced_strategy_chooses_to_set_aside_problem_cacheableP(strategy, problem, motivation, consider_all_tacticsP, thrown_away_already_consideredP);
              if ((NIL != set_asideP)) {
                if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35612");
                }
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36453");
              } else {
                inference_datastructures_strategy.set_problem_not_set_aside_wrt(problem, strategy, motivation);
              }
              return set_asideP;
            }
          }
        }
      }
    }
  }

  /** The parts of set-aside reasoning that must always be recomputed and cannot be cached
   because it's too hard to figure out when the cache needs to be cleared.
   Or perhaps because they're really cheap to recompute. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 32134)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_problem_uncacheableP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((motivation == $kw24$TRANSFORMATION)
           && (NIL != inference_tactician.strategy_sets_aside_all_transformationP(strategy)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35613");
        }
        return T;
      } else if ((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_set_asideP(strategy, problem, motivation))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35614");
        }
        return T;
      } else if (((NIL != consider_all_tacticsP)
           && (NIL != inference_datastructures_strategy.strategically_possible_problem_p(problem, strategy))
           && (NIL != balanced_strategy_chooses_to_set_aside_all_tacticsP(strategy, problem, motivation, T)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35615");
        }
        return T;
      } else {
        return NIL;
      }
    }
  }

  /** The parts of set-aside reasoning that can be cached.
   The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 33312)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_problem_cacheableP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL == thrown_away_already_consideredP)
           && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_problemP(strategy, problem)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35616");
        }
        return T;
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 34071)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_strategemP(SubLObject strategy, SubLObject strategem, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((thrown_away_already_consideredP == UNPROVIDED)) {
      thrown_away_already_consideredP = NIL;
    }
    if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
      {
        SubLObject tactic = strategem;
        return balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, motivation, problem_already_consideredP, NIL, thrown_away_already_consideredP);
      }
    } else {
      {
        SubLObject link = strategem;
        return balanced_strategy_chooses_to_set_aside_linkP(strategy, link, motivation, problem_already_consideredP, thrown_away_already_consideredP);
      }
    }
  }

  /** @param PROBLEM-ALREADY-CONSIDERED?; whether the caller has already considered that the problem of TACTIC
    might be set aside wrt MOTIVATION.  If T, the analysis will not be redone.
   @param THROWN-AWAY-ALREADY-CONSIDERED?; don't redo work if this is being called from balanced-strategy-chooses-to-throw-away-tactic? */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 34646)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_tacticP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((siblings_already_consideredP == UNPROVIDED)) {
      siblings_already_consideredP = NIL;
    }
    if ((thrown_away_already_consideredP == UNPROVIDED)) {
      thrown_away_already_consideredP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(motivation, $sym22$BALANCED_STRATEGY_MOTIVATION_P);
      if (((motivation == $kw21$REMOVAL)
           && (NIL != balanced_strategy_deems_tactic_harmless_wrt_removal_motivationP(strategy, tactic)))) {
        return NIL;
      } else if ((NIL != balanced_strategy_chooses_to_set_aside_tactic_uncacheableP(strategy, tactic, motivation, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP))) {
        return T;
      } else {
        {
          SubLObject set_aside = inference_datastructures_strategy.tactic_set_aside_cache_status_wrt_motivation(tactic, strategy, motivation);
          if ((NIL != Types.booleanp(set_aside))) {
            return set_aside;
          } else {
            {
              SubLObject set_asideP = balanced_strategy_chooses_to_set_aside_tactic_cacheableP(strategy, tactic, motivation, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP);
              if ((NIL != set_asideP)) {
                if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35617");
                }
                inference_datastructures_strategy.set_tactic_set_aside_wrt(tactic, strategy, motivation);
              } else {
                inference_datastructures_strategy.set_tactic_not_set_aside_wrt(tactic, strategy, motivation);
              }
              return set_asideP;
            }
          }
        }
      }
    }
  }

  /** The parts of set-aside reasoning that must always be recomputed and cannot be cached
   because it's too hard to figure out when the cache needs to be cleared.
   Or perhaps because they're really cheap to recompute. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 36241)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_tactic_uncacheableP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != balanced_strategy_tactic_set_asideP(strategy, tactic, motivation))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35618");
        }
        return T;
      } else if (((NIL == thrown_away_already_consideredP)
           && (motivation == $kw24$TRANSFORMATION)
           && (NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35619");
        }
        return T;
      } else if (((motivation == $kw24$TRANSFORMATION)
           && (NIL != inference_tactician.strategy_sets_aside_all_transformationP(strategy)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35620");
        }
        return T;
      }
      if ((NIL == problem_already_consideredP)) {
        {
          SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
          if ((NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, motivation, NIL, thrown_away_already_consideredP))) {
            {
              SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
              if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35621");
              }
            }
            return T;
          }
        }
      }
      if (((motivation == $kw21$REMOVAL)
           && (NIL != inference_worker.logical_tactic_p(tactic))
           && (NIL != balanced_strategy_chooses_to_set_aside_tactic_lookahead_problemP(strategy, tactic, motivation)))) {
        {
          SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
          if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35622");
          }
        }
        return T;
      } else if (((motivation == $kw21$REMOVAL)
           && (NIL == siblings_already_consideredP)
           && (NIL != inference_worker_split.split_tactic_p(tactic))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35577")))) {
        return T;
      } else {
        return NIL;
      }
    }
  }

  /** The parts of set-aside reasoning that can be cached.
   The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 38796)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_tactic_cacheableP(SubLObject strategy, SubLObject tactic, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL == thrown_away_already_consideredP)
           && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35623");
        }
        return T;
      } else if (((motivation == $kw24$TRANSFORMATION)
           && (NIL != inference_worker.logical_tactic_p(tactic))
           && (NIL == inference_worker.logical_tactic_transformation_allowed_wrt_max_transformation_depthP(inference_datastructures_strategy.strategy_inference(strategy), tactic)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35624");
        }
        return T;
      } else if (((motivation == $kw21$REMOVAL)
           && (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic))
           && (NIL != balanced_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP(strategy, tactic, UNPROVIDED)))) {
        if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35625");
        }
        return T;
      }
      return NIL;
    }
  }

  /** @return booleanp; whether STRATEGY deems that TACTIC has already generated enough transformation
tactics.  TACTIC must be a transformation tactic generator tactic, like TRANS-PREDICATE-POS. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 40322)
  public static final SubLObject balanced_strategy_transformation_tactic_generated_enoughP(SubLObject strategy, SubLObject tactic) {
    if ((NIL != inference_worker_transformation.transformation_generator_tactic_p(tactic))) {
      {
        SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
        if ((NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference))) {
          {
            SubLObject allowed_rule_count = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35726");
            if (ZERO_INTEGER.eql(allowed_rule_count)) {
              return T;
            }
            if ((NIL != subl_promotions.positive_integer_p(allowed_rule_count))) {
              {
                SubLObject count = ZERO_INTEGER;
                SubLObject all_allowed_rule_tactics_already_generatedP = NIL;
                SubLObject rest = NIL;
                for (rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic)); (!(((NIL != all_allowed_rule_tactics_already_generatedP)
                      || (NIL == rest)))); rest = rest.rest()) {
                  {
                    SubLObject transformation_tactic = rest.first();
                    if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, $kw24$TRANSFORMATION))
                         && (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(transformation_tactic, inference_datastructures_tactic.tactic_hl_module(tactic))))) {
                      {
                        SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
                        if ((NIL != rule)) {
                          if ((NIL != inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule))) {
                            count = Numbers.add(count, ONE_INTEGER);
                            if (count.numE(allowed_rule_count)) {
                              all_allowed_rule_tactics_already_generatedP = T;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return all_allowed_rule_tactics_already_generatedP;
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  /** @param PROBLEM-ALREADY-CONSIDERED?; whether the caller has already considered that the supported problem of LINK
   might be set aside wrt MOTIVATION.  If T, the analysis will not be redone. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 41990)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_linkP(SubLObject strategy, SubLObject link, SubLObject motivation, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((thrown_away_already_consideredP == UNPROVIDED)) {
      thrown_away_already_consideredP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(motivation, $sym22$BALANCED_STRATEGY_MOTIVATION_P);
      if ((NIL == problem_already_consideredP)) {
        {
          SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
          if ((NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, motivation, T, thrown_away_already_consideredP))) {
            {
              SubLObject subexplanation = balanced_strategy_last_uninterestingness_explanation();
              if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35626");
              }
            }
            return T;
          }
        }
      }
      return NIL;
    }
  }

  /** @return strategic-uninterestingness-reason-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 43754)
  public static final SubLObject why_balanced_strategy_chooses_to_ignore_strategem(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
    if ((NIL != inference_tactician.strategem_invalid_p(strategem))) {
      return $kw50$INVALID;
    } else if (((NIL != inference_worker.content_tactic_p(strategem))
         && (NIL != inference_datastructures_tactic.tactic_not_possibleP(strategem)))) {
      return $kw51$THROW_AWAY;
    } else if ((NIL != balanced_strategy_chooses_to_throw_away_strategemP(strategy, strategem, motivation, UNPROVIDED))) {
      return $kw51$THROW_AWAY;
    } else if ((NIL != balanced_strategy_chooses_to_set_aside_strategemP(strategy, strategem, motivation, NIL, T))) {
      return $kw63$SET_ASIDE;
    } else if ((NIL == inference_datastructures_problem.problem_relevant_to_strategyP(inference_tactician.strategem_problem(strategem), strategy))) {
      return $kw64$IRRELEVANT;
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 45031)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_all_tacticsP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject problem_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((NIL == problem_already_consideredP)) {
      if ((NIL != balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation, UNPROVIDED))) {
        return T;
      }
    }
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        if ((NIL == balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, motivation, T, UNPROVIDED))) {
          return NIL;
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 45476)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_all_tacticsP(SubLObject strategy, SubLObject problem, SubLObject motivation, SubLObject problem_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((NIL == problem_already_consideredP)) {
      if ((NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, motivation, UNPROVIDED, UNPROVIDED))) {
        return T;
      }
    }
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        if ((NIL == balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, motivation, T, UNPROVIDED, UNPROVIDED))) {
          return NIL;
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 46418)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP(SubLObject strategy, SubLObject jo_tactic, SubLObject problem_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    {
      SubLObject lookahead_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(jo_tactic);
      return makeBoolean(((NIL == inference_datastructures_problem.single_literal_problem_p(lookahead_problem))
             && (NIL != inference_datastructures_problem.problem_has_tactic_of_typeP(lookahead_problem, $kw65$REMOVAL_CONJUNCTIVE))
             && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35575"))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 47463)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_connected_conjunction_link_wrt_removalP(SubLObject strategy, SubLObject link) {
    {
      SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
      if ((NIL != balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, $kw21$REMOVAL, UNPROVIDED, UNPROVIDED))) {
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 47741)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_connected_conjunction_link_wrt_removalP(SubLObject strategy, SubLObject link) {
    {
      SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
      if ((NIL != balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, $kw21$REMOVAL, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
        return T;
      }
    }
    return NIL;
  }

  /** Return T iff STRATEGY throws away all tactics involving the HL module of TACTIC wrt MOTIVATION. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 49200)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_tactic_hl_module_wrt_motivationP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
    if (((motivation == $kw24$TRANSFORMATION)
         && (NIL != inference_worker_join.join_tactic_p(tactic)))) {
      return T;
    } else if (((motivation == $kw21$REMOVAL)
         && (NIL != inference_worker_transformation.transformation_tactic_p(tactic)))) {
      return T;
    } else {
      return NIL;
    }
  }

  /** @return booleanp; whether PROBLEM has MOTIVATION according to STRATEGY,
   but is no longer active or set-aside. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 51212)
  public static final SubLObject balanced_strategy_problem_thrown_awayP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
    checkType(strategy, $sym72$BALANCED_STRATEGY_P);
    checkType(problem, $sym18$PROBLEM_P);
    checkType(motivation, $sym22$BALANCED_STRATEGY_MOTIVATION_P);
    return makeBoolean(((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_pendingP(strategy, problem, motivation))
           && (NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_set_asideP(strategy, problem, motivation))));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 51760)
  public static final SubLObject balanced_strategy_tactic_thrown_awayP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
    return inference_balanced_tactician_datastructures.balanced_strategy_strategem_thrown_awayP(strategy, tactic, motivation);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 51923)
  public static final SubLObject balanced_strategy_tactic_set_asideP(SubLObject strategy, SubLObject tactic, SubLObject motivation) {
    return inference_balanced_tactician_datastructures.balanced_strategy_strategem_set_asideP(strategy, tactic, motivation);
  }

  /** Temporary control variable; should eventually stay T
   Disable the code that gives tactics removal motivation when they possibly otherwise would not. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 52082)
  private static SubLSymbol $suppress_balanced_strategy_can_deem_tactics_harmless_wrt_removal_motivationP$ = null;

  /** @return booleanp; whether STRATEGY deems it harmless to propagate removal motivation to TACTIC,
   even if it appears pointless to do so.  One such case is the 'law of R',
   which states that if TACTIC is a logical tactic whose lookahead problem(s) have R,
   then it can't hurt to give R to TACTIC.  This is occasionally necessary, in cases of massive
   problem reuse, to trigger the propagation of R to some argument* link via transformation
   and/or residual transformation. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 52367)
  public static final SubLObject balanced_strategy_deems_tactic_harmless_wrt_removal_motivationP(SubLObject strategy, SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $suppress_balanced_strategy_can_deem_tactics_harmless_wrt_removal_motivationP$.getDynamicValue(thread))) {
        return NIL;
      }
      if (((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35582")))) {
        return T;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 54317)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_tactic_lookahead_problemP(SubLObject strategy, SubLObject logical_tactic, SubLObject motivation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(motivation, $sym22$BALANCED_STRATEGY_MOTIVATION_P);
      if ((NIL != inference_worker_join.join_tactic_p(logical_tactic))) {
        thread.resetMultipleValues();
        {
          SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
          SubLObject second_problem = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if (((NIL == first_problem)
              || (NIL == second_problem))) {
            return NIL;
          } else if (((NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy))
              || (NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy)))) {
            return NIL;
          } else if (((NIL != balanced_strategy_chooses_to_throw_away_lookahead_problemP(strategy, first_problem, motivation))
              || (NIL != balanced_strategy_chooses_to_throw_away_lookahead_problemP(strategy, second_problem, motivation)))) {
            return T;
          }
        }
      } else {
        {
          SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
          if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy))) {
            return NIL;
          } else {
            if (((NIL != lookahead_problem)
                 && (NIL != balanced_strategy_chooses_to_throw_away_lookahead_problemP(strategy, lookahead_problem, motivation)))) {
              return T;
            }
          }
        }
      }
      if ((motivation == $kw24$TRANSFORMATION)) {
        {
          SubLObject link = inference_worker.logical_tactic_link(logical_tactic);
          if ((NIL != balanced_strategy_chooses_to_throw_away_linkP(strategy, link, motivation, T))) {
            return T;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 56322)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_lookahead_problemP(SubLObject strategy, SubLObject lookahead_problem, SubLObject motivation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = $balanced_strategy_uses_already_thrown_away_cacheP$.currentBinding(thread);
          try {
            $balanced_strategy_uses_already_thrown_away_cacheP$.bind(makeBoolean(((motivation == $kw21$REMOVAL)
                   && (NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem))
                   && (NIL != inference_datastructures_problem.closed_problem_p(lookahead_problem)))), thread);
            answer = balanced_strategy_chooses_to_throw_away_problemP(strategy, lookahead_problem, motivation, UNPROVIDED);
          } finally {
            $balanced_strategy_uses_already_thrown_away_cacheP$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 59267)
  public static final SubLObject balanced_strategy_link_has_sibling_early_removal_linkP(SubLObject strategy, SubLObject link) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == inference_balanced_tactician_motivation.balanced_strategy_early_removal_linkP(strategy, link))) {
        {
          SubLObject link_var = link;
          SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link_var);
          SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
          SubLObject state = NIL;
          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            {
              SubLObject sibling_link = set_contents.do_set_contents_next(basis_object, state);
              if ((NIL != set_contents.do_set_contents_element_validP(state, sibling_link))) {
                if ((link_var != sibling_link)) {
                  if ((NIL != inference_balanced_tactician_motivation.balanced_strategy_early_removal_linkP(strategy, sibling_link))) {
                    if ((NIL != $balanced_strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35627");
                    }
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
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 60378)
  public static final SubLObject balanced_strategy_chooses_to_set_aside_tactic_lookahead_problemP(SubLObject strategy, SubLObject logical_tactic, SubLObject motivation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_worker_join.join_tactic_p(logical_tactic))) {
        thread.resetMultipleValues();
        {
          SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
          SubLObject second_problem = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if (((NIL == first_problem)
              || (NIL == second_problem))) {
            return NIL;
          } else if (((NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy))
              || (NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy)))) {
            return NIL;
          } else if (((NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, first_problem, motivation, UNPROVIDED, UNPROVIDED))
              || (NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, second_problem, motivation, UNPROVIDED, UNPROVIDED)))) {
            return T;
          }
        }
      } else {
        {
          SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
          if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy))) {
            return NIL;
          } else {
            if ((NIL != balanced_strategy_chooses_to_set_aside_problemP(strategy, lookahead_problem, motivation, UNPROVIDED, UNPROVIDED))) {
              return T;
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Temporary control parameter;
   When non-nil, the set-aside policy for split tactics is weakened to be more conservative. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 61767)
  public static SubLSymbol $balanced_strategy_weaken_split_tactic_set_aside_policyP$ = null;

  /** STRATEGY should throw away META-REMOVAL-TACTIC if it has a sibling tactic that is tactically possible but disallowed by STRATEGY,
   because then the intended completeness of META-REMOVAL-TACTIC is inapplicable. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 64654)
  public static final SubLObject balanced_strategy_chooses_to_throw_away_meta_removal_tactic_wrt_removalP(SubLObject strategy, SubLObject meta_removal_tactic) {
    if ((NIL != inference_worker_removal.meta_removal_tactic_p(meta_removal_tactic))) {
      {
        SubLObject sibling_disallowed_tacticP = NIL;
        SubLObject rest = NIL;
        for (rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(meta_removal_tactic)); (!(((NIL != sibling_disallowed_tacticP)
              || (NIL == rest)))); rest = rest.rest()) {
          {
            SubLObject removal_tactic = rest.first();
            if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $kw78$GENERALIZED_REMOVAL))
                 && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $kw79$POSSIBLE)))) {
              if ((removal_tactic != meta_removal_tactic)) {
                if ((NIL == inference_datastructures_inference.inference_allows_use_of_moduleP(inference_datastructures_strategy.strategy_inference(strategy), inference_datastructures_tactic.tactic_hl_module(removal_tactic)))) {
                  sibling_disallowed_tacticP = T;
                }
              }
            }
          }
        }
        return sibling_disallowed_tacticP;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 65570)
  public static final SubLObject balanced_strategy_throw_away_uninteresting_set_asides(SubLObject strategy) {
    {
      SubLObject total_thrown_away_count = ZERO_INTEGER;
      SubLObject thrown_away_count = balanced_strategy_throw_away_uninteresting_set_asides_int(strategy);
      total_thrown_away_count = Numbers.add(total_thrown_away_count, thrown_away_count);
      while (thrown_away_count.isPositive()) {
        thrown_away_count = balanced_strategy_throw_away_uninteresting_set_asides_int(strategy);
        total_thrown_away_count = Numbers.add(total_thrown_away_count, thrown_away_count);
      }
      return total_thrown_away_count;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 66261)
  public static final SubLObject balanced_strategy_throw_away_uninteresting_set_asides_int(SubLObject strategy) {
    {
      SubLObject set_aside_problems = balanced_strategy_set_aside_problems_to_reconsider(strategy);
      inference_datastructures_strategy.strategy_clear_set_asides(strategy);
      {
        SubLObject thrown_away_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = set_aside_problems;
        SubLObject set_aside_problem = NIL;
        for (set_aside_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), set_aside_problem = cdolist_list_var.first()) {
          if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35574"))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35462");
          } else {
            thrown_away_count = Numbers.add(thrown_away_count, ONE_INTEGER);
          }
        }
        return thrown_away_count;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 67122)
  public static final SubLObject balanced_strategy_reconsider_set_asides(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      inference_balanced_tactician_datastructures.balanced_strategy_clear_set_aside_problems(strategy);
      {
        SubLObject reactivated_count = ZERO_INTEGER;
        {
          SubLObject _prev_bind_0 = inference_worker.$reconsidering_set_asidesP$.currentBinding(thread);
          try {
            inference_worker.$reconsidering_set_asidesP$.bind(T, thread);
            inference_datastructures_strategy.clear_strategy_should_reconsider_set_asides(strategy);
            {
              SubLObject set_aside_problems = inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
              inference_datastructures_strategy.strategy_clear_set_asides(strategy);
              {
                SubLObject set_aside_problems_in_order = Sort.sort(set_aside_problems, Symbols.symbol_function($sym80$_), Symbols.symbol_function($sym81$PROBLEM_SUID));
                SubLObject cdolist_list_var = set_aside_problems_in_order;
                SubLObject set_aside_problem = NIL;
                for (set_aside_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), set_aside_problem = cdolist_list_var.first()) {
                  if ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35629"))) {
                    reactivated_count = Numbers.add(reactivated_count, ONE_INTEGER);
                  }
                }
              }
            }
          } finally {
            inference_worker.$reconsidering_set_asidesP$.rebind(_prev_bind_0, thread);
          }
        }
        return reactivated_count;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-strategic-uninterestingness.lisp", position = 68024)
  public static final SubLObject balanced_strategy_set_aside_problems_to_reconsider(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
  }

  public static final SubLObject declare_inference_balanced_tactician_strategic_uninterestingness_file() {
    declareFunction(myName, "balanced_strategy_last_uninterestingness_explanation", "BALANCED-STRATEGY-LAST-UNINTERESTINGNESS-EXPLANATION", 0, 0, false);
    declareMacro(myName, "with_balanced_strategy_uninterestingness_explanations", "WITH-BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATIONS");
    declareFunction(myName, "balanced_strategy_note_uninterestingness_explanation", "BALANCED-STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION", 5, 0, false);
    declareMacro(myName, "balanced_strategy_possibly_note_uninterestingness_explanation", "BALANCED-STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");
    declareFunction(myName, "balanced_strategy_uninterestingness_explanation_string", "BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-STRING", 1, 0, false);
    declareFunction(myName, "balanced_strategy_uninterestingness_explanation_type_p", "BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P", 1, 0, false);
    declareFunction(myName, "balanced_strategy_uninterestingness_explanation_p", "BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-P", 1, 0, false);
    declareFunction(myName, "balanced_strategy_uninterestingness_subexplanation_p", "BALANCED-STRATEGY-UNINTERESTINGNESS-SUBEXPLANATION-P", 1, 0, false);
    declareFunction(myName, "make_balanced_strategy_uninterestingness_explanation", "MAKE-BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION", 1, 4, false);
    declareFunction(myName, "balanced_strategy_uninterestingness_explanation_type", "BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE", 1, 0, false);
    declareFunction(myName, "balanced_strategy_set_aside_non_continuable_implies_throw_away_tacticP", "BALANCED-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-TACTIC?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_set_aside_non_continuable_implies_throw_away_problemP", "BALANCED-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-PROBLEM?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_why_problem_already_thrown_awayP", "BALANCED-STRATEGY-WHY-PROBLEM-ALREADY-THROWN-AWAY?", 3, 0, false);
    declareFunction(myName, "rederive_why_balanced_strategy_chooses_to_throw_away_problemP", "REDERIVE-WHY-BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_problemP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 3, 1, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_problem_uncacheableP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-UNCACHEABLE?", 4, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_problem_cacheableP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-CACHEABLE?", 4, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_strategemP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-STRATEGEM?", 3, 1, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 3, 2, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_tactic_uncacheableP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-UNCACHEABLE?", 5, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_tactic_cacheableP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-CACHEABLE?", 5, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-WITH-SIBLING-SIMPLIFICATION-TACTIC?", 1, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_linkP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-LINK?", 3, 1, false);
    declareFunction(myName, "why_balanced_strategy_chooses_to_ignore_new_root", "WHY-BALANCED-STRATEGY-CHOOSES-TO-IGNORE-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_new_rootP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_default_chooses_to_throw_away_new_rootP", "BALANCED-STRATEGY-DEFAULT-CHOOSES-TO-THROW-AWAY-NEW-ROOT?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_problemP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 3, 2, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_problem_uncacheableP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-UNCACHEABLE?", 5, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_problem_cacheableP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-CACHEABLE?", 5, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_strategemP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-STRATEGEM?", 3, 2, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 3, 3, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_tactic_uncacheableP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-UNCACHEABLE?", 6, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_tactic_cacheableP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-CACHEABLE?", 6, 0, false);
    declareFunction(myName, "balanced_strategy_transformation_tactic_generated_enoughP", "BALANCED-STRATEGY-TRANSFORMATION-TACTIC-GENERATED-ENOUGH?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_linkP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-LINK?", 3, 2, false);
    declareFunction(myName, "balanced_strategy_chooses_to_ignore_problemP", "BALANCED-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 3, 0, false);
    declareFunction(myName, "why_balanced_strategy_chooses_to_ignore_problem", "WHY-BALANCED-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM", 3, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_ignore_strategemP", "BALANCED-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM?", 3, 0, false);
    declareFunction(myName, "why_balanced_strategy_chooses_to_ignore_strategem", "WHY-BALANCED-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM", 3, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_ignore_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_ignore_linkP", "BALANCED-STRATEGY-CHOOSES-TO-IGNORE-LINK?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_all_tactics_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-ALL-TACTICS-WRT-REMOVAL?", 2, 1, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_all_tacticsP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-ALL-TACTICS?", 3, 1, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_all_tacticsP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-TACTICS?", 3, 1, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-CONJUNCTIVE-REMOVAL-TACTICS?", 2, 1, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-JOIN-ORDERED-TACTIC-DUE-TO-CONJUNCTIVE-REMOVAL?", 2, 1, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_disjunctive_link_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-DISJUNCTIVE-LINK-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_disjunctive_link_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-DISJUNCTIVE-LINK-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_connected_conjunction_link_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-CONNECTED-CONJUNCTION-LINK-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_connected_conjunction_link_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-CONNECTED-CONJUNCTION-LINK-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_totally_set_aside_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-TOTALLY-SET-ASIDE-TACTIC?", 2, 2, false);
    declareFunction(myName, "balanced_strategy_chooses_to_totally_throw_away_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 2, 2, false);
    declareFunction(myName, "balanced_strategy_chooses_to_totally_ignore_tacticP", "BALANCED-STRATEGY-CHOOSES-TO-TOTALLY-IGNORE-TACTIC?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_tactic_hl_module_wrt_motivationP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-HL-MODULE-WRT-MOTIVATION?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_preferred_backchain_required_join_ordered_tactic_internal", "BALANCED-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC-INTERNAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_preferred_backchain_required_join_ordered_tactic", "BALANCED-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC", 2, 0, false);
    declareFunction(myName, "balanced_strategy_total_transformation_productivity", "BALANCED-STRATEGY-TOTAL-TRANSFORMATION-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_thrown_awayP", "BALANCED-STRATEGY-PROBLEM-THROWN-AWAY?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_tactic_thrown_awayP", "BALANCED-STRATEGY-TACTIC-THROWN-AWAY?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_tactic_set_asideP", "BALANCED-STRATEGY-TACTIC-SET-ASIDE?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_deems_tactic_harmless_wrt_removal_motivationP", "BALANCED-STRATEGY-DEEMS-TACTIC-HARMLESS-WRT-REMOVAL-MOTIVATION?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_deems_link_harmless_wrt_removal_motivationP", "BALANCED-STRATEGY-DEEMS-LINK-HARMLESS-WRT-REMOVAL-MOTIVATION?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_tactic_lookahead_problemP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-LOOKAHEAD-PROBLEM?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_lookahead_problemP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-LOOKAHEAD-PROBLEM?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_split_tactic_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-SPLIT-TACTIC-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_sibling_split_tactic_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-SIBLING-SPLIT-TACTIC-WRT-REMOVAL?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_link_has_sibling_early_removal_linkP", "BALANCED-STRATEGY-LINK-HAS-SIBLING-EARLY-REMOVAL-LINK?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_not_to_activate_any_strategems_on_problemP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-ANY-STRATEGEMS-ON-PROBLEM?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_tactic_lookahead_problemP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-LOOKAHEAD-PROBLEM?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_set_aside_split_tactic_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-SET-ASIDE-SPLIT-TACTIC-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_throw_away_meta_removal_tactic_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-TO-THROW-AWAY-META-REMOVAL-TACTIC-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_throw_away_uninteresting_set_asides", "BALANCED-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
    declareFunction(myName, "balanced_strategy_throw_away_uninteresting_set_asides_int", "BALANCED-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES-INT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_chooses_to_leave_problem_set_asideP", "BALANCED-STRATEGY-CHOOSES-TO-LEAVE-PROBLEM-SET-ASIDE?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_reconsider_set_asides", "BALANCED-STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
    declareFunction(myName, "balanced_strategy_set_aside_problems_to_reconsider", "BALANCED-STRATEGY-SET-ASIDE-PROBLEMS-TO-RECONSIDER", 1, 0, false);
    declareFunction(myName, "balanced_strategy_reconsider_one_set_aside", "BALANCED-STRATEGY-RECONSIDER-ONE-SET-ASIDE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_balanced_tactician_strategic_uninterestingness_file() {
    $balanced_strategy_uninterestingness_explanation$ = defparameter("*BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", NIL);
    $the_unknown_balanced_strategy_uninterestingness_explanation$ = deflexical("*THE-UNKNOWN-BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION*", $list0);
    $balanced_strategy_gathering_uninterestingness_explanationsP$ = defparameter("*BALANCED-STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*", NIL);
    $balanced_strategy_uninterestingness_explanation_table$ = deflexical("*BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-TABLE*", $list15);
    $balanced_strategy_uses_already_thrown_away_cacheP$ = defparameter("*BALANCED-STRATEGY-USES-ALREADY-THROWN-AWAY-CACHE?*", T);
    $balanced_strategy_throw_away_problem_with_abduced_term_wrt_transformationP$ = defvar("*BALANCED-STRATEGY-THROW-AWAY-PROBLEM-WITH-ABDUCED-TERM-WRT-TRANSFORMATION?*", T);
    $suppress_balanced_strategy_can_deem_tactics_harmless_wrt_removal_motivationP$ = defparameter("*SUPPRESS-BALANCED-STRATEGY-CAN-DEEM-TACTICS-HARMLESS-WRT-REMOVAL-MOTIVATION?*", T);
    $balanced_strategy_weaken_split_tactic_set_aside_policyP$ = defparameter("*BALANCED-STRATEGY-WEAKEN-SPLIT-TACTIC-SET-ASIDE-POLICY?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_inference_balanced_tactician_strategic_uninterestingness_file() {
    // CVS_ID("Id: inference-balanced-tactician-strategic-uninterestingness.lisp 128499 2009-08-06 15:49:24Z pace ");
    access_macros.register_macro_helper($sym3$BALANCED_STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION, $sym4$BALANCED_STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION);
    memoization_state.note_memoized_function($sym66$BALANCED_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTI);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("UNKNOWN-REASON"), NIL, NIL, NIL, NIL);
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLList $list2 = list(list(makeSymbol("*BALANCED-STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*"), T));
  public static final SubLSymbol $sym3$BALANCED_STRATEGY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol("BALANCED-STRATEGY-NOTE-UNINTERESTINGNESS-EXPLANATION");
  public static final SubLSymbol $sym4$BALANCED_STRATEGY_POSSIBLY_NOTE_UNINTERESTINGNESS_EXPLANATION = makeSymbol("BALANCED-STRATEGY-POSSIBLY-NOTE-UNINTERESTINGNESS-EXPLANATION");
  public static final SubLSymbol $sym5$BALANCED_STRATEGY_UNINTERESTINGNESS_EXPLANATION_P = makeSymbol("BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-P");
  public static final SubLList $list6 = list(makeSymbol("EXPLANATION-TYPE"), list(makeSymbol("&KEY"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION")));
  public static final SubLList $list7 = list(makeKeyword("PROBLEM"), makeKeyword("TACTIC"), makeKeyword("LINK"), makeKeyword("SUBEXPLANATION"));
  public static final SubLSymbol $kw8$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw9$PROBLEM = makeKeyword("PROBLEM");
  public static final SubLSymbol $kw10$TACTIC = makeKeyword("TACTIC");
  public static final SubLSymbol $kw11$LINK = makeKeyword("LINK");
  public static final SubLSymbol $kw12$SUBEXPLANATION = makeKeyword("SUBEXPLANATION");
  public static final SubLSymbol $sym13$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym14$_BALANCED_STRATEGY_GATHERING_UNINTERESTINGNESS_EXPLANATIONS__ = makeSymbol("*BALANCED-STRATEGY-GATHERING-UNINTERESTINGNESS-EXPLANATIONS?*");
  public static final SubLList $list15 = list(new SubLObject[] {list(makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION"), makeString(":strategy does not permit transformation at all")), list(makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION"), makeString(":strategy does not permit transformation with the current resource constraints")), list(makeKeyword("PROBLEM-ALREADY-THROWN-AWAY"), makeString(":problem was already noted to be pending")), list(makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS"), makeString(":problem has no transformation tactics")), list(makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE"), makeString(":strategy is not continuable, and :problem was set aside because :subexplanation")), list(makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-REMOVAL-STRATEGEMS"), makeString(":problem has deactivated all its active removal strategems")), list(makeKeyword("PROBLEM-HAS-NO-MORE-ACTIVE-TRANSFORMATION-STRATEGEMS"), makeString(":problem has deactivated all its active transformation strategems")), list(makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS"), makeString("when determining removal strategems for :problem, :strategy found none it wished to activate")), list(makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS"), makeString("when determining transformation strategems for :problem, :strategy found none it wished to activate")), list(makeKeyword("PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK"), makeString("rules associated with tranformation links for :problem were #$NonAbducibleRule so :strategy discarded the abduction strategm")), list(makeKeyword("DONT-DO-ABDUCTION-ON-GOOD-PROBLEM"), makeString("problem :problem already deemed good so :strategy discarded the abduction strategm")), list(makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM"), makeString("problem :problem has an abduced term so :strategy discarded problem wrt transformation")), list(makeKeyword("ALL-TACTICS-THROWN-AWAY"), makeString("all of :problem's tactics are thrown away")), list(makeKeyword("NEW-ROOT-PENDING-WRT-MOTIVATION"), makeString(":problem has already propagated both R and T")), list(makeKeyword("PROBLEM-ALREADY-SET-ASIDE"), makeString(":problem was already noted to be set aside")), list(makeKeyword("ALL-TACTICS-SET-ASIDE"), makeString("all of :problem's tactics are set aside")), list(makeKeyword("TACTIC-ALREADY-THROWN-AWAY"), makeString(":tactic was already noted to be finished")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY"), makeString(":tactic is thrown away because :subexplanation")), list(makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY"), makeString(":tactic uses module :tactic-hl-module, which is always thrown away")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY"), makeString("executing :tactic would motivate a problem that is thrown away because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), list(makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE"), makeString(":strategy is not continuable, and :tactic was set aside because :subexplanation")), list(makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY"), makeString(":tactic is a meta-removal tactic, and some other tactically possible tactics on the problem are strategically disallowed")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL"), makeString(":tactic has a sibling conjunctive removal tactic that is complete")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED"), makeString(":tactic has a sibling join-ordered tactic that focuses on a backchain required problem")), list(makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION"), makeString(":tactic has a sibling tactic that is a simplification")), list(makeKeyword("TACTIC-ALREADY-SET-ASIDE"), makeString(":tactic was already noted to be set aside")), list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE"), makeString(":tactic is set aside because :subexplanation")), list(makeKeyword("TACTIC-GENERATED-ENOUGH"), makeString(":tactic has already generated enough transformation tactics")), list(makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE"), makeString("executing :tactic would motivate a problem that is set aside because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY"), makeString(":tactic has a sibling split tactic that is thrown away because :subexplanation")), list(makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE"), makeString(":tactic has a sibling split tactic that is set aside wrt both removal and transformation, because :subexplanation")), list(makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":tactic leads past the :max-transformation-depth")), list(makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS"), makeString(":tactic leads to a conjunctive focal problem where all conjunctive removals are set aside")), list(makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY"), makeString(":link's supported problem is thrown away because :subexplanation")), list(makeKeyword("SIBLING-EARLY-REMOVAL-LINK"), makeString(":link has a sibling link :subexplanation")), list(makeKeyword("EARLY-REMOVAL-LINK"), makeString(":link, which is an early removal link")), list(makeKeyword("LINK-RULE-DISALLOWED"), makeString(":link uses a disallowed rule")), list(makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE"), makeString(":link's supported problem is set aside because :subexplanation")), list(makeKeyword("LINK-EXCEEDS-MAX-TRANSFORMATION-DEPTH"), makeString(":link leads past the :max-transformation-depth")), list(makeKeyword("UNKNOWN-REASON"), makeString("for an unknown reason"))});
  public static final SubLList $list16 = list(makeSymbol("TYPE"), makeSymbol("PROBLEM"), makeSymbol("TACTIC"), makeSymbol("LINK"), makeSymbol("SUBEXPLANATION"));
  public static final SubLSymbol $sym17$BALANCED_STRATEGY_UNINTERESTINGNESS_EXPLANATION_TYPE_P = makeSymbol("BALANCED-STRATEGY-UNINTERESTINGNESS-EXPLANATION-TYPE-P");
  public static final SubLSymbol $sym18$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $sym19$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLSymbol $sym20$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");
  public static final SubLSymbol $kw21$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $sym22$BALANCED_STRATEGY_MOTIVATION_P = makeSymbol("BALANCED-STRATEGY-MOTIVATION-P");
  public static final SubLSymbol $kw23$PROBLEM_HAS_NO_ACTIVATIBLE_REMOVAL_STRATEGEMS = makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS");
  public static final SubLSymbol $kw24$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $kw25$PROBLEM_HAS_NO_ACTIVATIBLE_TRANSFORMATION_STRATEGEMS = makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-TRANSFORMATION-STRATEGEMS");
  public static final SubLSymbol $kw26$PROBLEM_ALREADY_THROWN_AWAY = makeKeyword("PROBLEM-ALREADY-THROWN-AWAY");
  public static final SubLSymbol $kw27$STRATEGY_THROWS_AWAY_ALL_TRANSFORMATION = makeKeyword("STRATEGY-THROWS-AWAY-ALL-TRANSFORMATION");
  public static final SubLSymbol $kw28$ALL_TACTICS_THROWN_AWAY = makeKeyword("ALL-TACTICS-THROWN-AWAY");
  public static final SubLSymbol $kw29$PROBLEM_STRATEGY_NOT_CONTINUABLE = makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE");
  public static final SubLSymbol $kw30$PROBLEM_HAS_NO_TRANSFORMATION_TACTICS = makeKeyword("PROBLEM-HAS-NO-TRANSFORMATION-TACTICS");
  public static final SubLSymbol $sym31$ABDUCED_TERM_P = makeSymbol("ABDUCED-TERM-P");
  public static final SubLSymbol $kw32$DONT_TRANSFORM_ON_PROBLEM_WITH_ABDUCED_TERM = makeKeyword("DONT-TRANSFORM-ON-PROBLEM-WITH-ABDUCED-TERM");
  public static final SubLSymbol $kw33$TACTIC_ALREADY_THROWN_AWAY = makeKeyword("TACTIC-ALREADY-THROWN-AWAY");
  public static final SubLSymbol $kw34$TACTIC_HL_MODULE_THROWN_AWAY = makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY");
  public static final SubLSymbol $kw35$META_REMOVAL_TACTIC_THROWN_AWAY = makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY");
  public static final SubLSymbol $kw36$TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY");
  public static final SubLString $str37$tactic_is_impossible = makeString("tactic is impossible");
  public static final SubLSymbol $kw38$TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY");
  public static final SubLSymbol $kw39$TACTIC_GENERATED_ENOUGH = makeKeyword("TACTIC-GENERATED-ENOUGH");
  public static final SubLSymbol $kw40$TACTIC_STRATEGY_NOT_CONTINUABLE = makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE");
  public static final SubLSymbol $kw41$DONT_DO_ABDUCTION_ON_GOOD_PROBLEM = makeKeyword("DONT-DO-ABDUCTION-ON-GOOD-PROBLEM");
  public static final SubLSymbol $kw42$PROBLEM_HAS_NON_ABDUCIBLE_RULE_TRANSFORMATION_LINK = makeKeyword("PROBLEM-HAS-NON-ABDUCIBLE-RULE-TRANSFORMATION-LINK");
  public static final SubLSymbol $kw43$TACTIC_THROWN_AWAY_BECAUSE_COMPLETE_SIBLING_CONJUNCTIVE_REMOVAL = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL");
  public static final SubLString $str44$tactic_is_disallowed = makeString("tactic is disallowed");
  public static final SubLSymbol $kw45$TACTIC_THROWN_AWAY_BECAUSE_SIBLING_BACKCHAIN_REQUIRED = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED");
  public static final SubLSymbol $kw46$TACTIC_THROWN_AWAY_BECAUSE_SIBLING_IS_A_SIMPLIFICATION = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-IS-A-SIMPLIFICATION");
  public static final SubLSymbol $kw47$LINK_SUPPORTED_PROBLEM_THROWN_AWAY = makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY");
  public static final SubLSymbol $kw48$SIBLING_EARLY_REMOVAL_LINK = makeKeyword("SIBLING-EARLY-REMOVAL-LINK");
  public static final SubLSymbol $kw49$LINK_RULE_DISALLOWED = makeKeyword("LINK-RULE-DISALLOWED");
  public static final SubLSymbol $kw50$INVALID = makeKeyword("INVALID");
  public static final SubLSymbol $kw51$THROW_AWAY = makeKeyword("THROW-AWAY");
  public static final SubLSymbol $kw52$THROW_AWAY_NEW_ROOT = makeKeyword("THROW-AWAY-NEW-ROOT");
  public static final SubLSymbol $kw53$NEW_ROOT_PENDING_WRT_MOTIVATION = makeKeyword("NEW-ROOT-PENDING-WRT-MOTIVATION");
  public static final SubLSymbol $kw54$PROBLEM_ALREADY_SET_ASIDE = makeKeyword("PROBLEM-ALREADY-SET-ASIDE");
  public static final SubLSymbol $kw55$STRATEGY_SETS_ASIDE_ALL_TRANSFORMATION = makeKeyword("STRATEGY-SETS-ASIDE-ALL-TRANSFORMATION");
  public static final SubLSymbol $kw56$ALL_TACTICS_SET_ASIDE = makeKeyword("ALL-TACTICS-SET-ASIDE");
  public static final SubLSymbol $kw57$TACTIC_ALREADY_SET_ASIDE = makeKeyword("TACTIC-ALREADY-SET-ASIDE");
  public static final SubLSymbol $kw58$TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE");
  public static final SubLSymbol $kw59$TACTIC_SET_ASIDE_BECAUSE_LOOKAHEAD_PROBLEM_SET_ASIDE = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE");
  public static final SubLSymbol $kw60$LOGICAL_TACTIC_EXCEEDS_MAX_TRANSFORMATION_DEPTH = makeKeyword("LOGICAL-TACTIC-EXCEEDS-MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw61$JOIN_ORDERED_TACTIC_LEADS_TO_SET_ASIDE_CONJUNCTIVE_REMOVALS = makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS");
  public static final SubLSymbol $kw62$LINK_SUPPORTED_PROBLEM_SET_ASIDE = makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE");
  public static final SubLSymbol $kw63$SET_ASIDE = makeKeyword("SET-ASIDE");
  public static final SubLSymbol $kw64$IRRELEVANT = makeKeyword("IRRELEVANT");
  public static final SubLSymbol $kw65$REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
  public static final SubLSymbol $sym66$BALANCED_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTI = makeSymbol("BALANCED-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC");
  public static final SubLSymbol $kw67$UNDETERMINED = makeKeyword("UNDETERMINED");
  public static final SubLSymbol $kw68$POSITIVE_INFINITY = makeKeyword("POSITIVE-INFINITY");
  public static final SubLSymbol $kw69$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw70$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list71 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"));
  public static final SubLSymbol $sym72$BALANCED_STRATEGY_P = makeSymbol("BALANCED-STRATEGY-P");
  public static final SubLSymbol $kw73$SPLIT = makeKeyword("SPLIT");
  public static final SubLSymbol $kw74$SPLIT_TACTIC_THROWN_AWAY_BECAUSE_SIBLING_TACTIC_THROWN_AWAY = makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");
  public static final SubLSymbol $kw75$EARLY_REMOVAL_LINK = makeKeyword("EARLY-REMOVAL-LINK");
  public static final SubLSymbol $kw76$SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_SET_ASIDE = makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE");
  public static final SubLSymbol $kw77$SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_THROWN_AWAY = makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");
  public static final SubLSymbol $kw78$GENERALIZED_REMOVAL = makeKeyword("GENERALIZED-REMOVAL");
  public static final SubLSymbol $kw79$POSSIBLE = makeKeyword("POSSIBLE");
  public static final SubLSymbol $sym80$_ = makeSymbol("<");
  public static final SubLSymbol $sym81$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_inference_balanced_tactician_strategic_uninterestingness_file();
  }

  @Override
  public void initializeVariables() {
    init_inference_balanced_tactician_strategic_uninterestingness_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_inference_balanced_tactician_strategic_uninterestingness_file();
  }

}
