package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_tactician_utilities extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities";
    public static String myFingerPrint = "0a1f0874d3cfd9f14ac398e3295fbce90a0eebb03a2b3285ec8e264e6cdcdbdf";
    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 6500L)
    private static SubLSymbol $set_aside_implies_disallowedP$;
    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 7500L)
    private static SubLSymbol $preference_scaling_values$;
    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 9300L)
    private static SubLSymbol $literal_count_scaling_enabledP$;
    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 13000L)
    private static SubLSymbol $magic_wand_max_preference_level$;
    private static SubLSymbol $sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT;
    private static SubLSymbol $sym1$_EXIT;
    private static SubLSymbol $sym2$STRATEGIC_CONTEXT_P;
    private static SubLSymbol $GROSSLY_DISPREFERRED;
    private static SubLString $str4$removal_is_not_allowed_in_the_pro;
    private static SubLSymbol $PREFERRED;
    private static SubLString $str6$problem_is_closed;
    private static SubLString $str7$no_variables_have_any_hope_of_get;
    private static SubLSymbol $DOOMED;
    private static SubLSymbol $DISALLOWED;
    private static SubLString $str10$CHECK_SENTENCE_SIBLING;
    private static SubLString $str11$problem_has_no_removal_allowed_or;
    private static SubLString $str12$single_negative_literal;
    private static SubLString $str13$problem_has_a_complete_non_thrown;
    private static SubLString $str14$problem_has_executed_a_complete_r;
    private static SubLSymbol $TACTICAL;
    private static SubLSymbol $NEG;
    private static SubLString $str17$unknown;
    private static SubLSymbol $sym18$TRANSFORMATION_TACTIC_P;
    private static SubLString $str19$Unexpected_strategy_type__s;
    private static SubLSymbol $GENERALIZED_REMOVAL;
    private static SubLSymbol $REMOVAL;
    private static SubLList $list22;
    private static SubLList $list23;
    private static SubLSymbol $DISPREFERRED;
    private static SubLSymbol $LOGICAL;
    private static SubLSymbol $sym26$INFERENCE_P;
    private static SubLSymbol $sym27$_;
    private static SubLSymbol $sym28$PROBLEM_SUID;
    private static SubLSymbol $sym29$STRATEGEM__;

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 800L)
    public static SubLObject memoized_problem_global_preference_level(SubLObject problem, SubLObject strategic_context, SubLObject shared_variables) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preference_level = NIL;
        SubLObject justification = NIL;
        SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                thread.resetMultipleValues();
                SubLObject preference_level_$1 = memoized_problem_global_preference_level_int(problem, strategic_context, shared_variables);
                SubLObject justification_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                preference_level = preference_level_$1;
                justification = justification_$2;
            } finally {
                SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(preference_level, justification);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 1300L)
    public static SubLObject memoized_problem_global_preference_level_int_internal(SubLObject problem, SubLObject strategic_context, SubLObject shared_variables) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem.problem_store(problem));
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return problem_global_preference_level(problem, strategic_context, shared_variables);
            } finally {
                SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 1300L)
    public static SubLObject memoized_problem_global_preference_level_int(SubLObject problem, SubLObject strategic_context, SubLObject shared_variables) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_problem_global_preference_level_int_internal(problem, strategic_context, shared_variables);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_3(problem, strategic_context, shared_variables);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (problem.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (strategic_context.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (NIL != cached_args && NIL == cached_args.rest() && shared_variables.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_problem_global_preference_level_int_internal(problem, strategic_context, shared_variables)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, strategic_context, shared_variables));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 1600L)
    public static SubLObject problem_global_preference_level(SubLObject problem, SubLObject strategic_context, SubLObject shared_variables) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        SubLObject preference_level = NIL;
        SubLObject justification = NIL;
        if (NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            preference_level = $GROSSLY_DISPREFERRED;
            justification = $str4$removal_is_not_allowed_in_the_pro;
        } else if (NIL != inference_datastructures_problem.closed_problem_p(problem)) {
            preference_level = $PREFERRED;
            justification = $str6$problem_is_closed;
        } else if (NIL == shared_variables) {
            preference_level = $PREFERRED;
            justification = $str7$no_variables_have_any_hope_of_get;
        } else {
            inference_worker.determine_strategic_status_wrt(problem, strategic_context);
            thread.resetMultipleValues();
            SubLObject preference_level_$5 = problem_global_preference_level_wrt_modules(problem, strategic_context, shared_variables);
            SubLObject justification_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            preference_level = preference_level_$5;
            justification = justification_$6;
            if ($DOOMED != preference_level) {
                if ($DISALLOWED != preference_level || !justification.equal($str10$CHECK_SENTENCE_SIBLING)) {
                    if (NIL != problem_has_no_allowed_or_executed_tactics_wrt_removalP(problem, strategic_context)) {
                        preference_level = $DISALLOWED;
                        justification = $str11$problem_has_no_removal_allowed_or;
                    } else if (NIL != single_negative_literal_problem_p(problem)) {
                        preference_level = (NIL != shared_variables) ? $DISALLOWED : $GROSSLY_DISPREFERRED;
                        justification = $str12$single_negative_literal;
                    } else if (NIL != problem_has_some_complete_non_thrown_away_removal_tacticP(problem, strategic_context)) {
                        preference_level = $PREFERRED;
                        justification = $str13$problem_has_a_complete_non_thrown;
                    } else if (NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, strategic_context)) {
                        preference_level = $PREFERRED;
                        justification = $str14$problem_has_executed_a_complete_r;
                    }
                }
            }
        }
        return subl_promotions.values2(preference_level, justification);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 4000L)
    public static SubLObject problem_global_preference_level_wrt_modules(SubLObject problem, SubLObject strategic_context, SubLObject shared_variables) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preference_level = NIL;
        SubLObject justification = NIL;
        if (NIL != inference_datastructures_problem.multi_literal_problem_p(problem)) {
            thread.resetMultipleValues();
            SubLObject preference_level_$7 = multi_literal_problem_global_preference_level(problem, $TACTICAL);
            SubLObject justification_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            preference_level = preference_level_$7;
            justification = justification_$8;
        } else {
            if (NIL != inference_datastructures_problem.multi_clause_problem_p(problem)) {
                return inference_worker_union.$union_tactic_preference_level$.getGlobalValue();
            }
            thread.resetMultipleValues();
            SubLObject preference_level_$8 = preference_modules.single_literal_problem_preference_level_wrt_modules(problem, strategic_context, shared_variables);
            SubLObject justification_$9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            preference_level = preference_level_$8;
            justification = justification_$9;
        }
        return subl_promotions.values2(preference_level, justification);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 4700L)
    public static SubLObject single_negative_literal_problem_p(SubLObject problem) {
        return makeBoolean(NIL != inference_datastructures_problem.single_literal_problem_p(problem) && $NEG == inference_datastructures_problem.single_literal_problem_sense(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 4900L)
    public static SubLObject multi_literal_problem_global_preference_level(SubLObject problem, SubLObject strategic_context) {
        SubLObject max_preference_level = $DISALLOWED;
        SubLObject reason = $str17$unknown;
        SubLObject cdolist_list_var;
        SubLObject tactics = cdolist_list_var = multi_literal_problem_tactics_to_activate(problem, strategic_context);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject preference_level = inference_datastructures_strategy.conjunctive_tactic_strategic_preference_level(tactic, strategic_context);
            if (NIL != preference_level && NIL != preference_modules.preference_level_G(preference_level, max_preference_level)) {
                max_preference_level = preference_level;
                reason = inference_datastructures_strategy.conjunctive_tactic_strategic_preference_level_justification(tactic, strategic_context);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return subl_promotions.values2(max_preference_level, reason);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 5700L)
    public static SubLObject multi_literal_problem_tactics_to_activate(SubLObject problem, SubLObject strategic_context) {
        if ($TACTICAL == strategic_context) {
            return Sequences.remove_if(Symbols.symbol_function($sym18$TRANSFORMATION_TACTIC_P), inference_datastructures_problem.problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return Errors.error($str19$Unexpected_strategy_type__s, strategic_context);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 6000L)
    public static SubLObject problem_has_some_complete_non_thrown_away_removal_tacticP(SubLObject problem, SubLObject strategic_context) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $GENERALIZED_REMOVAL) && NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context)
                    && (NIL == inference_datastructures_strategy.strategy_p(strategic_context) || NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, $REMOVAL))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 6600L)
    public static SubLObject problem_has_no_allowed_or_executed_tactics_wrt_removalP(SubLObject problem, SubLObject strategic_context) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_datastructures_strategy.strategy_p(strategic_context) || NIL == inference_datastructures_tactic.tactic_possibleP(tactic)
                    || NIL == ((NIL != $set_aside_implies_disallowedP$.getDynamicValue(thread)) ? inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_ignore_tacticP(strategic_context, tactic, $REMOVAL)
                            : inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, $REMOVAL))) {
                if (NIL != inference_datastructures_tactic.tactic_executedP(tactic)) {
                    return NIL;
                }
                if (NIL != inference_worker.content_tactic_p(tactic)) {
                    if (NIL == inference_tactician_strategic_uninterestingness.tactic_impossibleP(tactic, strategic_context)) {
                        return NIL;
                    }
                } else if (NIL == inference_tactician_strategic_uninterestingness.tactic_disallowed_or_doomedP(tactic, strategic_context)) {
                    return NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return T;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 8100L)
    public static SubLObject removal_unhappiness(SubLObject productivity, SubLObject module_spec, SubLObject preference_level, SubLObject literal_count) {
        SubLObject unhappiness = scale_unhappiness(productivity, module_scaling_factor(module_spec));
        unhappiness = scale_unhappiness(unhappiness, preference_scaling_factor(preference_level));
        unhappiness = scale_unhappiness(unhappiness, literal_count_scaling_factor(literal_count));
        return unhappiness;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 8600L)
    public static SubLObject scale_unhappiness(SubLObject unhappiness, SubLObject scaling_factor) {
        return number_utilities.potentially_infinite_integer_times_number_rounded(unhappiness, scaling_factor);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 8700L)
    public static SubLObject module_scaling_factor(SubLObject module_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sf_data = list_utilities.alist_lookup_without_values($preference_scaling_values$.getDynamicValue(thread), module_spec, UNPROVIDED, UNPROVIDED);
        if (NIL != sf_data) {
            SubLObject current;
            SubLObject datum = current = sf_data;
            SubLObject m = NIL;
            SubLObject b = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
            m = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
            b = current.first();
            current = current.rest();
            if (NIL == current) {
                return m;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, $list23);
        }
        return ONE_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 9000L)
    public static SubLObject preference_scaling_factor(SubLObject preference_level) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sf_data = list_utilities.alist_lookup_without_values($preference_scaling_values$.getDynamicValue(thread), preference_level, UNPROVIDED, UNPROVIDED);
        if (NIL != sf_data) {
            SubLObject current;
            SubLObject datum = current = sf_data;
            SubLObject m = NIL;
            SubLObject b = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
            m = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
            b = current.first();
            current = current.rest();
            if (NIL == current) {
                return m;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, $list23);
        }
        return ONE_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 9600L)
    public static SubLObject literal_count_scaling_factor(SubLObject literal_count) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $literal_count_scaling_enabledP$.getDynamicValue(thread) && literal_count.numG(ONE_INTEGER)) {
            return Numbers.invert(literal_count);
        }
        return ONE_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 9800L)
    public static SubLObject strategy_deems_conjunctive_tactic_spec_betterP(SubLObject candidate_tactic_productivity, SubLObject candidate_tactic_preference, SubLObject candidate_tactic_module_spec, SubLObject candidate_tactic_literal_count, SubLObject committed_tactic_productivity,
            SubLObject committed_tactic_preference, SubLObject committed_tactic_module_spec, SubLObject committed_tactic_literal_count) {
        if (NIL != preference_modules.disallowed_or_doomed_preference_level_p(candidate_tactic_preference)) {
            return NIL;
        }
        if (NIL != preference_modules.disallowed_or_doomed_preference_level_p(committed_tactic_preference)) {
            return T;
        }
        SubLObject candidate_unhappiness = removal_unhappiness(candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literal_count);
        SubLObject committed_unhappiness = removal_unhappiness(committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literal_count);
        return number_utilities.potentially_infinite_integer_L(candidate_unhappiness, committed_unhappiness);
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 11000L)
    public static SubLObject magic_wand_tacticP(SubLObject tactic, SubLObject strategic_context) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != abductive_tactician.abductive_strategy_p(strategic_context) && NIL != abductive_magic_wand_tacticP(tactic, strategic_context)) {
            return T;
        }
        if (NIL != inference_worker.logical_tactic_p(tactic)) {
            if (NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic)) {
                if (ZERO_INTEGER.eql(inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context))) {
                    SubLObject tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
                    if (NIL != under_magic_wand_max_preference_levelP(tactic_preference_level) && NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context)) {
                        return T;
                    }
                }
            } else if (NIL != inference_worker_join.join_tactic_p(tactic) && NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context)) {
                thread.resetMultipleValues();
                SubLObject first_mapped_problem = inference_worker_join.find_or_create_join_tactic_supporting_mapped_problems(tactic);
                SubLObject second_mapped_problem = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
                SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
                SubLObject first_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(first_problem, strategic_context);
                SubLObject second_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(second_problem, strategic_context);
                SubLObject first_problem_shared_vars = inference_worker_join.first_problem_shared_vars(first_mapped_problem, second_mapped_problem);
                SubLObject second_problem_shared_vars = inference_worker_join.second_problem_shared_vars(first_mapped_problem, second_mapped_problem);
                if ((ZERO_INTEGER.eql(first_productivity) && NIL != under_magic_wand_max_preference_levelP(memoized_problem_global_preference_level(first_problem, strategic_context, first_problem_shared_vars)))
                        || (ZERO_INTEGER.eql(second_productivity) && NIL != under_magic_wand_max_preference_levelP(memoized_problem_global_preference_level(second_problem, strategic_context, second_problem_shared_vars)))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 13200L)
    public static SubLObject under_magic_wand_max_preference_levelP(SubLObject preference_level) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return preference_modules.preference_level_LE(preference_level, $magic_wand_max_preference_level$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 13400L)
    public static SubLObject tactic_strictly_less_preferred_than_some_siblingP(SubLObject tactic, SubLObject strategic_context) {
        SubLObject tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic));
        SubLObject sibling_tactic = NIL;
        sibling_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $LOGICAL) && !sibling_tactic.eql(tactic)) {
                SubLObject sibling_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(sibling_tactic, strategic_context);
                if (NIL != preference_modules.preference_level_L(tactic_preference_level, sibling_preference_level)) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling_tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 13800L)
    public static SubLObject abductive_magic_wand_tacticP(SubLObject tactic, SubLObject strategic_context) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker.logical_tactic_p(tactic)) {
            if (NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic)) {
                SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
                if (NIL != abductive_strategy_chooses_only_abductive_tacticP(lookahead_problem, strategic_context) && NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context)) {
                    return T;
                }
            } else if (NIL != inference_worker_join.join_tactic_p(tactic)) {
                thread.resetMultipleValues();
                SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(tactic);
                SubLObject second_problem = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != abductive_strategy_chooses_only_abductive_tacticP(first_problem, strategic_context) && NIL != abductive_strategy_chooses_only_abductive_tacticP(second_problem, strategic_context) && NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 14700L)
    public static SubLObject abductive_strategy_chooses_only_abductive_tacticP(SubLObject problem, SubLObject strategic_context) {
        SubLObject possible_tactics = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_tactic.tactic_possibleP(tactic) && NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_set_aside_tacticP(strategic_context, tactic, $REMOVAL)
                    && NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, $REMOVAL)) {
                possible_tactics = cons(tactic, possible_tactics);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        if (NIL != list_utilities.singletonP(possible_tactics) && NIL != inference_datastructures_tactic.abductive_tacticP(possible_tactics.first())) {
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 15300L)
    public static SubLObject inference_all_set_asides(SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        return subl_promotions.values2(inference_all_set_aside_problems(inference), inference_all_set_aside_strategems(inference));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 15700L)
    public static SubLObject inference_all_set_aside_problems(SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        SubLObject all_set_aside_problems = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject set_var = inference_datastructures_inference.inference_strategy_set(inference);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        SubLObject set_var_$11;
        SubLObject set_contents_var_$12;
        SubLObject basis_object_$13;
        SubLObject state_$14;
        SubLObject problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                set_var_$11 = inference_datastructures_strategy.strategy_set_aside_problems(strategy);
                set_contents_var_$12 = set.do_set_internal(set_var_$11);
                for (basis_object_$13 = set_contents.do_set_contents_basis_object(set_contents_var_$12), state_$14 = NIL, state_$14 = set_contents.do_set_contents_initial_state(basis_object_$13, set_contents_var_$12); NIL == set_contents.do_set_contents_doneP(basis_object_$13,
                        state_$14); state_$14 = set_contents.do_set_contents_update_state(state_$14)) {
                    problem = set_contents.do_set_contents_next(basis_object_$13, state_$14);
                    if (NIL != set_contents.do_set_contents_element_validP(state_$14, problem)) {
                        set.set_add(problem, all_set_aside_problems);
                    }
                }
            }
        }
        return Sort.sort(set.set_element_list(all_set_aside_problems), Symbols.symbol_function($sym27$_), Symbols.symbol_function($sym28$PROBLEM_SUID));
    }

    @SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 16200L)
    public static SubLObject inference_all_set_aside_strategems(SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        SubLObject all_set_aside_strategems = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject set_var = inference_datastructures_inference.inference_strategy_set(inference);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        SubLObject set_aside_strategem_index;
        SubLObject iteration_state;
        SubLObject problem;
        SubLObject strategem_set;
        SubLObject set_contents_var_$15;
        SubLObject basis_object_$16;
        SubLObject state_$17;
        SubLObject strategem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                set_aside_strategem_index = NIL;
                if (NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy)) {
                    set_aside_strategem_index = transformation_tactician_datastructures.transformation_strategy_problem_strategems_set_aside(strategy);
                } else if (NIL != removal_tactician.removal_strategy_p(strategy)) {
                    set_aside_strategem_index = removal_tactician_datastructures.removal_strategy_problem_strategems_set_aside(strategy);
                }
                if (NIL != set_aside_strategem_index) {
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(set_aside_strategem_index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(
                            iteration_state)) {
                        thread.resetMultipleValues();
                        problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        strategem_set = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        set_contents_var_$15 = set.do_set_internal(strategem_set);
                        for (basis_object_$16 = set_contents.do_set_contents_basis_object(set_contents_var_$15), state_$17 = NIL, state_$17 = set_contents.do_set_contents_initial_state(basis_object_$16, set_contents_var_$15); NIL == set_contents.do_set_contents_doneP(basis_object_$16,
                                state_$17); state_$17 = set_contents.do_set_contents_update_state(state_$17)) {
                            strategem = set_contents.do_set_contents_next(basis_object_$16, state_$17);
                            if (NIL != set_contents.do_set_contents_element_validP(state_$17, strategem)) {
                                set.set_add(strategem, all_set_aside_strategems);
                            }
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
            }
        }
        return Sort.sort(set.set_element_list(all_set_aside_strategems), Symbols.symbol_function($sym29$STRATEGEM__), UNPROVIDED);
    }

    public static SubLObject declare_inference_tactician_utilities_file() {
        declareFunction(myName, "memoized_problem_global_preference_level", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction(myName, "memoized_problem_global_preference_level_int_internal", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INT-INTERNAL", 3, 0, false);
        declareFunction(myName, "memoized_problem_global_preference_level_int", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INT", 3, 0, false);
        declareFunction(myName, "problem_global_preference_level", "PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction(myName, "problem_global_preference_level_wrt_modules", "PROBLEM-GLOBAL-PREFERENCE-LEVEL-WRT-MODULES", 3, 0, false);
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
        declareFunction(myName, "inference_all_set_asides", "INFERENCE-ALL-SET-ASIDES", 1, 0, false);
        declareFunction(myName, "inference_all_set_aside_problems", "INFERENCE-ALL-SET-ASIDE-PROBLEMS", 1, 0, false);
        declareFunction(myName, "inference_all_set_aside_strategems", "INFERENCE-ALL-SET-ASIDE-STRATEGEMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_tactician_utilities_file() {
        $set_aside_implies_disallowedP$ = defparameter("*SET-ASIDE-IMPLIES-DISALLOWED?*", NIL);
        $preference_scaling_values$ = defparameter("*PREFERENCE-SCALING-VALUES*", $list22);
        $literal_count_scaling_enabledP$ = defparameter("*LITERAL-COUNT-SCALING-ENABLED?*", T);
        $magic_wand_max_preference_level$ = defparameter("*MAGIC-WAND-MAX-PREFERENCE-LEVEL*", $DISPREFERRED);
        return NIL;
    }

    public static SubLObject setup_inference_tactician_utilities_file() {
        memoization_state.note_memoized_function($sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT);
        return NIL;
    }

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

    static {
        me = new inference_tactician_utilities();
        $set_aside_implies_disallowedP$ = null;
        $preference_scaling_values$ = null;
        $literal_count_scaling_enabledP$ = null;
        $magic_wand_max_preference_level$ = null;
        $sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT = makeSymbol("MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INT");
        $sym1$_EXIT = makeSymbol("%EXIT");
        $sym2$STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");
        $GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
        $str4$removal_is_not_allowed_in_the_pro = makeString("removal is not allowed in the problem store");
        $PREFERRED = makeKeyword("PREFERRED");
        $str6$problem_is_closed = makeString("problem is closed");
        $str7$no_variables_have_any_hope_of_get = makeString("no variables have any hope of getting bound");
        $DOOMED = makeKeyword("DOOMED");
        $DISALLOWED = makeKeyword("DISALLOWED");
        $str10$CHECK_SENTENCE_SIBLING = makeString("CHECK-SENTENCE-SIBLING");
        $str11$problem_has_no_removal_allowed_or = makeString("problem has no removal-allowed or executed tactics");
        $str12$single_negative_literal = makeString("single negative literal");
        $str13$problem_has_a_complete_non_thrown = makeString("problem has a complete non-thrown-away removal tactic");
        $str14$problem_has_executed_a_complete_r = makeString("problem has executed a complete removal tactic");
        $TACTICAL = makeKeyword("TACTICAL");
        $NEG = makeKeyword("NEG");
        $str17$unknown = makeString("unknown");
        $sym18$TRANSFORMATION_TACTIC_P = makeSymbol("TRANSFORMATION-TACTIC-P");
        $str19$Unexpected_strategy_type__s = makeString("Unexpected strategy type ~s");
        $GENERALIZED_REMOVAL = makeKeyword("GENERALIZED-REMOVAL");
        $REMOVAL = makeKeyword("REMOVAL");
        $list22 = list(list(makeKeyword("DISPREFERRED"), TWO_INTEGER, ZERO_INTEGER), list(makeKeyword("GROSSLY-DISPREFERRED"), TWENTY_INTEGER, ZERO_INTEGER), list(makeKeyword("JOIN-ORDERED"), FIVE_INTEGER, ZERO_INTEGER));
        $list23 = list(makeSymbol("M"), makeSymbol("B"));
        $DISPREFERRED = makeKeyword("DISPREFERRED");
        $LOGICAL = makeKeyword("LOGICAL");
        $sym26$INFERENCE_P = makeSymbol("INFERENCE-P");
        $sym27$_ = makeSymbol("<");
        $sym28$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");
        $sym29$STRATEGEM__ = makeSymbol("STRATEGEM-<");
    }
}
/*
 *
 * Total time: 187 ms
 *
 */