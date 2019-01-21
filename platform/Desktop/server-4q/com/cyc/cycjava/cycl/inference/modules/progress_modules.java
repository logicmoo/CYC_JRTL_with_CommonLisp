package com.cyc.cycjava.cycl.inference.modules;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class progress_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.progress_modules";
    public static final String myFingerPrint = "81a5fc86f3d77ee370df73b1994e0abcd9791ae2c9266b5bd301a46e9bc29208";
    private static final SubLSymbol $kw0$TACTICAL;
    private static final SubLSymbol $sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$POS;
    private static final SubLSymbol $sym5$VARIABLE_P;
    private static final SubLSymbol $sym6$CONS;
    private static final SubLObject $const7$Thing;
    private static final SubLSymbol $kw8$NOT_FULLY_BOUND;
    private static final SubLSymbol $kw9$FULLY_BOUND;
    private static final SubLSymbol $sym10$TEST_LITERAL_SHARED_VARS_QUA_SUBQUERY;
    private static final SubLSymbol $kw11$TEST;
    private static final SubLSymbol $sym12$SETS_EQUAL_;
    private static final SubLSymbol $kw13$OWNER;
    private static final SubLSymbol $kw14$CLASSES;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$KB;
    private static final SubLSymbol $kw17$FULL;
    private static final SubLSymbol $kw18$WORKING_;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$TEST_STRATEGIC_PROGRESS_WRT_VARS_;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$TEST_COMPUTE_ALL_LITERALS_TOTAL_STRATEGIC_PROGRESS_QUA_SUBQUERY;
    private static final SubLList $list24;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 1266L)
    public static SubLObject compute_join_ordered_link_total_strategic_progress(final SubLObject jo_link, SubLObject strategic_context) {
        if (strategic_context == progress_modules.UNPROVIDED) {
            strategic_context = (SubLObject)progress_modules.$kw0$TACTICAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sibling_total_progress = (SubLObject)progress_modules.NIL;
        final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(inference_datastructures_problem_link.problem_link_supported_problem(jo_link));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                sibling_total_progress = memoized_compute_join_ordered_link_total_strategic_progress_int(jo_link, strategic_context);
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)progress_modules.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return sibling_total_progress;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 1964L)
    public static SubLObject memoized_compute_join_ordered_link_total_strategic_progress_int_internal(final SubLObject jo_link, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sibling_total_progress = (SubLObject)progress_modules.NIL;
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem_link.problem_link_store(jo_link));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link);
                final SubLObject contextualized_clause = inference_datastructures_problem.problem_sole_clause(supported_problem);
                final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
                final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
                final SubLObject focal_query = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem));
                final SubLObject focal_query_wrt_conjunction = bindings.apply_bindings(focal_variable_map, focal_query);
                thread.resetMultipleValues();
                final SubLObject focal_mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(focal_query_wrt_conjunction);
                final SubLObject focal_asent = thread.secondMultipleValue();
                final SubLObject focal_sense = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                sibling_total_progress = compute_literal_total_strategic_progress_qua_subquery(focal_asent, focal_mt, focal_sense, contextualized_clause, strategic_context);
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)progress_modules.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return sibling_total_progress;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 1964L)
    public static SubLObject memoized_compute_join_ordered_link_total_strategic_progress_int(final SubLObject jo_link, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)progress_modules.NIL;
        if (progress_modules.NIL == v_memoization_state) {
            return memoized_compute_join_ordered_link_total_strategic_progress_int_internal(jo_link, strategic_context);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)progress_modules.$sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT, (SubLObject)progress_modules.UNPROVIDED);
        if (progress_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)progress_modules.$sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT, (SubLObject)progress_modules.TWO_INTEGER, (SubLObject)progress_modules.NIL, (SubLObject)progress_modules.EQ, (SubLObject)progress_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)progress_modules.$sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(jo_link, strategic_context);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)progress_modules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)progress_modules.NIL;
            collision = cdolist_list_var.first();
            while (progress_modules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (jo_link.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (progress_modules.NIL != cached_args && progress_modules.NIL == cached_args.rest() && strategic_context.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(memoized_compute_join_ordered_link_total_strategic_progress_int_internal(jo_link, strategic_context)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(jo_link, strategic_context));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 3254L)
    public static SubLObject compute_literal_total_strategic_progress_qua_subquery(final SubLObject focal_asent, final SubLObject focal_mt, final SubLObject focal_sense, final SubLObject contextualized_clause, SubLObject strategic_context) {
        if (strategic_context == progress_modules.UNPROVIDED) {
            strategic_context = (SubLObject)progress_modules.$kw0$TACTICAL;
        }
        final SubLObject focal_shared_vars_wrt_conjunction = literal_shared_vars_qua_subquery(focal_asent, focal_mt, focal_sense, contextualized_clause);
        SubLObject sibling_total_progress = (SubLObject)progress_modules.ZERO_INTEGER;
        SubLObject sibling_sense = (SubLObject)progress_modules.$kw2$NEG;
        SubLObject index_var = (SubLObject)progress_modules.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject contextualized_asent = (SubLObject)progress_modules.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (progress_modules.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject sibling_mt = (SubLObject)progress_modules.NIL;
            SubLObject sibling_asent = (SubLObject)progress_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list3);
            sibling_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list3);
            sibling_asent = current.first();
            current = current.rest();
            if (progress_modules.NIL == current) {
                if (!sibling_asent.equal(focal_asent) || !sibling_mt.equal(focal_mt) || !sibling_sense.equal(focal_sense)) {
                    final SubLObject sibling_shared_vars_wrt_conjunction = literal_shared_vars_qua_subquery(sibling_asent, sibling_mt, sibling_sense, contextualized_clause);
                    if (progress_modules.NIL != strategic_progress_wrt_varsP(sibling_asent, sibling_mt, sibling_sense, sibling_shared_vars_wrt_conjunction, focal_shared_vars_wrt_conjunction, strategic_context)) {
                        sibling_total_progress = Numbers.add(sibling_total_progress, (SubLObject)progress_modules.ONE_INTEGER);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)progress_modules.$list3);
            }
            index_var = Numbers.add(index_var, (SubLObject)progress_modules.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        sibling_sense = (SubLObject)progress_modules.$kw4$POS;
        index_var = (SubLObject)progress_modules.ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        contextualized_asent = (SubLObject)progress_modules.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (progress_modules.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject sibling_mt = (SubLObject)progress_modules.NIL;
            SubLObject sibling_asent = (SubLObject)progress_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list3);
            sibling_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list3);
            sibling_asent = current.first();
            current = current.rest();
            if (progress_modules.NIL == current) {
                if (!sibling_asent.equal(focal_asent) || !sibling_mt.equal(focal_mt) || !sibling_sense.equal(focal_sense)) {
                    final SubLObject sibling_shared_vars_wrt_conjunction = literal_shared_vars_qua_subquery(sibling_asent, sibling_mt, sibling_sense, contextualized_clause);
                    if (progress_modules.NIL != strategic_progress_wrt_varsP(sibling_asent, sibling_mt, sibling_sense, sibling_shared_vars_wrt_conjunction, focal_shared_vars_wrt_conjunction, strategic_context)) {
                        sibling_total_progress = Numbers.add(sibling_total_progress, (SubLObject)progress_modules.ONE_INTEGER);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)progress_modules.$list3);
            }
            index_var = Numbers.add(index_var, (SubLObject)progress_modules.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        return sibling_total_progress;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 4329L)
    public static SubLObject literal_shared_vars_qua_subquery(final SubLObject asent, final SubLObject mt, final SubLObject sense, final SubLObject contextualized_clause) {
        final SubLObject asent_vars = list_utilities.tree_gather(asent, Symbols.symbol_function((SubLObject)progress_modules.$sym5$VARIABLE_P), (SubLObject)progress_modules.UNPROVIDED, (SubLObject)progress_modules.UNPROVIDED, (SubLObject)progress_modules.UNPROVIDED);
        final SubLObject v_mt_vars = list_utilities.tree_gather(mt, Symbols.symbol_function((SubLObject)progress_modules.$sym5$VARIABLE_P), (SubLObject)progress_modules.UNPROVIDED, (SubLObject)progress_modules.UNPROVIDED, (SubLObject)progress_modules.UNPROVIDED);
        final SubLObject literal_vars = conses_high.nunion(asent_vars, v_mt_vars, (SubLObject)progress_modules.UNPROVIDED, (SubLObject)progress_modules.UNPROVIDED);
        SubLObject shared_vars = (SubLObject)progress_modules.NIL;
        SubLObject cdolist_list_var = literal_vars;
        SubLObject literal_var = (SubLObject)progress_modules.NIL;
        literal_var = cdolist_list_var.first();
        while (progress_modules.NIL != cdolist_list_var) {
            SubLObject sharedP = (SubLObject)progress_modules.NIL;
            SubLObject sibling_sense = (SubLObject)progress_modules.$kw2$NEG;
            SubLObject index_var = (SubLObject)progress_modules.ZERO_INTEGER;
            SubLObject rest;
            SubLObject contextualized_asent;
            SubLObject current;
            SubLObject datum;
            SubLObject sibling_mt;
            SubLObject sibling_asent;
            for (rest = (SubLObject)progress_modules.NIL, rest = clauses.neg_lits(contextualized_clause); progress_modules.NIL == sharedP && progress_modules.NIL != rest; rest = rest.rest()) {
                contextualized_asent = rest.first();
                datum = (current = contextualized_asent);
                sibling_mt = (SubLObject)progress_modules.NIL;
                sibling_asent = (SubLObject)progress_modules.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list3);
                sibling_mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list3);
                sibling_asent = current.first();
                current = current.rest();
                if (progress_modules.NIL == current) {
                    if ((!sibling_asent.equal(asent) || !sibling_mt.equal(mt) || !sibling_sense.equal(sense)) && (progress_modules.NIL != list_utilities.simple_tree_find(literal_var, sibling_asent) || progress_modules.NIL != list_utilities.simple_tree_find(literal_var, sibling_mt))) {
                        sharedP = (SubLObject)progress_modules.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)progress_modules.$list3);
                }
                index_var = Numbers.add(index_var, (SubLObject)progress_modules.ONE_INTEGER);
            }
            sibling_sense = (SubLObject)progress_modules.$kw4$POS;
            index_var = (SubLObject)progress_modules.ZERO_INTEGER;
            for (rest = (SubLObject)progress_modules.NIL, rest = clauses.pos_lits(contextualized_clause); progress_modules.NIL == sharedP && progress_modules.NIL != rest; rest = rest.rest()) {
                contextualized_asent = rest.first();
                datum = (current = contextualized_asent);
                sibling_mt = (SubLObject)progress_modules.NIL;
                sibling_asent = (SubLObject)progress_modules.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list3);
                sibling_mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list3);
                sibling_asent = current.first();
                current = current.rest();
                if (progress_modules.NIL == current) {
                    if ((!sibling_asent.equal(asent) || !sibling_mt.equal(mt) || !sibling_sense.equal(sense)) && (progress_modules.NIL != list_utilities.simple_tree_find(literal_var, sibling_asent) || progress_modules.NIL != list_utilities.simple_tree_find(literal_var, sibling_mt))) {
                        sharedP = (SubLObject)progress_modules.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)progress_modules.$list3);
                }
                index_var = Numbers.add(index_var, (SubLObject)progress_modules.ONE_INTEGER);
            }
            if (progress_modules.NIL != sharedP) {
                shared_vars = (SubLObject)ConsesLow.cons(literal_var, shared_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal_var = cdolist_list_var.first();
        }
        final SubLObject canonical_shared_vars = inference_worker_join_ordered.canonicalize_hl_variable_list(shared_vars);
        return canonical_shared_vars;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 5517L)
    public static SubLObject strategic_progress_wrt_varsP(final SubLObject asent, final SubLObject mt, final SubLObject sense, final SubLObject shared_vars, final SubLObject lookahead_vars, SubLObject strategic_context) {
        if (strategic_context == progress_modules.UNPROVIDED) {
            strategic_context = (SubLObject)progress_modules.$kw0$TACTICAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lookahead_bindings = Mapping.mapcar(Symbols.symbol_function((SubLObject)progress_modules.$sym6$CONS), lookahead_vars, new SubLObject[] { ConsesLow.make_list(Sequences.length(lookahead_vars), progress_modules.$const7$Thing) });
        final SubLObject lookahead_asent = bindings.apply_bindings(lookahead_bindings, asent);
        if (progress_modules.NIL != variables.fully_bound_p(lookahead_asent) && progress_modules.NIL == variables.fully_bound_p(asent)) {
            return Values.values((SubLObject)progress_modules.T, (SubLObject)progress_modules.$kw8$NOT_FULLY_BOUND, (SubLObject)progress_modules.$kw9$FULLY_BOUND);
        }
        SubLObject baseline_preference = (SubLObject)progress_modules.NIL;
        SubLObject lookahead_preference = (SubLObject)progress_modules.NIL;
        SubLObject progressP = (SubLObject)progress_modules.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            baseline_preference = preference_modules.literal_preference_level_wrt_modules(asent, sense, shared_vars, strategic_context);
            lookahead_preference = preference_modules.literal_preference_level_wrt_modules(lookahead_asent, sense, shared_vars, strategic_context);
            progressP = preference_modules.preference_level_L(baseline_preference, lookahead_preference);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(progressP, baseline_preference, lookahead_preference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 6927L)
    public static SubLObject test_literal_shared_vars_qua_subquery(SubLObject asent, SubLObject mt, final SubLObject sense, SubLObject contextualized_clause) {
        asent = variables.canonicalize_default_el_vars(asent);
        mt = variables.canonicalize_default_el_vars(mt);
        contextualized_clause = variables.canonicalize_default_el_vars(contextualized_clause);
        final SubLObject shared_vars = literal_shared_vars_qua_subquery(asent, mt, sense, contextualized_clause);
        return variables.uncanonicalize_hl_vars(shared_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 6927L)
    public static SubLObject test_strategic_progress_wrt_varsP(SubLObject asent, SubLObject mt, final SubLObject sense, SubLObject shared_vars, SubLObject lookahead_vars) {
        asent = variables.canonicalize_default_el_vars(asent);
        mt = variables.canonicalize_default_el_vars(mt);
        shared_vars = variables.canonicalize_default_el_vars(shared_vars);
        lookahead_vars = variables.canonicalize_default_el_vars(lookahead_vars);
        return Values.values(strategic_progress_wrt_varsP(asent, mt, sense, shared_vars, lookahead_vars, (SubLObject)progress_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 6927L)
    public static SubLObject test_compute_all_literals_total_strategic_progress_qua_subquery(SubLObject contextualized_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        contextualized_clause = variables.canonicalize_default_el_vars(contextualized_clause);
        SubLObject all_progress_counts = (SubLObject)progress_modules.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)progress_modules.UNPROVIDED, (SubLObject)progress_modules.UNPROVIDED, (SubLObject)progress_modules.UNPROVIDED, (SubLObject)progress_modules.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject focal_sense = (SubLObject)progress_modules.$kw2$NEG;
                SubLObject index_var = (SubLObject)progress_modules.ZERO_INTEGER;
                SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
                SubLObject contextualized_asent = (SubLObject)progress_modules.NIL;
                contextualized_asent = cdolist_list_var.first();
                while (progress_modules.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject focal_mt = (SubLObject)progress_modules.NIL;
                    SubLObject focal_asent = (SubLObject)progress_modules.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list22);
                    focal_mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list22);
                    focal_asent = current.first();
                    current = current.rest();
                    if (progress_modules.NIL == current) {
                        final SubLObject sibling_total_progress = compute_literal_total_strategic_progress_qua_subquery(focal_asent, focal_mt, focal_sense, contextualized_clause, (SubLObject)progress_modules.UNPROVIDED);
                        all_progress_counts = (SubLObject)ConsesLow.cons(sibling_total_progress, all_progress_counts);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)progress_modules.$list22);
                    }
                    index_var = Numbers.add(index_var, (SubLObject)progress_modules.ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    contextualized_asent = cdolist_list_var.first();
                }
                focal_sense = (SubLObject)progress_modules.$kw4$POS;
                index_var = (SubLObject)progress_modules.ZERO_INTEGER;
                cdolist_list_var = clauses.pos_lits(contextualized_clause);
                contextualized_asent = (SubLObject)progress_modules.NIL;
                contextualized_asent = cdolist_list_var.first();
                while (progress_modules.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject focal_mt = (SubLObject)progress_modules.NIL;
                    SubLObject focal_asent = (SubLObject)progress_modules.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list22);
                    focal_mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)progress_modules.$list22);
                    focal_asent = current.first();
                    current = current.rest();
                    if (progress_modules.NIL == current) {
                        final SubLObject sibling_total_progress = compute_literal_total_strategic_progress_qua_subquery(focal_asent, focal_mt, focal_sense, contextualized_clause, (SubLObject)progress_modules.UNPROVIDED);
                        all_progress_counts = (SubLObject)ConsesLow.cons(sibling_total_progress, all_progress_counts);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)progress_modules.$list22);
                    }
                    index_var = Numbers.add(index_var, (SubLObject)progress_modules.ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    contextualized_asent = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)progress_modules.T, thread);
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
        return Sequences.nreverse(all_progress_counts);
    }
    
    public static SubLObject declare_progress_modules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.progress_modules", "compute_join_ordered_link_total_strategic_progress", "COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.progress_modules", "memoized_compute_join_ordered_link_total_strategic_progress_int_internal", "MEMOIZED-COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.progress_modules", "memoized_compute_join_ordered_link_total_strategic_progress_int", "MEMOIZED-COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.progress_modules", "compute_literal_total_strategic_progress_qua_subquery", "COMPUTE-LITERAL-TOTAL-STRATEGIC-PROGRESS-QUA-SUBQUERY", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.progress_modules", "literal_shared_vars_qua_subquery", "LITERAL-SHARED-VARS-QUA-SUBQUERY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.progress_modules", "strategic_progress_wrt_varsP", "STRATEGIC-PROGRESS-WRT-VARS?", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.progress_modules", "test_literal_shared_vars_qua_subquery", "TEST-LITERAL-SHARED-VARS-QUA-SUBQUERY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.progress_modules", "test_strategic_progress_wrt_varsP", "TEST-STRATEGIC-PROGRESS-WRT-VARS?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.progress_modules", "test_compute_all_literals_total_strategic_progress_qua_subquery", "TEST-COMPUTE-ALL-LITERALS-TOTAL-STRATEGIC-PROGRESS-QUA-SUBQUERY", 1, 0, false);
        return (SubLObject)progress_modules.NIL;
    }
    
    public static SubLObject init_progress_modules_file() {
        return (SubLObject)progress_modules.NIL;
    }
    
    public static SubLObject setup_progress_modules_file() {
        memoization_state.note_memoized_function((SubLObject)progress_modules.$sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT);
        generic_testing.define_test_case_table_int((SubLObject)progress_modules.$sym10$TEST_LITERAL_SHARED_VARS_QUA_SUBQUERY, (SubLObject)ConsesLow.list(new SubLObject[] { progress_modules.$kw11$TEST, progress_modules.$sym12$SETS_EQUAL_, progress_modules.$kw13$OWNER, progress_modules.NIL, progress_modules.$kw14$CLASSES, progress_modules.$list15, progress_modules.$kw16$KB, progress_modules.$kw17$FULL, progress_modules.$kw18$WORKING_, progress_modules.T }), (SubLObject)progress_modules.$list19);
        generic_testing.define_test_case_table_int((SubLObject)progress_modules.$sym20$TEST_STRATEGIC_PROGRESS_WRT_VARS_, (SubLObject)ConsesLow.list(new SubLObject[] { progress_modules.$kw11$TEST, Symbols.symbol_function((SubLObject)progress_modules.EQ), progress_modules.$kw13$OWNER, progress_modules.NIL, progress_modules.$kw14$CLASSES, progress_modules.$list15, progress_modules.$kw16$KB, progress_modules.$kw17$FULL, progress_modules.$kw18$WORKING_, progress_modules.T }), (SubLObject)progress_modules.$list21);
        generic_testing.define_test_case_table_int((SubLObject)progress_modules.$sym23$TEST_COMPUTE_ALL_LITERALS_TOTAL_STRATEGIC_PROGRESS_QUA_SUBQUERY, (SubLObject)ConsesLow.list(new SubLObject[] { progress_modules.$kw11$TEST, Symbols.symbol_function((SubLObject)progress_modules.EQUAL), progress_modules.$kw13$OWNER, progress_modules.NIL, progress_modules.$kw14$CLASSES, progress_modules.$list15, progress_modules.$kw16$KB, progress_modules.$kw17$FULL, progress_modules.$kw18$WORKING_, progress_modules.T }), (SubLObject)progress_modules.$list24);
        return (SubLObject)progress_modules.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_progress_modules_file();
    }
    
    @Override
	public void initializeVariables() {
        init_progress_modules_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_progress_modules_file();
    }
    
    static {
        me = (SubLFile)new progress_modules();
        $kw0$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT = SubLObjectFactory.makeSymbol("MEMOIZED-COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS-INT");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIBLING-MT"), (SubLObject)SubLObjectFactory.makeSymbol("SIBLING-ASENT"));
        $kw4$POS = SubLObjectFactory.makeKeyword("POS");
        $sym5$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym6$CONS = SubLObjectFactory.makeSymbol("CONS");
        $const7$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $kw8$NOT_FULLY_BOUND = SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND");
        $kw9$FULLY_BOUND = SubLObjectFactory.makeKeyword("FULLY-BOUND");
        $sym10$TEST_LITERAL_SHARED_VARS_QUA_SUBQUERY = SubLObjectFactory.makeSymbol("TEST-LITERAL-SHARED-VARS-QUA-SUBQUERY");
        $kw11$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym12$SETS_EQUAL_ = SubLObjectFactory.makeSymbol("SETS-EQUAL?");
        $kw13$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw14$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MODULES"));
        $kw16$KB = SubLObjectFactory.makeKeyword("KB");
        $kw17$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw18$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApplicationContext")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)progress_modules.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApplicationContext"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsAfterEndingOf")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1990)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsAfterEndingOf")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1990))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)progress_modules.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApplicationContext"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsAfterEndingOf")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1990)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)progress_modules.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApplicationContext"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsAfterEndingOf")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1990)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)progress_modules.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApplicationContext"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsAfterEndingOf")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1990)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))));
        $sym20$TEST_STRATEGIC_PROGRESS_WRT_VARS_ = SubLObjectFactory.makeSymbol("TEST-STRATEGIC-PROGRESS-WRT-VARS?");
        $list21 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApplicationContext")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))), (SubLObject)progress_modules.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApplicationContext")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"))), (SubLObject)progress_modules.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApplicationContext")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))), (SubLObject)progress_modules.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsAfterEndingOf")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1990))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"))), (SubLObject)progress_modules.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsAfterEndingOf")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1990))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"))), (SubLObject)progress_modules.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsAfterEndingOf")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1990))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))), (SubLObject)progress_modules.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"))), (SubLObject)progress_modules.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))), (SubLObject)progress_modules.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))), (SubLObject)progress_modules.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"))), (SubLObject)progress_modules.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR2"))), (SubLObject)progress_modules.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"))), (SubLObject)progress_modules.T) });
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCAL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("FOCAL-ASENT"));
        $sym23$TEST_COMPUTE_ALL_LITERALS_TOTAL_STRATEGIC_PROGRESS_QUA_SUBQUERY = SubLObjectFactory.makeSymbol("TEST-COMPUTE-ALL-LITERALS-TOTAL-STRATEGIC-PROGRESS-QUA-SUBQUERY");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)progress_modules.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Asserted")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ApplicationContext"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsAfterEndingOf")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1990)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR3"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)SubLObjectFactory.makeSymbol("?VAR0"), (SubLObject)SubLObjectFactory.makeSymbol("?VAR2")))))), (SubLObject)ConsesLow.list((SubLObject)progress_modules.TWO_INTEGER, (SubLObject)progress_modules.ZERO_INTEGER, (SubLObject)progress_modules.ONE_INTEGER, (SubLObject)progress_modules.TWO_INTEGER)));
    }
}

/*

	Total time: 153 ms
	
*/