/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
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
 * module:      INFERENCE-MIN-TRANSFORMATION-DEPTH
 * source file: /cyc/top/cycl/inference/harness/inference-min-transformation-depth.lisp
 * created:     2019/07/03 17:37:40
 */
public final class inference_min_transformation_depth extends SubLTranslatedFile implements V12 {
    public static final SubLObject validate_problem_store_wrt_mtsd(SubLObject store, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject problems = NIL;
            SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject strategy = NIL;
                    while (NIL != id) {
                        strategy = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, strategy, $SKIP)) {
                            {
                                SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
                                SubLObject idx_19 = inference_datastructures_problem_store.problem_store_problem_id_index(store);
                                if (NIL == do_id_index_empty_p(idx_19, $SKIP)) {
                                    {
                                        SubLObject id_20 = do_id_index_next_id(idx_19, NIL, NIL, NIL);
                                        SubLObject state_var_21 = do_id_index_next_state(idx_19, NIL, id_20, NIL);
                                        SubLObject problem = NIL;
                                        while (NIL != id_20) {
                                            problem = do_id_index_state_object(idx_19, $SKIP, id_20, state_var_21);
                                            if (NIL != do_id_index_id_and_object_validP(id_20, problem, $SKIP)) {
                                                if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_transformationP(strategy, problem)) {
                                                    {
                                                        SubLObject old_depth = inference_datastructures_problem.problem_min_transformation_depth(problem, inference);
                                                        SubLObject new_depth = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.problem_min_transformation_depth_from_signature(problem, inference);
                                                        SubLObject signature = inference_datastructures_problem.problem_min_transformation_depth_signature(problem, inference);
                                                        if (old_depth.isInteger()) {
                                                            if (($UNDETERMINED == signature) || (!old_depth.eql(new_depth))) {
                                                                problems = cons(problem, problems);
                                                                if (NIL != verboseP) {
                                                                    Errors.warn($str_alt32$__old__S_new__S_signature__S___S, new SubLObject[]{ old_depth, new_depth, signature, problem });
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            id_20 = do_id_index_next_id(idx_19, NIL, id_20, state_var_21);
                                            state_var_21 = do_id_index_next_state(idx_19, NIL, id_20, state_var_21);
                                        } 
                                    }
                                }
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            return Sort.sort(problems, symbol_function($sym33$_), symbol_function(PROBLEM_SUID));
        }
    }

    public static final SubLObject validate_min_transformation_depth_signature_propagation(SubLObject store, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject problems = NIL;
            SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject strategy = NIL;
                    while (NIL != id) {
                        strategy = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, strategy, $SKIP)) {
                            {
                                SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
                                SubLObject idx_22 = inference_datastructures_problem_store.problem_store_problem_id_index(store);
                                if (NIL == do_id_index_empty_p(idx_22, $SKIP)) {
                                    {
                                        SubLObject id_23 = do_id_index_next_id(idx_22, NIL, NIL, NIL);
                                        SubLObject state_var_24 = do_id_index_next_state(idx_22, NIL, id_23, NIL);
                                        SubLObject problem = NIL;
                                        while (NIL != id_23) {
                                            problem = do_id_index_state_object(idx_22, $SKIP, id_23, state_var_24);
                                            if (NIL != do_id_index_id_and_object_validP(id_23, problem, $SKIP)) {
                                                if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_transformationP(strategy, problem)) {
                                                    {
                                                        SubLObject signature = inference_datastructures_problem.problem_min_transformation_depth_signature(problem, inference);
                                                        if (signature == $UNDETERMINED) {
                                                            problems = cons(problem, problems);
                                                            if (NIL != verboseP) {
                                                                Errors.warn($str_alt35$___S, problem);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            id_23 = do_id_index_next_id(idx_22, NIL, id_23, state_var_24);
                                            state_var_24 = do_id_index_next_state(idx_22, NIL, id_23, state_var_24);
                                        } 
                                    }
                                }
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            return Sort.sort(problems, symbol_function($sym33$_), symbol_function(PROBLEM_SUID));
        }
    }

    public static final SubLFile me = new inference_min_transformation_depth();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth";


    static private final SubLString $str2$Unexpected_logical_tactic____S = makeString("Unexpected logical-tactic : ~S");

    static private final SubLString $str4$Time_to_support__S_propagation = makeString("Time to support ~S propagation");

    static private final SubLString $str6$Propagation_error____S = makeString("Propagation error : ~S");

    static private final SubLList $list8 = list(makeSymbol("PARENT-NEG-LITS"), makeSymbol("PARENT-POS-LITS"));

    static private final SubLList $list9 = list(makeSymbol("CHILD-NEG-LITS"), makeSymbol("CHILD-POS-LITS"));

    private static final SubLSymbol MULTI_CLAUSE_PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("MULTI-CLAUSE-PROBLEM-QUERY-DEPTH-SIGNATURE-P");

    private static final SubLSymbol SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("SINGLE-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P");

    private static final SubLSymbol MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("MULTI-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P");

    private static final SubLSymbol INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE = makeSymbol("INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE");

    private static final SubLSymbol PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("PROBLEM-QUERY-DEPTH-SIGNATURE-P");

    public static final SubLSymbol $intern_problem_query_depth_signature_caching_state$ = makeSymbol("*INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-CACHING-STATE*");

    private static final SubLList $list16 = list(makeSymbol("NEG-LIT-PQDS"), makeSymbol("POS-LIT-PQDS"));

    static private final SubLList $list17 = list(makeSymbol("NEG-LIT-SPECS"), makeSymbol("POS-LIT-SPECS"));

    private static final SubLSymbol PQDS_DEPTH = makeSymbol("PQDS-DEPTH");

    private static final SubLString $str21$unexpected_mode__S = makeString("unexpected mode ~S");

    private static final SubLSymbol $pqds_depth_caching_state$ = makeSymbol("*PQDS-DEPTH-CACHING-STATE*");

    private static final SubLList $list23 = list(makeSymbol("CLAUSE-NEG-LITS"), makeSymbol("CLAUSE-POS-LITS"));

    static private final SubLList $list24 = list(makeSymbol("SUBCLAUSE-NEG-LITS"), makeSymbol("SUBCLAUSE-POS-LITS"));

    private static final SubLString $str26$Failed_literal_map__S = makeString("Failed literal map ~S");

    private static final SubLList $list27 = list(makeSymbol("SOURCE-NEG-MTDS-LIST"), makeSymbol("SOURCE-POS-MTDS-LIST"));

    static private final SubLList $list28 = list(makeSymbol("NEG-LIT-MAP"), makeSymbol("POS-LIT-MAP"));

    // Definitions
    public static final SubLObject problem_min_transformation_depth_from_signature_alt(SubLObject problem, SubLObject inference) {
        {
            SubLObject signature = inference_datastructures_problem.problem_min_transformation_depth_signature(problem, inference);
            return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.min_transformation_depth_from_signature(signature);
        }
    }

    // Definitions
    public static SubLObject problem_min_transformation_depth_from_signature(final SubLObject problem, final SubLObject inference) {
        final SubLObject signature = inference_datastructures_problem.problem_min_transformation_depth_signature(problem, inference);
        return min_transformation_depth_from_signature(signature);
    }

    public static final SubLObject min_transformation_depth_from_signature_alt(SubLObject signature) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($UNDETERMINED == signature) {
                return $UNDETERMINED;
            } else {
                if (inference_datastructures_problem.$transformation_depth_computation$.getDynamicValue(thread) == $COUNTERINTUITIVE) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_min_number(signature);
                } else {
                    return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_sum(signature);
                }
            }
        }
    }

    public static SubLObject min_transformation_depth_from_signature(final SubLObject signature) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($UNDETERMINED == signature) {
            return $UNDETERMINED;
        }
        if (inference_datastructures_problem.$transformation_depth_computation$.getDynamicValue(thread) == $COUNTERINTUITIVE) {
            return tree_min_number(signature);
        }
        return tree_sum(signature);
    }

    public static final SubLObject logical_tactic_lookahead_min_transformation_depth_alt(SubLObject logical_tactic, SubLObject inference) {
        {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(logical_tactic);
            SubLObject signature = inference_datastructures_problem.problem_min_transformation_depth_signature(problem, inference);
            if ($UNDETERMINED == signature) {
                return $UNDETERMINED;
            } else {
                if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(logical_tactic)) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.join_ordered_tactic_lookahead_mtds(logical_tactic, signature);
                } else {
                    if (NIL != inference_worker_split.split_tactic_p(logical_tactic)) {
                        return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.split_tactic_lookahead_mtds(logical_tactic, signature);
                    } else {
                        if (NIL != inference_worker_union.union_tactic_p(logical_tactic)) {
                            return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.union_tactic_lookahead_mtds(logical_tactic, signature);
                        } else {
                            return Errors.error($str_alt2$Unexpected_logical_tactic____S, logical_tactic);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject logical_tactic_lookahead_min_transformation_depth(final SubLObject logical_tactic, final SubLObject inference) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(logical_tactic);
        final SubLObject signature = inference_datastructures_problem.problem_min_transformation_depth_signature(problem, inference);
        if ($UNDETERMINED == signature) {
            return $UNDETERMINED;
        }
        if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(logical_tactic)) {
            return join_ordered_tactic_lookahead_mtds(logical_tactic, signature);
        }
        if (NIL != inference_worker_split.split_tactic_p(logical_tactic)) {
            return split_tactic_lookahead_mtds(logical_tactic, signature);
        }
        if (NIL != inference_worker_union.union_tactic_p(logical_tactic)) {
            return union_tactic_lookahead_mtds(logical_tactic, signature);
        }
        return Errors.error($str2$Unexpected_logical_tactic____S, logical_tactic);
    }

    /**
     * Propagates transformation depth down via LINK.
     */
    @LispMethod(comment = "Propagates transformation depth down via LINK.")
    public static final SubLObject propagate_min_transformation_depth_signature_via_link_alt(SubLObject link) {
        {
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(inference_datastructures_problem_link.problem_link_store(link));
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject inference = NIL;
                    while (NIL != id) {
                        inference = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
                            com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_min_transformation_depth_signature_via_link_wrt_inference(link, inference);
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
        }
        return NIL;
    }

    /**
     * Propagates transformation depth down via LINK.
     */
    @LispMethod(comment = "Propagates transformation depth down via LINK.")
    public static SubLObject propagate_min_transformation_depth_signature_via_link(final SubLObject link) {
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(inference_datastructures_problem_link.problem_link_store(link));
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$1 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$1);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        propagate_min_transformation_depth_signature_via_link_wrt_inference(link, inference);
                    }
                }
            }
            final SubLObject idx_$2 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$2)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$2);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        propagate_min_transformation_depth_signature_via_link_wrt_inference(link, inference2);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject propagate_min_transformation_depth_signature_alt(SubLObject problem, SubLObject mtds, SubLObject inference) {
        {
            SubLObject updatedP = inference_datastructures_problem.note_problem_min_transformation_depth_signature(problem, inference, mtds);
            if (NIL != updatedP) {
                {
                    SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_min_transformation_depth_signature_via_link(link);
                            }
                        }
                    }
                }
            }
            return updatedP;
        }
    }

    public static SubLObject propagate_min_transformation_depth_signature(final SubLObject problem, final SubLObject mtds, final SubLObject inference) {
        final SubLObject updatedP = inference_datastructures_problem.note_problem_min_transformation_depth_signature(problem, inference, mtds);
        if (NIL != updatedP) {
            final SubLObject store = inference_datastructures_problem.problem_store(problem);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$3 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$3);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference_$4;
                    SubLObject inference_var;
                    SubLObject set_var;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject strategy;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        inference_$4 = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(inference_$4)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(inference_$4)) {
                                inference_$4 = $SKIP;
                            }
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference_$4)) {
                                inference_var = inference_$4;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if ((NIL != set_contents.do_set_contents_element_validP(state, strategy)) && (NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy))) {
                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy);
                                        inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy);
                                        inference_datastructures_strategy.note_strategy_should_reconsider_set_asides(strategy);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$4 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$4)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$4);
                    SubLObject id2 = NIL;
                    SubLObject inference_$5 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            inference_$5 = getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference_$5)) {
                                final SubLObject inference_var2 = inference_$5;
                                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) && (NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy2))) {
                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy2);
                                        inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy2);
                                        inference_datastructures_strategy.note_strategy_should_reconsider_set_asides(strategy2);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            final SubLObject set_contents_var3 = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object3;
            SubLObject state3;
            SubLObject link;
            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                link = set_contents.do_set_contents_next(basis_object3, state3);
                if (NIL != set_contents.do_set_contents_element_validP(state3, link)) {
                    propagate_min_transformation_depth_signature_via_link(link);
                }
            }
        }
        return updatedP;
    }

    /**
     * Propagates transformation depth wrt INFERENCE down via LINK.
     */
    @LispMethod(comment = "Propagates transformation depth wrt INFERENCE down via LINK.")
    public static final SubLObject propagate_min_transformation_depth_signature_via_link_wrt_inference_alt(SubLObject link, SubLObject inference) {
        {
            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            SubLObject parent_mtds = inference_datastructures_problem.problem_min_transformation_depth_signature(supported_problem, inference);
            if ($UNDETERMINED != parent_mtds) {
                if (NIL != inference_worker_transformation.transformation_link_p(link)) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_mtds_via_transformation_link(parent_mtds, link, inference);
                } else {
                    if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                        return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_mtds_via_join_ordered_link(parent_mtds, link, inference);
                    } else {
                        if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
                            return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_mtds_via_residual_transformation_link(parent_mtds, link, inference);
                        } else {
                            if (NIL != inference_worker_split.split_link_p(link)) {
                                return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_mtds_via_split_link(parent_mtds, link, inference);
                            } else {
                                if (NIL != inference_worker_restriction.restriction_link_p(link)) {
                                    return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_mtds_via_restriction_link(parent_mtds, link, inference);
                                } else {
                                    if (NIL != inference_worker_union.union_link_p(link)) {
                                        return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_mtds_via_union_link(parent_mtds, link, inference);
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

    /**
     * Propagates transformation depth wrt INFERENCE down via LINK.
     */
    @LispMethod(comment = "Propagates transformation depth wrt INFERENCE down via LINK.")
    public static SubLObject propagate_min_transformation_depth_signature_via_link_wrt_inference(final SubLObject link, final SubLObject inference) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        final SubLObject parent_mtds = inference_datastructures_problem.problem_min_transformation_depth_signature(supported_problem, inference);
        if ($UNDETERMINED != parent_mtds) {
            if (NIL != inference_worker_transformation.transformation_link_p(link)) {
                return propagate_mtds_via_transformation_link(parent_mtds, link, inference);
            }
            if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                return propagate_mtds_via_join_ordered_link(parent_mtds, link, inference);
            }
            if (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
                return propagate_mtds_via_residual_transformation_link(parent_mtds, link, inference);
            }
            if (NIL != inference_worker_split.split_link_p(link)) {
                return propagate_mtds_via_split_link(parent_mtds, link, inference);
            }
            if (NIL != inference_worker_restriction.restriction_link_p(link)) {
                return propagate_mtds_via_restriction_link(parent_mtds, link, inference);
            }
            if (NIL != inference_worker_union.union_link_p(link)) {
                return propagate_mtds_via_union_link(parent_mtds, link, inference);
            }
        }
        return NIL;
    }

    public static final SubLObject propagate_mtds_via_transformation_link_alt(SubLObject parent_mtds, SubLObject t_link, SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.single_literal_problem_query_depth_signature_p(parent_mtds)) {
                    Errors.error($str_alt4$Time_to_support__S_propagation, parent_mtds);
                }
            }
            if (NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(t_link)) {
                {
                    SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(t_link);
                    SubLObject supporting_problem_query = inference_datastructures_problem.problem_query(supporting_problem);
                    SubLObject parent_depth = parent_mtds;
                    SubLObject child_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.new_initial_pqds(supporting_problem_query, number_utilities.f_1X(parent_depth));
                    return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_min_transformation_depth_signature(supporting_problem, child_mtds, inference);
                }
            }
            return NIL;
        }
    }

    public static SubLObject propagate_mtds_via_transformation_link(final SubLObject parent_mtds, final SubLObject t_link, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == single_literal_problem_query_depth_signature_p(parent_mtds))) {
            Errors.error($str4$Time_to_support__S_propagation, parent_mtds);
        }
        if (NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(t_link)) {
            final SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(t_link);
            final SubLObject supporting_problem_query = inference_datastructures_problem.problem_query(supporting_problem);
            final SubLObject child_mtds = new_initial_pqds(supporting_problem_query, number_utilities.f_1X(parent_mtds));
            return propagate_min_transformation_depth_signature(supporting_problem, child_mtds, inference);
        }
        return NIL;
    }

    public static final SubLObject propagate_mtds_via_residual_transformation_link_alt(SubLObject parent_mtds, SubLObject rt_link, SubLObject inference) {
        {
            SubLObject residual_conjunction_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(rt_link);
            SubLObject child_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.compute_residual_transformation_mtds(parent_mtds, rt_link);
            if (NIL != child_mtds) {
                return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_min_transformation_depth_signature(residual_conjunction_problem, child_mtds, inference);
            }
        }
        return NIL;
    }

    public static SubLObject propagate_mtds_via_residual_transformation_link(final SubLObject parent_mtds, final SubLObject rt_link, final SubLObject inference) {
        final SubLObject residual_conjunction_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(rt_link);
        final SubLObject child_mtds = compute_residual_transformation_mtds(parent_mtds, rt_link);
        if (NIL != child_mtds) {
            return propagate_min_transformation_depth_signature(residual_conjunction_problem, child_mtds, inference);
        }
        return NIL;
    }

    public static final SubLObject compute_residual_transformation_mtds_alt(SubLObject parent_mtds, SubLObject rt_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject literal_map = inference_worker_residual_transformation.residual_transformation_link_residual_conjunction_literal_map(rt_link);
                SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
                SubLObject focal_spec = inference_worker_join_ordered.join_ordered_link_focal_supporting_problem_spec(jo_link);
                if (NIL != focal_spec) {
                    {
                        SubLObject focal_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.new_subclause_pqds(parent_mtds, focal_spec);
                        SubLObject transformed_depth = focal_mtds;
                        SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(rt_link);
                        SubLObject supporting_problem_query = inference_datastructures_problem.problem_query(supporting_problem);
                        SubLObject child_mtds = copy_tree(com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.new_initial_pqds(supporting_problem_query, number_utilities.f_1X(transformed_depth)));
                        child_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.napply_literal_map(parent_mtds, literal_map, child_mtds);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL != list_utilities.simple_tree_findP($TRANSFORMATION, child_mtds)) {
                                Errors.error($str_alt6$Propagation_error____S, child_mtds);
                            }
                        }
                        return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.intern_problem_query_depth_signature(child_mtds);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject compute_residual_transformation_mtds(final SubLObject parent_mtds, final SubLObject rt_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject literal_map = inference_worker_residual_transformation.residual_transformation_link_residual_conjunction_literal_map(rt_link);
        final SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
        final SubLObject focal_spec = inference_worker_join_ordered.join_ordered_link_focal_supporting_problem_spec(jo_link);
        if (NIL != focal_spec) {
            final SubLObject transformed_depth;
            final SubLObject focal_mtds = transformed_depth = new_subclause_pqds(parent_mtds, focal_spec);
            final SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(rt_link);
            final SubLObject supporting_problem_query = inference_datastructures_problem.problem_query(supporting_problem);
            SubLObject child_mtds = copy_tree(new_initial_pqds(supporting_problem_query, number_utilities.f_1X(transformed_depth)));
            child_mtds = napply_literal_map(parent_mtds, literal_map, child_mtds);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != list_utilities.simple_tree_findP($TRANSFORMATION, child_mtds))) {
                Errors.error($str6$Propagation_error____S, child_mtds);
            }
            return intern_problem_query_depth_signature(child_mtds);
        }
        return NIL;
    }

    public static final SubLObject propagate_mtds_via_join_ordered_link_alt(SubLObject parent_mtds, SubLObject jo_link, SubLObject inference) {
        {
            SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
            SubLObject focal_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.join_ordered_link_focal_mtds(jo_link, parent_mtds);
            if (NIL != focal_mtds) {
                com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_min_transformation_depth_signature(focal_problem, focal_mtds, inference);
                if (NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(jo_link)) {
                    {
                        SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(jo_link);
                        SubLObject non_focal_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.join_ordered_link_non_focal_mtds(jo_link, parent_mtds);
                        if (NIL != non_focal_mtds) {
                            com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_min_transformation_depth_signature(non_focal_problem, non_focal_mtds, inference);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject propagate_mtds_via_join_ordered_link(final SubLObject parent_mtds, final SubLObject jo_link, final SubLObject inference) {
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
        final SubLObject focal_mtds = join_ordered_link_focal_mtds(jo_link, parent_mtds);
        if (NIL != focal_mtds) {
            propagate_min_transformation_depth_signature(focal_problem, focal_mtds, inference);
            if (NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(jo_link)) {
                final SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(jo_link);
                final SubLObject non_focal_mtds = join_ordered_link_non_focal_mtds(jo_link, parent_mtds);
                if (NIL != non_focal_mtds) {
                    propagate_min_transformation_depth_signature(non_focal_problem, non_focal_mtds, inference);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject join_ordered_link_focal_mtds_alt(SubLObject jo_link, SubLObject parent_mtds) {
        {
            SubLObject focal_spec = inference_worker_join_ordered.join_ordered_link_focal_supporting_problem_spec(jo_link);
            if (NIL != focal_spec) {
                return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.new_subclause_pqds(parent_mtds, focal_spec);
            }
        }
        return NIL;
    }

    public static SubLObject join_ordered_link_focal_mtds(final SubLObject jo_link, final SubLObject parent_mtds) {
        final SubLObject focal_spec = inference_worker_join_ordered.join_ordered_link_focal_supporting_problem_spec(jo_link);
        if (NIL != focal_spec) {
            return new_subclause_pqds(parent_mtds, focal_spec);
        }
        return NIL;
    }

    public static final SubLObject join_ordered_link_non_focal_mtds_alt(SubLObject jo_link, SubLObject parent_mtds) {
        {
            SubLObject non_focal_spec = inference_worker_join_ordered.join_ordered_link_non_focal_supporting_problem_spec(jo_link);
            if (NIL != non_focal_spec) {
                return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.new_subclause_pqds(parent_mtds, non_focal_spec);
            }
        }
        return NIL;
    }

    public static SubLObject join_ordered_link_non_focal_mtds(final SubLObject jo_link, final SubLObject parent_mtds) {
        final SubLObject non_focal_spec = inference_worker_join_ordered.join_ordered_link_non_focal_supporting_problem_spec(jo_link);
        if (NIL != non_focal_spec) {
            return new_subclause_pqds(parent_mtds, non_focal_spec);
        }
        return NIL;
    }

    public static final SubLObject join_ordered_tactic_lookahead_mtds_alt(SubLObject jo_tactic, SubLObject parent_mtds) {
        {
            SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(jo_tactic);
            return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.join_ordered_link_focal_mtds(jo_link, parent_mtds);
        }
    }

    public static SubLObject join_ordered_tactic_lookahead_mtds(final SubLObject jo_tactic, final SubLObject parent_mtds) {
        final SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(jo_tactic);
        return join_ordered_link_focal_mtds(jo_link, parent_mtds);
    }

    public static final SubLObject propagate_mtds_via_split_link_alt(SubLObject parent_mtds, SubLObject split_link, SubLObject inference) {
        {
            SubLObject split_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
            SubLObject link_var = split_link;
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject conjunct_mapped_problem = NIL;
            for (conjunct_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct_mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, conjunct_mapped_problem)) {
                    {
                        SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
                        SubLObject conjunct_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.split_problem_conjunct_mtds(split_problem, conjunct_mapped_problem, parent_mtds);
                        conjunct_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.intern_problem_query_depth_signature(conjunct_mtds);
                        com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_min_transformation_depth_signature(conjunct_problem, conjunct_mtds, inference);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject propagate_mtds_via_split_link(final SubLObject parent_mtds, final SubLObject split_link, final SubLObject inference) {
        final SubLObject split_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject conjunct_mapped_problem = NIL;
        conjunct_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, conjunct_mapped_problem)) {
                final SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
                SubLObject conjunct_mtds = split_problem_conjunct_mtds(split_problem, conjunct_mapped_problem, parent_mtds);
                conjunct_mtds = intern_problem_query_depth_signature(conjunct_mtds);
                propagate_min_transformation_depth_signature(conjunct_problem, conjunct_mtds, inference);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct_mapped_problem = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject split_tactic_lookahead_mtds_alt(SubLObject split_tactic, SubLObject parent_mtds) {
        {
            SubLObject split_problem = inference_datastructures_tactic.tactic_problem(split_tactic);
            SubLObject conjunct_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(split_tactic);
            SubLObject conjunct_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.split_problem_conjunct_mtds(split_problem, conjunct_mapped_problem, parent_mtds);
            return conjunct_mtds;
        }
    }

    public static SubLObject split_tactic_lookahead_mtds(final SubLObject split_tactic, final SubLObject parent_mtds) {
        final SubLObject split_problem = inference_datastructures_tactic.tactic_problem(split_tactic);
        final SubLObject conjunct_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(split_tactic);
        final SubLObject conjunct_mtds = split_problem_conjunct_mtds(split_problem, conjunct_mapped_problem, parent_mtds);
        return conjunct_mtds;
    }

    public static final SubLObject split_problem_conjunct_mtds_alt(SubLObject split_problem, SubLObject conjunct_mapped_problem, SubLObject parent_mtds) {
        {
            SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
            SubLObject literal_map = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.split_problem_conjunct_literal_map(split_problem, conjunct_mapped_problem);
            SubLObject conjunct_mtds = copy_tree(com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.new_initial_pqds(inference_datastructures_problem.problem_query(conjunct_problem), $UNINITIALIZED));
            conjunct_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.napply_literal_map(parent_mtds, literal_map, conjunct_mtds);
            return conjunct_mtds;
        }
    }

    public static SubLObject split_problem_conjunct_mtds(final SubLObject split_problem, final SubLObject conjunct_mapped_problem, final SubLObject parent_mtds) {
        final SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
        final SubLObject literal_map = split_problem_conjunct_literal_map(split_problem, conjunct_mapped_problem);
        SubLObject conjunct_mtds = copy_tree(new_initial_pqds(inference_datastructures_problem.problem_query(conjunct_problem), $UNINITIALIZED));
        conjunct_mtds = napply_literal_map(parent_mtds, literal_map, conjunct_mtds);
        return conjunct_mtds;
    }

    public static final SubLObject split_problem_conjunct_literal_map_alt(SubLObject split_problem, SubLObject conjunct_mapped_problem) {
        {
            SubLObject split_problem_query = inference_datastructures_problem.problem_query(split_problem);
            SubLObject split_problem_clause = split_problem_query.first();
            SubLObject conjunct_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(conjunct_mapped_problem);
            SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
            SubLObject conjunct_problem_query = inference_datastructures_problem.problem_query(conjunct_problem);
            SubLObject conjunct_problem_clause = conjunct_problem_query.first();
            SubLObject conjunct_problem_clause_wrt_split = bindings.apply_bindings(conjunct_variable_map, conjunct_problem_clause);
            return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.new_subclause_literal_map(split_problem_clause, conjunct_problem_clause_wrt_split, UNPROVIDED);
        }
    }

    public static SubLObject split_problem_conjunct_literal_map(final SubLObject split_problem, final SubLObject conjunct_mapped_problem) {
        final SubLObject split_problem_query = inference_datastructures_problem.problem_query(split_problem);
        final SubLObject split_problem_clause = split_problem_query.first();
        final SubLObject conjunct_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(conjunct_mapped_problem);
        final SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
        final SubLObject conjunct_problem_query = inference_datastructures_problem.problem_query(conjunct_problem);
        final SubLObject conjunct_problem_clause = conjunct_problem_query.first();
        final SubLObject conjunct_problem_clause_wrt_split = bindings.apply_bindings(conjunct_variable_map, conjunct_problem_clause);
        return new_subclause_literal_map(split_problem_clause, conjunct_problem_clause_wrt_split, UNPROVIDED);
    }

    public static final SubLObject propagate_mtds_via_restriction_link_alt(SubLObject parent_mtds, SubLObject restriction_link, SubLObject inference) {
        {
            SubLObject restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
            SubLObject restricted_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.restriction_link_restricted_mtds(restriction_link, parent_mtds);
            return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_min_transformation_depth_signature(restricted_problem, restricted_mtds, inference);
        }
    }

    public static SubLObject propagate_mtds_via_restriction_link(final SubLObject parent_mtds, final SubLObject restriction_link, final SubLObject inference) {
        final SubLObject restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
        final SubLObject restricted_mtds = restriction_link_restricted_mtds(restriction_link, parent_mtds);
        return propagate_min_transformation_depth_signature(restricted_problem, restricted_mtds, inference);
    }

    public static final SubLObject restriction_link_restricted_mtds_alt(SubLObject restriction_link, SubLObject parent_mtds) {
        if (NIL != inference_datastructures_problem.single_literal_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link))) {
            return parent_mtds;
        }
        {
            SubLObject restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
            SubLObject literal_map = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.restriction_link_literal_map(restriction_link);
            SubLObject restricted_mtds = copy_tree(com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.new_initial_pqds(inference_datastructures_problem.problem_query(restricted_problem), $UNINITIALIZED));
            restricted_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.napply_literal_map(parent_mtds, literal_map, restricted_mtds);
            return restricted_mtds;
        }
    }

    public static SubLObject restriction_link_restricted_mtds(final SubLObject restriction_link, final SubLObject parent_mtds) {
        if (NIL != inference_datastructures_problem.single_literal_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link))) {
            return parent_mtds;
        }
        final SubLObject restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
        final SubLObject literal_map = restriction_link_literal_map(restriction_link);
        SubLObject restricted_mtds = copy_tree(new_initial_pqds(inference_datastructures_problem.problem_query(restricted_problem), $UNINITIALIZED));
        restricted_mtds = napply_literal_map(parent_mtds, literal_map, restricted_mtds);
        return restricted_mtds;
    }

    public static final SubLObject restriction_link_literal_map_alt(SubLObject restriction_link) {
        {
            SubLObject unrestricted_clause = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link)).first();
            SubLObject restriction_bindings = inference_worker_restriction.restriction_link_bindings(restriction_link);
            SubLObject unrestricted_clause_qua_restricted = bindings.apply_bindings(restriction_bindings, unrestricted_clause);
            SubLObject restricted_mapped_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link);
            SubLObject restricted_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(restricted_mapped_problem);
            SubLObject restricted_clause = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem)).first();
            SubLObject restricted_clause_qua_unrestricted = bindings.apply_bindings(restricted_variable_map, restricted_clause);
            SubLObject literal_map = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.compute_restricted_clause_literal_map(unrestricted_clause_qua_restricted, restricted_clause_qua_unrestricted);
            return literal_map;
        }
    }

    public static SubLObject restriction_link_literal_map(final SubLObject restriction_link) {
        final SubLObject unrestricted_clause = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link)).first();
        final SubLObject restriction_bindings = inference_worker_restriction.restriction_link_bindings(restriction_link);
        final SubLObject unrestricted_clause_qua_restricted = bindings.apply_bindings(restriction_bindings, unrestricted_clause);
        final SubLObject restricted_mapped_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link);
        final SubLObject restricted_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(restricted_mapped_problem);
        final SubLObject restricted_clause = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem)).first();
        final SubLObject restricted_clause_qua_unrestricted = bindings.apply_bindings(restricted_variable_map, restricted_clause);
        final SubLObject literal_map = compute_restricted_clause_literal_map(unrestricted_clause_qua_restricted, restricted_clause_qua_unrestricted);
        return literal_map;
    }

    public static final SubLObject compute_restricted_clause_literal_map_alt(SubLObject unrestricted_clause, SubLObject restricted_clause) {
        {
            SubLObject literal_map = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.compute_clause_literal_map(unrestricted_clause, restricted_clause);
            if ((NIL != list_utilities.member_eqP(NIL, literal_map.first())) || (NIL != list_utilities.member_eqP(NIL, second(literal_map)))) {
                unrestricted_clause = inference_czer.inference_simplify_contextualized_dnf_clause(copy_tree(unrestricted_clause));
                literal_map = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.compute_clause_literal_map(unrestricted_clause, restricted_clause);
            }
            return literal_map;
        }
    }

    public static SubLObject compute_restricted_clause_literal_map(SubLObject unrestricted_clause, final SubLObject restricted_clause) {
        SubLObject literal_map = compute_clause_literal_map(unrestricted_clause, restricted_clause);
        if ((NIL != subl_promotions.memberP(NIL, literal_map.first(), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(NIL, second(literal_map), UNPROVIDED, UNPROVIDED))) {
            unrestricted_clause = inference_czer.inference_simplify_contextualized_dnf_clause(copy_tree(unrestricted_clause));
            literal_map = compute_clause_literal_map(unrestricted_clause, restricted_clause);
        }
        return literal_map;
    }

    /**
     * Compute a mapping between the literals in the PARENT-CLAUSE to CHILD-CLAUSE.
     */
    @LispMethod(comment = "Compute a mapping between the literals in the PARENT-CLAUSE to CHILD-CLAUSE.")
    public static final SubLObject compute_clause_literal_map_alt(SubLObject parent_clause, SubLObject child_clause) {
        {
            SubLObject datum = parent_clause;
            SubLObject current = datum;
            SubLObject parent_neg_lits = NIL;
            SubLObject parent_pos_lits = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            parent_neg_lits = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt8);
            parent_pos_lits = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_1 = child_clause;
                    SubLObject current_2 = datum_1;
                    SubLObject child_neg_lits = NIL;
                    SubLObject child_pos_lits = NIL;
                    destructuring_bind_must_consp(current_2, datum_1, $list_alt9);
                    child_neg_lits = current_2.first();
                    current_2 = current_2.rest();
                    destructuring_bind_must_consp(current_2, datum_1, $list_alt9);
                    child_pos_lits = current_2.first();
                    current_2 = current_2.rest();
                    if (NIL == current_2) {
                        {
                            SubLObject neg_lit_map = NIL;
                            SubLObject pos_lit_map = NIL;
                            {
                                SubLObject cdolist_list_var = parent_neg_lits;
                                SubLObject parent_neg_lit = NIL;
                                for (parent_neg_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_neg_lit = cdolist_list_var.first()) {
                                    {
                                        SubLObject child_index = position(parent_neg_lit, child_neg_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        neg_lit_map = cons(child_index, neg_lit_map);
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = parent_pos_lits;
                                SubLObject parent_pos_lit = NIL;
                                for (parent_pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parent_pos_lit = cdolist_list_var.first()) {
                                    {
                                        SubLObject child_index = position(parent_pos_lit, child_pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        pos_lit_map = cons(child_index, pos_lit_map);
                                    }
                                }
                            }
                            pos_lit_map = nreverse(pos_lit_map);
                            {
                                SubLObject literal_map = list(neg_lit_map, pos_lit_map);
                                return literal_map;
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum_1, $list_alt9);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt8);
            }
        }
        return NIL;
    }

    /**
     * Compute a mapping between the literals in the PARENT-CLAUSE to CHILD-CLAUSE.
     */
    @LispMethod(comment = "Compute a mapping between the literals in the PARENT-CLAUSE to CHILD-CLAUSE.")
    public static SubLObject compute_clause_literal_map(final SubLObject parent_clause, final SubLObject child_clause) {
        SubLObject parent_neg_lits = NIL;
        SubLObject parent_pos_lits = NIL;
        destructuring_bind_must_consp(parent_clause, parent_clause, $list8);
        parent_neg_lits = parent_clause.first();
        SubLObject current = parent_clause.rest();
        destructuring_bind_must_consp(current, parent_clause, $list8);
        parent_pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject child_neg_lits = NIL;
            SubLObject child_pos_lits = NIL;
            destructuring_bind_must_consp(child_clause, child_clause, $list9);
            child_neg_lits = child_clause.first();
            SubLObject current_$8 = child_clause.rest();
            destructuring_bind_must_consp(current_$8, child_clause, $list9);
            child_pos_lits = current_$8.first();
            current_$8 = current_$8.rest();
            if (NIL == current_$8) {
                SubLObject neg_lit_map = NIL;
                SubLObject pos_lit_map = NIL;
                SubLObject cdolist_list_var = parent_neg_lits;
                SubLObject parent_neg_lit = NIL;
                parent_neg_lit = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject child_index = position(parent_neg_lit, child_neg_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    neg_lit_map = cons(child_index, neg_lit_map);
                    cdolist_list_var = cdolist_list_var.rest();
                    parent_neg_lit = cdolist_list_var.first();
                } 
                cdolist_list_var = parent_pos_lits;
                SubLObject parent_pos_lit = NIL;
                parent_pos_lit = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject child_index = position(parent_pos_lit, child_pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    pos_lit_map = cons(child_index, pos_lit_map);
                    cdolist_list_var = cdolist_list_var.rest();
                    parent_pos_lit = cdolist_list_var.first();
                } 
                pos_lit_map = nreverse(pos_lit_map);
                final SubLObject literal_map = list(neg_lit_map, pos_lit_map);
                return literal_map;
            }
            cdestructuring_bind_error(child_clause, $list9);
        } else {
            cdestructuring_bind_error(parent_clause, $list8);
        }
        return NIL;
    }

    public static final SubLObject propagate_mtds_via_union_link_alt(SubLObject parent_mtds, SubLObject union_link, SubLObject inference) {
        {
            SubLObject disjunct_problem = inference_worker_union.union_link_supporting_problem(union_link);
            SubLObject disjunct_problem_query = inference_datastructures_problem.problem_query(disjunct_problem);
            SubLObject disjunct_mtds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.new_initial_pqds(disjunct_problem_query, ZERO_INTEGER);
            return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.propagate_min_transformation_depth_signature(disjunct_problem, disjunct_mtds, inference);
        }
    }

    public static SubLObject propagate_mtds_via_union_link(final SubLObject parent_mtds, final SubLObject union_link, final SubLObject inference) {
        final SubLObject disjunct_problem = inference_worker_union.union_link_supporting_problem(union_link);
        final SubLObject disjunct_problem_query = inference_datastructures_problem.problem_query(disjunct_problem);
        final SubLObject disjunct_mtds = new_initial_pqds(disjunct_problem_query, ZERO_INTEGER);
        return propagate_min_transformation_depth_signature(disjunct_problem, disjunct_mtds, inference);
    }

    public static final SubLObject union_tactic_lookahead_mtds_alt(SubLObject union_tactic, SubLObject parent_mtds) {
        SubLTrampolineFile.checkType(parent_mtds, MULTI_CLAUSE_PROBLEM_QUERY_DEPTH_SIGNATURE_P);
        {
            SubLObject index = inference_worker_union.union_tactic_disjunct_index(union_tactic);
            return nth(index, parent_mtds);
        }
    }

    public static SubLObject union_tactic_lookahead_mtds(final SubLObject union_tactic, final SubLObject parent_mtds) {
        assert NIL != multi_clause_problem_query_depth_signature_p(parent_mtds) : "! inference_min_transformation_depth.multi_clause_problem_query_depth_signature_p(parent_mtds) " + ("inference_min_transformation_depth.multi_clause_problem_query_depth_signature_p(parent_mtds) " + "CommonSymbols.NIL != inference_min_transformation_depth.multi_clause_problem_query_depth_signature_p(parent_mtds) ") + parent_mtds;
        final SubLObject index = inference_worker_union.union_tactic_disjunct_index(union_tactic);
        return nth(index, parent_mtds);
    }

    /**
     * Return T iff OBJECT is a problem query depth signature.
     */
    @LispMethod(comment = "Return T iff OBJECT is a problem query depth signature.")
    public static final SubLObject problem_query_depth_signature_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.single_literal_problem_query_depth_signature_p(v_object)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.multi_literal_problem_query_depth_signature_p(v_object))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.multi_clause_problem_query_depth_signature_p(v_object)));
    }

    /**
     * Return T iff OBJECT is a problem query depth signature.
     */
    @LispMethod(comment = "Return T iff OBJECT is a problem query depth signature.")
    public static SubLObject problem_query_depth_signature_p(final SubLObject v_object) {
        return makeBoolean(((NIL != single_literal_problem_query_depth_signature_p(v_object)) || (NIL != multi_literal_problem_query_depth_signature_p(v_object))) || (NIL != multi_clause_problem_query_depth_signature_p(v_object)));
    }

    public static final SubLObject single_literal_problem_query_depth_signature_p_alt(SubLObject v_object) {
        return non_negative_integer_p(v_object);
    }

    public static SubLObject single_literal_problem_query_depth_signature_p(final SubLObject v_object) {
        return subl_promotions.non_negative_integer_p(v_object);
    }

    public static final SubLObject multi_literal_problem_query_depth_signature_p_alt(SubLObject v_object) {
        return makeBoolean(((((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && v_object.first().isList()) && (NIL != list_utilities.every_in_list(SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, v_object.first(), UNPROVIDED))) && second(v_object).isList()) && (NIL != list_utilities.every_in_list(SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, second(v_object), UNPROVIDED)));
    }

    public static SubLObject multi_literal_problem_query_depth_signature_p(final SubLObject v_object) {
        return makeBoolean(((((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && v_object.first().isList()) && (NIL != list_utilities.every_in_list(SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, v_object.first(), UNPROVIDED))) && second(v_object).isList()) && (NIL != list_utilities.every_in_list(SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, second(v_object), UNPROVIDED)));
    }

    public static final SubLObject multi_clause_problem_query_depth_signature_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isCons() && (NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, v_object, UNPROVIDED)));
    }

    public static SubLObject multi_clause_problem_query_depth_signature_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && (NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, v_object, UNPROVIDED)));
    }

    public static final SubLObject clear_intern_problem_query_depth_signature_alt() {
        {
            SubLObject cs = $intern_problem_query_depth_signature_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_intern_problem_query_depth_signature() {
        final SubLObject cs = $intern_problem_query_depth_signature_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_intern_problem_query_depth_signature_alt(SubLObject pqds) {
        return memoization_state.caching_state_remove_function_results_with_args($intern_problem_query_depth_signature_caching_state$.getGlobalValue(), list(pqds), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_intern_problem_query_depth_signature(final SubLObject pqds) {
        return memoization_state.caching_state_remove_function_results_with_args($intern_problem_query_depth_signature_caching_state$.getGlobalValue(), list(pqds), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject intern_problem_query_depth_signature_internal_alt(SubLObject pqds) {
        SubLTrampolineFile.checkType(pqds, PROBLEM_QUERY_DEPTH_SIGNATURE_P);
        return copy_tree(pqds);
    }

    public static SubLObject intern_problem_query_depth_signature_internal(final SubLObject pqds) {
        assert NIL != problem_query_depth_signature_p(pqds) : "! inference_min_transformation_depth.problem_query_depth_signature_p(pqds) " + ("inference_min_transformation_depth.problem_query_depth_signature_p(pqds) " + "CommonSymbols.NIL != inference_min_transformation_depth.problem_query_depth_signature_p(pqds) ") + pqds;
        return copy_tree(pqds);
    }

    public static final SubLObject intern_problem_query_depth_signature_alt(SubLObject pqds) {
        {
            SubLObject caching_state = $intern_problem_query_depth_signature_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE, $intern_problem_query_depth_signature_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, pqds, $kw16$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw16$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.intern_problem_query_depth_signature_internal(pqds)));
                    memoization_state.caching_state_put(caching_state, pqds, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject intern_problem_query_depth_signature(final SubLObject pqds) {
        SubLObject caching_state = $intern_problem_query_depth_signature_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE, $intern_problem_query_depth_signature_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pqds, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(intern_problem_query_depth_signature_internal(pqds)));
            memoization_state.caching_state_put(caching_state, pqds, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject new_initial_pqds_alt(SubLObject problem_query, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (NIL != inference_datastructures_problem_query.single_literal_problem_query_p(problem_query)) {
            return depth;
        } else {
            if (NIL != list_utilities.singletonP(problem_query)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.new_initial_clause_pqds(problem_query.first(), depth);
            } else {
                {
                    SubLObject clause_pqds_list = NIL;
                    SubLObject cdolist_list_var = problem_query;
                    SubLObject contextualized_clause = NIL;
                    for (contextualized_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_clause = cdolist_list_var.first()) {
                        clause_pqds_list = cons(com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.new_initial_clause_pqds(contextualized_clause, depth), clause_pqds_list);
                    }
                    clause_pqds_list = nreverse(clause_pqds_list);
                    if (depth.isInteger()) {
                        clause_pqds_list = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.intern_problem_query_depth_signature(clause_pqds_list);
                    }
                    return clause_pqds_list;
                }
            }
        }
    }

    public static SubLObject new_initial_pqds(final SubLObject problem_query, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (NIL != inference_datastructures_problem_query.single_literal_problem_query_p(problem_query)) {
            return depth;
        }
        if (NIL != list_utilities.singletonP(problem_query)) {
            return new_initial_clause_pqds(problem_query.first(), depth);
        }
        SubLObject clause_pqds_list = NIL;
        SubLObject cdolist_list_var = problem_query;
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            clause_pqds_list = cons(new_initial_clause_pqds(contextualized_clause, depth), clause_pqds_list);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        } 
        clause_pqds_list = nreverse(clause_pqds_list);
        if (depth.isInteger()) {
            clause_pqds_list = intern_problem_query_depth_signature(clause_pqds_list);
        }
        return clause_pqds_list;
    }

    public static final SubLObject new_initial_clause_pqds_alt(SubLObject contextualized_clause, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        {
            SubLObject pqds = list(make_list(length(clauses.neg_lits(contextualized_clause)), depth), make_list(length(clauses.pos_lits(contextualized_clause)), depth));
            if (depth.isInteger()) {
                pqds = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.intern_problem_query_depth_signature(pqds);
            }
            return pqds;
        }
    }

    public static SubLObject new_initial_clause_pqds(final SubLObject contextualized_clause, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        SubLObject pqds = list(make_list(length(clauses.neg_lits(contextualized_clause)), depth), make_list(length(clauses.pos_lits(contextualized_clause)), depth));
        if (depth.isInteger()) {
            pqds = intern_problem_query_depth_signature(pqds);
        }
        return pqds;
    }

    public static final SubLObject new_subclause_pqds_alt(SubLObject parent_pqds, SubLObject subclause_spec) {
        SubLTrampolineFile.checkType(parent_pqds, MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P);
        {
            SubLObject datum = parent_pqds;
            SubLObject current = datum;
            SubLObject neg_lit_pqds = NIL;
            SubLObject pos_lit_pqds = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            neg_lit_pqds = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            pos_lit_pqds = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_3 = subclause_spec;
                    SubLObject current_4 = datum_3;
                    SubLObject neg_lit_specs = NIL;
                    SubLObject pos_lit_specs = NIL;
                    destructuring_bind_must_consp(current_4, datum_3, $list_alt18);
                    neg_lit_specs = current_4.first();
                    current_4 = current_4.rest();
                    destructuring_bind_must_consp(current_4, datum_3, $list_alt18);
                    pos_lit_specs = current_4.first();
                    current_4 = current_4.rest();
                    if (NIL == current_4) {
                        {
                            SubLObject result_neg_lit_pqds = NIL;
                            SubLObject result_pos_lit_pqds = NIL;
                            {
                                SubLObject cdolist_list_var = neg_lit_specs;
                                SubLObject neg_lit_spec = NIL;
                                for (neg_lit_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , neg_lit_spec = cdolist_list_var.first()) {
                                    result_neg_lit_pqds = cons(nth(neg_lit_spec, neg_lit_pqds), result_neg_lit_pqds);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = pos_lit_specs;
                                SubLObject pos_lit_spec = NIL;
                                for (pos_lit_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit_spec = cdolist_list_var.first()) {
                                    result_pos_lit_pqds = cons(nth(pos_lit_spec, pos_lit_pqds), result_pos_lit_pqds);
                                }
                            }
                            result_neg_lit_pqds = nreverse(result_neg_lit_pqds);
                            result_pos_lit_pqds = nreverse(result_pos_lit_pqds);
                            if ((NIL == result_neg_lit_pqds) && (NIL != list_utilities.singletonP(result_pos_lit_pqds))) {
                                return result_pos_lit_pqds.first();
                            }
                            if ((NIL == result_pos_lit_pqds) && (NIL != list_utilities.singletonP(result_neg_lit_pqds))) {
                                return result_neg_lit_pqds.first();
                            }
                            return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.intern_problem_query_depth_signature(list(result_neg_lit_pqds, result_pos_lit_pqds));
                        }
                    } else {
                        cdestructuring_bind_error(datum_3, $list_alt18);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt17);
            }
        }
        return NIL;
    }

    public static SubLObject new_subclause_pqds(final SubLObject parent_pqds, final SubLObject subclause_spec) {
        assert NIL != multi_literal_problem_query_depth_signature_p(parent_pqds) : "! inference_min_transformation_depth.multi_literal_problem_query_depth_signature_p(parent_pqds) " + ("inference_min_transformation_depth.multi_literal_problem_query_depth_signature_p(parent_pqds) " + "CommonSymbols.NIL != inference_min_transformation_depth.multi_literal_problem_query_depth_signature_p(parent_pqds) ") + parent_pqds;
        SubLObject neg_lit_pqds = NIL;
        SubLObject pos_lit_pqds = NIL;
        destructuring_bind_must_consp(parent_pqds, parent_pqds, $list16);
        neg_lit_pqds = parent_pqds.first();
        SubLObject current = parent_pqds.rest();
        destructuring_bind_must_consp(current, parent_pqds, $list16);
        pos_lit_pqds = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject neg_lit_specs = NIL;
            SubLObject pos_lit_specs = NIL;
            destructuring_bind_must_consp(subclause_spec, subclause_spec, $list17);
            neg_lit_specs = subclause_spec.first();
            SubLObject current_$10 = subclause_spec.rest();
            destructuring_bind_must_consp(current_$10, subclause_spec, $list17);
            pos_lit_specs = current_$10.first();
            current_$10 = current_$10.rest();
            if (NIL == current_$10) {
                SubLObject result_neg_lit_pqds = NIL;
                SubLObject result_pos_lit_pqds = NIL;
                SubLObject cdolist_list_var = neg_lit_specs;
                SubLObject neg_lit_spec = NIL;
                neg_lit_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_neg_lit_pqds = cons(nth(neg_lit_spec, neg_lit_pqds), result_neg_lit_pqds);
                    cdolist_list_var = cdolist_list_var.rest();
                    neg_lit_spec = cdolist_list_var.first();
                } 
                cdolist_list_var = pos_lit_specs;
                SubLObject pos_lit_spec = NIL;
                pos_lit_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_pos_lit_pqds = cons(nth(pos_lit_spec, pos_lit_pqds), result_pos_lit_pqds);
                    cdolist_list_var = cdolist_list_var.rest();
                    pos_lit_spec = cdolist_list_var.first();
                } 
                result_neg_lit_pqds = nreverse(result_neg_lit_pqds);
                result_pos_lit_pqds = nreverse(result_pos_lit_pqds);
                if ((NIL == result_neg_lit_pqds) && (NIL != list_utilities.singletonP(result_pos_lit_pqds))) {
                    return result_pos_lit_pqds.first();
                }
                if ((NIL == result_pos_lit_pqds) && (NIL != list_utilities.singletonP(result_neg_lit_pqds))) {
                    return result_neg_lit_pqds.first();
                }
                return intern_problem_query_depth_signature(list(result_neg_lit_pqds, result_pos_lit_pqds));
            } else {
                cdestructuring_bind_error(subclause_spec, $list17);
            }
        } else {
            cdestructuring_bind_error(parent_pqds, $list16);
        }
        return NIL;
    }

    public static final SubLObject clear_pqds_depth_alt() {
        {
            SubLObject cs = $pqds_depth_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_pqds_depth() {
        final SubLObject cs = $pqds_depth_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_pqds_depth_alt(SubLObject pqds, SubLObject mode) {
        return memoization_state.caching_state_remove_function_results_with_args($pqds_depth_caching_state$.getGlobalValue(), list(pqds, mode), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_pqds_depth(final SubLObject pqds, final SubLObject mode) {
        return memoization_state.caching_state_remove_function_results_with_args($pqds_depth_caching_state$.getGlobalValue(), list(pqds, mode), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pqds_depth_internal_alt(SubLObject pqds, SubLObject mode) {
        {
            SubLObject pcase_var = mode;
            if (pcase_var.eql($UNINTUITIVE)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_min_number(pqds);
            } else {
                if (pcase_var.eql($INTUITIVE)) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_sum(pqds);
                } else {
                    return Errors.error($str_alt22$unexpected_mode__S, mode);
                }
            }
        }
    }

    public static SubLObject pqds_depth_internal(final SubLObject pqds, final SubLObject mode) {
        if (mode.eql($UNINTUITIVE)) {
            return tree_min_number(pqds);
        }
        if (mode.eql($INTUITIVE)) {
            return tree_sum(pqds);
        }
        return Errors.error($str21$unexpected_mode__S, mode);
    }

    public static final SubLObject pqds_depth_alt(SubLObject pqds, SubLObject mode) {
        {
            SubLObject caching_state = $pqds_depth_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PQDS_DEPTH, $pqds_depth_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(pqds, mode);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw16$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (pqds.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mode.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.pqds_depth_internal(pqds, mode)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pqds, mode));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject pqds_depth(final SubLObject pqds, final SubLObject mode) {
        SubLObject caching_state = $pqds_depth_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PQDS_DEPTH, $pqds_depth_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pqds, mode);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pqds.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mode.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pqds_depth_internal(pqds, mode)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pqds, mode));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject pqds_merge_alt(SubLObject pqds1, SubLObject pqds2) {
        if (pqds1.equal(pqds2)) {
            return pqds1;
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.single_literal_problem_query_depth_signature_p(pqds1)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.single_literal_pqds_merge(pqds1, pqds2);
            } else {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.multi_literal_problem_query_depth_signature_p(pqds1)) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.multi_literal_pqds_merge(pqds1, pqds2);
                } else {
                    return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.multi_clause_pqds_merge(pqds1, pqds2);
                }
            }
        }
    }

    public static SubLObject pqds_merge(final SubLObject pqds1, final SubLObject pqds2) {
        if (pqds1.equal(pqds2)) {
            return pqds1;
        }
        if (NIL != single_literal_problem_query_depth_signature_p(pqds1)) {
            return single_literal_pqds_merge(pqds1, pqds2);
        }
        if (NIL != multi_literal_problem_query_depth_signature_p(pqds1)) {
            return multi_literal_pqds_merge(pqds1, pqds2);
        }
        return multi_clause_pqds_merge(pqds1, pqds2);
    }

    public static final SubLObject single_literal_pqds_merge_alt(SubLObject pqds1, SubLObject pqds2) {
        return min(pqds1, pqds2);
    }

    public static SubLObject single_literal_pqds_merge(final SubLObject pqds1, final SubLObject pqds2) {
        return min(pqds1, pqds2);
    }

    public static final SubLObject multi_literal_pqds_merge_alt(SubLObject pqds1, SubLObject pqds2) {
        {
            SubLObject merged_neg_pqds = NIL;
            SubLObject merged_pos_pqds = NIL;
            {
                SubLObject lit_pqds1 = NIL;
                SubLObject lit_pqds1_5 = NIL;
                SubLObject lit_pqds2 = NIL;
                SubLObject lit_pqds2_6 = NIL;
                for (lit_pqds1 = clauses.neg_lits(pqds1), lit_pqds1_5 = lit_pqds1.first(), lit_pqds2 = clauses.neg_lits(pqds2), lit_pqds2_6 = lit_pqds2.first(); !((NIL == lit_pqds2) && (NIL == lit_pqds1)); lit_pqds1 = lit_pqds1.rest() , lit_pqds1_5 = lit_pqds1.first() , lit_pqds2 = lit_pqds2.rest() , lit_pqds2_6 = lit_pqds2.first()) {
                    merged_neg_pqds = cons(com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.single_literal_pqds_merge(lit_pqds1_5, lit_pqds2_6), merged_neg_pqds);
                }
            }
            {
                SubLObject lit_pqds1 = NIL;
                SubLObject lit_pqds1_7 = NIL;
                SubLObject lit_pqds2 = NIL;
                SubLObject lit_pqds2_8 = NIL;
                for (lit_pqds1 = clauses.pos_lits(pqds1), lit_pqds1_7 = lit_pqds1.first(), lit_pqds2 = clauses.pos_lits(pqds2), lit_pqds2_8 = lit_pqds2.first(); !((NIL == lit_pqds2) && (NIL == lit_pqds1)); lit_pqds1 = lit_pqds1.rest() , lit_pqds1_7 = lit_pqds1.first() , lit_pqds2 = lit_pqds2.rest() , lit_pqds2_8 = lit_pqds2.first()) {
                    merged_pos_pqds = cons(com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.single_literal_pqds_merge(lit_pqds1_7, lit_pqds2_8), merged_pos_pqds);
                }
            }
            {
                SubLObject merged_pqds = list(nreverse(merged_neg_pqds), nreverse(merged_pos_pqds));
                return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.intern_problem_query_depth_signature(merged_pqds);
            }
        }
    }

    public static SubLObject multi_literal_pqds_merge(final SubLObject pqds1, final SubLObject pqds2) {
        SubLObject merged_neg_pqds = NIL;
        SubLObject merged_pos_pqds = NIL;
        SubLObject lit_pqds1 = NIL;
        SubLObject lit_pqds1_$11 = NIL;
        SubLObject lit_pqds2 = NIL;
        SubLObject lit_pqds2_$12 = NIL;
        lit_pqds1 = clauses.neg_lits(pqds1);
        lit_pqds1_$11 = lit_pqds1.first();
        lit_pqds2 = clauses.neg_lits(pqds2);
        lit_pqds2_$12 = lit_pqds2.first();
        while ((NIL != lit_pqds2) || (NIL != lit_pqds1)) {
            merged_neg_pqds = cons(single_literal_pqds_merge(lit_pqds1_$11, lit_pqds2_$12), merged_neg_pqds);
            lit_pqds1 = lit_pqds1.rest();
            lit_pqds1_$11 = lit_pqds1.first();
            lit_pqds2 = lit_pqds2.rest();
            lit_pqds2_$12 = lit_pqds2.first();
        } 
        lit_pqds1 = NIL;
        SubLObject lit_pqds1_$12 = NIL;
        lit_pqds2 = NIL;
        SubLObject lit_pqds2_$13 = NIL;
        lit_pqds1 = clauses.pos_lits(pqds1);
        lit_pqds1_$12 = lit_pqds1.first();
        lit_pqds2 = clauses.pos_lits(pqds2);
        lit_pqds2_$13 = lit_pqds2.first();
        while ((NIL != lit_pqds2) || (NIL != lit_pqds1)) {
            merged_pos_pqds = cons(single_literal_pqds_merge(lit_pqds1_$12, lit_pqds2_$13), merged_pos_pqds);
            lit_pqds1 = lit_pqds1.rest();
            lit_pqds1_$12 = lit_pqds1.first();
            lit_pqds2 = lit_pqds2.rest();
            lit_pqds2_$13 = lit_pqds2.first();
        } 
        final SubLObject merged_pqds = list(nreverse(merged_neg_pqds), nreverse(merged_pos_pqds));
        return intern_problem_query_depth_signature(merged_pqds);
    }

    public static final SubLObject multi_clause_pqds_merge_alt(SubLObject pqds1, SubLObject pqds2) {
        {
            SubLObject merged_pqds = NIL;
            SubLObject clause_pqds1 = NIL;
            SubLObject clause_pqds1_9 = NIL;
            SubLObject clause_pqds2 = NIL;
            SubLObject clause_pqds2_10 = NIL;
            for (clause_pqds1 = pqds1, clause_pqds1_9 = clause_pqds1.first(), clause_pqds2 = pqds2, clause_pqds2_10 = clause_pqds2.first(); !((NIL == clause_pqds2) && (NIL == clause_pqds1)); clause_pqds1 = clause_pqds1.rest() , clause_pqds1_9 = clause_pqds1.first() , clause_pqds2 = clause_pqds2.rest() , clause_pqds2_10 = clause_pqds2.first()) {
                merged_pqds = cons(com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.pqds_merge(clause_pqds1_9, clause_pqds2_10), merged_pqds);
            }
            merged_pqds = nreverse(merged_pqds);
            return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.intern_problem_query_depth_signature(merged_pqds);
        }
    }

    public static SubLObject multi_clause_pqds_merge(final SubLObject pqds1, final SubLObject pqds2) {
        SubLObject merged_pqds = NIL;
        SubLObject clause_pqds1 = NIL;
        SubLObject clause_pqds1_$15 = NIL;
        SubLObject clause_pqds2 = NIL;
        SubLObject clause_pqds2_$16 = NIL;
        clause_pqds1 = pqds1;
        clause_pqds1_$15 = clause_pqds1.first();
        clause_pqds2 = pqds2;
        clause_pqds2_$16 = clause_pqds2.first();
        while ((NIL != clause_pqds2) || (NIL != clause_pqds1)) {
            merged_pqds = cons(pqds_merge(clause_pqds1_$15, clause_pqds2_$16), merged_pqds);
            clause_pqds1 = clause_pqds1.rest();
            clause_pqds1_$15 = clause_pqds1.first();
            clause_pqds2 = clause_pqds2.rest();
            clause_pqds2_$16 = clause_pqds2.first();
        } 
        merged_pqds = nreverse(merged_pqds);
        return intern_problem_query_depth_signature(merged_pqds);
    }

    public static final SubLObject new_subclause_literal_map_alt(SubLObject clause, SubLObject subclause, SubLObject missing) {
        if (missing == UNPROVIDED) {
            missing = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = clause;
                SubLObject current = datum;
                SubLObject clause_neg_lits = NIL;
                SubLObject clause_pos_lits = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt24);
                clause_neg_lits = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt24);
                clause_pos_lits = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject datum_11 = subclause;
                        SubLObject current_12 = datum_11;
                        SubLObject subclause_neg_lits = NIL;
                        SubLObject subclause_pos_lits = NIL;
                        destructuring_bind_must_consp(current_12, datum_11, $list_alt25);
                        subclause_neg_lits = current_12.first();
                        current_12 = current_12.rest();
                        destructuring_bind_must_consp(current_12, datum_11, $list_alt25);
                        subclause_pos_lits = current_12.first();
                        current_12 = current_12.rest();
                        if (NIL == current_12) {
                            {
                                SubLObject map_neg_lits = make_list(length(clause_neg_lits), missing);
                                SubLObject map_pos_lits = make_list(length(clause_pos_lits), missing);
                                {
                                    SubLObject list_var = NIL;
                                    SubLObject clause_lit = NIL;
                                    SubLObject clause_index = NIL;
                                    for (list_var = clause_neg_lits, clause_lit = list_var.first(), clause_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , clause_lit = list_var.first() , clause_index = add(ONE_INTEGER, clause_index)) {
                                        {
                                            SubLObject subclause_index = position(clause_lit, subclause_neg_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (subclause_index.isInteger()) {
                                                set_nth(clause_index, map_neg_lits, subclause_index);
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject list_var = NIL;
                                    SubLObject clause_lit = NIL;
                                    SubLObject clause_index = NIL;
                                    for (list_var = clause_pos_lits, clause_lit = list_var.first(), clause_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , clause_lit = list_var.first() , clause_index = add(ONE_INTEGER, clause_index)) {
                                        {
                                            SubLObject subclause_index = position(clause_lit, subclause_pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (subclause_index.isInteger()) {
                                                set_nth(clause_index, map_pos_lits, subclause_index);
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject literal_map = list(map_neg_lits, map_pos_lits);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == list_utilities.tree_find_if(symbol_function(INTEGERP), literal_map, UNPROVIDED)) {
                                            Errors.error($str_alt27$Failed_literal_map__S, literal_map);
                                        }
                                    }
                                    return literal_map;
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum_11, $list_alt25);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt24);
                }
            }
            return NIL;
        }
    }

    public static SubLObject new_subclause_literal_map(final SubLObject clause, final SubLObject subclause, SubLObject missing) {
        if (missing == UNPROVIDED) {
            missing = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject clause_neg_lits = NIL;
        SubLObject clause_pos_lits = NIL;
        destructuring_bind_must_consp(clause, clause, $list23);
        clause_neg_lits = clause.first();
        SubLObject current = clause.rest();
        destructuring_bind_must_consp(current, clause, $list23);
        clause_pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject subclause_neg_lits = NIL;
            SubLObject subclause_pos_lits = NIL;
            destructuring_bind_must_consp(subclause, subclause, $list24);
            subclause_neg_lits = subclause.first();
            SubLObject current_$18 = subclause.rest();
            destructuring_bind_must_consp(current_$18, subclause, $list24);
            subclause_pos_lits = current_$18.first();
            current_$18 = current_$18.rest();
            if (NIL == current_$18) {
                final SubLObject map_neg_lits = make_list(length(clause_neg_lits), missing);
                final SubLObject map_pos_lits = make_list(length(clause_pos_lits), missing);
                SubLObject list_var = NIL;
                SubLObject clause_lit = NIL;
                SubLObject clause_index = NIL;
                list_var = clause_neg_lits;
                clause_lit = list_var.first();
                for (clause_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , clause_lit = list_var.first() , clause_index = add(ONE_INTEGER, clause_index)) {
                    final SubLObject subclause_index = position(clause_lit, subclause_neg_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (subclause_index.isInteger()) {
                        set_nth(clause_index, map_neg_lits, subclause_index);
                    }
                }
                list_var = NIL;
                clause_lit = NIL;
                clause_index = NIL;
                list_var = clause_pos_lits;
                clause_lit = list_var.first();
                for (clause_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , clause_lit = list_var.first() , clause_index = add(ONE_INTEGER, clause_index)) {
                    final SubLObject subclause_index = position(clause_lit, subclause_pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (subclause_index.isInteger()) {
                        set_nth(clause_index, map_pos_lits, subclause_index);
                    }
                }
                final SubLObject literal_map = list(map_neg_lits, map_pos_lits);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.tree_find_if(symbol_function(INTEGERP), literal_map, UNPROVIDED))) {
                    Errors.error($str26$Failed_literal_map__S, literal_map);
                }
                return literal_map;
            }
            cdestructuring_bind_error(subclause, $list24);
        } else {
            cdestructuring_bind_error(clause, $list23);
        }
        return NIL;
    }

    public static final SubLObject napply_literal_map_alt(SubLObject source_mtds, SubLObject literal_map, SubLObject target_mtds) {
        {
            SubLObject datum = source_mtds;
            SubLObject current = datum;
            SubLObject source_neg_mtds_list = NIL;
            SubLObject source_pos_mtds_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            source_neg_mtds_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt28);
            source_pos_mtds_list = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_13 = literal_map;
                    SubLObject current_14 = datum_13;
                    SubLObject neg_lit_map = NIL;
                    SubLObject pos_lit_map = NIL;
                    destructuring_bind_must_consp(current_14, datum_13, $list_alt29);
                    neg_lit_map = current_14.first();
                    current_14 = current_14.rest();
                    destructuring_bind_must_consp(current_14, datum_13, $list_alt29);
                    pos_lit_map = current_14.first();
                    current_14 = current_14.rest();
                    if (NIL == current_14) {
                        {
                            SubLObject target_neg_mtds_list = (target_mtds.isCons()) ? ((SubLObject) (target_mtds.first())) : NIL;
                            SubLObject target_pos_mtds_list = (target_mtds.isCons()) ? ((SubLObject) (second(target_mtds))) : NIL;
                            SubLObject source_neg_mtds = NIL;
                            SubLObject source_neg_mtds_15 = NIL;
                            SubLObject neg_index = NIL;
                            SubLObject neg_index_16 = NIL;
                            for (source_neg_mtds = source_neg_mtds_list, source_neg_mtds_15 = source_neg_mtds.first(), neg_index = neg_lit_map, neg_index_16 = neg_index.first(); !((NIL == neg_index) && (NIL == source_neg_mtds)); source_neg_mtds = source_neg_mtds.rest() , source_neg_mtds_15 = source_neg_mtds.first() , neg_index = neg_index.rest() , neg_index_16 = neg_index.first()) {
                                if (neg_index_16.isInteger()) {
                                    if (target_mtds.isCons()) {
                                        set_nth(neg_index_16, target_neg_mtds_list, source_neg_mtds_15);
                                    } else {
                                        target_mtds = source_neg_mtds_15;
                                    }
                                }
                            }
                            {
                                SubLObject source_pos_mtds = NIL;
                                SubLObject source_pos_mtds_17 = NIL;
                                SubLObject pos_index = NIL;
                                SubLObject pos_index_18 = NIL;
                                for (source_pos_mtds = source_pos_mtds_list, source_pos_mtds_17 = source_pos_mtds.first(), pos_index = pos_lit_map, pos_index_18 = pos_index.first(); !((NIL == pos_index) && (NIL == source_pos_mtds)); source_pos_mtds = source_pos_mtds.rest() , source_pos_mtds_17 = source_pos_mtds.first() , pos_index = pos_index.rest() , pos_index_18 = pos_index.first()) {
                                    if (pos_index_18.isInteger()) {
                                        if (target_mtds.isCons()) {
                                            set_nth(pos_index_18, target_pos_mtds_list, source_pos_mtds_17);
                                        } else {
                                            target_mtds = source_pos_mtds_17;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum_13, $list_alt29);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt28);
            }
        }
        return target_mtds;
    }

    public static SubLObject napply_literal_map(final SubLObject source_mtds, final SubLObject literal_map, SubLObject target_mtds) {
        SubLObject source_neg_mtds_list = NIL;
        SubLObject source_pos_mtds_list = NIL;
        destructuring_bind_must_consp(source_mtds, source_mtds, $list27);
        source_neg_mtds_list = source_mtds.first();
        SubLObject current = source_mtds.rest();
        destructuring_bind_must_consp(current, source_mtds, $list27);
        source_pos_mtds_list = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject neg_lit_map = NIL;
            SubLObject pos_lit_map = NIL;
            destructuring_bind_must_consp(literal_map, literal_map, $list28);
            neg_lit_map = literal_map.first();
            SubLObject current_$20 = literal_map.rest();
            destructuring_bind_must_consp(current_$20, literal_map, $list28);
            pos_lit_map = current_$20.first();
            current_$20 = current_$20.rest();
            if (NIL == current_$20) {
                final SubLObject target_neg_mtds_list = (target_mtds.isCons()) ? target_mtds.first() : NIL;
                final SubLObject target_pos_mtds_list = (target_mtds.isCons()) ? second(target_mtds) : NIL;
                SubLObject source_neg_mtds = NIL;
                SubLObject source_neg_mtds_$21 = NIL;
                SubLObject neg_index = NIL;
                SubLObject neg_index_$22 = NIL;
                source_neg_mtds = source_neg_mtds_list;
                source_neg_mtds_$21 = source_neg_mtds.first();
                neg_index = neg_lit_map;
                neg_index_$22 = neg_index.first();
                while ((NIL != neg_index) || (NIL != source_neg_mtds)) {
                    if (neg_index_$22.isInteger()) {
                        if (target_mtds.isCons()) {
                            set_nth(neg_index_$22, target_neg_mtds_list, source_neg_mtds_$21);
                        } else {
                            target_mtds = source_neg_mtds_$21;
                        }
                    }
                    source_neg_mtds = source_neg_mtds.rest();
                    source_neg_mtds_$21 = source_neg_mtds.first();
                    neg_index = neg_index.rest();
                    neg_index_$22 = neg_index.first();
                } 
                SubLObject source_pos_mtds = NIL;
                SubLObject source_pos_mtds_$23 = NIL;
                SubLObject pos_index = NIL;
                SubLObject pos_index_$24 = NIL;
                source_pos_mtds = source_pos_mtds_list;
                source_pos_mtds_$23 = source_pos_mtds.first();
                pos_index = pos_lit_map;
                pos_index_$24 = pos_index.first();
                while ((NIL != pos_index) || (NIL != source_pos_mtds)) {
                    if (pos_index_$24.isInteger()) {
                        if (target_mtds.isCons()) {
                            set_nth(pos_index_$24, target_pos_mtds_list, source_pos_mtds_$23);
                        } else {
                            target_mtds = source_pos_mtds_$23;
                        }
                    }
                    source_pos_mtds = source_pos_mtds.rest();
                    source_pos_mtds_$23 = source_pos_mtds.first();
                    pos_index = pos_index.rest();
                    pos_index_$24 = pos_index.first();
                } 
            } else {
                cdestructuring_bind_error(literal_map, $list28);
            }
        } else {
            cdestructuring_bind_error(source_mtds, $list27);
        }
        return target_mtds;
    }

    /**
     * Return the sum of all numbers in TREE.
     */
    @LispMethod(comment = "Return the sum of all numbers in TREE.")
    public static final SubLObject tree_sum_alt(SubLObject tree) {
        return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_sum_recursive(tree, ZERO_INTEGER);
    }

    /**
     * Return the sum of all numbers in TREE.
     */
    @LispMethod(comment = "Return the sum of all numbers in TREE.")
    public static SubLObject tree_sum(final SubLObject tree) {
        return tree_sum_recursive(tree, ZERO_INTEGER);
    }

    public static final SubLObject tree_sum_recursive_alt(SubLObject tree, SubLObject accumulator) {
        if (tree.isNumber()) {
            accumulator = add(accumulator, tree);
        } else {
            if (tree.isAtom()) {
            } else {
                {
                    SubLObject sublist = NIL;
                    SubLObject first = NIL;
                    for (sublist = tree, first = sublist.first(); !sublist.rest().isAtom(); sublist = sublist.rest() , first = sublist.first()) {
                        accumulator = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_sum_recursive(first, accumulator);
                    }
                    accumulator = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_sum_recursive(sublist.first(), accumulator);
                    accumulator = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_sum_recursive(sublist.rest(), accumulator);
                }
            }
        }
        return accumulator;
    }

    public static SubLObject tree_sum_recursive(final SubLObject tree, SubLObject accumulator) {
        if (tree.isNumber()) {
            accumulator = add(accumulator, tree);
        } else
            if (!tree.isAtom()) {
                SubLObject sublist = NIL;
                SubLObject first = NIL;
                sublist = tree;
                first = sublist.first();
                while (!sublist.rest().isAtom()) {
                    accumulator = tree_sum_recursive(first, accumulator);
                    sublist = sublist.rest();
                    first = sublist.first();
                } 
                accumulator = tree_sum_recursive(sublist.first(), accumulator);
                accumulator = tree_sum_recursive(sublist.rest(), accumulator);
            }

        return accumulator;
    }

    /**
     * Return the lowest number TREE.
     */
    @LispMethod(comment = "Return the lowest number TREE.")
    public static final SubLObject tree_min_number_alt(SubLObject tree) {
        return com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_min_number_recursive(tree, $POSITIVE_INFINITY);
    }

    /**
     * Return the lowest number TREE.
     */
    @LispMethod(comment = "Return the lowest number TREE.")
    public static SubLObject tree_min_number(final SubLObject tree) {
        return tree_min_number_recursive(tree, $POSITIVE_INFINITY);
    }

    public static final SubLObject tree_min_number_recursive_alt(SubLObject tree, SubLObject lowest) {
        if (NIL != number_utilities.potentially_infinite_number_p(tree)) {
            lowest = number_utilities.potentially_infinite_number_min(lowest, tree);
        } else {
            if (tree.isAtom()) {
            } else {
                {
                    SubLObject sublist = NIL;
                    SubLObject first = NIL;
                    for (sublist = tree, first = sublist.first(); !sublist.rest().isAtom(); sublist = sublist.rest() , first = sublist.first()) {
                        lowest = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_min_number_recursive(first, lowest);
                    }
                    lowest = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_min_number_recursive(sublist.first(), lowest);
                    lowest = com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth.tree_min_number_recursive(sublist.rest(), lowest);
                }
            }
        }
        return lowest;
    }

    public static SubLObject tree_min_number_recursive(final SubLObject tree, SubLObject lowest) {
        if (NIL != number_utilities.potentially_infinite_number_p(tree)) {
            lowest = number_utilities.potentially_infinite_number_min(lowest, tree);
        } else
            if (!tree.isAtom()) {
                SubLObject sublist = NIL;
                SubLObject first = NIL;
                sublist = tree;
                first = sublist.first();
                while (!sublist.rest().isAtom()) {
                    lowest = tree_min_number_recursive(first, lowest);
                    sublist = sublist.rest();
                    first = sublist.first();
                } 
                lowest = tree_min_number_recursive(sublist.first(), lowest);
                lowest = tree_min_number_recursive(sublist.rest(), lowest);
            }

        return lowest;
    }

    public static final SubLObject declare_inference_min_transformation_depth_file_alt() {
        declareFunction("problem_min_transformation_depth_from_signature", "PROBLEM-MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 2, 0, false);
        declareFunction("min_transformation_depth_from_signature", "MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 1, 0, false);
        declareFunction("logical_tactic_lookahead_min_transformation_depth", "LOGICAL-TACTIC-LOOKAHEAD-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction("propagate_min_transformation_depth_signature_via_link", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK", 1, 0, false);
        declareFunction("propagate_min_transformation_depth_signature", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
        declareFunction("propagate_min_transformation_depth_signature_via_link_wrt_inference", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK-WRT-INFERENCE", 2, 0, false);
        declareFunction("propagate_mtds_via_transformation_link", "PROPAGATE-MTDS-VIA-TRANSFORMATION-LINK", 3, 0, false);
        declareFunction("propagate_mtds_via_residual_transformation_link", "PROPAGATE-MTDS-VIA-RESIDUAL-TRANSFORMATION-LINK", 3, 0, false);
        declareFunction("compute_residual_transformation_mtds", "COMPUTE-RESIDUAL-TRANSFORMATION-MTDS", 2, 0, false);
        declareFunction("propagate_mtds_via_join_ordered_link", "PROPAGATE-MTDS-VIA-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction("join_ordered_link_focal_mtds", "JOIN-ORDERED-LINK-FOCAL-MTDS", 2, 0, false);
        declareFunction("join_ordered_link_non_focal_mtds", "JOIN-ORDERED-LINK-NON-FOCAL-MTDS", 2, 0, false);
        declareFunction("join_ordered_tactic_lookahead_mtds", "JOIN-ORDERED-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        declareFunction("propagate_mtds_via_split_link", "PROPAGATE-MTDS-VIA-SPLIT-LINK", 3, 0, false);
        declareFunction("split_tactic_lookahead_mtds", "SPLIT-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        declareFunction("split_problem_conjunct_mtds", "SPLIT-PROBLEM-CONJUNCT-MTDS", 3, 0, false);
        declareFunction("split_problem_conjunct_literal_map", "SPLIT-PROBLEM-CONJUNCT-LITERAL-MAP", 2, 0, false);
        declareFunction("propagate_mtds_via_restriction_link", "PROPAGATE-MTDS-VIA-RESTRICTION-LINK", 3, 0, false);
        declareFunction("restriction_link_restricted_mtds", "RESTRICTION-LINK-RESTRICTED-MTDS", 2, 0, false);
        declareFunction("restriction_link_literal_map", "RESTRICTION-LINK-LITERAL-MAP", 1, 0, false);
        declareFunction("compute_restricted_clause_literal_map", "COMPUTE-RESTRICTED-CLAUSE-LITERAL-MAP", 2, 0, false);
        declareFunction("compute_clause_literal_map", "COMPUTE-CLAUSE-LITERAL-MAP", 2, 0, false);
        declareFunction("propagate_mtds_via_union_link", "PROPAGATE-MTDS-VIA-UNION-LINK", 3, 0, false);
        declareFunction("union_tactic_lookahead_mtds", "UNION-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        declareFunction("problem_query_depth_signature_p", "PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction("single_literal_problem_query_depth_signature_p", "SINGLE-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction("multi_literal_problem_query_depth_signature_p", "MULTI-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction("multi_clause_problem_query_depth_signature_p", "MULTI-CLAUSE-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction("clear_intern_problem_query_depth_signature", "CLEAR-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 0, 0, false);
        declareFunction("remove_intern_problem_query_depth_signature", "REMOVE-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
        declareFunction("intern_problem_query_depth_signature_internal", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-INTERNAL", 1, 0, false);
        declareFunction("intern_problem_query_depth_signature", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
        declareFunction("new_initial_pqds", "NEW-INITIAL-PQDS", 1, 1, false);
        declareFunction("new_initial_clause_pqds", "NEW-INITIAL-CLAUSE-PQDS", 1, 1, false);
        declareFunction("new_subclause_pqds", "NEW-SUBCLAUSE-PQDS", 2, 0, false);
        declareFunction("clear_pqds_depth", "CLEAR-PQDS-DEPTH", 0, 0, false);
        declareFunction("remove_pqds_depth", "REMOVE-PQDS-DEPTH", 2, 0, false);
        declareFunction("pqds_depth_internal", "PQDS-DEPTH-INTERNAL", 2, 0, false);
        declareFunction("pqds_depth", "PQDS-DEPTH", 2, 0, false);
        declareFunction("pqds_merge", "PQDS-MERGE", 2, 0, false);
        declareFunction("single_literal_pqds_merge", "SINGLE-LITERAL-PQDS-MERGE", 2, 0, false);
        declareFunction("multi_literal_pqds_merge", "MULTI-LITERAL-PQDS-MERGE", 2, 0, false);
        declareFunction("multi_clause_pqds_merge", "MULTI-CLAUSE-PQDS-MERGE", 2, 0, false);
        declareFunction("new_subclause_literal_map", "NEW-SUBCLAUSE-LITERAL-MAP", 2, 1, false);
        declareFunction("napply_literal_map", "NAPPLY-LITERAL-MAP", 3, 0, false);
        declareFunction("tree_sum", "TREE-SUM", 1, 0, false);
        declareFunction("tree_sum_recursive", "TREE-SUM-RECURSIVE", 2, 0, false);
        declareFunction("tree_min_number", "TREE-MIN-NUMBER", 1, 0, false);
        declareFunction("tree_min_number_recursive", "TREE-MIN-NUMBER-RECURSIVE", 2, 0, false);
        declareFunction("validate_problem_store_wrt_mtsd", "VALIDATE-PROBLEM-STORE-WRT-MTSD", 1, 1, false);
        declareFunction("validate_min_transformation_depth_signature_propagation", "VALIDATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-PROPAGATION", 1, 1, false);
        return NIL;
    }

    public static SubLObject declare_inference_min_transformation_depth_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("problem_min_transformation_depth_from_signature", "PROBLEM-MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 2, 0, false);
            declareFunction("min_transformation_depth_from_signature", "MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 1, 0, false);
            declareFunction("logical_tactic_lookahead_min_transformation_depth", "LOGICAL-TACTIC-LOOKAHEAD-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
            declareFunction("propagate_min_transformation_depth_signature_via_link", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK", 1, 0, false);
            declareFunction("propagate_min_transformation_depth_signature", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
            declareFunction("propagate_min_transformation_depth_signature_via_link_wrt_inference", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK-WRT-INFERENCE", 2, 0, false);
            declareFunction("propagate_mtds_via_transformation_link", "PROPAGATE-MTDS-VIA-TRANSFORMATION-LINK", 3, 0, false);
            declareFunction("propagate_mtds_via_residual_transformation_link", "PROPAGATE-MTDS-VIA-RESIDUAL-TRANSFORMATION-LINK", 3, 0, false);
            declareFunction("compute_residual_transformation_mtds", "COMPUTE-RESIDUAL-TRANSFORMATION-MTDS", 2, 0, false);
            declareFunction("propagate_mtds_via_join_ordered_link", "PROPAGATE-MTDS-VIA-JOIN-ORDERED-LINK", 3, 0, false);
            declareFunction("join_ordered_link_focal_mtds", "JOIN-ORDERED-LINK-FOCAL-MTDS", 2, 0, false);
            declareFunction("join_ordered_link_non_focal_mtds", "JOIN-ORDERED-LINK-NON-FOCAL-MTDS", 2, 0, false);
            declareFunction("join_ordered_tactic_lookahead_mtds", "JOIN-ORDERED-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
            declareFunction("propagate_mtds_via_split_link", "PROPAGATE-MTDS-VIA-SPLIT-LINK", 3, 0, false);
            declareFunction("split_tactic_lookahead_mtds", "SPLIT-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
            declareFunction("split_problem_conjunct_mtds", "SPLIT-PROBLEM-CONJUNCT-MTDS", 3, 0, false);
            declareFunction("split_problem_conjunct_literal_map", "SPLIT-PROBLEM-CONJUNCT-LITERAL-MAP", 2, 0, false);
            declareFunction("propagate_mtds_via_restriction_link", "PROPAGATE-MTDS-VIA-RESTRICTION-LINK", 3, 0, false);
            declareFunction("restriction_link_restricted_mtds", "RESTRICTION-LINK-RESTRICTED-MTDS", 2, 0, false);
            declareFunction("restriction_link_literal_map", "RESTRICTION-LINK-LITERAL-MAP", 1, 0, false);
            declareFunction("compute_restricted_clause_literal_map", "COMPUTE-RESTRICTED-CLAUSE-LITERAL-MAP", 2, 0, false);
            declareFunction("compute_clause_literal_map", "COMPUTE-CLAUSE-LITERAL-MAP", 2, 0, false);
            declareFunction("propagate_mtds_via_union_link", "PROPAGATE-MTDS-VIA-UNION-LINK", 3, 0, false);
            declareFunction("union_tactic_lookahead_mtds", "UNION-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
            declareFunction("problem_query_depth_signature_p", "PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
            declareFunction("single_literal_problem_query_depth_signature_p", "SINGLE-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
            declareFunction("multi_literal_problem_query_depth_signature_p", "MULTI-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
            declareFunction("multi_clause_problem_query_depth_signature_p", "MULTI-CLAUSE-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
            declareFunction("clear_intern_problem_query_depth_signature", "CLEAR-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 0, 0, false);
            declareFunction("remove_intern_problem_query_depth_signature", "REMOVE-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
            declareFunction("intern_problem_query_depth_signature_internal", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-INTERNAL", 1, 0, false);
            declareFunction("intern_problem_query_depth_signature", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
            declareFunction("new_initial_pqds", "NEW-INITIAL-PQDS", 1, 1, false);
            declareFunction("new_initial_clause_pqds", "NEW-INITIAL-CLAUSE-PQDS", 1, 1, false);
            declareFunction("new_subclause_pqds", "NEW-SUBCLAUSE-PQDS", 2, 0, false);
            declareFunction("clear_pqds_depth", "CLEAR-PQDS-DEPTH", 0, 0, false);
            declareFunction("remove_pqds_depth", "REMOVE-PQDS-DEPTH", 2, 0, false);
            declareFunction("pqds_depth_internal", "PQDS-DEPTH-INTERNAL", 2, 0, false);
            declareFunction("pqds_depth", "PQDS-DEPTH", 2, 0, false);
            declareFunction("pqds_merge", "PQDS-MERGE", 2, 0, false);
            declareFunction("single_literal_pqds_merge", "SINGLE-LITERAL-PQDS-MERGE", 2, 0, false);
            declareFunction("multi_literal_pqds_merge", "MULTI-LITERAL-PQDS-MERGE", 2, 0, false);
            declareFunction("multi_clause_pqds_merge", "MULTI-CLAUSE-PQDS-MERGE", 2, 0, false);
            declareFunction("new_subclause_literal_map", "NEW-SUBCLAUSE-LITERAL-MAP", 2, 1, false);
            declareFunction("napply_literal_map", "NAPPLY-LITERAL-MAP", 3, 0, false);
            declareFunction("tree_sum", "TREE-SUM", 1, 0, false);
            declareFunction("tree_sum_recursive", "TREE-SUM-RECURSIVE", 2, 0, false);
            declareFunction("tree_min_number", "TREE-MIN-NUMBER", 1, 0, false);
            declareFunction("tree_min_number_recursive", "TREE-MIN-NUMBER-RECURSIVE", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("validate_problem_store_wrt_mtsd", "VALIDATE-PROBLEM-STORE-WRT-MTSD", 1, 1, false);
            declareFunction("validate_min_transformation_depth_signature_propagation", "VALIDATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-PROPAGATION", 1, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_min_transformation_depth_file_Previous() {
        declareFunction("problem_min_transformation_depth_from_signature", "PROBLEM-MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 2, 0, false);
        declareFunction("min_transformation_depth_from_signature", "MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 1, 0, false);
        declareFunction("logical_tactic_lookahead_min_transformation_depth", "LOGICAL-TACTIC-LOOKAHEAD-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction("propagate_min_transformation_depth_signature_via_link", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK", 1, 0, false);
        declareFunction("propagate_min_transformation_depth_signature", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
        declareFunction("propagate_min_transformation_depth_signature_via_link_wrt_inference", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK-WRT-INFERENCE", 2, 0, false);
        declareFunction("propagate_mtds_via_transformation_link", "PROPAGATE-MTDS-VIA-TRANSFORMATION-LINK", 3, 0, false);
        declareFunction("propagate_mtds_via_residual_transformation_link", "PROPAGATE-MTDS-VIA-RESIDUAL-TRANSFORMATION-LINK", 3, 0, false);
        declareFunction("compute_residual_transformation_mtds", "COMPUTE-RESIDUAL-TRANSFORMATION-MTDS", 2, 0, false);
        declareFunction("propagate_mtds_via_join_ordered_link", "PROPAGATE-MTDS-VIA-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction("join_ordered_link_focal_mtds", "JOIN-ORDERED-LINK-FOCAL-MTDS", 2, 0, false);
        declareFunction("join_ordered_link_non_focal_mtds", "JOIN-ORDERED-LINK-NON-FOCAL-MTDS", 2, 0, false);
        declareFunction("join_ordered_tactic_lookahead_mtds", "JOIN-ORDERED-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        declareFunction("propagate_mtds_via_split_link", "PROPAGATE-MTDS-VIA-SPLIT-LINK", 3, 0, false);
        declareFunction("split_tactic_lookahead_mtds", "SPLIT-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        declareFunction("split_problem_conjunct_mtds", "SPLIT-PROBLEM-CONJUNCT-MTDS", 3, 0, false);
        declareFunction("split_problem_conjunct_literal_map", "SPLIT-PROBLEM-CONJUNCT-LITERAL-MAP", 2, 0, false);
        declareFunction("propagate_mtds_via_restriction_link", "PROPAGATE-MTDS-VIA-RESTRICTION-LINK", 3, 0, false);
        declareFunction("restriction_link_restricted_mtds", "RESTRICTION-LINK-RESTRICTED-MTDS", 2, 0, false);
        declareFunction("restriction_link_literal_map", "RESTRICTION-LINK-LITERAL-MAP", 1, 0, false);
        declareFunction("compute_restricted_clause_literal_map", "COMPUTE-RESTRICTED-CLAUSE-LITERAL-MAP", 2, 0, false);
        declareFunction("compute_clause_literal_map", "COMPUTE-CLAUSE-LITERAL-MAP", 2, 0, false);
        declareFunction("propagate_mtds_via_union_link", "PROPAGATE-MTDS-VIA-UNION-LINK", 3, 0, false);
        declareFunction("union_tactic_lookahead_mtds", "UNION-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        declareFunction("problem_query_depth_signature_p", "PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction("single_literal_problem_query_depth_signature_p", "SINGLE-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction("multi_literal_problem_query_depth_signature_p", "MULTI-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction("multi_clause_problem_query_depth_signature_p", "MULTI-CLAUSE-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction("clear_intern_problem_query_depth_signature", "CLEAR-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 0, 0, false);
        declareFunction("remove_intern_problem_query_depth_signature", "REMOVE-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
        declareFunction("intern_problem_query_depth_signature_internal", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-INTERNAL", 1, 0, false);
        declareFunction("intern_problem_query_depth_signature", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
        declareFunction("new_initial_pqds", "NEW-INITIAL-PQDS", 1, 1, false);
        declareFunction("new_initial_clause_pqds", "NEW-INITIAL-CLAUSE-PQDS", 1, 1, false);
        declareFunction("new_subclause_pqds", "NEW-SUBCLAUSE-PQDS", 2, 0, false);
        declareFunction("clear_pqds_depth", "CLEAR-PQDS-DEPTH", 0, 0, false);
        declareFunction("remove_pqds_depth", "REMOVE-PQDS-DEPTH", 2, 0, false);
        declareFunction("pqds_depth_internal", "PQDS-DEPTH-INTERNAL", 2, 0, false);
        declareFunction("pqds_depth", "PQDS-DEPTH", 2, 0, false);
        declareFunction("pqds_merge", "PQDS-MERGE", 2, 0, false);
        declareFunction("single_literal_pqds_merge", "SINGLE-LITERAL-PQDS-MERGE", 2, 0, false);
        declareFunction("multi_literal_pqds_merge", "MULTI-LITERAL-PQDS-MERGE", 2, 0, false);
        declareFunction("multi_clause_pqds_merge", "MULTI-CLAUSE-PQDS-MERGE", 2, 0, false);
        declareFunction("new_subclause_literal_map", "NEW-SUBCLAUSE-LITERAL-MAP", 2, 1, false);
        declareFunction("napply_literal_map", "NAPPLY-LITERAL-MAP", 3, 0, false);
        declareFunction("tree_sum", "TREE-SUM", 1, 0, false);
        declareFunction("tree_sum_recursive", "TREE-SUM-RECURSIVE", 2, 0, false);
        declareFunction("tree_min_number", "TREE-MIN-NUMBER", 1, 0, false);
        declareFunction("tree_min_number_recursive", "TREE-MIN-NUMBER-RECURSIVE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_min_transformation_depth_file() {
        deflexical("*INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-CACHING-STATE*", NIL);
        deflexical("*PQDS-DEPTH-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_min_transformation_depth_file() {
        memoization_state.note_globally_cached_function(INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE);
        memoization_state.note_globally_cached_function(PQDS_DEPTH);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_min_transformation_depth_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_min_transformation_depth_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_min_transformation_depth_file();
    }

    static {
    }

    static private final SubLString $str_alt2$Unexpected_logical_tactic____S = makeString("Unexpected logical-tactic : ~S");

    static private final SubLString $str_alt4$Time_to_support__S_propagation = makeString("Time to support ~S propagation");

    static private final SubLString $str_alt6$Propagation_error____S = makeString("Propagation error : ~S");

    static private final SubLList $list_alt8 = list(makeSymbol("PARENT-NEG-LITS"), makeSymbol("PARENT-POS-LITS"));

    static private final SubLList $list_alt9 = list(makeSymbol("CHILD-NEG-LITS"), makeSymbol("CHILD-POS-LITS"));

    public static final SubLSymbol $kw16$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt17 = list(makeSymbol("NEG-LIT-PQDS"), makeSymbol("POS-LIT-PQDS"));

    static private final SubLList $list_alt18 = list(makeSymbol("NEG-LIT-SPECS"), makeSymbol("POS-LIT-SPECS"));

    static private final SubLString $str_alt22$unexpected_mode__S = makeString("unexpected mode ~S");

    static private final SubLList $list_alt24 = list(makeSymbol("CLAUSE-NEG-LITS"), makeSymbol("CLAUSE-POS-LITS"));

    static private final SubLList $list_alt25 = list(makeSymbol("SUBCLAUSE-NEG-LITS"), makeSymbol("SUBCLAUSE-POS-LITS"));

    static private final SubLString $str_alt27$Failed_literal_map__S = makeString("Failed literal map ~S");

    static private final SubLList $list_alt28 = list(makeSymbol("SOURCE-NEG-MTDS-LIST"), makeSymbol("SOURCE-POS-MTDS-LIST"));

    static private final SubLList $list_alt29 = list(makeSymbol("NEG-LIT-MAP"), makeSymbol("POS-LIT-MAP"));

    static private final SubLString $str_alt32$__old__S_new__S_signature__S___S = makeString("~%old ~S new ~S signature ~S~%~S");

    static private final SubLSymbol $sym33$_ = makeSymbol("<");

    static private final SubLString $str_alt35$___S = makeString("~%~S");
}

/**
 * Total time: 179 ms
 */
