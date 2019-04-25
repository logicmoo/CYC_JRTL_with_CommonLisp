package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_lookahead_productivity extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity";
    public static final String myFingerPrint = "7e635c9bf1987771e89d2b8f91eee9136a2570db77be69ded2ab6b45aec791a9";
    private static final SubLSymbol $sym0$MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT;
    private static final SubLSymbol $sym1$_EXIT;
    private static final SubLSymbol $kw2$TACTICAL;
    private static final SubLString $str3$Unexpected_removal_relevant_tacti;
    private static final SubLSymbol $kw4$RELEVANT_TACTICS_WRT_REMOVAL;
    private static final SubLSymbol $kw5$REMOVAL;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 1031L)
    public static SubLObject memoized_problem_max_removal_productivity(final SubLObject problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max_productivity = (SubLObject)inference_lookahead_productivity.NIL;
        SubLObject max_justification = (SubLObject)inference_lookahead_productivity.NIL;
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
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_lookahead_productivity.T, thread);
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
        return subl_promotions.values2(max_productivity, max_justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 1551L)
    public static SubLObject memoized_problem_max_removal_productivity_int_internal(final SubLObject problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem.problem_store(problem));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return problem_max_removal_productivity(problem, strategic_context);
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_lookahead_productivity.T, thread);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 1551L)
    public static SubLObject memoized_problem_max_removal_productivity_int(final SubLObject problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_lookahead_productivity.NIL;
        if (inference_lookahead_productivity.NIL == v_memoization_state) {
            return memoized_problem_max_removal_productivity_int_internal(problem, strategic_context);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_lookahead_productivity.$sym0$MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT, (SubLObject)inference_lookahead_productivity.UNPROVIDED);
        if (inference_lookahead_productivity.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_lookahead_productivity.$sym0$MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT, (SubLObject)inference_lookahead_productivity.TWO_INTEGER, (SubLObject)inference_lookahead_productivity.NIL, (SubLObject)inference_lookahead_productivity.EQ, (SubLObject)inference_lookahead_productivity.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_lookahead_productivity.$sym0$MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(problem, strategic_context);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_lookahead_productivity.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_lookahead_productivity.NIL;
            collision = cdolist_list_var.first();
            while (inference_lookahead_productivity.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (problem.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inference_lookahead_productivity.NIL != cached_args && inference_lookahead_productivity.NIL == cached_args.rest() && strategic_context.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(memoized_problem_max_removal_productivity_int_internal(problem, strategic_context)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(problem, strategic_context));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 1814L)
    public static SubLObject problem_max_removal_productivity(final SubLObject problem, SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_lookahead_productivity.NIL != striping_tactician.striping_tactician_p(strategic_context)) {
            final SubLObject r_strat = striping_tactician.striping_tactician_arbitrary_relevant_removal_substrategy(strategic_context, problem);
            if (inference_lookahead_productivity.NIL != r_strat) {
                strategic_context = r_strat;
            }
            else {
                strategic_context = (SubLObject)inference_lookahead_productivity.$kw2$TACTICAL;
            }
        }
        if (inference_lookahead_productivity.NIL != balancing_tactician.balancing_tactician_p(strategic_context)) {
            strategic_context = balancing_tactician.balancing_tactician_sole_removal_substrategy(strategic_context);
        }
        final SubLObject existing_proof_count = inference_datastructures_problem.problem_proof_count(problem, (SubLObject)inference_lookahead_productivity.UNPROVIDED);
        SubLObject max_productivity;
        final SubLObject productivity_from_existing_proofs = max_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(existing_proof_count);
        SubLObject max_justification = problem;
        SubLObject cdolist_list_var;
        final SubLObject tactics = cdolist_list_var = problem_relevant_tactics_wrt_removal(problem, strategic_context);
        SubLObject tactic = (SubLObject)inference_lookahead_productivity.NIL;
        tactic = cdolist_list_var.first();
        while (inference_lookahead_productivity.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject max_lookahead_productivity = tactic_max_removal_productivity(tactic, strategic_context);
            final SubLObject max_lookahead_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (inference_lookahead_productivity.NIL != inference_datastructures_enumerated_types.productivity_G(max_lookahead_productivity, max_productivity)) {
                max_productivity = max_lookahead_productivity;
                max_justification = max_lookahead_justification;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return subl_promotions.values2(max_productivity, max_justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 3225L)
    public static SubLObject tactic_max_removal_productivity(final SubLObject tactic, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_lookahead_productivity.NIL != inference_worker_removal.generalized_removal_tactic_p(tactic) || inference_lookahead_productivity.NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)) {
            return subl_promotions.values2(inference_datastructures_tactic.tactic_original_productivity(tactic), tactic);
        }
        if (inference_lookahead_productivity.NIL != inference_worker.logical_tactic_with_unique_lookahead_problem_p(tactic)) {
            final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
            return memoized_problem_max_removal_productivity(lookahead_problem, strategic_context);
        }
        if (inference_lookahead_productivity.NIL != inference_worker_join.join_tactic_p(tactic)) {
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
            if (inference_lookahead_productivity.NIL != inference_datastructures_enumerated_types.productivity_G(second_productivity, first_productivity)) {
                return subl_promotions.values2(second_productivity, second_justification);
            }
            return subl_promotions.values2(first_productivity, first_justification);
        }
        else {
            if (inference_lookahead_productivity.NIL != inference_worker_split.meta_split_tactic_p(tactic)) {
                return subl_promotions.values2((SubLObject)inference_lookahead_productivity.ZERO_INTEGER, tactic);
            }
            return Errors.error((SubLObject)inference_lookahead_productivity.$str3$Unexpected_removal_relevant_tacti, tactic);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 4510L)
    public static SubLObject problem_relevant_tactics_wrt_removal(final SubLObject problem, final SubLObject strategic_context) {
        inference_worker.determine_strategic_status_wrt(problem, strategic_context);
        if (inference_lookahead_productivity.$kw2$TACTICAL == strategic_context) {
            return problem_tactically_relevant_tactics_wrt_removal(problem);
        }
        return strategy_relevant_tactics_wrt_removal(strategic_context, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 4845L)
    public static SubLObject strategy_relevant_tactics_wrt_removal(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, (SubLObject)inference_lookahead_productivity.$kw4$RELEVANT_TACTICS_WRT_REMOVAL, problem, (SubLObject)inference_lookahead_productivity.UNPROVIDED, (SubLObject)inference_lookahead_productivity.UNPROVIDED, (SubLObject)inference_lookahead_productivity.UNPROVIDED, (SubLObject)inference_lookahead_productivity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-lookahead-productivity.lisp", position = 4997L)
    public static SubLObject problem_tactically_relevant_tactics_wrt_removal(final SubLObject problem) {
        SubLObject result = (SubLObject)inference_lookahead_productivity.NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_lookahead_productivity.NIL;
        tactic = cdolist_list_var.first();
        while (inference_lookahead_productivity.NIL != cdolist_list_var) {
            if (inference_lookahead_productivity.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, (SubLObject)inference_lookahead_productivity.$kw5$REMOVAL)) {
                result = (SubLObject)ConsesLow.cons(tactic, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return result;
    }
    
    public static SubLObject declare_inference_lookahead_productivity_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity", "memoized_problem_max_removal_productivity", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity", "memoized_problem_max_removal_productivity_int_internal", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity", "memoized_problem_max_removal_productivity_int", "MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity", "problem_max_removal_productivity", "PROBLEM-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity", "tactic_max_removal_productivity", "TACTIC-MAX-REMOVAL-PRODUCTIVITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity", "problem_relevant_tactics_wrt_removal", "PROBLEM-RELEVANT-TACTICS-WRT-REMOVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity", "strategy_relevant_tactics_wrt_removal", "STRATEGY-RELEVANT-TACTICS-WRT-REMOVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity", "problem_tactically_relevant_tactics_wrt_removal", "PROBLEM-TACTICALLY-RELEVANT-TACTICS-WRT-REMOVAL", 1, 0, false);
        return (SubLObject)inference_lookahead_productivity.NIL;
    }
    
    public static SubLObject init_inference_lookahead_productivity_file() {
        return (SubLObject)inference_lookahead_productivity.NIL;
    }
    
    public static SubLObject setup_inference_lookahead_productivity_file() {
        memoization_state.note_memoized_function((SubLObject)inference_lookahead_productivity.$sym0$MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT);
        return (SubLObject)inference_lookahead_productivity.NIL;
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
    
    static {
        me = (SubLFile)new inference_lookahead_productivity();
        $sym0$MEMOIZED_PROBLEM_MAX_REMOVAL_PRODUCTIVITY_INT = SubLObjectFactory.makeSymbol("MEMOIZED-PROBLEM-MAX-REMOVAL-PRODUCTIVITY-INT");
        $sym1$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw2$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $str3$Unexpected_removal_relevant_tacti = SubLObjectFactory.makeString("Unexpected removal-relevant tactic ~S");
        $kw4$RELEVANT_TACTICS_WRT_REMOVAL = SubLObjectFactory.makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL");
        $kw5$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
    }
}

/*

	Total time: 104 ms
	
*/