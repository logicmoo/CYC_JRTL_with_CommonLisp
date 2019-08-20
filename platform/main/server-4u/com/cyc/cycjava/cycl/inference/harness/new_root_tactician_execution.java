/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class new_root_tactician_execution extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new new_root_tactician_execution();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$NEW_ROOT_STRATEGY_DONE_ = makeSymbol("NEW-ROOT-STRATEGY-DONE?");

    private static final SubLSymbol NEW_ROOT_STRATEGY_SELECT_BEST_STRATEGEM = makeSymbol("NEW-ROOT-STRATEGY-SELECT-BEST-STRATEGEM");

    private static final SubLSymbol NEW_ROOT_STRATEGY_PEEK_NEXT_STRATEGEM = makeSymbol("NEW-ROOT-STRATEGY-PEEK-NEXT-STRATEGEM");

    private static final SubLSymbol NEW_ROOT_STRATEGY_P = makeSymbol("NEW-ROOT-STRATEGY-P");

    static private final SubLString $str8$_S_was_an_unexpected_strategem = makeString("~S was an unexpected strategem");

    // Definitions
    public static final SubLObject new_root_strategy_doneP_alt(SubLObject strategy) {
        return makeBoolean((NIL != new_root_tactician_datastructures.new_root_strategy_no_new_rootsP(strategy)) && (NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)));
    }

    // Definitions
    public static SubLObject new_root_strategy_doneP(final SubLObject strategy) {
        return makeBoolean((NIL != new_root_tactician_datastructures.new_root_strategy_no_new_rootsP(strategy)) && (NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)));
    }

    public static final SubLObject new_root_strategy_do_one_step_alt(SubLObject strategy) {
        {
            SubLObject result = $UNINTERESTING;
            while ($UNINTERESTING == result) {
                result = com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution.new_root_strategy_do_one_step_int(strategy);
            } 
            return eq($DONE, result);
        }
    }

    public static SubLObject new_root_strategy_do_one_step(final SubLObject strategy) {
        SubLObject result;
        for (result = $UNINTERESTING; $UNINTERESTING == result; result = new_root_strategy_do_one_step_int(strategy)) {
        }
        return eq($DONE, result);
    }

    /**
     *
     *
     * @return one of (:done :interesting, :uninteresting)
     */
    @LispMethod(comment = "@return one of (:done :interesting, :uninteresting)")
    public static final SubLObject new_root_strategy_do_one_step_int_alt(SubLObject strategy) {
        {
            SubLObject result = NIL;
            if (NIL != inference_tactician.strategy_doneP(strategy)) {
                result = $DONE;
            } else {
                {
                    SubLObject strategem = com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution.new_root_strategy_select_best_strategem(strategy);
                    if (NIL != strategem) {
                        result = com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution.new_root_strategy_execute_strategem(strategy, strategem);
                    } else {
                        result = $DONE;
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
    public static SubLObject new_root_strategy_do_one_step_int(final SubLObject strategy) {
        SubLObject result = NIL;
        if (NIL != inference_tactician.strategy_doneP(strategy)) {
            result = $DONE;
        } else {
            final SubLObject strategem = new_root_strategy_select_best_strategem(strategy);
            if (NIL != strategem) {
                result = inference_tactician.strategy_execute_strategem(strategy, strategem);
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
     */
    @LispMethod(comment = "@return strategem-p")
    public static final SubLObject new_root_strategy_select_best_strategem_alt(SubLObject strategy) {
        return com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution.new_root_strategy_select_best_strategem_int(strategy, T);
    }

    /**
     *
     *
     * @return strategem-p
     */
    @LispMethod(comment = "@return strategem-p")
    public static SubLObject new_root_strategy_select_best_strategem(final SubLObject strategy) {
        return new_root_strategy_select_best_strategem_int(strategy, T);
    }

    public static final SubLObject new_root_strategy_peek_next_strategem_alt(SubLObject strategy) {
        return com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution.new_root_strategy_select_best_strategem_int(strategy, NIL);
    }

    public static SubLObject new_root_strategy_peek_next_strategem(final SubLObject strategy) {
        return new_root_strategy_select_best_strategem_int(strategy, NIL);
    }

    public static final SubLObject new_root_strategy_select_best_strategem_int_alt(SubLObject strategy, SubLObject popP) {
        com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution.new_root_strategy_quiesce(strategy);
        if (NIL == new_root_tactician_datastructures.new_root_strategy_no_new_rootsP(strategy)) {
            return NIL != popP ? ((SubLObject) (new_root_tactician_datastructures.new_root_strategy_pop_new_root(strategy))) : new_root_tactician_datastructures.new_root_strategy_peek_new_root(strategy);
        }
        if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
            return inference_datastructures_strategy.strategy_answer_link(strategy);
        }
        return NIL;
    }

    public static SubLObject new_root_strategy_select_best_strategem_int(final SubLObject strategy, final SubLObject popP) {
        new_root_strategy_quiesce(strategy);
        if (NIL == new_root_tactician_datastructures.new_root_strategy_no_new_rootsP(strategy)) {
            return NIL != popP ? new_root_tactician_datastructures.new_root_strategy_pop_new_root(strategy) : new_root_tactician.new_root_strategy_peek_new_root(strategy);
        }
        if (NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
            return inference_datastructures_strategy.strategy_answer_link(strategy);
        }
        return NIL;
    }

    public static final SubLObject new_root_strategy_quiesce_alt(SubLObject strategy) {
        return strategy;
    }

    public static SubLObject new_root_strategy_quiesce(final SubLObject strategy) {
        return strategy;
    }

    /**
     *
     *
     * @return one of (:interesting, :uninteresting)
     */
    @LispMethod(comment = "@return one of (:interesting, :uninteresting)")
    public static final SubLObject new_root_strategy_execute_strategem_alt(SubLObject strategy, SubLObject strategem) {
        SubLTrampolineFile.checkType(strategy, NEW_ROOT_STRATEGY_P);
        SubLTrampolineFile.checkType(strategem, STRATEGEM_P);
        {
            SubLObject result = $UNINTERESTING;
            if (NIL != inference_datastructures_problem.problem_p(strategem)) {
                result = $INTERESTING;
            } else {
                if (NIL != inference_worker_answer.answer_link_p(strategem)) {
                    {
                        SubLObject answer_link = strategem;
                        SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
                        new_root_tactician_motivation.new_root_strategy_possibly_propagate_motivation_to_problem(strategy, root_problem);
                        inference_worker.possibly_propagate_answer_link(answer_link);
                        result = $INTERESTING;
                    }
                } else {
                    return Errors.error($str_alt8$_S_was_an_unexpected_strategem, strategem);
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @return one of (:interesting, :uninteresting)
     */
    @LispMethod(comment = "@return one of (:interesting, :uninteresting)")
    public static SubLObject new_root_strategy_execute_strategem(final SubLObject strategy, final SubLObject strategem) {
        assert NIL != new_root_tactician.new_root_strategy_p(strategy) : "! new_root_tactician.new_root_strategy_p(strategy) " + ("new_root_tactician.new_root_strategy_p(strategy) " + "CommonSymbols.NIL != new_root_tactician.new_root_strategy_p(strategy) ") + strategy;
        assert NIL != inference_tactician.strategem_p(strategem) : "! inference_tactician.strategem_p(strategem) " + ("inference_tactician.strategem_p(strategem) " + "CommonSymbols.NIL != inference_tactician.strategem_p(strategem) ") + strategem;
        SubLObject result = $UNINTERESTING;
        if (NIL != inference_datastructures_problem.problem_p(strategem)) {
            result = $INTERESTING;
        } else {
            if (NIL == inference_worker_answer.answer_link_p(strategem)) {
                return Errors.error($str8$_S_was_an_unexpected_strategem, strategem);
            }
            final SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(strategem);
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
        note_funcall_helper_function($sym0$NEW_ROOT_STRATEGY_DONE_);
        note_funcall_helper_function(NEW_ROOT_STRATEGY_SELECT_BEST_STRATEGEM);
        note_funcall_helper_function(NEW_ROOT_STRATEGY_PEEK_NEXT_STRATEGEM);
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
    }

    static private final SubLString $str_alt8$_S_was_an_unexpected_strategem = makeString("~S was an unexpected strategem");
}

/**
 * Total time: 33 ms
 */
