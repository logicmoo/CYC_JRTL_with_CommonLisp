package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return (SubLObject)makeBoolean(NIL != module0367.f24997(var1) && $ic0$ == module0367.f25035(var1));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28132() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28133() {
        module0387.f27534((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0012.f419((SubLObject)$ic2$);
        return (SubLObject)NIL;
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
        $ic0$ = makeKeyword("REMOVAL");
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("The REMOVAL Tactician"), makeKeyword("COMMENT"), makeString("The REMOVAL Tactician needs no introduction."), makeKeyword("CONSTRUCTOR"), makeSymbol("S#31260", "CYC"), makeKeyword("DONE?"), makeSymbol("S#31247", "CYC"), makeKeyword("DO-ONE-STEP"), makeSymbol("S#31248", "CYC"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("S#31212", "CYC"), makeKeyword("SELECT-BEST-STRATEGEM"), makeSymbol("S#31251", "CYC"), makeKeyword("EXECUTE-STRATEGEM"), makeSymbol("S#31253", "CYC"), makeKeyword("RECONSIDER-SET-ASIDES"), makeSymbol("S#31202", "CYC"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("S#31199", "CYC"), makeKeyword("QUIESCE"), makeSymbol("S#31252", "CYC"), makeKeyword("NEW-TACTIC"), makeSymbol("S#31223", "CYC"), makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeSymbol("S#31145", "CYC"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("S#31224", "CYC"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("S#31242", "CYC"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("S#31244", "CYC"), makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("S#31148", "CYC"), makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("S#31157", "CYC"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("S#31152", "CYC"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("S#31161", "CYC"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("IGNORE"), makeKeyword("MOTIVATE-STRATEGEM"), makeSymbol("S#31211", "CYC"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("S#31115", "CYC"), makeKeyword("RECONSIDER-SPLIT-SET-ASIDES"), makeSymbol("S#31235", "CYC") });
        $ic2$ = makeSymbol("S#31260", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 57 ms
	
	Decompiled with Procyon 0.5.32.
*/