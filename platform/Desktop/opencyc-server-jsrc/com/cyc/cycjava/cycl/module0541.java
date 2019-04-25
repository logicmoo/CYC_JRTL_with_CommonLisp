package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0541 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0541";
    public static final String myFingerPrint = "525b5109701448055e64dab8575d07ab071897254578cf0d61c1b798c29f6db0";
    private static SubLSymbol $g3940$;
    private static SubLSymbol $g3941$;
    private static SubLSymbol $g3942$;
    public static SubLSymbol $g3943$;
    private static SubLSymbol $g3944$;
    public static SubLSymbol $g3945$;
    private static SubLSymbol $g3946$;
    public static SubLSymbol $g3947$;
    public static SubLSymbol $g3948$;
    public static SubLSymbol $g3949$;
    public static SubLSymbol $g3950$;
    private static SubLSymbol $g3951$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLString $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLString $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLList $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLList $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLList $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLString $ic46$;
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLInteger $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLSymbol $ic82$;
    
    public static SubLObject f33544(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var2 == module0541.UNPROVIDED) {
            var2 = (SubLObject)module0541.NIL;
        }
        if (var3 == module0541.UNPROVIDED) {
            var3 = (SubLObject)module0541.NIL;
        }
        if (var4 == module0541.UNPROVIDED) {
            var4 = (SubLObject)module0541.NIL;
        }
        if (var5 == module0541.UNPROVIDED) {
            var5 = (SubLObject)module0541.NIL;
        }
        if (var6 == module0541.UNPROVIDED) {
            var6 = (SubLObject)module0541.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0541.NIL;
        SubLObject var9 = (SubLObject)module0541.NIL;
        final SubLObject var10 = module0018.$g656$.currentBinding(var7);
        try {
            module0018.$g656$.bind((SubLObject)module0541.$ic0$, var7);
            var7.resetMultipleValues();
            final SubLObject var11 = f33545(var1, var2, var3, var4, var5, var6);
            final SubLObject var12 = var7.secondMultipleValue();
            var7.resetMultipleValues();
            var8 = var11;
            var9 = var12;
        }
        finally {
            module0018.$g656$.rebind(var10, var7);
        }
        return Values.values(var8, var9);
    }
    
    public static SubLObject f33546(final SubLObject var1, final SubLObject var2, SubLObject var13, SubLObject var14) {
        if (var13 == module0541.UNPROVIDED) {
            var13 = (SubLObject)module0541.$ic1$;
        }
        if (var14 == module0541.UNPROVIDED) {
            var14 = (SubLObject)module0541.NIL;
        }
        return module0538.f33330((SubLObject)module0541.$ic2$, var1, var2, var13, var14, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
    }
    
    public static SubLObject f33547(final SubLObject var1, SubLObject var2, SubLObject var13, SubLObject var14) {
        if (var13 == module0541.UNPROVIDED) {
            var13 = (SubLObject)module0541.$ic1$;
        }
        if (var14 == module0541.UNPROVIDED) {
            var14 = (SubLObject)module0541.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        module0538.f33316();
        if (!var1.isCons()) {
            module0538.f33323((SubLObject)ConsesLow.list((SubLObject)module0541.$ic7$, (SubLObject)module0541.$ic8$, var1));
            return (SubLObject)module0541.NIL;
        }
        var2 = module0538.f33347(var2);
        if (module0541.NIL != module0538.f33324()) {
            return (SubLObject)module0541.NIL;
        }
        if (!var13.isString()) {
            module0538.f33323((SubLObject)ConsesLow.list((SubLObject)module0541.$ic7$, (SubLObject)module0541.$ic9$, var13));
            return (SubLObject)module0541.NIL;
        }
        var15.resetMultipleValues();
        final SubLObject var16 = f33548(var1, var2, var13, var14);
        final SubLObject var17 = var15.secondMultipleValue();
        final SubLObject var18 = var15.thirdMultipleValue();
        var15.resetMultipleValues();
        if (module0541.NIL == var17) {
            return Values.values((SubLObject)module0541.NIL, var18);
        }
        if (module0541.NIL == var16) {
            return Values.values(module0233.f15403(), (SubLObject)module0541.NIL);
        }
        return Values.values(var16, (SubLObject)module0541.NIL);
    }
    
    public static SubLObject f33548(final SubLObject var1, final SubLObject var2, SubLObject var13, SubLObject var14) {
        if (var13 == module0541.UNPROVIDED) {
            var13 = (SubLObject)module0541.$ic1$;
        }
        if (var14 == module0541.UNPROVIDED) {
            var14 = (SubLObject)module0541.NIL;
        }
        final SubLThread var15 = SubLProcess.currentSubLThread();
        var15.resetMultipleValues();
        final SubLObject var16 = module0370.f25926(var1, var2);
        final SubLObject var17 = var15.secondMultipleValue();
        final SubLObject var18 = var15.thirdMultipleValue();
        var15.resetMultipleValues();
        var15.resetMultipleValues();
        final SubLObject var19 = module0370.f25928(var16);
        final SubLObject var20 = var15.secondMultipleValue();
        var15.resetMultipleValues();
        final SubLObject var21 = reader.bq_cons(module0541.$ic10$, ConsesLow.append(var19, (SubLObject)module0541.NIL));
        var15.resetMultipleValues();
        SubLObject var22 = f33549(var21, var20, var17, var13, var14, var18);
        final SubLObject var23 = var15.secondMultipleValue();
        final SubLObject var24 = var15.thirdMultipleValue();
        final SubLObject var25 = var15.fourthMultipleValue();
        var15.resetMultipleValues();
        if (module0541.NIL == var24) {
            var22 = (SubLObject)module0541.NIL;
            SubLObject var26 = var23;
            SubLObject var27 = (SubLObject)module0541.NIL;
            var27 = var26.first();
            while (module0541.NIL != var26) {
                module0538.f33365(var27);
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        return Values.values(var22, var24, var25);
    }
    
    public static SubLObject f33549(final SubLObject var29, final SubLObject var22, final SubLObject var2, final SubLObject var13, final SubLObject var14, final SubLObject var20) {
        return f33550(var29, var22, var2, var13, var14, (SubLObject)module0541.NIL, (SubLObject)module0541.T, var20);
    }
    
    public static SubLObject f33551(final SubLObject var30, final SubLObject var2, final SubLObject var31, final SubLObject var20) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0541.FOUR_INTEGER), f33550(var30, (SubLObject)module0541.NIL, var2, (SubLObject)module0541.$ic11$, (SubLObject)module0541.NIL, var31, (SubLObject)module0541.NIL, var20));
    }
    
    public static SubLObject f33550(final SubLObject var1, final SubLObject var22, SubLObject var2, final SubLObject var13, final SubLObject var14, final SubLObject var31, final SubLObject var32, final SubLObject var20) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0541.NIL;
        SubLObject var35 = (SubLObject)module0541.NIL;
        SubLObject var36 = (SubLObject)module0541.NIL;
        SubLObject var37 = (SubLObject)module0541.NIL;
        SubLObject var38 = (SubLObject)module0541.NIL;
        module0334.f22561();
        final SubLObject var39 = module0541.$g3940$.currentBinding(var33);
        try {
            module0541.$g3940$.bind((SubLObject)module0541.NIL, var33);
            final SubLObject var40 = module0147.f9540(var2);
            final SubLObject var10_36 = module0147.$g2095$.currentBinding(var33);
            final SubLObject var41 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var42 = module0147.$g2096$.currentBinding(var33);
            try {
                module0147.$g2095$.bind(module0147.f9545(var40), var33);
                module0147.$g2094$.bind(module0147.f9546(var40), var33);
                module0147.$g2096$.bind(module0147.f9549(var40), var33);
                SubLObject var43 = (SubLObject)module0541.NIL;
                var33.resetMultipleValues();
                final SubLObject var40_41 = module0370.f25929(var1, var2);
                final SubLObject var42_43 = var33.secondMultipleValue();
                var33.resetMultipleValues();
                var43 = var40_41;
                var2 = var42_43;
                if (module0541.NIL == var43) {
                    f33552(var1, var2, (SubLObject)module0541.UNPROVIDED);
                }
                else if (var43.eql(module0541.$ic12$)) {
                    f33552(var1, var2, (SubLObject)module0541.UNPROVIDED);
                }
                else if (var43.eql(module0541.$ic13$) && module0541.NIL == var22) {
                    var36 = (SubLObject)module0541.T;
                }
                else {
                    var33.resetMultipleValues();
                    final SubLObject var44_45 = f33553(var43, var2, var22, var13, var14, var31, var32, var20);
                    final SubLObject var46_47 = var33.secondMultipleValue();
                    final SubLObject var48_49 = var33.thirdMultipleValue();
                    final SubLObject var50_51 = var33.fourthMultipleValue();
                    var33.resetMultipleValues();
                    var34 = var44_45;
                    var35 = var46_47;
                    var36 = var48_49;
                    var37 = var50_51;
                }
            }
            finally {
                module0147.$g2096$.rebind(var42, var33);
                module0147.$g2094$.rebind(var41, var33);
                module0147.$g2095$.rebind(var10_36, var33);
            }
            var38 = module0541.$g3940$.getDynamicValue(var33);
        }
        finally {
            module0541.$g3940$.rebind(var39, var33);
        }
        return Values.values(var34, var35, var36, var38, var37);
    }
    
    public static SubLObject f33553(final SubLObject var39, final SubLObject var2, final SubLObject var22, final SubLObject var13, final SubLObject var14, final SubLObject var31, final SubLObject var32, final SubLObject var20) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)module0541.NIL;
        SubLObject var42 = (SubLObject)module0541.NIL;
        SubLObject var43 = (SubLObject)module0541.NIL;
        SubLObject var44 = (SubLObject)module0541.NIL;
        SubLObject var45 = (SubLObject)module0541.ZERO_INTEGER;
        SubLObject var46 = (SubLObject)module0541.NIL;
        final SubLObject var47 = module0541.$g3941$.currentBinding(var40);
        try {
            module0541.$g3941$.bind((SubLObject)module0541.NIL, var40);
            try {
                var40.throwStack.push(module0541.$ic14$);
                final SubLObject var10_54 = Errors.$error_handler$.currentBinding(var40);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0541.$ic15$), var40);
                    try {
                        final SubLObject var10_55 = module0018.$g675$.currentBinding(var40);
                        final SubLObject var48 = Errors.$ignore_warnsP$.currentBinding(var40);
                        final SubLObject var49 = module0152.$g2118$.currentBinding(var40);
                        final SubLObject var50 = module0018.$g676$.currentBinding(var40);
                        try {
                            module0018.$g675$.bind((SubLObject)module0541.T, var40);
                            Errors.$ignore_warnsP$.bind((SubLObject)module0541.T, var40);
                            module0152.$g2118$.bind((SubLObject)module0541.NIL, var40);
                            module0018.$g676$.bind((SubLObject)module0541.T, var40);
                            final SubLObject var10_56 = module0018.$g674$.currentBinding(var40);
                            try {
                                module0018.$g674$.bind((SubLObject)module0541.T, var40);
                                if (!var39.eql(module0541.$ic13$)) {
                                    final SubLObject var51 = var39.first();
                                    final SubLObject var52 = conses_high.second(var51);
                                    var40.resetMultipleValues();
                                    final SubLObject var53 = module0538.f33413(var51, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
                                    final SubLObject var54 = var40.secondMultipleValue();
                                    var40.resetMultipleValues();
                                    var45 = Sequences.length(var54);
                                    final SubLObject var55 = f33554(var53, var2);
                                    final SubLObject var56 = f33555(var53, var2);
                                    if (Sequences.length(var56).numE(var45)) {
                                        final SubLObject var57 = f33556(var53, var2);
                                        if (Sequences.length(var57).numE(var45)) {
                                            final SubLObject var58 = f33557(var53, var2);
                                            if (Sequences.length(var58).numE(var45)) {
                                                var40.resetMultipleValues();
                                                final SubLObject var66_67 = f33558(var55, var56, var57, var58, var2, var52, var42, var13, var14, var31);
                                                final SubLObject var68_69 = var40.secondMultipleValue();
                                                var40.resetMultipleValues();
                                                var42 = var66_67;
                                                var46 = var68_69;
                                                if (module0541.NIL != var32) {
                                                    f33559(var53, var2, var46);
                                                    SubLObject var59;
                                                    SubLObject var60;
                                                    SubLObject var61;
                                                    for (var59 = (SubLObject)module0541.NIL, var59 = (SubLObject)module0541.ZERO_INTEGER; var59.numL(var45); var59 = Numbers.add(var59, (SubLObject)module0541.ONE_INTEGER)) {
                                                        var60 = ConsesLow.nth(var59, var54);
                                                        var61 = conses_high.assoc(module0193.f12079(var59), var46, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED).rest();
                                                        if (module0541.NIL != module0004.f104(var60, var20, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED)) {
                                                            var41 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var60, var61), var41);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            finally {
                                module0018.$g674$.rebind(var10_56, var40);
                            }
                            f33560(var22, var2, var46, var41);
                            var41 = Sequences.nreverse(var41);
                            var43 = (SubLObject)module0541.T;
                            var44 = module0541.$g3941$.getDynamicValue(var40);
                        }
                        finally {
                            module0018.$g676$.rebind(var50, var40);
                            module0152.$g2118$.rebind(var49, var40);
                            Errors.$ignore_warnsP$.rebind(var48, var40);
                            module0018.$g675$.rebind(var10_55, var40);
                        }
                    }
                    catch (Throwable var62) {
                        Errors.handleThrowable(var62, (SubLObject)module0541.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var10_54, var40);
                }
            }
            catch (Throwable var63) {
                var41 = Errors.handleThrowable(var63, (SubLObject)module0541.$ic14$);
            }
            finally {
                var40.throwStack.pop();
            }
        }
        finally {
            module0541.$g3941$.rebind(var47, var40);
        }
        return Values.values(var41, var42, var43, var44);
    }
    
    public static SubLObject f33558(final SubLObject var62, final SubLObject var63, final SubLObject var64, final SubLObject var65, final SubLObject var2, final SubLObject var59, SubLObject var25, final SubLObject var13, final SubLObject var14, final SubLObject var31) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        SubLObject var67 = (SubLObject)module0541.NIL;
        SubLObject var68 = (SubLObject)module0541.NIL;
        SubLObject var75_76 = (SubLObject)module0541.NIL;
        SubLObject var69 = (SubLObject)module0541.NIL;
        SubLObject var78_79 = (SubLObject)module0541.NIL;
        SubLObject var70 = (SubLObject)module0541.NIL;
        SubLObject var81_82 = (SubLObject)module0541.NIL;
        var68 = var63;
        var75_76 = var68.first();
        var69 = var64;
        var78_79 = var69.first();
        var70 = var65;
        var81_82 = var70.first();
        while (module0541.NIL != var70 || module0541.NIL != var69 || module0541.NIL != var68) {
            SubLObject var72;
            final SubLObject var71 = var72 = var75_76;
            SubLObject var73 = (SubLObject)module0541.NIL;
            SubLObject var74 = (SubLObject)module0541.NIL;
            SubLObject var75 = (SubLObject)module0541.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var72, var71, (SubLObject)module0541.$ic16$);
            var73 = var72.first();
            var72 = var72.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var72, var71, (SubLObject)module0541.$ic16$);
            var74 = var72.first();
            var72 = (var75 = var72.rest());
            final SubLObject var76 = module0035.f2293(var62, var73, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
            if (module0541.NIL != var76) {
                final SubLObject var77 = module0233.f15340(var73, var76);
                var67 = (SubLObject)ConsesLow.cons(var77, var67);
            }
            else {
                final SubLObject var78 = module0035.remove_if_not((SubLObject)module0541.$ic17$, var75, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
                if (module0541.NIL == module0257.f16696(var78, module0541.$ic18$, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED)) {
                    SubLObject var93_94;
                    final SubLObject var91_92 = var93_94 = var81_82;
                    SubLObject var79 = (SubLObject)module0541.NIL;
                    SubLObject var80 = (SubLObject)module0541.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var93_94, var91_92, (SubLObject)module0541.$ic19$);
                    var79 = var93_94.first();
                    var93_94 = (var80 = var93_94.rest());
                    if (module0541.NIL == Errors.$ignore_mustsP$.getDynamicValue(var66) && !var73.eql(var79)) {
                        Errors.error((SubLObject)module0541.$ic20$, var73, var79);
                    }
                    SubLObject var99_100;
                    final SubLObject var97_98 = var99_100 = var78_79;
                    SubLObject var81 = (SubLObject)module0541.NIL;
                    SubLObject var82 = (SubLObject)module0541.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var99_100, var97_98, (SubLObject)module0541.$ic21$);
                    var81 = var99_100.first();
                    var99_100 = (var82 = var99_100.rest());
                    if (module0541.NIL == Errors.$ignore_mustsP$.getDynamicValue(var66) && !var73.eql(var81)) {
                        Errors.error((SubLObject)module0541.$ic20$, var73, var81);
                    }
                    final SubLObject var83 = conses_high.rassoc(var73, var59, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED).first();
                    final SubLObject var84 = conses_high.assoc(var83, var14, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED).rest();
                    final SubLObject var85 = (module0541.NIL != var31) ? module0035.f2293(var31, var83, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED) : f33561(var13, var74, var84);
                    final SubLObject var86 = (SubLObject)SubLObjectFactory.makeBoolean(module0541.NIL == var31);
                    final SubLObject var87 = module0233.f15340(var73, var85);
                    if (module0541.NIL != var85) {
                        var67 = (SubLObject)ConsesLow.cons(var87, var67);
                        var25 = (SubLObject)ConsesLow.cons(var85, var25);
                        final SubLObject var88 = Sequences.remove_if((SubLObject)module0541.$ic22$, var75, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
                        if (module0541.NIL != var88) {
                            final SubLObject var89 = module0303.f20261(var88, var2);
                            var75 = ConsesLow.append(var89, var75);
                        }
                        final SubLObject var90 = Sequences.remove_if((SubLObject)module0541.$ic22$, var82, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
                        if (module0541.NIL != var90) {
                            final SubLObject var89 = module0303.f20261(var90, var2);
                            var82 = ConsesLow.append(var89, var82);
                        }
                        final SubLObject var91 = Sequences.remove_if((SubLObject)module0541.$ic22$, var80, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
                        if (module0541.NIL != var91) {
                            final SubLObject var89 = module0303.f20261(var91, var2);
                            var80 = ConsesLow.append(var89, var80);
                        }
                        final SubLObject var92 = f33562(var85, var87, var75, var2);
                        if (module0541.NIL != var86) {
                            f33563(var85, var2);
                        }
                        if (module0541.NIL == var92) {
                            module0334.f22564();
                        }
                        f33564(var85, var87, var82, var2);
                        f33565(var85, var87, var80, var2);
                    }
                }
            }
            var68 = var68.rest();
            var75_76 = var68.first();
            var69 = var69.rest();
            var78_79 = var69.first();
            var70 = var70.rest();
            var81_82 = var70.first();
        }
        var25 = Sequences.nreverse(var25);
        return Values.values(var25, var67);
    }
    
    public static SubLObject f33566(final SubLObject var1, final SubLObject var2, final SubLObject var112, SubLObject var113) {
        if (var113 == module0541.UNPROVIDED) {
            var113 = (SubLObject)module0541.T;
        }
        module0538.f33349(var1, var2, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
        if (module0541.NIL == module0538.f33324()) {
            module0541.$g3941$.setDynamicValue((SubLObject)module0541.T);
            return (SubLObject)module0541.T;
        }
        f33552(var1, var2, var112);
        if (module0541.NIL != module0202.f12589(var1, module0541.$ic23$)) {
            return (SubLObject)module0541.NIL;
        }
        if (module0541.NIL != var113) {
            module0334.f22564();
        }
        return (SubLObject)module0541.NIL;
    }
    
    public static SubLObject f33562(final SubLObject var105, final SubLObject var89, final SubLObject var87, final SubLObject var2) {
        SubLObject var106 = var87;
        SubLObject var107 = (SubLObject)module0541.NIL;
        var107 = var106.first();
        while (module0541.NIL != var106) {
            SubLObject var108 = var2;
            if (module0541.NIL == module0259.f16854(var105, var107, var2, (SubLObject)module0541.UNPROVIDED)) {
                final SubLObject var109 = (SubLObject)ConsesLow.list(module0541.$ic24$, var105, var107);
                if (module0541.NIL != module0226.f14794(var107)) {
                    var108 = module0541.$ic25$;
                }
                if (module0541.NIL == f33566(var109, var108, (SubLObject)ConsesLow.list(var89), (SubLObject)module0541.NIL)) {
                    return (SubLObject)module0541.NIL;
                }
            }
            var106 = var106.rest();
            var107 = var106.first();
        }
        return (SubLObject)module0541.T;
    }
    
    public static SubLObject f33564(final SubLObject var105, final SubLObject var89, final SubLObject var102, final SubLObject var2) {
        SubLObject var106 = var102;
        SubLObject var107 = (SubLObject)module0541.NIL;
        var107 = var106.first();
        while (module0541.NIL != var106) {
            if (module0541.NIL == module0305.f20526(var105, var107, var2)) {
                final SubLObject var108 = (SubLObject)ConsesLow.list(module0541.$ic26$, var105, var107);
                if (module0541.NIL == f33566(var108, var2, (SubLObject)ConsesLow.list(var89), (SubLObject)module0541.UNPROVIDED)) {
                    return (SubLObject)module0541.NIL;
                }
            }
            var106 = var106.rest();
            var107 = var106.first();
        }
        return (SubLObject)module0541.T;
    }
    
    public static SubLObject f33565(final SubLObject var105, final SubLObject var89, final SubLObject var96, final SubLObject var2) {
        SubLObject var106 = var96;
        SubLObject var107 = (SubLObject)module0541.NIL;
        var107 = var106.first();
        while (module0541.NIL != var106) {
            if (module0541.NIL == module0256.f16596(var105, var107, var2, (SubLObject)module0541.UNPROVIDED)) {
                final SubLObject var108 = (SubLObject)ConsesLow.list(module0541.$ic27$, var105, var107);
                if (module0541.NIL == f33566(var108, var2, (SubLObject)ConsesLow.list(var89), (SubLObject)module0541.UNPROVIDED)) {
                    return (SubLObject)module0541.NIL;
                }
            }
            var106 = var106.rest();
            var107 = var106.first();
        }
        return (SubLObject)module0541.T;
    }
    
    public static SubLObject f33559(SubLObject var60, final SubLObject var2, final SubLObject var53) {
        var60 = conses_high.nsublis(var53, var60, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
        SubLObject var61 = module0279.f18574(module0232.f15308(var60));
        SubLObject var62 = (SubLObject)module0541.NIL;
        var62 = var61.first();
        while (module0541.NIL != var61) {
            if (module0541.NIL == f33566(var62, var2, var53, (SubLObject)module0541.UNPROVIDED)) {
                return (SubLObject)module0541.NIL;
            }
            var61 = var61.rest();
            var62 = var61.first();
        }
        var61 = module0279.f18574(module0232.f15306(var60));
        SubLObject var63 = (SubLObject)module0541.NIL;
        var63 = var61.first();
        while (module0541.NIL != var61) {
            final SubLObject var64 = module0205.f13338(var63);
            if (module0541.NIL == f33566(var64, var2, var53, (SubLObject)module0541.UNPROVIDED)) {
                return (SubLObject)module0541.NIL;
            }
            var61 = var61.rest();
            var63 = var61.first();
        }
        return (SubLObject)module0541.T;
    }
    
    public static SubLObject f33560(final SubLObject var22, final SubLObject var2, final SubLObject var53, final SubLObject var123) {
        SubLObject var124 = var22;
        SubLObject var125 = (SubLObject)module0541.NIL;
        var125 = var124.first();
        while (module0541.NIL != var124) {
            SubLObject var126 = var125;
            if (module0541.NIL != var123) {
                var126 = conses_high.sublis(var123, var125, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
            }
            if (module0541.NIL == f33566(var126, var2, var53, (SubLObject)module0541.UNPROVIDED)) {
                return (SubLObject)module0541.NIL;
            }
            var124 = var124.rest();
            var125 = var124.first();
        }
        return (SubLObject)module0541.T;
    }
    
    public static SubLObject f33561(final SubLObject var13, final SubLObject var126, final SubLObject var127) {
        assert module0541.NIL != Types.stringp(var13) : var13;
        assert module0541.NIL != Types.stringp(var126) : var126;
        final SubLObject var128 = module0126.f8395(var126, (SubLObject)module0541.UNPROVIDED);
        final SubLObject var129 = module0538.f33341(var128, var127);
        if (module0541.NIL != constant_handles_oc.f8449(var129)) {
            final SubLObject var130 = constants_high_oc.f10749(var129);
            SubLObject var131 = PrintLow.format((SubLObject)module0541.NIL, (SubLObject)module0541.$ic29$, new SubLObject[] { var13, var126, var130 });
            var131 = module0126.f8395(var131, (SubLObject)module0541.UNPROVIDED);
            module0538.f33377(var129, var131);
            return var129;
        }
        return (SubLObject)module0541.NIL;
    }
    
    public static SubLObject f33563(final SubLObject var28, final SubLObject var2) {
        module0540.f33517((SubLObject)ConsesLow.list(module0541.$ic30$, var28, var2), module0132.$g1549$.getGlobalValue(), (SubLObject)module0541.$ic31$);
        module0540.f33517((SubLObject)ConsesLow.list(module0541.$ic32$, var28), var2, (SubLObject)module0541.$ic31$);
        return var28;
    }
    
    public static SubLObject f33554(final SubLObject var60, final SubLObject var2) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)module0541.NIL;
        final SubLObject var63 = module0067.f4880((SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
        SubLObject var64 = (SubLObject)module0541.NIL;
        SubLObject var65 = module0232.f15308(var60);
        SubLObject var66 = (SubLObject)module0541.NIL;
        var66 = var65.first();
        while (module0541.NIL != var65) {
            final SubLObject var67 = module0276.f18333(var66, var63, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
            if (var67.isVector()) {
                final SubLObject var68 = var67;
                final SubLObject var69 = (SubLObject)module0541.NIL;
                SubLObject var70;
                SubLObject var71;
                SubLObject var72;
                SubLObject var73;
                for (var70 = Sequences.length(var68), var71 = (SubLObject)module0541.NIL, var71 = (SubLObject)module0541.ZERO_INTEGER; var71.numL(var70); var71 = Numbers.add(var71, (SubLObject)module0541.ONE_INTEGER)) {
                    var72 = ((module0541.NIL != var69) ? Numbers.subtract(var70, var71, (SubLObject)module0541.ONE_INTEGER) : var71);
                    var73 = Vectors.aref(var68, var72);
                    var64 = (SubLObject)ConsesLow.cons(var73, var64);
                }
            }
            else {
                SubLObject var27_142 = var67;
                SubLObject var74 = (SubLObject)module0541.NIL;
                var74 = var27_142.first();
                while (module0541.NIL != var27_142) {
                    var64 = (SubLObject)ConsesLow.cons(var74, var64);
                    var27_142 = var27_142.rest();
                    var74 = var27_142.first();
                }
            }
            var65 = var65.rest();
            var66 = var65.first();
        }
        SubLObject var75;
        for (var75 = module0066.f4838(module0067.f4891(var63)); module0541.NIL == module0066.f4841(var75); var75 = module0066.f4840(var75)) {
            var61.resetMultipleValues();
            final SubLObject var76 = module0066.f4839(var75);
            final SubLObject var77 = var61.secondMultipleValue();
            var61.resetMultipleValues();
            if (module0541.NIL == module0004.f104(var76, var64, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED)) {
                var62 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var76, var77), var62);
            }
        }
        module0066.f4842(var75);
        return var62;
    }
    
    public static SubLObject f33555(final SubLObject var60, final SubLObject var2) {
        final SubLObject var61 = f33567(var60, var2);
        SubLObject var62 = (SubLObject)module0541.NIL;
        SubLObject var63 = var61;
        SubLObject var64 = (SubLObject)module0541.NIL;
        var64 = var63.first();
        while (module0541.NIL != var63) {
            SubLObject var66;
            final SubLObject var65 = var66 = var64;
            SubLObject var67 = (SubLObject)module0541.NIL;
            SubLObject var68 = (SubLObject)module0541.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)module0541.$ic33$);
            var67 = var66.first();
            var66 = (var68 = var66.rest());
            var68 = Sequences.delete(module0541.$ic34$, var68, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
            final SubLObject var69 = module0035.f2378(var68, Symbols.symbol_function((SubLObject)module0541.$ic35$), Symbols.symbol_function((SubLObject)module0541.$ic36$));
            SubLObject var70 = (SubLObject)module0541.$ic37$;
            if (module0541.NIL != module0173.f10955(var69)) {
                var70 = f33568(var69);
            }
            var62 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(var67, var70, ConsesLow.append(var68, (SubLObject)module0541.NIL)), var62);
            var63 = var63.rest();
            var64 = var63.first();
        }
        return Sequences.nreverse(var62);
    }
    
    public static SubLObject f33556(final SubLObject var60, final SubLObject var2) {
        final SubLObject var61 = f33569(var60, var2);
        SubLObject var62 = (SubLObject)module0541.NIL;
        SubLObject var63 = var61;
        SubLObject var64 = (SubLObject)module0541.NIL;
        var64 = var63.first();
        while (module0541.NIL != var63) {
            SubLObject var66;
            final SubLObject var65 = var66 = var64;
            SubLObject var67 = (SubLObject)module0541.NIL;
            SubLObject var68 = (SubLObject)module0541.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)module0541.$ic38$);
            var67 = var66.first();
            var66 = (var68 = var66.rest());
            var68 = Sequences.delete(module0541.$ic34$, var68, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
            var62 = (SubLObject)ConsesLow.cons(reader.bq_cons(var67, ConsesLow.append(var68, (SubLObject)module0541.NIL)), var62);
            var63 = var63.rest();
            var64 = var63.first();
        }
        return Sequences.nreverse(var62);
    }
    
    public static SubLObject f33557(final SubLObject var60, final SubLObject var2) {
        final SubLObject var61 = f33570(var60, var2);
        SubLObject var62 = (SubLObject)module0541.NIL;
        SubLObject var63 = var61;
        SubLObject var64 = (SubLObject)module0541.NIL;
        var64 = var63.first();
        while (module0541.NIL != var63) {
            SubLObject var66;
            final SubLObject var65 = var66 = var64;
            SubLObject var67 = (SubLObject)module0541.NIL;
            SubLObject var68 = (SubLObject)module0541.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var66, var65, (SubLObject)module0541.$ic39$);
            var67 = var66.first();
            var66 = (var68 = var66.rest());
            var68 = Sequences.delete(module0541.$ic34$, var68, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
            var62 = (SubLObject)ConsesLow.cons(reader.bq_cons(var67, ConsesLow.append(var68, (SubLObject)module0541.NIL)), var62);
            var63 = var63.rest();
            var64 = var63.first();
        }
        return Sequences.nreverse(var62);
    }
    
    public static SubLObject f33567(final SubLObject var60, final SubLObject var2) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)module0541.NIL;
        final SubLObject var63 = module0144.$g1801$.currentBinding(var61);
        try {
            module0144.$g1801$.bind((SubLObject)module0541.T, var61);
            var62 = module0307.f20822(var60, var2, (SubLObject)module0541.UNPROVIDED);
        }
        finally {
            module0144.$g1801$.rebind(var63, var61);
        }
        return var62;
    }
    
    public static SubLObject f33569(final SubLObject var60, final SubLObject var2) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)module0541.NIL;
        final SubLObject var63 = module0144.$g1801$.currentBinding(var61);
        try {
            module0144.$g1801$.bind((SubLObject)module0541.T, var61);
            var62 = module0307.f20839(var60, var2, (SubLObject)module0541.UNPROVIDED);
        }
        finally {
            module0144.$g1801$.rebind(var63, var61);
        }
        return var62;
    }
    
    public static SubLObject f33570(final SubLObject var60, final SubLObject var2) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)module0541.NIL;
        final SubLObject var63 = module0144.$g1801$.currentBinding(var61);
        try {
            module0144.$g1801$.bind((SubLObject)module0541.T, var61);
            var62 = module0307.f20823(var60, var2, (SubLObject)module0541.UNPROVIDED);
        }
        finally {
            module0144.$g1801$.rebind(var63, var61);
        }
        return var62;
    }
    
    public static SubLObject f33568(final SubLObject var161) {
        assert module0541.NIL != module0173.f10955(var161) : var161;
        if (module0541.NIL != module0167.f10813(var161)) {
            return module0038.f2840(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0541.$ic41$), module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0541.$ic42$), module0035.f2119(module0173.f10958(var161)), (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED)));
        }
        if (module0541.NIL != constant_handles_oc.f8449(var161)) {
            return constants_high_oc.f10743(var161);
        }
        return (SubLObject)module0541.NIL;
    }
    
    public static SubLObject f33571(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var3 == module0541.UNPROVIDED) {
            var3 = (SubLObject)module0541.NIL;
        }
        if (var4 == module0541.UNPROVIDED) {
            var4 = (SubLObject)module0541.NIL;
        }
        if (var5 == module0541.UNPROVIDED) {
            var5 = (SubLObject)module0541.NIL;
        }
        if (var6 == module0541.UNPROVIDED) {
            var6 = (SubLObject)module0541.NIL;
        }
        return module0538.f33330((SubLObject)module0541.$ic43$, var1, var2, var3, var4, var5, var6, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
    }
    
    public static SubLObject f33545(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var3 == module0541.UNPROVIDED) {
            var3 = (SubLObject)module0541.NIL;
        }
        if (var4 == module0541.UNPROVIDED) {
            var4 = (SubLObject)module0541.NIL;
        }
        if (var5 == module0541.UNPROVIDED) {
            var5 = (SubLObject)module0541.NIL;
        }
        if (var6 == module0541.UNPROVIDED) {
            var6 = (SubLObject)module0541.NIL;
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        module0538.f33316();
        if (!var1.isCons()) {
            module0538.f33323((SubLObject)ConsesLow.list((SubLObject)module0541.$ic7$, (SubLObject)module0541.$ic8$, var1));
            return (SubLObject)module0541.NIL;
        }
        if (module0541.NIL != module0538.f33429(var1)) {
            SubLObject var8 = (SubLObject)module0541.NIL;
            SubLObject var9 = (SubLObject)module0541.NIL;
            SubLObject var10 = (SubLObject)module0541.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0541.$ic48$);
            var8 = var1.first();
            SubLObject var11 = var1.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var1, (SubLObject)module0541.$ic48$);
            var9 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var1, (SubLObject)module0541.$ic48$);
            var10 = var11.first();
            var11 = var11.rest();
            if (module0541.NIL == var11) {
                return f33545(var10, var9, var3, var4, var5, var6);
            }
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0541.$ic48$);
            return (SubLObject)module0541.NIL;
        }
        else {
            var2 = module0538.f33356(var2);
            if (module0541.NIL != module0538.f33324()) {
                return (SubLObject)module0541.NIL;
            }
            if (module0541.NIL != var3 && var3 != module0541.T && !var3.isInteger()) {
                module0538.f33323((SubLObject)ConsesLow.list((SubLObject)module0541.$ic7$, (SubLObject)module0541.$ic49$, var3));
                return (SubLObject)module0541.NIL;
            }
            if (module0541.NIL != var4 && !var4.isInteger()) {
                module0538.f33323((SubLObject)ConsesLow.list((SubLObject)module0541.$ic7$, (SubLObject)module0541.$ic49$, var4));
                return (SubLObject)module0541.NIL;
            }
            if (module0541.NIL != var5 && !var5.isInteger()) {
                module0538.f33323((SubLObject)ConsesLow.list((SubLObject)module0541.$ic7$, (SubLObject)module0541.$ic49$, var5));
                return (SubLObject)module0541.NIL;
            }
            if (module0541.NIL != var6 && !var6.isInteger()) {
                module0538.f33323((SubLObject)ConsesLow.list((SubLObject)module0541.$ic7$, (SubLObject)module0541.$ic49$, var6));
                return (SubLObject)module0541.NIL;
            }
            if (module0541.NIL != module0541.$g3942$.getDynamicValue(var7)) {
                var7.resetMultipleValues();
                final SubLObject var12 = f33572(var1, var2, var3, var4, var5, var6);
                final SubLObject var13 = var7.secondMultipleValue();
                var7.resetMultipleValues();
                return Values.values(var12, var13);
            }
            if (var1.isCons() && var1.first().eql(module0541.$ic50$)) {
                return f33573(conses_high.second(var1), conses_high.third(var1), var2, var3, var4, var5, var6);
            }
            return f33573(module0541.$ic13$, var1, var2, var3, var4, var5, var6);
        }
    }
    
    public static SubLObject f33572(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var3 == module0541.UNPROVIDED) {
            var3 = (SubLObject)module0541.NIL;
        }
        if (var4 == module0541.UNPROVIDED) {
            var4 = (SubLObject)module0541.NIL;
        }
        if (var5 == module0541.UNPROVIDED) {
            var5 = (SubLObject)module0541.NIL;
        }
        if (var6 == module0541.UNPROVIDED) {
            var6 = (SubLObject)module0541.NIL;
        }
        SubLObject var7 = module0434.f30570(var3, var4, var5, var6);
        var7 = conses_high.copy_list(var7);
        if (module0541.NIL != module0202.f12597(var1)) {
            var7 = conses_high.putf(var7, (SubLObject)module0541.$ic51$, (SubLObject)module0541.T);
        }
        return module0409.f28506(var1, var2, var7);
    }
    
    public static SubLObject f33573(final SubLObject var170, final SubLObject var30, final SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6) {
        if (var3 == module0541.UNPROVIDED) {
            var3 = (SubLObject)module0541.NIL;
        }
        if (var4 == module0541.UNPROVIDED) {
            var4 = (SubLObject)module0541.NIL;
        }
        if (var5 == module0541.UNPROVIDED) {
            var5 = (SubLObject)module0541.NIL;
        }
        if (var6 == module0541.UNPROVIDED) {
            var6 = (SubLObject)module0541.NIL;
        }
        final SubLThread var171 = SubLProcess.currentSubLThread();
        final SubLObject var172 = f33574(var5);
        final SubLObject var173 = f33575(var5);
        var171.resetMultipleValues();
        final SubLObject var174 = f33576(var170, var30, var2, var172);
        final SubLObject var175 = var171.secondMultipleValue();
        var171.resetMultipleValues();
        if (module0541.NIL == var174 || module0541.NIL == var175) {
            final SubLObject var176 = module0540.f33527();
            final SubLObject var177 = (SubLObject)module0541.$ic52$;
            return Values.values(var176, var177);
        }
        var171.resetMultipleValues();
        final SubLObject var176 = module0538.f33428(var174, var175, var3, var4, var173, var6);
        final SubLObject var177 = var171.secondMultipleValue();
        var171.resetMultipleValues();
        return Values.values(var176, var177);
    }
    
    public static SubLObject f33574(final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        if (module0541.NIL == module0541.$g3943$.getDynamicValue(var176)) {
            return (SubLObject)module0541.ZERO_INTEGER;
        }
        if (module0541.NIL == var175) {
            return (SubLObject)module0541.NIL;
        }
        return Numbers.integerDivide(var175, (SubLObject)module0541.TWO_INTEGER);
    }
    
    public static SubLObject f33575(final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        if (module0541.NIL == module0541.$g3943$.getDynamicValue(var176)) {
            return var175;
        }
        if (module0541.NIL == var175) {
            return (SubLObject)module0541.NIL;
        }
        return Numbers.integerDivide(var175, (SubLObject)module0541.TWO_INTEGER);
    }
    
    public static SubLObject f33577(final SubLObject var29, final SubLObject var30, final SubLObject var176) {
        return f33576(var29, var30, var176, (SubLObject)module0541.ZERO_INTEGER);
    }
    
    public static SubLObject f33576(final SubLObject var29, final SubLObject var30, SubLObject var176, final SubLObject var171) {
        final SubLThread var177 = SubLProcess.currentSubLThread();
        var176 = module0162.f10628(var176);
        final SubLObject var178 = f33578(var176);
        var177.resetMultipleValues();
        final SubLObject var179 = f33579(var29, var178, var171);
        final SubLObject var180 = var177.secondMultipleValue();
        final SubLObject var181 = var177.thirdMultipleValue();
        var177.resetMultipleValues();
        if (module0541.NIL != var181) {
            return Values.values((SubLObject)module0541.NIL, (SubLObject)module0541.NIL, (SubLObject)module0541.NIL, var181);
        }
        var177.resetMultipleValues();
        final SubLObject var182 = f33580(var30, var179, var180);
        final SubLObject var17_179 = var177.secondMultipleValue();
        var177.resetMultipleValues();
        if (module0541.NIL != var17_179) {
            return Values.values((SubLObject)module0541.NIL, (SubLObject)module0541.NIL, (SubLObject)module0541.NIL, var17_179);
        }
        final SubLObject var183 = module0233.f15362(var180, var30);
        final SubLObject var184 = f33581(var176, var182);
        return Values.values(var183, var184, var180, (SubLObject)module0541.NIL);
    }
    
    public static SubLObject f33578(final SubLObject var176) {
        if (module0541.NIL != module0147.f9557(var176)) {
            return module0132.$g1544$.getGlobalValue();
        }
        if (module0541.NIL != module0161.f10585(var176)) {
            return module0161.f10542(var176, module0541.$ic53$, module0541.$ic54$);
        }
        return var176;
    }
    
    public static SubLObject f33581(final SubLObject var176, final SubLObject var174) {
        if (module0541.NIL == var174) {
            return var174;
        }
        if (module0541.NIL != module0147.f9557(var176)) {
            return var176;
        }
        if (module0541.NIL != module0161.f10585(var176)) {
            return module0161.f10542(var174, module0541.$ic55$, (SubLObject)module0541.UNPROVIDED);
        }
        return var174;
    }
    
    public static SubLObject f33579(final SubLObject var182, final SubLObject var2, SubLObject var171) {
        if (var171 == module0541.UNPROVIDED) {
            var171 = (SubLObject)module0541.ZERO_INTEGER;
        }
        if (var182.eql(module0541.$ic13$)) {
            return Values.values(var2, (SubLObject)module0541.NIL, (SubLObject)module0541.NIL);
        }
        return f33582(var182, var2, var171);
    }
    
    public static SubLObject f33582(final SubLObject var182, final SubLObject var2, SubLObject var171) {
        if (var171 == module0541.UNPROVIDED) {
            var171 = (SubLObject)module0541.ZERO_INTEGER;
        }
        final SubLThread var183 = SubLProcess.currentSubLThread();
        var183.resetMultipleValues();
        SubLObject var184 = f33583(var182, var2);
        SubLObject var185 = var183.secondMultipleValue();
        var183.resetMultipleValues();
        if (module0541.NIL != var184) {
            return Values.values(var184, var185, (SubLObject)module0541.NIL);
        }
        var183.resetMultipleValues();
        var184 = f33584(var182, var2, var171);
        var185 = var183.secondMultipleValue();
        final SubLObject var186 = var183.thirdMultipleValue();
        var183.resetMultipleValues();
        if (module0541.NIL != var186) {
            return Values.values((SubLObject)module0541.NIL, (SubLObject)module0541.NIL, var186);
        }
        return Values.values(var184, var185, (SubLObject)module0541.NIL);
    }
    
    public static SubLObject f33583(final SubLObject var182, final SubLObject var2) {
        final SubLObject var183 = module0202.f12782(var2, var182);
        final SubLObject var184 = module0067.f4884(module0541.$g3944$.getGlobalValue(), var183, (SubLObject)module0541.UNPROVIDED);
        if (module0541.NIL == var184) {
            return Values.values((SubLObject)module0541.NIL, (SubLObject)module0541.NIL);
        }
        SubLObject var186;
        final SubLObject var185 = var186 = var184;
        SubLObject var187 = (SubLObject)module0541.NIL;
        SubLObject var188 = (SubLObject)module0541.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var186, var185, (SubLObject)module0541.$ic57$);
        var187 = var186.first();
        var186 = var186.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var186, var185, (SubLObject)module0541.$ic57$);
        var188 = var186.first();
        var186 = var186.rest();
        if (module0541.NIL != var186) {
            cdestructuring_bind.cdestructuring_bind_error(var185, (SubLObject)module0541.$ic57$);
            return (SubLObject)module0541.NIL;
        }
        if (module0541.NIL == f33585(var187, var188)) {
            module0067.f4887(module0541.$g3944$.getGlobalValue(), var183);
            return Values.values((SubLObject)module0541.NIL, (SubLObject)module0541.NIL);
        }
        return Values.values(var187, var188);
    }
    
    public static SubLObject f33585(final SubLObject var178, final SubLObject var31) {
        if (module0541.NIL == module0161.f10570(var178, (SubLObject)module0541.UNPROVIDED)) {
            return (SubLObject)module0541.NIL;
        }
        if (module0541.NIL == module0259.f16854(module0161.f10557(var178), module0541.$ic58$, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED)) {
            return (SubLObject)module0541.NIL;
        }
        SubLObject var179 = var31;
        SubLObject var180 = (SubLObject)module0541.NIL;
        var180 = var179.first();
        while (module0541.NIL != var179) {
            final SubLObject var181 = module0233.f15370(var180);
            if (module0541.NIL == constant_handles_oc.f8463(var181, (SubLObject)module0541.UNPROVIDED)) {
                return (SubLObject)module0541.NIL;
            }
            var179 = var179.rest();
            var180 = var179.first();
        }
        return (SubLObject)module0541.T;
    }
    
    public static SubLObject f33584(final SubLObject var182, final SubLObject var2, SubLObject var171) {
        if (var171 == module0541.UNPROVIDED) {
            var171 = (SubLObject)module0541.ZERO_INTEGER;
        }
        final SubLThread var183 = SubLProcess.currentSubLThread();
        var183.resetMultipleValues();
        final SubLObject var184 = f33586(var182, var2, var171);
        final SubLObject var185 = var183.secondMultipleValue();
        final SubLObject var186 = var183.thirdMultipleValue();
        var183.resetMultipleValues();
        if (module0541.NIL != var184) {
            final SubLObject var187 = module0202.f12782(var2, var182);
            final SubLObject var188 = (SubLObject)ConsesLow.list(var184, var185);
            module0067.f4886(module0541.$g3944$.getGlobalValue(), var187, var188);
        }
        return Values.values(var184, var185, var186);
    }
    
    public static SubLObject f33586(final SubLObject var182, final SubLObject var2, SubLObject var171) {
        if (var171 == module0541.UNPROVIDED) {
            var171 = (SubLObject)module0541.ZERO_INTEGER;
        }
        final SubLThread var183 = SubLProcess.currentSubLThread();
        SubLObject var184 = (SubLObject)module0541.NIL;
        SubLObject var185 = (SubLObject)module0541.NIL;
        SubLObject var186 = (SubLObject)module0541.NIL;
        SubLObject var187 = (SubLObject)module0541.NIL;
        var184 = f33587(var2, (SubLObject)module0541.$ic59$);
        if (module0541.NIL != var184) {
            final SubLObject var188 = module0161.f10557(var184);
            try {
                var183.resetMultipleValues();
                final SubLObject var190_191 = f33547(var182, var184, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
                final SubLObject var192_193 = var183.secondMultipleValue();
                var183.resetMultipleValues();
                var185 = var190_191;
                var187 = var192_193;
                if (module0541.NIL != var185) {
                    if (module0541.NIL != module0233.f15393(var185)) {
                        var185 = (SubLObject)module0541.NIL;
                    }
                    f33588(var184, var185);
                }
                else {
                    var186 = (SubLObject)module0541.T;
                }
            }
            finally {
                final SubLObject var189 = Threads.$is_thread_performing_cleanupP$.currentBinding(var183);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0541.T, var183);
                    if (module0541.NIL != var186) {
                        module0538.f33365(var188);
                        var184 = (SubLObject)module0541.NIL;
                        var185 = (SubLObject)module0541.NIL;
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var189, var183);
                }
            }
        }
        else {
            var186 = (SubLObject)module0541.T;
        }
        if (module0541.NIL == var186) {
            if (module0541.NIL != module0541.$g3943$.getDynamicValue(var183)) {
                f33589(var184, var171);
            }
            return Values.values(var184, var185, (SubLObject)module0541.NIL);
        }
        return Values.values((SubLObject)module0541.NIL, (SubLObject)module0541.NIL, var187);
    }
    
    public static SubLObject f33588(final SubLObject var178, final SubLObject var31) {
        assert module0541.NIL != module0161.f10481(var178) : var178;
        return (SubLObject)module0541.NIL;
    }
    
    public static SubLObject f33590(final SubLObject var178) {
        return (SubLObject)module0541.NIL;
    }
    
    public static SubLObject f33580(final SubLObject var194, final SubLObject var178, final SubLObject var31) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        if (module0541.NIL == module0541.$g3945$.getDynamicValue(var195)) {
            return Values.values(var178, (SubLObject)module0541.NIL);
        }
        SubLObject var196;
        SubLObject var197;
        SubLObject var198;
        SubLObject var200;
        SubLObject var199;
        SubLObject var201;
        SubLObject var202;
        for (var196 = (SubLObject)module0541.NIL, var197 = (SubLObject)module0541.NIL, var197 = var31; module0541.NIL == var196 && module0541.NIL != var197; var196 = module0205.f13220(var201, var194, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED), var197 = var197.rest()) {
            var198 = var197.first();
            var199 = (var200 = var198);
            var201 = (SubLObject)module0541.NIL;
            var202 = (SubLObject)module0541.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var200, var199, (SubLObject)module0541.$ic62$);
            var201 = var200.first();
            var200 = (var202 = var200.rest());
        }
        if (module0541.NIL == var196) {
            return Values.values(var178, (SubLObject)module0541.NIL);
        }
        return f33591(var194, var178, var31);
    }
    
    public static SubLObject f33591(final SubLObject var194, final SubLObject var178, final SubLObject var31) {
        final SubLObject var195 = f33592(var194, var178);
        if (module0541.NIL != var195) {
            return Values.values(var195, (SubLObject)module0541.NIL);
        }
        return f33593(var194, var178, var31);
    }
    
    public static SubLObject f33592(final SubLObject var194, final SubLObject var178) {
        final SubLObject var195 = module0202.f12782(var178, var194);
        SubLObject var196 = module0067.f4884(module0541.$g3946$.getGlobalValue(), var195, (SubLObject)module0541.UNPROVIDED);
        if (module0541.NIL != var196 && module0541.NIL == module0161.f10571(var196, (SubLObject)module0541.UNPROVIDED)) {
            module0067.f4887(module0541.$g3946$.getGlobalValue(), var195);
            var196 = (SubLObject)module0541.NIL;
        }
        return var196;
    }
    
    public static SubLObject f33593(final SubLObject var194, final SubLObject var178, final SubLObject var31) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        var195.resetMultipleValues();
        final SubLObject var196 = f33594(var194, var178, var31);
        final SubLObject var197 = var195.secondMultipleValue();
        var195.resetMultipleValues();
        if (module0541.NIL != var196) {
            final SubLObject var198 = module0202.f12782(var178, var194);
            module0067.f4886(module0541.$g3946$.getGlobalValue(), var198, var196);
        }
        return Values.values(var196, var197);
    }
    
    public static SubLObject f33594(final SubLObject var194, final SubLObject var178, final SubLObject var31) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        SubLObject var196 = f33587(var178, (SubLObject)module0541.$ic64$);
        final SubLObject var197 = (SubLObject)module0541.NIL;
        if (module0541.NIL == var196) {
            return Values.values((SubLObject)module0541.NIL, (SubLObject)module0541.NIL);
        }
        final SubLObject var198 = module0161.f10557(var196);
        SubLObject var199 = (SubLObject)module0541.NIL;
        final SubLObject var200 = module0202.f12911(var194, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
        final SubLObject var201 = module0144.$g1783$.currentBinding(var195);
        final SubLObject var202 = module0144.$g1784$.currentBinding(var195);
        try {
            module0144.$g1783$.bind((SubLObject)module0541.NIL, var195);
            module0144.$g1784$.bind((SubLObject)module0541.NIL, var195);
            var199 = f33551(var194, var196, var31, var200);
        }
        finally {
            module0144.$g1784$.rebind(var202, var195);
            module0144.$g1783$.rebind(var201, var195);
        }
        if (module0541.NIL == var199) {
            module0538.f33365(var198);
            var196 = var178;
        }
        return Values.values(var196, var197);
    }
    
    public static SubLObject f33589(final SubLObject var178, SubLObject var171) {
        final SubLThread var179 = SubLProcess.currentSubLThread();
        if (!var171.isInteger() || !var171.numLE((SubLObject)module0541.ZERO_INTEGER)) {
            if (module0541.NIL == var171) {
                var171 = module0541.$g3947$.getDynamicValue(var179);
            }
            final SubLObject var180 = module0018.$g648$.currentBinding(var179);
            final SubLObject var181 = module0018.$g651$.currentBinding(var179);
            final SubLObject var182 = module0131.$g1536$.currentBinding(var179);
            final SubLObject var183 = module0018.$g628$.currentBinding(var179);
            final SubLObject var184 = module0131.$g1532$.currentBinding(var179);
            final SubLObject var185 = module0131.$g1533$.currentBinding(var179);
            try {
                module0018.$g648$.bind((SubLObject)module0541.T, var179);
                module0018.$g651$.bind(module0541.$g3949$.getDynamicValue(var179), var179);
                module0131.$g1536$.bind(module0541.$g3948$.getDynamicValue(var179), var179);
                module0018.$g628$.bind((SubLObject)module0541.T, var179);
                module0131.$g1532$.bind((SubLObject)module0541.NIL, var179);
                module0131.$g1533$.bind((SubLObject)module0541.NIL, var179);
                module0531.f33172(var178, var178, (SubLObject)module0541.NIL, var171, module0541.$g3950$.getDynamicValue(var179));
            }
            finally {
                module0131.$g1533$.rebind(var185, var179);
                module0131.$g1532$.rebind(var184, var179);
                module0018.$g628$.rebind(var183, var179);
                module0131.$g1536$.rebind(var182, var179);
                module0018.$g651$.rebind(var181, var179);
                module0018.$g648$.rebind(var180, var179);
            }
        }
        return (SubLObject)module0541.NIL;
    }
    
    public static SubLObject f33587(final SubLObject var2, SubLObject var13) {
        if (var13 == module0541.UNPROVIDED) {
            var13 = (SubLObject)module0541.$ic1$;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert module0541.NIL != module0161.f10481(var2) : var2;
        final SubLObject var15 = module0161.f10557(var2);
        final SubLObject var16 = conses_high.subst(var15, (SubLObject)module0541.$ic67$, module0541.$g3951$.getDynamicValue(var14), (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
        SubLObject var17 = (SubLObject)module0541.NIL;
        SubLObject var18 = (SubLObject)module0541.NIL;
        final SubLObject var19 = module0131.$g1531$.currentBinding(var14);
        try {
            module0131.$g1531$.bind((SubLObject)module0541.NIL, var14);
            final SubLObject var20 = f33547(var16, module0132.$g1548$.getGlobalValue(), var13, (SubLObject)module0541.UNPROVIDED);
            if (module0541.NIL != var20) {
                var17 = module0233.f15362(var20, (SubLObject)module0541.$ic68$);
                if (module0541.NIL != var17) {
                    var18 = module0161.f10541(var2, var17);
                    module0540.f33517((SubLObject)ConsesLow.list(module0541.$ic69$, var18), var18, (SubLObject)module0541.UNPROVIDED);
                }
            }
        }
        finally {
            module0131.$g1531$.rebind(var19, var14);
        }
        return var18;
    }
    
    public static SubLObject f33595(final SubLObject var1, final SubLObject var2, SubLObject var207) {
        if (var207 == module0541.UNPROVIDED) {
            var207 = (SubLObject)module0541.NIL;
        }
        SubLObject var208 = f33596(module0274.f18201(var1, var2, (SubLObject)module0541.UNPROVIDED));
        if (!var208.isList()) {
            var208 = (SubLObject)module0541.NIL;
        }
        if (var208.isCons() && var208.first().eql(module0541.$ic10$)) {
            var208 = var208.rest();
        }
        if (module0541.NIL != var208) {
            var208 = Sequences.delete((SubLObject)module0541.NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0541.$ic70$), var208), (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED, (SubLObject)module0541.UNPROVIDED);
        }
        if (module0541.NIL == var208) {
            var208 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)module0541.$ic71$, var1, var2, (SubLObject)module0541.UNPROVIDED));
        }
        return var208;
    }
    
    public static SubLObject f33596(final SubLObject var208) {
        final SubLObject var209 = f33597(var208, (SubLObject)module0541.NIL);
        return Sequences.nreverse(var209);
    }
    
    public static SubLObject f33597(final SubLObject var1, SubLObject var209) {
        if (module0541.NIL != assertion_handles_oc.f11035(var1)) {
            final SubLObject var210 = module0289.f19396(var1);
            if (module0541.NIL != module0035.f2439((SubLObject)module0541.$ic72$, var210, (SubLObject)module0541.UNPROVIDED)) {
                var209 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0541.$ic73$, module0178.f11287(var1), var210), var209);
            }
            else {
                var209 = (SubLObject)ConsesLow.cons(var1, var209);
            }
        }
        else if (module0541.NIL != module0206.f13425(var1)) {
            if (module0541.NIL != module0202.f12883(var1, (SubLObject)module0541.UNPROVIDED)) {
                var209 = (SubLObject)ConsesLow.cons(var1, var209);
            }
            else {
                SubLObject var212;
                final SubLObject var211 = var212 = module0205.f13180(var1, (SubLObject)module0541.$ic74$);
                SubLObject var213 = (SubLObject)module0541.NIL;
                var213 = var212.first();
                while (module0541.NIL != var212) {
                    var209 = f33597(var213, var209);
                    var212 = var212.rest();
                    var213 = var212.first();
                }
            }
        }
        return var209;
    }
    
    public static SubLObject f33598(final SubLObject var212) {
        if (module0541.NIL != assertion_handles_oc.f11035(var212)) {
            return var212;
        }
        if (module0541.NIL != module0191.f11950(var212)) {
            return var212;
        }
        if (module0541.NIL == module0202.f12590(var212)) {
            return (SubLObject)module0541.NIL;
        }
        if (module0541.NIL == module0202.f12883(var212, (SubLObject)module0541.UNPROVIDED)) {
            return (SubLObject)module0541.NIL;
        }
        SubLObject var214;
        final SubLObject var213 = var214 = module0205.f13207(var212, (SubLObject)module0541.UNPROVIDED);
        final SubLObject var215 = (SubLObject)(var214.isCons() ? var214.first() : module0541.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var214, var213, (SubLObject)module0541.$ic75$);
        var214 = var214.rest();
        final SubLObject var216 = (SubLObject)(var214.isCons() ? var214.first() : module0541.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var214, var213, (SubLObject)module0541.$ic75$);
        var214 = var214.rest();
        if (module0541.NIL == var214) {
            return f33599(var216, var215);
        }
        cdestructuring_bind.cdestructuring_bind_error(var213, (SubLObject)module0541.$ic75$);
        return (SubLObject)module0541.NIL;
    }
    
    public static SubLObject f33599(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0202.f12832(var1, (SubLObject)module0541.UNPROVIDED);
        if (var3.eql(module0541.$ic24$)) {
            return module0191.f11990((SubLObject)module0541.$ic76$, var1, var2, (SubLObject)module0541.UNPROVIDED);
        }
        if (var3.eql(module0541.$ic27$)) {
            return module0191.f11990((SubLObject)module0541.$ic77$, var1, var2, (SubLObject)module0541.UNPROVIDED);
        }
        if (var3.eql(module0541.$ic78$) || var3.eql(module0541.$ic79$)) {
            return module0191.f11990((SubLObject)module0541.$ic80$, var1, var2, (SubLObject)module0541.UNPROVIDED);
        }
        if (var3.eql(module0541.$ic81$)) {
            return module0191.f11990((SubLObject)module0541.$ic82$, var1, var2, (SubLObject)module0541.UNPROVIDED);
        }
        return module0191.f11990((SubLObject)module0541.$ic71$, var1, var2, (SubLObject)module0541.UNPROVIDED);
    }
    
    public static SubLObject f33552(final SubLObject var1, final SubLObject var2, SubLObject var207) {
        if (var207 == module0541.UNPROVIDED) {
            var207 = (SubLObject)module0541.NIL;
        }
        final SubLThread var208 = SubLProcess.currentSubLThread();
        if (module0541.NIL != module0018.$g676$.getDynamicValue(var208)) {
            final SubLObject var209 = f33595(var1, var2, var207);
            module0334.f22562(var209);
            module0541.$g3940$.setDynamicValue((SubLObject)ConsesLow.cons(var209, module0541.$g3940$.getDynamicValue(var208)), var208);
        }
        return (SubLObject)module0541.NIL;
    }
    
    public static SubLObject f33600() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33544", "S#36934", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33546", "FI-HYPOTHESIZE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33547", "S#35014", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33548", "S#36935", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33549", "S#36936", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33551", "S#36937", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33550", "S#36938", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33553", "S#36939", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33558", "S#36940", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33566", "S#36941", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33562", "S#36942", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33564", "S#36943", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33565", "S#36944", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33559", "S#36945", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33560", "S#36946", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33561", "S#36947", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33563", "S#36948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33554", "S#36949", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33555", "S#36950", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33556", "S#36951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33557", "S#36952", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33567", "S#36953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33569", "S#36954", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33570", "S#36955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33568", "S#36956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33571", "FI-PROVE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33545", "S#36878", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33572", "S#36957", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33573", "S#36958", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33574", "S#36959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33575", "S#36960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33577", "S#31509", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33576", "S#36961", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33578", "S#36962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33581", "S#36963", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33579", "S#34479", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33582", "S#36964", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33583", "S#36965", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33585", "S#36966", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33584", "S#36967", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33586", "S#36968", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33588", "S#36969", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33590", "S#36970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33580", "S#36971", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33591", "S#36972", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33592", "S#36973", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33593", "S#36974", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33594", "S#36975", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33589", "S#36976", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33587", "S#35013", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33595", "S#36977", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33596", "S#36978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33597", "S#36979", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33598", "S#36980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33599", "S#36981", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0541", "f33552", "S#36982", 2, 1, false);
        return (SubLObject)module0541.NIL;
    }
    
    public static SubLObject f33601() {
        module0541.$g3940$ = SubLFiles.defparameter("S#36983", (SubLObject)module0541.NIL);
        module0541.$g3941$ = SubLFiles.defparameter("S#36984", (SubLObject)module0541.NIL);
        module0541.$g3942$ = SubLFiles.defparameter("S#36985", (SubLObject)module0541.NIL);
        module0541.$g3943$ = SubLFiles.defparameter("S#36986", (SubLObject)module0541.NIL);
        module0541.$g3944$ = SubLFiles.deflexical("S#36987", (module0541.NIL != Symbols.boundp((SubLObject)module0541.$ic56$)) ? module0541.$g3944$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0541.EQUAL), (SubLObject)module0541.ZERO_INTEGER));
        module0541.$g3945$ = SubLFiles.defvar("S#36988", (SubLObject)module0541.T);
        module0541.$g3946$ = SubLFiles.deflexical("S#36989", (module0541.NIL != Symbols.boundp((SubLObject)module0541.$ic63$)) ? module0541.$g3946$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0541.EQUAL), (SubLObject)module0541.ZERO_INTEGER));
        module0541.$g3947$ = SubLFiles.defvar("S#36990", (SubLObject)module0541.$ic65$);
        module0541.$g3948$ = SubLFiles.defvar("S#36991", (SubLObject)module0541.FIVE_INTEGER);
        module0541.$g3949$ = SubLFiles.defvar("S#36992", (SubLObject)module0541.TWENTY_INTEGER);
        module0541.$g3950$ = SubLFiles.defvar("S#36993", (SubLObject)module0541.ONE_INTEGER);
        module0541.$g3951$ = SubLFiles.defparameter("S#36994", (SubLObject)module0541.$ic66$);
        return (SubLObject)module0541.NIL;
    }
    
    public static SubLObject f33602() {
        module0012.f368((SubLObject)module0541.$ic3$, (SubLObject)module0541.$ic4$, (SubLObject)module0541.$ic5$, (SubLObject)module0541.NIL, (SubLObject)module0541.$ic6$);
        module0012.f368((SubLObject)module0541.$ic44$, (SubLObject)module0541.$ic45$, (SubLObject)module0541.$ic46$, (SubLObject)module0541.NIL, (SubLObject)module0541.$ic47$);
        module0003.f57((SubLObject)module0541.$ic56$);
        module0002.f35((SubLObject)module0541.$ic61$, (SubLObject)module0541.NIL);
        module0003.f57((SubLObject)module0541.$ic63$);
        return (SubLObject)module0541.NIL;
    }
    
    public void declareFunctions() {
        f33600();
    }
    
    public void initializeVariables() {
        f33601();
    }
    
    public void runTopLevelForms() {
        f33602();
    }
    
    static {
        me = (SubLFile)new module0541();
        module0541.$g3940$ = null;
        module0541.$g3941$ = null;
        module0541.$g3942$ = null;
        module0541.$g3943$ = null;
        module0541.$g3944$ = null;
        module0541.$g3945$ = null;
        module0541.$g3946$ = null;
        module0541.$g3947$ = null;
        module0541.$g3948$ = null;
        module0541.$g3949$ = null;
        module0541.$g3950$ = null;
        module0541.$g3951$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#33864", "CYC");
        $ic1$ = SubLObjectFactory.makeString("HYP");
        $ic2$ = SubLObjectFactory.makeKeyword("HYPOTHESIZE");
        $ic3$ = SubLObjectFactory.makeSymbol("FI-HYPOTHESIZE");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#36881", "CYC"), (SubLObject)SubLObjectFactory.makeString("HYP")), (SubLObject)SubLObjectFactory.makeSymbol("S#36995", "CYC"));
        $ic5$ = SubLObjectFactory.makeString("Cyc attempts to check if SENTENCE is satisfiable in MT by 'hypothesizing'\nconstants for the variables in SENTENCE, substituting them into SENTENCE,\nand asserting the new sentence in MT.  If this would trigger a \ncontradiction, then NIL is returned.  Otherwise a binding list of variable /\nconstant pairs is returned, indicating the constants which were \nsuccessfully 'hypothesized'.  The form ((T . T)) is returned if no new terms\nrequired creation for the assertion of SENTENCE.\nNAME-PREFIX is a string which is used as a prefix for the name of each new\nconstant hypothesized.  TERM-IDS is a list of variable / id pairs indicating\nthat the specified id should be used when generating the constant for the variable\nin SENTENCE.  If TERM-IDS is NIL, then unused ids are allocated for the new\nconstants.");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic7$ = SubLObjectFactory.makeKeyword("ARG-ERROR");
        $ic8$ = SubLObjectFactory.makeString("Expected a cons, got ~S");
        $ic9$ = SubLObjectFactory.makeString("Expected a string, got ~S");
        $ic10$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic11$ = SubLObjectFactory.makeString("");
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic14$ = SubLObjectFactory.makeKeyword("CONFLICT");
        $ic15$ = SubLObjectFactory.makeSymbol("S#25135", "CYC");
        $ic16$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36996", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36997", "CYC"));
        $ic17$ = SubLObjectFactory.makeSymbol("S#17632", "CYC");
        $ic18$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLConstant"));
        $ic19$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#36998", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36999", "CYC"));
        $ic20$ = SubLObjectFactory.makeString("Constraint variable mismatch error in hypothesis: ~a != ~a");
        $ic21$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#37000", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37001", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("S#17602", "CYC");
        $ic23$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equalSymbols"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic28$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic29$ = SubLObjectFactory.makeString("~A-~A-~A");
        $ic30$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("hypotheticalTerm"));
        $ic33$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36997", "CYC"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLReifiableDenotationalTerm"));
        $ic35$ = SubLObjectFactory.makeSymbol("<");
        $ic36$ = SubLObjectFactory.makeSymbol("SPEC-CARDINALITY");
        $ic37$ = SubLObjectFactory.makeString("Term");
        $ic38$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#37001", "CYC"));
        $ic39$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#36999", "CYC"));
        $ic40$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic41$ = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $ic42$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic43$ = SubLObjectFactory.makeKeyword("PROVE");
        $ic44$ = SubLObjectFactory.makeSymbol("FI-PROVE");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33866", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("S#25811", "CYC"));
        $ic46$ = SubLObjectFactory.makeString("Attempts to prove SENTENCE is true in MT under the given resource constraints.\n   BACKCHAIN, NUMBER, TIME and DEPTH function as described for FI-ASK.\n   SENTENCE is interpreted as follows:\n   If SENTENCE is of the form (#$implies [antecedant] [consequent]) then\n   (1) free variables in [antecedant] are assumed to be universally quantified\n   (2) remaining variables in [consequent] are assumed to be existentially quantified.\n   Otherwise SENTENCE is interpreted as (#$implies #$True SENTENCE) and handled as the case above.\n   It returns NIL or a list of arguments as described for FI-JUSTIFY.");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"))));
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25981", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#36891", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33601", "CYC"));
        $ic49$ = SubLObjectFactory.makeString("Expected an integer, got ~S");
        $ic50$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("implies"));
        $ic51$ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $ic52$ = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $ic53$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval"));
        $ic54$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimePoint"));
        $ic55$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $ic56$ = SubLObjectFactory.makeSymbol("S#36987", "CYC");
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37002", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37003", "CYC"));
        $ic58$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HypotheticalContext"));
        $ic59$ = SubLObjectFactory.makeString("Hypothesis");
        $ic60$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#36970", "CYC");
        $ic62$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic63$ = SubLObjectFactory.makeSymbol("S#36989", "CYC");
        $ic64$ = SubLObjectFactory.makeString("Proof");
        $ic65$ = SubLObjectFactory.makeInteger(120);
        $ic66$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-MT"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HypotheticalContext"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-MT"), (SubLObject)SubLObjectFactory.makeKeyword("MT")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termDependsOn")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-MT"), (SubLObject)SubLObjectFactory.makeKeyword("MT")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ephemeralTerm")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC-MT")));
        $ic67$ = SubLObjectFactory.makeKeyword("MT");
        $ic68$ = SubLObjectFactory.makeSymbol("?SPEC-MT");
        $ic69$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("highlyRelevantMt"));
        $ic70$ = SubLObjectFactory.makeSymbol("S#36980", "CYC");
        $ic71$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic72$ = SubLObjectFactory.makeSymbol("S#31695", "CYC");
        $ic73$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic74$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"));
        $ic76$ = SubLObjectFactory.makeKeyword("ISA");
        $ic77$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic78$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic79$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic80$ = SubLObjectFactory.makeKeyword("GENLPREDS");
        $ic81$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $ic82$ = SubLObjectFactory.makeKeyword("EVAL");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0541.class
	Total time: 490 ms
	
	Decompiled with Procyon 0.5.32.
*/