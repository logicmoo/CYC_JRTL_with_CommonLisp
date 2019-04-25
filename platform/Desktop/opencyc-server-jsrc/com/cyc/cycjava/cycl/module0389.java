package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0389 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0389";
    public static final String myFingerPrint = "f8688b796a16a7266f14fd722a78461d929062934326579684ed2fe70d9c850c";
    private static SubLSymbol $g3246$;
    private static SubLSymbol $g3247$;
    private static SubLSymbol $g3248$;
    private static SubLSymbol $g3249$;
    private static SubLSymbol $g3250$;
    private static SubLSymbol $g3251$;
    private static SubLSymbol $g3252$;
    private static SubLSymbol $g3253$;
    private static SubLSymbol $g3254$;
    private static SubLSymbol $g3255$;
    private static SubLSymbol $g3256$;
    public static SubLSymbol $g3257$;
    private static SubLSymbol $g3258$;
    private static SubLSymbol $g3259$;
    private static SubLSymbol $g3260$;
    private static SubLSymbol $g3261$;
    private static SubLSymbol $g3262$;
    private static SubLSymbol $g3263$;
    private static SubLSymbol $g3264$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLList $ic47$;
    private static final SubLInteger $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLInteger $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLInteger $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLList $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLList $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLList $ic122$;
    private static final SubLSymbol $ic123$;
    
    public static SubLObject f27601() {
        return $g3246$.getGlobalValue();
    }
    
    public static SubLObject f27602(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic3$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic3$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic3$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic3$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12_13 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic3$);
            var12_13 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic3$);
            if (NIL == conses_high.member(var12_13, (SubLObject)$ic4$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var12_13 == $ic5$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic3$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        final SubLObject var17 = (SubLObject)$ic8$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic10$, (SubLObject)$ic7$, var15), (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var6)), (SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var6)), (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)$ic14$, var6))), (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)$ic16$, var13, var17), ConsesLow.append(var16, (SubLObject)NIL))));
    }
    
    public static SubLObject f27603(final SubLObject var15, final SubLObject var19) {
        return (SubLObject)makeBoolean(NIL == var15 || NIL != f27604(var15, var19));
    }
    
    public static SubLObject f27605(final SubLObject var15) {
        return module0035.f2169(var15, $g3247$.getGlobalValue());
    }
    
    public static SubLObject f27604(final SubLObject var15, final SubLObject var19) {
        if (var19.eql((SubLObject)$ic18$)) {
            return module0363.f24478(var15);
        }
        if (var19.eql((SubLObject)$ic19$)) {
            return module0365.f24819(var15);
        }
        if (var19.eql((SubLObject)$ic20$)) {
            return module0373.f26176(var15);
        }
        if (var19.eql((SubLObject)$ic21$)) {
            return module0373.f26146(var15);
        }
        if (var19.eql((SubLObject)$ic22$)) {
            return module0373.f26151(var15);
        }
        if (var19.eql((SubLObject)$ic23$)) {
            return module0376.f26618(var15);
        }
        if (var19.eql((SubLObject)$ic24$)) {
            return module0377.f26771(var15);
        }
        Errors.error((SubLObject)$ic25$, var19);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27606(final SubLObject var7, final SubLObject var8, final SubLObject var21, final SubLObject var22, final SubLObject var19) {
        return (SubLObject)ConsesLow.list(var7, var8, var21, var22, var19);
    }
    
    public static SubLObject f27607(final SubLObject var6, final SubLObject var23) {
        assert NIL != Types.keywordp(var6) : var6;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = var23;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var29_30 = (SubLObject)NIL;
        while (NIL != var25) {
            cdestructuring_bind.destructuring_bind_must_consp(var25, var23, (SubLObject)$ic27$);
            var29_30 = var25.first();
            var25 = var25.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var25, var23, (SubLObject)$ic27$);
            if (NIL == conses_high.member(var29_30, (SubLObject)$ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var26 = (SubLObject)T;
            }
            if (var29_30 == $ic5$) {
                var24 = var25.first();
            }
            var25 = var25.rest();
        }
        if (NIL != var26 && NIL == var24) {
            cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)$ic27$);
        }
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)$ic29$, var23);
        final SubLObject var28 = (SubLObject)((NIL != var27) ? conses_high.cadr(var27) : NIL);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic30$, var23);
        final SubLObject var30 = (SubLObject)((NIL != var29) ? conses_high.cadr(var29) : NIL);
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic31$, var23);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : NIL);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)$ic32$, var23);
        final SubLObject var34 = (SubLObject)((NIL != var33) ? conses_high.cadr(var33) : NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)$ic33$, var23);
        final SubLObject var36 = (SubLObject)((NIL != var35) ? conses_high.cadr(var35) : NIL);
        final SubLObject var37 = f27606(var28, var30, var32, var34, var36);
        module0067.f4886($g3246$.getGlobalValue(), var6, var37);
        return var6;
    }
    
    public static SubLObject f27608(final SubLObject var6) {
        module0067.f4887($g3246$.getGlobalValue(), var6);
        return var6;
    }
    
    public static SubLObject f27609(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885($g3246$.getGlobalValue(), var6, (SubLObject)UNPROVIDED);
        if (NIL != var7) {
            return var7.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27610(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = conses_high.getf($g3248$.getDynamicValue(var7), var6, (SubLObject)NIL);
        if (NIL != var8) {
            return var8;
        }
        final SubLObject var9 = module0067.f4885($g3246$.getGlobalValue(), var6, (SubLObject)UNPROVIDED);
        if (NIL != var9) {
            return conses_high.second(var9);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27611(final SubLObject var6) {
        final SubLObject var7 = f27612(var6);
        return (NIL != var7) ? var7 : Symbols.symbol_name(var6);
    }
    
    public static SubLObject f27612(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885($g3246$.getGlobalValue(), var6, (SubLObject)UNPROVIDED);
        if (NIL != var7) {
            return conses_high.third(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27613(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885($g3246$.getGlobalValue(), var6, (SubLObject)UNPROVIDED);
        if (NIL != var7) {
            return conses_high.fourth(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27614(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885($g3246$.getGlobalValue(), var6, (SubLObject)UNPROVIDED);
        if (NIL != var7) {
            return conses_high.fifth(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27615(final SubLObject var39, final SubLObject var40) {
        final SubLObject var41 = f27616(var40, var39);
        final SubLObject var42 = f27617(var40, var39);
        final SubLObject var43 = (ZERO_INTEGER.eql(var41) && NIL != module0048.f3328(var42)) ? module0048.f3326() : module0360.f23947(var41, var42);
        final SubLObject var44 = module0360.f23947(var43, (SubLObject)MINUS_ONE_INTEGER);
        return var44;
    }
    
    public static SubLObject f27616(final SubLObject var40, final SubLObject var39) {
        if (NIL == module0406.f28343(var39) && NIL == module0398.f28152(var39)) {
            return (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var41 = module0391.f27937(var39, var40);
        if (NIL != var41) {
            return module0373.f26192(var40, var41);
        }
        return module0365.f24901(var40);
    }
    
    public static SubLObject f27617(final SubLObject var40, final SubLObject var39) {
        final SubLObject var41 = module0367.f25037(var39);
        final SubLObject var42 = module0363.f24655(var40, var41);
        if ($ic37$ == var42) {
            return module0048.f3326();
        }
        return f27618(var42);
    }
    
    public static SubLObject f27619() {
        final SubLObject var50 = $g3249$.getGlobalValue();
        if (NIL != var50) {
            module0034.f1818(var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27620(final SubLObject var49) {
        return module0034.f1829($g3249$.getGlobalValue(), (SubLObject)ConsesLow.list(var49), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27621(final SubLObject var49) {
        return Numbers.max((SubLObject)ONE_INTEGER, Numbers.round(Numbers.log(module0048.f_1X(var49), (SubLObject)TWO_INTEGER), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f27618(final SubLObject var49) {
        SubLObject var50 = $g3249$.getGlobalValue();
        if (NIL == var50) {
            var50 = module0034.f1934((SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var51 = module0034.f1814(var50, var49, (SubLObject)$ic40$);
        if (var51 == $ic40$) {
            var51 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27621(var49)));
            module0034.f1816(var50, var49, var51, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var51);
    }
    
    public static SubLObject f27622(final SubLObject var39, final SubLObject var53) {
        if (NIL != module0373.f26176(var53) && $ic43$ == module0367.f25197(var53, var39)) {
            return (SubLObject)ONE_INTEGER;
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f27623(final SubLObject var39, final SubLObject var40) {
        return f27624(var39, var40, (SubLObject)NIL);
    }
    
    public static SubLObject f27624(final SubLObject var39, final SubLObject var40, final SubLObject var54) {
        final SubLObject var55 = module0367.f25037(var39);
        SubLObject var56 = (SubLObject)ZERO_INTEGER;
        if (NIL != module0408.f28461(var55)) {
            SubLObject var57 = module0363.f24656(var40, var55);
            if ($ic37$ == var57 || NIL == var57) {
                var56 = $g3251$.getGlobalValue();
            }
            else {
                if (NIL != var54) {
                    var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER);
                }
                var56 = f27625(var57, $g3250$.getGlobalValue(), (SubLObject)UNPROVIDED);
            }
        }
        return var56;
    }
    
    public static SubLObject f27626(final SubLObject var39, final SubLObject var53) {
        final SubLObject var54 = module0377.f26771(var53);
        return f27624(var39, module0365.f24850(var53), var54);
    }
    
    public static SubLObject f27627(final SubLObject var39, final SubLObject var57) {
        if (NIL != module0376.f26618(var57) && $ic55$ == module0367.f25197(var57, var39) && NIL != module0360.f23939((SubLObject)ZERO_INTEGER, module0367.f25203(var57, var39))) {
            return (SubLObject)$ic48$;
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f27628(final SubLObject var39, final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (NIL == $g3252$.getDynamicValue(var59)) {
            return (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var60 = module0365.f24850(var58);
        final SubLObject var61 = f27629(var60, var39);
        final SubLObject var62 = $g3253$.getGlobalValue();
        final SubLObject var63 = module0035.f2293(var62, var61, Symbols.symbol_function((SubLObject)EQL), $g3254$.getGlobalValue());
        return var63;
    }
    
    public static SubLObject f27629(final SubLObject var40, final SubLObject var39) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)ZERO_INTEGER;
        SubLObject var43 = module0363.f24517(var40);
        SubLObject var44 = (SubLObject)NIL;
        var44 = var43.first();
        while (NIL != var43) {
            if (NIL != module0363.f24524(var44, (SubLObject)$ic62$) && NIL != module0363.f24518(var44, (SubLObject)$ic63$)) {
                final SubLObject var45 = module0367.f25203(var44, var39);
                if (NIL != module0360.f23942(var45, $g3255$.getDynamicValue(var41))) {
                    var42 = Numbers.add(var42, (SubLObject)ONE_INTEGER);
                }
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        return var42;
    }
    
    public static SubLObject f27630(final SubLObject var39, final SubLObject var64) {
        final SubLObject var65 = module0367.f25037(var39);
        if (NIL != module0408.f28461(var65)) {
            final SubLObject var66 = module0365.f24850(var64);
            if (NIL != module0363.f24562(var66)) {
                final SubLObject var67 = module0363.f24564(var66);
                final SubLObject var68 = module0363.f24565(var66);
                if (NIL != module0349.f23463(var67, var68)) {
                    return (SubLObject)$ic66$;
                }
            }
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f27631(final SubLObject var39, final SubLObject var53) {
        return f27632(var39, module0365.f24850(var53), var53);
    }
    
    public static SubLObject f27632(final SubLObject var39, final SubLObject var40, final SubLObject var15) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)$ic66$;
        final SubLObject var43 = module0367.f25037(var39);
        if (NIL != module0408.f28461(var43) && (NIL != module0373.f26366(var40, var43) || NIL != module0377.f26771(var15))) {
            final SubLObject var44 = $g3256$.currentBinding(var41);
            try {
                $g3256$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var41);
                var41.resetMultipleValues();
                SubLObject var45 = f27633(var40, var43);
                SubLObject var46 = var41.secondMultipleValue();
                var41.resetMultipleValues();
                if ($ic71$ != var46) {
                    if (NIL != module0373.f26176(var15)) {
                        var41.resetMultipleValues();
                        final SubLObject var47 = f27634(var15);
                        final SubLObject var48 = var41.secondMultipleValue();
                        var41.resetMultipleValues();
                        var45 = Numbers.add(var45, var47);
                        var46 = Numbers.add(var46, var48);
                    }
                    if (!var46.isZero()) {
                        var42 = Numbers.truncate(Numbers.multiply((SubLObject)$ic66$, var45), var46);
                    }
                }
            }
            finally {
                $g3256$.rebind(var44, var41);
            }
        }
        return var42;
    }
    
    public static SubLObject f27635(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0077.f5326(var40, $g3256$.getDynamicValue(var41));
    }
    
    public static SubLObject f27636(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0077.f5320(var40, $g3256$.getDynamicValue(var41));
    }
    
    public static SubLObject f27633(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = (SubLObject)NIL;
        final SubLObject var52 = module0363.f24514(var40);
        final SubLObject var53 = module0034.$g879$.currentBinding(var49);
        try {
            module0034.$g879$.bind(var52, var49);
            SubLObject var54 = (SubLObject)NIL;
            if (NIL != var52 && NIL == module0034.f1842(var52)) {
                var54 = module0034.f1869(var52);
                final SubLObject var55 = Threads.current_process();
                if (NIL == var54) {
                    module0034.f1873(var52, var55);
                }
                else if (!var54.eql(var55)) {
                    Errors.error((SubLObject)$ic72$);
                }
            }
            try {
                var49.resetMultipleValues();
                final SubLObject var77_78 = f27637(var40, var48);
                final SubLObject var79_80 = var49.secondMultipleValue();
                var49.resetMultipleValues();
                var50 = var77_78;
                var51 = var79_80;
            }
            finally {
                final SubLObject var67_81 = Threads.$is_thread_performing_cleanupP$.currentBinding(var49);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var49);
                    if (NIL != var52 && NIL == var54) {
                        module0034.f1873(var52, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var67_81, var49);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var53, var49);
        }
        return Values.values(var50, var51);
    }
    
    public static SubLObject f27638(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)ZERO_INTEGER;
        SubLObject var51 = (SubLObject)ZERO_INTEGER;
        SubLObject var52 = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)NIL;
        if (NIL != f27636(var40)) {
            return Values.values((SubLObject)$ic71$, (SubLObject)$ic71$);
        }
        f27635(var40);
        final SubLObject var55 = module0363.f24530(var40);
        SubLObject var56;
        SubLObject var57;
        SubLObject var58;
        SubLObject var59;
        SubLObject var60;
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        SubLObject var66;
        for (var56 = module0032.f1741(var55), var57 = (SubLObject)NIL, var57 = module0032.f1742(var56, var55); NIL == module0032.f1744(var56, var57); var57 = module0032.f1743(var57)) {
            var58 = module0032.f1745(var56, var57);
            if (NIL != module0032.f1746(var57, var58)) {
                var59 = module0364.f24725(var58);
                var60 = (SubLObject)ZERO_INTEGER;
                var61 = (SubLObject)ZERO_INTEGER;
                var62 = (SubLObject)NIL;
                if (NIL != module0377.f26780(var58)) {
                    var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                    if (NIL != module0363.f24547(var40, var48)) {
                        var63 = ((NIL != module0377.f26746(var58)) ? var58 : module0378.f26873(var58));
                        if (NIL != f27639(var63)) {
                            var60 = Numbers.add(var60, (SubLObject)ONE_INTEGER);
                        }
                        else if (NIL != f27640(var63)) {
                            var60 = Numbers.subtract(var60, (SubLObject)ONE_INTEGER);
                        }
                        else if (NIL != f27641(var63)) {
                            var60 = Numbers.add(var60, f27642(var63));
                        }
                    }
                }
                if (NIL == module0374.f26529(var58)) {
                    var49.resetMultipleValues();
                    var64 = f27633(var59, var48);
                    var65 = var49.secondMultipleValue();
                    var49.resetMultipleValues();
                    if ($ic71$ == var65) {
                        var62 = (SubLObject)T;
                        var53 = (SubLObject)T;
                    }
                    else {
                        var54 = (SubLObject)T;
                        var60 = Numbers.add(var60, var64);
                        var61 = Numbers.add(var61, var65);
                    }
                }
                if (NIL == var62) {
                    var66 = (SubLObject)(var61.isZero() ? ZERO_INTEGER : Numbers.divide(var60, var61));
                    if (var66.numG(var52) || (var66.numE(var52) && var61.numL(var51))) {
                        var50 = var60;
                        var51 = var61;
                        var52 = var66;
                    }
                }
            }
        }
        if (NIL != var53 && NIL == var54) {
            return Values.values((SubLObject)$ic71$, (SubLObject)$ic71$);
        }
        return Values.values(var50, var51);
    }
    
    public static SubLObject f27637(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0034.$g879$.getDynamicValue(var49);
        SubLObject var51 = (SubLObject)NIL;
        if (NIL == var50) {
            return f27638(var40, var48);
        }
        var51 = module0034.f1857(var50, (SubLObject)$ic73$, (SubLObject)UNPROVIDED);
        if (NIL == var51) {
            var51 = module0034.f1807(module0034.f1842(var50), (SubLObject)$ic73$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var50, (SubLObject)$ic73$, var51);
        }
        final SubLObject var52 = module0034.f1782(var40, var48);
        final SubLObject var53 = module0034.f1814(var51, var52, (SubLObject)UNPROVIDED);
        if (var53 != $ic40$) {
            SubLObject var54 = var53;
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                SubLObject var56 = var55.first();
                final SubLObject var57 = conses_high.second(var55);
                if (var40.eql(var56.first())) {
                    var56 = var56.rest();
                    if (NIL != var56 && NIL == var56.rest() && var48.eql(var56.first())) {
                        return module0034.f1959(var57);
                    }
                }
                var54 = var54.rest();
                var55 = var54.first();
            }
        }
        final SubLObject var58 = Values.arg2(var49.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27638(var40, var48)));
        module0034.f1836(var51, var52, var53, var58, (SubLObject)ConsesLow.list(var40, var48));
        return module0034.f1959(var58);
    }
    
    public static SubLObject f27634(final SubLObject var63) {
        SubLObject var64 = (SubLObject)ZERO_INTEGER;
        SubLObject var65 = (SubLObject)ZERO_INTEGER;
        if (NIL != module0377.f26771(var63)) {
            if (NIL != f27643(var63)) {
                var64 = Numbers.add(var64, (SubLObject)ONE_INTEGER);
                var65 = Numbers.add(var65, (SubLObject)ONE_INTEGER);
            }
            else if (NIL != f27644(var63)) {
                var64 = Numbers.subtract(var64, (SubLObject)ONE_INTEGER);
                var65 = Numbers.add(var65, (SubLObject)ONE_INTEGER);
            }
            else if (NIL != f27645(var63)) {
                var64 = Numbers.add(var64, f27646(var63));
                var65 = Numbers.add(var65, (SubLObject)ONE_INTEGER);
            }
            else if (NIL != module0377.f26775(var63)) {
                var65 = Numbers.add(var65, (SubLObject)ONE_INTEGER);
            }
        }
        return Values.values(var64, var65);
    }
    
    public static SubLObject f27639(final SubLObject var103) {
        final SubLObject var104 = module0377.f26781(var103);
        final SubLObject var105 = module0364.f24725(var103);
        return f27647(var104, var105);
    }
    
    public static SubLObject f27640(final SubLObject var103) {
        final SubLObject var104 = module0377.f26781(var103);
        final SubLObject var105 = module0364.f24725(var103);
        return f27648(var104, var105);
    }
    
    public static SubLObject f27641(final SubLObject var103) {
        final SubLObject var104 = module0377.f26781(var103);
        final SubLObject var105 = module0364.f24725(var103);
        return f27649(var104, var105);
    }
    
    public static SubLObject f27642(final SubLObject var103) {
        final SubLObject var104 = module0377.f26781(var103);
        final SubLObject var105 = module0364.f24725(var103);
        final SubLObject var106 = module0363.f24565(var105);
        return module0349.f23490(var104, var106);
    }
    
    public static SubLObject f27643(final SubLObject var64) {
        final SubLObject var65 = module0377.f26775(var64);
        if (NIL != var65) {
            final SubLObject var66 = module0365.f24850(var64);
            return f27647(var65, var66);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27644(final SubLObject var64) {
        final SubLObject var65 = module0377.f26775(var64);
        if (NIL != var65) {
            final SubLObject var66 = module0365.f24850(var64);
            return f27648(var65, var66);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27645(final SubLObject var64) {
        final SubLObject var65 = module0377.f26775(var64);
        if (NIL != var65) {
            final SubLObject var66 = module0365.f24850(var64);
            return f27649(var65, var66);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27646(final SubLObject var64) {
        final SubLObject var65 = module0377.f26775(var64);
        if (NIL != var65) {
            final SubLObject var66 = module0365.f24850(var64);
            final SubLObject var67 = module0363.f24565(var66);
            return module0349.f23490(var65, var67);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27647(final SubLObject var104, final SubLObject var40) {
        final SubLObject var105 = module0363.f24566(var40);
        final SubLObject var106 = module0178.f11287(var104);
        if (NIL != module0349.f23481(var106, var105)) {
            return (SubLObject)T;
        }
        if (NIL == module0211.f13700(var104)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0349.f23482(var104, var105)) {
            return (SubLObject)T;
        }
        final SubLObject var107 = module0363.f24563(var40);
        return module0349.f23483(var107, var104, var105);
    }
    
    public static SubLObject f27648(final SubLObject var104, final SubLObject var40) {
        final SubLObject var105 = module0363.f24566(var40);
        final SubLObject var106 = module0178.f11287(var104);
        if (NIL != module0349.f23485(var106, var105)) {
            return (SubLObject)T;
        }
        if (NIL == module0211.f13700(var104)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0349.f23486(var104, var105)) {
            return (SubLObject)T;
        }
        final SubLObject var107 = module0363.f24563(var40);
        return module0349.f23487(var107, var104, var105);
    }
    
    public static SubLObject f27649(final SubLObject var104, final SubLObject var40) {
        final SubLObject var105 = module0363.f24566(var40);
        if (NIL == module0211.f13700(var104)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0349.f23489(var104, var105)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27650(final SubLObject var104) {
        if (NIL != module0349.f23482(var104, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ONE_INTEGER;
        }
        if (NIL != module0349.f23486(var104, (SubLObject)UNPROVIDED)) {
            return (SubLObject)MINUS_ONE_INTEGER;
        }
        if (NIL != module0349.f23489(var104, (SubLObject)UNPROVIDED)) {
            return module0349.f23490(var104, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f27651(final SubLObject var104) {
        final SubLObject var105 = Numbers.truncate(Numbers.multiply((SubLObject)$ic66$, f27650(var104)), (SubLObject)UNPROVIDED);
        return var105;
    }
    
    public static SubLObject f27652(final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        final SubLObject var106 = module0034.$g879$.getDynamicValue(var105);
        SubLObject var107 = (SubLObject)NIL;
        if (NIL == var106) {
            return f27651(var104);
        }
        var107 = module0034.f1857(var106, (SubLObject)$ic74$, (SubLObject)UNPROVIDED);
        if (NIL == var107) {
            var107 = module0034.f1807(module0034.f1842(var106), (SubLObject)$ic74$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var106, (SubLObject)$ic74$, var107);
        }
        SubLObject var108 = module0034.f1814(var107, var104, (SubLObject)$ic40$);
        if (var108 == $ic40$) {
            var108 = Values.arg2(var105.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27651(var104)));
            module0034.f1816(var107, var104, var108, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var108);
    }
    
    public static SubLObject f27653(final SubLObject var39, final SubLObject var40) {
        return f27632(var39, var40, var40);
    }
    
    public static SubLObject f27654(final SubLObject var39, final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (NIL == $g3257$.getDynamicValue(var41)) {
            return (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var42 = f27655(var40);
        SubLObject var43 = Numbers.multiply(var42, (SubLObject)TWENTY_INTEGER);
        var43 = Numbers.min(var43, (SubLObject)$ic66$);
        var43 = Numbers.max(var43, (SubLObject)$ic48$);
        return var43;
    }
    
    public static SubLObject f27655(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)NIL;
        final SubLObject var43 = module0363.f24514(var40);
        final SubLObject var44 = module0034.$g879$.currentBinding(var41);
        try {
            module0034.$g879$.bind(var43, var41);
            SubLObject var45 = (SubLObject)NIL;
            if (NIL != var43 && NIL == module0034.f1842(var43)) {
                var45 = module0034.f1869(var43);
                final SubLObject var46 = Threads.current_process();
                if (NIL == var45) {
                    module0034.f1873(var43, var46);
                }
                else if (!var45.eql(var46)) {
                    Errors.error((SubLObject)$ic72$);
                }
            }
            try {
                var42 = f27656(var40);
            }
            finally {
                final SubLObject var67_112 = Threads.$is_thread_performing_cleanupP$.currentBinding(var41);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var41);
                    if (NIL != var43 && NIL == var45) {
                        module0034.f1873(var43, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var67_112, var41);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var44, var41);
        }
        return var42;
    }
    
    public static SubLObject f27657(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)NIL;
        final SubLObject var43 = $g3258$.currentBinding(var41);
        final SubLObject var44 = $g3259$.currentBinding(var41);
        try {
            $g3258$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var41);
            $g3259$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var41);
            SubLObject var45 = module0363.f24509(var40);
            SubLObject var46 = (SubLObject)NIL;
            var46 = var45.first();
            while (NIL != var45) {
                SubLObject var47 = (SubLObject)$ic82$;
                SubLObject var48 = (SubLObject)ZERO_INTEGER;
                SubLObject var62_117 = module0232.f15306(var46);
                SubLObject var49 = (SubLObject)NIL;
                var49 = var62_117.first();
                while (NIL != var62_117) {
                    SubLObject var51;
                    final SubLObject var50 = var51 = var49;
                    SubLObject var52 = (SubLObject)NIL;
                    SubLObject var53 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic83$);
                    var52 = var51.first();
                    var51 = var51.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic83$);
                    var53 = var51.first();
                    var51 = var51.rest();
                    if (NIL == var51) {
                        final SubLObject var54 = module0147.f9540(var52);
                        final SubLObject var67_122 = module0147.$g2095$.currentBinding(var41);
                        final SubLObject var113_123 = module0147.$g2094$.currentBinding(var41);
                        final SubLObject var55 = module0147.$g2096$.currentBinding(var41);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var54), var41);
                            module0147.$g2094$.bind(module0147.f9546(var54), var41);
                            module0147.$g2096$.bind(module0147.f9549(var54), var41);
                            f27658(var53);
                        }
                        finally {
                            module0147.$g2096$.rebind(var55, var41);
                            module0147.$g2094$.rebind(var113_123, var41);
                            module0147.$g2095$.rebind(var67_122, var41);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)$ic83$);
                    }
                    var48 = Numbers.add(var48, (SubLObject)ONE_INTEGER);
                    var62_117 = var62_117.rest();
                    var49 = var62_117.first();
                }
                var47 = (SubLObject)$ic84$;
                var48 = (SubLObject)ZERO_INTEGER;
                SubLObject var62_118 = module0232.f15308(var46);
                var49 = (SubLObject)NIL;
                var49 = var62_118.first();
                while (NIL != var62_118) {
                    SubLObject var57;
                    final SubLObject var56 = var57 = var49;
                    SubLObject var52 = (SubLObject)NIL;
                    SubLObject var53 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic83$);
                    var52 = var57.first();
                    var57 = var57.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)$ic83$);
                    var53 = var57.first();
                    var57 = var57.rest();
                    if (NIL == var57) {
                        final SubLObject var54 = module0147.f9540(var52);
                        final SubLObject var67_123 = module0147.$g2095$.currentBinding(var41);
                        final SubLObject var113_124 = module0147.$g2094$.currentBinding(var41);
                        final SubLObject var55 = module0147.$g2096$.currentBinding(var41);
                        try {
                            module0147.$g2095$.bind(module0147.f9545(var54), var41);
                            module0147.$g2094$.bind(module0147.f9546(var54), var41);
                            module0147.$g2096$.bind(module0147.f9549(var54), var41);
                            f27658(var53);
                        }
                        finally {
                            module0147.$g2096$.rebind(var55, var41);
                            module0147.$g2094$.rebind(var113_124, var41);
                            module0147.$g2095$.rebind(var67_123, var41);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var56, (SubLObject)$ic83$);
                    }
                    var48 = Numbers.add(var48, (SubLObject)ONE_INTEGER);
                    var62_118 = var62_118.rest();
                    var49 = var62_118.first();
                }
                var45 = var45.rest();
                var46 = var45.first();
            }
            var42 = Numbers.subtract(module0077.f5311($g3258$.getDynamicValue(var41)), module0077.f5311($g3259$.getDynamicValue(var41)));
        }
        finally {
            $g3259$.rebind(var44, var41);
            $g3258$.rebind(var43, var41);
        }
        return var42;
    }
    
    public static SubLObject f27656(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        final SubLObject var42 = module0034.$g879$.getDynamicValue(var41);
        SubLObject var43 = (SubLObject)NIL;
        if (NIL == var42) {
            return f27657(var40);
        }
        var43 = module0034.f1857(var42, (SubLObject)$ic81$, (SubLObject)UNPROVIDED);
        if (NIL == var43) {
            var43 = module0034.f1807(module0034.f1842(var42), (SubLObject)$ic81$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var42, (SubLObject)$ic81$, var43);
        }
        SubLObject var44 = module0034.f1814(var43, var40, (SubLObject)$ic40$);
        if (var44 == $ic40$) {
            var44 = Values.arg2(var41.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27657(var40)));
            module0034.f1816(var43, var40, var44, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var44);
    }
    
    public static SubLObject f27658(final SubLObject var130) {
        return module0205.f13228((SubLObject)$ic85$, var130, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27659(final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var131)) {
            if (NIL != module0349.f23484(var131, (SubLObject)UNPROVIDED)) {
                module0077.f5326(var131, $g3258$.getDynamicValue(var132));
            }
            if (NIL != module0349.f23488(var131, (SubLObject)UNPROVIDED)) {
                module0077.f5326(var131, $g3259$.getDynamicValue(var132));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27660() {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        return $g3260$.getDynamicValue(var37);
    }
    
    public static SubLObject f27661() {
        $g3260$.setDynamicValue((SubLObject)T);
        return (SubLObject)T;
    }
    
    public static SubLObject f27662() {
        $g3260$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27663(final SubLObject var39, final SubLObject var53) {
        return f27664(var39, module0365.f24850(var53), var53);
    }
    
    public static SubLObject f27664(final SubLObject var39, final SubLObject var40, final SubLObject var15) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (NIL == $g3260$.getDynamicValue(var41)) {
            return (SubLObject)ZERO_INTEGER;
        }
        SubLObject var42 = (SubLObject)$ic66$;
        final SubLObject var43 = module0367.f25037(var39);
        if (NIL != module0408.f28461(var43) && (NIL != module0373.f26366(var40, var43) || NIL != module0377.f26771(var15))) {
            final SubLObject var44 = $g3261$.currentBinding(var41);
            try {
                $g3261$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED), var41);
                var41.resetMultipleValues();
                SubLObject var45 = f27665(var40, var43);
                SubLObject var46 = var41.secondMultipleValue();
                var41.resetMultipleValues();
                if ($ic71$ != var46) {
                    if (NIL != module0373.f26176(var15)) {
                        var41.resetMultipleValues();
                        final SubLObject var47 = f27666(var15);
                        final SubLObject var48 = var41.secondMultipleValue();
                        var41.resetMultipleValues();
                        var45 = Numbers.add(var45, var47);
                        var46 = Numbers.add(var46, var48);
                    }
                    if (!var46.isZero()) {
                        var42 = Numbers.integerDivide(var45, var46);
                    }
                }
            }
            finally {
                $g3261$.rebind(var44, var41);
            }
        }
        return var42;
    }
    
    public static SubLObject f27667(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0077.f5326(var40, $g3261$.getDynamicValue(var41));
    }
    
    public static SubLObject f27668(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0077.f5320(var40, $g3261$.getDynamicValue(var41));
    }
    
    public static SubLObject f27665(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = (SubLObject)NIL;
        final SubLObject var52 = module0363.f24514(var40);
        final SubLObject var53 = module0034.$g879$.currentBinding(var49);
        try {
            module0034.$g879$.bind(var52, var49);
            SubLObject var54 = (SubLObject)NIL;
            if (NIL != var52 && NIL == module0034.f1842(var52)) {
                var54 = module0034.f1869(var52);
                final SubLObject var55 = Threads.current_process();
                if (NIL == var54) {
                    module0034.f1873(var52, var55);
                }
                else if (!var54.eql(var55)) {
                    Errors.error((SubLObject)$ic72$);
                }
            }
            try {
                var49.resetMultipleValues();
                final SubLObject var136_137 = f27669(var40, var48);
                final SubLObject var138_139 = var49.secondMultipleValue();
                var49.resetMultipleValues();
                var50 = var136_137;
                var51 = var138_139;
            }
            finally {
                final SubLObject var67_140 = Threads.$is_thread_performing_cleanupP$.currentBinding(var49);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var49);
                    if (NIL != var52 && NIL == var54) {
                        module0034.f1873(var52, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var67_140, var49);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var53, var49);
        }
        return Values.values(var50, var51);
    }
    
    public static SubLObject f27670(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)ZERO_INTEGER;
        SubLObject var51 = (SubLObject)ZERO_INTEGER;
        SubLObject var52 = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)NIL;
        if (NIL != f27668(var40)) {
            return Values.values((SubLObject)$ic71$, (SubLObject)$ic71$);
        }
        f27667(var40);
        final SubLObject var55 = module0363.f24530(var40);
        SubLObject var56;
        SubLObject var57;
        SubLObject var58;
        SubLObject var59;
        SubLObject var60;
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        SubLObject var66;
        SubLObject var67;
        for (var56 = module0032.f1741(var55), var57 = (SubLObject)NIL, var57 = module0032.f1742(var56, var55); NIL == module0032.f1744(var56, var57); var57 = module0032.f1743(var57)) {
            var58 = module0032.f1745(var56, var57);
            if (NIL != module0032.f1746(var57, var58)) {
                var59 = module0364.f24725(var58);
                var60 = (SubLObject)ZERO_INTEGER;
                var61 = (SubLObject)ZERO_INTEGER;
                var62 = (SubLObject)NIL;
                if (NIL != module0377.f26780(var58)) {
                    var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                    if (NIL != module0363.f24547(var40, var48)) {
                        var63 = module0377.f26781(var58);
                        var64 = module0414.f28917(var63);
                        var60 = Numbers.add(var60, var64);
                    }
                }
                if (NIL == module0374.f26529(var58)) {
                    var49.resetMultipleValues();
                    var65 = f27665(var59, var48);
                    var66 = var49.secondMultipleValue();
                    var49.resetMultipleValues();
                    if ($ic71$ == var66) {
                        var62 = (SubLObject)T;
                        var53 = (SubLObject)T;
                    }
                    else {
                        var54 = (SubLObject)T;
                        var60 = Numbers.add(var60, var65);
                        var61 = Numbers.add(var61, var66);
                    }
                }
                if (NIL == var62) {
                    var67 = (SubLObject)(var61.isZero() ? ZERO_INTEGER : Numbers.divide(var60, var61));
                    if (var67.numG(var52) || (var67.numE(var52) && var61.numL(var51))) {
                        var50 = var60;
                        var51 = var61;
                        var52 = var67;
                    }
                }
            }
        }
        if (NIL != var53 && NIL == var54) {
            return Values.values((SubLObject)$ic71$, (SubLObject)$ic71$);
        }
        return Values.values(var50, var51);
    }
    
    public static SubLObject f27669(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0034.$g879$.getDynamicValue(var49);
        SubLObject var51 = (SubLObject)NIL;
        if (NIL == var50) {
            return f27670(var40, var48);
        }
        var51 = module0034.f1857(var50, (SubLObject)$ic89$, (SubLObject)UNPROVIDED);
        if (NIL == var51) {
            var51 = module0034.f1807(module0034.f1842(var50), (SubLObject)$ic89$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var50, (SubLObject)$ic89$, var51);
        }
        final SubLObject var52 = module0034.f1782(var40, var48);
        final SubLObject var53 = module0034.f1814(var51, var52, (SubLObject)UNPROVIDED);
        if (var53 != $ic40$) {
            SubLObject var54 = var53;
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                SubLObject var56 = var55.first();
                final SubLObject var57 = conses_high.second(var55);
                if (var40.eql(var56.first())) {
                    var56 = var56.rest();
                    if (NIL != var56 && NIL == var56.rest() && var48.eql(var56.first())) {
                        return module0034.f1959(var57);
                    }
                }
                var54 = var54.rest();
                var55 = var54.first();
            }
        }
        final SubLObject var58 = Values.arg2(var49.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27670(var40, var48)));
        module0034.f1836(var51, var52, var53, var58, (SubLObject)ConsesLow.list(var40, var48));
        return module0034.f1959(var58);
    }
    
    public static SubLObject f27666(final SubLObject var63) {
        SubLObject var64 = (SubLObject)ZERO_INTEGER;
        SubLObject var65 = (SubLObject)ZERO_INTEGER;
        if (NIL != module0377.f26771(var63)) {
            final SubLObject var66 = module0377.f26775(var63);
            if (NIL != var66) {
                var64 = Numbers.add(var64, module0414.f28917(var66));
                var65 = Numbers.add(var65, (SubLObject)ONE_INTEGER);
            }
        }
        return Values.values(var64, var65);
    }
    
    public static SubLObject f27671(final SubLObject var48, final SubLObject var145, final SubLObject var146) {
        final SubLObject var147 = inference_datastructures_inference_oc.f25608(var48, var145);
        final SubLObject var148 = inference_datastructures_inference_oc.f25608(var48, var146);
        if (NIL != var147) {
            if (NIL != var148) {
                return f27672(var145, var146);
            }
            return (SubLObject)T;
        }
        else {
            if (NIL != var148) {
                return (SubLObject)NIL;
            }
            return f27672(var145, var146);
        }
    }
    
    public static SubLObject f27673(final SubLObject var145, final SubLObject var146) {
        return Numbers.numG(f27674(var145), f27674(var146));
    }
    
    public static SubLObject f27672(final SubLObject var145, final SubLObject var146) {
        if (NIL != f27673(var145, var146)) {
            return (SubLObject)T;
        }
        if (NIL != f27673(var146, var145)) {
            return (SubLObject)NIL;
        }
        return Numbers.numL(module0211.f13692(var145), module0211.f13692(var146));
    }
    
    public static SubLObject f27675(final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        assert NIL != module0178.f11290(var104) : var104;
        final SubLObject var106 = (SubLObject)((NIL != $g3260$.getDynamicValue(var105)) ? module0414.f28917(var104) : ZERO_INTEGER);
        final SubLObject var107 = f27652(var104);
        return Numbers.add(var106, var107);
    }
    
    public static SubLObject f27674(final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        final SubLObject var106 = module0034.$g879$.getDynamicValue(var105);
        SubLObject var107 = (SubLObject)NIL;
        if (NIL == var106) {
            return f27675(var104);
        }
        var107 = module0034.f1857(var106, (SubLObject)$ic90$, (SubLObject)UNPROVIDED);
        if (NIL == var107) {
            var107 = module0034.f1807(module0034.f1842(var106), (SubLObject)$ic90$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var106, (SubLObject)$ic90$, var107);
        }
        SubLObject var108 = module0034.f1814(var107, var104, (SubLObject)$ic40$);
        if (var108 == $ic40$) {
            var108 = Values.arg2(var105.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27675(var104)));
            module0034.f1816(var107, var104, var108, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var108);
    }
    
    public static SubLObject f27676(final SubLObject var39, final SubLObject var40) {
        return f27664(var39, var40, var40);
    }
    
    public static SubLObject f27677() {
        module0402.f28291((SubLObject)$ic95$);
        $g3262$.setDynamicValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27678() {
        module0402.f28292((SubLObject)$ic95$);
        $g3262$.setDynamicValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27679(final SubLObject var39, final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        if (NIL == $g3262$.getDynamicValue(var54)) {
            return (SubLObject)ZERO_INTEGER;
        }
        SubLObject var55 = (SubLObject)$ic66$;
        final SubLObject var56 = module0367.f25037(var39);
        if (NIL != module0408.f28461(var56)) {
            final SubLObject var57 = module0365.f24850(var53);
            if (NIL != module0373.f26366(var57, var56) || NIL != module0377.f26771(var53)) {
                final SubLObject var58 = f27680(var53, var56);
                SubLObject var59 = (SubLObject)ZERO_INTEGER;
                SubLObject var60 = (SubLObject)NIL;
                SubLObject var61 = var58;
                SubLObject var62 = (SubLObject)NIL;
                var62 = var61.first();
                while (NIL != var61) {
                    if (NIL != module0035.f2000(var62, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                        final SubLObject var63 = module0414.f28970(var62);
                        var60 = (SubLObject)T;
                        var59 = Numbers.max(var59, var63);
                    }
                    var61 = var61.rest();
                    var62 = var61.first();
                }
                if (NIL != var60) {
                    var55 = var59;
                }
            }
        }
        return var55;
    }
    
    public static SubLObject f27681(final SubLObject var40, final SubLObject var48) {
        if (NIL != module0363.f24547(var40, var48)) {
            return Sequences.nreverse(f27682(var40, var48, (SubLObject)NIL));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27683(final SubLObject var40, final SubLObject var48) {
        return f27681(var40, var48);
    }
    
    public static SubLObject f27684(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0034.$g879$.getDynamicValue(var49);
        SubLObject var51 = (SubLObject)NIL;
        if (NIL == var50) {
            return f27683(var40, var48);
        }
        var51 = module0034.f1857(var50, (SubLObject)$ic98$, (SubLObject)UNPROVIDED);
        if (NIL == var51) {
            var51 = module0034.f1807(module0034.f1842(var50), (SubLObject)$ic98$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var50, (SubLObject)$ic98$, var51);
        }
        final SubLObject var52 = module0034.f1782(var40, var48);
        final SubLObject var53 = module0034.f1814(var51, var52, (SubLObject)UNPROVIDED);
        if (var53 != $ic40$) {
            SubLObject var54 = var53;
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                SubLObject var56 = var55.first();
                final SubLObject var57 = conses_high.second(var55);
                if (var40.eql(var56.first())) {
                    var56 = var56.rest();
                    if (NIL != var56 && NIL == var56.rest() && var48.eql(var56.first())) {
                        return module0034.f1959(var57);
                    }
                }
                var54 = var54.rest();
                var55 = var54.first();
            }
        }
        final SubLObject var58 = Values.arg2(var49.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27683(var40, var48)));
        module0034.f1836(var51, var52, var53, var58, (SubLObject)ConsesLow.list(var40, var48));
        return module0034.f1959(var58);
    }
    
    public static SubLObject f27682(final SubLObject var40, final SubLObject var48, final SubLObject var156) {
        final SubLObject var157 = (SubLObject)ConsesLow.cons(var40, var156);
        SubLObject var158 = (SubLObject)NIL;
        final SubLObject var159 = module0363.f24530(var40);
        SubLObject var160;
        SubLObject var161;
        SubLObject var162;
        SubLObject var163;
        SubLObject var165;
        SubLObject var164;
        SubLObject var166;
        for (var160 = module0032.f1741(var159), var161 = (SubLObject)NIL, var161 = module0032.f1742(var160, var159); NIL == module0032.f1744(var160, var161); var161 = module0032.f1743(var161)) {
            var162 = module0032.f1745(var160, var161);
            if (NIL != module0032.f1746(var161, var162) && NIL != module0364.f24759(var162)) {
                if (var48.eql(module0364.f24724(var162))) {
                    var158 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var162), var158);
                }
                else {
                    var163 = module0364.f24725(var162);
                    if (NIL == module0035.f2169(var163, var157) && NIL != module0363.f24547(var163, var48)) {
                        var164 = (var165 = f27682(var163, var48, var157));
                        var166 = (SubLObject)NIL;
                        var166 = var165.first();
                        while (NIL != var165) {
                            var158 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var162, var166), var158);
                            var165 = var165.rest();
                            var166 = var165.first();
                        }
                    }
                }
            }
        }
        return var158;
    }
    
    public static SubLObject f27685(final SubLObject var40, final SubLObject var48) {
        assert NIL != module0363.f24478(var40) : var40;
        assert NIL != inference_datastructures_inference_oc.f25275(var48) : var48;
        final SubLObject var49 = f27681(var40, var48);
        final SubLObject var50 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic101$), var49);
        return Sequences.delete_duplicates(var50, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27680(final SubLObject var63, final SubLObject var48) {
        assert NIL != module0365.f24819(var63) : var63;
        assert NIL != inference_datastructures_inference_oc.f25275(var48) : var48;
        final SubLObject var64 = module0365.f24850(var63);
        final SubLObject var65 = f27685(var64, var48);
        if (NIL == module0377.f26771(var63)) {
            return var65;
        }
        final SubLObject var66 = module0377.f26775(var63);
        if (NIL == var66) {
            return var65;
        }
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = var65;
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            SubLObject var70 = conses_high.adjoin(var66, var69, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            final SubLObject var71;
            var70 = (var71 = Sort.sort(var70, Symbols.symbol_function((SubLObject)$ic103$), Symbols.symbol_function((SubLObject)$ic104$)));
            if (NIL == conses_high.member(var71, var67, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var67 = (SubLObject)ConsesLow.cons(var71, var67);
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        return Sequences.nreverse(var67);
    }
    
    public static SubLObject f27686(final SubLObject var168) {
        SubLObject var169 = (SubLObject)NIL;
        SubLObject var170 = var168;
        SubLObject var171 = (SubLObject)NIL;
        var171 = var170.first();
        while (NIL != var170) {
            if (NIL != module0377.f26780(var171)) {
                final SubLObject var173;
                final SubLObject var172 = var173 = module0377.f26781(var171);
                if (NIL == conses_high.member(var173, var169, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var169 = (SubLObject)ConsesLow.cons(var173, var169);
                }
            }
            var170 = var170.rest();
            var171 = var170.first();
        }
        var169 = Sort.sort(var169, Symbols.symbol_function((SubLObject)$ic103$), Symbols.symbol_function((SubLObject)$ic104$));
        return var169;
    }
    
    public static SubLObject f27687(final SubLObject var39, final SubLObject var40) {
        final SubLObject var41 = module0363.f24560(var40, (SubLObject)UNPROVIDED);
        final SubLObject var42 = f27688(var41);
        return var42;
    }
    
    public static SubLObject f27689(final SubLObject var39, final SubLObject var64) {
        if (NIL == module0377.f26771(var64)) {
            return (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var65 = module0377.f26775(var64);
        if (NIL != var65) {
            final SubLObject var66 = module0211.f13692(var65);
            final SubLObject var67 = f27688(var66);
            return var67;
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f27688(final SubLObject var171) {
        return f27625(var171, $g3263$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27625(final SubLObject var172, final SubLObject var173, SubLObject var174) {
        if (var174 == UNPROVIDED) {
            var174 = (SubLObject)NIL;
        }
        SubLObject var175 = var173;
        SubLObject var176 = (SubLObject)NIL;
        var176 = var175.first();
        while (NIL != var175) {
            SubLObject var178;
            final SubLObject var177 = var178 = var176;
            SubLObject var179 = (SubLObject)NIL;
            SubLObject var180 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var178, var177, (SubLObject)$ic112$);
            var179 = var178.first();
            var178 = (var180 = var178.rest());
            if (NIL != module0048.f3335(var172, var179)) {
                return var180;
            }
            var175 = var175.rest();
            var176 = var175.first();
        }
        return var174;
    }
    
    public static SubLObject f27690(final SubLObject var39, final SubLObject var40) {
        final SubLObject var41 = f27691(var40);
        final SubLObject var42 = f27692(var41);
        return var42;
    }
    
    public static SubLObject f27691(final SubLObject var40) {
        final SubLObject var41 = module0363.f24509(var40);
        return module0035.f2451((SubLObject)$ic116$, var41, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27692(final SubLObject var180) {
        return f27625(var180, $g3264$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f27693(final SubLObject var39, final SubLObject var182, final SubLObject var183) {
        final SubLThread var184 = SubLProcess.currentSubLThread();
        SubLObject var185 = (SubLObject)NIL;
        SubLObject var186 = (SubLObject)ZERO_INTEGER;
        SubLObject var187;
        for (var187 = module0066.f4838(module0067.f4891(f27601())); NIL == module0066.f4841(var187); var187 = module0066.f4840(var187)) {
            var184.resetMultipleValues();
            final SubLObject var188 = module0066.f4839(var187);
            final SubLObject var189 = var184.secondMultipleValue();
            var184.resetMultipleValues();
            final SubLObject var190 = f27609(var188);
            final SubLObject var191 = f27610(var188);
            final SubLObject var192 = f27614(var188);
            if (NIL != f27603(var182, var192) && NIL != module0077.f5320(var188, var183)) {
                final SubLObject var193 = Functions.funcall(var190, var39, var182);
                if (!ZERO_INTEGER.eql(var193)) {
                    final SubLObject var194 = module0048.f3366(var193, var191);
                    var186 = module0048.f3364(var186, var194);
                    var185 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var188, var191, var193, var194), var185);
                }
            }
        }
        module0066.f4842(var187);
        var185 = Sort.sort(var185, Symbols.symbol_function((SubLObject)$ic118$), Symbols.symbol_function((SubLObject)$ic119$));
        var185 = Sort.stable_sort(var185, Symbols.symbol_function((SubLObject)$ic118$), Symbols.symbol_function((SubLObject)$ic120$));
        return Values.values(var185, var186);
    }
    
    public static SubLObject f27694(final SubLObject var39, final SubLObject var63) {
        if (NIL != module0373.f26146(var63)) {
            return (SubLObject)ONE_INTEGER;
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f27695() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27601", "S#30702", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0389", "f27602", "S#30703");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27603", "S#30704", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27605", "S#30705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27604", "S#30706", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27606", "S#30707", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27607", "S#30708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27608", "S#30709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27609", "S#30710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27610", "S#30711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27611", "S#30712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27612", "S#30713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27613", "S#30714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27614", "S#30715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27615", "S#30687", 2, 0, false);
        new $f27615$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27616", "S#30716", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27617", "S#30717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27619", "S#30718", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27620", "S#30719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27621", "S#30720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27618", "S#30721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27622", "S#30689", 2, 0, false);
        new $f27622$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27623", "S#30690", 2, 0, false);
        new $f27623$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27624", "S#30722", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27626", "S#30723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27627", "S#30692", 2, 0, false);
        new $f27627$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27628", "S#30724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27629", "S#30725", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27630", "S#30693", 2, 0, false);
        new $f27630$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27631", "S#30694", 2, 0, false);
        new $f27631$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27632", "S#30726", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27635", "S#30727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27636", "S#30728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27633", "S#30729", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27638", "S#30730", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27637", "S#30731", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27634", "S#30732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27639", "S#30733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27640", "S#30734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27641", "S#30735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27642", "S#30736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27643", "S#30737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27644", "S#30738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27645", "S#30739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27646", "S#30740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27647", "S#30741", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27648", "S#30742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27649", "S#30743", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27650", "S#30744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27651", "S#30745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27652", "S#30746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27653", "S#30747", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27654", "S#30695", 2, 0, false);
        new $f27654$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27655", "S#30748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27657", "S#30749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27656", "S#30750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27658", "S#30751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27659", "S#30752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27660", "S#30753", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27661", "S#30754", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27662", "S#30755", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27663", "S#30696", 2, 0, false);
        new $f27663$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27664", "S#30756", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27667", "S#30757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27668", "S#30758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27665", "S#30759", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27670", "S#30760", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27669", "S#30761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27666", "S#30762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27671", "S#30763", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27673", "S#30764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27672", "S#30765", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27675", "S#30766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27674", "S#30767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27676", "S#30768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27677", "S#30769", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27678", "S#30770", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27679", "S#30771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27681", "S#30772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27683", "S#30773", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27684", "S#30774", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27682", "S#30775", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27685", "S#30776", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27680", "S#30777", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27686", "S#30778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27687", "S#30779", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27689", "S#30701", 2, 0, false);
        new $f27689$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27688", "S#30780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27625", "S#30781", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27690", "S#30782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27691", "S#30783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27692", "S#30784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27693", "S#30785", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0389", "f27694", "S#30786", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27696() {
        $g3246$ = SubLFiles.deflexical("S#30787", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g3246$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g3247$ = SubLFiles.deflexical("S#30788", (SubLObject)$ic17$);
        $g3248$ = SubLFiles.defvar("S#30789", (SubLObject)NIL);
        $g3249$ = SubLFiles.deflexical("S#30790", (SubLObject)NIL);
        $g3250$ = SubLFiles.deflexical("S#30791", (SubLObject)$ic47$);
        $g3251$ = SubLFiles.deflexical("S#30792", (SubLObject)$ic48$);
        $g3252$ = SubLFiles.defvar("S#30793", (SubLObject)T);
        $g3253$ = SubLFiles.deflexical("S#30794", (SubLObject)$ic59$);
        $g3254$ = SubLFiles.deflexical("S#30795", (SubLObject)$ic48$);
        $g3255$ = SubLFiles.defvar("S#30796", (SubLObject)$ic61$);
        $g3256$ = SubLFiles.defparameter("S#30797", (SubLObject)NIL);
        $g3257$ = SubLFiles.defvar("S#30798", (SubLObject)T);
        $g3258$ = SubLFiles.defparameter("S#30799", (SubLObject)NIL);
        $g3259$ = SubLFiles.defparameter("S#30800", (SubLObject)NIL);
        $g3260$ = SubLFiles.defvar("S#30801", (SubLObject)T);
        $g3261$ = SubLFiles.defparameter("S#30802", (SubLObject)NIL);
        $g3262$ = SubLFiles.defparameter("S#30803", (SubLObject)NIL);
        $g3263$ = SubLFiles.deflexical("S#30804", (SubLObject)$ic111$);
        $g3264$ = SubLFiles.deflexical("S#30805", (SubLObject)$ic117$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f27697() {
        module0003.f57((SubLObject)$ic0$);
        module0002.f50((SubLObject)$ic1$, (SubLObject)$ic2$);
        module0002.f50((SubLObject)$ic16$, (SubLObject)$ic2$);
        f27607((SubLObject)$ic34$, (SubLObject)$ic35$);
        module0012.f419((SubLObject)$ic36$);
        module0034.f1909((SubLObject)$ic38$);
        f27607((SubLObject)$ic41$, (SubLObject)$ic42$);
        module0012.f419((SubLObject)$ic44$);
        f27607((SubLObject)$ic45$, (SubLObject)$ic46$);
        module0012.f419((SubLObject)$ic49$);
        f27607((SubLObject)$ic50$, (SubLObject)$ic51$);
        module0012.f419((SubLObject)$ic52$);
        f27607((SubLObject)$ic53$, (SubLObject)$ic54$);
        module0012.f419((SubLObject)$ic56$);
        f27607((SubLObject)$ic57$, (SubLObject)$ic58$);
        module0012.f419((SubLObject)$ic60$);
        f27607((SubLObject)$ic64$, (SubLObject)$ic65$);
        module0012.f419((SubLObject)$ic67$);
        f27607((SubLObject)$ic68$, (SubLObject)$ic69$);
        module0012.f419((SubLObject)$ic70$);
        module0034.f1895((SubLObject)$ic73$);
        module0034.f1895((SubLObject)$ic74$);
        f27607((SubLObject)$ic75$, (SubLObject)$ic76$);
        module0012.f419((SubLObject)$ic77$);
        f27607((SubLObject)$ic78$, (SubLObject)$ic79$);
        module0012.f419((SubLObject)$ic80$);
        module0034.f1895((SubLObject)$ic81$);
        module0012.f419((SubLObject)$ic85$);
        f27607((SubLObject)$ic86$, (SubLObject)$ic87$);
        module0012.f419((SubLObject)$ic88$);
        module0034.f1895((SubLObject)$ic89$);
        module0034.f1895((SubLObject)$ic90$);
        f27607((SubLObject)$ic92$, (SubLObject)$ic93$);
        module0012.f419((SubLObject)$ic94$);
        f27607((SubLObject)$ic95$, (SubLObject)$ic96$);
        module0012.f419((SubLObject)$ic97$);
        module0034.f1895((SubLObject)$ic98$);
        f27607((SubLObject)$ic105$, (SubLObject)$ic106$);
        module0012.f419((SubLObject)$ic107$);
        f27607((SubLObject)$ic108$, (SubLObject)$ic109$);
        module0012.f419((SubLObject)$ic110$);
        f27607((SubLObject)$ic113$, (SubLObject)$ic114$);
        module0012.f419((SubLObject)$ic115$);
        f27607((SubLObject)$ic121$, (SubLObject)$ic122$);
        module0012.f419((SubLObject)$ic123$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f27695();
    }
    
    public void initializeVariables() {
        f27696();
    }
    
    public void runTopLevelForms() {
        f27697();
    }
    
    static {
        me = (SubLFile)new module0389();
        $g3246$ = null;
        $g3247$ = null;
        $g3248$ = null;
        $g3249$ = null;
        $g3250$ = null;
        $g3251$ = null;
        $g3252$ = null;
        $g3253$ = null;
        $g3254$ = null;
        $g3255$ = null;
        $g3256$ = null;
        $g3257$ = null;
        $g3258$ = null;
        $g3259$ = null;
        $g3260$ = null;
        $g3261$ = null;
        $g3262$ = null;
        $g3263$ = null;
        $g3264$ = null;
        $ic0$ = makeSymbol("S#30787", "CYC");
        $ic1$ = makeSymbol("S#30702", "CYC");
        $ic2$ = makeSymbol("S#30703", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#30806", "CYC"), (SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#30807", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("OBJECT"), (SubLObject)makeKeyword("DONE"));
        $ic5$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic6$ = makeKeyword("OBJECT");
        $ic7$ = makeKeyword("DONE");
        $ic8$ = makeUninternedSymbol("US#32D8451");
        $ic9$ = makeSymbol("S#7435", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#30702", "CYC"));
        $ic11$ = makeSymbol("CLET");
        $ic12$ = makeSymbol("S#30710", "CYC");
        $ic13$ = makeSymbol("S#30711", "CYC");
        $ic14$ = makeSymbol("S#30715", "CYC");
        $ic15$ = makeSymbol("PWHEN");
        $ic16$ = makeSymbol("S#30704", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)makeKeyword("PROBLEM"), (SubLObject)makeKeyword("TACTIC"), (SubLObject)makeKeyword("CONTENT-TACTIC"), (SubLObject)makeKeyword("STRUCTURAL-TACTIC"), (SubLObject)makeKeyword("CONNECTED-CONJUNCTION-TACTIC"), (SubLObject)makeKeyword("GENERALIZED-REMOVAL-TACTIC"), (SubLObject)makeKeyword("TRANSFORMATION-TACTIC"));
        $ic18$ = makeKeyword("PROBLEM");
        $ic19$ = makeKeyword("TACTIC");
        $ic20$ = makeKeyword("CONTENT-TACTIC");
        $ic21$ = makeKeyword("STRUCTURAL-TACTIC");
        $ic22$ = makeKeyword("CONNECTED-CONJUNCTION-TACTIC");
        $ic23$ = makeKeyword("GENERALIZED-REMOVAL-TACTIC");
        $ic24$ = makeKeyword("TRANSFORMATION-TACTIC");
        $ic25$ = makeString("Unknown heuristic domain ~s");
        $ic26$ = makeSymbol("KEYWORDP");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#30807", "CYC"), (SubLObject)makeSymbol("S#15027", "CYC"), (SubLObject)makeSymbol("COMMENT"), (SubLObject)makeSymbol("S#30808", "CYC"));
        $ic28$ = ConsesLow.list((SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeKeyword("SCALING-FACTOR"), (SubLObject)makeKeyword("PRETTY-NAME"), (SubLObject)makeKeyword("COMMENT"), (SubLObject)makeKeyword("DOMAIN"));
        $ic29$ = makeKeyword("FUNCTION");
        $ic30$ = makeKeyword("SCALING-FACTOR");
        $ic31$ = makeKeyword("PRETTY-NAME");
        $ic32$ = makeKeyword("COMMENT");
        $ic33$ = makeKeyword("DOMAIN");
        $ic34$ = makeKeyword("SHALLOW-AND-CHEAP");
        $ic35$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30687", "CYC"), makeKeyword("SCALING-FACTOR"), ONE_INTEGER, makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("Shallow And Cheap"), makeKeyword("COMMENT"), makeString("Prefer problems which are shallower,\ni.e. have a lower min-proof-depth, and which are cheap,\ni.e. have a lower total productivity.") });
        $ic36$ = makeSymbol("S#30687", "CYC");
        $ic37$ = makeKeyword("UNDETERMINED");
        $ic38$ = makeSymbol("S#30721", "CYC");
        $ic39$ = makeSymbol("S#30790", "CYC");
        $ic40$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic41$ = makeKeyword("COMPLETENESS");
        $ic42$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30689", "CYC"), makeKeyword("SCALING-FACTOR"), ONE_INTEGER, makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Completeness"), makeKeyword("COMMENT"), makeString("Prefer tactics which are complete.") });
        $ic43$ = makeKeyword("COMPLETE");
        $ic44$ = makeSymbol("S#30689", "CYC");
        $ic45$ = makeKeyword("OCCAMS-RAZOR");
        $ic46$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30690", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(250), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("Occam's Razor"), makeKeyword("COMMENT"), makeString("The simplest explanation is best.  Our measure\nof simplicity is the shallowest transformation depth.") });
        $ic47$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)ONE_INTEGER, (SubLObject)makeInteger(-10)), ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)makeInteger(-20)), ConsesLow.cons((SubLObject)THREE_INTEGER, (SubLObject)makeInteger(-30)), ConsesLow.cons((SubLObject)FOUR_INTEGER, (SubLObject)makeInteger(-40)), ConsesLow.cons((SubLObject)FIVE_INTEGER, (SubLObject)makeInteger(-50)), ConsesLow.cons((SubLObject)SIX_INTEGER, (SubLObject)makeInteger(-60)), ConsesLow.cons((SubLObject)SEVEN_INTEGER, (SubLObject)makeInteger(-70)), ConsesLow.cons((SubLObject)EIGHT_INTEGER, (SubLObject)makeInteger(-75)), ConsesLow.cons((SubLObject)NINE_INTEGER, (SubLObject)makeInteger(-80)), ConsesLow.cons((SubLObject)TEN_INTEGER, (SubLObject)makeInteger(-85)), ConsesLow.cons((SubLObject)FIFTEEN_INTEGER, (SubLObject)makeInteger(-90)), ConsesLow.cons((SubLObject)TWENTY_INTEGER, (SubLObject)makeInteger(-95)), ConsesLow.cons((SubLObject)makeInteger(30), (SubLObject)makeInteger(-99)), ConsesLow.cons((SubLObject)makeKeyword("POSITIVE-INFINITY"), (SubLObject)makeInteger(-100)) });
        $ic48$ = makeInteger(-100);
        $ic49$ = makeSymbol("S#30690", "CYC");
        $ic50$ = makeKeyword("OCCAMS-RAZOR-TACTIC");
        $ic51$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30723", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(250), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Occam's Razor (Tactic-Based)"), makeKeyword("COMMENT"), makeString("The simplest explanation is best.  Our measure\nof simplicity is the shallowest transformation depth.\nThis heuristic takes the tactic into account, not just the problem.") });
        $ic52$ = makeSymbol("S#30723", "CYC");
        $ic53$ = makeKeyword("MAGIC-WAND");
        $ic54$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30692", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(1000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Magic Wand"), makeKeyword("COMMENT"), makeString("Disprefer 'magic wand' tactics, which are\nincomplete (conjunctive) removal tactics which are expected\nto yield no answers, i.e. they have a productivity of 0.\nSince they are incomplete, they can't even yield the benefit\nof pruning, so unless the estimate of 0 is wrong, it's\na waste of time to execute them.") });
        $ic55$ = makeKeyword("INCOMPLETE");
        $ic56$ = makeSymbol("S#30692", "CYC");
        $ic57$ = makeKeyword("BACKTRACKING-CONSIDERED-HARMFUL");
        $ic58$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30724", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Backtracking Considered Harmful"), makeKeyword("COMMENT"), makeString("If we've already executed some non-trivial\nconnected conjunction tactics on this problem, then disprefer\nexecuting any more connected conjunction tactics on it.\nA connected conjunction tactic is deemed trivial if\nit's expected to generate 4 or fewer subproblems.") });
        $ic59$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)ONE_INTEGER, (SubLObject)makeInteger(-20)), (SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)makeInteger(-40)), (SubLObject)ConsesLow.cons((SubLObject)THREE_INTEGER, (SubLObject)makeInteger(-60)), (SubLObject)ConsesLow.cons((SubLObject)FOUR_INTEGER, (SubLObject)makeInteger(-80)));
        $ic60$ = makeSymbol("S#30724", "CYC");
        $ic61$ = makeInteger(400);
        $ic62$ = makeKeyword("CONNECTED-CONJUNCTION");
        $ic63$ = makeKeyword("EXECUTED");
        $ic64$ = makeKeyword("BACKCHAIN-REQUIRED");
        $ic65$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30693", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("backchainRequired"), makeKeyword("COMMENT"), makeString("Prefer transformation tactics on backchainRequired predicates.") });
        $ic66$ = makeInteger(100);
        $ic67$ = makeSymbol("S#30693", "CYC");
        $ic68$ = makeKeyword("RULE-A-PRIORI-UTILITY");
        $ic69$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30694", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("highlyRelevantAssertion"), makeKeyword("COMMENT"), makeString("Prefer proof paths using higher proportions of\nhighlyRelevantAssertions.  Assume that proof paths using no rules\nare 100% relevant.") });
        $ic70$ = makeSymbol("S#30694", "CYC");
        $ic71$ = makeKeyword("LOOP");
        $ic72$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic73$ = makeSymbol("S#30731", "CYC");
        $ic74$ = makeSymbol("S#30746", "CYC");
        $ic75$ = makeKeyword("PROBLEM-RULE-A-PRIORI-UTILITY");
        $ic76$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30747", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("highlyRelevantAssertion (Problem-Based)"), makeKeyword("COMMENT"), makeString("Prefer proof paths using higher proportions of\nhighlyRelevantAssertions.  Assume that proof paths using no rules\nare 100% relevant.") });
        $ic77$ = makeSymbol("S#30747", "CYC");
        $ic78$ = makeKeyword("RELEVANT-TERM");
        $ic79$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30695", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("highlyRelevantTerm"), makeKeyword("COMMENT"), makeString("Prefer working on problems that contain more\nhighlyRelevantTerms.") });
        $ic80$ = makeSymbol("S#30695", "CYC");
        $ic81$ = makeSymbol("S#30750", "CYC");
        $ic82$ = makeKeyword("NEG");
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic84$ = makeKeyword("POS");
        $ic85$ = makeSymbol("S#30752", "CYC");
        $ic86$ = makeKeyword("RULE-HISTORICAL-UTILITY");
        $ic87$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30696", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(20000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Historical Utility"), makeKeyword("COMMENT"), makeString("Prefer proof paths using rules that have worked well in the past,\nwithout considering the situations in which they were used, i.e.\nprior probability.  Consider proof paths using no rules to be at 100%.") });
        $ic88$ = makeSymbol("S#30696", "CYC");
        $ic89$ = makeSymbol("S#30761", "CYC");
        $ic90$ = makeSymbol("S#30767", "CYC");
        $ic91$ = makeSymbol("S#12732", "CYC");
        $ic92$ = makeKeyword("PROBLEM-RULE-HISTORICAL-UTILITY");
        $ic93$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30768", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(20000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("Problem Rule Historical Utility"), makeKeyword("COMMENT"), makeString("Prefer new roots obtained via rules that have worked well in the past,\nwithout considering the situations in which they were used, i.e.\nprior probability.  Consider new roots obtained using no rules to be at 100%.") });
        $ic94$ = makeSymbol("S#30768", "CYC");
        $ic95$ = makeKeyword("RULE-HISTORICAL-CONNECTEDNESS");
        $ic96$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30771", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(20000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Rule Connectedness"), makeKeyword("COMMENT"), makeString("Prefer proof paths using sets of rules that have a larger fraction that have pairwise worked together in the past.\nConsider proof paths using fewer than 2 rules to be at 100%.") });
        $ic97$ = makeSymbol("S#30771", "CYC");
        $ic98$ = makeSymbol("S#30774", "CYC");
        $ic99$ = makeSymbol("S#26082", "CYC");
        $ic100$ = makeSymbol("INFERENCE-P");
        $ic101$ = makeSymbol("S#30778", "CYC");
        $ic102$ = makeSymbol("S#26790", "CYC");
        $ic103$ = makeSymbol("<");
        $ic104$ = makeSymbol("ASSERTION-ID");
        $ic105$ = makeKeyword("LITERAL-COUNT");
        $ic106$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30779", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(12000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("# of Literals"), makeKeyword("COMMENT"), makeString("Prefer working on problems with a smaller number of literals.") });
        $ic107$ = makeSymbol("S#30779", "CYC");
        $ic108$ = makeKeyword("RULE-LITERAL-COUNT");
        $ic109$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30701", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(1000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("# of Rule Literals"), makeKeyword("COMMENT"), makeString("Prefer using rules with a smaller number of literals.") });
        $ic110$ = makeSymbol("S#30701", "CYC");
        $ic111$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)makeInteger(-15)), ConsesLow.cons((SubLObject)THREE_INTEGER, (SubLObject)makeInteger(-25)), ConsesLow.cons((SubLObject)FOUR_INTEGER, (SubLObject)makeInteger(-30)), ConsesLow.cons((SubLObject)FIVE_INTEGER, (SubLObject)makeInteger(-35)), ConsesLow.cons((SubLObject)SIX_INTEGER, (SubLObject)makeInteger(-40)), ConsesLow.cons((SubLObject)SEVEN_INTEGER, (SubLObject)makeInteger(-45)), ConsesLow.cons((SubLObject)EIGHT_INTEGER, (SubLObject)makeInteger(-50)), ConsesLow.cons((SubLObject)NINE_INTEGER, (SubLObject)makeInteger(-55)), ConsesLow.cons((SubLObject)TEN_INTEGER, (SubLObject)makeInteger(-60)), ConsesLow.cons((SubLObject)THIRTEEN_INTEGER, (SubLObject)makeInteger(-70)), ConsesLow.cons((SubLObject)SEVENTEEN_INTEGER, (SubLObject)makeInteger(-80)), ConsesLow.cons((SubLObject)makeInteger(23), (SubLObject)makeInteger(-85)), ConsesLow.cons((SubLObject)makeInteger(30), (SubLObject)makeInteger(-90)), ConsesLow.cons((SubLObject)makeInteger(50), (SubLObject)makeInteger(-95)), ConsesLow.cons((SubLObject)makeInteger(70), (SubLObject)makeInteger(-97)), ConsesLow.cons((SubLObject)makeInteger(100), (SubLObject)makeInteger(-99)), ConsesLow.cons((SubLObject)makeKeyword("POSITIVE-INFINITY"), (SubLObject)makeInteger(-100)) });
        $ic112$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#7692", "CYC"), (SubLObject)makeSymbol("S#30809", "CYC"));
        $ic113$ = makeKeyword("SKOLEM-COUNT");
        $ic114$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30782", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(300000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("# of Skolems"), makeKeyword("COMMENT"), makeString("Prefer working on problems with a smaller number of skolem functions.") });
        $ic115$ = makeSymbol("S#30782", "CYC");
        $ic116$ = makeSymbol("SKOLEM-FUNCTION-P");
        $ic117$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)ONE_INTEGER, (SubLObject)MINUS_ONE_INTEGER), ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)makeInteger(-2)), ConsesLow.cons((SubLObject)THREE_INTEGER, (SubLObject)makeInteger(-4)), ConsesLow.cons((SubLObject)FOUR_INTEGER, (SubLObject)makeInteger(-8)), ConsesLow.cons((SubLObject)FIVE_INTEGER, (SubLObject)makeInteger(-16)), ConsesLow.cons((SubLObject)SIX_INTEGER, (SubLObject)makeInteger(-32)), ConsesLow.cons((SubLObject)SEVEN_INTEGER, (SubLObject)makeInteger(-64)), ConsesLow.cons((SubLObject)EIGHT_INTEGER, (SubLObject)makeInteger(-99)), ConsesLow.cons((SubLObject)makeKeyword("POSITIVE-INFINITY"), (SubLObject)makeInteger(-100)) });
        $ic118$ = makeSymbol("S#30568", "CYC");
        $ic119$ = makeSymbol("THIRD");
        $ic120$ = makeSymbol("FOURTH");
        $ic121$ = makeKeyword("T-FLOWS-LIKE-WINE");
        $ic122$ = ConsesLow.list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("S#30786", "CYC"), makeKeyword("SCALING-FACTOR"), makeInteger(1000000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("T flows like wine"), makeKeyword("COMMENT"), makeString("Let T (transformation motivation) flow freely through structural tactics.") });
        $ic123$ = makeSymbol("S#30786", "CYC");
    }
    
    public static final class $f27615$BinaryFunction extends BinaryFunction
    {
        public $f27615$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30687"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return f27615(var45, var46);
        }
    }
    
    public static final class $f27622$BinaryFunction extends BinaryFunction
    {
        public $f27622$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30689"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return f27622(var45, var46);
        }
    }
    
    public static final class $f27623$BinaryFunction extends BinaryFunction
    {
        public $f27623$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30690"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return f27623(var45, var46);
        }
    }
    
    public static final class $f27627$BinaryFunction extends BinaryFunction
    {
        public $f27627$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30692"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return f27627(var45, var46);
        }
    }
    
    public static final class $f27630$BinaryFunction extends BinaryFunction
    {
        public $f27630$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30693"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return f27630(var45, var46);
        }
    }
    
    public static final class $f27631$BinaryFunction extends BinaryFunction
    {
        public $f27631$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30694"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return f27631(var45, var46);
        }
    }
    
    public static final class $f27654$BinaryFunction extends BinaryFunction
    {
        public $f27654$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30695"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return f27654(var45, var46);
        }
    }
    
    public static final class $f27663$BinaryFunction extends BinaryFunction
    {
        public $f27663$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30696"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return f27663(var45, var46);
        }
    }
    
    public static final class $f27689$BinaryFunction extends BinaryFunction
    {
        public $f27689$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30701"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return f27689(var45, var46);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 594 ms
	
	Decompiled with Procyon 0.5.32.
*/