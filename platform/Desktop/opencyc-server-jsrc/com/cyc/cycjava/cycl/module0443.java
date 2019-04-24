package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0443 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0443";
    public static final String myFingerPrint = "bf7e71d12730d6fde394c40fa5b4faf3b65dcac27b912d2964e9e9d3ea624b63";
    private static SubLSymbol $g3549$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLObject $ic50$;
    
    public static SubLObject f30748(final SubLObject var1, SubLObject var2) {
        if (var2 == module0443.UNPROVIDED) {
            var2 = (SubLObject)module0443.NIL;
        }
        if (module0443.NIL != module0193.f12105(var1)) {
            return module0018.$g660$.getGlobalValue();
        }
        return f30749(var1, (SubLObject)module0443.$ic0$);
    }
    
    public static SubLObject f30750(final SubLObject var1) {
        return f30751(var1, (SubLObject)module0443.$ic0$);
    }
    
    public static SubLObject f30752(final SubLObject var1) {
        if (module0443.NIL != module0435.f30612(var1, (SubLObject)module0443.$ic3$)) {
            return (SubLObject)module0443.$ic4$;
        }
        return (SubLObject)module0443.$ic5$;
    }
    
    public static SubLObject f30753(final SubLObject var1, SubLObject var2) {
        if (var2 == module0443.UNPROVIDED) {
            var2 = (SubLObject)module0443.NIL;
        }
        return f30749(var1, (SubLObject)module0443.$ic3$);
    }
    
    public static SubLObject f30754(final SubLObject var1) {
        return f30751(var1, (SubLObject)module0443.$ic3$);
    }
    
    public static SubLObject f30751(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0443.NIL;
        final SubLObject var5 = f30755(var1);
        final SubLObject var6 = module0148.$g2099$.currentBinding(var3);
        final SubLObject var7 = module0018.$g637$.currentBinding(var3);
        final SubLObject var8 = module0018.$g638$.currentBinding(var3);
        try {
            module0148.$g2099$.bind(module0148.f9603(var2), var3);
            module0018.$g637$.bind(var1, var3);
            module0018.$g638$.bind(var2, var3);
            final SubLObject var9 = module0217.f14404(var5, module0130.f8518(var2), (SubLObject)module0443.NIL);
            final SubLObject var11;
            final SubLObject var10 = var11 = module0158.f10294(var9);
            if (var11.eql((SubLObject)module0443.$ic8$)) {
                var3.resetMultipleValues();
                final SubLObject var12 = module0158.f10297(var9);
                final SubLObject var13 = var3.secondMultipleValue();
                final SubLObject var14 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                if (module0443.NIL != var13) {
                    if (module0443.NIL != var14) {
                        final SubLObject var15 = var14;
                        if (module0443.NIL != module0158.f10010(var12, var13, var15)) {
                            final SubLObject var16 = module0158.f10011(var12, var13, var15);
                            SubLObject var17 = (SubLObject)module0443.NIL;
                            final SubLObject var18 = (SubLObject)module0443.NIL;
                            while (module0443.NIL == var17) {
                                final SubLObject var19 = module0052.f3695(var16, var18);
                                final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                                if (module0443.NIL != var20) {
                                    SubLObject var21 = (SubLObject)module0443.NIL;
                                    try {
                                        var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                        SubLObject var19_24 = (SubLObject)module0443.NIL;
                                        final SubLObject var20_25 = (SubLObject)module0443.NIL;
                                        while (module0443.NIL == var19_24) {
                                            final SubLObject var22 = module0052.f3695(var21, var20_25);
                                            final SubLObject var22_27 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_25.eql(var22));
                                            if (module0443.NIL != var22_27) {
                                                final SubLObject var24;
                                                final SubLObject var23 = var24 = f30756(var22);
                                                if (module0443.NIL != var24) {
                                                    var4 = (SubLObject)ConsesLow.cons(var24, var4);
                                                }
                                            }
                                            var19_24 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_27);
                                        }
                                    }
                                    finally {
                                        final SubLObject var8_30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                            if (module0443.NIL != var21) {
                                                module0158.f10319(var21);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var8_30, var3);
                                        }
                                    }
                                }
                                var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                            }
                        }
                    }
                    else {
                        final SubLObject var15 = (SubLObject)module0443.NIL;
                        if (module0443.NIL != module0158.f10010(var12, var13, var15)) {
                            final SubLObject var16 = module0158.f10011(var12, var13, var15);
                            SubLObject var17 = (SubLObject)module0443.NIL;
                            final SubLObject var18 = (SubLObject)module0443.NIL;
                            while (module0443.NIL == var17) {
                                final SubLObject var19 = module0052.f3695(var16, var18);
                                final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                                if (module0443.NIL != var20) {
                                    SubLObject var21 = (SubLObject)module0443.NIL;
                                    try {
                                        var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                        SubLObject var19_25 = (SubLObject)module0443.NIL;
                                        final SubLObject var20_26 = (SubLObject)module0443.NIL;
                                        while (module0443.NIL == var19_25) {
                                            final SubLObject var22 = module0052.f3695(var21, var20_26);
                                            final SubLObject var22_28 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_26.eql(var22));
                                            if (module0443.NIL != var22_28) {
                                                final SubLObject var24;
                                                final SubLObject var23 = var24 = f30756(var22);
                                                if (module0443.NIL != var24) {
                                                    var4 = (SubLObject)ConsesLow.cons(var24, var4);
                                                }
                                            }
                                            var19_25 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_28);
                                        }
                                    }
                                    finally {
                                        final SubLObject var8_31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                            if (module0443.NIL != var21) {
                                                module0158.f10319(var21);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var8_31, var3);
                                        }
                                    }
                                }
                                var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                            }
                        }
                    }
                }
                else if (module0443.NIL != var14) {
                    final SubLObject var15 = var14;
                    if (module0443.NIL != module0158.f10010(var12, (SubLObject)module0443.NIL, var15)) {
                        final SubLObject var16 = module0158.f10011(var12, (SubLObject)module0443.NIL, var15);
                        SubLObject var17 = (SubLObject)module0443.NIL;
                        final SubLObject var18 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var17) {
                            final SubLObject var19 = module0052.f3695(var16, var18);
                            final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                            if (module0443.NIL != var20) {
                                SubLObject var21 = (SubLObject)module0443.NIL;
                                try {
                                    var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                    SubLObject var19_26 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_27 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_26) {
                                        final SubLObject var22 = module0052.f3695(var21, var20_27);
                                        final SubLObject var22_29 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_27.eql(var22));
                                        if (module0443.NIL != var22_29) {
                                            final SubLObject var24;
                                            final SubLObject var23 = var24 = f30756(var22);
                                            if (module0443.NIL != var24) {
                                                var4 = (SubLObject)ConsesLow.cons(var24, var4);
                                            }
                                        }
                                        var19_26 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_29);
                                    }
                                }
                                finally {
                                    final SubLObject var8_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                        if (module0443.NIL != var21) {
                                            module0158.f10319(var21);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_32, var3);
                                    }
                                }
                            }
                            var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                        }
                    }
                }
                else {
                    final SubLObject var15 = (SubLObject)module0443.NIL;
                    if (module0443.NIL != module0158.f10010(var12, (SubLObject)module0443.NIL, var15)) {
                        final SubLObject var16 = module0158.f10011(var12, (SubLObject)module0443.NIL, var15);
                        SubLObject var17 = (SubLObject)module0443.NIL;
                        final SubLObject var18 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var17) {
                            final SubLObject var19 = module0052.f3695(var16, var18);
                            final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                            if (module0443.NIL != var20) {
                                SubLObject var21 = (SubLObject)module0443.NIL;
                                try {
                                    var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                    SubLObject var19_27 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_28 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_27) {
                                        final SubLObject var22 = module0052.f3695(var21, var20_28);
                                        final SubLObject var22_30 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_28.eql(var22));
                                        if (module0443.NIL != var22_30) {
                                            final SubLObject var24;
                                            final SubLObject var23 = var24 = f30756(var22);
                                            if (module0443.NIL != var24) {
                                                var4 = (SubLObject)ConsesLow.cons(var24, var4);
                                            }
                                        }
                                        var19_27 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_30);
                                    }
                                }
                                finally {
                                    final SubLObject var8_33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                        if (module0443.NIL != var21) {
                                            module0158.f10319(var21);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_33, var3);
                                    }
                                }
                            }
                            var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                        }
                    }
                }
            }
            else if (var11.eql((SubLObject)module0443.$ic10$)) {
                final SubLObject var25 = module0158.f10299(var9);
                if (module0443.NIL != module0158.f10038(var25)) {
                    final SubLObject var26 = (SubLObject)module0443.NIL;
                    final SubLObject var8_34 = module0012.$g73$.currentBinding(var3);
                    final SubLObject var9_46 = module0012.$g65$.currentBinding(var3);
                    final SubLObject var10_47 = module0012.$g67$.currentBinding(var3);
                    final SubLObject var27 = module0012.$g68$.currentBinding(var3);
                    final SubLObject var28 = module0012.$g66$.currentBinding(var3);
                    final SubLObject var29 = module0012.$g69$.currentBinding(var3);
                    final SubLObject var30 = module0012.$g70$.currentBinding(var3);
                    final SubLObject var31 = module0012.$silent_progressP$.currentBinding(var3);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var3);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                        module0012.$g67$.bind((SubLObject)module0443.ONE_INTEGER, var3);
                        module0012.$g68$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                        module0012.$g66$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                        module0012.$g69$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                        module0012.$g70$.bind((SubLObject)module0443.T, var3);
                        module0012.$silent_progressP$.bind((SubLObject)((module0443.NIL != var26) ? module0012.$silent_progressP$.getDynamicValue(var3) : module0443.T), var3);
                        module0012.f474(var26);
                        final SubLObject var32 = module0158.f10039(var25);
                        SubLObject var33 = (SubLObject)module0443.NIL;
                        final SubLObject var34 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var33) {
                            final SubLObject var35 = module0052.f3695(var32, var34);
                            final SubLObject var36 = (SubLObject)SubLObjectFactory.makeBoolean(!var34.eql(var35));
                            if (module0443.NIL != var36) {
                                module0012.f476();
                                SubLObject var37 = (SubLObject)module0443.NIL;
                                try {
                                    var37 = module0158.f10316(var35, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                    SubLObject var19_28 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_29 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_28) {
                                        final SubLObject var38 = module0052.f3695(var37, var20_29);
                                        final SubLObject var22_31 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_29.eql(var38));
                                        if (module0443.NIL != var22_31) {
                                            final SubLObject var40;
                                            final SubLObject var39 = var40 = f30756(var38);
                                            if (module0443.NIL != var40) {
                                                var4 = (SubLObject)ConsesLow.cons(var40, var4);
                                            }
                                        }
                                        var19_28 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_31);
                                    }
                                }
                                finally {
                                    final SubLObject var8_35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                        if (module0443.NIL != var37) {
                                            module0158.f10319(var37);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_35, var3);
                                    }
                                }
                            }
                            var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var36);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var31, var3);
                        module0012.$g70$.rebind(var30, var3);
                        module0012.$g69$.rebind(var29, var3);
                        module0012.$g66$.rebind(var28, var3);
                        module0012.$g68$.rebind(var27, var3);
                        module0012.$g67$.rebind(var10_47, var3);
                        module0012.$g65$.rebind(var9_46, var3);
                        module0012.$g73$.rebind(var8_34, var3);
                    }
                }
            }
            else if (var11.eql((SubLObject)module0443.$ic11$)) {
                SubLObject var41 = module0218.f14453(module0158.f10301(var9), (SubLObject)module0443.UNPROVIDED);
                SubLObject var42 = (SubLObject)module0443.NIL;
                var42 = var41.first();
                while (module0443.NIL != var41) {
                    if (module0443.NIL == module0130.f8518(var2) || module0443.NIL != module0178.f11343(var42, module0130.f8518(var2))) {
                        final SubLObject var44;
                        final SubLObject var43 = var44 = f30756(var42);
                        if (module0443.NIL != var44) {
                            var4 = (SubLObject)ConsesLow.cons(var44, var4);
                        }
                    }
                    var41 = var41.rest();
                    var42 = var41.first();
                }
            }
            else {
                module0158.f10295(var9, var10);
            }
        }
        finally {
            module0018.$g638$.rebind(var8, var3);
            module0018.$g637$.rebind(var7, var3);
            module0148.$g2099$.rebind(var6, var3);
        }
        if (module0443.NIL != var4) {
            return module0052.f3709(var4);
        }
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30755(final SubLObject var1) {
        return module0202.f12817((SubLObject)module0443.ZERO_INTEGER, module0443.$g3549$.getGlobalValue(), var1);
    }
    
    public static SubLObject f30757(final SubLObject var1, final SubLObject var2) {
        return module0217.f14404(f30755(var1), module0130.f8518(var2), (SubLObject)module0443.$ic13$);
    }
    
    public static SubLObject f30749(final SubLObject var1, final SubLObject var2) {
        return f30758(var1, var2, (SubLObject)module0443.NIL);
    }
    
    public static SubLObject f30758(final SubLObject var1, final SubLObject var2, final SubLObject var59) {
        final SubLThread var60 = SubLProcess.currentSubLThread();
        final SubLObject var61 = (var2 == module0443.$ic0$) ? module0141.f9210() : module0141.f9208();
        final SubLObject var62 = module0205.f13378(var1);
        final SubLObject var63 = module0226.f14807(module0205.f13378(var1));
        final SubLObject var64 = module0321.f21664(var1).first();
        final SubLObject var65 = module0205.f13376(var1, var64, (SubLObject)module0443.UNPROVIDED);
        SubLObject var66 = (SubLObject)module0443.ZERO_INTEGER;
        final SubLObject var67 = module0137.f8955(module0443.$ic14$);
        final SubLObject var68 = var62;
        final SubLObject var69 = (SubLObject)module0443.$ic17$;
        final SubLObject var70 = module0056.f4145(var69);
        SubLObject var71 = (SubLObject)module0443.NIL;
        final SubLObject var72 = module0139.$g1635$.currentBinding(var60);
        try {
            module0139.$g1635$.bind(module0139.f9007(), var60);
            final SubLObject var73 = (SubLObject)module0443.NIL;
            final SubLObject var8_72 = module0141.$g1714$.currentBinding(var60);
            final SubLObject var74 = module0141.$g1715$.currentBinding(var60);
            try {
                module0141.$g1714$.bind((module0443.NIL != var73) ? var73 : module0141.f9283(), var60);
                module0141.$g1715$.bind((SubLObject)((module0443.NIL != var73) ? module0443.$ic18$ : module0141.$g1715$.getDynamicValue(var60)), var60);
                if (module0443.NIL != var73 && module0443.NIL != module0136.f8864() && module0443.NIL == module0141.f9279(var73)) {
                    final SubLObject var75 = module0136.$g1591$.getDynamicValue(var60);
                    if (var75.eql((SubLObject)module0443.$ic19$)) {
                        module0136.f8870((SubLObject)module0443.ONE_INTEGER, (SubLObject)module0443.$ic20$, var73, (SubLObject)module0443.$ic21$, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED);
                    }
                    else if (var75.eql((SubLObject)module0443.$ic22$)) {
                        module0136.f8871((SubLObject)module0443.ONE_INTEGER, (SubLObject)module0443.$ic23$, (SubLObject)module0443.$ic20$, var73, (SubLObject)module0443.$ic21$, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED);
                    }
                    else if (var75.eql((SubLObject)module0443.$ic24$)) {
                        Errors.warn((SubLObject)module0443.$ic20$, var73, (SubLObject)module0443.$ic21$);
                    }
                    else {
                        Errors.warn((SubLObject)module0443.$ic25$, module0136.$g1591$.getDynamicValue(var60));
                        Errors.cerror((SubLObject)module0443.$ic23$, (SubLObject)module0443.$ic20$, var73, (SubLObject)module0443.$ic21$);
                    }
                }
                final SubLObject var8_73 = module0141.$g1670$.currentBinding(var60);
                final SubLObject var9_74 = module0141.$g1671$.currentBinding(var60);
                final SubLObject var76 = module0141.$g1672$.currentBinding(var60);
                final SubLObject var77 = module0141.$g1674$.currentBinding(var60);
                final SubLObject var78 = module0137.$g1605$.currentBinding(var60);
                try {
                    module0141.$g1670$.bind(var67, var60);
                    module0141.$g1671$.bind(module0244.f15739(var67), var60);
                    module0141.$g1672$.bind(module0244.f15746(var67), var60);
                    module0141.$g1674$.bind((SubLObject)module0443.NIL, var60);
                    module0137.$g1605$.bind(var67, var60);
                    if (module0443.NIL != module0136.f8865() || module0443.NIL != module0244.f15795(var62, module0137.f8955((SubLObject)module0443.UNPROVIDED))) {
                        final SubLObject var8_74 = module0141.$g1677$.currentBinding(var60);
                        final SubLObject var9_75 = module0138.$g1619$.currentBinding(var60);
                        final SubLObject var10_77 = module0141.$g1674$.currentBinding(var60);
                        try {
                            module0141.$g1677$.bind(var61, var60);
                            module0138.$g1619$.bind(module0244.f15782(var61, var67), var60);
                            module0141.$g1674$.bind((SubLObject)module0443.NIL, var60);
                            module0249.f16055(var68, (SubLObject)module0443.UNPROVIDED);
                            for (var71 = (SubLObject)ConsesLow.list(var62, module0141.f9195()); module0443.NIL != var71; var71 = module0056.f4150(var70)) {
                                final SubLObject var67_78 = var71.first();
                                final SubLObject var79 = conses_high.second(var71);
                                final SubLObject var80 = var67_78;
                                final SubLObject var8_75 = module0141.$g1674$.currentBinding(var60);
                                try {
                                    module0141.$g1674$.bind(var79, var60);
                                    final SubLObject var81 = var79;
                                    if (!var62.eql(var80) && var59.eql(var81)) {
                                        final SubLObject var82 = module0202.f12817((SubLObject)module0443.ZERO_INTEGER, var80, var1);
                                        var66 = Numbers.add(var66, module0217.f14406(var82, module0130.f8518(var2), (SubLObject)module0443.UNPROVIDED));
                                    }
                                    SubLObject var84;
                                    final SubLObject var83 = var84 = module0200.f12443(var67);
                                    SubLObject var85 = (SubLObject)module0443.NIL;
                                    var85 = var84.first();
                                    while (module0443.NIL != var84) {
                                        final SubLObject var8_76 = module0137.$g1605$.currentBinding(var60);
                                        final SubLObject var9_76 = module0141.$g1674$.currentBinding(var60);
                                        try {
                                            module0137.$g1605$.bind(var85, var60);
                                            module0141.$g1674$.bind((SubLObject)((module0443.NIL != module0141.f9205((SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0443.NIL == module0141.$g1674$.getDynamicValue(var60)) : module0141.$g1674$.getDynamicValue(var60)), var60);
                                            final SubLObject var86 = module0228.f15229(var67_78);
                                            if (module0443.NIL != module0138.f8992(var86)) {
                                                final SubLObject var87 = module0242.f15664(var86, module0137.f8955((SubLObject)module0443.UNPROVIDED));
                                                if (module0443.NIL != var87) {
                                                    final SubLObject var88 = module0245.f15834(var87, module0138.f8979(), module0137.f8955((SubLObject)module0443.UNPROVIDED));
                                                    if (module0443.NIL != var88) {
                                                        SubLObject var89;
                                                        for (var89 = module0066.f4838(module0067.f4891(var88)); module0443.NIL == module0066.f4841(var89); var89 = module0066.f4840(var89)) {
                                                            var60.resetMultipleValues();
                                                            final SubLObject var90 = module0066.f4839(var89);
                                                            final SubLObject var91 = var60.secondMultipleValue();
                                                            var60.resetMultipleValues();
                                                            if (module0443.NIL != module0147.f9507(var90)) {
                                                                final SubLObject var8_77 = module0138.$g1623$.currentBinding(var60);
                                                                try {
                                                                    module0138.$g1623$.bind(var90, var60);
                                                                    SubLObject var91_95;
                                                                    for (var91_95 = module0066.f4838(module0067.f4891(var91)); module0443.NIL == module0066.f4841(var91_95); var91_95 = module0066.f4840(var91_95)) {
                                                                        var60.resetMultipleValues();
                                                                        final SubLObject var92 = module0066.f4839(var91_95);
                                                                        final SubLObject var93 = var60.secondMultipleValue();
                                                                        var60.resetMultipleValues();
                                                                        if (module0443.NIL != module0141.f9289(var92)) {
                                                                            final SubLObject var8_78 = module0138.$g1624$.currentBinding(var60);
                                                                            try {
                                                                                module0138.$g1624$.bind(var92, var60);
                                                                                final SubLObject var94 = var93;
                                                                                if (module0443.NIL != module0077.f5302(var94)) {
                                                                                    final SubLObject var95 = module0077.f5333(var94);
                                                                                    SubLObject var96;
                                                                                    SubLObject var97;
                                                                                    SubLObject var98;
                                                                                    for (var96 = module0032.f1741(var95), var97 = (SubLObject)module0443.NIL, var97 = module0032.f1742(var96, var95); module0443.NIL == module0032.f1744(var96, var97); var97 = module0032.f1743(var97)) {
                                                                                        var98 = module0032.f1745(var96, var97);
                                                                                        if (module0443.NIL != module0032.f1746(var97, var98) && module0443.NIL == module0249.f16059(var98, (SubLObject)module0443.UNPROVIDED)) {
                                                                                            module0249.f16055(var98, (SubLObject)module0443.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var98, module0141.f9195()), var70);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var94.isList()) {
                                                                                    SubLObject var99 = var94;
                                                                                    SubLObject var100 = (SubLObject)module0443.NIL;
                                                                                    var100 = var99.first();
                                                                                    while (module0443.NIL != var99) {
                                                                                        if (module0443.NIL == module0249.f16059(var100, (SubLObject)module0443.UNPROVIDED)) {
                                                                                            module0249.f16055(var100, (SubLObject)module0443.UNPROVIDED);
                                                                                            module0056.f4149((SubLObject)ConsesLow.list(var100, module0141.f9195()), var70);
                                                                                        }
                                                                                        var99 = var99.rest();
                                                                                        var100 = var99.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0443.$ic26$, var94);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var8_78, var60);
                                                                            }
                                                                        }
                                                                    }
                                                                    module0066.f4842(var91_95);
                                                                }
                                                                finally {
                                                                    module0138.$g1623$.rebind(var8_77, var60);
                                                                }
                                                            }
                                                        }
                                                        module0066.f4842(var89);
                                                    }
                                                }
                                                else {
                                                    module0136.f8870((SubLObject)module0443.FIVE_INTEGER, (SubLObject)module0443.$ic27$, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED);
                                                }
                                            }
                                            else if (module0443.NIL != module0155.f9785(var86, (SubLObject)module0443.UNPROVIDED)) {
                                                SubLObject var58_106;
                                                final SubLObject var101 = var58_106 = ((module0443.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var60), module0137.f8955((SubLObject)module0443.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var60), module0137.f8955((SubLObject)module0443.UNPROVIDED)));
                                                SubLObject var102 = (SubLObject)module0443.NIL;
                                                var102 = var58_106.first();
                                                while (module0443.NIL != var58_106) {
                                                    final SubLObject var8_79 = module0138.$g1625$.currentBinding(var60);
                                                    try {
                                                        module0138.$g1625$.bind(var102, var60);
                                                        final SubLObject var104;
                                                        final SubLObject var103 = var104 = Functions.funcall(var102, var86);
                                                        if (module0443.NIL != module0077.f5302(var104)) {
                                                            final SubLObject var105 = module0077.f5333(var104);
                                                            SubLObject var106;
                                                            SubLObject var107;
                                                            SubLObject var108;
                                                            for (var106 = module0032.f1741(var105), var107 = (SubLObject)module0443.NIL, var107 = module0032.f1742(var106, var105); module0443.NIL == module0032.f1744(var106, var107); var107 = module0032.f1743(var107)) {
                                                                var108 = module0032.f1745(var106, var107);
                                                                if (module0443.NIL != module0032.f1746(var107, var108) && module0443.NIL == module0249.f16059(var108, (SubLObject)module0443.UNPROVIDED)) {
                                                                    module0249.f16055(var108, (SubLObject)module0443.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var108, module0141.f9195()), var70);
                                                                }
                                                            }
                                                        }
                                                        else if (var104.isList()) {
                                                            SubLObject var109 = var104;
                                                            SubLObject var110 = (SubLObject)module0443.NIL;
                                                            var110 = var109.first();
                                                            while (module0443.NIL != var109) {
                                                                if (module0443.NIL == module0249.f16059(var110, (SubLObject)module0443.UNPROVIDED)) {
                                                                    module0249.f16055(var110, (SubLObject)module0443.UNPROVIDED);
                                                                    module0056.f4149((SubLObject)ConsesLow.list(var110, module0141.f9195()), var70);
                                                                }
                                                                var109 = var109.rest();
                                                                var110 = var109.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)module0443.$ic26$, var104);
                                                        }
                                                    }
                                                    finally {
                                                        module0138.$g1625$.rebind(var8_79, var60);
                                                    }
                                                    var58_106 = var58_106.rest();
                                                    var102 = var58_106.first();
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var9_76, var60);
                                            module0137.$g1605$.rebind(var8_76, var60);
                                        }
                                        var84 = var84.rest();
                                        var85 = var84.first();
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var8_75, var60);
                                }
                            }
                        }
                        finally {
                            module0141.$g1674$.rebind(var10_77, var60);
                            module0138.$g1619$.rebind(var9_75, var60);
                            module0141.$g1677$.rebind(var8_74, var60);
                        }
                    }
                    else {
                        module0136.f8872((SubLObject)module0443.TWO_INTEGER, (SubLObject)module0443.$ic28$, var62, module0244.f15748(module0137.f8955((SubLObject)module0443.UNPROVIDED)), (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED);
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var78, var60);
                    module0141.$g1674$.rebind(var77, var60);
                    module0141.$g1672$.rebind(var76, var60);
                    module0141.$g1671$.rebind(var9_74, var60);
                    module0141.$g1670$.rebind(var8_73, var60);
                }
            }
            finally {
                module0141.$g1715$.rebind(var74, var60);
                module0141.$g1714$.rebind(var8_72, var60);
            }
            module0139.f9011(module0139.$g1635$.getDynamicValue(var60));
        }
        finally {
            module0139.$g1635$.rebind(var72, var60);
        }
        return var66;
    }
    
    public static SubLObject f30756(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (module0443.NIL != module0351.f23568(var109)) {
            final SubLObject var111 = module0178.f11285(var109);
            final SubLObject var112 = module0205.f13333(var111);
            final SubLObject var113 = module0205.f13333(module0018.$g637$.getDynamicValue(var110));
            if (!var112.eql(var113)) {
                var110.resetMultipleValues();
                final SubLObject var114 = module0235.f15477(module0018.$g637$.getDynamicValue(var110), var111, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED);
                final SubLObject var115 = var110.secondMultipleValue();
                final SubLObject var116 = var110.thirdMultipleValue();
                var110.resetMultipleValues();
                if (module0443.NIL != var114) {
                    return (SubLObject)ConsesLow.list(var114, var109);
                }
            }
        }
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30759(final SubLObject var1, final SubLObject var109, final SubLObject var2) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        final SubLObject var111 = module0205.f13333(module0178.f11285(var109));
        final SubLObject var112 = module0205.f13333(var1);
        final SubLObject var113 = (module0443.$ic0$ == var2) ? var111 : var112;
        final SubLObject var114 = (module0443.$ic0$ == var2) ? var112 : var111;
        final SubLObject var115 = module0435.f30621(var113, var114);
        var110.resetMultipleValues();
        final SubLObject var116 = module0235.f15477(var1, module0178.f11285(var109), (SubLObject)module0443.T, (SubLObject)module0443.T);
        final SubLObject var117 = var110.secondMultipleValue();
        final SubLObject var118 = var110.thirdMultipleValue();
        var110.resetMultipleValues();
        return ConsesLow.append((SubLObject)ConsesLow.list(var109, var115), var118);
    }
    
    public static SubLObject f30760(final SubLObject var1, SubLObject var2) {
        if (var2 == module0443.UNPROVIDED) {
            var2 = (SubLObject)module0443.NIL;
        }
        if (module0443.NIL != module0193.f12105(var1)) {
            return module0018.$g660$.getGlobalValue();
        }
        return f30749(var1, (SubLObject)module0443.$ic0$);
    }
    
    public static SubLObject f30761(final SubLObject var1) {
        return f30762(var1, (SubLObject)module0443.$ic0$);
    }
    
    public static SubLObject f30763(final SubLObject var1) {
        if (module0443.NIL != module0435.f30612(var1, (SubLObject)module0443.$ic3$)) {
            return (SubLObject)module0443.$ic4$;
        }
        return (SubLObject)module0443.$ic5$;
    }
    
    public static SubLObject f30764(final SubLObject var1, SubLObject var2) {
        if (var2 == module0443.UNPROVIDED) {
            var2 = (SubLObject)module0443.NIL;
        }
        final SubLObject var3 = module0205.f13333(var1);
        final SubLObject var4 = module0349.f23410(var3);
        SubLObject var5 = (SubLObject)module0443.ZERO_INTEGER;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)module0443.NIL;
        var7 = var6.first();
        while (module0443.NIL != var6) {
            var5 = Numbers.add(var5, module0217.f14247(var7, (SubLObject)module0443.UNPROVIDED));
            var6 = var6.rest();
            var7 = var6.first();
        }
        return var5;
    }
    
    public static SubLObject f30765(final SubLObject var1) {
        return f30762(var1, (SubLObject)module0443.$ic3$);
    }
    
    public static SubLObject f30762(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0443.NIL;
        final SubLObject var5 = module0205.f13333(var1);
        final SubLObject var6 = module0018.$g637$.currentBinding(var3);
        try {
            module0018.$g637$.bind(var1, var3);
            SubLObject var7 = (SubLObject)module0443.NIL;
            if (module0443.$ic0$ == var2) {
                var7 = module0349.f23411(var5);
            }
            else {
                var7 = module0349.f23410(var5);
            }
            SubLObject var8 = var7;
            SubLObject var9 = (SubLObject)module0443.NIL;
            var9 = var8.first();
            while (module0443.NIL != var8) {
                if (!var9.eql(var5)) {
                    final SubLObject var10 = module0202.f12817((SubLObject)module0443.ZERO_INTEGER, var9, var1);
                    final SubLObject var11 = module0217.f14404(var10, module0130.f8518(var2), (SubLObject)module0443.NIL);
                    final SubLObject var13;
                    final SubLObject var12 = var13 = module0158.f10294(var11);
                    if (var13.eql((SubLObject)module0443.$ic8$)) {
                        var3.resetMultipleValues();
                        final SubLObject var14 = module0158.f10297(var11);
                        final SubLObject var15 = var3.secondMultipleValue();
                        final SubLObject var16_124 = var3.thirdMultipleValue();
                        var3.resetMultipleValues();
                        if (module0443.NIL != var15) {
                            if (module0443.NIL != var16_124) {
                                final SubLObject var16 = var16_124;
                                if (module0443.NIL != module0158.f10010(var14, var15, var16)) {
                                    final SubLObject var17 = module0158.f10011(var14, var15, var16);
                                    SubLObject var18 = (SubLObject)module0443.NIL;
                                    final SubLObject var19 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var18) {
                                        final SubLObject var20 = module0052.f3695(var17, var19);
                                        final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                                        if (module0443.NIL != var21) {
                                            SubLObject var22 = (SubLObject)module0443.NIL;
                                            try {
                                                var22 = module0158.f10316(var20, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                                SubLObject var19_125 = (SubLObject)module0443.NIL;
                                                final SubLObject var20_126 = (SubLObject)module0443.NIL;
                                                while (module0443.NIL == var19_125) {
                                                    final SubLObject var23 = module0052.f3695(var22, var20_126);
                                                    final SubLObject var22_127 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_126.eql(var23));
                                                    if (module0443.NIL != var22_127) {
                                                        final SubLObject var25;
                                                        final SubLObject var24 = var25 = f30756(var23);
                                                        if (module0443.NIL != var25) {
                                                            var4 = (SubLObject)ConsesLow.cons(var25, var4);
                                                        }
                                                    }
                                                    var19_125 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_127);
                                                }
                                            }
                                            finally {
                                                final SubLObject var8_128 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                                    if (module0443.NIL != var22) {
                                                        module0158.f10319(var22);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var8_128, var3);
                                                }
                                            }
                                        }
                                        var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var21);
                                    }
                                }
                            }
                            else {
                                final SubLObject var16 = (SubLObject)module0443.NIL;
                                if (module0443.NIL != module0158.f10010(var14, var15, var16)) {
                                    final SubLObject var17 = module0158.f10011(var14, var15, var16);
                                    SubLObject var18 = (SubLObject)module0443.NIL;
                                    final SubLObject var19 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var18) {
                                        final SubLObject var20 = module0052.f3695(var17, var19);
                                        final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                                        if (module0443.NIL != var21) {
                                            SubLObject var22 = (SubLObject)module0443.NIL;
                                            try {
                                                var22 = module0158.f10316(var20, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                                SubLObject var19_126 = (SubLObject)module0443.NIL;
                                                final SubLObject var20_127 = (SubLObject)module0443.NIL;
                                                while (module0443.NIL == var19_126) {
                                                    final SubLObject var23 = module0052.f3695(var22, var20_127);
                                                    final SubLObject var22_128 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_127.eql(var23));
                                                    if (module0443.NIL != var22_128) {
                                                        final SubLObject var25;
                                                        final SubLObject var24 = var25 = f30756(var23);
                                                        if (module0443.NIL != var25) {
                                                            var4 = (SubLObject)ConsesLow.cons(var25, var4);
                                                        }
                                                    }
                                                    var19_126 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_128);
                                                }
                                            }
                                            finally {
                                                final SubLObject var8_129 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                                    if (module0443.NIL != var22) {
                                                        module0158.f10319(var22);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var8_129, var3);
                                                }
                                            }
                                        }
                                        var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var21);
                                    }
                                }
                            }
                        }
                        else if (module0443.NIL != var16_124) {
                            final SubLObject var16 = var16_124;
                            if (module0443.NIL != module0158.f10010(var14, (SubLObject)module0443.NIL, var16)) {
                                final SubLObject var17 = module0158.f10011(var14, (SubLObject)module0443.NIL, var16);
                                SubLObject var18 = (SubLObject)module0443.NIL;
                                final SubLObject var19 = (SubLObject)module0443.NIL;
                                while (module0443.NIL == var18) {
                                    final SubLObject var20 = module0052.f3695(var17, var19);
                                    final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                                    if (module0443.NIL != var21) {
                                        SubLObject var22 = (SubLObject)module0443.NIL;
                                        try {
                                            var22 = module0158.f10316(var20, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                            SubLObject var19_127 = (SubLObject)module0443.NIL;
                                            final SubLObject var20_128 = (SubLObject)module0443.NIL;
                                            while (module0443.NIL == var19_127) {
                                                final SubLObject var23 = module0052.f3695(var22, var20_128);
                                                final SubLObject var22_129 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_128.eql(var23));
                                                if (module0443.NIL != var22_129) {
                                                    final SubLObject var25;
                                                    final SubLObject var24 = var25 = f30756(var23);
                                                    if (module0443.NIL != var25) {
                                                        var4 = (SubLObject)ConsesLow.cons(var25, var4);
                                                    }
                                                }
                                                var19_127 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_129);
                                            }
                                        }
                                        finally {
                                            final SubLObject var8_130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                                if (module0443.NIL != var22) {
                                                    module0158.f10319(var22);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var8_130, var3);
                                            }
                                        }
                                    }
                                    var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var21);
                                }
                            }
                        }
                        else {
                            final SubLObject var16 = (SubLObject)module0443.NIL;
                            if (module0443.NIL != module0158.f10010(var14, (SubLObject)module0443.NIL, var16)) {
                                final SubLObject var17 = module0158.f10011(var14, (SubLObject)module0443.NIL, var16);
                                SubLObject var18 = (SubLObject)module0443.NIL;
                                final SubLObject var19 = (SubLObject)module0443.NIL;
                                while (module0443.NIL == var18) {
                                    final SubLObject var20 = module0052.f3695(var17, var19);
                                    final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                                    if (module0443.NIL != var21) {
                                        SubLObject var22 = (SubLObject)module0443.NIL;
                                        try {
                                            var22 = module0158.f10316(var20, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                            SubLObject var19_128 = (SubLObject)module0443.NIL;
                                            final SubLObject var20_129 = (SubLObject)module0443.NIL;
                                            while (module0443.NIL == var19_128) {
                                                final SubLObject var23 = module0052.f3695(var22, var20_129);
                                                final SubLObject var22_130 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_129.eql(var23));
                                                if (module0443.NIL != var22_130) {
                                                    final SubLObject var25;
                                                    final SubLObject var24 = var25 = f30756(var23);
                                                    if (module0443.NIL != var25) {
                                                        var4 = (SubLObject)ConsesLow.cons(var25, var4);
                                                    }
                                                }
                                                var19_128 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_130);
                                            }
                                        }
                                        finally {
                                            final SubLObject var8_131 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                                if (module0443.NIL != var22) {
                                                    module0158.f10319(var22);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var8_131, var3);
                                            }
                                        }
                                    }
                                    var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var21);
                                }
                            }
                        }
                    }
                    else if (var13.eql((SubLObject)module0443.$ic10$)) {
                        final SubLObject var26 = module0158.f10299(var11);
                        if (module0443.NIL != module0158.f10038(var26)) {
                            final SubLObject var27 = (SubLObject)module0443.NIL;
                            final SubLObject var8_132 = module0012.$g73$.currentBinding(var3);
                            final SubLObject var28 = module0012.$g65$.currentBinding(var3);
                            final SubLObject var29 = module0012.$g67$.currentBinding(var3);
                            final SubLObject var30 = module0012.$g68$.currentBinding(var3);
                            final SubLObject var31 = module0012.$g66$.currentBinding(var3);
                            final SubLObject var32 = module0012.$g69$.currentBinding(var3);
                            final SubLObject var33 = module0012.$g70$.currentBinding(var3);
                            final SubLObject var34 = module0012.$silent_progressP$.currentBinding(var3);
                            try {
                                module0012.$g73$.bind(Time.get_universal_time(), var3);
                                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                                module0012.$g67$.bind((SubLObject)module0443.ONE_INTEGER, var3);
                                module0012.$g68$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                                module0012.$g66$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                                module0012.$g69$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                                module0012.$g70$.bind((SubLObject)module0443.T, var3);
                                module0012.$silent_progressP$.bind((SubLObject)((module0443.NIL != var27) ? module0012.$silent_progressP$.getDynamicValue(var3) : module0443.T), var3);
                                module0012.f474(var27);
                                final SubLObject var35 = module0158.f10039(var26);
                                SubLObject var36 = (SubLObject)module0443.NIL;
                                final SubLObject var37 = (SubLObject)module0443.NIL;
                                while (module0443.NIL == var36) {
                                    final SubLObject var38 = module0052.f3695(var35, var37);
                                    final SubLObject var39 = (SubLObject)SubLObjectFactory.makeBoolean(!var37.eql(var38));
                                    if (module0443.NIL != var39) {
                                        module0012.f476();
                                        SubLObject var40 = (SubLObject)module0443.NIL;
                                        try {
                                            var40 = module0158.f10316(var38, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                            SubLObject var19_129 = (SubLObject)module0443.NIL;
                                            final SubLObject var20_130 = (SubLObject)module0443.NIL;
                                            while (module0443.NIL == var19_129) {
                                                final SubLObject var41 = module0052.f3695(var40, var20_130);
                                                final SubLObject var22_131 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_130.eql(var41));
                                                if (module0443.NIL != var22_131) {
                                                    final SubLObject var43;
                                                    final SubLObject var42 = var43 = f30756(var41);
                                                    if (module0443.NIL != var43) {
                                                        var4 = (SubLObject)ConsesLow.cons(var43, var4);
                                                    }
                                                }
                                                var19_129 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_131);
                                            }
                                        }
                                        finally {
                                            final SubLObject var8_133 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                                if (module0443.NIL != var40) {
                                                    module0158.f10319(var40);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var8_133, var3);
                                            }
                                        }
                                    }
                                    var36 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var39);
                                }
                                module0012.f475();
                            }
                            finally {
                                module0012.$silent_progressP$.rebind(var34, var3);
                                module0012.$g70$.rebind(var33, var3);
                                module0012.$g69$.rebind(var32, var3);
                                module0012.$g66$.rebind(var31, var3);
                                module0012.$g68$.rebind(var30, var3);
                                module0012.$g67$.rebind(var29, var3);
                                module0012.$g65$.rebind(var28, var3);
                                module0012.$g73$.rebind(var8_132, var3);
                            }
                        }
                    }
                    else if (var13.eql((SubLObject)module0443.$ic11$)) {
                        SubLObject var58_146 = module0218.f14453(module0158.f10301(var11), (SubLObject)module0443.UNPROVIDED);
                        SubLObject var44 = (SubLObject)module0443.NIL;
                        var44 = var58_146.first();
                        while (module0443.NIL != var58_146) {
                            if (module0443.NIL == module0130.f8518(var2) || module0443.NIL != module0178.f11343(var44, module0130.f8518(var2))) {
                                final SubLObject var46;
                                final SubLObject var45 = var46 = f30756(var44);
                                if (module0443.NIL != var46) {
                                    var4 = (SubLObject)ConsesLow.cons(var46, var4);
                                }
                            }
                            var58_146 = var58_146.rest();
                            var44 = var58_146.first();
                        }
                    }
                    else {
                        module0158.f10295(var11, var12);
                    }
                }
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        finally {
            module0018.$g637$.rebind(var6, var3);
        }
        if (module0443.NIL != var4) {
            return module0052.f3709(var4);
        }
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30766(final SubLObject var1, SubLObject var2) {
        if (var2 == module0443.UNPROVIDED) {
            var2 = (SubLObject)module0443.NIL;
        }
        if (module0443.NIL != module0193.f12105(var1)) {
            return module0018.$g660$.getGlobalValue();
        }
        return f30767(var1, (SubLObject)module0443.$ic0$);
    }
    
    public static SubLObject f30768(final SubLObject var1) {
        return f30769(var1, (SubLObject)module0443.$ic0$);
    }
    
    public static SubLObject f30770(final SubLObject var1) {
        if (module0443.NIL != module0435.f30612(var1, (SubLObject)module0443.$ic3$)) {
            return (SubLObject)module0443.$ic4$;
        }
        return (SubLObject)module0443.$ic5$;
    }
    
    public static SubLObject f30771(final SubLObject var1, SubLObject var2) {
        if (var2 == module0443.UNPROVIDED) {
            var2 = (SubLObject)module0443.NIL;
        }
        return f30767(var1, (SubLObject)module0443.$ic3$);
    }
    
    public static SubLObject f30772(final SubLObject var1) {
        return f30769(var1, (SubLObject)module0443.$ic3$);
    }
    
    public static SubLObject f30769(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0443.NIL;
        final SubLObject var5 = f30755(module0439.f30674(var1));
        final SubLObject var6 = module0148.$g2099$.currentBinding(var3);
        final SubLObject var7 = module0018.$g637$.currentBinding(var3);
        final SubLObject var8 = module0018.$g638$.currentBinding(var3);
        try {
            module0148.$g2099$.bind(module0148.f9604(var2), var3);
            module0018.$g637$.bind(var1, var3);
            module0018.$g638$.bind(var2, var3);
            final SubLObject var9 = module0217.f14404(var5, module0130.f8518(var2), (SubLObject)module0443.NIL);
            final SubLObject var11;
            final SubLObject var10 = var11 = module0158.f10294(var9);
            if (var11.eql((SubLObject)module0443.$ic8$)) {
                var3.resetMultipleValues();
                final SubLObject var12 = module0158.f10297(var9);
                final SubLObject var13 = var3.secondMultipleValue();
                final SubLObject var14 = var3.thirdMultipleValue();
                var3.resetMultipleValues();
                if (module0443.NIL != var13) {
                    if (module0443.NIL != var14) {
                        final SubLObject var15 = var14;
                        if (module0443.NIL != module0158.f10010(var12, var13, var15)) {
                            final SubLObject var16 = module0158.f10011(var12, var13, var15);
                            SubLObject var17 = (SubLObject)module0443.NIL;
                            final SubLObject var18 = (SubLObject)module0443.NIL;
                            while (module0443.NIL == var17) {
                                final SubLObject var19 = module0052.f3695(var16, var18);
                                final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                                if (module0443.NIL != var20) {
                                    SubLObject var21 = (SubLObject)module0443.NIL;
                                    try {
                                        var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                        SubLObject var19_147 = (SubLObject)module0443.NIL;
                                        final SubLObject var20_148 = (SubLObject)module0443.NIL;
                                        while (module0443.NIL == var19_147) {
                                            final SubLObject var22 = module0052.f3695(var21, var20_148);
                                            final SubLObject var22_149 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_148.eql(var22));
                                            if (module0443.NIL != var22_149) {
                                                final SubLObject var23 = f30773(var1, var22);
                                                if (module0443.NIL != var23) {
                                                    var4 = (SubLObject)ConsesLow.cons(var23, var4);
                                                }
                                            }
                                            var19_147 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_149);
                                        }
                                    }
                                    finally {
                                        final SubLObject var8_150 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                            if (module0443.NIL != var21) {
                                                module0158.f10319(var21);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var8_150, var3);
                                        }
                                    }
                                }
                                var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                            }
                        }
                    }
                    else {
                        final SubLObject var15 = (SubLObject)module0443.NIL;
                        if (module0443.NIL != module0158.f10010(var12, var13, var15)) {
                            final SubLObject var16 = module0158.f10011(var12, var13, var15);
                            SubLObject var17 = (SubLObject)module0443.NIL;
                            final SubLObject var18 = (SubLObject)module0443.NIL;
                            while (module0443.NIL == var17) {
                                final SubLObject var19 = module0052.f3695(var16, var18);
                                final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                                if (module0443.NIL != var20) {
                                    SubLObject var21 = (SubLObject)module0443.NIL;
                                    try {
                                        var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                        SubLObject var19_148 = (SubLObject)module0443.NIL;
                                        final SubLObject var20_149 = (SubLObject)module0443.NIL;
                                        while (module0443.NIL == var19_148) {
                                            final SubLObject var22 = module0052.f3695(var21, var20_149);
                                            final SubLObject var22_150 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_149.eql(var22));
                                            if (module0443.NIL != var22_150) {
                                                final SubLObject var23 = f30773(var1, var22);
                                                if (module0443.NIL != var23) {
                                                    var4 = (SubLObject)ConsesLow.cons(var23, var4);
                                                }
                                            }
                                            var19_148 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_150);
                                        }
                                    }
                                    finally {
                                        final SubLObject var8_151 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                            if (module0443.NIL != var21) {
                                                module0158.f10319(var21);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var8_151, var3);
                                        }
                                    }
                                }
                                var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                            }
                        }
                    }
                }
                else if (module0443.NIL != var14) {
                    final SubLObject var15 = var14;
                    if (module0443.NIL != module0158.f10010(var12, (SubLObject)module0443.NIL, var15)) {
                        final SubLObject var16 = module0158.f10011(var12, (SubLObject)module0443.NIL, var15);
                        SubLObject var17 = (SubLObject)module0443.NIL;
                        final SubLObject var18 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var17) {
                            final SubLObject var19 = module0052.f3695(var16, var18);
                            final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                            if (module0443.NIL != var20) {
                                SubLObject var21 = (SubLObject)module0443.NIL;
                                try {
                                    var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                    SubLObject var19_149 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_150 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_149) {
                                        final SubLObject var22 = module0052.f3695(var21, var20_150);
                                        final SubLObject var22_151 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_150.eql(var22));
                                        if (module0443.NIL != var22_151) {
                                            final SubLObject var23 = f30773(var1, var22);
                                            if (module0443.NIL != var23) {
                                                var4 = (SubLObject)ConsesLow.cons(var23, var4);
                                            }
                                        }
                                        var19_149 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_151);
                                    }
                                }
                                finally {
                                    final SubLObject var8_152 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                        if (module0443.NIL != var21) {
                                            module0158.f10319(var21);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_152, var3);
                                    }
                                }
                            }
                            var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                        }
                    }
                }
                else {
                    final SubLObject var15 = (SubLObject)module0443.NIL;
                    if (module0443.NIL != module0158.f10010(var12, (SubLObject)module0443.NIL, var15)) {
                        final SubLObject var16 = module0158.f10011(var12, (SubLObject)module0443.NIL, var15);
                        SubLObject var17 = (SubLObject)module0443.NIL;
                        final SubLObject var18 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var17) {
                            final SubLObject var19 = module0052.f3695(var16, var18);
                            final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                            if (module0443.NIL != var20) {
                                SubLObject var21 = (SubLObject)module0443.NIL;
                                try {
                                    var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                    SubLObject var19_150 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_151 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_150) {
                                        final SubLObject var22 = module0052.f3695(var21, var20_151);
                                        final SubLObject var22_152 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_151.eql(var22));
                                        if (module0443.NIL != var22_152) {
                                            final SubLObject var23 = f30773(var1, var22);
                                            if (module0443.NIL != var23) {
                                                var4 = (SubLObject)ConsesLow.cons(var23, var4);
                                            }
                                        }
                                        var19_150 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_152);
                                    }
                                }
                                finally {
                                    final SubLObject var8_153 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                        if (module0443.NIL != var21) {
                                            module0158.f10319(var21);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_153, var3);
                                    }
                                }
                            }
                            var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                        }
                    }
                }
            }
            else if (var11.eql((SubLObject)module0443.$ic10$)) {
                final SubLObject var24 = module0158.f10299(var9);
                if (module0443.NIL != module0158.f10038(var24)) {
                    final SubLObject var25 = (SubLObject)module0443.NIL;
                    final SubLObject var8_154 = module0012.$g73$.currentBinding(var3);
                    final SubLObject var9_164 = module0012.$g65$.currentBinding(var3);
                    final SubLObject var10_165 = module0012.$g67$.currentBinding(var3);
                    final SubLObject var26 = module0012.$g68$.currentBinding(var3);
                    final SubLObject var27 = module0012.$g66$.currentBinding(var3);
                    final SubLObject var28 = module0012.$g69$.currentBinding(var3);
                    final SubLObject var29 = module0012.$g70$.currentBinding(var3);
                    final SubLObject var30 = module0012.$silent_progressP$.currentBinding(var3);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var3);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                        module0012.$g67$.bind((SubLObject)module0443.ONE_INTEGER, var3);
                        module0012.$g68$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                        module0012.$g66$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                        module0012.$g69$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                        module0012.$g70$.bind((SubLObject)module0443.T, var3);
                        module0012.$silent_progressP$.bind((SubLObject)((module0443.NIL != var25) ? module0012.$silent_progressP$.getDynamicValue(var3) : module0443.T), var3);
                        module0012.f474(var25);
                        final SubLObject var31 = module0158.f10039(var24);
                        SubLObject var32 = (SubLObject)module0443.NIL;
                        final SubLObject var33 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var32) {
                            final SubLObject var34 = module0052.f3695(var31, var33);
                            final SubLObject var35 = (SubLObject)SubLObjectFactory.makeBoolean(!var33.eql(var34));
                            if (module0443.NIL != var35) {
                                module0012.f476();
                                SubLObject var36 = (SubLObject)module0443.NIL;
                                try {
                                    var36 = module0158.f10316(var34, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                    SubLObject var19_151 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_152 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_151) {
                                        final SubLObject var37 = module0052.f3695(var36, var20_152);
                                        final SubLObject var22_153 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_152.eql(var37));
                                        if (module0443.NIL != var22_153) {
                                            final SubLObject var38 = f30773(var1, var37);
                                            if (module0443.NIL != var38) {
                                                var4 = (SubLObject)ConsesLow.cons(var38, var4);
                                            }
                                        }
                                        var19_151 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_153);
                                    }
                                }
                                finally {
                                    final SubLObject var8_155 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                        if (module0443.NIL != var36) {
                                            module0158.f10319(var36);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_155, var3);
                                    }
                                }
                            }
                            var32 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var35);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var30, var3);
                        module0012.$g70$.rebind(var29, var3);
                        module0012.$g69$.rebind(var28, var3);
                        module0012.$g66$.rebind(var27, var3);
                        module0012.$g68$.rebind(var26, var3);
                        module0012.$g67$.rebind(var10_165, var3);
                        module0012.$g65$.rebind(var9_164, var3);
                        module0012.$g73$.rebind(var8_154, var3);
                    }
                }
            }
            else if (var11.eql((SubLObject)module0443.$ic11$)) {
                SubLObject var39 = module0218.f14453(module0158.f10301(var9), (SubLObject)module0443.UNPROVIDED);
                SubLObject var40 = (SubLObject)module0443.NIL;
                var40 = var39.first();
                while (module0443.NIL != var39) {
                    if (module0443.NIL == module0130.f8518(var2) || module0443.NIL != module0178.f11343(var40, module0130.f8518(var2))) {
                        final SubLObject var41 = f30773(var1, var40);
                        if (module0443.NIL != var41) {
                            var4 = (SubLObject)ConsesLow.cons(var41, var4);
                        }
                    }
                    var39 = var39.rest();
                    var40 = var39.first();
                }
            }
            else {
                module0158.f10295(var9, var10);
            }
        }
        finally {
            module0018.$g638$.rebind(var8, var3);
            module0018.$g637$.rebind(var7, var3);
            module0148.$g2099$.rebind(var6, var3);
        }
        if (module0443.NIL != var4) {
            return module0052.f3709(var4);
        }
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30774(final SubLObject var1, final SubLObject var2) {
        return module0217.f14404(f30755(module0439.f30674(var1)), module0130.f8518(var2), (SubLObject)module0443.$ic13$);
    }
    
    public static SubLObject f30767(final SubLObject var1, final SubLObject var2) {
        return f30758(var1, var2, (SubLObject)module0443.T);
    }
    
    public static SubLObject f30773(final SubLObject var1, final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (module0443.NIL != module0351.f23568(var109)) {
            final SubLObject var111 = module0178.f11285(var109);
            final SubLObject var112 = module0205.f13333(var111);
            final SubLObject var113 = module0205.f13333(var1);
            if (!var112.eql(var113)) {
                final SubLObject var114 = module0439.f30674(var1);
                var110.resetMultipleValues();
                final SubLObject var115 = module0235.f15477(var114, var111, (SubLObject)module0443.T, (SubLObject)module0443.T);
                final SubLObject var116 = var110.secondMultipleValue();
                final SubLObject var117 = var110.thirdMultipleValue();
                var110.resetMultipleValues();
                if (module0443.NIL != var115) {
                    return (SubLObject)ConsesLow.list(var115, var109);
                }
            }
        }
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30775(final SubLObject var1, final SubLObject var109, final SubLObject var2) {
        final SubLObject var110 = module0205.f13333(module0178.f11285(var109));
        final SubLObject var111 = module0205.f13333(var1);
        final SubLObject var112 = (module0443.$ic0$ == var2) ? var110 : var111;
        final SubLObject var113 = (module0443.$ic0$ == var2) ? var111 : var110;
        final SubLObject var114 = module0435.f30619(var112, var113);
        return (SubLObject)ConsesLow.list(var109, var114);
    }
    
    public static SubLObject f30776(final SubLObject var1, SubLObject var2) {
        if (var2 == module0443.UNPROVIDED) {
            var2 = (SubLObject)module0443.NIL;
        }
        if (module0443.NIL != module0193.f12105(var1)) {
            return module0018.$g660$.getGlobalValue();
        }
        return f30767(var1, (SubLObject)module0443.$ic0$);
    }
    
    public static SubLObject f30777(final SubLObject var1) {
        return f30778(var1, (SubLObject)module0443.$ic0$);
    }
    
    public static SubLObject f30779(final SubLObject var1) {
        if (module0443.NIL != module0435.f30612(var1, (SubLObject)module0443.$ic3$)) {
            return (SubLObject)module0443.$ic4$;
        }
        return (SubLObject)module0443.$ic5$;
    }
    
    public static SubLObject f30780(final SubLObject var1, SubLObject var2) {
        if (var2 == module0443.UNPROVIDED) {
            var2 = (SubLObject)module0443.NIL;
        }
        if (module0443.NIL != module0193.f12105(var1)) {
            return module0018.$g660$.getGlobalValue();
        }
        final SubLObject var3 = module0205.f13333(var1);
        final SubLObject var4 = module0349.f23415(var3);
        SubLObject var5 = (SubLObject)module0443.ZERO_INTEGER;
        SubLObject var6 = var4;
        SubLObject var7 = (SubLObject)module0443.NIL;
        var7 = var6.first();
        while (module0443.NIL != var6) {
            var5 = Numbers.add(var5, module0217.f14247(var7, (SubLObject)module0443.UNPROVIDED));
            var6 = var6.rest();
            var7 = var6.first();
        }
        return var5;
    }
    
    public static SubLObject f30781(final SubLObject var1) {
        return f30778(var1, (SubLObject)module0443.$ic3$);
    }
    
    public static SubLObject f30778(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0443.NIL;
        final SubLObject var5 = module0205.f13333(var1);
        SubLObject var6 = (SubLObject)module0443.NIL;
        if (module0443.$ic0$ == var2) {
            var6 = module0349.f23416(var5);
        }
        else {
            var6 = module0349.f23415(var5);
        }
        SubLObject var7 = var6;
        SubLObject var8 = (SubLObject)module0443.NIL;
        var8 = var7.first();
        while (module0443.NIL != var7) {
            if (!var8.eql(var5)) {
                final SubLObject var9 = module0202.f12817((SubLObject)module0443.ZERO_INTEGER, var8, var1);
                final SubLObject var10 = module0217.f14404(var9, module0130.f8518(var2), (SubLObject)module0443.NIL);
                final SubLObject var12;
                final SubLObject var11 = var12 = module0158.f10294(var10);
                if (var12.eql((SubLObject)module0443.$ic8$)) {
                    var3.resetMultipleValues();
                    final SubLObject var13 = module0158.f10297(var10);
                    final SubLObject var14 = var3.secondMultipleValue();
                    final SubLObject var16_171 = var3.thirdMultipleValue();
                    var3.resetMultipleValues();
                    if (module0443.NIL != var14) {
                        if (module0443.NIL != var16_171) {
                            final SubLObject var15 = var16_171;
                            if (module0443.NIL != module0158.f10010(var13, var14, var15)) {
                                final SubLObject var16 = module0158.f10011(var13, var14, var15);
                                SubLObject var17 = (SubLObject)module0443.NIL;
                                final SubLObject var18 = (SubLObject)module0443.NIL;
                                while (module0443.NIL == var17) {
                                    final SubLObject var19 = module0052.f3695(var16, var18);
                                    final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                                    if (module0443.NIL != var20) {
                                        SubLObject var21 = (SubLObject)module0443.NIL;
                                        try {
                                            var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                            SubLObject var19_172 = (SubLObject)module0443.NIL;
                                            final SubLObject var20_173 = (SubLObject)module0443.NIL;
                                            while (module0443.NIL == var19_172) {
                                                final SubLObject var22 = module0052.f3695(var21, var20_173);
                                                final SubLObject var22_174 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_173.eql(var22));
                                                if (module0443.NIL != var22_174) {
                                                    final SubLObject var24;
                                                    final SubLObject var23 = var24 = f30773(var1, var22);
                                                    if (module0443.NIL != var24) {
                                                        var4 = (SubLObject)ConsesLow.cons(var24, var4);
                                                    }
                                                }
                                                var19_172 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_174);
                                            }
                                        }
                                        finally {
                                            final SubLObject var25 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                                if (module0443.NIL != var21) {
                                                    module0158.f10319(var21);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var25, var3);
                                            }
                                        }
                                    }
                                    var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                                }
                            }
                        }
                        else {
                            final SubLObject var15 = (SubLObject)module0443.NIL;
                            if (module0443.NIL != module0158.f10010(var13, var14, var15)) {
                                final SubLObject var16 = module0158.f10011(var13, var14, var15);
                                SubLObject var17 = (SubLObject)module0443.NIL;
                                final SubLObject var18 = (SubLObject)module0443.NIL;
                                while (module0443.NIL == var17) {
                                    final SubLObject var19 = module0052.f3695(var16, var18);
                                    final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                                    if (module0443.NIL != var20) {
                                        SubLObject var21 = (SubLObject)module0443.NIL;
                                        try {
                                            var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                            SubLObject var19_173 = (SubLObject)module0443.NIL;
                                            final SubLObject var20_174 = (SubLObject)module0443.NIL;
                                            while (module0443.NIL == var19_173) {
                                                final SubLObject var22 = module0052.f3695(var21, var20_174);
                                                final SubLObject var22_175 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_174.eql(var22));
                                                if (module0443.NIL != var22_175) {
                                                    final SubLObject var24;
                                                    final SubLObject var23 = var24 = f30773(var1, var22);
                                                    if (module0443.NIL != var24) {
                                                        var4 = (SubLObject)ConsesLow.cons(var24, var4);
                                                    }
                                                }
                                                var19_173 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_175);
                                            }
                                        }
                                        finally {
                                            final SubLObject var26 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                                if (module0443.NIL != var21) {
                                                    module0158.f10319(var21);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var26, var3);
                                            }
                                        }
                                    }
                                    var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                                }
                            }
                        }
                    }
                    else if (module0443.NIL != var16_171) {
                        final SubLObject var15 = var16_171;
                        if (module0443.NIL != module0158.f10010(var13, (SubLObject)module0443.NIL, var15)) {
                            final SubLObject var16 = module0158.f10011(var13, (SubLObject)module0443.NIL, var15);
                            SubLObject var17 = (SubLObject)module0443.NIL;
                            final SubLObject var18 = (SubLObject)module0443.NIL;
                            while (module0443.NIL == var17) {
                                final SubLObject var19 = module0052.f3695(var16, var18);
                                final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                                if (module0443.NIL != var20) {
                                    SubLObject var21 = (SubLObject)module0443.NIL;
                                    try {
                                        var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                        SubLObject var19_174 = (SubLObject)module0443.NIL;
                                        final SubLObject var20_175 = (SubLObject)module0443.NIL;
                                        while (module0443.NIL == var19_174) {
                                            final SubLObject var22 = module0052.f3695(var21, var20_175);
                                            final SubLObject var22_176 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_175.eql(var22));
                                            if (module0443.NIL != var22_176) {
                                                final SubLObject var24;
                                                final SubLObject var23 = var24 = f30773(var1, var22);
                                                if (module0443.NIL != var24) {
                                                    var4 = (SubLObject)ConsesLow.cons(var24, var4);
                                                }
                                            }
                                            var19_174 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_176);
                                        }
                                    }
                                    finally {
                                        final SubLObject var27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                            if (module0443.NIL != var21) {
                                                module0158.f10319(var21);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var27, var3);
                                        }
                                    }
                                }
                                var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                            }
                        }
                    }
                    else {
                        final SubLObject var15 = (SubLObject)module0443.NIL;
                        if (module0443.NIL != module0158.f10010(var13, (SubLObject)module0443.NIL, var15)) {
                            final SubLObject var16 = module0158.f10011(var13, (SubLObject)module0443.NIL, var15);
                            SubLObject var17 = (SubLObject)module0443.NIL;
                            final SubLObject var18 = (SubLObject)module0443.NIL;
                            while (module0443.NIL == var17) {
                                final SubLObject var19 = module0052.f3695(var16, var18);
                                final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                                if (module0443.NIL != var20) {
                                    SubLObject var21 = (SubLObject)module0443.NIL;
                                    try {
                                        var21 = module0158.f10316(var19, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                        SubLObject var19_175 = (SubLObject)module0443.NIL;
                                        final SubLObject var20_176 = (SubLObject)module0443.NIL;
                                        while (module0443.NIL == var19_175) {
                                            final SubLObject var22 = module0052.f3695(var21, var20_176);
                                            final SubLObject var22_177 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_176.eql(var22));
                                            if (module0443.NIL != var22_177) {
                                                final SubLObject var24;
                                                final SubLObject var23 = var24 = f30773(var1, var22);
                                                if (module0443.NIL != var24) {
                                                    var4 = (SubLObject)ConsesLow.cons(var24, var4);
                                                }
                                            }
                                            var19_175 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_177);
                                        }
                                    }
                                    finally {
                                        final SubLObject var28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                            if (module0443.NIL != var21) {
                                                module0158.f10319(var21);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var28, var3);
                                        }
                                    }
                                }
                                var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var20);
                            }
                        }
                    }
                }
                else if (var12.eql((SubLObject)module0443.$ic10$)) {
                    final SubLObject var29 = module0158.f10299(var10);
                    if (module0443.NIL != module0158.f10038(var29)) {
                        final SubLObject var30 = (SubLObject)module0443.NIL;
                        final SubLObject var31 = module0012.$g73$.currentBinding(var3);
                        final SubLObject var32 = module0012.$g65$.currentBinding(var3);
                        final SubLObject var33 = module0012.$g67$.currentBinding(var3);
                        final SubLObject var34 = module0012.$g68$.currentBinding(var3);
                        final SubLObject var35 = module0012.$g66$.currentBinding(var3);
                        final SubLObject var36 = module0012.$g69$.currentBinding(var3);
                        final SubLObject var37 = module0012.$g70$.currentBinding(var3);
                        final SubLObject var38 = module0012.$silent_progressP$.currentBinding(var3);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var3);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                            module0012.$g67$.bind((SubLObject)module0443.ONE_INTEGER, var3);
                            module0012.$g68$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                            module0012.$g66$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                            module0012.$g69$.bind((SubLObject)module0443.ZERO_INTEGER, var3);
                            module0012.$g70$.bind((SubLObject)module0443.T, var3);
                            module0012.$silent_progressP$.bind((SubLObject)((module0443.NIL != var30) ? module0012.$silent_progressP$.getDynamicValue(var3) : module0443.T), var3);
                            module0012.f474(var30);
                            final SubLObject var39 = module0158.f10039(var29);
                            SubLObject var40 = (SubLObject)module0443.NIL;
                            final SubLObject var41 = (SubLObject)module0443.NIL;
                            while (module0443.NIL == var40) {
                                final SubLObject var42 = module0052.f3695(var39, var41);
                                final SubLObject var43 = (SubLObject)SubLObjectFactory.makeBoolean(!var41.eql(var42));
                                if (module0443.NIL != var43) {
                                    module0012.f476();
                                    SubLObject var44 = (SubLObject)module0443.NIL;
                                    try {
                                        var44 = module0158.f10316(var42, (SubLObject)module0443.$ic9$, module0130.f8518(var2), (SubLObject)module0443.NIL);
                                        SubLObject var19_176 = (SubLObject)module0443.NIL;
                                        final SubLObject var20_177 = (SubLObject)module0443.NIL;
                                        while (module0443.NIL == var19_176) {
                                            final SubLObject var45 = module0052.f3695(var44, var20_177);
                                            final SubLObject var22_178 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_177.eql(var45));
                                            if (module0443.NIL != var22_178) {
                                                final SubLObject var47;
                                                final SubLObject var46 = var47 = f30773(var1, var45);
                                                if (module0443.NIL != var47) {
                                                    var4 = (SubLObject)ConsesLow.cons(var47, var4);
                                                }
                                            }
                                            var19_176 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_178);
                                        }
                                    }
                                    finally {
                                        final SubLObject var8_187 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var3);
                                            if (module0443.NIL != var44) {
                                                module0158.f10319(var44);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var8_187, var3);
                                        }
                                    }
                                }
                                var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var43);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var38, var3);
                            module0012.$g70$.rebind(var37, var3);
                            module0012.$g69$.rebind(var36, var3);
                            module0012.$g66$.rebind(var35, var3);
                            module0012.$g68$.rebind(var34, var3);
                            module0012.$g67$.rebind(var33, var3);
                            module0012.$g65$.rebind(var32, var3);
                            module0012.$g73$.rebind(var31, var3);
                        }
                    }
                }
                else if (var12.eql((SubLObject)module0443.$ic11$)) {
                    SubLObject var58_188 = module0218.f14453(module0158.f10301(var10), (SubLObject)module0443.UNPROVIDED);
                    SubLObject var48 = (SubLObject)module0443.NIL;
                    var48 = var58_188.first();
                    while (module0443.NIL != var58_188) {
                        if (module0443.NIL == module0130.f8518(var2) || module0443.NIL != module0178.f11343(var48, module0130.f8518(var2))) {
                            final SubLObject var50;
                            final SubLObject var49 = var50 = f30773(var1, var48);
                            if (module0443.NIL != var50) {
                                var4 = (SubLObject)ConsesLow.cons(var50, var4);
                            }
                        }
                        var58_188 = var58_188.rest();
                        var48 = var58_188.first();
                    }
                }
                else {
                    module0158.f10295(var10, var11);
                }
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        if (module0443.NIL != var4) {
            return module0052.f3709(var4);
        }
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30782(final SubLObject var1) {
        if (module0443.NIL != module0435.f30612(var1, (SubLObject)module0443.$ic3$)) {
            return (SubLObject)module0443.$ic4$;
        }
        return (SubLObject)module0443.$ic5$;
    }
    
    public static SubLObject f30783(final SubLObject var1, SubLObject var2) {
        if (var2 == module0443.UNPROVIDED) {
            var2 = (SubLObject)module0443.NIL;
        }
        if (module0443.NIL != module0193.f12105(var1)) {
            return module0018.$g660$.getGlobalValue();
        }
        return Numbers.multiply((SubLObject)module0443.TWO_INTEGER, f30753(var1, (SubLObject)module0443.UNPROVIDED));
    }
    
    public static SubLObject f30784(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0443.NIL;
        final SubLObject var4 = f30755(var1);
        final SubLObject var5 = module0018.$g637$.currentBinding(var2);
        final SubLObject var6 = module0148.$g2099$.currentBinding(var2);
        try {
            module0018.$g637$.bind(var1, var2);
            module0148.$g2099$.bind((SubLObject)module0443.$ic41$, var2);
            final SubLObject var7 = module0217.f14404(var4, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
            final SubLObject var9;
            final SubLObject var8 = var9 = module0158.f10294(var7);
            if (var9.eql((SubLObject)module0443.$ic8$)) {
                var2.resetMultipleValues();
                final SubLObject var10 = module0158.f10297(var7);
                final SubLObject var11 = var2.secondMultipleValue();
                final SubLObject var12 = var2.thirdMultipleValue();
                var2.resetMultipleValues();
                if (module0443.NIL != var11) {
                    if (module0443.NIL != var12) {
                        final SubLObject var13 = var12;
                        if (module0443.NIL != module0158.f10010(var10, var11, var13)) {
                            final SubLObject var14 = module0158.f10011(var10, var11, var13);
                            SubLObject var15 = (SubLObject)module0443.NIL;
                            final SubLObject var16 = (SubLObject)module0443.NIL;
                            while (module0443.NIL == var15) {
                                final SubLObject var17 = module0052.f3695(var14, var16);
                                final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                                if (module0443.NIL != var18) {
                                    SubLObject var19 = (SubLObject)module0443.NIL;
                                    try {
                                        var19 = module0158.f10316(var17, (SubLObject)module0443.$ic9$, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
                                        SubLObject var19_189 = (SubLObject)module0443.NIL;
                                        final SubLObject var20_190 = (SubLObject)module0443.NIL;
                                        while (module0443.NIL == var19_189) {
                                            final SubLObject var20 = module0052.f3695(var19, var20_190);
                                            final SubLObject var22_191 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_190.eql(var20));
                                            if (module0443.NIL != var22_191) {
                                                final SubLObject var22;
                                                final SubLObject var21 = var22 = f30785(var20);
                                                if (module0443.NIL != var22) {
                                                    var3 = (SubLObject)ConsesLow.cons(var22, var3);
                                                }
                                            }
                                            var19_189 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_191);
                                        }
                                    }
                                    finally {
                                        final SubLObject var8_192 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var2);
                                            if (module0443.NIL != var19) {
                                                module0158.f10319(var19);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var8_192, var2);
                                        }
                                    }
                                }
                                var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var18);
                            }
                        }
                    }
                    else {
                        final SubLObject var13 = (SubLObject)module0443.NIL;
                        if (module0443.NIL != module0158.f10010(var10, var11, var13)) {
                            final SubLObject var14 = module0158.f10011(var10, var11, var13);
                            SubLObject var15 = (SubLObject)module0443.NIL;
                            final SubLObject var16 = (SubLObject)module0443.NIL;
                            while (module0443.NIL == var15) {
                                final SubLObject var17 = module0052.f3695(var14, var16);
                                final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                                if (module0443.NIL != var18) {
                                    SubLObject var19 = (SubLObject)module0443.NIL;
                                    try {
                                        var19 = module0158.f10316(var17, (SubLObject)module0443.$ic9$, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
                                        SubLObject var19_190 = (SubLObject)module0443.NIL;
                                        final SubLObject var20_191 = (SubLObject)module0443.NIL;
                                        while (module0443.NIL == var19_190) {
                                            final SubLObject var20 = module0052.f3695(var19, var20_191);
                                            final SubLObject var22_192 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_191.eql(var20));
                                            if (module0443.NIL != var22_192) {
                                                final SubLObject var22;
                                                final SubLObject var21 = var22 = f30785(var20);
                                                if (module0443.NIL != var22) {
                                                    var3 = (SubLObject)ConsesLow.cons(var22, var3);
                                                }
                                            }
                                            var19_190 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_192);
                                        }
                                    }
                                    finally {
                                        final SubLObject var8_193 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var2);
                                            if (module0443.NIL != var19) {
                                                module0158.f10319(var19);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var8_193, var2);
                                        }
                                    }
                                }
                                var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var18);
                            }
                        }
                    }
                }
                else if (module0443.NIL != var12) {
                    final SubLObject var13 = var12;
                    if (module0443.NIL != module0158.f10010(var10, (SubLObject)module0443.NIL, var13)) {
                        final SubLObject var14 = module0158.f10011(var10, (SubLObject)module0443.NIL, var13);
                        SubLObject var15 = (SubLObject)module0443.NIL;
                        final SubLObject var16 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                            if (module0443.NIL != var18) {
                                SubLObject var19 = (SubLObject)module0443.NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)module0443.$ic9$, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
                                    SubLObject var19_191 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_192 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_191) {
                                        final SubLObject var20 = module0052.f3695(var19, var20_192);
                                        final SubLObject var22_193 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_192.eql(var20));
                                        if (module0443.NIL != var22_193) {
                                            final SubLObject var22;
                                            final SubLObject var21 = var22 = f30785(var20);
                                            if (module0443.NIL != var22) {
                                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                                            }
                                        }
                                        var19_191 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_193);
                                    }
                                }
                                finally {
                                    final SubLObject var8_194 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var2);
                                        if (module0443.NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_194, var2);
                                    }
                                }
                            }
                            var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var18);
                        }
                    }
                }
                else {
                    final SubLObject var13 = (SubLObject)module0443.NIL;
                    if (module0443.NIL != module0158.f10010(var10, (SubLObject)module0443.NIL, var13)) {
                        final SubLObject var14 = module0158.f10011(var10, (SubLObject)module0443.NIL, var13);
                        SubLObject var15 = (SubLObject)module0443.NIL;
                        final SubLObject var16 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                            if (module0443.NIL != var18) {
                                SubLObject var19 = (SubLObject)module0443.NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)module0443.$ic9$, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
                                    SubLObject var19_192 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_193 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_192) {
                                        final SubLObject var20 = module0052.f3695(var19, var20_193);
                                        final SubLObject var22_194 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_193.eql(var20));
                                        if (module0443.NIL != var22_194) {
                                            final SubLObject var22;
                                            final SubLObject var21 = var22 = f30785(var20);
                                            if (module0443.NIL != var22) {
                                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                                            }
                                        }
                                        var19_192 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_194);
                                    }
                                }
                                finally {
                                    final SubLObject var8_195 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var2);
                                        if (module0443.NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_195, var2);
                                    }
                                }
                            }
                            var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var18);
                        }
                    }
                }
            }
            else if (var9.eql((SubLObject)module0443.$ic10$)) {
                final SubLObject var23 = module0158.f10299(var7);
                if (module0443.NIL != module0158.f10038(var23)) {
                    final SubLObject var24 = (SubLObject)module0443.NIL;
                    final SubLObject var8_196 = module0012.$g73$.currentBinding(var2);
                    final SubLObject var9_206 = module0012.$g65$.currentBinding(var2);
                    final SubLObject var25 = module0012.$g67$.currentBinding(var2);
                    final SubLObject var26 = module0012.$g68$.currentBinding(var2);
                    final SubLObject var27 = module0012.$g66$.currentBinding(var2);
                    final SubLObject var28 = module0012.$g69$.currentBinding(var2);
                    final SubLObject var29 = module0012.$g70$.currentBinding(var2);
                    final SubLObject var30 = module0012.$silent_progressP$.currentBinding(var2);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var2);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                        module0012.$g67$.bind((SubLObject)module0443.ONE_INTEGER, var2);
                        module0012.$g68$.bind((SubLObject)module0443.ZERO_INTEGER, var2);
                        module0012.$g66$.bind((SubLObject)module0443.ZERO_INTEGER, var2);
                        module0012.$g69$.bind((SubLObject)module0443.ZERO_INTEGER, var2);
                        module0012.$g70$.bind((SubLObject)module0443.T, var2);
                        module0012.$silent_progressP$.bind((SubLObject)((module0443.NIL != var24) ? module0012.$silent_progressP$.getDynamicValue(var2) : module0443.T), var2);
                        module0012.f474(var24);
                        final SubLObject var31 = module0158.f10039(var23);
                        SubLObject var32 = (SubLObject)module0443.NIL;
                        final SubLObject var33 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var32) {
                            final SubLObject var34 = module0052.f3695(var31, var33);
                            final SubLObject var35 = (SubLObject)SubLObjectFactory.makeBoolean(!var33.eql(var34));
                            if (module0443.NIL != var35) {
                                module0012.f476();
                                SubLObject var36 = (SubLObject)module0443.NIL;
                                try {
                                    var36 = module0158.f10316(var34, (SubLObject)module0443.$ic9$, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
                                    SubLObject var19_193 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_194 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_193) {
                                        final SubLObject var37 = module0052.f3695(var36, var20_194);
                                        final SubLObject var22_195 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_194.eql(var37));
                                        if (module0443.NIL != var22_195) {
                                            final SubLObject var39;
                                            final SubLObject var38 = var39 = f30785(var37);
                                            if (module0443.NIL != var39) {
                                                var3 = (SubLObject)ConsesLow.cons(var39, var3);
                                            }
                                        }
                                        var19_193 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_195);
                                    }
                                }
                                finally {
                                    final SubLObject var8_197 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var2);
                                        if (module0443.NIL != var36) {
                                            module0158.f10319(var36);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_197, var2);
                                    }
                                }
                            }
                            var32 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var35);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var30, var2);
                        module0012.$g70$.rebind(var29, var2);
                        module0012.$g69$.rebind(var28, var2);
                        module0012.$g66$.rebind(var27, var2);
                        module0012.$g68$.rebind(var26, var2);
                        module0012.$g67$.rebind(var25, var2);
                        module0012.$g65$.rebind(var9_206, var2);
                        module0012.$g73$.rebind(var8_196, var2);
                    }
                }
            }
            else if (var9.eql((SubLObject)module0443.$ic11$)) {
                SubLObject var40 = module0218.f14453(module0158.f10301(var7), (SubLObject)module0443.UNPROVIDED);
                SubLObject var41 = (SubLObject)module0443.NIL;
                var41 = var40.first();
                while (module0443.NIL != var40) {
                    if (module0443.NIL != module0178.f11343(var41, (SubLObject)module0443.$ic42$)) {
                        final SubLObject var43;
                        final SubLObject var42 = var43 = f30785(var41);
                        if (module0443.NIL != var43) {
                            var3 = (SubLObject)ConsesLow.cons(var43, var3);
                        }
                    }
                    var40 = var40.rest();
                    var41 = var40.first();
                }
            }
            else {
                module0158.f10295(var7, var8);
            }
        }
        finally {
            module0148.$g2099$.rebind(var6, var2);
            module0018.$g637$.rebind(var5, var2);
        }
        if (module0443.NIL != var3) {
            return module0052.f3709(var3);
        }
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30785(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (module0443.NIL != module0351.f23568(var109)) {
            final SubLObject var111 = module0178.f11285(var109);
            var110.resetMultipleValues();
            final SubLObject var112 = module0235.f15477(module0018.$g637$.getDynamicValue(var110), var111, (SubLObject)module0443.T, (SubLObject)module0443.T);
            final SubLObject var113 = var110.secondMultipleValue();
            final SubLObject var114 = var110.thirdMultipleValue();
            var110.resetMultipleValues();
            if (module0443.NIL != var112) {
                return (SubLObject)ConsesLow.list(var112, var109);
            }
        }
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30786(final SubLObject var1, final SubLObject var109) {
        final SubLObject var110 = module0205.f13333(var109);
        final SubLObject var111 = module0205.f13333(var1);
        final SubLObject var112 = module0351.f23575(module0443.$ic45$, (SubLObject)ConsesLow.list(var111, var110));
        final SubLObject var113 = module0191.f11990((SubLObject)module0443.$ic46$, var112, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED);
        return (SubLObject)ConsesLow.list(var109, var113);
    }
    
    public static SubLObject f30787(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0443.NIL;
        final SubLObject var4 = f30755(module0439.f30674(var1));
        final SubLObject var5 = module0018.$g637$.currentBinding(var2);
        final SubLObject var6 = module0148.$g2099$.currentBinding(var2);
        try {
            module0018.$g637$.bind(var1, var2);
            module0148.$g2099$.bind((SubLObject)module0443.$ic47$, var2);
            final SubLObject var7 = module0217.f14404(var4, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
            final SubLObject var9;
            final SubLObject var8 = var9 = module0158.f10294(var7);
            if (var9.eql((SubLObject)module0443.$ic8$)) {
                var2.resetMultipleValues();
                final SubLObject var10 = module0158.f10297(var7);
                final SubLObject var11 = var2.secondMultipleValue();
                final SubLObject var12 = var2.thirdMultipleValue();
                var2.resetMultipleValues();
                if (module0443.NIL != var11) {
                    if (module0443.NIL != var12) {
                        final SubLObject var13 = var12;
                        if (module0443.NIL != module0158.f10010(var10, var11, var13)) {
                            final SubLObject var14 = module0158.f10011(var10, var11, var13);
                            SubLObject var15 = (SubLObject)module0443.NIL;
                            final SubLObject var16 = (SubLObject)module0443.NIL;
                            while (module0443.NIL == var15) {
                                final SubLObject var17 = module0052.f3695(var14, var16);
                                final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                                if (module0443.NIL != var18) {
                                    SubLObject var19 = (SubLObject)module0443.NIL;
                                    try {
                                        var19 = module0158.f10316(var17, (SubLObject)module0443.$ic9$, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
                                        SubLObject var19_212 = (SubLObject)module0443.NIL;
                                        final SubLObject var20_213 = (SubLObject)module0443.NIL;
                                        while (module0443.NIL == var19_212) {
                                            final SubLObject var20 = module0052.f3695(var19, var20_213);
                                            final SubLObject var22_214 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_213.eql(var20));
                                            if (module0443.NIL != var22_214) {
                                                final SubLObject var22;
                                                final SubLObject var21 = var22 = f30788(var20);
                                                if (module0443.NIL != var22) {
                                                    var3 = (SubLObject)ConsesLow.cons(var22, var3);
                                                }
                                            }
                                            var19_212 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_214);
                                        }
                                    }
                                    finally {
                                        final SubLObject var8_215 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var2);
                                            if (module0443.NIL != var19) {
                                                module0158.f10319(var19);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var8_215, var2);
                                        }
                                    }
                                }
                                var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var18);
                            }
                        }
                    }
                    else {
                        final SubLObject var13 = (SubLObject)module0443.NIL;
                        if (module0443.NIL != module0158.f10010(var10, var11, var13)) {
                            final SubLObject var14 = module0158.f10011(var10, var11, var13);
                            SubLObject var15 = (SubLObject)module0443.NIL;
                            final SubLObject var16 = (SubLObject)module0443.NIL;
                            while (module0443.NIL == var15) {
                                final SubLObject var17 = module0052.f3695(var14, var16);
                                final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                                if (module0443.NIL != var18) {
                                    SubLObject var19 = (SubLObject)module0443.NIL;
                                    try {
                                        var19 = module0158.f10316(var17, (SubLObject)module0443.$ic9$, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
                                        SubLObject var19_213 = (SubLObject)module0443.NIL;
                                        final SubLObject var20_214 = (SubLObject)module0443.NIL;
                                        while (module0443.NIL == var19_213) {
                                            final SubLObject var20 = module0052.f3695(var19, var20_214);
                                            final SubLObject var22_215 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_214.eql(var20));
                                            if (module0443.NIL != var22_215) {
                                                final SubLObject var22;
                                                final SubLObject var21 = var22 = f30788(var20);
                                                if (module0443.NIL != var22) {
                                                    var3 = (SubLObject)ConsesLow.cons(var22, var3);
                                                }
                                            }
                                            var19_213 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_215);
                                        }
                                    }
                                    finally {
                                        final SubLObject var8_216 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var2);
                                            if (module0443.NIL != var19) {
                                                module0158.f10319(var19);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var8_216, var2);
                                        }
                                    }
                                }
                                var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var18);
                            }
                        }
                    }
                }
                else if (module0443.NIL != var12) {
                    final SubLObject var13 = var12;
                    if (module0443.NIL != module0158.f10010(var10, (SubLObject)module0443.NIL, var13)) {
                        final SubLObject var14 = module0158.f10011(var10, (SubLObject)module0443.NIL, var13);
                        SubLObject var15 = (SubLObject)module0443.NIL;
                        final SubLObject var16 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                            if (module0443.NIL != var18) {
                                SubLObject var19 = (SubLObject)module0443.NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)module0443.$ic9$, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
                                    SubLObject var19_214 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_215 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_214) {
                                        final SubLObject var20 = module0052.f3695(var19, var20_215);
                                        final SubLObject var22_216 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_215.eql(var20));
                                        if (module0443.NIL != var22_216) {
                                            final SubLObject var22;
                                            final SubLObject var21 = var22 = f30788(var20);
                                            if (module0443.NIL != var22) {
                                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                                            }
                                        }
                                        var19_214 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_216);
                                    }
                                }
                                finally {
                                    final SubLObject var8_217 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var2);
                                        if (module0443.NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_217, var2);
                                    }
                                }
                            }
                            var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var18);
                        }
                    }
                }
                else {
                    final SubLObject var13 = (SubLObject)module0443.NIL;
                    if (module0443.NIL != module0158.f10010(var10, (SubLObject)module0443.NIL, var13)) {
                        final SubLObject var14 = module0158.f10011(var10, (SubLObject)module0443.NIL, var13);
                        SubLObject var15 = (SubLObject)module0443.NIL;
                        final SubLObject var16 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var15) {
                            final SubLObject var17 = module0052.f3695(var14, var16);
                            final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                            if (module0443.NIL != var18) {
                                SubLObject var19 = (SubLObject)module0443.NIL;
                                try {
                                    var19 = module0158.f10316(var17, (SubLObject)module0443.$ic9$, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
                                    SubLObject var19_215 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_216 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_215) {
                                        final SubLObject var20 = module0052.f3695(var19, var20_216);
                                        final SubLObject var22_217 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_216.eql(var20));
                                        if (module0443.NIL != var22_217) {
                                            final SubLObject var22;
                                            final SubLObject var21 = var22 = f30788(var20);
                                            if (module0443.NIL != var22) {
                                                var3 = (SubLObject)ConsesLow.cons(var22, var3);
                                            }
                                        }
                                        var19_215 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_217);
                                    }
                                }
                                finally {
                                    final SubLObject var8_218 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var2);
                                        if (module0443.NIL != var19) {
                                            module0158.f10319(var19);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_218, var2);
                                    }
                                }
                            }
                            var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var18);
                        }
                    }
                }
            }
            else if (var9.eql((SubLObject)module0443.$ic10$)) {
                final SubLObject var23 = module0158.f10299(var7);
                if (module0443.NIL != module0158.f10038(var23)) {
                    final SubLObject var24 = (SubLObject)module0443.NIL;
                    final SubLObject var8_219 = module0012.$g73$.currentBinding(var2);
                    final SubLObject var9_229 = module0012.$g65$.currentBinding(var2);
                    final SubLObject var25 = module0012.$g67$.currentBinding(var2);
                    final SubLObject var26 = module0012.$g68$.currentBinding(var2);
                    final SubLObject var27 = module0012.$g66$.currentBinding(var2);
                    final SubLObject var28 = module0012.$g69$.currentBinding(var2);
                    final SubLObject var29 = module0012.$g70$.currentBinding(var2);
                    final SubLObject var30 = module0012.$silent_progressP$.currentBinding(var2);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var2);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                        module0012.$g67$.bind((SubLObject)module0443.ONE_INTEGER, var2);
                        module0012.$g68$.bind((SubLObject)module0443.ZERO_INTEGER, var2);
                        module0012.$g66$.bind((SubLObject)module0443.ZERO_INTEGER, var2);
                        module0012.$g69$.bind((SubLObject)module0443.ZERO_INTEGER, var2);
                        module0012.$g70$.bind((SubLObject)module0443.T, var2);
                        module0012.$silent_progressP$.bind((SubLObject)((module0443.NIL != var24) ? module0012.$silent_progressP$.getDynamicValue(var2) : module0443.T), var2);
                        module0012.f474(var24);
                        final SubLObject var31 = module0158.f10039(var23);
                        SubLObject var32 = (SubLObject)module0443.NIL;
                        final SubLObject var33 = (SubLObject)module0443.NIL;
                        while (module0443.NIL == var32) {
                            final SubLObject var34 = module0052.f3695(var31, var33);
                            final SubLObject var35 = (SubLObject)SubLObjectFactory.makeBoolean(!var33.eql(var34));
                            if (module0443.NIL != var35) {
                                module0012.f476();
                                SubLObject var36 = (SubLObject)module0443.NIL;
                                try {
                                    var36 = module0158.f10316(var34, (SubLObject)module0443.$ic9$, (SubLObject)module0443.$ic42$, (SubLObject)module0443.NIL);
                                    SubLObject var19_216 = (SubLObject)module0443.NIL;
                                    final SubLObject var20_217 = (SubLObject)module0443.NIL;
                                    while (module0443.NIL == var19_216) {
                                        final SubLObject var37 = module0052.f3695(var36, var20_217);
                                        final SubLObject var22_218 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_217.eql(var37));
                                        if (module0443.NIL != var22_218) {
                                            final SubLObject var39;
                                            final SubLObject var38 = var39 = f30788(var37);
                                            if (module0443.NIL != var39) {
                                                var3 = (SubLObject)ConsesLow.cons(var39, var3);
                                            }
                                        }
                                        var19_216 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var22_218);
                                    }
                                }
                                finally {
                                    final SubLObject var8_220 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0443.T, var2);
                                        if (module0443.NIL != var36) {
                                            module0158.f10319(var36);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var8_220, var2);
                                    }
                                }
                            }
                            var32 = (SubLObject)SubLObjectFactory.makeBoolean(module0443.NIL == var35);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var30, var2);
                        module0012.$g70$.rebind(var29, var2);
                        module0012.$g69$.rebind(var28, var2);
                        module0012.$g66$.rebind(var27, var2);
                        module0012.$g68$.rebind(var26, var2);
                        module0012.$g67$.rebind(var25, var2);
                        module0012.$g65$.rebind(var9_229, var2);
                        module0012.$g73$.rebind(var8_219, var2);
                    }
                }
            }
            else if (var9.eql((SubLObject)module0443.$ic11$)) {
                SubLObject var40 = module0218.f14453(module0158.f10301(var7), (SubLObject)module0443.UNPROVIDED);
                SubLObject var41 = (SubLObject)module0443.NIL;
                var41 = var40.first();
                while (module0443.NIL != var40) {
                    if (module0443.NIL != module0178.f11343(var41, (SubLObject)module0443.$ic42$)) {
                        final SubLObject var43;
                        final SubLObject var42 = var43 = f30788(var41);
                        if (module0443.NIL != var43) {
                            var3 = (SubLObject)ConsesLow.cons(var43, var3);
                        }
                    }
                    var40 = var40.rest();
                    var41 = var40.first();
                }
            }
            else {
                module0158.f10295(var7, var8);
            }
        }
        finally {
            module0148.$g2099$.rebind(var6, var2);
            module0018.$g637$.rebind(var5, var2);
        }
        if (module0443.NIL != var3) {
            return module0052.f3709(var3);
        }
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30788(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        if (module0443.NIL != module0351.f23568(var109)) {
            final SubLObject var111 = module0178.f11285(var109);
            var110.resetMultipleValues();
            final SubLObject var112 = module0235.f15478(module0018.$g637$.getDynamicValue(var110), var111, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED);
            final SubLObject var113 = var110.secondMultipleValue();
            final SubLObject var114 = var110.thirdMultipleValue();
            var110.resetMultipleValues();
            if (module0443.NIL != var112) {
                return (SubLObject)ConsesLow.list(var112, var109);
            }
        }
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30789(final SubLObject var1, final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        final SubLObject var111 = module0205.f13333(var109);
        final SubLObject var112 = module0205.f13333(var1);
        final SubLObject var113 = module0351.f23575(module0443.$ic50$, (SubLObject)ConsesLow.list(var112, var111));
        final SubLObject var114 = module0191.f11990((SubLObject)module0443.$ic46$, var113, (SubLObject)module0443.UNPROVIDED, (SubLObject)module0443.UNPROVIDED);
        var110.resetMultipleValues();
        final SubLObject var115 = module0235.f15478(var1, module0178.f11285(var109), (SubLObject)module0443.T, (SubLObject)module0443.T);
        final SubLObject var116 = var110.secondMultipleValue();
        final SubLObject var117 = var110.thirdMultipleValue();
        var110.resetMultipleValues();
        return ConsesLow.append((SubLObject)ConsesLow.list(var109, var114), var117);
    }
    
    public static SubLObject f30790() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30748", "S#33989", 1, 1, false);
        new $f30748$UnaryFunction();
        new $f30748$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30750", "S#33990", 1, 0, false);
        new $f30750$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30752", "S#33994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30753", "S#33995", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30754", "S#33996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30751", "S#33997", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30755", "S#23550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30757", "S#33998", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30749", "S#33999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30758", "S#34000", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30756", "S#34001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30759", "S#34002", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30760", "S#33991", 1, 1, false);
        new $f30760$UnaryFunction();
        new $f30760$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30761", "S#34003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30763", "S#34004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30764", "S#34005", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30765", "S#34006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30762", "S#34007", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30766", "S#33992", 1, 1, false);
        new $f30766$UnaryFunction();
        new $f30766$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30768", "S#33993", 1, 0, false);
        new $f30768$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30770", "S#34008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30771", "S#34009", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30772", "S#34010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30769", "S#34011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30774", "S#34012", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30767", "S#34013", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30773", "S#34014", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30775", "S#34015", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30776", "S#34016", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30777", "S#34017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30779", "S#34018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30780", "S#34019", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30781", "S#34020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30778", "S#34021", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30782", "S#34022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30783", "S#34023", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30784", "S#34024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30785", "S#34025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30786", "S#34026", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30787", "S#34027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30788", "S#34028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0443", "f30789", "S#34029", 2, 0, false);
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30791() {
        module0443.$g3549$ = SubLFiles.deflexical("S#34030", (module0443.NIL != Symbols.boundp((SubLObject)module0443.$ic12$)) ? module0443.$g3549$.getGlobalValue() : module0193.f12075((SubLObject)module0443.ZERO_INTEGER));
        return (SubLObject)module0443.NIL;
    }
    
    public static SubLObject f30792() {
        module0340.f22941((SubLObject)module0443.$ic1$, (SubLObject)module0443.$ic2$);
        module0340.f22941((SubLObject)module0443.$ic6$, (SubLObject)module0443.$ic7$);
        module0003.f57((SubLObject)module0443.$ic12$);
        module0340.f22941((SubLObject)module0443.$ic29$, (SubLObject)module0443.$ic30$);
        module0340.f22941((SubLObject)module0443.$ic31$, (SubLObject)module0443.$ic32$);
        module0340.f22941((SubLObject)module0443.$ic33$, (SubLObject)module0443.$ic34$);
        module0340.f22941((SubLObject)module0443.$ic35$, (SubLObject)module0443.$ic36$);
        module0340.f22941((SubLObject)module0443.$ic37$, (SubLObject)module0443.$ic38$);
        module0340.f22941((SubLObject)module0443.$ic39$, (SubLObject)module0443.$ic40$);
        module0340.f22941((SubLObject)module0443.$ic43$, (SubLObject)module0443.$ic44$);
        module0340.f22941((SubLObject)module0443.$ic48$, (SubLObject)module0443.$ic49$);
        return (SubLObject)module0443.NIL;
    }
    
    public void declareFunctions() {
        f30790();
    }
    
    public void initializeVariables() {
        f30791();
    }
    
    public void runTopLevelForms() {
        f30792();
    }
    
    static {
        me = (SubLFile)new module0443();
        module0443.$g3549$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("POS");
        $ic1$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLPREDS-LOOKUP-POS");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0443.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33893", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33989", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33990", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34002", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("POS")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> ... <indexed-term> ... )\nusing true assertions using spec-preds of <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$geopoliticalSubdivision #$France #$CityOfParisFrance)") });
        $ic3$ = SubLObjectFactory.makeKeyword("NEG");
        $ic4$ = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $ic5$ = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLPREDS-LOOKUP-NEG");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0443.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33893", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26081", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33995", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33994", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33996", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34002", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("NEG")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> ... <indexed-term> ... ))\nusing false assertions using genl-preds of <predicate>") });
        $ic8$ = SubLObjectFactory.makeKeyword("GAF-ARG");
        $ic9$ = SubLObjectFactory.makeKeyword("GAF");
        $ic10$ = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $ic11$ = SubLObjectFactory.makeKeyword("OVERLAP");
        $ic12$ = SubLObjectFactory.makeSymbol("S#34030", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-EXTENT"), (SubLObject)SubLObjectFactory.makeKeyword("GAF-ARG"));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic15$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic16$ = SubLObjectFactory.makeKeyword("STACK");
        $ic17$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic18$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic19$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic20$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic21$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic22$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic23$ = SubLObjectFactory.makeString("continue anyway");
        $ic24$ = SubLObjectFactory.makeKeyword("WARN");
        $ic25$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic26$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic27$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic28$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic29$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-POS");
        $ic30$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0443.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33893", "CYC"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33991", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34003", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34002", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("POS")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <non-indexed-term> ... <non-indexed-term>)\nusing true assertions using spec-preds of <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$spatiallyIntersects ?WHAT ?WHAT-ELSE)") });
        $ic31$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-NEG");
        $ic32$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0443.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33893", "CYC"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26081", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34005", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34004", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34006", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34002", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("NEG")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <non-indexed-term> ... <non-indexed-term> ))\nusing false assertions using genl-preds of <predicate>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$spatiallyIntersects ?WHAT ?WHAT-ELSE))") });
        $ic33$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-POS");
        $ic34$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0443.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33893", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33992", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33993", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34015", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("POS")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <indexed-term> <whatever>) and \n(<predicate> <whatever> <indexed-term>) \nusing true assertions using spec-inverses of <predicate>") });
        $ic35$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-NEG");
        $ic36$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0443.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33893", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26081", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34009", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34008", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34010", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34015", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("NEG")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <indexed-term> <whatever>)) and \n(#$not (<predicate> <whatever> <indexed-term>))\nusing false assertions using genl-inverses of <predicate>") });
        $ic37$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-POS");
        $ic38$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0443.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33893", "CYC"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34016", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34017", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34015", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("POS")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <non-indexed-term> <non-indexed-term> )\nusing true assertions using spec-inverses of <predicate>") });
        $ic39$ = SubLObjectFactory.makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-NEG");
        $ic40$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0443.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33893", "CYC"))), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26081", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34019", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34018", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34020", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34015", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("NEG")), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> <non-indexed-term> <non-indexed-term> ))\nusing false assertions using genl-inverses of <predicate>") });
        $ic41$ = SubLObjectFactory.makeSymbol("S#12375", "CYC");
        $ic42$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic43$ = SubLObjectFactory.makeKeyword("REMOVAL-NEGATIONPREDS-LOOKUP");
        $ic44$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0443.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33893", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26101", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34023", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34022", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34024", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34026", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> ... <indexed-term> ... ))\nusing true assertions using negation-preds of <predicate>") });
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $ic46$ = SubLObjectFactory.makeKeyword("NEGATIONPREDS");
        $ic47$ = SubLObjectFactory.makeSymbol("S#12376", "CYC");
        $ic48$ = SubLObjectFactory.makeKeyword("REMOVAL-NEGATIONINVERSE-LOOKUP");
        $ic49$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0443.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33893", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26101", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#34023", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34022", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34027", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#18075", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#34029", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> ... <indexed-term> ... ))\n    using true assertions using negation-inverses of <predicate>") });
        $ic50$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse"));
    }
    
    public static final class $f30748$UnaryFunction extends UnaryFunction
    {
        public $f30748$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33989"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0443.f30748(var3, (SubLObject)$f30748$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30748$BinaryFunction extends BinaryFunction
    {
        public $f30748$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33989"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var4) {
            return module0443.f30748(var3, var4);
        }
    }
    
    public static final class $f30750$UnaryFunction extends UnaryFunction
    {
        public $f30750$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33990"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0443.f30750(var3);
        }
    }
    
    public static final class $f30760$UnaryFunction extends UnaryFunction
    {
        public $f30760$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33991"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0443.f30760(var3, (SubLObject)$f30760$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30760$BinaryFunction extends BinaryFunction
    {
        public $f30760$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33991"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var4) {
            return module0443.f30760(var3, var4);
        }
    }
    
    public static final class $f30766$UnaryFunction extends UnaryFunction
    {
        public $f30766$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33992"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0443.f30766(var3, (SubLObject)$f30766$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30766$BinaryFunction extends BinaryFunction
    {
        public $f30766$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33992"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var4) {
            return module0443.f30766(var3, var4);
        }
    }
    
    public static final class $f30768$UnaryFunction extends UnaryFunction
    {
        public $f30768$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33993"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0443.f30768(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0443.class
	Total time: 2316 ms
	
	Decompiled with Procyon 0.5.32.
*/