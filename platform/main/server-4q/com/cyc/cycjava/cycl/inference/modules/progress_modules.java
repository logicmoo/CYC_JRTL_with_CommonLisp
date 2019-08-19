package com.cyc.cycjava.cycl.inference.modules;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class progress_modules extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.modules.progress_modules";
	public static String myFingerPrint = "81a5fc86f3d77ee370df73b1994e0abcd9791ae2c9266b5bd301a46e9bc29208";
	private static SubLSymbol $kw$TACTICAL;
	private static SubLSymbol $sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT;
	private static SubLSymbol $kw$NEG;
	private static SubLList $list3;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $sym5$VARIABLE_P;
	private static SubLSymbol $sym6$CONS;
	private static SubLObject $const7$Thing;
	private static SubLSymbol $kw$NOT_FULLY_BOUND;
	private static SubLSymbol $kw$FULLY_BOUND;
	private static SubLSymbol $sym10$TEST_LITERAL_SHARED_VARS_QUA_SUBQUERY;
	private static SubLSymbol $kw$TEST;
	private static SubLSymbol $sym12$SETS_EQUAL_;
	private static SubLSymbol $kw$OWNER;
	private static SubLSymbol $kw$CLASSES;
	private static SubLList $list15;
	private static SubLSymbol $kw$KB;
	private static SubLSymbol $kw$FULL;
	private static SubLSymbol $kw$WORKING_;
	private static SubLList $list19;
	private static SubLSymbol $sym20$TEST_STRATEGIC_PROGRESS_WRT_VARS_;
	private static SubLList $list21;
	private static SubLList $list22;
	private static SubLSymbol $sym23$TEST_COMPUTE_ALL_LITERALS_TOTAL_STRATEGIC_PROGRESS_QUA_SUBQUERY;
	private static SubLList $list24;

	@SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 1200L)
	public static SubLObject compute_join_ordered_link_total_strategic_progress(SubLObject jo_link,
			SubLObject strategic_context) {
		if (strategic_context == UNPROVIDED) {
			strategic_context = $kw$TACTICAL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject sibling_total_progress = NIL;
		SubLObject local_state = inference_datastructures_problem.problem_memoization_state(
				inference_datastructures_problem_link.problem_link_supported_problem(jo_link));
		SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				sibling_total_progress = memoized_compute_join_ordered_link_total_strategic_progress_int(jo_link,
						strategic_context);
			} finally {
				SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					SubLObject _values = Values.getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state,
							original_memoization_process);
					Values.restoreValuesFromVector(_values);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return sibling_total_progress;
	}

	@SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 1900L)
	public static SubLObject memoized_compute_join_ordered_link_total_strategic_progress_int_internal(
			SubLObject jo_link, SubLObject strategic_context) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject sibling_total_progress = NIL;
		SubLObject local_state = inference_datastructures_problem_store
				.problem_store_memoization_state(inference_datastructures_problem_link.problem_link_store(jo_link));
		SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				SubLObject supported_problem = inference_datastructures_problem_link
						.problem_link_supported_problem(jo_link);
				SubLObject contextualized_clause = inference_datastructures_problem
						.problem_sole_clause(supported_problem);
				SubLObject focal_mapped_problem = inference_worker_join_ordered
						.join_ordered_link_focal_mapped_problem(jo_link);
				SubLObject focal_variable_map = inference_datastructures_problem_link
						.mapped_problem_variable_map(focal_mapped_problem);
				SubLObject focal_query = inference_datastructures_problem.problem_query(
						inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem));
				SubLObject focal_query_wrt_conjunction = bindings.apply_bindings(focal_variable_map, focal_query);
				thread.resetMultipleValues();
				SubLObject focal_mt = inference_datastructures_problem_query
						.mt_asent_sense_from_singleton_query(focal_query_wrt_conjunction);
				SubLObject focal_asent = thread.secondMultipleValue();
				SubLObject focal_sense = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				sibling_total_progress = compute_literal_total_strategic_progress_qua_subquery(focal_asent, focal_mt,
						focal_sense, contextualized_clause, strategic_context);
			} finally {
				SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					SubLObject _values = Values.getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state,
							original_memoization_process);
					Values.restoreValuesFromVector(_values);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return sibling_total_progress;
	}

	@SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 1900L)
	public static SubLObject memoized_compute_join_ordered_link_total_strategic_progress_int(SubLObject jo_link,
			SubLObject strategic_context) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state)
			return memoized_compute_join_ordered_link_total_strategic_progress_int_internal(jo_link, strategic_context);
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state,
				$sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(
					memoization_state.memoization_state_lock(v_memoization_state),
					$sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT, TWO_INTEGER, NIL, EQ,
					UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state,
					$sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT, caching_state);
		}
		SubLObject sxhash = memoization_state.sxhash_calc_2(jo_link, strategic_context);
		SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				SubLObject results2 = conses_high.second(collision);
				if (jo_link.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if ((NIL != cached_args) && (NIL == cached_args.rest())
							&& strategic_context.eql(cached_args.first()))
						return memoization_state.caching_results(results2);
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(
				memoized_compute_join_ordered_link_total_strategic_progress_int_internal(jo_link, strategic_context)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3,
				list(jo_link, strategic_context));
		return memoization_state.caching_results(results3);
	}

	@SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 3200L)
	public static SubLObject compute_literal_total_strategic_progress_qua_subquery(SubLObject focal_asent,
			SubLObject focal_mt, SubLObject focal_sense, SubLObject contextualized_clause,
			SubLObject strategic_context) {
		if (strategic_context == UNPROVIDED) {
			strategic_context = $kw$TACTICAL;
		}
		SubLObject focal_shared_vars_wrt_conjunction = literal_shared_vars_qua_subquery(focal_asent, focal_mt,
				focal_sense, contextualized_clause);
		SubLObject sibling_total_progress = ZERO_INTEGER;
		SubLObject sibling_sense = $kw$NEG;
		SubLObject index_var = ZERO_INTEGER;
		SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
		SubLObject contextualized_asent = NIL;
		contextualized_asent = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			SubLObject datum = current = contextualized_asent;
			SubLObject sibling_mt = NIL;
			SubLObject sibling_asent = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
			sibling_mt = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
			sibling_asent = current.first();
			current = current.rest();
			if (NIL == current) {
				if (!sibling_asent.equal(focal_asent) || !sibling_mt.equal(focal_mt)
						|| !sibling_sense.equal(focal_sense)) {
					SubLObject sibling_shared_vars_wrt_conjunction = literal_shared_vars_qua_subquery(sibling_asent,
							sibling_mt, sibling_sense, contextualized_clause);
					if (NIL != strategic_progress_wrt_varsP(sibling_asent, sibling_mt, sibling_sense,
							sibling_shared_vars_wrt_conjunction, focal_shared_vars_wrt_conjunction,
							strategic_context)) {
						sibling_total_progress = Numbers.add(sibling_total_progress, ONE_INTEGER);
					}
				}
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
			}
			index_var = Numbers.add(index_var, ONE_INTEGER);
			cdolist_list_var = cdolist_list_var.rest();
			contextualized_asent = cdolist_list_var.first();
		}
		sibling_sense = $kw$POS;
		index_var = ZERO_INTEGER;
		cdolist_list_var = clauses.pos_lits(contextualized_clause);
		contextualized_asent = NIL;
		contextualized_asent = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			SubLObject datum = current = contextualized_asent;
			SubLObject sibling_mt = NIL;
			SubLObject sibling_asent = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
			sibling_mt = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
			sibling_asent = current.first();
			current = current.rest();
			if (NIL == current) {
				if (!sibling_asent.equal(focal_asent) || !sibling_mt.equal(focal_mt)
						|| !sibling_sense.equal(focal_sense)) {
					SubLObject sibling_shared_vars_wrt_conjunction = literal_shared_vars_qua_subquery(sibling_asent,
							sibling_mt, sibling_sense, contextualized_clause);
					if (NIL != strategic_progress_wrt_varsP(sibling_asent, sibling_mt, sibling_sense,
							sibling_shared_vars_wrt_conjunction, focal_shared_vars_wrt_conjunction,
							strategic_context)) {
						sibling_total_progress = Numbers.add(sibling_total_progress, ONE_INTEGER);
					}
				}
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
			}
			index_var = Numbers.add(index_var, ONE_INTEGER);
			cdolist_list_var = cdolist_list_var.rest();
			contextualized_asent = cdolist_list_var.first();
		}
		return sibling_total_progress;
	}

	@SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 4300L)
	public static SubLObject literal_shared_vars_qua_subquery(SubLObject asent, SubLObject mt, SubLObject sense,
			SubLObject contextualized_clause) {
		SubLObject asent_vars = list_utilities.tree_gather(asent, Symbols.symbol_function($sym5$VARIABLE_P), UNPROVIDED,
				UNPROVIDED, UNPROVIDED);
		SubLObject v_mt_vars = list_utilities.tree_gather(mt, Symbols.symbol_function($sym5$VARIABLE_P), UNPROVIDED,
				UNPROVIDED, UNPROVIDED);
		SubLObject literal_vars = conses_high.nunion(asent_vars, v_mt_vars, UNPROVIDED, UNPROVIDED);
		SubLObject shared_vars = NIL;
		SubLObject cdolist_list_var = literal_vars;
		SubLObject literal_var = NIL;
		literal_var = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject sharedP = NIL;
			SubLObject sibling_sense = $kw$NEG;
			SubLObject index_var = ZERO_INTEGER;
			SubLObject rest;
			SubLObject contextualized_asent;
			SubLObject current;
			SubLObject datum;
			SubLObject sibling_mt;
			SubLObject sibling_asent;
			for (rest = NIL, rest = clauses.neg_lits(contextualized_clause); (NIL == sharedP)
					&& (NIL != rest); rest = rest.rest()) {
				contextualized_asent = rest.first();
				datum = (current = contextualized_asent);
				sibling_mt = NIL;
				sibling_asent = NIL;
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
				sibling_mt = current.first();
				current = current.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
				sibling_asent = current.first();
				current = current.rest();
				if (NIL == current) {
					if ((!sibling_asent.equal(asent) || !sibling_mt.equal(mt) || !sibling_sense.equal(sense))
							&& ((NIL != list_utilities.simple_tree_find(literal_var, sibling_asent))
									|| (NIL != list_utilities.simple_tree_find(literal_var, sibling_mt)))) {
						sharedP = T;
					}
				} else {
					cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
				}
				index_var = Numbers.add(index_var, ONE_INTEGER);
			}
			sibling_sense = $kw$POS;
			index_var = ZERO_INTEGER;
			for (rest = NIL, rest = clauses.pos_lits(contextualized_clause); (NIL == sharedP)
					&& (NIL != rest); rest = rest.rest()) {
				contextualized_asent = rest.first();
				datum = (current = contextualized_asent);
				sibling_mt = NIL;
				sibling_asent = NIL;
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
				sibling_mt = current.first();
				current = current.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list3);
				sibling_asent = current.first();
				current = current.rest();
				if (NIL == current) {
					if ((!sibling_asent.equal(asent) || !sibling_mt.equal(mt) || !sibling_sense.equal(sense))
							&& ((NIL != list_utilities.simple_tree_find(literal_var, sibling_asent))
									|| (NIL != list_utilities.simple_tree_find(literal_var, sibling_mt)))) {
						sharedP = T;
					}
				} else {
					cdestructuring_bind.cdestructuring_bind_error(datum, $list3);
				}
				index_var = Numbers.add(index_var, ONE_INTEGER);
			}
			if (NIL != sharedP) {
				shared_vars = cons(literal_var, shared_vars);
			}
			cdolist_list_var = cdolist_list_var.rest();
			literal_var = cdolist_list_var.first();
		}
		SubLObject canonical_shared_vars = inference_worker_join_ordered.canonicalize_hl_variable_list(shared_vars);
		return canonical_shared_vars;
	}

	@SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 5500L)
	public static SubLObject strategic_progress_wrt_varsP(SubLObject asent, SubLObject mt, SubLObject sense,
			SubLObject shared_vars, SubLObject lookahead_vars, SubLObject strategic_context) {
		if (strategic_context == UNPROVIDED) {
			strategic_context = $kw$TACTICAL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject lookahead_bindings = Mapping.mapcar(Symbols.symbol_function($sym6$CONS), lookahead_vars,
				new SubLObject[] { make_list(Sequences.length(lookahead_vars), $const7$Thing) });
		SubLObject lookahead_asent = bindings.apply_bindings(lookahead_bindings, asent);
		if ((NIL != variables.fully_bound_p(lookahead_asent)) && (NIL == variables.fully_bound_p(asent)))
			return Values.values(T, $kw$NOT_FULLY_BOUND, $kw$FULLY_BOUND);
		SubLObject baseline_preference = NIL;
		SubLObject lookahead_preference = NIL;
		SubLObject progressP = NIL;
		SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
			mt_relevance_macros.$relevant_mt_function$
					.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt),
					thread);
			baseline_preference = preference_modules.literal_preference_level_wrt_modules(asent, sense, shared_vars,
					strategic_context);
			lookahead_preference = preference_modules.literal_preference_level_wrt_modules(lookahead_asent, sense,
					shared_vars, strategic_context);
			progressP = preference_modules.preference_level_L(baseline_preference, lookahead_preference);
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return Values.values(progressP, baseline_preference, lookahead_preference);
	}

	@SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 6900L)
	public static SubLObject test_literal_shared_vars_qua_subquery(SubLObject asent, SubLObject mt, SubLObject sense,
			SubLObject contextualized_clause) {
		asent = variables.canonicalize_default_el_vars(asent);
		mt = variables.canonicalize_default_el_vars(mt);
		contextualized_clause = variables.canonicalize_default_el_vars(contextualized_clause);
		SubLObject shared_vars = literal_shared_vars_qua_subquery(asent, mt, sense, contextualized_clause);
		return variables.uncanonicalize_hl_vars(shared_vars);
	}

	@SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 6900L)
	public static SubLObject test_strategic_progress_wrt_varsP(SubLObject asent, SubLObject mt, SubLObject sense,
			SubLObject shared_vars, SubLObject lookahead_vars) {
		asent = variables.canonicalize_default_el_vars(asent);
		mt = variables.canonicalize_default_el_vars(mt);
		shared_vars = variables.canonicalize_default_el_vars(shared_vars);
		lookahead_vars = variables.canonicalize_default_el_vars(lookahead_vars);
		return Values.values(strategic_progress_wrt_varsP(asent, mt, sense, shared_vars, lookahead_vars, UNPROVIDED));
	}

	@SubL(source = "cycl/inference/modules/progress-modules.lisp", position = 6900L)
	public static SubLObject test_compute_all_literals_total_strategic_progress_qua_subquery(
			SubLObject contextualized_clause) {
		SubLThread thread = SubLProcess.currentSubLThread();
		contextualized_clause = variables.canonicalize_default_el_vars(contextualized_clause);
		SubLObject all_progress_counts = NIL;
		SubLObject local_state;
		SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED,
				UNPROVIDED);
		SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				SubLObject focal_sense = $kw$NEG;
				SubLObject index_var = ZERO_INTEGER;
				SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
				SubLObject contextualized_asent = NIL;
				contextualized_asent = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject current;
					SubLObject datum = current = contextualized_asent;
					SubLObject focal_mt = NIL;
					SubLObject focal_asent = NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
					focal_mt = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
					focal_asent = current.first();
					current = current.rest();
					if (NIL == current) {
						SubLObject sibling_total_progress = compute_literal_total_strategic_progress_qua_subquery(
								focal_asent, focal_mt, focal_sense, contextualized_clause, UNPROVIDED);
						all_progress_counts = cons(sibling_total_progress, all_progress_counts);
					} else {
						cdestructuring_bind.cdestructuring_bind_error(datum, $list22);
					}
					index_var = Numbers.add(index_var, ONE_INTEGER);
					cdolist_list_var = cdolist_list_var.rest();
					contextualized_asent = cdolist_list_var.first();
				}
				focal_sense = $kw$POS;
				index_var = ZERO_INTEGER;
				cdolist_list_var = clauses.pos_lits(contextualized_clause);
				contextualized_asent = NIL;
				contextualized_asent = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject current;
					SubLObject datum = current = contextualized_asent;
					SubLObject focal_mt = NIL;
					SubLObject focal_asent = NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
					focal_mt = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
					focal_asent = current.first();
					current = current.rest();
					if (NIL == current) {
						SubLObject sibling_total_progress = compute_literal_total_strategic_progress_qua_subquery(
								focal_asent, focal_mt, focal_sense, contextualized_clause, UNPROVIDED);
						all_progress_counts = cons(sibling_total_progress, all_progress_counts);
					} else {
						cdestructuring_bind.cdestructuring_bind_error(datum, $list22);
					}
					index_var = Numbers.add(index_var, ONE_INTEGER);
					cdolist_list_var = cdolist_list_var.rest();
					contextualized_asent = cdolist_list_var.first();
				}
			} finally {
				SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					SubLObject _values = Values.getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state,
							original_memoization_process);
					Values.restoreValuesFromVector(_values);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return Sequences.nreverse(all_progress_counts);
	}

	public static SubLObject declare_progress_modules_file() {
		declareFunction(myName, "compute_join_ordered_link_total_strategic_progress",
				"COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS", 1, 1, false);
		declareFunction(myName, "memoized_compute_join_ordered_link_total_strategic_progress_int_internal",
				"MEMOIZED-COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS-INT-INTERNAL", 2, 0, false);
		declareFunction(myName, "memoized_compute_join_ordered_link_total_strategic_progress_int",
				"MEMOIZED-COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS-INT", 2, 0, false);
		declareFunction(myName, "compute_literal_total_strategic_progress_qua_subquery",
				"COMPUTE-LITERAL-TOTAL-STRATEGIC-PROGRESS-QUA-SUBQUERY", 4, 1, false);
		declareFunction(myName, "literal_shared_vars_qua_subquery", "LITERAL-SHARED-VARS-QUA-SUBQUERY", 4, 0, false);
		declareFunction(myName, "strategic_progress_wrt_varsP", "STRATEGIC-PROGRESS-WRT-VARS?", 5, 1, false);
		declareFunction(myName, "test_literal_shared_vars_qua_subquery", "TEST-LITERAL-SHARED-VARS-QUA-SUBQUERY", 4, 0,
				false);
		declareFunction(myName, "test_strategic_progress_wrt_varsP", "TEST-STRATEGIC-PROGRESS-WRT-VARS?", 5, 0, false);
		declareFunction(myName, "test_compute_all_literals_total_strategic_progress_qua_subquery",
				"TEST-COMPUTE-ALL-LITERALS-TOTAL-STRATEGIC-PROGRESS-QUA-SUBQUERY", 1, 0, false);
		return NIL;
	}

	public static SubLObject init_progress_modules_file() {
		return NIL;
	}

	public static SubLObject setup_progress_modules_file() {
		memoization_state.note_memoized_function($sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT);
		generic_testing.define_test_case_table_int($sym10$TEST_LITERAL_SHARED_VARS_QUA_SUBQUERY,
				list(new SubLObject[] { $kw$TEST, $sym12$SETS_EQUAL_, $kw$OWNER, NIL, $kw$CLASSES, $list15, $kw$KB,
						$kw$FULL, $kw$WORKING_, T }),
				$list19);
		generic_testing.define_test_case_table_int($sym20$TEST_STRATEGIC_PROGRESS_WRT_VARS_,
				list(new SubLObject[] { $kw$TEST, Symbols.symbol_function(EQ), $kw$OWNER, NIL, $kw$CLASSES, $list15,
						$kw$KB, $kw$FULL, $kw$WORKING_, T }),
				$list21);
		generic_testing.define_test_case_table_int(
				$sym23$TEST_COMPUTE_ALL_LITERALS_TOTAL_STRATEGIC_PROGRESS_QUA_SUBQUERY,
				list(new SubLObject[] { $kw$TEST, Symbols.symbol_function(EQUAL), $kw$OWNER, NIL, $kw$CLASSES, $list15,
						$kw$KB, $kw$FULL, $kw$WORKING_, T }),
				$list24);
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
		me = new progress_modules();
		$kw$TACTICAL = makeKeyword("TACTICAL");
		$sym1$MEMOIZED_COMPUTE_JOIN_ORDERED_LINK_TOTAL_STRATEGIC_PROGRESS_INT = makeSymbol(
				"MEMOIZED-COMPUTE-JOIN-ORDERED-LINK-TOTAL-STRATEGIC-PROGRESS-INT");
		$kw$NEG = makeKeyword("NEG");
		$list3 = list(makeSymbol("SIBLING-MT"), makeSymbol("SIBLING-ASENT"));
		$kw$POS = makeKeyword("POS");
		$sym5$VARIABLE_P = makeSymbol("VARIABLE-P");
		$sym6$CONS = makeSymbol("CONS");
		$const7$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
		$kw$NOT_FULLY_BOUND = makeKeyword("NOT-FULLY-BOUND");
		$kw$FULLY_BOUND = makeKeyword("FULLY-BOUND");
		$sym10$TEST_LITERAL_SHARED_VARS_QUA_SUBQUERY = makeSymbol("TEST-LITERAL-SHARED-VARS-QUA-SUBQUERY");
		$kw$TEST = makeKeyword("TEST");
		$sym12$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");
		$kw$OWNER = makeKeyword("OWNER");
		$kw$CLASSES = makeKeyword("CLASSES");
		$list15 = list(makeKeyword("PROGRESS-MODULES"));
		$kw$KB = makeKeyword("KB");
		$kw$FULL = makeKeyword("FULL");
		$kw$WORKING_ = makeKeyword("WORKING?");
		$list19 = list(
				list(list(list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")),
						makeSymbol("?VAR0"),
						list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR1"),
								constant_handles.reader_make_constant_shell(makeString("ApplicationContext")))),
						constant_handles
								.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
						makeKeyword("POS"),
						list(NIL, list(
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")),
												makeSymbol("?VAR0"),
												list(constant_handles.reader_make_constant_shell(makeString("isa")),
														makeSymbol("?VAR1"),
														constant_handles.reader_make_constant_shell(
																makeString("ApplicationContext"))))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles
												.reader_make_constant_shell(makeString("endsAfterEndingOf")),
												makeSymbol("?VAR2"),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(1990)))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("mtMonad")),
												makeSymbol("?VAR0"), makeSymbol("?VAR3"))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")),
												makeSymbol("?VAR0"), makeSymbol("?VAR2")))))),
						list(makeSymbol("?VAR0"))),
				list(list(
						list(constant_handles.reader_make_constant_shell(makeString("endsAfterEndingOf")),
								makeSymbol("?VAR2"),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(1990))),
						constant_handles
								.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
						makeKeyword("POS"),
						list(NIL, list(
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")),
												makeSymbol("?VAR0"),
												list(constant_handles.reader_make_constant_shell(makeString("isa")),
														makeSymbol("?VAR1"),
														constant_handles.reader_make_constant_shell(
																makeString("ApplicationContext"))))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles
												.reader_make_constant_shell(makeString("endsAfterEndingOf")),
												makeSymbol("?VAR2"),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(1990)))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("mtMonad")),
												makeSymbol("?VAR0"), makeSymbol("?VAR3"))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")),
												makeSymbol("?VAR0"), makeSymbol("?VAR2")))))),
						list(makeSymbol("?VAR2"))),
				list(list(
						list(constant_handles.reader_make_constant_shell(makeString("mtMonad")), makeSymbol("?VAR0"),
								makeSymbol("?VAR3")),
						constant_handles
								.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
						makeKeyword("POS"),
						list(NIL, list(
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")),
												makeSymbol("?VAR0"),
												list(constant_handles.reader_make_constant_shell(makeString("isa")),
														makeSymbol("?VAR1"),
														constant_handles.reader_make_constant_shell(
																makeString("ApplicationContext"))))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles
												.reader_make_constant_shell(makeString("endsAfterEndingOf")),
												makeSymbol("?VAR2"),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(1990)))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("mtMonad")),
												makeSymbol("?VAR0"), makeSymbol("?VAR3"))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")),
												makeSymbol("?VAR0"), makeSymbol("?VAR2")))))),
						list(makeSymbol("?VAR0"))),
				list(list(
						list(constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")),
								makeSymbol("?VAR0"), makeSymbol("?VAR2")),
						constant_handles
								.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
						makeKeyword("POS"),
						list(NIL, list(
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")),
												makeSymbol("?VAR0"),
												list(constant_handles.reader_make_constant_shell(makeString("isa")),
														makeSymbol("?VAR1"),
														constant_handles.reader_make_constant_shell(
																makeString("ApplicationContext"))))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles
												.reader_make_constant_shell(makeString("endsAfterEndingOf")),
												makeSymbol("?VAR2"),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(1990)))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("mtMonad")),
												makeSymbol("?VAR0"), makeSymbol("?VAR3"))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")),
												makeSymbol("?VAR0"), makeSymbol("?VAR2")))))),
						list(makeSymbol("?VAR0"), makeSymbol("?VAR2"))));
		$sym20$TEST_STRATEGIC_PROGRESS_WRT_VARS_ = makeSymbol("TEST-STRATEGIC-PROGRESS-WRT-VARS?");
		$list21 = list(
				new SubLObject[] {
						list(list(
								list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")),
										makeSymbol("?VAR0"),
										list(constant_handles.reader_make_constant_shell(makeString("isa")),
												makeSymbol("?VAR1"),
												constant_handles
														.reader_make_constant_shell(makeString("ApplicationContext")))),
								constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
								makeKeyword("POS"), list(makeSymbol("?VAR0")), list(makeSymbol("?VAR2"))), NIL),
						ConsesLow
								.list(list(
										list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")),
												makeSymbol("?VAR0"),
												list(constant_handles.reader_make_constant_shell(makeString("isa")),
														makeSymbol("?VAR1"),
														constant_handles.reader_make_constant_shell(
																makeString("ApplicationContext")))),
										constant_handles.reader_make_constant_shell(
												makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										makeKeyword("POS"), list(makeSymbol("?VAR0")),
										list(makeSymbol("?VAR0"), makeSymbol("?VAR3"))), NIL),
						ConsesLow
								.list(list(
										list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")),
												makeSymbol("?VAR0"),
												list(constant_handles.reader_make_constant_shell(makeString("isa")),
														makeSymbol("?VAR1"),
														constant_handles.reader_make_constant_shell(
																makeString("ApplicationContext")))),
										constant_handles.reader_make_constant_shell(
												makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										makeKeyword("POS"), list(makeSymbol("?VAR0")),
										list(makeSymbol("?VAR0"), makeSymbol("?VAR2"))), NIL),
						list(list(
								list(constant_handles.reader_make_constant_shell(makeString("endsAfterEndingOf")),
										makeSymbol("?VAR2"),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1990))),
								constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
								makeKeyword("POS"), list(makeSymbol("?VAR2")),
								list(makeSymbol("?VAR0"), makeSymbol("?VAR1"))), NIL),
						list(list(
								list(constant_handles.reader_make_constant_shell(makeString("endsAfterEndingOf")),
										makeSymbol("?VAR2"),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1990))),
								constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
								makeKeyword("POS"), list(makeSymbol("?VAR2")),
								list(makeSymbol("?VAR0"), makeSymbol("?VAR3"))), NIL),
						list(list(
								list(constant_handles.reader_make_constant_shell(makeString("endsAfterEndingOf")),
										makeSymbol("?VAR2"),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1990))),
								constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
								makeKeyword("POS"), list(makeSymbol("?VAR2")),
								list(makeSymbol("?VAR0"), makeSymbol("?VAR2"))), T),
						list(list(
								list(constant_handles.reader_make_constant_shell(makeString("mtMonad")),
										makeSymbol("?VAR0"), makeSymbol("?VAR3")),
								constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
								makeKeyword("POS"), list(makeSymbol("?VAR0")),
								list(makeSymbol("?VAR0"), makeSymbol("?VAR1"))), T),
						list(list(
								list(constant_handles.reader_make_constant_shell(makeString("mtMonad")),
										makeSymbol("?VAR0"), makeSymbol("?VAR3")),
								constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
								makeKeyword("POS"), list(makeSymbol("?VAR0")), list(makeSymbol("?VAR2"))), NIL),
						list(list(
								list(constant_handles.reader_make_constant_shell(makeString("mtMonad")),
										makeSymbol("?VAR0"), makeSymbol("?VAR3")),
								constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
								makeKeyword("POS"), list(makeSymbol("?VAR0")),
								list(makeSymbol("?VAR0"), makeSymbol("?VAR2"))), T),
						list(list(
								list(constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")),
										makeSymbol("?VAR0"), makeSymbol("?VAR2")),
								constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
								makeKeyword("POS"), list(makeSymbol("?VAR0"), makeSymbol("?VAR2")),
								list(makeSymbol("?VAR0"), makeSymbol("?VAR1"))), T),
						list(list(
								list(constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")),
										makeSymbol("?VAR0"), makeSymbol("?VAR2")),
								constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
								makeKeyword("POS"), list(makeSymbol("?VAR0"), makeSymbol("?VAR2")),
								list(makeSymbol("?VAR2"))), NIL),
						list(list(
								list(constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")),
										makeSymbol("?VAR0"), makeSymbol("?VAR2")),
								constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
								makeKeyword("POS"), list(makeSymbol("?VAR0"), makeSymbol("?VAR2")),
								list(makeSymbol("?VAR0"), makeSymbol("?VAR3"))), T) });
		$list22 = list(makeSymbol("FOCAL-MT"), makeSymbol("FOCAL-ASENT"));
		$sym23$TEST_COMPUTE_ALL_LITERALS_TOTAL_STRATEGIC_PROGRESS_QUA_SUBQUERY = makeSymbol(
				"TEST-COMPUTE-ALL-LITERALS-TOTAL-STRATEGIC-PROGRESS-QUA-SUBQUERY");
		$list24 = list(list(
				list(list(
						NIL, list(
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("ist-Asserted")),
												makeSymbol("?VAR0"),
												list(constant_handles.reader_make_constant_shell(makeString("isa")),
														makeSymbol("?VAR1"),
														constant_handles.reader_make_constant_shell(
																makeString("ApplicationContext"))))),
								ConsesLow.list(
										constant_handles.reader_make_constant_shell(
												makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles
												.reader_make_constant_shell(makeString("endsAfterEndingOf")),
												makeSymbol("?VAR2"),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(1990)))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("mtMonad")),
												makeSymbol("?VAR0"), makeSymbol("?VAR3"))),
								list(constant_handles.reader_make_constant_shell(
										makeString("CurrentWorldDataCollectorMt-NonHomocentric")),
										list(constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")),
												makeSymbol("?VAR0"), makeSymbol("?VAR2")))))),
				list(TWO_INTEGER, ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER)));
	}
}
/*
 *
 * Total time: 153 ms
 *
 */