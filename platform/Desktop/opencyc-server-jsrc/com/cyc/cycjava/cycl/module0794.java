package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0794 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0794";
    public static final String myFingerPrint = "4606d88bb56ce1d7dfda906cf0f6e6fc2655b39fdd176840ffd903312bbd3cb1";
    private static SubLSymbol $g6347$;
    private static SubLSymbol $g6348$;
    public static SubLSymbol $g6349$;
    private static SubLSymbol $g6350$;
    private static SubLSymbol $g6351$;
    private static SubLSymbol $g6352$;
    private static SubLSymbol $g6353$;
    private static SubLSymbol $g6354$;
    private static SubLSymbol $g6355$;
    private static SubLSymbol $g6356$;
    private static SubLSymbol $g6357$;
    private static SubLSymbol $g6358$;
    private static SubLSymbol $g6359$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLInteger $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLString $ic39$;
    private static final SubLList $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLString $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLString $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLString $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLInteger $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLList $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLString $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLList $ic77$;
    private static final SubLString $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLString $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLInteger $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    
    public static SubLObject f50799(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0794.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0794.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0794.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0794.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0794.NIL;
        SubLObject var10_11 = (SubLObject)module0794.NIL;
        while (module0794.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0794.$ic0$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0794.$ic0$);
            if (module0794.NIL == conses_high.member(var10_11, (SubLObject)module0794.$ic1$, (SubLObject)module0794.UNPROVIDED, (SubLObject)module0794.UNPROVIDED)) {
                var9 = (SubLObject)module0794.T;
            }
            if (var10_11 == module0794.$ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0794.NIL != var9 && module0794.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0794.$ic0$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0794.$ic3$, var4);
        final SubLObject var11 = (SubLObject)((module0794.NIL != var10) ? conses_high.cadr(var10) : module0794.NIL);
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0794.$ic5$, (SubLObject)ConsesLow.list(var6, var11), (SubLObject)ConsesLow.listS((SubLObject)module0794.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0794.$ic7$, var6), ConsesLow.append(var12, (SubLObject)module0794.NIL)));
    }
    
    public static SubLObject f50800(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0794.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0794.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0794.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)module0794.NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)module0794.NIL;
        SubLObject var21_22 = (SubLObject)module0794.NIL;
        while (module0794.NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0794.$ic0$);
            var21_22 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)module0794.$ic0$);
            if (module0794.NIL == conses_high.member(var21_22, (SubLObject)module0794.$ic1$, (SubLObject)module0794.UNPROVIDED, (SubLObject)module0794.UNPROVIDED)) {
                var9 = (SubLObject)module0794.T;
            }
            if (var21_22 == module0794.$ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (module0794.NIL != var9 && module0794.NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0794.$ic0$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)module0794.$ic3$, var4);
        final SubLObject var11 = (SubLObject)((module0794.NIL != var10) ? conses_high.cadr(var10) : module0794.NIL);
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0794.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0794.$ic9$, (SubLObject)ConsesLow.listS((SubLObject)module0794.$ic4$, (SubLObject)ConsesLow.list(var6, var11), ConsesLow.append(var12, (SubLObject)module0794.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0794.$ic10$, var11), (SubLObject)ConsesLow.list((SubLObject)module0794.$ic5$, (SubLObject)ConsesLow.list(var6, var11), (SubLObject)ConsesLow.listS((SubLObject)module0794.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0794.$ic7$, var6), ConsesLow.append(var12, (SubLObject)module0794.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0794.T, (SubLObject)ConsesLow.list((SubLObject)module0794.$ic5$, (SubLObject)ConsesLow.list(var6), (SubLObject)ConsesLow.listS((SubLObject)module0794.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0794.$ic7$, var6), ConsesLow.append(var12, (SubLObject)module0794.NIL)))));
    }
    
    public static SubLObject f50801(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0794.$ic12$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0794.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0794.$ic12$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0794.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0794.$ic13$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0794.$ic14$, (SubLObject)ConsesLow.listS((SubLObject)module0794.$ic15$, var6, (SubLObject)module0794.$ic16$))), ConsesLow.append(var7, (SubLObject)module0794.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0794.$ic12$);
        return (SubLObject)module0794.NIL;
    }
    
    public static SubLObject f50802(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0794.$ic17$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0794.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0794.$ic17$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0794.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0794.$ic13$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0794.$ic14$, (SubLObject)ConsesLow.listS((SubLObject)module0794.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0794.$ic19$, var6), (SubLObject)ConsesLow.listS((SubLObject)module0794.$ic15$, var6, (SubLObject)module0794.$ic16$), (SubLObject)module0794.$ic16$))), ConsesLow.append(var7, (SubLObject)module0794.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0794.$ic17$);
        return (SubLObject)module0794.NIL;
    }
    
    public static SubLObject f50803(final SubLObject var31, SubLObject var32) {
        if (var32 == module0794.UNPROVIDED) {
            var32 = (SubLObject)module0794.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0794.NIL != module0128.f8449(var31) && module0794.NIL != f50804(var31, var32));
    }
    
    public static SubLObject f50805(final SubLObject var31) {
        return f50804(var31, (SubLObject)module0794.UNPROVIDED);
    }
    
    public static SubLObject f50806(final SubLObject var33, final SubLObject var34, SubLObject var32) {
        if (var32 == module0794.UNPROVIDED) {
            var32 = (SubLObject)module0794.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0794.NIL == f50804(var33, var32));
    }
    
    public static SubLObject f50804(final SubLObject var31, SubLObject var32) {
        if (var32 == module0794.UNPROVIDED) {
            var32 = (SubLObject)module0794.NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0794.NIL;
        SubLObject var35 = (SubLObject)module0794.NIL;
        if (module0794.NIL != module0035.f2171(var31, module0794.$g6349$.getDynamicValue(var33))) {
            if (module0794.NIL != var32) {
                var35 = Sequences.cconcatenate(module0006.f205(var31), (SubLObject)module0794.$ic21$);
            }
            var34 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL == module0173.f10955(var31)) {
            if (module0794.NIL != var32) {
                var35 = Sequences.cconcatenate(module0006.f205(var31), (SubLObject)module0794.$ic22$);
            }
        }
        else {
            var33.resetMultipleValues();
            final SubLObject var38_39 = f50807(var31, var32, (SubLObject)module0794.NIL, (SubLObject)module0794.UNPROVIDED);
            final SubLObject var40_41 = var33.secondMultipleValue();
            var33.resetMultipleValues();
            var34 = var38_39;
            var35 = var40_41;
        }
        if (module0794.NIL != var32 && var35.isString()) {
            Errors.warn(var35);
        }
        return var34;
    }
    
    public static SubLObject f50808(final SubLObject var6, final SubLObject var32, SubLObject var42, SubLObject var43) {
        if (var42 == module0794.UNPROVIDED) {
            var42 = (SubLObject)module0794.NIL;
        }
        if (var43 == module0794.UNPROVIDED) {
            var43 = module0794.$g6347$.getDynamicValue();
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        assert module0794.NIL != module0173.f10955(var6) : var6;
        SubLObject var45 = (SubLObject)module0794.NIL;
        SubLObject var46 = (SubLObject)module0794.NIL;
        if (module0794.NIL != module0269.f17716(var6)) {
            if (module0794.NIL != var32) {
                var46 = Sequences.cconcatenate(module0006.f205(var6), (SubLObject)module0794.$ic24$);
            }
        }
        else if (module0794.NIL != module0269.f17726(var6)) {
            if (module0794.NIL != var32) {
                var46 = Sequences.cconcatenate(module0006.f205(var6), (SubLObject)module0794.$ic25$);
            }
        }
        else if (module0794.NIL != module0206.f13445(var6)) {
            if (module0794.NIL != var32) {
                var46 = Sequences.cconcatenate(module0006.f205(var6), (SubLObject)module0794.$ic26$);
            }
        }
        else if (module0794.NIL != module0269.f17731(var6)) {
            if (module0794.NIL != var32) {
                var46 = Sequences.cconcatenate(module0006.f205(var6), (SubLObject)module0794.$ic27$);
            }
        }
        else if (module0794.NIL != f50809(var6, (SubLObject)module0794.UNPROVIDED)) {
            var45 = (SubLObject)module0794.T;
            if (module0794.NIL != var32) {
                var46 = Sequences.cconcatenate((SubLObject)module0794.$ic28$, new SubLObject[] { module0006.f205(var6), module0794.$ic29$ });
            }
        }
        else if (module0549.f33906(var6).numG(var43)) {
            if (module0794.NIL != var32) {
                var46 = Sequences.cconcatenate(module0006.f205(var6), new SubLObject[] { module0794.$ic30$, module0006.f205(module0549.f33906(var6)), module0794.$ic31$, module0006.f205(module0794.$g6347$.getDynamicValue(var44)), module0794.$ic32$ });
            }
        }
        else if (module0794.NIL == f50810(var6)) {
            if (module0794.NIL != var32) {
                var46 = Sequences.cconcatenate(module0006.f205(var6), (SubLObject)module0794.$ic33$);
            }
        }
        else if (module0794.NIL == f50811(var6)) {
            if (module0794.NIL != var32) {
                var46 = Sequences.cconcatenate(module0006.f205(var6), (SubLObject)module0794.$ic34$);
                f50812(var6, (SubLObject)module0794.T);
            }
        }
        else {
            var45 = (SubLObject)module0794.T;
        }
        return Values.values(var45, var46);
    }
    
    public static SubLObject f50807(final SubLObject var6, final SubLObject var32, SubLObject var42, SubLObject var43) {
        if (var42 == module0794.UNPROVIDED) {
            var42 = (SubLObject)module0794.NIL;
        }
        if (var43 == module0794.UNPROVIDED) {
            var43 = module0794.$g6347$.getDynamicValue();
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = module0034.$g879$.getDynamicValue(var44);
        SubLObject var46 = (SubLObject)module0794.NIL;
        if (module0794.NIL == var45) {
            return f50808(var6, var32, var42, var43);
        }
        var46 = module0034.f1857(var45, (SubLObject)module0794.$ic23$, (SubLObject)module0794.UNPROVIDED);
        if (module0794.NIL == var46) {
            var46 = module0034.f1807(module0034.f1842(var45), (SubLObject)module0794.$ic23$, (SubLObject)module0794.FOUR_INTEGER, (SubLObject)module0794.NIL, (SubLObject)module0794.EQL, (SubLObject)module0794.UNPROVIDED);
            module0034.f1860(var45, (SubLObject)module0794.$ic23$, var46);
        }
        final SubLObject var47 = module0034.f1780(var6, var32, var42, var43);
        final SubLObject var48 = module0034.f1814(var46, var47, (SubLObject)module0794.UNPROVIDED);
        if (var48 != module0794.$ic35$) {
            SubLObject var49 = var48;
            SubLObject var50 = (SubLObject)module0794.NIL;
            var50 = var49.first();
            while (module0794.NIL != var49) {
                SubLObject var51 = var50.first();
                final SubLObject var52 = conses_high.second(var50);
                if (var6.eql(var51.first())) {
                    var51 = var51.rest();
                    if (var32.eql(var51.first())) {
                        var51 = var51.rest();
                        if (var42.eql(var51.first())) {
                            var51 = var51.rest();
                            if (module0794.NIL != var51 && module0794.NIL == var51.rest() && var43.eql(var51.first())) {
                                return module0034.f1959(var52);
                            }
                        }
                    }
                }
                var49 = var49.rest();
                var50 = var49.first();
            }
        }
        final SubLObject var53 = Values.arg2(var44.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50808(var6, var32, var42, var43)));
        module0034.f1836(var46, var47, var48, var53, (SubLObject)ConsesLow.list(var6, var32, var42, var43));
        return module0034.f1959(var53);
    }
    
    public static SubLObject f50810(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0794.NIL == module0128.f8463(module0794.$g6348$.getDynamicValue(var7), (SubLObject)module0794.UNPROVIDED) || module0794.NIL != module0259.f16976(var6, module0794.$g6348$.getDynamicValue(var7)));
    }
    
    public static SubLObject f50813(final SubLObject var53, SubLObject var32) {
        if (var32 == module0794.UNPROVIDED) {
            var32 = (SubLObject)module0794.NIL;
        }
        SubLObject var54 = (SubLObject)module0794.NIL;
        if (module0794.NIL != module0552.f34027(var53) && module0202.f12725(var53, (SubLObject)module0794.UNPROVIDED).numL((SubLObject)module0794.TWO_INTEGER)) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic36$, var53);
            }
            var54 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL != f50814(var53)) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic37$, var53);
            }
            var54 = (SubLObject)module0794.T;
        }
        SubLObject var55 = (SubLObject)module0794.NIL;
        SubLObject var56 = (SubLObject)module0794.NIL;
        SubLObject var57 = (SubLObject)module0794.NIL;
        var55 = module0205.f13180(var53, (SubLObject)module0794.UNPROVIDED);
        var56 = var55.first();
        for (var57 = (SubLObject)module0794.ZERO_INTEGER; module0794.NIL == var54 && module0794.NIL != var55; var55 = var55.rest(), var56 = var55.first(), var57 = Numbers.add((SubLObject)module0794.ONE_INTEGER, var57)) {
            if (var57.isZero() && module0794.NIL != module0259.f16891(var56, module0794.$ic38$)) {
                return (SubLObject)module0794.T;
            }
            if (module0794.NIL != f50815(var56, var57, var53, var32)) {
                var54 = f50816(var56, var32);
            }
            else {
                var54 = f50817(var56, var57, var53, var32);
            }
            if (module0794.NIL != var54 && module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic39$, var56);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0794.NIL == var54);
    }
    
    public static SubLObject f50815(final SubLObject var56, final SubLObject var57, final SubLObject var53, final SubLObject var32) {
        if (var57.isZero()) {
            return (SubLObject)module0794.T;
        }
        if (var57.eql((SubLObject)module0794.THREE_INTEGER) && module0794.NIL != module0259.f16902(module0205.f13132(var53), (SubLObject)module0794.$ic40$, module0794.$ic41$, (SubLObject)module0794.UNPROVIDED)) {
            return (SubLObject)module0794.T;
        }
        if (module0794.NIL != module0269.f17792(module0205.f13132(var53)) && module0794.NIL != module0173.f10955(var56) && module0794.NIL != module0269.f17716(var56) && module0794.ONE_INTEGER.eql(var57) && module0794.NIL != module0259.f16891(module0205.f13132(var53), module0794.$ic42$)) {
            return (SubLObject)module0794.T;
        }
        if (module0794.ONE_INTEGER.eql(var57) && module0794.$ic43$.eql(module0205.f13132(var53))) {
            return (SubLObject)module0794.T;
        }
        return (SubLObject)module0794.NIL;
    }
    
    public static SubLObject f50814(final SubLObject var53) {
        SubLObject var54 = (SubLObject)module0794.NIL;
        if (module0794.NIL != module0552.f34027(var53) && module0794.NIL != module0202.f12689(var53, (SubLObject)module0794.UNPROVIDED) && (module0794.NIL != module0178.f11323(var53) || module0794.NIL != module0202.f12925(var53)) && module0794.NIL == var54) {
            SubLObject var55 = f50818(module0205.f13132(var53), (SubLObject)module0794.UNPROVIDED);
            SubLObject var56 = (SubLObject)module0794.NIL;
            var56 = var55.first();
            while (module0794.NIL == var54 && module0794.NIL != var55) {
                if (module0794.NIL != module0205.f13220(var56, var53, (SubLObject)module0794.T, (SubLObject)module0794.UNPROVIDED, (SubLObject)module0794.UNPROVIDED)) {
                    var54 = (SubLObject)module0794.T;
                }
                var55 = var55.rest();
                var56 = var55.first();
            }
        }
        return var54;
    }
    
    public static SubLObject f50819(final SubLObject var61, SubLObject var34) {
        if (var34 == module0794.UNPROVIDED) {
            var34 = module0794.$ic45$;
        }
        return module0434.f30578((SubLObject)module0794.$ic46$, (SubLObject)ConsesLow.listS(module0794.$ic47$, (SubLObject)module0794.$ic46$, var61, (SubLObject)module0794.$ic48$), var34, (SubLObject)module0794.$ic49$);
    }
    
    public static SubLObject f50818(final SubLObject var61, SubLObject var34) {
        if (var34 == module0794.UNPROVIDED) {
            var34 = module0794.$ic45$;
        }
        final SubLThread var62 = SubLProcess.currentSubLThread();
        final SubLObject var63 = module0034.$g879$.getDynamicValue(var62);
        SubLObject var64 = (SubLObject)module0794.NIL;
        if (module0794.NIL == var63) {
            return f50819(var61, var34);
        }
        var64 = module0034.f1857(var63, (SubLObject)module0794.$ic44$, (SubLObject)module0794.UNPROVIDED);
        if (module0794.NIL == var64) {
            var64 = module0034.f1807(module0034.f1842(var63), (SubLObject)module0794.$ic44$, (SubLObject)module0794.TWO_INTEGER, (SubLObject)module0794.NIL, (SubLObject)module0794.EQUAL, (SubLObject)module0794.UNPROVIDED);
            module0034.f1860(var63, (SubLObject)module0794.$ic44$, var64);
        }
        final SubLObject var65 = module0034.f1782(var61, var34);
        final SubLObject var66 = module0034.f1814(var64, var65, (SubLObject)module0794.UNPROVIDED);
        if (var66 != module0794.$ic35$) {
            SubLObject var67 = var66;
            SubLObject var68 = (SubLObject)module0794.NIL;
            var68 = var67.first();
            while (module0794.NIL != var67) {
                SubLObject var69 = var68.first();
                final SubLObject var70 = conses_high.second(var68);
                if (var61.equal(var69.first())) {
                    var69 = var69.rest();
                    if (module0794.NIL != var69 && module0794.NIL == var69.rest() && var34.equal(var69.first())) {
                        return module0034.f1959(var70);
                    }
                }
                var67 = var67.rest();
                var68 = var67.first();
            }
        }
        final SubLObject var71 = Values.arg2(var62.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50819(var61, var34)));
        module0034.f1836(var64, var65, var66, var71, (SubLObject)ConsesLow.list(var61, var34));
        return module0034.f1959(var71);
    }
    
    public static SubLObject f50816(final SubLObject var62, SubLObject var32) {
        if (var32 == module0794.UNPROVIDED) {
            var32 = (SubLObject)module0794.NIL;
        }
        final SubLThread var63 = SubLProcess.currentSubLThread();
        if (module0794.NIL != module0035.f2171(var62, module0794.$g6349$.getDynamicValue(var63))) {
            return (SubLObject)module0794.NIL;
        }
        if (module0794.NIL == module0173.f10955(var62)) {
            return (SubLObject)module0794.T;
        }
        if (module0794.NIL != module0584.f35795(var62)) {
            return (SubLObject)module0794.T;
        }
        if (module0794.NIL != module0731.f44690(var62, (SubLObject)module0794.UNPROVIDED)) {
            return (SubLObject)module0794.T;
        }
        if (module0794.NIL != module0259.f16891(var62, module0794.$ic50$)) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic51$, var62);
            }
            return (SubLObject)module0794.T;
        }
        if (module0794.NIL == f50810(var62)) {
            return (SubLObject)module0794.T;
        }
        if (module0794.NIL != module0226.f14838(var62) && module0794.NIL != conses_high.member(module0794.$ic52$, module0226.f14919(var62, (SubLObject)module0794.UNPROVIDED), Symbols.symbol_function((SubLObject)module0794.$ic53$), (SubLObject)module0794.UNPROVIDED) && module0794.NIL == conses_high.member(var62, (SubLObject)module0794.$ic54$, Symbols.symbol_function((SubLObject)module0794.EQL), (SubLObject)module0794.UNPROVIDED)) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic55$, var62);
            }
            return (SubLObject)module0794.T;
        }
        return (SubLObject)module0794.NIL;
    }
    
    public static SubLObject f50820(final SubLObject var56, final SubLObject var57, final SubLObject var53, SubLObject var32) {
        if (var32 == module0794.UNPROVIDED) {
            var32 = (SubLObject)module0794.NIL;
        }
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0794.NIL;
        if (module0794.NIL != f50804(var56, (SubLObject)SubLObjectFactory.makeBoolean(module0794.NIL != var32 && module0794.NIL != module0173.f10955(var56)))) {
            var59 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL != module0269.f17716(var56) && module0794.NIL != module0259.f16902(var56, module0794.$g6350$.getDynamicValue(var58), module0794.$ic41$, (SubLObject)module0794.UNPROVIDED) && module0794.NIL == module0259.f16891(module0205.f13132(var53), module0794.$ic58$)) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic59$, var56, module0205.f13132(var53));
            }
            var59 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL != module0269.f17716(var56) && module0205.f13132(var53).eql(module0794.$ic60$) && module0549.f33906(var56).numL((SubLObject)module0794.$ic61$)) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic62$, var56);
            }
            var59 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL != module0173.f10955(var56)) {
            var59 = (SubLObject)module0794.NIL;
        }
        else if (var56.isString()) {
            var59 = (SubLObject)module0794.T;
        }
        else if (var56.isNumber()) {
            var59 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL != module0201.f12546(var56)) {
            var59 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL != module0202.f12590(var56)) {
            var59 = f50813(var56, var32);
        }
        if (module0794.NIL == var59 && module0794.NIL != var32) {
            Errors.warn((SubLObject)module0794.$ic63$, var56);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0794.NIL == var59);
    }
    
    public static SubLObject f50817(final SubLObject var56, final SubLObject var57, final SubLObject var53, SubLObject var32) {
        if (var32 == module0794.UNPROVIDED) {
            var32 = (SubLObject)module0794.NIL;
        }
        final SubLThread var58 = SubLProcess.currentSubLThread();
        final SubLObject var59 = module0034.$g879$.getDynamicValue(var58);
        SubLObject var60 = (SubLObject)module0794.NIL;
        if (module0794.NIL == var59) {
            return f50820(var56, var57, var53, var32);
        }
        var60 = module0034.f1857(var59, (SubLObject)module0794.$ic57$, (SubLObject)module0794.UNPROVIDED);
        if (module0794.NIL == var60) {
            var60 = module0034.f1807(module0034.f1842(var59), (SubLObject)module0794.$ic57$, (SubLObject)module0794.FOUR_INTEGER, (SubLObject)module0794.NIL, (SubLObject)module0794.EQUAL, (SubLObject)module0794.UNPROVIDED);
            module0034.f1860(var59, (SubLObject)module0794.$ic57$, var60);
        }
        final SubLObject var61 = module0034.f1780(var56, var57, var53, var32);
        final SubLObject var62 = module0034.f1814(var60, var61, (SubLObject)module0794.UNPROVIDED);
        if (var62 != module0794.$ic35$) {
            SubLObject var63 = var62;
            SubLObject var64 = (SubLObject)module0794.NIL;
            var64 = var63.first();
            while (module0794.NIL != var63) {
                SubLObject var65 = var64.first();
                final SubLObject var66 = conses_high.second(var64);
                if (var56.equal(var65.first())) {
                    var65 = var65.rest();
                    if (var57.equal(var65.first())) {
                        var65 = var65.rest();
                        if (var53.equal(var65.first())) {
                            var65 = var65.rest();
                            if (module0794.NIL != var65 && module0794.NIL == var65.rest() && var32.equal(var65.first())) {
                                return module0034.f1959(var66);
                            }
                        }
                    }
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
        }
        final SubLObject var67 = Values.arg2(var58.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50820(var56, var57, var53, var32)));
        module0034.f1836(var60, var61, var62, var67, (SubLObject)ConsesLow.list(var56, var57, var53, var32));
        return module0034.f1959(var67);
    }
    
    public static SubLObject f50821() {
        final SubLObject var64 = module0794.$g6351$.getGlobalValue();
        if (module0794.NIL != var64) {
            module0034.f1818(var64);
        }
        return (SubLObject)module0794.NIL;
    }
    
    public static SubLObject f50822(final SubLObject var6) {
        return module0034.f1829(module0794.$g6351$.getGlobalValue(), (SubLObject)ConsesLow.list(var6), (SubLObject)module0794.UNPROVIDED, (SubLObject)module0794.UNPROVIDED);
    }
    
    public static SubLObject f50823(final SubLObject var6) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0794.NIL == f50812(var6, (SubLObject)module0794.NIL));
    }
    
    public static SubLObject f50811(final SubLObject var6) {
        SubLObject var7 = module0794.$g6351$.getGlobalValue();
        if (module0794.NIL == var7) {
            var7 = module0034.f1934((SubLObject)module0794.$ic64$, (SubLObject)module0794.$ic65$, (SubLObject)module0794.$ic61$, (SubLObject)module0794.EQL, (SubLObject)module0794.ONE_INTEGER, (SubLObject)module0794.ZERO_INTEGER);
        }
        SubLObject var8 = module0034.f1814(var7, var6, (SubLObject)module0794.$ic35$);
        if (var8 == module0794.$ic35$) {
            var8 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50823(var6)));
            module0034.f1816(var7, var6, var8, (SubLObject)module0794.UNPROVIDED);
        }
        return module0034.f1959(var8);
    }
    
    public static SubLObject f50812(final SubLObject var6, SubLObject var32) {
        if (var32 == module0794.UNPROVIDED) {
            var32 = (SubLObject)module0794.NIL;
        }
        SubLObject var33 = (SubLObject)module0794.NIL;
        if (module0794.NIL != module0220.f14547(var6, module0794.$ic70$, (SubLObject)module0794.UNPROVIDED, (SubLObject)module0794.UNPROVIDED)) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic71$, var6);
            }
        }
        else if (module0794.NIL != module0259.f16902(var6, module0794.$g6352$.getGlobalValue(), module0794.$ic45$, module0794.$ic72$)) {
            if (module0794.NIL != var32) {
                SubLObject var34 = module0794.$g6352$.getGlobalValue();
                SubLObject var35 = (SubLObject)module0794.NIL;
                var35 = var34.first();
                while (module0794.NIL != var34) {
                    if (module0794.NIL != module0259.f16854(var6, var35, module0794.$ic45$, module0794.$ic72$)) {
                        Errors.warn((SubLObject)module0794.$ic73$, var6, var35);
                    }
                    var34 = var34.rest();
                    var35 = var34.first();
                }
            }
            var33 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL != module0167.f10813(var6) && module0794.NIL != module0259.f16902(var6, module0794.$g6353$.getGlobalValue(), module0794.$ic45$, module0794.$ic72$)) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic74$, var6, module0794.$g6353$.getGlobalValue());
            }
            var33 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL != module0731.f44764(var6, (SubLObject)module0794.UNPROVIDED)) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic75$, var6);
            }
            var33 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL != module0259.f16977(var6, module0794.$g6354$.getGlobalValue(), module0794.$ic45$, module0794.$ic72$) && module0794.NIL == module0004.f104(var6, module0794.$g6355$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0794.EQL), (SubLObject)module0794.UNPROVIDED)) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic76$, var6, module0794.$g6354$.getGlobalValue());
            }
            var33 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL != conses_high.member(module0617.f37871(var6, (SubLObject)module0794.UNPROVIDED), (SubLObject)module0794.$ic77$, (SubLObject)module0794.UNPROVIDED, (SubLObject)module0794.UNPROVIDED)) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic78$, module0617.f37871(var6, (SubLObject)module0794.UNPROVIDED));
            }
            var33 = (SubLObject)module0794.T;
        }
        else if (module0794.NIL != module0269.f17710(var6) && (module0794.NIL != module0259.f16854(var6, module0794.$ic79$, (SubLObject)module0794.UNPROVIDED, (SubLObject)module0794.UNPROVIDED) || module0794.NIL != module0256.f16606(var6, module0794.$g6356$.getGlobalValue(), module0794.$ic45$, module0794.$ic72$))) {
            if (module0794.NIL != var32) {
                Errors.warn((SubLObject)module0794.$ic80$, module0794.$g6356$.getGlobalValue());
            }
            var33 = (SubLObject)module0794.T;
        }
        return var33;
    }
    
    public static SubLObject f50824() {
        return module0794.$g6357$.getGlobalValue();
    }
    
    public static SubLObject f50825(SubLObject var69) {
        if (var69 == module0794.UNPROVIDED) {
            var69 = (SubLObject)module0794.NIL;
        }
        return f50826(var69);
    }
    
    public static SubLObject f50826(final SubLObject var69) {
        SubLObject var70 = (SubLObject)module0794.NIL;
        SubLObject var71 = (SubLObject)module0794.NIL;
        for (SubLObject var72 = (SubLObject)module0794.NIL; (module0794.NIL == var70 || module0794.NIL == var71) && module0794.NIL == var72; var71 = f50827(var70, var69)) {
            var70 = module0166.f10773((SubLObject)module0794.UNPROVIDED);
            if (module0794.NIL != f50803(var70, (SubLObject)module0794.UNPROVIDED)) {}
        }
        return Values.values(var70, var71);
    }
    
    public static SubLObject f50827(final SubLObject var6, SubLObject var69) {
        if (var69 == module0794.UNPROVIDED) {
            var69 = (SubLObject)module0794.NIL;
        }
        final SubLObject var70 = (SubLObject)module0794.NIL;
        final SubLObject var71 = (SubLObject)module0794.NIL;
        return var70;
    }
    
    public static SubLObject f50828(final SubLObject var75, SubLObject var34) {
        if (var34 == module0794.UNPROVIDED) {
            var34 = module0794.$ic45$;
        }
        return f50829(var75, var34);
    }
    
    public static SubLObject f50830() {
        final SubLObject var64 = module0794.$g6358$.getGlobalValue();
        if (module0794.NIL != var64) {
            module0034.f1818(var64);
        }
        return (SubLObject)module0794.NIL;
    }
    
    public static SubLObject f50831(final SubLObject var75, SubLObject var34) {
        if (var34 == module0794.UNPROVIDED) {
            var34 = module0794.$ic45$;
        }
        return module0034.f1829(module0794.$g6358$.getGlobalValue(), (SubLObject)ConsesLow.list(var75, var34), (SubLObject)module0794.UNPROVIDED, (SubLObject)module0794.UNPROVIDED);
    }
    
    public static SubLObject f50832(final SubLObject var75, final SubLObject var34) {
        return module0434.f30582((SubLObject)ConsesLow.list(module0794.$ic83$, var75), var34, (SubLObject)module0794.UNPROVIDED);
    }
    
    public static SubLObject f50829(final SubLObject var75, SubLObject var34) {
        if (var34 == module0794.UNPROVIDED) {
            var34 = module0794.$ic45$;
        }
        SubLObject var76 = module0794.$g6358$.getGlobalValue();
        if (module0794.NIL == var76) {
            var76 = module0034.f1934((SubLObject)module0794.$ic82$, (SubLObject)module0794.$ic84$, (SubLObject)module0794.$ic85$, (SubLObject)module0794.EQUAL, (SubLObject)module0794.TWO_INTEGER, (SubLObject)module0794.ZERO_INTEGER);
        }
        final SubLObject var77 = module0034.f1782(var75, var34);
        final SubLObject var78 = module0034.f1814(var76, var77, (SubLObject)module0794.UNPROVIDED);
        if (var78 != module0794.$ic35$) {
            SubLObject var79 = var78;
            SubLObject var80 = (SubLObject)module0794.NIL;
            var80 = var79.first();
            while (module0794.NIL != var79) {
                SubLObject var81 = var80.first();
                final SubLObject var82 = conses_high.second(var80);
                if (var75.equal(var81.first())) {
                    var81 = var81.rest();
                    if (module0794.NIL != var81 && module0794.NIL == var81.rest() && var34.equal(var81.first())) {
                        return module0034.f1959(var82);
                    }
                }
                var79 = var79.rest();
                var80 = var79.first();
            }
        }
        final SubLObject var83 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50832(var75, var34)));
        module0034.f1836(var76, var77, var78, var83, (SubLObject)ConsesLow.list(var75, var34));
        return module0034.f1959(var83);
    }
    
    public static SubLObject f50833() {
        final SubLObject var64 = module0794.$g6359$.getGlobalValue();
        if (module0794.NIL != var64) {
            module0034.f1818(var64);
        }
        return (SubLObject)module0794.NIL;
    }
    
    public static SubLObject f50834(final SubLObject var31, SubLObject var34) {
        if (var34 == module0794.UNPROVIDED) {
            var34 = module0794.$ic45$;
        }
        return module0034.f1829(module0794.$g6359$.getGlobalValue(), (SubLObject)ConsesLow.list(var31, var34), (SubLObject)module0794.UNPROVIDED, (SubLObject)module0794.UNPROVIDED);
    }
    
    public static SubLObject f50835(final SubLObject var31, final SubLObject var34) {
        return module0259.f16854(var31, module0794.$ic87$, var34, (SubLObject)module0794.UNPROVIDED);
    }
    
    public static SubLObject f50809(final SubLObject var31, SubLObject var34) {
        if (var34 == module0794.UNPROVIDED) {
            var34 = module0794.$ic45$;
        }
        SubLObject var35 = module0794.$g6359$.getGlobalValue();
        if (module0794.NIL == var35) {
            var35 = module0034.f1934((SubLObject)module0794.$ic86$, (SubLObject)module0794.$ic88$, (SubLObject)module0794.$ic85$, (SubLObject)module0794.EQUAL, (SubLObject)module0794.TWO_INTEGER, (SubLObject)module0794.ZERO_INTEGER);
            module0034.f1953((SubLObject)module0794.$ic89$);
        }
        final SubLObject var36 = module0034.f1782(var31, var34);
        final SubLObject var37 = module0034.f1814(var35, var36, (SubLObject)module0794.UNPROVIDED);
        if (var37 != module0794.$ic35$) {
            SubLObject var38 = var37;
            SubLObject var39 = (SubLObject)module0794.NIL;
            var39 = var38.first();
            while (module0794.NIL != var38) {
                SubLObject var40 = var39.first();
                final SubLObject var41 = conses_high.second(var39);
                if (var31.equal(var40.first())) {
                    var40 = var40.rest();
                    if (module0794.NIL != var40 && module0794.NIL == var40.rest() && var34.equal(var40.first())) {
                        return module0034.f1959(var41);
                    }
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
        }
        final SubLObject var42 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50835(var31, var34)));
        module0034.f1836(var35, var36, var37, var42, (SubLObject)ConsesLow.list(var31, var34));
        return module0034.f1959(var42);
    }
    
    public static SubLObject f50836() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0794", "f50799", "S#55395");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0794", "f50800", "S#55396");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0794", "f50801", "S#55397");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0794", "f50802", "S#55398");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50803", "S#55399", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50805", "EASILY-UNDERSTOOD-BY-HUMANS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50806", "S#55400", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50804", "S#54197", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50808", "S#55401", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50807", "S#55402", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50810", "S#55403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50813", "S#53729", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50815", "S#55404", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50814", "S#55405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50819", "S#55406", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50818", "S#55407", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50816", "S#55408", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50820", "S#55409", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50817", "S#55410", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50821", "S#55411", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50822", "S#55412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50823", "S#55413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50811", "S#55414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50812", "S#55415", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50824", "S#55416", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50825", "S#55417", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50826", "S#55418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50827", "S#55419", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50828", "S#55420", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50830", "S#55421", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50831", "S#55422", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50832", "S#55423", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50829", "S#55424", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50833", "S#55425", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50834", "S#55426", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50835", "S#55427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0794", "f50809", "S#55428", 1, 1, false);
        return (SubLObject)module0794.NIL;
    }
    
    public static SubLObject f50837() {
        module0794.$g6347$ = SubLFiles.defparameter("S#55429", (SubLObject)module0794.$ic11$);
        module0794.$g6348$ = SubLFiles.defparameter("S#55430", (SubLObject)module0794.NIL);
        module0794.$g6349$ = SubLFiles.defparameter("S#55431", (SubLObject)module0794.NIL);
        module0794.$g6350$ = SubLFiles.defparameter("S#55432", (SubLObject)module0794.$ic56$);
        module0794.$g6351$ = SubLFiles.deflexical("S#55433", (SubLObject)module0794.NIL);
        module0794.$g6352$ = SubLFiles.deflexical("S#55434", (SubLObject)module0794.$ic66$);
        module0794.$g6353$ = SubLFiles.deflexical("S#55435", (SubLObject)module0794.NIL);
        module0794.$g6354$ = SubLFiles.deflexical("S#55436", (SubLObject)module0794.$ic67$);
        module0794.$g6355$ = SubLFiles.deflexical("S#55437", (SubLObject)module0794.$ic68$);
        module0794.$g6356$ = SubLFiles.deflexical("S#55438", (SubLObject)module0794.$ic69$);
        module0794.$g6357$ = SubLFiles.deflexical("S#55439", module0794.$ic81$);
        module0794.$g6358$ = SubLFiles.deflexical("S#55440", (SubLObject)module0794.NIL);
        module0794.$g6359$ = SubLFiles.deflexical("S#55441", (SubLObject)module0794.NIL);
        return (SubLObject)module0794.NIL;
    }
    
    public static SubLObject f50838() {
        module0012.f416((SubLObject)module0794.$ic20$);
        module0034.f1895((SubLObject)module0794.$ic23$);
        module0034.f1895((SubLObject)module0794.$ic44$);
        module0034.f1895((SubLObject)module0794.$ic57$);
        module0034.f1909((SubLObject)module0794.$ic64$);
        module0034.f1909((SubLObject)module0794.$ic82$);
        module0034.f1909((SubLObject)module0794.$ic86$);
        return (SubLObject)module0794.NIL;
    }
    
    public void declareFunctions() {
        f50836();
    }
    
    public void initializeVariables() {
        f50837();
    }
    
    public void runTopLevelForms() {
        f50838();
    }
    
    static {
        me = (SubLFile)new module0794();
        module0794.$g6347$ = null;
        module0794.$g6348$ = null;
        module0794.$g6349$ = null;
        module0794.$g6350$ = null;
        module0794.$g6351$ = null;
        module0794.$g6352$ = null;
        module0794.$g6353$ = null;
        module0794.$g6354$ = null;
        module0794.$g6355$ = null;
        module0794.$g6356$ = null;
        module0794.$g6357$ = null;
        module0794.$g6358$ = null;
        module0794.$g6359$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"));
        $ic2$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = SubLObjectFactory.makeKeyword("MESSAGE");
        $ic4$ = SubLObjectFactory.makeSymbol("S#55442", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("DO-FORTS");
        $ic6$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic7$ = SubLObjectFactory.makeSymbol("S#54197", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-RKF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55443", "CYC")));
        $ic10$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic11$ = SubLObjectFactory.makeInteger(1000);
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10466", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic13$ = SubLObjectFactory.makeSymbol("CLET");
        $ic14$ = SubLObjectFactory.makeSymbol("S#55431", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("CONS");
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55431", "CYC"));
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#55444", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic18$ = SubLObjectFactory.makeSymbol("FIF");
        $ic19$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic20$ = SubLObjectFactory.makeSymbol("EASILY-UNDERSTOOD-BY-HUMANS");
        $ic21$ = SubLObjectFactory.makeString(" is a THCL FORT by fiat (cf. *THCL-FORTS-BY-FIAT*)");
        $ic22$ = SubLObjectFactory.makeString(" is not a FORT.");
        $ic23$ = SubLObjectFactory.makeSymbol("S#55402", "CYC");
        $ic24$ = SubLObjectFactory.makeString(" is a predicate");
        $ic25$ = SubLObjectFactory.makeString(" is a functor");
        $ic26$ = SubLObjectFactory.makeString(" is a logical operator");
        $ic27$ = SubLObjectFactory.makeString(" is a microtheory");
        $ic28$ = SubLObjectFactory.makeString("Allowing ");
        $ic29$ = SubLObjectFactory.makeString(", because it is a ClarifyingCollectionType");
        $ic30$ = SubLObjectFactory.makeString(" is too general (generality = ");
        $ic31$ = SubLObjectFactory.makeString(", vs cutoff of ");
        $ic32$ = SubLObjectFactory.makeString(")");
        $ic33$ = SubLObjectFactory.makeString(" fails the THCL KB subset test");
        $ic34$ = SubLObjectFactory.makeString(" fails a cached test");
        $ic35$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic36$ = SubLObjectFactory.makeString("Sentence arity is less than 2:~% ~S");
        $ic37$ = SubLObjectFactory.makeString("Sentence uses a function and its corresponding predicate:~% ~S");
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CandidateForPredicatePopulation"));
        $ic39$ = SubLObjectFactory.makeString("Non-THCL arg: ~S");
        $ic40$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CapabilityPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("IncapabilityPredicate")));
        $ic41$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("QuantificationalRuleMacroPredicate-Canonical"));
        $ic43$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("valueOfFunctionForArgs"));
        $ic44$ = SubLObjectFactory.makeSymbol("S#55407", "CYC");
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic46$ = SubLObjectFactory.makeSymbol("?FN");
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("functionCorrespondingPredicate-Generic"));
        $ic48$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?N"));
        $ic49$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $ic50$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("IntermediateVocabPredicate"));
        $ic51$ = SubLObjectFactory.makeString("~S is an #$IntermediateVocabPredicate.");
        $ic52$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLTerm"));
        $ic53$ = SubLObjectFactory.makeSymbol("GENL?");
        $ic54$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate")));
        $ic55$ = SubLObjectFactory.makeString("~S has a quoted #$CycLTerm argument.");
        $ic56$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("BinaryRolePredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("VectorOrQuantitySlot")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("KindLevelPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CapabilityPredicate")));
        $ic57$ = SubLObjectFactory.makeSymbol("S#55410", "CYC");
        $ic58$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ResearchCycDefinitionalPredicate"));
        $ic59$ = SubLObjectFactory.makeString("Allowing ~S as arg of non-definitional predicate ~S");
        $ic60$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic61$ = SubLObjectFactory.makeInteger(500);
        $ic62$ = SubLObjectFactory.makeString("Allowing ~S as arg of #$genlPreds");
        $ic63$ = SubLObjectFactory.makeString("Non-thcl arg: ~S");
        $ic64$ = SubLObjectFactory.makeSymbol("S#55414", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#55433", "CYC");
        $ic66$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("DocumentationConstant")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Format")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ComputerCode")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLQuerySpecification")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Assignment-Specification")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Allotment")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Evaluating")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("KEInteractionResource")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentTest")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CharacterString")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ComputerVulnerabilityReport-CW")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BugReport")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BugzillaBugReportType")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Allotment")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("WordNetSynset")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("DealingWithAStringInNounLearnerTool")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("SoftwareAgentCommunicating")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentTest")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CoaDiagramObject")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReferenceWorkEntry")) });
        $ic67$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("DocumentationConstant")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ImplementationConstant")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("IndexicalConcept")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("UMLFORT")));
        $ic68$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Now")));
        $ic69$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("RelationalStructure")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Set-Mathematical")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("FormulaTemplate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Relation")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLExpression")));
        $ic70$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("highlyRelevantTerm"));
        $ic71$ = SubLObjectFactory.makeString("~S is a #$highlyRelevantTerm, so not filtering...");
        $ic72$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic73$ = SubLObjectFactory.makeString("~S is an instance of~% ~S");
        $ic74$ = SubLObjectFactory.makeString("~S is a NART and is an instance of one of~% ~S");
        $ic75$ = SubLObjectFactory.makeString("~S is a lexical word");
        $ic76$ = SubLObjectFactory.makeString("~S is a quoted instance of one of~% ~S");
        $ic77$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("BUTLERAgent")));
        $ic78$ = SubLObjectFactory.makeString("~S was created by ~S");
        $ic79$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionType"));
        $ic80$ = SubLObjectFactory.makeString("~S is either a #$CollectionType or a spec of one of~% ~S");
        $ic81$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $ic82$ = SubLObjectFactory.makeSymbol("S#55424", "CYC");
        $ic83$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("keIrrelevantTerm"));
        $ic84$ = SubLObjectFactory.makeSymbol("S#55440", "CYC");
        $ic85$ = SubLObjectFactory.makeInteger(10000);
        $ic86$ = SubLObjectFactory.makeSymbol("S#55428", "CYC");
        $ic87$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ClarifyingCollectionType"));
        $ic88$ = SubLObjectFactory.makeSymbol("S#55441", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#55425", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0794.class
	Total time: 326 ms
	
	Decompiled with Procyon 0.5.32.
*/