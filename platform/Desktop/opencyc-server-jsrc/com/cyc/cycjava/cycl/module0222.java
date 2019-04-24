package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0222 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0222";
    public static final String myFingerPrint = "b0cbe58f317855679be0cde56f51a0a6e0a4501c9e0ee40c55794128c15b762b";
    public static SubLSymbol $g2400$;
    private static SubLSymbol $g2401$;
    private static SubLSymbol $g2402$;
    private static SubLSymbol $g2403$;
    public static SubLSymbol $g2404$;
    private static SubLSymbol $g2405$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLList $ic16$;
    private static final SubLList $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLString $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    
    public static SubLObject f14635(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0222.UNPROVIDED) {
            var4 = (SubLObject)module0222.T;
        }
        assert module0222.NIL != f14636(var1) : var1;
        assert module0222.NIL != f14637(var2) : var2;
        final SubLObject var5 = f14638(var1, var2, var3, var4);
        if (var5.eql((SubLObject)module0222.$ic35$)) {
            return (SubLObject)module0222.T;
        }
        if (var5.eql((SubLObject)module0222.$ic36$)) {
            return (SubLObject)module0222.NIL;
        }
        if (var5.eql((SubLObject)module0222.$ic37$)) {
            f14639(var1, var3, (SubLObject)module0222.UNPROVIDED);
            return (SubLObject)module0222.NIL;
        }
        return (SubLObject)module0222.NIL;
    }
    
    public static SubLObject f14640(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0222.UNPROVIDED) {
            var4 = (SubLObject)module0222.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0222.NIL == f14636(var1) || module0222.$ic36$ != f14638(var1, var2, var3, var4));
    }
    
    public static SubLObject f14641(SubLObject var6) {
        if (var6 == module0222.UNPROVIDED) {
            var6 = (SubLObject)module0222.T;
        }
        if (module0222.NIL != module0107.f7628(module0222.$g2402$.getGlobalValue())) {
            return f14642();
        }
        if (module0222.NIL != var6) {
            SubLObject var7 = module0222.$g2401$.getGlobalValue();
            SubLObject var8 = (SubLObject)module0222.NIL;
            var8 = var7.first();
            while (module0222.NIL != var7) {
                SubLObject var10;
                final SubLObject var9 = var10 = var8;
                SubLObject var11 = (SubLObject)module0222.NIL;
                SubLObject var12 = (SubLObject)module0222.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)module0222.$ic38$);
                var11 = var10.first();
                var10 = (var12 = var10.rest());
                f14643(var11, (SubLObject)module0222.T);
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        return (SubLObject)module0222.NIL;
    }
    
    public static SubLObject f14642() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        f14644();
        f14645();
        final SubLObject var12 = Sequences.length(module0222.$g2401$.getGlobalValue());
        SubLObject var13 = (SubLObject)module0222.ZERO_INTEGER;
        final SubLObject var14 = module0012.$g75$.currentBinding(var11);
        final SubLObject var15 = module0012.$g76$.currentBinding(var11);
        final SubLObject var16 = module0012.$g77$.currentBinding(var11);
        final SubLObject var17 = module0012.$g78$.currentBinding(var11);
        try {
            module0012.$g75$.bind((SubLObject)module0222.ZERO_INTEGER, var11);
            module0012.$g76$.bind((SubLObject)module0222.NIL, var11);
            module0012.$g77$.bind((SubLObject)module0222.T, var11);
            module0012.$g78$.bind(Time.get_universal_time(), var11);
            module0012.f478((SubLObject)module0222.$ic39$);
            SubLObject var18 = module0222.$g2401$.getGlobalValue();
            SubLObject var19 = (SubLObject)module0222.NIL;
            var19 = var18.first();
            while (module0222.NIL != var18) {
                SubLObject var21;
                final SubLObject var20 = var21 = var19;
                SubLObject var22 = (SubLObject)module0222.NIL;
                SubLObject var23 = (SubLObject)module0222.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0222.$ic38$);
                var22 = var21.first();
                var21 = (var23 = var21.rest());
                var13 = Numbers.add(var13, module0077.f5311(f14646(var22)));
                module0012.note_percent_progress(var13, var12);
                var18 = var18.rest();
                var19 = var18.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var17, var11);
            module0012.$g77$.rebind(var16, var11);
            module0012.$g76$.rebind(var15, var11);
            module0012.$g75$.rebind(var14, var11);
        }
        return var13;
    }
    
    public static SubLObject f14645() {
        module0222.$g2402$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0222.EQL), Sequences.length(module0222.$g2401$.getGlobalValue())));
        return (SubLObject)module0222.ZERO_INTEGER;
    }
    
    public static SubLObject f14647() {
        if (module0222.NIL != module0107.f7628(module0222.$g2403$.getGlobalValue())) {
            return f14644();
        }
        return (SubLObject)module0222.NIL;
    }
    
    public static SubLObject f14644() {
        module0222.$g2403$.setGlobalValue(module0084.f5781(module0222.$g2401$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0222.EQL)));
        return module0067.f4861(module0222.$g2403$.getGlobalValue());
    }
    
    public static SubLObject f14648() {
        return f14644();
    }
    
    public static SubLObject f14649(final SubLObject var20, final SubLObject var21) {
        assert module0222.NIL != module0178.f11284(var21) : var21;
        final SubLObject var22 = module0178.f11332(var21);
        final SubLObject var23 = f14650(var22);
        final SubLObject var24 = module0178.f11331(var21, var23);
        assert module0222.NIL != f14636(var22) : var22;
        if (module0222.NIL != f14637(var24)) {
            f14651(var22, var24);
        }
        return (SubLObject)module0222.NIL;
    }
    
    public static SubLObject f14652() {
        f14647();
        return module0067.f4902(module0222.$g2403$.getGlobalValue());
    }
    
    public static SubLObject f14636(final SubLObject var23) {
        f14647();
        SubLObject var24 = module0084.f5808(module0222.$g2403$.getGlobalValue(), var23);
        if (module0222.NIL == var24 && module0222.NIL != conses_high.assoc(var23, module0222.$g2401$.getGlobalValue(), (SubLObject)module0222.UNPROVIDED, (SubLObject)module0222.UNPROVIDED)) {
            f14644();
            var24 = (SubLObject)module0222.T;
        }
        return var24;
    }
    
    public static SubLObject f14650(final SubLObject var1) {
        f14647();
        SubLObject var2 = module0067.f4885(module0222.$g2403$.getGlobalValue(), var1, (SubLObject)module0222.UNPROVIDED);
        if (module0222.NIL == var2 && module0222.NIL != conses_high.assoc(var1, module0222.$g2401$.getGlobalValue(), (SubLObject)module0222.UNPROVIDED, (SubLObject)module0222.UNPROVIDED)) {
            f14644();
            var2 = module0067.f4885(module0222.$g2403$.getGlobalValue(), var1, (SubLObject)module0222.UNPROVIDED);
        }
        return var2;
    }
    
    public static SubLObject f14653(final SubLObject var1, SubLObject var4) {
        if (var4 == module0222.UNPROVIDED) {
            var4 = (SubLObject)module0222.T;
        }
        assert module0222.NIL != module0173.f10955(var1) : var1;
        final SubLObject var5 = f14643(var1, var4);
        return module0077.f5312(var5);
    }
    
    public static SubLObject f14654(final SubLObject var4) {
        if (module0222.NIL != module0107.f7628(module0222.$g2405$.getGlobalValue())) {
            module0222.$g2405$.setGlobalValue(f14643(module0222.$ic44$, var4));
        }
        return module0222.$g2405$.getGlobalValue();
    }
    
    public static SubLObject f14655(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0222.UNPROVIDED) {
            var4 = (SubLObject)module0222.T;
        }
        f14639(module0222.$ic44$, var3, (SubLObject)module0222.ONE_INTEGER);
        final SubLObject var5 = f14654(var4);
        return module0077.f5320(var2, var5);
    }
    
    public static SubLObject f14656() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return module0222.$g2400$.getDynamicValue(var11);
    }
    
    public static SubLObject f14638(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = f14650(var1);
        SubLObject var6 = (SubLObject)module0222.$ic37$;
        if (module0222.NIL != f14656() && var3.eql(var5)) {
            final SubLObject var7 = f14643(var1, var4);
            var6 = (SubLObject)((module0222.NIL != module0077.f5320(var2, var7)) ? module0222.$ic35$ : module0222.$ic36$);
        }
        return var6;
    }
    
    public static SubLObject f14639(final SubLObject var1, final SubLObject var3, SubLObject var26) {
        if (var26 == module0222.UNPROVIDED) {
            var26 = f14650(var1);
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (module0222.NIL == Errors.$ignore_mustsP$.getDynamicValue(var27) && !var3.eql(var26)) {
            Errors.error((SubLObject)module0222.$ic45$, var1, var3, var26);
        }
        return (SubLObject)module0222.NIL;
    }
    
    public static SubLObject f14643(final SubLObject var1, final SubLObject var4) {
        SubLObject var5 = module0067.f4885(module0222.$g2402$.getGlobalValue(), var1, (SubLObject)module0222.NIL);
        if (module0222.NIL != var4 && module0222.NIL == var5) {
            var5 = f14646(var1);
        }
        return var5;
    }
    
    public static SubLObject f14646(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0217.f14247(var1, (SubLObject)module0222.UNPROVIDED);
        final SubLObject var4 = module0077.f5313(Symbols.symbol_function((SubLObject)module0222.EQL), var3);
        final SubLObject var5 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0222.$ic46$, var2);
            module0147.$g2095$.bind(module0222.$ic47$, var2);
            if (module0222.NIL != module0158.f10038(var1)) {
                final SubLObject var7 = (SubLObject)module0222.NIL;
                final SubLObject var14_31 = module0012.$g73$.currentBinding(var2);
                final SubLObject var15_32 = module0012.$g65$.currentBinding(var2);
                final SubLObject var8 = module0012.$g67$.currentBinding(var2);
                final SubLObject var9 = module0012.$g68$.currentBinding(var2);
                final SubLObject var10 = module0012.$g66$.currentBinding(var2);
                final SubLObject var11 = module0012.$g69$.currentBinding(var2);
                final SubLObject var12 = module0012.$g70$.currentBinding(var2);
                final SubLObject var13 = module0012.$silent_progressP$.currentBinding(var2);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var2);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var2), var2);
                    module0012.$g67$.bind((SubLObject)module0222.ONE_INTEGER, var2);
                    module0012.$g68$.bind((SubLObject)module0222.ZERO_INTEGER, var2);
                    module0012.$g66$.bind((SubLObject)module0222.ZERO_INTEGER, var2);
                    module0012.$g69$.bind((SubLObject)module0222.ZERO_INTEGER, var2);
                    module0012.$g70$.bind((SubLObject)module0222.T, var2);
                    module0012.$silent_progressP$.bind((SubLObject)((module0222.NIL != var7) ? module0012.$silent_progressP$.getDynamicValue(var2) : module0222.T), var2);
                    module0012.f474(var7);
                    final SubLObject var14 = module0158.f10039(var1);
                    SubLObject var15 = (SubLObject)module0222.NIL;
                    final SubLObject var16 = (SubLObject)module0222.NIL;
                    while (module0222.NIL == var15) {
                        final SubLObject var17 = module0052.f3695(var14, var16);
                        final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                        if (module0222.NIL != var18) {
                            module0012.f476();
                            SubLObject var19 = (SubLObject)module0222.NIL;
                            try {
                                var19 = module0158.f10316(var17, (SubLObject)module0222.$ic48$, (SubLObject)module0222.$ic49$, (SubLObject)module0222.NIL);
                                SubLObject var38_43 = (SubLObject)module0222.NIL;
                                final SubLObject var39_44 = (SubLObject)module0222.NIL;
                                while (module0222.NIL == var38_43) {
                                    final SubLObject var20 = module0052.f3695(var19, var39_44);
                                    final SubLObject var41_46 = (SubLObject)SubLObjectFactory.makeBoolean(!var39_44.eql(var20));
                                    if (module0222.NIL != var41_46) {
                                        f14657(var4, var20);
                                    }
                                    var38_43 = (SubLObject)SubLObjectFactory.makeBoolean(module0222.NIL == var41_46);
                                }
                            }
                            finally {
                                final SubLObject var14_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0222.T, var2);
                                    if (module0222.NIL != var19) {
                                        module0158.f10319(var19);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var14_32, var2);
                                }
                            }
                        }
                        var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0222.NIL == var18);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var13, var2);
                    module0012.$g70$.rebind(var12, var2);
                    module0012.$g69$.rebind(var11, var2);
                    module0012.$g66$.rebind(var10, var2);
                    module0012.$g68$.rebind(var9, var2);
                    module0012.$g67$.rebind(var8, var2);
                    module0012.$g65$.rebind(var15_32, var2);
                    module0012.$g73$.rebind(var14_31, var2);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var2);
            module0147.$g2094$.rebind(var5, var2);
        }
        module0067.f4886(module0222.$g2402$.getGlobalValue(), var1, var4);
        return var4;
    }
    
    public static SubLObject f14651(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f14643(var1, (SubLObject)module0222.T);
        module0077.f5327(var2, var4);
        SubLObject var5 = (SubLObject)module0222.NIL;
        final SubLObject var6 = f14650(var1);
        final SubLObject var7 = module0222.$g2400$.currentBinding(var3);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var3);
        try {
            module0222.$g2400$.bind((SubLObject)module0222.NIL, var3);
            module0147.$g2094$.bind((SubLObject)module0222.$ic46$, var3);
            module0147.$g2095$.bind(module0222.$ic47$, var3);
            if (module0222.NIL != module0158.f10010(var2, var6, var1)) {
                final SubLObject var10 = module0158.f10011(var2, var6, var1);
                SubLObject var11 = var5;
                final SubLObject var12 = (SubLObject)module0222.NIL;
                while (module0222.NIL == var11) {
                    final SubLObject var13 = module0052.f3695(var10, var12);
                    final SubLObject var14 = (SubLObject)SubLObjectFactory.makeBoolean(!var12.eql(var13));
                    if (module0222.NIL != var14) {
                        SubLObject var15 = (SubLObject)module0222.NIL;
                        try {
                            var15 = module0158.f10316(var13, (SubLObject)module0222.$ic48$, (SubLObject)module0222.$ic49$, (SubLObject)module0222.NIL);
                            SubLObject var38_51 = var5;
                            final SubLObject var39_52 = (SubLObject)module0222.NIL;
                            while (module0222.NIL == var38_51) {
                                final SubLObject var16 = module0052.f3695(var15, var39_52);
                                final SubLObject var41_53 = (SubLObject)SubLObjectFactory.makeBoolean(!var39_52.eql(var16));
                                if (module0222.NIL != var41_53) {
                                    var5 = f14657(var4, var16);
                                }
                                var38_51 = (SubLObject)SubLObjectFactory.makeBoolean(module0222.NIL == var41_53 || module0222.NIL != var5);
                            }
                        }
                        finally {
                            final SubLObject var14_54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0222.T, var3);
                                if (module0222.NIL != var15) {
                                    module0158.f10319(var15);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var14_54, var3);
                            }
                        }
                    }
                    var11 = (SubLObject)SubLObjectFactory.makeBoolean(module0222.NIL == var14 || module0222.NIL != var5);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var9, var3);
            module0147.$g2094$.rebind(var8, var3);
            module0222.$g2400$.rebind(var7, var3);
        }
        if (module0222.NIL != var5) {
            return (SubLObject)module0222.T;
        }
        return (SubLObject)module0222.NIL;
    }
    
    public static SubLObject f14657(final SubLObject var25, final SubLObject var45) {
        if (module0222.NIL != module0226.f15088(var45, (SubLObject)module0222.$ic49$)) {
            final SubLObject var46 = module0178.f11287(var45);
            if (module0222.NIL != module0161.f10481(var46)) {
                final SubLObject var47 = module0178.f11332(var45);
                final SubLObject var48 = f14650(var47);
                final SubLObject var49 = module0178.f11331(var45, var48);
                if (module0222.NIL != f14637(var49)) {
                    module0077.f5326(var49, var25);
                    return (SubLObject)module0222.T;
                }
            }
        }
        return (SubLObject)module0222.NIL;
    }
    
    public static SubLObject f14637(final SubLObject var23) {
        return module0205.f13155(var23);
    }
    
    public static SubLObject f14658() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0222.NIL == module0067.f4852(module0222.$g2402$.getGlobalValue()) || module0222.NIL != module0067.f4882(module0222.$g2402$.getGlobalValue()));
    }
    
    public static SubLObject f14659() {
        return f14642();
    }
    
    public static SubLObject f14660(final SubLObject var56) {
        module0021.f1038(module0222.$g2402$.getGlobalValue(), var56);
        module0021.f1038((SubLObject)module0222.NIL, var56);
        module0021.f1038((SubLObject)module0222.NIL, var56);
        module0021.f1038((SubLObject)module0222.NIL, var56);
        return (SubLObject)module0222.NIL;
    }
    
    public static SubLObject f14661(final SubLObject var56) {
        SubLObject var57 = (SubLObject)module0222.NIL;
        module0222.$g2402$.setGlobalValue(module0021.f1060(var56, (SubLObject)module0222.UNPROVIDED, (SubLObject)module0222.UNPROVIDED));
        var57 = module0021.f1060(var56, (SubLObject)module0222.UNPROVIDED, (SubLObject)module0222.UNPROVIDED);
        var57 = module0021.f1060(var56, (SubLObject)module0222.UNPROVIDED, (SubLObject)module0222.UNPROVIDED);
        var57 = module0021.f1060(var56, (SubLObject)module0222.UNPROVIDED, (SubLObject)module0222.UNPROVIDED);
        return (SubLObject)module0222.NIL;
    }
    
    public static SubLObject f14662() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14635", "S#16042", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14640", "S#17424", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14641", "S#17425", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14642", "S#17426", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14645", "S#16683", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14647", "S#17427", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14644", "S#17428", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14648", "S#9534", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14649", "S#17429", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14652", "S#17430", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14636", "S#17431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14650", "S#17432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14653", "S#17433", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14654", "S#17434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14655", "S#17435", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14656", "S#17436", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14638", "S#17437", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14639", "S#17438", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14643", "S#17439", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14646", "S#17440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14651", "S#17441", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14657", "S#17442", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14637", "S#16041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14658", "S#16682", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14659", "S#16689", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14660", "S#17443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0222", "f14661", "S#17444", 1, 0, false);
        return (SubLObject)module0222.NIL;
    }
    
    public static SubLObject f14663() {
        module0222.$g2400$ = SubLFiles.defparameter("S#17445", (SubLObject)module0222.T);
        module0222.$g2401$ = SubLFiles.deflexical("S#17446", (SubLObject)ConsesLow.listS((SubLObject)module0222.$ic0$, new SubLObject[] { module0222.$ic1$, module0222.$ic2$, module0222.$ic3$, module0222.$ic4$, module0222.$ic5$, module0222.$ic6$, module0222.$ic7$, module0222.$ic8$, module0222.$ic9$, module0222.$ic10$, module0222.$ic11$, module0222.$ic12$, module0222.$ic13$, module0222.$ic14$, module0222.$ic15$, module0222.$ic16$, module0222.$ic17$, module0222.$ic18$, module0222.$ic19$, module0222.$ic20$, module0222.$ic21$, module0222.$ic22$, module0222.$ic23$, module0222.$ic24$, module0222.$ic25$, module0222.$ic26$, module0222.$ic27$, module0222.$ic28$, reader.bq_cons(module0131.$g1512$.getGlobalValue(), (SubLObject)module0222.ONE_INTEGER), module0222.$ic29$ }));
        module0222.$g2402$ = SubLFiles.deflexical("S#17447", (SubLObject)((module0222.NIL != Symbols.boundp((SubLObject)module0222.$ic30$)) ? module0222.$g2402$.getGlobalValue() : module0222.$ic31$));
        module0222.$g2403$ = SubLFiles.deflexical("S#17448", (SubLObject)((module0222.NIL != Symbols.boundp((SubLObject)module0222.$ic32$)) ? module0222.$g2403$.getGlobalValue() : module0222.$ic31$));
        module0222.$g2404$ = SubLFiles.deflexical("S#17449", (SubLObject)module0222.$ic40$);
        module0222.$g2405$ = SubLFiles.deflexical("S#17450", (module0222.NIL != Symbols.boundp((SubLObject)module0222.$ic43$)) ? module0222.$g2405$.getGlobalValue() : module0107.f7627());
        return (SubLObject)module0222.NIL;
    }
    
    public static SubLObject f14664() {
        module0003.f57((SubLObject)module0222.$ic30$);
        module0003.f57((SubLObject)module0222.$ic32$);
        module0003.f57((SubLObject)module0222.$ic43$);
        return (SubLObject)module0222.NIL;
    }
    
    private static SubLObject _constant_29_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("backchainRequired")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArg")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForAllArgs")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArgAndRest")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluateAtEL")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluateImmediately")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("typedGenlPreds")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("functionCorrespondingPredicate")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("highlyRelevantTerm")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgResultIsa")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgResultGenl")), (SubLObject)module0222.THREE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgGenl1-2")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgGenl2-1")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgGenl2-4")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotGenl1-2")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl1-2")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl2-1")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl2-3")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl3-2")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgGenlIsa2-1")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgDifferent")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgReln")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("irrelevantTerm")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ruleTrivialForJustificationParaphrase")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("mtTrivialForJustificationParaphrase")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("modalInArg")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("notAssertible")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExists")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllInstance")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceAll")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("rewriteOf")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("scopingArg")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("skolemizeForward")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("typeLevelVersionInArg")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsCount")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsMany")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsMin")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsUnique")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsSame")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsAndOnly")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("reflexiveOn")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("requiredActorSlots-Unique")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("collRelation")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("collRelationUnique")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("requiredActorSlots")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("rolesForEventType")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("keRequirementPreds")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("roleTypesForEventType")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("requiredArg1Pred")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("preferredSubjectRole")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("subjectRoles")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("preferredIndirectObjectRole")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("indirectObjectRoles")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("preferredDirectObjectRole")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("directObjectRoles")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("posForms")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("posBaseForms")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Terse")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Precise")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("dispreferredLexification")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("predTrivialForJustificationParaphrase")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertionTrivialForJustificationParaphrase")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ruleTrivialForJustificationParaphrase")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("salientTermImagePathname")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("formulaTemplateHasArgumentPositionInformation")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("except")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("exceptMt")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("assertiveWFFRule")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-2")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-3")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-4")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-5")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-1")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-3")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-4")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-5")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa3-4")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa3-5")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa4-5")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("singleEntryFormatInArgs")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("wffConstraintMt")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("completeExtentAsserted")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("completeExtentAssertedForValueInArg")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("completeExtentEnumerable")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("completeExtentEnumerableForArg")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("completeExtentEnumerableForValueInArg")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("completeExtentDecidable")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("completeExtentDecidableForValueInArg")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArg")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("conservativeViaArg")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("conservativeViaArgInverse")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("functionalInArgs")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("strictlyFunctionalInArgs")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("parsingConflateTo")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("qaConflateTo")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("qaConflateToCompletely")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("terseDisambiguationString")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotation")), (SubLObject)module0222.FOUR_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("headMedialString")), (SubLObject)module0222.FIVE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("compoundString")), (SubLObject)module0222.FOUR_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("hyphenString")), (SubLObject)module0222.FOUR_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("multiWordString")), (SubLObject)module0222.FOUR_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("preferredNameString")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("placeName-WithRegion")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("placeName-WithRegionAbbreviation")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("titleOfWork")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("movieTitleString")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("gospelName-Short")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("brandNameOfProductType")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("businessName-WithTickerSymbol")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("organizationName-Standard")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("organizationName-Official")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("familyName")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("lastName")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("placeName-ShortForm")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("countryName-ShortForm")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("placeName-Standard")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("countryName-LongForm")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("chemicalFormulaString")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("fullName")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("alias")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("definiteDescriptions")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("acronymString")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("initialismString")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("initialsString")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("pseudonym")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("countryCodeTrigraph")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("atomicSymbol")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("codeMapping")), (SubLObject)module0222.THREE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("applicableWhenTypedOnlyWhenSpecialization")), (SubLObject)module0222.THREE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("mostNotableIsa")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("mostNotableGenls")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("facetOfCollectionBasedOnBinaryPred")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("facetOfCollectionBasedOnBinaryPredInverse")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("facetOfCollectionBasedOnTypeBinaryPred")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("facetOfCollectionBasedOnTypeBinaryPredInverse")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("teamSeed")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("denotesArgInReln")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("classificationSystemOf-Focally")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt-Vocabulary")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("marketTypeDefiningProductType")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("collectionDifference")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("characteristicActivityTypeOfPersonType-Frequently")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("medicalFindingTypeOfType")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("medicalDiagnosisTypeOfType")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("suppressFacetInstancesFromTaxonomy")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quantifiedBinaryPredicateForPredWithMacro")), (SubLObject)module0222.THREE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("verbSemTransTemplate")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluationTypeDirectEvalueeType")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("allSubCollectionsAreInstancesOf")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("typeDeterminesValueOfArgInReln")), (SubLObject)module0222.THREE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("hypothesisLevelStrategyForPredAndArgs")), (SubLObject)module0222.TWO_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("sourceFixedSemanticValueForRelationArg")), (SubLObject)module0222.THREE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlRules")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("disallowMeaningSentencesForUnboundPredicates")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("hypotheticalTerm")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("predNotAllowedInGeneralizedQueryForTheSetOf")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("decontextualizedPredicate")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("decontextualizedCollection")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("predicateConventionMt")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("collectionConventionMt")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedArgument")), (SubLObject)module0222.ONE_INTEGER), ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("notAssertible")), (SubLObject)module0222.ONE_INTEGER) });
    }
    
    public void declareFunctions() {
        f14662();
    }
    
    public void initializeVariables() {
        f14663();
    }
    
    public void runTopLevelForms() {
        f14664();
    }
    
    static {
        me = (SubLFile)new module0222();
        module0222.$g2400$ = null;
        module0222.$g2401$ = null;
        module0222.$g2402$ = null;
        module0222.$g2403$ = null;
        module0222.$g2404$ = null;
        module0222.$g2405$ = null;
        $ic0$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("argsIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic1$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("argAndRestIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic2$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("argAndRestGenl")), (SubLObject)module0222.ONE_INTEGER);
        $ic3$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("argsQuotedIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic4$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("argAndRestQuotedIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic5$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg1Genl")), (SubLObject)module0222.ONE_INTEGER);
        $ic6$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg2Genl")), (SubLObject)module0222.ONE_INTEGER);
        $ic7$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg3Genl")), (SubLObject)module0222.ONE_INTEGER);
        $ic8$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg4Genl")), (SubLObject)module0222.ONE_INTEGER);
        $ic9$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg5Genl")), (SubLObject)module0222.ONE_INTEGER);
        $ic10$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg6Genl")), (SubLObject)module0222.ONE_INTEGER);
        $ic11$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg1NotIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic12$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg2NotIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic13$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg3NotIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic14$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg4NotIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic15$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg5NotIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic16$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg6NotIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic17$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg1Format")), (SubLObject)module0222.ONE_INTEGER);
        $ic18$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg2Format")), (SubLObject)module0222.ONE_INTEGER);
        $ic19$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg3Format")), (SubLObject)module0222.ONE_INTEGER);
        $ic20$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg4Format")), (SubLObject)module0222.ONE_INTEGER);
        $ic21$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg5Format")), (SubLObject)module0222.ONE_INTEGER);
        $ic22$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg6Format")), (SubLObject)module0222.ONE_INTEGER);
        $ic23$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg1QuotedIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic24$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg2QuotedIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic25$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg3QuotedIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic26$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg4QuotedIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic27$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg5QuotedIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic28$ = (SubLList)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg6QuotedIsa")), (SubLObject)module0222.ONE_INTEGER);
        $ic29$ = _constant_29_initializer();
        $ic30$ = SubLObjectFactory.makeSymbol("S#17447", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic32$ = SubLObjectFactory.makeSymbol("S#17448", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#17431", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#16041", "CYC");
        $ic35$ = SubLObjectFactory.makeKeyword("YES");
        $ic36$ = SubLObjectFactory.makeKeyword("NO");
        $ic37$ = SubLObjectFactory.makeKeyword("MAYBE");
        $ic38$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"));
        $ic39$ = SubLObjectFactory.makeString("Initializing all somewhere caches");
        $ic40$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#17429", "CYC"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")));
        $ic41$ = SubLObjectFactory.makeSymbol("S#11995", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic43$ = SubLObjectFactory.makeSymbol("S#17450", "CYC");
        $ic44$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgResultIsa"));
        $ic45$ = SubLObjectFactory.makeString("somewhere-cache argnum mismatch for ~s: ~s vs. ~s");
        $ic46$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic48$ = SubLObjectFactory.makeKeyword("GAF");
        $ic49$ = SubLObjectFactory.makeKeyword("TRUE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0222.class
	Total time: 295 ms
	
	Decompiled with Procyon 0.5.32.
*/