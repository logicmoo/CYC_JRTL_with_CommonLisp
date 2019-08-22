package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0529 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0529";
    public static final String myFingerPrint = "4e0b4285630e21c40edb9fe83aff2d6e2225c4daa9dde59d964d5791cefd4426";
    public static SubLSymbol $g3898$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    
    public static SubLObject f33002(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = $ic0$;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != module0178.f11290(var1) : var1;
        f33003(var1);
        final SubLObject var4 = module0194.f12113(module0178.f11305(var1), (SubLObject)UNPROVIDED);
        final SubLObject var5 = Sequences.cconcatenate((SubLObject)$ic2$, module0006.f203(var4));
        final SubLObject var6 = module0178.f11381(var1);
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        var3.resetMultipleValues();
        final SubLObject var8 = f33004(var1, var2);
        final SubLObject var9 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        assert NIL != module0004.f106(var9) : var9;
        final SubLObject var10 = module0012.$g75$.currentBinding(var3);
        final SubLObject var11 = module0012.$g76$.currentBinding(var3);
        final SubLObject var12 = module0012.$g77$.currentBinding(var3);
        final SubLObject var13 = module0012.$g78$.currentBinding(var3);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var3);
            module0012.$g76$.bind((SubLObject)NIL, var3);
            module0012.$g77$.bind((SubLObject)T, var3);
            module0012.$g78$.bind(Time.get_universal_time(), var3);
            module0012.f478(var5);
            SubLObject var16;
            for (SubLObject var14 = (SubLObject)NIL; NIL == var14; var14 = (SubLObject)makeBoolean(NIL == var16)) {
                var3.resetMultipleValues();
                final SubLObject var15 = module0052.f3693(var8);
                var16 = var3.secondMultipleValue();
                var3.resetMultipleValues();
                if (NIL != var16) {
                    SubLObject var17 = (SubLObject)NIL;
                    try {
                        var3.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var10_18 = Errors.$error_handler$.currentBinding(var3);
                        try {
                            Errors.$error_handler$.bind((SubLObject)$ic4$, var3);
                            try {
                                module0528.f32927(var15, var1);
                            }
                            catch (Throwable var18) {
                                Errors.handleThrowable(var18, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var10_18, var3);
                        }
                    }
                    catch (Throwable var19) {
                        var17 = Errors.handleThrowable(var19, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var3.throwStack.pop();
                    }
                    if (var17.isString()) {
                        Errors.warn((SubLObject)$ic5$, var17);
                    }
                    var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                    module0012.note_percent_progress(var7, var9);
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var13, var3);
            module0012.$g77$.rebind(var12, var3);
            module0012.$g76$.rebind(var11, var3);
            module0012.$g75$.rebind(var10, var3);
        }
        final SubLObject var20 = module0178.f11381(var1);
        final SubLObject var21 = Numbers.subtract(var20, var6);
        return Values.values(var21, var7);
    }
    
    public static SubLObject f33003(final SubLObject var23) {
        assert NIL != assertion_handles_oc.f11035(var23) : var23;
        if (NIL == module0178.f11314(var23)) {
            assertions_interface_oc.f11077(var23, (SubLObject)$ic7$);
            return module0178.f11314(var23);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33005(final SubLObject var15, final SubLObject var1) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = module0528.$g3884$.currentBinding(var16);
        try {
            module0528.$g3884$.bind((SubLObject)NIL, var16);
            final SubLObject var19 = module0528.f32898();
            assert NIL != module0055.f4006(var19) : var19;
            final SubLObject var10_26 = module0131.$g1538$.currentBinding(var16);
            final SubLObject var20 = module0012.$g59$.currentBinding(var16);
            try {
                module0131.$g1538$.bind(var19, var16);
                module0012.$g59$.bind((SubLObject)NIL, var16);
                try {
                    var17 = module0528.f32927(var15, var1);
                }
                finally {
                    final SubLObject var10_27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var16);
                        module0528.f32915();
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var10_27, var16);
                    }
                }
            }
            finally {
                module0012.$g59$.rebind(var20, var16);
                module0131.$g1538$.rebind(var10_26, var16);
            }
        }
        finally {
            module0528.$g3884$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f33006(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = $ic0$;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != module0178.f11290(var1) : var1;
        var3.resetMultipleValues();
        final SubLObject var4 = f33007(var1, var2);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        return f33008(var4, var2);
    }
    
    public static SubLObject f33004(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = $ic0$;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != module0178.f11290(var1) : var1;
        var3.resetMultipleValues();
        final SubLObject var4 = f33007(var1, var2);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (!$g3898$.getGlobalValue().isNumber() || var5.numLE($g3898$.getGlobalValue())) {
            final SubLObject var6 = f33008(var4, var2);
            return Values.values(module0052.f3709(var6), Sequences.length(var6));
        }
        return Errors.error((SubLObject)$ic9$);
    }
    
    public static SubLObject f33008(final SubLObject var28, final SubLObject var2) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)NIL;
        final SubLObject var31 = module0528.f32898();
        assert NIL != module0055.f4006(var31) : var31;
        final SubLObject var32 = module0131.$g1538$.currentBinding(var29);
        final SubLObject var33 = module0012.$g59$.currentBinding(var29);
        try {
            module0131.$g1538$.bind(var31, var29);
            module0012.$g59$.bind((SubLObject)NIL, var29);
            try {
                final SubLObject var34 = (SubLObject)$ic10$;
                final SubLObject var35 = module0528.f32963(module0232.f15315(), var34);
                final SubLObject var37;
                final SubLObject var36 = var37 = Sequences.cconcatenate((SubLObject)$ic11$, module0006.f205(var28));
                final SubLObject var10_35 = module0012.$g73$.currentBinding(var29);
                final SubLObject var11_36 = module0012.$g65$.currentBinding(var29);
                final SubLObject var38 = module0012.$g67$.currentBinding(var29);
                final SubLObject var39 = module0012.$g68$.currentBinding(var29);
                final SubLObject var40 = module0012.$g66$.currentBinding(var29);
                final SubLObject var41 = module0012.$g69$.currentBinding(var29);
                final SubLObject var42 = module0012.$g70$.currentBinding(var29);
                final SubLObject var43 = module0012.$silent_progressP$.currentBinding(var29);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var29);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var29), var29);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var29);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var29);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var29);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var29);
                    module0012.$g70$.bind((SubLObject)T, var29);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var37) ? module0012.$silent_progressP$.getDynamicValue(var29) : T), var29);
                    module0012.f474(var37);
                    var30 = module0409.f28506(var28, var2, var35);
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var43, var29);
                    module0012.$g70$.rebind(var42, var29);
                    module0012.$g69$.rebind(var41, var29);
                    module0012.$g66$.rebind(var40, var29);
                    module0012.$g68$.rebind(var39, var29);
                    module0012.$g67$.rebind(var38, var29);
                    module0012.$g65$.rebind(var11_36, var29);
                    module0012.$g73$.rebind(var10_35, var29);
                }
            }
            finally {
                final SubLObject var10_36 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var29);
                    module0528.f32915();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var10_36, var29);
                }
            }
        }
        finally {
            module0012.$g59$.rebind(var33, var29);
            module0131.$g1538$.rebind(var32, var29);
        }
        final SubLObject var44 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic12$), var30);
        final SubLObject var45 = Sort.sort(module0035.f2269(var44, Symbols.symbol_function((SubLObject)$ic13$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic14$), Symbols.symbol_function((SubLObject)$ic15$));
        return var45;
    }
    
    public static SubLObject f33007(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = $ic0$;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != module0178.f11290(var1) : var1;
        final SubLObject var4 = module0178.f11282(var1);
        final SubLObject var5 = module0232.f15306(var4);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        if (NIL != var5) {
            if (NIL != module0035.f1997(var5)) {
                var6 = var5.first();
                var7 = module0411.f28638(var6, (SubLObject)$ic16$, var2, (SubLObject)$ic17$);
            }
            else {
                final SubLObject var8 = module0528.f32898();
                assert NIL != module0055.f4006(var8) : var8;
                final SubLObject var9 = module0131.$g1538$.currentBinding(var3);
                final SubLObject var10 = module0012.$g59$.currentBinding(var3);
                try {
                    module0131.$g1538$.bind(var8, var3);
                    module0012.$g59$.bind((SubLObject)NIL, var3);
                    try {
                        final SubLObject var11 = module0232.f15330((SubLObject)NIL, var5);
                        final SubLObject var12 = (SubLObject)$ic18$;
                        final SubLObject var13 = module0528.f32963(module0232.f15315(), var12);
                        SubLObject var14 = (SubLObject)NIL;
                        try {
                            var14 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)TWO_INTEGER), module0409.f28508(var11, var2, (SubLObject)NIL, var13));
                            if (NIL != var14) {
                                final SubLObject var15 = inference_datastructures_inference_oc.f25606(var14);
                                final SubLObject var16 = inference_datastructures_inference_oc.f25597(var14);
                                final SubLObject var17 = module0363.f24618(var16);
                                final SubLObject var18 = Sequences.find((SubLObject)$ic19$, var17, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic20$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (NIL != var18) {
                                    final SubLObject var19 = module0381.f27073(var18);
                                    final SubLObject var20 = module0373.f26189(var19, var15);
                                    var6 = module0363.f24564(var19);
                                    var7 = module0360.f23936(var20);
                                }
                            }
                        }
                        finally {
                            final SubLObject var10_54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                if (NIL != var14) {}
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var10_54, var3);
                            }
                        }
                    }
                    finally {
                        final SubLObject var10_55 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                            module0528.f32915();
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var10_55, var3);
                        }
                    }
                }
                finally {
                    module0012.$g59$.rebind(var10, var3);
                    module0131.$g1538$.rebind(var9, var3);
                }
            }
        }
        return Values.values(var6, var7);
    }
    
    public static SubLObject f33009(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = $ic0$;
        }
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f33007(var1, var2));
    }
    
    public static SubLObject f33010(final SubLObject var56) {
        return Sequences.find_if(Symbols.symbol_function((SubLObject)$ic21$), var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33011() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0529", "f33002", "S#36469", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0529", "f33003", "S#36470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0529", "f33005", "S#36471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0529", "f33006", "S#36472", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0529", "f33004", "S#36473", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0529", "f33008", "S#36474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0529", "f33007", "S#36475", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0529", "f33009", "S#36476", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0529", "f33010", "S#36477", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33012() {
        $g3898$ = SubLFiles.deflexical("S#36478", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33013() {
        module0012.f419((SubLObject)$ic12$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33011();
    }
    
    public void initializeVariables() {
        f33012();
    }
    
    public void runTopLevelForms() {
        f33013();
    }
    
    static {
        me = (SubLFile)new module0529();
        $g3898$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic1$ = makeSymbol("S#12732", "CYC");
        $ic2$ = makeString("Triggering rule ");
        $ic3$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic4$ = makeSymbol("S#38", "CYC");
        $ic5$ = makeString("~A");
        $ic6$ = makeSymbol("ASSERTION-P");
        $ic7$ = makeKeyword("FORWARD");
        $ic8$ = makeSymbol("S#690", "CYC");
        $ic9$ = makeString("time to use a real query iterator here");
        $ic10$ = ConsesLow.list((SubLObject)makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)makeKeyword("POSITIVE-INFINITY"), (SubLObject)makeKeyword("RETURN"), (SubLObject)makeKeyword("SUPPORTS"));
        $ic11$ = makeString("Determining trigger GAFs for ");
        $ic12$ = makeSymbol("S#36477", "CYC");
        $ic13$ = makeSymbol("S#2879", "CYC");
        $ic14$ = makeSymbol("<");
        $ic15$ = makeSymbol("ASSERTION-ID");
        $ic16$ = makeKeyword("POS");
        $ic17$ = makeKeyword("ALL");
        $ic18$ = ConsesLow.list((SubLObject)makeKeyword("BROWSABLE?"), (SubLObject)T, (SubLObject)makeKeyword("MAX-STEP"), (SubLObject)FIVE_INTEGER, (SubLObject)makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)makeKeyword("POSITIVE-INFINITY"), (SubLObject)makeKeyword("ALLOWED-MODULES"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("MODULE-TYPE"), (SubLObject)makeKeyword("REMOVAL-CONJUNCTIVE")), (SubLObject)makeKeyword("JOIN"))));
        $ic19$ = makeKeyword("JOIN-ORDERED");
        $ic20$ = makeSymbol("TACTIC-HL-MODULE-NAME");
        $ic21$ = makeSymbol("S#11995", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 214 ms
	
	Decompiled with Procyon 0.5.32.
*/