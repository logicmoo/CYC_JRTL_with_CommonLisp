package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0428 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0428";
    public static final String myFingerPrint = "e1ca6d41c15299b591eaf557e72e97eee0346e9dcf4abdda37a5e4d4ca4cdd0f";
    private static SubLSymbol $g3488$;
    private static SubLSymbol $g3489$;
    private static SubLSymbol $g3490$;
    private static SubLSymbol $g3491$;
    private static SubLSymbol $g3492$;
    private static SubLSymbol $g3493$;
    private static final SubLSymbol $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLString $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLFloat $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLList $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    
    public static SubLObject f30333(final SubLObject var1) {
        if (var1.isZero()) {
            final SubLObject var2 = module0178.f11386();
            return module0289.f19402(var2);
        }
        f30334((SubLObject)module0428.UNPROVIDED);
        final SubLObject var2 = module0030.f1629(module0428.$g3488$.getGlobalValue(), var1, (SubLObject)module0428.UNPROVIDED);
        if (module0428.NIL != var2) {
            return module0289.f19402(var2);
        }
        return (SubLObject)module0428.NIL;
    }
    
    public static SubLObject f30334(SubLObject var3) {
        if (var3 == module0428.UNPROVIDED) {
            var3 = (SubLObject)module0428.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0428.$g3488$.getGlobalValue().isHashtable() && module0428.NIL == var3) {
            return module0428.$g3488$.getGlobalValue();
        }
        final SubLObject var5 = assertion_handles_oc.f11010();
        final SubLObject var6 = (SubLObject)module0428.$ic3$;
        final SubLObject var7 = module0065.f4733(var5);
        SubLObject var8 = (SubLObject)module0428.ZERO_INTEGER;
        assert module0428.NIL != Types.stringp(var6) : var6;
        final SubLObject var9 = module0012.$g75$.currentBinding(var4);
        final SubLObject var10 = module0012.$g76$.currentBinding(var4);
        final SubLObject var11 = module0012.$g77$.currentBinding(var4);
        final SubLObject var12 = module0012.$g78$.currentBinding(var4);
        try {
            module0012.$g75$.bind((SubLObject)module0428.ZERO_INTEGER, var4);
            module0012.$g76$.bind((SubLObject)module0428.NIL, var4);
            module0012.$g77$.bind((SubLObject)module0428.T, var4);
            module0012.$g78$.bind(Time.get_universal_time(), var4);
            module0012.f478(var6);
            final SubLObject var13_14 = var5;
            if (module0428.NIL == module0065.f4772(var13_14, (SubLObject)module0428.$ic5$)) {
                final SubLObject var15_16 = var13_14;
                if (module0428.NIL == module0065.f4775(var15_16, (SubLObject)module0428.$ic5$)) {
                    final SubLObject var13 = module0065.f4740(var15_16);
                    final SubLObject var14 = (SubLObject)module0428.NIL;
                    SubLObject var15;
                    SubLObject var16;
                    SubLObject var17;
                    SubLObject var18;
                    SubLObject var9_23;
                    SubLObject var19;
                    for (var15 = Sequences.length(var13), var16 = (SubLObject)module0428.NIL, var16 = (SubLObject)module0428.ZERO_INTEGER; var16.numL(var15); var16 = Numbers.add(var16, (SubLObject)module0428.ONE_INTEGER)) {
                        var17 = ((module0428.NIL != var14) ? Numbers.subtract(var15, var16, (SubLObject)module0428.ONE_INTEGER) : var16);
                        var18 = Vectors.aref(var13, var17);
                        if (module0428.NIL == module0065.f4749(var18) || module0428.NIL == module0065.f4773((SubLObject)module0428.$ic5$)) {
                            if (module0428.NIL != module0065.f4749(var18)) {
                                var18 = (SubLObject)module0428.$ic5$;
                            }
                            module0012.note_percent_progress(var8, var7);
                            var8 = Numbers.add(var8, (SubLObject)module0428.ONE_INTEGER);
                            if (module0428.NIL != module0178.f11284(var18) && module0428.NIL != module0178.f11376(var18) && module0428.NIL == module0178.f11375(var18)) {
                                var9_23 = module0428.$g3489$.currentBinding(var4);
                                try {
                                    module0428.$g3489$.bind((SubLObject)module0428.NIL, var4);
                                    var19 = f30335(var18);
                                    if (var19.isPositive()) {
                                        Hashtables.sethash(var18, module0428.$g3488$.getGlobalValue(), var19);
                                    }
                                }
                                finally {
                                    module0428.$g3489$.rebind(var9_23, var4);
                                }
                            }
                        }
                    }
                }
                final SubLObject var25_26 = var13_14;
                if (module0428.NIL == module0065.f4777(var25_26) || module0428.NIL == module0065.f4773((SubLObject)module0428.$ic5$)) {
                    final SubLObject var20 = module0065.f4738(var25_26);
                    SubLObject var21 = module0065.f4739(var25_26);
                    final SubLObject var22 = module0065.f4734(var25_26);
                    final SubLObject var23 = (SubLObject)((module0428.NIL != module0065.f4773((SubLObject)module0428.$ic5$)) ? module0428.NIL : module0428.$ic5$);
                    while (var21.numL(var22)) {
                        final SubLObject var24 = Hashtables.gethash_without_values(var21, var20, var23);
                        if (module0428.NIL == module0065.f4773((SubLObject)module0428.$ic5$) || module0428.NIL == module0065.f4749(var24)) {
                            module0012.note_percent_progress(var8, var7);
                            var8 = Numbers.add(var8, (SubLObject)module0428.ONE_INTEGER);
                            if (module0428.NIL != module0178.f11284(var24) && module0428.NIL != module0178.f11376(var24) && module0428.NIL == module0178.f11375(var24)) {
                                final SubLObject var9_24 = module0428.$g3489$.currentBinding(var4);
                                try {
                                    module0428.$g3489$.bind((SubLObject)module0428.NIL, var4);
                                    final SubLObject var25 = f30335(var24);
                                    if (var25.isPositive()) {
                                        Hashtables.sethash(var24, module0428.$g3488$.getGlobalValue(), var25);
                                    }
                                }
                                finally {
                                    module0428.$g3489$.rebind(var9_24, var4);
                                }
                            }
                        }
                        var21 = Numbers.add(var21, (SubLObject)module0428.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var12, var4);
            module0012.$g77$.rebind(var11, var4);
            module0012.$g76$.rebind(var10, var4);
            module0012.$g75$.rebind(var9, var4);
        }
        return module0428.$g3488$.getGlobalValue();
    }
    
    public static SubLObject f30335(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (module0428.NIL != module0004.f104(var31, module0428.$g3489$.getDynamicValue(var32), (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED)) {
            return (SubLObject)module0428.ZERO_INTEGER;
        }
        SubLObject var33 = (SubLObject)module0428.NIL;
        final SubLObject var34 = module0428.$g3489$.currentBinding(var32);
        try {
            module0428.$g3489$.bind((SubLObject)ConsesLow.cons(var31, module0428.$g3489$.getDynamicValue(var32)), var32);
            if (module0428.NIL != module0178.f11375(var31)) {
                var33 = (SubLObject)module0428.ZERO_INTEGER;
            }
            else if (module0428.NIL == f30336(var31)) {
                var33 = (SubLObject)module0428.ZERO_INTEGER;
            }
            else {
                SubLObject var35 = (SubLObject)module0428.ZERO_INTEGER;
                SubLObject var36 = module0178.f11299(var31);
                SubLObject var37 = (SubLObject)module0428.NIL;
                var37 = var36.first();
                while (module0428.NIL != var36) {
                    if (module0428.NIL != oc_deduction_handles.f11659(var37)) {
                        SubLObject var33_35 = module0188.f11770(var37);
                        SubLObject var38 = (SubLObject)module0428.NIL;
                        var38 = var33_35.first();
                        while (module0428.NIL != var33_35) {
                            if (module0428.NIL != module0178.f11284(var38)) {
                                final SubLObject var39 = f30335(var38);
                                if (var39.numG(var35)) {
                                    var35 = var39;
                                }
                            }
                            var33_35 = var33_35.rest();
                            var38 = var33_35.first();
                        }
                    }
                    var36 = var36.rest();
                    var37 = var36.first();
                }
                var33 = module0048.f_1X(var35);
            }
        }
        finally {
            module0428.$g3489$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f30336(final SubLObject var31) {
        SubLObject var32 = (SubLObject)module0428.NIL;
        SubLObject var33 = module0178.f11299(var31);
        SubLObject var34 = (SubLObject)module0428.NIL;
        var34 = var33.first();
        while (module0428.NIL != var33) {
            if (module0428.NIL == oc_deduction_handles.f11659(var34) || module0428.NIL == f30337(var34)) {
                return (SubLObject)module0428.NIL;
            }
            var32 = (SubLObject)module0428.T;
            var33 = var33.rest();
            var34 = var33.first();
        }
        return var32;
    }
    
    public static SubLObject f30337(final SubLObject var39) {
        SubLObject var40 = (SubLObject)module0428.NIL;
        SubLObject var41 = module0188.f11770(var39);
        SubLObject var42 = (SubLObject)module0428.NIL;
        var42 = var41.first();
        while (module0428.NIL != var41) {
            if (module0428.NIL != module0178.f11311(var42)) {
                var40 = (SubLObject)module0428.T;
            }
            else if (module0428.NIL != module0178.f11313(var42)) {
                return (SubLObject)module0428.NIL;
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        return var40;
    }
    
    public static SubLObject f30338(final SubLObject var41) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0428.NIL != module0035.f1998(var41) && module0428.NIL != module0202.f12883(var41.first(), (SubLObject)module0428.UNPROVIDED) && conses_high.second(var41).isCons() && module0428.NIL != module0035.f2370((SubLObject)module0428.$ic8$, conses_high.second(var41), (SubLObject)module0428.UNPROVIDED));
    }
    
    public static SubLObject f30339(final SubLObject var42) {
        final SubLObject var43 = Mapping.mapcar((SubLObject)module0428.$ic9$, f30340(var42));
        if (module0428.NIL != module0035.f2180(var43, module0428.$g3490$.getGlobalValue(), (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED)) {
            return (SubLObject)module0428.NIL;
        }
        if (f30341(var42).numGE((SubLObject)module0428.TWO_INTEGER) && module0428.NIL != module0035.f1997(Sequences.remove_duplicates(var43, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED)) && module0428.NIL != module0004.f104(var43.first(), module0428.$g3491$.getGlobalValue(), (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED)) {
            return (SubLObject)module0428.NIL;
        }
        return (SubLObject)module0428.T;
    }
    
    public static SubLObject f30342(final SubLObject var42) {
        return var42.first();
    }
    
    public static SubLObject f30340(final SubLObject var42) {
        return conses_high.second(var42);
    }
    
    public static SubLObject f30341(final SubLObject var42) {
        return Sequences.length(f30340(var42));
    }
    
    public static SubLObject f30343(final SubLObject var41) {
        return module0035.f1999(var41);
    }
    
    public static SubLObject f30344(final SubLObject var1) {
        assert module0428.NIL != module0004.f105(var1) : var1;
        SubLObject var2;
        for (var2 = (SubLObject)module0428.NIL; module0428.NIL == var2; var2 = f30345(var1)) {}
        return f30346(f30347(var2));
    }
    
    public static SubLObject f30347(final SubLObject var42) {
        final SubLObject var43 = f30340(var42);
        final SubLObject var44 = Mapping.mapcar((SubLObject)module0428.$ic9$, var43);
        final SubLObject var45 = module0262.f17370(var44, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
        SubLObject var46 = (SubLObject)module0428.NIL;
        if (module0428.NIL != module0035.f1997(var45)) {
            var46 = var45.first();
        }
        else {
            var46 = module0428.$ic11$;
        }
        final SubLObject var47 = f30342(var42);
        final SubLObject var48 = module0202.f12887(var47);
        final SubLObject var49 = module0202.f12782(var46, var48);
        final SubLObject var50 = (SubLObject)ConsesLow.list(var49, var43);
        return var50;
    }
    
    public static SubLObject f30346(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = f30342(var42);
        final SubLObject var45 = module0202.f12887(var44);
        final SubLObject var46 = module0205.f13379(var45, (SubLObject)module0428.UNPROVIDED);
        final SubLObject var47 = f30340(var42);
        SubLObject var48 = (SubLObject)module0428.NIL;
        SubLObject var50;
        final SubLObject var49 = var50 = module0205.f13207(var46, (SubLObject)module0428.$ic12$);
        SubLObject var51 = (SubLObject)module0428.NIL;
        var51 = var50.first();
        while (module0428.NIL != var50) {
            SubLObject var33_57 = var47;
            SubLObject var52 = (SubLObject)module0428.NIL;
            var52 = var33_57.first();
            while (module0428.NIL != var33_57) {
                SubLObject var33_58 = module0232.f15306(module0178.f11282(var52));
                SubLObject var53 = (SubLObject)module0428.NIL;
                var53 = var33_58.first();
                while (module0428.NIL != var33_58) {
                    var43.resetMultipleValues();
                    final SubLObject var54 = module0234.f15444(var51, var53, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
                    final SubLObject var55 = var43.secondMultipleValue();
                    var43.resetMultipleValues();
                    if (module0428.NIL != var54) {
                        SubLObject var33_59 = var54;
                        SubLObject var56 = (SubLObject)module0428.NIL;
                        var56 = var33_59.first();
                        while (module0428.NIL != var33_59) {
                            SubLObject var58;
                            final SubLObject var57 = var58 = var56;
                            SubLObject var59 = (SubLObject)module0428.NIL;
                            SubLObject var60 = (SubLObject)module0428.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var58, var57, (SubLObject)module0428.$ic13$);
                            var59 = var58.first();
                            var58 = (var60 = var58.rest());
                            if (module0428.NIL != module0206.f13500(var59) && module0428.NIL != module0206.f13497(var60) && module0428.NIL == module0035.f2293(var48, var60, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED)) {
                                final SubLObject var61 = module0178.f11352(var52, var59);
                                if (module0428.NIL == module0035.f2304(var48, var61, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED)) {
                                    final SubLObject var62 = module0233.f15340(var60, var61);
                                    var48 = (SubLObject)ConsesLow.cons(var62, var48);
                                }
                            }
                            var33_59 = var33_59.rest();
                            var56 = var33_59.first();
                        }
                    }
                    var33_58 = var33_58.rest();
                    var53 = var33_58.first();
                }
                SubLObject var33_60 = module0232.f15308(module0178.f11282(var52));
                var53 = (SubLObject)module0428.NIL;
                var53 = var33_60.first();
                while (module0428.NIL != var33_60) {
                    var43.resetMultipleValues();
                    final SubLObject var54 = module0234.f15444(var51, var53, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
                    final SubLObject var55 = var43.secondMultipleValue();
                    var43.resetMultipleValues();
                    if (module0428.NIL != var54) {
                        SubLObject var33_61 = var54;
                        SubLObject var56 = (SubLObject)module0428.NIL;
                        var56 = var33_61.first();
                        while (module0428.NIL != var33_61) {
                            SubLObject var64;
                            final SubLObject var63 = var64 = var56;
                            SubLObject var59 = (SubLObject)module0428.NIL;
                            SubLObject var60 = (SubLObject)module0428.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var64, var63, (SubLObject)module0428.$ic13$);
                            var59 = var64.first();
                            var64 = (var60 = var64.rest());
                            if (module0428.NIL != module0206.f13500(var59) && module0428.NIL != module0206.f13497(var60) && module0428.NIL == module0035.f2293(var48, var60, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED)) {
                                final SubLObject var61 = module0178.f11352(var52, var59);
                                if (module0428.NIL == module0035.f2304(var48, var61, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED)) {
                                    final SubLObject var62 = module0233.f15340(var60, var61);
                                    var48 = (SubLObject)ConsesLow.cons(var62, var48);
                                }
                            }
                            var33_61 = var33_61.rest();
                            var56 = var33_61.first();
                        }
                    }
                    var33_60 = var33_60.rest();
                    var53 = var33_60.first();
                }
                var33_57 = var33_57.rest();
                var52 = var33_57.first();
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        final SubLObject var65 = module0205.f13257(var48, var44, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
        final SubLObject var66 = (SubLObject)ConsesLow.list(var65, var47);
        return var66;
    }
    
    public static SubLObject f30345(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0428.NIL != module0004.f105(var1) : var1;
        SubLObject var3 = (SubLObject)module0428.ZERO_INTEGER;
        SubLObject var4 = (SubLObject)module0428.NIL;
        SubLObject var5 = (SubLObject)module0428.NIL;
        while (!var1.numE(f30341(var4))) {
            var2.resetMultipleValues();
            final SubLObject var6 = f30348(var4, var5);
            final SubLObject var7 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (module0428.NIL != var6) {
                if (module0428.NIL != f30339(var6)) {
                    var3 = (SubLObject)module0428.ZERO_INTEGER;
                    var4 = var6;
                    var5 = var7;
                }
                else {
                    var4 = (SubLObject)module0428.NIL;
                    var5 = (SubLObject)module0428.NIL;
                }
            }
            else {
                var3 = Numbers.add(var3, (SubLObject)module0428.ONE_INTEGER);
            }
            if (module0428.NIL != f30349(var4, var3)) {
                var4 = (SubLObject)module0428.NIL;
                var5 = (SubLObject)module0428.NIL;
            }
        }
        return var4;
    }
    
    public static SubLObject f30349(final SubLObject var42, final SubLObject var76) {
        return Numbers.numG(var76, Numbers.multiply((SubLObject)module0428.FIVE_INTEGER, f30341(var42)));
    }
    
    public static SubLObject f30348(SubLObject var42, final SubLObject var77) {
        final SubLObject var78 = f30350(var77);
        if (module0428.NIL != var78) {
            final SubLObject var79 = f30351(var78);
            if (module0428.NIL != var79) {
                var42 = f30352(var42, var78, var79);
                if (module0428.NIL != f30353(var42, (SubLObject)module0428.UNPROVIDED)) {
                    return Values.values(var42, var79);
                }
            }
        }
        return Values.values((SubLObject)module0428.NIL, (SubLObject)module0428.NIL);
    }
    
    public static SubLObject f30354() {
        SubLObject var79;
        SubLObject var82 = null;
        for (var79 = (SubLObject)module0428.NIL; module0428.NIL == var79; var79 = module0202.f12782(module0428.$ic11$, var82)) {
            final SubLObject var80 = module0178.f11385();
            SubLObject var81 = module0232.f15306(module0178.f11282(var80));
            var81 = Sequences.remove_if((SubLObject)module0428.$ic14$, var81, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
            if (module0428.NIL != var81) {
                var82 = module0205.f13144(module0035.f2099(var81));
            }
        }
        return var79;
    }
    
    public static SubLObject f30350(final SubLObject var77) {
        if (module0428.NIL == var77) {
            return f30354();
        }
        SubLObject var78 = (SubLObject)module0428.NIL;
        SubLObject var79 = (SubLObject)module0428.NIL;
        SubLObject var80 = (SubLObject)module0428.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var77, var77, (SubLObject)module0428.$ic15$);
        var78 = var77.first();
        SubLObject var81 = var77.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var77, (SubLObject)module0428.$ic15$);
        var79 = var81.first();
        var81 = var81.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var81, var77, (SubLObject)module0428.$ic15$);
        var80 = var81.first();
        var81 = var81.rest();
        if (module0428.NIL == var81) {
            final SubLObject var82 = module0035.remove_if_not((SubLObject)module0428.$ic16$, Mapping.mapcar((SubLObject)module0428.$ic17$, var79), (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
            SubLObject var83 = module0035.f2099(var82);
            if (module0428.NIL != var83) {
                var83 = module0233.f15376(var78, var83);
                var83 = module0205.f13147(var83, (SubLObject)module0428.$ic18$, (SubLObject)module0428.$ic19$, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
                final SubLObject var84 = module0202.f12782(module0428.$ic11$, var83);
                return var84;
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var77, (SubLObject)module0428.$ic15$);
        }
        return (SubLObject)module0428.NIL;
    }
    
    public static SubLObject f30351(final SubLObject var79) {
        final SubLThread var80 = SubLProcess.currentSubLThread();
        final SubLObject var81 = module0202.f12911(var79, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
        final SubLObject var82 = Mapping.mapcar((SubLObject)module0428.$ic21$, var81);
        final SubLObject var83 = module0202.f12887(var79);
        final SubLObject var84 = module0428.$ic11$;
        final SubLObject var85 = module0202.f12774(module0202.f12773(var82), var83);
        SubLObject var86 = (SubLObject)module0428.NIL;
        var80.resetMultipleValues();
        final SubLObject var87 = module0409.f28506(var85, var84, module0428.$g3492$.getGlobalValue());
        final SubLObject var88 = var80.secondMultipleValue();
        final SubLObject var89 = var80.thirdMultipleValue();
        var80.resetMultipleValues();
        if (module0428.NIL != var87) {
            SubLObject var91;
            final SubLObject var90 = var91 = var87;
            SubLObject var92 = (SubLObject)module0428.NIL;
            SubLObject var93 = (SubLObject)module0428.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var91, var90, (SubLObject)module0428.$ic22$);
            var92 = var91.first();
            var91 = var91.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var91, var90, (SubLObject)module0428.$ic22$);
            var93 = var91.first();
            var91 = var91.rest();
            if (module0428.NIL == var91) {
                if (module0428.NIL != var92) {
                    final SubLObject var94 = oc_inference_datastructures_inference.f25616(var89, (SubLObject)module0428.ZERO_INTEGER);
                    final SubLObject var95 = module0035.remove_if_not((SubLObject)module0428.$ic23$, oc_inference_datastructures_inference.f25744(var94), (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
                    if (module0428.NIL != var95) {
                        final SubLObject var96 = module0035.f2099(var95);
                        final SubLObject var97 = oc_inference_datastructures_inference.f25775(var96);
                        final SubLObject var98 = module0035.remove_if_not((SubLObject)module0428.$ic8$, var97, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
                        final SubLObject var99 = module0035.remove_if_not((SubLObject)module0428.$ic24$, var97, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
                        var86 = (SubLObject)ConsesLow.list(var93, var99, var98);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var90, (SubLObject)module0428.$ic22$);
            }
        }
        oc_inference_datastructures_inference.f25476(var89);
        return var86;
    }
    
    public static SubLObject f30352(final SubLObject var42, final SubLObject var103, final SubLObject var78) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        SubLObject var105 = (SubLObject)module0428.NIL;
        SubLObject var106 = (SubLObject)module0428.NIL;
        SubLObject var107 = (SubLObject)module0428.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var78, var78, (SubLObject)module0428.$ic25$);
        var105 = var78.first();
        SubLObject var108 = var78.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var108, var78, (SubLObject)module0428.$ic25$);
        var106 = var108.first();
        var108 = var108.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var108, var78, (SubLObject)module0428.$ic25$);
        var107 = var108.first();
        var108 = var108.rest();
        if (module0428.NIL == var108) {
            SubLObject var109 = Mapping.mapcar((SubLObject)module0428.$ic17$, var106);
            var109 = module0233.f15376(var105, var109);
            var109 = module0205.f13147(var109, (SubLObject)module0428.$ic18$, (SubLObject)module0428.$ic19$, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
            if (module0428.NIL == var42) {
                final SubLObject var110 = module0202.f12887(var103);
                final SubLObject var111 = module0428.$ic11$;
                final SubLObject var112 = module0202.f12774(module0202.f12773(var109), var110);
                return (SubLObject)ConsesLow.list(module0202.f12782(var111, var112), var107);
            }
            SubLObject var113 = (SubLObject)module0428.NIL;
            SubLObject var114 = (SubLObject)module0428.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var42, var42, (SubLObject)module0428.$ic26$);
            var113 = var42.first();
            SubLObject var110_111 = var42.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var110_111, var42, (SubLObject)module0428.$ic26$);
            var114 = var110_111.first();
            var110_111 = var110_111.rest();
            if (module0428.NIL == var110_111) {
                final SubLObject var115 = module0202.f12906(var113);
                final SubLObject var116 = module0202.f12887(var113);
                final SubLObject var117 = module0205.f13204(var116, (SubLObject)module0428.UNPROVIDED);
                final SubLObject var118 = module0205.f13203(var116, (SubLObject)module0428.UNPROVIDED);
                final SubLObject var119 = module0205.f13207(var118, (SubLObject)module0428.UNPROVIDED);
                final SubLObject var120 = module0202.f12887(var103);
                final SubLObject var121 = Sequences.remove(var120, var119, Symbols.symbol_function((SubLObject)module0428.EQUAL), (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
                if (module0428.NIL == Errors.$ignore_mustsP$.getDynamicValue(var104) && var119.equal(var121)) {
                    Errors.error((SubLObject)module0428.$ic27$);
                }
                final SubLObject var122 = ConsesLow.append(var121, var109);
                final SubLObject var123 = module0202.f12774(module0276.f18287(var122, (SubLObject)module0428.UNPROVIDED), var117);
                return (SubLObject)ConsesLow.list(module0202.f12782(var115, var123), ConsesLow.append(var114, var107));
            }
            cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)module0428.$ic26$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var78, (SubLObject)module0428.$ic25$);
        }
        return (SubLObject)module0428.NIL;
    }
    
    public static SubLObject f30353(final SubLObject var42, SubLObject var1) {
        if (var1 == module0428.UNPROVIDED) {
            var1 = (SubLObject)module0428.NIL;
        }
        module0389.f27662();
        if (module0428.NIL == var42) {
            return (SubLObject)module0428.NIL;
        }
        if (module0428.NIL != var1 && module0428.NIL == module0035.f1995(f30340(var42), var1, (SubLObject)module0428.UNPROVIDED)) {
            return (SubLObject)module0428.NIL;
        }
        SubLObject var43 = (SubLObject)module0428.NIL;
        SubLObject var44 = (SubLObject)module0428.NIL;
        SubLObject var45 = (SubLObject)module0428.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var42, var42, (SubLObject)module0428.$ic28$);
        var44 = var42.first();
        SubLObject var46 = var42.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var46, var42, (SubLObject)module0428.$ic28$);
        var45 = var46.first();
        var46 = var46.rest();
        if (module0428.NIL == var46) {
            final SubLObject var1_127 = Sequences.length(var45);
            var43 = (SubLObject)SubLObjectFactory.makeBoolean(module0428.NIL == module0409.f28506(var44, (SubLObject)module0428.NIL, (SubLObject)ConsesLow.list((SubLObject)module0428.$ic29$, (SubLObject)module0428.T, (SubLObject)module0428.$ic30$, module0048.f_1_(var1_127), (SubLObject)module0428.$ic31$, var45)) && module0428.NIL == module0409.f28506(var44, (SubLObject)module0428.NIL, (SubLObject)ConsesLow.list((SubLObject)module0428.$ic29$, (SubLObject)module0428.T, (SubLObject)module0428.$ic30$, module0048.f_1_(var1_127))) && module0428.NIL != f30355(var42, (SubLObject)module0428.T));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)module0428.$ic28$);
        }
        return var43;
    }
    
    public static SubLObject f30355(final SubLObject var42, SubLObject var128) {
        if (var128 == module0428.UNPROVIDED) {
            var128 = (SubLObject)module0428.NIL;
        }
        final SubLThread var129 = SubLProcess.currentSubLThread();
        module0389.f27662();
        SubLObject var130 = (SubLObject)module0428.NIL;
        SubLObject var131 = (SubLObject)module0428.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var42, var42, (SubLObject)module0428.$ic28$);
        var130 = var42.first();
        SubLObject var132 = var42.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var132, var42, (SubLObject)module0428.$ic28$);
        var131 = var132.first();
        var132 = var132.rest();
        if (module0428.NIL == var132) {
            final SubLObject var133 = Sequences.length(var131);
            SubLObject var134 = (SubLObject)ConsesLow.list((SubLObject)module0428.$ic29$, (SubLObject)module0428.T, (SubLObject)module0428.$ic30$, var133, (SubLObject)module0428.$ic32$, (SubLObject)module0428.$ic33$, (SubLObject)module0428.$ic34$, (SubLObject)module0428.$ic35$);
            SubLObject var135 = (SubLObject)module0428.NIL;
            SubLObject var136 = (SubLObject)module0428.NIL;
            SubLObject var137 = (SubLObject)module0428.NIL;
            if (module0428.NIL != var128) {
                var134 = conses_high.putf(var134, (SubLObject)module0428.$ic31$, var131);
            }
            final SubLObject var138 = Time.get_internal_real_time();
            var129.resetMultipleValues();
            final SubLObject var134_135 = module0409.f28506(var130, (SubLObject)module0428.NIL, var134);
            final SubLObject var136_137 = var129.secondMultipleValue();
            var129.resetMultipleValues();
            var136 = var134_135;
            var137 = var136_137;
            var135 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var138), time_high.$internal_time_units_per_second$.getGlobalValue());
            return Values.values((SubLObject)((module0428.NIL != var136) ? var135 : module0428.NIL), var137);
        }
        cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)module0428.$ic28$);
        return (SubLObject)module0428.NIL;
    }
    
    public static SubLObject f30356(final SubLObject var88) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0428.NIL == f30357(var88));
    }
    
    public static SubLObject f30357(final SubLObject var88) {
        final SubLObject var89 = module0205.f13333(var88);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0428.NIL != module0173.f10955(var89) && module0428.NIL != module0333.f22417(var89) && module0428.NIL == module0226.f14866(var89, module0428.$ic36$) && module0428.NIL == module0229.f15236(var89, module0428.$ic36$));
    }
    
    public static SubLObject f30358(final SubLObject var139) {
        return (SubLObject)ConsesLow.listS(module0428.$ic37$, var139, (SubLObject)module0428.$ic38$);
    }
    
    public static SubLObject f30359(final SubLObject var101) {
        return module0035.sublisp_boolean(Sequences.find_if((SubLObject)module0428.$ic8$, oc_inference_datastructures_inference.f25775(var101), (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED));
    }
    
    public static SubLObject f30360() {
        final SubLObject var140 = module0428.$g3493$.getGlobalValue();
        if (module0428.NIL != var140) {
            module0034.f1818(var140);
        }
        return (SubLObject)module0428.NIL;
    }
    
    public static SubLObject f30361(final SubLObject var141) {
        return module0034.f1829(module0428.$g3493$.getGlobalValue(), (SubLObject)ConsesLow.list(var141), (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
    }
    
    public static SubLObject f30362(final SubLObject var141) {
        return module0201.f12550(Sequences.cconcatenate((SubLObject)module0428.$ic39$, module0038.f2638(random.random(Numbers.$most_positive_fixnum$.getGlobalValue()))));
    }
    
    public static SubLObject f30363(final SubLObject var141) {
        SubLObject var142 = module0428.$g3493$.getGlobalValue();
        if (module0428.NIL == var142) {
            var142 = module0034.f1934((SubLObject)module0428.$ic19$, (SubLObject)module0428.$ic40$, (SubLObject)module0428.NIL, (SubLObject)module0428.EQUAL, (SubLObject)module0428.ONE_INTEGER, (SubLObject)module0428.ZERO_INTEGER);
        }
        SubLObject var143 = module0034.f1814(var142, var141, (SubLObject)module0428.$ic41$);
        if (var143 == module0428.$ic41$) {
            var143 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f30362(var141)));
            module0034.f1816(var142, var141, var143, (SubLObject)module0428.UNPROVIDED);
        }
        return module0034.f1959(var143);
    }
    
    public static SubLObject f30364(final SubLObject var144) {
        SubLObject var145;
        SubLObject var146;
        for (var145 = (SubLObject)module0428.NIL; module0428.NIL == var145; var145 = f30365(var146)) {
            var146 = module0035.f2099(var144);
        }
        return var145;
    }
    
    public static SubLObject f30365(final SubLObject var42) {
        final SubLObject var43 = f30366(var42);
        if (module0428.NIL != f30355(var43, (SubLObject)module0428.T) && module0428.NIL == f30355(var43, (SubLObject)module0428.NIL)) {
            return var43;
        }
        return (SubLObject)module0428.NIL;
    }
    
    public static SubLObject f30366(SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = f30342(var42);
        final SubLObject var45 = module0202.f12906(var44);
        final SubLObject var46 = module0202.f12887(var44);
        final SubLObject var47 = module0205.f13379(var46, (SubLObject)module0428.UNPROVIDED);
        final SubLObject var48 = module0035.remove_if_not((SubLObject)module0428.$ic42$, module0205.f13207(var47, (SubLObject)module0428.UNPROVIDED), (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
        final SubLObject var49 = module0067.f4880(Symbols.symbol_function((SubLObject)module0428.EQL), (SubLObject)module0428.UNPROVIDED);
        SubLObject var50 = var48;
        SubLObject var51 = (SubLObject)module0428.NIL;
        var51 = var50.first();
        while (module0428.NIL != var50) {
            final SubLObject var52 = module0205.f13203(var51, (SubLObject)module0428.UNPROVIDED);
            final SubLObject var53 = module0205.f13204(var51, (SubLObject)module0428.UNPROVIDED);
            module0084.f5762(var49, var52, var53);
            var50 = var50.rest();
            var51 = var50.first();
        }
        SubLObject var54;
        for (var54 = module0066.f4838(module0067.f4891(var49)); module0428.NIL == module0066.f4841(var54); var54 = module0066.f4840(var54)) {
            var43.resetMultipleValues();
            final SubLObject var55 = module0066.f4839(var54);
            final SubLObject var56 = var43.secondMultipleValue();
            var43.resetMultipleValues();
            final SubLObject var57 = f30367(var56, var45);
            if (module0428.NIL != var57) {
                var42 = module0205.f13250(var57, var55, var42, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
            }
        }
        module0066.f4842(var54);
        return var42;
    }
    
    public static SubLObject f30367(final SubLObject var152, final SubLObject var46) {
        return module0035.f2099(module0259.f16856(var152, var46, (SubLObject)module0428.UNPROVIDED));
    }
    
    public static SubLObject f30368(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        SubLObject var44 = (SubLObject)module0428.NIL;
        while (module0428.NIL == var44) {
            final SubLObject var45 = f30369(var42);
            if (module0428.NIL != var45 && module0428.NIL == f30355(var45, (SubLObject)module0428.T)) {
                var43.resetMultipleValues();
                final SubLObject var46 = f30355(var45, (SubLObject)module0428.NIL);
                final SubLObject var47 = var43.secondMultipleValue();
                var43.resetMultipleValues();
                if (module0428.NIL != var46 || module0428.$ic32$ != var47) {
                    continue;
                }
                var44 = var45;
            }
        }
        return var44;
    }
    
    public static SubLObject f30369(final SubLObject var42) {
        final SubLObject var43 = f30342(var42);
        final SubLObject var44 = f30340(var42);
        final SubLObject var45 = module0202.f12906(var43);
        final SubLObject var46 = module0202.f12887(var43);
        final SubLObject var47 = module0205.f13379(var46, (SubLObject)module0428.UNPROVIDED);
        final SubLObject var48 = module0205.f13380(var46, (SubLObject)module0428.UNPROVIDED);
        final SubLObject var49 = module0205.f13207(var47, (SubLObject)module0428.UNPROVIDED);
        if (module0428.NIL == module0035.f1997(var49)) {
            final SubLObject var50 = Sequences.remove(module0035.f2099(var49), var49, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED);
            final SubLObject var51 = module0276.f18287(var50, (SubLObject)module0428.UNPROVIDED);
            final SubLObject var52 = module0202.f12774(var51, var48);
            final SubLObject var53 = module0202.f12782(var45, var52);
            return (SubLObject)ConsesLow.list(var53, var44);
        }
        return (SubLObject)module0428.NIL;
    }
    
    public static SubLObject f30370() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30333", "S#33560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30334", "S#33561", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30335", "S#33562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30336", "S#33563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30337", "S#33564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30338", "S#33565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30339", "S#33557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30342", "S#33411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30340", "S#33408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30341", "S#33409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30343", "S#33566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30344", "S#33406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30347", "S#33567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30346", "S#33558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30345", "S#33568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30349", "S#33569", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30348", "S#33570", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30354", "S#33571", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30350", "S#33572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30351", "S#33573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30352", "S#33574", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30353", "S#33575", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30355", "S#33576", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30356", "S#33577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30357", "S#33578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30358", "S#33579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30359", "S#33580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30360", "S#33581", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30361", "S#33582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30362", "S#33583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30363", "S#33584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30364", "S#33407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30365", "S#33585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30366", "S#33586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30367", "S#33587", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30368", "S#33410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0428", "f30369", "S#33588", 1, 0, false);
        return (SubLObject)module0428.NIL;
    }
    
    public static SubLObject f30371() {
        module0428.$g3488$ = SubLFiles.deflexical("S#33589", (module0428.NIL != Symbols.boundp((SubLObject)module0428.$ic0$)) ? module0428.$g3488$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0428.$ic1$, (SubLObject)module0428.UNPROVIDED, (SubLObject)module0428.UNPROVIDED));
        module0428.$g3489$ = SubLFiles.defparameter("S#33590", (SubLObject)module0428.$ic2$);
        module0428.$g3490$ = SubLFiles.deflexical("S#33591", (SubLObject)module0428.$ic6$);
        module0428.$g3491$ = SubLFiles.deflexical("S#33592", (SubLObject)module0428.$ic7$);
        module0428.$g3492$ = SubLFiles.deflexical("S#33593", (SubLObject)module0428.$ic20$);
        module0428.$g3493$ = SubLFiles.deflexical("S#33594", (SubLObject)module0428.NIL);
        return (SubLObject)module0428.NIL;
    }
    
    public static SubLObject f30372() {
        module0003.f57((SubLObject)module0428.$ic0$);
        module0034.f1909((SubLObject)module0428.$ic19$);
        return (SubLObject)module0428.NIL;
    }
    
    public void declareFunctions() {
        f30370();
    }
    
    public void initializeVariables() {
        f30371();
    }
    
    public void runTopLevelForms() {
        f30372();
    }
    
    static {
        me = (SubLFile)new module0428();
        module0428.$g3488$ = null;
        module0428.$g3489$ = null;
        module0428.$g3490$ = null;
        module0428.$g3491$ = null;
        module0428.$g3492$ = null;
        module0428.$g3493$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#33589", "CYC");
        $ic1$ = SubLObjectFactory.makeInteger(212);
        $ic2$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic3$ = SubLObjectFactory.makeString("Looking for deeply deduced gafs");
        $ic4$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic5$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic6$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("KleinTest2Mt")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TMSLoopMt")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EasyTMSLoopMt")));
        $ic7$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DeonticReasoning-LogicMt")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReasoningWithTense-LogicMt")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReasoningWithTense-LogicMt-LinearTime")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NecessityMt")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReasoningWithMultiFuture-LogicMt")));
        $ic8$ = SubLObjectFactory.makeSymbol("S#12732", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $ic10$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic11$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic12$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic13$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#33595", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33596", "CYC"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#33577", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28766", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33597", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25425", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#33578", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#14352", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#24006", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#33584", "CYC");
        $ic20$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?"), module0428.T, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), module0428.ONE_INTEGER, SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeKeyword("BROWSABLE?"), module0428.T, SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?"), module0428.T, SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS"), SubLObjectFactory.makeKeyword("PROOF"), SubLObjectFactory.makeKeyword("RETURN"), SubLObjectFactory.makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS") });
        $ic21$ = SubLObjectFactory.makeSymbol("S#33579", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28766", "CYC"));
        $ic23$ = SubLObjectFactory.makeSymbol("S#33580", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#33598", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28766", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33597", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33599", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33600", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33408", "CYC"));
        $ic27$ = SubLObjectFactory.makeString("Failed to remove conjunct");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#33601", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25425", "CYC"));
        $ic29$ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $ic30$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic31$ = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $ic32$ = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic33$ = (SubLFloat)SubLObjectFactory.makeDouble(0.95);
        $ic34$ = SubLObjectFactory.makeKeyword("RETURN");
        $ic35$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic36$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic38$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing")));
        $ic39$ = SubLObjectFactory.makeString("?VAR");
        $ic40$ = SubLObjectFactory.makeSymbol("S#33594", "CYC");
        $ic41$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic42$ = SubLObjectFactory.makeSymbol("S#15754", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0428.class
	Total time: 350 ms
	
	Decompiled with Procyon 0.5.32.
*/