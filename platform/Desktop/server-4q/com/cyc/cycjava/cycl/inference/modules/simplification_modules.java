package com.cyc.cycjava.cycl.inference.modules;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_answer;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class simplification_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.simplification_modules";
    public static final String myFingerPrint = "6e1be3dfc87d405ed2301324c0f28187698d34e9549fd4fa8a8920966ab8fabf";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 979L)
    private static SubLSymbol $simplification_module_names$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 1473L)
    private static SubLSymbol $simplification_modules_enabledP$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$REMOVAL_SIMPLIFICATION_CONJUNCTION_DUPLICATE_LITERALS_VIA_FUNCTIO;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$SINGLETON_;
    private static final SubLSymbol $sym4$HL_VARIABLE_P;
    private static final SubLSymbol $sym5$SIMPLIFICATION_DUPLICATE_LITERALS_VIA_FUNCTIONALITY_POS_LITS_APPL;
    private static final SubLSymbol $sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES;
    private static final SubLObject $const7$interArgDependentCardinality;
    private static final SubLList $list8;
    private static final SubLInteger $int9$100;
    private static final SubLSymbol $sym10$ANY_SPEC__MEMOIZED;
    private static final SubLInteger $int11$1024;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLObject $const14$Thing;
    private static final SubLSymbol $sym15$CAR;
    private static final SubLString $str16$_;
    private static final SubLSymbol $sym17$SENTENCE_ARG0;
    private static final SubLObject $const18$equalSymbols;
    private static final SubLList $list19;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 1305L)
    public static SubLObject simplification_module_p(final SubLObject hl_module) {
        return (SubLObject)SubLObjectFactory.makeBoolean(simplification_modules.NIL != inference_modules.hl_module_p(hl_module) && simplification_modules.NIL != list_utilities.member_eqP(inference_modules.hl_module_name(hl_module), simplification_modules.$simplification_module_names$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 2548L)
    public static SubLObject simplification_duplicate_literals_via_functionality_pos_lits_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (simplification_modules.NIL != simplification_modules.$simplification_modules_enabledP$.getDynamicValue(thread)) {
            final SubLObject problem = inference_worker.currently_active_problem();
            if (simplification_modules.NIL != problem_is_a_topological_rootP(problem)) {
                final SubLObject minimal_problem_query = removal_modules_conjunctive_pruning.supporting_residual_conjunction_problem_minimal_problem_query(problem, (SubLObject)simplification_modules.T);
                final SubLObject equivalence_classes = simplification_duplicate_literals_via_functionality_pos_lits_equivalence_classes(inference_datastructures_problem.problem_query_sole_clause(minimal_problem_query));
                final SubLObject non_singleton_classes = list_utilities.find_all_if_not((SubLObject)simplification_modules.$sym3$SINGLETON_, equivalence_classes, (SubLObject)simplification_modules.UNPROVIDED);
                if (simplification_modules.NIL != non_singleton_classes) {
                    SubLObject cdolist_list_var = non_singleton_classes;
                    SubLObject non_singleton_class = (SubLObject)simplification_modules.NIL;
                    non_singleton_class = cdolist_list_var.first();
                    while (simplification_modules.NIL != cdolist_list_var) {
                        if (simplification_modules.ONE_INTEGER.numL(Sequences.length(list_utilities.find_all_if_not((SubLObject)simplification_modules.$sym4$HL_VARIABLE_P, non_singleton_class, (SubLObject)simplification_modules.UNPROVIDED)))) {
                            return (SubLObject)simplification_modules.NIL;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        non_singleton_class = cdolist_list_var.first();
                    }
                    return (SubLObject)ConsesLow.list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                }
            }
        }
        return (SubLObject)simplification_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 3585L)
    public static SubLObject problem_is_a_topological_rootP(final SubLObject problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)simplification_modules.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); simplification_modules.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (simplification_modules.NIL != set_contents.do_set_contents_element_validP(state, link) && (simplification_modules.NIL != inference_worker_residual_transformation.residual_transformation_link_p(link) || simplification_modules.NIL != inference_worker_answer.answer_link_p(link) || (simplification_modules.NIL != inference_worker_split.split_link_p(link) && simplification_modules.NIL != problem_is_a_topological_rootP(inference_datastructures_problem_link.problem_link_supported_problem(link))))) {
                return (SubLObject)simplification_modules.T;
            }
        }
        return (SubLObject)simplification_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 3944L)
    public static SubLObject simplification_duplicate_literals_via_functionality_expand(final SubLObject contextualized_dnf_clause) {
        final SubLObject v_bindings = compute_simplification_via_functionality_variable_map(contextualized_dnf_clause);
        if (simplification_modules.NIL != v_bindings) {
            inference_worker_removal.conjunctive_removal_callback(v_bindings, (SubLObject)simplification_modules.NIL);
        }
        return (SubLObject)simplification_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 4340L)
    public static SubLObject problem_query_simplify_via_functionality(final SubLObject problem_query) {
        final SubLObject v_bindings = problem_query_compute_simplification_via_functionality_variable_map(problem_query);
        final SubLObject simplified_query = bindings.apply_bindings(v_bindings, problem_query);
        return simplified_query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 4609L)
    public static SubLObject problem_query_compute_simplification_via_functionality_variable_map(final SubLObject problem_query) {
        return compute_simplification_via_functionality_variable_map(inference_datastructures_problem.problem_query_sole_clause(problem_query));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 4817L)
    public static SubLObject compute_simplification_via_functionality_variable_map(final SubLObject contextualized_dnf_clause) {
        SubLObject v_bindings = (SubLObject)simplification_modules.NIL;
        SubLObject cdolist_list_var = simplification_duplicate_literals_via_functionality_pos_lits_equivalence_classes(contextualized_dnf_clause);
        SubLObject class_list = (SubLObject)simplification_modules.NIL;
        class_list = cdolist_list_var.first();
        while (simplification_modules.NIL != cdolist_list_var) {
            if (simplification_modules.NIL == list_utilities.singletonP(class_list)) {
                final SubLObject chosen_members = list_utilities.find_all_if_not((SubLObject)simplification_modules.$sym4$HL_VARIABLE_P, class_list, (SubLObject)simplification_modules.UNPROVIDED);
                SubLObject chosen_member = (SubLObject)simplification_modules.NIL;
                if (simplification_modules.NIL == chosen_members) {
                    chosen_member = class_list.first();
                }
                else if (simplification_modules.NIL != list_utilities.singletonP(chosen_members)) {
                    chosen_member = chosen_members.first();
                }
                SubLObject cdolist_list_var_$1 = list_utilities.find_all_if((SubLObject)simplification_modules.$sym4$HL_VARIABLE_P, class_list, (SubLObject)simplification_modules.UNPROVIDED);
                SubLObject variable = (SubLObject)simplification_modules.NIL;
                variable = cdolist_list_var_$1.first();
                while (simplification_modules.NIL != cdolist_list_var_$1) {
                    if (!variable.eql(chosen_member)) {
                        v_bindings = bindings.add_variable_binding(variable, chosen_member, v_bindings);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    variable = cdolist_list_var_$1.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            class_list = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 5889L)
    public static SubLObject asent_pred_inter_arg_dependent_cardinalities_internal(final SubLObject pred) {
        SubLObject result = (SubLObject)simplification_modules.NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples_in_any_mt(pred, simplification_modules.$const7$interArgDependentCardinality, (SubLObject)simplification_modules.ONE_INTEGER, (SubLObject)simplification_modules.$list8, (SubLObject)simplification_modules.UNPROVIDED);
        SubLObject tuple = (SubLObject)simplification_modules.NIL;
        tuple = cdolist_list_var.first();
        while (simplification_modules.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(tuple, result);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 5889L)
    public static SubLObject asent_pred_inter_arg_dependent_cardinalities(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)simplification_modules.NIL;
        if (simplification_modules.NIL == v_memoization_state) {
            return asent_pred_inter_arg_dependent_cardinalities_internal(pred);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)simplification_modules.$sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES, (SubLObject)simplification_modules.UNPROVIDED);
        if (simplification_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)simplification_modules.$sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES, (SubLObject)simplification_modules.ONE_INTEGER, (SubLObject)simplification_modules.$int9$100, (SubLObject)simplification_modules.EQL, (SubLObject)simplification_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)simplification_modules.$sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(asent_pred_inter_arg_dependent_cardinalities_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)simplification_modules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 6196L)
    public static SubLObject any_specP_memoized_internal(final SubLObject genl, final SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == simplification_modules.UNPROVIDED) {
            mt = (SubLObject)simplification_modules.NIL;
        }
        if (tv == simplification_modules.UNPROVIDED) {
            tv = (SubLObject)simplification_modules.NIL;
        }
        return genls.any_specP(genl, kb_utilities.sort_terms(specs, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED), mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 6196L)
    public static SubLObject any_specP_memoized(final SubLObject genl, final SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == simplification_modules.UNPROVIDED) {
            mt = (SubLObject)simplification_modules.NIL;
        }
        if (tv == simplification_modules.UNPROVIDED) {
            tv = (SubLObject)simplification_modules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)simplification_modules.NIL;
        if (simplification_modules.NIL == v_memoization_state) {
            return any_specP_memoized_internal(genl, specs, mt, tv);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)simplification_modules.$sym10$ANY_SPEC__MEMOIZED, (SubLObject)simplification_modules.UNPROVIDED);
        if (simplification_modules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)simplification_modules.$sym10$ANY_SPEC__MEMOIZED, (SubLObject)simplification_modules.FOUR_INTEGER, (SubLObject)simplification_modules.$int11$1024, (SubLObject)simplification_modules.EQUAL, (SubLObject)simplification_modules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)simplification_modules.$sym10$ANY_SPEC__MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(genl, specs, mt, tv);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)simplification_modules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)simplification_modules.NIL;
            collision = cdolist_list_var.first();
            while (simplification_modules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (genl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (specs.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (simplification_modules.NIL != cached_args && simplification_modules.NIL == cached_args.rest() && tv.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(any_specP_memoized_internal(genl, specs, mt, tv)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(genl, specs, mt, tv));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 6363L)
    public static SubLObject simplification_duplicate_literals_via_functionality_pos_lits_equivalence_classes(final SubLObject contextualized_dnf_clause) {
        SubLObject possible_match_asents = (SubLObject)simplification_modules.NIL;
        SubLObject result = (SubLObject)simplification_modules.NIL;
        final SubLObject variable_constraint_tuples = removal_modules_conjunctive_pruning.dnf_variable_constraint_tuples(contextualized_dnf_clause);
        SubLObject num = (SubLObject)simplification_modules.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = (SubLObject)simplification_modules.NIL;
        lit = cdolist_list_var.first();
        while (simplification_modules.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = lit;
            SubLObject mt = (SubLObject)simplification_modules.NIL;
            SubLObject asent = (SubLObject)simplification_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simplification_modules.$list12);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)simplification_modules.$list12);
            asent = current.first();
            current = current.rest();
            if (simplification_modules.NIL == current) {
                final SubLObject asent_pred = cycl_utilities.sentence_arg0(asent);
                if (simplification_modules.NIL != forts.fort_p(asent_pred)) {
                    final SubLObject asent_pred_inter_arg_dependent_cardinalities = asent_pred_inter_arg_dependent_cardinalities(asent_pred);
                    if (simplification_modules.NIL != asent_pred_inter_arg_dependent_cardinalities) {
                        SubLObject cdolist_list_var_$2 = asent_pred_inter_arg_dependent_cardinalities;
                        SubLObject asent_pred_inter_arg_dependent_cardinality = (SubLObject)simplification_modules.NIL;
                        asent_pred_inter_arg_dependent_cardinality = cdolist_list_var_$2.first();
                        while (simplification_modules.NIL != cdolist_list_var_$2) {
                            SubLObject current_$4;
                            final SubLObject datum_$3 = current_$4 = asent_pred_inter_arg_dependent_cardinality;
                            SubLObject m = (SubLObject)simplification_modules.NIL;
                            SubLObject col1 = (SubLObject)simplification_modules.NIL;
                            SubLObject n = (SubLObject)simplification_modules.NIL;
                            SubLObject col2 = (SubLObject)simplification_modules.NIL;
                            SubLObject card = (SubLObject)simplification_modules.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)simplification_modules.$list13);
                            m = current_$4.first();
                            current_$4 = current_$4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)simplification_modules.$list13);
                            col1 = current_$4.first();
                            current_$4 = current_$4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)simplification_modules.$list13);
                            n = current_$4.first();
                            current_$4 = current_$4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)simplification_modules.$list13);
                            col2 = current_$4.first();
                            current_$4 = current_$4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)simplification_modules.$list13);
                            card = current_$4.first();
                            current_$4 = current_$4.rest();
                            if (simplification_modules.NIL == current_$4) {
                                if (card.eql((SubLObject)simplification_modules.ONE_INTEGER) && col1.eql(simplification_modules.$const14$Thing)) {
                                    final SubLObject arg_from = cycl_utilities.atomic_sentence_arg(asent, m, (SubLObject)simplification_modules.UNPROVIDED);
                                    final SubLObject arg_to = cycl_utilities.atomic_sentence_arg(asent, n, (SubLObject)simplification_modules.UNPROVIDED);
                                    if (simplification_modules.NIL != ((simplification_modules.NIL != forts.fort_p(arg_to)) ? genls.genl_in_any_mtP(arg_to, col2) : any_specP_memoized(col2, conses_high.third(Sequences.find(arg_to, variable_constraint_tuples, (SubLObject)simplification_modules.EQL, (SubLObject)simplification_modules.$sym15$CAR, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED)), (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED))) {
                                        final SubLObject fake_pred = string_utilities.pretty_keyword_from_string(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(asent_pred), new SubLObject[] { simplification_modules.$str16$_, format_nil.format_nil_a_no_copy(m), simplification_modules.$str16$_, format_nil.format_nil_a_no_copy(n), simplification_modules.$str16$_, format_nil.format_nil_a_no_copy(col2) }));
                                        possible_match_asents = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(fake_pred, arg_from, arg_to), possible_match_asents);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$3, (SubLObject)simplification_modules.$list13);
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            asent_pred_inter_arg_dependent_cardinality = cdolist_list_var_$2.first();
                        }
                    }
                    if (simplification_modules.NIL != cycl_utilities.strictly_functional_in_some_argP(asent_pred)) {
                        possible_match_asents = (SubLObject)ConsesLow.cons(asent, possible_match_asents);
                        if (simplification_modules.NIL != kb_accessors.symmetric_predicateP(asent_pred)) {
                            final SubLObject item_var = el_utilities.make_binary_formula(asent_pred, cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)simplification_modules.UNPROVIDED), cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)simplification_modules.UNPROVIDED));
                            if (simplification_modules.NIL == conses_high.member(item_var, possible_match_asents, Symbols.symbol_function((SubLObject)simplification_modules.EQL), Symbols.symbol_function((SubLObject)simplification_modules.IDENTITY))) {
                                possible_match_asents = (SubLObject)ConsesLow.cons(item_var, possible_match_asents);
                            }
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)simplification_modules.$list12);
            }
            num = Numbers.add(num, (SubLObject)simplification_modules.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        if (simplification_modules.NIL != list_utilities.duplicatesP(possible_match_asents, Symbols.symbol_function((SubLObject)simplification_modules.EQUAL), (SubLObject)simplification_modules.$sym17$SENTENCE_ARG0)) {
            SubLObject equivalence_map = new_equivalence_map((SubLObject)simplification_modules.UNPROVIDED);
            SubLObject mapping_iteration_doneP = (SubLObject)simplification_modules.NIL;
            SubLObject num2 = (SubLObject)simplification_modules.ZERO_INTEGER;
            SubLObject cdolist_list_var2 = clauses.pos_lits(contextualized_dnf_clause);
            SubLObject lit2 = (SubLObject)simplification_modules.NIL;
            lit2 = cdolist_list_var2.first();
            while (simplification_modules.NIL != cdolist_list_var2) {
                SubLObject current2;
                final SubLObject datum2 = current2 = lit2;
                SubLObject mt2 = (SubLObject)simplification_modules.NIL;
                SubLObject asent2 = (SubLObject)simplification_modules.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)simplification_modules.$list12);
                mt2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)simplification_modules.$list12);
                asent2 = current2.first();
                current2 = current2.rest();
                if (simplification_modules.NIL == current2) {
                    if (cycl_utilities.sentence_arg0(asent2).eql(simplification_modules.$const18$equalSymbols)) {
                        equivalence_map_join(cycl_utilities.atomic_sentence_arg2(asent2, (SubLObject)simplification_modules.UNPROVIDED), cycl_utilities.atomic_sentence_arg1(asent2, (SubLObject)simplification_modules.UNPROVIDED), equivalence_map);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)simplification_modules.$list12);
                }
                num2 = Numbers.add(num2, (SubLObject)simplification_modules.ONE_INTEGER);
                cdolist_list_var2 = cdolist_list_var2.rest();
                lit2 = cdolist_list_var2.first();
            }
            final SubLObject predicates = list_utilities.fast_delete_duplicates(Mapping.mapcar((SubLObject)simplification_modules.$sym17$SENTENCE_ARG0, possible_match_asents), (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED);
            while (simplification_modules.NIL == mapping_iteration_doneP) {
                mapping_iteration_doneP = (SubLObject)simplification_modules.T;
                cdolist_list_var2 = predicates;
                SubLObject predicate = (SubLObject)simplification_modules.NIL;
                predicate = cdolist_list_var2.first();
                while (simplification_modules.NIL != cdolist_list_var2) {
                    SubLObject cdolist_list_var_$3;
                    final SubLObject functional_arg_positions = cdolist_list_var_$3 = (SubLObject)(predicate.isKeyword() ? simplification_modules.$list19 : cycl_utilities.strictly_functional_in_arg_positions(predicate, (SubLObject)simplification_modules.T));
                    SubLObject functional_position = (SubLObject)simplification_modules.NIL;
                    functional_position = cdolist_list_var_$3.first();
                    while (simplification_modules.NIL != cdolist_list_var_$3) {
                        SubLObject cdolist_list_var_$4 = possible_match_asents;
                        SubLObject possible_match_asent_1 = (SubLObject)simplification_modules.NIL;
                        possible_match_asent_1 = cdolist_list_var_$4.first();
                        while (simplification_modules.NIL != cdolist_list_var_$4) {
                            if (predicate.equal(cycl_utilities.sentence_arg0(possible_match_asent_1))) {
                                SubLObject cdolist_list_var_$5 = possible_match_asents;
                                SubLObject possible_match_asent_2 = (SubLObject)simplification_modules.NIL;
                                possible_match_asent_2 = cdolist_list_var_$5.first();
                                while (simplification_modules.NIL != cdolist_list_var_$5) {
                                    if (predicate.equal(cycl_utilities.sentence_arg0(possible_match_asent_2)) && !possible_match_asent_1.equal(possible_match_asent_2)) {
                                        final SubLObject asent_1_func_arg = cycl_utilities.sentence_arg(possible_match_asent_1, functional_position, (SubLObject)simplification_modules.UNPROVIDED);
                                        final SubLObject asent_2_func_arg = cycl_utilities.sentence_arg(possible_match_asent_2, functional_position, (SubLObject)simplification_modules.UNPROVIDED);
                                        SubLObject equivalence_foundP = (SubLObject)simplification_modules.T;
                                        if (simplification_modules.NIL == equivalence_map_equivalentP(asent_1_func_arg, asent_2_func_arg, equivalence_map)) {
                                            SubLObject argnum = (SubLObject)simplification_modules.ZERO_INTEGER;
                                            SubLObject asent_1_arg = (SubLObject)simplification_modules.NIL;
                                            SubLObject asent_1_arg_$8 = (SubLObject)simplification_modules.NIL;
                                            SubLObject asent_2_arg = (SubLObject)simplification_modules.NIL;
                                            SubLObject asent_2_arg_$9 = (SubLObject)simplification_modules.NIL;
                                            asent_1_arg = possible_match_asent_1;
                                            asent_1_arg_$8 = asent_1_arg.first();
                                            asent_2_arg = possible_match_asent_2;
                                            asent_2_arg_$9 = asent_2_arg.first();
                                            while (simplification_modules.NIL != asent_2_arg || simplification_modules.NIL != asent_1_arg) {
                                                if (!argnum.eql((SubLObject)simplification_modules.ZERO_INTEGER) && !argnum.eql(functional_position) && simplification_modules.NIL == equivalence_map_equivalentP(asent_1_arg_$8, asent_2_arg_$9, equivalence_map)) {
                                                    equivalence_foundP = (SubLObject)simplification_modules.NIL;
                                                }
                                                argnum = Numbers.add(argnum, (SubLObject)simplification_modules.ONE_INTEGER);
                                                asent_1_arg = asent_1_arg.rest();
                                                asent_1_arg_$8 = asent_1_arg.first();
                                                asent_2_arg = asent_2_arg.rest();
                                                asent_2_arg_$9 = asent_2_arg.first();
                                            }
                                            if (simplification_modules.NIL != equivalence_foundP) {
                                                equivalence_map = equivalence_map_join(asent_1_func_arg, asent_2_func_arg, equivalence_map);
                                                mapping_iteration_doneP = (SubLObject)simplification_modules.NIL;
                                            }
                                        }
                                    }
                                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                    possible_match_asent_2 = cdolist_list_var_$5.first();
                                }
                            }
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            possible_match_asent_1 = cdolist_list_var_$4.first();
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        functional_position = cdolist_list_var_$3.first();
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    predicate = cdolist_list_var2.first();
                }
            }
            cdolist_list_var = equivalence_map_class_ids(equivalence_map);
            SubLObject class_id = (SubLObject)simplification_modules.NIL;
            class_id = cdolist_list_var.first();
            while (simplification_modules.NIL != cdolist_list_var) {
                final SubLObject class_list = equivalence_map_class_list_by_id(class_id, equivalence_map);
                if (simplification_modules.NIL != list_utilities.find_all_if((SubLObject)simplification_modules.$sym4$HL_VARIABLE_P, class_list, (SubLObject)simplification_modules.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(class_list, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                class_id = cdolist_list_var.first();
            }
            cdolist_list_var = cycl_utilities.expression_gather(contextualized_dnf_clause, (SubLObject)simplification_modules.$sym4$HL_VARIABLE_P, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED);
            SubLObject other_variable = (SubLObject)simplification_modules.NIL;
            other_variable = cdolist_list_var.first();
            while (simplification_modules.NIL != cdolist_list_var) {
                if (simplification_modules.NIL == equivalence_map_class_id_for_object(equivalence_map, other_variable)) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(other_variable), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                other_variable = cdolist_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 11473L)
    public static SubLObject new_equivalence_map(SubLObject test) {
        if (test == simplification_modules.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)simplification_modules.EQUAL);
        }
        return Hashtables.make_hash_table((SubLObject)simplification_modules.TEN_INTEGER, test, (SubLObject)simplification_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 11852L)
    public static SubLObject print_equivalence_map(final SubLObject equivalence_map) {
        return hash_table_utilities.printhash(equivalence_map, (SubLObject)simplification_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 11948L)
    public static SubLObject equivalence_map_class_ids(final SubLObject equivalence_map) {
        return list_utilities.fast_delete_duplicates(hash_table_utilities.hash_table_values(equivalence_map), (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED, (SubLObject)simplification_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 12081L)
    public static SubLObject equivalence_map_class_id_for_object(final SubLObject equivalence_map, final SubLObject v_object) {
        return Hashtables.gethash(v_object, equivalence_map, (SubLObject)simplification_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 12203L)
    public static SubLObject equivalence_map_class_list_by_id(final SubLObject class_id, final SubLObject equivalence_map) {
        SubLObject class_list = (SubLObject)simplification_modules.NIL;
        SubLObject k = (SubLObject)simplification_modules.NIL;
        SubLObject v = (SubLObject)simplification_modules.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(equivalence_map);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                k = Hashtables.getEntryKey(cdohash_entry);
                v = Hashtables.getEntryValue(cdohash_entry);
                if (v.eql(class_id)) {
                    class_list = (SubLObject)ConsesLow.cons(k, class_list);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sequences.nreverse(class_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 12438L)
    public static SubLObject equivalence_map_equivalentP(final SubLObject object1, final SubLObject object2, SubLObject equivalence_map) {
        equivalence_map = equivalence_map_insert(object1, equivalence_map);
        equivalence_map = equivalence_map_insert(object2, equivalence_map);
        return Equality.eql(Hashtables.gethash(object1, equivalence_map, (SubLObject)simplification_modules.UNPROVIDED), Hashtables.gethash(object2, equivalence_map, (SubLObject)simplification_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 12758L)
    public static SubLObject equivalence_map_insert(final SubLObject v_object, final SubLObject equivalence_map) {
        if (simplification_modules.NIL != Hashtables.gethash(v_object, equivalence_map, (SubLObject)simplification_modules.UNPROVIDED)) {
            return equivalence_map;
        }
        final SubLObject equivalence_values = hash_table_utilities.hash_table_values(equivalence_map);
        if (simplification_modules.NIL == equivalence_values) {
            Hashtables.sethash(v_object, equivalence_map, (SubLObject)simplification_modules.ZERO_INTEGER);
        }
        else {
            Hashtables.sethash(v_object, equivalence_map, Numbers.add(number_utilities.maximum(equivalence_values, (SubLObject)simplification_modules.UNPROVIDED), (SubLObject)simplification_modules.ONE_INTEGER));
        }
        return equivalence_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 13130L)
    public static SubLObject equivalence_map_join(final SubLObject object1, final SubLObject object2, SubLObject equivalence_map) {
        equivalence_map = equivalence_map_insert(object1, equivalence_map);
        equivalence_map = equivalence_map_insert(object2, equivalence_map);
        final SubLObject old_class_num = Hashtables.gethash(object2, equivalence_map, (SubLObject)simplification_modules.UNPROVIDED);
        final SubLObject new_class_num = Hashtables.gethash(object1, equivalence_map, (SubLObject)simplification_modules.UNPROVIDED);
        SubLObject k = (SubLObject)simplification_modules.NIL;
        SubLObject v = (SubLObject)simplification_modules.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(equivalence_map);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                k = Hashtables.getEntryKey(cdohash_entry);
                v = Hashtables.getEntryValue(cdohash_entry);
                if (v.eql(old_class_num)) {
                    Hashtables.sethash(k, equivalence_map, new_class_num);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return equivalence_map;
    }
    
    public static SubLObject declare_simplification_modules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "simplification_module_p", "SIMPLIFICATION-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "simplification_duplicate_literals_via_functionality_pos_lits_applicability", "SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY", 1, 0, false);
        new $simplification_duplicate_literals_via_functionality_pos_lits_applicability$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "problem_is_a_topological_rootP", "PROBLEM-IS-A-TOPOLOGICAL-ROOT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "simplification_duplicate_literals_via_functionality_expand", "SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "problem_query_simplify_via_functionality", "PROBLEM-QUERY-SIMPLIFY-VIA-FUNCTIONALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "problem_query_compute_simplification_via_functionality_variable_map", "PROBLEM-QUERY-COMPUTE-SIMPLIFICATION-VIA-FUNCTIONALITY-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "compute_simplification_via_functionality_variable_map", "COMPUTE-SIMPLIFICATION-VIA-FUNCTIONALITY-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "asent_pred_inter_arg_dependent_cardinalities_internal", "ASENT-PRED-INTER-ARG-DEPENDENT-CARDINALITIES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "asent_pred_inter_arg_dependent_cardinalities", "ASENT-PRED-INTER-ARG-DEPENDENT-CARDINALITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "any_specP_memoized_internal", "ANY-SPEC?-MEMOIZED-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "any_specP_memoized", "ANY-SPEC?-MEMOIZED", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "simplification_duplicate_literals_via_functionality_pos_lits_equivalence_classes", "SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-EQUIVALENCE-CLASSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "new_equivalence_map", "NEW-EQUIVALENCE-MAP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "print_equivalence_map", "PRINT-EQUIVALENCE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "equivalence_map_class_ids", "EQUIVALENCE-MAP-CLASS-IDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "equivalence_map_class_id_for_object", "EQUIVALENCE-MAP-CLASS-ID-FOR-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "equivalence_map_class_list_by_id", "EQUIVALENCE-MAP-CLASS-LIST-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "equivalence_map_equivalentP", "EQUIVALENCE-MAP-EQUIVALENT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "equivalence_map_insert", "EQUIVALENCE-MAP-INSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.simplification_modules", "equivalence_map_join", "EQUIVALENCE-MAP-JOIN", 3, 0, false);
        return (SubLObject)simplification_modules.NIL;
    }
    
    public static SubLObject init_simplification_modules_file() {
        simplification_modules.$simplification_module_names$ = SubLFiles.deflexical("*SIMPLIFICATION-MODULE-NAMES*", (SubLObject)simplification_modules.$list0);
        simplification_modules.$simplification_modules_enabledP$ = SubLFiles.defparameter("*SIMPLIFICATION-MODULES-ENABLED?*", (SubLObject)simplification_modules.T);
        return (SubLObject)simplification_modules.NIL;
    }
    
    public static SubLObject setup_simplification_modules_file() {
        inference_modules.inference_conjunctive_removal_module((SubLObject)simplification_modules.$kw1$REMOVAL_SIMPLIFICATION_CONJUNCTION_DUPLICATE_LITERALS_VIA_FUNCTIO, (SubLObject)simplification_modules.$list2);
        utilities_macros.note_funcall_helper_function((SubLObject)simplification_modules.$sym5$SIMPLIFICATION_DUPLICATE_LITERALS_VIA_FUNCTIONALITY_POS_LITS_APPL);
        memoization_state.note_memoized_function((SubLObject)simplification_modules.$sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES);
        memoization_state.note_memoized_function((SubLObject)simplification_modules.$sym10$ANY_SPEC__MEMOIZED);
        return (SubLObject)simplification_modules.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_simplification_modules_file();
    }
    
    @Override
	public void initializeVariables() {
        init_simplification_modules_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_simplification_modules_file();
    }
    
    static {
        me = (SubLFile)new simplification_modules();
        simplification_modules.$simplification_module_names$ = null;
        simplification_modules.$simplification_modules_enabledP$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-SIMPLIFICATION-CONJUNCTION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY"));
        $kw1$REMOVAL_SIMPLIFICATION_CONJUNCTION_DUPLICATE_LITERALS_VIA_FUNCTIO = SubLObjectFactory.makeKeyword("REMOVAL-SIMPLIFICATION-CONJUNCTION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("DIRECTION"), SubLObjectFactory.makeKeyword("BACKWARD"), SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), simplification_modules.NIL, SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), simplification_modules.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRUNE-NON-WFF-CONJUNCTION")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Simplification module to bind variables to forts or other variables when functional predicate can be used to prove equivalence.") });
        $sym3$SINGLETON_ = SubLObjectFactory.makeSymbol("SINGLETON?");
        $sym4$HL_VARIABLE_P = SubLObjectFactory.makeSymbol("HL-VARIABLE-P");
        $sym5$SIMPLIFICATION_DUPLICATE_LITERALS_VIA_FUNCTIONALITY_POS_LITS_APPL = SubLObjectFactory.makeSymbol("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY");
        $sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES = SubLObjectFactory.makeSymbol("ASENT-PRED-INTER-ARG-DEPENDENT-CARDINALITIES");
        $const7$interArgDependentCardinality = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgDependentCardinality"));
        $list8 = ConsesLow.list((SubLObject)simplification_modules.TWO_INTEGER, (SubLObject)simplification_modules.THREE_INTEGER, (SubLObject)simplification_modules.FOUR_INTEGER, (SubLObject)simplification_modules.FIVE_INTEGER, (SubLObject)simplification_modules.SIX_INTEGER);
        $int9$100 = SubLObjectFactory.makeInteger(100);
        $sym10$ANY_SPEC__MEMOIZED = SubLObjectFactory.makeSymbol("ANY-SPEC?-MEMOIZED");
        $int11$1024 = SubLObjectFactory.makeInteger(1024);
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("M"), (SubLObject)SubLObjectFactory.makeSymbol("COL1"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("COL2"), (SubLObject)SubLObjectFactory.makeSymbol("CARD"));
        $const14$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym15$CAR = SubLObjectFactory.makeSymbol("CAR");
        $str16$_ = SubLObjectFactory.makeString("-");
        $sym17$SENTENCE_ARG0 = SubLObjectFactory.makeSymbol("SENTENCE-ARG0");
        $const18$equalSymbols = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols"));
        $list19 = ConsesLow.list((SubLObject)simplification_modules.TWO_INTEGER);
    }
    
    public static final class $simplification_duplicate_literals_via_functionality_pos_lits_applicability$UnaryFunction extends UnaryFunction
    {
        public $simplification_duplicate_literals_via_functionality_pos_lits_applicability$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return simplification_modules.simplification_duplicate_literals_via_functionality_pos_lits_applicability(arg1);
        }
    }
}

/*

	Total time: 143 ms
	
*/