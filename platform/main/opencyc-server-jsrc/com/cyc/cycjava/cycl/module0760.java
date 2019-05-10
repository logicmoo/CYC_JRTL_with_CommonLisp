package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0760 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0760";
    public static final String myFingerPrint = "dbabb7cbe58b0a1e5f8c1e559d9da1cbc3623fae9fa7b21e914a492cadd8f7af";
    public static SubLSymbol $g6093$;
    public static SubLSymbol $g6094$;
    public static SubLSymbol $g6095$;
    private static SubLSymbol $g6096$;
    private static SubLSymbol $g6097$;
    private static SubLSymbol $g6098$;
    public static SubLSymbol $g6099$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLFloat $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLString $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    
    public static SubLObject f48073(final SubLObject var1) {
        return module0756.f47497(var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48074(SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        SubLObject var4 = var3;
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            assert NIL != module0759.f48038(var5) : var5;
            var4 = var4.rest();
            var5 = var4.first();
        }
        final SubLObject var6 = module0749.f46494((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var2) {
            f48075(var6, var2);
        }
        module0756.f47507(var6, var3, (SubLObject)UNPROVIDED);
        return var6;
    }
    
    public static SubLObject f48076(final SubLObject var7, SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (NIL == var8) {
            var8 = f48074((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var7.equalp(var8)) {
            return var8;
        }
        if (NIL != module0756.f47516(var7)) {
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var7).isVector()) {
                final SubLObject var11 = module0743.f45996(var7);
                final SubLObject var12 = (SubLObject)NIL;
                SubLObject var13;
                SubLObject var14;
                SubLObject var15;
                SubLObject var16;
                SubLObject var17;
                for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                    var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                    var16 = Vectors.aref(var11, var15);
                    var17 = ((NIL != module0759.f48038(var16)) ? module0759.f48043(var16, (SubLObject)UNPROVIDED) : var16);
                    var9 = (SubLObject)ConsesLow.cons(var17, var9);
                    var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
                }
            }
            module0756.f47507(var8, Sequences.nreverse(var9), (SubLObject)UNPROVIDED);
        }
        else {
            module0756.f47820(var8, (SubLObject)NIL);
        }
        f48075(var8, f48077(var7));
        return var8;
    }
    
    public static SubLObject f48078(final SubLObject var18, final SubLObject var19) {
        final SubLObject var20 = Mapping.mapcar((SubLObject)$ic1$, var19);
        return f48079(var18, var20);
    }
    
    public static SubLObject f48080(final SubLObject var18, final SubLObject var21, SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var25) {
        if (var22 == UNPROVIDED) {
            var22 = module0579.$g4260$.getDynamicValue();
        }
        if (var23 == UNPROVIDED) {
            var23 = module0579.$g4262$.getDynamicValue();
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)$ic2$;
        }
        if (var25 == UNPROVIDED) {
            var25 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var26 = f48079(var18, var21);
        f48081(var26, var22, var23, var24);
        f48082(var26, var25);
        return var26;
    }
    
    public static SubLObject f48079(final SubLObject var18, final SubLObject var21) {
        final SubLObject var22 = f48083(var21);
        final SubLObject var23 = (SubLObject)NIL;
        return f48076(f48074(var18, Sequences.nreverse(var23)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48084() {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        return $g6093$.getDynamicValue(var27);
    }
    
    public static SubLObject f48085(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        $g6095$.setDynamicValue(module0035.f2084(var28, $g6095$.getDynamicValue(var29)), var29);
        return $g6095$.getDynamicValue(var29);
    }
    
    public static SubLObject f48086(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        assert NIL != Types.listp($g6096$.getDynamicValue(var17)) : $g6096$.getDynamicValue(var17);
        var17.resetMultipleValues();
        SubLObject var18 = module0035.f2293($g6096$.getDynamicValue(var17), var16, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)NIL);
        final SubLObject var19 = var17.secondMultipleValue();
        var17.resetMultipleValues();
        if (NIL == var19) {
            var18 = f48087(var16);
            f48088(var16, var18);
        }
        return var18;
    }
    
    public static SubLObject f48088(final SubLObject var16, SubLObject var29) {
        if (var29 == UNPROVIDED) {
            var29 = f48087(var16);
        }
        final SubLThread var30 = SubLProcess.currentSubLThread();
        assert NIL != Types.listp($g6096$.getDynamicValue(var30)) : $g6096$.getDynamicValue(var30);
        $g6096$.setDynamicValue(module0035.f2063($g6096$.getDynamicValue(var30), var16, var29, (SubLObject)UNPROVIDED), var30);
        return var29;
    }
    
    public static SubLObject f48089(final SubLObject var16, final SubLObject var31, final SubLObject var23) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        if (NIL != $g6094$.getDynamicValue(var32) && var31.isString()) {
            SubLObject var34 = (SubLObject)NIL;
            SubLObject var35 = f48086(var16);
            SubLObject var36 = module0048.f_1X(Sequences.length($g6095$.getDynamicValue(var32)));
            if (NIL != assertion_handles_oc.f11035(var16)) {
                SubLObject var37 = module0775.f49876(var16, var23);
                SubLObject var38 = (SubLObject)NIL;
                var38 = var37.first();
                while (NIL != var37) {
                    final SubLObject var39 = var38;
                    if (NIL == conses_high.member(var39, var35, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var35 = (SubLObject)ConsesLow.cons(var39, var35);
                    }
                    var37 = var37.rest();
                    var38 = var37.first();
                }
            }
            SubLObject var37 = var35;
            SubLObject var40 = (SubLObject)NIL;
            var40 = var37.first();
            while (NIL != var37) {
                final SubLObject var41 = Sequences.position(var40, $g6095$.getDynamicValue(var32), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var42 = (SubLObject)NIL;
                if (NIL != var41) {
                    var42 = module0048.f_1X(var41);
                }
                else {
                    var42 = var36;
                    f48085(var40);
                    var36 = Numbers.add(var36, (SubLObject)ONE_INTEGER);
                }
                var34 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var42, var40), var34);
                var37 = var37.rest();
                var40 = var37.first();
            }
            if (NIL != var34) {
                var33 = f48090(var31, var34);
            }
        }
        return (NIL != var33) ? var33 : var31;
    }
    
    public static SubLObject f48090(final SubLObject var31, final SubLObject var33) {
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = var31;
        while (NIL == var35) {
            if (NIL != module0038.f2673(var36, module0015.$g265$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUALP))) {
                var34 = (SubLObject)ConsesLow.cons(module0015.$g265$.getGlobalValue(), var34);
                var36 = module0038.f2621(var36, module0015.$g265$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUALP));
            }
            else if (NIL != module0038.f2673(var36, module0015.$g276$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUALP))) {
                var34 = (SubLObject)ConsesLow.cons(module0015.$g276$.getGlobalValue(), var34);
                var36 = module0038.f2621(var36, module0015.$g276$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUALP));
            }
            else {
                var35 = (SubLObject)T;
            }
        }
        var36 = Sequences.cconcatenate(var36, module0769.f49023(var33));
        SubLObject var37 = var34;
        SubLObject var38 = (SubLObject)NIL;
        var38 = var37.first();
        while (NIL != var37) {
            var36 = Sequences.cconcatenate(var36, var38);
            var37 = var37.rest();
            var38 = var37.first();
        }
        return var36;
    }
    
    public static SubLObject f48083(final SubLObject var20) {
        final SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = (SubLObject)NIL;
        final SubLObject var25 = (SubLObject)NIL;
        if (NIL == var21) {
            return var20;
        }
        return Sequences.nreverse(var21);
    }
    
    public static SubLObject f48091(final SubLObject var20) {
        return module0213.f13926(var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48092(final SubLObject var47) {
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = (SubLObject)NIL;
        if (NIL == var48) {
            SubLObject var51 = var47;
            SubLObject var52 = (SubLObject)NIL;
            var52 = var51.first();
            while (NIL == var48 && NIL != var51) {
                if (NIL != var49) {
                    final SubLObject var53 = f48093(var52);
                    var48 = (SubLObject)makeBoolean(!var53.equal(var49) || (NIL != module0259.f16891(var49, $ic4$) && !var50.equal(f48094(var52, (SubLObject)ONE_INTEGER))));
                }
                else {
                    var49 = f48093(var52);
                    var50 = f48094(var52, (SubLObject)ONE_INTEGER);
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var48);
    }
    
    public static SubLObject f48093(final SubLObject var16) {
        return f48094(var16, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f48094(SubLObject var16, final SubLObject var53) {
        var16 = Functions.funcall((SubLObject)makeSymbol("S#52545", "CYC"), var16);
        return (NIL != module0202.f12883(var16, (SubLObject)UNPROVIDED)) ? f48094(module0205.f13204(var16, (SubLObject)UNPROVIDED), var53) : module0205.f13134(var16, var53, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48095(final SubLObject var16) {
        final SubLObject var17 = module0205.f13132(var16);
        final SubLObject var18 = module0205.f13180(var16, (SubLObject)$ic5$);
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        var19 = var18;
        var20 = var19.first();
        for (var21 = (SubLObject)ZERO_INTEGER; NIL != var19; var19 = var19.rest(), var20 = var19.first(), var21 = module0048.f_1X(var21)) {
            if (NIL != module0206.f13453(var20) && module0205.f13276(var20).equal(f48096(var17, var21))) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48097(final SubLObject var43, final SubLObject var44, final SubLObject var45) {
        if (NIL == var45) {
            return var43;
        }
        final SubLObject var46 = module0205.f13132(var43);
        final SubLObject var47 = f48096(var46, var44);
        if (NIL != var47) {
            final SubLObject var48 = module0205.f13134(var43, var44, (SubLObject)UNPROVIDED);
            SubLObject var49 = (SubLObject)ConsesLow.list(var48);
            final SubLObject var50 = f48086(var43);
            SubLObject var51 = var45;
            SubLObject var52 = (SubLObject)NIL;
            var52 = var51.first();
            while (NIL != var51) {
                if (NIL != module0202.f12589(var52, var47)) {
                    final SubLObject var53 = module0205.f13207(var52, (SubLObject)UNPROVIDED);
                    if (var53.isVector()) {
                        final SubLObject var54 = var53;
                        final SubLObject var55 = (SubLObject)NIL;
                        SubLObject var56;
                        SubLObject var57;
                        SubLObject var58;
                        SubLObject var60;
                        SubLObject var59;
                        for (var56 = Sequences.length(var54), var57 = (SubLObject)NIL, var57 = (SubLObject)ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER)) {
                            var58 = ((NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)ONE_INTEGER) : var57);
                            var59 = (var60 = Vectors.aref(var54, var58));
                            if (NIL == conses_high.member(var60, var49, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var49 = (SubLObject)ConsesLow.cons(var60, var49);
                            }
                        }
                    }
                    else {
                        SubLObject var4_63 = var53;
                        SubLObject var61 = (SubLObject)NIL;
                        var61 = var4_63.first();
                        while (NIL != var4_63) {
                            final SubLObject var62 = var61;
                            if (NIL == conses_high.member(var62, var49, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var49 = (SubLObject)ConsesLow.cons(var62, var49);
                            }
                            var4_63 = var4_63.rest();
                            var61 = var4_63.first();
                        }
                    }
                }
                else {
                    final SubLObject var63 = var52;
                    if (NIL == conses_high.member(var63, var49, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var49 = (SubLObject)ConsesLow.cons(var63, var49);
                    }
                }
                var51 = var51.rest();
                var52 = var51.first();
            }
            var49 = Sequences.nreverse(var49);
            if ($ic6$.eql(var47)) {
                var49 = f48083(var49);
            }
            final SubLObject var64 = f48098(var49);
            final SubLObject var65 = ($ic6$.eql(var47) && NIL != module0035.f1997(var64)) ? module0035.f2113(var64) : module0202.f12683(var47, var64, (SubLObject)UNPROVIDED);
            SubLObject var66 = module0202.f12817(var44, var65, var43);
            final SubLObject var67 = (NIL != module0206.f13425(var43)) ? module0767.f48930(f48099(var43, (SubLObject)UNPROVIDED)) : module0767.f48926();
            if (!var67.equal(module0767.f48926())) {
                var66 = module0202.f12782(module0751.f46998((SubLObject)ConsesLow.list($ic7$, var67)), var66);
            }
            f48088(var66, var50);
            return var66;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48098(final SubLObject var59) {
        final SubLObject var60 = f48084();
        if (NIL == var60) {
            return var59;
        }
        final SubLObject var61 = Numbers.truncate(Numbers.multiply((SubLObject)$ic8$, var60), (SubLObject)UNPROVIDED);
        final SubLObject var62 = module0035.f2002(var59, var61, (SubLObject)UNPROVIDED);
        final SubLObject var63 = (SubLObject)makeBoolean(NIL != var62 && NIL != module0035.f1995(var59, module0048.f_1X(var61), (SubLObject)UNPROVIDED));
        final SubLObject var64 = (NIL != var63) ? module0048.f_1_(var61) : var61;
        final SubLObject var65 = module0035.f2124(var64, var59);
        final SubLObject var66 = (SubLObject)((NIL != var62) ? Numbers.subtract(Sequences.length(var59), var64) : ZERO_INTEGER);
        return (NIL != var62) ? module0035.f2083(Sequences.cconcatenate(module0006.f207(var66), new SubLObject[] { $ic9$, module0006.f203(f48100(var59)) }), var65) : var65;
    }
    
    public static SubLObject f48100(final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        final SubLObject var77 = f48101(var75, module0579.$g4262$.getDynamicValue(var76));
        if (NIL != var77) {
            return Sequences.cconcatenate((SubLObject)$ic10$, module0770.f49049(var77, (SubLObject)ConsesLow.list($ic11$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)$ic12$;
    }
    
    public static SubLObject f48101(final SubLObject var75, final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        SubLObject var79 = (SubLObject)NIL;
        final SubLObject var80 = module0147.f9540(var77);
        final SubLObject var81 = module0147.$g2095$.currentBinding(var78);
        final SubLObject var82 = module0147.$g2094$.currentBinding(var78);
        final SubLObject var83 = module0147.$g2096$.currentBinding(var78);
        try {
            module0147.$g2095$.bind(module0147.f9545(var80), var78);
            module0147.$g2094$.bind(module0147.f9546(var80), var78);
            module0147.$g2096$.bind(module0147.f9549(var80), var78);
            if (NIL != module0035.f2370((SubLObject)$ic13$, var75, (SubLObject)UNPROVIDED)) {
                var79 = module0259.f16929(var75, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0035.f2370((SubLObject)$ic14$, var75, (SubLObject)UNPROVIDED)) {
                var79 = Mapping.mapcar((SubLObject)$ic15$, module0256.f16636(Mapping.mapcar((SubLObject)$ic16$, var75), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
            else if (NIL != module0035.f2370((SubLObject)$ic17$, var75, (SubLObject)UNPROVIDED)) {
                var79 = module0256.f16636(var75, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0147.$g2096$.rebind(var83, var78);
            module0147.$g2094$.rebind(var82, var78);
            module0147.$g2095$.rebind(var81, var78);
        }
        if (NIL == var79) {
            return (SubLObject)NIL;
        }
        return module0751.f46994(module0751.f46895(var79).first(), var77, (SubLObject)NIL);
    }
    
    public static SubLObject f48096(final SubLObject var49, final SubLObject var44) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        final SubLObject var51 = module0035.f2294($g6097$.getGlobalValue(), var49, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)NIL);
        SubLObject var52 = (SubLObject)NIL;
        if (NIL == var52) {
            SubLObject var53 = var51;
            SubLObject var54 = (SubLObject)NIL;
            var54 = var53.first();
            while (NIL == var52 && NIL != var53) {
                SubLObject var56;
                final SubLObject var55 = var56 = var54;
                SubLObject var57 = (SubLObject)NIL;
                SubLObject var58 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic20$);
                var57 = var56.first();
                var56 = var56.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic20$);
                var58 = var56.first();
                var56 = var56.rest();
                if (NIL == var56) {
                    if (var57 == $ic21$ || var57.eql(var44)) {
                        var52 = var58;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)$ic20$);
                }
                var53 = var53.rest();
                var54 = var53.first();
            }
        }
        if (NIL != $g6099$.getDynamicValue(var50) && NIL == var52) {
            final SubLObject var59 = module0035.f2294($g6098$.getGlobalValue(), var49, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)NIL);
            if (!var59.eql((SubLObject)$ic21$)) {
                if (NIL == conses_high.member(var44, var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    if (var44.isInteger() && NIL != module0004.f104($ic22$, module0226.f14895(var49, var44, (SubLObject)UNPROVIDED), (SubLObject)$ic23$, (SubLObject)UNPROVIDED)) {
                        var52 = $ic6$;
                    }
                    else {
                        var52 = $ic24$;
                    }
                }
            }
        }
        return var52;
    }
    
    public static SubLObject f48102(final SubLObject var43, final SubLObject var90) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f48103(var90, var43, (SubLObject)NIL));
    }
    
    public static SubLObject f48104(final SubLObject var60) {
        final SubLObject var61 = (SubLObject)((NIL != module0173.f10955(var60)) ? Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)TWO_INTEGER), module0745.f46259(var60, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL);
        return (SubLObject)((NIL != var61) ? var61 : ZERO_INTEGER);
    }
    
    public static SubLObject f48103(final SubLObject var90, final SubLObject var43, SubLObject var44) {
        SubLObject var91 = (SubLObject)NIL;
        if (NIL != module0206.f13486(var90) && NIL != module0206.f13486(var43) && NIL != module0202.f12736(var90, var43, (SubLObject)UNPROVIDED) && NIL != f48105(var90, var43) && NIL != f48106(var90, var43)) {
            SubLObject var92 = (SubLObject)NIL;
            final SubLObject var93 = module0205.f13180(var90, (SubLObject)$ic5$);
            SubLObject var94 = (SubLObject)NIL;
            SubLObject var95 = (SubLObject)NIL;
            SubLObject var96 = (SubLObject)NIL;
            var94 = var93;
            var95 = var94.first();
            for (var96 = (SubLObject)ZERO_INTEGER; NIL == var92 && NIL != var94; var94 = var94.rest(), var95 = var94.first(), var96 = module0048.f_1X(var96)) {
                final SubLObject var97 = f48104(var95);
                final SubLObject var98 = module0205.f13134(var43, var96, (SubLObject)UNPROVIDED);
                final SubLObject var99 = f48104(var98);
                if (var96.eql(var44)) {
                    if (NIL != module0579.f35496(module0048.f_1X(var97), (SubLObject)UNPROVIDED)) {
                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                            Errors.warn((SubLObject)$ic25$, var97, var95);
                        }
                        var92 = (SubLObject)T;
                    }
                    if (NIL != module0579.f35496(module0048.f_1X(var99), (SubLObject)UNPROVIDED)) {
                        if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                            Errors.warn((SubLObject)$ic25$, var99, var98);
                        }
                        var92 = (SubLObject)T;
                    }
                }
                else if (!module0205.f13134(var43, var96, (SubLObject)UNPROVIDED).equal(var95)) {
                    if (NIL == var44 && var96.isPositive() && NIL == module0269.f17716(var95) && NIL == module0579.f35496(module0048.f_1X(var97), (SubLObject)UNPROVIDED) && NIL == module0579.f35496(module0048.f_1X(var99), (SubLObject)UNPROVIDED)) {
                        var44 = var96;
                    }
                    else {
                        var92 = (SubLObject)T;
                    }
                }
            }
            if (NIL == var92 && NIL == f48096(module0205.f13132(var90), var44)) {
                var92 = (SubLObject)T;
            }
            var91 = (SubLObject)makeBoolean(NIL == var92);
        }
        return Values.values(var91, var44);
    }
    
    public static SubLObject f48105(final SubLObject var96, final SubLObject var97) {
        return Equality.equal(module0767.f48930(f48099(var96, $ic26$)), module0767.f48930(f48099(var97, $ic26$)));
    }
    
    public static SubLObject f48099(final SubLObject var16, SubLObject var98) {
        if (var98 == UNPROVIDED) {
            var98 = (SubLObject)NIL;
        }
        if (NIL != assertion_handles_oc.f11035(var16)) {
            return module0178.f11287(var16);
        }
        if (NIL != module0202.f12883(var16, (SubLObject)UNPROVIDED)) {
            return module0205.f13203(var16, (SubLObject)UNPROVIDED);
        }
        return var98;
    }
    
    public static SubLObject f48106(final SubLObject var96, final SubLObject var97) {
        return module0035.f2201(f48087(var96), f48087(var97), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48087(final SubLObject var16) {
        if (NIL != assertion_handles_oc.f11035(var16)) {
            return module0775.f49703(var16);
        }
        if (NIL != module0202.f12883(var16, (SubLObject)UNPROVIDED)) {
            return module0775.f49868(module0205.f13203(var16, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48075(final SubLObject var6, final SubLObject var2) {
        return module0749.f46424(var6, (SubLObject)$ic27$, var2);
    }
    
    public static SubLObject f48077(final SubLObject var6) {
        return module0749.f46418(var6, (SubLObject)$ic27$, module0756.f47746());
    }
    
    public static SubLObject f48107(final SubLObject var6) {
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var6).isVector()) {
            final SubLObject var9 = module0743.f45996(var6);
            final SubLObject var10 = (SubLObject)NIL;
            SubLObject var11;
            SubLObject var12;
            SubLObject var13;
            SubLObject var14;
            for (var11 = Sequences.length(var9), var12 = (SubLObject)NIL, var12 = (SubLObject)ZERO_INTEGER; var12.numL(var11); var12 = Numbers.add(var12, (SubLObject)ONE_INTEGER)) {
                var13 = ((NIL != var10) ? Numbers.subtract(var11, var12, (SubLObject)ONE_INTEGER) : var12);
                var14 = Vectors.aref(var9, var13);
                if (NIL == module0759.f48060(var14)) {
                    var7 = (SubLObject)T;
                }
                var8 = Numbers.add(var8, (SubLObject)ONE_INTEGER);
            }
        }
        return (SubLObject)makeBoolean(NIL == var7);
    }
    
    public static SubLObject f48108(final SubLObject var6) {
        return module0756.f47627(var6);
    }
    
    public static SubLObject f48109(final SubLObject var6, final SubLObject var16) {
        return module0756.f47841(var6, var16);
    }
    
    public static SubLObject f48081(final SubLObject var6, SubLObject var22, SubLObject var23, SubLObject var24) {
        if (var22 == UNPROVIDED) {
            var22 = module0579.$g4260$.getDynamicValue();
        }
        if (var23 == UNPROVIDED) {
            var23 = module0579.$g4262$.getDynamicValue();
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)$ic2$;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = Numbers.numL(module0579.$g4239$.getDynamicValue(var25), (SubLObject)ONE_INTEGER);
        final SubLObject var27 = f48077(var6);
        if (NIL != module0580.f35574()) {
            module0755.f47388();
            SubLObject var28 = (SubLObject)ZERO_INTEGER;
            if (module0743.f45996(var6).isVector()) {
                final SubLObject var29 = module0743.f45996(var6);
                final SubLObject var30 = (SubLObject)NIL;
                SubLObject var31;
                SubLObject var32;
                SubLObject var33;
                SubLObject var34;
                for (var31 = Sequences.length(var29), var32 = (SubLObject)NIL, var32 = (SubLObject)ZERO_INTEGER; var32.numL(var31); var32 = Numbers.add(var32, (SubLObject)ONE_INTEGER)) {
                    var33 = ((NIL != var30) ? Numbers.subtract(var31, var32, (SubLObject)ONE_INTEGER) : var32);
                    var34 = Vectors.aref(var29, var33);
                    if (NIL != module0756.f47694(var27) && NIL != module0756.f47476(module0759.f48058(var34))) {
                        module0759.f48057(var34, var27);
                    }
                    module0759.f48066(var34, var22, var23, var24);
                    if (NIL != var26 && NIL == module0038.f2668(module0765.f48537((SubLObject)UNPROVIDED), module0759.f48054(var34, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        module0759.f48044(var34, (SubLObject)ConsesLow.cons(module0765.f48531(), module0035.f2083(module0765.f48532(), module0759.f48045(var34))));
                    }
                    var28 = Numbers.add(var28, (SubLObject)ONE_INTEGER);
                }
            }
        }
        else {
            final SubLObject var35 = module0579.$g4321$.currentBinding(var25);
            try {
                module0579.$g4321$.bind(module0755.f47380(), var25);
                module0580.f35572();
                try {
                    module0755.f47388();
                    SubLObject var36 = (SubLObject)ZERO_INTEGER;
                    if (module0743.f45996(var6).isVector()) {
                        final SubLObject var37 = module0743.f45996(var6);
                        final SubLObject var38 = (SubLObject)NIL;
                        SubLObject var39;
                        SubLObject var40;
                        SubLObject var41;
                        SubLObject var42;
                        for (var39 = Sequences.length(var37), var40 = (SubLObject)NIL, var40 = (SubLObject)ZERO_INTEGER; var40.numL(var39); var40 = Numbers.add(var40, (SubLObject)ONE_INTEGER)) {
                            var41 = ((NIL != var38) ? Numbers.subtract(var39, var40, (SubLObject)ONE_INTEGER) : var40);
                            var42 = Vectors.aref(var37, var41);
                            if (NIL != module0756.f47694(var27) && NIL != module0756.f47476(module0759.f48058(var42))) {
                                module0759.f48057(var42, var27);
                            }
                            module0759.f48066(var42, var22, var23, var24);
                            if (NIL != var26 && NIL == module0038.f2668(module0765.f48537((SubLObject)UNPROVIDED), module0759.f48054(var42, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                module0759.f48044(var42, (SubLObject)ConsesLow.cons(module0765.f48531(), module0035.f2083(module0765.f48532(), module0759.f48045(var42))));
                            }
                            var36 = Numbers.add(var36, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    final SubLObject var80_103 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                        module0580.f35573();
                        module0580.f35575();
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var80_103, var25);
                    }
                }
            }
            finally {
                module0579.$g4321$.rebind(var35, var25);
            }
        }
        if (NIL != var26) {
            final SubLObject var43 = module0756.f47590(var6, (SubLObject)ZERO_INTEGER);
            module0759.f48044(var43, (SubLObject)ConsesLow.cons(module0765.f48535((SubLObject)UNPROVIDED), module0759.f48045(var43)));
            final SubLObject var44 = module0759.f48039((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0759.f48044(var44, (SubLObject)ConsesLow.list(module0765.f48536((SubLObject)UNPROVIDED)));
            module0756.f47608(var44);
            module0756.f47836(var44, var6);
        }
        return var6;
    }
    
    public static SubLObject f48110(final SubLObject var6) {
        SubLObject var7 = module0107.f7627();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var6).isVector()) {
            final SubLObject var10 = module0743.f45996(var6);
            final SubLObject var11 = (SubLObject)NIL;
            SubLObject var12;
            SubLObject var13;
            SubLObject var14;
            SubLObject var15;
            for (var12 = Sequences.length(var10), var13 = (SubLObject)NIL, var13 = (SubLObject)ZERO_INTEGER; var13.numL(var12); var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER)) {
                var14 = ((NIL != var11) ? Numbers.subtract(var12, var13, (SubLObject)ONE_INTEGER) : var13);
                var15 = Vectors.aref(var10, var14);
                if (NIL != module0107.f7629(var7) && NIL != module0759.f48064(var7, var15)) {
                    module0759.f48068(var7, var15);
                    module0759.f48041(var7, module0276.f18287((SubLObject)ConsesLow.list(module0759.f48046(var7), module0759.f48046(var15)), (SubLObject)T));
                    var8 = (SubLObject)ConsesLow.cons(var15, var8);
                }
                else {
                    var7 = var15;
                }
                var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
            }
        }
        SubLObject var16 = var8;
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            module0756.f47841(var6, var17);
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var6;
    }
    
    public static SubLObject f48111(final SubLObject var6, SubLObject var109) {
        if (var109 == UNPROVIDED) {
            var109 = (SubLObject)NIL;
        }
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (NIL != var109) {
            module0642.f39020(module0015.$g199$.getGlobalValue());
            f48082(var6, module0015.$g131$.getDynamicValue(var110));
            module0642.f39020(module0015.$g200$.getGlobalValue());
        }
        else {
            f48082(var6, module0015.$g131$.getDynamicValue(var110));
        }
        return var6;
    }
    
    public static SubLObject f48082(final SubLObject var6, SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var26 = module0756.f47588(var6);
        SubLObject var27 = (SubLObject)ZERO_INTEGER;
        if (module0743.f45996(var6).isVector()) {
            final SubLObject var28 = module0743.f45996(var6);
            final SubLObject var29 = (SubLObject)NIL;
            SubLObject var30;
            SubLObject var31;
            SubLObject var32;
            SubLObject var33;
            SubLObject var34;
            for (var30 = Sequences.length(var28), var31 = (SubLObject)NIL, var31 = (SubLObject)ZERO_INTEGER; var31.numL(var30); var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER)) {
                var32 = ((NIL != var29) ? Numbers.subtract(var30, var31, (SubLObject)ONE_INTEGER) : var31);
                var33 = Vectors.aref(var28, var32);
                var34 = module0759.f48054(var33, (SubLObject)T);
                print_high.princ(module0581.f35681(var34, (SubLObject)UNPROVIDED), var25);
                if (var26.numG(module0048.f_1X(var27))) {
                    print_high.princ((SubLObject)$ic9$, var25);
                }
                var27 = Numbers.add(var27, (SubLObject)ONE_INTEGER);
            }
        }
        return var6;
    }
    
    public static SubLObject f48112(final SubLObject var112, final SubLObject var113, SubLObject var22, SubLObject var23, SubLObject var24) {
        if (var22 == UNPROVIDED) {
            var22 = module0579.$g4260$.getDynamicValue();
        }
        if (var23 == UNPROVIDED) {
            var23 = module0579.$g4262$.getDynamicValue();
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)$ic2$;
        }
        final SubLObject var114 = f48113(var112, var113);
        f48081(var114, var22, var23, var24);
        f48082(var114, (SubLObject)UNPROVIDED);
        return var112;
    }
    
    public static SubLObject f48113(final SubLObject var112, final SubLObject var114) {
        final SubLObject var115 = Mapping.mapcar((SubLObject)$ic28$, var114);
        final SubLObject var116 = Mapping.mapcar((SubLObject)$ic29$, f48083(var115));
        SubLObject var117 = (SubLObject)NIL;
        SubLObject var118 = var116;
        SubLObject var119 = (SubLObject)NIL;
        var119 = var118.first();
        while (NIL != var118) {
            var117 = (SubLObject)ConsesLow.cons(module0759.f48043(module0759.f48039(var119, (SubLObject)$ic30$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), var117);
            var118 = var118.rest();
            var119 = var118.first();
        }
        final SubLObject var120 = module0202.f12643($ic31$, var112);
        final SubLObject var121 = module0759.f48039(var120, (SubLObject)$ic30$, (SubLObject)UNPROVIDED);
        var117 = (SubLObject)ConsesLow.cons(var121, var117);
        return f48076(f48074(var112, Sequences.nreverse(var117)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f48114(final SubLObject var60, final SubLObject var120, SubLObject var22, SubLObject var23, SubLObject var24, SubLObject var121) {
        if (var22 == UNPROVIDED) {
            var22 = module0579.$g4260$.getDynamicValue();
        }
        if (var23 == UNPROVIDED) {
            var23 = module0579.$g4262$.getDynamicValue();
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)$ic2$;
        }
        if (var121 == UNPROVIDED) {
            var121 = (SubLObject)T;
        }
        final SubLThread var122 = SubLProcess.currentSubLThread();
        assert NIL != Types.listp(var120) : var120;
        assert NIL != module0161.f10481(var22) : var22;
        assert NIL != module0161.f10481(var23) : var23;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var122) && NIL == module0035.f2002(var120, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic33$);
        }
        SubLObject var123 = (SubLObject)NIL;
        SubLObject var124 = (SubLObject)NIL;
        SubLObject var125 = (SubLObject)NIL;
        final SubLObject var126 = $g6096$.currentBinding(var122);
        try {
            $g6096$.bind((SubLObject)($g6096$.getDynamicValue(var122).isList() ? $g6096$.getDynamicValue(var122) : NIL), var122);
            final SubLObject var127 = f48083(conses_high.copy_list(var120));
            if (var24 == $ic34$ && NIL != module0035.f2002(var127, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) && NIL != f48092(var127)) {
                var122.resetMultipleValues();
                final SubLObject var126_127 = f48115(var60, var127, var22, var23);
                final SubLObject var128_129 = var122.secondMultipleValue();
                var122.resetMultipleValues();
                var123 = var126_127;
                var125 = var128_129;
            }
            else {
                var122.resetMultipleValues();
                final SubLObject var130_131 = f48116(var60, var127, var22, var23, var24, var121);
                final SubLObject var132_133 = var122.secondMultipleValue();
                final SubLObject var134_135 = var122.thirdMultipleValue();
                var122.resetMultipleValues();
                var123 = var130_131;
                var124 = var132_133;
                var125 = var134_135;
            }
        }
        finally {
            $g6096$.rebind(var126, var122);
        }
        return Values.values(var123, var124, var125);
    }
    
    public static SubLObject f48115(final SubLObject var60, final SubLObject var125, final SubLObject var22, final SubLObject var23) {
        SubLObject var126 = (SubLObject)NIL;
        final SubLObject var127 = f48084();
        final SubLObject var128 = (SubLObject)ZERO_INTEGER;
        final SubLObject var129 = (SubLObject)NIL;
        SubLObject var130 = (SubLObject)NIL;
        if (NIL != var129) {
            SubLObject var131 = Numbers.subtract(Sequences.length(var125), var128);
            if (var131.isPositive()) {
                if (ONE_INTEGER.eql(var131)) {
                    var126 = var126.rest();
                    var131 = Numbers.add(var131, (SubLObject)ONE_INTEGER);
                }
                final SubLObject var122_138 = Sequences.cconcatenate((SubLObject)$ic35$, new SubLObject[] { module0006.f205(var131), $ic36$ });
                var126 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)NIL, var122_138), var126);
            }
        }
        if (NIL != var126) {
            var126 = Sequences.nreverse(var126);
            var130 = f48117(module0035.f2319(var126));
        }
        return Values.values(var130, var126);
    }
    
    public static SubLObject f48117(final SubLObject var139) {
        final SubLThread var140 = SubLProcess.currentSubLThread();
        SubLObject var141 = (SubLObject)NIL;
        SubLObject var142 = (SubLObject)NIL;
        try {
            var142 = streams_high.make_private_string_output_stream();
            final SubLObject var143 = module0015.$g131$.currentBinding(var140);
            try {
                module0015.$g131$.bind(var142, var140);
                module0642.f39020(module0015.$g264$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var80_141 = module0015.$g533$.currentBinding(var140);
                try {
                    module0015.$g533$.bind((SubLObject)T, var140);
                    SubLObject var144 = var139;
                    SubLObject var145 = (SubLObject)NIL;
                    var145 = var144.first();
                    while (NIL != var144) {
                        module0642.f39020(module0015.$g275$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var80_142 = module0015.$g533$.currentBinding(var140);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var140);
                            module0642.f39020(var145);
                        }
                        finally {
                            module0015.$g533$.rebind(var80_142, var140);
                        }
                        module0642.f39020(module0015.$g276$.getGlobalValue());
                        var144 = var144.rest();
                        var145 = var144.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var80_141, var140);
                }
                module0642.f39020(module0015.$g265$.getGlobalValue());
            }
            finally {
                module0015.$g131$.rebind(var143, var140);
            }
            var141 = streams_high.get_output_stream_string(var142);
        }
        finally {
            final SubLObject var146 = Threads.$is_thread_performing_cleanupP$.currentBinding(var140);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var140);
                streams_high.close(var142, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var146, var140);
            }
        }
        return var141;
    }
    
    public static SubLObject f48116(final SubLObject var60, final SubLObject var125, final SubLObject var22, final SubLObject var23, final SubLObject var24, final SubLObject var121) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        SubLObject var127 = (SubLObject)NIL;
        SubLObject var128 = (SubLObject)NIL;
        SubLObject var129 = (SubLObject)NIL;
        final SubLObject var130 = module0580.$g4363$.currentBinding(var126);
        final SubLObject var131 = module0580.$g4366$.currentBinding(var126);
        final SubLObject var132 = module0580.$g4364$.currentBinding(var126);
        try {
            module0580.$g4363$.bind(module0054.f3968(), var126);
            module0580.$g4366$.bind(module0580.f35568(), var126);
            module0580.$g4364$.bind((SubLObject)T, var126);
            try {
                final SubLObject var133 = f48079(var60, var125);
                final SubLObject var134 = module0756.f47590(var133, (SubLObject)ZERO_INTEGER);
                SubLObject var135 = (SubLObject)NIL;
                final SubLObject var80_145 = Errors.$continue_cerrorP$.currentBinding(var126);
                final SubLObject var81_146 = module0578.$g4234$.currentBinding(var126);
                try {
                    Errors.$continue_cerrorP$.bind((SubLObject)NIL, var126);
                    module0578.$g4234$.bind((SubLObject)T, var126);
                    if (NIL != module0578.f35473()) {
                        final SubLObject var80_146 = module0579.$g4238$.currentBinding(var126);
                        try {
                            module0579.$g4238$.bind((SubLObject)NIL, var126);
                            f48081(var133, var22, var23, var24);
                        }
                        finally {
                            module0579.$g4238$.rebind(var80_146, var126);
                        }
                        if (NIL != var121) {
                            f48118(var60, var134);
                        }
                        f48110(var133);
                        SubLObject var136 = (SubLObject)NIL;
                        SubLObject var137 = (SubLObject)NIL;
                        SubLObject var138 = (SubLObject)NIL;
                        SubLObject var139 = (SubLObject)ZERO_INTEGER;
                        if (module0743.f45996(var133).isVector()) {
                            final SubLObject var140 = module0743.f45996(var133);
                            final SubLObject var141 = (SubLObject)NIL;
                            SubLObject var142;
                            SubLObject var143;
                            SubLObject var144;
                            SubLObject var145;
                            SubLObject var146;
                            SubLObject var147;
                            for (var142 = Sequences.length(var140), var143 = (SubLObject)NIL, var143 = (SubLObject)ZERO_INTEGER; var143.numL(var142); var143 = Numbers.add(var143, (SubLObject)ONE_INTEGER)) {
                                var144 = ((NIL != var141) ? Numbers.subtract(var142, var143, (SubLObject)ONE_INTEGER) : var143);
                                var145 = Vectors.aref(var140, var144);
                                var146 = module0759.f48054(var145, (SubLObject)T);
                                if (NIL == module0759.f48060(var145)) {
                                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                                        Errors.warn((SubLObject)$ic37$, module0759.f48046(var145));
                                    }
                                    var147 = module0759.f48046(var145);
                                    if (NIL != module0579.f35496(module0048.f3326(), (SubLObject)UNPROVIDED) && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                                        Errors.warn((SubLObject)$ic38$, var147);
                                    }
                                    var138 = (SubLObject)ConsesLow.cons(var145, var138);
                                    var127 = (SubLObject)ConsesLow.cons(var147, var127);
                                }
                                else if (NIL != module0004.f104(var146, var136, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                                    var138 = (SubLObject)ConsesLow.cons(var145, var138);
                                }
                                else if (NIL != module0004.f104(var145, var137, (SubLObject)$ic39$, (SubLObject)UNPROVIDED)) {
                                    var138 = (SubLObject)ConsesLow.cons(var145, var138);
                                }
                                else {
                                    var136 = (SubLObject)ConsesLow.cons(var146, var136);
                                    var137 = (SubLObject)ConsesLow.cons(var145, var137);
                                }
                                var139 = Numbers.add(var139, (SubLObject)ONE_INTEGER);
                            }
                        }
                        SubLObject var148 = var138;
                        SubLObject var149 = (SubLObject)NIL;
                        var149 = var148.first();
                        while (NIL != var148) {
                            f48109(var133, var149);
                            var148 = var148.rest();
                            var149 = var148.first();
                        }
                        SubLObject var150 = (SubLObject)ZERO_INTEGER;
                        if (module0743.f45996(var133).isVector()) {
                            final SubLObject var151 = module0743.f45996(var133);
                            final SubLObject var152 = (SubLObject)NIL;
                            SubLObject var153;
                            SubLObject var154;
                            SubLObject var155;
                            SubLObject var156;
                            SubLObject var157;
                            SubLObject var158;
                            SubLObject var159;
                            SubLObject var160;
                            for (var153 = Sequences.length(var151), var154 = (SubLObject)NIL, var154 = (SubLObject)ZERO_INTEGER; var154.numL(var153); var154 = Numbers.add(var154, (SubLObject)ONE_INTEGER)) {
                                var155 = ((NIL != var152) ? Numbers.subtract(var153, var154, (SubLObject)ONE_INTEGER) : var154);
                                var156 = Vectors.aref(var151, var155);
                                var157 = (SubLObject)T;
                                var158 = module0759.f48054(var156, var157);
                                var159 = module0759.f48046(var156);
                                var160 = f48089(var159, module0581.f35681(var158, (SubLObject)UNPROVIDED), var23);
                                if (!var158.equal(var160)) {
                                    module0756.f47505(var156, var160, var157);
                                }
                                var128 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var159, var160), var128);
                                var150 = Numbers.add(var150, (SubLObject)ONE_INTEGER);
                            }
                        }
                        if (NIL != f48107(var133) || NIL == module0579.f35495()) {
                            SubLObject var161 = (SubLObject)NIL;
                            try {
                                var161 = streams_high.make_private_string_output_stream();
                                f48082(var133, var161);
                                var129 = streams_high.get_output_stream_string(var161);
                            }
                            finally {
                                final SubLObject var80_147 = Threads.$is_thread_performing_cleanupP$.currentBinding(var126);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var126);
                                    streams_high.close(var161, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var80_147, var126);
                                }
                            }
                        }
                    }
                    else {
                        try {
                            var126.throwStack.push(module0003.$g3$.getGlobalValue());
                            final SubLObject var80_148 = Errors.$error_handler$.currentBinding(var126);
                            try {
                                Errors.$error_handler$.bind((SubLObject)$ic40$, var126);
                                try {
                                    final SubLObject var80_149 = module0579.$g4238$.currentBinding(var126);
                                    try {
                                        module0579.$g4238$.bind((SubLObject)NIL, var126);
                                        f48081(var133, var22, var23, var24);
                                    }
                                    finally {
                                        module0579.$g4238$.rebind(var80_149, var126);
                                    }
                                    if (NIL != var121) {
                                        f48118(var60, var134);
                                    }
                                    f48110(var133);
                                    SubLObject var162 = (SubLObject)NIL;
                                    SubLObject var163 = (SubLObject)NIL;
                                    SubLObject var164 = (SubLObject)NIL;
                                    SubLObject var165 = (SubLObject)ZERO_INTEGER;
                                    if (module0743.f45996(var133).isVector()) {
                                        final SubLObject var166 = module0743.f45996(var133);
                                        final SubLObject var167 = (SubLObject)NIL;
                                        SubLObject var168;
                                        SubLObject var169;
                                        SubLObject var170;
                                        SubLObject var171;
                                        SubLObject var172;
                                        SubLObject var173;
                                        for (var168 = Sequences.length(var166), var169 = (SubLObject)NIL, var169 = (SubLObject)ZERO_INTEGER; var169.numL(var168); var169 = Numbers.add(var169, (SubLObject)ONE_INTEGER)) {
                                            var170 = ((NIL != var167) ? Numbers.subtract(var168, var169, (SubLObject)ONE_INTEGER) : var169);
                                            var171 = Vectors.aref(var166, var170);
                                            var172 = module0759.f48054(var171, (SubLObject)T);
                                            if (NIL == module0759.f48060(var171)) {
                                                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                                                    Errors.warn((SubLObject)$ic37$, module0759.f48046(var171));
                                                }
                                                var173 = module0759.f48046(var171);
                                                if (NIL != module0579.f35496(module0048.f3326(), (SubLObject)UNPROVIDED) && NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
                                                    Errors.warn((SubLObject)$ic38$, var173);
                                                }
                                                var164 = (SubLObject)ConsesLow.cons(var171, var164);
                                                var127 = (SubLObject)ConsesLow.cons(var173, var127);
                                            }
                                            else if (NIL != module0004.f104(var172, var162, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                                                var164 = (SubLObject)ConsesLow.cons(var171, var164);
                                            }
                                            else if (NIL != module0004.f104(var171, var163, (SubLObject)$ic39$, (SubLObject)UNPROVIDED)) {
                                                var164 = (SubLObject)ConsesLow.cons(var171, var164);
                                            }
                                            else {
                                                var162 = (SubLObject)ConsesLow.cons(var172, var162);
                                                var163 = (SubLObject)ConsesLow.cons(var171, var163);
                                            }
                                            var165 = Numbers.add(var165, (SubLObject)ONE_INTEGER);
                                        }
                                    }
                                    SubLObject var174 = var164;
                                    SubLObject var175 = (SubLObject)NIL;
                                    var175 = var174.first();
                                    while (NIL != var174) {
                                        f48109(var133, var175);
                                        var174 = var174.rest();
                                        var175 = var174.first();
                                    }
                                    SubLObject var176 = (SubLObject)ZERO_INTEGER;
                                    if (module0743.f45996(var133).isVector()) {
                                        final SubLObject var177 = module0743.f45996(var133);
                                        final SubLObject var178 = (SubLObject)NIL;
                                        SubLObject var179;
                                        SubLObject var180;
                                        SubLObject var181;
                                        SubLObject var182;
                                        SubLObject var183;
                                        SubLObject var184;
                                        SubLObject var185;
                                        SubLObject var186;
                                        for (var179 = Sequences.length(var177), var180 = (SubLObject)NIL, var180 = (SubLObject)ZERO_INTEGER; var180.numL(var179); var180 = Numbers.add(var180, (SubLObject)ONE_INTEGER)) {
                                            var181 = ((NIL != var178) ? Numbers.subtract(var179, var180, (SubLObject)ONE_INTEGER) : var180);
                                            var182 = Vectors.aref(var177, var181);
                                            var183 = (SubLObject)T;
                                            var184 = module0759.f48054(var182, var183);
                                            var185 = module0759.f48046(var182);
                                            var186 = f48089(var185, module0581.f35681(var184, (SubLObject)UNPROVIDED), var23);
                                            if (!var184.equal(var186)) {
                                                module0756.f47505(var182, var186, var183);
                                            }
                                            var128 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var185, var186), var128);
                                            var176 = Numbers.add(var176, (SubLObject)ONE_INTEGER);
                                        }
                                    }
                                    if (NIL != f48107(var133) || NIL == module0579.f35495()) {
                                        SubLObject var187 = (SubLObject)NIL;
                                        try {
                                            var187 = streams_high.make_private_string_output_stream();
                                            f48082(var133, var187);
                                            var129 = streams_high.get_output_stream_string(var187);
                                        }
                                        finally {
                                            final SubLObject var80_150 = Threads.$is_thread_performing_cleanupP$.currentBinding(var126);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var126);
                                                streams_high.close(var187, (SubLObject)UNPROVIDED);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var80_150, var126);
                                            }
                                        }
                                    }
                                }
                                catch (Throwable var188) {
                                    Errors.handleThrowable(var188, (SubLObject)NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var80_148, var126);
                            }
                        }
                        catch (Throwable var189) {
                            var135 = Errors.handleThrowable(var189, module0003.$g3$.getGlobalValue());
                        }
                        finally {
                            var126.throwStack.pop();
                        }
                        if (var135.isString() && NIL == module0578.f35477()) {
                            Errors.warn(Sequences.cconcatenate(module0752.f47234(var135), (SubLObject)$ic41$), module0579.f35508());
                        }
                    }
                }
                finally {
                    module0578.$g4234$.rebind(var81_146, var126);
                    Errors.$continue_cerrorP$.rebind(var80_145, var126);
                }
            }
            finally {
                final SubLObject var80_151 = Threads.$is_thread_performing_cleanupP$.currentBinding(var126);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var126);
                    module0580.f35566();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var80_151, var126);
                }
            }
        }
        finally {
            module0580.$g4364$.rebind(var132, var126);
            module0580.$g4366$.rebind(var131, var126);
            module0580.$g4363$.rebind(var130, var126);
        }
        return Values.values(var129, var127, Sequences.nreverse(var128));
    }
    
    public static SubLObject f48118(final SubLObject var60, final SubLObject var16) {
        final SubLObject var61 = module0756.f47467(var16);
        final SubLObject var62 = f48119(var60, var61);
        if (NIL != module0749.f46430(var62)) {
            final SubLObject var63 = f48120(var61, var62);
            module0756.f47501(var16, var63, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0578.f35470((SubLObject)ONE_INTEGER) && NIL == module0578.f35477()) {
            Errors.warn((SubLObject)$ic42$, var16);
        }
        return var16;
    }
    
    public static SubLObject f48119(final SubLObject var60, final SubLObject var162) {
        SubLObject var163 = (SubLObject)NIL;
        SubLObject var164 = (SubLObject)NIL;
        SubLObject var165 = (SubLObject)NIL;
        if (NIL == var165) {
            SubLObject var166 = var162;
            SubLObject var167 = (SubLObject)NIL;
            var167 = var166.first();
            while (NIL == var165 && NIL != var166) {
                if (NIL != var164 && NIL != f48121(module0749.f46455(var167))) {
                    var163 = var167;
                    var165 = (SubLObject)T;
                }
                else if (module0749.f46466(var167).eql(var60)) {
                    var164 = (SubLObject)T;
                }
                else if (NIL != var164 && NIL != module0749.f46466(var167)) {
                    var165 = (SubLObject)T;
                }
                var166 = var166.rest();
                var167 = var166.first();
            }
        }
        return var163;
    }
    
    public static SubLObject f48122(final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(var122.isString() && NIL != conses_high.member($ic43$, module0731.f44745(var122, (SubLObject)NIL, module0579.$g4260$.getDynamicValue(var123), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f48121(final SubLObject var122) {
        if (NIL != module0751.f46661((SubLObject)UNPROVIDED)) {
            final SubLObject var123 = module0751.f46654(var122, (SubLObject)UNPROVIDED);
            return f48122(var123);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48120(final SubLObject var162, final SubLObject var163) {
        final SubLObject var164 = module0749.f46455(var163);
        final SubLObject var165 = Sequences.position((SubLObject)Characters.CHAR_space, var164, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var166 = var162.rest();
        if (var165.isInteger()) {
            final SubLObject var167 = module0038.f2623(var164, module0048.f_1X(var165), (SubLObject)UNPROVIDED);
            module0749.f46457(var163, var167);
        }
        while (NIL != var166) {
            if (!var166.first().eql(var163)) {
                var166 = var166.rest();
            }
            else {
                if (var165.isInteger()) {
                    return var166;
                }
                return var166.rest();
            }
        }
        return var162;
    }
    
    public static SubLObject f48123(final SubLObject var18, SubLObject var22, SubLObject var23, SubLObject var24) {
        if (var22 == UNPROVIDED) {
            var22 = module0579.$g4260$.getDynamicValue();
        }
        if (var23 == UNPROVIDED) {
            var23 = module0579.$g4262$.getDynamicValue();
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)$ic2$;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = Errors.$continue_cerrorP$.currentBinding(var25);
        final SubLObject var28 = module0578.$g4234$.currentBinding(var25);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)NIL, var25);
            module0578.$g4234$.bind((SubLObject)T, var25);
            if (NIL != module0578.f35473()) {
                final SubLObject var80_172 = module0580.$g4363$.currentBinding(var25);
                final SubLObject var81_173 = module0580.$g4366$.currentBinding(var25);
                final SubLObject var29 = module0580.$g4364$.currentBinding(var25);
                try {
                    module0580.$g4363$.bind(module0054.f3968(), var25);
                    module0580.$g4366$.bind(module0580.f35568(), var25);
                    module0580.$g4364$.bind((SubLObject)T, var25);
                    try {
                        final SubLObject var30 = f48124(var18, var23);
                        final SubLObject var31 = f48078(var18, var30);
                        f48081(var31, var22, var23, var24);
                        f48082(var31, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        final SubLObject var80_173 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                            module0580.f35566();
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var80_173, var25);
                        }
                    }
                }
                finally {
                    module0580.$g4364$.rebind(var29, var25);
                    module0580.$g4366$.rebind(var81_173, var25);
                    module0580.$g4363$.rebind(var80_172, var25);
                }
            }
            else {
                try {
                    var25.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var80_174 = Errors.$error_handler$.currentBinding(var25);
                    try {
                        Errors.$error_handler$.bind((SubLObject)$ic40$, var25);
                        try {
                            final SubLObject var80_175 = module0580.$g4363$.currentBinding(var25);
                            final SubLObject var81_174 = module0580.$g4366$.currentBinding(var25);
                            final SubLObject var32 = module0580.$g4364$.currentBinding(var25);
                            try {
                                module0580.$g4363$.bind(module0054.f3968(), var25);
                                module0580.$g4366$.bind(module0580.f35568(), var25);
                                module0580.$g4364$.bind((SubLObject)T, var25);
                                try {
                                    final SubLObject var33 = f48124(var18, var23);
                                    final SubLObject var34 = f48078(var18, var33);
                                    f48081(var34, var22, var23, var24);
                                    f48082(var34, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    final SubLObject var80_176 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var25);
                                        module0580.f35566();
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var80_176, var25);
                                    }
                                }
                            }
                            finally {
                                module0580.$g4364$.rebind(var32, var25);
                                module0580.$g4366$.rebind(var81_174, var25);
                                module0580.$g4363$.rebind(var80_175, var25);
                            }
                        }
                        catch (Throwable var35) {
                            Errors.handleThrowable(var35, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var80_174, var25);
                    }
                }
                catch (Throwable var36) {
                    var26 = Errors.handleThrowable(var36, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var25.throwStack.pop();
                }
                if (var26.isString() && NIL == module0578.f35477()) {
                    Errors.warn(Sequences.cconcatenate(module0752.f47234(var26), (SubLObject)$ic41$), module0579.f35508());
                }
            }
        }
        finally {
            module0578.$g4234$.rebind(var28, var25);
            Errors.$continue_cerrorP$.rebind(var27, var25);
        }
        return var18;
    }
    
    public static SubLObject f48124(final SubLObject var18, final SubLObject var23) {
        return f48125(var18, var23);
    }
    
    public static SubLObject f48125(final SubLObject var18, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)NIL;
        final SubLObject var26 = module0147.f9540(var23);
        final SubLObject var27 = module0147.$g2095$.currentBinding(var24);
        final SubLObject var28 = module0147.$g2094$.currentBinding(var24);
        final SubLObject var29 = module0147.$g2096$.currentBinding(var24);
        try {
            module0147.$g2095$.bind(module0147.f9545(var26), var24);
            module0147.$g2094$.bind(module0147.f9546(var26), var24);
            module0147.$g2096$.bind(module0147.f9549(var26), var24);
            SubLObject var31;
            final SubLObject var30 = var31 = module0219.f14510(var18, (SubLObject)ONE_INTEGER, $ic44$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var32 = (SubLObject)NIL;
            var32 = var31.first();
            while (NIL != var31) {
                final SubLObject var33 = module0178.f11335(var32);
                if (NIL == conses_high.member(var33, var25, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic45$) && NIL == conses_high.member(var33, var30, (SubLObject)$ic46$, (SubLObject)$ic45$)) {
                    var25 = (SubLObject)ConsesLow.cons(var32, var25);
                }
                var31 = var31.rest();
                var32 = var31.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var29, var24);
            module0147.$g2094$.rebind(var28, var24);
            module0147.$g2095$.rebind(var27, var24);
        }
        return var25;
    }
    
    public static SubLObject f48126() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48073", "S#52555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48074", "S#52556", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48076", "S#52557", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48078", "S#52558", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48080", "S#52559", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48079", "S#52560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48084", "S#52561", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48085", "S#52562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48086", "S#52563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48088", "S#52564", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48089", "S#52565", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48090", "S#52566", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48083", "S#52567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48091", "S#52568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48092", "S#52569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48093", "S#52570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48094", "S#52571", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48095", "S#52572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48097", "S#52573", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48098", "S#52574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48100", "S#52575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48101", "S#52576", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48096", "S#52577", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48102", "S#52578", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48104", "S#52579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48103", "S#52580", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48105", "S#52581", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48099", "S#52582", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48106", "S#52583", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48087", "S#52584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48075", "S#52585", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48077", "S#52586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48107", "S#52587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48108", "S#52588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48109", "S#52589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48081", "S#52590", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48110", "S#52591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48111", "S#52592", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48082", "S#52593", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48112", "S#52594", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48113", "S#52595", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48114", "PPH-SUMMARIZE-TERM", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48115", "S#52596", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48117", "S#52597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48116", "S#52598", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48118", "S#52599", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48119", "S#52600", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48122", "S#52601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48121", "S#52602", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48120", "S#52603", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48123", "S#52604", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48124", "S#52605", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0760", "f48125", "S#52606", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48127() {
        $g6093$ = SubLFiles.defparameter("S#52607", (SubLObject)THREE_INTEGER);
        $g6094$ = SubLFiles.defparameter("S#52608", (SubLObject)NIL);
        $g6095$ = SubLFiles.defparameter("S#52609", (SubLObject)NIL);
        $g6096$ = SubLFiles.defparameter("S#52610", module0107.f7627());
        $g6097$ = SubLFiles.deflexical("S#52611", (SubLObject)$ic18$);
        $g6098$ = SubLFiles.deflexical("S#52612", (SubLObject)$ic19$);
        $g6099$ = SubLFiles.defparameter("S#52613", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f48128() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f48126();
    }
    
    public void initializeVariables() {
        f48127();
    }
    
    public void runTopLevelForms() {
        f48128();
    }
    
    static {
        me = (SubLFile)new module0760();
        $g6093$ = null;
        $g6094$ = null;
        $g6095$ = null;
        $g6096$ = null;
        $g6097$ = null;
        $g6098$ = null;
        $g6099$ = null;
        $ic0$ = makeSymbol("S#51928", "CYC");
        $ic1$ = makeSymbol("S#51365", "CYC");
        $ic2$ = makeKeyword("TEXT");
        $ic3$ = makeSymbol("LISTP");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("QuantificationalRuleMacroPredicate-Canonical"));
        $ic5$ = makeKeyword("IGNORE");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("MtTimeDimFn"));
        $ic8$ = (SubLFloat)makeDouble(2.5);
        $ic9$ = makeString(" ");
        $ic10$ = makeString("other ");
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("plural"));
        $ic12$ = makeString("others");
        $ic13$ = makeSymbol("INDIVIDUAL?");
        $ic14$ = makeSymbol("S#44567", "CYC");
        $ic15$ = makeSymbol("S#51085", "CYC");
        $ic16$ = makeSymbol("S#51390", "CYC");
        $ic17$ = makeSymbol("COLLECTION-P");
        $ic18$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANY"), constant_handles_oc.f8479((SubLObject)makeString("TheCoordinationSet")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANY"), constant_handles_oc.f8479((SubLObject)makeString("TheCoordinationSet")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("bordersOn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANY"), constant_handles_oc.f8479((SubLObject)makeString("TheCoordinationSet")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("politiesBorderEachOther")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANY"), constant_handles_oc.f8479((SubLObject)makeString("TheCoordinationSet")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("internationalOrganizationMemberCountries")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ANY"), constant_handles_oc.f8479((SubLObject)makeString("TheCoordinationSet")))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), (SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, constant_handles_oc.f8479((SubLObject)makeString("TheCoordinationSet"))), (SubLObject)ConsesLow.list((SubLObject)TWO_INTEGER, constant_handles_oc.f8479((SubLObject)makeString("and")))));
        $ic19$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("conceptuallyRelated")), (SubLObject)makeKeyword("ANY")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("between")), (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("connectedAtEnd")), (SubLObject)makeKeyword("ANY")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("affiliatedWith")), (SubLObject)makeKeyword("ANY")));
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#52614", "CYC"));
        $ic21$ = makeKeyword("ANY");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("CycLSentence"));
        $ic23$ = makeSymbol("S#51007", "CYC");
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("TheCoordinationSet"));
        $ic25$ = makeString("Cached demerits ~D for ~S");
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic27$ = makeKeyword("TOPIC");
        $ic28$ = makeSymbol("SUPPORT-SENTENCE");
        $ic29$ = makeSymbol("S#52615", "CYC");
        $ic30$ = makeKeyword("DECLARATIVE");
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("followsFromPrecedingDiscourse"));
        $ic32$ = makeSymbol("S#12263", "CYC");
        $ic33$ = makeString("Can't make a summary with no input.");
        $ic34$ = makeKeyword("HTML");
        $ic35$ = makeString("(");
        $ic36$ = makeString(" similar sentences)");
        $ic37$ = makeString("Failed to paraphrase ~S");
        $ic38$ = makeString("Probably too many demerits:~% ~S");
        $ic39$ = makeSymbol("S#52537", "CYC");
        $ic40$ = makeSymbol("S#38", "CYC");
        $ic41$ = makeString("~% Top-level CycL: ~S");
        $ic42$ = makeString("Can't truncate ~S");
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("BeAux"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic45$ = makeSymbol("GAF-ARG2");
        $ic46$ = makeSymbol("S#51431", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 831 ms
	
	Decompiled with Procyon 0.5.32.
*/