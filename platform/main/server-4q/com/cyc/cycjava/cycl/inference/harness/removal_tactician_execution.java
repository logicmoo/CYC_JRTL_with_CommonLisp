package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_tactician_execution extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "04be76b85e98b5daa1bfdd184a00027d3f6d575705957b0ab978c1b7192bede7";
    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 3900L)
    private static SubLSymbol $removal_strategy_does_not_activate_disallowed_tacticsP$;
    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 5900L)
    public static SubLSymbol $removal_strategy_removal_tactic_iterativity_enabledP$;
    private static SubLSymbol $sym0$REMOVAL_STRATEGY_DONE_;
    private static SubLSymbol $UNINTERESTING;
    private static SubLSymbol $DONE;
    private static SubLString $str3$_s_says_it_s_done__but_its_R_box_;
    private static SubLSymbol $sym4$REMOVAL_STRATEGY_DO_ONE_STEP;
    private static SubLSymbol $SELECT_BEST_STRATEGEM;
    private static SubLSymbol $sym6$REMOVAL_STRATEGY_P;
    private static SubLSymbol $SET_ASIDE;
    private static SubLSymbol $THROW_AWAY;
    private static SubLSymbol $sym9$STRATEGEM_P;
    private static SubLSymbol $INTERESTING;
    private static SubLString $str11$removal_tactician_does_not_handle;
    private static SubLString $str12$_S_was_an_unexpected_strategem;

    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 900L)
    public static SubLObject removal_strategy_doneP(SubLObject strategy) {
        return makeBoolean(NIL != removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy) && NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy));
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 1100L)
    public static SubLObject removal_strategy_do_one_step(SubLObject strategy) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result;
        for (result = $UNINTERESTING; $UNINTERESTING == result; result = removal_strategy_do_one_step_int(strategy)) {
        }
        if (NIL != control_vars.$inference_debugP$.getDynamicValue(thread) && $DONE == result && NIL == removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy)) {
            Errors.cerror($str3$_s_says_it_s_done__but_its_R_box_, strategy);
        }
        return Equality.eq($DONE, result);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 1600L)
    public static SubLObject removal_strategy_do_one_step_int(SubLObject strategy) {
        SubLObject result = NIL;
        if (NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(strategy)) {
            inference_tactician.strategy_reconsider_set_asides(strategy);
            result = $UNINTERESTING;
        } else if (NIL != inference_tactician.strategy_doneP(strategy)) {
            result = $DONE;
        } else {
            SubLObject strategem = removal_strategy_select_best_strategem(strategy);
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

    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 2300L)
    public static SubLObject removal_strategy_select_best_strategem(SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SELECT_BEST_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 2600L)
    public static SubLObject removal_strategy_default_select_best_strategem(SubLObject strategy) {
        removal_strategy_quiesce(strategy);
        if (NIL == removal_tactician_datastructures.removal_strategy_no_strategems_activeP(strategy)) {
            return removal_tactician_datastructures.removal_strategy_pop_strategem(strategy);
        }
        if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
            return inference_datastructures_strategy.strategy_answer_link(strategy);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 3000L)
    public static SubLObject removal_strategy_quiesce(SubLObject strategy) {
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        while (true) {
            SubLObject candidate_strategem = removal_tactician_datastructures.removal_strategy_peek_strategem(strategy);
            if (NIL == candidate_strategem) {
                return NIL;
            }
            SubLObject reason = removal_tactician_uninterestingness.why_removal_strategy_chooses_to_ignore_strategem(strategy, candidate_strategem);
            if (NIL == reason) {
                return candidate_strategem;
            }
            SubLObject pcase_var = reason;
            if (pcase_var.eql($SET_ASIDE)) {
                removal_tactician_datastructures.removal_strategy_note_strategem_set_aside(strategy, candidate_strategem);
            } else if (pcase_var.eql($THROW_AWAY)) {
                removal_tactician_datastructures.removal_strategy_note_strategem_thrown_away(strategy, candidate_strategem);
            }
            removal_tactician_datastructures.removal_strategy_pop_strategem(strategy);
            removal_tactician_motivation.removal_strategy_strategically_deactivate_strategem(strategy, candidate_strategem);
        }
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 4000L)
    public static SubLObject removal_strategy_execute_strategem(SubLObject strategy, SubLObject strategem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != removal_tactician.removal_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.strategem_p(strategem) : strategem;
        SubLObject result = $UNINTERESTING;
        if (NIL != inference_tactician.executable_strategem_p(strategem)) {
            SubLObject problem = inference_tactician.strategem_problem(strategem);
            removal_tactician_motivation.removal_strategy_deactivate_strategem(strategy, strategem);
            removal_strategy_execute_tactic(strategy, strategem);
            removal_tactician_motivation.removal_strategy_possibly_deactivate_problem(strategy, problem);
            result = $INTERESTING;
        } else if (NIL != inference_worker.logical_tactic_p(strategem)) {
            if (NIL == $removal_strategy_does_not_activate_disallowed_tacticsP$.getDynamicValue(thread) || NIL == inference_tactician_strategic_uninterestingness.tactic_disallowed_or_doomedP(strategem, strategy)) {
                removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_link_head(strategy, strategem);
                SubLObject problem = inference_tactician.strategem_problem(strategem);
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
            SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(strategem);
            removal_tactician_motivation.removal_strategy_possibly_propagate_motivation_to_problem(strategy, root_problem);
            inference_worker.possibly_propagate_answer_link(strategem);
            result = $INTERESTING;
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 6100L)
    public static SubLObject removal_strategy_execute_tactic(SubLObject strategy, SubLObject tactic) {
        if (NIL != inference_worker.content_tactic_p(tactic)) {
            return removal_strategy_execute_content_tactic(strategy, tactic);
        }
        return removal_strategy_execute_meta_structural_tactic(strategy, tactic);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 6400L)
    public static SubLObject removal_strategy_execute_content_tactic(SubLObject strategy, SubLObject content_tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $removal_strategy_removal_tactic_iterativity_enabledP$.getDynamicValue(thread) && NIL != inference_worker_removal.removal_tactic_p(content_tactic)) {
            inference_tactician.strategy_execute_tactic(strategy, content_tactic);
            if (NIL != inference_datastructures_tactic.tactic_in_progressP(content_tactic)) {
                removal_tactician_motivation.removal_strategy_reactivate_executable_strategem(strategy, content_tactic);
            }
        } else {
            removal_strategy_execute_executable_strategem(strategy, content_tactic);
        }
        return strategy;
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 6900L)
    public static SubLObject removal_strategy_execute_meta_structural_tactic(SubLObject strategy, SubLObject meta_structural_tactic) {
        return removal_strategy_execute_executable_strategem(strategy, meta_structural_tactic);
    }

    @SubL(source = "cycl/inference/harness/removal-tactician-execution.lisp", position = 7100L)
    public static SubLObject removal_strategy_execute_executable_strategem(SubLObject strategy, SubLObject strategem) {
        SubLObject already_in_progressP = inference_datastructures_tactic.tactic_in_progressP(strategem);
        if (NIL != already_in_progressP) {
            removal_tactician_motivation.removal_strategy_reactivate_executable_strategem(strategy, strategem);
        }
        inference_tactician.strategy_execute_tactic(strategy, strategem);
        if (NIL == already_in_progressP && NIL != inference_datastructures_tactic.tactic_in_progressP(strategem)) {
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
        $removal_strategy_does_not_activate_disallowed_tacticsP$ = SubLFiles.defparameter("*REMOVAL-STRATEGY-DOES-NOT-ACTIVATE-DISALLOWED-TACTICS?*", T);
        $removal_strategy_removal_tactic_iterativity_enabledP$ = SubLFiles.defparameter("*REMOVAL-STRATEGY-REMOVAL-TACTIC-ITERATIVITY-ENABLED?*", T);
        return NIL;
    }

    public static SubLObject setup_removal_tactician_execution_file() {
        utilities_macros.note_funcall_helper_function($sym0$REMOVAL_STRATEGY_DONE_);
        utilities_macros.note_funcall_helper_function($sym4$REMOVAL_STRATEGY_DO_ONE_STEP);
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
        me = new removal_tactician_execution();
        $removal_strategy_does_not_activate_disallowed_tacticsP$ = null;
        $removal_strategy_removal_tactic_iterativity_enabledP$ = null;
        $sym0$REMOVAL_STRATEGY_DONE_ = makeSymbol("REMOVAL-STRATEGY-DONE?");
        $UNINTERESTING = makeKeyword("UNINTERESTING");
        $DONE = makeKeyword("DONE");
        $str3$_s_says_it_s_done__but_its_R_box_ = makeString("~s says it's done, but its R-box is nonempty");
        $sym4$REMOVAL_STRATEGY_DO_ONE_STEP = makeSymbol("REMOVAL-STRATEGY-DO-ONE-STEP");
        $SELECT_BEST_STRATEGEM = makeKeyword("SELECT-BEST-STRATEGEM");
        $sym6$REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");
        $SET_ASIDE = makeKeyword("SET-ASIDE");
        $THROW_AWAY = makeKeyword("THROW-AWAY");
        $sym9$STRATEGEM_P = makeSymbol("STRATEGEM-P");
        $INTERESTING = makeKeyword("INTERESTING");
        $str11$removal_tactician_does_not_handle = makeString("removal tactician does not handle transformation link ~a");
        $str12$_S_was_an_unexpected_strategem = makeString("~S was an unexpected strategem");
    }
}
/*
 *
 * Total time: 46 ms
 *
 */