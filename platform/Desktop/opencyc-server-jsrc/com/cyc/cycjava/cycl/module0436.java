package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0436 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0436";
    public static final String myFingerPrint = "8ca30b50e18f52a9cb5b5072f216e0cdfac202d1bca86bcbcbebfc21773b1c4b";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    
    public static SubLObject f30636(final SubLObject var1, SubLObject var2) {
        if (var2 == module0436.UNPROVIDED) {
            var2 = (SubLObject)module0436.NIL;
        }
        if (module0436.NIL != module0193.f12105(var1)) {
            return module0018.$g659$.getGlobalValue();
        }
        return module0349.f23451(var1, (SubLObject)module0436.$ic0$);
    }
    
    public static SubLObject f30637(final SubLObject var1) {
        return module0350.f23547(var1, module0147.f9551());
    }
    
    public static SubLObject f30638(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0436.NIL;
        final SubLObject var4 = module0349.f23449(var1, (SubLObject)module0436.$ic0$);
        final SubLObject var6;
        final SubLObject var5 = var6 = module0158.f10294(var4);
        if (var6.eql((SubLObject)module0436.$ic1$)) {
            var2.resetMultipleValues();
            final SubLObject var7 = module0158.f10297(var4);
            final SubLObject var8 = var2.secondMultipleValue();
            final SubLObject var9 = var2.thirdMultipleValue();
            var2.resetMultipleValues();
            if (module0436.NIL != var8) {
                if (module0436.NIL != var9) {
                    final SubLObject var10 = var9;
                    if (module0436.NIL != module0158.f10010(var7, var8, var10)) {
                        final SubLObject var11 = module0158.f10011(var7, var8, var10);
                        SubLObject var12 = (SubLObject)module0436.NIL;
                        final SubLObject var13 = (SubLObject)module0436.NIL;
                        while (module0436.NIL == var12) {
                            final SubLObject var14 = module0052.f3695(var11, var13);
                            final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                            if (module0436.NIL != var15) {
                                SubLObject var16 = (SubLObject)module0436.NIL;
                                try {
                                    var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic0$), (SubLObject)module0436.NIL);
                                    SubLObject var15_20 = (SubLObject)module0436.NIL;
                                    final SubLObject var16_21 = (SubLObject)module0436.NIL;
                                    while (module0436.NIL == var15_20) {
                                        final SubLObject var17 = module0052.f3695(var16, var16_21);
                                        final SubLObject var18_23 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_21.eql(var17));
                                        if (module0436.NIL != var18_23 && module0436.NIL != module0351.f23568(var17) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var17), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                        }
                                        var15_20 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_23);
                                    }
                                }
                                finally {
                                    final SubLObject var18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                        if (module0436.NIL != var16) {
                                            module0158.f10319(var16);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18, var2);
                                    }
                                }
                            }
                            var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                        }
                    }
                }
                else {
                    final SubLObject var10 = (SubLObject)module0436.NIL;
                    if (module0436.NIL != module0158.f10010(var7, var8, var10)) {
                        final SubLObject var11 = module0158.f10011(var7, var8, var10);
                        SubLObject var12 = (SubLObject)module0436.NIL;
                        final SubLObject var13 = (SubLObject)module0436.NIL;
                        while (module0436.NIL == var12) {
                            final SubLObject var14 = module0052.f3695(var11, var13);
                            final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                            if (module0436.NIL != var15) {
                                SubLObject var16 = (SubLObject)module0436.NIL;
                                try {
                                    var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic0$), (SubLObject)module0436.NIL);
                                    SubLObject var15_21 = (SubLObject)module0436.NIL;
                                    final SubLObject var16_22 = (SubLObject)module0436.NIL;
                                    while (module0436.NIL == var15_21) {
                                        final SubLObject var17 = module0052.f3695(var16, var16_22);
                                        final SubLObject var18_24 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_22.eql(var17));
                                        if (module0436.NIL != var18_24 && module0436.NIL != module0351.f23568(var17) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var17), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                        }
                                        var15_21 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_24);
                                    }
                                }
                                finally {
                                    final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                        if (module0436.NIL != var16) {
                                            module0158.f10319(var16);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var19, var2);
                                    }
                                }
                            }
                            var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                        }
                    }
                }
            }
            else if (module0436.NIL != var9) {
                final SubLObject var10 = var9;
                if (module0436.NIL != module0158.f10010(var7, (SubLObject)module0436.NIL, var10)) {
                    final SubLObject var11 = module0158.f10011(var7, (SubLObject)module0436.NIL, var10);
                    SubLObject var12 = (SubLObject)module0436.NIL;
                    final SubLObject var13 = (SubLObject)module0436.NIL;
                    while (module0436.NIL == var12) {
                        final SubLObject var14 = module0052.f3695(var11, var13);
                        final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                        if (module0436.NIL != var15) {
                            SubLObject var16 = (SubLObject)module0436.NIL;
                            try {
                                var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic0$), (SubLObject)module0436.NIL);
                                SubLObject var15_22 = (SubLObject)module0436.NIL;
                                final SubLObject var16_23 = (SubLObject)module0436.NIL;
                                while (module0436.NIL == var15_22) {
                                    final SubLObject var17 = module0052.f3695(var16, var16_23);
                                    final SubLObject var18_25 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_23.eql(var17));
                                    if (module0436.NIL != var18_25 && module0436.NIL != module0351.f23568(var17) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var17), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                    }
                                    var15_22 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_25);
                                }
                            }
                            finally {
                                final SubLObject var20 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                    if (module0436.NIL != var16) {
                                        module0158.f10319(var16);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var20, var2);
                                }
                            }
                        }
                        var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                    }
                }
            }
            else {
                final SubLObject var10 = (SubLObject)module0436.NIL;
                if (module0436.NIL != module0158.f10010(var7, (SubLObject)module0436.NIL, var10)) {
                    final SubLObject var11 = module0158.f10011(var7, (SubLObject)module0436.NIL, var10);
                    SubLObject var12 = (SubLObject)module0436.NIL;
                    final SubLObject var13 = (SubLObject)module0436.NIL;
                    while (module0436.NIL == var12) {
                        final SubLObject var14 = module0052.f3695(var11, var13);
                        final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                        if (module0436.NIL != var15) {
                            SubLObject var16 = (SubLObject)module0436.NIL;
                            try {
                                var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic0$), (SubLObject)module0436.NIL);
                                SubLObject var15_23 = (SubLObject)module0436.NIL;
                                final SubLObject var16_24 = (SubLObject)module0436.NIL;
                                while (module0436.NIL == var15_23) {
                                    final SubLObject var17 = module0052.f3695(var16, var16_24);
                                    final SubLObject var18_26 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_24.eql(var17));
                                    if (module0436.NIL != var18_26 && module0436.NIL != module0351.f23568(var17) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var17), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                    }
                                    var15_23 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_26);
                                }
                            }
                            finally {
                                final SubLObject var21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                    if (module0436.NIL != var16) {
                                        module0158.f10319(var16);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var21, var2);
                                }
                            }
                        }
                        var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                    }
                }
            }
        }
        else if (var6.eql((SubLObject)module0436.$ic3$)) {
            final SubLObject var22 = module0158.f10299(var4);
            if (module0436.NIL != module0158.f10038(var22)) {
                final SubLObject var23 = (SubLObject)module0436.NIL;
                final SubLObject var24 = module0012.$g73$.currentBinding(var2);
                final SubLObject var25 = module0012.$g65$.currentBinding(var2);
                final SubLObject var26 = module0012.$g67$.currentBinding(var2);
                final SubLObject var27 = module0012.$g68$.currentBinding(var2);
                final SubLObject var28 = module0012.$g66$.currentBinding(var2);
                final SubLObject var29 = module0012.$g69$.currentBinding(var2);
                final SubLObject var30 = module0012.$g70$.currentBinding(var2);
                final SubLObject var31 = module0012.$silent_progressP$.currentBinding(var2);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var2);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                    module0012.$g67$.bind((SubLObject)module0436.ONE_INTEGER, var2);
                    module0012.$g68$.bind((SubLObject)module0436.ZERO_INTEGER, var2);
                    module0012.$g66$.bind((SubLObject)module0436.ZERO_INTEGER, var2);
                    module0012.$g69$.bind((SubLObject)module0436.ZERO_INTEGER, var2);
                    module0012.$g70$.bind((SubLObject)module0436.T, var2);
                    module0012.$silent_progressP$.bind((SubLObject)((module0436.NIL != var23) ? module0012.$silent_progressP$.getDynamicValue(var2) : module0436.T), var2);
                    module0012.f474(var23);
                    final SubLObject var32 = module0158.f10039(var22);
                    SubLObject var33 = (SubLObject)module0436.NIL;
                    final SubLObject var34 = (SubLObject)module0436.NIL;
                    while (module0436.NIL == var33) {
                        final SubLObject var35 = module0052.f3695(var32, var34);
                        final SubLObject var36 = (SubLObject)SubLObjectFactory.makeBoolean(!var34.eql(var35));
                        if (module0436.NIL != var36) {
                            module0012.f476();
                            SubLObject var37 = (SubLObject)module0436.NIL;
                            try {
                                var37 = module0158.f10316(var35, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic0$), (SubLObject)module0436.NIL);
                                SubLObject var15_24 = (SubLObject)module0436.NIL;
                                final SubLObject var16_25 = (SubLObject)module0436.NIL;
                                while (module0436.NIL == var15_24) {
                                    final SubLObject var38 = module0052.f3695(var37, var16_25);
                                    final SubLObject var18_27 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_25.eql(var38));
                                    if (module0436.NIL != var18_27 && module0436.NIL != module0351.f23568(var38) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var38), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var38, var3);
                                    }
                                    var15_24 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_27);
                                }
                            }
                            finally {
                                final SubLObject var24_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                    if (module0436.NIL != var37) {
                                        module0158.f10319(var37);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var24_47, var2);
                                }
                            }
                        }
                        var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var36);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var31, var2);
                    module0012.$g70$.rebind(var30, var2);
                    module0012.$g69$.rebind(var29, var2);
                    module0012.$g66$.rebind(var28, var2);
                    module0012.$g68$.rebind(var27, var2);
                    module0012.$g67$.rebind(var26, var2);
                    module0012.$g65$.rebind(var25, var2);
                    module0012.$g73$.rebind(var24, var2);
                }
            }
        }
        else if (var6.eql((SubLObject)module0436.$ic4$)) {
            SubLObject var39 = module0218.f14453(module0158.f10301(var4), (SubLObject)module0436.UNPROVIDED);
            SubLObject var40 = (SubLObject)module0436.NIL;
            var40 = var39.first();
            while (module0436.NIL != var39) {
                if ((module0436.NIL == module0130.f8518((SubLObject)module0436.$ic0$) || module0436.NIL != module0178.f11343(var40, module0130.f8518((SubLObject)module0436.$ic0$))) && module0436.NIL != module0351.f23568(var40) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var40), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                    var3 = (SubLObject)ConsesLow.cons(var40, var3);
                }
                var39 = var39.rest();
                var40 = var39.first();
            }
        }
        else {
            module0158.f10295(var4, var5);
        }
        if (module0436.NIL != var3) {
            return module0052.f3709(var3);
        }
        return (SubLObject)module0436.NIL;
    }
    
    public static SubLObject f30639(final SubLObject var1) {
        if (module0436.NIL != module0435.f30612(var1, (SubLObject)module0436.$ic7$)) {
            return (SubLObject)module0436.$ic8$;
        }
        return (SubLObject)module0436.$ic9$;
    }
    
    public static SubLObject f30640(final SubLObject var1, SubLObject var2) {
        if (var2 == module0436.UNPROVIDED) {
            var2 = (SubLObject)module0436.NIL;
        }
        return module0349.f23451(var1, (SubLObject)module0436.$ic7$);
    }
    
    public static SubLObject f30641(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0436.NIL;
        final SubLObject var4 = module0349.f23449(var1, (SubLObject)module0436.$ic7$);
        final SubLObject var6;
        final SubLObject var5 = var6 = module0158.f10294(var4);
        if (var6.eql((SubLObject)module0436.$ic1$)) {
            var2.resetMultipleValues();
            final SubLObject var7 = module0158.f10297(var4);
            final SubLObject var8 = var2.secondMultipleValue();
            final SubLObject var9 = var2.thirdMultipleValue();
            var2.resetMultipleValues();
            if (module0436.NIL != var8) {
                if (module0436.NIL != var9) {
                    final SubLObject var10 = var9;
                    if (module0436.NIL != module0158.f10010(var7, var8, var10)) {
                        final SubLObject var11 = module0158.f10011(var7, var8, var10);
                        SubLObject var12 = (SubLObject)module0436.NIL;
                        final SubLObject var13 = (SubLObject)module0436.NIL;
                        while (module0436.NIL == var12) {
                            final SubLObject var14 = module0052.f3695(var11, var13);
                            final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                            if (module0436.NIL != var15) {
                                SubLObject var16 = (SubLObject)module0436.NIL;
                                try {
                                    var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic7$), (SubLObject)module0436.NIL);
                                    SubLObject var15_49 = (SubLObject)module0436.NIL;
                                    final SubLObject var16_50 = (SubLObject)module0436.NIL;
                                    while (module0436.NIL == var15_49) {
                                        final SubLObject var17 = module0052.f3695(var16, var16_50);
                                        final SubLObject var18_51 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_50.eql(var17));
                                        if (module0436.NIL != var18_51 && module0436.NIL != module0351.f23568(var17)) {
                                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                        }
                                        var15_49 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_51);
                                    }
                                }
                                finally {
                                    final SubLObject var18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                        if (module0436.NIL != var16) {
                                            module0158.f10319(var16);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18, var2);
                                    }
                                }
                            }
                            var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                        }
                    }
                }
                else {
                    final SubLObject var10 = (SubLObject)module0436.NIL;
                    if (module0436.NIL != module0158.f10010(var7, var8, var10)) {
                        final SubLObject var11 = module0158.f10011(var7, var8, var10);
                        SubLObject var12 = (SubLObject)module0436.NIL;
                        final SubLObject var13 = (SubLObject)module0436.NIL;
                        while (module0436.NIL == var12) {
                            final SubLObject var14 = module0052.f3695(var11, var13);
                            final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                            if (module0436.NIL != var15) {
                                SubLObject var16 = (SubLObject)module0436.NIL;
                                try {
                                    var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic7$), (SubLObject)module0436.NIL);
                                    SubLObject var15_50 = (SubLObject)module0436.NIL;
                                    final SubLObject var16_51 = (SubLObject)module0436.NIL;
                                    while (module0436.NIL == var15_50) {
                                        final SubLObject var17 = module0052.f3695(var16, var16_51);
                                        final SubLObject var18_52 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_51.eql(var17));
                                        if (module0436.NIL != var18_52 && module0436.NIL != module0351.f23568(var17)) {
                                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                        }
                                        var15_50 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_52);
                                    }
                                }
                                finally {
                                    final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                        if (module0436.NIL != var16) {
                                            module0158.f10319(var16);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var19, var2);
                                    }
                                }
                            }
                            var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                        }
                    }
                }
            }
            else if (module0436.NIL != var9) {
                final SubLObject var10 = var9;
                if (module0436.NIL != module0158.f10010(var7, (SubLObject)module0436.NIL, var10)) {
                    final SubLObject var11 = module0158.f10011(var7, (SubLObject)module0436.NIL, var10);
                    SubLObject var12 = (SubLObject)module0436.NIL;
                    final SubLObject var13 = (SubLObject)module0436.NIL;
                    while (module0436.NIL == var12) {
                        final SubLObject var14 = module0052.f3695(var11, var13);
                        final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                        if (module0436.NIL != var15) {
                            SubLObject var16 = (SubLObject)module0436.NIL;
                            try {
                                var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic7$), (SubLObject)module0436.NIL);
                                SubLObject var15_51 = (SubLObject)module0436.NIL;
                                final SubLObject var16_52 = (SubLObject)module0436.NIL;
                                while (module0436.NIL == var15_51) {
                                    final SubLObject var17 = module0052.f3695(var16, var16_52);
                                    final SubLObject var18_53 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_52.eql(var17));
                                    if (module0436.NIL != var18_53 && module0436.NIL != module0351.f23568(var17)) {
                                        var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                    }
                                    var15_51 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_53);
                                }
                            }
                            finally {
                                final SubLObject var20 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                    if (module0436.NIL != var16) {
                                        module0158.f10319(var16);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var20, var2);
                                }
                            }
                        }
                        var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                    }
                }
            }
            else {
                final SubLObject var10 = (SubLObject)module0436.NIL;
                if (module0436.NIL != module0158.f10010(var7, (SubLObject)module0436.NIL, var10)) {
                    final SubLObject var11 = module0158.f10011(var7, (SubLObject)module0436.NIL, var10);
                    SubLObject var12 = (SubLObject)module0436.NIL;
                    final SubLObject var13 = (SubLObject)module0436.NIL;
                    while (module0436.NIL == var12) {
                        final SubLObject var14 = module0052.f3695(var11, var13);
                        final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                        if (module0436.NIL != var15) {
                            SubLObject var16 = (SubLObject)module0436.NIL;
                            try {
                                var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic7$), (SubLObject)module0436.NIL);
                                SubLObject var15_52 = (SubLObject)module0436.NIL;
                                final SubLObject var16_53 = (SubLObject)module0436.NIL;
                                while (module0436.NIL == var15_52) {
                                    final SubLObject var17 = module0052.f3695(var16, var16_53);
                                    final SubLObject var18_54 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_53.eql(var17));
                                    if (module0436.NIL != var18_54 && module0436.NIL != module0351.f23568(var17)) {
                                        var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                    }
                                    var15_52 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_54);
                                }
                            }
                            finally {
                                final SubLObject var21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                    if (module0436.NIL != var16) {
                                        module0158.f10319(var16);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var21, var2);
                                }
                            }
                        }
                        var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                    }
                }
            }
        }
        else if (var6.eql((SubLObject)module0436.$ic3$)) {
            final SubLObject var22 = module0158.f10299(var4);
            if (module0436.NIL != module0158.f10038(var22)) {
                final SubLObject var23 = (SubLObject)module0436.NIL;
                final SubLObject var24 = module0012.$g73$.currentBinding(var2);
                final SubLObject var25 = module0012.$g65$.currentBinding(var2);
                final SubLObject var26 = module0012.$g67$.currentBinding(var2);
                final SubLObject var27 = module0012.$g68$.currentBinding(var2);
                final SubLObject var28 = module0012.$g66$.currentBinding(var2);
                final SubLObject var29 = module0012.$g69$.currentBinding(var2);
                final SubLObject var30 = module0012.$g70$.currentBinding(var2);
                final SubLObject var31 = module0012.$silent_progressP$.currentBinding(var2);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var2);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                    module0012.$g67$.bind((SubLObject)module0436.ONE_INTEGER, var2);
                    module0012.$g68$.bind((SubLObject)module0436.ZERO_INTEGER, var2);
                    module0012.$g66$.bind((SubLObject)module0436.ZERO_INTEGER, var2);
                    module0012.$g69$.bind((SubLObject)module0436.ZERO_INTEGER, var2);
                    module0012.$g70$.bind((SubLObject)module0436.T, var2);
                    module0012.$silent_progressP$.bind((SubLObject)((module0436.NIL != var23) ? module0012.$silent_progressP$.getDynamicValue(var2) : module0436.T), var2);
                    module0012.f474(var23);
                    final SubLObject var32 = module0158.f10039(var22);
                    SubLObject var33 = (SubLObject)module0436.NIL;
                    final SubLObject var34 = (SubLObject)module0436.NIL;
                    while (module0436.NIL == var33) {
                        final SubLObject var35 = module0052.f3695(var32, var34);
                        final SubLObject var36 = (SubLObject)SubLObjectFactory.makeBoolean(!var34.eql(var35));
                        if (module0436.NIL != var36) {
                            module0012.f476();
                            SubLObject var37 = (SubLObject)module0436.NIL;
                            try {
                                var37 = module0158.f10316(var35, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic7$), (SubLObject)module0436.NIL);
                                SubLObject var15_53 = (SubLObject)module0436.NIL;
                                final SubLObject var16_54 = (SubLObject)module0436.NIL;
                                while (module0436.NIL == var15_53) {
                                    final SubLObject var38 = module0052.f3695(var37, var16_54);
                                    final SubLObject var18_55 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_54.eql(var38));
                                    if (module0436.NIL != var18_55 && module0436.NIL != module0351.f23568(var38)) {
                                        var3 = (SubLObject)ConsesLow.cons(var38, var3);
                                    }
                                    var15_53 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_55);
                                }
                            }
                            finally {
                                final SubLObject var24_64 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                    if (module0436.NIL != var37) {
                                        module0158.f10319(var37);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var24_64, var2);
                                }
                            }
                        }
                        var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var36);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var31, var2);
                    module0012.$g70$.rebind(var30, var2);
                    module0012.$g69$.rebind(var29, var2);
                    module0012.$g66$.rebind(var28, var2);
                    module0012.$g68$.rebind(var27, var2);
                    module0012.$g67$.rebind(var26, var2);
                    module0012.$g65$.rebind(var25, var2);
                    module0012.$g73$.rebind(var24, var2);
                }
            }
        }
        else if (var6.eql((SubLObject)module0436.$ic4$)) {
            SubLObject var39 = module0218.f14453(module0158.f10301(var4), (SubLObject)module0436.UNPROVIDED);
            SubLObject var40 = (SubLObject)module0436.NIL;
            var40 = var39.first();
            while (module0436.NIL != var39) {
                if ((module0436.NIL == module0130.f8518((SubLObject)module0436.$ic7$) || module0436.NIL != module0178.f11343(var40, module0130.f8518((SubLObject)module0436.$ic7$))) && module0436.NIL != module0351.f23568(var40)) {
                    var3 = (SubLObject)ConsesLow.cons(var40, var3);
                }
                var39 = var39.rest();
                var40 = var39.first();
            }
        }
        else {
            module0158.f10295(var4, var5);
        }
        if (module0436.NIL != var3) {
            return module0052.f3709(var3);
        }
        return (SubLObject)module0436.NIL;
    }
    
    public static SubLObject f30642(final SubLObject var22, final SubLObject var1) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0436.NIL != module0351.f23568(var22)) {
            final SubLObject var24 = module0178.f11285(var22);
            var23.resetMultipleValues();
            final SubLObject var25 = module0235.f15476(var1, var24, (SubLObject)module0436.T, (SubLObject)module0436.T);
            final SubLObject var26 = var23.secondMultipleValue();
            final SubLObject var27 = var23.thirdMultipleValue();
            var23.resetMultipleValues();
            if (module0436.NIL != var25) {
                module0347.f23330(var22, var25, var27);
            }
        }
        return (SubLObject)module0436.NIL;
    }
    
    public static SubLObject f30643(final SubLObject var1, SubLObject var2) {
        if (var2 == module0436.UNPROVIDED) {
            var2 = (SubLObject)module0436.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0436.NIL;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)module0436.$ic12$, var3);
            module0147.$g2095$.bind(module0436.$ic13$, var3);
            var4 = module0349.f23451(var1, (SubLObject)module0436.$ic0$);
        }
        finally {
            module0147.$g2095$.rebind(var6, var3);
            module0147.$g2094$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f30644(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0436.NIL;
        final SubLObject var4 = module0349.f23449(var1, (SubLObject)module0436.$ic0$);
        final SubLObject var6;
        final SubLObject var5 = var6 = module0158.f10294(var4);
        if (var6.eql((SubLObject)module0436.$ic1$)) {
            var2.resetMultipleValues();
            final SubLObject var7 = module0158.f10297(var4);
            final SubLObject var8 = var2.secondMultipleValue();
            final SubLObject var9 = var2.thirdMultipleValue();
            var2.resetMultipleValues();
            if (module0436.NIL != var8) {
                if (module0436.NIL != var9) {
                    final SubLObject var10 = var9;
                    if (module0436.NIL != module0158.f10010(var7, var8, var10)) {
                        final SubLObject var11 = module0158.f10011(var7, var8, var10);
                        SubLObject var12 = (SubLObject)module0436.NIL;
                        final SubLObject var13 = (SubLObject)module0436.NIL;
                        while (module0436.NIL == var12) {
                            final SubLObject var14 = module0052.f3695(var11, var13);
                            final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                            if (module0436.NIL != var15) {
                                SubLObject var16 = (SubLObject)module0436.NIL;
                                try {
                                    var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic0$), (SubLObject)module0436.NIL);
                                    SubLObject var15_69 = (SubLObject)module0436.NIL;
                                    final SubLObject var16_70 = (SubLObject)module0436.NIL;
                                    while (module0436.NIL == var15_69) {
                                        final SubLObject var17 = module0052.f3695(var16, var16_70);
                                        final SubLObject var18_71 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_70.eql(var17));
                                        if (module0436.NIL != var18_71 && module0436.NIL != module0351.f23568(var17) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var17), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                        }
                                        var15_69 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_71);
                                    }
                                }
                                finally {
                                    final SubLObject var18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                        if (module0436.NIL != var16) {
                                            module0158.f10319(var16);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var18, var2);
                                    }
                                }
                            }
                            var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                        }
                    }
                }
                else {
                    final SubLObject var10 = (SubLObject)module0436.NIL;
                    if (module0436.NIL != module0158.f10010(var7, var8, var10)) {
                        final SubLObject var11 = module0158.f10011(var7, var8, var10);
                        SubLObject var12 = (SubLObject)module0436.NIL;
                        final SubLObject var13 = (SubLObject)module0436.NIL;
                        while (module0436.NIL == var12) {
                            final SubLObject var14 = module0052.f3695(var11, var13);
                            final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                            if (module0436.NIL != var15) {
                                SubLObject var16 = (SubLObject)module0436.NIL;
                                try {
                                    var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic0$), (SubLObject)module0436.NIL);
                                    SubLObject var15_70 = (SubLObject)module0436.NIL;
                                    final SubLObject var16_71 = (SubLObject)module0436.NIL;
                                    while (module0436.NIL == var15_70) {
                                        final SubLObject var17 = module0052.f3695(var16, var16_71);
                                        final SubLObject var18_72 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_71.eql(var17));
                                        if (module0436.NIL != var18_72 && module0436.NIL != module0351.f23568(var17) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var17), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                                            var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                        }
                                        var15_70 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_72);
                                    }
                                }
                                finally {
                                    final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                        if (module0436.NIL != var16) {
                                            module0158.f10319(var16);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var19, var2);
                                    }
                                }
                            }
                            var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                        }
                    }
                }
            }
            else if (module0436.NIL != var9) {
                final SubLObject var10 = var9;
                if (module0436.NIL != module0158.f10010(var7, (SubLObject)module0436.NIL, var10)) {
                    final SubLObject var11 = module0158.f10011(var7, (SubLObject)module0436.NIL, var10);
                    SubLObject var12 = (SubLObject)module0436.NIL;
                    final SubLObject var13 = (SubLObject)module0436.NIL;
                    while (module0436.NIL == var12) {
                        final SubLObject var14 = module0052.f3695(var11, var13);
                        final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                        if (module0436.NIL != var15) {
                            SubLObject var16 = (SubLObject)module0436.NIL;
                            try {
                                var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic0$), (SubLObject)module0436.NIL);
                                SubLObject var15_71 = (SubLObject)module0436.NIL;
                                final SubLObject var16_72 = (SubLObject)module0436.NIL;
                                while (module0436.NIL == var15_71) {
                                    final SubLObject var17 = module0052.f3695(var16, var16_72);
                                    final SubLObject var18_73 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_72.eql(var17));
                                    if (module0436.NIL != var18_73 && module0436.NIL != module0351.f23568(var17) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var17), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                    }
                                    var15_71 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_73);
                                }
                            }
                            finally {
                                final SubLObject var20 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                    if (module0436.NIL != var16) {
                                        module0158.f10319(var16);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var20, var2);
                                }
                            }
                        }
                        var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                    }
                }
            }
            else {
                final SubLObject var10 = (SubLObject)module0436.NIL;
                if (module0436.NIL != module0158.f10010(var7, (SubLObject)module0436.NIL, var10)) {
                    final SubLObject var11 = module0158.f10011(var7, (SubLObject)module0436.NIL, var10);
                    SubLObject var12 = (SubLObject)module0436.NIL;
                    final SubLObject var13 = (SubLObject)module0436.NIL;
                    while (module0436.NIL == var12) {
                        final SubLObject var14 = module0052.f3695(var11, var13);
                        final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                        if (module0436.NIL != var15) {
                            SubLObject var16 = (SubLObject)module0436.NIL;
                            try {
                                var16 = module0158.f10316(var14, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic0$), (SubLObject)module0436.NIL);
                                SubLObject var15_72 = (SubLObject)module0436.NIL;
                                final SubLObject var16_73 = (SubLObject)module0436.NIL;
                                while (module0436.NIL == var15_72) {
                                    final SubLObject var17 = module0052.f3695(var16, var16_73);
                                    final SubLObject var18_74 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_73.eql(var17));
                                    if (module0436.NIL != var18_74 && module0436.NIL != module0351.f23568(var17) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var17), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var17, var3);
                                    }
                                    var15_72 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_74);
                                }
                            }
                            finally {
                                final SubLObject var21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                    if (module0436.NIL != var16) {
                                        module0158.f10319(var16);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var21, var2);
                                }
                            }
                        }
                        var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var15);
                    }
                }
            }
        }
        else if (var6.eql((SubLObject)module0436.$ic3$)) {
            final SubLObject var22 = module0158.f10299(var4);
            if (module0436.NIL != module0158.f10038(var22)) {
                final SubLObject var23 = (SubLObject)module0436.NIL;
                final SubLObject var24 = module0012.$g73$.currentBinding(var2);
                final SubLObject var25 = module0012.$g65$.currentBinding(var2);
                final SubLObject var26 = module0012.$g67$.currentBinding(var2);
                final SubLObject var27 = module0012.$g68$.currentBinding(var2);
                final SubLObject var28 = module0012.$g66$.currentBinding(var2);
                final SubLObject var29 = module0012.$g69$.currentBinding(var2);
                final SubLObject var30 = module0012.$g70$.currentBinding(var2);
                final SubLObject var31 = module0012.$silent_progressP$.currentBinding(var2);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var2);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                    module0012.$g67$.bind((SubLObject)module0436.ONE_INTEGER, var2);
                    module0012.$g68$.bind((SubLObject)module0436.ZERO_INTEGER, var2);
                    module0012.$g66$.bind((SubLObject)module0436.ZERO_INTEGER, var2);
                    module0012.$g69$.bind((SubLObject)module0436.ZERO_INTEGER, var2);
                    module0012.$g70$.bind((SubLObject)module0436.T, var2);
                    module0012.$silent_progressP$.bind((SubLObject)((module0436.NIL != var23) ? module0012.$silent_progressP$.getDynamicValue(var2) : module0436.T), var2);
                    module0012.f474(var23);
                    final SubLObject var32 = module0158.f10039(var22);
                    SubLObject var33 = (SubLObject)module0436.NIL;
                    final SubLObject var34 = (SubLObject)module0436.NIL;
                    while (module0436.NIL == var33) {
                        final SubLObject var35 = module0052.f3695(var32, var34);
                        final SubLObject var36 = (SubLObject)SubLObjectFactory.makeBoolean(!var34.eql(var35));
                        if (module0436.NIL != var36) {
                            module0012.f476();
                            SubLObject var37 = (SubLObject)module0436.NIL;
                            try {
                                var37 = module0158.f10316(var35, (SubLObject)module0436.$ic2$, module0130.f8518((SubLObject)module0436.$ic0$), (SubLObject)module0436.NIL);
                                SubLObject var15_73 = (SubLObject)module0436.NIL;
                                final SubLObject var16_74 = (SubLObject)module0436.NIL;
                                while (module0436.NIL == var15_73) {
                                    final SubLObject var38 = module0052.f3695(var37, var16_74);
                                    final SubLObject var18_75 = (SubLObject)SubLObjectFactory.makeBoolean(!var16_74.eql(var38));
                                    if (module0436.NIL != var18_75 && module0436.NIL != module0351.f23568(var38) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var38), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                                        var3 = (SubLObject)ConsesLow.cons(var38, var3);
                                    }
                                    var15_73 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var18_75);
                                }
                            }
                            finally {
                                final SubLObject var24_84 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0436.T, var2);
                                    if (module0436.NIL != var37) {
                                        module0158.f10319(var37);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var24_84, var2);
                                }
                            }
                        }
                        var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0436.NIL == var36);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var31, var2);
                    module0012.$g70$.rebind(var30, var2);
                    module0012.$g69$.rebind(var29, var2);
                    module0012.$g66$.rebind(var28, var2);
                    module0012.$g68$.rebind(var27, var2);
                    module0012.$g67$.rebind(var26, var2);
                    module0012.$g65$.rebind(var25, var2);
                    module0012.$g73$.rebind(var24, var2);
                }
            }
        }
        else if (var6.eql((SubLObject)module0436.$ic4$)) {
            SubLObject var39 = module0218.f14453(module0158.f10301(var4), (SubLObject)module0436.UNPROVIDED);
            SubLObject var40 = (SubLObject)module0436.NIL;
            var40 = var39.first();
            while (module0436.NIL != var39) {
                if ((module0436.NIL == module0130.f8518((SubLObject)module0436.$ic0$) || module0436.NIL != module0178.f11343(var40, module0130.f8518((SubLObject)module0436.$ic0$))) && module0436.NIL != module0351.f23568(var40) && module0436.NIL != module0235.f15476(var1, module0178.f11285(var40), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED)) {
                    var3 = (SubLObject)ConsesLow.cons(var40, var3);
                }
                var39 = var39.rest();
                var40 = var39.first();
            }
        }
        else {
            module0158.f10295(var4, var5);
        }
        if (module0436.NIL != var3) {
            return module0052.f3709(var3);
        }
        return (SubLObject)module0436.NIL;
    }
    
    public static SubLObject f30645(final SubLObject var1, final SubLObject var85, final SubLObject var86) {
        if (module0436.NIL != f30646(var1, (SubLObject)module0436.UNPROVIDED)) {
            return (SubLObject)module0436.$ic18$;
        }
        return (SubLObject)module0436.$ic19$;
    }
    
    public static SubLObject f30646(final SubLObject var87, SubLObject var88) {
        if (var88 == module0436.UNPROVIDED) {
            var88 = (SubLObject)module0436.NIL;
        }
        return module0035.sublisp_boolean(module0205.f13145(Symbols.symbol_function((SubLObject)module0436.$ic20$), var87, var88, (SubLObject)module0436.UNPROVIDED));
    }
    
    public static SubLObject f30647(final SubLObject var87, SubLObject var89) {
        if (var89 == module0436.UNPROVIDED) {
            var89 = (SubLObject)module0436.NIL;
        }
        return module0035.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)module0436.$ic20$), module0205.f13207(var87, var89), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED));
    }
    
    public static SubLObject f30648(final SubLObject var87, SubLObject var89) {
        if (var89 == module0436.UNPROVIDED) {
            var89 = (SubLObject)module0436.NIL;
        }
        return module0035.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)module0436.$ic21$), module0205.f13207(var87, var89), (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED, (SubLObject)module0436.UNPROVIDED));
    }
    
    public static SubLObject f30649(final SubLObject var1, SubLObject var89) {
        if (var89 == module0436.UNPROVIDED) {
            var89 = (SubLObject)module0436.NIL;
        }
        return f30648(var1, var89);
    }
    
    public static SubLObject f30650(final SubLObject var1, SubLObject var89) {
        if (var89 == module0436.UNPROVIDED) {
            var89 = (SubLObject)module0436.NIL;
        }
        return f30647(var1, var89);
    }
    
    public static SubLObject f30651() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30636", "S#33890", 1, 1, false);
        new $f30636$UnaryFunction();
        new $f30636$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30637", "S#33891", 1, 0, false);
        new $f30637$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30638", "S#33892", 1, 0, false);
        new $f30638$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30639", "S#33894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30640", "S#33895", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30641", "S#33896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30642", "S#33897", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30643", "S#33898", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30644", "S#33899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30645", "S#33900", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30646", "S#33901", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30647", "S#33902", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30648", "S#33903", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30649", "S#33904", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0436", "f30650", "S#33893", 1, 1, false);
        new $f30650$UnaryFunction();
        new $f30650$BinaryFunction();
        return (SubLObject)module0436.NIL;
    }
    
    public static SubLObject f30652() {
        return (SubLObject)module0436.NIL;
    }
    
    public static SubLObject f30653() {
        module0340.f22941((SubLObject)module0436.$ic5$, (SubLObject)module0436.$ic6$);
        module0340.f22941((SubLObject)module0436.$ic10$, (SubLObject)module0436.$ic11$);
        module0340.f22941((SubLObject)module0436.$ic14$, (SubLObject)module0436.$ic15$);
        module0358.f23730((SubLObject)module0436.$ic16$, (SubLObject)module0436.$ic17$);
        return (SubLObject)module0436.NIL;
    }
    
    public void declareFunctions() {
        f30651();
    }
    
    public void initializeVariables() {
        f30652();
    }
    
    public void runTopLevelForms() {
        f30653();
    }
    
    static {
        me = (SubLFile)new module0436();
        $ic0$ = SubLObjectFactory.makeKeyword("POS");
        $ic1$ = SubLObjectFactory.makeKeyword("GAF-ARG");
        $ic2$ = SubLObjectFactory.makeKeyword("GAF");
        $ic3$ = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $ic4$ = SubLObjectFactory.makeKeyword("OVERLAP");
        $ic5$ = SubLObjectFactory.makeKeyword("REMOVAL-LOOKUP-POS");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0436.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33890", "CYC"), SubLObjectFactory.makeKeyword("COMPLETE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33891", "CYC")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33892", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<fort> . <whatever>)\nusing true assertions and GAF indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$bordersOn #$UnitedStatesOfAmerica ?COUNTRY)\n (#$bordersOn #$UnitedStatesOfAmerica #$Canada)\n (#$resultIsa #$JuvenileFn #$JuvenileAnimal)") });
        $ic7$ = SubLObjectFactory.makeKeyword("NEG");
        $ic8$ = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $ic9$ = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $ic10$ = SubLObjectFactory.makeKeyword("REMOVAL-LOOKUP-NEG");
        $ic11$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0436.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33895", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33894", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33896", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <whatever>))\nusing false assertions and GAF indexing in the KB") });
        $ic12$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic14$ = SubLObjectFactory.makeKeyword("REMOVAL-PRED-UNBOUND");
        $ic15$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), module0436.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#33901", "CYC"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#33898", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#33899", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12582", "CYC"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<variable> ... <fort> ... )\nusing true assertions and GAF indexing on <fort>.\nThis is a last-resort if <variable> occurs elsewhere."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(?PREDICATE #$UnitedStatesOfAmerica #$Canada)") });
        $ic16$ = SubLObjectFactory.makeKeyword("PRED-UNBOUND-POS");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("S#33900", "CYC"));
        $ic18$ = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $ic19$ = SubLObjectFactory.makeKeyword("DISALLOWED");
        $ic20$ = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $ic21$ = SubLObjectFactory.makeSymbol("FORT-P");
    }
    
    public static final class $f30636$UnaryFunction extends UnaryFunction
    {
        public $f30636$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33890"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0436.f30636(var3, (SubLObject)$f30636$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30636$BinaryFunction extends BinaryFunction
    {
        public $f30636$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33890"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var4) {
            return module0436.f30636(var3, var4);
        }
    }
    
    public static final class $f30637$UnaryFunction extends UnaryFunction
    {
        public $f30637$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33891"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0436.f30637(var3);
        }
    }
    
    public static final class $f30638$UnaryFunction extends UnaryFunction
    {
        public $f30638$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33892"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0436.f30638(var3);
        }
    }
    
    public static final class $f30650$UnaryFunction extends UnaryFunction
    {
        public $f30650$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33893"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0436.f30650(var3, (SubLObject)$f30650$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f30650$BinaryFunction extends BinaryFunction
    {
        public $f30650$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#33893"));
        }
        
        public SubLObject processItem(final SubLObject var3, final SubLObject var4) {
            return module0436.f30650(var3, var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0436.class
	Total time: 769 ms
	
	Decompiled with Procyon 0.5.32.
*/