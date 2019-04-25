package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0565 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0565";
    public static final String myFingerPrint = "5afd151ba1aadbc85f172af437e2f0f108a0a5124126fd9f2d862c36cfd8e6ab";
    private static SubLSymbol $g4130$;
    private static SubLSymbol $g4131$;
    private static SubLSymbol $g4132$;
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLString $ic13$;
    
    public static SubLObject f34844(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0183.$g2225$.currentBinding(var2);
        try {
            module0183.$g2225$.bind((SubLObject)T, var2);
            var3 = module0559.f34397(var1, $g4130$.getDynamicValue(var2));
        }
        finally {
            module0183.$g2225$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f34845(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0343.$g2954$.currentBinding(var2);
        try {
            module0343.$g2954$.bind((SubLObject)T, var2);
            var3 = module0559.f34428(var1, (SubLObject)UNPROVIDED);
        }
        finally {
            module0343.$g2954$.rebind(var4, var2);
        }
        module0559.f34517();
        return var3;
    }
    
    public static SubLObject f34846() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)$ic1$;
        final SubLObject var4 = module0173.f10962();
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        final SubLObject var6 = module0012.$g75$.currentBinding(var2);
        final SubLObject var7 = module0012.$g76$.currentBinding(var2);
        final SubLObject var8 = module0012.$g77$.currentBinding(var2);
        final SubLObject var9 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var3);
            SubLObject var10 = module0173.f10961();
            SubLObject var11 = (SubLObject)NIL;
            var11 = var10.first();
            while (NIL != var10) {
                final SubLObject var12 = var11;
                if (NIL == module0065.f4772(var12, (SubLObject)$ic2$)) {
                    final SubLObject var14_15 = var12;
                    if (NIL == module0065.f4775(var14_15, (SubLObject)$ic2$)) {
                        final SubLObject var13 = module0065.f4740(var14_15);
                        final SubLObject var14 = (SubLObject)NIL;
                        SubLObject var15;
                        SubLObject var16;
                        SubLObject var17;
                        SubLObject var18;
                        for (var15 = Sequences.length(var13), var16 = (SubLObject)NIL, var16 = (SubLObject)ZERO_INTEGER; var16.numL(var15); var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER)) {
                            var17 = ((NIL != var14) ? Numbers.subtract(var15, var16, (SubLObject)ONE_INTEGER) : var16);
                            var18 = Vectors.aref(var13, var17);
                            if (NIL == module0065.f4749(var18) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                                if (NIL != module0065.f4749(var18)) {
                                    var18 = (SubLObject)$ic2$;
                                }
                                var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
                                module0012.note_percent_progress(var5, var4);
                                if (NIL != module0563.f34732(var18)) {
                                    module0559.f34347(var18);
                                }
                            }
                        }
                    }
                    final SubLObject var22_23 = var12;
                    if (NIL == module0065.f4777(var22_23) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                        final SubLObject var19 = module0065.f4738(var22_23);
                        SubLObject var20 = module0065.f4739(var22_23);
                        final SubLObject var21 = module0065.f4734(var22_23);
                        final SubLObject var22 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic2$)) ? NIL : $ic2$);
                        while (var20.numL(var21)) {
                            final SubLObject var23 = Hashtables.gethash_without_values(var20, var19, var22);
                            if (NIL == module0065.f4773((SubLObject)$ic2$) || NIL == module0065.f4749(var23)) {
                                var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
                                module0012.note_percent_progress(var5, var4);
                                if (NIL != module0563.f34732(var23)) {
                                    module0559.f34347(var23);
                                }
                            }
                            var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var9, var2);
            module0012.$g77$.rebind(var8, var2);
            module0012.$g76$.rebind(var7, var2);
            module0012.$g75$.rebind(var6, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34847() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = assertion_handles_oc.f11010();
        final SubLObject var4 = (SubLObject)$ic3$;
        final SubLObject var5 = module0065.f4733(var3);
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var4) : var4;
        final SubLObject var7 = module0012.$g75$.currentBinding(var2);
        final SubLObject var8 = module0012.$g76$.currentBinding(var2);
        final SubLObject var9 = module0012.$g77$.currentBinding(var2);
        final SubLObject var10 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var4);
            final SubLObject var13_31 = var3;
            if (NIL == module0065.f4772(var13_31, (SubLObject)$ic2$)) {
                final SubLObject var14_32 = var13_31;
                if (NIL == module0065.f4775(var14_32, (SubLObject)$ic2$)) {
                    final SubLObject var11 = module0065.f4740(var14_32);
                    final SubLObject var12 = (SubLObject)NIL;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                        var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                        var16 = Vectors.aref(var11, var15);
                        if (NIL == module0065.f4749(var16) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                            if (NIL != module0065.f4749(var16)) {
                                var16 = (SubLObject)$ic2$;
                            }
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            if (NIL != module0563.f34742(var16)) {
                                module0559.f34347(var16);
                            }
                        }
                    }
                }
                final SubLObject var22_34 = var13_31;
                if (NIL == module0065.f4777(var22_34) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                    final SubLObject var17 = module0065.f4738(var22_34);
                    SubLObject var18 = module0065.f4739(var22_34);
                    final SubLObject var19 = module0065.f4734(var22_34);
                    final SubLObject var20 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic2$)) ? NIL : $ic2$);
                    while (var18.numL(var19)) {
                        final SubLObject var21 = Hashtables.gethash_without_values(var18, var17, var20);
                        if (NIL == module0065.f4773((SubLObject)$ic2$) || NIL == module0065.f4749(var21)) {
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            if (NIL != module0563.f34742(var21)) {
                                module0559.f34347(var21);
                            }
                        }
                        var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var10, var2);
            module0012.$g77$.rebind(var9, var2);
            module0012.$g76$.rebind(var8, var2);
            module0012.$g75$.rebind(var7, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34848() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = deduction_handles_oc.f11634();
        final SubLObject var4 = (SubLObject)$ic5$;
        final SubLObject var5 = module0065.f4733(var3);
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var4) : var4;
        final SubLObject var7 = module0012.$g75$.currentBinding(var2);
        final SubLObject var8 = module0012.$g76$.currentBinding(var2);
        final SubLObject var9 = module0012.$g77$.currentBinding(var2);
        final SubLObject var10 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var4);
            final SubLObject var13_35 = var3;
            if (NIL == module0065.f4772(var13_35, (SubLObject)$ic2$)) {
                final SubLObject var14_36 = var13_35;
                if (NIL == module0065.f4775(var14_36, (SubLObject)$ic2$)) {
                    final SubLObject var11 = module0065.f4740(var14_36);
                    final SubLObject var12 = (SubLObject)NIL;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                        var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                        var16 = Vectors.aref(var11, var15);
                        if (NIL == module0065.f4749(var16) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                            if (NIL != module0065.f4749(var16)) {
                                var16 = (SubLObject)$ic2$;
                            }
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            if (NIL != module0563.f34772(var16)) {
                                module0559.f34347(var16);
                            }
                        }
                    }
                }
                final SubLObject var22_38 = var13_35;
                if (NIL == module0065.f4777(var22_38) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                    final SubLObject var17 = module0065.f4738(var22_38);
                    SubLObject var18 = module0065.f4739(var22_38);
                    final SubLObject var19 = module0065.f4734(var22_38);
                    final SubLObject var20 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic2$)) ? NIL : $ic2$);
                    while (var18.numL(var19)) {
                        final SubLObject var21 = Hashtables.gethash_without_values(var18, var17, var20);
                        if (NIL == module0065.f4773((SubLObject)$ic2$) || NIL == module0065.f4749(var21)) {
                            module0012.note_percent_progress(var6, var5);
                            var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                            if (NIL != module0563.f34772(var21)) {
                                module0559.f34347(var21);
                            }
                        }
                        var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var10, var2);
            module0012.$g77$.rebind(var9, var2);
            module0012.$g76$.rebind(var8, var2);
            module0012.$g75$.rebind(var7, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34849() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var4;
        final SubLObject var3 = var4 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0034.$g879$.currentBinding(var2);
        try {
            module0034.$g879$.bind(var4, var2);
            SubLObject var6 = (SubLObject)NIL;
            if (NIL != var4 && NIL == module0034.f1842(var4)) {
                var6 = module0034.f1869(var4);
                final SubLObject var7 = Threads.current_process();
                if (NIL == var6) {
                    module0034.f1873(var4, var7);
                }
                else if (!var6.eql(var7)) {
                    Errors.error((SubLObject)$ic6$);
                }
            }
            try {
                final SubLObject var8 = assertion_handles_oc.f11010();
                final SubLObject var9 = (SubLObject)$ic7$;
                final SubLObject var10 = module0065.f4733(var8);
                SubLObject var11 = (SubLObject)ZERO_INTEGER;
                assert NIL != Types.stringp(var9) : var9;
                final SubLObject var4_43 = module0012.$g75$.currentBinding(var2);
                final SubLObject var12 = module0012.$g76$.currentBinding(var2);
                final SubLObject var13 = module0012.$g77$.currentBinding(var2);
                final SubLObject var14 = module0012.$g78$.currentBinding(var2);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
                    module0012.$g76$.bind((SubLObject)NIL, var2);
                    module0012.$g77$.bind((SubLObject)T, var2);
                    module0012.$g78$.bind(Time.get_universal_time(), var2);
                    module0012.f478(var9);
                    final SubLObject var13_44 = var8;
                    if (NIL == module0065.f4772(var13_44, (SubLObject)$ic2$)) {
                        final SubLObject var14_45 = var13_44;
                        if (NIL == module0065.f4775(var14_45, (SubLObject)$ic2$)) {
                            final SubLObject var15 = module0065.f4740(var14_45);
                            final SubLObject var16 = (SubLObject)NIL;
                            SubLObject var17;
                            SubLObject var18;
                            SubLObject var19;
                            SubLObject var20;
                            SubLObject var21;
                            SubLObject var22;
                            for (var17 = Sequences.length(var15), var18 = (SubLObject)NIL, var18 = (SubLObject)ZERO_INTEGER; var18.numL(var17); var18 = Numbers.add(var18, (SubLObject)ONE_INTEGER)) {
                                var19 = ((NIL != var16) ? Numbers.subtract(var17, var18, (SubLObject)ONE_INTEGER) : var18);
                                var20 = Vectors.aref(var15, var19);
                                if (NIL == module0065.f4749(var20) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                                    if (NIL != module0065.f4749(var20)) {
                                        var20 = (SubLObject)$ic2$;
                                    }
                                    module0012.note_percent_progress(var11, var10);
                                    var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                                    if (NIL != module0178.f11375(var20)) {
                                        var21 = (SubLObject)((NIL != f34850(module0178.f11295(var20))) ? NIL : $ic8$);
                                        var22 = (SubLObject)((NIL != f34850(module0178.f11297(var20))) ? NIL : $ic8$);
                                        if (NIL == var21 || NIL == var22) {
                                            module0178.f11354(var20, var21, (SubLObject)$ic8$, var22, (SubLObject)$ic8$);
                                        }
                                    }
                                }
                            }
                        }
                        final SubLObject var22_48 = var13_44;
                        if (NIL == module0065.f4777(var22_48) || NIL == module0065.f4773((SubLObject)$ic2$)) {
                            final SubLObject var23 = module0065.f4738(var22_48);
                            SubLObject var24 = module0065.f4739(var22_48);
                            final SubLObject var25 = module0065.f4734(var22_48);
                            final SubLObject var26 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic2$)) ? NIL : $ic2$);
                            while (var24.numL(var25)) {
                                final SubLObject var27 = Hashtables.gethash_without_values(var24, var23, var26);
                                if (NIL == module0065.f4773((SubLObject)$ic2$) || NIL == module0065.f4749(var27)) {
                                    module0012.note_percent_progress(var11, var10);
                                    var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                                    if (NIL != module0178.f11375(var27)) {
                                        final SubLObject var28 = (SubLObject)((NIL != f34850(module0178.f11295(var27))) ? NIL : $ic8$);
                                        final SubLObject var29 = (SubLObject)((NIL != f34850(module0178.f11297(var27))) ? NIL : $ic8$);
                                        if (NIL == var28 || NIL == var29) {
                                            module0178.f11354(var27, var28, (SubLObject)$ic8$, var29, (SubLObject)$ic8$);
                                        }
                                    }
                                }
                                var24 = Numbers.add(var24, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var14, var2);
                    module0012.$g77$.rebind(var13, var2);
                    module0012.$g76$.rebind(var12, var2);
                    module0012.$g75$.rebind(var4_43, var2);
                }
            }
            finally {
                final SubLObject var4_44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                    if (NIL != var4 && NIL == var6) {
                        module0034.f1873(var4, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var4_44, var2);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var5, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34850(final SubLObject var50) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var50) && NIL == f34851(var50));
    }
    
    public static SubLObject f34852(final SubLObject var21) {
        return Numbers.plusp(module0217.f14221(var21, (SubLObject)ONE_INTEGER, $ic10$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f34851(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0034.$g879$.getDynamicValue(var22);
        SubLObject var24 = (SubLObject)NIL;
        if (NIL == var23) {
            return f34852(var21);
        }
        var24 = module0034.f1857(var23, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
        if (NIL == var24) {
            var24 = module0034.f1807(module0034.f1842(var23), (SubLObject)$ic9$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var23, (SubLObject)$ic9$, var24);
        }
        SubLObject var25 = module0034.f1814(var24, var21, (SubLObject)$ic11$);
        if (var25 == $ic11$) {
            var25 = Values.arg2(var22.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f34852(var21)));
            module0034.f1816(var24, var21, var25, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var25);
    }
    
    public static SubLObject f34853(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0559.f34397(var1, $g4131$.getDynamicValue(var2));
    }
    
    public static SubLObject f34854(final SubLObject var33) {
        if (NIL != assertion_handles_oc.f11035(var33)) {
            $g4132$.setGlobalValue((SubLObject)ConsesLow.cons(var33, $g4132$.getGlobalValue()));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34855() {
        $g4132$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34856() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = $g4132$.getGlobalValue();
        module0012.$g82$.setDynamicValue((SubLObject)$ic13$, var2);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var2);
        module0012.$g83$.setDynamicValue(Sequences.length(var3), var2);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
        final SubLObject var4 = module0012.$g75$.currentBinding(var2);
        final SubLObject var5 = module0012.$g76$.currentBinding(var2);
        final SubLObject var6 = module0012.$g77$.currentBinding(var2);
        final SubLObject var7 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(module0012.$g82$.getDynamicValue(var2));
            SubLObject var8 = var3;
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var2), module0012.$g83$.getDynamicValue(var2));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var2), (SubLObject)ONE_INTEGER), var2);
                module0559.f34348(var9);
                var8 = var8.rest();
                var9 = var8.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var7, var2);
            module0012.$g77$.rebind(var6, var2);
            module0012.$g76$.rebind(var5, var2);
            module0012.$g75$.rebind(var4, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34857() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34844", "S#37951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34845", "S#37953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34846", "S#38222", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34847", "S#38223", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34848", "S#38224", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34849", "S#37956", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34850", "S#38225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34852", "S#38226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34851", "S#38227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34853", "S#37952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34854", "S#38174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34855", "S#38173", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0565", "f34856", "S#38228", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34858() {
        $g4130$ = SubLFiles.defparameter("S#38229", (SubLObject)$ic0$);
        $g4131$ = SubLFiles.defparameter("S#38230", (SubLObject)$ic12$);
        $g4132$ = SubLFiles.deflexical("S#38231", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34859() {
        module0034.f1895((SubLObject)$ic9$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f34857();
    }
    
    public void initializeVariables() {
        f34858();
    }
    
    public void runTopLevelForms() {
        f34859();
    }
    
    static {
        me = (SubLFile)new module0565();
        $g4130$ = null;
        $g4131$ = null;
        $g4132$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeSymbol("S#38222", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeSymbol("S#38223", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeSymbol("S#38224", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("SCOPE-COMPLETELY-SPECIFIED?"), (SubLObject)T));
        $ic1$ = makeString("scoping KBS FORTs");
        $ic2$ = makeKeyword("SKIP");
        $ic3$ = makeString("scoping KBS assertions");
        $ic4$ = makeSymbol("STRINGP");
        $ic5$ = makeString("scoping KBS deductions");
        $ic6$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic7$ = makeString("cleaning KBS assert info");
        $ic8$ = makeKeyword("UNCHANGED");
        $ic9$ = makeSymbol("S#38227", "CYC");
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic11$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeSymbol("S#38228", "CYC")));
        $ic13$ = makeString("scoping KBS splicing assertions");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 237 ms
	
	Decompiled with Procyon 0.5.32.
*/