package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0535 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0535";
    public static final String myFingerPrint = "1d8059fc1e6518b985c1a7312a07c3d5ee769ed8698600810a7c1c3315d2d89f";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    
    public static SubLObject f33273(final SubLObject var1, SubLObject var2) {
        if (var2 == module0535.UNPROVIDED) {
            var2 = (SubLObject)module0535.NIL;
        }
        final SubLObject var3 = f33274(var1);
        final SubLObject var4 = f33275(var1);
        SubLObject var5 = (SubLObject)module0535.NIL;
        if (module0535.NIL != var3 || module0535.NIL != var4) {
            SubLObject var6 = var3;
            SubLObject var7 = (SubLObject)module0535.NIL;
            var7 = var6.first();
            while (module0535.NIL != var6) {
                var5 = f33276(var1, var7, var2, var5);
                var6 = var6.rest();
                var7 = var6.first();
            }
            var6 = var4;
            var7 = (SubLObject)module0535.NIL;
            var7 = var6.first();
            while (module0535.NIL != var6) {
                var5 = f33276(var1, var7, var2, var5);
                var6 = var6.rest();
                var7 = var6.first();
            }
            var5 = Sort.sort(var5, (SubLObject)module0535.$ic0$, (SubLObject)module0535.$ic1$);
            var5 = Sort.stable_sort(var5, (SubLObject)module0535.$ic2$, (SubLObject)module0535.$ic3$);
            var5 = Sort.stable_sort(var5, (SubLObject)module0535.$ic2$, (SubLObject)module0535.$ic4$);
        }
        return module0232.f15330((SubLObject)module0535.NIL, Sequences.nreverse(var5));
    }
    
    public static SubLObject f33277(final SubLObject var1, SubLObject var2) {
        if (var2 == module0535.UNPROVIDED) {
            var2 = (SubLObject)module0535.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert module0535.NIL != module0178.f11290(var1) : var1;
        if (module0535.NIL == var2) {
            var2 = module0178.f11287(var1);
        }
        final SubLObject var4 = module0178.f11282(var1);
        final SubLObject var5 = module0232.f15306(var4);
        final SubLObject var6 = module0202.f12773(var5);
        final SubLObject var7 = module0307.f20765(var6, var2, (SubLObject)module0535.$ic6$, (SubLObject)module0535.T);
        SubLObject var8 = (SubLObject)module0535.NIL;
        SubLObject var9;
        for (var9 = module0066.f4838(module0067.f4891(var7)); module0535.NIL == module0066.f4841(var9); var9 = module0066.f4840(var9)) {
            var3.resetMultipleValues();
            final SubLObject var10 = module0066.f4839(var9);
            final SubLObject var11 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            SubLObject var13;
            final SubLObject var12 = var13 = var11;
            SubLObject var14 = (SubLObject)module0535.NIL;
            SubLObject var15 = (SubLObject)module0535.NIL;
            SubLObject var16 = (SubLObject)module0535.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0535.$ic7$);
            var14 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0535.$ic7$);
            var15 = var13.first();
            var13 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0535.$ic7$);
            var16 = var13.first();
            var13 = var13.rest();
            if (module0535.NIL == var13) {
                var14 = module0256.f16529(var14, var2, (SubLObject)module0535.UNPROVIDED);
                var15 = module0256.f16529(var15, var2, (SubLObject)module0535.UNPROVIDED);
                var16 = module0256.f16529(var16, var2, (SubLObject)module0535.UNPROVIDED);
                var8 = conses_high.acons(var10, (SubLObject)ConsesLow.list(var14, var15, var16), var8);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0535.$ic7$);
            }
        }
        module0066.f4842(var9);
        return f33278(var8);
    }
    
    public static SubLObject f33279(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0535.UNPROVIDED) {
            var2 = (SubLObject)module0535.NIL;
        }
        final SubLObject var8 = f33277(var1, var2);
        final SubLObject var9 = module0193.f12102(var7);
        SubLObject var10 = (SubLObject)module0535.NIL;
        SubLObject var11 = var9;
        SubLObject var12 = (SubLObject)module0535.NIL;
        var12 = var11.first();
        while (module0535.NIL != var11) {
            final SubLObject var13 = module0035.f2294(var8, var12, Symbols.symbol_function((SubLObject)module0535.EQ), (SubLObject)module0535.$ic8$);
            var10 = conses_high.acons(var12, var13, var10);
            var11 = var11.rest();
            var12 = var11.first();
        }
        return f33278(var10);
    }
    
    public static SubLObject f33276(final SubLObject var1, final SubLObject var7, SubLObject var2, SubLObject var25) {
        if (var2 == module0535.UNPROVIDED) {
            var2 = (SubLObject)module0535.NIL;
        }
        if (var25 == module0535.UNPROVIDED) {
            var25 = (SubLObject)module0535.NIL;
        }
        if (module0535.NIL == var2) {
            var2 = module0178.f11287(var1);
        }
        SubLObject var27;
        final SubLObject var26 = var27 = f33279(var1, var7, (SubLObject)module0535.UNPROVIDED);
        SubLObject var28 = (SubLObject)module0535.NIL;
        var28 = var27.first();
        while (module0535.NIL != var27) {
            SubLObject var30;
            final SubLObject var29 = var30 = var28;
            SubLObject var31 = (SubLObject)module0535.NIL;
            SubLObject var32 = (SubLObject)module0535.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)module0535.$ic9$);
            var31 = var30.first();
            var30 = (var32 = var30.rest());
            SubLObject var32_33;
            final SubLObject var30_31 = var32_33 = var32;
            SubLObject var33 = (SubLObject)module0535.NIL;
            SubLObject var34 = (SubLObject)module0535.NIL;
            SubLObject var35 = (SubLObject)module0535.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var32_33, var30_31, (SubLObject)module0535.$ic7$);
            var33 = var32_33.first();
            var32_33 = var32_33.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var32_33, var30_31, (SubLObject)module0535.$ic7$);
            var34 = var32_33.first();
            var32_33 = var32_33.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var32_33, var30_31, (SubLObject)module0535.$ic7$);
            var35 = var32_33.first();
            var32_33 = var32_33.rest();
            if (module0535.NIL == var32_33) {
                if (module0535.NIL != var34) {
                    SubLObject var6_34 = var34;
                    SubLObject var36 = (SubLObject)module0535.NIL;
                    var36 = var6_34.first();
                    while (module0535.NIL != var6_34) {
                        if (!var36.eql(module0535.$ic10$)) {
                            final SubLObject var37 = module0202.f12768(module0535.$ic11$, var31, var36);
                            if (module0535.NIL == conses_high.member(var37, var25, Symbols.symbol_function((SubLObject)module0535.EQUAL), Symbols.symbol_function((SubLObject)module0535.IDENTITY))) {
                                var25 = (SubLObject)ConsesLow.cons(var37, var25);
                            }
                        }
                        var6_34 = var6_34.rest();
                        var36 = var6_34.first();
                    }
                }
                else if (module0535.NIL != var33) {
                    SubLObject var6_35 = var33;
                    SubLObject var36 = (SubLObject)module0535.NIL;
                    var36 = var6_35.first();
                    while (module0535.NIL != var6_35) {
                        if (!var36.eql(module0535.$ic10$)) {
                            final SubLObject var37 = module0202.f12768(module0535.$ic12$, var31, var36);
                            if (module0535.NIL == conses_high.member(var37, var25, Symbols.symbol_function((SubLObject)module0535.EQUAL), Symbols.symbol_function((SubLObject)module0535.IDENTITY))) {
                                var25 = (SubLObject)ConsesLow.cons(var37, var25);
                            }
                        }
                        var6_35 = var6_35.rest();
                        var36 = var6_35.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30_31, (SubLObject)module0535.$ic7$);
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return var25;
    }
    
    public static SubLObject f33278(final SubLObject var38) {
        return Sort.sort(var38, (SubLObject)module0535.$ic2$, (SubLObject)module0535.$ic13$);
    }
    
    public static SubLObject f33274(final SubLObject var1) {
        final SubLObject var2 = module0232.f15306(module0178.f11282(var1));
        SubLObject var3 = (SubLObject)module0535.NIL;
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)module0535.NIL;
        var5 = var4.first();
        while (module0535.NIL != var4) {
            if (module0535.NIL != module0337.f22628((SubLObject)module0535.$ic14$, var5)) {
                var3 = (SubLObject)ConsesLow.cons(var5, var3);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f33275(final SubLObject var1) {
        final SubLObject var2 = module0232.f15306(module0178.f11282(var1));
        SubLObject var3 = (SubLObject)module0535.NIL;
        SubLObject var4 = var2;
        SubLObject var5 = (SubLObject)module0535.NIL;
        var5 = var4.first();
        while (module0535.NIL != var4) {
            if (module0535.NIL != module0337.f22628((SubLObject)module0535.$ic15$, var5)) {
                var3 = (SubLObject)ConsesLow.cons(var5, var3);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f33280() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0535", "f33273", "S#36731", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0535", "f33277", "S#36732", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0535", "f33279", "S#36733", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0535", "f33276", "S#36734", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0535", "f33278", "S#36735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0535", "f33274", "S#36736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0535", "f33275", "S#36737", 1, 0, false);
        return (SubLObject)module0535.NIL;
    }
    
    public static SubLObject f33281() {
        return (SubLObject)module0535.NIL;
    }
    
    public static SubLObject f33282() {
        return (SubLObject)module0535.NIL;
    }
    
    public void declareFunctions() {
        f33280();
    }
    
    public void initializeVariables() {
        f33281();
    }
    
    public void runTopLevelForms() {
        f33282();
    }
    
    static {
        me = (SubLFile)new module0535();
        $ic0$ = SubLObjectFactory.makeSymbol("S#17515", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#15505", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#3846", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $ic4$ = SubLObjectFactory.makeSymbol("S#13440", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#12732", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36738", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36739", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36740", "CYC"));
        $ic8$ = ConsesLow.list((SubLObject)module0535.NIL, (SubLObject)module0535.NIL, (SubLObject)module0535.NIL);
        $ic9$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8667", "CYC"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic12$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic13$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic14$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"));
        $ic15$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0535.class
	Total time: 109 ms
	
	Decompiled with Procyon 0.5.32.
*/