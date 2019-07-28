package com.cyc.cycjava.cycl.inference.harness;


import com.cyc.cycjava.cycl.inference.harness.transformation_tactician_execution;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.inference.harness.transformation_tactician_execution.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class transformation_tactician_execution extends SubLTranslatedFile {
    public static final SubLFile me = new transformation_tactician_execution();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.transformation_tactician_execution";

    public static final String myFingerPrint = "b119e976d22be831bdcea40531c850d79b05dad0f99c26881a9da0c16aa28eba";

    // defparameter
    private static final SubLSymbol $transformation_strategy_box_shaking_frequency$ = makeSymbol("*TRANSFORMATION-STRATEGY-BOX-SHAKING-FREQUENCY*");





    private static final SubLString $$$Continue = makeString("Continue");

    private static final SubLString $str3$_s_says_it_s_done__but_its_T_box_ = makeString("~s says it's done, but its T-box is nonempty");

    private static final SubLSymbol $SELECT_BEST_STRATEGEM = makeKeyword("SELECT-BEST-STRATEGEM");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");









    private static final SubLString $str11$_S_was_an_unexpected_strategem = makeString("~S was an unexpected strategem");

    public static SubLObject transformation_strategy_doneP(final SubLObject strategy) {
        return makeBoolean((NIL != transformation_tactician.transformation_strategy_no_strategems_activeP(strategy)) && (NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)));
    }

    public static SubLObject transformation_strategy_do_one_step(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result;
        for (result = $UNINTERESTING; $UNINTERESTING == result; result = transformation_strategy_do_one_step_int(strategy)) {
        }
        if (((NIL != $inference_debugP$.getDynamicValue(thread)) && ($DONE == result)) && (NIL == transformation_tactician.transformation_strategy_no_strategems_activeP(strategy))) {
            Errors.cerror($$$Continue, $str3$_s_says_it_s_done__but_its_T_box_, strategy);
        }
        return eq($DONE, result);
    }

    public static SubLObject transformation_strategy_do_one_step_int(final SubLObject strategy) {
        SubLObject result = NIL;
        if (NIL != inference_datastructures_strategy.strategy_should_reconsider_set_asidesP(strategy)) {
            inference_tactician.strategy_reconsider_set_asides(strategy);
            result = $UNINTERESTING;
        } else
            if (NIL != inference_tactician.strategy_doneP(strategy)) {
                result = $DONE;
            } else {
                final SubLObject strategem = transformation_strategy_select_best_strategem(strategy);
                if (NIL != strategem) {
                    result = inference_tactician.strategy_execute_strategem(strategy, strategem);
                } else {
                    result = $DONE;
                }
            }

        return result;
    }

    public static SubLObject transformation_strategy_select_best_strategem(final SubLObject strategy) {
        return inference_datastructures_strategy.strategy_dispatch(strategy, $SELECT_BEST_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject transformation_strategy_default_select_best_strategem(final SubLObject strategy) {
        transformation_strategy_quiesce(strategy);
        if (NIL == transformation_tactician.transformation_strategy_no_strategems_activeP(strategy)) {
            return transformation_tactician.transformation_strategy_pop_strategem(strategy);
        }
        if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
            return inference_datastructures_strategy.strategy_answer_link(strategy);
        }
        return NIL;
    }

    public static SubLObject transformation_strategy_quiesce(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        if (mod(inference_datastructures_strategy.strategy_step_count(strategy), $transformation_strategy_box_shaking_frequency$.getDynamicValue(thread)).isZero()) {
            transformation_tactician.transformation_strategy_shake_the_happy_box(strategy);
        }
        while (true) {
            final SubLObject candidate_strategem = transformation_tactician.transformation_strategy_peek_strategem(strategy);
            if (NIL == candidate_strategem) {
                return NIL;
            }
            final SubLObject reason = transformation_tactician_uninterestingness.why_transformation_strategy_chooses_to_ignore_strategem(strategy, candidate_strategem);
            if (NIL == reason) {
                return candidate_strategem;
            }
            final SubLObject pcase_var = reason;
            if (pcase_var.eql($SET_ASIDE)) {
                transformation_tactician_datastructures.transformation_strategy_note_strategem_set_aside(strategy, candidate_strategem);
            } else
                if (pcase_var.eql($THROW_AWAY)) {
                }

            transformation_tactician.transformation_strategy_pop_strategem(strategy);
            transformation_tactician_motivation.transformation_strategy_strategically_deactivate_strategem(strategy, candidate_strategem);
        } 
    }

    public static SubLObject transformation_strategy_execute_strategem(final SubLObject strategy, final SubLObject strategem) {
        assert NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) : "transformation_tactician_datastructures.transformation_strategy_p(strategy) " + "CommonSymbols.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) " + strategy;
        assert NIL != inference_tactician.strategem_p(strategem) : "inference_tactician.strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.strategem_p(strategem) " + strategem;
        SubLObject result = $UNINTERESTING;
        if (NIL != inference_tactician.executable_strategem_p(strategem)) {
            final SubLObject problem = inference_tactician.strategem_problem(strategem);
            transformation_tactician_motivation.transformation_strategy_deactivate_strategem(strategy, strategem);
            transformation_strategy_execute_tactic(strategy, strategem);
            transformation_tactician_motivation.transformation_strategy_possibly_deactivate_problem(strategy, problem);
            result = $INTERESTING;
        } else
            if (NIL != inference_worker.logical_tactic_p(strategem)) {
                transformation_tactician_motivation.transformation_strategy_possibly_propagate_motivation_to_link_head(strategy, strategem);
                final SubLObject problem = inference_tactician.strategem_problem(strategem);
                transformation_tactician_motivation.transformation_strategy_deactivate_strategem(strategy, strategem);
                inference_tactician.strategy_possibly_execute_tactic(strategy, strategem);
                transformation_tactician_motivation.transformation_strategy_possibly_deactivate_problem(strategy, problem);
                result = $INTERESTING;
            } else
                if (NIL != inference_worker_transformation.transformation_link_p(strategem)) {
                    transformation_tactician_motivation.transformation_strategy_possibly_propagate_motivation_to_link_head(strategy, strategem);
                    transformation_tactician_motivation.transformation_strategy_strategically_deactivate_strategem(strategy, strategem);
                    result = $INTERESTING;
                } else {
                    if (NIL == inference_worker_answer.answer_link_p(strategem)) {
                        return Errors.error($str11$_S_was_an_unexpected_strategem, strategem);
                    }
                    final SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(strategem);
                    transformation_tactician_motivation.transformation_strategy_possibly_propagate_motivation_to_problem(strategy, root_problem);
                    inference_worker.possibly_propagate_answer_link(strategem);
                    result = $INTERESTING;
                }


        return result;
    }

    public static SubLObject transformation_strategy_execute_tactic(final SubLObject strategy, final SubLObject tactic) {
        if (NIL != inference_worker.content_tactic_p(tactic)) {
            return transformation_strategy_execute_content_tactic(strategy, tactic);
        }
        return transformation_strategy_execute_meta_structural_tactic(strategy, tactic);
    }

    public static SubLObject transformation_strategy_execute_content_tactic(final SubLObject strategy, final SubLObject content_tactic) {
        transformation_strategy_execute_executable_strategem(strategy, content_tactic);
        return strategy;
    }

    public static SubLObject transformation_strategy_execute_meta_structural_tactic(final SubLObject strategy, final SubLObject meta_structural_tactic) {
        return transformation_strategy_execute_executable_strategem(strategy, meta_structural_tactic);
    }

    public static SubLObject transformation_strategy_execute_executable_strategem(final SubLObject strategy, final SubLObject strategem) {
        final SubLObject already_in_progressP = inference_datastructures_tactic.tactic_in_progressP(strategem);
        if (NIL != already_in_progressP) {
            transformation_tactician_motivation.transformation_strategy_reactivate_executable_strategem(strategy, strategem);
        }
        inference_tactician.strategy_execute_tactic(strategy, strategem);
        if ((NIL == already_in_progressP) && (NIL != inference_datastructures_tactic.tactic_in_progressP(strategem))) {
            transformation_tactician_motivation.transformation_strategy_reactivate_executable_strategem(strategy, strategem);
        }
        return strategem;
    }

    public static SubLObject declare_transformation_tactician_execution_file() {
        declareFunction(me, "transformation_strategy_doneP", "TRANSFORMATION-STRATEGY-DONE?", 1, 0, false);
        declareFunction(me, "transformation_strategy_do_one_step", "TRANSFORMATION-STRATEGY-DO-ONE-STEP", 1, 0, false);
        declareFunction(me, "transformation_strategy_do_one_step_int", "TRANSFORMATION-STRATEGY-DO-ONE-STEP-INT", 1, 0, false);
        declareFunction(me, "transformation_strategy_select_best_strategem", "TRANSFORMATION-STRATEGY-SELECT-BEST-STRATEGEM", 1, 0, false);
        declareFunction(me, "transformation_strategy_default_select_best_strategem", "TRANSFORMATION-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM", 1, 0, false);
        declareFunction(me, "transformation_strategy_quiesce", "TRANSFORMATION-STRATEGY-QUIESCE", 1, 0, false);
        declareFunction(me, "transformation_strategy_execute_strategem", "TRANSFORMATION-STRATEGY-EXECUTE-STRATEGEM", 2, 0, false);
        declareFunction(me, "transformation_strategy_execute_tactic", "TRANSFORMATION-STRATEGY-EXECUTE-TACTIC", 2, 0, false);
        declareFunction(me, "transformation_strategy_execute_content_tactic", "TRANSFORMATION-STRATEGY-EXECUTE-CONTENT-TACTIC", 2, 0, false);
        declareFunction(me, "transformation_strategy_execute_meta_structural_tactic", "TRANSFORMATION-STRATEGY-EXECUTE-META-STRUCTURAL-TACTIC", 2, 0, false);
        declareFunction(me, "transformation_strategy_execute_executable_strategem", "TRANSFORMATION-STRATEGY-EXECUTE-EXECUTABLE-STRATEGEM", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_transformation_tactician_execution_file() {
        defparameter("*TRANSFORMATION-STRATEGY-BOX-SHAKING-FREQUENCY*", $int$50);
        return NIL;
    }

    public static SubLObject setup_transformation_tactician_execution_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transformation_tactician_execution_file();
    }

    @Override
    public void initializeVariables() {
        init_transformation_tactician_execution_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transformation_tactician_execution_file();
    }

    static {














    }
}

/**
 * Total time: 167 ms
 */
