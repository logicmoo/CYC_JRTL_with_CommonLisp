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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)T;
        }
        assert NIL != f14636(var1) : var1;
        assert NIL != f14637(var2) : var2;
        final SubLObject var5 = f14638(var1, var2, var3, var4);
        if (var5.eql((SubLObject)$ic35$)) {
            return (SubLObject)T;
        }
        if (var5.eql((SubLObject)$ic36$)) {
            return (SubLObject)NIL;
        }
        if (var5.eql((SubLObject)$ic37$)) {
            f14639(var1, var3, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14640(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)T;
        }
        return (SubLObject)makeBoolean(NIL == f14636(var1) || $ic36$ != f14638(var1, var2, var3, var4));
    }
    
    public static SubLObject f14641(SubLObject var6) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)T;
        }
        if (NIL != module0107.f7628($g2402$.getGlobalValue())) {
            return f14642();
        }
        if (NIL != var6) {
            SubLObject var7 = $g2401$.getGlobalValue();
            SubLObject var8 = (SubLObject)NIL;
            var8 = var7.first();
            while (NIL != var7) {
                SubLObject var10;
                final SubLObject var9 = var10 = var8;
                SubLObject var11 = (SubLObject)NIL;
                SubLObject var12 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic38$);
                var11 = var10.first();
                var10 = (var12 = var10.rest());
                f14643(var11, (SubLObject)T);
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14642() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        f14644();
        f14645();
        final SubLObject var12 = Sequences.length($g2401$.getGlobalValue());
        SubLObject var13 = (SubLObject)ZERO_INTEGER;
        final SubLObject var14 = module0012.$g75$.currentBinding(var11);
        final SubLObject var15 = module0012.$g76$.currentBinding(var11);
        final SubLObject var16 = module0012.$g77$.currentBinding(var11);
        final SubLObject var17 = module0012.$g78$.currentBinding(var11);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var11);
            module0012.$g76$.bind((SubLObject)NIL, var11);
            module0012.$g77$.bind((SubLObject)T, var11);
            module0012.$g78$.bind(Time.get_universal_time(), var11);
            module0012.f478((SubLObject)$ic39$);
            SubLObject var18 = $g2401$.getGlobalValue();
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18.first();
            while (NIL != var18) {
                SubLObject var21;
                final SubLObject var20 = var21 = var19;
                SubLObject var22 = (SubLObject)NIL;
                SubLObject var23 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic38$);
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
        $g2402$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQL), Sequences.length($g2401$.getGlobalValue())));
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f14647() {
        if (NIL != module0107.f7628($g2403$.getGlobalValue())) {
            return f14644();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14644() {
        $g2403$.setGlobalValue(module0084.f5781($g2401$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL)));
        return module0067.f4861($g2403$.getGlobalValue());
    }
    
    public static SubLObject f14648() {
        return f14644();
    }
    
    public static SubLObject f14649(final SubLObject var20, final SubLObject var21) {
        assert NIL != module0178.f11284(var21) : var21;
        final SubLObject var22 = module0178.f11332(var21);
        final SubLObject var23 = f14650(var22);
        final SubLObject var24 = module0178.f11331(var21, var23);
        assert NIL != f14636(var22) : var22;
        if (NIL != f14637(var24)) {
            f14651(var22, var24);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14652() {
        f14647();
        return module0067.f4902($g2403$.getGlobalValue());
    }
    
    public static SubLObject f14636(final SubLObject var23) {
        f14647();
        SubLObject var24 = module0084.f5808($g2403$.getGlobalValue(), var23);
        if (NIL == var24 && NIL != conses_high.assoc(var23, $g2401$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            f14644();
            var24 = (SubLObject)T;
        }
        return var24;
    }
    
    public static SubLObject f14650(final SubLObject var1) {
        f14647();
        SubLObject var2 = module0067.f4885($g2403$.getGlobalValue(), var1, (SubLObject)UNPROVIDED);
        if (NIL == var2 && NIL != conses_high.assoc(var1, $g2401$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            f14644();
            var2 = module0067.f4885($g2403$.getGlobalValue(), var1, (SubLObject)UNPROVIDED);
        }
        return var2;
    }
    
    public static SubLObject f14653(final SubLObject var1, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)T;
        }
        assert NIL != module0173.f10955(var1) : var1;
        final SubLObject var5 = f14643(var1, var4);
        return module0077.f5312(var5);
    }
    
    public static SubLObject f14654(final SubLObject var4) {
        if (NIL != module0107.f7628($g2405$.getGlobalValue())) {
            $g2405$.setGlobalValue(f14643($ic44$, var4));
        }
        return $g2405$.getGlobalValue();
    }
    
    public static SubLObject f14655(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)T;
        }
        f14639($ic44$, var3, (SubLObject)ONE_INTEGER);
        final SubLObject var5 = f14654(var4);
        return module0077.f5320(var2, var5);
    }
    
    public static SubLObject f14656() {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        return $g2400$.getDynamicValue(var11);
    }
    
    public static SubLObject f14638(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = f14650(var1);
        SubLObject var6 = (SubLObject)$ic37$;
        if (NIL != f14656() && var3.eql(var5)) {
            final SubLObject var7 = f14643(var1, var4);
            var6 = (SubLObject)((NIL != module0077.f5320(var2, var7)) ? $ic35$ : $ic36$);
        }
        return var6;
    }
    
    public static SubLObject f14639(final SubLObject var1, final SubLObject var3, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = f14650(var1);
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var27) && !var3.eql(var26)) {
            Errors.error((SubLObject)$ic45$, var1, var3, var26);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14643(final SubLObject var1, final SubLObject var4) {
        SubLObject var5 = module0067.f4885($g2402$.getGlobalValue(), var1, (SubLObject)NIL);
        if (NIL != var4 && NIL == var5) {
            var5 = f14646(var1);
        }
        return var5;
    }
    
    public static SubLObject f14646(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0217.f14247(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), var3);
        final SubLObject var5 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic46$, var2);
            module0147.$g2095$.bind($ic47$, var2);
            if (NIL != module0158.f10038(var1)) {
                final SubLObject var7 = (SubLObject)NIL;
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
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var2);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var2);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var2);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var2);
                    module0012.$g70$.bind((SubLObject)T, var2);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var7) ? module0012.$silent_progressP$.getDynamicValue(var2) : T), var2);
                    module0012.f474(var7);
                    final SubLObject var14 = module0158.f10039(var1);
                    SubLObject var15 = (SubLObject)NIL;
                    final SubLObject var16 = (SubLObject)NIL;
                    while (NIL == var15) {
                        final SubLObject var17 = module0052.f3695(var14, var16);
                        final SubLObject var18 = (SubLObject)makeBoolean(!var16.eql(var17));
                        if (NIL != var18) {
                            module0012.f476();
                            SubLObject var19 = (SubLObject)NIL;
                            try {
                                var19 = module0158.f10316(var17, (SubLObject)$ic48$, (SubLObject)$ic49$, (SubLObject)NIL);
                                SubLObject var38_43 = (SubLObject)NIL;
                                final SubLObject var39_44 = (SubLObject)NIL;
                                while (NIL == var38_43) {
                                    final SubLObject var20 = module0052.f3695(var19, var39_44);
                                    final SubLObject var41_46 = (SubLObject)makeBoolean(!var39_44.eql(var20));
                                    if (NIL != var41_46) {
                                        f14657(var4, var20);
                                    }
                                    var38_43 = (SubLObject)makeBoolean(NIL == var41_46);
                                }
                            }
                            finally {
                                final SubLObject var14_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                    if (NIL != var19) {
                                        module0158.f10319(var19);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var14_32, var2);
                                }
                            }
                        }
                        var15 = (SubLObject)makeBoolean(NIL == var18);
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
        module0067.f4886($g2402$.getGlobalValue(), var1, var4);
        return var4;
    }
    
    public static SubLObject f14651(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f14643(var1, (SubLObject)T);
        module0077.f5327(var2, var4);
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = f14650(var1);
        final SubLObject var7 = $g2400$.currentBinding(var3);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var3);
        try {
            $g2400$.bind((SubLObject)NIL, var3);
            module0147.$g2094$.bind((SubLObject)$ic46$, var3);
            module0147.$g2095$.bind($ic47$, var3);
            if (NIL != module0158.f10010(var2, var6, var1)) {
                final SubLObject var10 = module0158.f10011(var2, var6, var1);
                SubLObject var11 = var5;
                final SubLObject var12 = (SubLObject)NIL;
                while (NIL == var11) {
                    final SubLObject var13 = module0052.f3695(var10, var12);
                    final SubLObject var14 = (SubLObject)makeBoolean(!var12.eql(var13));
                    if (NIL != var14) {
                        SubLObject var15 = (SubLObject)NIL;
                        try {
                            var15 = module0158.f10316(var13, (SubLObject)$ic48$, (SubLObject)$ic49$, (SubLObject)NIL);
                            SubLObject var38_51 = var5;
                            final SubLObject var39_52 = (SubLObject)NIL;
                            while (NIL == var38_51) {
                                final SubLObject var16 = module0052.f3695(var15, var39_52);
                                final SubLObject var41_53 = (SubLObject)makeBoolean(!var39_52.eql(var16));
                                if (NIL != var41_53) {
                                    var5 = f14657(var4, var16);
                                }
                                var38_51 = (SubLObject)makeBoolean(NIL == var41_53 || NIL != var5);
                            }
                        }
                        finally {
                            final SubLObject var14_54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                if (NIL != var15) {
                                    module0158.f10319(var15);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var14_54, var3);
                            }
                        }
                    }
                    var11 = (SubLObject)makeBoolean(NIL == var14 || NIL != var5);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var9, var3);
            module0147.$g2094$.rebind(var8, var3);
            $g2400$.rebind(var7, var3);
        }
        if (NIL != var5) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14657(final SubLObject var25, final SubLObject var45) {
        if (NIL != module0226.f15088(var45, (SubLObject)$ic49$)) {
            final SubLObject var46 = module0178.f11287(var45);
            if (NIL != module0161.f10481(var46)) {
                final SubLObject var47 = module0178.f11332(var45);
                final SubLObject var48 = f14650(var47);
                final SubLObject var49 = module0178.f11331(var45, var48);
                if (NIL != f14637(var49)) {
                    module0077.f5326(var49, var25);
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14637(final SubLObject var23) {
        return module0205.f13155(var23);
    }
    
    public static SubLObject f14658() {
        return (SubLObject)makeBoolean(NIL == module0067.f4852($g2402$.getGlobalValue()) || NIL != module0067.f4882($g2402$.getGlobalValue()));
    }
    
    public static SubLObject f14659() {
        return f14642();
    }
    
    public static SubLObject f14660(final SubLObject var56) {
        module0021.f1038($g2402$.getGlobalValue(), var56);
        module0021.f1038((SubLObject)NIL, var56);
        module0021.f1038((SubLObject)NIL, var56);
        module0021.f1038((SubLObject)NIL, var56);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14661(final SubLObject var56) {
        SubLObject var57 = (SubLObject)NIL;
        $g2402$.setGlobalValue(module0021.f1060(var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        var57 = module0021.f1060(var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var57 = module0021.f1060(var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var57 = module0021.f1060(var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14663() {
        $g2400$ = SubLFiles.defparameter("S#17445", (SubLObject)T);
        $g2401$ = SubLFiles.deflexical("S#17446", (SubLObject)ConsesLow.listS((SubLObject)$ic0$, new SubLObject[] { $ic1$, $ic2$, $ic3$, $ic4$, $ic5$, $ic6$, $ic7$, $ic8$, $ic9$, $ic10$, $ic11$, $ic12$, $ic13$, $ic14$, $ic15$, $ic16$, $ic17$, $ic18$, $ic19$, $ic20$, $ic21$, $ic22$, $ic23$, $ic24$, $ic25$, $ic26$, $ic27$, $ic28$, reader.bq_cons(module0131.$g1512$.getGlobalValue(), (SubLObject)ONE_INTEGER), $ic29$ }));
        $g2402$ = SubLFiles.deflexical("S#17447", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic30$)) ? $g2402$.getGlobalValue() : $ic31$));
        $g2403$ = SubLFiles.deflexical("S#17448", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic32$)) ? $g2403$.getGlobalValue() : $ic31$));
        $g2404$ = SubLFiles.deflexical("S#17449", (SubLObject)$ic40$);
        $g2405$ = SubLFiles.deflexical("S#17450", (NIL != Symbols.boundp((SubLObject)$ic43$)) ? $g2405$.getGlobalValue() : module0107.f7627());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14664() {
        module0003.f57((SubLObject)$ic30$);
        module0003.f57((SubLObject)$ic32$);
        module0003.f57((SubLObject)$ic43$);
        return (SubLObject)NIL;
    }
    
    private static SubLObject _constant_29_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("backchainRequired")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("canonicalizerDirectiveForArg")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("canonicalizerDirectiveForAllArgs")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("canonicalizerDirectiveForArgAndRest")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("evaluateAtEL")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("evaluateImmediately")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("typedGenlPreds")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("functionCorrespondingPredicate")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("highlyRelevantTerm")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgResultIsa")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgResultGenl")), (SubLObject)THREE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgGenl1-2")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgGenl2-1")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgGenl2-4")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotGenl1-2")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgIsaGenl1-2")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgIsaGenl2-1")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgIsaGenl2-3")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgIsaGenl3-2")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgGenlIsa2-1")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgDifferent")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgReln")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("irrelevantTerm")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("ruleTrivialForJustificationParaphrase")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("mtTrivialForJustificationParaphrase")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("modalInArg")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("notAssertible")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("relationAllExists")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceAll")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("rewriteOf")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("scopingArg")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("skolemizeForward")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("typeLevelVersionInArg")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsCount")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMany")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMin")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsUnique")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsSame")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsAndOnly")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("reflexiveOn")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("requiredActorSlots-Unique")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("collRelation")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("collRelationUnique")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("requiredActorSlots")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("rolesForEventType")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("keRequirementPreds")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("roleTypesForEventType")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("requiredArg1Pred")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("preferredSubjectRole")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("subjectRoles")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("preferredIndirectObjectRole")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("indirectObjectRoles")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("preferredDirectObjectRole")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("directObjectRoles")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("posForms")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("posBaseForms")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("genStringAssertion-Terse")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("genStringAssertion-Precise")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("genStringAssertion")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("dispreferredLexification")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("predTrivialForJustificationParaphrase")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("assertionTrivialForJustificationParaphrase")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("ruleTrivialForJustificationParaphrase")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("salientTermImagePathname")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("formulaTemplateHasArgumentPositionInformation")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("except")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("exceptMt")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("assertiveWFFRule")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa1-2")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa1-3")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa1-4")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa1-5")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa2-1")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa2-3")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa2-4")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa2-5")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa3-4")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa3-5")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("interArgNotIsa4-5")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("singleEntryFormatInArgs")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("wffConstraintMt")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("completeExtentAsserted")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("completeExtentAssertedForValueInArg")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("completeExtentEnumerable")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("completeExtentEnumerableForArg")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("completeExtentEnumerableForValueInArg")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("completeExtentDecidable")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("completeExtentDecidableForValueInArg")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArg")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArgInverse")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("conservativeViaArg")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("conservativeViaArgInverse")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("functionalInArgs")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("strictlyFunctionalInArgs")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("parsingConflateTo")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("qaConflateTo")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("qaConflateToCompletely")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("terseDisambiguationString")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("denotation")), (SubLObject)FOUR_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("headMedialString")), (SubLObject)FIVE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("compoundString")), (SubLObject)FOUR_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("hyphenString")), (SubLObject)FOUR_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("multiWordString")), (SubLObject)FOUR_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("preferredNameString")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("nameString")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("placeName-WithRegion")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("placeName-WithRegionAbbreviation")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("titleOfWork")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("movieTitleString")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("gospelName-Short")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("brandNameOfProductType")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("businessName-WithTickerSymbol")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("organizationName-Standard")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("organizationName-Official")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("familyName")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("lastName")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("placeName-ShortForm")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("countryName-ShortForm")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("placeName-Standard")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("countryName-LongForm")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("chemicalFormulaString")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("fullName")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("alias")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("definiteDescriptions")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("acronymString")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("initialismString")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("initialsString")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("pseudonym")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("countryCodeTrigraph")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("atomicSymbol")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("codeMapping")), (SubLObject)THREE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("applicableWhenTypedOnlyWhenSpecialization")), (SubLObject)THREE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("mostNotableIsa")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("mostNotableGenls")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("facetOfCollectionBasedOnBinaryPred")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("facetOfCollectionBasedOnBinaryPredInverse")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("facetOfCollectionBasedOnTypeBinaryPred")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("facetOfCollectionBasedOnTypeBinaryPredInverse")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("teamSeed")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("denotesArgInReln")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("classificationSystemOf-Focally")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("genlMt-Vocabulary")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("marketTypeDefiningProductType")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("collectionDifference")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("characteristicActivityTypeOfPersonType-Frequently")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("medicalFindingTypeOfType")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("medicalDiagnosisTypeOfType")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("suppressFacetInstancesFromTaxonomy")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("quantifiedBinaryPredicateForPredWithMacro")), (SubLObject)THREE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("verbSemTransTemplate")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("evaluationTypeDirectEvalueeType")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("allSubCollectionsAreInstancesOf")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("typeDeterminesValueOfArgInReln")), (SubLObject)THREE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("hypothesisLevelStrategyForPredAndArgs")), (SubLObject)TWO_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("sourceFixedSemanticValueForRelationArg")), (SubLObject)THREE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("genlRules")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("disallowMeaningSentencesForUnboundPredicates")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("hypotheticalTerm")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("predNotAllowedInGeneralizedQueryForTheSetOf")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("decontextualizedPredicate")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("decontextualizedCollection")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("predicateConventionMt")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("collectionConventionMt")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("quotedArgument")), (SubLObject)ONE_INTEGER), ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("notAssertible")), (SubLObject)ONE_INTEGER) });
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
        $g2400$ = null;
        $g2401$ = null;
        $g2402$ = null;
        $g2403$ = null;
        $g2404$ = null;
        $g2405$ = null;
        $ic0$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("argsIsa")), (SubLObject)ONE_INTEGER);
        $ic1$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("argAndRestIsa")), (SubLObject)ONE_INTEGER);
        $ic2$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("argAndRestGenl")), (SubLObject)ONE_INTEGER);
        $ic3$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("argsQuotedIsa")), (SubLObject)ONE_INTEGER);
        $ic4$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("argAndRestQuotedIsa")), (SubLObject)ONE_INTEGER);
        $ic5$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg1Genl")), (SubLObject)ONE_INTEGER);
        $ic6$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg2Genl")), (SubLObject)ONE_INTEGER);
        $ic7$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg3Genl")), (SubLObject)ONE_INTEGER);
        $ic8$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg4Genl")), (SubLObject)ONE_INTEGER);
        $ic9$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg5Genl")), (SubLObject)ONE_INTEGER);
        $ic10$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg6Genl")), (SubLObject)ONE_INTEGER);
        $ic11$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg1NotIsa")), (SubLObject)ONE_INTEGER);
        $ic12$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg2NotIsa")), (SubLObject)ONE_INTEGER);
        $ic13$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg3NotIsa")), (SubLObject)ONE_INTEGER);
        $ic14$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg4NotIsa")), (SubLObject)ONE_INTEGER);
        $ic15$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg5NotIsa")), (SubLObject)ONE_INTEGER);
        $ic16$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg6NotIsa")), (SubLObject)ONE_INTEGER);
        $ic17$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg1Format")), (SubLObject)ONE_INTEGER);
        $ic18$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg2Format")), (SubLObject)ONE_INTEGER);
        $ic19$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg3Format")), (SubLObject)ONE_INTEGER);
        $ic20$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg4Format")), (SubLObject)ONE_INTEGER);
        $ic21$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg5Format")), (SubLObject)ONE_INTEGER);
        $ic22$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg6Format")), (SubLObject)ONE_INTEGER);
        $ic23$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg1QuotedIsa")), (SubLObject)ONE_INTEGER);
        $ic24$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg2QuotedIsa")), (SubLObject)ONE_INTEGER);
        $ic25$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg3QuotedIsa")), (SubLObject)ONE_INTEGER);
        $ic26$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg4QuotedIsa")), (SubLObject)ONE_INTEGER);
        $ic27$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg5QuotedIsa")), (SubLObject)ONE_INTEGER);
        $ic28$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("arg6QuotedIsa")), (SubLObject)ONE_INTEGER);
        $ic29$ = _constant_29_initializer();
        $ic30$ = makeSymbol("S#17447", "CYC");
        $ic31$ = makeKeyword("UNINITIALIZED");
        $ic32$ = makeSymbol("S#17448", "CYC");
        $ic33$ = makeSymbol("S#17431", "CYC");
        $ic34$ = makeSymbol("S#16041", "CYC");
        $ic35$ = makeKeyword("YES");
        $ic36$ = makeKeyword("NO");
        $ic37$ = makeKeyword("MAYBE");
        $ic38$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"));
        $ic39$ = makeString("Initializing all somewhere caches");
        $ic40$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#17429", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")));
        $ic41$ = makeSymbol("S#11995", "CYC");
        $ic42$ = makeSymbol("FORT-P");
        $ic43$ = makeSymbol("S#17450", "CYC");
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("interArgResultIsa"));
        $ic45$ = makeString("somewhere-cache argnum mismatch for ~s: ~s vs. ~s");
        $ic46$ = makeSymbol("S#12274", "CYC");
        $ic47$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic48$ = makeKeyword("GAF");
        $ic49$ = makeKeyword("TRUE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 295 ms
	
	Decompiled with Procyon 0.5.32.
*/