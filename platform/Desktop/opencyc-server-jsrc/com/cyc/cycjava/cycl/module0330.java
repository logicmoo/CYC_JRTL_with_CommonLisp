package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0330 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0330";
    public static final String myFingerPrint = "4523432127d6c45f0e139dd7f79a9530ea175e40ed3e600d1a9ce6fb0f4e1cd6";
    private static SubLSymbol $g2844$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    
    public static SubLObject f22357(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return (SubLObject)makeBoolean(NIL != f22358(var1) && (NIL != module0221.f14626(var1, $ic0$, var2, (SubLObject)ONE_INTEGER, (SubLObject)$ic1$) || NIL != module0221.f14626(var1, $ic0$, var2, (SubLObject)TWO_INTEGER, (SubLObject)$ic1$)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22358(final SubLObject var1) {
        if (NIL != module0173.f10955(var1)) {
            if (NIL == module0077.f5302($g2844$.getGlobalValue())) {
                f22359();
            }
            return module0077.f5320(var1, $g2844$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22360() {
        if (NIL != $g2844$.getGlobalValue()) {
            module0077.f5328($g2844$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22359() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != constant_handles_oc.f8463($ic0$, (SubLObject)UNPROVIDED)) {
            final SubLObject var4 = (SubLObject)$ic3$;
            final SubLObject var5 = module0012.$g73$.currentBinding(var3);
            final SubLObject var6 = module0012.$g65$.currentBinding(var3);
            final SubLObject var7 = module0012.$g67$.currentBinding(var3);
            final SubLObject var8 = module0012.$g68$.currentBinding(var3);
            final SubLObject var9 = module0012.$g66$.currentBinding(var3);
            final SubLObject var10 = module0012.$g69$.currentBinding(var3);
            final SubLObject var11 = module0012.$g70$.currentBinding(var3);
            final SubLObject var12 = module0012.$silent_progressP$.currentBinding(var3);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var3);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                module0012.$g70$.bind((SubLObject)T, var3);
                module0012.$silent_progressP$.bind((SubLObject)((NIL != var4) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                module0012.f474(var4);
                final SubLObject var13 = Numbers.multiply((SubLObject)TWO_INTEGER, module0221.f14631($ic0$, (SubLObject)UNPROVIDED));
                $g2844$.setGlobalValue(module0077.f5313((SubLObject)EQL, var13));
                final SubLObject var5_14 = module0147.$g2094$.currentBinding(var3);
                final SubLObject var6_15 = module0147.$g2095$.currentBinding(var3);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic4$, var3);
                    module0147.$g2095$.bind($ic5$, var3);
                    SubLObject var14 = module0260.f17034($ic0$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var15 = (SubLObject)NIL;
                    var15 = var14.first();
                    while (NIL != var14) {
                        final SubLObject var16 = var15;
                        if (NIL != module0158.f10038(var16)) {
                            final SubLObject var4_19 = (SubLObject)NIL;
                            final SubLObject var5_15 = module0012.$g73$.currentBinding(var3);
                            final SubLObject var6_16 = module0012.$g65$.currentBinding(var3);
                            final SubLObject var7_22 = module0012.$g67$.currentBinding(var3);
                            final SubLObject var8_23 = module0012.$g68$.currentBinding(var3);
                            final SubLObject var9_24 = module0012.$g66$.currentBinding(var3);
                            final SubLObject var10_25 = module0012.$g69$.currentBinding(var3);
                            final SubLObject var11_26 = module0012.$g70$.currentBinding(var3);
                            final SubLObject var12_27 = module0012.$silent_progressP$.currentBinding(var3);
                            try {
                                module0012.$g73$.bind(Time.get_universal_time(), var3);
                                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                                module0012.$g70$.bind((SubLObject)T, var3);
                                module0012.$silent_progressP$.bind((SubLObject)((NIL != var4_19) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                                module0012.f474(var4_19);
                                final SubLObject var17 = module0158.f10039(var16);
                                SubLObject var18 = (SubLObject)NIL;
                                final SubLObject var19 = (SubLObject)NIL;
                                while (NIL == var18) {
                                    final SubLObject var20 = module0052.f3695(var17, var19);
                                    final SubLObject var21 = (SubLObject)makeBoolean(!var19.eql(var20));
                                    if (NIL != var21) {
                                        module0012.f476();
                                        SubLObject var22 = (SubLObject)NIL;
                                        try {
                                            var22 = module0158.f10316(var20, (SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)NIL);
                                            SubLObject var29_34 = (SubLObject)NIL;
                                            final SubLObject var30_35 = (SubLObject)NIL;
                                            while (NIL == var29_34) {
                                                final SubLObject var23 = module0052.f3695(var22, var30_35);
                                                final SubLObject var32_37 = (SubLObject)makeBoolean(!var30_35.eql(var23));
                                                if (NIL != var32_37) {
                                                    f22361(var23);
                                                }
                                                var29_34 = (SubLObject)makeBoolean(NIL == var32_37);
                                            }
                                        }
                                        finally {
                                            final SubLObject var5_16 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                                if (NIL != var22) {
                                                    module0158.f10319(var22);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var5_16, var3);
                                            }
                                        }
                                    }
                                    var18 = (SubLObject)makeBoolean(NIL == var21);
                                }
                                module0012.f475();
                            }
                            finally {
                                module0012.$silent_progressP$.rebind(var12_27, var3);
                                module0012.$g70$.rebind(var11_26, var3);
                                module0012.$g69$.rebind(var10_25, var3);
                                module0012.$g66$.rebind(var9_24, var3);
                                module0012.$g68$.rebind(var8_23, var3);
                                module0012.$g67$.rebind(var7_22, var3);
                                module0012.$g65$.rebind(var6_16, var3);
                                module0012.$g73$.rebind(var5_15, var3);
                            }
                        }
                        var14 = var14.rest();
                        var15 = var14.first();
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var6_15, var3);
                    module0147.$g2094$.rebind(var5_14, var3);
                }
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var12, var3);
                module0012.$g70$.rebind(var11, var3);
                module0012.$g69$.rebind(var10, var3);
                module0012.$g66$.rebind(var9, var3);
                module0012.$g68$.rebind(var8, var3);
                module0012.$g67$.rebind(var7, var3);
                module0012.$g65$.rebind(var6, var3);
                module0012.$g73$.rebind(var5, var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22362(final SubLObject var39, final SubLObject var40) {
        if (NIL != module0178.f11284(var40)) {
            final SubLObject var41 = module0178.f11334(var40);
            if (NIL != module0173.f10955(var41)) {
                f22363(var41);
            }
            final SubLObject var42 = module0178.f11335(var40);
            if (NIL != module0173.f10955(var42)) {
                f22363(var42);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22361(final SubLObject var40) {
        if (NIL != module0178.f11284(var40) && NIL != module0178.f11299(var40)) {
            final SubLObject var41 = module0178.f11287(var40);
            if (NIL != module0161.f10571(var41, (SubLObject)UNPROVIDED)) {
                final SubLObject var42 = module0178.f11334(var40);
                final SubLObject var43 = module0178.f11335(var40);
                if (NIL != module0173.f10969(var42)) {
                    module0077.f5326(var42, $g2844$.getGlobalValue());
                }
                if (NIL != module0173.f10969(var43)) {
                    module0077.f5326(var43, $g2844$.getGlobalValue());
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22363(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (NIL == $g2844$.getGlobalValue()) {
            f22359();
        }
        module0077.f5327(var43, $g2844$.getGlobalValue());
        SubLObject var45 = module0147.$g2094$.currentBinding(var44);
        SubLObject var46 = module0147.$g2095$.currentBinding(var44);
        try {
            module0147.$g2094$.bind((SubLObject)$ic4$, var44);
            module0147.$g2095$.bind($ic5$, var44);
            SubLObject var47 = module0260.f17034($ic0$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var48 = (SubLObject)NIL;
            var48 = var47.first();
            while (NIL != var47) {
                final SubLObject var49 = var48;
                if (NIL != module0158.f10010(var43, (SubLObject)ONE_INTEGER, var49)) {
                    final SubLObject var50 = module0158.f10011(var43, (SubLObject)ONE_INTEGER, var49);
                    SubLObject var51 = (SubLObject)NIL;
                    final SubLObject var52 = (SubLObject)NIL;
                    while (NIL == var51) {
                        final SubLObject var53 = module0052.f3695(var50, var52);
                        final SubLObject var54 = (SubLObject)makeBoolean(!var52.eql(var53));
                        if (NIL != var54) {
                            SubLObject var55 = (SubLObject)NIL;
                            try {
                                var55 = module0158.f10316(var53, (SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var29_47 = (SubLObject)NIL;
                                final SubLObject var30_48 = (SubLObject)NIL;
                                while (NIL == var29_47) {
                                    final SubLObject var56 = module0052.f3695(var55, var30_48);
                                    final SubLObject var32_49 = (SubLObject)makeBoolean(!var30_48.eql(var56));
                                    if (NIL != var32_49 && NIL != module0178.f11299(var56)) {
                                        f22361(var56);
                                    }
                                    var29_47 = (SubLObject)makeBoolean(NIL == var32_49);
                                }
                            }
                            finally {
                                final SubLObject var5_50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var44);
                                    if (NIL != var55) {
                                        module0158.f10319(var55);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var5_50, var44);
                                }
                            }
                        }
                        var51 = (SubLObject)makeBoolean(NIL == var54);
                    }
                }
                var47 = var47.rest();
                var48 = var47.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var46, var44);
            module0147.$g2094$.rebind(var45, var44);
        }
        var45 = module0147.$g2094$.currentBinding(var44);
        var46 = module0147.$g2095$.currentBinding(var44);
        try {
            module0147.$g2094$.bind((SubLObject)$ic4$, var44);
            module0147.$g2095$.bind($ic5$, var44);
            SubLObject var47 = module0260.f17034($ic0$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var48 = (SubLObject)NIL;
            var48 = var47.first();
            while (NIL != var47) {
                final SubLObject var49 = var48;
                if (NIL != module0158.f10010(var43, (SubLObject)TWO_INTEGER, var49)) {
                    final SubLObject var50 = module0158.f10011(var43, (SubLObject)TWO_INTEGER, var49);
                    SubLObject var51 = (SubLObject)NIL;
                    final SubLObject var52 = (SubLObject)NIL;
                    while (NIL == var51) {
                        final SubLObject var53 = module0052.f3695(var50, var52);
                        final SubLObject var54 = (SubLObject)makeBoolean(!var52.eql(var53));
                        if (NIL != var54) {
                            SubLObject var55 = (SubLObject)NIL;
                            try {
                                var55 = module0158.f10316(var53, (SubLObject)$ic6$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var29_48 = (SubLObject)NIL;
                                final SubLObject var30_49 = (SubLObject)NIL;
                                while (NIL == var29_48) {
                                    final SubLObject var56 = module0052.f3695(var55, var30_49);
                                    final SubLObject var32_50 = (SubLObject)makeBoolean(!var30_49.eql(var56));
                                    if (NIL != var32_50 && NIL != module0178.f11299(var56)) {
                                        f22361(var56);
                                    }
                                    var29_48 = (SubLObject)makeBoolean(NIL == var32_50);
                                }
                            }
                            finally {
                                final SubLObject var5_51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var44);
                                    if (NIL != var55) {
                                        module0158.f10319(var55);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var5_51, var44);
                                }
                            }
                        }
                        var51 = (SubLObject)makeBoolean(NIL == var54);
                    }
                }
                var47 = var47.rest();
                var48 = var47.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var46, var44);
            module0147.$g2094$.rebind(var45, var44);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22364(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL != module0173.f10955(var1)) {
            return (SubLObject)makeBoolean(NIL != f22365(var1) && NIL != module0220.f14548(var1, $ic8$, var2, (SubLObject)TWO_INTEGER, (SubLObject)$ic1$));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22365(final SubLObject var1) {
        if (NIL != module0173.f10955(var1)) {
            return module0222.f14635($ic8$, var1, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22366() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0330", "f22357", "S#24878", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0330", "f22358", "S#24879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0330", "f22360", "S#16694", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0330", "f22359", "S#16697", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0330", "f22362", "DECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0330", "f22361", "S#24880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0330", "f22363", "S#24881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0330", "f22364", "S#24882", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0330", "f22365", "S#22354", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22367() {
        $g2844$ = SubLFiles.deflexical("S#24883", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g2844$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22368() {
        module0003.f57((SubLObject)$ic2$);
        module0012.f416((SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f22366();
    }
    
    public void initializeVariables() {
        f22367();
    }
    
    public void runTopLevelForms() {
        f22368();
    }
    
    static {
        me = (SubLFile)new module0330();
        $g2844$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic1$ = makeKeyword("TRUE");
        $ic2$ = makeSymbol("S#24883", "CYC");
        $ic3$ = makeString("Initializing some equality assertions somewhere...");
        $ic4$ = makeSymbol("S#12274", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic6$ = makeKeyword("GAF");
        $ic7$ = makeSymbol("DECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE");
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("rewriteOf"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 212 ms
	
	Decompiled with Procyon 0.5.32.
*/