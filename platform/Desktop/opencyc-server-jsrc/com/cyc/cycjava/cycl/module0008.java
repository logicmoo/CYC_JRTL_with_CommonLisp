package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0008 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0008";
    public static final String myFingerPrint = "1d5b7ad65cd5ca81457e702b90bbf8bd5c0f191e584a920c95605894e512ae10";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    
    public static SubLObject f302() {
        return (SubLObject)module0008.NIL;
    }
    
    public static SubLObject f303() {
        return (SubLObject)module0008.NIL;
    }
    
    public static SubLObject f304() {
        return (SubLObject)module0008.NIL;
    }
    
    public static SubLObject f305() {
        return (SubLObject)module0008.NIL;
    }
    
    public static SubLObject f306() {
        return (SubLObject)module0008.NIL;
    }
    
    public static SubLObject f307() {
        return (SubLObject)module0008.NIL;
    }
    
    public static SubLObject f308(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return reader.bq_cons((SubLObject)module0008.$ic0$, ConsesLow.append(var5, (SubLObject)module0008.NIL));
    }
    
    public static SubLObject f309(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return reader.bq_cons((SubLObject)module0008.$ic0$, ConsesLow.append(var5, (SubLObject)module0008.NIL));
    }
    
    public static SubLObject f310(final SubLObject var8) {
        if (module0008.NIL != var8) {
            f303();
            return (SubLObject)module0008.T;
        }
        return (SubLObject)module0008.NIL;
    }
    
    public static SubLObject f311(final SubLObject var8) {
        if (module0008.NIL != var8 && module0008.NIL != f307()) {
            f305();
            return (SubLObject)module0008.T;
        }
        return (SubLObject)module0008.NIL;
    }
    
    public static SubLObject f312(final SubLObject var8) {
        if (module0008.NIL != var8 && module0008.NIL != f307()) {
            f304();
            return (SubLObject)module0008.T;
        }
        return (SubLObject)module0008.NIL;
    }
    
    public static SubLObject f313(final SubLObject var8, final SubLObject var9) {
        if (module0008.NIL != var9) {
            return f311(var8);
        }
        return f312(var8);
    }
    
    public static SubLObject f314() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0008", "f302", "S#299", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0008", "f303", "S#300", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0008", "f304", "S#301", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0008", "f305", "S#302", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0008", "f306", "S#303", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0008", "f307", "S#304", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0008", "f308", "S#305");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0008", "f309", "S#306");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0008", "f310", "S#307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0008", "f311", "S#308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0008", "f312", "S#309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0008", "f313", "S#310", 2, 0, false);
        return (SubLObject)module0008.NIL;
    }
    
    public static SubLObject f315() {
        return (SubLObject)module0008.NIL;
    }
    
    public static SubLObject f316() {
        module0002.f50((SubLObject)module0008.$ic1$, (SubLObject)module0008.$ic2$);
        module0002.f50((SubLObject)module0008.$ic3$, (SubLObject)module0008.$ic2$);
        module0002.f50((SubLObject)module0008.$ic4$, (SubLObject)module0008.$ic5$);
        module0002.f50((SubLObject)module0008.$ic6$, (SubLObject)module0008.$ic5$);
        return (SubLObject)module0008.NIL;
    }
    
    public void declareFunctions() {
        f314();
    }
    
    public void initializeVariables() {
        f315();
    }
    
    public void runTopLevelForms() {
        f316();
    }
    
    static {
        me = (SubLFile)new module0008();
        $ic0$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic1$ = SubLObjectFactory.makeSymbol("S#307", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#305", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#308", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#309", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#306", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#310", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0008.class
	Total time: 32 ms
	
	Decompiled with Procyon 0.5.32.
*/