/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-LOOKAHEAD-PRODUCTIVITY
 * source file: /cyc/top/cycl/inference/harness/inference-lookahead-productivity.lisp
 * created:     2019/07/03 17:37:40
 */
public final class inference_lookahead_productivity extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final SubLObject memoized_problem_max_removal_productivity_internal(SubLObject problem, SubLObject strategic_context) {
        return com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity.problem_max_removal_productivity(problem, strategic_context);
    }

    public static final SubLFile me = new inference_lookahead_productivity();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity";


    private static final SubLSymbol MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT = makeSymbol("MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY-INT");

    private static final SubLSymbol $sym1$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str3$Unexpected_removal_relevant_tacti = makeString("Unexpected removal-relevant tactic ~S");

    private static final SubLSymbol $RELEVANT_TACTICS_WRT_REMOVAL = makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL");

    public static final SubLObject memoized_problem_max_removal_productivity_alt(SubLObject problem, SubLObject strategic_context) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity.memoized_problem_max_removal_productivity_internal(problem, strategic_context);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(problem, strategic_context);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (problem == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (strategic_context == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity.memoized_problem_max_removal_productivity_internal(problem, strategic_context)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(problem, strategic_context));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject memoized_problem_max_removal_productivity(final SubLObject problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max_productivity = NIL;
        SubLObject max_justification = NIL;
        final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                thread.resetMultipleValues();
                final SubLObject max_productivity_$1 = memoized_problem_max_removal_productivity_int(problem, strategic_context);
                final SubLObject max_justification_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                max_productivity = max_productivity_$1;
                max_justification = max_justification_$2;
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(max_productivity, max_justification);
    }

    public static SubLObject memoized_problem_max_removal_productivity_int_internal(final SubLObject problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem.problem_store(problem));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return problem_max_removal_productivity(problem, strategic_context);
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject memoized_problem_max_removal_productivity_int(final SubLObject problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_problem_max_removal_productivity_int_internal(problem, strategic_context);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(problem, strategic_context);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (problem.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && strategic_context.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_problem_max_removal_productivity_int_internal(problem, strategic_context)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, strategic_context));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject problem_max_removal_productivity_alt(SubLObject problem, SubLObject strategic_context) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != balancing_tactician.balancing_tactician_p(strategic_context)) {
                strategic_context = balancing_tactician.balancing_tactician_sole_removal_substrategy(strategic_context);
            }
            {
                SubLObject existing_proof_count = inference_datastructures_problem.problem_proof_count(problem, UNPROVIDED);
                SubLObject productivity_from_existing_proofs = inference_datastructures_enumerated_types.productivity_for_number_of_children(existing_proof_count);
                SubLObject max_productivity = productivity_from_existing_proofs;
                SubLObject max_justification = problem;
                SubLObject tactics = com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity.problem_relevant_tactics_wrt_removal(problem, strategic_context);
                SubLObject cdolist_list_var = tactics;
                SubLObject tactic = NIL;
                for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject max_lookahead_productivity = com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity.tactic_max_removal_productivity(tactic, strategic_context);
                        SubLObject max_lookahead_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != inference_datastructures_enumerated_types.productivity_G(max_lookahead_productivity, max_productivity)) {
                            max_productivity = max_lookahead_productivity;
                            max_justification = max_lookahead_justification;
                        }
                    }
                }
                return values(max_productivity, max_justification);
            }
        }
    }

    public static SubLObject problem_max_removal_productivity(final SubLObject problem, SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != striping_tactician.striping_tactician_p(strategic_context)) {
            final SubLObject r_strat = striping_tactician.striping_tactician_arbitrary_relevant_removal_substrategy(strategic_context, problem);
            if (NIL != r_strat) {
                strategic_context = r_strat;
            } else {
                strategic_context = $TACTICAL;
            }
        }
        if (NIL != balancing_tactician.balancing_tactician_p(strategic_context)) {
            strategic_context = balancing_tactician.balancing_tactician_sole_removal_substrategy(strategic_context);
        }
        final SubLObject existing_proof_count = inference_datastructures_problem.problem_proof_count(problem, UNPROVIDED);
        SubLObject max_productivity;
        final SubLObject productivity_from_existing_proofs = max_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(existing_proof_count);
        SubLObject max_justification = problem;
        SubLObject cdolist_list_var;
        final SubLObject tactics = cdolist_list_var = problem_relevant_tactics_wrt_removal(problem, strategic_context);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject max_lookahead_productivity = tactic_max_removal_productivity(tactic, strategic_context);
            final SubLObject max_lookahead_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != inference_datastructures_enumerated_types.productivity_G(max_lookahead_productivity, max_productivity)) {
                max_productivity = max_lookahead_productivity;
                max_justification = max_lookahead_justification;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return subl_promotions.values2(max_productivity, max_justification);
    }

    public static final SubLObject tactic_max_removal_productivity_alt(SubLObject tactic, SubLObject strategic_context) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != inference_worker_removal.generalized_removal_tactic_p(tactic)) || (NIL != inference_worker_rewrite.rewrite_tactic_p(tactic))) {
                return values(inference_datastructures_tactic.tactic_original_productivity(tactic), tactic);
            } else {
                if (NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic)) {
                    {
                        SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
                        return com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity.problem_max_removal_productivity(lookahead_problem, strategic_context);
                    }
                } else {
                    if (NIL != inference_worker_join.join_tactic_p(tactic)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(tactic);
                            SubLObject second_problem = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            thread.resetMultipleValues();
                            {
                                SubLObject first_productivity = com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity.problem_max_removal_productivity(first_problem, strategic_context);
                                SubLObject first_justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                thread.resetMultipleValues();
                                {
                                    SubLObject second_productivity = com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity.problem_max_removal_productivity(second_problem, strategic_context);
                                    SubLObject second_justification = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != inference_datastructures_enumerated_types.productivity_G(second_productivity, first_productivity)) {
                                        return values(second_productivity, second_justification);
                                    } else {
                                        return values(first_productivity, first_justification);
                                    }
                                }
                            }
                        }
                    } else {
                        if (NIL != inference_worker_split.meta_split_tactic_p(tactic)) {
                            return values(ZERO_INTEGER, tactic);
                        } else {
                            return Errors.error($str_alt2$Unexpected_removal_relevant_tacti, tactic);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject tactic_max_removal_productivity(final SubLObject tactic, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != inference_worker_removal.generalized_removal_tactic_p(tactic)) || (NIL != inference_worker_rewrite.rewrite_tactic_p(tactic))) {
            return subl_promotions.values2(inference_datastructures_tactic.tactic_original_productivity(tactic), tactic);
        }
        if (NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic)) {
            final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
            return memoized_problem_max_removal_productivity(lookahead_problem, strategic_context);
        }
        if (NIL != inference_worker_join.join_tactic_p(tactic)) {
            thread.resetMultipleValues();
            final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(tactic);
            final SubLObject second_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject first_productivity = memoized_problem_max_removal_productivity(first_problem, strategic_context);
            final SubLObject first_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject second_productivity = memoized_problem_max_removal_productivity(second_problem, strategic_context);
            final SubLObject second_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != inference_datastructures_enumerated_types.productivity_G(second_productivity, first_productivity)) {
                return subl_promotions.values2(second_productivity, second_justification);
            }
            return subl_promotions.values2(first_productivity, first_justification);
        } else {
            if (NIL != inference_worker_split.meta_split_tactic_p(tactic)) {
                return subl_promotions.values2(ZERO_INTEGER, tactic);
            }
            return Errors.error($str3$Unexpected_removal_relevant_tacti, tactic);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY = makeSymbol("MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY");

    public static final SubLSymbol $kw1$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt2$Unexpected_removal_relevant_tacti = makeString("Unexpected removal-relevant tactic ~S");

    public static final SubLObject problem_relevant_tactics_wrt_removal_alt(SubLObject problem, SubLObject strategic_context) {
        inference_worker.determine_strategic_status_wrt(problem, strategic_context);
        if ($TACTICAL == strategic_context) {
            return com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity.problem_tactically_relevant_tactics_wrt_removal(problem);
        } else {
            return com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity.strategy_relevant_tactics_wrt_removal(strategic_context, problem);
        }
    }

    public static SubLObject problem_relevant_tactics_wrt_removal(final SubLObject problem, final SubLObject strategic_context) {
        inference_worker.determine_strategic_status_wrt(problem, strategic_context);
        if ($TACTICAL == strategic_context) {
            return problem_tactically_relevant_tactics_wrt_removal(problem);
        }
        return strategy_relevant_tactics_wrt_removal(strategic_context, problem);
    }

    public static final SubLObject strategy_relevant_tactics_wrt_removal_alt(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $RELEVANT_TACTICS_WRT_REMOVAL, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject strategy_relevant_tactics_wrt_removal(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $RELEVANT_TACTICS_WRT_REMOVAL, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject problem_tactically_relevant_tactics_wrt_removal_alt(SubLObject problem) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $REMOVAL)) {
                    result = cons(tactic, result);
                }
            }
            return result;
        }
    }

    public static SubLObject problem_tactically_relevant_tactics_wrt_removal(final SubLObject problem) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $REMOVAL)) {
                result = cons(tactic, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject declare_inference_lookahead_productivity_file_alt() {
        declareFunction("memoized_problem_max_removal_productivity_internal", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY-INTERNAL", 2, 0, false);
        declareFunction("memoized_problem_max_removal_productivity", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
        declareFunction("problem_max_removal_productivity", "PROBLEM-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
        declareFunction("tactic_max_removal_productivity", "TACTIC-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
        declareFunction("problem_relevant_tactics_wrt_removal", "PROBLEM-RELEVANT-TACTICS-WRT-REMOVAL", 2, 0, false);
        declareFunction("strategy_relevant_tactics_wrt_removal", "STRATEGY-RELEVANT-TACTICS-WRT-REMOVAL", 2, 0, false);
        declareFunction("problem_tactically_relevant_tactics_wrt_removal", "PROBLEM-TACTICALLY-RELEVANT-TACTICS-WRT-REMOVAL", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_lookahead_productivity_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("memoized_problem_max_removal_productivity", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
            declareFunction("memoized_problem_max_removal_productivity_int_internal", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY-INT-INTERNAL", 2, 0, false);
            declareFunction("memoized_problem_max_removal_productivity_int", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY-INT", 2, 0, false);
            declareFunction("problem_max_removal_productivity", "PROBLEM-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
            declareFunction("tactic_max_removal_productivity", "TACTIC-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
            declareFunction("problem_relevant_tactics_wrt_removal", "PROBLEM-RELEVANT-TACTICS-WRT-REMOVAL", 2, 0, false);
            declareFunction("strategy_relevant_tactics_wrt_removal", "STRATEGY-RELEVANT-TACTICS-WRT-REMOVAL", 2, 0, false);
            declareFunction("problem_tactically_relevant_tactics_wrt_removal", "PROBLEM-TACTICALLY-RELEVANT-TACTICS-WRT-REMOVAL", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("memoized_problem_max_removal_productivity_internal", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY-INTERNAL", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_lookahead_productivity_file_Previous() {
        declareFunction("memoized_problem_max_removal_productivity", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
        declareFunction("memoized_problem_max_removal_productivity_int_internal", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY-INT-INTERNAL", 2, 0, false);
        declareFunction("memoized_problem_max_removal_productivity_int", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY-INT", 2, 0, false);
        declareFunction("problem_max_removal_productivity", "PROBLEM-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
        declareFunction("tactic_max_removal_productivity", "TACTIC-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
        declareFunction("problem_relevant_tactics_wrt_removal", "PROBLEM-RELEVANT-TACTICS-WRT-REMOVAL", 2, 0, false);
        declareFunction("strategy_relevant_tactics_wrt_removal", "STRATEGY-RELEVANT-TACTICS-WRT-REMOVAL", 2, 0, false);
        declareFunction("problem_tactically_relevant_tactics_wrt_removal", "PROBLEM-TACTICALLY-RELEVANT-TACTICS-WRT-REMOVAL", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_lookahead_productivity_file() {
        return NIL;
    }

    public static final SubLObject setup_inference_lookahead_productivity_file_alt() {
        memoization_state.note_memoized_function(MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY);
        return NIL;
    }

    public static SubLObject setup_inference_lookahead_productivity_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function(MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function(MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY);
        }
        return NIL;
    }

    public static SubLObject setup_inference_lookahead_productivity_file_Previous() {
        memoization_state.note_memoized_function(MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_lookahead_productivity_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_lookahead_productivity_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_lookahead_productivity_file();
    }

    
}

/**
 * Total time: 104 ms
 */
