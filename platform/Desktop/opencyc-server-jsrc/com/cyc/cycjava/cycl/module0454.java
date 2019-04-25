package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0454 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0454";
    public static final String myFingerPrint = "5d2be9f0058338685071d2a13a2a9969d572416321d625912667306a205b8e4f";
    private static SubLSymbol $g3600$;
    private static SubLSymbol $g3601$;
    private static SubLSymbol $g3602$;
    private static SubLSymbol $g3603$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLInteger $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    
    public static SubLObject f31143(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0454.UNPROVIDED) {
            var3 = (SubLObject)module0454.NIL;
        }
        if (var4 == module0454.UNPROVIDED) {
            var4 = (SubLObject)module0454.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0454.NIL != module0349.f23386(var1, var3) && (module0454.NIL != module0331.f22370(var1, var2, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED) || (module0454.NIL != module0349.f23386(var2, var3) && module0454.NIL != module0256.f16576(var1, var2, var3, var4))));
    }
    
    public static SubLObject f31144(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0454.UNPROVIDED) {
            var3 = (SubLObject)module0454.NIL;
        }
        if (var4 == module0454.UNPROVIDED) {
            var4 = (SubLObject)module0454.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0454.NIL == module0331.f22370(var1, var2, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED) && module0454.NIL != module0349.f23386(var1, var3) && module0454.NIL != module0349.f23386(var2, var3) && module0454.NIL != module0256.f16613(var1, var2, var3, var4));
    }
    
    public static SubLObject f31145(final SubLObject var1, SubLObject var3, SubLObject var4) {
        if (var3 == module0454.UNPROVIDED) {
            var3 = (SubLObject)module0454.NIL;
        }
        if (var4 == module0454.UNPROVIDED) {
            var4 = (SubLObject)module0454.NIL;
        }
        if (module0454.NIL != module0349.f23386(var1, var3)) {
            return Sort.sort(module0256.f16531(var1, var3, var4), (SubLObject)module0454.$ic10$, (SubLObject)module0454.UNPROVIDED);
        }
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31146(final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0454.UNPROVIDED) {
            var3 = (SubLObject)module0454.NIL;
        }
        if (var4 == module0454.UNPROVIDED) {
            var4 = (SubLObject)module0454.NIL;
        }
        if (module0454.NIL != module0349.f23386(var2, var3)) {
            return module0256.f16552(var2, var3, var4);
        }
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31147(final SubLObject var5, final SubLObject var6, SubLObject var3) {
        if (var3 == module0454.UNPROVIDED) {
            var3 = (SubLObject)module0454.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0454.NIL;
        final SubLObject var9 = module0147.f9540(var3);
        final SubLObject var10 = module0147.$g2095$.currentBinding(var7);
        final SubLObject var11 = module0147.$g2094$.currentBinding(var7);
        final SubLObject var12 = module0147.$g2096$.currentBinding(var7);
        try {
            module0147.$g2095$.bind(module0147.f9545(var9), var7);
            module0147.$g2094$.bind(module0147.f9546(var9), var7);
            module0147.$g2096$.bind(module0147.f9549(var9), var7);
            if (module0454.NIL != module0349.f23386(var5, (SubLObject)module0454.UNPROVIDED) && module0454.NIL != module0349.f23386(var6, (SubLObject)module0454.UNPROVIDED)) {
                var8 = module0256.f16565(var5, var6, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED);
            }
        }
        finally {
            module0147.$g2096$.rebind(var12, var7);
            module0147.$g2094$.rebind(var11, var7);
            module0147.$g2095$.rebind(var10, var7);
        }
        return var8;
    }
    
    public static SubLObject f31148(final SubLObject var13, SubLObject var14) {
        if (var14 == module0454.UNPROVIDED) {
            var14 = (SubLObject)module0454.NIL;
        }
        final SubLObject var15 = module0205.f13387(var13, (SubLObject)module0454.UNPROVIDED);
        final SubLObject var16 = module0205.f13388(var13, (SubLObject)module0454.UNPROVIDED);
        if (module0454.NIL != f31143(var15, var16, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)module0454.$ic11$, var13, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED), (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED);
        }
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31149(final SubLObject var13, SubLObject var14) {
        if (var14 == module0454.UNPROVIDED) {
            var14 = (SubLObject)module0454.NIL;
        }
        return f31148(var13, (SubLObject)module0454.UNPROVIDED);
    }
    
    public static SubLObject f31150(final SubLObject var13, SubLObject var14) {
        if (var14 == module0454.UNPROVIDED) {
            var14 = (SubLObject)module0454.NIL;
        }
        return module0549.f33899(module0205.f13387(var13, (SubLObject)module0454.UNPROVIDED));
    }
    
    public static SubLObject f31151(final SubLObject var13, SubLObject var14) {
        if (var14 == module0454.UNPROVIDED) {
            var14 = (SubLObject)module0454.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13387(var13, (SubLObject)module0454.UNPROVIDED);
        final SubLObject var17 = module0205.f13388(var13, (SubLObject)module0454.UNPROVIDED);
        SubLObject var19;
        final SubLObject var18 = var19 = f31145(var16, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED);
        SubLObject var20 = (SubLObject)module0454.NIL;
        var20 = var19.first();
        while (module0454.NIL != var19) {
            var15.resetMultipleValues();
            final SubLObject var21 = module0235.f15474(var17, var20, (SubLObject)module0454.T, (SubLObject)module0454.T);
            final SubLObject var22 = var15.secondMultipleValue();
            var15.resetMultipleValues();
            if (module0454.NIL != var21) {
                final SubLObject var23 = module0233.f15361(var21, var17);
                final SubLObject var24 = (SubLObject)ConsesLow.list(module0454.$ic0$, var16, var23);
                module0347.f23330(module0191.f11990((SubLObject)module0454.$ic11$, var24, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED), var21, var22);
            }
            var19 = var19.rest();
            var20 = var19.first();
        }
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31152(final SubLObject var13, SubLObject var14) {
        if (var14 == module0454.UNPROVIDED) {
            var14 = (SubLObject)module0454.NIL;
        }
        return f31151(var13, (SubLObject)module0454.UNPROVIDED);
    }
    
    public static SubLObject f31153(final SubLObject var13, SubLObject var14) {
        if (var14 == module0454.UNPROVIDED) {
            var14 = (SubLObject)module0454.NIL;
        }
        final SubLObject var15 = module0205.f13388(var13, (SubLObject)module0454.UNPROVIDED);
        return Numbers.max(module0549.f33901(var15), module0217.f14223(var15, (SubLObject)module0454.TWO_INTEGER, module0454.$ic0$));
    }
    
    public static SubLObject f31154(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0549.f33901(var20).numG(module0454.$g3602$.getDynamicValue(var21))) {
            return module0227.f15185(var20);
        }
        return module0052.f3709(f31146(var20, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED));
    }
    
    public static SubLObject f31155(final SubLObject var13, SubLObject var14) {
        if (var14 == module0454.UNPROVIDED) {
            var14 = (SubLObject)module0454.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0205.f13387(var13, (SubLObject)module0454.UNPROVIDED);
        final SubLObject var17 = module0205.f13388(var13, (SubLObject)module0454.UNPROVIDED);
        if (module0454.NIL != module0018.$g646$.getDynamicValue(var15) && module0454.NIL == f31143(var16, var17, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)module0454.$ic23$, module0205.f13338(var13), (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED), (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED);
        }
        else if (module0454.NIL != f31144(var16, var17, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)module0454.$ic11$, module0205.f13338(var13), (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED), (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED);
        }
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31156(final SubLObject var25) {
        return f31157(var25, module0454.$ic0$);
    }
    
    public static SubLObject f31158(final SubLObject var25) {
        assert module0454.NIL != module0204.f13077(var25) : var25;
        SubLObject var26 = (SubLObject)module0454.NIL;
        SubLObject var27 = (SubLObject)module0454.NIL;
        SubLObject var28 = module0232.f15308(var25);
        SubLObject var29 = (SubLObject)module0454.NIL;
        var29 = var28.first();
        while (module0454.NIL != var28) {
            SubLObject var31;
            final SubLObject var30 = var31 = var29;
            SubLObject var32 = (SubLObject)module0454.NIL;
            SubLObject var33 = (SubLObject)module0454.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0454.$ic29$);
            var32 = var31.first();
            var31 = var31.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var31, var30, (SubLObject)module0454.$ic29$);
            var33 = var31.first();
            var31 = var31.rest();
            if (module0454.NIL == var31) {
                if (module0454.NIL != module0193.f12067(module0205.f13388(var33, (SubLObject)module0454.UNPROVIDED))) {
                    var26 = module0205.f13387(var33, (SubLObject)module0454.UNPROVIDED);
                }
                else {
                    var27 = module0205.f13388(var33, (SubLObject)module0454.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var30, (SubLObject)module0454.$ic29$);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        assert module0454.NIL != module0173.f10955(var26) : var26;
        assert module0454.NIL != module0173.f10955(var27) : var27;
        final SubLObject var34 = Numbers.subtract(module0549.f33899(var26), module0549.f33899(var27));
        return Numbers.max((SubLObject)module0454.ZERO_INTEGER, module0048.f_1X(var34));
    }
    
    public static SubLObject f31159() {
        return (SubLObject)((module0454.NIL != module0226.f14847(module0454.$ic0$, (SubLObject)module0454.UNPROVIDED)) ? module0454.$ic31$ : module0454.$ic32$);
    }
    
    public static SubLObject f31160(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var28;
        final SubLObject var27 = var28 = module0232.f15308(var25);
        SubLObject var29 = (SubLObject)module0454.NIL;
        SubLObject var30 = (SubLObject)module0454.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0454.$ic34$);
        var29 = var28.first();
        var28 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0454.$ic34$);
        var30 = var28.first();
        var28 = var28.rest();
        if (module0454.NIL == var28) {
            SubLObject var36_37;
            final SubLObject var34_35 = var36_37 = var29;
            SubLObject var31 = (SubLObject)module0454.NIL;
            SubLObject var32 = (SubLObject)module0454.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var36_37, var34_35, (SubLObject)module0454.$ic35$);
            var31 = var36_37.first();
            var36_37 = var36_37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var36_37, var34_35, (SubLObject)module0454.$ic35$);
            var32 = var36_37.first();
            var36_37 = var36_37.rest();
            if (module0454.NIL == var36_37) {
                SubLObject var42_43;
                final SubLObject var40_41 = var42_43 = var30;
                SubLObject var33 = (SubLObject)module0454.NIL;
                SubLObject var34 = (SubLObject)module0454.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var42_43, var40_41, (SubLObject)module0454.$ic36$);
                var33 = var42_43.first();
                var42_43 = var42_43.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var42_43, var40_41, (SubLObject)module0454.$ic36$);
                var34 = var42_43.first();
                var42_43 = var42_43.rest();
                if (module0454.NIL == var42_43) {
                    if (var31.equal(var33)) {
                        var26.resetMultipleValues();
                        final SubLObject var35 = f31161(var32, var34);
                        final SubLObject var36 = var26.secondMultipleValue();
                        final SubLObject var37 = var26.thirdMultipleValue();
                        var26.resetMultipleValues();
                        final SubLObject var38 = module0205.f13387(var35, (SubLObject)module0454.UNPROVIDED);
                        final SubLObject var39 = module0205.f13388(var35, (SubLObject)module0454.UNPROVIDED);
                        final SubLObject var40 = module0205.f13388(var36, (SubLObject)module0454.UNPROVIDED);
                        SubLObject var41 = f31147(var38, var40, var31);
                        SubLObject var42 = (SubLObject)module0454.NIL;
                        var42 = var41.first();
                        while (module0454.NIL != var41) {
                            var26.resetMultipleValues();
                            final SubLObject var43 = module0235.f15474(var39, var42, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED);
                            final SubLObject var44 = var26.secondMultipleValue();
                            var26.resetMultipleValues();
                            if (module0454.NIL != var43) {
                                final SubLObject var45 = module0202.f12768(module0454.$ic0$, var38, var42);
                                final SubLObject var46 = module0202.f12768(module0454.$ic0$, var42, var40);
                                final SubLObject var47 = module0191.f11990((SubLObject)module0454.$ic11$, var45, var31, (SubLObject)module0454.UNPROVIDED);
                                final SubLObject var48 = module0191.f11990((SubLObject)module0454.$ic11$, var46, var31, (SubLObject)module0454.UNPROVIDED);
                                final SubLObject var49 = (SubLObject)ConsesLow.list(var47);
                                final SubLObject var50 = (SubLObject)ConsesLow.list(var48);
                                final SubLObject var51 = (SubLObject)((module0454.NIL != var37) ? ConsesLow.list(var49, var50) : ConsesLow.list(var50, var49));
                                module0376.f26641(var43, var51);
                            }
                            var41 = var41.rest();
                            var42 = var41.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var40_41, (SubLObject)module0454.$ic36$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var34_35, (SubLObject)module0454.$ic35$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0454.$ic34$);
        }
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31157(final SubLObject var25, final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)module0454.NIL;
        var61.resetMultipleValues();
        final SubLObject var63 = f31162(var25, var60);
        final SubLObject var64 = var61.secondMultipleValue();
        var61.resetMultipleValues();
        if (module0454.NIL != var63 && module0454.NIL != var64) {
            final SubLObject var65 = module0067.f4880(Symbols.symbol_function((SubLObject)module0454.EQL), (SubLObject)module0454.UNPROVIDED);
            SubLObject var66 = var64;
            SubLObject var67 = (SubLObject)module0454.NIL;
            var67 = var66.first();
            while (module0454.NIL != var66) {
                SubLObject var69;
                final SubLObject var68 = var69 = var67;
                SubLObject var70 = (SubLObject)module0454.NIL;
                SubLObject var71 = (SubLObject)module0454.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)module0454.$ic37$);
                var70 = var69.first();
                var69 = var69.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)module0454.$ic37$);
                var71 = var69.first();
                var69 = var69.rest();
                if (module0454.NIL == var69) {
                    module0084.f5762(var65, var71, var70);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)module0454.$ic37$);
                }
                var66 = var66.rest();
                var67 = var66.first();
            }
            var66 = var63;
            var67 = (SubLObject)module0454.NIL;
            var67 = var66.first();
            while (module0454.NIL != var66) {
                SubLObject var73;
                final SubLObject var72 = var73 = var67;
                SubLObject var70 = (SubLObject)module0454.NIL;
                SubLObject var71 = (SubLObject)module0454.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var73, var72, (SubLObject)module0454.$ic37$);
                var70 = var73.first();
                var73 = var73.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var73, var72, (SubLObject)module0454.$ic37$);
                var71 = var73.first();
                var73 = var73.rest();
                if (module0454.NIL == var73) {
                    SubLObject var19_72;
                    final SubLObject var74 = var19_72 = module0067.f4884(var65, var71, (SubLObject)module0454.UNPROVIDED);
                    SubLObject var75 = (SubLObject)module0454.NIL;
                    var75 = var19_72.first();
                    while (module0454.NIL != var19_72) {
                        final SubLObject var76 = module0204.f13098((SubLObject)module0454.NIL, (SubLObject)ConsesLow.list(var70, var75));
                        var62 = (SubLObject)ConsesLow.cons(var76, var62);
                        var19_72 = var19_72.rest();
                        var75 = var19_72.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var72, (SubLObject)module0454.$ic37$);
                }
                var66 = var66.rest();
                var67 = var66.first();
            }
        }
        return Sequences.nreverse(var62);
    }
    
    public static SubLObject f31162(final SubLObject var25, final SubLObject var60) {
        SubLObject var61 = (SubLObject)module0454.NIL;
        SubLObject var62 = (SubLObject)module0454.NIL;
        SubLObject var63 = (SubLObject)module0454.ZERO_INTEGER;
        SubLObject var64 = module0232.f15308(var25);
        SubLObject var65 = (SubLObject)module0454.NIL;
        var65 = var64.first();
        while (module0454.NIL != var64) {
            SubLObject var67;
            final SubLObject var66 = var67 = var65;
            SubLObject var68 = (SubLObject)module0454.NIL;
            SubLObject var69 = (SubLObject)module0454.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0454.$ic29$);
            var68 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0454.$ic29$);
            var69 = var67.first();
            var67 = var67.rest();
            if (module0454.NIL == var67) {
                if (module0454.NIL != module0205.f13332(var69, var60)) {
                    final SubLObject var70 = module0205.f13387(var69, (SubLObject)module0454.UNPROVIDED);
                    final SubLObject var71 = module0205.f13388(var69, (SubLObject)module0454.UNPROVIDED);
                    if (module0454.NIL != module0193.f12067(var70) && module0454.NIL != module0173.f10955(var71)) {
                        var61 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var70), var61);
                    }
                    else if (module0454.NIL != module0173.f10955(var70) && module0454.NIL != module0193.f12067(var71)) {
                        var62 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var63, var71), var62);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var66, (SubLObject)module0454.$ic29$);
            }
            var63 = Numbers.add(var63, (SubLObject)module0454.ONE_INTEGER);
            var64 = var64.rest();
            var65 = var64.first();
        }
        var61 = Sequences.nreverse(var61);
        var62 = Sequences.nreverse(var62);
        return Values.values(var61, var62);
    }
    
    public static SubLObject f31161(final SubLObject var39, final SubLObject var45) {
        if (module0454.NIL != module0173.f10955(module0205.f13387(var39, (SubLObject)module0454.UNPROVIDED))) {
            return Values.values(var39, var45, (SubLObject)module0454.T);
        }
        return Values.values(var45, var39, (SubLObject)module0454.NIL);
    }
    
    public static SubLObject f31163(final SubLObject var13, SubLObject var14) {
        if (var14 == module0454.UNPROVIDED) {
            var14 = (SubLObject)module0454.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = f31164(var13);
        final SubLObject var17 = module0434.f30594(var16, module0147.$g2095$.getDynamicValue(var15), (SubLObject)module0454.UNPROVIDED);
        if (module0454.NIL != var17) {
            final SubLObject var18 = module0191.f11990((SubLObject)module0454.$ic42$, var16, (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED);
            if (module0454.NIL != module0540.f33533(var17)) {
                module0347.f23330(var18, (SubLObject)module0454.NIL, (SubLObject)module0454.NIL);
            }
        }
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31165(final SubLObject var13, SubLObject var14) {
        if (var14 == module0454.UNPROVIDED) {
            var14 = (SubLObject)module0454.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = f31164(var13);
        final SubLObject var17 = module0434.f30594(var16, module0147.$g2095$.getDynamicValue(var15), (SubLObject)module0454.UNPROVIDED);
        if (module0454.NIL == var17) {
            final SubLObject var18 = module0191.f11990((SubLObject)module0454.$ic42$, (SubLObject)ConsesLow.list(module0454.$ic43$, var16), (SubLObject)module0454.UNPROVIDED, (SubLObject)module0454.UNPROVIDED);
            module0347.f23330(var18, (SubLObject)module0454.NIL, (SubLObject)module0454.NIL);
        }
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31164(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var14.resetMultipleValues();
        final SubLObject var15 = module0202.f12796(var13);
        final SubLObject var16 = var14.secondMultipleValue();
        final SubLObject var17 = var14.thirdMultipleValue();
        var14.resetMultipleValues();
        var14.resetMultipleValues();
        final SubLObject var18 = module0202.f12796(var16);
        final SubLObject var19 = var14.secondMultipleValue();
        final SubLObject var20 = var14.thirdMultipleValue();
        var14.resetMultipleValues();
        var14.resetMultipleValues();
        final SubLObject var21 = module0202.f12796(var17);
        final SubLObject var22 = var14.secondMultipleValue();
        final SubLObject var23 = var14.thirdMultipleValue();
        var14.resetMultipleValues();
        return (SubLObject)ConsesLow.list(module0454.$ic44$, (SubLObject)ConsesLow.list(module0454.$ic0$, var19, var22), (SubLObject)ConsesLow.list(module0454.$ic45$, var20, var23));
    }
    
    public static SubLObject f31166(final SubLObject var13, SubLObject var14) {
        if (var14 == module0454.UNPROVIDED) {
            var14 = (SubLObject)module0454.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0454.NIL != module0193.f12105(var13)) {
            return (SubLObject)module0454.ONE_INTEGER;
        }
        var15.resetMultipleValues();
        final SubLObject var16 = f31167(var13);
        final SubLObject var17 = var15.secondMultipleValue();
        var15.resetMultipleValues();
        return module0411.f28638(var16, (SubLObject)module0454.$ic2$, var17, (SubLObject)module0454.UNPROVIDED);
    }
    
    public static SubLObject f31168(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (module0454.NIL != module0193.f12105(var13)) {
            return (SubLObject)module0454.$ic31$;
        }
        var14.resetMultipleValues();
        final SubLObject var15 = f31167(var13);
        final SubLObject var16 = var14.secondMultipleValue();
        var14.resetMultipleValues();
        return module0411.f28643(var15, (SubLObject)module0454.$ic2$, var16);
    }
    
    public static SubLObject f31169(final SubLObject var13, SubLObject var14) {
        if (var14 == module0454.UNPROVIDED) {
            var14 = (SubLObject)module0454.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        var15.resetMultipleValues();
        final SubLObject var16 = f31167(var13);
        final SubLObject var17 = var15.secondMultipleValue();
        var15.resetMultipleValues();
        SubLObject var19;
        final SubLObject var18 = var19 = module0434.f30594(var16, var17, (SubLObject)module0454.UNPROVIDED);
        SubLObject var20 = (SubLObject)module0454.NIL;
        var20 = var19.first();
        while (module0454.NIL != var19) {
            final SubLObject var21 = module0233.f15362(var20, var16);
            final SubLObject var22 = module0191.f11990((SubLObject)module0454.$ic42$, var21, var17, (SubLObject)module0454.$ic51$);
            module0347.f23330(var22, var20, (SubLObject)module0454.UNPROVIDED);
            var19 = var19.rest();
            var20 = var19.first();
        }
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31167(final SubLObject var13) {
        SubLObject var14 = (SubLObject)module0454.NIL;
        SubLObject var15 = (SubLObject)module0454.NIL;
        SubLObject var16 = (SubLObject)module0454.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var13, (SubLObject)module0454.$ic53$);
        var14 = var13.first();
        SubLObject var17 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)module0454.$ic53$);
        var15 = var17.first();
        var17 = var17.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var17, var13, (SubLObject)module0454.$ic53$);
        var16 = var17.first();
        var17 = var17.rest();
        if (module0454.NIL == var17) {
            return Values.values(module0202.f12768(module0454.$ic0$, var15, var16), module0147.f9496());
        }
        cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0454.$ic53$);
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31170() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31143", "S#24963", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31144", "S#24960", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31145", "S#34426", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31146", "S#34427", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31147", "S#34428", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31148", "S#34424", 1, 1, false);
        new $f31148$UnaryFunction();
        new $f31148$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31149", "S#34429", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31150", "S#34430", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31151", "S#34431", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31152", "S#34432", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31153", "S#34433", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31154", "S#34434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31155", "S#34435", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31156", "S#34425", 1, 0, false);
        new $f31156$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31158", "S#34436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31159", "S#34437", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31160", "S#34438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31157", "S#34324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31162", "S#34439", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31161", "S#34440", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31163", "S#34441", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31165", "S#34442", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31164", "S#34443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31166", "S#34444", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31168", "S#34445", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31169", "S#34446", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0454", "f31167", "S#34447", 1, 0, false);
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31171() {
        module0454.$g3600$ = SubLFiles.defparameter("S#34448", module0018.$g658$.getDynamicValue());
        module0454.$g3601$ = SubLFiles.defparameter("S#34449", module0018.$g665$.getDynamicValue());
        module0454.$g3602$ = SubLFiles.defparameter("S#34450", (SubLObject)module0454.$ic20$);
        module0454.$g3603$ = SubLFiles.defparameter("S#34451", (SubLObject)module0454.ONE_INTEGER);
        return (SubLObject)module0454.NIL;
    }
    
    public static SubLObject f31172() {
        module0340.f22938(module0454.$ic0$);
        module0340.f22944(module0454.$ic0$, (SubLObject)module0454.$ic1$);
        module0358.f23774((SubLObject)module0454.$ic2$, module0454.$ic0$);
        module0358.f23773((SubLObject)module0454.$ic3$, module0454.$ic0$);
        module0358.f23730((SubLObject)module0454.$ic4$, (SubLObject)module0454.$ic5$);
        module0358.f23730((SubLObject)module0454.$ic6$, (SubLObject)module0454.$ic7$);
        module0358.f23730((SubLObject)module0454.$ic8$, (SubLObject)module0454.$ic9$);
        module0340.f22941((SubLObject)module0454.$ic12$, (SubLObject)module0454.$ic13$);
        module0340.f22941((SubLObject)module0454.$ic14$, (SubLObject)module0454.$ic15$);
        module0340.f22941((SubLObject)module0454.$ic16$, (SubLObject)module0454.$ic17$);
        module0340.f22941((SubLObject)module0454.$ic18$, (SubLObject)module0454.$ic19$);
        module0340.f22941((SubLObject)module0454.$ic21$, (SubLObject)module0454.$ic22$);
        module0340.f22941((SubLObject)module0454.$ic24$, (SubLObject)module0454.$ic25$);
        module0340.f22962((SubLObject)module0454.$ic26$, (SubLObject)module0454.$ic27$);
        module0012.f419((SubLObject)module0454.$ic33$);
        module0340.f22941((SubLObject)module0454.$ic38$, (SubLObject)module0454.$ic39$);
        module0340.f22941((SubLObject)module0454.$ic40$, (SubLObject)module0454.$ic41$);
        module0340.f22938(module0454.$ic46$);
        module0358.f23774((SubLObject)module0454.$ic2$, module0454.$ic46$);
        module0340.f22941((SubLObject)module0454.$ic47$, (SubLObject)module0454.$ic48$);
        module0012.f419((SubLObject)module0454.$ic49$);
        module0012.f419((SubLObject)module0454.$ic50$);
        module0012.f419((SubLObject)module0454.$ic52$);
        module0340.f22941((SubLObject)module0454.$ic54$, (SubLObject)module0454.$ic55$);
        return (SubLObject)module0454.NIL;
    }
    
    public void declareFunctions() {
        f31170();
    }
    
    public void initializeVariables() {
        f31171();
    }
    
    public void runTopLevelForms() {
        f31172();
    }
    
    static {
        me = (SubLFile)new module0454();
        module0454.$g3600$ = null;
        module0454.$g3601$ = null;
        module0454.$g3602$ = null;
        module0454.$g3603$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic1$ = SubLObjectFactory.makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
        $ic2$ = SubLObjectFactory.makeKeyword("POS");
        $ic3$ = SubLObjectFactory.makeKeyword("NEG");
        $ic4$ = SubLObjectFactory.makeKeyword("ALL-SPECS-OF-FORT-POS");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $ic6$ = SubLObjectFactory.makeKeyword("ALL-SPECS-OF-NON-FORT-POS");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $ic8$ = SubLObjectFactory.makeKeyword("ALL-GENLS-POS");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#17515", "CYC");
        $ic11$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic12$ = SubLObjectFactory.makeKeyword("REMOVAL-SUPERSET");
        $ic13$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34448", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34424", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls <fort> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls #$Dog #$Animal)") });
        $ic14$ = SubLObjectFactory.makeKeyword("REMOVAL-NAT-GENLS");
        $ic15$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34448", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34429", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls (<fully-bound> . <fully-bound>) <fully-bound>)\n    via #$resultGenl and #$resultGenlArg"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls (#$JuvenileFn #$Cougar) #$Animal)") });
        $ic16$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-GENLS");
        $ic17$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34430", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34431", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls <fort> <not fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls #$Dog ?WHAT)") });
        $ic18$ = SubLObjectFactory.makeKeyword("REMOVAL-NAT-ALL-GENLS");
        $ic19$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#34449", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34432", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls (<fully-bound> . <fully-bound>) <not fully-bound>)\n    via #$resultGenl and #$resultGenlArg"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls (#$JuvenileFn #$Cougar) ?WHAT)") });
        $ic20$ = SubLObjectFactory.makeInteger(550);
        $ic21$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-SPECS");
        $ic22$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34433", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34434", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12458", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("GENLS"), SubLObjectFactory.makeKeyword("SUPPORT-STRENGTH"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls <not fully-bound> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genls ?WHAT #$Animal)") });
        $ic23$ = SubLObjectFactory.makeKeyword("MINIMIZE");
        $ic24$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-SUPERSET");
        $ic25$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("S#1875", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34448", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34451", "CYC")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34435", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$genls <fort> <fully-bound>))\n    (#$not (#$genls (<fully-bound> . <fully-bound>) <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$genls #$Collection #$Individual))\n    (#$not (#$genls (#$JuvenileFn #$Cougar) #$Individual))") });
        $ic26$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-BETWEEN");
        $ic27$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("EVERY-PREDICATES"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"))), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeSymbol("S#34425", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34436", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34437", "CYC")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34438", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$and (#$genls <fort1> <varN>)\n           (#$genls <varN> <fort2>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$and (#$genls #$Dog ?COL)\n           (#$genls ?COL #$Animal))") });
        $ic28$ = SubLObjectFactory.makeSymbol("S#15975", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic31$ = SubLObjectFactory.makeKeyword("COMPLETE");
        $ic32$ = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $ic33$ = SubLObjectFactory.makeSymbol("S#34437", "CYC");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#34423", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34273", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#34267", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34268", "CYC"));
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#34269", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34270", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"));
        $ic38$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-COLLECTION-SUBSET-FN-POS-CHECK");
        $ic39$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34441", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>))") });
        $ic40$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-COLLECTION-SUBSET-FN-NEG-CHECK");
        $ic41$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1889", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34442", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>)))") });
        $ic42$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic43$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("subsetOf"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlsDown"));
        $ic47$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-DOWN-ARG2-BOUND");
        $ic48$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlsDown")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlsDown")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34444", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34445", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#34446", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlsDown <fully-bound> <fully-bound>)\n(#$genlsDown <not-fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlsDown #$Dog #$Animal)\n(#$genlsDown ?WHAT #$Dog)") });
        $ic49$ = SubLObjectFactory.makeSymbol("S#34444", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#34445", "CYC");
        $ic51$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic52$ = SubLObjectFactory.makeSymbol("S#34446", "CYC");
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#34452", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#751", "CYC"));
        $ic54$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLS-DOWN-ARG2-UNIFY");
        $ic55$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlsDown")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlsDown")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0454.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlsDown")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlsDown")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("REFLEXIVE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$genlsDown <fully-bound> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$genlsDown #$Dog ?WHAT)") });
    }
    
    public static final class $f31148$UnaryFunction extends UnaryFunction
    {
        public $f31148$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34424"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return module0454.f31148(var15, (SubLObject)$f31148$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31148$BinaryFunction extends BinaryFunction
    {
        public $f31148$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34424"));
        }
        
        public SubLObject processItem(final SubLObject var15, final SubLObject var16) {
            return module0454.f31148(var15, var16);
        }
    }
    
    public static final class $f31156$UnaryFunction extends UnaryFunction
    {
        public $f31156$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34425"));
        }
        
        public SubLObject processItem(final SubLObject var15) {
            return module0454.f31156(var15);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0454.class
	Total time: 288 ms
	
	Decompiled with Procyon 0.5.32.
*/