package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
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

public final class module0510 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0510";
    public static final String myFingerPrint = "d2ee654c571e6d0047ce1fcfe62c338c7d52249e23011597b0d1d5728aefe5bf";
    private static SubLSymbol $g3840$;
    private static SubLSymbol $g3841$;
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
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    
    public static SubLObject f32485() {
        return module0191.f11990((SubLObject)$ic1$, $g3840$.getGlobalValue(), $ic2$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32486(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = $g3841$.getGlobalValue();
        final SubLObject var4 = (SubLObject)ConsesLow.list(var1, var2);
        SubLObject var6;
        final SubLObject var5 = var6 = var3;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic4$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic4$);
        var8 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic4$);
        var9 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic4$);
        var10 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            var6 = var7;
            SubLObject var11 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic4$);
            var11 = var6.first();
            var6 = var6.rest();
            if (NIL == var6) {
                final SubLObject var12 = f32487(var8, var4);
                final SubLObject var13 = module0233.f15362(var12, var11);
                final SubLObject var14 = f32488(var9, var13);
                final SubLObject var15 = f32488(var9, var10);
                return Values.values(var14, var15);
            }
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic4$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic4$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32489(final SubLObject var1, final SubLObject var2, SubLObject var16) {
        if (var16 == UNPROVIDED) {
            var16 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0373.f26113();
        var17.resetMultipleValues();
        final SubLObject var19 = f32486(var1, var2);
        final SubLObject var20 = var17.secondMultipleValue();
        var17.resetMultipleValues();
        return module0409.f28508(var19, var16, var20, (SubLObject)ConsesLow.list(new SubLObject[] { $ic5$, var18, $ic6$, NIL, $ic7$, T, $ic8$, NIL, $ic9$, $ic10$ }));
    }
    
    public static SubLObject f32490(final SubLObject var21, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = (SubLObject)$ic11$;
        var23.resetMultipleValues();
        final SubLObject var25 = module0337.f22630(var21, var24);
        final SubLObject var26 = var23.secondMultipleValue();
        var23.resetMultipleValues();
        if (NIL != var25) {
            final SubLObject var27 = module0035.f2294(var26, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var28 = module0035.f2294(var26, (SubLObject)$ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var29 = f32489(var28, var27, (SubLObject)UNPROVIDED);
            if (NIL != var29) {
                final SubLObject var30 = (SubLObject)ConsesLow.list($ic14$, var28, var27, module0193.f12079((SubLObject)ZERO_INTEGER));
                final SubLObject var31 = f32485();
                SubLObject var32 = var29;
                SubLObject var33 = (SubLObject)NIL;
                var33 = var32.first();
                while (NIL != var32) {
                    SubLObject var35;
                    final SubLObject var34 = var35 = var33;
                    SubLObject var36 = (SubLObject)NIL;
                    SubLObject var37 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic15$);
                    var36 = var35.first();
                    var35 = var35.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)$ic15$);
                    var37 = var35.first();
                    var35 = var35.rest();
                    if (NIL == var35) {
                        final SubLObject var38 = module0233.f15362(var36, var30);
                        var23.resetMultipleValues();
                        final SubLObject var36_37 = module0235.f15474(var38, var21, (SubLObject)T, (SubLObject)T);
                        final SubLObject var39 = var23.secondMultipleValue();
                        var23.resetMultipleValues();
                        if (NIL != var36_37) {
                            module0347.f23330(var31, var36_37, ConsesLow.append(var37, var39));
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)$ic15$);
                    }
                    var32 = var32.rest();
                    var33 = var32.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32487(final SubLObject var39, final SubLObject var40) {
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var42_43 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        SubLObject var45_46 = (SubLObject)NIL;
        var42 = var39;
        var42_43 = var42.first();
        var43 = var40;
        var45_46 = var43.first();
        while (NIL != var43 || NIL != var42) {
            var41 = module0233.f15345(var42_43, var45_46, var41);
            var42 = var42.rest();
            var42_43 = var42.first();
            var43 = var43.rest();
            var45_46 = var43.first();
        }
        return Sequences.nreverse(var41);
    }
    
    public static SubLObject f32488(final SubLObject var47, SubLObject var48) {
        var48 = conses_high.copy_tree(var48);
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = (SubLObject)NIL;
        var49 = var47;
        var50 = var49.first();
        for (var51 = (SubLObject)ZERO_INTEGER; NIL != var49; var49 = var49.rest(), var50 = var49.first(), var51 = Numbers.add((SubLObject)ONE_INTEGER, var51)) {
            final SubLObject var52 = module0193.f12079(var51);
            var48 = conses_high.nsubst(var52, var50, var48, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        }
        return var48;
    }
    
    public static SubLObject f32491() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0510", "f32485", "S#35917", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0510", "f32486", "S#35918", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0510", "f32489", "S#35919", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0510", "f32490", "S#35920", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0510", "f32487", "S#35178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0510", "f32488", "S#35921", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32492() {
        $g3840$ = SubLFiles.deflexical("S#35922", (SubLObject)$ic0$);
        $g3841$ = SubLFiles.deflexical("S#35923", (SubLObject)$ic3$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32493() {
        module0340.f22941((SubLObject)$ic16$, (SubLObject)$ic17$);
        module0358.f23730((SubLObject)$ic18$, (SubLObject)$ic19$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32491();
    }
    
    public void initializeVariables() {
        f32492();
    }
    
    public void runTopLevelForms() {
        f32493();
    }
    
    static {
        me = (SubLFile)new module0510();
        $g3840$ = null;
        $g3841$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("latitude")), (SubLObject)makeSymbol("?LOC1"), (SubLObject)makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("longitude")), (SubLObject)makeSymbol("?LOC1"), (SubLObject)makeSymbol("?LONG1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("latitude")), (SubLObject)makeSymbol("?LOC2"), (SubLObject)makeSymbol("?LAT2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("longitude")), (SubLObject)makeSymbol("?LOC2"), (SubLObject)makeSymbol("?LONG2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("evaluate")), (SubLObject)makeSymbol("?TIMESFN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TimesFn")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PerFn")), constant_handles_oc.f8479((SubLObject)makeString("Mile")), constant_handles_oc.f8479((SubLObject)makeString("Radian"))), (SubLObject)makeDouble(3980.91)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ArcCosineFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PlusFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SineFn")), (SubLObject)makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SineFn")), (SubLObject)makeSymbol("?LAT2"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CosineFn")), (SubLObject)makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CosineFn")), (SubLObject)makeSymbol("?LAT2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CosineFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("DifferenceFn")), (SubLObject)makeSymbol("?LONG2"), (SubLObject)makeSymbol("?LONG1"))))))))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("distanceBetween")), (SubLObject)makeSymbol("?LOC1"), (SubLObject)makeSymbol("?LOC2"), (SubLObject)makeSymbol("?TIMESFN")));
        $ic1$ = makeKeyword("CODE");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("GeographyMt"));
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("?LOC1"), (SubLObject)makeSymbol("?LOC2")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?TIMESFN"), (SubLObject)makeSymbol("?LAT1"), (SubLObject)makeSymbol("?LONG1"), (SubLObject)makeSymbol("?LAT2"), (SubLObject)makeSymbol("?LONG2")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?LAT1"), (SubLObject)makeSymbol("?LONG1"), (SubLObject)makeSymbol("?LAT2"), (SubLObject)makeSymbol("?LONG2"))), (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("latitude")), (SubLObject)makeSymbol("?LOC1"), (SubLObject)makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("longitude")), (SubLObject)makeSymbol("?LOC1"), (SubLObject)makeSymbol("?LONG1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("latitude")), (SubLObject)makeSymbol("?LOC2"), (SubLObject)makeSymbol("?LAT2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("longitude")), (SubLObject)makeSymbol("?LOC2"), (SubLObject)makeSymbol("?LONG2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("evaluate")), (SubLObject)makeSymbol("?TIMESFN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TimesFn")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PerFn")), constant_handles_oc.f8479((SubLObject)makeString("Mile")), constant_handles_oc.f8479((SubLObject)makeString("Radian"))), (SubLObject)makeDouble(3980.91)), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ArcCosineFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PlusFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SineFn")), (SubLObject)makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SineFn")), (SubLObject)makeSymbol("?LAT2"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TimesFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CosineFn")), (SubLObject)makeSymbol("?LAT1")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CosineFn")), (SubLObject)makeSymbol("?LAT2")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CosineFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("DifferenceFn")), (SubLObject)makeSymbol("?LONG2"), (SubLObject)makeSymbol("?LONG1")))))))))));
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35924", "CYC"), (SubLObject)makeSymbol("S#35925", "CYC"), (SubLObject)makeSymbol("S#35926", "CYC")), (SubLObject)makeSymbol("S#35927", "CYC"));
        $ic5$ = makeKeyword("PROBLEM-STORE");
        $ic6$ = makeKeyword("CONTINUABLE?");
        $ic7$ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $ic8$ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic9$ = makeKeyword("RETURN");
        $ic10$ = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic11$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("distanceBetween")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35928", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35929", "CYC")), (SubLObject)makeKeyword("ANYTHING"));
        $ic12$ = makeSymbol("S#35929", "CYC");
        $ic13$ = makeSymbol("S#35928", "CYC");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("distanceBetween"));
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("S#35930", "CYC"), (SubLObject)makeSymbol("S#35931", "CYC"));
        $ic16$ = makeKeyword("REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS");
        $ic17$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("distanceBetween")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("distanceBetween")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35920", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$distanceBetween <fully-bound> <fully-bound> <whatever>)\n    by computing the Great Circle distance using \n    #$latitude and #$longitude information about ARG1 and ARG2"), makeKeyword("EXAMPLE"), makeString("(#$distanceBetween #$CityOfAnchorageAK #$CityOfSanFranciscoCA ?DIST)") });
        $ic18$ = makeKeyword("DISTANCE-BETWEEN-POS");
        $ic19$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("distanceBetween")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("distanceBetween")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("PREFERRED"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 134 ms
	
	Decompiled with Procyon 0.5.32.
*/