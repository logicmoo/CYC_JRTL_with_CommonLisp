/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 *  module:      INFERENCE-BALANCED-TACTICIAN-MOTIVATION
 *  source file: /cyc/top/cycl/inference/harness/inference-balanced-tactician-motivation.lisp
 *  created:     2019/07/03 17:37:41
 */
public final class inference_balanced_tactician_motivation extends SubLTranslatedFile implements V02 {
    // // Constructor
    private inference_balanced_tactician_motivation() {
    }

    public static final SubLFile me = new inference_balanced_tactician_motivation();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_balanced_tactician_motivation";

    // // Definitions
    public static final SubLObject balanced_strategy_with_strategically_active_strategem(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject strategy = NIL;
                    SubLObject strategem = NIL;
                    SubLObject motivation = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    strategy = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    strategem = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    motivation = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject problem = $sym1$PROBLEM;
                            SubLObject strategem_var = $sym2$STRATEGEM_VAR;
                            return listS(CLET, list(list(strategem_var, strategem), list(problem, list(STRATEGEM_PROBLEM, strategem_var))), list(BALANCED_STRATEGY_DEACTIVATE_STRATEGEM, strategy, strategem_var, motivation), append(body, list(list(BALANCED_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM, strategy, problem))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp
     */
    public static final SubLObject balanced_strategy_possibly_propagate_motivation_to_link_head(SubLObject strategy, SubLObject motivation, SubLObject link_head) {
        SubLTrampolineFile.checkType(link_head, MOTIVATION_STRATEGEM_P);
        {
            SubLObject already_motivatedP = inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivatedP(strategy, motivation, link_head);
            if (NIL == already_motivatedP) {
                balanced_strategy_propagate_motivation_to_link_head(strategy, motivation, link_head);
                return T;
            }
            return NIL;
        }
    }

    /**
     * There ought to be two triggers for new root creation via an RT link:
     * the motivation transformation link getting T, or the motivating join-ordered link
     * getting T.  Leviathan experiments indicated that we actually gain
     * more completeness by refraining from triggering via join-ordered T,
     * but more recent work requires this to be T for correctness.
     */
    // defparameter
    public static final SubLSymbol $balanced_strategy_new_roots_triggered_by_t_on_jo_linkP$ = makeSymbol("*BALANCED-STRATEGY-NEW-ROOTS-TRIGGERED-BY-T-ON-JO-LINK?*");

    /**
     * It seems correct to ensure that the motivating join-ordered link has T before using it
     * to motivate the creation of a new root.  However, turning this to NIL causes 13 haystacks
     * to become answerable.  Leviathan @todo investigate why, and try to come up with a more
     * principled fix.
     */
    // defvar
    public static final SubLSymbol $balanced_strategy_new_roots_check_for_t_on_jo_linkP$ = makeSymbol("*BALANCED-STRATEGY-NEW-ROOTS-CHECK-FOR-T-ON-JO-LINK?*");

    public static final SubLObject balanced_strategy_propagate_motivation_to_link_head(SubLObject strategy, SubLObject motivation, SubLObject link_head) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
            SubLTrampolineFile.checkType(link_head, MOTIVATION_STRATEGEM_P);
            inference_balanced_tactician_datastructures.balanced_strategy_note_link_head_motivated(strategy, motivation, link_head);
            if (NIL != inference_worker_transformation.transformation_link_p(link_head)) {
            } else
                if (NIL != inference_tactician.motivation_strategem_link_p(link_head)) {
                    {
                        SubLObject link = link_head;
                        SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(link);
                        balanced_strategy_possibly_propagate_motivation_to_problem(strategy, motivation, supporting_problem);
                    }
                } else {
                    {
                        SubLObject tactic = link_head;
                        if (NIL != inference_worker_join.join_tactic_p(tactic)) {
                            {
                                SubLObject join_link = inference_worker_join.join_tactic_link(tactic);
                                SubLObject first_problem = inference_worker_join.join_link_first_problem(join_link);
                                SubLObject second_problem = inference_worker_join.join_link_second_problem(join_link);
                                balanced_strategy_possibly_propagate_motivation_to_problem(strategy, motivation, first_problem);
                                balanced_strategy_possibly_propagate_motivation_to_problem(strategy, motivation, second_problem);
                            }
                        } else {
                            {
                                SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
                                balanced_strategy_possibly_propagate_motivation_to_problem(strategy, motivation, lookahead_problem);
                            }
                        }
                    }
                }

            if (NIL != inference_worker.connected_conjunction_tactic_p(link_head)) {
                {
                    SubLObject tactic = link_head;
                    SubLObject link = inference_worker.connected_conjunction_tactic_link(tactic);
                    if (NIL != balanced_strategy_early_removal_linkP(strategy, link)) {
                        {
                            SubLObject link_var = link;
                            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) {
                                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                                            if (NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var)) {
                                                {
                                                    SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                                                    balanced_strategy_possibly_make_new_root(strategy, restricted_non_focal_problem);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if ($TRANSFORMATION == motivation) {
                        if (NIL != $balanced_strategy_new_roots_triggered_by_t_on_jo_linkP$.getDynamicValue(thread)) {
                            if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                                {
                                    SubLObject jo_link_var = link;
                                    SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var);
                                    SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject rt_link = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, rt_link)) {
                                                if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)) {
                                                    if (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var)) {
                                                        balanced_strategy_possibly_motivate_new_root_via_residual_transformation_link(strategy, rt_link, link);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if ($TRANSFORMATION == motivation) {
                if (NIL != inference_worker_transformation.transformation_link_p(link_head)) {
                    balanced_strategy_propagate_transformation_motivation_to_transformation_link(strategy, link_head);
                }
                if (NIL != inference_worker_split.split_tactic_p(link_head)) {
                    {
                        SubLObject split_tactic = link_head;
                        balanced_strategy_possibly_propagate_new_root_motivation_down_split_link(strategy, inference_worker_split.split_tactic_link(split_tactic));
                        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, inference_datastructures_tactic.tactic_problem(split_tactic))) {
                            balanced_strategy_possibly_reconsider_split_set_asides_wrt_removal(strategy, split_tactic);
                        }
                    }
                }
                if (NIL != inference_worker_union.union_tactic_p(link_head)) {
                    {
                        SubLObject union_tactic = link_head;
                        balanced_strategy_possibly_propagate_new_root_motivation_down_union_link(strategy, inference_worker_union.union_tactic_link(union_tactic));
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * When SPLIT-LINK's supported problem has N, then for each of SPLIT-LINK's supporting problems that has T,
     * N will propagate down to that supporting problem.
     * The link doesn't necessarily need to be open.
     * This is a generalization of 'transformation', in the sense that transformation means
     * 'try to find new roots'.  In this case, it's creating new new roots by propagating down split links
     * instead of by transformation.
     */
    public static final SubLObject balanced_strategy_possibly_propagate_new_root_motivation_down_split_link(SubLObject strategy, SubLObject split_link) {
        {
            SubLObject count = ZERO_INTEGER;
            if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_new_rootP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(split_link))) {
                {
                    SubLObject link_var = split_link;
                    SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    SubLObject supporting_mapped_problem = NIL;
                    for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            {
                                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                                if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_transformationP(strategy, supporting_problem)) {
                                    if (NIL != balanced_strategy_possibly_propagate_new_root_motivation_to_problem(strategy, supporting_problem)) {
                                        count = add(count, ONE_INTEGER);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return count;
        }
    }

    /**
     * When UNION-LINK's supported problem has N and UNION-LINK's supporting problem has T,
     * N will propagate down to the supporting problem.  The link doesn't necessarily need to be open.
     * This is a generalization of 'transformation', in the sense that transformation means
     * 'try to find new roots'.  In this case, each disjunct counts as a new root since it is independent
     * and solving it will yield a solution of the original problem.
     */
    public static final SubLObject balanced_strategy_possibly_propagate_new_root_motivation_down_union_link(SubLObject strategy, SubLObject union_link) {
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_new_rootP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(union_link))) {
            {
                SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(union_link);
                if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_transformationP(strategy, supporting_problem)) {
                    return balanced_strategy_possibly_propagate_new_root_motivation_to_problem(strategy, supporting_problem);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_propagate_transformation_motivation_to_transformation_link(SubLObject strategy, SubLObject t_link) {
        if (NIL != balanced_strategy_chooses_to_make_d_a_new_rootP(strategy, t_link)) {
            {
                SubLObject residual_problem = inference_worker_transformation.transformation_link_supporting_problem(t_link);
                return balanced_strategy_possibly_make_new_root(strategy, residual_problem);
            }
        } else {
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject cdolist_list_var = balanced_strategy_transformation_new_root_candidates(strategy, t_link);
                SubLObject new_root = NIL;
                for (new_root = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_root = cdolist_list_var.first()) {
                    if (NIL != balanced_strategy_possibly_make_new_root(strategy, new_root)) {
                        count = add(count, ONE_INTEGER);
                    }
                }
                return count;
            }
        }
    }

    public static final SubLObject balanced_strategy_transformation_new_root_candidates(SubLObject strategy, SubLObject t_link) {
        if (NIL != inference_tactician.transformation_link_leads_to_term_chosen_dead_endP(t_link)) {
            return inference_tactician.all_restricted_non_focals_around_transformation_link(t_link);
        } else {
            return balanced_strategy_residual_conjunction_new_root_candidates(strategy, t_link);
        }
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY chooses that 'D', rather than '(^ A D), should
    be a new root.  'D' is the supporting transformed problem of T-LINK, and '(^ A D) is
    a residual conjunction problem of some residual transformation argument link of D.
     */
    public static final SubLObject balanced_strategy_chooses_to_make_d_a_new_rootP(SubLObject strategy, SubLObject t_link) {
        return sublisp_null(balanced_strategy_residual_conjunction_new_root_candidates(strategy, t_link));
    }

    public static final SubLObject balanced_strategy_residual_conjunction_new_root_candidates(SubLObject strategy, SubLObject t_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_roots = NIL;
                if ((NIL == $balanced_strategy_self_expanding_rule_fix_enabledP$.getDynamicValue(thread)) || (NIL == assertion_utilities.self_expanding_ruleP(inference_worker_transformation.transformation_link_rule_assertion(t_link)))) {
                    {
                        SubLObject t_link_var = t_link;
                        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link_var);
                        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject jo_link_var = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, jo_link_var)) {
                                    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, $JOIN_ORDERED)) {
                                        {
                                            SubLObject jo_link_var_1 = jo_link_var;
                                            SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_1);
                                            SubLObject set_contents_var_2 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                                            SubLObject basis_object_3 = set_contents.do_set_contents_basis_object(set_contents_var_2);
                                            SubLObject state_4 = NIL;
                                            for (state_4 = set_contents.do_set_contents_initial_state(basis_object_3, set_contents_var_2); NIL == set_contents.do_set_contents_doneP(basis_object_3, state_4); state_4 = set_contents.do_set_contents_update_state(state_4)) {
                                                {
                                                    SubLObject rt_link = set_contents.do_set_contents_next(basis_object_3, state_4);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state_4, rt_link)) {
                                                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, $RESIDUAL_TRANSFORMATION)) {
                                                            if (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_1)) {
                                                                if (NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link_var)) {
                                                                    {
                                                                        SubLObject candidate_new_root = inference_worker_residual_transformation.residual_transformation_link_supporting_problem(rt_link);
                                                                        if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(candidate_new_root, strategy)) {
                                                                            {
                                                                                SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link);
                                                                                SubLObject jo_tactic = inference_worker_join_ordered.join_ordered_link_tactic(jo_link);
                                                                                if ((NIL == $balanced_strategy_new_roots_check_for_t_on_jo_linkP$.getDynamicValue(thread)) || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, jo_tactic))) {
                                                                                    new_roots = cons(candidate_new_root, new_roots);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(new_roots);
            }
        }
    }

    /**
     * When a new RT link is created, we need to check if we're already motivated to make a new root.
     * This can happen when the transformation link already exists and has T,
     * and a join-ordered link has just been opened, providing the impetus for RT-LINK's creation.
     */
    public static final SubLObject balanced_strategy_possibly_motivate_new_root_via_residual_transformation_link(SubLObject strategy, SubLObject rt_link, SubLObject jo_link) {
        if (jo_link == UNPROVIDED) {
            jo_link = NIL;
        }
        {
            SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
            if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, t_link)) {
                return balanced_strategy_propagate_transformation_motivation_to_transformation_link(strategy, t_link);
            }
        }
        return NIL;
    }

    /**
     * if you have T, and you have a supported* (via open logical links with T) problem with N,
     * you're allowed to note N on your supporting transformed problem.
     */
    public static final SubLObject balanced_strategy_allows_transformation_link_to_propagate_new_root_motivationP(SubLObject t_link, SubLObject strategy) {
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, t_link)) {
            {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
                return balanced_strategy_allows_problem_to_propagate_new_root_motivationP(supported_problem, strategy);
            }
        }
        return NIL;
    }

    /**
     * whether you have a supported* (via open logical links with T) problem with N
     */
    public static final SubLObject balanced_strategy_allows_problem_to_propagate_new_root_motivationP(SubLObject problem, SubLObject strategy) {
        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_new_rootP(strategy, problem)) {
            return T;
        }
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $LOGICAL)) {
                            if (NIL != balanced_strategy_link_motivates_problem_wrt_transformationP(strategy, link, problem)) {
                                {
                                    SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                                    if (NIL != balanced_strategy_allows_problem_to_propagate_new_root_motivationP(supported_problem, strategy)) {
                                        return T;
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

    public static final SubLObject balanced_strategy_link_motivates_problem_wrt_removalP(SubLObject strategy, SubLObject link, SubLObject problem) {
        if (problem == UNPROVIDED) {
            problem = NIL;
        }
        return balanced_strategy_link_motivates_problemP(strategy, link, $REMOVAL, problem);
    }

    public static final SubLObject balanced_strategy_link_motivates_problem_wrt_transformationP(SubLObject strategy, SubLObject link, SubLObject problem) {
        if (problem == UNPROVIDED) {
            problem = NIL;
        }
        return balanced_strategy_link_motivates_problemP(strategy, link, $TRANSFORMATION, problem);
    }

    /**
     *
     *
     * @return booleanp
     */
    public static final SubLObject balanced_strategy_link_motivates_problemP(SubLObject strategy, SubLObject link, SubLObject motivation, SubLObject problem) {
        if (problem == UNPROVIDED) {
            problem = NIL;
        }
        if (NIL == inference_worker_split.split_link_p(link)) {
            return balanced_strategy_link_motivates_lookahead_problemP(strategy, link, motivation);
        } else {
            {
                SubLObject motivatedP = NIL;
                SubLObject problem_var = problem;
                SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != motivatedP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject dependent_link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                            {
                                SubLObject link_var = dependent_link;
                                SubLObject rest = NIL;
                                for (rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); !((NIL != motivatedP) || (NIL == rest)); rest = rest.rest()) {
                                    {
                                        SubLObject mapped_problem = rest.first();
                                        if (NIL != inference_macros.do_problem_link_open_matchP(T, link_var, mapped_problem)) {
                                            if (problem_var == inference_datastructures_problem_link.mapped_problem_problem(mapped_problem)) {
                                                {
                                                    SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                                                    SubLObject rest_5 = NIL;
                                                    for (rest_5 = inference_datastructures_problem.problem_tactics(supported_problem); !((NIL != motivatedP) || (NIL == rest_5)); rest_5 = rest_5.rest()) {
                                                        {
                                                            SubLObject tactic = rest_5.first();
                                                            if (NIL != inference_worker_split.split_tactic_p(tactic)) {
                                                                {
                                                                    SubLObject supporting_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(tactic);
                                                                    if (mapped_problem == supporting_mapped_problem) {
                                                                        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivatedP(strategy, motivation, tactic)) {
                                                                            motivatedP = T;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return motivatedP;
            }
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    public static final SubLObject balanced_strategy_link_motivates_lookahead_problemP(SubLObject strategy, SubLObject link, SubLObject motivation) {
        if (NIL != inference_tactician.motivation_strategem_link_p(link)) {
            return inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivatedP(strategy, motivation, link);
        } else
            if (NIL != inference_worker_split.split_link_p(link)) {
                return NIL;
            } else
                if (NIL != inference_worker.logical_link_p(link)) {
                    {
                        SubLObject tactic = inference_worker.logical_link_unique_tactic(link);
                        return inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivatedP(strategy, motivation, tactic);
                    }
                } else {
                    return NIL;
                }


    }

    /**
     *
     *
     * @return booleanp
     */
    public static final SubLObject balanced_strategy_possibly_propagate_motivation_to_problem(SubLObject strategy, SubLObject motivation, SubLObject problem) {
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($NEW_ROOT)) {
                return balanced_strategy_possibly_propagate_new_root_motivation_to_problem(strategy, problem);
            } else
                if (pcase_var.eql($REMOVAL)) {
                    return balanced_strategy_possibly_propagate_removal_motivation_to_problem(strategy, problem);
                } else
                    if (pcase_var.eql($TRANSFORMATION)) {
                        return balanced_strategy_possibly_propagate_transformation_motivation_to_problem(strategy, problem);
                    } else {
                        return Errors.error($str_alt16$unexpected_motivation__s, motivation);
                    }


        }
    }

    /**
     *
     *
     * @return booleanp
     */
    public static final SubLObject balanced_strategy_possibly_make_new_root(SubLObject strategy, SubLObject problem) {
        return balanced_strategy_possibly_propagate_new_root_motivation_to_problem(strategy, problem);
    }

    /**
     *
     *
     * @return booleanp
     */
    public static final SubLObject balanced_strategy_possibly_propagate_new_root_motivation_to_problem(SubLObject strategy, SubLObject problem) {
        {
            SubLObject already_motivatedP = inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_new_rootP(strategy, problem);
            if (NIL == already_motivatedP) {
                balanced_strategy_propagate_new_root_motivation_to_problem(strategy, problem);
                return T;
            }
            return NIL;
        }
    }

    public static final SubLObject balanced_strategy_propagate_new_root_motivation_to_problem(SubLObject strategy, SubLObject problem) {
        inference_balanced_tactician_datastructures.balanced_strategy_note_problem_motivated_wrt_new_root(strategy, problem);
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject split_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, split_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $SPLIT)) {
                            balanced_strategy_possibly_propagate_new_root_motivation_down_split_link(strategy, split_link);
                        }
                    }
                }
            }
        }
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject union_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, union_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, $UNION)) {
                            balanced_strategy_possibly_propagate_new_root_motivation_down_union_link(strategy, union_link);
                        }
                    }
                }
            }
        }
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $JOIN_ORDERED)) {
                            if (NIL != balanced_strategy_early_removal_linkP(strategy, link)) {
                                {
                                    SubLObject link_var = link;
                                    SubLObject set_contents_var_6 = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                                    SubLObject basis_object_7 = set_contents.do_set_contents_basis_object(set_contents_var_6);
                                    SubLObject state_8 = NIL;
                                    for (state_8 = set_contents.do_set_contents_initial_state(basis_object_7, set_contents_var_6); NIL == set_contents.do_set_contents_doneP(basis_object_7, state_8); state_8 = set_contents.do_set_contents_update_state(state_8)) {
                                        {
                                            SubLObject restriction_link = set_contents.do_set_contents_next(basis_object_7, state_8);
                                            if (NIL != set_contents.do_set_contents_element_validP(state_8, restriction_link)) {
                                                if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                                                    if (NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var)) {
                                                        {
                                                            SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                                                            balanced_strategy_possibly_make_new_root(strategy, restricted_non_focal_problem);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            balanced_strategy_possibly_activate_problem_wrt_new_root(strategy, problem);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp
     */
    public static final SubLObject balanced_strategy_possibly_propagate_removal_motivation_to_problem(SubLObject strategy, SubLObject problem) {
        {
            SubLObject already_motivatedP = inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, problem);
            if (NIL == already_motivatedP) {
                balanced_strategy_propagate_removal_motivation_to_problem(strategy, problem);
                return T;
            }
            return NIL;
        }
    }

    public static final SubLObject balanced_strategy_propagate_removal_motivation_to_problem(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            inference_balanced_tactician_datastructures.balanced_strategy_note_problem_motivated_wrt_removal(strategy, problem);
            {
                SubLObject problem_var = problem;
                SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link)) {
                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
                                {
                                    SubLObject link_var = join_ordered_link;
                                    SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                                    SubLObject mapped_problem = NIL;
                                    for (mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapped_problem = cdolist_list_var.first()) {
                                        if (NIL != inference_macros.do_problem_link_open_matchP(T, link_var, mapped_problem)) {
                                            if (problem_var == inference_datastructures_problem_link.mapped_problem_problem(mapped_problem)) {
                                                if (NIL != balanced_strategy_link_motivates_problem_wrt_removalP(strategy, join_ordered_link, problem)) {
                                                    {
                                                        SubLObject status_var = $PROVEN;
                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem));
                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                SubLObject proof_list = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject cdolist_list_var_9 = proof_list;
                                                                    SubLObject proof = NIL;
                                                                    for (proof = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , proof = cdolist_list_var_9.first()) {
                                                                        if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                                                                            {
                                                                                SubLObject restricted_non_focal_mapped_problem = inference_worker_join_ordered.find_split_restriction(join_ordered_link, proof);
                                                                                SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_non_focal_mapped_problem);
                                                                                balanced_strategy_possibly_propagate_removal_motivation_to_problem(strategy, restricted_non_focal_problem);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                            }
                                                        } 
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject transformation_link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, transformation_link)) {
                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
                                if (NIL != balanced_strategy_allows_transformation_link_to_propagate_new_root_motivationP(transformation_link, strategy)) {
                                    {
                                        SubLObject supporting_transformed_problem = inference_worker_transformation.transformation_link_supporting_problem(transformation_link);
                                        balanced_strategy_possibly_make_new_root(strategy, supporting_transformed_problem);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
                balanced_strategy_possibly_activate_problem_wrt_removal(strategy, problem);
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    public static final SubLObject balanced_strategy_possibly_propagate_transformation_motivation_to_problem(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
                    Errors.error($str_alt20$_s_tried_to_propagate_T_to__s_but, strategy, problem);
                }
            }
            {
                SubLObject already_motivatedP = inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_transformationP(strategy, problem);
                if (NIL == already_motivatedP) {
                    balanced_strategy_propagate_transformation_motivation_to_problem(strategy, problem);
                    return T;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject balanced_strategy_propagate_transformation_motivation_to_problem(SubLObject strategy, SubLObject problem) {
        inference_balanced_tactician_datastructures.balanced_strategy_note_problem_motivated_wrt_transformation(strategy, problem);
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $JOIN_ORDERED)) {
                            if (NIL != balanced_strategy_early_removal_linkP(strategy, link)) {
                                {
                                    SubLObject link_var = link;
                                    SubLObject set_contents_var_10 = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var));
                                    SubLObject basis_object_11 = set_contents.do_set_contents_basis_object(set_contents_var_10);
                                    SubLObject state_12 = NIL;
                                    for (state_12 = set_contents.do_set_contents_initial_state(basis_object_11, set_contents_var_10); NIL == set_contents.do_set_contents_doneP(basis_object_11, state_12); state_12 = set_contents.do_set_contents_update_state(state_12)) {
                                        {
                                            SubLObject restriction_link = set_contents.do_set_contents_next(basis_object_11, state_12);
                                            if (NIL != set_contents.do_set_contents_element_validP(state_12, restriction_link)) {
                                                if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                                                    if (NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var)) {
                                                        {
                                                            SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                                                            balanced_strategy_possibly_make_new_root(strategy, restricted_non_focal_problem);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            balanced_strategy_possibly_activate_problem_wrt_transformation(strategy, problem);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY chose to activate PROBLEM.
     */
    public static final SubLObject balanced_strategy_possibly_activate_problem(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != balanced_strategy_chooses_not_to_examine_problemP(strategy, problem)) {
                return NIL;
            }
            inference_worker.determine_strategic_status_wrt(problem, strategy);
            if (NIL != balanced_strategy_chooses_not_to_activate_problemP(strategy, problem)) {
                return NIL;
            }
            if (NIL != inference_worker_restriction.problem_is_a_simplificationP(problem)) {
                balanced_strategy_possibly_propagate_removal_motivation_to_problem(strategy, problem);
                if (NIL == inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
                    if (NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread)) {
                        balanced_strategy_possibly_propagate_transformation_motivation_to_problem(strategy, problem);
                    }
                }
            }
            if (NIL != balanced_strategy_problem_is_the_rest_of_a_removalP(problem, strategy)) {
                balanced_strategy_possibly_propagate_removal_motivation_to_problem(strategy, problem);
            }
            if (NIL != balanced_strategy_motivates_problem_via_rewriteP(strategy, problem)) {
                balanced_strategy_possibly_propagate_removal_motivation_to_problem(strategy, problem);
            }
            if (NIL != balanced_strategy_problem_is_the_rest_of_a_join_orderedP(problem, strategy)) {
                balanced_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(strategy, problem);
            }
            if (NIL == inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
                if (NIL != balanced_strategy_problem_is_the_rest_of_an_early_removalP(problem, strategy)) {
                    balanced_strategy_possibly_propagate_new_root_motivation_to_problem(strategy, problem);
                }
            }
            {
                SubLObject activatedP = NIL;
                if (NIL != balanced_strategy_possibly_activate_problem_wrt_new_root(strategy, problem)) {
                    activatedP = T;
                }
                if (NIL != balanced_strategy_possibly_activate_problem_wrt_removal(strategy, problem)) {
                    activatedP = T;
                }
                if (NIL != balanced_strategy_possibly_activate_problem_wrt_transformation(strategy, problem)) {
                    activatedP = T;
                }
                return activatedP;
            }
        }
    }

    public static final class $balanced_strategy_possibly_activate_problem$BinaryFunction extends BinaryFunction {
        public $balanced_strategy_possibly_activate_problem$BinaryFunction() {
            super(extractFunctionNamed("BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM"));
        }

        @Override
	public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return balanced_strategy_possibly_activate_problem(arg1, arg2);
        }
    }

    /**
     * if you are a restricted non-focal problem of some (open?) join-ordered link which has R,
     * you get R.  you're the rest of a removal.
     */
    public static final SubLObject balanced_strategy_problem_is_the_rest_of_a_removalP(SubLObject problem, SubLObject strategy) {
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                            {
                                SubLObject non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                                SubLObject set_contents_var_13 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                                SubLObject basis_object_14 = set_contents.do_set_contents_basis_object(set_contents_var_13);
                                SubLObject state_15 = NIL;
                                for (state_15 = set_contents.do_set_contents_initial_state(basis_object_14, set_contents_var_13); NIL == set_contents.do_set_contents_doneP(basis_object_14, state_15); state_15 = set_contents.do_set_contents_update_state(state_15)) {
                                    {
                                        SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object_14, state_15);
                                        if (NIL != set_contents.do_set_contents_element_validP(state_15, join_ordered_link)) {
                                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
                                                if (NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link)) {
                                                    if (non_focal_problem == inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link)) {
                                                        if ((NIL != inference_datastructures_problem_link.problem_link_openP(join_ordered_link)) && (NIL != balanced_strategy_link_motivates_lookahead_problemP(strategy, join_ordered_link, $REMOVAL))) {
                                                            return T;
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
     * if you are a restricted non-focal problem of some early removal link,
     * you get N.  you're the rest of an early removal.
     */
    public static final SubLObject balanced_strategy_problem_is_the_rest_of_an_early_removalP(SubLObject problem, SubLObject strategy) {
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                            {
                                SubLObject non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                                SubLObject set_contents_var_16 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                                SubLObject basis_object_17 = set_contents.do_set_contents_basis_object(set_contents_var_16);
                                SubLObject state_18 = NIL;
                                for (state_18 = set_contents.do_set_contents_initial_state(basis_object_17, set_contents_var_16); NIL == set_contents.do_set_contents_doneP(basis_object_17, state_18); state_18 = set_contents.do_set_contents_update_state(state_18)) {
                                    {
                                        SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object_17, state_18);
                                        if (NIL != set_contents.do_set_contents_element_validP(state_18, join_ordered_link)) {
                                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
                                                if (NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link)) {
                                                    if (non_focal_problem == inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link)) {
                                                        if (NIL != balanced_strategy_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(strategy, problem, join_ordered_link)) {
                                                            return T;
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static final SubLObject balanced_strategy_problem_is_the_rest_of_a_join_orderedP(SubLObject problem, SubLObject strategy) {
        {
            SubLObject part_of_join_orderedP = NIL;
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != part_of_join_orderedP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                            {
                                SubLObject non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                                SubLObject set_contents_var_19 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                                SubLObject basis_object_20 = set_contents.do_set_contents_basis_object(set_contents_var_19);
                                SubLObject state_21 = NIL;
                                for (state_21 = set_contents.do_set_contents_initial_state(basis_object_20, set_contents_var_19); !((NIL != part_of_join_orderedP) || (NIL != set_contents.do_set_contents_doneP(basis_object_20, state_21))); state_21 = set_contents.do_set_contents_update_state(state_21)) {
                                    {
                                        SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object_20, state_21);
                                        if (NIL != set_contents.do_set_contents_element_validP(state_21, join_ordered_link)) {
                                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
                                                if (NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link)) {
                                                    if (non_focal_problem == inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link)) {
                                                        part_of_join_orderedP = T;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return part_of_join_orderedP;
        }
    }

    public static final SubLObject balanced_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(SubLObject strategy, SubLObject problem) {
        return NIL;
    }

    public static final SubLObject balanced_strategy_problem_motivated_without_join_ordered_wrt_removalP(SubLObject strategy, SubLObject problem) {
        if (NIL != balanced_strategy_problem_is_the_rest_of_a_removalP(problem, strategy)) {
            return T;
        }
        {
            SubLObject problem_var = problem;
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                        {
                            SubLObject link_var = link;
                            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                            SubLObject mapped_problem = NIL;
                            for (mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapped_problem = cdolist_list_var.first()) {
                                if (NIL != inference_macros.do_problem_link_open_matchP(T, link_var, mapped_problem)) {
                                    if (problem_var == inference_datastructures_problem_link.mapped_problem_problem(mapped_problem)) {
                                        if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                                        } else
                                            if (NIL != inference_worker.logical_link_p(link)) {
                                                {
                                                    SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                                                    if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, supported_problem)) {
                                                        return T;
                                                    }
                                                }
                                            } else
                                                if (NIL != inference_worker_transformation.transformation_link_p(link)) {
                                                    if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, link)) {
                                                        {
                                                            SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                                                            if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, supported_problem)) {
                                                                return T;
                                                            }
                                                        }
                                                    }
                                                } else
                                                    if (NIL != inference_worker_answer.answer_link_p(link)) {
                                                        if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivatedP(strategy, $REMOVAL, link)) {
                                                            return T;
                                                        }
                                                    }



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
     * When deciding whether a problem is motivated via residual transformation, if
     * the rule used on the transformation link is a self expanding rule and this fix is
     * enabled, prevents the motivation from flowing.
     */
    // defparameter
    private static final SubLSymbol $balanced_strategy_self_expanding_rule_fix_enabledP$ = makeSymbol("*BALANCED-STRATEGY-SELF-EXPANDING-RULE-FIX-ENABLED?*");

    /**
     * if you are a supporting rewritten problem of a rewrite link whose supported problem has R,
     * you get R.
     */
    public static final SubLObject balanced_strategy_motivates_problem_via_rewriteP(SubLObject strategy, SubLObject problem) {
        if (NIL != inference_datastructures_problem_store.problem_store_rewrite_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy))) {
            {
                SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $REWRITE)) {
                                if (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link))) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP(SubLObject strategy, SubLObject problem, SubLObject join_ordered_link) {
        if (NIL != balanced_strategy_treats_restricted_non_focal_as_new_rootP(strategy, join_ordered_link)) {
            return T;
        } else
            if (NIL != balanced_strategy_early_removal_linkP(strategy, join_ordered_link)) {
                return T;
            } else {
                return NIL;
            }

    }

    public static final SubLObject balanced_strategy_treats_restricted_non_focal_as_new_rootP(SubLObject strategy, SubLObject join_ordered_link) {
        return makeBoolean((NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_unbound_predicateP(join_ordered_link)) || (NIL != inference_worker_join_ordered.join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP(join_ordered_link)));
    }

    public static final SubLObject balanced_strategy_chooses_not_to_examine_problemP(SubLObject strategy, SubLObject problem) {
        return inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem);
    }

    public static final SubLObject balanced_strategy_chooses_not_to_activate_problemP(SubLObject strategy, SubLObject problem) {
        return makeBoolean(((NIL != balanced_strategy_chooses_not_to_activate_problem_wrt_new_rootP(strategy, problem)) && (NIL != balanced_strategy_chooses_not_to_activate_problem_wrt_removalP(strategy, problem))) && (NIL != balanced_strategy_chooses_not_to_activate_problem_wrt_transformationP(strategy, problem)));
    }

    public static final SubLObject balanced_strategy_chooses_not_to_activate_problem_wrt_new_rootP(SubLObject strategy, SubLObject problem) {
        return makeBoolean((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $NEW_ROOT)) || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_pendingP(strategy, problem, $NEW_ROOT)));
    }

    public static final SubLObject balanced_strategy_chooses_not_to_activate_problem_wrt_removalP(SubLObject strategy, SubLObject problem) {
        return makeBoolean((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $REMOVAL)) || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_pendingP(strategy, problem, $REMOVAL)));
    }

    public static final SubLObject balanced_strategy_chooses_not_to_activate_problem_wrt_transformationP(SubLObject strategy, SubLObject problem) {
        return makeBoolean((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $TRANSFORMATION)) || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_pendingP(strategy, problem, $TRANSFORMATION)));
    }

    public static final SubLObject balanced_strategy_possibly_activate_problem_wrt_new_root(SubLObject strategy, SubLObject problem) {
        {
            SubLObject activateP = makeBoolean((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_new_rootP(strategy, problem)) && (NIL == balanced_strategy_chooses_not_to_activate_problem_wrt_new_rootP(strategy, problem)));
            if (NIL != activateP) {
                if (NIL != balanced_strategy_activate_problem_wrt_new_root(strategy, problem)) {
                    return T;
                } else {
                    balanced_strategy_make_problem_pending(strategy, problem, $NEW_ROOT);
                    return NIL;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_possibly_activate_problem_wrt_removal(SubLObject strategy, SubLObject problem) {
        {
            SubLObject activateP = makeBoolean((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, problem)) && (NIL == balanced_strategy_chooses_not_to_activate_problem_wrt_removalP(strategy, problem)));
            if (NIL != activateP) {
                if (NIL != balanced_strategy_activate_problem_wrt_removal(strategy, problem)) {
                    return T;
                } else {
                    balanced_strategy_make_problem_pending(strategy, problem, $REMOVAL);
                    return NIL;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_possibly_activate_problem_wrt_transformation(SubLObject strategy, SubLObject problem) {
        {
            SubLObject activateP = makeBoolean((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_transformationP(strategy, problem)) && (NIL == balanced_strategy_chooses_not_to_activate_problem_wrt_transformationP(strategy, problem)));
            if (NIL != activateP) {
                if (NIL != balanced_strategy_activate_problem_wrt_transformation(strategy, problem)) {
                    return T;
                } else {
                    balanced_strategy_make_problem_pending(strategy, problem, $TRANSFORMATION);
                    return NIL;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_activate_problem_wrt_new_root(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return plusp(balanced_strategy_possibly_activate_strategems_wrt_new_root(strategy, problem));
    }

    public static final SubLObject balanced_strategy_activate_problem_wrt_removal(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return plusp(balanced_strategy_possibly_activate_strategems_wrt_removal(strategy, problem));
    }

    /**
     * add all transformation strategems to the R-box or set-asides.
     *
     * @return booleanp; T unless STRATEGY chooses to throw away PROBLEM.
     */
    public static final SubLObject balanced_strategy_activate_problem_wrt_transformation(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return plusp(balanced_strategy_possibly_activate_strategems_wrt_transformation(strategy, problem));
    }

    public static final SubLObject balanced_strategy_possibly_activate_strategems_wrt_new_root(SubLObject strategy, SubLObject problem) {
        inference_balanced_tactician_datastructures.balanced_strategy_add_new_root(strategy, problem);
        return TWO_INTEGER;
    }

    public static final SubLObject balanced_strategy_possibly_activate_strategems_wrt_removal(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject strategems_to_activate = balanced_strategy_categorize_strategems_wrt_removal(strategy, problem);
                SubLObject strategems_to_set_aside = thread.secondMultipleValue();
                SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != reinforcement_learning_tactician.reinforcement_learning_tactician_enabledP()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject rlt_strategems_to_activate = reinforcement_learning_tactician.reinforcement_learning_tactician_categorize_strategems_wrt_removal(strategy, strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
                        SubLObject rlt_strategems_to_set_aside = thread.secondMultipleValue();
                        SubLObject rlt_strategems_to_throw_away = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject strategems_to_activate_22 = merge_balanced_and_rl_tactician_strategems(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away, rlt_strategems_to_activate, rlt_strategems_to_set_aside, rlt_strategems_to_throw_away);
                            SubLObject strategems_to_set_aside_23 = thread.secondMultipleValue();
                            SubLObject strategems_to_throw_away_24 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            strategems_to_activate = strategems_to_activate_22;
                            strategems_to_set_aside = strategems_to_set_aside_23;
                            strategems_to_throw_away = strategems_to_throw_away_24;
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = strategems_to_activate;
                    SubLObject strategem = NIL;
                    for (strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strategem = cdolist_list_var.first()) {
                        inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_removal(strategy, strategem);
                    }
                }
                {
                    SubLObject cdolist_list_var = strategems_to_set_aside;
                    SubLObject strategem = NIL;
                    for (strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strategem = cdolist_list_var.first()) {
                        inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_set_aside_wrt_removal(strategy, strategem);
                        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
			    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_set_aside_wrt(strategem, strategy, $REMOVAL);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = strategems_to_throw_away;
                    SubLObject strategem = NIL;
                    for (strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strategem = cdolist_list_var.first()) {
                        inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_thrown_away_wrt_removal(strategy, strategem);
                        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
			    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_thrown_away_wrt(strategem, strategy, $REMOVAL);
                        }
                    }
                }
                return length(strategems_to_activate);
            }
        }
    }

    /**
     * The tactic types to use the RL tactician's ordering for.
     */
    // defparameter
    private static final SubLSymbol $balanced_strategy_rl_tactician_tactic_types$ = makeSymbol("*BALANCED-STRATEGY-RL-TACTICIAN-TACTIC-TYPES*");

    /**
     * BT = balanced tactician, RLT = reinforcement learning tactician
     */
    public static final SubLObject merge_balanced_and_rl_tactician_strategems(SubLObject bt_strategems_to_activate, SubLObject bt_strategems_to_set_aside, SubLObject bt_strategems_to_throw_away, SubLObject rlt_strategems_to_activate, SubLObject rlt_strategems_to_set_aside, SubLObject rlt_strategems_to_throw_away) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strategems_to_activate = NIL;
                SubLObject strategems_to_set_aside = NIL;
                SubLObject strategems_to_throw_away = NIL;
                if ($balanced_strategy_rl_tactician_tactic_types$.getDynamicValue(thread).equal($list_alt23)) {
                    strategems_to_activate = rlt_strategems_to_activate;
                    strategems_to_set_aside = rlt_strategems_to_set_aside;
                    strategems_to_throw_away = rlt_strategems_to_throw_away;
                } else
                    if (NIL == $balanced_strategy_rl_tactician_tactic_types$.getDynamicValue(thread)) {
                        strategems_to_activate = bt_strategems_to_activate;
                        strategems_to_set_aside = bt_strategems_to_set_aside;
                        strategems_to_throw_away = bt_strategems_to_throw_away;
                    } else {
                        strategems_to_activate = balanced_strategy_filter_strategems_by_rlt_tactic_types(bt_strategems_to_activate, rlt_strategems_to_activate);
                        strategems_to_set_aside = balanced_strategy_filter_strategems_by_rlt_tactic_types(bt_strategems_to_set_aside, rlt_strategems_to_set_aside);
                        strategems_to_throw_away = balanced_strategy_filter_strategems_by_rlt_tactic_types(bt_strategems_to_throw_away, rlt_strategems_to_throw_away);
                    }

                return values(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
            }
        }
    }

    /**
     * If there are multiple tactic types being filtered, for example conjunctive removal and connected conjunction,
     * and the RL tactician only applies to one of those types, then the balanced tactician's types will come first.
     */
    public static final SubLObject balanced_strategy_filter_strategems_by_rlt_tactic_types(SubLObject bt_strategems, SubLObject rlt_strategems) {
        if (bt_strategems.equal(rlt_strategems)) {
            return bt_strategems;
        } else {
            return balanced_strategy_filter_strategems_by_rlt_tactic_types_int(bt_strategems, rlt_strategems);
        }
    }

    public static final SubLObject balanced_strategy_filter_strategems_by_rlt_tactic_types_int(SubLObject bt_strategems, SubLObject rlt_strategems) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strategems = NIL;
                {
                    SubLObject cdolist_list_var = bt_strategems;
                    SubLObject bt_strategem = NIL;
                    for (bt_strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bt_strategem = cdolist_list_var.first()) {
                        if (NIL == inference_datastructures_problem.tactic_matches_any_of_type_specsP(bt_strategem, $balanced_strategy_rl_tactician_tactic_types$.getDynamicValue(thread))) {
                            strategems = cons(bt_strategem, strategems);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = rlt_strategems;
                    SubLObject rlt_strategem = NIL;
                    for (rlt_strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rlt_strategem = cdolist_list_var.first()) {
                        if (NIL != inference_datastructures_problem.tactic_matches_any_of_type_specsP(rlt_strategem, $balanced_strategy_rl_tactician_tactic_types$.getDynamicValue(thread))) {
                            strategems = cons(rlt_strategem, strategems);
                        }
                    }
                }
                return nreverse(strategems);
            }
        }
    }

    public static final SubLObject balanced_strategy_possibly_activate_strategems_wrt_transformation(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject strategems_to_activate = balanced_strategy_categorize_strategems_wrt_transformation(strategy, problem);
                SubLObject strategems_to_set_aside = thread.secondMultipleValue();
                SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject cdolist_list_var = strategems_to_activate;
                    SubLObject strategem = NIL;
                    for (strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strategem = cdolist_list_var.first()) {
                        inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_transformation(strategy, strategem);
                    }
                }
                {
                    SubLObject cdolist_list_var = strategems_to_set_aside;
                    SubLObject strategem = NIL;
                    for (strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strategem = cdolist_list_var.first()) {
                        inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_set_aside_wrt_transformation(strategy, strategem);
                        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
			    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_set_aside_wrt(strategem, strategy, $TRANSFORMATION);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = strategems_to_throw_away;
                    SubLObject strategem = NIL;
                    for (strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strategem = cdolist_list_var.first()) {
                        inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_thrown_away_wrt_transformation(strategy, strategem);
                        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
			    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_thrown_away_wrt(strategem, strategy, $TRANSFORMATION);
                        }
                    }
                }
                return length(strategems_to_activate);
            }
        }
    }

    public static final SubLObject balanced_strategy_activate_transformation_argument_links_wrt_transformation(SubLObject strategy, SubLObject problem) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject transformation_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, transformation_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
                            {
                                SubLObject supporting_transformed_problem = inference_worker_transformation.transformation_link_supporting_problem(transformation_link);
                                if ((NIL != supporting_transformed_problem) && (NIL == inference_datastructures_problem.problem_relevant_to_inferenceP(supporting_transformed_problem, inference_datastructures_strategy.strategy_inference(strategy)))) {
                                    inference_datastructures_inference.add_inference_relevant_problem(inference_datastructures_strategy.strategy_inference(strategy), supporting_transformed_problem);
                                    inference_worker.possibly_activate_problem(strategy, supporting_transformed_problem);
                                }
                            }
                            balanced_strategy_possibly_activate_transformation_link(strategy, transformation_link);
                            count = add(count, ONE_INTEGER);
                        }
                    }
                }
            }
            return count;
        }
    }

    public static final SubLObject balanced_strategy_note_argument_link_added(SubLObject strategy, SubLObject link) {
        if (NIL != inference_worker_transformation.transformation_link_p(link)) {
            balanced_strategy_possibly_activate_transformation_link(strategy, link);
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_possibly_activate_transformation_link(SubLObject strategy, SubLObject transformation_link) {
        if (NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link)) {
            if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, transformation_link)) {
                balanced_strategy_activate_transformation_link(strategy, transformation_link);
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_activate_transformation_link(SubLObject strategy, SubLObject transformation_link) {
        inference_balanced_tactician_datastructures.balanced_strategy_note_problem_unpending_wrt_transformation(strategy, inference_datastructures_problem_link.problem_link_supported_problem(transformation_link));
        {
            SubLObject transformation_tactic = inference_worker_transformation.transformation_link_tactic(transformation_link);
            if (NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic, $TRANSFORMATION, UNPROVIDED, UNPROVIDED)) {
                if (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic, $TRANSFORMATION, NIL, NIL, T)) {
                    inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_set_aside_wrt_transformation(strategy, transformation_link);
                } else {
                    inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_transformation(strategy, transformation_link);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_note_new_tactic(SubLObject strategy, SubLObject tactic) {
        inference_worker.default_compute_strategic_properties_of_tactic(strategy, tactic);
        if (!(((NIL != inference_worker_split.split_tactic_p(tactic)) && (NIL != inference_worker_split.meta_split_tactics_enabledP())) || (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategy, tactic)))) {
            balanced_strategy_note_new_tactic_possible(strategy, tactic);
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_note_split_tactics_strategically_possible(SubLObject strategy, SubLObject split_tactics) {
        {
            SubLObject sorted_split_tactics = inference_tactician.strategy_sort(strategy, copy_list(split_tactics), $sym25$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
            SubLObject cdolist_list_var = reverse(sorted_split_tactics);
            SubLObject split_tactic = NIL;
            for (split_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , split_tactic = cdolist_list_var.first()) {
                balanced_strategy_note_new_tactic_possible(strategy, split_tactic);
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_note_new_tactic_possible(SubLObject strategy, SubLObject tactic) {
        {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            inference_datastructures_strategy.problem_note_tactic_strategically_possible(problem, tactic, strategy);
        }
        if (((NIL != inference_worker_split.meta_split_tactics_enabledP()) && (NIL != inference_worker_split.split_tactic_p(tactic))) || ((NIL != inference_worker_transformation.transformation_tactic_p(tactic)) && (NIL == inference_worker_transformation.meta_transformation_tactic_p(tactic)))) {
            {
                SubLObject problem_already_consideredP = T;
                SubLObject cdolist_list_var = (NIL != inference_worker_split.split_tactic_p(tactic)) ? ((SubLObject) ($list_alt27)) : $list_alt28;
                SubLObject motivation = NIL;
                for (motivation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , motivation = cdolist_list_var.first()) {
                    inference_balanced_tactician_datastructures.balanced_strategy_note_problem_unpending(strategy, inference_datastructures_tactic.tactic_problem(tactic), motivation);
                    if (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, tactic, motivation, problem_already_consideredP, NIL)) {
                        inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_thrown_away(strategy, tactic, motivation);
                    } else
                        if (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, tactic, motivation, problem_already_consideredP, NIL, T)) {
                            inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_set_aside(strategy, tactic, motivation);
                        } else {
                            inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem(strategy, tactic, motivation);
                        }

                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return 0 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to activate  wrt MOTIVATION.
     * @return 1 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to set aside wrt MOTIVATION.
    Strategems are ordered in intended order of activation.
     */
    public static final SubLObject balanced_strategy_categorize_strategems(SubLObject strategy, SubLObject problem, SubLObject motivation) {
        SubLTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($NEW_ROOT)) {
                Errors.error($str_alt30$time_to_categorize_strategems_wrt);
            } else
                if (pcase_var.eql($REMOVAL)) {
                    return balanced_strategy_categorize_strategems_wrt_removal(strategy, problem);
                } else
                    if (pcase_var.eql($TRANSFORMATION)) {
                        return balanced_strategy_categorize_strategems_wrt_transformation(strategy, problem);
                    }


        }
        return NIL;
    }

    /**
     *
     *
     * @return 0 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to activate wrt removal.
    Strategems are ordered in intended order of activation.
     * @return 1 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to set aside wrt removal.
     * @return 2 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to throw away wrt removal.
     */
    public static final SubLObject balanced_strategy_categorize_strategems_wrt_removal(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strategems_to_activate = NIL;
                SubLObject strategems_to_set_aside = NIL;
                SubLObject strategems_to_throw_away = NIL;
                SubLObject problem_set_aside_wrt_removalP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, $REMOVAL, UNPROVIDED, UNPROVIDED);
                SubLObject problem_thrown_away_wrt_removalP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, $REMOVAL, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject best_complete_removal_tactic = balanced_strategy_categorize_removal_tactics_wrt_removal(strategy, problem, problem_set_aside_wrt_removalP, problem_thrown_away_wrt_removalP);
                    SubLObject possible_non_complete_removal_tactics = thread.secondMultipleValue();
                    SubLObject set_aside_removal_tactics = thread.thirdMultipleValue();
                    SubLObject thrown_away_removal_tactics = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject possible_motivation_strategems = balanced_strategy_categorize_motivation_strategems_wrt_removal(strategy, problem, problem_set_aside_wrt_removalP, problem_thrown_away_wrt_removalP);
                        SubLObject set_aside_motivation_strategems = thread.secondMultipleValue();
                        SubLObject thrown_away_motivation_strategems = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        strategems_to_set_aside = append(set_aside_removal_tactics, set_aside_motivation_strategems);
                        strategems_to_throw_away = append(thrown_away_removal_tactics, thrown_away_motivation_strategems);
                        possible_non_complete_removal_tactics = nreverse(possible_non_complete_removal_tactics);
                        possible_motivation_strategems = nreverse(possible_motivation_strategems);
                        {
                            SubLObject cdolist_list_var = possible_motivation_strategems;
                            SubLObject logical_tactic = NIL;
                            for (logical_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , logical_tactic = cdolist_list_var.first()) {
                                strategems_to_activate = cons(logical_tactic, strategems_to_activate);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = possible_non_complete_removal_tactics;
                            SubLObject removal_tactic = NIL;
                            for (removal_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , removal_tactic = cdolist_list_var.first()) {
                                strategems_to_activate = cons(removal_tactic, strategems_to_activate);
                            }
                        }
                        if (NIL != best_complete_removal_tactic) {
                            strategems_to_activate = cons(best_complete_removal_tactic, strategems_to_activate);
                        }
                        {
                            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                            SubLObject meta_structural_tactic = NIL;
                            for (meta_structural_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_structural_tactic = cdolist_list_var.first()) {
                                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(meta_structural_tactic, $META_STRUCTURAL)) {
                                    strategems_to_activate = cons(meta_structural_tactic, strategems_to_activate);
                                }
                            }
                        }
                        strategems_to_activate = nreverse(strategems_to_activate);
                    }
                }
                return values(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
            }
        }
    }

    public static final SubLObject balanced_strategy_categorize_motivation_strategems_wrt_removal(SubLObject strategy, SubLObject problem, SubLObject problem_set_aside_wrt_removalP, SubLObject problem_thrown_away_wrt_removalP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject possible_motivation_strategems = NIL;
                SubLObject set_aside_motivation_strategems = NIL;
                SubLObject thrown_away_motivation_strategems = NIL;
                if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                } else
                    if (NIL != inference_datastructures_problem.multi_clause_problem_p(problem)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject possible_motivation_strategems_25 = balanced_strategy_categorize_disjunctive_tactics_wrt_removal(strategy, problem, problem_set_aside_wrt_removalP, problem_thrown_away_wrt_removalP);
                            SubLObject set_aside_motivation_strategems_26 = thread.secondMultipleValue();
                            SubLObject thrown_away_motivation_strategems_27 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            possible_motivation_strategems = possible_motivation_strategems_25;
                            set_aside_motivation_strategems = set_aside_motivation_strategems_26;
                            thrown_away_motivation_strategems = thrown_away_motivation_strategems_27;
                        }
                    } else
                        if (NIL != inference_datastructures_problem.problem_has_split_tacticsP(problem)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject possible_motivation_strategems_28 = balanced_strategy_categorize_split_tactics_wrt_removal(strategy, problem, problem_set_aside_wrt_removalP, problem_thrown_away_wrt_removalP);
                                SubLObject set_aside_motivation_strategems_29 = thread.secondMultipleValue();
                                SubLObject thrown_away_motivation_strategems_30 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                possible_motivation_strategems = possible_motivation_strategems_28;
                                set_aside_motivation_strategems = set_aside_motivation_strategems_29;
                                thrown_away_motivation_strategems = thrown_away_motivation_strategems_30;
                            }
                        } else {
                            thread.resetMultipleValues();
                            {
                                SubLObject possible_motivation_strategems_31 = balanced_strategy_categorize_connected_conjunction_tactics_wrt_removal(strategy, problem, problem_set_aside_wrt_removalP, problem_thrown_away_wrt_removalP);
                                SubLObject set_aside_motivation_strategems_32 = thread.secondMultipleValue();
                                SubLObject thrown_away_motivation_strategems_33 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                possible_motivation_strategems = possible_motivation_strategems_31;
                                set_aside_motivation_strategems = set_aside_motivation_strategems_32;
                                thrown_away_motivation_strategems = thrown_away_motivation_strategems_33;
                            }
                        }


                return values(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
            }
        }
    }

    /**
     * Possible non-complete removal tactics should be in the reverse intended activation order
     */
    public static final SubLObject balanced_strategy_categorize_removal_tactics_wrt_removal(SubLObject strategy, SubLObject problem, SubLObject problem_set_aside_wrt_removalP, SubLObject problem_thrown_away_wrt_removalP) {
        {
            SubLObject best_complete_removal_tactic = NIL;
            SubLObject best_complete_removal_tactic_productivity = NIL;
            SubLObject set_aside_removal_tactics = NIL;
            SubLObject possible_non_complete_removal_tactics = NIL;
            if (NIL == problem_thrown_away_wrt_removalP) {
                {
                    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                    SubLObject removal_tactic = NIL;
                    for (removal_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , removal_tactic = cdolist_list_var.first()) {
                        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $GENERALIZED_REMOVAL_OR_REWRITE)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $POSSIBLE))) {
                            if (NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, removal_tactic, $REMOVAL, T, UNPROVIDED)) {
                                if ((NIL != problem_set_aside_wrt_removalP) || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, removal_tactic, $REMOVAL, T, UNPROVIDED, UNPROVIDED))) {
                                    if (NIL == best_complete_removal_tactic) {
                                        set_aside_removal_tactics = cons(removal_tactic, set_aside_removal_tactics);
                                    }
                                } else {
                                    {
                                        SubLObject completeness = inference_datastructures_strategy.tactic_strategic_completeness(removal_tactic, strategy);
                                        SubLObject pcase_var = completeness;
                                        if (pcase_var.eql($COMPLETE)) {
                                            {
                                                SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(removal_tactic, strategy);
                                                if ((NIL == best_complete_removal_tactic) || (NIL != inference_datastructures_enumerated_types.productivity_L(productivity, best_complete_removal_tactic_productivity))) {
                                                    best_complete_removal_tactic = removal_tactic;
                                                    best_complete_removal_tactic_productivity = productivity;
                                                    if (NIL == inference_worker_removal.meta_removal_tactic_p(best_complete_removal_tactic)) {
                                                        possible_non_complete_removal_tactics = NIL;
                                                        set_aside_removal_tactics = NIL;
                                                    }
                                                }
                                            }
                                        } else
                                            if (pcase_var.eql($INCOMPLETE) || pcase_var.eql($GROSSLY_INCOMPLETE)) {
                                                if ((NIL == best_complete_removal_tactic) || (NIL != inference_worker_removal.meta_removal_tactic_p(best_complete_removal_tactic))) {
                                                    possible_non_complete_removal_tactics = cons(removal_tactic, possible_non_complete_removal_tactics);
                                                }
                                            }

                                    }
                                }
                            }
                        }
                    }
                }
                possible_non_complete_removal_tactics = inference_tactician.strategy_sort(strategy, possible_non_complete_removal_tactics, $sym37$TACTIC_STRATEGIC_PRODUCTIVITY__);
            }
            {
                SubLObject thrown_away_removal_tactics = NIL;
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                SubLObject removal_tactic = NIL;
                for (removal_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , removal_tactic = cdolist_list_var.first()) {
                    if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $GENERALIZED_REMOVAL_OR_REWRITE)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $POSSIBLE))) {
                        if (!(((removal_tactic == best_complete_removal_tactic) || (NIL != list_utilities.member_eqP(removal_tactic, possible_non_complete_removal_tactics))) || (NIL != list_utilities.member_eqP(removal_tactic, set_aside_removal_tactics)))) {
                            thrown_away_removal_tactics = cons(removal_tactic, thrown_away_removal_tactics);
                        }
                    }
                }
                return values(best_complete_removal_tactic, possible_non_complete_removal_tactics, set_aside_removal_tactics, thrown_away_removal_tactics);
            }
        }
    }

    public static final SubLObject balanced_strategy_categorize_disjunctive_tactics_wrt_removal(SubLObject strategy, SubLObject problem, SubLObject problem_set_aside_wrt_removalP, SubLObject problem_thrown_away_wrt_removalP) {
        {
            SubLObject possible_motivation_strategems = NIL;
            SubLObject set_aside_motivation_strategems = NIL;
            if (NIL == problem_thrown_away_wrt_removalP) {
                {
                    SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                                if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $DISJUNCTIVE)) {
                                    if (NIL == balanced_strategy_link_motivates_problemP(strategy, link, $REMOVAL, UNPROVIDED)) {
                                        if (NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_disjunctive_link_wrt_removalP(strategy, link)) {
                                            {
                                                SubLObject disjunctive_tactic = inference_worker.logical_link_unique_tactic(link);
                                                if ((NIL != problem_set_aside_wrt_removalP) || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_disjunctive_link_wrt_removalP(strategy, link))) {
                                                    set_aside_motivation_strategems = cons(disjunctive_tactic, set_aside_motivation_strategems);
                                                } else {
                                                    possible_motivation_strategems = cons(disjunctive_tactic, possible_motivation_strategems);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                possible_motivation_strategems = inference_tactician.strategy_sort(strategy, possible_motivation_strategems, $sym25$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
            }
            {
                SubLObject thrown_away_motivation_strategems = NIL;
                SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $DISJUNCTIVE)) {
                                {
                                    SubLObject disjunctive_tactic = inference_worker.logical_link_unique_tactic(link);
                                    if (!((NIL != list_utilities.member_eqP(disjunctive_tactic, possible_motivation_strategems)) || (NIL != list_utilities.member_eqP(disjunctive_tactic, set_aside_motivation_strategems)))) {
                                        thrown_away_motivation_strategems = cons(disjunctive_tactic, thrown_away_motivation_strategems);
                                    }
                                }
                            }
                        }
                    }
                }
                return values(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
            }
        }
    }

    public static final SubLObject balanced_strategy_categorize_split_tactics_wrt_removal(SubLObject strategy, SubLObject problem, SubLObject problem_set_aside_wrt_removalP, SubLObject problem_thrown_away_wrt_removalP) {
        {
            SubLObject possible_motivation_strategems = NIL;
            SubLObject set_aside_motivation_strategems = NIL;
            if (NIL == problem_thrown_away_wrt_removalP) {
                {
                    SubLObject split_link = inference_worker_split.problem_sole_split_argument_link(problem);
                    if (NIL != split_link) {
                        {
                            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                            SubLObject split_tactic = NIL;
                            for (split_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , split_tactic = cdolist_list_var.first()) {
                                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(split_tactic, $SPLIT)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(split_tactic, $NON_DISCARDED))) {
                                    if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivatedP(strategy, $REMOVAL, split_tactic)) {
                                        if (NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, split_tactic, $REMOVAL, T, UNPROVIDED)) {
                                            if ((NIL != problem_set_aside_wrt_removalP) || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, split_tactic, $REMOVAL, T, UNPROVIDED, UNPROVIDED))) {
                                                set_aside_motivation_strategems = cons(split_tactic, set_aside_motivation_strategems);
                                            } else {
                                                possible_motivation_strategems = cons(split_tactic, possible_motivation_strategems);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        possible_motivation_strategems = inference_tactician.strategy_sort(strategy, possible_motivation_strategems, $sym25$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
                    }
                }
            }
            {
                SubLObject thrown_away_motivation_strategems = NIL;
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                SubLObject split_tactic = NIL;
                for (split_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , split_tactic = cdolist_list_var.first()) {
                    if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(split_tactic, $SPLIT)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(split_tactic, $NON_DISCARDED))) {
                        if (!((NIL != list_utilities.member_eqP(split_tactic, possible_motivation_strategems)) || (NIL != list_utilities.member_eqP(split_tactic, set_aside_motivation_strategems)))) {
                            thrown_away_motivation_strategems = cons(split_tactic, thrown_away_motivation_strategems);
                        }
                    }
                }
                return values(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
            }
        }
    }

    public static final SubLObject balanced_strategy_categorize_connected_conjunction_tactics_wrt_removal(SubLObject strategy, SubLObject problem, SubLObject problem_set_aside_wrt_removalP, SubLObject problem_thrown_away_wrt_removalP) {
        {
            SubLObject possible_motivation_strategems = NIL;
            SubLObject set_aside_motivation_strategems = NIL;
            SubLObject committed_tactic = NIL;
            SubLObject committed_tactic_productivity = $POSITIVE_INFINITY;
            SubLObject committed_tactic_preference = $DISALLOWED;
            SubLObject committed_tactic_module_spec = $JOIN_ORDERED;
            SubLObject committed_tactic_literal_count = ZERO_INTEGER;
            SubLObject cheap_backtracking_tactics = NIL;
            if (NIL == problem_thrown_away_wrt_removalP) {
                {
                    SubLObject problem_var = problem;
                    SubLObject type_var = $CONNECTED_CONJUNCTION;
                    SubLObject subsuming_join_ordered_tactics = inference_tactician.problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem_var, type_var);
                    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem_var);
                    SubLObject candidate_tactic = NIL;
                    for (candidate_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_tactic = cdolist_list_var.first()) {
                        if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, type_var)) {
                            if (NIL == inference_tactician.some_subsuming_join_ordered_tacticP(candidate_tactic, subsuming_join_ordered_tactics, strategy)) {
                                {
                                    SubLObject link = inference_worker.logical_tactic_link(candidate_tactic);
                                    SubLObject candidate_tactic_module_spec = (NIL != inference_worker_join.join_tactic_p(candidate_tactic)) ? ((SubLObject) ($JOIN)) : $JOIN_ORDERED;
                                    if (NIL == balanced_strategy_link_motivates_problemP(strategy, link, $REMOVAL, UNPROVIDED)) {
                                        if (NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_connected_conjunction_link_wrt_removalP(strategy, link)) {
                                            if ((NIL != problem_set_aside_wrt_removalP) || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_connected_conjunction_link_wrt_removalP(strategy, link))) {
                                                set_aside_motivation_strategems = cons(candidate_tactic, set_aside_motivation_strategems);
                                            } else {
                                                {
                                                    SubLObject candidate_tactic_productivity = inference_lookahead_productivity.tactic_max_removal_productivity(candidate_tactic, strategy);
                                                    SubLObject candidate_tactic_preference = inference_datastructures_strategy.tactic_strategic_preference_level(candidate_tactic, strategy);
                                                    SubLObject candidate_tactic_literal_count = inference_worker.connected_conjunction_tactic_literal_count(candidate_tactic);
                                                    SubLObject magic_wandP = inference_tactician_utilities.magic_wand_tacticP(candidate_tactic, strategy);
                                                    if (NIL != magic_wandP) {
                                                        candidate_tactic_preference = $DISALLOWED;
                                                    }
                                                    if ((NIL == committed_tactic) || (NIL != inference_tactician_utilities.strategy_deems_conjunctive_tactic_spec_betterP(candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literal_count, committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literal_count))) {
                                                        committed_tactic = candidate_tactic;
                                                        committed_tactic_productivity = candidate_tactic_productivity;
                                                        committed_tactic_preference = candidate_tactic_preference;
                                                        committed_tactic_module_spec = candidate_tactic_module_spec;
                                                        committed_tactic_literal_count = candidate_tactic_literal_count;
                                                    }
                                                    if ((NIL == magic_wandP) && (NIL != balanced_strategy_logical_tactic_removal_backtracking_cheapP(candidate_tactic, strategy))) {
                                                        cheap_backtracking_tactics = cons(candidate_tactic, cheap_backtracking_tactics);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != committed_tactic) {
                    if (NIL != balanced_strategy_commits_to_no_removal_backtrackingP(strategy, committed_tactic, committed_tactic_preference)) {
                        cheap_backtracking_tactics = NIL;
                    } else {
                        cheap_backtracking_tactics = list_utilities.delete_first(committed_tactic, cheap_backtracking_tactics, symbol_function(EQ));
                    }
                    possible_motivation_strategems = cons(committed_tactic, possible_motivation_strategems);
                    {
                        SubLObject cdolist_list_var = cheap_backtracking_tactics;
                        SubLObject backtracking_tactic = NIL;
                        for (backtracking_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , backtracking_tactic = cdolist_list_var.first()) {
                            possible_motivation_strategems = cons(backtracking_tactic, possible_motivation_strategems);
                        }
                    }
                    possible_motivation_strategems = inference_tactician.strategy_sort(strategy, possible_motivation_strategems, $sym25$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
                }
            }
            {
                SubLObject thrown_away_motivation_strategems = NIL;
                SubLObject problem_var = problem;
                SubLObject type_var = $CONNECTED_CONJUNCTION;
                SubLObject subsuming_join_ordered_tactics = inference_tactician.problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem_var, type_var);
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem_var);
                SubLObject conjunctive_tactic = NIL;
                for (conjunctive_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunctive_tactic = cdolist_list_var.first()) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(conjunctive_tactic, type_var)) {
                        if (NIL == inference_tactician.some_subsuming_join_ordered_tacticP(conjunctive_tactic, subsuming_join_ordered_tactics, strategy)) {
                            if (!((NIL != list_utilities.member_eqP(conjunctive_tactic, possible_motivation_strategems)) || (NIL != list_utilities.member_eqP(conjunctive_tactic, set_aside_motivation_strategems)))) {
                                thrown_away_motivation_strategems = cons(conjunctive_tactic, thrown_away_motivation_strategems);
                            }
                        }
                    }
                }
                return values(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
            }
        }
    }

    public static final SubLObject balanced_strategy_commits_to_no_removal_backtrackingP(SubLObject strategy, SubLObject committed_tactic, SubLObject committed_tactic_preference_level) {
        if (NIL != (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(committed_tactic)) ? ((SubLObject) (eq($COMPLETE, inference_worker.logical_tactic_generalized_removal_completeness(committed_tactic, strategy)))) : eq($PREFERRED, committed_tactic_preference_level))) {
            if (NIL != balanced_strategy_logical_tactic_removal_backtracking_cheapP(committed_tactic, strategy)) {
                return T;
            }
        }
        if (NIL != inference_trampolines.problem_backchain_requiredP(inference_datastructures_tactic.tactic_problem(committed_tactic))) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return 0 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to activate wrt transformation.
    Strategems are ordered in intended order of activation.
     * @return 1 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to set aside wrt transformation.
     * @return 2 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to throw away wrt transformation.
     */
    public static final SubLObject balanced_strategy_categorize_strategems_wrt_transformation(SubLObject strategy, SubLObject problem) {
        {
            SubLObject strategems_to_activate = NIL;
            SubLObject strategems_to_set_aside = NIL;
            if (NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, $TRANSFORMATION, UNPROVIDED)) {
                {
                    SubLObject problem_set_aside_wrt_transformationP = inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_problemP(strategy, problem, $TRANSFORMATION, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                        SubLObject transformation_tactic = NIL;
                        for (transformation_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , transformation_tactic = cdolist_list_var.first()) {
                            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, $TRANSFORMATION)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(transformation_tactic, $POSSIBLE))) {
                                if (NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic, $TRANSFORMATION, T, UNPROVIDED)) {
                                    if ((NIL != problem_set_aside_wrt_transformationP) || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic, $TRANSFORMATION, T, UNPROVIDED, UNPROVIDED))) {
                                        strategems_to_set_aside = cons(transformation_tactic, strategems_to_set_aside);
                                    } else {
                                        strategems_to_activate = cons(transformation_tactic, strategems_to_activate);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject transformation_link = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, transformation_link)) {
                                    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
                                        if (NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link)) {
                                            if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, transformation_link)) {
                                                {
                                                    SubLObject transformation_tactic = inference_worker_transformation.transformation_link_tactic(transformation_link);
                                                    if (NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic, $TRANSFORMATION, T, UNPROVIDED)) {
                                                        if ((NIL != problem_set_aside_wrt_transformationP) || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic, $TRANSFORMATION, T, UNPROVIDED, UNPROVIDED))) {
                                                            strategems_to_set_aside = cons(transformation_tactic, strategems_to_set_aside);
                                                        } else {
                                                            strategems_to_activate = cons(transformation_tactic, strategems_to_activate);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (NIL == inference_datastructures_problem.single_literal_problem_p(problem)) {
                        {
                            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                            SubLObject logical_tactic = NIL;
                            for (logical_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , logical_tactic = cdolist_list_var.first()) {
                                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(logical_tactic, $LOGICAL)) {
                                    if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_link_head_motivated_wrt_transformationP(strategy, logical_tactic)) {
                                        if (NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, logical_tactic, $TRANSFORMATION, T, UNPROVIDED)) {
                                            if ((NIL != problem_set_aside_wrt_transformationP) || (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, logical_tactic, $TRANSFORMATION, T, UNPROVIDED, UNPROVIDED))) {
                                                strategems_to_set_aside = cons(logical_tactic, strategems_to_set_aside);
                                            } else {
                                                strategems_to_activate = cons(logical_tactic, strategems_to_activate);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            strategems_to_activate = nreverse(strategems_to_activate);
            strategems_to_set_aside = nreverse(strategems_to_set_aside);
            {
                SubLObject strategems_to_throw_away = NIL;
                {
                    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                    SubLObject transformation_tactic = NIL;
                    for (transformation_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , transformation_tactic = cdolist_list_var.first()) {
                        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, $TRANSFORMATION)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(transformation_tactic, $POSSIBLE))) {
                            if (!((NIL != list_utilities.member_eqP(transformation_tactic, strategems_to_activate)) || (NIL != list_utilities.member_eqP(transformation_tactic, strategems_to_set_aside)))) {
                                strategems_to_throw_away = cons(transformation_tactic, strategems_to_throw_away);
                            }
                        }
                    }
                }
                {
                    SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject transformation_link = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, transformation_link)) {
                                if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
                                    if (!((NIL != list_utilities.member_eqP(transformation_link, strategems_to_activate)) || (NIL != list_utilities.member_eqP(transformation_link, strategems_to_set_aside)))) {
                                        strategems_to_throw_away = cons(transformation_link, strategems_to_throw_away);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                    SubLObject logical_tactic = NIL;
                    for (logical_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , logical_tactic = cdolist_list_var.first()) {
                        if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(logical_tactic, $LOGICAL)) {
                            if (!((NIL != list_utilities.member_eqP(logical_tactic, strategems_to_activate)) || (NIL != list_utilities.member_eqP(logical_tactic, strategems_to_set_aside)))) {
                                strategems_to_throw_away = cons(logical_tactic, strategems_to_throw_away);
                            }
                        }
                    }
                }
                return values(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
            }
        }
    }

    public static final SubLObject balanced_strategy_logical_tactic_removal_backtracking_cheapP(SubLObject logical_tactic, SubLObject strategy) {
        if (NIL == inference_worker_join.join_tactic_p(logical_tactic)) {
            {
                SubLObject removal_backtracking_productivity_threshold = inference_balanced_tactician_datastructures.balanced_strategy_removal_backtracking_productivity_limit(strategy);
                if (NIL != removal_backtracking_productivity_threshold) {
                    {
                        SubLObject productivity = inference_lookahead_productivity.tactic_max_removal_productivity(logical_tactic, strategy);
                        return inference_datastructures_enumerated_types.productivity_LE(productivity, removal_backtracking_productivity_threshold);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_problem_estimated_global_productivity_wrt_removal_strategems(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject strategems_to_activate = balanced_strategy_categorize_strategems_wrt_removal(strategy, problem);
                SubLObject strategems_to_set_aside = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject total_to_be_proven_productivity = ZERO_INTEGER;
                    SubLObject cdolist_list_var = strategems_to_activate;
                    SubLObject strategem = NIL;
                    for (strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strategem = cdolist_list_var.first()) {
                        if ((NIL == inference_datastructures_tactic.tactic_p(strategem)) || (NIL != inference_datastructures_tactic.tactic_possibleP(strategem))) {
                            {
                                SubLObject to_be_proven_productivity = NIL;
                                if (((NIL != inference_worker_removal.generalized_removal_tactic_p(strategem)) || (NIL != inference_worker_rewrite.rewrite_tactic_p(strategem))) || (NIL != inference_worker.meta_structural_tactic_p(strategem))) {
                                    to_be_proven_productivity = inference_datastructures_strategy.tactic_strategic_productivity(strategem, strategy);
                                } else {
                                    to_be_proven_productivity = inference_lookahead_productivity.tactic_max_removal_productivity(strategem, strategy);
                                }
                                total_to_be_proven_productivity = inference_datastructures_enumerated_types.productivity_X(total_to_be_proven_productivity, to_be_proven_productivity);
                            }
                        }
                    }
                    return total_to_be_proven_productivity;
                }
            }
        }
    }

    public static final SubLObject balanced_strategy_problem_estimated_global_removal_productivity(SubLObject strategy, SubLObject problem) {
        inference_worker.determine_strategic_status_wrt(problem, strategy);
        {
            SubLObject already_proven_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(inference_datastructures_problem.problem_proven_proof_count(problem));
            SubLObject to_be_proven_productivity = balanced_strategy_problem_estimated_global_productivity_wrt_removal_strategems(strategy, problem);
            SubLObject total_productivity = inference_datastructures_enumerated_types.productivity_X(already_proven_productivity, to_be_proven_productivity);
            return total_productivity;
        }
    }

    public static final SubLObject balanced_strategy_possibly_reconsider_split_set_asides_wrt_removal(SubLObject strategy, SubLObject split_tactic) {
        {
            SubLObject reactivated_count = ZERO_INTEGER;
            SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
            SubLObject index = inference_balanced_tactician_datastructures.balanced_strategy_problem_strategems_set_aside_wrt_removal(strategy);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if (NIL != set.non_empty_set_p(v_set)) {
                {
                    SubLObject set_aside_split_tactics = list_utilities.delete_if_not(SPLIT_TACTIC_P, set.set_element_list(v_set), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject set_aside_split_tactics_in_order = set_aside_split_tactics;
                    {
                        SubLObject cdolist_list_var = set_aside_split_tactics_in_order;
                        SubLObject split_tactic_34 = NIL;
                        for (split_tactic_34 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , split_tactic_34 = cdolist_list_var.first()) {
                            set.set_remove(split_tactic_34, v_set);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = set_aside_split_tactics_in_order;
                        SubLObject split_tactic_35 = NIL;
                        for (split_tactic_35 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , split_tactic_35 = cdolist_list_var.first()) {
                            if (NIL != balanced_strategy_reconsider_one_split_set_aside_wrt_removal(strategy, split_tactic_35)) {
                                reactivated_count = add(reactivated_count, ONE_INTEGER);
                            }
                        }
                    }
                }
            }
            return reactivated_count;
        }
    }

    public static final SubLObject balanced_strategy_reconsider_one_split_set_aside_wrt_removal(SubLObject strategy, SubLObject split_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = inference_worker.$reconsidering_set_asidesP$.currentBinding(thread);
                    try {
                        inference_worker.$reconsidering_set_asidesP$.bind(T, thread);
                        {
                            SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
                            balanced_strategy_possibly_clear_strategic_status_wrt_removal(strategy, problem);
			    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_recompute_thrown_away_wrt(split_tactic, strategy, $REMOVAL);
			    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_recompute_set_aside_wrt(split_tactic, strategy, $REMOVAL);
                            if (NIL == inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_tacticP(strategy, split_tactic, $REMOVAL, NIL, T)) {
                                if (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_set_aside_tacticP(strategy, split_tactic, $REMOVAL, NIL, T, T)) {
                                    inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_set_aside_wrt_removal(strategy, split_tactic);
                                } else {
                                    inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_removal(strategy, split_tactic);
                                    result = T;
                                }
                            }
                        }
                    } finally {
                        inference_worker.$reconsidering_set_asidesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject balanced_strategy_possibly_clear_strategic_status_wrt_removal(SubLObject strategy, SubLObject problem) {
        if (NIL != inference_datastructures_strategy.strategically_pending_problem_p(problem, strategy)) {
            inference_tactician.possibly_clear_strategic_status_wrt(problem, strategy);
        }
        inference_datastructures_strategy.strategy_clear_problem_set_aside(strategy, problem);
        inference_balanced_tactician_datastructures.balanced_strategy_note_problem_unpending_wrt_removal(strategy, problem);
        return NIL;
    }

    public static final SubLObject balanced_strategy_reactivate_executable_strategem(SubLObject strategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(strategem, EXECUTABLE_STRATEGEM_P);
        if (NIL != inference_worker_removal.generalized_removal_tactic_p(strategem)) {
            return inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_removal(strategy, strategem);
        } else
            if (NIL != inference_worker_transformation.transformation_tactic_p(strategem)) {
                return inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_transformation(strategy, strategem);
            } else
                if (NIL != inference_worker.meta_structural_tactic_p(strategem)) {
                    inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_removal(strategy, strategem);
                    return strategem;
                } else {
                    return inference_balanced_tactician_datastructures.balanced_strategy_activate_strategem_wrt_removal(strategy, strategem);
                }


    }

    public static final SubLObject balanced_strategy_strategically_deactivate_strategem(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
        if (NIL != inference_tactician.strategem_invalid_p(strategem)) {
            return NIL;
        }
        {
            SubLObject strategem_var = strategem;
            SubLObject problem = inference_tactician.strategem_problem(strategem_var);
            balanced_strategy_deactivate_strategem(strategy, strategem_var, motivation);
            balanced_strategy_possibly_deactivate_problem(strategy, problem);
        }
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            inference_worker.consider_strategic_ramifications_of_possibly_executed_tactic(strategy, strategem);
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_deactivate_strategem(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($REMOVAL)) {
                return balanced_strategy_deactivate_strategem_wrt_removal(strategy, strategem);
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    return balanced_strategy_deactivate_strategem_wrt_transformation(strategy, strategem);
                } else {
                    return Errors.error($str_alt16$unexpected_motivation__s, motivation);
                }

        }
    }

    public static final SubLObject balanced_strategy_deactivate_strategem_wrt_removal(SubLObject strategy, SubLObject removal_strategem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(removal_strategem, REMOVAL_STRATEGEM_P);
        {
            SubLObject problem = inference_tactician.strategem_problem(removal_strategem);
            SubLObject index = inference_balanced_tactician_datastructures.balanced_strategy_problem_total_strategems_active_wrt_removal(strategy);
            SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
            count = subtract(count, ONE_INTEGER);
            if (count.isPositive()) {
                dictionary.dictionary_enter(index, problem, count);
            } else {
                dictionary.dictionary_remove(index, problem);
                inference_balanced_tactician_datastructures.balanced_strategy_note_problem_pending(strategy, problem, $REMOVAL);
            }
            return count;
        }
    }

    public static final SubLObject balanced_strategy_deactivate_strategem_wrt_transformation(SubLObject strategy, SubLObject transformation_strategem) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(transformation_strategem, TRANSFORMATION_STRATEGEM_P);
        {
            SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
            SubLObject index = inference_balanced_tactician_datastructures.balanced_strategy_problem_total_strategems_active_wrt_transformation(strategy);
            SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
            count = subtract(count, ONE_INTEGER);
            if (count.isPositive()) {
                dictionary.dictionary_enter(index, problem, count);
            } else {
                dictionary.dictionary_remove(index, problem);
                inference_balanced_tactician_datastructures.balanced_strategy_note_problem_pending(strategy, problem, $TRANSFORMATION);
            }
            return count;
        }
    }

    public static final SubLObject balanced_strategy_possibly_deactivate_problem(SubLObject strategy, SubLObject problem) {
        if (((NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $NEW_ROOT)) && (NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $REMOVAL))) && (NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_activeP(strategy, problem, $TRANSFORMATION))) {
            inference_datastructures_strategy.strategy_note_problem_inactive(strategy, problem);
            if (((NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_set_asideP(strategy, problem, $NEW_ROOT)) || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_set_asideP(strategy, problem, $REMOVAL))) || (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_set_asideP(strategy, problem, $TRANSFORMATION))) {
                inference_datastructures_strategy.strategy_note_problem_set_aside(strategy, problem);
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_consider_that_problem_could_be_strategically_totally_pending(SubLObject strategy, SubLObject problem) {
        {
            SubLObject pending_wrt_new_rootP = balanced_strategy_consider_that_problem_could_be_strategically_pending(strategy, problem, $NEW_ROOT);
            SubLObject pending_wrt_removalP = balanced_strategy_consider_that_problem_could_be_strategically_pending(strategy, problem, $REMOVAL);
            SubLObject pending_wrt_transformationP = balanced_strategy_consider_that_problem_could_be_strategically_pending(strategy, problem, $TRANSFORMATION);
            return makeBoolean(((NIL != pending_wrt_new_rootP) || (NIL != pending_wrt_removalP)) || (NIL != pending_wrt_transformationP));
        }
    }

    public static final SubLObject balanced_strategy_consider_that_problem_could_be_strategically_pending(SubLObject strategy, SubLObject problem, SubLObject motivation) {
        if (NIL != inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_chooses_to_throw_away_problemP(strategy, problem, motivation, UNPROVIDED)) {
            balanced_strategy_make_problem_pending(strategy, problem, motivation);
            return T;
        }
        return NIL;
    }

    public static final SubLObject balanced_strategy_make_problem_pending(SubLObject strategy, SubLObject problem, SubLObject motivation) {
        inference_balanced_tactician_datastructures.balanced_strategy_note_problem_pending(strategy, problem, motivation);
        balanced_strategy_possibly_deactivate_problem(strategy, problem);
        return NIL;
    }

    /**
     * you're join-ordered, you have R, your supported problem has N, your lookahead problem is complete, you're cheap, and you're open.
     */
    public static final SubLObject balanced_strategy_early_removal_linkP(SubLObject strategy, SubLObject link) {
        SubLTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        return makeBoolean((((((NIL != inference_worker_join_ordered.join_ordered_link_p(link)) && (NIL != inference_datastructures_problem_link.problem_link_openP(link))) && (NIL != inference_balanced_tactician_datastructures.balanced_strategy_connected_conjunction_link_motivated_wrt_removalP(strategy, link))) && (NIL != inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_new_rootP(strategy, inference_datastructures_problem_link.problem_link_supported_problem(link)))) && ($COMPLETE == inference_worker.problem_generalized_removal_completeness(inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(inference_worker_join_ordered.join_ordered_link_tactic(link)), strategy))) && (NIL != inference_tactician.join_ordered_link_early_removal_cheapP(link, strategy)));
    }

    public static final SubLObject declare_inference_balanced_tactician_motivation_file() {
        declareMacro("balanced_strategy_with_strategically_active_strategem", "BALANCED-STRATEGY-WITH-STRATEGICALLY-ACTIVE-STRATEGEM");
        declareFunction("balanced_strategy_possibly_propagate_motivation_to_link_head", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 3, 0, false);
        declareFunction("balanced_strategy_propagate_motivation_to_link_head", "BALANCED-STRATEGY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 3, 0, false);
        declareFunction("balanced_strategy_possibly_propagate_new_root_motivation_down_split_link", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-SPLIT-LINK", 2, 0, false);
        declareFunction("balanced_strategy_possibly_propagate_new_root_motivation_down_union_link", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-UNION-LINK", 2, 0, false);
        declareFunction("balanced_strategy_propagate_transformation_motivation_to_transformation_link", "BALANCED-STRATEGY-PROPAGATE-TRANSFORMATION-MOTIVATION-TO-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("balanced_strategy_transformation_new_root_candidates", "BALANCED-STRATEGY-TRANSFORMATION-NEW-ROOT-CANDIDATES", 2, 0, false);
        declareFunction("balanced_strategy_chooses_to_make_d_a_new_rootP", "BALANCED-STRATEGY-CHOOSES-TO-MAKE-D-A-NEW-ROOT?", 2, 0, false);
        declareFunction("balanced_strategy_residual_conjunction_new_root_candidates", "BALANCED-STRATEGY-RESIDUAL-CONJUNCTION-NEW-ROOT-CANDIDATES", 2, 0, false);
        declareFunction("balanced_strategy_possibly_motivate_new_root_via_residual_transformation_link", "BALANCED-STRATEGY-POSSIBLY-MOTIVATE-NEW-ROOT-VIA-RESIDUAL-TRANSFORMATION-LINK", 2, 1, false);
        declareFunction("balanced_strategy_allows_transformation_link_to_propagate_new_root_motivationP", "BALANCED-STRATEGY-ALLOWS-TRANSFORMATION-LINK-TO-PROPAGATE-NEW-ROOT-MOTIVATION?", 2, 0, false);
        declareFunction("balanced_strategy_allows_problem_to_propagate_new_root_motivationP", "BALANCED-STRATEGY-ALLOWS-PROBLEM-TO-PROPAGATE-NEW-ROOT-MOTIVATION?", 2, 0, false);
        declareFunction("balanced_strategy_link_motivates_problem_wrt_removalP", "BALANCED-STRATEGY-LINK-MOTIVATES-PROBLEM-WRT-REMOVAL?", 2, 1, false);
        declareFunction("balanced_strategy_link_motivates_problem_wrt_transformationP", "BALANCED-STRATEGY-LINK-MOTIVATES-PROBLEM-WRT-TRANSFORMATION?", 2, 1, false);
        declareFunction("balanced_strategy_link_motivates_problemP", "BALANCED-STRATEGY-LINK-MOTIVATES-PROBLEM?", 3, 1, false);
        declareFunction("balanced_strategy_link_motivates_lookahead_problemP", "BALANCED-STRATEGY-LINK-MOTIVATES-LOOKAHEAD-PROBLEM?", 3, 0, false);
        declareFunction("balanced_strategy_possibly_propagate_motivation_to_problem", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 3, 0, false);
        declareFunction("balanced_strategy_possibly_make_new_root", "BALANCED-STRATEGY-POSSIBLY-MAKE-NEW-ROOT", 2, 0, false);
        declareFunction("balanced_strategy_possibly_propagate_new_root_motivation_to_problem", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction("balanced_strategy_propagate_new_root_motivation_to_problem", "BALANCED-STRATEGY-PROPAGATE-NEW-ROOT-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction("balanced_strategy_possibly_propagate_removal_motivation_to_problem", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-REMOVAL-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction("balanced_strategy_propagate_removal_motivation_to_problem", "BALANCED-STRATEGY-PROPAGATE-REMOVAL-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction("balanced_strategy_possibly_propagate_transformation_motivation_to_problem", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-TRANSFORMATION-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction("balanced_strategy_propagate_transformation_motivation_to_problem", "BALANCED-STRATEGY-PROPAGATE-TRANSFORMATION-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction("balanced_strategy_possibly_activate_problem", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        new inference_balanced_tactician_motivation.$balanced_strategy_possibly_activate_problem$BinaryFunction();
        declareFunction("balanced_strategy_problem_is_the_rest_of_a_removalP", "BALANCED-STRATEGY-PROBLEM-IS-THE-REST-OF-A-REMOVAL?", 2, 0, false);
        declareFunction("balanced_strategy_problem_is_the_rest_of_an_early_removalP", "BALANCED-STRATEGY-PROBLEM-IS-THE-REST-OF-AN-EARLY-REMOVAL?", 2, 0, false);
        declareFunction("balanced_strategy_problem_is_the_rest_of_a_join_orderedP", "BALANCED-STRATEGY-PROBLEM-IS-THE-REST-OF-A-JOIN-ORDERED?", 2, 0, false);
        declareFunction("balanced_strategy_possibly_propagate_proof_spec_to_restricted_non_focals", "BALANCED-STRATEGY-POSSIBLY-PROPAGATE-PROOF-SPEC-TO-RESTRICTED-NON-FOCALS", 2, 0, false);
        declareFunction("balanced_strategy_problem_motivated_without_join_ordered_wrt_removalP", "BALANCED-STRATEGY-PROBLEM-MOTIVATED-WITHOUT-JOIN-ORDERED-WRT-REMOVAL?", 2, 0, false);
        declareFunction("balanced_strategy_motivates_problem_via_rewriteP", "BALANCED-STRATEGY-MOTIVATES-PROBLEM-VIA-REWRITE?", 2, 0, false);
        declareFunction("balanced_strategy_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP", "BALANCED-STRATEGY-CHOOSES-TO-PROPAGATE-NEW-ROOT-MOTIVATION-TO-RESTRICTED-NON-FOCAL-PROBLEM?", 3, 0, false);
        declareFunction("balanced_strategy_treats_restricted_non_focal_as_new_rootP", "BALANCED-STRATEGY-TREATS-RESTRICTED-NON-FOCAL-AS-NEW-ROOT?", 2, 0, false);
        declareFunction("balanced_strategy_chooses_not_to_examine_problemP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
        declareFunction("balanced_strategy_chooses_not_to_activate_problemP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
        declareFunction("balanced_strategy_chooses_not_to_activate_problem_wrt_new_rootP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM-WRT-NEW-ROOT?", 2, 0, false);
        declareFunction("balanced_strategy_chooses_not_to_activate_problem_wrt_removalP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM-WRT-REMOVAL?", 2, 0, false);
        declareFunction("balanced_strategy_chooses_not_to_activate_problem_wrt_transformationP", "BALANCED-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM-WRT-TRANSFORMATION?", 2, 0, false);
        declareFunction("balanced_strategy_possibly_activate_problem_wrt_new_root", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM-WRT-NEW-ROOT", 2, 0, false);
        declareFunction("balanced_strategy_possibly_activate_problem_wrt_removal", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_possibly_activate_problem_wrt_transformation", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_activate_problem_wrt_new_root", "BALANCED-STRATEGY-ACTIVATE-PROBLEM-WRT-NEW-ROOT", 2, 0, false);
        declareFunction("balanced_strategy_activate_problem_wrt_removal", "BALANCED-STRATEGY-ACTIVATE-PROBLEM-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_activate_problem_wrt_transformation", "BALANCED-STRATEGY-ACTIVATE-PROBLEM-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_possibly_activate_strategems_wrt_new_root", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS-WRT-NEW-ROOT", 2, 0, false);
        declareFunction("balanced_strategy_possibly_activate_strategems_wrt_removal", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS-WRT-REMOVAL", 2, 0, false);
        declareFunction("merge_balanced_and_rl_tactician_strategems", "MERGE-BALANCED-AND-RL-TACTICIAN-STRATEGEMS", 6, 0, false);
        declareFunction("balanced_strategy_filter_strategems_by_rlt_tactic_types", "BALANCED-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES", 2, 0, false);
        declareFunction("balanced_strategy_filter_strategems_by_rlt_tactic_types_int", "BALANCED-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES-INT", 2, 0, false);
        declareFunction("balanced_strategy_possibly_activate_strategems_wrt_transformation", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_activate_transformation_argument_links_wrt_transformation", "BALANCED-STRATEGY-ACTIVATE-TRANSFORMATION-ARGUMENT-LINKS-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_note_argument_link_added", "BALANCED-STRATEGY-NOTE-ARGUMENT-LINK-ADDED", 2, 0, false);
        declareFunction("balanced_strategy_possibly_activate_transformation_link", "BALANCED-STRATEGY-POSSIBLY-ACTIVATE-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("balanced_strategy_activate_transformation_link", "BALANCED-STRATEGY-ACTIVATE-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("balanced_strategy_note_new_tactic", "BALANCED-STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
        declareFunction("balanced_strategy_note_split_tactics_strategically_possible", "BALANCED-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
        declareFunction("balanced_strategy_note_new_tactic_possible", "BALANCED-STRATEGY-NOTE-NEW-TACTIC-POSSIBLE", 2, 0, false);
        declareFunction("balanced_strategy_categorize_strategems", "BALANCED-STRATEGY-CATEGORIZE-STRATEGEMS", 3, 0, false);
        declareFunction("balanced_strategy_categorize_strategems_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-STRATEGEMS-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_categorize_motivation_strategems_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-MOTIVATION-STRATEGEMS-WRT-REMOVAL", 4, 0, false);
        declareFunction("balanced_strategy_categorize_removal_tactics_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-REMOVAL-TACTICS-WRT-REMOVAL", 4, 0, false);
        declareFunction("balanced_strategy_categorize_disjunctive_tactics_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-DISJUNCTIVE-TACTICS-WRT-REMOVAL", 4, 0, false);
        declareFunction("balanced_strategy_categorize_split_tactics_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-SPLIT-TACTICS-WRT-REMOVAL", 4, 0, false);
        declareFunction("balanced_strategy_categorize_connected_conjunction_tactics_wrt_removal", "BALANCED-STRATEGY-CATEGORIZE-CONNECTED-CONJUNCTION-TACTICS-WRT-REMOVAL", 4, 0, false);
        declareFunction("balanced_strategy_commits_to_no_removal_backtrackingP", "BALANCED-STRATEGY-COMMITS-TO-NO-REMOVAL-BACKTRACKING?", 3, 0, false);
        declareFunction("balanced_strategy_categorize_strategems_wrt_transformation", "BALANCED-STRATEGY-CATEGORIZE-STRATEGEMS-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_logical_tactic_removal_backtracking_cheapP", "BALANCED-STRATEGY-LOGICAL-TACTIC-REMOVAL-BACKTRACKING-CHEAP?", 2, 0, false);
        declareFunction("balanced_strategy_problem_estimated_global_productivity_wrt_removal_strategems", "BALANCED-STRATEGY-PROBLEM-ESTIMATED-GLOBAL-PRODUCTIVITY-WRT-REMOVAL-STRATEGEMS", 2, 0, false);
        declareFunction("balanced_strategy_problem_estimated_global_removal_productivity", "BALANCED-STRATEGY-PROBLEM-ESTIMATED-GLOBAL-REMOVAL-PRODUCTIVITY", 2, 0, false);
        declareFunction("balanced_strategy_possibly_reconsider_split_set_asides_wrt_removal", "BALANCED-STRATEGY-POSSIBLY-RECONSIDER-SPLIT-SET-ASIDES-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_reconsider_one_split_set_aside_wrt_removal", "BALANCED-STRATEGY-RECONSIDER-ONE-SPLIT-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_possibly_clear_strategic_status_wrt_removal", "BALANCED-STRATEGY-POSSIBLY-CLEAR-STRATEGIC-STATUS-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_reactivate_executable_strategem", "BALANCED-STRATEGY-REACTIVATE-EXECUTABLE-STRATEGEM", 2, 0, false);
        declareFunction("balanced_strategy_strategically_deactivate_strategem", "BALANCED-STRATEGY-STRATEGICALLY-DEACTIVATE-STRATEGEM", 3, 0, false);
        declareFunction("balanced_strategy_deactivate_strategem", "BALANCED-STRATEGY-DEACTIVATE-STRATEGEM", 3, 0, false);
        declareFunction("balanced_strategy_deactivate_strategem_wrt_removal", "BALANCED-STRATEGY-DEACTIVATE-STRATEGEM-WRT-REMOVAL", 2, 0, false);
        declareFunction("balanced_strategy_deactivate_strategem_wrt_transformation", "BALANCED-STRATEGY-DEACTIVATE-STRATEGEM-WRT-TRANSFORMATION", 2, 0, false);
        declareFunction("balanced_strategy_possibly_deactivate_problem", "BALANCED-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("balanced_strategy_consider_that_problem_could_be_strategically_totally_pending", "BALANCED-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-TOTALLY-PENDING", 2, 0, false);
        declareFunction("balanced_strategy_consider_that_problem_could_be_strategically_pending", "BALANCED-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 3, 0, false);
        declareFunction("balanced_strategy_make_problem_pending", "BALANCED-STRATEGY-MAKE-PROBLEM-PENDING", 3, 0, false);
        declareFunction("balanced_strategy_early_removal_linkP", "BALANCED-STRATEGY-EARLY-REMOVAL-LINK?", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_inference_balanced_tactician_motivation_file() {
        defparameter("*BALANCED-STRATEGY-NEW-ROOTS-TRIGGERED-BY-T-ON-JO-LINK?*", T);
        defvar("*BALANCED-STRATEGY-NEW-ROOTS-CHECK-FOR-T-ON-JO-LINK?*", T);
        defparameter("*BALANCED-STRATEGY-SELF-EXPANDING-RULE-FIX-ENABLED?*", T);
        defparameter("*BALANCED-STRATEGY-RL-TACTICIAN-TACTIC-TYPES*", $list_alt23);
        return NIL;
    }

    public static final SubLObject setup_inference_balanced_tactician_motivation_file() {
                utilities_macros.note_funcall_helper_function(BALANCED_STRATEGY_NOTE_NEW_TACTIC);
        utilities_macros.note_funcall_helper_function(BALANCED_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(list(makeSymbol("STRATEGY"), makeSymbol("STRATEGEM"), makeSymbol("MOTIVATION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym1$PROBLEM = makeUninternedSymbol("PROBLEM");

    static private final SubLSymbol $sym2$STRATEGEM_VAR = makeUninternedSymbol("STRATEGEM-VAR");



    private static final SubLSymbol STRATEGEM_PROBLEM = makeSymbol("STRATEGEM-PROBLEM");

    private static final SubLSymbol BALANCED_STRATEGY_DEACTIVATE_STRATEGEM = makeSymbol("BALANCED-STRATEGY-DEACTIVATE-STRATEGEM");

    private static final SubLSymbol BALANCED_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM = makeSymbol("BALANCED-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM");

    private static final SubLSymbol MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");

    private static final SubLSymbol BALANCED_STRATEGY_P = makeSymbol("BALANCED-STRATEGY-P");















    static private final SubLString $str_alt16$unexpected_motivation__s = makeString("unexpected motivation ~s");







    static private final SubLString $str_alt20$_s_tried_to_propagate_T_to__s_but = makeString("~s tried to propagate T to ~s but it throws away all transformation");





    static private final SubLList $list_alt23 = list(makeKeyword("GENERALIZED-REMOVAL"), makeKeyword("CONNECTED-CONJUNCTION"), makeKeyword("SPLIT"), makeKeyword("UNION"));

    private static final SubLSymbol BALANCED_STRATEGY_NOTE_NEW_TACTIC = makeSymbol("BALANCED-STRATEGY-NOTE-NEW-TACTIC");

    static private final SubLSymbol $sym25$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ = makeSymbol("LOGICAL-TACTIC-BETTER-WRT-REMOVAL?");

    private static final SubLSymbol BALANCED_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE = makeSymbol("BALANCED-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE");

    static private final SubLList $list_alt27 = list(makeKeyword("REMOVAL"), makeKeyword("TRANSFORMATION"));

    static private final SubLList $list_alt28 = list(makeKeyword("TRANSFORMATION"));

    private static final SubLSymbol BALANCED_STRATEGY_MOTIVATION_P = makeSymbol("BALANCED-STRATEGY-MOTIVATION-P");

    static private final SubLString $str_alt30$time_to_categorize_strategems_wrt = makeString("time to categorize strategems wrt :new-root");



    private static final SubLSymbol $GENERALIZED_REMOVAL_OR_REWRITE = makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE");









    static private final SubLSymbol $sym37$TACTIC_STRATEGIC_PRODUCTIVITY__ = makeSymbol("TACTIC-STRATEGIC-PRODUCTIVITY-<");















    private static final SubLSymbol SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");

    private static final SubLSymbol EXECUTABLE_STRATEGEM_P = makeSymbol("EXECUTABLE-STRATEGEM-P");

    private static final SubLSymbol REMOVAL_STRATEGEM_P = makeSymbol("REMOVAL-STRATEGEM-P");

    private static final SubLSymbol TRANSFORMATION_STRATEGEM_P = makeSymbol("TRANSFORMATION-STRATEGEM-P");



    // // Initializers
    @Override
    public void declareFunctions() {
        declare_inference_balanced_tactician_motivation_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_balanced_tactician_motivation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_balanced_tactician_motivation_file();
    }
}

