package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0401 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0401";
    public static final String myFingerPrint = "aa8d7f7d74d70a4663a7d14dea29eab59549b3a8d86518b92e94f237c5b038ab";
    private static SubLSymbol $g3291$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    
    public static SubLObject f28265(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0402.f28280(var1) && NIL == module0367.f25079(var1));
    }
    
    public static SubLObject f28266(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3;
        for (var3 = (SubLObject)$ic0$; $ic0$ == var3; var3 = f28267(var1)) {}
        if (NIL != module0018.$g629$.getDynamicValue(var2) && $ic1$ == var3 && NIL == module0402.f28280(var1)) {
            Errors.cerror((SubLObject)$ic2$, (SubLObject)$ic3$, var1);
        }
        return Equality.eq((SubLObject)$ic1$, var3);
    }
    
    public static SubLObject f28267(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        if (NIL != module0367.f25060(var1)) {
            module0387.f27567(var1);
            var2 = (SubLObject)$ic0$;
        }
        else if (NIL != module0387.f27469(var1)) {
            var2 = (SubLObject)$ic1$;
        }
        else {
            final SubLObject var3 = f28268(var1);
            if (NIL != var3) {
                var2 = module0387.f27508(var1, var3);
            }
            else {
                var2 = (SubLObject)$ic1$;
            }
        }
        return var2;
    }
    
    public static SubLObject f28268(final SubLObject var1) {
        return module0367.f25109(var1, (SubLObject)$ic4$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f28269(final SubLObject var1) {
        f28270(var1);
        if (NIL == module0402.f28280(var1)) {
            return module0402.f28286(var1);
        }
        if (NIL != module0367.f25079(var1)) {
            return module0367.f25077(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28270(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != module0398.f28152(var1) : var1;
        if (Numbers.mod(module0367.f25065(var1), $g3291$.getDynamicValue(var2)).isZero()) {
            module0402.f28283(var1);
        }
        while (true) {
            final SubLObject var3 = module0402.f28281(var1);
            if (NIL == var3) {
                return (SubLObject)NIL;
            }
            final SubLObject var4 = module0399.f28213(var1, var3);
            if (NIL == var4) {
                return var3;
            }
            final SubLObject var5 = var4;
            if (var5.eql((SubLObject)$ic7$)) {
                module0398.f28172(var1, var3);
            }
            else if (var5.eql((SubLObject)$ic8$)) {}
            module0402.f28286(var1);
            module0400.f28256(var1, var3);
        }
    }
    
    public static SubLObject f28271(final SubLObject var1, final SubLObject var4) {
        assert NIL != module0398.f28152(var1) : var1;
        assert NIL != module0387.f27526(var4) : var4;
        SubLObject var5 = (SubLObject)$ic0$;
        if (NIL != module0387.f27527(var4)) {
            final SubLObject var6 = module0387.f27530(var4);
            module0400.f28257(var1, var4);
            f28272(var1, var4);
            module0400.f28258(var1, var6);
            var5 = (SubLObject)$ic10$;
        }
        else if (NIL != module0373.f26163(var4)) {
            module0400.f28233(var1, var4);
            final SubLObject var6 = module0387.f27530(var4);
            module0400.f28257(var1, var4);
            module0387.f27511(var1, var4);
            module0400.f28258(var1, var6);
            var5 = (SubLObject)$ic10$;
        }
        else if (NIL != module0377.f26746(var4)) {
            module0400.f28233(var1, var4);
            module0400.f28256(var1, var4);
            var5 = (SubLObject)$ic10$;
        }
        else {
            if (NIL == module0374.f26529(var4)) {
                return Errors.error((SubLObject)$ic11$, var4);
            }
            final SubLObject var7 = module0374.f26538(var4);
            module0400.f28235(var1, var7);
            module0373.f26349(var4);
            var5 = (SubLObject)$ic10$;
        }
        return var5;
    }
    
    public static SubLObject f28272(final SubLObject var1, final SubLObject var8) {
        if (NIL != module0373.f26176(var8)) {
            return f28273(var1, var8);
        }
        return f28274(var1, var8);
    }
    
    public static SubLObject f28273(final SubLObject var1, final SubLObject var14) {
        f28275(var1, var14);
        return var1;
    }
    
    public static SubLObject f28274(final SubLObject var1, final SubLObject var15) {
        return f28275(var1, var15);
    }
    
    public static SubLObject f28275(final SubLObject var1, final SubLObject var4) {
        final SubLObject var5 = module0365.f24883(var4);
        if (NIL != var5) {
            module0400.f28255(var1, var4);
        }
        module0387.f27510(var1, var4);
        if (NIL == var5 && NIL != module0365.f24883(var4)) {
            module0400.f28255(var1, var4);
        }
        return var4;
    }
    
    public static SubLObject f28276() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0401", "f28265", "S#31392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0401", "f28266", "S#31393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0401", "f28267", "S#31394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0401", "f28268", "S#31395", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0401", "f28269", "S#31396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0401", "f28270", "S#31397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0401", "f28271", "S#31398", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0401", "f28272", "S#31399", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0401", "f28273", "S#31400", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0401", "f28274", "S#31401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0401", "f28275", "S#31402", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28277() {
        $g3291$ = SubLFiles.defparameter("S#31403", (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28278() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28276();
    }
    
    public void initializeVariables() {
        f28277();
    }
    
    public void runTopLevelForms() {
        f28278();
    }
    
    static {
        me = (SubLFile)new module0401();
        $g3291$ = null;
        $ic0$ = makeKeyword("UNINTERESTING");
        $ic1$ = makeKeyword("DONE");
        $ic2$ = makeString("Continue");
        $ic3$ = makeString("~s says it's done, but its T-box is nonempty");
        $ic4$ = makeKeyword("SELECT-BEST-STRATEGEM");
        $ic5$ = makeInteger(50);
        $ic6$ = makeSymbol("S#30356", "CYC");
        $ic7$ = makeKeyword("SET-ASIDE");
        $ic8$ = makeKeyword("THROW-AWAY");
        $ic9$ = makeSymbol("S#30616", "CYC");
        $ic10$ = makeKeyword("INTERESTING");
        $ic11$ = makeString("~S was an unexpected strategem");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 79 ms
	
	Decompiled with Procyon 0.5.32.
*/