package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0294 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0294";
    public static final String myFingerPrint = "96eb420b8812d27ef1011eaee2a069ecdfd90f1d3b12d5b2cd47aaa535359962";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLInteger $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLList $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    
    public static SubLObject f19763(SubLObject var1, SubLObject var2) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)T;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0291.f19557();
        SubLObject var4 = (SubLObject)$ic0$;
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        final SubLObject var7 = f19764();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        assert NIL != module0034.f1839(var10) : var10;
        final SubLObject var11 = module0291.$g2669$.currentBinding(var3);
        try {
            module0291.$g2669$.bind(var10, var3);
            final SubLObject var12 = module0291.$g2669$.getDynamicValue(var3);
            final SubLObject var11_13 = module0034.$g879$.currentBinding(var3);
            try {
                module0034.$g879$.bind(var12, var3);
                SubLObject var13 = (SubLObject)NIL;
                if (NIL != var12 && NIL == module0034.f1842(var12)) {
                    var13 = module0034.f1869(var12);
                    final SubLObject var14 = Threads.current_process();
                    if (NIL == var13) {
                        module0034.f1873(var12, var14);
                    }
                    else if (!var13.eql(var14)) {
                        Errors.error((SubLObject)$ic2$);
                    }
                }
                try {
                    SubLObject var15 = module0292.f19701();
                    SubLObject var16 = (SubLObject)NIL;
                    var16 = var15.first();
                    while (NIL != var15) {
                        final SubLObject var17 = var16;
                        final SubLObject var18 = f19765(module0292.f19685(var17));
                        var8 = ConsesLow.nconc(var8, var18);
                        if (NIL != var2 && $ic3$.eql(f19766(var17, var18, (SubLObject)NIL, var1))) {
                            var4 = (SubLObject)$ic3$;
                        }
                        else {
                            var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
                        }
                        var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                        var15 = var15.rest();
                        var16 = var15.first();
                    }
                }
                finally {
                    final SubLObject var11_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                        SubLObject var19;
                        var9 = (var19 = conses_high.set_difference(var7, var8, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic4$)));
                        SubLObject var20 = (SubLObject)NIL;
                        var20 = var19.first();
                        while (NIL != var19) {
                            final SubLObject var21 = conses_high.third(var20);
                            final SubLObject var22 = conses_high.fourth(var20);
                            final SubLObject var23 = conses_high.fifth(var20);
                            final SubLObject var24 = module0293.f19719(var20.first(), var21, (SubLObject)NIL, (SubLObject)$ic5$);
                            final SubLObject var25 = conses_high.second(var20);
                            if ($ic3$.eql(f19767(var23, var1, var24, var25, var21, var22, Symbols.symbol_function((SubLObject)$ic6$), (SubLObject)$ic7$, (SubLObject)UNPROVIDED))) {
                                var4 = (SubLObject)$ic3$;
                            }
                            else {
                                var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
                            }
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            var19 = var19.rest();
                            var20 = var19.first();
                        }
                        if (NIL != var12 && NIL == var13) {
                            module0034.f1873(var12, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var11_14, var3);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var11_13, var3);
            }
        }
        finally {
            module0291.$g2669$.rebind(var11, var3);
        }
        return Values.values(var4, var5, var6);
    }
    
    public static SubLObject f19768(SubLObject var27, SubLObject var1) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)T;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)T;
        module0291.f19557();
        final SubLObject var30 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        assert NIL != module0034.f1839(var30) : var30;
        final SubLObject var31 = module0291.$g2669$.currentBinding(var28);
        try {
            module0291.$g2669$.bind(var30, var28);
            final SubLObject var32 = module0291.$g2669$.getDynamicValue(var28);
            final SubLObject var11_29 = module0034.$g879$.currentBinding(var28);
            try {
                module0034.$g879$.bind(var32, var28);
                SubLObject var33 = (SubLObject)NIL;
                if (NIL != var32 && NIL == module0034.f1842(var32)) {
                    var33 = module0034.f1869(var32);
                    final SubLObject var34 = Threads.current_process();
                    if (NIL == var33) {
                        module0034.f1873(var32, var34);
                    }
                    else if (!var33.eql(var34)) {
                        Errors.error((SubLObject)$ic2$);
                    }
                }
                try {
                    SubLObject var35 = module0292.f19701();
                    SubLObject var36 = (SubLObject)NIL;
                    var36 = var35.first();
                    while (NIL != var35) {
                        final SubLObject var37 = var36;
                        if ($ic3$.eql(f19766(var37, f19765(module0292.f19685(var37)), var27, var1))) {
                            var29 = (SubLObject)NIL;
                        }
                        var35 = var35.rest();
                        var36 = var35.first();
                    }
                }
                finally {
                    final SubLObject var11_30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var28);
                        if (NIL != var32 && NIL == var33) {
                            module0034.f1873(var32, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var11_30, var28);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var11_29, var28);
            }
        }
        finally {
            module0291.$g2669$.rebind(var31, var28);
        }
        return (SubLObject)((NIL != var29) ? $ic0$ : $ic3$);
    }
    
    public static SubLObject f19769(final SubLObject var31, SubLObject var27, SubLObject var1) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)T;
        }
        final SubLObject var32 = module0292.f19705(var31);
        if (NIL == var32) {
            return (SubLObject)$ic8$;
        }
        return f19766(var32, f19765(var31), var27, var1);
    }
    
    public static SubLObject f19764() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)$ic9$, var3);
            module0147.$g2095$.bind($ic10$, var3);
            var5 = module0259.f16848($ic11$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var7, var3);
            module0147.$g2094$.rebind(var6, var3);
        }
        SubLObject var8 = var5;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            var4 = (SubLObject)ConsesLow.cons(f19770(var9, $ic10$), var4);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var4;
    }
    
    public static SubLObject f19766(final SubLObject var18, final SubLObject var19, final SubLObject var27, SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)T;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = module0292.f19685(var18);
        SubLObject var30 = (SubLObject)ZERO_INTEGER;
        SubLObject var31 = (SubLObject)ZERO_INTEGER;
        SubLObject var32 = (SubLObject)$ic0$;
        if (NIL == var19) {
            PrintLow.format(var1, (SubLObject)$ic15$, var29);
            return (SubLObject)$ic16$;
        }
        PrintLow.format(var1, (SubLObject)$ic12$, var29);
        module0291.f19557();
        final SubLObject var33 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        assert NIL != module0034.f1839(var33) : var33;
        final SubLObject var34 = module0291.$g2669$.currentBinding(var28);
        try {
            module0291.$g2669$.bind(var33, var28);
            final SubLObject var35 = module0291.$g2669$.getDynamicValue(var28);
            final SubLObject var11_39 = module0034.$g879$.currentBinding(var28);
            try {
                module0034.$g879$.bind(var35, var28);
                SubLObject var36 = (SubLObject)NIL;
                if (NIL != var35 && NIL == module0034.f1842(var35)) {
                    var36 = module0034.f1869(var35);
                    final SubLObject var37 = Threads.current_process();
                    if (NIL == var36) {
                        module0034.f1873(var35, var37);
                    }
                    else if (!var36.eql(var37)) {
                        Errors.error((SubLObject)$ic2$);
                    }
                }
                try {
                    SubLObject var38 = var19;
                    SubLObject var39 = (SubLObject)NIL;
                    var39 = var38.first();
                    while (NIL != var38) {
                        final SubLObject var40 = conses_high.sixth(var39);
                        if (NIL == var40) {
                            var28.resetMultipleValues();
                            final SubLObject var41 = f19771(var18, var39, (SubLObject)NIL, var1);
                            final SubLObject var42 = var28.secondMultipleValue();
                            final SubLObject var43 = var28.thirdMultipleValue();
                            var28.resetMultipleValues();
                            var30 = Numbers.add(var30, var42);
                            var31 = Numbers.add(var31, var43);
                            if ($ic3$.eql(var41)) {
                                var32 = (SubLObject)$ic3$;
                            }
                        }
                        if (NIL != var27 || NIL != var40) {
                            var28.resetMultipleValues();
                            final SubLObject var41 = f19771(var18, var39, (SubLObject)T, var1);
                            final SubLObject var42 = var28.secondMultipleValue();
                            final SubLObject var43 = var28.thirdMultipleValue();
                            var28.resetMultipleValues();
                            if ($ic3$.eql(var41)) {
                                var32 = (SubLObject)$ic3$;
                            }
                        }
                        var38 = var38.rest();
                        var39 = var38.first();
                    }
                }
                finally {
                    final SubLObject var11_40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var28);
                        if (NIL != var35 && NIL == var36) {
                            module0034.f1873(var35, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var11_40, var28);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var11_39, var28);
            }
        }
        finally {
            module0291.$g2669$.rebind(var34, var28);
        }
        PrintLow.format(var1, (SubLObject)$ic13$, Numbers.round(Numbers.divide(var30, Sequences.length(var19)), (SubLObject)UNPROVIDED));
        PrintLow.format(var1, (SubLObject)$ic14$, Numbers.round(Numbers.divide(var31, Sequences.length(var19)), (SubLObject)UNPROVIDED));
        return var32;
    }
    
    public static SubLObject f19771(final SubLObject var18, final SubLObject var21, final SubLObject var27, final SubLObject var1) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        final SubLObject var29 = conses_high.third(var21);
        SubLObject var30 = conses_high.copy_list(conses_high.fourth(var21));
        final SubLObject var31 = conses_high.fifth(var21);
        final SubLObject var32 = module0293.f19719(var21.first(), var29, (SubLObject)NIL, (SubLObject)$ic5$);
        final SubLObject var33 = conses_high.second(var21);
        final SubLObject var34 = module0292.f19708(var18, var32, var29, var30);
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        if (NIL != var27) {
            var37 = Sequences.cconcatenate(module0038.f2638(var31), (SubLObject)$ic17$);
            var35 = Symbols.symbol_function((SubLObject)$ic6$);
            var36 = (SubLObject)$ic7$;
            var30 = conses_high.putf(var30, (SubLObject)$ic18$, module0292.f19685(var18));
            var30 = conses_high.putf(var30, (SubLObject)$ic19$, (SubLObject)FIVE_INTEGER);
        }
        else {
            var37 = var31;
            var35 = module0292.f19686(var18);
            var36 = module0292.f19688(var18);
        }
        var28.resetMultipleValues();
        final SubLObject var38 = f19767(var37, var1, var32, var33, var29, var30, var35, var36, var27);
        final SubLObject var39 = var28.secondMultipleValue();
        var28.resetMultipleValues();
        return Values.values(var38, var39, var34);
    }
    
    public static SubLObject f19765(final SubLObject var36) {
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var39;
        final SubLObject var38 = var39 = module0035.f2076((SubLObject)$ic20$, Sequences.delete_duplicates(module0434.f30577((SubLObject)$ic21$, (SubLObject)ConsesLow.list($ic22$, (SubLObject)$ic21$, var36), $ic10$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var40 = (SubLObject)NIL;
        var40 = var39.first();
        while (NIL != var39) {
            var37 = (SubLObject)ConsesLow.cons(f19770(var40, $ic10$), var37);
            var39 = var39.rest();
            var40 = var39.first();
        }
        return var37;
    }
    
    public static SubLObject f19767(final SubLObject var48, final SubLObject var1, final SubLObject var25, final SubLObject var26, final SubLObject var22, final SubLObject var23, final SubLObject var46, final SubLObject var47, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)ZERO_INTEGER;
        SubLObject var51 = (SubLObject)NIL;
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)NIL;
        final SubLObject var55 = (SubLObject)NIL;
        if (NIL != Functions.funcall(var46, var25, var22, var23)) {
            final SubLObject var56 = Time.get_internal_real_time();
            if (var47 == $ic7$ || NIL != var27) {
                var49.resetMultipleValues();
                final SubLObject var57_58 = Functions.funcall(var47, var25, var22, var23);
                final SubLObject var59_60 = var49.secondMultipleValue();
                var49.resetMultipleValues();
                var51 = var57_58;
                var53 = var59_60;
            }
            else {
                var49.resetMultipleValues();
                final SubLObject var61_62 = Functions.funcall(var47, var25, var55, var22, var23);
                final SubLObject var63_64 = var49.secondMultipleValue();
                var49.resetMultipleValues();
                var51 = var61_62;
                var53 = var63_64;
            }
            var50 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var56), time_high.$internal_time_units_per_second$.getGlobalValue());
            var51 = module0293.f19723(var51, var22);
        }
        else {
            var52 = (SubLObject)T;
            var51 = module0293.f19723(var25, var22);
        }
        var50 = Numbers.round(Numbers.multiply((SubLObject)$ic23$, var50), (SubLObject)UNPROVIDED);
        if (NIL != module0279.f18551(var26, var51, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            PrintLow.format(var1, (SubLObject)$ic24$, var48);
            var54 = (SubLObject)$ic0$;
        }
        else {
            PrintLow.format(var1, (SubLObject)$ic25$, new SubLObject[] { var48, var25, var22, var23, var26, (NIL != var52) ? $ic26$ : var51, var53 });
            var54 = (SubLObject)$ic3$;
        }
        streams_high.force_output(var1);
        return Values.values(var54, var50);
    }
    
    public static SubLObject f19770(final SubLObject var35, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        final SubLObject var67 = module0347.f23344((SubLObject)$ic27$, (SubLObject)ConsesLow.listS($ic28$, var35, (SubLObject)$ic29$), var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var68 = module0347.f23344((SubLObject)$ic27$, (SubLObject)ConsesLow.listS($ic30$, var35, (SubLObject)$ic29$), var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var69 = module0347.f23344((SubLObject)$ic27$, (SubLObject)ConsesLow.listS($ic31$, var35, (SubLObject)$ic29$), var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var70 = module0347.f23344((SubLObject)$ic27$, (SubLObject)ConsesLow.listS($ic32$, var35, (SubLObject)$ic29$), var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var71 = module0347.f23334((SubLObject)ConsesLow.list($ic33$, var35), var65, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var66) && NIL == var67) {
            Errors.error((SubLObject)$ic34$, var35);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var66) && NIL == module0035.f1997(var67)) {
            Errors.error((SubLObject)$ic35$, var35);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var66) && NIL == var68) {
            Errors.error((SubLObject)$ic36$, var35);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var66) && NIL == module0035.f1997(var68)) {
            Errors.error((SubLObject)$ic37$, var35);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var66) && NIL != var69 && NIL == module0035.f1997(var69)) {
            Errors.error((SubLObject)$ic38$, var35);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var66) && NIL != var70 && NIL == module0035.f1997(var70)) {
            Errors.error((SubLObject)$ic39$, var35);
        }
        final SubLObject var72 = var67.first();
        final SubLObject var73 = var68.first();
        final SubLObject var74 = var69.first();
        final SubLObject var75 = (SubLObject)((NIL != module0202.f12674(var70.first())) ? module0036.f2531(module0202.f12751(var70.first()), (SubLObject)$ic40$, (SubLObject)$ic41$, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var76 = module0035.sublisp_boolean(var71);
        return (SubLObject)ConsesLow.list(var72, var73, var74, var75, var35, var76);
    }
    
    public static SubLObject f19772() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0294", "f19763", "S#22416", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0294", "f19768", "S#22417", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0294", "f19769", "S#22418", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0294", "f19764", "S#22419", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0294", "f19766", "S#22420", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0294", "f19771", "S#22421", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0294", "f19765", "S#22422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0294", "f19767", "S#22423", 8, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0294", "f19770", "S#22424", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19773() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19774() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f19772();
    }
    
    public void initializeVariables() {
        f19773();
    }
    
    public void runTopLevelForms() {
        f19774();
    }
    
    static {
        me = (SubLFile)new module0294();
        $ic0$ = makeKeyword("SUCCESS");
        $ic1$ = makeSymbol("S#3044", "CYC");
        $ic2$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic3$ = makeKeyword("FAILURE");
        $ic4$ = makeSymbol("FIFTH");
        $ic5$ = makeKeyword("NONE");
        $ic6$ = makeSymbol("TRUE");
        $ic7$ = makeSymbol("REFORMULATE-CYCL");
        $ic8$ = makeKeyword("NOT-FOUND");
        $ic9$ = makeSymbol("S#12274", "CYC");
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("ReformulatorTestCase"));
        $ic12$ = makeString("~%~%Testing ~S RL Module...");
        $ic13$ = makeString("~%Average time  (usec): ~d");
        $ic14$ = makeString("~%Expected time (usec): ~d");
        $ic15$ = makeString("~%~%No tests found for ~S RL Module.~%");
        $ic16$ = makeKeyword("VACUOUS");
        $ic17$ = makeString(" (via hub)");
        $ic18$ = makeKeyword("FOCUS");
        $ic19$ = makeKeyword("RECURSION-LIMIT");
        $ic20$ = makeSymbol("S#12594", "CYC");
        $ic21$ = makeSymbol("?TESTCASE");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("reformulatorTestCaseModuleTested"));
        $ic23$ = makeInteger(1000000);
        $ic24$ = makeString("~%~A OK");
        $ic25$ = makeString("~%\nFailure on test ~A\nINPUT : ~A\nMT: ~A\nSETTINGS: ~S\nWANTED : ~A\nGOT : ~A\nWITH JUSTIFICATION : ~A~%");
        $ic26$ = makeKeyword("RL-MODULE-NOT-APPLICABLE");
        $ic27$ = makeKeyword("ANSWER");
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("reformulatorTestCaseInputExpression"));
        $ic29$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("reformulatorTestCaseOutputExpression"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("reformulatorTestCaseMicrotheory"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("reformulatorTestCaseSettings"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("reformulatorTestCaseRequiresRecursion"));
        $ic34$ = makeString("No input expression for reformulator test ~s~%");
        $ic35$ = makeString("singleEntryFormatInArgs violation on input expression for reformulator test ~s~%");
        $ic36$ = makeString("No output expression for reformulator test ~s~%");
        $ic37$ = makeString("singleEntryFormatInArgs violation on output expression for reformulator test ~s~%");
        $ic38$ = makeString("singleEntryFormatInArgs violation on microtheory for reformulator test ~s~%");
        $ic39$ = makeString("singleEntryFormatInArgs format violation on settings for reformulator test ~s~%");
        $ic40$ = makeSymbol("S#15600", "CYC");
        $ic41$ = makeSymbol("S#15664", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 252 ms
	
	Decompiled with Procyon 0.5.32.
*/