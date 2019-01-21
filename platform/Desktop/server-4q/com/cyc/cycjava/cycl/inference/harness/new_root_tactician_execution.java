package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class new_root_tactician_execution extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution";
    public static final String myFingerPrint = "efeacddaa0ba19fbb3b70c4d5b17cac684f442c33029a0107cb5e55e30d90fd8";
    private static final SubLSymbol $sym0$NEW_ROOT_STRATEGY_DONE_;
    private static final SubLSymbol $kw1$UNINTERESTING;
    private static final SubLSymbol $kw2$DONE;
    private static final SubLSymbol $sym3$NEW_ROOT_STRATEGY_SELECT_BEST_STRATEGEM;
    private static final SubLSymbol $sym4$NEW_ROOT_STRATEGY_PEEK_NEXT_STRATEGEM;
    private static final SubLSymbol $sym5$NEW_ROOT_STRATEGY_P;
    private static final SubLSymbol $sym6$STRATEGEM_P;
    private static final SubLSymbol $kw7$INTERESTING;
    private static final SubLString $str8$_S_was_an_unexpected_strategem;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 906L)
    public static SubLObject new_root_strategy_doneP(final SubLObject strategy) {
        return (SubLObject)SubLObjectFactory.makeBoolean(new_root_tactician_execution.NIL != new_root_tactician_datastructures.new_root_strategy_no_new_rootsP(strategy) && new_root_tactician_execution.NIL == inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 1169L)
    public static SubLObject new_root_strategy_do_one_step(final SubLObject strategy) {
        SubLObject result;
        for (result = (SubLObject)new_root_tactician_execution.$kw1$UNINTERESTING; new_root_tactician_execution.$kw1$UNINTERESTING == result; result = new_root_strategy_do_one_step_int(strategy)) {}
        return Equality.eq((SubLObject)new_root_tactician_execution.$kw2$DONE, result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 1398L)
    public static SubLObject new_root_strategy_do_one_step_int(final SubLObject strategy) {
        SubLObject result = (SubLObject)new_root_tactician_execution.NIL;
        if (new_root_tactician_execution.NIL != inference_tactician.strategy_doneP(strategy)) {
            result = (SubLObject)new_root_tactician_execution.$kw2$DONE;
        }
        else {
            final SubLObject strategem = new_root_strategy_select_best_strategem(strategy);
            if (new_root_tactician_execution.NIL != strategem) {
                result = inference_tactician.strategy_execute_strategem(strategy, strategem);
            }
            else {
                result = (SubLObject)new_root_tactician_execution.$kw2$DONE;
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 2038L)
    public static SubLObject new_root_strategy_select_best_strategem(final SubLObject strategy) {
        return new_root_strategy_select_best_strategem_int(strategy, (SubLObject)new_root_tactician_execution.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 2204L)
    public static SubLObject new_root_strategy_peek_next_strategem(final SubLObject strategy) {
        return new_root_strategy_select_best_strategem_int(strategy, (SubLObject)new_root_tactician_execution.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 2346L)
    public static SubLObject new_root_strategy_select_best_strategem_int(final SubLObject strategy, final SubLObject popP) {
        new_root_strategy_quiesce(strategy);
        if (new_root_tactician_execution.NIL == new_root_tactician_datastructures.new_root_strategy_no_new_rootsP(strategy)) {
            return (new_root_tactician_execution.NIL != popP) ? new_root_tactician_datastructures.new_root_strategy_pop_new_root(strategy) : new_root_tactician.new_root_strategy_peek_new_root(strategy);
        }
        if (new_root_tactician_execution.NIL != inference_datastructures_strategy.strategy_should_propagate_answer_linkP(strategy)) {
            return inference_datastructures_strategy.strategy_answer_link(strategy);
        }
        return (SubLObject)new_root_tactician_execution.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 2830L)
    public static SubLObject new_root_strategy_quiesce(final SubLObject strategy) {
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/new-root-tactician-execution.lisp", position = 3013L)
    public static SubLObject new_root_strategy_execute_strategem(final SubLObject strategy, final SubLObject strategem) {
        assert new_root_tactician_execution.NIL != new_root_tactician.new_root_strategy_p(strategy) : strategy;
        assert new_root_tactician_execution.NIL != inference_tactician.strategem_p(strategem) : strategem;
        SubLObject result = (SubLObject)new_root_tactician_execution.$kw1$UNINTERESTING;
        if (new_root_tactician_execution.NIL != inference_datastructures_problem.problem_p(strategem)) {
            result = (SubLObject)new_root_tactician_execution.$kw7$INTERESTING;
        }
        else {
            if (new_root_tactician_execution.NIL == inference_worker_answer.answer_link_p(strategem)) {
                return Errors.error((SubLObject)new_root_tactician_execution.$str8$_S_was_an_unexpected_strategem, strategem);
            }
            final SubLObject root_problem = inference_worker_answer.answer_link_supporting_problem(strategem);
            new_root_tactician_motivation.new_root_strategy_possibly_propagate_motivation_to_problem(strategy, root_problem);
            inference_worker.possibly_propagate_answer_link(strategem);
            result = (SubLObject)new_root_tactician_execution.$kw7$INTERESTING;
        }
        return result;
    }
    
    public static SubLObject declare_new_root_tactician_execution_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution", "new_root_strategy_doneP", "NEW-ROOT-STRATEGY-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution", "new_root_strategy_do_one_step", "NEW-ROOT-STRATEGY-DO-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution", "new_root_strategy_do_one_step_int", "NEW-ROOT-STRATEGY-DO-ONE-STEP-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution", "new_root_strategy_select_best_strategem", "NEW-ROOT-STRATEGY-SELECT-BEST-STRATEGEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution", "new_root_strategy_peek_next_strategem", "NEW-ROOT-STRATEGY-PEEK-NEXT-STRATEGEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution", "new_root_strategy_select_best_strategem_int", "NEW-ROOT-STRATEGY-SELECT-BEST-STRATEGEM-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution", "new_root_strategy_quiesce", "NEW-ROOT-STRATEGY-QUIESCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.new_root_tactician_execution", "new_root_strategy_execute_strategem", "NEW-ROOT-STRATEGY-EXECUTE-STRATEGEM", 2, 0, false);
        return (SubLObject)new_root_tactician_execution.NIL;
    }
    
    public static SubLObject init_new_root_tactician_execution_file() {
        return (SubLObject)new_root_tactician_execution.NIL;
    }
    
    public static SubLObject setup_new_root_tactician_execution_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)new_root_tactician_execution.$sym0$NEW_ROOT_STRATEGY_DONE_);
        utilities_macros.note_funcall_helper_function((SubLObject)new_root_tactician_execution.$sym3$NEW_ROOT_STRATEGY_SELECT_BEST_STRATEGEM);
        utilities_macros.note_funcall_helper_function((SubLObject)new_root_tactician_execution.$sym4$NEW_ROOT_STRATEGY_PEEK_NEXT_STRATEGEM);
        return (SubLObject)new_root_tactician_execution.NIL;
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
        me = (SubLFile)new new_root_tactician_execution();
        $sym0$NEW_ROOT_STRATEGY_DONE_ = SubLObjectFactory.makeSymbol("NEW-ROOT-STRATEGY-DONE?");
        $kw1$UNINTERESTING = SubLObjectFactory.makeKeyword("UNINTERESTING");
        $kw2$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym3$NEW_ROOT_STRATEGY_SELECT_BEST_STRATEGEM = SubLObjectFactory.makeSymbol("NEW-ROOT-STRATEGY-SELECT-BEST-STRATEGEM");
        $sym4$NEW_ROOT_STRATEGY_PEEK_NEXT_STRATEGEM = SubLObjectFactory.makeSymbol("NEW-ROOT-STRATEGY-PEEK-NEXT-STRATEGEM");
        $sym5$NEW_ROOT_STRATEGY_P = SubLObjectFactory.makeSymbol("NEW-ROOT-STRATEGY-P");
        $sym6$STRATEGEM_P = SubLObjectFactory.makeSymbol("STRATEGEM-P");
        $kw7$INTERESTING = SubLObjectFactory.makeKeyword("INTERESTING");
        $str8$_S_was_an_unexpected_strategem = SubLObjectFactory.makeString("~S was an unexpected strategem");
    }
}

/*

	Total time: 33 ms
	
*/