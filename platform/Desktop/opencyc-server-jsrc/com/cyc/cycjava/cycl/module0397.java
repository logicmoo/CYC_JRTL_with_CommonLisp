package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0397 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0397";
    public static final String myFingerPrint = "5e790f43d26ad4ebfdfd1575a5c0e560b4ce5a3bb5e0f33ef68f88291b59c681";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    
    public static SubLObject f28129(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0397.NIL != module0367.f24997(var1) && module0397.$ic0$ == module0367.f25035(var1));
    }
    
    public static SubLObject f28130(final SubLObject var2) {
        final SubLObject var3 = module0054.f3968();
        final SubLObject var4 = module0393.f27978(var3);
        module0367.f25070(var2, var4);
        return var2;
    }
    
    public static SubLObject f28131() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0397", "f28129", "S#29327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0397", "f28130", "S#31260", 1, 0, false);
        return (SubLObject)module0397.NIL;
    }
    
    public static SubLObject f28132() {
        return (SubLObject)module0397.NIL;
    }
    
    public static SubLObject f28133() {
        module0387.f27534((SubLObject)module0397.$ic0$, (SubLObject)module0397.$ic1$);
        module0012.f419((SubLObject)module0397.$ic2$);
        return (SubLObject)module0397.NIL;
    }
    
    public void declareFunctions() {
        f28131();
    }
    
    public void initializeVariables() {
        f28132();
    }
    
    public void runTopLevelForms() {
        f28133();
    }
    
    static {
        me = (SubLFile)new module0397();
        $ic0$ = SubLObjectFactory.makeKeyword("REMOVAL");
        $ic1$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("The REMOVAL Tactician"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("The REMOVAL Tactician needs no introduction."), SubLObjectFactory.makeKeyword("CONSTRUCTOR"), SubLObjectFactory.makeSymbol("S#31260", "CYC"), SubLObjectFactory.makeKeyword("DONE?"), SubLObjectFactory.makeSymbol("S#31247", "CYC"), SubLObjectFactory.makeKeyword("DO-ONE-STEP"), SubLObjectFactory.makeSymbol("S#31248", "CYC"), SubLObjectFactory.makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), SubLObjectFactory.makeSymbol("S#31212", "CYC"), SubLObjectFactory.makeKeyword("SELECT-BEST-STRATEGEM"), SubLObjectFactory.makeSymbol("S#31251", "CYC"), SubLObjectFactory.makeKeyword("EXECUTE-STRATEGEM"), SubLObjectFactory.makeSymbol("S#31253", "CYC"), SubLObjectFactory.makeKeyword("RECONSIDER-SET-ASIDES"), SubLObjectFactory.makeSymbol("S#31202", "CYC"), SubLObjectFactory.makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), SubLObjectFactory.makeSymbol("S#31199", "CYC"), SubLObjectFactory.makeKeyword("QUIESCE"), SubLObjectFactory.makeSymbol("S#31252", "CYC"), SubLObjectFactory.makeKeyword("NEW-TACTIC"), SubLObjectFactory.makeSymbol("S#31223", "CYC"), SubLObjectFactory.makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), SubLObjectFactory.makeSymbol("S#31145", "CYC"), SubLObjectFactory.makeKeyword("SPLIT-TACTICS-POSSIBLE"), SubLObjectFactory.makeSymbol("S#31224", "CYC"), SubLObjectFactory.makeKeyword("PROBLEM-COULD-BE-PENDING"), SubLObjectFactory.makeSymbol("S#31242", "CYC"), SubLObjectFactory.makeKeyword("PROBLEM-NOTHING-TO-DO?"), SubLObjectFactory.makeSymbol("S#31244", "CYC"), SubLObjectFactory.makeKeyword("THROW-AWAY-PROBLEM"), SubLObjectFactory.makeSymbol("S#31148", "CYC"), SubLObjectFactory.makeKeyword("SET-ASIDE-PROBLEM"), SubLObjectFactory.makeSymbol("S#31157", "CYC"), SubLObjectFactory.makeKeyword("THROW-AWAY-TACTIC"), SubLObjectFactory.makeSymbol("S#31152", "CYC"), SubLObjectFactory.makeKeyword("SET-ASIDE-TACTIC"), SubLObjectFactory.makeSymbol("S#31161", "CYC"), SubLObjectFactory.makeKeyword("NEW-ARGUMENT-LINK"), SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeKeyword("MOTIVATE-STRATEGEM"), SubLObjectFactory.makeSymbol("S#31211", "CYC"), SubLObjectFactory.makeKeyword("LINK-HEAD-MOTIVATED?"), SubLObjectFactory.makeSymbol("S#31115", "CYC"), SubLObjectFactory.makeKeyword("RECONSIDER-SPLIT-SET-ASIDES"), SubLObjectFactory.makeSymbol("S#31235", "CYC") });
        $ic2$ = SubLObjectFactory.makeSymbol("S#31260", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0397.class
	Total time: 57 ms
	
	Decompiled with Procyon 0.5.32.
*/