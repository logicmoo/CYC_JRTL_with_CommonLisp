package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0469 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0469";
    public static final String myFingerPrint = "c64c7fe749311c1218ed0c72305d2d4e5f05b455207c8318347f05f28e541fbf";
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLList $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLList $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    
    public static SubLObject f31553(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)ZERO_INTEGER;
        SubLObject var5 = module0232.f15308(var1);
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            SubLObject var8;
            final SubLObject var7 = var8 = var6;
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic2$);
            var9 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic2$);
            var10 = var8.first();
            var8 = var8.rest();
            if (NIL == var8) {
                final SubLObject var11 = var9;
                final SubLObject var12 = module0147.$g2095$.currentBinding(var2);
                final SubLObject var13 = module0147.$g2094$.currentBinding(var2);
                final SubLObject var14 = module0147.$g2096$.currentBinding(var2);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var11), var2);
                    module0147.$g2094$.bind(module0147.f9546(var11), var2);
                    module0147.$g2096$.bind(module0147.f9549(var11), var2);
                    if ($ic3$.eql(module0205.f13333(var10))) {
                        SubLObject var17_18;
                        final SubLObject var15_16 = var17_18 = module0205.f13385(var10, (SubLObject)UNPROVIDED);
                        SubLObject var15 = (SubLObject)NIL;
                        SubLObject var16 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var17_18, var15_16, (SubLObject)$ic4$);
                        var15 = var17_18.first();
                        var17_18 = var17_18.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var17_18, var15_16, (SubLObject)$ic4$);
                        var16 = var17_18.first();
                        var17_18 = var17_18.rest();
                        if (NIL == var17_18) {
                            if (NIL != module0193.f12067(var15) && NIL != module0173.f10955(var16) && NIL != module0259.f16854(var16, $ic5$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                SubLObject var17 = (SubLObject)ZERO_INTEGER;
                                SubLObject var5_22 = module0232.f15308(var1);
                                SubLObject var18 = (SubLObject)NIL;
                                var18 = var5_22.first();
                                while (NIL != var5_22) {
                                    if (!var4.eql(var17)) {
                                        SubLObject var26_27;
                                        final SubLObject var24_25 = var26_27 = var18;
                                        SubLObject var19 = (SubLObject)NIL;
                                        SubLObject var20 = (SubLObject)NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var26_27, var24_25, (SubLObject)$ic6$);
                                        var19 = var26_27.first();
                                        var26_27 = var26_27.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var26_27, var24_25, (SubLObject)$ic6$);
                                        var20 = var26_27.first();
                                        var26_27 = var26_27.rest();
                                        if (NIL == var26_27) {
                                            final SubLObject var11_30 = var19;
                                            final SubLObject var12_31 = module0147.$g2095$.currentBinding(var2);
                                            final SubLObject var13_32 = module0147.$g2094$.currentBinding(var2);
                                            final SubLObject var14_33 = module0147.$g2096$.currentBinding(var2);
                                            try {
                                                module0147.$g2095$.bind(module0147.f9545(var11_30), var2);
                                                module0147.$g2094$.bind(module0147.f9546(var11_30), var2);
                                                module0147.$g2096$.bind(module0147.f9549(var11_30), var2);
                                                if ($ic7$.eql(module0205.f13333(var20))) {
                                                    SubLObject var36_37;
                                                    final SubLObject var34_35 = var36_37 = module0205.f13385(var20, (SubLObject)UNPROVIDED);
                                                    SubLObject var21 = (SubLObject)NIL;
                                                    SubLObject var22 = (SubLObject)NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(var36_37, var34_35, (SubLObject)$ic8$);
                                                    var21 = var36_37.first();
                                                    var36_37 = var36_37.rest();
                                                    cdestructuring_bind.destructuring_bind_must_consp(var36_37, var34_35, (SubLObject)$ic8$);
                                                    var22 = var36_37.first();
                                                    var36_37 = var36_37.rest();
                                                    if (NIL == var36_37) {
                                                        if (var15.eql(var22) && NIL != module0193.f12105(var21) && NIL != module0614.f37617(var21) && NIL == module0612.f37390(var21) && NIL == module0614.f37623(var21)) {
                                                            var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)NIL, Sort.sort((SubLObject)ConsesLow.list(var4, var17), (SubLObject)$ic9$, (SubLObject)UNPROVIDED)), var3);
                                                        }
                                                    }
                                                    else {
                                                        cdestructuring_bind.cdestructuring_bind_error(var34_35, (SubLObject)$ic8$);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0147.$g2096$.rebind(var14_33, var2);
                                                module0147.$g2094$.rebind(var13_32, var2);
                                                module0147.$g2095$.rebind(var12_31, var2);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var24_25, (SubLObject)$ic6$);
                                        }
                                    }
                                    var17 = Numbers.add(var17, (SubLObject)ONE_INTEGER);
                                    var5_22 = var5_22.rest();
                                    var18 = var5_22.first();
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var15_16, (SubLObject)$ic4$);
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var14, var2);
                    module0147.$g2094$.rebind(var13, var2);
                    module0147.$g2095$.rebind(var12, var2);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)$ic2$);
            }
            var4 = Numbers.add(var4, (SubLObject)ONE_INTEGER);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return var3;
    }
    
    public static SubLObject f31554(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = f31555(var1);
        final SubLObject var4 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        SubLObject var6;
        final SubLObject var5 = var6 = var3;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic10$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic10$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            SubLObject var48_49;
            final SubLObject var46_47 = var48_49 = var4;
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var48_49, var46_47, (SubLObject)$ic11$);
            var9 = var48_49.first();
            var48_49 = var48_49.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var48_49, var46_47, (SubLObject)$ic11$);
            var10 = var48_49.first();
            var48_49 = var48_49.rest();
            if (NIL == var48_49) {
                final SubLObject var11 = module0205.f13388(var8, (SubLObject)UNPROVIDED);
                final SubLObject var12 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
                SubLObject var13 = (SubLObject)NIL;
                SubLObject var14 = (SubLObject)NIL;
                SubLObject var15 = var7;
                SubLObject var16 = module0147.$g2095$.currentBinding(var2);
                SubLObject var17 = module0147.$g2094$.currentBinding(var2);
                SubLObject var18 = module0147.$g2096$.currentBinding(var2);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var15), var2);
                    module0147.$g2094$.bind(module0147.f9546(var15), var2);
                    module0147.$g2096$.bind(module0147.f9549(var15), var2);
                    var13 = ((NIL != module0615.f37684(var11)) ? module0615.f37691(var11) : module0615.f37716(var11));
                }
                finally {
                    module0147.$g2096$.rebind(var18, var2);
                    module0147.$g2094$.rebind(var17, var2);
                    module0147.$g2095$.rebind(var16, var2);
                }
                var15 = var9;
                var16 = module0147.$g2095$.currentBinding(var2);
                var17 = module0147.$g2094$.currentBinding(var2);
                var18 = module0147.$g2096$.currentBinding(var2);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var15), var2);
                    module0147.$g2094$.bind(module0147.f9546(var15), var2);
                    module0147.$g2096$.bind(module0147.f9549(var15), var2);
                    var14 = module0615.f37722(var12);
                }
                finally {
                    module0147.$g2096$.rebind(var18, var2);
                    module0147.$g2094$.rebind(var17, var2);
                    module0147.$g2095$.rebind(var16, var2);
                }
                if (NIL == module0615.f37703(var13) || NIL == module0615.f37703(var14)) {
                    return (SubLObject)ZERO_INTEGER;
                }
                if (NIL != module0615.f37701(var13)) {
                    return (SubLObject)ZERO_INTEGER;
                }
                if (NIL != module0615.f37701(var14)) {
                    return Numbers.$most_positive_fixnum$.getGlobalValue();
                }
                if (NIL != module0615.f37708(var14, var13)) {
                    return (SubLObject)((NIL != module0615.f37708(var14, module0615.f37716(var11))) ? ZERO_INTEGER : ONE_INTEGER);
                }
                if (NIL != module0615.f37711(var14, var13)) {
                    return (SubLObject)ONE_INTEGER;
                }
                final SubLObject var19 = module0615.f37686(var13);
                final SubLObject var20 = module0615.f37705(var13);
                final SubLObject var21 = module0615.f37686(var14);
                final SubLObject var22 = module0615.f37705(var14);
                return (NIL != module0615.f37706(var19, var21)) ? Numbers.multiply(var22, Numbers.divide(module0615.f37709(var19, var21, (SubLObject)UNPROVIDED), var20)) : Numbers.multiply(Numbers.divide(var22, module0615.f37709(var21, var19, (SubLObject)UNPROVIDED)), var20);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var46_47, (SubLObject)$ic11$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic10$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31556(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = f31555(var1);
        final SubLObject var4 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        SubLObject var6;
        final SubLObject var5 = var6 = var3;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic10$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic10$);
        var8 = var6.first();
        var6 = var6.rest();
        if (NIL == var6) {
            SubLObject var63_64;
            final SubLObject var61_62 = var63_64 = var4;
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var63_64, var61_62, (SubLObject)$ic11$);
            var9 = var63_64.first();
            var63_64 = var63_64.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var63_64, var61_62, (SubLObject)$ic11$);
            var10 = var63_64.first();
            var63_64 = var63_64.rest();
            if (NIL == var63_64) {
                final SubLObject var11 = module0205.f13388(var8, (SubLObject)UNPROVIDED);
                final SubLObject var12 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
                final SubLObject var13 = module0205.f13387(var8, (SubLObject)UNPROVIDED);
                SubLObject var14 = (SubLObject)NIL;
                SubLObject var15 = (SubLObject)NIL;
                SubLObject var16 = var7;
                SubLObject var17 = module0147.$g2095$.currentBinding(var2);
                SubLObject var18 = module0147.$g2094$.currentBinding(var2);
                SubLObject var19 = module0147.$g2096$.currentBinding(var2);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var16), var2);
                    module0147.$g2094$.bind(module0147.f9546(var16), var2);
                    module0147.$g2096$.bind(module0147.f9549(var16), var2);
                    var14 = module0615.f37716(var11);
                }
                finally {
                    module0147.$g2096$.rebind(var19, var2);
                    module0147.$g2094$.rebind(var18, var2);
                    module0147.$g2095$.rebind(var17, var2);
                }
                var16 = var9;
                var17 = module0147.$g2095$.currentBinding(var2);
                var18 = module0147.$g2094$.currentBinding(var2);
                var19 = module0147.$g2096$.currentBinding(var2);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var16), var2);
                    module0147.$g2094$.bind(module0147.f9546(var16), var2);
                    module0147.$g2096$.bind(module0147.f9549(var16), var2);
                    var15 = module0615.f37722(var12);
                }
                finally {
                    module0147.$g2096$.rebind(var19, var2);
                    module0147.$g2094$.rebind(var18, var2);
                    module0147.$g2095$.rebind(var17, var2);
                }
                if (NIL == module0615.f37703(var14) || NIL == module0615.f37703(var15)) {
                    return module0052.f3708();
                }
                if (NIL != module0615.f37701(var15)) {
                    return f31557(var11, var12, var13, var1);
                }
                if (NIL != module0615.f37708(var15, var14)) {
                    return module0052.f3708();
                }
                return f31557(var11, var12, var13, var1);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var61_62, (SubLObject)$ic11$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)$ic10$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31555(final SubLObject var1) {
        final SubLObject var2 = module0232.f15317(var1, (SubLObject)$ic12$, (SubLObject)ZERO_INTEGER);
        final SubLObject var3 = module0232.f15317(var1, (SubLObject)$ic12$, (SubLObject)ONE_INTEGER);
        return $ic3$.eql(module0205.f13333(module0362.f24436(var2))) ? Values.values(var2, var3) : Values.values(var3, var2);
    }
    
    public static SubLObject f31557(final SubLObject var20, final SubLObject var65, final SubLObject var19, final SubLObject var1) {
        return module0052.f3689(f31558(var20, var65, var19, var1), (SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)$ic15$);
    }
    
    public static SubLObject f31558(final SubLObject var20, final SubLObject var65, final SubLObject var19, final SubLObject var1) {
        SubLObject var67;
        final SubLObject var66 = var67 = module0232.f15317(var1, (SubLObject)$ic12$, (SubLObject)ZERO_INTEGER);
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)$ic16$);
        var68 = var67.first();
        var67 = var67.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)$ic16$);
        var69 = var67.first();
        var67 = var67.rest();
        if (NIL == var67) {
            SubLObject var75_76;
            final SubLObject var73_74 = var75_76 = module0232.f15317(var1, (SubLObject)$ic12$, (SubLObject)ONE_INTEGER);
            SubLObject var70 = (SubLObject)NIL;
            SubLObject var71 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var75_76, var73_74, (SubLObject)$ic6$);
            var70 = var75_76.first();
            var75_76 = var75_76.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var75_76, var73_74, (SubLObject)$ic6$);
            var71 = var75_76.first();
            var75_76 = var75_76.rest();
            if (NIL == var75_76) {
                SubLObject var72 = (SubLObject)NIL;
                SubLObject var73 = (SubLObject)NIL;
                if ($ic3$.eql(module0205.f13333(var69))) {
                    var72 = module0191.f11990((SubLObject)$ic17$, var69, var68, (SubLObject)UNPROVIDED);
                    var73 = module0191.f11990((SubLObject)$ic18$, var71, var70, (SubLObject)UNPROVIDED);
                }
                else {
                    var72 = module0191.f11990((SubLObject)$ic18$, var69, var68, (SubLObject)UNPROVIDED);
                    var73 = module0191.f11990((SubLObject)$ic17$, var71, var70, (SubLObject)UNPROVIDED);
                }
                return (SubLObject)((NIL != module0612.f37389(module0614.f37640(var65))) ? ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)$ic19$, var20, var65, var19, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var72), (SubLObject)ConsesLow.list(var73))) : ConsesLow.list((SubLObject)ZERO_INTEGER, (SubLObject)$ic20$, var20, var65, var19, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var72), (SubLObject)ConsesLow.list(var73))));
            }
            cdestructuring_bind.cdestructuring_bind_error(var73_74, (SubLObject)$ic6$);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var66, (SubLObject)$ic16$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31559(final SubLObject var79) {
        return Types.sublisp_null(var79);
    }
    
    public static SubLObject f31560(final SubLObject var79) {
        final SubLThread var80 = SubLProcess.currentSubLThread();
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = (SubLObject)NIL;
        SubLObject var85 = (SubLObject)NIL;
        SubLObject var86 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var79, var79, (SubLObject)$ic21$);
        var81 = var79.first();
        SubLObject var87 = var79.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var87, var79, (SubLObject)$ic21$);
        var82 = var87.first();
        var87 = var87.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var87, var79, (SubLObject)$ic21$);
        var83 = var87.first();
        var87 = var87.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var87, var79, (SubLObject)$ic21$);
        var84 = var87.first();
        var87 = var87.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var87, var79, (SubLObject)$ic21$);
        var85 = var87.first();
        var87 = var87.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var87, var79, (SubLObject)$ic21$);
        var86 = var87.first();
        var87 = var87.rest();
        if (NIL != var87) {
            cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic21$);
            return (SubLObject)NIL;
        }
        final SubLObject var88 = ($ic19$ == var82) ? module0615.f37726(var84, var83, var81) : module0615.f37717(var84, var83, var81);
        if (NIL == var88) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)T);
        }
        if (NIL != module0328.f22205(var84, var88, (SubLObject)UNPROVIDED)) {
            ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var79, Numbers.add(ConsesLow.nth((SubLObject)ZERO_INTEGER, var79), (SubLObject)ONE_INTEGER));
            var80.resetMultipleValues();
            final SubLObject var89 = module0235.f15474(var85, var88, (SubLObject)T, (SubLObject)T);
            final SubLObject var90 = var80.secondMultipleValue();
            var80.resetMultipleValues();
            final SubLObject var91 = ConsesLow.append(conses_high.sublis(var89, var86, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var90);
            return Values.values((SubLObject)ConsesLow.list(var89, var91), var79, (SubLObject)NIL);
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)T);
    }
    
    public static SubLObject f31561(final SubLObject var79) {
        return (SubLObject)T;
    }
    
    public static SubLObject f31562(final SubLObject var10, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = (SubLObject)NIL;
        }
        final SubLObject var89 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var90 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var91 = module0612.f37425(module0614.f37661(var89));
        final SubLObject var92 = (SubLObject)((var91.eql($ic29$) || var91.eql($ic30$) || var91.eql($ic31$)) ? NIL : module0612.f37424(module0614.f37640(var89), $ic32$, (SubLObject)UNPROVIDED));
        if (NIL != var92) {
            final SubLObject var93 = module0235.f15474(var90, var92, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var93) {
                module0347.f23330(module0191.f11990((SubLObject)$ic33$, module0233.f15362(var93, var10), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var93, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31563(final SubLObject var10, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = (SubLObject)NIL;
        }
        final SubLObject var89 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var90 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var91 = module0612.f37424(module0614.f37640(var89), $ic32$, (SubLObject)UNPROVIDED);
        if (NIL != module0279.f18551(var90, var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic33$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31564(final SubLObject var10, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = (SubLObject)NIL;
        }
        final SubLObject var89 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var90 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var91 = module0612.f37424(module0614.f37640(var89), $ic32$, (SubLObject)UNPROVIDED);
        if (NIL == module0279.f18551(var90, var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic33$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31565(final SubLObject var10, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = (SubLObject)NIL;
        }
        final SubLObject var89 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var90 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var91 = module0612.f37425(module0614.f37662(var89));
        final SubLObject var92 = (SubLObject)((var91.eql($ic29$) || var91.eql($ic30$) || var91.eql($ic31$)) ? NIL : module0612.f37424(module0614.f37641(var89), $ic32$, (SubLObject)UNPROVIDED));
        if (NIL != var92) {
            final SubLObject var93 = module0235.f15474(var90, var92, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var93) {
                module0347.f23330(module0191.f11990((SubLObject)$ic33$, module0233.f15362(var93, var10), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var93, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31566(final SubLObject var10, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = (SubLObject)NIL;
        }
        final SubLObject var89 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var90 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var91 = module0612.f37424(module0614.f37641(var89), $ic32$, (SubLObject)UNPROVIDED);
        if (NIL != module0279.f18551(var90, var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic33$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31567(final SubLObject var10, SubLObject var88) {
        if (var88 == UNPROVIDED) {
            var88 = (SubLObject)NIL;
        }
        final SubLObject var89 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var90 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var91 = module0612.f37424(module0614.f37641(var89), $ic32$, (SubLObject)UNPROVIDED);
        if (NIL == module0279.f18551(var90, var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)$ic33$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31568() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31553", "S#34904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31554", "S#34905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31556", "S#34906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31555", "S#34907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31557", "S#34908", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31558", "S#34909", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31559", "S#34910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31560", "S#34911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31561", "S#34912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31562", "S#34913", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31563", "S#34914", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31564", "S#34915", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31565", "S#34916", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31566", "S#34917", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0469", "f31567", "S#34918", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31569() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31570() {
        module0340.f22962((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0340.f22938($ic22$);
        module0358.f23771((SubLObject)$ic12$, $ic22$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic23$, (SubLObject)$ic24$);
        module0340.f22941((SubLObject)$ic25$, (SubLObject)$ic26$);
        module0340.f22941((SubLObject)$ic27$, (SubLObject)$ic28$);
        module0340.f22938($ic34$);
        module0358.f23771((SubLObject)$ic12$, $ic34$, (SubLObject)ONE_INTEGER);
        module0340.f22941((SubLObject)$ic35$, (SubLObject)$ic36$);
        module0340.f22941((SubLObject)$ic37$, (SubLObject)$ic38$);
        module0340.f22941((SubLObject)$ic39$, (SubLObject)$ic40$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31568();
    }
    
    public void initializeVariables() {
        f31569();
    }
    
    public void runTopLevelForms() {
        f31570();
    }
    
    static {
        me = (SubLFile)new module0469();
        $ic0$ = makeKeyword("REMOVAL-SUB-TIME-INTERVAL-OF-TYPE");
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("EVERY-PREDICATES"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes"))), makeKeyword("APPLICABILITY"), makeSymbol("S#34904", "CYC"), makeKeyword("COST"), makeSymbol("S#34905", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34906", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa <varN> <time-type>)\n           (#$temporallySubsumes <time-interval> <varN>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa ?MONTH #$CalendarWeek)\n           (#$temporallySubsumes (#$MonthFn #$May (#$YearFn 2005)) ?MONTH))") });
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("TYPE"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("TimeParameter"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#34269", "CYC"), (SubLObject)makeSymbol("S#34270", "CYC"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes"));
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#34891", "CYC"), (SubLObject)makeSymbol("S#141", "CYC"));
        $ic9$ = makeSymbol("<");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#18763", "CYC"), (SubLObject)makeSymbol("S#34919", "CYC"));
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#34920", "CYC"), (SubLObject)makeSymbol("S#34921", "CYC"));
        $ic12$ = makeKeyword("POS");
        $ic13$ = makeSymbol("S#34910", "CYC");
        $ic14$ = makeSymbol("S#34911", "CYC");
        $ic15$ = makeSymbol("S#34912", "CYC");
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#34267", "CYC"), (SubLObject)makeSymbol("S#34268", "CYC"));
        $ic17$ = makeKeyword("ISA");
        $ic18$ = makeKeyword("TIME");
        $ic19$ = makeKeyword("BACKWARD");
        $ic20$ = makeKeyword("FORWARD");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#24567", "CYC"), (SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#34922", "CYC"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("startingDay"));
        $ic23$ = makeKeyword("REMOVAL-STARTING-DAY-CHECK-POS");
        $ic24$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startingDay")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startingDay")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34914", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDay <time-interval> <day>)"), makeKeyword("EXAMPLE"), makeString("(#$startingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002))))") });
        $ic25$ = makeKeyword("REMOVAL-STARTING-DAY-CHECK-NEG");
        $ic26$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startingDay")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startingDay")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34915", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startingDay <time-interval> <day>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$startingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002)))))") });
        $ic27$ = makeKeyword("REMOVAL-STARTING-DAY-POS");
        $ic28$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("startingDay")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("startingDay")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34913", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDay <time-interval> ?DAY)"), makeKeyword("EXAMPLE"), makeString("(#$startingDay (#$YearFn 2002) ?DAY) -> (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002)))") });
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarSecond"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarMinute"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarHour"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("CalendarDay"));
        $ic33$ = makeKeyword("OPAQUE");
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("endingDay"));
        $ic35$ = makeKeyword("REMOVAL-ENDING-DAY-CHECK-POS");
        $ic36$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endingDay")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endingDay")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34917", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDay <time-interval> <day>)"), makeKeyword("EXAMPLE"), makeString("(#$endingDay (#$YearFn 2002) (#$DayFn 31 (#$MonthFn #$December (#$YearFn 2002))))") });
        $ic37$ = makeKeyword("REMOVAL-ENDING-DAY-CHECK-NEG");
        $ic38$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endingDay")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endingDay")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34918", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$endingDay <time-interval> <day>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$endingDay (#$YearFn 2002) (#$DayFn 1 (#$MonthFn #$January (#$YearFn 2002))))") });
        $ic39$ = makeKeyword("REMOVAL-ENDING-DAY-POS");
        $ic40$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("endingDay")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("endingDay")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34916", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDay <time-interval> ?DAY)"), makeKeyword("EXAMPLE"), makeString("(#$endingDay (#$YearFn 2002) ?DAY) -> (#$DayFn 31 (#$MonthFn #$December (#$YearFn 2002)))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 265 ms
	
	Decompiled with Procyon 0.5.32.
*/