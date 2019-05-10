package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0708 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0708";
    public static final String myFingerPrint = "c06bd40d66237c7779b4e93e3306c61e3a60f51f352e0e47b681cbd4ef1fdfb6";
    private static SubLSymbol $g5530$;
    private static SubLSymbol $g5531$;
    public static SubLSymbol $g5532$;
    public static SubLSymbol $g5533$;
    private static SubLSymbol $g5534$;
    private static SubLSymbol $g5535$;
    private static SubLSymbol $g5536$;
    private static SubLSymbol $g5537$;
    public static SubLSymbol $g5538$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLList $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    
    public static SubLObject f43003() {
        return $g5530$.getGlobalValue();
    }
    
    public static SubLObject f43004() {
        return $g5531$.getGlobalValue();
    }
    
    public static SubLObject f43005(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0702.f42828(var1) && NIL != module0702.f42834(var1, f43003()));
    }
    
    public static SubLObject f43006() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != $g5533$.getDynamicValue(var2) || NIL != $g5532$.getDynamicValue(var2));
    }
    
    public static SubLObject f43007(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic2$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)$ic4$, (SubLObject)ConsesLow.listS((SubLObject)$ic5$, var7, ConsesLow.append(var8, (SubLObject)NIL)));
    }
    
    public static SubLObject f43008(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)$ic2$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic6$, (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)T, (SubLObject)ConsesLow.listS((SubLObject)$ic8$, (SubLObject)$ic9$, var7, (SubLObject)$ic10$), ConsesLow.append(var8, (SubLObject)NIL)), (SubLObject)$ic11$);
    }
    
    public static SubLObject f43009() {
        final SubLObject var11 = $g5534$.getGlobalValue();
        if (NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43010(final SubLObject var12) {
        return module0034.f1829($g5534$.getGlobalValue(), (SubLObject)ConsesLow.list(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43011(final SubLObject var12) {
        return Sequences.cconcatenate((SubLObject)$ic13$, var12);
    }
    
    public static SubLObject f43012(final SubLObject var12) {
        SubLObject var13 = $g5534$.getGlobalValue();
        if (NIL == var13) {
            var13 = module0034.f1934((SubLObject)$ic12$, (SubLObject)$ic14$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var14 = module0034.f1814(var13, var12, (SubLObject)$ic15$);
        if (var14 == $ic15$) {
            var14 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43011(var12)));
            module0034.f1816(var13, var12, var14, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var14);
    }
    
    public static SubLObject f43013() {
        final SubLObject var11 = $g5535$.getGlobalValue();
        if (NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43014(final SubLObject var12) {
        return module0034.f1829($g5535$.getGlobalValue(), (SubLObject)ConsesLow.list(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43015(final SubLObject var12) {
        return Sequences.cconcatenate(f43003(), var12);
    }
    
    public static SubLObject f43016(final SubLObject var12) {
        SubLObject var13 = $g5535$.getGlobalValue();
        if (NIL == var13) {
            var13 = module0034.f1934((SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var14 = module0034.f1814(var13, var12, (SubLObject)$ic15$);
        if (var14 == $ic15$) {
            var14 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43015(var12)));
            module0034.f1816(var13, var12, var14, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var14);
    }
    
    public static SubLObject f43017() {
        final SubLObject var11 = $g5536$.getGlobalValue();
        if (NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43018(final SubLObject var12) {
        return module0034.f1829($g5536$.getGlobalValue(), (SubLObject)ConsesLow.list(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43019(final SubLObject var12) {
        return Sequences.cconcatenate((SubLObject)$ic19$, var12);
    }
    
    public static SubLObject f43020(final SubLObject var12) {
        SubLObject var13 = $g5536$.getGlobalValue();
        if (NIL == var13) {
            var13 = module0034.f1934((SubLObject)$ic18$, (SubLObject)$ic20$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var14 = module0034.f1814(var13, var12, (SubLObject)$ic15$);
        if (var14 == $ic15$) {
            var14 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43019(var12)));
            module0034.f1816(var13, var12, var14, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var14);
    }
    
    public static SubLObject f43021() {
        final SubLObject var11 = $g5537$.getGlobalValue();
        if (NIL != var11) {
            module0034.f1818(var11);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43022(final SubLObject var12) {
        return module0034.f1829($g5537$.getGlobalValue(), (SubLObject)ConsesLow.list(var12), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43023(final SubLObject var12) {
        return Sequences.cconcatenate(f43004(), var12);
    }
    
    public static SubLObject f43024(final SubLObject var12) {
        SubLObject var13 = $g5537$.getGlobalValue();
        if (NIL == var13) {
            var13 = module0034.f1934((SubLObject)$ic21$, (SubLObject)$ic22$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var14 = module0034.f1814(var13, var12, (SubLObject)$ic15$);
        if (var14 == $ic15$) {
            var14 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43023(var12)));
            module0034.f1816(var13, var12, var14, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var14);
    }
    
    public static SubLObject f43025(final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18, final SubLObject var19, SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = module0574.f35152();
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = module0111.$g1405$.currentBinding(var21);
        try {
            module0111.$g1405$.bind((SubLObject)NIL, var21);
            module0574.f35153(var20);
            var22 = f43026(var15, var16, var17, var18, var19);
        }
        finally {
            module0111.$g1405$.rebind(var23, var21);
        }
        return var22;
    }
    
    public static SubLObject f43026(final SubLObject var15, final SubLObject var16, final SubLObject var17, final SubLObject var18, final SubLObject var23) {
        return f43027(var15, var16, var17, var18, var23);
    }
    
    public static SubLObject f43027(final SubLObject var15, final SubLObject var24, final SubLObject var17, final SubLObject var18, final SubLObject var23) {
        final SubLObject var25 = module0035.remove_if_not((SubLObject)$ic23$, (NIL != module0038.f2611(var18)) ? Sequences.cconcatenate(var18, new SubLObject[] { $ic24$, var15 }) : var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0543.f33623((var23 == $ic25$) ? module0038.f2812(var25) : ((var23 == $ic26$) ? module0038.f2815(var25) : var25), (SubLObject)UNPROVIDED);
        SubLObject var27 = var24;
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            f43028(module0202.f12768($ic27$, var26, var28), var17);
            var27 = var27.rest();
            var28 = var27.first();
        }
        return var26;
    }
    
    public static SubLObject f43029(SubLObject var29, final SubLObject var30, SubLObject var31, SubLObject var20, SubLObject var32) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var20 == UNPROVIDED) {
            var20 = module0574.f35152();
        }
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)T;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        assert NIL != module0226.f14809(var20) : var20;
        var29 = module0172.f10930(var29);
        if (NIL != var32 && NIL != module0205.f13145((SubLObject)$ic30$, var29, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var34 = module0205.f13147(var29, (SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0205.f13145((SubLObject)$ic30$, var34, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var29 = var34;
            }
        }
        SubLObject var35 = (SubLObject)NIL;
        if (NIL != module0288.f19313(var29, var30)) {
            if (NIL != $g5533$.getDynamicValue(var33)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic9$, new SubLObject[] { $ic32$, $ic33$ }), var29, var30);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var35 = (SubLObject)T;
        }
        else {
            final SubLObject var36 = module0111.$g1405$.currentBinding(var33);
            try {
                module0111.$g1405$.bind((SubLObject)NIL, var33);
                module0574.f35153(var20);
                var33.resetMultipleValues();
                final SubLObject var37 = f43028(var29, var30);
                final SubLObject var38 = var33.secondMultipleValue();
                var33.resetMultipleValues();
                if (NIL != var37) {
                    var35 = (SubLObject)T;
                }
                else if (NIL != $g5533$.getDynamicValue(var33)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic9$, new SubLObject[] { $ic34$, $ic33$ }), var38);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0111.$g1405$.rebind(var36, var33);
            }
        }
        if (NIL != var35) {
            f43030(var29, var30, var31);
        }
        return var35;
    }
    
    public static SubLObject f43031(final SubLObject var29, final SubLObject var30, SubLObject var31, SubLObject var20, SubLObject var32) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var20 == UNPROVIDED) {
            var20 = module0574.f35152();
        }
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)T;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0034.$g879$.getDynamicValue(var33);
        SubLObject var35 = (SubLObject)NIL;
        if (NIL == var34) {
            return f43029(var29, var30, var31, var20, var32);
        }
        var35 = module0034.f1857(var34, (SubLObject)$ic28$, (SubLObject)UNPROVIDED);
        if (NIL == var35) {
            var35 = module0034.f1807(module0034.f1842(var34), (SubLObject)$ic28$, (SubLObject)FIVE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var34, (SubLObject)$ic28$, var35);
        }
        final SubLObject var36 = module0034.f1779(var29, var30, var31, var20, var32);
        final SubLObject var37 = module0034.f1814(var35, var36, (SubLObject)UNPROVIDED);
        if (var37 != $ic15$) {
            SubLObject var38 = var37;
            SubLObject var39 = (SubLObject)NIL;
            var39 = var38.first();
            while (NIL != var38) {
                SubLObject var40 = var39.first();
                final SubLObject var41 = conses_high.second(var39);
                if (var29.equal(var40.first())) {
                    var40 = var40.rest();
                    if (var30.equal(var40.first())) {
                        var40 = var40.rest();
                        if (var31.equal(var40.first())) {
                            var40 = var40.rest();
                            if (var20.equal(var40.first())) {
                                var40 = var40.rest();
                                if (NIL != var40 && NIL == var40.rest() && var32.equal(var40.first())) {
                                    return module0034.f1959(var41);
                                }
                            }
                        }
                    }
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
        }
        final SubLObject var42 = Values.arg2(var33.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43029(var29, var30, var31, var20, var32)));
        module0034.f1836(var35, var36, var37, var42, (SubLObject)ConsesLow.list(var29, var30, var31, var20, var32));
        return module0034.f1959(var42);
    }
    
    public static SubLObject f43032(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0699.f42536(var1) || NIL != module0699.f42556(var1) || NIL != f43005(var1) || NIL != module0699.f42546(var1));
    }
    
    public static SubLObject f43033(final SubLObject var45) {
        final SubLObject var46 = module0701.f42758(var45);
        SubLObject var47 = (SubLObject)NIL;
        SubLObject var48 = var46;
        SubLObject var49 = (SubLObject)NIL;
        var49 = var48.first();
        while (NIL != var48) {
            SubLObject var51;
            final SubLObject var50 = var51 = var49;
            SubLObject var52 = (SubLObject)NIL;
            SubLObject var53 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)$ic35$);
            var52 = var51.first();
            var51 = (var53 = var51.rest());
            if (NIL != module0038.f2608(var52)) {
                var47 = conses_high.putf(var47, Sequences.cconcatenate((SubLObject)$ic36$, var52), var53);
            }
            else {
                var47 = conses_high.putf(var47, Sequences.cconcatenate((SubLObject)$ic37$, var52), var53);
            }
            var48 = var48.rest();
            var49 = var48.first();
        }
        return var47;
    }
    
    public static SubLObject f43034(final SubLObject var46, final SubLObject var53) {
        assert NIL != module0702.f42828(var53) : var53;
        final SubLObject var54 = module0006.f202(module0702.f42839(var53));
        final SubLObject var55 = module0702.f42830(var53);
        final SubLObject var56 = module0702.f42830(var53);
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = (SubLObject)NIL;
        SubLObject var60 = var46;
        SubLObject var61 = (SubLObject)NIL;
        var61 = var60.first();
        while (NIL != var60) {
            SubLObject var63;
            final SubLObject var62 = var63 = var61;
            SubLObject var64 = (SubLObject)NIL;
            SubLObject var65 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic39$);
            var64 = var63.first();
            var63 = (var65 = var63.rest());
            if (NIL != module0038.f2684(var55, var65) && NIL == module0038.f2608(var64) && NIL == module0038.f2668(var54, module0038.f2674(var56, var65, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                if (NIL != var57) {
                    if (NIL != module0038.f2647(var64, var57)) {
                        var57 = var64;
                        var59 = var65;
                    }
                }
                else {
                    var57 = var64;
                    var59 = var65;
                }
            }
            var60 = var60.rest();
            var61 = var60.first();
        }
        var58 = module0038.f2674(var56, var59, (SubLObject)UNPROVIDED);
        return Values.values(var57, var58);
    }
    
    public static SubLObject f43035(final SubLObject var45, final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        final SubLObject var66 = module0701.f42758(var45);
        if (NIL != module0702.f42828(var64)) {
            var65.resetMultipleValues();
            final SubLObject var67 = f43034(var66, var64);
            final SubLObject var68 = var65.secondMultipleValue();
            var65.resetMultipleValues();
            if (NIL != module0038.f2611(var67) && NIL != module0038.f2611(var68)) {
                return Sequences.cconcatenate(var67, new SubLObject[] { $ic40$, var68 });
            }
        }
        return module0006.f204(var64);
    }
    
    public static SubLObject f43036() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43028(final SubLObject var29, final SubLObject var30) {
        return Values.values(module0543.f33651(var29, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)NIL);
    }
    
    public static SubLObject f43030(final SubLObject var29, final SubLObject var30, final SubLObject var31) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43037(final SubLObject var65, final SubLObject var31, SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = module0574.f35152();
        }
        return (SubLObject)((NIL != var31) ? f43031((SubLObject)ConsesLow.list($ic42$, var31, var65), $ic43$, var31, var20, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f43038(final SubLObject var65, final SubLObject var31, SubLObject var20) {
        if (var20 == UNPROVIDED) {
            var20 = module0574.f35152();
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        final SubLObject var67 = module0034.$g879$.getDynamicValue(var66);
        SubLObject var68 = (SubLObject)NIL;
        if (NIL == var67) {
            return f43037(var65, var31, var20);
        }
        var68 = module0034.f1857(var67, (SubLObject)$ic41$, (SubLObject)UNPROVIDED);
        if (NIL == var68) {
            var68 = module0034.f1807(module0034.f1842(var67), (SubLObject)$ic41$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var67, (SubLObject)$ic41$, var68);
        }
        final SubLObject var69 = module0034.f1781(var65, var31, var20);
        final SubLObject var70 = module0034.f1814(var68, var69, (SubLObject)UNPROVIDED);
        if (var70 != $ic15$) {
            SubLObject var71 = var70;
            SubLObject var72 = (SubLObject)NIL;
            var72 = var71.first();
            while (NIL != var71) {
                SubLObject var73 = var72.first();
                final SubLObject var74 = conses_high.second(var72);
                if (var65.equal(var73.first())) {
                    var73 = var73.rest();
                    if (var31.equal(var73.first())) {
                        var73 = var73.rest();
                        if (NIL != var73 && NIL == var73.rest() && var20.equal(var73.first())) {
                            return module0034.f1959(var74);
                        }
                    }
                }
                var71 = var71.rest();
                var72 = var71.first();
            }
        }
        final SubLObject var75 = Values.arg2(var66.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43037(var65, var31, var20)));
        module0034.f1836(var68, var69, var70, var75, (SubLObject)ConsesLow.list(var65, var31, var20));
        return module0034.f1959(var75);
    }
    
    public static SubLObject f43039(final SubLObject var45) {
        assert NIL != module0701.f42628(var45) : var45;
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = module0701.f42657(var45, module0699.f42531((SubLObject)$ic46$), f43016((SubLObject)$ic47$));
        SubLObject var48 = (SubLObject)NIL;
        var48 = var47.first();
        while (NIL != var47) {
            if (module0701.f42656(var45, var48, module0699.f42551((SubLObject)$ic45$)).isZero()) {
                var46 = (SubLObject)ConsesLow.cons(var48, var46);
            }
            var47 = var47.rest();
            var48 = var47.first();
        }
        return var46;
    }
    
    public static SubLObject f43040(final SubLObject var45) {
        assert NIL != module0701.f42628(var45) : var45;
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = module0701.f42659(var45, module0699.f42561((SubLObject)$ic48$));
        SubLObject var48 = (SubLObject)NIL;
        var48 = var47.first();
        while (NIL != var47) {
            final SubLObject var49 = module0700.f42614(var48);
            if (module0701.f42656(var45, var49, module0699.f42561((SubLObject)$ic48$)).isZero()) {
                final SubLObject var50 = var49;
                if (NIL == conses_high.member(var50, var46, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var46 = (SubLObject)ConsesLow.cons(var50, var46);
                }
            }
            var47 = var47.rest();
            var48 = var47.first();
        }
        return var46;
    }
    
    public static SubLObject f43041(final SubLObject var45) {
        assert NIL != module0701.f42628(var45) : var45;
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = module0701.f42657(var45, module0699.f42531((SubLObject)$ic46$), f43016((SubLObject)$ic50$));
        SubLObject var48 = (SubLObject)NIL;
        var48 = var47.first();
        while (NIL != var47) {
            if (module0701.f42656(var45, var48, module0699.f42551((SubLObject)$ic49$)).isZero()) {
                var46 = (SubLObject)ConsesLow.cons(var48, var46);
            }
            var47 = var47.rest();
            var48 = var47.first();
        }
        return var46;
    }
    
    public static SubLObject f43042(final SubLObject var45) {
        SubLObject var46 = (SubLObject)ZERO_INTEGER;
        SubLObject var47 = module0701.f42659(var45, f43016((SubLObject)$ic53$));
        SubLObject var48 = (SubLObject)NIL;
        var48 = var47.first();
        while (NIL != var47) {
            final SubLObject var49 = module0700.f42614(var48);
            if (NIL != module0702.f42828(var49) && NIL == Sequences.search((SubLObject)$ic51$, module0702.f42830(var49), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == Sequences.search((SubLObject)$ic52$, module0702.f42830(var49), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER);
            }
            var47 = var47.rest();
            var48 = var47.first();
        }
        return var46;
    }
    
    public static SubLObject f43043(final SubLObject var45) {
        SubLObject var46 = (SubLObject)ZERO_INTEGER;
        SubLObject var47 = module0701.f42659(var45, f43016((SubLObject)$ic53$));
        SubLObject var48 = (SubLObject)NIL;
        var48 = var47.first();
        while (NIL != var47) {
            var46 = Numbers.add(var46, (SubLObject)ONE_INTEGER);
            var47 = var47.rest();
            var48 = var47.first();
        }
        return var46;
    }
    
    public static SubLObject f43044(final SubLObject var45) {
        final SubLObject var46 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var47 = module0701.f42659(var45, f43016((SubLObject)$ic53$));
        SubLObject var48 = (SubLObject)NIL;
        var48 = var47.first();
        while (NIL != var47) {
            final SubLObject var49 = module0700.f42614(var48);
            if (NIL != module0702.f42828(var49)) {
                final SubLObject var50 = module0702.f42830(var49);
                final SubLObject var51 = module0035.f2029((SubLObject)Characters.CHAR_hash, var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var52 = module0035.f2029((SubLObject)Characters.CHAR_slash, var50, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var53 = module0038.f2623(var50, (SubLObject)ZERO_INTEGER, module0048.f3382(module0035.delete_if_not((SubLObject)$ic54$, (SubLObject)ConsesLow.list(var51, var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED));
                module0084.f5775(var46, var53, (SubLObject)UNPROVIDED);
            }
            var47 = var47.rest();
            var48 = var47.first();
        }
        return module0084.f5795(var46, Symbols.symbol_function((SubLObject)$ic55$));
    }
    
    public static SubLObject f43045(final SubLObject var45) {
        final SubLObject var46 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var47 = module0701.f42659(var45, f43016((SubLObject)$ic53$));
        SubLObject var48 = (SubLObject)NIL;
        var48 = var47.first();
        while (NIL != var47) {
            final SubLObject var49 = module0700.f42614(var48);
            if (NIL != module0702.f42828(var49)) {
                final SubLObject var50 = module0702.f42830(var49);
                if (NIL != module0038.f2684(var50, (SubLObject)$ic56$)) {
                    final SubLObject var51 = Sequences.position((SubLObject)Characters.CHAR_slash, var50, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)SEVEN_INTEGER, (SubLObject)UNPROVIDED);
                    final SubLObject var52 = module0038.f2623(var50, (SubLObject)SEVEN_INTEGER, var51);
                    module0084.f5775(var46, var52, (SubLObject)UNPROVIDED);
                }
            }
            var47 = var47.rest();
            var48 = var47.first();
        }
        return module0084.f5795(var46, Symbols.symbol_function((SubLObject)$ic55$));
    }
    
    public static SubLObject f43046(final SubLObject var45) {
        SubLObject var46 = module0701.f42659(var45, f43016((SubLObject)$ic53$));
        SubLObject var47 = (SubLObject)NIL;
        var47 = var46.first();
        while (NIL != var46) {
            final SubLObject var48 = module0700.f42614(var47);
            if (NIL == module0702.f42828(var48)) {
                print_high.print(var47, (SubLObject)UNPROVIDED);
            }
            var46 = var46.rest();
            var47 = var46.first();
        }
        return var45;
    }
    
    public static SubLObject f43047(final SubLObject var64, final SubLObject var45) {
        if (NIL == module0703.f42867(var64)) {
            return (SubLObject)NIL;
        }
        final SubLObject var65 = module0701.f42651(var45, var64, (SubLObject)UNPROVIDED);
        if ((NIL == module0035.f1998(var65) && NIL == module0035.f1999(var65)) || NIL == Sequences.find(module0701.f42634(var45, f43016((SubLObject)$ic57$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var65, (SubLObject)EQ, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var66 = Sequences.find(module0701.f42634(var45, module0699.f42531((SubLObject)$ic46$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var65, (SubLObject)EQ, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != var66 && NIL != module0701.f42633(module0700.f42612(var66), var64) && NIL != module0701.f42633(module0700.f42614(var66), module0701.f42634(var45, f43016((SubLObject)$ic47$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f43048(final SubLObject var64, final SubLObject var45) {
        if (NIL == module0703.f42867(var64)) {
            return (SubLObject)NIL;
        }
        final SubLObject var65 = module0701.f42651(var45, var64, (SubLObject)UNPROVIDED);
        if ((NIL == module0035.f1998(var65) && NIL == module0035.f1999(var65)) || NIL == Sequences.find(module0701.f42634(var45, f43016((SubLObject)$ic59$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var65, (SubLObject)EQ, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var66 = Sequences.find(module0701.f42634(var45, module0699.f42531((SubLObject)$ic46$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var65, (SubLObject)EQ, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != var66 && NIL != module0701.f42633(module0700.f42612(var66), var64) && NIL != module0701.f42633(module0700.f42614(var66), module0701.f42634(var45, f43016((SubLObject)$ic47$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f43049(final SubLObject var64, final SubLObject var45) {
        if (NIL == module0703.f42867(var64)) {
            return (SubLObject)NIL;
        }
        final SubLObject var65 = module0701.f42651(var45, var64, (SubLObject)UNPROVIDED);
        if ((NIL == module0035.f1998(var65) && NIL == module0035.f1999(var65)) || NIL == Sequences.find(module0701.f42634(var45, f43016((SubLObject)$ic60$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var65, (SubLObject)EQ, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var66 = Sequences.find(module0701.f42634(var45, module0699.f42531((SubLObject)$ic46$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var65, (SubLObject)EQ, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != var66 && NIL != module0701.f42633(module0700.f42612(var66), var64) && NIL != module0701.f42633(module0700.f42614(var66), module0701.f42634(var45, f43016((SubLObject)$ic47$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f43050(final SubLObject var64, final SubLObject var45) {
        if (NIL != module0703.f42867(var64)) {
            final SubLObject var65 = module0701.f42651(var45, var64, (SubLObject)UNPROVIDED);
            if (NIL != module0035.f1999(var65) || NIL != module0035.f1995(var65, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED)) {
                final SubLObject var66 = module0701.f42634(var45, module0699.f42531((SubLObject)$ic46$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var67 = module0701.f42634(var45, f43016((SubLObject)$ic61$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var68 = module0701.f42634(var45, f43016((SubLObject)$ic62$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0701.f42643(var45, var64, var66, var67) && NIL != module0035.f1997(module0701.f42651(var45, var64, var68))) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43051(final SubLObject var64, final SubLObject var45) {
        if (NIL != module0703.f42867(var64)) {
            final SubLObject var65 = module0701.f42651(var45, var64, (SubLObject)UNPROVIDED);
            if (NIL != module0035.f1998(var65) || NIL != module0035.f1999(var65)) {
                final SubLObject var66 = module0701.f42634(var45, module0699.f42531((SubLObject)$ic46$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var67 = module0701.f42634(var45, f43016((SubLObject)$ic63$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0035.f1997(module0701.f42651(var45, var64, var66)) && NIL != module0035.f1997(module0701.f42651(var45, var64, var67))) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43052(final SubLObject var87) {
        final SubLThread var88 = SubLProcess.currentSubLThread();
        module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var88), (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var89;
        SubLObject var90;
        SubLObject var91;
        for (var89 = (SubLObject)NIL, var89 = var87; NIL != var89; var89 = conses_high.cddr(var89)) {
            var90 = var89.first();
            var91 = conses_high.cadr(var89);
            module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var88), (SubLObject)$ic65$, var90, var91, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43053(final SubLObject var45) {
        f43054(module0077.f5312(module0701.f42638(var45)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43055(final SubLObject var45) {
        module0006.f218((SubLObject)T, (SubLObject)$ic66$, module0701.f42752(var45), module0701.f42686(var45), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43054(final SubLObject var81) {
        final SubLThread var82 = SubLProcess.currentSubLThread();
        SubLObject var83 = var81;
        SubLObject var84 = (SubLObject)NIL;
        var84 = var83.first();
        while (NIL != var83) {
            module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var82), (SubLObject)$ic67$, var84, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var83 = var83.rest();
            var84 = var83.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43056() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43003", "S#47032", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43004", "S#47033", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43005", "S#46657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43006", "S#47034", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0708", "f43007", "S#47035");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0708", "f43008", "S#47036");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43009", "S#47037", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43010", "S#47038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43011", "S#47039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43012", "S#47040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43013", "S#47041", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43014", "S#47042", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43015", "S#47043", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43016", "S#46642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43017", "S#47044", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43018", "S#47045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43019", "S#47046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43020", "S#47047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43021", "S#47048", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43022", "S#47049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43023", "S#47050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43024", "S#47051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43025", "S#47052", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43026", "S#47053", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43027", "S#47054", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43029", "S#47055", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43031", "S#47056", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43032", "S#46658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43033", "S#47057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43034", "S#47058", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43035", "S#46656", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43036", "S#47059", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43028", "S#47060", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43030", "S#47061", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43037", "S#47062", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43038", "S#47063", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43039", "S#47064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43040", "S#47065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43041", "S#47066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43042", "S#47067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43043", "S#47068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43044", "S#47069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43045", "S#47070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43046", "S#47071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43047", "S#47072", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43048", "S#47073", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43049", "S#47074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43050", "S#47075", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43051", "S#47076", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43052", "S#47077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43053", "S#47078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43055", "S#47079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0708", "f43054", "S#47080", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43057() {
        $g5530$ = SubLFiles.deflexical("S#47081", (SubLObject)$ic0$);
        $g5531$ = SubLFiles.deflexical("S#47082", (SubLObject)$ic1$);
        $g5532$ = SubLFiles.defparameter("S#47083", (SubLObject)T);
        $g5533$ = SubLFiles.defparameter("S#47084", (SubLObject)NIL);
        $g5534$ = SubLFiles.deflexical("S#47085", (SubLObject)NIL);
        $g5535$ = SubLFiles.deflexical("S#47086", (SubLObject)NIL);
        $g5536$ = SubLFiles.deflexical("S#47087", (SubLObject)NIL);
        $g5537$ = SubLFiles.deflexical("S#47088", (SubLObject)NIL);
        $g5538$ = SubLFiles.defparameter("S#47089", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43058() {
        module0034.f1909((SubLObject)$ic12$);
        module0034.f1909((SubLObject)$ic16$);
        module0034.f1909((SubLObject)$ic18$);
        module0034.f1909((SubLObject)$ic21$);
        module0034.f1895((SubLObject)$ic28$);
        module0034.f1895((SubLObject)$ic41$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f43056();
    }
    
    public void initializeVariables() {
        f43057();
    }
    
    public void runTopLevelForms() {
        f43058();
    }
    
    static {
        me = (SubLFile)new module0708();
        $g5530$ = null;
        $g5531$ = null;
        $g5532$ = null;
        $g5533$ = null;
        $g5534$ = null;
        $g5535$ = null;
        $g5536$ = null;
        $g5537$ = null;
        $g5538$ = null;
        $ic0$ = makeString("http://www.w3.org/2002/07/owl#");
        $ic1$ = makeString("http://www.w3.org/2006/12/owl11#");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#38925", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic3$ = makeSymbol("PWHEN");
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#47034", "CYC"));
        $ic5$ = makeSymbol("WARN");
        $ic6$ = makeSymbol("S#47084", "CYC");
        $ic7$ = makeSymbol("FORMAT");
        $ic8$ = makeSymbol("CCONCATENATE");
        $ic9$ = makeString("~&");
        $ic10$ = ConsesLow.list((SubLObject)makeString("~%"));
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FORCE-OUTPUT")));
        $ic12$ = makeSymbol("S#47040", "CYC");
        $ic13$ = makeString("owl:");
        $ic14$ = makeSymbol("S#47085", "CYC");
        $ic15$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic16$ = makeSymbol("S#46642", "CYC");
        $ic17$ = makeSymbol("S#47086", "CYC");
        $ic18$ = makeSymbol("S#47047", "CYC");
        $ic19$ = makeString("owl11:");
        $ic20$ = makeSymbol("S#47087", "CYC");
        $ic21$ = makeSymbol("S#47051", "CYC");
        $ic22$ = makeSymbol("S#47088", "CYC");
        $ic23$ = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic24$ = makeString("-");
        $ic25$ = makeKeyword("UPCASE");
        $ic26$ = makeKeyword("DOWNCASE");
        $ic27$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic28$ = makeSymbol("S#47056", "CYC");
        $ic29$ = makeSymbol("S#17609", "CYC");
        $ic30$ = makeSymbol("S#3946", "CYC");
        $ic31$ = makeSymbol("S#16383", "CYC");
        $ic32$ = makeString("Already know ~S~% in ~S");
        $ic33$ = makeString("~%");
        $ic34$ = makeString("Failed to assert ~S~%");
        $ic35$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#47090", "CYC"), (SubLObject)makeSymbol("S#17394", "CYC"));
        $ic36$ = makeString("xmlns");
        $ic37$ = makeString("xmlns:");
        $ic38$ = makeSymbol("S#46508", "CYC");
        $ic39$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#10299", "CYC"), (SubLObject)makeSymbol("S#47091", "CYC"));
        $ic40$ = makeString(":");
        $ic41$ = makeSymbol("S#47063", "CYC");
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("termActedOnDuringOWLImport"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic44$ = makeSymbol("S#46652", "CYC");
        $ic45$ = makeString("subClassOf");
        $ic46$ = makeString("type");
        $ic47$ = makeString("Class");
        $ic48$ = makeString("broader");
        $ic49$ = makeString("range");
        $ic50$ = makeString("ObjectProperty");
        $ic51$ = makeString("sw.opencyc.org");
        $ic52$ = makeString("sw.cyc.com");
        $ic53$ = makeString("sameAs");
        $ic54$ = makeSymbol("NUMBERP");
        $ic55$ = makeSymbol(">");
        $ic56$ = makeString("http://");
        $ic57$ = makeString("intersectionOf");
        $ic58$ = makeSymbol("S#46526", "CYC");
        $ic59$ = makeString("unionOf");
        $ic60$ = makeString("complementOf");
        $ic61$ = makeString("Restriction");
        $ic62$ = makeString("onProperty");
        $ic63$ = makeString("oneOf");
        $ic64$ = makeString("Using options:~%");
        $ic65$ = makeString("  ~S -> ~S~%");
        $ic66$ = makeString("~&~A nodes / ~A triples.~%");
        $ic67$ = makeString("  ~S~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 294 ms
	
	Decompiled with Procyon 0.5.32.
*/