package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0766 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0766";
    public static final String myFingerPrint = "31687a09bbb11583e6ef974702a485b0ca0f13013a1e6e60c3ed837e2497dd56";
    private static SubLSymbol $g6128$;
    private static SubLSymbol $g6129$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLObject $ic41$;
    
    public static SubLObject f48759(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0756.f47487(var1, (SubLObject)UNPROVIDED);
        SubLObject var4 = (SubLObject)NIL;
        var2.resetMultipleValues();
        final SubLObject var5 = module0765.f48628(var3, (SubLObject)$ic3$);
        final SubLObject var6 = var2.secondMultipleValue();
        final SubLObject var7 = var2.thirdMultipleValue();
        var2.resetMultipleValues();
        if (NIL == var4) {
            SubLObject var8 = module0762.f48219(var3, module0579.$g4260$.getDynamicValue(var2));
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL == var4 && NIL != var8) {
                final SubLObject var10 = module0084.f5760(module0579.$g4323$.getDynamicValue(var2));
                final SubLObject var11 = module0579.$g4324$.currentBinding(var2);
                final SubLObject var12 = module0580.$g4373$.currentBinding(var2);
                try {
                    module0579.$g4324$.bind((NIL != module0067.f4852(module0579.$g4324$.getDynamicValue(var2))) ? module0579.$g4324$.getDynamicValue(var2) : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)SIXTEEN_INTEGER), var2);
                    module0580.$g4373$.bind(module0048.f_1X(module0580.$g4373$.getDynamicValue(var2)), var2);
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic4$, module0580.$g4373$.getDynamicValue(var2), module0067.f4903(module0579.$g4323$.getDynamicValue(var2)));
                    }
                    try {
                        final SubLObject var11_13 = module0579.$g4323$.currentBinding(var2);
                        try {
                            module0579.$g4323$.bind(var10, var2);
                            SubLObject var13 = var5;
                            SubLObject var14 = (SubLObject)NIL;
                            var14 = var13.first();
                            while (NIL != var13) {
                                SubLObject var16;
                                final SubLObject var15 = var16 = var14;
                                SubLObject var17 = (SubLObject)NIL;
                                SubLObject var18 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var16, var15, (SubLObject)$ic5$);
                                var17 = var16.first();
                                var16 = (var18 = var16.rest());
                                module0754.f47320(var17, (SubLObject)$ic3$);
                                var13 = var13.rest();
                                var14 = var13.first();
                            }
                            final SubLObject var19 = f48760(var1, var6, var5, var9);
                            if (NIL != var19) {
                                if (NIL != module0756.f47479(var1)) {
                                    var4 = (SubLObject)T;
                                }
                            }
                        }
                        finally {
                            module0579.$g4323$.rebind(var11_13, var2);
                        }
                    }
                    finally {
                        final SubLObject var11_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                            if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                                PrintLow.format((SubLObject)T, (SubLObject)$ic6$, module0580.$g4373$.getDynamicValue(var2));
                            }
                            if (NIL != module0756.f47479(var1)) {
                                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                                    PrintLow.format((SubLObject)T, (SubLObject)$ic7$, module0756.f47467(var1));
                                }
                                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                                    PrintLow.format((SubLObject)T, (SubLObject)$ic8$, module0579.$g4323$.getDynamicValue(var2), module0067.f4903(var10));
                                }
                                module0580.f35617(var10);
                            }
                            else if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                                PrintLow.format((SubLObject)T, (SubLObject)$ic9$, module0067.f4903(module0579.$g4323$.getDynamicValue(var2)));
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var11_14, var2);
                        }
                    }
                }
                finally {
                    module0580.$g4373$.rebind(var12, var2);
                    module0579.$g4324$.rebind(var11, var2);
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        return module0756.f47467(var1);
    }
    
    public static SubLObject f48760(final SubLObject var1, final SubLObject var6, final SubLObject var5, final SubLObject var9) {
        final SubLObject var10 = f48761(var1, var6, var5, var9);
        SubLObject var11 = (SubLObject)NIL;
        if (NIL == module0751.f46703(var10)) {
            final SubLObject var12 = module0756.f47511(var1);
            final SubLObject var13 = module0756.f47488(var1, (SubLObject)UNPROVIDED);
            final SubLObject var14 = module0751.f47099(var13, (SubLObject)$ic10$, (SubLObject)UNPROVIDED);
            final SubLObject var15 = module0763.f48248(var10, var12);
            module0756.f47784(var15, (NIL != var14) ? var14 : var13, (SubLObject)UNPROVIDED);
            module0763.f48337(var15, module0756.f47487(var1, (SubLObject)UNPROVIDED), var12, (SubLObject)NIL);
            module0770.f49065(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0756.f47479(var15)) {
                module0756.f47484(var15, var1, (SubLObject)UNPROVIDED);
                module0756.f47569(var1, var9);
            }
            var11 = (SubLObject)T;
        }
        return var11;
    }
    
    public static SubLObject f48761(final SubLObject var1, final SubLObject var6, final SubLObject var5, final SubLObject var9) {
        final SubLObject var10 = module0751.f46672(var6, module0756.f47487(var1, (SubLObject)UNPROVIDED));
        final SubLObject var11 = module0751.f46693(module0756.f47511(var1), var6);
        final SubLObject var12 = f48762(var10, var5, var9, var11);
        final SubLObject var13 = (NIL != module0751.f46703(var12)) ? module0751.f46678() : module0751.f46672(var12, var6);
        return var13;
    }
    
    public static SubLObject f48762(final SubLObject var27, final SubLObject var5, final SubLObject var9, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = module0751.f46678();
        SubLObject var32;
        final SubLObject var31 = var32 = module0178.f11330(var9);
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic11$);
        var33 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic11$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic11$);
        var35 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic11$);
        var36 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic11$);
        var37 = var32.first();
        var32 = var32.rest();
        if (NIL == var32) {
            if (NIL != module0202.f12595(var27)) {
                var29.resetMultipleValues();
                final SubLObject var38 = f48763(var27, var5, var36, var28);
                final SubLObject var39 = var29.secondMultipleValue();
                final SubLObject var40 = var29.thirdMultipleValue();
                final SubLObject var41 = var29.fourthMultipleValue();
                var29.resetMultipleValues();
                if (NIL != var38) {
                    SubLObject var42 = (SubLObject)NIL;
                    SubLObject var43 = var41;
                    SubLObject var44 = (SubLObject)NIL;
                    if (NIL == var44) {
                        SubLObject var45 = module0202.f12751(var37);
                        SubLObject var46 = (SubLObject)NIL;
                        var46 = var45.first();
                        while (NIL == var44 && NIL != var45) {
                            var29.resetMultipleValues();
                            final SubLObject var47 = f48764(var46, var38, var27, var43);
                            final SubLObject var48 = var29.secondMultipleValue();
                            var29.resetMultipleValues();
                            if (NIL != var47) {
                                var42 = (SubLObject)ConsesLow.cons(var47, var42);
                                var43 = var48;
                            }
                            else {
                                var44 = (SubLObject)T;
                            }
                            var45 = var45.rest();
                            var46 = var45.first();
                        }
                    }
                    if (NIL != var44) {
                        return module0751.f46678();
                    }
                    var42 = Sequences.nreverse(var42);
                    var30 = f48765(var35, var33, var39, var42, var43, var28, var27);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic11$);
        }
        return var30;
    }
    
    public static SubLObject f48763(final SubLObject var27, final SubLObject var5, final SubLObject var37, final SubLObject var28) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = (SubLObject)NIL;
        SubLObject var44 = (SubLObject)NIL;
        SubLObject var45 = (SubLObject)ZERO_INTEGER;
        final SubLObject var46 = module0205.f13207(var27, (SubLObject)$ic12$);
        SubLObject var47;
        SubLObject var48;
        SubLObject var53_55;
        SubLObject var49;
        SubLObject var51;
        SubLObject var50;
        SubLObject var52;
        SubLObject var53;
        SubLObject var54;
        SubLObject var55;
        SubLObject var56;
        for (var47 = (SubLObject)NIL, var47 = var46; NIL == var44 && NIL != var47; var47 = var47.rest()) {
            var48 = var47.first();
            var45 = Numbers.add(var45, (SubLObject)ONE_INTEGER);
            for (var53_55 = (SubLObject)NIL, var53_55 = var5; NIL == var44 && NIL != var53_55; var53_55 = var53_55.rest()) {
                var49 = var53_55.first();
                var50 = (var51 = var49);
                var52 = (SubLObject)NIL;
                var53 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic5$);
                var52 = var51.first();
                var51 = (var53 = var51.rest());
                var38.resetMultipleValues();
                var54 = module0337.f22630(var48, (SubLObject)ConsesLow.listS($ic13$, var52, (SubLObject)$ic14$));
                var55 = var38.secondMultipleValue();
                var38.resetMultipleValues();
                if (NIL != var54) {
                    var56 = module0035.f2294(var55, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != f48766(var56, var37)) {
                        var44 = var45;
                        var42 = var56;
                        var41 = var52;
                    }
                }
            }
        }
        if (NIL != var44) {
            var39 = module0751.f46604((SubLObject)ConsesLow.list(var44, (SubLObject)ONE_INTEGER));
            var43 = module0751.f46604((SubLObject)ConsesLow.list(var44, (SubLObject)TWO_INTEGER));
            SubLObject var57 = (SubLObject)NIL;
            SubLObject var58;
            SubLObject var59;
            SubLObject var60;
            for (var58 = module0202.f12728(var27, (SubLObject)UNPROVIDED), var59 = (SubLObject)NIL, var59 = (SubLObject)ONE_INTEGER; !var59.numGE(var58); var59 = module0048.f_1X(var59)) {
                if (!var59.eql(var44)) {
                    var60 = module0303.f20123(var59);
                    var57 = (SubLObject)ConsesLow.cons(var60, var57);
                }
            }
            var40 = module0202.f12683((SubLObject)$ic16$, Sequences.nreverse(var57), (SubLObject)UNPROVIDED);
            final SubLObject var61 = module0751.f46982(module0751.f46825(var43), var28);
            module0754.f47313(var41, var42, var61);
        }
        return Values.values(var41, var39, var43, var40);
    }
    
    public static SubLObject f48766(final SubLObject var60, final SubLObject var37) {
        return (NIL != module0751.f46605()) ? Equality.equal(var60, var37) : module0751.f46669(var37, var60, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48764(final SubLObject var46, final SubLObject var39, final SubLObject var27, final SubLObject var31) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        final SubLObject var51 = module0205.f13207(var31, (SubLObject)$ic12$);
        SubLObject var52;
        SubLObject var53;
        SubLObject var54;
        SubLObject var55;
        SubLObject var56;
        SubLObject var57;
        for (var52 = (SubLObject)NIL, var52 = var51; NIL == var50 && NIL != var52; var52 = var52.rest()) {
            var53 = var52.first();
            var54 = module0751.f46672(var53, var27);
            var47.resetMultipleValues();
            var55 = module0337.f22630(var54, (SubLObject)ConsesLow.listS((SubLObject)$ic17$, var39, (SubLObject)$ic18$));
            var56 = var47.secondMultipleValue();
            var47.resetMultipleValues();
            if (NIL != var55) {
                var57 = module0035.f2294(var56, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != f48767(var57, var46)) {
                    var48 = module0751.f46793((SubLObject)TWO_INTEGER, var53);
                    var50 = var53;
                }
            }
        }
        if (NIL != var50) {
            final SubLObject var58 = Sequences.remove(var50, module0205.f13207(var31, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var49 = (SubLObject)((NIL != var58) ? module0202.f12683((SubLObject)$ic16$, var58, (SubLObject)UNPROVIDED) : NIL);
        }
        return Values.values(var48, var49);
    }
    
    public static SubLObject f48767(final SubLObject var60, final SubLObject var46) {
        return (NIL != module0751.f46605()) ? Equality.equal(var60, var46) : module0751.f46849(var46, var60, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48765(final SubLObject var36, final SubLObject var34, final SubLObject var40, final SubLObject var43, final SubLObject var44, final SubLObject var28, final SubLObject var27) {
        final SubLObject var45 = f48768(var36, (SubLObject)UNPROVIDED);
        final SubLObject var46 = module0732.f45144(var36);
        final SubLObject var47 = module0035.f2065(var46, var43);
        SubLObject var48 = module0751.f46678();
        if (NIL != module0762.f48210(var45) && NIL != var47) {
            var48 = f48769(var45, var34, var40, var47, var44, var28, var27);
        }
        return var48;
    }
    
    public static SubLObject f48768(final SubLObject var36, SubLObject var71) {
        if (var71 == UNPROVIDED) {
            var71 = module0579.$g4260$.getDynamicValue();
        }
        return module0035.f2293($g6128$.getGlobalValue(), var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48769(SubLObject var68, final SubLObject var72, final SubLObject var73, final SubLObject var70, SubLObject var44, final SubLObject var28, final SubLObject var27) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        if (NIL != var44) {
            var74.resetMultipleValues();
            final SubLObject var74_75 = f48770(var68, var44, var73, var27);
            final SubLObject var76_77 = var74.secondMultipleValue();
            var74.resetMultipleValues();
            var68 = var74_75;
            var44 = var76_77;
            var44 = f48771(f48772(var44, var28, var27));
        }
        final SubLObject var75 = f48773(var68, var70, var72, var73, var44);
        return var75;
    }
    
    public static SubLObject f48770(SubLObject var68, SubLObject var44, final SubLObject var79, final SubLObject var27) {
        final SubLThread var80 = SubLProcess.currentSubLThread();
        final SubLObject var81 = module0751.f46672(var79, var27);
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var84;
        final SubLObject var83 = var84 = module0205.f13207(var44, (SubLObject)$ic12$);
        SubLObject var85 = (SubLObject)NIL;
        var85 = var84.first();
        while (NIL != var84) {
            final SubLObject var86 = module0751.f46672(var85, var27);
            final SubLObject var87 = module0202.f12724(var81, var86, (SubLObject)UNPROVIDED);
            SubLObject var88 = (SubLObject)NIL;
            if (NIL != var87) {
                var80.resetMultipleValues();
                final SubLObject var82_83 = f48774(var86, var87, var85, var68);
                final SubLObject var84_85 = var80.secondMultipleValue();
                var80.resetMultipleValues();
                var68 = var82_83;
                var88 = var84_85;
            }
            if (NIL == var88) {
                var82 = (SubLObject)ConsesLow.cons(var85, var82);
            }
            var84 = var84.rest();
            var85 = var84.first();
        }
        var44 = (SubLObject)((NIL != var82) ? module0202.f12683((SubLObject)$ic16$, Sequences.nreverse(var82), (SubLObject)UNPROVIDED) : NIL);
        return Values.values(var68, var44);
    }
    
    public static SubLObject f48774(final SubLObject var54, final SubLObject var80, final SubLObject var63, SubLObject var68) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        SubLObject var82 = (SubLObject)NIL;
        if (ONE_INTEGER.eql(var80)) {
            var81.resetMultipleValues();
            final SubLObject var83 = module0337.f22630(var54, (SubLObject)$ic22$);
            final SubLObject var84 = var81.secondMultipleValue();
            var81.resetMultipleValues();
            if (NIL != var83) {
                final SubLObject var85 = module0035.f2294(var84, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var86 = module0035.f2294(var84, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == var82) {
                    SubLObject var87 = $g6129$.getGlobalValue();
                    SubLObject var88 = (SubLObject)NIL;
                    var88 = var87.first();
                    while (NIL == var82 && NIL != var87) {
                        SubLObject var90;
                        final SubLObject var89 = var90 = var88;
                        SubLObject var91 = (SubLObject)NIL;
                        SubLObject var92 = (SubLObject)NIL;
                        SubLObject var93 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)$ic24$);
                        var91 = var90.first();
                        var90 = var90.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)$ic24$);
                        var92 = var90.first();
                        var90 = var90.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)$ic24$);
                        var93 = var90.first();
                        var90 = var90.rest();
                        if (NIL == var90) {
                            if (NIL != module0751.f46849(var86, var91, (SubLObject)UNPROVIDED) && NIL != module0751.f46684(var85, var92, (SubLObject)UNPROVIDED)) {
                                final SubLObject var94 = module0751.f46793((SubLObject)ZERO_INTEGER, var63);
                                final SubLObject var95 = module0751.f46793((SubLObject)TWO_INTEGER, var63);
                                final SubLObject var96 = f48775(var93, var94, var95);
                                var68 = f48776(var96, var68);
                                var82 = (SubLObject)T;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var89, (SubLObject)$ic24$);
                        }
                        var87 = var87.rest();
                        var88 = var87.first();
                    }
                }
            }
        }
        return Values.values(var68, var82);
    }
    
    public static SubLObject f48775(final SubLObject var34, final SubLObject var91, final SubLObject var92) {
        return (SubLObject)ConsesLow.list($ic25$, $ic26$, (SubLObject)ConsesLow.list($ic27$, (SubLObject)ConsesLow.list($ic28$, (SubLObject)ConsesLow.list($ic29$, var91, (SubLObject)ConsesLow.list($ic30$, $ic31$, var34))), (SubLObject)ConsesLow.list($ic32$, var92)));
    }
    
    public static SubLObject f48776(final SubLObject var93, final SubLObject var68) {
        final SubLObject var94 = module0205.f13276(var68);
        if (var94.eql($ic25$)) {
            if (module0205.f13203(var68, (SubLObject)UNPROVIDED).eql($ic33$)) {
                return module0202.f12817((SubLObject)TWO_INTEGER, module0202.f12768($ic27$, (SubLObject)ConsesLow.list($ic28$, module0205.f13204(var68, (SubLObject)UNPROVIDED)), var93), var68);
            }
            return module0202.f12817((SubLObject)TWO_INTEGER, f48776(var93, module0205.f13204(var68, (SubLObject)UNPROVIDED)), var68);
        }
        else {
            if (var94.eql($ic27$)) {
                SubLObject var95 = (SubLObject)NIL;
                SubLObject var97;
                final SubLObject var96 = var97 = module0205.f13207(var68, (SubLObject)$ic12$);
                SubLObject var98 = (SubLObject)NIL;
                var98 = var97.first();
                while (NIL != var97) {
                    if (NIL != module0202.f12589(var98, $ic28$)) {
                        var95 = (SubLObject)ConsesLow.cons(module0202.f12817((SubLObject)ONE_INTEGER, f48776(var93, module0205.f13203(var98, (SubLObject)UNPROVIDED)), var98), var95);
                    }
                    else {
                        var95 = (SubLObject)ConsesLow.cons(var98, var95);
                    }
                    var97 = var97.rest();
                    var98 = var97.first();
                }
                return module0202.f12683($ic27$, Sequences.nreverse(var95), (SubLObject)UNPROVIDED);
            }
            final SubLObject var99 = Sequences.cconcatenate((SubLObject)$ic34$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic35$, module0006.f203((SubLObject)$ic36$) });
            module0578.f35476(var99, (SubLObject)ConsesLow.list(var93, var68));
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f48771(final SubLObject var98) {
        return (SubLObject)((NIL != var98) ? module0202.f12643($ic32$, var98) : NIL);
    }
    
    public static SubLObject f48772(SubLObject var44, final SubLObject var28, final SubLObject var27) {
        if (NIL != module0751.f46788(var44)) {
            final SubLObject var45 = module0751.f46693(var28, var44);
            var44 = module0751.f46672(module0765.f48612(module0751.f46672(var44, var27), (SubLObject)NIL, var45, (SubLObject)NIL), var44);
        }
        return var44;
    }
    
    public static SubLObject f48773(SubLObject var68, final SubLObject var100, final SubLObject var72, final SubLObject var73, final SubLObject var44) {
        SubLObject var101 = var100;
        SubLObject var102 = (SubLObject)NIL;
        var102 = var101.first();
        while (NIL != var101) {
            SubLObject var104;
            final SubLObject var103 = var104 = var102;
            SubLObject var105 = (SubLObject)NIL;
            SubLObject var106 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var104, var103, (SubLObject)$ic37$);
            var105 = var104.first();
            var104 = (var106 = var104.rest());
            var68 = module0205.f13250(var106, var105, var68, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var101 = var101.rest();
            var102 = var101.first();
        }
        var68 = module0205.f13250(var72, (SubLObject)$ic38$, var68, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var68 = module0205.f13250(var73, (SubLObject)$ic39$, var68, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0751.f46788(var44)) {
            var68 = (SubLObject)ConsesLow.list($ic25$, $ic40$, (SubLObject)ConsesLow.list($ic41$, var68, var44));
        }
        return var68;
    }
    
    public static SubLObject f48777() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48759", "S#53244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48760", "S#53245", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48761", "S#53246", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48762", "S#53247", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48763", "S#53248", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48766", "S#53249", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48764", "S#53250", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48767", "S#53251", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48765", "S#53252", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48768", "S#53253", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48769", "S#53254", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48770", "S#53255", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48774", "S#53256", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48775", "S#53257", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48776", "S#53258", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48771", "S#53259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48772", "S#53260", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0766", "f48773", "S#53261", 5, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48778() {
        $g6128$ = SubLFiles.deflexical("S#53262", (SubLObject)$ic20$);
        $g6129$ = SubLFiles.deflexical("S#53263", (SubLObject)$ic21$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48779() {
        module0762.f48147((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f48777();
    }
    
    public void initializeVariables() {
        f48778();
    }
    
    public void runTopLevelForms() {
        f48779();
    }
    
    static {
        me = (SubLFile)new module0766();
        $g6128$ = null;
        $g6129$ = null;
        $ic0$ = makeSymbol("S#53244", "CYC");
        $ic1$ = makeKeyword("VERB-SEMTRANS-MATCHER");
        $ic2$ = makeKeyword("BEST");
        $ic3$ = makeKeyword("EXISTENTIAL");
        $ic4$ = makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%");
        $ic5$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#53264", "CYC"));
        $ic6$ = makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). ");
        $ic7$ = makeString("~& Output list: ~S~%");
        $ic8$ = makeString("~& Setting ~S to~% ~S");
        $ic9$ = makeString("~% Leaving *PPH-VAR-TYPES* ~S");
        $ic10$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("pastTense-Generic")));
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#49996", "CYC"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#53265", "CYC"), (SubLObject)makeSymbol("S#53266", "CYC"), (SubLObject)makeSymbol("S#53267", "CYC"));
        $ic12$ = makeKeyword("IGNORE");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#751", "CYC")));
        $ic15$ = makeSymbol("S#751", "CYC");
        $ic16$ = makeKeyword("ARG0");
        $ic17$ = ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)makeKeyword("ANYTHING"));
        $ic19$ = makeSymbol("S#155", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("DitransitiveNP-NPFrame")), constant_handles_oc.f8479((SubLObject)makeString("PhraseFormFn")), constant_handles_oc.f8479((SubLObject)makeString("NLSentence")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ConcatenatePhrasesFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TermParaphraseFn-NP")), (SubLObject)makeKeyword("SUBJECT")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("BestHeadVerbForInitialSubjectFn")), (SubLObject)makeKeyword("VERB")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TermParaphraseFn-NP")), (SubLObject)makeKeyword("OBLIQUE-OBJECT")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TermParaphraseFn-NP")), (SubLObject)makeKeyword("OBJECT")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TransitiveNPFrame")), constant_handles_oc.f8479((SubLObject)makeString("PhraseFormFn")), constant_handles_oc.f8479((SubLObject)makeString("NLSentence")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ConcatenatePhrasesFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TermParaphraseFn-NP")), (SubLObject)makeKeyword("SUBJECT")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("HeadWordOfPhraseFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PhraseFormFn")), constant_handles_oc.f8479((SubLObject)makeString("VerbPhrase")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ConcatenatePhrasesFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("HeadWordOfPhraseFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PhraseCycLFn")), (SubLObject)makeKeyword("VERB-DENOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("BestHeadVerbForInitialSubjectFn")), (SubLObject)makeKeyword("VERB")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TermParaphraseFn-NP")), (SubLObject)makeKeyword("OBJECT"))))))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("IntransitiveVerbFrame")), constant_handles_oc.f8479((SubLObject)makeString("PhraseFormFn")), constant_handles_oc.f8479((SubLObject)makeString("NLSentence")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ConcatenatePhrasesFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TermParaphraseFn-NP")), (SubLObject)makeKeyword("SUBJECT")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("HeadWordOfPhraseFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PhraseFormFn")), constant_handles_oc.f8479((SubLObject)makeString("VerbPhrase")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PhraseCycLFn")), (SubLObject)makeKeyword("VERB-DENOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("BestHeadVerbForInitialSubjectFn")), (SubLObject)makeKeyword("VERB"))))))));
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), constant_handles_oc.f8479((SubLObject)makeString("CalendarYear")), constant_handles_oc.f8479((SubLObject)makeString("In-TheWord"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), constant_handles_oc.f8479((SubLObject)makeString("CalendarMonth")), constant_handles_oc.f8479((SubLObject)makeString("In-TheWord"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), constant_handles_oc.f8479((SubLObject)makeString("CalendarDay")), constant_handles_oc.f8479((SubLObject)makeString("On-TheWord"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("eventOccursAt")), constant_handles_oc.f8479((SubLObject)makeString("City")), constant_handles_oc.f8479((SubLObject)makeString("In-TheWord"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("eventOccursAt")), constant_handles_oc.f8479((SubLObject)makeString("GeographicalRegion")), constant_handles_oc.f8479((SubLObject)makeString("In-TheWord"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("to-UnderspecifiedLocation")), constant_handles_oc.f8479((SubLObject)makeString("Thing")), constant_handles_oc.f8479((SubLObject)makeString("To-TheWord"))));
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#39252", "CYC")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#751", "CYC")));
        $ic23$ = makeSymbol("S#39252", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#12455", "CYC"), (SubLObject)makeSymbol("S#49996", "CYC"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("PhraseFormFn"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("PrepositionalPhrase"));
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("ConcatenatePhrasesFn"));
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("HeadWordOfPhraseFn"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("PhraseCycLFn"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("BestNLWordFormOfLexemeFn-Constrained"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("prepositionStrings"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("TermParaphraseFn"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("VerbPhrase"));
        $ic34$ = makeString("(PPH error level ");
        $ic35$ = makeString(") ");
        $ic36$ = makeString("Couldn't adjoin ~S to~% ~S");
        $ic37$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic38$ = makeKeyword("VERB");
        $ic39$ = makeKeyword("VERB-DENOT");
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("NLSentence"));
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("NLConjunctionFn"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 284 ms
	
	Decompiled with Procyon 0.5.32.
*/