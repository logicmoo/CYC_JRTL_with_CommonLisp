package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class new_root_tactician_motivation extends SubLTranslatedFile {
    public static final SubLFile me = new new_root_tactician_motivation();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation";

    public static final String myFingerPrint = "f1d826354f643db13887ef1320e31447a0d5c7f152ed02a417adf7391e25a2bc";



    public static final SubLSymbol NEW_ROOT_STRATEGY_P = makeSymbol("NEW-ROOT-STRATEGY-P");

    private static final SubLSymbol $sym2$NEW_ROOT_STRATEGY_NOTHING_TO_DO_ = makeSymbol("NEW-ROOT-STRATEGY-NOTHING-TO-DO?");

    public static SubLObject new_root_strategy_possibly_propagate_motivation_to_problem(final SubLObject strategy, final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        final SubLObject already_motivatedP = inference_datastructures_strategy.problem_motivatedP(problem, strategy);
        if (NIL == already_motivatedP) {
            new_root_strategy_propagate_motivation_to_problem(strategy, problem);
            return T;
        }
        return NIL;
    }

    public static SubLObject new_root_strategy_propagate_motivation_to_problem(final SubLObject strategy, final SubLObject problem) {
        new_root_tactician_datastructures.new_root_strategy_note_problem_motivated(strategy, problem);
        if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            new_root_strategy_possibly_activate_problem(strategy, problem);
        }
        return NIL;
    }

    public static SubLObject new_root_strategy_possibly_activate_problem(final SubLObject strategy, final SubLObject problem) {
        if (NIL != new_root_strategy_chooses_not_to_examine_problemP(strategy, problem)) {
            return NIL;
        }
        inference_worker.determine_strategic_status_wrt(problem, strategy);
        if (NIL != new_root_strategy_chooses_not_to_activate_problemP(strategy, problem)) {
            return NIL;
        }
        final SubLObject activateP = makeBoolean((NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) && (NIL == new_root_strategy_chooses_not_to_activate_problemP(strategy, problem)));
        if (NIL != activateP) {
            new_root_strategy_activate_problem(strategy, problem);
            return T;
        }
        return NIL;
    }

    public static SubLObject new_root_strategy_chooses_not_to_examine_problemP(final SubLObject strategy, final SubLObject problem) {
        return inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem);
    }

    public static SubLObject new_root_strategy_chooses_not_to_activate_problemP(final SubLObject strategy, final SubLObject problem) {
        return new_root_tactician_datastructures.new_root_strategy_problem_activeP(strategy, problem);
    }

    public static SubLObject new_root_strategy_activate_problem(final SubLObject strategy, final SubLObject problem) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : "new_root_tactician.new_root_strategy_p(strategy) " + "CommonSymbols.NIL != new_root_tactician.new_root_strategy_p(strategy) " + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
        return plusp(new_root_strategy_possibly_activate_strategems(strategy, problem));
    }

    public static SubLObject new_root_strategy_possibly_activate_strategems(final SubLObject strategy, final SubLObject problem) {
        new_root_tactician.new_root_strategy_add_new_root(strategy, problem);
        return TWO_INTEGER;
    }

    public static SubLObject new_root_strategy_nothing_to_doP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_problem.problem_has_no_tacticsP(problem);
    }

    public static SubLObject declare_new_root_tactician_motivation_file() {
        declareFunction(me, "new_root_strategy_possibly_propagate_motivation_to_problem", "NEW-ROOT-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction(me, "new_root_strategy_propagate_motivation_to_problem", "NEW-ROOT-STRATEGY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction(me, "new_root_strategy_possibly_activate_problem", "NEW-ROOT-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction(me, "new_root_strategy_chooses_not_to_examine_problemP", "NEW-ROOT-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
        declareFunction(me, "new_root_strategy_chooses_not_to_activate_problemP", "NEW-ROOT-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
        declareFunction(me, "new_root_strategy_activate_problem", "NEW-ROOT-STRATEGY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction(me, "new_root_strategy_possibly_activate_strategems", "NEW-ROOT-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS", 2, 0, false);
        declareFunction(me, "new_root_strategy_nothing_to_doP", "NEW-ROOT-STRATEGY-NOTHING-TO-DO?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_new_root_tactician_motivation_file() {
        return NIL;
    }

    public static SubLObject setup_new_root_tactician_motivation_file() {
        note_funcall_helper_function($sym2$NEW_ROOT_STRATEGY_NOTHING_TO_DO_);
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

    
}

/**
 * Total time: 30 ms
 */
