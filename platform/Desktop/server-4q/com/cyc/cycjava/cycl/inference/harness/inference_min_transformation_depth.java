package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_min_transformation_depth extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth";
    public static final String myFingerPrint = "23a015a86d90f6a105c0c18def8a11bfe885098156d4339a63baadae13bddaa2";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16576L)
    private static SubLSymbol $intern_problem_query_depth_signature_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18785L)
    private static SubLSymbol $pqds_depth_caching_state$;
    private static final SubLSymbol $kw0$UNDETERMINED;
    private static final SubLSymbol $kw1$COUNTERINTUITIVE;
    private static final SubLString $str2$Unexpected_logical_tactic____S;
    private static final SubLSymbol $kw3$SKIP;
    private static final SubLString $str4$Time_to_support__S_propagation;
    private static final SubLSymbol $kw5$TRANSFORMATION;
    private static final SubLString $str6$Propagation_error____S;
    private static final SubLSymbol $kw7$UNINITIALIZED;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$MULTI_CLAUSE_PROBLEM_QUERY_DEPTH_SIGNATURE_P;
    private static final SubLSymbol $sym11$SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P;
    private static final SubLSymbol $sym12$MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P;
    private static final SubLSymbol $sym13$INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE;
    private static final SubLSymbol $sym14$PROBLEM_QUERY_DEPTH_SIGNATURE_P;
    private static final SubLSymbol $sym15$_INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE_CACHING_STATE_;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$PQDS_DEPTH;
    private static final SubLSymbol $kw19$UNINTUITIVE;
    private static final SubLSymbol $kw20$INTUITIVE;
    private static final SubLString $str21$unexpected_mode__S;
    private static final SubLSymbol $sym22$_PQDS_DEPTH_CACHING_STATE_;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$INTEGERP;
    private static final SubLString $str26$Failed_literal_map__S;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$POSITIVE_INFINITY;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 1054L)
    public static SubLObject problem_min_transformation_depth_from_signature(final SubLObject problem, final SubLObject inference) {
        final SubLObject signature = inference_datastructures_problem.problem_min_transformation_depth_signature(problem, inference);
        return min_transformation_depth_from_signature(signature);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 1539L)
    public static SubLObject min_transformation_depth_from_signature(final SubLObject signature) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_min_transformation_depth.$kw0$UNDETERMINED == signature) {
            return (SubLObject)inference_min_transformation_depth.$kw0$UNDETERMINED;
        }
        if (inference_datastructures_problem.$transformation_depth_computation$.getDynamicValue(thread) == inference_min_transformation_depth.$kw1$COUNTERINTUITIVE) {
            return tree_min_number(signature);
        }
        return tree_sum(signature);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 1873L)
    public static SubLObject logical_tactic_lookahead_min_transformation_depth(final SubLObject logical_tactic, final SubLObject inference) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(logical_tactic);
        final SubLObject signature = inference_datastructures_problem.problem_min_transformation_depth_signature(problem, inference);
        if (inference_min_transformation_depth.$kw0$UNDETERMINED == signature) {
            return (SubLObject)inference_min_transformation_depth.$kw0$UNDETERMINED;
        }
        if (inference_min_transformation_depth.NIL != inference_worker_join_ordered.join_ordered_tactic_p(logical_tactic)) {
            return join_ordered_tactic_lookahead_mtds(logical_tactic, signature);
        }
        if (inference_min_transformation_depth.NIL != inference_worker_split.split_tactic_p(logical_tactic)) {
            return split_tactic_lookahead_mtds(logical_tactic, signature);
        }
        if (inference_min_transformation_depth.NIL != inference_worker_union.union_tactic_p(logical_tactic)) {
            return union_tactic_lookahead_mtds(logical_tactic, signature);
        }
        return Errors.error((SubLObject)inference_min_transformation_depth.$str2$Unexpected_logical_tactic____S, logical_tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 2614L)
    public static SubLObject propagate_min_transformation_depth_signature_via_link(final SubLObject link) {
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(inference_datastructures_problem_link.problem_link_store(link));
        if (inference_min_transformation_depth.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_min_transformation_depth.$kw3$SKIP)) {
            final SubLObject idx_$1 = idx;
            if (inference_min_transformation_depth.NIL == id_index.id_index_dense_objects_empty_p(idx_$1, (SubLObject)inference_min_transformation_depth.$kw3$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                final SubLObject backwardP_var = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_min_transformation_depth.NIL, v_iteration = (SubLObject)inference_min_transformation_depth.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_min_transformation_depth.ONE_INTEGER)) {
                    id = ((inference_min_transformation_depth.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_min_transformation_depth.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_min_transformation_depth.NIL == id_index.id_index_tombstone_p(inference) || inference_min_transformation_depth.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_min_transformation_depth.$kw3$SKIP)) {
                        if (inference_min_transformation_depth.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_min_transformation_depth.$kw3$SKIP;
                        }
                        propagate_min_transformation_depth_signature_via_link_wrt_inference(link, inference);
                    }
                }
            }
            final SubLObject idx_$2 = idx;
            if (inference_min_transformation_depth.NIL == id_index.id_index_sparse_objects_empty_p(idx_$2)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$2);
                SubLObject id2 = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject inference2 = (SubLObject)inference_min_transformation_depth.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        propagate_min_transformation_depth_signature_via_link_wrt_inference(link, inference2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 3127L)
    public static SubLObject propagate_min_transformation_depth_signature(final SubLObject problem, final SubLObject mtds, final SubLObject inference) {
        final SubLObject updatedP = inference_datastructures_problem.note_problem_min_transformation_depth_signature(problem, inference, mtds);
        if (inference_min_transformation_depth.NIL != updatedP) {
            final SubLObject store = inference_datastructures_problem.problem_store(problem);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (inference_min_transformation_depth.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_min_transformation_depth.$kw3$SKIP)) {
                final SubLObject idx_$3 = idx;
                if (inference_min_transformation_depth.NIL == id_index.id_index_dense_objects_empty_p(idx_$3, (SubLObject)inference_min_transformation_depth.$kw3$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$3);
                    final SubLObject backwardP_var = (SubLObject)inference_min_transformation_depth.NIL;
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
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_min_transformation_depth.NIL, v_iteration = (SubLObject)inference_min_transformation_depth.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_min_transformation_depth.ONE_INTEGER)) {
                        id = ((inference_min_transformation_depth.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_min_transformation_depth.ONE_INTEGER) : v_iteration);
                        inference_$4 = Vectors.aref(vector_var, id);
                        if (inference_min_transformation_depth.NIL == id_index.id_index_tombstone_p(inference_$4) || inference_min_transformation_depth.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_min_transformation_depth.$kw3$SKIP)) {
                            if (inference_min_transformation_depth.NIL != id_index.id_index_tombstone_p(inference_$4)) {
                                inference_$4 = (SubLObject)inference_min_transformation_depth.$kw3$SKIP;
                            }
                            if (inference_min_transformation_depth.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference_$4)) {
                                inference_var = inference_$4;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_min_transformation_depth.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_min_transformation_depth.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (inference_min_transformation_depth.NIL != set_contents.do_set_contents_element_validP(state, strategy) && inference_min_transformation_depth.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy)) {
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
                if (inference_min_transformation_depth.NIL == id_index.id_index_sparse_objects_empty_p(idx_$4)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$4);
                    SubLObject id2 = (SubLObject)inference_min_transformation_depth.NIL;
                    SubLObject inference_$5 = (SubLObject)inference_min_transformation_depth.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference_$5 = Hashtables.getEntryValue(cdohash_entry);
                            if (inference_min_transformation_depth.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference_$5)) {
                                final SubLObject inference_var2 = inference_$5;
                                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_min_transformation_depth.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_min_transformation_depth.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (inference_min_transformation_depth.NIL != set_contents.do_set_contents_element_validP(state2, strategy2) && inference_min_transformation_depth.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy2)) {
                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy2);
                                        inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy2);
                                        inference_datastructures_strategy.note_strategy_should_reconsider_set_asides(strategy2);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            final SubLObject set_contents_var3 = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object3;
            SubLObject state3;
            SubLObject link;
            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)inference_min_transformation_depth.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); inference_min_transformation_depth.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                link = set_contents.do_set_contents_next(basis_object3, state3);
                if (inference_min_transformation_depth.NIL != set_contents.do_set_contents_element_validP(state3, link)) {
                    propagate_min_transformation_depth_signature_via_link(link);
                }
            }
        }
        return updatedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 3823L)
    public static SubLObject propagate_min_transformation_depth_signature_via_link_wrt_inference(final SubLObject link, final SubLObject inference) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        final SubLObject parent_mtds = inference_datastructures_problem.problem_min_transformation_depth_signature(supported_problem, inference);
        if (inference_min_transformation_depth.$kw0$UNDETERMINED != parent_mtds) {
            if (inference_min_transformation_depth.NIL != inference_worker_transformation.transformation_link_p(link)) {
                return propagate_mtds_via_transformation_link(parent_mtds, link, inference);
            }
            if (inference_min_transformation_depth.NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                return propagate_mtds_via_join_ordered_link(parent_mtds, link, inference);
            }
            if (inference_min_transformation_depth.NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
                return propagate_mtds_via_residual_transformation_link(parent_mtds, link, inference);
            }
            if (inference_min_transformation_depth.NIL != inference_worker_split.split_link_p(link)) {
                return propagate_mtds_via_split_link(parent_mtds, link, inference);
            }
            if (inference_min_transformation_depth.NIL != inference_worker_restriction.restriction_link_p(link)) {
                return propagate_mtds_via_restriction_link(parent_mtds, link, inference);
            }
            if (inference_min_transformation_depth.NIL != inference_worker_union.union_link_p(link)) {
                return propagate_mtds_via_union_link(parent_mtds, link, inference);
            }
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 4916L)
    public static SubLObject propagate_mtds_via_transformation_link(final SubLObject parent_mtds, final SubLObject t_link, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_min_transformation_depth.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_min_transformation_depth.NIL == single_literal_problem_query_depth_signature_p(parent_mtds)) {
            Errors.error((SubLObject)inference_min_transformation_depth.$str4$Time_to_support__S_propagation, parent_mtds);
        }
        if (inference_min_transformation_depth.NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(t_link)) {
            final SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(t_link);
            final SubLObject supporting_problem_query = inference_datastructures_problem.problem_query(supporting_problem);
            final SubLObject child_mtds = new_initial_pqds(supporting_problem_query, number_utilities.f_1X(parent_mtds));
            return propagate_min_transformation_depth_signature(supporting_problem, child_mtds, inference);
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 5555L)
    public static SubLObject propagate_mtds_via_residual_transformation_link(final SubLObject parent_mtds, final SubLObject rt_link, final SubLObject inference) {
        final SubLObject residual_conjunction_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(rt_link);
        final SubLObject child_mtds = compute_residual_transformation_mtds(parent_mtds, rt_link);
        if (inference_min_transformation_depth.NIL != child_mtds) {
            return propagate_min_transformation_depth_signature(residual_conjunction_problem, child_mtds, inference);
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 5976L)
    public static SubLObject compute_residual_transformation_mtds(final SubLObject parent_mtds, final SubLObject rt_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject literal_map = inference_worker_residual_transformation.residual_transformation_link_residual_conjunction_literal_map(rt_link);
        final SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
        final SubLObject focal_spec = inference_worker_join_ordered.join_ordered_link_focal_supporting_problem_spec(jo_link);
        if (inference_min_transformation_depth.NIL != focal_spec) {
            final SubLObject transformed_depth;
            final SubLObject focal_mtds = transformed_depth = new_subclause_pqds(parent_mtds, focal_spec);
            final SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(rt_link);
            final SubLObject supporting_problem_query = inference_datastructures_problem.problem_query(supporting_problem);
            SubLObject child_mtds = conses_high.copy_tree(new_initial_pqds(supporting_problem_query, number_utilities.f_1X(transformed_depth)));
            child_mtds = napply_literal_map(parent_mtds, literal_map, child_mtds);
            if (inference_min_transformation_depth.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_min_transformation_depth.NIL != list_utilities.simple_tree_findP((SubLObject)inference_min_transformation_depth.$kw5$TRANSFORMATION, child_mtds)) {
                Errors.error((SubLObject)inference_min_transformation_depth.$str6$Propagation_error____S, child_mtds);
            }
            return intern_problem_query_depth_signature(child_mtds);
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 6909L)
    public static SubLObject propagate_mtds_via_join_ordered_link(final SubLObject parent_mtds, final SubLObject jo_link, final SubLObject inference) {
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
        final SubLObject focal_mtds = join_ordered_link_focal_mtds(jo_link, parent_mtds);
        if (inference_min_transformation_depth.NIL != focal_mtds) {
            propagate_min_transformation_depth_signature(focal_problem, focal_mtds, inference);
            if (inference_min_transformation_depth.NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(jo_link)) {
                final SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(jo_link);
                final SubLObject non_focal_mtds = join_ordered_link_non_focal_mtds(jo_link, parent_mtds);
                if (inference_min_transformation_depth.NIL != non_focal_mtds) {
                    propagate_min_transformation_depth_signature(non_focal_problem, non_focal_mtds, inference);
                }
            }
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 7624L)
    public static SubLObject join_ordered_link_focal_mtds(final SubLObject jo_link, final SubLObject parent_mtds) {
        final SubLObject focal_spec = inference_worker_join_ordered.join_ordered_link_focal_supporting_problem_spec(jo_link);
        if (inference_min_transformation_depth.NIL != focal_spec) {
            return new_subclause_pqds(parent_mtds, focal_spec);
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 7854L)
    public static SubLObject join_ordered_link_non_focal_mtds(final SubLObject jo_link, final SubLObject parent_mtds) {
        final SubLObject non_focal_spec = inference_worker_join_ordered.join_ordered_link_non_focal_supporting_problem_spec(jo_link);
        if (inference_min_transformation_depth.NIL != non_focal_spec) {
            return new_subclause_pqds(parent_mtds, non_focal_spec);
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 8177L)
    public static SubLObject join_ordered_tactic_lookahead_mtds(final SubLObject jo_tactic, final SubLObject parent_mtds) {
        final SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(jo_tactic);
        return join_ordered_link_focal_mtds(jo_link, parent_mtds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 8373L)
    public static SubLObject propagate_mtds_via_split_link(final SubLObject parent_mtds, final SubLObject split_link, final SubLObject inference) {
        final SubLObject split_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject conjunct_mapped_problem = (SubLObject)inference_min_transformation_depth.NIL;
        conjunct_mapped_problem = cdolist_list_var.first();
        while (inference_min_transformation_depth.NIL != cdolist_list_var) {
            if (inference_min_transformation_depth.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_min_transformation_depth.NIL, split_link, conjunct_mapped_problem)) {
                final SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
                SubLObject conjunct_mtds = split_problem_conjunct_mtds(split_problem, conjunct_mapped_problem, parent_mtds);
                conjunct_mtds = intern_problem_query_depth_signature(conjunct_mtds);
                propagate_min_transformation_depth_signature(conjunct_problem, conjunct_mtds, inference);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 9050L)
    public static SubLObject split_tactic_lookahead_mtds(final SubLObject split_tactic, final SubLObject parent_mtds) {
        final SubLObject split_problem = inference_datastructures_tactic.tactic_problem(split_tactic);
        final SubLObject conjunct_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(split_tactic);
        final SubLObject conjunct_mtds = split_problem_conjunct_mtds(split_problem, conjunct_mapped_problem, parent_mtds);
        return conjunct_mtds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 9389L)
    public static SubLObject split_problem_conjunct_mtds(final SubLObject split_problem, final SubLObject conjunct_mapped_problem, final SubLObject parent_mtds) {
        final SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
        final SubLObject literal_map = split_problem_conjunct_literal_map(split_problem, conjunct_mapped_problem);
        SubLObject conjunct_mtds = conses_high.copy_tree(new_initial_pqds(inference_datastructures_problem.problem_query(conjunct_problem), (SubLObject)inference_min_transformation_depth.$kw7$UNINITIALIZED));
        conjunct_mtds = napply_literal_map(parent_mtds, literal_map, conjunct_mtds);
        return conjunct_mtds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 9864L)
    public static SubLObject split_problem_conjunct_literal_map(final SubLObject split_problem, final SubLObject conjunct_mapped_problem) {
        final SubLObject split_problem_query = inference_datastructures_problem.problem_query(split_problem);
        final SubLObject split_problem_clause = split_problem_query.first();
        final SubLObject conjunct_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(conjunct_mapped_problem);
        final SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem);
        final SubLObject conjunct_problem_query = inference_datastructures_problem.problem_query(conjunct_problem);
        final SubLObject conjunct_problem_clause = conjunct_problem_query.first();
        final SubLObject conjunct_problem_clause_wrt_split = bindings.apply_bindings(conjunct_variable_map, conjunct_problem_clause);
        return new_subclause_literal_map(split_problem_clause, conjunct_problem_clause_wrt_split, (SubLObject)inference_min_transformation_depth.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 10752L)
    public static SubLObject propagate_mtds_via_restriction_link(final SubLObject parent_mtds, final SubLObject restriction_link, final SubLObject inference) {
        final SubLObject restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
        final SubLObject restricted_mtds = restriction_link_restricted_mtds(restriction_link, parent_mtds);
        return propagate_min_transformation_depth_signature(restricted_problem, restricted_mtds, inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 11140L)
    public static SubLObject restriction_link_restricted_mtds(final SubLObject restriction_link, final SubLObject parent_mtds) {
        if (inference_min_transformation_depth.NIL != inference_datastructures_problem.single_literal_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link))) {
            return parent_mtds;
        }
        final SubLObject restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
        final SubLObject literal_map = restriction_link_literal_map(restriction_link);
        SubLObject restricted_mtds = conses_high.copy_tree(new_initial_pqds(inference_datastructures_problem.problem_query(restricted_problem), (SubLObject)inference_min_transformation_depth.$kw7$UNINITIALIZED));
        restricted_mtds = napply_literal_map(parent_mtds, literal_map, restricted_mtds);
        return restricted_mtds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 11732L)
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 13047L)
    public static SubLObject compute_restricted_clause_literal_map(SubLObject unrestricted_clause, final SubLObject restricted_clause) {
        SubLObject literal_map = compute_clause_literal_map(unrestricted_clause, restricted_clause);
        if (inference_min_transformation_depth.NIL != subl_promotions.memberP((SubLObject)inference_min_transformation_depth.NIL, literal_map.first(), (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED) || inference_min_transformation_depth.NIL != subl_promotions.memberP((SubLObject)inference_min_transformation_depth.NIL, conses_high.second(literal_map), (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED)) {
            unrestricted_clause = inference_czer.inference_simplify_contextualized_dnf_clause(conses_high.copy_tree(unrestricted_clause));
            literal_map = compute_clause_literal_map(unrestricted_clause, restricted_clause);
        }
        return literal_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 13845L)
    public static SubLObject compute_clause_literal_map(final SubLObject parent_clause, final SubLObject child_clause) {
        SubLObject parent_neg_lits = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject parent_pos_lits = (SubLObject)inference_min_transformation_depth.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parent_clause, parent_clause, (SubLObject)inference_min_transformation_depth.$list8);
        parent_neg_lits = parent_clause.first();
        SubLObject current = parent_clause.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parent_clause, (SubLObject)inference_min_transformation_depth.$list8);
        parent_pos_lits = current.first();
        current = current.rest();
        if (inference_min_transformation_depth.NIL == current) {
            SubLObject child_neg_lits = (SubLObject)inference_min_transformation_depth.NIL;
            SubLObject child_pos_lits = (SubLObject)inference_min_transformation_depth.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(child_clause, child_clause, (SubLObject)inference_min_transformation_depth.$list9);
            child_neg_lits = child_clause.first();
            SubLObject current_$8 = child_clause.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$8, child_clause, (SubLObject)inference_min_transformation_depth.$list9);
            child_pos_lits = current_$8.first();
            current_$8 = current_$8.rest();
            if (inference_min_transformation_depth.NIL == current_$8) {
                SubLObject neg_lit_map = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject pos_lit_map = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject cdolist_list_var = parent_neg_lits;
                SubLObject parent_neg_lit = (SubLObject)inference_min_transformation_depth.NIL;
                parent_neg_lit = cdolist_list_var.first();
                while (inference_min_transformation_depth.NIL != cdolist_list_var) {
                    final SubLObject child_index = Sequences.position(parent_neg_lit, child_neg_lits, Symbols.symbol_function((SubLObject)inference_min_transformation_depth.EQUAL), (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED);
                    neg_lit_map = (SubLObject)ConsesLow.cons(child_index, neg_lit_map);
                    cdolist_list_var = cdolist_list_var.rest();
                    parent_neg_lit = cdolist_list_var.first();
                }
                cdolist_list_var = parent_pos_lits;
                SubLObject parent_pos_lit = (SubLObject)inference_min_transformation_depth.NIL;
                parent_pos_lit = cdolist_list_var.first();
                while (inference_min_transformation_depth.NIL != cdolist_list_var) {
                    final SubLObject child_index = Sequences.position(parent_pos_lit, child_pos_lits, Symbols.symbol_function((SubLObject)inference_min_transformation_depth.EQUAL), (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED);
                    pos_lit_map = (SubLObject)ConsesLow.cons(child_index, pos_lit_map);
                    cdolist_list_var = cdolist_list_var.rest();
                    parent_pos_lit = cdolist_list_var.first();
                }
                pos_lit_map = Sequences.nreverse(pos_lit_map);
                final SubLObject literal_map = (SubLObject)ConsesLow.list(neg_lit_map, pos_lit_map);
                return literal_map;
            }
            cdestructuring_bind.cdestructuring_bind_error(child_clause, (SubLObject)inference_min_transformation_depth.$list9);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parent_clause, (SubLObject)inference_min_transformation_depth.$list8);
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 14636L)
    public static SubLObject propagate_mtds_via_union_link(final SubLObject parent_mtds, final SubLObject union_link, final SubLObject inference) {
        final SubLObject disjunct_problem = inference_worker_union.union_link_supporting_problem(union_link);
        final SubLObject disjunct_problem_query = inference_datastructures_problem.problem_query(disjunct_problem);
        final SubLObject disjunct_mtds = new_initial_pqds(disjunct_problem_query, (SubLObject)inference_min_transformation_depth.ZERO_INTEGER);
        return propagate_min_transformation_depth_signature(disjunct_problem, disjunct_mtds, inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 15135L)
    public static SubLObject union_tactic_lookahead_mtds(final SubLObject union_tactic, final SubLObject parent_mtds) {
        assert inference_min_transformation_depth.NIL != multi_clause_problem_query_depth_signature_p(parent_mtds) : parent_mtds;
        final SubLObject index = inference_worker_union.union_tactic_disjunct_index(union_tactic);
        return ConsesLow.nth(index, parent_mtds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 15376L)
    public static SubLObject problem_query_depth_signature_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_min_transformation_depth.NIL != single_literal_problem_query_depth_signature_p(v_object) || inference_min_transformation_depth.NIL != multi_literal_problem_query_depth_signature_p(v_object) || inference_min_transformation_depth.NIL != multi_clause_problem_query_depth_signature_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 15884L)
    public static SubLObject single_literal_problem_query_depth_signature_p(final SubLObject v_object) {
        return subl_promotions.non_negative_integer_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16012L)
    public static SubLObject multi_literal_problem_query_depth_signature_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && inference_min_transformation_depth.NIL != list_utilities.lengthE(v_object, (SubLObject)inference_min_transformation_depth.TWO_INTEGER, (SubLObject)inference_min_transformation_depth.UNPROVIDED) && v_object.first().isList() && inference_min_transformation_depth.NIL != list_utilities.every_in_list((SubLObject)inference_min_transformation_depth.$sym11$SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, v_object.first(), (SubLObject)inference_min_transformation_depth.UNPROVIDED) && conses_high.second(v_object).isList() && inference_min_transformation_depth.NIL != list_utilities.every_in_list((SubLObject)inference_min_transformation_depth.$sym11$SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, conses_high.second(v_object), (SubLObject)inference_min_transformation_depth.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16372L)
    public static SubLObject multi_clause_problem_query_depth_signature_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && inference_min_transformation_depth.NIL != list_utilities.lengthGE(v_object, (SubLObject)inference_min_transformation_depth.TWO_INTEGER, (SubLObject)inference_min_transformation_depth.UNPROVIDED) && inference_min_transformation_depth.NIL != list_utilities.every_in_list((SubLObject)inference_min_transformation_depth.$sym12$MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P, v_object, (SubLObject)inference_min_transformation_depth.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16576L)
    public static SubLObject clear_intern_problem_query_depth_signature() {
        final SubLObject cs = inference_min_transformation_depth.$intern_problem_query_depth_signature_caching_state$.getGlobalValue();
        if (inference_min_transformation_depth.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16576L)
    public static SubLObject remove_intern_problem_query_depth_signature(final SubLObject pqds) {
        return memoization_state.caching_state_remove_function_results_with_args(inference_min_transformation_depth.$intern_problem_query_depth_signature_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pqds), (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16576L)
    public static SubLObject intern_problem_query_depth_signature_internal(final SubLObject pqds) {
        assert inference_min_transformation_depth.NIL != problem_query_depth_signature_p(pqds) : pqds;
        return conses_high.copy_tree(pqds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16576L)
    public static SubLObject intern_problem_query_depth_signature(final SubLObject pqds) {
        SubLObject caching_state = inference_min_transformation_depth.$intern_problem_query_depth_signature_caching_state$.getGlobalValue();
        if (inference_min_transformation_depth.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)inference_min_transformation_depth.$sym13$INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE, (SubLObject)inference_min_transformation_depth.$sym15$_INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE_CACHING_STATE_, (SubLObject)inference_min_transformation_depth.NIL, (SubLObject)inference_min_transformation_depth.EQUAL, (SubLObject)inference_min_transformation_depth.ONE_INTEGER, (SubLObject)inference_min_transformation_depth.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pqds, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(intern_problem_query_depth_signature_internal(pqds)));
            memoization_state.caching_state_put(caching_state, pqds, results, (SubLObject)inference_min_transformation_depth.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 16769L)
    public static SubLObject new_initial_pqds(final SubLObject problem_query, SubLObject depth) {
        if (depth == inference_min_transformation_depth.UNPROVIDED) {
            depth = (SubLObject)inference_min_transformation_depth.ZERO_INTEGER;
        }
        if (inference_min_transformation_depth.NIL != inference_datastructures_problem_query.single_literal_problem_query_p(problem_query)) {
            return depth;
        }
        if (inference_min_transformation_depth.NIL != list_utilities.singletonP(problem_query)) {
            return new_initial_clause_pqds(problem_query.first(), depth);
        }
        SubLObject clause_pqds_list = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject cdolist_list_var = problem_query;
        SubLObject contextualized_clause = (SubLObject)inference_min_transformation_depth.NIL;
        contextualized_clause = cdolist_list_var.first();
        while (inference_min_transformation_depth.NIL != cdolist_list_var) {
            clause_pqds_list = (SubLObject)ConsesLow.cons(new_initial_clause_pqds(contextualized_clause, depth), clause_pqds_list);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        clause_pqds_list = Sequences.nreverse(clause_pqds_list);
        if (depth.isInteger()) {
            clause_pqds_list = intern_problem_query_depth_signature(clause_pqds_list);
        }
        return clause_pqds_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 17394L)
    public static SubLObject new_initial_clause_pqds(final SubLObject contextualized_clause, SubLObject depth) {
        if (depth == inference_min_transformation_depth.UNPROVIDED) {
            depth = (SubLObject)inference_min_transformation_depth.ZERO_INTEGER;
        }
        SubLObject pqds = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.make_list(Sequences.length(clauses.neg_lits(contextualized_clause)), depth), (SubLObject)ConsesLow.make_list(Sequences.length(clauses.pos_lits(contextualized_clause)), depth));
        if (depth.isInteger()) {
            pqds = intern_problem_query_depth_signature(pqds);
        }
        return pqds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 17739L)
    public static SubLObject new_subclause_pqds(final SubLObject parent_pqds, final SubLObject subclause_spec) {
        assert inference_min_transformation_depth.NIL != multi_literal_problem_query_depth_signature_p(parent_pqds) : parent_pqds;
        SubLObject neg_lit_pqds = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject pos_lit_pqds = (SubLObject)inference_min_transformation_depth.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parent_pqds, parent_pqds, (SubLObject)inference_min_transformation_depth.$list16);
        neg_lit_pqds = parent_pqds.first();
        SubLObject current = parent_pqds.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parent_pqds, (SubLObject)inference_min_transformation_depth.$list16);
        pos_lit_pqds = current.first();
        current = current.rest();
        if (inference_min_transformation_depth.NIL == current) {
            SubLObject neg_lit_specs = (SubLObject)inference_min_transformation_depth.NIL;
            SubLObject pos_lit_specs = (SubLObject)inference_min_transformation_depth.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(subclause_spec, subclause_spec, (SubLObject)inference_min_transformation_depth.$list17);
            neg_lit_specs = subclause_spec.first();
            SubLObject current_$10 = subclause_spec.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$10, subclause_spec, (SubLObject)inference_min_transformation_depth.$list17);
            pos_lit_specs = current_$10.first();
            current_$10 = current_$10.rest();
            if (inference_min_transformation_depth.NIL == current_$10) {
                SubLObject result_neg_lit_pqds = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject result_pos_lit_pqds = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject cdolist_list_var = neg_lit_specs;
                SubLObject neg_lit_spec = (SubLObject)inference_min_transformation_depth.NIL;
                neg_lit_spec = cdolist_list_var.first();
                while (inference_min_transformation_depth.NIL != cdolist_list_var) {
                    result_neg_lit_pqds = (SubLObject)ConsesLow.cons(ConsesLow.nth(neg_lit_spec, neg_lit_pqds), result_neg_lit_pqds);
                    cdolist_list_var = cdolist_list_var.rest();
                    neg_lit_spec = cdolist_list_var.first();
                }
                cdolist_list_var = pos_lit_specs;
                SubLObject pos_lit_spec = (SubLObject)inference_min_transformation_depth.NIL;
                pos_lit_spec = cdolist_list_var.first();
                while (inference_min_transformation_depth.NIL != cdolist_list_var) {
                    result_pos_lit_pqds = (SubLObject)ConsesLow.cons(ConsesLow.nth(pos_lit_spec, pos_lit_pqds), result_pos_lit_pqds);
                    cdolist_list_var = cdolist_list_var.rest();
                    pos_lit_spec = cdolist_list_var.first();
                }
                result_neg_lit_pqds = Sequences.nreverse(result_neg_lit_pqds);
                result_pos_lit_pqds = Sequences.nreverse(result_pos_lit_pqds);
                if (inference_min_transformation_depth.NIL == result_neg_lit_pqds && inference_min_transformation_depth.NIL != list_utilities.singletonP(result_pos_lit_pqds)) {
                    return result_pos_lit_pqds.first();
                }
                if (inference_min_transformation_depth.NIL == result_pos_lit_pqds && inference_min_transformation_depth.NIL != list_utilities.singletonP(result_neg_lit_pqds)) {
                    return result_neg_lit_pqds.first();
                }
                return intern_problem_query_depth_signature((SubLObject)ConsesLow.list(result_neg_lit_pqds, result_pos_lit_pqds));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(subclause_spec, (SubLObject)inference_min_transformation_depth.$list17);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parent_pqds, (SubLObject)inference_min_transformation_depth.$list16);
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18785L)
    public static SubLObject clear_pqds_depth() {
        final SubLObject cs = inference_min_transformation_depth.$pqds_depth_caching_state$.getGlobalValue();
        if (inference_min_transformation_depth.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18785L)
    public static SubLObject remove_pqds_depth(final SubLObject pqds, final SubLObject mode) {
        return memoization_state.caching_state_remove_function_results_with_args(inference_min_transformation_depth.$pqds_depth_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pqds, mode), (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18785L)
    public static SubLObject pqds_depth_internal(final SubLObject pqds, final SubLObject mode) {
        if (mode.eql((SubLObject)inference_min_transformation_depth.$kw19$UNINTUITIVE)) {
            return tree_min_number(pqds);
        }
        if (mode.eql((SubLObject)inference_min_transformation_depth.$kw20$INTUITIVE)) {
            return tree_sum(pqds);
        }
        return Errors.error((SubLObject)inference_min_transformation_depth.$str21$unexpected_mode__S, mode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 18785L)
    public static SubLObject pqds_depth(final SubLObject pqds, final SubLObject mode) {
        SubLObject caching_state = inference_min_transformation_depth.$pqds_depth_caching_state$.getGlobalValue();
        if (inference_min_transformation_depth.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)inference_min_transformation_depth.$sym18$PQDS_DEPTH, (SubLObject)inference_min_transformation_depth.$sym22$_PQDS_DEPTH_CACHING_STATE_, (SubLObject)inference_min_transformation_depth.NIL, (SubLObject)inference_min_transformation_depth.EQUAL, (SubLObject)inference_min_transformation_depth.TWO_INTEGER, (SubLObject)inference_min_transformation_depth.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pqds, mode);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_min_transformation_depth.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_min_transformation_depth.NIL;
            collision = cdolist_list_var.first();
            while (inference_min_transformation_depth.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pqds.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inference_min_transformation_depth.NIL != cached_args && inference_min_transformation_depth.NIL == cached_args.rest() && mode.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pqds_depth_internal(pqds, mode)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pqds, mode));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 19046L)
    public static SubLObject pqds_merge(final SubLObject pqds1, final SubLObject pqds2) {
        if (pqds1.equal(pqds2)) {
            return pqds1;
        }
        if (inference_min_transformation_depth.NIL != single_literal_problem_query_depth_signature_p(pqds1)) {
            return single_literal_pqds_merge(pqds1, pqds2);
        }
        if (inference_min_transformation_depth.NIL != multi_literal_problem_query_depth_signature_p(pqds1)) {
            return multi_literal_pqds_merge(pqds1, pqds2);
        }
        return multi_clause_pqds_merge(pqds1, pqds2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 19505L)
    public static SubLObject single_literal_pqds_merge(final SubLObject pqds1, final SubLObject pqds2) {
        return Numbers.min(pqds1, pqds2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 19589L)
    public static SubLObject multi_literal_pqds_merge(final SubLObject pqds1, final SubLObject pqds2) {
        SubLObject merged_neg_pqds = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject merged_pos_pqds = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject lit_pqds1 = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject lit_pqds1_$11 = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject lit_pqds2 = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject lit_pqds2_$12 = (SubLObject)inference_min_transformation_depth.NIL;
        lit_pqds1 = clauses.neg_lits(pqds1);
        lit_pqds1_$11 = lit_pqds1.first();
        lit_pqds2 = clauses.neg_lits(pqds2);
        lit_pqds2_$12 = lit_pqds2.first();
        while (inference_min_transformation_depth.NIL != lit_pqds2 || inference_min_transformation_depth.NIL != lit_pqds1) {
            merged_neg_pqds = (SubLObject)ConsesLow.cons(single_literal_pqds_merge(lit_pqds1_$11, lit_pqds2_$12), merged_neg_pqds);
            lit_pqds1 = lit_pqds1.rest();
            lit_pqds1_$11 = lit_pqds1.first();
            lit_pqds2 = lit_pqds2.rest();
            lit_pqds2_$12 = lit_pqds2.first();
        }
        lit_pqds1 = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject lit_pqds1_$12 = (SubLObject)inference_min_transformation_depth.NIL;
        lit_pqds2 = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject lit_pqds2_$13 = (SubLObject)inference_min_transformation_depth.NIL;
        lit_pqds1 = clauses.pos_lits(pqds1);
        lit_pqds1_$12 = lit_pqds1.first();
        lit_pqds2 = clauses.pos_lits(pqds2);
        lit_pqds2_$13 = lit_pqds2.first();
        while (inference_min_transformation_depth.NIL != lit_pqds2 || inference_min_transformation_depth.NIL != lit_pqds1) {
            merged_pos_pqds = (SubLObject)ConsesLow.cons(single_literal_pqds_merge(lit_pqds1_$12, lit_pqds2_$13), merged_pos_pqds);
            lit_pqds1 = lit_pqds1.rest();
            lit_pqds1_$12 = lit_pqds1.first();
            lit_pqds2 = lit_pqds2.rest();
            lit_pqds2_$13 = lit_pqds2.first();
        }
        final SubLObject merged_pqds = (SubLObject)ConsesLow.list(Sequences.nreverse(merged_neg_pqds), Sequences.nreverse(merged_pos_pqds));
        return intern_problem_query_depth_signature(merged_pqds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 20192L)
    public static SubLObject multi_clause_pqds_merge(final SubLObject pqds1, final SubLObject pqds2) {
        SubLObject merged_pqds = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject clause_pqds1 = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject clause_pqds1_$15 = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject clause_pqds2 = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject clause_pqds2_$16 = (SubLObject)inference_min_transformation_depth.NIL;
        clause_pqds1 = pqds1;
        clause_pqds1_$15 = clause_pqds1.first();
        clause_pqds2 = pqds2;
        clause_pqds2_$16 = clause_pqds2.first();
        while (inference_min_transformation_depth.NIL != clause_pqds2 || inference_min_transformation_depth.NIL != clause_pqds1) {
            merged_pqds = (SubLObject)ConsesLow.cons(pqds_merge(clause_pqds1_$15, clause_pqds2_$16), merged_pqds);
            clause_pqds1 = clause_pqds1.rest();
            clause_pqds1_$15 = clause_pqds1.first();
            clause_pqds2 = clause_pqds2.rest();
            clause_pqds2_$16 = clause_pqds2.first();
        }
        merged_pqds = Sequences.nreverse(merged_pqds);
        return intern_problem_query_depth_signature(merged_pqds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 20525L)
    public static SubLObject new_subclause_literal_map(final SubLObject clause, final SubLObject subclause, SubLObject missing) {
        if (missing == inference_min_transformation_depth.UNPROVIDED) {
            missing = (SubLObject)inference_min_transformation_depth.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject clause_neg_lits = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject clause_pos_lits = (SubLObject)inference_min_transformation_depth.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(clause, clause, (SubLObject)inference_min_transformation_depth.$list23);
        clause_neg_lits = clause.first();
        SubLObject current = clause.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, clause, (SubLObject)inference_min_transformation_depth.$list23);
        clause_pos_lits = current.first();
        current = current.rest();
        if (inference_min_transformation_depth.NIL == current) {
            SubLObject subclause_neg_lits = (SubLObject)inference_min_transformation_depth.NIL;
            SubLObject subclause_pos_lits = (SubLObject)inference_min_transformation_depth.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(subclause, subclause, (SubLObject)inference_min_transformation_depth.$list24);
            subclause_neg_lits = subclause.first();
            SubLObject current_$18 = subclause.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$18, subclause, (SubLObject)inference_min_transformation_depth.$list24);
            subclause_pos_lits = current_$18.first();
            current_$18 = current_$18.rest();
            if (inference_min_transformation_depth.NIL == current_$18) {
                final SubLObject map_neg_lits = (SubLObject)ConsesLow.make_list(Sequences.length(clause_neg_lits), missing);
                final SubLObject map_pos_lits = (SubLObject)ConsesLow.make_list(Sequences.length(clause_pos_lits), missing);
                SubLObject list_var = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject clause_lit = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject clause_index = (SubLObject)inference_min_transformation_depth.NIL;
                list_var = clause_neg_lits;
                clause_lit = list_var.first();
                for (clause_index = (SubLObject)inference_min_transformation_depth.ZERO_INTEGER; inference_min_transformation_depth.NIL != list_var; list_var = list_var.rest(), clause_lit = list_var.first(), clause_index = Numbers.add((SubLObject)inference_min_transformation_depth.ONE_INTEGER, clause_index)) {
                    final SubLObject subclause_index = Sequences.position(clause_lit, subclause_neg_lits, Symbols.symbol_function((SubLObject)inference_min_transformation_depth.EQUAL), (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED);
                    if (subclause_index.isInteger()) {
                        ConsesLow.set_nth(clause_index, map_neg_lits, subclause_index);
                    }
                }
                list_var = (SubLObject)inference_min_transformation_depth.NIL;
                clause_lit = (SubLObject)inference_min_transformation_depth.NIL;
                clause_index = (SubLObject)inference_min_transformation_depth.NIL;
                list_var = clause_pos_lits;
                clause_lit = list_var.first();
                for (clause_index = (SubLObject)inference_min_transformation_depth.ZERO_INTEGER; inference_min_transformation_depth.NIL != list_var; list_var = list_var.rest(), clause_lit = list_var.first(), clause_index = Numbers.add((SubLObject)inference_min_transformation_depth.ONE_INTEGER, clause_index)) {
                    final SubLObject subclause_index = Sequences.position(clause_lit, subclause_pos_lits, Symbols.symbol_function((SubLObject)inference_min_transformation_depth.EQUAL), (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED, (SubLObject)inference_min_transformation_depth.UNPROVIDED);
                    if (subclause_index.isInteger()) {
                        ConsesLow.set_nth(clause_index, map_pos_lits, subclause_index);
                    }
                }
                final SubLObject literal_map = (SubLObject)ConsesLow.list(map_neg_lits, map_pos_lits);
                if (inference_min_transformation_depth.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_min_transformation_depth.NIL == list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)inference_min_transformation_depth.$sym25$INTEGERP), literal_map, (SubLObject)inference_min_transformation_depth.UNPROVIDED)) {
                    Errors.error((SubLObject)inference_min_transformation_depth.$str26$Failed_literal_map__S, literal_map);
                }
                return literal_map;
            }
            cdestructuring_bind.cdestructuring_bind_error(subclause, (SubLObject)inference_min_transformation_depth.$list24);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(clause, (SubLObject)inference_min_transformation_depth.$list23);
        }
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 21735L)
    public static SubLObject napply_literal_map(final SubLObject source_mtds, final SubLObject literal_map, SubLObject target_mtds) {
        SubLObject source_neg_mtds_list = (SubLObject)inference_min_transformation_depth.NIL;
        SubLObject source_pos_mtds_list = (SubLObject)inference_min_transformation_depth.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(source_mtds, source_mtds, (SubLObject)inference_min_transformation_depth.$list27);
        source_neg_mtds_list = source_mtds.first();
        SubLObject current = source_mtds.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, source_mtds, (SubLObject)inference_min_transformation_depth.$list27);
        source_pos_mtds_list = current.first();
        current = current.rest();
        if (inference_min_transformation_depth.NIL == current) {
            SubLObject neg_lit_map = (SubLObject)inference_min_transformation_depth.NIL;
            SubLObject pos_lit_map = (SubLObject)inference_min_transformation_depth.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(literal_map, literal_map, (SubLObject)inference_min_transformation_depth.$list28);
            neg_lit_map = literal_map.first();
            SubLObject current_$20 = literal_map.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$20, literal_map, (SubLObject)inference_min_transformation_depth.$list28);
            pos_lit_map = current_$20.first();
            current_$20 = current_$20.rest();
            if (inference_min_transformation_depth.NIL == current_$20) {
                final SubLObject target_neg_mtds_list = (SubLObject)(target_mtds.isCons() ? target_mtds.first() : inference_min_transformation_depth.NIL);
                final SubLObject target_pos_mtds_list = (SubLObject)(target_mtds.isCons() ? conses_high.second(target_mtds) : inference_min_transformation_depth.NIL);
                SubLObject source_neg_mtds = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject source_neg_mtds_$21 = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject neg_index = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject neg_index_$22 = (SubLObject)inference_min_transformation_depth.NIL;
                source_neg_mtds = source_neg_mtds_list;
                source_neg_mtds_$21 = source_neg_mtds.first();
                neg_index = neg_lit_map;
                neg_index_$22 = neg_index.first();
                while (inference_min_transformation_depth.NIL != neg_index || inference_min_transformation_depth.NIL != source_neg_mtds) {
                    if (neg_index_$22.isInteger()) {
                        if (target_mtds.isCons()) {
                            ConsesLow.set_nth(neg_index_$22, target_neg_mtds_list, source_neg_mtds_$21);
                        }
                        else {
                            target_mtds = source_neg_mtds_$21;
                        }
                    }
                    source_neg_mtds = source_neg_mtds.rest();
                    source_neg_mtds_$21 = source_neg_mtds.first();
                    neg_index = neg_index.rest();
                    neg_index_$22 = neg_index.first();
                }
                SubLObject source_pos_mtds = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject source_pos_mtds_$23 = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject pos_index = (SubLObject)inference_min_transformation_depth.NIL;
                SubLObject pos_index_$24 = (SubLObject)inference_min_transformation_depth.NIL;
                source_pos_mtds = source_pos_mtds_list;
                source_pos_mtds_$23 = source_pos_mtds.first();
                pos_index = pos_lit_map;
                pos_index_$24 = pos_index.first();
                while (inference_min_transformation_depth.NIL != pos_index || inference_min_transformation_depth.NIL != source_pos_mtds) {
                    if (pos_index_$24.isInteger()) {
                        if (target_mtds.isCons()) {
                            ConsesLow.set_nth(pos_index_$24, target_pos_mtds_list, source_pos_mtds_$23);
                        }
                        else {
                            target_mtds = source_pos_mtds_$23;
                        }
                    }
                    source_pos_mtds = source_pos_mtds.rest();
                    source_pos_mtds_$23 = source_pos_mtds.first();
                    pos_index = pos_index.rest();
                    pos_index_$24 = pos_index.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(literal_map, (SubLObject)inference_min_transformation_depth.$list28);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(source_mtds, (SubLObject)inference_min_transformation_depth.$list27);
        }
        return target_mtds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 22645L)
    public static SubLObject tree_sum(final SubLObject tree) {
        return tree_sum_recursive(tree, (SubLObject)inference_min_transformation_depth.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 22998L)
    public static SubLObject tree_sum_recursive(final SubLObject tree, SubLObject accumulator) {
        if (tree.isNumber()) {
            accumulator = Numbers.add(accumulator, tree);
        }
        else if (!tree.isAtom()) {
            SubLObject sublist = (SubLObject)inference_min_transformation_depth.NIL;
            SubLObject first = (SubLObject)inference_min_transformation_depth.NIL;
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 23485L)
    public static SubLObject tree_min_number(final SubLObject tree) {
        return tree_min_number_recursive(tree, (SubLObject)inference_min_transformation_depth.$kw29$POSITIVE_INFINITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-min-transformation-depth.lisp", position = 23657L)
    public static SubLObject tree_min_number_recursive(final SubLObject tree, SubLObject lowest) {
        if (inference_min_transformation_depth.NIL != number_utilities.potentially_infinite_number_p(tree)) {
            lowest = number_utilities.potentially_infinite_number_min(lowest, tree);
        }
        else if (!tree.isAtom()) {
            SubLObject sublist = (SubLObject)inference_min_transformation_depth.NIL;
            SubLObject first = (SubLObject)inference_min_transformation_depth.NIL;
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
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "problem_min_transformation_depth_from_signature", "PROBLEM-MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "min_transformation_depth_from_signature", "MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "logical_tactic_lookahead_min_transformation_depth", "LOGICAL-TACTIC-LOOKAHEAD-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "propagate_min_transformation_depth_signature_via_link", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "propagate_min_transformation_depth_signature", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "propagate_min_transformation_depth_signature_via_link_wrt_inference", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-VIA-LINK-WRT-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "propagate_mtds_via_transformation_link", "PROPAGATE-MTDS-VIA-TRANSFORMATION-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "propagate_mtds_via_residual_transformation_link", "PROPAGATE-MTDS-VIA-RESIDUAL-TRANSFORMATION-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "compute_residual_transformation_mtds", "COMPUTE-RESIDUAL-TRANSFORMATION-MTDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "propagate_mtds_via_join_ordered_link", "PROPAGATE-MTDS-VIA-JOIN-ORDERED-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "join_ordered_link_focal_mtds", "JOIN-ORDERED-LINK-FOCAL-MTDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "join_ordered_link_non_focal_mtds", "JOIN-ORDERED-LINK-NON-FOCAL-MTDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "join_ordered_tactic_lookahead_mtds", "JOIN-ORDERED-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "propagate_mtds_via_split_link", "PROPAGATE-MTDS-VIA-SPLIT-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "split_tactic_lookahead_mtds", "SPLIT-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "split_problem_conjunct_mtds", "SPLIT-PROBLEM-CONJUNCT-MTDS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "split_problem_conjunct_literal_map", "SPLIT-PROBLEM-CONJUNCT-LITERAL-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "propagate_mtds_via_restriction_link", "PROPAGATE-MTDS-VIA-RESTRICTION-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "restriction_link_restricted_mtds", "RESTRICTION-LINK-RESTRICTED-MTDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "restriction_link_literal_map", "RESTRICTION-LINK-LITERAL-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "compute_restricted_clause_literal_map", "COMPUTE-RESTRICTED-CLAUSE-LITERAL-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "compute_clause_literal_map", "COMPUTE-CLAUSE-LITERAL-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "propagate_mtds_via_union_link", "PROPAGATE-MTDS-VIA-UNION-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "union_tactic_lookahead_mtds", "UNION-TACTIC-LOOKAHEAD-MTDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "problem_query_depth_signature_p", "PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "single_literal_problem_query_depth_signature_p", "SINGLE-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "multi_literal_problem_query_depth_signature_p", "MULTI-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "multi_clause_problem_query_depth_signature_p", "MULTI-CLAUSE-PROBLEM-QUERY-DEPTH-SIGNATURE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "clear_intern_problem_query_depth_signature", "CLEAR-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "remove_intern_problem_query_depth_signature", "REMOVE-INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "intern_problem_query_depth_signature_internal", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "intern_problem_query_depth_signature", "INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "new_initial_pqds", "NEW-INITIAL-PQDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "new_initial_clause_pqds", "NEW-INITIAL-CLAUSE-PQDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "new_subclause_pqds", "NEW-SUBCLAUSE-PQDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "clear_pqds_depth", "CLEAR-PQDS-DEPTH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "remove_pqds_depth", "REMOVE-PQDS-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "pqds_depth_internal", "PQDS-DEPTH-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "pqds_depth", "PQDS-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "pqds_merge", "PQDS-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "single_literal_pqds_merge", "SINGLE-LITERAL-PQDS-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "multi_literal_pqds_merge", "MULTI-LITERAL-PQDS-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "multi_clause_pqds_merge", "MULTI-CLAUSE-PQDS-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "new_subclause_literal_map", "NEW-SUBCLAUSE-LITERAL-MAP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "napply_literal_map", "NAPPLY-LITERAL-MAP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "tree_sum", "TREE-SUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "tree_sum_recursive", "TREE-SUM-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "tree_min_number", "TREE-MIN-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_min_transformation_depth", "tree_min_number_recursive", "TREE-MIN-NUMBER-RECURSIVE", 2, 0, false);
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    public static SubLObject init_inference_min_transformation_depth_file() {
        inference_min_transformation_depth.$intern_problem_query_depth_signature_caching_state$ = SubLFiles.deflexical("*INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-CACHING-STATE*", (SubLObject)inference_min_transformation_depth.NIL);
        inference_min_transformation_depth.$pqds_depth_caching_state$ = SubLFiles.deflexical("*PQDS-DEPTH-CACHING-STATE*", (SubLObject)inference_min_transformation_depth.NIL);
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    public static SubLObject setup_inference_min_transformation_depth_file() {
        memoization_state.note_globally_cached_function((SubLObject)inference_min_transformation_depth.$sym13$INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE);
        memoization_state.note_globally_cached_function((SubLObject)inference_min_transformation_depth.$sym18$PQDS_DEPTH);
        return (SubLObject)inference_min_transformation_depth.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_min_transformation_depth_file();
    }
    
    public void initializeVariables() {
        init_inference_min_transformation_depth_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_min_transformation_depth_file();
    }
    
    static {
        me = (SubLFile)new inference_min_transformation_depth();
        inference_min_transformation_depth.$intern_problem_query_depth_signature_caching_state$ = null;
        inference_min_transformation_depth.$pqds_depth_caching_state$ = null;
        $kw0$UNDETERMINED = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $kw1$COUNTERINTUITIVE = SubLObjectFactory.makeKeyword("COUNTERINTUITIVE");
        $str2$Unexpected_logical_tactic____S = SubLObjectFactory.makeString("Unexpected logical-tactic : ~S");
        $kw3$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str4$Time_to_support__S_propagation = SubLObjectFactory.makeString("Time to support ~S propagation");
        $kw5$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $str6$Propagation_error____S = SubLObjectFactory.makeString("Propagation error : ~S");
        $kw7$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-POS-LITS"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHILD-NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("CHILD-POS-LITS"));
        $sym10$MULTI_CLAUSE_PROBLEM_QUERY_DEPTH_SIGNATURE_P = SubLObjectFactory.makeSymbol("MULTI-CLAUSE-PROBLEM-QUERY-DEPTH-SIGNATURE-P");
        $sym11$SINGLE_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P = SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P");
        $sym12$MULTI_LITERAL_PROBLEM_QUERY_DEPTH_SIGNATURE_P = SubLObjectFactory.makeSymbol("MULTI-LITERAL-PROBLEM-QUERY-DEPTH-SIGNATURE-P");
        $sym13$INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE = SubLObjectFactory.makeSymbol("INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE");
        $sym14$PROBLEM_QUERY_DEPTH_SIGNATURE_P = SubLObjectFactory.makeSymbol("PROBLEM-QUERY-DEPTH-SIGNATURE-P");
        $sym15$_INTERN_PROBLEM_QUERY_DEPTH_SIGNATURE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*INTERN-PROBLEM-QUERY-DEPTH-SIGNATURE-CACHING-STATE*");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LIT-PQDS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LIT-PQDS"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LIT-SPECS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LIT-SPECS"));
        $sym18$PQDS_DEPTH = SubLObjectFactory.makeSymbol("PQDS-DEPTH");
        $kw19$UNINTUITIVE = SubLObjectFactory.makeKeyword("UNINTUITIVE");
        $kw20$INTUITIVE = SubLObjectFactory.makeKeyword("INTUITIVE");
        $str21$unexpected_mode__S = SubLObjectFactory.makeString("unexpected mode ~S");
        $sym22$_PQDS_DEPTH_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PQDS-DEPTH-CACHING-STATE*");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-POS-LITS"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCLAUSE-NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCLAUSE-POS-LITS"));
        $sym25$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str26$Failed_literal_map__S = SubLObjectFactory.makeString("Failed literal map ~S");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOURCE-NEG-MTDS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-POS-MTDS-LIST"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LIT-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LIT-MAP"));
        $kw29$POSITIVE_INFINITY = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
    }
}

/*

	Total time: 179 ms
	
*/