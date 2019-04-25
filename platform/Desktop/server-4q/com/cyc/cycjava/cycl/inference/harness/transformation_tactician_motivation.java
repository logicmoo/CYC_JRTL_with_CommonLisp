package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class transformation_tactician_motivation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation";
    public static final String myFingerPrint = "2f1fc1a1e2ca1d51fd49dbcc04074c88f29c2c7f75d64ae6febf15309a7fe488";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 9255L)
    private static SubLSymbol $transformation_strategy_self_looping_rule_fix_enabledP$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PROBLEM;
    private static final SubLSymbol $sym2$STRATEGEM_VAR;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLSymbol $sym4$STRATEGEM_PROBLEM;
    private static final SubLSymbol $sym5$TRANSFORMATION_STRATEGY_DEACTIVATE_STRATEGEM;
    private static final SubLSymbol $sym6$TRANSFORMATION_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM;
    private static final SubLSymbol $sym7$MOTIVATION_STRATEGEM_P;
    private static final SubLSymbol $sym8$TRANSFORMATION_STRATEGY_P;
    private static final SubLSymbol $kw9$SUBSTRATEGY_STRATEGEM_MOTIVATED;
    private static final SubLString $str10$_s_tried_to_propagate_T_to__s_but;
    private static final SubLSymbol $kw11$RESTRICTION;
    private static final SubLSymbol $kw12$JOIN_ORDERED;
    private static final SubLSymbol $sym13$PROBLEM_P;
    private static final SubLSymbol $kw14$TRANSFORMATION;
    private static final SubLSymbol $sym15$TRANSFORMATION_STRATEGY_NOTE_NEW_TACTIC;
    private static final SubLSymbol $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_;
    private static final SubLSymbol $sym17$TRANSFORMATION_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE;
    private static final SubLSymbol $kw18$POSSIBLE;
    private static final SubLSymbol $kw19$LOGICAL;
    private static final SubLSymbol $sym20$EXECUTABLE_STRATEGEM_P;
    private static final SubLSymbol $sym21$TRANSFORMATION_STRATEGEM_P;
    private static final SubLSymbol $sym22$TRANSFORMATION_STRATEGY_PROBLEM_NOTHING_TO_DO_;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 1055L)
    public static SubLObject transformation_strategy_with_strategically_active_strategem(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_tactician_motivation.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy = (SubLObject)transformation_tactician_motivation.NIL;
        SubLObject strategem = (SubLObject)transformation_tactician_motivation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_tactician_motivation.$list0);
        strategy = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transformation_tactician_motivation.$list0);
        strategem = current.first();
        current = current.rest();
        if (transformation_tactician_motivation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject problem = (SubLObject)transformation_tactician_motivation.$sym1$PROBLEM;
            final SubLObject strategem_var = (SubLObject)transformation_tactician_motivation.$sym2$STRATEGEM_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)transformation_tactician_motivation.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(strategem_var, strategem), (SubLObject)ConsesLow.list(problem, (SubLObject)ConsesLow.list((SubLObject)transformation_tactician_motivation.$sym4$STRATEGEM_PROBLEM, strategem_var))), (SubLObject)ConsesLow.list((SubLObject)transformation_tactician_motivation.$sym5$TRANSFORMATION_STRATEGY_DEACTIVATE_STRATEGEM, strategy, strategem_var), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)transformation_tactician_motivation.$sym6$TRANSFORMATION_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM, strategy, problem))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)transformation_tactician_motivation.$list0);
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 1489L)
    public static SubLObject transformation_strategy_possibly_propagate_motivation_to_link_head(final SubLObject strategy, final SubLObject link_head) {
        assert transformation_tactician_motivation.NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        final SubLObject already_motivatedP = transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, link_head);
        if (transformation_tactician_motivation.NIL == already_motivatedP) {
            transformation_strategy_propagate_motivation_to_link_head(strategy, link_head);
            return (SubLObject)transformation_tactician_motivation.T;
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 1989L)
    public static SubLObject transformation_strategy_propagate_motivation_to_link_head(final SubLObject strategy, final SubLObject link_head) {
        assert transformation_tactician_motivation.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_motivation.NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        transformation_tactician_datastructures.transformation_strategy_note_link_head_motivated(strategy, link_head);
        if (transformation_tactician_motivation.NIL == inference_worker_transformation.transformation_link_p(link_head)) {
            if (transformation_tactician_motivation.NIL != inference_tactician.motivation_strategem_link_p(link_head)) {
                final SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(link_head);
                transformation_strategy_possibly_propagate_motivation_to_problem(strategy, supporting_problem);
            }
            else if (transformation_tactician_motivation.NIL != inference_worker_join.join_tactic_p(link_head)) {
                final SubLObject join_link = inference_worker_join.join_tactic_link(link_head);
                final SubLObject first_problem = inference_worker_join.join_link_first_problem(join_link);
                final SubLObject second_problem = inference_worker_join.join_link_second_problem(join_link);
                transformation_strategy_possibly_propagate_motivation_to_problem(strategy, first_problem);
                transformation_strategy_possibly_propagate_motivation_to_problem(strategy, second_problem);
            }
            else {
                final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(link_head);
                transformation_strategy_possibly_propagate_motivation_to_problem(strategy, lookahead_problem);
            }
        }
        inference_datastructures_strategy.controlling_strategy_callback(strategy, (SubLObject)transformation_tactician_motivation.$kw9$SUBSTRATEGY_STRATEGEM_MOTIVATED, link_head, (SubLObject)transformation_tactician_motivation.UNPROVIDED, (SubLObject)transformation_tactician_motivation.UNPROVIDED, (SubLObject)transformation_tactician_motivation.UNPROVIDED);
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 3578L)
    public static SubLObject transformation_strategy_link_motivates_problemP(final SubLObject strategy, final SubLObject link, SubLObject problem) {
        if (problem == transformation_tactician_motivation.UNPROVIDED) {
            problem = (SubLObject)transformation_tactician_motivation.NIL;
        }
        if (transformation_tactician_motivation.NIL == inference_worker_split.split_link_p(link)) {
            return transformation_strategy_link_motivates_lookahead_problemP(strategy, link);
        }
        SubLObject motivatedP = (SubLObject)transformation_tactician_motivation.NIL;
        final SubLObject problem_var = problem;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)transformation_tactician_motivation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); transformation_tactician_motivation.NIL == motivatedP && transformation_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (transformation_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                link_var = dependent_link;
                for (rest = (SubLObject)transformation_tactician_motivation.NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); transformation_tactician_motivation.NIL == motivatedP && transformation_tactician_motivation.NIL != rest; rest = rest.rest()) {
                    mapped_problem = rest.first();
                    if (transformation_tactician_motivation.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)transformation_tactician_motivation.T, link_var, mapped_problem) && problem_var.eql(inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) {
                        supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                        for (rest_$1 = (SubLObject)transformation_tactician_motivation.NIL, rest_$1 = inference_datastructures_problem.problem_tactics(supported_problem); transformation_tactician_motivation.NIL == motivatedP && transformation_tactician_motivation.NIL != rest_$1; rest_$1 = rest_$1.rest()) {
                            tactic = rest_$1.first();
                            if (transformation_tactician_motivation.NIL != inference_worker_split.split_tactic_p(tactic)) {
                                supporting_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(tactic);
                                if (mapped_problem.eql(supporting_mapped_problem) && transformation_tactician_motivation.NIL != transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, tactic)) {
                                    motivatedP = (SubLObject)transformation_tactician_motivation.T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return motivatedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 4508L)
    public static SubLObject transformation_strategy_link_motivates_lookahead_problemP(final SubLObject strategy, final SubLObject link) {
        if (transformation_tactician_motivation.NIL != inference_tactician.motivation_strategem_link_p(link)) {
            return transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, link);
        }
        if (transformation_tactician_motivation.NIL != inference_worker_split.split_link_p(link)) {
            return (SubLObject)transformation_tactician_motivation.NIL;
        }
        if (transformation_tactician_motivation.NIL != inference_worker.logical_link_p(link)) {
            final SubLObject tactic = inference_worker.logical_link_unique_tactic(link);
            return transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, tactic);
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 4949L)
    public static SubLObject transformation_strategy_possibly_propagate_motivation_to_problem(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transformation_tactician_motivation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && transformation_tactician_motivation.NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
            Errors.error((SubLObject)transformation_tactician_motivation.$str10$_s_tried_to_propagate_T_to__s_but, strategy, problem);
        }
        final SubLObject already_motivatedP = transformation_tactician_datastructures.transformation_strategy_problem_motivatedP(strategy, problem);
        if (transformation_tactician_motivation.NIL == already_motivatedP) {
            transformation_strategy_propagate_motivation_to_problem(strategy, problem);
            return (SubLObject)transformation_tactician_motivation.T;
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 5487L)
    public static SubLObject transformation_strategy_propagate_motivation_to_problem(final SubLObject strategy, final SubLObject problem) {
        transformation_tactician_datastructures.transformation_strategy_note_problem_motivated(strategy, problem);
        if (transformation_tactician_motivation.NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            transformation_strategy_possibly_activate_problem(strategy, problem);
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 5835L)
    public static SubLObject transformation_strategy_possibly_activate_problem(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transformation_tactician_motivation.NIL != transformation_strategy_chooses_not_to_examine_problemP(strategy, problem)) {
            return (SubLObject)transformation_tactician_motivation.NIL;
        }
        inference_worker.determine_strategic_status_wrt(problem, strategy);
        if (transformation_tactician_motivation.NIL != transformation_strategy_chooses_not_to_activate_problemP(strategy, problem)) {
            return (SubLObject)transformation_tactician_motivation.NIL;
        }
        if (transformation_tactician_motivation.NIL != inference_worker_restriction.problem_is_a_simplificationP(problem) && transformation_tactician_motivation.NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread)) {
            transformation_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
        }
        if (transformation_tactician_motivation.NIL != transformation_strategy_problem_is_the_rest_of_a_join_orderedP(problem, strategy)) {
            transformation_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(strategy, problem);
        }
        final SubLObject activateP = (SubLObject)SubLObjectFactory.makeBoolean(transformation_tactician_motivation.NIL != transformation_tactician_datastructures.transformation_strategy_problem_motivatedP(strategy, problem) && transformation_tactician_motivation.NIL == transformation_strategy_chooses_not_to_activate_problemP(strategy, problem));
        if (transformation_tactician_motivation.NIL == activateP) {
            return (SubLObject)transformation_tactician_motivation.NIL;
        }
        if (transformation_tactician_motivation.NIL != transformation_strategy_activate_problem(strategy, problem)) {
            return (SubLObject)transformation_tactician_motivation.T;
        }
        transformation_strategy_make_problem_pending(strategy, problem);
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 7723L)
    public static SubLObject transformation_strategy_problem_is_the_rest_of_a_join_orderedP(final SubLObject problem, final SubLObject strategy) {
        SubLObject part_of_join_orderedP = (SubLObject)transformation_tactician_motivation.NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject restriction_link;
        SubLObject non_focal_problem;
        SubLObject set_contents_var_$2;
        SubLObject basis_object_$3;
        SubLObject state_$4;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)transformation_tactician_motivation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); transformation_tactician_motivation.NIL == part_of_join_orderedP && transformation_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            restriction_link = set_contents.do_set_contents_next(basis_object, state);
            if (transformation_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && transformation_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, (SubLObject)transformation_tactician_motivation.$kw11$RESTRICTION)) {
                non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                set_contents_var_$2 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                for (basis_object_$3 = set_contents.do_set_contents_basis_object(set_contents_var_$2), state_$4 = (SubLObject)transformation_tactician_motivation.NIL, state_$4 = set_contents.do_set_contents_initial_state(basis_object_$3, set_contents_var_$2); transformation_tactician_motivation.NIL == part_of_join_orderedP && transformation_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object_$3, state_$4); state_$4 = set_contents.do_set_contents_update_state(state_$4)) {
                    join_ordered_link = set_contents.do_set_contents_next(basis_object_$3, state_$4);
                    if (transformation_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state_$4, join_ordered_link) && transformation_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, (SubLObject)transformation_tactician_motivation.$kw12$JOIN_ORDERED) && transformation_tactician_motivation.NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link) && non_focal_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link))) {
                        part_of_join_orderedP = (SubLObject)transformation_tactician_motivation.T;
                    }
                }
            }
        }
        return part_of_join_orderedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 8068L)
    public static SubLObject transformation_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(final SubLObject strategy, final SubLObject problem) {
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 9547L)
    public static SubLObject transformation_strategy_chooses_not_to_examine_problemP(final SubLObject strategy, final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_tactician_motivation.NIL != inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem) || transformation_tactician_motivation.NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 10210L)
    public static SubLObject transformation_strategy_chooses_not_to_activate_problemP(final SubLObject strategy, final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(transformation_tactician_motivation.NIL != transformation_tactician_datastructures.transformation_strategy_problem_activeP(strategy, problem) || transformation_tactician_motivation.NIL != transformation_tactician_datastructures.transformation_strategy_problem_pendingP(strategy, problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 10443L)
    public static SubLObject transformation_strategy_activate_problem(final SubLObject strategy, final SubLObject problem) {
        assert transformation_tactician_motivation.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_motivation.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return Numbers.plusp(transformation_strategy_possibly_activate_strategems(strategy, problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 10825L)
    public static SubLObject transformation_strategy_possibly_activate_strategems(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject strategems_to_activate = transformation_strategy_categorize_strategems(strategy, problem);
        final SubLObject strategems_to_set_aside = thread.secondMultipleValue();
        final SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = strategems_to_activate;
        SubLObject strategem = (SubLObject)transformation_tactician_motivation.NIL;
        strategem = cdolist_list_var.first();
        while (transformation_tactician_motivation.NIL != cdolist_list_var) {
            transformation_tactician_datastructures.transformation_strategy_activate_strategem(strategy, strategem);
            cdolist_list_var = cdolist_list_var.rest();
            strategem = cdolist_list_var.first();
        }
        cdolist_list_var = strategems_to_set_aside;
        strategem = (SubLObject)transformation_tactician_motivation.NIL;
        strategem = cdolist_list_var.first();
        while (transformation_tactician_motivation.NIL != cdolist_list_var) {
            transformation_tactician_datastructures.transformation_strategy_note_strategem_set_aside(strategy, strategem);
            if (transformation_tactician_motivation.NIL != inference_datastructures_tactic.tactic_p(strategem)) {
                inference_datastructures_strategy.set_tactic_set_aside(strategem, strategy, (SubLObject)transformation_tactician_motivation.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategem = cdolist_list_var.first();
        }
        cdolist_list_var = strategems_to_throw_away;
        strategem = (SubLObject)transformation_tactician_motivation.NIL;
        strategem = cdolist_list_var.first();
        while (transformation_tactician_motivation.NIL != cdolist_list_var) {
            transformation_tactician_datastructures.transformation_strategy_note_strategem_thrown_away(strategy, strategem);
            if (transformation_tactician_motivation.NIL != inference_datastructures_tactic.tactic_p(strategem)) {
                inference_datastructures_strategy.set_tactic_thrown_away(strategem, strategy, (SubLObject)transformation_tactician_motivation.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategem = cdolist_list_var.first();
        }
        return Sequences.length(strategems_to_activate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 11660L)
    public static SubLObject transformation_strategy_activate_transformation_argument_links(final SubLObject strategy, final SubLObject problem) {
        SubLObject count = (SubLObject)transformation_tactician_motivation.ZERO_INTEGER;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        SubLObject supporting_transformed_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)transformation_tactician_motivation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); transformation_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if (transformation_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && transformation_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, (SubLObject)transformation_tactician_motivation.$kw14$TRANSFORMATION)) {
                supporting_transformed_problem = inference_worker_transformation.transformation_link_supporting_problem(transformation_link);
                if (transformation_tactician_motivation.NIL != supporting_transformed_problem && transformation_tactician_motivation.NIL == inference_datastructures_problem.problem_relevant_to_inferenceP(supporting_transformed_problem, inference_datastructures_strategy.strategy_inference(strategy))) {
                    inference_datastructures_inference.add_inference_relevant_problem(inference_datastructures_strategy.strategy_inference(strategy), supporting_transformed_problem);
                    inference_worker.possibly_activate_problem(strategy, supporting_transformed_problem);
                }
                transformation_strategy_possibly_activate_transformation_link(strategy, transformation_link);
                count = Numbers.add(count, (SubLObject)transformation_tactician_motivation.ONE_INTEGER);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 12735L)
    public static SubLObject transformation_strategy_note_argument_link_added(final SubLObject strategy, final SubLObject link) {
        if (transformation_tactician_motivation.NIL != inference_worker_transformation.transformation_link_p(link)) {
            transformation_strategy_possibly_activate_transformation_link(strategy, link);
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 13066L)
    public static SubLObject transformation_strategy_possibly_activate_transformation_link(final SubLObject strategy, final SubLObject transformation_link) {
        if (transformation_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link) && transformation_tactician_motivation.NIL == transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, transformation_link)) {
            transformation_strategy_activate_transformation_link(strategy, transformation_link);
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 13513L)
    public static SubLObject transformation_strategy_activate_transformation_link(final SubLObject strategy, final SubLObject transformation_link) {
        transformation_tactician_datastructures.transformation_strategy_note_problem_unpending(strategy, inference_datastructures_problem_link.problem_link_supported_problem(transformation_link));
        final SubLObject transformation_tactic = inference_worker_transformation.transformation_link_tactic(transformation_link);
        if (transformation_tactician_motivation.NIL == transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic, (SubLObject)transformation_tactician_motivation.UNPROVIDED, (SubLObject)transformation_tactician_motivation.UNPROVIDED)) {
            if (transformation_tactician_motivation.NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic, (SubLObject)transformation_tactician_motivation.NIL, (SubLObject)transformation_tactician_motivation.NIL, (SubLObject)transformation_tactician_motivation.T)) {
                transformation_tactician_datastructures.transformation_strategy_note_strategem_set_aside(strategy, transformation_link);
            }
            else {
                transformation_tactician_datastructures.transformation_strategy_activate_strategem(strategy, transformation_link);
            }
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 14254L)
    public static SubLObject transformation_strategy_note_new_tactic(final SubLObject strategy, final SubLObject tactic) {
        inference_worker.default_compute_strategic_properties_of_tactic(strategy, tactic);
        if (transformation_tactician_motivation.NIL == inference_worker_split.split_tactic_p(tactic) || transformation_tactician_motivation.NIL == inference_worker_split.meta_split_tactics_enabledP()) {
            if (transformation_tactician_motivation.NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_throw_away_tacticP(strategy, tactic)) {
                if ((transformation_tactician_motivation.NIL != inference_tactician.strategy_set_aside_non_continuable_implies_throw_awayP(strategy) || transformation_tactician_motivation.NIL != inference_datastructures_inference.inference_continuableP(inference_datastructures_strategy.strategy_inference(strategy))) && transformation_tactician_motivation.NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_set_aside_tacticP(strategy, tactic)) {
                    if (transformation_tactician_motivation.NIL != inference_tactician.transformation_strategem_p(tactic)) {
                        transformation_tactician_datastructures.transformation_strategy_note_strategem_set_aside(strategy, tactic);
                    }
                }
                else {
                    transformation_strategy_note_new_tactic_possible(strategy, tactic);
                }
            }
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 15119L)
    public static SubLObject transformation_strategy_note_split_tactics_strategically_possible(final SubLObject strategy, final SubLObject split_tactics) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactics.first());
        if (transformation_tactician_motivation.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) {
            final SubLObject sorted_split_tactics = inference_tactician.strategy_sort(strategy, conses_high.copy_list(split_tactics), (SubLObject)transformation_tactician_motivation.$sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
            SubLObject cdolist_list_var = Sequences.reverse(sorted_split_tactics);
            SubLObject split_tactic = (SubLObject)transformation_tactician_motivation.NIL;
            split_tactic = cdolist_list_var.first();
            while (transformation_tactician_motivation.NIL != cdolist_list_var) {
                transformation_strategy_note_new_tactic_possible(strategy, split_tactic);
                cdolist_list_var = cdolist_list_var.rest();
                split_tactic = cdolist_list_var.first();
            }
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 15720L)
    public static SubLObject transformation_strategy_note_new_tactic_possible(final SubLObject strategy, final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        inference_datastructures_strategy.problem_note_tactic_strategically_possible(problem, tactic, strategy);
        if ((transformation_tactician_motivation.NIL != inference_worker_split.meta_split_tactics_enabledP() && transformation_tactician_motivation.NIL != inference_worker_split.split_tactic_p(tactic)) || (transformation_tactician_motivation.NIL != inference_worker_transformation.transformation_tactic_p(tactic) && transformation_tactician_motivation.NIL == inference_worker_transformation.meta_transformation_tactic_p(tactic))) {
            final SubLObject problem_already_consideredP = (SubLObject)transformation_tactician_motivation.T;
            transformation_tactician_datastructures.transformation_strategy_note_problem_unpending(strategy, inference_datastructures_tactic.tactic_problem(tactic));
            if (transformation_tactician_motivation.NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, (SubLObject)transformation_tactician_motivation.NIL)) {
                transformation_tactician_datastructures.transformation_strategy_note_strategem_thrown_away(strategy, tactic);
            }
            else if (transformation_tactician_motivation.NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_tacticP(strategy, tactic, problem_already_consideredP, (SubLObject)transformation_tactician_motivation.NIL, (SubLObject)transformation_tactician_motivation.T)) {
                transformation_tactician_datastructures.transformation_strategy_note_strategem_set_aside(strategy, tactic);
            }
            else {
                transformation_tactician_datastructures.transformation_strategy_activate_strategem(strategy, tactic);
            }
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 17268L)
    public static SubLObject transformation_strategy_categorize_strategems(final SubLObject strategy, final SubLObject problem) {
        SubLObject strategems_to_activate = (SubLObject)transformation_tactician_motivation.NIL;
        SubLObject strategems_to_set_aside = (SubLObject)transformation_tactician_motivation.NIL;
        if (transformation_tactician_motivation.NIL == transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_problemP(strategy, problem, (SubLObject)transformation_tactician_motivation.UNPROVIDED)) {
            final SubLObject problem_set_asideP = transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_problemP(strategy, problem, (SubLObject)transformation_tactician_motivation.UNPROVIDED, (SubLObject)transformation_tactician_motivation.UNPROVIDED);
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject transformation_tactic = (SubLObject)transformation_tactician_motivation.NIL;
            transformation_tactic = cdolist_list_var.first();
            while (transformation_tactician_motivation.NIL != cdolist_list_var) {
                if (transformation_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, (SubLObject)transformation_tactician_motivation.$kw14$TRANSFORMATION) && transformation_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_status_match(transformation_tactic, (SubLObject)transformation_tactician_motivation.$kw18$POSSIBLE) && transformation_tactician_motivation.NIL == transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic, (SubLObject)transformation_tactician_motivation.T, (SubLObject)transformation_tactician_motivation.UNPROVIDED)) {
                    if (transformation_tactician_motivation.NIL != problem_set_asideP || transformation_tactician_motivation.NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic, (SubLObject)transformation_tactician_motivation.T, (SubLObject)transformation_tactician_motivation.UNPROVIDED, (SubLObject)transformation_tactician_motivation.UNPROVIDED)) {
                        strategems_to_set_aside = (SubLObject)ConsesLow.cons(transformation_tactic, strategems_to_set_aside);
                    }
                    else {
                        strategems_to_activate = (SubLObject)ConsesLow.cons(transformation_tactic, strategems_to_activate);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                transformation_tactic = cdolist_list_var.first();
            }
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject transformation_link;
            SubLObject transformation_tactic2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)transformation_tactician_motivation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); transformation_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                transformation_link = set_contents.do_set_contents_next(basis_object, state);
                if (transformation_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && transformation_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, (SubLObject)transformation_tactician_motivation.$kw14$TRANSFORMATION) && transformation_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link) && transformation_tactician_motivation.NIL == transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, transformation_link)) {
                    transformation_tactic2 = inference_worker_transformation.transformation_link_tactic(transformation_link);
                    if (transformation_tactician_motivation.NIL == transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_tacticP(strategy, transformation_tactic2, (SubLObject)transformation_tactician_motivation.T, (SubLObject)transformation_tactician_motivation.UNPROVIDED)) {
                        if (transformation_tactician_motivation.NIL != problem_set_asideP || transformation_tactician_motivation.NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_tacticP(strategy, transformation_tactic2, (SubLObject)transformation_tactician_motivation.T, (SubLObject)transformation_tactician_motivation.UNPROVIDED, (SubLObject)transformation_tactician_motivation.UNPROVIDED)) {
                            strategems_to_set_aside = (SubLObject)ConsesLow.cons(transformation_tactic2, strategems_to_set_aside);
                        }
                        else {
                            strategems_to_activate = (SubLObject)ConsesLow.cons(transformation_tactic2, strategems_to_activate);
                        }
                    }
                }
            }
            if (transformation_tactician_motivation.NIL == inference_datastructures_problem.single_literal_problem_p(problem)) {
                cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                SubLObject logical_tactic = (SubLObject)transformation_tactician_motivation.NIL;
                logical_tactic = cdolist_list_var.first();
                while (transformation_tactician_motivation.NIL != cdolist_list_var) {
                    if (transformation_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(logical_tactic, (SubLObject)transformation_tactician_motivation.$kw19$LOGICAL) && transformation_tactician_motivation.NIL == transformation_tactician_datastructures.transformation_strategy_link_head_motivatedP(strategy, logical_tactic) && transformation_tactician_motivation.NIL == transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_tacticP(strategy, logical_tactic, (SubLObject)transformation_tactician_motivation.T, (SubLObject)transformation_tactician_motivation.UNPROVIDED)) {
                        if (transformation_tactician_motivation.NIL != problem_set_asideP || transformation_tactician_motivation.NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_set_aside_tacticP(strategy, logical_tactic, (SubLObject)transformation_tactician_motivation.T, (SubLObject)transformation_tactician_motivation.UNPROVIDED, (SubLObject)transformation_tactician_motivation.UNPROVIDED)) {
                            strategems_to_set_aside = (SubLObject)ConsesLow.cons(logical_tactic, strategems_to_set_aside);
                        }
                        else {
                            strategems_to_activate = (SubLObject)ConsesLow.cons(logical_tactic, strategems_to_activate);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    logical_tactic = cdolist_list_var.first();
                }
            }
        }
        strategems_to_activate = Sequences.nreverse(strategems_to_activate);
        strategems_to_set_aside = Sequences.nreverse(strategems_to_set_aside);
        SubLObject strategems_to_throw_away = (SubLObject)transformation_tactician_motivation.NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject transformation_tactic = (SubLObject)transformation_tactician_motivation.NIL;
        transformation_tactic = cdolist_list_var.first();
        while (transformation_tactician_motivation.NIL != cdolist_list_var) {
            if (transformation_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, (SubLObject)transformation_tactician_motivation.$kw14$TRANSFORMATION) && transformation_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_status_match(transformation_tactic, (SubLObject)transformation_tactician_motivation.$kw18$POSSIBLE) && transformation_tactician_motivation.NIL == list_utilities.member_eqP(transformation_tactic, strategems_to_activate) && transformation_tactician_motivation.NIL == list_utilities.member_eqP(transformation_tactic, strategems_to_set_aside)) {
                strategems_to_throw_away = (SubLObject)ConsesLow.cons(transformation_tactic, strategems_to_throw_away);
            }
            cdolist_list_var = cdolist_list_var.rest();
            transformation_tactic = cdolist_list_var.first();
        }
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)transformation_tactician_motivation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); transformation_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if (transformation_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && transformation_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, (SubLObject)transformation_tactician_motivation.$kw14$TRANSFORMATION) && transformation_tactician_motivation.NIL == list_utilities.member_eqP(transformation_link, strategems_to_activate) && transformation_tactician_motivation.NIL == list_utilities.member_eqP(transformation_link, strategems_to_set_aside)) {
                strategems_to_throw_away = (SubLObject)ConsesLow.cons(transformation_link, strategems_to_throw_away);
            }
        }
        cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject logical_tactic = (SubLObject)transformation_tactician_motivation.NIL;
        logical_tactic = cdolist_list_var.first();
        while (transformation_tactician_motivation.NIL != cdolist_list_var) {
            if (transformation_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(logical_tactic, (SubLObject)transformation_tactician_motivation.$kw19$LOGICAL) && transformation_tactician_motivation.NIL == list_utilities.member_eqP(logical_tactic, strategems_to_activate) && transformation_tactician_motivation.NIL == list_utilities.member_eqP(logical_tactic, strategems_to_set_aside)) {
                strategems_to_throw_away = (SubLObject)ConsesLow.cons(logical_tactic, strategems_to_throw_away);
            }
            cdolist_list_var = cdolist_list_var.rest();
            logical_tactic = cdolist_list_var.first();
        }
        return Values.values(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 21068L)
    public static SubLObject transformation_strategy_reactivate_executable_strategem(final SubLObject strategy, final SubLObject strategem) {
        assert transformation_tactician_motivation.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_motivation.NIL != inference_tactician.executable_strategem_p(strategem) : strategem;
        if (transformation_tactician_motivation.NIL != inference_worker_transformation.transformation_tactic_p(strategem)) {
            return transformation_tactician_datastructures.transformation_strategy_activate_strategem(strategy, strategem);
        }
        if (transformation_tactician_motivation.NIL != inference_worker.meta_structural_tactic_p(strategem)) {
            return strategem;
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 21585L)
    public static SubLObject transformation_strategy_strategically_deactivate_strategem(final SubLObject strategy, final SubLObject strategem) {
        if (transformation_tactician_motivation.NIL != inference_tactician.strategem_invalid_p(strategem)) {
            return (SubLObject)transformation_tactician_motivation.NIL;
        }
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        transformation_strategy_deactivate_strategem(strategy, strategem);
        transformation_strategy_possibly_deactivate_problem(strategy, problem);
        if (transformation_tactician_motivation.NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            inference_worker.consider_strategic_ramifications_of_possibly_executed_tactic(strategy, strategem);
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 22087L)
    public static SubLObject transformation_strategy_deactivate_strategem(final SubLObject strategy, final SubLObject strategem) {
        assert transformation_tactician_motivation.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : strategy;
        assert transformation_tactician_motivation.NIL != inference_tactician.transformation_strategem_p(strategem) : strategem;
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        final SubLObject index = transformation_tactician_datastructures.transformation_strategy_problem_total_strategems_active(strategy);
        SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, (SubLObject)transformation_tactician_motivation.ZERO_INTEGER);
        count = Numbers.subtract(count, (SubLObject)transformation_tactician_motivation.ONE_INTEGER);
        if (count.isPositive()) {
            dictionary.dictionary_enter(index, problem, count);
        }
        else {
            dictionary.dictionary_remove(index, problem);
            transformation_tactician_datastructures.transformation_strategy_note_problem_pending(strategy, problem);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 22682L)
    public static SubLObject transformation_strategy_possibly_deactivate_problem(final SubLObject strategy, final SubLObject problem) {
        if (transformation_tactician_motivation.NIL == transformation_tactician_datastructures.transformation_strategy_problem_activeP(strategy, problem)) {
            inference_datastructures_strategy.strategy_note_problem_inactive(strategy, problem);
            if (transformation_tactician_motivation.NIL != transformation_tactician_datastructures.transformation_strategy_problem_set_asideP(strategy, problem)) {
                inference_datastructures_strategy.strategy_note_problem_set_aside(strategy, problem);
                return (SubLObject)transformation_tactician_motivation.T;
            }
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 23060L)
    public static SubLObject transformation_strategy_consider_that_problem_could_be_strategically_totally_pending(final SubLObject strategy, final SubLObject problem) {
        final SubLObject pendingP = transformation_strategy_consider_that_problem_could_be_strategically_pending(strategy, problem);
        return pendingP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 23775L)
    public static SubLObject transformation_strategy_consider_that_problem_could_be_strategically_pending(final SubLObject strategy, final SubLObject problem) {
        if (transformation_tactician_motivation.NIL != transformation_tactician_uninterestingness.transformation_strategy_chooses_to_throw_away_problemP(strategy, problem, (SubLObject)transformation_tactician_motivation.UNPROVIDED)) {
            transformation_strategy_make_problem_pending(strategy, problem);
            return (SubLObject)transformation_tactician_motivation.T;
        }
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 24065L)
    public static SubLObject transformation_strategy_make_problem_pending(final SubLObject strategy, final SubLObject problem) {
        transformation_tactician_datastructures.transformation_strategy_note_problem_pending(strategy, problem);
        transformation_strategy_possibly_deactivate_problem(strategy, problem);
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/transformation-tactician-motivation.lisp", position = 24298L)
    public static SubLObject transformation_strategy_problem_nothing_to_doP(final SubLObject strategy, final SubLObject problem) {
        final SubLObject master = inference_tactician.controlling_strategy(strategy);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)transformation_tactician_motivation.NIL;
        tactic = cdolist_list_var.first();
        while (transformation_tactician_motivation.NIL != cdolist_list_var) {
            if (transformation_tactician_motivation.NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_tacticP(master, tactic, (SubLObject)transformation_tactician_motivation.NIL, (SubLObject)transformation_tactician_motivation.NIL)) {
                return (SubLObject)transformation_tactician_motivation.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)transformation_tactician_motivation.T;
    }
    
    public static SubLObject declare_transformation_tactician_motivation_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_with_strategically_active_strategem", "TRANSFORMATION-STRATEGY-WITH-STRATEGICALLY-ACTIVE-STRATEGEM");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_possibly_propagate_motivation_to_link_head", "TRANSFORMATION-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_propagate_motivation_to_link_head", "TRANSFORMATION-STRATEGY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_link_motivates_problemP", "TRANSFORMATION-STRATEGY-LINK-MOTIVATES-PROBLEM?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_link_motivates_lookahead_problemP", "TRANSFORMATION-STRATEGY-LINK-MOTIVATES-LOOKAHEAD-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_possibly_propagate_motivation_to_problem", "TRANSFORMATION-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_propagate_motivation_to_problem", "TRANSFORMATION-STRATEGY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_possibly_activate_problem", "TRANSFORMATION-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_problem_is_the_rest_of_a_join_orderedP", "TRANSFORMATION-STRATEGY-PROBLEM-IS-THE-REST-OF-A-JOIN-ORDERED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_possibly_propagate_proof_spec_to_restricted_non_focals", "TRANSFORMATION-STRATEGY-POSSIBLY-PROPAGATE-PROOF-SPEC-TO-RESTRICTED-NON-FOCALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_chooses_not_to_examine_problemP", "TRANSFORMATION-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_chooses_not_to_activate_problemP", "TRANSFORMATION-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_activate_problem", "TRANSFORMATION-STRATEGY-ACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_possibly_activate_strategems", "TRANSFORMATION-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_activate_transformation_argument_links", "TRANSFORMATION-STRATEGY-ACTIVATE-TRANSFORMATION-ARGUMENT-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_note_argument_link_added", "TRANSFORMATION-STRATEGY-NOTE-ARGUMENT-LINK-ADDED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_possibly_activate_transformation_link", "TRANSFORMATION-STRATEGY-POSSIBLY-ACTIVATE-TRANSFORMATION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_activate_transformation_link", "TRANSFORMATION-STRATEGY-ACTIVATE-TRANSFORMATION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_note_new_tactic", "TRANSFORMATION-STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_note_split_tactics_strategically_possible", "TRANSFORMATION-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_note_new_tactic_possible", "TRANSFORMATION-STRATEGY-NOTE-NEW-TACTIC-POSSIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_categorize_strategems", "TRANSFORMATION-STRATEGY-CATEGORIZE-STRATEGEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_reactivate_executable_strategem", "TRANSFORMATION-STRATEGY-REACTIVATE-EXECUTABLE-STRATEGEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_strategically_deactivate_strategem", "TRANSFORMATION-STRATEGY-STRATEGICALLY-DEACTIVATE-STRATEGEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_deactivate_strategem", "TRANSFORMATION-STRATEGY-DEACTIVATE-STRATEGEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_possibly_deactivate_problem", "TRANSFORMATION-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_consider_that_problem_could_be_strategically_totally_pending", "TRANSFORMATION-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-TOTALLY-PENDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_consider_that_problem_could_be_strategically_pending", "TRANSFORMATION-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_make_problem_pending", "TRANSFORMATION-STRATEGY-MAKE-PROBLEM-PENDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.transformation_tactician_motivation", "transformation_strategy_problem_nothing_to_doP", "TRANSFORMATION-STRATEGY-PROBLEM-NOTHING-TO-DO?", 2, 0, false);
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    public static SubLObject init_transformation_tactician_motivation_file() {
        transformation_tactician_motivation.$transformation_strategy_self_looping_rule_fix_enabledP$ = SubLFiles.defparameter("*TRANSFORMATION-STRATEGY-SELF-LOOPING-RULE-FIX-ENABLED?*", (SubLObject)transformation_tactician_motivation.T);
        return (SubLObject)transformation_tactician_motivation.NIL;
    }
    
    public static SubLObject setup_transformation_tactician_motivation_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)transformation_tactician_motivation.$sym15$TRANSFORMATION_STRATEGY_NOTE_NEW_TACTIC);
        utilities_macros.note_funcall_helper_function((SubLObject)transformation_tactician_motivation.$sym17$TRANSFORMATION_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE);
        utilities_macros.note_funcall_helper_function((SubLObject)transformation_tactician_motivation.$sym22$TRANSFORMATION_STRATEGY_PROBLEM_NOTHING_TO_DO_);
        return (SubLObject)transformation_tactician_motivation.NIL;
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
        me = (SubLFile)new transformation_tactician_motivation();
        transformation_tactician_motivation.$transformation_strategy_self_looping_rule_fix_enabledP$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGEM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$PROBLEM = SubLObjectFactory.makeUninternedSymbol("PROBLEM");
        $sym2$STRATEGEM_VAR = SubLObjectFactory.makeUninternedSymbol("STRATEGEM-VAR");
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym4$STRATEGEM_PROBLEM = SubLObjectFactory.makeSymbol("STRATEGEM-PROBLEM");
        $sym5$TRANSFORMATION_STRATEGY_DEACTIVATE_STRATEGEM = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-DEACTIVATE-STRATEGEM");
        $sym6$TRANSFORMATION_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM");
        $sym7$MOTIVATION_STRATEGEM_P = SubLObjectFactory.makeSymbol("MOTIVATION-STRATEGEM-P");
        $sym8$TRANSFORMATION_STRATEGY_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-P");
        $kw9$SUBSTRATEGY_STRATEGEM_MOTIVATED = SubLObjectFactory.makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED");
        $str10$_s_tried_to_propagate_T_to__s_but = SubLObjectFactory.makeString("~s tried to propagate T to ~s but it throws away all transformation");
        $kw11$RESTRICTION = SubLObjectFactory.makeKeyword("RESTRICTION");
        $kw12$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $sym13$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $kw14$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $sym15$TRANSFORMATION_STRATEGY_NOTE_NEW_TACTIC = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-NOTE-NEW-TACTIC");
        $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ = SubLObjectFactory.makeSymbol("LOGICAL-TACTIC-BETTER-WRT-REMOVAL?");
        $sym17$TRANSFORMATION_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE");
        $kw18$POSSIBLE = SubLObjectFactory.makeKeyword("POSSIBLE");
        $kw19$LOGICAL = SubLObjectFactory.makeKeyword("LOGICAL");
        $sym20$EXECUTABLE_STRATEGEM_P = SubLObjectFactory.makeSymbol("EXECUTABLE-STRATEGEM-P");
        $sym21$TRANSFORMATION_STRATEGEM_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGEM-P");
        $sym22$TRANSFORMATION_STRATEGY_PROBLEM_NOTHING_TO_DO_ = SubLObjectFactory.makeSymbol("TRANSFORMATION-STRATEGY-PROBLEM-NOTHING-TO-DO?");
    }
}

/*

	Total time: 337 ms
	
*/