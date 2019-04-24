package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0611 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0611";
    public static final String myFingerPrint = "e2360f4b6d6eaab40cd1d5daecf42c38aec930d8d28b0787aecd103675d0cbfc";
    public static SubLSymbol $g4708$;
    public static SubLSymbol $g4709$;
    private static SubLSymbol $g4710$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    
    public static SubLObject f37347(final SubLObject var1, final SubLObject var2) {
        if (module0611.NIL == module0131.f8560()) {
            Errors.error((SubLObject)module0611.$ic0$);
        }
        return module0229.f15257(var1, var2, module0611.$g4708$.getGlobalValue());
    }
    
    public static SubLObject f37348(final SubLObject var3, final SubLObject var1) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0611.NIL;
        final SubLObject var6 = module0611.$g4709$.currentBinding(var4);
        try {
            module0611.$g4709$.bind(var1, var4);
            if (module0611.NIL != module0202.f12674(var3)) {
                var5 = module0202.f12751(var3);
            }
            else {
                var5 = module0610.f37287(var3, (SubLObject)module0611.$ic1$);
            }
        }
        finally {
            module0611.$g4709$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f37349(final SubLObject var3, final SubLObject var1) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f37348(var3, var1);
        SubLObject var6 = (SubLObject)module0611.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0611.NIL;
        var8 = var7.first();
        while (module0611.NIL != var7) {
            var4.resetMultipleValues();
            final SubLObject var9 = f37350(var1, var8);
            final SubLObject var10 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            if (module0611.NIL != var10) {
                var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var8, var9), var6);
            }
            else if (module0611.NIL == module0611.$g4708$.getGlobalValue()) {
                module0229.f15259();
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return Sequences.nreverse(var6);
    }
    
    public static SubLObject f37351(final SubLObject var3, final SubLObject var1) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = f37348(var3, var1);
        SubLObject var6 = (SubLObject)module0611.NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)module0611.NIL;
        var8 = var7.first();
        while (module0611.NIL != var7) {
            var4.resetMultipleValues();
            final SubLObject var9 = f37350(var1, var8);
            final SubLObject var10 = var4.secondMultipleValue();
            var4.resetMultipleValues();
            if (module0611.NIL != var10) {
                var6 = (SubLObject)ConsesLow.cons(var9, var6);
            }
            else if (module0611.NIL == module0611.$g4708$.getGlobalValue()) {
                module0229.f15259();
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return Sequences.nreverse(var6);
    }
    
    public static SubLObject f37350(final SubLObject var1, final SubLObject var9) {
        if (var1.eql(module0611.$ic2$)) {
            return Values.values(var9, (SubLObject)module0611.T);
        }
        if (module0611.NIL != module0434.f30599((SubLObject)module0611.UNPROVIDED, (SubLObject)module0611.UNPROVIDED, (SubLObject)module0611.UNPROVIDED)) {
            return f37352(var1, var9);
        }
        final SubLObject var10 = module0202.f12643(var1, var9);
        return module0229.f15243(var10);
    }
    
    public static SubLObject f37352(final SubLObject var1, final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0611.NIL;
        SubLObject var12 = (SubLObject)module0611.NIL;
        final SubLObject var13 = module0611.$g4709$.currentBinding(var10);
        try {
            module0611.$g4709$.bind(var1, var10);
            var10.resetMultipleValues();
            final SubLObject var15_16 = f37353(var9, (SubLObject)module0611.UNPROVIDED, (SubLObject)module0611.UNPROVIDED);
            final SubLObject var17_18 = var10.secondMultipleValue();
            var10.resetMultipleValues();
            var11 = var15_16;
            var12 = var17_18;
        }
        finally {
            module0611.$g4709$.rebind(var13, var10);
        }
        return Values.values(var11, var12);
    }
    
    public static SubLObject f37354(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = module0611.$g4709$.getDynamicValue(var20);
        if (module0611.NIL != var21 && module0611.NIL != module0229.f15235(var21)) {
            final SubLObject var22 = module0205.f13203(var21, (SubLObject)module0611.UNPROVIDED);
            final SubLObject var23 = module0205.f13204(var21, (SubLObject)module0611.UNPROVIDED);
            return f37355(var19, var22, var23);
        }
        return (SubLObject)module0611.NIL;
    }
    
    public static SubLObject f37356(final SubLObject var19, final SubLObject var20, final SubLObject var21) {
        final SubLObject var22 = module0225.f14782(var20);
        final SubLObject var23 = (SubLObject)module0611.$ic4$;
        if (module0611.NIL != module0202.f12895(var21) && module0611.TWO_INTEGER.numE(module0202.f12897(var21))) {
            final SubLObject var24 = module0205.f13203(var21, (SubLObject)module0611.UNPROVIDED);
            final SubLObject var25 = ConsesLow.nth(module0048.f_1_(var22), var24);
            final SubLObject var26 = ConsesLow.nth(module0048.f_1_(var20), var24);
            SubLObject var27 = module0205.f13204(var21, (SubLObject)module0611.UNPROVIDED);
            var27 = conses_high.subst(var19, var25, var27, (SubLObject)module0611.UNPROVIDED, (SubLObject)module0611.UNPROVIDED);
            var27 = conses_high.subst(var23, var26, var27, (SubLObject)module0611.UNPROVIDED, (SubLObject)module0611.UNPROVIDED);
            return var27;
        }
        if (module0611.NIL != module0173.f10955(var21) && module0611.NIL != module0225.f14781(var21)) {
            final SubLObject var28 = module0202.f12768(var21, (SubLObject)module0611.$ic5$, (SubLObject)module0611.$ic6$);
            ConsesLow.set_nth(var22, var28, var19);
            ConsesLow.set_nth(var20, var28, var23);
            return var28;
        }
        return (SubLObject)module0611.NIL;
    }
    
    public static SubLObject f37355(final SubLObject var19, final SubLObject var20, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0034.$g879$.getDynamicValue(var22);
        SubLObject var24 = (SubLObject)module0611.NIL;
        if (module0611.NIL == var23) {
            return f37356(var19, var20, var21);
        }
        var24 = module0034.f1857(var23, (SubLObject)module0611.$ic3$, (SubLObject)module0611.UNPROVIDED);
        if (module0611.NIL == var24) {
            var24 = module0034.f1807(module0034.f1842(var23), (SubLObject)module0611.$ic3$, (SubLObject)module0611.THREE_INTEGER, (SubLObject)module0611.NIL, (SubLObject)module0611.EQUAL, (SubLObject)module0611.UNPROVIDED);
            module0034.f1860(var23, (SubLObject)module0611.$ic3$, var24);
        }
        final SubLObject var25 = module0034.f1781(var19, var20, var21);
        final SubLObject var26 = module0034.f1814(var24, var25, (SubLObject)module0611.UNPROVIDED);
        if (var26 != module0611.$ic7$) {
            SubLObject var27 = var26;
            SubLObject var28 = (SubLObject)module0611.NIL;
            var28 = var27.first();
            while (module0611.NIL != var27) {
                SubLObject var29 = var28.first();
                final SubLObject var30 = conses_high.second(var28);
                if (var19.equal(var29.first())) {
                    var29 = var29.rest();
                    if (var20.equal(var29.first())) {
                        var29 = var29.rest();
                        if (module0611.NIL != var29 && module0611.NIL == var29.rest() && var21.equal(var29.first())) {
                            return module0034.f1959(var30);
                        }
                    }
                }
                var27 = var27.rest();
                var28 = var27.first();
            }
        }
        final SubLObject var31 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f37356(var19, var20, var21)));
        module0034.f1836(var24, var25, var26, var31, (SubLObject)ConsesLow.list(var19, var20, var21));
        return module0034.f1959(var31);
    }
    
    public static SubLObject f37353(final SubLObject var36, SubLObject var37, SubLObject var38) {
        if (var37 == module0611.UNPROVIDED) {
            var37 = module0373.f26109();
        }
        if (var38 == module0611.UNPROVIDED) {
            var38 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var39 = f37357(var37, var38);
        return module0067.f4884(var39, var36, (SubLObject)module0611.NIL);
    }
    
    public static SubLObject f37358(final SubLObject var37, final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        var39.resetMultipleValues();
        final SubLObject var40 = module0434.f30602(var37);
        final SubLObject var41 = var39.secondMultipleValue();
        final SubLObject var42 = var39.thirdMultipleValue();
        var39.resetMultipleValues();
        final SubLObject var43 = module0434.f30605(var40, var38);
        final SubLObject var44 = module0067.f4880(Symbols.symbol_function((SubLObject)module0611.EQUAL), (SubLObject)module0611.ZERO_INTEGER);
        SubLObject var45 = var43;
        SubLObject var46 = (SubLObject)module0611.NIL;
        var46 = var45.first();
        while (module0611.NIL != var45) {
            if (module0611.NIL != module0035.f2206(var42, var46, Symbols.symbol_function((SubLObject)module0611.EQUAL))) {
                final SubLObject var47 = module0233.f15369(var41, var46);
                final SubLObject var48 = module0233.f15369((SubLObject)module0611.$ic4$, var46);
                module0067.f4886(var44, var47, var48);
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return var44;
    }
    
    public static SubLObject f37357(final SubLObject var37, final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        final SubLObject var40 = module0034.$g879$.getDynamicValue(var39);
        SubLObject var41 = (SubLObject)module0611.NIL;
        if (module0611.NIL == var40) {
            return f37358(var37, var38);
        }
        var41 = module0034.f1857(var40, (SubLObject)module0611.$ic8$, (SubLObject)module0611.UNPROVIDED);
        if (module0611.NIL == var41) {
            var41 = module0034.f1807(module0034.f1842(var40), (SubLObject)module0611.$ic8$, (SubLObject)module0611.TWO_INTEGER, (SubLObject)module0611.$ic9$, (SubLObject)module0611.EQUAL, (SubLObject)module0611.UNPROVIDED);
            module0034.f1860(var40, (SubLObject)module0611.$ic8$, var41);
        }
        final SubLObject var42 = module0034.f1782(var37, var38);
        final SubLObject var43 = module0034.f1814(var41, var42, (SubLObject)module0611.UNPROVIDED);
        if (var43 != module0611.$ic7$) {
            SubLObject var44 = var43;
            SubLObject var45 = (SubLObject)module0611.NIL;
            var45 = var44.first();
            while (module0611.NIL != var44) {
                SubLObject var46 = var45.first();
                final SubLObject var47 = conses_high.second(var45);
                if (var37.equal(var46.first())) {
                    var46 = var46.rest();
                    if (module0611.NIL != var46 && module0611.NIL == var46.rest() && var38.equal(var46.first())) {
                        return module0034.f1959(var47);
                    }
                }
                var44 = var44.rest();
                var45 = var44.first();
            }
        }
        final SubLObject var48 = Values.arg2(var39.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f37358(var37, var38)));
        module0034.f1836(var41, var42, var43, var48, (SubLObject)ConsesLow.list(var37, var38));
        return module0034.f1959(var48);
    }
    
    public static SubLObject f37359(final SubLObject var45, final SubLObject var1) {
        final SubLObject var46 = f37351(var45, var1);
        final SubLObject var47 = f37360(var46);
        if (module0611.NIL == var47) {
            module0229.f15259();
        }
        return module0609.f37181(var47);
    }
    
    public static SubLObject f37360(final SubLObject var12) {
        SubLObject var13 = (SubLObject)module0611.NIL;
        SubLObject var14 = var12;
        SubLObject var15 = (SubLObject)module0611.NIL;
        var15 = var14.first();
        while (module0611.NIL != var14) {
            var13 = ((module0611.NIL != var13) ? module0609.f37180(var13, var15) : var15);
            var14 = var14.rest();
            var15 = var14.first();
        }
        return var13;
    }
    
    public static SubLObject f37361(final SubLObject var45, final SubLObject var1) {
        final SubLObject var46 = f37351(var45, var1);
        SubLObject var47 = (SubLObject)module0611.ONE_INTEGER;
        SubLObject var48 = var46;
        SubLObject var49 = (SubLObject)module0611.NIL;
        var49 = var48.first();
        while (module0611.NIL != var48) {
            var47 = module0609.f37185(var47, var49);
            var48 = var48.rest();
            var49 = var48.first();
        }
        return module0609.f37181(var47);
    }
    
    public static SubLObject f37362(final SubLObject var45, final SubLObject var1) {
        final SubLObject var46 = f37351(var45, var1);
        SubLObject var47 = (SubLObject)module0611.NIL;
        SubLObject var48 = var46;
        SubLObject var49 = (SubLObject)module0611.NIL;
        var49 = var48.first();
        while (module0611.NIL != var48) {
            if (module0611.NIL == var47 || module0611.NIL != module0609.f37186(var49, var47)) {
                var47 = var49;
            }
            var48 = var48.rest();
            var49 = var48.first();
        }
        if (module0611.NIL == var47) {
            module0229.f15259();
        }
        return module0609.f37181(var47);
    }
    
    public static SubLObject f37363(final SubLObject var45, final SubLObject var1) {
        final SubLObject var46 = f37351(var45, var1);
        SubLObject var47 = (SubLObject)module0611.NIL;
        SubLObject var48 = var46;
        SubLObject var49 = (SubLObject)module0611.NIL;
        var49 = var48.first();
        while (module0611.NIL != var48) {
            if (module0611.NIL == var47 || module0611.NIL != module0609.f37187(var49, var47)) {
                var47 = var49;
            }
            var48 = var48.rest();
            var49 = var48.first();
        }
        if (module0611.NIL == var47) {
            module0229.f15259();
        }
        return module0609.f37181(var47);
    }
    
    public static SubLObject f37364(final SubLObject var45, final SubLObject var1) {
        final SubLObject var46 = f37351(var45, var1);
        final SubLObject var47 = f37360(var46);
        final SubLObject var48 = Sequences.length(var46);
        return module0610.f37231(var47, var48);
    }
    
    public static SubLObject f37365(final SubLObject var45, final SubLObject var1) {
        SubLObject var46 = f37351(var45, var1);
        final SubLObject var47 = Sequences.length(var46);
        final SubLObject var48 = Numbers.integerDivide(var47, (SubLObject)module0611.TWO_INTEGER);
        SubLObject var49 = (SubLObject)module0611.NIL;
        var46 = Sort.sort(var46, (SubLObject)module0611.$ic15$, (SubLObject)module0611.UNPROVIDED);
        if (var47.isZero()) {
            module0229.f15259();
        }
        else if (module0611.NIL != Numbers.oddp(var47)) {
            var49 = ConsesLow.nth(var48, var46);
        }
        else {
            final SubLObject var50 = ConsesLow.nth(var48, var46);
            final SubLObject var51 = ConsesLow.nth(module0048.f_1_(var48), var46);
            var49 = module0610.f37231(module0609.f37180(var50, var51), (SubLObject)module0611.TWO_INTEGER);
        }
        return module0609.f37181(var49);
    }
    
    public static SubLObject f37366(final SubLObject var53, final SubLObject var54, final SubLObject var1) {
        if (module0611.NIL == module0269.f17718(var54, (SubLObject)module0611.UNPROVIDED) || !module0611.TWO_INTEGER.eql(module0225.f14739(var54))) {
            module0229.f15259();
        }
        SubLObject var55 = f37349(var53, var1);
        SubLObject var56 = (SubLObject)module0611.NIL;
        SubLObject var57 = (SubLObject)module0611.NIL;
        SubLObject var58;
        var55 = (var58 = f37367(var55, var54));
        SubLObject var59 = (SubLObject)module0611.NIL;
        var59 = var58.first();
        while (module0611.NIL != var58) {
            SubLObject var61;
            final SubLObject var60 = var61 = var59;
            SubLObject var62 = (SubLObject)module0611.NIL;
            SubLObject var63 = (SubLObject)module0611.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)module0611.$ic17$);
            var62 = var61.first();
            var61 = var61.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)module0611.$ic17$);
            var63 = var61.first();
            var61 = var61.rest();
            if (module0611.NIL == var61) {
                if (module0611.NIL == var56 || module0611.NIL != f37368(var54, var63, var57)) {
                    var56 = var62;
                    var57 = var63;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var60, (SubLObject)module0611.$ic17$);
            }
            var58 = var58.rest();
            var59 = var58.first();
        }
        if (module0611.NIL == var56) {
            module0229.f15259();
        }
        return var56;
    }
    
    public static SubLObject f37367(SubLObject var7, final SubLObject var54) {
        if (module0611.NIL != module0035.f2169(var54, (SubLObject)module0611.$ic19$) && module0611.NIL != f37369(var7)) {
            var7 = module0035.f2076((SubLObject)module0611.$ic20$, var7);
        }
        return var7;
    }
    
    public static SubLObject f37369(final SubLObject var7) {
        if (module0611.NIL != var7) {
            SubLObject var8 = (SubLObject)module0611.NIL;
            SubLObject var9 = (SubLObject)module0611.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var7, var7, (SubLObject)module0611.$ic21$);
            var8 = var7.first();
            final SubLObject var10 = var9 = var7.rest();
            final SubLObject var11 = conses_high.second(var8);
            if (module0611.NIL != module0202.f12593(var11) && module0205.f13203(var11, (SubLObject)module0611.UNPROVIDED).isNumber()) {
                final SubLObject var12 = module0205.f13136(var11);
                if (module0611.NIL != module0552.f34137(var12, (SubLObject)module0611.UNPROVIDED)) {
                    SubLObject var13 = (SubLObject)module0611.NIL;
                    if (module0611.NIL == var13) {
                        SubLObject var14 = var9;
                        SubLObject var15 = (SubLObject)module0611.NIL;
                        var15 = var14.first();
                        while (module0611.NIL == var13 && module0611.NIL != var14) {
                            final SubLObject var16 = conses_high.second(var15);
                            if (module0611.NIL == module0202.f12593(var16) || !var12.equal(module0205.f13136(var16)) || !module0205.f13203(var16, (SubLObject)module0611.UNPROVIDED).isNumber()) {
                                var13 = var16;
                            }
                            var14 = var14.rest();
                            var15 = var14.first();
                        }
                    }
                    return (SubLObject)SubLObjectFactory.makeBoolean(module0611.NIL == module0035.sublisp_boolean(var13));
                }
            }
        }
        return (SubLObject)module0611.NIL;
    }
    
    public static SubLObject f37370(final SubLObject var57) {
        final SubLObject var58 = conses_high.second(var57);
        final SubLObject var59 = module0205.f13203(var58, (SubLObject)module0611.UNPROVIDED);
        ConsesLow.set_nth((SubLObject)module0611.ONE_INTEGER, var57, var59);
        return var57;
    }
    
    public static SubLObject f37371(final SubLObject var45, final SubLObject var54, final SubLObject var1) {
        if (module0611.NIL == module0269.f17718(var54, (SubLObject)module0611.UNPROVIDED) || !module0611.TWO_INTEGER.eql(module0225.f14739(var54))) {
            module0229.f15259();
        }
        final SubLObject var55 = f37349(var45, var1);
        final SubLObject var56 = f37372(var55, var54);
        final SubLObject var57 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0611.$ic22$), var56);
        return module0202.f12787(var57, (SubLObject)module0611.UNPROVIDED);
    }
    
    public static SubLObject f37373(final SubLObject var45, final SubLObject var76, final SubLObject var1) {
        return f37371(var45, var76, var1);
    }
    
    public static SubLObject f37372(SubLObject var7, final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        final SubLObject var56 = module0611.$g4710$.currentBinding(var55);
        try {
            module0611.$g4710$.bind(var54, var55);
            var7 = module0213.f13926(var7, (SubLObject)module0611.NIL, (SubLObject)module0611.NIL, (SubLObject)module0611.T, (SubLObject)module0611.NIL, Symbols.symbol_function((SubLObject)module0611.$ic22$), (SubLObject)module0611.UNPROVIDED);
            var7 = Sort.stable_sort(var7, (SubLObject)module0611.$ic26$, Symbols.symbol_function((SubLObject)module0611.$ic27$));
        }
        finally {
            module0611.$g4710$.rebind(var56, var55);
        }
        return var7;
    }
    
    public static SubLObject f37374(final SubLObject var77, final SubLObject var78) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = module0611.$g4710$.getDynamicValue(var79);
        return f37368(var80, var77, var78);
    }
    
    public static SubLObject f37368(final SubLObject var54, final SubLObject var77, final SubLObject var78) {
        if (var54.eql(module0611.$ic28$)) {
            return module0609.f37186(var77, var78);
        }
        if (var54.eql(module0611.$ic29$)) {
            return module0609.f37187(var77, var78);
        }
        final SubLObject var79 = module0202.f12768(var54, var77, var78);
        if (module0611.NIL != module0229.f15236(var54, (SubLObject)module0611.UNPROVIDED)) {
            return module0229.f15243(var79);
        }
        final SubLObject var80 = module0147.f9496();
        return module0434.f30585(var79, var80, (SubLObject)module0611.UNPROVIDED);
    }
    
    public static SubLObject f37375(final SubLObject var45, final SubLObject var54) {
        return f37371(var45, var54, module0611.$ic2$);
    }
    
    public static SubLObject f37376() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37347", "S#35510", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37348", "S#41064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37349", "S#41065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37351", "S#41066", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37350", "S#41067", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37352", "S#41068", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37354", "S#33829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37356", "S#41069", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37355", "S#41070", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37353", "S#41071", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37358", "S#41072", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37357", "S#41073", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37359", "CYC-PLUS-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37360", "S#41074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37361", "CYC-TIMES-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37362", "CYC-MAXIMUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37363", "CYC-MINIMUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37364", "CYC-AVERAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37365", "CYC-MEDIAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37366", "CYC-EXTREME-MEMBER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37367", "S#41075", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37369", "S#41076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37370", "S#41077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37371", "CYC-SORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37373", "S#41078", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37372", "S#41079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37374", "S#41080", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37368", "S#41081", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0611", "f37375", "CYC-SORT-SET-VIA-BIN-PRED-FN", 2, 0, false);
        return (SubLObject)module0611.NIL;
    }
    
    public static SubLObject f37377() {
        module0611.$g4708$ = SubLFiles.deflexical("S#41082", (SubLObject)module0611.T);
        module0611.$g4709$ = SubLFiles.defparameter("S#41083", (SubLObject)module0611.NIL);
        module0611.$g4710$ = SubLFiles.defparameter("S#41084", (SubLObject)module0611.NIL);
        return (SubLObject)module0611.NIL;
    }
    
    public static SubLObject f37378() {
        module0034.f1895((SubLObject)module0611.$ic3$);
        module0034.f1895((SubLObject)module0611.$ic8$);
        module0012.f416((SubLObject)module0611.$ic10$);
        module0012.f416((SubLObject)module0611.$ic11$);
        module0012.f416((SubLObject)module0611.$ic12$);
        module0012.f416((SubLObject)module0611.$ic13$);
        module0012.f416((SubLObject)module0611.$ic14$);
        module0012.f416((SubLObject)module0611.$ic16$);
        module0012.f416((SubLObject)module0611.$ic18$);
        module0012.f419((SubLObject)module0611.$ic20$);
        module0012.f416((SubLObject)module0611.$ic23$);
        module0002.f35((SubLObject)module0611.$ic24$, (SubLObject)module0611.$ic25$);
        module0012.f419((SubLObject)module0611.$ic26$);
        module0012.f416((SubLObject)module0611.$ic30$);
        return (SubLObject)module0611.NIL;
    }
    
    public void declareFunctions() {
        f37376();
    }
    
    public void initializeVariables() {
        f37377();
    }
    
    public void runTopLevelForms() {
        f37378();
    }
    
    static {
        me = (SubLFile)new module0611();
        module0611.$g4708$ = null;
        module0611.$g4709$ = null;
        module0611.$g4710$ = null;
        $ic0$ = SubLObjectFactory.makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");
        $ic1$ = SubLObjectFactory.makeKeyword("HL");
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IdentityFn"));
        $ic3$ = SubLObjectFactory.makeSymbol("S#41070", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("?NQVAL");
        $ic5$ = SubLObjectFactory.makeKeyword("ARG1");
        $ic6$ = SubLObjectFactory.makeKeyword("ARG2");
        $ic7$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic8$ = SubLObjectFactory.makeSymbol("S#41073", "CYC");
        $ic9$ = SubLObjectFactory.makeInteger(100);
        $ic10$ = SubLObjectFactory.makeSymbol("CYC-PLUS-ALL");
        $ic11$ = SubLObjectFactory.makeSymbol("CYC-TIMES-ALL");
        $ic12$ = SubLObjectFactory.makeSymbol("CYC-MAXIMUM");
        $ic13$ = SubLObjectFactory.makeSymbol("CYC-MINIMUM");
        $ic14$ = SubLObjectFactory.makeSymbol("CYC-AVERAGE");
        $ic15$ = SubLObjectFactory.makeSymbol("CYC-LESS-THAN");
        $ic16$ = SubLObjectFactory.makeSymbol("CYC-MEDIAN");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#41085", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41086", "CYC"));
        $ic18$ = SubLObjectFactory.makeSymbol("CYC-EXTREME-MEMBER");
        $ic19$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("greaterThan")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("lessThan")));
        $ic20$ = SubLObjectFactory.makeSymbol("S#41077", "CYC");
        $ic21$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#41087", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#41088", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic23$ = SubLObjectFactory.makeSymbol("CYC-SORT");
        $ic24$ = SubLObjectFactory.makeSymbol("S#41078", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-SORT"));
        $ic26$ = SubLObjectFactory.makeSymbol("S#41080", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("greaterThan"));
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("lessThan"));
        $ic30$ = SubLObjectFactory.makeSymbol("CYC-SORT-SET-VIA-BIN-PRED-FN");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0611.class
	Total time: 197 ms
	
	Decompiled with Procyon 0.5.32.
*/