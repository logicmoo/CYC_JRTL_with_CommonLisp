package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0404 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0404";
    public static final String myFingerPrint = "be68840c6ee296e4ba4ada06479c252e1ad361433457a05b61603b08e1447d2d";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    
    public static SubLObject f28321(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0363.f24478(var2) : var2;
        final SubLObject var3 = module0367.f25083(var2, var1);
        if (NIL == var3) {
            f28322(var1, var2);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28322(final SubLObject var1, final SubLObject var2) {
        module0403.f28315(var1, var2);
        if (NIL != module0363.f24586(var2, var1)) {
            f28323(var1, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28323(final SubLObject var1, final SubLObject var2) {
        if (NIL != f28324(var1, var2)) {
            return (SubLObject)NIL;
        }
        module0373.f26191(var2, var1);
        if (NIL != f28325(var1, var2)) {
            return (SubLObject)NIL;
        }
        final SubLObject var3 = (SubLObject)makeBoolean(NIL != module0367.f25083(var2, var1) && NIL == f28325(var1, var2));
        if (NIL != var3) {
            f28326(var1, var2);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28324(final SubLObject var1, final SubLObject var2) {
        return module0384.f27319(var1, var2);
    }
    
    public static SubLObject f28325(final SubLObject var1, final SubLObject var2) {
        return module0403.f28314(var1, var2);
    }
    
    public static SubLObject f28326(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0406.f28343(var1) : var1;
        assert NIL != module0363.f24478(var2) : var2;
        return Numbers.plusp(f28327(var1, var2));
    }
    
    public static SubLObject f28327(final SubLObject var1, final SubLObject var2) {
        module0406.f28348(var1, var2);
        return (SubLObject)TWO_INTEGER;
    }
    
    public static SubLObject f28328(final SubLObject var1, final SubLObject var2) {
        return module0363.f24612(var2);
    }
    
    public static SubLObject f28329() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0404", "f28321", "S#31439", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0404", "f28322", "S#31440", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0404", "f28323", "S#31441", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0404", "f28324", "S#31442", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0404", "f28325", "S#31443", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0404", "f28326", "S#31444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0404", "f28327", "S#31445", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0404", "f28328", "S#31446", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28330() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28331() {
        module0012.f419((SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28329();
    }
    
    public void initializeVariables() {
        f28330();
    }
    
    public void runTopLevelForms() {
        f28331();
    }
    
    static {
        me = (SubLFile)new module0404();
        $ic0$ = makeSymbol("S#26082", "CYC");
        $ic1$ = makeSymbol("S#29328", "CYC");
        $ic2$ = makeSymbol("S#31446", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 63 ms
	
	Decompiled with Procyon 0.5.32.
*/