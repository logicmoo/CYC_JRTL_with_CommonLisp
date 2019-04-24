package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0514 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0514";
    public static final String myFingerPrint = "27149929ea9e4ef6b4555a4a195c17d1af326bb07ffb22177df1b7663afdbb1c";
    private static SubLSymbol $g3847$;
    private static SubLSymbol $g3848$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    
    public static SubLObject f32515() {
        return module0191.f11990((SubLObject)module0514.$ic1$, module0514.$g3847$.getGlobalValue(), module0514.$ic2$, (SubLObject)module0514.UNPROVIDED);
    }
    
    public static SubLObject f32516(final SubLObject var1) {
        final SubLObject var2 = module0514.$g3848$.getGlobalValue();
        final SubLObject var3 = (SubLObject)ConsesLow.list(var1);
        SubLObject var5;
        final SubLObject var4 = var5 = var2;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0514.$ic4$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0514.NIL;
        SubLObject var8 = (SubLObject)module0514.NIL;
        SubLObject var9 = (SubLObject)module0514.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0514.$ic4$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0514.$ic4$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0514.$ic4$);
        var9 = var5.first();
        var5 = var5.rest();
        if (module0514.NIL == var5) {
            var5 = var6;
            SubLObject var10 = (SubLObject)module0514.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0514.$ic4$);
            var10 = var5.first();
            var5 = var5.rest();
            if (module0514.NIL == var5) {
                final SubLObject var11 = module0510.f32487(var7, var3);
                final SubLObject var12 = module0233.f15362(var11, var10);
                final SubLObject var13 = module0510.f32488(var8, var12);
                final SubLObject var14 = module0510.f32488(var8, var9);
                return Values.values(var13, var14);
            }
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0514.$ic4$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0514.$ic4$);
        }
        return (SubLObject)module0514.NIL;
    }
    
    public static SubLObject f32517(final SubLObject var1, SubLObject var15) {
        if (var15 == module0514.UNPROVIDED) {
            var15 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = module0373.f26113();
        var16.resetMultipleValues();
        final SubLObject var18 = f32516(var1);
        final SubLObject var19 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        return module0409.f28508(var18, var15, var19, (SubLObject)ConsesLow.list(new SubLObject[] { module0514.$ic5$, var17, module0514.$ic6$, module0514.NIL, module0514.$ic7$, module0514.T, module0514.$ic8$, module0514.NIL, module0514.$ic9$, module0514.$ic10$ }));
    }
    
    public static SubLObject f32518(final SubLObject var20, SubLObject var21) {
        if (var21 == module0514.UNPROVIDED) {
            var21 = (SubLObject)module0514.NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = (SubLObject)module0514.$ic11$;
        var22.resetMultipleValues();
        final SubLObject var24 = module0337.f22630(var20, var23);
        final SubLObject var25 = var22.secondMultipleValue();
        var22.resetMultipleValues();
        if (module0514.NIL != var24) {
            final SubLObject var26 = module0035.f2294(var25, (SubLObject)module0514.$ic12$, (SubLObject)module0514.UNPROVIDED, (SubLObject)module0514.UNPROVIDED);
            final SubLObject var27 = f32517(var26, (SubLObject)module0514.UNPROVIDED);
            if (module0514.NIL != var27) {
                final SubLObject var28 = (SubLObject)ConsesLow.list(module0514.$ic13$, var26, (SubLObject)ConsesLow.list(module0193.f12079((SubLObject)module0514.ZERO_INTEGER), module0193.f12079((SubLObject)module0514.ONE_INTEGER)), (SubLObject)ConsesLow.list(module0193.f12079((SubLObject)module0514.ZERO_INTEGER), module0193.f12079((SubLObject)module0514.TWO_INTEGER)));
                final SubLObject var29 = f32515();
                SubLObject var30 = var27;
                SubLObject var31 = (SubLObject)module0514.NIL;
                var31 = var30.first();
                while (module0514.NIL != var30) {
                    SubLObject var33;
                    final SubLObject var32 = var33 = var31;
                    SubLObject var34 = (SubLObject)module0514.NIL;
                    SubLObject var35 = (SubLObject)module0514.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0514.$ic14$);
                    var34 = var33.first();
                    var33 = var33.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0514.$ic14$);
                    var35 = var33.first();
                    var33 = var33.rest();
                    if (module0514.NIL == var33) {
                        final SubLObject var36 = module0233.f15362(var34, var28);
                        var22.resetMultipleValues();
                        final SubLObject var35_36 = module0235.f15474(var36, var20, (SubLObject)module0514.T, (SubLObject)module0514.T);
                        final SubLObject var37 = var22.secondMultipleValue();
                        var22.resetMultipleValues();
                        if (module0514.NIL != var35_36) {
                            module0347.f23330(var29, var35_36, ConsesLow.append(var35, var37));
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0514.$ic14$);
                    }
                    var30 = var30.rest();
                    var31 = var30.first();
                }
            }
        }
        return (SubLObject)module0514.NIL;
    }
    
    public static SubLObject f32519() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0514", "f32515", "S#35954", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0514", "f32516", "S#35955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0514", "f32517", "S#35956", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0514", "f32518", "S#35957", 1, 1, false);
        return (SubLObject)module0514.NIL;
    }
    
    public static SubLObject f32520() {
        module0514.$g3847$ = SubLFiles.deflexical("S#35958", (SubLObject)module0514.$ic0$);
        module0514.$g3848$ = SubLFiles.deflexical("S#35959", (SubLObject)module0514.$ic3$);
        return (SubLObject)module0514.NIL;
    }
    
    public static SubLObject f32521() {
        module0340.f22941((SubLObject)module0514.$ic15$, (SubLObject)module0514.$ic16$);
        return (SubLObject)module0514.NIL;
    }
    
    public void declareFunctions() {
        f32519();
    }
    
    public void initializeVariables() {
        f32520();
    }
    
    public void runTopLevelForms() {
        f32521();
    }
    
    static {
        me = (SubLFile)new module0514();
        module0514.$g3847$ = null;
        module0514.$g3848$ = null;
        $ic0$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("operatorFormulas")), (SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("argN")), (SubLObject)SubLObjectFactory.makeSymbol("?MIN-VALUE"), (SubLObject)module0514.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("argN")), (SubLObject)SubLObjectFactory.makeSymbol("?MAX-VALUE"), (SubLObject)module0514.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("intervalRange")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("?MIN-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("?MAX-VALUE"))));
        $ic1$ = SubLObjectFactory.makeKeyword("CODE");
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NAT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("?MIN-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("?MAX-VALUE")), (SubLObject)module0514.NIL), (SubLObject)ConsesLow.list((SubLObject)module0514.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("operatorFormulas")), (SubLObject)SubLObjectFactory.makeSymbol("?UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("argN")), (SubLObject)SubLObjectFactory.makeSymbol("?MIN-VALUE"), (SubLObject)module0514.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("argN")), (SubLObject)SubLObjectFactory.makeSymbol("?MAX-VALUE"), (SubLObject)module0514.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT")))));
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35924", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#35925", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#35926", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#35927", "CYC"));
        $ic5$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic6$ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $ic7$ = SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $ic8$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic9$ = SubLObjectFactory.makeKeyword("RETURN");
        $ic10$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic11$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("intervalRange")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35960", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#35960", "CYC");
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("intervalRange"));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#35930", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#35931", "CYC"));
        $ic15$ = SubLObjectFactory.makeKeyword("REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS");
        $ic16$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("intervalRange")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("intervalRange")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0514.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35957", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$intervalRange <fully-bound> <whatever> <whatever>)\n    using min and max values from the arg1."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$intervalRange (#$YearsDuration 1 19) ?LOW ?HIGH)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0514.class
	Total time: 97 ms
	
	Decompiled with Procyon 0.5.32.
*/