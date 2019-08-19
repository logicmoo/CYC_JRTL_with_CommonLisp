package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class new_root_tactician_motivation extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation";
    public static String myFingerPrint = "f1d826354f643db13887ef1320e31447a0d5c7f152ed02a417adf7391e25a2bc";
    private static SubLSymbol $sym0$PROBLEM_P;
    private static SubLSymbol $sym1$NEW_ROOT_STRATEGY_P;
    private static SubLSymbol $sym2$NEW_ROOT_STRATEGY_NOTHING_TO_DO_;

    @SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 1000L)
    public static SubLObject new_root_strategy_possibly_propagate_motivation_to_problem(SubLObject strategy, SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject already_motivatedP = inference_datastructures_strategy.problem_motivatedP(problem, strategy);
        if (NIL == already_motivatedP) {
            new_root_strategy_propagate_motivation_to_problem(strategy, problem);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 1400L)
    public static SubLObject new_root_strategy_propagate_motivation_to_problem(SubLObject strategy, SubLObject problem) {
        new_root_tactician_datastructures.new_root_strategy_note_problem_motivated(strategy, problem);
        if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            new_root_strategy_possibly_activate_problem(strategy, problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 1800L)
    public static SubLObject new_root_strategy_possibly_activate_problem(SubLObject strategy, SubLObject problem) {
        if (NIL != new_root_strategy_chooses_not_to_examine_problemP(strategy, problem)) {
            return NIL;
        }
        inference_worker.determine_strategic_status_wrt(problem, strategy);
        if (NIL != new_root_strategy_chooses_not_to_activate_problemP(strategy, problem)) {
            return NIL;
        }
        SubLObject activateP = makeBoolean(NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy) && NIL == new_root_strategy_chooses_not_to_activate_problemP(strategy, problem));
        if (NIL != activateP) {
            new_root_strategy_activate_problem(strategy, problem);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 3000L)
    public static SubLObject new_root_strategy_chooses_not_to_examine_problemP(SubLObject strategy, SubLObject problem) {
        return inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem);
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 3200L)
    public static SubLObject new_root_strategy_chooses_not_to_activate_problemP(SubLObject strategy, SubLObject problem) {
        return new_root_tactician_datastructures.new_root_strategy_problem_activeP(strategy, problem);
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 3400L)
    public static SubLObject new_root_strategy_activate_problem(SubLObject strategy, SubLObject problem) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return Numbers.plusp(new_root_strategy_possibly_activate_strategems(strategy, problem));
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 3600L)
    public static SubLObject new_root_strategy_possibly_activate_strategems(SubLObject strategy, SubLObject problem) {
        new_root_tactician.new_root_strategy_add_new_root(strategy, problem);
        return TWO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 3800L)
    public static SubLObject new_root_strategy_nothing_to_doP(SubLObject strategy, SubLObject problem) {
        return inference_datastructures_problem.problem_has_no_tacticsP(problem);
    }

    public static SubLObject declare_new_root_tactician_motivation_file() {
        declareFunction(myName, "new_root_strategy_possibly_propagate_motivation_to_problem", "NEW-ROOT-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction(myName, "new_root_strategy_propagate_motivation_to_problem", "NEW-ROOT-STRATEGY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction(myName, "new_root_strategy_possibly_activate_problem", "NEW-ROOT-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction(myName, "new_root_strategy_chooses_not_to_examine_problemP", "NEW-ROOT-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
        declareFunction(myName, "new_root_strategy_chooses_not_to_activate_problemP", "NEW-ROOT-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
        declareFunction(myName, "new_root_strategy_activate_problem", "NEW-ROOT-STRATEGY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction(myName, "new_root_strategy_possibly_activate_strategems", "NEW-ROOT-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS", 2, 0, false);
        declareFunction(myName, "new_root_strategy_nothing_to_doP", "NEW-ROOT-STRATEGY-NOTHING-TO-DO?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_new_root_tactician_motivation_file() {
        return NIL;
    }

    public static SubLObject setup_new_root_tactician_motivation_file() {
        utilities_macros.note_funcall_helper_function($sym2$NEW_ROOT_STRATEGY_NOTHING_TO_DO_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_new_root_tactician_motivation_file();
    }

    @Override
    public void initializeVariables() {
        init_new_root_tactician_motivation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_new_root_tactician_motivation_file();
    }

    static {
        me = new new_root_tactician_motivation();
        $sym0$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym1$NEW_ROOT_STRATEGY_P = makeSymbol("NEW-ROOT-STRATEGY-P");
        $sym2$NEW_ROOT_STRATEGY_NOTHING_TO_DO_ = makeSymbol("NEW-ROOT-STRATEGY-NOTHING-TO-DO?");
    }
}
/*
 *
 * Total time: 30 ms
 *
 */