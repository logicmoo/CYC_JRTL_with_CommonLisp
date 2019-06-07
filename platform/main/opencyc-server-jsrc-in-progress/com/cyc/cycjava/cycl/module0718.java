package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0718 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0718";
    public static final String myFingerPrint = "d00f35e11eac0fdbba0292a70ebfc1db17a5f8d5b1cdaebc5473c4ee6d283b19";
    public static SubLSymbol $g5675$;
    public static SubLSymbol $g5676$;
    public static SubLSymbol $g5677$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    
    public static SubLObject f44008(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        if (NIL == var1) {
            return $g5677$.getGlobalValue();
        }
        if (var1 == $ic2$) {
            return $g5675$.getGlobalValue();
        }
        if (var1 == $ic3$) {
            return $g5676$.getGlobalValue();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44009(final SubLObject var2) {
        assert NIL != assertion_handles_oc.f11035(var2) : var2;
        if (NIL != module0004.f104(module0205.f13132(module0178.f11303(var2)), f44008((SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44010(final SubLObject var2) {
        assert NIL != f44009(var2) : var2;
        return var2;
    }
    
    public static SubLObject f44011(final SubLObject var2) {
        assert NIL != f44009(var2) : var2;
        return assertion_handles_oc.f11025(var2);
    }
    
    public static SubLObject f44012(final SubLObject var3) {
        return assertion_handles_oc.f11053(var3);
    }
    
    public static SubLObject f44013(final SubLObject var2) {
        assert NIL != f44009(var2) : var2;
        final SubLObject var3 = module0178.f11303(var2);
        return module0205.f13132(var3);
    }
    
    public static SubLObject f44014(final SubLObject var2) {
        assert NIL != f44009(var2) : var2;
        final SubLObject var3 = module0178.f11303(var2);
        return module0205.f13203(var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44015(final SubLObject var2) {
        assert NIL != f44009(var2) : var2;
        final SubLObject var3 = module0178.f11303(var2);
        return module0205.f13204(var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44016(final SubLObject var2) {
        assert NIL != f44009(var2) : var2;
        return module0178.f11287(var2);
    }
    
    public static SubLObject f44017(final SubLObject var2, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        assert NIL != f44009(var2) : var2;
        final SubLObject var6 = f44015(var2);
        SubLObject var7 = (SubLObject)NIL;
        if ($ic6$.equal(module0205.f13132(var6)) || $ic7$.equal(module0205.f13132(var6))) {
            var7 = conses_high.copy_tree(module0205.f13207(var6, (SubLObject)UNPROVIDED));
        }
        else {
            var7 = module0259.f16848(var6, var5, (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f44018(final SubLObject var2) {
        assert NIL != f44009(var2) : var2;
        final SubLObject var3 = f44016(var2);
        return f44017(var2, var3);
    }
    
    public static SubLObject f44019(final SubLObject var8, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = Sequences.nreverse(Sort.sort(var8, Symbols.symbol_function((SubLObject)$ic8$), (SubLObject)UNPROVIDED));
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            var10 = (SubLObject)ConsesLow.cons(f44020(var13), var10);
            var12 = var12.rest();
            var13 = var12.first();
        }
        var11 = Functions.apply(Symbols.symbol_function((SubLObject)$ic9$), var10);
        var11 = module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic10$), var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var11 = module0256.f16529(var11, var5, (SubLObject)UNPROVIDED);
        var9 = f44021(var11, var5);
        return var9;
    }
    
    public static SubLObject f44021(final SubLObject var14, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = module0147.$g2094$.currentBinding(var15);
        final SubLObject var18 = module0147.$g2095$.currentBinding(var15);
        try {
            module0147.$g2094$.bind((SubLObject)$ic11$, var15);
            module0147.$g2095$.bind(var5, var15);
            SubLObject var19 = var14;
            SubLObject var20 = (SubLObject)NIL;
            var20 = var19.first();
            while (NIL != var19) {
                SubLObject var21 = (SubLObject)NIL;
                SubLObject var22 = (SubLObject)NIL;
                if (NIL == var21) {
                    SubLObject var23 = $g5677$.getGlobalValue();
                    SubLObject var24 = (SubLObject)NIL;
                    var24 = var23.first();
                    while (NIL == var21 && NIL != var23) {
                        var22 = module0219.f14509(var20, (SubLObject)TWO_INTEGER, var24, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL != var22) {
                            SubLObject var12_23 = var22;
                            SubLObject var25 = (SubLObject)NIL;
                            var25 = var12_23.first();
                            while (NIL != var12_23) {
                                final SubLObject var26 = var25;
                                if (NIL == conses_high.member(var26, var16, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                    var16 = (SubLObject)ConsesLow.cons(var26, var16);
                                }
                                var12_23 = var12_23.rest();
                                var25 = var12_23.first();
                            }
                            var21 = (SubLObject)T;
                        }
                        var23 = var23.rest();
                        var24 = var23.first();
                    }
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var18, var15);
            module0147.$g2094$.rebind(var17, var15);
        }
        return Sequences.nreverse(var16);
    }
    
    public static SubLObject f44022(final SubLObject var26, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f44019(module0259.f16840(var26, var5, (SubLObject)UNPROVIDED), var5);
    }
    
    public static SubLObject f44023(final SubLObject var26, final SubLObject var2, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = f44013(var2);
        final SubLObject var30 = f44017(var2, var5);
        var27 = module0259.f16857(var26, var30, var5, (SubLObject)UNPROVIDED);
        if ($ic12$.equal(var29) || $ic13$.equal(var29) || $ic14$.equal(var29)) {
            if (NIL != var30 && NIL != var27) {
                var28 = conses_high.set_difference(var30, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            var28 = module0259.f16866(var26, var30, var5, (SubLObject)UNPROVIDED);
        }
        return Values.values(var27, var28);
    }
    
    public static SubLObject f44020(final SubLObject var13) {
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = $g5677$.getGlobalValue();
        SubLObject var16 = (SubLObject)NIL;
        var16 = var15.first();
        while (NIL != var15) {
            SubLObject var12_33;
            final SubLObject var17 = var12_33 = module0220.f14565(var13, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var18 = (SubLObject)NIL;
            var18 = var12_33.first();
            while (NIL != var12_33) {
                if (NIL != module0173.f10955(var18)) {
                    var14 = (SubLObject)ConsesLow.cons(var18, var14);
                }
                var12_33 = var12_33.rest();
                var18 = var12_33.first();
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return var14;
    }
    
    public static SubLObject f44024(final SubLObject var13) {
        return module0256.f16529(f44020(var13), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f44025(final SubLObject var13, SubLObject var35, SubLObject var5) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var36 = module0256.f16552(var13, var5, (SubLObject)UNPROVIDED);
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = var36;
        SubLObject var39 = (SubLObject)NIL;
        var39 = var38.first();
        while (NIL != var38) {
            if (!var39.eql(var13) && NIL == module0259.f16902(var39, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var37 = (SubLObject)ConsesLow.cons(var39, var37);
            }
            var38 = var38.rest();
            var39 = var38.first();
        }
        return Sequences.nreverse(var37);
    }
    
    public static SubLObject f44026(final SubLObject var13, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f44025(var13, (SubLObject)$ic15$, var5);
    }
    
    public static SubLObject f44027(final SubLObject var13, final SubLObject var35, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var36 = module0256.f16531(var13, var5, (SubLObject)UNPROVIDED);
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = var36;
        SubLObject var39 = (SubLObject)NIL;
        var39 = var38.first();
        while (NIL != var38) {
            if (!var39.eql(var13) && NIL == module0259.f16902(var39, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var37 = (SubLObject)ConsesLow.cons(var39, var37);
            }
            var38 = var38.rest();
            var39 = var38.first();
        }
        return Sequences.nreverse(var37);
    }
    
    public static SubLObject f44028(final SubLObject var13, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f44027(var13, (SubLObject)$ic15$, var5);
    }
    
    public static SubLObject f44029(final SubLObject var42, final SubLObject var43, final SubLObject var44, final SubLObject var5) {
        final SubLObject var45 = module0220.f14566(var42, var43, var5, (SubLObject)((NIL != var44) ? TWO_INTEGER : ONE_INTEGER), (SubLObject)((NIL != var44) ? ONE_INTEGER : TWO_INTEGER), (SubLObject)$ic16$);
        final SubLObject var46 = module0220.f14566(var42, var43, var5, (SubLObject)((NIL != var44) ? TWO_INTEGER : ONE_INTEGER), (SubLObject)((NIL != var44) ? ONE_INTEGER : TWO_INTEGER), (SubLObject)$ic17$);
        final SubLObject var47 = (NIL != var44) ? module0252.f16332(module0137.f8955(var43), var42, var45, var5, (SubLObject)UNPROVIDED) : module0252.f16334(module0137.f8955(var43), var42, var45, var5, (SubLObject)UNPROVIDED);
        final SubLObject var48 = conses_high.set_difference(var45, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var49 = conses_high.set_difference(var46, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var50 = (NIL != var44) ? module0252.f16260(module0137.f8955(var43), var48, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0252.f16262(module0137.f8955(var43), var48, var5, (SubLObject)UNPROVIDED);
        final SubLObject var51 = (NIL != var44) ? module0252.f16262(module0137.f8955(var43), var48, var5, (SubLObject)UNPROVIDED) : module0252.f16260(module0137.f8955(var43), var48, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var52 = module0035.f2220(var48, var50, (SubLObject)UNPROVIDED);
        final SubLObject var53 = module0035.f2220(var49, var51, (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic18$, var45, $ic19$, var52, $ic20$, var47, $ic21$, var53, $ic22$, var46 });
    }
    
    public static SubLObject f44030() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44008", "S#48179", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44009", "S#48180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44010", "S#48181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44011", "S#48182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44012", "S#48183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44013", "S#48184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44014", "S#48185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44015", "S#48186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44016", "S#48187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44017", "S#48188", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44018", "S#48189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44019", "S#48190", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44021", "S#48191", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44022", "S#48192", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44023", "S#48193", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44020", "S#48194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44024", "S#48195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44025", "S#48196", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44026", "S#48197", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44027", "S#48198", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44028", "S#48199", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0718", "f44029", "S#48200", 4, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44031() {
        $g5675$ = SubLFiles.defconstant("S#48201", (SubLObject)$ic0$);
        $g5676$ = SubLFiles.defconstant("S#48202", (SubLObject)$ic1$);
        $g5677$ = SubLFiles.defconstant("S#48203", ConsesLow.append($g5675$.getGlobalValue(), $g5676$.getGlobalValue()));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f44032() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f44030();
    }
    
    public void initializeVariables() {
        f44031();
    }
    
    public void runTopLevelForms() {
        f44032();
    }
    
    static {
        me = (SubLFile)new module0718();
        $g5675$ = null;
        $g5676$ = null;
        $g5677$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("facets-Partition")), constant_handles_oc.f8479((SubLObject)makeString("partitionedInto")), constant_handles_oc.f8479((SubLObject)makeString("facets-Strict")));
        $ic1$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("facets-Covering")), constant_handles_oc.f8479((SubLObject)makeString("covering")), constant_handles_oc.f8479((SubLObject)makeString("facets-Generic")));
        $ic2$ = makeKeyword("DISJOINT");
        $ic3$ = makeKeyword("NOT-DISJOINT");
        $ic4$ = makeSymbol("ASSERTION-P");
        $ic5$ = makeSymbol("S#48180", "CYC");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("ThePartition"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("TheCovering"));
        $ic8$ = makeSymbol("S#17515", "CYC");
        $ic9$ = makeSymbol("APPEND");
        $ic10$ = makeSymbol("COLLECTION-P");
        $ic11$ = makeSymbol("S#12278", "CYC");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("facets-Partition"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("partitionedInto"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("facets-Strict"));
        $ic15$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ArbitraryUnion")));
        $ic16$ = makeKeyword("TRUE");
        $ic17$ = makeKeyword("FALSE");
        $ic18$ = makeKeyword("ASSERTED-TRUE");
        $ic19$ = makeKeyword("REDUNDANT-TRUE");
        $ic20$ = makeKeyword("COEXTENSIONAL");
        $ic21$ = makeKeyword("REDUNDANT-FALSE");
        $ic22$ = makeKeyword("ASSERTED-FALSE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 156 ms
	
	Decompiled with Procyon 0.5.32.
*/