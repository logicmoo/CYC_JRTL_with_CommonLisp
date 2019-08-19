package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.graph_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
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

public class inference_worker_split extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_split";
    public static String myFingerPrint = "4bbf87441d5606031ece8abd341f3f29aec9efdd89b69a497701ca79a13697f6";
    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5300L)
    private static SubLSymbol $split_module$;
    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 9000L)
    public static SubLSymbol $split_tactic_default_preference_level$;
    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 9400L)
    public static SubLSymbol $split_tactic_default_preference_level_justification$;
    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 18900L)
    public static SubLSymbol $meta_split_tactics_enabledP$;
    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19200L)
    private static SubLSymbol $determine_new_split_tactics_module$;
    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19300L)
    public static SubLSymbol $meta_split_tactic_default_preference_level$;
    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19400L)
    public static SubLSymbol $meta_split_tactic_default_preference_level_justification$;
    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22900L)
    private static SubLSymbol $meta_split_criteria$;
    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 23000L)
    private static SubLSymbol $meta_split_tactics_do_single_literals_firstP$;
    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 23100L)
    private static SubLSymbol $meta_split_favors_problem_reuseP$;
    private static SubLSymbol $SPLIT;
    private static SubLList $list1;
    private static SubLSymbol $sym2$SPLIT_LINK_VAR;
    private static SubLSymbol $sym3$CLET;
    private static SubLSymbol $sym4$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS_NUMBERED;
    private static SubLSymbol $sym5$PWHEN;
    private static SubLSymbol $sym6$PROBLEM_LINK_INDEX_OPEN_;
    private static SubLString $str7$_s_is_not_a_supporting_mapped_pro;
    private static SubLString $str8$couldn_t_find_any_split_tactics_f;
    private static SubLSymbol $sym9$HL_VAR_;
    private static SubLSymbol $SKIP;
    private static SubLString $str11$Could_not_find_the_link_for__a;
    private static SubLSymbol $sym12$SPLIT_TACTIC_P;
    private static SubLString $str13$Generalized_tactic__a_did_not_ind;
    private static SubLString $str14$Tried_to_make_a_split_link_with_l;
    private static SubLSymbol $TACTICAL;
    private static SubLSymbol $PREFERRED;
    private static SubLString $str17$the_default_for_split_tactics;
    private static SubLSymbol $PROVEN;
    private static SubLSymbol $NEG;
    private static SubLSymbol $POS;
    private static SubLSymbol $sym21$HL_VARIABLE_P;
    private static SubLSymbol $sym22$_DETERMINE_NEW_SPLIT_TACTICS_MODULE_;
    private static SubLSymbol $DETERMINE_NEW_SPLIT_TACTICS;
    private static SubLString $str24$the_default_for_meta_split_tactic;
    private static SubLSymbol $META_STRUCTURAL;
    private static SubLString $str26$unexpected_meta_structural_tactic;
    private static SubLList $list27;
    private static SubLList $list28;
    private static SubLList $list29;
    private static SubLSymbol $ONE_NO_GOOD;
    private static SubLSymbol $ALL_SINGLE_LITERAL;
    private static SubLSymbol $ALL_PROBLEM_REUSE;
    private static SubLSymbol $ONE_CLOSED;
    private static SubLSymbol $ONE_CLOSED_PROBLEM_REUSE;
    private static SubLSymbol $ALL_SINGLE_LITERAL_PROBLEM_REUSE;
    private static SubLSymbol $ALL_THE_REST;
    private static SubLString $str37$Unknown_meta_split_criterion__s;
    private static SubLList $list38;

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 800L)
    public static SubLObject split_link_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem_link.problem_link_p(v_object) && $SPLIT == inference_datastructures_problem_link.problem_link_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 1200L)
    public static SubLObject maybe_new_split_link(SubLObject supported_problem, SubLObject dnf_clause) {
        SubLObject split_link = problem_first_split_argument_link(supported_problem);
        if (NIL == split_link) {
            SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
            SubLObject supporting_mapped_problems = find_or_create_split_link_supporting_problems(store, dnf_clause, supported_problem);
            split_link = new_split_link(supported_problem, supporting_mapped_problems);
        }
        return split_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 1700L)
    public static SubLObject new_split_link(SubLObject supported_problem, SubLObject supporting_mapped_problems) {
        SubLObject split_link = inference_datastructures_problem_link.new_problem_link($SPLIT, supported_problem);
        SubLObject cdolist_list_var = supporting_mapped_problems;
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, split_link);
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        inference_worker.propagate_problem_link(split_link);
        return split_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 2200L)
    public static SubLObject destroy_split_link(SubLObject split_link) {
        SubLObject cdolist_list_var = split_link_tactics_int(split_link);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
                inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 2500L)
    public static SubLObject do_split_link_open_supporting_mapped_problems_numbered(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list1);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_mapped_problem_var = NIL;
        SubLObject index_var = NIL;
        SubLObject split_link = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list1);
        supporting_mapped_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list1);
        index_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list1);
        split_link = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject split_link_var = $sym2$SPLIT_LINK_VAR;
            return list($sym3$CLET, list(list(split_link_var, split_link)),
                    list($sym4$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS_NUMBERED, list(supporting_mapped_problem_var, index_var, split_link_var), listS($sym5$PWHEN, list($sym6$PROBLEM_LINK_INDEX_OPEN_, split_link_var, index_var), append(body, NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list1);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 2900L)
    public static SubLObject split_link_tactic(SubLObject split_link, SubLObject supporting_mapped_problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == subl_promotions.memberP(supporting_mapped_problem, inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link), Symbols.symbol_function(EQ), UNPROVIDED)) {
            Errors.error($str7$_s_is_not_a_supporting_mapped_pro, supporting_mapped_problem, split_link);
        }
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(tactic, $split_module$.getDynamicValue(thread))) {
                SubLObject candidate_mapped_problem = find_split_tactic_supporting_mapped_problem(tactic);
                if (candidate_mapped_problem.eql(supporting_mapped_problem)) {
                    return tactic;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 3600L)
    public static SubLObject split_link_tactics(SubLObject split_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactics = split_link_tactics_int(split_link);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == tactics) {
            Errors.error($str8$couldn_t_find_any_split_tactics_f, split_link);
        }
        return tactics;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 3800L)
    public static SubLObject split_link_tactics_int(SubLObject split_link) {
        SubLObject tactics = NIL;
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != generalized_split_tactic_p(tactic)) {
                tactics = cons(tactic, tactics);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return Sequences.nreverse(tactics);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 4100L)
    public static SubLObject close_split_link(SubLObject split_link) {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, supporting_mapped_problem)) {
                if (NIL != inference_datastructures_problem_link.problem_link_index_openP(split_link, index)) {
                    inference_datastructures_problem_link.problem_link_close_index(split_link, index);
                    inference_worker.consider_that_mapped_problem_could_be_irrelevant(supporting_mapped_problem, split_link);
                }
                index = Numbers.add(index, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 4500L)
    public static SubLObject find_or_create_split_link_supporting_problems(SubLObject store, SubLObject dnf_clause, SubLObject supported_problem) {
        SubLObject split_clauses = determine_shared_variable_islands(dnf_clause);
        SubLObject supported_problem_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        SubLObject supporting_mapped_problems = NIL;
        SubLObject cdolist_list_var = split_clauses;
        SubLObject subquery = NIL;
        subquery = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject subquery_free_hl_vars = variables.sort_hl_variable_list_memoized(conses_high.intersection(cycl_utilities.expression_gather(subquery, $sym9$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), supported_problem_free_hl_vars, UNPROVIDED, UNPROVIDED));
            SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem(store, subquery, subquery_free_hl_vars, UNPROVIDED);
            supporting_mapped_problems = cons(supporting_mapped_problem, supporting_mapped_problems);
            cdolist_list_var = cdolist_list_var.rest();
            subquery = cdolist_list_var.first();
        }
        return Sequences.nreverse(supporting_mapped_problems);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5400L)
    public static SubLObject split_tactic_p(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL != inference_datastructures_tactic.tactic_p(v_object) && $split_module$.getDynamicValue(thread).eql(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5500L)
    public static SubLObject new_split_tactic(SubLObject supported_problem, SubLObject index) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactic = inference_datastructures_tactic.new_tactic(supported_problem, $split_module$.getDynamicValue(thread), index);
        SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$1 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                SubLObject backwardP_var = NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
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
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5800L)
    public static SubLObject split_tactic_supporting_mapped_problem_index(SubLObject tactic) {
        return inference_datastructures_tactic.tactic_data(tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5900L)
    public static SubLObject split_tactic_link(SubLObject split_tactic) {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
        SubLObject split_link = problem_sole_split_argument_link(problem);
        if (NIL != split_link) {
            return split_link;
        }
        return Errors.error($str11$Could_not_find_the_link_for__a, split_tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 6200L)
    public static SubLObject find_split_tactic_supporting_mapped_problem(SubLObject tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != split_tactic_p(tactic) : tactic;
        SubLObject index = split_tactic_supporting_mapped_problem_index(tactic);
        SubLObject link = split_tactic_link(tactic);
        SubLObject supporting_mapped_problem = inference_datastructures_problem_link.find_supporting_mapped_problem_by_index(link, index);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == supporting_mapped_problem) {
            Errors.error($str13$Generalized_tactic__a_did_not_ind, tactic);
        }
        return Values.values(supporting_mapped_problem, link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 6700L)
    public static SubLObject find_split_tactic_supporting_problem(SubLObject tactic) {
        return inference_datastructures_problem_link.mapped_problem_problem(find_split_tactic_supporting_mapped_problem(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 6800L)
    public static SubLObject discard_all_other_possible_split_tactics(SubLObject tactic) {
        if (NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))) {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            return inference_worker.discard_possible_tactics_int(problem, NIL, NIL, $SPLIT, tactic, NIL);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 7200L)
    public static SubLObject determine_new_split_tactics(SubLObject supported_problem, SubLObject dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject split_link = maybe_new_split_link(supported_problem, dnf_clause);
        SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(split_link);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !supporting_problem_count.numG(ONE_INTEGER)) {
            Errors.error($str14$Tried_to_make_a_split_link_with_l, split_link);
        }
        inference_worker.consider_that_problem_could_be_no_good(supported_problem, NIL, $TACTICAL, T);
        if (NIL == inference_worker.no_good_problem_p(supported_problem, $TACTICAL)) {
            SubLObject index = ZERO_INTEGER;
            SubLObject link_var = split_link;
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                    new_split_tactic(supported_problem, index);
                    index = Numbers.add(index, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        return supported_problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 7900L)
    public static SubLObject compute_strategic_properties_of_split_tactic(SubLObject tactic, SubLObject supporting_problem, SubLObject strategy) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        if (NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
            thread.resetMultipleValues();
            SubLObject preference_level = compute_split_tactic_preference_level(problem, supporting_problem, $TACTICAL);
            SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_datastructures_tactic.set_tactic_preference_level(tactic, preference_level, justification);
        }
        thread.resetMultipleValues();
        SubLObject strategic_preference_level = compute_split_tactic_preference_level(problem, supporting_problem, strategy);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, strategic_preference_level, justification);
        SubLObject strategic_productivity = compute_split_tactic_productivity(problem, supporting_problem, strategy);
        inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, strategic_productivity);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 8800L)
    public static SubLObject compute_split_tactic_productivity(SubLObject supported_problem, SubLObject supporting_problem, SubLObject strategy) {
        return inference_lookahead_productivity.memoized_problem_max_removal_productivity(supporting_problem, strategy);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 9500L)
    public static SubLObject compute_split_tactic_preference_level(SubLObject supported_problem, SubLObject supporting_problem, SubLObject strategic_context) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject supporting_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(supporting_problem, strategic_context, NIL);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == preference_modules.disallowed_or_doomed_preference_level_p(supporting_preference_level)) {
            supporting_preference_level = $split_tactic_default_preference_level$.getGlobalValue();
            justification = $split_tactic_default_preference_level_justification$.getGlobalValue();
        }
        return Values.values(supporting_preference_level, justification);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 10300L)
    public static SubLObject execute_split_tactic(SubLObject tactic) {
        SubLObject split_link = split_tactic_link(tactic);
        SubLObject index = split_tactic_supporting_mapped_problem_index(tactic);
        inference_worker.problem_link_open_and_repropagate_index(split_link, index);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 10700L)
    public static SubLObject problem_sole_split_argument_link(SubLObject problem) {
        return inference_datastructures_problem.problem_sole_argument_link_of_type(problem, $SPLIT);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 10900L)
    public static SubLObject problem_first_split_argument_link(SubLObject problem) {
        return inference_datastructures_problem.problem_first_argument_link_of_type(problem, $SPLIT);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 11100L)
    public static SubLObject problem_has_split_argument_linkP(SubLObject problem) {
        return list_utilities.sublisp_boolean(problem_first_split_argument_link(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 11200L)
    public static SubLObject split_tactic_lookahead_problem(SubLObject split_tactic) {
        SubLObject supporting_mapped_problem = find_split_tactic_supporting_mapped_problem(split_tactic);
        return inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 11500L)
    public static SubLObject split_link_supporting_problems_with_variables(SubLObject split_link) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, supporting_mapped_problem)) {
                SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (NIL != inference_datastructures_problem.open_problem_p(problem)) {
                    result = cons(problem, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 11800L)
    public static SubLObject new_split_proof(SubLObject link, SubLObject subproofs_with_sub_bindings) {
        return inference_worker_join_ordered.new_conjunctive_proof(link, subproofs_with_sub_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 12100L)
    public static SubLObject split_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_p(v_object) && $SPLIT == inference_datastructures_proof.proof_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 12200L)
    public static SubLObject bubble_up_proof_to_split_link(SubLObject supporting_proof, SubLObject my_variable_map, SubLObject split_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proofs = NIL;
        SubLObject supporting_mapped_proof_lists_by_supporting_problem = NIL;
        SubLObject my_supporting_problem = inference_datastructures_proof.proof_supported_problem(supporting_proof);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, split_link, supporting_mapped_problem)) {
                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (supporting_problem.eql(my_supporting_problem) && NIL != bindings.bindings_equalP(variable_map, my_variable_map)) {
                    SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(supporting_proof);
                    SubLObject sub_proof_bindings = bindings.transfer_variable_map_to_bindings(my_variable_map, proof_bindings);
                    supporting_mapped_proof_lists_by_supporting_problem = cons(list(cons(supporting_proof, sub_proof_bindings)), supporting_mapped_proof_lists_by_supporting_problem);
                } else {
                    SubLObject proofs_with_bindings = NIL;
                    SubLObject status_var = $PROVEN;
                    SubLObject iteration_state;
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(supporting_problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                            iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject proof_list = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject cdolist_list_var_$3 = proof_list;
                        SubLObject proof = NIL;
                        proof = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                                SubLObject sub_proof_bindings2 = bindings.transfer_variable_map_to_bindings(variable_map, inference_datastructures_proof.proof_bindings(proof));
                                proofs_with_bindings = cons(cons(proof, sub_proof_bindings2), proofs_with_bindings);
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            proof = cdolist_list_var_$3.first();
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    supporting_mapped_proof_lists_by_supporting_problem = cons(proofs_with_bindings, supporting_mapped_proof_lists_by_supporting_problem);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        supporting_mapped_proof_lists_by_supporting_problem = Sequences.nreverse(supporting_mapped_proof_lists_by_supporting_problem);
        SubLObject mapped_subproof_lists = cdolist_list_var = list_utilities.cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject mapped_subproof_list = NIL;
        mapped_subproof_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject proof2 = new_split_proof(split_link, mapped_subproof_list);
            SubLObject newP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != newP) {
                proofs = cons(proof2, proofs);
            } else {
                inference_worker.possibly_note_proof_processed(supporting_proof);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_subproof_list = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2;
        proofs = (cdolist_list_var2 = Sequences.nreverse(proofs));
        SubLObject proof3 = NIL;
        proof3 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            inference_worker.bubble_up_proof(proof3);
            cdolist_list_var2 = cdolist_list_var2.rest();
            proof3 = cdolist_list_var2.first();
        }
        return proofs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 14600L)
    public static SubLObject all_literals_connected_by_shared_varsP(SubLObject dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_utilities.hl_ground_tree_p(contextualized_asent)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(dnf_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_utilities.hl_ground_tree_p(contextualized_asent)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        thread.resetMultipleValues();
        SubLObject connected_groups = categorize_clause_variables_via_literals(dnf_clause);
        SubLObject isolated_groups = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(NIL == isolated_groups && NIL != list_utilities.singletonP(connected_groups));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 15400L)
    public static SubLObject determine_shared_variable_islands(SubLObject dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject islands = NIL;
        if (NIL != el_utilities.hl_ground_tree_p(dnf_clause)) {
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject sense = $NEG;
                SubLObject island = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
                islands = cons(island, islands);
                index = Numbers.add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            }
            index = ZERO_INTEGER;
            cdolist_list_var = clauses.pos_lits(dnf_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject sense = $POS;
                SubLObject island = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
                islands = cons(island, islands);
                index = Numbers.add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            }
        } else {
            SubLObject sensified_clause = sensify_contextualized_clause(dnf_clause);
            thread.resetMultipleValues();
            SubLObject connected_groups = categorize_sensified_clause_variables_via_literals(sensified_clause);
            SubLObject isolated_groups = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var2 = connected_groups;
            SubLObject group = NIL;
            group = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject island2 = categorized_group_to_problem_query(group);
                islands = cons(island2, islands);
                cdolist_list_var2 = cdolist_list_var2.rest();
                group = cdolist_list_var2.first();
            }
            cdolist_list_var2 = isolated_groups;
            group = NIL;
            group = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject island2 = categorized_group_to_problem_query(group);
                islands = cons(island2, islands);
                cdolist_list_var2 = cdolist_list_var2.rest();
                group = cdolist_list_var2.first();
            }
        }
        return list_utilities.fast_delete_duplicates(islands, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 16600L)
    public static SubLObject categorize_clause_variables_via_literals(SubLObject clause) {
        SubLObject all_hl_vars = list_utilities.tree_gather(clause, $sym21$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject all_literals = clause_utilities.all_literals_as_asents(clause);
        return graph_utilities.categorize_nodes_via_links(all_hl_vars, all_literals, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 16900L)
    public static SubLObject categorize_sensified_clause_variables_via_literals(SubLObject sensified_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ground_groups = NIL;
        SubLObject cdolist_list_var = sensified_clause;
        SubLObject sensified_literal = NIL;
        sensified_literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_utilities.hl_ground_tree_p(sensified_literal)) {
                SubLObject group = ground_sensified_literal_to_categorized_group(sensified_literal);
                ground_groups = cons(group, ground_groups);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sensified_literal = cdolist_list_var.first();
        }
        SubLObject all_hl_vars = list_utilities.tree_gather(sensified_clause, $sym21$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject connected_groups = graph_utilities.categorize_nodes_via_links(all_hl_vars, sensified_clause, UNPROVIDED);
        SubLObject isolated_groups = thread.secondMultipleValue();
        SubLObject naked_groups = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(connected_groups, nconc(ground_groups, isolated_groups));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 17600L)
    public static SubLObject sensify_contextualized_clause(SubLObject clause) {
        SubLObject literals = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            literals = cons(cycl_utilities.negate(contextualized_asent), literals);
            index = Numbers.add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        index = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            literals = cons(contextualized_asent, literals);
            index = Numbers.add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        return Sequences.nreverse(literals);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 17900L)
    public static SubLObject unmake_sensified_literal(SubLObject sensified_literal) {
        if (NIL != el_utilities.el_negation_p(sensified_literal)) {
            return Values.values(el_utilities.literal_atomic_sentence(sensified_literal), $NEG);
        }
        return Values.values(sensified_literal, $POS);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 18200L)
    public static SubLObject ground_sensified_literal_to_categorized_group(SubLObject sensified_literal) {
        return list(NIL, list(sensified_literal));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 18300L)
    public static SubLObject categorized_group_to_problem_query(SubLObject group) {
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        SubLObject cdolist_list_var;
        SubLObject group_lits = cdolist_list_var = conses_high.second(group);
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_utilities.el_negation_p(literal)) {
                neg_lits = cons(el_utilities.literal_atomic_sentence(literal), neg_lits);
            } else {
                pos_lits = cons(literal, pos_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        neg_lits = Sequences.nreverse(neg_lits);
        pos_lits = Sequences.nreverse(pos_lits);
        return inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.make_clause(neg_lits, pos_lits));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19100L)
    public static SubLObject meta_split_tactics_enabledP() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $meta_split_tactics_enabledP$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19500L)
    public static SubLObject meta_split_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_tactic.tactic_p(v_object) && $determine_new_split_tactics_module$.getGlobalValue().eql(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19600L)
    public static SubLObject generalized_split_tactic_p(SubLObject v_object) {
        return makeBoolean(NIL != split_tactic_p(v_object) || NIL != meta_split_tactic_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19800L)
    public static SubLObject meta_split_tactic_link(SubLObject meta_split_tactic) {
        return split_tactic_link(meta_split_tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19900L)
    public static SubLObject meta_split_tactic_todo_indices(SubLObject meta_split_tactic) {
        return inference_datastructures_tactic.tactic_data(meta_split_tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 20000L)
    public static SubLObject meta_split_tactic_index_doneP(SubLObject meta_split_tactic, SubLObject index) {
        SubLObject todo_indices = meta_split_tactic_todo_indices(meta_split_tactic);
        return makeBoolean(NIL == list_utilities.member_eqP(index, todo_indices));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 20200L)
    public static SubLObject meta_split_tactic_productivity(SubLObject meta_split_tactic) {
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(Sequences.length(meta_split_tactic_todo_indices(meta_split_tactic)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 20500L)
    public static SubLObject determine_new_meta_split_tactics(SubLObject supported_problem, SubLObject dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject split_link = maybe_new_split_link(supported_problem, dnf_clause);
        SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(split_link);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !supporting_problem_count.numG(ONE_INTEGER)) {
            Errors.error($str14$Tried_to_make_a_split_link_with_l, split_link);
        }
        inference_worker.consider_that_problem_could_be_no_good(supported_problem, NIL, $TACTICAL, T);
        if (NIL == inference_worker.no_good_problem_p(supported_problem, $TACTICAL)) {
            new_meta_split_tactic(supported_problem);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 21100L)
    public static SubLObject new_meta_split_tactic(SubLObject problem) {
        SubLObject split_link = problem_sole_split_argument_link(problem);
        SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(split_link);
        SubLObject todo_indices = conses_high.copy_list(list_utilities.num_list(supporting_problem_count, UNPROVIDED));
        SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, $determine_new_split_tactics_module$.getGlobalValue(), todo_indices);
        inference_datastructures_tactic.note_tactic_progress_iterator(tactic, new_meta_split_progress_iterator(tactic));
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$4 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$4);
                SubLObject backwardP_var = NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$5 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$5)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$5);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 21600L)
    public static SubLObject compute_strategic_properties_of_meta_split_tactic(SubLObject tactic, SubLObject strategy) {
        if (NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
            inference_datastructures_tactic.set_tactic_preference_level(tactic, $meta_split_tactic_default_preference_level$.getGlobalValue(), $meta_split_tactic_default_preference_level_justification$.getGlobalValue());
        }
        inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, $meta_split_tactic_default_preference_level$.getGlobalValue(), $meta_split_tactic_default_preference_level_justification$.getGlobalValue());
        inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, ZERO_INTEGER);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22200L)
    public static SubLObject new_meta_split_progress_iterator(SubLObject tactic) {
        return inference_datastructures_tactic.new_tactic_progress_iterator($META_STRUCTURAL, tactic, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22400L)
    public static SubLObject meta_structural_progress_iterator_doneP(SubLObject tactic) {
        if (NIL != meta_split_tactic_p(tactic)) {
            return meta_split_progress_iterator_doneP(tactic);
        }
        return Errors.error($str26$unexpected_meta_structural_tactic, tactic);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22600L)
    public static SubLObject meta_split_progress_iterator_doneP(SubLObject tactic) {
        SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject todo_indices = meta_split_tactic_todo_indices(tactic);
        return makeBoolean(NIL == todo_indices || NIL != inference_worker.no_good_problem_p(supported_problem, $TACTICAL));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 23200L)
    public static SubLObject meta_split_criteria() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $meta_split_criteria$.getDynamicValue(thread)) {
            return $meta_split_criteria$.getDynamicValue(thread);
        }
        if (NIL != $meta_split_tactics_do_single_literals_firstP$.getDynamicValue(thread)) {
            return $list27;
        }
        if (NIL != $meta_split_favors_problem_reuseP$.getDynamicValue(thread)) {
            return $list28;
        }
        return $list29;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 23600L)
    public static SubLObject execute_meta_split_tactic(SubLObject tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        if (NIL == inference_datastructures_problem.tactically_no_good_problem_p(supported_problem)) {
            SubLObject split_link = meta_split_tactic_link(tactic);
            SubLObject problem_index_pairs = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                SubLObject csome_list_var = meta_split_criteria();
                SubLObject meta_split_criterion = NIL;
                meta_split_criterion = csome_list_var.first();
                while (NIL == doneP && NIL != csome_list_var) {
                    SubLObject index = ZERO_INTEGER;
                    SubLObject link_var = split_link;
                    SubLObject rest;
                    SubLObject supporting_mapped_problem;
                    SubLObject supporting_problem;
                    SubLObject applicableP;
                    SubLObject stop_after_each_oneP;
                    for (rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); NIL == doneP && NIL != rest; rest = rest.rest()) {
                        supporting_mapped_problem = rest.first();
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            if (NIL == meta_split_tactic_index_doneP(tactic, index)) {
                                supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                thread.resetMultipleValues();
                                applicableP = meta_split_criterion_applicableP(meta_split_criterion, supporting_problem);
                                stop_after_each_oneP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != applicableP) {
                                    problem_index_pairs = cons(list(index, supporting_problem), problem_index_pairs);
                                    if (NIL != stop_after_each_oneP) {
                                        doneP = T;
                                    }
                                }
                            }
                            index = Numbers.add(index, ONE_INTEGER);
                        }
                    }
                    if (NIL != problem_index_pairs) {
                        doneP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    meta_split_criterion = csome_list_var.first();
                }
            }
            meta_split_tactic_create_and_activate_split_tactics(tactic, supported_problem, problem_index_pairs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 24700L)
    public static SubLObject meta_split_criterion_applicableP(SubLObject meta_split_criterion, SubLObject conjunct_problem) {
        if (meta_split_criterion.eql($ONE_NO_GOOD)) {
            return Values.values(inference_datastructures_problem.tactically_no_good_problem_p(conjunct_problem), T);
        }
        if (meta_split_criterion.eql($ALL_SINGLE_LITERAL)) {
            return Values.values(inference_datastructures_problem.single_literal_problem_p(conjunct_problem), NIL);
        }
        if (meta_split_criterion.eql($ALL_PROBLEM_REUSE)) {
            return Values.values(Numbers.numG(inference_datastructures_problem.problem_dependent_link_count(conjunct_problem), ONE_INTEGER), NIL);
        }
        if (meta_split_criterion.eql($ONE_CLOSED)) {
            return Values.values(inference_datastructures_problem.closed_problem_p(conjunct_problem), T);
        }
        if (meta_split_criterion.eql($ONE_CLOSED_PROBLEM_REUSE)) {
            return Values.values(makeBoolean(NIL != inference_datastructures_problem.closed_problem_p(conjunct_problem) && inference_datastructures_problem.problem_dependent_link_count(conjunct_problem).numG(ONE_INTEGER)), T);
        }
        if (meta_split_criterion.eql($ALL_SINGLE_LITERAL_PROBLEM_REUSE)) {
            return Values.values(makeBoolean(NIL != inference_datastructures_problem.single_literal_problem_p(conjunct_problem) && inference_datastructures_problem.problem_dependent_link_count(conjunct_problem).numG(ONE_INTEGER)), NIL);
        }
        if (meta_split_criterion.eql($ALL_THE_REST)) {
            return Values.values(T, NIL);
        }
        return Errors.error($str37$Unknown_meta_split_criterion__s, meta_split_criterion);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 26100L)
    public static SubLObject meta_split_tactic_create_and_activate_split_tactics(SubLObject meta_split_tactic, SubLObject supported_problem, SubLObject problem_index_pairs) {
        SubLObject split_tactics = NIL;
        SubLObject cdolist_list_var = problem_index_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = pair;
            SubLObject index = NIL;
            SubLObject supporting_problem = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list38);
            index = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list38);
            supporting_problem = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject split_tactic = meta_split_tactic_create_one_split_tactic(meta_split_tactic, supported_problem, index);
                split_tactics = cons(split_tactic, split_tactics);
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list38);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        note_split_tactics_strategically_possible(split_tactics);
        return split_tactics;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 26600L)
    public static SubLObject meta_split_tactic_create_one_split_tactic(SubLObject meta_split_tactic, SubLObject supported_problem, SubLObject index) {
        meta_split_tactic_note_split_tactic_done(meta_split_tactic, index);
        return new_split_tactic(supported_problem, index);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 26900L)
    public static SubLObject meta_split_tactic_note_split_tactic_done(SubLObject tactic, SubLObject index) {
        SubLObject todo_indices = meta_split_tactic_todo_indices(tactic);
        todo_indices = Sequences.delete(index, todo_indices, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        inference_datastructures_tactic.set_meta_split_tactic_data(tactic, todo_indices);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 27100L)
    public static SubLObject note_split_tactics_strategically_possible(SubLObject split_tactics) {
        if (NIL != split_tactics) {
            SubLObject prob;
            SubLObject supported_problem = prob = inference_datastructures_tactic.tactic_problem(split_tactics.first());
            SubLObject store = inference_datastructures_problem.problem_store(prob);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$6 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                    SubLObject backwardP_var = NIL;
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
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                        state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                        inference_tactician.strategy_note_split_tactics_strategically_possible(strategy, split_tactics);
                                    }
                                }
                            }
                        }
                    }
                }
                SubLObject idx_$7 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$7)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$7);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                                SubLObject inference_var2 = inference2;
                                SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                        state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                        inference_tactician.strategy_note_split_tactics_strategically_possible(strategy2, split_tactics);
                                    }
                                }
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_split_file() {
        declareFunction(myName, "split_link_p", "SPLIT-LINK-P", 1, 0, false);
        declareFunction(myName, "maybe_new_split_link", "MAYBE-NEW-SPLIT-LINK", 2, 0, false);
        declareFunction(myName, "new_split_link", "NEW-SPLIT-LINK", 2, 0, false);
        declareFunction(myName, "destroy_split_link", "DESTROY-SPLIT-LINK", 1, 0, false);
        declareMacro(me, "do_split_link_open_supporting_mapped_problems_numbered", "DO-SPLIT-LINK-OPEN-SUPPORTING-MAPPED-PROBLEMS-NUMBERED");
        declareFunction(myName, "split_link_tactic", "SPLIT-LINK-TACTIC", 2, 0, false);
        declareFunction(myName, "split_link_tactics", "SPLIT-LINK-TACTICS", 1, 0, false);
        declareFunction(myName, "split_link_tactics_int", "SPLIT-LINK-TACTICS-INT", 1, 0, false);
        declareFunction(myName, "close_split_link", "CLOSE-SPLIT-LINK", 1, 0, false);
        declareFunction(myName, "find_or_create_split_link_supporting_problems", "FIND-OR-CREATE-SPLIT-LINK-SUPPORTING-PROBLEMS", 3, 0, false);
        declareFunction(myName, "split_tactic_p", "SPLIT-TACTIC-P", 1, 0, false);
        declareFunction(myName, "new_split_tactic", "NEW-SPLIT-TACTIC", 2, 0, false);
        declareFunction(myName, "split_tactic_supporting_mapped_problem_index", "SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM-INDEX", 1, 0, false);
        declareFunction(myName, "split_tactic_link", "SPLIT-TACTIC-LINK", 1, 0, false);
        declareFunction(myName, "find_split_tactic_supporting_mapped_problem", "FIND-SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "find_split_tactic_supporting_problem", "FIND-SPLIT-TACTIC-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction(myName, "discard_all_other_possible_split_tactics", "DISCARD-ALL-OTHER-POSSIBLE-SPLIT-TACTICS", 1, 0, false);
        declareFunction(myName, "determine_new_split_tactics", "DETERMINE-NEW-SPLIT-TACTICS", 2, 0, false);
        declareFunction(myName, "compute_strategic_properties_of_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-SPLIT-TACTIC", 3, 0, false);
        declareFunction(myName, "compute_split_tactic_productivity", "COMPUTE-SPLIT-TACTIC-PRODUCTIVITY", 3, 0, false);
        declareFunction(myName, "compute_split_tactic_preference_level", "COMPUTE-SPLIT-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction(myName, "execute_split_tactic", "EXECUTE-SPLIT-TACTIC", 1, 0, false);
        declareFunction(myName, "problem_sole_split_argument_link", "PROBLEM-SOLE-SPLIT-ARGUMENT-LINK", 1, 0, false);
        declareFunction(myName, "problem_first_split_argument_link", "PROBLEM-FIRST-SPLIT-ARGUMENT-LINK", 1, 0, false);
        declareFunction(myName, "problem_has_split_argument_linkP", "PROBLEM-HAS-SPLIT-ARGUMENT-LINK?", 1, 0, false);
        declareFunction(myName, "split_tactic_lookahead_problem", "SPLIT-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
        declareFunction(myName, "split_link_supporting_problems_with_variables", "SPLIT-LINK-SUPPORTING-PROBLEMS-WITH-VARIABLES", 1, 0, false);
        declareFunction(myName, "new_split_proof", "NEW-SPLIT-PROOF", 2, 0, false);
        declareFunction(myName, "split_proof_p", "SPLIT-PROOF-P", 1, 0, false);
        declareFunction(myName, "bubble_up_proof_to_split_link", "BUBBLE-UP-PROOF-TO-SPLIT-LINK", 3, 0, false);
        declareFunction(myName, "all_literals_connected_by_shared_varsP", "ALL-LITERALS-CONNECTED-BY-SHARED-VARS?", 1, 0, false);
        declareFunction(myName, "determine_shared_variable_islands", "DETERMINE-SHARED-VARIABLE-ISLANDS", 1, 0, false);
        declareFunction(myName, "categorize_clause_variables_via_literals", "CATEGORIZE-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false);
        declareFunction(myName, "categorize_sensified_clause_variables_via_literals", "CATEGORIZE-SENSIFIED-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false);
        declareFunction(myName, "sensify_contextualized_clause", "SENSIFY-CONTEXTUALIZED-CLAUSE", 1, 0, false);
        declareFunction(myName, "unmake_sensified_literal", "UNMAKE-SENSIFIED-LITERAL", 1, 0, false);
        declareFunction(myName, "ground_sensified_literal_to_categorized_group", "GROUND-SENSIFIED-LITERAL-TO-CATEGORIZED-GROUP", 1, 0, false);
        declareFunction(myName, "categorized_group_to_problem_query", "CATEGORIZED-GROUP-TO-PROBLEM-QUERY", 1, 0, false);
        declareFunction(myName, "meta_split_tactics_enabledP", "META-SPLIT-TACTICS-ENABLED?", 0, 0, false);
        declareFunction(myName, "meta_split_tactic_p", "META-SPLIT-TACTIC-P", 1, 0, false);
        declareFunction(myName, "generalized_split_tactic_p", "GENERALIZED-SPLIT-TACTIC-P", 1, 0, false);
        declareFunction(myName, "meta_split_tactic_link", "META-SPLIT-TACTIC-LINK", 1, 0, false);
        declareFunction(myName, "meta_split_tactic_todo_indices", "META-SPLIT-TACTIC-TODO-INDICES", 1, 0, false);
        declareFunction(myName, "meta_split_tactic_index_doneP", "META-SPLIT-TACTIC-INDEX-DONE?", 2, 0, false);
        declareFunction(myName, "meta_split_tactic_productivity", "META-SPLIT-TACTIC-PRODUCTIVITY", 1, 0, false);
        declareFunction(myName, "determine_new_meta_split_tactics", "DETERMINE-NEW-META-SPLIT-TACTICS", 2, 0, false);
        declareFunction(myName, "new_meta_split_tactic", "NEW-META-SPLIT-TACTIC", 1, 0, false);
        declareFunction(myName, "compute_strategic_properties_of_meta_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-SPLIT-TACTIC", 2, 0, false);
        declareFunction(myName, "new_meta_split_progress_iterator", "NEW-META-SPLIT-PROGRESS-ITERATOR", 1, 0, false);
        declareFunction(myName, "meta_structural_progress_iterator_doneP", "META-STRUCTURAL-PROGRESS-ITERATOR-DONE?", 1, 0, false);
        declareFunction(myName, "meta_split_progress_iterator_doneP", "META-SPLIT-PROGRESS-ITERATOR-DONE?", 1, 0, false);
        declareFunction(myName, "meta_split_criteria", "META-SPLIT-CRITERIA", 0, 0, false);
        declareFunction(myName, "execute_meta_split_tactic", "EXECUTE-META-SPLIT-TACTIC", 1, 0, false);
        declareFunction(myName, "meta_split_criterion_applicableP", "META-SPLIT-CRITERION-APPLICABLE?", 2, 0, false);
        declareFunction(myName, "meta_split_tactic_create_and_activate_split_tactics", "META-SPLIT-TACTIC-CREATE-AND-ACTIVATE-SPLIT-TACTICS", 3, 0, false);
        declareFunction(myName, "meta_split_tactic_create_one_split_tactic", "META-SPLIT-TACTIC-CREATE-ONE-SPLIT-TACTIC", 3, 0, false);
        declareFunction(myName, "meta_split_tactic_note_split_tactic_done", "META-SPLIT-TACTIC-NOTE-SPLIT-TACTIC-DONE", 2, 0, false);
        declareFunction(myName, "note_split_tactics_strategically_possible", "NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_worker_split_file() {
        $split_module$ = defparameter("*SPLIT-MODULE*", inference_modules.inference_structural_module($SPLIT, UNPROVIDED));
        $split_tactic_default_preference_level$ = deflexical("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $PREFERRED);
        $split_tactic_default_preference_level_justification$ = deflexical("*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $str17$the_default_for_split_tactics);
        $meta_split_tactics_enabledP$ = defparameter("*META-SPLIT-TACTICS-ENABLED?*", T);
        $determine_new_split_tactics_module$ = deflexical("*DETERMINE-NEW-SPLIT-TACTICS-MODULE*", maybeDefault($sym22$_DETERMINE_NEW_SPLIT_TACTICS_MODULE_, $determine_new_split_tactics_module$, () -> (inference_modules.inference_meta_structural_module($DETERMINE_NEW_SPLIT_TACTICS, UNPROVIDED))));
        $meta_split_tactic_default_preference_level$ = SubLFiles.deflexical("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $PREFERRED);
        $meta_split_tactic_default_preference_level_justification$ = deflexical("*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $str24$the_default_for_meta_split_tactic);
        $meta_split_criteria$ = defparameter("*META-SPLIT-CRITERIA*", NIL);
        $meta_split_tactics_do_single_literals_firstP$ = SubLFiles.defparameter("*META-SPLIT-TACTICS-DO-SINGLE-LITERALS-FIRST?*", T);
        $meta_split_favors_problem_reuseP$ = defparameter("*META-SPLIT-FAVORS-PROBLEM-REUSE?*", T);
        return NIL;
    }

    public static SubLObject setup_inference_worker_split_file() {
        subl_macro_promotions.declare_defglobal($sym22$_DETERMINE_NEW_SPLIT_TACTICS_MODULE_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_worker_split_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_worker_split_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_worker_split_file();
    }

    static {
        me = new inference_worker_split();
        $split_module$ = null;
        $split_tactic_default_preference_level$ = null;
        $split_tactic_default_preference_level_justification$ = null;
        $meta_split_tactics_enabledP$ = null;
        $determine_new_split_tactics_module$ = null;
        $meta_split_tactic_default_preference_level$ = null;
        $meta_split_tactic_default_preference_level_justification$ = null;
        $meta_split_criteria$ = null;
        $meta_split_tactics_do_single_literals_firstP$ = null;
        $meta_split_favors_problem_reuseP$ = null;
        $SPLIT = makeKeyword("SPLIT");
        $list1 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("INDEX-VAR"), makeSymbol("SPLIT-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym2$SPLIT_LINK_VAR = makeUninternedSymbol("SPLIT-LINK-VAR");
        $sym3$CLET = makeSymbol("CLET");
        $sym4$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS_NUMBERED = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS-NUMBERED");
        $sym5$PWHEN = makeSymbol("PWHEN");
        $sym6$PROBLEM_LINK_INDEX_OPEN_ = makeSymbol("PROBLEM-LINK-INDEX-OPEN?");
        $str7$_s_is_not_a_supporting_mapped_pro = makeString("~s is not a supporting mapped problem of ~s.");
        $str8$couldn_t_find_any_split_tactics_f = makeString("couldn't find any split tactics for ~s");
        $sym9$HL_VAR_ = makeSymbol("HL-VAR?");
        $SKIP = makeKeyword("SKIP");
        $str11$Could_not_find_the_link_for__a = makeString("Could not find the link for ~a");
        $sym12$SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");
        $str13$Generalized_tactic__a_did_not_ind = makeString("Generalized tactic ~a did not indicate a valid supporting mapped problem");
        $str14$Tried_to_make_a_split_link_with_l = makeString("Tried to make a split link with less than two supporting problems: ~a");
        $TACTICAL = makeKeyword("TACTICAL");
        $PREFERRED = makeKeyword("PREFERRED");
        $str17$the_default_for_split_tactics = makeString("the default for split tactics");
        $PROVEN = makeKeyword("PROVEN");
        $NEG = makeKeyword("NEG");
        $POS = makeKeyword("POS");
        $sym21$HL_VARIABLE_P = makeSymbol("HL-VARIABLE-P");
        $sym22$_DETERMINE_NEW_SPLIT_TACTICS_MODULE_ = makeSymbol("*DETERMINE-NEW-SPLIT-TACTICS-MODULE*");
        $DETERMINE_NEW_SPLIT_TACTICS = makeKeyword("DETERMINE-NEW-SPLIT-TACTICS");
        $str24$the_default_for_meta_split_tactic = makeString("the default for meta-split tactics");
        $META_STRUCTURAL = makeKeyword("META-STRUCTURAL");
        $str26$unexpected_meta_structural_tactic = makeString("unexpected meta-structural tactic ~s");
        $list27 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ALL-SINGLE-LITERAL"), makeKeyword("ALL-THE-REST"));
        $list28 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ONE-CLOSED-PROBLEM-REUSE"), makeKeyword("ALL-SINGLE-LITERAL-PROBLEM-REUSE"), makeKeyword("ONE-CLOSED"), makeKeyword("ALL-THE-REST"));
        $list29 = list(makeKeyword("ONE-NO-GOOD"), makeKeyword("ONE-CLOSED"), makeKeyword("ALL-THE-REST"));
        $ONE_NO_GOOD = makeKeyword("ONE-NO-GOOD");
        $ALL_SINGLE_LITERAL = makeKeyword("ALL-SINGLE-LITERAL");
        $ALL_PROBLEM_REUSE = makeKeyword("ALL-PROBLEM-REUSE");
        $ONE_CLOSED = makeKeyword("ONE-CLOSED");
        $ONE_CLOSED_PROBLEM_REUSE = makeKeyword("ONE-CLOSED-PROBLEM-REUSE");
        $ALL_SINGLE_LITERAL_PROBLEM_REUSE = makeKeyword("ALL-SINGLE-LITERAL-PROBLEM-REUSE");
        $ALL_THE_REST = makeKeyword("ALL-THE-REST");
        $str37$Unknown_meta_split_criterion__s = makeString("Unknown meta-split criterion ~s");
        $list38 = list(makeSymbol("INDEX"), makeSymbol("SUPPORTING-PROBLEM"));
    }
}
/*
 *
 * Total time: 241 ms
 *
 */