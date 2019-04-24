package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0437 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0437";
    public static final String myFingerPrint = "4293429246dc9867d2d3d53382ff592b8783e3e55eb5227f53673eda04121a30";
    private static SubLSymbol $g3538$;
    private static SubLSymbol $g3539$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLFloat $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    
    public static SubLObject f30654(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0202.f12643(module0437.$ic0$, var1);
        return module0191.f11990((SubLObject)module0437.$ic1$, var3, var2, (SubLObject)module0437.$ic2$);
    }
    
    public static SubLObject f30655() {
        final SubLObject var4 = module0373.f26113();
        if (module0437.NIL != var4) {
            return module0361.f24167(var4);
        }
        return module0410.f28551((SubLObject)module0437.$ic3$);
    }
    
    public static SubLObject f30656(final SubLObject var5, final SubLObject var2, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0437.NIL != module0351.f23568(var6)) {
            final SubLObject var8 = module0018.$g646$.currentBinding(var7);
            final SubLObject var9 = module0018.$g647$.currentBinding(var7);
            final SubLObject var10 = module0408.$g3301$.currentBinding(var7);
            try {
                module0018.$g646$.bind((SubLObject)module0437.NIL, var7);
                module0018.$g647$.bind((SubLObject)module0437.NIL, var7);
                module0408.$g3301$.bind((SubLObject)module0437.NIL, var7);
                if (module0437.$ic4$ == module0434.f30596(var5, var2)) {
                    final SubLObject var11 = f30654(var5, var2);
                    final SubLObject var12 = (SubLObject)ConsesLow.list(var6);
                    module0347.f23330(var11, (SubLObject)module0437.NIL, var12);
                }
            }
            finally {
                module0408.$g3301$.rebind(var10, var7);
                module0018.$g647$.rebind(var9, var7);
                module0018.$g646$.rebind(var8, var7);
            }
        }
        return (SubLObject)module0437.NIL;
    }
    
    public static SubLObject f30657(final SubLObject var5, SubLObject var13) {
        if (var13 == module0437.UNPROVIDED) {
            var13 = (SubLObject)module0437.NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0437.NIL != module0018.$g646$.getDynamicValue(var14) && module0437.NIL != module0350.f23510(module0205.f13333(var5)));
    }
    
    public static SubLObject f30658(final SubLObject var5, SubLObject var13) {
        if (var13 == module0437.UNPROVIDED) {
            var13 = (SubLObject)module0437.NIL;
        }
        final SubLObject var14 = module0205.f13333(var5);
        final SubLObject var15 = module0437.$ic6$;
        if (module0437.NIL != module0158.f10010(var14, (SubLObject)module0437.ONE_INTEGER, var15)) {
            final SubLObject var16 = module0158.f10011(var14, (SubLObject)module0437.ONE_INTEGER, var15);
            SubLObject var17 = (SubLObject)module0437.NIL;
            final SubLObject var18 = (SubLObject)module0437.NIL;
            while (module0437.NIL == var17) {
                final SubLObject var19 = module0052.f3695(var16, var18);
                final SubLObject var20 = (SubLObject)SubLObjectFactory.makeBoolean(!var18.eql(var19));
                if (module0437.NIL != var20) {
                    SubLObject var21 = (SubLObject)module0437.NIL;
                    try {
                        var21 = module0158.f10316(var19, (SubLObject)module0437.$ic7$, (SubLObject)module0437.$ic8$, (SubLObject)module0437.NIL);
                        SubLObject var17_22 = (SubLObject)module0437.NIL;
                        final SubLObject var18_23 = (SubLObject)module0437.NIL;
                        while (module0437.NIL == var17_22) {
                            final SubLObject var22 = module0052.f3695(var21, var18_23);
                            final SubLObject var20_24 = (SubLObject)SubLObjectFactory.makeBoolean(!var18_23.eql(var22));
                            if (module0437.NIL != var20_24) {
                                f30656(var5, module0147.f9551(), var22);
                            }
                            var17_22 = (SubLObject)SubLObjectFactory.makeBoolean(module0437.NIL == var20_24);
                        }
                    }
                    finally {
                        final SubLObject var23 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0437.T);
                            if (module0437.NIL != var21) {
                                module0158.f10319(var21);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var23);
                        }
                    }
                }
                var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0437.NIL == var20);
            }
        }
        return (SubLObject)module0437.NIL;
    }
    
    public static SubLObject f30659(final SubLObject var5, SubLObject var13) {
        if (var13 == module0437.UNPROVIDED) {
            var13 = (SubLObject)module0437.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0437.NIL != f30655() && module0437.NIL != module0350.f23545(var5, module0147.f9551()));
    }
    
    public static SubLObject f30660(final SubLObject var5, SubLObject var13) {
        if (var13 == module0437.UNPROVIDED) {
            var13 = (SubLObject)module0437.NIL;
        }
        SubLObject var15;
        final SubLObject var14 = var15 = module0350.f23553(var5, module0147.f9551());
        SubLObject var16 = (SubLObject)module0437.NIL;
        var16 = var15.first();
        while (module0437.NIL != var15) {
            f30656(var5, module0147.f9551(), var16);
            var15 = var15.rest();
            var16 = var15.first();
        }
        return (SubLObject)module0437.NIL;
    }
    
    public static SubLObject f30661() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30654", "S#33905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30655", "S#33906", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30656", "S#33907", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30657", "S#33908", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30658", "S#33909", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30659", "S#33910", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30660", "S#33911", 1, 1, false);
        return (SubLObject)module0437.NIL;
    }
    
    public static SubLObject f30662() {
        module0437.$g3538$ = SubLFiles.defparameter("S#33912", (SubLObject)module0437.$ic5$);
        module0437.$g3539$ = SubLFiles.defparameter("S#33913", (SubLObject)module0437.$ic5$);
        return (SubLObject)module0437.NIL;
    }
    
    public static SubLObject f30663() {
        module0340.f22941((SubLObject)module0437.$ic9$, (SubLObject)module0437.$ic10$);
        module0340.f22941((SubLObject)module0437.$ic11$, (SubLObject)module0437.$ic12$);
        return (SubLObject)module0437.NIL;
    }
    
    public void declareFunctions() {
        f30661();
    }
    
    public void initializeVariables() {
        f30662();
    }
    
    public void runTopLevelForms() {
        f30663();
    }
    
    static {
        me = (SubLFile)new module0437();
        module0437.$g3538$ = null;
        module0437.$g3539$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $ic1$ = SubLObjectFactory.makeKeyword("MINIMIZE");
        $ic2$ = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $ic3$ = SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $ic4$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic5$ = (SubLFloat)SubLObjectFactory.makeDouble(1.5);
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("minimizeExtent"));
        $ic7$ = SubLObjectFactory.makeKeyword("GAF");
        $ic8$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL-MINIMIZE-EXTENT");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0437.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#33908", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#33912", "CYC"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#33909", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <fully bound>))\n    from (#$minimizeExtent <predicate>)\n    when negation-by-failure is enabled"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$citizens #$AbrahamLincoln #$France))\n    from (#$minimizeExtent #$citizens)") });
        $ic11$ = SubLObjectFactory.makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");
        $ic12$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), module0437.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#33910", "CYC"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#33913", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#33911", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <fully bound>))\n    from (#$completeExtentDecidable <predicate>)\n    or   (#$completeExtentDecidableForValueInArg <predicate> <fort> <argnum>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$bordersOn #$Canada #$France))\n    from (#$completeExtentDecidable #$bordersOn)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0437.class
	Total time: 125 ms
	
	Decompiled with Procyon 0.5.32.
*/