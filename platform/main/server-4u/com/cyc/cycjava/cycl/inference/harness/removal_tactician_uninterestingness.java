/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.problem_set_aside_cache_status;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.problem_thrown_away_cache_status;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_problem_not_set_aside;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_problem_not_thrown_away;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_problem_set_aside;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_problem_thrown_away;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_not_set_aside;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_not_thrown_away;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_set_aside;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_thrown_away;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.tactic_set_aside_cache_status;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.tactic_thrown_away_cache_status;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_lookahead_problem;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered.join_ordered_tactic_p;
import static com.cyc.cycjava.cycl.memoization_state.$memoization_state$;
import static com.cyc.cycjava.cycl.memoization_state.caching_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_enter_multi_key_n;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.create_caching_state;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lock;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_put;
import static com.cyc.cycjava.cycl.memoization_state.note_memoized_function;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-TACTICIAN-UNINTERESTINGNESS
 * source file: /cyc/top/cycl/inference/harness/removal-tactician-uninterestingness.lisp
 * created:     2019/07/03 17:37:41
 */
public final class removal_tactician_uninterestingness extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @return removal-strategy-uninterestingness-explanation-type-p
     */
    @LispMethod(comment = "@return removal-strategy-uninterestingness-explanation-type-p")
    public static final SubLObject removal_strategy_why_problem_already_thrown_awayP(SubLObject strategy, SubLObject problem) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.rederive_why_removal_strategy_chooses_to_throw_away_problemP(strategy, problem)) {
            {
                SubLObject explanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                return inference_tactician_strategic_uninterestingness.strategy_uninterestingness_explanation_type(explanation);
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_not_to_activate_any_strategems_on_problemP(strategy, problem)) {
                return $PROBLEM_HAS_NO_ACTIVATIBLE_REMOVAL_STRATEGEMS;
            } else {
                return $PROBLEM_ALREADY_THROWN_AWAY;
            }
        }
    }

    /**
     * Returns the total estimated productivity of transforming PROBLEM in all possible ways.
     */
    @LispMethod(comment = "Returns the total estimated productivity of transforming PROBLEM in all possible ways.")
    public static final SubLObject removal_strategy_total_transformation_productivity(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_productivity = ZERO_INTEGER;
                SubLObject candidate_tactic_specs = NIL;
                SubLObject mt_var = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        candidate_tactic_specs = inference_worker_transformation.single_literal_problem_candidate_transformation_tactic_specs(problem);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = candidate_tactic_specs;
                    SubLObject tactic_spec = NIL;
                    for (tactic_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic_spec = cdolist_list_var.first()) {
                        {
                            SubLObject datum = tactic_spec;
                            SubLObject current = datum;
                            SubLObject hl_module = NIL;
                            SubLObject productivity = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt32);
                            hl_module = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt32);
                            productivity = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL == inference_tactician_strategic_uninterestingness.strategy_disallows_use_of_hl_module_on_problemP(strategy, hl_module, problem)) {
                                    total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, productivity);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt32);
                            }
                        }
                    }
                }
                return total_productivity;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM has motivation according to STRATEGY,
    but is no longer active or set-aside.
     */
    @LispMethod(comment = "@return booleanp; whether PROBLEM has motivation according to STRATEGY,\r\nbut is no longer active or set-aside.")
    public static final SubLObject removal_strategy_problem_thrown_awayP(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, REMOVAL_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return makeBoolean((NIL != removal_tactician_datastructures.removal_strategy_problem_pendingP(strategy, problem)) && (NIL == removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem)));
    }

    public static final SubLObject removal_strategy_preferred_backchain_required_join_ordered_tactic_internal(SubLObject strategy, SubLObject problem) {
        {
            SubLObject best_tactic = $UNDETERMINED;
            SubLObject best_productivity = $POSITIVE_INFINITY;
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $JOIN_ORDERED)) {
                    {
                        SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
                        if ((NIL != inference_trampolines.problem_backchain_requiredP(lookahead_problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem))) {
                            {
                                SubLObject productivity = com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_total_transformation_productivity(strategy, lookahead_problem);
                                if (NIL != inference_datastructures_enumerated_types.productivity_L(productivity, best_productivity)) {
                                    best_tactic = tactic;
                                    best_productivity = productivity;
                                }
                            }
                        }
                    }
                }
            }
            return values(best_tactic, best_productivity);
        }
    }

    public static final SubLObject removal_strategy_chooses_to_totally_set_aside_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (siblings_already_consideredP == UNPROVIDED) {
            siblings_already_consideredP = NIL;
        }
        return NIL;
    }

    public static final SubLObject rederive_why_removal_strategy_chooses_to_throw_away_problemP(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject throw_awayP = NIL;
                {
                    SubLObject _prev_bind_0 = $removal_strategy_uses_already_thrown_away_cacheP$.currentBinding(thread);
                    try {
                        $removal_strategy_uses_already_thrown_away_cacheP$.bind(NIL, thread);
                        throw_awayP = com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED);
                    } finally {
                        $removal_strategy_uses_already_thrown_away_cacheP$.rebind(_prev_bind_0, thread);
                    }
                }
                return throw_awayP;
            }
        }
    }

    public static final SubLObject controlling_strategy_allows_split_tactic_to_be_thrown_awayP(SubLObject strategy, SubLObject split_tactic) {
        if (NIL != inference_tactician.substrategyP(strategy)) {
            return inference_datastructures_strategy.controlling_strategy_callback(strategy, $SUBSTRATEGY_ALLOW_SPLIT_TACTIC_THROWN_AWAY_WRT_REMOVAL, split_tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            return T;
        }
    }

    /**
     * Temporary control parameter;
     * When non-nil, the set-aside policy for split tactics is weakened to be more conservative.
     */
    // defparameter
    @LispMethod(comment = "Temporary control parameter;\r\nWhen non-nil, the set-aside policy for split tactics is weakened to be more conservative.\nTemporary control parameter;\nWhen non-nil, the set-aside policy for split tactics is weakened to be more conservative.\ndefparameter")
    public static final SubLSymbol $removal_strategy_weaken_split_tactic_set_aside_policyP$ = makeSymbol("*REMOVAL-STRATEGY-WEAKEN-SPLIT-TACTIC-SET-ASIDE-POLICY?*");

    // Definitions
    /**
     * Bound to NIL when trying to rederive the reason that something was put in the cache.
     */
    // defparameter
    @LispMethod(comment = "Bound to NIL when trying to rederive the reason that something was put in the cache.\ndefparameter")
    private static final SubLSymbol $removal_strategy_uses_already_thrown_away_cacheP$ = makeSymbol("*REMOVAL-STRATEGY-USES-ALREADY-THROWN-AWAY-CACHE?*");

    public static final SubLFile me = new removal_tactician_uninterestingness();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $removal_strategy_uses_uninterestingness_cacheP$ = makeSymbol("*REMOVAL-STRATEGY-USES-UNINTERESTINGNESS-CACHE?*");

    private static final SubLSymbol $ALL_TACTICS_THROWN_AWAY = makeKeyword("ALL-TACTICS-THROWN-AWAY");

    private static final SubLSymbol $PROBLEM_STRATEGY_NOT_CONTINUABLE = makeKeyword("PROBLEM-STRATEGY-NOT-CONTINUABLE");

    private static final SubLSymbol $TACTIC_HL_MODULE_THROWN_AWAY = makeKeyword("TACTIC-HL-MODULE-THROWN-AWAY");

    private static final SubLSymbol $TACTIC_ALREADY_THROWN_AWAY = makeKeyword("TACTIC-ALREADY-THROWN-AWAY");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_COMPLETE_SIBLING_CONJUNCTIVE_REMOVAL = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-COMPLETE-SIBLING-CONJUNCTIVE-REMOVAL");

    private static final SubLString $$$tactic_is_disallowed = makeString("tactic is disallowed");

    private static final SubLString $$$tactic_is_impossible = makeString("tactic is impossible");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_SIBLING_BACKCHAIN_REQUIRED = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-SIBLING-BACKCHAIN-REQUIRED");

    private static final SubLSymbol $META_REMOVAL_TACTIC_THROWN_AWAY = makeKeyword("META-REMOVAL-TACTIC-THROWN-AWAY");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-PROBLEM-THROWN-AWAY");

    private static final SubLSymbol $TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY = makeKeyword("TACTIC-THROWN-AWAY-BECAUSE-LOOKAHEAD-PROBLEM-THROWN-AWAY");

    private static final SubLSymbol $TACTIC_STRATEGY_NOT_CONTINUABLE = makeKeyword("TACTIC-STRATEGY-NOT-CONTINUABLE");

    private static final SubLSymbol $LINK_SUPPORTED_PROBLEM_THROWN_AWAY = makeKeyword("LINK-SUPPORTED-PROBLEM-THROWN-AWAY");

    private static final SubLSymbol $PROBLEM_ALREADY_SET_ASIDE = makeKeyword("PROBLEM-ALREADY-SET-ASIDE");

    private static final SubLSymbol $ALL_TACTICS_SET_ASIDE = makeKeyword("ALL-TACTICS-SET-ASIDE");

    private static final SubLString $str17$Condition__A_not_handled_yet = makeString("Condition ~A not handled yet");

    private static final SubLSymbol $sym18$REMOVAL_STRATEGY_COMPUTE_TACTIC_UNINTERESTINGNESS_CACHE_CONDITION = makeSymbol("REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS");

    private static final SubLSymbol $removal_strategy_compute_tactic_uninterestingness_cache_conditions_caching_state$ = makeSymbol("*REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS-CACHING-STATE*");

    private static final SubLSymbol $sym20$REMOVAL_STRATEGY_COMPUTE_PROBLEM_UNINTERESTINGNESS_CACHE_CONDITIO = makeSymbol("REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS");

    private static final SubLSymbol $removal_strategy_compute_problem_uninterestingness_cache_conditions_caching_state$ = makeSymbol("*REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS-CACHING-STATE*");

    private static final SubLSymbol $TACTIC_ALREADY_SET_ASIDE = makeKeyword("TACTIC-ALREADY-SET-ASIDE");

    private static final SubLSymbol $JOIN_ORDERED_TACTIC_LEADS_TO_SET_ASIDE_CONJUNCTIVE_REMOVALS = makeKeyword("JOIN-ORDERED-TACTIC-LEADS-TO-SET-ASIDE-CONJUNCTIVE-REMOVALS");

    private static final SubLSymbol $TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-PROBLEM-SET-ASIDE");

    private static final SubLSymbol $TACTIC_SET_ASIDE_BECAUSE_LOOKAHEAD_PROBLEM_SET_ASIDE = makeKeyword("TACTIC-SET-ASIDE-BECAUSE-LOOKAHEAD-PROBLEM-SET-ASIDE");

    private static final SubLSymbol $LINK_SUPPORTED_PROBLEM_SET_ASIDE = makeKeyword("LINK-SUPPORTED-PROBLEM-SET-ASIDE");

    private static final SubLSymbol $SUBSTRATEGY_TOTALLY_THROW_AWAY_TACTIC = makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC");

    private static final SubLSymbol REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");

    private static final SubLSymbol $SPLIT_TACTIC_THROWN_AWAY_BECAUSE_SIBLING_TACTIC_THROWN_AWAY = makeKeyword("SPLIT-TACTIC-THROWN-AWAY-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");

    private static final SubLSymbol $SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_THROWN_AWAY = makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-THROWN-AWAY");

    private static final SubLSymbol $SUBSTRATEGY_ALLOW_SPLIT_TACTIC_SET_ASIDE_WRT_REMOVAL = makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL");

    private static final SubLSymbol $sym41$_ = makeSymbol("<");

    /**
     * Whether :set-aside plus non-continuable should be strengthened to :throw-away for TACTIC.
     * This is usually T except for special circumstances, e.g. split tactic removal lookahead when transformation is allowed.
     */
    @LispMethod(comment = "Whether :set-aside plus non-continuable should be strengthened to :throw-away for TACTIC.\r\nThis is usually T except for special circumstances, e.g. split tactic removal lookahead when transformation is allowed.\nWhether :set-aside plus non-continuable should be strengthened to :throw-away for TACTIC.\nThis is usually T except for special circumstances, e.g. split tactic removal lookahead when transformation is allowed.")
    public static final SubLObject removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP_alt(SubLObject tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != inference_worker_split.split_tactic_p(tactic)) && (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic)))) {
                return NIL;
            }
            return inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.getDynamicValue(thread);
        }
    }

    /**
     * Whether :set-aside plus non-continuable should be strengthened to :throw-away for TACTIC.
     * This is usually T except for special circumstances, e.g. split tactic removal lookahead when transformation is allowed.
     */
    @LispMethod(comment = "Whether :set-aside plus non-continuable should be strengthened to :throw-away for TACTIC.\r\nThis is usually T except for special circumstances, e.g. split tactic removal lookahead when transformation is allowed.\nWhether :set-aside plus non-continuable should be strengthened to :throw-away for TACTIC.\nThis is usually T except for special circumstances, e.g. split tactic removal lookahead when transformation is allowed.")
    public static SubLObject removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != inference_worker_split.split_tactic_p(tactic)) && (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic)))) {
            return NIL;
        }
        return inference_tactician.$set_aside_non_continuable_implies_throw_away_for_removalP$.getDynamicValue(thread);
    }

    /**
     * Whether :set-aside plus non-continuable should be strengthened to :throw-away for PROBLEM.
     * This is usually T except for special circumstances, e.g. if PROBLEM is a split problem and transformation is allowed.
     */
    @LispMethod(comment = "Whether :set-aside plus non-continuable should be strengthened to :throw-away for PROBLEM.\r\nThis is usually T except for special circumstances, e.g. if PROBLEM is a split problem and transformation is allowed.\nWhether :set-aside plus non-continuable should be strengthened to :throw-away for PROBLEM.\nThis is usually T except for special circumstances, e.g. if PROBLEM is a split problem and transformation is allowed.")
    public static final SubLObject removal_strategy_set_aside_non_continuable_implies_throw_away_problemP_alt(SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.getDynamicValue(thread);
        }
    }

    /**
     * Whether :set-aside plus non-continuable should be strengthened to :throw-away for PROBLEM.
     * This is usually T except for special circumstances, e.g. if PROBLEM is a split problem and transformation is allowed.
     */
    @LispMethod(comment = "Whether :set-aside plus non-continuable should be strengthened to :throw-away for PROBLEM.\r\nThis is usually T except for special circumstances, e.g. if PROBLEM is a split problem and transformation is allowed.\nWhether :set-aside plus non-continuable should be strengthened to :throw-away for PROBLEM.\nThis is usually T except for special circumstances, e.g. if PROBLEM is a split problem and transformation is allowed.")
    public static SubLObject removal_strategy_set_aside_non_continuable_implies_throw_away_problemP(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_tactician.$set_aside_non_continuable_implies_throw_away_for_removalP$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY, after careful deliberation, chooses to throw away PROBLEM wrt removal.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY, after careful deliberation, chooses to throw away PROBLEM wrt removal.")
    public static final SubLObject removal_strategy_chooses_to_throw_away_problemP(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP) {
        if (consider_all_tacticsP == UNPROVIDED) {
            consider_all_tacticsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problem_uncacheableP(strategy, problem, consider_all_tacticsP)) {
                return T;
            } else {
                {
                    SubLObject throw_away = problem_thrown_away_cache_status(problem, strategy);
                    if (NIL != booleanp(throw_away)) {
                        return throw_away;
                    } else {
                        {
                            SubLObject throw_awayP = com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problem_cacheableP(strategy, problem, consider_all_tacticsP);
                            if (NIL != throw_awayP) {
                                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($PROBLEM_ALREADY_THROWN_AWAY, problem, NIL, NIL, NIL);
                                }
                                set_problem_thrown_away(problem, strategy);
                            } else {
                                set_problem_not_thrown_away(problem, strategy);
                            }
                            return throw_awayP;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_problemP(final SubLObject strategy, final SubLObject problem, SubLObject consider_all_tacticsP, SubLObject pending_implies_thrown_awayP) {
        if (consider_all_tacticsP == UNPROVIDED) {
            consider_all_tacticsP = T;
        }
        if (pending_implies_thrown_awayP == UNPROVIDED) {
            pending_implies_thrown_awayP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject conditions = removal_strategy_compute_problem_uninterestingness_cache_conditions(consider_all_tacticsP, pending_implies_thrown_awayP, NIL);
        final SubLObject cache_value = inference_datastructures_strategy.problem_thrown_away_cache_status(problem, strategy, conditions);
        if (NIL != booleanp(cache_value)) {
            result = cache_value;
        }
        if ((T != cache_value) && (NIL != removal_strategy_chooses_to_throw_away_problem_uncacheableP(strategy, problem, consider_all_tacticsP, pending_implies_thrown_awayP))) {
            return T;
        }
        if ($RECOMPUTE == cache_value) {
            final SubLObject throw_awayP = removal_strategy_chooses_to_throw_away_problem_cacheableP(strategy, problem, consider_all_tacticsP, pending_implies_thrown_awayP);
            if (NIL != $removal_strategy_uses_uninterestingness_cacheP$.getDynamicValue(thread)) {
                if (NIL != throw_awayP) {
                    inference_datastructures_strategy.set_problem_thrown_away(problem, strategy, conditions);
                } else {
                    inference_datastructures_strategy.set_problem_not_thrown_away(problem, strategy, conditions);
                }
            }
            result = throw_awayP;
        }
        return result;
    }

    /**
     * The parts of throw-away reasoning that must always be recomputed and cannot be cached
     * because it's too hard to figure out when the cache needs to be cleared.
     * Or perhaps because they're really cheap to recompute.
     */
    @LispMethod(comment = "The parts of throw-away reasoning that must always be recomputed and cannot be cached\r\nbecause it\'s too hard to figure out when the cache needs to be cleared.\r\nOr perhaps because they\'re really cheap to recompute.\nThe parts of throw-away reasoning that must always be recomputed and cannot be cached\nbecause it\'s too hard to figure out when the cache needs to be cleared.\nOr perhaps because they\'re really cheap to recompute.")
    public static final SubLObject removal_strategy_chooses_to_throw_away_problem_uncacheableP(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $removal_strategy_uses_already_thrown_away_cacheP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_problem_thrown_awayP(strategy, problem))) {
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_why_problem_already_thrown_awayP(strategy, problem), problem, NIL, NIL, NIL);
                }
                return T;
            } else {
                if ((NIL != consider_all_tacticsP) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_all_tacticsP(strategy, problem, T))) {
                    if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                        inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($ALL_TACTICS_THROWN_AWAY, problem, NIL, NIL, NIL);
                    }
                    return T;
                } else {
                    if (((NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_set_aside_non_continuable_implies_throw_away_problemP(problem)) && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, problem, T, T))) {
                        {
                            SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($PROBLEM_STRATEGY_NOT_CONTINUABLE, problem, NIL, NIL, subexplanation);
                            }
                        }
                        return T;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_problem_uncacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP, final SubLObject pending_implies_thrown_awayP) {
        return NIL;
    }

    /**
     * The parts of throw-away reasoning that can be cached.
     * The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.
     */
    @LispMethod(comment = "The parts of throw-away reasoning that can be cached.\r\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.\nThe parts of throw-away reasoning that can be cached.\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.")
    public static final SubLObject removal_strategy_chooses_to_throw_away_problem_cacheableP(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_problemP(strategy, problem)) {
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_problem(strategy, problem), NIL, NIL, NIL, NIL);
                }
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_problem_cacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP, final SubLObject pending_implies_thrown_awayP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != pending_implies_thrown_awayP) && (NIL != removal_strategy_problem_pending_and_not_set_asideP(strategy, problem))) {
            return T;
        }
        if (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_problemP(strategy, problem)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_problem(strategy, problem), NIL, NIL, NIL, NIL);
            }
            return T;
        }
        if ((NIL != consider_all_tacticsP) && (NIL != removal_strategy_chooses_to_throw_away_all_tacticsP(strategy, problem, T, pending_implies_thrown_awayP))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($ALL_TACTICS_THROWN_AWAY, problem, NIL, NIL, NIL);
            }
            return T;
        }
        if (((NIL != removal_strategy_set_aside_non_continuable_implies_throw_away_problemP(problem)) && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))) && (NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, T, T))) {
            final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($PROBLEM_STRATEGY_NOT_CONTINUABLE, problem, NIL, NIL, subexplanation);
            }
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the problem of STRATEGEM
     * 		might be thrown away wrt removal.  If T, the analysis will not be redone.
     */
    @LispMethod(comment = "@param PROBLEM-ALREADY-CONSIDERED?;\r\n\t\twhether the caller has already considered that the problem of STRATEGEM\r\n\t\tmight be thrown away wrt removal.  If T, the analysis will not be redone.")
    public static final SubLObject removal_strategy_chooses_to_throw_away_strategemP_alt(SubLObject strategy, SubLObject strategem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            {
                SubLObject tactic = strategem;
                return com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, UNPROVIDED);
            }
        } else {
            {
                SubLObject link = strategem;
                return com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_linkP(strategy, link, problem_already_consideredP);
            }
        }
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the problem of STRATEGEM
     * 		might be thrown away wrt removal.  If T, the analysis will not be redone.
     */
    @LispMethod(comment = "@param PROBLEM-ALREADY-CONSIDERED?;\r\n\t\twhether the caller has already considered that the problem of STRATEGEM\r\n\t\tmight be thrown away wrt removal.  If T, the analysis will not be redone.")
    public static SubLObject removal_strategy_chooses_to_throw_away_strategemP(final SubLObject strategy, final SubLObject strategem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return removal_strategy_chooses_to_throw_away_tacticP(strategy, strategem, problem_already_consideredP, UNPROVIDED, UNPROVIDED);
        }
        return removal_strategy_chooses_to_throw_away_linkP(strategy, strategem, problem_already_consideredP);
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the problem of TACTIC
     * 		might be thrown away wrt removal..  If T, the analysis will not be redone.
     */
    @LispMethod(comment = "@param PROBLEM-ALREADY-CONSIDERED?;\r\n\t\twhether the caller has already considered that the problem of TACTIC\r\n\t\tmight be thrown away wrt removal..  If T, the analysis will not be redone.")
    public static final SubLObject removal_strategy_chooses_to_throw_away_tacticP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (siblings_already_consideredP == UNPROVIDED) {
            siblings_already_consideredP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tactic_uncacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP)) {
                return T;
            } else {
                {
                    SubLObject throw_away = tactic_thrown_away_cache_status(tactic, strategy);
                    if (NIL != booleanp(throw_away)) {
                        return throw_away;
                    } else {
                        {
                            SubLObject throw_awayP = com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tactic_cacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP);
                            if (NIL != throw_awayP) {
                                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_ALREADY_THROWN_AWAY, NIL, tactic, NIL, NIL);
                                }
                                set_tactic_thrown_away(tactic, strategy);
                            } else {
                                set_tactic_not_thrown_away(tactic, strategy);
                            }
                            return throw_awayP;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject use_strategem_thrown_away_cacheP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (siblings_already_consideredP == UNPROVIDED) {
            siblings_already_consideredP = NIL;
        }
        if (use_strategem_thrown_away_cacheP == UNPROVIDED) {
            use_strategem_thrown_away_cacheP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject conditions = removal_strategy_compute_tactic_uninterestingness_cache_conditions(problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP, NIL);
        final SubLObject cache_value = inference_datastructures_strategy.tactic_thrown_away_cache_status(tactic, strategy, conditions);
        if (NIL != booleanp(cache_value)) {
            result = cache_value;
        }
        if ((T != cache_value) && (NIL != removal_strategy_chooses_to_throw_away_tactic_uncacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP))) {
            return T;
        }
        if ($RECOMPUTE == cache_value) {
            final SubLObject throw_awayP = removal_strategy_chooses_to_throw_away_tactic_cacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP);
            if (NIL != $removal_strategy_uses_uninterestingness_cacheP$.getDynamicValue(thread)) {
                if (NIL != throw_awayP) {
                    inference_datastructures_strategy.set_tactic_thrown_away(tactic, strategy, conditions);
                } else {
                    inference_datastructures_strategy.set_tactic_not_thrown_away(tactic, strategy, conditions);
                }
            }
            result = throw_awayP;
        }
        return result;
    }

    /**
     * The parts of throw-away reasoning that must always be recomputed and cannot be cached
     * because it's too hard to figure out when the cache needs to be cleared.
     * Or perhaps because they're really cheap to recompute.
     */
    @LispMethod(comment = "The parts of throw-away reasoning that must always be recomputed and cannot be cached\r\nbecause it\'s too hard to figure out when the cache needs to be cleared.\r\nOr perhaps because they\'re really cheap to recompute.\nThe parts of throw-away reasoning that must always be recomputed and cannot be cached\nbecause it\'s too hard to figure out when the cache needs to be cleared.\nOr perhaps because they\'re really cheap to recompute.")
    public static final SubLObject removal_strategy_chooses_to_throw_away_tactic_uncacheableP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $removal_strategy_uses_already_thrown_away_cacheP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_tactic_thrown_awayP(strategy, tactic))) {
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_ALREADY_THROWN_AWAY, NIL, tactic, NIL, NIL);
                }
                return T;
            } else {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tactic_hl_moduleP(strategy, tactic)) {
                    if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                        inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_HL_MODULE_THROWN_AWAY, NIL, tactic, NIL, NIL);
                    }
                    return T;
                } else {
                    if (NIL == inference_tactician_strategic_uninterestingness.strategy_admits_tactic_wrt_proof_specP(strategy, tactic)) {
                        return T;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_meta_removal_tacticP(strategy, tactic)) {
                            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($META_REMOVAL_TACTIC_THROWN_AWAY, NIL, tactic, NIL, NIL);
                            }
                            return T;
                        }
                    }
                }
            }
            if (NIL == problem_already_consideredP) {
                {
                    SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, NIL)) {
                        {
                            SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY, NIL, tactic, NIL, subexplanation);
                            }
                        }
                        return T;
                    }
                }
            }
            if ((NIL != inference_worker.content_tactic_p(tactic)) && (NIL != inference_tactician_strategic_uninterestingness.tactic_impossibleP(tactic, strategy))) {
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($$$tactic_is_impossible, NIL, NIL, NIL, NIL);
                }
                return T;
            } else {
                if ((NIL != inference_worker.logical_tactic_p(tactic)) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP(strategy, tactic))) {
                    {
                        SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                        if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                            inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY, NIL, tactic, NIL, subexplanation);
                        }
                    }
                    return T;
                } else {
                    if (((NIL == siblings_already_consideredP) && (NIL != inference_worker_split.split_tactic_p(tactic))) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_split_tacticP(strategy, tactic))) {
                        return T;
                    } else {
                        if (((NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP(tactic)) && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, T, T, T))) {
                            {
                                SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_STRATEGY_NOT_CONTINUABLE, NIL, tactic, NIL, subexplanation);
                                }
                            }
                            return T;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_tactic_uncacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject use_strategem_thrown_away_cacheP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != removal_strategy_chooses_to_throw_away_tactic_hl_moduleP(strategy, tactic)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_HL_MODULE_THROWN_AWAY, NIL, tactic, NIL, NIL);
            }
            return T;
        }
        if (NIL == inference_tactician_strategic_uninterestingness.strategy_admits_tactic_wrt_proof_specP(strategy, tactic)) {
            return T;
        }
        return NIL;
    }

    /**
     * The parts of throw-away reasoning that can be cached.
     * The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.
     */
    @LispMethod(comment = "The parts of throw-away reasoning that can be cached.\r\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.\nThe parts of throw-away reasoning that can be cached.\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.")
    public static final SubLObject removal_strategy_chooses_to_throw_away_tactic_cacheableP(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic)) {
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_tactic(strategy, tactic), NIL, NIL, NIL, NIL);
                }
                return T;
            } else {
                if ((NIL != inference_worker.connected_conjunction_tactic_p(tactic)) && (NIL != inference_tactician_utilities.problem_has_some_complete_non_thrown_away_removal_tacticP(inference_datastructures_tactic.tactic_problem(tactic), strategy))) {
                    if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                        inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_COMPLETE_SIBLING_CONJUNCTIVE_REMOVAL, NIL, tactic, NIL, NIL);
                    }
                    return T;
                } else {
                    if ((NIL != inference_worker.structural_tactic_p(tactic)) && (NIL != inference_tactician_strategic_uninterestingness.tactic_disallowedP(tactic, strategy))) {
                        if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                            inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($$$tactic_is_disallowed, NIL, NIL, NIL, NIL);
                        }
                        return T;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_tactic_cacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject use_strategem_thrown_away_cacheP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != use_strategem_thrown_away_cacheP) && (NIL != removal_strategy_tactic_thrown_awayP(strategy, tactic))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_ALREADY_THROWN_AWAY, NIL, tactic, NIL, NIL);
            }
            return T;
        }
        if (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_throw_away_tactic(strategy, tactic), NIL, NIL, NIL, NIL);
            }
            return T;
        }
        if ((NIL != inference_worker.generalized_logical_conjunctive_tactic_p(tactic)) && (NIL != inference_tactician_utilities.problem_has_some_complete_non_thrown_away_removal_tacticP(inference_datastructures_tactic.tactic_problem(tactic), strategy))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_COMPLETE_SIBLING_CONJUNCTIVE_REMOVAL, NIL, tactic, NIL, NIL);
            }
            return T;
        }
        if ((NIL != inference_worker.structural_tactic_p(tactic)) && (NIL != inference_tactician_strategic_uninterestingness.tactic_disallowed_or_doomedP(tactic, strategy))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($$$tactic_is_disallowed, NIL, NIL, NIL, NIL);
            }
            return T;
        }
        if ((NIL != inference_worker.content_tactic_p(tactic)) && (NIL != inference_tactician_strategic_uninterestingness.tactic_impossibleP(tactic, strategy))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($$$tactic_is_impossible, NIL, NIL, NIL, NIL);
            }
            return T;
        }
        if (((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) && (NIL != inference_datastructures_problem.problem_backchain_requiredP(inference_datastructures_tactic.tactic_problem(tactic)))) && (!tactic.eql(removal_strategy_preferred_backchain_required_join_ordered_tactic(strategy, inference_datastructures_tactic.tactic_problem(tactic))))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_SIBLING_BACKCHAIN_REQUIRED, NIL, tactic, NIL, NIL);
            }
            return T;
        }
        if (NIL != removal_strategy_chooses_to_throw_away_meta_removal_tacticP(strategy, tactic)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($META_REMOVAL_TACTIC_THROWN_AWAY, NIL, tactic, NIL, NIL);
            }
            return T;
        }
        if (NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            if (NIL != removal_strategy_chooses_to_throw_away_problemP(strategy, problem, NIL, UNPROVIDED)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_PROBLEM_THROWN_AWAY, NIL, tactic, NIL, subexplanation);
                }
                return T;
            }
        }
        if ((NIL != inference_worker.logical_tactic_p(tactic)) && (NIL != removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP(strategy, tactic))) {
            final SubLObject subexplanation2 = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_THROWN_AWAY_BECAUSE_LOOKAHEAD_PROBLEM_THROWN_AWAY, NIL, tactic, NIL, subexplanation2);
            }
            return T;
        }
        if (((NIL == siblings_already_consideredP) && (NIL != inference_worker_split.split_tactic_p(tactic))) && (NIL != removal_strategy_chooses_to_throw_away_split_tacticP(strategy, tactic))) {
            return T;
        }
        if (((NIL != removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP(tactic)) && (NIL == inference_datastructures_strategy.strategy_continuableP(strategy))) && (NIL != removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, T, T, T))) {
            final SubLObject subexplanation2 = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_STRATEGY_NOT_CONTINUABLE, NIL, tactic, NIL, subexplanation2);
            }
            return T;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP_alt(SubLObject tactic) {
        {
            SubLObject result = NIL;
            SubLObject tactic_var = tactic;
            SubLObject rest = NIL;
            for (rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic_var)); !((NIL != result) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject sibling_tactic = rest.first();
                    if (sibling_tactic != tactic_var) {
                        if (NIL != inference_worker_restriction.simplification_tactic_p(sibling_tactic)) {
                            result = T;
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP(final SubLObject tactic) {
        SubLObject result;
        SubLObject rest;
        SubLObject sibling_tactic;
        for (result = NIL, rest = NIL, rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic)); (NIL == result) && (NIL != rest); rest = rest.rest()) {
            sibling_tactic = rest.first();
            if ((!sibling_tactic.eql(tactic)) && (NIL != inference_worker_restriction.simplification_tactic_p(sibling_tactic))) {
                result = T;
            }
        }
        return result;
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the supported problem of LINK
     * 		might be thrown away wrt removal.  If T, the analysis will not be redone.
     */
    @LispMethod(comment = "@param PROBLEM-ALREADY-CONSIDERED?;\r\n\t\twhether the caller has already considered that the supported problem of LINK\r\n\t\tmight be thrown away wrt removal.  If T, the analysis will not be redone.")
    public static final SubLObject removal_strategy_chooses_to_throw_away_linkP_alt(SubLObject strategy, SubLObject link, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == problem_already_consideredP) {
                {
                    SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED)) {
                        {
                            SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($LINK_SUPPORTED_PROBLEM_THROWN_AWAY, NIL, NIL, link, subexplanation);
                            }
                        }
                        return T;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the supported problem of LINK
     * 		might be thrown away wrt removal.  If T, the analysis will not be redone.
     */
    @LispMethod(comment = "@param PROBLEM-ALREADY-CONSIDERED?;\r\n\t\twhether the caller has already considered that the supported problem of LINK\r\n\t\tmight be thrown away wrt removal.  If T, the analysis will not be redone.")
    public static SubLObject removal_strategy_chooses_to_throw_away_linkP(final SubLObject strategy, final SubLObject link, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            if (NIL != removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED, UNPROVIDED)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($LINK_SUPPORTED_PROBLEM_THROWN_AWAY, NIL, NIL, link, subexplanation);
                }
                return T;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY, after careful deliberation, chooses to set aside PROBLEM wrt removal.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY, after careful deliberation, chooses to set aside PROBLEM wrt removal.")
    public static final SubLObject removal_strategy_chooses_to_set_aside_problemP_alt(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
        if (consider_all_tacticsP == UNPROVIDED) {
            consider_all_tacticsP = T;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problem_uncacheableP(strategy, problem, consider_all_tacticsP, thrown_away_already_consideredP)) {
                return T;
            } else {
                {
                    SubLObject set_aside = problem_set_aside_cache_status(problem, strategy);
                    if (NIL != booleanp(set_aside)) {
                        return set_aside;
                    } else {
                        {
                            SubLObject set_asideP = com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problem_cacheableP(strategy, problem, consider_all_tacticsP, thrown_away_already_consideredP);
                            if (NIL != set_asideP) {
                                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($PROBLEM_ALREADY_SET_ASIDE, problem, NIL, NIL, NIL);
                                }
                                set_problem_set_aside(problem, strategy);
                            } else {
                                set_problem_not_set_aside(problem, strategy);
                            }
                            return set_asideP;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY, after careful deliberation, chooses to set aside PROBLEM wrt removal.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY, after careful deliberation, chooses to set aside PROBLEM wrt removal.")
    public static SubLObject removal_strategy_chooses_to_set_aside_problemP(final SubLObject strategy, final SubLObject problem, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
        if (consider_all_tacticsP == UNPROVIDED) {
            consider_all_tacticsP = T;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject conditions = removal_strategy_compute_problem_uninterestingness_cache_conditions(consider_all_tacticsP, $NOT_APPLICABLE, thrown_away_already_consideredP);
        final SubLObject cache_value = inference_datastructures_strategy.problem_set_aside_cache_status(problem, strategy, conditions);
        if (NIL != booleanp(cache_value)) {
            result = cache_value;
        }
        if ((T != cache_value) && (NIL != removal_strategy_chooses_to_set_aside_problem_uncacheableP(strategy, problem, consider_all_tacticsP, thrown_away_already_consideredP))) {
            return T;
        }
        if ($RECOMPUTE == cache_value) {
            final SubLObject set_asideP = removal_strategy_chooses_to_set_aside_problem_cacheableP(strategy, problem, consider_all_tacticsP, thrown_away_already_consideredP);
            if (NIL != $removal_strategy_uses_uninterestingness_cacheP$.getDynamicValue(thread)) {
                if (NIL != set_asideP) {
                    inference_datastructures_strategy.set_problem_set_aside(problem, strategy, conditions);
                } else {
                    inference_datastructures_strategy.set_problem_not_set_aside(problem, strategy, conditions);
                }
            }
            result = set_asideP;
        }
        return result;
    }

    /**
     * The parts of set-aside reasoning that must always be recomputed and cannot be cached
     * because it's too hard to figure out when the cache needs to be cleared.
     * Or perhaps because they're really cheap to recompute.
     */
    @LispMethod(comment = "The parts of set-aside reasoning that must always be recomputed and cannot be cached\r\nbecause it\'s too hard to figure out when the cache needs to be cleared.\r\nOr perhaps because they\'re really cheap to recompute.\nThe parts of set-aside reasoning that must always be recomputed and cannot be cached\nbecause it\'s too hard to figure out when the cache needs to be cleared.\nOr perhaps because they\'re really cheap to recompute.")
    public static final SubLObject removal_strategy_chooses_to_set_aside_problem_uncacheableP_alt(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem)) {
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($PROBLEM_ALREADY_SET_ASIDE, problem, NIL, NIL, NIL);
                }
                return T;
            } else {
                if (((NIL != consider_all_tacticsP) && (NIL != inference_datastructures_strategy.strategically_possible_problem_p(problem, strategy))) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_all_tacticsP(strategy, problem, T))) {
                    if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                        inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($ALL_TACTICS_SET_ASIDE, problem, NIL, NIL, NIL);
                    }
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    @LispMethod(comment = "The parts of set-aside reasoning that must always be recomputed and cannot be cached\r\nbecause it\'s too hard to figure out when the cache needs to be cleared.\r\nOr perhaps because they\'re really cheap to recompute.\nThe parts of set-aside reasoning that must always be recomputed and cannot be cached\nbecause it\'s too hard to figure out when the cache needs to be cleared.\nOr perhaps because they\'re really cheap to recompute.")
    public static SubLObject removal_strategy_chooses_to_set_aside_problem_uncacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP, final SubLObject thrown_away_already_consideredP) {
        return NIL;
    }/**
     * The parts of set-aside reasoning that must always be recomputed and cannot be cached
     * because it's too hard to figure out when the cache needs to be cleared.
     * Or perhaps because they're really cheap to recompute.
     */


    /**
     * The parts of set-aside reasoning that can be cached.
     * The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.
     */
    @LispMethod(comment = "The parts of set-aside reasoning that can be cached.\r\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.\nThe parts of set-aside reasoning that can be cached.\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.")
    public static final SubLObject removal_strategy_chooses_to_set_aside_problem_cacheableP_alt(SubLObject strategy, SubLObject problem, SubLObject consider_all_tacticsP, SubLObject thrown_away_already_consideredP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == thrown_away_already_consideredP) && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_problemP(strategy, problem))) {
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_problem(strategy, problem), NIL, NIL, NIL, NIL);
                }
                return T;
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "The parts of set-aside reasoning that can be cached.\r\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.\nThe parts of set-aside reasoning that can be cached.\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.")
    public static SubLObject removal_strategy_chooses_to_set_aside_problem_cacheableP(final SubLObject strategy, final SubLObject problem, final SubLObject consider_all_tacticsP, final SubLObject thrown_away_already_consideredP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($PROBLEM_ALREADY_SET_ASIDE, problem, NIL, NIL, NIL);
            }
            return T;
        }
        if ((NIL == thrown_away_already_consideredP) && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_problemP(strategy, problem))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_problem(strategy, problem), NIL, NIL, NIL, NIL);
            }
            return T;
        }
        if (((NIL != consider_all_tacticsP) && (NIL != inference_datastructures_strategy.strategically_possible_problem_p(problem, strategy))) && (NIL != removal_strategy_chooses_to_set_aside_all_tacticsP(strategy, problem, T))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($ALL_TACTICS_SET_ASIDE, problem, NIL, NIL, NIL);
            }
            return T;
        }
        return NIL;
    }/**
     * The parts of set-aside reasoning that can be cached.
     * The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.
     */


    public static final SubLObject removal_strategy_chooses_to_set_aside_strategemP_alt(SubLObject strategy, SubLObject strategem, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            {
                SubLObject tactic = strategem;
                return com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, problem_already_consideredP, NIL, thrown_away_already_consideredP);
            }
        } else {
            {
                SubLObject link = strategem;
                return com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_linkP(strategy, link, problem_already_consideredP, thrown_away_already_consideredP);
            }
        }
    }

    public static SubLObject removal_strategy_chooses_to_set_aside_strategemP(final SubLObject strategy, final SubLObject strategem, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            return removal_strategy_chooses_to_set_aside_tacticP(strategy, strategem, problem_already_consideredP, NIL, thrown_away_already_consideredP);
        }
        return removal_strategy_chooses_to_set_aside_linkP(strategy, strategem, problem_already_consideredP, thrown_away_already_consideredP);
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the problem of TACTIC
     * 		might be set aside wrt removal.  If T, the analysis will not be redone.
     * @param THROWN-AWAY-ALREADY-CONSIDERED?;
     * 		don't redo work if this is being called from removal-strategy-chooses-to-throw-away-tactic?
     */
    @LispMethod(comment = "@param PROBLEM-ALREADY-CONSIDERED?;\r\n\t\twhether the caller has already considered that the problem of TACTIC\r\n\t\tmight be set aside wrt removal.  If T, the analysis will not be redone.\r\n@param THROWN-AWAY-ALREADY-CONSIDERED?;\r\n\t\tdon\'t redo work if this is being called from removal-strategy-chooses-to-throw-away-tactic?")
    public static final SubLObject removal_strategy_chooses_to_set_aside_tacticP_alt(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (siblings_already_consideredP == UNPROVIDED) {
            siblings_already_consideredP = NIL;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tactic_uncacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP)) {
                return T;
            } else {
                {
                    SubLObject set_aside = tactic_set_aside_cache_status(tactic, strategy);
                    if (NIL != booleanp(set_aside)) {
                        return set_aside;
                    } else {
                        {
                            SubLObject set_asideP = com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tactic_cacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP);
                            if (NIL != set_asideP) {
                                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_ALREADY_SET_ASIDE, NIL, tactic, NIL, NIL);
                                }
                                set_tactic_set_aside(tactic, strategy);
                            } else {
                                set_tactic_not_set_aside(tactic, strategy);
                            }
                            return set_asideP;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the problem of TACTIC
     * 		might be set aside wrt removal.  If T, the analysis will not be redone.
     * @param THROWN-AWAY-ALREADY-CONSIDERED?;
     * 		don't redo work if this is being called from removal-strategy-chooses-to-throw-away-tactic?
     */
    @LispMethod(comment = "@param PROBLEM-ALREADY-CONSIDERED?;\r\n\t\twhether the caller has already considered that the problem of TACTIC\r\n\t\tmight be set aside wrt removal.  If T, the analysis will not be redone.\r\n@param THROWN-AWAY-ALREADY-CONSIDERED?;\r\n\t\tdon\'t redo work if this is being called from removal-strategy-chooses-to-throw-away-tactic?")
    public static SubLObject removal_strategy_chooses_to_set_aside_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (siblings_already_consideredP == UNPROVIDED) {
            siblings_already_consideredP = NIL;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject conditions = removal_strategy_compute_tactic_uninterestingness_cache_conditions(problem_already_consideredP, siblings_already_consideredP, $NOT_APPLICABLE, thrown_away_already_consideredP);
        final SubLObject cache_value = inference_datastructures_strategy.tactic_set_aside_cache_status(tactic, strategy, conditions);
        if (NIL != booleanp(cache_value)) {
            result = cache_value;
        }
        if ((T != cache_value) && (NIL != removal_strategy_chooses_to_set_aside_tactic_uncacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP))) {
            return T;
        }
        if ($RECOMPUTE == cache_value) {
            final SubLObject set_asideP = removal_strategy_chooses_to_set_aside_tactic_cacheableP(strategy, tactic, problem_already_consideredP, siblings_already_consideredP, thrown_away_already_consideredP);
            if (NIL != $removal_strategy_uses_uninterestingness_cacheP$.getDynamicValue(thread)) {
                if (NIL != set_asideP) {
                    inference_datastructures_strategy.set_tactic_set_aside(tactic, strategy, conditions);
                } else {
                    inference_datastructures_strategy.set_tactic_not_set_aside(tactic, strategy, conditions);
                }
            }
            result = set_asideP;
        }
        return result;
    }

    public static SubLObject uninterestingness_cache_condition_as_boolean(final SubLObject condition) {
        if (NIL != booleanp(condition)) {
            return condition;
        }
        if (condition == $NOT_APPLICABLE) {
            return NIL;
        }
        Errors.error($str17$Condition__A_not_handled_yet, condition);
        return NIL;
    }

    public static SubLObject clear_removal_strategy_compute_tactic_uninterestingness_cache_conditions() {
        final SubLObject cs = $removal_strategy_compute_tactic_uninterestingness_cache_conditions_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_removal_strategy_compute_tactic_uninterestingness_cache_conditions(final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject use_strategem_thrown_away_cacheP, final SubLObject thrown_away_already_consideredP) {
        return memoization_state.caching_state_remove_function_results_with_args($removal_strategy_compute_tactic_uninterestingness_cache_conditions_caching_state$.getGlobalValue(), list(problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP, thrown_away_already_consideredP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_strategy_compute_tactic_uninterestingness_cache_conditions_internal(SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject use_strategem_thrown_away_cacheP, SubLObject thrown_away_already_consideredP) {
        problem_already_consideredP = uninterestingness_cache_condition_as_boolean(problem_already_consideredP);
        siblings_already_consideredP = uninterestingness_cache_condition_as_boolean(siblings_already_consideredP);
        use_strategem_thrown_away_cacheP = uninterestingness_cache_condition_as_boolean(use_strategem_thrown_away_cacheP);
        thrown_away_already_consideredP = uninterestingness_cache_condition_as_boolean(thrown_away_already_consideredP);
        final SubLObject consider_problemP = makeBoolean(NIL == problem_already_consideredP);
        final SubLObject consider_siblingsP = makeBoolean(NIL == siblings_already_consideredP);
        final SubLObject consider_thrown_awayP = makeBoolean(NIL == thrown_away_already_consideredP);
        return list(consider_problemP, consider_siblingsP, use_strategem_thrown_away_cacheP, consider_thrown_awayP);
    }

    public static SubLObject removal_strategy_compute_tactic_uninterestingness_cache_conditions(final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject use_strategem_thrown_away_cacheP, final SubLObject thrown_away_already_consideredP) {
        SubLObject caching_state = $removal_strategy_compute_tactic_uninterestingness_cache_conditions_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym18$REMOVAL_STRATEGY_COMPUTE_TACTIC_UNINTERESTINGNESS_CACHE_CONDITION, $removal_strategy_compute_tactic_uninterestingness_cache_conditions_caching_state$, NIL, EQ, FOUR_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP, thrown_away_already_consideredP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (problem_already_consideredP.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (siblings_already_consideredP.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (use_strategem_thrown_away_cacheP.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && thrown_away_already_consideredP.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(removal_strategy_compute_tactic_uninterestingness_cache_conditions_internal(problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP, thrown_away_already_consideredP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem_already_consideredP, siblings_already_consideredP, use_strategem_thrown_away_cacheP, thrown_away_already_consideredP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_removal_strategy_compute_problem_uninterestingness_cache_conditions() {
        final SubLObject cs = $removal_strategy_compute_problem_uninterestingness_cache_conditions_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_removal_strategy_compute_problem_uninterestingness_cache_conditions(final SubLObject consider_all_tacticsP, final SubLObject pending_implies_thrown_awayP, final SubLObject thrown_away_already_consideredP) {
        return memoization_state.caching_state_remove_function_results_with_args($removal_strategy_compute_problem_uninterestingness_cache_conditions_caching_state$.getGlobalValue(), list(consider_all_tacticsP, pending_implies_thrown_awayP, thrown_away_already_consideredP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_strategy_compute_problem_uninterestingness_cache_conditions_internal(SubLObject consider_all_tacticsP, SubLObject pending_implies_thrown_awayP, SubLObject thrown_away_already_consideredP) {
        consider_all_tacticsP = uninterestingness_cache_condition_as_boolean(consider_all_tacticsP);
        pending_implies_thrown_awayP = uninterestingness_cache_condition_as_boolean(pending_implies_thrown_awayP);
        thrown_away_already_consideredP = uninterestingness_cache_condition_as_boolean(thrown_away_already_consideredP);
        final SubLObject consider_thrown_awayP = makeBoolean(NIL == thrown_away_already_consideredP);
        return list(consider_all_tacticsP, pending_implies_thrown_awayP, consider_thrown_awayP);
    }

    public static SubLObject removal_strategy_compute_problem_uninterestingness_cache_conditions(final SubLObject consider_all_tacticsP, final SubLObject pending_implies_thrown_awayP, final SubLObject thrown_away_already_consideredP) {
        SubLObject caching_state = $removal_strategy_compute_problem_uninterestingness_cache_conditions_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym20$REMOVAL_STRATEGY_COMPUTE_PROBLEM_UNINTERESTINGNESS_CACHE_CONDITIO, $removal_strategy_compute_problem_uninterestingness_cache_conditions_caching_state$, NIL, EQ, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(consider_all_tacticsP, pending_implies_thrown_awayP, thrown_away_already_consideredP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (consider_all_tacticsP.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pending_implies_thrown_awayP.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && thrown_away_already_consideredP.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(removal_strategy_compute_problem_uninterestingness_cache_conditions_internal(consider_all_tacticsP, pending_implies_thrown_awayP, thrown_away_already_consideredP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(consider_all_tacticsP, pending_implies_thrown_awayP, thrown_away_already_consideredP));
        return memoization_state.caching_results(results3);
    }

    /**
     * The parts of set-aside reasoning that must always be recomputed and cannot be cached
     * because it's too hard to figure out when the cache needs to be cleared.
     * Or perhaps because they're really cheap to recompute.
     */
    @LispMethod(comment = "The parts of set-aside reasoning that must always be recomputed and cannot be cached\r\nbecause it\'s too hard to figure out when the cache needs to be cleared.\r\nOr perhaps because they\'re really cheap to recompute.\nThe parts of set-aside reasoning that must always be recomputed and cannot be cached\nbecause it\'s too hard to figure out when the cache needs to be cleared.\nOr perhaps because they\'re really cheap to recompute.")
    public static final SubLObject removal_strategy_chooses_to_set_aside_tactic_uncacheableP_alt(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_tactic_set_asideP(strategy, tactic)) {
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_ALREADY_SET_ASIDE, NIL, tactic, NIL, NIL);
                }
                return T;
            }
            if (NIL == problem_already_consideredP) {
                {
                    SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, problem, NIL, thrown_away_already_consideredP)) {
                        {
                            SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE, NIL, tactic, NIL, subexplanation);
                            }
                        }
                        return T;
                    }
                }
            }
            if ((NIL != inference_worker.logical_tactic_p(tactic)) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP(strategy, tactic))) {
                {
                    SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                    if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                        inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_SET_ASIDE_BECAUSE_LOOKAHEAD_PROBLEM_SET_ASIDE, NIL, tactic, NIL, subexplanation);
                    }
                }
                return T;
            } else {
                if (((NIL == siblings_already_consideredP) && (NIL != inference_worker_split.split_tactic_p(tactic))) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_split_tacticP(strategy, tactic))) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     * The parts of set-aside reasoning that must always be recomputed and cannot be cached
     * because it's too hard to figure out when the cache needs to be cleared.
     * Or perhaps because they're really cheap to recompute.
     */
    @LispMethod(comment = "The parts of set-aside reasoning that must always be recomputed and cannot be cached\r\nbecause it\'s too hard to figure out when the cache needs to be cleared.\r\nOr perhaps because they\'re really cheap to recompute.\nThe parts of set-aside reasoning that must always be recomputed and cannot be cached\nbecause it\'s too hard to figure out when the cache needs to be cleared.\nOr perhaps because they\'re really cheap to recompute.")
    public static SubLObject removal_strategy_chooses_to_set_aside_tactic_uncacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject thrown_away_already_consideredP) {
        return NIL;
    }

    /**
     * The parts of set-aside reasoning that can be cached.
     * The comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.
     */
    @LispMethod(comment = "The parts of set-aside reasoning that can be cached.\r\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.\nThe parts of set-aside reasoning that can be cached.\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.")
    public static final SubLObject removal_strategy_chooses_to_set_aside_tactic_cacheableP_alt(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP, SubLObject thrown_away_already_consideredP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == thrown_away_already_consideredP) && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic))) {
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_tactic(strategy, tactic), NIL, NIL, NIL, NIL);
                }
                return T;
            } else {
                if ((NIL != join_ordered_tactic_p(tactic)) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP(strategy, tactic, UNPROVIDED))) {
                    if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                        inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($JOIN_ORDERED_TACTIC_LEADS_TO_SET_ASIDE_CONJUNCTIVE_REMOVALS, NIL, tactic, NIL, NIL);
                    }
                    return T;
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "The parts of set-aside reasoning that can be cached.\r\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.\nThe parts of set-aside reasoning that can be cached.\nThe comments before each clause in the pcond indicate the conditions when the cache for TACTIC should be cleared.")
    public static SubLObject removal_strategy_chooses_to_set_aside_tactic_cacheableP(final SubLObject strategy, final SubLObject tactic, final SubLObject problem_already_consideredP, final SubLObject siblings_already_consideredP, final SubLObject thrown_away_already_consideredP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != removal_strategy_tactic_set_asideP(strategy, tactic)) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_ALREADY_SET_ASIDE, NIL, tactic, NIL, NIL);
            }
            return T;
        }
        if ((NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) && (NIL != removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP(strategy, tactic, UNPROVIDED))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($JOIN_ORDERED_TACTIC_LEADS_TO_SET_ASIDE_CONJUNCTIVE_REMOVALS, NIL, tactic, NIL, NIL);
            }
            return T;
        }
        if (NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            if (NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, NIL, thrown_away_already_consideredP)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_SET_ASIDE_BECAUSE_PROBLEM_SET_ASIDE, NIL, tactic, NIL, subexplanation);
                }
                return T;
            }
        }
        if ((NIL != inference_worker.logical_tactic_p(tactic)) && (NIL != removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP(strategy, tactic))) {
            final SubLObject subexplanation2 = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($TACTIC_SET_ASIDE_BECAUSE_LOOKAHEAD_PROBLEM_SET_ASIDE, NIL, tactic, NIL, subexplanation2);
            }
            return T;
        }
        if (((NIL == siblings_already_consideredP) && (NIL != inference_worker_split.split_tactic_p(tactic))) && (NIL != removal_strategy_chooses_to_set_aside_split_tacticP(strategy, tactic))) {
            return T;
        }
        if ((NIL == thrown_away_already_consideredP) && (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic))) {
            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation(inference_tactician_strategic_uninterestingness.why_simple_strategy_chooses_to_set_aside_tactic(strategy, tactic), NIL, NIL, NIL, NIL);
            }
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the supported problem of LINK
     * 		might be set aside wrt removal.  If T, the analysis will not be redone.
     */
    @LispMethod(comment = "@param PROBLEM-ALREADY-CONSIDERED?;\r\n\t\twhether the caller has already considered that the supported problem of LINK\r\n\t\tmight be set aside wrt removal.  If T, the analysis will not be redone.")
    public static final SubLObject removal_strategy_chooses_to_set_aside_linkP_alt(SubLObject strategy, SubLObject link, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == problem_already_consideredP) {
                {
                    SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, problem, T, thrown_away_already_consideredP)) {
                        {
                            SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($LINK_SUPPORTED_PROBLEM_SET_ASIDE, NIL, NIL, link, subexplanation);
                            }
                        }
                        return T;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param PROBLEM-ALREADY-CONSIDERED?;
     * 		whether the caller has already considered that the supported problem of LINK
     * 		might be set aside wrt removal.  If T, the analysis will not be redone.
     */
    @LispMethod(comment = "@param PROBLEM-ALREADY-CONSIDERED?;\r\n\t\twhether the caller has already considered that the supported problem of LINK\r\n\t\tmight be set aside wrt removal.  If T, the analysis will not be redone.")
    public static SubLObject removal_strategy_chooses_to_set_aside_linkP(final SubLObject strategy, final SubLObject link, SubLObject problem_already_consideredP, SubLObject thrown_away_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (thrown_away_already_consideredP == UNPROVIDED) {
            thrown_away_already_consideredP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == problem_already_consideredP) {
            final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            if (NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, T, thrown_away_already_consideredP)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($LINK_SUPPORTED_PROBLEM_SET_ASIDE, NIL, NIL, link, subexplanation);
                }
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_chooses_to_ignore_problemP_alt(SubLObject strategy, SubLObject problem) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.why_removal_strategy_chooses_to_ignore_problem(strategy, problem));
    }

    public static SubLObject removal_strategy_chooses_to_ignore_problemP(final SubLObject strategy, final SubLObject problem) {
        return list_utilities.sublisp_boolean(why_removal_strategy_chooses_to_ignore_problem(strategy, problem));
    }

    /**
     *
     *
     * @return strategic-uninterestingness-reason-p
     */
    @LispMethod(comment = "@return strategic-uninterestingness-reason-p")
    public static final SubLObject why_removal_strategy_chooses_to_ignore_problem_alt(SubLObject strategy, SubLObject problem) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED)) {
            return $THROW_AWAY;
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, problem, T, T)) {
                return $SET_ASIDE;
            } else {
                if (NIL == inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
                    return $IRRELEVANT;
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return strategic-uninterestingness-reason-p
     */
    @LispMethod(comment = "@return strategic-uninterestingness-reason-p")
    public static SubLObject why_removal_strategy_chooses_to_ignore_problem(final SubLObject strategy, final SubLObject problem) {
        if (NIL != removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED, UNPROVIDED)) {
            return $THROW_AWAY;
        }
        if (NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, T, T)) {
            return $SET_ASIDE;
        }
        if (NIL == inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            return $IRRELEVANT;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_chooses_to_ignore_strategemP_alt(SubLObject strategy, SubLObject strategem) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.why_removal_strategy_chooses_to_ignore_strategem(strategy, strategem));
    }

    public static SubLObject removal_strategy_chooses_to_ignore_strategemP(final SubLObject strategy, final SubLObject strategem) {
        return list_utilities.sublisp_boolean(why_removal_strategy_chooses_to_ignore_strategem(strategy, strategem));
    }

    /**
     *
     *
     * @return strategic-uninterestingness-reason-p
     */
    @LispMethod(comment = "@return strategic-uninterestingness-reason-p")
    public static final SubLObject why_removal_strategy_chooses_to_ignore_strategem_alt(SubLObject strategy, SubLObject strategem) {
        if (NIL != inference_tactician.strategem_invalid_p(strategem)) {
            return $INVALID;
        } else {
            if ((NIL != inference_worker.content_tactic_p(strategem)) && (NIL != inference_datastructures_tactic.tactic_not_possibleP(strategem))) {
                return $THROW_AWAY;
            } else {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_strategemP(strategy, strategem, UNPROVIDED)) {
                    return $THROW_AWAY;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_strategemP(strategy, strategem, NIL, T)) {
                        return $SET_ASIDE;
                    } else {
                        if (NIL == inference_datastructures_problem.problem_relevant_to_strategyP(inference_tactician.strategem_problem(strategem), strategy)) {
                            return $IRRELEVANT;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return strategic-uninterestingness-reason-p
     */
    @LispMethod(comment = "@return strategic-uninterestingness-reason-p")
    public static SubLObject why_removal_strategy_chooses_to_ignore_strategem(final SubLObject strategy, final SubLObject strategem) {
        if (NIL != inference_tactician.strategem_invalid_p(strategem)) {
            return $INVALID;
        }
        if (((NIL != inference_worker.content_tactic_p(strategem)) || (NIL != inference_worker_join_ordered.join_ordered_tactic_p(strategem))) && (NIL != inference_datastructures_tactic.tactic_not_possibleP(strategem))) {
            return $THROW_AWAY;
        }
        if (NIL != removal_strategy_chooses_to_throw_away_strategemP(strategy, strategem, UNPROVIDED)) {
            return $THROW_AWAY;
        }
        if (NIL != removal_strategy_chooses_to_set_aside_strategemP(strategy, strategem, NIL, T)) {
            return $SET_ASIDE;
        }
        if (NIL == inference_datastructures_problem.problem_relevant_to_strategyP(inference_tactician.strategem_problem(strategem), strategy)) {
            return $IRRELEVANT;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_chooses_to_ignore_tacticP_alt(SubLObject strategy, SubLObject tactic) {
        return com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_ignore_strategemP(strategy, tactic);
    }

    public static SubLObject removal_strategy_chooses_to_ignore_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return removal_strategy_chooses_to_ignore_strategemP(strategy, tactic);
    }

    public static final SubLObject removal_strategy_chooses_to_ignore_linkP_alt(SubLObject strategy, SubLObject link) {
        return com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_ignore_strategemP(strategy, link);
    }

    public static SubLObject removal_strategy_chooses_to_ignore_linkP(final SubLObject strategy, final SubLObject link) {
        return removal_strategy_chooses_to_ignore_strategemP(strategy, link);
    }

    public static final SubLObject removal_strategy_chooses_to_throw_away_all_tacticsP(SubLObject strategy, SubLObject problem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (NIL == problem_already_consideredP) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED)) {
                return T;
            }
        }
        {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, T, UNPROVIDED)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_all_tacticsP(final SubLObject strategy, final SubLObject problem, SubLObject problem_already_consideredP, SubLObject pending_implies_thrown_awayP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (pending_implies_thrown_awayP == UNPROVIDED) {
            pending_implies_thrown_awayP = NIL;
        }
        if ((NIL == problem_already_consideredP) && (NIL != removal_strategy_chooses_to_throw_away_problemP(strategy, problem, NIL, pending_implies_thrown_awayP))) {
            return T;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, T, NIL, pending_implies_thrown_awayP)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject removal_strategy_chooses_to_set_aside_all_tacticsP_alt(SubLObject strategy, SubLObject problem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (NIL == problem_already_consideredP) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, problem, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, T, UNPROVIDED, UNPROVIDED)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject removal_strategy_chooses_to_set_aside_all_tacticsP(final SubLObject strategy, final SubLObject problem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if ((NIL == problem_already_consideredP) && (NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, T, UNPROVIDED, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject removal_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP_alt(SubLObject strategy, SubLObject problem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (NIL == problem_already_consideredP) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, problem, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $REMOVAL_CONJUNCTIVE)) {
                    if (NIL == com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, T, UNPROVIDED, UNPROVIDED)) {
                        return NIL;
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject removal_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP(final SubLObject strategy, final SubLObject problem, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if ((NIL == problem_already_consideredP) && (NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, problem, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $REMOVAL_CONJUNCTIVE)) && (NIL == removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, T, UNPROVIDED, UNPROVIDED))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP_alt(SubLObject strategy, SubLObject jo_tactic, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        {
            SubLObject lookahead_problem = join_ordered_tactic_lookahead_problem(jo_tactic);
            return makeBoolean(((NIL == inference_datastructures_problem.single_literal_problem_p(lookahead_problem)) && (NIL != inference_datastructures_problem.problem_has_tactic_of_typeP(lookahead_problem, $REMOVAL_CONJUNCTIVE))) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP(strategy, lookahead_problem, problem_already_consideredP)));
        }
    }

    public static SubLObject removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP(final SubLObject strategy, final SubLObject jo_tactic, SubLObject problem_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        final SubLObject lookahead_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(jo_tactic);
        return makeBoolean(((NIL == inference_datastructures_problem.single_literal_problem_p(lookahead_problem)) && (NIL != inference_datastructures_problem.problem_has_tactic_of_typeP(lookahead_problem, $REMOVAL_CONJUNCTIVE))) && (NIL != removal_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP(strategy, lookahead_problem, problem_already_consideredP)));
    }

    public static final SubLObject removal_strategy_chooses_to_throw_away_disjunctive_linkP_alt(SubLObject strategy, SubLObject link) {
        {
            SubLObject tactic = inference_worker.disjunctive_link_tactic(link);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_disjunctive_linkP(final SubLObject strategy, final SubLObject link) {
        final SubLObject tactic = inference_worker.disjunctive_link_tactic(link);
        if (NIL != removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_chooses_to_set_aside_disjunctive_linkP_alt(SubLObject strategy, SubLObject link) {
        {
            SubLObject tactic = inference_worker.disjunctive_link_tactic(link);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject removal_strategy_chooses_to_set_aside_disjunctive_linkP(final SubLObject strategy, final SubLObject link) {
        final SubLObject tactic = inference_worker.disjunctive_link_tactic(link);
        if (NIL != removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_chooses_to_throw_away_connected_conjunction_linkP_alt(SubLObject strategy, SubLObject link) {
        {
            SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_connected_conjunction_linkP(final SubLObject strategy, final SubLObject link) {
        final SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
        if (NIL != removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_chooses_to_set_aside_connected_conjunction_linkP_alt(SubLObject strategy, SubLObject link) {
        {
            SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject removal_strategy_chooses_to_set_aside_connected_conjunction_linkP(final SubLObject strategy, final SubLObject link) {
        final SubLObject tactic = inference_worker.connected_conjunction_link_tactic(link);
        if (NIL != removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_chooses_to_totally_throw_away_tacticP_alt(SubLObject strategy, SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (siblings_already_consideredP == UNPROVIDED) {
            siblings_already_consideredP = NIL;
        }
        return inference_datastructures_strategy.controlling_strategy_callback(strategy, $SUBSTRATEGY_TOTALLY_THROW_AWAY_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED);
    }

    public static SubLObject removal_strategy_chooses_to_totally_throw_away_tacticP(final SubLObject strategy, final SubLObject tactic, SubLObject problem_already_consideredP, SubLObject siblings_already_consideredP) {
        if (problem_already_consideredP == UNPROVIDED) {
            problem_already_consideredP = NIL;
        }
        if (siblings_already_consideredP == UNPROVIDED) {
            siblings_already_consideredP = NIL;
        }
        return inference_datastructures_strategy.controlling_strategy_callback(strategy, $SUBSTRATEGY_TOTALLY_THROW_AWAY_TACTIC, tactic, problem_already_consideredP, siblings_already_consideredP, UNPROVIDED);
    }

    public static final SubLObject removal_strategy_chooses_to_totally_ignore_tacticP_alt(SubLObject strategy, SubLObject tactic) {
        return NIL;
    }

    public static SubLObject removal_strategy_chooses_to_totally_ignore_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return NIL;
    }

    /**
     * Return T iff STRATEGY throws away all tactics involving the HL module of TACTIC.
     */
    @LispMethod(comment = "Return T iff STRATEGY throws away all tactics involving the HL module of TACTIC.")
    public static final SubLObject removal_strategy_chooses_to_throw_away_tactic_hl_moduleP_alt(SubLObject strategy, SubLObject tactic) {
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            return T;
        } else {
            return NIL;
        }
    }

    @LispMethod(comment = "Return T iff STRATEGY throws away all tactics involving the HL module of TACTIC.")
    public static SubLObject removal_strategy_chooses_to_throw_away_tactic_hl_moduleP(final SubLObject strategy, final SubLObject tactic) {
        if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_preferred_backchain_required_join_ordered_tactic_alt(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_preferred_backchain_required_join_ordered_tactic_internal(strategy, problem);
                }
                caching_state = memoization_state_lookup(v_memoization_state, REMOVAL_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTIC, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = create_caching_state(memoization_state_lock(v_memoization_state), REMOVAL_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTIC, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state_put(v_memoization_state, REMOVAL_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTIC, caching_state);
                }
                {
                    SubLObject sxhash = sxhash_calc_2(strategy, problem);
                    SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw31$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (strategy == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (problem == cached_args.first())) {
                                            return caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_preferred_backchain_required_join_ordered_tactic_internal(strategy, problem)));
                        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(strategy, problem));
                        return caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject removal_strategy_preferred_backchain_required_join_ordered_tactic(final SubLObject strategy, final SubLObject problem) {
        if (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem.problem_store(problem))) {
            return NIL;
        }
        final SubLObject transformation_strategy = striping_tactician.sibling_transformation_strategy(strategy);
        return transformation_tactician_uninterestingness.transformation_strategy_preferred_backchain_required_join_ordered_tactic(transformation_strategy, problem);
    }

    public static SubLObject removal_strategy_problem_pending_and_not_set_asideP(final SubLObject strategy, final SubLObject problem) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : "! removal_tactician.removal_strategy_p(strategy) " + ("removal_tactician.removal_strategy_p(strategy) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(strategy) ") + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return makeBoolean((NIL != removal_tactician_datastructures.removal_strategy_problem_pendingP(strategy, problem)) && (NIL == removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem)));
    }

    public static final SubLObject removal_strategy_tactic_thrown_awayP_alt(SubLObject strategy, SubLObject tactic) {
        return removal_tactician_datastructures.removal_strategy_strategem_thrown_awayP(strategy, tactic);
    }

    public static SubLObject removal_strategy_tactic_thrown_awayP(final SubLObject strategy, final SubLObject tactic) {
        return removal_tactician_datastructures.removal_strategy_strategem_thrown_awayP(strategy, tactic);
    }

    public static final SubLObject removal_strategy_tactic_set_asideP_alt(SubLObject strategy, SubLObject tactic) {
        return removal_tactician_datastructures.removal_strategy_strategem_set_asideP(strategy, tactic);
    }

    public static SubLObject removal_strategy_tactic_set_asideP(final SubLObject strategy, final SubLObject tactic) {
        return removal_tactician_datastructures.removal_strategy_strategem_set_asideP(strategy, tactic);
    }

    public static final SubLObject removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP_alt(SubLObject strategy, SubLObject logical_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
                thread.resetMultipleValues();
                {
                    SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
                    SubLObject second_problem = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL == first_problem) || (NIL == second_problem)) {
                        return NIL;
                    } else {
                        if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy)) || (NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy))) {
                            return NIL;
                        } else {
                            if ((NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, first_problem)) || (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, second_problem))) {
                                return T;
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
                    if (NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy)) {
                        return NIL;
                    } else {
                        if (NIL != lookahead_problem) {
                            if (NIL != inference_worker_union.union_tactic_p(logical_tactic)) {
                                inference_worker.determine_strategic_status_wrt(lookahead_problem, strategy);
                            }
                            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, lookahead_problem)) {
                                return T;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP(final SubLObject strategy, final SubLObject logical_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
            thread.resetMultipleValues();
            final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
            final SubLObject second_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == first_problem) || (NIL == second_problem)) {
                return NIL;
            }
            if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy)) || (NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy))) {
                return NIL;
            }
            if ((NIL != removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, first_problem)) || (NIL != removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, second_problem))) {
                return T;
            }
        } else {
            final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
            if (NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy)) {
                return NIL;
            }
            if (NIL != lookahead_problem) {
                if (NIL != inference_worker_union.union_tactic_p(logical_tactic)) {
                    inference_worker.determine_strategic_status_wrt(lookahead_problem, strategy);
                }
                if (NIL != removal_strategy_chooses_to_throw_away_lookahead_problemP(strategy, lookahead_problem)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_chooses_to_throw_away_lookahead_problemP_alt(SubLObject strategy, SubLObject lookahead_problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $removal_strategy_uses_already_thrown_away_cacheP$.currentBinding(thread);
                    try {
                        $removal_strategy_uses_already_thrown_away_cacheP$.bind(makeBoolean((NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem)) && (NIL != inference_datastructures_problem.closed_problem_p(lookahead_problem))), thread);
                        v_answer = com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, lookahead_problem, UNPROVIDED);
                    } finally {
                        $removal_strategy_uses_already_thrown_away_cacheP$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_lookahead_problemP(final SubLObject strategy, final SubLObject lookahead_problem) {
        SubLObject v_answer = NIL;
        final SubLObject pending_implies_thrown_awayP = makeBoolean((NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem)) && (NIL != inference_datastructures_problem.closed_problem_p(lookahead_problem)));
        v_answer = removal_strategy_chooses_to_throw_away_problemP(strategy, lookahead_problem, T, pending_implies_thrown_awayP);
        return v_answer;
    }

    public static final SubLObject removal_strategy_chooses_to_throw_away_split_tacticP_alt(SubLObject strategy, SubLObject split_tactic) {
        {
            SubLObject tactic_var = split_tactic;
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic_var));
            SubLObject sibling_tactic = NIL;
            for (sibling_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling_tactic = cdolist_list_var.first()) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $SPLIT)) {
                    if (sibling_tactic != tactic_var) {
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_sibling_split_tacticP(strategy, split_tactic, sibling_tactic)) {
                            return T;
                        }
                        {
                            SubLObject lookahead_problem = inference_worker_split.split_tactic_lookahead_problem(sibling_tactic);
                            return makeBoolean((NIL == inference_worker.good_problem_p(lookahead_problem, strategy)) && (NIL != (NIL != inference_tactician.substrategyP(strategy) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.controlling_strategy_allows_split_tactic_to_be_thrown_awayP(strategy, sibling_tactic))) : inference_worker.finished_problem_p(lookahead_problem, strategy))));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_strategy_chooses_to_throw_away_split_tacticP(final SubLObject strategy, final SubLObject split_tactic) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(split_tactic));
        SubLObject sibling_tactic = NIL;
        sibling_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $SPLIT)) && (!sibling_tactic.eql(split_tactic))) {
                if (NIL != removal_strategy_chooses_to_throw_away_sibling_split_tacticP(strategy, split_tactic, sibling_tactic)) {
                    return T;
                }
                final SubLObject lookahead_problem = inference_worker_split.split_tactic_lookahead_problem(sibling_tactic);
                return makeBoolean((NIL == inference_worker.good_problem_p(lookahead_problem, strategy)) && (NIL != (NIL != inference_tactician.substrategyP(strategy) ? inference_worker.totally_finished_problem_p(lookahead_problem, strategy) : inference_worker.finished_problem_p(lookahead_problem, strategy))));
            } else {
                cdolist_list_var = cdolist_list_var.rest();
                sibling_tactic = cdolist_list_var.first();
            }
        } 
        return NIL;
    }

    public static final SubLObject removal_strategy_chooses_to_throw_away_sibling_split_tacticP_alt(SubLObject strategy, SubLObject split_tactic, SubLObject sibling_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.currentBinding(thread);
                    try {
                        inference_tactician.$set_aside_non_continuable_implies_throw_awayP$.bind(NIL, thread);
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_totally_throw_away_tacticP(strategy, sibling_tactic, T, T)) {
                            {
                                SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($SPLIT_TACTIC_THROWN_AWAY_BECAUSE_SIBLING_TACTIC_THROWN_AWAY, NIL, split_tactic, NIL, subexplanation);
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

    public static SubLObject removal_strategy_chooses_to_throw_away_sibling_split_tacticP(final SubLObject strategy, final SubLObject split_tactic, final SubLObject sibling_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = inference_tactician.$set_aside_non_continuable_implies_throw_away_for_removalP$.currentBinding(thread);
        try {
            inference_tactician.$set_aside_non_continuable_implies_throw_away_for_removalP$.bind(NIL, thread);
            if (NIL != removal_strategy_chooses_to_totally_throw_away_tacticP(strategy, sibling_tactic, T, T)) {
                final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($SPLIT_TACTIC_THROWN_AWAY_BECAUSE_SIBLING_TACTIC_THROWN_AWAY, NIL, split_tactic, NIL, subexplanation);
                }
                result = T;
            }
        } finally {
            inference_tactician.$set_aside_non_continuable_implies_throw_away_for_removalP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject removal_strategy_chooses_not_to_activate_any_strategems_on_problemP_alt(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject resultP = NIL;
                {
                    SubLObject _prev_bind_0 = inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
                    try {
                        inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject strategems_to_activate = removal_tactician_motivation.removal_strategy_categorize_strategems(strategy, problem);
                            SubLObject strategems_to_set_aside = thread.secondMultipleValue();
                            SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            resultP = sublisp_null(strategems_to_activate);
                        }
                    } finally {
                        inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return resultP;
            }
        }
    }

    public static SubLObject removal_strategy_chooses_not_to_activate_any_strategems_on_problemP(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = NIL;
        final SubLObject _prev_bind_0 = inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.currentBinding(thread);
        try {
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject strategems_to_activate = removal_tactician_motivation.removal_strategy_categorize_strategems(strategy, problem);
            final SubLObject strategems_to_set_aside = thread.secondMultipleValue();
            final SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            resultP = sublisp_null(strategems_to_activate);
        } finally {
            inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.rebind(_prev_bind_0, thread);
        }
        return resultP;
    }

    public static final SubLObject removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP_alt(SubLObject strategy, SubLObject logical_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
                thread.resetMultipleValues();
                {
                    SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
                    SubLObject second_problem = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL == first_problem) || (NIL == second_problem)) {
                        return NIL;
                    } else {
                        if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy)) || (NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy))) {
                            return NIL;
                        } else {
                            if ((NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, first_problem, UNPROVIDED, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, second_problem, UNPROVIDED, UNPROVIDED))) {
                                return T;
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
                    if (NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy)) {
                        return NIL;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, lookahead_problem, UNPROVIDED, UNPROVIDED)) {
                            return T;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP(final SubLObject strategy, final SubLObject logical_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
            thread.resetMultipleValues();
            final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
            final SubLObject second_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == first_problem) || (NIL == second_problem)) {
                return NIL;
            }
            if ((NIL != inference_datastructures_strategy.strategically_good_problem_p(first_problem, strategy)) || (NIL != inference_datastructures_strategy.strategically_good_problem_p(second_problem, strategy))) {
                return NIL;
            }
            if ((NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, first_problem, UNPROVIDED, UNPROVIDED)) || (NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, second_problem, UNPROVIDED, UNPROVIDED))) {
                return T;
            }
        } else {
            final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(logical_tactic);
            if (NIL != inference_datastructures_strategy.strategically_good_problem_p(lookahead_problem, strategy)) {
                return NIL;
            }
            if (NIL != removal_strategy_chooses_to_set_aside_problemP(strategy, lookahead_problem, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_chooses_to_set_aside_split_tacticP_alt(SubLObject strategy, SubLObject split_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $removal_strategy_weaken_split_tactic_set_aside_policyP$.getDynamicValue(thread)) {
                {
                    SubLObject tactic_var = split_tactic;
                    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic_var));
                    SubLObject sibling_tactic = NIL;
                    for (sibling_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling_tactic = cdolist_list_var.first()) {
                        if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $SPLIT)) {
                            if (sibling_tactic != tactic_var) {
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_totally_set_aside_tacticP(strategy, sibling_tactic, T, T)) {
                                    {
                                        SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                                        if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                            inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_SET_ASIDE, NIL, split_tactic, NIL, subexplanation);
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
                for (sibling_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling_tactic = cdolist_list_var.first()) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $SPLIT)) {
                        if (sibling_tactic != tactic_var) {
                            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.controlling_strategy_allows_split_tactic_to_be_set_asideP(strategy, sibling_tactic)) {
                                {
                                    SubLObject lookahead_problem = inference_worker_split.split_tactic_lookahead_problem(sibling_tactic);
                                    if ((NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, sibling_tactic, T, T)) || ((NIL != inference_worker.totally_finished_problem_p(lookahead_problem, strategy)) && (NIL == inference_worker.good_problem_p(lookahead_problem, strategy)))) {
                                        {
                                            SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                                            if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                                inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_THROWN_AWAY, NIL, split_tactic, NIL, subexplanation);
                                            }
                                        }
                                        return T;
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_totally_set_aside_tacticP(strategy, sibling_tactic, T, T)) {
                                            {
                                                SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                                                if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                                                    inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_SET_ASIDE, NIL, split_tactic, NIL, subexplanation);
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
            }
            return NIL;
        }
    }

    public static SubLObject removal_strategy_chooses_to_set_aside_split_tacticP(final SubLObject strategy, final SubLObject split_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(split_tactic));
        SubLObject sibling_tactic = NIL;
        sibling_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $SPLIT)) && (!sibling_tactic.eql(split_tactic))) && (NIL != controlling_strategy_allows_split_tactic_to_be_set_asideP(strategy, sibling_tactic))) {
                final SubLObject lookahead_problem = inference_worker_split.split_tactic_lookahead_problem(sibling_tactic);
                if (((NIL != inference_worker.totally_finished_problem_p(lookahead_problem, strategy)) && (NIL == inference_worker.good_problem_p(lookahead_problem, strategy))) || (NIL != removal_strategy_chooses_to_throw_away_tacticP(strategy, sibling_tactic, T, T, UNPROVIDED))) {
                    final SubLObject subexplanation = inference_tactician_strategic_uninterestingness.strategy_last_uninterestingness_explanation();
                    if (NIL != inference_tactician_strategic_uninterestingness.$strategy_gathering_uninterestingness_explanationsP$.getDynamicValue(thread)) {
                        inference_tactician_strategic_uninterestingness.strategy_note_uninterestingness_explanation($SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_THROWN_AWAY, NIL, split_tactic, NIL, subexplanation);
                    }
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling_tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject controlling_strategy_allows_split_tactic_to_be_set_asideP_alt(SubLObject strategy, SubLObject split_tactic) {
        if (NIL != inference_tactician.substrategyP(strategy)) {
            return inference_datastructures_strategy.controlling_strategy_callback(strategy, $SUBSTRATEGY_ALLOW_SPLIT_TACTIC_SET_ASIDE_WRT_REMOVAL, split_tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            return T;
        }
    }

    public static SubLObject controlling_strategy_allows_split_tactic_to_be_set_asideP(final SubLObject strategy, final SubLObject split_tactic) {
        if (NIL != inference_tactician.substrategyP(strategy)) {
            return inference_datastructures_strategy.controlling_strategy_callback(strategy, $SUBSTRATEGY_ALLOW_SPLIT_TACTIC_SET_ASIDE_WRT_REMOVAL, split_tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return T;
    }

    /**
     * STRATEGY should throw away META-REMOVAL-TACTIC if it has a sibling tactic that is tactically possible but disallowed by STRATEGY,
     * because then the intended completeness of META-REMOVAL-TACTIC is inapplicable.
     */
    @LispMethod(comment = "STRATEGY should throw away META-REMOVAL-TACTIC if it has a sibling tactic that is tactically possible but disallowed by STRATEGY,\r\nbecause then the intended completeness of META-REMOVAL-TACTIC is inapplicable.\nSTRATEGY should throw away META-REMOVAL-TACTIC if it has a sibling tactic that is tactically possible but disallowed by STRATEGY,\nbecause then the intended completeness of META-REMOVAL-TACTIC is inapplicable.")
    public static final SubLObject removal_strategy_chooses_to_throw_away_meta_removal_tacticP_alt(SubLObject strategy, SubLObject meta_removal_tactic) {
        if (NIL != inference_worker_removal.meta_removal_tactic_p(meta_removal_tactic)) {
            {
                SubLObject sibling_disallowed_tacticP = NIL;
                SubLObject rest = NIL;
                for (rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(meta_removal_tactic)); !((NIL != sibling_disallowed_tacticP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject removal_tactic = rest.first();
                        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $GENERALIZED_REMOVAL)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $POSSIBLE))) {
                            if (removal_tactic != meta_removal_tactic) {
                                if (NIL == inference_datastructures_inference.inference_allows_use_of_moduleP(inference_datastructures_strategy.strategy_inference(strategy), inference_datastructures_tactic.tactic_hl_module(removal_tactic))) {
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

    @LispMethod(comment = "STRATEGY should throw away META-REMOVAL-TACTIC if it has a sibling tactic that is tactically possible but disallowed by STRATEGY,\r\nbecause then the intended completeness of META-REMOVAL-TACTIC is inapplicable.\nSTRATEGY should throw away META-REMOVAL-TACTIC if it has a sibling tactic that is tactically possible but disallowed by STRATEGY,\nbecause then the intended completeness of META-REMOVAL-TACTIC is inapplicable.")
    public static SubLObject removal_strategy_chooses_to_throw_away_meta_removal_tacticP(final SubLObject strategy, final SubLObject meta_removal_tactic) {
        return inference_chooses_to_throw_away_meta_removal_tacticP(inference_datastructures_strategy.strategy_inference(strategy), meta_removal_tactic);
    }/**
     * STRATEGY should throw away META-REMOVAL-TACTIC if it has a sibling tactic that is tactically possible but disallowed by STRATEGY,
     * because then the intended completeness of META-REMOVAL-TACTIC is inapplicable.
     */


    public static SubLObject inference_chooses_to_throw_away_meta_removal_tacticP(final SubLObject inference, final SubLObject meta_removal_tactic) {
        if (NIL != inference_worker_removal.meta_removal_tactic_p(meta_removal_tactic)) {
            SubLObject sibling_disallowed_tacticP;
            SubLObject rest;
            SubLObject removal_tactic;
            for (sibling_disallowed_tacticP = NIL, rest = NIL, rest = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(meta_removal_tactic)); (NIL == sibling_disallowed_tacticP) && (NIL != rest); rest = rest.rest()) {
                removal_tactic = rest.first();
                if ((((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $GENERALIZED_REMOVAL)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $POSSIBLE))) && (!removal_tactic.eql(meta_removal_tactic))) && (NIL == inference_datastructures_inference.inference_allows_use_of_moduleP(inference, inference_datastructures_tactic.tactic_hl_module(removal_tactic)))) {
                    sibling_disallowed_tacticP = T;
                }
            }
            return sibling_disallowed_tacticP;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_throw_away_uninteresting_set_asides_alt(SubLObject strategy) {
        {
            SubLObject total_thrown_away_count = ZERO_INTEGER;
            SubLObject thrown_away_count = com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_throw_away_uninteresting_set_asides_int(strategy);
            total_thrown_away_count = add(total_thrown_away_count, thrown_away_count);
            while (thrown_away_count.isPositive()) {
                thrown_away_count = com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_throw_away_uninteresting_set_asides_int(strategy);
                total_thrown_away_count = add(total_thrown_away_count, thrown_away_count);
            } 
            return total_thrown_away_count;
        }
    }

    public static SubLObject removal_strategy_throw_away_uninteresting_set_asides(final SubLObject strategy) {
        SubLObject total_thrown_away_count;
        SubLObject thrown_away_count;
        for (total_thrown_away_count = ZERO_INTEGER, thrown_away_count = removal_strategy_throw_away_uninteresting_set_asides_int(strategy), total_thrown_away_count = add(total_thrown_away_count, thrown_away_count); thrown_away_count.isPositive(); thrown_away_count = removal_strategy_throw_away_uninteresting_set_asides_int(strategy) , total_thrown_away_count = add(total_thrown_away_count, thrown_away_count)) {
        }
        return total_thrown_away_count;
    }

    public static final SubLObject removal_strategy_throw_away_uninteresting_set_asides_int_alt(SubLObject strategy) {
        {
            SubLObject set_aside_problems = com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_set_aside_problems_to_reconsider(strategy);
            inference_datastructures_strategy.strategy_clear_set_asides(strategy);
            {
                SubLObject thrown_away_count = ZERO_INTEGER;
                SubLObject cdolist_list_var = set_aside_problems;
                SubLObject set_aside_problem = NIL;
                for (set_aside_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , set_aside_problem = cdolist_list_var.first()) {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_chooses_to_leave_problem_set_asideP(strategy, set_aside_problem)) {
                        inference_tactician.strategy_make_problem_set_aside(strategy, set_aside_problem);
                    } else {
                        thrown_away_count = add(thrown_away_count, ONE_INTEGER);
                    }
                }
                return thrown_away_count;
            }
        }
    }

    public static SubLObject removal_strategy_throw_away_uninteresting_set_asides_int(final SubLObject strategy) {
        final SubLObject set_aside_problems = removal_strategy_set_aside_problems_to_reconsider(strategy);
        inference_datastructures_strategy.strategy_clear_set_asides(strategy);
        SubLObject thrown_away_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = set_aside_problems;
        SubLObject set_aside_problem = NIL;
        set_aside_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != removal_strategy_chooses_to_leave_problem_set_asideP(strategy, set_aside_problem)) {
                inference_tactician.strategy_make_problem_set_aside(strategy, set_aside_problem);
            } else {
                thrown_away_count = add(thrown_away_count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            set_aside_problem = cdolist_list_var.first();
        } 
        return thrown_away_count;
    }

    public static final SubLObject removal_strategy_chooses_to_leave_problem_set_asideP_alt(SubLObject strategy, SubLObject set_aside_problem) {
        return eq($SET_ASIDE, com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.why_removal_strategy_chooses_to_ignore_problem(strategy, set_aside_problem));
    }

    public static SubLObject removal_strategy_chooses_to_leave_problem_set_asideP(final SubLObject strategy, final SubLObject set_aside_problem) {
        return eq($SET_ASIDE, why_removal_strategy_chooses_to_ignore_problem(strategy, set_aside_problem));
    }

    public static final SubLObject removal_strategy_reconsider_set_asides_alt(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            removal_tactician_datastructures.removal_strategy_clear_set_aside_problems(strategy);
            {
                SubLObject reactivated_count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = inference_worker.$reconsidering_set_asidesP$.currentBinding(thread);
                    try {
                        inference_worker.$reconsidering_set_asidesP$.bind(T, thread);
                        {
                            SubLObject set_aside_problems = inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
                            inference_datastructures_strategy.strategy_clear_set_asides(strategy);
                            {
                                SubLObject set_aside_problems_in_order = Sort.sort(set_aside_problems, symbol_function($sym43$_), symbol_function(PROBLEM_SUID));
                                SubLObject cdolist_list_var = set_aside_problems_in_order;
                                SubLObject set_aside_problem = NIL;
                                for (set_aside_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , set_aside_problem = cdolist_list_var.first()) {
                                    if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_uninterestingness.removal_strategy_reconsider_one_set_aside(strategy, set_aside_problem)) {
                                        reactivated_count = add(reactivated_count, ONE_INTEGER);
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

    public static SubLObject removal_strategy_reconsider_set_asides(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        removal_tactician_datastructures.removal_strategy_clear_set_aside_problems(strategy);
        SubLObject reactivated_count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = inference_worker.$reconsidering_set_asidesP$.currentBinding(thread);
        try {
            inference_worker.$reconsidering_set_asidesP$.bind(T, thread);
            final SubLObject set_aside_problems = inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
            inference_datastructures_strategy.strategy_clear_set_asides(strategy);
            SubLObject cdolist_list_var;
            final SubLObject set_aside_problems_in_order = cdolist_list_var = Sort.sort(set_aside_problems, symbol_function($sym41$_), symbol_function(PROBLEM_SUID));
            SubLObject set_aside_problem = NIL;
            set_aside_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != removal_strategy_reconsider_one_set_aside(strategy, set_aside_problem)) {
                    reactivated_count = add(reactivated_count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                set_aside_problem = cdolist_list_var.first();
            } 
        } finally {
            inference_worker.$reconsidering_set_asidesP$.rebind(_prev_bind_0, thread);
        }
        return reactivated_count;
    }

    public static final SubLObject removal_strategy_set_aside_problems_to_reconsider_alt(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
    }

    public static SubLObject removal_strategy_set_aside_problems_to_reconsider(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_all_valid_set_aside_problems(strategy);
    }

    public static final SubLObject removal_strategy_reconsider_one_set_aside_alt(SubLObject strategy, SubLObject problem) {
        inference_tactician.possibly_clear_strategic_status_wrt(problem, strategy);
        return inference_worker.possibly_reactivate_problem(strategy, problem);
    }

    public static SubLObject removal_strategy_reconsider_one_set_aside(final SubLObject strategy, final SubLObject problem) {
        inference_tactician.possibly_clear_strategic_status_wrt(problem, strategy);
        return inference_worker.possibly_reactivate_problem(strategy, problem);
    }

    public static final SubLObject declare_removal_tactician_uninterestingness_file_alt() {
        declareFunction("removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP", "REMOVAL-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-TACTIC?", 1, 0, false);
        declareFunction("removal_strategy_set_aside_non_continuable_implies_throw_away_problemP", "REMOVAL-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-PROBLEM?", 1, 0, false);
        declareFunction("removal_strategy_why_problem_already_thrown_awayP", "REMOVAL-STRATEGY-WHY-PROBLEM-ALREADY-THROWN-AWAY?", 2, 0, false);
        declareFunction("rederive_why_removal_strategy_chooses_to_throw_away_problemP", "REDERIVE-WHY-REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_throw_away_problem_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-UNCACHEABLE?", 3, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_problem_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-CACHEABLE?", 3, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-STRATEGEM?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tactic_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-UNCACHEABLE?", 4, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tactic_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-CACHEABLE?", 4, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-WITH-SIBLING-SIMPLIFICATION-TACTIC?", 1, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-LINK?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_set_aside_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_set_aside_problem_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-UNCACHEABLE?", 4, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_problem_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-CACHEABLE?", 4, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-STRATEGEM?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_set_aside_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 3, false);
        declareFunction("removal_strategy_chooses_to_set_aside_tactic_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-UNCACHEABLE?", 5, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_tactic_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-CACHEABLE?", 5, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-LINK?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_ignore_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 2, 0, false);
        declareFunction("why_removal_strategy_chooses_to_ignore_problem", "WHY-REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_ignore_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM?", 2, 0, false);
        declareFunction("why_removal_strategy_chooses_to_ignore_strategem", "WHY-REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_ignore_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_ignore_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-LINK?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_all_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-ALL-TACTICS?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_set_aside_all_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-TACTICS?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-CONJUNCTIVE-REMOVAL-TACTICS?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-JOIN-ORDERED-TACTIC-DUE-TO-CONJUNCTIVE-REMOVAL?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_throw_away_disjunctive_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-DISJUNCTIVE-LINK?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_disjunctive_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-DISJUNCTIVE-LINK?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_connected_conjunction_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-CONNECTED-CONJUNCTION-LINK?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_connected_conjunction_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-CONNECTED-CONJUNCTION-LINK?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_totally_set_aside_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-SET-ASIDE-TACTIC?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_totally_throw_away_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_totally_ignore_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-IGNORE-TACTIC?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tactic_hl_moduleP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-HL-MODULE?", 2, 0, false);
        declareFunction("removal_strategy_preferred_backchain_required_join_ordered_tactic_internal", "REMOVAL-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC-INTERNAL", 2, 0, false);
        declareFunction("removal_strategy_preferred_backchain_required_join_ordered_tactic", "REMOVAL-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC", 2, 0, false);
        declareFunction("removal_strategy_total_transformation_productivity", "REMOVAL-STRATEGY-TOTAL-TRANSFORMATION-PRODUCTIVITY", 2, 0, false);
        declareFunction("removal_strategy_problem_thrown_awayP", "REMOVAL-STRATEGY-PROBLEM-THROWN-AWAY?", 2, 0, false);
        declareFunction("removal_strategy_tactic_thrown_awayP", "REMOVAL-STRATEGY-TACTIC-THROWN-AWAY?", 2, 0, false);
        declareFunction("removal_strategy_tactic_set_asideP", "REMOVAL-STRATEGY-TACTIC-SET-ASIDE?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-SPLIT-TACTIC?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_sibling_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-SIBLING-SPLIT-TACTIC?", 3, 0, false);
        declareFunction("removal_strategy_chooses_not_to_activate_any_strategems_on_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-ANY-STRATEGEMS-ON-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-SPLIT-TACTIC?", 2, 0, false);
        declareFunction("controlling_strategy_allows_split_tactic_to_be_set_asideP", "CONTROLLING-STRATEGY-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE?", 2, 0, false);
        declareFunction("controlling_strategy_allows_split_tactic_to_be_thrown_awayP", "CONTROLLING-STRATEGY-ALLOWS-SPLIT-TACTIC-TO-BE-THROWN-AWAY?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_meta_removal_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-META-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("removal_strategy_throw_away_uninteresting_set_asides", "REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
        declareFunction("removal_strategy_throw_away_uninteresting_set_asides_int", "REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES-INT", 1, 0, false);
        declareFunction("removal_strategy_chooses_to_leave_problem_set_asideP", "REMOVAL-STRATEGY-CHOOSES-TO-LEAVE-PROBLEM-SET-ASIDE?", 2, 0, false);
        declareFunction("removal_strategy_reconsider_set_asides", "REMOVAL-STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
        declareFunction("removal_strategy_set_aside_problems_to_reconsider", "REMOVAL-STRATEGY-SET-ASIDE-PROBLEMS-TO-RECONSIDER", 1, 0, false);
        declareFunction("removal_strategy_reconsider_one_set_aside", "REMOVAL-STRATEGY-RECONSIDER-ONE-SET-ASIDE", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_removal_tactician_uninterestingness_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP", "REMOVAL-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-TACTIC?", 1, 0, false);
            declareFunction("removal_strategy_set_aside_non_continuable_implies_throw_away_problemP", "REMOVAL-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-PROBLEM?", 1, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 2, false);
            declareFunction("removal_strategy_chooses_to_throw_away_problem_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-UNCACHEABLE?", 4, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_problem_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-CACHEABLE?", 4, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-STRATEGEM?", 2, 1, false);
            declareFunction("removal_strategy_chooses_to_throw_away_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 3, false);
            declareFunction("removal_strategy_chooses_to_throw_away_tactic_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-UNCACHEABLE?", 5, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_tactic_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-CACHEABLE?", 5, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-WITH-SIBLING-SIMPLIFICATION-TACTIC?", 1, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-LINK?", 2, 1, false);
            declareFunction("removal_strategy_chooses_to_set_aside_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 2, false);
            declareFunction("removal_strategy_chooses_to_set_aside_problem_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-UNCACHEABLE?", 4, 0, false);
            declareFunction("removal_strategy_chooses_to_set_aside_problem_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-CACHEABLE?", 4, 0, false);
            declareFunction("removal_strategy_chooses_to_set_aside_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-STRATEGEM?", 2, 2, false);
            declareFunction("removal_strategy_chooses_to_set_aside_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 3, false);
            declareFunction("uninterestingness_cache_condition_as_boolean", "UNINTERESTINGNESS-CACHE-CONDITION-AS-BOOLEAN", 1, 0, false);
            declareFunction("clear_removal_strategy_compute_tactic_uninterestingness_cache_conditions", "CLEAR-REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS", 0, 0, false);
            declareFunction("remove_removal_strategy_compute_tactic_uninterestingness_cache_conditions", "REMOVE-REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS", 4, 0, false);
            declareFunction("removal_strategy_compute_tactic_uninterestingness_cache_conditions_internal", "REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS-INTERNAL", 4, 0, false);
            declareFunction("removal_strategy_compute_tactic_uninterestingness_cache_conditions", "REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS", 4, 0, false);
            declareFunction("clear_removal_strategy_compute_problem_uninterestingness_cache_conditions", "CLEAR-REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS", 0, 0, false);
            declareFunction("remove_removal_strategy_compute_problem_uninterestingness_cache_conditions", "REMOVE-REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS", 3, 0, false);
            declareFunction("removal_strategy_compute_problem_uninterestingness_cache_conditions_internal", "REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS-INTERNAL", 3, 0, false);
            declareFunction("removal_strategy_compute_problem_uninterestingness_cache_conditions", "REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS", 3, 0, false);
            declareFunction("removal_strategy_chooses_to_set_aside_tactic_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-UNCACHEABLE?", 5, 0, false);
            declareFunction("removal_strategy_chooses_to_set_aside_tactic_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-CACHEABLE?", 5, 0, false);
            declareFunction("removal_strategy_chooses_to_set_aside_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-LINK?", 2, 2, false);
            declareFunction("removal_strategy_chooses_to_ignore_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 2, 0, false);
            declareFunction("why_removal_strategy_chooses_to_ignore_problem", "WHY-REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_ignore_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM?", 2, 0, false);
            declareFunction("why_removal_strategy_chooses_to_ignore_strategem", "WHY-REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_ignore_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_ignore_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-LINK?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_all_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-ALL-TACTICS?", 2, 2, false);
            declareFunction("removal_strategy_chooses_to_set_aside_all_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-TACTICS?", 2, 1, false);
            declareFunction("removal_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-CONJUNCTIVE-REMOVAL-TACTICS?", 2, 1, false);
            declareFunction("removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-JOIN-ORDERED-TACTIC-DUE-TO-CONJUNCTIVE-REMOVAL?", 2, 1, false);
            declareFunction("removal_strategy_chooses_to_throw_away_disjunctive_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-DISJUNCTIVE-LINK?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_set_aside_disjunctive_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-DISJUNCTIVE-LINK?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_connected_conjunction_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-CONNECTED-CONJUNCTION-LINK?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_set_aside_connected_conjunction_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-CONNECTED-CONJUNCTION-LINK?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_totally_throw_away_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 2, 2, false);
            declareFunction("removal_strategy_chooses_to_totally_ignore_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-IGNORE-TACTIC?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_tactic_hl_moduleP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-HL-MODULE?", 2, 0, false);
            declareFunction("removal_strategy_preferred_backchain_required_join_ordered_tactic", "REMOVAL-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC", 2, 0, false);
            declareFunction("removal_strategy_problem_pending_and_not_set_asideP", "REMOVAL-STRATEGY-PROBLEM-PENDING-AND-NOT-SET-ASIDE?", 2, 0, false);
            declareFunction("removal_strategy_tactic_thrown_awayP", "REMOVAL-STRATEGY-TACTIC-THROWN-AWAY?", 2, 0, false);
            declareFunction("removal_strategy_tactic_set_asideP", "REMOVAL-STRATEGY-TACTIC-SET-ASIDE?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-LOOKAHEAD-PROBLEM?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-SPLIT-TACTIC?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_sibling_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-SIBLING-SPLIT-TACTIC?", 3, 0, false);
            declareFunction("removal_strategy_chooses_not_to_activate_any_strategems_on_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-ANY-STRATEGEMS-ON-PROBLEM?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_set_aside_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-SPLIT-TACTIC?", 2, 0, false);
            declareFunction("controlling_strategy_allows_split_tactic_to_be_set_asideP", "CONTROLLING-STRATEGY-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_meta_removal_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-META-REMOVAL-TACTIC?", 2, 0, false);
            declareFunction("inference_chooses_to_throw_away_meta_removal_tacticP", "INFERENCE-CHOOSES-TO-THROW-AWAY-META-REMOVAL-TACTIC?", 2, 0, false);
            declareFunction("removal_strategy_throw_away_uninteresting_set_asides", "REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
            declareFunction("removal_strategy_throw_away_uninteresting_set_asides_int", "REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES-INT", 1, 0, false);
            declareFunction("removal_strategy_chooses_to_leave_problem_set_asideP", "REMOVAL-STRATEGY-CHOOSES-TO-LEAVE-PROBLEM-SET-ASIDE?", 2, 0, false);
            declareFunction("removal_strategy_reconsider_set_asides", "REMOVAL-STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
            declareFunction("removal_strategy_set_aside_problems_to_reconsider", "REMOVAL-STRATEGY-SET-ASIDE-PROBLEMS-TO-RECONSIDER", 1, 0, false);
            declareFunction("removal_strategy_reconsider_one_set_aside", "REMOVAL-STRATEGY-RECONSIDER-ONE-SET-ASIDE", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("removal_strategy_why_problem_already_thrown_awayP", "REMOVAL-STRATEGY-WHY-PROBLEM-ALREADY-THROWN-AWAY?", 2, 0, false);
            declareFunction("rederive_why_removal_strategy_chooses_to_throw_away_problemP", "REDERIVE-WHY-REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 1, false);
            declareFunction("removal_strategy_chooses_to_throw_away_problem_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-UNCACHEABLE?", 3, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_problem_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-CACHEABLE?", 3, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 2, false);
            declareFunction("removal_strategy_chooses_to_throw_away_tactic_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-UNCACHEABLE?", 4, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_tactic_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-CACHEABLE?", 4, 0, false);
            declareFunction("removal_strategy_chooses_to_throw_away_all_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-ALL-TACTICS?", 2, 1, false);
            declareFunction("removal_strategy_chooses_to_totally_set_aside_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-SET-ASIDE-TACTIC?", 2, 2, false);
            declareFunction("removal_strategy_preferred_backchain_required_join_ordered_tactic_internal", "REMOVAL-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC-INTERNAL", 2, 0, false);
            declareFunction("removal_strategy_total_transformation_productivity", "REMOVAL-STRATEGY-TOTAL-TRANSFORMATION-PRODUCTIVITY", 2, 0, false);
            declareFunction("removal_strategy_problem_thrown_awayP", "REMOVAL-STRATEGY-PROBLEM-THROWN-AWAY?", 2, 0, false);
            declareFunction("controlling_strategy_allows_split_tactic_to_be_thrown_awayP", "CONTROLLING-STRATEGY-ALLOWS-SPLIT-TACTIC-TO-BE-THROWN-AWAY?", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_removal_tactician_uninterestingness_file_Previous() {
        declareFunction("removal_strategy_set_aside_non_continuable_implies_throw_away_tacticP", "REMOVAL-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-TACTIC?", 1, 0, false);
        declareFunction("removal_strategy_set_aside_non_continuable_implies_throw_away_problemP", "REMOVAL-STRATEGY-SET-ASIDE-NON-CONTINUABLE-IMPLIES-THROW-AWAY-PROBLEM?", 1, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_throw_away_problem_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-UNCACHEABLE?", 4, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_problem_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM-CACHEABLE?", 4, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-STRATEGEM?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?", 2, 3, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tactic_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-UNCACHEABLE?", 5, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tactic_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-CACHEABLE?", 5, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tactic_with_sibling_simplification_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-WITH-SIBLING-SIMPLIFICATION-TACTIC?", 1, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-LINK?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_set_aside_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_set_aside_problem_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-UNCACHEABLE?", 4, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_problem_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM-CACHEABLE?", 4, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-STRATEGEM?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_set_aside_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?", 2, 3, false);
        declareFunction("uninterestingness_cache_condition_as_boolean", "UNINTERESTINGNESS-CACHE-CONDITION-AS-BOOLEAN", 1, 0, false);
        declareFunction("clear_removal_strategy_compute_tactic_uninterestingness_cache_conditions", "CLEAR-REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS", 0, 0, false);
        declareFunction("remove_removal_strategy_compute_tactic_uninterestingness_cache_conditions", "REMOVE-REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS", 4, 0, false);
        declareFunction("removal_strategy_compute_tactic_uninterestingness_cache_conditions_internal", "REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS-INTERNAL", 4, 0, false);
        declareFunction("removal_strategy_compute_tactic_uninterestingness_cache_conditions", "REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS", 4, 0, false);
        declareFunction("clear_removal_strategy_compute_problem_uninterestingness_cache_conditions", "CLEAR-REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS", 0, 0, false);
        declareFunction("remove_removal_strategy_compute_problem_uninterestingness_cache_conditions", "REMOVE-REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS", 3, 0, false);
        declareFunction("removal_strategy_compute_problem_uninterestingness_cache_conditions_internal", "REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS-INTERNAL", 3, 0, false);
        declareFunction("removal_strategy_compute_problem_uninterestingness_cache_conditions", "REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS", 3, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_tactic_uncacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-UNCACHEABLE?", 5, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_tactic_cacheableP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-CACHEABLE?", 5, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-LINK?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_ignore_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM?", 2, 0, false);
        declareFunction("why_removal_strategy_chooses_to_ignore_problem", "WHY-REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-PROBLEM", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_ignore_strategemP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM?", 2, 0, false);
        declareFunction("why_removal_strategy_chooses_to_ignore_strategem", "WHY-REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-STRATEGEM", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_ignore_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-TACTIC?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_ignore_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-IGNORE-LINK?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_all_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-ALL-TACTICS?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_set_aside_all_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-TACTICS?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_set_aside_all_conjunctive_removal_tacticsP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-ALL-CONJUNCTIVE-REMOVAL-TACTICS?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_set_aside_join_ordered_tactic_due_to_conjunctive_removalP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-JOIN-ORDERED-TACTIC-DUE-TO-CONJUNCTIVE-REMOVAL?", 2, 1, false);
        declareFunction("removal_strategy_chooses_to_throw_away_disjunctive_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-DISJUNCTIVE-LINK?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_disjunctive_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-DISJUNCTIVE-LINK?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_connected_conjunction_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-CONNECTED-CONJUNCTION-LINK?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_connected_conjunction_linkP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-CONNECTED-CONJUNCTION-LINK?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_totally_throw_away_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 2, 2, false);
        declareFunction("removal_strategy_chooses_to_totally_ignore_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-TOTALLY-IGNORE-TACTIC?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tactic_hl_moduleP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-HL-MODULE?", 2, 0, false);
        declareFunction("removal_strategy_preferred_backchain_required_join_ordered_tactic", "REMOVAL-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC", 2, 0, false);
        declareFunction("removal_strategy_problem_pending_and_not_set_asideP", "REMOVAL-STRATEGY-PROBLEM-PENDING-AND-NOT-SET-ASIDE?", 2, 0, false);
        declareFunction("removal_strategy_tactic_thrown_awayP", "REMOVAL-STRATEGY-TACTIC-THROWN-AWAY?", 2, 0, false);
        declareFunction("removal_strategy_tactic_set_asideP", "REMOVAL-STRATEGY-TACTIC-SET-ASIDE?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_tactic_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-SPLIT-TACTIC?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_sibling_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-SIBLING-SPLIT-TACTIC?", 3, 0, false);
        declareFunction("removal_strategy_chooses_not_to_activate_any_strategems_on_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-ANY-STRATEGEMS-ON-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_tactic_lookahead_problemP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_set_aside_split_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-SPLIT-TACTIC?", 2, 0, false);
        declareFunction("controlling_strategy_allows_split_tactic_to_be_set_asideP", "CONTROLLING-STRATEGY-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE?", 2, 0, false);
        declareFunction("removal_strategy_chooses_to_throw_away_meta_removal_tacticP", "REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-META-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("inference_chooses_to_throw_away_meta_removal_tacticP", "INFERENCE-CHOOSES-TO-THROW-AWAY-META-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("removal_strategy_throw_away_uninteresting_set_asides", "REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
        declareFunction("removal_strategy_throw_away_uninteresting_set_asides_int", "REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES-INT", 1, 0, false);
        declareFunction("removal_strategy_chooses_to_leave_problem_set_asideP", "REMOVAL-STRATEGY-CHOOSES-TO-LEAVE-PROBLEM-SET-ASIDE?", 2, 0, false);
        declareFunction("removal_strategy_reconsider_set_asides", "REMOVAL-STRATEGY-RECONSIDER-SET-ASIDES", 1, 0, false);
        declareFunction("removal_strategy_set_aside_problems_to_reconsider", "REMOVAL-STRATEGY-SET-ASIDE-PROBLEMS-TO-RECONSIDER", 1, 0, false);
        declareFunction("removal_strategy_reconsider_one_set_aside", "REMOVAL-STRATEGY-RECONSIDER-ONE-SET-ASIDE", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_removal_tactician_uninterestingness_file_alt() {
        defparameter("*REMOVAL-STRATEGY-USES-ALREADY-THROWN-AWAY-CACHE?*", T);
        defparameter("*REMOVAL-STRATEGY-WEAKEN-SPLIT-TACTIC-SET-ASIDE-POLICY?*", NIL);
        return NIL;
    }

    public static SubLObject init_removal_tactician_uninterestingness_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*REMOVAL-STRATEGY-USES-UNINTERESTINGNESS-CACHE?*", T);
            deflexical("*REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS-CACHING-STATE*", NIL);
            deflexical("*REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*REMOVAL-STRATEGY-USES-ALREADY-THROWN-AWAY-CACHE?*", T);
            defparameter("*REMOVAL-STRATEGY-WEAKEN-SPLIT-TACTIC-SET-ASIDE-POLICY?*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_removal_tactician_uninterestingness_file_Previous() {
        defparameter("*REMOVAL-STRATEGY-USES-UNINTERESTINGNESS-CACHE?*", T);
        deflexical("*REMOVAL-STRATEGY-COMPUTE-TACTIC-UNINTERESTINGNESS-CACHE-CONDITIONS-CACHING-STATE*", NIL);
        deflexical("*REMOVAL-STRATEGY-COMPUTE-PROBLEM-UNINTERESTINGNESS-CACHE-CONDITIONS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_removal_tactician_uninterestingness_file_alt() {
        note_memoized_function(REMOVAL_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTIC);
        return NIL;
    }

    public static SubLObject setup_removal_tactician_uninterestingness_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function($sym18$REMOVAL_STRATEGY_COMPUTE_TACTIC_UNINTERESTINGNESS_CACHE_CONDITION);
            memoization_state.note_globally_cached_function($sym20$REMOVAL_STRATEGY_COMPUTE_PROBLEM_UNINTERESTINGNESS_CACHE_CONDITIO);
        }
        if (SubLFiles.USE_V2) {
            note_memoized_function(REMOVAL_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTIC);
        }
        return NIL;
    }

    public static SubLObject setup_removal_tactician_uninterestingness_file_Previous() {
        memoization_state.note_globally_cached_function($sym18$REMOVAL_STRATEGY_COMPUTE_TACTIC_UNINTERESTINGNESS_CACHE_CONDITION);
        memoization_state.note_globally_cached_function($sym20$REMOVAL_STRATEGY_COMPUTE_PROBLEM_UNINTERESTINGNESS_CACHE_CONDITIO);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_tactician_uninterestingness_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_tactician_uninterestingness_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_tactician_uninterestingness_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol $PROBLEM_HAS_NO_ACTIVATIBLE_REMOVAL_STRATEGEMS = makeKeyword("PROBLEM-HAS-NO-ACTIVATIBLE-REMOVAL-STRATEGEMS");

    private static final SubLSymbol $PROBLEM_ALREADY_THROWN_AWAY = makeKeyword("PROBLEM-ALREADY-THROWN-AWAY");

    private static final SubLSymbol REMOVAL_STRATEGY_PREFERRED_BACKCHAIN_REQUIRED_JOIN_ORDERED_TACTIC = makeSymbol("REMOVAL-STRATEGY-PREFERRED-BACKCHAIN-REQUIRED-JOIN-ORDERED-TACTIC");

    public static final SubLSymbol $kw31$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt32 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"));

    private static final SubLSymbol $SPLIT_TACTIC_SET_ASIDE_BECAUSE_SIBLING_TACTIC_SET_ASIDE = makeKeyword("SPLIT-TACTIC-SET-ASIDE-BECAUSE-SIBLING-TACTIC-SET-ASIDE");

    private static final SubLSymbol $SUBSTRATEGY_ALLOW_SPLIT_TACTIC_THROWN_AWAY_WRT_REMOVAL = makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-THROWN-AWAY-WRT-REMOVAL");

    static private final SubLSymbol $sym43$_ = makeSymbol("<");
}

/**
 * Total time: 288 ms
 */
