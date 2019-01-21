package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_tactician_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities";
    public static final String myFingerPrint = "0a1f0874d3cfd9f14ac398e3295fbce90a0eebb03a2b3285ec8e264e6cdcdbdf";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 6546L)
    private static SubLSymbol $set_aside_implies_disallowedP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 7567L)
    private static SubLSymbol $preference_scaling_values$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 9375L)
    private static SubLSymbol $literal_count_scaling_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 13089L)
    private static SubLSymbol $magic_wand_max_preference_level$;
    private static final SubLSymbol $sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT;
    private static final SubLSymbol $sym1$_EXIT;
    private static final SubLSymbol $sym2$STRATEGIC_CONTEXT_P;
    private static final SubLSymbol $kw3$GROSSLY_DISPREFERRED;
    private static final SubLString $str4$removal_is_not_allowed_in_the_pro;
    private static final SubLSymbol $kw5$PREFERRED;
    private static final SubLString $str6$problem_is_closed;
    private static final SubLString $str7$no_variables_have_any_hope_of_get;
    private static final SubLSymbol $kw8$DOOMED;
    private static final SubLSymbol $kw9$DISALLOWED;
    private static final SubLString $str10$CHECK_SENTENCE_SIBLING;
    private static final SubLString $str11$problem_has_no_removal_allowed_or;
    private static final SubLString $str12$single_negative_literal;
    private static final SubLString $str13$problem_has_a_complete_non_thrown;
    private static final SubLString $str14$problem_has_executed_a_complete_r;
    private static final SubLSymbol $kw15$TACTICAL;
    private static final SubLSymbol $kw16$NEG;
    private static final SubLString $str17$unknown;
    private static final SubLSymbol $sym18$TRANSFORMATION_TACTIC_P;
    private static final SubLString $str19$Unexpected_strategy_type__s;
    private static final SubLSymbol $kw20$GENERALIZED_REMOVAL;
    private static final SubLSymbol $kw21$REMOVAL;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$DISPREFERRED;
    private static final SubLSymbol $kw25$LOGICAL;
    private static final SubLSymbol $sym26$INFERENCE_P;
    private static final SubLSymbol $sym27$_;
    private static final SubLSymbol $sym28$PROBLEM_SUID;
    private static final SubLSymbol $sym29$STRATEGEM__;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 880L)
    public static SubLObject memoized_problem_global_preference_level(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preference_level = (SubLObject)inference_tactician_utilities.NIL;
        SubLObject justification = (SubLObject)inference_tactician_utilities.NIL;
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
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_tactician_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return subl_promotions.values2(preference_level, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 1354L)
    public static SubLObject memoized_problem_global_preference_level_int_internal(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem.problem_store(problem));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return problem_global_preference_level(problem, strategic_context, shared_variables);
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_tactician_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 1354L)
    public static SubLObject memoized_problem_global_preference_level_int(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_tactician_utilities.NIL;
        if (inference_tactician_utilities.NIL == v_memoization_state) {
            return memoized_problem_global_preference_level_int_internal(problem, strategic_context, shared_variables);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_tactician_utilities.$sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT, (SubLObject)inference_tactician_utilities.UNPROVIDED);
        if (inference_tactician_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_tactician_utilities.$sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT, (SubLObject)inference_tactician_utilities.THREE_INTEGER, (SubLObject)inference_tactician_utilities.NIL, (SubLObject)inference_tactician_utilities.EQUAL, (SubLObject)inference_tactician_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_tactician_utilities.$sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(problem, strategic_context, shared_variables);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_tactician_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_tactician_utilities.NIL;
            collision = cdolist_list_var.first();
            while (inference_tactician_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (problem.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (strategic_context.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (inference_tactician_utilities.NIL != cached_args && inference_tactician_utilities.NIL == cached_args.rest() && shared_variables.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(memoized_problem_global_preference_level_int_internal(problem, strategic_context, shared_variables)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(problem, strategic_context, shared_variables));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 1652L)
    public static SubLObject problem_global_preference_level(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_tactician_utilities.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        SubLObject preference_level = (SubLObject)inference_tactician_utilities.NIL;
        SubLObject justification = (SubLObject)inference_tactician_utilities.NIL;
        if (inference_tactician_utilities.NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            preference_level = (SubLObject)inference_tactician_utilities.$kw3$GROSSLY_DISPREFERRED;
            justification = (SubLObject)inference_tactician_utilities.$str4$removal_is_not_allowed_in_the_pro;
        }
        else if (inference_tactician_utilities.NIL != inference_datastructures_problem.closed_problem_p(problem)) {
            preference_level = (SubLObject)inference_tactician_utilities.$kw5$PREFERRED;
            justification = (SubLObject)inference_tactician_utilities.$str6$problem_is_closed;
        }
        else if (inference_tactician_utilities.NIL == shared_variables) {
            preference_level = (SubLObject)inference_tactician_utilities.$kw5$PREFERRED;
            justification = (SubLObject)inference_tactician_utilities.$str7$no_variables_have_any_hope_of_get;
        }
        else {
            inference_worker.determine_strategic_status_wrt(problem, strategic_context);
            thread.resetMultipleValues();
            final SubLObject preference_level_$5 = problem_global_preference_level_wrt_modules(problem, strategic_context, shared_variables);
            final SubLObject justification_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            preference_level = preference_level_$5;
            justification = justification_$6;
            if (inference_tactician_utilities.$kw8$DOOMED != preference_level) {
                if (inference_tactician_utilities.$kw9$DISALLOWED != preference_level || !justification.equal((SubLObject)inference_tactician_utilities.$str10$CHECK_SENTENCE_SIBLING)) {
                    if (inference_tactician_utilities.NIL != problem_has_no_allowed_or_executed_tactics_wrt_removalP(problem, strategic_context)) {
                        preference_level = (SubLObject)inference_tactician_utilities.$kw9$DISALLOWED;
                        justification = (SubLObject)inference_tactician_utilities.$str11$problem_has_no_removal_allowed_or;
                    }
                    else if (inference_tactician_utilities.NIL != single_negative_literal_problem_p(problem)) {
                        preference_level = (SubLObject)((inference_tactician_utilities.NIL != shared_variables) ? inference_tactician_utilities.$kw9$DISALLOWED : inference_tactician_utilities.$kw3$GROSSLY_DISPREFERRED);
                        justification = (SubLObject)inference_tactician_utilities.$str12$single_negative_literal;
                    }
                    else if (inference_tactician_utilities.NIL != problem_has_some_complete_non_thrown_away_removal_tacticP(problem, strategic_context)) {
                        preference_level = (SubLObject)inference_tactician_utilities.$kw5$PREFERRED;
                        justification = (SubLObject)inference_tactician_utilities.$str13$problem_has_a_complete_non_thrown;
                    }
                    else if (inference_tactician_utilities.NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, strategic_context)) {
                        preference_level = (SubLObject)inference_tactician_utilities.$kw5$PREFERRED;
                        justification = (SubLObject)inference_tactician_utilities.$str14$problem_has_executed_a_complete_r;
                    }
                }
            }
        }
        return subl_promotions.values2(preference_level, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 4066L)
    public static SubLObject problem_global_preference_level_wrt_modules(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_variables) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preference_level = (SubLObject)inference_tactician_utilities.NIL;
        SubLObject justification = (SubLObject)inference_tactician_utilities.NIL;
        if (inference_tactician_utilities.NIL != inference_datastructures_problem.multi_literal_problem_p(problem)) {
            thread.resetMultipleValues();
            final SubLObject preference_level_$7 = multi_literal_problem_global_preference_level(problem, (SubLObject)inference_tactician_utilities.$kw15$TACTICAL);
            final SubLObject justification_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            preference_level = preference_level_$7;
            justification = justification_$8;
        }
        else {
            if (inference_tactician_utilities.NIL != inference_datastructures_problem.multi_clause_problem_p(problem)) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 4778L)
    public static SubLObject single_negative_literal_problem_p(final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_tactician_utilities.NIL != inference_datastructures_problem.single_literal_problem_p(problem) && inference_tactician_utilities.$kw16$NEG == inference_datastructures_problem.single_literal_problem_sense(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 4945L)
    public static SubLObject multi_literal_problem_global_preference_level(final SubLObject problem, final SubLObject strategic_context) {
        SubLObject max_preference_level = (SubLObject)inference_tactician_utilities.$kw9$DISALLOWED;
        SubLObject reason = (SubLObject)inference_tactician_utilities.$str17$unknown;
        SubLObject cdolist_list_var;
        final SubLObject tactics = cdolist_list_var = multi_literal_problem_tactics_to_activate(problem, strategic_context);
        SubLObject tactic = (SubLObject)inference_tactician_utilities.NIL;
        tactic = cdolist_list_var.first();
        while (inference_tactician_utilities.NIL != cdolist_list_var) {
            final SubLObject preference_level = inference_datastructures_strategy.conjunctive_tactic_strategic_preference_level(tactic, strategic_context);
            if (inference_tactician_utilities.NIL != preference_level && inference_tactician_utilities.NIL != preference_modules.preference_level_G(preference_level, max_preference_level)) {
                max_preference_level = preference_level;
                reason = inference_datastructures_strategy.conjunctive_tactic_strategic_preference_level_justification(tactic, strategic_context);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return subl_promotions.values2(max_preference_level, reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 5729L)
    public static SubLObject multi_literal_problem_tactics_to_activate(final SubLObject problem, final SubLObject strategic_context) {
        if (inference_tactician_utilities.$kw15$TACTICAL == strategic_context) {
            return Sequences.remove_if(Symbols.symbol_function((SubLObject)inference_tactician_utilities.$sym18$TRANSFORMATION_TACTIC_P), inference_datastructures_problem.problem_tactics(problem), (SubLObject)inference_tactician_utilities.UNPROVIDED, (SubLObject)inference_tactician_utilities.UNPROVIDED, (SubLObject)inference_tactician_utilities.UNPROVIDED, (SubLObject)inference_tactician_utilities.UNPROVIDED);
        }
        return Errors.error((SubLObject)inference_tactician_utilities.$str19$Unexpected_strategy_type__s, strategic_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 6051L)
    public static SubLObject problem_has_some_complete_non_thrown_away_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_tactician_utilities.NIL;
        tactic = cdolist_list_var.first();
        while (inference_tactician_utilities.NIL != cdolist_list_var) {
            if (inference_tactician_utilities.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, (SubLObject)inference_tactician_utilities.$kw20$GENERALIZED_REMOVAL) && inference_tactician_utilities.NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context) && (inference_tactician_utilities.NIL == inference_datastructures_strategy.strategy_p(strategic_context) || inference_tactician_utilities.NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, (SubLObject)inference_tactician_utilities.$kw21$REMOVAL))) {
                return (SubLObject)inference_tactician_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_tactician_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 6606L)
    public static SubLObject problem_has_no_allowed_or_executed_tactics_wrt_removalP(final SubLObject problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_tactician_utilities.NIL;
        tactic = cdolist_list_var.first();
        while (inference_tactician_utilities.NIL != cdolist_list_var) {
            if (inference_tactician_utilities.NIL == inference_datastructures_strategy.strategy_p(strategic_context) || inference_tactician_utilities.NIL == inference_datastructures_tactic.tactic_possibleP(tactic) || inference_tactician_utilities.NIL == ((inference_tactician_utilities.NIL != inference_tactician_utilities.$set_aside_implies_disallowedP$.getDynamicValue(thread)) ? inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_ignore_tacticP(strategic_context, tactic, (SubLObject)inference_tactician_utilities.$kw21$REMOVAL) : inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, (SubLObject)inference_tactician_utilities.$kw21$REMOVAL))) {
                if (inference_tactician_utilities.NIL != inference_datastructures_tactic.tactic_executedP(tactic)) {
                    return (SubLObject)inference_tactician_utilities.NIL;
                }
                if (inference_tactician_utilities.NIL != inference_worker.content_tactic_p(tactic)) {
                    if (inference_tactician_utilities.NIL == inference_tactician_strategic_uninterestingness.tactic_impossibleP(tactic, strategic_context)) {
                        return (SubLObject)inference_tactician_utilities.NIL;
                    }
                }
                else if (inference_tactician_utilities.NIL == inference_tactician_strategic_uninterestingness.tactic_disallowed_or_doomedP(tactic, strategic_context)) {
                    return (SubLObject)inference_tactician_utilities.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_tactician_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 8108L)
    public static SubLObject removal_unhappiness(final SubLObject productivity, final SubLObject module_spec, final SubLObject preference_level, final SubLObject literal_count) {
        SubLObject unhappiness = scale_unhappiness(productivity, module_scaling_factor(module_spec));
        unhappiness = scale_unhappiness(unhappiness, preference_scaling_factor(preference_level));
        unhappiness = scale_unhappiness(unhappiness, literal_count_scaling_factor(literal_count));
        return unhappiness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 8623L)
    public static SubLObject scale_unhappiness(final SubLObject unhappiness, final SubLObject scaling_factor) {
        return number_utilities.potentially_infinite_integer_times_number_rounded(unhappiness, scaling_factor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 8775L)
    public static SubLObject module_scaling_factor(final SubLObject module_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sf_data = list_utilities.alist_lookup_without_values(inference_tactician_utilities.$preference_scaling_values$.getDynamicValue(thread), module_spec, (SubLObject)inference_tactician_utilities.UNPROVIDED, (SubLObject)inference_tactician_utilities.UNPROVIDED);
        if (inference_tactician_utilities.NIL != sf_data) {
            SubLObject current;
            final SubLObject datum = current = sf_data;
            SubLObject m = (SubLObject)inference_tactician_utilities.NIL;
            SubLObject b = (SubLObject)inference_tactician_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_tactician_utilities.$list23);
            m = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_tactician_utilities.$list23);
            b = current.first();
            current = current.rest();
            if (inference_tactician_utilities.NIL == current) {
                return m;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_tactician_utilities.$list23);
        }
        return (SubLObject)inference_tactician_utilities.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 9068L)
    public static SubLObject preference_scaling_factor(final SubLObject preference_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sf_data = list_utilities.alist_lookup_without_values(inference_tactician_utilities.$preference_scaling_values$.getDynamicValue(thread), preference_level, (SubLObject)inference_tactician_utilities.UNPROVIDED, (SubLObject)inference_tactician_utilities.UNPROVIDED);
        if (inference_tactician_utilities.NIL != sf_data) {
            SubLObject current;
            final SubLObject datum = current = sf_data;
            SubLObject m = (SubLObject)inference_tactician_utilities.NIL;
            SubLObject b = (SubLObject)inference_tactician_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_tactician_utilities.$list23);
            m = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_tactician_utilities.$list23);
            b = current.first();
            current = current.rest();
            if (inference_tactician_utilities.NIL == current) {
                return m;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_tactician_utilities.$list23);
        }
        return (SubLObject)inference_tactician_utilities.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 9641L)
    public static SubLObject literal_count_scaling_factor(final SubLObject literal_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_tactician_utilities.NIL != inference_tactician_utilities.$literal_count_scaling_enabledP$.getDynamicValue(thread) && literal_count.numG((SubLObject)inference_tactician_utilities.ONE_INTEGER)) {
            return Numbers.invert(literal_count);
        }
        return (SubLObject)inference_tactician_utilities.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 9875L)
    public static SubLObject strategy_deems_conjunctive_tactic_spec_betterP(final SubLObject candidate_tactic_productivity, final SubLObject candidate_tactic_preference, final SubLObject candidate_tactic_module_spec, final SubLObject candidate_tactic_literal_count, final SubLObject committed_tactic_productivity, final SubLObject committed_tactic_preference, final SubLObject committed_tactic_module_spec, final SubLObject committed_tactic_literal_count) {
        if (inference_tactician_utilities.NIL != preference_modules.disallowed_or_doomed_preference_level_p(candidate_tactic_preference)) {
            return (SubLObject)inference_tactician_utilities.NIL;
        }
        if (inference_tactician_utilities.NIL != preference_modules.disallowed_or_doomed_preference_level_p(committed_tactic_preference)) {
            return (SubLObject)inference_tactician_utilities.T;
        }
        final SubLObject candidate_unhappiness = removal_unhappiness(candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literal_count);
        final SubLObject committed_unhappiness = removal_unhappiness(committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literal_count);
        return number_utilities.potentially_infinite_integer_L(candidate_unhappiness, committed_unhappiness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 11036L)
    public static SubLObject magic_wand_tacticP(final SubLObject tactic, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_tactician_utilities.NIL != abductive_tactician.abductive_strategy_p(strategic_context) && inference_tactician_utilities.NIL != abductive_magic_wand_tacticP(tactic, strategic_context)) {
            return (SubLObject)inference_tactician_utilities.T;
        }
        if (inference_tactician_utilities.NIL != inference_worker.logical_tactic_p(tactic)) {
            if (inference_tactician_utilities.NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic)) {
                if (inference_tactician_utilities.ZERO_INTEGER.eql(inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context))) {
                    final SubLObject tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
                    if (inference_tactician_utilities.NIL != under_magic_wand_max_preference_levelP(tactic_preference_level) && inference_tactician_utilities.NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context)) {
                        return (SubLObject)inference_tactician_utilities.T;
                    }
                }
            }
            else if (inference_tactician_utilities.NIL != inference_worker_join.join_tactic_p(tactic) && inference_tactician_utilities.NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context)) {
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
                if ((inference_tactician_utilities.ZERO_INTEGER.eql(first_productivity) && inference_tactician_utilities.NIL != under_magic_wand_max_preference_levelP(memoized_problem_global_preference_level(first_problem, strategic_context, first_problem_shared_vars))) || (inference_tactician_utilities.ZERO_INTEGER.eql(second_productivity) && inference_tactician_utilities.NIL != under_magic_wand_max_preference_levelP(memoized_problem_global_preference_level(second_problem, strategic_context, second_problem_shared_vars)))) {
                    return (SubLObject)inference_tactician_utilities.T;
                }
            }
        }
        return (SubLObject)inference_tactician_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 13262L)
    public static SubLObject under_magic_wand_max_preference_levelP(final SubLObject preference_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return preference_modules.preference_level_LE(preference_level, inference_tactician_utilities.$magic_wand_max_preference_level$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 13421L)
    public static SubLObject tactic_strictly_less_preferred_than_some_siblingP(final SubLObject tactic, final SubLObject strategic_context) {
        final SubLObject tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(inference_datastructures_tactic.tactic_problem(tactic));
        SubLObject sibling_tactic = (SubLObject)inference_tactician_utilities.NIL;
        sibling_tactic = cdolist_list_var.first();
        while (inference_tactician_utilities.NIL != cdolist_list_var) {
            if (inference_tactician_utilities.NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_tactic, (SubLObject)inference_tactician_utilities.$kw25$LOGICAL) && !sibling_tactic.eql(tactic)) {
                final SubLObject sibling_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(sibling_tactic, strategic_context);
                if (inference_tactician_utilities.NIL != preference_modules.preference_level_L(tactic_preference_level, sibling_preference_level)) {
                    return (SubLObject)inference_tactician_utilities.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling_tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_tactician_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 13898L)
    public static SubLObject abductive_magic_wand_tacticP(final SubLObject tactic, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_tactician_utilities.NIL != inference_worker.logical_tactic_p(tactic)) {
            if (inference_tactician_utilities.NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic)) {
                final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
                if (inference_tactician_utilities.NIL != abductive_strategy_chooses_only_abductive_tacticP(lookahead_problem, strategic_context) && inference_tactician_utilities.NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context)) {
                    return (SubLObject)inference_tactician_utilities.T;
                }
            }
            else if (inference_tactician_utilities.NIL != inference_worker_join.join_tactic_p(tactic)) {
                thread.resetMultipleValues();
                final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(tactic);
                final SubLObject second_problem = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (inference_tactician_utilities.NIL != abductive_strategy_chooses_only_abductive_tacticP(first_problem, strategic_context) && inference_tactician_utilities.NIL != abductive_strategy_chooses_only_abductive_tacticP(second_problem, strategic_context) && inference_tactician_utilities.NIL != tactic_strictly_less_preferred_than_some_siblingP(tactic, strategic_context)) {
                    return (SubLObject)inference_tactician_utilities.T;
                }
            }
        }
        return (SubLObject)inference_tactician_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 14778L)
    public static SubLObject abductive_strategy_chooses_only_abductive_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        SubLObject possible_tactics = (SubLObject)inference_tactician_utilities.NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_tactician_utilities.NIL;
        tactic = cdolist_list_var.first();
        while (inference_tactician_utilities.NIL != cdolist_list_var) {
            if (inference_tactician_utilities.NIL != inference_datastructures_tactic.tactic_possibleP(tactic) && inference_tactician_utilities.NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_set_aside_tacticP(strategic_context, tactic, (SubLObject)inference_tactician_utilities.$kw21$REMOVAL) && inference_tactician_utilities.NIL == inference_tactician_strategic_uninterestingness.legacy_strategy_chooses_to_throw_away_tacticP(strategic_context, tactic, (SubLObject)inference_tactician_utilities.$kw21$REMOVAL)) {
                possible_tactics = (SubLObject)ConsesLow.cons(tactic, possible_tactics);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        if (inference_tactician_utilities.NIL != list_utilities.singletonP(possible_tactics) && inference_tactician_utilities.NIL != inference_datastructures_tactic.abductive_tacticP(possible_tactics.first())) {
            return (SubLObject)inference_tactician_utilities.T;
        }
        return (SubLObject)inference_tactician_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 15324L)
    public static SubLObject inference_all_set_asides(final SubLObject inference) {
        assert inference_tactician_utilities.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        return subl_promotions.values2(inference_all_set_aside_problems(inference), inference_all_set_aside_strategems(inference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 15798L)
    public static SubLObject inference_all_set_aside_problems(final SubLObject inference) {
        assert inference_tactician_utilities.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject all_set_aside_problems = set.new_set(Symbols.symbol_function((SubLObject)inference_tactician_utilities.EQ), (SubLObject)inference_tactician_utilities.UNPROVIDED);
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_tactician_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_tactician_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (inference_tactician_utilities.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                set_var_$11 = inference_datastructures_strategy.strategy_set_aside_problems(strategy);
                set_contents_var_$12 = set.do_set_internal(set_var_$11);
                for (basis_object_$13 = set_contents.do_set_contents_basis_object(set_contents_var_$12), state_$14 = (SubLObject)inference_tactician_utilities.NIL, state_$14 = set_contents.do_set_contents_initial_state(basis_object_$13, set_contents_var_$12); inference_tactician_utilities.NIL == set_contents.do_set_contents_doneP(basis_object_$13, state_$14); state_$14 = set_contents.do_set_contents_update_state(state_$14)) {
                    problem = set_contents.do_set_contents_next(basis_object_$13, state_$14);
                    if (inference_tactician_utilities.NIL != set_contents.do_set_contents_element_validP(state_$14, problem)) {
                        set.set_add(problem, all_set_aside_problems);
                    }
                }
            }
        }
        return Sort.sort(set.set_element_list(all_set_aside_problems), Symbols.symbol_function((SubLObject)inference_tactician_utilities.$sym27$_), Symbols.symbol_function((SubLObject)inference_tactician_utilities.$sym28$PROBLEM_SUID));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-tactician-utilities.lisp", position = 16299L)
    public static SubLObject inference_all_set_aside_strategems(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_tactician_utilities.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject all_set_aside_strategems = set.new_set(Symbols.symbol_function((SubLObject)inference_tactician_utilities.EQ), (SubLObject)inference_tactician_utilities.UNPROVIDED);
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_tactician_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_tactician_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (inference_tactician_utilities.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                set_aside_strategem_index = (SubLObject)inference_tactician_utilities.NIL;
                if (inference_tactician_utilities.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy)) {
                    set_aside_strategem_index = transformation_tactician_datastructures.transformation_strategy_problem_strategems_set_aside(strategy);
                }
                else if (inference_tactician_utilities.NIL != removal_tactician.removal_strategy_p(strategy)) {
                    set_aside_strategem_index = removal_tactician_datastructures.removal_strategy_problem_strategems_set_aside(strategy);
                }
                if (inference_tactician_utilities.NIL != set_aside_strategem_index) {
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(set_aside_strategem_index)); inference_tactician_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        strategem_set = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        set_contents_var_$15 = set.do_set_internal(strategem_set);
                        for (basis_object_$16 = set_contents.do_set_contents_basis_object(set_contents_var_$15), state_$17 = (SubLObject)inference_tactician_utilities.NIL, state_$17 = set_contents.do_set_contents_initial_state(basis_object_$16, set_contents_var_$15); inference_tactician_utilities.NIL == set_contents.do_set_contents_doneP(basis_object_$16, state_$17); state_$17 = set_contents.do_set_contents_update_state(state_$17)) {
                            strategem = set_contents.do_set_contents_next(basis_object_$16, state_$17);
                            if (inference_tactician_utilities.NIL != set_contents.do_set_contents_element_validP(state_$17, strategem)) {
                                set.set_add(strategem, all_set_aside_strategems);
                            }
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
            }
        }
        return Sort.sort(set.set_element_list(all_set_aside_strategems), Symbols.symbol_function((SubLObject)inference_tactician_utilities.$sym29$STRATEGEM__), (SubLObject)inference_tactician_utilities.UNPROVIDED);
    }
    
    public static SubLObject declare_inference_tactician_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "memoized_problem_global_preference_level", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "memoized_problem_global_preference_level_int_internal", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "memoized_problem_global_preference_level_int", "MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "problem_global_preference_level", "PROBLEM-GLOBAL-PREFERENCE-LEVEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "problem_global_preference_level_wrt_modules", "PROBLEM-GLOBAL-PREFERENCE-LEVEL-WRT-MODULES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "single_negative_literal_problem_p", "SINGLE-NEGATIVE-LITERAL-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "multi_literal_problem_global_preference_level", "MULTI-LITERAL-PROBLEM-GLOBAL-PREFERENCE-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "multi_literal_problem_tactics_to_activate", "MULTI-LITERAL-PROBLEM-TACTICS-TO-ACTIVATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "problem_has_some_complete_non_thrown_away_removal_tacticP", "PROBLEM-HAS-SOME-COMPLETE-NON-THROWN-AWAY-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "problem_has_no_allowed_or_executed_tactics_wrt_removalP", "PROBLEM-HAS-NO-ALLOWED-OR-EXECUTED-TACTICS-WRT-REMOVAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "removal_unhappiness", "REMOVAL-UNHAPPINESS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "scale_unhappiness", "SCALE-UNHAPPINESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "module_scaling_factor", "MODULE-SCALING-FACTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "preference_scaling_factor", "PREFERENCE-SCALING-FACTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "literal_count_scaling_factor", "LITERAL-COUNT-SCALING-FACTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "strategy_deems_conjunctive_tactic_spec_betterP", "STRATEGY-DEEMS-CONJUNCTIVE-TACTIC-SPEC-BETTER?", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "magic_wand_tacticP", "MAGIC-WAND-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "under_magic_wand_max_preference_levelP", "UNDER-MAGIC-WAND-MAX-PREFERENCE-LEVEL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "tactic_strictly_less_preferred_than_some_siblingP", "TACTIC-STRICTLY-LESS-PREFERRED-THAN-SOME-SIBLING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "abductive_magic_wand_tacticP", "ABDUCTIVE-MAGIC-WAND-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "abductive_strategy_chooses_only_abductive_tacticP", "ABDUCTIVE-STRATEGY-CHOOSES-ONLY-ABDUCTIVE-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "inference_all_set_asides", "INFERENCE-ALL-SET-ASIDES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "inference_all_set_aside_problems", "INFERENCE-ALL-SET-ASIDE-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities", "inference_all_set_aside_strategems", "INFERENCE-ALL-SET-ASIDE-STRATEGEMS", 1, 0, false);
        return (SubLObject)inference_tactician_utilities.NIL;
    }
    
    public static SubLObject init_inference_tactician_utilities_file() {
        inference_tactician_utilities.$set_aside_implies_disallowedP$ = SubLFiles.defparameter("*SET-ASIDE-IMPLIES-DISALLOWED?*", (SubLObject)inference_tactician_utilities.NIL);
        inference_tactician_utilities.$preference_scaling_values$ = SubLFiles.defparameter("*PREFERENCE-SCALING-VALUES*", (SubLObject)inference_tactician_utilities.$list22);
        inference_tactician_utilities.$literal_count_scaling_enabledP$ = SubLFiles.defparameter("*LITERAL-COUNT-SCALING-ENABLED?*", (SubLObject)inference_tactician_utilities.T);
        inference_tactician_utilities.$magic_wand_max_preference_level$ = SubLFiles.defparameter("*MAGIC-WAND-MAX-PREFERENCE-LEVEL*", (SubLObject)inference_tactician_utilities.$kw24$DISPREFERRED);
        return (SubLObject)inference_tactician_utilities.NIL;
    }
    
    public static SubLObject setup_inference_tactician_utilities_file() {
        memoization_state.note_memoized_function((SubLObject)inference_tactician_utilities.$sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT);
        return (SubLObject)inference_tactician_utilities.NIL;
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
        me = (SubLFile)new inference_tactician_utilities();
        inference_tactician_utilities.$set_aside_implies_disallowedP$ = null;
        inference_tactician_utilities.$preference_scaling_values$ = null;
        inference_tactician_utilities.$literal_count_scaling_enabledP$ = null;
        inference_tactician_utilities.$magic_wand_max_preference_level$ = null;
        $sym0$MEMOIZED_PROBLEM_GLOBAL_PREFERENCE_LEVEL_INT = SubLObjectFactory.makeSymbol("MEMOIZED-PROBLEM-GLOBAL-PREFERENCE-LEVEL-INT");
        $sym1$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym2$STRATEGIC_CONTEXT_P = SubLObjectFactory.makeSymbol("STRATEGIC-CONTEXT-P");
        $kw3$GROSSLY_DISPREFERRED = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $str4$removal_is_not_allowed_in_the_pro = SubLObjectFactory.makeString("removal is not allowed in the problem store");
        $kw5$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $str6$problem_is_closed = SubLObjectFactory.makeString("problem is closed");
        $str7$no_variables_have_any_hope_of_get = SubLObjectFactory.makeString("no variables have any hope of getting bound");
        $kw8$DOOMED = SubLObjectFactory.makeKeyword("DOOMED");
        $kw9$DISALLOWED = SubLObjectFactory.makeKeyword("DISALLOWED");
        $str10$CHECK_SENTENCE_SIBLING = SubLObjectFactory.makeString("CHECK-SENTENCE-SIBLING");
        $str11$problem_has_no_removal_allowed_or = SubLObjectFactory.makeString("problem has no removal-allowed or executed tactics");
        $str12$single_negative_literal = SubLObjectFactory.makeString("single negative literal");
        $str13$problem_has_a_complete_non_thrown = SubLObjectFactory.makeString("problem has a complete non-thrown-away removal tactic");
        $str14$problem_has_executed_a_complete_r = SubLObjectFactory.makeString("problem has executed a complete removal tactic");
        $kw15$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $kw16$NEG = SubLObjectFactory.makeKeyword("NEG");
        $str17$unknown = SubLObjectFactory.makeString("unknown");
        $sym18$TRANSFORMATION_TACTIC_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-TACTIC-P");
        $str19$Unexpected_strategy_type__s = SubLObjectFactory.makeString("Unexpected strategy type ~s");
        $kw20$GENERALIZED_REMOVAL = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL");
        $kw21$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"), (SubLObject)inference_tactician_utilities.TWO_INTEGER, (SubLObject)inference_tactician_utilities.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"), (SubLObject)inference_tactician_utilities.TWENTY_INTEGER, (SubLObject)inference_tactician_utilities.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JOIN-ORDERED"), (SubLObject)inference_tactician_utilities.FIVE_INTEGER, (SubLObject)inference_tactician_utilities.ZERO_INTEGER));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("M"), (SubLObject)SubLObjectFactory.makeSymbol("B"));
        $kw24$DISPREFERRED = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $kw25$LOGICAL = SubLObjectFactory.makeKeyword("LOGICAL");
        $sym26$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $sym27$_ = SubLObjectFactory.makeSymbol("<");
        $sym28$PROBLEM_SUID = SubLObjectFactory.makeSymbol("PROBLEM-SUID");
        $sym29$STRATEGEM__ = SubLObjectFactory.makeSymbol("STRATEGEM-<");
    }
}

/*

	Total time: 187 ms
	
*/