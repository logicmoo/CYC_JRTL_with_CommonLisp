package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_tactician_motivation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation";
    public static final String myFingerPrint = "1216b00d69a9eaede323d81c8698b10a8b3062a3d93d6f8f10ab29b0c39b3213";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 12180L)
    private static SubLSymbol $removal_strategy_rl_tactician_tactic_types$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PROBLEM;
    private static final SubLSymbol $sym2$STRATEGEM_VAR;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLSymbol $sym4$STRATEGEM_PROBLEM;
    private static final SubLSymbol $sym5$REMOVAL_STRATEGY_DEACTIVATE_STRATEGEM;
    private static final SubLSymbol $sym6$REMOVAL_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM;
    private static final SubLSymbol $sym7$MOTIVATION_STRATEGEM_P;
    private static final SubLSymbol $sym8$REMOVAL_STRATEGY_P;
    private static final SubLSymbol $kw9$JOIN_ORDERED;
    private static final SubLSymbol $kw10$PROVEN;
    private static final SubLSymbol $kw11$RESTRICTION;
    private static final SubLSymbol $kw12$REWRITE;
    private static final SubLSymbol $sym13$PROBLEM_P;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$REMOVAL_STRATEGY_NOTE_NEW_TACTIC;
    private static final SubLSymbol $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_;
    private static final SubLSymbol $sym17$REMOVAL_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE;
    private static final SubLSymbol $kw18$META_STRUCTURAL;
    private static final SubLSymbol $kw19$GENERALIZED_REMOVAL_OR_REWRITE;
    private static final SubLSymbol $kw20$POSSIBLE;
    private static final SubLSymbol $kw21$COMPLETE;
    private static final SubLSymbol $kw22$INCOMPLETE;
    private static final SubLSymbol $kw23$GROSSLY_INCOMPLETE;
    private static final SubLSymbol $sym24$TACTIC_STRATEGIC_PRODUCTIVITY__;
    private static final SubLSymbol $kw25$DISJUNCTIVE;
    private static final SubLSymbol $kw26$SPLIT;
    private static final SubLSymbol $kw27$NON_DISCARDED;
    private static final SubLSymbol $kw28$POSITIVE_INFINITY;
    private static final SubLSymbol $kw29$DISALLOWED;
    private static final SubLSymbol $kw30$CONNECTED_CONJUNCTION;
    private static final SubLSymbol $kw31$JOIN;
    private static final SubLSymbol $kw32$PREFERRED;
    private static final SubLSymbol $sym33$SPLIT_TACTIC_P;
    private static final SubLSymbol $sym34$EXECUTABLE_STRATEGEM_P;
    private static final SubLSymbol $sym35$REMOVAL_STRATEGEM_P;
    private static final SubLSymbol $sym36$REMOVAL_STRATEGY_CONSIDER_THAT_PROBLEM_COULD_BE_STRATEGICALLY_PEN;
    private static final SubLSymbol $sym37$REMOVAL_STRATEGY_PROBLEM_NOTHING_TO_DO_;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 1043L)
    public static SubLObject removal_strategy_with_strategically_active_strategem(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_tactician_motivation.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject strategem = (SubLObject)removal_tactician_motivation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_tactician_motivation.$list0);
        strategy = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_tactician_motivation.$list0);
        strategem = current.first();
        current = current.rest();
        if (removal_tactician_motivation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject problem = (SubLObject)removal_tactician_motivation.$sym1$PROBLEM;
            final SubLObject strategem_var = (SubLObject)removal_tactician_motivation.$sym2$STRATEGEM_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)removal_tactician_motivation.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(strategem_var, strategem), (SubLObject)ConsesLow.list(problem, (SubLObject)ConsesLow.list((SubLObject)removal_tactician_motivation.$sym4$STRATEGEM_PROBLEM, strategem_var))), (SubLObject)ConsesLow.list((SubLObject)removal_tactician_motivation.$sym5$REMOVAL_STRATEGY_DEACTIVATE_STRATEGEM, strategy, strategem_var), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)removal_tactician_motivation.$sym6$REMOVAL_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM, strategy, problem))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_tactician_motivation.$list0);
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 1456L)
    public static SubLObject removal_strategy_possibly_propagate_motivation_to_link_head(final SubLObject strategy, final SubLObject link_head) {
        assert removal_tactician_motivation.NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        final SubLObject already_motivatedP = removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, link_head);
        if (removal_tactician_motivation.NIL == already_motivatedP) {
            removal_strategy_propagate_motivation_to_link_head(strategy, link_head);
            return (SubLObject)removal_tactician_motivation.T;
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 1935L)
    public static SubLObject removal_strategy_propagate_motivation_to_link_head(final SubLObject strategy, final SubLObject link_head) {
        assert removal_tactician_motivation.NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert removal_tactician_motivation.NIL != inference_tactician.motivation_strategem_p(link_head) : link_head;
        removal_tactician_datastructures.removal_strategy_note_link_head_motivated(strategy, link_head);
        if (removal_tactician_motivation.NIL == inference_worker_transformation.transformation_link_p(link_head)) {
            if (removal_tactician_motivation.NIL != inference_tactician.motivation_strategem_link_p(link_head)) {
                final SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(link_head);
                removal_strategy_possibly_propagate_motivation_to_problem(strategy, supporting_problem);
            }
            else if (removal_tactician_motivation.NIL != inference_worker_join.join_tactic_p(link_head)) {
                final SubLObject join_link = inference_worker_join.join_tactic_link(link_head);
                final SubLObject first_problem = inference_worker_join.join_link_first_problem(join_link);
                final SubLObject second_problem = inference_worker_join.join_link_second_problem(join_link);
                removal_strategy_possibly_propagate_motivation_to_problem(strategy, first_problem);
                removal_strategy_possibly_propagate_motivation_to_problem(strategy, second_problem);
            }
            else {
                final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(link_head);
                removal_strategy_possibly_propagate_motivation_to_problem(strategy, lookahead_problem);
            }
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 3245L)
    public static SubLObject removal_strategy_link_motivates_problemP(final SubLObject strategy, final SubLObject link, SubLObject problem) {
        if (problem == removal_tactician_motivation.UNPROVIDED) {
            problem = (SubLObject)removal_tactician_motivation.NIL;
        }
        if (removal_tactician_motivation.NIL == inference_worker_split.split_link_p(link)) {
            return removal_strategy_link_motivates_lookahead_problemP(strategy, link);
        }
        SubLObject motivatedP = (SubLObject)removal_tactician_motivation.NIL;
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_tactician_motivation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_tactician_motivation.NIL == motivatedP && removal_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (removal_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                link_var = dependent_link;
                for (rest = (SubLObject)removal_tactician_motivation.NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); removal_tactician_motivation.NIL == motivatedP && removal_tactician_motivation.NIL != rest; rest = rest.rest()) {
                    mapped_problem = rest.first();
                    if (removal_tactician_motivation.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)removal_tactician_motivation.T, link_var, mapped_problem) && problem_var.eql(inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) {
                        supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                        for (rest_$1 = (SubLObject)removal_tactician_motivation.NIL, rest_$1 = inference_datastructures_problem.problem_tactics(supported_problem); removal_tactician_motivation.NIL == motivatedP && removal_tactician_motivation.NIL != rest_$1; rest_$1 = rest_$1.rest()) {
                            tactic = rest_$1.first();
                            if (removal_tactician_motivation.NIL != inference_worker_split.split_tactic_p(tactic)) {
                                supporting_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(tactic);
                                if (mapped_problem.eql(supporting_mapped_problem) && removal_tactician_motivation.NIL != removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, tactic)) {
                                    motivatedP = (SubLObject)removal_tactician_motivation.T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return motivatedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 4154L)
    public static SubLObject removal_strategy_link_motivates_lookahead_problemP(final SubLObject strategy, final SubLObject link) {
        if (removal_tactician_motivation.NIL != inference_tactician.motivation_strategem_link_p(link)) {
            return removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, link);
        }
        if (removal_tactician_motivation.NIL != inference_worker_split.split_link_p(link)) {
            return (SubLObject)removal_tactician_motivation.NIL;
        }
        if (removal_tactician_motivation.NIL != inference_worker.logical_link_p(link)) {
            final SubLObject tactic = inference_worker.logical_link_unique_tactic(link);
            return removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, tactic);
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 4574L)
    public static SubLObject removal_strategy_possibly_propagate_motivation_to_problem(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_motivatedP = inference_datastructures_strategy.problem_motivatedP(problem, strategy);
        if (removal_tactician_motivation.NIL == already_motivatedP) {
            removal_tactician_datastructures.removal_strategy_note_problem_motivated(strategy, problem);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject join_ordered_link;
            SubLObject link_var;
            SubLObject cdolist_list_var;
            SubLObject mapped_problem;
            SubLObject status_var;
            SubLObject iteration_state;
            SubLObject v_bindings;
            SubLObject proof_list;
            SubLObject cdolist_list_var_$2;
            SubLObject proof;
            SubLObject restricted_non_focal_mapped_problem;
            SubLObject restricted_non_focal_problem;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_tactician_motivation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
                if (removal_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link) && removal_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, (SubLObject)removal_tactician_motivation.$kw9$JOIN_ORDERED)) {
                    link_var = join_ordered_link;
                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    mapped_problem = (SubLObject)removal_tactician_motivation.NIL;
                    mapped_problem = cdolist_list_var.first();
                    while (removal_tactician_motivation.NIL != cdolist_list_var) {
                        if (removal_tactician_motivation.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)removal_tactician_motivation.T, link_var, mapped_problem) && problem.eql(inference_datastructures_problem_link.mapped_problem_problem(mapped_problem)) && removal_tactician_motivation.NIL != removal_strategy_link_motivates_problemP(strategy, join_ordered_link, problem)) {
                            status_var = (SubLObject)removal_tactician_motivation.$kw10$PROVEN;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); removal_tactician_motivation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                proof_list = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                cdolist_list_var_$2 = proof_list;
                                proof = (SubLObject)removal_tactician_motivation.NIL;
                                proof = cdolist_list_var_$2.first();
                                while (removal_tactician_motivation.NIL != cdolist_list_var_$2) {
                                    if (removal_tactician_motivation.NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                                        restricted_non_focal_mapped_problem = inference_worker_join_ordered.find_split_restriction(join_ordered_link, proof);
                                        restricted_non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_non_focal_mapped_problem);
                                        removal_strategy_possibly_propagate_motivation_to_problem(strategy, restricted_non_focal_problem);
                                    }
                                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                    proof = cdolist_list_var_$2.first();
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mapped_problem = cdolist_list_var.first();
                    }
                }
            }
            if (removal_tactician_motivation.NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
                removal_strategy_possibly_activate_problem(strategy, problem);
            }
            return (SubLObject)removal_tactician_motivation.T;
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 5990L)
    public static SubLObject removal_strategy_possibly_activate_problem(final SubLObject strategy, final SubLObject problem) {
        if (removal_tactician_motivation.NIL != removal_strategy_chooses_not_to_examine_problemP(strategy, problem)) {
            return (SubLObject)removal_tactician_motivation.NIL;
        }
        inference_worker.determine_strategic_status_wrt(problem, strategy);
        if (removal_tactician_motivation.NIL != removal_strategy_chooses_not_to_activate_problemP(strategy, problem)) {
            return (SubLObject)removal_tactician_motivation.NIL;
        }
        if (removal_tactician_motivation.NIL != inference_worker_restriction.problem_is_a_simplificationP(problem)) {
            removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
        }
        if (removal_tactician_motivation.NIL != removal_strategy_problem_is_the_rest_of_a_removalP(problem, strategy)) {
            removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
        }
        if (removal_tactician_motivation.NIL != removal_strategy_motivates_problem_via_rewriteP(strategy, problem)) {
            removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
        }
        if (removal_tactician_motivation.NIL != removal_strategy_problem_is_the_rest_of_a_join_orderedP(problem, strategy)) {
            removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(strategy, problem);
        }
        final SubLObject activateP = (SubLObject)SubLObjectFactory.makeBoolean(removal_tactician_motivation.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy) && removal_tactician_motivation.NIL == removal_strategy_chooses_not_to_activate_problemP(strategy, problem));
        if (removal_tactician_motivation.NIL == activateP) {
            return (SubLObject)removal_tactician_motivation.NIL;
        }
        if (removal_tactician_motivation.NIL != removal_strategy_activate_problem(strategy, problem)) {
            return (SubLObject)removal_tactician_motivation.T;
        }
        removal_strategy_make_problem_pending(strategy, problem);
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 8081L)
    public static SubLObject removal_strategy_problem_is_the_rest_of_a_removalP(final SubLObject problem, final SubLObject strategy) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject restriction_link;
        SubLObject non_focal_problem;
        SubLObject set_contents_var_$3;
        SubLObject basis_object_$4;
        SubLObject state_$5;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_tactician_motivation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            restriction_link = set_contents.do_set_contents_next(basis_object, state);
            if (removal_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && removal_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, (SubLObject)removal_tactician_motivation.$kw11$RESTRICTION)) {
                non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                set_contents_var_$3 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                for (basis_object_$4 = set_contents.do_set_contents_basis_object(set_contents_var_$3), state_$5 = (SubLObject)removal_tactician_motivation.NIL, state_$5 = set_contents.do_set_contents_initial_state(basis_object_$4, set_contents_var_$3); removal_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object_$4, state_$5); state_$5 = set_contents.do_set_contents_update_state(state_$5)) {
                    join_ordered_link = set_contents.do_set_contents_next(basis_object_$4, state_$5);
                    if (removal_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state_$5, join_ordered_link) && removal_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, (SubLObject)removal_tactician_motivation.$kw9$JOIN_ORDERED) && removal_tactician_motivation.NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link) && non_focal_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link)) && removal_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_openP(join_ordered_link) && removal_tactician_motivation.NIL != removal_strategy_link_motivates_lookahead_problemP(strategy, join_ordered_link)) {
                        return (SubLObject)removal_tactician_motivation.T;
                    }
                }
            }
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 8553L)
    public static SubLObject removal_strategy_problem_is_the_rest_of_a_join_orderedP(final SubLObject problem, final SubLObject strategy) {
        SubLObject part_of_join_orderedP = (SubLObject)removal_tactician_motivation.NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject restriction_link;
        SubLObject non_focal_problem;
        SubLObject set_contents_var_$6;
        SubLObject basis_object_$7;
        SubLObject state_$8;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_tactician_motivation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_tactician_motivation.NIL == part_of_join_orderedP && removal_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            restriction_link = set_contents.do_set_contents_next(basis_object, state);
            if (removal_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && removal_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, (SubLObject)removal_tactician_motivation.$kw11$RESTRICTION)) {
                non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                set_contents_var_$6 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                for (basis_object_$7 = set_contents.do_set_contents_basis_object(set_contents_var_$6), state_$8 = (SubLObject)removal_tactician_motivation.NIL, state_$8 = set_contents.do_set_contents_initial_state(basis_object_$7, set_contents_var_$6); removal_tactician_motivation.NIL == part_of_join_orderedP && removal_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object_$7, state_$8); state_$8 = set_contents.do_set_contents_update_state(state_$8)) {
                    join_ordered_link = set_contents.do_set_contents_next(basis_object_$7, state_$8);
                    if (removal_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state_$8, join_ordered_link) && removal_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, (SubLObject)removal_tactician_motivation.$kw9$JOIN_ORDERED) && removal_tactician_motivation.NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link) && non_focal_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link))) {
                        part_of_join_orderedP = (SubLObject)removal_tactician_motivation.T;
                    }
                }
            }
        }
        return part_of_join_orderedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 8877L)
    public static SubLObject removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(final SubLObject strategy, final SubLObject problem) {
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 10057L)
    public static SubLObject removal_strategy_motivates_problem_via_rewriteP(final SubLObject strategy, final SubLObject problem) {
        if (removal_tactician_motivation.NIL != inference_datastructures_problem_store.problem_store_rewrite_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy))) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_tactician_motivation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (removal_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state, link) && removal_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, (SubLObject)removal_tactician_motivation.$kw12$REWRITE) && removal_tactician_motivation.NIL != inference_datastructures_strategy.problem_motivatedP(inference_datastructures_problem_link.problem_link_supported_problem(link), strategy)) {
                    return (SubLObject)removal_tactician_motivation.T;
                }
            }
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 10556L)
    public static SubLObject removal_strategy_chooses_not_to_examine_problemP(final SubLObject strategy, final SubLObject problem) {
        return inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 10793L)
    public static SubLObject removal_strategy_chooses_not_to_activate_problemP(final SubLObject strategy, final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_tactician_motivation.NIL != removal_tactician_datastructures.removal_strategy_problem_activeP(strategy, problem) || removal_tactician_motivation.NIL != removal_tactician_datastructures.removal_strategy_problem_pendingP(strategy, problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 11005L)
    public static SubLObject removal_strategy_activate_problem(final SubLObject strategy, final SubLObject problem) {
        assert removal_tactician_motivation.NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert removal_tactician_motivation.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return Numbers.plusp(removal_strategy_possibly_activate_strategems(strategy, problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 11233L)
    public static SubLObject removal_strategy_possibly_activate_strategems(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject strategems_to_activate = removal_strategy_categorize_strategems(strategy, problem);
        final SubLObject strategems_to_set_aside = thread.secondMultipleValue();
        final SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = strategems_to_activate;
        SubLObject strategem = (SubLObject)removal_tactician_motivation.NIL;
        strategem = cdolist_list_var.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var) {
            removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
            cdolist_list_var = cdolist_list_var.rest();
            strategem = cdolist_list_var.first();
        }
        cdolist_list_var = strategems_to_set_aside;
        strategem = (SubLObject)removal_tactician_motivation.NIL;
        strategem = cdolist_list_var.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var) {
            removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, strategem);
            if (removal_tactician_motivation.NIL != inference_datastructures_tactic.tactic_p(strategem)) {
                inference_datastructures_strategy.set_tactic_set_aside(strategem, strategy, (SubLObject)removal_tactician_motivation.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategem = cdolist_list_var.first();
        }
        cdolist_list_var = strategems_to_throw_away;
        strategem = (SubLObject)removal_tactician_motivation.NIL;
        strategem = cdolist_list_var.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var) {
            removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, strategem);
            if (removal_tactician_motivation.NIL != inference_datastructures_tactic.tactic_p(strategem)) {
                inference_datastructures_strategy.set_tactic_thrown_away(strategem, strategy, (SubLObject)removal_tactician_motivation.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategem = cdolist_list_var.first();
        }
        return Sequences.length(strategems_to_activate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 12371L)
    public static SubLObject removal_strategy_filter_strategems_by_rlt_tactic_types(final SubLObject bt_strategems, final SubLObject rlt_strategems) {
        if (bt_strategems.equal(rlt_strategems)) {
            return bt_strategems;
        }
        return removal_strategy_filter_strategems_by_rlt_tactic_types_int(bt_strategems, rlt_strategems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 12876L)
    public static SubLObject removal_strategy_filter_strategems_by_rlt_tactic_types_int(final SubLObject bt_strategems, final SubLObject rlt_strategems) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strategems = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject cdolist_list_var = bt_strategems;
        SubLObject bt_strategem = (SubLObject)removal_tactician_motivation.NIL;
        bt_strategem = cdolist_list_var.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var) {
            if (removal_tactician_motivation.NIL == inference_datastructures_problem.tactic_matches_any_of_type_specsP(bt_strategem, removal_tactician_motivation.$removal_strategy_rl_tactician_tactic_types$.getDynamicValue(thread))) {
                strategems = (SubLObject)ConsesLow.cons(bt_strategem, strategems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bt_strategem = cdolist_list_var.first();
        }
        cdolist_list_var = rlt_strategems;
        SubLObject rlt_strategem = (SubLObject)removal_tactician_motivation.NIL;
        rlt_strategem = cdolist_list_var.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var) {
            if (removal_tactician_motivation.NIL != inference_datastructures_problem.tactic_matches_any_of_type_specsP(rlt_strategem, removal_tactician_motivation.$removal_strategy_rl_tactician_tactic_types$.getDynamicValue(thread))) {
                strategems = (SubLObject)ConsesLow.cons(rlt_strategem, strategems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rlt_strategem = cdolist_list_var.first();
        }
        return Sequences.nreverse(strategems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 13417L)
    public static SubLObject removal_strategy_note_new_tactic(final SubLObject strategy, final SubLObject tactic) {
        inference_worker.default_compute_strategic_properties_of_tactic(strategy, tactic);
        if ((removal_tactician_motivation.NIL == inference_worker_split.split_tactic_p(tactic) || removal_tactician_motivation.NIL == inference_worker_split.meta_split_tactics_enabledP()) && removal_tactician_motivation.NIL == inference_worker_transformation.transformation_tactic_p(tactic) && removal_tactician_motivation.NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategy, tactic)) {
            removal_strategy_note_new_tactic_possible(strategy, tactic);
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 13963L)
    public static SubLObject removal_strategy_note_split_tactics_strategically_possible(final SubLObject strategy, final SubLObject split_tactics) {
        final SubLObject sorted_split_tactics = inference_tactician.strategy_sort(strategy, conses_high.copy_list(split_tactics), (SubLObject)removal_tactician_motivation.$sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
        SubLObject cdolist_list_var = Sequences.reverse(sorted_split_tactics);
        SubLObject split_tactic = (SubLObject)removal_tactician_motivation.NIL;
        split_tactic = cdolist_list_var.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var) {
            removal_strategy_note_new_tactic_possible(strategy, split_tactic);
            cdolist_list_var = cdolist_list_var.rest();
            split_tactic = cdolist_list_var.first();
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 14353L)
    public static SubLObject removal_strategy_note_new_tactic_possible(final SubLObject strategy, final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        inference_datastructures_strategy.problem_note_tactic_strategically_possible(problem, tactic, strategy);
        if ((removal_tactician_motivation.NIL != inference_worker_split.meta_split_tactics_enabledP() && removal_tactician_motivation.NIL != inference_worker_split.split_tactic_p(tactic)) || (removal_tactician_motivation.NIL != inference_worker_transformation.transformation_tactic_p(tactic) && removal_tactician_motivation.NIL == inference_worker_transformation.meta_transformation_tactic_p(tactic))) {
            final SubLObject problem_already_consideredP = (SubLObject)removal_tactician_motivation.T;
            removal_tactician_datastructures.removal_strategy_note_problem_unpending(strategy, inference_datastructures_tactic.tactic_problem(tactic));
            if (removal_tactician_motivation.NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, (SubLObject)removal_tactician_motivation.NIL, (SubLObject)removal_tactician_motivation.UNPROVIDED)) {
                removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, tactic);
            }
            else if (removal_tactician_motivation.NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, problem_already_consideredP, (SubLObject)removal_tactician_motivation.NIL, (SubLObject)removal_tactician_motivation.T)) {
                removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, tactic);
            }
            else {
                removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, tactic);
            }
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 15852L)
    public static SubLObject removal_strategy_categorize_strategems(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strategems_to_activate = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject strategems_to_set_aside = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject strategems_to_throw_away = (SubLObject)removal_tactician_motivation.NIL;
        final SubLObject problem_set_asideP = removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, problem, (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED);
        final SubLObject problem_thrown_awayP = removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject best_complete_removal_tactic = removal_strategy_categorize_removal_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
        SubLObject possible_non_complete_removal_tactics = thread.secondMultipleValue();
        final SubLObject set_aside_removal_tactics = thread.thirdMultipleValue();
        final SubLObject thrown_away_removal_tactics = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject possible_motivation_strategems = removal_strategy_categorize_motivation_strategems(strategy, problem, problem_set_asideP, problem_thrown_awayP);
        final SubLObject set_aside_motivation_strategems = thread.secondMultipleValue();
        final SubLObject thrown_away_motivation_strategems = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        strategems_to_set_aside = ConsesLow.append(set_aside_removal_tactics, set_aside_motivation_strategems);
        strategems_to_throw_away = ConsesLow.append(thrown_away_removal_tactics, thrown_away_motivation_strategems);
        possible_non_complete_removal_tactics = Sequences.nreverse(possible_non_complete_removal_tactics);
        SubLObject cdolist_list_var;
        possible_motivation_strategems = (cdolist_list_var = Sequences.nreverse(possible_motivation_strategems));
        SubLObject logical_tactic = (SubLObject)removal_tactician_motivation.NIL;
        logical_tactic = cdolist_list_var.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var) {
            strategems_to_activate = (SubLObject)ConsesLow.cons(logical_tactic, strategems_to_activate);
            cdolist_list_var = cdolist_list_var.rest();
            logical_tactic = cdolist_list_var.first();
        }
        cdolist_list_var = possible_non_complete_removal_tactics;
        SubLObject removal_tactic = (SubLObject)removal_tactician_motivation.NIL;
        removal_tactic = cdolist_list_var.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var) {
            strategems_to_activate = (SubLObject)ConsesLow.cons(removal_tactic, strategems_to_activate);
            cdolist_list_var = cdolist_list_var.rest();
            removal_tactic = cdolist_list_var.first();
        }
        if (removal_tactician_motivation.NIL != best_complete_removal_tactic) {
            strategems_to_activate = (SubLObject)ConsesLow.cons(best_complete_removal_tactic, strategems_to_activate);
        }
        cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject meta_structural_tactic = (SubLObject)removal_tactician_motivation.NIL;
        meta_structural_tactic = cdolist_list_var.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var) {
            if (removal_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(meta_structural_tactic, (SubLObject)removal_tactician_motivation.$kw18$META_STRUCTURAL)) {
                strategems_to_activate = (SubLObject)ConsesLow.cons(meta_structural_tactic, strategems_to_activate);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_structural_tactic = cdolist_list_var.first();
        }
        strategems_to_activate = Sequences.nreverse(strategems_to_activate);
        return subl_promotions.values3(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 18566L)
    public static SubLObject removal_strategy_categorize_motivation_strategems(final SubLObject strategy, final SubLObject problem, final SubLObject problem_set_asideP, final SubLObject problem_thrown_awayP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject possible_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject set_aside_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject thrown_away_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        if (removal_tactician_motivation.NIL == inference_datastructures_problem.single_literal_problem_p(problem)) {
            if (removal_tactician_motivation.NIL != inference_datastructures_problem.multi_clause_problem_p(problem)) {
                thread.resetMultipleValues();
                final SubLObject possible_motivation_strategems_$9 = removal_strategy_categorize_disjunctive_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
                final SubLObject set_aside_motivation_strategems_$10 = thread.secondMultipleValue();
                final SubLObject thrown_away_motivation_strategems_$11 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                possible_motivation_strategems = possible_motivation_strategems_$9;
                set_aside_motivation_strategems = set_aside_motivation_strategems_$10;
                thrown_away_motivation_strategems = thrown_away_motivation_strategems_$11;
            }
            else if (removal_tactician_motivation.NIL != inference_datastructures_problem.problem_has_split_tacticsP(problem)) {
                thread.resetMultipleValues();
                final SubLObject possible_motivation_strategems_$10 = removal_strategy_categorize_split_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
                final SubLObject set_aside_motivation_strategems_$11 = thread.secondMultipleValue();
                final SubLObject thrown_away_motivation_strategems_$12 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                possible_motivation_strategems = possible_motivation_strategems_$10;
                set_aside_motivation_strategems = set_aside_motivation_strategems_$11;
                thrown_away_motivation_strategems = thrown_away_motivation_strategems_$12;
            }
            else {
                thread.resetMultipleValues();
                final SubLObject possible_motivation_strategems_$11 = removal_strategy_categorize_connected_conjunction_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
                final SubLObject set_aside_motivation_strategems_$12 = thread.secondMultipleValue();
                final SubLObject thrown_away_motivation_strategems_$13 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                possible_motivation_strategems = possible_motivation_strategems_$11;
                set_aside_motivation_strategems = set_aside_motivation_strategems_$12;
                thrown_away_motivation_strategems = thrown_away_motivation_strategems_$13;
            }
        }
        return subl_promotions.values3(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 19859L)
    public static SubLObject removal_strategy_categorize_removal_tactics(final SubLObject strategy, final SubLObject problem, final SubLObject problem_set_asideP, final SubLObject problem_thrown_awayP) {
        SubLObject best_complete_removal_tactic = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject best_complete_removal_tactic_productivity = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject set_aside_removal_tactics = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject possible_non_complete_removal_tactics = (SubLObject)removal_tactician_motivation.NIL;
        if (removal_tactician_motivation.NIL == problem_thrown_awayP) {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject removal_tactic = (SubLObject)removal_tactician_motivation.NIL;
            removal_tactic = cdolist_list_var.first();
            while (removal_tactician_motivation.NIL != cdolist_list_var) {
                if (removal_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, (SubLObject)removal_tactician_motivation.$kw19$GENERALIZED_REMOVAL_OR_REWRITE) && removal_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, (SubLObject)removal_tactician_motivation.$kw20$POSSIBLE) && removal_tactician_motivation.NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, removal_tactic, (SubLObject)removal_tactician_motivation.T, (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED)) {
                    if (removal_tactician_motivation.NIL != problem_set_asideP || removal_tactician_motivation.NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, removal_tactic, (SubLObject)removal_tactician_motivation.T, (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED)) {
                        if (removal_tactician_motivation.NIL == best_complete_removal_tactic) {
                            set_aside_removal_tactics = (SubLObject)ConsesLow.cons(removal_tactic, set_aside_removal_tactics);
                        }
                    }
                    else {
                        final SubLObject pcase_var;
                        final SubLObject completeness = pcase_var = inference_datastructures_strategy.tactic_strategic_completeness(removal_tactic, strategy);
                        if (pcase_var.eql((SubLObject)removal_tactician_motivation.$kw21$COMPLETE)) {
                            final SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(removal_tactic, strategy);
                            if (removal_tactician_motivation.NIL == best_complete_removal_tactic || removal_tactician_motivation.NIL != inference_datastructures_enumerated_types.productivity_L(productivity, best_complete_removal_tactic_productivity)) {
                                best_complete_removal_tactic = removal_tactic;
                                best_complete_removal_tactic_productivity = productivity;
                                if (removal_tactician_motivation.NIL == inference_worker_removal.meta_removal_tactic_p(best_complete_removal_tactic)) {
                                    possible_non_complete_removal_tactics = (SubLObject)removal_tactician_motivation.NIL;
                                    set_aside_removal_tactics = (SubLObject)removal_tactician_motivation.NIL;
                                }
                            }
                        }
                        else if ((pcase_var.eql((SubLObject)removal_tactician_motivation.$kw22$INCOMPLETE) || pcase_var.eql((SubLObject)removal_tactician_motivation.$kw23$GROSSLY_INCOMPLETE)) && (removal_tactician_motivation.NIL == best_complete_removal_tactic || removal_tactician_motivation.NIL != inference_worker_removal.meta_removal_tactic_p(best_complete_removal_tactic))) {
                            possible_non_complete_removal_tactics = (SubLObject)ConsesLow.cons(removal_tactic, possible_non_complete_removal_tactics);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                removal_tactic = cdolist_list_var.first();
            }
            possible_non_complete_removal_tactics = inference_tactician.strategy_sort(strategy, possible_non_complete_removal_tactics, (SubLObject)removal_tactician_motivation.$sym24$TACTIC_STRATEGIC_PRODUCTIVITY__);
        }
        SubLObject thrown_away_removal_tactics = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject cdolist_list_var2 = inference_datastructures_problem.problem_tactics(problem);
        SubLObject removal_tactic2 = (SubLObject)removal_tactician_motivation.NIL;
        removal_tactic2 = cdolist_list_var2.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var2) {
            if (removal_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic2, (SubLObject)removal_tactician_motivation.$kw19$GENERALIZED_REMOVAL_OR_REWRITE) && removal_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic2, (SubLObject)removal_tactician_motivation.$kw20$POSSIBLE) && !removal_tactic2.eql(best_complete_removal_tactic) && removal_tactician_motivation.NIL == list_utilities.member_eqP(removal_tactic2, possible_non_complete_removal_tactics) && removal_tactician_motivation.NIL == list_utilities.member_eqP(removal_tactic2, set_aside_removal_tactics)) {
                thrown_away_removal_tactics = (SubLObject)ConsesLow.cons(removal_tactic2, thrown_away_removal_tactics);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            removal_tactic2 = cdolist_list_var2.first();
        }
        return subl_promotions.values4(best_complete_removal_tactic, possible_non_complete_removal_tactics, set_aside_removal_tactics, thrown_away_removal_tactics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 22531L)
    public static SubLObject removal_strategy_categorize_disjunctive_tactics(final SubLObject strategy, final SubLObject problem, final SubLObject problem_set_asideP, final SubLObject problem_thrown_awayP) {
        SubLObject possible_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject set_aside_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        if (removal_tactician_motivation.NIL == problem_thrown_awayP) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            SubLObject disjunctive_tactic;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_tactician_motivation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (removal_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state, link) && removal_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, (SubLObject)removal_tactician_motivation.$kw25$DISJUNCTIVE) && removal_tactician_motivation.NIL == removal_strategy_link_motivates_problemP(strategy, link, (SubLObject)removal_tactician_motivation.UNPROVIDED) && removal_tactician_motivation.NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_disjunctive_linkP(strategy, link)) {
                    disjunctive_tactic = inference_worker.logical_link_unique_tactic(link);
                    if (removal_tactician_motivation.NIL != problem_set_asideP || removal_tactician_motivation.NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_disjunctive_linkP(strategy, link)) {
                        set_aside_motivation_strategems = (SubLObject)ConsesLow.cons(disjunctive_tactic, set_aside_motivation_strategems);
                    }
                    else {
                        possible_motivation_strategems = (SubLObject)ConsesLow.cons(disjunctive_tactic, possible_motivation_strategems);
                    }
                }
            }
            possible_motivation_strategems = inference_tactician.strategy_sort(strategy, possible_motivation_strategems, (SubLObject)removal_tactician_motivation.$sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
        }
        SubLObject thrown_away_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        final SubLObject set_contents_var2 = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject link2;
        SubLObject disjunctive_tactic2;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_tactician_motivation.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_tactician_motivation.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            link2 = set_contents.do_set_contents_next(basis_object2, state2);
            if (removal_tactician_motivation.NIL != set_contents.do_set_contents_element_validP(state2, link2) && removal_tactician_motivation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link2, (SubLObject)removal_tactician_motivation.$kw25$DISJUNCTIVE)) {
                disjunctive_tactic2 = inference_worker.logical_link_unique_tactic(link2);
                if (removal_tactician_motivation.NIL == list_utilities.member_eqP(disjunctive_tactic2, possible_motivation_strategems) && removal_tactician_motivation.NIL == list_utilities.member_eqP(disjunctive_tactic2, set_aside_motivation_strategems)) {
                    thrown_away_motivation_strategems = (SubLObject)ConsesLow.cons(disjunctive_tactic2, thrown_away_motivation_strategems);
                }
            }
        }
        return subl_promotions.values3(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 23989L)
    public static SubLObject removal_strategy_categorize_split_tactics(final SubLObject strategy, final SubLObject problem, final SubLObject problem_set_asideP, final SubLObject problem_thrown_awayP) {
        SubLObject possible_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject set_aside_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        if (removal_tactician_motivation.NIL == problem_thrown_awayP) {
            final SubLObject split_link = inference_worker_split.problem_sole_split_argument_link(problem);
            if (removal_tactician_motivation.NIL != split_link) {
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                SubLObject split_tactic = (SubLObject)removal_tactician_motivation.NIL;
                split_tactic = cdolist_list_var.first();
                while (removal_tactician_motivation.NIL != cdolist_list_var) {
                    if (removal_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(split_tactic, (SubLObject)removal_tactician_motivation.$kw26$SPLIT) && removal_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_status_match(split_tactic, (SubLObject)removal_tactician_motivation.$kw27$NON_DISCARDED) && removal_tactician_motivation.NIL == removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, split_tactic) && removal_tactician_motivation.NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, split_tactic, (SubLObject)removal_tactician_motivation.T, (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED)) {
                        if (removal_tactician_motivation.NIL != problem_set_asideP || removal_tactician_motivation.NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, split_tactic, (SubLObject)removal_tactician_motivation.T, (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED)) {
                            set_aside_motivation_strategems = (SubLObject)ConsesLow.cons(split_tactic, set_aside_motivation_strategems);
                        }
                        else {
                            possible_motivation_strategems = (SubLObject)ConsesLow.cons(split_tactic, possible_motivation_strategems);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    split_tactic = cdolist_list_var.first();
                }
                possible_motivation_strategems = inference_tactician.strategy_sort(strategy, possible_motivation_strategems, (SubLObject)removal_tactician_motivation.$sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
            }
        }
        SubLObject thrown_away_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject split_tactic = (SubLObject)removal_tactician_motivation.NIL;
        split_tactic = cdolist_list_var.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var) {
            if (removal_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(split_tactic, (SubLObject)removal_tactician_motivation.$kw26$SPLIT) && removal_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_status_match(split_tactic, (SubLObject)removal_tactician_motivation.$kw27$NON_DISCARDED) && removal_tactician_motivation.NIL == list_utilities.member_eqP(split_tactic, possible_motivation_strategems) && removal_tactician_motivation.NIL == list_utilities.member_eqP(split_tactic, set_aside_motivation_strategems)) {
                thrown_away_motivation_strategems = (SubLObject)ConsesLow.cons(split_tactic, thrown_away_motivation_strategems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            split_tactic = cdolist_list_var.first();
        }
        return subl_promotions.values3(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 25407L)
    public static SubLObject removal_strategy_categorize_connected_conjunction_tactics(final SubLObject strategy, final SubLObject problem, final SubLObject problem_set_asideP, final SubLObject problem_thrown_awayP) {
        SubLObject possible_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject set_aside_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject committed_tactic = (SubLObject)removal_tactician_motivation.NIL;
        SubLObject committed_tactic_productivity = (SubLObject)removal_tactician_motivation.$kw28$POSITIVE_INFINITY;
        SubLObject committed_tactic_preference = (SubLObject)removal_tactician_motivation.$kw29$DISALLOWED;
        SubLObject committed_tactic_module_spec = (SubLObject)removal_tactician_motivation.$kw9$JOIN_ORDERED;
        SubLObject committed_tactic_literals_score = (SubLObject)removal_tactician_motivation.ZERO_INTEGER;
        SubLObject cheap_backtracking_tactics = (SubLObject)removal_tactician_motivation.NIL;
        if (removal_tactician_motivation.NIL == problem_thrown_awayP) {
            final SubLObject type_var = (SubLObject)removal_tactician_motivation.$kw30$CONNECTED_CONJUNCTION;
            final SubLObject subsuming_join_ordered_tactics = inference_tactician.problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem, type_var);
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject candidate_tactic = (SubLObject)removal_tactician_motivation.NIL;
            candidate_tactic = cdolist_list_var.first();
            while (removal_tactician_motivation.NIL != cdolist_list_var) {
                if (removal_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, type_var) && removal_tactician_motivation.NIL == inference_tactician.some_subsuming_join_ordered_tacticP(candidate_tactic, subsuming_join_ordered_tactics, strategy)) {
                    final SubLObject link = inference_worker.logical_tactic_link(candidate_tactic);
                    final SubLObject candidate_tactic_module_spec = (SubLObject)((removal_tactician_motivation.NIL != inference_worker_join.join_tactic_p(candidate_tactic)) ? removal_tactician_motivation.$kw31$JOIN : removal_tactician_motivation.$kw9$JOIN_ORDERED);
                    if (removal_tactician_motivation.NIL == removal_strategy_link_motivates_problemP(strategy, link, (SubLObject)removal_tactician_motivation.UNPROVIDED) && removal_tactician_motivation.NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_connected_conjunction_linkP(strategy, link)) {
                        if (removal_tactician_motivation.NIL != problem_set_asideP || removal_tactician_motivation.NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_connected_conjunction_linkP(strategy, link)) {
                            set_aside_motivation_strategems = (SubLObject)ConsesLow.cons(candidate_tactic, set_aside_motivation_strategems);
                        }
                        else {
                            final SubLObject candidate_tactic_productivity = inference_lookahead_productivity.tactic_max_removal_productivity(candidate_tactic, strategy);
                            SubLObject candidate_tactic_preference = inference_datastructures_strategy.tactic_strategic_preference_level(candidate_tactic, strategy);
                            final SubLObject candidate_tactic_literals_score = inference_worker.connected_conjunction_tactic_literals_score(candidate_tactic);
                            final SubLObject magic_wandP = inference_tactician_utilities.magic_wand_tacticP(candidate_tactic, strategy);
                            if (removal_tactician_motivation.NIL != magic_wandP) {
                                candidate_tactic_preference = (SubLObject)removal_tactician_motivation.$kw29$DISALLOWED;
                            }
                            if (removal_tactician_motivation.NIL == committed_tactic || removal_tactician_motivation.NIL != removal_strategy_deems_conjunctive_tactic_spec_betterP(strategy, candidate_tactic, candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literals_score, committed_tactic, committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literals_score)) {
                                committed_tactic = candidate_tactic;
                                committed_tactic_productivity = candidate_tactic_productivity;
                                committed_tactic_preference = candidate_tactic_preference;
                                committed_tactic_module_spec = candidate_tactic_module_spec;
                                committed_tactic_literals_score = candidate_tactic_literals_score;
                            }
                            if (removal_tactician_motivation.NIL == magic_wandP && removal_tactician_motivation.NIL != removal_strategy_logical_tactic_removal_backtracking_cheapP(candidate_tactic, strategy)) {
                                cheap_backtracking_tactics = (SubLObject)ConsesLow.cons(candidate_tactic, cheap_backtracking_tactics);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate_tactic = cdolist_list_var.first();
            }
            if (removal_tactician_motivation.NIL != committed_tactic) {
                if (removal_tactician_motivation.NIL != removal_strategy_commits_to_no_removal_backtrackingP(strategy, committed_tactic, committed_tactic_preference)) {
                    cheap_backtracking_tactics = (SubLObject)removal_tactician_motivation.NIL;
                }
                else {
                    cheap_backtracking_tactics = list_utilities.delete_first(committed_tactic, cheap_backtracking_tactics, Symbols.symbol_function((SubLObject)removal_tactician_motivation.EQ));
                }
                possible_motivation_strategems = (SubLObject)ConsesLow.cons(committed_tactic, possible_motivation_strategems);
                SubLObject cdolist_list_var2 = cheap_backtracking_tactics;
                SubLObject backtracking_tactic = (SubLObject)removal_tactician_motivation.NIL;
                backtracking_tactic = cdolist_list_var2.first();
                while (removal_tactician_motivation.NIL != cdolist_list_var2) {
                    possible_motivation_strategems = (SubLObject)ConsesLow.cons(backtracking_tactic, possible_motivation_strategems);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    backtracking_tactic = cdolist_list_var2.first();
                }
                possible_motivation_strategems = inference_tactician.strategy_sort(strategy, possible_motivation_strategems, (SubLObject)removal_tactician_motivation.$sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
            }
        }
        SubLObject thrown_away_motivation_strategems = (SubLObject)removal_tactician_motivation.NIL;
        final SubLObject type_var2 = (SubLObject)removal_tactician_motivation.$kw30$CONNECTED_CONJUNCTION;
        final SubLObject subsuming_join_ordered_tactics2 = inference_tactician.problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem, type_var2);
        SubLObject cdolist_list_var3 = inference_datastructures_problem.problem_tactics(problem);
        SubLObject conjunctive_tactic = (SubLObject)removal_tactician_motivation.NIL;
        conjunctive_tactic = cdolist_list_var3.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var3) {
            if (removal_tactician_motivation.NIL != inference_datastructures_problem.do_problem_tactics_type_match(conjunctive_tactic, type_var2) && removal_tactician_motivation.NIL == inference_tactician.some_subsuming_join_ordered_tacticP(conjunctive_tactic, subsuming_join_ordered_tactics2, strategy) && removal_tactician_motivation.NIL == list_utilities.member_eqP(conjunctive_tactic, possible_motivation_strategems) && removal_tactician_motivation.NIL == list_utilities.member_eqP(conjunctive_tactic, set_aside_motivation_strategems)) {
                thrown_away_motivation_strategems = (SubLObject)ConsesLow.cons(conjunctive_tactic, thrown_away_motivation_strategems);
            }
            cdolist_list_var3 = cdolist_list_var3.rest();
            conjunctive_tactic = cdolist_list_var3.first();
        }
        return subl_promotions.values3(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 29237L)
    public static SubLObject removal_strategy_deems_conjunctive_tactic_spec_betterP(final SubLObject strategy, final SubLObject candidate_tactic, final SubLObject candidate_tactic_productivity, final SubLObject candidate_tactic_preference, final SubLObject candidate_tactic_module_spec, final SubLObject candidate_tactic_literals_score, final SubLObject committed_tactic, final SubLObject committed_tactic_productivity, final SubLObject committed_tactic_preference, final SubLObject committed_tactic_module_spec, final SubLObject committed_tactic_literals_score) {
        if (removal_tactician_motivation.NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(candidate_tactic))) {
            if (removal_tactician_motivation.NIL != join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP(candidate_tactic)) {
                return (SubLObject)removal_tactician_motivation.T;
            }
            if (removal_tactician_motivation.NIL != join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP(committed_tactic)) {
                return (SubLObject)removal_tactician_motivation.NIL;
            }
        }
        if (removal_tactician_motivation.NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(committed_tactic)) && removal_tactician_motivation.NIL != inference_datastructures_enumerated_types.productivity_E(candidate_tactic_productivity, committed_tactic_productivity) && candidate_tactic_preference.eql(committed_tactic_preference)) {
            final SubLObject candidate_completeness = inference_worker.logical_tactic_generalized_removal_completeness(candidate_tactic, strategy);
            final SubLObject committed_completeness = inference_worker.logical_tactic_generalized_removal_completeness(committed_tactic, strategy);
            if (removal_tactician_motivation.NIL != inference_datastructures_enumerated_types.completeness_G(candidate_completeness, committed_completeness)) {
                return (SubLObject)removal_tactician_motivation.T;
            }
        }
        return inference_tactician_utilities.strategy_deems_conjunctive_tactic_spec_betterP(candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literals_score, committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literals_score);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 30994L)
    public static SubLObject join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP(final SubLObject tactic) {
        if (removal_tactician_motivation.NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            final SubLObject lookahead_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(tactic);
            if (removal_tactician_motivation.NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem)) {
                return inference_worker_join_ordered.potentially_simplifying_asentP(inference_datastructures_problem.single_literal_problem_atomic_sentence(lookahead_problem));
            }
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 31369L)
    public static SubLObject removal_strategy_commits_to_no_removal_backtrackingP(final SubLObject strategy, final SubLObject committed_tactic, final SubLObject committed_tactic_preference_level) {
        if (removal_tactician_motivation.NIL != ((removal_tactician_motivation.NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(committed_tactic))) ? Equality.eq((SubLObject)removal_tactician_motivation.$kw21$COMPLETE, inference_worker.logical_tactic_generalized_removal_completeness(committed_tactic, strategy)) : Equality.eq((SubLObject)removal_tactician_motivation.$kw32$PREFERRED, committed_tactic_preference_level)) && removal_tactician_motivation.NIL != removal_strategy_logical_tactic_removal_backtracking_cheapP(committed_tactic, strategy)) {
            return (SubLObject)removal_tactician_motivation.T;
        }
        if (removal_tactician_motivation.NIL != inference_datastructures_problem.problem_backchain_requiredP(inference_datastructures_tactic.tactic_problem(committed_tactic))) {
            return (SubLObject)removal_tactician_motivation.T;
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 32333L)
    public static SubLObject removal_strategy_logical_tactic_removal_backtracking_cheapP(final SubLObject logical_tactic, final SubLObject strategy) {
        if (removal_tactician_motivation.NIL == inference_worker_join.join_tactic_p(logical_tactic)) {
            final SubLObject removal_backtracking_productivity_threshold = removal_tactician_datastructures.removal_strategy_removal_backtracking_productivity_limit(strategy);
            if (removal_tactician_motivation.NIL != removal_backtracking_productivity_threshold) {
                final SubLObject productivity = inference_lookahead_productivity.tactic_max_removal_productivity(logical_tactic, strategy);
                return inference_datastructures_enumerated_types.productivity_LE(productivity, removal_backtracking_productivity_threshold);
            }
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 32880L)
    public static SubLObject removal_strategy_possibly_reconsider_split_set_asides(final SubLObject strategy, final SubLObject split_tactic) {
        SubLObject reactivated_count = (SubLObject)removal_tactician_motivation.ZERO_INTEGER;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
        final SubLObject index = removal_tactician_datastructures.removal_strategy_problem_strategems_set_aside(strategy);
        final SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, (SubLObject)removal_tactician_motivation.NIL);
        if (removal_tactician_motivation.NIL != set.non_empty_set_p(v_set)) {
            final SubLObject set_aside_split_tactics = list_utilities.delete_if_not((SubLObject)removal_tactician_motivation.$sym33$SPLIT_TACTIC_P, set.set_element_list(v_set), (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject set_aside_split_tactics_in_order = cdolist_list_var = set_aside_split_tactics;
            SubLObject split_tactic_$18 = (SubLObject)removal_tactician_motivation.NIL;
            split_tactic_$18 = cdolist_list_var.first();
            while (removal_tactician_motivation.NIL != cdolist_list_var) {
                set.set_remove(split_tactic_$18, v_set);
                cdolist_list_var = cdolist_list_var.rest();
                split_tactic_$18 = cdolist_list_var.first();
            }
            cdolist_list_var = set_aside_split_tactics_in_order;
            SubLObject split_tactic_$19 = (SubLObject)removal_tactician_motivation.NIL;
            split_tactic_$19 = cdolist_list_var.first();
            while (removal_tactician_motivation.NIL != cdolist_list_var) {
                if (removal_tactician_motivation.NIL != removal_strategy_reconsider_one_split_set_aside(strategy, split_tactic_$19)) {
                    reactivated_count = Numbers.add(reactivated_count, (SubLObject)removal_tactician_motivation.ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                split_tactic_$19 = cdolist_list_var.first();
            }
        }
        return reactivated_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 33799L)
    public static SubLObject removal_strategy_reconsider_one_split_set_aside(final SubLObject strategy, final SubLObject split_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_tactician_motivation.NIL;
        final SubLObject _prev_bind_0 = inference_worker.$reconsidering_set_asidesP$.currentBinding(thread);
        try {
            inference_worker.$reconsidering_set_asidesP$.bind((SubLObject)removal_tactician_motivation.T, thread);
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
            removal_strategy_possibly_clear_strategic_status(strategy, problem);
            inference_datastructures_strategy.set_tactic_recompute_thrown_away(split_tactic, strategy);
            inference_datastructures_strategy.set_tactic_recompute_set_aside(split_tactic, strategy);
            if (removal_tactician_motivation.NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, split_tactic, (SubLObject)removal_tactician_motivation.NIL, (SubLObject)removal_tactician_motivation.T, (SubLObject)removal_tactician_motivation.UNPROVIDED)) {
                if (removal_tactician_motivation.NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, split_tactic, (SubLObject)removal_tactician_motivation.NIL, (SubLObject)removal_tactician_motivation.T, (SubLObject)removal_tactician_motivation.T)) {
                    removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, split_tactic);
                }
                else {
                    removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, split_tactic);
                    result = (SubLObject)removal_tactician_motivation.T;
                }
            }
        }
        finally {
            inference_worker.$reconsidering_set_asidesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 35257L)
    public static SubLObject removal_strategy_possibly_clear_strategic_status(final SubLObject strategy, final SubLObject problem) {
        if (removal_tactician_motivation.NIL != inference_datastructures_strategy.strategically_pending_problem_p(problem, strategy)) {
            inference_tactician.possibly_clear_strategic_status_wrt(problem, strategy);
        }
        inference_datastructures_strategy.strategy_clear_problem_set_aside(strategy, problem);
        removal_tactician_datastructures.removal_strategy_note_problem_unpending(strategy, problem);
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 35590L)
    public static SubLObject removal_strategy_reactivate_executable_strategem(final SubLObject strategy, final SubLObject strategem) {
        assert removal_tactician_motivation.NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert removal_tactician_motivation.NIL != inference_tactician.executable_strategem_p(strategem) : strategem;
        if (removal_tactician_motivation.NIL != inference_worker_removal.generalized_removal_tactic_p(strategem)) {
            return removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
        }
        if (removal_tactician_motivation.NIL != inference_worker_transformation.transformation_tactic_p(strategem)) {
            return (SubLObject)removal_tactician_motivation.NIL;
        }
        if (removal_tactician_motivation.NIL != inference_worker.meta_structural_tactic_p(strategem)) {
            removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
            return strategem;
        }
        return removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 36239L)
    public static SubLObject removal_strategy_strategically_deactivate_strategem(final SubLObject strategy, final SubLObject strategem) {
        if (removal_tactician_motivation.NIL != inference_tactician.strategem_invalid_p(strategem)) {
            return (SubLObject)removal_tactician_motivation.NIL;
        }
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        removal_strategy_deactivate_strategem(strategy, strategem);
        removal_strategy_possibly_deactivate_problem(strategy, problem);
        if (removal_tactician_motivation.NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            inference_worker.consider_strategic_ramifications_of_possibly_executed_tactic(strategy, strategem);
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 36727L)
    public static SubLObject removal_strategy_deactivate_strategem(final SubLObject strategy, final SubLObject strategem) {
        assert removal_tactician_motivation.NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert removal_tactician_motivation.NIL != inference_tactician.removal_strategem_p(strategem) : strategem;
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        final SubLObject index = removal_tactician_datastructures.removal_strategy_problem_total_strategems_active(strategy);
        SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, (SubLObject)removal_tactician_motivation.ZERO_INTEGER);
        count = Numbers.subtract(count, (SubLObject)removal_tactician_motivation.ONE_INTEGER);
        if (count.isPositive()) {
            dictionary.dictionary_enter(index, problem, count);
        }
        else {
            dictionary.dictionary_remove(index, problem);
            removal_tactician_datastructures.removal_strategy_note_problem_pending(strategy, problem);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 37288L)
    public static SubLObject removal_strategy_possibly_deactivate_problem(final SubLObject strategy, final SubLObject problem) {
        if (removal_tactician_motivation.NIL == removal_tactician_datastructures.removal_strategy_problem_activeP(strategy, problem)) {
            inference_datastructures_strategy.strategy_note_problem_inactive(strategy, problem);
            if (removal_tactician_motivation.NIL != removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem)) {
                inference_datastructures_strategy.strategy_note_problem_set_aside(strategy, problem);
                return (SubLObject)removal_tactician_motivation.T;
            }
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 37640L)
    public static SubLObject removal_strategy_consider_that_problem_could_be_strategically_pending(final SubLObject strategy, final SubLObject problem) {
        if (removal_tactician_motivation.NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED)) {
            removal_strategy_make_problem_pending(strategy, problem);
            return (SubLObject)removal_tactician_motivation.T;
        }
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 37953L)
    public static SubLObject removal_strategy_make_problem_pending(final SubLObject strategy, final SubLObject problem) {
        removal_tactician_datastructures.removal_strategy_note_problem_pending(strategy, problem);
        removal_strategy_possibly_deactivate_problem(strategy, problem);
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician-motivation.lisp", position = 38165L)
    public static SubLObject removal_strategy_problem_nothing_to_doP(final SubLObject strategy, final SubLObject problem) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)removal_tactician_motivation.NIL;
        tactic = cdolist_list_var.first();
        while (removal_tactician_motivation.NIL != cdolist_list_var) {
            if (removal_tactician_motivation.NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED, (SubLObject)removal_tactician_motivation.UNPROVIDED)) {
                return (SubLObject)removal_tactician_motivation.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)removal_tactician_motivation.T;
    }
    
    public static SubLObject declare_removal_tactician_motivation_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_with_strategically_active_strategem", "REMOVAL-STRATEGY-WITH-STRATEGICALLY-ACTIVE-STRATEGEM");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_possibly_propagate_motivation_to_link_head", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_propagate_motivation_to_link_head", "REMOVAL-STRATEGY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_link_motivates_problemP", "REMOVAL-STRATEGY-LINK-MOTIVATES-PROBLEM?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_link_motivates_lookahead_problemP", "REMOVAL-STRATEGY-LINK-MOTIVATES-LOOKAHEAD-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_possibly_propagate_motivation_to_problem", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_possibly_activate_problem", "REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_problem_is_the_rest_of_a_removalP", "REMOVAL-STRATEGY-PROBLEM-IS-THE-REST-OF-A-REMOVAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_problem_is_the_rest_of_a_join_orderedP", "REMOVAL-STRATEGY-PROBLEM-IS-THE-REST-OF-A-JOIN-ORDERED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-PROOF-SPEC-TO-RESTRICTED-NON-FOCALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_motivates_problem_via_rewriteP", "REMOVAL-STRATEGY-MOTIVATES-PROBLEM-VIA-REWRITE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_chooses_not_to_examine_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_chooses_not_to_activate_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_activate_problem", "REMOVAL-STRATEGY-ACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_possibly_activate_strategems", "REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_filter_strategems_by_rlt_tactic_types", "REMOVAL-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_filter_strategems_by_rlt_tactic_types_int", "REMOVAL-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_note_new_tactic", "REMOVAL-STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_note_split_tactics_strategically_possible", "REMOVAL-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_note_new_tactic_possible", "REMOVAL-STRATEGY-NOTE-NEW-TACTIC-POSSIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_categorize_strategems", "REMOVAL-STRATEGY-CATEGORIZE-STRATEGEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_categorize_motivation_strategems", "REMOVAL-STRATEGY-CATEGORIZE-MOTIVATION-STRATEGEMS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_categorize_removal_tactics", "REMOVAL-STRATEGY-CATEGORIZE-REMOVAL-TACTICS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_categorize_disjunctive_tactics", "REMOVAL-STRATEGY-CATEGORIZE-DISJUNCTIVE-TACTICS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_categorize_split_tactics", "REMOVAL-STRATEGY-CATEGORIZE-SPLIT-TACTICS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_categorize_connected_conjunction_tactics", "REMOVAL-STRATEGY-CATEGORIZE-CONNECTED-CONJUNCTION-TACTICS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_deems_conjunctive_tactic_spec_betterP", "REMOVAL-STRATEGY-DEEMS-CONJUNCTIVE-TACTIC-SPEC-BETTER?", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP", "JOIN-ORDERED-TACTIC-THAT-LEADS-TO-A-POTENTIALLY-SIMPLIFYING-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_commits_to_no_removal_backtrackingP", "REMOVAL-STRATEGY-COMMITS-TO-NO-REMOVAL-BACKTRACKING?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_logical_tactic_removal_backtracking_cheapP", "REMOVAL-STRATEGY-LOGICAL-TACTIC-REMOVAL-BACKTRACKING-CHEAP?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_possibly_reconsider_split_set_asides", "REMOVAL-STRATEGY-POSSIBLY-RECONSIDER-SPLIT-SET-ASIDES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_reconsider_one_split_set_aside", "REMOVAL-STRATEGY-RECONSIDER-ONE-SPLIT-SET-ASIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_possibly_clear_strategic_status", "REMOVAL-STRATEGY-POSSIBLY-CLEAR-STRATEGIC-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_reactivate_executable_strategem", "REMOVAL-STRATEGY-REACTIVATE-EXECUTABLE-STRATEGEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_strategically_deactivate_strategem", "REMOVAL-STRATEGY-STRATEGICALLY-DEACTIVATE-STRATEGEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_deactivate_strategem", "REMOVAL-STRATEGY-DEACTIVATE-STRATEGEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_possibly_deactivate_problem", "REMOVAL-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_consider_that_problem_could_be_strategically_pending", "REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_make_problem_pending", "REMOVAL-STRATEGY-MAKE-PROBLEM-PENDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation", "removal_strategy_problem_nothing_to_doP", "REMOVAL-STRATEGY-PROBLEM-NOTHING-TO-DO?", 2, 0, false);
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    public static SubLObject init_removal_tactician_motivation_file() {
        removal_tactician_motivation.$removal_strategy_rl_tactician_tactic_types$ = SubLFiles.defparameter("*REMOVAL-STRATEGY-RL-TACTICIAN-TACTIC-TYPES*", (SubLObject)removal_tactician_motivation.$list14);
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    public static SubLObject setup_removal_tactician_motivation_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)removal_tactician_motivation.$sym15$REMOVAL_STRATEGY_NOTE_NEW_TACTIC);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_tactician_motivation.$sym17$REMOVAL_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_tactician_motivation.$sym36$REMOVAL_STRATEGY_CONSIDER_THAT_PROBLEM_COULD_BE_STRATEGICALLY_PEN);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_tactician_motivation.$sym37$REMOVAL_STRATEGY_PROBLEM_NOTHING_TO_DO_);
        return (SubLObject)removal_tactician_motivation.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_tactician_motivation_file();
    }
    
    public void initializeVariables() {
        init_removal_tactician_motivation_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_tactician_motivation_file();
    }
    
    static {
        me = (SubLFile)new removal_tactician_motivation();
        removal_tactician_motivation.$removal_strategy_rl_tactician_tactic_types$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGEM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$PROBLEM = SubLObjectFactory.makeUninternedSymbol("PROBLEM");
        $sym2$STRATEGEM_VAR = SubLObjectFactory.makeUninternedSymbol("STRATEGEM-VAR");
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym4$STRATEGEM_PROBLEM = SubLObjectFactory.makeSymbol("STRATEGEM-PROBLEM");
        $sym5$REMOVAL_STRATEGY_DEACTIVATE_STRATEGEM = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-DEACTIVATE-STRATEGEM");
        $sym6$REMOVAL_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM");
        $sym7$MOTIVATION_STRATEGEM_P = SubLObjectFactory.makeSymbol("MOTIVATION-STRATEGEM-P");
        $sym8$REMOVAL_STRATEGY_P = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-P");
        $kw9$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $kw10$PROVEN = SubLObjectFactory.makeKeyword("PROVEN");
        $kw11$RESTRICTION = SubLObjectFactory.makeKeyword("RESTRICTION");
        $kw12$REWRITE = SubLObjectFactory.makeKeyword("REWRITE");
        $sym13$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("SPLIT"), (SubLObject)SubLObjectFactory.makeKeyword("UNION"));
        $sym15$REMOVAL_STRATEGY_NOTE_NEW_TACTIC = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-NOTE-NEW-TACTIC");
        $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ = SubLObjectFactory.makeSymbol("LOGICAL-TACTIC-BETTER-WRT-REMOVAL?");
        $sym17$REMOVAL_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE");
        $kw18$META_STRUCTURAL = SubLObjectFactory.makeKeyword("META-STRUCTURAL");
        $kw19$GENERALIZED_REMOVAL_OR_REWRITE = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE");
        $kw20$POSSIBLE = SubLObjectFactory.makeKeyword("POSSIBLE");
        $kw21$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $kw22$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $kw23$GROSSLY_INCOMPLETE = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $sym24$TACTIC_STRATEGIC_PRODUCTIVITY__ = SubLObjectFactory.makeSymbol("TACTIC-STRATEGIC-PRODUCTIVITY-<");
        $kw25$DISJUNCTIVE = SubLObjectFactory.makeKeyword("DISJUNCTIVE");
        $kw26$SPLIT = SubLObjectFactory.makeKeyword("SPLIT");
        $kw27$NON_DISCARDED = SubLObjectFactory.makeKeyword("NON-DISCARDED");
        $kw28$POSITIVE_INFINITY = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $kw29$DISALLOWED = SubLObjectFactory.makeKeyword("DISALLOWED");
        $kw30$CONNECTED_CONJUNCTION = SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION");
        $kw31$JOIN = SubLObjectFactory.makeKeyword("JOIN");
        $kw32$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $sym33$SPLIT_TACTIC_P = SubLObjectFactory.makeSymbol("SPLIT-TACTIC-P");
        $sym34$EXECUTABLE_STRATEGEM_P = SubLObjectFactory.makeSymbol("EXECUTABLE-STRATEGEM-P");
        $sym35$REMOVAL_STRATEGEM_P = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGEM-P");
        $sym36$REMOVAL_STRATEGY_CONSIDER_THAT_PROBLEM_COULD_BE_STRATEGICALLY_PEN = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING");
        $sym37$REMOVAL_STRATEGY_PROBLEM_NOTHING_TO_DO_ = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-PROBLEM-NOTHING-TO-DO?");
    }
}

/*

	Total time: 195 ms
	
*/