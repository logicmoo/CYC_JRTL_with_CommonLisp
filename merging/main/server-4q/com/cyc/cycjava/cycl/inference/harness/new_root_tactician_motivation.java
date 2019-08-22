/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NEW-ROOT-TACTICIAN-MOTIVATION
 * source file: /cyc/top/cycl/inference/harness/new-root-tactician-motivation.lisp
 * created:     2019/07/03 17:37:41
 */
public final class new_root_tactician_motivation extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new new_root_tactician_motivation();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation";


    private static final SubLSymbol NEW_ROOT_STRATEGY_P = makeSymbol("NEW-ROOT-STRATEGY-P");

    private static final SubLSymbol $sym2$NEW_ROOT_STRATEGY_NOTHING_TO_DO_ = makeSymbol("NEW-ROOT-STRATEGY-NOTHING-TO-DO?");

    // Definitions
    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject new_root_strategy_possibly_propagate_motivation_to_problem_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        {
            SubLObject already_motivatedP = inference_datastructures_strategy.problem_motivatedP(problem, strategy);
            if (NIL == already_motivatedP) {
                com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation.new_root_strategy_propagate_motivation_to_problem(strategy, problem);
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
    public static SubLObject new_root_strategy_possibly_propagate_motivation_to_problem(final SubLObject strategy, final SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        final SubLObject already_motivatedP = inference_datastructures_strategy.problem_motivatedP(problem, strategy);
        if (NIL == already_motivatedP) {
            new_root_strategy_propagate_motivation_to_problem(strategy, problem);
            return T;
        }
        return NIL;
    }

    public static final SubLObject new_root_strategy_propagate_motivation_to_problem_alt(SubLObject strategy, SubLObject problem) {
        new_root_tactician_datastructures.new_root_strategy_note_problem_motivated(strategy, problem);
        if (NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation.new_root_strategy_possibly_activate_problem(strategy, problem);
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

    /**
     *
     *
     * @return booleanp; whether STRATEGY chose to activate PROBLEM.
     */
    @LispMethod(comment = "@return booleanp; whether STRATEGY chose to activate PROBLEM.")
    public static final SubLObject new_root_strategy_possibly_activate_problem_alt(SubLObject strategy, SubLObject problem) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation.new_root_strategy_chooses_not_to_examine_problemP(strategy, problem)) {
            return NIL;
        }
        inference_worker.determine_strategic_status_wrt(problem, strategy);
        if (NIL != com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation.new_root_strategy_chooses_not_to_activate_problemP(strategy, problem)) {
            return NIL;
        }
        {
            SubLObject activateP = makeBoolean((NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) && (NIL == com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation.new_root_strategy_chooses_not_to_activate_problemP(strategy, problem)));
            if (NIL != activateP) {
                com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation.new_root_strategy_activate_problem(strategy, problem);
                return T;
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

    public static final SubLObject new_root_strategy_chooses_not_to_examine_problemP_alt(SubLObject strategy, SubLObject problem) {
        return inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem);
    }

    public static SubLObject new_root_strategy_chooses_not_to_examine_problemP(final SubLObject strategy, final SubLObject problem) {
        return inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem);
    }

    public static final SubLObject new_root_strategy_chooses_not_to_activate_problemP_alt(SubLObject strategy, SubLObject problem) {
        return new_root_tactician_datastructures.new_root_strategy_problem_activeP(strategy, problem);
    }

    public static SubLObject new_root_strategy_chooses_not_to_activate_problemP(final SubLObject strategy, final SubLObject problem) {
        return new_root_tactician_datastructures.new_root_strategy_problem_activeP(strategy, problem);
    }

    public static final SubLObject new_root_strategy_activate_problem_alt(SubLObject strategy, SubLObject problem) {
        SubLTrampolineFile.checkType(strategy, NEW_ROOT_STRATEGY_P);
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return plusp(com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation.new_root_strategy_possibly_activate_strategems(strategy, problem));
    }

    public static SubLObject new_root_strategy_activate_problem(final SubLObject strategy, final SubLObject problem) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : "! new_root_tactician.new_root_strategy_p(strategy) " + ("new_root_tactician.new_root_strategy_p(strategy) " + "CommonSymbols.NIL != new_root_tactician.new_root_strategy_p(strategy) ") + strategy;
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return plusp(new_root_strategy_possibly_activate_strategems(strategy, problem));
    }

    public static final SubLObject new_root_strategy_possibly_activate_strategems_alt(SubLObject strategy, SubLObject problem) {
        new_root_tactician_datastructures.new_root_strategy_add_new_root(strategy, problem);
        return TWO_INTEGER;
    }

    public static SubLObject new_root_strategy_possibly_activate_strategems(final SubLObject strategy, final SubLObject problem) {
        new_root_tactician.new_root_strategy_add_new_root(strategy, problem);
        return TWO_INTEGER;
    }

    public static SubLObject new_root_strategy_nothing_to_doP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_problem.problem_has_no_tacticsP(problem);
    }

    public static SubLObject declare_new_root_tactician_motivation_file() {
        declareFunction("new_root_strategy_possibly_propagate_motivation_to_problem", "NEW-ROOT-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction("new_root_strategy_propagate_motivation_to_problem", "NEW-ROOT-STRATEGY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        declareFunction("new_root_strategy_possibly_activate_problem", "NEW-ROOT-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("new_root_strategy_chooses_not_to_examine_problemP", "NEW-ROOT-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
        declareFunction("new_root_strategy_chooses_not_to_activate_problemP", "NEW-ROOT-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
        declareFunction("new_root_strategy_activate_problem", "NEW-ROOT-STRATEGY-ACTIVATE-PROBLEM", 2, 0, false);
        declareFunction("new_root_strategy_possibly_activate_strategems", "NEW-ROOT-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS", 2, 0, false);
        declareFunction("new_root_strategy_nothing_to_doP", "NEW-ROOT-STRATEGY-NOTHING-TO-DO?", 2, 0, false);
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
