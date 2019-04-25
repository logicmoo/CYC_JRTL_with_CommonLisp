package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return module0191.f11990((SubLObject)$ic1$, $g3847$.getGlobalValue(), $ic2$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32516(final SubLObject var1) {
        final SubLObject var2 = $g3848$.getGlobalValue();
        final SubLObject var3 = (SubLObject)ConsesLow.list(var1);
        SubLObject var5;
        final SubLObject var4 = var5 = var2;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic4$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic4$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic4$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic4$);
        var9 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            var5 = var6;
            SubLObject var10 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic4$);
            var10 = var5.first();
            var5 = var5.rest();
            if (NIL == var5) {
                final SubLObject var11 = module0510.f32487(var7, var3);
                final SubLObject var12 = module0233.f15362(var11, var10);
                final SubLObject var13 = module0510.f32488(var8, var12);
                final SubLObject var14 = module0510.f32488(var8, var9);
                return Values.values(var13, var14);
            }
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic4$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic4$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32517(final SubLObject var1, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = module0373.f26113();
        var16.resetMultipleValues();
        final SubLObject var18 = f32516(var1);
        final SubLObject var19 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        return module0409.f28508(var18, var15, var19, (SubLObject)ConsesLow.list(new SubLObject[] { $ic5$, var17, $ic6$, NIL, $ic7$, T, $ic8$, NIL, $ic9$, $ic10$ }));
    }
    
    public static SubLObject f32518(final SubLObject var20, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = (SubLObject)$ic11$;
        var22.resetMultipleValues();
        final SubLObject var24 = module0337.f22630(var20, var23);
        final SubLObject var25 = var22.secondMultipleValue();
        var22.resetMultipleValues();
        if (NIL != var24) {
            final SubLObject var26 = module0035.f2294(var25, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var27 = f32517(var26, (SubLObject)UNPROVIDED);
            if (NIL != var27) {
                final SubLObject var28 = (SubLObject)ConsesLow.list($ic13$, var26, (SubLObject)ConsesLow.list(module0193.f12079((SubLObject)ZERO_INTEGER), module0193.f12079((SubLObject)ONE_INTEGER)), (SubLObject)ConsesLow.list(module0193.f12079((SubLObject)ZERO_INTEGER), module0193.f12079((SubLObject)TWO_INTEGER)));
                final SubLObject var29 = f32515();
                SubLObject var30 = var27;
                SubLObject var31 = (SubLObject)NIL;
                var31 = var30.first();
                while (NIL != var30) {
                    SubLObject var33;
                    final SubLObject var32 = var33 = var31;
                    SubLObject var34 = (SubLObject)NIL;
                    SubLObject var35 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic14$);
                    var34 = var33.first();
                    var33 = var33.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)$ic14$);
                    var35 = var33.first();
                    var33 = var33.rest();
                    if (NIL == var33) {
                        final SubLObject var36 = module0233.f15362(var34, var28);
                        var22.resetMultipleValues();
                        final SubLObject var35_36 = module0235.f15474(var36, var20, (SubLObject)T, (SubLObject)T);
                        final SubLObject var37 = var22.secondMultipleValue();
                        var22.resetMultipleValues();
                        if (NIL != var35_36) {
                            module0347.f23330(var29, var35_36, ConsesLow.append(var35, var37));
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)$ic14$);
                    }
                    var30 = var30.rest();
                    var31 = var30.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32519() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0514", "f32515", "S#35954", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0514", "f32516", "S#35955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0514", "f32517", "S#35956", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0514", "f32518", "S#35957", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32520() {
        $g3847$ = SubLFiles.deflexical("S#35958", (SubLObject)$ic0$);
        $g3848$ = SubLFiles.deflexical("S#35959", (SubLObject)$ic3$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32521() {
        module0340.f22941((SubLObject)$ic15$, (SubLObject)$ic16$);
        return (SubLObject)NIL;
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
        $g3847$ = null;
        $g3848$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?UNIT"), constant_handles_oc.f8479((SubLObject)makeString("UnitOfMeasure"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), (SubLObject)makeSymbol("?UNIT"), (SubLObject)makeSymbol("?NAT")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeSymbol("?MIN-VALUE"), (SubLObject)ONE_INTEGER, (SubLObject)makeSymbol("?NAT")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeSymbol("?MAX-VALUE"), (SubLObject)TWO_INTEGER, (SubLObject)makeSymbol("?NAT"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("intervalRange")), (SubLObject)makeSymbol("?NAT"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?UNIT"), (SubLObject)makeSymbol("?MIN-VALUE")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?UNIT"), (SubLObject)makeSymbol("?MAX-VALUE"))));
        $ic1$ = makeKeyword("CODE");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("?NAT")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?UNIT"), (SubLObject)makeSymbol("?MIN-VALUE"), (SubLObject)makeSymbol("?MAX-VALUE")), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?UNIT"), constant_handles_oc.f8479((SubLObject)makeString("UnitOfMeasure"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("operatorFormulas")), (SubLObject)makeSymbol("?UNIT"), (SubLObject)makeSymbol("?NAT")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeSymbol("?MIN-VALUE"), (SubLObject)ONE_INTEGER, (SubLObject)makeSymbol("?NAT")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("argN")), (SubLObject)makeSymbol("?MAX-VALUE"), (SubLObject)TWO_INTEGER, (SubLObject)makeSymbol("?NAT")))));
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35924", "CYC"), (SubLObject)makeSymbol("S#35925", "CYC"), (SubLObject)makeSymbol("S#35926", "CYC")), (SubLObject)makeSymbol("S#35927", "CYC"));
        $ic5$ = makeKeyword("PROBLEM-STORE");
        $ic6$ = makeKeyword("CONTINUABLE?");
        $ic7$ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $ic8$ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic9$ = makeKeyword("RETURN");
        $ic10$ = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic11$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("intervalRange")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35960", "CYC")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"));
        $ic12$ = makeSymbol("S#35960", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("intervalRange"));
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#35930", "CYC"), (SubLObject)makeSymbol("S#35931", "CYC"));
        $ic15$ = makeKeyword("REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS");
        $ic16$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("intervalRange")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("intervalRange")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35957", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$intervalRange <fully-bound> <whatever> <whatever>)\n    using min and max values from the arg1."), makeKeyword("EXAMPLE"), makeString("(#$intervalRange (#$YearsDuration 1 19) ?LOW ?HIGH)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 97 ms
	
	Decompiled with Procyon 0.5.32.
*/