package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0477 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0477";
    public static final String myFingerPrint = "62f538f66c6010f9351e7722e22ebf103ecdd3f36c1440fc3b3206ba8eb31281";
    private static SubLSymbol $g3693$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLFloat $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    
    public static SubLObject f31667(final SubLObject var1, SubLObject var2) {
        if (var2 == module0477.UNPROVIDED) {
            var2 = (SubLObject)module0477.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0147.$g2095$.getDynamicValue(var3);
        final SubLObject var5 = module0205.f13387(var1, (SubLObject)module0477.UNPROVIDED);
        final SubLObject var6 = f31668(var5, var4);
        if (module0477.NIL != var6) {
            final SubLObject var7 = module0191.f11990((SubLObject)module0477.$ic2$, var1, (SubLObject)module0477.UNPROVIDED, (SubLObject)module0477.UNPROVIDED);
            module0347.f23330(var7, (SubLObject)module0477.UNPROVIDED, (SubLObject)module0477.UNPROVIDED);
        }
        return (SubLObject)module0477.NIL;
    }
    
    public static SubLObject f31668(final SubLObject var5, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0477.NIL;
        SubLObject var11 = (SubLObject)module0477.NIL;
        SubLObject var12 = (SubLObject)module0477.NIL;
        SubLObject var13 = (SubLObject)module0477.NIL;
        try {
            if (module0477.NIL == var12) {
                final SubLObject var14 = module0018.$g646$.currentBinding(var9);
                try {
                    module0018.$g646$.bind((SubLObject)module0477.NIL, var9);
                    final SubLObject var15 = module0434.f30592(var5, var8, (SubLObject)module0477.UNPROVIDED);
                    if (module0477.NIL != module0035.sublisp_boolean(var15)) {
                        var13 = (SubLObject)module0477.T;
                        var12 = (SubLObject)module0477.T;
                    }
                }
                finally {
                    module0018.$g646$.rebind(var14, var9);
                }
            }
            if (module0477.NIL == var12 && module0477.NIL == module0035.f2428(module0477.$ic6$, var5, (SubLObject)module0477.UNPROVIDED, (SubLObject)module0477.UNPROVIDED)) {
                final SubLObject var16 = module0205.f13338(var5);
                final SubLObject var17 = module0018.$g646$.currentBinding(var9);
                try {
                    module0018.$g646$.bind((SubLObject)module0477.NIL, var9);
                    final SubLObject var18 = module0434.f30592(var16, var8, (SubLObject)module0477.UNPROVIDED);
                    if (module0477.NIL != module0035.sublisp_boolean(var18)) {
                        f31669(var5, var8, conses_high.second(var18.first()));
                        var13 = (SubLObject)module0477.NIL;
                        var12 = (SubLObject)module0477.T;
                    }
                }
                finally {
                    module0018.$g646$.rebind(var17, var9);
                }
            }
            if (module0477.NIL == var12) {
                var10 = module0541.f33587(var8, (SubLObject)module0477.UNPROVIDED);
                var11 = module0541.f33547(var5, var10, (SubLObject)module0477.UNPROVIDED, (SubLObject)module0477.UNPROVIDED);
                var13 = module0035.sublisp_boolean(var11);
            }
        }
        finally {
            final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0477.T, var9);
                if (module0477.NIL != var11 && module0477.NIL == module0233.f15393(var11)) {
                    SubLObject var20 = var11;
                    SubLObject var21 = (SubLObject)module0477.NIL;
                    var21 = var20.first();
                    while (module0477.NIL != var20) {
                        final SubLObject var22 = module0233.f15370(var21);
                        if (module0477.NIL != module0173.f10955(var22)) {
                            module0538.f33365(var22);
                        }
                        var20 = var20.rest();
                        var21 = var20.first();
                    }
                }
                if (module0477.NIL != var10 && module0477.NIL != module0173.f10955(module0161.f10557(var10))) {
                    module0538.f33365(module0161.f10557(var10));
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var19, var9);
            }
        }
        return var13;
    }
    
    public static SubLObject f31669(final SubLObject var5, final SubLObject var8, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (module0477.NIL != module0018.$g676$.getDynamicValue(var21)) {
            final SubLObject var22 = module0191.f11990((SubLObject)module0477.$ic7$, var5, var8, (SubLObject)module0477.UNPROVIDED);
            module0334.f22562((SubLObject)ConsesLow.cons(var22, var20));
        }
        return (SubLObject)module0477.NIL;
    }
    
    public static SubLObject f31670(final SubLObject var1, SubLObject var2) {
        if (var2 == module0477.UNPROVIDED) {
            var2 = (SubLObject)module0477.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0147.$g2095$.getDynamicValue(var3);
        final SubLObject var5 = module0205.f13387(var1, (SubLObject)module0477.UNPROVIDED);
        final SubLObject var6 = f31671(var5, var4);
        if (module0477.NIL != var6) {
            module0347.f23330(module0191.f11990((SubLObject)module0477.$ic2$, module0205.f13338(var1), (SubLObject)module0477.UNPROVIDED, (SubLObject)module0477.UNPROVIDED), (SubLObject)module0477.UNPROVIDED, (SubLObject)module0477.UNPROVIDED);
        }
        return (SubLObject)module0477.NIL;
    }
    
    public static SubLObject f31671(final SubLObject var5, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0477.NIL;
        SubLObject var11 = (SubLObject)module0477.NIL;
        SubLObject var12 = (SubLObject)module0477.NIL;
        SubLObject var13 = (SubLObject)module0477.NIL;
        try {
            if (module0477.NIL == var12) {
                final SubLObject var14 = module0018.$g646$.currentBinding(var9);
                final SubLObject var15 = module0018.$g701$.currentBinding(var9);
                try {
                    module0018.$g646$.bind((SubLObject)module0477.NIL, var9);
                    module0018.$g701$.bind((SubLObject)module0477.NIL, var9);
                    final SubLObject var16 = module0434.f30592(var5, var8, (SubLObject)module0477.UNPROVIDED);
                    if (module0477.NIL != module0035.sublisp_boolean(var16)) {
                        var13 = (SubLObject)module0477.NIL;
                        var12 = (SubLObject)module0477.T;
                    }
                }
                finally {
                    module0018.$g701$.rebind(var15, var9);
                    module0018.$g646$.rebind(var14, var9);
                }
            }
            if (module0477.NIL == var12 && module0477.NIL == module0035.f2428(module0477.$ic6$, var5, (SubLObject)module0477.UNPROVIDED, (SubLObject)module0477.UNPROVIDED)) {
                final SubLObject var17 = module0205.f13338(var5);
                final SubLObject var18 = module0018.$g646$.currentBinding(var9);
                final SubLObject var19 = module0018.$g701$.currentBinding(var9);
                try {
                    module0018.$g646$.bind((SubLObject)module0477.NIL, var9);
                    module0018.$g701$.bind((SubLObject)module0477.NIL, var9);
                    final SubLObject var20 = module0434.f30592(var17, var8, (SubLObject)module0477.UNPROVIDED);
                    if (module0477.NIL != module0035.sublisp_boolean(var20)) {
                        f31669(var5, var8, conses_high.second(var20.first()));
                        var13 = (SubLObject)module0477.T;
                        var12 = (SubLObject)module0477.T;
                    }
                }
                finally {
                    module0018.$g701$.rebind(var19, var9);
                    module0018.$g646$.rebind(var18, var9);
                }
            }
            if (module0477.NIL == var12) {
                var10 = module0541.f33587(var8, (SubLObject)module0477.UNPROVIDED);
                var11 = module0541.f33547(var5, var10, (SubLObject)module0477.UNPROVIDED, (SubLObject)module0477.UNPROVIDED);
                var13 = (SubLObject)SubLObjectFactory.makeBoolean(module0477.NIL == module0035.sublisp_boolean(var11));
            }
        }
        finally {
            final SubLObject var21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0477.T, var9);
                if (module0477.NIL != var11 && module0477.NIL == module0233.f15393(var11)) {
                    SubLObject var22 = var11;
                    SubLObject var23 = (SubLObject)module0477.NIL;
                    var23 = var22.first();
                    while (module0477.NIL != var22) {
                        final SubLObject var24 = module0233.f15370(var23);
                        if (module0477.NIL != module0173.f10955(var24)) {
                            module0538.f33365(var24);
                        }
                        var22 = var22.rest();
                        var23 = var22.first();
                    }
                }
                if (module0477.NIL != var10 && module0477.NIL != module0173.f10955(module0161.f10557(var10))) {
                    module0538.f33365(module0161.f10557(var10));
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var21, var9);
            }
        }
        return var13;
    }
    
    public static SubLObject f31672() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0477", "f31667", "S#35015", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0477", "f31668", "S#24946", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0477", "f31669", "S#35016", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0477", "f31670", "S#35017", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0477", "f31671", "S#24947", 2, 0, false);
        return (SubLObject)module0477.NIL;
    }
    
    public static SubLObject f31673() {
        module0477.$g3693$ = SubLFiles.deflexical("S#35018", (SubLObject)module0477.$ic5$);
        return (SubLObject)module0477.NIL;
    }
    
    public static SubLObject f31674() {
        module0340.f22938(module0477.$ic0$);
        module0358.f23773((SubLObject)module0477.$ic1$, module0477.$ic0$);
        module0340.f22941((SubLObject)module0477.$ic3$, (SubLObject)module0477.$ic4$);
        module0340.f22941((SubLObject)module0477.$ic8$, (SubLObject)module0477.$ic9$);
        return (SubLObject)module0477.NIL;
    }
    
    public void declareFunctions() {
        f31672();
    }
    
    public void initializeVariables() {
        f31673();
    }
    
    public void runTopLevelForms() {
        f31674();
    }
    
    static {
        me = (SubLFile)new module0477();
        module0477.$g3693$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("consistent"));
        $ic1$ = SubLObjectFactory.makeKeyword("BOTH");
        $ic2$ = SubLObjectFactory.makeKeyword("CONSISTENT");
        $ic3$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSISTENT-POS");
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("consistent")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("consistent")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12753", "CYC")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35018", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35015", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$consistent <fully-bound>)\nby hypothesizing the formula and checking for lack of a contradiction"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$consistent (#$languagesSpokenHere #$Texas-State #$SpanishLanguage))") });
        $ic5$ = (SubLFloat)SubLObjectFactory.makeDouble(1.5);
        $ic6$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic7$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic8$ = SubLObjectFactory.makeKeyword("REMOVAL-CONSISTENT-NEG");
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("consistent")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("consistent")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#12753", "CYC")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35018", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35017", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$consistent <fully-bound>))\nby hypothesizing the formula and checking for a contradiction"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$consistent (#$bordersOn #$Canada #$Canada)))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0477.class
	Total time: 143 ms
	
	Decompiled with Procyon 0.5.32.
*/