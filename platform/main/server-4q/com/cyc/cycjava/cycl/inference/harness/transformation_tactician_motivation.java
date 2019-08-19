package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
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

public class transformation_tactician_motivation extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation";
    public static String myFingerPrint = "2f1fc1a1e2ca1d51fd49dbcc04074c88f29c2c7f75d64ae6febf15309a7fe488";
    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 9200L)
    private static SubLSymbol $transformation_strategy_self_looping_rule_fix_enabledP$;
    private static SubLList $list0;
    private static SubLSymbol $sym1$PROBLEM;
    private static SubLSymbol $sym2$STRATEGEM_VAR;
    private static SubLSymbol $sym3$CLET;
    private static SubLSymbol $sym4$STRATEGEM_PROBLEM;
    private static SubLSymbol $sym5$TRANSFORMATION_STRATEGY_DEACTIVATE_STRATEGEM;
    private static SubLSymbol $sym6$TRANSFORMATION_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM;
    private static SubLSymbol $sym7$MOTIVATION_STRATEGEM_P;
    private static SubLSymbol $sym8$TRANSFORMATION_STRATEGY_P;
    private static SubLSymbol $SUBSTRATEGY_STRATEGEM_MOTIVATED;
    private static SubLString $str10$_s_tried_to_propagate_T_to__s_but;
    private static SubLSymbol $RESTRICTION;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $sym13$PROBLEM_P;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $sym15$TRANSFORMATION_STRATEGY_NOTE_NEW_TACTIC;
    private static SubLSymbol $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_;
    private static SubLSymbol $sym17$TRANSFORMATION_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE;
    private static SubLSymbol $POSSIBLE;
    private static SubLSymbol $LOGICAL;
    private static SubLSymbol $sym20$EXECUTABLE_STRATEGEM_P;
    private static SubLSymbol $sym21$TRANSFORMATION_STRATEGEM_P;
    private static SubLSymbol $sym22$TRANSFORMATION_STRATEGY_PROBLEM_NOTHING_TO_DO_;

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 1000L)
    public static SubLObject transformation_strategy_with_strategically_active_strategem(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy = NIL;
        SubLObject strategem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        strategy = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        strategem = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject problem = $sym1$PROBLEM;
            SubLObject strategem_var = $sym2$STRATEGEM_VAR;
            return listS($sym3$CLET, list(list(strategem_var, strategem), list(problem, list($sym4$STRATEGEM_PROBLEM, strategem_var))), list($sym5$TRANSFORMATION_STRATEGY_DEACTIVATE_STRATEGEM, strategy, strategem_var),
                    append(body, list(ConsesLow.list($sym6$TRANSFORMATION_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM, strategy, problem))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 1400L)
    public static SubLObject transformation_strategy_possibly_propagate_motivation_to_link_head(SubLObject strategy, SubLObject link_head) {
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        SubLObject already_motivatedP = transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, link_head);
        if (NIL == already_motivatedP) {
            transformation_strategy_propagate_motivation_to_link_head(strategy, link_head);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 1900L)
    public static SubLObject transformation_strategy_propagate_motivation_to_link_head(SubLObject strategy, SubLObject link_head) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        transformation_tactician_datastructures.transformation_strategy_note_link_head_motivated(strategy, link_head);
        if (NIL == inference_worker_transformation.transformation_link_p(link_head)) {
            if (NIL != inference_tactician.motivation_strategem_link_p(link_head)) {
                SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(link_head);
                transformation_strategy_possibly_propagate_motivation_to_problem(strategy, supporting_problem);
            } else if (NIL != inference_worker_join.join_tactic_p(link_head)) {
                SubLObject join_link = inference_worker_join.join_tactic_link(link_head);
                SubLObject first_problem = inference_worker_join.join_link_first_problem(join_link);
                SubLObject second_problem = inference_worker_join.join_link_second_problem(join_link);
                transformation_strategy_possibly_propagate_motivation_to_problem(strategy, first_problem);
                transformation_strategy_possibly_propagate_motivation_to_problem(strategy, second_problem);
            } else {
                SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(link_head);
                transformation_strategy_possibly_propagate_motivation_to_problem(strategy, lookahead_problem);
            }
        }
        inference_datastructures_strategy.controlling_strategy_callback(strategy, $SUBSTRATEGY_STRATEGEM_MOTIVATED, link_head, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 3500L)
    public static SubLObject transformation_strategy_link_motivates_problemP(SubLObject strategy, SubLObject link, SubLObject problem) {
        if (problem == UNPROVIDED) {
            problem = NIL;
        }
        if (NIL == inference_worker_split.split_link_p(link)) {
            return transformation_strategy_link_motivates_lookahead_problemP(strategy, link);
        }
        SubLObject motivatedP = NIL;
        SubLObject problem_var = problem;
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject link_var;
        SubLObject rest;
        SubLObject mapped_problem;
        SubLObject supported_problem;
        SubLObject rest_$1;
        SubLObject tactic;
        SubLObject supporting_mapped_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == motivatedP
                && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                link_var = dependent_link;
                for (rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); NIL == motivatedP && NIL != rest; rest = rest.rest()) {
                    mapped_problem = rest.first();
                    if (NIL != inference_macros.do_problem_link_open_matchP(T, link_var, mapped_problem) && problem_var.eql(inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) {
                        supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                        for (rest_$1 = NIL, rest_$1 = inference_datastructures_problem.problem_tactics(supported_problem); NIL == motivatedP && NIL != rest_$1; rest_$1 = rest_$1.rest()) {
                            tactic = rest_$1.first();
                            if (NIL != inference_worker_split.split_tactic_p(tactic)) {
                                supporting_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(tactic);
                                if (mapped_problem.eql(supporting_mapped_problem) && NIL != transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, tactic)) {
                                    motivatedP = T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return motivatedP;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 4500L)
    public static SubLObject transformation_strategy_link_motivates_lookahead_problemP(SubLObject strategy, SubLObject link) {
        if (NIL != inference_tactician.motivation_strategem_link_p(link)) {
            return transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, link);
        }
        if (NIL != inference_worker_split.split_link_p(link)) {
            return NIL;
        }
        if (NIL != inference_worker.logical_link_p(link)) {
            SubLObject tactic = inference_worker.logical_link_unique_tactic(link);
            return transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 4900L)
    public static SubLObject transformation_strategy_possibly_propagate_motivation_to_problem(SubLObject strategy, SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
            Errors.error($str10$_s_tried_to_propagate_T_to__s_but, strategy, problem);
        }
        SubLObject already_motivatedP = transformation_tactician_datastructures.transformation_strategy_problem_motivatedP(strategy, problem);
        if (NIL == already_motivatedP) {
            transformation_strategy_propagate_motivation_to_problem(strategy, problem);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 5400L)
    public static SubLObject transformation_strategy_propagate_motivation_to_problem(SubLObject strategy, SubLObject problem) {
        transformation_tactician_datastructures.transformation_strategy_note_problem_motivated(strategy, problem);
        if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            transformation_strategy_possibly_activate_problem(strategy, problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 5800L)
    public static SubLObject transformation_strategy_possibly_activate_problem(SubLObject strategy, SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != transformation_strategy_chooses_not_to_examine_problemP(strategy, problem)) {
            return NIL;
        }
        inference_worker.determine_strategic_status_wrt(problem, strategy);
        if (NIL != transformation_strategy_chooses_not_to_activate_problemP(strategy, problem)) {
            return NIL;
        }
        if (NIL != inference_worker_restriction.problem_is_a_simplificationP(problem) && NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread)) {
            transformation_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
        }
        if (NIL != transformation_strategy_problem_is_the_rest_of_a_join_orderedP(problem, strategy)) {
            transformation_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(strategy, problem);
        }
        SubLObject activateP = makeBoolean(NIL != transformation_tactician_datastructures.transformation_strategy_problem_motivatedP(strategy, problem) && NIL == transformation_strategy_chooses_not_to_activate_problemP(strategy, problem));
        if (NIL == activateP) {
            return NIL;
        }
        if (NIL != transformation_strategy_activate_problem(strategy, problem)) {
            return T;
        }
        transformation_strategy_make_problem_pending(strategy, problem);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 7700L)
    public static SubLObject transformation_strategy_problem_is_the_rest_of_a_join_orderedP(SubLObject problem, SubLObject strategy) {
        SubLObject part_of_join_orderedP = NIL;
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject restriction_link;
        SubLObject non_focal_problem;
        SubLObject set_contents_var_$2;
        SubLObject basis_object_$3;
        SubLObject state_$4;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == part_of_join_orderedP
                && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            restriction_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                set_contents_var_$2 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                for (basis_object_$3 = set_contents.do_set_contents_basis_object(set_contents_var_$2), state_$4 = NIL, state_$4 = set_contents.do_set_contents_initial_state(basis_object_$3, set_contents_var_$2); NIL == part_of_join_orderedP
                        && NIL == set_contents.do_set_contents_doneP(basis_object_$3, state_$4); state_$4 = set_contents.do_set_contents_update_state(state_$4)) {
                    join_ordered_link = set_contents.do_set_contents_next(basis_object_$3, state_$4);
                    if (NIL != set_contents.do_set_contents_element_validP(state_$4, join_ordered_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)
                            && NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link) && non_focal_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link))) {
                        part_of_join_orderedP = T;
                    }
                }
            }
        }
        return part_of_join_orderedP;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 8000L)
    public static SubLObject transformation_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(SubLObject strategy, SubLObject problem) {
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 9500L)
    public static SubLObject transformation_strategy_chooses_not_to_examine_problemP(SubLObject strategy, SubLObject problem) {
        return makeBoolean(NIL != inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem) || NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, strategy));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 10200L)
    public static SubLObject transformation_strategy_chooses_not_to_activate_problemP(SubLObject strategy, SubLObject problem) {
        return makeBoolean(NIL != transformation_tactician_datastructures.transformation_strategy_problem_activeP(strategy, problem) || NIL != transformation_tactician_datastructures.transformation_strategy_problem_pendingP(strategy, problem));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 10400L)
    public static SubLObject transformation_strategy_activate_problem(SubLObject strategy, SubLObject problem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return Numbers.plusp(transformation_strategy_possibly_activate_strategems(strategy, problem));
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 10800L)
    public static SubLObject transformation_strategy_possibly_activate_strategems(SubLObject strategy, SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject strategems_to_activate = transformation_strategy_categorize_strategems(strategy, problem);
        SubLObject strategems_to_set_aside = thread.secondMultipleValue();
        SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = strategems_to_activate;
        SubLObject strategem = NIL;
        strategem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            transformation_tactician_datastructures.transformation_strategy_activate_strategem(strategy, strategem);
            cdolist_list_var = cdolist_list_var.rest();
            strategem = cdolist_list_var.first();
        }
        cdolist_list_var = strategems_to_set_aside;
        strategem = NIL;
        strategem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            transformation_tactician_datastructures.transformation_strategy_note_strategem_set_aside(strategy, strategem);
            if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
                inference_datastructures_strategy.set_tactic_set_aside(strategem, strategy, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategem = cdolist_list_var.first();
        }
        cdolist_list_var = strategems_to_throw_away;
        strategem = NIL;
        strategem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            transformation_tactician_datastructures.transformation_strategy_note_strategem_thrown_away(strategy, strategem);
            if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
                inference_datastructures_strategy.set_tactic_thrown_away(strategem, strategy, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategem = cdolist_list_var.first();
        }
        return Sequences.length(strategems_to_activate);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 11600L)
    public static SubLObject transformation_strategy_activate_transformation_argument_links(SubLObject strategy, SubLObject problem) {
        SubLObject count = ZERO_INTEGER;
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        SubLObject supporting_transformed_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
                supporting_transformed_problem = inference_worker_transformation.transformation_link_supporting_problem(transformation_link);
                if (NIL != supporting_transformed_problem && NIL == inference_datastructures_problem.problem_relevant_to_inferenceP(supporting_transformed_problem, inference_datastructures_strategy.strategy_inference(strategy))) {
                    inference_datastructures_inference.add_inference_relevant_problem(inference_datastructures_strategy.strategy_inference(strategy), supporting_transformed_problem);
                    inference_worker.possibly_activate_problem(strategy, supporting_transformed_problem);
                }
                transformation_strategy_possibly_activate_transformation_link(strategy, transformation_link);
                count = Numbers.add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 12700L)
    public static SubLObject transformation_strategy_note_argument_link_added(SubLObject strategy, SubLObject link) {
        if (NIL != inference_worker_transformation.transformation_link_p(link)) {
            transformation_strategy_possibly_activate_transformation_link(strategy, link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 13000L)
    public static SubLObject transformation_strategy_possibly_activate_transformation_link(SubLObject strategy, SubLObject transformation_link) {
        if (NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link) && NIL == transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, transformation_link)) {
            transformation_strategy_activate_transformation_link(strategy, transformation_link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 13500L)
    public static SubLObject transformation_strategy_activate_transformation_link(SubLObject strategy, SubLObject transformation_link) {
        transformation_tactician_datastructures.transformation_strategy_note_problem_unpending(strategy, inference_datastructures_problem_link.problem_link_supported_problem(transformation_link));
        SubLObject transformation_tactic = inference_worker_transformation.transformation_link_tactic(transformation_link);
        if (NIL == transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic, UNPROVIDED, UNPROVIDED)) {
            if (NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic, NIL, NIL, T)) {
                transformation_tactician_datastructures.transformation_strategy_note_strategem_set_aside(strategy, transformation_link);
            } else {
                transformation_tactician_datastructures.transformation_strategy_activate_strategem(strategy, transformation_link);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 14200L)
    public static SubLObject transformation_strategy_note_new_tactic(SubLObject strategy, SubLObject tactic) {
        inference_worker.default_compute_strategic_properties_of_tactic(strategy, tactic);
        if (NIL == inference_worker_split.split_tactic_p(tactic) || NIL == inference_worker_split.meta_split_tactics_enabledP()) {
            if (NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic)) {
                if ((NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy) || NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy)))
                        && NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic)) {
                    if (NIL != inference_tactician.transformation_strategem_p(tactic)) {
                        transformation_tactician_datastructures.transformation_strategy_note_strategem_set_aside(strategy, tactic);
                    }
                } else {
                    transformation_strategy_note_new_tactic_possible(strategy, tactic);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 15100L)
    public static SubLObject transformation_strategy_note_split_tactics_strategically_possible(SubLObject strategy, SubLObject split_tactics) {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactics.first());
        if (NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) {
            SubLObject sorted_split_tactics = inference_tactician.strategy_sort(strategy, conses_high.copy_list(split_tactics), $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
            SubLObject cdolist_list_var = Sequences.reverse(sorted_split_tactics);
            SubLObject split_tactic = NIL;
            split_tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                transformation_strategy_note_new_tactic_possible(strategy, split_tactic);
                cdolist_list_var = cdolist_list_var.rest();
                split_tactic = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 15700L)
    public static SubLObject transformation_strategy_note_new_tactic_possible(SubLObject strategy, SubLObject tactic) {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        inference_datastructures_strategy.problem_note_tactic_strategically_possible(problem, tactic, strategy);
        if ((NIL != inference_worker_split.meta_split_tactics_enabledP() && NIL != inference_worker_split.split_tactic_p(tactic)) || (NIL != inference_worker_transformation.transformation_tactic_p(tactic) && NIL == inference_worker_transformation.meta_transformation_tactic_p(tactic))) {
            SubLObject problem_already_consideredP = T;
            transformation_tactician_datastructures.transformation_strategy_note_problem_unpending(strategy, inference_datastructures_tactic.tactic_problem(tactic));
            if (NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, NIL)) {
                transformation_tactician_datastructures.transformation_strategy_note_strategem_thrown_away(strategy, tactic);
            } else if (NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_tacticP(strategy, tactic, problem_already_consideredP, NIL, T)) {
                transformation_tactician_datastructures.transformation_strategy_note_strategem_set_aside(strategy, tactic);
            } else {
                transformation_tactician_datastructures.transformation_strategy_activate_strategem(strategy, tactic);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 17200L)
    public static SubLObject transformation_strategy_categorize_strategems(SubLObject strategy, SubLObject problem) {
        SubLObject strategems_to_activate = NIL;
        SubLObject strategems_to_set_aside = NIL;
        if (NIL == transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED)) {
            SubLObject problem_set_asideP = transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_problemP(strategy, problem, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject transformation_tactic = NIL;
            transformation_tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, $TRANSFORMATION) && NIL != inference_datastructures_problem.do_problem_tactics_status_match(transformation_tactic, $POSSIBLE)
                        && NIL == transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic, T, UNPROVIDED)) {
                    if (NIL != problem_set_asideP || NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic, T, UNPROVIDED, UNPROVIDED)) {
                        strategems_to_set_aside = cons(transformation_tactic, strategems_to_set_aside);
                    } else {
                        strategems_to_activate = cons(transformation_tactic, strategems_to_activate);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                transformation_tactic = cdolist_list_var.first();
            }
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject transformation_link;
            SubLObject transformation_tactic2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                transformation_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)
                        && NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link) && NIL == transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, transformation_link)) {
                    transformation_tactic2 = inference_worker_transformation.transformation_link_tactic(transformation_link);
                    if (NIL == transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic2, T, UNPROVIDED)) {
                        if (NIL != problem_set_asideP || NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic2, T, UNPROVIDED, UNPROVIDED)) {
                            strategems_to_set_aside = cons(transformation_tactic2, strategems_to_set_aside);
                        } else {
                            strategems_to_activate = cons(transformation_tactic2, strategems_to_activate);
                        }
                    }
                }
            }
            if (NIL == inference_datastructures_problem.single_literal_problem_p(problem)) {
                cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                SubLObject logical_tactic = NIL;
                logical_tactic = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(logical_tactic, $LOGICAL) && NIL == transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, logical_tactic)
                            && NIL == transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_tacticP(strategy, logical_tactic, T, UNPROVIDED)) {
                        if (NIL != problem_set_asideP || NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_tacticP(strategy, logical_tactic, T, UNPROVIDED, UNPROVIDED)) {
                            strategems_to_set_aside = cons(logical_tactic, strategems_to_set_aside);
                        } else {
                            strategems_to_activate = cons(logical_tactic, strategems_to_activate);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    logical_tactic = cdolist_list_var.first();
                }
            }
        }
        strategems_to_activate = Sequences.nreverse(strategems_to_activate);
        strategems_to_set_aside = Sequences.nreverse(strategems_to_set_aside);
        SubLObject strategems_to_throw_away = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject transformation_tactic = NIL;
        transformation_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, $TRANSFORMATION) && NIL != inference_datastructures_problem.do_problem_tactics_status_match(transformation_tactic, $POSSIBLE)
                    && NIL == list_utilities.member_eqP(transformation_tactic, strategems_to_activate) && NIL == list_utilities.member_eqP(transformation_tactic, strategems_to_set_aside)) {
                strategems_to_throw_away = cons(transformation_tactic, strategems_to_throw_away);
            }
            cdolist_list_var = cdolist_list_var.rest();
            transformation_tactic = cdolist_list_var.first();
        }
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION) && NIL == list_utilities.member_eqP(transformation_link, strategems_to_activate)
                    && NIL == list_utilities.member_eqP(transformation_link, strategems_to_set_aside)) {
                strategems_to_throw_away = cons(transformation_link, strategems_to_throw_away);
            }
        }
        cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject logical_tactic = NIL;
        logical_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(logical_tactic, $LOGICAL) && NIL == list_utilities.member_eqP(logical_tactic, strategems_to_activate) && NIL == list_utilities.member_eqP(logical_tactic, strategems_to_set_aside)) {
                strategems_to_throw_away = cons(logical_tactic, strategems_to_throw_away);
            }
            cdolist_list_var = cdolist_list_var.rest();
            logical_tactic = cdolist_list_var.first();
        }
        return Values.values(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 21000L)
    public static SubLObject transformation_strategy_reactivate_executable_strategem(SubLObject strategy, SubLObject strategem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.executable_strategem_p(strategem) : strategem;
        if (NIL != inference_worker_transformation.transformation_tactic_p(strategem)) {
            return transformation_tactician_datastructures.transformation_strategy_activate_strategem(strategy, strategem);
        }
        if (NIL != inference_worker.meta_structural_tactic_p(strategem)) {
            return strategem;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 21500L)
    public static SubLObject transformation_strategy_strategically_deactivate_strategem(SubLObject strategy, SubLObject strategem) {
        if (NIL != inference_tactician.strategem_invalid_p(strategem)) {
            return NIL;
        }
        SubLObject problem = inference_tactician.strategem_problem(strategem);
        transformation_strategy_deactivate_strategem(strategy, strategem);
        transformation_strategy_possibly_deactivate_problem(strategy, problem);
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            inference_worker.consider_strategic_ramifications_of_possibly_executed_tactic(strategy, strategem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 22000L)
    public static SubLObject transformation_strategy_deactivate_strategem(SubLObject strategy, SubLObject strategem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.transformation_strategem_p(strategem) : strategem;
        SubLObject problem = inference_tactician.strategem_problem(strategem);
        SubLObject index = transformation_tactician_datastructures.transformation_strategy_problem_total_strategems_active(strategy);
        SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
        count = Numbers.subtract(count, ONE_INTEGER);
        if (count.isPositive()) {
            dictionary.dictionary_enter(index, problem, count);
        } else {
            dictionary.dictionary_remove(index, problem);
            transformation_tactician_datastructures.transformation_strategy_note_problem_pending(strategy, problem);
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 22600L)
    public static SubLObject transformation_strategy_possibly_deactivate_problem(SubLObject strategy, SubLObject problem) {
        if (NIL == transformation_tactician_datastructures.transformation_strategy_problem_activeP(strategy, problem)) {
            inference_datastructures_strategy.strategy_note_problem_inactive(strategy, problem);
            if (NIL != transformation_tactician_datastructures.transformation_strategy_problem_set_asideP(strategy, problem)) {
                inference_datastructures_strategy.strategy_note_problem_set_aside(strategy, problem);
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 23000L)
    public static SubLObject transformation_strategy_consider_that_problem_could_be_strategically_totally_pending(SubLObject strategy, SubLObject problem) {
        SubLObject pendingP = transformation_strategy_consider_that_problem_could_be_strategically_pending(strategy, problem);
        return pendingP;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 23700L)
    public static SubLObject transformation_strategy_consider_that_problem_could_be_strategically_pending(SubLObject strategy, SubLObject problem) {
        if (NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED)) {
            transformation_strategy_make_problem_pending(strategy, problem);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 24000L)
    public static SubLObject transformation_strategy_make_problem_pending(SubLObject strategy, SubLObject problem) {
        transformation_tactician_datastructures.transformation_strategy_note_problem_pending(strategy, problem);
        transformation_strategy_possibly_deactivate_problem(strategy, problem);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 24200L)
    public static SubLObject transformation_strategy_problem_nothing_to_doP(SubLObject strategy, SubLObject problem) {
        SubLObject master = inference_tactician.controlling_strategy(strategy);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_tacticP(master, tactic, NIL, NIL)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return T;
    }

    public static SubLObject declare_transformation_tactician_motivation_file() {
        declareMacro(me, "transformation_strategy_with_strategically_active_strategem", "TRANSFORMATION-STRATEGY-WITH-STRATEGICALLY-ACTIVE-STRATEGEM");
        declareFunction(myName, "transformation_strategy_possibly_propagate_motivation_to_link_head", "TRANSFORMATION-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
        declareFunction(myName, "transformation_strategy_propagate_motivation_to_link_head", "TRANSFORMATION-STRATEGY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
        declareFunction(myName, "transformation_strategy_link_motivates_problemP", "TRANSFORMATION-STRATEGY-LINK-MOTIVATES-PROBLEM?", 2, 1, false);
        declareFunction(myName, "transformation_strategy_link_motivates_lookahead_problemP", "TRANSFORMATION-STRATEGY-LINK-MOTIVATES-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction(myName, "transformation_strategy_possibly_propagate_motivation_to_problem", "TRANSFORMATION-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction(myName, "transformation_strategy_propagate_motivation_to_problem", "TRANSFORMATION-STRATEGY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction(myName, "transformation_strategy_possibly_activate_problem", "TRANSFORMATION-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction(myName, "transformation_strategy_problem_is_the_rest_of_a_join_orderedP", "TRANSFORMATION-STRATEGY-PROBLEM-IS-THE-REST-OF-A-JOIN-ORDERED?", 2, 0, false);
        declareFunction(myName, "transformation_strategy_possibly_propagate_proof_spec_to_restricted_non_focals", "TRANSFORMATION-STRATEGY-POSSIBLY-PROPAGATE-PROOF-SPEC-TO-RESTRICTED-NON-FOCALS", 2, 0, false);
        declareFunction(myName, "transformation_strategy_chooses_not_to_examine_problemP", "TRANSFORMATION-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
        declareFunction(myName, "transformation_strategy_chooses_not_to_activate_problemP", "TRANSFORMATION-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
        declareFunction(myName, "transformation_strategy_activate_problem", "TRANSFORMATION-STRATEGY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction(myName, "transformation_strategy_possibly_activate_strategems", "TRANSFORMATION-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS", 2, 0, false);
        declareFunction(myName, "transformation_strategy_activate_transformation_argument_links", "TRANSFORMATION-STRATEGY-ACTIVATE-TRANSFORMATION-ARGUMENT-LINKS", 2, 0, false);
        declareFunction(myName, "transformation_strategy_note_argument_link_added", "TRANSFORMATION-STRATEGY-NOTE-ARGUMENT-LINK-ADDED", 2, 0, false);
        declareFunction(myName, "transformation_strategy_possibly_activate_transformation_link", "TRANSFORMATION-STRATEGY-POSSIBLY-ACTIVATE-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction(myName, "transformation_strategy_activate_transformation_link", "TRANSFORMATION-STRATEGY-ACTIVATE-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction(myName, "transformation_strategy_note_new_tactic", "TRANSFORMATION-STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
        declareFunction(myName, "transformation_strategy_note_split_tactics_strategically_possible", "TRANSFORMATION-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
        declareFunction(myName, "transformation_strategy_note_new_tactic_possible", "TRANSFORMATION-STRATEGY-NOTE-NEW-TACTIC-POSSIBLE", 2, 0, false);
        declareFunction(myName, "transformation_strategy_categorize_strategems", "TRANSFORMATION-STRATEGY-CATEGORIZE-STRATEGEMS", 2, 0, false);
        declareFunction(myName, "transformation_strategy_reactivate_executable_strategem", "TRANSFORMATION-STRATEGY-REACTIVATE-EXECUTABLE-STRATEGEM", 2, 0, false);
        declareFunction(myName, "transformation_strategy_strategically_deactivate_strategem", "TRANSFORMATION-STRATEGY-STRATEGICALLY-DEACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction(myName, "transformation_strategy_deactivate_strategem", "TRANSFORMATION-STRATEGY-DEACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction(myName, "transformation_strategy_possibly_deactivate_problem", "TRANSFORMATION-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM", 2, 0, false);
        declareFunction(me, "transformation_strategy_consider_that_problem_could_be_strategically_totally_pending", "TRANSFORMATION-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-TOTALLY-PENDING", 2, 0, false);
        declareFunction(myName, "transformation_strategy_consider_that_problem_could_be_strategically_pending", "TRANSFORMATION-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false);
        declareFunction(myName, "transformation_strategy_make_problem_pending", "TRANSFORMATION-STRATEGY-MAKE-PROBLEM-PENDING", 2, 0, false);
        declareFunction(myName, "transformation_strategy_problem_nothing_to_doP", "TRANSFORMATION-STRATEGY-PROBLEM-NOTHING-TO-DO?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_transformation_tactician_motivation_file() {
        $transformation_strategy_self_looping_rule_fix_enabledP$ = SubLFiles.defparameter("*TRANSFORMATION-STRATEGY-SELF-LOOPING-RULE-FIX-ENABLED?*", T);
        return NIL;
    }

    public static SubLObject setup_transformation_tactician_motivation_file() {
        utilities_macros.note_funcall_helper_function($sym15$TRANSFORMATION_STRATEGY_NOTE_NEW_TACTIC);
        utilities_macros.note_funcall_helper_function($sym17$TRANSFORMATION_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE);
        utilities_macros.note_funcall_helper_function($sym22$TRANSFORMATION_STRATEGY_PROBLEM_NOTHING_TO_DO_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transformation_tactician_motivation_file();
    }

    @Override
    public void initializeVariables() {
        init_transformation_tactician_motivation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transformation_tactician_motivation_file();
    }

    static {
        me = new transformation_tactician_motivation();
        $transformation_strategy_self_looping_rule_fix_enabledP$ = null;
        $list0 = list(list(makeSymbol("STRATEGY"), makeSymbol("STRATEGEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym1$PROBLEM = makeUninternedSymbol("PROBLEM");
        $sym2$STRATEGEM_VAR = makeUninternedSymbol("STRATEGEM-VAR");
        $sym3$CLET = makeSymbol("CLET");
        $sym4$STRATEGEM_PROBLEM = makeSymbol("STRATEGEM-PROBLEM");
        $sym5$TRANSFORMATION_STRATEGY_DEACTIVATE_STRATEGEM = makeSymbol("TRANSFORMATION-STRATEGY-DEACTIVATE-STRATEGEM");
        $sym6$TRANSFORMATION_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM = makeSymbol("TRANSFORMATION-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM");
        $sym7$MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");
        $sym8$TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");
        $SUBSTRATEGY_STRATEGEM_MOTIVATED = makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED");
        $str10$_s_tried_to_propagate_T_to__s_but = makeString("~s tried to propagate T to ~s but it throws away all transformation");
        $RESTRICTION = makeKeyword("RESTRICTION");
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $sym13$PROBLEM_P = makeSymbol("PROBLEM-P");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $sym15$TRANSFORMATION_STRATEGY_NOTE_NEW_TACTIC = makeSymbol("TRANSFORMATION-STRATEGY-NOTE-NEW-TACTIC");
        $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ = makeSymbol("LOGICAL-TACTIC-BETTER-WRT-REMOVAL?");
        $sym17$TRANSFORMATION_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE = makeSymbol("TRANSFORMATION-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE");
        $POSSIBLE = makeKeyword("POSSIBLE");
        $LOGICAL = makeKeyword("LOGICAL");
        $sym20$EXECUTABLE_STRATEGEM_P = makeSymbol("EXECUTABLE-STRATEGEM-P");
        $sym21$TRANSFORMATION_STRATEGEM_P = makeSymbol("TRANSFORMATION-STRATEGEM-P");
        $sym22$TRANSFORMATION_STRATEGY_PROBLEM_NOTHING_TO_DO_ = makeSymbol("TRANSFORMATION-STRATEGY-PROBLEM-NOTHING-TO-DO?");
    }
}
/*
 *
 * Total time: 337 ms
 *
 */