package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class abductive_tactician extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.abductive_tactician";
    public static final String myFingerPrint = "44d6c31da66b5582b1063bac339fbd1f5f5dc7b4da9cb197f71d47d668243c34";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abductive-tactician.lisp", position = 839L)
    public static SubLSymbol $abductive_strategy_type$;
    private static final SubLSymbol $kw0$ABDUCTIVE;
    private static final SubLList $list1;
    private static final SubLList $list2;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/abductive-tactician.lisp", position = 966L)
    public static SubLObject abductive_strategy_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(abductive_tactician.NIL != inference_datastructures_strategy.strategy_p(v_object) && abductive_tactician.NIL != list_utilities.member_eqP(inference_datastructures_strategy.strategy_type(v_object), (SubLObject)abductive_tactician.$list1));
    }
    
    public static SubLObject declare_abductive_tactician_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.abductive_tactician", "abductive_strategy_p", "ABDUCTIVE-STRATEGY-P", 1, 0, false);
        return (SubLObject)abductive_tactician.NIL;
    }
    
    public static SubLObject init_abductive_tactician_file() {
        abductive_tactician.$abductive_strategy_type$ = SubLFiles.defvar("*ABDUCTIVE-STRATEGY-TYPE*", (SubLObject)abductive_tactician.$kw0$ABDUCTIVE);
        return (SubLObject)abductive_tactician.NIL;
    }
    
    public static SubLObject setup_abductive_tactician_file() {
        inference_tactician.inference_strategy_type((SubLObject)abductive_tactician.$kw0$ABDUCTIVE, (SubLObject)abductive_tactician.$list2);
        return (SubLObject)abductive_tactician.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_abductive_tactician_file();
    }
    
    @Override
	public void initializeVariables() {
        init_abductive_tactician_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_abductive_tactician_file();
    }
    
    static {
        me = (SubLFile)new abductive_tactician();
        abductive_tactician.$abductive_strategy_type$ = null;
        $kw0$ABDUCTIVE = SubLObjectFactory.makeKeyword("ABDUCTIVE");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABDUCTIVE"));
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Abductive Tactician"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("A balancing tactician type subclassed to handle abduction."), SubLObjectFactory.makeKeyword("CONSTRUCTOR"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-INITIALIZE"), SubLObjectFactory.makeKeyword("DONE?"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-DONE?"), SubLObjectFactory.makeKeyword("DO-ONE-STEP"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-DO-ONE-STEP"), SubLObjectFactory.makeKeyword("INITIAL-RELEVANT-STRATEGIES"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES"), SubLObjectFactory.makeKeyword("INITIALIZE-PROPERTIES"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-INITIALIZE-PROPERTIES"), SubLObjectFactory.makeKeyword("UPDATE-PROPERTIES"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-UPDATE-PROPERTIES"), SubLObjectFactory.makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), SubLObjectFactory.makeKeyword("CONTINUATION-POSSIBLE?"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?"), SubLObjectFactory.makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES"), SubLObjectFactory.makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM"), SubLObjectFactory.makeKeyword("THROW-AWAY-PROBLEM"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-PROBLEM?"), SubLObjectFactory.makeKeyword("SET-ASIDE-PROBLEM"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-PROBLEM?"), SubLObjectFactory.makeKeyword("THROW-AWAY-TACTIC"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?"), SubLObjectFactory.makeKeyword("SET-ASIDE-TACTIC"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?"), SubLObjectFactory.makeKeyword("NEW-ARGUMENT-LINK"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK"), SubLObjectFactory.makeKeyword("NEW-TACTIC"), SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeKeyword("SPLIT-TACTICS-POSSIBLE"), SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeKeyword("PROBLEM-COULD-BE-PENDING"), SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeKeyword("LINK-HEAD-MOTIVATED?"), SubLObjectFactory.makeSymbol("FALSE"), SubLObjectFactory.makeKeyword("PROBLEM-NOTHING-TO-DO?"), SubLObjectFactory.makeSymbol("FALSE"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), SubLObjectFactory.makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE") });
    }
}

/*

	Total time: 119 ms
	
*/