package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0392 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0392";
    public static final String myFingerPrint = "44d6c31da66b5582b1063bac339fbd1f5f5dc7b4da9cb197f71d47d668243c34";
    public static SubLSymbol $g3281$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    
    public static SubLObject f27957(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0392.NIL != module0367.f24997(var1) && module0392.NIL != module0035.f2169(module0367.f25035(var1), (SubLObject)module0392.$ic1$));
    }
    
    public static SubLObject f27958() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0392", "f27957", "S#29937", 1, 0, false);
        return (SubLObject)module0392.NIL;
    }
    
    public static SubLObject f27959() {
        module0392.$g3281$ = SubLFiles.defvar("S#31089", (SubLObject)module0392.$ic0$);
        return (SubLObject)module0392.NIL;
    }
    
    public static SubLObject f27960() {
        module0387.f27534((SubLObject)module0392.$ic0$, (SubLObject)module0392.$ic2$);
        return (SubLObject)module0392.NIL;
    }
    
    public void declareFunctions() {
        f27958();
    }
    
    public void initializeVariables() {
        f27959();
    }
    
    public void runTopLevelForms() {
        f27960();
    }
    
    static {
        me = (SubLFile)new module0392();
        module0392.$g3281$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("ABDUCTIVE");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABDUCTIVE"));
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Abductive Tactician"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("A balancing tactician type subclassed to handle abduction."), SubLObjectFactory.makeKeyword("CONSTRUCTOR"), SubLObjectFactory.makeSymbol("S#30825", "CYC"), SubLObjectFactory.makeKeyword("DONE?"), SubLObjectFactory.makeSymbol("S#30837", "CYC"), SubLObjectFactory.makeKeyword("DO-ONE-STEP"), SubLObjectFactory.makeSymbol("S#30838", "CYC"), SubLObjectFactory.makeKeyword("INITIAL-RELEVANT-STRATEGIES"), SubLObjectFactory.makeSymbol("S#30852", "CYC"), SubLObjectFactory.makeKeyword("INITIALIZE-PROPERTIES"), SubLObjectFactory.makeSymbol("S#30850", "CYC"), SubLObjectFactory.makeKeyword("UPDATE-PROPERTIES"), SubLObjectFactory.makeSymbol("S#30851", "CYC"), SubLObjectFactory.makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), SubLObjectFactory.makeSymbol("S#30849", "CYC"), SubLObjectFactory.makeKeyword("CONTINUATION-POSSIBLE?"), SubLObjectFactory.makeSymbol("S#30843", "CYC"), SubLObjectFactory.makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), SubLObjectFactory.makeSymbol("S#30848", "CYC"), SubLObjectFactory.makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeSymbol("S#30861", "CYC"), SubLObjectFactory.makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), SubLObjectFactory.makeSymbol("S#30853", "CYC"), SubLObjectFactory.makeKeyword("THROW-AWAY-PROBLEM"), SubLObjectFactory.makeSymbol("S#30844", "CYC"), SubLObjectFactory.makeKeyword("SET-ASIDE-PROBLEM"), SubLObjectFactory.makeSymbol("S#30845", "CYC"), SubLObjectFactory.makeKeyword("THROW-AWAY-TACTIC"), SubLObjectFactory.makeSymbol("S#30846", "CYC"), SubLObjectFactory.makeKeyword("SET-ASIDE-TACTIC"), SubLObjectFactory.makeSymbol("S#30847", "CYC"), SubLObjectFactory.makeKeyword("NEW-ARGUMENT-LINK"), SubLObjectFactory.makeSymbol("S#30860", "CYC"), SubLObjectFactory.makeKeyword("NEW-TACTIC"), SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeKeyword("SPLIT-TACTICS-POSSIBLE"), SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeKeyword("PROBLEM-COULD-BE-PENDING"), SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeKeyword("LINK-HEAD-MOTIVATED?"), SubLObjectFactory.makeSymbol("FALSE"), SubLObjectFactory.makeKeyword("PROBLEM-NOTHING-TO-DO?"), SubLObjectFactory.makeSymbol("FALSE"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), SubLObjectFactory.makeSymbol("S#30862", "CYC"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), SubLObjectFactory.makeSymbol("S#30877", "CYC"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), SubLObjectFactory.makeSymbol("S#30876", "CYC"), SubLObjectFactory.makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), SubLObjectFactory.makeSymbol("S#30878", "CYC") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0392.class
	Total time: 48 ms
	
	Decompiled with Procyon 0.5.32.
*/