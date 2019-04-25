package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0293 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0293";
    public static final String myFingerPrint = "f9cd1a8c2151237e1ea914a391053434e6c82ff713050ffabcf3b3ae161c1bdd";
    private static SubLSymbol $g2674$;
    private static SubLSymbol $g2675$;
    private static SubLSymbol $g2676$;
    private static SubLSymbol $g2677$;
    private static SubLSymbol $g2678$;
    private static SubLSymbol $g2679$;
    private static SubLSymbol $g2680$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    
    public static SubLObject f19713(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0293.UNPROVIDED) {
            var2 = (SubLObject)module0293.NIL;
        }
        if (var3 == module0293.UNPROVIDED) {
            var3 = (SubLObject)module0293.NIL;
        }
        if (module0293.NIL != module0205.f13145(Symbols.symbol_function((SubLObject)module0293.$ic0$), var1, (SubLObject)module0293.NIL, (SubLObject)module0293.UNPROVIDED)) {
            f19714((SubLObject)module0293.ONE_INTEGER, (SubLObject)module0293.$ic1$, var1, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED);
            return (SubLObject)module0293.NIL;
        }
        if (module0293.NIL == module0131.f8536()) {
            Errors.error((SubLObject)module0293.$ic2$);
        }
        module0291.f19545();
        final SubLObject var4 = module0291.f19602(var3, var2);
        final SubLObject var5 = module0291.f19645(var4);
        if (module0293.$ic3$ == var5) {
            module0291.f19557();
        }
        return f19715(var1, var2, var4);
    }
    
    public static SubLObject f19716(final SubLObject var1, final SubLObject var3) {
        if (module0293.NIL == module0202.f12590(var1)) {
            final SubLObject var5;
            final SubLObject var4 = var5 = module0291.f19646(var3);
            if (var5.eql((SubLObject)module0293.$ic3$)) {
                return (SubLObject)module0293.T;
            }
            if (var5.eql((SubLObject)module0293.$ic4$)) {
                return (SubLObject)module0293.NIL;
            }
            if (var5.eql((SubLObject)module0293.$ic5$)) {
                return module0330.f22365(var1);
            }
        }
        return (SubLObject)module0293.T;
    }
    
    public static SubLObject f19717(final SubLObject var3) {
        final SubLObject var4 = module0291.f19647(var3);
        return (SubLObject)((module0293.NIL != var4) ? Numbers.add(Time.get_internal_real_time(), Numbers.floor(Numbers.multiply(var4, time_high.$internal_time_units_per_second$.getGlobalValue()), (SubLObject)module0293.UNPROVIDED)) : module0293.NIL);
    }
    
    public static SubLObject f19715(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0293.NIL;
        SubLObject var6 = (SubLObject)module0293.ZERO_INTEGER;
        SubLObject var7 = (SubLObject)module0293.NIL;
        SubLObject var8 = (SubLObject)module0293.NIL;
        SubLObject var9 = (SubLObject)module0293.NIL;
        SubLObject var10 = (SubLObject)module0293.NIL;
        final SubLObject var11 = module0293.$g2674$.currentBinding(var4);
        try {
            module0293.$g2674$.bind(f19717(var3), var4);
            if (module0293.NIL != f19716(var1, var3)) {
                final SubLObject var12 = module0291.f19573();
                assert module0293.NIL != module0034.f1839(var12) : var12;
                final SubLObject var16_18 = module0291.$g2669$.currentBinding(var4);
                try {
                    module0291.$g2669$.bind(var12, var4);
                    final SubLObject var13 = module0291.$g2669$.getDynamicValue(var4);
                    final SubLObject var16_19 = module0034.$g879$.currentBinding(var4);
                    try {
                        module0034.$g879$.bind(var13, var4);
                        SubLObject var14 = (SubLObject)module0293.NIL;
                        if (module0293.NIL != var13 && module0293.NIL == module0034.f1842(var13)) {
                            var14 = module0034.f1869(var13);
                            final SubLObject var15 = Threads.current_process();
                            if (module0293.NIL == var14) {
                                module0034.f1873(var13, var15);
                            }
                            else if (!var14.eql(var15)) {
                                Errors.error((SubLObject)module0293.$ic7$);
                            }
                        }
                        try {
                            final SubLObject var16 = module0147.f9540(module0147.f9541(var2));
                            final SubLObject var16_20 = module0147.$g2095$.currentBinding(var4);
                            final SubLObject var17 = module0147.$g2094$.currentBinding(var4);
                            final SubLObject var18 = module0147.$g2096$.currentBinding(var4);
                            try {
                                module0147.$g2095$.bind(module0147.f9545(var16), var4);
                                module0147.$g2094$.bind(module0147.f9546(var16), var4);
                                module0147.$g2096$.bind(module0147.f9549(var16), var4);
                                final SubLObject var19 = module0291.f19622(var3);
                                final SubLObject var20 = module0291.f19619(var3);
                                final SubLObject var21 = module0291.f19631(var3);
                                SubLObject var22 = (SubLObject)module0293.NIL;
                                SubLObject var23 = (SubLObject)module0293.NIL;
                                final SubLObject var24 = f19718(var1);
                                if (module0293.NIL != var24) {
                                    final SubLObject var25 = module0205.f13203(var1, (SubLObject)module0293.UNPROVIDED);
                                    var7 = f19719(var25, var2, (SubLObject)module0293.NIL, var21);
                                }
                                else {
                                    var7 = f19719(var1, var2, (SubLObject)module0293.NIL, var21);
                                }
                                var10 = var7;
                                if (module0293.NIL != var7) {
                                    while (module0293.NIL == var22 && var6.numLE(var19)) {
                                        var4.resetMultipleValues();
                                        final SubLObject var26 = f19720(var7, var7, var10, var2, var3, Equality.eql((SubLObject)module0293.$ic3$, var20));
                                        final SubLObject var27 = var4.secondMultipleValue();
                                        final SubLObject var28 = var4.thirdMultipleValue();
                                        var4.resetMultipleValues();
                                        if (module0293.NIL == var28) {
                                            var22 = (SubLObject)module0293.T;
                                        }
                                        else {
                                            var8 = f19721(var27, var26, var7, var2);
                                            if (module0293.NIL != Sequences.find(var8, var23, Symbols.symbol_function((SubLObject)module0293.EQUALP), (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED)) {
                                                var22 = (SubLObject)module0293.T;
                                            }
                                            else {
                                                var23 = (SubLObject)ConsesLow.cons(var8, var23);
                                                var9 = (SubLObject)ConsesLow.cons(f19722(var26, var27, var28), var9);
                                                var6 = Numbers.add(var6, (SubLObject)module0293.ONE_INTEGER);
                                                var7 = (var10 = var8);
                                                var8 = (SubLObject)module0293.NIL;
                                            }
                                        }
                                        if (module0293.NIL != module0293.$g2674$.getDynamicValue(var4) && Time.get_internal_real_time().numG(module0293.$g2674$.getDynamicValue(var4))) {
                                            var22 = (SubLObject)module0293.T;
                                        }
                                    }
                                    var7 = f19723(var7, var2);
                                    if (module0293.NIL != var24) {
                                        var7 = (SubLObject)ConsesLow.list(var24, var7);
                                    }
                                }
                            }
                            finally {
                                module0147.$g2096$.rebind(var18, var4);
                                module0147.$g2094$.rebind(var17, var4);
                                module0147.$g2095$.rebind(var16_20, var4);
                            }
                        }
                        finally {
                            final SubLObject var16_21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0293.T, var4);
                                var9 = Sequences.reverse(var9);
                                if (module0293.$ic3$ == module0291.f19644(var3)) {
                                    var9 = f19724(var9);
                                }
                                if (module0293.NIL != var13 && module0293.NIL == var14) {
                                    module0034.f1873(var13, (SubLObject)module0293.NIL);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var16_21, var4);
                            }
                        }
                    }
                    finally {
                        module0034.$g879$.rebind(var16_19, var4);
                    }
                }
                finally {
                    module0291.$g2669$.rebind(var16_18, var4);
                }
            }
            final SubLObject var29 = (SubLObject)((module0293.NIL != module0293.$g2674$.getDynamicValue(var4) && Time.get_internal_real_time().numG(module0293.$g2674$.getDynamicValue(var4))) ? module0293.$ic8$ : module0293.NIL);
            if (var6.isPositive()) {
                var5 = (SubLObject)ConsesLow.list(var7, var9, var29);
            }
            else if (module0293.NIL == var7) {
                var5 = (SubLObject)ConsesLow.list(var1, (SubLObject)module0293.$ic9$, var29);
            }
            else {
                var5 = (SubLObject)ConsesLow.list(var7, (SubLObject)module0293.NIL, var29);
            }
        }
        finally {
            module0293.$g2674$.rebind(var11, var4);
        }
        return module0004.values_list(var5);
    }
    
    public static SubLObject f19724(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0293.NIL;
        SubLObject var16 = var14;
        SubLObject var17 = (SubLObject)module0293.NIL;
        var17 = var16.first();
        while (module0293.NIL != var16) {
            final SubLObject var18 = f19725(var17);
            final SubLObject var19 = f19726(var17);
            final SubLObject var20 = f19727(var17);
            SubLObject var21 = (SubLObject)module0293.NIL;
            SubLObject var40_46 = var15;
            SubLObject var22 = (SubLObject)module0293.NIL;
            var22 = var40_46.first();
            while (module0293.NIL != var40_46) {
                final SubLObject var23 = f19725(var22);
                final SubLObject var24 = f19726(var22);
                final SubLObject var25 = f19727(var22);
                if (var18.equalp(var24)) {
                    var21 = (SubLObject)module0293.T;
                    final SubLObject var26 = (SubLObject)ConsesLow.list(var23, var19, ConsesLow.append(var25, var20));
                    var15 = conses_high.subst(var26, var22, var15, (SubLObject)module0293.EQUALP, (SubLObject)module0293.UNPROVIDED);
                }
                var40_46 = var40_46.rest();
                var22 = var40_46.first();
            }
            if (module0293.NIL == var21) {
                var15 = (SubLObject)ConsesLow.cons(var17, var15);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return var15;
    }
    
    public static SubLObject f19721(final SubLObject var52, final SubLObject var53, final SubLObject var1, final SubLObject var2) {
        if (var53.equal(var1)) {
            return f19728(var52, var2);
        }
        final SubLObject var54 = (module0293.NIL != module0232.f15323(var52)) ? f19723(var52, var2) : var52;
        SubLObject var55 = (SubLObject)module0293.NIL;
        if (module0293.NIL != module0232.f15323(var52) && module0293.NIL != module0232.f15323(var53) && module0293.NIL != module0232.f15323(var1)) {
            var55 = f19729(var52, var53, var1, var2);
        }
        else {
            var55 = module0205.f13250(var54, var53, var1, Symbols.symbol_function((SubLObject)module0293.EQUAL), (SubLObject)module0293.UNPROVIDED);
        }
        if (var1.equal(var55)) {
            var55 = f19730(var54, var53, var1, var2);
        }
        return f19728(var55, var2);
    }
    
    public static SubLObject f19731() {
        final SubLObject var55 = module0293.$g2675$.getGlobalValue();
        if (module0293.NIL != var55) {
            module0034.f1818(var55);
        }
        return (SubLObject)module0293.NIL;
    }
    
    public static SubLObject f19732() {
        return module0034.f1829(module0293.$g2675$.getGlobalValue(), (SubLObject)ConsesLow.list(module0293.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED);
    }
    
    public static SubLObject f19733() {
        return module0259.f16848(module0293.$ic11$, module0293.$ic12$, (SubLObject)module0293.UNPROVIDED);
    }
    
    public static SubLObject f19734() {
        SubLObject var56 = module0293.$g2675$.getGlobalValue();
        if (module0293.NIL == var56) {
            var56 = module0034.f1934((SubLObject)module0293.$ic10$, (SubLObject)module0293.$ic13$, (SubLObject)module0293.NIL, (SubLObject)module0293.EQ, (SubLObject)module0293.ZERO_INTEGER, (SubLObject)module0293.ZERO_INTEGER);
        }
        SubLObject var57 = module0034.f1810(var56, (SubLObject)module0293.UNPROVIDED);
        if (var57 == module0293.$ic14$) {
            var57 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19733()));
            module0034.f1812(var56, var57, (SubLObject)module0293.UNPROVIDED);
        }
        return module0034.f1959(var57);
    }
    
    public static SubLObject f19718(final SubLObject var1) {
        if (module0293.NIL != module0202.f12590(var1)) {
            final SubLObject var2 = module0205.f13136(var1);
            if (module0293.NIL != module0004.f104(var2, f19734(), (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED)) {
                return var2;
            }
        }
        return (SubLObject)module0293.NIL;
    }
    
    public static SubLObject f19729(final SubLObject var59, final SubLObject var60, final SubLObject var61, final SubLObject var2) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (module0293.NIL == Errors.$ignore_mustsP$.getDynamicValue(var62) && (module0293.NIL == module0035.f1997(var60) || module0293.NIL == module0204.f13044(var60.first()))) {
            Errors.error((SubLObject)module0293.$ic15$);
        }
        SubLObject var63 = (SubLObject)module0293.NIL;
        final SubLObject var64 = module0204.f13047(var60.first());
        if (module0293.NIL != module0035.f1997(var59)) {
            final SubLObject var65 = module0232.f15308(var59.first());
            final SubLObject var66 = module0232.f15306(var59.first());
            SubLObject var67 = var61;
            SubLObject var68 = (SubLObject)module0293.NIL;
            var68 = var67.first();
            while (module0293.NIL != var67) {
                SubLObject var69 = (SubLObject)module0293.NIL;
                SubLObject var70 = (SubLObject)module0293.NIL;
                SubLObject var40_69 = module0232.f15308(var68);
                SubLObject var71 = (SubLObject)module0293.NIL;
                var71 = var40_69.first();
                while (module0293.NIL != var40_69) {
                    if (var71.equal(var64)) {
                        if (module0293.NIL != var65) {
                            var69 = ConsesLow.append(var69, var65);
                        }
                    }
                    else {
                        var69 = (SubLObject)ConsesLow.cons(var71, var69);
                    }
                    var40_69 = var40_69.rest();
                    var71 = var40_69.first();
                }
                SubLObject var40_70 = module0232.f15306(var68);
                SubLObject var72 = (SubLObject)module0293.NIL;
                var72 = var40_70.first();
                while (module0293.NIL != var40_70) {
                    if (var72.equal(var64)) {
                        if (module0293.NIL != module0035.sublisp_boolean(var66)) {
                            var70 = ConsesLow.append(var70, var66);
                        }
                        else if (module0293.NIL != module0035.sublisp_boolean(var65)) {
                            var70 = ConsesLow.append(var70, var65);
                        }
                    }
                    else {
                        var70 = (SubLObject)ConsesLow.cons(var72, var70);
                    }
                    var40_70 = var40_70.rest();
                    var72 = var40_70.first();
                }
                if (module0293.NIL != var69 || module0293.NIL != var70) {
                    var63 = (SubLObject)ConsesLow.cons(module0232.f15326(Sequences.reverse(var70), Sequences.reverse(var69)), var63);
                }
                var67 = var67.rest();
                var68 = var67.first();
            }
        }
        else {
            SubLObject var73 = (SubLObject)module0293.NIL;
            if (module0293.NIL == var73) {
                SubLObject var74 = var61;
                SubLObject var75 = (SubLObject)module0293.NIL;
                var75 = var74.first();
                while (module0293.NIL == var73 && module0293.NIL != var74) {
                    SubLObject var76 = (SubLObject)module0293.NIL;
                    SubLObject var77 = (SubLObject)module0293.NIL;
                    SubLObject var78 = (SubLObject)module0293.NIL;
                    SubLObject var79 = (SubLObject)module0293.NIL;
                    SubLObject var80 = module0232.f15308(var75);
                    SubLObject var81 = (SubLObject)module0293.NIL;
                    var81 = var80.first();
                    while (module0293.NIL != var80) {
                        if (var81.equal(var64)) {
                            var78 = (SubLObject)module0293.T;
                        }
                        else {
                            var79 = (SubLObject)module0293.T;
                            var76 = (SubLObject)ConsesLow.cons(var81, var76);
                        }
                        var80 = var80.rest();
                        var81 = var80.first();
                    }
                    var80 = module0232.f15306(var75);
                    SubLObject var82 = (SubLObject)module0293.NIL;
                    var82 = var80.first();
                    while (module0293.NIL != var80) {
                        if (var82.equal(var64)) {
                            var78 = (SubLObject)module0293.T;
                        }
                        else {
                            var79 = (SubLObject)module0293.T;
                            var77 = (SubLObject)ConsesLow.cons(var82, var77);
                        }
                        var80 = var80.rest();
                        var82 = var80.first();
                    }
                    if (module0293.NIL != var78 && module0293.NIL != var79) {
                        var73 = (SubLObject)module0293.T;
                    }
                    if (module0293.NIL != var76 || module0293.NIL != var77) {
                        var63 = (SubLObject)ConsesLow.cons(module0232.f15326(Sequences.reverse(var77), Sequences.reverse(var76)), var63);
                    }
                    var74 = var74.rest();
                    var75 = var74.first();
                }
            }
            if (module0293.NIL == var73) {
                var63 = ConsesLow.append(var63, var59);
            }
            else {
                var63 = (SubLObject)module0293.NIL;
                final SubLObject var83 = f19723(var61, var2);
                final SubLObject var84 = f19723(var59, var2);
                final SubLObject var85 = module0205.f13250(var84, var64, var83, Symbols.symbol_function((SubLObject)module0293.EQUAL), (SubLObject)module0293.UNPROVIDED);
                var63 = f19735(var85, var2, (SubLObject)module0293.NIL, (SubLObject)module0293.$ic16$, (SubLObject)module0293.UNPROVIDED);
            }
        }
        return Sequences.reverse(var63);
    }
    
    public static SubLObject f19730(final SubLObject var54, final SubLObject var53, final SubLObject var1, final SubLObject var2) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)module0293.NIL;
        final SubLObject var57 = module0293.$g2676$.currentBinding(var55);
        final SubLObject var58 = module0293.$g2677$.currentBinding(var55);
        final SubLObject var59 = module0293.$g2678$.currentBinding(var55);
        try {
            module0293.$g2676$.bind(var2, var55);
            module0293.$g2677$.bind((module0293.NIL != module0232.f15323(var53)) ? var53 : f19728(var53, module0293.$g2676$.getDynamicValue(var55)), var55);
            module0293.$g2678$.bind(var54, var55);
            var56 = module0205.f13147(var1, (SubLObject)module0293.$ic17$, (SubLObject)module0293.$ic18$, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED);
        }
        finally {
            module0293.$g2678$.rebind(var59, var55);
            module0293.$g2677$.rebind(var58, var55);
            module0293.$g2676$.rebind(var57, var55);
        }
        return var56;
    }
    
    public static SubLObject f19736(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (var1.equal(module0293.$g2678$.getDynamicValue(var2))) {
            return (SubLObject)module0293.NIL;
        }
        final SubLObject var3 = f19728(var1, module0293.$g2676$.getDynamicValue(var2));
        if (module0293.NIL != module0232.f15323(var3) && module0293.NIL != module0232.f15323(module0293.$g2677$.getDynamicValue(var2))) {
            return conses_high.subsetp(module0293.$g2677$.getDynamicValue(var2), var3, Symbols.symbol_function((SubLObject)module0293.EQUAL), (SubLObject)module0293.UNPROVIDED);
        }
        return module0035.sublisp_boolean(module0205.f13220(module0293.$g2677$.getDynamicValue(var2), var3, (SubLObject)module0293.NIL, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED));
    }
    
    public static SubLObject f19737(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = f19728(var1, module0293.$g2676$.getDynamicValue(var2));
        final SubLObject var4 = (module0293.NIL != module0232.f15323(module0293.$g2677$.getDynamicValue(var2))) ? module0293.$g2677$.getDynamicValue(var2) : f19728(module0293.$g2677$.getDynamicValue(var2), module0293.$g2676$.getDynamicValue(var2));
        final SubLObject var5 = f19728(module0293.$g2678$.getDynamicValue(var2), module0293.$g2676$.getDynamicValue(var2));
        if (module0293.NIL != module0232.f15323(var5) && module0293.NIL != module0232.f15323(var4) && module0293.NIL != module0232.f15323(var3)) {
            return f19738(f19729(var5, var4, var3, module0293.$g2676$.getDynamicValue(var2)), module0293.$g2676$.getDynamicValue(var2));
        }
        return (SubLObject)module0293.NIL;
    }
    
    public static SubLObject f19722(final SubLObject var1, final SubLObject var39, final SubLObject var44) {
        return (SubLObject)ConsesLow.list(var1, var39, var44);
    }
    
    public static SubLObject f19725(final SubLObject var41) {
        return var41.first();
    }
    
    public static SubLObject f19726(final SubLObject var41) {
        return conses_high.second(var41);
    }
    
    public static SubLObject f19727(final SubLObject var41) {
        return conses_high.third(var41);
    }
    
    public static SubLObject f19714(final SubLObject var83, final SubLObject var84, SubLObject var85, SubLObject var86, SubLObject var87, SubLObject var88, SubLObject var89) {
        if (var85 == module0293.UNPROVIDED) {
            var85 = (SubLObject)module0293.NIL;
        }
        if (var86 == module0293.UNPROVIDED) {
            var86 = (SubLObject)module0293.NIL;
        }
        if (var87 == module0293.UNPROVIDED) {
            var87 = (SubLObject)module0293.NIL;
        }
        if (var88 == module0293.UNPROVIDED) {
            var88 = (SubLObject)module0293.NIL;
        }
        if (var89 == module0293.UNPROVIDED) {
            var89 = (SubLObject)module0293.NIL;
        }
        final SubLThread var90 = SubLProcess.currentSubLThread();
        if (module0293.$g2679$.getDynamicValue(var90).numGE(var83)) {
            Errors.warn(var84, new SubLObject[] { var85, var86, var87, var88, var89 });
        }
        return (SubLObject)module0293.NIL;
    }
    
    public static SubLObject f19739(final SubLObject var1, SubLObject var90, final SubLObject var15, final SubLObject var2, SubLObject var3, final SubLObject var28) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        SubLObject var92 = (SubLObject)module0293.NIL;
        SubLObject var93 = (SubLObject)module0293.NIL;
        final SubLObject var94 = module0291.f19643(var3);
        if (module0293.NIL != f19716(var1, var3)) {
            if (module0293.NIL != var94 && module0293.NIL != var28) {
                var3 = conses_high.remf(conses_high.copy_list(var3), (SubLObject)module0293.$ic20$);
                var91.resetMultipleValues();
                final SubLObject var92_93 = f19740(var1, var90, var15, var2, var3, var94);
                final SubLObject var94_95 = var91.secondMultipleValue();
                final SubLObject var96_97 = var91.thirdMultipleValue();
                var91.resetMultipleValues();
                var90 = var92_93;
                var92 = var94_95;
                var93 = var96_97;
            }
            else {
                var91.resetMultipleValues();
                final SubLObject var98_99 = f19741(var1, var15, var2, var3);
                final SubLObject var100_101 = var91.secondMultipleValue();
                var91.resetMultipleValues();
                var92 = var98_99;
                var93 = var100_101;
            }
        }
        if (module0293.NIL != var93) {
            return Values.values(var90, var92, var93);
        }
        if (module0293.NIL != module0202.f12590(var1) && module0293.NIL != var28) {
            return f19742(var1, var15, var2, var3);
        }
        return (SubLObject)module0293.NIL;
    }
    
    public static SubLObject f19720(final SubLObject var1, final SubLObject var90, final SubLObject var15, final SubLObject var2, final SubLObject var3, final SubLObject var28) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        final SubLObject var92 = module0034.$g879$.getDynamicValue(var91);
        SubLObject var93 = (SubLObject)module0293.NIL;
        if (module0293.NIL == var92) {
            return f19739(var1, var90, var15, var2, var3, var28);
        }
        var93 = module0034.f1857(var92, (SubLObject)module0293.$ic19$, (SubLObject)module0293.UNPROVIDED);
        if (module0293.NIL == var93) {
            var93 = module0034.f1807(module0034.f1842(var92), (SubLObject)module0293.$ic19$, (SubLObject)module0293.SIX_INTEGER, (SubLObject)module0293.$ic21$, (SubLObject)module0293.EQUAL, (SubLObject)module0293.UNPROVIDED);
            module0034.f1860(var92, (SubLObject)module0293.$ic19$, var93);
        }
        final SubLObject var94 = module0034.f1778(var1, var90, var15, var2, var3, var28);
        final SubLObject var95 = module0034.f1814(var93, var94, (SubLObject)module0293.UNPROVIDED);
        if (var95 != module0293.$ic14$) {
            SubLObject var96 = var95;
            SubLObject var97 = (SubLObject)module0293.NIL;
            var97 = var96.first();
            while (module0293.NIL != var96) {
                SubLObject var98 = var97.first();
                final SubLObject var99 = conses_high.second(var97);
                if (var1.equal(var98.first())) {
                    var98 = var98.rest();
                    if (var90.equal(var98.first())) {
                        var98 = var98.rest();
                        if (var15.equal(var98.first())) {
                            var98 = var98.rest();
                            if (var2.equal(var98.first())) {
                                var98 = var98.rest();
                                if (var3.equal(var98.first())) {
                                    var98 = var98.rest();
                                    if (module0293.NIL != var98 && module0293.NIL == var98.rest() && var28.equal(var98.first())) {
                                        return module0034.f1959(var99);
                                    }
                                }
                            }
                        }
                    }
                }
                var96 = var96.rest();
                var97 = var96.first();
            }
        }
        final SubLObject var100 = Values.arg2(var91.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19739(var1, var90, var15, var2, var3, var28)));
        module0034.f1836(var93, var94, var95, var100, (SubLObject)ConsesLow.list(var1, var90, var15, var2, var3, var28));
        return module0034.f1959(var100);
    }
    
    public static SubLObject f19740(final SubLObject var1, final SubLObject var90, final SubLObject var15, final SubLObject var2, final SubLObject var3, final SubLObject var91) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        SubLObject var93 = ConsesLow.append(var91, (SubLObject)ConsesLow.list((SubLObject)module0293.NIL));
        SubLObject var94 = (SubLObject)module0293.NIL;
        var94 = var93.first();
        while (module0293.NIL != var93) {
            final SubLObject var95 = conses_high.putf(conses_high.copy_list(var3), (SubLObject)module0293.$ic22$, var94);
            var92.resetMultipleValues();
            final SubLObject var96 = f19720(var1, var90, var15, var2, var95, (SubLObject)module0293.T);
            final SubLObject var97 = var92.secondMultipleValue();
            final SubLObject var98 = var92.thirdMultipleValue();
            var92.resetMultipleValues();
            if (module0293.NIL != var98) {
                return Values.values(var96, var97, var98);
            }
            var93 = var93.rest();
            var94 = var93.first();
        }
        return Values.values(var90, var1, (SubLObject)module0293.NIL);
    }
    
    public static SubLObject f19742(final SubLObject var1, final SubLObject var15, final SubLObject var2, final SubLObject var3) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0293.NIL != module0232.f15323(var1)) {
            if (module0293.NIL != module0035.f1997(var1) && module0293.NIL != module0232.f15312(var1.first())) {
                final SubLObject var17 = var1.first();
                if (module0293.NIL != module0204.f13048(var17)) {
                    final SubLObject var18 = module0204.f13033(module0204.f13054(var17));
                    var16.resetMultipleValues();
                    final SubLObject var19 = f19720(var18, var1, var15, var2, var3, (SubLObject)module0293.T);
                    final SubLObject var20 = var16.secondMultipleValue();
                    final SubLObject var21 = var16.thirdMultipleValue();
                    var16.resetMultipleValues();
                    if (module0293.NIL != var21) {
                        return Values.values(var19, var20, var21);
                    }
                }
                final SubLObject var22 = module0232.f15308(var17).first();
                final SubLObject var23 = module0232.f15306(var17).first();
                return f19742((module0293.NIL != var22) ? var22 : var23, var15, var2, var3);
            }
            SubLObject var24 = var1;
            SubLObject var25 = (SubLObject)module0293.NIL;
            var25 = var24.first();
            while (module0293.NIL != var24) {
                SubLObject var40_116 = module0232.f15308(var25);
                SubLObject var26 = (SubLObject)module0293.NIL;
                var26 = var40_116.first();
                while (module0293.NIL != var40_116) {
                    final SubLObject var27 = (SubLObject)ConsesLow.list(module0204.f13033(var26));
                    var16.resetMultipleValues();
                    final SubLObject var28 = f19720(var27, var27, var15, var2, var3, (SubLObject)module0293.T);
                    final SubLObject var29 = var16.secondMultipleValue();
                    final SubLObject var30 = var16.thirdMultipleValue();
                    var16.resetMultipleValues();
                    if (module0293.NIL != var30) {
                        return Values.values(var28, var29, var30);
                    }
                    var40_116 = var40_116.rest();
                    var26 = var40_116.first();
                }
                SubLObject var40_117 = module0232.f15306(var25);
                SubLObject var31 = (SubLObject)module0293.NIL;
                var31 = var40_117.first();
                while (module0293.NIL != var40_117) {
                    final SubLObject var27 = (SubLObject)ConsesLow.list(module0204.f13033(var31));
                    var16.resetMultipleValues();
                    final SubLObject var28 = f19720(var27, var27, var15, var2, var3, (SubLObject)module0293.T);
                    final SubLObject var29 = var16.secondMultipleValue();
                    final SubLObject var30 = var16.thirdMultipleValue();
                    var16.resetMultipleValues();
                    if (module0293.NIL != var30) {
                        return Values.values(var28, var29, var30);
                    }
                    var40_117 = var40_117.rest();
                    var31 = var40_117.first();
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        else {
            SubLObject var33;
            final SubLObject var32 = var33 = module0205.f13180(var1, (SubLObject)module0293.$ic23$);
            SubLObject var34 = (SubLObject)module0293.NIL;
            var34 = var33.first();
            while (module0293.NIL != var33) {
                var16.resetMultipleValues();
                final SubLObject var35 = f19743(var34, var15, var2, var3);
                final SubLObject var36 = var16.secondMultipleValue();
                final SubLObject var37 = var16.thirdMultipleValue();
                var16.resetMultipleValues();
                if (module0293.NIL != var37) {
                    return Values.values(var35, var36, var37);
                }
                var33 = var33.rest();
                var34 = var33.first();
            }
        }
        return Values.values(var1, (SubLObject)module0293.NIL, (SubLObject)module0293.NIL);
    }
    
    public static SubLObject f19743(final SubLObject var120, final SubLObject var15, final SubLObject var2, final SubLObject var3) {
        SubLObject var121 = var120;
        if (module0293.NIL != module0206.f13425(var120)) {
            var121 = f19719(var120, var2, (SubLObject)module0293.NIL, (SubLObject)module0293.$ic16$);
        }
        return f19720(var121, var120, var15, var2, var3, (SubLObject)module0293.T);
    }
    
    public static SubLObject f19741(final SubLObject var1, final SubLObject var15, final SubLObject var2, final SubLObject var3) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = var1;
        SubLObject var18 = (SubLObject)module0293.NIL;
        final SubLObject var19 = module0291.f19641(var3);
        final SubLObject var20 = module0291.f19642(var3);
        SubLObject var21 = (SubLObject)module0293.NIL;
        if (module0293.NIL != var19) {
            final SubLObject var22 = module0292.f19705(var19);
            if (module0293.NIL != module0292.f19707(var22, var1, var2, var3)) {
                var21 = (SubLObject)ConsesLow.list(reader.bq_cons(var22, (SubLObject)module0293.ZERO_INTEGER));
            }
            else {
                var21 = (SubLObject)module0293.NIL;
            }
        }
        else {
            SubLObject var23 = module0292.f19701();
            SubLObject var24 = (SubLObject)module0293.NIL;
            var24 = var23.first();
            while (module0293.NIL != var23) {
                final SubLObject var25 = var24;
                final SubLObject var26 = module0292.f19685(var25);
                if (module0293.NIL == module0004.f104(var26, var20, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED) && module0293.NIL == conses_high.member(var26, module0293.$g2680$.getGlobalValue(), (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED)) {
                    final SubLObject var27 = module0292.f19707(var25, var1, var2, var3);
                    if (module0293.NIL != var27) {
                        final SubLObject var28 = module0292.f19708(var25, var1, var2, var3);
                        var21 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var25, var28), var21);
                    }
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
        }
        var21 = Sort.sort(var21, Symbols.symbol_function((SubLObject)module0293.$ic25$), Symbols.symbol_function((SubLObject)module0293.$ic26$));
        if (module0293.NIL == var18) {
            SubLObject var29 = var21;
            SubLObject var30 = (SubLObject)module0293.NIL;
            var30 = var29.first();
            while (module0293.NIL == var18 && module0293.NIL != var29) {
                final SubLObject var25 = var30.first();
                var16.resetMultipleValues();
                final SubLObject var131_132 = module0292.f19709(var25, var1, var15, var2, var3);
                final SubLObject var133_134 = var16.secondMultipleValue();
                var16.resetMultipleValues();
                var17 = var131_132;
                var18 = var133_134;
                if (module0293.NIL != var18) {
                    if (module0293.T.eql(var18)) {
                        var18 = (SubLObject)ConsesLow.list(module0292.f19685(var25));
                    }
                    else if (var18.isCons()) {
                        var18 = (SubLObject)ConsesLow.cons(module0292.f19685(var25), var18);
                    }
                    else {
                        var18 = (SubLObject)ConsesLow.cons(module0292.f19685(var25), (SubLObject)ConsesLow.list(var18));
                    }
                }
                if (module0293.NIL != module0293.$g2674$.getDynamicValue(var16) && Time.get_internal_real_time().numG(module0293.$g2674$.getDynamicValue(var16))) {
                    var18 = (SubLObject)module0293.NIL;
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        return Values.values(var17, var18);
    }
    
    public static SubLObject f19744(final SubLObject var1, final SubLObject var2, final SubLObject var135, final SubLObject var29) {
        return f19735(var1, var2, var135, var29, (SubLObject)module0293.UNPROVIDED);
    }
    
    public static SubLObject f19719(final SubLObject var1, final SubLObject var2, final SubLObject var135, final SubLObject var29) {
        final SubLThread var136 = SubLProcess.currentSubLThread();
        final SubLObject var137 = module0034.$g879$.getDynamicValue(var136);
        SubLObject var138 = (SubLObject)module0293.NIL;
        if (module0293.NIL == var137) {
            return f19744(var1, var2, var135, var29);
        }
        var138 = module0034.f1857(var137, (SubLObject)module0293.$ic27$, (SubLObject)module0293.UNPROVIDED);
        if (module0293.NIL == var138) {
            var138 = module0034.f1807(module0034.f1842(var137), (SubLObject)module0293.$ic27$, (SubLObject)module0293.FOUR_INTEGER, (SubLObject)module0293.NIL, (SubLObject)module0293.EQUAL, (SubLObject)module0293.UNPROVIDED);
            module0034.f1860(var137, (SubLObject)module0293.$ic27$, var138);
        }
        final SubLObject var139 = module0034.f1780(var1, var2, var135, var29);
        final SubLObject var140 = module0034.f1814(var138, var139, (SubLObject)module0293.UNPROVIDED);
        if (var140 != module0293.$ic14$) {
            SubLObject var141 = var140;
            SubLObject var142 = (SubLObject)module0293.NIL;
            var142 = var141.first();
            while (module0293.NIL != var141) {
                SubLObject var143 = var142.first();
                final SubLObject var144 = conses_high.second(var142);
                if (var1.equal(var143.first())) {
                    var143 = var143.rest();
                    if (var2.equal(var143.first())) {
                        var143 = var143.rest();
                        if (var135.equal(var143.first())) {
                            var143 = var143.rest();
                            if (module0293.NIL != var143 && module0293.NIL == var143.rest() && var29.equal(var143.first())) {
                                return module0034.f1959(var144);
                            }
                        }
                    }
                }
                var141 = var141.rest();
                var142 = var141.first();
            }
        }
        final SubLObject var145 = Values.arg2(var136.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19744(var1, var2, var135, var29)));
        module0034.f1836(var138, var139, var140, var145, (SubLObject)ConsesLow.list(var1, var2, var135, var29));
        return module0034.f1959(var145);
    }
    
    public static SubLObject f19735(final SubLObject var1, final SubLObject var2, final SubLObject var135, SubLObject var29, SubLObject var136) {
        if (var29 == module0293.UNPROVIDED) {
            var29 = (SubLObject)module0293.NIL;
        }
        if (var136 == module0293.UNPROVIDED) {
            var136 = (SubLObject)module0293.NIL;
        }
        final SubLThread var137 = SubLProcess.currentSubLThread();
        SubLObject var138 = (SubLObject)module0293.NIL;
        final SubLObject var139 = module0146.$g2013$.currentBinding(var137);
        final SubLObject var140 = module0146.$g2016$.currentBinding(var137);
        final SubLObject var141 = module0146.$g2018$.currentBinding(var137);
        final SubLObject var142 = module0146.$g2075$.currentBinding(var137);
        final SubLObject var143 = module0146.$g2024$.currentBinding(var137);
        final SubLObject var144 = module0146.$g2057$.currentBinding(var137);
        final SubLObject var145 = module0146.$g2008$.currentBinding(var137);
        final SubLObject var146 = module0146.$g2009$.currentBinding(var137);
        final SubLObject var147 = module0146.$g2025$.currentBinding(var137);
        final SubLObject var148 = module0152.$g2109$.currentBinding(var137);
        try {
            module0146.$g2013$.bind((SubLObject)module0293.NIL, var137);
            module0146.$g2016$.bind((SubLObject)module0293.NIL, var137);
            module0146.$g2018$.bind((SubLObject)module0293.NIL, var137);
            module0146.$g2075$.bind((SubLObject)module0293.NIL, var137);
            module0146.$g2024$.bind((SubLObject)module0293.NIL, var137);
            module0146.$g2057$.bind((SubLObject)module0293.NIL, var137);
            module0146.$g2008$.bind((SubLObject)module0293.NIL, var137);
            module0146.$g2009$.bind((SubLObject)module0293.NIL, var137);
            module0146.$g2025$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0293.NIL == var135), var137);
            module0152.$g2109$.bind((SubLObject)module0293.NIL, var137);
            if (module0293.NIL != var29) {
                var138 = f19745(var1, var2, var29, var136);
            }
            else {
                var137.resetMultipleValues();
                final SubLObject var144_145 = f19746(var1, var2, var136);
                final SubLObject var146_147 = var137.secondMultipleValue();
                var137.resetMultipleValues();
                var138 = var144_145;
                var29 = var146_147;
            }
        }
        finally {
            module0152.$g2109$.rebind(var148, var137);
            module0146.$g2025$.rebind(var147, var137);
            module0146.$g2009$.rebind(var146, var137);
            module0146.$g2008$.rebind(var145, var137);
            module0146.$g2057$.rebind(var144, var137);
            module0146.$g2024$.rebind(var143, var137);
            module0146.$g2075$.rebind(var142, var137);
            module0146.$g2018$.rebind(var141, var137);
            module0146.$g2016$.rebind(var140, var137);
            module0146.$g2013$.rebind(var139, var137);
        }
        return Values.values(var138, var29);
    }
    
    public static SubLObject f19746(final SubLObject var1, final SubLObject var2, SubLObject var136) {
        if (var136 == module0293.UNPROVIDED) {
            var136 = (SubLObject)module0293.NIL;
        }
        final SubLObject var137 = (SubLObject)ConsesLow.list((SubLObject)module0293.$ic28$, (SubLObject)module0293.$ic29$, (SubLObject)module0293.$ic30$, (SubLObject)module0293.$ic16$);
        SubLObject var138 = (SubLObject)module0293.NIL;
        SubLObject var139 = (SubLObject)module0293.NIL;
        if (module0293.NIL == var138) {
            SubLObject var140 = var137;
            SubLObject var141 = (SubLObject)module0293.NIL;
            var141 = var140.first();
            while (module0293.NIL == var138 && module0293.NIL != var140) {
                var139 = f19745(var1, var2, var141, var136);
                if (module0293.NIL != var139) {
                    var138 = var141;
                }
                var140 = var140.rest();
                var141 = var140.first();
            }
        }
        return Values.values(var139, var138);
    }
    
    public static SubLObject f19745(final SubLObject var1, final SubLObject var2, final SubLObject var29, SubLObject var136) {
        if (var136 == module0293.UNPROVIDED) {
            var136 = (SubLObject)module0293.NIL;
        }
        final SubLThread var137 = SubLProcess.currentSubLThread();
        SubLObject var138 = (SubLObject)module0293.NIL;
        if (var29.eql((SubLObject)module0293.$ic16$)) {
            final SubLObject var139 = module0018.$g696$.currentBinding(var137);
            final SubLObject var140 = module0271.$g2562$.currentBinding(var137);
            final SubLObject var141 = module0144.$g1752$.currentBinding(var137);
            final SubLObject var142 = module0271.$g2560$.currentBinding(var137);
            final SubLObject var143 = module0271.$g2561$.currentBinding(var137);
            final SubLObject var144 = module0271.$g2563$.currentBinding(var137);
            final SubLObject var145 = module0146.$g2055$.currentBinding(var137);
            final SubLObject var146 = module0144.$g1771$.currentBinding(var137);
            final SubLObject var147 = module0144.$g1769$.currentBinding(var137);
            final SubLObject var148 = module0152.$g2107$.currentBinding(var137);
            final SubLObject var149 = module0110.$g1374$.currentBinding(var137);
            final SubLObject var150 = module0271.$g2564$.currentBinding(var137);
            final SubLObject var151 = module0206.$g2324$.currentBinding(var137);
            try {
                module0018.$g696$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2562$.bind((SubLObject)module0293.NIL, var137);
                module0144.$g1752$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2560$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2561$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2563$.bind((SubLObject)module0293.NIL, var137);
                module0146.$g2055$.bind((SubLObject)module0293.NIL, var137);
                module0144.$g1771$.bind((SubLObject)module0293.NIL, var137);
                module0144.$g1769$.bind((SubLObject)module0293.NIL, var137);
                module0152.$g2107$.bind((SubLObject)module0293.NIL, var137);
                module0110.$g1374$.bind((SubLObject)module0293.T, var137);
                module0271.$g2564$.bind((SubLObject)module0293.NIL, var137);
                module0206.$g2324$.bind((SubLObject)module0293.NIL, var137);
                var138 = f19747(var1, var2, var136);
            }
            finally {
                module0206.$g2324$.rebind(var151, var137);
                module0271.$g2564$.rebind(var150, var137);
                module0110.$g1374$.rebind(var149, var137);
                module0152.$g2107$.rebind(var148, var137);
                module0144.$g1769$.rebind(var147, var137);
                module0144.$g1771$.rebind(var146, var137);
                module0146.$g2055$.rebind(var145, var137);
                module0271.$g2563$.rebind(var144, var137);
                module0271.$g2561$.rebind(var143, var137);
                module0271.$g2560$.rebind(var142, var137);
                module0144.$g1752$.rebind(var141, var137);
                module0271.$g2562$.rebind(var140, var137);
                module0018.$g696$.rebind(var139, var137);
            }
        }
        else if (var29.eql((SubLObject)module0293.$ic30$)) {
            final SubLObject var139 = module0018.$g696$.currentBinding(var137);
            final SubLObject var140 = module0271.$g2562$.currentBinding(var137);
            final SubLObject var141 = module0144.$g1752$.currentBinding(var137);
            final SubLObject var142 = module0271.$g2560$.currentBinding(var137);
            final SubLObject var143 = module0271.$g2561$.currentBinding(var137);
            final SubLObject var144 = module0271.$g2563$.currentBinding(var137);
            final SubLObject var145 = module0146.$g2055$.currentBinding(var137);
            final SubLObject var146 = module0144.$g1771$.currentBinding(var137);
            final SubLObject var147 = module0144.$g1769$.currentBinding(var137);
            final SubLObject var148 = module0152.$g2107$.currentBinding(var137);
            final SubLObject var149 = module0110.$g1374$.currentBinding(var137);
            final SubLObject var150 = module0271.$g2564$.currentBinding(var137);
            try {
                module0018.$g696$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2562$.bind((SubLObject)module0293.NIL, var137);
                module0144.$g1752$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2560$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2561$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2563$.bind((SubLObject)module0293.NIL, var137);
                module0146.$g2055$.bind((SubLObject)module0293.NIL, var137);
                module0144.$g1771$.bind((SubLObject)module0293.NIL, var137);
                module0144.$g1769$.bind((SubLObject)module0293.NIL, var137);
                module0152.$g2107$.bind((SubLObject)module0293.NIL, var137);
                module0110.$g1374$.bind((SubLObject)module0293.T, var137);
                module0271.$g2564$.bind((SubLObject)module0293.NIL, var137);
                var138 = f19747(var1, var2, var136);
            }
            finally {
                module0271.$g2564$.rebind(var150, var137);
                module0110.$g1374$.rebind(var149, var137);
                module0152.$g2107$.rebind(var148, var137);
                module0144.$g1769$.rebind(var147, var137);
                module0144.$g1771$.rebind(var146, var137);
                module0146.$g2055$.rebind(var145, var137);
                module0271.$g2563$.rebind(var144, var137);
                module0271.$g2561$.rebind(var143, var137);
                module0271.$g2560$.rebind(var142, var137);
                module0144.$g1752$.rebind(var141, var137);
                module0271.$g2562$.rebind(var140, var137);
                module0018.$g696$.rebind(var139, var137);
            }
        }
        else if (var29.eql((SubLObject)module0293.$ic29$)) {
            final SubLObject var139 = module0018.$g696$.currentBinding(var137);
            final SubLObject var140 = module0271.$g2562$.currentBinding(var137);
            final SubLObject var141 = module0144.$g1752$.currentBinding(var137);
            final SubLObject var142 = module0271.$g2560$.currentBinding(var137);
            final SubLObject var143 = module0271.$g2561$.currentBinding(var137);
            final SubLObject var144 = module0271.$g2563$.currentBinding(var137);
            final SubLObject var145 = module0146.$g2055$.currentBinding(var137);
            final SubLObject var146 = module0144.$g1771$.currentBinding(var137);
            final SubLObject var147 = module0144.$g1769$.currentBinding(var137);
            final SubLObject var148 = module0152.$g2107$.currentBinding(var137);
            final SubLObject var149 = module0110.$g1374$.currentBinding(var137);
            try {
                module0018.$g696$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2562$.bind((SubLObject)module0293.NIL, var137);
                module0144.$g1752$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2560$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2561$.bind((SubLObject)module0293.NIL, var137);
                module0271.$g2563$.bind((SubLObject)module0293.NIL, var137);
                module0146.$g2055$.bind((SubLObject)module0293.NIL, var137);
                module0144.$g1771$.bind((SubLObject)module0293.NIL, var137);
                module0144.$g1769$.bind((SubLObject)module0293.NIL, var137);
                module0152.$g2107$.bind((SubLObject)module0293.NIL, var137);
                module0110.$g1374$.bind((SubLObject)module0293.T, var137);
                var138 = f19747(var1, var2, var136);
            }
            finally {
                module0110.$g1374$.rebind(var149, var137);
                module0152.$g2107$.rebind(var148, var137);
                module0144.$g1769$.rebind(var147, var137);
                module0144.$g1771$.rebind(var146, var137);
                module0146.$g2055$.rebind(var145, var137);
                module0271.$g2563$.rebind(var144, var137);
                module0271.$g2561$.rebind(var143, var137);
                module0271.$g2560$.rebind(var142, var137);
                module0144.$g1752$.rebind(var141, var137);
                module0271.$g2562$.rebind(var140, var137);
                module0018.$g696$.rebind(var139, var137);
            }
        }
        else if (var29.eql((SubLObject)module0293.$ic28$)) {
            final SubLObject var139 = module0146.$g1988$.currentBinding(var137);
            try {
                module0146.$g1988$.bind((SubLObject)module0293.T, var137);
                var138 = f19747(var1, var2, var136);
            }
            finally {
                module0146.$g1988$.rebind(var139, var137);
            }
        }
        return var138;
    }
    
    public static SubLObject f19747(final SubLObject var1, final SubLObject var2, SubLObject var136) {
        if (var136 == module0293.UNPROVIDED) {
            var136 = (SubLObject)module0293.NIL;
        }
        final SubLThread var137 = SubLProcess.currentSubLThread();
        SubLObject var138 = (SubLObject)module0293.NIL;
        SubLObject var139 = (SubLObject)module0293.NIL;
        SubLObject var140 = (SubLObject)module0293.NIL;
        if (module0293.NIL != var136) {
            if (module0293.NIL != module0260.f17091(var136, module0293.$ic31$, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED)) {
                var139 = module0285.f18875(var1, var2);
                var140 = (SubLObject)module0293.NIL;
            }
            else if (module0293.NIL != module0260.f17091(var136, module0293.$ic32$, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED)) {
                var139 = module0285.f18868(var1, var2);
                var140 = module0279.f18495(var139);
            }
            else {
                var137.resetMultipleValues();
                final SubLObject var155_156 = module0285.f18920(var1, var2, (SubLObject)module0293.UNPROVIDED);
                final SubLObject var157_158 = var137.secondMultipleValue();
                var137.resetMultipleValues();
                var139 = var155_156;
                var140 = var157_158;
            }
        }
        else {
            var137.resetMultipleValues();
            final SubLObject var159_160 = module0285.f18920(var1, var2, (SubLObject)module0293.UNPROVIDED);
            final SubLObject var161_162 = var137.secondMultipleValue();
            var137.resetMultipleValues();
            var139 = var159_160;
            var140 = var161_162;
        }
        if (module0293.NIL != var140) {
            var138 = module0285.f19028(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0293.$ic33$), var139));
        }
        else {
            var138 = var139;
        }
        return var138;
    }
    
    public static SubLObject f19728(final SubLObject var1, final SubLObject var2) {
        return f19719(f19723(var1, var2), var2, (SubLObject)module0293.NIL, (SubLObject)module0293.$ic16$);
    }
    
    public static SubLObject f19748(final SubLObject var1, final SubLObject var2) {
        return f19738(var1, var2);
    }
    
    public static SubLObject f19723(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0034.$g879$.getDynamicValue(var3);
        SubLObject var5 = (SubLObject)module0293.NIL;
        if (module0293.NIL == var4) {
            return f19748(var1, var2);
        }
        var5 = module0034.f1857(var4, (SubLObject)module0293.$ic34$, (SubLObject)module0293.UNPROVIDED);
        if (module0293.NIL == var5) {
            var5 = module0034.f1807(module0034.f1842(var4), (SubLObject)module0293.$ic34$, (SubLObject)module0293.TWO_INTEGER, (SubLObject)module0293.$ic21$, (SubLObject)module0293.EQUAL, (SubLObject)module0293.UNPROVIDED);
            module0034.f1860(var4, (SubLObject)module0293.$ic34$, var5);
        }
        final SubLObject var6 = module0034.f1782(var1, var2);
        final SubLObject var7 = module0034.f1814(var5, var6, (SubLObject)module0293.UNPROVIDED);
        if (var7 != module0293.$ic14$) {
            SubLObject var8 = var7;
            SubLObject var9 = (SubLObject)module0293.NIL;
            var9 = var8.first();
            while (module0293.NIL != var8) {
                SubLObject var10 = var9.first();
                final SubLObject var11 = conses_high.second(var9);
                if (var1.equal(var10.first())) {
                    var10 = var10.rest();
                    if (module0293.NIL != var10 && module0293.NIL == var10.rest() && var2.equal(var10.first())) {
                        return module0034.f1959(var11);
                    }
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        final SubLObject var12 = Values.arg2(var3.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f19748(var1, var2)));
        module0034.f1836(var5, var6, var7, var12, (SubLObject)ConsesLow.list(var1, var2));
        return module0034.f1959(var12);
    }
    
    public static SubLObject f19738(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0293.NIL;
        final SubLObject var5 = module0146.$g2013$.currentBinding(var3);
        final SubLObject var6 = module0146.$g2048$.currentBinding(var3);
        final SubLObject var7 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var8 = module0147.$g2095$.currentBinding(var3);
        try {
            module0146.$g2013$.bind((SubLObject)module0293.NIL, var3);
            module0146.$g2048$.bind((SubLObject)module0293.NIL, var3);
            module0147.$g2094$.bind((SubLObject)module0293.$ic35$, var3);
            module0147.$g2095$.bind(var2, var3);
            if (module0293.NIL != module0232.f15323(var1)) {
                var4 = module0289.f19419(var1, var2, (SubLObject)module0293.UNPROVIDED);
            }
            else {
                var4 = var1;
            }
            var4 = f19749(var4);
        }
        finally {
            module0147.$g2095$.rebind(var8, var3);
            module0147.$g2094$.rebind(var7, var3);
            module0146.$g2048$.rebind(var6, var3);
            module0146.$g2013$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f19749(final SubLObject var163) {
        if (module0293.NIL != module0205.f13145((SubLObject)module0293.$ic36$, var163, (SubLObject)module0293.NIL, (SubLObject)module0293.UNPROVIDED)) {
            return module0036.f2547(var163, (SubLObject)module0293.$ic36$, (SubLObject)module0293.$ic37$, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED);
        }
        return var163;
    }
    
    public static SubLObject f19750(final SubLObject var164, SubLObject var2) {
        if (var2 == module0293.UNPROVIDED) {
            var2 = (SubLObject)module0293.NIL;
        }
        final SubLThread var165 = SubLProcess.currentSubLThread();
        SubLObject var166 = (SubLObject)module0293.NIL;
        final SubLObject var167 = var2;
        final SubLObject var168 = module0147.$g2094$.currentBinding(var165);
        final SubLObject var169 = module0147.$g2095$.currentBinding(var165);
        try {
            module0147.$g2094$.bind(module0147.f9531(var167), var165);
            module0147.$g2095$.bind(module0147.f9534(var167), var165);
            var166 = (SubLObject)SubLObjectFactory.makeBoolean(module0293.NIL != module0202.f12590(var164) && module0293.NIL != f19751(module0205.f13132(var164), var2) && module0293.NIL != module0202.f12880(var164) && module0293.NIL != f19752(var164, var2));
        }
        finally {
            module0147.$g2095$.rebind(var169, var165);
            module0147.$g2094$.rebind(var168, var165);
        }
        return var166;
    }
    
    public static SubLObject f19751(final SubLObject var164, SubLObject var2) {
        if (var2 == module0293.UNPROVIDED) {
            var2 = (SubLObject)module0293.NIL;
        }
        if (module0293.NIL != module0173.f10955(var164)) {
            return module0220.f14548(var164, module0293.$ic38$, var2, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED);
        }
        return (SubLObject)module0293.NIL;
    }
    
    public static SubLObject f19752(final SubLObject var164, SubLObject var2) {
        if (var2 == module0293.UNPROVIDED) {
            var2 = (SubLObject)module0293.NIL;
        }
        final SubLThread var165 = SubLProcess.currentSubLThread();
        SubLObject var166 = (SubLObject)module0293.NIL;
        final SubLObject var167 = var2;
        final SubLObject var168 = module0147.$g2094$.currentBinding(var165);
        final SubLObject var169 = module0147.$g2095$.currentBinding(var165);
        try {
            module0147.$g2094$.bind(module0147.f9531(var167), var165);
            module0147.$g2095$.bind(module0147.f9534(var167), var165);
            var166 = (SubLObject)SubLObjectFactory.makeBoolean(module0293.NIL == module0205.f13145((SubLObject)module0293.$ic39$, var164, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var169, var165);
            module0147.$g2094$.rebind(var168, var165);
        }
        return var166;
    }
    
    public static SubLObject f19753(final SubLObject var164, SubLObject var2) {
        if (var2 == module0293.UNPROVIDED) {
            var2 = (SubLObject)module0293.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0293.NIL != module0202.f12590(var164) && module0293.NIL != module0229.f15238(var164) && module0293.NIL == f19751(module0205.f13132(var164), var2));
    }
    
    public static SubLObject f19754(final SubLObject var167) {
        final SubLObject var168 = module0295.f19834(var167);
        SubLObject var169 = (SubLObject)module0293.NIL;
        if (module0293.NIL != var168) {
            var169 = module0538.f33367(var168, (SubLObject)module0293.UNPROVIDED);
        }
        return var169;
    }
    
    public static SubLObject f19755(final SubLObject var170, final SubLObject var171) {
        return module0035.sublisp_boolean(Sequences.find(var171, module0295.f19816(var170), (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED, (SubLObject)module0293.UNPROVIDED));
    }
    
    public static SubLObject f19756(final SubLObject var167, final SubLObject var171) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0293.NIL != f19755(module0295.f19820(var167), var171) || module0293.NIL != f19755(module0295.f19821(var167), var171));
    }
    
    public static SubLObject f19757(final SubLObject var171) {
        if (module0293.NIL == module0291.f19546()) {
            return (SubLObject)module0293.NIL;
        }
        return ConsesLow.append(Hashtables.gethash(var171, module0295.f19837(), (SubLObject)module0293.UNPROVIDED), Hashtables.gethash(var171, module0295.f19838(), (SubLObject)module0293.UNPROVIDED), Hashtables.gethash(var171, module0295.f19836(), (SubLObject)module0293.UNPROVIDED));
    }
    
    public static SubLObject f19758() {
        if (module0293.NIL == module0291.f19546()) {
            return (SubLObject)module0293.NIL;
        }
        SubLObject var172 = (SubLObject)module0293.ZERO_INTEGER;
        SubLObject var173 = (SubLObject)module0293.ZERO_INTEGER;
        SubLObject var174 = (SubLObject)module0293.ZERO_INTEGER;
        SubLObject var175 = (SubLObject)module0293.ZERO_INTEGER;
        final SubLObject var176 = module0295.f19835();
        SubLObject var177 = (SubLObject)module0293.NIL;
        SubLObject var178 = (SubLObject)module0293.NIL;
        final Iterator var179 = Hashtables.getEntrySetIterator(var176);
        try {
            while (Hashtables.iteratorHasNext(var179)) {
                final Map.Entry var180 = Hashtables.iteratorNextEntry(var179);
                var177 = Hashtables.getEntryKey(var180);
                var178 = Hashtables.getEntryValue(var180);
                final SubLObject var182;
                final SubLObject var181 = var182 = module0295.f19823(var178);
                if (var182.eql((SubLObject)module0293.$ic28$)) {
                    var172 = Numbers.add(var172, (SubLObject)module0293.ONE_INTEGER);
                }
                else if (var182.eql((SubLObject)module0293.$ic29$)) {
                    var173 = Numbers.add(var173, (SubLObject)module0293.ONE_INTEGER);
                }
                else if (var182.eql((SubLObject)module0293.$ic30$)) {
                    var174 = Numbers.add(var174, (SubLObject)module0293.ONE_INTEGER);
                }
                else {
                    if (!var182.eql((SubLObject)module0293.$ic16$)) {
                        continue;
                    }
                    var175 = Numbers.add(var175, (SubLObject)module0293.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var179);
        }
        PrintLow.format((SubLObject)module0293.T, (SubLObject)module0293.$ic40$, new SubLObject[] { var172, var173, var174, var175 });
        return (SubLObject)module0293.NIL;
    }
    
    public static SubLObject f19759() {
        if (module0293.NIL == module0291.f19546()) {
            return (SubLObject)module0293.NIL;
        }
        SubLObject var181 = (SubLObject)module0293.ZERO_INTEGER;
        SubLObject var182 = (SubLObject)module0293.ZERO_INTEGER;
        final SubLObject var183 = module0295.f19835();
        SubLObject var184 = (SubLObject)module0293.NIL;
        SubLObject var185 = (SubLObject)module0293.NIL;
        final Iterator var186 = Hashtables.getEntrySetIterator(var183);
        try {
            while (Hashtables.iteratorHasNext(var186)) {
                final Map.Entry var187 = Hashtables.iteratorNextEntry(var186);
                var184 = Hashtables.getEntryKey(var187);
                var185 = Hashtables.getEntryValue(var187);
                var181 = Numbers.add(var181, (SubLObject)module0293.ONE_INTEGER);
                var182 = Numbers.add(var182, Sequences.length(module0295.f19863(var185)));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var186);
        }
        PrintLow.format((SubLObject)module0293.T, (SubLObject)module0293.$ic41$, Numbers.divide(var182, var181));
        return (SubLObject)module0293.NIL;
    }
    
    public static SubLObject f19760() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19713", "REFORMULATE-CYCL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19716", "S#22364", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19717", "S#22365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19715", "S#22366", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19724", "S#22367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19721", "S#22368", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19731", "S#22167", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19732", "S#22369", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19733", "S#22370", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19734", "S#22371", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19718", "S#22372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19729", "S#22373", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19730", "S#22374", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19736", "S#22375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19737", "S#22376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19722", "S#22377", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19725", "S#22378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19726", "S#22379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19727", "S#22380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19714", "S#22163", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19739", "S#22381", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19720", "S#22382", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19740", "S#22383", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19742", "S#22384", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19743", "S#22385", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19741", "S#22386", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19744", "S#22387", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19719", "S#22388", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19735", "S#22389", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19746", "S#22390", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19745", "S#22391", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19747", "S#22392", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19728", "S#22393", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19748", "S#22394", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19723", "S#22395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19738", "S#22396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19749", "S#22397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19750", "S#22398", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19751", "S#22399", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19752", "S#22400", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19753", "S#22401", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19754", "S#22402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19755", "S#22403", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19756", "S#22404", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19757", "S#22405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19758", "S#22406", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0293", "f19759", "S#22407", 0, 0, false);
        return (SubLObject)module0293.NIL;
    }
    
    public static SubLObject f19761() {
        module0293.$g2674$ = SubLFiles.defparameter("S#22408", (SubLObject)module0293.NIL);
        module0293.$g2675$ = SubLFiles.deflexical("S#22409", (SubLObject)module0293.NIL);
        module0293.$g2676$ = SubLFiles.defparameter("S#22410", module0132.$g1568$.getGlobalValue());
        module0293.$g2677$ = SubLFiles.defparameter("S#22411", (SubLObject)module0293.NIL);
        module0293.$g2678$ = SubLFiles.defparameter("S#22412", (SubLObject)module0293.NIL);
        module0293.$g2679$ = SubLFiles.defparameter("S#22413", (SubLObject)module0293.ONE_INTEGER);
        module0293.$g2680$ = SubLFiles.deflexical("S#22414", (SubLObject)module0293.$ic24$);
        return (SubLObject)module0293.NIL;
    }
    
    public static SubLObject f19762() {
        module0034.f1909((SubLObject)module0293.$ic10$);
        module0034.f1895((SubLObject)module0293.$ic19$);
        module0034.f1895((SubLObject)module0293.$ic27$);
        module0034.f1895((SubLObject)module0293.$ic34$);
        return (SubLObject)module0293.NIL;
    }
    
    public void declareFunctions() {
        f19760();
    }
    
    public void initializeVariables() {
        f19761();
    }
    
    public void runTopLevelForms() {
        f19762();
    }
    
    static {
        me = (SubLFile)new module0293();
        module0293.$g2674$ = null;
        module0293.$g2675$ = null;
        module0293.$g2676$ = null;
        module0293.$g2677$ = null;
        module0293.$g2678$ = null;
        module0293.$g2679$ = null;
        module0293.$g2680$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic1$ = SubLObjectFactory.makeString("The expression ~s contains an HL variable, and the CycL reformulator cannot handle it.");
        $ic2$ = SubLObjectFactory.makeString("reformulate-cycl cannot be called when the Cyc KB does not contain the knowledge necessary for reformulation.");
        $ic3$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic4$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic5$ = SubLObjectFactory.makeKeyword("UNLESS-REWRITE-OF");
        $ic6$ = SubLObjectFactory.makeSymbol("S#3044", "CYC");
        $ic7$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic8$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic9$ = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $ic10$ = SubLObjectFactory.makeSymbol("S#22371", "CYC");
        $ic11$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ModalOperator"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#22409", "CYC");
        $ic14$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic15$ = SubLObjectFactory.makeString("The reformulator currently cannot handle the n-conjuncts problem.");
        $ic16$ = SubLObjectFactory.makeKeyword("NONE");
        $ic17$ = SubLObjectFactory.makeSymbol("S#22375", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#22376", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#22382", "CYC");
        $ic20$ = SubLObjectFactory.makeKeyword("APPLY-FIRST-RECURSIVELY");
        $ic21$ = SubLObjectFactory.makeInteger(64);
        $ic22$ = SubLObjectFactory.makeKeyword("FOCUS");
        $ic23$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic24$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("WffViolationResolutionRLModule")));
        $ic25$ = SubLObjectFactory.makeSymbol("<");
        $ic26$ = SubLObjectFactory.makeSymbol("CDR");
        $ic27$ = SubLObjectFactory.makeSymbol("S#22388", "CYC");
        $ic28$ = SubLObjectFactory.makeKeyword("ALL");
        $ic29$ = SubLObjectFactory.makeKeyword("ARITY");
        $ic30$ = SubLObjectFactory.makeKeyword("KB");
        $ic31$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("reformulatorEquals"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("reformulatorEquiv"));
        $ic33$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic34$ = SubLObjectFactory.makeSymbol("S#22395", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#22398", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#21211", "CYC");
        $ic38$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("evaluateAtEL"));
        $ic39$ = SubLObjectFactory.makeSymbol("S#22401", "CYC");
        $ic40$ = SubLObjectFactory.makeString("All: ~s  Arity: ~s  KB: ~s  None: ~s~%");
        $ic41$ = SubLObjectFactory.makeString("Average number of FORTs mentioned in reformulator rules: ~s");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0293.class
	Total time: 433 ms
	
	Decompiled with Procyon 0.5.32.
*/