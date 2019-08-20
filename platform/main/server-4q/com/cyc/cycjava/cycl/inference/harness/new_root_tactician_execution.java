package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class new_root_tactician_execution extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "efeacddaa0ba19fbb3b70c4d5b17cac684f442c33029a0107cb5e55e30d90fd8";
    private static SubLSymbol $sym0$NEW_ROOT_STRATEGY_DONE_;
    private static SubLSymbol $UNINTERESTING;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym3$NEW_ROOT_STRATEGY_SELECT_BEST_STRATEGEM;
    private static SubLSymbol $sym4$NEW_ROOT_STRATEGY_PEEK_NEXT_STRATEGEM;
    private static SubLSymbol $sym5$NEW_ROOT_STRATEGY_P;
    private static SubLSymbol $sym6$STRATEGEM_P;
    private static SubLSymbol $INTERESTING;
    private static SubLString $str8$_S_was_an_unexpected_strategem;

    @SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 900L)
    public static SubLObject new_root_strategy_doneP(SubLObject strategy) {
        return makeBoolean(NIL != new_root_tactician_datastructures.new_root_strategy_no_new_rootsP(strategy) && NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy));
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 1100L)
    public static SubLObject new_root_strategy_do_one_step(SubLObject strategy) {
        SubLObject result;
        for (result = $UNINTERESTING; $UNINTERESTING == result; result = new_root_strategy_do_one_step_int(strategy)) {
        }
        return Equality.eq($DONE, result);
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 1300L)
    public static SubLObject new_root_strategy_do_one_step_int(SubLObject strategy) {
        SubLObject result = NIL;
        if (NIL != inference_tactician.strategy_doneP(strategy)) {
            result = $DONE;
        } else {
            SubLObject strategem = new_root_strategy_select_best_strategem(strategy);
            if (NIL != strategem) {
                result = inference_tactician.strategy_execute_strategem(strategy, strategem);
            } else {
                result = $DONE;
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 2000L)
    public static SubLObject new_root_strategy_select_best_strategem(SubLObject strategy) {
        return new_root_strategy_select_best_strategem_int(strategy, T);
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 2200L)
    public static SubLObject new_root_strategy_peek_next_strategem(SubLObject strategy) {
        return new_root_strategy_select_best_strategem_int(strategy, NIL);
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 2300L)
    public static SubLObject new_root_strategy_select_best_strategem_int(SubLObject strategy, SubLObject popP) {
        new_root_strategy_quiesce(strategy);
        if (NIL == new_root_tactician_datastructures.new_root_strategy_no_new_rootsP(strategy)) {
            return (NIL != popP) ? new_root_tactician_datastructures.new_root_strategy_pop_new_root(strategy) : new_root_tactician.new_root_strategy_peek_new_root(strategy);
        }
        if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
            return inference_datastructures_strategy.strategy_answer_link(strategy);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 2800L)
    public static SubLObject new_root_strategy_quiesce(SubLObject strategy) {
        return strategy;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 3000L)
    public static SubLObject new_root_strategy_execute_strategem(SubLObject strategy, SubLObject strategem) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : strategy;
        assert NIL != inference_tactician.strategem_p(strategem) : strategem;
        SubLObject result = $UNINTERESTING;
        if (NIL != inference_datastructures_problem.problem_p(strategem)) {
            result = $INTERESTING;
        } else {
            if (NIL == inference_worker_answer.answer_link_p(strategem)) {
                return Errors.error($str8$_S_was_an_unexpected_strategem, strategem);
            }
            SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(strategem);
            new_root_tactician_motivation.new_root_strategy_possibly_propagate_motivation_to_problem(strategy, root_problem);
            inference_worker.possibly_propagate_answer_link(strategem);
            result = $INTERESTING;
        }
        return result;
    }

    public static SubLObject declare_new_root_tactician_execution_file() {
        declareFunction("new_root_strategy_doneP", "NEW-ROOT-STRATEGY-DONE?", 1, 0, false);
        declareFunction("new_root_strategy_do_one_step", "NEW-ROOT-STRATEGY-DO-ONE-STEP", 1, 0, false);
        declareFunction("new_root_strategy_do_one_step_int", "NEW-ROOT-STRATEGY-DO-ONE-STEP-INT", 1, 0, false);
        declareFunction("new_root_strategy_select_best_strategem", "NEW-ROOT-STRATEGY-SELECT-BEST-STRATEGEM", 1, 0, false);
        declareFunction("new_root_strategy_peek_next_strategem", "NEW-ROOT-STRATEGY-PEEK-NEXT-STRATEGEM", 1, 0, false);
        declareFunction("new_root_strategy_select_best_strategem_int", "NEW-ROOT-STRATEGY-SELECT-BEST-STRATEGEM-INT", 2, 0, false);
        declareFunction("new_root_strategy_quiesce", "NEW-ROOT-STRATEGY-QUIESCE", 1, 0, false);
        declareFunction("new_root_strategy_execute_strategem", "NEW-ROOT-STRATEGY-EXECUTE-STRATEGEM", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_new_root_tactician_execution_file() {
        return NIL;
    }

    public static SubLObject setup_new_root_tactician_execution_file() {
        utilities_macros.note_funcall_helper_function($sym0$NEW_ROOT_STRATEGY_DONE_);
        utilities_macros.note_funcall_helper_function($sym3$NEW_ROOT_STRATEGY_SELECT_BEST_STRATEGEM);
        utilities_macros.note_funcall_helper_function($sym4$NEW_ROOT_STRATEGY_PEEK_NEXT_STRATEGEM);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_new_root_tactician_execution_file();
    }

    @Override
    public void initializeVariables() {
        init_new_root_tactician_execution_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_new_root_tactician_execution_file();
    }

    static {
        me = new new_root_tactician_execution();
        $sym0$NEW_ROOT_STRATEGY_DONE_ = makeSymbol("NEW-ROOT-STRATEGY-DONE?");
        $UNINTERESTING = makeKeyword("UNINTERESTING");
        $DONE = makeKeyword("DONE");
        $sym3$NEW_ROOT_STRATEGY_SELECT_BEST_STRATEGEM = makeSymbol("NEW-ROOT-STRATEGY-SELECT-BEST-STRATEGEM");
        $sym4$NEW_ROOT_STRATEGY_PEEK_NEXT_STRATEGEM = makeSymbol("NEW-ROOT-STRATEGY-PEEK-NEXT-STRATEGEM");
        $sym5$NEW_ROOT_STRATEGY_P = makeSymbol("NEW-ROOT-STRATEGY-P");
        $sym6$STRATEGEM_P = makeSymbol("STRATEGEM-P");
        $INTERESTING = makeKeyword("INTERESTING");
        $str8$_S_was_an_unexpected_strategem = makeString("~S was an unexpected strategem");
    }
}
/*
 *
 * Total time: 33 ms
 *
 */