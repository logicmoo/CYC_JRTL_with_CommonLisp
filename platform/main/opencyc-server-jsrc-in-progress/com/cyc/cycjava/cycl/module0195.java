package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0195 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0195";
    public static final String myFingerPrint = "084f370cfb350f8fd500bb9e8ab25b5cd8fe240572c3c5695d51edc1ad7ca225";
    private static SubLSymbol $g2270$;
    private static SubLSymbol $g2271$;
    private static SubLSymbol $g2272$;
    private static SubLSymbol $g2273$;
    public static SubLSymbol $g2274$;
    private static SubLSymbol $g2275$;
    private static SubLSymbol $g2276$;
    private static SubLSymbol $g2277$;
    private static SubLSymbol $g2278$;
    private static SubLSymbol $g2279$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLInteger $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLList $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLList $ic95$;
    
    
    public static SubLObject f12128(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = f12129(var1, var2);
        return var3;
    }
    
    public static SubLObject f12130(final SubLObject var1) {
        final SubLObject var2 = module0340.f22786(var1);
        if (NIL != var2) {
            f12131(var2);
            final SubLObject var3 = f12132(var2);
            if (NIL != module0173.f10955(var3)) {
                f12133(var3, var2);
            }
            else {
                f12134(var2);
            }
        }
        return var1;
    }
    
    public static SubLObject f12135(final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10) {
        assert NIL != Types.consp(var5) : var5;
        assert NIL != module0035.f2015(var5) : var5;
        SubLObject var11 = var5;
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            assert NIL != module0340.f22789(var12) : var12;
            var11 = var11.rest();
            var12 = var11.first();
        }
        return f12136(var5, var6, var7, var8, var9, var10, (SubLObject)$ic7$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12137(final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        assert NIL != Types.consp(var5) : var5;
        assert NIL != module0035.f2015(var5) : var5;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            assert NIL != module0340.f22789(var10) : var10;
            var9 = var9.rest();
            var10 = var9.first();
        }
        return f12136(var5, var6, var7, var8, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)$ic8$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12138(final SubLObject var5, final SubLObject var7, final SubLObject var8) {
        assert NIL != Types.consp(var5) : var5;
        assert NIL != module0035.f2015(var5) : var5;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            assert NIL != module0340.f22789(var10) : var10;
            var9 = var9.rest();
            var10 = var9.first();
        }
        return f12136(var5, (SubLObject)NIL, var7, var8, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12139(final SubLObject var14, final SubLObject var15) {
        return module0076.f5290(f12140(var14), f12141(var15), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12140(final SubLObject var14) {
        return conses_high.copy_list(module0067.f4884($g2272$.getGlobalValue(), var14, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f12142(final SubLObject var14) {
        return module0035.sublisp_boolean(f12140(var14));
    }
    
    public static SubLObject f12143() {
        return module0067.f4902($g2272$.getGlobalValue());
    }
    
    public static SubLObject f12144() {
        return module0077.f5312($g2271$.getGlobalValue());
    }
    
    public static SubLObject f12141(final SubLObject var15) {
        final SubLObject var16 = module0191.f11921(var15);
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = var16;
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            var17 = ConsesLow.nconc(var17, f12145(var19));
            var18 = var18.rest();
            var19 = var18.first();
        }
        return var17;
    }
    
    public static SubLObject f12146() {
        return module0076.f5290(f12144(), f12141((SubLObject)$ic10$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12147() {
        return conses_high.list_length(f12146());
    }
    
    public static SubLObject f12145(final SubLObject var15) {
        return conses_high.copy_list(module0067.f4885($g2273$.getGlobalValue(), var15, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f12148() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        return $g2274$.getDynamicValue(var18);
    }
    
    public static SubLObject f12149(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        SubLObject var23 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic11$);
        var23 = var22.first();
        final SubLObject var24;
        var22 = (var24 = var22.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic13$, var23)), ConsesLow.append(var24, (SubLObject)NIL));
    }
    
    public static SubLObject f12136(final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10, final SubLObject var25, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = module0139.$g1630$.getDynamicValue(var27);
        final SubLObject var30 = module0139.$g1631$.currentBinding(var27);
        final SubLObject var31 = module0139.$g1632$.currentBinding(var27);
        final SubLObject var32 = module0139.$g1630$.currentBinding(var27);
        try {
            module0139.$g1631$.bind(module0139.f9015(var29, (SubLObject)FOUR_INTEGER), var27);
            module0139.$g1632$.bind(module0139.f9016(var29), var27);
            module0139.$g1630$.bind((SubLObject)T, var27);
            var27.resetMultipleValues();
            final SubLObject var33 = f12150(var5, var6, var7, var8, var9, var10);
            final SubLObject var34 = var27.secondMultipleValue();
            var27.resetMultipleValues();
            final SubLObject var35 = f12151(var33, var6, var7, var8, var9, var10);
            if (NIL == var28) {
                SubLObject var36 = var35;
                SubLObject var37 = (SubLObject)NIL;
                var37 = var36.first();
                while (NIL == var28 && NIL != var36) {
                    var28 = f12152(var37, var6, var7, var8, var9, var10, var25, var26);
                    if (NIL != var28) {
                        f12153(var37);
                    }
                    var36 = var36.rest();
                    var37 = var36.first();
                }
            }
            if (NIL == var28) {
                final SubLObject var38 = f12154(var34, var6, var7, var8, var9, var10);
                SubLObject var39;
                SubLObject var40;
                SubLObject var42;
                SubLObject var41;
                SubLObject var43;
                SubLObject var44;
                SubLObject var45;
                SubLObject var46;
                SubLObject var47;
                for (var39 = (SubLObject)NIL, var39 = var38; NIL == var28 && NIL != var39; var39 = var39.rest()) {
                    var40 = var39.first();
                    var41 = (var42 = var40);
                    var43 = (SubLObject)NIL;
                    var44 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)$ic14$);
                    var43 = var42.first();
                    var42 = (var44 = var42.rest());
                    var45 = (SubLObject)NIL;
                    if (NIL == var45) {
                        var46 = var44;
                        var47 = (SubLObject)NIL;
                        var47 = var46.first();
                        while (NIL == var45 && NIL != var46) {
                            if (NIL != f12155(var47)) {
                                var45 = (SubLObject)T;
                            }
                            var46 = var46.rest();
                            var47 = var46.first();
                        }
                    }
                    if (NIL == var45) {
                        var28 = f12152(var43, var6, var7, var8, var9, var10, var25, var26);
                        if (NIL != var28) {
                            f12153(var43);
                        }
                    }
                }
            }
        }
        finally {
            module0139.$g1630$.rebind(var32, var27);
            module0139.$g1632$.rebind(var31, var27);
            module0139.$g1631$.rebind(var30, var27);
        }
        return var28;
    }
    
    public static SubLObject f12152(final SubLObject var3, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10, final SubLObject var25, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = $g2274$.currentBinding(var27);
        try {
            $g2274$.bind(var3, var27);
            if (var25.eql((SubLObject)$ic7$)) {
                var28 = f12156(var3, var6, var7, var8, var9, var10, var26);
            }
            else if (var25.eql((SubLObject)$ic8$)) {
                var28 = f12157(var3, var6, var7, var8, var26);
            }
            else if (var25.eql((SubLObject)$ic9$)) {
                var28 = f12158(var3, var7, var8, var26);
            }
        }
        finally {
            $g2274$.rebind(var29, var27);
        }
        return var28;
    }
    
    public static SubLObject f12159(final SubLObject var3) {
        return module0340.f22825(var3);
    }
    
    public static SubLObject f12160(final SubLObject var3, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10) {
        final SubLObject var11 = f12161(var3);
        if (NIL != Symbols.fboundp(var11)) {
            return Functions.funcall(var11, var6, var7, var8, var9, var10);
        }
        return f12162(var3, var6, var7, var8, var9, var10);
    }
    
    public static SubLObject f12150(final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        if (NIL == var15) {
            SubLObject var16 = var5;
            SubLObject var17 = (SubLObject)NIL;
            var17 = var16.first();
            while (NIL == var15 && NIL != var16) {
                if (NIL == module0004.f104(var17, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && (NIL != module0035.f2294(var13, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != f12160(var17, var6, var7, var8, var9, var10))) {
                    final SubLObject var18 = f12163(var17);
                    if (NIL == var18 || (var18.isFunctionSpec() && NIL != Functions.funcall(var18, var6, var7, var8, var9, var10))) {
                        if (NIL != var18) {
                            var11.resetMultipleValues();
                            final SubLObject var50_51 = f12164(var17, var14, var12);
                            final SubLObject var52_53 = var11.secondMultipleValue();
                            final SubLObject var54_55 = var11.thirdMultipleValue();
                            var11.resetMultipleValues();
                            var15 = var50_51;
                            var14 = var52_53;
                            var12 = var54_55;
                        }
                        if (NIL == var15) {
                            var11.resetMultipleValues();
                            final SubLObject var56_57 = f12165(var17, var14, var13, var5, var6, var7, var8, var9, var10);
                            final SubLObject var58_59 = var11.secondMultipleValue();
                            var11.resetMultipleValues();
                            var14 = var56_57;
                            var13 = var58_59;
                        }
                        if (NIL != var15 || NIL == module0035.f2293(var13, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var14 = (SubLObject)ConsesLow.cons(var17, var14);
                        }
                    }
                }
                var16 = var16.rest();
                var17 = var16.first();
            }
        }
        return Values.values(Sequences.nreverse(var14), (SubLObject)((NIL != var15) ? NIL : var13));
    }
    
    public static SubLObject f12165(final SubLObject var3, SubLObject var32, SubLObject var33, final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10) {
        final SubLObject var35;
        final SubLObject var34 = var35 = f12166(var3);
        SubLObject var37;
        final SubLObject var36 = var37 = var34;
        SubLObject var38 = (SubLObject)NIL;
        var38 = var37.first();
        while (NIL != var37) {
            final SubLObject var39 = module0340.f22786(var38);
            if (NIL != module0004.f104(var39, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                if (NIL != module0004.f104(var39, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var32 = Sequences.delete(var39, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var33 = module0035.f2313(var33, var39, var3, (SubLObject)UNPROVIDED);
                }
                else if (NIL != module0035.f2293(var33, var39, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var33 = module0035.f2313(var33, var39, var3, (SubLObject)UNPROVIDED);
                }
                else if (NIL != f12160(var39, var6, var7, var8, var9, var10)) {
                    var33 = module0035.f2313(var33, var39, var3, (SubLObject)UNPROVIDED);
                }
            }
            var37 = var37.rest();
            var38 = var37.first();
        }
        return Values.values(var32, var33);
    }
    
    public static SubLObject f12164(final SubLObject var3, SubLObject var32, SubLObject var47) {
        final SubLObject var48 = f12167(var3);
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = var48;
        if (var50.eql((SubLObject)$ic15$)) {
            var32 = (SubLObject)NIL;
            var49 = (SubLObject)T;
        }
        else {
            SubLObject var52;
            final SubLObject var51 = var52 = var48;
            SubLObject var53 = (SubLObject)NIL;
            var53 = var52.first();
            while (NIL != var52) {
                final SubLObject var54 = module0340.f22786(var53);
                var47 = (SubLObject)ConsesLow.cons(var54, var47);
                var32 = Sequences.delete(var54, var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var52 = var52.rest();
                var53 = var52.first();
            }
        }
        return Values.values(var49, var32, var47);
    }
    
    public static SubLObject f12151(final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10) {
        return var5;
    }
    
    public static SubLObject f12154(final SubLObject var33, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10) {
        return var33;
    }
    
    public static SubLObject f12168(final SubLObject var3, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLObject var27 = f12169(var3, (SubLObject)$ic16$);
        return (NIL != var27) ? Functions.funcall(var27, var6, var7, var8, var9, var10) : var26;
    }
    
    public static SubLObject f12156(final SubLObject var3, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLObject var27 = f12169(var3, (SubLObject)$ic7$);
        return (NIL != var27) ? Functions.funcall(var27, var6, var7, var8, var9, var10) : var26;
    }
    
    public static SubLObject f12157(final SubLObject var3, final SubLObject var6, final SubLObject var7, final SubLObject var8, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLObject var27 = f12169(var3, (SubLObject)$ic8$);
        return (NIL != var27) ? Functions.funcall(var27, var6, var7, var8) : var26;
    }
    
    public static SubLObject f12158(final SubLObject var3, final SubLObject var7, final SubLObject var8, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLObject var27 = f12169(var3, (SubLObject)$ic9$);
        return (NIL != var27) ? Functions.funcall(var27, var7, var8) : var26;
    }
    
    public static SubLObject f12170(final SubLObject var3) {
        return f12169(var3, (SubLObject)$ic17$);
    }
    
    public static SubLObject f12171(final SubLObject var3) {
        return f12169(var3, (SubLObject)$ic18$);
    }
    
    public static SubLObject f12172(final SubLObject var3) {
        return f12169(var3, (SubLObject)$ic19$);
    }
    
    public static SubLObject f12173(final SubLObject var3) {
        return f12169(var3, (SubLObject)$ic20$);
    }
    
    public static SubLObject f12132(final SubLObject var3) {
        return f12169(var3, (SubLObject)$ic21$);
    }
    
    public static SubLObject f12174(final SubLObject var3) {
        return f12169(var3, (SubLObject)$ic22$);
    }
    
    public static SubLObject f12161(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        var4.resetMultipleValues();
        final SubLObject var5 = f12169(var3, (SubLObject)$ic23$);
        final SubLObject var6 = var4.secondMultipleValue();
        var4.resetMultipleValues();
        if (NIL != var6) {
            return (SubLObject)NIL;
        }
        return var5;
    }
    
    public static SubLObject f12175(final SubLObject var3) {
        return f12169(var3, (SubLObject)$ic24$);
    }
    
    public static SubLObject f12163(final SubLObject var3) {
        return f12169(var3, (SubLObject)$ic25$);
    }
    
    public static SubLObject f12167(final SubLObject var3) {
        return f12169(var3, (SubLObject)$ic26$);
    }
    
    public static SubLObject f12166(final SubLObject var3) {
        return f12169(var3, (SubLObject)$ic27$);
    }
    
    public static SubLObject f12169(final SubLObject var3, final SubLObject var73) {
        return module0340.f22839(var3, var73);
    }
    
    public static SubLObject f12176() {
        f12177();
        f12178();
        final SubLObject var74 = module0077.f5333($g2270$.getGlobalValue());
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        for (var75 = module0032.f1741(var74), var76 = (SubLObject)NIL, var76 = module0032.f1742(var75, var74); NIL == module0032.f1744(var75, var76); var76 = module0032.f1743(var76)) {
            var77 = module0032.f1745(var75, var76);
            if (NIL != module0032.f1746(var76, var77)) {
                var78 = f12132(var77);
                var79 = f12170(var77);
                f12179(var77, var78, var79);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12180() {
        return $g2275$.getGlobalValue();
    }
    
    public static SubLObject f12181(final SubLObject var77) {
        return module0004.f104(var77, $g2275$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12131(final SubLObject var3) {
        final SubLObject var4 = f12170(var3);
        module0340.f22836(var3);
        module0084.f5771($g2273$.getGlobalValue(), var4, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0077.f5327(var3, $g2270$.getGlobalValue());
        return $g2270$.getGlobalValue();
    }
    
    public static SubLObject f12134(final SubLObject var3) {
        module0077.f5327(var3, $g2271$.getGlobalValue());
        return $g2271$.getGlobalValue();
    }
    
    public static SubLObject f12133(final SubLObject var4, final SubLObject var3) {
        return module0084.f5771($g2272$.getGlobalValue(), var4, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12177() {
        $g2271$.setGlobalValue(module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        module0067.f4881($g2272$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12129(final SubLObject var1, final SubLObject var2) {
        assert NIL != Types.keywordp(var1) : var1;
        assert NIL != module0035.f2327(var2) : var2;
        SubLObject var3;
        SubLObject var4;
        SubLObject var5;
        for (var3 = (SubLObject)NIL, var3 = var2; NIL != var3; var3 = conses_high.cddr(var3)) {
            var4 = var3.first();
            var5 = conses_high.cadr(var3);
            assert NIL != f12181(var4) : var4;
        }
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var2;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var87_88 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic32$);
            var87_88 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var2, (SubLObject)$ic32$);
            if (NIL == conses_high.member(var87_88, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var87_88 == $ic33$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)$ic32$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic34$, var2);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic35$, var2);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic36$, var2);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic17$, var2);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var2);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic19$, var2);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : NIL);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic20$, var2);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic21$, var2);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)$ic22$, var2);
        final SubLObject var26 = (SubLObject)((NIL != var25) ? conses_high.cadr(var25) : NIL);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)$ic24$, var2);
        final SubLObject var28 = (SubLObject)((NIL != var27) ? conses_high.cadr(var27) : NIL);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic23$, var2);
        final SubLObject var30 = (SubLObject)((NIL != var29) ? conses_high.cadr(var29) : NIL);
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic26$, var2);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : NIL);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)$ic25$, var2);
        final SubLObject var34 = (SubLObject)((NIL != var33) ? conses_high.cadr(var33) : NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)$ic27$, var2);
        final SubLObject var36 = (SubLObject)((NIL != var35) ? conses_high.cadr(var35) : NIL);
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var2);
        final SubLObject var38 = (SubLObject)((NIL != var37) ? conses_high.cadr(var37) : NIL);
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var2);
        final SubLObject var40 = (SubLObject)((NIL != var39) ? conses_high.cadr(var39) : NIL);
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)$ic8$, var2);
        final SubLObject var42 = (SubLObject)((NIL != var41) ? conses_high.cadr(var41) : NIL);
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var2);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var2);
        final SubLObject var46 = (SubLObject)((NIL != var45) ? conses_high.cadr(var45) : NIL);
        assert NIL != Types.stringp(var10) : var10;
        assert NIL != module0191.f11918(var16) : var16;
        assert NIL != Types.symbolp(var38) : var38;
        assert NIL != Types.symbolp(var40) : var40;
        assert NIL != Types.symbolp(var42) : var42;
        assert NIL != Types.symbolp(var44) : var44;
        if (NIL != var30) {
            assert NIL != Types.symbolp(var30) : var30;
        }
        else {
            assert NIL != module0161.f10481(var22) : var22;
            assert NIL != f12182(var28) : var28;
            if (NIL != var18 && !areAssertionsDisabledFor(me) && NIL == module0130.f8516(var18)) {
                throw new AssertionError(var18);
            }
            if (NIL != var20 && !areAssertionsDisabledFor(me) && NIL == module0130.f8503(var20)) {
                throw new AssertionError(var20);
            }
        }
        if (NIL != var12 && !areAssertionsDisabledFor(me) && NIL == Types.keywordp(var12)) {
            throw new AssertionError(var12);
        }
        if (NIL != var14 && !areAssertionsDisabledFor(me) && NIL == module0173.f10955(var14)) {
            throw new AssertionError(var14);
        }
        if (NIL != var32) {
            final SubLObject var47 = var32;
            assert NIL != module0035.f2015(var47) : var47;
            SubLObject var48 = var47;
            SubLObject var49 = (SubLObject)NIL;
            var49 = var48.first();
            while (NIL != var48) {
                assert NIL != Types.keywordp(var49) : var49;
                var48 = var48.rest();
                var49 = var48.first();
            }
        }
        if (NIL != var34 && !areAssertionsDisabledFor(me) && NIL == Types.symbolp(var34)) {
            throw new AssertionError(var34);
        }
        if (NIL != var36) {
            final SubLObject var47 = var36;
            assert NIL != module0035.f2015(var47) : var47;
            SubLObject var48 = var47;
            SubLObject var49 = (SubLObject)NIL;
            var49 = var48.first();
            while (NIL != var48) {
                assert NIL != Types.keywordp(var49) : var49;
                var48 = var48.rest();
                var49 = var48.first();
            }
        }
        if (NIL != var24 && !areAssertionsDisabledFor(me) && NIL == constant_handles_oc.f8449(var24)) {
            throw new AssertionError(var24);
        }
        if (NIL != var26) {
            final SubLObject var47 = var26;
            assert NIL != module0035.f2015(var47) : var47;
            SubLObject var48 = var47;
            SubLObject var49 = (SubLObject)NIL;
            var49 = var48.first();
            while (NIL != var48) {
                assert NIL != module0173.f10955(var49) : var49;
                var48 = var48.rest();
                var49 = var48.first();
            }
        }
        if (NIL != var46 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var46)) {
            throw new AssertionError(var46);
        }
        return f12183(var1, var2);
    }
    
    public static SubLObject f12182(final SubLObject var124) {
        return (SubLObject)makeBoolean(NIL != module0004.f104(var124, (SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || var124.isList());
    }
    
    public static SubLObject f12183(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0340.f22843(var1, (SubLObject)$ic48$, var2);
        module0077.f5326(var3, $g2270$.getGlobalValue());
        final SubLObject var4 = conses_high.getf(var2, (SubLObject)$ic21$, (SubLObject)UNPROVIDED);
        final SubLObject var5 = conses_high.getf(var2, (SubLObject)$ic17$, (SubLObject)UNPROVIDED);
        f12179(var3, var4, var5);
        return var3;
    }
    
    public static SubLObject f12179(final SubLObject var3, final SubLObject var14, final SubLObject var15) {
        if (NIL != var14) {
            f12184(var3, var14);
        }
        else {
            f12185(var3);
        }
        f12186(var3, var15);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12184(final SubLObject var3, final SubLObject var14) {
        return module0084.f5765($g2272$.getGlobalValue(), var14, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12185(final SubLObject var3) {
        module0077.f5326(var3, $g2271$.getGlobalValue());
        return var3;
    }
    
    public static SubLObject f12186(final SubLObject var3, final SubLObject var15) {
        return module0084.f5765($g2273$.getGlobalValue(), var15, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12187() {
        return module0077.f5312($g2270$.getGlobalValue());
    }
    
    public static SubLObject f12188() {
        return module0077.f5311($g2270$.getGlobalValue());
    }
    
    public static SubLObject f12162(final SubLObject var3, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10) {
        final SubLObject var11 = module0232.f15328(var7, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0205.f13136(var11);
        return (SubLObject)makeBoolean(NIL != f12189(var3, var7) && NIL != f12190(var3, var9) && NIL != f12191(var3, var6) && NIL != f12192(var3, var12) && NIL != f12193(var3, var8) && NIL != f12194(var3, var11));
    }
    
    public static SubLObject f12189(final SubLObject var3, final SubLObject var7) {
        final SubLObject var8 = f12171(var3);
        if (NIL == var8) {
            return (SubLObject)T;
        }
        if (NIL != module0204.f13044(var7)) {
            return Equality.eq(var8, (SubLObject)$ic49$);
        }
        if (NIL != module0204.f13048(var7)) {
            return Equality.eq(var8, (SubLObject)$ic50$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12190(final SubLObject var3, final SubLObject var9) {
        if (NIL == var9) {
            return (SubLObject)T;
        }
        final SubLObject var10 = f12172(var3);
        return (SubLObject)makeBoolean(NIL == var10 || var10.eql(var9));
    }
    
    public static SubLObject f12191(final SubLObject var3, final SubLObject var6) {
        if (NIL == var6) {
            return (SubLObject)T;
        }
        final SubLObject var7 = f12170(var3);
        return (SubLObject)T;
    }
    
    public static SubLObject f12192(final SubLObject var3, final SubLObject var14) {
        final SubLObject var15 = f12132(var3);
        final SubLObject var16 = f12174(var3);
        return (SubLObject)makeBoolean((NIL == var15 && NIL == var16) || (NIL == var16 && var15.eql(var14)) || (NIL == var15 && NIL != module0004.f104(var14, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f12193(final SubLObject var3, final SubLObject var8) {
        final SubLObject var9 = f12173(var3);
        return module0147.f9559(var8, var9);
    }
    
    public static SubLObject f12194(final SubLObject var3, final SubLObject var125) {
        final SubLObject var126 = f12175(var3);
        return module0337.f22626(var126, var125);
    }
    
    public static SubLObject f12195() {
        module0077.f5328($g2276$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12178() {
        return module0077.f5339($g2276$.getGlobalValue());
    }
    
    public static SubLObject f12196(final SubLObject var14) {
        return module0077.f5326(var14, $g2276$.getGlobalValue());
    }
    
    public static SubLObject f12197(final SubLObject var14) {
        return module0077.f5327(var14, $g2276$.getGlobalValue());
    }
    
    public static SubLObject f12198(final SubLObject var14) {
        return module0077.f5320(var14, $g2276$.getGlobalValue());
    }
    
    public static SubLObject f12199(final SubLObject var77) {
        if (var77.isCons() && NIL != module0035.f2000(var77, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            SubLObject var78 = (SubLObject)NIL;
            SubLObject var79 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var77, var77, (SubLObject)$ic53$);
            var78 = var77.first();
            SubLObject var80 = var77.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var80, var77, (SubLObject)$ic53$);
            var79 = var80.first();
            var80 = var80.rest();
            final SubLObject var81 = (SubLObject)(var80.isCons() ? var80.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var80, var77, (SubLObject)$ic53$);
            var80 = var80.rest();
            final SubLObject var82 = (SubLObject)(var80.isCons() ? var80.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var80, var77, (SubLObject)$ic53$);
            var80 = var80.rest();
            if (NIL == var80) {
                return (SubLObject)makeBoolean(NIL != module0232.f15320(var78) && NIL != module0161.f10481(var79) && (NIL == var81 || NIL != module0130.f8503(var81)) && var82.isList());
            }
            cdestructuring_bind.cdestructuring_bind_error(var77, (SubLObject)$ic53$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12200(final SubLObject var7, final SubLObject var8, SubLObject var9, SubLObject var10) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.list(var7, var8, var9, var10);
    }
    
    public static SubLObject f12201(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic54$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic54$);
        var24 = var22.first();
        var22 = var22.rest();
        if (NIL == var22) {
            final SubLObject var25;
            var22 = (var25 = var23);
            final SubLObject var26 = (SubLObject)$ic55$;
            final SubLObject var27 = (SubLObject)$ic56$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic57$, (SubLObject)ConsesLow.list((SubLObject)$ic58$, (SubLObject)ConsesLow.list(var26), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)$ic59$, var26))), ConsesLow.append(var25, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic60$, (SubLObject)ConsesLow.list(var27), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)$ic61$, var27))), ConsesLow.append(var25, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)$ic54$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12202(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic62$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic62$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic62$);
        var25 = var22.first();
        var22 = var22.rest();
        final SubLObject var26 = (SubLObject)(var22.isCons() ? var22.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var22, var21, (SubLObject)$ic62$);
        var22 = var22.rest();
        final SubLObject var27 = (SubLObject)(var22.isCons() ? var22.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var22, var21, (SubLObject)$ic62$);
        var22 = var22.rest();
        if (NIL == var22) {
            var22 = var23;
            SubLObject var28 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic62$);
            var28 = var22.first();
            final SubLObject var29;
            var22 = (var29 = var22.rest());
            final SubLObject var30 = (SubLObject)$ic63$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list(var30, var28), (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)$ic64$, var30)), (SubLObject)ConsesLow.list(var25, (SubLObject)ConsesLow.list((SubLObject)$ic65$, var30)), ConsesLow.append((SubLObject)((NIL != var26) ? ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)$ic66$, var30))) : NIL), (SubLObject)((NIL != var27) ? ConsesLow.list((SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.list((SubLObject)$ic67$, var30))) : NIL), (SubLObject)NIL)), ConsesLow.append(var29, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)$ic62$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12203(final SubLObject var143) {
        return var143.first();
    }
    
    public static SubLObject f12204(final SubLObject var143) {
        return conses_high.second(var143);
    }
    
    public static SubLObject f12205(final SubLObject var143) {
        return conses_high.third(var143);
    }
    
    public static SubLObject f12206(final SubLObject var143) {
        return conses_high.fourth(var143);
    }
    
    public static SubLObject f12207(final SubLObject var77) {
        return (SubLObject)makeBoolean(NIL != module0035.f1998(var77) && NIL != f12199(var77.first()) && NIL != module0191.f11913(conses_high.second(var77)));
    }
    
    public static SubLObject f12208(final SubLObject var143, final SubLObject var6) {
        return (SubLObject)ConsesLow.list(var143, var6);
    }
    
    public static SubLObject f12209(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic68$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic68$);
        var24 = var22.first();
        var22 = var22.rest();
        if (NIL == var22) {
            final SubLObject var25;
            var22 = (var25 = var23);
            final SubLObject var26 = (SubLObject)$ic69$;
            final SubLObject var27 = (SubLObject)$ic70$;
            final SubLObject var28 = (SubLObject)$ic71$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic57$, (SubLObject)ConsesLow.list((SubLObject)$ic58$, (SubLObject)ConsesLow.list(var26), (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var28, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var26))), (SubLObject)ConsesLow.listS((SubLObject)$ic73$, (SubLObject)ConsesLow.list(var24, var28), ConsesLow.append(var25, (SubLObject)NIL)))), (SubLObject)ConsesLow.list((SubLObject)$ic60$, (SubLObject)ConsesLow.list(var27), (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)$ic74$, var27))), ConsesLow.append(var25, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)$ic68$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12210(final SubLObject var19, final SubLObject var20) {
        SubLObject var22;
        final SubLObject var21 = var22 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic75$);
        final SubLObject var23 = var22.rest();
        var22 = var22.first();
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic75$);
        var24 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic75$);
        var25 = var22.first();
        var22 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic75$);
        var26 = var22.first();
        var22 = var22.rest();
        final SubLObject var27 = (SubLObject)(var22.isCons() ? var22.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var22, var21, (SubLObject)$ic75$);
        var22 = var22.rest();
        final SubLObject var28 = (SubLObject)(var22.isCons() ? var22.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var22, var21, (SubLObject)$ic75$);
        var22 = var22.rest();
        if (NIL == var22) {
            var22 = var23;
            SubLObject var29 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic75$);
            var29 = var22.first();
            final SubLObject var30;
            var22 = (var30 = var22.rest());
            final SubLObject var31 = (SubLObject)$ic76$;
            final SubLObject var32 = (SubLObject)$ic77$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var31, var29), (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)$ic78$, var31)), (SubLObject)ConsesLow.list(var32, (SubLObject)ConsesLow.list((SubLObject)$ic79$, var31))), (SubLObject)ConsesLow.listS((SubLObject)$ic80$, (SubLObject)ConsesLow.list(var25, var26, var27, var28), var32, ConsesLow.append(var30, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)$ic75$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12211(final SubLObject var152) {
        return var152.first();
    }
    
    public static SubLObject f12212(final SubLObject var152) {
        return conses_high.second(var152);
    }
    
    public static SubLObject f12213(final SubLObject var152) {
        assert NIL != f12207(var152) : var152;
        final SubLObject var153 = f12212(var152);
        final SubLObject var155_156;
        final SubLObject var154 = var155_156 = f12211(var152);
        final SubLObject var155 = f12203(var155_156);
        final SubLObject var156 = f12204(var155_156);
        final SubLObject var157 = f12205(var155_156);
        final SubLObject var158 = f12206(var155_156);
        return f12214(var153, var155, var156, var157, var158);
    }
    
    public static SubLObject f12214(final SubLObject var6, final SubLObject var7, SubLObject var8, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        assert NIL != module0191.f11913(var6) : var6;
        assert NIL != module0232.f15320(var7) : var7;
        assert NIL != module0161.f10481(var8) : var8;
        assert NIL != module0130.f8503(var9) : var9;
        assert NIL != Types.listp(var10) : var10;
        module0426.f30154(var6, var7, var8, var9, var10);
        if (NIL != module0131.$g1540$.getDynamicValue(var11)) {
            module0131.f8588((SubLObject)ConsesLow.list((SubLObject)$ic85$, module0035.f2241(var6), module0035.f2241(var7), module0035.f2241(var8), module0035.f2241(var9), module0035.f2241(var10)));
        }
        if (NIL != module0161.f10471()) {
            var8 = module0162.f10628(var8);
        }
        return f12215((SubLObject)$ic7$, var6, var7, var8, var9, var10);
    }
    
    public static SubLObject f12216(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = module0131.$g1531$.currentBinding(var11);
        try {
            module0131.$g1531$.bind((SubLObject)NIL, var11);
            var12 = f12214(module0290.f19514(var6), module0290.f19514(var7), module0290.f19514(var8), var9, module0290.f19514(var10));
            if (NIL != assertion_handles_oc.f11035(var12)) {}
            module0178.f11358(module0290.f19520(var12), var12);
        }
        finally {
            module0131.$g1531$.rebind(var13, var11);
        }
        return var12;
    }
    
    public static SubLObject f12217(final SubLObject var152) {
        assert NIL != f12207(var152) : var152;
        final SubLObject var153 = f12212(var152);
        final SubLObject var155_158;
        final SubLObject var154 = var155_158 = f12211(var152);
        final SubLObject var155 = f12203(var155_158);
        final SubLObject var156 = f12204(var155_158);
        return f12218(var153, var155, var156);
    }
    
    public static SubLObject f12218(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        assert NIL != module0191.f11913(var6) : var6;
        assert NIL != module0232.f15320(var7) : var7;
        assert NIL != module0161.f10481(var8) : var8;
        if (NIL != module0131.$g1540$.getDynamicValue(var9)) {
            module0131.f8588((SubLObject)ConsesLow.list((SubLObject)$ic86$, module0035.f2241(var6), module0035.f2241(var7), module0035.f2241(var8)));
        }
        return f12215((SubLObject)$ic8$, var6, var7, var8, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f12219(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0131.$g1531$.currentBinding(var9);
        try {
            module0131.$g1531$.bind((SubLObject)NIL, var9);
            var10 = f12218(module0290.f19514(var6), module0290.f19514(var7), module0290.f19514(var8));
        }
        finally {
            module0131.$g1531$.rebind(var11, var9);
        }
        return var10;
    }
    
    public static SubLObject f12220(final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        assert NIL != module0232.f15320(var7) : var7;
        assert NIL != module0161.f10481(var8) : var8;
        if (NIL != module0131.$g1540$.getDynamicValue(var9)) {
            module0131.f8588((SubLObject)ConsesLow.list((SubLObject)$ic87$, module0035.f2241(var7), module0035.f2241(var8)));
        }
        return f12215((SubLObject)$ic9$, (SubLObject)NIL, var7, var8, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f12221(final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0131.$g1531$.currentBinding(var9);
        try {
            module0131.$g1531$.bind((SubLObject)NIL, var9);
            var10 = f12220(module0290.f19514(var7), module0290.f19514(var8));
        }
        finally {
            module0131.$g1531$.rebind(var11, var9);
        }
        return var10;
    }
    
    public static SubLObject f12222(final SubLObject var19, final SubLObject var20) {
        final SubLObject var21 = var19.rest();
        final SubLObject var23;
        final SubLObject var22 = var23 = var21;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)$ic88$, ConsesLow.append(var23, (SubLObject)NIL));
    }
    
    public static SubLObject f12153(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        module0077.f5326(var3, $g2277$.getDynamicValue(var4));
        return $g2277$.getDynamicValue(var4);
    }
    
    public static SubLObject f12155(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return module0077.f5320(var3, $g2277$.getDynamicValue(var4));
    }
    
    public static SubLObject f12215(final SubLObject var25, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = (SubLObject)((NIL != var6) ? module0191.f11917(var6) : NIL);
        final SubLObject var30 = $g2277$.currentBinding(var26);
        try {
            $g2277$.bind(module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var26);
            if (NIL != module0232.f15312(var7)) {
                final SubLObject var31 = module0204.f13055(var7);
                final SubLObject var32 = (NIL != var29) ? f12139(var31, var29) : f12140(var31);
                var28 = f12198(var31);
                if (NIL != var32) {
                    var27 = f12223(var25, var32, var6, var7, var8, var9, var10);
                }
            }
            if (NIL == var27 && NIL == var28) {
                final SubLObject var33 = (NIL != var29) ? f12141(var29) : f12146();
                if (NIL != var33) {
                    var27 = f12223(var25, var33, var6, var7, var8, var9, var10);
                }
            }
        }
        finally {
            $g2277$.rebind(var30, var26);
        }
        return var27;
    }
    
    public static SubLObject f12223(final SubLObject var25, final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var9, final SubLObject var10) {
        final SubLObject var26 = module0226.f14830(var8, var7);
        if (var25.eql((SubLObject)$ic7$)) {
            final SubLObject var27 = f12135(var5, var6, var7, var26, var9, var10);
            return var27;
        }
        if (var25.eql((SubLObject)$ic8$)) {
            SubLObject var27 = f12137(var5, var6, var7, var26);
            if (NIL != $g2278$.getGlobalValue() && NIL == module0161.f10513(var8, var26)) {
                final SubLObject var28 = f12137(var5, var6, var7, var8);
                var27 = (SubLObject)makeBoolean(NIL != var27 || NIL != var28);
            }
            return var27;
        }
        if (var25.eql((SubLObject)$ic9$)) {
            SubLObject var27 = f12138(var5, var7, var26);
            if (NIL != $g2278$.getGlobalValue() && NIL == module0161.f10513(var8, var26)) {
                final SubLObject var28 = f12138(var5, var7, var8);
                var27 = (SubLObject)makeBoolean(NIL != var27 || NIL != var28);
            }
            return var27;
        }
        Errors.error((SubLObject)$ic89$, var25);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12224(final SubLObject var7, final SubLObject var8, final SubLObject var166, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var167 = module0191.f11940(var166);
        return f12214(var167, var7, var8, var9, var10);
    }
    
    public static SubLObject f12225(final SubLObject var7, final SubLObject var8) {
        final SubLObject var9 = $g2279$.getGlobalValue();
        return f12218(var9, var7, var8);
    }
    
    public static SubLObject f12226(final SubLObject var7, final SubLObject var8, final SubLObject var167, final SubLObject var9, SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var168 = module0188.f11768(var167);
        return f12214(var168, var7, var8, var9, var10);
    }
    
    public static SubLObject f12227(final SubLObject var139, final SubLObject var169, final SubLObject var8, final SubLObject var167, SubLObject var9) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        if (NIL == module0018.$g625$.getDynamicValue(var170)) {
            var9 = (SubLObject)$ic92$;
        }
        final SubLObject var171 = module0205.f13339(var139, var169);
        final SubLObject var172 = module0285.f18884(var171, var8);
        if (NIL == var172 || $ic93$.eql(var172)) {
            module0334.f22566(var139, var169, var8);
            return (SubLObject)NIL;
        }
        if (!$ic94$.eql(var172)) {
            SubLObject var173 = var172;
            SubLObject var174 = (SubLObject)NIL;
            var174 = var173.first();
            while (NIL != var173) {
                SubLObject var176;
                final SubLObject var175 = var176 = var174;
                SubLObject var177 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var176, var175, (SubLObject)$ic95$);
                var177 = var176.first();
                var176 = var176.rest();
                final SubLObject var178 = (SubLObject)(var176.isCons() ? var176.first() : NIL);
                cdestructuring_bind.destructuring_bind_must_listp(var176, var175, (SubLObject)$ic95$);
                var176 = var176.rest();
                if (NIL == var176) {
                    assert NIL != module0232.f15320(var177) : var177;
                    if (NIL != module0018.$g628$.getDynamicValue(var170) && NIL != module0232.f15312(var177) && NIL != module0342.f23148(var177, var8)) {
                        return (SubLObject)NIL;
                    }
                    return f12226(var177, var8, var167, var9, var178);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var175, (SubLObject)$ic95$);
                    var173 = var173.rest();
                    var174 = var173.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12228(final SubLObject var7, final SubLObject var8, final SubLObject var167) {
        final SubLObject var168 = module0188.f11768(var167);
        return f12218(var168, var7, var8);
    }
    
    public static SubLObject f12229() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12128", "S#14917", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12130", "S#14918", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12135", "S#14919", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12137", "S#14920", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12138", "S#14921", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12139", "S#14922", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12140", "S#14923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12142", "S#14924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12143", "S#14925", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12144", "S#14926", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12141", "S#14927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12146", "S#14928", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12147", "S#14929", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12145", "S#14930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12148", "S#14931", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0195", "f12149", "S#14932");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12136", "S#14933", 7, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12152", "S#14934", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12159", "S#14935", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12160", "S#14936", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12150", "S#14937", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12165", "S#14938", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12164", "S#14939", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12151", "S#14940", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12154", "S#14941", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12168", "S#14942", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12156", "S#14943", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12157", "S#14944", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12158", "S#14945", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12170", "S#14946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12171", "S#14947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12172", "S#14948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12173", "S#14949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12132", "S#14950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12174", "S#14951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12161", "S#14952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12175", "S#14953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12163", "S#14954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12167", "S#14955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12166", "S#14956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12169", "S#14957", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12176", "S#9533", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12180", "S#14958", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12181", "S#14959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12131", "S#14960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12134", "S#14961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12133", "S#14962", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12177", "S#14963", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12129", "S#14964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12182", "S#14965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12183", "S#14966", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12179", "S#14967", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12184", "S#14968", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12185", "S#14969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12186", "S#14970", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12187", "S#14971", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12188", "S#14972", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12162", "S#14973", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12189", "S#14974", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12190", "S#14975", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12191", "S#14976", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12192", "S#14977", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12193", "S#14978", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12194", "S#14979", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12195", "S#14980", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12178", "S#14981", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12196", "S#14982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12197", "S#14983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12198", "S#14984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12199", "S#14985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12200", "S#14093", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0195", "f12201", "S#14986");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0195", "f12202", "S#14987");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12203", "S#14988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12204", "S#14989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12205", "S#14990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12206", "S#14991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12207", "S#14992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12208", "S#14095", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0195", "f12209", "S#14993");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0195", "f12210", "S#14994");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12211", "S#14995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12212", "S#14996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12213", "S#14997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12214", "S#14998", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12216", "S#14999", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12217", "S#15000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12218", "S#15001", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12219", "S#15002", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12220", "S#15003", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12221", "S#15004", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0195", "f12222", "S#15005");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12153", "S#15006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12155", "S#15007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12215", "S#15008", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12223", "S#15009", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12224", "S#15010", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12225", "S#15011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12226", "S#15012", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12227", "S#15013", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0195", "f12228", "S#15014", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12230() {
        $g2270$ = SubLFiles.deflexical("S#15015", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2270$.getGlobalValue() : module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g2271$ = SubLFiles.deflexical("S#15016", (NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g2271$.getGlobalValue() : module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g2272$ = SubLFiles.deflexical("S#15017", (NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g2272$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g2273$ = SubLFiles.deflexical("S#15018", (NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g2273$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g2274$ = SubLFiles.defparameter("S#15019", (SubLObject)NIL);
        $g2275$ = SubLFiles.deflexical("S#15020", (SubLObject)$ic28$);
        $g2276$ = SubLFiles.deflexical("S#15021", (NIL != Symbols.boundp((SubLObject)$ic51$)) ? $g2276$.getGlobalValue() : module0077.f5313((SubLObject)EQL, (SubLObject)$ic52$));
        $g2277$ = SubLFiles.defparameter("S#15022", (SubLObject)NIL);
        $g2278$ = SubLFiles.deflexical("S#15023", (SubLObject)T);
        $g2279$ = SubLFiles.deflexical("S#15024", (NIL != Symbols.boundp((SubLObject)$ic90$)) ? $g2279$.getGlobalValue() : module0191.f11940((SubLObject)$ic91$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12231() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic51$);
        module0003.f57((SubLObject)$ic90$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f12229();
    }
    
    public void initializeVariables() {
        f12230();
    }
    
    public void runTopLevelForms() {
        f12231();
    }
    
    static {
        me = (SubLFile)new module0195();
        $g2270$ = null;
        $g2271$ = null;
        $g2272$ = null;
        $g2273$ = null;
        $g2274$ = null;
        $g2275$ = null;
        $g2276$ = null;
        $g2277$ = null;
        $g2278$ = null;
        $g2279$ = null;
        $ic0$ = makeSymbol("S#15015", "CYC");
        $ic1$ = makeSymbol("S#15016", "CYC");
        $ic2$ = makeSymbol("S#15017", "CYC");
        $ic3$ = makeSymbol("S#15018", "CYC");
        $ic4$ = makeSymbol("CONSP");
        $ic5$ = makeSymbol("S#747", "CYC");
        $ic6$ = makeSymbol("S#14902", "CYC");
        $ic7$ = makeKeyword("ADD");
        $ic8$ = makeKeyword("REMOVE");
        $ic9$ = makeKeyword("REMOVE-ALL");
        $ic10$ = makeKeyword("ARGUMENT");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#14917", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic12$ = makeSymbol("CLET");
        $ic13$ = makeSymbol("S#15019", "CYC");
        $ic14$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#15025", "CYC"), (SubLObject)makeSymbol("S#15026", "CYC"));
        $ic15$ = makeKeyword("ALL");
        $ic16$ = makeKeyword("INCOMPLETENESS");
        $ic17$ = makeKeyword("ARGUMENT-TYPE");
        $ic18$ = makeKeyword("SENSE");
        $ic19$ = makeKeyword("DIRECTION");
        $ic20$ = makeKeyword("REQUIRED-MT");
        $ic21$ = makeKeyword("PREDICATE");
        $ic22$ = makeKeyword("ANY-PREDICATES");
        $ic23$ = makeKeyword("APPLICABILITY");
        $ic24$ = makeKeyword("APPLICABILITY-PATTERN");
        $ic25$ = makeKeyword("EXCLUSIVE");
        $ic26$ = makeKeyword("SUPPLANTS");
        $ic27$ = makeKeyword("PREFERRED-OVER");
        $ic28$ = ConsesLow.list(new SubLObject[] { makeKeyword("PRETTY-NAME"), makeKeyword("MODULE-SUBTYPE"), makeKeyword("MODULE-SOURCE"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("SENSE"), makeKeyword("DIRECTION"), makeKeyword("REQUIRED-MT"), makeKeyword("PREDICATE"), makeKeyword("ANY-PREDICATES"), makeKeyword("APPLICABILITY-PATTERN"), makeKeyword("APPLICABILITY"), makeKeyword("SUPPLANTS"), makeKeyword("EXCLUSIVE"), makeKeyword("PREFERRED-OVER"), makeKeyword("INCOMPLETENESS"), makeKeyword("ADD"), makeKeyword("REMOVE"), makeKeyword("REMOVE-ALL"), makeKeyword("DOCUMENTATION") });
        $ic29$ = makeSymbol("KEYWORDP");
        $ic30$ = makeSymbol("S#748", "CYC");
        $ic31$ = makeSymbol("S#14959", "CYC");
        $ic32$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#15027", "CYC"), makeSymbol("S#15028", "CYC"), makeSymbol("S#15029", "CYC"), makeSymbol("S#15030", "CYC"), makeSymbol("S#12397", "CYC"), makeSymbol("S#5432", "CYC"), makeSymbol("S#15031", "CYC"), makeSymbol("S#717", "CYC"), makeSymbol("S#15032", "CYC"), makeSymbol("S#15033", "CYC"), makeSymbol("S#15034", "CYC"), makeSymbol("S#15035", "CYC"), makeSymbol("S#15036", "CYC"), makeSymbol("S#15037", "CYC"), makeSymbol("S#15038", "CYC"), makeSymbol("S#15039", "CYC"), makeSymbol("REMOVE"), makeSymbol("S#15040", "CYC"), makeSymbol("DOCUMENTATION") });
        $ic33$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic34$ = makeKeyword("PRETTY-NAME");
        $ic35$ = makeKeyword("MODULE-SUBTYPE");
        $ic36$ = makeKeyword("MODULE-SOURCE");
        $ic37$ = makeKeyword("DOCUMENTATION");
        $ic38$ = makeSymbol("STRINGP");
        $ic39$ = makeSymbol("S#14719", "CYC");
        $ic40$ = makeSymbol("SYMBOLP");
        $ic41$ = makeSymbol("S#12263", "CYC");
        $ic42$ = makeSymbol("S#14965", "CYC");
        $ic43$ = makeSymbol("SENSE-P");
        $ic44$ = makeSymbol("DIRECTION-P");
        $ic45$ = makeSymbol("FORT-P");
        $ic46$ = makeSymbol("CONSTANT-P");
        $ic47$ = ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("NOTHING"));
        $ic48$ = makeKeyword("STORAGE");
        $ic49$ = makeKeyword("POS");
        $ic50$ = makeKeyword("NEG");
        $ic51$ = makeSymbol("S#15021", "CYC");
        $ic52$ = makeInteger(50);
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("S#13916", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#15041", "CYC"));
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15042", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic55$ = makeUninternedSymbol("US#74E0897");
        $ic56$ = makeUninternedSymbol("US#34E22DC");
        $ic57$ = makeSymbol("PROGN");
        $ic58$ = makeSymbol("DO-ASSERTIONS");
        $ic59$ = makeSymbol("S#14118", "CYC");
        $ic60$ = makeSymbol("S#15043", "CYC");
        $ic61$ = makeSymbol("S#15044", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13916", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#15041", "CYC")), (SubLObject)makeSymbol("S#15045", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic63$ = makeUninternedSymbol("US#23704");
        $ic64$ = makeSymbol("S#14988", "CYC");
        $ic65$ = makeSymbol("S#14989", "CYC");
        $ic66$ = makeSymbol("S#14990", "CYC");
        $ic67$ = makeSymbol("S#14991", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15046", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic69$ = makeUninternedSymbol("US#74E0897");
        $ic70$ = makeUninternedSymbol("US#34E22DC");
        $ic71$ = makeUninternedSymbol("US#6DC37F1");
        $ic72$ = makeSymbol("S#14119", "CYC");
        $ic73$ = makeSymbol("CDOLIST");
        $ic74$ = makeSymbol("S#15047", "CYC");
        $ic75$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15048", "CYC"), (SubLObject)makeSymbol("S#13916", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeSymbol("S#15041", "CYC")), (SubLObject)makeSymbol("S#15049", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic76$ = makeUninternedSymbol("US#3194CEC");
        $ic77$ = makeUninternedSymbol("US#23704");
        $ic78$ = makeSymbol("S#14996", "CYC");
        $ic79$ = makeSymbol("S#14995", "CYC");
        $ic80$ = makeSymbol("S#14987", "CYC");
        $ic81$ = makeSymbol("S#14992", "CYC");
        $ic82$ = makeSymbol("S#14717", "CYC");
        $ic83$ = makeSymbol("CNF-P");
        $ic84$ = makeSymbol("LISTP");
        $ic85$ = makeSymbol("S#14999", "CYC");
        $ic86$ = makeSymbol("S#15002", "CYC");
        $ic87$ = makeSymbol("S#15004", "CYC");
        $ic88$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#15022", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-SET"))));
        $ic89$ = makeString("Unexpected HL storage action ~a");
        $ic90$ = makeSymbol("S#15024", "CYC");
        $ic91$ = makeKeyword("UNSPECIFIED");
        $ic92$ = makeKeyword("FORWARD");
        $ic93$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic94$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic95$ = ConsesLow.list((SubLObject)makeSymbol("S#15050", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#15051", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 503 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/