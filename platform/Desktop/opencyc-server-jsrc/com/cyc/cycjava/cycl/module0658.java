package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0658 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0658";
    public static final String myFingerPrint = "eb47c84b8f93319fc78f71268d48c644aae8af693e461a3f26548fa071032e54";
    private static SubLSymbol $g5187$;
    private static SubLSymbol $g5188$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    
    
    public static SubLObject f40044() {
        return module0118.f8175((SubLObject)module0658.$ic9$);
    }
    
    public static SubLObject f40045() {
        if (module0658.NIL == f40044()) {
            f40046();
        }
        return module0118.f8177();
    }
    
    public static SubLObject f40047(final SubLObject var1) {
        final SubLObject var2 = module0658.$g5187$.getGlobalValue();
        SubLObject var3 = (SubLObject)module0658.NIL;
        try {
            var3 = Locks.seize_lock(var2);
            if (module0658.NIL == Sequences.find(var1, module0658.$g5188$.getGlobalValue(), (SubLObject)module0658.EQUALP, (SubLObject)module0658.UNPROVIDED, (SubLObject)module0658.UNPROVIDED, (SubLObject)module0658.UNPROVIDED)) {
                module0658.$g5188$.setGlobalValue((SubLObject)ConsesLow.cons(var1, module0658.$g5188$.getGlobalValue()));
                if (module0658.NIL != f40044()) {
                    module0117.f8156(var1, (SubLObject)module0658.NIL);
                }
            }
        }
        finally {
            if (module0658.NIL != var3) {
                Locks.release_lock(var2);
            }
        }
        return var1;
    }
    
    public static SubLObject f40048(final SubLObject var4) {
        final SubLObject var5 = module0658.$g5187$.getGlobalValue();
        SubLObject var6 = (SubLObject)module0658.NIL;
        try {
            var6 = Locks.seize_lock(var5);
            module0658.$g5188$.setGlobalValue(Sequences.remove(var4, module0658.$g5188$.getGlobalValue(), (SubLObject)module0658.EQUALP, (SubLObject)module0658.UNPROVIDED, (SubLObject)module0658.UNPROVIDED, (SubLObject)module0658.UNPROVIDED, (SubLObject)module0658.UNPROVIDED));
            if (module0658.NIL != f40044()) {
                module0117.f8158(var4, (SubLObject)module0658.NIL);
            }
        }
        finally {
            if (module0658.NIL != var6) {
                Locks.release_lock(var5);
            }
        }
        return var4;
    }
    
    public static SubLObject f40049() {
        return module0118.f8181((SubLObject)module0658.$ic9$);
    }
    
    public static SubLObject f40046() {
        return module0118.f8178((SubLObject)module0658.$ic9$);
    }
    
    public static SubLObject f40050(final SubLObject var7) {
        if (module0658.NIL != f40051()) {
            module0117.f8161(f40052(var7), f40053());
        }
        return var7;
    }
    
    public static SubLObject f40054(final SubLObject var8) {
        assert module0658.NIL != constant_handles_oc.f8449(var8) : var8;
        if (module0658.NIL != f40051()) {
            module0117.f8161(f40055(var8), f40053());
        }
        return var8;
    }
    
    public static SubLObject f40056(final SubLObject var9, final SubLObject var10, SubLObject var11, SubLObject var12, SubLObject var13, SubLObject var14) {
        if (var11 == module0658.UNPROVIDED) {
            var11 = (SubLObject)module0658.NIL;
        }
        if (var12 == module0658.UNPROVIDED) {
            var12 = (SubLObject)module0658.NIL;
        }
        if (var13 == module0658.UNPROVIDED) {
            var13 = (SubLObject)module0658.NIL;
        }
        if (var14 == module0658.UNPROVIDED) {
            var14 = (SubLObject)module0658.NIL;
        }
        assert module0658.NIL != module0202.f12660(var9) : var9;
        assert module0658.NIL != module0161.f10481(var10) : var10;
        if (module0658.NIL != f40051()) {
            module0117.f8161(f40057(var9, var10, var11, var12, var13, var14), f40053());
        }
        return (SubLObject)module0658.NIL;
    }
    
    public static SubLObject f40058(final SubLObject var15, SubLObject var10, SubLObject var16) {
        if (var10 == module0658.UNPROVIDED) {
            var10 = (SubLObject)module0658.NIL;
        }
        if (var16 == module0658.UNPROVIDED) {
            var16 = (SubLObject)module0658.NIL;
        }
        assert module0658.NIL != module0202.f12663(var15) : var15;
        if (module0658.NIL != var10 && !module0658.areAssertionsDisabledFor(me) && module0658.NIL == module0161.f10479(var10)) {
            throw new AssertionError(var10);
        }
        final SubLObject var17 = var16;
        assert module0658.NIL != module0035.f2327(var17) : var17;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        for (var18 = (SubLObject)module0658.NIL, var18 = var17; module0658.NIL != var18; var18 = conses_high.cddr(var18)) {
            var19 = var18.first();
            var20 = conses_high.cadr(var18);
            assert module0658.NIL != module0360.f23781(var19) : var19;
        }
        if (module0658.NIL != f40051()) {
            module0117.f8161(f40059(var15, var10, var16), f40053());
        }
        return (SubLObject)module0658.NIL;
    }
    
    public static SubLObject f40052(final SubLObject var7) {
        return module0116.f8064((SubLObject)module0658.$ic2$, var7, module0723.f44261());
    }
    
    public static SubLObject f40055(final SubLObject var8) {
        return module0116.f8064((SubLObject)module0658.$ic5$, var8, module0723.f44261());
    }
    
    public static SubLObject f40057(final SubLObject var9, final SubLObject var10, final SubLObject var11, final SubLObject var12, final SubLObject var13, final SubLObject var14) {
        return module0116.f8064((SubLObject)module0658.$ic6$, (SubLObject)ConsesLow.list(var9, var10, var11, var12, var13, var14), module0723.f44261());
    }
    
    public static SubLObject f40059(final SubLObject var15, final SubLObject var10, final SubLObject var16) {
        return module0116.f8064((SubLObject)module0658.$ic7$, (SubLObject)ConsesLow.list(var15, var10, var16), module0723.f44261());
    }
    
    public static SubLObject f40053() {
        return module0117.f8146();
    }
    
    public static SubLObject f40051() {
        if (module0658.NIL != module0011.f350()) {
            f40045();
            return (SubLObject)module0658.T;
        }
        return (SubLObject)module0658.NIL;
    }
    
    public static SubLObject f40060() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40044", "S#44059", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40045", "S#44060", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40047", "S#44061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40048", "S#44062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40049", "S#44063", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40046", "S#44064", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40050", "S#44065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40054", "S#44066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40056", "S#44067", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40058", "S#44068", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40052", "S#44069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40055", "S#44070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40057", "S#44071", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40059", "S#44072", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40053", "S#44073", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0658", "f40051", "S#44074", 0, 0, false);
        return (SubLObject)module0658.NIL;
    }
    
    public static SubLObject f40061() {
        module0658.$g5187$ = SubLFiles.deflexical("S#44075", Locks.make_lock((SubLObject)module0658.$ic8$));
        module0658.$g5188$ = SubLFiles.deflexical("S#44076", (SubLObject)((module0658.NIL != Symbols.boundp((SubLObject)module0658.$ic9$)) ? module0658.$g5188$.getGlobalValue() : module0658.NIL));
        return (SubLObject)module0658.NIL;
    }
    
    public static SubLObject f40062() {
        module0116.f8043((SubLObject)module0658.$ic0$, (SubLObject)module0658.$ic1$, (SubLObject)module0658.NIL);
        module0116.f8043((SubLObject)module0658.$ic2$, (SubLObject)module0658.$ic0$, (SubLObject)module0658.NIL);
        module0116.f8043((SubLObject)module0658.$ic3$, (SubLObject)module0658.$ic0$, (SubLObject)module0658.NIL);
        module0116.f8043((SubLObject)module0658.$ic4$, (SubLObject)module0658.$ic3$, (SubLObject)module0658.NIL);
        module0116.f8043((SubLObject)module0658.$ic5$, (SubLObject)module0658.$ic4$, (SubLObject)module0658.NIL);
        module0116.f8043((SubLObject)module0658.$ic6$, (SubLObject)module0658.$ic0$, (SubLObject)module0658.NIL);
        module0116.f8043((SubLObject)module0658.$ic7$, (SubLObject)module0658.$ic0$, (SubLObject)module0658.NIL);
        module0003.f57((SubLObject)module0658.$ic9$);
        return (SubLObject)module0658.NIL;
    }
    
    public void declareFunctions() {
        f40060();
    }
    
    public void initializeVariables() {
        f40061();
    }
    
    public void runTopLevelForms() {
        f40062();
    }
    
    static {
        me = (SubLFile)new module0658();
        module0658.$g5187$ = null;
        module0658.$g5188$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("CYC-BROWSER-BASE-EVENT");
        $ic1$ = SubLObjectFactory.makeKeyword("CYC-APPLICATION-EVENT");
        $ic2$ = SubLObjectFactory.makeKeyword("CYC-BROWSER-LOGIN-EVENT");
        $ic3$ = SubLObjectFactory.makeKeyword("CYC-BROWSER-SELECTION-EVENT");
        $ic4$ = SubLObjectFactory.makeKeyword("CYC-BROWSER-FORT-SELECTION-EVENT");
        $ic5$ = SubLObjectFactory.makeKeyword("CYC-BROWSER-CONSTANT-SELECTION-EVENT");
        $ic6$ = SubLObjectFactory.makeKeyword("CYC-BROWSER-ASK-EVENT");
        $ic7$ = SubLObjectFactory.makeKeyword("CYC-BROWSER-QUERY-EVENT");
        $ic8$ = SubLObjectFactory.makeString("CB-EVENT-DISPATCHER Lock");
        $ic9$ = SubLObjectFactory.makeSymbol("S#44076", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic11$ = SubLObjectFactory.makeSymbol("S#13920", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#15591", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#12264", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0658.class
	Total time: 100 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/