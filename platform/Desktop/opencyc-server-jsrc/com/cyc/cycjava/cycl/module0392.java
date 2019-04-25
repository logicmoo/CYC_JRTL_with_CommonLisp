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
        return (SubLObject)makeBoolean(NIL != module0367.f24997(var1) && NIL != module0035.f2169(module0367.f25035(var1), (SubLObject)$ic1$));
    }
    
    public static SubLObject f27958() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0392", "f27957", "S#29937", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27959() {
        $g3281$ = SubLFiles.defvar("S#31089", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27960() {
        module0387.f27534((SubLObject)$ic0$, (SubLObject)$ic2$);
        return (SubLObject)NIL;
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
        $g3281$ = null;
        $ic0$ = makeKeyword("ABDUCTIVE");
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("ABDUCTIVE"));
        $ic2$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeString("Abductive Tactician"), makeKeyword("COMMENT"), makeString("A balancing tactician type subclassed to handle abduction."), makeKeyword("CONSTRUCTOR"), makeSymbol("S#30825", "CYC"), makeKeyword("DONE?"), makeSymbol("S#30837", "CYC"), makeKeyword("DO-ONE-STEP"), makeSymbol("S#30838", "CYC"), makeKeyword("INITIAL-RELEVANT-STRATEGIES"), makeSymbol("S#30852", "CYC"), makeKeyword("INITIALIZE-PROPERTIES"), makeSymbol("S#30850", "CYC"), makeKeyword("UPDATE-PROPERTIES"), makeSymbol("S#30851", "CYC"), makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeSymbol("S#30849", "CYC"), makeKeyword("CONTINUATION-POSSIBLE?"), makeSymbol("S#30843", "CYC"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("S#30848", "CYC"), makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeSymbol("S#30861", "CYC"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("S#30853", "CYC"), makeKeyword("THROW-AWAY-PROBLEM"), makeSymbol("S#30844", "CYC"), makeKeyword("SET-ASIDE-PROBLEM"), makeSymbol("S#30845", "CYC"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("S#30846", "CYC"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("S#30847", "CYC"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("S#30860", "CYC"), makeKeyword("NEW-TACTIC"), makeSymbol("IGNORE"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("IGNORE"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("FALSE"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("FALSE"), makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeSymbol("S#30862", "CYC"), makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), makeSymbol("S#30877", "CYC"), makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), makeSymbol("S#30876", "CYC"), makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), makeSymbol("S#30878", "CYC") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 48 ms
	
	Decompiled with Procyon 0.5.32.
*/