package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0787 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0787";
    public static final String myFingerPrint = "884b0d80457a3328a8597f90d14269614ced153eff550671d150328937afb340";
    private static SubLSymbol $g6302$;
    private static SubLSymbol $g6303$;
    private static SubLSymbol $g6304$;
    private static SubLSymbol $g6305$;
    public static SubLSymbol $g6306$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLString $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLString $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    
    public static SubLObject f50466(final SubLObject var1) {
        return module0087.f5956(var1, (SubLObject)module0787.UNPROVIDED);
    }
    
    public static SubLObject f50467() {
        return module0087.f5954(Symbols.symbol_function((SubLObject)module0787.EQUALP));
    }
    
    public static SubLObject f50468(final SubLObject var1) {
        return module0087.f5956(var1, (SubLObject)module0787.UNPROVIDED);
    }
    
    public static SubLObject f50469() {
        return module0087.f5954(Symbols.symbol_function((SubLObject)module0787.EQUALP));
    }
    
    public static SubLObject f50470(final SubLObject var2) {
        if (var2.eql((SubLObject)module0787.$ic4$)) {
            return module0787.$g6302$.getGlobalValue();
        }
        if (var2.eql((SubLObject)module0787.$ic5$)) {
            return module0787.$g6303$.getGlobalValue();
        }
        return (SubLObject)module0787.NIL;
    }
    
    public static SubLObject f50471(final SubLObject var2) {
        if (var2.eql((SubLObject)module0787.$ic4$)) {
            return module0787.$g6304$.getGlobalValue();
        }
        if (var2.eql((SubLObject)module0787.$ic5$)) {
            return module0787.$g6305$.getGlobalValue();
        }
        return (SubLObject)module0787.NIL;
    }
    
    public static SubLObject f50472(final SubLObject var4, final SubLObject var5) {
        SubLObject var6 = (SubLObject)module0787.NIL;
        if (module0787.NIL == module0038.f2608(var5) && module0787.NIL == Sequences.find((SubLObject)Characters.CHAR_vertical, var5, (SubLObject)module0787.UNPROVIDED, (SubLObject)module0787.UNPROVIDED, (SubLObject)module0787.UNPROVIDED, (SubLObject)module0787.UNPROVIDED)) {
            SubLObject var8;
            final SubLObject var7 = var8 = module0087.f5983(var4, Sequences.reverse(var5));
            SubLObject var9 = (SubLObject)module0787.NIL;
            var9 = var8.first();
            while (module0787.NIL != var8) {
                final SubLObject var10 = Sequences.reverse(module0782.f50333(var9));
                final SubLObject var11 = module0782.f50334(var9);
                var6 = (SubLObject)ConsesLow.cons(module0782.f50332(var10, var11), var6);
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        return var6;
    }
    
    public static SubLObject f50473(final SubLObject var12, final SubLObject var5) {
        SubLObject var13 = (SubLObject)module0787.NIL;
        if (module0787.NIL == module0038.f2608(var5) && module0787.NIL == Sequences.find((SubLObject)Characters.CHAR_vertical, var5, (SubLObject)module0787.UNPROVIDED, (SubLObject)module0787.UNPROVIDED, (SubLObject)module0787.UNPROVIDED, (SubLObject)module0787.UNPROVIDED)) {
            SubLObject var15;
            final SubLObject var14 = var15 = module0087.f5983(var12, var5);
            SubLObject var16 = (SubLObject)module0787.NIL;
            var16 = var15.first();
            while (module0787.NIL != var15) {
                final SubLObject var17 = module0782.f50333(var16);
                final SubLObject var18 = module0782.f50334(var16);
                var13 = (SubLObject)ConsesLow.cons(module0782.f50332(var17, var18), var13);
                var15 = var15.rest();
                var16 = var15.first();
            }
        }
        return var13;
    }
    
    public static SubLObject f50474() {
        SubLObject var8 = module0584.$g4440$.getGlobalValue();
        SubLObject var9 = (SubLObject)module0787.NIL;
        var9 = var8.first();
        while (module0787.NIL != var8) {
            f50475(var9);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return (SubLObject)module0787.NIL;
    }
    
    public static SubLObject f50476() {
        SubLObject var8 = module0584.$g4440$.getGlobalValue();
        SubLObject var9 = (SubLObject)module0787.NIL;
        var9 = var8.first();
        while (module0787.NIL != var8) {
            f50477(var9);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return (SubLObject)module0787.NIL;
    }
    
    public static SubLObject f50478(final SubLObject var2) {
        return module0087.f5966(f50470(var2));
    }
    
    public static SubLObject f50479(final SubLObject var2) {
        return module0087.f5966(f50471(var2));
    }
    
    public static SubLObject f50480(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (var2.eql((SubLObject)module0787.$ic4$)) {
            SubLObject var4 = (SubLObject)module0787.NIL;
            final SubLObject var5 = module0147.f9540(module0584.$g4437$.getDynamicValue(var3));
            final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
            final SubLObject var7 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var8 = module0147.$g2096$.currentBinding(var3);
            try {
                module0147.$g2095$.bind(module0147.f9545(var5), var3);
                module0147.$g2094$.bind(module0147.f9546(var5), var3);
                module0147.$g2096$.bind(module0147.f9549(var5), var3);
                final SubLObject var9 = module0259.f16848(module0787.$ic6$, (SubLObject)module0787.UNPROVIDED, (SubLObject)module0787.UNPROVIDED);
                final SubLObject var10 = Sequences.length(var9);
                SubLObject var11 = (SubLObject)module0787.ZERO_INTEGER;
                final SubLObject var17_23 = module0012.$g75$.currentBinding(var3);
                final SubLObject var18_24 = module0012.$g76$.currentBinding(var3);
                final SubLObject var19_25 = module0012.$g77$.currentBinding(var3);
                final SubLObject var12 = module0012.$g78$.currentBinding(var3);
                try {
                    module0012.$g75$.bind((SubLObject)module0787.ZERO_INTEGER, var3);
                    module0012.$g76$.bind((SubLObject)module0787.NIL, var3);
                    module0012.$g77$.bind((SubLObject)module0787.T, var3);
                    module0012.$g78$.bind(Time.get_universal_time(), var3);
                    module0012.f478((SubLObject)module0787.$ic7$);
                    SubLObject var13 = var9;
                    SubLObject var14 = (SubLObject)module0787.NIL;
                    var14 = var13.first();
                    while (module0787.NIL != var13) {
                        if (module0787.NIL == module0259.f16854(var14, module0787.$ic8$, (SubLObject)module0787.UNPROVIDED, (SubLObject)module0787.UNPROVIDED)) {
                            SubLObject var15 = module0787.$ic9$;
                            if (module0787.NIL != module0158.f10010(var14, (SubLObject)module0787.NIL, var15)) {
                                final SubLObject var16 = module0158.f10011(var14, (SubLObject)module0787.NIL, var15);
                                SubLObject var17 = (SubLObject)module0787.NIL;
                                final SubLObject var18 = (SubLObject)module0787.NIL;
                                while (module0787.NIL == var17) {
                                    final SubLObject var19 = module0052.f3695(var16, var18);
                                    final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                                    if (module0787.NIL != var20) {
                                        SubLObject var21 = (SubLObject)module0787.NIL;
                                        try {
                                            var21 = module0158.f10316(var19, (SubLObject)module0787.$ic10$, (SubLObject)module0787.$ic11$, (SubLObject)module0787.NIL);
                                            SubLObject var30_35 = (SubLObject)module0787.NIL;
                                            final SubLObject var31_36 = (SubLObject)module0787.NIL;
                                            while (module0787.NIL == var30_35) {
                                                final SubLObject var22 = module0052.f3695(var21, var31_36);
                                                final SubLObject var33_38 = (SubLObject)SubLObjectFactory.makeBoolean(!var31_36.eql(var22));
                                                if (module0787.NIL != var33_38) {
                                                    final SubLObject var23 = module0786.f50434(var14);
                                                    final SubLObject var24 = module0209.f13552(module0178.f11335(var22));
                                                    var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var23), var4);
                                                }
                                                var30_35 = (SubLObject)SubLObjectFactory.makeBoolean(module0787.NIL == var33_38);
                                            }
                                        }
                                        finally {
                                            final SubLObject var17_24 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0787.T, var3);
                                                if (module0787.NIL != var21) {
                                                    module0158.f10319(var21);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var17_24, var3);
                                            }
                                        }
                                    }
                                    var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0787.NIL == var20);
                                }
                            }
                            if (module0787.NIL != module0787.$g6306$.getDynamicValue(var3)) {
                                var15 = module0787.$ic12$;
                                if (module0787.NIL != module0158.f10010(var14, (SubLObject)module0787.NIL, var15)) {
                                    final SubLObject var16 = module0158.f10011(var14, (SubLObject)module0787.NIL, var15);
                                    SubLObject var17 = (SubLObject)module0787.NIL;
                                    final SubLObject var18 = (SubLObject)module0787.NIL;
                                    while (module0787.NIL == var17) {
                                        final SubLObject var19 = module0052.f3695(var16, var18);
                                        final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                                        if (module0787.NIL != var20) {
                                            SubLObject var21 = (SubLObject)module0787.NIL;
                                            try {
                                                var21 = module0158.f10316(var19, (SubLObject)module0787.$ic10$, (SubLObject)module0787.$ic11$, (SubLObject)module0787.NIL);
                                                SubLObject var30_36 = (SubLObject)module0787.NIL;
                                                final SubLObject var31_37 = (SubLObject)module0787.NIL;
                                                while (module0787.NIL == var30_36) {
                                                    final SubLObject var22 = module0052.f3695(var21, var31_37);
                                                    final SubLObject var33_39 = (SubLObject)SubLObjectFactory.makeBoolean(!var31_37.eql(var22));
                                                    if (module0787.NIL != var33_39) {
                                                        final SubLObject var23 = module0786.f50434(var14);
                                                        final SubLObject var24 = module0209.f13552(module0178.f11335(var22));
                                                        var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var23), var4);
                                                    }
                                                    var30_36 = (SubLObject)SubLObjectFactory.makeBoolean(module0787.NIL == var33_39);
                                                }
                                            }
                                            finally {
                                                final SubLObject var17_25 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0787.T, var3);
                                                    if (module0787.NIL != var21) {
                                                        module0158.f10319(var21);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_25, var3);
                                                }
                                            }
                                        }
                                        var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0787.NIL == var20);
                                    }
                                }
                            }
                        }
                        var11 = Numbers.add(var11, (SubLObject)module0787.ONE_INTEGER);
                        module0012.note_percent_progress(var11, var10);
                        var13 = var13.rest();
                        var14 = var13.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var12, var3);
                    module0012.$g77$.rebind(var19_25, var3);
                    module0012.$g76$.rebind(var18_24, var3);
                    module0012.$g75$.rebind(var17_23, var3);
                }
            }
            finally {
                module0147.$g2096$.rebind(var8, var3);
                module0147.$g2094$.rebind(var7, var3);
                module0147.$g2095$.rebind(var6, var3);
            }
            return var4;
        }
        if (var2.eql((SubLObject)module0787.$ic5$)) {
            SubLObject var4 = (SubLObject)module0787.NIL;
            final SubLObject var5 = module0147.f9540(module0584.$g4437$.getDynamicValue(var3));
            final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
            final SubLObject var7 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var8 = module0147.$g2096$.currentBinding(var3);
            try {
                module0147.$g2095$.bind(module0147.f9545(var5), var3);
                module0147.$g2094$.bind(module0147.f9546(var5), var3);
                module0147.$g2096$.bind(module0147.f9549(var5), var3);
                final SubLObject var25 = module0787.$ic13$;
                if (module0787.NIL != module0158.f10038(var25)) {
                    final SubLObject var26 = (SubLObject)module0787.NIL;
                    final SubLObject var17_26 = module0012.$g73$.currentBinding(var3);
                    final SubLObject var18_25 = module0012.$g65$.currentBinding(var3);
                    final SubLObject var19_26 = module0012.$g67$.currentBinding(var3);
                    final SubLObject var27 = module0012.$g68$.currentBinding(var3);
                    final SubLObject var28 = module0012.$g66$.currentBinding(var3);
                    final SubLObject var29 = module0012.$g69$.currentBinding(var3);
                    final SubLObject var30 = module0012.$g70$.currentBinding(var3);
                    final SubLObject var31 = module0012.$silent_progressP$.currentBinding(var3);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var3);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                        module0012.$g67$.bind((SubLObject)module0787.ONE_INTEGER, var3);
                        module0012.$g68$.bind((SubLObject)module0787.ZERO_INTEGER, var3);
                        module0012.$g66$.bind((SubLObject)module0787.ZERO_INTEGER, var3);
                        module0012.$g69$.bind((SubLObject)module0787.ZERO_INTEGER, var3);
                        module0012.$g70$.bind((SubLObject)module0787.T, var3);
                        module0012.$silent_progressP$.bind((SubLObject)((module0787.NIL != var26) ? module0012.$silent_progressP$.getDynamicValue(var3) : module0787.T), var3);
                        module0012.f474(var26);
                        final SubLObject var16 = module0158.f10039(var25);
                        SubLObject var17 = (SubLObject)module0787.NIL;
                        final SubLObject var18 = (SubLObject)module0787.NIL;
                        while (module0787.NIL == var17) {
                            final SubLObject var32 = module0052.f3695(var16, var18);
                            final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var32));
                            if (module0787.NIL != var20) {
                                module0012.f476();
                                SubLObject var21 = (SubLObject)module0787.NIL;
                                try {
                                    var21 = module0158.f10316(var32, (SubLObject)module0787.$ic10$, (SubLObject)module0787.NIL, (SubLObject)module0787.NIL);
                                    SubLObject var30_37 = (SubLObject)module0787.NIL;
                                    final SubLObject var31_38 = (SubLObject)module0787.NIL;
                                    while (module0787.NIL == var30_37) {
                                        final SubLObject var33 = module0052.f3695(var21, var31_38);
                                        final SubLObject var33_40 = (SubLObject)SubLObjectFactory.makeBoolean(!var31_38.eql(var33));
                                        if (module0787.NIL != var33_40) {
                                            final SubLObject var23 = module0786.f50434(module0178.f11334(var33));
                                            final SubLObject var34 = module0178.f11336(var33);
                                            var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var34, var23), var4);
                                        }
                                        var30_37 = (SubLObject)SubLObjectFactory.makeBoolean(module0787.NIL == var33_40);
                                    }
                                }
                                finally {
                                    final SubLObject var17_27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0787.T, var3);
                                        if (module0787.NIL != var21) {
                                            module0158.f10319(var21);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var17_27, var3);
                                    }
                                }
                            }
                            var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0787.NIL == var20);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var31, var3);
                        module0012.$g70$.rebind(var30, var3);
                        module0012.$g69$.rebind(var29, var3);
                        module0012.$g66$.rebind(var28, var3);
                        module0012.$g68$.rebind(var27, var3);
                        module0012.$g67$.rebind(var19_26, var3);
                        module0012.$g65$.rebind(var18_25, var3);
                        module0012.$g73$.rebind(var17_26, var3);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var8, var3);
                module0147.$g2094$.rebind(var7, var3);
                module0147.$g2095$.rebind(var6, var3);
            }
            return var4;
        }
        return (SubLObject)module0787.NIL;
    }
    
    public static SubLObject f50481(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (var2.eql((SubLObject)module0787.$ic4$)) {
            SubLObject var4 = (SubLObject)module0787.NIL;
            final SubLObject var5 = module0147.f9540(module0584.$g4437$.getDynamicValue(var3));
            final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
            final SubLObject var7 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var8 = module0147.$g2096$.currentBinding(var3);
            try {
                module0147.$g2095$.bind(module0147.f9545(var5), var3);
                module0147.$g2094$.bind(module0147.f9546(var5), var3);
                module0147.$g2096$.bind(module0147.f9549(var5), var3);
                final SubLObject var9 = module0259.f16848(module0787.$ic14$, (SubLObject)module0787.UNPROVIDED, (SubLObject)module0787.UNPROVIDED);
                final SubLObject var10 = Sequences.length(var9);
                SubLObject var11 = (SubLObject)module0787.ZERO_INTEGER;
                final SubLObject var17_62 = module0012.$g75$.currentBinding(var3);
                final SubLObject var18_63 = module0012.$g76$.currentBinding(var3);
                final SubLObject var19_64 = module0012.$g77$.currentBinding(var3);
                final SubLObject var12 = module0012.$g78$.currentBinding(var3);
                try {
                    module0012.$g75$.bind((SubLObject)module0787.ZERO_INTEGER, var3);
                    module0012.$g76$.bind((SubLObject)module0787.NIL, var3);
                    module0012.$g77$.bind((SubLObject)module0787.T, var3);
                    module0012.$g78$.bind(Time.get_universal_time(), var3);
                    module0012.f478((SubLObject)module0787.$ic15$);
                    SubLObject var13 = var9;
                    SubLObject var14 = (SubLObject)module0787.NIL;
                    var14 = var13.first();
                    while (module0787.NIL != var13) {
                        if (module0787.NIL == module0259.f16854(var14, module0787.$ic8$, (SubLObject)module0787.UNPROVIDED, (SubLObject)module0787.UNPROVIDED)) {
                            final SubLObject var15 = module0787.$ic16$;
                            if (module0787.NIL != module0158.f10010(var14, (SubLObject)module0787.NIL, var15)) {
                                final SubLObject var16 = module0158.f10011(var14, (SubLObject)module0787.NIL, var15);
                                SubLObject var17 = (SubLObject)module0787.NIL;
                                final SubLObject var18 = (SubLObject)module0787.NIL;
                                while (module0787.NIL == var17) {
                                    final SubLObject var19 = module0052.f3695(var16, var18);
                                    final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                                    if (module0787.NIL != var20) {
                                        SubLObject var21 = (SubLObject)module0787.NIL;
                                        try {
                                            var21 = module0158.f10316(var19, (SubLObject)module0787.$ic10$, (SubLObject)module0787.$ic11$, (SubLObject)module0787.NIL);
                                            SubLObject var30_66 = (SubLObject)module0787.NIL;
                                            final SubLObject var31_67 = (SubLObject)module0787.NIL;
                                            while (module0787.NIL == var30_66) {
                                                final SubLObject var22 = module0052.f3695(var21, var31_67);
                                                final SubLObject var33_68 = (SubLObject)SubLObjectFactory.makeBoolean(!var31_67.eql(var22));
                                                if (module0787.NIL != var33_68) {
                                                    final SubLObject var23 = module0786.f50434(var14);
                                                    final SubLObject var24 = module0209.f13552(module0178.f11335(var22));
                                                    var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24, var23), var4);
                                                }
                                                var30_66 = (SubLObject)SubLObjectFactory.makeBoolean(module0787.NIL == var33_68);
                                            }
                                        }
                                        finally {
                                            final SubLObject var17_63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0787.T, var3);
                                                if (module0787.NIL != var21) {
                                                    module0158.f10319(var21);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var17_63, var3);
                                            }
                                        }
                                    }
                                    var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0787.NIL == var20);
                                }
                            }
                        }
                        var11 = Numbers.add(var11, (SubLObject)module0787.ONE_INTEGER);
                        module0012.note_percent_progress(var11, var10);
                        var13 = var13.rest();
                        var14 = var13.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var12, var3);
                    module0012.$g77$.rebind(var19_64, var3);
                    module0012.$g76$.rebind(var18_63, var3);
                    module0012.$g75$.rebind(var17_62, var3);
                }
            }
            finally {
                module0147.$g2096$.rebind(var8, var3);
                module0147.$g2094$.rebind(var7, var3);
                module0147.$g2095$.rebind(var6, var3);
            }
            return var4;
        }
        return (SubLObject)module0787.NIL;
    }
    
    public static SubLObject f50482(final SubLObject var2, final SubLObject var10, final SubLObject var71) {
        return module0087.f5971(f50470(var2), Sequences.reverse(var10), var71);
    }
    
    public static SubLObject f50483(final SubLObject var2, final SubLObject var13, final SubLObject var71) {
        return module0087.f5971(f50471(var2), var13, var71);
    }
    
    public static SubLObject f50475(final SubLObject var2) {
        module0087.f5955(f50470(var2));
        SubLObject var3 = f50480(var2);
        SubLObject var4 = (SubLObject)module0787.NIL;
        var4 = var3.first();
        while (module0787.NIL != var3) {
            SubLObject var6;
            final SubLObject var5 = var6 = var4;
            SubLObject var7 = (SubLObject)module0787.NIL;
            SubLObject var8 = (SubLObject)module0787.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0787.$ic17$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0787.$ic17$);
            var8 = var6.first();
            var6 = var6.rest();
            if (module0787.NIL == var6) {
                f50482(var2, var7, var8);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0787.$ic17$);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return f50470(var2);
    }
    
    public static SubLObject f50477(final SubLObject var2) {
        module0087.f5955(f50471(var2));
        SubLObject var3 = f50481(var2);
        SubLObject var4 = (SubLObject)module0787.NIL;
        var4 = var3.first();
        while (module0787.NIL != var3) {
            SubLObject var6;
            final SubLObject var5 = var6 = var4;
            SubLObject var7 = (SubLObject)module0787.NIL;
            SubLObject var8 = (SubLObject)module0787.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0787.$ic18$);
            var7 = var6.first();
            var6 = var6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0787.$ic18$);
            var8 = var6.first();
            var6 = var6.rest();
            if (module0787.NIL == var6) {
                f50483(var2, var7, var8);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0787.$ic18$);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        return f50471(var2);
    }
    
    public static SubLObject f50484() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50466", "S#55021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50467", "S#55022", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50468", "S#55023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50469", "S#55024", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50470", "S#54927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50471", "S#54929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50472", "S#54928", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50473", "S#54930", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50474", "S#55025", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50476", "S#55026", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50478", "S#55027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50479", "S#55028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50480", "S#55029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50481", "S#55030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50482", "S#55031", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50483", "S#55032", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50475", "S#55033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0787", "f50477", "S#55034", 1, 0, false);
        return (SubLObject)module0787.NIL;
    }
    
    public static SubLObject f50485() {
        module0787.$g6302$ = SubLFiles.deflexical("S#55035", (module0787.NIL != Symbols.boundp((SubLObject)module0787.$ic0$)) ? module0787.$g6302$.getGlobalValue() : f50467());
        module0787.$g6303$ = SubLFiles.deflexical("S#55036", (module0787.NIL != Symbols.boundp((SubLObject)module0787.$ic1$)) ? module0787.$g6303$.getGlobalValue() : f50467());
        module0787.$g6304$ = SubLFiles.deflexical("S#55037", (module0787.NIL != Symbols.boundp((SubLObject)module0787.$ic2$)) ? module0787.$g6304$.getGlobalValue() : f50469());
        module0787.$g6305$ = SubLFiles.deflexical("S#55038", (module0787.NIL != Symbols.boundp((SubLObject)module0787.$ic3$)) ? module0787.$g6305$.getGlobalValue() : f50469());
        module0787.$g6306$ = SubLFiles.defparameter("S#55039", (SubLObject)module0787.NIL);
        return (SubLObject)module0787.NIL;
    }
    
    public static SubLObject f50486() {
        module0003.f57((SubLObject)module0787.$ic0$);
        module0003.f57((SubLObject)module0787.$ic1$);
        module0003.f57((SubLObject)module0787.$ic2$);
        module0003.f57((SubLObject)module0787.$ic3$);
        return (SubLObject)module0787.NIL;
    }
    
    public void declareFunctions() {
        f50484();
    }
    
    public void initializeVariables() {
        f50485();
    }
    
    public void runTopLevelForms() {
        f50486();
    }
    
    static {
        me = (SubLFile)new module0787();
        module0787.$g6302$ = null;
        module0787.$g6303$ = null;
        module0787.$g6304$ = null;
        module0787.$g6305$ = null;
        module0787.$g6306$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#55035", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#55036", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#55037", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#55038", "CYC");
        $ic4$ = SubLObjectFactory.makeKeyword("DERIV");
        $ic5$ = SubLObjectFactory.makeKeyword("INFL");
        $ic6$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DerivationalSuffix"));
        $ic7$ = SubLObjectFactory.makeString("Finding derivational suffix strings...");
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnproductiveLexicalAffix"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("suffixString"));
        $ic10$ = SubLObjectFactory.makeKeyword("GAF");
        $ic11$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("phoneticVariantOfSuffix"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("regularSuffix"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DerivationalPrefix"));
        $ic15$ = SubLObjectFactory.makeString("Finding derivational prefix strings...");
        $ic16$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("prefixString"));
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39569", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0787.class
	Total time: 328 ms
	
	Decompiled with Procyon 0.5.32.
*/