package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_inference_reflection extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection";
    public static String myFingerPrint = "d154c0ad6f108aa50c5b5a4a335dad5411c58557a9eb70841d2bf5b8f79263fa";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 1600L)
    private static SubLSymbol $problem_count_for_term_divisor$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 2400L)
    private static SubLSymbol $problem_store_term_to_problem_ratio$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 23900L)
    private static SubLSymbol $average_problem_query_term_count$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 28100L)
    private static SubLSymbol $default_transformation_proof_rule_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 29200L)
    private static SubLSymbol $default_transformation_proof_rule_lookup_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 30700L)
    private static SubLSymbol $default_transformation_proof_bindings_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 31900L)
    private static SubLSymbol $default_transformation_proof_bindings_lookup_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 33400L)
    private static SubLSymbol $default_inference_answer_bindings_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 34600L)
    private static SubLSymbol $default_inference_answer_bindings_lookup_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 35900L)
    private static SubLSymbol $default_inference_binding_var_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 37000L)
    private static SubLSymbol $default_inference_binding_var_lookup_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 38300L)
    private static SubLSymbol $default_inference_binding_value_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 39400L)
    private static SubLSymbol $default_inference_binding_value_lookup_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 40400L)
    private static SubLSymbol $supported_inference_reflection_predicates$;
    private static SubLSymbol $sym0$PROBLEM_P;
    private static SubLSymbol $sym1$PROBLEM_STORE_P;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym3$_;
    private static SubLSymbol $sym4$PROBLEM_SUID;
    private static SubLList $list5;
    private static SubLSymbol $sym6$STORE_ID;
    private static SubLObject $$CycProblemStoreFn;
    private static SubLList $list8;
    private static SubLSymbol $sym9$PROBLEM_ID;
    private static SubLObject $$CycProblemFn;
    private static SubLList $list11;
    private static SubLSymbol $sym12$LINK_ID;
    private static SubLObject $$CycProblemLinkFn;
    private static SubLList $list14;
    private static SubLSymbol $sym15$PROOF_ID;
    private static SubLObject $$CycProofFn;
    private static SubLList $list17;
    private static SubLSymbol $sym18$INFERENCE_ID;
    private static SubLObject $$CycInferenceFn;
    private static SubLObject $$Good_ProblemProvabilityStatus;
    private static SubLSymbol $GOOD;
    private static SubLObject $$Neutral_ProblemProvabilityStatus;
    private static SubLSymbol $NEUTRAL;
    private static SubLObject $$NoGood_ProblemProvabilityStatus;
    private static SubLSymbol $NO_GOOD;
    private static SubLList $list26;
    private static SubLSymbol $sym27$VALUE;
    private static SubLSymbol $sym28$EL_VAR;
    private static SubLList $list29;
    private static SubLObject $$ELInferenceBindingFn;
    private static SubLObject $$cycProblemStoreProblemCount;
    private static SubLSymbol $POS;
    private static SubLSymbol $REMOVAL_PROBLEM_STORE_PROBLEM_COUNT_LOOKUP;
    private static SubLList $list34;
    private static SubLObject $$cycProblemStoreLinkCount;
    private static SubLSymbol $REMOVAL_PROBLEM_STORE_LINK_COUNT_LOOKUP;
    private static SubLList $list37;
    private static SubLObject $$cycProblemStoreProofCount;
    private static SubLSymbol $REMOVAL_PROBLEM_STORE_PROOF_COUNT_LOOKUP;
    private static SubLList $list40;
    private static SubLObject $$cycProblemStoreInferenceCount;
    private static SubLSymbol $REMOVAL_PROBLEM_STORE_INFERENCE_COUNT_LOOKUP;
    private static SubLList $list43;
    private static SubLObject $$cycProblemStoreTerms;
    private static SubLSymbol $NEG;
    private static SubLSymbol $REMOVAL_PROBLEM_STORE_TERMS_CHECK_POS;
    private static SubLList $list47;
    private static SubLSymbol $REMOVAL_PROBLEM_STORE_TERMS_CHECK_NEG;
    private static SubLList $list49;
    private static SubLSymbol $REMOVAL_PROBLEM_STORE_TERMS_ARG2_UNIFY;
    private static SubLList $list51;
    private static SubLObject $$cycProblemStoreProblems;
    private static SubLSymbol $REMOVAL_PROBLEM_STORE_PROBLEMS_ARG1_UNIFY;
    private static SubLList $list54;
    private static SubLSymbol $REMOVAL_PROBLEM_STORE_PROBLEMS_ARG2_UNIFY;
    private static SubLList $list56;
    private static SubLObject $$cycProblemQuerySentence;
    private static SubLSymbol $REMOVAL_PROBLEM_QUERY_SENTENCE_ARG2_UNIFY;
    private static SubLList $list59;
    private static SubLObject $$cycProblemQueryTerms;
    private static SubLSymbol $REMOVAL_PROBLEM_QUERY_TERMS_CHECK_POS;
    private static SubLList $list62;
    private static SubLSymbol $REMOVAL_PROBLEM_QUERY_TERMS_CHECK_NEG;
    private static SubLList $list64;
    private static SubLList $list65;
    private static SubLSymbol $sym66$TERM;
    private static SubLSymbol $sym67$CYCL_STORE;
    private static SubLSymbol $REMOVAL_PROBLEM_QUERY_TERMS_ARG1_UNIFY;
    private static SubLList $list69;
    private static SubLSymbol $REMOVAL_PROBLEM_QUERY_TERMS_ARG2_UNIFY;
    private static SubLList $list71;
    private static SubLObject $$cycProblemProvabilityStatus;
    private static SubLSymbol $REMOVAL_PROBLEM_PROVABILITY_STATUS_CHECK_POS;
    private static SubLList $list74;
    private static SubLSymbol $REMOVAL_PROBLEM_PROVABILITY_STATUS_ARG2_UNIFY;
    private static SubLList $list76;
    private static SubLObject $$cycTransformationProofRule;
    private static SubLSymbol $REMOVAL_TRANSFORMATION_PROOF_RULE_CHECK_POS;
    private static SubLList $list79;
    private static SubLSymbol $REMOVAL_TRANSFORMATION_PROOF_RULE_ARG2_UNIFY;
    private static SubLList $list81;
    private static SubLObject $$cycTransformationProofBindings;
    private static SubLSymbol $REMOVAL_TRANSFORMATION_PROOF_BINDINGS_CHECK_POS;
    private static SubLList $list84;
    private static SubLSymbol $REMOVAL_TRANSFORMATION_PROOF_BINDINGS_ARG2_UNIFY;
    private static SubLList $list86;
    private static SubLObject $$inferenceAnswerBindings;
    private static SubLObject $$CycInferenceAnswerFn;
    private static SubLObject $$TheEmptySet;
    private static SubLSymbol $REMOVAL_INFERENCE_ANSWER_BINDINGS_CHECK_POS;
    private static SubLList $list91;
    private static SubLSymbol $REMOVAL_INFERENCE_ANSWER_BINDINGS_ARG2_UNIFY;
    private static SubLList $list93;
    private static SubLObject $$inferenceBindingVar;
    private static SubLSymbol $REMOVAL_INFERENCE_BINDING_VAR_CHECK_POS;
    private static SubLList $list96;
    private static SubLSymbol $REMOVAL_INFERENCE_BINDING_VAR_ARG2_UNIFY;
    private static SubLList $list98;
    private static SubLObject $$inferenceBindingValue;
    private static SubLSymbol $REMOVAL_INFERENCE_BINDING_VALUE_CHECK_POS;
    private static SubLList $list101;
    private static SubLSymbol $REMOVAL_INFERENCE_BINDING_VALUE_ARG2_UNIFY;
    private static SubLList $list103;
    private static SubLList $list104;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 800L)
    public static SubLObject problem_query_mentions_termP(SubLObject problem, SubLObject v_term) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject formula = inference_datastructures_problem.problem_formula(problem);
        return removal_modules_asserted_formula.inference_term_formulas_find(v_term, formula);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 1300L)
    public static SubLObject problem_query_terms(SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject formula = inference_datastructures_problem.problem_formula(problem);
        return removal_modules_asserted_formula.inference_term_formulas_gather(formula);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 1800L)
    public static SubLObject problem_store_problems_mentioning_term_expected_count(SubLObject store, SubLObject v_term) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        return Numbers.max(ONE_INTEGER, Numbers.truncate(inference_datastructures_problem_store.problem_store_problem_count(store), $problem_count_for_term_divisor$.getGlobalValue()));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 2000L)
    public static SubLObject problem_store_problems_mentioning_term_set(SubLObject store, SubLObject v_term) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject expected_count = problem_store_problems_mentioning_term_expected_count(store, v_term);
        SubLObject problem_set = set.new_set(Symbols.symbol_function(EQL), expected_count);
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$1 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        if (NIL != problem_query_mentions_termP(problem, v_term)) {
                            set.set_add(problem, problem_set);
                        }
                    }
                }
            }
            SubLObject idx_$2 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$2)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$2);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != problem_query_mentions_termP(problem2, v_term)) {
                            set.set_add(problem2, problem_set);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return problem_set;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 2700L)
    public static SubLObject problem_store_term_expected_count(SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        return Numbers.truncate(Numbers.multiply($problem_store_term_to_problem_ratio$.getGlobalValue(), inference_datastructures_problem_store.problem_store_problem_count(store)), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 2900L)
    public static SubLObject problem_store_term_set(SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject expected_count = problem_store_term_expected_count(store);
        SubLObject term_set = set.new_set(Symbols.symbol_function(EQUAL), expected_count);
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$3 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$3);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject cdolist_list_var;
                SubLObject terms;
                SubLObject v_term;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        terms = (cdolist_list_var = problem_query_terms(problem));
                        v_term = NIL;
                        v_term = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            set.set_add(v_term, term_set);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_term = cdolist_list_var.first();
                        }
                    }
                }
            }
            SubLObject idx_$4 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$4)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$4);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2;
                        SubLObject terms2 = cdolist_list_var2 = problem_query_terms(problem2);
                        SubLObject v_term2 = NIL;
                        v_term2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            set.set_add(v_term2, term_set);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            v_term2 = cdolist_list_var2.first();
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return term_set;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 3200L)
    public static SubLObject new_problem_store_problem_iterator(SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject problems = NIL;
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$5 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$5, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$5);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        problems = cons(problem, problems);
                    }
                }
            }
            SubLObject idx_$6 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$6)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$6);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        problems = cons(problem2, problems);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        problems = Sort.sort(problems, Symbols.symbol_function($sym3$_), $sym4$PROBLEM_SUID);
        return iteration.new_list_iterator(problems);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 3700L)
    public static SubLObject cycl_problem_store_encode(SubLObject cycl_store) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern = $list5;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_store, pattern);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, $sym6$STORE_ID, UNPROVIDED, UNPROVIDED);
            return inference_datastructures_problem_store.find_problem_store_by_id(store_id);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 4200L)
    public static SubLObject cycl_problem_store_decode(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
            return el_utilities.list_to_elf(list($$CycProblemStoreFn, store_id));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 4400L)
    public static SubLObject cycl_problem_encode(SubLObject cycl_problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern = $list8;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_problem, pattern);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            SubLObject problem_id = list_utilities.alist_lookup_without_values(v_bindings, $sym9$PROBLEM_ID, UNPROVIDED, UNPROVIDED);
            SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, $sym6$STORE_ID, UNPROVIDED, UNPROVIDED);
            return inference_datastructures_problem_store.find_problem_by_ids(store_id, problem_id);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 4800L)
    public static SubLObject cycl_problem_decode(SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            SubLObject store = inference_datastructures_problem.problem_store(problem);
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                SubLObject problem_id = inference_datastructures_problem.problem_suid(problem);
                SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                return el_utilities.list_to_elf(list($$CycProblemFn, problem_id, list($$CycProblemStoreFn, store_id)));
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 5200L)
    public static SubLObject cycl_problem_link_encode(SubLObject cycl_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern = $list11;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_link, pattern);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            SubLObject link_id = list_utilities.alist_lookup_without_values(v_bindings, $sym12$LINK_ID, UNPROVIDED, UNPROVIDED);
            SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, $sym6$STORE_ID, UNPROVIDED, UNPROVIDED);
            return inference_datastructures_problem_store.find_problem_link_by_ids(store_id, link_id);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 5600L)
    public static SubLObject cycl_problem_link_decode(SubLObject link) {
        if (NIL != inference_datastructures_problem_link.valid_problem_link_p(link)) {
            SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                SubLObject link_id = inference_datastructures_problem_link.problem_link_suid(link);
                SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                return el_utilities.list_to_elf(list($$CycProblemLinkFn, link_id, list($$CycProblemStoreFn, store_id)));
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 6000L)
    public static SubLObject cycl_proof_encode(SubLObject cycl_proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern = $list14;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_proof, pattern);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            SubLObject proof_id = list_utilities.alist_lookup_without_values(v_bindings, $sym15$PROOF_ID, UNPROVIDED, UNPROVIDED);
            SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, $sym6$STORE_ID, UNPROVIDED, UNPROVIDED);
            return inference_datastructures_problem_store.find_proof_by_ids(store_id, proof_id);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 6300L)
    public static SubLObject cycl_proof_decode(SubLObject proof) {
        if (NIL != inference_datastructures_proof.valid_proof_p(proof)) {
            SubLObject store = inference_datastructures_proof.proof_store(proof);
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                SubLObject proof_id = inference_datastructures_proof.proof_suid(proof);
                SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                return el_utilities.list_to_elf(list($$CycProofFn, proof_id, list($$CycProblemStoreFn, store_id)));
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 6700L)
    public static SubLObject cycl_inference_encode(SubLObject cycl_inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern = $list17;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_inference, pattern);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            SubLObject inference_id = list_utilities.alist_lookup_without_values(v_bindings, $sym18$INFERENCE_ID, UNPROVIDED, UNPROVIDED);
            SubLObject store_id = list_utilities.alist_lookup_without_values(v_bindings, $sym6$STORE_ID, UNPROVIDED, UNPROVIDED);
            return inference_datastructures_problem_store.find_inference_by_ids(store_id, inference_id);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 7100L)
    public static SubLObject cycl_inference_decode(SubLObject inference) {
        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
            SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
                SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
                SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                return el_utilities.list_to_elf(list($$CycInferenceFn, inference_id, list($$CycProblemStoreFn, store_id)));
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 7500L)
    public static SubLObject cycl_provability_status_encode(SubLObject cycl_status) {
        if (cycl_status.eql($$Good_ProblemProvabilityStatus)) {
            return $GOOD;
        }
        if (cycl_status.eql($$Neutral_ProblemProvabilityStatus)) {
            return $NEUTRAL;
        }
        if (cycl_status.eql($$NoGood_ProblemProvabilityStatus)) {
            return $NO_GOOD;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 7900L)
    public static SubLObject cycl_provability_status_decode(SubLObject status) {
        if (status.eql($GOOD)) {
            return $$Good_ProblemProvabilityStatus;
        }
        if (status.eql($NEUTRAL)) {
            return $$Neutral_ProblemProvabilityStatus;
        }
        if (status.eql($NO_GOOD)) {
            return $$NoGood_ProblemProvabilityStatus;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 8300L)
    public static SubLObject cycl_binding_encode(SubLObject cycl_binding) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern = $list26;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_binding, pattern);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, $sym27$VALUE, UNPROVIDED, UNPROVIDED);
            SubLObject el_var = list_utilities.alist_lookup_without_values(v_bindings, $sym28$EL_VAR, UNPROVIDED, UNPROVIDED);
            return bindings.make_variable_binding(el_var, value);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 8600L)
    public static SubLObject cycl_binding_decode(SubLObject binding) {
        SubLObject el_var = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(binding, binding, $list29);
        el_var = binding.first();
        SubLObject current = value = binding.rest();
        return el_utilities.make_binary_formula($$ELInferenceBindingFn, el_var, value);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 9200L)
    public static SubLObject removal_problem_store_problem_count(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_problem_count(store);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 10300L)
    public static SubLObject removal_problem_store_link_count(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_link_count(store);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 11400L)
    public static SubLObject removal_problem_store_proof_count(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_proof_count(store);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 12600L)
    public static SubLObject removal_problem_store_inference_count(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_inference_count(store);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 13700L)
    public static SubLObject removal_problem_store_terms_check(SubLObject store, SubLObject v_term) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$7 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$7, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$7);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject problem;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        problem = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(problem)) {
                                problem = $SKIP;
                            }
                            if (NIL != removal_problem_query_terms_check(problem, v_term)) {
                                return T;
                            }
                        }
                    }
                }
                SubLObject idx_$8 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$8)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$8);
                    SubLObject id2 = NIL;
                    SubLObject problem2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            problem2 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != removal_problem_query_terms_check(problem2, v_term)) {
                                return T;
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

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 15500L)
    public static SubLObject removal_problem_store_terms_arg2_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject store = cycl_problem_store_encode(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
        if (NIL != inference_datastructures_problem_store.problem_store_p(store)) {
            return problem_store_term_expected_count(store);
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 15800L)
    public static SubLObject removal_problem_store_terms(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            SubLObject term_set = problem_store_term_set(store);
            return set.new_set_iterator(term_set);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 17000L)
    public static SubLObject removal_problem_store(SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return inference_datastructures_problem.problem_store(problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 17900L)
    public static SubLObject removal_problem_store_problems_arg2_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject store = cycl_problem_store_encode(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
        if (NIL != inference_datastructures_problem_store.problem_store_p(store)) {
            return inference_datastructures_problem_store.problem_store_problem_count(store);
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 18300L)
    public static SubLObject removal_problem_store_problem_iterator(SubLObject store) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return new_problem_store_problem_iterator(store);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 19400L)
    public static SubLObject removal_problem_query(SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return inference_datastructures_problem.problem_query(problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 20600L)
    public static SubLObject removal_problem_query_terms_check(SubLObject problem, SubLObject v_term) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return problem_query_mentions_termP(problem, v_term);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 22300L)
    public static SubLObject removal_problem_query_terms_arg1_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern = $list65;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == success) {
            return NIL;
        }
        SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, $sym66$TERM, UNPROVIDED, UNPROVIDED);
        SubLObject cycl_store = list_utilities.alist_lookup_without_values(v_bindings, $sym67$CYCL_STORE, UNPROVIDED, UNPROVIDED);
        SubLObject store = cycl_problem_store_encode(cycl_store);
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            return problem_store_problems_mentioning_term_expected_count(store, v_term);
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 22800L)
    public static SubLObject removal_problem_store_problems_mentioning_term(SubLObject store, SubLObject v_term) {
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
            SubLObject problem_set = problem_store_problems_mentioning_term_set(store, v_term);
            return set.new_set_iterator(problem_set);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 24200L)
    public static SubLObject removal_problem_query_terms(SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return problem_query_terms(problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 25200L)
    public static SubLObject removal_problem_provability_status_check(SubLObject problem, SubLObject status) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return Equality.eql(status, inference_datastructures_problem.problem_tactical_provability_status(problem));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 26200L)
    public static SubLObject removal_problem_provability_status(SubLObject problem) {
        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
            return inference_datastructures_problem.problem_tactical_provability_status(problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 27900L)
    public static SubLObject removal_transformation_proof_rule(SubLObject proof) {
        if (NIL != inference_datastructures_proof.valid_proof_p(proof) && NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            return inference_worker_transformation.transformation_proof_rule_assertion(proof);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 28300L)
    public static SubLObject removal_transformation_proof_has_rule_p(SubLObject proof, SubLObject rule) {
        return Equality.eql(rule, removal_transformation_proof_rule(proof));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 30500L)
    public static SubLObject removal_transformation_proof_bindings(SubLObject proof) {
        if (NIL != inference_datastructures_proof.valid_proof_p(proof) && NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            return inference_worker_transformation.transformation_proof_el_bindings(proof);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 30800L)
    public static SubLObject removal_transformation_proof_has_binding_p(SubLObject proof, SubLObject binding) {
        return subl_promotions.memberP(binding, removal_transformation_proof_bindings(proof), Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 33200L)
    public static SubLObject removal_inference_answer_bindings(SubLObject cycl_inference_answer) {
        if (NIL != el_utilities.el_formula_with_operator_p(cycl_inference_answer, $$CycInferenceAnswerFn)) {
            return cycl_utilities.nat_arg1(cycl_inference_answer, UNPROVIDED);
        }
        return $$TheEmptySet;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 33600L)
    public static SubLObject removal_inference_answer_has_binding_p(SubLObject v_answer, SubLObject binding) {
        return conses_high.member(binding, el_utilities.el_set_items(removal_inference_answer_bindings(v_answer)), Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 35800L)
    public static SubLObject removal_inference_binding_var(SubLObject binding) {
        if (NIL != bindings.binding_p(binding)) {
            return bindings.variable_binding_variable(binding);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 36100L)
    public static SubLObject removal_inference_binding_has_var_p(SubLObject binding, SubLObject var) {
        return Equality.eql(var, removal_inference_binding_var(binding));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 38200L)
    public static SubLObject removal_inference_binding_value(SubLObject binding) {
        if (NIL != bindings.binding_p(binding)) {
            return bindings.variable_binding_value(binding);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 38400L)
    public static SubLObject removal_inference_binding_has_value_p(SubLObject binding, SubLObject value) {
        return Equality.equal(value, removal_inference_binding_value(binding));
    }

    public static SubLObject declare_removal_modules_inference_reflection_file() {
        declareFunction(myName, "problem_query_mentions_termP", "PROBLEM-QUERY-MENTIONS-TERM?", 2, 0, false);
        declareFunction(myName, "problem_query_terms", "PROBLEM-QUERY-TERMS", 1, 0, false);
        declareFunction(myName, "problem_store_problems_mentioning_term_expected_count", "PROBLEM-STORE-PROBLEMS-MENTIONING-TERM-EXPECTED-COUNT", 2, 0, false);
        declareFunction(myName, "problem_store_problems_mentioning_term_set", "PROBLEM-STORE-PROBLEMS-MENTIONING-TERM-SET", 2, 0, false);
        declareFunction(myName, "problem_store_term_expected_count", "PROBLEM-STORE-TERM-EXPECTED-COUNT", 1, 0, false);
        declareFunction(myName, "problem_store_term_set", "PROBLEM-STORE-TERM-SET", 1, 0, false);
        declareFunction(myName, "new_problem_store_problem_iterator", "NEW-PROBLEM-STORE-PROBLEM-ITERATOR", 1, 0, false);
        declareFunction(myName, "cycl_problem_store_encode", "CYCL-PROBLEM-STORE-ENCODE", 1, 0, false);
        declareFunction(myName, "cycl_problem_store_decode", "CYCL-PROBLEM-STORE-DECODE", 1, 0, false);
        declareFunction(myName, "cycl_problem_encode", "CYCL-PROBLEM-ENCODE", 1, 0, false);
        declareFunction(myName, "cycl_problem_decode", "CYCL-PROBLEM-DECODE", 1, 0, false);
        declareFunction(myName, "cycl_problem_link_encode", "CYCL-PROBLEM-LINK-ENCODE", 1, 0, false);
        declareFunction(myName, "cycl_problem_link_decode", "CYCL-PROBLEM-LINK-DECODE", 1, 0, false);
        declareFunction(myName, "cycl_proof_encode", "CYCL-PROOF-ENCODE", 1, 0, false);
        declareFunction(myName, "cycl_proof_decode", "CYCL-PROOF-DECODE", 1, 0, false);
        declareFunction(myName, "cycl_inference_encode", "CYCL-INFERENCE-ENCODE", 1, 0, false);
        declareFunction(myName, "cycl_inference_decode", "CYCL-INFERENCE-DECODE", 1, 0, false);
        declareFunction(myName, "cycl_provability_status_encode", "CYCL-PROVABILITY-STATUS-ENCODE", 1, 0, false);
        declareFunction(myName, "cycl_provability_status_decode", "CYCL-PROVABILITY-STATUS-DECODE", 1, 0, false);
        declareFunction(myName, "cycl_binding_encode", "CYCL-BINDING-ENCODE", 1, 0, false);
        declareFunction(myName, "cycl_binding_decode", "CYCL-BINDING-DECODE", 1, 0, false);
        declareFunction(myName, "removal_problem_store_problem_count", "REMOVAL-PROBLEM-STORE-PROBLEM-COUNT", 1, 0, false);
        declareFunction(myName, "removal_problem_store_link_count", "REMOVAL-PROBLEM-STORE-LINK-COUNT", 1, 0, false);
        declareFunction(myName, "removal_problem_store_proof_count", "REMOVAL-PROBLEM-STORE-PROOF-COUNT", 1, 0, false);
        declareFunction(myName, "removal_problem_store_inference_count", "REMOVAL-PROBLEM-STORE-INFERENCE-COUNT", 1, 0, false);
        declareFunction(myName, "removal_problem_store_terms_check", "REMOVAL-PROBLEM-STORE-TERMS-CHECK", 2, 0, false);
        declareFunction(myName, "removal_problem_store_terms_arg2_unify_cost", "REMOVAL-PROBLEM-STORE-TERMS-ARG2-UNIFY-COST", 1, 1, false);
        declareFunction(myName, "removal_problem_store_terms", "REMOVAL-PROBLEM-STORE-TERMS", 1, 0, false);
        declareFunction(myName, "removal_problem_store", "REMOVAL-PROBLEM-STORE", 1, 0, false);
        declareFunction(myName, "removal_problem_store_problems_arg2_unify_cost", "REMOVAL-PROBLEM-STORE-PROBLEMS-ARG2-UNIFY-COST", 1, 1, false);
        declareFunction(myName, "removal_problem_store_problem_iterator", "REMOVAL-PROBLEM-STORE-PROBLEM-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_problem_query", "REMOVAL-PROBLEM-QUERY", 1, 0, false);
        declareFunction(myName, "removal_problem_query_terms_check", "REMOVAL-PROBLEM-QUERY-TERMS-CHECK", 2, 0, false);
        declareFunction(myName, "removal_problem_query_terms_arg1_unify_cost", "REMOVAL-PROBLEM-QUERY-TERMS-ARG1-UNIFY-COST", 1, 1, false);
        declareFunction(myName, "removal_problem_store_problems_mentioning_term", "REMOVAL-PROBLEM-STORE-PROBLEMS-MENTIONING-TERM", 2, 0, false);
        declareFunction(myName, "removal_problem_query_terms", "REMOVAL-PROBLEM-QUERY-TERMS", 1, 0, false);
        declareFunction(myName, "removal_problem_provability_status_check", "REMOVAL-PROBLEM-PROVABILITY-STATUS-CHECK", 2, 0, false);
        declareFunction(myName, "removal_problem_provability_status", "REMOVAL-PROBLEM-PROVABILITY-STATUS", 1, 0, false);
        declareFunction(myName, "removal_transformation_proof_rule", "REMOVAL-TRANSFORMATION-PROOF-RULE", 1, 0, false);
        declareFunction(myName, "removal_transformation_proof_has_rule_p", "REMOVAL-TRANSFORMATION-PROOF-HAS-RULE-P", 2, 0, false);
        declareFunction(myName, "removal_transformation_proof_bindings", "REMOVAL-TRANSFORMATION-PROOF-BINDINGS", 1, 0, false);
        declareFunction(myName, "removal_transformation_proof_has_binding_p", "REMOVAL-TRANSFORMATION-PROOF-HAS-BINDING-P", 2, 0, false);
        declareFunction(myName, "removal_inference_answer_bindings", "REMOVAL-INFERENCE-ANSWER-BINDINGS", 1, 0, false);
        declareFunction(myName, "removal_inference_answer_has_binding_p", "REMOVAL-INFERENCE-ANSWER-HAS-BINDING-P", 2, 0, false);
        declareFunction(myName, "removal_inference_binding_var", "REMOVAL-INFERENCE-BINDING-VAR", 1, 0, false);
        declareFunction(myName, "removal_inference_binding_has_var_p", "REMOVAL-INFERENCE-BINDING-HAS-VAR-P", 2, 0, false);
        declareFunction(myName, "removal_inference_binding_value", "REMOVAL-INFERENCE-BINDING-VALUE", 1, 0, false);
        declareFunction(myName, "removal_inference_binding_has_value_p", "REMOVAL-INFERENCE-BINDING-HAS-VALUE-P", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_inference_reflection_file() {
        $problem_count_for_term_divisor$ = deflexical("*PROBLEM-COUNT-FOR-TERM-DIVISOR*", TEN_INTEGER);
        $problem_store_term_to_problem_ratio$ = deflexical("*PROBLEM-STORE-TERM-TO-PROBLEM-RATIO*", TWO_INTEGER);
        $average_problem_query_term_count$ = deflexical("*AVERAGE-PROBLEM-QUERY-TERM-COUNT*", FIVE_INTEGER);
        $default_transformation_proof_rule_check_cost$ = defconstant("*DEFAULT-TRANSFORMATION-PROOF-RULE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_transformation_proof_rule_lookup_cost$ = defconstant("*DEFAULT-TRANSFORMATION-PROOF-RULE-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_transformation_proof_bindings_check_cost$ = defconstant("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_transformation_proof_bindings_lookup_cost$ = defconstant("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_inference_answer_bindings_check_cost$ = defconstant("*DEFAULT-INFERENCE-ANSWER-BINDINGS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_inference_answer_bindings_lookup_cost$ = defconstant("*DEFAULT-INFERENCE-ANSWER-BINDINGS-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_inference_binding_var_check_cost$ = defconstant("*DEFAULT-INFERENCE-BINDING-VAR-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_inference_binding_var_lookup_cost$ = defconstant("*DEFAULT-INFERENCE-BINDING-VAR-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_inference_binding_value_check_cost$ = defconstant("*DEFAULT-INFERENCE-BINDING-VALUE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $default_inference_binding_value_lookup_cost$ = defconstant("*DEFAULT-INFERENCE-BINDING-VALUE-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        $supported_inference_reflection_predicates$ = SubLFiles.deflexical("*SUPPORTED-INFERENCE-REFLECTION-PREDICATES*", $list104);
        return NIL;
    }

    public static SubLObject setup_removal_modules_inference_reflection_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProblemCount);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreProblemCount, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEM_COUNT_LOOKUP, $list34);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreLinkCount);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreLinkCount, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_LINK_COUNT_LOOKUP, $list37);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProofCount);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreProofCount, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROOF_COUNT_LOOKUP, $list40);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreInferenceCount);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreInferenceCount, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_INFERENCE_COUNT_LOOKUP, $list43);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreTerms);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemStoreTerms, ONE_INTEGER);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$cycProblemStoreTerms);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_CHECK_POS, $list47);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_CHECK_NEG, $list49);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_TERMS_ARG2_UNIFY, $list51);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemStoreProblems);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$cycProblemStoreProblems);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEMS_ARG1_UNIFY, $list54);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_STORE_PROBLEMS_ARG2_UNIFY, $list56);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemQuerySentence);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemQuerySentence, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_SENTENCE_ARG2_UNIFY, $list59);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemQueryTerms);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$cycProblemQueryTerms);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$cycProblemQueryTerms);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_CHECK_POS, $list62);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_CHECK_NEG, $list64);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_ARG1_UNIFY, $list69);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_QUERY_TERMS_ARG2_UNIFY, $list71);
        inference_modules.register_solely_specific_removal_module_predicate($$cycProblemProvabilityStatus);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycProblemProvabilityStatus, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_PROVABILITY_STATUS_CHECK_POS, $list74);
        inference_modules.inference_removal_module($REMOVAL_PROBLEM_PROVABILITY_STATUS_ARG2_UNIFY, $list76);
        inference_modules.register_solely_specific_removal_module_predicate($$cycTransformationProofRule);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycTransformationProofRule, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_RULE_CHECK_POS, $list79);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_RULE_ARG2_UNIFY, $list81);
        inference_modules.register_solely_specific_removal_module_predicate($$cycTransformationProofBindings);
        preference_modules.doomed_unless_arg_bindable($POS, $$cycTransformationProofBindings, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_BINDINGS_CHECK_POS, $list84);
        inference_modules.inference_removal_module($REMOVAL_TRANSFORMATION_PROOF_BINDINGS_ARG2_UNIFY, $list86);
        inference_modules.register_solely_specific_removal_module_predicate($$inferenceAnswerBindings);
        preference_modules.doomed_unless_arg_bindable($POS, $$inferenceAnswerBindings, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_CHECK_POS, $list91);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_ANSWER_BINDINGS_ARG2_UNIFY, $list93);
        inference_modules.register_solely_specific_removal_module_predicate($$inferenceBindingVar);
        preference_modules.doomed_unless_arg_bindable($POS, $$inferenceBindingVar, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VAR_CHECK_POS, $list96);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VAR_ARG2_UNIFY, $list98);
        inference_modules.register_solely_specific_removal_module_predicate($$inferenceBindingValue);
        preference_modules.doomed_unless_arg_bindable($POS, $$inferenceBindingValue, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VALUE_CHECK_POS, $list101);
        inference_modules.inference_removal_module($REMOVAL_INFERENCE_BINDING_VALUE_ARG2_UNIFY, $list103);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_inference_reflection_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_inference_reflection_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_inference_reflection_file();
    }

    static {
        me = new removal_modules_inference_reflection();
        $problem_count_for_term_divisor$ = null;
        $problem_store_term_to_problem_ratio$ = null;
        $average_problem_query_term_count$ = null;
        $default_transformation_proof_rule_check_cost$ = null;
        $default_transformation_proof_rule_lookup_cost$ = null;
        $default_transformation_proof_bindings_check_cost$ = null;
        $default_transformation_proof_bindings_lookup_cost$ = null;
        $default_inference_answer_bindings_check_cost$ = null;
        $default_inference_answer_bindings_lookup_cost$ = null;
        $default_inference_binding_var_check_cost$ = null;
        $default_inference_binding_var_lookup_cost$ = null;
        $default_inference_binding_value_check_cost$ = null;
        $default_inference_binding_value_lookup_cost$ = null;
        $supported_inference_reflection_predicates$ = null;
        $sym0$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym1$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
        $SKIP = makeKeyword("SKIP");
        $sym3$_ = makeSymbol("<");
        $sym4$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");
        $list5 = list(makeConstSym(("CycProblemStoreFn")), list(makeKeyword("BIND"), makeSymbol("STORE-ID")));
        $sym6$STORE_ID = makeSymbol("STORE-ID");
        $$CycProblemStoreFn = makeConstSym(("CycProblemStoreFn"));
        $list8 = list(makeConstSym(("CycProblemFn")), list(makeKeyword("BIND"), makeSymbol("PROBLEM-ID")), list(makeConstSym(("CycProblemStoreFn")), list(makeKeyword("BIND"), makeSymbol("STORE-ID"))));
        $sym9$PROBLEM_ID = makeSymbol("PROBLEM-ID");
        $$CycProblemFn = makeConstSym(("CycProblemFn"));
        $list11 = list(makeConstSym(("CycProblemLinkFn")), list(makeKeyword("BIND"), makeSymbol("LINK-ID")), list(makeConstSym(("CycProblemStoreFn")), list(makeKeyword("BIND"), makeSymbol("STORE-ID"))));
        $sym12$LINK_ID = makeSymbol("LINK-ID");
        $$CycProblemLinkFn = makeConstSym(("CycProblemLinkFn"));
        $list14 = list(makeConstSym(("CycProofFn")), list(makeKeyword("BIND"), makeSymbol("PROOF-ID")), list(makeConstSym(("CycProblemStoreFn")), list(makeKeyword("BIND"), makeSymbol("STORE-ID"))));
        $sym15$PROOF_ID = makeSymbol("PROOF-ID");
        $$CycProofFn = makeConstSym(("CycProofFn"));
        $list17 = list(makeConstSym(("CycInferenceFn")), list(makeKeyword("BIND"), makeSymbol("INFERENCE-ID")), list(makeConstSym(("CycProblemStoreFn")), list(makeKeyword("BIND"), makeSymbol("STORE-ID"))));
        $sym18$INFERENCE_ID = makeSymbol("INFERENCE-ID");
        $$CycInferenceFn = makeConstSym(("CycInferenceFn"));
        $$Good_ProblemProvabilityStatus = makeConstSym(("Good-ProblemProvabilityStatus"));
        $GOOD = makeKeyword("GOOD");
        $$Neutral_ProblemProvabilityStatus = makeConstSym(("Neutral-ProblemProvabilityStatus"));
        $NEUTRAL = makeKeyword("NEUTRAL");
        $$NoGood_ProblemProvabilityStatus = makeConstSym(("NoGood-ProblemProvabilityStatus"));
        $NO_GOOD = makeKeyword("NO-GOOD");
        $list26 = list(makeConstSym(("ELInferenceBindingFn")), list(makeKeyword("BIND"), makeSymbol("EL-VAR")), list(makeKeyword("BIND"), makeSymbol("VALUE")));
        $sym27$VALUE = makeSymbol("VALUE");
        $sym28$EL_VAR = makeSymbol("EL-VAR");
        $list29 = cons(makeSymbol("EL-VAR"), makeSymbol("VALUE"));
        $$ELInferenceBindingFn = makeConstSym(("ELInferenceBindingFn"));
        $$cycProblemStoreProblemCount = makeConstSym(("cycProblemStoreProblemCount"));
        $POS = makeKeyword("POS");
        $REMOVAL_PROBLEM_STORE_PROBLEM_COUNT_LOOKUP = makeKeyword("REMOVAL-PROBLEM-STORE-PROBLEM-COUNT-LOOKUP");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemStoreProblemCount")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemStoreProblemCount")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemStoreProblemCount")), list(makeKeyword("BIND"), makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEM-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("cycProblemStoreProblemCount")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });
        $$cycProblemStoreLinkCount = makeConstSym(("cycProblemStoreLinkCount"));
        $REMOVAL_PROBLEM_STORE_LINK_COUNT_LOOKUP = makeKeyword("REMOVAL-PROBLEM-STORE-LINK-COUNT-LOOKUP");
        $list37 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemStoreLinkCount")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemStoreLinkCount")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemStoreLinkCount")), list(makeKeyword("BIND"), makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-STORE-LINK-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("cycProblemStoreLinkCount")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });
        $$cycProblemStoreProofCount = makeConstSym(("cycProblemStoreProofCount"));
        $REMOVAL_PROBLEM_STORE_PROOF_COUNT_LOOKUP = makeKeyword("REMOVAL-PROBLEM-STORE-PROOF-COUNT-LOOKUP");
        $list40 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemStoreProofCount")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemStoreProofCount")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemStoreProofCount")), list(makeKeyword("BIND"), makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-STORE-PROOF-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("cycProblemStoreProofCount")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });
        $$cycProblemStoreInferenceCount = makeConstSym(("cycProblemStoreInferenceCount"));
        $REMOVAL_PROBLEM_STORE_INFERENCE_COUNT_LOOKUP = makeKeyword("REMOVAL-PROBLEM-STORE-INFERENCE-COUNT-LOOKUP");
        $list43 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemStoreInferenceCount")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemStoreInferenceCount")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemStoreInferenceCount")), list(makeKeyword("BIND"), makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-STORE-INFERENCE-COUNT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("cycProblemStoreInferenceCount")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });
        $$cycProblemStoreTerms = makeConstSym(("cycProblemStoreTerms"));
        $NEG = makeKeyword("NEG");
        $REMOVAL_PROBLEM_STORE_TERMS_CHECK_POS = makeKeyword("REMOVAL-PROBLEM-STORE-TERMS-CHECK-POS");
        $list47 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemStoreTerms")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemStoreTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                        makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemStoreTerms")), list(makeKeyword("BIND"), makeSymbol("CYCL-STORE")), list(makeKeyword("BIND"), makeSymbol("TERM"))),
                                list(list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))),
                        makeKeyword("INPUT-ENCODE-PATTERN"),
                        list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-STORE"), makeSymbol("TERM")), list(list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))),
                        makeKeyword("OUTPUT-CHECK-PATTERN"),
                        list(makeKeyword("TUPLE"), list(makeSymbol("STORE"), makeSymbol("TERM")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-STORE-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))) });
        $REMOVAL_PROBLEM_STORE_TERMS_CHECK_NEG = makeKeyword("REMOVAL-PROBLEM-STORE-TERMS-CHECK-NEG");
        $list49 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemStoreTerms")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemStoreTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                        makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemStoreTerms")), list(makeKeyword("BIND"), makeSymbol("CYCL-STORE")), list(makeKeyword("BIND"), makeSymbol("TERM"))),
                                list(list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))),
                        makeKeyword("INPUT-ENCODE-PATTERN"),
                        list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-STORE"), makeSymbol("TERM")), list(list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))),
                        makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("STORE"), makeSymbol("TERM")),
                                list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-STORE-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM"))))) });
        $REMOVAL_PROBLEM_STORE_TERMS_ARG2_UNIFY = makeKeyword("REMOVAL-PROBLEM-STORE-TERMS-ARG2-UNIFY");
        $list51 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemStoreTerms")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemStoreTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST"), makeSymbol("REMOVAL-PROBLEM-STORE-TERMS-ARG2-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemStoreTerms")), list(makeKeyword("BIND"), makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-STORE-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("cycProblemStoreTerms")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });
        $$cycProblemStoreProblems = makeConstSym(("cycProblemStoreProblems"));
        $REMOVAL_PROBLEM_STORE_PROBLEMS_ARG1_UNIFY = makeKeyword("REMOVAL-PROBLEM-STORE-PROBLEMS-ARG1-UNIFY");
        $list54 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemStoreProblems")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemStoreProblems")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemStoreProblems")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("CYCL-PROBLEM"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-STORE"), makeKeyword("INPUT"))),
                makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-STORE-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("cycProblemStoreProblems")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))) });
        $REMOVAL_PROBLEM_STORE_PROBLEMS_ARG2_UNIFY = makeKeyword("REMOVAL-PROBLEM-STORE-PROBLEMS-ARG2-UNIFY");
        $list56 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemStoreProblems")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemStoreProblems")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST"), makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEMS-ARG2-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemStoreProblems")), list(makeKeyword("BIND"), makeSymbol("CYCL-STORE")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEM-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("cycProblemStoreProblems")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), makeKeyword("INPUT")) });
        $$cycProblemQuerySentence = makeConstSym(("cycProblemQuerySentence"));
        $REMOVAL_PROBLEM_QUERY_SENTENCE_ARG2_UNIFY = makeKeyword("REMOVAL-PROBLEM-QUERY-SENTENCE-ARG2-UNIFY");
        $list59 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemQuerySentence")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemQuerySentence")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemQuerySentence")), list(makeKeyword("BIND"), makeSymbol("CYCL-PROBLEM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-QUERY"), makeKeyword("INPUT"))),
                makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("PROBLEM-QUERY-EL-FORMULA"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("cycProblemQuerySentence")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), makeKeyword("INPUT")) });
        $$cycProblemQueryTerms = makeConstSym(("cycProblemQueryTerms"));
        $REMOVAL_PROBLEM_QUERY_TERMS_CHECK_POS = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-CHECK-POS");
        $list62 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemQueryTerms")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemQueryTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), ConsesLow.list(makeConstSym(("cycProblemQueryTerms")), list(makeKeyword("BIND"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("BIND"), makeSymbol("TERM"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROBLEM"), makeSymbol("TERM")), list(list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("PROBLEM"), makeSymbol("TERM")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))) });
        $REMOVAL_PROBLEM_QUERY_TERMS_CHECK_NEG = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-CHECK-NEG");
        $list64 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemQueryTerms")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemQueryTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), list(makeSymbol("INVERT-REMOVAL-CHECK-COST"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemQueryTerms")), list(makeKeyword("BIND"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("BIND"), makeSymbol("TERM"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROBLEM"), makeSymbol("TERM")), list(list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("PROBLEM"), makeSymbol("TERM")),
                        list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("TERM"))))) });
        $list65 = list(makeConstSym(("cycProblemQueryTerms")), list(makeConstSym(("CycProblemFn")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("CYCL-STORE"))), list(makeKeyword("BIND"), makeSymbol("TERM")));
        $sym66$TERM = makeSymbol("TERM");
        $sym67$CYCL_STORE = makeSymbol("CYCL-STORE");
        $REMOVAL_PROBLEM_QUERY_TERMS_ARG1_UNIFY = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-ARG1-UNIFY");
        $list69 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemQueryTerms")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("cycProblemQueryTerms")), list(makeConstSym(("CycProblemFn")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS-ARG1-UNIFY-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemQueryTerms")), list(makeConstSym(("CycProblemFn")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("CYCL-STORE"))), list(makeKeyword("BIND"), makeSymbol("TERM"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-STORE"), makeSymbol("TERM")), list(list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-STORE-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STORE"))), list(makeKeyword("VALUE"), makeSymbol("TERM")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("STORE"), makeSymbol("TERM")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-STORE-PROBLEMS-MENTIONING-TERM"), list(makeKeyword("VALUE"), makeSymbol("STORE")), list(makeKeyword("VALUE"), makeSymbol("TERM")))),
                makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("cycProblemQueryTerms")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TERM"))) });
        $REMOVAL_PROBLEM_QUERY_TERMS_ARG2_UNIFY = makeKeyword("REMOVAL-PROBLEM-QUERY-TERMS-ARG2-UNIFY");
        $list71 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemQueryTerms")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemQueryTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-PROBLEM-QUERY-TERM-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemQueryTerms")), list(makeKeyword("BIND"), makeSymbol("CYCL-PROBLEM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-QUERY-TERMS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("cycProblemQueryTerms")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), makeKeyword("INPUT")) });
        $$cycProblemProvabilityStatus = makeConstSym(("cycProblemProvabilityStatus"));
        $REMOVAL_PROBLEM_PROVABILITY_STATUS_CHECK_POS = makeKeyword("REMOVAL-PROBLEM-PROVABILITY-STATUS-CHECK-POS");
        $list74 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemProvabilityStatus")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemProvabilityStatus")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemProvabilityStatus")), list(makeKeyword("BIND"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("BIND"), makeSymbol("CYCL-STATUS"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("CYCL-STATUS")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROBLEM"), makeSymbol("CYCL-STATUS")),
                        list(list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), list(makeKeyword("CALL"), makeSymbol("CYCL-PROVABILITY-STATUS-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-STATUS"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("PROBLEM"), makeSymbol("STATUS")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-PROVABILITY-STATUS-CHECK"), list(makeKeyword("VALUE"), makeSymbol("PROBLEM")), list(makeKeyword("VALUE"), makeSymbol("STATUS")))) });
        $REMOVAL_PROBLEM_PROVABILITY_STATUS_ARG2_UNIFY = makeKeyword("REMOVAL-PROBLEM-PROVABILITY-STATUS-ARG2-UNIFY");
        $list76 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycProblemProvabilityStatus")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycProblemProvabilityStatus")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycProblemProvabilityStatus")), list(makeKeyword("BIND"), makeSymbol("CYCL-PROBLEM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROBLEM-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PROBLEM-PROVABILITY-STATUS"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROVABILITY-STATUS-DECODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("cycProblemProvabilityStatus")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROBLEM")), makeKeyword("INPUT")) });
        $$cycTransformationProofRule = makeConstSym(("cycTransformationProofRule"));
        $REMOVAL_TRANSFORMATION_PROOF_RULE_CHECK_POS = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-RULE-CHECK-POS");
        $list79 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycTransformationProofRule")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycTransformationProofRule")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-RULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycTransformationProofRule")), list(makeKeyword("BIND"), makeSymbol("CYCL-PROOF")), list(makeKeyword("BIND"), makeSymbol("CYCL-RULE"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-RULE")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-RULE")), list(list(makeKeyword("CALL"), makeSymbol("CYCL-PROOF-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-RULE")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-RULE")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TRANSFORMATION-PROOF-HAS-RULE-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-RULE")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofRule <fully-bound> <fully-bound>)") });
        $REMOVAL_TRANSFORMATION_PROOF_RULE_ARG2_UNIFY = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-RULE-ARG2-UNIFY");
        $list81 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycTransformationProofRule")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cycTransformationProofRule")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-RULE-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycTransformationProofRule")), list(makeKeyword("BIND"), makeSymbol("CYCL-PROOF")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-PROOF-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TRANSFORMATION-PROOF-RULE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("cycTransformationProofRule")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofRule <fully-bound> <not-fully-bound>)") });
        $$cycTransformationProofBindings = makeConstSym(("cycTransformationProofBindings"));
        $REMOVAL_TRANSFORMATION_PROOF_BINDINGS_CHECK_POS = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-BINDINGS-CHECK-POS");
        $list84 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycTransformationProofBindings")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("cycTransformationProofBindings")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycTransformationProofBindings")), list(makeKeyword("BIND"), makeSymbol("CYCL-PROOF")), list(makeKeyword("BIND"), makeSymbol("CYCL-BINDING"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-BINDING")),
                        list(list(makeKeyword("CALL"), makeSymbol("CYCL-PROOF-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))), list(makeKeyword("CALL"), makeSymbol("CYCL-BINDING-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-PROOF"), makeSymbol("CYCL-BINDING")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TRANSFORMATION-PROOF-HAS-BINDING-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$cycTransformationProofBindings <fully-bound> <fully-bound>)") });
        $REMOVAL_TRANSFORMATION_PROOF_BINDINGS_ARG2_UNIFY = makeKeyword("REMOVAL-TRANSFORMATION-PROOF-BINDINGS-ARG2-UNIFY");
        $list86 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cycTransformationProofBindings")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("cycTransformationProofBindings")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("cycTransformationProofBindings")), list(makeKeyword("BIND"), makeSymbol("CYCL-PROOF")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("CYCL-PROOF-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TRANSFORMATION-PROOF-BINDINGS"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("cycTransformationProofBindings")), list(makeKeyword("VALUE"), makeSymbol("CYCL-PROOF")), list(makeKeyword("CALL"), makeSymbol("CYCL-BINDING-DECODE"), makeKeyword("INPUT"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$cycTransformationProofBindings <fully-bound> <not-fully-bound>)") });
        $$inferenceAnswerBindings = makeConstSym(("inferenceAnswerBindings"));
        $$CycInferenceAnswerFn = makeConstSym(("CycInferenceAnswerFn"));
        $$TheEmptySet = makeConstSym(("TheEmptySet"));
        $REMOVAL_INFERENCE_ANSWER_BINDINGS_CHECK_POS = makeKeyword("REMOVAL-INFERENCE-ANSWER-BINDINGS-CHECK-POS");
        $list91 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("inferenceAnswerBindings")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("inferenceAnswerBindings")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-ANSWER-BINDINGS-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("inferenceAnswerBindings")), list(makeKeyword("BIND"), makeSymbol("CYCL-INFERENCE-ANSWER")), list(makeKeyword("BIND"), makeSymbol("CYCL-BINDING"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-INFERENCE-ANSWER"), makeSymbol("CYCL-BINDING")), list(list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-INFERENCE-ANSWER"), makeSymbol("CYCL-BINDING")),
                        list(makeKeyword("CALL"), makeSymbol("REMOVAL-INFERENCE-ANSWER-HAS-BINDING-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindings <fully-bound> <fully-bound>)") });
        $REMOVAL_INFERENCE_ANSWER_BINDINGS_ARG2_UNIFY = makeKeyword("REMOVAL-INFERENCE-ANSWER-BINDINGS-ARG2-UNIFY");
        $list93 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("inferenceAnswerBindings")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("inferenceAnswerBindings")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-ANSWER-BINDINGS-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("inferenceAnswerBindings")), list(makeKeyword("BIND"), makeSymbol("CYCL-INFERENCE-ANSWER")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("EL-SET-ITEMS"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-INFERENCE-ANSWER-BINDINGS"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("inferenceAnswerBindings")), list(makeKeyword("VALUE"), makeSymbol("CYCL-INFERENCE-ANSWER")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceAnswerBindings <fully-bound> <not-fully-bound>)") });
        $$inferenceBindingVar = makeConstSym(("inferenceBindingVar"));
        $REMOVAL_INFERENCE_BINDING_VAR_CHECK_POS = makeKeyword("REMOVAL-INFERENCE-BINDING-VAR-CHECK-POS");
        $list96 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("inferenceBindingVar")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("inferenceBindingVar")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VAR-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), ConsesLow.list(makeConstSym(("inferenceBindingVar")), list(makeKeyword("BIND"), makeSymbol("CYCL-BINDING")), list(makeKeyword("BIND"), makeSymbol("CYCL-VAR"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list(list(makeKeyword("CALL"), makeSymbol("CYCL-BINDING-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-INFERENCE-BINDING-HAS-VAR-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingVar <fully-bound> <fully-bound>)") });
        $REMOVAL_INFERENCE_BINDING_VAR_ARG2_UNIFY = makeKeyword("REMOVAL-INFERENCE-BINDING-VAR-ARG2-UNIFY");
        $list98 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("inferenceBindingVar")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("inferenceBindingVar")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VAR-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("inferenceBindingVar")), list(makeKeyword("BIND"), makeSymbol("CYCL-BINDING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-BINDING-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-INFERENCE-BINDING-VAR"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("inferenceBindingVar")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingVar <fully-bound> <not-fully-bound>)") });
        $$inferenceBindingValue = makeConstSym(("inferenceBindingValue"));
        $REMOVAL_INFERENCE_BINDING_VALUE_CHECK_POS = makeKeyword("REMOVAL-INFERENCE-BINDING-VALUE-CHECK-POS");
        $list101 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("inferenceBindingValue")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("inferenceBindingValue")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VALUE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), ConsesLow.list(makeConstSym(("inferenceBindingValue")), list(makeKeyword("BIND"), makeSymbol("CYCL-BINDING")), list(makeKeyword("BIND"), makeSymbol("CYCL-VAR"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list(list(makeKeyword("CALL"), makeSymbol("CYCL-BINDING-ENCODE"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("CYCL-BINDING"), makeSymbol("CYCL-VAR")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-INFERENCE-BINDING-HAS-VALUE-P"), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-VAR")))),
                makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingValue <fully-bound> <fully-bound>)") });
        $REMOVAL_INFERENCE_BINDING_VALUE_ARG2_UNIFY = makeKeyword("REMOVAL-INFERENCE-BINDING-VALUE-ARG2-UNIFY");
        $list103 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("inferenceBindingValue")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("inferenceBindingValue")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INFERENCE-BINDING-VALUE-LOOKUP-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("inferenceBindingValue")), list(makeKeyword("BIND"), makeSymbol("CYCL-BINDING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("CYCL-BINDING-ENCODE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-INFERENCE-BINDING-VALUE"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("inferenceBindingValue")), list(makeKeyword("VALUE"), makeSymbol("CYCL-BINDING")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$inferenceBindingValue <fully-bound> <not-fully-bound>)") });
        $list104 = list(new SubLObject[] { makeConstSym(("cycProblemStoreProblemCount")), makeConstSym(("cycProblemStoreLinkCount")), makeConstSym(("cycProblemStoreProofCount")), makeConstSym(("cycProblemStoreInferenceCount")), makeConstSym(("cycProblemStoreTerms")),
                makeConstSym(("cycProblemStoreProblems")), makeConstSym(("cycProblemQuerySentence")), makeConstSym(("cycProblemQueryTerms")), makeConstSym(("cycProblemProvabilityStatus")) });
    }
}
/*
 *
 * Total time: 430 ms
 *
 */