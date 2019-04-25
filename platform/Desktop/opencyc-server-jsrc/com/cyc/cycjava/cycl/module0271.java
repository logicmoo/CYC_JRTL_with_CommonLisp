package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0271 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0271";
    public static final String myFingerPrint = "453636a9f917be7a69d09ce199ff8ce43670496bac2011e8215676aefc66d538";
    public static SubLSymbol $g2559$;
    public static SubLSymbol $g2560$;
    public static SubLSymbol $g2561$;
    public static SubLSymbol $g2562$;
    public static SubLSymbol $g2563$;
    public static SubLSymbol $g2564$;
    public static SubLSymbol $g2565$;
    private static SubLSymbol $g2566$;
    private static SubLSymbol $g2567$;
    private static SubLSymbol $g2568$;
    private static SubLSymbol $g2569$;
    private static SubLSymbol $g2570$;
    private static SubLSymbol $g2571$;
    private static SubLSymbol $g2572$;
    private static SubLSymbol $g2573$;
    private static SubLSymbol $g2574$;
    private static SubLSymbol $g2575$;
    private static SubLSymbol $g2576$;
    private static SubLSymbol $g2577$;
    private static SubLSymbol $g2578$;
    private static SubLSymbol $g2579$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLString $ic17$;
    private static final SubLInteger $ic18$;
    private static final SubLInteger $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLInteger $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLInteger $ic37$;
    private static final SubLInteger $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLList $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    
    public static SubLObject f17865(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0271.NIL == f17866(var1));
    }
    
    public static SubLObject f17866(final SubLObject var1) {
        final SubLObject var2 = module0289.f19396(var1);
        final SubLObject var3 = module0178.f11287(var1);
        return module0274.f18060(var2, var3, (SubLObject)module0271.UNPROVIDED);
    }
    
    public static SubLObject f17867(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0271.NIL == f17868(var1));
    }
    
    public static SubLObject f17868(final SubLObject var1) {
        final SubLObject var2 = module0289.f19396(var1);
        final SubLObject var3 = module0178.f11287(var1);
        return module0274.f18064(var2, var3, (SubLObject)module0271.UNPROVIDED);
    }
    
    public static SubLObject f17869(final SubLObject var1) {
        final SubLObject var2 = module0289.f19396(var1);
        final SubLObject var3 = module0178.f11287(var1);
        return module0274.f18188(var2, var3, (SubLObject)module0271.UNPROVIDED);
    }
    
    public static SubLObject f17870(final SubLObject var1) {
        final SubLObject var2 = module0289.f19396(var1);
        final SubLObject var3 = module0178.f11287(var1);
        return module0274.f18192(var2, var3, (SubLObject)module0271.UNPROVIDED);
    }
    
    public static SubLObject f17871() {
        module0018.$g696$.setDynamicValue((SubLObject)module0271.NIL);
        module0271.$g2562$.setDynamicValue((SubLObject)module0271.NIL);
        module0144.$g1752$.setDynamicValue((SubLObject)module0271.NIL);
        module0271.$g2560$.setDynamicValue((SubLObject)module0271.NIL);
        module0271.$g2561$.setDynamicValue((SubLObject)module0271.NIL);
        module0271.$g2563$.setDynamicValue((SubLObject)module0271.NIL);
        module0146.$g2055$.setDynamicValue((SubLObject)module0271.NIL);
        module0144.$g1771$.setDynamicValue((SubLObject)module0271.NIL);
        module0144.$g1769$.setDynamicValue((SubLObject)module0271.NIL);
        module0152.$g2107$.setDynamicValue((SubLObject)module0271.NIL);
        module0110.$g1374$.setDynamicValue((SubLObject)module0271.T);
        return (SubLObject)module0271.NIL;
    }
    
    public static SubLObject f17872() {
        module0271.$g2562$.setDynamicValue((SubLObject)module0271.T);
        module0144.$g1752$.setDynamicValue((SubLObject)module0271.T);
        module0271.$g2560$.setDynamicValue((SubLObject)module0271.T);
        module0271.$g2563$.setDynamicValue((SubLObject)module0271.T);
        module0146.$g2055$.setDynamicValue((SubLObject)module0271.T);
        module0144.$g1771$.setDynamicValue((SubLObject)module0271.T);
        module0144.$g1769$.setDynamicValue((SubLObject)module0271.T);
        module0152.$g2107$.setDynamicValue((SubLObject)module0271.T);
        return (SubLObject)module0271.NIL;
    }
    
    public static SubLObject f17873() {
        return module0018.f981();
    }
    
    public static SubLObject f17874(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0271.NIL == f17875(var3));
    }
    
    public static SubLObject f17875(final SubLObject var3) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0271.NIL != module0161.f10499(var3) || (module0271.NIL == var3 && module0271.NIL != module0147.f9513()));
    }
    
    public static SubLObject f17876(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0271.NIL != module0173.f10969(var4)) {
            return (SubLObject)module0271.T;
        }
        if (module0271.NIL == module0173.f10955(var4)) {
            return (SubLObject)module0271.NIL;
        }
        if (module0271.NIL != module0152.$g2101$.getDynamicValue(var5)) {
            module0274.f18082((SubLObject)ConsesLow.list((SubLObject)module0271.$ic0$, var4));
        }
        return (SubLObject)module0271.NIL;
    }
    
    public static SubLObject f17877(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0271.NIL != module0173.f10955(var4) && module0271.NIL == f17876(var4));
    }
    
    public static SubLObject f17878(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0271.NIL != module0201.f12546(var4) && module0271.NIL == module0201.f12557(var4));
    }
    
    public static SubLObject f17879(final SubLObject var7) {
        return module0205.f13145(Symbols.symbol_function((SubLObject)module0271.$ic1$), var7, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED);
    }
    
    public static SubLObject f17880(final SubLObject var7) {
        return module0205.f13183(var7, Symbols.symbol_function((SubLObject)module0271.$ic1$), (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED);
    }
    
    public static SubLObject f17881() {
        return module0271.$g2566$.getGlobalValue();
    }
    
    public static SubLObject f17882() {
        return module0271.$g2567$.getGlobalValue();
    }
    
    public static SubLObject f17883() {
        return module0271.$g2568$.getGlobalValue();
    }
    
    public static SubLObject f17884() {
        return module0271.$g2569$.getGlobalValue();
    }
    
    public static SubLObject f17885(final SubLObject var8, SubLObject var9) {
        if (var9 == module0271.UNPROVIDED) {
            var9 = (SubLObject)module0271.ZERO_INTEGER;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        module0271.$g2567$.setGlobalValue((SubLObject)module0271.ZERO_INTEGER);
        module0271.$g2568$.setGlobalValue((SubLObject)module0271.ZERO_INTEGER);
        final SubLObject var12;
        final SubLObject var11 = var12 = module0034.f1854((SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED);
        final SubLObject var13 = module0034.$g879$.currentBinding(var10);
        try {
            module0034.$g879$.bind(var12, var10);
            SubLObject var14 = (SubLObject)module0271.NIL;
            if (module0271.NIL != var12 && module0271.NIL == module0034.f1842(var12)) {
                var14 = module0034.f1869(var12);
                final SubLObject var15 = Threads.current_process();
                if (module0271.NIL == var14) {
                    module0034.f1873(var12, var15);
                }
                else if (!var14.eql(var15)) {
                    Errors.error((SubLObject)module0271.$ic7$);
                }
            }
            try {
                SubLObject var16 = module0139.f9019((SubLObject)module0271.TEN_INTEGER);
                final SubLObject var12_16 = module0139.$g1632$.currentBinding(var10);
                final SubLObject var17 = module0139.$g1630$.currentBinding(var10);
                final SubLObject var18 = module0139.$g1631$.currentBinding(var10);
                try {
                    module0139.$g1632$.bind(var16, var10);
                    module0139.$g1630$.bind((SubLObject)module0271.T, var10);
                    module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var10)), var10);
                    final SubLObject var19 = assertion_handles_oc.f11010();
                    final SubLObject var20 = (SubLObject)module0271.$ic8$;
                    final SubLObject var21 = module0065.f4733(var19);
                    SubLObject var22 = (SubLObject)module0271.ZERO_INTEGER;
                    assert module0271.NIL != Types.stringp(var20) : var20;
                    final SubLObject var12_17 = module0012.$g75$.currentBinding(var10);
                    final SubLObject var17_24 = module0012.$g76$.currentBinding(var10);
                    final SubLObject var18_25 = module0012.$g77$.currentBinding(var10);
                    final SubLObject var23 = module0012.$g78$.currentBinding(var10);
                    try {
                        module0012.$g75$.bind((SubLObject)module0271.ZERO_INTEGER, var10);
                        module0012.$g76$.bind((SubLObject)module0271.NIL, var10);
                        module0012.$g77$.bind((SubLObject)module0271.T, var10);
                        module0012.$g78$.bind(Time.get_universal_time(), var10);
                        module0012.f478(var20);
                        final SubLObject var27_28 = var19;
                        if (module0271.NIL == module0065.f4772(var27_28, (SubLObject)module0271.$ic10$)) {
                            final SubLObject var29_30 = var27_28;
                            if (module0271.NIL == module0065.f4775(var29_30, (SubLObject)module0271.$ic10$)) {
                                final SubLObject var24 = module0065.f4740(var29_30);
                                final SubLObject var25 = (SubLObject)module0271.NIL;
                                SubLObject var26;
                                SubLObject var27;
                                SubLObject var28;
                                SubLObject var29;
                                for (var26 = Sequences.length(var24), var27 = (SubLObject)module0271.NIL, var27 = (SubLObject)module0271.ZERO_INTEGER; var27.numL(var26); var27 = Numbers.add(var27, (SubLObject)module0271.ONE_INTEGER)) {
                                    var28 = ((module0271.NIL != var25) ? Numbers.subtract(var26, var27, (SubLObject)module0271.ONE_INTEGER) : var27);
                                    var29 = Vectors.aref(var24, var28);
                                    if (module0271.NIL == module0065.f4749(var29) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                        if (module0271.NIL != module0065.f4749(var29)) {
                                            var29 = (SubLObject)module0271.$ic10$;
                                        }
                                        module0012.note_percent_progress(var22, var21);
                                        var22 = Numbers.add(var22, (SubLObject)module0271.ONE_INTEGER);
                                        if (assertion_handles_oc.f11025(var29).numGE(var9) && module0271.NIL != module0147.f9556(var29, var8) && module0271.NIL != f17865(var29)) {
                                            module0271.$g2566$.setGlobalValue((SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var29), module0271.$g2566$.getGlobalValue()));
                                        }
                                        module0271.$g2568$.setGlobalValue(assertion_handles_oc.f11025(var29));
                                        module0271.$g2567$.setGlobalValue(Numbers.add(module0271.$g2567$.getGlobalValue(), (SubLObject)module0271.ONE_INTEGER));
                                    }
                                }
                            }
                            final SubLObject var37_38 = var27_28;
                            if (module0271.NIL == module0065.f4777(var37_38) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                final SubLObject var30 = module0065.f4738(var37_38);
                                SubLObject var31 = module0065.f4739(var37_38);
                                final SubLObject var32 = module0065.f4734(var37_38);
                                final SubLObject var33 = (SubLObject)((module0271.NIL != module0065.f4773((SubLObject)module0271.$ic10$)) ? module0271.NIL : module0271.$ic10$);
                                while (var31.numL(var32)) {
                                    final SubLObject var34 = Hashtables.gethash_without_values(var31, var30, var33);
                                    if (module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$) || module0271.NIL == module0065.f4749(var34)) {
                                        module0012.note_percent_progress(var22, var21);
                                        var22 = Numbers.add(var22, (SubLObject)module0271.ONE_INTEGER);
                                        if (assertion_handles_oc.f11025(var34).numGE(var9) && module0271.NIL != module0147.f9556(var34, var8) && module0271.NIL != f17865(var34)) {
                                            module0271.$g2566$.setGlobalValue((SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var34), module0271.$g2566$.getGlobalValue()));
                                        }
                                        module0271.$g2568$.setGlobalValue(assertion_handles_oc.f11025(var34));
                                        module0271.$g2567$.setGlobalValue(Numbers.add(module0271.$g2567$.getGlobalValue(), (SubLObject)module0271.ONE_INTEGER));
                                    }
                                    var31 = Numbers.add(var31, (SubLObject)module0271.ONE_INTEGER);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var23, var10);
                        module0012.$g77$.rebind(var18_25, var10);
                        module0012.$g76$.rebind(var17_24, var10);
                        module0012.$g75$.rebind(var12_17, var10);
                    }
                    var16 = module0139.$g1632$.getDynamicValue(var10);
                }
                finally {
                    module0139.$g1631$.rebind(var18, var10);
                    module0139.$g1630$.rebind(var17, var10);
                    module0139.$g1632$.rebind(var12_16, var10);
                }
            }
            finally {
                final SubLObject var12_18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var10);
                    if (module0271.NIL != var12 && module0271.NIL == var14) {
                        module0034.f1873(var12, (SubLObject)module0271.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_18, var10);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var13, var10);
        }
        return module0271.$g2566$.getGlobalValue();
    }
    
    public static SubLObject f17886(SubLObject var9) {
        if (var9 == module0271.UNPROVIDED) {
            var9 = (SubLObject)module0271.ZERO_INTEGER;
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        module0271.$g2567$.setGlobalValue((SubLObject)module0271.ZERO_INTEGER);
        module0271.$g2568$.setGlobalValue((SubLObject)module0271.ZERO_INTEGER);
        final SubLObject var12;
        final SubLObject var11 = var12 = module0034.f1854((SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED);
        final SubLObject var13 = module0034.$g879$.currentBinding(var10);
        try {
            module0034.$g879$.bind(var12, var10);
            SubLObject var14 = (SubLObject)module0271.NIL;
            if (module0271.NIL != var12 && module0271.NIL == module0034.f1842(var12)) {
                var14 = module0034.f1869(var12);
                final SubLObject var15 = Threads.current_process();
                if (module0271.NIL == var14) {
                    module0034.f1873(var12, var15);
                }
                else if (!var14.eql(var15)) {
                    Errors.error((SubLObject)module0271.$ic7$);
                }
            }
            try {
                SubLObject var16 = module0139.f9019((SubLObject)module0271.TEN_INTEGER);
                final SubLObject var12_43 = module0139.$g1632$.currentBinding(var10);
                final SubLObject var17 = module0139.$g1630$.currentBinding(var10);
                final SubLObject var18 = module0139.$g1631$.currentBinding(var10);
                try {
                    module0139.$g1632$.bind(var16, var10);
                    module0139.$g1630$.bind((SubLObject)module0271.T, var10);
                    module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var10)), var10);
                    final SubLObject var19 = assertion_handles_oc.f11010();
                    final SubLObject var20 = (SubLObject)module0271.$ic8$;
                    final SubLObject var21 = module0065.f4733(var19);
                    SubLObject var22 = (SubLObject)module0271.ZERO_INTEGER;
                    assert module0271.NIL != Types.stringp(var20) : var20;
                    final SubLObject var12_44 = module0012.$g75$.currentBinding(var10);
                    final SubLObject var17_45 = module0012.$g76$.currentBinding(var10);
                    final SubLObject var18_46 = module0012.$g77$.currentBinding(var10);
                    final SubLObject var23 = module0012.$g78$.currentBinding(var10);
                    try {
                        module0012.$g75$.bind((SubLObject)module0271.ZERO_INTEGER, var10);
                        module0012.$g76$.bind((SubLObject)module0271.NIL, var10);
                        module0012.$g77$.bind((SubLObject)module0271.T, var10);
                        module0012.$g78$.bind(Time.get_universal_time(), var10);
                        module0012.f478(var20);
                        final SubLObject var27_47 = var19;
                        if (module0271.NIL == module0065.f4772(var27_47, (SubLObject)module0271.$ic10$)) {
                            final SubLObject var29_48 = var27_47;
                            if (module0271.NIL == module0065.f4775(var29_48, (SubLObject)module0271.$ic10$)) {
                                final SubLObject var24 = module0065.f4740(var29_48);
                                final SubLObject var25 = (SubLObject)module0271.NIL;
                                SubLObject var26;
                                SubLObject var27;
                                SubLObject var28;
                                SubLObject var29;
                                SubLObject var30;
                                SubLObject var12_45;
                                for (var26 = Sequences.length(var24), var27 = (SubLObject)module0271.NIL, var27 = (SubLObject)module0271.ZERO_INTEGER; var27.numL(var26); var27 = Numbers.add(var27, (SubLObject)module0271.ONE_INTEGER)) {
                                    var28 = ((module0271.NIL != var25) ? Numbers.subtract(var26, var27, (SubLObject)module0271.ONE_INTEGER) : var27);
                                    var29 = Vectors.aref(var24, var28);
                                    if (module0271.NIL == module0065.f4749(var29) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                        if (module0271.NIL != module0065.f4749(var29)) {
                                            var29 = (SubLObject)module0271.$ic10$;
                                        }
                                        module0012.note_percent_progress(var22, var21);
                                        var22 = Numbers.add(var22, (SubLObject)module0271.ONE_INTEGER);
                                        if (assertion_handles_oc.f11025(var29).numGE(var9)) {
                                            var30 = (SubLObject)module0271.NIL;
                                            try {
                                                var10.throwStack.push(module0003.$g3$.getGlobalValue());
                                                var12_45 = Errors.$error_handler$.currentBinding(var10);
                                                try {
                                                    Errors.$error_handler$.bind((SubLObject)module0271.$ic11$, var10);
                                                    try {
                                                        if (module0271.NIL != f17865(var29)) {
                                                            module0271.$g2566$.setGlobalValue((SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var29), module0271.$g2566$.getGlobalValue()));
                                                        }
                                                    }
                                                    catch (Throwable var31) {
                                                        Errors.handleThrowable(var31, (SubLObject)module0271.NIL);
                                                    }
                                                }
                                                finally {
                                                    Errors.$error_handler$.rebind(var12_45, var10);
                                                }
                                            }
                                            catch (Throwable var32) {
                                                var30 = Errors.handleThrowable(var32, module0003.$g3$.getGlobalValue());
                                            }
                                            finally {
                                                var10.throwStack.pop();
                                            }
                                            if (module0271.NIL != var30) {
                                                module0271.$g2570$.setGlobalValue((SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var29), module0271.$g2570$.getGlobalValue()));
                                            }
                                        }
                                        module0271.$g2568$.setGlobalValue(assertion_handles_oc.f11025(var29));
                                        module0271.$g2567$.setGlobalValue(Numbers.add(module0271.$g2567$.getGlobalValue(), (SubLObject)module0271.ONE_INTEGER));
                                    }
                                }
                            }
                            final SubLObject var37_53 = var27_47;
                            if (module0271.NIL == module0065.f4777(var37_53) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                final SubLObject var33 = module0065.f4738(var37_53);
                                SubLObject var34 = module0065.f4739(var37_53);
                                final SubLObject var35 = module0065.f4734(var37_53);
                                final SubLObject var36 = (SubLObject)((module0271.NIL != module0065.f4773((SubLObject)module0271.$ic10$)) ? module0271.NIL : module0271.$ic10$);
                                while (var34.numL(var35)) {
                                    final SubLObject var37 = Hashtables.gethash_without_values(var34, var33, var36);
                                    if (module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$) || module0271.NIL == module0065.f4749(var37)) {
                                        module0012.note_percent_progress(var22, var21);
                                        var22 = Numbers.add(var22, (SubLObject)module0271.ONE_INTEGER);
                                        if (assertion_handles_oc.f11025(var37).numGE(var9)) {
                                            SubLObject var38 = (SubLObject)module0271.NIL;
                                            try {
                                                var10.throwStack.push(module0003.$g3$.getGlobalValue());
                                                final SubLObject var12_46 = Errors.$error_handler$.currentBinding(var10);
                                                try {
                                                    Errors.$error_handler$.bind((SubLObject)module0271.$ic11$, var10);
                                                    try {
                                                        if (module0271.NIL != f17865(var37)) {
                                                            module0271.$g2566$.setGlobalValue((SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var37), module0271.$g2566$.getGlobalValue()));
                                                        }
                                                    }
                                                    catch (Throwable var39) {
                                                        Errors.handleThrowable(var39, (SubLObject)module0271.NIL);
                                                    }
                                                }
                                                finally {
                                                    Errors.$error_handler$.rebind(var12_46, var10);
                                                }
                                            }
                                            catch (Throwable var40) {
                                                var38 = Errors.handleThrowable(var40, module0003.$g3$.getGlobalValue());
                                            }
                                            finally {
                                                var10.throwStack.pop();
                                            }
                                            if (module0271.NIL != var38) {
                                                module0271.$g2570$.setGlobalValue((SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var37), module0271.$g2570$.getGlobalValue()));
                                            }
                                        }
                                        module0271.$g2568$.setGlobalValue(assertion_handles_oc.f11025(var37));
                                        module0271.$g2567$.setGlobalValue(Numbers.add(module0271.$g2567$.getGlobalValue(), (SubLObject)module0271.ONE_INTEGER));
                                    }
                                    var34 = Numbers.add(var34, (SubLObject)module0271.ONE_INTEGER);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var23, var10);
                        module0012.$g77$.rebind(var18_46, var10);
                        module0012.$g76$.rebind(var17_45, var10);
                        module0012.$g75$.rebind(var12_44, var10);
                    }
                    var16 = module0139.$g1632$.getDynamicValue(var10);
                }
                finally {
                    module0139.$g1631$.rebind(var18, var10);
                    module0139.$g1630$.rebind(var17, var10);
                    module0139.$g1632$.rebind(var12_43, var10);
                }
            }
            finally {
                final SubLObject var12_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var10);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var10);
                    if (module0271.NIL != var12 && module0271.NIL == var14) {
                        module0034.f1873(var12, (SubLObject)module0271.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_47, var10);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var13, var10);
        }
        return module0271.$g2566$.getGlobalValue();
    }
    
    public static SubLObject f17887(final SubLObject var9, final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        module0271.$g2566$.setGlobalValue((SubLObject)module0271.NIL);
        module0271.$g2567$.setGlobalValue((SubLObject)module0271.ZERO_INTEGER);
        module0271.$g2568$.setGlobalValue((SubLObject)module0271.ZERO_INTEGER);
        module0271.$g2569$.setGlobalValue((SubLObject)module0271.NIL);
        SubLObject var58 = (SubLObject)module0271.NIL;
        SubLObject var59 = (SubLObject)module0271.NIL;
        final SubLObject var60 = PrintLow.format((SubLObject)module0271.NIL, (SubLObject)module0271.$ic12$, var9, var56);
        try {
            var57.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var61 = Errors.$error_handler$.currentBinding(var57);
            try {
                Errors.$error_handler$.bind((SubLObject)module0271.$ic11$, var57);
                try {
                    final SubLObject var63;
                    final SubLObject var62 = var63 = module0034.f1854((SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED);
                    final SubLObject var12_59 = module0034.$g879$.currentBinding(var57);
                    try {
                        module0034.$g879$.bind(var63, var57);
                        SubLObject var64 = (SubLObject)module0271.NIL;
                        if (module0271.NIL != var63 && module0271.NIL == module0034.f1842(var63)) {
                            var64 = module0034.f1869(var63);
                            final SubLObject var65 = Threads.current_process();
                            if (module0271.NIL == var64) {
                                module0034.f1873(var63, var65);
                            }
                            else if (!var64.eql(var65)) {
                                Errors.error((SubLObject)module0271.$ic7$);
                            }
                        }
                        try {
                            SubLObject var66 = module0139.f9019((SubLObject)module0271.TEN_INTEGER);
                            final SubLObject var12_60 = module0139.$g1632$.currentBinding(var57);
                            final SubLObject var67 = module0139.$g1630$.currentBinding(var57);
                            final SubLObject var68 = module0139.$g1631$.currentBinding(var57);
                            try {
                                module0139.$g1632$.bind(var66, var57);
                                module0139.$g1630$.bind((SubLObject)module0271.T, var57);
                                module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var57)), var57);
                                final SubLObject var69 = assertion_handles_oc.f11010();
                                final SubLObject var70 = var60;
                                final SubLObject var71 = module0065.f4733(var69);
                                SubLObject var72 = (SubLObject)module0271.ZERO_INTEGER;
                                assert module0271.NIL != Types.stringp(var70) : var70;
                                final SubLObject var12_61 = module0012.$g75$.currentBinding(var57);
                                final SubLObject var17_62 = module0012.$g76$.currentBinding(var57);
                                final SubLObject var18_63 = module0012.$g77$.currentBinding(var57);
                                final SubLObject var73 = module0012.$g78$.currentBinding(var57);
                                try {
                                    module0012.$g75$.bind((SubLObject)module0271.ZERO_INTEGER, var57);
                                    module0012.$g76$.bind((SubLObject)module0271.NIL, var57);
                                    module0012.$g77$.bind((SubLObject)module0271.T, var57);
                                    module0012.$g78$.bind(Time.get_universal_time(), var57);
                                    module0012.f478(var70);
                                    final SubLObject var27_64 = var69;
                                    if (module0271.NIL == module0065.f4772(var27_64, (SubLObject)module0271.$ic10$)) {
                                        final SubLObject var29_65 = var27_64;
                                        if (module0271.NIL == module0065.f4775(var29_65, (SubLObject)module0271.$ic10$)) {
                                            final SubLObject var74 = module0065.f4740(var29_65);
                                            final SubLObject var75 = (SubLObject)module0271.NIL;
                                            final SubLObject var76 = Sequences.length(var74);
                                            SubLObject var78;
                                            final SubLObject var77 = var78 = (SubLObject)((module0271.NIL != var75) ? ConsesLow.list(Numbers.subtract(var76, (SubLObject)module0271.ONE_INTEGER), (SubLObject)module0271.MINUS_ONE_INTEGER, (SubLObject)module0271.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)module0271.ZERO_INTEGER, var76, (SubLObject)module0271.ONE_INTEGER));
                                            SubLObject var79 = (SubLObject)module0271.NIL;
                                            SubLObject var80 = (SubLObject)module0271.NIL;
                                            SubLObject var81 = (SubLObject)module0271.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)module0271.$ic13$);
                                            var79 = var78.first();
                                            var78 = var78.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)module0271.$ic13$);
                                            var80 = var78.first();
                                            var78 = var78.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var78, var77, (SubLObject)module0271.$ic13$);
                                            var81 = var78.first();
                                            var78 = var78.rest();
                                            if (module0271.NIL == var78) {
                                                if (module0271.NIL == var59) {
                                                    SubLObject var82;
                                                    SubLObject var83;
                                                    SubLObject var84;
                                                    for (var82 = var80, var83 = (SubLObject)module0271.NIL, var83 = var79; module0271.NIL == var59 && module0271.NIL == module0005.f124(var83, var81, var82); var83 = Numbers.add(var83, var81)) {
                                                        var84 = Vectors.aref(var74, var83);
                                                        if (module0271.NIL == module0065.f4749(var84) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                                            if (module0271.NIL != module0065.f4749(var84)) {
                                                                var84 = (SubLObject)module0271.$ic10$;
                                                            }
                                                            module0012.note_percent_progress(var72, var71);
                                                            var72 = Numbers.add(var72, (SubLObject)module0271.ONE_INTEGER);
                                                            if (assertion_handles_oc.f11025(var84).numGE(var9)) {
                                                                if (assertion_handles_oc.f11025(var84).numGE(var56)) {
                                                                    var59 = (SubLObject)module0271.T;
                                                                }
                                                                if (module0271.NIL != f17865(var84)) {
                                                                    module0271.$g2566$.setGlobalValue((SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var84), module0271.$g2566$.getGlobalValue()));
                                                                }
                                                                module0271.$g2567$.setGlobalValue(Numbers.add(module0271.$g2567$.getGlobalValue(), (SubLObject)module0271.ONE_INTEGER));
                                                            }
                                                            module0271.$g2568$.setGlobalValue(assertion_handles_oc.f11025(var84));
                                                        }
                                                    }
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(var77, (SubLObject)module0271.$ic13$);
                                            }
                                        }
                                        final SubLObject var37_72 = var27_64;
                                        if (module0271.NIL == module0065.f4777(var37_72) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                            final SubLObject var85 = module0065.f4738(var37_72);
                                            SubLObject var86 = module0065.f4739(var37_72);
                                            final SubLObject var87 = module0065.f4734(var37_72);
                                            final SubLObject var88 = (SubLObject)((module0271.NIL != module0065.f4773((SubLObject)module0271.$ic10$)) ? module0271.NIL : module0271.$ic10$);
                                            while (var86.numL(var87) && module0271.NIL == var59) {
                                                final SubLObject var89 = Hashtables.gethash_without_values(var86, var85, var88);
                                                if (module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$) || module0271.NIL == module0065.f4749(var89)) {
                                                    module0012.note_percent_progress(var72, var71);
                                                    var72 = Numbers.add(var72, (SubLObject)module0271.ONE_INTEGER);
                                                    if (assertion_handles_oc.f11025(var89).numGE(var9)) {
                                                        if (assertion_handles_oc.f11025(var89).numGE(var56)) {
                                                            var59 = (SubLObject)module0271.T;
                                                        }
                                                        if (module0271.NIL != f17865(var89)) {
                                                            module0271.$g2566$.setGlobalValue((SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var89), module0271.$g2566$.getGlobalValue()));
                                                        }
                                                        module0271.$g2567$.setGlobalValue(Numbers.add(module0271.$g2567$.getGlobalValue(), (SubLObject)module0271.ONE_INTEGER));
                                                    }
                                                    module0271.$g2568$.setGlobalValue(assertion_handles_oc.f11025(var89));
                                                }
                                                var86 = Numbers.add(var86, (SubLObject)module0271.ONE_INTEGER);
                                            }
                                        }
                                    }
                                    module0012.f479();
                                }
                                finally {
                                    module0012.$g78$.rebind(var73, var57);
                                    module0012.$g77$.rebind(var18_63, var57);
                                    module0012.$g76$.rebind(var17_62, var57);
                                    module0012.$g75$.rebind(var12_61, var57);
                                }
                                var66 = module0139.$g1632$.getDynamicValue(var57);
                            }
                            finally {
                                module0139.$g1631$.rebind(var68, var57);
                                module0139.$g1630$.rebind(var67, var57);
                                module0139.$g1632$.rebind(var12_60, var57);
                            }
                        }
                        finally {
                            final SubLObject var12_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var57);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var57);
                                if (module0271.NIL != var63 && module0271.NIL == var64) {
                                    module0034.f1873(var63, (SubLObject)module0271.NIL);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var12_62, var57);
                            }
                        }
                    }
                    finally {
                        module0034.$g879$.rebind(var12_59, var57);
                    }
                }
                catch (Throwable var90) {
                    Errors.handleThrowable(var90, (SubLObject)module0271.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var61, var57);
            }
        }
        catch (Throwable var91) {
            var58 = Errors.handleThrowable(var91, module0003.$g3$.getGlobalValue());
        }
        finally {
            var57.throwStack.pop();
        }
        if (module0271.NIL != var58) {
            module0271.$g2569$.setGlobalValue(var58);
        }
        return module0271.$g2566$.getGlobalValue();
    }
    
    public static SubLObject f17888(final SubLObject var74, final SubLObject var75) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        final SubLObject var77 = module0202.f12768(module0271.$ic16$, var74, var75);
        if (module0271.NIL == Errors.$ignore_mustsP$.getDynamicValue(var76) && module0271.NIL == module0217.f14423(var77)) {
            Errors.error((SubLObject)module0271.$ic17$, var74, var75);
        }
        module0538.f33400(var77, module0132.$g1548$.getGlobalValue());
        SubLObject var78 = (SubLObject)module0271.NIL;
        var78 = conses_high.set_difference(module0262.f17312(var74, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED), module0262.f17312(var75, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED), (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED);
        module0538.f33349(var77, module0132.$g1548$.getGlobalValue(), (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED);
        return var78;
    }
    
    public static SubLObject f17889() {
        SubLObject var77 = (SubLObject)module0271.ZERO_INTEGER;
        SubLObject var78 = (SubLObject)module0271.NIL;
        SubLObject var79 = (SubLObject)module0271.NIL;
        final Iterator var80 = Hashtables.getEntrySetIterator(module0271.$g2571$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var80)) {
                final Map.Entry var81 = Hashtables.iteratorNextEntry(var80);
                var78 = Hashtables.getEntryKey(var81);
                var79 = Hashtables.getEntryValue(var81);
                if (module0271.NIL == var79) {
                    var77 = Numbers.add(var77, (SubLObject)module0271.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var80);
        }
        return var77;
    }
    
    public static SubLObject f17890() {
        SubLObject var77 = (SubLObject)module0271.ZERO_INTEGER;
        SubLObject var78 = (SubLObject)module0271.NIL;
        SubLObject var79 = (SubLObject)module0271.NIL;
        final Iterator var80 = Hashtables.getEntrySetIterator(module0271.$g2571$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var80)) {
                final Map.Entry var81 = Hashtables.iteratorNextEntry(var80);
                var78 = Hashtables.getEntryKey(var81);
                var79 = Hashtables.getEntryValue(var81);
                if (module0271.NIL != var79) {
                    var77 = Numbers.add(var77, (SubLObject)module0271.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var80);
        }
        return var77;
    }
    
    public static SubLObject f17891() {
        return Numbers.multiply((SubLObject)module0271.$ic18$, Numbers.divide(f17890(), Hashtables.hash_table_count(module0271.$g2571$.getGlobalValue())));
    }
    
    public static SubLObject f17892() {
        SubLObject var77 = (SubLObject)module0271.ZERO_INTEGER;
        SubLObject var78 = (SubLObject)module0271.NIL;
        SubLObject var79 = (SubLObject)module0271.NIL;
        final Iterator var80 = Hashtables.getEntrySetIterator(module0271.$g2572$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var80)) {
                final Map.Entry var81 = Hashtables.iteratorNextEntry(var80);
                var78 = Hashtables.getEntryKey(var81);
                var79 = Hashtables.getEntryValue(var81);
                if (module0271.NIL == var79) {
                    var77 = Numbers.add(var77, (SubLObject)module0271.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var80);
        }
        return var77;
    }
    
    public static SubLObject f17893() {
        SubLObject var77 = (SubLObject)module0271.ZERO_INTEGER;
        SubLObject var78 = (SubLObject)module0271.NIL;
        SubLObject var79 = (SubLObject)module0271.NIL;
        final Iterator var80 = Hashtables.getEntrySetIterator(module0271.$g2572$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var80)) {
                final Map.Entry var81 = Hashtables.iteratorNextEntry(var80);
                var78 = Hashtables.getEntryKey(var81);
                var79 = Hashtables.getEntryValue(var81);
                if (module0271.NIL != var79) {
                    var77 = Numbers.add(var77, (SubLObject)module0271.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var80);
        }
        return var77;
    }
    
    public static SubLObject f17894() {
        return Numbers.multiply((SubLObject)module0271.$ic18$, Numbers.divide(f17893(), Hashtables.hash_table_count(module0271.$g2572$.getGlobalValue())));
    }
    
    public static SubLObject f17895(final SubLObject var8, SubLObject var82, SubLObject var9, SubLObject var56) {
        if (var82 == module0271.UNPROVIDED) {
            var82 = (SubLObject)module0271.T;
        }
        if (var9 == module0271.UNPROVIDED) {
            var9 = (SubLObject)module0271.ZERO_INTEGER;
        }
        if (var56 == module0271.UNPROVIDED) {
            var56 = (SubLObject)module0271.NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        if (module0271.NIL != var82) {
            module0271.$g2571$.setGlobalValue(Hashtables.make_hash_table((SubLObject)module0271.$ic19$, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED));
        }
        final SubLObject var85;
        final SubLObject var84 = var85 = module0034.f1854((SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED);
        final SubLObject var86 = module0034.$g879$.currentBinding(var83);
        try {
            module0034.$g879$.bind(var85, var83);
            SubLObject var87 = (SubLObject)module0271.NIL;
            if (module0271.NIL != var85 && module0271.NIL == module0034.f1842(var85)) {
                var87 = module0034.f1869(var85);
                final SubLObject var88 = Threads.current_process();
                if (module0271.NIL == var87) {
                    module0034.f1873(var85, var88);
                }
                else if (!var87.eql(var88)) {
                    Errors.error((SubLObject)module0271.$ic7$);
                }
            }
            try {
                SubLObject var89 = module0139.f9019((SubLObject)module0271.TEN_INTEGER);
                final SubLObject var12_83 = module0139.$g1632$.currentBinding(var83);
                final SubLObject var90 = module0139.$g1630$.currentBinding(var83);
                final SubLObject var91 = module0139.$g1631$.currentBinding(var83);
                try {
                    module0139.$g1632$.bind(var89, var83);
                    module0139.$g1630$.bind((SubLObject)module0271.T, var83);
                    module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var83)), var83);
                    final SubLObject var92 = assertion_handles_oc.f11010();
                    final SubLObject var93 = (SubLObject)module0271.$ic8$;
                    final SubLObject var94 = module0065.f4733(var92);
                    SubLObject var95 = (SubLObject)module0271.ZERO_INTEGER;
                    assert module0271.NIL != Types.stringp(var93) : var93;
                    final SubLObject var12_84 = module0012.$g75$.currentBinding(var83);
                    final SubLObject var17_85 = module0012.$g76$.currentBinding(var83);
                    final SubLObject var18_86 = module0012.$g77$.currentBinding(var83);
                    final SubLObject var96 = module0012.$g78$.currentBinding(var83);
                    try {
                        module0012.$g75$.bind((SubLObject)module0271.ZERO_INTEGER, var83);
                        module0012.$g76$.bind((SubLObject)module0271.NIL, var83);
                        module0012.$g77$.bind((SubLObject)module0271.T, var83);
                        module0012.$g78$.bind(Time.get_universal_time(), var83);
                        module0012.f478(var93);
                        final SubLObject var27_87 = var92;
                        if (module0271.NIL == module0065.f4772(var27_87, (SubLObject)module0271.$ic10$)) {
                            final SubLObject var29_88 = var27_87;
                            if (module0271.NIL == module0065.f4775(var29_88, (SubLObject)module0271.$ic10$)) {
                                final SubLObject var97 = module0065.f4740(var29_88);
                                final SubLObject var98 = (SubLObject)module0271.NIL;
                                SubLObject var99;
                                SubLObject var100;
                                SubLObject var101;
                                SubLObject var102;
                                for (var99 = Sequences.length(var97), var100 = (SubLObject)module0271.NIL, var100 = (SubLObject)module0271.ZERO_INTEGER; var100.numL(var99); var100 = Numbers.add(var100, (SubLObject)module0271.ONE_INTEGER)) {
                                    var101 = ((module0271.NIL != var98) ? Numbers.subtract(var99, var100, (SubLObject)module0271.ONE_INTEGER) : var100);
                                    var102 = Vectors.aref(var97, var101);
                                    if (module0271.NIL == module0065.f4749(var102) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                        if (module0271.NIL != module0065.f4749(var102)) {
                                            var102 = (SubLObject)module0271.$ic10$;
                                        }
                                        module0012.note_percent_progress(var95, var94);
                                        var95 = Numbers.add(var95, (SubLObject)module0271.ONE_INTEGER);
                                        if (assertion_handles_oc.f11025(var102).numGE(var9) && module0271.NIL != module0147.f9556(var102, var8) && (module0271.NIL == var56 || assertion_handles_oc.f11025(var102).numLE(var56))) {
                                            Hashtables.sethash(assertion_handles_oc.f11025(var102), module0271.$g2571$.getGlobalValue(), f17865(var102));
                                        }
                                    }
                                }
                            }
                            final SubLObject var37_89 = var27_87;
                            if (module0271.NIL == module0065.f4777(var37_89) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                final SubLObject var103 = module0065.f4738(var37_89);
                                SubLObject var104 = module0065.f4739(var37_89);
                                final SubLObject var105 = module0065.f4734(var37_89);
                                final SubLObject var106 = (SubLObject)((module0271.NIL != module0065.f4773((SubLObject)module0271.$ic10$)) ? module0271.NIL : module0271.$ic10$);
                                while (var104.numL(var105)) {
                                    final SubLObject var107 = Hashtables.gethash_without_values(var104, var103, var106);
                                    if (module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$) || module0271.NIL == module0065.f4749(var107)) {
                                        module0012.note_percent_progress(var95, var94);
                                        var95 = Numbers.add(var95, (SubLObject)module0271.ONE_INTEGER);
                                        if (assertion_handles_oc.f11025(var107).numGE(var9) && module0271.NIL != module0147.f9556(var107, var8) && (module0271.NIL == var56 || assertion_handles_oc.f11025(var107).numLE(var56))) {
                                            Hashtables.sethash(assertion_handles_oc.f11025(var107), module0271.$g2571$.getGlobalValue(), f17865(var107));
                                        }
                                    }
                                    var104 = Numbers.add(var104, (SubLObject)module0271.ONE_INTEGER);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var96, var83);
                        module0012.$g77$.rebind(var18_86, var83);
                        module0012.$g76$.rebind(var17_85, var83);
                        module0012.$g75$.rebind(var12_84, var83);
                    }
                    var89 = module0139.$g1632$.getDynamicValue(var83);
                }
                finally {
                    module0139.$g1631$.rebind(var91, var83);
                    module0139.$g1630$.rebind(var90, var83);
                    module0139.$g1632$.rebind(var12_83, var83);
                }
            }
            finally {
                final SubLObject var12_85 = Threads.$is_thread_performing_cleanupP$.currentBinding(var83);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var83);
                    if (module0271.NIL != var85 && module0271.NIL == var87) {
                        module0034.f1873(var85, (SubLObject)module0271.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_85, var83);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var86, var83);
        }
        return module0271.$g2571$.getGlobalValue();
    }
    
    public static SubLObject f17896(final SubLObject var8, SubLObject var82, SubLObject var9, SubLObject var56) {
        if (var82 == module0271.UNPROVIDED) {
            var82 = (SubLObject)module0271.T;
        }
        if (var9 == module0271.UNPROVIDED) {
            var9 = (SubLObject)module0271.ZERO_INTEGER;
        }
        if (var56 == module0271.UNPROVIDED) {
            var56 = (SubLObject)module0271.NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        if (module0271.NIL != var82) {
            module0271.$g2572$.setGlobalValue(Hashtables.make_hash_table((SubLObject)module0271.$ic19$, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED));
        }
        final SubLObject var85;
        final SubLObject var84 = var85 = module0034.f1854((SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED);
        final SubLObject var86 = module0034.$g879$.currentBinding(var83);
        try {
            module0034.$g879$.bind(var85, var83);
            SubLObject var87 = (SubLObject)module0271.NIL;
            if (module0271.NIL != var85 && module0271.NIL == module0034.f1842(var85)) {
                var87 = module0034.f1869(var85);
                final SubLObject var88 = Threads.current_process();
                if (module0271.NIL == var87) {
                    module0034.f1873(var85, var88);
                }
                else if (!var87.eql(var88)) {
                    Errors.error((SubLObject)module0271.$ic7$);
                }
            }
            try {
                SubLObject var89 = module0139.f9019((SubLObject)module0271.TEN_INTEGER);
                final SubLObject var12_91 = module0139.$g1632$.currentBinding(var83);
                final SubLObject var90 = module0139.$g1630$.currentBinding(var83);
                final SubLObject var91 = module0139.$g1631$.currentBinding(var83);
                try {
                    module0139.$g1632$.bind(var89, var83);
                    module0139.$g1630$.bind((SubLObject)module0271.T, var83);
                    module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var83)), var83);
                    final SubLObject var92 = assertion_handles_oc.f11010();
                    final SubLObject var93 = (SubLObject)module0271.$ic8$;
                    final SubLObject var94 = module0065.f4733(var92);
                    SubLObject var95 = (SubLObject)module0271.ZERO_INTEGER;
                    assert module0271.NIL != Types.stringp(var93) : var93;
                    final SubLObject var12_92 = module0012.$g75$.currentBinding(var83);
                    final SubLObject var17_93 = module0012.$g76$.currentBinding(var83);
                    final SubLObject var18_94 = module0012.$g77$.currentBinding(var83);
                    final SubLObject var96 = module0012.$g78$.currentBinding(var83);
                    try {
                        module0012.$g75$.bind((SubLObject)module0271.ZERO_INTEGER, var83);
                        module0012.$g76$.bind((SubLObject)module0271.NIL, var83);
                        module0012.$g77$.bind((SubLObject)module0271.T, var83);
                        module0012.$g78$.bind(Time.get_universal_time(), var83);
                        module0012.f478(var93);
                        final SubLObject var27_95 = var92;
                        if (module0271.NIL == module0065.f4772(var27_95, (SubLObject)module0271.$ic10$)) {
                            final SubLObject var29_96 = var27_95;
                            if (module0271.NIL == module0065.f4775(var29_96, (SubLObject)module0271.$ic10$)) {
                                final SubLObject var97 = module0065.f4740(var29_96);
                                final SubLObject var98 = (SubLObject)module0271.NIL;
                                SubLObject var99;
                                SubLObject var100;
                                SubLObject var101;
                                SubLObject var102;
                                for (var99 = Sequences.length(var97), var100 = (SubLObject)module0271.NIL, var100 = (SubLObject)module0271.ZERO_INTEGER; var100.numL(var99); var100 = Numbers.add(var100, (SubLObject)module0271.ONE_INTEGER)) {
                                    var101 = ((module0271.NIL != var98) ? Numbers.subtract(var99, var100, (SubLObject)module0271.ONE_INTEGER) : var100);
                                    var102 = Vectors.aref(var97, var101);
                                    if (module0271.NIL == module0065.f4749(var102) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                        if (module0271.NIL != module0065.f4749(var102)) {
                                            var102 = (SubLObject)module0271.$ic10$;
                                        }
                                        module0012.note_percent_progress(var95, var94);
                                        var95 = Numbers.add(var95, (SubLObject)module0271.ONE_INTEGER);
                                        if (assertion_handles_oc.f11025(var102).numGE(var9) && module0271.NIL != module0147.f9556(var102, var8) && (module0271.NIL == var56 || assertion_handles_oc.f11025(var102).numLE(var56))) {
                                            Hashtables.sethash(assertion_handles_oc.f11025(var102), module0271.$g2572$.getGlobalValue(), f17865(var102));
                                        }
                                    }
                                }
                            }
                            final SubLObject var37_97 = var27_95;
                            if (module0271.NIL == module0065.f4777(var37_97) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                final SubLObject var103 = module0065.f4738(var37_97);
                                SubLObject var104 = module0065.f4739(var37_97);
                                final SubLObject var105 = module0065.f4734(var37_97);
                                final SubLObject var106 = (SubLObject)((module0271.NIL != module0065.f4773((SubLObject)module0271.$ic10$)) ? module0271.NIL : module0271.$ic10$);
                                while (var104.numL(var105)) {
                                    final SubLObject var107 = Hashtables.gethash_without_values(var104, var103, var106);
                                    if (module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$) || module0271.NIL == module0065.f4749(var107)) {
                                        module0012.note_percent_progress(var95, var94);
                                        var95 = Numbers.add(var95, (SubLObject)module0271.ONE_INTEGER);
                                        if (assertion_handles_oc.f11025(var107).numGE(var9) && module0271.NIL != module0147.f9556(var107, var8) && (module0271.NIL == var56 || assertion_handles_oc.f11025(var107).numLE(var56))) {
                                            Hashtables.sethash(assertion_handles_oc.f11025(var107), module0271.$g2572$.getGlobalValue(), f17865(var107));
                                        }
                                    }
                                    var104 = Numbers.add(var104, (SubLObject)module0271.ONE_INTEGER);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var96, var83);
                        module0012.$g77$.rebind(var18_94, var83);
                        module0012.$g76$.rebind(var17_93, var83);
                        module0012.$g75$.rebind(var12_92, var83);
                    }
                    var89 = module0139.$g1632$.getDynamicValue(var83);
                }
                finally {
                    module0139.$g1631$.rebind(var91, var83);
                    module0139.$g1630$.rebind(var90, var83);
                    module0139.$g1632$.rebind(var12_91, var83);
                }
            }
            finally {
                final SubLObject var12_93 = Threads.$is_thread_performing_cleanupP$.currentBinding(var83);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var83);
                    if (module0271.NIL != var85 && module0271.NIL == var87) {
                        module0034.f1873(var85, (SubLObject)module0271.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_93, var83);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var86, var83);
        }
        return module0271.$g2572$.getGlobalValue();
    }
    
    public static SubLObject f17897(final SubLObject var99) {
        SubLObject var100 = (SubLObject)module0271.ZERO_INTEGER;
        SubLObject var101 = (SubLObject)module0271.NIL;
        SubLObject var102 = (SubLObject)module0271.NIL;
        final Iterator var103 = Hashtables.getEntrySetIterator(var99);
        try {
            while (Hashtables.iteratorHasNext(var103)) {
                final Map.Entry var104 = Hashtables.iteratorNextEntry(var103);
                var101 = Hashtables.getEntryKey(var104);
                var102 = Hashtables.getEntryValue(var104);
                if (var101.numG(var100)) {
                    var100 = var101;
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var103);
        }
        return var100;
    }
    
    public static SubLObject f17898(SubLObject var102) {
        if (var102 == module0271.UNPROVIDED) {
            var102 = (SubLObject)module0271.T;
        }
        final SubLObject var103 = (module0271.NIL != var102) ? module0271.$g2572$.getGlobalValue() : module0271.$g2571$.getGlobalValue();
        final SubLObject var104 = (module0271.NIL != var102) ? module0271.$g2571$.getGlobalValue() : module0271.$g2572$.getGlobalValue();
        SubLObject var105 = (SubLObject)module0271.NIL;
        SubLObject var106 = (SubLObject)module0271.NIL;
        SubLObject var107 = (SubLObject)module0271.NIL;
        final Iterator var108 = Hashtables.getEntrySetIterator(var103);
        try {
            while (Hashtables.iteratorHasNext(var108)) {
                final Map.Entry var109 = Hashtables.iteratorNextEntry(var108);
                var106 = Hashtables.getEntryKey(var109);
                var107 = Hashtables.getEntryValue(var109);
                if (!var107.eql(Hashtables.gethash(var106, var104, (SubLObject)module0271.UNPROVIDED))) {
                    var105 = (SubLObject)ConsesLow.cons(var106, var105);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var108);
        }
        return var105;
    }
    
    public static SubLObject f17899(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0271.NIL != assertion_handles_oc.f11035(var1) : var1;
        final SubLObject var3 = assertion_handles_oc.f11025(var1);
        return module0035.sublisp_boolean(Hashtables.gethash(var3, module0271.$g2573$.getDynamicValue(var2), (SubLObject)module0271.UNPROVIDED));
    }
    
    public static SubLObject f17900(final SubLObject var1, SubLObject var108) {
        if (var108 == module0271.UNPROVIDED) {
            var108 = module0574.f35164();
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        assert module0271.NIL != assertion_handles_oc.f11035(var1) : var1;
        final SubLObject var110 = assertion_handles_oc.f11025(var1);
        return Hashtables.sethash(var110, module0271.$g2573$.getDynamicValue(var109), var108);
    }
    
    public static SubLObject f17901(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0271.NIL != assertion_handles_oc.f11035(var1) : var1;
        final SubLObject var3 = assertion_handles_oc.f11025(var1);
        return Hashtables.remhash(var3, module0271.$g2573$.getDynamicValue(var2));
    }
    
    public static SubLObject f17902() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return Hashtables.hash_table_count(module0271.$g2573$.getDynamicValue(var5));
    }
    
    public static SubLObject f17903(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert module0271.NIL != assertion_handles_oc.f11035(var1) : var1;
        final SubLObject var3 = assertion_handles_oc.f11025(var1);
        return Hashtables.gethash(var3, module0271.$g2573$.getDynamicValue(var2), (SubLObject)module0271.UNPROVIDED);
    }
    
    public static SubLObject f17904(final SubLObject var109, SubLObject var110) {
        if (var110 == module0271.UNPROVIDED) {
            var110 = (SubLObject)module0271.NIL;
        }
        final SubLThread var111 = SubLProcess.currentSubLThread();
        module0271.$g2575$.setGlobalValue((SubLObject)module0271.NIL);
        module0271.$g2574$.setGlobalValue(Time.get_universal_time());
        SubLObject var112 = (SubLObject)module0271.NIL;
        if (module0271.NIL != var110) {
            f17905(var109);
            SubLObject var113 = (SubLObject)module0271.ZERO_INTEGER;
            final SubLObject var114 = module0271.$g2573$.getDynamicValue(var111);
            module0012.$g82$.setDynamicValue((SubLObject)module0271.$ic25$, var111);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var111);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var114), var111);
            module0012.$g84$.setDynamicValue((SubLObject)module0271.ZERO_INTEGER, var111);
            final SubLObject var115 = module0012.$g75$.currentBinding(var111);
            final SubLObject var116 = module0012.$g76$.currentBinding(var111);
            final SubLObject var117 = module0012.$g77$.currentBinding(var111);
            final SubLObject var118 = module0012.$g78$.currentBinding(var111);
            try {
                module0012.$g75$.bind((SubLObject)module0271.ZERO_INTEGER, var111);
                module0012.$g76$.bind((SubLObject)module0271.NIL, var111);
                module0012.$g77$.bind((SubLObject)module0271.T, var111);
                module0012.$g78$.bind(Time.get_universal_time(), var111);
                module0012.f478(module0012.$g82$.getDynamicValue(var111));
                SubLObject var119 = (SubLObject)module0271.NIL;
                SubLObject var120 = (SubLObject)module0271.NIL;
                final Iterator var121 = Hashtables.getEntrySetIterator(var114);
                try {
                    while (Hashtables.iteratorHasNext(var121)) {
                        final Map.Entry var122 = Hashtables.iteratorNextEntry(var121);
                        var119 = Hashtables.getEntryKey(var122);
                        var120 = Hashtables.getEntryValue(var122);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var111), module0012.$g83$.getDynamicValue(var111));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var111), (SubLObject)module0271.ONE_INTEGER), var111);
                        if (var119.numG(var113)) {
                            var113 = var119;
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var121);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var118, var111);
                module0012.$g77$.rebind(var117, var111);
                module0012.$g76$.rebind(var116, var111);
                module0012.$g75$.rebind(var115, var111);
            }
            module0271.$g2568$.setGlobalValue(var113);
            var112 = Numbers.add((SubLObject)module0271.ONE_INTEGER, module0271.$g2568$.getGlobalValue());
            PrintLow.format((SubLObject)module0271.T, (SubLObject)module0271.$ic26$, var112);
            module0271.$g2567$.setGlobalValue((SubLObject)module0271.ZERO_INTEGER);
        }
        else {
            SubLObject var123 = (SubLObject)module0271.NIL;
            try {
                var123 = compatibility.open_text(var109, (SubLObject)module0271.$ic27$);
                if (!var123.isStream()) {
                    Errors.error((SubLObject)module0271.$ic28$, var109);
                }
                final SubLObject var116_117 = var123;
                PrintLow.format(var116_117, (SubLObject)module0271.$ic29$, module0271.$g2574$.getGlobalValue());
            }
            finally {
                final SubLObject var124 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var111);
                    if (var123.isStream()) {
                        streams_high.close(var123, (SubLObject)module0271.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var124, var111);
                }
            }
            Hashtables.clrhash(module0271.$g2573$.getDynamicValue(var111));
            module0271.$g2567$.setGlobalValue((SubLObject)module0271.ZERO_INTEGER);
            module0271.$g2568$.setGlobalValue((SubLObject)module0271.ZERO_INTEGER);
            var112 = (SubLObject)module0271.ZERO_INTEGER;
        }
        final SubLObject var125 = module0574.f35164();
        final SubLObject var127;
        final SubLObject var126 = var127 = module0034.f1854((SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED, (SubLObject)module0271.UNPROVIDED);
        final SubLObject var128 = module0034.$g879$.currentBinding(var111);
        try {
            module0034.$g879$.bind(var127, var111);
            SubLObject var129 = (SubLObject)module0271.NIL;
            if (module0271.NIL != var127 && module0271.NIL == module0034.f1842(var127)) {
                var129 = module0034.f1869(var127);
                final SubLObject var130 = Threads.current_process();
                if (module0271.NIL == var129) {
                    module0034.f1873(var127, var130);
                }
                else if (!var129.eql(var130)) {
                    Errors.error((SubLObject)module0271.$ic7$);
                }
            }
            try {
                SubLObject var131 = module0139.f9019((SubLObject)module0271.TEN_INTEGER);
                final SubLObject var12_118 = module0139.$g1632$.currentBinding(var111);
                final SubLObject var132 = module0139.$g1630$.currentBinding(var111);
                final SubLObject var133 = module0139.$g1631$.currentBinding(var111);
                try {
                    module0139.$g1632$.bind(var131, var111);
                    module0139.$g1630$.bind((SubLObject)module0271.T, var111);
                    module0139.$g1631$.bind(module0139.f9023(module0139.$g1632$.getDynamicValue(var111)), var111);
                    final SubLObject var134 = assertion_handles_oc.f11010();
                    final SubLObject var135 = (SubLObject)module0271.$ic8$;
                    final SubLObject var136 = module0065.f4733(var134);
                    SubLObject var137 = (SubLObject)module0271.ZERO_INTEGER;
                    assert module0271.NIL != Types.stringp(var135) : var135;
                    final SubLObject var12_119 = module0012.$g75$.currentBinding(var111);
                    final SubLObject var17_120 = module0012.$g76$.currentBinding(var111);
                    final SubLObject var18_121 = module0012.$g77$.currentBinding(var111);
                    final SubLObject var138 = module0012.$g78$.currentBinding(var111);
                    try {
                        module0012.$g75$.bind((SubLObject)module0271.ZERO_INTEGER, var111);
                        module0012.$g76$.bind((SubLObject)module0271.NIL, var111);
                        module0012.$g77$.bind((SubLObject)module0271.T, var111);
                        module0012.$g78$.bind(Time.get_universal_time(), var111);
                        module0012.f478(var135);
                        final SubLObject var27_122 = var134;
                        if (module0271.NIL == module0065.f4772(var27_122, (SubLObject)module0271.$ic10$)) {
                            final SubLObject var29_123 = var27_122;
                            if (module0271.NIL == module0065.f4775(var29_123, (SubLObject)module0271.$ic10$)) {
                                final SubLObject var139 = module0065.f4740(var29_123);
                                final SubLObject var140 = (SubLObject)module0271.NIL;
                                SubLObject var141;
                                SubLObject var142;
                                SubLObject var143;
                                SubLObject var144;
                                SubLObject var145;
                                SubLObject var146;
                                SubLObject var12_120;
                                SubLObject var147;
                                SubLObject var12_121;
                                SubLObject var148;
                                SubLObject var12_122;
                                SubLObject var149;
                                SubLObject var116_118;
                                SubLObject var12_123;
                                SubLObject var12_124;
                                SubLObject var153;
                                SubLObject var116_119;
                                SubLObject var12_125;
                                for (var141 = Sequences.length(var139), var142 = (SubLObject)module0271.NIL, var142 = (SubLObject)module0271.ZERO_INTEGER; var142.numL(var141); var142 = Numbers.add(var142, (SubLObject)module0271.ONE_INTEGER)) {
                                    var143 = ((module0271.NIL != var140) ? Numbers.subtract(var141, var142, (SubLObject)module0271.ONE_INTEGER) : var142);
                                    var144 = Vectors.aref(var139, var143);
                                    if (module0271.NIL == module0065.f4749(var144) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                        if (module0271.NIL != module0065.f4749(var144)) {
                                            var144 = (SubLObject)module0271.$ic10$;
                                        }
                                        module0012.note_percent_progress(var137, var136);
                                        var137 = Numbers.add(var137, (SubLObject)module0271.ONE_INTEGER);
                                        if (assertion_handles_oc.f11025(var144).numGE(var112)) {
                                            module0271.$g2576$.setDynamicValue(var144, var111);
                                            var145 = (SubLObject)module0271.NIL;
                                            var146 = (SubLObject)module0271.NIL;
                                            try {
                                                var111.throwStack.push(module0003.$g3$.getGlobalValue());
                                                var12_120 = Errors.$error_handler$.currentBinding(var111);
                                                try {
                                                    Errors.$error_handler$.bind((SubLObject)module0271.$ic11$, var111);
                                                    try {
                                                        var147 = module0003.f61();
                                                        try {
                                                            var111.throwStack.push(var147);
                                                            var12_121 = module0003.$g4$.currentBinding(var111);
                                                            try {
                                                                module0003.$g4$.bind((SubLObject)module0271.T, var111);
                                                                var148 = (SubLObject)module0271.NIL;
                                                                try {
                                                                    var12_122 = module0003.$g5$.currentBinding(var111);
                                                                    try {
                                                                        module0003.$g5$.bind(Numbers.add((SubLObject)module0271.ONE_INTEGER, module0003.$g5$.getDynamicValue(var111)), var111);
                                                                        var148 = module0003.f62(module0271.$g2577$.getDynamicValue(var111), var147);
                                                                        if (module0271.NIL != f17865(var144)) {
                                                                            f17900(var144, var125);
                                                                            var149 = (SubLObject)module0271.NIL;
                                                                            try {
                                                                                var149 = compatibility.open_text(var109, (SubLObject)module0271.$ic30$);
                                                                                if (!var149.isStream()) {
                                                                                    Errors.error((SubLObject)module0271.$ic28$, var109);
                                                                                }
                                                                                var116_118 = var149;
                                                                                PrintLow.format(var116_118, (SubLObject)module0271.$ic31$, module0213.f13920(var144), var125);
                                                                            }
                                                                            finally {
                                                                                var12_123 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                                                                                try {
                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var111);
                                                                                    if (var149.isStream()) {
                                                                                        streams_high.close(var149, (SubLObject)module0271.UNPROVIDED);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var12_123, var111);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0003.$g5$.rebind(var12_122, var111);
                                                                    }
                                                                }
                                                                finally {
                                                                    var12_124 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var111);
                                                                        module0003.f64(var148);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_124, var111);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0003.$g4$.rebind(var12_121, var111);
                                                            }
                                                        }
                                                        catch (Throwable var150) {
                                                            var146 = Errors.handleThrowable(var150, var147);
                                                        }
                                                        finally {
                                                            var111.throwStack.pop();
                                                        }
                                                        if (module0271.NIL != var146) {
                                                            Errors.error((SubLObject)module0271.$ic32$, module0271.$g2577$.getDynamicValue(var111), var144);
                                                        }
                                                    }
                                                    catch (Throwable var151) {
                                                        Errors.handleThrowable(var151, (SubLObject)module0271.NIL);
                                                    }
                                                }
                                                finally {
                                                    Errors.$error_handler$.rebind(var12_120, var111);
                                                }
                                            }
                                            catch (Throwable var152) {
                                                var145 = Errors.handleThrowable(var152, module0003.$g3$.getGlobalValue());
                                            }
                                            finally {
                                                var111.throwStack.pop();
                                            }
                                            if (module0271.NIL != var145) {
                                                module0271.$g2570$.setGlobalValue((SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var144), module0271.$g2570$.getGlobalValue()));
                                                var153 = (SubLObject)module0271.NIL;
                                                try {
                                                    var153 = compatibility.open_text(var109, (SubLObject)module0271.$ic30$);
                                                    if (!var153.isStream()) {
                                                        Errors.error((SubLObject)module0271.$ic28$, var109);
                                                    }
                                                    var116_119 = var153;
                                                    PrintLow.format(var116_119, (SubLObject)module0271.$ic33$, module0213.f13920(var144), var145);
                                                }
                                                finally {
                                                    var12_125 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var111);
                                                        if (var153.isStream()) {
                                                            streams_high.close(var153, (SubLObject)module0271.UNPROVIDED);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_125, var111);
                                                    }
                                                }
                                            }
                                        }
                                        module0271.$g2568$.setGlobalValue(assertion_handles_oc.f11025(var144));
                                        module0271.$g2567$.setGlobalValue(Numbers.add(module0271.$g2567$.getGlobalValue(), (SubLObject)module0271.ONE_INTEGER));
                                    }
                                }
                            }
                            final SubLObject var37_137 = var27_122;
                            if (module0271.NIL == module0065.f4777(var37_137) || module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$)) {
                                final SubLObject var154 = module0065.f4738(var37_137);
                                SubLObject var155 = module0065.f4739(var37_137);
                                final SubLObject var156 = module0065.f4734(var37_137);
                                final SubLObject var157 = (SubLObject)((module0271.NIL != module0065.f4773((SubLObject)module0271.$ic10$)) ? module0271.NIL : module0271.$ic10$);
                                while (var155.numL(var156)) {
                                    final SubLObject var158 = Hashtables.gethash_without_values(var155, var154, var157);
                                    if (module0271.NIL == module0065.f4773((SubLObject)module0271.$ic10$) || module0271.NIL == module0065.f4749(var158)) {
                                        module0012.note_percent_progress(var137, var136);
                                        var137 = Numbers.add(var137, (SubLObject)module0271.ONE_INTEGER);
                                        if (assertion_handles_oc.f11025(var158).numGE(var112)) {
                                            module0271.$g2576$.setDynamicValue(var158, var111);
                                            SubLObject var159 = (SubLObject)module0271.NIL;
                                            SubLObject var160 = (SubLObject)module0271.NIL;
                                            try {
                                                var111.throwStack.push(module0003.$g3$.getGlobalValue());
                                                final SubLObject var12_126 = Errors.$error_handler$.currentBinding(var111);
                                                try {
                                                    Errors.$error_handler$.bind((SubLObject)module0271.$ic11$, var111);
                                                    try {
                                                        final SubLObject var161 = module0003.f61();
                                                        try {
                                                            var111.throwStack.push(var161);
                                                            final SubLObject var12_127 = module0003.$g4$.currentBinding(var111);
                                                            try {
                                                                module0003.$g4$.bind((SubLObject)module0271.T, var111);
                                                                SubLObject var162 = (SubLObject)module0271.NIL;
                                                                try {
                                                                    final SubLObject var12_128 = module0003.$g5$.currentBinding(var111);
                                                                    try {
                                                                        module0003.$g5$.bind(Numbers.add((SubLObject)module0271.ONE_INTEGER, module0003.$g5$.getDynamicValue(var111)), var111);
                                                                        var162 = module0003.f62(module0271.$g2577$.getDynamicValue(var111), var161);
                                                                        if (module0271.NIL != f17865(var158)) {
                                                                            f17900(var158, var125);
                                                                            SubLObject var163 = (SubLObject)module0271.NIL;
                                                                            try {
                                                                                var163 = compatibility.open_text(var109, (SubLObject)module0271.$ic30$);
                                                                                if (!var163.isStream()) {
                                                                                    Errors.error((SubLObject)module0271.$ic28$, var109);
                                                                                }
                                                                                final SubLObject var116_120 = var163;
                                                                                PrintLow.format(var116_120, (SubLObject)module0271.$ic31$, module0213.f13920(var158), var125);
                                                                            }
                                                                            finally {
                                                                                final SubLObject var12_129 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                                                                                try {
                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var111);
                                                                                    if (var163.isStream()) {
                                                                                        streams_high.close(var163, (SubLObject)module0271.UNPROVIDED);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(var12_129, var111);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0003.$g5$.rebind(var12_128, var111);
                                                                    }
                                                                }
                                                                finally {
                                                                    final SubLObject var12_130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                                                                    try {
                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var111);
                                                                        module0003.f64(var162);
                                                                    }
                                                                    finally {
                                                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_130, var111);
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                module0003.$g4$.rebind(var12_127, var111);
                                                            }
                                                        }
                                                        catch (Throwable var164) {
                                                            var160 = Errors.handleThrowable(var164, var161);
                                                        }
                                                        finally {
                                                            var111.throwStack.pop();
                                                        }
                                                        if (module0271.NIL != var160) {
                                                            Errors.error((SubLObject)module0271.$ic32$, module0271.$g2577$.getDynamicValue(var111), var158);
                                                        }
                                                    }
                                                    catch (Throwable var165) {
                                                        Errors.handleThrowable(var165, (SubLObject)module0271.NIL);
                                                    }
                                                }
                                                finally {
                                                    Errors.$error_handler$.rebind(var12_126, var111);
                                                }
                                            }
                                            catch (Throwable var166) {
                                                var159 = Errors.handleThrowable(var166, module0003.$g3$.getGlobalValue());
                                            }
                                            finally {
                                                var111.throwStack.pop();
                                            }
                                            if (module0271.NIL != var159) {
                                                module0271.$g2570$.setGlobalValue((SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var158), module0271.$g2570$.getGlobalValue()));
                                                SubLObject var167 = (SubLObject)module0271.NIL;
                                                try {
                                                    var167 = compatibility.open_text(var109, (SubLObject)module0271.$ic30$);
                                                    if (!var167.isStream()) {
                                                        Errors.error((SubLObject)module0271.$ic28$, var109);
                                                    }
                                                    final SubLObject var116_121 = var167;
                                                    PrintLow.format(var116_121, (SubLObject)module0271.$ic33$, module0213.f13920(var158), var159);
                                                }
                                                finally {
                                                    final SubLObject var12_131 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var111);
                                                        if (var167.isStream()) {
                                                            streams_high.close(var167, (SubLObject)module0271.UNPROVIDED);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var12_131, var111);
                                                    }
                                                }
                                            }
                                        }
                                        module0271.$g2568$.setGlobalValue(assertion_handles_oc.f11025(var158));
                                        module0271.$g2567$.setGlobalValue(Numbers.add(module0271.$g2567$.getGlobalValue(), (SubLObject)module0271.ONE_INTEGER));
                                    }
                                    var155 = Numbers.add(var155, (SubLObject)module0271.ONE_INTEGER);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var138, var111);
                        module0012.$g77$.rebind(var18_121, var111);
                        module0012.$g76$.rebind(var17_120, var111);
                        module0012.$g75$.rebind(var12_119, var111);
                    }
                    var131 = module0139.$g1632$.getDynamicValue(var111);
                }
                finally {
                    module0139.$g1631$.rebind(var133, var111);
                    module0139.$g1630$.rebind(var132, var111);
                    module0139.$g1632$.rebind(var12_118, var111);
                }
            }
            finally {
                final SubLObject var12_132 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var111);
                    if (module0271.NIL != var127 && module0271.NIL == var129) {
                        module0034.f1873(var127, (SubLObject)module0271.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_132, var111);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var128, var111);
        }
        module0271.$g2575$.setGlobalValue(Time.get_universal_time());
        SubLObject var168 = (SubLObject)module0271.NIL;
        try {
            var168 = compatibility.open_text(var109, (SubLObject)module0271.$ic30$);
            if (!var168.isStream()) {
                Errors.error((SubLObject)module0271.$ic28$, var109);
            }
            final SubLObject var116_122 = var168;
            PrintLow.format(var116_122, (SubLObject)module0271.$ic34$, module0271.$g2575$.getGlobalValue());
        }
        finally {
            final SubLObject var169 = Threads.$is_thread_performing_cleanupP$.currentBinding(var111);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var111);
                if (var168.isStream()) {
                    streams_high.close(var168, (SubLObject)module0271.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var169, var111);
            }
        }
        return module0271.$g2573$.getDynamicValue(var111);
    }
    
    public static SubLObject f17906() {
        if (module0271.NIL == module0271.$g2574$.getGlobalValue()) {
            return PrintLow.format((SubLObject)module0271.NIL, (SubLObject)module0271.$ic35$);
        }
        final SubLObject var151 = module0271.$g2567$.getGlobalValue();
        final SubLObject var152 = assertion_handles_oc.f11019();
        final SubLObject var153 = (module0271.NIL != module0271.$g2575$.getGlobalValue()) ? module0271.$g2575$.getGlobalValue() : Time.get_universal_time();
        final SubLObject var154 = Numbers.subtract(var153, module0271.$g2574$.getGlobalValue());
        final SubLObject var155 = Numbers.truncate(Numbers.multiply(var154, Numbers.divide(var152, var151)), (SubLObject)module0271.UNPROVIDED);
        final SubLObject var156 = Numbers.add(module0271.$g2574$.getGlobalValue(), var155);
        return PrintLow.format((SubLObject)module0271.NIL, (SubLObject)module0271.$ic36$, new SubLObject[] { module0048.f3302(Numbers.multiply((SubLObject)module0271.$ic18$, Numbers.divide(var151, var152)), (SubLObject)module0271.THREE_INTEGER), module0048.f3302(Numbers.divide(var155, Numbers.multiply((SubLObject)module0271.$ic37$, (SubLObject)module0271.$ic38$, (SubLObject)module0271.$ic38$)), (SubLObject)module0271.TWO_INTEGER), module0051.f3663(var156) });
    }
    
    public static SubLObject f17907(final SubLObject var109) {
        return module0035.sublisp_boolean(Filesys.probe_file(var109));
    }
    
    public static SubLObject f17908(final SubLObject var109) {
        return f17909(var109, (SubLObject)module0271.$ic39$);
    }
    
    public static SubLObject f17910(final SubLObject var109) {
        final SubLObject var110 = f17909(var109, (SubLObject)module0271.$ic40$);
        if (!var110.isInteger()) {
            return (SubLObject)module0271.NIL;
        }
        if (module0271.$g2574$.getGlobalValue().isInteger()) {
            return Numbers.numG(var110, module0271.$g2574$.getGlobalValue());
        }
        return (SubLObject)module0271.T;
    }
    
    public static SubLObject f17909(final SubLObject var109, final SubLObject var158) {
        SubLObject var159 = (SubLObject)module0271.NIL;
        SubLObject var160 = (SubLObject)module0271.NIL;
        if (module0271.NIL != f17907(var109)) {
            SubLObject var161 = (SubLObject)module0271.NIL;
            try {
                var161 = compatibility.open_text(var109, (SubLObject)module0271.$ic41$);
                if (!var161.isStream()) {
                    Errors.error((SubLObject)module0271.$ic28$, var109);
                }
                SubLObject var162;
                SubLObject var163;
                for (var162 = var161, var163 = (SubLObject)module0271.NIL, var163 = reader.read_ignoring_errors(var162, (SubLObject)module0271.NIL, (SubLObject)module0271.$ic42$); var163 != module0271.$ic42$ && module0271.NIL == var159; var163 = reader.read_ignoring_errors(var162, (SubLObject)module0271.NIL, (SubLObject)module0271.$ic42$)) {
                    if (var163.isCons() && var163.first().eql(var158)) {
                        var159 = (SubLObject)module0271.T;
                        var160 = conses_high.second(var163);
                    }
                }
            }
            finally {
                final SubLObject var164 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0271.T);
                    if (var161.isStream()) {
                        streams_high.close(var161, (SubLObject)module0271.UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var164);
                }
            }
            return Values.values(var160, var159);
        }
        return (SubLObject)module0271.NIL;
    }
    
    public static SubLObject f17911() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        Hashtables.clrhash(module0271.$g2573$.getDynamicValue(var5));
        final SubLObject var6 = module0271.$g2566$.getGlobalValue();
        module0012.$g82$.setDynamicValue((SubLObject)module0271.$ic43$, var5);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var5);
        module0012.$g83$.setDynamicValue(Sequences.length(var6), var5);
        module0012.$g84$.setDynamicValue((SubLObject)module0271.ZERO_INTEGER, var5);
        final SubLObject var7 = module0012.$g75$.currentBinding(var5);
        final SubLObject var8 = module0012.$g76$.currentBinding(var5);
        final SubLObject var9 = module0012.$g77$.currentBinding(var5);
        final SubLObject var10 = module0012.$g78$.currentBinding(var5);
        try {
            module0012.$g75$.bind((SubLObject)module0271.ZERO_INTEGER, var5);
            module0012.$g76$.bind((SubLObject)module0271.NIL, var5);
            module0012.$g77$.bind((SubLObject)module0271.T, var5);
            module0012.$g78$.bind(Time.get_universal_time(), var5);
            module0012.f478(module0012.$g82$.getDynamicValue(var5));
            SubLObject var11 = var6;
            SubLObject var12 = (SubLObject)module0271.NIL;
            var12 = var11.first();
            while (module0271.NIL != var11) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var5), module0012.$g83$.getDynamicValue(var5));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var5), (SubLObject)module0271.ONE_INTEGER), var5);
                final SubLObject var13 = assertion_handles_oc.f11053(var12);
                if (module0271.NIL != assertion_handles_oc.f11035(var13)) {
                    f17900(var13, (SubLObject)module0271.UNPROVIDED);
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var10, var5);
            module0012.$g77$.rebind(var9, var5);
            module0012.$g76$.rebind(var8, var5);
            module0012.$g75$.rebind(var7, var5);
        }
        return module0271.$g2573$.getDynamicValue(var5);
    }
    
    public static SubLObject f17912() {
        final SubLObject var109 = f17913();
        if (module0271.NIL != f17910(var109) && module0271.NIL != f17908(var109)) {
            PrintLow.format((SubLObject)module0271.T, (SubLObject)module0271.$ic44$, var109);
            return f17905(var109);
        }
        return (SubLObject)module0271.NIL;
    }
    
    public static SubLObject f17913() {
        return module0075.f5175((SubLObject)module0271.$ic45$, (SubLObject)module0271.$ic46$, (SubLObject)module0271.$ic47$);
    }
    
    public static SubLObject f17914(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)module0271.NIL;
        try {
            var111 = compatibility.open_text(var109, (SubLObject)module0271.$ic27$);
            if (!var111.isStream()) {
                Errors.error((SubLObject)module0271.$ic28$, var109);
            }
            final SubLObject var112 = var111;
            PrintLow.format(var112, (SubLObject)module0271.$ic48$, module0107.f7573());
            f17915(var112, (SubLObject)module0271.$ic49$);
            final SubLObject var113 = module0271.$g2573$.getDynamicValue(var110);
            module0012.$g82$.setDynamicValue((SubLObject)module0271.$ic50$, var110);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var110);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var113), var110);
            module0012.$g84$.setDynamicValue((SubLObject)module0271.ZERO_INTEGER, var110);
            final SubLObject var114 = module0012.$g75$.currentBinding(var110);
            final SubLObject var115 = module0012.$g76$.currentBinding(var110);
            final SubLObject var116 = module0012.$g77$.currentBinding(var110);
            final SubLObject var117 = module0012.$g78$.currentBinding(var110);
            try {
                module0012.$g75$.bind((SubLObject)module0271.ZERO_INTEGER, var110);
                module0012.$g76$.bind((SubLObject)module0271.NIL, var110);
                module0012.$g77$.bind((SubLObject)module0271.T, var110);
                module0012.$g78$.bind(Time.get_universal_time(), var110);
                module0012.f478(module0012.$g82$.getDynamicValue(var110));
                SubLObject var118 = (SubLObject)module0271.NIL;
                SubLObject var119 = (SubLObject)module0271.NIL;
                final Iterator var120 = Hashtables.getEntrySetIterator(var113);
                try {
                    while (Hashtables.iteratorHasNext(var120)) {
                        final Map.Entry var121 = Hashtables.iteratorNextEntry(var120);
                        var118 = Hashtables.getEntryKey(var121);
                        var119 = Hashtables.getEntryValue(var121);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var110), module0012.$g83$.getDynamicValue(var110));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var110), (SubLObject)module0271.ONE_INTEGER), var110);
                        final SubLObject var122 = assertion_handles_oc.f11053(var118);
                        SubLObject var123 = (SubLObject)module0271.NIL;
                        if (module0271.NIL != module0178.f11361(var122, (SubLObject)module0271.UNPROVIDED)) {
                            var123 = module0213.f13920(var122);
                        }
                        PrintLow.format(var112, (SubLObject)module0271.$ic31$, var123, var119);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var120);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var117, var110);
                module0012.$g77$.rebind(var116, var110);
                module0012.$g76$.rebind(var115, var110);
                module0012.$g75$.rebind(var114, var110);
            }
        }
        finally {
            final SubLObject var124 = Threads.$is_thread_performing_cleanupP$.currentBinding(var110);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var110);
                if (var111.isStream()) {
                    streams_high.close(var111, (SubLObject)module0271.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var124, var110);
            }
        }
        return (SubLObject)module0271.T;
    }
    
    public static SubLObject f17916(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)module0271.NIL;
        try {
            var111 = compatibility.open_text(var109, (SubLObject)module0271.$ic27$);
            if (!var111.isStream()) {
                Errors.error((SubLObject)module0271.$ic28$, var109);
            }
            final SubLObject var112 = var111;
            PrintLow.format(var112, (SubLObject)module0271.$ic48$, module0107.f7573());
            f17915(var112, (SubLObject)module0271.$ic51$);
            final SubLObject var113 = module0271.$g2573$.getDynamicValue(var110);
            module0012.$g82$.setDynamicValue((SubLObject)module0271.$ic52$, var110);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var110);
            module0012.$g83$.setDynamicValue(Hashtables.hash_table_count(var113), var110);
            module0012.$g84$.setDynamicValue((SubLObject)module0271.ZERO_INTEGER, var110);
            final SubLObject var114 = module0012.$g75$.currentBinding(var110);
            final SubLObject var115 = module0012.$g76$.currentBinding(var110);
            final SubLObject var116 = module0012.$g77$.currentBinding(var110);
            final SubLObject var117 = module0012.$g78$.currentBinding(var110);
            try {
                module0012.$g75$.bind((SubLObject)module0271.ZERO_INTEGER, var110);
                module0012.$g76$.bind((SubLObject)module0271.NIL, var110);
                module0012.$g77$.bind((SubLObject)module0271.T, var110);
                module0012.$g78$.bind(Time.get_universal_time(), var110);
                module0012.f478(module0012.$g82$.getDynamicValue(var110));
                SubLObject var118 = (SubLObject)module0271.NIL;
                SubLObject var119 = (SubLObject)module0271.NIL;
                final Iterator var120 = Hashtables.getEntrySetIterator(var113);
                try {
                    while (Hashtables.iteratorHasNext(var120)) {
                        final Map.Entry var121 = Hashtables.iteratorNextEntry(var120);
                        var118 = Hashtables.getEntryKey(var121);
                        var119 = Hashtables.getEntryValue(var121);
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var110), module0012.$g83$.getDynamicValue(var110));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var110), (SubLObject)module0271.ONE_INTEGER), var110);
                        final SubLObject var122 = assertion_handles_oc.f11053(var118);
                        if (module0271.NIL != module0178.f11361(var122, (SubLObject)module0271.UNPROVIDED)) {
                            PrintLow.format(var112, (SubLObject)module0271.$ic31$, var118, var119);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var120);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var117, var110);
                module0012.$g77$.rebind(var116, var110);
                module0012.$g76$.rebind(var115, var110);
                module0012.$g75$.rebind(var114, var110);
            }
        }
        finally {
            final SubLObject var123 = Threads.$is_thread_performing_cleanupP$.currentBinding(var110);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var110);
                if (var111.isStream()) {
                    streams_high.close(var111, (SubLObject)module0271.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var123, var110);
            }
        }
        return (SubLObject)module0271.T;
    }
    
    public static SubLObject f17915(final SubLObject var116, final SubLObject var170) {
        PrintLow.format(var116, (SubLObject)module0271.$ic53$, f17902());
        PrintLow.format(var116, (SubLObject)module0271.$ic29$, module0271.$g2574$.getGlobalValue());
        if (module0271.NIL != module0271.$g2575$.getGlobalValue()) {
            PrintLow.format(var116, (SubLObject)module0271.$ic34$, module0271.$g2575$.getGlobalValue());
        }
        SubLObject var171 = module0271.$g2570$.getGlobalValue();
        SubLObject var172 = (SubLObject)module0271.NIL;
        var172 = var171.first();
        while (module0271.NIL != var171) {
            if (var172.isInteger()) {
                if (var170.eql((SubLObject)module0271.$ic49$)) {
                    PrintLow.format(var116, (SubLObject)module0271.$ic54$, module0213.f13920(assertion_handles_oc.f11053(var172)));
                }
                else if (var170.eql((SubLObject)module0271.$ic51$)) {
                    PrintLow.format(var116, (SubLObject)module0271.$ic54$, var172);
                }
            }
            else {
                Errors.warn((SubLObject)module0271.$ic55$);
            }
            var171 = var171.rest();
            var172 = var171.first();
        }
        return (SubLObject)module0271.NIL;
    }
    
    public static SubLObject f17905(final SubLObject var109) {
        return f17917(var109);
    }
    
    public static SubLObject f17918(final SubLObject var109) {
        return f17917(var109);
    }
    
    public static SubLObject f17917(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        Hashtables.clrhash(module0271.$g2573$.getDynamicValue(var110));
        module0271.$g2570$.setGlobalValue((SubLObject)module0271.NIL);
        SubLObject var111 = (SubLObject)module0271.NIL;
        try {
            var111 = compatibility.open_text(var109, (SubLObject)module0271.$ic41$);
            if (!var111.isStream()) {
                Errors.error((SubLObject)module0271.$ic28$, var109);
            }
            final SubLObject var112 = var111;
            final SubLObject var113 = streams_high.file_length(var112);
            final SubLObject var114 = module0012.$g75$.currentBinding(var110);
            final SubLObject var115 = module0012.$g76$.currentBinding(var110);
            final SubLObject var116 = module0012.$g77$.currentBinding(var110);
            final SubLObject var117 = module0012.$g78$.currentBinding(var110);
            try {
                module0012.$g75$.bind((SubLObject)module0271.ZERO_INTEGER, var110);
                module0012.$g76$.bind((SubLObject)module0271.NIL, var110);
                module0012.$g77$.bind((SubLObject)module0271.T, var110);
                module0012.$g78$.bind(Time.get_universal_time(), var110);
                module0012.f478((SubLObject)module0271.$ic56$);
                SubLObject var118 = (SubLObject)module0271.NIL;
                SubLObject var119 = (SubLObject)module0271.NIL;
                var118 = reader.read_ignoring_errors(var112, (SubLObject)module0271.NIL, (SubLObject)module0271.$ic42$);
                var119 = streams_high.file_position(var112, (SubLObject)module0271.UNPROVIDED);
                while (var118 != module0271.$ic42$) {
                    f17919(var118);
                    module0012.note_percent_progress(var119, var113);
                    var118 = reader.read_ignoring_errors(var112, (SubLObject)module0271.NIL, (SubLObject)module0271.$ic42$);
                    var119 = streams_high.file_position(var112, (SubLObject)module0271.UNPROVIDED);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var117, var110);
                module0012.$g77$.rebind(var116, var110);
                module0012.$g76$.rebind(var115, var110);
                module0012.$g75$.rebind(var114, var110);
            }
        }
        finally {
            final SubLObject var120 = Threads.$is_thread_performing_cleanupP$.currentBinding(var110);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0271.T, var110);
                if (var111.isStream()) {
                    streams_high.close(var111, (SubLObject)module0271.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var120, var110);
            }
        }
        return module0271.$g2573$.getDynamicValue(var110);
    }
    
    public static SubLObject f17919(final SubLObject var163) {
        final SubLThread var164 = SubLProcess.currentSubLThread();
        if (var163.first() == module0271.$ic57$) {
            module0271.$g2578$.setDynamicValue(conses_high.second(var163), var164);
        }
        else if (var163.first() == module0271.$ic40$) {
            module0271.$g2574$.setGlobalValue(conses_high.second(var163));
        }
        else if (var163.first() == module0271.$ic39$) {
            module0271.$g2575$.setGlobalValue(conses_high.second(var163));
        }
        else if (var163.first() == module0271.$ic58$) {
            if (module0271.NIL != module0213.f13913(conses_high.second(var163))) {
                final SubLObject var165 = module0213.f13921(conses_high.second(var163));
                if (module0271.NIL != assertion_handles_oc.f11035(var165)) {
                    if (assertion_handles_oc.f11025(var165).isInteger()) {
                        module0271.$g2570$.setGlobalValue((SubLObject)ConsesLow.cons(assertion_handles_oc.f11025(var165), module0271.$g2570$.getGlobalValue()));
                    }
                    else if (module0271.NIL != module0271.$g2579$.getDynamicValue(var164)) {
                        Errors.warn((SubLObject)module0271.$ic59$, conses_high.second(var163));
                    }
                }
            }
            else if (module0271.NIL != assertion_handles_oc.f11048(conses_high.second(var163))) {
                final SubLObject var165 = assertion_handles_oc.f11053(conses_high.second(var163));
                if (module0271.NIL != assertion_handles_oc.f11035(var165)) {
                    module0271.$g2570$.setGlobalValue((SubLObject)ConsesLow.cons(conses_high.second(var163), module0271.$g2570$.getGlobalValue()));
                }
            }
        }
        else if (module0271.NIL != module0213.f13913(var163.first())) {
            final SubLObject var165 = module0213.f13921(var163.first());
            if (module0271.NIL != module0178.f11361(var165, (SubLObject)module0271.UNPROVIDED)) {
                f17900(var165, conses_high.second(var163));
            }
            else if (module0271.NIL != module0271.$g2579$.getDynamicValue(var164)) {
                Errors.warn((SubLObject)module0271.$ic60$, var163.first());
            }
        }
        else if (module0271.NIL != assertion_handles_oc.f11048(var163.first())) {
            final SubLObject var165 = assertion_handles_oc.f11053(var163.first());
            if (module0271.NIL != module0178.f11361(var165, (SubLObject)module0271.UNPROVIDED)) {
                f17900(var165, conses_high.second(var163));
            }
            else if (module0271.NIL != module0271.$g2579$.getDynamicValue(var164)) {
                Errors.warn((SubLObject)module0271.$ic61$, var163.first());
            }
        }
        else if (module0271.NIL != module0271.$g2579$.getDynamicValue(var164)) {
            Errors.warn((SubLObject)module0271.$ic62$, var163);
        }
        return (SubLObject)module0271.NIL;
    }
    
    public static SubLObject f17920(final SubLObject var1) {
        final SubLObject var2 = module0289.f19396(var1);
        final SubLObject var3 = module0178.f11287(var1);
        final SubLObject var4 = module0274.f18060(var2, var3, (SubLObject)module0271.UNPROVIDED);
        if (module0271.NIL != var4) {
            f17901(var1);
        }
        else {
            f17900(var1, (SubLObject)module0271.UNPROVIDED);
        }
        return var4;
    }
    
    public static SubLObject f17921(final SubLObject var7, final SubLObject var3) {
        assert module0271.NIL != module0202.f12590(var7) : var7;
        final SubLObject var8 = module0543.f33697(var7, var3);
        SubLObject var9 = (SubLObject)module0271.T;
        SubLObject var10 = var8;
        SubLObject var11 = (SubLObject)module0271.NIL;
        var11 = var10.first();
        while (module0271.NIL != var10) {
            if (module0271.NIL == f17920(var11)) {
                var9 = (SubLObject)module0271.NIL;
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return var9;
    }
    
    public static SubLObject f17922() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17865", "S#20392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17866", "S#20393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17867", "S#20394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17868", "S#20395", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17869", "S#20396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17870", "S#20397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17871", "S#20398", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17872", "S#20399", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17873", "S#20400", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17874", "S#20401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17875", "S#20402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17876", "S#20403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17877", "S#20390", 1, 0, false);
        new $f17877$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17878", "S#20391", 1, 0, false);
        new $f17878$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17879", "S#20404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17880", "MAL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17881", "S#20405", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17882", "S#20406", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17883", "S#20407", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17884", "S#20408", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17885", "S#20409", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17886", "S#20410", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17887", "S#20411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17888", "S#20412", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17889", "S#20413", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17890", "S#20414", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17891", "S#20415", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17892", "S#20416", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17893", "S#20417", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17894", "S#20418", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17895", "S#20419", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17896", "S#20420", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17897", "S#20421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17898", "S#20422", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17899", "S#20423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17900", "S#20424", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17901", "S#20425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17902", "S#20426", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17903", "S#20427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17904", "S#20428", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17906", "S#20429", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17907", "S#20430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17908", "S#20431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17910", "S#20432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17909", "S#20433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17911", "S#20434", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17912", "S#20435", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17913", "S#20436", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17914", "S#20437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17916", "S#20438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17915", "S#20439", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17905", "S#20440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17918", "S#20441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17917", "S#20442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17919", "S#20443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17920", "S#20444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0271", "f17921", "S#20445", 2, 0, false);
        return (SubLObject)module0271.NIL;
    }
    
    public static SubLObject f17923() {
        module0271.$g2559$ = SubLFiles.defparameter("S#20446", (SubLObject)module0271.T);
        module0271.$g2560$ = SubLFiles.defparameter("S#15210", (SubLObject)module0271.T);
        module0271.$g2561$ = SubLFiles.defparameter("*CHECK-WFF-COHERENCE?*", (SubLObject)module0271.NIL);
        module0271.$g2562$ = SubLFiles.defparameter("S#15209", (SubLObject)module0271.T);
        module0271.$g2563$ = SubLFiles.defparameter("S#15211", (SubLObject)module0271.T);
        module0271.$g2564$ = SubLFiles.defparameter("S#15212", (SubLObject)module0271.T);
        module0271.$g2565$ = SubLFiles.defparameter("S#20447", (SubLObject)module0271.T);
        module0271.$g2566$ = SubLFiles.deflexical("S#20448", (SubLObject)((module0271.NIL != Symbols.boundp((SubLObject)module0271.$ic2$)) ? module0271.$g2566$.getGlobalValue() : module0271.NIL));
        module0271.$g2567$ = SubLFiles.deflexical("S#20449", (SubLObject)((module0271.NIL != Symbols.boundp((SubLObject)module0271.$ic3$)) ? module0271.$g2567$.getGlobalValue() : module0271.ZERO_INTEGER));
        module0271.$g2568$ = SubLFiles.deflexical("S#20450", (SubLObject)((module0271.NIL != Symbols.boundp((SubLObject)module0271.$ic4$)) ? module0271.$g2568$.getGlobalValue() : module0271.ZERO_INTEGER));
        module0271.$g2569$ = SubLFiles.deflexical("S#20451", (SubLObject)((module0271.NIL != Symbols.boundp((SubLObject)module0271.$ic5$)) ? module0271.$g2569$.getGlobalValue() : module0271.NIL));
        module0271.$g2570$ = SubLFiles.deflexical("S#20452", (SubLObject)((module0271.NIL != Symbols.boundp((SubLObject)module0271.$ic6$)) ? module0271.$g2570$.getGlobalValue() : module0271.NIL));
        module0271.$g2571$ = SubLFiles.deflexical("S#20453", (SubLObject)((module0271.NIL != Symbols.boundp((SubLObject)module0271.$ic14$)) ? module0271.$g2571$.getGlobalValue() : module0271.NIL));
        module0271.$g2572$ = SubLFiles.deflexical("S#20454", (SubLObject)((module0271.NIL != Symbols.boundp((SubLObject)module0271.$ic15$)) ? module0271.$g2572$.getGlobalValue() : module0271.NIL));
        module0271.$g2573$ = SubLFiles.defvar("S#20455", Hashtables.make_hash_table((SubLObject)module0271.$ic21$, Symbols.symbol_function((SubLObject)module0271.EQUAL), (SubLObject)module0271.UNPROVIDED));
        module0271.$g2574$ = SubLFiles.deflexical("S#20456", (SubLObject)((module0271.NIL != Symbols.boundp((SubLObject)module0271.$ic22$)) ? module0271.$g2574$.getGlobalValue() : module0271.NIL));
        module0271.$g2575$ = SubLFiles.deflexical("S#20457", (SubLObject)((module0271.NIL != Symbols.boundp((SubLObject)module0271.$ic23$)) ? module0271.$g2575$.getGlobalValue() : module0271.NIL));
        module0271.$g2576$ = SubLFiles.defparameter("S#20458", (SubLObject)module0271.NIL);
        module0271.$g2577$ = SubLFiles.defparameter("S#20459", (SubLObject)module0271.$ic24$);
        module0271.$g2578$ = SubLFiles.defparameter("S#20460", (SubLObject)module0271.NIL);
        module0271.$g2579$ = SubLFiles.defparameter("S#20461", (SubLObject)module0271.NIL);
        return (SubLObject)module0271.NIL;
    }
    
    public static SubLObject f17924() {
        module0003.f57((SubLObject)module0271.$ic2$);
        module0003.f57((SubLObject)module0271.$ic3$);
        module0003.f57((SubLObject)module0271.$ic4$);
        module0003.f57((SubLObject)module0271.$ic5$);
        module0003.f57((SubLObject)module0271.$ic6$);
        module0003.f57((SubLObject)module0271.$ic14$);
        module0003.f57((SubLObject)module0271.$ic15$);
        module0003.f57((SubLObject)module0271.$ic22$);
        module0003.f57((SubLObject)module0271.$ic23$);
        return (SubLObject)module0271.NIL;
    }
    
    public void declareFunctions() {
        f17922();
    }
    
    public void initializeVariables() {
        f17923();
    }
    
    public void runTopLevelForms() {
        f17924();
    }
    
    static {
        me = (SubLFile)new module0271();
        module0271.$g2559$ = null;
        module0271.$g2560$ = null;
        module0271.$g2561$ = null;
        module0271.$g2562$ = null;
        module0271.$g2563$ = null;
        module0271.$g2564$ = null;
        module0271.$g2565$ = null;
        module0271.$g2566$ = null;
        module0271.$g2567$ = null;
        module0271.$g2568$ = null;
        module0271.$g2569$ = null;
        module0271.$g2570$ = null;
        module0271.$g2571$ = null;
        module0271.$g2572$ = null;
        module0271.$g2573$ = null;
        module0271.$g2574$ = null;
        module0271.$g2575$ = null;
        module0271.$g2576$ = null;
        module0271.$g2577$ = null;
        module0271.$g2578$ = null;
        module0271.$g2579$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("MAL-FORT");
        $ic1$ = SubLObjectFactory.makeSymbol("S#20391", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#20448", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#20449", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#20450", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#20451", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#20452", "CYC");
        $ic7$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic8$ = SubLObjectFactory.makeString("mapping Cyc assertions");
        $ic9$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic10$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic11$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic12$ = SubLObjectFactory.makeString("WFF-checking assertion range ~A - ~A");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#352B2C1"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#13A2892"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1160044"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#20453", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#20454", "CYC");
        $ic16$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic17$ = SubLObjectFactory.makeString("it is not the case that (#$genlMt ~s ~s)");
        $ic18$ = SubLObjectFactory.makeInteger(100);
        $ic19$ = SubLObjectFactory.makeInteger(1000);
        $ic20$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic21$ = SubLObjectFactory.makeInteger(2048);
        $ic22$ = SubLObjectFactory.makeSymbol("S#20456", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#20457", "CYC");
        $ic24$ = SubLObjectFactory.makeInteger(30);
        $ic25$ = SubLObjectFactory.makeString("Determining largest checked ID");
        $ic26$ = SubLObjectFactory.makeString("~%~%Starting with ID = ~S");
        $ic27$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic28$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic29$ = SubLObjectFactory.makeString("~%(:start-time ~S)");
        $ic30$ = SubLObjectFactory.makeKeyword("APPEND");
        $ic31$ = SubLObjectFactory.makeString("~%(~S ~S)");
        $ic32$ = SubLObjectFactory.makeString("WFF took more than ~S seconds on ~S");
        $ic33$ = SubLObjectFactory.makeString("~%(:error ~S ~S)");
        $ic34$ = SubLObjectFactory.makeString("~%(:end-time ~S)");
        $ic35$ = SubLObjectFactory.makeString("No WFF-sweep has been started.");
        $ic36$ = SubLObjectFactory.makeString("After ~S%, the whole KB should take ~S days.  Expected completion: ~A.");
        $ic37$ = SubLObjectFactory.makeInteger(24);
        $ic38$ = SubLObjectFactory.makeInteger(60);
        $ic39$ = SubLObjectFactory.makeKeyword("END-TIME");
        $ic40$ = SubLObjectFactory.makeKeyword("START-TIME");
        $ic41$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic42$ = SubLObjectFactory.makeKeyword("EOF");
        $ic43$ = SubLObjectFactory.makeString("Converting *non-wff-list* to *non-wff-store*");
        $ic44$ = SubLObjectFactory.makeString("Loading newer non-wff store from ~A");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("data"), (SubLObject)SubLObjectFactory.makeString("non-wff"));
        $ic46$ = SubLObjectFactory.makeString("non-wff-store");
        $ic47$ = SubLObjectFactory.makeString("text");
        $ic48$ = SubLObjectFactory.makeString("~%;; ~A");
        $ic49$ = SubLObjectFactory.makeKeyword("EXTERNAL");
        $ic50$ = SubLObjectFactory.makeString("Saving the non-WFF store in externalized form.");
        $ic51$ = SubLObjectFactory.makeKeyword("INTERNAL");
        $ic52$ = SubLObjectFactory.makeString("Saving the non-WFF store in internalized form.");
        $ic53$ = SubLObjectFactory.makeString("~%(:record-count ~S)");
        $ic54$ = SubLObjectFactory.makeString("~%(:error ~S)");
        $ic55$ = SubLObjectFactory.makeString("~%Problem: NIL assertion ID in error list.");
        $ic56$ = SubLObjectFactory.makeString("Loading the non-WFF store");
        $ic57$ = SubLObjectFactory.makeKeyword("RECORD-COUNT");
        $ic58$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic59$ = SubLObjectFactory.makeString("The assertion with this external ID has a NIL assertion-id: ~S");
        $ic60$ = SubLObjectFactory.makeString("Assertions with HL external ID ~S is not valid; skipping.");
        $ic61$ = SubLObjectFactory.makeString("Assertions with internal ID ~S is not valid; skipping.");
        $ic62$ = SubLObjectFactory.makeString("Record ~S is an unknown type.");
        $ic63$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
    }
    
    public static final class $f17877$UnaryFunction extends UnaryFunction
    {
        public $f17877$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20390"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return module0271.f17877(var6);
        }
    }
    
    public static final class $f17878$UnaryFunction extends UnaryFunction
    {
        public $f17878$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#20391"));
        }
        
        public SubLObject processItem(final SubLObject var6) {
            return module0271.f17878(var6);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0271.class
	Total time: 1926 ms
	
	Decompiled with Procyon 0.5.32.
*/