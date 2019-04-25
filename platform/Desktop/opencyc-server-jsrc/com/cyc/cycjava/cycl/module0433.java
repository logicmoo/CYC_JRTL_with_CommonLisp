package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0433 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0433";
    public static final String myFingerPrint = "3454002a1533d4b1e43feb1114e5592ed507d2e81dc2414b70685efa9951171a";
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLString $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    
    public static SubLObject f30557(SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var2 == module0433.UNPROVIDED) {
            var2 = (SubLObject)module0433.NIL;
        }
        if (var3 == module0433.UNPROVIDED) {
            var3 = (SubLObject)module0433.NIL;
        }
        if (var4 == module0433.UNPROVIDED) {
            var4 = (SubLObject)module0433.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0433.NIL;
        SubLObject var7 = (SubLObject)module0433.NIL;
        SubLObject var8 = (SubLObject)module0433.NIL;
        SubLObject var9 = (SubLObject)module0433.NIL;
        SubLObject var10 = (SubLObject)module0433.NIL;
        while (module0433.NIL == var10) {
            var5.resetMultipleValues();
            final SubLObject var11 = module0409.f28506(var1, var2, var4);
            final SubLObject var12 = var5.secondMultipleValue();
            final SubLObject var13 = var5.thirdMultipleValue();
            final SubLObject var14 = var5.fourthMultipleValue();
            var5.resetMultipleValues();
            var8 = var11;
            var9 = var12;
            SubLObject var15 = var13;
            if (module0433.NIL != var15) {
                var6 = (SubLObject)ConsesLow.cons(var15, var6);
            }
            var15 = var14;
            if (module0433.NIL != var15) {
                var7 = (SubLObject)ConsesLow.cons(var15, var7);
            }
            var10 = f30558(var3, var11);
            if (module0433.NIL == var10) {
                var5.resetMultipleValues();
                final SubLObject var16 = f30559(var1, var3);
                final SubLObject var17 = var5.secondMultipleValue();
                var5.resetMultipleValues();
                if (module0433.NIL != var17) {
                    var10 = (SubLObject)module0433.T;
                }
                else {
                    var1 = var16;
                }
            }
        }
        var6 = Sequences.nreverse(var6);
        var7 = Sequences.nreverse(var7);
        return Values.values(var8, var9, var6, var7);
    }
    
    public static SubLObject f30558(final SubLObject var3, final SubLObject var11) {
        return module0035.sublisp_boolean(var11.first());
    }
    
    public static SubLObject f30559(SubLObject var1, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0433.NIL;
        SubLObject var6 = (SubLObject)module0433.NIL;
        if (module0433.NIL == var5 && module0433.NIL != module0259.f16891(var3, module0433.$ic0$)) {
            var6 = (SubLObject)module0433.T;
            var4.resetMultipleValues();
            final SubLObject var19_20 = f30560(var1, var3);
            final SubLObject var21_22 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var1 = var19_20;
            var5 = var21_22;
        }
        if (module0433.NIL == var5 && module0433.NIL != module0259.f16891(var3, module0433.$ic1$)) {
            var6 = (SubLObject)module0433.T;
            var4.resetMultipleValues();
            final SubLObject var23_24 = f30561(var1, var3);
            final SubLObject var25_26 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            var1 = var23_24;
            var5 = var25_26;
        }
        if (module0433.NIL == var6) {
            return Errors.error((SubLObject)module0433.$ic2$, var3);
        }
        return Values.values(var1, var5);
    }
    
    public static SubLObject f30560(final SubLObject var1, final SubLObject var3) {
        final SubLObject var4 = module0220.f14556(var3, module0433.$ic3$, (SubLObject)module0433.ONE_INTEGER, (SubLObject)module0433.TWO_INTEGER, (SubLObject)module0433.$ic4$);
        if (module0433.NIL != var4) {
            final SubLObject var5 = module0202.f12751(var4);
            SubLObject var7;
            final SubLObject var6 = var7 = Sequences.reverse(var5);
            SubLObject var8 = (SubLObject)module0433.NIL;
            var8 = var7.first();
            while (module0433.NIL != var7) {
                if (module0433.NIL != module0035.f2434(var8, var1)) {
                    final SubLObject var9 = f30562(var1, var8);
                    return Values.values(var9, (SubLObject)module0433.NIL);
                }
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        return Values.values((SubLObject)module0433.NIL, (SubLObject)module0433.T);
    }
    
    public static SubLObject f30561(SubLObject var1, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var6;
        final SubLObject var5 = var6 = f30563(var3);
        SubLObject var7 = (SubLObject)module0433.NIL;
        var7 = var6.first();
        while (module0433.NIL != var6) {
            SubLObject var9;
            final SubLObject var8 = var9 = var7;
            SubLObject var10 = (SubLObject)module0433.NIL;
            SubLObject var11 = (SubLObject)module0433.NIL;
            SubLObject var12 = (SubLObject)module0433.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0433.$ic5$);
            var10 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0433.$ic5$);
            var11 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)module0433.$ic5$);
            var12 = var9.first();
            var9 = var9.rest();
            if (module0433.NIL == var9) {
                var4.resetMultipleValues();
                final SubLObject var13 = f30564(var1, var10, var11, var12);
                final SubLObject var14 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (module0433.NIL != var14) {
                    return Values.values((SubLObject)module0433.NIL, (SubLObject)module0433.T);
                }
                var1 = var13;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)module0433.$ic5$);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return Values.values(var1, (SubLObject)module0433.NIL);
    }
    
    public static SubLObject f30563(final SubLObject var3) {
        return module0220.f14601(var3, module0433.$ic6$, (SubLObject)module0433.ONE_INTEGER, (SubLObject)module0433.$ic7$, (SubLObject)module0433.$ic4$);
    }
    
    public static SubLObject f30564(SubLObject var1, final SubLObject var36, final SubLObject var37, final SubLObject var38) {
        if (var36.equal((SubLObject)module0433.$ic8$) && var37.equal((SubLObject)module0433.$ic9$) && var38.equal((SubLObject)module0433.$ic10$)) {
            SubLObject var39;
            SubLObject var40;
            SubLObject var41;
            SubLObject var42;
            SubLObject var43;
            for (var39 = (SubLObject)module0433.NIL, var39 = (SubLObject)ConsesLow.cons((SubLObject)module0433.TEN_INTEGER, module0202.f12751(var38)); !var39.isAtom(); var39 = var39.rest()) {
                var40 = var39.first();
                var41 = conses_high.second(var39);
                if (module0433.NIL != var40 && module0433.NIL != var41) {
                    var42 = (SubLObject)ConsesLow.list(module0433.$ic11$, var40);
                    var43 = (SubLObject)ConsesLow.list(module0433.$ic11$, var41);
                    if (module0433.NIL != module0035.f2436(var42, var1)) {
                        var1 = module0205.f13250(var43, var42, var1, Symbols.symbol_function((SubLObject)module0433.EQUAL), (SubLObject)module0433.UNPROVIDED);
                        return Values.values(var1, (SubLObject)module0433.NIL);
                    }
                }
            }
            return Values.values((SubLObject)module0433.NIL, (SubLObject)module0433.T);
        }
        return Errors.error((SubLObject)module0433.$ic2$, module0433.$ic6$);
    }
    
    public static SubLObject f30562(SubLObject var1, final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        final SubLObject var33 = module0018.$g587$.currentBinding(var32);
        try {
            module0018.$g587$.bind(var31, var32);
            var1 = module0205.f13147(var1, Symbols.symbol_function((SubLObject)module0433.$ic12$), Symbols.symbol_function((SubLObject)module0433.$ic13$), (SubLObject)module0433.UNPROVIDED, (SubLObject)module0433.UNPROVIDED);
        }
        finally {
            module0018.$g587$.rebind(var33, var32);
        }
        return var1;
    }
    
    public static SubLObject f30565(final SubLObject var46, SubLObject var31) {
        if (var31 == module0433.UNPROVIDED) {
            var31 = module0018.$g587$.getDynamicValue();
        }
        if (module0433.NIL != module0202.f12595(var46)) {
            SubLObject var48;
            final SubLObject var47 = var48 = module0205.f13207(var46, (SubLObject)module0433.UNPROVIDED);
            SubLObject var49 = (SubLObject)module0433.NIL;
            var49 = var48.first();
            while (module0433.NIL != var48) {
                if (module0433.NIL != module0552.f34032(var49) && var31.equal(module0205.f13333(var49))) {
                    return var49;
                }
                var48 = var48.rest();
                var49 = var48.first();
            }
        }
        return (SubLObject)module0433.NIL;
    }
    
    public static SubLObject f30566(final SubLObject var49, SubLObject var31) {
        if (var31 == module0433.UNPROVIDED) {
            var31 = module0018.$g587$.getDynamicValue();
        }
        SubLObject var50 = module0205.f13207(var49, (SubLObject)module0433.UNPROVIDED);
        var50 = Sequences.remove(var31, var50, Symbols.symbol_function((SubLObject)module0433.EQUAL), Symbols.symbol_function((SubLObject)module0433.$ic14$), (SubLObject)module0433.UNPROVIDED, (SubLObject)module0433.UNPROVIDED, (SubLObject)module0433.UNPROVIDED);
        return module0202.f12773(var50);
    }
    
    public static SubLObject f30567() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0433", "f30557", "S#33815", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0433", "f30558", "S#33816", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0433", "f30559", "S#33817", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0433", "f30560", "S#33818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0433", "f30561", "S#33819", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0433", "f30563", "S#33820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0433", "f30564", "S#33821", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0433", "f30562", "S#33822", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0433", "f30565", "S#33823", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0433", "f30566", "S#33824", 1, 1, false);
        return (SubLObject)module0433.NIL;
    }
    
    public static SubLObject f30568() {
        return (SubLObject)module0433.NIL;
    }
    
    public static SubLObject f30569() {
        module0012.f419((SubLObject)module0433.$ic12$);
        module0012.f419((SubLObject)module0433.$ic13$);
        return (SubLObject)module0433.NIL;
    }
    
    public void declareFunctions() {
        f30567();
    }
    
    public void initializeVariables() {
        f30568();
    }
    
    public void runTopLevelForms() {
        f30569();
    }
    
    static {
        me = (SubLFile)new module0433();
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("QueryRelaxationStrategy-RemoveLiteralViaSpecifiedOrder"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("QueryRelaxationStrategyChangeValueInArgAccordingToSpec"));
        $ic2$ = SubLObjectFactory.makeString("time to implement support for ~S");
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("strategyHasPredicateOrder"));
        $ic4$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33825", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33826", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33827", "CYC"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("valueChangeListForStrategy"));
        $ic7$ = ConsesLow.list((SubLObject)module0433.TWO_INTEGER, (SubLObject)module0433.THREE_INTEGER, (SubLObject)module0433.FOUR_INTEGER);
        $ic8$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DaysDuration")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SomeExampleFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Integer"))));
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArgPositionFn")), (SubLObject)module0433.ONE_INTEGER);
        $ic10$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)module0433.FIFTEEN_INTEGER, (SubLObject)module0433.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(25), (SubLObject)SubLObjectFactory.makeInteger(30));
        $ic11$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DaysDuration"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#33823", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#33824", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("FORMULA-OPERATOR");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0433.class
	Total time: 117 ms
	
	Decompiled with Procyon 0.5.32.
*/