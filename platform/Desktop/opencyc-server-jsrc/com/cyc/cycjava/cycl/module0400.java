package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0400 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0400";
    public static final String myFingerPrint = "0b21aa77fcc8a1ac9e245cfd4614122cce23dbfe915e7f6395567fdf0ed87acc";
    private static SubLSymbol $g3290$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    
    public static SubLObject f28232(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            final SubLObject var9 = (SubLObject)$ic1$;
            final SubLObject var10 = (SubLObject)$ic2$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var7), (SubLObject)ConsesLow.list(var9, (SubLObject)ConsesLow.list((SubLObject)$ic4$, var10))), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var6, var10), ConsesLow.append(var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic6$, var6, var9))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28233(final SubLObject var6, final SubLObject var11) {
        assert NIL != module0387.f27528(var11) : var11;
        final SubLObject var12 = module0398.f28161(var6, var11);
        if (NIL == var12) {
            f28234(var6, var11);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28234(final SubLObject var6, final SubLObject var11) {
        assert NIL != module0398.f28152(var6) : var6;
        assert NIL != module0387.f27528(var11) : var11;
        module0398.f28168(var6, var11);
        if (NIL == module0377.f26746(var11)) {
            if (NIL != module0387.f27531(var11)) {
                final SubLObject var12 = module0364.f24757(var11);
                f28235(var6, var12);
            }
            else if (NIL != module0382.f27206(var11)) {
                final SubLObject var13 = module0382.f27195(var11);
                final SubLObject var14 = module0382.f27185(var13);
                final SubLObject var15 = module0382.f27186(var13);
                f28235(var6, var14);
                f28235(var6, var15);
            }
            else {
                final SubLObject var16 = module0373.f26168(var11);
                f28235(var6, var16);
            }
        }
        module0367.f25100(var6, (SubLObject)$ic9$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28236(final SubLObject var6, final SubLObject var13, SubLObject var9) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (NIL == module0380.f26955(var13)) {
            return f28237(var6, var13);
        }
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = var9;
        final SubLObject var16 = module0363.f24530(var9);
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var27_30;
        SubLObject var24;
        SubLObject var25;
        for (var17 = module0032.f1741(var16), var18 = (SubLObject)NIL, var18 = module0032.f1742(var17, var16); NIL == var14 && NIL == module0032.f1744(var17, var18); var18 = module0032.f1743(var18)) {
            var19 = module0032.f1745(var17, var18);
            if (NIL != module0032.f1746(var18, var19)) {
                var20 = var19;
                for (var21 = (SubLObject)NIL, var21 = module0364.f24735(var20); NIL == var14 && NIL != var21; var21 = var21.rest()) {
                    var22 = var21.first();
                    if (NIL != module0339.f22743((SubLObject)T, var20, var22) && var15.eql(module0364.f24736(var22))) {
                        var23 = module0364.f24725(var19);
                        for (var27_30 = (SubLObject)NIL, var27_30 = module0363.f24517(var23); NIL == var14 && NIL != var27_30; var27_30 = var27_30.rest()) {
                            var24 = var27_30.first();
                            if (NIL != module0380.f26969(var24)) {
                                var25 = module0380.f26964(var24);
                                if (var22.eql(var25) && NIL != module0398.f28161(var6, var24)) {
                                    var14 = (SubLObject)T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return var14;
    }
    
    public static SubLObject f28237(final SubLObject var6, final SubLObject var13) {
        if (NIL != module0387.f27531(var13)) {
            return module0398.f28161(var6, var13);
        }
        if (NIL != module0380.f26955(var13)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0373.f26162(var13)) {
            final SubLObject var14 = module0373.f26166(var13);
            return module0398.f28161(var6, var14);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28235(final SubLObject var6, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var10) && NIL != module0387.f27516(var6)) {
            Errors.error((SubLObject)$ic10$, var6, var9);
        }
        final SubLObject var11 = module0398.f28160(var6, var9);
        if (NIL == var11) {
            f28238(var6, var9);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28238(final SubLObject var6, final SubLObject var9) {
        module0398.f28167(var6, var9);
        if (NIL != module0363.f24586(var9, var6)) {
            f28239(var6, var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28239(final SubLObject var6, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL != f28240(var6, var9)) {
            return (SubLObject)NIL;
        }
        module0373.f26191(var9, var6);
        if (NIL != f28241(var6, var9)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0375.f26588(var9) && NIL != module0375.$g3188$.getDynamicValue(var10)) {
            f28235(var6, var9);
        }
        if (NIL != f28242(var9, var6)) {
            f28243(var6, var9);
        }
        final SubLObject var11 = (SubLObject)makeBoolean(NIL != module0398.f28160(var6, var9) && NIL == f28241(var6, var9));
        if (NIL == var11) {
            return (SubLObject)NIL;
        }
        if (NIL != f28244(var6, var9)) {
            return (SubLObject)T;
        }
        f28245(var6, var9);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28242(final SubLObject var9, final SubLObject var6) {
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0363.f24530(var9);
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        SubLObject var22_37;
        SubLObject var23_38;
        SubLObject var24_39;
        SubLObject var16;
        for (var12 = module0032.f1741(var11), var13 = (SubLObject)NIL, var13 = module0032.f1742(var12, var11); NIL == var10 && NIL == module0032.f1744(var12, var13); var13 = module0032.f1743(var13)) {
            var14 = module0032.f1745(var12, var13);
            if (NIL != module0032.f1746(var13, var14) && NIL != module0364.f24748(var14, (SubLObject)$ic11$)) {
                var15 = module0364.f24725(var14);
                var22_37 = module0363.f24530(var15);
                for (var23_38 = module0032.f1741(var22_37), var24_39 = (SubLObject)NIL, var24_39 = module0032.f1742(var23_38, var22_37); NIL == var10 && NIL == module0032.f1744(var23_38, var24_39); var24_39 = module0032.f1743(var24_39)) {
                    var16 = module0032.f1745(var23_38, var24_39);
                    if (NIL != module0032.f1746(var24_39, var16) && NIL != module0364.f24748(var16, (SubLObject)$ic12$) && NIL != module0381.f27056(var16, var14) && var15.eql(module0381.f27051(var16))) {
                        var10 = (SubLObject)T;
                    }
                }
            }
        }
        return var10;
    }
    
    public static SubLObject f28243(final SubLObject var6, final SubLObject var9) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28240(final SubLObject var6, final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL != module0384.f27319(var6, var9) || NIL != module0384.f27297(var9, var6));
    }
    
    public static SubLObject f28241(final SubLObject var6, final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL != module0398.f28163(var6, var9) || NIL != module0398.f28162(var6, var9));
    }
    
    public static SubLObject f28244(final SubLObject var6, final SubLObject var9) {
        assert NIL != module0398.f28152(var6) : var6;
        assert NIL != module0363.f24478(var9) : var9;
        return Numbers.plusp(f28246(var6, var9));
    }
    
    public static SubLObject f28246(final SubLObject var6, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        var10.resetMultipleValues();
        final SubLObject var11 = f28247(var6, var9);
        final SubLObject var12 = var10.secondMultipleValue();
        final SubLObject var13 = var10.thirdMultipleValue();
        var10.resetMultipleValues();
        SubLObject var14 = var11;
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            module0398.f28171(var6, var15);
            var14 = var14.rest();
            var15 = var14.first();
        }
        var14 = var12;
        var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            module0398.f28172(var6, var15);
            if (NIL != module0365.f24819(var15)) {
                module0367.f25231(var15, var6, (SubLObject)UNPROVIDED);
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        var14 = var13;
        var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            module0398.f28174(var6, var15);
            if (NIL != module0365.f24819(var15)) {
                module0367.f25228(var15, var6, (SubLObject)UNPROVIDED);
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return Sequences.length(var11);
    }
    
    public static SubLObject f28248(final SubLObject var6, final SubLObject var9) {
        SubLObject var10 = (SubLObject)ZERO_INTEGER;
        final SubLObject var11 = module0363.f24527(var9);
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        for (var12 = module0032.f1741(var11), var13 = (SubLObject)NIL, var13 = module0032.f1742(var12, var11); NIL == module0032.f1744(var12, var13); var13 = module0032.f1743(var13)) {
            var14 = module0032.f1745(var12, var13);
            if (NIL != module0032.f1746(var13, var14) && NIL != module0364.f24748(var14, (SubLObject)$ic14$)) {
                var15 = module0377.f26758(var14);
                if (NIL != var15 && NIL == module0363.f24547(var15, module0367.f25037(var6))) {
                    inference_datastructures_inference_oc.f25678(module0367.f25037(var6), var15);
                    module0373.f26297(var6, var15);
                }
                f28249(var6, var14);
                var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
            }
        }
        return var10;
    }
    
    public static SubLObject f28250(final SubLObject var6, final SubLObject var13) {
        if (NIL != module0377.f26746(var13)) {
            f28249(var6, var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28249(final SubLObject var6, final SubLObject var46) {
        if (NIL != module0364.f24749(var46) && NIL == module0398.f28161(var6, var46)) {
            f28251(var6, var46);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28251(final SubLObject var6, final SubLObject var46) {
        module0398.f28170(var6, module0364.f24725(var46));
        final SubLObject var47 = module0377.f26752(var46);
        if (NIL == module0399.f28191(var6, var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            if (NIL != module0399.f28199(var6, var47, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T)) {
                module0398.f28172(var6, var46);
            }
            else {
                module0398.f28171(var6, var46);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28252(final SubLObject var6, final SubLObject var15) {
        module0373.f26130(var6, var15);
        if (NIL == module0380.f26969(var15) || NIL == module0380.f26994()) {
            if (NIL == module0384.f27277(var6, var15)) {
                if (NIL != inference_datastructures_inference_oc.f25432(module0367.f25037(var6)) && NIL != module0384.f27285(var6, var15)) {
                    if (NIL != module0387.f27533(var15)) {
                        module0398.f28172(var6, var15);
                    }
                }
                else {
                    f28253(var6, var15);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28254(final SubLObject var6, final SubLObject var49) {
        final SubLObject var50 = module0365.f24850(var49.first());
        if (NIL != module0367.f25083(var50, var6)) {
            final SubLObject var51 = module0387.f27475(var6, conses_high.copy_list(var49), (SubLObject)$ic16$);
            SubLObject var52 = Sequences.reverse(var51);
            SubLObject var53 = (SubLObject)NIL;
            var53 = var52.first();
            while (NIL != var52) {
                f28253(var6, var53);
                var52 = var52.rest();
                var53 = var52.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28253(final SubLObject var6, final SubLObject var15) {
        final SubLObject var16 = module0365.f24850(var15);
        module0367.f25208(var16, var15, var6);
        if ((NIL != module0380.f26994() && NIL != module0380.f26969(var15)) || (NIL != module0377.f26771(var15) && NIL == module0377.f26766(var15))) {
            final SubLObject var17 = (SubLObject)T;
            module0398.f28170(var6, module0365.f24850(var15));
            if (NIL != module0399.f28191(var6, var15, var17, (SubLObject)NIL)) {
                module0398.f28174(var6, var15);
            }
            else if (NIL != module0399.f28199(var6, var15, var17, (SubLObject)NIL, (SubLObject)T)) {
                module0398.f28172(var6, var15);
            }
            else {
                module0398.f28171(var6, var15);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28247(final SubLObject var6, final SubLObject var9) {
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        if (NIL == module0399.f28184(var6, var9, (SubLObject)UNPROVIDED)) {
            final SubLObject var12 = module0399.f28189(var6, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var13 = module0363.f24517(var9);
            SubLObject var14 = (SubLObject)NIL;
            var14 = var13.first();
            while (NIL != var13) {
                if (NIL != module0363.f24524(var14, (SubLObject)$ic14$) && NIL != module0363.f24518(var14, (SubLObject)$ic18$) && NIL == module0399.f28191(var6, var14, (SubLObject)T, (SubLObject)UNPROVIDED)) {
                    if (NIL != var12 || NIL != module0399.f28199(var6, var14, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var11 = (SubLObject)ConsesLow.cons(var14, var11);
                    }
                    else {
                        var10 = (SubLObject)ConsesLow.cons(var14, var10);
                    }
                }
                var13 = var13.rest();
                var14 = var13.first();
            }
            final SubLObject var15 = module0363.f24527(var9);
            SubLObject var16;
            SubLObject var17;
            SubLObject var18;
            SubLObject var19;
            for (var16 = module0032.f1741(var15), var17 = (SubLObject)NIL, var17 = module0032.f1742(var16, var15); NIL == module0032.f1744(var16, var17); var17 = module0032.f1743(var17)) {
                var18 = module0032.f1745(var16, var17);
                if (NIL != module0032.f1746(var17, var18) && NIL != module0364.f24748(var18, (SubLObject)$ic14$) && NIL != module0364.f24749(var18) && NIL == module0398.f28161(var6, var18)) {
                    var19 = module0377.f26752(var18);
                    if (NIL == module0399.f28191(var6, var19, (SubLObject)T, (SubLObject)UNPROVIDED)) {
                        if (NIL != var12 || NIL != module0399.f28199(var6, var19, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var11 = (SubLObject)ConsesLow.cons(var19, var11);
                        }
                        else {
                            var10 = (SubLObject)ConsesLow.cons(var19, var10);
                        }
                    }
                }
            }
            if (NIL == module0363.f24562(var9)) {
                var13 = module0363.f24517(var9);
                SubLObject var20 = (SubLObject)NIL;
                var20 = var13.first();
                while (NIL != var13) {
                    if (NIL != module0363.f24524(var20, (SubLObject)$ic19$) && NIL == module0398.f28161(var6, var20) && NIL == module0399.f28191(var6, var20, (SubLObject)T, (SubLObject)UNPROVIDED)) {
                        if (NIL != var12 || NIL != module0399.f28199(var6, var20, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var11 = (SubLObject)ConsesLow.cons(var20, var11);
                        }
                        else {
                            var10 = (SubLObject)ConsesLow.cons(var20, var10);
                        }
                    }
                    var13 = var13.rest();
                    var20 = var13.first();
                }
            }
        }
        var10 = Sequences.nreverse(var10);
        var11 = Sequences.nreverse(var11);
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var13 = module0363.f24517(var9);
        SubLObject var14 = (SubLObject)NIL;
        var14 = var13.first();
        while (NIL != var13) {
            if (NIL != module0363.f24524(var14, (SubLObject)$ic14$) && NIL != module0363.f24518(var14, (SubLObject)$ic18$) && NIL == module0035.f2169(var14, var10) && NIL == module0035.f2169(var14, var11)) {
                var21 = (SubLObject)ConsesLow.cons(var14, var21);
            }
            var13 = var13.rest();
            var14 = var13.first();
        }
        final SubLObject var15 = module0363.f24527(var9);
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        for (var16 = module0032.f1741(var15), var17 = (SubLObject)NIL, var17 = module0032.f1742(var16, var15); NIL == module0032.f1744(var16, var17); var17 = module0032.f1743(var17)) {
            var18 = module0032.f1745(var16, var17);
            if (NIL != module0032.f1746(var17, var18) && NIL != module0364.f24748(var18, (SubLObject)$ic14$) && NIL == module0035.f2169(var18, var10) && NIL == module0035.f2169(var18, var11)) {
                var21 = (SubLObject)ConsesLow.cons(var18, var21);
            }
        }
        var13 = module0363.f24517(var9);
        SubLObject var20 = (SubLObject)NIL;
        var20 = var13.first();
        while (NIL != var13) {
            if (NIL != module0363.f24524(var20, (SubLObject)$ic19$) && NIL == module0035.f2169(var20, var10) && NIL == module0035.f2169(var20, var11)) {
                var21 = (SubLObject)ConsesLow.cons(var20, var21);
            }
            var13 = var13.rest();
            var20 = var13.first();
        }
        return Values.values(var10, var11, var21);
    }
    
    public static SubLObject f28255(final SubLObject var6, final SubLObject var7) {
        assert NIL != module0398.f28152(var6) : var6;
        assert NIL != module0387.f27527(var7) : var7;
        if (NIL != module0377.f26771(var7)) {
            return module0398.f28171(var6, var7);
        }
        if (NIL != module0373.f26148(var7)) {
            return var7;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28256(final SubLObject var6, final SubLObject var7) {
        if (NIL != module0387.f27529(var7)) {
            return (SubLObject)NIL;
        }
        final SubLObject var8 = module0387.f27530(var7);
        f28257(var6, var7);
        f28258(var6, var8);
        if (NIL != module0365.f24819(var7)) {
            module0373.f26291(var6, var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28257(final SubLObject var6, final SubLObject var7) {
        assert NIL != module0398.f28152(var6) : var6;
        assert NIL != module0387.f27533(var7) : var7;
        final SubLObject var8 = module0387.f27530(var7);
        final SubLObject var9 = module0398.f28157(var6);
        SubLObject var10 = module0067.f4885(var9, var8, (SubLObject)ZERO_INTEGER);
        var10 = Numbers.subtract(var10, (SubLObject)ONE_INTEGER);
        if (var10.isPositive()) {
            module0067.f4886(var9, var8, var10);
        }
        else {
            module0067.f4887(var9, var8);
            module0398.f28169(var6, var8);
        }
        return var10;
    }
    
    public static SubLObject f28258(final SubLObject var6, final SubLObject var9) {
        if (NIL == module0398.f28163(var6, var9)) {
            module0367.f25050(var6, var9);
            if (NIL != module0398.f28164(var6, var9)) {
                module0367.f25101(var6, var9);
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28259(final SubLObject var6, final SubLObject var9) {
        final SubLObject var10 = f28260(var6, var9);
        return var10;
    }
    
    public static SubLObject f28260(final SubLObject var6, final SubLObject var9) {
        if (NIL != module0399.f28184(var6, var9, (SubLObject)UNPROVIDED)) {
            f28245(var6, var9);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28245(final SubLObject var6, final SubLObject var9) {
        module0398.f28169(var6, var9);
        f28258(var6, var9);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28261(final SubLObject var6, final SubLObject var9) {
        final SubLObject var10 = module0387.f27481(var6);
        SubLObject var11 = module0363.f24517(var9);
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            if (NIL == module0384.f27275(var10, var12, (SubLObject)NIL, (SubLObject)NIL)) {
                return (SubLObject)NIL;
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f28262() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0400", "f28232", "S#31359");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28233", "S#31360", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28234", "S#31361", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28236", "S#31362", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28237", "S#31363", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28235", "S#31364", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28238", "S#31365", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28239", "S#31366", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28242", "S#31367", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28243", "S#31368", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28240", "S#31369", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28241", "S#31370", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28244", "S#31371", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28246", "S#31372", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28248", "S#31263", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28250", "S#31373", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28249", "S#31374", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28251", "S#31375", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28252", "S#31376", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28254", "S#31377", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28253", "S#31378", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28247", "S#31307", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28255", "S#31379", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28256", "S#31380", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28257", "S#31381", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28258", "S#31382", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28259", "S#31383", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28260", "S#31384", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28245", "S#31385", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0400", "f28261", "S#31386", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28263() {
        $g3290$ = SubLFiles.defparameter("S#31387", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f28264() {
        module0012.f419((SubLObject)$ic15$);
        module0012.f419((SubLObject)$ic17$);
        module0012.f419((SubLObject)$ic22$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f28262();
    }
    
    public void initializeVariables() {
        f28263();
    }
    
    public void runTopLevelForms() {
        f28264();
    }
    
    static {
        me = (SubLFile)new module0400();
        $g3290$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8816", "CYC"), (SubLObject)makeSymbol("S#31246", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeUninternedSymbol("US#6FBE6D3");
        $ic2$ = makeUninternedSymbol("US#40FC4A0");
        $ic3$ = makeSymbol("CLET");
        $ic4$ = makeSymbol("S#30619", "CYC");
        $ic5$ = makeSymbol("S#31381", "CYC");
        $ic6$ = makeSymbol("S#31382", "CYC");
        $ic7$ = makeSymbol("S#30620", "CYC");
        $ic8$ = makeSymbol("S#30356", "CYC");
        $ic9$ = makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED");
        $ic10$ = makeString("~s tried to propagate T to ~s but it throws away all transformation");
        $ic11$ = makeKeyword("RESTRICTION");
        $ic12$ = makeKeyword("JOIN-ORDERED");
        $ic13$ = makeSymbol("S#26082", "CYC");
        $ic14$ = makeKeyword("TRANSFORMATION");
        $ic15$ = makeSymbol("S#31376", "CYC");
        $ic16$ = makeSymbol("S#30575", "CYC");
        $ic17$ = makeSymbol("S#31377", "CYC");
        $ic18$ = makeKeyword("POSSIBLE");
        $ic19$ = makeKeyword("LOGICAL");
        $ic20$ = makeSymbol("S#30617", "CYC");
        $ic21$ = makeSymbol("S#30623", "CYC");
        $ic22$ = makeSymbol("S#31386", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 217 ms
	
	Decompiled with Procyon 0.5.32.
*/