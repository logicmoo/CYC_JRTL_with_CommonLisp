package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0519 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0519";
    public static final String myFingerPrint = "8b9f51f4fdcaa3b9a6024ba4df93da10bb10782dce68519eec8b6a838e86c7c6";
    private static SubLSymbol $g3852$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLList $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    
    public static SubLObject f32589(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = $ic0$;
        if (NIL != module0158.f10010(var1, (SubLObject)ONE_INTEGER, var3)) {
            final SubLObject var4 = module0158.f10011(var1, (SubLObject)ONE_INTEGER, var3);
            SubLObject var5 = (SubLObject)NIL;
            final SubLObject var6 = (SubLObject)NIL;
            while (NIL == var5) {
                final SubLObject var7 = module0052.f3695(var4, var6);
                final SubLObject var8 = (SubLObject)makeBoolean(!var6.eql(var7));
                if (NIL != var8) {
                    SubLObject var9 = (SubLObject)NIL;
                    try {
                        var9 = module0158.f10316(var7, (SubLObject)$ic1$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var5_10 = (SubLObject)NIL;
                        final SubLObject var6_11 = (SubLObject)NIL;
                        while (NIL == var5_10) {
                            final SubLObject var10 = module0052.f3695(var9, var6_11);
                            final SubLObject var8_13 = (SubLObject)makeBoolean(!var6_11.eql(var10));
                            if (NIL != var8_13) {
                                final SubLObject var11 = module0178.f11338(var10);
                                if (NIL != module0610.f37292(var11, var2)) {
                                    return (SubLObject)ConsesLow.list(module0178.f11335(var10), module0178.f11336(var10), module0178.f11337(var10));
                                }
                            }
                            var5_10 = (SubLObject)makeBoolean(NIL == var8_13);
                        }
                    }
                    finally {
                        final SubLObject var12 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var9) {
                                module0158.f10319(var9);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var12);
                        }
                    }
                }
                var5 = (SubLObject)makeBoolean(NIL == var8);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32590(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = f32589(var1, var2);
        final SubLObject var4 = module0610.f37207($ic3$, var2.first(), conses_high.second(var2), (SubLObject)UNPROVIDED);
        if (NIL != var3) {
            SubLObject var6;
            final SubLObject var5 = var6 = var3;
            SubLObject var7 = (SubLObject)NIL;
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic4$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic4$);
            var8 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic4$);
            var9 = var6.first();
            var6 = var6.rest();
            if (NIL == var6) {
                return Numbers.expt((SubLObject)TEN_INTEGER, Numbers.subtract(var7, Numbers.divide(var8, Numbers.add(var9, var4))));
            }
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic4$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32591(final SubLObject var1, final SubLObject var23) {
        final SubLObject var24 = $ic5$;
        if (NIL != module0158.f10010(var1, (SubLObject)ONE_INTEGER, var24)) {
            final SubLObject var25 = module0158.f10011(var1, (SubLObject)ONE_INTEGER, var24);
            SubLObject var26 = (SubLObject)NIL;
            final SubLObject var27 = (SubLObject)NIL;
            while (NIL == var26) {
                final SubLObject var28 = module0052.f3695(var25, var27);
                final SubLObject var29 = (SubLObject)makeBoolean(!var27.eql(var28));
                if (NIL != var29) {
                    SubLObject var30 = (SubLObject)NIL;
                    try {
                        var30 = module0158.f10316(var28, (SubLObject)$ic1$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var5_24 = (SubLObject)NIL;
                        final SubLObject var6_25 = (SubLObject)NIL;
                        while (NIL == var5_24) {
                            final SubLObject var31 = module0052.f3695(var30, var6_25);
                            final SubLObject var8_26 = (SubLObject)makeBoolean(!var6_25.eql(var31));
                            if (NIL != var8_26) {
                                final SubLObject var32 = module0178.f11338(var31);
                                if (NIL != module0610.f37292(var32, var23)) {
                                    return (SubLObject)ConsesLow.list(module0178.f11335(var31), module0178.f11336(var31), module0178.f11337(var31));
                                }
                            }
                            var5_24 = (SubLObject)makeBoolean(NIL == var8_26);
                        }
                    }
                    finally {
                        final SubLObject var33 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var30) {
                                module0158.f10319(var30);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var33);
                        }
                    }
                }
                var26 = (SubLObject)makeBoolean(NIL == var29);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32592(final SubLObject var1, final SubLObject var23) {
        final SubLObject var24 = f32591(var1, var23);
        final SubLObject var25 = module0610.f37207($ic6$, var23.first(), conses_high.second(var23), (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            SubLObject var27;
            final SubLObject var26 = var27 = var24;
            SubLObject var28 = (SubLObject)NIL;
            SubLObject var29 = (SubLObject)NIL;
            SubLObject var30 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic4$);
            var28 = var27.first();
            var27 = var27.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic4$);
            var29 = var27.first();
            var27 = var27.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)$ic4$);
            var30 = var27.first();
            var27 = var27.rest();
            if (NIL == var27) {
                return Numbers.subtract(Numbers.divide(var29, Numbers.subtract(var28, Numbers.log(var25, (SubLObject)TEN_INTEGER))), var30);
            }
            cdestructuring_bind.cdestructuring_bind_error(var26, (SubLObject)$ic4$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32593(final SubLObject var31, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        final SubLObject var33 = module0205.f13387(var31, (SubLObject)UNPROVIDED);
        final SubLObject var34 = module0205.f13388(var31, (SubLObject)UNPROVIDED);
        final SubLObject var35 = module0205.f13389(var31, (SubLObject)UNPROVIDED);
        final SubLObject var36 = f32590(var33, var34);
        if (var36.isNumber()) {
            final SubLObject var37 = module0202.f12643($ic6$, var36);
            final SubLObject var38 = module0610.f37232(var35, var37);
            if (NIL != var38) {
                module0347.f23330(module0191.f11990((SubLObject)$ic13$, (SubLObject)ConsesLow.list($ic7$, var33, var34, var37), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var38, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32594(final SubLObject var31, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        final SubLObject var33 = module0205.f13387(var31, (SubLObject)UNPROVIDED);
        final SubLObject var34 = module0205.f13389(var31, (SubLObject)UNPROVIDED);
        final SubLObject var35 = module0205.f13388(var31, (SubLObject)UNPROVIDED);
        final SubLObject var36 = f32592(var33, var34);
        if (var36.isNumber()) {
            final SubLObject var37 = module0202.f12643($ic3$, var36);
            final SubLObject var38 = module0610.f37232(var35, var37);
            if (NIL != var38) {
                module0347.f23330(module0191.f11990((SubLObject)$ic13$, (SubLObject)ConsesLow.list($ic7$, var33, var37, var34), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var38, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32595() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0519", "f32589", "S#36031", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0519", "f32590", "S#36032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0519", "f32591", "S#36033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0519", "f32592", "S#36034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0519", "f32593", "S#36035", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0519", "f32594", "S#36036", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32596() {
        $g3852$ = SubLFiles.defparameter("S#36037", module0018.$g660$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32597() {
        module0340.f22938($ic7$);
        module0358.f23771((SubLObject)$ic8$, $ic7$, (SubLObject)ONE_INTEGER);
        module0358.f23730((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0340.f22941((SubLObject)$ic14$, (SubLObject)$ic15$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32595();
    }
    
    public void initializeVariables() {
        f32596();
    }
    
    public void runTopLevelForms() {
        f32597();
    }
    
    static {
        me = (SubLFile)new module0519();
        $g3852$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("antoineEquationParametersForTypeAndInterval"));
        $ic1$ = makeKeyword("GAF");
        $ic2$ = makeSymbol("S#5859", "CYC");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("DegreeCelsius"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#173", "CYC"), (SubLObject)makeSymbol("S#174", "CYC"), (SubLObject)makeSymbol("S#9181", "CYC"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("antoineEquationParametersForTypeAndPressureInterval"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("MM-Hg"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("typeHasBoilingPoint-TemperatureAtPressure"));
        $ic8$ = makeKeyword("POS");
        $ic9$ = makeKeyword("TYPE-HAS-BOILING-POINT-EITHER-ARG2-OR-ARG3-BINDABLE");
        $ic10$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("typeHasBoilingPoint-TemperatureAtPressure")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.listS(constant_handles_oc.f8479((SubLObject)makeString("typeHasBoilingPoint-TemperatureAtPressure")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#26437", "CYC"));
        $ic11$ = makeKeyword("REMOVAL-TYPE-HAS-BOILING-POINT-TEMPERATURE-AT-PRESSURE");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("typeHasBoilingPoint-TemperatureAtPressure")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("typeHasBoilingPoint-TemperatureAtPressure")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36037", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36035", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$typeHasBoilingPoint-TemperatureAtPressure <fully-bound-p> <fully-bound-p> ?PRESSURE)"), makeKeyword("EXAMPLE"), makeString("(#$typeHasBoilingPoint-TemperatureAtPressure #$Water (#$DegreeCelsius 100) ?PRESSURE)") });
        $ic13$ = makeKeyword("OPAQUE");
        $ic14$ = makeKeyword("REMOVAL-TYPE-HAS-BOILING-POINT-PRESSURE-AT-TEMPERATURE");
        $ic15$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("typeHasBoilingPoint-TemperatureAtPressure")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("typeHasBoilingPoint-TemperatureAtPressure")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36037", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36036", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$typeHasBoilingPoint-TemperatureAtPressure <fully-bound-p> ?TEMPERATURE <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$typeHasBoilingPoint-TemperatureAtPressure #$Water ?TEMPERATURE (#$Atmosphere-UnitOfPressure 1))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 137 ms
	
	Decompiled with Procyon 0.5.32.
*/