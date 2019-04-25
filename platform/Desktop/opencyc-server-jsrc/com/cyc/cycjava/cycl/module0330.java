package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (var2 == module0330.UNPROVIDED) {
            var2 = (SubLObject)module0330.NIL;
        }
        if (module0330.NIL != module0173.f10955(var1)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0330.NIL != f22358(var1) && (module0330.NIL != module0221.f14626(var1, module0330.$ic0$, var2, (SubLObject)module0330.ONE_INTEGER, (SubLObject)module0330.$ic1$) || module0330.NIL != module0221.f14626(var1, module0330.$ic0$, var2, (SubLObject)module0330.TWO_INTEGER, (SubLObject)module0330.$ic1$)));
        }
        return (SubLObject)module0330.NIL;
    }
    
    public static SubLObject f22358(final SubLObject var1) {
        if (module0330.NIL != module0173.f10955(var1)) {
            if (module0330.NIL == module0077.f5302(module0330.$g2844$.getGlobalValue())) {
                f22359();
            }
            return module0077.f5320(var1, module0330.$g2844$.getGlobalValue());
        }
        return (SubLObject)module0330.NIL;
    }
    
    public static SubLObject f22360() {
        if (module0330.NIL != module0330.$g2844$.getGlobalValue()) {
            module0077.f5328(module0330.$g2844$.getGlobalValue());
        }
        return (SubLObject)module0330.NIL;
    }
    
    public static SubLObject f22359() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0330.NIL != constant_handles_oc.f8463(module0330.$ic0$, (SubLObject)module0330.UNPROVIDED)) {
            final SubLObject var4 = (SubLObject)module0330.$ic3$;
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
                module0012.$g67$.bind((SubLObject)module0330.ONE_INTEGER, var3);
                module0012.$g68$.bind((SubLObject)module0330.ZERO_INTEGER, var3);
                module0012.$g66$.bind((SubLObject)module0330.ZERO_INTEGER, var3);
                module0012.$g69$.bind((SubLObject)module0330.ZERO_INTEGER, var3);
                module0012.$g70$.bind((SubLObject)module0330.T, var3);
                module0012.$silent_progressP$.bind((SubLObject)((module0330.NIL != var4) ? module0012.$silent_progressP$.getDynamicValue(var3) : module0330.T), var3);
                module0012.f474(var4);
                final SubLObject var13 = Numbers.multiply((SubLObject)module0330.TWO_INTEGER, module0221.f14631(module0330.$ic0$, (SubLObject)module0330.UNPROVIDED));
                module0330.$g2844$.setGlobalValue(module0077.f5313((SubLObject)module0330.EQL, var13));
                final SubLObject var5_14 = module0147.$g2094$.currentBinding(var3);
                final SubLObject var6_15 = module0147.$g2095$.currentBinding(var3);
                try {
                    module0147.$g2094$.bind((SubLObject)module0330.$ic4$, var3);
                    module0147.$g2095$.bind(module0330.$ic5$, var3);
                    SubLObject var14 = module0260.f17034(module0330.$ic0$, (SubLObject)module0330.UNPROVIDED, (SubLObject)module0330.UNPROVIDED);
                    SubLObject var15 = (SubLObject)module0330.NIL;
                    var15 = var14.first();
                    while (module0330.NIL != var14) {
                        final SubLObject var16 = var15;
                        if (module0330.NIL != module0158.f10038(var16)) {
                            final SubLObject var4_19 = (SubLObject)module0330.NIL;
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
                                module0012.$g67$.bind((SubLObject)module0330.ONE_INTEGER, var3);
                                module0012.$g68$.bind((SubLObject)module0330.ZERO_INTEGER, var3);
                                module0012.$g66$.bind((SubLObject)module0330.ZERO_INTEGER, var3);
                                module0012.$g69$.bind((SubLObject)module0330.ZERO_INTEGER, var3);
                                module0012.$g70$.bind((SubLObject)module0330.T, var3);
                                module0012.$silent_progressP$.bind((SubLObject)((module0330.NIL != var4_19) ? module0012.$silent_progressP$.getDynamicValue(var3) : module0330.T), var3);
                                module0012.f474(var4_19);
                                final SubLObject var17 = module0158.f10039(var16);
                                SubLObject var18 = (SubLObject)module0330.NIL;
                                final SubLObject var19 = (SubLObject)module0330.NIL;
                                while (module0330.NIL == var18) {
                                    final SubLObject var20 = module0052.f3695(var17, var19);
                                    final SubLObject var21 = (SubLObject)SubLObjectFactory.makeBoolean(!var19.eql(var20));
                                    if (module0330.NIL != var21) {
                                        module0012.f476();
                                        SubLObject var22 = (SubLObject)module0330.NIL;
                                        try {
                                            var22 = module0158.f10316(var20, (SubLObject)module0330.$ic6$, (SubLObject)module0330.NIL, (SubLObject)module0330.NIL);
                                            SubLObject var29_34 = (SubLObject)module0330.NIL;
                                            final SubLObject var30_35 = (SubLObject)module0330.NIL;
                                            while (module0330.NIL == var29_34) {
                                                final SubLObject var23 = module0052.f3695(var22, var30_35);
                                                final SubLObject var32_37 = (SubLObject)SubLObjectFactory.makeBoolean(!var30_35.eql(var23));
                                                if (module0330.NIL != var32_37) {
                                                    f22361(var23);
                                                }
                                                var29_34 = (SubLObject)SubLObjectFactory.makeBoolean(module0330.NIL == var32_37);
                                            }
                                        }
                                        finally {
                                            final SubLObject var5_16 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0330.T, var3);
                                                if (module0330.NIL != var22) {
                                                    module0158.f10319(var22);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var5_16, var3);
                                            }
                                        }
                                    }
                                    var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0330.NIL == var21);
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
        return (SubLObject)module0330.NIL;
    }
    
    public static SubLObject f22362(final SubLObject var39, final SubLObject var40) {
        if (module0330.NIL != module0178.f11284(var40)) {
            final SubLObject var41 = module0178.f11334(var40);
            if (module0330.NIL != module0173.f10955(var41)) {
                f22363(var41);
            }
            final SubLObject var42 = module0178.f11335(var40);
            if (module0330.NIL != module0173.f10955(var42)) {
                f22363(var42);
            }
        }
        return (SubLObject)module0330.NIL;
    }
    
    public static SubLObject f22361(final SubLObject var40) {
        if (module0330.NIL != module0178.f11284(var40) && module0330.NIL != module0178.f11299(var40)) {
            final SubLObject var41 = module0178.f11287(var40);
            if (module0330.NIL != module0161.f10571(var41, (SubLObject)module0330.UNPROVIDED)) {
                final SubLObject var42 = module0178.f11334(var40);
                final SubLObject var43 = module0178.f11335(var40);
                if (module0330.NIL != module0173.f10969(var42)) {
                    module0077.f5326(var42, module0330.$g2844$.getGlobalValue());
                }
                if (module0330.NIL != module0173.f10969(var43)) {
                    module0077.f5326(var43, module0330.$g2844$.getGlobalValue());
                }
            }
        }
        return (SubLObject)module0330.NIL;
    }
    
    public static SubLObject f22363(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0330.NIL == module0330.$g2844$.getGlobalValue()) {
            f22359();
        }
        module0077.f5327(var43, module0330.$g2844$.getGlobalValue());
        SubLObject var45 = module0147.$g2094$.currentBinding(var44);
        SubLObject var46 = module0147.$g2095$.currentBinding(var44);
        try {
            module0147.$g2094$.bind((SubLObject)module0330.$ic4$, var44);
            module0147.$g2095$.bind(module0330.$ic5$, var44);
            SubLObject var47 = module0260.f17034(module0330.$ic0$, (SubLObject)module0330.UNPROVIDED, (SubLObject)module0330.UNPROVIDED);
            SubLObject var48 = (SubLObject)module0330.NIL;
            var48 = var47.first();
            while (module0330.NIL != var47) {
                final SubLObject var49 = var48;
                if (module0330.NIL != module0158.f10010(var43, (SubLObject)module0330.ONE_INTEGER, var49)) {
                    final SubLObject var50 = module0158.f10011(var43, (SubLObject)module0330.ONE_INTEGER, var49);
                    SubLObject var51 = (SubLObject)module0330.NIL;
                    final SubLObject var52 = (SubLObject)module0330.NIL;
                    while (module0330.NIL == var51) {
                        final SubLObject var53 = module0052.f3695(var50, var52);
                        final SubLObject var54 = (SubLObject)SubLObjectFactory.makeBoolean(!var52.eql(var53));
                        if (module0330.NIL != var54) {
                            SubLObject var55 = (SubLObject)module0330.NIL;
                            try {
                                var55 = module0158.f10316(var53, (SubLObject)module0330.$ic6$, (SubLObject)module0330.NIL, (SubLObject)module0330.NIL);
                                SubLObject var29_47 = (SubLObject)module0330.NIL;
                                final SubLObject var30_48 = (SubLObject)module0330.NIL;
                                while (module0330.NIL == var29_47) {
                                    final SubLObject var56 = module0052.f3695(var55, var30_48);
                                    final SubLObject var32_49 = (SubLObject)SubLObjectFactory.makeBoolean(!var30_48.eql(var56));
                                    if (module0330.NIL != var32_49 && module0330.NIL != module0178.f11299(var56)) {
                                        f22361(var56);
                                    }
                                    var29_47 = (SubLObject)SubLObjectFactory.makeBoolean(module0330.NIL == var32_49);
                                }
                            }
                            finally {
                                final SubLObject var5_50 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0330.T, var44);
                                    if (module0330.NIL != var55) {
                                        module0158.f10319(var55);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var5_50, var44);
                                }
                            }
                        }
                        var51 = (SubLObject)SubLObjectFactory.makeBoolean(module0330.NIL == var54);
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
            module0147.$g2094$.bind((SubLObject)module0330.$ic4$, var44);
            module0147.$g2095$.bind(module0330.$ic5$, var44);
            SubLObject var47 = module0260.f17034(module0330.$ic0$, (SubLObject)module0330.UNPROVIDED, (SubLObject)module0330.UNPROVIDED);
            SubLObject var48 = (SubLObject)module0330.NIL;
            var48 = var47.first();
            while (module0330.NIL != var47) {
                final SubLObject var49 = var48;
                if (module0330.NIL != module0158.f10010(var43, (SubLObject)module0330.TWO_INTEGER, var49)) {
                    final SubLObject var50 = module0158.f10011(var43, (SubLObject)module0330.TWO_INTEGER, var49);
                    SubLObject var51 = (SubLObject)module0330.NIL;
                    final SubLObject var52 = (SubLObject)module0330.NIL;
                    while (module0330.NIL == var51) {
                        final SubLObject var53 = module0052.f3695(var50, var52);
                        final SubLObject var54 = (SubLObject)SubLObjectFactory.makeBoolean(!var52.eql(var53));
                        if (module0330.NIL != var54) {
                            SubLObject var55 = (SubLObject)module0330.NIL;
                            try {
                                var55 = module0158.f10316(var53, (SubLObject)module0330.$ic6$, (SubLObject)module0330.NIL, (SubLObject)module0330.NIL);
                                SubLObject var29_48 = (SubLObject)module0330.NIL;
                                final SubLObject var30_49 = (SubLObject)module0330.NIL;
                                while (module0330.NIL == var29_48) {
                                    final SubLObject var56 = module0052.f3695(var55, var30_49);
                                    final SubLObject var32_50 = (SubLObject)SubLObjectFactory.makeBoolean(!var30_49.eql(var56));
                                    if (module0330.NIL != var32_50 && module0330.NIL != module0178.f11299(var56)) {
                                        f22361(var56);
                                    }
                                    var29_48 = (SubLObject)SubLObjectFactory.makeBoolean(module0330.NIL == var32_50);
                                }
                            }
                            finally {
                                final SubLObject var5_51 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0330.T, var44);
                                    if (module0330.NIL != var55) {
                                        module0158.f10319(var55);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var5_51, var44);
                                }
                            }
                        }
                        var51 = (SubLObject)SubLObjectFactory.makeBoolean(module0330.NIL == var54);
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
        return (SubLObject)module0330.NIL;
    }
    
    public static SubLObject f22364(final SubLObject var1, SubLObject var2) {
        if (var2 == module0330.UNPROVIDED) {
            var2 = (SubLObject)module0330.NIL;
        }
        if (module0330.NIL != module0173.f10955(var1)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0330.NIL != f22365(var1) && module0330.NIL != module0220.f14548(var1, module0330.$ic8$, var2, (SubLObject)module0330.TWO_INTEGER, (SubLObject)module0330.$ic1$));
        }
        return (SubLObject)module0330.NIL;
    }
    
    public static SubLObject f22365(final SubLObject var1) {
        if (module0330.NIL != module0173.f10955(var1)) {
            return module0222.f14635(module0330.$ic8$, var1, (SubLObject)module0330.TWO_INTEGER, (SubLObject)module0330.UNPROVIDED);
        }
        return (SubLObject)module0330.NIL;
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
        return (SubLObject)module0330.NIL;
    }
    
    public static SubLObject f22367() {
        module0330.$g2844$ = SubLFiles.deflexical("S#24883", (SubLObject)((module0330.NIL != Symbols.boundp((SubLObject)module0330.$ic2$)) ? module0330.$g2844$.getGlobalValue() : module0330.NIL));
        return (SubLObject)module0330.NIL;
    }
    
    public static SubLObject f22368() {
        module0003.f57((SubLObject)module0330.$ic2$);
        module0012.f416((SubLObject)module0330.$ic7$);
        return (SubLObject)module0330.NIL;
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
        module0330.$g2844$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic1$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic2$ = SubLObjectFactory.makeSymbol("S#24883", "CYC");
        $ic3$ = SubLObjectFactory.makeString("Initializing some equality assertions somewhere...");
        $ic4$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic6$ = SubLObjectFactory.makeKeyword("GAF");
        $ic7$ = SubLObjectFactory.makeSymbol("DECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE");
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0330.class
	Total time: 212 ms
	
	Decompiled with Procyon 0.5.32.
*/