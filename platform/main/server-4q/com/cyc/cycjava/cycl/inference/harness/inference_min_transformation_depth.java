package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_min_transformation_depth extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth";
    public static String myFingerPrint = "23a015a86d90f6a105c0c18def8a11bfe885098156d4339a63baadae13bddaa2";
    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16500L)
    private static SubLSymbol $intern_problem_query_depth_signature_caching_state$;
    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18700L)
    private static SubLSymbol $pqds_depth_caching_state$;
    private static SubLSymbol $UNDETERMINED;
    private static SubLSymbol $COUNTERINTUITIVE;
    private static SubLString $str2$Unexpected_logical_tactic____S;
    private static SubLSymbol $SKIP;
    private static SubLString $str4$Time_to_support__S_propagation;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLString $str6$Propagation_error____S;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLList $list8;
    private static SubLList $list9;
    private static SubLSymbol $sym10$MULTI_CLAUSE_PROBLEM_QUERY_DEPTH_SIGNATURE_P;
    private static SubLSymbol $sym11$SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P;
    private static SubLSymbol $sym12$MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P;
    private static SubLSymbol $sym13$INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE;
    private static SubLSymbol $sym14$PROBLEM_QUERY_DEPTH_SIGNATURE_P;
    private static SubLSymbol $sym15$_INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE_CACHING_STATE_;
    private static SubLList $list16;
    private static SubLList $list17;
    private static SubLSymbol $sym18$PQDS_DEPTH;
    private static SubLSymbol $UNINTUITIVE;
    private static SubLSymbol $INTUITIVE;
    private static SubLString $str21$unexpected_mode__S;
    private static SubLSymbol $sym22$_PQDS_DEPTH_CACHING_STATE_;
    private static SubLList $list23;
    private static SubLList $list24;
    private static SubLSymbol $sym25$INTEGERP;
    private static SubLString $str26$Failed_literal_map__S;
    private static SubLList $list27;
    private static SubLList $list28;
    private static SubLSymbol $POSITIVE_INFINITY;

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 1000L)
    public static SubLObject problem_min_transformation_depth_from_signature(SubLObject problem, SubLObject inference) {
        SubLObject signature = inference_datastructures_problem.problem_min_transformation_depth_signature(problem, inference);
        return min_transformation_depth_from_signature(signature);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 1500L)
    public static SubLObject min_transformation_depth_from_signature(SubLObject signature) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ($UNDETERMINED == signature) {
            return $UNDETERMINED;
        }
        if (inference_datastructures_problem.$transformation_depth_computation$.getDynamicValue(thread) == $COUNTERINTUITIVE) {
            return tree_min_number(signature);
        }
        return tree_sum(signature);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 1800L)
    public static SubLObject logical_tactic_lookahead_min_transformation_depth(SubLObject logical_tactic, SubLObject inference) {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(logical_tactic);
        SubLObject signature = inference_datastructures_problem.problem_min_transformation_depth_signature(problem, inference);
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

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 2600L)
    public static SubLObject propagate_min_transformation_depth_signature_via_link(SubLObject link) {
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(inference_datastructures_problem_link.problem_link_store(link));
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$1 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        propagate_min_transformation_depth_signature_via_link_wrt_inference(link, inference);
                    }
                }
            }
            SubLObject idx_$2 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$2)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$2);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        propagate_min_transformation_depth_signature_via_link_wrt_inference(link, inference2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 3100L)
    public static SubLObject propagate_min_transformation_depth_signature(SubLObject problem, SubLObject mtds, SubLObject inference) {
        SubLObject updatedP = inference_datastructures_problem.note_problem_min_transformation_depth_signature(problem, inference, mtds);
        if (NIL != updatedP) {
            SubLObject store = inference_datastructures_problem.problem_store(problem);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$3 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$3);
                    SubLObject backwardP_var = NIL;
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
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        inference_$4 = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(inference_$4) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(inference_$4)) {
                                inference_$4 = $SKIP;
                            }
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference_$4)) {
                                inference_var = inference_$4;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                        state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, strategy) && NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy)) {
                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy);
                                        inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy);
                                        inference_datastructures_strategy.note_strategy_should_reconsider_set_asides(strategy);
                                    }
                                }
                            }
                        }
                    }
                }
                SubLObject idx_$4 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$4)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$4);
                    SubLObject id2 = NIL;
                    SubLObject inference_$5 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference_$5 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference_$5)) {
                                SubLObject inference_var2 = inference_$5;
                                SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                        state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2) && NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy2)) {
                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy2);
                                        inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy2);
                                        inference_datastructures_strategy.note_strategy_should_reconsider_set_asides(strategy2);
                                    }
                                }
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            SubLObject set_contents_var3 = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object3;
            SubLObject state3;
            SubLObject link;
            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3,
                    state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                link = set_contents.do_set_contents_next(basis_object3, state3);
                if (NIL != set_contents.do_set_contents_element_validP(state3, link)) {
                    propagate_min_transformation_depth_signature_via_link(link);
                }
            }
        }
        return updatedP;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 3800L)
    public static SubLObject propagate_min_transformation_depth_signature_via_link_wrt_inference(SubLObject link, SubLObject inference) {
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject parent_mtds = inference_datastructures_problem.problem_min_transformation_depth_signature(supported_problem, inference);
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

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 4900L)
    public static SubLObject propagate_mtds_via_transformation_link(SubLObject parent_mtds, SubLObject t_link, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == single_literal_problem_query_depth_signature_p(parent_mtds)) {
            Errors.error($str4$Time_to_support__S_propagation, parent_mtds);
        }
        if (NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(t_link)) {
            SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(t_link);
            SubLObject supporting_problem_query = inference_datastructures_problem.problem_query(supporting_problem);
            SubLObject child_mtds = new_initial_pqds(supporting_problem_query, number_utilities.f_1X(parent_mtds));
            return propagate_min_transformation_depth_signature(supporting_problem, child_mtds, inference);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 5500L)
    public static SubLObject propagate_mtds_via_residual_transformation_link(SubLObject parent_mtds, SubLObject rt_link, SubLObject inference) {
        SubLObject residual_conjunction_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(rt_link);
        SubLObject child_mtds = compute_residual_transformation_mtds(parent_mtds, rt_link);
        if (NIL != child_mtds) {
            return propagate_min_transformation_depth_signature(residual_conjunction_problem, child_mtds, inference);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 5900L)
    public static SubLObject compute_residual_transformation_mtds(SubLObject parent_mtds, SubLObject rt_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject literal_map = inference_worker_residual_transformation.residual_transformation_link_residual_conjunction_literal_map(rt_link);
        SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
        SubLObject focal_spec = inference_worker_join_ordered.join_ordered_link_focal_supporting_problem_spec(jo_link);
        if (NIL != focal_spec) {
            SubLObject transformed_depth;
            SubLObject focal_mtds = transformed_depth = new_subclause_pqds(parent_mtds, focal_spec);
            SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(rt_link);
            SubLObject supporting_problem_query = inference_datastructures_problem.problem_query(supporting_problem);
            SubLObject child_mtds = conses_high.copy_tree(new_initial_pqds(supporting_problem_query, number_utilities.f_1X(transformed_depth)));
            child_mtds = napply_literal_map(parent_mtds, literal_map, child_mtds);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL != list_utilities.simple_tree_findP($TRANSFORMATION, child_mtds)) {
                Errors.error($str6$Propagation_error____S, child_mtds);
            }
            return intern_problem_query_depth_signature(child_mtds);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 6900L)
    public static SubLObject propagate_mtds_via_join_ordered_link(SubLObject parent_mtds, SubLObject jo_link, SubLObject inference) {
        SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
        SubLObject focal_mtds = join_ordered_link_focal_mtds(jo_link, parent_mtds);
        if (NIL != focal_mtds) {
            propagate_min_transformation_depth_signature(focal_problem, focal_mtds, inference);
            if (NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(jo_link)) {
                SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(jo_link);
                SubLObject non_focal_mtds = join_ordered_link_non_focal_mtds(jo_link, parent_mtds);
                if (NIL != non_focal_mtds) {
                    propagate_min_transformation_depth_signature(non_focal_problem, non_focal_mtds, inference);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 7600L)
    public static SubLObject join_ordered_link_focal_mtds(SubLObject jo_link, SubLObject parent_mtds) {
        SubLObject focal_spec = inference_worker_join_ordered.join_ordered_link_focal_supporting_problem_spec(jo_link);
        if (NIL != focal_spec) {
            return new_subclause_pqds(parent_mtds, focal_spec);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 7800L)
    public static SubLObject join_ordered_link_non_focal_mtds(SubLObject jo_link, SubLObject parent_mtds) {
        SubLObject non_focal_spec = inference_worker_join_ordered.join_ordered_link_non_focal_supporting_problem_spec(jo_link);
        if (NIL != non_focal_spec) {
            return new_subclause_pqds(parent_mtds, non_focal_spec);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 8100L)
    public static SubLObject join_ordered_tactic_lookahead_mtds(SubLObject jo_tactic, SubLObject parent_mtds) {
        SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(jo_tactic);
        return join_ordered_link_focal_mtds(jo_link, parent_mtds);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 8300L)
    public static SubLObject propagate_mtds_via_split_link(SubLObject parent_mtds, SubLObject split_link, SubLObject inference) {
        SubLObject split_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject conjunct_mapped_problem = NIL;
        conjunct_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, conjunct_mapped_problem)) {
                SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
                SubLObject conjunct_mtds = split_problem_conjunct_mtds(split_problem, conjunct_mapped_problem, parent_mtds);
                conjunct_mtds = intern_problem_query_depth_signature(conjunct_mtds);
                propagate_min_transformation_depth_signature(conjunct_problem, conjunct_mtds, inference);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 9000L)
    public static SubLObject split_tactic_lookahead_mtds(SubLObject split_tactic, SubLObject parent_mtds) {
        SubLObject split_problem = inference_datastructures_tactic.tactic_problem(split_tactic);
        SubLObject conjunct_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(split_tactic);
        SubLObject conjunct_mtds = split_problem_conjunct_mtds(split_problem, conjunct_mapped_problem, parent_mtds);
        return conjunct_mtds;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 9300L)
    public static SubLObject split_problem_conjunct_mtds(SubLObject split_problem, SubLObject conjunct_mapped_problem, SubLObject parent_mtds) {
        SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
        SubLObject literal_map = split_problem_conjunct_literal_map(split_problem, conjunct_mapped_problem);
        SubLObject conjunct_mtds = conses_high.copy_tree(new_initial_pqds(inference_datastructures_problem.problem_query(conjunct_problem), $UNINITIALIZED));
        conjunct_mtds = napply_literal_map(parent_mtds, literal_map, conjunct_mtds);
        return conjunct_mtds;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 9800L)
    public static SubLObject split_problem_conjunct_literal_map(SubLObject split_problem, SubLObject conjunct_mapped_problem) {
        SubLObject split_problem_query = inference_datastructures_problem.problem_query(split_problem);
        SubLObject split_problem_clause = split_problem_query.first();
        SubLObject conjunct_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(conjunct_mapped_problem);
        SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
        SubLObject conjunct_problem_query = inference_datastructures_problem.problem_query(conjunct_problem);
        SubLObject conjunct_problem_clause = conjunct_problem_query.first();
        SubLObject conjunct_problem_clause_wrt_split = bindings.apply_bindings(conjunct_variable_map, conjunct_problem_clause);
        return new_subclause_literal_map(split_problem_clause, conjunct_problem_clause_wrt_split, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 10700L)
    public static SubLObject propagate_mtds_via_restriction_link(SubLObject parent_mtds, SubLObject restriction_link, SubLObject inference) {
        SubLObject restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
        SubLObject restricted_mtds = restriction_link_restricted_mtds(restriction_link, parent_mtds);
        return propagate_min_transformation_depth_signature(restricted_problem, restricted_mtds, inference);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 11100L)
    public static SubLObject restriction_link_restricted_mtds(SubLObject restriction_link, SubLObject parent_mtds) {
        if (NIL != inference_datastructures_problem.single_literal_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link))) {
            return parent_mtds;
        }
        SubLObject restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
        SubLObject literal_map = restriction_link_literal_map(restriction_link);
        SubLObject restricted_mtds = conses_high.copy_tree(new_initial_pqds(inference_datastructures_problem.problem_query(restricted_problem), $UNINITIALIZED));
        restricted_mtds = napply_literal_map(parent_mtds, literal_map, restricted_mtds);
        return restricted_mtds;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 11700L)
    public static SubLObject restriction_link_literal_map(SubLObject restriction_link) {
        SubLObject unrestricted_clause = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link)).first();
        SubLObject restriction_bindings = inference_worker_restriction.restriction_link_bindings(restriction_link);
        SubLObject unrestricted_clause_qua_restricted = bindings.apply_bindings(restriction_bindings, unrestricted_clause);
        SubLObject restricted_mapped_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link);
        SubLObject restricted_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(restricted_mapped_problem);
        SubLObject restricted_clause = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem)).first();
        SubLObject restricted_clause_qua_unrestricted = bindings.apply_bindings(restricted_variable_map, restricted_clause);
        SubLObject literal_map = compute_restricted_clause_literal_map(unrestricted_clause_qua_restricted, restricted_clause_qua_unrestricted);
        return literal_map;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 13000L)
    public static SubLObject compute_restricted_clause_literal_map(SubLObject unrestricted_clause, SubLObject restricted_clause) {
        SubLObject literal_map = compute_clause_literal_map(unrestricted_clause, restricted_clause);
        if (NIL != subl_promotions.memberP(NIL, literal_map.first(), UNPROVIDED, UNPROVIDED) || NIL != subl_promotions.memberP(NIL, conses_high.second(literal_map), UNPROVIDED, UNPROVIDED)) {
            unrestricted_clause = inference_czer.inference_simplify_contextualized_dnf_clause(conses_high.copy_tree(unrestricted_clause));
            literal_map = compute_clause_literal_map(unrestricted_clause, restricted_clause);
        }
        return literal_map;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 13800L)
    public static SubLObject compute_clause_literal_map(SubLObject parent_clause, SubLObject child_clause) {
        SubLObject parent_neg_lits = NIL;
        SubLObject parent_pos_lits = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parent_clause, parent_clause, $list8);
        parent_neg_lits = parent_clause.first();
        SubLObject current = parent_clause.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parent_clause, $list8);
        parent_pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject child_neg_lits = NIL;
            SubLObject child_pos_lits = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(child_clause, child_clause, $list9);
            child_neg_lits = child_clause.first();
            SubLObject current_$8 = child_clause.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$8, child_clause, $list9);
            child_pos_lits = current_$8.first();
            current_$8 = current_$8.rest();
            if (NIL == current_$8) {
                SubLObject neg_lit_map = NIL;
                SubLObject pos_lit_map = NIL;
                SubLObject cdolist_list_var = parent_neg_lits;
                SubLObject parent_neg_lit = NIL;
                parent_neg_lit = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject child_index = Sequences.position(parent_neg_lit, child_neg_lits, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    neg_lit_map = cons(child_index, neg_lit_map);
                    cdolist_list_var = cdolist_list_var.rest();
                    parent_neg_lit = cdolist_list_var.first();
                }
                cdolist_list_var = parent_pos_lits;
                SubLObject parent_pos_lit = NIL;
                parent_pos_lit = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject child_index = Sequences.position(parent_pos_lit, child_pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    pos_lit_map = cons(child_index, pos_lit_map);
                    cdolist_list_var = cdolist_list_var.rest();
                    parent_pos_lit = cdolist_list_var.first();
                }
                pos_lit_map = Sequences.nreverse(pos_lit_map);
                SubLObject literal_map = list(neg_lit_map, pos_lit_map);
                return literal_map;
            }
            cdestructuring_bind.cdestructuring_bind_error(child_clause, $list9);
        } else {
            cdestructuring_bind.cdestructuring_bind_error(parent_clause, $list8);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 14600L)
    public static SubLObject propagate_mtds_via_union_link(SubLObject parent_mtds, SubLObject union_link, SubLObject inference) {
        SubLObject disjunct_problem = inference_worker_union.union_link_supporting_problem(union_link);
        SubLObject disjunct_problem_query = inference_datastructures_problem.problem_query(disjunct_problem);
        SubLObject disjunct_mtds = new_initial_pqds(disjunct_problem_query, ZERO_INTEGER);
        return propagate_min_transformation_depth_signature(disjunct_problem, disjunct_mtds, inference);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 15100L)
    public static SubLObject union_tactic_lookahead_mtds(SubLObject union_tactic, SubLObject parent_mtds) {
        assert NIL != multi_clause_problem_query_depth_signature_p(parent_mtds) : parent_mtds;
        SubLObject index = inference_worker_union.union_tactic_disjunct_index(union_tactic);
        return nth(index, parent_mtds);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 15300L)
    public static SubLObject problem_query_depth_signature_p(SubLObject v_object) {
        return makeBoolean(NIL != single_literal_problem_query_depth_signature_p(v_object) || NIL != multi_literal_problem_query_depth_signature_p(v_object) || NIL != multi_clause_problem_query_depth_signature_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 15800L)
    public static SubLObject single_literal_problem_query_depth_signature_p(SubLObject v_object) {
        return subl_promotions.non_negative_integer_p(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16000L)
    public static SubLObject multi_literal_problem_query_depth_signature_p(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED) && v_object.first().isList() && NIL != list_utilities.every_in_list($sym11$SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, v_object.first(), UNPROVIDED)
                && conses_high.second(v_object).isList() && NIL != list_utilities.every_in_list($sym11$SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, conses_high.second(v_object), UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16300L)
    public static SubLObject multi_clause_problem_query_depth_signature_p(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED) && NIL != list_utilities.every_in_list($sym12$MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, v_object, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16500L)
    public static SubLObject clear_intern_problem_query_depth_signature() {
        SubLObject cs = $intern_problem_query_depth_signature_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16500L)
    public static SubLObject remove_intern_problem_query_depth_signature(SubLObject pqds) {
        return memoization_state.caching_state_remove_function_results_with_args($intern_problem_query_depth_signature_caching_state$.getGlobalValue(), list(pqds), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16500L)
    public static SubLObject intern_problem_query_depth_signature_internal(SubLObject pqds) {
        assert NIL != problem_query_depth_signature_p(pqds) : pqds;
        return conses_high.copy_tree(pqds);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16500L)
    public static SubLObject intern_problem_query_depth_signature(SubLObject pqds) {
        SubLObject caching_state = $intern_problem_query_depth_signature_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym13$INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE, $sym15$_INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pqds, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(intern_problem_query_depth_signature_internal(pqds)));
            memoization_state.caching_state_put(caching_state, pqds, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16700L)
    public static SubLObject new_initial_pqds(SubLObject problem_query, SubLObject depth) {
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
        clause_pqds_list = Sequences.nreverse(clause_pqds_list);
        if (depth.isInteger()) {
            clause_pqds_list = intern_problem_query_depth_signature(clause_pqds_list);
        }
        return clause_pqds_list;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 17300L)
    public static SubLObject new_initial_clause_pqds(SubLObject contextualized_clause, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        SubLObject pqds = list(make_list(Sequences.length(clauses.neg_lits(contextualized_clause)), depth), make_list(Sequences.length(clauses.pos_lits(contextualized_clause)), depth));
        if (depth.isInteger()) {
            pqds = intern_problem_query_depth_signature(pqds);
        }
        return pqds;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 17700L)
    public static SubLObject new_subclause_pqds(SubLObject parent_pqds, SubLObject subclause_spec) {
        assert NIL != multi_literal_problem_query_depth_signature_p(parent_pqds) : parent_pqds;
        SubLObject neg_lit_pqds = NIL;
        SubLObject pos_lit_pqds = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parent_pqds, parent_pqds, $list16);
        neg_lit_pqds = parent_pqds.first();
        SubLObject current = parent_pqds.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parent_pqds, $list16);
        pos_lit_pqds = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject neg_lit_specs = NIL;
            SubLObject pos_lit_specs = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(subclause_spec, subclause_spec, $list17);
            neg_lit_specs = subclause_spec.first();
            SubLObject current_$10 = subclause_spec.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$10, subclause_spec, $list17);
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
                result_neg_lit_pqds = Sequences.nreverse(result_neg_lit_pqds);
                result_pos_lit_pqds = Sequences.nreverse(result_pos_lit_pqds);
                if (NIL == result_neg_lit_pqds && NIL != list_utilities.singletonP(result_pos_lit_pqds)) {
                    return result_pos_lit_pqds.first();
                }
                if (NIL == result_pos_lit_pqds && NIL != list_utilities.singletonP(result_neg_lit_pqds)) {
                    return result_neg_lit_pqds.first();
                }
                return intern_problem_query_depth_signature(list(result_neg_lit_pqds, result_pos_lit_pqds));
            } else {
                cdestructuring_bind.cdestructuring_bind_error(subclause_spec, $list17);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(parent_pqds, $list16);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18700L)
    public static SubLObject clear_pqds_depth() {
        SubLObject cs = $pqds_depth_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18700L)
    public static SubLObject remove_pqds_depth(SubLObject pqds, SubLObject mode) {
        return memoization_state.caching_state_remove_function_results_with_args($pqds_depth_caching_state$.getGlobalValue(), list(pqds, mode), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18700L)
    public static SubLObject pqds_depth_internal(SubLObject pqds, SubLObject mode) {
        if (mode.eql($UNINTUITIVE)) {
            return tree_min_number(pqds);
        }
        if (mode.eql($INTUITIVE)) {
            return tree_sum(pqds);
        }
        return Errors.error($str21$unexpected_mode__S, mode);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18700L)
    public static SubLObject pqds_depth(SubLObject pqds, SubLObject mode) {
        SubLObject caching_state = $pqds_depth_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym18$PQDS_DEPTH, $sym22$_PQDS_DEPTH_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(pqds, mode);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (pqds.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mode.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(pqds_depth_internal(pqds, mode)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pqds, mode));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 19000L)
    public static SubLObject pqds_merge(SubLObject pqds1, SubLObject pqds2) {
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

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 19500L)
    public static SubLObject single_literal_pqds_merge(SubLObject pqds1, SubLObject pqds2) {
        return Numbers.min(pqds1, pqds2);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 19500L)
    public static SubLObject multi_literal_pqds_merge(SubLObject pqds1, SubLObject pqds2) {
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
        while (NIL != lit_pqds2 || NIL != lit_pqds1) {
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
        while (NIL != lit_pqds2 || NIL != lit_pqds1) {
            merged_pos_pqds = cons(single_literal_pqds_merge(lit_pqds1_$12, lit_pqds2_$13), merged_pos_pqds);
            lit_pqds1 = lit_pqds1.rest();
            lit_pqds1_$12 = lit_pqds1.first();
            lit_pqds2 = lit_pqds2.rest();
            lit_pqds2_$13 = lit_pqds2.first();
        }
        SubLObject merged_pqds = list(Sequences.nreverse(merged_neg_pqds), Sequences.nreverse(merged_pos_pqds));
        return intern_problem_query_depth_signature(merged_pqds);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 20100L)
    public static SubLObject multi_clause_pqds_merge(SubLObject pqds1, SubLObject pqds2) {
        SubLObject merged_pqds = NIL;
        SubLObject clause_pqds1 = NIL;
        SubLObject clause_pqds1_$15 = NIL;
        SubLObject clause_pqds2 = NIL;
        SubLObject clause_pqds2_$16 = NIL;
        clause_pqds1 = pqds1;
        clause_pqds1_$15 = clause_pqds1.first();
        clause_pqds2 = pqds2;
        clause_pqds2_$16 = clause_pqds2.first();
        while (NIL != clause_pqds2 || NIL != clause_pqds1) {
            merged_pqds = cons(pqds_merge(clause_pqds1_$15, clause_pqds2_$16), merged_pqds);
            clause_pqds1 = clause_pqds1.rest();
            clause_pqds1_$15 = clause_pqds1.first();
            clause_pqds2 = clause_pqds2.rest();
            clause_pqds2_$16 = clause_pqds2.first();
        }
        merged_pqds = Sequences.nreverse(merged_pqds);
        return intern_problem_query_depth_signature(merged_pqds);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 20500L)
    public static SubLObject new_subclause_literal_map(SubLObject clause, SubLObject subclause, SubLObject missing) {
        if (missing == UNPROVIDED) {
            missing = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject clause_neg_lits = NIL;
        SubLObject clause_pos_lits = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(clause, clause, $list23);
        clause_neg_lits = clause.first();
        SubLObject current = clause.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, clause, $list23);
        clause_pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject subclause_neg_lits = NIL;
            SubLObject subclause_pos_lits = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(subclause, subclause, $list24);
            subclause_neg_lits = subclause.first();
            SubLObject current_$18 = subclause.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$18, subclause, $list24);
            subclause_pos_lits = current_$18.first();
            current_$18 = current_$18.rest();
            if (NIL == current_$18) {
                SubLObject map_neg_lits = make_list(Sequences.length(clause_neg_lits), missing);
                SubLObject map_pos_lits = make_list(Sequences.length(clause_pos_lits), missing);
                SubLObject list_var = NIL;
                SubLObject clause_lit = NIL;
                SubLObject clause_index = NIL;
                list_var = clause_neg_lits;
                clause_lit = list_var.first();
                for (clause_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), clause_lit = list_var.first(), clause_index = Numbers.add(ONE_INTEGER, clause_index)) {
                    SubLObject subclause_index = Sequences.position(clause_lit, subclause_neg_lits, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (subclause_index.isInteger()) {
                        set_nth(clause_index, map_neg_lits, subclause_index);
                    }
                }
                list_var = NIL;
                clause_lit = NIL;
                clause_index = NIL;
                list_var = clause_pos_lits;
                clause_lit = list_var.first();
                for (clause_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), clause_lit = list_var.first(), clause_index = Numbers.add(ONE_INTEGER, clause_index)) {
                    SubLObject subclause_index = Sequences.position(clause_lit, subclause_pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (subclause_index.isInteger()) {
                        set_nth(clause_index, map_pos_lits, subclause_index);
                    }
                }
                SubLObject literal_map = list(map_neg_lits, map_pos_lits);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == list_utilities.tree_find_if(Symbols.symbol_function($sym25$INTEGERP), literal_map, UNPROVIDED)) {
                    Errors.error($str26$Failed_literal_map__S, literal_map);
                }
                return literal_map;
            }
            cdestructuring_bind.cdestructuring_bind_error(subclause, $list24);
        } else {
            cdestructuring_bind.cdestructuring_bind_error(clause, $list23);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 21700L)
    public static SubLObject napply_literal_map(SubLObject source_mtds, SubLObject literal_map, SubLObject target_mtds) {
        SubLObject source_neg_mtds_list = NIL;
        SubLObject source_pos_mtds_list = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(source_mtds, source_mtds, $list27);
        source_neg_mtds_list = source_mtds.first();
        SubLObject current = source_mtds.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, source_mtds, $list27);
        source_pos_mtds_list = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject neg_lit_map = NIL;
            SubLObject pos_lit_map = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(literal_map, literal_map, $list28);
            neg_lit_map = literal_map.first();
            SubLObject current_$20 = literal_map.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$20, literal_map, $list28);
            pos_lit_map = current_$20.first();
            current_$20 = current_$20.rest();
            if (NIL == current_$20) {
                SubLObject target_neg_mtds_list = target_mtds.isCons() ? target_mtds.first() : NIL;
                SubLObject target_pos_mtds_list = target_mtds.isCons() ? conses_high.second(target_mtds) : NIL;
                SubLObject source_neg_mtds = NIL;
                SubLObject source_neg_mtds_$21 = NIL;
                SubLObject neg_index = NIL;
                SubLObject neg_index_$22 = NIL;
                source_neg_mtds = source_neg_mtds_list;
                source_neg_mtds_$21 = source_neg_mtds.first();
                neg_index = neg_lit_map;
                neg_index_$22 = neg_index.first();
                while (NIL != neg_index || NIL != source_neg_mtds) {
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
                while (NIL != pos_index || NIL != source_pos_mtds) {
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
                cdestructuring_bind.cdestructuring_bind_error(literal_map, $list28);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(source_mtds, $list27);
        }
        return target_mtds;
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 22600L)
    public static SubLObject tree_sum(SubLObject tree) {
        return tree_sum_recursive(tree, ZERO_INTEGER);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 22900L)
    public static SubLObject tree_sum_recursive(SubLObject tree, SubLObject accumulator) {
        if (tree.isNumber()) {
            accumulator = Numbers.add(accumulator, tree);
        } else if (!tree.isAtom()) {
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

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 23400L)
    public static SubLObject tree_min_number(SubLObject tree) {
        return tree_min_number_recursive(tree, $POSITIVE_INFINITY);
    }

    @SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 23600L)
    public static SubLObject tree_min_number_recursive(SubLObject tree, SubLObject lowest) {
        if (NIL != number_utilities.potentially_infinite_number_p(tree)) {
            lowest = number_utilities.potentially_infinite_number_min(lowest, tree);
        } else if (!tree.isAtom()) {
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

    public static SubLObject declare_inference_min_transformation_depth_file() {
        declareFunction(myName, "problem_min_transformation_depth_from_signature", "PROBLEM-MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 2, 0, false);
        declareFunction(myName, "min_transformation_depth_from_signature", "MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 1, 0, false);
        declareFunction(myName, "logical_tactic_lookahead_min_transformation_depth", "LOGICAL-TACTIC-LOOKAHEAD-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction(myName, "propagate_min_transformation_depth_signature_via_link", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK", 1, 0, false);
        declareFunction(myName, "propagate_min_transformation_depth_signature", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
        declareFunction(myName, "propagate_min_transformation_depth_signature_via_link_wrt_inference", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK-WRT-INFERENCE", 2, 0, false);
        declareFunction(myName, "propagate_mtds_via_transformation_link", "PROPAGATE-MTDS-VIA-TRANSFORMATION-LINK", 3, 0, false);
        declareFunction(myName, "propagate_mtds_via_residual_transformation_link", "PROPAGATE-MTDS-VIA-RESIDUAL-TRANSFORMATION-LINK", 3, 0, false);
        declareFunction(myName, "compute_residual_transformation_mtds", "COMPUTE-RESIDUAL-TRANSFORMATION-MTDS", 2, 0, false);
        declareFunction(myName, "propagate_mtds_via_join_ordered_link", "PROPAGATE-MTDS-VIA-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction(myName, "join_ordered_link_focal_mtds", "JOIN-ORDERED-LINK-FOCAL-MTDS", 2, 0, false);
        declareFunction(myName, "join_ordered_link_non_focal_mtds", "JOIN-ORDERED-LINK-NON-FOCAL-MTDS", 2, 0, false);
        declareFunction(myName, "join_ordered_tactic_lookahead_mtds", "JOIN-ORDERED-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        declareFunction(myName, "propagate_mtds_via_split_link", "PROPAGATE-MTDS-VIA-SPLIT-LINK", 3, 0, false);
        declareFunction(myName, "split_tactic_lookahead_mtds", "SPLIT-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        declareFunction(myName, "split_problem_conjunct_mtds", "SPLIT-PROBLEM-CONJUNCT-MTDS", 3, 0, false);
        declareFunction(myName, "split_problem_conjunct_literal_map", "SPLIT-PROBLEM-CONJUNCT-LITERAL-MAP", 2, 0, false);
        declareFunction(myName, "propagate_mtds_via_restriction_link", "PROPAGATE-MTDS-VIA-RESTRICTION-LINK", 3, 0, false);
        declareFunction(myName, "restriction_link_restricted_mtds", "RESTRICTION-LINK-RESTRICTED-MTDS", 2, 0, false);
        declareFunction(myName, "restriction_link_literal_map", "RESTRICTION-LINK-LITERAL-MAP", 1, 0, false);
        declareFunction(myName, "compute_restricted_clause_literal_map", "COMPUTE-RESTRICTED-CLAUSE-LITERAL-MAP", 2, 0, false);
        declareFunction(myName, "compute_clause_literal_map", "COMPUTE-CLAUSE-LITERAL-MAP", 2, 0, false);
        declareFunction(myName, "propagate_mtds_via_union_link", "PROPAGATE-MTDS-VIA-UNION-LINK", 3, 0, false);
        declareFunction(myName, "union_tactic_lookahead_mtds", "UNION-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        declareFunction(myName, "problem_query_depth_signature_p", "PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction(myName, "single_literal_problem_query_depth_signature_p", "SINGLE-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction(myName, "multi_literal_problem_query_depth_signature_p", "MULTI-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction(myName, "multi_clause_problem_query_depth_signature_p", "MULTI-CLAUSE-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        declareFunction(myName, "clear_intern_problem_query_depth_signature", "CLEAR-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 0, 0, false);
        declareFunction(myName, "remove_intern_problem_query_depth_signature", "REMOVE-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
        declareFunction(myName, "intern_problem_query_depth_signature_internal", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-INTERNAL", 1, 0, false);
        declareFunction(myName, "intern_problem_query_depth_signature", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
        declareFunction(myName, "new_initial_pqds", "NEW-INITIAL-PQDS", 1, 1, false);
        declareFunction(myName, "new_initial_clause_pqds", "NEW-INITIAL-CLAUSE-PQDS", 1, 1, false);
        declareFunction(myName, "new_subclause_pqds", "NEW-SUBCLAUSE-PQDS", 2, 0, false);
        declareFunction(myName, "clear_pqds_depth", "CLEAR-PQDS-DEPTH", 0, 0, false);
        declareFunction(myName, "remove_pqds_depth", "REMOVE-PQDS-DEPTH", 2, 0, false);
        declareFunction(myName, "pqds_depth_internal", "PQDS-DEPTH-INTERNAL", 2, 0, false);
        declareFunction(myName, "pqds_depth", "PQDS-DEPTH", 2, 0, false);
        declareFunction(myName, "pqds_merge", "PQDS-MERGE", 2, 0, false);
        declareFunction(myName, "single_literal_pqds_merge", "SINGLE-LITERAL-PQDS-MERGE", 2, 0, false);
        declareFunction(myName, "multi_literal_pqds_merge", "MULTI-LITERAL-PQDS-MERGE", 2, 0, false);
        declareFunction(myName, "multi_clause_pqds_merge", "MULTI-CLAUSE-PQDS-MERGE", 2, 0, false);
        declareFunction(myName, "new_subclause_literal_map", "NEW-SUBCLAUSE-LITERAL-MAP", 2, 1, false);
        declareFunction(myName, "napply_literal_map", "NAPPLY-LITERAL-MAP", 3, 0, false);
        declareFunction(myName, "tree_sum", "TREE-SUM", 1, 0, false);
        declareFunction(myName, "tree_sum_recursive", "TREE-SUM-RECURSIVE", 2, 0, false);
        declareFunction(myName, "tree_min_number", "TREE-MIN-NUMBER", 1, 0, false);
        declareFunction(myName, "tree_min_number_recursive", "TREE-MIN-NUMBER-RECURSIVE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_min_transformation_depth_file() {
        $intern_problem_query_depth_signature_caching_state$ = SubLFiles.deflexical("*INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-CACHING-STATE*", NIL);
        $pqds_depth_caching_state$ = deflexical("*PQDS-DEPTH-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_min_transformation_depth_file() {
        memoization_state.note_globally_cached_function($sym13$INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE);
        memoization_state.note_globally_cached_function($sym18$PQDS_DEPTH);
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
        me = new inference_min_transformation_depth();
        $intern_problem_query_depth_signature_caching_state$ = null;
        $pqds_depth_caching_state$ = null;
        $UNDETERMINED = makeKeyword("UNDETERMINED");
        $COUNTERINTUITIVE = makeKeyword("COUNTERINTUITIVE");
        $str2$Unexpected_logical_tactic____S = makeString("Unexpected logical-tactic : ~S");
        $SKIP = makeKeyword("SKIP");
        $str4$Time_to_support__S_propagation = makeString("Time to support ~S propagation");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $str6$Propagation_error____S = makeString("Propagation error : ~S");
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $list8 = list(makeSymbol("PARENT-NEG-LITS"), makeSymbol("PARENT-POS-LITS"));
        $list9 = list(makeSymbol("CHILD-NEG-LITS"), makeSymbol("CHILD-POS-LITS"));
        $sym10$MULTI_CLAUSE_PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("MULTI-CLAUSE-PROBLEM-QUERY-DEPTH-SIGNATURE-P");
        $sym11$SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("SINGLE-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P");
        $sym12$MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("MULTI-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P");
        $sym13$INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE = makeSymbol("INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE");
        $sym14$PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("PROBLEM-QUERY-DEPTH-SIGNATURE-P");
        $sym15$_INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE_CACHING_STATE_ = makeSymbol("*INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-CACHING-STATE*");
        $list16 = list(makeSymbol("NEG-LIT-PQDS"), makeSymbol("POS-LIT-PQDS"));
        $list17 = list(makeSymbol("NEG-LIT-SPECS"), makeSymbol("POS-LIT-SPECS"));
        $sym18$PQDS_DEPTH = makeSymbol("PQDS-DEPTH");
        $UNINTUITIVE = makeKeyword("UNINTUITIVE");
        $INTUITIVE = makeKeyword("INTUITIVE");
        $str21$unexpected_mode__S = makeString("unexpected mode ~S");
        $sym22$_PQDS_DEPTH_CACHING_STATE_ = makeSymbol("*PQDS-DEPTH-CACHING-STATE*");
        $list23 = list(makeSymbol("CLAUSE-NEG-LITS"), makeSymbol("CLAUSE-POS-LITS"));
        $list24 = list(makeSymbol("SUBCLAUSE-NEG-LITS"), makeSymbol("SUBCLAUSE-POS-LITS"));
        $sym25$INTEGERP = makeSymbol("INTEGERP");
        $str26$Failed_literal_map__S = makeString("Failed literal map ~S");
        $list27 = list(makeSymbol("SOURCE-NEG-MTDS-LIST"), makeSymbol("SOURCE-POS-MTDS-LIST"));
        $list28 = list(makeSymbol("NEG-LIT-MAP"), makeSymbol("POS-LIT-MAP"));
        $POSITIVE_INFINITY = makeKeyword("POSITIVE-INFINITY");
    }
}
/*
 *
 * Total time: 179 ms
 *
 */