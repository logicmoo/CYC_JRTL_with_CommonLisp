/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_recompute_set_aside_wrt;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_recompute_thrown_away_wrt;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_set_aside_wrt;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy.set_tactic_thrown_away_wrt;
import static com.cyc.cycjava.cycl.inference.harness.inference_tactician.motivation_strategem_link_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_tactician.possibly_clear_strategic_status_wrt;
import static com.cyc.cycjava.cycl.inference.harness.inference_tactician.problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics;
import static com.cyc.cycjava.cycl.inference.harness.inference_tactician.some_subsuming_join_ordered_tacticP;
import static com.cyc.cycjava.cycl.inference.harness.inference_tactician.strategem_invalid_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_tactician.strategem_problem;
import static com.cyc.cycjava.cycl.inference.harness.inference_tactician.strategy_sort;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-TACTICIAN-MOTIVATION
 * source file: /cyc/top/cycl/inference/harness/removal-tactician-motivation.lisp
 * created:     2019/07/03 17:37:41
 */
public final class removal_tactician_motivation extends SubLTranslatedFile implements V12 {
    /**
     * BT = removal tactician, RLT = reinforcement learning tactician
     */
    @LispMethod(comment = "BT = removal tactician, RLT = reinforcement learning tactician")
    public static final SubLObject merge_removal_and_rl_tactician_strategems(SubLObject bt_strategems_to_activate, SubLObject bt_strategems_to_set_aside, SubLObject bt_strategems_to_throw_away, SubLObject rlt_strategems_to_activate, SubLObject rlt_strategems_to_set_aside, SubLObject rlt_strategems_to_throw_away) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strategems_to_activate = NIL;
                SubLObject strategems_to_set_aside = NIL;
                SubLObject strategems_to_throw_away = NIL;
                if ($removal_strategy_rl_tactician_tactic_types$.getDynamicValue(thread).equal($list_alt15)) {
                    strategems_to_activate = rlt_strategems_to_activate;
                    strategems_to_set_aside = rlt_strategems_to_set_aside;
                    strategems_to_throw_away = rlt_strategems_to_throw_away;
                } else {
                    if (NIL == $removal_strategy_rl_tactician_tactic_types$.getDynamicValue(thread)) {
                        strategems_to_activate = bt_strategems_to_activate;
                        strategems_to_set_aside = bt_strategems_to_set_aside;
                        strategems_to_throw_away = bt_strategems_to_throw_away;
                    } else {
                        strategems_to_activate = com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_filter_strategems_by_rlt_tactic_types(bt_strategems_to_activate, rlt_strategems_to_activate);
                        strategems_to_set_aside = com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_filter_strategems_by_rlt_tactic_types(bt_strategems_to_set_aside, rlt_strategems_to_set_aside);
                        strategems_to_throw_away = com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_filter_strategems_by_rlt_tactic_types(bt_strategems_to_throw_away, rlt_strategems_to_throw_away);
                    }
                }
                return values(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
            }
        }
    }

    public static final SubLFile me = new removal_tactician_motivation();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation";


    // defparameter
    // The tactic types to use the RL tactician's ordering for.
    /**
     * The tactic types to use the RL tactician's ordering for.
     */
    @LispMethod(comment = "The tactic types to use the RL tactician\'s ordering for.\ndefparameter")
    private static final SubLSymbol $removal_strategy_rl_tactician_tactic_types$ = makeSymbol("*REMOVAL-STRATEGY-RL-TACTICIAN-TACTIC-TYPES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("STRATEGY"), makeSymbol("STRATEGEM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym1$PROBLEM = makeUninternedSymbol("PROBLEM");

    static private final SubLSymbol $sym2$STRATEGEM_VAR = makeUninternedSymbol("STRATEGEM-VAR");

    private static final SubLSymbol STRATEGEM_PROBLEM = makeSymbol("STRATEGEM-PROBLEM");

    private static final SubLSymbol REMOVAL_STRATEGY_DEACTIVATE_STRATEGEM = makeSymbol("REMOVAL-STRATEGY-DEACTIVATE-STRATEGEM");

    private static final SubLSymbol REMOVAL_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM = makeSymbol("REMOVAL-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM");

    private static final SubLSymbol MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");

    private static final SubLSymbol REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");

    private static final SubLList $list14 = list(makeKeyword("GENERALIZED-REMOVAL"), makeKeyword("CONNECTED-CONJUNCTION"), makeKeyword("SPLIT"), makeKeyword("UNION"));

    private static final SubLSymbol REMOVAL_STRATEGY_NOTE_NEW_TACTIC = makeSymbol("REMOVAL-STRATEGY-NOTE-NEW-TACTIC");

    private static final SubLSymbol $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ = makeSymbol("LOGICAL-TACTIC-BETTER-WRT-REMOVAL?");

    private static final SubLSymbol REMOVAL_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE = makeSymbol("REMOVAL-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE");

    private static final SubLSymbol $GENERALIZED_REMOVAL_OR_REWRITE = makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE");

    private static final SubLSymbol $sym24$TACTIC_STRATEGIC_PRODUCTIVITY__ = makeSymbol("TACTIC-STRATEGIC-PRODUCTIVITY-<");

    private static final SubLSymbol SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");

    private static final SubLSymbol EXECUTABLE_STRATEGEM_P = makeSymbol("EXECUTABLE-STRATEGEM-P");

    private static final SubLSymbol REMOVAL_STRATEGEM_P = makeSymbol("REMOVAL-STRATEGEM-P");

    private static final SubLSymbol $sym36$REMOVAL_STRATEGY_CONSIDER_THAT_PROBLEM_COULD_BE_STRATEGICALLY_PEN = makeSymbol("REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING");

    private static final SubLSymbol $sym37$REMOVAL_STRATEGY_PROBLEM_NOTHING_TO_DO_ = makeSymbol("REMOVAL-STRATEGY-PROBLEM-NOTHING-TO-DO?");

    // Definitions
    public static final SubLObject removal_strategy_with_strategically_active_strategem_alt(SubLObject macroform, SubLObject environment) {
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
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    strategy = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    strategem = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject problem = $sym1$PROBLEM;
                            SubLObject strategem_var = $sym2$STRATEGEM_VAR;
                            return listS(CLET, list(list(strategem_var, strategem), list(problem, list(STRATEGEM_PROBLEM, strategem_var))), list(REMOVAL_STRATEGY_DEACTIVATE_STRATEGEM, strategy, strategem_var), append(body, list(list(REMOVAL_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM, strategy, problem))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject removal_strategy_with_strategically_active_strategem(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy = NIL;
        SubLObject strategem = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        strategy = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        strategem = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject problem = $sym1$PROBLEM;
            final SubLObject strategem_var = $sym2$STRATEGEM_VAR;
            return listS(CLET, list(list(strategem_var, strategem), list(problem, list(STRATEGEM_PROBLEM, strategem_var))), list(REMOVAL_STRATEGY_DEACTIVATE_STRATEGEM, strategy, strategem_var), append(body, list(list(REMOVAL_STRATEGY_POSSIBLY_DEACTIVATE_PROBLEM, strategy, problem))));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject removal_strategy_possibly_propagate_motivation_to_link_head_alt(SubLObject strategy, SubLObject link_head) {
        SubLTrampolineFile.checkType(link_head, MOTIVATION_STRATEGEM_P);
        {
            SubLObject already_motivatedP = removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, link_head);
            if (NIL == already_motivatedP) {
                com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_propagate_motivation_to_link_head(strategy, link_head);
                return T;
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject removal_strategy_possibly_propagate_motivation_to_link_head(final SubLObject strategy, final SubLObject link_head) {
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : "! inference_tactician.motivation_strategem_p(link_head) " + ("inference_tactician.motivation_strategem_p(link_head) " + "CommonSymbols.NIL != inference_tactician.motivation_strategem_p(link_head) ") + link_head;
        final SubLObject already_motivatedP = removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, link_head);
        if (NIL == already_motivatedP) {
            removal_strategy_propagate_motivation_to_link_head(strategy, link_head);
            return T;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_propagate_motivation_to_link_head_alt(SubLObject strategy, SubLObject link_head) {
        SubLTrampolineFile.checkType(strategy, REMOVAL_STRATEGY_P);
        SubLTrampolineFile.checkType(link_head, MOTIVATION_STRATEGEM_P);
        removal_tactician_datastructures.removal_strategy_note_link_head_motivated(strategy, link_head);
        if (NIL != inference_worker_transformation.transformation_link_p(link_head)) {
        } else {
            if (NIL != motivation_strategem_link_p(link_head)) {
                {
                    SubLObject link = link_head;
                    SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(link);
                    com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, supporting_problem);
                }
            } else {
                {
                    SubLObject tactic = link_head;
                    if (NIL != inference_worker_join.join_tactic_p(tactic)) {
                        {
                            SubLObject join_link = inference_worker_join.join_tactic_link(tactic);
                            SubLObject first_problem = inference_worker_join.join_link_first_problem(join_link);
                            SubLObject second_problem = inference_worker_join.join_link_second_problem(join_link);
                            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, first_problem);
                            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, second_problem);
                        }
                    } else {
                        {
                            SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(tactic);
                            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, lookahead_problem);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_strategy_propagate_motivation_to_link_head(final SubLObject strategy, final SubLObject link_head) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : "! removal_tactician.removal_strategy_p(strategy) " + ("removal_tactician.removal_strategy_p(strategy) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(strategy) ") + strategy;
        assert NIL != inference_tactician.motivation_strategem_p(link_head) : "! inference_tactician.motivation_strategem_p(link_head) " + ("inference_tactician.motivation_strategem_p(link_head) " + "CommonSymbols.NIL != inference_tactician.motivation_strategem_p(link_head) ") + link_head;
        removal_tactician_datastructures.removal_strategy_note_link_head_motivated(strategy, link_head);
        if (NIL == inference_worker_transformation.transformation_link_p(link_head)) {
            if (NIL != inference_tactician.motivation_strategem_link_p(link_head)) {
                final SubLObject supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(link_head);
                removal_strategy_possibly_propagate_motivation_to_problem(strategy, supporting_problem);
            } else
                if (NIL != inference_worker_join.join_tactic_p(link_head)) {
                    final SubLObject join_link = inference_worker_join.join_tactic_link(link_head);
                    final SubLObject first_problem = inference_worker_join.join_link_first_problem(join_link);
                    final SubLObject second_problem = inference_worker_join.join_link_second_problem(join_link);
                    removal_strategy_possibly_propagate_motivation_to_problem(strategy, first_problem);
                    removal_strategy_possibly_propagate_motivation_to_problem(strategy, second_problem);
                } else {
                    final SubLObject lookahead_problem = inference_worker.logical_tactic_lookahead_problem(link_head);
                    removal_strategy_possibly_propagate_motivation_to_problem(strategy, lookahead_problem);
                }

        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject removal_strategy_link_motivates_problemP_alt(SubLObject strategy, SubLObject link, SubLObject problem) {
        if (problem == UNPROVIDED) {
            problem = NIL;
        }
        if (NIL == inference_worker_split.split_link_p(link)) {
            return com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_link_motivates_lookahead_problemP(strategy, link);
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
                                                    SubLObject rest_1 = NIL;
                                                    for (rest_1 = inference_datastructures_problem.problem_tactics(supported_problem); !((NIL != motivatedP) || (NIL == rest_1)); rest_1 = rest_1.rest()) {
                                                        {
                                                            SubLObject tactic = rest_1.first();
                                                            if (NIL != inference_worker_split.split_tactic_p(tactic)) {
                                                                {
                                                                    SubLObject supporting_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(tactic);
                                                                    if (mapped_problem == supporting_mapped_problem) {
                                                                        if (NIL != removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, tactic)) {
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
    @LispMethod(comment = "@return booleanp")
    public static SubLObject removal_strategy_link_motivates_problemP(final SubLObject strategy, final SubLObject link, SubLObject problem) {
        if (problem == UNPROVIDED) {
            problem = NIL;
        }
        if (NIL == inference_worker_split.split_link_p(link)) {
            return removal_strategy_link_motivates_lookahead_problemP(strategy, link);
        }
        SubLObject motivatedP = NIL;
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == motivatedP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                link_var = dependent_link;
                for (rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); (NIL == motivatedP) && (NIL != rest); rest = rest.rest()) {
                    mapped_problem = rest.first();
                    if ((NIL != inference_macros.do_problem_link_open_matchP(T, link_var, mapped_problem)) && problem_var.eql(inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) {
                        supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                        for (rest_$1 = NIL, rest_$1 = inference_datastructures_problem.problem_tactics(supported_problem); (NIL == motivatedP) && (NIL != rest_$1); rest_$1 = rest_$1.rest()) {
                            tactic = rest_$1.first();
                            if (NIL != inference_worker_split.split_tactic_p(tactic)) {
                                supporting_mapped_problem = inference_worker_split.find_split_tactic_supporting_mapped_problem(tactic);
                                if (mapped_problem.eql(supporting_mapped_problem) && (NIL != removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, tactic))) {
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

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject removal_strategy_link_motivates_lookahead_problemP_alt(SubLObject strategy, SubLObject link) {
        if (NIL != motivation_strategem_link_p(link)) {
            return removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, link);
        } else {
            if (NIL != inference_worker_split.split_link_p(link)) {
                return NIL;
            } else {
                if (NIL != inference_worker.logical_link_p(link)) {
                    {
                        SubLObject tactic = inference_worker.logical_link_unique_tactic(link);
                        return removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, tactic);
                    }
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject removal_strategy_link_motivates_lookahead_problemP(final SubLObject strategy, final SubLObject link) {
        if (NIL != inference_tactician.motivation_strategem_link_p(link)) {
            return removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, link);
        }
        if (NIL != inference_worker_split.split_link_p(link)) {
            return NIL;
        }
        if (NIL != inference_worker.logical_link_p(link)) {
            final SubLObject tactic = inference_worker.logical_link_unique_tactic(link);
            return removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, tactic);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject removal_strategy_possibly_propagate_motivation_to_problem_alt(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject already_motivatedP = inference_datastructures_strategy.problem_motivatedP(problem, strategy);
                if (NIL == already_motivatedP) {
                    removal_tactician_datastructures.removal_strategy_note_problem_motivated(strategy, problem);
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
                                                        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_link_motivates_problemP(strategy, join_ordered_link, problem)) {
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
                                                                            SubLObject cdolist_list_var_2 = proof_list;
                                                                            SubLObject proof = NIL;
                                                                            for (proof = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , proof = cdolist_list_var_2.first()) {
                                                                                if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                                                                                    {
                                                                                        SubLObject restricted_non_focal_mapped_problem = inference_worker_join_ordered.find_split_restriction(join_ordered_link, proof);
                                                                                        SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_non_focal_mapped_problem);
                                                                                        com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, restricted_non_focal_problem);
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
                    if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
                        com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_activate_problem(strategy, problem);
                    }
                    return T;
                }
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject removal_strategy_possibly_propagate_motivation_to_problem(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_motivatedP = inference_datastructures_strategy.problem_motivatedP(problem, strategy);
        if (NIL == already_motivatedP) {
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
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED))) {
                    link_var = join_ordered_link;
                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    mapped_problem = NIL;
                    mapped_problem = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (((NIL != inference_macros.do_problem_link_open_matchP(T, link_var, mapped_problem)) && problem.eql(inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) && (NIL != removal_strategy_link_motivates_problemP(strategy, join_ordered_link, problem))) {
                            status_var = $PROVEN;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                proof_list = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                cdolist_list_var_$2 = proof_list;
                                proof = NIL;
                                proof = cdolist_list_var_$2.first();
                                while (NIL != cdolist_list_var_$2) {
                                    if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
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
            if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
                removal_strategy_possibly_activate_problem(strategy, problem);
            }
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY chose to activate PROBLEM.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY chose to activate PROBLEM.")
    public static final SubLObject removal_strategy_possibly_activate_problem_alt(SubLObject strategy, SubLObject problem) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_chooses_not_to_examine_problemP(strategy, problem)) {
            return NIL;
        }
        inference_worker.determine_strategic_status_wrt(problem, strategy);
        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_chooses_not_to_activate_problemP(strategy, problem)) {
            return NIL;
        }
        if (NIL != inference_worker_restriction.problem_is_a_simplificationP(problem)) {
            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
        }
        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_problem_is_the_rest_of_a_removalP(problem, strategy)) {
            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
        }
        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_motivates_problem_via_rewriteP(strategy, problem)) {
            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
        }
        if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_problem_is_the_rest_of_a_join_orderedP(problem, strategy)) {
            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(strategy, problem);
        }
        {
            SubLObject activateP = makeBoolean((NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) && (NIL == com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_chooses_not_to_activate_problemP(strategy, problem)));
            if (NIL != activateP) {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_activate_problem(strategy, problem)) {
                    return T;
                } else {
                    com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_make_problem_pending(strategy, problem);
                    return NIL;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether STRATEGY chose to activate PROBLEM.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY chose to activate PROBLEM.")
    public static SubLObject removal_strategy_possibly_activate_problem(final SubLObject strategy, final SubLObject problem) {
        if (NIL != removal_strategy_chooses_not_to_examine_problemP(strategy, problem)) {
            return NIL;
        }
        inference_worker.determine_strategic_status_wrt(problem, strategy);
        if (NIL != removal_strategy_chooses_not_to_activate_problemP(strategy, problem)) {
            return NIL;
        }
        if (NIL != inference_worker_restriction.problem_is_a_simplificationP(problem)) {
            removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
        }
        if (NIL != removal_strategy_problem_is_the_rest_of_a_removalP(problem, strategy)) {
            removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
        }
        if (NIL != removal_strategy_motivates_problem_via_rewriteP(strategy, problem)) {
            removal_strategy_possibly_propagate_motivation_to_problem(strategy, problem);
        }
        if (NIL != removal_strategy_problem_is_the_rest_of_a_join_orderedP(problem, strategy)) {
            removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(strategy, problem);
        }
        final SubLObject activateP = makeBoolean((NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) && (NIL == removal_strategy_chooses_not_to_activate_problemP(strategy, problem)));
        if (NIL == activateP) {
            return NIL;
        }
        if (NIL != removal_strategy_activate_problem(strategy, problem)) {
            return T;
        }
        removal_strategy_make_problem_pending(strategy, problem);
        return NIL;
    }

    /**
     * if you are a restricted non-focal problem of some (open?) join-ordered link which has R,
     * you get R.  you're the rest of a removal.
     */
    @LispMethod(comment = "if you are a restricted non-focal problem of some (open?) join-ordered link which has R,\r\nyou get R.  you\'re the rest of a removal.\nif you are a restricted non-focal problem of some (open?) join-ordered link which has R,\nyou get R.  you\'re the rest of a removal.")
    public static final SubLObject removal_strategy_problem_is_the_rest_of_a_removalP_alt(SubLObject problem, SubLObject strategy) {
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
                                SubLObject set_contents_var_3 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                                SubLObject basis_object_4 = set_contents.do_set_contents_basis_object(set_contents_var_3);
                                SubLObject state_5 = NIL;
                                for (state_5 = set_contents.do_set_contents_initial_state(basis_object_4, set_contents_var_3); NIL == set_contents.do_set_contents_doneP(basis_object_4, state_5); state_5 = set_contents.do_set_contents_update_state(state_5)) {
                                    {
                                        SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object_4, state_5);
                                        if (NIL != set_contents.do_set_contents_element_validP(state_5, join_ordered_link)) {
                                            if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
                                                if (NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link)) {
                                                    if (non_focal_problem == inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link)) {
                                                        if ((NIL != inference_datastructures_problem_link.problem_link_openP(join_ordered_link)) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_link_motivates_lookahead_problemP(strategy, join_ordered_link))) {
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
     * if you are a restricted non-focal problem of some (open?) join-ordered link which has R,
     * you get R.  you're the rest of a removal.
     */
    @LispMethod(comment = "if you are a restricted non-focal problem of some (open?) join-ordered link which has R,\r\nyou get R.  you\'re the rest of a removal.\nif you are a restricted non-focal problem of some (open?) join-ordered link which has R,\nyou get R.  you\'re the rest of a removal.")
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            restriction_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION))) {
                non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                set_contents_var_$3 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                for (basis_object_$4 = set_contents.do_set_contents_basis_object(set_contents_var_$3), state_$5 = NIL, state_$5 = set_contents.do_set_contents_initial_state(basis_object_$4, set_contents_var_$3); NIL == set_contents.do_set_contents_doneP(basis_object_$4, state_$5); state_$5 = set_contents.do_set_contents_update_state(state_$5)) {
                    join_ordered_link = set_contents.do_set_contents_next(basis_object_$4, state_$5);
                    if ((((((NIL != set_contents.do_set_contents_element_validP(state_$5, join_ordered_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED))) && (NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link))) && non_focal_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link))) && (NIL != inference_datastructures_problem_link.problem_link_openP(join_ordered_link))) && (NIL != removal_strategy_link_motivates_lookahead_problemP(strategy, join_ordered_link))) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_problem_is_the_rest_of_a_join_orderedP_alt(SubLObject problem, SubLObject strategy) {
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
                                SubLObject set_contents_var_6 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                                SubLObject basis_object_7 = set_contents.do_set_contents_basis_object(set_contents_var_6);
                                SubLObject state_8 = NIL;
                                for (state_8 = set_contents.do_set_contents_initial_state(basis_object_7, set_contents_var_6); !((NIL != part_of_join_orderedP) || (NIL != set_contents.do_set_contents_doneP(basis_object_7, state_8))); state_8 = set_contents.do_set_contents_update_state(state_8)) {
                                    {
                                        SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object_7, state_8);
                                        if (NIL != set_contents.do_set_contents_element_validP(state_8, join_ordered_link)) {
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

    public static SubLObject removal_strategy_problem_is_the_rest_of_a_join_orderedP(final SubLObject problem, final SubLObject strategy) {
        SubLObject part_of_join_orderedP = NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject restriction_link;
        SubLObject non_focal_problem;
        SubLObject set_contents_var_$6;
        SubLObject basis_object_$7;
        SubLObject state_$8;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == part_of_join_orderedP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            restriction_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION))) {
                non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                set_contents_var_$6 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                for (basis_object_$7 = set_contents.do_set_contents_basis_object(set_contents_var_$6), state_$8 = NIL, state_$8 = set_contents.do_set_contents_initial_state(basis_object_$7, set_contents_var_$6); (NIL == part_of_join_orderedP) && (NIL == set_contents.do_set_contents_doneP(basis_object_$7, state_$8)); state_$8 = set_contents.do_set_contents_update_state(state_$8)) {
                    join_ordered_link = set_contents.do_set_contents_next(basis_object_$7, state_$8);
                    if ((((NIL != set_contents.do_set_contents_element_validP(state_$8, join_ordered_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED))) && (NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link))) && non_focal_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link))) {
                        part_of_join_orderedP = T;
                    }
                }
            }
        }
        return part_of_join_orderedP;
    }

    public static final SubLObject removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals_alt(SubLObject strategy, SubLObject problem) {
        return NIL;
    }

    public static SubLObject removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals(final SubLObject strategy, final SubLObject problem) {
        return NIL;
    }

    /**
     * if you are a supporting rewritten problem of a rewrite link whose supported problem has R,
     * you get R.
     */
    @LispMethod(comment = "if you are a supporting rewritten problem of a rewrite link whose supported problem has R,\r\nyou get R.\nif you are a supporting rewritten problem of a rewrite link whose supported problem has R,\nyou get R.")
    public static final SubLObject removal_strategy_motivates_problem_via_rewriteP_alt(SubLObject strategy, SubLObject problem) {
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
                                if (NIL != inference_datastructures_strategy.problem_motivatedP(inference_datastructures_problem_link.problem_link_supported_problem(link), strategy)) {
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

    @LispMethod(comment = "if you are a supporting rewritten problem of a rewrite link whose supported problem has R,\r\nyou get R.\nif you are a supporting rewritten problem of a rewrite link whose supported problem has R,\nyou get R.")
    public static SubLObject removal_strategy_motivates_problem_via_rewriteP(final SubLObject strategy, final SubLObject problem) {
        if (NIL != inference_datastructures_problem_store.problem_store_rewrite_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy))) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (((NIL != set_contents.do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $REWRITE))) && (NIL != inference_datastructures_strategy.problem_motivatedP(inference_datastructures_problem_link.problem_link_supported_problem(link), strategy))) {
                    return T;
                }
            }
        }
        return NIL;
    }/**
     * if you are a supporting rewritten problem of a rewrite link whose supported problem has R,
     * you get R.
     */


    public static final SubLObject removal_strategy_chooses_not_to_examine_problemP_alt(SubLObject strategy, SubLObject problem) {
        return inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem);
    }

    public static SubLObject removal_strategy_chooses_not_to_examine_problemP(final SubLObject strategy, final SubLObject problem) {
        return inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem);
    }

    public static final SubLObject removal_strategy_chooses_not_to_activate_problemP_alt(SubLObject strategy, SubLObject problem) {
        return makeBoolean((NIL != removal_tactician_datastructures.removal_strategy_problem_activeP(strategy, problem)) || (NIL != removal_tactician_datastructures.removal_strategy_problem_pendingP(strategy, problem)));
    }

    public static SubLObject removal_strategy_chooses_not_to_activate_problemP(final SubLObject strategy, final SubLObject problem) {
        return makeBoolean((NIL != removal_tactician_datastructures.removal_strategy_problem_activeP(strategy, problem)) || (NIL != removal_tactician_datastructures.removal_strategy_problem_pendingP(strategy, problem)));
    }

    public static final SubLObject removal_strategy_activate_problem_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, REMOVAL_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return plusp(com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_activate_strategems(strategy, problem));
    }

    public static SubLObject removal_strategy_activate_problem(final SubLObject strategy, final SubLObject problem) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : "! removal_tactician.removal_strategy_p(strategy) " + ("removal_tactician.removal_strategy_p(strategy) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(strategy) ") + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return plusp(removal_strategy_possibly_activate_strategems(strategy, problem));
    }

    public static final SubLObject removal_strategy_possibly_activate_strategems_alt(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject strategems_to_activate = com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_categorize_strategems(strategy, problem);
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
                            SubLObject strategems_to_activate_9 = com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.merge_removal_and_rl_tactician_strategems(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away, rlt_strategems_to_activate, rlt_strategems_to_set_aside, rlt_strategems_to_throw_away);
                            SubLObject strategems_to_set_aside_10 = thread.secondMultipleValue();
                            SubLObject strategems_to_throw_away_11 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            strategems_to_activate = strategems_to_activate_9;
                            strategems_to_set_aside = strategems_to_set_aside_10;
                            strategems_to_throw_away = strategems_to_throw_away_11;
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = strategems_to_activate;
                    SubLObject strategem = NIL;
                    for (strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strategem = cdolist_list_var.first()) {
                        removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
                    }
                }
                {
                    SubLObject cdolist_list_var = strategems_to_set_aside;
                    SubLObject strategem = NIL;
                    for (strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strategem = cdolist_list_var.first()) {
                        removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, strategem);
                        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
                            set_tactic_set_aside_wrt(strategem, strategy, $REMOVAL);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = strategems_to_throw_away;
                    SubLObject strategem = NIL;
                    for (strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strategem = cdolist_list_var.first()) {
                        removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, strategem);
                        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
                            set_tactic_thrown_away_wrt(strategem, strategy, $REMOVAL);
                        }
                    }
                }
                return length(strategems_to_activate);
            }
        }
    }

    public static SubLObject removal_strategy_possibly_activate_strategems(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject strategems_to_activate = removal_strategy_categorize_strategems(strategy, problem);
        final SubLObject strategems_to_set_aside = thread.secondMultipleValue();
        final SubLObject strategems_to_throw_away = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = strategems_to_activate;
        SubLObject strategem = NIL;
        strategem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
            cdolist_list_var = cdolist_list_var.rest();
            strategem = cdolist_list_var.first();
        } 
        cdolist_list_var = strategems_to_set_aside;
        strategem = NIL;
        strategem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, strategem);
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
            removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, strategem);
            if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
                inference_datastructures_strategy.set_tactic_thrown_away(strategem, strategy, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategem = cdolist_list_var.first();
        } 
        return length(strategems_to_activate);
    }

    /**
     * If there are multiple tactic types being filtered, for example conjunctive removal and connected conjunction,
     * and the RL tactician only applies to one of those types, then the removal tactician's types will come first.
     */
    @LispMethod(comment = "If there are multiple tactic types being filtered, for example conjunctive removal and connected conjunction,\r\nand the RL tactician only applies to one of those types, then the removal tactician\'s types will come first.\nIf there are multiple tactic types being filtered, for example conjunctive removal and connected conjunction,\nand the RL tactician only applies to one of those types, then the removal tactician\'s types will come first.")
    public static final SubLObject removal_strategy_filter_strategems_by_rlt_tactic_types_alt(SubLObject bt_strategems, SubLObject rlt_strategems) {
        if (bt_strategems.equal(rlt_strategems)) {
            return bt_strategems;
        } else {
            return com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_filter_strategems_by_rlt_tactic_types_int(bt_strategems, rlt_strategems);
        }
    }

    @LispMethod(comment = "If there are multiple tactic types being filtered, for example conjunctive removal and connected conjunction,\r\nand the RL tactician only applies to one of those types, then the removal tactician\'s types will come first.\nIf there are multiple tactic types being filtered, for example conjunctive removal and connected conjunction,\nand the RL tactician only applies to one of those types, then the removal tactician\'s types will come first.")
    public static SubLObject removal_strategy_filter_strategems_by_rlt_tactic_types(final SubLObject bt_strategems, final SubLObject rlt_strategems) {
        if (bt_strategems.equal(rlt_strategems)) {
            return bt_strategems;
        }
        return removal_strategy_filter_strategems_by_rlt_tactic_types_int(bt_strategems, rlt_strategems);
    }/**
     * If there are multiple tactic types being filtered, for example conjunctive removal and connected conjunction,
     * and the RL tactician only applies to one of those types, then the removal tactician's types will come first.
     */


    public static final SubLObject removal_strategy_filter_strategems_by_rlt_tactic_types_int_alt(SubLObject bt_strategems, SubLObject rlt_strategems) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strategems = NIL;
                {
                    SubLObject cdolist_list_var = bt_strategems;
                    SubLObject bt_strategem = NIL;
                    for (bt_strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bt_strategem = cdolist_list_var.first()) {
                        if (NIL == inference_datastructures_problem.tactic_matches_any_of_type_specsP(bt_strategem, $removal_strategy_rl_tactician_tactic_types$.getDynamicValue(thread))) {
                            strategems = cons(bt_strategem, strategems);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = rlt_strategems;
                    SubLObject rlt_strategem = NIL;
                    for (rlt_strategem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rlt_strategem = cdolist_list_var.first()) {
                        if (NIL != inference_datastructures_problem.tactic_matches_any_of_type_specsP(rlt_strategem, $removal_strategy_rl_tactician_tactic_types$.getDynamicValue(thread))) {
                            strategems = cons(rlt_strategem, strategems);
                        }
                    }
                }
                return nreverse(strategems);
            }
        }
    }

    public static SubLObject removal_strategy_filter_strategems_by_rlt_tactic_types_int(final SubLObject bt_strategems, final SubLObject rlt_strategems) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strategems = NIL;
        SubLObject cdolist_list_var = bt_strategems;
        SubLObject bt_strategem = NIL;
        bt_strategem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == inference_datastructures_problem.tactic_matches_any_of_type_specsP(bt_strategem, $removal_strategy_rl_tactician_tactic_types$.getDynamicValue(thread))) {
                strategems = cons(bt_strategem, strategems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bt_strategem = cdolist_list_var.first();
        } 
        cdolist_list_var = rlt_strategems;
        SubLObject rlt_strategem = NIL;
        rlt_strategem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.tactic_matches_any_of_type_specsP(rlt_strategem, $removal_strategy_rl_tactician_tactic_types$.getDynamicValue(thread))) {
                strategems = cons(rlt_strategem, strategems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rlt_strategem = cdolist_list_var.first();
        } 
        return nreverse(strategems);
    }

    public static final SubLObject removal_strategy_note_new_tactic_alt(SubLObject strategy, SubLObject tactic) {
        inference_worker.default_compute_strategic_properties_of_tactic(strategy, tactic);
        if (!((((NIL != inference_worker_split.split_tactic_p(tactic)) && (NIL != inference_worker_split.meta_split_tactics_enabledP())) || (NIL != inference_worker_transformation.transformation_tactic_p(tactic))) || (NIL != inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategy, tactic)))) {
            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_note_new_tactic_possible(strategy, tactic);
        }
        return NIL;
    }

    public static SubLObject removal_strategy_note_new_tactic(final SubLObject strategy, final SubLObject tactic) {
        inference_worker.default_compute_strategic_properties_of_tactic(strategy, tactic);
        if ((((NIL == inference_worker_split.split_tactic_p(tactic)) || (NIL == inference_worker_split.meta_split_tactics_enabledP())) && (NIL == inference_worker_transformation.transformation_tactic_p(tactic))) && (NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategy, tactic))) {
            removal_strategy_note_new_tactic_possible(strategy, tactic);
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_note_split_tactics_strategically_possible_alt(SubLObject strategy, SubLObject split_tactics) {
        {
            SubLObject sorted_split_tactics = strategy_sort(strategy, copy_list(split_tactics), $sym17$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
            SubLObject cdolist_list_var = reverse(sorted_split_tactics);
            SubLObject split_tactic = NIL;
            for (split_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , split_tactic = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_note_new_tactic_possible(strategy, split_tactic);
            }
        }
        return NIL;
    }

    public static SubLObject removal_strategy_note_split_tactics_strategically_possible(final SubLObject strategy, final SubLObject split_tactics) {
        final SubLObject sorted_split_tactics = inference_tactician.strategy_sort(strategy, copy_list(split_tactics), $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
        SubLObject cdolist_list_var = reverse(sorted_split_tactics);
        SubLObject split_tactic = NIL;
        split_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            removal_strategy_note_new_tactic_possible(strategy, split_tactic);
            cdolist_list_var = cdolist_list_var.rest();
            split_tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject removal_strategy_note_new_tactic_possible_alt(SubLObject strategy, SubLObject tactic) {
        {
            SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            inference_datastructures_strategy.problem_note_tactic_strategically_possible(problem, tactic, strategy);
        }
        if (((NIL != inference_worker_split.meta_split_tactics_enabledP()) && (NIL != inference_worker_split.split_tactic_p(tactic))) || ((NIL != inference_worker_transformation.transformation_tactic_p(tactic)) && (NIL == inference_worker_transformation.meta_transformation_tactic_p(tactic)))) {
            {
                SubLObject problem_already_consideredP = T;
                removal_tactician_datastructures.removal_strategy_note_problem_unpending(strategy, inference_datastructures_tactic.tactic_problem(tactic));
                if (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, NIL)) {
                    removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, tactic);
                } else {
                    if (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, problem_already_consideredP, NIL, T)) {
                        removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, tactic);
                    } else {
                        removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, tactic);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_strategy_note_new_tactic_possible(final SubLObject strategy, final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        inference_datastructures_strategy.problem_note_tactic_strategically_possible(problem, tactic, strategy);
        if (((NIL != inference_worker_split.meta_split_tactics_enabledP()) && (NIL != inference_worker_split.split_tactic_p(tactic))) || ((NIL != inference_worker_transformation.transformation_tactic_p(tactic)) && (NIL == inference_worker_transformation.meta_transformation_tactic_p(tactic)))) {
            final SubLObject problem_already_consideredP = T;
            removal_tactician_datastructures.removal_strategy_note_problem_unpending(strategy, inference_datastructures_tactic.tactic_problem(tactic));
            if (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, problem_already_consideredP, NIL, UNPROVIDED)) {
                removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, tactic);
            } else
                if (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, tactic, problem_already_consideredP, NIL, T)) {
                    removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, tactic);
                } else {
                    removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, tactic);
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
    @LispMethod(comment = "@return 0 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to activate wrt removal.\r\nStrategems are ordered in intended order of activation.\r\n@return 1 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to set aside wrt removal.\r\n@return 2 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to throw away wrt removal.")
    public static final SubLObject removal_strategy_categorize_strategems_alt(SubLObject strategy, SubLObject problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strategems_to_activate = NIL;
                SubLObject strategems_to_set_aside = NIL;
                SubLObject strategems_to_throw_away = NIL;
                SubLObject problem_set_asideP = removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, problem, UNPROVIDED, UNPROVIDED);
                SubLObject problem_thrown_awayP = removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject best_complete_removal_tactic = com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_categorize_removal_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
                    SubLObject possible_non_complete_removal_tactics = thread.secondMultipleValue();
                    SubLObject set_aside_removal_tactics = thread.thirdMultipleValue();
                    SubLObject thrown_away_removal_tactics = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject possible_motivation_strategems = com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_categorize_motivation_strategems(strategy, problem, problem_set_asideP, problem_thrown_awayP);
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

    /**
     *
     *
     * @return 0 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to activate wrt removal.
    Strategems are ordered in intended order of activation.
     * @return 1 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to set aside wrt removal.
     * @return 2 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to throw away wrt removal.
     */
    @LispMethod(comment = "@return 0 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to activate wrt removal.\r\nStrategems are ordered in intended order of activation.\r\n@return 1 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to set aside wrt removal.\r\n@return 2 listp of strategem-p; an ordered list of strategems on PROBLEM which STRATEGY may want to throw away wrt removal.")
    public static SubLObject removal_strategy_categorize_strategems(final SubLObject strategy, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strategems_to_activate = NIL;
        SubLObject strategems_to_set_aside = NIL;
        SubLObject strategems_to_throw_away = NIL;
        final SubLObject problem_set_asideP = removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_problemP(strategy, problem, UNPROVIDED, UNPROVIDED);
        final SubLObject problem_thrown_awayP = removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED, UNPROVIDED);
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
        strategems_to_set_aside = append(set_aside_removal_tactics, set_aside_motivation_strategems);
        strategems_to_throw_away = append(thrown_away_removal_tactics, thrown_away_motivation_strategems);
        possible_non_complete_removal_tactics = nreverse(possible_non_complete_removal_tactics);
        SubLObject cdolist_list_var;
        possible_motivation_strategems = cdolist_list_var = nreverse(possible_motivation_strategems);
        SubLObject logical_tactic = NIL;
        logical_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            strategems_to_activate = cons(logical_tactic, strategems_to_activate);
            cdolist_list_var = cdolist_list_var.rest();
            logical_tactic = cdolist_list_var.first();
        } 
        cdolist_list_var = possible_non_complete_removal_tactics;
        SubLObject removal_tactic = NIL;
        removal_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            strategems_to_activate = cons(removal_tactic, strategems_to_activate);
            cdolist_list_var = cdolist_list_var.rest();
            removal_tactic = cdolist_list_var.first();
        } 
        if (NIL != best_complete_removal_tactic) {
            strategems_to_activate = cons(best_complete_removal_tactic, strategems_to_activate);
        }
        cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject meta_structural_tactic = NIL;
        meta_structural_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(meta_structural_tactic, $META_STRUCTURAL)) {
                strategems_to_activate = cons(meta_structural_tactic, strategems_to_activate);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_structural_tactic = cdolist_list_var.first();
        } 
        strategems_to_activate = nreverse(strategems_to_activate);
        return subl_promotions.values3(strategems_to_activate, strategems_to_set_aside, strategems_to_throw_away);
    }

    public static final SubLObject removal_strategy_categorize_motivation_strategems_alt(SubLObject strategy, SubLObject problem, SubLObject problem_set_asideP, SubLObject problem_thrown_awayP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject possible_motivation_strategems = NIL;
                SubLObject set_aside_motivation_strategems = NIL;
                SubLObject thrown_away_motivation_strategems = NIL;
                if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
                } else {
                    if (NIL != inference_datastructures_problem.multi_clause_problem_p(problem)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject possible_motivation_strategems_12 = com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_categorize_disjunctive_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
                            SubLObject set_aside_motivation_strategems_13 = thread.secondMultipleValue();
                            SubLObject thrown_away_motivation_strategems_14 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            possible_motivation_strategems = possible_motivation_strategems_12;
                            set_aside_motivation_strategems = set_aside_motivation_strategems_13;
                            thrown_away_motivation_strategems = thrown_away_motivation_strategems_14;
                        }
                    } else {
                        if (NIL != inference_datastructures_problem.problem_has_split_tacticsP(problem)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject possible_motivation_strategems_15 = com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_categorize_split_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
                                SubLObject set_aside_motivation_strategems_16 = thread.secondMultipleValue();
                                SubLObject thrown_away_motivation_strategems_17 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                possible_motivation_strategems = possible_motivation_strategems_15;
                                set_aside_motivation_strategems = set_aside_motivation_strategems_16;
                                thrown_away_motivation_strategems = thrown_away_motivation_strategems_17;
                            }
                        } else {
                            thread.resetMultipleValues();
                            {
                                SubLObject possible_motivation_strategems_18 = com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_categorize_connected_conjunction_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
                                SubLObject set_aside_motivation_strategems_19 = thread.secondMultipleValue();
                                SubLObject thrown_away_motivation_strategems_20 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                possible_motivation_strategems = possible_motivation_strategems_18;
                                set_aside_motivation_strategems = set_aside_motivation_strategems_19;
                                thrown_away_motivation_strategems = thrown_away_motivation_strategems_20;
                            }
                        }
                    }
                }
                return values(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
            }
        }
    }

    public static SubLObject removal_strategy_categorize_motivation_strategems(final SubLObject strategy, final SubLObject problem, final SubLObject problem_set_asideP, final SubLObject problem_thrown_awayP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject possible_motivation_strategems = NIL;
        SubLObject set_aside_motivation_strategems = NIL;
        SubLObject thrown_away_motivation_strategems = NIL;
        if (NIL == inference_datastructures_problem.single_literal_problem_p(problem)) {
            if (NIL != inference_datastructures_problem.multi_clause_problem_p(problem)) {
                thread.resetMultipleValues();
                final SubLObject possible_motivation_strategems_$9 = removal_strategy_categorize_disjunctive_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
                final SubLObject set_aside_motivation_strategems_$10 = thread.secondMultipleValue();
                final SubLObject thrown_away_motivation_strategems_$11 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                possible_motivation_strategems = possible_motivation_strategems_$9;
                set_aside_motivation_strategems = set_aside_motivation_strategems_$10;
                thrown_away_motivation_strategems = thrown_away_motivation_strategems_$11;
            } else
                if (NIL != inference_datastructures_problem.problem_has_split_tacticsP(problem)) {
                    thread.resetMultipleValues();
                    final SubLObject possible_motivation_strategems_$10 = removal_strategy_categorize_split_tactics(strategy, problem, problem_set_asideP, problem_thrown_awayP);
                    final SubLObject set_aside_motivation_strategems_$11 = thread.secondMultipleValue();
                    final SubLObject thrown_away_motivation_strategems_$12 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    possible_motivation_strategems = possible_motivation_strategems_$10;
                    set_aside_motivation_strategems = set_aside_motivation_strategems_$11;
                    thrown_away_motivation_strategems = thrown_away_motivation_strategems_$12;
                } else {
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

    /**
     * Possible non-complete removal tactics should be in the reverse intended activation order
     */
    @LispMethod(comment = "Possible non-complete removal tactics should be in the reverse intended activation order")
    public static final SubLObject removal_strategy_categorize_removal_tactics_alt(SubLObject strategy, SubLObject problem, SubLObject problem_set_asideP, SubLObject problem_thrown_awayP) {
        {
            SubLObject best_complete_removal_tactic = NIL;
            SubLObject best_complete_removal_tactic_productivity = NIL;
            SubLObject set_aside_removal_tactics = NIL;
            SubLObject possible_non_complete_removal_tactics = NIL;
            if (NIL == problem_thrown_awayP) {
                {
                    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                    SubLObject removal_tactic = NIL;
                    for (removal_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , removal_tactic = cdolist_list_var.first()) {
                        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $GENERALIZED_REMOVAL_OR_REWRITE)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $POSSIBLE))) {
                            if (NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, removal_tactic, T, UNPROVIDED)) {
                                if ((NIL != problem_set_asideP) || (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, removal_tactic, T, UNPROVIDED, UNPROVIDED))) {
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
                                        } else {
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
                }
                possible_non_complete_removal_tactics = strategy_sort(strategy, possible_non_complete_removal_tactics, $sym25$TACTIC_STRATEGIC_PRODUCTIVITY__);
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

    @LispMethod(comment = "Possible non-complete removal tactics should be in the reverse intended activation order")
    public static SubLObject removal_strategy_categorize_removal_tactics(final SubLObject strategy, final SubLObject problem, final SubLObject problem_set_asideP, final SubLObject problem_thrown_awayP) {
        SubLObject best_complete_removal_tactic = NIL;
        SubLObject best_complete_removal_tactic_productivity = NIL;
        SubLObject set_aside_removal_tactics = NIL;
        SubLObject possible_non_complete_removal_tactics = NIL;
        if (NIL == problem_thrown_awayP) {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject removal_tactic = NIL;
            removal_tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic, $GENERALIZED_REMOVAL_OR_REWRITE)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic, $POSSIBLE))) && (NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, removal_tactic, T, UNPROVIDED, UNPROVIDED))) {
                    if ((NIL != problem_set_asideP) || (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, removal_tactic, T, UNPROVIDED, UNPROVIDED))) {
                        if (NIL == best_complete_removal_tactic) {
                            set_aside_removal_tactics = cons(removal_tactic, set_aside_removal_tactics);
                        }
                    } else {
                        final SubLObject pcase_var;
                        final SubLObject completeness = pcase_var = inference_datastructures_strategy.tactic_strategic_completeness(removal_tactic, strategy);
                        if (pcase_var.eql($COMPLETE)) {
                            final SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(removal_tactic, strategy);
                            if ((NIL == best_complete_removal_tactic) || (NIL != inference_datastructures_enumerated_types.productivity_L(productivity, best_complete_removal_tactic_productivity))) {
                                best_complete_removal_tactic = removal_tactic;
                                best_complete_removal_tactic_productivity = productivity;
                                if (NIL == inference_worker_removal.meta_removal_tactic_p(best_complete_removal_tactic)) {
                                    possible_non_complete_removal_tactics = NIL;
                                    set_aside_removal_tactics = NIL;
                                }
                            }
                        } else
                            if ((pcase_var.eql($INCOMPLETE) || pcase_var.eql($GROSSLY_INCOMPLETE)) && ((NIL == best_complete_removal_tactic) || (NIL != inference_worker_removal.meta_removal_tactic_p(best_complete_removal_tactic)))) {
                                possible_non_complete_removal_tactics = cons(removal_tactic, possible_non_complete_removal_tactics);
                            }

                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                removal_tactic = cdolist_list_var.first();
            } 
            possible_non_complete_removal_tactics = inference_tactician.strategy_sort(strategy, possible_non_complete_removal_tactics, $sym24$TACTIC_STRATEGIC_PRODUCTIVITY__);
        }
        SubLObject thrown_away_removal_tactics = NIL;
        SubLObject cdolist_list_var2 = inference_datastructures_problem.problem_tactics(problem);
        SubLObject removal_tactic2 = NIL;
        removal_tactic2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (((((NIL != inference_datastructures_problem.do_problem_tactics_type_match(removal_tactic2, $GENERALIZED_REMOVAL_OR_REWRITE)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(removal_tactic2, $POSSIBLE))) && (!removal_tactic2.eql(best_complete_removal_tactic))) && (NIL == list_utilities.member_eqP(removal_tactic2, possible_non_complete_removal_tactics))) && (NIL == list_utilities.member_eqP(removal_tactic2, set_aside_removal_tactics))) {
                thrown_away_removal_tactics = cons(removal_tactic2, thrown_away_removal_tactics);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            removal_tactic2 = cdolist_list_var2.first();
        } 
        return subl_promotions.values4(best_complete_removal_tactic, possible_non_complete_removal_tactics, set_aside_removal_tactics, thrown_away_removal_tactics);
    }/**
     * Possible non-complete removal tactics should be in the reverse intended activation order
     */


    public static final SubLObject removal_strategy_categorize_disjunctive_tactics_alt(SubLObject strategy, SubLObject problem, SubLObject problem_set_asideP, SubLObject problem_thrown_awayP) {
        {
            SubLObject possible_motivation_strategems = NIL;
            SubLObject set_aside_motivation_strategems = NIL;
            if (NIL == problem_thrown_awayP) {
                {
                    SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                                if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $DISJUNCTIVE)) {
                                    if (NIL == com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_link_motivates_problemP(strategy, link, UNPROVIDED)) {
                                        if (NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_disjunctive_linkP(strategy, link)) {
                                            {
                                                SubLObject disjunctive_tactic = inference_worker.logical_link_unique_tactic(link);
                                                if ((NIL != problem_set_asideP) || (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_disjunctive_linkP(strategy, link))) {
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
                possible_motivation_strategems = strategy_sort(strategy, possible_motivation_strategems, $sym17$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
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

    public static SubLObject removal_strategy_categorize_disjunctive_tactics(final SubLObject strategy, final SubLObject problem, final SubLObject problem_set_asideP, final SubLObject problem_thrown_awayP) {
        SubLObject possible_motivation_strategems = NIL;
        SubLObject set_aside_motivation_strategems = NIL;
        if (NIL == problem_thrown_awayP) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            SubLObject disjunctive_tactic;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if ((((NIL != set_contents.do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $DISJUNCTIVE))) && (NIL == removal_strategy_link_motivates_problemP(strategy, link, UNPROVIDED))) && (NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_disjunctive_linkP(strategy, link))) {
                    disjunctive_tactic = inference_worker.logical_link_unique_tactic(link);
                    if ((NIL != problem_set_asideP) || (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_disjunctive_linkP(strategy, link))) {
                        set_aside_motivation_strategems = cons(disjunctive_tactic, set_aside_motivation_strategems);
                    } else {
                        possible_motivation_strategems = cons(disjunctive_tactic, possible_motivation_strategems);
                    }
                }
            }
            possible_motivation_strategems = inference_tactician.strategy_sort(strategy, possible_motivation_strategems, $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
        }
        SubLObject thrown_away_motivation_strategems = NIL;
        final SubLObject set_contents_var2 = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject link2;
        SubLObject disjunctive_tactic2;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            link2 = set_contents.do_set_contents_next(basis_object2, state2);
            if ((NIL != set_contents.do_set_contents_element_validP(state2, link2)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link2, $DISJUNCTIVE))) {
                disjunctive_tactic2 = inference_worker.logical_link_unique_tactic(link2);
                if ((NIL == list_utilities.member_eqP(disjunctive_tactic2, possible_motivation_strategems)) && (NIL == list_utilities.member_eqP(disjunctive_tactic2, set_aside_motivation_strategems))) {
                    thrown_away_motivation_strategems = cons(disjunctive_tactic2, thrown_away_motivation_strategems);
                }
            }
        }
        return subl_promotions.values3(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
    }

    public static final SubLObject removal_strategy_categorize_split_tactics_alt(SubLObject strategy, SubLObject problem, SubLObject problem_set_asideP, SubLObject problem_thrown_awayP) {
        {
            SubLObject possible_motivation_strategems = NIL;
            SubLObject set_aside_motivation_strategems = NIL;
            if (NIL == problem_thrown_awayP) {
                {
                    SubLObject split_link = inference_worker_split.problem_sole_split_argument_link(problem);
                    if (NIL != split_link) {
                        {
                            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                            SubLObject split_tactic = NIL;
                            for (split_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , split_tactic = cdolist_list_var.first()) {
                                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(split_tactic, $SPLIT)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(split_tactic, $NON_DISCARDED))) {
                                    if (NIL == removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, split_tactic)) {
                                        if (NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, split_tactic, T, UNPROVIDED)) {
                                            if ((NIL != problem_set_asideP) || (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, split_tactic, T, UNPROVIDED, UNPROVIDED))) {
                                                set_aside_motivation_strategems = cons(split_tactic, set_aside_motivation_strategems);
                                            } else {
                                                possible_motivation_strategems = cons(split_tactic, possible_motivation_strategems);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        possible_motivation_strategems = strategy_sort(strategy, possible_motivation_strategems, $sym17$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
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

    public static SubLObject removal_strategy_categorize_split_tactics(final SubLObject strategy, final SubLObject problem, final SubLObject problem_set_asideP, final SubLObject problem_thrown_awayP) {
        SubLObject possible_motivation_strategems = NIL;
        SubLObject set_aside_motivation_strategems = NIL;
        if (NIL == problem_thrown_awayP) {
            final SubLObject split_link = inference_worker_split.problem_sole_split_argument_link(problem);
            if (NIL != split_link) {
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                SubLObject split_tactic = NIL;
                split_tactic = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((((NIL != inference_datastructures_problem.do_problem_tactics_type_match(split_tactic, $SPLIT)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(split_tactic, $NON_DISCARDED))) && (NIL == removal_tactician_datastructures.removal_strategy_link_head_motivatedP(strategy, split_tactic))) && (NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, split_tactic, T, UNPROVIDED, UNPROVIDED))) {
                        if ((NIL != problem_set_asideP) || (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, split_tactic, T, UNPROVIDED, UNPROVIDED))) {
                            set_aside_motivation_strategems = cons(split_tactic, set_aside_motivation_strategems);
                        } else {
                            possible_motivation_strategems = cons(split_tactic, possible_motivation_strategems);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    split_tactic = cdolist_list_var.first();
                } 
                possible_motivation_strategems = inference_tactician.strategy_sort(strategy, possible_motivation_strategems, $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
            }
        }
        SubLObject thrown_away_motivation_strategems = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject split_tactic = NIL;
        split_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((((NIL != inference_datastructures_problem.do_problem_tactics_type_match(split_tactic, $SPLIT)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(split_tactic, $NON_DISCARDED))) && (NIL == list_utilities.member_eqP(split_tactic, possible_motivation_strategems))) && (NIL == list_utilities.member_eqP(split_tactic, set_aside_motivation_strategems))) {
                thrown_away_motivation_strategems = cons(split_tactic, thrown_away_motivation_strategems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            split_tactic = cdolist_list_var.first();
        } 
        return subl_promotions.values3(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
    }

    public static final SubLObject removal_strategy_categorize_connected_conjunction_tactics_alt(SubLObject strategy, SubLObject problem, SubLObject problem_set_asideP, SubLObject problem_thrown_awayP) {
        {
            SubLObject possible_motivation_strategems = NIL;
            SubLObject set_aside_motivation_strategems = NIL;
            SubLObject committed_tactic = NIL;
            SubLObject committed_tactic_productivity = $POSITIVE_INFINITY;
            SubLObject committed_tactic_preference = $DISALLOWED;
            SubLObject committed_tactic_module_spec = $JOIN_ORDERED;
            SubLObject committed_tactic_literal_count = ZERO_INTEGER;
            SubLObject cheap_backtracking_tactics = NIL;
            if (NIL == problem_thrown_awayP) {
                {
                    SubLObject problem_var = problem;
                    SubLObject type_var = $CONNECTED_CONJUNCTION;
                    SubLObject subsuming_join_ordered_tactics = problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem_var, type_var);
                    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem_var);
                    SubLObject candidate_tactic = NIL;
                    for (candidate_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_tactic = cdolist_list_var.first()) {
                        if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, type_var)) {
                            if (NIL == some_subsuming_join_ordered_tacticP(candidate_tactic, subsuming_join_ordered_tactics, strategy)) {
                                {
                                    SubLObject link = inference_worker.logical_tactic_link(candidate_tactic);
                                    SubLObject candidate_tactic_module_spec = (NIL != inference_worker_join.join_tactic_p(candidate_tactic)) ? ((SubLObject) ($JOIN)) : $JOIN_ORDERED;
                                    if (NIL == com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_link_motivates_problemP(strategy, link, UNPROVIDED)) {
                                        if (NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_connected_conjunction_linkP(strategy, link)) {
                                            if ((NIL != problem_set_asideP) || (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_connected_conjunction_linkP(strategy, link))) {
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
                                                    if ((NIL == committed_tactic) || (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_deems_conjunctive_tactic_spec_betterP(strategy, candidate_tactic, candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literal_count, committed_tactic, committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literal_count))) {
                                                        committed_tactic = candidate_tactic;
                                                        committed_tactic_productivity = candidate_tactic_productivity;
                                                        committed_tactic_preference = candidate_tactic_preference;
                                                        committed_tactic_module_spec = candidate_tactic_module_spec;
                                                        committed_tactic_literal_count = candidate_tactic_literal_count;
                                                    }
                                                    if ((NIL == magic_wandP) && (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_logical_tactic_removal_backtracking_cheapP(candidate_tactic, strategy))) {
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
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_commits_to_no_removal_backtrackingP(strategy, committed_tactic, committed_tactic_preference)) {
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
                    possible_motivation_strategems = strategy_sort(strategy, possible_motivation_strategems, $sym17$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
                }
            }
            {
                SubLObject thrown_away_motivation_strategems = NIL;
                SubLObject problem_var = problem;
                SubLObject type_var = $CONNECTED_CONJUNCTION;
                SubLObject subsuming_join_ordered_tactics = problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem_var, type_var);
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem_var);
                SubLObject conjunctive_tactic = NIL;
                for (conjunctive_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunctive_tactic = cdolist_list_var.first()) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(conjunctive_tactic, type_var)) {
                        if (NIL == some_subsuming_join_ordered_tacticP(conjunctive_tactic, subsuming_join_ordered_tactics, strategy)) {
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

    public static SubLObject removal_strategy_categorize_connected_conjunction_tactics(final SubLObject strategy, final SubLObject problem, final SubLObject problem_set_asideP, final SubLObject problem_thrown_awayP) {
        SubLObject possible_motivation_strategems = NIL;
        SubLObject set_aside_motivation_strategems = NIL;
        SubLObject committed_tactic = NIL;
        SubLObject committed_tactic_productivity = $POSITIVE_INFINITY;
        SubLObject committed_tactic_preference = $DISALLOWED;
        SubLObject committed_tactic_module_spec = $JOIN_ORDERED;
        SubLObject committed_tactic_literals_score = ZERO_INTEGER;
        SubLObject cheap_backtracking_tactics = NIL;
        if (NIL == problem_thrown_awayP) {
            final SubLObject type_var = $CONNECTED_CONJUNCTION;
            final SubLObject subsuming_join_ordered_tactics = inference_tactician.problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem, type_var);
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject candidate_tactic = NIL;
            candidate_tactic = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, type_var)) && (NIL == inference_tactician.some_subsuming_join_ordered_tacticP(candidate_tactic, subsuming_join_ordered_tactics, strategy))) {
                    final SubLObject link = inference_worker.logical_tactic_link(candidate_tactic);
                    final SubLObject candidate_tactic_module_spec = (NIL != inference_worker_join.join_tactic_p(candidate_tactic)) ? $JOIN : $JOIN_ORDERED;
                    if ((NIL == removal_strategy_link_motivates_problemP(strategy, link, UNPROVIDED)) && (NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_connected_conjunction_linkP(strategy, link))) {
                        if ((NIL != problem_set_asideP) || (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_connected_conjunction_linkP(strategy, link))) {
                            set_aside_motivation_strategems = cons(candidate_tactic, set_aside_motivation_strategems);
                        } else {
                            final SubLObject candidate_tactic_productivity = inference_lookahead_productivity.tactic_max_removal_productivity(candidate_tactic, strategy);
                            SubLObject candidate_tactic_preference = inference_datastructures_strategy.tactic_strategic_preference_level(candidate_tactic, strategy);
                            final SubLObject candidate_tactic_literals_score = inference_worker.connected_conjunction_tactic_literals_score(candidate_tactic);
                            final SubLObject magic_wandP = inference_tactician_utilities.magic_wand_tacticP(candidate_tactic, strategy);
                            if (NIL != magic_wandP) {
                                candidate_tactic_preference = $DISALLOWED;
                            }
                            if ((NIL == committed_tactic) || (NIL != removal_strategy_deems_conjunctive_tactic_spec_betterP(strategy, candidate_tactic, candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literals_score, committed_tactic, committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literals_score))) {
                                committed_tactic = candidate_tactic;
                                committed_tactic_productivity = candidate_tactic_productivity;
                                committed_tactic_preference = candidate_tactic_preference;
                                committed_tactic_module_spec = candidate_tactic_module_spec;
                                committed_tactic_literals_score = candidate_tactic_literals_score;
                            }
                            if ((NIL == magic_wandP) && (NIL != removal_strategy_logical_tactic_removal_backtracking_cheapP(candidate_tactic, strategy))) {
                                cheap_backtracking_tactics = cons(candidate_tactic, cheap_backtracking_tactics);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate_tactic = cdolist_list_var.first();
            } 
            if (NIL != committed_tactic) {
                if (NIL != removal_strategy_commits_to_no_removal_backtrackingP(strategy, committed_tactic, committed_tactic_preference)) {
                    cheap_backtracking_tactics = NIL;
                } else {
                    cheap_backtracking_tactics = list_utilities.delete_first(committed_tactic, cheap_backtracking_tactics, symbol_function(EQ));
                }
                possible_motivation_strategems = cons(committed_tactic, possible_motivation_strategems);
                SubLObject cdolist_list_var2 = cheap_backtracking_tactics;
                SubLObject backtracking_tactic = NIL;
                backtracking_tactic = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    possible_motivation_strategems = cons(backtracking_tactic, possible_motivation_strategems);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    backtracking_tactic = cdolist_list_var2.first();
                } 
                possible_motivation_strategems = inference_tactician.strategy_sort(strategy, possible_motivation_strategems, $sym16$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_);
            }
        }
        SubLObject thrown_away_motivation_strategems = NIL;
        final SubLObject type_var2 = $CONNECTED_CONJUNCTION;
        final SubLObject subsuming_join_ordered_tactics2 = inference_tactician.problem_maximal_subsuming_multi_focal_literal_join_ordered_tactics(problem, type_var2);
        SubLObject cdolist_list_var3 = inference_datastructures_problem.problem_tactics(problem);
        SubLObject conjunctive_tactic = NIL;
        conjunctive_tactic = cdolist_list_var3.first();
        while (NIL != cdolist_list_var3) {
            if ((((NIL != inference_datastructures_problem.do_problem_tactics_type_match(conjunctive_tactic, type_var2)) && (NIL == inference_tactician.some_subsuming_join_ordered_tacticP(conjunctive_tactic, subsuming_join_ordered_tactics2, strategy))) && (NIL == list_utilities.member_eqP(conjunctive_tactic, possible_motivation_strategems))) && (NIL == list_utilities.member_eqP(conjunctive_tactic, set_aside_motivation_strategems))) {
                thrown_away_motivation_strategems = cons(conjunctive_tactic, thrown_away_motivation_strategems);
            }
            cdolist_list_var3 = cdolist_list_var3.rest();
            conjunctive_tactic = cdolist_list_var3.first();
        } 
        return subl_promotions.values3(possible_motivation_strategems, set_aside_motivation_strategems, thrown_away_motivation_strategems);
    }

    public static final SubLObject removal_strategy_deems_conjunctive_tactic_spec_betterP_alt(SubLObject strategy, SubLObject candidate_tactic, SubLObject candidate_tactic_productivity, SubLObject candidate_tactic_preference, SubLObject candidate_tactic_module_spec, SubLObject candidate_tactic_literal_count, SubLObject committed_tactic, SubLObject committed_tactic_productivity, SubLObject committed_tactic_preference, SubLObject committed_tactic_module_spec, SubLObject committed_tactic_literal_count) {
        if (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(candidate_tactic))) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP(candidate_tactic)) {
                return T;
            }
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP(committed_tactic)) {
                return NIL;
            }
        }
        if (((NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(committed_tactic))) && (NIL != inference_datastructures_enumerated_types.productivity_E(candidate_tactic_productivity, committed_tactic_productivity))) && (candidate_tactic_preference == committed_tactic_preference)) {
            {
                SubLObject candidate_completeness = inference_worker.logical_tactic_generalized_removal_completeness(candidate_tactic, strategy);
                SubLObject committed_completeness = inference_worker.logical_tactic_generalized_removal_completeness(committed_tactic, strategy);
                if (NIL != inference_datastructures_enumerated_types.completeness_G(candidate_completeness, committed_completeness)) {
                    return T;
                }
            }
        }
        return inference_tactician_utilities.strategy_deems_conjunctive_tactic_spec_betterP(candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literal_count, committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literal_count);
    }

    public static SubLObject removal_strategy_deems_conjunctive_tactic_spec_betterP(final SubLObject strategy, final SubLObject candidate_tactic, final SubLObject candidate_tactic_productivity, final SubLObject candidate_tactic_preference, final SubLObject candidate_tactic_module_spec, final SubLObject candidate_tactic_literals_score, final SubLObject committed_tactic, final SubLObject committed_tactic_productivity, final SubLObject committed_tactic_preference, final SubLObject committed_tactic_module_spec, final SubLObject committed_tactic_literals_score) {
        if (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(candidate_tactic))) {
            if (NIL != join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP(candidate_tactic)) {
                return T;
            }
            if (NIL != join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP(committed_tactic)) {
                return NIL;
            }
        }
        if (((NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(committed_tactic))) && (NIL != inference_datastructures_enumerated_types.productivity_E(candidate_tactic_productivity, committed_tactic_productivity))) && candidate_tactic_preference.eql(committed_tactic_preference)) {
            final SubLObject candidate_completeness = inference_worker.logical_tactic_generalized_removal_completeness(candidate_tactic, strategy);
            final SubLObject committed_completeness = inference_worker.logical_tactic_generalized_removal_completeness(committed_tactic, strategy);
            if (NIL != inference_datastructures_enumerated_types.completeness_G(candidate_completeness, committed_completeness)) {
                return T;
            }
        }
        return inference_tactician_utilities.strategy_deems_conjunctive_tactic_spec_betterP(candidate_tactic_productivity, candidate_tactic_preference, candidate_tactic_module_spec, candidate_tactic_literals_score, committed_tactic_productivity, committed_tactic_preference, committed_tactic_module_spec, committed_tactic_literals_score);
    }

    public static final SubLObject join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP_alt(SubLObject tactic) {
        if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            {
                SubLObject lookahead_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(tactic);
                if (NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem)) {
                    return inference_worker_join_ordered.potentially_simplifying_asentP(inference_datastructures_problem.single_literal_problem_atomic_sentence(lookahead_problem));
                }
            }
        }
        return NIL;
    }

    public static SubLObject join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP(final SubLObject tactic) {
        if (NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            final SubLObject lookahead_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(tactic);
            if (NIL != inference_datastructures_problem.single_literal_problem_p(lookahead_problem)) {
                return inference_worker_join_ordered.potentially_simplifying_asentP(inference_datastructures_problem.single_literal_problem_atomic_sentence(lookahead_problem));
            }
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_commits_to_no_removal_backtrackingP_alt(SubLObject strategy, SubLObject committed_tactic, SubLObject committed_tactic_preference_level) {
        if (NIL != (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(committed_tactic)) ? ((SubLObject) (eq($COMPLETE, inference_worker.logical_tactic_generalized_removal_completeness(committed_tactic, strategy)))) : eq($PREFERRED, committed_tactic_preference_level))) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_logical_tactic_removal_backtracking_cheapP(committed_tactic, strategy)) {
                return T;
            }
        }
        if (NIL != inference_trampolines.problem_backchain_requiredP(inference_datastructures_tactic.tactic_problem(committed_tactic))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject removal_strategy_commits_to_no_removal_backtrackingP(final SubLObject strategy, final SubLObject committed_tactic, final SubLObject committed_tactic_preference_level) {
        if ((NIL != (NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(committed_tactic)) ? eq($COMPLETE, inference_worker.logical_tactic_generalized_removal_completeness(committed_tactic, strategy)) : eq($PREFERRED, committed_tactic_preference_level))) && (NIL != removal_strategy_logical_tactic_removal_backtracking_cheapP(committed_tactic, strategy))) {
            return T;
        }
        if (NIL != inference_datastructures_problem.problem_backchain_requiredP(inference_datastructures_tactic.tactic_problem(committed_tactic))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_logical_tactic_removal_backtracking_cheapP_alt(SubLObject logical_tactic, SubLObject strategy) {
        if (NIL == inference_worker_join.join_tactic_p(logical_tactic)) {
            {
                SubLObject removal_backtracking_productivity_threshold = removal_tactician_datastructures.removal_strategy_removal_backtracking_productivity_limit(strategy);
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

    public static SubLObject removal_strategy_logical_tactic_removal_backtracking_cheapP(final SubLObject logical_tactic, final SubLObject strategy) {
        if (NIL == inference_worker_join.join_tactic_p(logical_tactic)) {
            final SubLObject removal_backtracking_productivity_threshold = removal_tactician_datastructures.removal_strategy_removal_backtracking_productivity_limit(strategy);
            if (NIL != removal_backtracking_productivity_threshold) {
                final SubLObject productivity = inference_lookahead_productivity.tactic_max_removal_productivity(logical_tactic, strategy);
                return inference_datastructures_enumerated_types.productivity_LE(productivity, removal_backtracking_productivity_threshold);
            }
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_possibly_reconsider_split_set_asides_alt(SubLObject strategy, SubLObject split_tactic) {
        {
            SubLObject reactivated_count = ZERO_INTEGER;
            SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
            SubLObject index = removal_tactician_datastructures.removal_strategy_problem_strategems_set_aside(strategy);
            SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
            if (NIL != set.non_empty_set_p(v_set)) {
                {
                    SubLObject set_aside_split_tactics = list_utilities.delete_if_not(SPLIT_TACTIC_P, set.set_element_list(v_set), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject set_aside_split_tactics_in_order = set_aside_split_tactics;
                    {
                        SubLObject cdolist_list_var = set_aside_split_tactics_in_order;
                        SubLObject split_tactic_21 = NIL;
                        for (split_tactic_21 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , split_tactic_21 = cdolist_list_var.first()) {
                            set.set_remove(split_tactic_21, v_set);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = set_aside_split_tactics_in_order;
                        SubLObject split_tactic_22 = NIL;
                        for (split_tactic_22 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , split_tactic_22 = cdolist_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_reconsider_one_split_set_aside(strategy, split_tactic_22)) {
                                reactivated_count = add(reactivated_count, ONE_INTEGER);
                            }
                        }
                    }
                }
            }
            return reactivated_count;
        }
    }

    public static SubLObject removal_strategy_possibly_reconsider_split_set_asides(final SubLObject strategy, final SubLObject split_tactic) {
        SubLObject reactivated_count = ZERO_INTEGER;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
        final SubLObject index = removal_tactician_datastructures.removal_strategy_problem_strategems_set_aside(strategy);
        final SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (NIL != set.non_empty_set_p(v_set)) {
            final SubLObject set_aside_split_tactics = list_utilities.delete_if_not(SPLIT_TACTIC_P, set.set_element_list(v_set), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject set_aside_split_tactics_in_order = cdolist_list_var = set_aside_split_tactics;
            SubLObject split_tactic_$18 = NIL;
            split_tactic_$18 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_remove(split_tactic_$18, v_set);
                cdolist_list_var = cdolist_list_var.rest();
                split_tactic_$18 = cdolist_list_var.first();
            } 
            cdolist_list_var = set_aside_split_tactics_in_order;
            SubLObject split_tactic_$19 = NIL;
            split_tactic_$19 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != removal_strategy_reconsider_one_split_set_aside(strategy, split_tactic_$19)) {
                    reactivated_count = add(reactivated_count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                split_tactic_$19 = cdolist_list_var.first();
            } 
        }
        return reactivated_count;
    }

    public static final SubLObject removal_strategy_reconsider_one_split_set_aside_alt(SubLObject strategy, SubLObject split_tactic) {
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
                            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_clear_strategic_status(strategy, problem);
                            set_tactic_recompute_thrown_away_wrt(split_tactic, strategy, $REMOVAL);
                            set_tactic_recompute_set_aside_wrt(split_tactic, strategy, $REMOVAL);
                            if (NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, split_tactic, NIL, T)) {
                                if (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, split_tactic, NIL, T, T)) {
                                    removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, split_tactic);
                                } else {
                                    removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, split_tactic);
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

    public static SubLObject removal_strategy_reconsider_one_split_set_aside(final SubLObject strategy, final SubLObject split_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = inference_worker.$reconsidering_set_asidesP$.currentBinding(thread);
        try {
            inference_worker.$reconsidering_set_asidesP$.bind(T, thread);
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(split_tactic);
            removal_strategy_possibly_clear_strategic_status(strategy, problem);
            inference_datastructures_strategy.set_tactic_recompute_thrown_away(split_tactic, strategy);
            inference_datastructures_strategy.set_tactic_recompute_set_aside(split_tactic, strategy);
            if (NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, split_tactic, NIL, T, UNPROVIDED)) {
                if (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_set_aside_tacticP(strategy, split_tactic, NIL, T, T)) {
                    removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, split_tactic);
                } else {
                    removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, split_tactic);
                    result = T;
                }
            }
        } finally {
            inference_worker.$reconsidering_set_asidesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject removal_strategy_possibly_clear_strategic_status_alt(SubLObject strategy, SubLObject problem) {
        if (NIL != inference_datastructures_strategy.strategically_pending_problem_p(problem, strategy)) {
            possibly_clear_strategic_status_wrt(problem, strategy);
        }
        inference_datastructures_strategy.strategy_clear_problem_set_aside(strategy, problem);
        removal_tactician_datastructures.removal_strategy_note_problem_unpending(strategy, problem);
        return NIL;
    }

    public static SubLObject removal_strategy_possibly_clear_strategic_status(final SubLObject strategy, final SubLObject problem) {
        if (NIL != inference_datastructures_strategy.strategically_pending_problem_p(problem, strategy)) {
            inference_tactician.possibly_clear_strategic_status_wrt(problem, strategy);
        }
        inference_datastructures_strategy.strategy_clear_problem_set_aside(strategy, problem);
        removal_tactician_datastructures.removal_strategy_note_problem_unpending(strategy, problem);
        return NIL;
    }

    public static final SubLObject removal_strategy_reactivate_executable_strategem_alt(SubLObject strategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(strategy, REMOVAL_STRATEGY_P);
        SubLTrampolineFile.checkType(strategem, EXECUTABLE_STRATEGEM_P);
        if (NIL != inference_worker_removal.generalized_removal_tactic_p(strategem)) {
            return removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
        } else {
            if (NIL != inference_worker_transformation.transformation_tactic_p(strategem)) {
                return NIL;
            } else {
                if (NIL != inference_worker.meta_structural_tactic_p(strategem)) {
                    removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
                    return strategem;
                } else {
                    return removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
                }
            }
        }
    }

    public static SubLObject removal_strategy_reactivate_executable_strategem(final SubLObject strategy, final SubLObject strategem) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : "! removal_tactician.removal_strategy_p(strategy) " + ("removal_tactician.removal_strategy_p(strategy) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(strategy) ") + strategy;
        assert NIL != inference_tactician.executable_strategem_p(strategem) : "! inference_tactician.executable_strategem_p(strategem) " + ("inference_tactician.executable_strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.executable_strategem_p(strategem) ") + strategem;
        if (NIL != inference_worker_removal.generalized_removal_tactic_p(strategem)) {
            return removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
        }
        if (NIL != inference_worker_transformation.transformation_tactic_p(strategem)) {
            return NIL;
        }
        if (NIL != inference_worker.meta_structural_tactic_p(strategem)) {
            removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
            return strategem;
        }
        return removal_tactician_datastructures.removal_strategy_activate_strategem(strategy, strategem);
    }

    public static final SubLObject removal_strategy_strategically_deactivate_strategem_alt(SubLObject strategy, SubLObject strategem) {
        if (NIL != strategem_invalid_p(strategem)) {
            return NIL;
        }
        {
            SubLObject strategem_var = strategem;
            SubLObject problem = strategem_problem(strategem_var);
            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_deactivate_strategem(strategy, strategem_var);
            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_deactivate_problem(strategy, problem);
        }
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            inference_worker.consider_strategic_ramifications_of_possibly_executed_tactic(strategy, strategem);
        }
        return NIL;
    }

    public static SubLObject removal_strategy_strategically_deactivate_strategem(final SubLObject strategy, final SubLObject strategem) {
        if (NIL != inference_tactician.strategem_invalid_p(strategem)) {
            return NIL;
        }
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        removal_strategy_deactivate_strategem(strategy, strategem);
        removal_strategy_possibly_deactivate_problem(strategy, problem);
        if (NIL != inference_datastructures_tactic.tactic_p(strategem)) {
            inference_worker.consider_strategic_ramifications_of_possibly_executed_tactic(strategy, strategem);
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_deactivate_strategem_alt(SubLObject strategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(strategy, REMOVAL_STRATEGY_P);
        SubLTrampolineFile.checkType(strategem, REMOVAL_STRATEGEM_P);
        {
            SubLObject problem = strategem_problem(strategem);
            SubLObject index = removal_tactician_datastructures.removal_strategy_problem_total_strategems_active(strategy);
            SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
            count = subtract(count, ONE_INTEGER);
            if (count.isPositive()) {
                dictionary.dictionary_enter(index, problem, count);
            } else {
                dictionary.dictionary_remove(index, problem);
                removal_tactician_datastructures.removal_strategy_note_problem_pending(strategy, problem);
            }
            return count;
        }
    }

    public static SubLObject removal_strategy_deactivate_strategem(final SubLObject strategy, final SubLObject strategem) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : "! removal_tactician.removal_strategy_p(strategy) " + ("removal_tactician.removal_strategy_p(strategy) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(strategy) ") + strategy;
        assert NIL != inference_tactician.removal_strategem_p(strategem) : "! inference_tactician.removal_strategem_p(strategem) " + ("inference_tactician.removal_strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.removal_strategem_p(strategem) ") + strategem;
        final SubLObject problem = inference_tactician.strategem_problem(strategem);
        final SubLObject index = removal_tactician_datastructures.removal_strategy_problem_total_strategems_active(strategy);
        SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
        count = subtract(count, ONE_INTEGER);
        if (count.isPositive()) {
            dictionary.dictionary_enter(index, problem, count);
        } else {
            dictionary.dictionary_remove(index, problem);
            removal_tactician_datastructures.removal_strategy_note_problem_pending(strategy, problem);
        }
        return count;
    }

    public static final SubLObject removal_strategy_possibly_deactivate_problem_alt(SubLObject strategy, SubLObject problem) {
        if (NIL == removal_tactician_datastructures.removal_strategy_problem_activeP(strategy, problem)) {
            inference_datastructures_strategy.strategy_note_problem_inactive(strategy, problem);
            if (NIL != removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem)) {
                inference_datastructures_strategy.strategy_note_problem_set_aside(strategy, problem);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject removal_strategy_possibly_deactivate_problem(final SubLObject strategy, final SubLObject problem) {
        if (NIL == removal_tactician_datastructures.removal_strategy_problem_activeP(strategy, problem)) {
            inference_datastructures_strategy.strategy_note_problem_inactive(strategy, problem);
            if (NIL != removal_tactician_datastructures.removal_strategy_problem_set_asideP(strategy, problem)) {
                inference_datastructures_strategy.strategy_note_problem_set_aside(strategy, problem);
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_consider_that_problem_could_be_strategically_pending_alt(SubLObject strategy, SubLObject problem) {
        if (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED)) {
            com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_make_problem_pending(strategy, problem);
            return T;
        }
        return NIL;
    }

    public static SubLObject removal_strategy_consider_that_problem_could_be_strategically_pending(final SubLObject strategy, final SubLObject problem) {
        if (NIL != removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_problemP(strategy, problem, UNPROVIDED, UNPROVIDED)) {
            removal_strategy_make_problem_pending(strategy, problem);
            return T;
        }
        return NIL;
    }

    public static final SubLObject removal_strategy_make_problem_pending_alt(SubLObject strategy, SubLObject problem) {
        removal_tactician_datastructures.removal_strategy_note_problem_pending(strategy, problem);
        com.cyc.cycjava.cycl.inference.harness.removal_tactician_motivation.removal_strategy_possibly_deactivate_problem(strategy, problem);
        return NIL;
    }

    public static SubLObject removal_strategy_make_problem_pending(final SubLObject strategy, final SubLObject problem) {
        removal_tactician_datastructures.removal_strategy_note_problem_pending(strategy, problem);
        removal_strategy_possibly_deactivate_problem(strategy, problem);
        return NIL;
    }

    public static SubLObject removal_strategy_problem_nothing_to_doP(final SubLObject strategy, final SubLObject problem) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == removal_tactician_uninterestingness.removal_strategy_chooses_to_throw_away_tacticP(strategy, tactic, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject declare_removal_tactician_motivation_file_alt() {
        declareMacro("removal_strategy_with_strategically_active_strategem", "REMOVAL-STRATEGY-WITH-STRATEGICALLY-ACTIVE-STRATEGEM");
        declareFunction("removal_strategy_possibly_propagate_motivation_to_link_head", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
        declareFunction("removal_strategy_propagate_motivation_to_link_head", "REMOVAL-STRATEGY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
        declareFunction("removal_strategy_link_motivates_problemP", "REMOVAL-STRATEGY-LINK-MOTIVATES-PROBLEM?", 2, 1, false);
        declareFunction("removal_strategy_link_motivates_lookahead_problemP", "REMOVAL-STRATEGY-LINK-MOTIVATES-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_possibly_propagate_motivation_to_problem", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction("removal_strategy_possibly_activate_problem", "REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("removal_strategy_problem_is_the_rest_of_a_removalP", "REMOVAL-STRATEGY-PROBLEM-IS-THE-REST-OF-A-REMOVAL?", 2, 0, false);
        declareFunction("removal_strategy_problem_is_the_rest_of_a_join_orderedP", "REMOVAL-STRATEGY-PROBLEM-IS-THE-REST-OF-A-JOIN-ORDERED?", 2, 0, false);
        declareFunction("removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-PROOF-SPEC-TO-RESTRICTED-NON-FOCALS", 2, 0, false);
        declareFunction("removal_strategy_motivates_problem_via_rewriteP", "REMOVAL-STRATEGY-MOTIVATES-PROBLEM-VIA-REWRITE?", 2, 0, false);
        declareFunction("removal_strategy_chooses_not_to_examine_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_chooses_not_to_activate_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_activate_problem", "REMOVAL-STRATEGY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("removal_strategy_possibly_activate_strategems", "REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS", 2, 0, false);
        declareFunction("merge_removal_and_rl_tactician_strategems", "MERGE-REMOVAL-AND-RL-TACTICIAN-STRATEGEMS", 6, 0, false);
        declareFunction("removal_strategy_filter_strategems_by_rlt_tactic_types", "REMOVAL-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES", 2, 0, false);
        declareFunction("removal_strategy_filter_strategems_by_rlt_tactic_types_int", "REMOVAL-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES-INT", 2, 0, false);
        declareFunction("removal_strategy_note_new_tactic", "REMOVAL-STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
        declareFunction("removal_strategy_note_split_tactics_strategically_possible", "REMOVAL-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
        declareFunction("removal_strategy_note_new_tactic_possible", "REMOVAL-STRATEGY-NOTE-NEW-TACTIC-POSSIBLE", 2, 0, false);
        declareFunction("removal_strategy_categorize_strategems", "REMOVAL-STRATEGY-CATEGORIZE-STRATEGEMS", 2, 0, false);
        declareFunction("removal_strategy_categorize_motivation_strategems", "REMOVAL-STRATEGY-CATEGORIZE-MOTIVATION-STRATEGEMS", 4, 0, false);
        declareFunction("removal_strategy_categorize_removal_tactics", "REMOVAL-STRATEGY-CATEGORIZE-REMOVAL-TACTICS", 4, 0, false);
        declareFunction("removal_strategy_categorize_disjunctive_tactics", "REMOVAL-STRATEGY-CATEGORIZE-DISJUNCTIVE-TACTICS", 4, 0, false);
        declareFunction("removal_strategy_categorize_split_tactics", "REMOVAL-STRATEGY-CATEGORIZE-SPLIT-TACTICS", 4, 0, false);
        declareFunction("removal_strategy_categorize_connected_conjunction_tactics", "REMOVAL-STRATEGY-CATEGORIZE-CONNECTED-CONJUNCTION-TACTICS", 4, 0, false);
        declareFunction("removal_strategy_deems_conjunctive_tactic_spec_betterP", "REMOVAL-STRATEGY-DEEMS-CONJUNCTIVE-TACTIC-SPEC-BETTER?", 11, 0, false);
        declareFunction("join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP", "JOIN-ORDERED-TACTIC-THAT-LEADS-TO-A-POTENTIALLY-SIMPLIFYING-LITERAL?", 1, 0, false);
        declareFunction("removal_strategy_commits_to_no_removal_backtrackingP", "REMOVAL-STRATEGY-COMMITS-TO-NO-REMOVAL-BACKTRACKING?", 3, 0, false);
        declareFunction("removal_strategy_logical_tactic_removal_backtracking_cheapP", "REMOVAL-STRATEGY-LOGICAL-TACTIC-REMOVAL-BACKTRACKING-CHEAP?", 2, 0, false);
        declareFunction("removal_strategy_possibly_reconsider_split_set_asides", "REMOVAL-STRATEGY-POSSIBLY-RECONSIDER-SPLIT-SET-ASIDES", 2, 0, false);
        declareFunction("removal_strategy_reconsider_one_split_set_aside", "REMOVAL-STRATEGY-RECONSIDER-ONE-SPLIT-SET-ASIDE", 2, 0, false);
        declareFunction("removal_strategy_possibly_clear_strategic_status", "REMOVAL-STRATEGY-POSSIBLY-CLEAR-STRATEGIC-STATUS", 2, 0, false);
        declareFunction("removal_strategy_reactivate_executable_strategem", "REMOVAL-STRATEGY-REACTIVATE-EXECUTABLE-STRATEGEM", 2, 0, false);
        declareFunction("removal_strategy_strategically_deactivate_strategem", "REMOVAL-STRATEGY-STRATEGICALLY-DEACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("removal_strategy_deactivate_strategem", "REMOVAL-STRATEGY-DEACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("removal_strategy_possibly_deactivate_problem", "REMOVAL-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("removal_strategy_consider_that_problem_could_be_strategically_pending", "REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false);
        declareFunction("removal_strategy_make_problem_pending", "REMOVAL-STRATEGY-MAKE-PROBLEM-PENDING", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_removal_tactician_motivation_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("removal_strategy_with_strategically_active_strategem", "REMOVAL-STRATEGY-WITH-STRATEGICALLY-ACTIVE-STRATEGEM");
            declareFunction("removal_strategy_possibly_propagate_motivation_to_link_head", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
            declareFunction("removal_strategy_propagate_motivation_to_link_head", "REMOVAL-STRATEGY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
            declareFunction("removal_strategy_link_motivates_problemP", "REMOVAL-STRATEGY-LINK-MOTIVATES-PROBLEM?", 2, 1, false);
            declareFunction("removal_strategy_link_motivates_lookahead_problemP", "REMOVAL-STRATEGY-LINK-MOTIVATES-LOOKAHEAD-PROBLEM?", 2, 0, false);
            declareFunction("removal_strategy_possibly_propagate_motivation_to_problem", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
            declareFunction("removal_strategy_possibly_activate_problem", "REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
            declareFunction("removal_strategy_problem_is_the_rest_of_a_removalP", "REMOVAL-STRATEGY-PROBLEM-IS-THE-REST-OF-A-REMOVAL?", 2, 0, false);
            declareFunction("removal_strategy_problem_is_the_rest_of_a_join_orderedP", "REMOVAL-STRATEGY-PROBLEM-IS-THE-REST-OF-A-JOIN-ORDERED?", 2, 0, false);
            declareFunction("removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-PROOF-SPEC-TO-RESTRICTED-NON-FOCALS", 2, 0, false);
            declareFunction("removal_strategy_motivates_problem_via_rewriteP", "REMOVAL-STRATEGY-MOTIVATES-PROBLEM-VIA-REWRITE?", 2, 0, false);
            declareFunction("removal_strategy_chooses_not_to_examine_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
            declareFunction("removal_strategy_chooses_not_to_activate_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
            declareFunction("removal_strategy_activate_problem", "REMOVAL-STRATEGY-ACTIVATE-PROBLEM", 2, 0, false);
            declareFunction("removal_strategy_possibly_activate_strategems", "REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS", 2, 0, false);
            declareFunction("removal_strategy_filter_strategems_by_rlt_tactic_types", "REMOVAL-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES", 2, 0, false);
            declareFunction("removal_strategy_filter_strategems_by_rlt_tactic_types_int", "REMOVAL-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES-INT", 2, 0, false);
            declareFunction("removal_strategy_note_new_tactic", "REMOVAL-STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
            declareFunction("removal_strategy_note_split_tactics_strategically_possible", "REMOVAL-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
            declareFunction("removal_strategy_note_new_tactic_possible", "REMOVAL-STRATEGY-NOTE-NEW-TACTIC-POSSIBLE", 2, 0, false);
            declareFunction("removal_strategy_categorize_strategems", "REMOVAL-STRATEGY-CATEGORIZE-STRATEGEMS", 2, 0, false);
            declareFunction("removal_strategy_categorize_motivation_strategems", "REMOVAL-STRATEGY-CATEGORIZE-MOTIVATION-STRATEGEMS", 4, 0, false);
            declareFunction("removal_strategy_categorize_removal_tactics", "REMOVAL-STRATEGY-CATEGORIZE-REMOVAL-TACTICS", 4, 0, false);
            declareFunction("removal_strategy_categorize_disjunctive_tactics", "REMOVAL-STRATEGY-CATEGORIZE-DISJUNCTIVE-TACTICS", 4, 0, false);
            declareFunction("removal_strategy_categorize_split_tactics", "REMOVAL-STRATEGY-CATEGORIZE-SPLIT-TACTICS", 4, 0, false);
            declareFunction("removal_strategy_categorize_connected_conjunction_tactics", "REMOVAL-STRATEGY-CATEGORIZE-CONNECTED-CONJUNCTION-TACTICS", 4, 0, false);
            declareFunction("removal_strategy_deems_conjunctive_tactic_spec_betterP", "REMOVAL-STRATEGY-DEEMS-CONJUNCTIVE-TACTIC-SPEC-BETTER?", 11, 0, false);
            declareFunction("join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP", "JOIN-ORDERED-TACTIC-THAT-LEADS-TO-A-POTENTIALLY-SIMPLIFYING-LITERAL?", 1, 0, false);
            declareFunction("removal_strategy_commits_to_no_removal_backtrackingP", "REMOVAL-STRATEGY-COMMITS-TO-NO-REMOVAL-BACKTRACKING?", 3, 0, false);
            declareFunction("removal_strategy_logical_tactic_removal_backtracking_cheapP", "REMOVAL-STRATEGY-LOGICAL-TACTIC-REMOVAL-BACKTRACKING-CHEAP?", 2, 0, false);
            declareFunction("removal_strategy_possibly_reconsider_split_set_asides", "REMOVAL-STRATEGY-POSSIBLY-RECONSIDER-SPLIT-SET-ASIDES", 2, 0, false);
            declareFunction("removal_strategy_reconsider_one_split_set_aside", "REMOVAL-STRATEGY-RECONSIDER-ONE-SPLIT-SET-ASIDE", 2, 0, false);
            declareFunction("removal_strategy_possibly_clear_strategic_status", "REMOVAL-STRATEGY-POSSIBLY-CLEAR-STRATEGIC-STATUS", 2, 0, false);
            declareFunction("removal_strategy_reactivate_executable_strategem", "REMOVAL-STRATEGY-REACTIVATE-EXECUTABLE-STRATEGEM", 2, 0, false);
            declareFunction("removal_strategy_strategically_deactivate_strategem", "REMOVAL-STRATEGY-STRATEGICALLY-DEACTIVATE-STRATEGEM", 2, 0, false);
            declareFunction("removal_strategy_deactivate_strategem", "REMOVAL-STRATEGY-DEACTIVATE-STRATEGEM", 2, 0, false);
            declareFunction("removal_strategy_possibly_deactivate_problem", "REMOVAL-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM", 2, 0, false);
            declareFunction("removal_strategy_consider_that_problem_could_be_strategically_pending", "REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false);
            declareFunction("removal_strategy_make_problem_pending", "REMOVAL-STRATEGY-MAKE-PROBLEM-PENDING", 2, 0, false);
            declareFunction("removal_strategy_problem_nothing_to_doP", "REMOVAL-STRATEGY-PROBLEM-NOTHING-TO-DO?", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("merge_removal_and_rl_tactician_strategems", "MERGE-REMOVAL-AND-RL-TACTICIAN-STRATEGEMS", 6, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_removal_tactician_motivation_file_Previous() {
        declareMacro("removal_strategy_with_strategically_active_strategem", "REMOVAL-STRATEGY-WITH-STRATEGICALLY-ACTIVE-STRATEGEM");
        declareFunction("removal_strategy_possibly_propagate_motivation_to_link_head", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
        declareFunction("removal_strategy_propagate_motivation_to_link_head", "REMOVAL-STRATEGY-PROPAGATE-MOTIVATION-TO-LINK-HEAD", 2, 0, false);
        declareFunction("removal_strategy_link_motivates_problemP", "REMOVAL-STRATEGY-LINK-MOTIVATES-PROBLEM?", 2, 1, false);
        declareFunction("removal_strategy_link_motivates_lookahead_problemP", "REMOVAL-STRATEGY-LINK-MOTIVATES-LOOKAHEAD-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_possibly_propagate_motivation_to_problem", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction("removal_strategy_possibly_activate_problem", "REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("removal_strategy_problem_is_the_rest_of_a_removalP", "REMOVAL-STRATEGY-PROBLEM-IS-THE-REST-OF-A-REMOVAL?", 2, 0, false);
        declareFunction("removal_strategy_problem_is_the_rest_of_a_join_orderedP", "REMOVAL-STRATEGY-PROBLEM-IS-THE-REST-OF-A-JOIN-ORDERED?", 2, 0, false);
        declareFunction("removal_strategy_possibly_propagate_proof_spec_to_restricted_non_focals", "REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-PROOF-SPEC-TO-RESTRICTED-NON-FOCALS", 2, 0, false);
        declareFunction("removal_strategy_motivates_problem_via_rewriteP", "REMOVAL-STRATEGY-MOTIVATES-PROBLEM-VIA-REWRITE?", 2, 0, false);
        declareFunction("removal_strategy_chooses_not_to_examine_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_chooses_not_to_activate_problemP", "REMOVAL-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
        declareFunction("removal_strategy_activate_problem", "REMOVAL-STRATEGY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("removal_strategy_possibly_activate_strategems", "REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS", 2, 0, false);
        declareFunction("removal_strategy_filter_strategems_by_rlt_tactic_types", "REMOVAL-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES", 2, 0, false);
        declareFunction("removal_strategy_filter_strategems_by_rlt_tactic_types_int", "REMOVAL-STRATEGY-FILTER-STRATEGEMS-BY-RLT-TACTIC-TYPES-INT", 2, 0, false);
        declareFunction("removal_strategy_note_new_tactic", "REMOVAL-STRATEGY-NOTE-NEW-TACTIC", 2, 0, false);
        declareFunction("removal_strategy_note_split_tactics_strategically_possible", "REMOVAL-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 2, 0, false);
        declareFunction("removal_strategy_note_new_tactic_possible", "REMOVAL-STRATEGY-NOTE-NEW-TACTIC-POSSIBLE", 2, 0, false);
        declareFunction("removal_strategy_categorize_strategems", "REMOVAL-STRATEGY-CATEGORIZE-STRATEGEMS", 2, 0, false);
        declareFunction("removal_strategy_categorize_motivation_strategems", "REMOVAL-STRATEGY-CATEGORIZE-MOTIVATION-STRATEGEMS", 4, 0, false);
        declareFunction("removal_strategy_categorize_removal_tactics", "REMOVAL-STRATEGY-CATEGORIZE-REMOVAL-TACTICS", 4, 0, false);
        declareFunction("removal_strategy_categorize_disjunctive_tactics", "REMOVAL-STRATEGY-CATEGORIZE-DISJUNCTIVE-TACTICS", 4, 0, false);
        declareFunction("removal_strategy_categorize_split_tactics", "REMOVAL-STRATEGY-CATEGORIZE-SPLIT-TACTICS", 4, 0, false);
        declareFunction("removal_strategy_categorize_connected_conjunction_tactics", "REMOVAL-STRATEGY-CATEGORIZE-CONNECTED-CONJUNCTION-TACTICS", 4, 0, false);
        declareFunction("removal_strategy_deems_conjunctive_tactic_spec_betterP", "REMOVAL-STRATEGY-DEEMS-CONJUNCTIVE-TACTIC-SPEC-BETTER?", 11, 0, false);
        declareFunction("join_ordered_tactic_that_leads_to_a_potentially_simplifying_literalP", "JOIN-ORDERED-TACTIC-THAT-LEADS-TO-A-POTENTIALLY-SIMPLIFYING-LITERAL?", 1, 0, false);
        declareFunction("removal_strategy_commits_to_no_removal_backtrackingP", "REMOVAL-STRATEGY-COMMITS-TO-NO-REMOVAL-BACKTRACKING?", 3, 0, false);
        declareFunction("removal_strategy_logical_tactic_removal_backtracking_cheapP", "REMOVAL-STRATEGY-LOGICAL-TACTIC-REMOVAL-BACKTRACKING-CHEAP?", 2, 0, false);
        declareFunction("removal_strategy_possibly_reconsider_split_set_asides", "REMOVAL-STRATEGY-POSSIBLY-RECONSIDER-SPLIT-SET-ASIDES", 2, 0, false);
        declareFunction("removal_strategy_reconsider_one_split_set_aside", "REMOVAL-STRATEGY-RECONSIDER-ONE-SPLIT-SET-ASIDE", 2, 0, false);
        declareFunction("removal_strategy_possibly_clear_strategic_status", "REMOVAL-STRATEGY-POSSIBLY-CLEAR-STRATEGIC-STATUS", 2, 0, false);
        declareFunction("removal_strategy_reactivate_executable_strategem", "REMOVAL-STRATEGY-REACTIVATE-EXECUTABLE-STRATEGEM", 2, 0, false);
        declareFunction("removal_strategy_strategically_deactivate_strategem", "REMOVAL-STRATEGY-STRATEGICALLY-DEACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("removal_strategy_deactivate_strategem", "REMOVAL-STRATEGY-DEACTIVATE-STRATEGEM", 2, 0, false);
        declareFunction("removal_strategy_possibly_deactivate_problem", "REMOVAL-STRATEGY-POSSIBLY-DEACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("removal_strategy_consider_that_problem_could_be_strategically_pending", "REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 2, 0, false);
        declareFunction("removal_strategy_make_problem_pending", "REMOVAL-STRATEGY-MAKE-PROBLEM-PENDING", 2, 0, false);
        declareFunction("removal_strategy_problem_nothing_to_doP", "REMOVAL-STRATEGY-PROBLEM-NOTHING-TO-DO?", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_removal_tactician_motivation_file_alt() {
        defparameter("*REMOVAL-STRATEGY-RL-TACTICIAN-TACTIC-TYPES*", $list_alt15);
        return NIL;
    }

    public static SubLObject init_removal_tactician_motivation_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*REMOVAL-STRATEGY-RL-TACTICIAN-TACTIC-TYPES*", $list14);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*REMOVAL-STRATEGY-RL-TACTICIAN-TACTIC-TYPES*", $list_alt15);
        }
        return NIL;
    }

    public static SubLObject init_removal_tactician_motivation_file_Previous() {
        defparameter("*REMOVAL-STRATEGY-RL-TACTICIAN-TACTIC-TYPES*", $list14);
        return NIL;
    }

    public static final SubLObject setup_removal_tactician_motivation_file_alt() {
        note_funcall_helper_function(REMOVAL_STRATEGY_NOTE_NEW_TACTIC);
        note_funcall_helper_function(REMOVAL_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE);
        note_funcall_helper_function($sym37$REMOVAL_STRATEGY_CONSIDER_THAT_PROBLEM_COULD_BE_STRATEGICALLY_PEN);
        return NIL;
    }

    public static SubLObject setup_removal_tactician_motivation_file() {
        if (SubLFiles.USE_V1) {
            note_funcall_helper_function(REMOVAL_STRATEGY_NOTE_NEW_TACTIC);
            note_funcall_helper_function(REMOVAL_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE);
            note_funcall_helper_function($sym36$REMOVAL_STRATEGY_CONSIDER_THAT_PROBLEM_COULD_BE_STRATEGICALLY_PEN);
            note_funcall_helper_function($sym37$REMOVAL_STRATEGY_PROBLEM_NOTHING_TO_DO_);
        }
        if (SubLFiles.USE_V2) {
            note_funcall_helper_function($sym37$REMOVAL_STRATEGY_CONSIDER_THAT_PROBLEM_COULD_BE_STRATEGICALLY_PEN);
        }
        return NIL;
    }

    public static SubLObject setup_removal_tactician_motivation_file_Previous() {
        note_funcall_helper_function(REMOVAL_STRATEGY_NOTE_NEW_TACTIC);
        note_funcall_helper_function(REMOVAL_STRATEGY_NOTE_SPLIT_TACTICS_STRATEGICALLY_POSSIBLE);
        note_funcall_helper_function($sym36$REMOVAL_STRATEGY_CONSIDER_THAT_PROBLEM_COULD_BE_STRATEGICALLY_PEN);
        note_funcall_helper_function($sym37$REMOVAL_STRATEGY_PROBLEM_NOTHING_TO_DO_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_tactician_motivation_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_tactician_motivation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_tactician_motivation_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("STRATEGY"), makeSymbol("STRATEGEM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt15 = list(makeKeyword("GENERALIZED-REMOVAL"), makeKeyword("CONNECTED-CONJUNCTION"), makeKeyword("SPLIT"), makeKeyword("UNION"));

    static private final SubLSymbol $sym17$LOGICAL_TACTIC_BETTER_WRT_REMOVAL_ = makeSymbol("LOGICAL-TACTIC-BETTER-WRT-REMOVAL?");

    static private final SubLSymbol $sym25$TACTIC_STRATEGIC_PRODUCTIVITY__ = makeSymbol("TACTIC-STRATEGIC-PRODUCTIVITY-<");

    static private final SubLSymbol $sym37$REMOVAL_STRATEGY_CONSIDER_THAT_PROBLEM_COULD_BE_STRATEGICALLY_PEN = makeSymbol("REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING");
}

/**
 * Total time: 195 ms
 */
