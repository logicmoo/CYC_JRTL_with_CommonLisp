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

public final class module0511 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0511";
    public static final String myFingerPrint = "378342b7ce86eaaecab32ea924fb3e7fc211e7ae628fafdb56acb993b841ac94";
    private static SubLSymbol $g3842$;
    private static SubLSymbol $g3843$;
    private static SubLSymbol $g3844$;
    private static SubLSymbol $g3845$;
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
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    
    public static SubLObject f32494() {
        return module0191.f11990((SubLObject)$ic1$, $g3842$.getGlobalValue(), $ic2$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32495(final SubLObject var1) {
        final SubLObject var2 = $g3843$.getGlobalValue();
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
    
    public static SubLObject f32496(final SubLObject var1, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = module0373.f26113();
        var16.resetMultipleValues();
        final SubLObject var18 = f32495(var1);
        final SubLObject var19 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        return module0409.f28508(var18, var15, var19, (SubLObject)ConsesLow.list(new SubLObject[] { $ic5$, var17, $ic6$, NIL, $ic7$, T, $ic8$, NIL, $ic9$, $ic10$ }));
    }
    
    public static SubLObject f32497(final SubLObject var20, SubLObject var21) {
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
            final SubLObject var27 = f32496(var26, (SubLObject)UNPROVIDED);
            if (NIL != var27) {
                final SubLObject var28 = (SubLObject)ConsesLow.list($ic13$, var26, module0193.f12079((SubLObject)ZERO_INTEGER));
                final SubLObject var29 = f32494();
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
    
    public static SubLObject f32498() {
        return module0191.f11990((SubLObject)$ic1$, $g3844$.getGlobalValue(), $ic2$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32499(final SubLObject var1) {
        final SubLObject var2 = $g3845$.getGlobalValue();
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
    
    public static SubLObject f32500(final SubLObject var1, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = module0373.f26113();
        var16.resetMultipleValues();
        final SubLObject var18 = f32499(var1);
        final SubLObject var19 = var16.secondMultipleValue();
        var16.resetMultipleValues();
        return module0409.f28508(var18, var15, var19, (SubLObject)ConsesLow.list(new SubLObject[] { $ic5$, var17, $ic6$, NIL, $ic7$, T, $ic8$, NIL, $ic9$, $ic10$ }));
    }
    
    public static SubLObject f32501(final SubLObject var20, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = (SubLObject)NIL;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = (SubLObject)$ic19$;
        var22.resetMultipleValues();
        final SubLObject var24 = module0337.f22630(var20, var23);
        final SubLObject var25 = var22.secondMultipleValue();
        var22.resetMultipleValues();
        if (NIL != var24) {
            final SubLObject var26 = module0035.f2294(var25, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var27 = f32500(var26, (SubLObject)UNPROVIDED);
            if (NIL != var27) {
                final SubLObject var28 = (SubLObject)ConsesLow.list($ic20$, var26, module0193.f12079((SubLObject)ONE_INTEGER));
                final SubLObject var29 = f32498();
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
                        final SubLObject var35_43 = module0235.f15474(var36, var20, (SubLObject)T, (SubLObject)T);
                        final SubLObject var37 = var22.secondMultipleValue();
                        var22.resetMultipleValues();
                        if (NIL != var35_43) {
                            module0347.f23330(var29, var35_43, ConsesLow.append(var35, var37));
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
    
    public static SubLObject f32502() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0511", "f32494", "S#35932", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0511", "f32495", "S#35933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0511", "f32496", "S#35934", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0511", "f32497", "S#35935", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0511", "f32498", "S#35936", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0511", "f32499", "S#35937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0511", "f32500", "S#35938", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0511", "f32501", "S#35939", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32503() {
        $g3842$ = SubLFiles.deflexical("S#35940", (SubLObject)$ic0$);
        $g3843$ = SubLFiles.deflexical("S#35941", (SubLObject)$ic3$);
        $g3844$ = SubLFiles.deflexical("S#35942", (SubLObject)$ic17$);
        $g3845$ = SubLFiles.deflexical("S#35943", (SubLObject)$ic18$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32504() {
        module0340.f22941((SubLObject)$ic15$, (SubLObject)$ic16$);
        module0340.f22941((SubLObject)$ic21$, (SubLObject)$ic22$);
        module0340.f22941((SubLObject)$ic23$, (SubLObject)$ic24$);
        module0340.f22941((SubLObject)$ic25$, (SubLObject)$ic26$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32502();
    }
    
    public void initializeVariables() {
        f32503();
    }
    
    public void runTopLevelForms() {
        f32504();
    }
    
    static {
        me = (SubLFile)new module0511();
        $g3842$ = null;
        $g3843$ = null;
        $g3844$ = null;
        $g3845$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("locatedAtPoint-SurfaceGeographical")), (SubLObject)makeSymbol("?PLACE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LatLongFn")), (SubLObject)makeSymbol("?LAT"), (SubLObject)makeSymbol("?LONG"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("latitude")), (SubLObject)makeSymbol("?PLACE"), (SubLObject)makeSymbol("?LAT")));
        $ic1$ = makeKeyword("CODE");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("GeographyMt"));
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("?PLACE")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?LAT"), (SubLObject)makeSymbol("?LONG")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?LONG"))), (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("locatedAtPoint-SurfaceGeographical")), (SubLObject)makeSymbol("?PLACE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LatLongFn")), (SubLObject)makeSymbol("?LAT"), (SubLObject)makeSymbol("?LONG"))))));
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35924", "CYC"), (SubLObject)makeSymbol("S#35925", "CYC"), (SubLObject)makeSymbol("S#35926", "CYC")), (SubLObject)makeSymbol("S#35927", "CYC"));
        $ic5$ = makeKeyword("PROBLEM-STORE");
        $ic6$ = makeKeyword("CONTINUABLE?");
        $ic7$ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $ic8$ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic9$ = makeKeyword("RETURN");
        $ic10$ = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic11$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("latitude")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35944", "CYC")), (SubLObject)makeKeyword("ANYTHING"));
        $ic12$ = makeSymbol("S#35944", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("latitude"));
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#35930", "CYC"), (SubLObject)makeSymbol("S#35931", "CYC"));
        $ic15$ = makeKeyword("REMOVAL-LATITUDE-VIA-LOCATION-POS");
        $ic16$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("latitude")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("latitude")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35935", "CYC"), makeKeyword("DOCUMENTATION"), makeString("checks for #$locatedAtPoint-SurfaceGeographical and returns the latitude from that"), makeKeyword("EXAMPLE"), makeString("(#$latitude #$CityOfSanFranciscoCA ?LONG)") });
        $ic17$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("locatedAtPoint-SurfaceGeographical")), (SubLObject)makeSymbol("?PLACE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LatLongFn")), (SubLObject)makeSymbol("?LAT"), (SubLObject)makeSymbol("?LONG"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("longitude")), (SubLObject)makeSymbol("?PLACE"), (SubLObject)makeSymbol("?LONG")));
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("?PLACE")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?LAT"), (SubLObject)makeSymbol("?LONG")), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?LAT"))), (SubLObject)ConsesLow.list((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("locatedAtPoint-SurfaceGeographical")), (SubLObject)makeSymbol("?PLACE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LatLongFn")), (SubLObject)makeSymbol("?LAT"), (SubLObject)makeSymbol("?LONG"))))));
        $ic19$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("longitude")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35944", "CYC")), (SubLObject)makeKeyword("ANYTHING"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("longitude"));
        $ic21$ = makeKeyword("REMOVAL-LONGITUDE-VIA-LOCATION-POS");
        $ic22$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("longitude")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("longitude")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35939", "CYC"), makeKeyword("DOCUMENTATION"), makeString("checks for #$locatedAtPoint-SurfaceGeographical and returns the longitude from that"), makeKeyword("EXAMPLE"), makeString("(#$longitude #$CityOfSanFranciscoCA ?LONG)") });
        $ic23$ = makeKeyword("REMOVAL-LONGITUDE-FROM-LAT-LONG-POS");
        $ic24$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("longitude")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("longitude")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LatLongFn")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("longitude")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LatLongFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35945", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35946", "CYC"))), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35945", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35946", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35945", "CYC"), (SubLObject)makeSymbol("S#35946", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("longitude")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LatLongFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35945", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35946", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35946", "CYC")))), makeKeyword("DOCUMENTATION"), makeString("(#$longitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)"), makeKeyword("EXAMPLE"), makeString("(#$longitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)") });
        $ic25$ = makeKeyword("REMOVAL-LATITUDE-FROM-LAT-LONG-POS");
        $ic26$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("latitude")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("latitude")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LatLongFn")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("latitude")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LatLongFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35945", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35946", "CYC"))), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35945", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35946", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#35945", "CYC"), (SubLObject)makeSymbol("S#35946", "CYC")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("latitude")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("LatLongFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35945", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35946", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35945", "CYC")))), makeKeyword("DOCUMENTATION"), makeString("(#$latitude (#$LatLongFn <fully-bound> <fully-bound>) :anything)"), makeKeyword("EXAMPLE"), makeString("(#$latitude \n  (#$LatLongFn (#$Degree-UnitOfAngularMeasure 30) (#$Degree-UnitOfAngularMeasure -97))\n  ?LONG)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 150 ms
	
	Decompiled with Procyon 0.5.32.
*/