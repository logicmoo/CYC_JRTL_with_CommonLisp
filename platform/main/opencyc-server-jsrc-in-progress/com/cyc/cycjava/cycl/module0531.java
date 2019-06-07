package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0531 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0531";
    public static final String myFingerPrint = "0d325bd78fc1451a2e616f80e4de19cab14912623c0a871964fdd9395f34fb88";
    public static SubLSymbol $g3903$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    
    
    public static SubLObject f33172(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var2 == UNPROVIDED) {
            var2 = var1;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert NIL != module0161.f10481(var1) : var1;
        assert NIL != module0161.f10481(var2) : var2;
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0131.$g60$.currentBinding(var6);
        final SubLObject var9 = module0012.$g59$.currentBinding(var6);
        try {
            module0131.$g60$.bind((SubLObject)T, var6);
            module0012.$g59$.bind((SubLObject)NIL, var6);
            try {
                var7 = f33173(module0219.f14524(var1), var2, var3, var4, var5);
            }
            finally {
                final SubLObject var8_10 = Threads.$is_thread_performing_cleanupP$.currentBinding(var6);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var6);
                    module0528.f32915();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var8_10, var6);
                }
            }
        }
        finally {
            module0012.$g59$.rebind(var9, var6);
            module0131.$g60$.rebind(var8, var6);
        }
        return var7;
    }
    
    public static SubLObject f33174(final SubLObject var11, final SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var12 = SubLProcess.currentSubLThread();
        assert NIL != Types.listp(var11) : var11;
        assert NIL != module0161.f10481(var2) : var2;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && NIL == module0035.f2370(Symbols.symbol_function((SubLObject)$ic2$), var11, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic3$);
        }
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = module0131.$g60$.currentBinding(var12);
        final SubLObject var15 = module0012.$g59$.currentBinding(var12);
        try {
            module0131.$g60$.bind((SubLObject)T, var12);
            module0012.$g59$.bind((SubLObject)NIL, var12);
            try {
                var13 = f33173(var11, var2, var3, var4, var5);
            }
            finally {
                final SubLObject var8_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var12);
                    module0528.f32915();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var8_12, var12);
                }
            }
        }
        finally {
            module0012.$g59$.rebind(var15, var12);
            module0131.$g60$.rebind(var14, var12);
        }
        return var13;
    }
    
    public static SubLObject f33175(final SubLObject var13, final SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles_oc.f11035(var13) : var13;
        assert NIL != module0161.f10481(var2) : var2;
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = module0131.$g60$.currentBinding(var14);
        final SubLObject var17 = module0012.$g59$.currentBinding(var14);
        try {
            module0131.$g60$.bind((SubLObject)T, var14);
            module0012.$g59$.bind((SubLObject)NIL, var14);
            try {
                var15 = f33173((SubLObject)ConsesLow.list(var13), var2, var3, var4, var5);
            }
            finally {
                final SubLObject var8_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                    module0528.f32915();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var8_14, var14);
                }
            }
        }
        finally {
            module0012.$g59$.rebind(var17, var14);
            module0131.$g60$.rebind(var16, var14);
        }
        return var15;
    }
    
    public static SubLObject f33176(final SubLObject var15, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != var15 && !areAssertionsDisabledFor(me) && NIL == module0368.f25251(var15)) {
            throw new AssertionError(var15);
        }
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = module0131.$g60$.currentBinding(var16);
        final SubLObject var19 = module0012.$g59$.currentBinding(var16);
        try {
            module0131.$g60$.bind((SubLObject)T, var16);
            module0012.$g59$.bind((SubLObject)NIL, var16);
            try {
                var17 = f33177(var15, var2, var3, (SubLObject)(var4.isInteger() ? module0051.time_from_now(var4) : NIL), var5);
            }
            finally {
                final SubLObject var8_16 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                    module0528.f32915();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var8_16, var16);
                }
            }
        }
        finally {
            module0012.$g59$.rebind(var19, var16);
            module0131.$g60$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f33178(final SubLObject var13, final SubLObject var17, final SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f33179((SubLObject)ConsesLow.list(var13), var17, var2, var3, var4, var5);
    }
    
    public static SubLObject f33179(final SubLObject var11, final SubLObject var17, final SubLObject var2, SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        SubLObject var19 = (SubLObject)ZERO_INTEGER;
        final SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = module0131.$g1537$.currentBinding(var18);
        try {
            module0131.$g1537$.bind(var17, var18);
            var18.resetMultipleValues();
            final SubLObject var22 = f33173(var11, var2, var3, var4, var5);
            final SubLObject var23 = var18.secondMultipleValue();
            var18.resetMultipleValues();
            var19 = Numbers.add(var19, var22);
        }
        finally {
            module0131.$g1537$.rebind(var21, var18);
        }
        return Values.values(var19, var20);
    }
    
    public static SubLObject f33180(final SubLObject var13, SubLObject var22, SubLObject var23) {
        if (var22 == UNPROVIDED) {
            var22 = $ic5$;
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)$ic6$;
        final SubLObject var27 = module0131.$g60$.currentBinding(var24);
        try {
            module0131.$g60$.bind((SubLObject)T, var24);
            SubLObject var28 = (SubLObject)NIL;
            if (NIL != var23) {
                final SubLObject var29 = module0003.f61();
                try {
                    var24.throwStack.push(var29);
                    final SubLObject var8_27 = module0003.$g4$.currentBinding(var24);
                    try {
                        module0003.$g4$.bind((SubLObject)T, var24);
                        SubLObject var30 = (SubLObject)NIL;
                        try {
                            final SubLObject var8_28 = module0003.$g5$.currentBinding(var24);
                            try {
                                module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var24)), var24);
                                var30 = module0003.f62(var23, var29);
                                var25 = module0528.f32930(var13, var22, (SubLObject)NIL);
                            }
                            finally {
                                module0003.$g5$.rebind(var8_28, var24);
                            }
                        }
                        finally {
                            final SubLObject var8_29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var24);
                                module0003.f64(var30);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var8_29, var24);
                            }
                        }
                    }
                    finally {
                        module0003.$g4$.rebind(var8_27, var24);
                    }
                }
                catch (Throwable var31) {
                    var28 = Errors.handleThrowable(var31, var29);
                }
                finally {
                    var24.throwStack.pop();
                }
            }
            else {
                var25 = module0528.f32930(var13, var22, (SubLObject)NIL);
            }
            var26 = (SubLObject)((NIL != var28) ? $ic7$ : $ic8$);
        }
        finally {
            module0131.$g60$.rebind(var27, var24);
        }
        return Values.values(var25, var26);
    }
    
    public static SubLObject f33173(SubLObject var11, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        var11 = module0035.f2388(conses_high.copy_list(var11), Symbols.symbol_function((SubLObject)$ic9$), (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0217.f14336(var2);
        final SubLObject var13 = (SubLObject)(var4.isInteger() ? module0051.time_from_now(var4) : NIL);
        final SubLObject var14 = module0368.f25261((SubLObject)UNPROVIDED);
        final SubLObject var15 = (SubLObject)NIL;
        module0368.f25264(var14, var11);
        f33177(var14, var2, var3, var13, var5);
        return Values.values(Numbers.subtract(module0217.f14336(var2), var12), var15);
    }
    
    public static SubLObject f33177(final SubLObject var15, final SubLObject var2, final SubLObject var3, final SubLObject var33, final SubLObject var5) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)NIL;
        try {
            var34.throwStack.push($ic10$);
            final SubLObject var36 = module0147.$g2095$.currentBinding(var34);
            try {
                module0147.$g2095$.bind(var2, var34);
                SubLObject var37 = (SubLObject)ZERO_INTEGER;
                final SubLObject var38 = module0217.f14336(var2);
                while (NIL == module0055.f4019(module0368.f25260(var15)) || NIL == module0055.f4019(module0368.f25259(var15))) {
                    if (var5.isInteger() && var37.numGE(var5)) {
                        Dynamic.sublisp_throw((SubLObject)$ic10$, (SubLObject)$ic11$);
                    }
                    if (NIL != module0055.f4019(module0368.f25259(var15))) {
                        module0368.f25267(var15);
                    }
                    assert NIL != module0055.f4006(module0368.f25260(var15)) : module0368.f25260(var15);
                    final SubLObject var8_36 = module0131.$g1538$.currentBinding(var34);
                    try {
                        module0131.$g1538$.bind(module0368.f25260(var15), var34);
                        if (NIL != module0528.$g3877$.getDynamicValue(var34)) {
                            PrintLow.format((SubLObject)T, (SubLObject)$ic13$, Numbers.add(var37, (SubLObject)ONE_INTEGER));
                        }
                        final SubLObject var8_37 = module0018.$g622$.currentBinding(var34);
                        try {
                            module0018.$g622$.bind((SubLObject)makeBoolean(NIL != module0018.$g622$.getDynamicValue(var34) && var37.numL($g3903$.getDynamicValue(var34))), var34);
                            while (NIL == module0055.f4019(module0368.f25259(var15))) {
                                final SubLObject var39 = module0368.f25268(var15);
                                final SubLObject var40 = (SubLObject)NIL;
                                module0528.f32923(var39, var2);
                                if (NIL != var40 && NIL != module0528.$g3877$.getDynamicValue(var34)) {
                                    PrintLow.format((SubLObject)T, (SubLObject)$ic14$, var39, var40);
                                }
                                if (var3.isInteger() && Numbers.subtract(module0217.f14336(var2), var38).numGE(var3)) {
                                    Dynamic.sublisp_throw((SubLObject)$ic10$, (SubLObject)$ic15$);
                                }
                                if (NIL != var33 && NIL != Time.time_has_arrivedP(var33)) {
                                    Dynamic.sublisp_throw((SubLObject)$ic10$, (SubLObject)$ic16$);
                                }
                            }
                        }
                        finally {
                            module0018.$g622$.rebind(var8_37, var34);
                        }
                    }
                    finally {
                        module0131.$g1538$.rebind(var8_36, var34);
                    }
                    var37 = Numbers.add(var37, (SubLObject)ONE_INTEGER);
                }
            }
            finally {
                module0147.$g2095$.rebind(var36, var34);
            }
            var35 = (SubLObject)$ic17$;
        }
        catch (Throwable var41) {
            var35 = Errors.handleThrowable(var41, (SubLObject)$ic10$);
        }
        finally {
            var34.throwStack.pop();
        }
        return var35;
    }
    
    public static SubLObject f33181(final SubLObject var39, SubLObject var17, SubLObject var40, SubLObject var23) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)$ic18$;
        }
        if (var40 == UNPROVIDED) {
            var40 = $ic5$;
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLThread var41 = SubLProcess.currentSubLThread();
        assert NIL != module0161.f10481(var40) : var40;
        final SubLObject var42 = module0147.f9540(var40);
        final SubLObject var43 = module0147.$g2095$.currentBinding(var41);
        final SubLObject var44 = module0147.$g2094$.currentBinding(var41);
        final SubLObject var45 = module0147.$g2096$.currentBinding(var41);
        try {
            module0147.$g2095$.bind(module0147.f9545(var42), var41);
            module0147.$g2094$.bind(module0147.f9546(var42), var41);
            module0147.$g2096$.bind(module0147.f9549(var42), var41);
            assert NIL != module0178.f11284(var39) : var39;
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && NIL == module0147.f9507(module0178.f11287(var39))) {
                Errors.error((SubLObject)$ic20$, var39, var40);
            }
            if ($ic18$ != var17) {
                final SubLObject var46 = var17;
                assert NIL != module0035.f2015(var46) : var46;
                SubLObject var47 = var46;
                SubLObject var48 = (SubLObject)NIL;
                var48 = var47.first();
                while (NIL != var47) {
                    assert NIL != module0178.f11290(var48) : var48;
                    var47 = var47.rest();
                    var48 = var47.first();
                }
                SubLObject var49 = var17;
                SubLObject var50 = (SubLObject)NIL;
                var50 = var49.first();
                while (NIL != var49) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && NIL == module0147.f9507(module0178.f11287(var50))) {
                        Errors.error((SubLObject)$ic22$, var50, var40);
                    }
                    var49 = var49.rest();
                    var50 = var49.first();
                }
            }
            SubLObject var51 = (SubLObject)NIL;
            SubLObject var52 = (SubLObject)NIL;
            SubLObject var53 = (SubLObject)NIL;
            final SubLObject var8_49 = module0131.$g1537$.currentBinding(var41);
            try {
                module0131.$g1537$.bind(var17, var41);
                var41.resetMultipleValues();
                final SubLObject var50_51 = f33180(var39, var40, var23);
                final SubLObject var52_53 = var41.secondMultipleValue();
                var41.resetMultipleValues();
                var53 = var50_51;
                var52 = var52_53;
            }
            finally {
                module0131.$g1537$.rebind(var8_49, var41);
            }
            SubLObject var54 = var53;
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                var51 = (SubLObject)ConsesLow.cons(f33182(var55), var51);
                var54 = var54.rest();
                var55 = var54.first();
            }
            return Values.values(var51, var52);
        }
        finally {
            module0147.$g2096$.rebind(var45, var41);
            module0147.$g2094$.rebind(var44, var41);
            module0147.$g2095$.rebind(var43, var41);
        }
    }
    
    public static SubLObject f33182(final SubLObject var54) {
        assert NIL != module0195.f12207(var54) : var54;
        final SubLObject var55 = module0195.f12212(var54);
        final SubLObject var58_59;
        final SubLObject var56 = var58_59 = module0195.f12211(var54);
        final SubLObject var57 = module0195.f12203(var58_59);
        final SubLObject var58 = module0195.f12204(var58_59);
        assert NIL != module0188.f11767(var55) : var55;
        final SubLObject var59 = module0188.f11771(var55);
        final SubLObject var60 = module0289.f19418(var57, var58, (SubLObject)UNPROVIDED);
        final SubLObject var61 = (SubLObject)ConsesLow.list(var60, var58, var59);
        return var61;
    }
    
    public static SubLObject f33183() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0531", "f33172", "S#36636", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0531", "f33174", "S#36637", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0531", "f33175", "S#36638", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0531", "f33176", "S#31512", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0531", "f33178", "S#36639", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0531", "f33179", "S#36640", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0531", "f33180", "S#36641", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0531", "f33173", "S#36642", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0531", "f33177", "S#36643", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0531", "f33181", "S#36644", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0531", "f33182", "S#36645", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33184() {
        $g3903$ = SubLFiles.defparameter("S#36646", (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33185() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33183();
    }
    
    public void initializeVariables() {
        f33184();
    }
    
    public void runTopLevelForms() {
        f33185();
    }
    
    static {
        me = (SubLFile)new module0531();
        $g3903$ = null;
        $ic0$ = makeSymbol("S#12263", "CYC");
        $ic1$ = makeSymbol("LISTP");
        $ic2$ = makeSymbol("ASSERTION-P");
        $ic3$ = makeString("ASSERTIONS was not a list of assertions");
        $ic4$ = makeSymbol("S#28174", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic6$ = makeKeyword("ERROR");
        $ic7$ = makeKeyword("MAX-TIME");
        $ic8$ = makeKeyword("EXHAUST-TOTAL");
        $ic9$ = makeSymbol("S#12732", "CYC");
        $ic10$ = makeKeyword("ASSERTION-FORWARD-PROPAGATION");
        $ic11$ = makeKeyword("DEPTH");
        $ic12$ = makeSymbol("S#690", "CYC");
        $ic13$ = makeString("~%;; Level ~S");
        $ic14$ = makeString("~%ERROR from ~S~%  ~a");
        $ic15$ = makeKeyword("NUMBER");
        $ic16$ = makeKeyword("TIME");
        $ic17$ = makeKeyword("EXHAUST");
        $ic18$ = makeKeyword("ALL");
        $ic19$ = makeSymbol("S#11995", "CYC");
        $ic20$ = makeString("Seed GAF ~a is not visible from specified mt ~a");
        $ic21$ = makeSymbol("S#747", "CYC");
        $ic22$ = makeString("Specified rule ~a is not visible from specified mt ~a");
        $ic23$ = makeSymbol("S#5859", "CYC");
        $ic24$ = makeSymbol("S#14992", "CYC");
        $ic25$ = makeSymbol("S#14573", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 242 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/