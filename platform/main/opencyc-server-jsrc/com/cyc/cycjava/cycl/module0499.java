package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0499 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0499";
    public static final String myFingerPrint = "e06891f89760ffff6ea3c34c251eff40f06c85be4c6c16367d360cbb275b3adf";
    private static SubLSymbol $g3778$;
    private static SubLSymbol $g3779$;
    private static SubLSymbol $g3780$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    
    public static SubLObject f32188(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0367.f25076(var3);
        final SubLObject var6 = Types.sublisp_null(var5);
        final SubLObject var7 = (SubLObject)makeBoolean(NIL != var6 || NIL != inference_datastructures_inference_oc.f25613(var5, module0340.f22786((SubLObject)$ic3$)));
        final SubLObject var8 = (SubLObject)makeBoolean(NIL != var6 || NIL != inference_datastructures_inference_oc.f25613(var5, module0340.f22786((SubLObject)$ic4$)));
        SubLObject var9 = (SubLObject)makeBoolean(NIL != var6 || NIL != inference_datastructures_inference_oc.f25613(var5, module0340.f22786((SubLObject)$ic5$)));
        if (NIL != var5 && $ic6$ == inference_datastructures_inference_oc.f25513(var5)) {
            var9 = (SubLObject)NIL;
        }
        if (NIL == var7) {
            if (NIL == var8 && NIL == var9) {
                return (SubLObject)NIL;
            }
            return (SubLObject)$ic7$;
        }
        else {
            if (NIL != module0193.f12105(var1)) {
                return (SubLObject)$ic7$;
            }
            if (NIL != module0322.f21736() && NIL != module0337.f22630(var1, (SubLObject)$ic8$) && NIL != module0322.f21730(module0205.f13333(var1), (SubLObject)TWO_INTEGER)) {
                return (SubLObject)$ic7$;
            }
            if (NIL != module0322.f21736() && NIL != module0337.f22630(var1, (SubLObject)$ic9$) && NIL != module0322.f21730(module0205.f13333(var1), (SubLObject)ONE_INTEGER)) {
                return (SubLObject)$ic7$;
            }
            if (NIL == module0173.f10955(module0205.f13333(var1)) || NIL == f32189(var1) || NIL == f32190(var1, var2)) {
                return (SubLObject)NIL;
            }
            if (NIL == module0358.f23678() && NIL == f32191(var1)) {
                return (SubLObject)$ic10$;
            }
            if ($ic11$ == var3) {
                return (SubLObject)$ic0$;
            }
            if (NIL != var9 && $ic12$ == inference_datastructures_inference_oc.f25513(var5)) {
                return (SubLObject)$ic7$;
            }
            if (NIL == var8 && NIL == var9) {
                return (SubLObject)$ic10$;
            }
            return $g3778$.getDynamicValue(var4);
        }
    }
    
    public static SubLObject f32191(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = module0205.f13207(var1, (SubLObject)$ic13$);
        SubLObject var4;
        SubLObject var5;
        for (var4 = (SubLObject)NIL, var4 = var3; NIL == var2 && NIL != var4; var4 = var4.rest()) {
            var5 = var4.first();
            if (NIL != module0193.f12105(var5)) {
                var2 = (SubLObject)T;
            }
        }
        return var2;
    }
    
    public static SubLObject f32190(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0205.f13333(var1);
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        final SubLObject var6 = module0205.f13207(var1, (SubLObject)$ic13$);
        SubLObject var7;
        SubLObject var8;
        for (var7 = (SubLObject)NIL, var7 = var6; NIL == var3 && NIL != var7; var7 = var7.rest()) {
            var8 = var7.first();
            var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
            if (NIL != module0035.f2437(var2, var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0318.f21457(var4, var5)) {
                var3 = var5;
            }
        }
        return var3;
    }
    
    public static SubLObject f32192(final SubLObject var1, SubLObject var17, SubLObject var18) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)$ic14$;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = var17;
        final SubLObject var22 = module0147.$g2095$.currentBinding(var19);
        final SubLObject var23 = module0147.$g2094$.currentBinding(var19);
        final SubLObject var24 = module0147.$g2096$.currentBinding(var19);
        try {
            module0147.$g2095$.bind(module0147.f9545(var21), var19);
            module0147.$g2094$.bind(module0147.f9546(var21), var19);
            module0147.$g2096$.bind(module0147.f9549(var21), var19);
            var20 = (SubLObject)makeBoolean(NIL != f32193(var1, var18) || NIL != f32194(var1, var18) || NIL != f32195(var1, var18));
        }
        finally {
            module0147.$g2096$.rebind(var24, var19);
            module0147.$g2094$.rebind(var23, var19);
            module0147.$g2095$.rebind(var22, var19);
        }
        return var20;
    }
    
    public static SubLObject f32193(final SubLObject var1, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)$ic14$;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = module0349.f23449(var1, var18);
        final SubLObject var23;
        final SubLObject var22 = var23 = module0158.f10294(var21);
        if (var23.eql((SubLObject)$ic15$)) {
            var19.resetMultipleValues();
            final SubLObject var24 = module0158.f10297(var21);
            final SubLObject var25 = var19.secondMultipleValue();
            final SubLObject var26 = var19.thirdMultipleValue();
            var19.resetMultipleValues();
            if (NIL != var25) {
                if (NIL != var26) {
                    final SubLObject var27 = var26;
                    if (NIL != module0158.f10010(var24, var25, var27)) {
                        final SubLObject var28 = module0158.f10011(var24, var25, var27);
                        SubLObject var29 = var20;
                        final SubLObject var30 = (SubLObject)NIL;
                        while (NIL == var29) {
                            final SubLObject var31 = module0052.f3695(var28, var30);
                            final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                            if (NIL != var32) {
                                SubLObject var33 = (SubLObject)NIL;
                                try {
                                    var33 = module0158.f10316(var31, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                    SubLObject var32_37 = var20;
                                    final SubLObject var33_38 = (SubLObject)NIL;
                                    while (NIL == var32_37) {
                                        final SubLObject var34 = module0052.f3695(var33, var33_38);
                                        final SubLObject var35_40 = (SubLObject)makeBoolean(!var33_38.eql(var34));
                                        if (NIL != var35_40 && NIL != module0351.f23568(var34)) {
                                            final SubLObject var35 = module0178.f11285(var34);
                                            final SubLObject var36 = module0235.f15476(var1, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            if (NIL != var36) {
                                                var20 = (SubLObject)T;
                                            }
                                        }
                                        var32_37 = (SubLObject)makeBoolean(NIL == var35_40 || NIL != var20);
                                    }
                                }
                                finally {
                                    final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                        if (NIL != var33) {
                                            module0158.f10319(var33);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var37, var19);
                                    }
                                }
                            }
                            var29 = (SubLObject)makeBoolean(NIL == var32 || NIL != var20);
                        }
                    }
                }
                else {
                    final SubLObject var27 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var24, var25, var27)) {
                        final SubLObject var28 = module0158.f10011(var24, var25, var27);
                        SubLObject var29 = var20;
                        final SubLObject var30 = (SubLObject)NIL;
                        while (NIL == var29) {
                            final SubLObject var31 = module0052.f3695(var28, var30);
                            final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                            if (NIL != var32) {
                                SubLObject var33 = (SubLObject)NIL;
                                try {
                                    var33 = module0158.f10316(var31, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                    SubLObject var32_38 = var20;
                                    final SubLObject var33_39 = (SubLObject)NIL;
                                    while (NIL == var32_38) {
                                        final SubLObject var34 = module0052.f3695(var33, var33_39);
                                        final SubLObject var35_41 = (SubLObject)makeBoolean(!var33_39.eql(var34));
                                        if (NIL != var35_41 && NIL != module0351.f23568(var34)) {
                                            final SubLObject var35 = module0178.f11285(var34);
                                            final SubLObject var36 = module0235.f15476(var1, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            if (NIL != var36) {
                                                var20 = (SubLObject)T;
                                            }
                                        }
                                        var32_38 = (SubLObject)makeBoolean(NIL == var35_41 || NIL != var20);
                                    }
                                }
                                finally {
                                    final SubLObject var38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                        if (NIL != var33) {
                                            module0158.f10319(var33);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var38, var19);
                                    }
                                }
                            }
                            var29 = (SubLObject)makeBoolean(NIL == var32 || NIL != var20);
                        }
                    }
                }
            }
            else if (NIL != var26) {
                final SubLObject var27 = var26;
                if (NIL != module0158.f10010(var24, (SubLObject)NIL, var27)) {
                    final SubLObject var28 = module0158.f10011(var24, (SubLObject)NIL, var27);
                    SubLObject var29 = var20;
                    final SubLObject var30 = (SubLObject)NIL;
                    while (NIL == var29) {
                        final SubLObject var31 = module0052.f3695(var28, var30);
                        final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                        if (NIL != var32) {
                            SubLObject var33 = (SubLObject)NIL;
                            try {
                                var33 = module0158.f10316(var31, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                SubLObject var32_39 = var20;
                                final SubLObject var33_40 = (SubLObject)NIL;
                                while (NIL == var32_39) {
                                    final SubLObject var34 = module0052.f3695(var33, var33_40);
                                    final SubLObject var35_42 = (SubLObject)makeBoolean(!var33_40.eql(var34));
                                    if (NIL != var35_42 && NIL != module0351.f23568(var34)) {
                                        final SubLObject var35 = module0178.f11285(var34);
                                        final SubLObject var36 = module0235.f15476(var1, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        if (NIL != var36) {
                                            var20 = (SubLObject)T;
                                        }
                                    }
                                    var32_39 = (SubLObject)makeBoolean(NIL == var35_42 || NIL != var20);
                                }
                            }
                            finally {
                                final SubLObject var39 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                    if (NIL != var33) {
                                        module0158.f10319(var33);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var39, var19);
                                }
                            }
                        }
                        var29 = (SubLObject)makeBoolean(NIL == var32 || NIL != var20);
                    }
                }
            }
            else {
                final SubLObject var27 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var24, (SubLObject)NIL, var27)) {
                    final SubLObject var28 = module0158.f10011(var24, (SubLObject)NIL, var27);
                    SubLObject var29 = var20;
                    final SubLObject var30 = (SubLObject)NIL;
                    while (NIL == var29) {
                        final SubLObject var31 = module0052.f3695(var28, var30);
                        final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                        if (NIL != var32) {
                            SubLObject var33 = (SubLObject)NIL;
                            try {
                                var33 = module0158.f10316(var31, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                SubLObject var32_40 = var20;
                                final SubLObject var33_41 = (SubLObject)NIL;
                                while (NIL == var32_40) {
                                    final SubLObject var34 = module0052.f3695(var33, var33_41);
                                    final SubLObject var35_43 = (SubLObject)makeBoolean(!var33_41.eql(var34));
                                    if (NIL != var35_43 && NIL != module0351.f23568(var34)) {
                                        final SubLObject var35 = module0178.f11285(var34);
                                        final SubLObject var36 = module0235.f15476(var1, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        if (NIL != var36) {
                                            var20 = (SubLObject)T;
                                        }
                                    }
                                    var32_40 = (SubLObject)makeBoolean(NIL == var35_43 || NIL != var20);
                                }
                            }
                            finally {
                                final SubLObject var40 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                    if (NIL != var33) {
                                        module0158.f10319(var33);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var40, var19);
                                }
                            }
                        }
                        var29 = (SubLObject)makeBoolean(NIL == var32 || NIL != var20);
                    }
                }
            }
        }
        else if (var23.eql((SubLObject)$ic17$)) {
            final SubLObject var41 = module0158.f10299(var21);
            if (NIL != module0158.f10038(var41)) {
                final SubLObject var42 = (SubLObject)NIL;
                final SubLObject var43 = module0012.$g73$.currentBinding(var19);
                final SubLObject var44 = module0012.$g65$.currentBinding(var19);
                final SubLObject var45 = module0012.$g67$.currentBinding(var19);
                final SubLObject var46 = module0012.$g68$.currentBinding(var19);
                final SubLObject var47 = module0012.$g66$.currentBinding(var19);
                final SubLObject var48 = module0012.$g69$.currentBinding(var19);
                final SubLObject var49 = module0012.$g70$.currentBinding(var19);
                final SubLObject var50 = module0012.$silent_progressP$.currentBinding(var19);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var19);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var19), var19);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var19);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var19);
                    module0012.$g70$.bind((SubLObject)T, var19);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var42) ? module0012.$silent_progressP$.getDynamicValue(var19) : T), var19);
                    module0012.f474(var42);
                    final SubLObject var51 = module0158.f10039(var41);
                    SubLObject var52 = var20;
                    final SubLObject var53 = (SubLObject)NIL;
                    while (NIL == var52) {
                        final SubLObject var54 = module0052.f3695(var51, var53);
                        final SubLObject var55 = (SubLObject)makeBoolean(!var53.eql(var54));
                        if (NIL != var55) {
                            module0012.f476();
                            SubLObject var56 = (SubLObject)NIL;
                            try {
                                var56 = module0158.f10316(var54, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                SubLObject var32_41 = var20;
                                final SubLObject var33_42 = (SubLObject)NIL;
                                while (NIL == var32_41) {
                                    final SubLObject var57 = module0052.f3695(var56, var33_42);
                                    final SubLObject var35_44 = (SubLObject)makeBoolean(!var33_42.eql(var57));
                                    if (NIL != var35_44 && NIL != module0351.f23568(var57)) {
                                        final SubLObject var58 = module0178.f11285(var57);
                                        final SubLObject var59 = module0235.f15476(var1, var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        if (NIL != var59) {
                                            var20 = (SubLObject)T;
                                        }
                                    }
                                    var32_41 = (SubLObject)makeBoolean(NIL == var35_44 || NIL != var20);
                                }
                            }
                            finally {
                                final SubLObject var21_63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                    if (NIL != var56) {
                                        module0158.f10319(var56);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var21_63, var19);
                                }
                            }
                        }
                        var52 = (SubLObject)makeBoolean(NIL == var55 || NIL != var20);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var50, var19);
                    module0012.$g70$.rebind(var49, var19);
                    module0012.$g69$.rebind(var48, var19);
                    module0012.$g66$.rebind(var47, var19);
                    module0012.$g68$.rebind(var46, var19);
                    module0012.$g67$.rebind(var45, var19);
                    module0012.$g65$.rebind(var44, var19);
                    module0012.$g73$.rebind(var43, var19);
                }
            }
        }
        else if (var23.eql((SubLObject)$ic18$)) {
            SubLObject var60;
            SubLObject var61;
            SubLObject var62;
            SubLObject var63;
            for (var60 = (SubLObject)NIL, var60 = module0218.f14453(module0158.f10301(var21), (SubLObject)UNPROVIDED); NIL == var20 && NIL != var60; var60 = var60.rest()) {
                var61 = var60.first();
                if ((NIL == module0130.f8518(var18) || NIL != module0178.f11343(var61, module0130.f8518(var18))) && NIL != module0351.f23568(var61)) {
                    var62 = module0178.f11285(var61);
                    var63 = module0235.f15476(var1, var62, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != var63) {
                        var20 = (SubLObject)T;
                    }
                }
            }
        }
        else {
            module0158.f10295(var21, var22);
        }
        return var20;
    }
    
    public static SubLObject f32194(final SubLObject var1, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)$ic14$;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = module0205.f13333(var1);
        final SubLObject var22 = module0443.f30755(var1);
        final SubLObject var23 = module0148.$g2099$.currentBinding(var19);
        final SubLObject var24 = module0018.$g637$.currentBinding(var19);
        final SubLObject var25 = module0018.$g638$.currentBinding(var19);
        try {
            module0148.$g2099$.bind(module0148.f9603(var18), var19);
            module0018.$g637$.bind(var1, var19);
            module0018.$g638$.bind(var18, var19);
            final SubLObject var26 = module0217.f14404(var22, module0130.f8518(var18), (SubLObject)NIL);
            final SubLObject var28;
            final SubLObject var27 = var28 = module0158.f10294(var26);
            if (var28.eql((SubLObject)$ic15$)) {
                var19.resetMultipleValues();
                final SubLObject var29 = module0158.f10297(var26);
                final SubLObject var30 = var19.secondMultipleValue();
                final SubLObject var31 = var19.thirdMultipleValue();
                var19.resetMultipleValues();
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
                                        var38 = module0158.f10316(var36, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                        SubLObject var32_67 = (SubLObject)NIL;
                                        final SubLObject var33_68 = (SubLObject)NIL;
                                        while (NIL == var32_67) {
                                            final SubLObject var39 = module0052.f3695(var38, var33_68);
                                            final SubLObject var35_70 = (SubLObject)makeBoolean(!var33_68.eql(var39));
                                            if (NIL != var35_70 && NIL != f32196(var39)) {
                                                var20 = (SubLObject)T;
                                            }
                                            var32_67 = (SubLObject)makeBoolean(NIL == var35_70);
                                        }
                                    }
                                    finally {
                                        final SubLObject var21_71 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                            if (NIL != var38) {
                                                module0158.f10319(var38);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_71, var19);
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
                                        var38 = module0158.f10316(var36, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                        SubLObject var32_68 = (SubLObject)NIL;
                                        final SubLObject var33_69 = (SubLObject)NIL;
                                        while (NIL == var32_68) {
                                            final SubLObject var39 = module0052.f3695(var38, var33_69);
                                            final SubLObject var35_71 = (SubLObject)makeBoolean(!var33_69.eql(var39));
                                            if (NIL != var35_71 && NIL != f32196(var39)) {
                                                var20 = (SubLObject)T;
                                            }
                                            var32_68 = (SubLObject)makeBoolean(NIL == var35_71);
                                        }
                                    }
                                    finally {
                                        final SubLObject var21_72 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                            if (NIL != var38) {
                                                module0158.f10319(var38);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_72, var19);
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
                                    var38 = module0158.f10316(var36, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                    SubLObject var32_69 = (SubLObject)NIL;
                                    final SubLObject var33_70 = (SubLObject)NIL;
                                    while (NIL == var32_69) {
                                        final SubLObject var39 = module0052.f3695(var38, var33_70);
                                        final SubLObject var35_72 = (SubLObject)makeBoolean(!var33_70.eql(var39));
                                        if (NIL != var35_72 && NIL != f32196(var39)) {
                                            var20 = (SubLObject)T;
                                        }
                                        var32_69 = (SubLObject)makeBoolean(NIL == var35_72);
                                    }
                                }
                                finally {
                                    final SubLObject var21_73 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                        if (NIL != var38) {
                                            module0158.f10319(var38);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var21_73, var19);
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
                                    var38 = module0158.f10316(var36, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                    SubLObject var32_70 = (SubLObject)NIL;
                                    final SubLObject var33_71 = (SubLObject)NIL;
                                    while (NIL == var32_70) {
                                        final SubLObject var39 = module0052.f3695(var38, var33_71);
                                        final SubLObject var35_73 = (SubLObject)makeBoolean(!var33_71.eql(var39));
                                        if (NIL != var35_73 && NIL != f32196(var39)) {
                                            var20 = (SubLObject)T;
                                        }
                                        var32_70 = (SubLObject)makeBoolean(NIL == var35_73);
                                    }
                                }
                                finally {
                                    final SubLObject var21_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                        if (NIL != var38) {
                                            module0158.f10319(var38);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var21_74, var19);
                                    }
                                }
                            }
                            var34 = (SubLObject)makeBoolean(NIL == var37);
                        }
                    }
                }
            }
            else if (var28.eql((SubLObject)$ic17$)) {
                final SubLObject var40 = module0158.f10299(var26);
                if (NIL != module0158.f10038(var40)) {
                    final SubLObject var41 = (SubLObject)NIL;
                    final SubLObject var21_75 = module0012.$g73$.currentBinding(var19);
                    final SubLObject var22_85 = module0012.$g65$.currentBinding(var19);
                    final SubLObject var23_86 = module0012.$g67$.currentBinding(var19);
                    final SubLObject var42 = module0012.$g68$.currentBinding(var19);
                    final SubLObject var43 = module0012.$g66$.currentBinding(var19);
                    final SubLObject var44 = module0012.$g69$.currentBinding(var19);
                    final SubLObject var45 = module0012.$g70$.currentBinding(var19);
                    final SubLObject var46 = module0012.$silent_progressP$.currentBinding(var19);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var19);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var19), var19);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var19);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var19);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var19);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var19);
                        module0012.$g70$.bind((SubLObject)T, var19);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var41) ? module0012.$silent_progressP$.getDynamicValue(var19) : T), var19);
                        module0012.f474(var41);
                        final SubLObject var47 = module0158.f10039(var40);
                        SubLObject var48 = (SubLObject)NIL;
                        final SubLObject var49 = (SubLObject)NIL;
                        while (NIL == var48) {
                            final SubLObject var50 = module0052.f3695(var47, var49);
                            final SubLObject var51 = (SubLObject)makeBoolean(!var49.eql(var50));
                            if (NIL != var51) {
                                module0012.f476();
                                SubLObject var52 = (SubLObject)NIL;
                                try {
                                    var52 = module0158.f10316(var50, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                    SubLObject var32_71 = (SubLObject)NIL;
                                    final SubLObject var33_72 = (SubLObject)NIL;
                                    while (NIL == var32_71) {
                                        final SubLObject var53 = module0052.f3695(var52, var33_72);
                                        final SubLObject var35_74 = (SubLObject)makeBoolean(!var33_72.eql(var53));
                                        if (NIL != var35_74 && NIL != f32196(var53)) {
                                            var20 = (SubLObject)T;
                                        }
                                        var32_71 = (SubLObject)makeBoolean(NIL == var35_74);
                                    }
                                }
                                finally {
                                    final SubLObject var21_76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                        if (NIL != var52) {
                                            module0158.f10319(var52);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var21_76, var19);
                                    }
                                }
                            }
                            var48 = (SubLObject)makeBoolean(NIL == var51);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var46, var19);
                        module0012.$g70$.rebind(var45, var19);
                        module0012.$g69$.rebind(var44, var19);
                        module0012.$g66$.rebind(var43, var19);
                        module0012.$g68$.rebind(var42, var19);
                        module0012.$g67$.rebind(var23_86, var19);
                        module0012.$g65$.rebind(var22_85, var19);
                        module0012.$g73$.rebind(var21_75, var19);
                    }
                }
            }
            else if (var28.eql((SubLObject)$ic18$)) {
                SubLObject var54 = module0218.f14453(module0158.f10301(var26), (SubLObject)UNPROVIDED);
                SubLObject var55 = (SubLObject)NIL;
                var55 = var54.first();
                while (NIL != var54) {
                    if ((NIL == module0130.f8518(var18) || NIL != module0178.f11343(var55, module0130.f8518(var18))) && NIL != f32196(var55)) {
                        var20 = (SubLObject)T;
                    }
                    var54 = var54.rest();
                    var55 = var54.first();
                }
            }
            else {
                module0158.f10295(var26, var27);
            }
        }
        finally {
            module0018.$g638$.rebind(var25, var19);
            module0018.$g637$.rebind(var24, var19);
            module0148.$g2099$.rebind(var23, var19);
        }
        return var20;
    }
    
    public static SubLObject f32196(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)NIL;
        if (NIL != module0351.f23568(var39)) {
            final SubLObject var42 = module0178.f11285(var39);
            final SubLObject var43 = module0202.f12832(var42, (SubLObject)UNPROVIDED);
            final SubLObject var44 = module0202.f12832(module0018.$g637$.getDynamicValue(var40), (SubLObject)UNPROVIDED);
            if (!var43.eql(var44)) {
                final SubLObject var45 = module0235.f15477(module0018.$g637$.getDynamicValue(var40), var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var45) {
                    var41 = (SubLObject)T;
                }
            }
        }
        return var41;
    }
    
    public static SubLObject f32195(final SubLObject var1, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)$ic14$;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        SubLObject var20 = (SubLObject)NIL;
        if (NIL != module0202.f12598(var1)) {
            final SubLObject var21 = module0205.f13333(var1);
            final SubLObject var22 = module0443.f30755(module0439.f30674(var1));
            final SubLObject var23 = module0148.$g2099$.currentBinding(var19);
            final SubLObject var24 = module0018.$g637$.currentBinding(var19);
            final SubLObject var25 = module0018.$g638$.currentBinding(var19);
            try {
                module0148.$g2099$.bind(module0148.f9604(var18), var19);
                module0018.$g637$.bind(var1, var19);
                module0018.$g638$.bind(var18, var19);
                final SubLObject var26 = module0217.f14404(var22, module0130.f8518(var18), (SubLObject)NIL);
                final SubLObject var28;
                final SubLObject var27 = var28 = module0158.f10294(var26);
                if (var28.eql((SubLObject)$ic15$)) {
                    var19.resetMultipleValues();
                    final SubLObject var29 = module0158.f10297(var26);
                    final SubLObject var30 = var19.secondMultipleValue();
                    final SubLObject var31 = var19.thirdMultipleValue();
                    var19.resetMultipleValues();
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
                                            var38 = module0158.f10316(var36, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                            SubLObject var32_95 = (SubLObject)NIL;
                                            final SubLObject var33_96 = (SubLObject)NIL;
                                            while (NIL == var32_95) {
                                                final SubLObject var39 = module0052.f3695(var38, var33_96);
                                                final SubLObject var35_97 = (SubLObject)makeBoolean(!var33_96.eql(var39));
                                                if (NIL != var35_97 && NIL != f32197(var39)) {
                                                    var20 = (SubLObject)T;
                                                }
                                                var32_95 = (SubLObject)makeBoolean(NIL == var35_97);
                                            }
                                        }
                                        finally {
                                            final SubLObject var21_98 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                                if (NIL != var38) {
                                                    module0158.f10319(var38);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var21_98, var19);
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
                                            var38 = module0158.f10316(var36, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                            SubLObject var32_96 = (SubLObject)NIL;
                                            final SubLObject var33_97 = (SubLObject)NIL;
                                            while (NIL == var32_96) {
                                                final SubLObject var39 = module0052.f3695(var38, var33_97);
                                                final SubLObject var35_98 = (SubLObject)makeBoolean(!var33_97.eql(var39));
                                                if (NIL != var35_98 && NIL != f32197(var39)) {
                                                    var20 = (SubLObject)T;
                                                }
                                                var32_96 = (SubLObject)makeBoolean(NIL == var35_98);
                                            }
                                        }
                                        finally {
                                            final SubLObject var21_99 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                                if (NIL != var38) {
                                                    module0158.f10319(var38);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var21_99, var19);
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
                                        var38 = module0158.f10316(var36, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                        SubLObject var32_97 = (SubLObject)NIL;
                                        final SubLObject var33_98 = (SubLObject)NIL;
                                        while (NIL == var32_97) {
                                            final SubLObject var39 = module0052.f3695(var38, var33_98);
                                            final SubLObject var35_99 = (SubLObject)makeBoolean(!var33_98.eql(var39));
                                            if (NIL != var35_99 && NIL != f32197(var39)) {
                                                var20 = (SubLObject)T;
                                            }
                                            var32_97 = (SubLObject)makeBoolean(NIL == var35_99);
                                        }
                                    }
                                    finally {
                                        final SubLObject var21_100 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                            if (NIL != var38) {
                                                module0158.f10319(var38);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_100, var19);
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
                                        var38 = module0158.f10316(var36, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                        SubLObject var32_98 = (SubLObject)NIL;
                                        final SubLObject var33_99 = (SubLObject)NIL;
                                        while (NIL == var32_98) {
                                            final SubLObject var39 = module0052.f3695(var38, var33_99);
                                            final SubLObject var35_100 = (SubLObject)makeBoolean(!var33_99.eql(var39));
                                            if (NIL != var35_100 && NIL != f32197(var39)) {
                                                var20 = (SubLObject)T;
                                            }
                                            var32_98 = (SubLObject)makeBoolean(NIL == var35_100);
                                        }
                                    }
                                    finally {
                                        final SubLObject var21_101 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                            if (NIL != var38) {
                                                module0158.f10319(var38);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_101, var19);
                                        }
                                    }
                                }
                                var34 = (SubLObject)makeBoolean(NIL == var37);
                            }
                        }
                    }
                }
                else if (var28.eql((SubLObject)$ic17$)) {
                    final SubLObject var40 = module0158.f10299(var26);
                    if (NIL != module0158.f10038(var40)) {
                        final SubLObject var41 = (SubLObject)NIL;
                        final SubLObject var21_102 = module0012.$g73$.currentBinding(var19);
                        final SubLObject var22_112 = module0012.$g65$.currentBinding(var19);
                        final SubLObject var23_113 = module0012.$g67$.currentBinding(var19);
                        final SubLObject var42 = module0012.$g68$.currentBinding(var19);
                        final SubLObject var43 = module0012.$g66$.currentBinding(var19);
                        final SubLObject var44 = module0012.$g69$.currentBinding(var19);
                        final SubLObject var45 = module0012.$g70$.currentBinding(var19);
                        final SubLObject var46 = module0012.$silent_progressP$.currentBinding(var19);
                        try {
                            module0012.$g73$.bind(Time.get_universal_time(), var19);
                            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var19), var19);
                            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var19);
                            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var19);
                            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var19);
                            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var19);
                            module0012.$g70$.bind((SubLObject)T, var19);
                            module0012.$silent_progressP$.bind((SubLObject)((NIL != var41) ? module0012.$silent_progressP$.getDynamicValue(var19) : T), var19);
                            module0012.f474(var41);
                            final SubLObject var47 = module0158.f10039(var40);
                            SubLObject var48 = (SubLObject)NIL;
                            final SubLObject var49 = (SubLObject)NIL;
                            while (NIL == var48) {
                                final SubLObject var50 = module0052.f3695(var47, var49);
                                final SubLObject var51 = (SubLObject)makeBoolean(!var49.eql(var50));
                                if (NIL != var51) {
                                    module0012.f476();
                                    SubLObject var52 = (SubLObject)NIL;
                                    try {
                                        var52 = module0158.f10316(var50, (SubLObject)$ic16$, module0130.f8518(var18), (SubLObject)NIL);
                                        SubLObject var32_99 = (SubLObject)NIL;
                                        final SubLObject var33_100 = (SubLObject)NIL;
                                        while (NIL == var32_99) {
                                            final SubLObject var53 = module0052.f3695(var52, var33_100);
                                            final SubLObject var35_101 = (SubLObject)makeBoolean(!var33_100.eql(var53));
                                            if (NIL != var35_101 && NIL != f32197(var53)) {
                                                var20 = (SubLObject)T;
                                            }
                                            var32_99 = (SubLObject)makeBoolean(NIL == var35_101);
                                        }
                                    }
                                    finally {
                                        final SubLObject var21_103 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                            if (NIL != var52) {
                                                module0158.f10319(var52);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var21_103, var19);
                                        }
                                    }
                                }
                                var48 = (SubLObject)makeBoolean(NIL == var51);
                            }
                            module0012.f475();
                        }
                        finally {
                            module0012.$silent_progressP$.rebind(var46, var19);
                            module0012.$g70$.rebind(var45, var19);
                            module0012.$g69$.rebind(var44, var19);
                            module0012.$g66$.rebind(var43, var19);
                            module0012.$g68$.rebind(var42, var19);
                            module0012.$g67$.rebind(var23_113, var19);
                            module0012.$g65$.rebind(var22_112, var19);
                            module0012.$g73$.rebind(var21_102, var19);
                        }
                    }
                }
                else if (var28.eql((SubLObject)$ic18$)) {
                    SubLObject var54 = module0218.f14453(module0158.f10301(var26), (SubLObject)UNPROVIDED);
                    SubLObject var55 = (SubLObject)NIL;
                    var55 = var54.first();
                    while (NIL != var54) {
                        if ((NIL == module0130.f8518(var18) || NIL != module0178.f11343(var55, module0130.f8518(var18))) && NIL != f32197(var55)) {
                            var20 = (SubLObject)T;
                        }
                        var54 = var54.rest();
                        var55 = var54.first();
                    }
                }
                else {
                    module0158.f10295(var26, var27);
                }
            }
            finally {
                module0018.$g638$.rebind(var25, var19);
                module0018.$g637$.rebind(var24, var19);
                module0148.$g2099$.rebind(var23, var19);
            }
        }
        return var20;
    }
    
    public static SubLObject f32197(final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)NIL;
        if (NIL != module0351.f23568(var39)) {
            final SubLObject var42 = module0178.f11285(var39);
            final SubLObject var43 = module0202.f12832(var42, (SubLObject)UNPROVIDED);
            final SubLObject var44 = module0202.f12832(module0018.$g637$.getDynamicValue(var40), (SubLObject)UNPROVIDED);
            if (!var43.eql(var44)) {
                final SubLObject var45 = module0439.f30675(module0018.$g637$.getDynamicValue(var40));
                final SubLObject var46 = module0235.f15477(var45, var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var46) {
                    var41 = (SubLObject)T;
                }
            }
        }
        return var41;
    }
    
    public static SubLObject f32198(final SubLObject var1) {
        return f32199(module0205.f13333(var1), module0205.f13387(var1, (SubLObject)UNPROVIDED), module0205.f13388(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32199(final SubLObject var65, final SubLObject var119, final SubLObject var120) {
        return (SubLObject)makeBoolean(NIL == module0269.f17776(var65) || NIL == module0331.f22370(var119, var120, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32200(final SubLObject var1, SubLObject var17, SubLObject var18) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)$ic14$;
        }
        assert NIL != module0193.f12105(var1) : var1;
        return module0035.sublisp_boolean(module0321.f21702(var1, var17, (SubLObject)T, (SubLObject)NIL, (SubLObject)$ic6$, (SubLObject)T, Equality.eq(var18, (SubLObject)$ic21$)));
    }
    
    public static SubLObject f32201(SubLObject var1, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        assert NIL != module0193.f12105(var1) : var1;
        SubLObject var18 = (SubLObject)NIL;
        if (NIL != module0205.f13337(var1)) {
            var18 = (SubLObject)$ic21$;
            var1 = module0205.f13338(var1);
        }
        final SubLObject var19 = module0321.f21702(var1, var17, (SubLObject)NIL, (SubLObject)T, (SubLObject)NIL, (SubLObject)NIL, Equality.eq(var18, (SubLObject)$ic21$));
        if (NIL != var19) {
            SubLObject var21;
            final SubLObject var20 = var21 = Sort.sort(var19, (SubLObject)$ic22$, (SubLObject)UNPROVIDED).first();
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic23$);
            var22 = var21.first();
            var21 = var21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic23$);
            var23 = var21.first();
            var21 = var21.rest();
            if (NIL == var21) {
                return var23;
            }
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic23$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32202(final SubLObject var125, final SubLObject var126) {
        final SubLObject var127 = conses_high.second(var125);
        final SubLObject var128 = conses_high.second(var126);
        final SubLObject var129 = Sequences.length(var127);
        final SubLObject var130 = Sequences.length(var128);
        final SubLObject var131 = Sequences.length(module0035.f2110((SubLObject)$ic24$, var127, (SubLObject)UNPROVIDED));
        final SubLObject var132 = Sequences.length(module0035.f2110((SubLObject)$ic24$, var128, (SubLObject)UNPROVIDED));
        if (var131.numG(var132)) {
            return (SubLObject)T;
        }
        if (var131.numL(var132)) {
            return (SubLObject)NIL;
        }
        if (var129.numL(var130)) {
            return (SubLObject)T;
        }
        if (var129.numG(var130)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32203(final SubLObject var133) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)NIL;
        SubLObject var136 = var133;
        SubLObject var137 = (SubLObject)NIL;
        var137 = var136.first();
        while (NIL != var136) {
            if (NIL != assertion_handles_oc.f11035(var137)) {
                var135 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0178.f11287(var137)), var135);
            }
            else if (NIL != module0191.f11952(var137)) {
                SubLObject var138 = (SubLObject)NIL;
                if (NIL != $g3779$.getDynamicValue(var134)) {
                    var138 = f32204(var137);
                }
                else {
                    var138 = f32205(var137);
                }
                if (NIL != var138) {
                    var135 = (SubLObject)ConsesLow.cons(var138, var135);
                }
            }
            var136 = var136.rest();
            var137 = var136.first();
        }
        return Sequences.remove((SubLObject)NIL, module0035.f2217(Mapping.mapcar((SubLObject)$ic25$, module0035.f2468(var135)), (SubLObject)$ic26$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32204(final SubLObject var135) {
        return (SubLObject)(($ic27$ == module0191.f11965(var135)) ? NIL : Mapping.mapcar((SubLObject)$ic28$, module0333.f22438(var135)));
    }
    
    public static SubLObject f32205(final SubLObject var135) {
        SubLObject var136 = (SubLObject)NIL;
        SubLObject var137 = (SubLObject)NIL;
        SubLObject var138 = (SubLObject)NIL;
        SubLObject var139 = (SubLObject)NIL;
        SubLObject var140 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var135, var135, (SubLObject)$ic29$);
        var137 = var135.first();
        SubLObject var141 = var135.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var141, var135, (SubLObject)$ic29$);
        var138 = var141.first();
        var141 = var141.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var141, var135, (SubLObject)$ic29$);
        var139 = var141.first();
        var141 = var141.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var141, var135, (SubLObject)$ic29$);
        var140 = var141.first();
        var141 = var141.rest();
        if (NIL == var141) {
            final SubLObject var142 = module0205.f13384(var138, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
            if (NIL != module0244.f15730(var142)) {
                final SubLObject var143 = module0137.f8955(var142);
                final SubLObject var144 = module0205.f13384(var138, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                final SubLObject var145 = module0205.f13384(var138, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
                var136 = module0253.f16446(var143, var144, var145, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0226.f14800(var142)) {
                final SubLObject var146 = module0205.f13384(var138, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                final SubLObject var147 = module0205.f13384(var138, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
                var136 = module0315.f21344(var142, var146, var147);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var135, (SubLObject)$ic29$);
        }
        return var136;
    }
    
    public static SubLObject f32206(final SubLObject var1, SubLObject var17, SubLObject var18) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)$ic14$;
        }
        SubLObject var19 = (SubLObject)NIL;
        if (NIL == f32192(var1, var17, var18)) {
            var19 = f32200(var1, var17, var18);
        }
        return var19;
    }
    
    public static SubLObject f32207(final SubLObject var1, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        SubLObject var18 = (SubLObject)NIL;
        final SubLObject var19 = module0321.f21702(var1, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var19) {
            var18 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic30$), var19);
        }
        return var18;
    }
    
    public static SubLObject f32208(final SubLObject var1, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        SubLObject var18 = (SubLObject)NIL;
        var18 = f32201(var1, var17);
        return var18;
    }
    
    public static SubLObject f32209(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic31$, var2);
            module0147.$g2095$.bind($ic32$, var2);
            final SubLObject var6 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic33$), module0321.f21702(var1, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            final SubLObject var7 = Mapping.mapcar((SubLObject)$ic34$, var6);
            var3 = module0035.f2217(var7, (SubLObject)$ic26$, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f32210(final SubLObject var146, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)$ic14$;
        }
        return module0191.f11990((SubLObject)$ic35$, (SubLObject)((var18 == $ic21$) ? ConsesLow.list($ic36$, var146) : var146), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32189(final SubLObject var1) {
        final SubLObject var2 = module0205.f13333(var1);
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var2) && (NIL != module0318.f21440(var2) || NIL != module0318.f21442(var2)) && NIL == module0035.f2439((SubLObject)$ic37$, var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32211(final SubLObject var1, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return f32189(var1);
    }
    
    public static SubLObject f32212(final SubLObject var1, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        if (NIL == module0205.f13145((SubLObject)$ic38$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && (NIL != module0147.f9513() || NIL != module0147.f9512() || NIL != module0274.f18064(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) && NIL != f32206(var1, (SubLObject)NIL, var18)) {
            final SubLObject var19 = f32210(var1, var18);
            module0347.f23330(var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32213(final SubLObject var1, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f32214(var1, (SubLObject)UNPROVIDED) && NIL != f32215(var1));
    }
    
    public static SubLObject f32216(final SubLObject var1, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = module0147.$g2095$.getDynamicValue();
        }
        return (SubLObject)makeBoolean(NIL != f32189(var1) && NIL != f32217(var1));
    }
    
    public static SubLObject f32214(final SubLObject var1, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = module0034.$g879$.getDynamicValue(var18);
        SubLObject var20 = (SubLObject)NIL;
        if (NIL == var19) {
            return f32216(var1, var17);
        }
        var20 = module0034.f1857(var19, (SubLObject)$ic42$, (SubLObject)UNPROVIDED);
        if (NIL == var20) {
            var20 = module0034.f1807(module0034.f1842(var19), (SubLObject)$ic42$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var19, (SubLObject)$ic42$, var20);
        }
        final SubLObject var21 = module0034.f1782(var1, var17);
        final SubLObject var22 = module0034.f1814(var20, var21, (SubLObject)UNPROVIDED);
        if (var22 != $ic43$) {
            SubLObject var23 = var22;
            SubLObject var24 = (SubLObject)NIL;
            var24 = var23.first();
            while (NIL != var23) {
                SubLObject var25 = var24.first();
                final SubLObject var26 = conses_high.second(var24);
                if (var1.equal(var25.first())) {
                    var25 = var25.rest();
                    if (NIL != var25 && NIL == var25.rest() && var17.equal(var25.first())) {
                        return module0034.f1959(var26);
                    }
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
        }
        final SubLObject var27 = Values.arg2(var18.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f32216(var1, var17)));
        module0034.f1836(var20, var21, var22, var27, (SubLObject)ConsesLow.list(var1, var17));
        return module0034.f1959(var27);
    }
    
    public static SubLObject f32215(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0205.f13333(var1);
        final SubLObject var4 = module0321.f21664(var1);
        SubLObject var5 = f32218(var1);
        if (NIL == var5) {
            final SubLObject var6 = var3;
            final SubLObject var7 = (SubLObject)$ic46$;
            final SubLObject var8 = module0056.f4145(var7);
            SubLObject var9 = (SubLObject)NIL;
            final SubLObject var10 = module0139.$g1635$.currentBinding(var2);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var2);
                final SubLObject var11 = (SubLObject)NIL;
                final SubLObject var21_164 = module0141.$g1714$.currentBinding(var2);
                final SubLObject var12 = module0141.$g1715$.currentBinding(var2);
                try {
                    module0141.$g1714$.bind((NIL != var11) ? var11 : module0141.f9283(), var2);
                    module0141.$g1715$.bind((SubLObject)((NIL != var11) ? $ic47$ : module0141.$g1715$.getDynamicValue(var2)), var2);
                    if (NIL != var11 && NIL != module0136.f8864() && NIL == module0141.f9279(var11)) {
                        final SubLObject var13 = module0136.$g1591$.getDynamicValue(var2);
                        if (var13.eql((SubLObject)$ic48$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic49$, var11, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var13.eql((SubLObject)$ic51$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic52$, (SubLObject)$ic49$, var11, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var13.eql((SubLObject)$ic53$)) {
                            Errors.warn((SubLObject)$ic49$, var11, (SubLObject)$ic50$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic54$, module0136.$g1591$.getDynamicValue(var2));
                            Errors.cerror((SubLObject)$ic52$, (SubLObject)$ic49$, var11, (SubLObject)$ic50$);
                        }
                    }
                    final SubLObject var21_165 = module0141.$g1670$.currentBinding(var2);
                    final SubLObject var22_166 = module0141.$g1671$.currentBinding(var2);
                    final SubLObject var14 = module0141.$g1672$.currentBinding(var2);
                    final SubLObject var15 = module0141.$g1674$.currentBinding(var2);
                    final SubLObject var16 = module0137.$g1605$.currentBinding(var2);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic55$), var2);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic55$)), var2);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic55$)), var2);
                        module0141.$g1674$.bind((SubLObject)NIL, var2);
                        module0137.$g1605$.bind(module0137.f8955($ic55$), var2);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var3, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var21_166 = module0141.$g1677$.currentBinding(var2);
                            final SubLObject var22_167 = module0138.$g1619$.currentBinding(var2);
                            final SubLObject var23_169 = module0141.$g1674$.currentBinding(var2);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var2);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic55$)), var2);
                                module0141.$g1674$.bind((SubLObject)NIL, var2);
                                module0249.f16055(var6, (SubLObject)UNPROVIDED);
                                for (var9 = (SubLObject)ConsesLow.list(var3, module0141.f9195()); NIL != var9 && NIL == var5; var9 = module0056.f4150(var8)) {
                                    final SubLObject var159_170 = var9.first();
                                    final SubLObject var17 = conses_high.second(var9);
                                    final SubLObject var18 = var159_170;
                                    final SubLObject var21_167 = module0141.$g1674$.currentBinding(var2);
                                    try {
                                        module0141.$g1674$.bind(var17, var2);
                                        final SubLObject var19 = var17;
                                        if (NIL == var5) {
                                            SubLObject var20 = module0318.f21423();
                                            SubLObject var21 = (SubLObject)NIL;
                                            var21 = var20.first();
                                            while (NIL == var5 && NIL != var20) {
                                                if (NIL == var5) {
                                                    SubLObject var174_176 = var4;
                                                    SubLObject var22 = (SubLObject)NIL;
                                                    var22 = var174_176.first();
                                                    while (NIL == var5 && NIL != var174_176) {
                                                        final SubLObject var23 = module0318.f21455(var21, var18, var22, var19);
                                                        if (NIL == var5) {
                                                            SubLObject var174_177 = var23;
                                                            SubLObject var24 = (SubLObject)NIL;
                                                            var24 = var174_177.first();
                                                            while (NIL == var5 && NIL != var174_177) {
                                                                final SubLObject var21_168 = module0145.$g1916$.currentBinding(var2);
                                                                try {
                                                                    module0145.$g1916$.bind((SubLObject)T, var2);
                                                                    final SubLObject var25 = module0205.f13384(var1, var22, (SubLObject)UNPROVIDED);
                                                                    final SubLObject var26 = var21;
                                                                    if (var26.eql($ic56$) || var26.eql($ic57$)) {
                                                                        if (ZERO_INTEGER.numL(module0241.f15634(var24, var25))) {
                                                                            var5 = (SubLObject)T;
                                                                        }
                                                                    }
                                                                    else if ((var26.eql($ic58$) || var26.eql($ic59$)) && ZERO_INTEGER.numL(module0241.f15635(var24, var25))) {
                                                                        var5 = (SubLObject)T;
                                                                    }
                                                                }
                                                                finally {
                                                                    module0145.$g1916$.rebind(var21_168, var2);
                                                                }
                                                                var174_177 = var174_177.rest();
                                                                var24 = var174_177.first();
                                                            }
                                                        }
                                                        var174_176 = var174_176.rest();
                                                        var22 = var174_176.first();
                                                    }
                                                }
                                                var20 = var20.rest();
                                                var21 = var20.first();
                                            }
                                        }
                                        final SubLObject var27 = module0200.f12443(module0137.f8955($ic55$));
                                        SubLObject var28;
                                        SubLObject var29;
                                        SubLObject var21_169;
                                        SubLObject var22_168;
                                        SubLObject var30;
                                        SubLObject var31;
                                        SubLObject var32;
                                        SubLObject var33;
                                        SubLObject var34;
                                        SubLObject var35;
                                        SubLObject var21_170;
                                        SubLObject var188_192;
                                        SubLObject var36;
                                        SubLObject var37;
                                        SubLObject var21_171;
                                        SubLObject var38;
                                        SubLObject var39;
                                        SubLObject var40;
                                        SubLObject var41;
                                        SubLObject var42;
                                        SubLObject var43;
                                        SubLObject var44;
                                        SubLObject var45;
                                        SubLObject var12_202;
                                        SubLObject var46;
                                        SubLObject var21_172;
                                        SubLObject var48;
                                        SubLObject var47;
                                        SubLObject var49;
                                        SubLObject var50;
                                        SubLObject var51;
                                        SubLObject var52;
                                        SubLObject var53;
                                        SubLObject var54;
                                        for (var28 = (SubLObject)NIL, var28 = var27; NIL == var5 && NIL != var28; var28 = var28.rest()) {
                                            var29 = var28.first();
                                            var21_169 = module0137.$g1605$.currentBinding(var2);
                                            var22_168 = module0141.$g1674$.currentBinding(var2);
                                            try {
                                                module0137.$g1605$.bind(var29, var2);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var2)) : module0141.$g1674$.getDynamicValue(var2)), var2);
                                                var30 = module0228.f15229(var159_170);
                                                if (NIL != module0138.f8992(var30)) {
                                                    var31 = module0242.f15664(var30, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var31) {
                                                        var32 = module0245.f15834(var31, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var32) {
                                                            for (var33 = module0066.f4838(module0067.f4891(var32)); NIL == var5 && NIL == module0066.f4841(var33); var33 = module0066.f4840(var33)) {
                                                                var2.resetMultipleValues();
                                                                var34 = module0066.f4839(var33);
                                                                var35 = var2.secondMultipleValue();
                                                                var2.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var34)) {
                                                                    var21_170 = module0138.$g1623$.currentBinding(var2);
                                                                    try {
                                                                        module0138.$g1623$.bind(var34, var2);
                                                                        for (var188_192 = module0066.f4838(module0067.f4891(var35)); NIL == var5 && NIL == module0066.f4841(var188_192); var188_192 = module0066.f4840(var188_192)) {
                                                                            var2.resetMultipleValues();
                                                                            var36 = module0066.f4839(var188_192);
                                                                            var37 = var2.secondMultipleValue();
                                                                            var2.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var36)) {
                                                                                var21_171 = module0138.$g1624$.currentBinding(var2);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var36, var2);
                                                                                    var38 = var37;
                                                                                    if (NIL != module0077.f5302(var38)) {
                                                                                        var39 = module0077.f5333(var38);
                                                                                        for (var40 = module0032.f1741(var39), var41 = (SubLObject)NIL, var41 = module0032.f1742(var40, var39); NIL == var5 && NIL == module0032.f1744(var40, var41); var41 = module0032.f1743(var41)) {
                                                                                            var42 = module0032.f1745(var40, var41);
                                                                                            if (NIL != module0032.f1746(var41, var42) && NIL == module0249.f16059(var42, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var42, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var42, module0141.f9195()), var8);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var38.isList()) {
                                                                                        if (NIL == var5) {
                                                                                            var43 = var38;
                                                                                            var44 = (SubLObject)NIL;
                                                                                            var44 = var43.first();
                                                                                            while (NIL == var5 && NIL != var43) {
                                                                                                if (NIL == module0249.f16059(var44, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var44, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var44, module0141.f9195()), var8);
                                                                                                }
                                                                                                var43 = var43.rest();
                                                                                                var44 = var43.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic60$, var38);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var21_171, var2);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var188_192);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var21_170, var2);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var33);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic61$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var30, (SubLObject)UNPROVIDED)) {
                                                    var45 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var12_202 = (SubLObject)NIL, var12_202 = var45; NIL == var5 && NIL != var12_202; var12_202 = var12_202.rest()) {
                                                        var46 = var12_202.first();
                                                        var21_172 = module0138.$g1625$.currentBinding(var2);
                                                        try {
                                                            module0138.$g1625$.bind(var46, var2);
                                                            var47 = (var48 = Functions.funcall(var46, var30));
                                                            if (NIL != module0077.f5302(var48)) {
                                                                var49 = module0077.f5333(var48);
                                                                for (var50 = module0032.f1741(var49), var51 = (SubLObject)NIL, var51 = module0032.f1742(var50, var49); NIL == var5 && NIL == module0032.f1744(var50, var51); var51 = module0032.f1743(var51)) {
                                                                    var52 = module0032.f1745(var50, var51);
                                                                    if (NIL != module0032.f1746(var51, var52) && NIL == module0249.f16059(var52, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var52, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var52, module0141.f9195()), var8);
                                                                    }
                                                                }
                                                            }
                                                            else if (var48.isList()) {
                                                                if (NIL == var5) {
                                                                    var53 = var48;
                                                                    var54 = (SubLObject)NIL;
                                                                    var54 = var53.first();
                                                                    while (NIL == var5 && NIL != var53) {
                                                                        if (NIL == module0249.f16059(var54, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var54, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var54, module0141.f9195()), var8);
                                                                        }
                                                                        var53 = var53.rest();
                                                                        var54 = var53.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic60$, var48);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var21_172, var2);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var22_168, var2);
                                                module0137.$g1605$.rebind(var21_169, var2);
                                            }
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var21_167, var2);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var23_169, var2);
                                module0138.$g1619$.rebind(var22_167, var2);
                                module0141.$g1677$.rebind(var21_166, var2);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic62$, var3, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var16, var2);
                        module0141.$g1674$.rebind(var15, var2);
                        module0141.$g1672$.rebind(var14, var2);
                        module0141.$g1671$.rebind(var22_166, var2);
                        module0141.$g1670$.rebind(var21_165, var2);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var12, var2);
                    module0141.$g1714$.rebind(var21_164, var2);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var2));
            }
            finally {
                module0139.$g1635$.rebind(var10, var2);
            }
        }
        return var5;
    }
    
    public static SubLObject f32218(final SubLObject var1) {
        final SubLObject var2 = module0205.f13333(var1);
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)ZERO_INTEGER;
        final SubLObject var5 = module0205.f13207(var1, (SubLObject)$ic13$);
        SubLObject var6;
        SubLObject var7;
        for (var6 = (SubLObject)NIL, var6 = var5; NIL == var3 && NIL != var6; var3 = (SubLObject)makeBoolean(NIL != module0193.f12105(var7) && NIL != module0322.f21730(var2, var4)), var6 = var6.rest()) {
            var7 = var6.first();
            var4 = Numbers.add(var4, (SubLObject)ONE_INTEGER);
        }
        return var3;
    }
    
    public static SubLObject f32217(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        if (NIL == var2) {
            SubLObject var3 = module0205.f13207(var1, (SubLObject)UNPROVIDED);
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL == var2 && NIL != var3) {
                if (NIL == module0206.f13500(var4) && NIL != module0035.sublisp_boolean(module0035.f2399(var4, (SubLObject)$ic63$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var2 = (SubLObject)T;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var2);
    }
    
    public static SubLObject f32219(final SubLObject var1, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0205.f13333(var1);
        SubLObject var22;
        final SubLObject var21 = var22 = module0321.f21664(var1);
        SubLObject var23 = (SubLObject)NIL;
        var23 = var22.first();
        while (NIL != var22) {
            if (NIL == module0318.f21457(var20, var23)) {
                final SubLObject var24 = module0205.f13376(var1, var23, (SubLObject)UNPROVIDED);
                SubLObject var25 = (SubLObject)ZERO_INTEGER;
                final SubLObject var26 = var20;
                final SubLObject var27 = (SubLObject)$ic46$;
                final SubLObject var28 = module0056.f4145(var27);
                SubLObject var29 = (SubLObject)NIL;
                final SubLObject var30 = module0139.$g1635$.currentBinding(var19);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var19);
                    final SubLObject var31 = (SubLObject)NIL;
                    final SubLObject var21_213 = module0141.$g1714$.currentBinding(var19);
                    final SubLObject var32 = module0141.$g1715$.currentBinding(var19);
                    try {
                        module0141.$g1714$.bind((NIL != var31) ? var31 : module0141.f9283(), var19);
                        module0141.$g1715$.bind((SubLObject)((NIL != var31) ? $ic47$ : module0141.$g1715$.getDynamicValue(var19)), var19);
                        if (NIL != var31 && NIL != module0136.f8864() && NIL == module0141.f9279(var31)) {
                            final SubLObject var33 = module0136.$g1591$.getDynamicValue(var19);
                            if (var33.eql((SubLObject)$ic48$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic49$, var31, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var33.eql((SubLObject)$ic51$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic52$, (SubLObject)$ic49$, var31, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var33.eql((SubLObject)$ic53$)) {
                                Errors.warn((SubLObject)$ic49$, var31, (SubLObject)$ic50$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic54$, module0136.$g1591$.getDynamicValue(var19));
                                Errors.cerror((SubLObject)$ic52$, (SubLObject)$ic49$, var31, (SubLObject)$ic50$);
                            }
                        }
                        final SubLObject var21_214 = module0141.$g1670$.currentBinding(var19);
                        final SubLObject var22_215 = module0141.$g1671$.currentBinding(var19);
                        final SubLObject var34 = module0141.$g1672$.currentBinding(var19);
                        final SubLObject var35 = module0141.$g1674$.currentBinding(var19);
                        final SubLObject var36 = module0137.$g1605$.currentBinding(var19);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic55$), var19);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic55$)), var19);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic55$)), var19);
                            module0141.$g1674$.bind((SubLObject)NIL, var19);
                            module0137.$g1605$.bind(module0137.f8955($ic55$), var19);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var20, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var21_215 = module0141.$g1677$.currentBinding(var19);
                                final SubLObject var22_216 = module0138.$g1619$.currentBinding(var19);
                                final SubLObject var23_218 = module0141.$g1674$.currentBinding(var19);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var19);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic55$)), var19);
                                    module0141.$g1674$.bind((SubLObject)NIL, var19);
                                    module0249.f16055(var26, (SubLObject)UNPROVIDED);
                                    for (var29 = (SubLObject)ConsesLow.list(var20, module0141.f9195()); NIL != var29; var29 = module0056.f4150(var28)) {
                                        final SubLObject var159_219 = var29.first();
                                        final SubLObject var37 = conses_high.second(var29);
                                        final SubLObject var38 = var159_219;
                                        final SubLObject var21_216 = module0141.$g1674$.currentBinding(var19);
                                        try {
                                            module0141.$g1674$.bind(var37, var19);
                                            final SubLObject var39 = var37;
                                            if (NIL != module0206.f13451(var24)) {
                                                var25 = Numbers.add(var25, module0217.f14221(var24, var23, var38, (SubLObject)UNPROVIDED));
                                            }
                                            SubLObject var91_221;
                                            final SubLObject var40 = var91_221 = module0200.f12443(module0137.f8955($ic55$));
                                            SubLObject var41 = (SubLObject)NIL;
                                            var41 = var91_221.first();
                                            while (NIL != var91_221) {
                                                final SubLObject var21_217 = module0137.$g1605$.currentBinding(var19);
                                                final SubLObject var22_217 = module0141.$g1674$.currentBinding(var19);
                                                try {
                                                    module0137.$g1605$.bind(var41, var19);
                                                    module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var19)) : module0141.$g1674$.getDynamicValue(var19)), var19);
                                                    final SubLObject var42 = module0228.f15229(var159_219);
                                                    if (NIL != module0138.f8992(var42)) {
                                                        final SubLObject var43 = module0242.f15664(var42, module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var43) {
                                                            final SubLObject var44 = module0245.f15834(var43, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                            if (NIL != var44) {
                                                                SubLObject var45;
                                                                for (var45 = module0066.f4838(module0067.f4891(var44)); NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                                                    var19.resetMultipleValues();
                                                                    final SubLObject var46 = module0066.f4839(var45);
                                                                    final SubLObject var47 = var19.secondMultipleValue();
                                                                    var19.resetMultipleValues();
                                                                    if (NIL != module0147.f9507(var46)) {
                                                                        final SubLObject var21_218 = module0138.$g1623$.currentBinding(var19);
                                                                        try {
                                                                            module0138.$g1623$.bind(var46, var19);
                                                                            SubLObject var188_225;
                                                                            for (var188_225 = module0066.f4838(module0067.f4891(var47)); NIL == module0066.f4841(var188_225); var188_225 = module0066.f4840(var188_225)) {
                                                                                var19.resetMultipleValues();
                                                                                final SubLObject var48 = module0066.f4839(var188_225);
                                                                                final SubLObject var49 = var19.secondMultipleValue();
                                                                                var19.resetMultipleValues();
                                                                                if (NIL != module0141.f9289(var48)) {
                                                                                    final SubLObject var21_219 = module0138.$g1624$.currentBinding(var19);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var48, var19);
                                                                                        final SubLObject var50 = var49;
                                                                                        if (NIL != module0077.f5302(var50)) {
                                                                                            final SubLObject var51 = module0077.f5333(var50);
                                                                                            SubLObject var52;
                                                                                            SubLObject var53;
                                                                                            SubLObject var54;
                                                                                            for (var52 = module0032.f1741(var51), var53 = (SubLObject)NIL, var53 = module0032.f1742(var52, var51); NIL == module0032.f1744(var52, var53); var53 = module0032.f1743(var53)) {
                                                                                                var54 = module0032.f1745(var52, var53);
                                                                                                if (NIL != module0032.f1746(var53, var54) && NIL == module0249.f16059(var54, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var54, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var54, module0141.f9195()), var28);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var50.isList()) {
                                                                                            SubLObject var55 = var50;
                                                                                            SubLObject var56 = (SubLObject)NIL;
                                                                                            var56 = var55.first();
                                                                                            while (NIL != var55) {
                                                                                                if (NIL == module0249.f16059(var56, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var56, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var56, module0141.f9195()), var28);
                                                                                                }
                                                                                                var55 = var55.rest();
                                                                                                var56 = var55.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)$ic60$, var50);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var21_219, var19);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var188_225);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var21_218, var19);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var45);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic61$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        }
                                                    }
                                                    else if (NIL != module0155.f9785(var42, (SubLObject)UNPROVIDED)) {
                                                        SubLObject var91_222;
                                                        final SubLObject var57 = var91_222 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)UNPROVIDED)));
                                                        SubLObject var58 = (SubLObject)NIL;
                                                        var58 = var91_222.first();
                                                        while (NIL != var91_222) {
                                                            final SubLObject var21_220 = module0138.$g1625$.currentBinding(var19);
                                                            try {
                                                                module0138.$g1625$.bind(var58, var19);
                                                                final SubLObject var60;
                                                                final SubLObject var59 = var60 = Functions.funcall(var58, var42);
                                                                if (NIL != module0077.f5302(var60)) {
                                                                    final SubLObject var61 = module0077.f5333(var60);
                                                                    SubLObject var62;
                                                                    SubLObject var63;
                                                                    SubLObject var64;
                                                                    for (var62 = module0032.f1741(var61), var63 = (SubLObject)NIL, var63 = module0032.f1742(var62, var61); NIL == module0032.f1744(var62, var63); var63 = module0032.f1743(var63)) {
                                                                        var64 = module0032.f1745(var62, var63);
                                                                        if (NIL != module0032.f1746(var63, var64) && NIL == module0249.f16059(var64, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var64, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var64, module0141.f9195()), var28);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var60.isList()) {
                                                                    SubLObject var65 = var60;
                                                                    SubLObject var66 = (SubLObject)NIL;
                                                                    var66 = var65.first();
                                                                    while (NIL != var65) {
                                                                        if (NIL == module0249.f16059(var66, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var66, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var66, module0141.f9195()), var28);
                                                                        }
                                                                        var65 = var65.rest();
                                                                        var66 = var65.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)$ic60$, var60);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var21_220, var19);
                                                            }
                                                            var91_222 = var91_222.rest();
                                                            var58 = var91_222.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var22_217, var19);
                                                    module0137.$g1605$.rebind(var21_217, var19);
                                                }
                                                var91_221 = var91_221.rest();
                                                var41 = var91_221.first();
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var21_216, var19);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var23_218, var19);
                                    module0138.$g1619$.rebind(var22_216, var19);
                                    module0141.$g1677$.rebind(var21_215, var19);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic62$, var20, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var36, var19);
                            module0141.$g1674$.rebind(var35, var19);
                            module0141.$g1672$.rebind(var34, var19);
                            module0141.$g1671$.rebind(var22_215, var19);
                            module0141.$g1670$.rebind(var21_214, var19);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var32, var19);
                        module0141.$g1714$.rebind(var21_213, var19);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var19));
                }
                finally {
                    module0139.$g1635$.rebind(var30, var19);
                }
                if (var25.numG((SubLObject)ZERO_INTEGER)) {
                    return var25;
                }
            }
            var22 = var22.rest();
            var23 = var22.first();
        }
        SubLObject var67 = (SubLObject)ZERO_INTEGER;
        SubLObject var68 = var21;
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            SubLObject var70 = (SubLObject)NIL;
            SubLObject var71 = (SubLObject)NIL;
            final SubLObject var72 = var20;
            final SubLObject var73 = (SubLObject)$ic46$;
            final SubLObject var74 = module0056.f4145(var73);
            SubLObject var75 = (SubLObject)NIL;
            SubLObject var76 = module0139.$g1635$.currentBinding(var19);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var19);
                final SubLObject var77 = (SubLObject)NIL;
                final SubLObject var21_221 = module0141.$g1714$.currentBinding(var19);
                final SubLObject var78 = module0141.$g1715$.currentBinding(var19);
                try {
                    module0141.$g1714$.bind((NIL != var77) ? var77 : module0141.f9283(), var19);
                    module0141.$g1715$.bind((SubLObject)((NIL != var77) ? $ic47$ : module0141.$g1715$.getDynamicValue(var19)), var19);
                    if (NIL != var77 && NIL != module0136.f8864() && NIL == module0141.f9279(var77)) {
                        final SubLObject var79 = module0136.$g1591$.getDynamicValue(var19);
                        if (var79.eql((SubLObject)$ic48$)) {
                            module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic49$, var77, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var79.eql((SubLObject)$ic51$)) {
                            module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic52$, (SubLObject)$ic49$, var77, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (var79.eql((SubLObject)$ic53$)) {
                            Errors.warn((SubLObject)$ic49$, var77, (SubLObject)$ic50$);
                        }
                        else {
                            Errors.warn((SubLObject)$ic54$, module0136.$g1591$.getDynamicValue(var19));
                            Errors.cerror((SubLObject)$ic52$, (SubLObject)$ic49$, var77, (SubLObject)$ic50$);
                        }
                    }
                    final SubLObject var21_222 = module0141.$g1670$.currentBinding(var19);
                    final SubLObject var22_218 = module0141.$g1671$.currentBinding(var19);
                    final SubLObject var80 = module0141.$g1672$.currentBinding(var19);
                    final SubLObject var81 = module0141.$g1674$.currentBinding(var19);
                    final SubLObject var82 = module0137.$g1605$.currentBinding(var19);
                    try {
                        module0141.$g1670$.bind(module0137.f8955($ic55$), var19);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic55$)), var19);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic55$)), var19);
                        module0141.$g1674$.bind((SubLObject)NIL, var19);
                        module0137.$g1605$.bind(module0137.f8955($ic55$), var19);
                        if (NIL != module0136.f8865() || NIL != module0244.f15795(var20, module0137.f8955((SubLObject)UNPROVIDED))) {
                            final SubLObject var21_223 = module0141.$g1677$.currentBinding(var19);
                            final SubLObject var22_219 = module0138.$g1619$.currentBinding(var19);
                            final SubLObject var23_219 = module0141.$g1674$.currentBinding(var19);
                            try {
                                module0141.$g1677$.bind(module0141.f9210(), var19);
                                module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0137.f8955($ic55$)), var19);
                                module0141.$g1674$.bind((SubLObject)NIL, var19);
                                module0249.f16055(var72, (SubLObject)UNPROVIDED);
                                for (var75 = (SubLObject)ConsesLow.list(var20, module0141.f9195()); NIL != var75; var75 = module0056.f4150(var74)) {
                                    final SubLObject var159_220 = var75.first();
                                    final SubLObject var83 = conses_high.second(var75);
                                    final SubLObject var84 = var159_220;
                                    final SubLObject var21_224 = module0141.$g1674$.currentBinding(var19);
                                    try {
                                        module0141.$g1674$.bind(var83, var19);
                                        final SubLObject var85 = var83;
                                        SubLObject var86 = module0318.f21423();
                                        SubLObject var87 = (SubLObject)NIL;
                                        var87 = var86.first();
                                        while (NIL != var86) {
                                            SubLObject var91_223;
                                            final SubLObject var88 = var91_223 = module0318.f21455(var87, var84, var69, var85);
                                            SubLObject var89 = (SubLObject)NIL;
                                            var89 = var91_223.first();
                                            while (NIL != var91_223) {
                                                if (!makeBoolean(NIL == var85).eql((SubLObject)makeBoolean(NIL == module0004.f104(var87, (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))) {
                                                    var71 = (SubLObject)ConsesLow.cons(var89, var71);
                                                }
                                                else {
                                                    var70 = (SubLObject)ConsesLow.cons(var89, var70);
                                                }
                                                var91_223 = var91_223.rest();
                                                var89 = var91_223.first();
                                            }
                                            var86 = var86.rest();
                                            var87 = var86.first();
                                        }
                                        SubLObject var91_224;
                                        final SubLObject var40 = var91_224 = module0200.f12443(module0137.f8955($ic55$));
                                        SubLObject var41 = (SubLObject)NIL;
                                        var41 = var91_224.first();
                                        while (NIL != var91_224) {
                                            final SubLObject var21_225 = module0137.$g1605$.currentBinding(var19);
                                            final SubLObject var22_220 = module0141.$g1674$.currentBinding(var19);
                                            try {
                                                module0137.$g1605$.bind(var41, var19);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var19)) : module0141.$g1674$.getDynamicValue(var19)), var19);
                                                final SubLObject var42 = module0228.f15229(var159_220);
                                                if (NIL != module0138.f8992(var42)) {
                                                    final SubLObject var43 = module0242.f15664(var42, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var43) {
                                                        final SubLObject var44 = module0245.f15834(var43, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var44) {
                                                            SubLObject var45;
                                                            for (var45 = module0066.f4838(module0067.f4891(var44)); NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                                                var19.resetMultipleValues();
                                                                final SubLObject var46 = module0066.f4839(var45);
                                                                final SubLObject var47 = var19.secondMultipleValue();
                                                                var19.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var46)) {
                                                                    final SubLObject var21_226 = module0138.$g1623$.currentBinding(var19);
                                                                    try {
                                                                        module0138.$g1623$.bind(var46, var19);
                                                                        SubLObject var188_226;
                                                                        for (var188_226 = module0066.f4838(module0067.f4891(var47)); NIL == module0066.f4841(var188_226); var188_226 = module0066.f4840(var188_226)) {
                                                                            var19.resetMultipleValues();
                                                                            final SubLObject var48 = module0066.f4839(var188_226);
                                                                            final SubLObject var49 = var19.secondMultipleValue();
                                                                            var19.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var48)) {
                                                                                final SubLObject var21_227 = module0138.$g1624$.currentBinding(var19);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var48, var19);
                                                                                    final SubLObject var50 = var49;
                                                                                    if (NIL != module0077.f5302(var50)) {
                                                                                        final SubLObject var51 = module0077.f5333(var50);
                                                                                        SubLObject var52;
                                                                                        SubLObject var53;
                                                                                        SubLObject var54;
                                                                                        for (var52 = module0032.f1741(var51), var53 = (SubLObject)NIL, var53 = module0032.f1742(var52, var51); NIL == module0032.f1744(var52, var53); var53 = module0032.f1743(var53)) {
                                                                                            var54 = module0032.f1745(var52, var53);
                                                                                            if (NIL != module0032.f1746(var53, var54) && NIL == module0249.f16059(var54, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var54, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var54, module0141.f9195()), var74);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var50.isList()) {
                                                                                        SubLObject var55 = var50;
                                                                                        SubLObject var56 = (SubLObject)NIL;
                                                                                        var56 = var55.first();
                                                                                        while (NIL != var55) {
                                                                                            if (NIL == module0249.f16059(var56, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var56, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149((SubLObject)ConsesLow.list(var56, module0141.f9195()), var74);
                                                                                            }
                                                                                            var55 = var55.rest();
                                                                                            var56 = var55.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic60$, var50);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var21_227, var19);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var188_226);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var21_226, var19);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var45);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic61$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var42, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var91_225;
                                                    final SubLObject var57 = var91_225 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var19), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var58 = (SubLObject)NIL;
                                                    var58 = var91_225.first();
                                                    while (NIL != var91_225) {
                                                        final SubLObject var21_228 = module0138.$g1625$.currentBinding(var19);
                                                        try {
                                                            module0138.$g1625$.bind(var58, var19);
                                                            final SubLObject var60;
                                                            final SubLObject var59 = var60 = Functions.funcall(var58, var42);
                                                            if (NIL != module0077.f5302(var60)) {
                                                                final SubLObject var61 = module0077.f5333(var60);
                                                                SubLObject var62;
                                                                SubLObject var63;
                                                                SubLObject var64;
                                                                for (var62 = module0032.f1741(var61), var63 = (SubLObject)NIL, var63 = module0032.f1742(var62, var61); NIL == module0032.f1744(var62, var63); var63 = module0032.f1743(var63)) {
                                                                    var64 = module0032.f1745(var62, var63);
                                                                    if (NIL != module0032.f1746(var63, var64) && NIL == module0249.f16059(var64, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var64, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var64, module0141.f9195()), var74);
                                                                    }
                                                                }
                                                            }
                                                            else if (var60.isList()) {
                                                                SubLObject var65 = var60;
                                                                SubLObject var66 = (SubLObject)NIL;
                                                                var66 = var65.first();
                                                                while (NIL != var65) {
                                                                    if (NIL == module0249.f16059(var66, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var66, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149((SubLObject)ConsesLow.list(var66, module0141.f9195()), var74);
                                                                    }
                                                                    var65 = var65.rest();
                                                                    var66 = var65.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic60$, var60);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var21_228, var19);
                                                        }
                                                        var91_225 = var91_225.rest();
                                                        var58 = var91_225.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var22_220, var19);
                                                module0137.$g1605$.rebind(var21_225, var19);
                                            }
                                            var91_224 = var91_224.rest();
                                            var41 = var91_224.first();
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var21_224, var19);
                                    }
                                }
                            }
                            finally {
                                module0141.$g1674$.rebind(var23_219, var19);
                                module0138.$g1619$.rebind(var22_219, var19);
                                module0141.$g1677$.rebind(var21_223, var19);
                            }
                        }
                        else {
                            module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic62$, var20, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    finally {
                        module0137.$g1605$.rebind(var82, var19);
                        module0141.$g1674$.rebind(var81, var19);
                        module0141.$g1672$.rebind(var80, var19);
                        module0141.$g1671$.rebind(var22_218, var19);
                        module0141.$g1670$.rebind(var21_222, var19);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var78, var19);
                    module0141.$g1714$.rebind(var21_221, var19);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var19));
            }
            finally {
                module0139.$g1635$.rebind(var76, var19);
            }
            var76 = module0145.$g1916$.currentBinding(var19);
            try {
                module0145.$g1916$.bind((SubLObject)T, var19);
                final SubLObject var90 = module0205.f13384(var1, var69, (SubLObject)UNPROVIDED);
                SubLObject var91_226 = module0260.f17085(var70, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var91 = (SubLObject)NIL;
                var91 = var91_226.first();
                while (NIL != var91_226) {
                    var67 = Numbers.add(var67, module0241.f15634(var91, var90));
                    var91_226 = var91_226.rest();
                    var91 = var91_226.first();
                }
                SubLObject var91_227 = module0260.f17027(var71, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var91 = (SubLObject)NIL;
                var91 = var91_227.first();
                while (NIL != var91_227) {
                    var67 = Numbers.add(var67, module0241.f15635(var91, var90));
                    var91_227 = var91_227.rest();
                    var91 = var91_227.first();
                }
            }
            finally {
                module0145.$g1916$.rebind(var76, var19);
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        return var67;
    }
    
    public static SubLObject f32220(final SubLObject var1) {
        return module0052.f3709(f32207(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32221(final SubLObject var1, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLObject var19 = module0339.f22757();
        return (SubLObject)makeBoolean(NIL != inference_datastructures_inference_oc.f25275(var19) && $ic6$ != inference_datastructures_inference_oc.f25513(var19) && NIL != f32214(var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f32222(final SubLObject var1, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0205.f13333(var1);
        final SubLObject var21 = f32219(var1, var18);
        SubLObject var22 = (SubLObject)ZERO_INTEGER;
        if (!var21.isZero()) {
            SubLObject var23 = module0318.f21423();
            SubLObject var24 = (SubLObject)NIL;
            var24 = var23.first();
            while (NIL != var23) {
                final SubLObject var25 = var24;
                if (NIL != module0158.f10010(var20, (SubLObject)ONE_INTEGER, var25)) {
                    final SubLObject var26 = module0158.f10011(var20, (SubLObject)ONE_INTEGER, var25);
                    SubLObject var27 = (SubLObject)NIL;
                    final SubLObject var28 = (SubLObject)NIL;
                    while (NIL == var27) {
                        final SubLObject var29 = module0052.f3695(var26, var28);
                        final SubLObject var30 = (SubLObject)makeBoolean(!var28.eql(var29));
                        if (NIL != var30) {
                            SubLObject var31 = (SubLObject)NIL;
                            try {
                                var31 = module0158.f10316(var29, (SubLObject)$ic16$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var32_254 = (SubLObject)NIL;
                                final SubLObject var33_255 = (SubLObject)NIL;
                                while (NIL == var32_254) {
                                    final SubLObject var32 = module0052.f3695(var31, var33_255);
                                    final SubLObject var35_256 = (SubLObject)makeBoolean(!var33_255.eql(var32));
                                    if (NIL != var35_256) {
                                        var22 = Numbers.add(var22, module0217.f14249(module0178.f11335(var32)));
                                    }
                                    var32_254 = (SubLObject)makeBoolean(NIL == var35_256);
                                }
                            }
                            finally {
                                final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var19);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var19);
                                    if (NIL != var31) {
                                        module0158.f10319(var31);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33, var19);
                                }
                            }
                        }
                        var27 = (SubLObject)makeBoolean(NIL == var30);
                    }
                }
                var23 = var23.rest();
                var24 = var23.first();
            }
        }
        final SubLObject var34 = Numbers.add(var21, Numbers.multiply(var21, var22));
        SubLObject var35 = (SubLObject)NIL;
        final SubLObject var36 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        SubLObject var37 = (SubLObject)ZERO_INTEGER;
        SubLObject var39;
        final SubLObject var38 = var39 = module0205.f13207(var1, (SubLObject)$ic13$);
        SubLObject var40 = (SubLObject)NIL;
        var40 = var39.first();
        while (NIL != var39) {
            var37 = Numbers.add(var37, (SubLObject)ONE_INTEGER);
            if (NIL != module0206.f13500(var40)) {
                module0084.f5762(var36, var40, var37);
            }
            var39 = var39.rest();
            var40 = var39.first();
        }
        SubLObject var41;
        for (var41 = module0066.f4838(module0067.f4891(var36)); NIL == module0066.f4841(var41); var41 = module0066.f4840(var41)) {
            var19.resetMultipleValues();
            final SubLObject var42 = module0066.f4839(var41);
            final SubLObject var43 = var19.secondMultipleValue();
            var19.resetMultipleValues();
            SubLObject var44 = (SubLObject)NIL;
            SubLObject var45 = var43;
            SubLObject var46 = (SubLObject)NIL;
            var46 = var45.first();
            while (NIL != var45) {
                SubLObject var91_263 = module0226.f14882(var20, var46, (SubLObject)UNPROVIDED);
                SubLObject var47 = (SubLObject)NIL;
                var47 = var91_263.first();
                while (NIL != var91_263) {
                    if (NIL != var44) {
                        var44 = Numbers.min(var44, module0549.f33895(var47));
                    }
                    else {
                        var44 = module0549.f33895(var47);
                    }
                    var91_263 = var91_263.rest();
                    var47 = var91_263.first();
                }
                SubLObject var91_264 = module0226.f14935(var20, var46, (SubLObject)UNPROVIDED);
                SubLObject var48 = (SubLObject)NIL;
                var48 = var91_264.first();
                while (NIL != var91_264) {
                    if (NIL != var44) {
                        var44 = Numbers.min(var44, module0549.f33901(var48));
                    }
                    else {
                        var44 = module0549.f33901(var48);
                    }
                    var91_264 = var91_264.rest();
                    var48 = var91_264.first();
                }
                var45 = var45.rest();
                var46 = var45.first();
            }
            if (NIL != var44) {
                if (NIL != var35) {
                    var35 = Numbers.multiply(var35, var44);
                }
                else {
                    var35 = var44;
                }
            }
        }
        module0066.f4842(var41);
        final SubLObject var49 = (NIL != var35) ? Numbers.min(var35, var34) : var34;
        final SubLObject var50 = Numbers.max((SubLObject)ONE_INTEGER, var21);
        final SubLObject var51 = Numbers.round(module0048.f3306(Numbers.sqrt(Numbers.multiply(var49, var50))), (SubLObject)UNPROVIDED);
        return var51;
    }
    
    public static SubLObject f32223(final SubLObject var1) {
        if (NIL == module0205.f13145((SubLObject)$ic38$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0321.f21708(var1, (SubLObject)NIL, (SubLObject)((NIL != module0339.f22757()) ? inference_datastructures_inference_oc.f25513(module0339.f22757()) : $ic12$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32224(final SubLObject var270) {
        SubLObject var271 = (SubLObject)NIL;
        SubLObject var272 = (SubLObject)ZERO_INTEGER;
        SubLObject var273 = module0232.f15308(var270);
        SubLObject var274 = (SubLObject)NIL;
        var274 = var273.first();
        while (NIL != var273) {
            SubLObject var276;
            final SubLObject var275 = var276 = var274;
            SubLObject var277 = (SubLObject)NIL;
            SubLObject var278 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var276, var275, (SubLObject)$ic67$);
            var277 = var276.first();
            var276 = var276.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var276, var275, (SubLObject)$ic67$);
            var278 = var276.first();
            var276 = var276.rest();
            if (NIL == var276) {
                if (NIL != f32225(var278, var277)) {
                    final SubLObject var279 = module0202.f12693(var278, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var280 = (SubLObject)ConsesLow.list(var272);
                    SubLObject var281 = (SubLObject)ZERO_INTEGER;
                    SubLObject var91_281 = module0232.f15308(var270);
                    SubLObject var282 = (SubLObject)NIL;
                    var282 = var91_281.first();
                    while (NIL != var91_281) {
                        if (!var281.eql(var272)) {
                            SubLObject var285_286;
                            final SubLObject var283_284 = var285_286 = var282;
                            SubLObject var283 = (SubLObject)NIL;
                            SubLObject var284 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var285_286, var283_284, (SubLObject)$ic68$);
                            var283 = var285_286.first();
                            var285_286 = var285_286.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var285_286, var283_284, (SubLObject)$ic68$);
                            var284 = var285_286.first();
                            var285_286 = var285_286.rest();
                            if (NIL == var285_286) {
                                if (NIL != f32225(var284, var283) && NIL != module0035.f2201(var279, module0202.f12693(var284, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL))) {
                                    var280 = (SubLObject)ConsesLow.cons(var281, var280);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var283_284, (SubLObject)$ic68$);
                            }
                        }
                        var281 = Numbers.add(var281, (SubLObject)ONE_INTEGER);
                        var91_281 = var91_281.rest();
                        var282 = var91_281.first();
                    }
                    if (NIL != module0035.f2002(var280, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                        var271 = (SubLObject)ConsesLow.cons(module0204.f13098((SubLObject)NIL, Sort.sort(var280, Symbols.symbol_function((SubLObject)$ic69$), (SubLObject)UNPROVIDED)), var271);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var275, (SubLObject)$ic67$);
            }
            var272 = Numbers.add(var272, (SubLObject)ONE_INTEGER);
            var273 = var273.rest();
            var274 = var273.first();
        }
        return module0035.f2269(var271, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32225(final SubLObject var1, final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = module0205.f13333(var1);
        SubLObject var20 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var19) && NIL == module0202.f12691(var1, (SubLObject)UNPROVIDED) && NIL != f32226(var19)) {
            final SubLObject var21 = module0147.$g2095$.currentBinding(var18);
            final SubLObject var22 = module0147.$g2094$.currentBinding(var18);
            final SubLObject var23 = module0147.$g2096$.currentBinding(var18);
            try {
                module0147.$g2095$.bind(module0147.f9545(var17), var18);
                module0147.$g2094$.bind(module0147.f9546(var17), var18);
                module0147.$g2096$.bind(module0147.f9549(var17), var18);
                var20 = f32214(var1, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var23, var18);
                module0147.$g2094$.rebind(var22, var18);
                module0147.$g2095$.rebind(var21, var18);
            }
        }
        return var20;
    }
    
    public static SubLObject f32226(final SubLObject var147) {
        return (SubLObject)makeBoolean(NIL == module0333.f22416(var147) && NIL == module0244.f15730(var147) && NIL == module0324.f21954(var147) && NIL == module0340.f22940(var147));
    }
    
    public static SubLObject f32227(final SubLObject var270) {
        final SubLThread var271 = SubLProcess.currentSubLThread();
        SubLObject var272 = (SubLObject)NIL;
        SubLObject var273 = module0232.f15308(var270);
        SubLObject var274 = (SubLObject)NIL;
        var274 = var273.first();
        while (NIL != var273) {
            SubLObject var276;
            final SubLObject var275 = var276 = var274;
            SubLObject var277 = (SubLObject)NIL;
            SubLObject var278 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var276, var275, (SubLObject)$ic68$);
            var277 = var276.first();
            var276 = var276.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var276, var275, (SubLObject)$ic68$);
            var278 = var276.first();
            var276 = var276.rest();
            if (NIL == var276) {
                final SubLObject var279 = var277;
                final SubLObject var280 = module0147.$g2095$.currentBinding(var271);
                final SubLObject var281 = module0147.$g2094$.currentBinding(var271);
                final SubLObject var282 = module0147.$g2096$.currentBinding(var271);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var279), var271);
                    module0147.$g2094$.bind(module0147.f9546(var279), var271);
                    module0147.$g2096$.bind(module0147.f9549(var279), var271);
                    final SubLObject var283 = f32222(var278, (SubLObject)UNPROVIDED);
                    if (NIL != var283) {
                        if (NIL != var272) {
                            var272 = Numbers.min(var272, var283);
                        }
                        else {
                            var272 = var283;
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var282, var271);
                    module0147.$g2094$.rebind(var281, var271);
                    module0147.$g2095$.rebind(var280, var271);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var275, (SubLObject)$ic68$);
            }
            var273 = var273.rest();
            var274 = var273.first();
        }
        return var272;
    }
    
    public static SubLObject f32228(final SubLObject var270) {
        final SubLThread var271 = SubLProcess.currentSubLThread();
        SubLObject var272 = (SubLObject)NIL;
        SubLObject var273 = (SubLObject)NIL;
        final SubLObject var274 = module0139.$g1630$.getDynamicValue(var271);
        final SubLObject var275 = module0139.$g1631$.currentBinding(var271);
        final SubLObject var276 = module0139.$g1632$.currentBinding(var271);
        final SubLObject var277 = module0139.$g1630$.currentBinding(var271);
        try {
            module0139.$g1631$.bind(module0139.f9015(var274, (SubLObject)SIX_INTEGER), var271);
            module0139.$g1632$.bind(module0139.f9016(var274), var271);
            module0139.$g1630$.bind((SubLObject)T, var271);
            SubLObject var278;
            SubLObject var279;
            SubLObject var281;
            SubLObject var280;
            SubLObject var282;
            SubLObject var283;
            SubLObject var284;
            for (var278 = (SubLObject)NIL, var278 = module0232.f15308(var270); NIL == var273 && NIL != var278; var278 = var278.rest()) {
                var279 = var278.first();
                var280 = (var281 = var279);
                var282 = (SubLObject)NIL;
                var283 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var281, var280, (SubLObject)$ic68$);
                var282 = var281.first();
                var281 = var281.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var281, var280, (SubLObject)$ic68$);
                var283 = var281.first();
                var281 = var281.rest();
                if (NIL == var281) {
                    var284 = module0321.f21702(var283, var282, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != var272) {
                        if (NIL != var284) {
                            var272 = module0078.f5351((SubLObject)ConsesLow.list(var272, module0078.f5370(var284, Symbols.symbol_function((SubLObject)EQUAL))), Symbols.symbol_function((SubLObject)EQUAL));
                        }
                        else {
                            module0077.f5328(var272);
                        }
                    }
                    else {
                        var272 = module0078.f5370(var284, Symbols.symbol_function((SubLObject)EQUAL));
                    }
                    if (NIL != module0077.f5318(var272)) {
                        var273 = (SubLObject)T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var280, (SubLObject)$ic68$);
                }
            }
        }
        finally {
            module0139.$g1630$.rebind(var277, var271);
            module0139.$g1632$.rebind(var276, var271);
            module0139.$g1631$.rebind(var275, var271);
        }
        return (NIL != var273) ? module0052.f3708() : f32229(var272, var270);
    }
    
    public static SubLObject f32229(final SubLObject var291, final SubLObject var270) {
        return module0052.f3689(f32230(var291, var270), (SubLObject)$ic70$, (SubLObject)$ic71$, (SubLObject)$ic72$);
    }
    
    public static SubLObject f32230(final SubLObject var291, final SubLObject var270) {
        final SubLObject var292 = module0077.f5329(var291);
        SubLObject var293 = (SubLObject)NIL;
        SubLObject var294 = module0232.f15308(var270);
        SubLObject var295 = (SubLObject)NIL;
        var295 = var294.first();
        while (NIL != var294) {
            SubLObject var297;
            final SubLObject var296 = var297 = var295;
            SubLObject var298 = (SubLObject)NIL;
            SubLObject var299 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var297, var296, (SubLObject)$ic68$);
            var298 = var297.first();
            var297 = var297.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var297, var296, (SubLObject)$ic68$);
            var299 = var297.first();
            var297 = var297.rest();
            if (NIL == var297) {
                final SubLObject var300 = module0191.f11990((SubLObject)$ic35$, var299, var298, (SubLObject)UNPROVIDED);
                var293 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var300), var293);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var296, (SubLObject)$ic68$);
            }
            var294 = var294.rest();
            var295 = var294.first();
        }
        return (SubLObject)ConsesLow.list(var292, Sequences.nreverse(var293));
    }
    
    public static SubLObject f32231(final SubLObject var302) {
        SubLObject var303 = (SubLObject)NIL;
        SubLObject var304 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var302, var302, (SubLObject)$ic73$);
        var303 = var302.first();
        SubLObject var305 = var302.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var305, var302, (SubLObject)$ic73$);
        var304 = var305.first();
        var305 = var305.rest();
        if (NIL == var305) {
            return module0052.f3687(var303);
        }
        cdestructuring_bind.cdestructuring_bind_error(var302, (SubLObject)$ic73$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32232(final SubLObject var302) {
        final SubLThread var303 = SubLProcess.currentSubLThread();
        SubLObject var304 = (SubLObject)NIL;
        SubLObject var305 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var302, var302, (SubLObject)$ic73$);
        var304 = var302.first();
        SubLObject var306 = var302.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var306, var302, (SubLObject)$ic73$);
        var305 = var306.first();
        var306 = var306.rest();
        if (NIL != var306) {
            cdestructuring_bind.cdestructuring_bind_error(var302, (SubLObject)$ic73$);
            return (SubLObject)NIL;
        }
        var303.resetMultipleValues();
        final SubLObject var307 = module0052.f3693(var304);
        final SubLObject var308 = var303.secondMultipleValue();
        var303.resetMultipleValues();
        if (NIL != var308) {
            final SubLObject var309 = var307.first();
            final SubLObject var310 = conses_high.sublis(var309, var305, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return Values.values((SubLObject)ConsesLow.list(var309, var310), var302, (SubLObject)NIL);
        }
        return Values.values((SubLObject)NIL, var302, (SubLObject)T);
    }
    
    public static SubLObject f32233(final SubLObject var302) {
        SubLObject var303 = (SubLObject)NIL;
        SubLObject var304 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var302, var302, (SubLObject)$ic73$);
        var303 = var302.first();
        SubLObject var305 = var302.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var305, var302, (SubLObject)$ic73$);
        var304 = var305.first();
        var305 = var305.rest();
        if (NIL == var305) {
            return module0052.f3696(var303);
        }
        cdestructuring_bind.cdestructuring_bind_error(var302, (SubLObject)$ic73$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32234() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32188", "S#26338", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32191", "S#35585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32190", "S#35586", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32192", "S#35587", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32193", "S#35588", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32194", "S#35589", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32196", "S#35590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32195", "S#35591", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32197", "S#35592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32198", "S#35593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32199", "S#35594", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32200", "S#35595", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32201", "S#35596", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32202", "S#35597", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32203", "S#35598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32204", "S#35599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32205", "S#35600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32206", "S#24940", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32207", "S#35601", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32208", "S#24941", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32209", "S#24942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32210", "S#35602", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32189", "S#35603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32211", "S#29814", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32212", "S#29826", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32213", "S#29815", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32216", "S#35604", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32214", "S#35605", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32215", "S#34173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32218", "S#35606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32217", "S#35607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32219", "S#34172", 1, 1, false);
        new $f32219$UnaryFunction();
        new $f32219$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32220", "S#35608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32221", "S#35583", 1, 1, false);
        new $f32221$UnaryFunction();
        new $f32221$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32222", "S#35609", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32223", "S#35610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32224", "S#35584", 1, 0, false);
        new $f32224$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32225", "S#35611", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32226", "S#35612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32227", "S#35613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32228", "S#35614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32229", "S#35615", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32230", "S#35616", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32231", "S#35617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32232", "S#35618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0499", "f32233", "S#35619", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32235() {
        $g3778$ = SubLFiles.defparameter("S#35620", (SubLObject)$ic0$);
        $g3779$ = SubLFiles.defparameter("S#35621", (SubLObject)T);
        $g3780$ = SubLFiles.deflexical("S#35622", (SubLObject)TWO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32236() {
        module0358.f23730((SubLObject)$ic1$, (SubLObject)$ic2$);
        module0012.f419((SubLObject)$ic19$);
        module0340.f22941((SubLObject)$ic3$, (SubLObject)$ic39$);
        module0340.f22941((SubLObject)$ic40$, (SubLObject)$ic41$);
        module0034.f1895((SubLObject)$ic42$);
        module0340.f22941((SubLObject)$ic4$, (SubLObject)$ic65$);
        module0340.f22941((SubLObject)$ic5$, (SubLObject)$ic66$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32234();
    }
    
    public void initializeVariables() {
        f32235();
    }
    
    public void runTopLevelForms() {
        f32236();
    }
    
    static {
        me = (SubLFile)new module0499();
        $g3778$ = null;
        $g3779$ = null;
        $g3780$ = null;
        $ic0$ = makeKeyword("DISPREFERRED");
        $ic1$ = makeKeyword("TVA-POS");
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("PREFERENCE"), (SubLObject)makeSymbol("S#26338", "CYC"));
        $ic3$ = makeKeyword("REMOVAL-TVA-CHECK");
        $ic4$ = makeKeyword("REMOVAL-TVA-UNIFY");
        $ic5$ = makeKeyword("REMOVAL-TVA-UNIFY-CLOSURE");
        $ic6$ = makeKeyword("NONE");
        $ic7$ = makeKeyword("PREFERRED");
        $ic8$ = ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("FULLY-BOUND"));
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("ANYTHING"));
        $ic10$ = makeKeyword("GROSSLY-DISPREFERRED");
        $ic11$ = makeKeyword("TACTICAL");
        $ic12$ = makeKeyword("ALL");
        $ic13$ = makeKeyword("IGNORE");
        $ic14$ = makeKeyword("POS");
        $ic15$ = makeKeyword("GAF-ARG");
        $ic16$ = makeKeyword("GAF");
        $ic17$ = makeKeyword("PREDICATE-EXTENT");
        $ic18$ = makeKeyword("OVERLAP");
        $ic19$ = makeSymbol("S#35593", "CYC");
        $ic20$ = makeSymbol("FULLY-BOUND-P");
        $ic21$ = makeKeyword("NEG");
        $ic22$ = makeSymbol("S#35597", "CYC");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic24$ = makeSymbol("CYCL-ASSERTED-ASSERTION?");
        $ic25$ = makeSymbol("S#23781", "CYC");
        $ic26$ = makeSymbol("HLMT-EQUAL");
        $ic27$ = makeKeyword("CODE");
        $ic28$ = makeSymbol("SUPPORT-MT");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#10995", "CYC"));
        $ic30$ = makeSymbol("FIRST");
        $ic31$ = makeSymbol("S#12275", "CYC");
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic33$ = makeSymbol("SECOND");
        $ic34$ = makeSymbol("S#35598", "CYC");
        $ic35$ = makeKeyword("TVA");
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic37$ = makeSymbol("S#17599", "CYC");
        $ic38$ = makeSymbol("S#17915", "CYC");
        $ic39$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#29814", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35622", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#29826", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$physicalParts #$Dog #$Head)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$transitiveViaArg #$relationAllExists #$genls 3)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n (#$genls #$Head-Vertebrate #$Head)\n") });
        $ic40$ = makeKeyword("REMOVAL-TVA-CHECK-NEG");
        $ic41$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#29814", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#35622", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#29826", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <fully-bound>)\nusing #$negationPreds, #$negationInverse, true assertions, and GAF \nindexing in the KB via #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), makeKeyword("EXAMPLE"), makeString("(#$not (#$relationExistsExists #$parts #$CellNucleus #$Cell))\nvia \n (#$relationNotExistsExists #$parts #$NuclearBody #$Cell)\n (#$transitiveViaArgInverse #$relationNotExistsExists #$genls 2) \n (#$negationPreds #$relationNotExistsExists #$relationExistsExists) \n (#$genls #$CellNucleus #$NuclearBody)\n") });
        $ic42$ = makeSymbol("S#35605", "CYC");
        $ic43$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic44$ = makeKeyword("DEPTH");
        $ic45$ = makeKeyword("STACK");
        $ic46$ = makeKeyword("QUEUE");
        $ic47$ = makeSymbol("S#11450", "CYC");
        $ic48$ = makeKeyword("ERROR");
        $ic49$ = makeString("~A is not a ~A");
        $ic50$ = makeSymbol("S#11592", "CYC");
        $ic51$ = makeKeyword("CERROR");
        $ic52$ = makeString("continue anyway");
        $ic53$ = makeKeyword("WARN");
        $ic54$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic55$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArg"));
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("conservativeViaArg"));
        $ic58$ = constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArgInverse"));
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("conservativeViaArgInverse"));
        $ic60$ = makeString("~A is neither SET-P nor LISTP.");
        $ic61$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic62$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic63$ = makeSymbol("HL-VARIABLE-P");
        $ic64$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArgInverse")), constant_handles_oc.f8479((SubLObject)makeString("conservativeViaArgInverse")));
        $ic65$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#29815", "CYC"), makeKeyword("COST"), makeSymbol("S#34172", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35608", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18075", "CYC"), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("OUTPUT-VERIFY-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35593", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#35587", "CYC")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TVA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <not-fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$physicalParts #$Dog ?COL)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n") });
        $ic66$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#35583", "CYC"), makeKeyword("COST"), makeSymbol("S#35609", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#13100", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#35610", "CYC"), (SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("CALL"), (SubLObject)makeSymbol("S#18075", "CYC"), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#13100", "CYC"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TVA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <not-fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$physicalParts #$Dog ?COL)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n") });
        $ic67$ = ConsesLow.list((SubLObject)makeSymbol("S#35623", "CYC"), (SubLObject)makeSymbol("S#35624", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic69$ = makeSymbol("<");
        $ic70$ = makeSymbol("S#35617", "CYC");
        $ic71$ = makeSymbol("S#35618", "CYC");
        $ic72$ = makeSymbol("S#35619", "CYC");
        $ic73$ = ConsesLow.list((SubLObject)makeSymbol("S#35625", "CYC"), (SubLObject)makeSymbol("S#35626", "CYC"));
    }
    
    public static final class $f32219$UnaryFunction extends UnaryFunction
    {
        public $f32219$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34172"));
        }
        
        public SubLObject processItem(final SubLObject var119) {
            return f32219(var119, (SubLObject)$f32219$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f32219$BinaryFunction extends BinaryFunction
    {
        public $f32219$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#34172"));
        }
        
        public SubLObject processItem(final SubLObject var119, final SubLObject var120) {
            return f32219(var119, var120);
        }
    }
    
    public static final class $f32221$UnaryFunction extends UnaryFunction
    {
        public $f32221$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35583"));
        }
        
        public SubLObject processItem(final SubLObject var119) {
            return f32221(var119, (SubLObject)$f32221$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f32221$BinaryFunction extends BinaryFunction
    {
        public $f32221$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35583"));
        }
        
        public SubLObject processItem(final SubLObject var119, final SubLObject var120) {
            return f32221(var119, var120);
        }
    }
    
    public static final class $f32224$UnaryFunction extends UnaryFunction
    {
        public $f32224$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#35584"));
        }
        
        public SubLObject processItem(final SubLObject var119) {
            return f32224(var119);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2544 ms
	
	Decompiled with Procyon 0.5.32.
*/