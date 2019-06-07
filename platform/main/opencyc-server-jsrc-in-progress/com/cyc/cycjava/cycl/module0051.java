package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0051 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0051";
    public static final String myFingerPrint = "6fabc00964526661bcef243dcedfe920a81b6afcf8dd9fb7a5dde52208fd75d8";
    public static SubLSymbol $g992$;
    public static SubLSymbol $g993$;
    public static SubLSymbol $g994$;
    public static SubLSymbol $g995$;
    public static SubLSymbol $g996$;
    public static SubLSymbol $g81$;
    public static SubLSymbol $g997$;
    public static SubLSymbol $g998$;
    public static SubLSymbol $g999$;
    public static SubLSymbol $g1000$;
    public static SubLSymbol $g1001$;
    public static SubLSymbol $g1002$;
    private static SubLSymbol $g1003$;
    private static SubLSymbol $g1004$;
    private static SubLSymbol $g1005$;
    public static SubLSymbol $g1006$;
    public static SubLSymbol $g1007$;
    public static SubLSymbol $g1008$;
    public static SubLSymbol $g1009$;
    public static SubLSymbol $g1010$;
    private static final SubLInteger $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLInteger $ic3$;
    private static final SubLInteger $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLInteger $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLInteger $ic15$;
    private static final SubLInteger $ic16$;
    private static final SubLInteger $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLInteger $ic23$;
    private static final SubLString $ic24$;
    private static final SubLInteger $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLList $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLList $ic69$;
    private static final SubLList $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLInteger $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLInteger $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLInteger $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLInteger $ic101$;
    private static final SubLInteger $ic102$;
    private static final SubLString $ic103$;
    private static final SubLInteger $ic104$;
    private static final SubLList $ic105$;
    private static final SubLList $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLInteger $ic116$;
    private static final SubLInteger $ic117$;
    private static final SubLInteger $ic118$;
    
    public static SubLObject f3540(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic8$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic8$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, var6, ConsesLow.append(var7, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.listS((SubLObject)$ic13$, var6, (SubLObject)$ic14$))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3541(final SubLObject var8) {
        return Types.integerp(var8);
    }
    
    public static SubLObject f3542(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != module0004.f105(var8) && var8.numLE((SubLObject)TWELVE_INTEGER));
    }
    
    public static SubLObject f3543(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != module0004.f105(var8) && var8.numLE((SubLObject)$ic15$));
    }
    
    public static SubLObject f3544(final SubLObject var8, final SubLObject var9, final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != module0004.f105(var8) && var8.numLE(f3545(var9, var10)));
    }
    
    public static SubLObject f3546(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != module0004.f106(var8) && var8.numLE((SubLObject)$ic16$));
    }
    
    public static SubLObject f3547(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != module0004.f106(var8) && var8.numLE((SubLObject)$ic17$));
    }
    
    public static SubLObject f3548(final SubLObject var8) {
        return (SubLObject)makeBoolean(NIL != module0004.f106(var8) && var8.numLE((SubLObject)$ic17$));
    }
    
    public static SubLObject f3549(final SubLObject var8) {
        return Types.integerp(var8);
    }
    
    public static SubLObject f3550(final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = Time.get_universal_time();
        }
        return Numbers.add(var12, var11.isInteger() ? var11 : Numbers.truncate(var11, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject time_from_now(final SubLObject var11) {
        return f3550(var11, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3551(final SubLObject var11, SubLObject var13, SubLObject var14) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)ZERO_INTEGER;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var15 = Numbers.add(var13, Numbers.multiply($g997$.getGlobalValue(), var14));
        final SubLObject var16 = Numbers.add(var11, Numbers.multiply($g81$.getGlobalValue(), var15));
        return f3550(var16, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3552(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = Time.get_universal_time();
        }
        assert NIL != f3549(var17) : var17;
        return f3553(var17);
    }
    
    public static SubLObject f3554(final SubLObject var8) {
        if (NIL != f3549(var8)) {
            return f3553(var8);
        }
        return (SubLObject)$ic21$;
    }
    
    public static SubLObject f3553(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        var18.resetMultipleValues();
        final SubLObject var19 = Time.decode_universal_time(var17, (SubLObject)UNPROVIDED);
        final SubLObject var20 = var18.secondMultipleValue();
        final SubLObject var21 = var18.thirdMultipleValue();
        final SubLObject var22 = var18.fourthMultipleValue();
        final SubLObject var23 = var18.fifthMultipleValue();
        final SubLObject var24 = var18.sixthMultipleValue();
        var18.resetMultipleValues();
        return f3555(var19, var20, var21, var22, var23, var24);
    }
    
    public static SubLObject f3556(SubLObject var23, SubLObject var24) {
        if (var23 == UNPROVIDED) {
            var23 = f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var24 == UNPROVIDED) {
            var24 = f3558((SubLObject)UNPROVIDED);
        }
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic22$, var23, var24);
    }
    
    public static SubLObject f3559(SubLObject var23, SubLObject var24) {
        if (var23 == UNPROVIDED) {
            var23 = f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var24 == UNPROVIDED) {
            var24 = f3558((SubLObject)UNPROVIDED);
        }
        return Numbers.add(Numbers.multiply((SubLObject)$ic23$, var23), var24);
    }
    
    public static SubLObject f3560(SubLObject var23, SubLObject var25) {
        if (var23 == UNPROVIDED) {
            var23 = f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var25 == UNPROVIDED) {
            var25 = f3561((SubLObject)UNPROVIDED);
        }
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic24$, new SubLObject[] { var23, module0048.f3281(var25, (SubLObject)$ic25$), Numbers.rem(var25, (SubLObject)$ic25$) });
    }
    
    public static SubLObject f3555(final SubLObject var19, final SubLObject var20, final SubLObject var21, final SubLObject var22, final SubLObject var9, final SubLObject var10) {
        return f3562((SubLObject)NIL, var19, var20, var21, var22, var9, var10, (SubLObject)$ic26$);
    }
    
    public static SubLObject f3563(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = Time.get_universal_time();
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        assert NIL != f3549(var17) : var17;
        var18.resetMultipleValues();
        final SubLObject var19 = Time.decode_universal_time(var17, (SubLObject)UNPROVIDED);
        final SubLObject var20 = var18.secondMultipleValue();
        final SubLObject var21 = var18.thirdMultipleValue();
        final SubLObject var22 = var18.fourthMultipleValue();
        final SubLObject var23 = var18.fifthMultipleValue();
        final SubLObject var24 = var18.sixthMultipleValue();
        var18.resetMultipleValues();
        return f3564(var19, var20, var21, var22, var23, var24);
    }
    
    public static SubLObject f3564(final SubLObject var19, final SubLObject var20, final SubLObject var21, final SubLObject var22, final SubLObject var9, final SubLObject var10) {
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic27$, new SubLObject[] { var10, var9, var22, var21, var20, var19 });
    }
    
    public static SubLObject f3565(final SubLObject var19, final SubLObject var20, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        var22.resetMultipleValues();
        final SubLObject var23 = Time.decode_universal_time(Time.get_universal_time(), (SubLObject)UNPROVIDED);
        final SubLObject var24 = var22.secondMultipleValue();
        final SubLObject var25 = var22.thirdMultipleValue();
        final SubLObject var26 = var22.fourthMultipleValue();
        final SubLObject var27 = var22.fifthMultipleValue();
        final SubLObject var28 = var22.sixthMultipleValue();
        var22.resetMultipleValues();
        return Time.encode_universal_time(var19, var20, var21, var26, var27, var28, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3566(final SubLObject var19, final SubLObject var20, final SubLObject var21) {
        final SubLObject var22 = Time.get_universal_time();
        final SubLObject var23 = f3565(var19, var20, var21);
        if (var23.numG(var22)) {
            return var23;
        }
        final SubLObject var24 = Numbers.add($g995$.getGlobalValue(), var23);
        return var24;
    }
    
    public static SubLObject f3567(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = Time.get_universal_time();
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        assert NIL != f3549(var17) : var17;
        var18.resetMultipleValues();
        final SubLObject var19 = Time.decode_universal_time(var17, (SubLObject)UNPROVIDED);
        final SubLObject var20 = var18.secondMultipleValue();
        final SubLObject var21 = var18.thirdMultipleValue();
        final SubLObject var22 = var18.fourthMultipleValue();
        final SubLObject var23 = var18.fifthMultipleValue();
        final SubLObject var24 = var18.sixthMultipleValue();
        final SubLObject var25 = var18.seventhMultipleValue();
        final SubLObject var26 = var18.eighthMultipleValue();
        final SubLObject var27 = SubLProcess.nthMultipleValue((SubLObject)EIGHT_INTEGER);
        var18.resetMultipleValues();
        return var25;
    }
    
    public static SubLObject f3568(final SubLObject var8) {
        return module0004.f106(var8);
    }
    
    public static SubLObject f3569(final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = Time.get_internal_real_time();
        }
        return Numbers.add(var12, f3570(var11));
    }
    
    public static SubLObject f3571(final SubLObject var12, SubLObject var39) {
        if (var39 == UNPROVIDED) {
            var39 = Time.get_internal_real_time();
        }
        return Numbers.subtract(var39, var12);
    }
    
    public static SubLObject f3572(final SubLObject var40) {
        return Numbers.divide(var40, time_high.$internal_time_units_per_second$.getGlobalValue());
    }
    
    public static SubLObject f3570(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        var41.resetMultipleValues();
        final SubLObject var42 = Numbers.truncate(Numbers.multiply(var40, time_high.$internal_time_units_per_second$.getGlobalValue()), (SubLObject)UNPROVIDED);
        final SubLObject var43 = var41.secondMultipleValue();
        var41.resetMultipleValues();
        return var42;
    }
    
    public static SubLObject f3573(final SubLObject var43, final SubLObject var44) {
        return f3572(f3571(var43, var44));
    }
    
    public static SubLObject f3574(final SubLObject var11, SubLObject var45) {
        if (var45 == UNPROVIDED) {
            var45 = (SubLObject)TWO_INTEGER;
        }
        assert NIL != module0048.f3294(var11) : var11;
        assert NIL != module0004.f106(var45) : var45;
        final SubLObject var46 = Numbers.floor(Numbers.divide(var11, $g996$.getGlobalValue()), (SubLObject)UNPROVIDED);
        final SubLObject var47 = Numbers.numGE(var46, (SubLObject)TWO_INTEGER);
        final SubLObject var48 = (NIL != var47) ? Numbers.subtract(var11, Numbers.multiply(var46, $g996$.getGlobalValue())) : var11;
        final SubLObject var49 = Numbers.floor(Numbers.divide(var48, $g81$.getGlobalValue()), (SubLObject)UNPROVIDED);
        final SubLObject var50 = (SubLObject)makeBoolean(NIL != var47 || var49.numGE((SubLObject)TWO_INTEGER));
        SubLObject var11_49 = (NIL != var50) ? Numbers.subtract(var48, Numbers.multiply(var49, $g81$.getGlobalValue())) : var48;
        final SubLObject var51 = (SubLObject)(var45.isZero() ? $ic30$ : Sequences.cconcatenate((SubLObject)$ic31$, new SubLObject[] { module0006.f206(var45), $ic32$ }));
        if (var45.isZero()) {
            var11_49 = Numbers.round(var11_49, (SubLObject)UNPROVIDED);
        }
        return module0006.f202((NIL != var50) ? ((NIL != var47) ? PrintLow.format((SubLObject)NIL, (SubLObject)$ic33$, var46, var49) : PrintLow.format((SubLObject)NIL, Sequences.cconcatenate((SubLObject)$ic34$, var51), var49, var11_49)) : PrintLow.format((SubLObject)NIL, var51, var11_49));
    }
    
    public static SubLObject f3575(SubLObject var17, SubLObject var51) {
        if (var17 == UNPROVIDED) {
            var17 = Time.get_universal_time();
        }
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)$ic26$;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        assert NIL != f3549(var17) : var17;
        assert NIL != f3576(var51) : var51;
        var52.resetMultipleValues();
        final SubLObject var53 = Time.decode_universal_time(var17, (SubLObject)UNPROVIDED);
        final SubLObject var54 = var52.secondMultipleValue();
        final SubLObject var55 = var52.thirdMultipleValue();
        final SubLObject var56 = var52.fourthMultipleValue();
        final SubLObject var57 = var52.fifthMultipleValue();
        final SubLObject var58 = var52.sixthMultipleValue();
        var52.resetMultipleValues();
        return f3562((SubLObject)NIL, var53, var54, var55, var56, var57, var58, var51);
    }
    
    public static SubLObject f3562(final SubLObject var52, final SubLObject var19, final SubLObject var20, final SubLObject var21, final SubLObject var35, final SubLObject var9, final SubLObject var10, final SubLObject var51) {
        assert NIL != f3576(var51) : var51;
        final SubLObject var53 = module0038.f2661(var51, Symbols.symbol_function((SubLObject)$ic36$), (SubLObject)UNPROVIDED);
        if (Sequences.length(var53).numE((SubLObject)TWO_INTEGER) && NIL != f3577(var53.first()) && NIL != f3578(conses_high.second(var53))) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic37$, f3579(var35, var9, var10, var53.first()), f3580(var52, var19, var20, var21, conses_high.second(var53)));
        }
        if (Sequences.length(var53).numE((SubLObject)TWO_INTEGER) && NIL != f3578(var53.first()) && NIL != f3577(conses_high.second(var53))) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic37$, f3580(var52, var19, var20, var21, var53.first()), f3579(var35, var9, var10, conses_high.second(var53)));
        }
        if (Sequences.length(var53).numE((SubLObject)ONE_INTEGER) && NIL != f3577(var53.first())) {
            return f3579(var35, var9, var10, var53.first());
        }
        if (Sequences.length(var53).numE((SubLObject)ONE_INTEGER) && NIL != f3578(var53.first())) {
            return f3580(var52, var19, var20, var21, var53.first());
        }
        Errors.error((SubLObject)$ic38$, var51);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3581(final SubLObject var54) {
        return conses_high.member(var54, (SubLObject)$ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3582(final SubLObject var54) {
        return conses_high.member(var54, (SubLObject)$ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3583(final SubLObject var54) {
        return (SubLObject)makeBoolean(var54.eql((SubLObject)Characters.CHAR_slash) || var54.eql((SubLObject)Characters.CHAR_hyphen) || var54.eql((SubLObject)Characters.CHAR_underbar));
    }
    
    public static SubLObject f3584(final SubLObject var54) {
        return Equality.eql(var54, (SubLObject)Characters.CHAR_colon);
    }
    
    public static SubLObject f3585(final SubLObject var54) {
        return (SubLObject)makeBoolean(var54.eql((SubLObject)Characters.CHAR_y) || var54.eql((SubLObject)Characters.CHAR_Y));
    }
    
    public static SubLObject f3586(final SubLObject var54) {
        return (SubLObject)makeBoolean(var54.eql((SubLObject)Characters.CHAR_m) || var54.eql((SubLObject)Characters.CHAR_M));
    }
    
    public static SubLObject f3587(final SubLObject var54) {
        return (SubLObject)makeBoolean(var54.eql((SubLObject)Characters.CHAR_d) || var54.eql((SubLObject)Characters.CHAR_D));
    }
    
    public static SubLObject f3588(final SubLObject var54) {
        return (SubLObject)makeBoolean(var54.eql((SubLObject)Characters.CHAR_h) || var54.eql((SubLObject)Characters.CHAR_H));
    }
    
    public static SubLObject f3589(final SubLObject var54) {
        return (SubLObject)makeBoolean(var54.eql((SubLObject)Characters.CHAR_m) || var54.eql((SubLObject)Characters.CHAR_M));
    }
    
    public static SubLObject f3590(final SubLObject var54) {
        return (SubLObject)makeBoolean(var54.eql((SubLObject)Characters.CHAR_s) || var54.eql((SubLObject)Characters.CHAR_S));
    }
    
    public static SubLObject f3577(final SubLObject var51) {
        if (NIL == module0035.find_if_not(Symbols.symbol_function((SubLObject)$ic41$), var51, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3578(final SubLObject var51) {
        return (SubLObject)makeBoolean(var51.equalp((SubLObject)$ic42$) || var51.equalp((SubLObject)$ic43$) || var51.equalp((SubLObject)$ic44$) || var51.equalp((SubLObject)$ic45$) || var51.equalp((SubLObject)$ic46$));
    }
    
    public static SubLObject f3576(final SubLObject var51) {
        final SubLObject var52 = module0038.f2661(var51, Symbols.symbol_function((SubLObject)$ic47$), (SubLObject)UNPROVIDED);
        final SubLObject var53 = Sequences.length(var52);
        if (!var53.numGE((SubLObject)ONE_INTEGER) || !var53.numLE((SubLObject)TWO_INTEGER)) {
            return (SubLObject)NIL;
        }
        final SubLObject var54 = ConsesLow.nth((SubLObject)ZERO_INTEGER, var52);
        final SubLObject var55 = ConsesLow.nth((SubLObject)ONE_INTEGER, var52);
        if ((NIL != f3578(var54) && (NIL == var55 || NIL != f3577(var55))) || (NIL != f3577(var54) && (NIL == var55 || NIL != f3578(var55)))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3591(final SubLObject var54) {
        return (SubLObject)makeBoolean(NIL == f3592(var54));
    }
    
    public static SubLObject f3592(final SubLObject var54) {
        return (SubLObject)makeBoolean(NIL != module0038.f2760(var54) || var54.eql((SubLObject)Characters.CHAR_T));
    }
    
    public static SubLObject f3593(final SubLObject var51, final SubLObject var59, final SubLObject var60, final SubLObject var61) {
        if (Sequences.length(var51).numL(var59)) {
            return (SubLObject)NIL;
        }
        SubLObject var62;
        for (var62 = (SubLObject)NIL, var62 = (SubLObject)ZERO_INTEGER; var62.numL(var59); var62 = Numbers.add(var62, (SubLObject)ONE_INTEGER)) {
            if (NIL == Functions.funcall(var60, Strings.sublisp_char(var51, var62))) {
                return (SubLObject)NIL;
            }
        }
        if (Sequences.length(var51).numG(var59) && NIL == Functions.funcall(var61, Strings.sublisp_char(var51, var59))) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f3579(final SubLObject var35, final SubLObject var9, final SubLObject var10, final SubLObject var51) {
        if (NIL != f3593(var51, (SubLObject)FOUR_INTEGER, Symbols.symbol_function((SubLObject)$ic48$), Symbols.symbol_function((SubLObject)$ic49$))) {
            return f3594(var35, var9, var10, var51, (SubLObject)FOUR_INTEGER, var10);
        }
        if (NIL != f3593(var51, (SubLObject)TWO_INTEGER, Symbols.symbol_function((SubLObject)$ic48$), Symbols.symbol_function((SubLObject)$ic49$))) {
            return f3594(var35, var9, var10, var51, (SubLObject)TWO_INTEGER, Numbers.mod(var10, (SubLObject)$ic7$));
        }
        if (NIL != f3593(var51, (SubLObject)TWO_INTEGER, Symbols.symbol_function((SubLObject)$ic50$), Symbols.symbol_function((SubLObject)$ic49$))) {
            return f3594(var35, var9, var10, var51, (SubLObject)TWO_INTEGER, var9);
        }
        if (NIL != f3593(var51, (SubLObject)TWO_INTEGER, Symbols.symbol_function((SubLObject)$ic51$), Symbols.symbol_function((SubLObject)$ic49$))) {
            return f3594(var35, var9, var10, var51, (SubLObject)TWO_INTEGER, var35);
        }
        Errors.error((SubLObject)$ic52$, var51);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3594(final SubLObject var35, final SubLObject var9, final SubLObject var10, final SubLObject var51, final SubLObject var63, final SubLObject var64) {
        final SubLObject var65 = Sequences.cconcatenate((SubLObject)$ic53$, new SubLObject[] { module0038.f2624(var63), $ic54$ });
        return Sequences.cconcatenate(PrintLow.format((SubLObject)NIL, var65, var64), (SubLObject)(Numbers.add(var63, (SubLObject)ONE_INTEGER).numG(Sequences.length(var51)) ? $ic21$ : Sequences.cconcatenate(module0038.f2624(Strings.sublisp_char(var51, var63)), f3579(var35, var9, var10, module0038.f2623(var51, Numbers.add(var63, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED)))));
    }
    
    public static SubLObject f3580(final SubLObject var52, final SubLObject var19, final SubLObject var20, final SubLObject var21, final SubLObject var51) {
        if (NIL == var21) {
            return (SubLObject)$ic21$;
        }
        if (var51.equalp((SubLObject)$ic42$)) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic55$, new SubLObject[] { var21, var20, var19 });
        }
        if (var51.equalp((SubLObject)$ic44$)) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic56$, var21, var20);
        }
        if (var51.equalp((SubLObject)$ic43$)) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic57$, new SubLObject[] { var21, var20, var19, var52 });
        }
        if (var51.equalp((SubLObject)$ic46$)) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic58$, new SubLObject[] { var21, var20, var19, var52 });
        }
        if (var51.equalp((SubLObject)$ic45$)) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic59$, new SubLObject[] { var21, var20, var19, var52 });
        }
        Errors.error((SubLObject)$ic60$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3595(final SubLObject var66, final SubLObject var51) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        assert NIL != f3576(var51) : var51;
        final SubLObject var68 = module0038.f2661(var51, Symbols.symbol_function((SubLObject)$ic47$), (SubLObject)UNPROVIDED);
        final SubLObject var69 = module0038.f2661(var66, Symbols.symbol_function((SubLObject)$ic47$), (SubLObject)UNPROVIDED);
        if (!Sequences.length(var68).eql(Sequences.length(var69))) {
            Errors.error((SubLObject)$ic61$, var51, var66);
        }
        if (Sequences.length(var68).numE((SubLObject)TWO_INTEGER) && NIL != f3577(var68.first()) && NIL != f3578(conses_high.second(var68))) {
            var67.resetMultipleValues();
            final SubLObject var70 = f3596(var69.first(), var68.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var71 = var67.secondMultipleValue();
            final SubLObject var72 = var67.thirdMultipleValue();
            var67.resetMultipleValues();
            var67.resetMultipleValues();
            final SubLObject var73 = f3597(conses_high.second(var69), conses_high.second(var68));
            final SubLObject var74 = var67.secondMultipleValue();
            final SubLObject var75 = var67.thirdMultipleValue();
            final SubLObject var76 = var67.fourthMultipleValue();
            var67.resetMultipleValues();
            return Values.values(var73, var74, var75, var76, var70, var71, var72);
        }
        if (Sequences.length(var68).numE((SubLObject)TWO_INTEGER) && NIL != f3578(var68.first()) && NIL != f3577(conses_high.second(var68))) {
            var67.resetMultipleValues();
            final SubLObject var77 = f3597(var69.first(), var68.first());
            final SubLObject var78 = var67.secondMultipleValue();
            final SubLObject var79 = var67.thirdMultipleValue();
            final SubLObject var80 = var67.fourthMultipleValue();
            var67.resetMultipleValues();
            var67.resetMultipleValues();
            final SubLObject var81 = f3596(conses_high.second(var69), conses_high.second(var68), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var82 = var67.secondMultipleValue();
            final SubLObject var83 = var67.thirdMultipleValue();
            var67.resetMultipleValues();
            return Values.values(var77, var78, var79, var80, var81, var82, var83);
        }
        if (Sequences.length(var68).numE((SubLObject)ONE_INTEGER) && NIL != f3577(var68.first())) {
            var67.resetMultipleValues();
            final SubLObject var70 = f3596(var69.first(), var68.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var71 = var67.secondMultipleValue();
            final SubLObject var72 = var67.thirdMultipleValue();
            var67.resetMultipleValues();
            return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var70, var71, var72);
        }
        if (Sequences.length(var68).numE((SubLObject)ONE_INTEGER) && NIL != f3578(var68.first())) {
            var67.resetMultipleValues();
            final SubLObject var77 = f3597(var69.first(), var68.first());
            final SubLObject var78 = var67.secondMultipleValue();
            final SubLObject var79 = var67.thirdMultipleValue();
            final SubLObject var80 = var67.fourthMultipleValue();
            var67.resetMultipleValues();
            return Values.values(var77, var78, var79, var80, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        Errors.error((SubLObject)$ic62$, var51);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3596(final SubLObject var68, final SubLObject var51, SubLObject var35, SubLObject var9, SubLObject var10) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var69) && !TWO_INTEGER.numGE(Numbers.subtract(Sequences.length(var51), Sequences.length(var68)))) {
            Errors.error((SubLObject)$ic63$, var68, var51);
        }
        if ((NIL != var35 && NIL != var9 && NIL != var10) || var68.equal((SubLObject)$ic21$)) {
            return Values.values(var35, var9, var10);
        }
        if (NIL != f3593(var51, (SubLObject)FOUR_INTEGER, Symbols.symbol_function((SubLObject)$ic48$), Symbols.symbol_function((SubLObject)$ic49$)) && NIL == var10) {
            var10 = reader.read_from_string(var68, (SubLObject)NIL, (SubLObject)$ic64$, (SubLObject)ZERO_INTEGER, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED);
            if (Sequences.length(var68).numG((SubLObject)FOUR_INTEGER)) {
                var69.resetMultipleValues();
                final SubLObject var70 = f3596(module0038.f2623(var68, (SubLObject)FIVE_INTEGER, (SubLObject)UNPROVIDED), module0038.f2623(var51, (SubLObject)FIVE_INTEGER, (SubLObject)UNPROVIDED), var35, var9, var10);
                final SubLObject var71 = var69.secondMultipleValue();
                final SubLObject var72 = var69.thirdMultipleValue();
                var69.resetMultipleValues();
                return Values.values(var70, var71, var72);
            }
            return Values.values(var35, var9, var10);
        }
        else if (NIL != f3593(var51, (SubLObject)TWO_INTEGER, Symbols.symbol_function((SubLObject)$ic48$), Symbols.symbol_function((SubLObject)$ic49$)) && NIL == var10) {
            var10 = reader.read_from_string(var68, (SubLObject)NIL, (SubLObject)$ic64$, (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            if (Sequences.length(var68).numG((SubLObject)TWO_INTEGER)) {
                var69.resetMultipleValues();
                final SubLObject var70 = f3596(module0038.f2623(var68, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED), module0038.f2623(var51, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED), var35, var9, var10);
                final SubLObject var71 = var69.secondMultipleValue();
                final SubLObject var72 = var69.thirdMultipleValue();
                var69.resetMultipleValues();
                return Values.values(var70, var71, var72);
            }
            return Values.values(var35, var9, var10);
        }
        else if (NIL != f3593(var51, (SubLObject)TWO_INTEGER, Symbols.symbol_function((SubLObject)$ic50$), Symbols.symbol_function((SubLObject)$ic49$)) && NIL == var9) {
            SubLObject var73 = Sequences.position_if(Symbols.symbol_function((SubLObject)$ic49$), var68, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var73) {
                var73 = (SubLObject)TWO_INTEGER;
            }
            var9 = reader.read_from_string(var68, (SubLObject)NIL, (SubLObject)$ic64$, (SubLObject)ZERO_INTEGER, var73, (SubLObject)UNPROVIDED);
            if (Sequences.length(var68).numG(var73)) {
                var69.resetMultipleValues();
                final SubLObject var74 = f3596(module0038.f2623(var68, module0048.f_1X(var73), (SubLObject)UNPROVIDED), module0038.f2623(var51, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED), var35, var9, var10);
                final SubLObject var75 = var69.secondMultipleValue();
                final SubLObject var76 = var69.thirdMultipleValue();
                var69.resetMultipleValues();
                return Values.values(var74, var75, var76);
            }
            return Values.values(var35, var9, var10);
        }
        else {
            if (NIL == f3593(var51, (SubLObject)TWO_INTEGER, Symbols.symbol_function((SubLObject)$ic51$), Symbols.symbol_function((SubLObject)$ic49$)) || NIL != var35) {
                Errors.error((SubLObject)$ic65$, var51, var68);
                return (SubLObject)NIL;
            }
            SubLObject var77 = Sequences.position_if(Symbols.symbol_function((SubLObject)$ic49$), var68, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var77) {
                var77 = (SubLObject)TWO_INTEGER;
            }
            var35 = reader.read_from_string(var68, (SubLObject)NIL, (SubLObject)$ic64$, (SubLObject)ZERO_INTEGER, var77, (SubLObject)UNPROVIDED);
            if (Sequences.length(var68).numG(var77)) {
                var69.resetMultipleValues();
                final SubLObject var74 = f3596(module0038.f2623(var68, module0048.f_1X(var77), (SubLObject)UNPROVIDED), module0038.f2623(var51, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED), var35, var9, var10);
                final SubLObject var75 = var69.secondMultipleValue();
                final SubLObject var76 = var69.thirdMultipleValue();
                var69.resetMultipleValues();
                return Values.values(var74, var75, var76);
            }
            return Values.values(var35, var9, var10);
        }
    }
    
    public static SubLObject f3597(final SubLObject var74, final SubLObject var51) {
        final SubLThread var75 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var75) && NIL == conses_high.member(var51, (SubLObject)$ic66$, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic67$, var51);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var75) && !Sequences.length(var74).numE(Sequences.length(var51))) {
            Errors.error((SubLObject)$ic68$, var74, var51);
        }
        final SubLObject var76 = reader.read_from_string(var74, (SubLObject)NIL, (SubLObject)$ic64$, (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var77 = reader.read_from_string(var74, (SubLObject)NIL, (SubLObject)$ic64$, (SubLObject)THREE_INTEGER, (SubLObject)FIVE_INTEGER, (SubLObject)UNPROVIDED);
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)NIL;
        if (var51.equalp((SubLObject)$ic42$) || var51.equalp((SubLObject)$ic45$) || var51.equalp((SubLObject)$ic46$) || var51.equalp((SubLObject)$ic43$)) {
            var78 = reader.read_from_string(var74, (SubLObject)NIL, (SubLObject)$ic64$, (SubLObject)SIX_INTEGER, (SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED);
        }
        if (var51.equalp((SubLObject)$ic43$)) {
            var79 = reader.read_from_string(var74, (SubLObject)NIL, (SubLObject)$ic64$, (SubLObject)NINE_INTEGER, (SubLObject)TWELVE_INTEGER, (SubLObject)UNPROVIDED);
        }
        else if (var51.equalp((SubLObject)$ic46$)) {
            var79 = reader.read_from_string(var74, (SubLObject)NIL, (SubLObject)$ic64$, (SubLObject)NINE_INTEGER, (SubLObject)ELEVEN_INTEGER, (SubLObject)UNPROVIDED);
        }
        else if (var51.equalp((SubLObject)$ic45$)) {
            var79 = reader.read_from_string(var74, (SubLObject)NIL, (SubLObject)$ic64$, (SubLObject)NINE_INTEGER, (SubLObject)TEN_INTEGER, (SubLObject)UNPROVIDED);
        }
        return Values.values(var79, var78, var77, var76);
    }
    
    public static SubLObject f3598(final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        assert NIL != module0048.f3294(var75) : var75;
        var76.resetMultipleValues();
        final SubLObject var77 = Numbers.truncate(var75, (SubLObject)UNPROVIDED);
        final SubLObject var78 = var76.secondMultipleValue();
        var76.resetMultipleValues();
        SubLObject var80;
        final SubLObject var79 = var80 = module0048.f3405(var77, (SubLObject)ConsesLow.list($g81$.getGlobalValue(), $g997$.getGlobalValue(), $g998$.getGlobalValue()));
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic69$);
        var81 = var80.first();
        var80 = var80.rest();
        final SubLObject var82 = (SubLObject)(var80.isCons() ? var80.first() : ZERO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var80, var79, (SubLObject)$ic69$);
        var80 = var80.rest();
        final SubLObject var83 = (SubLObject)(var80.isCons() ? var80.first() : ZERO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var80, var79, (SubLObject)$ic69$);
        var80 = var80.rest();
        final SubLObject var84 = (SubLObject)(var80.isCons() ? var80.first() : ZERO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var80, var79, (SubLObject)$ic69$);
        var80 = var80.rest();
        if (NIL == var80) {
            final SubLObject var85 = Numbers.add(var81, var78);
            return Values.values(var85, var82, var83, var84);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3599(final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        assert NIL != module0048.f3294(var75) : var75;
        var76.resetMultipleValues();
        final SubLObject var77 = Numbers.truncate(var75, (SubLObject)UNPROVIDED);
        final SubLObject var78 = var76.secondMultipleValue();
        var76.resetMultipleValues();
        SubLObject var80;
        final SubLObject var79 = var80 = module0048.f3405(var77, (SubLObject)ConsesLow.list($g81$.getGlobalValue(), $g997$.getGlobalValue()));
        SubLObject var81 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic70$);
        var81 = var80.first();
        var80 = var80.rest();
        final SubLObject var82 = (SubLObject)(var80.isCons() ? var80.first() : ZERO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var80, var79, (SubLObject)$ic70$);
        var80 = var80.rest();
        final SubLObject var83 = (SubLObject)(var80.isCons() ? var80.first() : ZERO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var80, var79, (SubLObject)$ic70$);
        var80 = var80.rest();
        if (NIL == var80) {
            final SubLObject var84 = Numbers.add(var81, var78);
            return Values.values(var84, var82, var83);
        }
        cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic70$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3600(SubLObject var11, SubLObject var13, SubLObject var14, SubLObject var81) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)ZERO_INTEGER;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)ZERO_INTEGER;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)ZERO_INTEGER;
        }
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)ZERO_INTEGER;
        }
        assert NIL != module0048.f3294(var11) : var11;
        assert NIL != module0004.f106(var13) : var13;
        assert NIL != module0004.f106(var14) : var14;
        assert NIL != module0004.f106(var81) : var81;
        return module0048.f3406((SubLObject)ConsesLow.list(var11, var13, var14, var81), (SubLObject)ConsesLow.list($g81$.getGlobalValue(), $g997$.getGlobalValue(), $g998$.getGlobalValue()));
    }
    
    public static SubLObject f3601(SubLObject var11, SubLObject var13, SubLObject var14, SubLObject var81) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)ZERO_INTEGER;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)ZERO_INTEGER;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)ZERO_INTEGER;
        }
        if (var81 == UNPROVIDED) {
            var81 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        assert NIL != module0048.f3294(var11) : var11;
        assert NIL != module0004.f106(var13) : var13;
        assert NIL != module0004.f106(var14) : var14;
        assert NIL != module0004.f106(var81) : var81;
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = (SubLObject)NIL;
        try {
            var84 = streams_high.make_private_string_output_stream();
            if (!ZERO_INTEGER.numE(var81)) {
                PrintLow.format(var84, (SubLObject)$ic71$, var81, (SubLObject)(ONE_INTEGER.numE(var81) ? $ic21$ : $ic72$));
            }
            if (!ZERO_INTEGER.numE(var14)) {
                PrintLow.format(var84, (SubLObject)$ic73$, var14, (SubLObject)(ONE_INTEGER.numE(var14) ? $ic21$ : $ic72$));
            }
            if (!ZERO_INTEGER.numE(var13)) {
                PrintLow.format(var84, (SubLObject)$ic74$, var13, (SubLObject)(ONE_INTEGER.numE(var13) ? $ic21$ : $ic72$));
            }
            if (!ZERO_INTEGER.numE(var11)) {
                final SubLObject var85 = reader.$read_default_float_format$.currentBinding(var82);
                try {
                    reader.$read_default_float_format$.bind((SubLObject)$ic75$, var82);
                    PrintLow.format(var84, (SubLObject)$ic76$, var11.isDouble() ? module0048.f3302(var11, (SubLObject)EIGHT_INTEGER) : var11, (SubLObject)(ONE_INTEGER.numE(var11) ? $ic21$ : $ic72$));
                }
                finally {
                    reader.$read_default_float_format$.rebind(var85, var82);
                }
            }
            var83 = streams_high.get_output_stream_string(var84);
        }
        finally {
            final SubLObject var86 = Threads.$is_thread_performing_cleanupP$.currentBinding(var82);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var82);
                streams_high.close(var84, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var86, var82);
            }
        }
        if (NIL != module0038.f2608(var83)) {
            return (SubLObject)$ic77$;
        }
        return var83;
    }
    
    public static SubLObject f3602(final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        var76.resetMultipleValues();
        final SubLObject var77 = f3598(var75);
        final SubLObject var78 = var76.secondMultipleValue();
        final SubLObject var79 = var76.thirdMultipleValue();
        final SubLObject var80 = var76.fourthMultipleValue();
        var76.resetMultipleValues();
        return f3601(var77, var78, var79, var80);
    }
    
    public static SubLObject f3603(final SubLObject var8) {
        if (var8.isInteger()) {
            if (var8.isNegative()) {
                return f3603(Numbers.minus(var8));
            }
            final SubLObject var9 = Numbers.rem(var8, (SubLObject)$ic7$);
            if (var9.numLE((SubLObject)$ic15$)) {
                final SubLObject var10 = Numbers.integerDivide(var8, (SubLObject)$ic7$);
                final SubLObject var11 = Numbers.rem(var10, (SubLObject)$ic7$);
                if (ONE_INTEGER.numLE(var11) && var11.numLE((SubLObject)TWELVE_INTEGER)) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3557(SubLObject var17, SubLObject var38) {
        if (var17 == UNPROVIDED) {
            var17 = Time.get_universal_time();
        }
        if (var38 == UNPROVIDED) {
            var38 = (SubLObject)NIL;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        assert NIL != f3549(var17) : var17;
        var39.resetMultipleValues();
        final SubLObject var40 = Time.decode_universal_time(var17, var38);
        final SubLObject var41 = var39.secondMultipleValue();
        final SubLObject var42 = var39.thirdMultipleValue();
        final SubLObject var43 = var39.fourthMultipleValue();
        final SubLObject var44 = var39.fifthMultipleValue();
        final SubLObject var45 = var39.sixthMultipleValue();
        var39.resetMultipleValues();
        return f3604(var43, var44, var45);
    }
    
    public static SubLObject f3605() {
        return f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3606() {
        return f3607(f3605(), (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f3608() {
        return f3609(f3605(), (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f3610() {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)FIVE_INTEGER), Time.decode_universal_time(Time.get_universal_time(), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f3609(final SubLObject var23, final SubLObject var88) {
        assert NIL != f3603(var23) : var23;
        assert NIL != Types.integerp(var88) : var88;
        return f3611(var23, var88);
    }
    
    public static SubLObject f3607(final SubLObject var23, final SubLObject var88) {
        assert NIL != f3603(var23) : var23;
        assert NIL != Types.integerp(var88) : var88;
        return f3611(var23, Numbers.minus(var88));
    }
    
    public static SubLObject f3611(final SubLObject var23, final SubLObject var88) {
        final SubLObject var89 = (SubLObject)ZERO_INTEGER;
        final SubLObject var90 = f3612(var23, var89);
        final SubLObject var91 = Numbers.multiply($g995$.getGlobalValue(), var88);
        final SubLObject var92 = Numbers.add(var90, var91);
        return f3557(var92, var89);
    }
    
    public static SubLObject f3613(SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var23) : var23;
        if (var23.isNegative()) {
            var24.resetMultipleValues();
            final SubLObject var25 = f3613(Numbers.minus(var23));
            final SubLObject var26 = var24.secondMultipleValue();
            final SubLObject var27 = var24.thirdMultipleValue();
            var24.resetMultipleValues();
            return Values.values(var25, var26, Numbers.minus(var27));
        }
        final SubLObject var25 = Numbers.rem(var23, (SubLObject)$ic7$);
        final SubLObject var26 = Numbers.integerDivide(Numbers.rem(var23, (SubLObject)$ic82$), (SubLObject)$ic7$);
        final SubLObject var27 = Numbers.integerDivide(var23, (SubLObject)$ic82$);
        return Values.values(var25, var26, var27);
    }
    
    public static SubLObject f3614(SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ZERO_INTEGER), f3613(var23));
    }
    
    public static SubLObject f3615(SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f3613(var23));
    }
    
    public static SubLObject f3616(SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)TWO_INTEGER), f3613(var23));
    }
    
    public static SubLObject f3604(final SubLObject var35, final SubLObject var9, final SubLObject var10) {
        assert NIL != Types.integerp(var35) : var35;
        assert NIL != Numbers.plusp(var35) : var35;
        assert NIL != Types.integerp(var9) : var9;
        assert NIL != Numbers.plusp(var9) : var9;
        assert NIL != Types.integerp(var10) : var10;
        if (var10.isNegative()) {
            return Numbers.minus(f3604(var35, var9, Numbers.minus(var10)));
        }
        return Numbers.add(Numbers.multiply(var10, (SubLObject)$ic82$), Numbers.multiply(var9, (SubLObject)$ic7$), var35);
    }
    
    public static SubLObject f3617(SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert NIL != f3603(var23) : var23;
        var24.resetMultipleValues();
        final SubLObject var25 = f3613(var23);
        final SubLObject var26 = var24.secondMultipleValue();
        final SubLObject var27 = var24.thirdMultipleValue();
        var24.resetMultipleValues();
        return f3618(var25, var26, var27);
    }
    
    public static SubLObject f3619(final SubLObject var91, final SubLObject var92) {
        if (f3620(var91).numL(f3620(var92))) {
            return (SubLObject)T;
        }
        if (f3620(var92).numL(f3620(var91))) {
            return (SubLObject)NIL;
        }
        if (f3621(var91).numL(f3621(var92))) {
            return (SubLObject)T;
        }
        if (f3621(var92).numL(f3621(var91))) {
            return (SubLObject)NIL;
        }
        if (f3622(var91).numL(f3622(var92))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3623(final SubLObject var91, final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        var93.resetMultipleValues();
        final SubLObject var94 = f3624(var91);
        final SubLObject var95 = var93.secondMultipleValue();
        final SubLObject var96 = var93.thirdMultipleValue();
        var93.resetMultipleValues();
        var93.resetMultipleValues();
        final SubLObject var97 = f3624(var92);
        final SubLObject var98 = var93.secondMultipleValue();
        final SubLObject var99 = var93.thirdMultipleValue();
        var93.resetMultipleValues();
        return Numbers.subtract(f3604(var94, var95, var96), f3604(var97, var98, var99));
    }
    
    public static SubLObject f3620(final SubLObject var68) {
        return module0038.f2642(module0038.f2623(var68, (SubLObject)SIX_INTEGER, (SubLObject)TEN_INTEGER));
    }
    
    public static SubLObject f3621(final SubLObject var68) {
        return module0038.f2642(module0038.f2623(var68, (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER));
    }
    
    public static SubLObject f3622(final SubLObject var68) {
        return module0038.f2642(module0038.f2623(var68, (SubLObject)THREE_INTEGER, (SubLObject)FIVE_INTEGER));
    }
    
    public static SubLObject f3618(final SubLObject var35, final SubLObject var9, final SubLObject var10) {
        assert NIL != Types.integerp(var35) : var35;
        assert NIL != Numbers.plusp(var35) : var35;
        assert NIL != Types.integerp(var9) : var9;
        assert NIL != Numbers.plusp(var9) : var9;
        assert NIL != Types.integerp(var10) : var10;
        if (!var10.isNegative() && var10.numL((SubLObject)$ic82$)) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic84$, new SubLObject[] { var9, var35, var10 });
        }
        if (!var10.isNegative()) {
            return PrintLow.format((SubLObject)NIL, (SubLObject)$ic85$, new SubLObject[] { var9, var35, var10 });
        }
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic86$, new SubLObject[] { var9, var35, Numbers.minus(var10) });
    }
    
    public static SubLObject f3624(final SubLObject var68) {
        return Values.values(f3622(var68), f3621(var68), f3620(var68));
    }
    
    public static SubLObject f3625(SubLObject var23, SubLObject var59) {
        if (var23 == UNPROVIDED) {
            var23 = f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)ONE_INTEGER;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        assert NIL != f3603(var23) : var23;
        var60.resetMultipleValues();
        final SubLObject var61 = f3613(var23);
        SubLObject var62 = var60.secondMultipleValue();
        SubLObject var63 = var60.thirdMultipleValue();
        var60.resetMultipleValues();
        var62 = Numbers.subtract(var62, var59);
        if (!var62.numG((SubLObject)ZERO_INTEGER)) {
            var63 = Numbers.subtract(var63, (SubLObject)ONE_INTEGER);
            var62 = Numbers.add(var62, $g1000$.getGlobalValue());
        }
        return f3604(var61, var62, var63);
    }
    
    public static SubLObject f3626(SubLObject var17, SubLObject var99) {
        if (var17 == UNPROVIDED) {
            var17 = Time.get_universal_time();
        }
        if (var99 == UNPROVIDED) {
            var99 = (SubLObject)$ic87$;
        }
        assert NIL != f3549(var17) : var17;
        final SubLObject var100 = f3627(var17, var99);
        return Numbers.add(var100, f3628(var99));
    }
    
    public static SubLObject f3629(final SubLObject var23, SubLObject var100) {
        if (var100 == UNPROVIDED) {
            var100 = (SubLObject)NIL;
        }
        assert NIL != f3603(var23) : var23;
        SubLObject var101 = f3612(var23, (SubLObject)UNPROVIDED);
        if (NIL != var100) {
            var101 = Numbers.add(var101, Numbers.multiply((SubLObject)TWELVE_INTEGER, $g996$.getGlobalValue()));
        }
        return f3626(var101, (SubLObject)$ic88$);
    }
    
    public static SubLObject f3628(final SubLObject var99) {
        if (NIL == module0035.f2293($g1004$.getGlobalValue(), var99, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            $g1004$.setGlobalValue(module0035.f2063($g1004$.getGlobalValue(), var99, f3630(var99), (SubLObject)UNPROVIDED));
        }
        return module0035.f2293($g1004$.getGlobalValue(), var99, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3630(final SubLObject var99) {
        SubLObject var101;
        final SubLObject var100 = var101 = $g1003$.getGlobalValue();
        SubLObject var102 = (SubLObject)NIL;
        SubLObject var103 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var101, var100, (SubLObject)$ic91$);
        var102 = var101.first();
        var101 = (var103 = var101.rest());
        final SubLObject var104 = f3612(var102, (SubLObject)UNPROVIDED);
        final SubLObject var105 = f3627(var104, var99);
        final SubLObject var106 = Numbers.subtract(var103, var105);
        return (var99 == $ic88$) ? Numbers.floor(var106, (SubLObject)UNPROVIDED) : var106;
    }
    
    public static SubLObject f3612(final SubLObject var23, SubLObject var38) {
        if (var38 == UNPROVIDED) {
            var38 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        var39.resetMultipleValues();
        final SubLObject var40 = f3613(var23);
        final SubLObject var41 = var39.secondMultipleValue();
        final SubLObject var42 = var39.thirdMultipleValue();
        var39.resetMultipleValues();
        return Time.encode_universal_time((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER, var40, var41, var42, var38);
    }
    
    public static SubLObject f3627(final SubLObject var17, final SubLObject var99) {
        if (var99.eql((SubLObject)$ic88$)) {
            return Numbers.integerDivide(Numbers.add(var17, Numbers.multiply($g996$.getGlobalValue(), (SubLObject)TWELVE_INTEGER)), $g995$.getGlobalValue());
        }
        return Numbers.divide(var17, $g995$.getGlobalValue());
    }
    
    public static SubLObject f3631(final SubLObject var8) {
        if (var8.isInteger() && !var8.isNegative() && var8.numLE((SubLObject)$ic92$) && Numbers.rem(var8, (SubLObject)$ic7$).numL($g81$.getGlobalValue())) {
            SubLObject var9 = Numbers.integerDivide(var8, (SubLObject)$ic7$);
            if (Numbers.rem(var9, (SubLObject)$ic7$).numL($g997$.getGlobalValue())) {
                var9 = Numbers.integerDivide(var9, (SubLObject)$ic7$);
                if (var9.numL($g998$.getGlobalValue())) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3558(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = Time.get_universal_time();
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        assert NIL != f3549(var17) : var17;
        var18.resetMultipleValues();
        final SubLObject var19 = Time.decode_universal_time(var17, (SubLObject)UNPROVIDED);
        final SubLObject var20 = var18.secondMultipleValue();
        final SubLObject var21 = var18.thirdMultipleValue();
        final SubLObject var22 = var18.fourthMultipleValue();
        final SubLObject var23 = var18.fifthMultipleValue();
        final SubLObject var24 = var18.sixthMultipleValue();
        var18.resetMultipleValues();
        return f3632(var19, var20, var21);
    }
    
    public static SubLObject f3633(SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = f3558((SubLObject)UNPROVIDED);
        }
        assert NIL != Types.integerp(var24) : var24;
        SubLObject var25 = var24;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        var26 = Numbers.rem(var25, (SubLObject)$ic7$);
        var25 = Numbers.integerDivide(var25, (SubLObject)$ic7$);
        var27 = Numbers.rem(var25, (SubLObject)$ic7$);
        var25 = (var28 = Numbers.integerDivide(var25, (SubLObject)$ic7$));
        return Values.values(var26, var27, var28);
    }
    
    public static SubLObject f3632(final SubLObject var19, final SubLObject var20, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var19) : var19;
        assert NIL != Types.integerp(var20) : var20;
        assert NIL != Types.integerp(var21) : var21;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var22) && (!ZERO_INTEGER.numLE(var19) || !var19.numLE((SubLObject)$ic17$))) {
            Errors.error((SubLObject)$ic93$, var19);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var22) && (!ZERO_INTEGER.numLE(var20) || !var20.numLE((SubLObject)$ic17$))) {
            Errors.error((SubLObject)$ic94$, var20);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var22) && (!ZERO_INTEGER.numLE(var21) || !var21.numLE((SubLObject)$ic17$))) {
            Errors.error((SubLObject)$ic95$, var21);
        }
        return Numbers.add(Numbers.multiply(var21, (SubLObject)$ic82$), Numbers.multiply(var20, (SubLObject)$ic7$), var19);
    }
    
    public static SubLObject f3634(SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = f3558((SubLObject)UNPROVIDED);
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert NIL != f3631(var24) : var24;
        var25.resetMultipleValues();
        final SubLObject var26 = f3633(var24);
        final SubLObject var27 = var25.secondMultipleValue();
        final SubLObject var28 = var25.thirdMultipleValue();
        var25.resetMultipleValues();
        return f3635(var26, var27, var28);
    }
    
    public static SubLObject f3635(final SubLObject var19, final SubLObject var20, final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var19) : var19;
        assert NIL != Types.integerp(var20) : var20;
        assert NIL != Types.integerp(var21) : var21;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var22) && (!ZERO_INTEGER.numLE(var19) || !var19.numLE((SubLObject)$ic17$))) {
            Errors.error((SubLObject)$ic93$, var19);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var22) && (!ZERO_INTEGER.numLE(var20) || !var20.numLE((SubLObject)$ic17$))) {
            Errors.error((SubLObject)$ic94$, var20);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var22) && (!ZERO_INTEGER.numLE(var21) || !var21.numLE((SubLObject)$ic17$))) {
            Errors.error((SubLObject)$ic95$, var21);
        }
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic97$, new SubLObject[] { var21, var20, var19 });
    }
    
    public static SubLObject f3636(final SubLObject var108) {
        return Values.values(f3637(var108), f3638(var108), f3639(var108));
    }
    
    public static SubLObject f3640(final SubLObject var109, final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        var111.resetMultipleValues();
        final SubLObject var112 = f3636(var109);
        final SubLObject var113 = var111.secondMultipleValue();
        final SubLObject var114 = var111.thirdMultipleValue();
        var111.resetMultipleValues();
        var111.resetMultipleValues();
        final SubLObject var115 = f3636(var110);
        final SubLObject var116 = var111.secondMultipleValue();
        final SubLObject var117 = var111.thirdMultipleValue();
        var111.resetMultipleValues();
        return Numbers.add(Numbers.subtract(var112, var115), Numbers.multiply($g81$.getGlobalValue(), Numbers.subtract(var113, var116)), Numbers.multiply($g996$.getGlobalValue(), Numbers.subtract(var114, var117)));
    }
    
    public static SubLObject f3639(final SubLObject var108) {
        return module0038.f2642(module0038.f2623(var108, (SubLObject)ZERO_INTEGER, (SubLObject)TWO_INTEGER));
    }
    
    public static SubLObject f3638(final SubLObject var108) {
        return module0038.f2642(module0038.f2623(var108, (SubLObject)THREE_INTEGER, (SubLObject)FIVE_INTEGER));
    }
    
    public static SubLObject f3637(final SubLObject var108) {
        return module0038.f2642(module0038.f2623(var108, (SubLObject)SIX_INTEGER, (SubLObject)EIGHT_INTEGER));
    }
    
    public static SubLObject f3641(final SubLObject var21, final SubLObject var20, SubLObject var19, SubLObject var52) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)ZERO_INTEGER;
        }
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var53 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var52) : var52;
        assert NIL != Types.integerp(var19) : var19;
        assert NIL != Types.integerp(var20) : var20;
        assert NIL != Types.integerp(var21) : var21;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var53) && (!ZERO_INTEGER.numLE(var52) || !var52.numLE((SubLObject)$ic98$))) {
            Errors.error((SubLObject)$ic99$, var19);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var53) && (!ZERO_INTEGER.numLE(var19) || !var19.numLE((SubLObject)$ic17$))) {
            Errors.error((SubLObject)$ic93$, var19);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var53) && (!ZERO_INTEGER.numLE(var20) || !var20.numLE((SubLObject)$ic17$))) {
            Errors.error((SubLObject)$ic94$, var20);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var53) && (!ZERO_INTEGER.numLE(var21) || !var21.numLE((SubLObject)$ic17$))) {
            Errors.error((SubLObject)$ic95$, var21);
        }
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic100$, new SubLObject[] { var21, var20, var19, var52 });
    }
    
    public static SubLObject f3642(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = Time.get_universal_time();
        }
        assert NIL != f3549(var17) : var17;
        return Values.values(f3557(var17, (SubLObject)UNPROVIDED), f3558(var17));
    }
    
    public static SubLObject f3643(final SubLObject var23, SubLObject var24) {
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        assert NIL != f3603(var23) : var23;
        assert NIL != f3631(var24) : var24;
        var25.resetMultipleValues();
        final SubLObject var26 = f3633(var24);
        final SubLObject var27 = var25.secondMultipleValue();
        final SubLObject var28 = var25.thirdMultipleValue();
        var25.resetMultipleValues();
        var25.resetMultipleValues();
        final SubLObject var29 = f3613(var23);
        final SubLObject var30 = var25.secondMultipleValue();
        final SubLObject var31 = var25.thirdMultipleValue();
        var25.resetMultipleValues();
        return Time.encode_universal_time(var26, var27, var28, var29, var30, var31, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3644() {
        final SubLObject var117 = Time.get_internal_real_time();
        final SubLObject var118 = Time.get_universal_time();
        final SubLObject var119 = Numbers.divide(time_high.$internal_time_units_per_second$.getGlobalValue(), (SubLObject)$ic25$);
        final SubLObject var120 = Numbers.truncate(Numbers.divide(var117, var119), (SubLObject)UNPROVIDED);
        final SubLObject var121 = Numbers.rem(var120, (SubLObject)$ic25$);
        final SubLObject var122 = Numbers.add(Numbers.multiply(var118, (SubLObject)$ic25$), var121);
        return var122;
    }
    
    public static SubLObject f3561(SubLObject var122) {
        if (var122 == UNPROVIDED) {
            var122 = Time.get_internal_real_time();
        }
        final SubLObject var123 = Numbers.divide(time_high.$internal_time_units_per_second$.getGlobalValue(), (SubLObject)$ic25$);
        final SubLObject var124 = Numbers.truncate(Numbers.divide(var122, var123), (SubLObject)UNPROVIDED);
        final SubLObject var125 = Numbers.rem(var124, (SubLObject)$ic25$);
        final SubLObject var126 = f3558((SubLObject)UNPROVIDED);
        return Numbers.add(Numbers.multiply((SubLObject)$ic25$, var126), var125);
    }
    
    public static SubLObject f3645(final SubLObject var8) {
        if (!var8.isInteger()) {
            return (SubLObject)NIL;
        }
        if (var8.isNegative()) {
            return f3645(Numbers.minus(var8));
        }
        final SubLObject var9 = Numbers.rem(var8, (SubLObject)$ic7$);
        final SubLObject var10 = Numbers.integerDivide(Numbers.rem(var8, (SubLObject)$ic82$), (SubLObject)$ic7$);
        final SubLObject var11 = Numbers.integerDivide(Numbers.rem(var8, (SubLObject)$ic23$), (SubLObject)$ic82$);
        final SubLObject var12 = Numbers.integerDivide(Numbers.rem(var8, (SubLObject)$ic101$), (SubLObject)$ic23$);
        final SubLObject var13 = Numbers.integerDivide(Numbers.rem(var8, (SubLObject)$ic102$), (SubLObject)$ic101$);
        return (SubLObject)makeBoolean(var9.numLE((SubLObject)$ic5$) && var10.numLE((SubLObject)$ic5$) && var11.numLE((SubLObject)$ic16$) && var12.numGE((SubLObject)ONE_INTEGER) && var12.numLE((SubLObject)$ic15$) && var13.numGE((SubLObject)ONE_INTEGER) && var13.numLE((SubLObject)TWELVE_INTEGER));
    }
    
    public static SubLObject f3646(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = Time.get_universal_time();
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        assert NIL != f3549(var17) : var17;
        var18.resetMultipleValues();
        final SubLObject var19 = Time.decode_universal_time(var17, (SubLObject)UNPROVIDED);
        final SubLObject var20 = var18.secondMultipleValue();
        final SubLObject var21 = var18.thirdMultipleValue();
        final SubLObject var22 = var18.fourthMultipleValue();
        final SubLObject var23 = var18.fifthMultipleValue();
        final SubLObject var24 = var18.sixthMultipleValue();
        var18.resetMultipleValues();
        return f3647(var19, var20, var21, var22, var23, var24);
    }
    
    public static SubLObject f3647(final SubLObject var19, final SubLObject var20, final SubLObject var21, final SubLObject var35, final SubLObject var9, final SubLObject var10) {
        if (var10.isNegative()) {
            return Numbers.minus(f3647(var19, var20, var21, var35, var9, Numbers.minus(var10)));
        }
        final SubLObject var36 = f3604(var35, var9, var10);
        final SubLObject var37 = f3632(var19, var20, var21);
        return Numbers.add(Numbers.multiply(var36, (SubLObject)$ic23$), var37);
    }
    
    public static SubLObject f3648(SubLObject var123) {
        if (var123 == UNPROVIDED) {
            var123 = f3646((SubLObject)UNPROVIDED);
        }
        final SubLThread var124 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var123) : var123;
        if (var123.isNegative()) {
            var124.resetMultipleValues();
            final SubLObject var125 = f3648(Numbers.minus(var123));
            final SubLObject var126 = var124.secondMultipleValue();
            final SubLObject var127 = var124.thirdMultipleValue();
            final SubLObject var128 = var124.fourthMultipleValue();
            final SubLObject var129 = var124.fifthMultipleValue();
            final SubLObject var130 = var124.sixthMultipleValue();
            var124.resetMultipleValues();
            return Values.values(var125, var126, var127, var128, var129, Numbers.minus(var130));
        }
        final SubLObject var131 = Numbers.rem(var123, (SubLObject)$ic23$);
        final SubLObject var132 = Numbers.integerDivide(var123, (SubLObject)$ic23$);
        var124.resetMultipleValues();
        final SubLObject var133 = f3633(var131);
        final SubLObject var134 = var124.secondMultipleValue();
        final SubLObject var135 = var124.thirdMultipleValue();
        var124.resetMultipleValues();
        var124.resetMultipleValues();
        final SubLObject var136 = f3613(var132);
        final SubLObject var137 = var124.secondMultipleValue();
        final SubLObject var138 = var124.thirdMultipleValue();
        var124.resetMultipleValues();
        return Values.values(var133, var134, var135, var136, var137, var138);
    }
    
    public static SubLObject f3649(final SubLObject var22, SubLObject var38) {
        if (var38 == UNPROVIDED) {
            var38 = (SubLObject)SIX_INTEGER;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)NIL;
        var39.resetMultipleValues();
        final SubLObject var41 = f3648(var22);
        final SubLObject var42 = var39.secondMultipleValue();
        final SubLObject var43 = var39.thirdMultipleValue();
        final SubLObject var44 = var39.fourthMultipleValue();
        final SubLObject var45 = var39.fifthMultipleValue();
        final SubLObject var46 = var39.sixthMultipleValue();
        var39.resetMultipleValues();
        var40 = Time.encode_universal_time(var41, var42, var43, var44, var45, var46, var38);
        return var40;
    }
    
    public static SubLObject f3650(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        var124.resetMultipleValues();
        final SubLObject var125 = f3648(var123);
        final SubLObject var126 = var124.secondMultipleValue();
        final SubLObject var127 = var124.thirdMultipleValue();
        final SubLObject var128 = var124.fourthMultipleValue();
        final SubLObject var129 = var124.fifthMultipleValue();
        final SubLObject var130 = var124.sixthMultipleValue();
        var124.resetMultipleValues();
        var124.resetMultipleValues();
        final SubLObject var131 = f3651(var130, var129, var128, var127, var126, Numbers.subtract(var125, (SubLObject)ONE_INTEGER));
        final SubLObject var132 = var124.secondMultipleValue();
        final SubLObject var133 = var124.thirdMultipleValue();
        final SubLObject var134 = var124.fourthMultipleValue();
        final SubLObject var135 = var124.fifthMultipleValue();
        final SubLObject var136 = var124.sixthMultipleValue();
        var124.resetMultipleValues();
        return f3647(var136, var135, var134, var133, var132, var131);
    }
    
    public static SubLObject f3652(final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        var124.resetMultipleValues();
        final SubLObject var125 = f3648(var123);
        final SubLObject var126 = var124.secondMultipleValue();
        final SubLObject var127 = var124.thirdMultipleValue();
        final SubLObject var128 = var124.fourthMultipleValue();
        final SubLObject var129 = var124.fifthMultipleValue();
        final SubLObject var130 = var124.sixthMultipleValue();
        var124.resetMultipleValues();
        var124.resetMultipleValues();
        final SubLObject var131 = f3651(var130, var129, var128, var127, var126, Numbers.add(var125, (SubLObject)ONE_INTEGER));
        final SubLObject var132 = var124.secondMultipleValue();
        final SubLObject var133 = var124.thirdMultipleValue();
        final SubLObject var134 = var124.fourthMultipleValue();
        final SubLObject var135 = var124.fifthMultipleValue();
        final SubLObject var136 = var124.sixthMultipleValue();
        var124.resetMultipleValues();
        return f3647(var136, var135, var134, var133, var132, var131);
    }
    
    public static SubLObject f3653(final SubLObject var130, final SubLObject var131) {
        if (!var130.isNegative() || !var131.isNegative()) {
            return Numbers.numL(var130, var131);
        }
        final SubLObject var132 = Numbers.integerDivide(var130, (SubLObject)$ic102$);
        final SubLObject var133 = Numbers.integerDivide(var131, (SubLObject)$ic102$);
        if (var132.numE(var133)) {
            final SubLObject var134 = Numbers.abs(Numbers.rem(var130, (SubLObject)$ic102$));
            final SubLObject var135 = Numbers.abs(Numbers.rem(var131, (SubLObject)$ic102$));
            return Numbers.numL(var134, var135);
        }
        return Numbers.numL(var132, var133);
    }
    
    public static SubLObject f3654(SubLObject var10, SubLObject var9, SubLObject var35) {
        while ((var9.isInteger() && (!var9.numLE((SubLObject)TWELVE_INTEGER) || !var9.numG((SubLObject)ZERO_INTEGER))) || (var35.isInteger() && (!var35.numLE(f3545(var9, var10)) || !var35.numG((SubLObject)ZERO_INTEGER)))) {
            if (var9.isInteger() && var10.isInteger() && !var9.numLE((SubLObject)TWELVE_INTEGER)) {
                var9 = Numbers.subtract(var9, (SubLObject)TWELVE_INTEGER);
                var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
            }
            else if (var9.isInteger() && var10.isInteger() && !var9.numG((SubLObject)ZERO_INTEGER)) {
                var9 = Numbers.add(var9, (SubLObject)TWELVE_INTEGER);
                var10 = Numbers.subtract(var10, (SubLObject)ONE_INTEGER);
            }
            else if (var35.isInteger() && var9.isInteger() && var10.isInteger() && !var35.numLE(f3545(var9, var10))) {
                var35 = Numbers.subtract(var35, f3545(var9, var10));
                var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
            }
            else if (var35.isInteger() && var9.isInteger() && var10.isInteger() && !var35.numG((SubLObject)ZERO_INTEGER)) {
                var9 = Numbers.subtract(var9, (SubLObject)ONE_INTEGER);
                if (var9.numE((SubLObject)ZERO_INTEGER)) {
                    var10 = Numbers.subtract(var10, (SubLObject)ONE_INTEGER);
                    var9 = Numbers.add(var9, (SubLObject)TWELVE_INTEGER);
                }
                var35 = Numbers.add(var35, f3545(var9, var10));
            }
            else {
                Errors.error((SubLObject)$ic103$, var9, var35, var10);
            }
        }
        return Values.values(var10, var9, var35);
    }
    
    public static SubLObject f3651(final SubLObject var10, final SubLObject var9, SubLObject var35, SubLObject var21, SubLObject var134, SubLObject var135) {
        final SubLThread var136 = SubLProcess.currentSubLThread();
        if (NIL != var135) {
            if (var135.numL((SubLObject)ZERO_INTEGER)) {
                var134 = Numbers.add(var134, Numbers.subtract(Numbers.integerDivide(var135, $g81$.getGlobalValue()), (SubLObject)ONE_INTEGER));
            }
            else {
                var134 = Numbers.add(var134, Numbers.integerDivide(var135, $g81$.getGlobalValue()));
            }
            var135 = Numbers.mod(var135, $g81$.getGlobalValue());
        }
        if (NIL != var134) {
            if (var134.numL((SubLObject)ZERO_INTEGER)) {
                var21 = Numbers.add(var21, Numbers.subtract(Numbers.integerDivide(var134, $g997$.getGlobalValue()), (SubLObject)ONE_INTEGER));
            }
            else {
                var21 = Numbers.add(var21, Numbers.integerDivide(var134, $g997$.getGlobalValue()));
            }
            var134 = Numbers.mod(var134, $g997$.getGlobalValue());
        }
        if (NIL != var21) {
            if (var21.numL((SubLObject)ZERO_INTEGER)) {
                var35 = Numbers.add(var35, Numbers.subtract(Numbers.integerDivide(var21, $g998$.getGlobalValue()), (SubLObject)ONE_INTEGER));
            }
            else {
                var35 = Numbers.add(var35, Numbers.integerDivide(var21, $g998$.getGlobalValue()));
            }
            var21 = Numbers.mod(var21, $g998$.getGlobalValue());
        }
        var136.resetMultipleValues();
        final SubLObject var137 = f3654(var10, var9, var35);
        final SubLObject var138 = var136.secondMultipleValue();
        final SubLObject var139 = var136.thirdMultipleValue();
        var136.resetMultipleValues();
        return Values.values(var137, var138, var139, var21, var134, var135);
    }
    
    public static SubLObject f3655(final SubLObject var10) {
        assert NIL != Types.integerp(var10) : var10;
        return (SubLObject)makeBoolean(NIL != module0048.f3312(var10, (SubLObject)FOUR_INTEGER) && (NIL == module0048.f3312(var10, (SubLObject)$ic7$) || NIL != module0048.f3312(var10, (SubLObject)$ic104$)));
    }
    
    public static SubLObject f3656(final SubLObject var9) {
        return ConsesLow.nth(Numbers.subtract(var9, (SubLObject)ONE_INTEGER), $g1005$.getGlobalValue());
    }
    
    public static SubLObject f3545(final SubLObject var9, final SubLObject var10) {
        if (var10.isInteger() && var9.numE((SubLObject)TWO_INTEGER) && NIL != f3655(var10)) {
            return Numbers.add((SubLObject)ONE_INTEGER, f3656(var9));
        }
        return f3656(var9);
    }
    
    public static SubLObject f3657(final SubLObject var9, final SubLObject var10) {
        SubLObject var11 = (SubLObject)ZERO_INTEGER;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        var13 = $g1005$.getGlobalValue();
        var14 = var13.first();
        for (var15 = (SubLObject)ZERO_INTEGER; NIL == var12 && NIL != var13; var13 = var13.rest(), var14 = var13.first(), var15 = Numbers.add((SubLObject)ONE_INTEGER, var15)) {
            if (module0048.f_1X(var15).numE(var9)) {
                var12 = (SubLObject)T;
            }
            else {
                var11 = Numbers.add(var11, var14);
            }
        }
        if (var9.numG((SubLObject)TWO_INTEGER) && NIL != f3655(var10)) {
            var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
        }
        return var11;
    }
    
    public static SubLObject f3658(final SubLObject var143) {
        return module0035.f2294($g1006$.getGlobalValue(), var143, Symbols.symbol_function((SubLObject)EQ), (SubLObject)NIL);
    }
    
    public static SubLObject f3659(final SubLObject var143) {
        return module0035.f2294($g1007$.getGlobalValue(), var143, Symbols.symbol_function((SubLObject)EQ), (SubLObject)NIL);
    }
    
    public static SubLObject f3660(final SubLObject var144) {
        return f3659(var144);
    }
    
    public static SubLObject f3661(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        var24.resetMultipleValues();
        final SubLObject var25 = f3613(var23);
        SubLObject var26 = var24.secondMultipleValue();
        final SubLObject var27 = var24.thirdMultipleValue();
        var24.resetMultipleValues();
        var26 = f3660(var26);
        return Sequences.cconcatenate(module0006.f203(var26), new SubLObject[] { $ic110$, module0006.f203(var25), $ic111$, module0006.f203(var27) });
    }
    
    public static SubLObject f3662() {
        return f3661(f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f3663(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = Time.get_universal_time();
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        var18.resetMultipleValues();
        final SubLObject var19 = Time.decode_universal_time(var17, (SubLObject)UNPROVIDED);
        final SubLObject var20 = var18.secondMultipleValue();
        final SubLObject var21 = var18.thirdMultipleValue();
        final SubLObject var22 = var18.fourthMultipleValue();
        final SubLObject var23 = var18.fifthMultipleValue();
        final SubLObject var24 = var18.sixthMultipleValue();
        var18.resetMultipleValues();
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic112$, new SubLObject[] { var23, var22, Numbers.mod(var24, (SubLObject)$ic7$), var21, var20, var19 });
    }
    
    public static SubLObject f3664(final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        var76.resetMultipleValues();
        SubLObject var77 = f3598(var75);
        final SubLObject var78 = var76.secondMultipleValue();
        final SubLObject var79 = var76.thirdMultipleValue();
        final SubLObject var80 = var76.fourthMultipleValue();
        var76.resetMultipleValues();
        var77 = Numbers.truncate(var77, (SubLObject)UNPROVIDED);
        return var80.numG((SubLObject)ZERO_INTEGER) ? PrintLow.format((SubLObject)NIL, (SubLObject)$ic113$, new SubLObject[] { var80, var79, var78, var77 }) : (var79.numG((SubLObject)ZERO_INTEGER) ? PrintLow.format((SubLObject)NIL, (SubLObject)$ic114$, new SubLObject[] { var79, var78, var77 }) : PrintLow.format((SubLObject)NIL, (SubLObject)$ic115$, var78, var77));
    }
    
    public static SubLObject f3665(final SubLObject var9, final SubLObject var10) {
        return Numbers.multiply($g995$.getGlobalValue(), f3545(module0612.f37417(var9), var10));
    }
    
    public static SubLObject f3666(final SubLObject var147, final SubLObject var10) {
        final SubLObject var148 = module0612.f37417(var147);
        return Numbers.add(Numbers.multiply($g995$.getGlobalValue(), f3545(var148, var10)), Numbers.multiply($g995$.getGlobalValue(), f3545(Numbers.add((SubLObject)ONE_INTEGER, var148), var10)), Numbers.multiply($g995$.getGlobalValue(), f3545(Numbers.add((SubLObject)TWO_INTEGER, var148), var10)));
    }
    
    public static SubLObject f3667(final SubLObject var10) {
        if (NIL != f3655(var10)) {
            return $g992$.getGlobalValue();
        }
        return $g993$.getGlobalValue();
    }
    
    public static SubLObject f3668(final SubLObject var10) {
        if (ONE_INTEGER.numE(Numbers.integerDivide(var10, (SubLObject)$ic25$))) {
            return $g1009$.getGlobalValue();
        }
        return $g1010$.getGlobalValue();
    }
    
    public static SubLObject f3669() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0051", "f3540", "S#4943");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3541", "S#4944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3542", "S#4945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3543", "S#4946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3544", "S#4947", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3546", "S#4948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3547", "S#4949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3548", "S#4950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3549", "S#4951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3550", "S#4952", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "time_from_now", "TIME-FROM-NOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3551", "S#4953", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3552", "S#366", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3554", "S#4954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3553", "S#4955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3556", "S#4956", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3559", "S#4957", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3560", "S#4958", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3555", "S#4959", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3563", "S#1769", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3564", "S#4960", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3565", "S#4961", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3566", "S#4962", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3567", "S#4963", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3568", "S#4964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3569", "S#4965", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3571", "S#4966", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3572", "S#4967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3570", "S#4968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3573", "S#4969", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3574", "S#4970", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3575", "S#4971", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3562", "S#4972", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3581", "S#4973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3582", "S#4974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3583", "S#4975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3584", "S#4976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3585", "S#4977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3586", "S#4978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3587", "S#4979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3588", "S#4980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3589", "S#4981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3590", "S#4982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3577", "S#4983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3578", "S#4984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3576", "S#4985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3591", "S#4986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3592", "S#4987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3593", "S#4988", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3579", "S#4989", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3594", "S#4990", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3580", "S#4991", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3595", "S#4992", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3596", "S#4993", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3597", "S#4994", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3598", "S#4995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3599", "S#4996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3600", "S#4997", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3601", "S#4998", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3602", "S#367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3603", "S#4999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3557", "S#5000", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3605", "S#5001", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3606", "S#5002", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3608", "S#5003", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3610", "S#5004", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3609", "S#5005", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3607", "S#5006", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3611", "S#5007", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3613", "S#5008", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3614", "S#5009", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3615", "S#5010", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3616", "S#5011", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3604", "S#5012", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3617", "S#5013", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3619", "S#5014", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3623", "S#5015", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3620", "S#5016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3621", "S#5017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3622", "S#5018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3618", "S#5019", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3624", "S#5020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3625", "S#5021", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3626", "S#5022", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3629", "S#5023", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3628", "S#5024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3630", "S#5025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3612", "S#5026", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3627", "S#5027", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3631", "S#5028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3558", "S#5029", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3633", "S#5030", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3632", "S#5031", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3634", "S#5032", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3635", "S#5033", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3636", "S#5034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3640", "S#5035", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3639", "S#5036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3638", "S#5037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3637", "S#5038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3641", "S#5039", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3642", "S#5040", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3643", "S#5041", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3644", "S#5042", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3561", "S#5043", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3645", "S#5044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3646", "S#5045", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3647", "S#5046", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3648", "S#5047", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3649", "S#5048", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3650", "S#5049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3652", "S#5050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3653", "S#5051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3654", "S#5052", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3651", "S#5053", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3655", "S#5054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3656", "S#5055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3545", "S#5056", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3657", "S#5057", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3658", "S#4537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3659", "S#4538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3660", "S#5058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3661", "S#5059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3662", "S#5060", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3663", "S#365", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3664", "S#364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3665", "S#5061", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3666", "S#5062", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3667", "S#5063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0051", "f3668", "S#5064", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3670() {
        $g992$ = SubLFiles.defconstant("S#5065", (SubLObject)$ic0$);
        $g993$ = SubLFiles.defconstant("*SECONDS-IN-A-NON-LEAP-YEAR*", (SubLObject)$ic1$);
        $g994$ = SubLFiles.defconstant("S#5066", (SubLObject)$ic2$);
        $g995$ = SubLFiles.defconstant("S#5067", (SubLObject)$ic3$);
        $g996$ = SubLFiles.defconstant("S#5068", (SubLObject)$ic4$);
        $g81$ = SubLFiles.defconstant("S#5069", (SubLObject)$ic5$);
        $g997$ = SubLFiles.defconstant("S#5070", (SubLObject)$ic5$);
        $g998$ = SubLFiles.defconstant("S#5071", (SubLObject)$ic6$);
        $g999$ = SubLFiles.defconstant("S#5072", (SubLObject)THREE_INTEGER);
        $g1000$ = SubLFiles.defconstant("S#5073", (SubLObject)TWELVE_INTEGER);
        $g1001$ = SubLFiles.defconstant("S#5074", (SubLObject)TEN_INTEGER);
        $g1002$ = SubLFiles.defconstant("S#5075", (SubLObject)$ic7$);
        $g1003$ = SubLFiles.defconstant("S#5076", (SubLObject)$ic89$);
        $g1004$ = SubLFiles.deflexical("S#5077", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic90$)) ? $g1004$.getGlobalValue() : NIL));
        $g1005$ = SubLFiles.deflexical("S#5078", (SubLObject)$ic105$);
        $g1006$ = SubLFiles.deflexical("S#5079", (SubLObject)$ic106$);
        $g1007$ = SubLFiles.deflexical("S#5080", (SubLObject)$ic107$);
        $g1008$ = SubLFiles.defconstant("S#5081", (SubLObject)$ic116$);
        $g1009$ = SubLFiles.defconstant("S#5082", (SubLObject)$ic117$);
        $g1010$ = SubLFiles.defconstant("S#5083", (SubLObject)$ic118$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3671() {
        module0002.f35((SubLObject)$ic18$, (SubLObject)$ic19$);
        module0002.f35((SubLObject)$ic78$, (SubLObject)$ic79$);
        module0003.f57((SubLObject)$ic90$);
        module0002.f35((SubLObject)$ic108$, (SubLObject)$ic109$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f3669();
    }
    
    public void initializeVariables() {
        f3670();
    }
    
    public void runTopLevelForms() {
        f3671();
    }
    
    static {
        me = (SubLFile)new module0051();
        $g992$ = null;
        $g993$ = null;
        $g994$ = null;
        $g995$ = null;
        $g996$ = null;
        $g81$ = null;
        $g997$ = null;
        $g998$ = null;
        $g999$ = null;
        $g1000$ = null;
        $g1001$ = null;
        $g1002$ = null;
        $g1003$ = null;
        $g1004$ = null;
        $g1005$ = null;
        $g1006$ = null;
        $g1007$ = null;
        $g1008$ = null;
        $g1009$ = null;
        $g1010$ = null;
        $ic0$ = makeInteger(31622400);
        $ic1$ = makeInteger(31536000);
        $ic2$ = makeInteger(604800);
        $ic3$ = makeInteger(86400);
        $ic4$ = makeInteger(3600);
        $ic5$ = makeInteger(60);
        $ic6$ = makeInteger(24);
        $ic7$ = makeInteger(100);
        $ic8$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("TIME")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic9$ = makeSymbol("PROGN");
        $ic10$ = makeSymbol("CTIME");
        $ic11$ = makeSymbol("CSETQ");
        $ic12$ = makeSymbol("TRUNCATE");
        $ic13$ = makeSymbol("*");
        $ic14$ = ConsesLow.list((SubLObject)makeInteger(1000));
        $ic15$ = makeInteger(31);
        $ic16$ = makeInteger(23);
        $ic17$ = makeInteger(59);
        $ic18$ = makeSymbol("TIME-FROM-NOW");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#4952", "CYC"));
        $ic20$ = makeSymbol("S#4951", "CYC");
        $ic21$ = makeString("");
        $ic22$ = makeString("~a-~6,'0D");
        $ic23$ = makeInteger(1000000);
        $ic24$ = makeString("~a-~6,'0D.~3,'0D");
        $ic25$ = makeInteger(1000);
        $ic26$ = makeString("mm/dd/yyyy hh:mm:ss");
        $ic27$ = makeString("~D~2,'0D~2,'0D~2,'0D~2,'0D~2,'0D");
        $ic28$ = makeSymbol("S#65", "CYC");
        $ic29$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic30$ = makeString("~D second~:P");
        $ic31$ = makeString("~,");
        $ic32$ = makeString("F seconds");
        $ic33$ = makeString("~D hours, ~D minute~:P");
        $ic34$ = makeString("~D minute~:P, ");
        $ic35$ = makeSymbol("S#4985", "CYC");
        $ic36$ = makeSymbol("S#4149", "CYC");
        $ic37$ = makeString("~A ~A");
        $ic38$ = makeString("Template ~s is not a valid datetime-string template.");
        $ic39$ = ConsesLow.list(new SubLObject[] { Characters.CHAR_y, Characters.CHAR_Y, Characters.CHAR_m, Characters.CHAR_M, Characters.CHAR_d, Characters.CHAR_D, Characters.CHAR_slash, Characters.CHAR_hyphen, Characters.CHAR_underbar });
        $ic40$ = ConsesLow.list((SubLObject)Characters.CHAR_h, (SubLObject)Characters.CHAR_H, (SubLObject)Characters.CHAR_m, (SubLObject)Characters.CHAR_M, (SubLObject)Characters.CHAR_s, (SubLObject)Characters.CHAR_S, (SubLObject)Characters.CHAR_colon);
        $ic41$ = makeSymbol("S#4973", "CYC");
        $ic42$ = makeString("hh:mm:ss");
        $ic43$ = makeString("hh:mm:ss.mmm");
        $ic44$ = makeString("hh:mm");
        $ic45$ = makeString("hh:mm:ss.m");
        $ic46$ = makeString("hh:mm:ss.mm");
        $ic47$ = makeSymbol("S#4986", "CYC");
        $ic48$ = makeSymbol("S#4977", "CYC");
        $ic49$ = makeSymbol("S#4975", "CYC");
        $ic50$ = makeSymbol("S#4978", "CYC");
        $ic51$ = makeSymbol("S#4979", "CYC");
        $ic52$ = makeString("Template or template portion ~S didn't match any expected pattern");
        $ic53$ = makeString("~");
        $ic54$ = makeString(",'0D");
        $ic55$ = makeString("~2,'0D:~2,'0D:~2,'0D");
        $ic56$ = makeString("~2,'0D:~2,'0D");
        $ic57$ = makeString("~2,'0D:~2,'0D:~2,'0D.~3,'0D");
        $ic58$ = makeString("~2,'0D:~2,'0D:~2,'0D.~2,'0D");
        $ic59$ = makeString("~2,'0D:~2,'0D:~2,'0D.~1,'0D");
        $ic60$ = makeString("Template or template portion ~A wasn't a recognized time template.");
        $ic61$ = makeString("The template ~S doesn't match the datetime-string ~S");
        $ic62$ = makeString("Template or template portion ~A wasn't a recognized datetime template.");
        $ic63$ = makeString("The date string ~A and the template ~A are of length.");
        $ic64$ = makeKeyword("EOF");
        $ic65$ = makeString("Template or template portion ~A doesn't match datestring ~A");
        $ic66$ = ConsesLow.list((SubLObject)makeString("hh:mm:ss"), (SubLObject)makeString("hh:mm"), (SubLObject)makeString("hh:mm:ss.mmm"), (SubLObject)makeString("hh:mm:ss.mm"), (SubLObject)makeString("hh:mm:ss.m"));
        $ic67$ = makeString("The template ~A is not a recognized timestring template.");
        $ic68$ = makeString("The time string ~A and the template ~A are of unequal length.");
        $ic69$ = ConsesLow.list((SubLObject)makeSymbol("S#5084", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5085", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5086", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5087", "CYC"), (SubLObject)ZERO_INTEGER));
        $ic70$ = ConsesLow.list((SubLObject)makeSymbol("S#5084", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5085", "CYC"), (SubLObject)ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5086", "CYC"), (SubLObject)ZERO_INTEGER));
        $ic71$ = makeString(" ~A day~A");
        $ic72$ = makeString("s");
        $ic73$ = makeString(" ~A hour~A");
        $ic74$ = makeString(" ~A minute~A");
        $ic75$ = makeSymbol("DOUBLE-FLOAT");
        $ic76$ = makeString(" ~A second~A");
        $ic77$ = makeString(" 0 seconds");
        $ic78$ = makeSymbol("S#367", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)makeSymbol("S#4970", "CYC"));
        $ic80$ = makeSymbol("S#4999", "CYC");
        $ic81$ = makeSymbol("INTEGERP");
        $ic82$ = makeInteger(10000);
        $ic83$ = makeSymbol("PLUSP");
        $ic84$ = makeString("~2,'0d/~2,'0d/~4,'0d");
        $ic85$ = makeString("~2,'0d/~2,'0d/~d");
        $ic86$ = makeString("~2,'0d/~2,'0d/-~d");
        $ic87$ = makeKeyword("FLOAT");
        $ic88$ = makeKeyword("INTEGER");
        $ic89$ = (SubLList)ConsesLow.cons((SubLObject)makeInteger(20010801), (SubLObject)makeDouble(2452122.5));
        $ic90$ = makeSymbol("S#5077", "CYC");
        $ic91$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#5088", "CYC"), (SubLObject)makeSymbol("S#5089", "CYC"));
        $ic92$ = makeInteger(235959);
        $ic93$ = makeString("second ~S not in the range 0-59");
        $ic94$ = makeString("minute ~S not in the range 0-59");
        $ic95$ = makeString("hour ~S not in the range 0-59");
        $ic96$ = makeSymbol("S#5028", "CYC");
        $ic97$ = makeString("~2,'0d:~2,'0d:~2,'0d");
        $ic98$ = makeInteger(999);
        $ic99$ = makeString("second ~S not in the range 0-999");
        $ic100$ = makeString("~2,'0d:~2,'0d:~2,'0d.~3,'0d");
        $ic101$ = makeInteger(100000000);
        $ic102$ = makeInteger("10000000000");
        $ic103$ = makeString("MM/DD/YY adjust problem: ~s ~s ~s");
        $ic104$ = makeInteger(400);
        $ic105$ = ConsesLow.list(new SubLObject[] { makeInteger(31), makeInteger(28), makeInteger(31), makeInteger(30), makeInteger(31), makeInteger(30), makeInteger(31), makeInteger(31), makeInteger(30), makeInteger(31), makeInteger(30), makeInteger(31) });
        $ic106$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)ZERO_INTEGER, (SubLObject)makeString("Mon")), (SubLObject)ConsesLow.cons((SubLObject)ONE_INTEGER, (SubLObject)makeString("Tue")), (SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)makeString("Wed")), (SubLObject)ConsesLow.cons((SubLObject)THREE_INTEGER, (SubLObject)makeString("Thu")), (SubLObject)ConsesLow.cons((SubLObject)FOUR_INTEGER, (SubLObject)makeString("Fri")), (SubLObject)ConsesLow.cons((SubLObject)FIVE_INTEGER, (SubLObject)makeString("Sat")), (SubLObject)ConsesLow.cons((SubLObject)SIX_INTEGER, (SubLObject)makeString("Sun")));
        $ic107$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)ONE_INTEGER, (SubLObject)makeString("Jan")), ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)makeString("Feb")), ConsesLow.cons((SubLObject)THREE_INTEGER, (SubLObject)makeString("Mar")), ConsesLow.cons((SubLObject)FOUR_INTEGER, (SubLObject)makeString("Apr")), ConsesLow.cons((SubLObject)FIVE_INTEGER, (SubLObject)makeString("May")), ConsesLow.cons((SubLObject)SIX_INTEGER, (SubLObject)makeString("Jun")), ConsesLow.cons((SubLObject)SEVEN_INTEGER, (SubLObject)makeString("Jul")), ConsesLow.cons((SubLObject)EIGHT_INTEGER, (SubLObject)makeString("Aug")), ConsesLow.cons((SubLObject)NINE_INTEGER, (SubLObject)makeString("Sep")), ConsesLow.cons((SubLObject)TEN_INTEGER, (SubLObject)makeString("Oct")), ConsesLow.cons((SubLObject)ELEVEN_INTEGER, (SubLObject)makeString("Nov")), ConsesLow.cons((SubLObject)TWELVE_INTEGER, (SubLObject)makeString("Dec")) });
        $ic108$ = makeSymbol("S#5058", "CYC");
        $ic109$ = ConsesLow.list((SubLObject)makeSymbol("S#4538", "CYC"));
        $ic110$ = makeString(" ");
        $ic111$ = makeString(", ");
        $ic112$ = makeString("~2,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D");
        $ic113$ = makeString("~D day~:P ~D:~2,'0D:~2,'0D");
        $ic114$ = makeString("~D:~2,'0D:~2,'0D");
        $ic115$ = makeString("~D:~2,'0D");
        $ic116$ = makeInteger("3155760000");
        $ic117$ = makeInteger("31556908800");
        $ic118$ = makeInteger("31556995200");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 491 ms
	
	Decompiled with Procyon 0.5.32.
*/