package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_worker_union extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_union";
    public static final String myFingerPrint = "bfdbdac834928b99022a32fedbbf92f5a8ba0f278bbcdc658ace7f962672804a";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 3709L)
    private static SubLSymbol $union_module$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 9690L)
    public static SubLSymbol $union_tactic_preference_level$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 9977L)
    public static SubLSymbol $union_tactic_preference_level_justification$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 14602L)
    private static SubLSymbol $disjunction_assumption_module$;
    private static final SubLSymbol $kw0$UNION;
    private static final SubLString $str1$couldn_t_find_the_union_tactic_fo;
    private static final SubLSymbol $kw2$SKIP;
    private static final SubLString $str3$Could_not_find_the_link_for__a;
    private static final SubLSymbol $sym4$HL_VAR_;
    private static final SubLSymbol $kw5$TACTICAL;
    private static final SubLSymbol $kw6$PREFERRED;
    private static final SubLSymbol $sym7$UNION_TACTIC_P;
    private static final SubLSymbol $kw8$DISJUNCTIVE_ASSUMPTION;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 864L)
    public static SubLObject union_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_union.NIL != inference_datastructures_problem_link.problem_link_p(v_object) && inference_worker_union.$kw0$UNION == inference_datastructures_problem_link.problem_link_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 1216L)
    public static SubLObject maybe_new_union_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject candidate_link;
        SubLObject candidate_mapped_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_union.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_union.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            candidate_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_union.NIL != set_contents.do_set_contents_element_validP(state, candidate_link) && inference_worker_union.NIL != inference_datastructures_problem_link.problem_link_has_typeP(candidate_link, (SubLObject)inference_worker_union.$kw0$UNION)) {
                candidate_mapped_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(candidate_link);
                if (inference_worker_union.NIL != inference_datastructures_problem_link.mapped_problem_equal(supporting_mapped_problem, candidate_mapped_problem)) {
                    return candidate_link;
                }
            }
        }
        return new_union_link(supported_problem, supporting_mapped_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 1749L)
    public static SubLObject new_union_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem) {
        final SubLObject link = inference_datastructures_problem_link.new_problem_link((SubLObject)inference_worker_union.$kw0$UNION, supported_problem);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, link);
        inference_worker.propagate_problem_link(link);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 2111L)
    public static SubLObject destroy_union_link(final SubLObject union_link) {
        final SubLObject tactic = union_link_tactic_int(union_link);
        if (inference_worker_union.NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
            inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
        }
        return union_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 2383L)
    public static SubLObject union_link_supporting_problem(final SubLObject union_link) {
        return inference_datastructures_problem_link.problem_link_sole_supporting_problem(union_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 2518L)
    public static SubLObject union_link_tactic(final SubLObject union_link) {
        final SubLObject tactic = union_link_tactic_int(union_link);
        if (inference_worker_union.NIL == tactic && inference_worker_union.NIL == inference_datastructures_problem.tactically_unexamined_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(union_link))) {
            return Errors.error((SubLObject)inference_worker_union.$str1$couldn_t_find_the_union_tactic_fo, union_link);
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 2830L)
    public static SubLObject union_link_tactic_int(final SubLObject union_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(union_link);
        final SubLObject disjunct_mapped_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(union_link);
        final SubLObject disjunct_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(disjunct_mapped_problem);
        final SubLObject disjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(disjunct_mapped_problem);
        final SubLObject disjunct_query = inference_datastructures_problem.problem_query(disjunct_problem);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject union_tactic = (SubLObject)inference_worker_union.NIL;
        union_tactic = cdolist_list_var.first();
        while (inference_worker_union.NIL != cdolist_list_var) {
            if (inference_worker_union.NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(union_tactic, inference_worker_union.$union_module$.getDynamicValue(thread))) {
                final SubLObject candidate_mapped_problem = find_union_tactic_disjunct_mapped_problem(union_tactic, (SubLObject)inference_worker_union.NIL);
                if (inference_worker_union.NIL != candidate_mapped_problem && disjunct_query.equal(inference_datastructures_problem.problem_query(inference_datastructures_problem_link.mapped_problem_problem(candidate_mapped_problem))) && disjunct_variable_map.equal(inference_datastructures_problem_link.mapped_problem_variable_map(candidate_mapped_problem))) {
                    return union_tactic;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            union_tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker_union.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 3834L)
    public static SubLObject union_tactic_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_union.NIL != inference_datastructures_tactic.tactic_p(v_object) && inference_worker_union.$union_module$.getDynamicValue(thread).eql(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 3974L)
    public static SubLObject new_union_tactic(final SubLObject problem, final SubLObject disjunct_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, inference_worker_union.$union_module$.getDynamicValue(thread), disjunct_index);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker_union.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker_union.$kw2$SKIP)) {
            final SubLObject idx_$1 = idx;
            if (inference_worker_union.NIL == id_index.id_index_dense_objects_empty_p(idx_$1, (SubLObject)inference_worker_union.$kw2$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                final SubLObject backwardP_var = (SubLObject)inference_worker_union.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker_union.NIL, v_iteration = (SubLObject)inference_worker_union.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker_union.ONE_INTEGER)) {
                    id = ((inference_worker_union.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker_union.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker_union.NIL == id_index.id_index_tombstone_p(inference) || inference_worker_union.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_union.$kw2$SKIP)) {
                        if (inference_worker_union.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker_union.$kw2$SKIP;
                        }
                        if (inference_worker_union.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_union.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_union.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker_union.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$2 = idx;
            if (inference_worker_union.NIL == id_index.id_index_sparse_objects_empty_p(idx_$2)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$2);
                SubLObject id2 = (SubLObject)inference_worker_union.NIL;
                SubLObject inference2 = (SubLObject)inference_worker_union.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker_union.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker_union.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker_union.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker_union.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
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
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 4398L)
    public static SubLObject union_tactic_disjunct_index(final SubLObject union_tactic) {
        return inference_datastructures_tactic.tactic_data(union_tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 4508L)
    public static SubLObject union_tactic_link(final SubLObject union_tactic) {
        final SubLObject union_link = union_tactic_link_int(union_tactic);
        if (inference_worker_union.NIL == inference_datastructures_problem_link.problem_link_p(union_link)) {
            return Errors.error((SubLObject)inference_worker_union.$str3$Could_not_find_the_link_for__a, union_tactic);
        }
        return union_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 4892L)
    public static SubLObject union_tactic_link_int(final SubLObject union_tactic) {
        final SubLObject disjunction_problem = inference_datastructures_tactic.tactic_problem(union_tactic);
        final SubLObject disjunct_mapped_problem = find_union_tactic_disjunct_mapped_problem(union_tactic, (SubLObject)inference_worker_union.NIL);
        if (inference_worker_union.NIL != disjunct_mapped_problem) {
            final SubLObject disjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(disjunct_mapped_problem);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(disjunct_problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject union_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_union.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_union.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                union_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker_union.NIL != set_contents.do_set_contents_element_validP(state, union_link) && inference_worker_union.NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, (SubLObject)inference_worker_union.$kw0$UNION) && disjunction_problem.eql(inference_datastructures_problem_link.problem_link_supported_problem(union_link))) {
                    return union_link;
                }
            }
        }
        return (SubLObject)inference_worker_union.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 5536L)
    public static SubLObject find_union_tactic_disjunct_mapped_problem(final SubLObject tactic, final SubLObject must_be_cleanP) {
        final SubLObject disjunct_index = union_tactic_disjunct_index(tactic);
        final SubLObject disjunction_problem = inference_datastructures_tactic.tactic_problem(tactic);
        return find_union_link_supporting_mapped_problem(disjunction_problem, disjunct_index, must_be_cleanP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 5938L)
    public static SubLObject find_union_link_supporting_mapped_problem(final SubLObject supported_problem, final SubLObject disjunct_index, final SubLObject must_be_cleanP) {
        final SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
        final SubLObject disjunct_clause = ConsesLow.nth(disjunct_index, supported_query);
        return find_disjunct_problem_from_contextualized_clause(supported_problem, disjunct_clause, must_be_cleanP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 6359L)
    public static SubLObject find_disjunct_problem_from_contextualized_clause(final SubLObject disjunction_problem, final SubLObject disjunct_clause, final SubLObject must_be_cleanP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject canonical_query = inference_czer.canonicalize_problem_query((SubLObject)ConsesLow.list(disjunct_clause));
        final SubLObject canonical_variable_map = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject canonical_disjunct_clause = inference_datastructures_problem.problem_query_sole_clause(canonical_query);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(disjunction_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject union_link;
        SubLObject candidate_disjunct_problem;
        SubLObject candidate_query;
        SubLObject candidate_clause;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_union.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_union.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            union_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_union.NIL != set_contents.do_set_contents_element_validP(state, union_link) && inference_worker_union.NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, (SubLObject)inference_worker_union.$kw0$UNION)) {
                candidate_disjunct_problem = union_link_supporting_problem(union_link);
                candidate_query = inference_datastructures_problem.problem_query(candidate_disjunct_problem);
                candidate_clause = inference_datastructures_problem.problem_query_sole_clause(candidate_query);
                if (candidate_clause.equal(canonical_disjunct_clause) && (inference_worker_union.NIL == must_be_cleanP || inference_worker_union.NIL != inference_worker.problem_cleanP(candidate_disjunct_problem))) {
                    return inference_datastructures_problem_link.new_mapped_problem(candidate_disjunct_problem, canonical_variable_map);
                }
            }
        }
        return (SubLObject)inference_worker_union.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 7226L)
    public static SubLObject find_or_create_union_tactic_disjunct_mapped_problem(final SubLObject tactic) {
        final SubLObject disjunct_index = union_tactic_disjunct_index(tactic);
        final SubLObject disjunction_problem = inference_datastructures_tactic.tactic_problem(tactic);
        return find_or_create_union_link_supporting_mapped_problem(disjunction_problem, disjunct_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 7524L)
    public static SubLObject find_or_create_union_link_supporting_mapped_problem(final SubLObject supported_problem, final SubLObject disjunct_index) {
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        final SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
        final SubLObject disjunct_clause = ConsesLow.nth(disjunct_index, supported_query);
        final SubLObject disjunct_vars = cycl_utilities.expression_gather(disjunct_clause, (SubLObject)inference_worker_union.$sym4$HL_VAR_, (SubLObject)inference_worker_union.UNPROVIDED, (SubLObject)inference_worker_union.UNPROVIDED, (SubLObject)inference_worker_union.UNPROVIDED, (SubLObject)inference_worker_union.UNPROVIDED);
        final SubLObject disjunct_free_hl_vars = (SubLObject)((inference_worker_union.NIL != inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP(store)) ? variables.sort_hl_variable_list_memoized(conses_high.intersection(disjunct_vars, inference_datastructures_problem.problem_free_hl_vars(supported_problem), (SubLObject)inference_worker_union.UNPROVIDED, (SubLObject)inference_worker_union.UNPROVIDED)) : inference_worker_union.NIL);
        return inference_worker.find_or_create_problem_from_contextualized_clause(store, disjunct_clause, disjunct_free_hl_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 8286L)
    public static SubLObject determine_new_union_tactics(final SubLObject problem, final SubLObject disjunction_clauses) {
        SubLObject list_var = (SubLObject)inference_worker_union.NIL;
        SubLObject disjunct_clause = (SubLObject)inference_worker_union.NIL;
        SubLObject disjunct_index = (SubLObject)inference_worker_union.NIL;
        list_var = disjunction_clauses;
        disjunct_clause = list_var.first();
        for (disjunct_index = (SubLObject)inference_worker_union.ZERO_INTEGER; inference_worker_union.NIL != list_var; list_var = list_var.rest(), disjunct_clause = list_var.first(), disjunct_index = Numbers.add((SubLObject)inference_worker_union.ONE_INTEGER, disjunct_index)) {
            final SubLObject disjunct_mapped_problem = find_or_create_union_link_supporting_mapped_problem(problem, disjunct_index);
            maybe_new_union_link(problem, disjunct_mapped_problem);
            new_union_tactic(problem, disjunct_index);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 8781L)
    public static SubLObject compute_strategic_properties_of_union_tactic(final SubLObject tactic, final SubLObject disjunct_index, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        if (inference_worker_union.NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
            thread.resetMultipleValues();
            final SubLObject preference_level = compute_union_tactic_preference_level(problem, disjunct_index, (SubLObject)inference_worker_union.$kw5$TACTICAL);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_datastructures_tactic.set_tactic_preference_level(tactic, preference_level, justification);
        }
        thread.resetMultipleValues();
        final SubLObject strategic_preference_level = compute_union_tactic_preference_level(problem, disjunct_index, strategy);
        final SubLObject strategic_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, strategic_preference_level, strategic_justification);
        final SubLObject productivity = compute_union_tactic_productivity(problem, disjunct_index, strategy);
        inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, productivity);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 10100L)
    public static SubLObject compute_union_tactic_productivity(final SubLObject supported_problem, final SubLObject disjunct_index, final SubLObject strategy) {
        final SubLObject disjunct_mapped_problem = find_union_link_supporting_mapped_problem(supported_problem, disjunct_index, (SubLObject)inference_worker_union.NIL);
        final SubLObject disjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(disjunct_mapped_problem);
        final SubLObject disjunct_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(disjunct_problem, strategy);
        return disjunct_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 10521L)
    public static SubLObject compute_union_tactic_preference_level(final SubLObject supported_problem, final SubLObject disjunct_index, final SubLObject strategic_context) {
        return Values.values(inference_worker_union.$union_tactic_preference_level$.getGlobalValue(), inference_worker_union.$union_tactic_preference_level_justification$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 10847L)
    public static SubLObject union_tactic_lookahead_problem(final SubLObject union_tactic) {
        final SubLObject supporting_mapped_problem = find_union_tactic_disjunct_mapped_problem(union_tactic, (SubLObject)inference_worker_union.NIL);
        return inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 11118L)
    public static SubLObject execute_union_tactic(final SubLObject tactic) {
        possibly_clean_union_tactic(tactic);
        final SubLObject union_link = union_tactic_link(tactic);
        inference_worker.problem_link_open_and_repropagate_sole_supporting_mapped_problem(union_link);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 11374L)
    public static SubLObject possibly_clean_union_tactic(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker_union.NIL != union_tactic_p(tactic) : tactic;
        final SubLObject clean_disjunct_mapped_problem = find_union_tactic_disjunct_mapped_problem(tactic, (SubLObject)inference_worker_union.T);
        if (inference_worker_union.NIL == clean_disjunct_mapped_problem && inference_worker_union.NIL == inference_datastructures_tactic.tactic_discardedP(tactic) && inference_worker_union.NIL != inference_datastructures_problem_store.$problem_store_modification_permittedP$.getDynamicValue(thread)) {
            final SubLObject disjunction_problem = inference_datastructures_tactic.tactic_problem(tactic);
            SubLObject dirty_union_link = (SubLObject)inference_worker_union.NIL;
            final SubLObject dirty_disjunct_mapped_problem = find_union_tactic_disjunct_mapped_problem(tactic, (SubLObject)inference_worker_union.NIL);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(disjunction_problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject union_link;
            SubLObject candidate_mapped_problem;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_union.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_union.NIL == dirty_union_link && inference_worker_union.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                union_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker_union.NIL != set_contents.do_set_contents_element_validP(state, union_link) && inference_worker_union.NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, (SubLObject)inference_worker_union.$kw0$UNION)) {
                    candidate_mapped_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(union_link);
                    if (inference_worker_union.NIL != inference_datastructures_problem_link.mapped_problem_equal(candidate_mapped_problem, dirty_disjunct_mapped_problem)) {
                        dirty_union_link = union_link;
                    }
                }
            }
            if (inference_worker_union.NIL != dirty_union_link) {
                inference_datastructures_problem_link.destroy_problem_link(dirty_union_link);
            }
            final SubLObject clean_disjunct_mapped_problem_$3 = find_or_create_union_tactic_disjunct_mapped_problem(tactic);
            final SubLObject clean_union_link = new_union_link(disjunction_problem, clean_disjunct_mapped_problem_$3);
            union_link_tactic(clean_union_link);
            return clean_union_link;
        }
        return (SubLObject)inference_worker_union.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 12989L)
    public static SubLObject new_union_proof(final SubLObject union_link, final SubLObject subproof, SubLObject subproof_bindings) {
        final SubLObject subproofs = (SubLObject)ConsesLow.list(subproof);
        subproof_bindings = inference_worker.canonicalize_proof_bindings(subproof_bindings);
        return inference_worker.propose_new_proof_with_bindings(union_link, subproof_bindings, subproofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 13402L)
    public static SubLObject bubble_up_proof_to_union_link(final SubLObject disjunct_proof, final SubLObject disjunct_variable_map, final SubLObject union_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject disjunct_bindings = inference_datastructures_proof.proof_bindings(disjunct_proof);
        final SubLObject disjunction_bindings = bindings.transfer_variable_map_to_bindings(disjunct_variable_map, disjunct_bindings);
        thread.resetMultipleValues();
        final SubLObject disjunction_proof = new_union_proof(union_link, disjunct_proof, disjunction_bindings);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_union.NIL != newP) {
            inference_worker.bubble_up_proof(disjunction_proof);
        }
        else {
            inference_worker.possibly_note_proof_processed(disjunct_proof);
        }
        return (SubLObject)inference_worker_union.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 14223L)
    public static SubLObject disjunctive_assumption_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_union.NIL != inference_datastructures_problem_link.problem_link_p(v_object) && inference_worker_union.$kw8$DISJUNCTIVE_ASSUMPTION == inference_datastructures_problem_link.problem_link_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 14712L)
    public static SubLObject disjunctive_assumption_tactic_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_union.NIL != inference_datastructures_tactic.tactic_p(v_object) && inference_worker_union.$disjunction_assumption_module$.getDynamicValue(thread).eql(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }
    
    public static SubLObject declare_inference_worker_union_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "union_link_p", "UNION-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "maybe_new_union_link", "MAYBE-NEW-UNION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "new_union_link", "NEW-UNION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "destroy_union_link", "DESTROY-UNION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "union_link_supporting_problem", "UNION-LINK-SUPPORTING-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "union_link_tactic", "UNION-LINK-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "union_link_tactic_int", "UNION-LINK-TACTIC-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "union_tactic_p", "UNION-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "new_union_tactic", "NEW-UNION-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "union_tactic_disjunct_index", "UNION-TACTIC-DISJUNCT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "union_tactic_link", "UNION-TACTIC-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "union_tactic_link_int", "UNION-TACTIC-LINK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "find_union_tactic_disjunct_mapped_problem", "FIND-UNION-TACTIC-DISJUNCT-MAPPED-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "find_union_link_supporting_mapped_problem", "FIND-UNION-LINK-SUPPORTING-MAPPED-PROBLEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "find_disjunct_problem_from_contextualized_clause", "FIND-DISJUNCT-PROBLEM-FROM-CONTEXTUALIZED-CLAUSE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "find_or_create_union_tactic_disjunct_mapped_problem", "FIND-OR-CREATE-UNION-TACTIC-DISJUNCT-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "find_or_create_union_link_supporting_mapped_problem", "FIND-OR-CREATE-UNION-LINK-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "determine_new_union_tactics", "DETERMINE-NEW-UNION-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "compute_strategic_properties_of_union_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-UNION-TACTIC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "compute_union_tactic_productivity", "COMPUTE-UNION-TACTIC-PRODUCTIVITY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "compute_union_tactic_preference_level", "COMPUTE-UNION-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "union_tactic_lookahead_problem", "UNION-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "execute_union_tactic", "EXECUTE-UNION-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "possibly_clean_union_tactic", "POSSIBLY-CLEAN-UNION-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "new_union_proof", "NEW-UNION-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "bubble_up_proof_to_union_link", "BUBBLE-UP-PROOF-TO-UNION-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "disjunctive_assumption_link_p", "DISJUNCTIVE-ASSUMPTION-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_union", "disjunctive_assumption_tactic_p", "DISJUNCTIVE-ASSUMPTION-TACTIC-P", 1, 0, false);
        return (SubLObject)inference_worker_union.NIL;
    }
    
    public static SubLObject init_inference_worker_union_file() {
        inference_worker_union.$union_module$ = SubLFiles.defparameter("*UNION-MODULE*", inference_modules.inference_structural_module((SubLObject)inference_worker_union.$kw0$UNION, (SubLObject)inference_worker_union.UNPROVIDED));
        inference_worker_union.$union_tactic_preference_level$ = SubLFiles.deflexical("*UNION-TACTIC-PREFERENCE-LEVEL*", (SubLObject)inference_worker_union.$kw6$PREFERRED);
        inference_worker_union.$union_tactic_preference_level_justification$ = SubLFiles.deflexical("*UNION-TACTIC-PREFERENCE-LEVEL-JUSTIFICATION*", (SubLObject)inference_worker_union.$kw6$PREFERRED);
        inference_worker_union.$disjunction_assumption_module$ = SubLFiles.defparameter("*DISJUNCTION-ASSUMPTION-MODULE*", inference_modules.inference_structural_module((SubLObject)inference_worker_union.$kw8$DISJUNCTIVE_ASSUMPTION, (SubLObject)inference_worker_union.UNPROVIDED));
        return (SubLObject)inference_worker_union.NIL;
    }
    
    public static SubLObject setup_inference_worker_union_file() {
        return (SubLObject)inference_worker_union.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_worker_union_file();
    }
    
    public void initializeVariables() {
        init_inference_worker_union_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_worker_union_file();
    }
    
    static {
        me = (SubLFile)new inference_worker_union();
        inference_worker_union.$union_module$ = null;
        inference_worker_union.$union_tactic_preference_level$ = null;
        inference_worker_union.$union_tactic_preference_level_justification$ = null;
        inference_worker_union.$disjunction_assumption_module$ = null;
        $kw0$UNION = SubLObjectFactory.makeKeyword("UNION");
        $str1$couldn_t_find_the_union_tactic_fo = SubLObjectFactory.makeString("couldn't find the union tactic for ~s");
        $kw2$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str3$Could_not_find_the_link_for__a = SubLObjectFactory.makeString("Could not find the link for ~a");
        $sym4$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $kw5$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $kw6$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $sym7$UNION_TACTIC_P = SubLObjectFactory.makeSymbol("UNION-TACTIC-P");
        $kw8$DISJUNCTIVE_ASSUMPTION = SubLObjectFactory.makeKeyword("DISJUNCTIVE-ASSUMPTION");
    }
}

/*

	Total time: 96 ms
	
*/