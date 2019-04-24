package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0237 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0237";
    public static final String myFingerPrint = "c86ee12888a8203f36e2067dda1a30dc83b3a5ec4fa7977af5d5d825cb4c6795";
    public static SubLSymbol $g2444$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    
    public static SubLObject f15567(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0237.NIL != var1);
    }
    
    public static SubLObject f15568(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0237.NIL != var1);
    }
    
    public static SubLObject f15569(final SubLObject var2) {
        return (SubLObject)module0237.NIL;
    }
    
    public static SubLObject f15570(final SubLObject var2) {
        return (SubLObject)module0237.NIL;
    }
    
    public static SubLObject f15571(final SubLObject var2) {
        return (SubLObject)module0237.NIL;
    }
    
    public static SubLObject f15572(final SubLObject var2) {
        return (SubLObject)module0237.NIL;
    }
    
    public static SubLObject f15573(final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = var3.rest();
        final SubLObject var7;
        final SubLObject var6 = var7 = var5;
        return (SubLObject)ConsesLow.listS((SubLObject)module0237.$ic0$, (SubLObject)module0237.$ic1$, ConsesLow.append(var7, (SubLObject)module0237.NIL));
    }
    
    public static SubLObject f15574() {
        module0237.$g2444$.setDynamicValue((SubLObject)module0237.T);
        return (SubLObject)module0237.NIL;
    }
    
    public static SubLObject f15575() {
        module0237.$g2444$.setDynamicValue((SubLObject)module0237.NIL);
        return (SubLObject)module0237.NIL;
    }
    
    public static SubLObject f15576(final SubLObject var8) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0237.NIL != module0133.f8675(var8) && (module0237.NIL == module0133.f8673(var8) || module0237.NIL != module0133.f8662(var8)));
    }
    
    public static SubLObject f15577() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0237", "f15567", "S#18333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0237", "f15568", "S#18334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0237", "f15569", "S#18335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0237", "f15570", "S#18336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0237", "f15571", "S#18337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0237", "f15572", "S#18338", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0237", "f15573", "S#18339");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0237", "f15574", "S#18340", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0237", "f15575", "S#10997", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0237", "f15576", "S#10891", 1, 0, false);
        return (SubLObject)module0237.NIL;
    }
    
    public static SubLObject f15578() {
        module0237.$g2444$ = SubLFiles.defparameter("S#18341", (SubLObject)module0237.NIL);
        return (SubLObject)module0237.NIL;
    }
    
    public static SubLObject f15579() {
        return (SubLObject)module0237.NIL;
    }
    
    public void declareFunctions() {
        f15577();
    }
    
    public void initializeVariables() {
        f15578();
    }
    
    public void runTopLevelForms() {
        f15579();
    }
    
    static {
        me = (SubLFile)new module0237();
        module0237.$g2444$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#18341", "CYC"), (SubLObject)module0237.NIL));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0237.class
	Total time: 22 ms
	
	Decompiled with Procyon 0.5.32.
*/