/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-TACTICIAN-UTILITIES
 * source file: /cyc/top/cycl/inference/harness/inference-tactician-utilities.lisp
 * created:     2019/07/03 17:37:40
 */
public final class inference_tactician_utilities extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final SubLObject memoized_problem_global_preference_level_internal(SubLObject problem, SubLObject strategic_context, SubLObject shared_variables) {
        return com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.problem_global_preference_level(problem, strategic_context, shared_variables);
    }

    public static final SubLFile me = new inference_tactician_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $set_aside_implies_disallowedP$ = makeSymbol("*SET-ASIDE-IMPLIES-DISALLOWED?*");

    // defparameter
    // m b
    /**
     * m      b
     */
    @LispMethod(comment = "m      b\ndefparameter\nm b")
    private static final SubLSymbol $preference_scaling_values$ = makeSymbol("*PREFERENCE-SCALING-VALUES*");

    // defparameter
    /**
     * Temporary control variable; when non-NIL we factor the number of focal
     * literals in a connected conjunction tactic into account when computed the
     * committed tactic. Should eventually stay T.
     */
    @LispMethod(comment = "Temporary control variable; when non-NIL we factor the number of focal\r\nliterals in a connected conjunction tactic into account when computed the\r\ncommitted tactic. Should eventually stay T.\ndefparameter\nTemporary control variable; when non-NIL we factor the number of focal\nliterals in a connected conjunction tactic into account when computed the\ncommitted tactic. Should eventually stay T.")
    private static final SubLSymbol $literal_count_scaling_enabledP$ = makeSymbol("*LITERAL-COUNT-SCALING-ENABLED?*");

    // defparameter
    /**
     * Tactics with a preference level strictly higher than this will not be deemed
     * magic wand tactics.
     */
    @LispMethod(comment = "Tactics with a preference level strictly higher than this will not be deemed\r\nmagic wand tactics.\ndefparameter\nTactics with a preference level strictly higher than this will not be deemed\nmagic wand tactics.")
    private static final SubLSymbol $magic_wand_max_preference_level$ = makeSymbol("*MAGIC-WAND-MAX-PREFERENCE-LEVEL*");

    private static final SubLSymbol MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT = makeSymbol("MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INT");

    private static final SubLSymbol $sym1$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");

    static private final SubLString $str4$removal_is_not_allowed_in_the_pro = makeString("removal is not allowed in the problem store");

    static private final SubLString $$$problem_is_closed = makeString("problem is closed");

    static private final SubLString $str7$no_variables_have_any_hope_of_get = makeString("no variables have any hope of getting bound");

    private static final SubLString $str10$CHECK_SENTENCE_SIBLING = makeString("CHECK-SENTENCE-SIBLING");

    private static final SubLString $str11$problem_has_no_removal_allowed_or = makeString("problem has no removal-allowed or executed tactics");

    private static final SubLString $$$single_negative_literal = makeString("single negative literal");

    private static final SubLString $str13$problem_has_a_complete_non_thrown = makeString("problem has a complete non-thrown-away removal tactic");

    private static final SubLString $str14$problem_has_executed_a_complete_r = makeString("problem has executed a complete removal tactic");

    private static final SubLString $$$unknown = makeString("unknown");

    private static final SubLSymbol TRANSFORMATION_TACTIC_P = makeSymbol("TRANSFORMATION-TACTIC-P");

    private static final SubLString $str19$Unexpected_strategy_type__s = makeString("Unexpected strategy type ~s");

    static private final SubLList $list22 = list(list(makeKeyword("DISPREFERRED"), TWO_INTEGER, ZERO_INTEGER), list(makeKeyword("GROSSLY-DISPREFERRED"), TWENTY_INTEGER, ZERO_INTEGER), list(makeKeyword("JOIN-ORDERED"), FIVE_INTEGER, ZERO_INTEGER));

    private static final SubLList $list23 = list(makeSymbol("M"), makeSymbol("B"));

    private static final SubLSymbol $sym27$_ = makeSymbol("<");

    private static final SubLSymbol $sym29$STRATEGEM__ = makeSymbol("STRATEGEM-<");

    public static final SubLObject memoized_problem_global_preference_level_alt(SubLObject problem, SubLObject strategic_context, SubLObject shared_variables) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.memoized_problem_global_preference_level_internal(problem, strategic_context, shared_variables);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(problem, strategic_context, shared_variables);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (problem.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (strategic_context.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && shared_variables.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.memoized_problem_global_preference_level_internal(problem, strategic_context, shared_variables)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(problem, strategic_context, shared_variables));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject memoized_problem_global_preference_level(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preference_level = NIL;
        SubLObject justification = NIL;
        final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                thread.resetMultipleValues();
                final SubLObject preference_level_$1 = memoized_problem_global_preference_level_int(problem, strategic_context, shared_variables);
                final SubLObject justification_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                preference_level = preference_level_$1;
                justification = justification_$2;
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
        return subl_promotions.values2(preference_level, justification);
    }

    public static SubLObject memoized_problem_global_preference_level_int_internal(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem.problem_store(problem));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return problem_global_preference_level(problem, strategic_context, shared_variables);
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

    public static SubLObject memoized_problem_global_preference_level_int(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_problem_global_preference_level_int_internal(problem, strategic_context, shared_variables);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(problem, strategic_context, shared_variables);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (problem.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (strategic_context.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && shared_variables.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_problem_global_preference_level_int_internal(problem, strategic_context, shared_variables)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, strategic_context, shared_variables));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject problem_global_preference_level_alt(SubLObject problem, SubLObject strategic_context, SubLObject shared_variables) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(strategic_context, STRATEGIC_CONTEXT_P);
            {
                SubLObject preference_level = NIL;
                SubLObject justification = NIL;
                if (NIL == problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
                    preference_level = $GROSSLY_DISPREFERRED;
                    justification = $str_alt4$removal_is_not_allowed_in_the_pro;
                } else {
                    if (NIL != inference_datastructures_problem.closed_problem_p(problem)) {
                        preference_level = $PREFERRED;
                        justification = $$$problem_is_closed;
                    } else {
                        if (NIL == shared_variables) {
                            preference_level = $PREFERRED;
                            justification = $str_alt7$no_variables_have_any_hope_of_get;
                        } else {
                            inference_worker.determine_strategic_status_wrt(problem, strategic_context);
                            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.problem_has_no_allowed_or_executed_tactics_wrt_removalP(problem, strategic_context)) {
                                preference_level = $DISALLOWED;
                                justification = $str_alt9$problem_has_no_removal_allowed_or;
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.single_negative_literal_problem_p(problem)) {
                                    preference_level = (NIL != shared_variables) ? ((SubLObject) ($DISALLOWED)) : $GROSSLY_DISPREFERRED;
                                    justification = $$$single_negative_literal;
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.problem_has_some_complete_non_thrown_away_removal_tacticP(problem, strategic_context)) {
                                        preference_level = $PREFERRED;
                                        justification = $str_alt11$problem_has_a_complete_non_ignore;
                                    } else {
                                        if (NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, strategic_context)) {
                                            preference_level = $PREFERRED;
                                            justification = $str_alt12$problem_has_executed_a_complete_r;
                                        } else {
                                            if (NIL != inference_datastructures_problem.multi_literal_problem_p(problem)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject preference_level_1 = com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.multi_literal_problem_global_preference_level(problem, $TACTICAL);
                                                    SubLObject justification_2 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    preference_level = preference_level_1;
                                                    justification = justification_2;
                                                }
                                            } else {
                                                if (NIL != inference_datastructures_problem.multi_clause_problem_p(problem)) {
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(preference_level, justification);
            }
        }
    }

    public static SubLObject problem_global_preference_level(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "! inference_worker.strategic_context_p(strategic_context) " + ("inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) ") + strategic_context;
        SubLObject preference_level = NIL;
        SubLObject justification = NIL;
        if (NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            preference_level = $GROSSLY_DISPREFERRED;
            justification = $str4$removal_is_not_allowed_in_the_pro;
        } else
            if (NIL != inference_datastructures_problem.closed_problem_p(problem)) {
                preference_level = $PREFERRED;
                justification = $$$problem_is_closed;
            } else
                if (NIL == shared_variables) {
                    preference_level = $PREFERRED;
                    justification = $str7$no_variables_have_any_hope_of_get;
                } else {
                    inference_worker.determine_strategic_status_wrt(problem, strategic_context);
                    thread.resetMultipleValues();
                    final SubLObject preference_level_$5 = problem_global_preference_level_wrt_modules(problem, strategic_context, shared_variables);
                    final SubLObject justification_$6 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    preference_level = preference_level_$5;
                    justification = justification_$6;
                    if ($DOOMED != preference_level) {
                        if (($DISALLOWED != preference_level) || (!justification.equal($str10$CHECK_SENTENCE_SIBLING))) {
                            if (NIL != problem_has_no_allowed_or_executed_tactics_wrt_removalP(problem, strategic_context)) {
                                preference_level = $DISALLOWED;
                                justification = $str11$problem_has_no_removal_allowed_or;
                            } else
                                if (NIL != single_negative_literal_problem_p(problem)) {
                                    preference_level = (NIL != shared_variables) ? $DISALLOWED : $GROSSLY_DISPREFERRED;
                                    justification = $$$single_negative_literal;
                                } else
                                    if (NIL != problem_has_some_complete_non_thrown_away_removal_tacticP(problem, strategic_context)) {
                                        preference_level = $PREFERRED;
                                        justification = $str13$problem_has_a_complete_non_thrown;
                                    } else
                                        if (NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, strategic_context)) {
                                            preference_level = $PREFERRED;
                                            justification = $str14$problem_has_executed_a_complete_r;
                                        }



                        }
                    }
                }


        return subl_promotions.values2(preference_level, justification);
    }

    public static SubLObject problem_global_preference_level_wrt_modules(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preference_level = NIL;
        SubLObject justification = NIL;
        if (NIL != inference_datastructures_problem.multi_literal_problem_p(problem)) {
            thread.resetMultipleValues();
            final SubLObject preference_level_$7 = multi_literal_problem_global_preference_level(problem, $TACTICAL);
            final SubLObject justification_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            preference_level = preference_level_$7;
            justification = justification_$8;
        } else {
            if (NIL != inference_datastructures_problem.multi_clause_problem_p(problem)) {
                return inference_worker_union.$union_tactic_preference_level$.getGlobalValue();
            }
            thread.resetMultipleValues();
            final SubLObject preference_level_$8 = preference_modules.single_literal_problem_preference_level_wrt_modules(problem, strategic_context, shared_variables);
            final SubLObject justification_$9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            preference_level = preference_level_$8;
            justification = justification_$9;
        }
        return subl_promotions.values2(preference_level, justification);
    }

    public static final SubLObject single_negative_literal_problem_p_alt(SubLObject problem) {
        return makeBoolean((NIL != inference_datastructures_problem.single_literal_problem_p(problem)) && ($NEG == inference_datastructures_problem.single_literal_problem_sense(problem)));
    }

    public static SubLObject single_negative_literal_problem_p(final SubLObject problem) {
        return makeBoolean((NIL != inference_datastructures_problem.single_literal_problem_p(problem)) && ($NEG == inference_datastructures_problem.single_literal_problem_sense(problem)));
    }

    public static final SubLObject multi_literal_problem_global_preference_level_alt(SubLObject problem, SubLObject strategic_context) {
        {
            SubLObject max_preference_level = $DISALLOWED;
            SubLObject reason = $$$unknown;
            SubLObject tactics = com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.multi_literal_problem_tactics_to_activate(problem, strategic_context);
            SubLObject cdolist_list_var = tactics;
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                {
                    SubLObject preference_level = inference_datastructures_strategy.conjunctive_tactic_strategic_preference_level(tactic, strategic_context);
                    if (NIL != preference_level) {
                        if (NIL != preference_modules.preference_level_G(preference_level, max_preference_level)) {
                            max_preference_level = preference_level;
                            reason = inference_datastructures_strategy.conjunctive_tactic_strategic_preference_level_justification(tactic, strategic_context);
                        }
                    }
                }
            }
            return values(max_preference_level, reason);
        }
    }

    public static SubLObject multi_literal_problem_global_preference_level(final SubLObject problem, final SubLObject strategic_context) {
        SubLObject max_preference_level = $DISALLOWED;
        SubLObject reason = $$$unknown;
        SubLObject cdolist_list_var;
        final SubLObject tactics = cdolist_list_var = multi_literal_problem_tactics_to_activate(problem, strategic_context);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject preference_level = inference_datastructures_strategy.conjunctive_tactic_strategic_preference_level(tactic, strategic_context);
            if ((NIL != preference_level) && (NIL != preference_modules.preference_level_G(preference_level, max_preference_level))) {
                max_preference_level = preference_level;
                reason = inference_datastructures_strategy.conjunctive_tactic_strategic_preference_level_justification(tactic, strategic_context);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return subl_promotions.values2(max_preference_level, reason);
    }

    public static final SubLObject multi_literal_problem_tactics_to_activate_alt(SubLObject problem, SubLObject strategic_context) {
        if ($TACTICAL == strategic_context) {
            return remove_if(symbol_function(TRANSFORMATION_TACTIC_P), inference_datastructures_problem.problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_p(strategic_context)) {
                return list_utilities.remove_if_not(symbol_function(TACTIC_P), inference_balanced_tactician_motivation.balanced_strategy_categorize_strategems_wrt_removal(strategic_context, problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                return Errors.error($str_alt18$Unexpected_strategy_type__s, strategic_context);
            }
        }
    }

    public static SubLObject multi_literal_problem_tactics_to_activate(final SubLObject problem, final SubLObject strategic_context) {
        if ($TACTICAL == strategic_context) {
            return remove_if(symbol_function(TRANSFORMATION_TACTIC_P), inference_datastructures_problem.problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return Errors.error($str19$Unexpected_strategy_type__s, strategic_context);
    }

    /**
     * Return T iff PROBLEM has some :complete non-thrown-away removal tactic.
     */
    @LispMethod(comment = "Return T iff PROBLEM has some :complete non-thrown-away removal tactic.")
    public static final SubLObject problem_has_some_complete_non_thrown_away_removal_tacticP_alt(SubLObject problem, SubLObject strategic_context) {
        {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $GENERALIZED_REMOVAL)) {
                    if (NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context)) {
                        if ((NIL == inference_datastructures_strategy.strategy_p(strategic_context)) || (NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, $REMOVAL))) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff PROBLEM has some :complete non-thrown-away removal tactic.
     */
    @LispMethod(comment = "Return T iff PROBLEM has some :complete non-thrown-away removal tactic.")
    public static SubLObject problem_has_some_complete_non_thrown_away_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $GENERALIZED_REMOVAL)) && (NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context))) && ((NIL == inference_datastructures_strategy.strategy_p(strategic_context)) || (NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, $REMOVAL)))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Return T iff PROBLEM has no removal-relevant tactic with a completeness of anything other than :impossible
     * or a preference of anything other than :disallowed.
     */
    @LispMethod(comment = "Return T iff PROBLEM has no removal-relevant tactic with a completeness of anything other than :impossible\r\nor a preference of anything other than :disallowed.\nReturn T iff PROBLEM has no removal-relevant tactic with a completeness of anything other than :impossible\nor a preference of anything other than :disallowed.")
    public static final SubLObject problem_has_no_allowed_or_executed_tactics_wrt_removalP_alt(SubLObject problem, SubLObject strategic_context) {
        {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (((NIL != inference_datastructures_strategy.strategy_p(strategic_context)) && (NIL != inference_datastructures_tactic.tactic_possibleP(tactic))) && (NIL != inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, $REMOVAL))) {
                } else {
                    if (NIL != inference_datastructures_tactic.tactic_executedP(tactic)) {
                        return NIL;
                    } else {
                        if (NIL != inference_worker.content_tactic_p(tactic)) {
                            if (NIL == inference_tactician_strategic_uninterestingness.tactic_impossibleP(tactic, strategic_context)) {
                                return NIL;
                            }
                        } else {
                            if (NIL == inference_tactician_strategic_uninterestingness.tactic_disallowedP(tactic, strategic_context)) {
                                return NIL;
                            }
                        }
                    }
                }
            }
        }
        return T;
    }

    /**
     * Return T iff PROBLEM has no removal-relevant tactic with a completeness of anything other than :impossible
     * or a preference of anything other than :disallowed.
     */
    @LispMethod(comment = "Return T iff PROBLEM has no removal-relevant tactic with a completeness of anything other than :impossible\r\nor a preference of anything other than :disallowed.\nReturn T iff PROBLEM has no removal-relevant tactic with a completeness of anything other than :impossible\nor a preference of anything other than :disallowed.")
    public static SubLObject problem_has_no_allowed_or_executed_tactics_wrt_removalP(final SubLObject problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL == inference_datastructures_strategy.strategy_p(strategic_context)) || (NIL == inference_datastructures_tactic.tactic_possibleP(tactic))) || (NIL == (NIL != $set_aside_implies_disallowedP$.getDynamicValue(thread) ? inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_ignore_tacticP(strategic_context, tactic, $REMOVAL) : inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, $REMOVAL)))) {
                if (NIL != inference_datastructures_tactic.tactic_executedP(tactic)) {
                    return NIL;
                }
                if (NIL != inference_worker.content_tactic_p(tactic)) {
                    if (NIL == inference_tactician_strategic_uninterestingness.tactic_impossibleP(tactic, strategic_context)) {
                        return NIL;
                    }
                } else
                    if (NIL == inference_tactician_strategic_uninterestingness.tactic_disallowed_or_doomedP(tactic, strategic_context)) {
                        return NIL;
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     * Assumes zero b-values
     */
    @LispMethod(comment = "Assumes zero b-values")
    public static final SubLObject removal_unhappiness_alt(SubLObject productivity, SubLObject module_spec, SubLObject preference_level, SubLObject literal_count) {
        {
            SubLObject unhappiness = productivity;
            unhappiness = com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.scale_unhappiness(unhappiness, com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.module_scaling_factor(module_spec));
            unhappiness = com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.scale_unhappiness(unhappiness, com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.preference_scaling_factor(preference_level));
            unhappiness = com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.scale_unhappiness(unhappiness, com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.literal_count_scaling_factor(literal_count));
            return unhappiness;
        }
    }

    /**
     * Assumes zero b-values
     */
    @LispMethod(comment = "Assumes zero b-values")
    public static SubLObject removal_unhappiness(final SubLObject productivity, final SubLObject module_spec, final SubLObject preference_level, final SubLObject literal_count) {
        SubLObject unhappiness = scale_unhappiness(productivity, module_scaling_factor(module_spec));
        unhappiness = scale_unhappiness(unhappiness, preference_scaling_factor(preference_level));
        unhappiness = scale_unhappiness(unhappiness, literal_count_scaling_factor(literal_count));
        return unhappiness;
    }

    public static final SubLObject scale_unhappiness_alt(SubLObject unhappiness, SubLObject scaling_factor) {
        return number_utilities.potentially_infinite_integer_times_number_rounded(unhappiness, scaling_factor);
    }

    public static SubLObject scale_unhappiness(final SubLObject unhappiness, final SubLObject scaling_factor) {
        return number_utilities.potentially_infinite_integer_times_number_rounded(unhappiness, scaling_factor);
    }

    /**
     * Assumes zero b-values
     */
    @LispMethod(comment = "Assumes zero b-values")
    public static final SubLObject module_scaling_factor_alt(SubLObject module_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sf_data = list_utilities.alist_lookup_without_values($preference_scaling_values$.getDynamicValue(thread), module_spec, UNPROVIDED, UNPROVIDED);
                if (NIL != sf_data) {
                    {
                        SubLObject datum = sf_data;
                        SubLObject current = datum;
                        SubLObject m = NIL;
                        SubLObject b = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        m = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        b = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            return m;
                        } else {
                            cdestructuring_bind_error(datum, $list_alt22);
                        }
                    }
                }
            }
            return ONE_INTEGER;
        }
    }

    /**
     * Assumes zero b-values
     */
    @LispMethod(comment = "Assumes zero b-values")
    public static SubLObject module_scaling_factor(final SubLObject module_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sf_data = list_utilities.alist_lookup_without_values($preference_scaling_values$.getDynamicValue(thread), module_spec, UNPROVIDED, UNPROVIDED);
        if (NIL != sf_data) {
            SubLObject current;
            final SubLObject datum = current = sf_data;
            SubLObject m = NIL;
            SubLObject b = NIL;
            destructuring_bind_must_consp(current, datum, $list23);
            m = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list23);
            b = current.first();
            current = current.rest();
            if (NIL == current) {
                return m;
            }
            cdestructuring_bind_error(datum, $list23);
        }
        return ONE_INTEGER;
    }

    /**
     * Assumes zero b-values
     */
    @LispMethod(comment = "Assumes zero b-values")
    public static final SubLObject preference_scaling_factor_alt(SubLObject preference_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sf_data = list_utilities.alist_lookup_without_values($preference_scaling_values$.getDynamicValue(thread), preference_level, UNPROVIDED, UNPROVIDED);
                if (NIL != sf_data) {
                    {
                        SubLObject datum = sf_data;
                        SubLObject current = datum;
                        SubLObject m = NIL;
                        SubLObject b = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        m = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt22);
                        b = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            return m;
                        } else {
                            cdestructuring_bind_error(datum, $list_alt22);
                        }
                    }
                }
            }
            return ONE_INTEGER;
        }
    }

    /**
     * Assumes zero b-values
     */
    @LispMethod(comment = "Assumes zero b-values")
    public static SubLObject preference_scaling_factor(final SubLObject preference_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sf_data = list_utilities.alist_lookup_without_values($preference_scaling_values$.getDynamicValue(thread), preference_level, UNPROVIDED, UNPROVIDED);
        if (NIL != sf_data) {
            SubLObject current;
            final SubLObject datum = current = sf_data;
            SubLObject m = NIL;
            SubLObject b = NIL;
            destructuring_bind_must_consp(current, datum, $list23);
            m = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list23);
            b = current.first();
            current = current.rest();
            if (NIL == current) {
                return m;
            }
            cdestructuring_bind_error(datum, $list23);
        }
        return ONE_INTEGER;
    }

    /**
     * Assumes zero b-values
     */
    @LispMethod(comment = "Assumes zero b-values")
    public static final SubLObject literal_count_scaling_factor_alt(SubLObject literal_count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $literal_count_scaling_enabledP$.getDynamicValue(thread)) {
                if (literal_count.numG(ONE_INTEGER)) {
                    return invert(literal_count);
                }
            }
            return ONE_INTEGER;
        }
    }

    /**
     * Assumes zero b-values
     */
    @LispMethod(comment = "Assumes zero b-values")
    public static SubLObject literal_count_scaling_factor(final SubLObject literal_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $literal_count_scaling_enabledP$.getDynamicValue(thread)) && literal_count.numG(ONE_INTEGER)) {
            return invert(literal_count);
        }
        return ONE_INTEGER;
    }

    /**
     *
     *
     * @return booleanp; whether it prefers a CANDIDATE-TACTIC's
    PRODUCTIVITY, PREFERENCE, MODULE-SPEC and LITERAL-COUNT values over
    those of a COMMITTED-TACTIC.
     */
    @LispMethod(comment = "@return booleanp; whether it prefers a CANDIDATE-TACTIC\'s\r\nPRODUCTIVITY, PREFERENCE, MODULE-SPEC and LITERAL-COUNT values over\r\nthose of a COMMITTED-TACTIC.")
    public static final SubLObject strategy_deems_conjunctive_tactic_spec_betterP_alt(SubLObject candidate_tactic_productivity, SubLObject candidate_tactic_preference, SubLObject candidate_tactic_module_spec, SubLObject candidate_tactic_literal_count, SubLObject committed_tactic_productivity, SubLObject committed_tactic_preference, SubLObject committed_tactic_module_spec, SubLObject committed_tactic_literal_count) {
        if ($DISALLOWED == candidate_tactic_preference) {
            return NIL;
        } else {
            if ($DISALLOWED == committed_tactic_preference) {
                return T;
            } else {
                {
                    SubLObject candidate_unhappiness = com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.removal_unhappiness(candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literal_count);
                    SubLObject committed_unhappiness = com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.removal_unhappiness(committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literal_count);
                    return number_utilities.potentially_infinite_integer_L(candidate_unhappiness, committed_unhappiness);
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether it prefers a CANDIDATE-TACTIC's
    PRODUCTIVITY, PREFERENCE, MODULE-SPEC and LITERAL-COUNT values over
    those of a COMMITTED-TACTIC.
     */
    @LispMethod(comment = "@return booleanp; whether it prefers a CANDIDATE-TACTIC\'s\r\nPRODUCTIVITY, PREFERENCE, MODULE-SPEC and LITERAL-COUNT values over\r\nthose of a COMMITTED-TACTIC.")
    public static SubLObject strategy_deems_conjunctive_tactic_spec_betterP(final SubLObject candidate_tactic_productivity, final SubLObject candidate_tactic_preference, final SubLObject candidate_tactic_module_spec, final SubLObject candidate_tactic_literal_count, final SubLObject committed_tactic_productivity, final SubLObject committed_tactic_preference, final SubLObject committed_tactic_module_spec, final SubLObject committed_tactic_literal_count) {
        if (NIL != preference_modules.disallowed_or_doomed_preference_level_p(candidate_tactic_preference)) {
            return NIL;
        }
        if (NIL != preference_modules.disallowed_or_doomed_preference_level_p(committed_tactic_preference)) {
            return T;
        }
        final SubLObject candidate_unhappiness = removal_unhappiness(candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literal_count);
        final SubLObject committed_unhappiness = removal_unhappiness(committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literal_count);
        return number_utilities.potentially_infinite_integer_L(candidate_unhappiness, committed_unhappiness);
    }

    public static final SubLObject magic_wand_tacticP_alt(SubLObject tactic, SubLObject strategic_context) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != inference_abduction_utilities.abductive_strategy_p(strategic_context)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.abductive_magic_wand_tacticP(tactic, strategic_context))) {
                return T;
            }
            if (NIL != inference_worker.logical_tactic_p(tactic)) {
                if (NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic)) {
                    if (ZERO_INTEGER.eql(inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context))) {
                        {
                            SubLObject tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
                            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.under_magic_wand_max_preference_levelP(tactic_preference_level)) {
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context)) {
                                    return T;
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != inference_worker_join.join_tactic_p(tactic)) {
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context)) {
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
                                    if ((ZERO_INTEGER.eql(first_productivity) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.under_magic_wand_max_preference_levelP(com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.memoized_problem_global_preference_level(first_problem, strategic_context, first_problem_shared_vars)))) || (ZERO_INTEGER.eql(second_productivity) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.under_magic_wand_max_preference_levelP(com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.memoized_problem_global_preference_level(second_problem, strategic_context, second_problem_shared_vars))))) {
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

    public static SubLObject magic_wand_tacticP(final SubLObject tactic, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != abductive_tactician.abductive_strategy_p(strategic_context)) && (NIL != abductive_magic_wand_tacticP(tactic, strategic_context))) {
            return T;
        }
        if (NIL != inference_worker.logical_tactic_p(tactic)) {
            if (NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic)) {
                if (ZERO_INTEGER.eql(inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context))) {
                    final SubLObject tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
                    if ((NIL != under_magic_wand_max_preference_levelP(tactic_preference_level)) && (NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context))) {
                        return T;
                    }
                }
            } else
                if ((NIL != inference_worker_join.join_tactic_p(tactic)) && (NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context))) {
                    thread.resetMultipleValues();
                    final SubLObject first_mapped_problem = inference_worker_join.find_or_create_join_tactic_supporting_mapped_problems(tactic);
                    final SubLObject second_mapped_problem = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
                    final SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
                    final SubLObject first_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(first_problem, strategic_context);
                    final SubLObject second_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(second_problem, strategic_context);
                    final SubLObject first_problem_shared_vars = inference_worker_join.first_problem_shared_vars(first_mapped_problem, second_mapped_problem);
                    final SubLObject second_problem_shared_vars = inference_worker_join.second_problem_shared_vars(first_mapped_problem, second_mapped_problem);
                    if ((ZERO_INTEGER.eql(first_productivity) && (NIL != under_magic_wand_max_preference_levelP(memoized_problem_global_preference_level(first_problem, strategic_context, first_problem_shared_vars)))) || (ZERO_INTEGER.eql(second_productivity) && (NIL != under_magic_wand_max_preference_levelP(memoized_problem_global_preference_level(second_problem, strategic_context, second_problem_shared_vars))))) {
                        return T;
                    }
                }

        }
        return NIL;
    }

    public static final SubLObject under_magic_wand_max_preference_levelP_alt(SubLObject preference_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return preference_modules.preference_level_LE(preference_level, $magic_wand_max_preference_level$.getDynamicValue(thread));
        }
    }

    public static SubLObject under_magic_wand_max_preference_levelP(final SubLObject preference_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return preference_modules.preference_level_LE(preference_level, $magic_wand_max_preference_level$.getDynamicValue(thread));
    }

    public static final SubLObject tactic_strictly_less_preferred_than_some_siblingP_alt(SubLObject tactic, SubLObject strategic_context) {
        {
            SubLObject tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic));
            SubLObject sibling_tactic = NIL;
            for (sibling_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling_tactic = cdolist_list_var.first()) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $LOGICAL)) {
                    if (tactic != sibling_tactic) {
                        {
                            SubLObject sibling_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(sibling_tactic, strategic_context);
                            if (NIL != preference_modules.preference_level_L(tactic_preference_level, sibling_preference_level)) {
                                return T;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject tactic_strictly_less_preferred_than_some_siblingP(final SubLObject tactic, final SubLObject strategic_context) {
        final SubLObject tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic));
        SubLObject sibling_tactic = NIL;
        sibling_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, $LOGICAL)) && (!sibling_tactic.eql(tactic))) {
                final SubLObject sibling_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(sibling_tactic, strategic_context);
                if (NIL != preference_modules.preference_level_L(tactic_preference_level, sibling_preference_level)) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling_tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject abductive_magic_wand_tacticP_alt(SubLObject tactic, SubLObject strategic_context) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_worker.logical_tactic_p(tactic)) {
                if (NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic)) {
                    {
                        SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
                        if ((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.abductive_strategy_chooses_only_abductive_tacticP(lookahead_problem, strategic_context)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context))) {
                            return T;
                        }
                    }
                } else {
                    if (NIL != inference_worker_join.join_tactic_p(tactic)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(tactic);
                            SubLObject second_problem = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (((NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.abductive_strategy_chooses_only_abductive_tacticP(first_problem, strategic_context)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.abductive_strategy_chooses_only_abductive_tacticP(second_problem, strategic_context))) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities.tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context))) {
                                return T;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject abductive_magic_wand_tacticP(final SubLObject tactic, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_worker.logical_tactic_p(tactic)) {
            if (NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic)) {
                final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
                if ((NIL != abductive_strategy_chooses_only_abductive_tacticP(lookahead_problem, strategic_context)) && (NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context))) {
                    return T;
                }
            } else
                if (NIL != inference_worker_join.join_tactic_p(tactic)) {
                    thread.resetMultipleValues();
                    final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(tactic);
                    final SubLObject second_problem = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (((NIL != abductive_strategy_chooses_only_abductive_tacticP(first_problem, strategic_context)) && (NIL != abductive_strategy_chooses_only_abductive_tacticP(second_problem, strategic_context))) && (NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context))) {
                        return T;
                    }
                }

        }
        return NIL;
    }

    public static final SubLObject abductive_strategy_chooses_only_abductive_tacticP_alt(SubLObject problem, SubLObject strategic_context) {
        {
            SubLObject possible_tactics = NIL;
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = NIL;
            for (tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic = cdolist_list_var.first()) {
                if (((NIL != inference_datastructures_tactic.tactic_possibleP(tactic)) && (NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_set_aside_tacticP(strategic_context, tactic, $REMOVAL))) && (NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, $REMOVAL))) {
                    possible_tactics = cons(tactic, possible_tactics);
                }
            }
            if ((NIL != list_utilities.singletonP(possible_tactics)) && (NIL != inference_datastructures_tactic.abductive_tacticP(possible_tactics.first()))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject abductive_strategy_chooses_only_abductive_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        SubLObject possible_tactics = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL != inference_datastructures_tactic.tactic_possibleP(tactic)) && (NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_set_aside_tacticP(strategic_context, tactic, $REMOVAL))) && (NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, $REMOVAL))) {
                possible_tactics = cons(tactic, possible_tactics);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        if ((NIL != list_utilities.singletonP(possible_tactics)) && (NIL != inference_datastructures_tactic.abductive_tacticP(possible_tactics.first()))) {
            return T;
        }
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL = makeSymbol("MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL");

    public static final SubLSymbol $kw1$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt4$removal_is_not_allowed_in_the_pro = makeString("removal is not allowed in the problem store");

    public static SubLObject inference_all_set_asides(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        return subl_promotions.values2(inference_all_set_aside_problems(inference), inference_all_set_aside_strategems(inference));
    }

    static private final SubLString $str_alt7$no_variables_have_any_hope_of_get = makeString("no variables have any hope of getting bound");

    static private final SubLString $str_alt9$problem_has_no_removal_allowed_or = makeString("problem has no removal-allowed or executed tactics");

    static private final SubLString $str_alt11$problem_has_a_complete_non_ignore = makeString("problem has a complete non-ignored removal tactic");

    public static SubLObject inference_all_set_aside_problems(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        final SubLObject all_set_aside_problems = set.new_set(symbol_function(EQ), UNPROVIDED);
        final SubLObject set_var = inference_datastructures_inference.inference_strategy_set(inference);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        SubLObject set_var_$11;
        SubLObject set_contents_var_$12;
        SubLObject basis_object_$13;
        SubLObject state_$14;
        SubLObject problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                set_var_$11 = inference_datastructures_strategy.strategy_set_aside_problems(strategy);
                set_contents_var_$12 = set.do_set_internal(set_var_$11);
                for (basis_object_$13 = set_contents.do_set_contents_basis_object(set_contents_var_$12), state_$14 = NIL, state_$14 = set_contents.do_set_contents_initial_state(basis_object_$13, set_contents_var_$12); NIL == set_contents.do_set_contents_doneP(basis_object_$13, state_$14); state_$14 = set_contents.do_set_contents_update_state(state_$14)) {
                    problem = set_contents.do_set_contents_next(basis_object_$13, state_$14);
                    if (NIL != set_contents.do_set_contents_element_validP(state_$14, problem)) {
                        set.set_add(problem, all_set_aside_problems);
                    }
                }
            }
        }
        return Sort.sort(set.set_element_list(all_set_aside_problems), symbol_function($sym27$_), symbol_function(PROBLEM_SUID));
    }

    static private final SubLString $str_alt12$problem_has_executed_a_complete_r = makeString("problem has executed a complete removal tactic");

    static private final SubLString $str_alt18$Unexpected_strategy_type__s = makeString("Unexpected strategy type ~s");

    static private final SubLList $list_alt21 = list(list(makeKeyword("DISPREFERRED"), TWO_INTEGER, ZERO_INTEGER), list(makeKeyword("GROSSLY-DISPREFERRED"), TWENTY_INTEGER, ZERO_INTEGER), list(makeKeyword("JOIN-ORDERED"), FIVE_INTEGER, ZERO_INTEGER));

    static private final SubLList $list_alt22 = list(makeSymbol("M"), makeSymbol("B"));

    public static SubLObject inference_all_set_aside_strategems(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        final SubLObject all_set_aside_strategems = set.new_set(symbol_function(EQ), UNPROVIDED);
        final SubLObject set_var = inference_datastructures_inference.inference_strategy_set(inference);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                set_aside_strategem_index = NIL;
                if (NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy)) {
                    set_aside_strategem_index = transformation_tactician_datastructures.transformation_strategy_problem_strategems_set_aside(strategy);
                } else
                    if (NIL != removal_tactician.removal_strategy_p(strategy)) {
                        set_aside_strategem_index = removal_tactician_datastructures.removal_strategy_problem_strategems_set_aside(strategy);
                    }

                if (NIL != set_aside_strategem_index) {
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(set_aside_strategem_index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        strategem_set = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        set_contents_var_$15 = set.do_set_internal(strategem_set);
                        for (basis_object_$16 = set_contents.do_set_contents_basis_object(set_contents_var_$15), state_$17 = NIL, state_$17 = set_contents.do_set_contents_initial_state(basis_object_$16, set_contents_var_$15); NIL == set_contents.do_set_contents_doneP(basis_object_$16, state_$17); state_$17 = set_contents.do_set_contents_update_state(state_$17)) {
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
        return Sort.sort(set.set_element_list(all_set_aside_strategems), symbol_function($sym29$STRATEGEM__), UNPROVIDED);
    }

    public static final SubLObject declare_inference_tactician_utilities_file_alt() {
        declareFunction("memoized_problem_global_preference_level_internal", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INTERNAL", 3, 0, false);
        declareFunction("memoized_problem_global_preference_level", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction("problem_global_preference_level", "PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction("single_negative_literal_problem_p", "SINGLE-NEGATIVE-LITERAL-PROBLEM-P", 1, 0, false);
        declareFunction("multi_literal_problem_global_preference_level", "MULTI-LITERAL-PROBLEM-GLOBAL-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction("multi_literal_problem_tactics_to_activate", "MULTI-LITERAL-PROBLEM-TACTICS-TO-ACTIVATE", 2, 0, false);
        declareFunction("problem_has_some_complete_non_thrown_away_removal_tacticP", "PROBLEM-HAS-SOME-COMPLETE-NON-THROWN-AWAY-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("problem_has_no_allowed_or_executed_tactics_wrt_removalP", "PROBLEM-HAS-NO-ALLOWED-OR-EXECUTED-TACTICS-WRT-REMOVAL?", 2, 0, false);
        declareFunction("removal_unhappiness", "REMOVAL-UNHAPPINESS", 4, 0, false);
        declareFunction("scale_unhappiness", "SCALE-UNHAPPINESS", 2, 0, false);
        declareFunction("module_scaling_factor", "MODULE-SCALING-FACTOR", 1, 0, false);
        declareFunction("preference_scaling_factor", "PREFERENCE-SCALING-FACTOR", 1, 0, false);
        declareFunction("literal_count_scaling_factor", "LITERAL-COUNT-SCALING-FACTOR", 1, 0, false);
        declareFunction("strategy_deems_conjunctive_tactic_spec_betterP", "STRATEGY-DEEMS-CONJUNCTIVE-TACTIC-SPEC-BETTER?", 8, 0, false);
        declareFunction("magic_wand_tacticP", "MAGIC-WAND-TACTIC?", 2, 0, false);
        declareFunction("under_magic_wand_max_preference_levelP", "UNDER-MAGIC-WAND-MAX-PREFERENCE-LEVEL?", 1, 0, false);
        declareFunction("tactic_strictly_less_preferred_than_some_siblingP", "TACTIC-STRICTLY-LESS-PREFERRED-THAN-SOME-SIBLING?", 2, 0, false);
        declareFunction("abductive_magic_wand_tacticP", "ABDUCTIVE-MAGIC-WAND-TACTIC?", 2, 0, false);
        declareFunction("abductive_strategy_chooses_only_abductive_tacticP", "ABDUCTIVE-STRATEGY-CHOOSES-ONLY-ABDUCTIVE-TACTIC?", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_tactician_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("memoized_problem_global_preference_level", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
            declareFunction("memoized_problem_global_preference_level_int_internal", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INT-INTERNAL", 3, 0, false);
            declareFunction("memoized_problem_global_preference_level_int", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INT", 3, 0, false);
            declareFunction("problem_global_preference_level", "PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
            declareFunction("problem_global_preference_level_wrt_modules", "PROBLEM-GLOBAL-PREFERENCE-LEVEL-WRT-MODULES", 3, 0, false);
            declareFunction("single_negative_literal_problem_p", "SINGLE-NEGATIVE-LITERAL-PROBLEM-P", 1, 0, false);
            declareFunction("multi_literal_problem_global_preference_level", "MULTI-LITERAL-PROBLEM-GLOBAL-PREFERENCE-LEVEL", 2, 0, false);
            declareFunction("multi_literal_problem_tactics_to_activate", "MULTI-LITERAL-PROBLEM-TACTICS-TO-ACTIVATE", 2, 0, false);
            declareFunction("problem_has_some_complete_non_thrown_away_removal_tacticP", "PROBLEM-HAS-SOME-COMPLETE-NON-THROWN-AWAY-REMOVAL-TACTIC?", 2, 0, false);
            declareFunction("problem_has_no_allowed_or_executed_tactics_wrt_removalP", "PROBLEM-HAS-NO-ALLOWED-OR-EXECUTED-TACTICS-WRT-REMOVAL?", 2, 0, false);
            declareFunction("removal_unhappiness", "REMOVAL-UNHAPPINESS", 4, 0, false);
            declareFunction("scale_unhappiness", "SCALE-UNHAPPINESS", 2, 0, false);
            declareFunction("module_scaling_factor", "MODULE-SCALING-FACTOR", 1, 0, false);
            declareFunction("preference_scaling_factor", "PREFERENCE-SCALING-FACTOR", 1, 0, false);
            declareFunction("literal_count_scaling_factor", "LITERAL-COUNT-SCALING-FACTOR", 1, 0, false);
            declareFunction("strategy_deems_conjunctive_tactic_spec_betterP", "STRATEGY-DEEMS-CONJUNCTIVE-TACTIC-SPEC-BETTER?", 8, 0, false);
            declareFunction("magic_wand_tacticP", "MAGIC-WAND-TACTIC?", 2, 0, false);
            declareFunction("under_magic_wand_max_preference_levelP", "UNDER-MAGIC-WAND-MAX-PREFERENCE-LEVEL?", 1, 0, false);
            declareFunction("tactic_strictly_less_preferred_than_some_siblingP", "TACTIC-STRICTLY-LESS-PREFERRED-THAN-SOME-SIBLING?", 2, 0, false);
            declareFunction("abductive_magic_wand_tacticP", "ABDUCTIVE-MAGIC-WAND-TACTIC?", 2, 0, false);
            declareFunction("abductive_strategy_chooses_only_abductive_tacticP", "ABDUCTIVE-STRATEGY-CHOOSES-ONLY-ABDUCTIVE-TACTIC?", 2, 0, false);
            declareFunction("inference_all_set_asides", "INFERENCE-ALL-SET-ASIDES", 1, 0, false);
            declareFunction("inference_all_set_aside_problems", "INFERENCE-ALL-SET-ASIDE-PROBLEMS", 1, 0, false);
            declareFunction("inference_all_set_aside_strategems", "INFERENCE-ALL-SET-ASIDE-STRATEGEMS", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("memoized_problem_global_preference_level_internal", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INTERNAL", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_tactician_utilities_file_Previous() {
        declareFunction("memoized_problem_global_preference_level", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction("memoized_problem_global_preference_level_int_internal", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INT-INTERNAL", 3, 0, false);
        declareFunction("memoized_problem_global_preference_level_int", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INT", 3, 0, false);
        declareFunction("problem_global_preference_level", "PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction("problem_global_preference_level_wrt_modules", "PROBLEM-GLOBAL-PREFERENCE-LEVEL-WRT-MODULES", 3, 0, false);
        declareFunction("single_negative_literal_problem_p", "SINGLE-NEGATIVE-LITERAL-PROBLEM-P", 1, 0, false);
        declareFunction("multi_literal_problem_global_preference_level", "MULTI-LITERAL-PROBLEM-GLOBAL-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction("multi_literal_problem_tactics_to_activate", "MULTI-LITERAL-PROBLEM-TACTICS-TO-ACTIVATE", 2, 0, false);
        declareFunction("problem_has_some_complete_non_thrown_away_removal_tacticP", "PROBLEM-HAS-SOME-COMPLETE-NON-THROWN-AWAY-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction("problem_has_no_allowed_or_executed_tactics_wrt_removalP", "PROBLEM-HAS-NO-ALLOWED-OR-EXECUTED-TACTICS-WRT-REMOVAL?", 2, 0, false);
        declareFunction("removal_unhappiness", "REMOVAL-UNHAPPINESS", 4, 0, false);
        declareFunction("scale_unhappiness", "SCALE-UNHAPPINESS", 2, 0, false);
        declareFunction("module_scaling_factor", "MODULE-SCALING-FACTOR", 1, 0, false);
        declareFunction("preference_scaling_factor", "PREFERENCE-SCALING-FACTOR", 1, 0, false);
        declareFunction("literal_count_scaling_factor", "LITERAL-COUNT-SCALING-FACTOR", 1, 0, false);
        declareFunction("strategy_deems_conjunctive_tactic_spec_betterP", "STRATEGY-DEEMS-CONJUNCTIVE-TACTIC-SPEC-BETTER?", 8, 0, false);
        declareFunction("magic_wand_tacticP", "MAGIC-WAND-TACTIC?", 2, 0, false);
        declareFunction("under_magic_wand_max_preference_levelP", "UNDER-MAGIC-WAND-MAX-PREFERENCE-LEVEL?", 1, 0, false);
        declareFunction("tactic_strictly_less_preferred_than_some_siblingP", "TACTIC-STRICTLY-LESS-PREFERRED-THAN-SOME-SIBLING?", 2, 0, false);
        declareFunction("abductive_magic_wand_tacticP", "ABDUCTIVE-MAGIC-WAND-TACTIC?", 2, 0, false);
        declareFunction("abductive_strategy_chooses_only_abductive_tacticP", "ABDUCTIVE-STRATEGY-CHOOSES-ONLY-ABDUCTIVE-TACTIC?", 2, 0, false);
        declareFunction("inference_all_set_asides", "INFERENCE-ALL-SET-ASIDES", 1, 0, false);
        declareFunction("inference_all_set_aside_problems", "INFERENCE-ALL-SET-ASIDE-PROBLEMS", 1, 0, false);
        declareFunction("inference_all_set_aside_strategems", "INFERENCE-ALL-SET-ASIDE-STRATEGEMS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_inference_tactician_utilities_file_alt() {
        defparameter("*PREFERENCE-SCALING-VALUES*", $list_alt21);
        defparameter("*LITERAL-COUNT-SCALING-ENABLED?*", T);
        defparameter("*MAGIC-WAND-MAX-PREFERENCE-LEVEL*", $DISPREFERRED);
        return NIL;
    }

    public static SubLObject init_inference_tactician_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*SET-ASIDE-IMPLIES-DISALLOWED?*", NIL);
            defparameter("*PREFERENCE-SCALING-VALUES*", $list22);
            defparameter("*LITERAL-COUNT-SCALING-ENABLED?*", T);
            defparameter("*MAGIC-WAND-MAX-PREFERENCE-LEVEL*", $DISPREFERRED);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*PREFERENCE-SCALING-VALUES*", $list_alt21);
        }
        return NIL;
    }

    public static SubLObject init_inference_tactician_utilities_file_Previous() {
        defparameter("*SET-ASIDE-IMPLIES-DISALLOWED?*", NIL);
        defparameter("*PREFERENCE-SCALING-VALUES*", $list22);
        defparameter("*LITERAL-COUNT-SCALING-ENABLED?*", T);
        defparameter("*MAGIC-WAND-MAX-PREFERENCE-LEVEL*", $DISPREFERRED);
        return NIL;
    }

    public static final SubLObject setup_inference_tactician_utilities_file_alt() {
        memoization_state.note_memoized_function(MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL);
        return NIL;
    }

    public static SubLObject setup_inference_tactician_utilities_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function(MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function(MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL);
        }
        return NIL;
    }

    public static SubLObject setup_inference_tactician_utilities_file_Previous() {
        memoization_state.note_memoized_function(MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT);
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
    }
}

/**
 * Total time: 187 ms
 */
