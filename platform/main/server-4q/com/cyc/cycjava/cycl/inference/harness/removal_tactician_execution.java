/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-TACTICIAN-EXECUTION
 * source file: /cyc/top/cycl/inference/harness/removal-tactician-execution.lisp
 * created:     2019/07/03 17:37:41
 */
public final class removal_tactician_execution extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_tactician_execution();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.removal_tactician_execution";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $removal_strategy_does_not_activate_disallowed_tacticsP$ = makeSymbol("*REMOVAL-STRATEGY-DOES-NOT-ACTIVATE-DISALLOWED-TACTICS?*");

    // defparameter
    /**
     * If this is NIL, removal tactics will always be executed exhaustively before
     * moving on to other tactics. Useful for experimentation, very bad for time to
     * first answer.
     */
    @LispMethod(comment = "If this is NIL, removal tactics will always be executed exhaustively before\r\nmoving on to other tactics. Useful for experimentation, very bad for time to\r\nfirst answer.\ndefparameter\nIf this is NIL, removal tactics will always be executed exhaustively before\nmoving on to other tactics. Useful for experimentation, very bad for time to\nfirst answer.")
    public static final SubLSymbol $removal_strategy_removal_tactic_iterativity_enabledP$ = makeSymbol("*REMOVAL-STRATEGY-REMOVAL-TACTIC-ITERATIVITY-ENABLED?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$REMOVAL_STRATEGY_DONE_ = makeSymbol("REMOVAL-STRATEGY-DONE?");

    static private final SubLString $str3$_s_says_it_s_done__but_its_R_box_ = makeString("~s says it's done, but its R-box is nonempty");

    private static final SubLSymbol REMOVAL_STRATEGY_DO_ONE_STEP = makeSymbol("REMOVAL-STRATEGY-DO-ONE-STEP");

    private static final SubLSymbol $SELECT_BEST_STRATEGEM = makeKeyword("SELECT-BEST-STRATEGEM");

    private static final SubLSymbol REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");

    static private final SubLString $str11$removal_tactician_does_not_handle = makeString("removal tactician does not handle transformation link ~a");

    static private final SubLString $str12$_S_was_an_unexpected_strategem = makeString("~S was an unexpected strategem");

    // Definitions
    public static final SubLObject removal_strategy_doneP_alt(SubLObject strategy) {
        return makeBoolean((NIL != removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy)) && (NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)));
    }

    // Definitions
    public static SubLObject removal_strategy_doneP(final SubLObject strategy) {
        return makeBoolean((NIL != removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy)) && (NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)));
    }

    public static final SubLObject removal_strategy_do_one_step_alt(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = $UNINTERESTING;
                while ($UNINTERESTING == result) {
                    result = com.cyc.cycjava.cycl.inference.harness.removal_tactician_execution.removal_strategy_do_one_step_int(strategy);
                } 
                if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                    if ($DONE == result) {
                        if (NIL == removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy)) {
                            Errors.cerror($str_alt3$_s_says_it_s_done__but_its_R_box_, strategy);
                        }
                    }
                }
                return eq($DONE, result);
            }
        }
    }

    public static SubLObject removal_strategy_do_one_step(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result;
        for (result = $UNINTERESTING; $UNINTERESTING == result; result = removal_strategy_do_one_step_int(strategy)) {
        }
        if (((NIL != $inference_debugP$.getDynamicValue(thread)) && ($DONE == result)) && (NIL == removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy))) {
            Errors.cerror($str3$_s_says_it_s_done__but_its_R_box_, strategy);
        }
        return eq($DONE, result);
    }

    /**
     *
     *
     * @return one of (:done :interesting, :uninteresting)
     */
    @LispMethod(comment = "@return one of (:done :interesting, :uninteresting)")
    public static final SubLObject removal_strategy_do_one_step_int_alt(SubLObject strategy) {
        {
            SubLObject result = NIL;
            if (NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(strategy)) {
                inference_tactician.strategy_reconsider_set_asides(strategy);
                result = $UNINTERESTING;
            } else {
                if (NIL != inference_tactician.strategy_doneP(strategy)) {
                    result = $DONE;
                } else {
                    {
                        SubLObject strategem = com.cyc.cycjava.cycl.inference.harness.removal_tactician_execution.removal_strategy_select_best_strategem(strategy);
                        if (NIL != strategem) {
                            if (NIL != inference_datastructures_tactic.invalid_tactic_p(strategem)) {
                                result = $UNINTERESTING;
                            } else {
                                result = com.cyc.cycjava.cycl.inference.harness.removal_tactician_execution.removal_strategy_execute_strategem(strategy, strategem);
                            }
                        } else {
                            result = $DONE;
                        }
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @return one of (:done :interesting, :uninteresting)
     */
    @LispMethod(comment = "@return one of (:done :interesting, :uninteresting)")
    public static SubLObject removal_strategy_do_one_step_int(final SubLObject strategy) {
        SubLObject result = NIL;
        if (NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(strategy)) {
            inference_tactician.strategy_reconsider_set_asides(strategy);
            result = $UNINTERESTING;
        } else
            if (NIL != inference_tactician.strategy_doneP(strategy)) {
                result = $DONE;
            } else {
                final SubLObject strategem = removal_strategy_select_best_strategem(strategy);
                if (NIL != strategem) {
                    if (NIL != inference_datastructures_tactic.invalid_tactic_p(strategem)) {
                        result = $UNINTERESTING;
                    } else {
                        result = inference_tactician.strategy_execute_strategem(strategy, strategem);
                    }
                } else {
                    result = $DONE;
                }
            }

        return result;
    }

    /**
     *
     *
     * @return strategem-p
    remove from boxes during selection if necessary. (quiescence)
     * @unknown don't assume you're only looking at possible tactics, because of reuse (use case #2).
     */
    @LispMethod(comment = "@return strategem-p\r\nremove from boxes during selection if necessary. (quiescence)\r\n@unknown don\'t assume you\'re only looking at possible tactics, because of reuse (use case #2).")
    public static final SubLObject removal_strategy_select_best_strategem_alt(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SELECT_BEST_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return strategem-p
    remove from boxes during selection if necessary. (quiescence)
     * @unknown don't assume you're only looking at possible tactics, because of reuse (use case #2).
     */
    @LispMethod(comment = "@return strategem-p\r\nremove from boxes during selection if necessary. (quiescence)\r\n@unknown don\'t assume you\'re only looking at possible tactics, because of reuse (use case #2).")
    public static SubLObject removal_strategy_select_best_strategem(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SELECT_BEST_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject removal_strategy_default_select_best_strategem_alt(SubLObject strategy) {
        com.cyc.cycjava.cycl.inference.harness.removal_tactician_execution.removal_strategy_quiesce(strategy);
        if (NIL == removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy)) {
            return removal_tactician_datastructures.removal_strategy_pop_strategem(strategy);
        }
        if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
            return inference_datastructures_strategy.strategy_answer_link(strategy);
        }
        return NIL;
    }

    public static SubLObject removal_strategy_default_select_best_strategem(final SubLObject strategy) {
        removal_strategy_quiesce(strategy);
        if (NIL == removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy)) {
            return removal_tactician_datastructures.removal_strategy_pop_strategem(strategy);
        }
        if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
            return inference_datastructures_strategy.strategy_answer_link(strategy);
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil or strategem-p
     */
    @LispMethod(comment = "@return nil or strategem-p")
    public static final SubLObject removal_strategy_quiesce_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, REMOVAL_STRATEGY_P);
        while (true) {
            {
                SubLObject candidate_strategem = removal_tactician_datastructures.removal_strategy_peek_strategem(strategy);
                if (NIL == candidate_strategem) {
                    return NIL;
                }
                {
                    SubLObject reason = removal_tactician_uninterestingness.why_removal_strategy_chooses_to_ignore_strategem(strategy, candidate_strategem);
                    if (NIL == reason) {
                        return candidate_strategem;
                    }
                    {
                        SubLObject pcase_var = reason;
                        if (pcase_var.eql($SET_ASIDE)) {
                            removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, candidate_strategem);
                        } else {
                            if (pcase_var.eql($THROW_AWAY)) {
                                removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, candidate_strategem);
                            }
                        }
                    }
                    removal_tactician_datastructures.removal_strategy_pop_strategem(strategy);
                    removal_tactician_motivation.removal_strategy_strategically_deactivate_strategem(strategy, candidate_strategem);
                }
            }
        } 
    }

    /**
     *
     *
     * @return nil or strategem-p
     */
    @LispMethod(comment = "@return nil or strategem-p")
    public static SubLObject removal_strategy_quiesce(final SubLObject strategy) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : "! removal_tactician.removal_strategy_p(strategy) " + ("removal_tactician.removal_strategy_p(strategy) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(strategy) ") + strategy;
        while (true) {
            final SubLObject candidate_strategem = removal_tactician_datastructures.removal_strategy_peek_strategem(strategy);
            if (NIL == candidate_strategem) {
                return NIL;
            }
            final SubLObject reason = removal_tactician_uninterestingness.why_removal_strategy_chooses_to_ignore_strategem(strategy, candidate_strategem);
            if (NIL == reason) {
                return candidate_strategem;
            }
            final SubLObject pcase_var = reason;
            if (pcase_var.eql($SET_ASIDE)) {
                removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, candidate_strategem);
            } else
                if (pcase_var.eql($THROW_AWAY)) {
                    removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, candidate_strategem);
                }

            removal_tactician_datastructures.removal_strategy_pop_strategem(strategy);
            removal_tactician_motivation.removal_strategy_strategically_deactivate_strategem(strategy, candidate_strategem);
        } 
    }

    /**
     *
     *
     * @return one of (:interesting, :uninteresting)
     */
    @LispMethod(comment = "@return one of (:interesting, :uninteresting)")
    public static final SubLObject removal_strategy_execute_strategem_alt(SubLObject strategy, SubLObject strategem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(strategy, REMOVAL_STRATEGY_P);
            SubLTrampolineFile.checkType(strategem, STRATEGEM_P);
            {
                SubLObject result = $UNINTERESTING;
                if (NIL != inference_tactician.executable_strategem_p(strategem)) {
                    {
                        SubLObject tactic = strategem;
                        SubLObject strategem_var = tactic;
                        SubLObject problem = inference_tactician.strategem_problem(strategem_var);
                        removal_tactician_motivation.removal_strategy_deactivate_strategem(strategy, strategem_var);
                        com.cyc.cycjava.cycl.inference.harness.removal_tactician_execution.removal_strategy_execute_tactic(strategy, tactic);
                        removal_tactician_motivation.removal_strategy_possibly_deactivate_problem(strategy, problem);
                        result = $INTERESTING;
                    }
                } else {
                    if (NIL != inference_worker.logical_tactic_p(strategem)) {
                        {
                            SubLObject tactic = strategem;
                            if (!((NIL != $removal_strategy_does_not_activate_disallowed_tacticsP$.getDynamicValue(thread)) && (NIL != inference_tactician_strategic_uninterestingness.tactic_disallowedP(strategem, strategy)))) {
                                removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_link_head(strategy, tactic);
                                {
                                    SubLObject strategem_var = tactic;
                                    SubLObject problem = inference_tactician.strategem_problem(strategem_var);
                                    removal_tactician_motivation.removal_strategy_deactivate_strategem(strategy, strategem_var);
                                    inference_tactician.strategy_possibly_execute_tactic(strategy, tactic);
                                    removal_tactician_motivation.removal_strategy_possibly_deactivate_problem(strategy, problem);
                                }
                                result = $INTERESTING;
                            }
                        }
                    } else {
                        if (NIL != inference_worker_transformation.transformation_link_p(strategem)) {
                            return Errors.error($str_alt11$removal_tactician_does_not_handle, strategem);
                        } else {
                            if (NIL != inference_worker_answer.answer_link_p(strategem)) {
                                {
                                    SubLObject answer_link = strategem;
                                    SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
                                    removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, root_problem);
                                    inference_worker.possibly_propagate_answer_link(answer_link);
                                    result = $INTERESTING;
                                }
                            } else {
                                return Errors.error($str_alt12$_S_was_an_unexpected_strategem, strategem);
                            }
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
     * @return one of (:interesting, :uninteresting)
     */
    @LispMethod(comment = "@return one of (:interesting, :uninteresting)")
    public static SubLObject removal_strategy_execute_strategem(final SubLObject strategy, final SubLObject strategem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != removal_tactician.removal_strategy_p(strategy) : "! removal_tactician.removal_strategy_p(strategy) " + ("removal_tactician.removal_strategy_p(strategy) " + "CommonSymbols.NIL != removal_tactician.removal_strategy_p(strategy) ") + strategy;
        assert NIL != inference_tactician.strategem_p(strategem) : "! inference_tactician.strategem_p(strategem) " + ("inference_tactician.strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.strategem_p(strategem) ") + strategem;
        SubLObject result = $UNINTERESTING;
        if (NIL != inference_tactician.executable_strategem_p(strategem)) {
            final SubLObject problem = inference_tactician.strategem_problem(strategem);
            removal_tactician_motivation.removal_strategy_deactivate_strategem(strategy, strategem);
            removal_strategy_execute_tactic(strategy, strategem);
            removal_tactician_motivation.removal_strategy_possibly_deactivate_problem(strategy, problem);
            result = $INTERESTING;
        } else
            if (NIL != inference_worker.logical_tactic_p(strategem)) {
                if ((NIL == $removal_strategy_does_not_activate_disallowed_tacticsP$.getDynamicValue(thread)) || (NIL == inference_tactician_strategic_uninterestingness.tactic_disallowed_or_doomedP(strategem, strategy))) {
                    removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_link_head(strategy, strategem);
                    final SubLObject problem = inference_tactician.strategem_problem(strategem);
                    removal_tactician_motivation.removal_strategy_deactivate_strategem(strategy, strategem);
                    inference_tactician.strategy_possibly_execute_tactic(strategy, strategem);
                    removal_tactician_motivation.removal_strategy_possibly_deactivate_problem(strategy, problem);
                    result = $INTERESTING;
                }
            } else {
                if (NIL != inference_worker_transformation.transformation_link_p(strategem)) {
                    return Errors.error($str11$removal_tactician_does_not_handle, strategem);
                }
                if (NIL == inference_worker_answer.answer_link_p(strategem)) {
                    return Errors.error($str12$_S_was_an_unexpected_strategem, strategem);
                }
                final SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(strategem);
                removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, root_problem);
                inference_worker.possibly_propagate_answer_link(strategem);
                result = $INTERESTING;
            }

        return result;
    }

    public static final SubLObject removal_strategy_execute_tactic_alt(SubLObject strategy, SubLObject tactic) {
        if (NIL != inference_worker.content_tactic_p(tactic)) {
            return com.cyc.cycjava.cycl.inference.harness.removal_tactician_execution.removal_strategy_execute_content_tactic(strategy, tactic);
        } else {
            return com.cyc.cycjava.cycl.inference.harness.removal_tactician_execution.removal_strategy_execute_meta_structural_tactic(strategy, tactic);
        }
    }

    public static SubLObject removal_strategy_execute_tactic(final SubLObject strategy, final SubLObject tactic) {
        if (NIL != inference_worker.content_tactic_p(tactic)) {
            return removal_strategy_execute_content_tactic(strategy, tactic);
        }
        return removal_strategy_execute_meta_structural_tactic(strategy, tactic);
    }

    public static final SubLObject removal_strategy_execute_content_tactic_alt(SubLObject strategy, SubLObject content_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == $removal_strategy_removal_tactic_iterativity_enabledP$.getDynamicValue(thread)) && (NIL != inference_worker_removal.removal_tactic_p(content_tactic))) {
                inference_tactician.strategy_execute_tactic(strategy, content_tactic);
                if (NIL != inference_datastructures_tactic.tactic_in_progressP(content_tactic)) {
                    removal_tactician_motivation.removal_strategy_reactivate_executable_strategem(strategy, content_tactic);
                }
            } else {
                com.cyc.cycjava.cycl.inference.harness.removal_tactician_execution.removal_strategy_execute_executable_strategem(strategy, content_tactic);
            }
            return strategy;
        }
    }

    public static SubLObject removal_strategy_execute_content_tactic(final SubLObject strategy, final SubLObject content_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == $removal_strategy_removal_tactic_iterativity_enabledP$.getDynamicValue(thread)) && (NIL != inference_worker_removal.removal_tactic_p(content_tactic))) {
            inference_tactician.strategy_execute_tactic(strategy, content_tactic);
            if (NIL != inference_datastructures_tactic.tactic_in_progressP(content_tactic)) {
                removal_tactician_motivation.removal_strategy_reactivate_executable_strategem(strategy, content_tactic);
            }
        } else {
            removal_strategy_execute_executable_strategem(strategy, content_tactic);
        }
        return strategy;
    }

    public static final SubLObject removal_strategy_execute_meta_structural_tactic_alt(SubLObject strategy, SubLObject meta_structural_tactic) {
        return com.cyc.cycjava.cycl.inference.harness.removal_tactician_execution.removal_strategy_execute_executable_strategem(strategy, meta_structural_tactic);
    }

    public static SubLObject removal_strategy_execute_meta_structural_tactic(final SubLObject strategy, final SubLObject meta_structural_tactic) {
        return removal_strategy_execute_executable_strategem(strategy, meta_structural_tactic);
    }

    public static final SubLObject removal_strategy_execute_executable_strategem_alt(SubLObject strategy, SubLObject strategem) {
        {
            SubLObject already_in_progressP = inference_datastructures_tactic.tactic_in_progressP(strategem);
            if (NIL != already_in_progressP) {
                removal_tactician_motivation.removal_strategy_reactivate_executable_strategem(strategy, strategem);
            }
            inference_tactician.strategy_execute_tactic(strategy, strategem);
            if ((NIL == already_in_progressP) && (NIL != inference_datastructures_tactic.tactic_in_progressP(strategem))) {
                removal_tactician_motivation.removal_strategy_reactivate_executable_strategem(strategy, strategem);
            }
        }
        return strategem;
    }

    public static SubLObject removal_strategy_execute_executable_strategem(final SubLObject strategy, final SubLObject strategem) {
        final SubLObject already_in_progressP = inference_datastructures_tactic.tactic_in_progressP(strategem);
        if (NIL != already_in_progressP) {
            removal_tactician_motivation.removal_strategy_reactivate_executable_strategem(strategy, strategem);
        }
        inference_tactician.strategy_execute_tactic(strategy, strategem);
        if ((NIL == already_in_progressP) && (NIL != inference_datastructures_tactic.tactic_in_progressP(strategem))) {
            removal_tactician_motivation.removal_strategy_reactivate_executable_strategem(strategy, strategem);
        }
        return strategem;
    }

    public static SubLObject declare_removal_tactician_execution_file() {
        declareFunction("removal_strategy_doneP", "REMOVAL-STRATEGY-DONE?", 1, 0, false);
        declareFunction("removal_strategy_do_one_step", "REMOVAL-STRATEGY-DO-ONE-STEP", 1, 0, false);
        declareFunction("removal_strategy_do_one_step_int", "REMOVAL-STRATEGY-DO-ONE-STEP-INT", 1, 0, false);
        declareFunction("removal_strategy_select_best_strategem", "REMOVAL-STRATEGY-SELECT-BEST-STRATEGEM", 1, 0, false);
        declareFunction("removal_strategy_default_select_best_strategem", "REMOVAL-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM", 1, 0, false);
        declareFunction("removal_strategy_quiesce", "REMOVAL-STRATEGY-QUIESCE", 1, 0, false);
        declareFunction("removal_strategy_execute_strategem", "REMOVAL-STRATEGY-EXECUTE-STRATEGEM", 2, 0, false);
        declareFunction("removal_strategy_execute_tactic", "REMOVAL-STRATEGY-EXECUTE-TACTIC", 2, 0, false);
        declareFunction("removal_strategy_execute_content_tactic", "REMOVAL-STRATEGY-EXECUTE-CONTENT-TACTIC", 2, 0, false);
        declareFunction("removal_strategy_execute_meta_structural_tactic", "REMOVAL-STRATEGY-EXECUTE-META-STRUCTURAL-TACTIC", 2, 0, false);
        declareFunction("removal_strategy_execute_executable_strategem", "REMOVAL-STRATEGY-EXECUTE-EXECUTABLE-STRATEGEM", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_tactician_execution_file() {
        defparameter("*REMOVAL-STRATEGY-DOES-NOT-ACTIVATE-DISALLOWED-TACTICS?*", T);
        defparameter("*REMOVAL-STRATEGY-REMOVAL-TACTIC-ITERATIVITY-ENABLED?*", T);
        return NIL;
    }

    public static SubLObject setup_removal_tactician_execution_file() {
        note_funcall_helper_function($sym0$REMOVAL_STRATEGY_DONE_);
        note_funcall_helper_function(REMOVAL_STRATEGY_DO_ONE_STEP);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_tactician_execution_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_tactician_execution_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_tactician_execution_file();
    }

    static {
    }

    static private final SubLString $str_alt3$_s_says_it_s_done__but_its_R_box_ = makeString("~s says it's done, but its R-box is nonempty");

    static private final SubLString $str_alt11$removal_tactician_does_not_handle = makeString("removal tactician does not handle transformation link ~a");

    static private final SubLString $str_alt12$_S_was_an_unexpected_strategem = makeString("~S was an unexpected strategem");
}

/**
 * Total time: 46 ms
 */
