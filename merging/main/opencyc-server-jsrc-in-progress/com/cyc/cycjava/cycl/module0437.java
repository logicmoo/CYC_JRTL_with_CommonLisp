package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        final SubLObject var3 = module0202.f12643($ic0$, var1);
        return module0191.f11990((SubLObject)$ic1$, var3, var2, (SubLObject)$ic2$);
    }
    
    public static SubLObject f30655() {
        final SubLObject var4 = module0373.f26113();
        if (NIL != var4) {
            return module0361.f24167(var4);
        }
        return module0410.f28551((SubLObject)$ic3$);
    }
    
    public static SubLObject f30656(final SubLObject var5, final SubLObject var2, final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (NIL != module0351.f23568(var6)) {
            final SubLObject var8 = module0018.$g646$.currentBinding(var7);
            final SubLObject var9 = module0018.$g647$.currentBinding(var7);
            final SubLObject var10 = module0408.$g3301$.currentBinding(var7);
            try {
                module0018.$g646$.bind((SubLObject)NIL, var7);
                module0018.$g647$.bind((SubLObject)NIL, var7);
                module0408.$g3301$.bind((SubLObject)NIL, var7);
                if ($ic4$ == module0434.f30596(var5, var2)) {
                    final SubLObject var11 = f30654(var5, var2);
                    final SubLObject var12 = (SubLObject)ConsesLow.list(var6);
                    module0347.f23330(var11, (SubLObject)NIL, var12);
                }
            }
            finally {
                module0408.$g3301$.rebind(var10, var7);
                module0018.$g647$.rebind(var9, var7);
                module0018.$g646$.rebind(var8, var7);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30657(final SubLObject var5, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0018.$g646$.getDynamicValue(var14) && NIL != module0350.f23510(module0205.f13333(var5)));
    }
    
    public static SubLObject f30658(final SubLObject var5, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLObject var14 = module0205.f13333(var5);
        final SubLObject var15 = $ic6$;
        if (NIL != module0158.f10010(var14, (SubLObject)ONE_INTEGER, var15)) {
            final SubLObject var16 = module0158.f10011(var14, (SubLObject)ONE_INTEGER, var15);
            SubLObject var17 = (SubLObject)NIL;
            final SubLObject var18 = (SubLObject)NIL;
            while (NIL == var17) {
                final SubLObject var19 = module0052.f3695(var16, var18);
                final SubLObject var20 = (SubLObject)makeBoolean(!var18.eql(var19));
                if (NIL != var20) {
                    SubLObject var21 = (SubLObject)NIL;
                    try {
                        var21 = module0158.f10316(var19, (SubLObject)$ic7$, (SubLObject)$ic8$, (SubLObject)NIL);
                        SubLObject var17_22 = (SubLObject)NIL;
                        final SubLObject var18_23 = (SubLObject)NIL;
                        while (NIL == var17_22) {
                            final SubLObject var22 = module0052.f3695(var21, var18_23);
                            final SubLObject var20_24 = (SubLObject)makeBoolean(!var18_23.eql(var22));
                            if (NIL != var20_24) {
                                f30656(var5, module0147.f9551(), var22);
                            }
                            var17_22 = (SubLObject)makeBoolean(NIL == var20_24);
                        }
                    }
                    finally {
                        final SubLObject var23 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var21) {
                                module0158.f10319(var21);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var23);
                        }
                    }
                }
                var17 = (SubLObject)makeBoolean(NIL == var20);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30659(final SubLObject var5, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f30655() && NIL != module0350.f23545(var5, module0147.f9551()));
    }
    
    public static SubLObject f30660(final SubLObject var5, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        SubLObject var15;
        final SubLObject var14 = var15 = module0350.f23553(var5, module0147.f9551());
        SubLObject var16 = (SubLObject)NIL;
        var16 = var15.first();
        while (NIL != var15) {
            f30656(var5, module0147.f9551(), var16);
            var15 = var15.rest();
            var16 = var15.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30661() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30654", "S#33905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30655", "S#33906", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30656", "S#33907", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30657", "S#33908", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30658", "S#33909", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30659", "S#33910", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0437", "f30660", "S#33911", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30662() {
        $g3538$ = SubLFiles.defparameter("S#33912", (SubLObject)$ic5$);
        $g3539$ = SubLFiles.defparameter("S#33913", (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30663() {
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22941((SubLObject)$ic11$, (SubLObject)$ic12$);
        return (SubLObject)NIL;
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
        $g3538$ = null;
        $g3539$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("unknownSentence"));
        $ic1$ = makeKeyword("MINIMIZE");
        $ic2$ = makeKeyword("TRUE-DEF");
        $ic3$ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $ic4$ = makeKeyword("UNKNOWN");
        $ic5$ = (SubLFloat)makeDouble(1.5);
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("minimizeExtent"));
        $ic7$ = makeKeyword("GAF");
        $ic8$ = makeKeyword("TRUE");
        $ic9$ = makeKeyword("REMOVAL-MINIMIZE-EXTENT");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#33908", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#33912", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#33909", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <fully bound>))\n    from (#$minimizeExtent <predicate>)\n    when negation-by-failure is enabled"), makeKeyword("EXAMPLE"), makeString("(#$not (#$citizens #$AbrahamLincoln #$France))\n    from (#$minimizeExtent #$citizens)") });
        $ic11$ = makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");
        $ic12$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("S#33910", "CYC"), makeKeyword("COST-EXPRESSION"), makeSymbol("S#33913", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#33911", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <fully bound>))\n    from (#$completeExtentDecidable <predicate>)\n    or   (#$completeExtentDecidableForValueInArg <predicate> <fort> <argnum>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$bordersOn #$Canada #$France))\n    from (#$completeExtentDecidable #$bordersOn)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 125 ms
	
	Decompiled with Procyon 0.5.32.
*/