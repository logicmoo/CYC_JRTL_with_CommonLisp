package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_tactician extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.removal_tactician";
    public static final String myFingerPrint = "b18065b17f747e85484ef1e15647b3555122545603621e4fcd7addc77defe05a";
    private static final SubLSymbol $kw0$REMOVAL;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$REMOVAL_STRATEGY_INITIALIZE;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician.lisp", position = 2766L)
    public static SubLObject removal_strategy_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_tactician.NIL != inference_datastructures_strategy.strategy_p(v_object) && removal_tactician.$kw0$REMOVAL == inference_datastructures_strategy.strategy_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-tactician.lisp", position = 2964L)
    public static SubLObject removal_strategy_initialize(final SubLObject strategy) {
        final SubLObject removal_index = stacks.create_stack();
        final SubLObject data = removal_tactician_datastructures.new_removal_strategy_data(removal_index);
        inference_datastructures_strategy.set_strategy_data(strategy, data);
        return strategy;
    }
    
    public static SubLObject declare_removal_tactician_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician", "removal_strategy_p", "REMOVAL-STRATEGY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.removal_tactician", "removal_strategy_initialize", "REMOVAL-STRATEGY-INITIALIZE", 1, 0, false);
        return (SubLObject)removal_tactician.NIL;
    }
    
    public static SubLObject init_removal_tactician_file() {
        return (SubLObject)removal_tactician.NIL;
    }
    
    public static SubLObject setup_removal_tactician_file() {
        inference_tactician.inference_strategy_type((SubLObject)removal_tactician.$kw0$REMOVAL, (SubLObject)removal_tactician.$list1);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_tactician.$sym2$REMOVAL_STRATEGY_INITIALIZE);
        return (SubLObject)removal_tactician.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_tactician_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_tactician_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_tactician_file();
    }
    
    static {
        me = (SubLFile)new removal_tactician();
        $kw0$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("The REMOVAL Tactician"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("The REMOVAL Tactician needs no introduction."), SubLObjectFactory.makeKeyword("CONSTRUCTOR"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-INITIALIZE"), SubLObjectFactory.makeKeyword("DONE?"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-DONE?"), SubLObjectFactory.makeKeyword("DO-ONE-STEP"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-DO-ONE-STEP"), SubLObjectFactory.makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM"), SubLObjectFactory.makeKeyword("SELECT-BEST-STRATEGEM"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM"), SubLObjectFactory.makeKeyword("EXECUTE-STRATEGEM"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-EXECUTE-STRATEGEM"), SubLObjectFactory.makeKeyword("RECONSIDER-SET-ASIDES"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-RECONSIDER-SET-ASIDES"), SubLObjectFactory.makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES"), SubLObjectFactory.makeKeyword("QUIESCE"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-QUIESCE"), SubLObjectFactory.makeKeyword("NEW-TACTIC"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-NOTE-NEW-TACTIC"), SubLObjectFactory.makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-CATEGORIZE-STRATEGEMS"), SubLObjectFactory.makeKeyword("SPLIT-TACTICS-POSSIBLE"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE"), SubLObjectFactory.makeKeyword("PROBLEM-COULD-BE-PENDING"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING"), SubLObjectFactory.makeKeyword("PROBLEM-NOTHING-TO-DO?"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-PROBLEM-NOTHING-TO-DO?"), SubLObjectFactory.makeKeyword("THROW-AWAY-PROBLEM"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-PROBLEM?"), SubLObjectFactory.makeKeyword("SET-ASIDE-PROBLEM"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-PROBLEM?"), SubLObjectFactory.makeKeyword("THROW-AWAY-TACTIC"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-CHOOSES-TO-THROW-AWAY-TACTIC?"), SubLObjectFactory.makeKeyword("SET-ASIDE-TACTIC"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-CHOOSES-TO-SET-ASIDE-TACTIC?"), SubLObjectFactory.makeKeyword("NEW-ARGUMENT-LINK"), SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeKeyword("MOTIVATE-STRATEGEM"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-POSSIBLY-PROPAGATE-MOTIVATION-TO-PROBLEM"), SubLObjectFactory.makeKeyword("LINK-HEAD-MOTIVATED?"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-LINK-HEAD-MOTIVATED?"), SubLObjectFactory.makeKeyword("RECONSIDER-SPLIT-SET-ASIDES"), SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-POSSIBLY-RECONSIDER-SPLIT-SET-ASIDES") });
        $sym2$REMOVAL_STRATEGY_INITIALIZE = SubLObjectFactory.makeSymbol("REMOVAL-STRATEGY-INITIALIZE");
    }
}

/*

	Total time: 16 ms
	
*/