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
        return module0389.$g3246$.getGlobalValue();
    }
    
    public static SubLObject f27602(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0389.$ic3$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0389.NIL;
        SubLObject var7 = (SubLObject)module0389.NIL;
        SubLObject var8 = (SubLObject)module0389.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0389.$ic3$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0389.$ic3$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0389.$ic3$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0389.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0389.NIL;
        SubLObject var12_13 = (SubLObject)module0389.NIL;
        while (module0389.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0389.$ic3$);
            var12_13 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0389.$ic3$);
            if (module0389.NIL == conses_high.member(var12_13, (SubLObject)module0389.$ic4$, (SubLObject)module0389.UNPROVIDED, (SubLObject)module0389.UNPROVIDED)) {
                var11 = (SubLObject)module0389.T;
            }
            if (var12_13 == module0389.$ic5$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0389.NIL != var11 && module0389.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0389.$ic3$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0389.$ic6$, var4);
        final SubLObject var13 = (SubLObject)((module0389.NIL != var12) ? conses_high.cadr(var12) : module0389.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0389.$ic7$, var4);
        final SubLObject var15 = (SubLObject)((module0389.NIL != var14) ? conses_high.cadr(var14) : module0389.NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        final SubLObject var17 = (SubLObject)module0389.$ic8$;
        return (SubLObject)ConsesLow.list((SubLObject)module0389.$ic9$, (SubLObject)ConsesLow.list(var6, (SubLObject)module0389.$ic10$, (SubLObject)module0389.$ic7$, var15), (SubLObject)ConsesLow.list((SubLObject)module0389.$ic11$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0389.$ic12$, var6)), (SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)module0389.$ic13$, var6)), (SubLObject)ConsesLow.list(var17, (SubLObject)ConsesLow.list((SubLObject)module0389.$ic14$, var6))), (SubLObject)ConsesLow.listS((SubLObject)module0389.$ic15$, (SubLObject)ConsesLow.list((SubLObject)module0389.$ic16$, var13, var17), ConsesLow.append(var16, (SubLObject)module0389.NIL))));
    }
    
    public static SubLObject f27603(final SubLObject var15, final SubLObject var19) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0389.NIL == var15 || module0389.NIL != f27604(var15, var19));
    }
    
    public static SubLObject f27605(final SubLObject var15) {
        return module0035.f2169(var15, module0389.$g3247$.getGlobalValue());
    }
    
    public static SubLObject f27604(final SubLObject var15, final SubLObject var19) {
        if (var19.eql((SubLObject)module0389.$ic18$)) {
            return module0363.f24478(var15);
        }
        if (var19.eql((SubLObject)module0389.$ic19$)) {
            return module0365.f24819(var15);
        }
        if (var19.eql((SubLObject)module0389.$ic20$)) {
            return module0373.f26176(var15);
        }
        if (var19.eql((SubLObject)module0389.$ic21$)) {
            return module0373.f26146(var15);
        }
        if (var19.eql((SubLObject)module0389.$ic22$)) {
            return module0373.f26151(var15);
        }
        if (var19.eql((SubLObject)module0389.$ic23$)) {
            return module0376.f26618(var15);
        }
        if (var19.eql((SubLObject)module0389.$ic24$)) {
            return module0377.f26771(var15);
        }
        Errors.error((SubLObject)module0389.$ic25$, var19);
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27606(final SubLObject var7, final SubLObject var8, final SubLObject var21, final SubLObject var22, final SubLObject var19) {
        return (SubLObject)ConsesLow.list(var7, var8, var21, var22, var19);
    }
    
    public static SubLObject f27607(final SubLObject var6, final SubLObject var23) {
        assert module0389.NIL != Types.keywordp(var6) : var6;
        SubLObject var24 = (SubLObject)module0389.NIL;
        SubLObject var25 = var23;
        SubLObject var26 = (SubLObject)module0389.NIL;
        SubLObject var29_30 = (SubLObject)module0389.NIL;
        while (module0389.NIL != var25) {
            cdestructuring_bind.destructuring_bind_must_consp(var25, var23, (SubLObject)module0389.$ic27$);
            var29_30 = var25.first();
            var25 = var25.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var25, var23, (SubLObject)module0389.$ic27$);
            if (module0389.NIL == conses_high.member(var29_30, (SubLObject)module0389.$ic28$, (SubLObject)module0389.UNPROVIDED, (SubLObject)module0389.UNPROVIDED)) {
                var26 = (SubLObject)module0389.T;
            }
            if (var29_30 == module0389.$ic5$) {
                var24 = var25.first();
            }
            var25 = var25.rest();
        }
        if (module0389.NIL != var26 && module0389.NIL == var24) {
            cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0389.$ic27$);
        }
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)module0389.$ic29$, var23);
        final SubLObject var28 = (SubLObject)((module0389.NIL != var27) ? conses_high.cadr(var27) : module0389.NIL);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)module0389.$ic30$, var23);
        final SubLObject var30 = (SubLObject)((module0389.NIL != var29) ? conses_high.cadr(var29) : module0389.NIL);
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0389.$ic31$, var23);
        final SubLObject var32 = (SubLObject)((module0389.NIL != var31) ? conses_high.cadr(var31) : module0389.NIL);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)module0389.$ic32$, var23);
        final SubLObject var34 = (SubLObject)((module0389.NIL != var33) ? conses_high.cadr(var33) : module0389.NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)module0389.$ic33$, var23);
        final SubLObject var36 = (SubLObject)((module0389.NIL != var35) ? conses_high.cadr(var35) : module0389.NIL);
        final SubLObject var37 = f27606(var28, var30, var32, var34, var36);
        module0067.f4886(module0389.$g3246$.getGlobalValue(), var6, var37);
        return var6;
    }
    
    public static SubLObject f27608(final SubLObject var6) {
        module0067.f4887(module0389.$g3246$.getGlobalValue(), var6);
        return var6;
    }
    
    public static SubLObject f27609(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885(module0389.$g3246$.getGlobalValue(), var6, (SubLObject)module0389.UNPROVIDED);
        if (module0389.NIL != var7) {
            return var7.first();
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27610(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = conses_high.getf(module0389.$g3248$.getDynamicValue(var7), var6, (SubLObject)module0389.NIL);
        if (module0389.NIL != var8) {
            return var8;
        }
        final SubLObject var9 = module0067.f4885(module0389.$g3246$.getGlobalValue(), var6, (SubLObject)module0389.UNPROVIDED);
        if (module0389.NIL != var9) {
            return conses_high.second(var9);
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27611(final SubLObject var6) {
        final SubLObject var7 = f27612(var6);
        return (module0389.NIL != var7) ? var7 : Symbols.symbol_name(var6);
    }
    
    public static SubLObject f27612(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885(module0389.$g3246$.getGlobalValue(), var6, (SubLObject)module0389.UNPROVIDED);
        if (module0389.NIL != var7) {
            return conses_high.third(var7);
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27613(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885(module0389.$g3246$.getGlobalValue(), var6, (SubLObject)module0389.UNPROVIDED);
        if (module0389.NIL != var7) {
            return conses_high.fourth(var7);
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27614(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885(module0389.$g3246$.getGlobalValue(), var6, (SubLObject)module0389.UNPROVIDED);
        if (module0389.NIL != var7) {
            return conses_high.fifth(var7);
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27615(final SubLObject var39, final SubLObject var40) {
        final SubLObject var41 = f27616(var40, var39);
        final SubLObject var42 = f27617(var40, var39);
        final SubLObject var43 = (module0389.ZERO_INTEGER.eql(var41) && module0389.NIL != module0048.f3328(var42)) ? module0048.f3326() : module0360.f23947(var41, var42);
        final SubLObject var44 = module0360.f23947(var43, (SubLObject)module0389.MINUS_ONE_INTEGER);
        return var44;
    }
    
    public static SubLObject f27616(final SubLObject var40, final SubLObject var39) {
        if (module0389.NIL == module0406.f28343(var39) && module0389.NIL == module0398.f28152(var39)) {
            return (SubLObject)module0389.ZERO_INTEGER;
        }
        final SubLObject var41 = module0391.f27937(var39, var40);
        if (module0389.NIL != var41) {
            return module0373.f26192(var40, var41);
        }
        return module0365.f24901(var40);
    }
    
    public static SubLObject f27617(final SubLObject var40, final SubLObject var39) {
        final SubLObject var41 = module0367.f25037(var39);
        final SubLObject var42 = module0363.f24655(var40, var41);
        if (module0389.$ic37$ == var42) {
            return module0048.f3326();
        }
        return f27618(var42);
    }
    
    public static SubLObject f27619() {
        final SubLObject var50 = module0389.$g3249$.getGlobalValue();
        if (module0389.NIL != var50) {
            module0034.f1818(var50);
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27620(final SubLObject var49) {
        return module0034.f1829(module0389.$g3249$.getGlobalValue(), (SubLObject)ConsesLow.list(var49), (SubLObject)module0389.UNPROVIDED, (SubLObject)module0389.UNPROVIDED);
    }
    
    public static SubLObject f27621(final SubLObject var49) {
        return Numbers.max((SubLObject)module0389.ONE_INTEGER, Numbers.round(Numbers.log(module0048.f_1X(var49), (SubLObject)module0389.TWO_INTEGER), (SubLObject)module0389.UNPROVIDED));
    }
    
    public static SubLObject f27618(final SubLObject var49) {
        SubLObject var50 = module0389.$g3249$.getGlobalValue();
        if (module0389.NIL == var50) {
            var50 = module0034.f1934((SubLObject)module0389.$ic38$, (SubLObject)module0389.$ic39$, (SubLObject)module0389.NIL, (SubLObject)module0389.EQL, (SubLObject)module0389.ONE_INTEGER, (SubLObject)module0389.ZERO_INTEGER);
        }
        SubLObject var51 = module0034.f1814(var50, var49, (SubLObject)module0389.$ic40$);
        if (var51 == module0389.$ic40$) {
            var51 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27621(var49)));
            module0034.f1816(var50, var49, var51, (SubLObject)module0389.UNPROVIDED);
        }
        return module0034.f1959(var51);
    }
    
    public static SubLObject f27622(final SubLObject var39, final SubLObject var53) {
        if (module0389.NIL != module0373.f26176(var53) && module0389.$ic43$ == module0367.f25197(var53, var39)) {
            return (SubLObject)module0389.ONE_INTEGER;
        }
        return (SubLObject)module0389.ZERO_INTEGER;
    }
    
    public static SubLObject f27623(final SubLObject var39, final SubLObject var40) {
        return f27624(var39, var40, (SubLObject)module0389.NIL);
    }
    
    public static SubLObject f27624(final SubLObject var39, final SubLObject var40, final SubLObject var54) {
        final SubLObject var55 = module0367.f25037(var39);
        SubLObject var56 = (SubLObject)module0389.ZERO_INTEGER;
        if (module0389.NIL != module0408.f28461(var55)) {
            SubLObject var57 = module0363.f24656(var40, var55);
            if (module0389.$ic37$ == var57 || module0389.NIL == var57) {
                var56 = module0389.$g3251$.getGlobalValue();
            }
            else {
                if (module0389.NIL != var54) {
                    var57 = Numbers.add(var57, (SubLObject)module0389.ONE_INTEGER);
                }
                var56 = f27625(var57, module0389.$g3250$.getGlobalValue(), (SubLObject)module0389.UNPROVIDED);
            }
        }
        return var56;
    }
    
    public static SubLObject f27626(final SubLObject var39, final SubLObject var53) {
        final SubLObject var54 = module0377.f26771(var53);
        return f27624(var39, module0365.f24850(var53), var54);
    }
    
    public static SubLObject f27627(final SubLObject var39, final SubLObject var57) {
        if (module0389.NIL != module0376.f26618(var57) && module0389.$ic55$ == module0367.f25197(var57, var39) && module0389.NIL != module0360.f23939((SubLObject)module0389.ZERO_INTEGER, module0367.f25203(var57, var39))) {
            return (SubLObject)module0389.$ic48$;
        }
        return (SubLObject)module0389.ZERO_INTEGER;
    }
    
    public static SubLObject f27628(final SubLObject var39, final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        if (module0389.NIL == module0389.$g3252$.getDynamicValue(var59)) {
            return (SubLObject)module0389.ZERO_INTEGER;
        }
        final SubLObject var60 = module0365.f24850(var58);
        final SubLObject var61 = f27629(var60, var39);
        final SubLObject var62 = module0389.$g3253$.getGlobalValue();
        final SubLObject var63 = module0035.f2293(var62, var61, Symbols.symbol_function((SubLObject)module0389.EQL), module0389.$g3254$.getGlobalValue());
        return var63;
    }
    
    public static SubLObject f27629(final SubLObject var40, final SubLObject var39) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)module0389.ZERO_INTEGER;
        SubLObject var43 = module0363.f24517(var40);
        SubLObject var44 = (SubLObject)module0389.NIL;
        var44 = var43.first();
        while (module0389.NIL != var43) {
            if (module0389.NIL != module0363.f24524(var44, (SubLObject)module0389.$ic62$) && module0389.NIL != module0363.f24518(var44, (SubLObject)module0389.$ic63$)) {
                final SubLObject var45 = module0367.f25203(var44, var39);
                if (module0389.NIL != module0360.f23942(var45, module0389.$g3255$.getDynamicValue(var41))) {
                    var42 = Numbers.add(var42, (SubLObject)module0389.ONE_INTEGER);
                }
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        return var42;
    }
    
    public static SubLObject f27630(final SubLObject var39, final SubLObject var64) {
        final SubLObject var65 = module0367.f25037(var39);
        if (module0389.NIL != module0408.f28461(var65)) {
            final SubLObject var66 = module0365.f24850(var64);
            if (module0389.NIL != module0363.f24562(var66)) {
                final SubLObject var67 = module0363.f24564(var66);
                final SubLObject var68 = module0363.f24565(var66);
                if (module0389.NIL != module0349.f23463(var67, var68)) {
                    return (SubLObject)module0389.$ic66$;
                }
            }
        }
        return (SubLObject)module0389.ZERO_INTEGER;
    }
    
    public static SubLObject f27631(final SubLObject var39, final SubLObject var53) {
        return f27632(var39, module0365.f24850(var53), var53);
    }
    
    public static SubLObject f27632(final SubLObject var39, final SubLObject var40, final SubLObject var15) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)module0389.$ic66$;
        final SubLObject var43 = module0367.f25037(var39);
        if (module0389.NIL != module0408.f28461(var43) && (module0389.NIL != module0373.f26366(var40, var43) || module0389.NIL != module0377.f26771(var15))) {
            final SubLObject var44 = module0389.$g3256$.currentBinding(var41);
            try {
                module0389.$g3256$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0389.EQL), (SubLObject)module0389.UNPROVIDED), var41);
                var41.resetMultipleValues();
                SubLObject var45 = f27633(var40, var43);
                SubLObject var46 = var41.secondMultipleValue();
                var41.resetMultipleValues();
                if (module0389.$ic71$ != var46) {
                    if (module0389.NIL != module0373.f26176(var15)) {
                        var41.resetMultipleValues();
                        final SubLObject var47 = f27634(var15);
                        final SubLObject var48 = var41.secondMultipleValue();
                        var41.resetMultipleValues();
                        var45 = Numbers.add(var45, var47);
                        var46 = Numbers.add(var46, var48);
                    }
                    if (!var46.isZero()) {
                        var42 = Numbers.truncate(Numbers.multiply((SubLObject)module0389.$ic66$, var45), var46);
                    }
                }
            }
            finally {
                module0389.$g3256$.rebind(var44, var41);
            }
        }
        return var42;
    }
    
    public static SubLObject f27635(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0077.f5326(var40, module0389.$g3256$.getDynamicValue(var41));
    }
    
    public static SubLObject f27636(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0077.f5320(var40, module0389.$g3256$.getDynamicValue(var41));
    }
    
    public static SubLObject f27633(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)module0389.NIL;
        SubLObject var51 = (SubLObject)module0389.NIL;
        final SubLObject var52 = module0363.f24514(var40);
        final SubLObject var53 = module0034.$g879$.currentBinding(var49);
        try {
            module0034.$g879$.bind(var52, var49);
            SubLObject var54 = (SubLObject)module0389.NIL;
            if (module0389.NIL != var52 && module0389.NIL == module0034.f1842(var52)) {
                var54 = module0034.f1869(var52);
                final SubLObject var55 = Threads.current_process();
                if (module0389.NIL == var54) {
                    module0034.f1873(var52, var55);
                }
                else if (!var54.eql(var55)) {
                    Errors.error((SubLObject)module0389.$ic72$);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0389.T, var49);
                    if (module0389.NIL != var52 && module0389.NIL == var54) {
                        module0034.f1873(var52, (SubLObject)module0389.NIL);
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
        SubLObject var50 = (SubLObject)module0389.ZERO_INTEGER;
        SubLObject var51 = (SubLObject)module0389.ZERO_INTEGER;
        SubLObject var52 = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject var53 = (SubLObject)module0389.NIL;
        SubLObject var54 = (SubLObject)module0389.NIL;
        if (module0389.NIL != f27636(var40)) {
            return Values.values((SubLObject)module0389.$ic71$, (SubLObject)module0389.$ic71$);
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
        for (var56 = module0032.f1741(var55), var57 = (SubLObject)module0389.NIL, var57 = module0032.f1742(var56, var55); module0389.NIL == module0032.f1744(var56, var57); var57 = module0032.f1743(var57)) {
            var58 = module0032.f1745(var56, var57);
            if (module0389.NIL != module0032.f1746(var57, var58)) {
                var59 = module0364.f24725(var58);
                var60 = (SubLObject)module0389.ZERO_INTEGER;
                var61 = (SubLObject)module0389.ZERO_INTEGER;
                var62 = (SubLObject)module0389.NIL;
                if (module0389.NIL != module0377.f26780(var58)) {
                    var61 = Numbers.add(var61, (SubLObject)module0389.ONE_INTEGER);
                    if (module0389.NIL != module0363.f24547(var40, var48)) {
                        var63 = ((module0389.NIL != module0377.f26746(var58)) ? var58 : module0378.f26873(var58));
                        if (module0389.NIL != f27639(var63)) {
                            var60 = Numbers.add(var60, (SubLObject)module0389.ONE_INTEGER);
                        }
                        else if (module0389.NIL != f27640(var63)) {
                            var60 = Numbers.subtract(var60, (SubLObject)module0389.ONE_INTEGER);
                        }
                        else if (module0389.NIL != f27641(var63)) {
                            var60 = Numbers.add(var60, f27642(var63));
                        }
                    }
                }
                if (module0389.NIL == module0374.f26529(var58)) {
                    var49.resetMultipleValues();
                    var64 = f27633(var59, var48);
                    var65 = var49.secondMultipleValue();
                    var49.resetMultipleValues();
                    if (module0389.$ic71$ == var65) {
                        var62 = (SubLObject)module0389.T;
                        var53 = (SubLObject)module0389.T;
                    }
                    else {
                        var54 = (SubLObject)module0389.T;
                        var60 = Numbers.add(var60, var64);
                        var61 = Numbers.add(var61, var65);
                    }
                }
                if (module0389.NIL == var62) {
                    var66 = (SubLObject)(var61.isZero() ? module0389.ZERO_INTEGER : Numbers.divide(var60, var61));
                    if (var66.numG(var52) || (var66.numE(var52) && var61.numL(var51))) {
                        var50 = var60;
                        var51 = var61;
                        var52 = var66;
                    }
                }
            }
        }
        if (module0389.NIL != var53 && module0389.NIL == var54) {
            return Values.values((SubLObject)module0389.$ic71$, (SubLObject)module0389.$ic71$);
        }
        return Values.values(var50, var51);
    }
    
    public static SubLObject f27637(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0034.$g879$.getDynamicValue(var49);
        SubLObject var51 = (SubLObject)module0389.NIL;
        if (module0389.NIL == var50) {
            return f27638(var40, var48);
        }
        var51 = module0034.f1857(var50, (SubLObject)module0389.$ic73$, (SubLObject)module0389.UNPROVIDED);
        if (module0389.NIL == var51) {
            var51 = module0034.f1807(module0034.f1842(var50), (SubLObject)module0389.$ic73$, (SubLObject)module0389.TWO_INTEGER, (SubLObject)module0389.NIL, (SubLObject)module0389.EQ, (SubLObject)module0389.UNPROVIDED);
            module0034.f1860(var50, (SubLObject)module0389.$ic73$, var51);
        }
        final SubLObject var52 = module0034.f1782(var40, var48);
        final SubLObject var53 = module0034.f1814(var51, var52, (SubLObject)module0389.UNPROVIDED);
        if (var53 != module0389.$ic40$) {
            SubLObject var54 = var53;
            SubLObject var55 = (SubLObject)module0389.NIL;
            var55 = var54.first();
            while (module0389.NIL != var54) {
                SubLObject var56 = var55.first();
                final SubLObject var57 = conses_high.second(var55);
                if (var40.eql(var56.first())) {
                    var56 = var56.rest();
                    if (module0389.NIL != var56 && module0389.NIL == var56.rest() && var48.eql(var56.first())) {
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
        SubLObject var64 = (SubLObject)module0389.ZERO_INTEGER;
        SubLObject var65 = (SubLObject)module0389.ZERO_INTEGER;
        if (module0389.NIL != module0377.f26771(var63)) {
            if (module0389.NIL != f27643(var63)) {
                var64 = Numbers.add(var64, (SubLObject)module0389.ONE_INTEGER);
                var65 = Numbers.add(var65, (SubLObject)module0389.ONE_INTEGER);
            }
            else if (module0389.NIL != f27644(var63)) {
                var64 = Numbers.subtract(var64, (SubLObject)module0389.ONE_INTEGER);
                var65 = Numbers.add(var65, (SubLObject)module0389.ONE_INTEGER);
            }
            else if (module0389.NIL != f27645(var63)) {
                var64 = Numbers.add(var64, f27646(var63));
                var65 = Numbers.add(var65, (SubLObject)module0389.ONE_INTEGER);
            }
            else if (module0389.NIL != module0377.f26775(var63)) {
                var65 = Numbers.add(var65, (SubLObject)module0389.ONE_INTEGER);
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
        if (module0389.NIL != var65) {
            final SubLObject var66 = module0365.f24850(var64);
            return f27647(var65, var66);
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27644(final SubLObject var64) {
        final SubLObject var65 = module0377.f26775(var64);
        if (module0389.NIL != var65) {
            final SubLObject var66 = module0365.f24850(var64);
            return f27648(var65, var66);
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27645(final SubLObject var64) {
        final SubLObject var65 = module0377.f26775(var64);
        if (module0389.NIL != var65) {
            final SubLObject var66 = module0365.f24850(var64);
            return f27649(var65, var66);
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27646(final SubLObject var64) {
        final SubLObject var65 = module0377.f26775(var64);
        if (module0389.NIL != var65) {
            final SubLObject var66 = module0365.f24850(var64);
            final SubLObject var67 = module0363.f24565(var66);
            return module0349.f23490(var65, var67);
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27647(final SubLObject var104, final SubLObject var40) {
        final SubLObject var105 = module0363.f24566(var40);
        final SubLObject var106 = module0178.f11287(var104);
        if (module0389.NIL != module0349.f23481(var106, var105)) {
            return (SubLObject)module0389.T;
        }
        if (module0389.NIL == module0211.f13700(var104)) {
            return (SubLObject)module0389.NIL;
        }
        if (module0389.NIL != module0349.f23482(var104, var105)) {
            return (SubLObject)module0389.T;
        }
        final SubLObject var107 = module0363.f24563(var40);
        return module0349.f23483(var107, var104, var105);
    }
    
    public static SubLObject f27648(final SubLObject var104, final SubLObject var40) {
        final SubLObject var105 = module0363.f24566(var40);
        final SubLObject var106 = module0178.f11287(var104);
        if (module0389.NIL != module0349.f23485(var106, var105)) {
            return (SubLObject)module0389.T;
        }
        if (module0389.NIL == module0211.f13700(var104)) {
            return (SubLObject)module0389.NIL;
        }
        if (module0389.NIL != module0349.f23486(var104, var105)) {
            return (SubLObject)module0389.T;
        }
        final SubLObject var107 = module0363.f24563(var40);
        return module0349.f23487(var107, var104, var105);
    }
    
    public static SubLObject f27649(final SubLObject var104, final SubLObject var40) {
        final SubLObject var105 = module0363.f24566(var40);
        if (module0389.NIL == module0211.f13700(var104)) {
            return (SubLObject)module0389.NIL;
        }
        if (module0389.NIL != module0349.f23489(var104, var105)) {
            return (SubLObject)module0389.T;
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27650(final SubLObject var104) {
        if (module0389.NIL != module0349.f23482(var104, (SubLObject)module0389.UNPROVIDED)) {
            return (SubLObject)module0389.ONE_INTEGER;
        }
        if (module0389.NIL != module0349.f23486(var104, (SubLObject)module0389.UNPROVIDED)) {
            return (SubLObject)module0389.MINUS_ONE_INTEGER;
        }
        if (module0389.NIL != module0349.f23489(var104, (SubLObject)module0389.UNPROVIDED)) {
            return module0349.f23490(var104, (SubLObject)module0389.UNPROVIDED);
        }
        return (SubLObject)module0389.ZERO_INTEGER;
    }
    
    public static SubLObject f27651(final SubLObject var104) {
        final SubLObject var105 = Numbers.truncate(Numbers.multiply((SubLObject)module0389.$ic66$, f27650(var104)), (SubLObject)module0389.UNPROVIDED);
        return var105;
    }
    
    public static SubLObject f27652(final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        final SubLObject var106 = module0034.$g879$.getDynamicValue(var105);
        SubLObject var107 = (SubLObject)module0389.NIL;
        if (module0389.NIL == var106) {
            return f27651(var104);
        }
        var107 = module0034.f1857(var106, (SubLObject)module0389.$ic74$, (SubLObject)module0389.UNPROVIDED);
        if (module0389.NIL == var107) {
            var107 = module0034.f1807(module0034.f1842(var106), (SubLObject)module0389.$ic74$, (SubLObject)module0389.ONE_INTEGER, (SubLObject)module0389.NIL, (SubLObject)module0389.EQL, (SubLObject)module0389.UNPROVIDED);
            module0034.f1860(var106, (SubLObject)module0389.$ic74$, var107);
        }
        SubLObject var108 = module0034.f1814(var107, var104, (SubLObject)module0389.$ic40$);
        if (var108 == module0389.$ic40$) {
            var108 = Values.arg2(var105.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27651(var104)));
            module0034.f1816(var107, var104, var108, (SubLObject)module0389.UNPROVIDED);
        }
        return module0034.f1959(var108);
    }
    
    public static SubLObject f27653(final SubLObject var39, final SubLObject var40) {
        return f27632(var39, var40, var40);
    }
    
    public static SubLObject f27654(final SubLObject var39, final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0389.NIL == module0389.$g3257$.getDynamicValue(var41)) {
            return (SubLObject)module0389.ZERO_INTEGER;
        }
        final SubLObject var42 = f27655(var40);
        SubLObject var43 = Numbers.multiply(var42, (SubLObject)module0389.TWENTY_INTEGER);
        var43 = Numbers.min(var43, (SubLObject)module0389.$ic66$);
        var43 = Numbers.max(var43, (SubLObject)module0389.$ic48$);
        return var43;
    }
    
    public static SubLObject f27655(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = (SubLObject)module0389.NIL;
        final SubLObject var43 = module0363.f24514(var40);
        final SubLObject var44 = module0034.$g879$.currentBinding(var41);
        try {
            module0034.$g879$.bind(var43, var41);
            SubLObject var45 = (SubLObject)module0389.NIL;
            if (module0389.NIL != var43 && module0389.NIL == module0034.f1842(var43)) {
                var45 = module0034.f1869(var43);
                final SubLObject var46 = Threads.current_process();
                if (module0389.NIL == var45) {
                    module0034.f1873(var43, var46);
                }
                else if (!var45.eql(var46)) {
                    Errors.error((SubLObject)module0389.$ic72$);
                }
            }
            try {
                var42 = f27656(var40);
            }
            finally {
                final SubLObject var67_112 = Threads.$is_thread_performing_cleanupP$.currentBinding(var41);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0389.T, var41);
                    if (module0389.NIL != var43 && module0389.NIL == var45) {
                        module0034.f1873(var43, (SubLObject)module0389.NIL);
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
        SubLObject var42 = (SubLObject)module0389.NIL;
        final SubLObject var43 = module0389.$g3258$.currentBinding(var41);
        final SubLObject var44 = module0389.$g3259$.currentBinding(var41);
        try {
            module0389.$g3258$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0389.EQL), (SubLObject)module0389.UNPROVIDED), var41);
            module0389.$g3259$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0389.EQL), (SubLObject)module0389.UNPROVIDED), var41);
            SubLObject var45 = module0363.f24509(var40);
            SubLObject var46 = (SubLObject)module0389.NIL;
            var46 = var45.first();
            while (module0389.NIL != var45) {
                SubLObject var47 = (SubLObject)module0389.$ic82$;
                SubLObject var48 = (SubLObject)module0389.ZERO_INTEGER;
                SubLObject var62_117 = module0232.f15306(var46);
                SubLObject var49 = (SubLObject)module0389.NIL;
                var49 = var62_117.first();
                while (module0389.NIL != var62_117) {
                    SubLObject var51;
                    final SubLObject var50 = var51 = var49;
                    SubLObject var52 = (SubLObject)module0389.NIL;
                    SubLObject var53 = (SubLObject)module0389.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0389.$ic83$);
                    var52 = var51.first();
                    var51 = var51.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0389.$ic83$);
                    var53 = var51.first();
                    var51 = var51.rest();
                    if (module0389.NIL == var51) {
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
                        cdestructuring_bind.cdestructuring_bind_error(var50, (SubLObject)module0389.$ic83$);
                    }
                    var48 = Numbers.add(var48, (SubLObject)module0389.ONE_INTEGER);
                    var62_117 = var62_117.rest();
                    var49 = var62_117.first();
                }
                var47 = (SubLObject)module0389.$ic84$;
                var48 = (SubLObject)module0389.ZERO_INTEGER;
                SubLObject var62_118 = module0232.f15308(var46);
                var49 = (SubLObject)module0389.NIL;
                var49 = var62_118.first();
                while (module0389.NIL != var62_118) {
                    SubLObject var57;
                    final SubLObject var56 = var57 = var49;
                    SubLObject var52 = (SubLObject)module0389.NIL;
                    SubLObject var53 = (SubLObject)module0389.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0389.$ic83$);
                    var52 = var57.first();
                    var57 = var57.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var57, var56, (SubLObject)module0389.$ic83$);
                    var53 = var57.first();
                    var57 = var57.rest();
                    if (module0389.NIL == var57) {
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
                        cdestructuring_bind.cdestructuring_bind_error(var56, (SubLObject)module0389.$ic83$);
                    }
                    var48 = Numbers.add(var48, (SubLObject)module0389.ONE_INTEGER);
                    var62_118 = var62_118.rest();
                    var49 = var62_118.first();
                }
                var45 = var45.rest();
                var46 = var45.first();
            }
            var42 = Numbers.subtract(module0077.f5311(module0389.$g3258$.getDynamicValue(var41)), module0077.f5311(module0389.$g3259$.getDynamicValue(var41)));
        }
        finally {
            module0389.$g3259$.rebind(var44, var41);
            module0389.$g3258$.rebind(var43, var41);
        }
        return var42;
    }
    
    public static SubLObject f27656(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        final SubLObject var42 = module0034.$g879$.getDynamicValue(var41);
        SubLObject var43 = (SubLObject)module0389.NIL;
        if (module0389.NIL == var42) {
            return f27657(var40);
        }
        var43 = module0034.f1857(var42, (SubLObject)module0389.$ic81$, (SubLObject)module0389.UNPROVIDED);
        if (module0389.NIL == var43) {
            var43 = module0034.f1807(module0034.f1842(var42), (SubLObject)module0389.$ic81$, (SubLObject)module0389.ONE_INTEGER, (SubLObject)module0389.NIL, (SubLObject)module0389.EQL, (SubLObject)module0389.UNPROVIDED);
            module0034.f1860(var42, (SubLObject)module0389.$ic81$, var43);
        }
        SubLObject var44 = module0034.f1814(var43, var40, (SubLObject)module0389.$ic40$);
        if (var44 == module0389.$ic40$) {
            var44 = Values.arg2(var41.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27657(var40)));
            module0034.f1816(var43, var40, var44, (SubLObject)module0389.UNPROVIDED);
        }
        return module0034.f1959(var44);
    }
    
    public static SubLObject f27658(final SubLObject var130) {
        return module0205.f13228((SubLObject)module0389.$ic85$, var130, (SubLObject)module0389.UNPROVIDED, (SubLObject)module0389.UNPROVIDED);
    }
    
    public static SubLObject f27659(final SubLObject var131) {
        final SubLThread var132 = SubLProcess.currentSubLThread();
        if (module0389.NIL != module0173.f10955(var131)) {
            if (module0389.NIL != module0349.f23484(var131, (SubLObject)module0389.UNPROVIDED)) {
                module0077.f5326(var131, module0389.$g3258$.getDynamicValue(var132));
            }
            if (module0389.NIL != module0349.f23488(var131, (SubLObject)module0389.UNPROVIDED)) {
                module0077.f5326(var131, module0389.$g3259$.getDynamicValue(var132));
            }
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27660() {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        return module0389.$g3260$.getDynamicValue(var37);
    }
    
    public static SubLObject f27661() {
        module0389.$g3260$.setDynamicValue((SubLObject)module0389.T);
        return (SubLObject)module0389.T;
    }
    
    public static SubLObject f27662() {
        module0389.$g3260$.setDynamicValue((SubLObject)module0389.NIL);
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27663(final SubLObject var39, final SubLObject var53) {
        return f27664(var39, module0365.f24850(var53), var53);
    }
    
    public static SubLObject f27664(final SubLObject var39, final SubLObject var40, final SubLObject var15) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0389.NIL == module0389.$g3260$.getDynamicValue(var41)) {
            return (SubLObject)module0389.ZERO_INTEGER;
        }
        SubLObject var42 = (SubLObject)module0389.$ic66$;
        final SubLObject var43 = module0367.f25037(var39);
        if (module0389.NIL != module0408.f28461(var43) && (module0389.NIL != module0373.f26366(var40, var43) || module0389.NIL != module0377.f26771(var15))) {
            final SubLObject var44 = module0389.$g3261$.currentBinding(var41);
            try {
                module0389.$g3261$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0389.EQL), (SubLObject)module0389.UNPROVIDED), var41);
                var41.resetMultipleValues();
                SubLObject var45 = f27665(var40, var43);
                SubLObject var46 = var41.secondMultipleValue();
                var41.resetMultipleValues();
                if (module0389.$ic71$ != var46) {
                    if (module0389.NIL != module0373.f26176(var15)) {
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
                module0389.$g3261$.rebind(var44, var41);
            }
        }
        return var42;
    }
    
    public static SubLObject f27667(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0077.f5326(var40, module0389.$g3261$.getDynamicValue(var41));
    }
    
    public static SubLObject f27668(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        return module0077.f5320(var40, module0389.$g3261$.getDynamicValue(var41));
    }
    
    public static SubLObject f27665(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)module0389.NIL;
        SubLObject var51 = (SubLObject)module0389.NIL;
        final SubLObject var52 = module0363.f24514(var40);
        final SubLObject var53 = module0034.$g879$.currentBinding(var49);
        try {
            module0034.$g879$.bind(var52, var49);
            SubLObject var54 = (SubLObject)module0389.NIL;
            if (module0389.NIL != var52 && module0389.NIL == module0034.f1842(var52)) {
                var54 = module0034.f1869(var52);
                final SubLObject var55 = Threads.current_process();
                if (module0389.NIL == var54) {
                    module0034.f1873(var52, var55);
                }
                else if (!var54.eql(var55)) {
                    Errors.error((SubLObject)module0389.$ic72$);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0389.T, var49);
                    if (module0389.NIL != var52 && module0389.NIL == var54) {
                        module0034.f1873(var52, (SubLObject)module0389.NIL);
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
        SubLObject var50 = (SubLObject)module0389.ZERO_INTEGER;
        SubLObject var51 = (SubLObject)module0389.ZERO_INTEGER;
        SubLObject var52 = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject var53 = (SubLObject)module0389.NIL;
        SubLObject var54 = (SubLObject)module0389.NIL;
        if (module0389.NIL != f27668(var40)) {
            return Values.values((SubLObject)module0389.$ic71$, (SubLObject)module0389.$ic71$);
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
        for (var56 = module0032.f1741(var55), var57 = (SubLObject)module0389.NIL, var57 = module0032.f1742(var56, var55); module0389.NIL == module0032.f1744(var56, var57); var57 = module0032.f1743(var57)) {
            var58 = module0032.f1745(var56, var57);
            if (module0389.NIL != module0032.f1746(var57, var58)) {
                var59 = module0364.f24725(var58);
                var60 = (SubLObject)module0389.ZERO_INTEGER;
                var61 = (SubLObject)module0389.ZERO_INTEGER;
                var62 = (SubLObject)module0389.NIL;
                if (module0389.NIL != module0377.f26780(var58)) {
                    var61 = Numbers.add(var61, (SubLObject)module0389.ONE_INTEGER);
                    if (module0389.NIL != module0363.f24547(var40, var48)) {
                        var63 = module0377.f26781(var58);
                        var64 = module0414.f28917(var63);
                        var60 = Numbers.add(var60, var64);
                    }
                }
                if (module0389.NIL == module0374.f26529(var58)) {
                    var49.resetMultipleValues();
                    var65 = f27665(var59, var48);
                    var66 = var49.secondMultipleValue();
                    var49.resetMultipleValues();
                    if (module0389.$ic71$ == var66) {
                        var62 = (SubLObject)module0389.T;
                        var53 = (SubLObject)module0389.T;
                    }
                    else {
                        var54 = (SubLObject)module0389.T;
                        var60 = Numbers.add(var60, var65);
                        var61 = Numbers.add(var61, var66);
                    }
                }
                if (module0389.NIL == var62) {
                    var67 = (SubLObject)(var61.isZero() ? module0389.ZERO_INTEGER : Numbers.divide(var60, var61));
                    if (var67.numG(var52) || (var67.numE(var52) && var61.numL(var51))) {
                        var50 = var60;
                        var51 = var61;
                        var52 = var67;
                    }
                }
            }
        }
        if (module0389.NIL != var53 && module0389.NIL == var54) {
            return Values.values((SubLObject)module0389.$ic71$, (SubLObject)module0389.$ic71$);
        }
        return Values.values(var50, var51);
    }
    
    public static SubLObject f27669(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0034.$g879$.getDynamicValue(var49);
        SubLObject var51 = (SubLObject)module0389.NIL;
        if (module0389.NIL == var50) {
            return f27670(var40, var48);
        }
        var51 = module0034.f1857(var50, (SubLObject)module0389.$ic89$, (SubLObject)module0389.UNPROVIDED);
        if (module0389.NIL == var51) {
            var51 = module0034.f1807(module0034.f1842(var50), (SubLObject)module0389.$ic89$, (SubLObject)module0389.TWO_INTEGER, (SubLObject)module0389.NIL, (SubLObject)module0389.EQ, (SubLObject)module0389.UNPROVIDED);
            module0034.f1860(var50, (SubLObject)module0389.$ic89$, var51);
        }
        final SubLObject var52 = module0034.f1782(var40, var48);
        final SubLObject var53 = module0034.f1814(var51, var52, (SubLObject)module0389.UNPROVIDED);
        if (var53 != module0389.$ic40$) {
            SubLObject var54 = var53;
            SubLObject var55 = (SubLObject)module0389.NIL;
            var55 = var54.first();
            while (module0389.NIL != var54) {
                SubLObject var56 = var55.first();
                final SubLObject var57 = conses_high.second(var55);
                if (var40.eql(var56.first())) {
                    var56 = var56.rest();
                    if (module0389.NIL != var56 && module0389.NIL == var56.rest() && var48.eql(var56.first())) {
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
        SubLObject var64 = (SubLObject)module0389.ZERO_INTEGER;
        SubLObject var65 = (SubLObject)module0389.ZERO_INTEGER;
        if (module0389.NIL != module0377.f26771(var63)) {
            final SubLObject var66 = module0377.f26775(var63);
            if (module0389.NIL != var66) {
                var64 = Numbers.add(var64, module0414.f28917(var66));
                var65 = Numbers.add(var65, (SubLObject)module0389.ONE_INTEGER);
            }
        }
        return Values.values(var64, var65);
    }
    
    public static SubLObject f27671(final SubLObject var48, final SubLObject var145, final SubLObject var146) {
        final SubLObject var147 = module0369.f25608(var48, var145);
        final SubLObject var148 = module0369.f25608(var48, var146);
        if (module0389.NIL != var147) {
            if (module0389.NIL != var148) {
                return f27672(var145, var146);
            }
            return (SubLObject)module0389.T;
        }
        else {
            if (module0389.NIL != var148) {
                return (SubLObject)module0389.NIL;
            }
            return f27672(var145, var146);
        }
    }
    
    public static SubLObject f27673(final SubLObject var145, final SubLObject var146) {
        return Numbers.numG(f27674(var145), f27674(var146));
    }
    
    public static SubLObject f27672(final SubLObject var145, final SubLObject var146) {
        if (module0389.NIL != f27673(var145, var146)) {
            return (SubLObject)module0389.T;
        }
        if (module0389.NIL != f27673(var146, var145)) {
            return (SubLObject)module0389.NIL;
        }
        return Numbers.numL(module0211.f13692(var145), module0211.f13692(var146));
    }
    
    public static SubLObject f27675(final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        assert module0389.NIL != module0178.f11290(var104) : var104;
        final SubLObject var106 = (SubLObject)((module0389.NIL != module0389.$g3260$.getDynamicValue(var105)) ? module0414.f28917(var104) : module0389.ZERO_INTEGER);
        final SubLObject var107 = f27652(var104);
        return Numbers.add(var106, var107);
    }
    
    public static SubLObject f27674(final SubLObject var104) {
        final SubLThread var105 = SubLProcess.currentSubLThread();
        final SubLObject var106 = module0034.$g879$.getDynamicValue(var105);
        SubLObject var107 = (SubLObject)module0389.NIL;
        if (module0389.NIL == var106) {
            return f27675(var104);
        }
        var107 = module0034.f1857(var106, (SubLObject)module0389.$ic90$, (SubLObject)module0389.UNPROVIDED);
        if (module0389.NIL == var107) {
            var107 = module0034.f1807(module0034.f1842(var106), (SubLObject)module0389.$ic90$, (SubLObject)module0389.ONE_INTEGER, (SubLObject)module0389.NIL, (SubLObject)module0389.EQL, (SubLObject)module0389.UNPROVIDED);
            module0034.f1860(var106, (SubLObject)module0389.$ic90$, var107);
        }
        SubLObject var108 = module0034.f1814(var107, var104, (SubLObject)module0389.$ic40$);
        if (var108 == module0389.$ic40$) {
            var108 = Values.arg2(var105.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27675(var104)));
            module0034.f1816(var107, var104, var108, (SubLObject)module0389.UNPROVIDED);
        }
        return module0034.f1959(var108);
    }
    
    public static SubLObject f27676(final SubLObject var39, final SubLObject var40) {
        return f27664(var39, var40, var40);
    }
    
    public static SubLObject f27677() {
        module0402.f28291((SubLObject)module0389.$ic95$);
        module0389.$g3262$.setDynamicValue((SubLObject)module0389.T);
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27678() {
        module0402.f28292((SubLObject)module0389.$ic95$);
        module0389.$g3262$.setDynamicValue((SubLObject)module0389.NIL);
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27679(final SubLObject var39, final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        if (module0389.NIL == module0389.$g3262$.getDynamicValue(var54)) {
            return (SubLObject)module0389.ZERO_INTEGER;
        }
        SubLObject var55 = (SubLObject)module0389.$ic66$;
        final SubLObject var56 = module0367.f25037(var39);
        if (module0389.NIL != module0408.f28461(var56)) {
            final SubLObject var57 = module0365.f24850(var53);
            if (module0389.NIL != module0373.f26366(var57, var56) || module0389.NIL != module0377.f26771(var53)) {
                final SubLObject var58 = f27680(var53, var56);
                SubLObject var59 = (SubLObject)module0389.ZERO_INTEGER;
                SubLObject var60 = (SubLObject)module0389.NIL;
                SubLObject var61 = var58;
                SubLObject var62 = (SubLObject)module0389.NIL;
                var62 = var61.first();
                while (module0389.NIL != var61) {
                    if (module0389.NIL != module0035.f2000(var62, (SubLObject)module0389.TWO_INTEGER, (SubLObject)module0389.UNPROVIDED)) {
                        final SubLObject var63 = module0414.f28970(var62);
                        var60 = (SubLObject)module0389.T;
                        var59 = Numbers.max(var59, var63);
                    }
                    var61 = var61.rest();
                    var62 = var61.first();
                }
                if (module0389.NIL != var60) {
                    var55 = var59;
                }
            }
        }
        return var55;
    }
    
    public static SubLObject f27681(final SubLObject var40, final SubLObject var48) {
        if (module0389.NIL != module0363.f24547(var40, var48)) {
            return Sequences.nreverse(f27682(var40, var48, (SubLObject)module0389.NIL));
        }
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27683(final SubLObject var40, final SubLObject var48) {
        return f27681(var40, var48);
    }
    
    public static SubLObject f27684(final SubLObject var40, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0034.$g879$.getDynamicValue(var49);
        SubLObject var51 = (SubLObject)module0389.NIL;
        if (module0389.NIL == var50) {
            return f27683(var40, var48);
        }
        var51 = module0034.f1857(var50, (SubLObject)module0389.$ic98$, (SubLObject)module0389.UNPROVIDED);
        if (module0389.NIL == var51) {
            var51 = module0034.f1807(module0034.f1842(var50), (SubLObject)module0389.$ic98$, (SubLObject)module0389.TWO_INTEGER, (SubLObject)module0389.NIL, (SubLObject)module0389.EQ, (SubLObject)module0389.UNPROVIDED);
            module0034.f1860(var50, (SubLObject)module0389.$ic98$, var51);
        }
        final SubLObject var52 = module0034.f1782(var40, var48);
        final SubLObject var53 = module0034.f1814(var51, var52, (SubLObject)module0389.UNPROVIDED);
        if (var53 != module0389.$ic40$) {
            SubLObject var54 = var53;
            SubLObject var55 = (SubLObject)module0389.NIL;
            var55 = var54.first();
            while (module0389.NIL != var54) {
                SubLObject var56 = var55.first();
                final SubLObject var57 = conses_high.second(var55);
                if (var40.eql(var56.first())) {
                    var56 = var56.rest();
                    if (module0389.NIL != var56 && module0389.NIL == var56.rest() && var48.eql(var56.first())) {
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
        SubLObject var158 = (SubLObject)module0389.NIL;
        final SubLObject var159 = module0363.f24530(var40);
        SubLObject var160;
        SubLObject var161;
        SubLObject var162;
        SubLObject var163;
        SubLObject var165;
        SubLObject var164;
        SubLObject var166;
        for (var160 = module0032.f1741(var159), var161 = (SubLObject)module0389.NIL, var161 = module0032.f1742(var160, var159); module0389.NIL == module0032.f1744(var160, var161); var161 = module0032.f1743(var161)) {
            var162 = module0032.f1745(var160, var161);
            if (module0389.NIL != module0032.f1746(var161, var162) && module0389.NIL != module0364.f24759(var162)) {
                if (var48.eql(module0364.f24724(var162))) {
                    var158 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var162), var158);
                }
                else {
                    var163 = module0364.f24725(var162);
                    if (module0389.NIL == module0035.f2169(var163, var157) && module0389.NIL != module0363.f24547(var163, var48)) {
                        var164 = (var165 = f27682(var163, var48, var157));
                        var166 = (SubLObject)module0389.NIL;
                        var166 = var165.first();
                        while (module0389.NIL != var165) {
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
        assert module0389.NIL != module0363.f24478(var40) : var40;
        assert module0389.NIL != module0369.f25275(var48) : var48;
        final SubLObject var49 = f27681(var40, var48);
        final SubLObject var50 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0389.$ic101$), var49);
        return Sequences.delete_duplicates(var50, Symbols.symbol_function((SubLObject)module0389.EQUAL), (SubLObject)module0389.UNPROVIDED, (SubLObject)module0389.UNPROVIDED, (SubLObject)module0389.UNPROVIDED);
    }
    
    public static SubLObject f27680(final SubLObject var63, final SubLObject var48) {
        assert module0389.NIL != module0365.f24819(var63) : var63;
        assert module0389.NIL != module0369.f25275(var48) : var48;
        final SubLObject var64 = module0365.f24850(var63);
        final SubLObject var65 = f27685(var64, var48);
        if (module0389.NIL == module0377.f26771(var63)) {
            return var65;
        }
        final SubLObject var66 = module0377.f26775(var63);
        if (module0389.NIL == var66) {
            return var65;
        }
        SubLObject var67 = (SubLObject)module0389.NIL;
        SubLObject var68 = var65;
        SubLObject var69 = (SubLObject)module0389.NIL;
        var69 = var68.first();
        while (module0389.NIL != var68) {
            SubLObject var70 = conses_high.adjoin(var66, var69, Symbols.symbol_function((SubLObject)module0389.EQL), (SubLObject)module0389.UNPROVIDED);
            final SubLObject var71;
            var70 = (var71 = Sort.sort(var70, Symbols.symbol_function((SubLObject)module0389.$ic103$), Symbols.symbol_function((SubLObject)module0389.$ic104$)));
            if (module0389.NIL == conses_high.member(var71, var67, Symbols.symbol_function((SubLObject)module0389.EQUAL), Symbols.symbol_function((SubLObject)module0389.IDENTITY))) {
                var67 = (SubLObject)ConsesLow.cons(var71, var67);
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        return Sequences.nreverse(var67);
    }
    
    public static SubLObject f27686(final SubLObject var168) {
        SubLObject var169 = (SubLObject)module0389.NIL;
        SubLObject var170 = var168;
        SubLObject var171 = (SubLObject)module0389.NIL;
        var171 = var170.first();
        while (module0389.NIL != var170) {
            if (module0389.NIL != module0377.f26780(var171)) {
                final SubLObject var173;
                final SubLObject var172 = var173 = module0377.f26781(var171);
                if (module0389.NIL == conses_high.member(var173, var169, Symbols.symbol_function((SubLObject)module0389.EQL), Symbols.symbol_function((SubLObject)module0389.IDENTITY))) {
                    var169 = (SubLObject)ConsesLow.cons(var173, var169);
                }
            }
            var170 = var170.rest();
            var171 = var170.first();
        }
        var169 = Sort.sort(var169, Symbols.symbol_function((SubLObject)module0389.$ic103$), Symbols.symbol_function((SubLObject)module0389.$ic104$));
        return var169;
    }
    
    public static SubLObject f27687(final SubLObject var39, final SubLObject var40) {
        final SubLObject var41 = module0363.f24560(var40, (SubLObject)module0389.UNPROVIDED);
        final SubLObject var42 = f27688(var41);
        return var42;
    }
    
    public static SubLObject f27689(final SubLObject var39, final SubLObject var64) {
        if (module0389.NIL == module0377.f26771(var64)) {
            return (SubLObject)module0389.ZERO_INTEGER;
        }
        final SubLObject var65 = module0377.f26775(var64);
        if (module0389.NIL != var65) {
            final SubLObject var66 = module0211.f13692(var65);
            final SubLObject var67 = f27688(var66);
            return var67;
        }
        return (SubLObject)module0389.ZERO_INTEGER;
    }
    
    public static SubLObject f27688(final SubLObject var171) {
        return f27625(var171, module0389.$g3263$.getGlobalValue(), (SubLObject)module0389.UNPROVIDED);
    }
    
    public static SubLObject f27625(final SubLObject var172, final SubLObject var173, SubLObject var174) {
        if (var174 == module0389.UNPROVIDED) {
            var174 = (SubLObject)module0389.NIL;
        }
        SubLObject var175 = var173;
        SubLObject var176 = (SubLObject)module0389.NIL;
        var176 = var175.first();
        while (module0389.NIL != var175) {
            SubLObject var178;
            final SubLObject var177 = var178 = var176;
            SubLObject var179 = (SubLObject)module0389.NIL;
            SubLObject var180 = (SubLObject)module0389.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var178, var177, (SubLObject)module0389.$ic112$);
            var179 = var178.first();
            var178 = (var180 = var178.rest());
            if (module0389.NIL != module0048.f3335(var172, var179)) {
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
        return module0035.f2451((SubLObject)module0389.$ic116$, var41, (SubLObject)module0389.UNPROVIDED);
    }
    
    public static SubLObject f27692(final SubLObject var180) {
        return f27625(var180, module0389.$g3264$.getGlobalValue(), (SubLObject)module0389.UNPROVIDED);
    }
    
    public static SubLObject f27693(final SubLObject var39, final SubLObject var182, final SubLObject var183) {
        final SubLThread var184 = SubLProcess.currentSubLThread();
        SubLObject var185 = (SubLObject)module0389.NIL;
        SubLObject var186 = (SubLObject)module0389.ZERO_INTEGER;
        SubLObject var187;
        for (var187 = module0066.f4838(module0067.f4891(f27601())); module0389.NIL == module0066.f4841(var187); var187 = module0066.f4840(var187)) {
            var184.resetMultipleValues();
            final SubLObject var188 = module0066.f4839(var187);
            final SubLObject var189 = var184.secondMultipleValue();
            var184.resetMultipleValues();
            final SubLObject var190 = f27609(var188);
            final SubLObject var191 = f27610(var188);
            final SubLObject var192 = f27614(var188);
            if (module0389.NIL != f27603(var182, var192) && module0389.NIL != module0077.f5320(var188, var183)) {
                final SubLObject var193 = Functions.funcall(var190, var39, var182);
                if (!module0389.ZERO_INTEGER.eql(var193)) {
                    final SubLObject var194 = module0048.f3366(var193, var191);
                    var186 = module0048.f3364(var186, var194);
                    var185 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var188, var191, var193, var194), var185);
                }
            }
        }
        module0066.f4842(var187);
        var185 = Sort.sort(var185, Symbols.symbol_function((SubLObject)module0389.$ic118$), Symbols.symbol_function((SubLObject)module0389.$ic119$));
        var185 = Sort.stable_sort(var185, Symbols.symbol_function((SubLObject)module0389.$ic118$), Symbols.symbol_function((SubLObject)module0389.$ic120$));
        return Values.values(var185, var186);
    }
    
    public static SubLObject f27694(final SubLObject var39, final SubLObject var63) {
        if (module0389.NIL != module0373.f26146(var63)) {
            return (SubLObject)module0389.ONE_INTEGER;
        }
        return (SubLObject)module0389.ZERO_INTEGER;
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
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27696() {
        module0389.$g3246$ = SubLFiles.deflexical("S#30787", (module0389.NIL != Symbols.boundp((SubLObject)module0389.$ic0$)) ? module0389.$g3246$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0389.EQ), (SubLObject)module0389.UNPROVIDED));
        module0389.$g3247$ = SubLFiles.deflexical("S#30788", (SubLObject)module0389.$ic17$);
        module0389.$g3248$ = SubLFiles.defvar("S#30789", (SubLObject)module0389.NIL);
        module0389.$g3249$ = SubLFiles.deflexical("S#30790", (SubLObject)module0389.NIL);
        module0389.$g3250$ = SubLFiles.deflexical("S#30791", (SubLObject)module0389.$ic47$);
        module0389.$g3251$ = SubLFiles.deflexical("S#30792", (SubLObject)module0389.$ic48$);
        module0389.$g3252$ = SubLFiles.defvar("S#30793", (SubLObject)module0389.T);
        module0389.$g3253$ = SubLFiles.deflexical("S#30794", (SubLObject)module0389.$ic59$);
        module0389.$g3254$ = SubLFiles.deflexical("S#30795", (SubLObject)module0389.$ic48$);
        module0389.$g3255$ = SubLFiles.defvar("S#30796", (SubLObject)module0389.$ic61$);
        module0389.$g3256$ = SubLFiles.defparameter("S#30797", (SubLObject)module0389.NIL);
        module0389.$g3257$ = SubLFiles.defvar("S#30798", (SubLObject)module0389.T);
        module0389.$g3258$ = SubLFiles.defparameter("S#30799", (SubLObject)module0389.NIL);
        module0389.$g3259$ = SubLFiles.defparameter("S#30800", (SubLObject)module0389.NIL);
        module0389.$g3260$ = SubLFiles.defvar("S#30801", (SubLObject)module0389.T);
        module0389.$g3261$ = SubLFiles.defparameter("S#30802", (SubLObject)module0389.NIL);
        module0389.$g3262$ = SubLFiles.defparameter("S#30803", (SubLObject)module0389.NIL);
        module0389.$g3263$ = SubLFiles.deflexical("S#30804", (SubLObject)module0389.$ic111$);
        module0389.$g3264$ = SubLFiles.deflexical("S#30805", (SubLObject)module0389.$ic117$);
        return (SubLObject)module0389.NIL;
    }
    
    public static SubLObject f27697() {
        module0003.f57((SubLObject)module0389.$ic0$);
        module0002.f50((SubLObject)module0389.$ic1$, (SubLObject)module0389.$ic2$);
        module0002.f50((SubLObject)module0389.$ic16$, (SubLObject)module0389.$ic2$);
        f27607((SubLObject)module0389.$ic34$, (SubLObject)module0389.$ic35$);
        module0012.f419((SubLObject)module0389.$ic36$);
        module0034.f1909((SubLObject)module0389.$ic38$);
        f27607((SubLObject)module0389.$ic41$, (SubLObject)module0389.$ic42$);
        module0012.f419((SubLObject)module0389.$ic44$);
        f27607((SubLObject)module0389.$ic45$, (SubLObject)module0389.$ic46$);
        module0012.f419((SubLObject)module0389.$ic49$);
        f27607((SubLObject)module0389.$ic50$, (SubLObject)module0389.$ic51$);
        module0012.f419((SubLObject)module0389.$ic52$);
        f27607((SubLObject)module0389.$ic53$, (SubLObject)module0389.$ic54$);
        module0012.f419((SubLObject)module0389.$ic56$);
        f27607((SubLObject)module0389.$ic57$, (SubLObject)module0389.$ic58$);
        module0012.f419((SubLObject)module0389.$ic60$);
        f27607((SubLObject)module0389.$ic64$, (SubLObject)module0389.$ic65$);
        module0012.f419((SubLObject)module0389.$ic67$);
        f27607((SubLObject)module0389.$ic68$, (SubLObject)module0389.$ic69$);
        module0012.f419((SubLObject)module0389.$ic70$);
        module0034.f1895((SubLObject)module0389.$ic73$);
        module0034.f1895((SubLObject)module0389.$ic74$);
        f27607((SubLObject)module0389.$ic75$, (SubLObject)module0389.$ic76$);
        module0012.f419((SubLObject)module0389.$ic77$);
        f27607((SubLObject)module0389.$ic78$, (SubLObject)module0389.$ic79$);
        module0012.f419((SubLObject)module0389.$ic80$);
        module0034.f1895((SubLObject)module0389.$ic81$);
        module0012.f419((SubLObject)module0389.$ic85$);
        f27607((SubLObject)module0389.$ic86$, (SubLObject)module0389.$ic87$);
        module0012.f419((SubLObject)module0389.$ic88$);
        module0034.f1895((SubLObject)module0389.$ic89$);
        module0034.f1895((SubLObject)module0389.$ic90$);
        f27607((SubLObject)module0389.$ic92$, (SubLObject)module0389.$ic93$);
        module0012.f419((SubLObject)module0389.$ic94$);
        f27607((SubLObject)module0389.$ic95$, (SubLObject)module0389.$ic96$);
        module0012.f419((SubLObject)module0389.$ic97$);
        module0034.f1895((SubLObject)module0389.$ic98$);
        f27607((SubLObject)module0389.$ic105$, (SubLObject)module0389.$ic106$);
        module0012.f419((SubLObject)module0389.$ic107$);
        f27607((SubLObject)module0389.$ic108$, (SubLObject)module0389.$ic109$);
        module0012.f419((SubLObject)module0389.$ic110$);
        f27607((SubLObject)module0389.$ic113$, (SubLObject)module0389.$ic114$);
        module0012.f419((SubLObject)module0389.$ic115$);
        f27607((SubLObject)module0389.$ic121$, (SubLObject)module0389.$ic122$);
        module0012.f419((SubLObject)module0389.$ic123$);
        return (SubLObject)module0389.NIL;
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
        module0389.$g3246$ = null;
        module0389.$g3247$ = null;
        module0389.$g3248$ = null;
        module0389.$g3249$ = null;
        module0389.$g3250$ = null;
        module0389.$g3251$ = null;
        module0389.$g3252$ = null;
        module0389.$g3253$ = null;
        module0389.$g3254$ = null;
        module0389.$g3255$ = null;
        module0389.$g3256$ = null;
        module0389.$g3257$ = null;
        module0389.$g3258$ = null;
        module0389.$g3259$ = null;
        module0389.$g3260$ = null;
        module0389.$g3261$ = null;
        module0389.$g3262$ = null;
        module0389.$g3263$ = null;
        module0389.$g3264$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#30787", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#30702", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#30703", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30806", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#30807", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic5$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic6$ = SubLObjectFactory.makeKeyword("OBJECT");
        $ic7$ = SubLObjectFactory.makeKeyword("DONE");
        $ic8$ = SubLObjectFactory.makeUninternedSymbol("US#32D8451");
        $ic9$ = SubLObjectFactory.makeSymbol("S#7435", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30702", "CYC"));
        $ic11$ = SubLObjectFactory.makeSymbol("CLET");
        $ic12$ = SubLObjectFactory.makeSymbol("S#30710", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#30711", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#30715", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic16$ = SubLObjectFactory.makeSymbol("S#30704", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBLEM"), (SubLObject)SubLObjectFactory.makeKeyword("TACTIC"), (SubLObject)SubLObjectFactory.makeKeyword("CONTENT-TACTIC"), (SubLObject)SubLObjectFactory.makeKeyword("STRUCTURAL-TACTIC"), (SubLObject)SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION-TACTIC"), (SubLObject)SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL-TACTIC"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-TACTIC"));
        $ic18$ = SubLObjectFactory.makeKeyword("PROBLEM");
        $ic19$ = SubLObjectFactory.makeKeyword("TACTIC");
        $ic20$ = SubLObjectFactory.makeKeyword("CONTENT-TACTIC");
        $ic21$ = SubLObjectFactory.makeKeyword("STRUCTURAL-TACTIC");
        $ic22$ = SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION-TACTIC");
        $ic23$ = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL-TACTIC");
        $ic24$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-TACTIC");
        $ic25$ = SubLObjectFactory.makeString("Unknown heuristic domain ~s");
        $ic26$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("S#30807", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15027", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("S#30808", "CYC"));
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("SCALING-FACTOR"), (SubLObject)SubLObjectFactory.makeKeyword("PRETTY-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("DOMAIN"));
        $ic29$ = SubLObjectFactory.makeKeyword("FUNCTION");
        $ic30$ = SubLObjectFactory.makeKeyword("SCALING-FACTOR");
        $ic31$ = SubLObjectFactory.makeKeyword("PRETTY-NAME");
        $ic32$ = SubLObjectFactory.makeKeyword("COMMENT");
        $ic33$ = SubLObjectFactory.makeKeyword("DOMAIN");
        $ic34$ = SubLObjectFactory.makeKeyword("SHALLOW-AND-CHEAP");
        $ic35$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30687", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), module0389.ONE_INTEGER, SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("PROBLEM"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Shallow And Cheap"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer problems which are shallower,\ni.e. have a lower min-proof-depth, and which are cheap,\ni.e. have a lower total productivity.") });
        $ic36$ = SubLObjectFactory.makeSymbol("S#30687", "CYC");
        $ic37$ = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $ic38$ = SubLObjectFactory.makeSymbol("S#30721", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#30790", "CYC");
        $ic40$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic41$ = SubLObjectFactory.makeKeyword("COMPLETENESS");
        $ic42$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30689", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), module0389.ONE_INTEGER, SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("TACTIC"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Completeness"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer tactics which are complete.") });
        $ic43$ = SubLObjectFactory.makeKeyword("COMPLETE");
        $ic44$ = SubLObjectFactory.makeSymbol("S#30689", "CYC");
        $ic45$ = SubLObjectFactory.makeKeyword("OCCAMS-RAZOR");
        $ic46$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30690", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(250), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("PROBLEM"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Occam's Razor"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("The simplest explanation is best.  Our measure\nof simplicity is the shallowest transformation depth.") });
        $ic47$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)module0389.ZERO_INTEGER, (SubLObject)module0389.ZERO_INTEGER), ConsesLow.cons((SubLObject)module0389.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-10)), ConsesLow.cons((SubLObject)module0389.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-20)), ConsesLow.cons((SubLObject)module0389.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-30)), ConsesLow.cons((SubLObject)module0389.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-40)), ConsesLow.cons((SubLObject)module0389.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-50)), ConsesLow.cons((SubLObject)module0389.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-60)), ConsesLow.cons((SubLObject)module0389.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-70)), ConsesLow.cons((SubLObject)module0389.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-75)), ConsesLow.cons((SubLObject)module0389.NINE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-80)), ConsesLow.cons((SubLObject)module0389.TEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-85)), ConsesLow.cons((SubLObject)module0389.FIFTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-90)), ConsesLow.cons((SubLObject)module0389.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-95)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)SubLObjectFactory.makeInteger(-99)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), (SubLObject)SubLObjectFactory.makeInteger(-100)) });
        $ic48$ = SubLObjectFactory.makeInteger(-100);
        $ic49$ = SubLObjectFactory.makeSymbol("S#30690", "CYC");
        $ic50$ = SubLObjectFactory.makeKeyword("OCCAMS-RAZOR-TACTIC");
        $ic51$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30723", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(250), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("TACTIC"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Occam's Razor (Tactic-Based)"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("The simplest explanation is best.  Our measure\nof simplicity is the shallowest transformation depth.\nThis heuristic takes the tactic into account, not just the problem.") });
        $ic52$ = SubLObjectFactory.makeSymbol("S#30723", "CYC");
        $ic53$ = SubLObjectFactory.makeKeyword("MAGIC-WAND");
        $ic54$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30692", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(1000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("TACTIC"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Magic Wand"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Disprefer 'magic wand' tactics, which are\nincomplete (conjunctive) removal tactics which are expected\nto yield no answers, i.e. they have a productivity of 0.\nSince they are incomplete, they can't even yield the benefit\nof pruning, so unless the estimate of 0 is wrong, it's\na waste of time to execute them.") });
        $ic55$ = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $ic56$ = SubLObjectFactory.makeSymbol("S#30692", "CYC");
        $ic57$ = SubLObjectFactory.makeKeyword("BACKTRACKING-CONSIDERED-HARMFUL");
        $ic58$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30724", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(10000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("TACTIC"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Backtracking Considered Harmful"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("If we've already executed some non-trivial\nconnected conjunction tactics on this problem, then disprefer\nexecuting any more connected conjunction tactics on it.\nA connected conjunction tactic is deemed trivial if\nit's expected to generate 4 or fewer subproblems.") });
        $ic59$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)module0389.ZERO_INTEGER, (SubLObject)module0389.ZERO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)module0389.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-20)), (SubLObject)ConsesLow.cons((SubLObject)module0389.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-40)), (SubLObject)ConsesLow.cons((SubLObject)module0389.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-60)), (SubLObject)ConsesLow.cons((SubLObject)module0389.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-80)));
        $ic60$ = SubLObjectFactory.makeSymbol("S#30724", "CYC");
        $ic61$ = SubLObjectFactory.makeInteger(400);
        $ic62$ = SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION");
        $ic63$ = SubLObjectFactory.makeKeyword("EXECUTED");
        $ic64$ = SubLObjectFactory.makeKeyword("BACKCHAIN-REQUIRED");
        $ic65$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30693", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(10000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("TACTIC"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("backchainRequired"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer transformation tactics on backchainRequired predicates.") });
        $ic66$ = SubLObjectFactory.makeInteger(100);
        $ic67$ = SubLObjectFactory.makeSymbol("S#30693", "CYC");
        $ic68$ = SubLObjectFactory.makeKeyword("RULE-A-PRIORI-UTILITY");
        $ic69$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30694", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(10000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("TACTIC"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("highlyRelevantAssertion"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer proof paths using higher proportions of\nhighlyRelevantAssertions.  Assume that proof paths using no rules\nare 100% relevant.") });
        $ic70$ = SubLObjectFactory.makeSymbol("S#30694", "CYC");
        $ic71$ = SubLObjectFactory.makeKeyword("LOOP");
        $ic72$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic73$ = SubLObjectFactory.makeSymbol("S#30731", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#30746", "CYC");
        $ic75$ = SubLObjectFactory.makeKeyword("PROBLEM-RULE-A-PRIORI-UTILITY");
        $ic76$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30747", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(10000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("PROBLEM"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("highlyRelevantAssertion (Problem-Based)"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer proof paths using higher proportions of\nhighlyRelevantAssertions.  Assume that proof paths using no rules\nare 100% relevant.") });
        $ic77$ = SubLObjectFactory.makeSymbol("S#30747", "CYC");
        $ic78$ = SubLObjectFactory.makeKeyword("RELEVANT-TERM");
        $ic79$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30695", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(10000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("PROBLEM"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("highlyRelevantTerm"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer working on problems that contain more\nhighlyRelevantTerms.") });
        $ic80$ = SubLObjectFactory.makeSymbol("S#30695", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#30750", "CYC");
        $ic82$ = SubLObjectFactory.makeKeyword("NEG");
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic84$ = SubLObjectFactory.makeKeyword("POS");
        $ic85$ = SubLObjectFactory.makeSymbol("S#30752", "CYC");
        $ic86$ = SubLObjectFactory.makeKeyword("RULE-HISTORICAL-UTILITY");
        $ic87$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30696", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(20000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("TACTIC"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Historical Utility"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer proof paths using rules that have worked well in the past,\nwithout considering the situations in which they were used, i.e.\nprior probability.  Consider proof paths using no rules to be at 100%.") });
        $ic88$ = SubLObjectFactory.makeSymbol("S#30696", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#30761", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#30767", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#12732", "CYC");
        $ic92$ = SubLObjectFactory.makeKeyword("PROBLEM-RULE-HISTORICAL-UTILITY");
        $ic93$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30768", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(20000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("PROBLEM"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Problem Rule Historical Utility"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer new roots obtained via rules that have worked well in the past,\nwithout considering the situations in which they were used, i.e.\nprior probability.  Consider new roots obtained using no rules to be at 100%.") });
        $ic94$ = SubLObjectFactory.makeSymbol("S#30768", "CYC");
        $ic95$ = SubLObjectFactory.makeKeyword("RULE-HISTORICAL-CONNECTEDNESS");
        $ic96$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30771", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(20000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("TACTIC"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("Rule Connectedness"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer proof paths using sets of rules that have a larger fraction that have pairwise worked together in the past.\nConsider proof paths using fewer than 2 rules to be at 100%.") });
        $ic97$ = SubLObjectFactory.makeSymbol("S#30771", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#30774", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic101$ = SubLObjectFactory.makeSymbol("S#30778", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#26790", "CYC");
        $ic103$ = SubLObjectFactory.makeSymbol("<");
        $ic104$ = SubLObjectFactory.makeSymbol("ASSERTION-ID");
        $ic105$ = SubLObjectFactory.makeKeyword("LITERAL-COUNT");
        $ic106$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30779", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(12000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("PROBLEM"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("# of Literals"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer working on problems with a smaller number of literals.") });
        $ic107$ = SubLObjectFactory.makeSymbol("S#30779", "CYC");
        $ic108$ = SubLObjectFactory.makeKeyword("RULE-LITERAL-COUNT");
        $ic109$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30701", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(1000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("TACTIC"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("# of Rule Literals"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer using rules with a smaller number of literals.") });
        $ic110$ = SubLObjectFactory.makeSymbol("S#30701", "CYC");
        $ic111$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)module0389.ONE_INTEGER, (SubLObject)module0389.ZERO_INTEGER), ConsesLow.cons((SubLObject)module0389.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-15)), ConsesLow.cons((SubLObject)module0389.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-25)), ConsesLow.cons((SubLObject)module0389.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-30)), ConsesLow.cons((SubLObject)module0389.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-35)), ConsesLow.cons((SubLObject)module0389.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-40)), ConsesLow.cons((SubLObject)module0389.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-45)), ConsesLow.cons((SubLObject)module0389.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-50)), ConsesLow.cons((SubLObject)module0389.NINE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-55)), ConsesLow.cons((SubLObject)module0389.TEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-60)), ConsesLow.cons((SubLObject)module0389.THIRTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-70)), ConsesLow.cons((SubLObject)module0389.SEVENTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-80)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(23), (SubLObject)SubLObjectFactory.makeInteger(-85)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)SubLObjectFactory.makeInteger(-90)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(50), (SubLObject)SubLObjectFactory.makeInteger(-95)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(70), (SubLObject)SubLObjectFactory.makeInteger(-97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)SubLObjectFactory.makeInteger(-99)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), (SubLObject)SubLObjectFactory.makeInteger(-100)) });
        $ic112$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#7692", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30809", "CYC"));
        $ic113$ = SubLObjectFactory.makeKeyword("SKOLEM-COUNT");
        $ic114$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30782", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(300000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("PROBLEM"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("# of Skolems"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Prefer working on problems with a smaller number of skolem functions.") });
        $ic115$ = SubLObjectFactory.makeSymbol("S#30782", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("SKOLEM-FUNCTION-P");
        $ic117$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)module0389.ZERO_INTEGER, (SubLObject)module0389.ZERO_INTEGER), ConsesLow.cons((SubLObject)module0389.ONE_INTEGER, (SubLObject)module0389.MINUS_ONE_INTEGER), ConsesLow.cons((SubLObject)module0389.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-2)), ConsesLow.cons((SubLObject)module0389.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-4)), ConsesLow.cons((SubLObject)module0389.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-8)), ConsesLow.cons((SubLObject)module0389.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-16)), ConsesLow.cons((SubLObject)module0389.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-32)), ConsesLow.cons((SubLObject)module0389.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-64)), ConsesLow.cons((SubLObject)module0389.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-99)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), (SubLObject)SubLObjectFactory.makeInteger(-100)) });
        $ic118$ = SubLObjectFactory.makeSymbol("S#30568", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("THIRD");
        $ic120$ = SubLObjectFactory.makeSymbol("FOURTH");
        $ic121$ = SubLObjectFactory.makeKeyword("T-FLOWS-LIKE-WINE");
        $ic122$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("FUNCTION"), SubLObjectFactory.makeSymbol("S#30786", "CYC"), SubLObjectFactory.makeKeyword("SCALING-FACTOR"), SubLObjectFactory.makeInteger(1000000), SubLObjectFactory.makeKeyword("DOMAIN"), SubLObjectFactory.makeKeyword("TACTIC"), SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeString("T flows like wine"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Let T (transformation motivation) flow freely through structural tactics.") });
        $ic123$ = SubLObjectFactory.makeSymbol("S#30786", "CYC");
    }
    
    public static final class $f27615$BinaryFunction extends BinaryFunction
    {
        public $f27615$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30687"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return module0389.f27615(var45, var46);
        }
    }
    
    public static final class $f27622$BinaryFunction extends BinaryFunction
    {
        public $f27622$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30689"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return module0389.f27622(var45, var46);
        }
    }
    
    public static final class $f27623$BinaryFunction extends BinaryFunction
    {
        public $f27623$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30690"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return module0389.f27623(var45, var46);
        }
    }
    
    public static final class $f27627$BinaryFunction extends BinaryFunction
    {
        public $f27627$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30692"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return module0389.f27627(var45, var46);
        }
    }
    
    public static final class $f27630$BinaryFunction extends BinaryFunction
    {
        public $f27630$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30693"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return module0389.f27630(var45, var46);
        }
    }
    
    public static final class $f27631$BinaryFunction extends BinaryFunction
    {
        public $f27631$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30694"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return module0389.f27631(var45, var46);
        }
    }
    
    public static final class $f27654$BinaryFunction extends BinaryFunction
    {
        public $f27654$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30695"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return module0389.f27654(var45, var46);
        }
    }
    
    public static final class $f27663$BinaryFunction extends BinaryFunction
    {
        public $f27663$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30696"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return module0389.f27663(var45, var46);
        }
    }
    
    public static final class $f27689$BinaryFunction extends BinaryFunction
    {
        public $f27689$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30701"));
        }
        
        public SubLObject processItem(final SubLObject var45, final SubLObject var46) {
            return module0389.f27689(var45, var46);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0389.class
	Total time: 594 ms
	
	Decompiled with Procyon 0.5.32.
*/