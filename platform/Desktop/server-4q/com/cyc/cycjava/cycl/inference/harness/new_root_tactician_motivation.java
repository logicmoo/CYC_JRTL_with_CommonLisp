package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class new_root_tactician_motivation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation";
    public static final String myFingerPrint = "f1d826354f643db13887ef1320e31447a0d5c7f152ed02a417adf7391e25a2bc";
    private static final SubLSymbol $sym0$PROBLEM_P;
    private static final SubLSymbol $sym1$NEW_ROOT_STRATEGY_P;
    private static final SubLSymbol $sym2$NEW_ROOT_STRATEGY_NOTHING_TO_DO_;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 1040L)
    public static SubLObject new_root_strategy_possibly_propagate_motivation_to_problem(final SubLObject strategy, final SubLObject problem) {
        assert new_root_tactician_motivation.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        final SubLObject already_motivatedP = inference_datastructures_strategy.problem_motivatedP(problem, strategy);
        if (new_root_tactician_motivation.NIL == already_motivatedP) {
            new_root_strategy_propagate_motivation_to_problem(strategy, problem);
            return (SubLObject)new_root_tactician_motivation.T;
        }
        return (SubLObject)new_root_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 1497L)
    public static SubLObject new_root_strategy_propagate_motivation_to_problem(final SubLObject strategy, final SubLObject problem) {
        new_root_tactician_datastructures.new_root_strategy_note_problem_motivated(strategy, problem);
        if (new_root_tactician_motivation.NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy)) {
            new_root_strategy_possibly_activate_problem(strategy, problem);
        }
        return (SubLObject)new_root_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 1844L)
    public static SubLObject new_root_strategy_possibly_activate_problem(final SubLObject strategy, final SubLObject problem) {
        if (new_root_tactician_motivation.NIL != new_root_strategy_chooses_not_to_examine_problemP(strategy, problem)) {
            return (SubLObject)new_root_tactician_motivation.NIL;
        }
        inference_worker.determine_strategic_status_wrt(problem, strategy);
        if (new_root_tactician_motivation.NIL != new_root_strategy_chooses_not_to_activate_problemP(strategy, problem)) {
            return (SubLObject)new_root_tactician_motivation.NIL;
        }
        final SubLObject activateP = (SubLObject)SubLObjectFactory.makeBoolean(new_root_tactician_motivation.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy) && new_root_tactician_motivation.NIL == new_root_strategy_chooses_not_to_activate_problemP(strategy, problem));
        if (new_root_tactician_motivation.NIL != activateP) {
            new_root_strategy_activate_problem(strategy, problem);
            return (SubLObject)new_root_tactician_motivation.T;
        }
        return (SubLObject)new_root_tactician_motivation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 3044L)
    public static SubLObject new_root_strategy_chooses_not_to_examine_problemP(final SubLObject strategy, final SubLObject problem) {
        return inference_tactician_strategic_uninterestingness.strategy_deems_problem_tactically_uninterestingP(strategy, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 3296L)
    public static SubLObject new_root_strategy_chooses_not_to_activate_problemP(final SubLObject strategy, final SubLObject problem) {
        return new_root_tactician_datastructures.new_root_strategy_problem_activeP(strategy, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 3445L)
    public static SubLObject new_root_strategy_activate_problem(final SubLObject strategy, final SubLObject problem) {
        assert new_root_tactician_motivation.NIL != new_root_tactician.new_root_strategy_p(strategy) : strategy;
        assert new_root_tactician_motivation.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return Numbers.plusp(new_root_strategy_possibly_activate_strategems(strategy, problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 3676L)
    public static SubLObject new_root_strategy_possibly_activate_strategems(final SubLObject strategy, final SubLObject problem) {
        new_root_tactician.new_root_strategy_add_new_root(strategy, problem);
        return (SubLObject)new_root_tactician_motivation.TWO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-motivation.lisp", position = 3880L)
    public static SubLObject new_root_strategy_nothing_to_doP(final SubLObject strategy, final SubLObject problem) {
        return inference_datastructures_problem.problem_has_no_tacticsP(problem);
    }
    
    public static SubLObject declare_new_root_tactician_motivation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation", "new_root_strategy_possibly_propagate_motivation_to_problem", "NEW-ROOT-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation", "new_root_strategy_propagate_motivation_to_problem", "NEW-ROOT-STRATEGY-PROPAGATE-MOTIVATION-TO-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation", "new_root_strategy_possibly_activate_problem", "NEW-ROOT-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation", "new_root_strategy_chooses_not_to_examine_problemP", "NEW-ROOT-STRATEGY-CHOOSES-NOT-TO-EXAMINE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation", "new_root_strategy_chooses_not_to_activate_problemP", "NEW-ROOT-STRATEGY-CHOOSES-NOT-TO-ACTIVATE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation", "new_root_strategy_activate_problem", "NEW-ROOT-STRATEGY-ACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation", "new_root_strategy_possibly_activate_strategems", "NEW-ROOT-STRATEGY-POSSIBLY-ACTIVATE-STRATEGEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_motivation", "new_root_strategy_nothing_to_doP", "NEW-ROOT-STRATEGY-NOTHING-TO-DO?", 2, 0, false);
        return (SubLObject)new_root_tactician_motivation.NIL;
    }
    
    public static SubLObject init_new_root_tactician_motivation_file() {
        return (SubLObject)new_root_tactician_motivation.NIL;
    }
    
    public static SubLObject setup_new_root_tactician_motivation_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)new_root_tactician_motivation.$sym2$NEW_ROOT_STRATEGY_NOTHING_TO_DO_);
        return (SubLObject)new_root_tactician_motivation.NIL;
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
        me = (SubLFile)new new_root_tactician_motivation();
        $sym0$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $sym1$NEW_ROOT_STRATEGY_P = SubLObjectFactory.makeSymbol("NEW-ROOT-STRATEGY-P");
        $sym2$NEW_ROOT_STRATEGY_NOTHING_TO_DO_ = SubLObjectFactory.makeSymbol("NEW-ROOT-STRATEGY-NOTHING-TO-DO?");
    }
}

/*

	Total time: 30 ms
	
*/