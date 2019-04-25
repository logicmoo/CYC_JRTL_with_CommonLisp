package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0722 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0722";
    public static final String myFingerPrint = "5f90365ca969bf41a7c6ef4ef2e9ff98d674680f32aa878cf9ba7a564df5dcc6";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    
    public static SubLObject f44228(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        if (module0722.NIL != module0161.f10482(var1) && module0722.NIL != module0035.f2192(Symbols.symbol_function((SubLObject)module0722.$ic0$), var3)) {
            return module0259.f16841(var1, var3, var2, (SubLObject)module0722.UNPROVIDED);
        }
        SubLObject var4 = (SubLObject)module0722.NIL;
        SubLObject var5 = var3;
        SubLObject var6 = (SubLObject)module0722.NIL;
        var6 = var5.first();
        while (module0722.NIL != var5) {
            if (module0722.NIL != module0731.f44785(var6, var1, var2)) {
                var4 = (SubLObject)ConsesLow.cons(var6, var4);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return Sequences.nreverse(var4);
    }
    
    public static SubLObject f44229(final SubLObject var7, final SubLObject var8, final SubLObject var2, final SubLObject var9, SubLObject var10) {
        if (var10 == module0722.UNPROVIDED) {
            var10 = (SubLObject)module0722.T;
        }
        return f44230(module0205.f13394(var8, var7, (SubLObject)module0722.UNPROVIDED), var8, var2, var9);
    }
    
    public static SubLObject f44230(final SubLObject var6, final SubLObject var8, final SubLObject var2, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0722.NIL;
        SubLObject var12 = (SubLObject)module0722.NIL;
        SubLObject var13 = (SubLObject)module0722.NIL;
        final SubLObject var14 = (module0722.NIL != module0004.f104(var2, (SubLObject)module0722.$ic3$, (SubLObject)module0722.UNPROVIDED, (SubLObject)module0722.UNPROVIDED)) ? module0722.$ic4$ : var2;
        var10.resetMultipleValues();
        final SubLObject var15 = f44231(var6, var8, var2);
        final SubLObject var16 = var10.secondMultipleValue();
        final SubLObject var17 = var10.thirdMultipleValue();
        var10.resetMultipleValues();
        var13 = f44232(var15, module0722.$ic5$, var2);
        SubLObject var18 = var9;
        SubLObject var19 = (SubLObject)module0722.NIL;
        var19 = var18.first();
        while (module0722.NIL != var18) {
            if (module0722.NIL != var13 && module0722.NIL != module0269.f17713(var19, (SubLObject)module0722.UNPROVIDED)) {
                var12 = (SubLObject)ConsesLow.cons(var19, var12);
            }
            else if (module0722.NIL != f44233(var15, var19, var2)) {
                var12 = (SubLObject)ConsesLow.cons(var19, var12);
            }
            else if (module0722.NIL != module0257.f16693(var16, module0256.f16525(var19, var2, (SubLObject)module0722.UNPROVIDED), var14, (SubLObject)module0722.UNPROVIDED, (SubLObject)module0722.UNPROVIDED)) {
                var12 = (SubLObject)ConsesLow.cons(var19, var12);
            }
            else if (module0722.NIL != f44232(var15, module0722.$ic6$, var2) && module0722.NIL == module0612.f37382(var19)) {
                var12 = (SubLObject)ConsesLow.cons(var19, var12);
            }
            else if (module0722.NIL == module0259.f16858(var19, var15, var2) && (module0722.NIL != module0257.f16693(var15, f44234(var19, var2), var14, (SubLObject)module0722.UNPROVIDED, (SubLObject)module0722.UNPROVIDED) || module0722.NIL != f44235(var15, var19, var2))) {
                var12 = (SubLObject)ConsesLow.cons(var19, var12);
            }
            else if (module0722.NIL != f44236(var17, var19, var2)) {
                var12 = (SubLObject)ConsesLow.cons(var19, var12);
            }
            else {
                var11 = (SubLObject)ConsesLow.cons(var19, var11);
            }
            var18 = var18.rest();
            var19 = var18.first();
        }
        return Values.values(Sequences.nreverse(var11), Sequences.nreverse(var12));
    }
    
    public static SubLObject f44237(final SubLObject var6, final SubLObject var2) {
        SubLObject var7 = module0259.f16822(var6, var2, (SubLObject)module0722.UNPROVIDED);
        if (module0722.NIL == var7 && var6.isNumber()) {
            var7 = (SubLObject)ConsesLow.list(module0722.$ic8$);
        }
        return var7;
    }
    
    public static SubLObject f44234(final SubLObject var6, final SubLObject var2) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0034.$g879$.getDynamicValue(var7);
        SubLObject var9 = (SubLObject)module0722.NIL;
        if (module0722.NIL == var8) {
            return f44237(var6, var2);
        }
        var9 = module0034.f1857(var8, (SubLObject)module0722.$ic7$, (SubLObject)module0722.UNPROVIDED);
        if (module0722.NIL == var9) {
            var9 = module0034.f1807(module0034.f1842(var8), (SubLObject)module0722.$ic7$, (SubLObject)module0722.TWO_INTEGER, (SubLObject)module0722.NIL, (SubLObject)module0722.EQUAL, (SubLObject)module0722.UNPROVIDED);
            module0034.f1860(var8, (SubLObject)module0722.$ic7$, var9);
        }
        final SubLObject var10 = module0034.f1782(var6, var2);
        final SubLObject var11 = module0034.f1814(var9, var10, (SubLObject)module0722.UNPROVIDED);
        if (var11 != module0722.$ic9$) {
            SubLObject var12 = var11;
            SubLObject var13 = (SubLObject)module0722.NIL;
            var13 = var12.first();
            while (module0722.NIL != var12) {
                SubLObject var14 = var13.first();
                final SubLObject var15 = conses_high.second(var13);
                if (var6.equal(var14.first())) {
                    var14 = var14.rest();
                    if (module0722.NIL != var14 && module0722.NIL == var14.rest() && var2.equal(var14.first())) {
                        return module0034.f1959(var15);
                    }
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        final SubLObject var16 = Values.arg2(var7.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44237(var6, var2)));
        module0034.f1836(var9, var10, var11, var16, (SubLObject)ConsesLow.list(var6, var2));
        return module0034.f1959(var16);
    }
    
    public static SubLObject f44238(final SubLObject var15, final SubLObject var6, final SubLObject var2) {
        SubLObject var16 = (SubLObject)module0722.NIL;
        if (module0722.NIL == var16) {
            SubLObject var17 = var15;
            SubLObject var18 = (SubLObject)module0722.NIL;
            var18 = var17.first();
            while (module0722.NIL == var16 && module0722.NIL != var17) {
                if (module0722.NIL != module0259.f16867(var6, var18, var2, (SubLObject)module0722.UNPROVIDED)) {
                    var16 = (SubLObject)module0722.T;
                }
                var17 = var17.rest();
                var18 = var17.first();
            }
        }
        return var16;
    }
    
    public static SubLObject f44235(final SubLObject var15, final SubLObject var6, final SubLObject var2) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = module0034.$g879$.getDynamicValue(var16);
        SubLObject var18 = (SubLObject)module0722.NIL;
        if (module0722.NIL == var17) {
            return f44238(var15, var6, var2);
        }
        var18 = module0034.f1857(var17, (SubLObject)module0722.$ic10$, (SubLObject)module0722.UNPROVIDED);
        if (module0722.NIL == var18) {
            var18 = module0034.f1807(module0034.f1842(var17), (SubLObject)module0722.$ic10$, (SubLObject)module0722.THREE_INTEGER, (SubLObject)module0722.NIL, (SubLObject)module0722.EQUAL, (SubLObject)module0722.UNPROVIDED);
            module0034.f1860(var17, (SubLObject)module0722.$ic10$, var18);
        }
        final SubLObject var19 = module0034.f1781(var15, var6, var2);
        final SubLObject var20 = module0034.f1814(var18, var19, (SubLObject)module0722.UNPROVIDED);
        if (var20 != module0722.$ic9$) {
            SubLObject var21 = var20;
            SubLObject var22 = (SubLObject)module0722.NIL;
            var22 = var21.first();
            while (module0722.NIL != var21) {
                SubLObject var23 = var22.first();
                final SubLObject var24 = conses_high.second(var22);
                if (var15.equal(var23.first())) {
                    var23 = var23.rest();
                    if (var6.equal(var23.first())) {
                        var23 = var23.rest();
                        if (module0722.NIL != var23 && module0722.NIL == var23.rest() && var2.equal(var23.first())) {
                            return module0034.f1959(var24);
                        }
                    }
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        final SubLObject var25 = Values.arg2(var16.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44238(var15, var6, var2)));
        module0034.f1836(var18, var19, var20, var25, (SubLObject)ConsesLow.list(var15, var6, var2));
        return module0034.f1959(var25);
    }
    
    public static SubLObject f44239(final SubLObject var17, final SubLObject var6, final SubLObject var2) {
        SubLObject var18 = (SubLObject)module0722.NIL;
        if (module0722.NIL == var18) {
            SubLObject var19 = var17;
            SubLObject var20 = (SubLObject)module0722.NIL;
            var20 = var19.first();
            while (module0722.NIL == var18 && module0722.NIL != var19) {
                if (module0722.NIL == module0305.f20527(var6, var20, var2)) {
                    var18 = (SubLObject)module0722.T;
                }
                var19 = var19.rest();
                var20 = var19.first();
            }
        }
        return var18;
    }
    
    public static SubLObject f44236(final SubLObject var17, final SubLObject var6, final SubLObject var2) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = module0034.$g879$.getDynamicValue(var18);
        SubLObject var20 = (SubLObject)module0722.NIL;
        if (module0722.NIL == var19) {
            return f44239(var17, var6, var2);
        }
        var20 = module0034.f1857(var19, (SubLObject)module0722.$ic11$, (SubLObject)module0722.UNPROVIDED);
        if (module0722.NIL == var20) {
            var20 = module0034.f1807(module0034.f1842(var19), (SubLObject)module0722.$ic11$, (SubLObject)module0722.THREE_INTEGER, (SubLObject)module0722.NIL, (SubLObject)module0722.EQUAL, (SubLObject)module0722.UNPROVIDED);
            module0034.f1860(var19, (SubLObject)module0722.$ic11$, var20);
        }
        final SubLObject var21 = module0034.f1781(var17, var6, var2);
        final SubLObject var22 = module0034.f1814(var20, var21, (SubLObject)module0722.UNPROVIDED);
        if (var22 != module0722.$ic9$) {
            SubLObject var23 = var22;
            SubLObject var24 = (SubLObject)module0722.NIL;
            var24 = var23.first();
            while (module0722.NIL != var23) {
                SubLObject var25 = var24.first();
                final SubLObject var26 = conses_high.second(var24);
                if (var17.equal(var25.first())) {
                    var25 = var25.rest();
                    if (var6.equal(var25.first())) {
                        var25 = var25.rest();
                        if (module0722.NIL != var25 && module0722.NIL == var25.rest() && var2.equal(var25.first())) {
                            return module0034.f1959(var26);
                        }
                    }
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
        }
        final SubLObject var27 = Values.arg2(var18.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44239(var17, var6, var2)));
        module0034.f1836(var20, var21, var22, var27, (SubLObject)ConsesLow.list(var17, var6, var2));
        return module0034.f1959(var27);
    }
    
    public static SubLObject f44240(final SubLObject var15, final SubLObject var18, final SubLObject var2) {
        SubLObject var19 = (SubLObject)module0722.NIL;
        if (module0722.NIL == var19) {
            SubLObject var20;
            SubLObject var21;
            for (var20 = var15, var21 = (SubLObject)module0722.NIL, var21 = var20.first(); module0722.NIL == var19 && module0722.NIL != var20; var19 = module0305.f20340(var21, var18, var2), var20 = var20.rest(), var21 = var20.first()) {}
        }
        return var19;
    }
    
    public static SubLObject f44233(final SubLObject var15, final SubLObject var18, final SubLObject var2) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0034.$g879$.getDynamicValue(var19);
        SubLObject var21 = (SubLObject)module0722.NIL;
        if (module0722.NIL == var20) {
            return f44240(var15, var18, var2);
        }
        var21 = module0034.f1857(var20, (SubLObject)module0722.$ic12$, (SubLObject)module0722.UNPROVIDED);
        if (module0722.NIL == var21) {
            var21 = module0034.f1807(module0034.f1842(var20), (SubLObject)module0722.$ic12$, (SubLObject)module0722.THREE_INTEGER, (SubLObject)module0722.NIL, (SubLObject)module0722.EQUAL, (SubLObject)module0722.UNPROVIDED);
            module0034.f1860(var20, (SubLObject)module0722.$ic12$, var21);
        }
        final SubLObject var22 = module0034.f1781(var15, var18, var2);
        final SubLObject var23 = module0034.f1814(var21, var22, (SubLObject)module0722.UNPROVIDED);
        if (var23 != module0722.$ic9$) {
            SubLObject var24 = var23;
            SubLObject var25 = (SubLObject)module0722.NIL;
            var25 = var24.first();
            while (module0722.NIL != var24) {
                SubLObject var26 = var25.first();
                final SubLObject var27 = conses_high.second(var25);
                if (var15.equal(var26.first())) {
                    var26 = var26.rest();
                    if (var18.equal(var26.first())) {
                        var26 = var26.rest();
                        if (module0722.NIL != var26 && module0722.NIL == var26.rest() && var2.equal(var26.first())) {
                            return module0034.f1959(var27);
                        }
                    }
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        final SubLObject var28 = Values.arg2(var19.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44240(var15, var18, var2)));
        module0034.f1836(var21, var22, var23, var28, (SubLObject)ConsesLow.list(var15, var18, var2));
        return module0034.f1959(var28);
    }
    
    public static SubLObject f44241(final SubLObject var3, final SubLObject var31, final SubLObject var2) {
        SubLObject var32 = (SubLObject)module0722.NIL;
        if (module0722.NIL == var32) {
            SubLObject var33 = var3;
            SubLObject var34 = (SubLObject)module0722.NIL;
            var34 = var33.first();
            while (module0722.NIL == var32 && module0722.NIL != var33) {
                if (module0722.NIL != module0256.f16596(var34, var31, var2, (SubLObject)module0722.UNPROVIDED)) {
                    var32 = (SubLObject)module0722.T;
                }
                var33 = var33.rest();
                var34 = var33.first();
            }
        }
        return var32;
    }
    
    public static SubLObject f44232(final SubLObject var3, final SubLObject var31, final SubLObject var2) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        final SubLObject var33 = module0034.$g879$.getDynamicValue(var32);
        SubLObject var34 = (SubLObject)module0722.NIL;
        if (module0722.NIL == var33) {
            return f44241(var3, var31, var2);
        }
        var34 = module0034.f1857(var33, (SubLObject)module0722.$ic13$, (SubLObject)module0722.UNPROVIDED);
        if (module0722.NIL == var34) {
            var34 = module0034.f1807(module0034.f1842(var33), (SubLObject)module0722.$ic13$, (SubLObject)module0722.THREE_INTEGER, (SubLObject)module0722.NIL, (SubLObject)module0722.EQUAL, (SubLObject)module0722.UNPROVIDED);
            module0034.f1860(var33, (SubLObject)module0722.$ic13$, var34);
        }
        final SubLObject var35 = module0034.f1781(var3, var31, var2);
        final SubLObject var36 = module0034.f1814(var34, var35, (SubLObject)module0722.UNPROVIDED);
        if (var36 != module0722.$ic9$) {
            SubLObject var37 = var36;
            SubLObject var38 = (SubLObject)module0722.NIL;
            var38 = var37.first();
            while (module0722.NIL != var37) {
                SubLObject var39 = var38.first();
                final SubLObject var40 = conses_high.second(var38);
                if (var3.equal(var39.first())) {
                    var39 = var39.rest();
                    if (var31.equal(var39.first())) {
                        var39 = var39.rest();
                        if (module0722.NIL != var39 && module0722.NIL == var39.rest() && var2.equal(var39.first())) {
                            return module0034.f1959(var40);
                        }
                    }
                }
                var37 = var37.rest();
                var38 = var37.first();
            }
        }
        final SubLObject var41 = Values.arg2(var32.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44241(var3, var31, var2)));
        module0034.f1836(var34, var35, var36, var41, (SubLObject)ConsesLow.list(var3, var31, var2));
        return module0034.f1959(var41);
    }
    
    public static SubLObject f44242(final SubLObject var6, final SubLObject var8, final SubLObject var2) {
        final SubLObject var9 = module0279.f18513(var8, (SubLObject)module0722.UNPROVIDED);
        final SubLObject var10 = module0205.f13250(var9, var6, var8, (SubLObject)module0722.EQUALP, (SubLObject)module0722.UNPROVIDED);
        final SubLObject var11 = module0307.f20765(var10, var2, (SubLObject)module0722.UNPROVIDED, (SubLObject)module0722.UNPROVIDED);
        final SubLObject var12 = module0067.f4884(var11, var9, (SubLObject)module0722.UNPROVIDED);
        if (module0722.NIL != var12) {
            SubLObject var14;
            final SubLObject var13 = var14 = var12;
            SubLObject var15 = (SubLObject)module0722.NIL;
            SubLObject var16 = (SubLObject)module0722.NIL;
            SubLObject var17 = (SubLObject)module0722.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0722.$ic15$);
            var15 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0722.$ic15$);
            var16 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0722.$ic15$);
            var17 = var14.first();
            var14 = var14.rest();
            if (module0722.NIL == var14) {
                return Values.values(Sequences.remove_if((SubLObject)module0722.$ic16$, var15, (SubLObject)module0722.UNPROVIDED, (SubLObject)module0722.UNPROVIDED, (SubLObject)module0722.UNPROVIDED, (SubLObject)module0722.UNPROVIDED), Sequences.remove_if((SubLObject)module0722.$ic16$, var16, (SubLObject)module0722.UNPROVIDED, (SubLObject)module0722.UNPROVIDED, (SubLObject)module0722.UNPROVIDED, (SubLObject)module0722.UNPROVIDED), var17);
            }
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0722.$ic15$);
        }
        return Values.values((SubLObject)module0722.NIL, (SubLObject)module0722.NIL);
    }
    
    public static SubLObject f44231(final SubLObject var6, final SubLObject var8, final SubLObject var2) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0034.$g879$.getDynamicValue(var9);
        SubLObject var11 = (SubLObject)module0722.NIL;
        if (module0722.NIL == var10) {
            return f44242(var6, var8, var2);
        }
        var11 = module0034.f1857(var10, (SubLObject)module0722.$ic14$, (SubLObject)module0722.UNPROVIDED);
        if (module0722.NIL == var11) {
            var11 = module0034.f1807(module0034.f1842(var10), (SubLObject)module0722.$ic14$, (SubLObject)module0722.THREE_INTEGER, (SubLObject)module0722.NIL, (SubLObject)module0722.EQUAL, (SubLObject)module0722.UNPROVIDED);
            module0034.f1860(var10, (SubLObject)module0722.$ic14$, var11);
        }
        final SubLObject var12 = module0034.f1781(var6, var8, var2);
        final SubLObject var13 = module0034.f1814(var11, var12, (SubLObject)module0722.UNPROVIDED);
        if (var13 != module0722.$ic9$) {
            SubLObject var14 = var13;
            SubLObject var15 = (SubLObject)module0722.NIL;
            var15 = var14.first();
            while (module0722.NIL != var14) {
                SubLObject var16 = var15.first();
                final SubLObject var17 = conses_high.second(var15);
                if (var6.equal(var16.first())) {
                    var16 = var16.rest();
                    if (var8.equal(var16.first())) {
                        var16 = var16.rest();
                        if (module0722.NIL != var16 && module0722.NIL == var16.rest() && var2.equal(var16.first())) {
                            return module0034.f1959(var17);
                        }
                    }
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
        }
        final SubLObject var18 = Values.arg2(var9.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f44242(var6, var8, var2)));
        module0034.f1836(var11, var12, var13, var18, (SubLObject)ConsesLow.list(var6, var8, var2));
        return module0034.f1959(var18);
    }
    
    public static SubLObject f44243() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44228", "S#48410", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44229", "FILTER-TERMS-FOR-ARG-CONSTRAINTS-AT-ARGPOS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44230", "FILTER-TERMS-FOR-ARG-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44237", "S#48411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44234", "S#48412", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44238", "S#48413", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44235", "S#48414", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44239", "S#48415", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44236", "S#48416", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44240", "S#48417", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44233", "S#48418", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44241", "S#48419", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44232", "S#48420", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44242", "S#48421", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0722", "f44231", "S#48422", 3, 0, false);
        return (SubLObject)module0722.NIL;
    }
    
    public static SubLObject f44244() {
        return (SubLObject)module0722.NIL;
    }
    
    public static SubLObject f44245() {
        module0002.f38((SubLObject)module0722.$ic1$);
        module0002.f38((SubLObject)module0722.$ic2$);
        module0034.f1895((SubLObject)module0722.$ic7$);
        module0034.f1895((SubLObject)module0722.$ic10$);
        module0034.f1895((SubLObject)module0722.$ic11$);
        module0034.f1895((SubLObject)module0722.$ic12$);
        module0034.f1895((SubLObject)module0722.$ic13$);
        module0034.f1895((SubLObject)module0722.$ic14$);
        return (SubLObject)module0722.NIL;
    }
    
    public void declareFunctions() {
        f44243();
    }
    
    public void initializeVariables() {
        f44244();
    }
    
    public void runTopLevelForms() {
        f44245();
    }
    
    static {
        me = (SubLFile)new module0722();
        $ic0$ = SubLObjectFactory.makeSymbol("S#13286", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("FILTER-TERMS-FOR-ARG-CONSTRAINTS-AT-ARGPOS");
        $ic2$ = SubLObjectFactory.makeSymbol("FILTER-TERMS-FOR-ARG-CONSTRAINTS");
        $ic3$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")));
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Individual"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Date"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#48412", "CYC");
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Number-General"));
        $ic9$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic10$ = SubLObjectFactory.makeSymbol("S#48414", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#48416", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#48418", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#48420", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#48422", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36997", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48423", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37001", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#17632", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0722.class
	Total time: 177 ms
	
	Decompiled with Procyon 0.5.32.
*/