package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0312 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0312";
    public static final String myFingerPrint = "2c8a2f76005522b75216eea405c2cb75a3289f863ce0c828abae8f87502c3493";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    
    public static SubLObject f21131(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic1$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f21132(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic2$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f21133(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic1$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f21134() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0312", "f21131", "S#23751");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0312", "f21132", "S#23752");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0312", "f21133", "S#23753");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21135() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21136() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f21134();
    }
    
    public void initializeVariables() {
        f21135();
    }
    
    public void runTopLevelForms() {
        f21136();
    }
    
    static {
        me = (SubLFile)new module0312();
        $ic0$ = makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1958", "CYC"), (SubLObject)T));
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1958", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1957", "CYC"), (SubLObject)NIL));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 17 ms
	
	Decompiled with Procyon 0.5.32.
*/