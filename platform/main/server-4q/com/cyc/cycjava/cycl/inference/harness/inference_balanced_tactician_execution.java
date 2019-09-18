/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      INFERENCE-BALANCED-TACTICIAN-EXECUTION
 *  source file: /cyc/top/cycl/inference/harness/inference-balanced-tactician-execution.lisp
 *  created:     2019/07/03 17:37:41
 */
public final class inference_balanced_tactician_execution extends SubLTranslatedFile implements V02 {
    // // Constructor
    private inference_balanced_tactician_execution() {
    }

    public static final SubLFile me = new inference_balanced_tactician_execution();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_balanced_tactician_execution";

    // // Definitions
    public static final SubLObject balanced_strategy_doneP(SubLObject strategy) {
        return makeBoolean((((NIL != inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_removalP(strategy)) && (NIL != inference_balanced_tactician_datastructures.balanced_strategy_no_new_rootsP(strategy))) && (NIL != inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_transformationP(strategy))) && (NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)));
    }

    public static final class $balanced_strategy_doneP$UnaryFunction extends UnaryFunction {
        public $balanced_strategy_doneP$UnaryFunction() {
            super(extractFunctionNamed("BALANCED-STRATEGY-DONE?"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return balanced_strategy_doneP(arg1);
        }
    }

    public static final SubLObject balanced_strategy_do_one_step(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = $UNINTERESTING;
                while ($UNINTERESTING == result) {
                    result = balanced_strategy_do_one_step_int(strategy);
                } 
                if (NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
                    if ($DONE == result) {
                        if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_transformationP(strategy)) {
                            Errors.cerror($str_alt2$_s_says_it_s_done__but_its_T_box_, strategy);
                        }
                        if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_removalP(strategy)) {
                            Errors.cerror($str_alt3$_s_says_it_s_done__but_its_R_box_, strategy);
                        }
                    }
                }
                return eq($DONE, result);
            }
        }
    }

    public static final class $balanced_strategy_do_one_step$UnaryFunction extends UnaryFunction {
        public $balanced_strategy_do_one_step$UnaryFunction() {
            super(extractFunctionNamed("BALANCED-STRATEGY-DO-ONE-STEP"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return balanced_strategy_do_one_step(arg1);
        }
    }

    /**
     *
     *
     * @return one of (:done :interesting, :uninteresting)
     */
    public static final SubLObject balanced_strategy_do_one_step_int(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(strategy)) {
                    inference_balanced_tactician_strategic_uninterestingness.balanced_strategy_reconsider_set_asides(strategy);
                    result = $UNINTERESTING;
                } else
                    if (NIL != inference_tactician.strategy_doneP(strategy)) {
                        result = $DONE;
                    } else {
                        thread.resetMultipleValues();
                        {
                            SubLObject strategem = balanced_strategy_select_best_strategem(strategy);
                            SubLObject motivation = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != strategem) {
                                result = balanced_strategy_execute_strategem(strategy, strategem, motivation);
                            } else {
                                result = $DONE;
                            }
                        }
                    }

                return result;
            }
        }
    }

    /**
     *
     *
     * @return 0 strategem-p
     * @return 1 nil or balanced-strategy-motivation-p
    remove from boxes during selection if necessary. (quiescence)
     * @unknown don't assume you're only looking at possible tactics, because of reuse (use case #2).
     */
    public static final SubLObject balanced_strategy_select_best_strategem(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SELECT_BEST_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject balanced_strategy_default_select_best_strategem(SubLObject strategy) {
        balanced_strategy_possibly_prune_current_new_root_wrt_removal(strategy);
        balanced_strategy_quiesce_wrt_removal(strategy);
        if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_removalP(strategy)) {
            return values(inference_balanced_tactician_datastructures.balanced_strategy_pop_strategem_wrt_removal(strategy), $REMOVAL);
        }
        balanced_strategy_quiesce_new_root(strategy);
        if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_new_rootsP(strategy)) {
            {
                SubLObject new_root = inference_balanced_tactician_datastructures.balanced_strategy_pop_new_root(strategy);
                SubLObject motivation = balanced_strategy_new_root_next_motivation(strategy, new_root);
                return values(new_root, motivation);
            }
        }
        balanced_strategy_quiesce_wrt_transformation(strategy);
        if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_transformationP(strategy)) {
            return values(inference_balanced_tactician_datastructures.balanced_strategy_pop_strategem_wrt_transformation(strategy), $TRANSFORMATION);
        }
        if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
            return values(inference_datastructures_strategy.strategy_answer_link(strategy), $NEW_ROOT);
        }
        return values(NIL, NIL);
    }

    public static final class $balanced_strategy_default_select_best_strategem$UnaryFunction extends UnaryFunction {
        public $balanced_strategy_default_select_best_strategem$UnaryFunction() {
            super(extractFunctionNamed("BALANCED-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return balanced_strategy_default_select_best_strategem(arg1);
        }
    }

    public static final SubLObject balanced_strategy_new_root_next_motivation(SubLObject strategy, SubLObject new_root) {
        if ((NIL != inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_strategy.strategy_problem_store(strategy))) && (NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_removalP(strategy, new_root))) {
            return $REMOVAL;
        } else
            if (NIL != inference_tactician.strategy_throws_away_all_transformationP(strategy)) {
                return NIL;
            } else
                if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_problem_motivated_wrt_transformationP(strategy, new_root)) {
                    return $TRANSFORMATION;
                } else {
                    return NIL;
                }


    }

    public static final SubLObject balanced_strategy_quiesce(SubLObject strategy) {
        SubLSystemTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
        balanced_strategy_quiesce_wrt_removal(strategy);
        balanced_strategy_quiesce_new_root(strategy);
        balanced_strategy_quiesce_wrt_transformation(strategy);
        return strategy;
    }

    /**
     *
     *
     * @return nil or strategem-p
     */
    public static final SubLObject balanced_strategy_quiesce_wrt_removal(SubLObject strategy) {
        while (true) {
            {
                SubLObject candidate_strategem = inference_balanced_tactician_datastructures.balanced_strategy_peek_strategem_wrt_removal(strategy);
                if (NIL == candidate_strategem) {
                    return NIL;
                }
                {
                    SubLObject reason = inference_balanced_tactician_strategic_uninterestingness.why_balanced_strategy_chooses_to_ignore_strategem(strategy, candidate_strategem, $REMOVAL);
                    if (NIL == reason) {
                        return candidate_strategem;
                    }
                    {
                        SubLObject pcase_var = reason;
                        if (pcase_var.eql($SET_ASIDE)) {
                            inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_set_aside_wrt_removal(strategy, candidate_strategem);
                        } else
                            if (pcase_var.eql($THROW_AWAY)) {
                                inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_thrown_away_wrt_removal(strategy, candidate_strategem);
                            }

                    }
                    inference_balanced_tactician_datastructures.balanced_strategy_pop_strategem_wrt_removal(strategy);
                    inference_balanced_tactician_motivation.balanced_strategy_strategically_deactivate_strategem(strategy, candidate_strategem, $REMOVAL);
                    inference_worker.consider_pruning_ramifications_of_ignored_strategem(strategy, candidate_strategem);
                }
            }
        } 
    }

    /**
     *
     *
     * @return nil or strategem-p
     */
    public static final SubLObject balanced_strategy_quiesce_new_root(SubLObject strategy) {
        while (true) {
            {
                SubLObject candidate_new_root = inference_balanced_tactician_datastructures.balanced_strategy_peek_new_root(strategy);
                if (NIL == candidate_new_root) {
                    return NIL;
                }
                {
                    SubLObject reason = inference_balanced_tactician_strategic_uninterestingness.why_balanced_strategy_chooses_to_ignore_new_root(strategy, candidate_new_root);
                    if (NIL == reason) {
                        return candidate_new_root;
                    }
                    inference_balanced_tactician_datastructures.balanced_strategy_pop_new_root(strategy);
                }
            }
        } 
    }

    /**
     *
     *
     * @return nil or strategem-p
     */
    public static final SubLObject balanced_strategy_quiesce_wrt_transformation(SubLObject strategy) {
        while (true) {
            {
                SubLObject candidate_strategem = inference_balanced_tactician_datastructures.balanced_strategy_peek_strategem_wrt_transformation(strategy);
                if (NIL == candidate_strategem) {
                    return NIL;
                }
                {
                    SubLObject reason = inference_balanced_tactician_strategic_uninterestingness.why_balanced_strategy_chooses_to_ignore_strategem(strategy, candidate_strategem, $TRANSFORMATION);
                    if (NIL == reason) {
                        return candidate_strategem;
                    }
                    {
                        SubLObject pcase_var = reason;
                        if (pcase_var.eql($SET_ASIDE)) {
                            inference_balanced_tactician_datastructures.balanced_strategy_note_strategem_set_aside_wrt_transformation(strategy, candidate_strategem);
                        } else
                            if (pcase_var.eql($THROW_AWAY)) {
                            }

                    }
                    inference_balanced_tactician_datastructures.balanced_strategy_pop_strategem_wrt_transformation(strategy);
                    inference_balanced_tactician_motivation.balanced_strategy_strategically_deactivate_strategem(strategy, candidate_strategem, $TRANSFORMATION);
                }
            }
        } 
    }

    // defparameter
    private static final SubLSymbol $balanced_strategy_does_not_activate_disallowed_tactics_wrt_removalP$ = makeSymbol("*BALANCED-STRATEGY-DOES-NOT-ACTIVATE-DISALLOWED-TACTICS-WRT-REMOVAL?*");

    /**
     *
     *
     * @return one of (:interesting, :uninteresting)
     */
    public static final SubLObject balanced_strategy_execute_strategem(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
        if (motivation == UNPROVIDED) {
            motivation = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(strategy, BALANCED_STRATEGY_P);
            SubLSystemTrampolineFile.checkType(strategem, STRATEGEM_P);
            if (NIL != motivation) {
                SubLSystemTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
            }
            {
                SubLObject result = $UNINTERESTING;
                if (NIL != inference_tactician.executable_strategem_p(strategem)) {
                    {
                        SubLObject tactic = strategem;
                        SubLObject strategem_var = tactic;
                        SubLObject problem = inference_tactician.strategem_problem(strategem_var);
                        inference_balanced_tactician_motivation.balanced_strategy_deactivate_strategem(strategy, strategem_var, motivation);
                        balanced_strategy_execute_tactic(strategy, tactic);
                        inference_balanced_tactician_motivation.balanced_strategy_possibly_deactivate_problem(strategy, problem);
                        result = $INTERESTING;
                    }
                } else
                    if (NIL != inference_worker.logical_tactic_p(strategem)) {
                        {
                            SubLObject tactic = strategem;
                            SubLSystemTrampolineFile.checkType(motivation, BALANCED_STRATEGY_MOTIVATION_P);
                            if (!(((NIL != $balanced_strategy_does_not_activate_disallowed_tactics_wrt_removalP$.getDynamicValue(thread)) && (motivation == $REMOVAL)) && (NIL != inference_tactician_strategic_uninterestingness.tactic_disallowedP(strategem, strategy)))) {
                                inference_balanced_tactician_motivation.balanced_strategy_possibly_propagate_motivation_to_link_head(strategy, motivation, tactic);
                                {
                                    SubLObject strategem_var = tactic;
                                    SubLObject problem = inference_tactician.strategem_problem(strategem_var);
                                    inference_balanced_tactician_motivation.balanced_strategy_deactivate_strategem(strategy, strategem_var, motivation);
                                    inference_tactician.strategy_possibly_execute_tactic(strategy, tactic);
                                    inference_balanced_tactician_motivation.balanced_strategy_possibly_deactivate_problem(strategy, problem);
                                }
                                result = $INTERESTING;
                            }
                        }
                    } else
                        if (NIL != inference_worker_transformation.transformation_link_p(strategem)) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if ($TRANSFORMATION != motivation) {
                                    Errors.error($str_alt14$We_expect_to_only_propagate_T_to_, motivation);
                                }
                            }
                            {
                                SubLObject transformation_link = strategem;
                                inference_balanced_tactician_motivation.balanced_strategy_possibly_propagate_motivation_to_link_head(strategy, motivation, transformation_link);
                                inference_balanced_tactician_motivation.balanced_strategy_strategically_deactivate_strategem(strategy, transformation_link, motivation);
                                result = $INTERESTING;
                            }
                        } else
                            if (NIL != inference_datastructures_problem.problem_p(strategem)) {
                                {
                                    SubLObject problem = strategem;
                                    balanced_strategy_handle_new_root(strategy, problem, motivation);
                                    result = $INTERESTING;
                                }
                            } else
                                if (NIL != inference_worker_answer.answer_link_p(strategem)) {
                                    {
                                        SubLObject answer_link = strategem;
                                        SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
                                        inference_balanced_tactician_motivation.balanced_strategy_possibly_propagate_motivation_to_problem(strategy, $NEW_ROOT, root_problem);
                                        inference_worker.possibly_propagate_answer_link(answer_link);
                                        result = $INTERESTING;
                                    }
                                } else {
                                    return Errors.error($str_alt15$_S_was_an_unexpected_strategem, strategem);
                                }




                return result;
            }
        }
    }

    /**
     * If this is NIL, removal tactics will always be executed exhaustively before moving on to other tactics.
     * Useful for experimentation, very bad for time to first answer.
     */
    // defparameter
    public static final SubLSymbol $balanced_strategy_removal_tactic_iterativity_enabledP$ = makeSymbol("*BALANCED-STRATEGY-REMOVAL-TACTIC-ITERATIVITY-ENABLED?*");

    public static final SubLObject balanced_strategy_execute_tactic(SubLObject strategy, SubLObject tactic) {
        if (NIL != inference_worker.content_tactic_p(tactic)) {
            return balanced_strategy_execute_content_tactic(strategy, tactic);
        } else {
            return balanced_strategy_execute_meta_structural_tactic(strategy, tactic);
        }
    }

    public static final SubLObject balanced_strategy_execute_content_tactic(SubLObject strategy, SubLObject content_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == $balanced_strategy_removal_tactic_iterativity_enabledP$.getDynamicValue(thread)) && (NIL != inference_worker_removal.removal_tactic_p(content_tactic))) {
                inference_tactician.strategy_execute_tactic(strategy, content_tactic);
                if (NIL != inference_datastructures_tactic.tactic_in_progressP(content_tactic)) {
                    inference_balanced_tactician_motivation.balanced_strategy_reactivate_executable_strategem(strategy, content_tactic);
                }
            } else {
                balanced_strategy_execute_executable_strategem(strategy, content_tactic);
            }
            return strategy;
        }
    }

    public static final SubLObject balanced_strategy_execute_meta_structural_tactic(SubLObject strategy, SubLObject meta_structural_tactic) {
        return balanced_strategy_execute_executable_strategem(strategy, meta_structural_tactic);
    }

    public static final SubLObject balanced_strategy_execute_executable_strategem(SubLObject strategy, SubLObject strategem) {
        {
            SubLObject already_in_progressP = inference_datastructures_tactic.tactic_in_progressP(strategem);
            if (NIL != already_in_progressP) {
                inference_balanced_tactician_motivation.balanced_strategy_reactivate_executable_strategem(strategy, strategem);
            }
            inference_tactician.strategy_execute_tactic(strategy, strategem);
            if ((NIL == already_in_progressP) && (NIL != inference_datastructures_tactic.tactic_in_progressP(strategem))) {
                inference_balanced_tactician_motivation.balanced_strategy_reactivate_executable_strategem(strategy, strategem);
            }
        }
        return strategem;
    }

    public static final SubLObject balanced_strategy_handle_new_root(SubLObject strategy, SubLObject new_root, SubLObject motivation) {
        {
            SubLObject pcase_var = motivation;
            if (pcase_var.eql($REMOVAL)) {
                {
                    SubLObject result = NIL;
                    result = inference_balanced_tactician_motivation.balanced_strategy_possibly_propagate_motivation_to_problem(strategy, $REMOVAL, new_root);
                    inference_balanced_tactician_datastructures.balanced_strategy_note_new_root_activated_wrt_removal(strategy, new_root);
                    inference_balanced_tactician_datastructures.balanced_strategy_add_new_root(strategy, new_root);
                    return result;
                }
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    {
                        SubLObject result = NIL;
                        result = inference_balanced_tactician_motivation.balanced_strategy_possibly_propagate_motivation_to_problem(strategy, $TRANSFORMATION, new_root);
                        inference_balanced_tactician_datastructures.balanced_strategy_add_new_root(strategy, new_root);
                        return result;
                    }
                } else {
                    return Errors.error($str_alt16$unexpected_motivation__s, motivation);
                }

        }
    }

    // defvar
    public static final SubLSymbol $balanced_strategy_prune_current_new_root_wrt_removal_timeout$ = makeSymbol("*BALANCED-STRATEGY-PRUNE-CURRENT-NEW-ROOT-WRT-REMOVAL-TIMEOUT*");

    public static final SubLObject balanced_strategy_possibly_prune_current_new_root_wrt_removal(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (NIL != $balanced_strategy_prune_current_new_root_wrt_removal_timeout$.getDynamicValue(thread)) {
                    if (NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_transformationP(strategy)) {
                        {
                            SubLObject new_root = inference_balanced_tactician_datastructures.balanced_strategy_current_new_root_wrt_removal(strategy);
                            if (NIL != new_root) {
                                if (NIL == inference_worker.good_problem_p(new_root, strategy)) {
                                    {
                                        SubLObject elapsed_time = inference_balanced_tactician_datastructures.balanced_strategy_current_new_root_wrt_removal_elapsed_time(strategy);
                                        if (elapsed_time.numGE($balanced_strategy_prune_current_new_root_wrt_removal_timeout$.getDynamicValue(thread))) {
                                            result = balanced_strategy_flush_wrt_removal(strategy);
                                            inference_balanced_tactician_datastructures.balanced_strategy_clear_current_new_root_wrt_removal(strategy);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject balanced_strategy_flush_wrt_removal(SubLObject strategy) {
        {
            SubLObject total = ZERO_INTEGER;
            while (NIL == inference_balanced_tactician_datastructures.balanced_strategy_no_strategems_active_wrt_removalP(strategy)) {
                inference_balanced_tactician_datastructures.balanced_strategy_pop_strategem_wrt_removal(strategy);
                total = add(total, ONE_INTEGER);
            } 
            return total;
        }
    }

    public static final SubLObject declare_inference_balanced_tactician_execution_file() {
        declareFunction("balanced_strategy_doneP", "BALANCED-STRATEGY-DONE?", 1, 0, false);
        new $balanced_strategy_doneP$UnaryFunction();
        declareFunction("balanced_strategy_do_one_step", "BALANCED-STRATEGY-DO-ONE-STEP", 1, 0, false);
        new $balanced_strategy_do_one_step$UnaryFunction();
        declareFunction("balanced_strategy_do_one_step_int", "BALANCED-STRATEGY-DO-ONE-STEP-INT", 1, 0, false);
        declareFunction("balanced_strategy_select_best_strategem", "BALANCED-STRATEGY-SELECT-BEST-STRATEGEM", 1, 0, false);
        declareFunction("balanced_strategy_default_select_best_strategem", "BALANCED-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM", 1, 0, false);
        new $balanced_strategy_default_select_best_strategem$UnaryFunction();
        declareFunction("balanced_strategy_new_root_next_motivation", "BALANCED-STRATEGY-NEW-ROOT-NEXT-MOTIVATION", 2, 0, false);
        declareFunction("balanced_strategy_quiesce", "BALANCED-STRATEGY-QUIESCE", 1, 0, false);
        declareFunction("balanced_strategy_quiesce_wrt_removal", "BALANCED-STRATEGY-QUIESCE-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_quiesce_new_root", "BALANCED-STRATEGY-QUIESCE-NEW-ROOT", 1, 0, false);
        declareFunction("balanced_strategy_quiesce_wrt_transformation", "BALANCED-STRATEGY-QUIESCE-WRT-TRANSFORMATION", 1, 0, false);
        declareFunction("balanced_strategy_execute_strategem", "BALANCED-STRATEGY-EXECUTE-STRATEGEM", 2, 1, false);
        declareFunction("balanced_strategy_execute_tactic", "BALANCED-STRATEGY-EXECUTE-TACTIC", 2, 0, false);
        declareFunction("balanced_strategy_execute_content_tactic", "BALANCED-STRATEGY-EXECUTE-CONTENT-TACTIC", 2, 0, false);
        declareFunction("balanced_strategy_execute_meta_structural_tactic", "BALANCED-STRATEGY-EXECUTE-META-STRUCTURAL-TACTIC", 2, 0, false);
        declareFunction("balanced_strategy_execute_executable_strategem", "BALANCED-STRATEGY-EXECUTE-EXECUTABLE-STRATEGEM", 2, 0, false);
        declareFunction("balanced_strategy_handle_new_root", "BALANCED-STRATEGY-HANDLE-NEW-ROOT", 3, 0, false);
        declareFunction("balanced_strategy_possibly_prune_current_new_root_wrt_removal", "BALANCED-STRATEGY-POSSIBLY-PRUNE-CURRENT-NEW-ROOT-WRT-REMOVAL", 1, 0, false);
        declareFunction("balanced_strategy_flush_wrt_removal", "BALANCED-STRATEGY-FLUSH-WRT-REMOVAL", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_inference_balanced_tactician_execution_file() {
        defparameter("*BALANCED-STRATEGY-DOES-NOT-ACTIVATE-DISALLOWED-TACTICS-WRT-REMOVAL?*", T);
        defparameter("*BALANCED-STRATEGY-REMOVAL-TACTIC-ITERATIVITY-ENABLED?*", T);
        defvar("*BALANCED-STRATEGY-PRUNE-CURRENT-NEW-ROOT-WRT-REMOVAL-TIMEOUT*", NIL);
        return NIL;
    }

    public static final SubLObject setup_inference_balanced_tactician_execution_file() {
                return NIL;
    }





    static private final SubLString $str_alt2$_s_says_it_s_done__but_its_T_box_ = makeString("~s says it's done, but its T-box is nonempty");

    static private final SubLString $str_alt3$_s_says_it_s_done__but_its_R_box_ = makeString("~s says it's done, but its R-box is nonempty");

    private static final SubLSymbol $SELECT_BEST_STRATEGEM = makeKeyword("SELECT-BEST-STRATEGEM");







    private static final SubLSymbol BALANCED_STRATEGY_P = makeSymbol("BALANCED-STRATEGY-P");







    private static final SubLSymbol BALANCED_STRATEGY_MOTIVATION_P = makeSymbol("BALANCED-STRATEGY-MOTIVATION-P");



    static private final SubLString $str_alt14$We_expect_to_only_propagate_T_to_ = makeString("We expect to only propagate T to transformation links, not ~S");

    static private final SubLString $str_alt15$_S_was_an_unexpected_strategem = makeString("~S was an unexpected strategem");

    static private final SubLString $str_alt16$unexpected_motivation__s = makeString("unexpected motivation ~s");

    // // Initializers
    public void declareFunctions() {
        declare_inference_balanced_tactician_execution_file();
    }

    public void initializeVariables() {
        init_inference_balanced_tactician_execution_file();
    }

    public void runTopLevelForms() {
        setup_inference_balanced_tactician_execution_file();
    }
}

