package com.cyc.cycjava.cycl.inference.modules;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class progress_modules extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new progress_modules();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.modules.progress_modules";




    private static final SubLSymbol MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT = makeSymbol("MEMOIZED-COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS-INT");



    private static final SubLList $list3 = list(makeSymbol("SIBLING-MT"), makeSymbol("SIBLING-ASENT"));







    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLSymbol $NOT_FULLY_BOUND = makeKeyword("NOT-FULLY-BOUND");



    private static final SubLSymbol TEST_LITERAL_SHARED_VARS_QUA_SUBQUERY = makeSymbol("TEST-LITERAL-SHARED-VARS-QUA-SUBQUERY");



    private static final SubLSymbol $sym12$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");





    private static final SubLList $list15 = list(makeKeyword("PROGRESS-MODULES"));







    private static final SubLList $list19 = list(list(list(list(reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?VAR0"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR1"), reader_make_constant_shell(makeString("ApplicationContext")))), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(NIL, list(list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?VAR0"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR1"), reader_make_constant_shell(makeString("ApplicationContext"))))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeSymbol("?VAR2"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1990)))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("mtMonad")), makeSymbol("?VAR0"), makeSymbol("?VAR3"))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("mtTimeIndex")), makeSymbol("?VAR0"), makeSymbol("?VAR2")))))), list(makeSymbol("?VAR0"))), list(list(list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeSymbol("?VAR2"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1990))), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(NIL, list(list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?VAR0"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR1"), reader_make_constant_shell(makeString("ApplicationContext"))))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeSymbol("?VAR2"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1990)))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("mtMonad")), makeSymbol("?VAR0"), makeSymbol("?VAR3"))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("mtTimeIndex")), makeSymbol("?VAR0"), makeSymbol("?VAR2")))))), list(makeSymbol("?VAR2"))), list(list(list(reader_make_constant_shell(makeString("mtMonad")), makeSymbol("?VAR0"), makeSymbol("?VAR3")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(NIL, list(list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?VAR0"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR1"), reader_make_constant_shell(makeString("ApplicationContext"))))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeSymbol("?VAR2"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1990)))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("mtMonad")), makeSymbol("?VAR0"), makeSymbol("?VAR3"))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("mtTimeIndex")), makeSymbol("?VAR0"), makeSymbol("?VAR2")))))), list(makeSymbol("?VAR0"))), list(list(list(reader_make_constant_shell(makeString("mtTimeIndex")), makeSymbol("?VAR0"), makeSymbol("?VAR2")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(NIL, list(list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?VAR0"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR1"), reader_make_constant_shell(makeString("ApplicationContext"))))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeSymbol("?VAR2"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1990)))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("mtMonad")), makeSymbol("?VAR0"), makeSymbol("?VAR3"))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("mtTimeIndex")), makeSymbol("?VAR0"), makeSymbol("?VAR2")))))), list(makeSymbol("?VAR0"), makeSymbol("?VAR2"))));

    private static final SubLSymbol $sym20$TEST_STRATEGIC_PROGRESS_WRT_VARS_ = makeSymbol("TEST-STRATEGIC-PROGRESS-WRT-VARS?");

    private static final SubLList $list21 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?VAR0"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR1"), reader_make_constant_shell(makeString("ApplicationContext")))), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR0")), list(makeSymbol("?VAR2"))), NIL), list(list(list(reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?VAR0"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR1"), reader_make_constant_shell(makeString("ApplicationContext")))), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR0")), list(makeSymbol("?VAR0"), makeSymbol("?VAR3"))), NIL), list(list(list(reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?VAR0"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR1"), reader_make_constant_shell(makeString("ApplicationContext")))), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR0")), list(makeSymbol("?VAR0"), makeSymbol("?VAR2"))), NIL), list(list(list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeSymbol("?VAR2"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1990))), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR2")), list(makeSymbol("?VAR0"), makeSymbol("?VAR1"))), NIL), list(list(list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeSymbol("?VAR2"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1990))), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR2")), list(makeSymbol("?VAR0"), makeSymbol("?VAR3"))), NIL), list(list(list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeSymbol("?VAR2"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1990))), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR2")), list(makeSymbol("?VAR0"), makeSymbol("?VAR2"))), T), list(list(list(reader_make_constant_shell(makeString("mtMonad")), makeSymbol("?VAR0"), makeSymbol("?VAR3")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR0")), list(makeSymbol("?VAR0"), makeSymbol("?VAR1"))), T), list(list(list(reader_make_constant_shell(makeString("mtMonad")), makeSymbol("?VAR0"), makeSymbol("?VAR3")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR0")), list(makeSymbol("?VAR2"))), NIL), list(list(list(reader_make_constant_shell(makeString("mtMonad")), makeSymbol("?VAR0"), makeSymbol("?VAR3")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR0")), list(makeSymbol("?VAR0"), makeSymbol("?VAR2"))), T), list(list(list(reader_make_constant_shell(makeString("mtTimeIndex")), makeSymbol("?VAR0"), makeSymbol("?VAR2")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR0"), makeSymbol("?VAR2")), list(makeSymbol("?VAR0"), makeSymbol("?VAR1"))), T), list(list(list(reader_make_constant_shell(makeString("mtTimeIndex")), makeSymbol("?VAR0"), makeSymbol("?VAR2")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR0"), makeSymbol("?VAR2")), list(makeSymbol("?VAR2"))), NIL), list(list(list(reader_make_constant_shell(makeString("mtTimeIndex")), makeSymbol("?VAR0"), makeSymbol("?VAR2")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), makeKeyword("POS"), list(makeSymbol("?VAR0"), makeSymbol("?VAR2")), list(makeSymbol("?VAR0"), makeSymbol("?VAR3"))), T) });

    private static final SubLList $list22 = list(makeSymbol("FOCAL-MT"), makeSymbol("FOCAL-ASENT"));

    private static final SubLSymbol TEST_COMPUTE_ALL_LITERALS_TOTAL_STRATEGIC_PROGRESS_QUA_SUBQUERY = makeSymbol("TEST-COMPUTE-ALL-LITERALS-TOTAL-STRATEGIC-PROGRESS-QUA-SUBQUERY");

    private static final SubLList $list24 = list(list(list(list(NIL, list(list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("ist-Asserted")), makeSymbol("?VAR0"), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR1"), reader_make_constant_shell(makeString("ApplicationContext"))))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("endsAfterEndingOf")), makeSymbol("?VAR2"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1990)))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("mtMonad")), makeSymbol("?VAR0"), makeSymbol("?VAR3"))), list(reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("mtTimeIndex")), makeSymbol("?VAR0"), makeSymbol("?VAR2")))))), list(TWO_INTEGER, ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER)));

    public static SubLObject compute_join_ordered_link_total_strategic_progress(final SubLObject jo_link, SubLObject strategic_context) {
        if (strategic_context == UNPROVIDED) {
            strategic_context = $TACTICAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sibling_total_progress = NIL;
        final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(inference_datastructures_problem_link.problem_link_supported_problem(jo_link));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                sibling_total_progress = memoized_compute_join_ordered_link_total_strategic_progress_int(jo_link, strategic_context);
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return sibling_total_progress;
    }

    public static SubLObject memoized_compute_join_ordered_link_total_strategic_progress_int_internal(final SubLObject jo_link, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sibling_total_progress = NIL;
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
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return sibling_total_progress;
    }

    public static SubLObject memoized_compute_join_ordered_link_total_strategic_progress_int(final SubLObject jo_link, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_compute_join_ordered_link_total_strategic_progress_int_internal(jo_link, strategic_context);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(jo_link, strategic_context);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (jo_link.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && strategic_context.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_compute_join_ordered_link_total_strategic_progress_int_internal(jo_link, strategic_context)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(jo_link, strategic_context));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject compute_literal_total_strategic_progress_qua_subquery(final SubLObject focal_asent, final SubLObject focal_mt, final SubLObject focal_sense, final SubLObject contextualized_clause, SubLObject strategic_context) {
        if (strategic_context == UNPROVIDED) {
            strategic_context = $TACTICAL;
        }
        final SubLObject focal_shared_vars_wrt_conjunction = literal_shared_vars_qua_subquery(focal_asent, focal_mt, focal_sense, contextualized_clause);
        SubLObject sibling_total_progress = ZERO_INTEGER;
        SubLObject sibling_sense = $NEG;
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject sibling_mt = NIL;
            SubLObject sibling_asent = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            sibling_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            sibling_asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (((!sibling_asent.equal(focal_asent)) || (!sibling_mt.equal(focal_mt))) || (!sibling_sense.equal(focal_sense))) {
                    final SubLObject sibling_shared_vars_wrt_conjunction = literal_shared_vars_qua_subquery(sibling_asent, sibling_mt, sibling_sense, contextualized_clause);
                    if (NIL != strategic_progress_wrt_varsP(sibling_asent, sibling_mt, sibling_sense, sibling_shared_vars_wrt_conjunction, focal_shared_vars_wrt_conjunction, strategic_context)) {
                        sibling_total_progress = add(sibling_total_progress, ONE_INTEGER);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        sibling_sense = $POS;
        index_var = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject sibling_mt = NIL;
            SubLObject sibling_asent = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            sibling_mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            sibling_asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (((!sibling_asent.equal(focal_asent)) || (!sibling_mt.equal(focal_mt))) || (!sibling_sense.equal(focal_sense))) {
                    final SubLObject sibling_shared_vars_wrt_conjunction = literal_shared_vars_qua_subquery(sibling_asent, sibling_mt, sibling_sense, contextualized_clause);
                    if (NIL != strategic_progress_wrt_varsP(sibling_asent, sibling_mt, sibling_sense, sibling_shared_vars_wrt_conjunction, focal_shared_vars_wrt_conjunction, strategic_context)) {
                        sibling_total_progress = add(sibling_total_progress, ONE_INTEGER);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        return sibling_total_progress;
    }

    public static SubLObject literal_shared_vars_qua_subquery(final SubLObject asent, final SubLObject mt, final SubLObject sense, final SubLObject contextualized_clause) {
        final SubLObject asent_vars = list_utilities.tree_gather(asent, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject v_mt_vars = list_utilities.tree_gather(mt, symbol_function(VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject literal_vars = nunion(asent_vars, v_mt_vars, UNPROVIDED, UNPROVIDED);
        SubLObject shared_vars = NIL;
        SubLObject cdolist_list_var = literal_vars;
        SubLObject literal_var = NIL;
        literal_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sharedP = NIL;
            SubLObject sibling_sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject rest;
            SubLObject contextualized_asent;
            SubLObject current;
            SubLObject datum;
            SubLObject sibling_mt;
            SubLObject sibling_asent;
            for (rest = NIL, rest = clauses.neg_lits(contextualized_clause); (NIL == sharedP) && (NIL != rest); rest = rest.rest()) {
                contextualized_asent = rest.first();
                datum = current = contextualized_asent;
                sibling_mt = NIL;
                sibling_asent = NIL;
                destructuring_bind_must_consp(current, datum, $list3);
                sibling_mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list3);
                sibling_asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((((!sibling_asent.equal(asent)) || (!sibling_mt.equal(mt))) || (!sibling_sense.equal(sense))) && ((NIL != list_utilities.simple_tree_find(literal_var, sibling_asent)) || (NIL != list_utilities.simple_tree_find(literal_var, sibling_mt)))) {
                        sharedP = T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list3);
                }
                index_var = add(index_var, ONE_INTEGER);
            }
            sibling_sense = $POS;
            index_var = ZERO_INTEGER;
            for (rest = NIL, rest = clauses.pos_lits(contextualized_clause); (NIL == sharedP) && (NIL != rest); rest = rest.rest()) {
                contextualized_asent = rest.first();
                datum = current = contextualized_asent;
                sibling_mt = NIL;
                sibling_asent = NIL;
                destructuring_bind_must_consp(current, datum, $list3);
                sibling_mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list3);
                sibling_asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((((!sibling_asent.equal(asent)) || (!sibling_mt.equal(mt))) || (!sibling_sense.equal(sense))) && ((NIL != list_utilities.simple_tree_find(literal_var, sibling_asent)) || (NIL != list_utilities.simple_tree_find(literal_var, sibling_mt)))) {
                        sharedP = T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list3);
                }
                index_var = add(index_var, ONE_INTEGER);
            }
            if (NIL != sharedP) {
                shared_vars = cons(literal_var, shared_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal_var = cdolist_list_var.first();
        } 
        final SubLObject canonical_shared_vars = inference_worker_join_ordered.canonicalize_hl_variable_list(shared_vars);
        return canonical_shared_vars;
    }

    public static SubLObject strategic_progress_wrt_varsP(final SubLObject asent, final SubLObject mt, final SubLObject sense, final SubLObject shared_vars, final SubLObject lookahead_vars, SubLObject strategic_context) {
        if (strategic_context == UNPROVIDED) {
            strategic_context = $TACTICAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lookahead_bindings = Mapping.mapcar(symbol_function(CONS), lookahead_vars, new SubLObject[]{ make_list(length(lookahead_vars), $$Thing) });
        final SubLObject lookahead_asent = bindings.apply_bindings(lookahead_bindings, asent);
        if ((NIL != variables.fully_bound_p(lookahead_asent)) && (NIL == variables.fully_bound_p(asent))) {
            return values(T, $NOT_FULLY_BOUND, $FULLY_BOUND);
        }
        SubLObject baseline_preference = NIL;
        SubLObject lookahead_preference = NIL;
        SubLObject progressP = NIL;
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
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(progressP, baseline_preference, lookahead_preference);
    }

    public static SubLObject test_literal_shared_vars_qua_subquery(SubLObject asent, SubLObject mt, final SubLObject sense, SubLObject contextualized_clause) {
        asent = variables.canonicalize_default_el_vars(asent);
        mt = variables.canonicalize_default_el_vars(mt);
        contextualized_clause = variables.canonicalize_default_el_vars(contextualized_clause);
        final SubLObject shared_vars = literal_shared_vars_qua_subquery(asent, mt, sense, contextualized_clause);
        return variables.uncanonicalize_hl_vars(shared_vars);
    }

    public static SubLObject test_strategic_progress_wrt_varsP(SubLObject asent, SubLObject mt, final SubLObject sense, SubLObject shared_vars, SubLObject lookahead_vars) {
        asent = variables.canonicalize_default_el_vars(asent);
        mt = variables.canonicalize_default_el_vars(mt);
        shared_vars = variables.canonicalize_default_el_vars(shared_vars);
        lookahead_vars = variables.canonicalize_default_el_vars(lookahead_vars);
        return values(strategic_progress_wrt_varsP(asent, mt, sense, shared_vars, lookahead_vars, UNPROVIDED));
    }

    public static SubLObject test_compute_all_literals_total_strategic_progress_qua_subquery(SubLObject contextualized_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        contextualized_clause = variables.canonicalize_default_el_vars(contextualized_clause);
        SubLObject all_progress_counts = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject focal_sense = $NEG;
                SubLObject index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
                SubLObject contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject focal_mt = NIL;
                    SubLObject focal_asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list22);
                    focal_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list22);
                    focal_asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject sibling_total_progress = compute_literal_total_strategic_progress_qua_subquery(focal_asent, focal_mt, focal_sense, contextualized_clause, UNPROVIDED);
                        all_progress_counts = cons(sibling_total_progress, all_progress_counts);
                    } else {
                        cdestructuring_bind_error(datum, $list22);
                    }
                    index_var = add(index_var, ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    contextualized_asent = cdolist_list_var.first();
                } 
                focal_sense = $POS;
                index_var = ZERO_INTEGER;
                cdolist_list_var = clauses.pos_lits(contextualized_clause);
                contextualized_asent = NIL;
                contextualized_asent = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = contextualized_asent;
                    SubLObject focal_mt = NIL;
                    SubLObject focal_asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list22);
                    focal_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list22);
                    focal_asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject sibling_total_progress = compute_literal_total_strategic_progress_qua_subquery(focal_asent, focal_mt, focal_sense, contextualized_clause, UNPROVIDED);
                        all_progress_counts = cons(sibling_total_progress, all_progress_counts);
                    } else {
                        cdestructuring_bind_error(datum, $list22);
                    }
                    index_var = add(index_var, ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    contextualized_asent = cdolist_list_var.first();
                } 
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
        return nreverse(all_progress_counts);
    }

    public static SubLObject declare_progress_modules_file() {
        declareFunction("compute_join_ordered_link_total_strategic_progress", "COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS", 1, 1, false);
        declareFunction("memoized_compute_join_ordered_link_total_strategic_progress_int_internal", "MEMOIZED-COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS-INT-INTERNAL", 2, 0, false);
        declareFunction("memoized_compute_join_ordered_link_total_strategic_progress_int", "MEMOIZED-COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS-INT", 2, 0, false);
        declareFunction("compute_literal_total_strategic_progress_qua_subquery", "COMPUTE-LITERAL-TOTAL-STRATEGIC-PROGRESS-QUA-SUBQUERY", 4, 1, false);
        declareFunction("literal_shared_vars_qua_subquery", "LITERAL-SHARED-VARS-QUA-SUBQUERY", 4, 0, false);
        declareFunction("strategic_progress_wrt_varsP", "STRATEGIC-PROGRESS-WRT-VARS?", 5, 1, false);
        declareFunction("test_literal_shared_vars_qua_subquery", "TEST-LITERAL-SHARED-VARS-QUA-SUBQUERY", 4, 0, false);
        declareFunction("test_strategic_progress_wrt_varsP", "TEST-STRATEGIC-PROGRESS-WRT-VARS?", 5, 0, false);
        declareFunction("test_compute_all_literals_total_strategic_progress_qua_subquery", "TEST-COMPUTE-ALL-LITERALS-TOTAL-STRATEGIC-PROGRESS-QUA-SUBQUERY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_progress_modules_file() {
        return NIL;
    }

    public static SubLObject setup_progress_modules_file() {
        memoization_state.note_memoized_function(MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT);
        define_test_case_table_int(TEST_LITERAL_SHARED_VARS_QUA_SUBQUERY, list(new SubLObject[]{ $TEST, $sym12$SETS_EQUAL_, $OWNER, NIL, $CLASSES, $list15, $KB, $FULL, $WORKING_, T }), $list19);
        define_test_case_table_int($sym20$TEST_STRATEGIC_PROGRESS_WRT_VARS_, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, $list15, $KB, $FULL, $WORKING_, T }), $list21);
        define_test_case_table_int(TEST_COMPUTE_ALL_LITERALS_TOTAL_STRATEGIC_PROGRESS_QUA_SUBQUERY, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list15, $KB, $FULL, $WORKING_, T }), $list24);
        return NIL;
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


























    }
}

/**
 * Total time: 153 ms
 */
