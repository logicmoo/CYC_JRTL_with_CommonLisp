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

package  com.cyc.cycjava.cycl.inference.harness;

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


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_restriction;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_union;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.harness.removal_tactician;
import com.cyc.cycjava.cycl.inference.harness.removal_tactician_datastructures;
import com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation;
import com.cyc.cycjava.cycl.subl_macros;

public  final class removal_tactician_uninterestingness extends SubLTranslatedFile {

  //// Constructor

  private removal_tactician_uninterestingness() {}
  public static final SubLFile me = new removal_tactician_uninterestingness();
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness";

  //// Definitions

  /** Bound to NIL when trying to rederive the reason that something was put in the cache. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 1127) 
  private static SubLSymbol $removal_strategy_uses_already_thrown_away_cacheP$ = null;

  /** Whether :set-aside plus non-continuable should be strengthened to :throw-away for TACTIC.
   This is usually T except for special circumstances, e.g. split tactic removal lookahead when transformation is allowed. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 1378) 
  public static final SubLObject removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP(SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != inference_worker_split.split_tactic_p(tactic))
           && (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))))) {
        return NIL;
      }
      return inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.getDynamicValue(thread);
    }
  }

  /** Whether :set-aside plus non-continuable should be strengthened to :throw-away for PROBLEM.
   This is usually T except for special circumstances, e.g. if PROBLEM is a split problem and transformation is allowed. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 1873) 
  public static final SubLObject removal_strategy_set_aside_non_continuable_implies_throw_away_problemP(SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.getDynamicValue(thread);
    }
  }

  /** @return booleanp; whether STRATEGY, after careful deliberation, chooses to throw away PROBLEM wrt removal. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 4004) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_problemP(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP) {
    if ((consider_all_tacticsP == UNPROVIDED)) {
      consider_all_tacticsP = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != removal_strategy_chooses_to_throw_away_problem_uncacheableP(strategy, problem, consider_all_tacticsP))) {
        return T;
      } else {
        {
          SubLObject throw_away = inference_datastructures_strategy.problem_thrown_away_cache_status(problem, strategy);
          if ((NIL != Types.booleanp(throw_away))) {
            return throw_away;
          } else {
            {
              SubLObject throw_awayP = removal_strategy_chooses_to_throw_away_problem_cacheableP(strategy, problem, consider_all_tacticsP);
              if ((NIL != throw_awayP)) {
                if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35504");
                }
                inference_datastructures_strategy.set_problem_thrown_away(problem, strategy);
              } else {
                inference_datastructures_strategy.set_problem_not_thrown_away(problem, strategy);
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
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 5049) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_problem_uncacheableP(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != $removal_strategy_uses_already_thrown_away_cacheP$.getDynamicValue(thread))
           && (NIL != removal_strategy_problem_thrown_awayP(strategy, problem)))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35505");
        }
        return T;
      } else if (((NIL != consider_all_tacticsP)
           && (NIL != removal_strategy_chooses_to_throw_away_all_tacticsP(strategy, problem, T)))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35506");
        }
        return T;
      } else if (((NIL != removal_strategy_set_aside_non_continuable_implies_throw_away_problemP(problem))
           && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))
           && (NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, T, T)))) {
        {
          SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
          if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35507");
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
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 6352) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_problem_cacheableP(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_problemP(strategy, problem))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35508");
        }
        return T;
      } else {
        return NIL;
      }
    }
  }

  /** @param PROBLEM-ALREADY-CONSIDERED?; whether the caller has already considered that the problem of STRATEGEM
   might be thrown away wrt removal.  If T, the analysis will not be redone. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 6980) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_strategemP(SubLObject strategy, SubLObject strategem, SubLObject problem_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
      {
        SubLObject tactic = strategem;
        return removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, UNPROVIDED);
      }
    } else {
      {
        SubLObject link = strategem;
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35693");
      }
    }
  }

  /** @param PROBLEM-ALREADY-CONSIDERED?; whether the caller has already considered that the problem of TACTIC
   might be thrown away wrt removal..  If T, the analysis will not be redone. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 7611) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((siblings_already_consideredP == UNPROVIDED)) {
      siblings_already_consideredP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != removal_strategy_chooses_to_throw_away_tactic_uncacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP))) {
        return T;
      } else {
        {
          SubLObject throw_away = inference_datastructures_strategy.tactic_thrown_away_cache_status(tactic, strategy);
          if ((NIL != Types.booleanp(throw_away))) {
            return throw_away;
          } else {
            {
              SubLObject throw_awayP = removal_strategy_chooses_to_throw_away_tactic_cacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP);
              if ((NIL != throw_awayP)) {
                if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35509");
                }
                inference_datastructures_strategy.set_tactic_thrown_away(tactic, strategy);
              } else {
                inference_datastructures_strategy.set_tactic_not_thrown_away(tactic, strategy);
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
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 8674) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_tactic_uncacheableP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != $removal_strategy_uses_already_thrown_away_cacheP$.getDynamicValue(thread))
           && (NIL != removal_strategy_tactic_thrown_awayP(strategy, tactic)))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35510");
        }
        return T;
      } else if ((NIL != removal_strategy_chooses_to_throw_away_tactic_hl_moduleP(strategy, tactic))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35511");
        }
        return T;
      } else if ((NIL == inference_tactician_strategic_uninterestingness.strategy_admits_tactic_wrt_proof_specP(strategy, tactic))) {
        return T;
      } else if ((NIL != removal_strategy_chooses_to_throw_away_meta_removal_tacticP(strategy, tactic))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35512");
        }
        return T;
      }
      if ((NIL == problem_already_consideredP)) {
        {
          SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
          if ((NIL != removal_strategy_chooses_to_throw_away_problemP(strategy, problem, NIL))) {
            {
              SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
              if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35513");
              }
            }
            return T;
          }
        }
      }
      if (((NIL != inference_worker.content_tactic_p(tactic))
           && (NIL != inference_tactician_strategic_uninterestingness.tactic_impossibleP(tactic, strategy)))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35514");
        }
        return T;
      } else if (((NIL != inference_worker.logical_tactic_p(tactic))
           && (NIL != removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP(strategy, tactic)))) {
        {
          SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
          if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35515");
          }
        }
        return T;
      } else if (((NIL == siblings_already_consideredP)
           && (NIL != inference_worker_split.split_tactic_p(tactic))
           && (NIL != removal_strategy_chooses_to_throw_away_split_tacticP(strategy, tactic)))) {
        return T;
      } else if (((NIL != removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP(tactic))
           && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))
           && (NIL != removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, T, T, T)))) {
        {
          SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
          if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35516");
          }
        }
        return T;
      }
      return NIL;
    }
  }

  /** The parts of throw-away reasoning that can be cached.
   The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 11930) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_tactic_cacheableP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35517");
        }
        return T;
      } else if (((NIL != inference_worker.connected_conjunction_tactic_p(tactic))
           && (NIL != inference_tactician_utilities.problem_has_some_complete_non_thrown_away_removal_tacticP(inference_datastructures_tactic.tactic_problem(tactic), strategy)))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35518");
        }
        return T;
      } else if (((NIL != inference_worker.structural_tactic_p(tactic))
           && (NIL != inference_tactician_strategic_uninterestingness.tactic_disallowedP(tactic, strategy)))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35519");
        }
        return T;
      } else {
        return NIL;
      }
    }
  }

  /** @return booleanp; whether STRATEGY, after careful deliberation, chooses to set aside PROBLEM wrt removal. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 14241) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_problemP(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
    if ((consider_all_tacticsP == UNPROVIDED)) {
      consider_all_tacticsP = T;
    }
    if ((thrown_away_already_consideredP == UNPROVIDED)) {
      thrown_away_already_consideredP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != removal_strategy_chooses_to_set_aside_problem_uncacheableP(strategy, problem, consider_all_tacticsP, thrown_away_already_consideredP))) {
        return T;
      } else {
        {
          SubLObject set_aside = inference_datastructures_strategy.problem_set_aside_cache_status(problem, strategy);
          if ((NIL != Types.booleanp(set_aside))) {
            return set_aside;
          } else {
            {
              SubLObject set_asideP = removal_strategy_chooses_to_set_aside_problem_cacheableP(strategy, problem, consider_all_tacticsP, thrown_away_already_consideredP);
              if ((NIL != set_asideP)) {
                if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35521");
                }
                inference_datastructures_strategy.set_problem_set_aside(problem, strategy);
              } else {
                inference_datastructures_strategy.set_problem_not_set_aside(problem, strategy);
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
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 15302) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_problem_uncacheableP(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35522");
        }
        return T;
      } else if (((NIL != consider_all_tacticsP)
           && (NIL != inference_datastructures_strategy.strategically_possible_problem_p(problem, strategy))
           && (NIL != removal_strategy_chooses_to_set_aside_all_tacticsP(strategy, problem, T)))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35523");
        }
        return T;
      } else {
        return NIL;
      }
    }
  }

  /** The parts of set-aside reasoning that can be cached.
   The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 16205) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_problem_cacheableP(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL == thrown_away_already_consideredP)
           && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_problemP(strategy, problem)))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35524");
        }
        return T;
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 16913) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_strategemP(SubLObject strategy, SubLObject strategem, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((thrown_away_already_consideredP == UNPROVIDED)) {
      thrown_away_already_consideredP = NIL;
    }
    if ((NIL != inference_datastructures_tactic.tactic_p(strategem))) {
      {
        SubLObject tactic = strategem;
        return removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, problem_already_consideredP, NIL, thrown_away_already_consideredP);
      }
    } else {
      {
        SubLObject link = strategem;
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35691");
      }
    }
  }

  /** @param PROBLEM-ALREADY-CONSIDERED?; whether the caller has already considered that the problem of TACTIC
    might be set aside wrt removal.  If T, the analysis will not be redone.
   @param THROWN-AWAY-ALREADY-CONSIDERED?; don't redo work if this is being called from removal-strategy-chooses-to-throw-away-tactic? */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 17452) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
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
      if ((NIL != removal_strategy_chooses_to_set_aside_tactic_uncacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP))) {
        return T;
      } else {
        {
          SubLObject set_aside = inference_datastructures_strategy.tactic_set_aside_cache_status(tactic, strategy);
          if ((NIL != Types.booleanp(set_aside))) {
            return set_aside;
          } else {
            {
              SubLObject set_asideP = removal_strategy_chooses_to_set_aside_tactic_cacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP);
              if ((NIL != set_asideP)) {
                if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35525");
                }
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36465");
              } else {
                inference_datastructures_strategy.set_tactic_not_set_aside(tactic, strategy);
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
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 18727) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_tactic_uncacheableP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != removal_strategy_tactic_set_asideP(strategy, tactic))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35526");
        }
        return T;
      }
      if ((NIL == problem_already_consideredP)) {
        {
          SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
          if ((NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, NIL, thrown_away_already_consideredP))) {
            {
              SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
              if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35527");
              }
            }
            return T;
          }
        }
      }
      if (((NIL != inference_worker.logical_tactic_p(tactic))
           && (NIL != removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP(strategy, tactic)))) {
        {
          SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
          if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35528");
          }
        }
        return T;
      } else if (((NIL == siblings_already_consideredP)
           && (NIL != inference_worker_split.split_tactic_p(tactic))
           && (NIL != removal_strategy_chooses_to_set_aside_split_tacticP(strategy, tactic)))) {
        return T;
      } else {
        return NIL;
      }
    }
  }

  /** The parts of set-aside reasoning that can be cached.
   The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 20573) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_tactic_cacheableP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL == thrown_away_already_consideredP)
           && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic)))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35529");
        }
        return T;
      } else if (((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic))
           && (NIL != removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP(strategy, tactic, UNPROVIDED)))) {
        if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35530");
        }
        return T;
      }
      return NIL;
    }
  }

  /** @return strategic-uninterestingness-reason-p */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 22667) 
  public static final SubLObject why_removal_strategy_chooses_to_ignore_problem(SubLObject strategy, SubLObject problem) {
    if ((NIL != removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED))) {
      return $kw21$THROW_AWAY;
    } else if ((NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, T, T))) {
      return $kw22$SET_ASIDE;
    } else if ((NIL == inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy))) {
      return $kw23$IRRELEVANT;
    } else {
      return NIL;
    }
  }

  /** @return strategic-uninterestingness-reason-p */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 23272) 
  public static final SubLObject why_removal_strategy_chooses_to_ignore_strategem(SubLObject strategy, SubLObject strategem) {
    if ((NIL != inference_tactician.strategem_invalid_p(strategem))) {
      return $kw24$INVALID;
    } else if (((NIL != inference_worker.content_tactic_p(strategem))
         && (NIL != inference_datastructures_tactic.tactic_not_possibleP(strategem)))) {
      return $kw21$THROW_AWAY;
    } else if ((NIL != removal_strategy_chooses_to_throw_away_strategemP(strategy, strategem, UNPROVIDED))) {
      return $kw21$THROW_AWAY;
    } else if ((NIL != removal_strategy_chooses_to_set_aside_strategemP(strategy, strategem, NIL, T))) {
      return $kw22$SET_ASIDE;
    } else if ((NIL == inference_datastructures_problem.problem_relevant_to_strategyP(inference_tactician.strategem_problem(strategem), strategy))) {
      return $kw23$IRRELEVANT;
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 24192) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_all_tacticsP(SubLObject strategy, SubLObject problem, SubLObject problem_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((NIL == problem_already_consideredP)) {
      if ((NIL != removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED))) {
        return T;
      }
    }
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        if ((NIL == removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, T, UNPROVIDED))) {
          return NIL;
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 24615) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_all_tacticsP(SubLObject strategy, SubLObject problem, SubLObject problem_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((NIL == problem_already_consideredP)) {
      if ((NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, UNPROVIDED, UNPROVIDED))) {
        return T;
      }
    }
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        if ((NIL == removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, T, UNPROVIDED, UNPROVIDED))) {
          return NIL;
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 25500) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP(SubLObject strategy, SubLObject jo_tactic, SubLObject problem_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    {
      SubLObject lookahead_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(jo_tactic);
      return makeBoolean(((NIL == inference_datastructures_problem.single_literal_problem_p(lookahead_problem))
             && (NIL != inference_datastructures_problem.problem_has_tactic_of_typeP(lookahead_problem, $kw25$REMOVAL_CONJUNCTIVE))
             && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35689"))));
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 26497) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_connected_conjunction_linkP(SubLObject strategy, SubLObject link) {
    {
      SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
      if ((NIL != removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED))) {
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 26752) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_connected_conjunction_linkP(SubLObject strategy, SubLObject link) {
    {
      SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
      if ((NIL != removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 27005) 
  public static final SubLObject removal_strategy_chooses_to_totally_set_aside_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((siblings_already_consideredP == UNPROVIDED)) {
      siblings_already_consideredP = NIL;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 27264) 
  public static final SubLObject removal_strategy_chooses_to_totally_throw_away_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
    if ((problem_already_consideredP == UNPROVIDED)) {
      problem_already_consideredP = NIL;
    }
    if ((siblings_already_consideredP == UNPROVIDED)) {
      siblings_already_consideredP = NIL;
    }
    return inference_datastructures_strategy.controlling_strategy_callback(strategy, $kw26$SUBSTRATEGY_TOTALLY_THROW_AWAY_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED);
  }

  /** Return T iff STRATEGY throws away all tactics involving the HL module of TACTIC. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 27833) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_tactic_hl_moduleP(SubLObject strategy, SubLObject tactic) {
    if ((NIL != inference_worker_transformation.transformation_tactic_p(tactic))) {
      return T;
    } else {
      return NIL;
    }
  }

  /** @return booleanp; whether PROBLEM has motivation according to STRATEGY,
   but is no longer active or set-aside. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 29803) 
  public static final SubLObject removal_strategy_problem_thrown_awayP(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym33$REMOVAL_STRATEGY_P);
    checkType(problem, $sym34$PROBLEM_P);
    return makeBoolean(((NIL != removal_tactician_datastructures.removal_strategy_problem_pendingP(strategy, problem))
           && (NIL == removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem))));
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 30257) 
  public static final SubLObject removal_strategy_tactic_thrown_awayP(SubLObject strategy, SubLObject tactic) {
    return removal_tactician_datastructures.removal_strategy_strategem_thrown_awayP(strategy, tactic);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 30396) 
  public static final SubLObject removal_strategy_tactic_set_asideP(SubLObject strategy, SubLObject tactic) {
    return removal_tactician_datastructures.removal_strategy_strategem_set_asideP(strategy, tactic);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 30531) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP(SubLObject strategy, SubLObject logical_tactic) {
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
          } else if (((NIL != removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, first_problem))
              || (NIL != removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, second_problem)))) {
            return T;
          }
        }
      } else {
        {
          SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
          if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy))) {
            return NIL;
          } else {
            if ((NIL != lookahead_problem)) {
              if ((NIL != inference_worker_union.union_tactic_p(logical_tactic))) {
                inference_worker.determine_strategic_status_wrt(lookahead_problem, strategy);
              }
              if ((NIL != removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, lookahead_problem))) {
                return T;
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 32326) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_lookahead_problemP(SubLObject strategy, SubLObject lookahead_problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = $removal_strategy_uses_already_thrown_away_cacheP$.currentBinding(thread);
          try {
            $removal_strategy_uses_already_thrown_away_cacheP$.bind(makeBoolean(((NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem))
                   && (NIL != inference_datastructures_problem.closed_problem_p(lookahead_problem)))), thread);
            answer = removal_strategy_chooses_to_throw_away_problemP(strategy, lookahead_problem, UNPROVIDED);
          } finally {
            $removal_strategy_uses_already_thrown_away_cacheP$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 32880) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_split_tacticP(SubLObject strategy, SubLObject split_tactic) {
    {
      SubLObject tactic_var = split_tactic;
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic_var));
      SubLObject sibling_tactic = NIL;
      for (sibling_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sibling_tactic = cdolist_list_var.first()) {
        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $kw35$SPLIT))) {
          if ((sibling_tactic != tactic_var)) {
            if ((NIL != removal_strategy_chooses_to_throw_away_sibling_split_tacticP(strategy, split_tactic, sibling_tactic))) {
              return T;
            }
            {
              SubLObject lookahead_problem = inference_worker_split.split_tactic_lookahead_problem(sibling_tactic);
              if (((NIL != inference_worker.pending_problem_p(lookahead_problem, strategy))
                   && (NIL != inference_datastructures_problem.closed_problem_p(lookahead_problem))
                   && (NIL == inference_worker.good_problem_p(lookahead_problem, strategy))
                   && (NIL == inference_worker.problem_has_some_open_obviously_neutral_argument_linkP(lookahead_problem, NIL, strategy, NIL)))) {
                return T;
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 34055) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_sibling_split_tacticP(SubLObject strategy, SubLObject split_tactic, SubLObject sibling_tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.currentBinding(thread);
          try {
            inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.bind(NIL, thread);
            if ((NIL != removal_strategy_chooses_to_totally_throw_away_tacticP(strategy, sibling_tactic, T, T))) {
              {
                SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35532");
                }
              }
              result = T;
            }
          } finally {
            inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 35568) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP(SubLObject strategy, SubLObject logical_tactic) {
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
          } else if (((NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, first_problem, UNPROVIDED, UNPROVIDED))
              || (NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, second_problem, UNPROVIDED, UNPROVIDED)))) {
            return T;
          }
        }
      } else {
        {
          SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
          if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy))) {
            return NIL;
          } else {
            if ((NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, lookahead_problem, UNPROVIDED, UNPROVIDED))) {
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
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 36908) 
  public static SubLSymbol $removal_strategy_weaken_split_tactic_set_aside_policyP$ = null;

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 37138) 
  public static final SubLObject removal_strategy_chooses_to_set_aside_split_tacticP(SubLObject strategy, SubLObject split_tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $removal_strategy_weaken_split_tactic_set_aside_policyP$.getDynamicValue(thread))) {
        {
          SubLObject tactic_var = split_tactic;
          SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic_var));
          SubLObject sibling_tactic = NIL;
          for (sibling_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sibling_tactic = cdolist_list_var.first()) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $kw35$SPLIT))) {
              if ((sibling_tactic != tactic_var)) {
                if ((NIL != removal_strategy_chooses_to_totally_set_aside_tacticP(strategy, sibling_tactic, T, T))) {
                  {
                    SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                    if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35533");
                    }
                  }
                  return T;
                }
              }
            }
          }
        }
        return NIL;
      }
      {
        SubLObject tactic_var = split_tactic;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic_var));
        SubLObject sibling_tactic = NIL;
        for (sibling_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sibling_tactic = cdolist_list_var.first()) {
          if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $kw35$SPLIT))) {
            if ((sibling_tactic != tactic_var)) {
              if ((NIL != controlling_strategy_allows_split_tactic_to_be_set_asideP(strategy, sibling_tactic))) {
                {
                  SubLObject lookahead_problem = inference_worker_split.split_tactic_lookahead_problem(sibling_tactic);
                  if (((NIL != removal_strategy_chooses_to_throw_away_tacticP(strategy, sibling_tactic, T, T))
                      || ((NIL != inference_worker.totally_finished_problem_p(lookahead_problem, strategy))
                         && (NIL == inference_worker.good_problem_p(lookahead_problem, strategy))))) {
                    {
                      SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                      if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35534");
                      }
                    }
                    return T;
                  } else if ((NIL != removal_strategy_chooses_to_totally_set_aside_tacticP(strategy, sibling_tactic, T, T))) {
                    {
                      SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                      if ((NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread))) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35535");
                      }
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

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 39599) 
  public static final SubLObject controlling_strategy_allows_split_tactic_to_be_set_asideP(SubLObject strategy, SubLObject split_tactic) {
    if ((NIL != inference_tactician.substrategyP(strategy))) {
      return inference_datastructures_strategy.controlling_strategy_callback(strategy, $kw39$SUBSTRATEGY_ALLOW_SPLIT_TACTIC_SET_ASIDE_WRT_REMOVAL, split_tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    } else {
      return T;
    }
  }

  /** STRATEGY should throw away META-REMOVAL-TACTIC if it has a sibling tactic that is tactically possible but disallowed by STRATEGY,
   because then the intended completeness of META-REMOVAL-TACTIC is inapplicable. */
  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 39867) 
  public static final SubLObject removal_strategy_chooses_to_throw_away_meta_removal_tacticP(SubLObject strategy, SubLObject meta_removal_tactic) {
    if ((NIL != inference_worker_removal.meta_removal_tactic_p(meta_removal_tactic))) {
      {
        SubLObject sibling_disallowed_tacticP = NIL;
        SubLObject rest = NIL;
        for (rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(meta_removal_tactic)); (!(((NIL != sibling_disallowed_tacticP)
              || (NIL == rest)))); rest = rest.rest()) {
          {
            SubLObject removal_tactic = rest.first();
            if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $kw40$GENERALIZED_REMOVAL))
                 && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $kw41$POSSIBLE)))) {
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

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 40770) 
  public static final SubLObject removal_strategy_throw_away_uninteresting_set_asides(SubLObject strategy) {
    {
      SubLObject total_thrown_away_count = ZERO_INTEGER;
      SubLObject thrown_away_count = removal_strategy_throw_away_uninteresting_set_asides_int(strategy);
      total_thrown_away_count = Numbers.add(total_thrown_away_count, thrown_away_count);
      while (thrown_away_count.isPositive()) {
        thrown_away_count = removal_strategy_throw_away_uninteresting_set_asides_int(strategy);
        total_thrown_away_count = Numbers.add(total_thrown_away_count, thrown_away_count);
      }
      return total_thrown_away_count;
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 41458) 
  public static final SubLObject removal_strategy_throw_away_uninteresting_set_asides_int(SubLObject strategy) {
    {
      SubLObject set_aside_problems = removal_strategy_set_aside_problems_to_reconsider(strategy);
      inference_datastructures_strategy.strategy_clear_set_asides(strategy);
      {
        SubLObject thrown_away_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = set_aside_problems;
        SubLObject set_aside_problem = NIL;
        for (set_aside_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), set_aside_problem = cdolist_list_var.first()) {
          if ((NIL != removal_strategy_chooses_to_leave_problem_set_asideP(strategy, set_aside_problem))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35463");
          } else {
            thrown_away_count = Numbers.add(thrown_away_count, ONE_INTEGER);
          }
        }
        return thrown_away_count;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 41985) 
  public static final SubLObject removal_strategy_chooses_to_leave_problem_set_asideP(SubLObject strategy, SubLObject set_aside_problem) {
    return Equality.eq($kw22$SET_ASIDE, why_removal_strategy_chooses_to_ignore_problem(strategy, set_aside_problem));
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-uninterestingness.lisp", position = 42944) 
  public static final SubLObject removal_strategy_set_aside_problems_to_reconsider(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
  }

  public static final SubLObject declare_removal_tactician_uninterestingness_file() {
    declareFunction(myName, "removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP", "REMOVAL-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-TACTIC?", 1, 0, false);
    declareFunction(myName, "removal_strategy_set_aside_non_continuable_implies_throw_away_problemP", "REMOVAL-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-PROBLEM?", 1, 0, false);
    declareFunction(myName, "removal_strategy_why_problem_already_thrown_awayP", "REMOVAL-STRATEGY-WHY-PROBLEM-ALREADY-THROWN-AWAY?", 2, 0, false);
    declareFunction(myName, "rederive_why_removal_strategy_chooses_to_throw_away_problemP", "REDERIVE-WHY-REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 1, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_problem_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-UNCACHEABLE?", 3, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_problem_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-CACHEABLE?", 3, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-STRATEGEM?", 2, 1, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 2, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_tactic_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-UNCACHEABLE?", 4, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_tactic_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-CACHEABLE?", 4, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-WITH-SIBLING-SIMPLIFICATION-TACTIC?", 1, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-LINK?", 2, 1, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 2, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_problem_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-UNCACHEABLE?", 4, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_problem_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-CACHEABLE?", 4, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-STRATEGEM?", 2, 2, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 3, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_tactic_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-UNCACHEABLE?", 5, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_tactic_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-CACHEABLE?", 5, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-LINK?", 2, 2, false);
    declareFunction(myName, "removal_strategy_chooses_to_ignore_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 2, 0, false);
    declareFunction(myName, "why_removal_strategy_chooses_to_ignore_problem", "WHY-REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_ignore_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM?", 2, 0, false);
    declareFunction(myName, "why_removal_strategy_chooses_to_ignore_strategem", "WHY-REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_ignore_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_ignore_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-LINK?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_all_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-ALL-TACTICS?", 2, 1, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_all_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-TACTICS?", 2, 1, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-CONJUNCTIVE-REMOVAL-TACTICS?", 2, 1, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-JOIN-ORDERED-TACTIC-DUE-TO-CONJUNCTIVE-REMOVAL?", 2, 1, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_disjunctive_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-DISJUNCTIVE-LINK?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_disjunctive_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-DISJUNCTIVE-LINK?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_connected_conjunction_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-CONNECTED-CONJUNCTION-LINK?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_connected_conjunction_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-CONNECTED-CONJUNCTION-LINK?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_totally_set_aside_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-SET-ASIDE-TACTIC?", 2, 2, false);
    declareFunction(myName, "removal_strategy_chooses_to_totally_throw_away_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 2, 2, false);
    declareFunction(myName, "removal_strategy_chooses_to_totally_ignore_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-IGNORE-TACTIC?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_tactic_hl_moduleP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-HL-MODULE?", 2, 0, false);
    declareFunction(myName, "removal_strategy_preferred_backchain_required_join_ordered_tactic_internal", "REMOVAL-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC-INTERNAL", 2, 0, false);
    declareFunction(myName, "removal_strategy_preferred_backchain_required_join_ordered_tactic", "REMOVAL-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC", 2, 0, false);
    declareFunction(myName, "removal_strategy_total_transformation_productivity", "REMOVAL-STRATEGY-TOTAL-TRANSFORMATION-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "removal_strategy_problem_thrown_awayP", "REMOVAL-STRATEGY-PROBLEM-THROWN-AWAY?", 2, 0, false);
    declareFunction(myName, "removal_strategy_tactic_thrown_awayP", "REMOVAL-STRATEGY-TACTIC-THROWN-AWAY?", 2, 0, false);
    declareFunction(myName, "removal_strategy_tactic_set_asideP", "REMOVAL-STRATEGY-TACTIC-SET-ASIDE?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-LOOKAHEAD-PROBLEM?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-SPLIT-TACTIC?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_sibling_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-SIBLING-SPLIT-TACTIC?", 3, 0, false);
    declareFunction(myName, "removal_strategy_chooses_not_to_activate_any_strategems_on_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-ANY-STRATEGEMS-ON-PROBLEM?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_set_aside_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-SPLIT-TACTIC?", 2, 0, false);
    declareFunction(myName, "controlling_strategy_allows_split_tactic_to_be_set_asideP", "CONTROLLING-STRATEGY-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE?", 2, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_throw_away_meta_removal_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-META-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "removal_strategy_throw_away_uninteresting_set_asides", "REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
    declareFunction(myName, "removal_strategy_throw_away_uninteresting_set_asides_int", "REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES-INT", 1, 0, false);
    declareFunction(myName, "removal_strategy_chooses_to_leave_problem_set_asideP", "REMOVAL-STRATEGY-CHOOSES-TO-LEAVE-PROBLEM-SET-ASIDE?", 2, 0, false);
    declareFunction(myName, "removal_strategy_reconsider_set_asides", "REMOVAL-STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
    declareFunction(myName, "removal_strategy_set_aside_problems_to_reconsider", "REMOVAL-STRATEGY-SET-ASIDE-PROBLEMS-TO-RECONSIDER", 1, 0, false);
    declareFunction(myName, "removal_strategy_reconsider_one_set_aside", "REMOVAL-STRATEGY-RECONSIDER-ONE-SET-ASIDE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_tactician_uninterestingness_file() {
    $removal_strategy_uses_already_thrown_away_cacheP$ = defparameter("*REMOVAL-STRATEGY-USES-ALREADY-THROWN-AWAY-CACHE?*", T);
    $removal_strategy_weaken_split_tactic_set_aside_policyP$ = defparameter("*REMOVAL-STRATEGY-WEAKEN-SPLIT-TACTIC-SET-ASIDE-POLICY?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_removal_tactician_uninterestingness_file() {
    // CVS_ID("Id: inference-removal-tactician-strategic-uninterestingness.lisp 127093 2009-02-12 17:12:43Z pace ");
    memoization_state.note_memoized_function($sym27$REMOVAL_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTIC);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$PROBLEM_HAS_NO_ACTIVATIBLE_REMOVAL_STRATEGEMS = makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS");
  public static final SubLSymbol $kw1$PROBLEM_ALREADY_THROWN_AWAY = makeKeyword("PROBLEM-ALREADY-THROWN-AWAY");
  public static final SubLSymbol $kw2$ALL_TACTICS_THROWN_AWAY = makeKeyword("ALL-TACTICS-THROWN-AWAY");
  public static final SubLSymbol $kw3$PROBLEM_STRATEGY_NOT_CONTINUABLE = makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE");
  public static final SubLSymbol $kw4$TACTIC_ALREADY_THROWN_AWAY = makeKeyword("TACTIC-ALREADY-THROWN-AWAY");
  public static final SubLSymbol $kw5$TACTIC_HL_MODULE_THROWN_AWAY = makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY");
  public static final SubLSymbol $kw6$META_REMOVAL_TACTIC_THROWN_AWAY = makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY");
  public static final SubLSymbol $kw7$TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY");
  public static final SubLString $str8$tactic_is_impossible = makeString("tactic is impossible");
  public static final SubLSymbol $kw9$TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY");
  public static final SubLSymbol $kw10$TACTIC_STRATEGY_NOT_CONTINUABLE = makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE");
  public static final SubLSymbol $kw11$TACTIC_THROWN_AWAY_BECAUSE_COMPLETE_SIBLING_CONJUNCTIVE_REMOVAL = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL");
  public static final SubLString $str12$tactic_is_disallowed = makeString("tactic is disallowed");
  public static final SubLSymbol $kw13$LINK_SUPPORTED_PROBLEM_THROWN_AWAY = makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY");
  public static final SubLSymbol $kw14$PROBLEM_ALREADY_SET_ASIDE = makeKeyword("PROBLEM-ALREADY-SET-ASIDE");
  public static final SubLSymbol $kw15$ALL_TACTICS_SET_ASIDE = makeKeyword("ALL-TACTICS-SET-ASIDE");
  public static final SubLSymbol $kw16$TACTIC_ALREADY_SET_ASIDE = makeKeyword("TACTIC-ALREADY-SET-ASIDE");
  public static final SubLSymbol $kw17$TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE");
  public static final SubLSymbol $kw18$TACTIC_SET_ASIDE_BECAUSE_LOOKAHEAD_PROBLEM_SET_ASIDE = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE");
  public static final SubLSymbol $kw19$JOIN_ORDERED_TACTIC_LEADS_TO_SET_ASIDE_CONJUNCTIVE_REMOVALS = makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS");
  public static final SubLSymbol $kw20$LINK_SUPPORTED_PROBLEM_SET_ASIDE = makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE");
  public static final SubLSymbol $kw21$THROW_AWAY = makeKeyword("THROW-AWAY");
  public static final SubLSymbol $kw22$SET_ASIDE = makeKeyword("SET-ASIDE");
  public static final SubLSymbol $kw23$IRRELEVANT = makeKeyword("IRRELEVANT");
  public static final SubLSymbol $kw24$INVALID = makeKeyword("INVALID");
  public static final SubLSymbol $kw25$REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
  public static final SubLSymbol $kw26$SUBSTRATEGY_TOTALLY_THROW_AWAY_TACTIC = makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC");
  public static final SubLSymbol $sym27$REMOVAL_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTIC = makeSymbol("REMOVAL-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC");
  public static final SubLSymbol $kw28$UNDETERMINED = makeKeyword("UNDETERMINED");
  public static final SubLSymbol $kw29$POSITIVE_INFINITY = makeKeyword("POSITIVE-INFINITY");
  public static final SubLSymbol $kw30$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw31$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list32 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"));
  public static final SubLSymbol $sym33$REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");
  public static final SubLSymbol $sym34$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $kw35$SPLIT = makeKeyword("SPLIT");
  public static final SubLSymbol $kw36$SPLIT_TACTIC_THROWN_AWAY_BECAUSE_SIBLING_TACTIC_THROWN_AWAY = makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");
  public static final SubLSymbol $kw37$SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_SET_ASIDE = makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE");
  public static final SubLSymbol $kw38$SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_THROWN_AWAY = makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");
  public static final SubLSymbol $kw39$SUBSTRATEGY_ALLOW_SPLIT_TACTIC_SET_ASIDE_WRT_REMOVAL = makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL");
  public static final SubLSymbol $kw40$GENERALIZED_REMOVAL = makeKeyword("GENERALIZED-REMOVAL");
  public static final SubLSymbol $kw41$POSSIBLE = makeKeyword("POSSIBLE");
  public static final SubLSymbol $sym42$_ = makeSymbol("<");
  public static final SubLSymbol $sym43$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");

  //// Initializers

  public void declareFunctions() {
    declare_removal_tactician_uninterestingness_file();
  }

  public void initializeVariables() {
    init_removal_tactician_uninterestingness_file();
  }

  public void runTopLevelForms() {
    setup_removal_tactician_uninterestingness_file();
  }

}
