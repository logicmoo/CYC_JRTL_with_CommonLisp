package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0476 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0476";
    public static final String myFingerPrint = "f3d431569a171a5091e148c154a195c19149a283730b7476c6bd16ebed267e2c";
    private static SubLSymbol $g3690$;
    private static SubLSymbol $g3691$;
    private static SubLSymbol $g3692$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLFloat $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    
    public static SubLObject f31627(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        SubLObject var5;
        final SubLObject var4 = var5 = f31628(var1, var2, var3);
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic5$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return Values.values(var6, var7);
    }
    
    public static SubLObject f31628(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0131.$g1539$.getDynamicValue(var4) && NIL != var3) ? var3 : ConsesLow.list(f31629(var1, var2)));
    }
    
    public static SubLObject f31629(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0202.f12768($ic0$, var1, var2);
        return module0191.f11990((SubLObject)$ic6$, var3, module0132.$g1553$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31630(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLObject var12 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        if (NIL != f31631(var12, var13)) {
            final SubLObject var14 = f31629(var12, var13);
            module0347.f23330(var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31631(final SubLObject var1, final SubLObject var2) {
        return module0349.f23494(var2, var1, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f31632(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = module0147.f9540(var13);
        final SubLObject var17 = module0147.$g2095$.currentBinding(var12);
        final SubLObject var18 = module0147.$g2094$.currentBinding(var12);
        final SubLObject var19 = module0147.$g2096$.currentBinding(var12);
        try {
            module0147.$g2095$.bind(module0147.f9545(var16), var12);
            module0147.$g2094$.bind(module0147.f9546(var16), var12);
            module0147.$g2096$.bind(module0147.f9549(var16), var12);
            var15 = module0411.f28638(var14, (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var19, var12);
            module0147.$g2094$.rebind(var18, var12);
            module0147.$g2095$.rebind(var17, var12);
        }
        return var15;
    }
    
    public static SubLObject f31633(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLObject var12 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var14 = f31634(var12, var13);
        if (NIL != var14) {
            SubLObject var15 = var14;
            SubLObject var16 = (SubLObject)NIL;
            var16 = var15.first();
            while (NIL != var15) {
                final SubLObject var17 = module0233.f15361(var16, var13);
                final SubLObject var18 = f31629(var12, var17);
                module0347.f23330(var18, var16, (SubLObject)UNPROVIDED);
                var15 = var15.rest();
                var16 = var15.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31634(final SubLObject var1, final SubLObject var13) {
        return module0349.f23493(var13, var1, (SubLObject)$ic13$);
    }
    
    public static SubLObject f31635(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0205.f13379(var14, (SubLObject)UNPROVIDED);
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = module0147.f9540(var13);
        final SubLObject var18 = module0147.$g2095$.currentBinding(var12);
        final SubLObject var19 = module0147.$g2094$.currentBinding(var12);
        final SubLObject var20 = module0147.$g2096$.currentBinding(var12);
        try {
            module0147.$g2095$.bind(module0147.f9545(var17), var12);
            module0147.$g2094$.bind(module0147.f9546(var17), var12);
            module0147.$g2096$.bind(module0147.f9549(var17), var12);
            var16 = module0411.f28638(var15, (SubLObject)$ic14$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var20, var12);
            module0147.$g2094$.rebind(var19, var12);
            module0147.$g2095$.rebind(var18, var12);
        }
        return var16;
    }
    
    public static SubLObject f31636(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLObject var12 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0205.f13379(var13, (SubLObject)UNPROVIDED);
        final SubLObject var15 = f31637(var12, var14);
        if (NIL != var15) {
            SubLObject var16 = var15;
            SubLObject var17 = (SubLObject)NIL;
            var17 = var16.first();
            while (NIL != var16) {
                final SubLObject var18 = module0233.f15361(var17, var14);
                final SubLObject var19 = f31629(var12, module0205.f13338(var18));
                module0347.f23330(var19, var17, (SubLObject)UNPROVIDED);
                var16 = var16.rest();
                var17 = var16.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31637(final SubLObject var1, final SubLObject var13) {
        return module0349.f23493(var13, var1, (SubLObject)$ic17$);
    }
    
    public static SubLObject f31638(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        SubLObject var16;
        final SubLObject var15 = var16 = module0349.f23502(var14);
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            SubLObject var19;
            final SubLObject var18 = var19 = var17;
            SubLObject var20 = (SubLObject)NIL;
            SubLObject var21 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic18$);
            var20 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)$ic18$);
            var21 = var19.first();
            var19 = var19.rest();
            if (NIL == var19) {
                SubLObject var20_31 = var20;
                SubLObject var22 = (SubLObject)NIL;
                var22 = var20_31.first();
                while (NIL != var20_31) {
                    final SubLObject var23 = module0235.f15508(var13, var22, (SubLObject)UNPROVIDED);
                    if (NIL != var23) {
                        var12.resetMultipleValues();
                        final SubLObject var24 = f31627(var22, var14, var21);
                        final SubLObject var25 = var12.secondMultipleValue();
                        var12.resetMultipleValues();
                        module0347.f23330(var24, var23, var25);
                    }
                    var20_31 = var20_31.rest();
                    var22 = var20_31.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)$ic18$);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31639(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = module0147.$g2094$.currentBinding(var12);
        final SubLObject var15 = module0147.$g2095$.currentBinding(var12);
        try {
            module0147.$g2094$.bind((SubLObject)$ic21$, var12);
            module0147.$g2095$.bind($ic22$, var12);
            final SubLObject var16 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
            final SubLObject var17 = module0411.f28638(var16, (SubLObject)$ic10$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var18 = $g3691$.getDynamicValue(var12);
            var13 = Numbers.multiply(var17, var18);
        }
        finally {
            module0147.$g2095$.rebind(var15, var12);
            module0147.$g2094$.rebind(var14, var12);
        }
        return var13;
    }
    
    public static SubLObject f31640(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        SubLObject var16;
        final SubLObject var15 = var16 = f31634($ic23$, var14);
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            final SubLObject var18 = conses_high.sublis(var17, var14, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            SubLObject var20_39;
            final SubLObject var19 = var20_39 = module0349.f23502(var18);
            SubLObject var20 = (SubLObject)NIL;
            var20 = var20_39.first();
            while (NIL != var20_39) {
                SubLObject var22;
                final SubLObject var21 = var22 = var20;
                SubLObject var23 = (SubLObject)NIL;
                SubLObject var24 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic18$);
                var23 = var22.first();
                var22 = var22.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var22, var21, (SubLObject)$ic18$);
                var24 = var22.first();
                var22 = var22.rest();
                if (NIL == var22) {
                    SubLObject var20_40 = var23;
                    SubLObject var25 = (SubLObject)NIL;
                    var25 = var20_40.first();
                    while (NIL != var20_40) {
                        final SubLObject var26 = module0235.f15508(var13, var25, (SubLObject)UNPROVIDED);
                        if (NIL != var26 && NIL != var17) {
                            final SubLObject var27 = ConsesLow.append(var26, var17);
                            var12.resetMultipleValues();
                            final SubLObject var28 = f31627(var25, var18, var24);
                            final SubLObject var29 = var12.secondMultipleValue();
                            var12.resetMultipleValues();
                            module0347.f23330(var28, var27, var29);
                        }
                        var20_40 = var20_40.rest();
                        var25 = var20_40.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var21, (SubLObject)$ic18$);
                }
                var20_39 = var20_39.rest();
                var20 = var20_39.first();
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31641(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        return (SubLObject)((NIL != module0131.$g1539$.getDynamicValue(var45)) ? ConsesLow.list(var44) : ConsesLow.list(f31642(var44)));
    }
    
    public static SubLObject f31642(final SubLObject var44) {
        final SubLObject var45 = module0178.f11287(var44);
        final SubLObject var46 = module0289.f19396(var44);
        final SubLObject var47 = module0202.f12768($ic26$, var45, var46);
        return module0191.f11990((SubLObject)$ic6$, var47, module0132.$g1553$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31643(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        return f31644(var10);
    }
    
    public static SubLObject f31645(final SubLObject var1, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        final SubLObject var49 = module0202.f12826(var46);
        final SubLObject var50 = module0202.f12828(var46);
        final SubLObject var51 = module0147.$g2094$.currentBinding(var47);
        final SubLObject var52 = module0147.$g2095$.currentBinding(var47);
        try {
            module0147.$g2094$.bind((SubLObject)$ic27$, var47);
            module0147.$g2095$.bind(var1, var47);
            final SubLObject var53 = var49;
            SubLObject var54 = module0205.f13281(var53, Symbols.symbol_function((SubLObject)$ic32$), (SubLObject)T);
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                final SubLObject var56 = module0349.f23449(var55, var50);
                final SubLObject var58;
                final SubLObject var57 = var58 = module0158.f10294(var56);
                if (var58.eql((SubLObject)$ic28$)) {
                    var47.resetMultipleValues();
                    final SubLObject var59 = module0158.f10297(var56);
                    final SubLObject var60 = var47.secondMultipleValue();
                    final SubLObject var61 = var47.thirdMultipleValue();
                    var47.resetMultipleValues();
                    if (NIL != var60) {
                        if (NIL != var61) {
                            final SubLObject var62 = var61;
                            if (NIL != module0158.f10010(var59, var60, var62)) {
                                final SubLObject var63 = module0158.f10011(var59, var60, var62);
                                SubLObject var64 = (SubLObject)NIL;
                                final SubLObject var65 = (SubLObject)NIL;
                                while (NIL == var64) {
                                    final SubLObject var66 = module0052.f3695(var63, var65);
                                    final SubLObject var67 = (SubLObject)makeBoolean(!var65.eql(var66));
                                    if (NIL != var67) {
                                        SubLObject var68 = (SubLObject)NIL;
                                        try {
                                            var68 = module0158.f10316(var66, (SubLObject)$ic29$, module0130.f8518(var50), (SubLObject)NIL);
                                            SubLObject var60_65 = (SubLObject)NIL;
                                            final SubLObject var61_66 = (SubLObject)NIL;
                                            while (NIL == var60_65) {
                                                final SubLObject var69 = module0052.f3695(var68, var61_66);
                                                final SubLObject var63_67 = (SubLObject)makeBoolean(!var61_66.eql(var69));
                                                if (NIL != var63_67 && NIL != module0351.f23568(var69) && module0130.f8513(module0178.f11292(var69)).eql(var50)) {
                                                    var47.resetMultipleValues();
                                                    final SubLObject var70 = module0235.f15476(var55, module0178.f11285(var69), (SubLObject)T, (SubLObject)T);
                                                    final SubLObject var71 = var47.secondMultipleValue();
                                                    final SubLObject var72 = var47.thirdMultipleValue();
                                                    var47.resetMultipleValues();
                                                    if (NIL != var70) {
                                                        var48 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var70, var69), var48);
                                                    }
                                                }
                                                var60_65 = (SubLObject)makeBoolean(NIL == var63_67);
                                            }
                                        }
                                        finally {
                                            final SubLObject var16_70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                                if (NIL != var68) {
                                                    module0158.f10319(var68);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var16_70, var47);
                                            }
                                        }
                                    }
                                    var64 = (SubLObject)makeBoolean(NIL == var67);
                                }
                            }
                        }
                        else {
                            final SubLObject var62 = (SubLObject)NIL;
                            if (NIL != module0158.f10010(var59, var60, var62)) {
                                final SubLObject var63 = module0158.f10011(var59, var60, var62);
                                SubLObject var64 = (SubLObject)NIL;
                                final SubLObject var65 = (SubLObject)NIL;
                                while (NIL == var64) {
                                    final SubLObject var66 = module0052.f3695(var63, var65);
                                    final SubLObject var67 = (SubLObject)makeBoolean(!var65.eql(var66));
                                    if (NIL != var67) {
                                        SubLObject var68 = (SubLObject)NIL;
                                        try {
                                            var68 = module0158.f10316(var66, (SubLObject)$ic29$, module0130.f8518(var50), (SubLObject)NIL);
                                            SubLObject var60_66 = (SubLObject)NIL;
                                            final SubLObject var61_67 = (SubLObject)NIL;
                                            while (NIL == var60_66) {
                                                final SubLObject var69 = module0052.f3695(var68, var61_67);
                                                final SubLObject var63_68 = (SubLObject)makeBoolean(!var61_67.eql(var69));
                                                if (NIL != var63_68 && NIL != module0351.f23568(var69) && module0130.f8513(module0178.f11292(var69)).eql(var50)) {
                                                    var47.resetMultipleValues();
                                                    final SubLObject var70 = module0235.f15476(var55, module0178.f11285(var69), (SubLObject)T, (SubLObject)T);
                                                    final SubLObject var71 = var47.secondMultipleValue();
                                                    final SubLObject var72 = var47.thirdMultipleValue();
                                                    var47.resetMultipleValues();
                                                    if (NIL != var70) {
                                                        var48 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var70, var69), var48);
                                                    }
                                                }
                                                var60_66 = (SubLObject)makeBoolean(NIL == var63_68);
                                            }
                                        }
                                        finally {
                                            final SubLObject var16_71 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                                if (NIL != var68) {
                                                    module0158.f10319(var68);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var16_71, var47);
                                            }
                                        }
                                    }
                                    var64 = (SubLObject)makeBoolean(NIL == var67);
                                }
                            }
                        }
                    }
                    else if (NIL != var61) {
                        final SubLObject var62 = var61;
                        if (NIL != module0158.f10010(var59, (SubLObject)NIL, var62)) {
                            final SubLObject var63 = module0158.f10011(var59, (SubLObject)NIL, var62);
                            SubLObject var64 = (SubLObject)NIL;
                            final SubLObject var65 = (SubLObject)NIL;
                            while (NIL == var64) {
                                final SubLObject var66 = module0052.f3695(var63, var65);
                                final SubLObject var67 = (SubLObject)makeBoolean(!var65.eql(var66));
                                if (NIL != var67) {
                                    SubLObject var68 = (SubLObject)NIL;
                                    try {
                                        var68 = module0158.f10316(var66, (SubLObject)$ic29$, module0130.f8518(var50), (SubLObject)NIL);
                                        SubLObject var60_67 = (SubLObject)NIL;
                                        final SubLObject var61_68 = (SubLObject)NIL;
                                        while (NIL == var60_67) {
                                            final SubLObject var69 = module0052.f3695(var68, var61_68);
                                            final SubLObject var63_69 = (SubLObject)makeBoolean(!var61_68.eql(var69));
                                            if (NIL != var63_69 && NIL != module0351.f23568(var69) && module0130.f8513(module0178.f11292(var69)).eql(var50)) {
                                                var47.resetMultipleValues();
                                                final SubLObject var70 = module0235.f15476(var55, module0178.f11285(var69), (SubLObject)T, (SubLObject)T);
                                                final SubLObject var71 = var47.secondMultipleValue();
                                                final SubLObject var72 = var47.thirdMultipleValue();
                                                var47.resetMultipleValues();
                                                if (NIL != var70) {
                                                    var48 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var70, var69), var48);
                                                }
                                            }
                                            var60_67 = (SubLObject)makeBoolean(NIL == var63_69);
                                        }
                                    }
                                    finally {
                                        final SubLObject var16_72 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                            if (NIL != var68) {
                                                module0158.f10319(var68);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var16_72, var47);
                                        }
                                    }
                                }
                                var64 = (SubLObject)makeBoolean(NIL == var67);
                            }
                        }
                    }
                    else {
                        final SubLObject var62 = (SubLObject)NIL;
                        if (NIL != module0158.f10010(var59, (SubLObject)NIL, var62)) {
                            final SubLObject var63 = module0158.f10011(var59, (SubLObject)NIL, var62);
                            SubLObject var64 = (SubLObject)NIL;
                            final SubLObject var65 = (SubLObject)NIL;
                            while (NIL == var64) {
                                final SubLObject var66 = module0052.f3695(var63, var65);
                                final SubLObject var67 = (SubLObject)makeBoolean(!var65.eql(var66));
                                if (NIL != var67) {
                                    SubLObject var68 = (SubLObject)NIL;
                                    try {
                                        var68 = module0158.f10316(var66, (SubLObject)$ic29$, module0130.f8518(var50), (SubLObject)NIL);
                                        SubLObject var60_68 = (SubLObject)NIL;
                                        final SubLObject var61_69 = (SubLObject)NIL;
                                        while (NIL == var60_68) {
                                            final SubLObject var69 = module0052.f3695(var68, var61_69);
                                            final SubLObject var63_70 = (SubLObject)makeBoolean(!var61_69.eql(var69));
                                            if (NIL != var63_70 && NIL != module0351.f23568(var69) && module0130.f8513(module0178.f11292(var69)).eql(var50)) {
                                                var47.resetMultipleValues();
                                                final SubLObject var70 = module0235.f15476(var55, module0178.f11285(var69), (SubLObject)T, (SubLObject)T);
                                                final SubLObject var71 = var47.secondMultipleValue();
                                                final SubLObject var72 = var47.thirdMultipleValue();
                                                var47.resetMultipleValues();
                                                if (NIL != var70) {
                                                    var48 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var70, var69), var48);
                                                }
                                            }
                                            var60_68 = (SubLObject)makeBoolean(NIL == var63_70);
                                        }
                                    }
                                    finally {
                                        final SubLObject var16_73 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                            if (NIL != var68) {
                                                module0158.f10319(var68);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var16_73, var47);
                                        }
                                    }
                                }
                                var64 = (SubLObject)makeBoolean(NIL == var67);
                            }
                        }
                    }
                }
                else if (var58.eql((SubLObject)$ic30$)) {
                    final SubLObject var73 = module0158.f10299(var56);
                    if (NIL != module0158.f10038(var73)) {
                        final SubLObject var74 = (SubLObject)NIL;
                        final SubLObject var16_74 = module0012.$g73$.currentBinding(var47);
                        final SubLObject var17_86 = module0012.$g65$.currentBinding(var47);
                        final SubLObject var75 = module0012.$g67$.currentBinding(var47);
                        final SubLObject var76 = module0012.$g68$.currentBinding(var47);
                        final SubLObject var77 = module0012.$g66$.currentBinding(var47);
                        final SubLObject var78 = module0012.$g69$.currentBinding(var47);
                        final SubLObject var79 = module0012.$g70$.currentBinding(var47);
                        final SubLObject var80 = module0012.$silent_progressP$.currentBinding(var47);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var47);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var47), var47);
                            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var47);
                            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var47);
                            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var47);
                            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var47);
                            module0012.$g70$.bind((SubLObject)T, var47);
                            module0012.$silent_progressP$.bind((SubLObject)((NIL != var74) ? module0012.$silent_progressP$.getDynamicValue(var47) : T), var47);
                            module0012.f474(var74);
                            final SubLObject var81 = module0158.f10039(var73);
                            SubLObject var82 = (SubLObject)NIL;
                            final SubLObject var83 = (SubLObject)NIL;
                            while (NIL == var82) {
                                final SubLObject var84 = module0052.f3695(var81, var83);
                                final SubLObject var85 = (SubLObject)makeBoolean(!var83.eql(var84));
                                if (NIL != var85) {
                                    module0012.f476();
                                    SubLObject var86 = (SubLObject)NIL;
                                    try {
                                        var86 = module0158.f10316(var84, (SubLObject)$ic29$, module0130.f8518(var50), (SubLObject)NIL);
                                        SubLObject var60_69 = (SubLObject)NIL;
                                        final SubLObject var61_70 = (SubLObject)NIL;
                                        while (NIL == var60_69) {
                                            final SubLObject var87 = module0052.f3695(var86, var61_70);
                                            final SubLObject var63_71 = (SubLObject)makeBoolean(!var61_70.eql(var87));
                                            if (NIL != var63_71 && NIL != module0351.f23568(var87) && module0130.f8513(module0178.f11292(var87)).eql(var50)) {
                                                var47.resetMultipleValues();
                                                final SubLObject var88 = module0235.f15476(var55, module0178.f11285(var87), (SubLObject)T, (SubLObject)T);
                                                final SubLObject var89 = var47.secondMultipleValue();
                                                final SubLObject var90 = var47.thirdMultipleValue();
                                                var47.resetMultipleValues();
                                                if (NIL != var88) {
                                                    var48 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var88, var87), var48);
                                                }
                                            }
                                            var60_69 = (SubLObject)makeBoolean(NIL == var63_71);
                                        }
                                    }
                                    finally {
                                        final SubLObject var16_75 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                                            if (NIL != var86) {
                                                module0158.f10319(var86);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var16_75, var47);
                                        }
                                    }
                                }
                                var82 = (SubLObject)makeBoolean(NIL == var85);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var80, var47);
                            module0012.$g70$.rebind(var79, var47);
                            module0012.$g69$.rebind(var78, var47);
                            module0012.$g66$.rebind(var77, var47);
                            module0012.$g68$.rebind(var76, var47);
                            module0012.$g67$.rebind(var75, var47);
                            module0012.$g65$.rebind(var17_86, var47);
                            module0012.$g73$.rebind(var16_74, var47);
                        }
                    }
                }
                else if (var58.eql((SubLObject)$ic31$)) {
                    SubLObject var20_97 = module0218.f14453(module0158.f10301(var56), (SubLObject)UNPROVIDED);
                    SubLObject var91 = (SubLObject)NIL;
                    var91 = var20_97.first();
                    while (NIL != var20_97) {
                        if ((NIL == module0130.f8518(var50) || NIL != module0178.f11343(var91, module0130.f8518(var50))) && NIL != module0351.f23568(var91) && module0130.f8513(module0178.f11292(var91)).eql(var50)) {
                            var47.resetMultipleValues();
                            final SubLObject var92 = module0235.f15476(var55, module0178.f11285(var91), (SubLObject)T, (SubLObject)T);
                            final SubLObject var93 = var47.secondMultipleValue();
                            final SubLObject var94 = var47.thirdMultipleValue();
                            var47.resetMultipleValues();
                            if (NIL != var92) {
                                var48 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var92, var91), var48);
                            }
                        }
                        var20_97 = var20_97.rest();
                        var91 = var20_97.first();
                    }
                }
                else {
                    module0158.f10295(var56, var57);
                }
                var54 = var54.rest();
                var55 = var54.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var52, var47);
            module0147.$g2094$.rebind(var51, var47);
        }
        if (NIL != var48) {
            return module0052.f3709(var48);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31646(final SubLObject var98) {
        return (SubLObject)makeBoolean(!var98.eql($ic33$) && NIL != module0173.f10955(var98));
    }
    
    public static SubLObject f31644(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0202.f12826(var13);
        final SubLObject var15 = module0202.f12828(var13);
        SubLObject var16 = (SubLObject)ZERO_INTEGER;
        final SubLObject var17 = module0147.$g2094$.currentBinding(var11);
        final SubLObject var18 = module0147.$g2095$.currentBinding(var11);
        try {
            module0147.$g2094$.bind((SubLObject)$ic27$, var11);
            module0147.$g2095$.bind(var12, var11);
            final SubLObject var19 = var14;
            SubLObject var20 = module0205.f13281(var19, Symbols.symbol_function((SubLObject)$ic32$), (SubLObject)T);
            SubLObject var21 = (SubLObject)NIL;
            var21 = var20.first();
            while (NIL != var20) {
                var16 = Numbers.add(var16, module0349.f23453(var12, var21, var15));
                var20 = var20.rest();
                var21 = var20.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var18, var11);
            module0147.$g2094$.rebind(var17, var11);
        }
        return var16;
    }
    
    public static SubLObject f31647(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLObject var12 = module0202.f12826(module0205.f13388(var10, (SubLObject)UNPROVIDED));
        return Sequences.find_if(Symbols.symbol_function((SubLObject)$ic36$), module0205.f13385(var12, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31648(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        return f31644(var10);
    }
    
    public static SubLObject f31649(final SubLObject var1, final SubLObject var46) {
        return f31645(var1, var46);
    }
    
    public static SubLObject f31650(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLObject var12 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0202.f12826(module0205.f13388(var10, (SubLObject)UNPROVIDED));
        return (SubLObject)makeBoolean(NIL == module0217.f14342(module0161.f10557(var12)) && NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic36$), var13, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f31651(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLObject var12 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        return module0217.f14336(var12);
    }
    
    public static SubLObject f31652(final SubLObject var1, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        SubLObject var48 = (SubLObject)NIL;
        final SubLObject var49 = module0158.f10289(var1);
        if (var49.eql((SubLObject)$ic39$)) {
            if (NIL != module0158.f10270(var1, (SubLObject)$ic29$)) {
                final SubLObject var50 = module0158.f10271(var1);
                SubLObject var51 = (SubLObject)NIL;
                try {
                    var51 = module0158.f10316(var50, (SubLObject)$ic29$, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var52 = (SubLObject)NIL;
                    final SubLObject var53 = (SubLObject)NIL;
                    while (NIL == var52) {
                        final SubLObject var54 = module0052.f3695(var51, var53);
                        final SubLObject var55 = (SubLObject)makeBoolean(!var53.eql(var54));
                        if (NIL != var55 && NIL != module0351.f23568(var54)) {
                            final SubLObject var56 = module0178.f11304(var54);
                            var47.resetMultipleValues();
                            final SubLObject var57 = module0235.f15474(var46, var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            final SubLObject var58 = var47.secondMultipleValue();
                            var47.resetMultipleValues();
                            if (NIL != var57) {
                                var48 = (SubLObject)ConsesLow.cons(var54, var48);
                            }
                        }
                        var52 = (SubLObject)makeBoolean(NIL == var55);
                    }
                }
                finally {
                    final SubLObject var59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var47);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var47);
                        if (NIL != var51) {
                            module0158.f10319(var51);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var59, var47);
                    }
                }
            }
        }
        else if (var49.eql((SubLObject)$ic40$) && NIL != module0158.f10286(var1, (SubLObject)$ic29$)) {
            final SubLObject var60 = assertion_handles_oc.f11010();
            final SubLObject var61 = (SubLObject)$ic41$;
            final SubLObject var62 = module0065.f4733(var60);
            SubLObject var63 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var61) : var61;
            final SubLObject var64 = module0012.$g75$.currentBinding(var47);
            final SubLObject var65 = module0012.$g76$.currentBinding(var47);
            final SubLObject var66 = module0012.$g77$.currentBinding(var47);
            final SubLObject var67 = module0012.$g78$.currentBinding(var47);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var47);
                module0012.$g76$.bind((SubLObject)NIL, var47);
                module0012.$g77$.bind((SubLObject)T, var47);
                module0012.$g78$.bind(Time.get_universal_time(), var47);
                module0012.f478(var61);
                final SubLObject var107_108 = var60;
                if (NIL == module0065.f4772(var107_108, (SubLObject)$ic43$)) {
                    final SubLObject var109_110 = var107_108;
                    if (NIL == module0065.f4775(var109_110, (SubLObject)$ic43$)) {
                        final SubLObject var68 = module0065.f4740(var109_110);
                        final SubLObject var69 = (SubLObject)NIL;
                        SubLObject var70;
                        SubLObject var71;
                        SubLObject var72;
                        SubLObject var73;
                        SubLObject var74;
                        SubLObject var75;
                        SubLObject var76;
                        for (var70 = Sequences.length(var68), var71 = (SubLObject)NIL, var71 = (SubLObject)ZERO_INTEGER; var71.numL(var70); var71 = Numbers.add(var71, (SubLObject)ONE_INTEGER)) {
                            var72 = ((NIL != var69) ? Numbers.subtract(var70, var71, (SubLObject)ONE_INTEGER) : var71);
                            var73 = Vectors.aref(var68, var72);
                            if (NIL == module0065.f4749(var73) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                                if (NIL != module0065.f4749(var73)) {
                                    var73 = (SubLObject)$ic43$;
                                }
                                module0012.note_percent_progress(var63, var62);
                                var63 = Numbers.add(var63, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var73, var1, (SubLObject)$ic29$, (SubLObject)NIL) && NIL != module0351.f23568(var73)) {
                                    var74 = module0178.f11304(var73);
                                    var47.resetMultipleValues();
                                    var75 = module0235.f15474(var46, var74, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    var76 = var47.secondMultipleValue();
                                    var47.resetMultipleValues();
                                    if (NIL != var75) {
                                        var48 = (SubLObject)ConsesLow.cons(var73, var48);
                                    }
                                }
                            }
                        }
                    }
                    final SubLObject var116_117 = var107_108;
                    if (NIL == module0065.f4777(var116_117) || NIL == module0065.f4773((SubLObject)$ic43$)) {
                        final SubLObject var77 = module0065.f4738(var116_117);
                        SubLObject var78 = module0065.f4739(var116_117);
                        final SubLObject var79 = module0065.f4734(var116_117);
                        final SubLObject var80 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic43$)) ? NIL : $ic43$);
                        while (var78.numL(var79)) {
                            final SubLObject var81 = Hashtables.gethash_without_values(var78, var77, var80);
                            if (NIL == module0065.f4773((SubLObject)$ic43$) || NIL == module0065.f4749(var81)) {
                                module0012.note_percent_progress(var63, var62);
                                var63 = Numbers.add(var63, (SubLObject)ONE_INTEGER);
                                if (NIL != module0158.f10287(var81, var1, (SubLObject)$ic29$, (SubLObject)NIL) && NIL != module0351.f23568(var81)) {
                                    final SubLObject var82 = module0178.f11304(var81);
                                    var47.resetMultipleValues();
                                    final SubLObject var83 = module0235.f15474(var46, var82, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    final SubLObject var84 = var47.secondMultipleValue();
                                    var47.resetMultipleValues();
                                    if (NIL != var83) {
                                        var48 = (SubLObject)ConsesLow.cons(var81, var48);
                                    }
                                }
                            }
                            var78 = Numbers.add(var78, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var67, var47);
                module0012.$g77$.rebind(var66, var47);
                module0012.$g76$.rebind(var65, var47);
                module0012.$g75$.rebind(var64, var47);
            }
        }
        if (NIL != var48) {
            return module0052.f3709(var48);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31653(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        return Numbers.subtract((SubLObject)ONE_INTEGER, Numbers.min((SubLObject)ONE_INTEGER, f31644(var10)));
    }
    
    public static SubLObject f31654(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0202.f12826(var14);
        final SubLObject var16 = module0202.f12828(var14);
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = module0147.$g2094$.currentBinding(var12);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var12);
        try {
            module0147.$g2094$.bind((SubLObject)$ic27$, var12);
            module0147.$g2095$.bind(var13, var12);
            final SubLObject var20 = var15;
            SubLObject var21 = module0205.f13281(var20, Symbols.symbol_function((SubLObject)$ic32$), (SubLObject)T);
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                final SubLObject var23 = module0349.f23449(var22, var16);
                final SubLObject var25;
                final SubLObject var24 = var25 = module0158.f10294(var23);
                if (var25.eql((SubLObject)$ic28$)) {
                    var12.resetMultipleValues();
                    final SubLObject var26 = module0158.f10297(var23);
                    final SubLObject var27 = var12.secondMultipleValue();
                    final SubLObject var28 = var12.thirdMultipleValue();
                    var12.resetMultipleValues();
                    if (NIL != var27) {
                        if (NIL != var28) {
                            final SubLObject var29 = var28;
                            if (NIL != module0158.f10010(var26, var27, var29)) {
                                final SubLObject var30 = module0158.f10011(var26, var27, var29);
                                SubLObject var31 = var17;
                                final SubLObject var32 = (SubLObject)NIL;
                                while (NIL == var31) {
                                    final SubLObject var33 = module0052.f3695(var30, var32);
                                    final SubLObject var34 = (SubLObject)makeBoolean(!var32.eql(var33));
                                    if (NIL != var34) {
                                        SubLObject var35 = (SubLObject)NIL;
                                        try {
                                            var35 = module0158.f10316(var33, (SubLObject)$ic29$, module0130.f8518(var16), (SubLObject)NIL);
                                            SubLObject var60_122 = var17;
                                            final SubLObject var61_123 = (SubLObject)NIL;
                                            while (NIL == var60_122) {
                                                final SubLObject var36 = module0052.f3695(var35, var61_123);
                                                final SubLObject var63_124 = (SubLObject)makeBoolean(!var61_123.eql(var36));
                                                if (NIL != var63_124) {
                                                    var17 = f31655(var36, var22);
                                                }
                                                var60_122 = (SubLObject)makeBoolean(NIL == var63_124 || NIL != var17);
                                            }
                                        }
                                        finally {
                                            final SubLObject var16_125 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var12);
                                                if (NIL != var35) {
                                                    module0158.f10319(var35);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var16_125, var12);
                                            }
                                        }
                                    }
                                    var31 = (SubLObject)makeBoolean(NIL == var34 || NIL != var17);
                                }
                            }
                        }
                        else {
                            final SubLObject var29 = (SubLObject)NIL;
                            if (NIL != module0158.f10010(var26, var27, var29)) {
                                final SubLObject var30 = module0158.f10011(var26, var27, var29);
                                SubLObject var31 = var17;
                                final SubLObject var32 = (SubLObject)NIL;
                                while (NIL == var31) {
                                    final SubLObject var33 = module0052.f3695(var30, var32);
                                    final SubLObject var34 = (SubLObject)makeBoolean(!var32.eql(var33));
                                    if (NIL != var34) {
                                        SubLObject var35 = (SubLObject)NIL;
                                        try {
                                            var35 = module0158.f10316(var33, (SubLObject)$ic29$, module0130.f8518(var16), (SubLObject)NIL);
                                            SubLObject var60_123 = var17;
                                            final SubLObject var61_124 = (SubLObject)NIL;
                                            while (NIL == var60_123) {
                                                final SubLObject var36 = module0052.f3695(var35, var61_124);
                                                final SubLObject var63_125 = (SubLObject)makeBoolean(!var61_124.eql(var36));
                                                if (NIL != var63_125) {
                                                    var17 = f31655(var36, var22);
                                                }
                                                var60_123 = (SubLObject)makeBoolean(NIL == var63_125 || NIL != var17);
                                            }
                                        }
                                        finally {
                                            final SubLObject var16_126 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var12);
                                                if (NIL != var35) {
                                                    module0158.f10319(var35);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var16_126, var12);
                                            }
                                        }
                                    }
                                    var31 = (SubLObject)makeBoolean(NIL == var34 || NIL != var17);
                                }
                            }
                        }
                    }
                    else if (NIL != var28) {
                        final SubLObject var29 = var28;
                        if (NIL != module0158.f10010(var26, (SubLObject)NIL, var29)) {
                            final SubLObject var30 = module0158.f10011(var26, (SubLObject)NIL, var29);
                            SubLObject var31 = var17;
                            final SubLObject var32 = (SubLObject)NIL;
                            while (NIL == var31) {
                                final SubLObject var33 = module0052.f3695(var30, var32);
                                final SubLObject var34 = (SubLObject)makeBoolean(!var32.eql(var33));
                                if (NIL != var34) {
                                    SubLObject var35 = (SubLObject)NIL;
                                    try {
                                        var35 = module0158.f10316(var33, (SubLObject)$ic29$, module0130.f8518(var16), (SubLObject)NIL);
                                        SubLObject var60_124 = var17;
                                        final SubLObject var61_125 = (SubLObject)NIL;
                                        while (NIL == var60_124) {
                                            final SubLObject var36 = module0052.f3695(var35, var61_125);
                                            final SubLObject var63_126 = (SubLObject)makeBoolean(!var61_125.eql(var36));
                                            if (NIL != var63_126) {
                                                var17 = f31655(var36, var22);
                                            }
                                            var60_124 = (SubLObject)makeBoolean(NIL == var63_126 || NIL != var17);
                                        }
                                    }
                                    finally {
                                        final SubLObject var16_127 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var12);
                                            if (NIL != var35) {
                                                module0158.f10319(var35);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var16_127, var12);
                                        }
                                    }
                                }
                                var31 = (SubLObject)makeBoolean(NIL == var34 || NIL != var17);
                            }
                        }
                    }
                    else {
                        final SubLObject var29 = (SubLObject)NIL;
                        if (NIL != module0158.f10010(var26, (SubLObject)NIL, var29)) {
                            final SubLObject var30 = module0158.f10011(var26, (SubLObject)NIL, var29);
                            SubLObject var31 = var17;
                            final SubLObject var32 = (SubLObject)NIL;
                            while (NIL == var31) {
                                final SubLObject var33 = module0052.f3695(var30, var32);
                                final SubLObject var34 = (SubLObject)makeBoolean(!var32.eql(var33));
                                if (NIL != var34) {
                                    SubLObject var35 = (SubLObject)NIL;
                                    try {
                                        var35 = module0158.f10316(var33, (SubLObject)$ic29$, module0130.f8518(var16), (SubLObject)NIL);
                                        SubLObject var60_125 = var17;
                                        final SubLObject var61_126 = (SubLObject)NIL;
                                        while (NIL == var60_125) {
                                            final SubLObject var36 = module0052.f3695(var35, var61_126);
                                            final SubLObject var63_127 = (SubLObject)makeBoolean(!var61_126.eql(var36));
                                            if (NIL != var63_127) {
                                                var17 = f31655(var36, var22);
                                            }
                                            var60_125 = (SubLObject)makeBoolean(NIL == var63_127 || NIL != var17);
                                        }
                                    }
                                    finally {
                                        final SubLObject var16_128 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var12);
                                            if (NIL != var35) {
                                                module0158.f10319(var35);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var16_128, var12);
                                        }
                                    }
                                }
                                var31 = (SubLObject)makeBoolean(NIL == var34 || NIL != var17);
                            }
                        }
                    }
                }
                else if (var25.eql((SubLObject)$ic30$)) {
                    final SubLObject var37 = module0158.f10299(var23);
                    if (NIL != module0158.f10038(var37)) {
                        final SubLObject var38 = (SubLObject)NIL;
                        final SubLObject var16_129 = module0012.$g73$.currentBinding(var12);
                        final SubLObject var17_139 = module0012.$g65$.currentBinding(var12);
                        final SubLObject var39 = module0012.$g67$.currentBinding(var12);
                        final SubLObject var40 = module0012.$g68$.currentBinding(var12);
                        final SubLObject var41 = module0012.$g66$.currentBinding(var12);
                        final SubLObject var42 = module0012.$g69$.currentBinding(var12);
                        final SubLObject var43 = module0012.$g70$.currentBinding(var12);
                        final SubLObject var44 = module0012.$silent_progressP$.currentBinding(var12);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var12);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var12), var12);
                            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var12);
                            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var12);
                            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var12);
                            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var12);
                            module0012.$g70$.bind((SubLObject)T, var12);
                            module0012.$silent_progressP$.bind((SubLObject)((NIL != var38) ? module0012.$silent_progressP$.getDynamicValue(var12) : T), var12);
                            module0012.f474(var38);
                            final SubLObject var45 = module0158.f10039(var37);
                            SubLObject var46 = var17;
                            final SubLObject var47 = (SubLObject)NIL;
                            while (NIL == var46) {
                                final SubLObject var48 = module0052.f3695(var45, var47);
                                final SubLObject var49 = (SubLObject)makeBoolean(!var47.eql(var48));
                                if (NIL != var49) {
                                    module0012.f476();
                                    SubLObject var50 = (SubLObject)NIL;
                                    try {
                                        var50 = module0158.f10316(var48, (SubLObject)$ic29$, module0130.f8518(var16), (SubLObject)NIL);
                                        SubLObject var60_126 = var17;
                                        final SubLObject var61_127 = (SubLObject)NIL;
                                        while (NIL == var60_126) {
                                            final SubLObject var51 = module0052.f3695(var50, var61_127);
                                            final SubLObject var63_128 = (SubLObject)makeBoolean(!var61_127.eql(var51));
                                            if (NIL != var63_128) {
                                                var17 = f31655(var51, var22);
                                            }
                                            var60_126 = (SubLObject)makeBoolean(NIL == var63_128 || NIL != var17);
                                        }
                                    }
                                    finally {
                                        final SubLObject var16_130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var12);
                                            if (NIL != var50) {
                                                module0158.f10319(var50);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var16_130, var12);
                                        }
                                    }
                                }
                                var46 = (SubLObject)makeBoolean(NIL == var49 || NIL != var17);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var44, var12);
                            module0012.$g70$.rebind(var43, var12);
                            module0012.$g69$.rebind(var42, var12);
                            module0012.$g66$.rebind(var41, var12);
                            module0012.$g68$.rebind(var40, var12);
                            module0012.$g67$.rebind(var39, var12);
                            module0012.$g65$.rebind(var17_139, var12);
                            module0012.$g73$.rebind(var16_129, var12);
                        }
                    }
                }
                else if (var25.eql((SubLObject)$ic31$)) {
                    SubLObject var52;
                    SubLObject var53;
                    for (var52 = (SubLObject)NIL, var52 = module0218.f14453(module0158.f10301(var23), (SubLObject)UNPROVIDED); NIL == var17 && NIL != var52; var52 = var52.rest()) {
                        var53 = var52.first();
                        if (NIL == module0130.f8518(var16) || NIL != module0178.f11343(var53, module0130.f8518(var16))) {
                            var17 = f31655(var53, var22);
                        }
                    }
                }
                else {
                    module0158.f10295(var23, var24);
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var19, var12);
            module0147.$g2094$.rebind(var18, var12);
        }
        if (NIL == var17) {
            module0347.f23330(module0191.f11990((SubLObject)$ic46$, module0205.f13338(var10), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31655(final SubLObject var44, final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        if (NIL != module0351.f23568(var44)) {
            var47.resetMultipleValues();
            final SubLObject var48 = module0235.f15476(var46, module0178.f11285(var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var49 = var47.secondMultipleValue();
            final SubLObject var50 = var47.thirdMultipleValue();
            var47.resetMultipleValues();
            return module0035.sublisp_boolean(var48);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31656(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLObject var12 = module0202.f12826(module0205.f13388(var10, (SubLObject)UNPROVIDED));
        final SubLObject var13 = module0205.f13132(var12);
        return module0269.f17706(var13);
    }
    
    public static SubLObject f31657(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        return f31658(var10);
    }
    
    public static SubLObject f31659(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)NIL;
        final SubLObject var13 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0218.f14462(var14);
        final SubLObject var16 = module0202.f12826(var13);
        final SubLObject var17 = module0202.f12828(var13);
        final SubLObject var18 = module0147.$g2094$.currentBinding(var11);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var11);
        try {
            module0147.$g2094$.bind((SubLObject)$ic21$, var11);
            module0147.$g2095$.bind($ic22$, var11);
            final SubLObject var20 = var16;
            SubLObject var21 = module0205.f13281(var20, Symbols.symbol_function((SubLObject)$ic32$), (SubLObject)T);
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                final SubLObject var23 = module0349.f23451(var22, var17);
                if (var15.numL(var23)) {
                    SubLObject var20_148 = module0218.f14456(var14);
                    SubLObject var24 = (SubLObject)NIL;
                    var24 = var20_148.first();
                    while (NIL != var20_148) {
                        final SubLObject var25 = f31660(var24, var22, var14);
                        if (NIL != var25) {
                            var12 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var25, var24), var12);
                        }
                        var20_148 = var20_148.rest();
                        var24 = var20_148.first();
                    }
                }
                else {
                    final SubLObject var26 = module0349.f23449(var22, var17);
                    final SubLObject var28;
                    final SubLObject var27 = var28 = module0158.f10294(var26);
                    if (var28.eql((SubLObject)$ic28$)) {
                        var11.resetMultipleValues();
                        final SubLObject var29 = module0158.f10297(var26);
                        final SubLObject var30 = var11.secondMultipleValue();
                        final SubLObject var31 = var11.thirdMultipleValue();
                        var11.resetMultipleValues();
                        if (NIL != var30) {
                            if (NIL != var31) {
                                final SubLObject var32 = var31;
                                if (NIL != module0158.f10010(var29, var30, var32)) {
                                    final SubLObject var33 = module0158.f10011(var29, var30, var32);
                                    SubLObject var34 = (SubLObject)NIL;
                                    final SubLObject var35 = (SubLObject)NIL;
                                    while (NIL == var34) {
                                        final SubLObject var36 = module0052.f3695(var33, var35);
                                        final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                                        if (NIL != var37) {
                                            SubLObject var38 = (SubLObject)NIL;
                                            try {
                                                var38 = module0158.f10316(var36, (SubLObject)$ic29$, module0130.f8518(var17), (SubLObject)NIL);
                                                SubLObject var60_149 = (SubLObject)NIL;
                                                final SubLObject var61_150 = (SubLObject)NIL;
                                                while (NIL == var60_149) {
                                                    final SubLObject var39 = module0052.f3695(var38, var61_150);
                                                    final SubLObject var63_151 = (SubLObject)makeBoolean(!var61_150.eql(var39));
                                                    if (NIL != var63_151) {
                                                        final SubLObject var40 = f31660(var39, var22, var14);
                                                        if (NIL != var40) {
                                                            var12 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var40, var39), var12);
                                                        }
                                                    }
                                                    var60_149 = (SubLObject)makeBoolean(NIL == var63_151);
                                                }
                                            }
                                            finally {
                                                final SubLObject var16_152 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                                                    if (NIL != var38) {
                                                        module0158.f10319(var38);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var16_152, var11);
                                                }
                                            }
                                        }
                                        var34 = (SubLObject)makeBoolean(NIL == var37);
                                    }
                                }
                            }
                            else {
                                final SubLObject var32 = (SubLObject)NIL;
                                if (NIL != module0158.f10010(var29, var30, var32)) {
                                    final SubLObject var33 = module0158.f10011(var29, var30, var32);
                                    SubLObject var34 = (SubLObject)NIL;
                                    final SubLObject var35 = (SubLObject)NIL;
                                    while (NIL == var34) {
                                        final SubLObject var36 = module0052.f3695(var33, var35);
                                        final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                                        if (NIL != var37) {
                                            SubLObject var38 = (SubLObject)NIL;
                                            try {
                                                var38 = module0158.f10316(var36, (SubLObject)$ic29$, module0130.f8518(var17), (SubLObject)NIL);
                                                SubLObject var60_150 = (SubLObject)NIL;
                                                final SubLObject var61_151 = (SubLObject)NIL;
                                                while (NIL == var60_150) {
                                                    final SubLObject var39 = module0052.f3695(var38, var61_151);
                                                    final SubLObject var63_152 = (SubLObject)makeBoolean(!var61_151.eql(var39));
                                                    if (NIL != var63_152) {
                                                        final SubLObject var40 = f31660(var39, var22, var14);
                                                        if (NIL != var40) {
                                                            var12 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var40, var39), var12);
                                                        }
                                                    }
                                                    var60_150 = (SubLObject)makeBoolean(NIL == var63_152);
                                                }
                                            }
                                            finally {
                                                final SubLObject var16_153 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                                                    if (NIL != var38) {
                                                        module0158.f10319(var38);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var16_153, var11);
                                                }
                                            }
                                        }
                                        var34 = (SubLObject)makeBoolean(NIL == var37);
                                    }
                                }
                            }
                        }
                        else if (NIL != var31) {
                            final SubLObject var32 = var31;
                            if (NIL != module0158.f10010(var29, (SubLObject)NIL, var32)) {
                                final SubLObject var33 = module0158.f10011(var29, (SubLObject)NIL, var32);
                                SubLObject var34 = (SubLObject)NIL;
                                final SubLObject var35 = (SubLObject)NIL;
                                while (NIL == var34) {
                                    final SubLObject var36 = module0052.f3695(var33, var35);
                                    final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                                    if (NIL != var37) {
                                        SubLObject var38 = (SubLObject)NIL;
                                        try {
                                            var38 = module0158.f10316(var36, (SubLObject)$ic29$, module0130.f8518(var17), (SubLObject)NIL);
                                            SubLObject var60_151 = (SubLObject)NIL;
                                            final SubLObject var61_152 = (SubLObject)NIL;
                                            while (NIL == var60_151) {
                                                final SubLObject var39 = module0052.f3695(var38, var61_152);
                                                final SubLObject var63_153 = (SubLObject)makeBoolean(!var61_152.eql(var39));
                                                if (NIL != var63_153) {
                                                    final SubLObject var40 = f31660(var39, var22, var14);
                                                    if (NIL != var40) {
                                                        var12 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var40, var39), var12);
                                                    }
                                                }
                                                var60_151 = (SubLObject)makeBoolean(NIL == var63_153);
                                            }
                                        }
                                        finally {
                                            final SubLObject var16_154 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                                                if (NIL != var38) {
                                                    module0158.f10319(var38);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var16_154, var11);
                                            }
                                        }
                                    }
                                    var34 = (SubLObject)makeBoolean(NIL == var37);
                                }
                            }
                        }
                        else {
                            final SubLObject var32 = (SubLObject)NIL;
                            if (NIL != module0158.f10010(var29, (SubLObject)NIL, var32)) {
                                final SubLObject var33 = module0158.f10011(var29, (SubLObject)NIL, var32);
                                SubLObject var34 = (SubLObject)NIL;
                                final SubLObject var35 = (SubLObject)NIL;
                                while (NIL == var34) {
                                    final SubLObject var36 = module0052.f3695(var33, var35);
                                    final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                                    if (NIL != var37) {
                                        SubLObject var38 = (SubLObject)NIL;
                                        try {
                                            var38 = module0158.f10316(var36, (SubLObject)$ic29$, module0130.f8518(var17), (SubLObject)NIL);
                                            SubLObject var60_152 = (SubLObject)NIL;
                                            final SubLObject var61_153 = (SubLObject)NIL;
                                            while (NIL == var60_152) {
                                                final SubLObject var39 = module0052.f3695(var38, var61_153);
                                                final SubLObject var63_154 = (SubLObject)makeBoolean(!var61_153.eql(var39));
                                                if (NIL != var63_154) {
                                                    final SubLObject var40 = f31660(var39, var22, var14);
                                                    if (NIL != var40) {
                                                        var12 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var40, var39), var12);
                                                    }
                                                }
                                                var60_152 = (SubLObject)makeBoolean(NIL == var63_154);
                                            }
                                        }
                                        finally {
                                            final SubLObject var16_155 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                                                if (NIL != var38) {
                                                    module0158.f10319(var38);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var16_155, var11);
                                            }
                                        }
                                    }
                                    var34 = (SubLObject)makeBoolean(NIL == var37);
                                }
                            }
                        }
                    }
                    else if (var28.eql((SubLObject)$ic30$)) {
                        final SubLObject var41 = module0158.f10299(var26);
                        if (NIL != module0158.f10038(var41)) {
                            final SubLObject var42 = (SubLObject)NIL;
                            final SubLObject var16_156 = module0012.$g73$.currentBinding(var11);
                            final SubLObject var17_166 = module0012.$g65$.currentBinding(var11);
                            final SubLObject var43 = module0012.$g67$.currentBinding(var11);
                            final SubLObject var44 = module0012.$g68$.currentBinding(var11);
                            final SubLObject var45 = module0012.$g66$.currentBinding(var11);
                            final SubLObject var46 = module0012.$g69$.currentBinding(var11);
                            final SubLObject var47 = module0012.$g70$.currentBinding(var11);
                            final SubLObject var48 = module0012.$silent_progressP$.currentBinding(var11);
                            try {
                                module0012.$g73$.bind(Time.get_universal_time(), var11);
                                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var11), var11);
                                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var11);
                                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var11);
                                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var11);
                                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var11);
                                module0012.$g70$.bind((SubLObject)T, var11);
                                module0012.$silent_progressP$.bind((SubLObject)((NIL != var42) ? module0012.$silent_progressP$.getDynamicValue(var11) : T), var11);
                                module0012.f474(var42);
                                final SubLObject var49 = module0158.f10039(var41);
                                SubLObject var50 = (SubLObject)NIL;
                                final SubLObject var51 = (SubLObject)NIL;
                                while (NIL == var50) {
                                    final SubLObject var52 = module0052.f3695(var49, var51);
                                    final SubLObject var53 = (SubLObject)makeBoolean(!var51.eql(var52));
                                    if (NIL != var53) {
                                        module0012.f476();
                                        SubLObject var54 = (SubLObject)NIL;
                                        try {
                                            var54 = module0158.f10316(var52, (SubLObject)$ic29$, module0130.f8518(var17), (SubLObject)NIL);
                                            SubLObject var60_153 = (SubLObject)NIL;
                                            final SubLObject var61_154 = (SubLObject)NIL;
                                            while (NIL == var60_153) {
                                                final SubLObject var55 = module0052.f3695(var54, var61_154);
                                                final SubLObject var63_155 = (SubLObject)makeBoolean(!var61_154.eql(var55));
                                                if (NIL != var63_155) {
                                                    final SubLObject var56 = f31660(var55, var22, var14);
                                                    if (NIL != var56) {
                                                        var12 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var56, var55), var12);
                                                    }
                                                }
                                                var60_153 = (SubLObject)makeBoolean(NIL == var63_155);
                                            }
                                        }
                                        finally {
                                            final SubLObject var16_157 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var11);
                                                if (NIL != var54) {
                                                    module0158.f10319(var54);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var16_157, var11);
                                            }
                                        }
                                    }
                                    var50 = (SubLObject)makeBoolean(NIL == var53);
                                }
                                module0012.f475();
                            }
                            finally {
                                module0012.$silent_progressP$.rebind(var48, var11);
                                module0012.$g70$.rebind(var47, var11);
                                module0012.$g69$.rebind(var46, var11);
                                module0012.$g66$.rebind(var45, var11);
                                module0012.$g68$.rebind(var44, var11);
                                module0012.$g67$.rebind(var43, var11);
                                module0012.$g65$.rebind(var17_166, var11);
                                module0012.$g73$.rebind(var16_156, var11);
                            }
                        }
                    }
                    else if (var28.eql((SubLObject)$ic31$)) {
                        SubLObject var20_149 = module0218.f14453(module0158.f10301(var26), (SubLObject)UNPROVIDED);
                        SubLObject var57 = (SubLObject)NIL;
                        var57 = var20_149.first();
                        while (NIL != var20_149) {
                            if (NIL == module0130.f8518(var17) || NIL != module0178.f11343(var57, module0130.f8518(var17))) {
                                final SubLObject var58 = f31660(var57, var22, var14);
                                if (NIL != var58) {
                                    var12 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var58, var57), var12);
                                }
                            }
                            var20_149 = var20_149.rest();
                            var57 = var20_149.first();
                        }
                    }
                    else {
                        module0158.f10295(var26, var27);
                    }
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var19, var11);
            module0147.$g2094$.rebind(var18, var11);
        }
        if (NIL != var12) {
            return module0052.f3709(var12);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31658(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var10, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var10, (SubLObject)UNPROVIDED);
        final SubLObject var14 = module0202.f12826(var13);
        final SubLObject var15 = module0202.f12828(var13);
        final SubLObject var16 = module0218.f14462(var12);
        SubLObject var17 = (SubLObject)ZERO_INTEGER;
        final SubLObject var18 = module0147.$g2094$.currentBinding(var11);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var11);
        try {
            module0147.$g2094$.bind((SubLObject)$ic21$, var11);
            module0147.$g2095$.bind($ic22$, var11);
            final SubLObject var20 = var14;
            SubLObject var21 = module0205.f13281(var20, Symbols.symbol_function((SubLObject)$ic32$), (SubLObject)T);
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                final SubLObject var23 = module0349.f23451(var22, var15);
                final SubLObject var24 = Numbers.min(var16, var23);
                var17 = Numbers.add(var17, var24);
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var19, var11);
            module0147.$g2094$.rebind(var18, var11);
        }
        return var17;
    }
    
    public static SubLObject f31660(final SubLObject var44, final SubLObject var173, final SubLObject var1) {
        if (NIL != module0351.f23568(var44)) {
            final SubLObject var174 = module0178.f11285(var44);
            final SubLObject var175 = module0178.f11287(var44);
            final SubLObject var176 = module0202.f12768($ic26$, var175, var174);
            final SubLObject var177 = module0202.f12768($ic26$, var1, var173);
            final SubLObject var178 = module0235.f15476(var177, var176, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return var178;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31661(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        final SubLObject var12 = module0202.f12826(module0205.f13388(var10, (SubLObject)UNPROVIDED));
        return Sequences.find_if(Symbols.symbol_function((SubLObject)$ic36$), module0205.f13385(var12, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31662(final SubLObject var10, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)NIL;
        }
        return f31658(var10);
    }
    
    public static SubLObject f31663(final SubLObject var10) {
        return f31659(var10);
    }
    
    public static SubLObject f31664() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31627", "S#34974", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31628", "S#29827", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31629", "S#34975", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31630", "S#34976", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31631", "S#34977", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31632", "S#34978", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31633", "S#34979", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31634", "S#34980", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31635", "S#34981", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31636", "S#34982", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31637", "S#34983", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31638", "S#34984", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31639", "S#34985", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31640", "S#34986", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31641", "S#34987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31642", "S#34988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31643", "S#34989", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31645", "S#34990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31646", "S#34991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31644", "S#34992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31647", "S#34993", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31648", "S#34994", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31649", "S#34995", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31650", "S#34996", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31651", "S#34997", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31652", "S#34998", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31653", "S#34999", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31654", "S#35000", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31655", "S#35001", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31656", "S#35002", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31657", "S#35003", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31659", "S#35004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31658", "S#35005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31660", "S#35006", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31661", "S#35007", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31662", "S#35008", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0476", "f31663", "S#35009", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31665() {
        $g3690$ = SubLFiles.defparameter("S#35010", (SubLObject)$ic7$);
        $g3691$ = SubLFiles.defparameter("S#35011", (SubLObject)TWO_INTEGER);
        $g3692$ = SubLFiles.defparameter("S#35012", $g3691$.getDynamicValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31666() {
        module0340.f22938($ic0$);
        module0358.f23730((SubLObject)$ic1$, (SubLObject)$ic2$);
        module0358.f23730((SubLObject)$ic3$, (SubLObject)$ic4$);
        module0340.f22941((SubLObject)$ic8$, (SubLObject)$ic9$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        module0340.f22941((SubLObject)$ic15$, (SubLObject)$ic16$);
        module0340.f22941((SubLObject)$ic19$, (SubLObject)$ic20$);
        module0340.f22941((SubLObject)$ic24$, (SubLObject)$ic25$);
        module0340.f22938($ic26$);
        module0340.f22941((SubLObject)$ic34$, (SubLObject)$ic35$);
        module0340.f22941((SubLObject)$ic37$, (SubLObject)$ic38$);
        module0340.f22941((SubLObject)$ic44$, (SubLObject)$ic45$);
        module0340.f22941((SubLObject)$ic47$, (SubLObject)$ic48$);
        module0340.f22941((SubLObject)$ic49$, (SubLObject)$ic50$);
        module0340.f22941((SubLObject)$ic51$, (SubLObject)$ic52$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31664();
    }
    
    public void initializeVariables() {
        f31665();
    }
    
    public void runTopLevelForms() {
        f31666();
    }
    
    static {
        me = (SubLFile)new module0476();
        $g3690$ = null;
        $g3691$ = null;
        $g3692$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic1$ = makeKeyword("IST-MT-PROP-POS");
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("VARIABLE")), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("DISALLOWED"));
        $ic3$ = makeKeyword("IST-IN-WHAT-MTS-POS");
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist")), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("VARIABLE"))), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#14595", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#24422", "CYC"));
        $ic6$ = makeKeyword("QUERY");
        $ic7$ = (SubLFloat)makeDouble(1.5);
        $ic8$ = makeKeyword("REMOVAL-IST-FORMULA-CHECK");
        $ic9$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), (SubLObject)makeKeyword("CLOSED-HLMT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING")))))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35010", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34976", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$ist <mt> (<non-predicate> . <fully-bound>))\n    by recursively querying sentence in <mt>\n    and succeeding if the query succeeds"), makeKeyword("EXAMPLE"), makeString("(#$ist #$BaseKB\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });
        $ic10$ = makeKeyword("POS");
        $ic11$ = makeKeyword("REMOVAL-IST-POS-GAF");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), (SubLObject)makeKeyword("CLOSED-HLMT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("S#34978", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34979", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$ist <mt> (<predicate> . <whatever>))\n    by recursively querying sentence (<predicate> . <whatever>)\n    in <mt>"), makeKeyword("EXAMPLE"), makeString("(#$ist #$BaseKB\n     (#$genls ?SPEC #$BinaryRelation))") });
        $ic13$ = makeKeyword("TRUE");
        $ic14$ = makeKeyword("NEG");
        $ic15$ = makeKeyword("REMOVAL-IST-NEG-GAF");
        $ic16$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), (SubLObject)makeKeyword("CLOSED-HLMT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("S#34981", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#34982", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$ist <mt> (#$not (<predicate> . <fully-bound>)))\n    by recursively querying sentence (#$not (<predicate> . <fully-bound>))\n    in <mt>"), makeKeyword("EXAMPLE"), makeString("(#$ist #$BaseKB\n     (#$not (#$genls #$Microtheory #$BinaryPredicate)))") });
        $ic17$ = makeKeyword("FALSE");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("S#12701", "CYC"), (SubLObject)makeSymbol("S#14271", "CYC"));
        $ic19$ = makeKeyword("REMOVAL-IST-POS-GAF-MT-LOOKUP");
        $ic20$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35012", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34984", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$ist <not fully-bound> (<predicate> . <fully-bound>)))\n    by recursively querying formula in #$InferencePSC\n    and computing appropriate mts from the justification."), makeKeyword("EXAMPLE"), makeString("(#$ist ?MT (#$genls #$BinaryPredicate #$Relation))") });
        $ic21$ = makeSymbol("S#12274", "CYC");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic24$ = makeKeyword("REMOVAL-IST-UNBOUND-MT-GAF-LOOKUP-POS");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("S#34985", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#34986", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$ist <not-fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$ist ?MT (#$acquaintedWith #$ThomasPynchon ?WHO))") });
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted"));
        $ic27$ = makeSymbol("S#12276", "CYC");
        $ic28$ = makeKeyword("GAF-ARG");
        $ic29$ = makeKeyword("GAF");
        $ic30$ = makeKeyword("PREDICATE-EXTENT");
        $ic31$ = makeKeyword("OVERLAP");
        $ic32$ = makeSymbol("S#15433", "CYC");
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic34$ = makeKeyword("REMOVAL-IST-ASSERTED-GAF-LOOKUP-POS");
        $ic35$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)makeKeyword("CLOSED-HLMT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#34991", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"))))), makeKeyword("COST"), makeSymbol("S#34989", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34990", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC"))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34987", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$ist-Asserted <mt> (<predicate> . <whatever>))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$ist-Asserted #$LogicalTruthMt (#$genls #$Predicate ?WHAT))") });
        $ic36$ = makeSymbol("FORT-P");
        $ic37$ = makeKeyword("REMOVAL-IST-ASSERTED-UNBOUND-LOOKUP-POS");
        $ic38$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)makeKeyword("CLOSED-HLMT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)makeKeyword("FORT")), (SubLObject)makeKeyword("ANYTHING"))))), makeKeyword("REQUIRED"), makeSymbol("S#34993", "CYC"), makeKeyword("COST"), makeSymbol("S#34994", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34995", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC"))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34987", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$ist-Asserted <mt> (<not fully-bound> ... <fort> ...))\nwhere <mt> is a chlmt-p\nusing only the KB GAF indexing and explicit assertions involving <fort>"), makeKeyword("EXAMPLE"), makeString("(#$ist-Asserted #$LogicalTruthMt (?PRED #$Predicate ?WHAT))") });
        $ic39$ = makeKeyword("MT");
        $ic40$ = makeKeyword("BROAD-MT");
        $ic41$ = makeString("do-broad-mt-index");
        $ic42$ = makeSymbol("STRINGP");
        $ic43$ = makeKeyword("SKIP");
        $ic44$ = makeKeyword("REMOVAL-IST-ASSERTED-MT-CONTENTS");
        $ic45$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)makeKeyword("CLOSED-HLMT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#34996", "CYC"), makeKeyword("COST"), makeSymbol("S#34997", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#6061", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34998", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#6061", "CYC"))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#14135", "CYC"), (SubLObject)makeKeyword("INPUT"))), makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34987", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$ist-Asserted <fort> <variable>)\nusing only the KB MT indexing and explicit GAF assertions in ARG1 MT"), makeKeyword("EXAMPLE"), makeString("(#$ist-Asserted #$ChristmasMythologyMt ?FORMULA)") });
        $ic46$ = makeKeyword("MINIMIZE");
        $ic47$ = makeKeyword("REMOVAL-IST-ASSERTED-GAF-LOOKUP-NEG");
        $ic48$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#34991", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND"))))), makeKeyword("COST"), makeSymbol("S#34999", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35000", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$ist-Asserted <fort> (<predicate> . <fully-bound>)))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$ist-Asserted #$LogicalTruthMt (#$genls #$Predicate #$Thing)))") });
        $ic49$ = makeKeyword("REMOVAL-IST-ASSERTED-UNBOUND-MT-GAF-LOOKUP-POS");
        $ic50$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#34991", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("ANYTHING"))))), makeKeyword("REQUIRED"), makeSymbol("S#35002", "CYC"), makeKeyword("COST"), makeSymbol("S#35003", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35004", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTION-MT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ATOMIC-SENTENCE-ARG2"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))))), makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34987", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$ist-Asserted <not fully-bound> (<predicate> . <anything>))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$ist-Asserted ?MT (#$genls #$Dog #$CanineAnimal))\n    (#$ist-Asserted ?MT (#$genls #$Dog ?WHAT))") });
        $ic51$ = makeKeyword("REMOVAL-IST-ASSERTED-UNBOUND-MT-UNBOUND-PRED-LOOKUP-POS");
        $ic52$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"))))), makeKeyword("REQUIRED"), makeSymbol("S#35007", "CYC"), makeKeyword("COST"), makeSymbol("S#35008", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35009", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ASSERTION-MT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("ATOMIC-SENTENCE-ARG2"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))))), makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#34987", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("ASSERTION", "CYC"))), makeKeyword("DOCUMENTATION"), makeString("(#$ist-Asserted <not fully-bound> (<not fully-bound> ... <fort> ...))\nusing only the KB GAF indexing and explicit assertions in ARG1 MT with <fort> in its arg position."), makeKeyword("EXAMPLE"), makeString("(#$ist-Asserted ?MT (?PRED #$Madonna ?WHAT))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1802 ms
	
	Decompiled with Procyon 0.5.32.
*/