package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0028 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0028";
    public static final String myFingerPrint = "5fea9cf2f48195f20d426294846e8ac1302ca513af9e64c1dfd87705c4cfefdd";
    private static SubLSymbol $g838$;
    private static final SubLSymbol $ic0$;
    
    public static SubLObject f1466() {
        return module0028.$g838$.getGlobalValue();
    }
    
    public static SubLObject f1467() {
        module0029.f1494();
        module0028.$g838$.setGlobalValue((SubLObject)module0028.T);
        return (SubLObject)module0028.NIL;
    }
    
    public static SubLObject f1468() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0028", "f1466", "S#2615", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0028", "f1467", "S#2616", 0, 0, false);
        return (SubLObject)module0028.NIL;
    }
    
    public static SubLObject f1469() {
        module0028.$g838$ = SubLFiles.deflexical("S#2617", (SubLObject)((module0028.NIL != Symbols.boundp((SubLObject)module0028.$ic0$)) ? module0028.$g838$.getGlobalValue() : module0028.NIL));
        return (SubLObject)module0028.NIL;
    }
    
    public static SubLObject f1470() {
        module0003.f57((SubLObject)module0028.$ic0$);
        return (SubLObject)module0028.NIL;
    }
    
    public void declareFunctions() {
        f1468();
    }
    
    public void initializeVariables() {
        f1469();
    }
    
    public void runTopLevelForms() {
        f1470();
    }
    
    static {
        me = (SubLFile)new module0028();
        module0028.$g838$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#2617", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0028.class
	Total time: 19 ms
	
	Decompiled with Procyon 0.5.32.
*/