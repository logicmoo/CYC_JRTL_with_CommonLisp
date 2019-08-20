package com.cyc.cycjava.cycl.inference.modules;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_answer;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class simplification_modules extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "6e1be3dfc87d405ed2301324c0f28187698d34e9549fd4fa8a8920966ab8fabf";
    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 900L)
    private static SubLSymbol $simplification_module_names$;
    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 1400L)
    private static SubLSymbol $simplification_modules_enabledP$;
    private static SubLList $list0;
    private static SubLSymbol $REMOVAL_SIMPLIFICATION_CONJUNCTION_DUPLICATE_LITERALS_VIA_FUNCTIO;
    private static SubLList $list2;
    private static SubLSymbol $sym3$SINGLETON_;
    private static SubLSymbol $sym4$HL_VARIABLE_P;
    private static SubLSymbol $sym5$SIMPLIFICATION_DUPLICATE_LITERALS_VIA_FUNCTIONALITY_POS_LITS_APPL;
    private static SubLSymbol $sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES;
    private static SubLObject $$interArgDependentCardinality;
    private static SubLList $list8;
    private static SubLInteger $int$100;
    private static SubLSymbol $sym10$ANY_SPEC__MEMOIZED;
    private static SubLInteger $int$1024;
    private static SubLList $list12;
    private static SubLList $list13;
    private static SubLObject $$Thing;
    private static SubLSymbol $sym15$CAR;
    private static SubLString $str16$_;
    private static SubLSymbol $sym17$SENTENCE_ARG0;
    private static SubLObject $$equalSymbols;
    private static SubLList $list19;

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 1300L)
    public static SubLObject simplification_module_p(SubLObject hl_module) {
        return makeBoolean(NIL != inference_modules.hl_module_p(hl_module) && NIL != list_utilities.member_eqP(inference_modules.hl_module_name(hl_module), $simplification_module_names$.getGlobalValue()));
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 2500L)
    public static SubLObject simplification_duplicate_literals_via_functionality_pos_lits_applicability(SubLObject contextualized_dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $simplification_modules_enabledP$.getDynamicValue(thread)) {
            SubLObject problem = inference_worker.currently_active_problem();
            if (NIL != problem_is_a_topological_rootP(problem)) {
                SubLObject minimal_problem_query = removal_modules_conjunctive_pruning.supporting_residual_conjunction_problem_minimal_problem_query(problem, T);
                SubLObject equivalence_classes = simplification_duplicate_literals_via_functionality_pos_lits_equivalence_classes(inference_datastructures_problem.problem_query_sole_clause(minimal_problem_query));
                SubLObject non_singleton_classes = list_utilities.find_all_if_not($sym3$SINGLETON_, equivalence_classes, UNPROVIDED);
                if (NIL != non_singleton_classes) {
                    SubLObject cdolist_list_var = non_singleton_classes;
                    SubLObject non_singleton_class = NIL;
                    non_singleton_class = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (ONE_INTEGER.numL(Sequences.length(list_utilities.find_all_if_not($sym4$HL_VARIABLE_P, non_singleton_class, UNPROVIDED)))) {
                            return NIL;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        non_singleton_class = cdolist_list_var.first();
                    }
                    return list(clause_utilities.new_total_subclause_spec(contextualized_dnf_clause));
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 3500L)
    public static SubLObject problem_is_a_topological_rootP(SubLObject problem) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link) && (NIL != inference_worker_residual_transformation.residual_transformation_link_p(link) || NIL != inference_worker_answer.answer_link_p(link)
                    || (NIL != inference_worker_split.split_link_p(link) && NIL != problem_is_a_topological_rootP(inference_datastructures_problem_link.problem_link_supported_problem(link))))) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 3900L)
    public static SubLObject simplification_duplicate_literals_via_functionality_expand(SubLObject contextualized_dnf_clause) {
        SubLObject v_bindings = compute_simplification_via_functionality_variable_map(contextualized_dnf_clause);
        if (NIL != v_bindings) {
            inference_worker_removal.conjunctive_removal_callback(v_bindings, NIL);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 4300L)
    public static SubLObject problem_query_simplify_via_functionality(SubLObject problem_query) {
        SubLObject v_bindings = problem_query_compute_simplification_via_functionality_variable_map(problem_query);
        SubLObject simplified_query = bindings.apply_bindings(v_bindings, problem_query);
        return simplified_query;
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 4600L)
    public static SubLObject problem_query_compute_simplification_via_functionality_variable_map(SubLObject problem_query) {
        return compute_simplification_via_functionality_variable_map(inference_datastructures_problem.problem_query_sole_clause(problem_query));
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 4800L)
    public static SubLObject compute_simplification_via_functionality_variable_map(SubLObject contextualized_dnf_clause) {
        SubLObject v_bindings = NIL;
        SubLObject cdolist_list_var = simplification_duplicate_literals_via_functionality_pos_lits_equivalence_classes(contextualized_dnf_clause);
        SubLObject class_list = NIL;
        class_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == list_utilities.singletonP(class_list)) {
                SubLObject chosen_members = list_utilities.find_all_if_not($sym4$HL_VARIABLE_P, class_list, UNPROVIDED);
                SubLObject chosen_member = NIL;
                if (NIL == chosen_members) {
                    chosen_member = class_list.first();
                } else if (NIL != list_utilities.singletonP(chosen_members)) {
                    chosen_member = chosen_members.first();
                }
                SubLObject cdolist_list_var_$1 = list_utilities.find_all_if($sym4$HL_VARIABLE_P, class_list, UNPROVIDED);
                SubLObject variable = NIL;
                variable = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
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

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 5800L)
    public static SubLObject asent_pred_inter_arg_dependent_cardinalities_internal(SubLObject pred) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples_in_any_mt(pred, $$interArgDependentCardinality, ONE_INTEGER, $list8, UNPROVIDED);
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(tuple, result);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 5800L)
    public static SubLObject asent_pred_inter_arg_dependent_cardinalities(SubLObject pred) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return asent_pred_inter_arg_dependent_cardinalities_internal(pred);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES, ONE_INTEGER, $int$100, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(asent_pred_inter_arg_dependent_cardinalities_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 6100L)
    public static SubLObject any_specP_memoized_internal(SubLObject genl, SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return genls.any_specP(genl, kb_utilities.sort_terms(specs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, tv);
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 6100L)
    public static SubLObject any_specP_memoized(SubLObject genl, SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_specP_memoized_internal(genl, specs, mt, tv);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym10$ANY_SPEC__MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym10$ANY_SPEC__MEMOIZED, FOUR_INTEGER, $int$1024, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym10$ANY_SPEC__MEMOIZED, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_4(genl, specs, mt, tv);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (genl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (specs.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (NIL != cached_args && NIL == cached_args.rest() && tv.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(any_specP_memoized_internal(genl, specs, mt, tv)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(genl, specs, mt, tv));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 6300L)
    public static SubLObject simplification_duplicate_literals_via_functionality_pos_lits_equivalence_classes(SubLObject contextualized_dnf_clause) {
        SubLObject possible_match_asents = NIL;
        SubLObject result = NIL;
        SubLObject variable_constraint_tuples = removal_modules_conjunctive_pruning.dnf_variable_constraint_tuples(contextualized_dnf_clause);
        SubLObject num = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = lit;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject asent_pred = cycl_utilities.sentence_arg0(asent);
                if (NIL != forts.fort_p(asent_pred)) {
                    SubLObject asent_pred_inter_arg_dependent_cardinalities = asent_pred_inter_arg_dependent_cardinalities(asent_pred);
                    if (NIL != asent_pred_inter_arg_dependent_cardinalities) {
                        SubLObject cdolist_list_var_$2 = asent_pred_inter_arg_dependent_cardinalities;
                        SubLObject asent_pred_inter_arg_dependent_cardinality = NIL;
                        asent_pred_inter_arg_dependent_cardinality = cdolist_list_var_$2.first();
                        while (NIL != cdolist_list_var_$2) {
                            SubLObject current_$4;
                            SubLObject datum_$3 = current_$4 = asent_pred_inter_arg_dependent_cardinality;
                            SubLObject m = NIL;
                            SubLObject col1 = NIL;
                            SubLObject n = NIL;
                            SubLObject col2 = NIL;
                            SubLObject card = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, $list13);
                            m = current_$4.first();
                            current_$4 = current_$4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, $list13);
                            col1 = current_$4.first();
                            current_$4 = current_$4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, $list13);
                            n = current_$4.first();
                            current_$4 = current_$4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, $list13);
                            col2 = current_$4.first();
                            current_$4 = current_$4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, $list13);
                            card = current_$4.first();
                            current_$4 = current_$4.rest();
                            if (NIL == current_$4) {
                                if (card.eql(ONE_INTEGER) && col1.eql($$Thing)) {
                                    SubLObject arg_from = cycl_utilities.atomic_sentence_arg(asent, m, UNPROVIDED);
                                    SubLObject arg_to = cycl_utilities.atomic_sentence_arg(asent, n, UNPROVIDED);
                                    if (NIL != ((NIL != forts.fort_p(arg_to)) ? genls.genl_in_any_mtP(arg_to, col2) : any_specP_memoized(col2, conses_high.third(Sequences.find(arg_to, variable_constraint_tuples, EQL, $sym15$CAR, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED))) {
                                        SubLObject fake_pred = string_utilities.pretty_keyword_from_string(
                                                Sequences.cconcatenate(format_nil.format_nil_a_no_copy(asent_pred), new SubLObject[] { $str16$_, format_nil.format_nil_a_no_copy(m), $str16$_, format_nil.format_nil_a_no_copy(n), $str16$_, format_nil.format_nil_a_no_copy(col2) }));
                                        possible_match_asents = cons(list(fake_pred, arg_from, arg_to), possible_match_asents);
                                    }
                                }
                            } else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$3, $list13);
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            asent_pred_inter_arg_dependent_cardinality = cdolist_list_var_$2.first();
                        }
                    }
                    if (NIL != cycl_utilities.strictly_functional_in_some_argP(asent_pred)) {
                        possible_match_asents = cons(asent, possible_match_asents);
                        if (NIL != kb_accessors.symmetric_predicateP(asent_pred)) {
                            SubLObject item_var = el_utilities.make_binary_formula(asent_pred, cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
                            if (NIL == conses_high.member(item_var, possible_match_asents, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                possible_match_asents = cons(item_var, possible_match_asents);
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list12);
            }
            num = Numbers.add(num, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        if (NIL != list_utilities.duplicatesP(possible_match_asents, Symbols.symbol_function(EQUAL), $sym17$SENTENCE_ARG0)) {
            SubLObject equivalence_map = new_equivalence_map(UNPROVIDED);
            SubLObject mapping_iteration_doneP = NIL;
            SubLObject num2 = ZERO_INTEGER;
            SubLObject cdolist_list_var2 = clauses.pos_lits(contextualized_dnf_clause);
            SubLObject lit2 = NIL;
            lit2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject current2;
                SubLObject datum2 = current2 = lit2;
                SubLObject mt2 = NIL;
                SubLObject asent2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, $list12);
                mt2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, $list12);
                asent2 = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    if (cycl_utilities.sentence_arg0(asent2).eql($$equalSymbols)) {
                        equivalence_map_join(cycl_utilities.atomic_sentence_arg2(asent2, UNPROVIDED), cycl_utilities.atomic_sentence_arg1(asent2, UNPROVIDED), equivalence_map);
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum2, $list12);
                }
                num2 = Numbers.add(num2, ONE_INTEGER);
                cdolist_list_var2 = cdolist_list_var2.rest();
                lit2 = cdolist_list_var2.first();
            }
            SubLObject predicates = list_utilities.fast_delete_duplicates(Mapping.mapcar($sym17$SENTENCE_ARG0, possible_match_asents), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            while (NIL == mapping_iteration_doneP) {
                mapping_iteration_doneP = T;
                cdolist_list_var2 = predicates;
                SubLObject predicate = NIL;
                predicate = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    SubLObject cdolist_list_var_$3;
                    SubLObject functional_arg_positions = cdolist_list_var_$3 = predicate.isKeyword() ? $list19 : cycl_utilities.strictly_functional_in_arg_positions(predicate, T);
                    SubLObject functional_position = NIL;
                    functional_position = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        SubLObject cdolist_list_var_$4 = possible_match_asents;
                        SubLObject possible_match_asent_1 = NIL;
                        possible_match_asent_1 = cdolist_list_var_$4.first();
                        while (NIL != cdolist_list_var_$4) {
                            if (predicate.equal(cycl_utilities.sentence_arg0(possible_match_asent_1))) {
                                SubLObject cdolist_list_var_$5 = possible_match_asents;
                                SubLObject possible_match_asent_2 = NIL;
                                possible_match_asent_2 = cdolist_list_var_$5.first();
                                while (NIL != cdolist_list_var_$5) {
                                    if (predicate.equal(cycl_utilities.sentence_arg0(possible_match_asent_2)) && !possible_match_asent_1.equal(possible_match_asent_2)) {
                                        SubLObject asent_1_func_arg = cycl_utilities.sentence_arg(possible_match_asent_1, functional_position, UNPROVIDED);
                                        SubLObject asent_2_func_arg = cycl_utilities.sentence_arg(possible_match_asent_2, functional_position, UNPROVIDED);
                                        SubLObject equivalence_foundP = T;
                                        if (NIL == equivalence_map_equivalentP(asent_1_func_arg, asent_2_func_arg, equivalence_map)) {
                                            SubLObject argnum = ZERO_INTEGER;
                                            SubLObject asent_1_arg = NIL;
                                            SubLObject asent_1_arg_$8 = NIL;
                                            SubLObject asent_2_arg = NIL;
                                            SubLObject asent_2_arg_$9 = NIL;
                                            asent_1_arg = possible_match_asent_1;
                                            asent_1_arg_$8 = asent_1_arg.first();
                                            asent_2_arg = possible_match_asent_2;
                                            asent_2_arg_$9 = asent_2_arg.first();
                                            while (NIL != asent_2_arg || NIL != asent_1_arg) {
                                                if (!argnum.eql(ZERO_INTEGER) && !argnum.eql(functional_position) && NIL == equivalence_map_equivalentP(asent_1_arg_$8, asent_2_arg_$9, equivalence_map)) {
                                                    equivalence_foundP = NIL;
                                                }
                                                argnum = Numbers.add(argnum, ONE_INTEGER);
                                                asent_1_arg = asent_1_arg.rest();
                                                asent_1_arg_$8 = asent_1_arg.first();
                                                asent_2_arg = asent_2_arg.rest();
                                                asent_2_arg_$9 = asent_2_arg.first();
                                            }
                                            if (NIL != equivalence_foundP) {
                                                equivalence_map = equivalence_map_join(asent_1_func_arg, asent_2_func_arg, equivalence_map);
                                                mapping_iteration_doneP = NIL;
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
            SubLObject class_id = NIL;
            class_id = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject class_list = equivalence_map_class_list_by_id(class_id, equivalence_map);
                if (NIL != list_utilities.find_all_if($sym4$HL_VARIABLE_P, class_list, UNPROVIDED)) {
                    result = cons(class_list, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                class_id = cdolist_list_var.first();
            }
            cdolist_list_var = cycl_utilities.expression_gather(contextualized_dnf_clause, $sym4$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject other_variable = NIL;
            other_variable = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == equivalence_map_class_id_for_object(equivalence_map, other_variable)) {
                    result = cons(list(other_variable), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                other_variable = cdolist_list_var.first();
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 11400L)
    public static SubLObject new_equivalence_map(SubLObject test) {
        if (test == UNPROVIDED) {
            test = Symbols.symbol_function(EQUAL);
        }
        return Hashtables.make_hash_table(TEN_INTEGER, test, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 11800L)
    public static SubLObject print_equivalence_map(SubLObject equivalence_map) {
        return hash_table_utilities.printhash(equivalence_map, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 11900L)
    public static SubLObject equivalence_map_class_ids(SubLObject equivalence_map) {
        return list_utilities.fast_delete_duplicates(hash_table_utilities.hash_table_values(equivalence_map), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 12000L)
    public static SubLObject equivalence_map_class_id_for_object(SubLObject equivalence_map, SubLObject v_object) {
        return Hashtables.gethash(v_object, equivalence_map, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 12200L)
    public static SubLObject equivalence_map_class_list_by_id(SubLObject class_id, SubLObject equivalence_map) {
        SubLObject class_list = NIL;
        SubLObject k = NIL;
        SubLObject v = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(equivalence_map);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                k = Hashtables.getEntryKey(cdohash_entry);
                v = Hashtables.getEntryValue(cdohash_entry);
                if (v.eql(class_id)) {
                    class_list = cons(k, class_list);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sequences.nreverse(class_list);
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 12400L)
    public static SubLObject equivalence_map_equivalentP(SubLObject object1, SubLObject object2, SubLObject equivalence_map) {
        equivalence_map = equivalence_map_insert(object1, equivalence_map);
        equivalence_map = equivalence_map_insert(object2, equivalence_map);
        return Equality.eql(Hashtables.gethash(object1, equivalence_map, UNPROVIDED), Hashtables.gethash(object2, equivalence_map, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 12700L)
    public static SubLObject equivalence_map_insert(SubLObject v_object, SubLObject equivalence_map) {
        if (NIL != Hashtables.gethash(v_object, equivalence_map, UNPROVIDED)) {
            return equivalence_map;
        }
        SubLObject equivalence_values = hash_table_utilities.hash_table_values(equivalence_map);
        if (NIL == equivalence_values) {
            Hashtables.sethash(v_object, equivalence_map, ZERO_INTEGER);
        } else {
            Hashtables.sethash(v_object, equivalence_map, Numbers.add(number_utilities.maximum(equivalence_values, UNPROVIDED), ONE_INTEGER));
        }
        return equivalence_map;
    }

    @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 13100L)
    public static SubLObject equivalence_map_join(SubLObject object1, SubLObject object2, SubLObject equivalence_map) {
        equivalence_map = equivalence_map_insert(object1, equivalence_map);
        equivalence_map = equivalence_map_insert(object2, equivalence_map);
        SubLObject old_class_num = Hashtables.gethash(object2, equivalence_map, UNPROVIDED);
        SubLObject new_class_num = Hashtables.gethash(object1, equivalence_map, UNPROVIDED);
        SubLObject k = NIL;
        SubLObject v = NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(equivalence_map);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                k = Hashtables.getEntryKey(cdohash_entry);
                v = Hashtables.getEntryValue(cdohash_entry);
                if (v.eql(old_class_num)) {
                    Hashtables.sethash(k, equivalence_map, new_class_num);
                }
            }
        } finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return equivalence_map;
    }

    public static SubLObject declare_simplification_modules_file() {
        declareFunction("simplification_module_p", "SIMPLIFICATION-MODULE-P", 1, 0, false);
        declareFunction("simplification_duplicate_literals_via_functionality_pos_lits_applicability", "SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY", 1, 0, false);
        new $simplification_duplicate_literals_via_functionality_pos_lits_applicability$UnaryFunction();
        declareFunction("problem_is_a_topological_rootP", "PROBLEM-IS-A-TOPOLOGICAL-ROOT?", 1, 0, false);
        declareFunction("simplification_duplicate_literals_via_functionality_expand", "SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-EXPAND", 1, 0, false);
        declareFunction("problem_query_simplify_via_functionality", "PROBLEM-QUERY-SIMPLIFY-VIA-FUNCTIONALITY", 1, 0, false);
        declareFunction("problem_query_compute_simplification_via_functionality_variable_map", "PROBLEM-QUERY-COMPUTE-SIMPLIFICATION-VIA-FUNCTIONALITY-VARIABLE-MAP", 1, 0, false);
        declareFunction("compute_simplification_via_functionality_variable_map", "COMPUTE-SIMPLIFICATION-VIA-FUNCTIONALITY-VARIABLE-MAP", 1, 0, false);
        declareFunction("asent_pred_inter_arg_dependent_cardinalities_internal", "ASENT-PRED-INTER-ARG-DEPENDENT-CARDINALITIES-INTERNAL", 1, 0, false);
        declareFunction("asent_pred_inter_arg_dependent_cardinalities", "ASENT-PRED-INTER-ARG-DEPENDENT-CARDINALITIES", 1, 0, false);
        declareFunction("any_specP_memoized_internal", "ANY-SPEC?-MEMOIZED-INTERNAL", 2, 2, false);
        declareFunction("any_specP_memoized", "ANY-SPEC?-MEMOIZED", 2, 2, false);
        declareFunction("simplification_duplicate_literals_via_functionality_pos_lits_equivalence_classes", "SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-EQUIVALENCE-CLASSES", 1, 0, false);
        declareFunction("new_equivalence_map", "NEW-EQUIVALENCE-MAP", 0, 1, false);
        declareFunction("print_equivalence_map", "PRINT-EQUIVALENCE-MAP", 1, 0, false);
        declareFunction("equivalence_map_class_ids", "EQUIVALENCE-MAP-CLASS-IDS", 1, 0, false);
        declareFunction("equivalence_map_class_id_for_object", "EQUIVALENCE-MAP-CLASS-ID-FOR-OBJECT", 2, 0, false);
        declareFunction("equivalence_map_class_list_by_id", "EQUIVALENCE-MAP-CLASS-LIST-BY-ID", 2, 0, false);
        declareFunction("equivalence_map_equivalentP", "EQUIVALENCE-MAP-EQUIVALENT?", 3, 0, false);
        declareFunction("equivalence_map_insert", "EQUIVALENCE-MAP-INSERT", 2, 0, false);
        declareFunction("equivalence_map_join", "EQUIVALENCE-MAP-JOIN", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_simplification_modules_file() {
        $simplification_module_names$ = deflexical("*SIMPLIFICATION-MODULE-NAMES*", $list0);
        $simplification_modules_enabledP$ = defparameter("*SIMPLIFICATION-MODULES-ENABLED?*", T);
        return NIL;
    }

    public static SubLObject setup_simplification_modules_file() {
        inference_modules.inference_conjunctive_removal_module($REMOVAL_SIMPLIFICATION_CONJUNCTION_DUPLICATE_LITERALS_VIA_FUNCTIO, $list2);
        utilities_macros.note_funcall_helper_function($sym5$SIMPLIFICATION_DUPLICATE_LITERALS_VIA_FUNCTIONALITY_POS_LITS_APPL);
        memoization_state.note_memoized_function($sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES);
        memoization_state.note_memoized_function($sym10$ANY_SPEC__MEMOIZED);
        return NIL;
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
        me = new simplification_modules();
        $simplification_module_names$ = null;
        $simplification_modules_enabledP$ = null;
        $list0 = list(makeKeyword("REMOVAL-SIMPLIFICATION-CONJUNCTION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY"));
        $REMOVAL_SIMPLIFICATION_CONJUNCTION_DUPLICATE_LITERALS_VIA_FUNCTIO = makeKeyword("REMOVAL-SIMPLIFICATION-CONJUNCTION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY");
        $list2 = list(new SubLObject[] { makeKeyword("DIRECTION"), makeKeyword("BACKWARD"), makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER,
                makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("PRUNE-NON-WFF-CONJUNCTION")), makeKeyword("EXPAND"), makeSymbol("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-EXPAND"),
                makeKeyword("DOCUMENTATION"), makeString("Simplification module to bind variables to forts or other variables when functional predicate can be used to prove equivalence.") });
        $sym3$SINGLETON_ = makeSymbol("SINGLETON?");
        $sym4$HL_VARIABLE_P = makeSymbol("HL-VARIABLE-P");
        $sym5$SIMPLIFICATION_DUPLICATE_LITERALS_VIA_FUNCTIONALITY_POS_LITS_APPL = makeSymbol("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY");
        $sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES = makeSymbol("ASENT-PRED-INTER-ARG-DEPENDENT-CARDINALITIES");
        $$interArgDependentCardinality = makeConstSym(("interArgDependentCardinality"));
        $list8 = list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER);
        $int$100 = makeInteger(100);
        $sym10$ANY_SPEC__MEMOIZED = makeSymbol("ANY-SPEC?-MEMOIZED");
        $int$1024 = makeInteger(1024);
        $list12 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $list13 = list(makeSymbol("M"), makeSymbol("COL1"), makeSymbol("N"), makeSymbol("COL2"), makeSymbol("CARD"));
        $$Thing = makeConstSym(("Thing"));
        $sym15$CAR = makeSymbol("CAR");
        $str16$_ = makeString("-");
        $sym17$SENTENCE_ARG0 = makeSymbol("SENTENCE-ARG0");
        $$equalSymbols = makeConstSym(("equalSymbols"));
        $list19 = list(TWO_INTEGER);
    }

    public static class $simplification_duplicate_literals_via_functionality_pos_lits_applicability$UnaryFunction extends UnaryFunction {
        public $simplification_duplicate_literals_via_functionality_pos_lits_applicability$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return simplification_duplicate_literals_via_functionality_pos_lits_applicability(arg1);
        }
    }
}
/*
 *
 * Total time: 143 ms
 *
 */