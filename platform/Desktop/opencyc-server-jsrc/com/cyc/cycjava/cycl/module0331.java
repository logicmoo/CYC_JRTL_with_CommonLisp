package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0331 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0331";
    public static final String myFingerPrint = "22f46e0b6b2fa9b787e007c37246cc359a93c0c1067ab072a9ab3a064c66b93d";
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    
    public static SubLObject f22369(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0266.f17530($ic0$, var1, module0134.f8799(), var2, var3);
    }
    
    public static SubLObject f22370(final SubLObject var4, final SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4.equal(var5)) {
            return (SubLObject)T;
        }
        if (NIL != module0173.f10955(var4)) {
            if (NIL != module0173.f10955(var5)) {
                return f22371(var4, var5, var2, var3);
            }
            return f22372(var4, var5, var2, var3);
        }
        else {
            if (NIL != module0173.f10955(var5)) {
                return f22372(var5, var4, var2, var3);
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f22373(final SubLObject var4, final SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4.equal(var5)) {
            return (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic1$, module0202.f12768($ic0$, var4, var5), module0132.$g1562$.getGlobalValue(), (SubLObject)UNPROVIDED));
        }
        if (NIL != module0173.f10955(var4)) {
            return module0266.f17543($ic0$, var4, var5, var2, var3);
        }
        if (NIL != module0173.f10955(var5)) {
            return module0266.f17543($ic0$, var5, var4, var2, var3);
        }
        return module0266.f17543($ic0$, var4, var5, var2, var3);
    }
    
    public static SubLObject f22374(final SubLObject var4, final SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL == f22370(var4, var5, var2, var3));
    }
    
    public static SubLObject f22372(final SubLObject var6, final SubLObject var7, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)NIL;
        if (NIL != module0018.$g624$.getDynamicValue(var8) && NIL == module0206.f13499(var7) && NIL != module0330.f22357(var6, (SubLObject)UNPROVIDED)) {
            var9 = module0266.f17537($ic0$, var6, var7, var2, var3, (SubLObject)UNPROVIDED);
        }
        return var9;
    }
    
    public static SubLObject f22371(final SubLObject var10, final SubLObject var11, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        if (NIL != module0018.$g624$.getDynamicValue(var12) && NIL != module0330.f22358(var10) && NIL != module0330.f22358(var11) && NIL != module0330.f22357(var10, (SubLObject)UNPROVIDED) && NIL != module0330.f22357(var11, (SubLObject)UNPROVIDED)) {
            var13 = module0266.f17537($ic0$, var10, var11, var2, var3, (SubLObject)UNPROVIDED);
        }
        return var13;
    }
    
    public static SubLObject f22375(final SubLObject var12, final SubLObject var13) {
        if (NIL != f22376(var12, var13)) {
            return (SubLObject)ConsesLow.list(module0132.$g1562$.getGlobalValue());
        }
        if (NIL != module0173.f10955(var12)) {
            return f22377(var12, var13);
        }
        if (NIL != module0173.f10955(var13)) {
            return f22377(var13, var12);
        }
        return f22378(var12, var13);
    }
    
    public static SubLObject f22377(final SubLObject var14, final SubLObject var13) {
        return module0266.f17546($ic0$, var14, var13, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22378(final SubLObject var12, final SubLObject var13) {
        return (SubLObject)((NIL != f22379(var12, var13)) ? $ic2$ : NIL);
    }
    
    public static SubLObject f22376(final SubLObject var15, final SubLObject var16) {
        return f22370(var15, var16, module0132.$g1562$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22379(final SubLObject var15, final SubLObject var16) {
        return f22370(var15, var16, $ic2$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22380(final SubLObject var17, final SubLObject var18, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL != module0172.f10917(var18)) {
            return module0035.f2171(var18, module0220.f14562(var17, $ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)makeBoolean(NIL != module0330.f22365(var18) && NIL != module0220.f14582($ic3$, var17, var18, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f22381(final SubLObject var19, final SubLObject var18, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        SubLObject var20 = (SubLObject)NIL;
        if (NIL == var20) {
            SubLObject var21 = var19;
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL == var20 && NIL != var21) {
                if (NIL != f22380(var22, var18, var2)) {
                    var20 = (SubLObject)T;
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        return var20;
    }
    
    public static SubLObject f22382(final SubLObject var22, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        assert NIL != module0035.f2015(var22) : var22;
        SubLObject var23 = var22;
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            assert NIL != module0173.f10955(var24) : var24;
            var23 = var23.rest();
            var24 = var23.first();
        }
        SubLObject var25 = var22;
        var23 = var22;
        SubLObject var26 = (SubLObject)NIL;
        var26 = var23.first();
        while (NIL != var23) {
            if (NIL != f22381(var22, var26, var2)) {
                var25 = Sequences.remove(var26, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var23 = var23.rest();
            var26 = var23.first();
        }
        return var25;
    }
    
    public static SubLObject f22383(final SubLObject var27, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        SubLObject var29 = (SubLObject)T;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        var31 = var27.first();
        for (var32 = var27.rest(); NIL == var30 && NIL != var32; var32 = var32.rest()) {
            if (NIL == var30) {
                SubLObject var33 = var32;
                SubLObject var34 = (SubLObject)NIL;
                var34 = var33.first();
                while (NIL == var30 && NIL != var33) {
                    final SubLObject var35 = f22384(var31, var34, var28);
                    if (var35.eql(var28)) {
                        var30 = (SubLObject)T;
                        var29 = var28;
                    }
                    else if (NIL == var35) {
                        var30 = (SubLObject)T;
                        var29 = (SubLObject)NIL;
                    }
                    var33 = var33.rest();
                    var34 = var33.first();
                }
            }
            var31 = var32.first();
        }
        return var29;
    }
    
    public static SubLObject f22384(final SubLObject var4, final SubLObject var5, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        if (NIL != module0235.f15474(var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0206.f13481(var4) && NIL != module0206.f13481(var5)) {
            return (SubLObject)T;
        }
        if (NIL != f22385(var4) && NIL != f22385(var5)) {
            return (SubLObject)T;
        }
        if (NIL != f22386(var4, var5)) {
            return (SubLObject)T;
        }
        if (NIL != f22387(var4, var5)) {
            return (SubLObject)T;
        }
        return var28;
    }
    
    public static SubLObject f22386(final SubLObject var4, final SubLObject var5) {
        return module0035.sublisp_boolean(f22388(var4, var5));
    }
    
    public static SubLObject f22388(final SubLObject var4, final SubLObject var5) {
        SubLObject var6;
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var6 = (SubLObject)NIL, var7 = (SubLObject)NIL, var7 = module0218.f14453((SubLObject)ConsesLow.list($ic6$, var4, var5), (SubLObject)UNPROVIDED); NIL == var6 && NIL != var7; var7 = var7.rest()) {
            var8 = var7.first();
            if (NIL != module0178.f11343(var8, (SubLObject)$ic7$) && NIL != module0178.f11284(var8)) {
                var9 = module0178.f11332(var8);
                var10 = module0178.f11330(var8);
                if ($ic6$.eql(var9) && NIL != module0035.f2171(var4, var10) && NIL != module0035.f2171(var5, Sequences.remove(var4, var10, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var6 = var8;
                }
            }
        }
        for (var7 = (SubLObject)NIL, var7 = module0218.f14453((SubLObject)ConsesLow.list($ic0$, var4, var5), (SubLObject)UNPROVIDED); NIL == var6 && NIL != var7; var7 = var7.rest()) {
            var8 = var7.first();
            if (NIL != module0178.f11343(var8, (SubLObject)$ic8$) && NIL != module0178.f11284(var8)) {
                var9 = module0178.f11332(var8);
                var10 = module0178.f11330(var8);
                if ($ic0$.eql(var9) && NIL != module0035.f2171(var4, var10) && NIL != module0035.f2171(var5, Sequences.remove(var4, var10, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var6 = var8;
                }
            }
        }
        return var6;
    }
    
    public static SubLObject f22387(final SubLObject var4, final SubLObject var5) {
        if (NIL != module0206.f13451(var4) && NIL != module0206.f13451(var5)) {
            return module0257.f16692(var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0206.f13451(var4)) {
            return f22389(var4, var5);
        }
        if (NIL != module0206.f13451(var5)) {
            return f22389(var5, var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22389(final SubLObject var40, final SubLObject var41) {
        SubLObject var42 = (SubLObject)NIL;
        if (NIL == var42) {
            SubLObject var43 = module0259.f16822(var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL == var42 && NIL != var43) {
                if (NIL != module0305.f20444(var41, var44, (SubLObject)UNPROVIDED)) {
                    var42 = (SubLObject)T;
                }
                if (NIL == var42) {
                    SubLObject var21_44 = module0257.f16683(var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var45 = (SubLObject)NIL;
                    var45 = var21_44.first();
                    while (NIL == var42 && NIL != var21_44) {
                        if (NIL != module0305.f20438(var41, var45, (SubLObject)UNPROVIDED)) {
                            var42 = (SubLObject)T;
                        }
                        var21_44 = var21_44.rest();
                        var45 = var21_44.first();
                    }
                }
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        return var42;
    }
    
    public static SubLObject f22390(final SubLObject var27) {
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        var30 = var27.first();
        for (var31 = var27.rest(); NIL == var29 && NIL != var31; var31 = var31.rest()) {
            if (NIL == var29) {
                SubLObject var32 = var31;
                SubLObject var33 = (SubLObject)NIL;
                var33 = var32.first();
                while (NIL == var29 && NIL != var32) {
                    final SubLObject var34 = f22391(var30, var33);
                    if (NIL != var34) {
                        var28 = ConsesLow.nconc(var28, var34);
                    }
                    else {
                        var28 = (SubLObject)NIL;
                        var29 = (SubLObject)T;
                    }
                    var32 = var32.rest();
                    var33 = var32.first();
                }
            }
            var30 = var31.first();
        }
        return module0035.f2269(var28, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22391(final SubLObject var4, final SubLObject var5) {
        if (NIL != module0235.f15474(var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0206.f13481(var4) && NIL != module0206.f13481(var5)) {
            final SubLObject var6 = module0191.f11990((SubLObject)$ic9$, module0202.f12768($ic6$, var4, var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list(var6);
        }
        if (NIL != f22385(var4) && NIL != f22385(var5)) {
            final SubLObject var6 = module0191.f11990((SubLObject)$ic9$, module0202.f12768($ic6$, var4, var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list(var6);
        }
        if (NIL != f22386(var4, var5)) {
            return f22392(var4, var5);
        }
        if (NIL != f22387(var4, var5)) {
            return f22393(var4, var5);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22392(final SubLObject var4, final SubLObject var5) {
        return (SubLObject)ConsesLow.list(f22388(var4, var5));
    }
    
    public static SubLObject f22393(final SubLObject var4, final SubLObject var5) {
        if (NIL != module0206.f13451(var4) && NIL != module0206.f13451(var5)) {
            return module0257.f16694(var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0206.f13451(var4)) {
            return f22394(var4, var5);
        }
        if (NIL != module0206.f13451(var5)) {
            return f22394(var5, var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22394(final SubLObject var40, final SubLObject var41) {
        SubLObject var42 = (SubLObject)NIL;
        if (NIL == var42) {
            SubLObject var43 = module0259.f16822(var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL == var42 && NIL != var43) {
                if (NIL != module0305.f20444(var41, var44, (SubLObject)UNPROVIDED)) {
                    final SubLObject var45 = module0191.f11990((SubLObject)$ic10$, module0202.f12768($ic11$, var40, var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var46 = module0191.f11990((SubLObject)$ic10$, module0202.f12771(module0202.f12768($ic11$, var41, var44)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var42 = (SubLObject)ConsesLow.list(var45, var46);
                }
                if (NIL == var42) {
                    SubLObject var21_51 = module0257.f16683(var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var47 = (SubLObject)NIL;
                    var47 = var21_51.first();
                    while (NIL == var42 && NIL != var21_51) {
                        if (NIL != module0305.f20438(var41, var47, (SubLObject)UNPROVIDED)) {
                            final SubLObject var48 = module0191.f11990((SubLObject)$ic10$, module0202.f12768($ic11$, var40, var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            final SubLObject var49 = module0191.f11990((SubLObject)$ic10$, module0202.f12768($ic11$, var41, var47), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            final SubLObject var50 = module0191.f11990((SubLObject)$ic12$, module0202.f12768($ic13$, var44, var47), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            var42 = (SubLObject)ConsesLow.list(var48, var49, var50);
                        }
                        var21_51 = var21_51.rest();
                        var47 = var21_51.first();
                    }
                }
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        return var42;
    }
    
    public static SubLObject f22385(final SubLObject var53) {
        if (NIL != constant_handles_oc.f8463($ic14$, (SubLObject)UNPROVIDED)) {
            return (SubLObject)makeBoolean(NIL == module0226.f15164(var53));
        }
        return (SubLObject)makeBoolean(NIL == module0349.f23399(var53));
    }
    
    public static SubLObject f22395(final SubLObject var54) {
        SubLObject var55 = (SubLObject)NIL;
        final SubLObject var56 = module0205.f13207(var54, (SubLObject)$ic15$);
        SubLObject var57;
        SubLObject var58;
        for (var57 = (SubLObject)NIL, var57 = var56; NIL == var55 && NIL != var57; var57 = var57.rest()) {
            var58 = var57.first();
            if (NIL == f22385(var58)) {
                var55 = (SubLObject)T;
            }
        }
        return (SubLObject)makeBoolean(NIL == var55);
    }
    
    public static SubLObject f22396(final SubLObject var54, final SubLObject var57) {
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = (SubLObject)ZERO_INTEGER;
        final SubLObject var60 = module0205.f13207(var54, (SubLObject)$ic15$);
        SubLObject var61;
        SubLObject var62;
        for (var61 = (SubLObject)NIL, var61 = var60; NIL == var58 && NIL != var61; var61 = var61.rest()) {
            var62 = var61.first();
            var59 = Numbers.add(var59, (SubLObject)ONE_INTEGER);
            if (!var59.eql(var57) && NIL == f22385(var62)) {
                var58 = (SubLObject)T;
            }
        }
        return (SubLObject)makeBoolean(NIL == var58);
    }
    
    public static SubLObject f22397() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22369", "S#24885", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22370", "S#18173", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22373", "S#24886", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22374", "S#24887", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22372", "S#24888", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22371", "S#24889", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22375", "S#24890", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22377", "S#24891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22378", "S#24892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22376", "S#24893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22379", "S#24894", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22380", "S#24895", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22381", "S#24896", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22382", "S#24897", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22383", "S#24898", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22384", "S#24899", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22386", "S#24900", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22388", "S#24901", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22387", "S#24902", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22389", "S#24903", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22390", "S#24904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22391", "S#24905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22392", "S#24906", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22393", "S#24907", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22394", "S#24908", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22385", "S#24909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22395", "S#24910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0331", "f22396", "S#24911", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22398() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22399() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f22397();
    }
    
    public void initializeVariables() {
        f22398();
    }
    
    public void runTopLevelForms() {
        f22399();
    }
    
    static {
        me = (SubLFile)new module0331();
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic1$ = makeKeyword("REFLEXIVE");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("rewriteOf"));
        $ic4$ = makeSymbol("S#747", "CYC");
        $ic5$ = makeSymbol("FORT-P");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("different"));
        $ic7$ = makeKeyword("TRUE");
        $ic8$ = makeKeyword("FALSE");
        $ic9$ = makeKeyword("OPAQUE");
        $ic10$ = makeKeyword("ISA");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic12$ = makeKeyword("DISJOINTWITH");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("disjointWith"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("TermExemptFromUniqueNamesAssumption"));
        $ic15$ = makeKeyword("IGNORE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 200 ms
	
	Decompiled with Procyon 0.5.32.
*/