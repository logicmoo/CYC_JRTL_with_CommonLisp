package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0479 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0479";
    public static final String myFingerPrint = "ff48ab845545b5ce313462f38b47002261fba7b6bd28e554f656f2e799751fa9";
    public static SubLSymbol $g3696$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    
    public static SubLObject f31685(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        if (module0479.NIL != module0193.f12105(var3)) {
            return module0018.$g658$.getDynamicValue(var2);
        }
        final SubLObject var4 = module0202.f12826(var3);
        final SubLObject var5 = module0202.f12828(var3);
        SubLObject var6 = (SubLObject)module0479.ZERO_INTEGER;
        final SubLObject var7 = var4;
        SubLObject var8 = module0205.f13281(var7, Symbols.symbol_function((SubLObject)module0479.$ic4$), (SubLObject)module0479.T);
        SubLObject var9 = (SubLObject)module0479.NIL;
        var9 = var8.first();
        while (module0479.NIL != var8) {
            var6 = Numbers.add(var6, module0349.f23451(var9, var5));
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var6;
    }
    
    public static SubLObject f31686(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return f31685(var1);
    }
    
    public static SubLObject f31687(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0479.NIL;
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var5 = module0202.f12826(var4);
        final SubLObject var6 = module0202.f12828(var4);
        final SubLObject var7 = var5;
        SubLObject var8 = module0205.f13281(var7, Symbols.symbol_function((SubLObject)module0479.$ic4$), (SubLObject)module0479.T);
        SubLObject var9 = (SubLObject)module0479.NIL;
        var9 = var8.first();
        while (module0479.NIL != var8) {
            final SubLObject var10 = module0349.f23449(var9, var6);
            final SubLObject var12;
            final SubLObject var11 = var12 = module0158.f10294(var10);
            if (var12.eql((SubLObject)module0479.$ic5$)) {
                var2.resetMultipleValues();
                final SubLObject var13 = module0158.f10297(var10);
                final SubLObject var14 = var2.secondMultipleValue();
                final SubLObject var15 = var2.thirdMultipleValue();
                var2.resetMultipleValues();
                if (module0479.NIL != var14) {
                    if (module0479.NIL != var15) {
                        final SubLObject var16 = var15;
                        if (module0479.NIL != module0158.f10010(var13, var14, var16)) {
                            final SubLObject var17 = module0158.f10011(var13, var14, var16);
                            SubLObject var18 = (SubLObject)module0479.NIL;
                            final SubLObject var19 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var18) {
                                final SubLObject var20 = module0052.f3695(var17, var19);
                                final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                                if (module0479.NIL != var21) {
                                    SubLObject var22 = (SubLObject)module0479.NIL;
                                    try {
                                        var22 = module0158.f10316(var20, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                        SubLObject var23_28 = (SubLObject)module0479.NIL;
                                        final SubLObject var24_29 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_28) {
                                            final SubLObject var23 = module0052.f3695(var22, var24_29);
                                            final SubLObject var26_31 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_29.eql(var23));
                                            if (module0479.NIL != var26_31 && module0479.NIL != module0351.f23568(var23)) {
                                                var2.resetMultipleValues();
                                                final SubLObject var24 = module0235.f15476(var9, module0178.f11285(var23), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
                                                final SubLObject var25 = var2.secondMultipleValue();
                                                final SubLObject var26 = var2.thirdMultipleValue();
                                                var2.resetMultipleValues();
                                                if (module0479.NIL != var24) {
                                                    var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var23), var3);
                                                }
                                            }
                                            var23_28 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_31);
                                        }
                                    }
                                    finally {
                                        final SubLObject var27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                            if (module0479.NIL != var22) {
                                                module0158.f10319(var22);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var27, var2);
                                        }
                                    }
                                }
                                var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var21);
                            }
                        }
                    }
                    else {
                        final SubLObject var16 = (SubLObject)module0479.NIL;
                        if (module0479.NIL != module0158.f10010(var13, var14, var16)) {
                            final SubLObject var17 = module0158.f10011(var13, var14, var16);
                            SubLObject var18 = (SubLObject)module0479.NIL;
                            final SubLObject var19 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var18) {
                                final SubLObject var20 = module0052.f3695(var17, var19);
                                final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                                if (module0479.NIL != var21) {
                                    SubLObject var22 = (SubLObject)module0479.NIL;
                                    try {
                                        var22 = module0158.f10316(var20, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                        SubLObject var23_29 = (SubLObject)module0479.NIL;
                                        final SubLObject var24_30 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_29) {
                                            final SubLObject var23 = module0052.f3695(var22, var24_30);
                                            final SubLObject var26_32 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_30.eql(var23));
                                            if (module0479.NIL != var26_32 && module0479.NIL != module0351.f23568(var23)) {
                                                var2.resetMultipleValues();
                                                final SubLObject var24 = module0235.f15476(var9, module0178.f11285(var23), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
                                                final SubLObject var25 = var2.secondMultipleValue();
                                                final SubLObject var26 = var2.thirdMultipleValue();
                                                var2.resetMultipleValues();
                                                if (module0479.NIL != var24) {
                                                    var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var23), var3);
                                                }
                                            }
                                            var23_29 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_32);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                            if (module0479.NIL != var22) {
                                                module0158.f10319(var22);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28, var2);
                                        }
                                    }
                                }
                                var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var21);
                            }
                        }
                    }
                }
                else if (module0479.NIL != var15) {
                    final SubLObject var16 = var15;
                    if (module0479.NIL != module0158.f10010(var13, (SubLObject)module0479.NIL, var16)) {
                        final SubLObject var17 = module0158.f10011(var13, (SubLObject)module0479.NIL, var16);
                        SubLObject var18 = (SubLObject)module0479.NIL;
                        final SubLObject var19 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var18) {
                            final SubLObject var20 = module0052.f3695(var17, var19);
                            final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                            if (module0479.NIL != var21) {
                                SubLObject var22 = (SubLObject)module0479.NIL;
                                try {
                                    var22 = module0158.f10316(var20, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                    SubLObject var23_30 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_31 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_30) {
                                        final SubLObject var23 = module0052.f3695(var22, var24_31);
                                        final SubLObject var26_33 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_31.eql(var23));
                                        if (module0479.NIL != var26_33 && module0479.NIL != module0351.f23568(var23)) {
                                            var2.resetMultipleValues();
                                            final SubLObject var24 = module0235.f15476(var9, module0178.f11285(var23), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
                                            final SubLObject var25 = var2.secondMultipleValue();
                                            final SubLObject var26 = var2.thirdMultipleValue();
                                            var2.resetMultipleValues();
                                            if (module0479.NIL != var24) {
                                                var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var23), var3);
                                            }
                                        }
                                        var23_30 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_33);
                                    }
                                }
                                finally {
                                    final SubLObject var29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                        if (module0479.NIL != var22) {
                                            module0158.f10319(var22);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var29, var2);
                                    }
                                }
                            }
                            var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var21);
                        }
                    }
                }
                else {
                    final SubLObject var16 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var13, (SubLObject)module0479.NIL, var16)) {
                        final SubLObject var17 = module0158.f10011(var13, (SubLObject)module0479.NIL, var16);
                        SubLObject var18 = (SubLObject)module0479.NIL;
                        final SubLObject var19 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var18) {
                            final SubLObject var20 = module0052.f3695(var17, var19);
                            final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                            if (module0479.NIL != var21) {
                                SubLObject var22 = (SubLObject)module0479.NIL;
                                try {
                                    var22 = module0158.f10316(var20, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                    SubLObject var23_31 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_32 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_31) {
                                        final SubLObject var23 = module0052.f3695(var22, var24_32);
                                        final SubLObject var26_34 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_32.eql(var23));
                                        if (module0479.NIL != var26_34 && module0479.NIL != module0351.f23568(var23)) {
                                            var2.resetMultipleValues();
                                            final SubLObject var24 = module0235.f15476(var9, module0178.f11285(var23), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
                                            final SubLObject var25 = var2.secondMultipleValue();
                                            final SubLObject var26 = var2.thirdMultipleValue();
                                            var2.resetMultipleValues();
                                            if (module0479.NIL != var24) {
                                                var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var23), var3);
                                            }
                                        }
                                        var23_31 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_34);
                                    }
                                }
                                finally {
                                    final SubLObject var30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                        if (module0479.NIL != var22) {
                                            module0158.f10319(var22);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var30, var2);
                                    }
                                }
                            }
                            var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var21);
                        }
                    }
                }
            }
            else if (var12.eql((SubLObject)module0479.$ic7$)) {
                final SubLObject var31 = module0158.f10299(var10);
                if (module0479.NIL != module0158.f10038(var31)) {
                    final SubLObject var32 = (SubLObject)module0479.NIL;
                    final SubLObject var33 = module0012.$g73$.currentBinding(var2);
                    final SubLObject var34 = module0012.$g65$.currentBinding(var2);
                    final SubLObject var35 = module0012.$g67$.currentBinding(var2);
                    final SubLObject var36 = module0012.$g68$.currentBinding(var2);
                    final SubLObject var37 = module0012.$g66$.currentBinding(var2);
                    final SubLObject var38 = module0012.$g69$.currentBinding(var2);
                    final SubLObject var39 = module0012.$g70$.currentBinding(var2);
                    final SubLObject var40 = module0012.$silent_progressP$.currentBinding(var2);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var2);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                        module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var2);
                        module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                        module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                        module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                        module0012.$g70$.bind((SubLObject)module0479.T, var2);
                        module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var32) ? module0012.$silent_progressP$.getDynamicValue(var2) : module0479.T), var2);
                        module0012.f474(var32);
                        final SubLObject var41 = module0158.f10039(var31);
                        SubLObject var42 = (SubLObject)module0479.NIL;
                        final SubLObject var43 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var42) {
                            final SubLObject var44 = module0052.f3695(var41, var43);
                            final SubLObject var45 = (SubLObject)SubLObjectFactory.makeBoolean(!var43.eql(var44));
                            if (module0479.NIL != var45) {
                                module0012.f476();
                                SubLObject var46 = (SubLObject)module0479.NIL;
                                try {
                                    var46 = module0158.f10316(var44, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                    SubLObject var23_32 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_33 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_32) {
                                        final SubLObject var47 = module0052.f3695(var46, var24_33);
                                        final SubLObject var26_35 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_33.eql(var47));
                                        if (module0479.NIL != var26_35 && module0479.NIL != module0351.f23568(var47)) {
                                            var2.resetMultipleValues();
                                            final SubLObject var48 = module0235.f15476(var9, module0178.f11285(var47), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
                                            final SubLObject var49 = var2.secondMultipleValue();
                                            final SubLObject var50 = var2.thirdMultipleValue();
                                            var2.resetMultipleValues();
                                            if (module0479.NIL != var48) {
                                                var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var48, var47), var3);
                                            }
                                        }
                                        var23_32 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_35);
                                    }
                                }
                                finally {
                                    final SubLObject var35_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                        if (module0479.NIL != var46) {
                                            module0158.f10319(var46);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_58, var2);
                                    }
                                }
                            }
                            var42 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var45);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var40, var2);
                        module0012.$g70$.rebind(var39, var2);
                        module0012.$g69$.rebind(var38, var2);
                        module0012.$g66$.rebind(var37, var2);
                        module0012.$g68$.rebind(var36, var2);
                        module0012.$g67$.rebind(var35, var2);
                        module0012.$g65$.rebind(var34, var2);
                        module0012.$g73$.rebind(var33, var2);
                    }
                }
            }
            else if (var12.eql((SubLObject)module0479.$ic8$)) {
                SubLObject var8_59 = module0218.f14453(module0158.f10301(var10), (SubLObject)module0479.UNPROVIDED);
                SubLObject var51 = (SubLObject)module0479.NIL;
                var51 = var8_59.first();
                while (module0479.NIL != var8_59) {
                    if ((module0479.NIL == module0130.f8518(var6) || module0479.NIL != module0178.f11343(var51, module0130.f8518(var6))) && module0479.NIL != module0351.f23568(var51)) {
                        var2.resetMultipleValues();
                        final SubLObject var52 = module0235.f15476(var9, module0178.f11285(var51), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
                        final SubLObject var53 = var2.secondMultipleValue();
                        final SubLObject var54 = var2.thirdMultipleValue();
                        var2.resetMultipleValues();
                        if (module0479.NIL != var52) {
                            var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var52, var51), var3);
                        }
                    }
                    var8_59 = var8_59.rest();
                    var51 = var8_59.first();
                }
            }
            else {
                module0158.f10295(var10, var11);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        if (module0479.NIL != var3) {
            return module0052.f3709(var3);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31688(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return f31689(var1);
    }
    
    public static SubLObject f31690(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0479.NIL;
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var5 = module0202.f12826(var4);
        final SubLObject var6 = module0202.f12828(var4);
        final SubLObject var7 = module0349.f23449(var5, var6);
        final SubLObject var9;
        final SubLObject var8 = var9 = module0158.f10294(var7);
        if (var9.eql((SubLObject)module0479.$ic5$)) {
            var2.resetMultipleValues();
            final SubLObject var10 = module0158.f10297(var7);
            final SubLObject var11 = var2.secondMultipleValue();
            final SubLObject var12 = var2.thirdMultipleValue();
            var2.resetMultipleValues();
            if (module0479.NIL != var11) {
                if (module0479.NIL != var12) {
                    final SubLObject var13 = var12;
                    if (module0479.NIL != module0158.f10010(var10, var11, var13)) {
                        final SubLObject var14 = module0158.f10011(var10, var11, var13);
                        SubLObject var15 = (SubLObject)module0479.NIL;
                        final SubLObject var16 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                            if (module0479.NIL != var18) {
                                SubLObject var19 = (SubLObject)module0479.NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                    SubLObject var23_61 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_62 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_61) {
                                        final SubLObject var20 = module0052.f3695(var19, var24_62);
                                        final SubLObject var26_63 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_62.eql(var20));
                                        if (module0479.NIL != var26_63 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                            var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                        }
                                        var23_61 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_63);
                                    }
                                }
                                finally {
                                    final SubLObject var21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                        if (module0479.NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var21, var2);
                                    }
                                }
                            }
                            var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                        }
                    }
                }
                else {
                    final SubLObject var13 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var10, var11, var13)) {
                        final SubLObject var14 = module0158.f10011(var10, var11, var13);
                        SubLObject var15 = (SubLObject)module0479.NIL;
                        final SubLObject var16 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                            if (module0479.NIL != var18) {
                                SubLObject var19 = (SubLObject)module0479.NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                    SubLObject var23_62 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_63 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_62) {
                                        final SubLObject var20 = module0052.f3695(var19, var24_63);
                                        final SubLObject var26_64 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_63.eql(var20));
                                        if (module0479.NIL != var26_64 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                            var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                        }
                                        var23_62 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_64);
                                    }
                                }
                                finally {
                                    final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                        if (module0479.NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var22, var2);
                                    }
                                }
                            }
                            var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                        }
                    }
                }
            }
            else if (module0479.NIL != var12) {
                final SubLObject var13 = var12;
                if (module0479.NIL != module0158.f10010(var10, (SubLObject)module0479.NIL, var13)) {
                    final SubLObject var14 = module0158.f10011(var10, (SubLObject)module0479.NIL, var13);
                    SubLObject var15 = (SubLObject)module0479.NIL;
                    final SubLObject var16 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var15) {
                        final SubLObject var17 = module0052.f3695(var14, var16);
                        final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                        if (module0479.NIL != var18) {
                            SubLObject var19 = (SubLObject)module0479.NIL;
                            try {
                                var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                SubLObject var23_63 = (SubLObject)module0479.NIL;
                                final SubLObject var24_64 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_63) {
                                    final SubLObject var20 = module0052.f3695(var19, var24_64);
                                    final SubLObject var26_65 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_64.eql(var20));
                                    if (module0479.NIL != var26_65 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                    }
                                    var23_63 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_65);
                                }
                            }
                            finally {
                                final SubLObject var23 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                    if (module0479.NIL != var19) {
                                        module0158.f10319(var19);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var23, var2);
                                }
                            }
                        }
                        var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                    }
                }
            }
            else {
                final SubLObject var13 = (SubLObject)module0479.NIL;
                if (module0479.NIL != module0158.f10010(var10, (SubLObject)module0479.NIL, var13)) {
                    final SubLObject var14 = module0158.f10011(var10, (SubLObject)module0479.NIL, var13);
                    SubLObject var15 = (SubLObject)module0479.NIL;
                    final SubLObject var16 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var15) {
                        final SubLObject var17 = module0052.f3695(var14, var16);
                        final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                        if (module0479.NIL != var18) {
                            SubLObject var19 = (SubLObject)module0479.NIL;
                            try {
                                var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                SubLObject var23_64 = (SubLObject)module0479.NIL;
                                final SubLObject var24_65 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_64) {
                                    final SubLObject var20 = module0052.f3695(var19, var24_65);
                                    final SubLObject var26_66 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_65.eql(var20));
                                    if (module0479.NIL != var26_66 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                    }
                                    var23_64 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_66);
                                }
                            }
                            finally {
                                final SubLObject var24 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                    if (module0479.NIL != var19) {
                                        module0158.f10319(var19);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var24, var2);
                                }
                            }
                        }
                        var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                    }
                }
            }
        }
        else if (var9.eql((SubLObject)module0479.$ic7$)) {
            final SubLObject var25 = module0158.f10299(var7);
            if (module0479.NIL != module0158.f10038(var25)) {
                final SubLObject var26 = (SubLObject)module0479.NIL;
                final SubLObject var27 = module0012.$g73$.currentBinding(var2);
                final SubLObject var28 = module0012.$g65$.currentBinding(var2);
                final SubLObject var29 = module0012.$g67$.currentBinding(var2);
                final SubLObject var30 = module0012.$g68$.currentBinding(var2);
                final SubLObject var31 = module0012.$g66$.currentBinding(var2);
                final SubLObject var32 = module0012.$g69$.currentBinding(var2);
                final SubLObject var33 = module0012.$g70$.currentBinding(var2);
                final SubLObject var34 = module0012.$silent_progressP$.currentBinding(var2);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var2);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                    module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var2);
                    module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                    module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                    module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                    module0012.$g70$.bind((SubLObject)module0479.T, var2);
                    module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var26) ? module0012.$silent_progressP$.getDynamicValue(var2) : module0479.T), var2);
                    module0012.f474(var26);
                    final SubLObject var35 = module0158.f10039(var25);
                    SubLObject var36 = (SubLObject)module0479.NIL;
                    final SubLObject var37 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var36) {
                        final SubLObject var38 = module0052.f3695(var35, var37);
                        final SubLObject var39 = (SubLObject)SubLObjectFactory.makeBoolean(!var37.eql(var38));
                        if (module0479.NIL != var39) {
                            module0012.f476();
                            SubLObject var40 = (SubLObject)module0479.NIL;
                            try {
                                var40 = module0158.f10316(var38, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                SubLObject var23_65 = (SubLObject)module0479.NIL;
                                final SubLObject var24_66 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_65) {
                                    final SubLObject var41 = module0052.f3695(var40, var24_66);
                                    final SubLObject var26_67 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_66.eql(var41));
                                    if (module0479.NIL != var26_67 && module0479.NIL != module0351.f23568(var41) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var41), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var41, var3);
                                    }
                                    var23_65 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_67);
                                }
                            }
                            finally {
                                final SubLObject var35_76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                    if (module0479.NIL != var40) {
                                        module0158.f10319(var40);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var35_76, var2);
                                }
                            }
                        }
                        var36 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var39);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var34, var2);
                    module0012.$g70$.rebind(var33, var2);
                    module0012.$g69$.rebind(var32, var2);
                    module0012.$g66$.rebind(var31, var2);
                    module0012.$g68$.rebind(var30, var2);
                    module0012.$g67$.rebind(var29, var2);
                    module0012.$g65$.rebind(var28, var2);
                    module0012.$g73$.rebind(var27, var2);
                }
            }
        }
        else if (var9.eql((SubLObject)module0479.$ic8$)) {
            SubLObject var42 = module0218.f14453(module0158.f10301(var7), (SubLObject)module0479.UNPROVIDED);
            SubLObject var43 = (SubLObject)module0479.NIL;
            var43 = var42.first();
            while (module0479.NIL != var42) {
                if ((module0479.NIL == module0130.f8518(var6) || module0479.NIL != module0178.f11343(var43, module0130.f8518(var6))) && module0479.NIL != module0351.f23568(var43) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var43), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                    var3 = (SubLObject)ConsesLow.cons(var43, var3);
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        else {
            module0158.f10295(var7, var8);
        }
        if (module0479.NIL != var3) {
            return module0052.f3709(var3);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31691(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return module0435.f30613(f31685(var1));
    }
    
    public static SubLObject f31692(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var13 = module0202.f12826(var12);
        final SubLObject var14 = module0202.f12828(var12);
        SubLObject var15 = (SubLObject)module0479.NIL;
        final SubLObject var16 = var13;
        SubLObject var17 = module0205.f13281(var16, Symbols.symbol_function((SubLObject)module0479.$ic4$), (SubLObject)module0479.T);
        SubLObject var18 = (SubLObject)module0479.NIL;
        var18 = var17.first();
        while (module0479.NIL != var17) {
            final SubLObject var19 = module0349.f23449(var18, var14);
            final SubLObject var21;
            final SubLObject var20 = var21 = module0158.f10294(var19);
            if (var21.eql((SubLObject)module0479.$ic5$)) {
                var11.resetMultipleValues();
                final SubLObject var22 = module0158.f10297(var19);
                final SubLObject var23 = var11.secondMultipleValue();
                final SubLObject var24 = var11.thirdMultipleValue();
                var11.resetMultipleValues();
                if (module0479.NIL != var23) {
                    if (module0479.NIL != var24) {
                        final SubLObject var25 = var24;
                        if (module0479.NIL != module0158.f10010(var22, var23, var25)) {
                            final SubLObject var26 = module0158.f10011(var22, var23, var25);
                            SubLObject var27 = var15;
                            final SubLObject var28 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var27) {
                                final SubLObject var29 = module0052.f3695(var26, var28);
                                final SubLObject var30 = (SubLObject)SubLObjectFactory.makeBoolean(!var28.eql(var29));
                                if (module0479.NIL != var30) {
                                    SubLObject var31 = (SubLObject)module0479.NIL;
                                    try {
                                        var31 = module0158.f10316(var29, (SubLObject)module0479.$ic6$, module0130.f8518(var14), (SubLObject)module0479.NIL);
                                        SubLObject var23_81 = var15;
                                        final SubLObject var24_82 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_81) {
                                            final SubLObject var32 = module0052.f3695(var31, var24_82);
                                            final SubLObject var26_83 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_82.eql(var32));
                                            if (module0479.NIL != var26_83) {
                                                var15 = f31693(var32, var18);
                                            }
                                            var23_81 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_83 || module0479.NIL != var15);
                                        }
                                    }
                                    finally {
                                        final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var31) {
                                                module0158.f10319(var31);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var33, var11);
                                        }
                                    }
                                }
                                var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var30 || module0479.NIL != var15);
                            }
                        }
                    }
                    else {
                        final SubLObject var25 = (SubLObject)module0479.NIL;
                        if (module0479.NIL != module0158.f10010(var22, var23, var25)) {
                            final SubLObject var26 = module0158.f10011(var22, var23, var25);
                            SubLObject var27 = var15;
                            final SubLObject var28 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var27) {
                                final SubLObject var29 = module0052.f3695(var26, var28);
                                final SubLObject var30 = (SubLObject)SubLObjectFactory.makeBoolean(!var28.eql(var29));
                                if (module0479.NIL != var30) {
                                    SubLObject var31 = (SubLObject)module0479.NIL;
                                    try {
                                        var31 = module0158.f10316(var29, (SubLObject)module0479.$ic6$, module0130.f8518(var14), (SubLObject)module0479.NIL);
                                        SubLObject var23_82 = var15;
                                        final SubLObject var24_83 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_82) {
                                            final SubLObject var32 = module0052.f3695(var31, var24_83);
                                            final SubLObject var26_84 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_83.eql(var32));
                                            if (module0479.NIL != var26_84) {
                                                var15 = f31693(var32, var18);
                                            }
                                            var23_82 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_84 || module0479.NIL != var15);
                                        }
                                    }
                                    finally {
                                        final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var31) {
                                                module0158.f10319(var31);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var34, var11);
                                        }
                                    }
                                }
                                var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var30 || module0479.NIL != var15);
                            }
                        }
                    }
                }
                else if (module0479.NIL != var24) {
                    final SubLObject var25 = var24;
                    if (module0479.NIL != module0158.f10010(var22, (SubLObject)module0479.NIL, var25)) {
                        final SubLObject var26 = module0158.f10011(var22, (SubLObject)module0479.NIL, var25);
                        SubLObject var27 = var15;
                        final SubLObject var28 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var27) {
                            final SubLObject var29 = module0052.f3695(var26, var28);
                            final SubLObject var30 = (SubLObject)SubLObjectFactory.makeBoolean(!var28.eql(var29));
                            if (module0479.NIL != var30) {
                                SubLObject var31 = (SubLObject)module0479.NIL;
                                try {
                                    var31 = module0158.f10316(var29, (SubLObject)module0479.$ic6$, module0130.f8518(var14), (SubLObject)module0479.NIL);
                                    SubLObject var23_83 = var15;
                                    final SubLObject var24_84 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_83) {
                                        final SubLObject var32 = module0052.f3695(var31, var24_84);
                                        final SubLObject var26_85 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_84.eql(var32));
                                        if (module0479.NIL != var26_85) {
                                            var15 = f31693(var32, var18);
                                        }
                                        var23_83 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_85 || module0479.NIL != var15);
                                    }
                                }
                                finally {
                                    final SubLObject var35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var31) {
                                            module0158.f10319(var31);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35, var11);
                                    }
                                }
                            }
                            var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var30 || module0479.NIL != var15);
                        }
                    }
                }
                else {
                    final SubLObject var25 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var22, (SubLObject)module0479.NIL, var25)) {
                        final SubLObject var26 = module0158.f10011(var22, (SubLObject)module0479.NIL, var25);
                        SubLObject var27 = var15;
                        final SubLObject var28 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var27) {
                            final SubLObject var29 = module0052.f3695(var26, var28);
                            final SubLObject var30 = (SubLObject)SubLObjectFactory.makeBoolean(!var28.eql(var29));
                            if (module0479.NIL != var30) {
                                SubLObject var31 = (SubLObject)module0479.NIL;
                                try {
                                    var31 = module0158.f10316(var29, (SubLObject)module0479.$ic6$, module0130.f8518(var14), (SubLObject)module0479.NIL);
                                    SubLObject var23_84 = var15;
                                    final SubLObject var24_85 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_84) {
                                        final SubLObject var32 = module0052.f3695(var31, var24_85);
                                        final SubLObject var26_86 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_85.eql(var32));
                                        if (module0479.NIL != var26_86) {
                                            var15 = f31693(var32, var18);
                                        }
                                        var23_84 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_86 || module0479.NIL != var15);
                                    }
                                }
                                finally {
                                    final SubLObject var36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var31) {
                                            module0158.f10319(var31);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var36, var11);
                                    }
                                }
                            }
                            var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var30 || module0479.NIL != var15);
                        }
                    }
                }
            }
            else if (var21.eql((SubLObject)module0479.$ic7$)) {
                final SubLObject var37 = module0158.f10299(var19);
                if (module0479.NIL != module0158.f10038(var37)) {
                    final SubLObject var38 = (SubLObject)module0479.NIL;
                    final SubLObject var39 = module0012.$g73$.currentBinding(var11);
                    final SubLObject var40 = module0012.$g65$.currentBinding(var11);
                    final SubLObject var41 = module0012.$g67$.currentBinding(var11);
                    final SubLObject var42 = module0012.$g68$.currentBinding(var11);
                    final SubLObject var43 = module0012.$g66$.currentBinding(var11);
                    final SubLObject var44 = module0012.$g69$.currentBinding(var11);
                    final SubLObject var45 = module0012.$g70$.currentBinding(var11);
                    final SubLObject var46 = module0012.$silent_progressP$.currentBinding(var11);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var11);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var11), var11);
                        module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var11);
                        module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g70$.bind((SubLObject)module0479.T, var11);
                        module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var38) ? module0012.$silent_progressP$.getDynamicValue(var11) : module0479.T), var11);
                        module0012.f474(var38);
                        final SubLObject var47 = module0158.f10039(var37);
                        SubLObject var48 = var15;
                        final SubLObject var49 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var48) {
                            final SubLObject var50 = module0052.f3695(var47, var49);
                            final SubLObject var51 = (SubLObject)SubLObjectFactory.makeBoolean(!var49.eql(var50));
                            if (module0479.NIL != var51) {
                                module0012.f476();
                                SubLObject var52 = (SubLObject)module0479.NIL;
                                try {
                                    var52 = module0158.f10316(var50, (SubLObject)module0479.$ic6$, module0130.f8518(var14), (SubLObject)module0479.NIL);
                                    SubLObject var23_85 = var15;
                                    final SubLObject var24_86 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_85) {
                                        final SubLObject var53 = module0052.f3695(var52, var24_86);
                                        final SubLObject var26_87 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_86.eql(var53));
                                        if (module0479.NIL != var26_87) {
                                            var15 = f31693(var53, var18);
                                        }
                                        var23_85 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_87 || module0479.NIL != var15);
                                    }
                                }
                                finally {
                                    final SubLObject var35_96 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var52) {
                                            module0158.f10319(var52);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_96, var11);
                                    }
                                }
                            }
                            var48 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var51 || module0479.NIL != var15);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var46, var11);
                        module0012.$g70$.rebind(var45, var11);
                        module0012.$g69$.rebind(var44, var11);
                        module0012.$g66$.rebind(var43, var11);
                        module0012.$g68$.rebind(var42, var11);
                        module0012.$g67$.rebind(var41, var11);
                        module0012.$g65$.rebind(var40, var11);
                        module0012.$g73$.rebind(var39, var11);
                    }
                }
            }
            else if (var21.eql((SubLObject)module0479.$ic8$)) {
                SubLObject var54;
                SubLObject var55;
                for (var54 = (SubLObject)module0479.NIL, var54 = module0218.f14453(module0158.f10301(var19), (SubLObject)module0479.UNPROVIDED); module0479.NIL == var15 && module0479.NIL != var54; var54 = var54.rest()) {
                    var55 = var54.first();
                    if (module0479.NIL == module0130.f8518(var14) || module0479.NIL != module0178.f11343(var55, module0130.f8518(var14))) {
                        var15 = f31693(var55, var18);
                    }
                }
            }
            else {
                module0158.f10295(var19, var20);
            }
            if (module0479.NIL == var15) {
                module0347.f23330(module0191.f11990((SubLObject)module0479.$ic13$, module0205.f13338(var1), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31693(final SubLObject var30, final SubLObject var78) {
        if (module0479.NIL != module0351.f23568(var30)) {
            final SubLObject var79 = module0178.f11285(var30);
            return module0035.sublisp_boolean(module0235.f15476(var78, var79, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED));
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31689(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        if (module0479.NIL != module0193.f12105(var3)) {
            return module0018.$g658$.getDynamicValue(var2);
        }
        final SubLObject var4 = module0202.f12826(var3);
        final SubLObject var5 = module0202.f12828(var3);
        return module0349.f23451(var4, var5);
    }
    
    public static SubLObject f31694(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return f31689(var1);
    }
    
    public static SubLObject f31695(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0479.NIL;
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var5 = module0202.f12826(var4);
        final SubLObject var6 = module0202.f12828(var4);
        final SubLObject var7 = module0349.f23449(var5, var6);
        final SubLObject var9;
        final SubLObject var8 = var9 = module0158.f10294(var7);
        if (var9.eql((SubLObject)module0479.$ic5$)) {
            var2.resetMultipleValues();
            final SubLObject var10 = module0158.f10297(var7);
            final SubLObject var11 = var2.secondMultipleValue();
            final SubLObject var12 = var2.thirdMultipleValue();
            var2.resetMultipleValues();
            if (module0479.NIL != var11) {
                if (module0479.NIL != var12) {
                    final SubLObject var13 = var12;
                    if (module0479.NIL != module0158.f10010(var10, var11, var13)) {
                        final SubLObject var14 = module0158.f10011(var10, var11, var13);
                        SubLObject var15 = (SubLObject)module0479.NIL;
                        final SubLObject var16 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                            if (module0479.NIL != var18) {
                                SubLObject var19 = (SubLObject)module0479.NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                    SubLObject var23_99 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_100 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_99) {
                                        final SubLObject var20 = module0052.f3695(var19, var24_100);
                                        final SubLObject var26_101 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_100.eql(var20));
                                        if (module0479.NIL != var26_101 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var5, module0178.f11285(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                            var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                        }
                                        var23_99 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_101);
                                    }
                                }
                                finally {
                                    final SubLObject var21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                        if (module0479.NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var21, var2);
                                    }
                                }
                            }
                            var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                        }
                    }
                }
                else {
                    final SubLObject var13 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var10, var11, var13)) {
                        final SubLObject var14 = module0158.f10011(var10, var11, var13);
                        SubLObject var15 = (SubLObject)module0479.NIL;
                        final SubLObject var16 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                            if (module0479.NIL != var18) {
                                SubLObject var19 = (SubLObject)module0479.NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                    SubLObject var23_100 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_101 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_100) {
                                        final SubLObject var20 = module0052.f3695(var19, var24_101);
                                        final SubLObject var26_102 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_101.eql(var20));
                                        if (module0479.NIL != var26_102 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var5, module0178.f11285(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                            var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                        }
                                        var23_100 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_102);
                                    }
                                }
                                finally {
                                    final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                        if (module0479.NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var22, var2);
                                    }
                                }
                            }
                            var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                        }
                    }
                }
            }
            else if (module0479.NIL != var12) {
                final SubLObject var13 = var12;
                if (module0479.NIL != module0158.f10010(var10, (SubLObject)module0479.NIL, var13)) {
                    final SubLObject var14 = module0158.f10011(var10, (SubLObject)module0479.NIL, var13);
                    SubLObject var15 = (SubLObject)module0479.NIL;
                    final SubLObject var16 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var15) {
                        final SubLObject var17 = module0052.f3695(var14, var16);
                        final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                        if (module0479.NIL != var18) {
                            SubLObject var19 = (SubLObject)module0479.NIL;
                            try {
                                var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                SubLObject var23_101 = (SubLObject)module0479.NIL;
                                final SubLObject var24_102 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_101) {
                                    final SubLObject var20 = module0052.f3695(var19, var24_102);
                                    final SubLObject var26_103 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_102.eql(var20));
                                    if (module0479.NIL != var26_103 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var5, module0178.f11285(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                    }
                                    var23_101 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_103);
                                }
                            }
                            finally {
                                final SubLObject var23 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                    if (module0479.NIL != var19) {
                                        module0158.f10319(var19);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var23, var2);
                                }
                            }
                        }
                        var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                    }
                }
            }
            else {
                final SubLObject var13 = (SubLObject)module0479.NIL;
                if (module0479.NIL != module0158.f10010(var10, (SubLObject)module0479.NIL, var13)) {
                    final SubLObject var14 = module0158.f10011(var10, (SubLObject)module0479.NIL, var13);
                    SubLObject var15 = (SubLObject)module0479.NIL;
                    final SubLObject var16 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var15) {
                        final SubLObject var17 = module0052.f3695(var14, var16);
                        final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                        if (module0479.NIL != var18) {
                            SubLObject var19 = (SubLObject)module0479.NIL;
                            try {
                                var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                SubLObject var23_102 = (SubLObject)module0479.NIL;
                                final SubLObject var24_103 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_102) {
                                    final SubLObject var20 = module0052.f3695(var19, var24_103);
                                    final SubLObject var26_104 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_103.eql(var20));
                                    if (module0479.NIL != var26_104 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var5, module0178.f11285(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                    }
                                    var23_102 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_104);
                                }
                            }
                            finally {
                                final SubLObject var24 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                    if (module0479.NIL != var19) {
                                        module0158.f10319(var19);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var24, var2);
                                }
                            }
                        }
                        var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                    }
                }
            }
        }
        else if (var9.eql((SubLObject)module0479.$ic7$)) {
            final SubLObject var25 = module0158.f10299(var7);
            if (module0479.NIL != module0158.f10038(var25)) {
                final SubLObject var26 = (SubLObject)module0479.NIL;
                final SubLObject var27 = module0012.$g73$.currentBinding(var2);
                final SubLObject var28 = module0012.$g65$.currentBinding(var2);
                final SubLObject var29 = module0012.$g67$.currentBinding(var2);
                final SubLObject var30 = module0012.$g68$.currentBinding(var2);
                final SubLObject var31 = module0012.$g66$.currentBinding(var2);
                final SubLObject var32 = module0012.$g69$.currentBinding(var2);
                final SubLObject var33 = module0012.$g70$.currentBinding(var2);
                final SubLObject var34 = module0012.$silent_progressP$.currentBinding(var2);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var2);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                    module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var2);
                    module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                    module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                    module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                    module0012.$g70$.bind((SubLObject)module0479.T, var2);
                    module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var26) ? module0012.$silent_progressP$.getDynamicValue(var2) : module0479.T), var2);
                    module0012.f474(var26);
                    final SubLObject var35 = module0158.f10039(var25);
                    SubLObject var36 = (SubLObject)module0479.NIL;
                    final SubLObject var37 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var36) {
                        final SubLObject var38 = module0052.f3695(var35, var37);
                        final SubLObject var39 = (SubLObject)SubLObjectFactory.makeBoolean(!var37.eql(var38));
                        if (module0479.NIL != var39) {
                            module0012.f476();
                            SubLObject var40 = (SubLObject)module0479.NIL;
                            try {
                                var40 = module0158.f10316(var38, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                SubLObject var23_103 = (SubLObject)module0479.NIL;
                                final SubLObject var24_104 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_103) {
                                    final SubLObject var41 = module0052.f3695(var40, var24_104);
                                    final SubLObject var26_105 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_104.eql(var41));
                                    if (module0479.NIL != var26_105 && module0479.NIL != module0351.f23568(var41) && module0479.NIL != module0235.f15476(var5, module0178.f11285(var41), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var41, var3);
                                    }
                                    var23_103 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_105);
                                }
                            }
                            finally {
                                final SubLObject var35_114 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                    if (module0479.NIL != var40) {
                                        module0158.f10319(var40);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var35_114, var2);
                                }
                            }
                        }
                        var36 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var39);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var34, var2);
                    module0012.$g70$.rebind(var33, var2);
                    module0012.$g69$.rebind(var32, var2);
                    module0012.$g66$.rebind(var31, var2);
                    module0012.$g68$.rebind(var30, var2);
                    module0012.$g67$.rebind(var29, var2);
                    module0012.$g65$.rebind(var28, var2);
                    module0012.$g73$.rebind(var27, var2);
                }
            }
        }
        else if (var9.eql((SubLObject)module0479.$ic8$)) {
            SubLObject var42 = module0218.f14453(module0158.f10301(var7), (SubLObject)module0479.UNPROVIDED);
            SubLObject var43 = (SubLObject)module0479.NIL;
            var43 = var42.first();
            while (module0479.NIL != var42) {
                if ((module0479.NIL == module0130.f8518(var6) || module0479.NIL != module0178.f11343(var43, module0130.f8518(var6))) && module0479.NIL != module0351.f23568(var43) && module0479.NIL != module0235.f15476(var5, module0178.f11285(var43), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                    var3 = (SubLObject)ConsesLow.cons(var43, var3);
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        else {
            module0158.f10295(var7, var8);
        }
        if (module0479.NIL != var3) {
            return module0052.f3709(var3);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31696(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return f31689(var1);
    }
    
    public static SubLObject f31697(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0479.NIL;
        final SubLObject var4 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var5 = module0202.f12826(var4);
        final SubLObject var6 = module0202.f12828(var4);
        final SubLObject var7 = module0349.f23449(var5, var6);
        final SubLObject var9;
        final SubLObject var8 = var9 = module0158.f10294(var7);
        if (var9.eql((SubLObject)module0479.$ic5$)) {
            var2.resetMultipleValues();
            final SubLObject var10 = module0158.f10297(var7);
            final SubLObject var11 = var2.secondMultipleValue();
            final SubLObject var12 = var2.thirdMultipleValue();
            var2.resetMultipleValues();
            if (module0479.NIL != var11) {
                if (module0479.NIL != var12) {
                    final SubLObject var13 = var12;
                    if (module0479.NIL != module0158.f10010(var10, var11, var13)) {
                        final SubLObject var14 = module0158.f10011(var10, var11, var13);
                        SubLObject var15 = (SubLObject)module0479.NIL;
                        final SubLObject var16 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                            if (module0479.NIL != var18) {
                                SubLObject var19 = (SubLObject)module0479.NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                    SubLObject var23_115 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_116 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_115) {
                                        final SubLObject var20 = module0052.f3695(var19, var24_116);
                                        final SubLObject var26_117 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_116.eql(var20));
                                        if (module0479.NIL != var26_117 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                            var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                        }
                                        var23_115 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_117);
                                    }
                                }
                                finally {
                                    final SubLObject var21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                        if (module0479.NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var21, var2);
                                    }
                                }
                            }
                            var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                        }
                    }
                }
                else {
                    final SubLObject var13 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var10, var11, var13)) {
                        final SubLObject var14 = module0158.f10011(var10, var11, var13);
                        SubLObject var15 = (SubLObject)module0479.NIL;
                        final SubLObject var16 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                            if (module0479.NIL != var18) {
                                SubLObject var19 = (SubLObject)module0479.NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                    SubLObject var23_116 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_117 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_116) {
                                        final SubLObject var20 = module0052.f3695(var19, var24_117);
                                        final SubLObject var26_118 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_117.eql(var20));
                                        if (module0479.NIL != var26_118 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                            var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                        }
                                        var23_116 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_118);
                                    }
                                }
                                finally {
                                    final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                        if (module0479.NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var22, var2);
                                    }
                                }
                            }
                            var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                        }
                    }
                }
            }
            else if (module0479.NIL != var12) {
                final SubLObject var13 = var12;
                if (module0479.NIL != module0158.f10010(var10, (SubLObject)module0479.NIL, var13)) {
                    final SubLObject var14 = module0158.f10011(var10, (SubLObject)module0479.NIL, var13);
                    SubLObject var15 = (SubLObject)module0479.NIL;
                    final SubLObject var16 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var15) {
                        final SubLObject var17 = module0052.f3695(var14, var16);
                        final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                        if (module0479.NIL != var18) {
                            SubLObject var19 = (SubLObject)module0479.NIL;
                            try {
                                var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                SubLObject var23_117 = (SubLObject)module0479.NIL;
                                final SubLObject var24_118 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_117) {
                                    final SubLObject var20 = module0052.f3695(var19, var24_118);
                                    final SubLObject var26_119 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_118.eql(var20));
                                    if (module0479.NIL != var26_119 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                    }
                                    var23_117 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_119);
                                }
                            }
                            finally {
                                final SubLObject var23 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                    if (module0479.NIL != var19) {
                                        module0158.f10319(var19);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var23, var2);
                                }
                            }
                        }
                        var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                    }
                }
            }
            else {
                final SubLObject var13 = (SubLObject)module0479.NIL;
                if (module0479.NIL != module0158.f10010(var10, (SubLObject)module0479.NIL, var13)) {
                    final SubLObject var14 = module0158.f10011(var10, (SubLObject)module0479.NIL, var13);
                    SubLObject var15 = (SubLObject)module0479.NIL;
                    final SubLObject var16 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var15) {
                        final SubLObject var17 = module0052.f3695(var14, var16);
                        final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                        if (module0479.NIL != var18) {
                            SubLObject var19 = (SubLObject)module0479.NIL;
                            try {
                                var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                SubLObject var23_118 = (SubLObject)module0479.NIL;
                                final SubLObject var24_119 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_118) {
                                    final SubLObject var20 = module0052.f3695(var19, var24_119);
                                    final SubLObject var26_120 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_119.eql(var20));
                                    if (module0479.NIL != var26_120 && module0479.NIL != module0351.f23568(var20) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var20), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var20, var3);
                                    }
                                    var23_118 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_120);
                                }
                            }
                            finally {
                                final SubLObject var24 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                    if (module0479.NIL != var19) {
                                        module0158.f10319(var19);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var24, var2);
                                }
                            }
                        }
                        var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                    }
                }
            }
        }
        else if (var9.eql((SubLObject)module0479.$ic7$)) {
            final SubLObject var25 = module0158.f10299(var7);
            if (module0479.NIL != module0158.f10038(var25)) {
                final SubLObject var26 = (SubLObject)module0479.NIL;
                final SubLObject var27 = module0012.$g73$.currentBinding(var2);
                final SubLObject var28 = module0012.$g65$.currentBinding(var2);
                final SubLObject var29 = module0012.$g67$.currentBinding(var2);
                final SubLObject var30 = module0012.$g68$.currentBinding(var2);
                final SubLObject var31 = module0012.$g66$.currentBinding(var2);
                final SubLObject var32 = module0012.$g69$.currentBinding(var2);
                final SubLObject var33 = module0012.$g70$.currentBinding(var2);
                final SubLObject var34 = module0012.$silent_progressP$.currentBinding(var2);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var2);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                    module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var2);
                    module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                    module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                    module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var2);
                    module0012.$g70$.bind((SubLObject)module0479.T, var2);
                    module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var26) ? module0012.$silent_progressP$.getDynamicValue(var2) : module0479.T), var2);
                    module0012.f474(var26);
                    final SubLObject var35 = module0158.f10039(var25);
                    SubLObject var36 = (SubLObject)module0479.NIL;
                    final SubLObject var37 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var36) {
                        final SubLObject var38 = module0052.f3695(var35, var37);
                        final SubLObject var39 = (SubLObject)SubLObjectFactory.makeBoolean(!var37.eql(var38));
                        if (module0479.NIL != var39) {
                            module0012.f476();
                            SubLObject var40 = (SubLObject)module0479.NIL;
                            try {
                                var40 = module0158.f10316(var38, (SubLObject)module0479.$ic6$, module0130.f8518(var6), (SubLObject)module0479.NIL);
                                SubLObject var23_119 = (SubLObject)module0479.NIL;
                                final SubLObject var24_120 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_119) {
                                    final SubLObject var41 = module0052.f3695(var40, var24_120);
                                    final SubLObject var26_121 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_120.eql(var41));
                                    if (module0479.NIL != var26_121 && module0479.NIL != module0351.f23568(var41) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var41), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var41, var3);
                                    }
                                    var23_119 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_121);
                                }
                            }
                            finally {
                                final SubLObject var35_130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var2);
                                    if (module0479.NIL != var40) {
                                        module0158.f10319(var40);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var35_130, var2);
                                }
                            }
                        }
                        var36 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var39);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var34, var2);
                    module0012.$g70$.rebind(var33, var2);
                    module0012.$g69$.rebind(var32, var2);
                    module0012.$g66$.rebind(var31, var2);
                    module0012.$g68$.rebind(var30, var2);
                    module0012.$g67$.rebind(var29, var2);
                    module0012.$g65$.rebind(var28, var2);
                    module0012.$g73$.rebind(var27, var2);
                }
            }
        }
        else if (var9.eql((SubLObject)module0479.$ic8$)) {
            SubLObject var42 = module0218.f14453(module0158.f10301(var7), (SubLObject)module0479.UNPROVIDED);
            SubLObject var43 = (SubLObject)module0479.NIL;
            var43 = var42.first();
            while (module0479.NIL != var42) {
                if ((module0479.NIL == module0130.f8518(var6) || module0479.NIL != module0178.f11343(var43, module0130.f8518(var6))) && module0479.NIL != module0351.f23568(var43) && module0479.NIL != module0235.f15476(var4, module0178.f11304(var43), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                    var3 = (SubLObject)ConsesLow.cons(var43, var3);
                }
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        else {
            module0158.f10295(var7, var8);
        }
        if (module0479.NIL != var3) {
            return module0052.f3709(var3);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31698(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return module0435.f30613(f31689(var1));
    }
    
    public static SubLObject f31699(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var13 = module0202.f12826(var12);
        final SubLObject var14 = module0202.f12828(var12);
        SubLObject var15 = (SubLObject)module0479.NIL;
        final SubLObject var16 = module0349.f23449(var13, var14);
        final SubLObject var18;
        final SubLObject var17 = var18 = module0158.f10294(var16);
        if (var18.eql((SubLObject)module0479.$ic5$)) {
            var11.resetMultipleValues();
            final SubLObject var19 = module0158.f10297(var16);
            final SubLObject var20 = var11.secondMultipleValue();
            final SubLObject var21 = var11.thirdMultipleValue();
            var11.resetMultipleValues();
            if (module0479.NIL != var20) {
                if (module0479.NIL != var21) {
                    final SubLObject var22 = var21;
                    if (module0479.NIL != module0158.f10010(var19, var20, var22)) {
                        final SubLObject var23 = module0158.f10011(var19, var20, var22);
                        SubLObject var24 = var15;
                        final SubLObject var25 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var24) {
                            final SubLObject var26 = module0052.f3695(var23, var25);
                            final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(!var25.eql(var26));
                            if (module0479.NIL != var27) {
                                SubLObject var28 = (SubLObject)module0479.NIL;
                                try {
                                    var28 = module0158.f10316(var26, (SubLObject)module0479.$ic6$, module0130.f8518(var14), (SubLObject)module0479.NIL);
                                    SubLObject var23_131 = var15;
                                    final SubLObject var24_132 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_131) {
                                        final SubLObject var29 = module0052.f3695(var28, var24_132);
                                        final SubLObject var26_133 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_132.eql(var29));
                                        if (module0479.NIL != var26_133) {
                                            var15 = f31693(var29, var1);
                                        }
                                        var23_131 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_133 || module0479.NIL != var15);
                                    }
                                }
                                finally {
                                    final SubLObject var30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var28) {
                                            module0158.f10319(var28);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var30, var11);
                                    }
                                }
                            }
                            var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var27 || module0479.NIL != var15);
                        }
                    }
                }
                else {
                    final SubLObject var22 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var19, var20, var22)) {
                        final SubLObject var23 = module0158.f10011(var19, var20, var22);
                        SubLObject var24 = var15;
                        final SubLObject var25 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var24) {
                            final SubLObject var26 = module0052.f3695(var23, var25);
                            final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(!var25.eql(var26));
                            if (module0479.NIL != var27) {
                                SubLObject var28 = (SubLObject)module0479.NIL;
                                try {
                                    var28 = module0158.f10316(var26, (SubLObject)module0479.$ic6$, module0130.f8518(var14), (SubLObject)module0479.NIL);
                                    SubLObject var23_132 = var15;
                                    final SubLObject var24_133 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_132) {
                                        final SubLObject var29 = module0052.f3695(var28, var24_133);
                                        final SubLObject var26_134 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_133.eql(var29));
                                        if (module0479.NIL != var26_134) {
                                            var15 = f31693(var29, var1);
                                        }
                                        var23_132 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_134 || module0479.NIL != var15);
                                    }
                                }
                                finally {
                                    final SubLObject var31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var28) {
                                            module0158.f10319(var28);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var31, var11);
                                    }
                                }
                            }
                            var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var27 || module0479.NIL != var15);
                        }
                    }
                }
            }
            else if (module0479.NIL != var21) {
                final SubLObject var22 = var21;
                if (module0479.NIL != module0158.f10010(var19, (SubLObject)module0479.NIL, var22)) {
                    final SubLObject var23 = module0158.f10011(var19, (SubLObject)module0479.NIL, var22);
                    SubLObject var24 = var15;
                    final SubLObject var25 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var24) {
                        final SubLObject var26 = module0052.f3695(var23, var25);
                        final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(!var25.eql(var26));
                        if (module0479.NIL != var27) {
                            SubLObject var28 = (SubLObject)module0479.NIL;
                            try {
                                var28 = module0158.f10316(var26, (SubLObject)module0479.$ic6$, module0130.f8518(var14), (SubLObject)module0479.NIL);
                                SubLObject var23_133 = var15;
                                final SubLObject var24_134 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_133) {
                                    final SubLObject var29 = module0052.f3695(var28, var24_134);
                                    final SubLObject var26_135 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_134.eql(var29));
                                    if (module0479.NIL != var26_135) {
                                        var15 = f31693(var29, var1);
                                    }
                                    var23_133 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_135 || module0479.NIL != var15);
                                }
                            }
                            finally {
                                final SubLObject var32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                    if (module0479.NIL != var28) {
                                        module0158.f10319(var28);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var32, var11);
                                }
                            }
                        }
                        var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var27 || module0479.NIL != var15);
                    }
                }
            }
            else {
                final SubLObject var22 = (SubLObject)module0479.NIL;
                if (module0479.NIL != module0158.f10010(var19, (SubLObject)module0479.NIL, var22)) {
                    final SubLObject var23 = module0158.f10011(var19, (SubLObject)module0479.NIL, var22);
                    SubLObject var24 = var15;
                    final SubLObject var25 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var24) {
                        final SubLObject var26 = module0052.f3695(var23, var25);
                        final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(!var25.eql(var26));
                        if (module0479.NIL != var27) {
                            SubLObject var28 = (SubLObject)module0479.NIL;
                            try {
                                var28 = module0158.f10316(var26, (SubLObject)module0479.$ic6$, module0130.f8518(var14), (SubLObject)module0479.NIL);
                                SubLObject var23_134 = var15;
                                final SubLObject var24_135 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_134) {
                                    final SubLObject var29 = module0052.f3695(var28, var24_135);
                                    final SubLObject var26_136 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_135.eql(var29));
                                    if (module0479.NIL != var26_136) {
                                        var15 = f31693(var29, var1);
                                    }
                                    var23_134 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_136 || module0479.NIL != var15);
                                }
                            }
                            finally {
                                final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                    if (module0479.NIL != var28) {
                                        module0158.f10319(var28);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33, var11);
                                }
                            }
                        }
                        var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var27 || module0479.NIL != var15);
                    }
                }
            }
        }
        else if (var18.eql((SubLObject)module0479.$ic7$)) {
            final SubLObject var34 = module0158.f10299(var16);
            if (module0479.NIL != module0158.f10038(var34)) {
                final SubLObject var35 = (SubLObject)module0479.NIL;
                final SubLObject var36 = module0012.$g73$.currentBinding(var11);
                final SubLObject var37 = module0012.$g65$.currentBinding(var11);
                final SubLObject var38 = module0012.$g67$.currentBinding(var11);
                final SubLObject var39 = module0012.$g68$.currentBinding(var11);
                final SubLObject var40 = module0012.$g66$.currentBinding(var11);
                final SubLObject var41 = module0012.$g69$.currentBinding(var11);
                final SubLObject var42 = module0012.$g70$.currentBinding(var11);
                final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var11);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var11);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var11), var11);
                    module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var11);
                    module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                    module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                    module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                    module0012.$g70$.bind((SubLObject)module0479.T, var11);
                    module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var35) ? module0012.$silent_progressP$.getDynamicValue(var11) : module0479.T), var11);
                    module0012.f474(var35);
                    final SubLObject var44 = module0158.f10039(var34);
                    SubLObject var45 = var15;
                    final SubLObject var46 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var45) {
                        final SubLObject var47 = module0052.f3695(var44, var46);
                        final SubLObject var48 = (SubLObject)SubLObjectFactory.makeBoolean(!var46.eql(var47));
                        if (module0479.NIL != var48) {
                            module0012.f476();
                            SubLObject var49 = (SubLObject)module0479.NIL;
                            try {
                                var49 = module0158.f10316(var47, (SubLObject)module0479.$ic6$, module0130.f8518(var14), (SubLObject)module0479.NIL);
                                SubLObject var23_135 = var15;
                                final SubLObject var24_136 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_135) {
                                    final SubLObject var50 = module0052.f3695(var49, var24_136);
                                    final SubLObject var26_137 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_136.eql(var50));
                                    if (module0479.NIL != var26_137) {
                                        var15 = f31693(var50, var1);
                                    }
                                    var23_135 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_137 || module0479.NIL != var15);
                                }
                            }
                            finally {
                                final SubLObject var35_146 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                    if (module0479.NIL != var49) {
                                        module0158.f10319(var49);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var35_146, var11);
                                }
                            }
                        }
                        var45 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var48 || module0479.NIL != var15);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var43, var11);
                    module0012.$g70$.rebind(var42, var11);
                    module0012.$g69$.rebind(var41, var11);
                    module0012.$g66$.rebind(var40, var11);
                    module0012.$g68$.rebind(var39, var11);
                    module0012.$g67$.rebind(var38, var11);
                    module0012.$g65$.rebind(var37, var11);
                    module0012.$g73$.rebind(var36, var11);
                }
            }
        }
        else if (var18.eql((SubLObject)module0479.$ic8$)) {
            SubLObject var51;
            SubLObject var52;
            for (var51 = (SubLObject)module0479.NIL, var51 = module0218.f14453(module0158.f10301(var16), (SubLObject)module0479.UNPROVIDED); module0479.NIL == var15 && module0479.NIL != var51; var51 = var51.rest()) {
                var52 = var51.first();
                if (module0479.NIL == module0130.f8518(var14) || module0479.NIL != module0178.f11343(var52, module0130.f8518(var14))) {
                    var15 = f31693(var52, var1);
                }
            }
        }
        else {
            module0158.f10295(var16, var17);
        }
        if (module0479.NIL == var15) {
            module0347.f23330(module0191.f11990((SubLObject)module0479.$ic13$, module0205.f13338(var1), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31700(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return f31701(var1);
    }
    
    public static SubLObject f31702(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        if (module0479.NIL != f31703(var1)) {
            module0347.f23330(module0191.f11990((SubLObject)module0479.$ic27$, var1, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31701(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var4 = module0205.f13389(var1, (SubLObject)module0479.UNPROVIDED);
        return Numbers.min((SubLObject)module0479.ONE_INTEGER, module0217.f14221(var2, var3, var4, (SubLObject)module0479.UNPROVIDED));
    }
    
    public static SubLObject f31703(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var4 = module0205.f13389(var1, (SubLObject)module0479.UNPROVIDED);
        return Numbers.plusp(module0217.f14223(var2, var3, var4));
    }
    
    public static SubLObject f31704(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return module0435.f30613(f31701(var1));
    }
    
    public static SubLObject f31705(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        if (module0479.NIL == f31703(var1)) {
            module0347.f23330(module0191.f11990((SubLObject)module0479.$ic13$, module0205.f13338(var1), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31706(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var12 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        return Sequences.length(module0349.f23457(var11, var12));
    }
    
    public static SubLObject f31707(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var14 = module0205.f13389(var1, (SubLObject)module0479.UNPROVIDED);
        SubLObject var16;
        final SubLObject var15 = var16 = module0349.f23457(var12, var13);
        SubLObject var17 = (SubLObject)module0479.NIL;
        var17 = var16.first();
        while (module0479.NIL != var16) {
            var11.resetMultipleValues();
            final SubLObject var18 = module0235.f15474(var14, var17, (SubLObject)module0479.T, (SubLObject)module0479.T);
            final SubLObject var19 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (module0479.NIL != var18) {
                final SubLObject var20 = module0233.f15361(var18, var1);
                final SubLObject var21 = module0191.f11990((SubLObject)module0479.$ic27$, var20, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
                module0347.f23330(var21, var18, var19);
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31708(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return Sequences.length(module0349.f23457(module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED), (SubLObject)module0479.UNPROVIDED));
    }
    
    public static SubLObject f31709(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        SubLObject var14;
        final SubLObject var13 = var14 = module0349.f23455(var12);
        SubLObject var15 = (SubLObject)module0479.NIL;
        var15 = var14.first();
        while (module0479.NIL != var14) {
            SubLObject var8_157;
            final SubLObject var16 = var8_157 = module0349.f23457(var12, var15);
            SubLObject var17 = (SubLObject)module0479.NIL;
            var17 = var8_157.first();
            while (module0479.NIL != var8_157) {
                final SubLObject var18 = (SubLObject)ConsesLow.list(module0479.$ic24$, var12, var15, var17);
                var11.resetMultipleValues();
                final SubLObject var19 = module0235.f15476(var1, var18, (SubLObject)module0479.T, (SubLObject)module0479.T);
                final SubLObject var20 = var11.secondMultipleValue();
                final SubLObject var21 = var11.thirdMultipleValue();
                var11.resetMultipleValues();
                if (module0479.NIL != var19) {
                    final SubLObject var22 = module0191.f11990((SubLObject)module0479.$ic27$, var18, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
                    module0347.f23330(var22, var19, var21);
                }
                var8_157 = var8_157.rest();
                var17 = var8_157.first();
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31710(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLObject var11 = module0205.f13389(var1, (SubLObject)module0479.UNPROVIDED);
        return module0217.f14247(var11, (SubLObject)module0479.UNPROVIDED);
    }
    
    public static SubLObject f31711(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var14 = module0205.f13389(var1, (SubLObject)module0479.UNPROVIDED);
        SubLObject var15 = module0220.f14567(var14, var13, (SubLObject)module0479.$ic36$);
        SubLObject var16 = (SubLObject)module0479.NIL;
        var16 = var15.first();
        while (module0479.NIL != var15) {
            var11.resetMultipleValues();
            final SubLObject var17 = module0235.f15474(var12, var16, (SubLObject)module0479.T, (SubLObject)module0479.T);
            final SubLObject var18 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (module0479.NIL != var17) {
                final SubLObject var19 = module0233.f15361(var17, var1);
                final SubLObject var20 = module0191.f11990((SubLObject)module0479.$ic27$, var19, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
                module0347.f23330(var20, var17, var18);
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31712(final SubLObject var153) {
        return module0191.f11990((SubLObject)module0479.$ic27$, var153, module0479.$g3696$.getGlobalValue(), (SubLObject)module0479.$ic43$);
    }
    
    public static SubLObject f31713(final SubLObject var147, final SubLObject var159) {
        assert module0479.NIL != module0206.f13486(var159) : var159;
        return module0205.f13220(var147, var159, (SubLObject)module0479.T, Symbols.symbol_function((SubLObject)module0479.EQUAL), (SubLObject)module0479.UNPROVIDED);
    }
    
    public static SubLObject f31714(SubLObject var159) {
        var159 = module0279.f18584(var159);
        assert module0479.NIL != module0206.f13486(var159) : var159;
        return module0035.remove_if_not((SubLObject)module0479.$ic45$, module0035.remove_if_not((SubLObject)module0479.$ic46$, module0205.f13183(var159, (SubLObject)module0479.$ic47$, (SubLObject)module0479.T, Symbols.symbol_function((SubLObject)module0479.EQUAL), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
    }
    
    public static SubLObject f31715(final SubLObject var159) {
        return Sequences.length(f31714(var159));
    }
    
    public static SubLObject f31716(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return f31717(var1);
    }
    
    public static SubLObject f31718(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        if (module0479.NIL != f31719(var1)) {
            module0347.f23330(f31712(var1), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31719(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        SubLObject var3 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        var3 = module0279.f18584(var3);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL != module0206.f13486(var3) && module0479.NIL != f31713(var2, var3));
    }
    
    public static SubLObject f31717(final SubLObject var1) {
        return (SubLObject)((module0479.NIL != f31719(var1)) ? module0018.$g659$.getGlobalValue() : module0479.ZERO_INTEGER);
    }
    
    public static SubLObject f31720(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return module0435.f30613(f31717(var1));
    }
    
    public static SubLObject f31721(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        if (module0479.NIL == f31719(var1)) {
            module0347.f23330(f31712(module0205.f13338(var1)), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31722(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLObject var11 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        return f31715(var11);
    }
    
    public static SubLObject f31723(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        SubLObject var15;
        final SubLObject var14 = var15 = f31714(var13);
        SubLObject var16 = (SubLObject)module0479.NIL;
        var16 = var15.first();
        while (module0479.NIL != var15) {
            var11.resetMultipleValues();
            final SubLObject var17 = module0235.f15474(var12, var16, (SubLObject)module0479.T, (SubLObject)module0479.T);
            final SubLObject var18 = var11.secondMultipleValue();
            var11.resetMultipleValues();
            if (module0479.NIL != var17) {
                final SubLObject var19 = module0233.f15361(var17, var1);
                module0347.f23330(f31712(var19), var17, var18);
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31724(final SubLObject var60) {
        return module0349.f23451(var60, (SubLObject)module0479.$ic40$);
    }
    
    public static SubLObject f31725(final SubLObject var147, SubLObject var149) {
        if (var149 == module0479.UNPROVIDED) {
            var149 = (SubLObject)module0479.NIL;
        }
        if (module0479.NIL == var149) {
            return module0217.f14223(var147, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
        }
        SubLObject var150 = (SubLObject)module0479.ZERO_INTEGER;
        SubLObject var151 = module0217.f14232(var147, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
        SubLObject var152 = (SubLObject)module0479.NIL;
        var152 = var151.first();
        while (module0479.NIL != var151) {
            var150 = Numbers.add(var150, module0217.f14223(var147, var152, var149));
            var151 = var151.rest();
            var152 = var151.first();
        }
        return var150;
    }
    
    public static SubLObject f31726(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return f31727(var1);
    }
    
    public static SubLObject f31728(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        if (module0479.NIL != f31713(var12, var13)) {
            final SubLObject var14 = module0349.f23449(var13, (SubLObject)module0479.$ic40$);
            final SubLObject var16;
            final SubLObject var15 = var16 = module0158.f10294(var14);
            if (var16.eql((SubLObject)module0479.$ic5$)) {
                var11.resetMultipleValues();
                final SubLObject var18_163 = module0158.f10297(var14);
                final SubLObject var17 = var11.secondMultipleValue();
                final SubLObject var18 = var11.thirdMultipleValue();
                var11.resetMultipleValues();
                if (module0479.NIL != var17) {
                    if (module0479.NIL != var18) {
                        final SubLObject var19 = var18;
                        if (module0479.NIL != module0158.f10010(var18_163, var17, var19)) {
                            final SubLObject var20 = module0158.f10011(var18_163, var17, var19);
                            SubLObject var21 = (SubLObject)module0479.NIL;
                            final SubLObject var22 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var21) {
                                final SubLObject var23 = module0052.f3695(var20, var22);
                                final SubLObject var24 = (SubLObject)SubLObjectFactory.makeBoolean(!var22.eql(var23));
                                if (module0479.NIL != var24) {
                                    SubLObject var25 = (SubLObject)module0479.NIL;
                                    try {
                                        var25 = module0158.f10316(var23, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_164 = (SubLObject)module0479.NIL;
                                        final SubLObject var24_165 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_164) {
                                            final SubLObject var26 = module0052.f3695(var25, var24_165);
                                            final SubLObject var26_166 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_165.eql(var26));
                                            if (module0479.NIL != var26_166) {
                                                module0436.f30642(var26, var13);
                                            }
                                            var23_164 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_166);
                                        }
                                    }
                                    finally {
                                        final SubLObject var27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var25) {
                                                module0158.f10319(var25);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var27, var11);
                                        }
                                    }
                                }
                                var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var24);
                            }
                        }
                    }
                    else {
                        final SubLObject var19 = (SubLObject)module0479.NIL;
                        if (module0479.NIL != module0158.f10010(var18_163, var17, var19)) {
                            final SubLObject var20 = module0158.f10011(var18_163, var17, var19);
                            SubLObject var21 = (SubLObject)module0479.NIL;
                            final SubLObject var22 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var21) {
                                final SubLObject var23 = module0052.f3695(var20, var22);
                                final SubLObject var24 = (SubLObject)SubLObjectFactory.makeBoolean(!var22.eql(var23));
                                if (module0479.NIL != var24) {
                                    SubLObject var25 = (SubLObject)module0479.NIL;
                                    try {
                                        var25 = module0158.f10316(var23, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_165 = (SubLObject)module0479.NIL;
                                        final SubLObject var24_166 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_165) {
                                            final SubLObject var26 = module0052.f3695(var25, var24_166);
                                            final SubLObject var26_167 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_166.eql(var26));
                                            if (module0479.NIL != var26_167) {
                                                module0436.f30642(var26, var13);
                                            }
                                            var23_165 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_167);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var25) {
                                                module0158.f10319(var25);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28, var11);
                                        }
                                    }
                                }
                                var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var24);
                            }
                        }
                    }
                }
                else if (module0479.NIL != var18) {
                    final SubLObject var19 = var18;
                    if (module0479.NIL != module0158.f10010(var18_163, (SubLObject)module0479.NIL, var19)) {
                        final SubLObject var20 = module0158.f10011(var18_163, (SubLObject)module0479.NIL, var19);
                        SubLObject var21 = (SubLObject)module0479.NIL;
                        final SubLObject var22 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var21) {
                            final SubLObject var23 = module0052.f3695(var20, var22);
                            final SubLObject var24 = (SubLObject)SubLObjectFactory.makeBoolean(!var22.eql(var23));
                            if (module0479.NIL != var24) {
                                SubLObject var25 = (SubLObject)module0479.NIL;
                                try {
                                    var25 = module0158.f10316(var23, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_166 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_167 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_166) {
                                        final SubLObject var26 = module0052.f3695(var25, var24_167);
                                        final SubLObject var26_168 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_167.eql(var26));
                                        if (module0479.NIL != var26_168) {
                                            module0436.f30642(var26, var13);
                                        }
                                        var23_166 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_168);
                                    }
                                }
                                finally {
                                    final SubLObject var29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var25) {
                                            module0158.f10319(var25);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var29, var11);
                                    }
                                }
                            }
                            var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var24);
                        }
                    }
                }
                else {
                    final SubLObject var19 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var18_163, (SubLObject)module0479.NIL, var19)) {
                        final SubLObject var20 = module0158.f10011(var18_163, (SubLObject)module0479.NIL, var19);
                        SubLObject var21 = (SubLObject)module0479.NIL;
                        final SubLObject var22 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var21) {
                            final SubLObject var23 = module0052.f3695(var20, var22);
                            final SubLObject var24 = (SubLObject)SubLObjectFactory.makeBoolean(!var22.eql(var23));
                            if (module0479.NIL != var24) {
                                SubLObject var25 = (SubLObject)module0479.NIL;
                                try {
                                    var25 = module0158.f10316(var23, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_167 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_168 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_167) {
                                        final SubLObject var26 = module0052.f3695(var25, var24_168);
                                        final SubLObject var26_169 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_168.eql(var26));
                                        if (module0479.NIL != var26_169) {
                                            module0436.f30642(var26, var13);
                                        }
                                        var23_167 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_169);
                                    }
                                }
                                finally {
                                    final SubLObject var30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var25) {
                                            module0158.f10319(var25);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var30, var11);
                                    }
                                }
                            }
                            var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var24);
                        }
                    }
                }
            }
            else if (var16.eql((SubLObject)module0479.$ic7$)) {
                final SubLObject var31 = module0158.f10299(var14);
                if (module0479.NIL != module0158.f10038(var31)) {
                    final SubLObject var32 = (SubLObject)module0479.NIL;
                    final SubLObject var33 = module0012.$g73$.currentBinding(var11);
                    final SubLObject var34 = module0012.$g65$.currentBinding(var11);
                    final SubLObject var35 = module0012.$g67$.currentBinding(var11);
                    final SubLObject var36 = module0012.$g68$.currentBinding(var11);
                    final SubLObject var37 = module0012.$g66$.currentBinding(var11);
                    final SubLObject var38 = module0012.$g69$.currentBinding(var11);
                    final SubLObject var39 = module0012.$g70$.currentBinding(var11);
                    final SubLObject var40 = module0012.$silent_progressP$.currentBinding(var11);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var11);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var11), var11);
                        module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var11);
                        module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g70$.bind((SubLObject)module0479.T, var11);
                        module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var32) ? module0012.$silent_progressP$.getDynamicValue(var11) : module0479.T), var11);
                        module0012.f474(var32);
                        final SubLObject var41 = module0158.f10039(var31);
                        SubLObject var42 = (SubLObject)module0479.NIL;
                        final SubLObject var43 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var42) {
                            final SubLObject var44 = module0052.f3695(var41, var43);
                            final SubLObject var45 = (SubLObject)SubLObjectFactory.makeBoolean(!var43.eql(var44));
                            if (module0479.NIL != var45) {
                                module0012.f476();
                                SubLObject var46 = (SubLObject)module0479.NIL;
                                try {
                                    var46 = module0158.f10316(var44, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_168 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_169 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_168) {
                                        final SubLObject var47 = module0052.f3695(var46, var24_169);
                                        final SubLObject var26_170 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_169.eql(var47));
                                        if (module0479.NIL != var26_170) {
                                            module0436.f30642(var47, var13);
                                        }
                                        var23_168 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_170);
                                    }
                                }
                                finally {
                                    final SubLObject var35_179 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var46) {
                                            module0158.f10319(var46);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_179, var11);
                                    }
                                }
                            }
                            var42 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var45);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var40, var11);
                        module0012.$g70$.rebind(var39, var11);
                        module0012.$g69$.rebind(var38, var11);
                        module0012.$g66$.rebind(var37, var11);
                        module0012.$g68$.rebind(var36, var11);
                        module0012.$g67$.rebind(var35, var11);
                        module0012.$g65$.rebind(var34, var11);
                        module0012.$g73$.rebind(var33, var11);
                    }
                }
            }
            else if (var16.eql((SubLObject)module0479.$ic8$)) {
                SubLObject var48 = module0218.f14453(module0158.f10301(var14), (SubLObject)module0479.UNPROVIDED);
                SubLObject var49 = (SubLObject)module0479.NIL;
                var49 = var48.first();
                while (module0479.NIL != var48) {
                    if (module0479.NIL == module0130.f8518((SubLObject)module0479.$ic40$) || module0479.NIL != module0178.f11343(var49, module0130.f8518((SubLObject)module0479.$ic40$))) {
                        module0436.f30642(var49, var13);
                    }
                    var48 = var48.rest();
                    var49 = var48.first();
                }
            }
            else {
                module0158.f10295(var14, var15);
            }
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31727(final SubLObject var1) {
        final SubLObject var2 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var3 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        return (SubLObject)((module0479.NIL != f31713(var2, var3)) ? f31724(var3) : module0479.ZERO_INTEGER);
    }
    
    public static SubLObject f31729(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return module0435.f30613(f31727(var1));
    }
    
    public static SubLObject f31730(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        SubLObject var14 = (SubLObject)module0479.NIL;
        if (module0479.NIL != f31713(var12, var13)) {
            final SubLObject var15 = module0349.f23449(var13, (SubLObject)module0479.$ic40$);
            final SubLObject var17;
            final SubLObject var16 = var17 = module0158.f10294(var15);
            if (var17.eql((SubLObject)module0479.$ic5$)) {
                var11.resetMultipleValues();
                final SubLObject var18_180 = module0158.f10297(var15);
                final SubLObject var18 = var11.secondMultipleValue();
                final SubLObject var19 = var11.thirdMultipleValue();
                var11.resetMultipleValues();
                if (module0479.NIL != var18) {
                    if (module0479.NIL != var19) {
                        final SubLObject var20 = var19;
                        if (module0479.NIL != module0158.f10010(var18_180, var18, var20)) {
                            final SubLObject var21 = module0158.f10011(var18_180, var18, var20);
                            SubLObject var22 = var14;
                            final SubLObject var23 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var22) {
                                final SubLObject var24 = module0052.f3695(var21, var23);
                                final SubLObject var25 = (SubLObject)SubLObjectFactory.makeBoolean(!var23.eql(var24));
                                if (module0479.NIL != var25) {
                                    SubLObject var26 = (SubLObject)module0479.NIL;
                                    try {
                                        var26 = module0158.f10316(var24, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_181 = var14;
                                        final SubLObject var24_182 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_181) {
                                            final SubLObject var27 = module0052.f3695(var26, var24_182);
                                            final SubLObject var26_183 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_182.eql(var27));
                                            if (module0479.NIL != var26_183) {
                                                var14 = f31731(var27, var12, var13);
                                            }
                                            var23_181 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_183 || module0479.NIL != var14);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var26) {
                                                module0158.f10319(var26);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28, var11);
                                        }
                                    }
                                }
                                var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var25 || module0479.NIL != var14);
                            }
                        }
                    }
                    else {
                        final SubLObject var20 = (SubLObject)module0479.NIL;
                        if (module0479.NIL != module0158.f10010(var18_180, var18, var20)) {
                            final SubLObject var21 = module0158.f10011(var18_180, var18, var20);
                            SubLObject var22 = var14;
                            final SubLObject var23 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var22) {
                                final SubLObject var24 = module0052.f3695(var21, var23);
                                final SubLObject var25 = (SubLObject)SubLObjectFactory.makeBoolean(!var23.eql(var24));
                                if (module0479.NIL != var25) {
                                    SubLObject var26 = (SubLObject)module0479.NIL;
                                    try {
                                        var26 = module0158.f10316(var24, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_182 = var14;
                                        final SubLObject var24_183 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_182) {
                                            final SubLObject var27 = module0052.f3695(var26, var24_183);
                                            final SubLObject var26_184 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_183.eql(var27));
                                            if (module0479.NIL != var26_184) {
                                                var14 = f31731(var27, var12, var13);
                                            }
                                            var23_182 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_184 || module0479.NIL != var14);
                                        }
                                    }
                                    finally {
                                        final SubLObject var29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var26) {
                                                module0158.f10319(var26);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var29, var11);
                                        }
                                    }
                                }
                                var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var25 || module0479.NIL != var14);
                            }
                        }
                    }
                }
                else if (module0479.NIL != var19) {
                    final SubLObject var20 = var19;
                    if (module0479.NIL != module0158.f10010(var18_180, (SubLObject)module0479.NIL, var20)) {
                        final SubLObject var21 = module0158.f10011(var18_180, (SubLObject)module0479.NIL, var20);
                        SubLObject var22 = var14;
                        final SubLObject var23 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var22) {
                            final SubLObject var24 = module0052.f3695(var21, var23);
                            final SubLObject var25 = (SubLObject)SubLObjectFactory.makeBoolean(!var23.eql(var24));
                            if (module0479.NIL != var25) {
                                SubLObject var26 = (SubLObject)module0479.NIL;
                                try {
                                    var26 = module0158.f10316(var24, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_183 = var14;
                                    final SubLObject var24_184 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_183) {
                                        final SubLObject var27 = module0052.f3695(var26, var24_184);
                                        final SubLObject var26_185 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_184.eql(var27));
                                        if (module0479.NIL != var26_185) {
                                            var14 = f31731(var27, var12, var13);
                                        }
                                        var23_183 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_185 || module0479.NIL != var14);
                                    }
                                }
                                finally {
                                    final SubLObject var30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var26) {
                                            module0158.f10319(var26);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var30, var11);
                                    }
                                }
                            }
                            var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var25 || module0479.NIL != var14);
                        }
                    }
                }
                else {
                    final SubLObject var20 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var18_180, (SubLObject)module0479.NIL, var20)) {
                        final SubLObject var21 = module0158.f10011(var18_180, (SubLObject)module0479.NIL, var20);
                        SubLObject var22 = var14;
                        final SubLObject var23 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var22) {
                            final SubLObject var24 = module0052.f3695(var21, var23);
                            final SubLObject var25 = (SubLObject)SubLObjectFactory.makeBoolean(!var23.eql(var24));
                            if (module0479.NIL != var25) {
                                SubLObject var26 = (SubLObject)module0479.NIL;
                                try {
                                    var26 = module0158.f10316(var24, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_184 = var14;
                                    final SubLObject var24_185 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_184) {
                                        final SubLObject var27 = module0052.f3695(var26, var24_185);
                                        final SubLObject var26_186 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_185.eql(var27));
                                        if (module0479.NIL != var26_186) {
                                            var14 = f31731(var27, var12, var13);
                                        }
                                        var23_184 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_186 || module0479.NIL != var14);
                                    }
                                }
                                finally {
                                    final SubLObject var31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var26) {
                                            module0158.f10319(var26);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var31, var11);
                                    }
                                }
                            }
                            var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var25 || module0479.NIL != var14);
                        }
                    }
                }
            }
            else if (var17.eql((SubLObject)module0479.$ic7$)) {
                final SubLObject var32 = module0158.f10299(var15);
                if (module0479.NIL != module0158.f10038(var32)) {
                    final SubLObject var33 = (SubLObject)module0479.NIL;
                    final SubLObject var34 = module0012.$g73$.currentBinding(var11);
                    final SubLObject var35 = module0012.$g65$.currentBinding(var11);
                    final SubLObject var36 = module0012.$g67$.currentBinding(var11);
                    final SubLObject var37 = module0012.$g68$.currentBinding(var11);
                    final SubLObject var38 = module0012.$g66$.currentBinding(var11);
                    final SubLObject var39 = module0012.$g69$.currentBinding(var11);
                    final SubLObject var40 = module0012.$g70$.currentBinding(var11);
                    final SubLObject var41 = module0012.$silent_progressP$.currentBinding(var11);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var11);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var11), var11);
                        module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var11);
                        module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g70$.bind((SubLObject)module0479.T, var11);
                        module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var33) ? module0012.$silent_progressP$.getDynamicValue(var11) : module0479.T), var11);
                        module0012.f474(var33);
                        final SubLObject var42 = module0158.f10039(var32);
                        SubLObject var43 = var14;
                        final SubLObject var44 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var43) {
                            final SubLObject var45 = module0052.f3695(var42, var44);
                            final SubLObject var46 = (SubLObject)SubLObjectFactory.makeBoolean(!var44.eql(var45));
                            if (module0479.NIL != var46) {
                                module0012.f476();
                                SubLObject var47 = (SubLObject)module0479.NIL;
                                try {
                                    var47 = module0158.f10316(var45, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_185 = var14;
                                    final SubLObject var24_186 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_185) {
                                        final SubLObject var48 = module0052.f3695(var47, var24_186);
                                        final SubLObject var26_187 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_186.eql(var48));
                                        if (module0479.NIL != var26_187) {
                                            var14 = f31731(var48, var12, var13);
                                        }
                                        var23_185 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_187 || module0479.NIL != var14);
                                    }
                                }
                                finally {
                                    final SubLObject var35_196 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var47) {
                                            module0158.f10319(var47);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_196, var11);
                                    }
                                }
                            }
                            var43 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var46 || module0479.NIL != var14);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var41, var11);
                        module0012.$g70$.rebind(var40, var11);
                        module0012.$g69$.rebind(var39, var11);
                        module0012.$g66$.rebind(var38, var11);
                        module0012.$g68$.rebind(var37, var11);
                        module0012.$g67$.rebind(var36, var11);
                        module0012.$g65$.rebind(var35, var11);
                        module0012.$g73$.rebind(var34, var11);
                    }
                }
            }
            else if (var17.eql((SubLObject)module0479.$ic8$)) {
                SubLObject var49;
                SubLObject var50;
                for (var49 = (SubLObject)module0479.NIL, var49 = module0218.f14453(module0158.f10301(var15), (SubLObject)module0479.UNPROVIDED); module0479.NIL == var14 && module0479.NIL != var49; var49 = var49.rest()) {
                    var50 = var49.first();
                    if (module0479.NIL == module0130.f8518((SubLObject)module0479.$ic40$) || module0479.NIL != module0178.f11343(var50, module0130.f8518((SubLObject)module0479.$ic40$))) {
                        var14 = f31731(var50, var12, var13);
                    }
                }
            }
            else {
                module0158.f10295(var15, var16);
            }
        }
        if (module0479.NIL == var14) {
            module0347.f23330(module0191.f11990((SubLObject)module0479.$ic13$, module0205.f13338(var1), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31731(final SubLObject var30, final SubLObject var147, final SubLObject var78) {
        if (module0479.NIL != module0351.f23568(var30)) {
            final SubLObject var148 = module0178.f11285(var30);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL != f31713(var147, var148) && module0479.NIL != module0235.f15476(var78, var148, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED));
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31732(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLObject var11 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var12 = f31715(var11);
        final SubLObject var13 = f31724(var11);
        return Numbers.multiply(var12, var13);
    }
    
    public static SubLObject f31733(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var14 = module0349.f23449(var13, (SubLObject)module0479.$ic40$);
        final SubLObject var16;
        final SubLObject var15 = var16 = module0158.f10294(var14);
        if (var16.eql((SubLObject)module0479.$ic5$)) {
            var11.resetMultipleValues();
            final SubLObject var17 = module0158.f10297(var14);
            final SubLObject var18 = var11.secondMultipleValue();
            final SubLObject var19 = var11.thirdMultipleValue();
            var11.resetMultipleValues();
            if (module0479.NIL != var18) {
                if (module0479.NIL != var19) {
                    final SubLObject var20 = var19;
                    if (module0479.NIL != module0158.f10010(var17, var18, var20)) {
                        final SubLObject var21 = module0158.f10011(var17, var18, var20);
                        SubLObject var22 = (SubLObject)module0479.NIL;
                        final SubLObject var23 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var22) {
                            final SubLObject var24 = module0052.f3695(var21, var23);
                            final SubLObject var25 = (SubLObject)SubLObjectFactory.makeBoolean(!var23.eql(var24));
                            if (module0479.NIL != var25) {
                                SubLObject var26 = (SubLObject)module0479.NIL;
                                try {
                                    var26 = module0158.f10316(var24, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_199 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_200 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_199) {
                                        final SubLObject var27 = module0052.f3695(var26, var24_200);
                                        final SubLObject var26_201 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_200.eql(var27));
                                        if (module0479.NIL != var26_201) {
                                            f31734(var27, var12, var13);
                                        }
                                        var23_199 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_201);
                                    }
                                }
                                finally {
                                    final SubLObject var28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var26) {
                                            module0158.f10319(var26);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var28, var11);
                                    }
                                }
                            }
                            var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var25);
                        }
                    }
                }
                else {
                    final SubLObject var20 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var17, var18, var20)) {
                        final SubLObject var21 = module0158.f10011(var17, var18, var20);
                        SubLObject var22 = (SubLObject)module0479.NIL;
                        final SubLObject var23 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var22) {
                            final SubLObject var24 = module0052.f3695(var21, var23);
                            final SubLObject var25 = (SubLObject)SubLObjectFactory.makeBoolean(!var23.eql(var24));
                            if (module0479.NIL != var25) {
                                SubLObject var26 = (SubLObject)module0479.NIL;
                                try {
                                    var26 = module0158.f10316(var24, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_200 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_201 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_200) {
                                        final SubLObject var27 = module0052.f3695(var26, var24_201);
                                        final SubLObject var26_202 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_201.eql(var27));
                                        if (module0479.NIL != var26_202) {
                                            f31734(var27, var12, var13);
                                        }
                                        var23_200 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_202);
                                    }
                                }
                                finally {
                                    final SubLObject var29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var26) {
                                            module0158.f10319(var26);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var29, var11);
                                    }
                                }
                            }
                            var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var25);
                        }
                    }
                }
            }
            else if (module0479.NIL != var19) {
                final SubLObject var20 = var19;
                if (module0479.NIL != module0158.f10010(var17, (SubLObject)module0479.NIL, var20)) {
                    final SubLObject var21 = module0158.f10011(var17, (SubLObject)module0479.NIL, var20);
                    SubLObject var22 = (SubLObject)module0479.NIL;
                    final SubLObject var23 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var22) {
                        final SubLObject var24 = module0052.f3695(var21, var23);
                        final SubLObject var25 = (SubLObject)SubLObjectFactory.makeBoolean(!var23.eql(var24));
                        if (module0479.NIL != var25) {
                            SubLObject var26 = (SubLObject)module0479.NIL;
                            try {
                                var26 = module0158.f10316(var24, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                SubLObject var23_201 = (SubLObject)module0479.NIL;
                                final SubLObject var24_202 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_201) {
                                    final SubLObject var27 = module0052.f3695(var26, var24_202);
                                    final SubLObject var26_203 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_202.eql(var27));
                                    if (module0479.NIL != var26_203) {
                                        f31734(var27, var12, var13);
                                    }
                                    var23_201 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_203);
                                }
                            }
                            finally {
                                final SubLObject var30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                    if (module0479.NIL != var26) {
                                        module0158.f10319(var26);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var30, var11);
                                }
                            }
                        }
                        var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var25);
                    }
                }
            }
            else {
                final SubLObject var20 = (SubLObject)module0479.NIL;
                if (module0479.NIL != module0158.f10010(var17, (SubLObject)module0479.NIL, var20)) {
                    final SubLObject var21 = module0158.f10011(var17, (SubLObject)module0479.NIL, var20);
                    SubLObject var22 = (SubLObject)module0479.NIL;
                    final SubLObject var23 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var22) {
                        final SubLObject var24 = module0052.f3695(var21, var23);
                        final SubLObject var25 = (SubLObject)SubLObjectFactory.makeBoolean(!var23.eql(var24));
                        if (module0479.NIL != var25) {
                            SubLObject var26 = (SubLObject)module0479.NIL;
                            try {
                                var26 = module0158.f10316(var24, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                SubLObject var23_202 = (SubLObject)module0479.NIL;
                                final SubLObject var24_203 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_202) {
                                    final SubLObject var27 = module0052.f3695(var26, var24_203);
                                    final SubLObject var26_204 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_203.eql(var27));
                                    if (module0479.NIL != var26_204) {
                                        f31734(var27, var12, var13);
                                    }
                                    var23_202 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_204);
                                }
                            }
                            finally {
                                final SubLObject var31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                    if (module0479.NIL != var26) {
                                        module0158.f10319(var26);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var31, var11);
                                }
                            }
                        }
                        var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var25);
                    }
                }
            }
        }
        else if (var16.eql((SubLObject)module0479.$ic7$)) {
            final SubLObject var32 = module0158.f10299(var14);
            if (module0479.NIL != module0158.f10038(var32)) {
                final SubLObject var33 = (SubLObject)module0479.NIL;
                final SubLObject var34 = module0012.$g73$.currentBinding(var11);
                final SubLObject var35 = module0012.$g65$.currentBinding(var11);
                final SubLObject var36 = module0012.$g67$.currentBinding(var11);
                final SubLObject var37 = module0012.$g68$.currentBinding(var11);
                final SubLObject var38 = module0012.$g66$.currentBinding(var11);
                final SubLObject var39 = module0012.$g69$.currentBinding(var11);
                final SubLObject var40 = module0012.$g70$.currentBinding(var11);
                final SubLObject var41 = module0012.$silent_progressP$.currentBinding(var11);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var11);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var11), var11);
                    module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var11);
                    module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                    module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                    module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                    module0012.$g70$.bind((SubLObject)module0479.T, var11);
                    module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var33) ? module0012.$silent_progressP$.getDynamicValue(var11) : module0479.T), var11);
                    module0012.f474(var33);
                    final SubLObject var42 = module0158.f10039(var32);
                    SubLObject var43 = (SubLObject)module0479.NIL;
                    final SubLObject var44 = (SubLObject)module0479.NIL;
                    while (module0479.NIL == var43) {
                        final SubLObject var45 = module0052.f3695(var42, var44);
                        final SubLObject var46 = (SubLObject)SubLObjectFactory.makeBoolean(!var44.eql(var45));
                        if (module0479.NIL != var46) {
                            module0012.f476();
                            SubLObject var47 = (SubLObject)module0479.NIL;
                            try {
                                var47 = module0158.f10316(var45, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                SubLObject var23_203 = (SubLObject)module0479.NIL;
                                final SubLObject var24_204 = (SubLObject)module0479.NIL;
                                while (module0479.NIL == var23_203) {
                                    final SubLObject var48 = module0052.f3695(var47, var24_204);
                                    final SubLObject var26_205 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_204.eql(var48));
                                    if (module0479.NIL != var26_205) {
                                        f31734(var48, var12, var13);
                                    }
                                    var23_203 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_205);
                                }
                            }
                            finally {
                                final SubLObject var35_214 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                    if (module0479.NIL != var47) {
                                        module0158.f10319(var47);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var35_214, var11);
                                }
                            }
                        }
                        var43 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var46);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var41, var11);
                    module0012.$g70$.rebind(var40, var11);
                    module0012.$g69$.rebind(var39, var11);
                    module0012.$g66$.rebind(var38, var11);
                    module0012.$g68$.rebind(var37, var11);
                    module0012.$g67$.rebind(var36, var11);
                    module0012.$g65$.rebind(var35, var11);
                    module0012.$g73$.rebind(var34, var11);
                }
            }
        }
        else if (var16.eql((SubLObject)module0479.$ic8$)) {
            SubLObject var49 = module0218.f14453(module0158.f10301(var14), (SubLObject)module0479.UNPROVIDED);
            SubLObject var50 = (SubLObject)module0479.NIL;
            var50 = var49.first();
            while (module0479.NIL != var49) {
                if (module0479.NIL == module0130.f8518((SubLObject)module0479.$ic40$) || module0479.NIL != module0178.f11343(var50, module0130.f8518((SubLObject)module0479.$ic40$))) {
                    f31734(var50, var12, var13);
                }
                var49 = var49.rest();
                var50 = var49.first();
            }
        }
        else {
            module0158.f10295(var14, var15);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31734(final SubLObject var30, final SubLObject var147, final SubLObject var1) {
        final SubLThread var148 = SubLProcess.currentSubLThread();
        if (module0479.NIL != module0351.f23568(var30)) {
            final SubLObject var149 = module0178.f11285(var30);
            if (module0479.NIL != module0235.f15476(var1, var149, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED)) {
                SubLObject var151;
                final SubLObject var150 = var151 = f31714(var149);
                SubLObject var152 = (SubLObject)module0479.NIL;
                var152 = var151.first();
                while (module0479.NIL != var151) {
                    var148.resetMultipleValues();
                    final SubLObject var153 = module0235.f15474(var147, var152, (SubLObject)module0479.T, (SubLObject)module0479.T);
                    final SubLObject var154 = var148.secondMultipleValue();
                    var148.resetMultipleValues();
                    if (module0479.NIL != var153) {
                        module0347.f23330(var30, var153, var154);
                    }
                    var151 = var151.rest();
                    var152 = var151.first();
                }
            }
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31735(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var12 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var13 = module0205.f13136(var12);
        return Numbers.min(f31725(var11, var13), f31724(var12));
    }
    
    public static SubLObject f31736(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var14 = var13.first();
        if (f31725(var12, var14).numL(f31724(var13))) {
            if (module0479.NIL != module0158.f10282(var12, (SubLObject)module0479.$ic6$)) {
                final SubLObject var15 = module0158.f10283(var12, (SubLObject)module0479.$ic6$);
                SubLObject var16 = (SubLObject)module0479.NIL;
                final SubLObject var17 = (SubLObject)module0479.NIL;
                while (module0479.NIL == var16) {
                    final SubLObject var18 = module0052.f3695(var15, var17);
                    final SubLObject var19 = (SubLObject)SubLObjectFactory.makeBoolean(!var17.eql(var18));
                    if (module0479.NIL != var19) {
                        SubLObject var20 = (SubLObject)module0479.NIL;
                        try {
                            var20 = module0158.f10316(var18, (SubLObject)module0479.$ic6$, (SubLObject)module0479.$ic36$, (SubLObject)module0479.NIL);
                            SubLObject var23_218 = (SubLObject)module0479.NIL;
                            final SubLObject var24_219 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var23_218) {
                                final SubLObject var21 = module0052.f3695(var20, var24_219);
                                final SubLObject var26_220 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_219.eql(var21));
                                if (module0479.NIL != var26_220 && module0479.NIL != module0158.f10284(var21, var18) && var14.eql(module0178.f11332(var21))) {
                                    f31737(var21, var12, var13);
                                }
                                var23_218 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_220);
                            }
                        }
                        finally {
                            final SubLObject var22 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                if (module0479.NIL != var20) {
                                    module0158.f10319(var20);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var22, var11);
                            }
                        }
                    }
                    var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var19);
                }
            }
        }
        else {
            final SubLObject var23 = module0349.f23449(var13, (SubLObject)module0479.$ic40$);
            final SubLObject var25;
            final SubLObject var24 = var25 = module0158.f10294(var23);
            if (var25.eql((SubLObject)module0479.$ic5$)) {
                var11.resetMultipleValues();
                final SubLObject var18_221 = module0158.f10297(var23);
                final SubLObject var26 = var11.secondMultipleValue();
                final SubLObject var20_222 = var11.thirdMultipleValue();
                var11.resetMultipleValues();
                if (module0479.NIL != var26) {
                    if (module0479.NIL != var20_222) {
                        final SubLObject var27 = var20_222;
                        if (module0479.NIL != module0158.f10010(var18_221, var26, var27)) {
                            final SubLObject var28 = module0158.f10011(var18_221, var26, var27);
                            SubLObject var29 = (SubLObject)module0479.NIL;
                            final SubLObject var30 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var29) {
                                final SubLObject var31 = module0052.f3695(var28, var30);
                                final SubLObject var32 = (SubLObject)SubLObjectFactory.makeBoolean(!var30.eql(var31));
                                if (module0479.NIL != var32) {
                                    SubLObject var33 = (SubLObject)module0479.NIL;
                                    try {
                                        var33 = module0158.f10316(var31, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_219 = (SubLObject)module0479.NIL;
                                        final SubLObject var24_220 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_219) {
                                            final SubLObject var34 = module0052.f3695(var33, var24_220);
                                            final SubLObject var26_221 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_220.eql(var34));
                                            if (module0479.NIL != var26_221) {
                                                f31737(var34, var12, var13);
                                            }
                                            var23_219 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_221);
                                        }
                                    }
                                    finally {
                                        final SubLObject var35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var33) {
                                                module0158.f10319(var33);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var35, var11);
                                        }
                                    }
                                }
                                var29 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var32);
                            }
                        }
                    }
                    else {
                        final SubLObject var27 = (SubLObject)module0479.NIL;
                        if (module0479.NIL != module0158.f10010(var18_221, var26, var27)) {
                            final SubLObject var28 = module0158.f10011(var18_221, var26, var27);
                            SubLObject var29 = (SubLObject)module0479.NIL;
                            final SubLObject var30 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var29) {
                                final SubLObject var31 = module0052.f3695(var28, var30);
                                final SubLObject var32 = (SubLObject)SubLObjectFactory.makeBoolean(!var30.eql(var31));
                                if (module0479.NIL != var32) {
                                    SubLObject var33 = (SubLObject)module0479.NIL;
                                    try {
                                        var33 = module0158.f10316(var31, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_220 = (SubLObject)module0479.NIL;
                                        final SubLObject var24_221 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_220) {
                                            final SubLObject var34 = module0052.f3695(var33, var24_221);
                                            final SubLObject var26_222 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_221.eql(var34));
                                            if (module0479.NIL != var26_222) {
                                                f31737(var34, var12, var13);
                                            }
                                            var23_220 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_222);
                                        }
                                    }
                                    finally {
                                        final SubLObject var36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var33) {
                                                module0158.f10319(var33);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var36, var11);
                                        }
                                    }
                                }
                                var29 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var32);
                            }
                        }
                    }
                }
                else if (module0479.NIL != var20_222) {
                    final SubLObject var27 = var20_222;
                    if (module0479.NIL != module0158.f10010(var18_221, (SubLObject)module0479.NIL, var27)) {
                        final SubLObject var28 = module0158.f10011(var18_221, (SubLObject)module0479.NIL, var27);
                        SubLObject var29 = (SubLObject)module0479.NIL;
                        final SubLObject var30 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var29) {
                            final SubLObject var31 = module0052.f3695(var28, var30);
                            final SubLObject var32 = (SubLObject)SubLObjectFactory.makeBoolean(!var30.eql(var31));
                            if (module0479.NIL != var32) {
                                SubLObject var33 = (SubLObject)module0479.NIL;
                                try {
                                    var33 = module0158.f10316(var31, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_221 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_222 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_221) {
                                        final SubLObject var34 = module0052.f3695(var33, var24_222);
                                        final SubLObject var26_223 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_222.eql(var34));
                                        if (module0479.NIL != var26_223) {
                                            f31737(var34, var12, var13);
                                        }
                                        var23_221 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_223);
                                    }
                                }
                                finally {
                                    final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var33) {
                                            module0158.f10319(var33);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var37, var11);
                                    }
                                }
                            }
                            var29 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var32);
                        }
                    }
                }
                else {
                    final SubLObject var27 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var18_221, (SubLObject)module0479.NIL, var27)) {
                        final SubLObject var28 = module0158.f10011(var18_221, (SubLObject)module0479.NIL, var27);
                        SubLObject var29 = (SubLObject)module0479.NIL;
                        final SubLObject var30 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var29) {
                            final SubLObject var31 = module0052.f3695(var28, var30);
                            final SubLObject var32 = (SubLObject)SubLObjectFactory.makeBoolean(!var30.eql(var31));
                            if (module0479.NIL != var32) {
                                SubLObject var33 = (SubLObject)module0479.NIL;
                                try {
                                    var33 = module0158.f10316(var31, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_222 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_223 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_222) {
                                        final SubLObject var34 = module0052.f3695(var33, var24_223);
                                        final SubLObject var26_224 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_223.eql(var34));
                                        if (module0479.NIL != var26_224) {
                                            f31737(var34, var12, var13);
                                        }
                                        var23_222 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_224);
                                    }
                                }
                                finally {
                                    final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var33) {
                                            module0158.f10319(var33);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var38, var11);
                                    }
                                }
                            }
                            var29 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var32);
                        }
                    }
                }
            }
            else if (var25.eql((SubLObject)module0479.$ic7$)) {
                final SubLObject var39 = module0158.f10299(var23);
                if (module0479.NIL != module0158.f10038(var39)) {
                    final SubLObject var40 = (SubLObject)module0479.NIL;
                    final SubLObject var41 = module0012.$g73$.currentBinding(var11);
                    final SubLObject var42 = module0012.$g65$.currentBinding(var11);
                    final SubLObject var43 = module0012.$g67$.currentBinding(var11);
                    final SubLObject var44 = module0012.$g68$.currentBinding(var11);
                    final SubLObject var45 = module0012.$g66$.currentBinding(var11);
                    final SubLObject var46 = module0012.$g69$.currentBinding(var11);
                    final SubLObject var47 = module0012.$g70$.currentBinding(var11);
                    final SubLObject var48 = module0012.$silent_progressP$.currentBinding(var11);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var11);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var11), var11);
                        module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var11);
                        module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g70$.bind((SubLObject)module0479.T, var11);
                        module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var40) ? module0012.$silent_progressP$.getDynamicValue(var11) : module0479.T), var11);
                        module0012.f474(var40);
                        final SubLObject var49 = module0158.f10039(var39);
                        SubLObject var50 = (SubLObject)module0479.NIL;
                        final SubLObject var51 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var50) {
                            final SubLObject var52 = module0052.f3695(var49, var51);
                            final SubLObject var53 = (SubLObject)SubLObjectFactory.makeBoolean(!var51.eql(var52));
                            if (module0479.NIL != var53) {
                                module0012.f476();
                                SubLObject var54 = (SubLObject)module0479.NIL;
                                try {
                                    var54 = module0158.f10316(var52, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_223 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_224 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_223) {
                                        final SubLObject var55 = module0052.f3695(var54, var24_224);
                                        final SubLObject var26_225 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_224.eql(var55));
                                        if (module0479.NIL != var26_225) {
                                            f31737(var55, var12, var13);
                                        }
                                        var23_223 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_225);
                                    }
                                }
                                finally {
                                    final SubLObject var35_238 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var54) {
                                            module0158.f10319(var54);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_238, var11);
                                    }
                                }
                            }
                            var50 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var53);
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
                        module0012.$g65$.rebind(var42, var11);
                        module0012.$g73$.rebind(var41, var11);
                    }
                }
            }
            else if (var25.eql((SubLObject)module0479.$ic8$)) {
                SubLObject var56 = module0218.f14453(module0158.f10301(var23), (SubLObject)module0479.UNPROVIDED);
                SubLObject var57 = (SubLObject)module0479.NIL;
                var57 = var56.first();
                while (module0479.NIL != var56) {
                    if (module0479.NIL == module0130.f8518((SubLObject)module0479.$ic40$) || module0479.NIL != module0178.f11343(var57, module0130.f8518((SubLObject)module0479.$ic40$))) {
                        f31737(var57, var12, var13);
                    }
                    var56 = var56.rest();
                    var57 = var56.first();
                }
            }
            else {
                module0158.f10295(var23, var24);
            }
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31737(final SubLObject var30, final SubLObject var147, final SubLObject var78) {
        final SubLThread var148 = SubLProcess.currentSubLThread();
        if (module0479.NIL != module0351.f23568(var30)) {
            final SubLObject var149 = module0178.f11285(var30);
            if (module0479.NIL != f31713(var147, var149)) {
                var148.resetMultipleValues();
                final SubLObject var150 = module0235.f15476(var78, var149, (SubLObject)module0479.T, (SubLObject)module0479.T);
                final SubLObject var151 = var148.secondMultipleValue();
                final SubLObject var152 = var148.thirdMultipleValue();
                var148.resetMultipleValues();
                if (module0479.NIL != var150) {
                    module0347.f23330(var30, var150, var152);
                }
            }
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31738(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var12 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        return Numbers.min(f31725(var11, (SubLObject)module0479.UNPROVIDED), f31724(var12));
    }
    
    public static SubLObject f31739(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var13 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        if (f31725(var12, (SubLObject)module0479.UNPROVIDED).numL(f31724(var13))) {
            if (module0479.NIL != module0158.f10282(var12, (SubLObject)module0479.$ic6$)) {
                final SubLObject var14 = module0158.f10283(var12, (SubLObject)module0479.$ic6$);
                SubLObject var15 = (SubLObject)module0479.NIL;
                final SubLObject var16 = (SubLObject)module0479.NIL;
                while (module0479.NIL == var15) {
                    final SubLObject var17 = module0052.f3695(var14, var16);
                    final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                    if (module0479.NIL != var18) {
                        SubLObject var19 = (SubLObject)module0479.NIL;
                        try {
                            var19 = module0158.f10316(var17, (SubLObject)module0479.$ic6$, (SubLObject)module0479.$ic36$, (SubLObject)module0479.NIL);
                            SubLObject var23_239 = (SubLObject)module0479.NIL;
                            final SubLObject var24_240 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var23_239) {
                                final SubLObject var20 = module0052.f3695(var19, var24_240);
                                final SubLObject var26_241 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_240.eql(var20));
                                if (module0479.NIL != var26_241 && module0479.NIL != module0158.f10284(var20, var17)) {
                                    f31737(var20, var12, var13);
                                }
                                var23_239 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_241);
                            }
                        }
                        finally {
                            final SubLObject var21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                if (module0479.NIL != var19) {
                                    module0158.f10319(var19);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var21, var11);
                            }
                        }
                    }
                    var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var18);
                }
            }
        }
        else {
            final SubLObject var22 = module0349.f23449(var13, (SubLObject)module0479.$ic40$);
            final SubLObject var24;
            final SubLObject var23 = var24 = module0158.f10294(var22);
            if (var24.eql((SubLObject)module0479.$ic5$)) {
                var11.resetMultipleValues();
                final SubLObject var18_242 = module0158.f10297(var22);
                final SubLObject var25 = var11.secondMultipleValue();
                final SubLObject var26 = var11.thirdMultipleValue();
                var11.resetMultipleValues();
                if (module0479.NIL != var25) {
                    if (module0479.NIL != var26) {
                        final SubLObject var27 = var26;
                        if (module0479.NIL != module0158.f10010(var18_242, var25, var27)) {
                            final SubLObject var28 = module0158.f10011(var18_242, var25, var27);
                            SubLObject var29 = (SubLObject)module0479.NIL;
                            final SubLObject var30 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var29) {
                                final SubLObject var31 = module0052.f3695(var28, var30);
                                final SubLObject var32 = (SubLObject)SubLObjectFactory.makeBoolean(!var30.eql(var31));
                                if (module0479.NIL != var32) {
                                    SubLObject var33 = (SubLObject)module0479.NIL;
                                    try {
                                        var33 = module0158.f10316(var31, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_240 = (SubLObject)module0479.NIL;
                                        final SubLObject var24_241 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_240) {
                                            final SubLObject var34 = module0052.f3695(var33, var24_241);
                                            final SubLObject var26_242 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_241.eql(var34));
                                            if (module0479.NIL != var26_242) {
                                                f31737(var34, var12, var13);
                                            }
                                            var23_240 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_242);
                                        }
                                    }
                                    finally {
                                        final SubLObject var35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var33) {
                                                module0158.f10319(var33);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var35, var11);
                                        }
                                    }
                                }
                                var29 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var32);
                            }
                        }
                    }
                    else {
                        final SubLObject var27 = (SubLObject)module0479.NIL;
                        if (module0479.NIL != module0158.f10010(var18_242, var25, var27)) {
                            final SubLObject var28 = module0158.f10011(var18_242, var25, var27);
                            SubLObject var29 = (SubLObject)module0479.NIL;
                            final SubLObject var30 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var29) {
                                final SubLObject var31 = module0052.f3695(var28, var30);
                                final SubLObject var32 = (SubLObject)SubLObjectFactory.makeBoolean(!var30.eql(var31));
                                if (module0479.NIL != var32) {
                                    SubLObject var33 = (SubLObject)module0479.NIL;
                                    try {
                                        var33 = module0158.f10316(var31, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_241 = (SubLObject)module0479.NIL;
                                        final SubLObject var24_242 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_241) {
                                            final SubLObject var34 = module0052.f3695(var33, var24_242);
                                            final SubLObject var26_243 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_242.eql(var34));
                                            if (module0479.NIL != var26_243) {
                                                f31737(var34, var12, var13);
                                            }
                                            var23_241 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_243);
                                        }
                                    }
                                    finally {
                                        final SubLObject var36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var33) {
                                                module0158.f10319(var33);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var36, var11);
                                        }
                                    }
                                }
                                var29 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var32);
                            }
                        }
                    }
                }
                else if (module0479.NIL != var26) {
                    final SubLObject var27 = var26;
                    if (module0479.NIL != module0158.f10010(var18_242, (SubLObject)module0479.NIL, var27)) {
                        final SubLObject var28 = module0158.f10011(var18_242, (SubLObject)module0479.NIL, var27);
                        SubLObject var29 = (SubLObject)module0479.NIL;
                        final SubLObject var30 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var29) {
                            final SubLObject var31 = module0052.f3695(var28, var30);
                            final SubLObject var32 = (SubLObject)SubLObjectFactory.makeBoolean(!var30.eql(var31));
                            if (module0479.NIL != var32) {
                                SubLObject var33 = (SubLObject)module0479.NIL;
                                try {
                                    var33 = module0158.f10316(var31, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_242 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_243 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_242) {
                                        final SubLObject var34 = module0052.f3695(var33, var24_243);
                                        final SubLObject var26_244 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_243.eql(var34));
                                        if (module0479.NIL != var26_244) {
                                            f31737(var34, var12, var13);
                                        }
                                        var23_242 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_244);
                                    }
                                }
                                finally {
                                    final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var33) {
                                            module0158.f10319(var33);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var37, var11);
                                    }
                                }
                            }
                            var29 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var32);
                        }
                    }
                }
                else {
                    final SubLObject var27 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var18_242, (SubLObject)module0479.NIL, var27)) {
                        final SubLObject var28 = module0158.f10011(var18_242, (SubLObject)module0479.NIL, var27);
                        SubLObject var29 = (SubLObject)module0479.NIL;
                        final SubLObject var30 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var29) {
                            final SubLObject var31 = module0052.f3695(var28, var30);
                            final SubLObject var32 = (SubLObject)SubLObjectFactory.makeBoolean(!var30.eql(var31));
                            if (module0479.NIL != var32) {
                                SubLObject var33 = (SubLObject)module0479.NIL;
                                try {
                                    var33 = module0158.f10316(var31, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_243 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_244 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_243) {
                                        final SubLObject var34 = module0052.f3695(var33, var24_244);
                                        final SubLObject var26_245 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_244.eql(var34));
                                        if (module0479.NIL != var26_245) {
                                            f31737(var34, var12, var13);
                                        }
                                        var23_243 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_245);
                                    }
                                }
                                finally {
                                    final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var33) {
                                            module0158.f10319(var33);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var38, var11);
                                    }
                                }
                            }
                            var29 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var32);
                        }
                    }
                }
            }
            else if (var24.eql((SubLObject)module0479.$ic7$)) {
                final SubLObject var39 = module0158.f10299(var22);
                if (module0479.NIL != module0158.f10038(var39)) {
                    final SubLObject var40 = (SubLObject)module0479.NIL;
                    final SubLObject var41 = module0012.$g73$.currentBinding(var11);
                    final SubLObject var42 = module0012.$g65$.currentBinding(var11);
                    final SubLObject var43 = module0012.$g67$.currentBinding(var11);
                    final SubLObject var44 = module0012.$g68$.currentBinding(var11);
                    final SubLObject var45 = module0012.$g66$.currentBinding(var11);
                    final SubLObject var46 = module0012.$g69$.currentBinding(var11);
                    final SubLObject var47 = module0012.$g70$.currentBinding(var11);
                    final SubLObject var48 = module0012.$silent_progressP$.currentBinding(var11);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var11);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var11), var11);
                        module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var11);
                        module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g70$.bind((SubLObject)module0479.T, var11);
                        module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var40) ? module0012.$silent_progressP$.getDynamicValue(var11) : module0479.T), var11);
                        module0012.f474(var40);
                        final SubLObject var49 = module0158.f10039(var39);
                        SubLObject var50 = (SubLObject)module0479.NIL;
                        final SubLObject var51 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var50) {
                            final SubLObject var52 = module0052.f3695(var49, var51);
                            final SubLObject var53 = (SubLObject)SubLObjectFactory.makeBoolean(!var51.eql(var52));
                            if (module0479.NIL != var53) {
                                module0012.f476();
                                SubLObject var54 = (SubLObject)module0479.NIL;
                                try {
                                    var54 = module0158.f10316(var52, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_244 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_245 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_244) {
                                        final SubLObject var55 = module0052.f3695(var54, var24_245);
                                        final SubLObject var26_246 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_245.eql(var55));
                                        if (module0479.NIL != var26_246) {
                                            f31737(var55, var12, var13);
                                        }
                                        var23_244 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_246);
                                    }
                                }
                                finally {
                                    final SubLObject var35_258 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var54) {
                                            module0158.f10319(var54);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_258, var11);
                                    }
                                }
                            }
                            var50 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var53);
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
                        module0012.$g65$.rebind(var42, var11);
                        module0012.$g73$.rebind(var41, var11);
                    }
                }
            }
            else if (var24.eql((SubLObject)module0479.$ic8$)) {
                SubLObject var56 = module0218.f14453(module0158.f10301(var22), (SubLObject)module0479.UNPROVIDED);
                SubLObject var57 = (SubLObject)module0479.NIL;
                var57 = var56.first();
                while (module0479.NIL != var56) {
                    if (module0479.NIL == module0130.f8518((SubLObject)module0479.$ic40$) || module0479.NIL != module0178.f11343(var57, module0130.f8518((SubLObject)module0479.$ic40$))) {
                        f31737(var57, var12, var13);
                    }
                    var56 = var56.rest();
                    var57 = var56.first();
                }
            }
            else {
                module0158.f10295(var22, var23);
            }
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31740(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        return f31725(var11, (SubLObject)module0479.UNPROVIDED);
    }
    
    public static SubLObject f31741(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLObject var11 = module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED);
        final SubLObject var12 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        if (module0479.NIL != module0158.f10282(var11, (SubLObject)module0479.$ic6$)) {
            final SubLObject var13 = module0158.f10283(var11, (SubLObject)module0479.$ic6$);
            SubLObject var14 = (SubLObject)module0479.NIL;
            final SubLObject var15 = (SubLObject)module0479.NIL;
            while (module0479.NIL == var14) {
                final SubLObject var16 = module0052.f3695(var13, var15);
                final SubLObject var17 = (SubLObject)SubLObjectFactory.makeBoolean(!var15.eql(var16));
                if (module0479.NIL != var17) {
                    SubLObject var18 = (SubLObject)module0479.NIL;
                    try {
                        var18 = module0158.f10316(var16, (SubLObject)module0479.$ic6$, (SubLObject)module0479.$ic36$, (SubLObject)module0479.NIL);
                        SubLObject var23_259 = (SubLObject)module0479.NIL;
                        final SubLObject var24_260 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var23_259) {
                            final SubLObject var19 = module0052.f3695(var18, var24_260);
                            final SubLObject var26_261 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_260.eql(var19));
                            if (module0479.NIL != var26_261 && module0479.NIL != module0158.f10284(var19, var16)) {
                                module0436.f30642(var19, var12);
                            }
                            var23_259 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_261);
                        }
                    }
                    finally {
                        final SubLObject var20 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0479.T);
                            if (module0479.NIL != var18) {
                                module0158.f10319(var18);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var20);
                        }
                    }
                }
                var14 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var17);
            }
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31742(final SubLObject var160) {
        return module0218.f14458(var160, (SubLObject)module0479.UNPROVIDED);
    }
    
    public static SubLObject f31743(final SubLObject var1) {
        final SubLObject var2 = module0202.f12760(module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED));
        return module0218.f14458(var2, (SubLObject)module0479.UNPROVIDED);
    }
    
    public static SubLObject f31744(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return f31743(var1);
    }
    
    public static SubLObject f31745(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLObject var11 = module0202.f12760(module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED));
        final SubLObject var12 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        SubLObject var14;
        final SubLObject var13 = var14 = module0218.f14453(var11, (SubLObject)module0479.UNPROVIDED);
        SubLObject var15 = (SubLObject)module0479.NIL;
        var15 = var14.first();
        while (module0479.NIL != var14) {
            if (module0479.NIL != module0178.f11284(var15)) {
                module0436.f30642(var15, var12);
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31746(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return f31743(var1);
    }
    
    public static SubLObject f31747(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0202.f12760(module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED));
        final SubLObject var13 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        SubLObject var14 = (SubLObject)module0479.NIL;
        if (module0479.NIL == var14) {
            SubLObject var15 = var12;
            SubLObject var16 = (SubLObject)module0479.NIL;
            var16 = var15.first();
            while (module0479.NIL == var14 && module0479.NIL != var15) {
                if (module0479.NIL == f31713(var16, var13)) {
                    var14 = (SubLObject)module0479.T;
                }
                var15 = var15.rest();
                var16 = var15.first();
            }
        }
        if (module0479.NIL == var14) {
            final SubLObject var17 = module0349.f23449(var13, (SubLObject)module0479.$ic40$);
            final SubLObject var19;
            final SubLObject var18 = var19 = module0158.f10294(var17);
            if (var19.eql((SubLObject)module0479.$ic5$)) {
                var11.resetMultipleValues();
                final SubLObject var20 = module0158.f10297(var17);
                final SubLObject var21 = var11.secondMultipleValue();
                final SubLObject var22 = var11.thirdMultipleValue();
                var11.resetMultipleValues();
                if (module0479.NIL != var21) {
                    if (module0479.NIL != var22) {
                        final SubLObject var23 = var22;
                        if (module0479.NIL != module0158.f10010(var20, var21, var23)) {
                            final SubLObject var24 = module0158.f10011(var20, var21, var23);
                            SubLObject var25 = (SubLObject)module0479.NIL;
                            final SubLObject var26 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var25) {
                                final SubLObject var27 = module0052.f3695(var24, var26);
                                final SubLObject var28 = (SubLObject)SubLObjectFactory.makeBoolean(!var26.eql(var27));
                                if (module0479.NIL != var28) {
                                    SubLObject var29 = (SubLObject)module0479.NIL;
                                    try {
                                        var29 = module0158.f10316(var27, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_265 = (SubLObject)module0479.NIL;
                                        final SubLObject var24_266 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_265) {
                                            final SubLObject var30 = module0052.f3695(var29, var24_266);
                                            final SubLObject var26_267 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_266.eql(var30));
                                            if (module0479.NIL != var26_267) {
                                                module0436.f30642(var30, var13);
                                            }
                                            var23_265 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_267);
                                        }
                                    }
                                    finally {
                                        final SubLObject var31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var29) {
                                                module0158.f10319(var29);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var31, var11);
                                        }
                                    }
                                }
                                var25 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var28);
                            }
                        }
                    }
                    else {
                        final SubLObject var23 = (SubLObject)module0479.NIL;
                        if (module0479.NIL != module0158.f10010(var20, var21, var23)) {
                            final SubLObject var24 = module0158.f10011(var20, var21, var23);
                            SubLObject var25 = (SubLObject)module0479.NIL;
                            final SubLObject var26 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var25) {
                                final SubLObject var27 = module0052.f3695(var24, var26);
                                final SubLObject var28 = (SubLObject)SubLObjectFactory.makeBoolean(!var26.eql(var27));
                                if (module0479.NIL != var28) {
                                    SubLObject var29 = (SubLObject)module0479.NIL;
                                    try {
                                        var29 = module0158.f10316(var27, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_266 = (SubLObject)module0479.NIL;
                                        final SubLObject var24_267 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_266) {
                                            final SubLObject var30 = module0052.f3695(var29, var24_267);
                                            final SubLObject var26_268 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_267.eql(var30));
                                            if (module0479.NIL != var26_268) {
                                                module0436.f30642(var30, var13);
                                            }
                                            var23_266 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_268);
                                        }
                                    }
                                    finally {
                                        final SubLObject var32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var29) {
                                                module0158.f10319(var29);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var32, var11);
                                        }
                                    }
                                }
                                var25 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var28);
                            }
                        }
                    }
                }
                else if (module0479.NIL != var22) {
                    final SubLObject var23 = var22;
                    if (module0479.NIL != module0158.f10010(var20, (SubLObject)module0479.NIL, var23)) {
                        final SubLObject var24 = module0158.f10011(var20, (SubLObject)module0479.NIL, var23);
                        SubLObject var25 = (SubLObject)module0479.NIL;
                        final SubLObject var26 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var25) {
                            final SubLObject var27 = module0052.f3695(var24, var26);
                            final SubLObject var28 = (SubLObject)SubLObjectFactory.makeBoolean(!var26.eql(var27));
                            if (module0479.NIL != var28) {
                                SubLObject var29 = (SubLObject)module0479.NIL;
                                try {
                                    var29 = module0158.f10316(var27, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_267 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_268 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_267) {
                                        final SubLObject var30 = module0052.f3695(var29, var24_268);
                                        final SubLObject var26_269 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_268.eql(var30));
                                        if (module0479.NIL != var26_269) {
                                            module0436.f30642(var30, var13);
                                        }
                                        var23_267 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_269);
                                    }
                                }
                                finally {
                                    final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var29) {
                                            module0158.f10319(var29);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var33, var11);
                                    }
                                }
                            }
                            var25 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var28);
                        }
                    }
                }
                else {
                    final SubLObject var23 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var20, (SubLObject)module0479.NIL, var23)) {
                        final SubLObject var24 = module0158.f10011(var20, (SubLObject)module0479.NIL, var23);
                        SubLObject var25 = (SubLObject)module0479.NIL;
                        final SubLObject var26 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var25) {
                            final SubLObject var27 = module0052.f3695(var24, var26);
                            final SubLObject var28 = (SubLObject)SubLObjectFactory.makeBoolean(!var26.eql(var27));
                            if (module0479.NIL != var28) {
                                SubLObject var29 = (SubLObject)module0479.NIL;
                                try {
                                    var29 = module0158.f10316(var27, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_268 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_269 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_268) {
                                        final SubLObject var30 = module0052.f3695(var29, var24_269);
                                        final SubLObject var26_270 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_269.eql(var30));
                                        if (module0479.NIL != var26_270) {
                                            module0436.f30642(var30, var13);
                                        }
                                        var23_268 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_270);
                                    }
                                }
                                finally {
                                    final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var29) {
                                            module0158.f10319(var29);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var34, var11);
                                    }
                                }
                            }
                            var25 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var28);
                        }
                    }
                }
            }
            else if (var19.eql((SubLObject)module0479.$ic7$)) {
                final SubLObject var35 = module0158.f10299(var17);
                if (module0479.NIL != module0158.f10038(var35)) {
                    final SubLObject var36 = (SubLObject)module0479.NIL;
                    final SubLObject var37 = module0012.$g73$.currentBinding(var11);
                    final SubLObject var38 = module0012.$g65$.currentBinding(var11);
                    final SubLObject var39 = module0012.$g67$.currentBinding(var11);
                    final SubLObject var40 = module0012.$g68$.currentBinding(var11);
                    final SubLObject var41 = module0012.$g66$.currentBinding(var11);
                    final SubLObject var42 = module0012.$g69$.currentBinding(var11);
                    final SubLObject var43 = module0012.$g70$.currentBinding(var11);
                    final SubLObject var44 = module0012.$silent_progressP$.currentBinding(var11);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var11);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var11), var11);
                        module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var11);
                        module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g70$.bind((SubLObject)module0479.T, var11);
                        module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var36) ? module0012.$silent_progressP$.getDynamicValue(var11) : module0479.T), var11);
                        module0012.f474(var36);
                        final SubLObject var45 = module0158.f10039(var35);
                        SubLObject var46 = (SubLObject)module0479.NIL;
                        final SubLObject var47 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var46) {
                            final SubLObject var48 = module0052.f3695(var45, var47);
                            final SubLObject var49 = (SubLObject)SubLObjectFactory.makeBoolean(!var47.eql(var48));
                            if (module0479.NIL != var49) {
                                module0012.f476();
                                SubLObject var50 = (SubLObject)module0479.NIL;
                                try {
                                    var50 = module0158.f10316(var48, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_269 = (SubLObject)module0479.NIL;
                                    final SubLObject var24_270 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_269) {
                                        final SubLObject var51 = module0052.f3695(var50, var24_270);
                                        final SubLObject var26_271 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_270.eql(var51));
                                        if (module0479.NIL != var26_271) {
                                            module0436.f30642(var51, var13);
                                        }
                                        var23_269 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_271);
                                    }
                                }
                                finally {
                                    final SubLObject var35_280 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var50) {
                                            module0158.f10319(var50);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_280, var11);
                                    }
                                }
                            }
                            var46 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var49);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var44, var11);
                        module0012.$g70$.rebind(var43, var11);
                        module0012.$g69$.rebind(var42, var11);
                        module0012.$g66$.rebind(var41, var11);
                        module0012.$g68$.rebind(var40, var11);
                        module0012.$g67$.rebind(var39, var11);
                        module0012.$g65$.rebind(var38, var11);
                        module0012.$g73$.rebind(var37, var11);
                    }
                }
            }
            else if (var19.eql((SubLObject)module0479.$ic8$)) {
                SubLObject var52 = module0218.f14453(module0158.f10301(var17), (SubLObject)module0479.UNPROVIDED);
                SubLObject var53 = (SubLObject)module0479.NIL;
                var53 = var52.first();
                while (module0479.NIL != var52) {
                    if (module0479.NIL == module0130.f8518((SubLObject)module0479.$ic40$) || module0479.NIL != module0178.f11343(var53, module0130.f8518((SubLObject)module0479.$ic40$))) {
                        module0436.f30642(var53, var13);
                    }
                    var52 = var52.rest();
                    var53 = var52.first();
                }
            }
            else {
                module0158.f10295(var17, var18);
            }
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31748(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        return module0435.f30613(f31743(var1));
    }
    
    public static SubLObject f31749(final SubLObject var1, SubLObject var10) {
        if (var10 == module0479.UNPROVIDED) {
            var10 = (SubLObject)module0479.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0202.f12760(module0205.f13387(var1, (SubLObject)module0479.UNPROVIDED));
        final SubLObject var13 = module0205.f13388(var1, (SubLObject)module0479.UNPROVIDED);
        SubLObject var14 = (SubLObject)module0479.NIL;
        SubLObject var15 = (SubLObject)module0479.NIL;
        if (module0479.NIL == var14) {
            SubLObject var16 = var12;
            SubLObject var17 = (SubLObject)module0479.NIL;
            var17 = var16.first();
            while (module0479.NIL == var14 && module0479.NIL != var16) {
                if (module0479.NIL == f31713(var17, var13)) {
                    var14 = (SubLObject)module0479.T;
                }
                var16 = var16.rest();
                var17 = var16.first();
            }
        }
        if (module0479.NIL == var14) {
            final SubLObject var18 = module0349.f23449(var13, (SubLObject)module0479.$ic40$);
            final SubLObject var20;
            final SubLObject var19 = var20 = module0158.f10294(var18);
            if (var20.eql((SubLObject)module0479.$ic5$)) {
                var11.resetMultipleValues();
                final SubLObject var21 = module0158.f10297(var18);
                final SubLObject var22 = var11.secondMultipleValue();
                final SubLObject var23 = var11.thirdMultipleValue();
                var11.resetMultipleValues();
                if (module0479.NIL != var22) {
                    if (module0479.NIL != var23) {
                        final SubLObject var24 = var23;
                        if (module0479.NIL != module0158.f10010(var21, var22, var24)) {
                            final SubLObject var25 = module0158.f10011(var21, var22, var24);
                            SubLObject var26 = var15;
                            final SubLObject var27 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var26) {
                                final SubLObject var28 = module0052.f3695(var25, var27);
                                final SubLObject var29 = (SubLObject)SubLObjectFactory.makeBoolean(!var27.eql(var28));
                                if (module0479.NIL != var29) {
                                    SubLObject var30 = (SubLObject)module0479.NIL;
                                    try {
                                        var30 = module0158.f10316(var28, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_281 = var15;
                                        final SubLObject var24_282 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_281) {
                                            final SubLObject var31 = module0052.f3695(var30, var24_282);
                                            final SubLObject var26_283 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_282.eql(var31));
                                            if (module0479.NIL != var26_283) {
                                                var15 = f31750(var31, var12, var1);
                                            }
                                            var23_281 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_283 || module0479.NIL != var15);
                                        }
                                    }
                                    finally {
                                        final SubLObject var32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var30) {
                                                module0158.f10319(var30);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var32, var11);
                                        }
                                    }
                                }
                                var26 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var29 || module0479.NIL != var15);
                            }
                        }
                    }
                    else {
                        final SubLObject var24 = (SubLObject)module0479.NIL;
                        if (module0479.NIL != module0158.f10010(var21, var22, var24)) {
                            final SubLObject var25 = module0158.f10011(var21, var22, var24);
                            SubLObject var26 = var15;
                            final SubLObject var27 = (SubLObject)module0479.NIL;
                            while (module0479.NIL == var26) {
                                final SubLObject var28 = module0052.f3695(var25, var27);
                                final SubLObject var29 = (SubLObject)SubLObjectFactory.makeBoolean(!var27.eql(var28));
                                if (module0479.NIL != var29) {
                                    SubLObject var30 = (SubLObject)module0479.NIL;
                                    try {
                                        var30 = module0158.f10316(var28, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                        SubLObject var23_282 = var15;
                                        final SubLObject var24_283 = (SubLObject)module0479.NIL;
                                        while (module0479.NIL == var23_282) {
                                            final SubLObject var31 = module0052.f3695(var30, var24_283);
                                            final SubLObject var26_284 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_283.eql(var31));
                                            if (module0479.NIL != var26_284) {
                                                var15 = f31750(var31, var12, var1);
                                            }
                                            var23_282 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_284 || module0479.NIL != var15);
                                        }
                                    }
                                    finally {
                                        final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                            if (module0479.NIL != var30) {
                                                module0158.f10319(var30);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var33, var11);
                                        }
                                    }
                                }
                                var26 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var29 || module0479.NIL != var15);
                            }
                        }
                    }
                }
                else if (module0479.NIL != var23) {
                    final SubLObject var24 = var23;
                    if (module0479.NIL != module0158.f10010(var21, (SubLObject)module0479.NIL, var24)) {
                        final SubLObject var25 = module0158.f10011(var21, (SubLObject)module0479.NIL, var24);
                        SubLObject var26 = var15;
                        final SubLObject var27 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var26) {
                            final SubLObject var28 = module0052.f3695(var25, var27);
                            final SubLObject var29 = (SubLObject)SubLObjectFactory.makeBoolean(!var27.eql(var28));
                            if (module0479.NIL != var29) {
                                SubLObject var30 = (SubLObject)module0479.NIL;
                                try {
                                    var30 = module0158.f10316(var28, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_283 = var15;
                                    final SubLObject var24_284 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_283) {
                                        final SubLObject var31 = module0052.f3695(var30, var24_284);
                                        final SubLObject var26_285 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_284.eql(var31));
                                        if (module0479.NIL != var26_285) {
                                            var15 = f31750(var31, var12, var1);
                                        }
                                        var23_283 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_285 || module0479.NIL != var15);
                                    }
                                }
                                finally {
                                    final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var30) {
                                            module0158.f10319(var30);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var34, var11);
                                    }
                                }
                            }
                            var26 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var29 || module0479.NIL != var15);
                        }
                    }
                }
                else {
                    final SubLObject var24 = (SubLObject)module0479.NIL;
                    if (module0479.NIL != module0158.f10010(var21, (SubLObject)module0479.NIL, var24)) {
                        final SubLObject var25 = module0158.f10011(var21, (SubLObject)module0479.NIL, var24);
                        SubLObject var26 = var15;
                        final SubLObject var27 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var26) {
                            final SubLObject var28 = module0052.f3695(var25, var27);
                            final SubLObject var29 = (SubLObject)SubLObjectFactory.makeBoolean(!var27.eql(var28));
                            if (module0479.NIL != var29) {
                                SubLObject var30 = (SubLObject)module0479.NIL;
                                try {
                                    var30 = module0158.f10316(var28, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_284 = var15;
                                    final SubLObject var24_285 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_284) {
                                        final SubLObject var31 = module0052.f3695(var30, var24_285);
                                        final SubLObject var26_286 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_285.eql(var31));
                                        if (module0479.NIL != var26_286) {
                                            var15 = f31750(var31, var12, var1);
                                        }
                                        var23_284 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_286 || module0479.NIL != var15);
                                    }
                                }
                                finally {
                                    final SubLObject var35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var30) {
                                            module0158.f10319(var30);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35, var11);
                                    }
                                }
                            }
                            var26 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var29 || module0479.NIL != var15);
                        }
                    }
                }
            }
            else if (var20.eql((SubLObject)module0479.$ic7$)) {
                final SubLObject var36 = module0158.f10299(var18);
                if (module0479.NIL != module0158.f10038(var36)) {
                    final SubLObject var37 = (SubLObject)module0479.NIL;
                    final SubLObject var38 = module0012.$g73$.currentBinding(var11);
                    final SubLObject var39 = module0012.$g65$.currentBinding(var11);
                    final SubLObject var40 = module0012.$g67$.currentBinding(var11);
                    final SubLObject var41 = module0012.$g68$.currentBinding(var11);
                    final SubLObject var42 = module0012.$g66$.currentBinding(var11);
                    final SubLObject var43 = module0012.$g69$.currentBinding(var11);
                    final SubLObject var44 = module0012.$g70$.currentBinding(var11);
                    final SubLObject var45 = module0012.$silent_progressP$.currentBinding(var11);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var11);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var11), var11);
                        module0012.$g67$.bind((SubLObject)module0479.ONE_INTEGER, var11);
                        module0012.$g68$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g66$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g69$.bind((SubLObject)module0479.ZERO_INTEGER, var11);
                        module0012.$g70$.bind((SubLObject)module0479.T, var11);
                        module0012.$silent_progressP$.bind((SubLObject)((module0479.NIL != var37) ? module0012.$silent_progressP$.getDynamicValue(var11) : module0479.T), var11);
                        module0012.f474(var37);
                        final SubLObject var46 = module0158.f10039(var36);
                        SubLObject var47 = var15;
                        final SubLObject var48 = (SubLObject)module0479.NIL;
                        while (module0479.NIL == var47) {
                            final SubLObject var49 = module0052.f3695(var46, var48);
                            final SubLObject var50 = (SubLObject)SubLObjectFactory.makeBoolean(!var48.eql(var49));
                            if (module0479.NIL != var50) {
                                module0012.f476();
                                SubLObject var51 = (SubLObject)module0479.NIL;
                                try {
                                    var51 = module0158.f10316(var49, (SubLObject)module0479.$ic6$, module0130.f8518((SubLObject)module0479.$ic40$), (SubLObject)module0479.NIL);
                                    SubLObject var23_285 = var15;
                                    final SubLObject var24_286 = (SubLObject)module0479.NIL;
                                    while (module0479.NIL == var23_285) {
                                        final SubLObject var52 = module0052.f3695(var51, var24_286);
                                        final SubLObject var26_287 = (SubLObject)SubLObjectFactory.makeBoolean(!var24_286.eql(var52));
                                        if (module0479.NIL != var26_287) {
                                            var15 = f31750(var52, var12, var1);
                                        }
                                        var23_285 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var26_287 || module0479.NIL != var15);
                                    }
                                }
                                finally {
                                    final SubLObject var35_296 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0479.T, var11);
                                        if (module0479.NIL != var51) {
                                            module0158.f10319(var51);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_296, var11);
                                    }
                                }
                            }
                            var47 = (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var50 || module0479.NIL != var15);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var45, var11);
                        module0012.$g70$.rebind(var44, var11);
                        module0012.$g69$.rebind(var43, var11);
                        module0012.$g66$.rebind(var42, var11);
                        module0012.$g68$.rebind(var41, var11);
                        module0012.$g67$.rebind(var40, var11);
                        module0012.$g65$.rebind(var39, var11);
                        module0012.$g73$.rebind(var38, var11);
                    }
                }
            }
            else if (var20.eql((SubLObject)module0479.$ic8$)) {
                SubLObject var53;
                SubLObject var54;
                for (var53 = (SubLObject)module0479.NIL, var53 = module0218.f14453(module0158.f10301(var18), (SubLObject)module0479.UNPROVIDED); module0479.NIL == var15 && module0479.NIL != var53; var53 = var53.rest()) {
                    var54 = var53.first();
                    if (module0479.NIL == module0130.f8518((SubLObject)module0479.$ic40$) || module0479.NIL != module0178.f11343(var54, module0130.f8518((SubLObject)module0479.$ic40$))) {
                        var15 = f31750(var54, var12, var1);
                    }
                }
            }
            else {
                module0158.f10295(var18, var19);
            }
        }
        if (module0479.NIL == var15) {
            module0347.f23330(module0191.f11990((SubLObject)module0479.$ic13$, module0205.f13338(var1), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED), (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED);
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31750(final SubLObject var30, final SubLObject var160, final SubLObject var78) {
        if (module0479.NIL != module0351.f23568(var30)) {
            final SubLObject var161 = module0178.f11285(var30);
            SubLObject var162 = (SubLObject)module0479.NIL;
            if (module0479.NIL == var162) {
                SubLObject var163 = var160;
                SubLObject var164 = (SubLObject)module0479.NIL;
                var164 = var163.first();
                while (module0479.NIL == var162 && module0479.NIL != var163) {
                    if (module0479.NIL == f31713(var164, var161)) {
                        var162 = (SubLObject)module0479.T;
                    }
                    var163 = var163.rest();
                    var164 = var163.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0479.NIL == var162 && module0479.NIL != module0235.f15476(var78, var161, (SubLObject)module0479.UNPROVIDED, (SubLObject)module0479.UNPROVIDED));
        }
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31751() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31685", "S#35029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31686", "S#35027", 1, 1, false);
        new $f31686$UnaryFunction();
        new $f31686$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31687", "S#35028", 1, 0, false);
        new $f31687$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31688", "S#35030", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31690", "S#35031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31691", "S#35032", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31692", "S#35033", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31693", "S#35034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31689", "S#35035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31694", "S#35036", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31695", "S#35037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31696", "S#35038", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31697", "S#35039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31698", "S#35040", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31699", "S#35041", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31700", "S#35042", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31702", "S#35043", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31701", "S#35044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31703", "S#35045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31704", "S#35046", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31705", "S#35047", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31706", "S#35048", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31707", "S#35049", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31708", "S#35050", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31709", "S#35051", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31710", "S#35052", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31711", "S#35053", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31712", "S#35054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31713", "S#35055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31714", "S#35056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31715", "S#35057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31716", "S#35058", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31718", "S#35059", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31719", "S#35060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31717", "S#35061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31720", "S#35062", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31721", "S#35063", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31722", "S#35064", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31723", "S#35065", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31724", "S#35066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31725", "S#35067", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31726", "S#35068", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31728", "S#35069", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31727", "S#35070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31729", "S#35071", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31730", "S#35072", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31731", "S#35073", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31732", "S#35074", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31733", "S#35075", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31734", "S#35076", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31735", "S#35077", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31736", "S#29816", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31737", "S#35078", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31738", "S#35079", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31739", "S#35080", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31740", "S#35081", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31741", "S#35082", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31742", "S#35083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31743", "S#35084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31744", "S#35085", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31745", "S#35086", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31746", "S#35087", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31747", "S#35088", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31748", "S#35089", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31749", "S#35090", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0479", "f31750", "S#35091", 3, 0, false);
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31752() {
        module0479.$g3696$ = SubLFiles.deflexical("S#35092", (module0479.NIL != Symbols.boundp((SubLObject)module0479.$ic41$)) ? module0479.$g3696$.getGlobalValue() : module0479.$ic42$);
        return (SubLObject)module0479.NIL;
    }
    
    public static SubLObject f31753() {
        module0340.f22938(module0479.$ic0$);
        module0358.f23730((SubLObject)module0479.$ic1$, (SubLObject)module0479.$ic2$);
        module0358.f23773((SubLObject)module0479.$ic3$, module0479.$ic0$);
        module0340.f22941((SubLObject)module0479.$ic9$, (SubLObject)module0479.$ic10$);
        module0340.f22941((SubLObject)module0479.$ic11$, (SubLObject)module0479.$ic12$);
        module0340.f22941((SubLObject)module0479.$ic14$, (SubLObject)module0479.$ic15$);
        module0340.f22938(module0479.$ic16$);
        module0358.f23730((SubLObject)module0479.$ic1$, (SubLObject)module0479.$ic17$);
        module0358.f23773((SubLObject)module0479.$ic3$, module0479.$ic16$);
        module0340.f22941((SubLObject)module0479.$ic18$, (SubLObject)module0479.$ic19$);
        module0340.f22941((SubLObject)module0479.$ic20$, (SubLObject)module0479.$ic21$);
        module0340.f22941((SubLObject)module0479.$ic22$, (SubLObject)module0479.$ic23$);
        module0340.f22938(module0479.$ic24$);
        module0358.f23773((SubLObject)module0479.$ic3$, module0479.$ic24$);
        module0340.f22941((SubLObject)module0479.$ic25$, (SubLObject)module0479.$ic26$);
        module0340.f22941((SubLObject)module0479.$ic28$, (SubLObject)module0479.$ic29$);
        module0340.f22941((SubLObject)module0479.$ic30$, (SubLObject)module0479.$ic31$);
        module0340.f22941((SubLObject)module0479.$ic32$, (SubLObject)module0479.$ic33$);
        module0340.f22941((SubLObject)module0479.$ic34$, (SubLObject)module0479.$ic35$);
        module0340.f22941((SubLObject)module0479.$ic37$, (SubLObject)module0479.$ic38$);
        module0340.f22938(module0479.$ic39$);
        module0358.f23771((SubLObject)module0479.$ic40$, module0479.$ic39$, (SubLObject)module0479.TWO_INTEGER);
        module0358.f23773((SubLObject)module0479.$ic3$, module0479.$ic39$);
        module0003.f57((SubLObject)module0479.$ic41$);
        module0132.f8593((SubLObject)module0479.$ic41$, module0479.$ic39$);
        module0340.f22941((SubLObject)module0479.$ic48$, (SubLObject)module0479.$ic49$);
        module0340.f22941((SubLObject)module0479.$ic50$, (SubLObject)module0479.$ic51$);
        module0340.f22941((SubLObject)module0479.$ic52$, (SubLObject)module0479.$ic53$);
        module0340.f22938(module0479.$ic54$);
        module0358.f23774((SubLObject)module0479.$ic40$, module0479.$ic54$);
        module0358.f23773((SubLObject)module0479.$ic3$, module0479.$ic54$);
        module0340.f22941((SubLObject)module0479.$ic55$, (SubLObject)module0479.$ic56$);
        module0340.f22941((SubLObject)module0479.$ic57$, (SubLObject)module0479.$ic58$);
        module0340.f22941((SubLObject)module0479.$ic59$, (SubLObject)module0479.$ic60$);
        module0340.f22941((SubLObject)module0479.$ic61$, (SubLObject)module0479.$ic62$);
        module0340.f22941((SubLObject)module0479.$ic63$, (SubLObject)module0479.$ic64$);
        module0340.f22941((SubLObject)module0479.$ic65$, (SubLObject)module0479.$ic66$);
        module0340.f22938(module0479.$ic67$);
        module0358.f23771((SubLObject)module0479.$ic40$, module0479.$ic67$, (SubLObject)module0479.ONE_INTEGER);
        module0358.f23773((SubLObject)module0479.$ic3$, module0479.$ic67$);
        module0340.f22941((SubLObject)module0479.$ic68$, (SubLObject)module0479.$ic69$);
        module0340.f22941((SubLObject)module0479.$ic70$, (SubLObject)module0479.$ic71$);
        module0340.f22941((SubLObject)module0479.$ic72$, (SubLObject)module0479.$ic73$);
        return (SubLObject)module0479.NIL;
    }
    
    public void declareFunctions() {
        f31751();
    }
    
    public void initializeVariables() {
        f31752();
    }
    
    public void runTopLevelForms() {
        f31753();
    }
    
    static {
        me = (SubLFile)new module0479();
        module0479.$g3696$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $ic1$ = SubLObjectFactory.makeKeyword("ASSERTED-SENTENCE-VARIABLE");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("S#26426", "CYC"));
        $ic3$ = SubLObjectFactory.makeKeyword("NEG");
        $ic4$ = SubLObjectFactory.makeSymbol("S#15433", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("GAF-ARG");
        $ic6$ = SubLObjectFactory.makeKeyword("GAF");
        $ic7$ = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $ic8$ = SubLObjectFactory.makeKeyword("OVERLAP");
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35027", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35028", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedSentence (<predicate> . <anything>))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedSentence (#$genls #$Predicate ?WHAT))\n    (#$assertedSentence (#$genls #$Predicate #$TruthFunction))") });
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33904", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33904", "CYC")))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35030", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35031", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#14135", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedSentence (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving <fort>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedSentence (?PRED #$Predicate ?WHAT))") });
        $ic13$ = SubLObjectFactory.makeKeyword("MINIMIZE");
        $ic14$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG");
        $ic15$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35032", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35033", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertedSentence (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$assertedSentence (#$genls #$Predicate #$Thing)))") });
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence"));
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("S#26426", "CYC"));
        $ic18$ = SubLObjectFactory.makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-POS");
        $ic19$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35036", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35037", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#14135", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$exactlyAssertedSentence (<predicate> . <anything>))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$exactlyAssertedSentence (#$genls #$Predicate ?WHAT))\n    (#$exactlyAssertedSentence (#$genls #$Predicate #$TruthFunction))") });
        $ic20$ = SubLObjectFactory.makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS");
        $ic21$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33904", "CYC"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33904", "CYC")))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35038", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#35039", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#14135", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$exactlyAssertedSentence (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving <fort>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$exactlyAssertedSentence (?PRED #$Predicate ?WHAT))") });
        $ic22$ = SubLObjectFactory.makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG");
        $ic23$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("exactlyAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35040", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35041", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$exactlyAssertedSentence (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$exactlyAssertedSentence (#$genls #$Predicate #$Thing)))") });
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg"));
        $ic25$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-PRUNE");
        $ic26$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), module0479.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("prune these cases :\n    (#$assertedPredicateArg <non-fort>  <whatever>   <whatever>)\n    (#$assertedPredicateArg <whatever> <non-integer> <whatever>)\n    (#$assertedPredicateArg <whatever>  <whatever>   <non-fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedPredicateArg (#$YearFn 2002) 1 #$isa)\n    (#$assertedPredicateArg #$Predicate (#$PlusFn 1 1) #$genls)\n    (#$assertedPredicateArg #$Predicate 1 \"genls\")\n   ") });
        $ic27$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic28$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK");
        $ic29$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35042", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35043", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedPredicateArg <fort> <integer> <fort>)\n    using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedPredicateArg #$Predicate 1 #$genls)") });
        $ic30$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK");
        $ic31$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35046", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35047", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertedPredicateArg <fort> <integer> <fort>))\n     using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$assertedPredicateArg #$and 1 #$arity))") });
        $ic32$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR");
        $ic33$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35048", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35049", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedPredicateArg <fort> <integer> <non-fort>)\n    using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedPredicateArg #$Predicate 1 ?WHAT)") });
        $ic34$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR");
        $ic35$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35050", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35051", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedPredicateArg <fort> <non-integer> <whatever>)\n    using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedPredicateArg #$Predicate ?ARG ?PRED)") });
        $ic36$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic37$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED");
        $ic38$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedPredicateArg")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35052", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35053", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedPredicateArg <non-fort> <integer> <fort>)\n    using only the KB GAF indexing and explicit assertions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedPredicateArg ?X 1 #$expansion)") });
        $ic39$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termFormulas"));
        $ic40$ = SubLObjectFactory.makeKeyword("POS");
        $ic41$ = SubLObjectFactory.makeSymbol("S#35092", "CYC");
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic43$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic44$ = SubLObjectFactory.makeSymbol("S#16331", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("FULLY-BOUND-P");
        $ic46$ = SubLObjectFactory.makeSymbol("S#15615", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("HL-TERM-P");
        $ic48$ = SubLObjectFactory.makeKeyword("REMOVAL-TERM-FORMULAS-CHECK-POS");
        $ic49$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("termFormulas")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termFormulas")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#21171", "CYC")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35058", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35059", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termFormulas <fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termFormulas #$Predicate (#$genls #$Predicate #$TruthFunction))") });
        $ic50$ = SubLObjectFactory.makeKeyword("REMOVAL-TERM-FORMULAS-CHECK-NEG");
        $ic51$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("termFormulas")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termFormulas")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#21171", "CYC")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35062", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35063", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$termFormulas <fully-bound> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$termFormulas #$Predicate (#$genls #$Quantifier #$TruthFunction)))") });
        $ic52$ = SubLObjectFactory.makeKeyword("REMOVAL-TERM-FORMULAS-UNIFY");
        $ic53$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("termFormulas")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("termFormulas")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#21171", "CYC")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35064", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35065", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termFormulas <not-fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termFormulas ?TERM (#$genls #$Predicate #$TruthFunction))") });
        $ic54$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences"));
        $ic55$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS");
        $ic56$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35068", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35069", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSentences <fully-bound> (<predicate> . <fully-bound>))\n     using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSentences #$Predicate (#$genls #$Predicate #$TruthFunction)))") });
        $ic57$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG");
        $ic58$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35071", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35072", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertedTermSentences <fully-bound> (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$assertedTermSentences #$Quantifier (#$genls #$Predicate #$TruthFunction)))\n    (#$not (#$assertedTermSentences #$Predicate  (#$genls #$TruthFunction #$Predicate)))\n    ") });
        $ic59$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE");
        $ic60$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35074", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35075", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSentences <not fully-bound> (<predicate> . <fully-bound>))\n     using only the KB GAF indexing and explicit assertions involving <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSentences ?TERM (#$genls #$Predicate #$TruthFunction)))") });
        $ic61$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY");
        $ic62$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35077", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#29816", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSentences <fort> (<predicate> . <not fully-bound>))\n    using only the KB GAF indexing and explicit assertions involving <predicate> and <fort>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSentences #$Predicate (#$genls #$Predicate ?GENL)))\n    (#$assertedTermSentences #$Predicate (#$genls ?SPEC ?GENL))\n    (#$assertedTermSentences #$Predicate (#$genls ?SPEC #$TruthFunction))\n    ") });
        $ic63$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY");
        $ic64$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33904", "CYC")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35079", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35080", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSentences <fort> (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving the two FORTs"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSentences #$Predicate (?PRED #$Predicate ?TERM))\n    (#$assertedTermSentences #$Predicate (?PRED ?TERM #$Collection))\n    (#$assertedTermSentences #$Predicate (?PRED ?TERM #$TruthFunction))\n    ") });
        $ic65$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE");
        $ic66$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35081", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35082", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSentences <fort> <variable>)\n    using only the KB GAF indexing and explicit assertions involving <fort>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSentences #$Predicate ?SENTENCE))") });
        $ic67$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences"));
        $ic68$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE");
        $ic69$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35085", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35086", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSetSentences <fully-bound> <variable>)\n    using the overlap indexing and explicit assertions involving the terms in <fully-bound>."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSetSentences (#$TheSet #$Dog #$Mammal) ?SENTENCE))") });
        $ic70$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS");
        $ic71$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35087", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35088", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$assertedTermSetSentences <fully-bound> ([predicate] . [fully-bound]))\n    using only the KB GAF indexing and explicit assertions involving the terms in <fully-bound>."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$assertedTermSetSentences (#$TheSet #$Dog #$Mammal) (#$genls #$Dog #$Mammal))") });
        $ic72$ = SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG");
        $ic73$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertedTermSetSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35089", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35090", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$assertedTermSetSentences <fully-bound> ([predicate] . [fully-bound])))\n    using only the overlap indexing and explicit assertions involving the terms in <fully-bound>."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$assertedTermSetSentences (#$TheSet #$Predicate) (#$isa #$Collection #$Thing)))\n    (#$not (#$assertedTermSetSentences (#$TheSet #$Predicate #$arity) (#$arity #$Predicate 2))) ") });
    }
    
    public static final class $f31686$UnaryFunction extends UnaryFunction
    {
        public $f31686$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35027"));
        }
        
        public SubLObject processItem(final SubLObject var11) {
            return module0479.f31686(var11, (SubLObject)$f31686$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f31686$BinaryFunction extends BinaryFunction
    {
        public $f31686$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35027"));
        }
        
        public SubLObject processItem(final SubLObject var11, final SubLObject var12) {
            return module0479.f31686(var11, var12);
        }
    }
    
    public static final class $f31687$UnaryFunction extends UnaryFunction
    {
        public $f31687$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35028"));
        }
        
        public SubLObject processItem(final SubLObject var11) {
            return module0479.f31687(var11);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0479.class
	Total time: 3724 ms
	
	Decompiled with Procyon 0.5.32.
*/